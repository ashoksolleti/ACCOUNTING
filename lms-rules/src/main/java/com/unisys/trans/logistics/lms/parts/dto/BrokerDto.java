/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;

/**
 * <code>BrokerDto</code> contains specific data applicable to a broker.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>accountNumber
 * <li>billBrokerIndicator
 * <li>oId
 * <li>station
 * <li>freightParticipantOId
 * </ul>
 * </code>
 */
public class BrokerDto implements Serializable {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 8830057581721660199L;

	/**
	 * Attribute to hold <code>accountNumber</code> property. It is used to
	 * identify a specific broker at a specific airport when the participant is
	 * associated with the shipment as consignee.
	 */
	private String accountNumber;

	/**
	 * Attribute to hold <code>billBrokerIndicator</code> property. Checks
	 * whether the <code>Broker</code> is to be billed for the shipment.
	 * Prohibited if the broker account number field is not present.
	 */
	private Boolean billBrokerIndicator;

	/**
	 * Attribute to hold <code>freightParticipantOId</code> property.
	 */
	private Long freightParticipantOId;

	/**
	 * Attribute to hold <code>oId</code> property.
	 */
	private Long oId;

	/**
	 * Attribute to hold <code>station</code> property. Entered only if broker
	 * account number is present. Else, prohibited. Must be validated against
	 * the station and city table.
	 */
	private String station;

	/**
	 * <code>Default Constructor.</code>
	 */
	public BrokerDto() {

	}

	/**
	 * Gets the <code>accountNumber</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces<br>
	 * <p>
	 * <b>Example: </b><br>
	 * B123456
	 * <p>
	 * 
	 * @return the new value of <code>accountNumber</code> property.
	 */
	public String getAccountNumber() {
		return this.accountNumber;
	}

	/**
	 * Gets the <code>billBrokerIndicator</code> property.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <code><li>True</code><br>
	 * The broker should be billed for the shipment. <code><li>False</code><br>
	 * The broker should not be billed for the shipment.<br>
	 * <p>
	 * 
	 * @return the current value of <code>billBrokerIndicator</code> property.
	 */
	public Boolean getBillBrokerIndicator() {
		return this.billBrokerIndicator;
	}

	/**
	 * Gets the <code>freightParticipantOId</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>freightParticipantOId</code>
	 *         property.
	 */
	public Long getFreightParticipantOId() {
		return this.freightParticipantOId;
	}

	/**
	 * Gets the <code>oId</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>oId</code> property.<br>
	 */
	public Long getOId() {
		return this.oId;
	}

	/**
	 * Gets the <code>station</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-36 Alphanumeric, hyphen (-), and period (.) including spaces<br>
	 * <p>
	 * <b>Example: </b><br>
	 * POB 14000, POSTAL STN SAINT LAURENT
	 * <p>
	 * 
	 * @return the <code>station</code> to which the broker belongs.<br>
	 */
	public String getStation() {
		return this.station;
	}

	/**
	 * Determines if the <code>billBrokerIndicator</code> property is true.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <code>true</code> - The broker should be billed for the shipment.<br>
	 * <code>false</code> - The broker should not be billed for the shipment.
	 * <p>
	 * 
	 * @return the current value of <code>billBrokerIndicator</code> property.<br>
	 */
	public Boolean isBillBrokerIndicator() {
		return this.billBrokerIndicator;
	}

	/**
	 * Method to validate , if there is really any information peratining to
	 * Broker data of a Participant.
	 * 
	 * @return {@code true} if the Broker data is initialized else returns
	 *         {@code false}
	 */
	public boolean isInitialized() {
		boolean aValue = false;
		if ((this.getAccountNumber() != null && !this.getAccountNumber()
				.isEmpty())
				|| (this.getStation() != null && !this.getStation().isEmpty())
				|| (this.getBillBrokerIndicator() != null && this
						.getBillBrokerIndicator().booleanValue())) {
			aValue = true;
		}
		return aValue;
	}

	/**
	 * Sets the <code>accountNumber</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces <br>
	 * <p>
	 * <b>Example: </b><br>
	 * B123456
	 * <p>
	 * 
	 * @param pAccountNumber
	 *            contains the <code>accountNumber</code> of the broker.
	 */
	public void setAccountNumber(final String pAccountNumber) {
		this.accountNumber = pAccountNumber;
	}

	/**
	 * Sets the <code>billBrokerIndicator</code> property.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The broker should be billed for the shipment.
	 * <li><code>false</code><br>
	 * The broker should not be billed for the shipment.
	 * <p>
	 * 
	 * @param pBillBrokerIndicator
	 *            the new value of the <code>billBrokerIndicator</code>
	 *            property.<bR>
	 */
	public void setBillBrokerIndicator(final Boolean pBillBrokerIndicator) {
		this.billBrokerIndicator = pBillBrokerIndicator;
	}

	/**
	 * Sets the <code>freightParticipantOId</code> property.
	 * <p>
	 * 
	 * @param pFreightParticipantOId
	 *            the new value of the <code>freightParticipantOId</code>
	 *            property.<br>
	 */
	public void setFreightParticipantOId(final Long pFreightParticipantOId) {
		this.freightParticipantOId = pFreightParticipantOId;
	}

	/**
	 * Sets the <code>oId</code> property.
	 * <p>
	 * 
	 * @param pOId
	 *            the new value of the <code>oId</code> property.<br>
	 */
	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

	/**
	 * Sets the <code>station</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 2-5 Alphanumeric, hyphen (-), and period (.) including spaces <br>
	 * <p>
	 * <b>Example: </b><br>
	 * QUEBEC
	 * <p>
	 * 
	 * @param pStation
	 *            contains the <code>station</code> to which the broker belongs.<br>
	 */
	public void setStation(final String pStation) {
		this.station = ContractUtility.convertToUpperCase(pStation);
	}
}
