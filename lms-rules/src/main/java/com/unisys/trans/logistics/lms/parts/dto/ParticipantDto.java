/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantRoleType;

/**
 * <code>ParticipantDto</code> contains general participant details.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>address
 * <li>billingAccountNumber1
 * <li>billingAccountNumber2
 * <li>billingAccountType1
 * <li>billingAccountType2
 * <li>city
 * <li>country
 * <li>deleteDate
 * <li>deletedStation
 * <li>deletedUser
 * <li>deleteIndicator
 * <li>deleteRemarks
 * <li>email
 * <li>fax
 * <li>freightDetailDto
 * <li>uldFreightCode
 * <li>language
 * <li>name
 * <li>oId
 * <li>participantAliases
 * <li>participantRole
 * <li>phone
 * <li>postalCode
 * <li>state
 * <li>stationCode
 * <li>type
 * <li>uldDetailDto
 * </ul>
 * </code>
 */
public class ParticipantDto extends PersistenceObjectDto implements Cloneable {
    /**
     * Constant to hold <code>EMPTY_STRING</code> property.
     */
    private static final String EMPTY_STRING = "";
    /**
	 * Constant to hold <code>YES</code> property.
	 */
	private static final String YES = "Y";
	/**
	 * Constant to hold <code>NO</code> property.
	 */
	private static final String NO = "N";
	/** Constant to hold <code>ZERO</code> property.
	 */
	private static final String ZERO = "0";
	/**
	 * Constant to hold <code>HARD_CREDIT</code> property.
	 */
	private static final String HARD_CREDIT = "H";
	/**
	 * Constant to hold <code>SOFT_CREDIT</code> property.
	 */
	private static final String SOFT_CREDIT = "S";
	/**
	 * Constant to hold <code>DELETE</code> property.
	 */
	private static final String DELETE = "D";
	 /**
		 * Constant to hold <code>DELETE</code> property.
		 */
	private static final String DATE_FORMAT_YYMMDD = "yyMMdd";
	 /**
	 * Constant to hold <code>DELETE</code> property.
	 */
	private static final String TIME_FORMAT_HHMM = "HH:mm";
	 /**
     * Constant to hold string "CASH".<br>
     */
    private static final String CASH = "Cash";
    /**
     * Constant to hold string "EMPTY_SPACE".<br>
     */
    private static final String EMPTY_SPACE = " ";
    /**
     * Constant to hold string "B".<br>
     */
    private static final String STRING_B_LITERAL = "B";
    /**
     * Constant to hold string "O".<br>
     */
    private static final String STRING_O_LITERAL = "O";
    /**
     * Constant to hold string "P".<br>
     */
    private static final String STRING_P_LITERAL = "P";
    /**
     * Constant to hold string "P".<br>
     */
    private static final String ONE_TIME_PART = "1";


    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8962328450241593518L;

    /**
     * Attribute to hold <code>address</code> property.
     */
    private String address;

    /**
     * Attribute to hold <code>billingAccountNumber1</code> property. Only users with special privileges can
     * update this field.
     */
    private String billingAccountNumber1;

    /**
     * Attribute to hold <code>billingAccountNumber2</code> property. Only users with special privileges can
     * update this field.
     */
    private String billingAccountNumber2;

    /**
     * Attribute to hold <code>billingAccountType1</code> property. It denotes the type of account.
     */
    private String billingAccountType1;

    /**
     * Attribute to hold <code>billingAccountType2</code> property. It denotes the type of account.
     */
    private String billingAccountType2;
    
    /**
     * Attribute to hold <code>accountNumber</code> property. It denotes the accountNumber for manualAdjustment.
     */
    private String accountNumber;

    /**
     * Attribute to hold <code>city</code> property.
     */
    private String city;

    /**
     * Attribute to hold <code>country</code> property. If input, this is validated against the country table.
     * If not input, the country corresponding to the station is extracted from the station table.
     */
    private String country;

    /**
     * Attribute to hold <code>deletedDate</code> property.
     */
    private Date deletedDate;

    /**
     * Attribute to hold <code>deletedStation</code> property.
     */
    private String deletedStation;

    /**
     * Attribute to hold <code>deletedUser</code> property.
     */
    private String deletedUser;

    /**
     * Attribute to hold <code>deleteIndicator</code> property. It indicates whether the participant is marked
     * for deletion or not (true/false).
     */
    private Boolean deleteIndicator;

    /**
     * Attribute to hold <code>deleteRemarks</code> property. These remarks are to be given when the
     * participant is to be deleted.
     */
    private String deleteRemarks;

    /**
     * Attribute to hold <code>email</code> property.
     * <ul>
     * <li>For recurring participant, this field is available for updates. <br>
     * <li>For one-time participant, this field is prohibited. (Information is captured along with one-time
     * </ul>
     * participant creation during participant capture through Air Waybill Information, Booking Information
     * functions.)
     */
    private String email;
    /**
     * Attribute to hold <code>shortName</code> property.
     */
    private String shortName;

    /**
     * Attribute to hold <code>fax</code> property.
     */
    private String fax;

    /**
     * Attribute to hold <code>freightDetailDto</code> property.
     */
    private FreightDetailDto freightDetail;

    /**
     * Attribute to hold <code>inputText</code> property.
     */
    private String inputText;

    /**
     * Attribute to hold <code>language</code> property.
     */
    private String language;
    
    /**
     * Attribute to hold <code>lastModifiedDate</code> property in GMT time.
     */
    private Date lastUpdatedDate;

    /**
     * Attribute to hold <code>lmsDataBaseKey</code> property.
     */

    private String lmsDataBaseKey;

    /**
     * Attribute to hold <code>name</code> property.
     */
    private String name;

    /**
     * Attribute to hold <code>oId</code> property. Unique key reference for participant entity.
     */
    private Long oId;

    /**
     * Constant to hold <code>batchInd</code> property.
     */
    private boolean batchInd;

    private boolean isSuccess;

    /**
     * Attribute to hold <code>participantAliases</code> property.
     */
    @SuppressWarnings("unchecked")
    private List<ParticipantAliasDto> participantAliasDtos = new ArrayList<ParticipantAliasDto>();

    /**
     * Attribute to hold <code>participantRemarksDtos</code> property.
     */

    private List<ParticipantRemarksDto> participantRemarksDtos;

    /**
     * Attribute to hold <code>participantRole</code> property.
     */
    private ParticipantRoleType participantRole;

    /**
     * Attribute to hold <code>phone</code> property.
     */
    private String phone;

    /**
     * Attribute to hold <code>postalCode</code> property.
     */
    private String postalCode;

    /**
     * Attribute to hold <code>state</code> property.
     */
    private String state;

    /**
     * Attribute to hold <code>stationCode</code> property. Must be validated against the station and city
     * table.
     */
    private String stationCode;

    /**
     * Attribute to hold <code>type</code> property.
     */
    private String type;
    
    /**
     * Attribute to hold <code>type</code> property.
     */
    private String accounType;
    
    /**
     * Attribute to hold <code>type</code> property.
     */
    private String incsrType;
    
    /**
     * Attribute to hold <code>incsrAccountNumber</code> property. It denotes the type of account.
     */
    private String incsrAccountNumber;
    
    /**
     * Attribute to hold <code>incsrAccountNumber</code> property. It denotes the type of account.
     */
    private String bairroAccountNumber;
    
    
    /**
     * Attribute to hold <code>billingAccountType1</code> property. It denotes the type of account.
     */
    private String cgcAccountNumber;
    
    /**
     * Attribute to hold <code>billingAccountType1</code> property. It denotes the type of account.
     */
    private String cpfAccountNumber;
    
    /**
     * Attribute to hold <code>billingAccountType1</code> property. It denotes the type of account.
     */
    private String airlineSpecific;
    
    /**
     * Attribute to hold <code>onlineSyncIndicator</code> property. It indicates whether the participant request is coming
     * from onlineSync or not (true/false).
     */
    
    private boolean onlineSyncIndicator;
    
    /**
     * Attribute to hold <code>participantTipo</code> property. <br>
     */
    private String participantTipo;
    /**
     * Attribute to hold <code>participantTipo</code> property. <br>
     */
    private String participantTipo1;
    /**
     * Attribute to hold <code>participantTipo</code> property. <br>
     */
    private String participantTipo2;
    /**
     * Attribute to hold <code>participantTipo</code> property. <br>
     */
    private String participantTipo3;
    /**
     * Attribute to hold <code>participantTipo</code> property. <br>
     */
    private String participantTipo4;
    /**
     * Attribute to hold <code>participantTipo</code> property. <br>
     */
    private String participantTipo5;
    /**
     * Attribute to hold <code>participantTipo</code> property. <br>
     */
    private String participantTipo6;
    /**
     * Attribute to hold <code>participantTipo</code> property. <br>
     */
    private String participantTipo7;
    /**
     * Attribute to hold <code>participantTipo</code> property. <br>
     */
    private String participantTipo8;
    /**
     * Attribute to hold <code>participantTipo</code> property. <br>
     */
    private String participantTipo9;
    /**
     * Attribute to hold <code>type</code> property.
     */
    private String incsrType1;
    /**
     * Attribute to hold <code>type</code> property.
     */
    private String incsrType2;
    /**
     * Attribute to hold <code>type</code> property.
     */
    private String incsrType3;
    /**
     * Attribute to hold <code>type</code> property.
     */
    private String incsrType4;
    /**
     * Attribute to hold <code>type</code> property.
     */
    private String incsrType5;
    /**
     * Attribute to hold <code>type</code> property.
     */
    private String incsrType6;
    /**
     * Attribute to hold <code>type</code> property.
     */
    private String incsrType7;
    /**
     * Attribute to hold <code>type</code> property.
     */
    private String incsrType8;
    /**
     * Attribute to hold <code>type</code> property.
     */
    private String incsrType9;
    
    /**
     * Attribute to hold <code>incsrAccountNumber</code> property. It denotes the type of account.
     */
    private String incsrAccountNumber1;
    
    /**
     * Attribute to hold <code>incsrAccountNumber</code> property. It denotes the type of account.
     */
    private String incsrAccountNumber2;
    
    /**
     * Attribute to hold <code>incsrAccountNumber</code> property. It denotes the type of account.
     */
    private String incsrAccountNumber3;
    
    /**
     * Attribute to hold <code>incsrAccountNumber</code> property. It denotes the type of account.
     */
    private String incsrAccountNumber4;
    
    /**
     * Attribute to hold <code>incsrAccountNumber</code> property. It denotes the type of account.
     */
    private String incsrAccountNumber5;
    
    /**
     * Attribute to hold <code>incsrAccountNumber</code> property. It denotes the type of account.
     */
    private String incsrAccountNumber6;
    
    /**
     * Attribute to hold <code>incsrAccountNumber</code> property. It denotes the type of account.
     */
    private String incsrAccountNumber7;
    
    /**
     * Attribute to hold <code>incsrAccountNumber</code> property. It denotes the type of account.
     */
    private String incsrAccountNumber8;
    
    /**
     * Attribute to hold <code>incsrAccountNumber</code> property. It denotes the type of account.
     */
    private String incsrAccountNumber9;
    
    /**
     * Attribute to hold <code>identificationCode</code> property. It denotes the identificationCode.
     */
    private String identificationCode;
    
    /**
     * Attribute to hold <code>aeoNumber</code> property. It denotes the aeoNumber.
     */
    private String aeoNumber;
    
    /**
     * Attribute to hold <code>contactPersonName</code> property. It denotes the contactPersonName.
     */
    private String contactPersonName;
    
    /**
     * Attribute to hold <code>contactPersonPhoneNumber</code> property. It denotes the contactPersonPhoneNumber.
     */
    private String contactPersonPhoneNumber;

    //UIS171
    /**
     * Attribute to hold <code>participantNotificationDto</code> property.
     */
    private ParticipantNotificationDto participantNotificationDto;
    /**
	 * Attribute to hold <code>participantNotificationDtoList</code> property.
	 */
	private List<ParticipantNotificationDto> participantNotificationDtoList = new ArrayList<ParticipantNotificationDto>();

