package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class InterlineInwardBillingPersistRequest extends AbstractRequest {

	/**
     * 
     */
	private static final long serialVersionUID = 1359975318990335789L;

	/**
	 * Indicates if the request is in BATCH mode.
	 */
	private boolean batchIndicator;

	/**
	 * Attribute to hold the <code>billingScheduleDto</code> object.
	 */
	private AccountingInvoiceBillingScheduleDto billingScheduleDto;

	/**
	 * Attribute to hold the <code>memoType</code> object.
	 */
	private MemoType memoType;
	
	private byte[] awbInformation;

	private boolean uploadedFromXL;
	
	/**
	 * Attribute to hold the <code>oId</code> object.
	 */
	private Long oId;

	// NAC
	/**
	 * Attribute to hold the <code>specificAirline</code> object.
	 */
	private String specificAirline;

	public boolean getBatchIndicator() {
		return this.batchIndicator;
	}

	/**
	 * Gets the <code>billingScheduleDto</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>billingScheduleDto</code>
	 *         property.
	 */
	public AccountingInvoiceBillingScheduleDto getBillingScheduleDto() {
		return this.billingScheduleDto;
	}

	public MemoType getMemoType() {
		return this.memoType;
	}

	/**
	 * Gets the <code>oId</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>oId</code> property.
	 */
	public Long getOId() {
		return this.oId;
	}

	public void setBatchIndicator(final boolean pBatchIndicator) {
		this.batchIndicator = pBatchIndicator;
	}

	/**
	 * Sets the <code>billingScheduleDto</code> property.
	 * <p>
	 * 
	 * @param pBillingScheduleDto
	 *            the current value of the <code>billingScheduleDto</code>
	 *            property.
	 */
	public void setBillingScheduleDto(
			final AccountingInvoiceBillingScheduleDto pBillingScheduleDto) {
		this.billingScheduleDto = pBillingScheduleDto;
	}

	public void setMemoType(final MemoType pMemoType) {
		this.memoType = pMemoType;
	}

	/**
	 * Sets the <code>oId</code> property.
	 * <p>
	 * 
	 * @param pOId
	 *            the current value of the <code>oId</code> property.
	 */
	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

	/* NAC starts */
	/**
	 * Gets the <code>specificAirline</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>specificAirline</code> property.
	 */
	public String getSpecificAirline() {
		return specificAirline;
	}

	/**
	 * Sets the <code>specificAirline</code> property.
	 * <p>
	 * 
	 * @param pOId
	 *            the current value of the <code>specificAirline</code>
	 *            property.
	 */
	public void setSpecificAirline(String specificAirline) {

		this.specificAirline = specificAirline;
	}

	public byte[] getAwbInformation() {
		return awbInformation;
	}

	public void setAwbInformation(byte[] awbInformation) {
		this.awbInformation = awbInformation;
	}

	public boolean isUploadedFromXL() {
		return uploadedFromXL;
	}

	public void setUploadedFromXL(boolean uploadedFromXL) {
		this.uploadedFromXL = uploadedFromXL;
	}
	
	
	
	/* NAC ends */
}
