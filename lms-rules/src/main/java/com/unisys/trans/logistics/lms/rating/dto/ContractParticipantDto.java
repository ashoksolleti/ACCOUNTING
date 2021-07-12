/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.ContactDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantAccountType;

/**
 * <code>ContractParticipantDto</code> contains contract participant details.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>accountNumber
 * <li>accountNumberType
 * <li>contactInformation
 * <li>participantGroupIndicator
 * <li>primaryParticipant
 * <li>responsibleParty
 * <li>shipper
 * <li>consigee
 * <li>forwarder
 * <li>agent
 * <li>billToConsigee
 * <li>billToShipper
 * <li>oId
 * </ul>
 * </code>
 */
public class ContractParticipantDto extends PersistenceObjectDto {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 7285879742340872473L;

	/**
	 * Attribute to hold <code>accountNumber</code> property.
	 */
	private String accountNumber;

	/**
	 * Attribute to hold <code>accountNumberType</code> property.
	 */
	private ParticipantAccountType accountNumberType;

	/**
	 * Attribute to hold <code>agent</code> property.
	 */
	private boolean agent;

	/**
	 * Attribute to hold <code>billToConsigee</code> property.
	 */
	private boolean billToConsigee;

	/**
	 * Attribute to hold <code>billToShipper</code> property.
	 */
	private boolean billToShipper;

	/**
	 * Attribute to hold <code>consigee</code> property.
	 */
	private boolean consigee;

	/**
	 * Attribute to hold <code>contactInformation</code> property.
	 */
	private ContactDto contactInformation;
	/**
	 * Attribute to hold <code>allParticipantsIndicator</code> property.
	 */

	private boolean allParticipantsIndicator;
	/**
	 * Attribute to hold <code>contractParticipantType</code> property.
	 */
	private String contractParticipantType;

	/**
	 * Attribute to hold <code>forwarder</code> property.
	 */
	private boolean forwarder;

	/**
	 * Attribute to hold <code>oId</code> property.
	 */
	private Long oId;

	/**
	 * Attribute to hold <code>participantGroupIndicator</code> property.
	 */
	private boolean participantGroupIndicator;

	/**
	 * Attribute to hold <code>primaryParticipant</code> property.
	 */
	private boolean primaryParticipant;

	/**
	 * Attribute to hold <code>responsibleParty</code> property.
	 */
	private boolean responsibleParty;

	/**
	 * Attribute to hold <code>shipper</code> property.
	 */
	private boolean shipper;

	/**
	 * Gets the <code>AccountNumber</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-14 Alphanumeric Characters
	 * <p>
	 * <b>Example: </b><br>
	 * FGRT31
	 * <p>
	 * 
	 * @return the current value of the <code>AccountNumber</code> property.
	 */

	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Gets the <code>AccountNumberType</code> property.
	 * <p>
	 * Indicator that denotes the ParticipantAccountType.
	 * <p>
	 * <b> Possible values :</b><br>
	 * <li>I- IATA_ACCOUNT
	 * <li>B- BILLING_ACCOUNT
	 * <p>
	 * <b>Format: </b><br>
	 * 1 Alphabet<br>
	 * <p>
	 * <b>Example: </b><br>
	 * I- IATA_ACCOUNT<br>
	 * <p>
	 * 
	 * @return the current value of <code>AccountNumberType</code> property.<br>
	 */
	public ParticipantAccountType getAccountNumberType() {
		return accountNumberType;
	}

	/**
	 * Gets the <code>allParticipantsIndicator</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @return the current value of the <code>allParticipantsIndicator</code>
	 *         property.
	 */
	public boolean getAllParticipantsIndicator() {
		return this.allParticipantsIndicator;
	}

	/**
	 * Sets the <code>allParticipantsIndicator</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param pAllParticipantsIndicator
	 *            the current value of the <code>allParticipantsIndicator</code>
	 *            property.
	 */
	public void setAllParticipantsIndicator(
			final boolean pAllParticipantsIndicator) {
		this.allParticipantsIndicator = pAllParticipantsIndicator;
	}

	/**
	 * Gets the <code>Agent</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @return the current value of the <code>Agent</code> property.
	 */

	public boolean getAgent() {
		return agent;
	}

	/**
	 * Gets the <code>BillToConsigee</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @return the current value of the <code>BillToConsigee</code> property.
	 */
	public boolean getBillToConsigee() {
		return billToConsigee;
	}

	/**
	 * Gets the <code>BillToShipper</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @return the current value of the <code>BillToShipper</code> property.
	 */

	public boolean getBillToShipper() {
		return billToShipper;
	}

	/**
	 * Gets the <code>Consigee</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @return the current value of the <code>Consigee</code> property.
	 */
	public boolean getConsigee() {
		return consigee;
	}

	/**
	 * Gets the <code>ContactDto </code> data transfer object.
	 * <p>
	 * 
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto
	 *         ContactDto}</code><br>
	 *         the current value of <code>ContactDto</code> data transfer
	 *         object.<br>
	 */

	public ContactDto getContactInformation() {
		return contactInformation;
	}

	/**
	 * Gets the <code>contractParticipantType</code> property.
	 * <p>
	 * 
	 * @return the current value of <code>contractParticipantType</code>
	 *         details.
	 */
	public String getContractParticipantType() {
		return this.contractParticipantType;
	}

	/**
	 * Gets the <code>Forwarder</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @return the current value of the <code>Forwarder</code> property.
	 */

