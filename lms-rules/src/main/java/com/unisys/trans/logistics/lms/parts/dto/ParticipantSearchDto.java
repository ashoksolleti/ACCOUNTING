/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantNameSearchType;

/**
 * <code>ParticipantSearchDto</code> contains the <code>Participant</code> details.
 * <p>
 * In request, if <code>selectionListDisplayIndicator</code> is set to true, then a list of participant
 * details are listed for selection.<br>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>accountCode
 * <li>accountNumber
 * <li>address
 * <li>city
 * <li>country
 * <li>name
 * <li>nameType
 * <li>oId
 * <li>role
 * <li>state
 * <li>stationCode
 * <li>type
 * <li>pageSize
 * <li>startIndex
 * <li>fetchedCount
 * <li>totalCount
 * <li>searchString
 * <li>displayCount
 * <li>deleteIndicator
 * <li>securityInfo1
 * <li>securityInfo2
 * <li>freightOId
 * <li>postalCode
 * </ul>
 * </code>
 */
public class ParticipantSearchDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7061708707823150480L;

    /**
     * Attribute to hold <code>accountCode</code> property.
     */
    private String accountCode;

    /**
     * Attribute to hold <code>accountNumber</code> property.
     */
    private String accountNumber;

    /**
     * Attribute to hold <code>address</code> property.
     */
    private String address;

    /**
     * Attribute to hold <code>billingAccount1</code> property.
     */
    private String billingAccount1;

    /**
     * Attribute to hold <code>billingAccount2</code> property.
     */
    private String billingAccount2;

    /**
     * Attribute to hold <code>city</code> property.
     */
    private String city;

    /**
     * Attribute to hold <code>contractAllowed</code> property.
     */

    private boolean contractAllowed;

    /**
     * Attribute to hold <code>country</code> property.
     */
    private String country;

    /**
     * Attribute to hold <code>deleteIndicator</code> property.
     */
    private boolean deleteIndicator;

    /**
     * Attribute to hold <code>displayCount</code> property.
     */
    private Integer displayCount;

    /**
     * Attribute to hold <code>fetchedCount</code> property.
     */
    private Integer fetchedCount;

    /**
     * Attribute to hold <code>freightOId</code> property.
     */
    private Long freightOId;

    /**
     * Attribute to hold <code>name</code> property.
     */
    private String name;

    /**
     * Attribute to hold <code>nameType</code> property.
     */
    private ParticipantNameSearchType nameType;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>pageSize</code> property.
     */
    private Integer pageSize;

    /**
     * Attribute to hold <code>postalCode</code> property.
     */
    private String postalCode;

    /**
     * Attribute to hold <code>role</code> property.
     */
    private String role;

    /**
     * Attribute to hold <code>searchString</code> property.
     */
    private String searchString;

    /**
     * Attribute to hold <code>securityInfo1</code> property.
     */
    private String securityInfo1;

    /**
     * Attribute to hold <code>securityInfo2</code> property.
     */
    private String securityInfo2;

    /**
     * Attribute to hold <code>startIndex</code> property.
     */
    private Integer startIndex;

    /**
     * Attribute to hold <code>state</code> property.
     */
    private String state;

    /**
     * Attribute to hold <code>stationCode</code> property.
     */
    private String stationCode;

    /**
     * Attribute to hold <code>totalCount</code> property.
     */
    private Integer totalCount;

    /**
     * Attribute to hold <code>type</code> property.
     */
    private String type;
    private String specificAirline;
    
    private String vatNumber;

    /**
     * Default constructor.
     */
    public ParticipantSearchDto() {

    }
    public String getSpecificAirline() {
		return specificAirline;
	}
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
    }

    /**
     * Constructor with name as an argument.
     * <p>
     * <p>
     * 
     * @param pName <code>String</code><br>
     *            holds the participant name.<br>
     */
    public ParticipantSearchDto(final String pName) {
        this.name = pName;
    }

    /**
     * Constructor with account number, OId and delete indicator as arguments.
     * <p>
     * <p>
     * 
     * @param pBillingAccountNumber1 holds the participant name.<br>
     * @param pOId holds the OId of the participant.<br>
     * @param pIndicator holds the delete indicator of the participant.<br>
     */
    public ParticipantSearchDto(
                final String pBillingAccountNumber1, final Long pOId, final boolean pIndicator) {

        this.accountNumber = pBillingAccountNumber1;
        this.oId = pOId;
        this.deleteIndicator = pIndicator;

    }

    /**
     * Constructor with name and sation as arguments.
     * <p>
     * <p>
     * 
     * @param pName holds the participant name.<br>
     * @param pStationCode holds the station of the participant.<br>
     */
    public ParticipantSearchDto(final String pName, final String pStationCode) {

        this.name = pName;
        this.stationCode = pStationCode;

    }

    /**
     * Constructor with selection list values as arguments.
     * <p>
     * <p>
     * 
     * @param pName holds the participant name.<br>
     * @param pStationCode holds the station of the participant.<br>
     * @param pAddress holds the address of the participant.<br>
     */
    public ParticipantSearchDto(final String pName, final String pStationCode, final String pAddress) {

        this.name = pName;
        this.stationCode = pStationCode;
        this.address = pAddress;

    }

    /**
     * Constructor with selection list values as arguments.
     * <p>
     * <p>
     * 
     * @param pName holds the participant name.<br>
     * @param pStationCode holds the station of the participant.<br>
     * @param pAddress holds the address of the participant.<br>
     * @param pDeleteInd determines whether the <code>deleteIndicator</code> is set to true or false.<br>
     */
    public ParticipantSearchDto(final String pName, final String pStationCode, final String pAddress,
                final boolean pDeleteInd) {

        this.name = pName;
        this.stationCode = pStationCode;
        this.address = pAddress;
        this.deleteIndicator = pDeleteInd;

    }

    /**
     * Constructor with selection list values as arguments.
     * <p>
     * 
     * @param pName holds the participant name.<br>
     * @param pStationCode holds the station of the participant.<br>
     * @param pAddress holds the address of the participant.<br>
     * @param pDeleteIndicator determines whether the <code>deleteIndicator</code> is set to true or false.<br>
     * @param pOId contains the object ID of the participant.<br>
     * @param pType holds the type of participant.<br>
     * @param pCity holds the city of the participant.<br>
     * @param pState holds the state of the participant.<br>
     * @param pCountry holds the country of the participant.<br>
     * @param pBillingAccountNumber1 holds the <code>billingAccountNumber1</code> of the participant.<br>
     * @param pBillingAccountNumber1Code holds the <code>billingAccountNumber1Code</code> of the participant.<br>
     */
    public ParticipantSearchDto(final String pName, final String pStationCode, final String pAddress,
                final boolean pDeleteIndicator, final Long pOId, final String pType, final String pCity,
                final String pState, final String pCountry, final String pBillingAccountNumber1,
                final String pBillingAccountNumber1Code) {
        this.name = pName;
        this.stationCode = pStationCode;
        this.address = pAddress;
        this.deleteIndicator = pDeleteIndicator;
        this.oId = pOId;
        this.type = pType;
        this.city = pCity;
        this.state = pState;
        this.country = pCountry;
        this.accountNumber = pBillingAccountNumber1;
        this.accountCode = pBillingAccountNumber1Code;

    }

    /**
     * Parameterized constructor.
     * <p>
     * 
     * @param pName holds the participant name.<br>
     * @param pStationCode holds the station of the participant.<br>
     * @param pAddress holds the address of the participant.<br>
     * @param pDeleteIndicator determines whether the <code>deleteIndicator</code> is set to true or false.<br>
     * @param pOId contains the object ID of the participant.<br>
     * @param pType holds the type of participant.<br>
     * @param pCity holds the city of the participant.<br>
     * @param pState holds the state of the participant.<br>
     * @param pCountry holds the country of the participant.<br>
     * @param pBillingAccountNumber1 holds the <code>billingAccountNumber1</code> of the participant.<br>
     * @param pBillingAccountNumber1Code holds the <code>billingAccountNumber1Code</code> of the participant.<br>
     * @param pFreightOId holds the <code>freightOId</code> of the participant.<br>
     * @param pSecurityInfo1 holds the <code>securityInfo1</code> of the participant.<br>
     * @param pSecurityInfo2 holds the <code>securityInfo2</code> of the participant.<br>
     */
    public ParticipantSearchDto(final String pName, final String pStationCode, final String pAddress,
                final boolean pDeleteIndicator, final Long pOId, final String pType, final String pCity,
                final String pState, final String pCountry, final String pBillingAccountNumber1,
                final String pBillingAccountNumber1Code, final Long pFreightOId, final String pSecurityInfo1,
                final String pSecurityInfo2) {
        this.name = pName;
        this.stationCode = pStationCode;
        this.address = pAddress;
        this.deleteIndicator = pDeleteIndicator;
        this.oId = pOId;
        this.type = pType;
        this.city = pCity;
        this.state = pState;
        this.country = pCountry;
        this.accountNumber = pBillingAccountNumber1;
        this.accountCode = pBillingAccountNumber1Code;
        this.freightOId = pFreightOId;
        this.securityInfo1 = pSecurityInfo1;
        this.securityInfo2 = pSecurityInfo2;
    }

    /**
     * Constructor with account number, OId and delete indicator as arguments.
     * <p>
     * <p>
     * 
     * @param pName holds the participant name.<br>
     * @param pBillingAccountNumber1 holds the participant name.<br>
     * @param pAccountNumber holds the account number.<br>
     * @param pBillingAccountNumber2 holds the billing account number.<br>  
     * @param pOId holds the OId of the participant.<br>
     * @param pIndicator holds the delete indicator of the participant.<br>
     * @param pAddress holds the address of the participant.<br>
     * @param pCity holds the city of the participant.<br>
     * @param pState holds the state of the participant.<br>
     * @param pCountry holds the country of the participant.<br>
     * @param pPostalCode holds the postal code of the participant.<br>
     * @param pStationCode holds the station code of the participant.<br>
     * @param pContractAllowed checks whether the contract allowed.<br>
     */
    public ParticipantSearchDto(
                final String pAccountNumber, final String pBillingAccountNumber1,
                final String pBillingAccountNumber2, final Long pOId, final boolean pIndicator,
                final String pName, final String pAddress, final String pCity, final String pState,
                final String pCountry, final String pPostalCode, final String pStationCode,
                final boolean pContractAllowed, final String pSpecificAirline) {

        this.accountNumber = pAccountNumber;
        this.billingAccount1 = pBillingAccountNumber1;
        this.billingAccount2 = pBillingAccountNumber2;
        this.oId = pOId;
        this.deleteIndicator = pIndicator;
        this.address = pAddress;
        this.city = pCity;
        this.country = pCountry;
        this.state = pState;
        this.postalCode = pPostalCode;
        this.name = pName;
        this.stationCode = pStationCode;
        this.contractAllowed = pContractAllowed;
        this.specificAirline = pSpecificAirline;

    }
    
    /**
     * Constructor with selection list values as arguments.
     * <p>
     * <p>
     * 
     * @param pName holds the participant name.<br>
     * @param pStationCode holds the station of the participant.<br>
     * @param pAddress holds the address of the participant.<br>
     * @param pDeleteInd determines whether the <code>deleteIndicator</code> is set to true or false.<br>
     */
    public ParticipantSearchDto(final String pName, final String pAccountNumber , final String pBillingAccountNumber1, final String pBillingAccountNumber2, final Long pOId,  final String pStationCode
               ) {

        this.name = pName;
        this.accountNumber = pAccountNumber;
        this.billingAccount1 = pBillingAccountNumber1;
        this.billingAccount2 = pBillingAccountNumber2;
        this.oId = pOId;
        this.stationCode = pStationCode;
     

    }
    
    /**
     * Constructor with account number, OId and delete indicator as arguments.
     * <p>
     * <p>
     * 
     * @param pName holds the participant name.<br>
     * @param pBillingAccountNumber1 holds the participant name.<br>
     * @param pAccountNumber holds the account number.<br>
     * @param pBillingAccountNumber2 holds the billing account number.<br>  
     * @param pOId holds the OId of the participant.<br>
     * @param pIndicator holds the delete indicator of the participant.<br>
     * @param pAddress holds the address of the participant.<br>
     * @param pCity holds the city of the participant.<br>
     * @param pState holds the state of the participant.<br>
     * @param pCountry holds the country of the participant.<br>
     * @param pPostalCode holds the postal code of the participant.<br>
     * @param pStationCode holds the station code of the participant.<br>
     * @param pContractAllowed checks whether the contract allowed.<br>
     * @param pVatNUmber checks whether the contract allowed.<br>
     */
    public ParticipantSearchDto(
                final String pAccountNumber, final String pBillingAccountNumber1,
                final String pBillingAccountNumber2, final Long pOId, final boolean pIndicator,
                final String pName, final String pAddress, final String pCity, final String pState,
                final String pCountry, final String pPostalCode, final String pStationCode,
                final boolean pContractAllowed, final String pSpecificAirline,final String pVatNumber) {

        this.accountNumber = pAccountNumber;
        this.billingAccount1 = pBillingAccountNumber1;
        this.billingAccount2 = pBillingAccountNumber2;
        this.oId = pOId;
        this.deleteIndicator = pIndicator;
        this.address = pAddress;
        this.city = pCity;
        this.country = pCountry;
        this.state = pState;
        this.postalCode = pPostalCode;
        this.name = pName;
        this.stationCode = pStationCode;
        this.contractAllowed = pContractAllowed;
        this.specificAirline = pSpecificAirline;
        this.vatNumber = pVatNumber;

    }


    /**
     * Gets the <code>accountCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * I
     * <p>
     * 
     * @return the current value of <code>accountCode</code> property.<br>
     */
    public String getAccountCode() {
        return this.accountCode;
    }

    /**
     * Gets the <code>accountNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * 123456
     * <p>
     * 
     * @return the current value of <code>accountNumber</code> of the participant.<br>
     */
    public String getAccountNumber() {
        return this.accountNumber;
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
     * @return the current value of <code>address</code> of the participant.<br>
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Gets the <code>billingAccount1</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces
     * <p>
     * <b>Example: </b><br>
     * BEAC0001
     * <p>
     * 
     * @return the new value of the <code>billingAccount1</code> of the participant.<br>
     */
    public String getBillingAccount1() {
        return this.billingAccount1;
    }

    /**
     * Gets the <code>billingAccount2</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces
     * <p>
     * <b>Example: </b><br>
     * BEAC0001
     * <p>
     * 
     * @return the new value of the <code>billingAccount2</code> of the participant.<br>
     */
    public String getBillingAccount2() {
        return this.billingAccount2;
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
     * @return the current value of <code>city</code> of the participant.<br>
     */
    public String getCity() {
        return this.city;
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
     * @return the current value of <code>country</code> of the participant.<br>
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Gets the <code>displayCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of <code>displayCount</code> property.<br>
     */
    public Integer getDisplayCount() {
        return this.displayCount;
    }

    /**
     * Gets the <code>fetchedCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of <code>fetchedCount</code> property.<br>
     */
    public Integer getFetchedCount() {
        return this.fetchedCount;
    }

    /**
     * Gets the <code>freightOId</code> property.
     * <p>
     * 
     * @return the current value of <code>freightOId</code> property.<br>
     */
    public Long getFreightOId() {
        return this.freightOId;
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
     * Gets the <code>nameType</code> property.
     * <p>
     * 
     * @return the current value of <code>nameType</code> property.<br>
     */
    public ParticipantNameSearchType getNameType() {
        return this.nameType;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>pageSize</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of <code>pageSize</code> property.<br>
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * Gets the value of the <code>postalCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <b>Example: </b><br>
     * 112012
     * <p>
     * 
     * @return <code>String</code><br>
     *         the current value of <code>postalCode</code> property.<br>
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Gets the <code>role</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * S-Shipper<br>
     * C-Consignee<br>
     * B-Broker<br>
     * A-IATA Agent<br>
     * <p>
     * 
     * @return the current value of <code>role</code> of the participant.<br>
     */
    public String getRole() {
        return this.role;
    }

    /**
     * Gets the <code>searchString</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphanumeric <br>
     * <p>
     * <b>Example: </b><br>
     * UN
     * <p>
     * 
     * @return the current value of <code>searchString</code> property.<br>
     */
    public String getSearchString() {
        return this.searchString;
    }

    /**
     * Gets the <code>securityInfo1.</code>
     * <p>
     * <b>Format: </b><br>
     * 1-4 alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * POBC
     * <p>
     * 
     * @return the current value of <code>securityInfo1</code> property.<br>
     */

    public String getSecurityInfo1() {
        return this.securityInfo1;
    }

    /**
     * Gets the <code>securityInfo2.</code>
     * <p>
     * <b>Format: </b><br>
     * 1-16 Any Character<br>
     * <p>
     * <b>Example: </b><br>
     * POB123
     * <p>
     * 
     * @return the current value of <code>securityInfo2</code> property.<br>
     */
    public String getSecurityInfo2() {
        return this.securityInfo2;
    }

    /**
     * Gets the <code>startIndex</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 0
     * <p>
     * 
     * @return the current value of <code>startIndex</code> property.<br>
     */
    public Integer getStartIndex() {
        return this.startIndex;
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
     * @return the current value of <code>state</code> of the participant.<br>
     */
    public String getState() {
        return this.state;
    }

    /**
     * Gets the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of <code>stationCode</code> of the participant.<br>
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Gets the <code>totalCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of <code>totalCount</code> property.<br>
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <ul>
     * <li>1 - Full Name
     * <li>2 - One-time participant
     * <li>3 - Alias
     * <li>4 - Full, One-time, Alias
     * </ul>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * M
     * <p>
     * 
     * @return the current value of <code>type</code> of participant.<br>
     */
    public String getType() {
        return this.type;
    }

    /**
     * Gets the <code>contractAllowed</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <ul>
     * <li>true - if contract is allowed for the participant
     * <li>false - otherwise
     * </ul>
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @return the current value of <code>type</code> of participant.<br>
     */
    public boolean isContractAllowed() {
        return this.contractAllowed;
    }

    /**
     * Determines whether the deleteIndicator is set to true or false.
     * <p>
     * <p>
     * <b>Possible Values: </b><br>
     * <code><li>True</code><br>
     * The participant has been marked for deletion. <code><li>False</code> The participant has not been
     * marked for deletion.<br>
     * <p>
     * 
     * @return the current value of <code>deleteIndicator</code> property.<br>
     */
    public boolean isDeleteIndicator() {
        return this.deleteIndicator;
    }

    /**
     * Sets the <code>accountCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * I
     * <p>
     * 
     * @param pAccountCode the new value of <code>accountCode</code> property.<br>
     */
    public void setAccountCode(final String pAccountCode) {
        this.accountCode = pAccountCode;
    }

    /**
     * Sets the <code>accountNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <p>
     * <b>Example: </b><br>
     * 1111234
     * <p>
     * 
     * @param pAccountNumber the new value of <code>accountNumber</code> of the participant.<br>
     */
    public void setAccountNumber(final String pAccountNumber) {
        this.accountNumber = pAccountNumber;
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
     * @param pAddress the new value of <code>address</code> of the participant.<br>
     */
    public void setAddress(final String pAddress) {
        this.address = pAddress;
    }

    /**
     * Sets the <code>billingAccount1</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces.
     * <p>
     * <b>Example: </b><br>
     * BEAC0001
     * <p>
     * 
     * @param pBillingAccount1 Contains the new value of the <code>billingAccount1</code> property.
     */
    public void setBillingAccount1(final String pBillingAccount1) {
        this.billingAccount1 = pBillingAccount1;
    }

    /**
     * Sets the <code>billingAccount2</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces.
     * <p>
     * <b>Example: </b><br>
     * BEAC0001
     * <p>
     * 
     * @param pBillingAccount2 Contains the new value of the <code>billingAccount2</code> property.
     */
    public void setBillingAccount2(final String pBillingAccount2) {
        this.billingAccount2 = pBillingAccount2;
    }

    /**
     * Sets the <code>city</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-17 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * MINNEAPOLIS
     * <p>
     * 
     * @param pCity the new value of <code>city</code> of the participant.<br>
     */
    public void setCity(final String pCity) {
        this.city = pCity;
    }

    /**
     * Sets the <code>contractAllowed</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <ul>
     * <li>true - if contract is allowed for the participant
     * <li>false - otherwise
     * </ul>
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pContractAllowed the new value of <code>contractAllowed</code> of participant.<br>
     */
    public void setContractAllowed(final boolean pContractAllowed) {
        this.contractAllowed = pContractAllowed;
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
     * @param pCountry the new value of <code>country</code> of the participant.<br>
     */
    public void setCountry(final String pCountry) {
        this.country = pCountry;
    }

    /**
     * Sets the <code>deleteIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code><li>True</code><br>
     * The partcipant has been marked for deletion. <code><li>False</code><br>
     * The partcipant has not been marked for deletion.<br>
     * 
     * @param pDeleteIndicator the new value of <code>deleteIndicator</code> property.<br>
     */
    public void setDeleteIndicator(final boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the <code>displayCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pDisplayCount the new value of <code>displayCount</code> property.<br>
     */
    public void setDisplayCount(final Integer pDisplayCount) {
        this.displayCount = pDisplayCount;
    }

    /**
     * Sets the <code>fetchedCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pFetchedCount holds the new value of <code>fetchedCount</code> property.<br>
     */
    public void setFetchedCount(final Integer pFetchedCount) {
        this.fetchedCount = pFetchedCount;
    }

    /**
     * Sets the <code>freightOId</code> property.
     * <p>
     * 
     * @param pFreightOId holds the new value of <code>freightOId</code> property.<br>
     */
    public void setFreightOId(final Long pFreightOId) {
        this.freightOId = pFreightOId;
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
     * @param pName holds the new value of the <code>name</code> of the participant.<br>
     */
    public void setName(final String pName) {
        this.name = pName;
    }

    /**
     * Sets the <code>nameType</code> property.
     * <p>
     * 
     * @param pNameType holds the new value of the <code>nameType</code> property.<br>
     */
    public void setNameType(final ParticipantNameSearchType pNameType) {
        this.nameType = pNameType;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId holds the new value of the <code>oId</code> of the participant.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>pageSize</code> property.
     * <p>
     * 
     * @param pPageSize holds the new value of the <code>pageSize</code> property.<br>
     */
    public void setPageSize(final Integer pPageSize) {
        this.pageSize = pPageSize;
    }

    /**
     * Sets the value of <code>postalCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <b>Example: </b><br>
     * 112012
     * <p>
     * 
     * @param pPostalCode <code>String</code><br>
     *            the new value of <code>postalCode</code> property.<br>
     */
    public void setPostalCode(final String pPostalCode) {
        this.postalCode = pPostalCode;
    }

    /**
     * Sets the <code>role</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * S-Shipper<br>
     * C-Consignee<br>
     * B-Broker<br>
     * A-IATA Agent
     * <p>
     * 
     * @param pRole holds the new value of the <code>role</code> of the participant.<br>
     */
    public void setRole(final String pRole) {
        this.role = pRole;
    }

    /**
     * Sets the <code>searchString</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphanumeric <br>
     * <p>
     * <b>Example: </b><br>
     * UN
     * <p>
     * 
     * @param pSearchString holds the new value of the <code>searchString</code> property.<br>
     */
    public void setSearchString(final String pSearchString) {
        this.searchString = pSearchString;
    }

    /**
     * Sets the <code>securityInfo1.</code>
     * <p>
     * <b>Format: </b><br>
     * 1-4 alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * POBC
     * <p>
     * 
     * @param pSecurityInfo1 holds the new value of the <code>securityInfo1</code> property.<br>
     */
    public void setSecurityInfo1(final String pSecurityInfo1) {
        this.securityInfo1 = pSecurityInfo1;
    }

    /**
     * Sets the <code>securityInfo2.</code>
     * <p>
     * <b>Format: </b><br>
     * 1-16 Any Character<br>
     * <p>
     * <b>Example: </b><br>
     * POB123
     * <p>
     * 
     * @param pSecurityInfo2 holds the new value of the <code>securityInfo1</code> property.<br>
     */
    public void setSecurityInfo2(final String pSecurityInfo2) {
        this.securityInfo2 = pSecurityInfo2;
    }

    /**
     * Sets the <code>startIndex</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 0
     * <p>
     * 
     * @param pStartIndex holds the new value of the <code>startIndex</code> property.<br>
     */
    public void setStartIndex(final Integer pStartIndex) {
        this.startIndex = pStartIndex;
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
     * @param pState holds the new value of the <code>state</code> of the participant.<br>
     */
    public void setState(final String pState) {
        this.state = pState;
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
     * @param pStationCode holds the new value of the <code>stationCode</code> of the participant.<br>
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = pStationCode;
    }

    /**
     * Sets the <code>totalCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pTotalCount holds the new value of the <code>totalCount</code> property.<br>
     */
    public void setTotalCount(final Integer pTotalCount) {
        this.totalCount = pTotalCount;
    }

    /**
     * Sets the <code>type</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * M - Master air waybill recurring<br>
     * O - Master air waybill one-time<br>
     * H - House air waybill recurring<br>
     * U - House air waybill one-time<br>
     * B - Master and House air waybill recurring
     * <p>
     * 
     * @param pType holds the new value of <code>type</code> of participant<br>
     */
    public void setType(final String pType) {
        this.type = pType;
    }
	public String getVatNumber() {
		return vatNumber;
	}
	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}
    
    
}
