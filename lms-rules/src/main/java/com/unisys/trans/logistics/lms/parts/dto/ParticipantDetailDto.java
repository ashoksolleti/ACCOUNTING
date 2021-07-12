/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import java.util.Date;
import java.util.Objects;

import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantAccountType;

/**
 * <code>ParticipantDetailDto</code> contains participant details. Participant account type represents whether
 * participant account number is a billing account number or an IATA agent account number.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>accountNumber
 * <li>participantAccountType
 * <li>address
 * <li>city
 * <li>countryCode
 * <li>deleteIndicator
 * <li>name
 * <li>oId
 * <li>postalCode
 * <li>state
 * <li>stationCode
 * </ul>
 * </code>
 */
public class ParticipantDetailDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2731217646449090778L;

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
     * Attribute to hold <code>billingAccount1</code> property.
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
     * Attribute to hold <code>countryCode</code> property.
     */
    private String countryCode;

    /**
     * Attribute to hold <code>deleteIndicator</code> property.
     */
    private boolean deleteIndicator;

    /**
     * Attribute to hold <code>memberHardDeleteIndicator</code> property.
     */
    private boolean memberHardDeleteIndicator;

    /**
     * Attribute to hold <code>name</code> property.
     */
    private String name;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;
    /**
     * Attribute to hold <code>iataAccountNumber</code> property. Only users with a special privilege can
     * update this field.
     */
    private String iataAccountNumber;

    /**
     * Attribute to hold <code>participantAccountType</code> property.
     */
    private ParticipantAccountType participantAccountType;

    /**
     * Attribute to hold <code>postalCode</code> property.
     */
    private String postalCode;

    /**
     * Attribute to hold <code>state</code> property.
     */
    private String state;

    /**
     * Attribute to hold <code>stationCode</code> property.
     */
    private String stationCode;
    
	/**
     * Attribute to hold <code>specificAirline</code> property.
     */
    private String specificAirline;
    
    private String vatNumber;
    
    /**
     * Attribute to hold <code>effectivePeriod</code> property.
     */
    private DateRangeDto effectivePeriod;
    
    
    private String billingAccountCode1;
    
    public String getBillingAccountCode1() {
		return billingAccountCode1;
	}

	public void setBillingAccountCode1(String billingAccountCode1) {
		this.billingAccountCode1 = billingAccountCode1;
	}

	/**
     * @return the effectivePeriod
     */
    public DateRangeDto getEffectivePeriod() {
        if(this.effectivePeriod == null){
            this.effectivePeriod = new DateRangeDto();
        }
        return this.effectivePeriod;
    }

    /**
     * @param pEffectivePeriod the effectivePeriod to set
     */
    public void setEffectivePeriod(final DateRangeDto pEffectivePeriod) {
        this.effectivePeriod = pEffectivePeriod;
    }

    /**
     * Default constructor.
     */
    public ParticipantDetailDto() {

    }

    /**
     * <code>Parameterized constructor.</code>
     * <p>
     * 
     * @param pAccountNumber holds the account number of participant.
     * @param pBillingAccount1 holds the billing account number1 of the participant.
     * @param pBillingAccount2 holds the billing account number2 of the participant.
     */
    public ParticipantDetailDto(final String pAccountNumber,
                final String pBillingAccount1, final String pBillingAccount2) {
        this.accountNumber = pAccountNumber;
        this.billingAccount1 = pBillingAccount1;
        this.billingAccount2 = pBillingAccount2;
    }

    /**
     * <code>Parameterized constructor.</code>
     * <p>
     * 
     * @param pCity holds the city of participant
     * @param pState holds the state of participant
     * @param pPostalCode holds the postal code of participant
     * @param pCountry holds the country of participant
     */
    public ParticipantDetailDto(final String pCity, final String pState, final String pPostalCode,
                final String pCountry) {

        this.postalCode = pPostalCode;
        this.city = pCity;
        this.state = pState;
        this.countryCode = pCountry;
    }

    /**
     * <code>Parameterized constructor.</code>
     * <p>
     * 
     * @param pBillingNumber holds the billing number
     * @param pFrieghtCode holds the frieght code
     * @param pParticipantName holds the participant name
     * @param pAddress holds the address of the participant
     * @param pCity holds the city of the participant
     * @param pState holds the state of the participant
     * @param pCountry holds the country of the participant
     * @param pPostalCode holds the postal code of the participant
     * @param pStation holds the station of the participant
     */
    public ParticipantDetailDto(final String pBillingNumber, final String pFrieghtCode,
                final String pParticipantName, final String billingAccountCode1, final String pAddress, final String pCity,
                final String pCountry, final String pState, final String pPostalCode, final String pStation, final String pSpecificAirline) {

        /*if (pBillingNumber == null) {

            this.accountNumber = pFrieghtCode;
            this.participantAccountType = ParticipantAccountType.IATA_ACCOUNT;

        }
        else {

            this.accountNumber = pBillingNumber;
            this.participantAccountType = ParticipantAccountType.BILLING_ACCOUNT;
        }*/
        
        if(pBillingNumber!=null && null == pFrieghtCode )
        {
	        this.accountNumber = pBillingNumber;
	        this.participantAccountType = ParticipantAccountType.BILLING_ACCOUNT;
        }
        else
        {
        	this.accountNumber = pBillingNumber;
            this.iataAccountNumber = pFrieghtCode;
            this.participantAccountType = ParticipantAccountType.IATA_ACCOUNT;
            
        }
        this.iataAccountNumber=pFrieghtCode;
        this.name = pParticipantName;
        this.billingAccountCode1 = billingAccountCode1;
        this.address = pAddress;
        this.city = pCity;
        this.state = pState;
        this.countryCode = pCountry;
        this.postalCode = pPostalCode;
        this.stationCode = pStation;
        this.specificAirline = pSpecificAirline;
    }
    
    
    
    public ParticipantDetailDto(final String pBillingNumber, final String pFrieghtCode,
            final String pParticipantName, final String pAddress, final String pCity,
            final String pCountry, final String pState, final String pPostalCode, final String pStation, final String pSpecificAirline) {

    /*if (pBillingNumber == null) {

        this.accountNumber = pFrieghtCode;
        this.participantAccountType = ParticipantAccountType.IATA_ACCOUNT;

    }
    else {

        this.accountNumber = pBillingNumber;
        this.participantAccountType = ParticipantAccountType.BILLING_ACCOUNT;
    }*/
    
    if(pBillingNumber!=null)
    {
    this.accountNumber = pBillingNumber;
    this.participantAccountType = ParticipantAccountType.BILLING_ACCOUNT;
    }
    else
    {
        this.iataAccountNumber = pFrieghtCode;
        this.participantAccountType = ParticipantAccountType.IATA_ACCOUNT;
        
    }
    this.iataAccountNumber=pFrieghtCode;
    this.name = pParticipantName;
    this.address = pAddress;
    this.city = pCity;
    this.state = pState;
    this.countryCode = pCountry;
    this.postalCode = pPostalCode;
    this.stationCode = pStation;
    this.specificAirline = pSpecificAirline;
}
    
    
    
    /**
     * <code>Parameterized constructor.</code>
     * <p>
     * 
     * @param pBillingNumber holds the billing number
     * @param pFrieghtCode holds the freight code
     * @param pParticipantName holds the participant name
     * @param pAddress holds the address of the participant
     * @param pCity holds the city of the participant
     * @param pState holds the state of the participant
     * @param pCountry holds the country of the participant
     * @param pPostalCode holds the postal code of the participant
     * @param pStation holds the station of the participant
     * @param pSpecificAirline holds the Specific Airline code of the participant
     * @param pEffectiveDate holds the effective date of the participant in a Group
     * @param pExpirationDate holds the expiration date of the participant in a Group
     */
    public ParticipantDetailDto(final String pBillingNumber, final String pFrieghtCode,
                final String pParticipantName, final String pAddress, final String pCity,
                final String pCountry, final String pState, final String pPostalCode, final String pStation, 
                final String pSpecificAirline, final Date pEffectiveDate,final Date pExpirationDate) {
        this(pBillingNumber, pFrieghtCode, pParticipantName, pAddress, pCity, 
            pCountry, pState, pPostalCode, pStation, pSpecificAirline);
        this.setEffectivePeriod(new DateRangeDto());
        this.getEffectivePeriod().setEffectiveDate(pEffectiveDate);
        this.getEffectivePeriod().setExpirationDate(pExpirationDate);
    }

    /**
     * Gets the <code>accountNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces
     * <p>
     * <b>Example: </b><br>
     * BEAC0001
     * <p>
     * 
     * @return the new value of the <code>accountNumber</code> of the participant.<br>
     */
    public String getAccountNumber() {

        return this.accountNumber;
    }
    
    /**
     * Gets the <code>anyOfTheAccountNumbers</code> property.
     * 
     * @return any non empty Account number of the participant in following order.<br>
     * <li><code>accountNumber</code></li>
     * <li><code>billingAccount1</code></li>
     * <li><code>billingAccount2</code></li>
     * <li><code>iataAccountNumber</code></li>
     */
    public String getAnyAccountNumber() {
        String anyAccountNumber;
        if(this.accountNumber!=null && !this.accountNumber.isEmpty()){
            anyAccountNumber = this.accountNumber;
        }else if(this.billingAccount1!=null && !this.billingAccount1.isEmpty()){
            anyAccountNumber = this.billingAccount1;
        }else if(this.billingAccount2!=null && !this.billingAccount2.isEmpty()){
            anyAccountNumber = this.billingAccount2;
        }else if(this.iataAccountNumber!=null && !this.iataAccountNumber.isEmpty()){
            anyAccountNumber = this.iataAccountNumber;
        }else{
            anyAccountNumber = null;
        }
        return anyAccountNumber;
    }
    
    /**
     * Gets the <code>iataAccountNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2n-1n 4n/4n ,Character set for alphabet, number, hyphen, dot, slash and space<br>
     * <p>
     * <b>Example: </b><br>
     * 33-5 1595/1232
     * 
     * @return the current value of <code>iataAccountNumber</code> property.<br>
     */
    public String getIataAccountNumber() {
        return this.iataAccountNumber;
    }
    /**
     * Gets the <code>address</code> property.
     * <p>
     * Address of the participant.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces
     * <p>
     * <b>Example: </b><br>
     * POB 14000,POSTAL STN SAINT LAURENT
     * <p>
     * 
     * @return the new value of the <code>address</code> property.
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
     * 1-17 Alphanumeric, hyphen (-), and period (.) including spaces
     * <p>
     * <b>Example: </b><br>
     * EAGAN
     * <p>
     * 
     * @return the new value of the <code>city</code> property.
     */
    public String getCity() {

        return this.city;
    }

    /**
     * Gets the <code>contractAllowed</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li><code>true</code><br>
     * Contracts can be created for the participant.<br>
     * <li><code>false</code><br>
     * Contracts can not be created for the participant.<br>
     * </ul>
     * <p>
     * 
     * @return contractAllowed the new value of the <code>contractAllowed</code> property.
     */
    public boolean getContractAllowed() {
        return this.contractAllowed;
    }

    /**
     * Gets the <code>countryCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabet
     * <p>
     * <b>Example: </b><br>
     * US
     * <p>
     * 
     * @return the new value of the <code>countryCode</code> property.<br>
     */
    public String getCountryCode() {

        return this.countryCode;
    }

    /**
     * Gets the <code>deleteIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li><code>true</code><br>
     * The participant group has been marked for deletion.<br>
     * <li><code>false</code><br>
     * The participant group has not been marked for deletion.<br>
     * </ul>
     * <p>
     * 
     * @return the new value of the <code>deleteIndicator</code> property.
     */
    public boolean getDeleteIndicator() {

        return this.deleteIndicator;

    }
    /**
     * Gets the <code>memberHardDeleteIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li><code>true</code><br>
     * Delete this member from Participant Group<br>
     * <li><code>false</code>
     * </ul>
     * <p>
     * 
     * @return the new value of the <code>memberHardDeleteIndicator</code> property.
     */
    public boolean getMemberHardDeleteIndicator() {

        return this.memberHardDeleteIndicator;

    }
    /**
     * Gets the <code>name</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces
     * <p>
     * <b>Example: </b><br>
     * UNISYS
     * <p>
     * 
     * @return the new value of the <code>name</code> property.
     */
    public String getName() {

        return this.name;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the new value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {

        return this.oId;
    }

    /**
     * Gets the <code>participantAccountType</code> property.
     * <p>
     * 
     * @return the new value of the <code>participantAccountType</code> property.
     */
    public ParticipantAccountType getParticipantAccountType() {

        return this.participantAccountType;
    }

    /**
     * Gets the <code>postalCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric, hyphen (-), and period (.) including spaces
     * <p>
     * <b>Example: </b><br>
     * 55122
     * <p>
     * 
     * @return the new value of the <code>postalCode</code> property.
     */
    public String getPostalCode() {

        return this.postalCode;
    }

    /**
     * Gets the <code>state</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric, hyphen (-), and period (.) including spaces
     * <p>
     * <b>Example: </b><br>
     * MINNESOTA
     * <p>
     * 
     * @return the new value of the <code>state</code> property.
     */
    public String getState() {

        return this.state;

    }

    /**
     * Gets the <code>address</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * YYZ
     * <p>
     * 
     * @return the new value of the <code>address</code> property.
     */
    public String getStationCode() {

        return this.stationCode;
    }

    /**
     * Sets the <code>accountNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces.
     * <p>
     * <b>Example: </b><br>
     * BEAC0001
     * <p>
     * 
     * @param pAccountNumber Contains the new value of the <code>accountNumber</code> property.
     */
    public void setAccountNumber(final String pAccountNumber) {

        this.accountNumber = ContractUtility.convertToUpperCase(pAccountNumber);

    }
    /**
     * Sets the <code>iataAccountNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2n-1n 4n/4n ,Character set for alphabet, number, hyphen, dot, slash and space<br>
     * <p>
     * <b>Example: </b><br>
     * 33-5 1595/1232
     * <p>
     * 
     * @param pIataAccountNumber the new value of <code>iataAccountNumber</code> property.<br>
     */
    public void setIataAccountNumber(final String pIataAccountNumber) {
        this.iataAccountNumber = pIataAccountNumber;
    }

    /**
     * Sets the <code>address</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces.
     * <p>
     * <b>Example: </b><br>
     * POB 14000,POSTAL STN SAINT LAURENT
     * <p>
     * 
     * @param pAddress the new value of the <code>address</code> property.
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
        this.billingAccount1 = ContractUtility.convertToUpperCase(pBillingAccount1);
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
        this.billingAccount2 = ContractUtility.convertToUpperCase(pBillingAccount2);
    }

    /**
     * Sets the <code>city</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-17 Alphanumeric, hyphen (-), and period (.) including spaces.
     * <p>
     * <b>Example: </b><br>
     * EAGAN
     * <p>
     * 
     * @param pCity the new value of the <code>city</code> property.
     */
    public void setCity(final String pCity) {

        this.city = pCity;
    }

    /**
     * Sets the <code>contractAllowed</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li><code>true</code><br>
     * Contracts can be created for the participant.<br>
     * <li><code>false</code><br>
     * Contracts can not be created for the participant.<br>
     * </ul>
     * <p>
     * 
     * @param pContractAllowed the new value of the <code>contractAllowed</code> property.
     */
    public void setContractAllowed(final boolean pContractAllowed) {
        this.contractAllowed = pContractAllowed;
    }

    /**
     * Sets the <code>countryCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabet
     * <p>
     * <b>Example: </b><br>
     * US
     * <p>
     * 
     * @param pCountryCode the new value of the <code>countryCode</code> property.
     */
    public void setCountryCode(final String pCountryCode) {

        this.countryCode = ContractUtility.convertToUpperCase(pCountryCode);
    }

    /**
     * Sets the <code>deleteIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li><code>true</code><br>
     * The participant group has been marked for deletion.<br>
     * <li><code>false</code><br>
     * The participant group has not been marked for deletion.<br>
     * </ul>
     * <p>
     * 
     * @param pDeleteIndicator the new value of the <code>deleteIndicator</code> property.
     */
    public void setDeleteIndicator(final boolean pDeleteIndicator) {

        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the <code>memberHardDeleteIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li><code>true</code><br>
     * Delete this member from Participant Group<br>
     * <li><code>false</code>
     * </ul>
     * <p>
     * 
     * @param pMemberHardDeleteIndicator the new value of the 
     * <code>memberHardDeleteIndicator</code> property.
     */
    public void setMemberHardDeleteIndicator(final boolean pMemberHardDeleteIndicator) {

        this.memberHardDeleteIndicator = pMemberHardDeleteIndicator;
    }
    
    /**
     * Sets the <code>name</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces.
     * <p>
     * <b>Example: </b><br>
     * UNISYS
     * <p>
     * 
     * @param pName the new value of the <code>name</code> property.
     */
    public void setName(final String pName) {

        this.name = pName;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {

        this.oId = pOId;
    }

    /**
     * Sets the <code>participantAccountType</code> property.
     * <p>
     * 
     * @param pParticipantAccountType the new value of the <code>participantAccountType</code> property.
     */
    public void setParticipantAccountType(final ParticipantAccountType pParticipantAccountType) {

        this.participantAccountType = pParticipantAccountType;
    }

    /**
     * Sets the <code>postalCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric, hyphen (-), and period (.) including spaces.
     * <p>
     * <b>Example: </b><br>
     * 55122
     * <p>
     * 
     * @param pPostalCode the new value of <code>postalCode</code> property.
     */
    public void setPostalCode(final String pPostalCode) {

        this.postalCode = pPostalCode;
    }

    /**
     * Sets the <code>state</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric, hyphen (-), and period (.) including spaces.
     * <p>
     * <b>Example: </b><br>
     * MINNESOTA
     * <p>
     * 
     * @param pState the new value of <code>state</code> property.
     */
    public void setState(final String pState) {

        this.state = pState;
    }
    public String getSpecificAirline() {
		return specificAirline;
	}
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}

    /**
     * Sets the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * YYZ
     * <p>
     * 
     * @param pStationCode the new value of <code>stationCode</code> property.
     */
    public void setStationCode(final String pStationCode) {

        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);
    }

	public String getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}
    
	public boolean equals(final Object pObject){
	    boolean isEqual;
	    if(this == pObject){
	        isEqual = true;
	    }else if(pObject instanceof ParticipantDetailDto){
	        isEqual = this.equals((ParticipantDetailDto) pObject);
	    }else{
	        isEqual = false;
	    }
	    return isEqual;
	}
    
	public boolean equals(final ParticipantDetailDto pParticipantDetailDto){
        boolean isEqual;
        if(this == pParticipantDetailDto){
            isEqual = true;
        }else{
            isEqual = Objects.equals(this.getAnyAccountNumber(), 
                        pParticipantDetailDto.getAnyAccountNumber())
                        && Objects.equals(this.getEffectivePeriod(),
                            pParticipantDetailDto.getEffectivePeriod());
        }
        return isEqual;
    }
	
}