    // FIS-143 changes starts
    /**
     * Attribute to hold <code>contactName</code> property.
     */
    private String contactName;

    /**
     * Attribute to hold <code>contactEmail</code> property.
     */
    private String contactEmail;

    /**
     * Attribute to hold <code>contactRole</code> property.
     */
    private String contactRole;

    /**
     * Attribute to hold <code>contactPhone</code> property.
     */
    private String contactPhone;

    /**
     * Attribute to hold <code>contactFax</code> property.
     */
    private String contactFax;

    /**
     * Attribute to hold <code>contactTeletypeAddress</code> property.
     */
    private String contactTeletypeAddress;

    /**
     * Attribute to hold <code>contactThirdPartRef</code> property.
     */
    private String contactThirdPartRef;

    /**
     * Attribute to hold <code>contactNetwork</code> property.
     */
    private String contactNetwork;

    /**
     * Attribute to hold <code>contactFsuXfsuVersion</code> property.
     */
    private String contactFsuXfsuVersion;

    /**
     * Attribute to hold <code>fsuMessageInd</code> property.
     */
    private String fsuMessageInd;

    /**
     * Attribute to hold <code>fsuMessageInd</code> property.
     */
    private Long participantOid;


    /**
     * Attribute to hold <code>statusCodeArr</code> property.
     */
    private String statusCodeArr;

    /**
     * Attribute to hold <code>statusCodeAwd</code> property.
     */
    private String statusCodeAwd;

    /**
     * Attribute to hold <code>statusCodeAwr</code> property.
     */
    private String statusCodeAwr;

    /**
     * Attribute to hold <code>statusCodeBkd</code> property.
     */
    private String statusCodeBkd;

    /**
     * Attribute to hold <code>statusCodeCcd</code> property.
     */
    private String statusCodeCcd;

    /**
     * Attribute to hold <code>statusCodeCrc</code> property.
     */
    private String statusCodeCrc;

    /**
     * Attribute to hold <code>statusCodeDdl</code> property.
     */
    private String statusCodeDdl;

    /**
     * Attribute to hold <code>statusCodeDep</code> property.
     */
    private String statusCodeDep;

    /**
     * Attribute to hold <code>statusCodeDis</code> property.
     */
    private String statusCodeDis;

    /**
     * Attribute to hold <code>statusCodeDlv</code> property.
     */
    private String statusCodeDlv;

    /**
     * Attribute to hold <code>statusCodeFoh</code> property.
     */
    private String statusCodeFoh;

    /**
     * Attribute to hold <code>statusCodeFps</code> property.
     */
    private String statusCodeFps;

    /**
     * Attribute to hold <code>statusCodeMan</code> property.
     */
    private String statusCodeMan;

    /**
     * Attribute to hold <code>statusCodeNfd</code> property.
     */
    private String statusCodeNfd;

    /**
     * Attribute to hold <code>statusCodeOfl</code> property.
     */
    private String statusCodeOfl;

    /**
     * Attribute to hold <code>statusCodePre</code> property.
     */
    private String statusCodePre;

    /**
     * Attribute to hold <code>statusCodeRcc</code> property.
     */
    private String statusCodeRcc;

    /**
     * Attribute to hold <code>statusCodeRcd</code> property.
     */
    private String statusCodeRcd;

    /**
     * Attribute to hold <code>statusCodeRcf</code> property.
     */
    private String statusCodeRcf;

    /**
     * Attribute to hold <code>statusCodeRcs</code> property.
     */
    private String statusCodeRcs;

    /**
     * Attribute to hold <code>statusCodeRct</code> property.
     */
    private String statusCodeRct;

    /**
     * Attribute to hold <code>statusCodeTfd</code> property.
     */
    private String statusCodeTfd;

    /**
     * Attribute to hold <code>statusCodeTgc</code> property.
     */
    private String statusCodeTgc;

    /**
     * Attribute to hold <code>statusCodeTrm</code> property.
     */
    private String statusCodeTrm;

    private String iatanumber;

    private boolean dwnpartcontactdetail;

    private boolean dwnpartdetail;
    // FIS-143 changes ends
    //UIS171
   
    public String getAirlineSpecific() {
		return airlineSpecific;
	}

	public void setAirlineSpecific(String airlineSpecific) {
		this.airlineSpecific = airlineSpecific;
	}

    public boolean isOnlineSyncIndicator() {
		return onlineSyncIndicator;
	}

	public void setOnlineSyncIndicator(boolean onlineSyncIndicator) {
		this.onlineSyncIndicator = onlineSyncIndicator;
	}

	/**
     * @return the cgcAccountNumber
     */
    public String getCgcAccountNumber() {
        return this.cgcAccountNumber;
    }

    /**
     * @param pCgcAccountNumber the cgcAccountNumber to set
     */
    public void setCgcAccountNumber(String pCgcAccountNumber) {
        this.cgcAccountNumber = pCgcAccountNumber;
    }

    /**
     * @return the cpfAccountNumber
     */
    public String getCpfAccountNumber() {
        return this.cpfAccountNumber;
    }

    /**
     * @param pCpfAccountNumber the cpfAccountNumber to set
     */
    public void setCpfAccountNumber(String pCpfAccountNumber) {
        this.cpfAccountNumber = pCpfAccountNumber;
    }

    /**
     * Attribute to hold <code>uldDetailDto</code> property.
     */
    private UldDetailDto uldDetail;

    /**
     * Attribute to hold <code>uldFreightCode</code> property.
     */

    private String uldFreightCode;

    /**
     * Attribute to hold <code>accountingDto</code> property.
     */
    private AccountingDto accountingDto;
    
    /**
     * Attribute to hold <code>eAwbMultilateral</code> property.
     */
    private Boolean eAwbMultilateral;  
    
    // MH021
    /**
     * Attribute to hold <code>apsAllowed</code> property.
     */
    private boolean apsAllowed;
    
    /**
     * Attribute to hold <code>apsDailyLimitIndicator</code> property.
     */
    private Boolean apsDailyLimitIndicator;
    
    /**
     * Attribute to hold <code>apsDailyLimit</code> property.
     */
    private Long apsDailyLimit;
    
    /**
     * Attribute to hold <code>apsLimitCurrency</code> property.
     */
    private String apsLimitCurrency;

    /**
     * <code>Default constructor.</code>
     */
    public ParticipantDto() {

    }

    /**
     * <code>Parameterised constructor.</code>
     * <p>
     * 
     * @param pOId holds the object id
     * @param pName holds the participant name
     * @param pStationCode holds the station code of the participant
     * @param pBillingAccountNumber1 holds the billing account number of the participant
     * @param pMessageProfileName holds the message profile name
     */
    public ParticipantDto(final Long pOId, final String pName, final String pStationCode,
                final String pBillingAccountNumber1, final String pMessageProfileName) {
        this.oId = pOId;
        this.name = pName;
        this.stationCode = pStationCode;
        this.billingAccountNumber1 = pBillingAccountNumber1;
        this.freightDetail = new FreightDetailDto();
        this.freightDetail.setFreightAdditional(new FreightAdditionalDto());
        this.freightDetail.getFreightAdditional().setMessageProfileName(pMessageProfileName);
    }

    /**
     * <code>Parameterised constructor.</code>
     * <p>
     * <b>Format: </b><br>
     * Character set for alphabet, number, hyphen, dot and space. <br>
     * <p>
     * <b>Example: </b><br>
     * 123456
     * <p>
     * 
     * @param pBillingAccountNumber1 holds the billing account number 1
     * @param pBillingAccountNumber2 holds the billing account number 2
     */

