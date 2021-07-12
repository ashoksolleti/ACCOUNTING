package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;
import java.util.Set;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ClearingHouseType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class InterlineInwardBillingFindDto extends PersistenceObjectDto
		implements Cloneable {

	/**
     * 
     */
	private static final long serialVersionUID = -4562969986329040014L;

	/**
	 * Attribute to hold <code>oId</code> property.
	 */
	private Long oId;

	/**
	 * Attribute to hold <code>clearingHouse</code> property.
	 */
	private ClearingHouseType clearingHouseType;

	/**
	 * Attribute to hold <code>billingYearMonth</code> property.
	 */
	private String billingYearMonth;

	/**
	 * Attribute to hold <code>billingPeriod</code> property.
	 */
	private Integer billingPeriod;

	/**
	 * Attribute to hold <code>invoiceNumber</code> property.
	 */
	private String invoiceNumber;

	/**
	 * Attribute to hold <code>carrier</code> property.
	 */
	private String carrier;

	/**
	 * Attribute to hold <code>invoiceDate</code> property.
	 */
	private Date invoiceDate;

	/**
	 * Attribute to hold <code>carriers</code> property.
	 */
	private Set<String> carriers;

	/**
	 * Attribute to hold <code>memotype</code> property.
	 */
	private MemoType memoType;

	private AirWaybillNumberDto airWaybillNumber;

	// NAC
	/**
	 * Attribute to hold <code>specificAirline</code> property.
	 */
	private String specificAirline;

	public AirWaybillNumberDto getAirWaybillNumber() {

		if (this.airWaybillNumber == null) {
			this.airWaybillNumber = new AirWaybillNumberDto();

		}
		return this.airWaybillNumber;
	}

	public void setAirWaybillNumber(final AirWaybillNumberDto pAirWaybillNumber) {
		this.airWaybillNumber = pAirWaybillNumber;
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
	 * Sets the <code>oId</code> property.
	 * <p>
	 * 
	 * @param pOId
	 *            the current value of the <code>oId</code> property.
	 */
	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

	/**
	 * Gets the <code>clearingHouseType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>clearingHouseType</code> property.
	 */
	public ClearingHouseType getClearingHouseType() {
		return clearingHouseType;
	}

	/**
	 * Sets the <code>clearingHouseType</code> property.
	 * <p>
	 * 
	 * @param pClearingHouseType
	 *            the current value of the <code>clearingHouseType</code>
	 *            property.
	 */
	public void setClearingHouseType(ClearingHouseType pClearingHouseType) {
		this.clearingHouseType = pClearingHouseType;
	}

	/**
	 * Gets the <code>billingYearMonth</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>billingYearMonth</code> property.
	 */
	public String getBillingYearMonth() {
		return billingYearMonth;
	}

	/**
	 * Sets the <code>billingYearMonth</code> property.
	 * <p>
	 * 
	 * @param pBillingYearMonth
	 *            the current value of the <code>billingYearMonth</code>
	 *            property.
	 */
	public void setBillingYearMonth(final String pBillingYearMonth) {
		this.billingYearMonth = pBillingYearMonth;
	}

	/**
	 * Gets the <code>billingPeriod</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>billingPeriod</code> property.
	 */
	public Integer getBillingPeriod() {
		return billingPeriod;
	}

	/**
	 * Sets the <code>billingPeriod</code> property.
	 * <p>
	 * 
	 * @param pBillingPeriod
	 *            the current value of the <code>billingPeriod</code> property.
	 */
	public void setBillingPeriod(final Integer pBillingPeriod) {
		this.billingPeriod = pBillingPeriod;
	}

	/**
	 * Gets the <code>invoiceNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>invoiceNumber</code> property.
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * Sets the <code>invoiceNumber</code> property.
	 * <p>
	 * 
	 * @param pInvoiceNumber
	 *            the current value of the <code>invoiceNumber</code> property.
	 */
	public void setInvoiceNumber(final String pInvoiceNumber) {
		this.invoiceNumber = ContractUtility.convertToUpperCase(pInvoiceNumber);
	}

	/**
	 * Gets the <code>carrier</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>carrier</code> property.
	 */
	public String getCarrier() {
		return carrier;
	}

	/**
	 * Sets the <code>carrier</code> property.
	 * <p>
	 * 
	 * @param pCarrier
	 *            the current value of the <code>carrier</code> property.
	 */
	public void setCarrier(final String pCarrier) {
		this.carrier = ContractUtility.convertToUpperCase(pCarrier);
	}

	/**
	 * Gets the <code>invoiceDate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>invoiceDate</code> property.
	 */
	public Date getInvoiceDate() {
		return ContractUtility.getClonedDate(invoiceDate);
	}

	/**
	 * Sets the <code>invoiceDate</code> property.
	 * <p>
	 * 
	 * @param pInvoiceDate
	 *            the current value of the <code>invoiceDate</code> property.
	 */
	public void setInvoiceDate(final Date pInvoiceDate) {
		this.invoiceDate = ContractUtility.getClonedDate(pInvoiceDate);
	}

	/**
	 * Gets the <code>carriers</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>carriers</code> property.
	 */
	public Set<String> getCarriers() {
		return carriers;
	}

	/**
	 * Sets the <code>carriers</code> property.
	 * <p>
	 * 
	 * @param pCarriers
	 *            the current value of the <code>carriers</code> property.
	 */
	public void setCarriers(final Set<String> pCarriers) {
		this.carriers = pCarriers;
	}

	/**
	 * Gets the <code>memoType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>memoType</code> property.
	 */
	public MemoType getMemoType() {
		return memoType;
	}

	/**
	 * Sets the <code>memoType</code> property.
	 * <p>
	 * 
	 * @param memoType
	 *            the current value of the <code>memoType</code> property.
	 */
	public void setMemoType(final MemoType memoType) {
		this.memoType = memoType;
	}

	/* NAC starts */
	/**
	 * Gets the <code>specificAirline</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>specificAirline</code> property.
	 */
	public String getSpecificAirline() {
		return this.specificAirline;
	}

	/**
	 * Sets the <code>specificAirline</code> property.
	 * <p>
	 * 
	 * @param memoType
	 *            the current value of the <code>specificAirline</code>
	 *            property.
	 */
	public void setSpecificAirline(final String specificAirline) {

		this.specificAirline = specificAirline;

	}
	/* NAC ends */
}
