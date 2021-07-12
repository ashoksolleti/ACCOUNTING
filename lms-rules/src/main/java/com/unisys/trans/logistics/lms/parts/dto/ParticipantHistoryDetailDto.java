/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ParticipantDto</code> contains general participant details.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * 
 * </ul>
 * </code>
 */
public class ParticipantHistoryDetailDto extends PersistenceObjectDto {

	/**
     * 
     */
	private static final long serialVersionUID = -2142059288897066472L;
	   /**
     * Attribute to hold <code>deleteRemarks</code> property. These remarks are to be given when the
     * participant is to be deleted.
     */
    private String deleteRemarks;
	/**
	 * Attribute to hold <code>name</code> property.
	 */
	private String name;
	/**
	 * Attribute to hold <code>fax</code> property.
	 */
	private String fax;

	/**
	 * Attribute to hold <code>oId</code> property.
	 */
	private Long oId;
	/**
	 * Attribute to hold <code>notifyMethod</code> property. Method of
	 * notification. Prohibited if NotificationStatusCode field is blank;
	 * mandatory if Notify field is non blank.
	 */
	private String notifyMethod;

	/**
	 * Attribute to hold <code>stationCode</code> property.
	 */
	private String stationCode;

	/**
	 * Attribute to hold <code>address</code> property.
	 */
	private String address;

	/**
	 * Attribute to hold <code>city</code> property.
	 */
	private String city;
	/**
	 * Attribute to hold <code>type</code> property.
	 */
	private String accounType;

	/**
	 * Attribute to hold <code>type</code> property.
	 */
	private String incsrType;

	/**
	 * Attribute to hold <code>incsrAccountNumber</code> property. It denotes
	 * the type of account.
	 */
	private String incsrAccountNumber;

	/**
	 * Attribute to hold <code>incsrAccountNumber</code> property. It denotes
	 * the type of account.
	 */
	private String bairroAccountNumber;

	/**
	 * Attribute to hold <code>billingAccountType1</code> property. It denotes
	 * the type of account.
	 */
	private String cgcAccountNumber;

	/**
	 * Attribute to hold <code>billingAccountType1</code> property. It denotes
	 * the type of account.
	 */
	private String cpfAccountNumber;
	
	/**
	 * Attribute to hold <code>participantTipo</code> property. It denotes
	 * the type of account.
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
	 * @param incsrType4 the incsrType4 to set
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

	/**
	 * @return the accounType
	 */
	public String getAccounType() {
		return this.accounType;
	}

	/**
	 * @param pAccounType
	 *            the accounType to set
	 */
	public void setAccounType(String pAccounType) {
		this.accounType = pAccounType;
	}

	/**
	 * @return the incsrType
	 */
	public String getIncsrType() {
		return this.incsrType;
	}

	/**
	 * @param pIncsrType
	 *            the incsrType to set
	 */
	public void setIncsrType(String pIncsrType) {
		this.incsrType = pIncsrType;
	}

	/**
	 * @return the incsrAccountNumber
	 */
	public String getIncsrAccountNumber() {
		return this.incsrAccountNumber;
	}

	/**
	 * @param pIncsrAccountNumber
	 *            the incsrAccountNumber to set
	 */
	public void setIncsrAccountNumber(String pIncsrAccountNumber) {
		this.incsrAccountNumber = pIncsrAccountNumber;
	}

	/**
	 * @return the bairroAccountNumber
	 */
	public String getBairroAccountNumber() {
		return this.bairroAccountNumber;
	}

	/**
	 * @param pBairroAccountNumber
	 *            the bairroAccountNumber to set
	 */
	public void setBairroAccountNumber(String pBairroAccountNumber) {
		this.bairroAccountNumber = pBairroAccountNumber;
	}

	/**
	 * @return the cgcAccountNumber
	 */
	public String getCgcAccountNumber() {
		return this.cgcAccountNumber;
	}

	/**
	 * @param pCgcAccountNumber
	 *            the cgcAccountNumber to set
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
	 * @param pCpfAccountNumber
	 *            the cpfAccountNumber to set
	 */
	public void setCpfAccountNumber(String pCpfAccountNumber) {
		this.cpfAccountNumber = pCpfAccountNumber;
	}

	private List<ParticipantAliasDto> participantAliasDtos = new ArrayList<ParticipantAliasDto>();

	/**
	 * Gets the <code>notifyMethod</code> property.
	 * <p>
	 * <b> Possible values :</b><br>
	 * <li>F – Fax
	 * <li>M – Mail
	 * <li>T – Telephone
	 * <li>X – Cargo interchange
	 * <p>
	 * <b>Format: </b><br>
	 * 1 Alphabet<br>
	 * <p>
	 * <b>Example: </b><br>
	 * F – Fax
	 * <p>
	 * 
	 * @return the current value of <code>notifyMethod</code> property.
	 */
	public String getNotifyMethod() {
		return this.notifyMethod;
	}