    public ParticipantDto(final String pBillingAccountNumber1, final String pBillingAccountNumber2) {

        this.billingAccountNumber1 = pBillingAccountNumber1;
        this.billingAccountNumber2 = pBillingAccountNumber2;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Gets the <code>address</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * POB 14000,POSTAL STN SAINT LAURENT
     * <p>
     * 
     * @return the current value of <code>address</code> property.<br>
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Gets the <code>billingAccountNumber1</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * 123456
     * <p>
     * 
     * @return the current value of <code>billingAccountNumber1</code> property.<br>
     */
    public String getBillingAccountNumber1() {
        return this.billingAccountNumber1;
    }

    /**
     * Gets the <code>billingAccountNumber2</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * 1111234
     * <p>
     * 
     * @return the current value of <code>billingAccountNumber2</code> property.<br>
     */
    public String getBillingAccountNumber2() {
        return this.billingAccountNumber2;
    }

    /**
     * Gets the <code>billingAccountType1</code> property.
     * <p>
     * Indicator that denotes the type of account.
     * <p>
     * <b> Possible values :</b><br>
     * <li>I- International
     * <li>D- Domestic
     * <li>B- Both
     * <p>
     * <b>Format: </b><br>
     * 1 alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * I- International<br>
     * <p>
     * 
     * @return the current value of <code>billingAccountType1</code> property.<br>
     */
    public String getBillingAccountType1() {
        return this.billingAccountType1;
    }

    /**
     * Gets the <code>billingAccountType2</code> property.
     * <p>
     * Indicator that denotes the type of account.
     * <p>
     * <b> Possible values :</b><br>
     * <li>I- International
     * <li>D- Domestic
     * <li>B- Both
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * I- International<br>
     * <p>
     * 
     * @return the current value of <code>billingAccountType2</code> property.<br>
     */
    public String getBillingAccountType2() {
        return this.billingAccountType2;
    }

    /**
     * Gets the <code>city</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-17 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * MINNEAPOLIS
     * <p>
     * 
     * @return the current value of <code>city</code> property.<br>
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Makes a clone of <code>ParticipantDto</code>.<br>
     * <p>
     * 
     * @return contains the participant details.
     *         <p>
     * @throws CloneNotSupportedException if the object's class does not support the Cloneable interface.
     *             Subclasses that override the clone method can also throw this exception to indicate that an
     *             instance cannot be cloned.
     */
    public ParticipantDto getClone() throws CloneNotSupportedException {
        return (ParticipantDto) super.clone();
    }

    /**
     * Gets the <code>country</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * IN
     * <p>
     * 
     * @return the current value of <code>country</code> to which the participant belongs.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Gets the <code>deleteDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <br>
     * <p>
     * <b>Example: </b><br>
     * 26JUN07
     * <p>
     * 
     * @return the current value of <code>deleteDate</code> property.<br>
     */
    public Date getDeletedDate() {
        return ContractUtility.getClonedDate(this.deletedDate);
    }

    /**
     * Gets the <code>deletedStation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of <code>deletedStation</code> property.<br>
     */
    public String getDeletedStation() {
        return this.deletedStation;
    }

    /**
     * Gets the <code>deletedUser</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * TESTER
     * <p>
     * 
     * @return the current value of <code>deletedUser</code> property.<br>
     */
    public String getDeletedUser() {
        return this.deletedUser;
    }

    /**
     * Gets the <code>deleteIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The partcipant has been marked for deletion.<br>
     * <li><code>false</code> The partcipant has not been marked for deletion.<br>
     * <p>
     * <p>
     * 
     * @return the current value of <code>deleteIndicator</code> property.<br>
     */
    public Boolean getDeleteIndicator() {
        return this.deleteIndicator;
    }

    /**
     * Gets the <code>deleteRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 8-30 Alphanumeric, , hyphen, dot, space, comma, question, left/right parenthesis and plus.<br>
     * <p>
     * <b>Example: </b><br>
     * Reason - not active.
     * <p>
     * 
     * @return the current value of <code>deleteRemarks</code> property.<br>
     */
    public String getDeleteRemarks() {
        return this.deleteRemarks;
    }

    /**
     * Gets the <code>email</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-68 Email address<br>
     * <p>
     * <b>Example: </b><br>
     * Shipper@unisys.com
     * <p>
     * 
     * @return the current value of <code>email</code> address of the participant.<br>
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Gets the <code>fax</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * 0012223334444
     * <p>
     * 
     * @return the current value of <code>fax</code> property.<br>
     */
    public String getFax() {
        return this.fax;
    }

    /**
     * Gets the <code>FreightDetails </code> data transfer object.
     * <p>
     * 
     * @return <code>{@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto FreightDetailDto}</code><br>
     *         the current value of <code>FreightDetails</code> data transfer object.<br>
     */
    public FreightDetailDto getFreightDetail() {
    	if (this.freightDetail == null) {
			this.freightDetail = new FreightDetailDto();
		}
        return this.freightDetail;
    }

    /**
     * Gets the <code>inputText</code> property.
     * <p>
     * 
     * @return the current value of the <code>inputText</code> property.
     */
    public String getInputText() {
        return this.inputText;
    }

    /**
     * Gets the <code>language</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * EN-English
     * <p>
     * 
     * @return the current value of <code>language</code> of the participant.<br>
     */
    public String getLanguage() {
        return this.language;
    }
    
    /**
     * Gets the <code>lastUpdatedDate</code> property in GMT time.
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <br>
     * <p>
     * <b>Example: </b><br>
     * 26JUN07
     * <p>
     * 
     * @return the current value of <code>lastUpdatedDate</code> property.<br>
     */
    public Date getLastUpdatedDate() {
        return ContractUtility.getClonedDate(this.lastUpdatedDate);
    }

    /**
     * Gets the <code>lmsDataBaseKey</code> property.
     * <p>
     * 
     * @return the current value of the <code>lmsDataBaseKey</code> property.
     */
    public String getLmsDataBaseKey() {
        return lmsDataBaseKey;
    }

    /**
     * Gets the <code>name</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * UNISYS
     * <p>
     * 
     * @return the current value of <code>name</code> of the participant.<br>
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the <code>oid</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Holds the list of {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAliasDto
     * ParticipantAliasDto} containing <code>participantAliases</code> details.
     * <p>
     * 
     * @return the current value of <code>ParticipantAliasDto</code> details.
     */
    public List<ParticipantAliasDto> getParticipantAliasDtos() {
        return this.participantAliasDtos;
    }

    /**
     * Holds the list of {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto
     * ParticipantRemarksDto} containing <code>participantRemarks</code> details.
     * <p>
     * 
     * @return the current value of <code>participantRemarksDtos</code> details.
     */
    public List<ParticipantRemarksDto> getParticipantRemarksDtos() {
        return this.participantRemarksDtos;
    }

    /**
     * Gets the role of the participant.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * A - Agent
     * <p>
     * 
     * @return the current value of <code>address</code> property.<br>
     */
    public ParticipantRoleType getParticipantRole() {
        return this.participantRole;
    }

    /**
     * Gets the <code>phone</code> property.
     * <p>
     * <b>Format: </b> 1-18 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * 001-1122-333
     * <p>
     * 
     * @return the current value of <code>phone</code> number of the participant.<br>
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Gets the <code>postalCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * 112012
     * <p>
     * 
     * @return the current value of <code>postalCode</code> property.<br>
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Gets the <code>state</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * TEXAS
     * <p>
     * 
     * @return the current value of <code>state</code> to which the participant belongs.<br>
     */
    public String getState() {
        return this.state;
    }

    /**
     * Gets the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of <code>stationCode</code> to which the participant belongs.<br>
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * <b> Possible values :</b>
     * <li>M - Master air waybill recurring
     * <li>O - Master air waybill one-time
     * <li>H - House air waybill recurring
     * <li>U - House air waybill one-time
     * <li>B - Master and House air waybill recurring
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * M - Master air waybill recurring<br>
     * <p>
     * 
     * @return the current value of <code>type</code> of participant.<br>
     */
    public String getType() {
        return this.type;
    }

    /**
     * Gets the ULD details data transfer object.
     * <p>
     * 
     * @return the current value of ULD details data transfer object.<br>
     */
    public UldDetailDto getUldDetail() {
        return this.uldDetail;
    }

    /**
     * Gets the <code>uldFreightCode</code> property.
     * <p>
     * Indicates that participant has ULD or freight attributes.
     * <p>
     * <b> Possible values :</b>
     * <li>F - Freight attributes only exist.
     * <li>U - ULD attributes only exist.
     * <li>B - Both Freight and ULD attributes.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F - Freight attributes only exist.
     * <p>
     * 
     * @return the current value of <code>uldFreightCode</code> property.<br>
     */
    public String getUldFreightCode() {
        return this.uldFreightCode;
    }

    /**
     * prefixes and suffixes a given string with open quotes.
     * 
     * @param pString the new value of the <code>value</code>.
     * 
     * @return aModifiedString the new value of the <code>aModifiedString</code>.
     * 
     * 
     */
    private String prefixSuffixByQuotes(final String pString) {
        final String aQUOTATION = "\"";
        final String aCOMMA = ",";

        final StringBuffer aModifiedString = new StringBuffer();
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(pString);
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(aCOMMA);

        return aModifiedString.toString();
    }

    /**
     * Sets the <code>address</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <p>
     * <b>Example: </b><br>
     * POB 14000,POSTAL STN SAINT LAURENT
     * <p>
     * 
     * @param pAddress the new value of <code>address</code> property.<br>
     */
    public void setAddress(final String pAddress) {
        this.address = ContractUtility.convertToUpperCase(pAddress);
    }

    /**
     * Sets the <code>billingAccountNumber1</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <p>
     * <b>Example: </b><br>
     * 123456
     * <p>
     * 
     * @param pBillingAccountNumber1 the new value of <code>billingAccountNumber1</code> property.<br>
     */
    public void setBillingAccountNumber1(final String pBillingAccountNumber1) {
        this.billingAccountNumber1 = ContractUtility.convertToUpperCase(pBillingAccountNumber1);
    }

    /**
     * Sets the <code>billingAccountNumber2</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <p>
     * <b>Example: </b><br>
     * 1111234
     * <p>
     * 
     * @param pBillingAccountNumber2 the new value of <code>billingAccountNumber2</code> property.<br>
     */
    public void setBillingAccountNumber2(final String pBillingAccountNumber2) {
        this.billingAccountNumber2 = ContractUtility.convertToUpperCase(pBillingAccountNumber2);
    }

    /**
     * Sets the <code>billingAccountType1</code> property.
     * <p>
     * Indicator that denotes the type of account.
     * <p>
     * <b> Possible values :</b><br>
     * <li>I- International<br>
     * <li>D- Domestic<br>
     * <li>B- Both
     * <p>
     * <b>Format: </b><br>
     * 1 alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * 
     * @param pBillingAccountType1 the new value of <code>billingAccountType1</code> property.<br>
     */
    public void setBillingAccountType1(final String pBillingAccountType1) {
        this.billingAccountType1 = ContractUtility.convertToUpperCase(pBillingAccountType1);
    }

    /**
     * Sets the <code>billingAccountType2</code> property.
     * <p>
     * Indicator that denotes the type of account.
     * <p>
     * <b> Possible values :</b><br>
     * <li>I- International
     * <li>D- Domestic
     * <li>B- Both
     * <p>
     * <b>Format: </b><br>
     * 1 alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * I- International
     * <p>
     * 
     * @param pBillingAccountType2 the new value of <code>billingAccountType2</code> property.<br>
     */
    public void setBillingAccountType2(final String pBillingAccountType2) {
        this.billingAccountType2 = ContractUtility.convertToUpperCase(pBillingAccountType2);
    }

    /**
     * Sets the <code>city</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-17 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <p>
     * <b>Example: </b><br>
     * MINNEAPOLIS
     * <p>
     * 
     * @param pCity the new value of <code>city</code> property.<br>
     */
    public void setCity(final String pCity) {
        this.city = ContractUtility.convertToUpperCase(pCity);
    }

    /**
     * Sets the <code>country</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * IN
     * <p>
     * 
     * @param pCountry the new value of <code>country</code> property.<br>
     */
    public void setCountry(final String pCountry) {
        this.country = ContractUtility.convertToUpperCase(pCountry);
    }

    /**
     * Sets the <code>deleteDate</code> property.
     * <p>
     * <b>Format: </b> See
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 26JUN07
     * <p>
     * 
     * @param pdeletedDate the new value of <code>deleteDate</code> property.<br>
     */
    public void setDeletedDate(final Date pdeletedDate) {
        this.deletedDate = ContractUtility.getClonedDate(pdeletedDate);
    }

    /**
     * Sets the <code>deletedStation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pDeletedStation holds the new value of <code>deletedStation</code> property.<br>
     */
    public void setDeletedStation(final String pDeletedStation) {
        this.deletedStation = ContractUtility.convertToUpperCase(pDeletedStation);
    }

    /**
     * Sets the <code>deletedUser</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric <br>
     * <p>
     * <b>Example: </b><br>
     * Tester
     * <p>
     * 
     * @param pDeletedUser holds the new value of <code>deletedUser</code> property.<br>
     */
    public void setDeletedUser(final String pDeletedUser) {
        this.deletedUser = pDeletedUser;
    }

    /**
     * Sets the <code>deleteIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The partcipant has been marked for deletion.<br>
     * <li><code>false</code><br>
     * The partcipant has not been marked for deletion.<br>
     * <p>
     * 
     * @param pDeleteIndicator holds the new value of <code>deleteIndicator</code> property.<bR>
     */
    public void setDeleteIndicator(final Boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the <code>deleteRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 8-30 Alphanumeric, , hyphen, dot, space, comma, question, left/right parenthesis and plus. <br>
     * <p>
     * <b>Example: </b><br>
     * Reason - not active.
     * <p>
     * 
     * @param pDeleteRemarks holds the new value of <code>deleteRemarks</code> property.<br>
     */
    public void setDeleteRemarks(final String pDeleteRemarks) {
        this.deleteRemarks = pDeleteRemarks;
    }

    /**
     * Sets the <code>email</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-68 Email address <br>
     * <p>
     * <b>Example: </b><br>
     * Shipper@unisys.com
     * <p>
     * 
     * @param pEmail holds the new value of <code>email</code> property.<br>
     */
    public void setEmail(final String pEmail) {
        this.email = pEmail;
    }

    /**
     * Sets the <code>fax</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <p>
     * <b>Example: </b><br>
     * 0012223334444
     * <p>
     * 
     * @param pFax holds the new value of <code>fax</code> property.<br>
     */
    public void setFax(final String pFax) {
        this.fax = pFax;
    }

    /**
     * Sets the <code>FreightDetails</code> data transfer object.
     * <p>
     * 
     * @param pfreightDetailDto holds the new value of <code>FreightDetails</code> data transfer object.<br>
     */
    public void setFreightDetail(final FreightDetailDto pfreightDetailDto) {
        this.freightDetail = pfreightDetailDto;
    }

    /**
     * Sets the <code>inputText</code> property.
     * <p>
     * 
     * @param pInputText
     *            holds the new value of <code>inputText</code> property.<br>
     */
    public void setInputText(final String pInputText) {
        this.inputText = pInputText;
    }

    /**
     * Sets the <code>language</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * EN - English
     * 
     * @param pLanguage holds the new value of <code>language</code> of the participant.<br>
     */
    public void setLanguage(final String pLanguage) {
        this.language = ContractUtility.convertToUpperCase(pLanguage);
    }
    
    /**
     * Sets the <code>lastUpdatedDate</code> property in GMT time.
     * <p>
     * <b>Format: </b> See
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 26JUN07
     * <p>
     * 
     * @param pdeletedDate the new value of <code>deleteDate</code> property.<br>
     */
    public void setLastUpdatedDate(final Date pLastUpdatedDate) {
        this.lastUpdatedDate = ContractUtility.getClonedDate(pLastUpdatedDate);
    }

    /**
     * Sets the <code>lmsDataBaseKey</code> data transfer object.
     * <p>
     * 
     * @param pLmsDataBaseKey
     *            holds the new value of <code>lmsDataBaseKey</code> data transfer
     *            object.<br>
     */

    public void setLmsDataBaseKey(final String pLmsDataBaseKey) {
        this.lmsDataBaseKey = pLmsDataBaseKey;
    }

    /**
     * Sets the <code>name</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <p>
     * <b>Example: </b><br>
     * UNISYS
     * <p>
     * 
     * @param pName holds the new value of <code>name</code> of the participant.<br>
     */
    public void setName(final String pName) {
        this.name = ContractUtility.convertToUpperCase(pName);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pId holds the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pId) {
        this.oId = pId;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAliasDto
     * ParticipantAliasDto} containing <code>participantAliases</code> details.
     * <p>
     * 
     * @param pParticipantAliasDtos holds the new value of <code>ParticipantAliasDto</code> type details.<br>
     */
    public void setParticipantAliasDtos(final List<ParticipantAliasDto> pParticipantAliasDtos) {
        this.participantAliasDtos = pParticipantAliasDtos;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto
     * ParticipantRemarksDto} containing <code>participantRemarks</code> details.
     * <p>
     * 
     * @param pParticipantRemarksDtos holds the new value of <code>ParticipantRemarksDto</code> type details.<br>
     */
    public void setParticipantRemarksDtos(final List<ParticipantRemarksDto> pParticipantRemarksDtos) {
        this.participantRemarksDtos = pParticipantRemarksDtos;
    }

    /**
     * Sets the role of the participant.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * A - Agent
     * <p>
     * 
     * @param pParticipantRole <code>{@link ParticipantRoleType}</code><br>
     *            holds the new value of <code>address</code> property.<br>
     */
    public void setParticipantRole(final ParticipantRoleType pParticipantRole) {
        this.participantRole = pParticipantRole;
    }

    /**
     * Sets the <code>phone</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * 001-1122-333
     * <p>
     * 
     * @param pPhone holds the new value of <code>phone</code> of the participant.<br>
     */
    public void setPhone(final String pPhone) {
        this.phone = pPhone;
    }

    /**
     * Sets the <code>postalCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <p>
     * <b>Example: </b><br>
     * 112012
     * <p>
     * 
     * @param pPostalCode holds the new value of <code>postalCode</code> property.<br>
     */
    public void setPostalCode(final String pPostalCode) {
        this.postalCode = ContractUtility.convertToUpperCase(pPostalCode);
    }

    /**
     * Sets the <code>state</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <p>
     * <b>Example: </b><br>
     * TEXAS
     * <p>
     * 
     * @param pState holds the new value of <code>state</code> to which the participant belongs.<br>
     */
    public void setState(final String pState) {
        this.state = ContractUtility.convertToUpperCase(pState);
    }

    /**
     * Sets the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pStationCode holds the new value of <code>stationCode</code> to which the participant belongs.<br>
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);
    }

    /**
     * Sets the <code>type</code> property.
     * <p>
     * <b> Possible values :</b>
     * <li>M - Master air waybill recurring
     * <li>O - Master air waybill one-time
     * <li>H - House air waybill recurring
     * <li>U - House air waybill one-time
     * <li>B - Master and House air waybill recurring
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * M - Master air waybill recurring
     * <p>
     * 
     * @param pType holds the new value of <code>type</code> of participant<br>
     */
    public void setType(final String pType) {
        this.type = ContractUtility.convertToUpperCase(pType);
    }

    /**
     * Sets the ULD details data transfer object.
     * <p>
     * 
     * @param pUldDetailDto holds the new value of ULD details data transfer object.<br>
     */
    public void setUldDetail(final UldDetailDto pUldDetailDto) {
        this.uldDetail = pUldDetailDto;
    }

    /**
     * Sets the <code>uldFreightCode</code> property.
     * <p>
     * <b> Possible values :</b>
     * <li>F - Freight attributes only exist.
     * <li>U - ULD attributes only exist.
     * <li>B - Both Freight and ULD attributes.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * F - Freight attributes only exist.
     * <p>
     * 
     * @param pUldFreightCode holds the new value of <code>uldFreightCode</code> property.<br>
     */
    public void setUldFreightCode(final String pUldFreightCode) {
        this.uldFreightCode = ContractUtility.convertToUpperCase(pUldFreightCode);
    }

    /**
     * Creates the String representation of <code>ContractListEntryDto</code>.
     * <p>
     * This will return the String representation based on Contract List.
     * <p>
     * 
     * @return the String representation of <code>ContractListEntryDto</code>.
     */
    public String toString() {

        if(this.isDwnpartdetail()){
        	 return this.buildParticipantDetailstoCSVString();
        }else if(this.isDwnpartcontactdetail()){
            return this.buildParticipantContactDetailstoCSVString();
        }/*else if(this.isPrintOrDownloadAdvPayCustDetails()){
            return this.buildAdvancePaymentCustomerDetailstoCSVString();
        }*/
        return EMPTY_STRING;
        // SuppressOn:MagicNumber
        /*final StringBuffer csvString = new StringBuffer();
        // SuppressOff:MagicNumber

        if (this.getBillingAccountNumber1() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getBillingAccountNumber1()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getAddress() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getAddress()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getCity() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getCity()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getCountry() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getCountry()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getName() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getName()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getState() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getState()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        }
        if (this.getPostalCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getPostalCode()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        }

        return csvString.toString();*/
    }

  
  

    /**
     * @return the incsrType
     */
    public String getIncsrType() {
        return this.incsrType;
    }

    /**
     * @param pIncsrType the incsrType to set
     */
    public void setIncsrType(String pIncsrType) {
        this.incsrType = pIncsrType;
    }

    /**
     * @return the incsrAccountNumber
     */
    public String getIncsrAccountNumber() {
        return incsrAccountNumber;
    }

    /**
     * @param incsrAccountNumber the incsrAccountNumber to set
     */
    public void setIncsrAccountNumber(String incsrAccountNumber) {
        this.incsrAccountNumber = incsrAccountNumber;
    }

    /**
     * @return the bairroAccountNumber
     */
    public String getBairroAccountNumber() {
        return bairroAccountNumber;
    }

    /**
     * @param bairroAccountNumber the bairroAccountNumber to set
     */
    public void setBairroAccountNumber(String bairroAccountNumber) {
        this.bairroAccountNumber = bairroAccountNumber;
    }

    /**
     * @return the accounType
     */
    public String getAccounType() {
        return accounType;
    }

    /**
     * @param accounType the accounType to set
     */
    public void setAccounType(String accounType) {
        this.accounType = accounType;
    }

    /**
     * @return the shortName
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * @param shortName the shortName to set
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

	/**
     * Gets the accountingDto property.
     * <p>
     * 
     * @return the current value of accountingDto.<br>
     */
    public AccountingDto getAccountingDto() {
        if (accountingDto == null) {
            accountingDto = new AccountingDto();
        }
        return this.accountingDto;
    }

    /**
     * Sets the accountingDto.
     * <p>
     * 
     * @param pAccountingDto holds the new value of accountingDto.<br>
     */
    public void setAccountingDto(final AccountingDto pAccountingDto) {
        this.accountingDto = pAccountingDto;
    }

	// FIS147
    public Boolean geteAwbMultilateral() {
		return eAwbMultilateral;
	}

	public void seteAwbMultilateral(Boolean eAwbMultilateral) {
		this.eAwbMultilateral = eAwbMultilateral;
	}
	
	// MH021
	public boolean isApsAllowed() {
		return apsAllowed;
	}

	public void setApsAllowed(boolean apsAllowed) {
		this.apsAllowed = apsAllowed;
	}
	
	public Boolean getApsDailyLimitIndicator() {
		return apsDailyLimitIndicator;
	}

	public void setApsDailyLimitIndicator(Boolean apsDailyLimitIndicator) {
		this.apsDailyLimitIndicator = apsDailyLimitIndicator;
	}

	public Long getApsDailyLimit() {
		return apsDailyLimit;
	}

	public void setApsDailyLimit(Long apsDailyLimit) {
		this.apsDailyLimit = apsDailyLimit;
	}

	public String getApsLimitCurrency() {
		return apsLimitCurrency;
	}

	public void setApsLimitCurrency(String apsLimitCurrency) {
		this.apsLimitCurrency = apsLimitCurrency;
	}
	
    /**
     * Gets the <code>participantTipo</code> domain object.
     * <p>
     * 
     * @return <code> participantTipo</code><br>
     *         the current value of <code>Participant</code> domain object.<br>
     */
	public String getParticipantTipo() {
		return this.participantTipo;
	}

    /**
     * Sets the value of the <code>participantTipo</code> property.
     * <p>
     * 
     * @param pParticipantTipo <code>String</code><br>
     *            the new value of the <code>participantTipo</code> property.<br>
     */
	public void setParticipantTipo(final String pParticipantTipo) {
		this.participantTipo = pParticipantTipo;
	}

	/**
	 * @return the participantTipo1
	 */
	public String getParticipantTipo1() {
		return participantTipo1;
	}

	/**
	 * @param participantTipo1 the participantTipo1 to set
	 */
	public void setParticipantTipo1(String participantTipo1) {
		this.participantTipo1 = participantTipo1;
	}

	/**
	 * @return the participantTipo2
	 */
	public String getParticipantTipo2() {
		return participantTipo2;
	}

	/**
	 * @param participantTipo2 the participantTipo2 to set
	 */
	public void setParticipantTipo2(String participantTipo2) {
		this.participantTipo2 = participantTipo2;
	}

	/**
	 * @return the participantTipo3
	 */
	public String getParticipantTipo3() {
		return participantTipo3;
	}

	/**
	 * @param participantTipo3 the participantTipo3 to set
	 */
	public void setParticipantTipo3(String participantTipo3) {
		this.participantTipo3 = participantTipo3;
	}

	/**
	 * @return the participantTipo4
	 */
	public String getParticipantTipo4() {
		return participantTipo4;
	}

	/**
	 * @param participantTipo4 the participantTipo4 to set
	 */
	public void setParticipantTipo4(String participantTipo4) {
		this.participantTipo4 = participantTipo4;
	}

	/**
	 * @return the participantTipo5
	 */
	public String getParticipantTipo5() {
		return participantTipo5;
	}

	/**
	 * @param participantTipo5 the participantTipo5 to set
	 */
	public void setParticipantTipo5(String participantTipo5) {
		this.participantTipo5 = participantTipo5;
	}

	/**
	 * @return the participantTipo6
	 */
	public String getParticipantTipo6() {
		return participantTipo6;
	}

	/**
	 * @param participantTipo6 the participantTipo6 to set
	 */
	public void setParticipantTipo6(String participantTipo6) {
		this.participantTipo6 = participantTipo6;
	}

	/**
	 * @return the participantTipo7
	 */
	public String getParticipantTipo7() {
		return participantTipo7;
	}

	/**
	 * @param participantTipo7 the participantTipo7 to set
	 */
	public void setParticipantTipo7(String participantTipo7) {
		this.participantTipo7 = participantTipo7;
	}

	/**
	 * @return the participantTipo8
	 */
	public String getParticipantTipo8() {
		return participantTipo8;
	}

	/**
	 * @param participantTipo8 the participantTipo8 to set
	 */
	public void setParticipantTipo8(String participantTipo8) {
		this.participantTipo8 = participantTipo8;
	}

	/**
	 * @return the participantTipo9
	 */
	public String getParticipantTipo9() {
		return participantTipo9;
	}

	/**
	 * @param participantTipo9 the participantTipo9 to set
	 */
	public void setParticipantTipo9(String participantTipo9) {
		this.participantTipo9 = participantTipo9;
	}

	/**
	 * @return the incsrType1
	 */
	public String getIncsrType1() {
		return incsrType1;
	}

	/**
	 * @param incsrType1 the incsrType1 to set
	 */
	public void setIncsrType1(String incsrType1) {
		this.incsrType1 = incsrType1;
	}

	/**
	 * @return the incsrType2
	 */
	public String getIncsrType2() {
		return incsrType2;
	}

	/**
	 * @param incsrType2 the incsrType2 to set
	 */
	public void setIncsrType2(String incsrType2) {
		this.incsrType2 = incsrType2;
	}

	/**
	 * @return the incsrType3
	 */
	public String getIncsrType3() {
		return incsrType3;
	}

	/**
	 * @param incsrType3 the incsrType3 to set
	 */
	public void setIncsrType3(String incsrType3) {
		this.incsrType3 = incsrType3;
	}

	/**
	 * @return the incsrType4
	 */
	public String getIncsrType4() {
		return incsrType4;
	}

	/**
	 * @param incsrType4 the kk4 to set
	 */
	public void setIncsrType4(String incsrType4) {
		this.incsrType4 = incsrType4;
	}

	/**
	 * @return the incsrType5
	 */
	public String getIncsrType5() {
		return incsrType5;
	}

	/**
	 * @param incsrType5 the incsrType5 to set
	 */
	public void setIncsrType5(String incsrType5) {
		this.incsrType5 = incsrType5;
	}

	/**
	 * @return the incsrType6
	 */
	public String getIncsrType6() {
		return incsrType6;
	}

	/**
	 * @param incsrType6 the incsrType6 to set
	 */
	public void setIncsrType6(String incsrType6) {
		this.incsrType6 = incsrType6;
	}

	/**
	 * @return the incsrType7
	 */
	public String getIncsrType7() {
		return incsrType7;
	}

	/**
	 * @param incsrType7 the incsrType7 to set
	 */
	public void setIncsrType7(String incsrType7) {
		this.incsrType7 = incsrType7;
	}

	/**
	 * @return the incsrType8
	 */
	public String getIncsrType8() {
		return incsrType8;
	}

	/**
	 * @param incsrType8 the incsrType8 to set
	 */
	public void setIncsrType8(String incsrType8) {
		this.incsrType8 = incsrType8;
	}

	/**
	 * @return the incsrType9
	 */
	public String getIncsrType9() {
		return incsrType9;
	}

	/**
	 * @param incsrType9 the incsrType9 to set
	 */
	public void setIncsrType9(String incsrType9) {
		this.incsrType9 = incsrType9;
	}

	/**
	 * @return the incsrAccountNumber1
	 */
	public String getIncsrAccountNumber1() {
		return incsrAccountNumber1;
	}

	/**
	 * @param incsrAccountNumber1 the incsrAccountNumber1 to set
	 */
	public void setIncsrAccountNumber1(String incsrAccountNumber1) {
		this.incsrAccountNumber1 = incsrAccountNumber1;
	}

	/**
	 * @return the incsrAccountNumber2
	 */
	public String getIncsrAccountNumber2() {
		return incsrAccountNumber2;
	}

	/**
	 * @param incsrAccountNumber2 the incsrAccountNumber2 to set
	 */
	public void setIncsrAccountNumber2(String incsrAccountNumber2) {
		this.incsrAccountNumber2 = incsrAccountNumber2;
	}

	/**
	 * @return the incsrAccountNumber3
	 */
	public String getIncsrAccountNumber3() {
		return incsrAccountNumber3;
	}

	/**
	 * @param incsrAccountNumber3 the incsrAccountNumber3 to set
	 */
	public void setIncsrAccountNumber3(String incsrAccountNumber3) {
		this.incsrAccountNumber3 = incsrAccountNumber3;
	}

	/**
	 * @return the incsrAccountNumber4
	 */
	public String getIncsrAccountNumber4() {
		return incsrAccountNumber4;
	}

	/**
	 * @param incsrAccountNumber4 the incsrAccountNumber4 to set
	 */
	public void setIncsrAccountNumber4(String incsrAccountNumber4) {
		this.incsrAccountNumber4 = incsrAccountNumber4;
	}

	/**
	 * @return the incsrAccountNumber5
	 */
	public String getIncsrAccountNumber5() {
		return incsrAccountNumber5;
	}

	/**
	 * @param incsrAccountNumber5 the incsrAccountNumber5 to set
	 */
	public void setIncsrAccountNumber5(String incsrAccountNumber5) {
		this.incsrAccountNumber5 = incsrAccountNumber5;
	}

	/**
	 * @return the incsrAccountNumber6
	 */
	public String getIncsrAccountNumber6() {
		return incsrAccountNumber6;
	}

	/**
	 * @param incsrAccountNumber6 the incsrAccountNumber6 to set
	 */
	public void setIncsrAccountNumber6(String incsrAccountNumber6) {
		this.incsrAccountNumber6 = incsrAccountNumber6;
	}

	/**
	 * @return the incsrAccountNumber7
	 */
	public String getIncsrAccountNumber7() {
		return incsrAccountNumber7;
	}

	/**
	 * @param incsrAccountNumber7 the incsrAccountNumber7 to set
	 */
	public void setIncsrAccountNumber7(String incsrAccountNumber7) {
		this.incsrAccountNumber7 = incsrAccountNumber7;
	}

	/**
	 * @return the incsrAccountNumber8
	 */
	public String getIncsrAccountNumber8() {
		return incsrAccountNumber8;
	}

	/**
	 * @param incsrAccountNumber8 the incsrAccountNumber8 to set
	 */
	public void setIncsrAccountNumber8(String incsrAccountNumber8) {
		this.incsrAccountNumber8 = incsrAccountNumber8;
	}

	/**
	 * @return the incsrAccountNumber9
	 */
	public String getIncsrAccountNumber9() {
		return incsrAccountNumber9;
	}

	/**
	 * @param incsrAccountNumber9 the incsrAccountNumber9 to set
	 */
	public void setIncsrAccountNumber9(String incsrAccountNumber9) {
		this.incsrAccountNumber9 = incsrAccountNumber9;
	}

	public String getIdentificationCode() {
		return identificationCode;
	}

	public void setIdentificationCode(String identificationCode) {
		this.identificationCode = identificationCode;
	}

	public String getAeoNumber() {
		return aeoNumber;
	}

	public void setAeoNumber(String aeoNumber) {
		this.aeoNumber = aeoNumber;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getContactPersonPhoneNumber() {
		return contactPersonPhoneNumber;
	}

	public void setContactPersonPhoneNumber(String contactPersonPhoneNumber) {
		this.contactPersonPhoneNumber = contactPersonPhoneNumber;
	}

    //UIS171
    public ParticipantNotificationDto getParticipantNotificationDto() {
        if (this.participantNotificationDto == null) {
            this.participantNotificationDto = new ParticipantNotificationDto();
        }
        return this.participantNotificationDto;
    }

    public void setParticipantNotificationDto(final ParticipantNotificationDto participantNotificationDto) {
        this.participantNotificationDto = participantNotificationDto;
    }

    public boolean isDwnpartcontactdetail() {
        return dwnpartcontactdetail;
    }

    public void setDwnpartcontactdetail(boolean dwnpartcontactdetail) {
        this.dwnpartcontactdetail = dwnpartcontactdetail;
    }

    public boolean isDwnpartdetail() {
        return dwnpartdetail;
    }

    public void setDwnpartdetail(boolean dwnpartdetail) {
        this.dwnpartdetail = dwnpartdetail;
    }

	/**
	 * @return the participantNotificationDtoList
	 */
	public List<ParticipantNotificationDto> getParticipantNotificationDtoList() {
		return participantNotificationDtoList;
	}

	/**
	 * @param participantNotificationDtoList the participantNotificationDtoList to set
	 */
	public void setParticipantNotificationDtoList(List<ParticipantNotificationDto> participantNotificationDtoList) {
		this.participantNotificationDtoList = participantNotificationDtoList;
	}

    /**
     * @return the iatanumber
     */
    public String getIatanumber() {
        return iatanumber;
    }

    /**
     * @param iatanumber
     *            the iatanumber to set
     */
    public void setIatanumber(String iatanumber) {
        this.iatanumber = iatanumber;
    }

    public String getStatusCodeArr() {
        return statusCodeArr;
    }

    public void setStatusCodeArr(String statusCodeArr) {
        this.statusCodeArr = statusCodeArr;
    }

    public String getStatusCodeAwd() {
        return statusCodeAwd;
    }

    public void setStatusCodeAwd(String statusCodeAwd) {
        this.statusCodeAwd = statusCodeAwd;
    }

    public String getStatusCodeAwr() {
        return statusCodeAwr;
    }

    public void setStatusCodeAwr(String statusCodeAwr) {
        this.statusCodeAwr = statusCodeAwr;
    }

    public String getStatusCodeBkd() {
        return statusCodeBkd;
    }

    public void setStatusCodeBkd(String statusCodeBkd) {
        this.statusCodeBkd = statusCodeBkd;
    }

    public String getStatusCodeCcd() {
        return statusCodeCcd;
    }

    public void setStatusCodeCcd(String statusCodeCcd) {
        this.statusCodeCcd = statusCodeCcd;
    }

    public String getStatusCodeCrc() {
        return statusCodeCrc;
    }

    public void setStatusCodeCrc(String statusCodeCrc) {
        this.statusCodeCrc = statusCodeCrc;
    }

    public String getStatusCodeDdl() {
        return statusCodeDdl;
    }

    public void setStatusCodeDdl(String statusCodeDdl) {
        this.statusCodeDdl = statusCodeDdl;
    }

    public String getStatusCodeDep() {
        return statusCodeDep;
    }

    public void setStatusCodeDep(String statusCodeDep) {
        this.statusCodeDep = statusCodeDep;
    }

    public String getStatusCodeDis() {
        return statusCodeDis;
    }

    public void setStatusCodeDis(String statusCodeDis) {
        this.statusCodeDis = statusCodeDis;
    }

    public String getStatusCodeDlv() {
        return statusCodeDlv;
    }

    public void setStatusCodeDlv(String statusCodeDlv) {
        this.statusCodeDlv = statusCodeDlv;
    }

    public String getStatusCodeFoh() {
        return statusCodeFoh;
    }

    public void setStatusCodeFoh(String statusCodeFoh) {
        this.statusCodeFoh = statusCodeFoh;
    }

    public String getStatusCodeFps() {
        return statusCodeFps;
    }

    public void setStatusCodeFps(String statusCodeFps) {
        this.statusCodeFps = statusCodeFps;
    }

    public String getStatusCodeMan() {
        return statusCodeMan;
    }

    public void setStatusCodeMan(String statusCodeMan) {
        this.statusCodeMan = statusCodeMan;
    }

    public String getStatusCodeNfd() {
        return statusCodeNfd;
    }

    public void setStatusCodeNfd(String statusCodeNfd) {
        this.statusCodeNfd = statusCodeNfd;
    }

    public String getStatusCodeOfl() {
        return statusCodeOfl;
    }

    public void setStatusCodeOfl(String statusCodeOfl) {
        this.statusCodeOfl = statusCodeOfl;
    }

    public String getStatusCodePre() {
        return statusCodePre;
    }

    public void setStatusCodePre(String statusCodePre) {
        this.statusCodePre = statusCodePre;
    }

    public String getStatusCodeRcc() {
        return statusCodeRcc;
    }

    public void setStatusCodeRcc(String statusCodeRcc) {
        this.statusCodeRcc = statusCodeRcc;
    }

    public String getStatusCodeRcd() {
        return statusCodeRcd;
    }

    public void setStatusCodeRcd(String statusCodeRcd) {
        this.statusCodeRcd = statusCodeRcd;
    }

    public String getStatusCodeRcf() {
        return statusCodeRcf;
    }

    public void setStatusCodeRcf(String statusCodeRcf) {
        this.statusCodeRcf = statusCodeRcf;
    }

    public String getStatusCodeRcs() {
        return statusCodeRcs;
    }

    public void setStatusCodeRcs(String statusCodeRcs) {
        this.statusCodeRcs = statusCodeRcs;
    }

    public String getStatusCodeRct() {
        return statusCodeRct;
    }

    public void setStatusCodeRct(String statusCodeRct) {
        this.statusCodeRct = statusCodeRct;
    }

    public String getStatusCodeTfd() {
        return statusCodeTfd;
    }

    public void setStatusCodeTfd(String statusCodeTfd) {
        this.statusCodeTfd = statusCodeTfd;
    }

    public String getStatusCodeTgc() {
        return statusCodeTgc;
    }

    public void setStatusCodeTgc(String statusCodeTgc) {
        this.statusCodeTgc = statusCodeTgc;
    }

    public String getStatusCodeTrm() {
        return statusCodeTrm;
    }

    public void setStatusCodeTrm(String statusCodeTrm) {
        this.statusCodeTrm = statusCodeTrm;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactFax() {
        return contactFax;
    }

    public void setContactFax(String contactFax) {
        this.contactFax = contactFax;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTeletypeAddress() {
        return contactTeletypeAddress;
    }

    public void setContactTeletypeAddress(String contactTeletypeAddress) {
        this.contactTeletypeAddress = contactTeletypeAddress;
    }

    public String getContactThirdPartRef() {
        return contactThirdPartRef;
    }

    public void setContactThirdPartRef(String contactThirdPartRef) {
        this.contactThirdPartRef = contactThirdPartRef;
    }

    public String getContactNetwork() {
        return contactNetwork;
    }

    public void setContactNetwork(String contactNetwork) {
        this.contactNetwork = contactNetwork;
    }

    public String getContactFsuXfsuVersion() {
        return contactFsuXfsuVersion;
    }

    public void setContactFsuXfsuVersion(String contactFsuXfsuVersion) {
        this.contactFsuXfsuVersion = contactFsuXfsuVersion;
    }

    public String getFsuMessageInd() {
        return fsuMessageInd;
    }

    public void setFsuMessageInd(String fsuMessageInd) {
        this.fsuMessageInd = fsuMessageInd;
    }

    public Long getParticipantOid() {
        return participantOid;
    }

    public void setParticipantOid(Long participantOid) {
        this.participantOid = participantOid;
    }
    /**
     * @return the contactRole
     */
    public String getContactRole() {
        return contactRole;
    }

    /**
     * @param contactRole
     *            the contactRole to set
     */
    public void setContactRole(String contactRole) {
        this.contactRole = contactRole;
    }

    public boolean isBatchInd() {
        return batchInd;
    }

    public void setBatchInd(boolean batchInd) {
        this.batchInd = batchInd;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    /**
     *
     * @return
     */
    private String buildParticipantContactDetailstoCSVString() {
        final StringBuffer csvString = new StringBuffer();
        if (this.getType() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getType().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getName() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getName().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStationCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStationCode().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getAddress() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getAddress().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getCity() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getCity().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getState() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getState().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getCountry() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getCountry().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getPostalCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getPostalCode().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getBillingAccountNumber1() != null) {
            csvString.append(this.prefixSuffixByQuotes("#" + this.getBillingAccountNumber1().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getBillingAccountNumber2() != null) {
            csvString.append(this.prefixSuffixByQuotes("#" + this.getBillingAccountNumber2().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getIatanumber() != null) {
            csvString.append(this.prefixSuffixByQuotes("#" + this.getIatanumber().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getEmail() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getEmail().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getContactName() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getContactName().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getContactEmail() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getContactEmail().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getContactPhone() != null) {
            csvString.append(this.prefixSuffixByQuotes("#" + this.getContactPhone().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getContactFax() != null) {
            csvString.append(this.prefixSuffixByQuotes("#" + this.getContactFax().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getContactRole() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getContactRole().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getContactTeletypeAddress() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getContactTeletypeAddress().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getContactThirdPartRef() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getContactThirdPartRef().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getContactNetwork() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getContactNetwork().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getFsuMessageInd() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getFsuMessageInd().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getContactFsuXfsuVersion() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getContactFsuXfsuVersion().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeArr() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeArr().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeAwd() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeAwd().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeAwr() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeAwr().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeBkd() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeBkd().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeCcd() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeCcd().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeCrc() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeCrc().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeDdl() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeDdl().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeDep() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeDep().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeDis() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeDis().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeDlv() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeDlv().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeFoh() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeFoh().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeFps() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeFps().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeMan() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeMan().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeNfd() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeNfd().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeOfl() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeOfl().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodePre() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodePre().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeRcc() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeRcc().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeRcd() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeRcd().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeRcf() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeRcf().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeRcs() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeRcs().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeRct() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeRct().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeTfd() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeTfd().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeTgc() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeTgc().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getStatusCodeTrm() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStatusCodeTrm().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getLmsDataBaseKey() != null) {
            csvString.append(this.prefixSuffixByQuotes("#" + this.getLmsDataBaseKey().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getParticipantOid() != null) {
            csvString.append(this.prefixSuffixByQuotes("#" + this.getParticipantOid().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getOId() != null) {
            csvString.append(this.prefixSuffixByQuotes("#" + this.getOId().toString()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        return csvString.toString();

    }
    /**
     * 
     * @return
     */
    private String buildParticipantDetailstoCSVString() {
    	
		final StringBuffer csvString = new StringBuffer();
		
		if (this.getType() != null) {//1 TYPE
			 if (STRING_B_LITERAL.equalsIgnoreCase(this.getType())) {// Modified for LMS-21479
                 csvString.append(this.prefixSuffixByQuotes(STRING_P_LITERAL.toString()));
             }else if (STRING_O_LITERAL.equalsIgnoreCase(this.getType())) {
                 csvString.append(this.prefixSuffixByQuotes(ONE_TIME_PART.toString()));
             }else {
            	 csvString.append(this.prefixSuffixByQuotes(this.getType().toString()));
             }
			
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getName() != null) {//2 NAME
			csvString.append(this.prefixSuffixByQuotes(this.getName().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getStationCode() != null) {//3 STATION
			csvString.append(this.prefixSuffixByQuotes(this.getStationCode().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getAddress() != null) {//4 ADDRESS
			csvString.append(this.prefixSuffixByQuotes(this.getAddress().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getCity() != null) {//5 CITY
			csvString.append(this.prefixSuffixByQuotes(this.getCity().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getState() != null) {//6 STATE
			csvString.append(this.prefixSuffixByQuotes(this.getState().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getCountry() != null) {//7 COUNTRY
			csvString.append(this.prefixSuffixByQuotes(this.getCountry().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getPostalCode() != null) {//8 POSTAL
			csvString.append(this.prefixSuffixByQuotes(this.getPostalCode().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//9 QUEUE
		if (this.getShortName() != null) {//10 SHORT NAME
			csvString.append(this.prefixSuffixByQuotes(this.getShortName().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getPhone() != null) {//11 TELEPHONE
			csvString.append(this.prefixSuffixByQuotes(this.getPhone().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getFax() != null) {//12 FAX
			csvString.append(this.prefixSuffixByQuotes(this.getFax().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getLanguage() != null) {//13 LANGUAGE
			csvString.append(this.prefixSuffixByQuotes(this.getLanguage().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getFreightDetail() != null && this.getFreightDetail().getNotificationStatusCode() != null) {//14 NOTIFICATION INDICATOR
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getNotificationStatusCode().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
	
		if (this.getFreightDetail() != null && this.getFreightDetail().getNotifyMethod() != null) {//15 NOTIFICATION METHOD
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getNotifyMethod().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getBillingAccountNumber1() != null) {//16 ACCOUNT NUMBER1
			csvString.append(this.prefixSuffixByQuotes(this.getBillingAccountNumber1().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		
		if (this.getBillingAccountType1() != null) {//17 ACCOUNT NUMBER1 ID
			csvString.append(this.prefixSuffixByQuotes(this.getBillingAccountType1().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		
		if (this.getBillingAccountNumber2() != null) {//18 ACCOUNT NUMBER2
			csvString.append(this.prefixSuffixByQuotes(this.getBillingAccountNumber2().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		
		if (this.getBillingAccountType2() != null) {//19 ACCOUNT NUMBER2 ID
			csvString.append(this.prefixSuffixByQuotes(this.getBillingAccountType2().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getIatanumber() != null) {//20 IATA ACCOUNT
			csvString.append(this.prefixSuffixByQuotes(this.getIatanumber().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getFreightDetail() != null && this.getFreightDetail().getConsigneeRemarks() != null) {//21 CONSIGNEE REMARKS
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getConsigneeRemarks().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getFreightDetail() != null && this.getFreightDetail().getParticipantRemarks() != null) {//22 FIELDS REMARKS
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getParticipantRemarks().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		
		if (this.getFreightDetail() != null && this.getFreightDetail().getBrokers() != null) {//23 BROKER COUNTER
			csvString.append(this.prefixSuffixByQuotes(String.valueOf(this.getFreightDetail().getBrokers().size()).toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		
		boolean brokerExists = false;
		if (this.getFreightDetail() != null && this.getFreightDetail().getBrokers() != null 
					&& this.getFreightDetail().getBrokers().size() > 0) {//24 BROKER NUMBER,25 BROKER ID,26 BROKER BILL TO INDICATOR, 27 BROKER STATION Occurs 4 times
			brokerExists = true;
			int count = 0;
			for(BrokerDto brokerDto : this.getFreightDetail().getBrokers()){
				
				if(brokerDto.getAccountNumber() != null){//BROKER NUMBER
					csvString.append(this.prefixSuffixByQuotes(brokerDto.getAccountNumber().toString()));
				}else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//BROKER ID
				if(brokerDto.getBillBrokerIndicator() != null && brokerDto.getBillBrokerIndicator()){
					csvString.append(this.prefixSuffixByQuotes(YES.toString()));
				}else {
					csvString.append(this.prefixSuffixByQuotes(NO.toString()));
				}
				if(brokerDto.getStation() != null){//BROKER STATION
					csvString.append(this.prefixSuffixByQuotes(brokerDto.getStation().toString()));
				}else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}
				count++;
				if(count==5){
					break;
				}
			}
			
		} else {
			for(int i =0; i<=15; i++){
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
			
		}
		if(brokerExists){
			if (this.getFreightDetail() != null && this.getFreightDetail().getBrokers() != null 
					&& this.getFreightDetail().getBrokers().size() > 0) {
				if(this.getFreightDetail().getBrokers().size() == 1){
					for(int i =0; i<=14; i++){
						csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
					}
				}
				if(this.getFreightDetail().getBrokers().size() == 2){
					for(int i =0; i<=9; i++){
						csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
					}
				}
				if(this.getFreightDetail().getBrokers().size() == 3){
					for(int i =0; i<=4; i++){
						csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
					}
				}
			}
		}
		
		if(this.getFreightDetail() != null && this.getFreightDetail().getBillToAccount() != null){//28 BILL TO ACCOUNT NUMBER
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getBillToAccount().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING)); //29 BILL TO ACCOUNT ID
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING)); //30 GBL INDICATOR
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING)); //31 SHIPPER LINK
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING)); //32 CONSIGNEE LINK
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING)); //33 PARTICIPANT AS BROKER FOR TW IMPORT
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING)); //34 PARTICIPANT AS DESTINATION CARRIER FOR TW IMPORT
		
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAdditional() != null &&
				this.getFreightDetail().getFreightAdditional().getEstablishedDate() != null){//35 ESTABLISHED DATE
			csvString.append(this.prefixSuffixByQuotes(new SimpleDateFormat(DATE_FORMAT_YYMMDD).format(
					this.getFreightDetail().getFreightAdditional().getEstablishedDate()).toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAdditional() != null &&
				this.getFreightDetail().getFreightAdditional().getInitialShipmentDate() != null){//36 FIRST SHIPMENT DATE
			csvString.append(this.prefixSuffixByQuotes(new SimpleDateFormat(DATE_FORMAT_YYMMDD).format(
					this.getFreightDetail().getFreightAdditional().getInitialShipmentDate()).toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightStatistics() != null &&
				this.getFreightDetail().getFreightStatistics().getLastShipmentDate() != null){//37 LAST SHIPMENT DATE
			csvString.append(this.prefixSuffixByQuotes(new SimpleDateFormat(DATE_FORMAT_YYMMDD).format(
					this.getFreightDetail().getFreightStatistics().getLastShipmentDate()).toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//38 NNNFIELD
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightStatistics() != null){//39 TOTAL NUMBER OF SHIPMENT
			csvString.append(this.prefixSuffixByQuotes(String.valueOf(this.getFreightDetail().getFreightStatistics().getTotalShipments())));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getAccountingRemarks() != null){//40 ACCOUNTING REMARKS
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getAccountingRemarks().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getPaymentMethod() != null){//41 METHOD OF PAYMENT
			if(!CASH.equalsIgnoreCase(this.getFreightDetail().getPaymentMethod())){
				csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getPaymentMethod()));
			}else{
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		
		if(this.getFreightDetail() != null && this.getFreightDetail().getCreditRate() != null){//42 CREDIT RATING
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getCreditRate().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAdditional() !=  null){//43 MANUAL AUDIT
			if(this.getFreightDetail().getFreightAdditional().getManualAuditIndicator()){
				csvString.append(this.prefixSuffixByQuotes(YES.toString()));
			}else{
				csvString.append(this.prefixSuffixByQuotes(NO.toString()));
			}
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getCreditLimit() !=  null){//44 CREDIT LIMIT
			csvString.append(this.prefixSuffixByQuotes(String.valueOf(this.getFreightDetail().getCreditLimit()).toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(ZERO.toString()));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getCurrencyCode() != null){//45 CURRENCY
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getCurrencyCode().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAdditional() != null &&
				this.getFreightDetail().getFreightAdditional().getRegionCode() != null){//46 REGION
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getFreightAdditional().getRegionCode()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAdditional() != null &&
				this.getFreightDetail().getFreightAdditional().getDistrictCode() != null){//47 DISTRICT
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getFreightAdditional().getDistrictCode()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAdditional() != null &&
				this.getFreightDetail().getFreightAdditional().getSubDistrictCode() != null){//48 SUB-DISTRICT
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getFreightAdditional().getSubDistrictCode()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		boolean creditInfoExists = false;
		if(this.getFreightDetail() != null && this.getFreightDetail().getCreditInformations() != null &&
				this.getFreightDetail().getCreditInformations().size() > 0){//49 CREDIT REF NUMBER ID 50 CREDIT REF NUMBER // 3times
			creditInfoExists = true;
			int count =0;
			for(CreditInformationDto creditInformationDto  : this.getFreightDetail().getCreditInformations()){
				if(creditInformationDto.getCreditReferenceId() != null){//CREDIT REF NUMBER ID
					csvString.append(this.prefixSuffixByQuotes(creditInformationDto.getCreditReferenceId().toString()));
				}else{
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}
				if(creditInformationDto.getCreditCardId() != null){//CREDIT REF NUMBER
					csvString.append(this.prefixSuffixByQuotes(creditInformationDto.getCreditCardId().toString()));
				}else{
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}
				count++;
				if(count==3){
					break;
				}
			}
			
		}else{
			for(int i =0; i<=5; i++){
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
		}
		if(creditInfoExists && this.getFreightDetail() != null && this.getFreightDetail().getCreditInformations() != null &&
				this.getFreightDetail().getCreditInformations().size() > 0){
			if(this.getFreightDetail().getCreditInformations().size() ==1){
				for(int i =0; i<=3; i++){
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}
			}
			if(this.getFreightDetail().getCreditInformations().size() ==2){
				for(int i =0; i<=1; i++){
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}
			}
		}
		
		csvString.append(this.prefixSuffixByQuotes(String.valueOf(this.getParticipantAliasDtos().size()).toString()));//51 ALIAS NAMES COUNTER
		boolean aliasNameExists=false;
		if(this.getParticipantAliasDtos() != null 
					&& this.getParticipantAliasDtos().size() > 0){//52 ALIAS NAME // 3times
			int count = 0;
			aliasNameExists=true;
			for(ParticipantAliasDto participantAliasDto : this.getParticipantAliasDtos()){
				if(participantAliasDto.getAliasName() != null){
					csvString.append(this.prefixSuffixByQuotes(participantAliasDto.getAliasName().toString()));
				}else{
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}
				count++;
				if(count==3){
					break;
				}
			}
		}else{
			for(int i =0; i<=2; i++){
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
		}
		if(aliasNameExists && this.getParticipantAliasDtos() != null 
				&& this.getParticipantAliasDtos().size() > 0){
			if(this.getParticipantAliasDtos().size()==1){
				for(int i =0; i<=1; i++){
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}
			}
			if(this.getParticipantAliasDtos().size()==2){
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
		}
		csvString.append(this.prefixSuffixByQuotes(ZERO.toString()));//53 TOTAL BROKER PIECES
		csvString.append(this.prefixSuffixByQuotes(ZERO.toString()));//54 TOTAL BROKER SHIPMENTS
		csvString.append(this.prefixSuffixByQuotes(ZERO.toString()));//55 TOTAL WIEGHT OF BROKER SHIPMENT
		csvString.append(this.prefixSuffixByQuotes(ZERO.toString()));//56 UNIT OF WEIGHT
		csvString.append(this.prefixSuffixByQuotes(ZERO.toString()));//57 TOTAL NUMBER OF BROKER ULDS
		csvString.append(this.prefixSuffixByQuotes(ZERO.toString()));//58 TOTAL NUMBER OF PIECES IN BROKER ULDS
		csvString.append(this.prefixSuffixByQuotes(ZERO.toString()));//59 TOTAL SDCARRIER PIECES
		csvString.append(this.prefixSuffixByQuotes(ZERO.toString()));//60 TOTAL SDCCARRIER SHIPMENTS
		csvString.append(this.prefixSuffixByQuotes(ZERO.toString()));//61 TOTAL WEIGHT OF SDCARRIER SHIPMENTS
		csvString.append(this.prefixSuffixByQuotes(ZERO.toString()));//62 UNIT OF WEIGHT
		csvString.append(this.prefixSuffixByQuotes(ZERO.toString()));//63 TOTAL NUMBEROF SDCARRIER ULDS
		
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightStatistics() != null){//64 TOTAL NUMBER OF HAWBS
			csvString.append(this.prefixSuffixByQuotes(String.valueOf(this.getFreightDetail().getFreightStatistics().getTotalHouseAWB()).toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(ZERO.toString()));
		}
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//65 AGENT ID CREATED PART
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//66 STATION CREATED PART
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//67 SCOPE ID
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//68 CONTRACT NUMBER
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAttributes() != null &&
				this.getFreightDetail().getFreightAttributes().getContractAllowedIndicator()){//69 CONTRACTID
			csvString.append(this.prefixSuffixByQuotes(YES.toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(NO.toString()));
		}
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//70 ASSOCIATED CONTRACT ACCOUNT1
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//71 ASSOCIATED CONTRACT ACCOUNT1 ID
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//72 ASSOCIATED CONTRACT ACCOUNT2
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//73 ASSOCIATED CONTRACT ACCOUNT2 ID
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//74 AUTO PARTICIPANT
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//75 FWB TTY
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//76 NOM AGENT

		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAdditional() != null &&
				this.getFreightDetail().getFreightAdditional().getCustomsCode() !=  null){//77 CUSTOMS CODE
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getFreightAdditional().getCustomsCode().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		boolean bondedPremExists = false;
		if(this.getFreightDetail() != null && this.getFreightDetail().getBondedPremises() !=  null && 
				this.getFreightDetail().getBondedPremises().size() > 0){//78 BOND LIABILITY//79 BOND STATION CODE //4 TIMES
			bondedPremExists = true;
			for(BondedPremiseDto bondedPremiseDto : this.getFreightDetail().getBondedPremises()){
				if(bondedPremiseDto.getBondedId() !=  null){
					csvString.append(this.prefixSuffixByQuotes(bondedPremiseDto.getBondedId().toString()));
				}else{
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}
				if(bondedPremiseDto.getBondedStation() !=  null){
					csvString.append(this.prefixSuffixByQuotes(bondedPremiseDto.getBondedStation().toString()));
				}else{
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}
			}
		}else{
			for(int i =0; i<=7; i++){
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
		}
		if(bondedPremExists && this.getFreightDetail() != null && this.getFreightDetail().getBondedPremises() !=  null && 
				this.getFreightDetail().getBondedPremises().size() > 0){
			if(this.getFreightDetail().getBondedPremises().size() ==1){
				for(int i =0; i<=5; i++){
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}
			}
			if(this.getFreightDetail().getBondedPremises().size() ==2){
				for(int i =0; i<=3; i++){
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}
			}
			if(this.getFreightDetail().getBondedPremises().size() ==3){
				for(int i =0; i<=1; i++){
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}
			}

		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAdditional() !=  null
				&& this.getFreightDetail().getFreightAdditional().getVoucher() != null){//80 VOUCHER
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getFreightAdditional().getVoucher()).toString());
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAdditional() !=  null
				&& this.getFreightDetail().getFreightAdditional().getVatNumber() != null){//81 VAT NUMBER
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getFreightAdditional().getVatNumber()).toString());
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		
		if(this.getFreightDetail() != null && this.getFreightDetail().getHardOrSoftCreditLimitIndicator() != null){//82 CREDIT LIMIT INDICATOR
			if(this.getFreightDetail().getHardOrSoftCreditLimitIndicator()){
				csvString.append(this.prefixSuffixByQuotes(HARD_CREDIT.toString()));
			}else{
				csvString.append(this.prefixSuffixByQuotes(SOFT_CREDIT.toString()));
			}
			
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getAvailableCredit() != null){//83 AVAILABLE CREDIT LIMIT
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getAvailableCredit().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAdditional() != null &&
				this.getFreightDetail().getFreightAdditional().getAwbPriority() != null){//84 AWB PRIORITY
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getFreightAdditional().getAwbPriority().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAttributes() != null){//85 CGO ATTRIBUTE
			csvString.append(this.prefixSuffixByQuotes(this.constructCGOAttributeForPartDownload(this.getFreightDetail().getFreightAttributes())));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAttributes() != null &&
				this.getFreightDetail().getFreightAttributes().getFirstSecurityStatusInd() != null){//86 SECURITY INDICATOR1
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail()
									.getFreightAttributes().getFirstSecurityStatusInd().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAttributes() != null &&
				this.getFreightDetail().getFreightAttributes().getFirstSecurityStatusInformation() != null){//87 SECURITY ID1
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getFreightAttributes()
								.getFirstSecurityStatusInformation().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFrequentFlyerNumber() != null){//88 FREQUENT FLYER NUMBER
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getFrequentFlyerNumber().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAttributes() != null&&
				this.getFreightDetail().getFreightAttributes().getCountry1() != null){//89 COUNTRY CODE FOR 1ST SECURITY ID
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getFreightAttributes().getCountry1().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAttributes() != null &&
				this.getFreightDetail().getFreightAttributes().getCountry2() != null){//90 COUNTRY CODE FOR 2ND SECURITY ID
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getFreightAttributes().getCountry2().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAttributes() != null &&
				this.getFreightDetail().getFreightAttributes().getSecondSecurityStatusInformation() != null){//91 SECURITY ID2
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().
							getFreightAttributes().getSecondSecurityStatusInformation().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//92 DATE OF MOST RECENT SHIPMENT
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//93 DATE OF SECOND RECENT SHIPMENT
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//94 DATE OF THIRD RECENT SHIPMENT
		
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAttributes() != null &&
				this.getFreightDetail().getFreightAttributes().getFirstDateRangeDto() != null && 
					this.getFreightDetail().getFreightAttributes().getFirstDateRangeDto().getExpirationDate() != null){//95 EXPIRATION DATE FOR SECURITY ID1
			csvString.append(this.prefixSuffixByQuotes(new SimpleDateFormat(DATE_FORMAT_YYMMDD).format
					(this.getFreightDetail().getFreightAttributes().getFirstDateRangeDto().getExpirationDate()).toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAttributes() != null &&
				this.getFreightDetail().getFreightAttributes().getFirstDateRangeDto() != null && 
					this.getFreightDetail().getFreightAttributes().getFirstDateRangeDto().getEffectiveDate() != null){//96 ESTABLISHED DATE FOR SECURITY ID1
			csvString.append(this.prefixSuffixByQuotes(new SimpleDateFormat(DATE_FORMAT_YYMMDD).format
					(this.getFreightDetail().getFreightAttributes().getFirstDateRangeDto().getEffectiveDate()).toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAttributes() != null &&
				this.getFreightDetail().getFreightAttributes().getSecondDateRangeDto() != null && 
					this.getFreightDetail().getFreightAttributes().getSecondDateRangeDto().getExpirationDate() != null){//97 EXPIRATION DATE FOR SECURITY ID2
			csvString.append(this.prefixSuffixByQuotes(new SimpleDateFormat(DATE_FORMAT_YYMMDD).format
					(this.getFreightDetail().getFreightAttributes().getSecondDateRangeDto().getExpirationDate()).toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAttributes() != null &&
				this.getFreightDetail().getFreightAttributes().getSecondDateRangeDto() != null && 
					this.getFreightDetail().getFreightAttributes().getSecondDateRangeDto().getEffectiveDate() != null){//98 ESTABLISHED DATE FOR SECURITY ID2
			csvString.append(this.prefixSuffixByQuotes(new SimpleDateFormat(DATE_FORMAT_YYMMDD).format
					(this.getFreightDetail().getFreightAttributes().getSecondDateRangeDto().getEffectiveDate()).toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAttributes() != null &&
				this.getFreightDetail().getFreightAttributes().getCcsfCargoScreeningFacilityNo()!= null){//99 CCSF NUMBER
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getFreightAttributes().getCcsfCargoScreeningFacilityNo().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//100 CCSF EXPIRATION DATE
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//101 CCSF ESTABLISHED DATE
		
		if(this.getFreightDetail() != null && this.getFreightDetail().getFreightAttributes() != null &&
				this.getFreightDetail().getFreightAttributes().getCtpatCustomsSecurityNo()!= null){//102 CTPAT NUMBER
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getFreightAttributes().getCtpatCustomsSecurityNo().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//103 CTPAT EXPIRATION DATE
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//104 CTPAT ESTABLISHED DATE
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//105 AIRLINE CODE
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//106 SPECIFIC AIRLINE
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//107 CGC/CPF NUMBER
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//108 CGC/CPF INDICATOR
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//109 INSC. EST.
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//110 BAIRRO
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//111 INSC. EST. ID
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//112 INSURANCE POLICY NUMBER
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//113 INSURANCE COMPANY NAME
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//114 CGC/CPF OF REQUESTOR
		
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//115 REQUESTOR NAME
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//116 REVISION COUNTER
		if( this.getDeleteIndicator()){//117 PARTICIPANT DELETE FLAG
			csvString.append(this.prefixSuffixByQuotes(DELETE.toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}	
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//118 SDC CARRIER ULD WGT
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//119 SDC CARRIER ULD PCS
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//120 CREATE/UPDATE DATE
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//121 DELETE AGENT NUMBER
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//122 DELETE AGENT STN
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//123 CFMREO DELETE IND
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//124 CREATE/UPDATE TIME
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//125 DELETE AGENT PID
		if( this.getDeletedDate() != null){//126 DELETE DATE
			csvString.append(this.prefixSuffixByQuotes(new SimpleDateFormat(DATE_FORMAT_YYMMDD).format(this.getDeletedDate()).toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if( this.getDeletedDate() != null){//127 DELETE TIME 
			csvString.append(this.prefixSuffixByQuotes(new SimpleDateFormat(TIME_FORMAT_HHMM).format(this.getDeletedDate()).toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if( this.getDeleteRemarks() != null){//128 DELETE REMARKS
			csvString.append(this.prefixSuffixByQuotes(this.getDeleteRemarks().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//129 FRWD BILL TO IND
		if( this.getFreightDetail() != null && this.getFreightDetail().getTransistionEffectiveDate() != null){ //130 TRANSITION EFFECTIVE DATE
			csvString.append(this.prefixSuffixByQuotes(new SimpleDateFormat(DATE_FORMAT_YYMMDD).format(
								this.getFreightDetail().getTransistionEffectiveDate()).toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if( this.getFreightDetail() != null && this.getFreightDetail().getFreightAdditional() != null &&
				this.getFreightDetail().getFreightAdditional().getCustomerSegmentation() != null){//131 CUSTOMER SEGMENTATION
			csvString.append(this.prefixSuffixByQuotes(this.getFreightDetail().getFreightAdditional().getCustomerSegmentation().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getAccounType() != null ){///132 ACCOUNT TYPE
			csvString.append(this.prefixSuffixByQuotes(this.getAccounType().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if(this.getLanguage() != null){//133 ACCOUNT LANGUAGE
			csvString.append(this.prefixSuffixByQuotes(this.getLanguage().toString()));
		}else{
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//134 INVOICE MEDIA
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//135 INVOICE FREQUENCY
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//136 INVOICE SEQUENCE
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//137 INVOICE LANGUAGE
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//138 BILLING CURRENCY
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//139 BILLING DUE DAYS
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//140 SERVICE FEE PERCENT
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//141 BILLING PAYMENT DISCOUNT DAYS
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//142 DISCOUNT PERCENT
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//143 COMMISSION PERCENT
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//144 INCENTIVE PERCENT
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//145 ISC PERCENT
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//146 ACCOUNTING PERIOD
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//147 YTD SALES
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//148 PREVIOUS YTD SALES
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//149 MTD SALES
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//150 PREVIOUS YTM SALES
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//151 TOLERANCE LIMIT FOR INTERLINE
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//152 COLLECTION MEDIA ALERT EMAIL
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//153 COLLECTION MEDIA ALERT HARD COPY
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//154 COLLECTOR ID
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//155 COLLECTION ACTION 1
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//156 COLLECTION DATE 1
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//157 COLLECTION RESULT 1
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//158 COLLECTION ACTION 2
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//159 COLLECTION DATE 2
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//160 COLLECTION RESULT 2
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//161 COLLECTION ACTION 3
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//162 COLLECTION DATE 3
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//163 COLLECTION RESULT 3
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//164 COLLECTION ACTION 4
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//165 COLLECTION DATE 4
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//166 COLLECTION RESULT 4
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//167 AMOUNTS UNBILLED
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//168 AMOUNTS UNAPPLIED
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//169 TOTAL OUTSTANDING 1
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//170 TOTAL OUTSTANDING 2
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//171 TOTAL OUTSTANDING 3
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//172 TOTAL OUTSTANDING 4 
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//173 TOTAL OUTSTANDING 5
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//174 ACCOUNT REGION
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//175 AREA REP
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//176 COUNTRY REP
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//177 STATION 1
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//178 STATION 2
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//179 STATION 3
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//180 STATION 4
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//181 STATION 5
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//182 STATION 6
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//183 STATION 7
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//184 STATION 8
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//185 STATION 9
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//186 STATION 10
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//187 STATION 11
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//188 STATION 12
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//189 STATION 13
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//190 STATION 14
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//191 STATION 15
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//192 SALES CONTACT 1
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//193 SALES CONTACT 2
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//194 SALES ADDRESS
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//195 SALES CITY
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//196 SALES STATE
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//197 SALES COUNTRY
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//198 SALES PHONE
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//199 SALES FAX
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//200 EMAIL
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//201 CONTACT INFO
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//202 NATURE OF BUSINESS
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//203 PRIMARY COMMODITY
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//204 SEASONAL SHIPPING
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//205 SPECIAL HANDLING
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//206 ACCOUNT EXEC
		csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));//207 ApplyTDS
		if(this.getLmsDataBaseKey() != null){//208 LMSDATABASEKEY
			csvString.append(this.prefixSuffixByQuotes(this.getLmsDataBaseKey()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		return csvString.toString();
	}
    private String constructCGOAttributeForPartDownload(FreightAttributesDto aFreightAttributesDto){//Added for LMS-48831
		/*Attributes order to be followed for CGO column*/
		final StringBuilder aAggreagateStringBuilder = new StringBuilder();
		if(aFreightAttributesDto.getCommercialAccountRestrictionIndicator() != null &&
				aFreightAttributesDto.getCommercialAccountRestrictionIndicator()){//1
			aAggreagateStringBuilder.append(YES);
		}else{
			aAggreagateStringBuilder.append(NO);
		}
		if(aFreightAttributesDto.getStateTaxExemptIndicator() != null&&
				aFreightAttributesDto.getStateTaxExemptIndicator()){//2
			aAggreagateStringBuilder.append(YES);
		}else{
			aAggreagateStringBuilder.append(NO);
		}
		 aAggreagateStringBuilder.append(EMPTY_SPACE);//3
		if(aFreightAttributesDto.getValuableCargoExemptIndicator() != null &&
				aFreightAttributesDto.getValuableCargoExemptIndicator()){//4
			aAggreagateStringBuilder.append(YES);
		}else{
			aAggreagateStringBuilder.append(NO);
		}
		if(aFreightAttributesDto.getRestrictedArticlesExemptIndicator() != null &&
				aFreightAttributesDto.getRestrictedArticlesExemptIndicator()){//5
			aAggreagateStringBuilder.append(YES);
		}else{
			aAggreagateStringBuilder.append(NO);
		}
		if(aFreightAttributesDto.getGovtTaxExemptIndicator() != null &&
				aFreightAttributesDto.getGovtTaxExemptIndicator()){//6
			aAggreagateStringBuilder.append(YES);
		}else{
			aAggreagateStringBuilder.append(NO);
		}
		if(aFreightAttributesDto.getNoShipmentIndicator() != null &&
				aFreightAttributesDto.getNoShipmentIndicator()){//7
			aAggreagateStringBuilder.append(YES);
		}else{
			aAggreagateStringBuilder.append(NO);
		}
		if(aFreightAttributesDto.getManualHouseAWBFeeRestrictionIndicator() != null &&
				aFreightAttributesDto.getManualHouseAWBFeeRestrictionIndicator()){//8
			aAggreagateStringBuilder.append(YES);
		}else{
			aAggreagateStringBuilder.append(NO);
		}
		if(aFreightAttributesDto.getEdiHouseAWBFeeEntryRestrictionIndicator() != null &&
				aFreightAttributesDto.getEdiHouseAWBFeeEntryRestrictionIndicator()){//9
			aAggreagateStringBuilder.append(YES);
		}else{
			aAggreagateStringBuilder.append(NO);
		}
		if(aFreightAttributesDto.getIataAgentPrepaidChargesIndicator() != null &&
				aFreightAttributesDto.getIataAgentPrepaidChargesIndicator()){//10
			aAggreagateStringBuilder.append(YES);
		}else{
			aAggreagateStringBuilder.append(NO);
		}
		if(aFreightAttributesDto.getAutomaticEQA() != null &&
				aFreightAttributesDto.getAutomaticEQA()){//11
			aAggreagateStringBuilder.append(YES);
		}else{
			aAggreagateStringBuilder.append(NO);
		}
		if(aFreightAttributesDto.getIataAgentPrepaidChargesIndicator() != null &&
				aFreightAttributesDto.getIataAgentPrepaidChargesIndicator()){//12
			aAggreagateStringBuilder.append(YES);
		}else{
			aAggreagateStringBuilder.append(NO);
		}
		if(aFreightAttributesDto.getBookingChargeExemption() != null &&
				aFreightAttributesDto.getBookingChargeExemption()){//13
			aAggreagateStringBuilder.append(YES);
		}else{
			aAggreagateStringBuilder.append(NO);
		}
		if(aFreightAttributesDto.getFsuChargeExemtion() != null &&
				aFreightAttributesDto.getFsuChargeExemtion()){//14
			aAggreagateStringBuilder.append(YES);
		}else{
			aAggreagateStringBuilder.append(NO);
		}
			return aAggreagateStringBuilder.toString().trim();
	}
}
