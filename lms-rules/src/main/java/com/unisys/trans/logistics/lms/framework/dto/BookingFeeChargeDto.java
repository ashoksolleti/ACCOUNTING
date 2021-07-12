/* ====================================== */
/* Copyright(c) 2015 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** RFC SK164H File
 * <code>BookingFeeResponseDto</code> is used for find Booking information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>quote
 * <li>description
 * <li>amount
 * <li>totalAmount
 * <li>previousFee
 * <li>identifier
 * <li>executionDate
 * <li>otherCharges
 * </ul>
 */
public class BookingFeeChargeDto extends PersistenceObjectDto {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = -715882489513638716L;

	/**
	 * Attribute to hold <code>bookingControlOffice</code> property.
	 */
	private String quote;

	/**
	 * Attribute to hold <code>bookingCreationSource</code> property.
	 */
	private BigDecimal totalAmount;

	/**
	 * Attribute to hold <code>identifier</code> property.
	 */
	private String identifier;

	/**
	 * Attribute to hold <code>executionDate</code> property.
	 */
	private Date executionDate;

	private List<OtherChargesDto> otherCharges = new ArrayList<OtherChargesDto>();

	private boolean changeFee;
	
	private BigDecimal totalAndPreviousFeeAmount;
	
	private Date chargeDateTime;
	
	/**
	 * Attribute to hold <code>executionDateDisplay</code> property.
	 */
	private String executionDateDisplay;
	/**
	 * @return the executionDateDisplay
	 */
	public String getExecutionDateDisplay() {
		return executionDateDisplay;
	}
	/**
	 * @param executionDateDisplay the executionDateDisplay to set
	 */
	public void setExecutionDateDisplay(String executionDateDisplay) {
		this.executionDateDisplay = executionDateDisplay;
	}
	/**
	 * @return the quote
	 */
	public String getQuote() {
		return quote;
	}

	/**
	 * @param quote
	 *            the quote to set
	 */
	public void setQuote(String quote) {
		this.quote = quote;
	}

	/**
	 * @return the totalAmount
	 */
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount
	 *            the totalAmount to set
	 */
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * @return the identifier
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * @param identifier
	 *            the identifier to set
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	/**
	 * @return the executionDate
	 */
	public Date getExecutionDate() {
		return executionDate;
	}

	/**
	 * @param executionDate
	 *            the executionDate to set
	 */
	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the otherCharges
	 */
	public List<OtherChargesDto> getOtherCharges() {
		return otherCharges;
	}

	public void setOtherCharges(List<OtherChargesDto> otherCharges) {
		this.otherCharges = otherCharges;
	}

	public void addOtherCharges(OtherChargesDto otherCharge) {
		if (this.otherCharges == null) {
			this.setOtherCharges(new ArrayList<OtherChargesDto>());
		}
		this.getOtherCharges().add(otherCharge);
	}

	/**
	 * @return the totalAndPreviousFeeAmount
	 */
	public BigDecimal getTotalAndPreviousFeeAmount() {
		return totalAndPreviousFeeAmount;
	}

	/**
	 * @param totalAndPreviousFeeAmount the totalAndPreviousFeeAmount to set
	 */
	public void setTotalAndPreviousFeeAmount(BigDecimal totalAndPreviousFeeAmount) {
		this.totalAndPreviousFeeAmount = totalAndPreviousFeeAmount;
	}

	/**
	 * @return the changeFee
	 */
	public boolean isChangeFee() {
		return changeFee;
	}

	/**
	 * @param changeFee the changeFee to set
	 */
	public void setChangeFee(boolean changeFee) {
		this.changeFee = changeFee;
	}

	/**
	 * @return the chargeDateTime
	 */
	public Date getChargeDateTime() {
		return chargeDateTime;
	}

	/**
	 * @param chargeDateTime the chargeDateTime to set
	 */
	public void setChargeDateTime(Date chargeDateTime) {
		this.chargeDateTime = chargeDateTime;
	}
}