	public boolean getForwarder() {
		return forwarder;
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
	 * Gets the <code>ParticipantGroupIndicato</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @return the current value of the <code>ParticipantGroupIndicato</code>
	 *         property.
	 */

	public boolean getParticipantGroupIndicator() {
		return this.participantGroupIndicator;
	}

	/**
	 * Gets the <code>primaryParticipant</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @return the current value of the <code>primaryParticipant</code>
	 *         property.
	 */
	public boolean getPrimaryParticipant() {
		return this.primaryParticipant;
	}

	/**
	 * Gets the <code>ResponsibleParty</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @return the current value of the <code>ResponsibleParty</code> property.
	 */
	public boolean getResponsibleParty() {
		return responsibleParty;
	}

	/**
	 * Gets the <code>Shipper</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @return the current value of the <code>Shipper</code> property.
	 */
	public boolean getShipper() {
		return shipper;
	}

	/**
	 * Sets the <code>AccountNumber</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-14 Alphanumeric Characters
	 * <p>
	 * <b>Example: </b><br>
	 * FGRT31
	 * <p>
	 * 
	 * @param pAccountNumber
	 *            the current value of the <code>AccountNumber</code> property.
	 */

	public void setAccountNumber(final String pAccountNumber) {
		this.accountNumber = ContractUtility.convertToUpperCase(pAccountNumber);
	}
	
	/**
    * Sets the <code>AccountNumber</code> property.
    * <p>
    * <b>Format: </b><br>
    * 1-14 Alphanumeric Characters
    * <p>
    * <b>Example: </b><br>
    * FGRT31
    * <p>
    * 
    * @param pAccountNumber
    *            the current value of the <code>AccountNumber</code> property.
    */
	public void editAccountNumber(final String pAccountNumber){
	    this.accountNumber=pAccountNumber;
	}

	/**
	 * Sets the <code>AccountNumberType</code> property.
	 * <p>
	 * Indicator that denotes the AccountNumberType.
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
	 * @param pAccountNumberType
	 *            <code>{@link ParticipantAccountType}</code> holds the new
	 *            value of <code>AccountNumberType </code> type details. <br>
	 */

	public void setAccountNumberType(
			final ParticipantAccountType pAccountNumberType) {
		this.accountNumberType = pAccountNumberType;
	}

	/**
	 * Sets the <code>Agent</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param pAgent
	 *            the current value of the <code>Agent</code> property.
	 */
	public void setAgent(final boolean pAgent) {
		this.agent = pAgent;
	}

	/**
	 * Sets the <code>BillToConsigee</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param pBillToConsigee
	 *            the current value of the <code>BillToConsigee</code> property.
	 */
	public void setBillToConsigee(final boolean pBillToConsigee) {
		this.billToConsigee = pBillToConsigee;
	}

	/**
	 * Sets the <code>BillToShipper</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param pBillToShipper
	 *            the current value of the <code>BillToShipper</code> property.
	 */
	public void setBillToShipper(final boolean pBillToShipper) {
		this.billToShipper = pBillToShipper;
	}

	/**
	 * Sets the <code>Consigee</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param pConsigee
	 *            the current value of the <code>Consigee</code> property.
	 */
	public void setConsigee(final boolean pConsigee) {
		this.consigee = pConsigee;
	}

	/**
	 * Sets the <code>ContactInformation</code> data transfer object.
	 * <p>
	 * 
	 * @param pContactInformation
	 *            holds the new value of <code>ContactInformation</code> data
	 *            transfer object.<br>
	 */
	public void setContactInformation(final ContactDto pContactInformation) {
		this.contactInformation = pContactInformation;
	}

	/**
	 * Sets the <code>contractParticipantType</code> property.
	 * <p>
	 * 
	 * @param pContractParticipantType
	 *            holds the new value of <code>contractParticipantType</code>
	 *            type details.<br>
	 */

	public void setContractParticipantType(final String pContractParticipantType) {
		this.contractParticipantType = pContractParticipantType;
	}

	/**
	 * Sets the <code>Forwarder</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param pForwarder
	 *            the current value of the <code>Forwarder</code> property.
	 */

	public void setForwarder(final boolean pForwarder) {
		this.forwarder = pForwarder;
	}

	/**
	 * Sets the <code>oId</code> property.
	 * <p>
	 * 
	 * @param pOId
	 *            the new value of the <code>oId</code> property.
	 */
	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

	/**
	 * Sets the <code>ParticipantGroupIndicator</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param pParticipantGroupIndicator
	 *            the current value of the
	 *            <code>ParticipantGroupIndicator</code> property.
	 */

	public void setParticipantGroupIndicator(
			final boolean pParticipantGroupIndicator) {
		this.participantGroupIndicator = pParticipantGroupIndicator;
	}

	/**
	 * Sets the <code>primaryParticipant</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param pPrimaryParticipant
	 *            the current value of the <code>primaryParticipant</code>
	 *            property.
	 */
	public void setPrimaryParticipant(final boolean pPrimaryParticipant) {
		this.primaryParticipant = pPrimaryParticipant;
	}

	/**
	 * Sets the <code>ResponsibleParty</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param pResponsibleParty
	 *            the current value of the <code>ResponsibleParty</code>
	 *            property.
	 */
	public void setResponsibleParty(final boolean pResponsibleParty) {
		this.responsibleParty = pResponsibleParty;
	}

	/**
	 * Sets the <code>Shipper</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param pShipper
	 *            the current value of the <code>Shipper</code> property.
	 */
	public void setShipper(final boolean pShipper) {
		this.shipper = pShipper;
	}

}