	/**
	 * Sets the <code>notifyMethod</code> property.
	 * <p>
	 * <b> Possible values :</b><br>
	 * <li>F – Fax
	 * <li>M – Mail
	 * <li>T – Telephone
	 * <li>X – Cargo interchange
	 * <p>
	 * <b>Format: </b><br>
	 * 1 alphabet<br>
	 * <p>
	 * <b>Example: </b><br>
	 * F – Fax
	 * <p>
	 * 
	 * @param pNotifyMethod
	 *            the new value of <code>notifyMethod</code> property.
	 */
	public void setNotifyMethod(final String pNotifyMethod) {
		this.notifyMethod = ContractUtility.convertToUpperCase(pNotifyMethod);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param pName
	 *            the name to set
	 */
	public void setName(String pName) {
		this.name = pName;
	}

	/**
	 * @param pOId
	 *            the oId to set
	 */
	public void setoId(Long pOId) {
		this.oId = pOId;
	}

	/**
	 * @return the stationCode
	 */
	public String getStationCode() {
		return this.stationCode;
	}

	/**
	 * @param pStationCode
	 *            the stationCode to set
	 */
	public void setStationCode(String pStationCode) {
		this.stationCode = pStationCode;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * @param pAddress
	 *            the address to set
	 */
	public void setAddress(String pAddress) {
		this.address = pAddress;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return this.city;
	}

	/**
	 * @param pCity
	 *            the city to set
	 */
	public void setCity(String pCity) {
		this.city = pCity;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * @param pState
	 *            the state to set
	 */
	public void setState(String pState) {
		this.state = pState;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return this.postalCode;
	}

	/**
	 * @param pPostalCode
	 *            the postalCode to set
	 */
	public void setPostalCode(String pPostalCode) {
		this.postalCode = pPostalCode;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return this.countryCode;
	}

	/**
	 * @param pCountryCode
	 *            the countryCode to set
	 */
	public void setCountryCode(String pCountryCode) {
		this.countryCode = pCountryCode;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 * @param pPhone
	 *            the phone to set
	 */
	public void setPhone(String pPhone) {
		this.phone = pPhone;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * @param pType
	 *            the type to set
	 */
	public void setType(String pType) {
		this.type = pType;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * @param pEmail
	 *            the email to set
	 */
	public void setEmail(String pEmail) {
		this.email = pEmail;
	}

	/**
	 * @return the notificationStatusCode
	 */
	public String getNotificationStatusCode() {
		return this.notificationStatusCode;
	}

	/**
	 * @param pNotificationStatusCode
	 *            the notificationStatusCode to set
	 */
	public void setNotificationStatusCode(String pNotificationStatusCode) {
		this.notificationStatusCode = pNotificationStatusCode;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return this.language;
	}

	/**
	 * @param pLanguage
	 *            the language to set
	 */
	public void setLanguage(String pLanguage) {
		this.language = pLanguage;
	}

	/**
	 * Attribute to hold <code>state</code> property.
	 */
	private String state;

	/**
	 * Attribute to hold <code>postalCode</code> property.
	 */
	private String postalCode;

	/**
	 * Attribute to hold <code>countryCode</code> property.
	 */
	private String countryCode;

	/**
	 * Attribute to hold <code>phone</code> property.
	 */
	private String phone;

	/**
	 * Attribute to hold <code>type</code> property.
	 */
	private String type;

	/**
	 * Attribute to hold <code>email</code> property.
	 * <ul>
	 * <li>For recurring participant, this field is available for updates. <br>
	 * <li>For one-time participant, this field is prohibited. (Information is
	 * captured along with one-time
	 * </ul>
	 * participant creation during participant capture through Air Waybill
	 * Information, Booking Information functions.)
	 */
	private String email;

	/**
	 * Attribute to hold <code>notificationStatusCode</code> property. It holds
	 * the notification information when the participant is the consignee for a
	 * shipment that arrived at its destination. This is used when a participant
	 * is associated with Air Waybill in the form of a Consignee or Broker.
	 */
	private String notificationStatusCode;

	/**
	 * Attribute to hold <code>language</code> property.
	 */
	private String language;

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return this.oId;
	}

	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * @param fax
	 *            the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * @return the participantAliasDtos
	 */
	public List<ParticipantAliasDto> getParticipantAliasDtos() {
		return participantAliasDtos;
	}

	/**
	 * @param participantAliasDtos
	 *            the participantAliasDtos to set
	 */
	public void setParticipantAliasDtos(
			List<ParticipantAliasDto> participantAliasDtos) {
		this.participantAliasDtos = participantAliasDtos;
	}

	private String shortName;

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

    public String getDeleteRemarks() {
        return deleteRemarks;
    }

    public void setDeleteRemarks(String deleteRemarks) {
        this.deleteRemarks = deleteRemarks;
    }

	/**
	 * @return the participantTipo
	 */
	public String getParticipantTipo() {
		return this.participantTipo;
	}

	/**
	 * @param pParticipantTipo the participantTipo to set
	 */
	public void setParticipantTipo(final String pParticipantTipo) {
		this.participantTipo = pParticipantTipo;
	}

}
