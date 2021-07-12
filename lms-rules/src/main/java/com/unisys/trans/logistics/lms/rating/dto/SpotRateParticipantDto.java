/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.ContactDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantAccountType;

/**
 * <code>SpotRateParticipantDto</code> contain details of SpotRateParticipant.
 * <p>
 * This contains all information about SpotRateParticipant.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>accountNumber
 * <li>accountNumberType
 * <li>contact
 * <li>deferParticipantInput
 * <li>oId
 * <li>participantGroupIndicator
 * <li>billingAccount1
 * <li>billingAccount2
 * <li>iataNumber
 * </ul>
 */

public class SpotRateParticipantDto extends PersistenceObjectDto {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 7611841395667179495L;

	/**
	 * Attribute to hold <code>accountNumber</code> property.
	 */
	private String accountNumber;

	/**
	 * Attribute to hold <code>accountNumberType</code> property.
	 */
	private ParticipantAccountType accountNumberType;

	/**
	 * Attribute to hold <code>contact</code> property.
	 */
	private ContactDto contact;

	/**
	 * Attribute to hold <code>deferParticipantInput</code> property.
	 */
	private boolean deferParticipantInput;

	/**
	 * Attribute to hold <code>oId</code> property.
	 */
	private Long oId;

	/**
	 * Attribute to hold <code>participantGroupIndicator</code> property.
	 */
	private boolean participantGroupIndicator;
	
	/**
	 * Attribute to hold <code>name</code> property.
	 */
	private String name;
	
	/**
	 * Attribute to hold <code>billingAccount1</code> property.
	 */
	private String billingAccount1;
	
	/**
	 * Attribute to hold <code>billingAccount2</code> property.
	 */
	private String billingAccount2;
	
	/**
	 * Attribute to hold <code>iataNumber</code> property.
	 */
	private String iataNumber;

	public String getName() {
		return name;
	}

	/**
	 * Gets the <code>accountNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>accountNumber</code> property.
	 */
	public String getAccountNumber() {
		return this.accountNumber;
	}

	/**
	 * Gets the <code>participantAccountType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>participantAccountType</code>
	 *         property.
	 */
	public ParticipantAccountType getAccountNumberType() {
		return this.accountNumberType;
	}

	/**
	 * Gets the <code>contact</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>contact</code> property.
	 */
	public ContactDto getContact() {
		if (this.contact == null) {
			this.contact = new ContactDto();
		}
		return this.contact;
	}

	/**
	 * Gets the <code>deferParticipantInput</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>deferParticipantInput</code>
	 *         property.
	 */
	public boolean getDeferParticipantInput() {
		return this.deferParticipantInput;
	}

	/**
	 * Gets the <code>oId</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>oId</code> property.
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
	 * Sets the <code>accountNumber</code> property.
	 * <p>
	 * 
	 * @param pAccountNumber
	 *            the current value of the <code>accountNumber</code> property.
	 */
	public void setAccountNumber(final String pAccountNumber) {
		this.accountNumber = ContractUtility.convertToUpperCase(pAccountNumber);
	}

	/**
	 * Sets the <code>ParticipantAccountType</code> property.
	 * <p>
	 * 
	 * @param pAccountNumberType
	 *            the current value of the <code>ParticipantAccountType</code>
	 *            property.
	 */
	public void setAccountNumberType(
			final ParticipantAccountType pAccountNumberType) {
		this.accountNumberType = pAccountNumberType;
	}

	/**
	 * Sets the <code>contact</code> property.
	 * <p>
	 * 
	 * @param pContact
	 *            the current value of the <code>contact</code> property.
	 */
	public void setContact(final ContactDto pContact) {
		this.contact = pContact;
	}

	/**
	 * Sets the <code>deferParticipantInput</code> property.
	 * <p>
	 * 
	 * @param pDeferParticipantInput
	 *            the current value of the <code>deferParticipantInput</code>
	 *            property.
	 */
	public void setDeferParticipantInput(final boolean pDeferParticipantInput) {
		this.deferParticipantInput = pDeferParticipantInput;
	}

	/**
	 * Sets the <code>OId</code> property.
	 * <p>
	 * 
	 * @param pOId
	 *            the current value of the <code>OId</code> property.
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

	public void setName(final String pname) {
		this.name = pname; 
		
	}
	
	/**
	 * Gets the <code>billingAccount1</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>billingAccount1</code> property.
	 */
	public String getBillingAccount1() {
		return this.billingAccount1;
	}
	
	/**
	 * Sets the <code>billingAccount1</code> property.
	 * <p>
	 * 
	 * @param pBillingAccount1
	 *            the current value of the <code>billingAccount1</code> property.
	 */
	public void setBillingAccount1(final String pBillingAccount1) {
		this.billingAccount1 = pBillingAccount1;
	}

	/**
	 * Gets the <code>billingAccount2</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>billingAccount2</code> property.
	 */
	public String getBillingAccount2() {
		return this.billingAccount2;
	}

	/**
	 * Sets the <code>billingAccount2</code> property.
	 * <p>
	 * 
	 * @param pBillingAccount2
	 *            the current value of the <code>billingAccount2</code> property.
	 */
	public void setBillingAccount2(final String pBillingAccount2) {
		this.billingAccount2 = pBillingAccount2;
	}
	
	/**
	 * Gets the <code>iataNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>iataNumber</code> property.
	 */
	public String getIataNumber() {
		return this.iataNumber;
	}

	/**
	 * Sets the <code>iataNumber</code> property.
	 * <p>
	 * 
	 * @param pIataNumber
	 *            the current value of the <code>iataNumber</code> property.
	 */
	public void setIataNumber(String pIataNumber) {
		this.iataNumber = pIataNumber;
	}
}
