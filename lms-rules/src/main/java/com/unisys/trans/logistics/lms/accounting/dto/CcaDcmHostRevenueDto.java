package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.accounting.dto.constants.HurdleRateReasonType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>HostRevenue</code> domain contain details of HostRevenue.
 * <p>
 * This contains all information about HostRevenue.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>bookingEventCostAmount
 * <li>bookingEventCostRate
 * <li>bookingEventGrossRevenue
 * <li>bookingEventHostRevenue
 * <li>bookingEventHurdleAmount
 * <li>bookingEventHurdleRate
 * <li>bookingEventProduct
 * <li>bookingEventRevenueRate
 * <li>bookingEventRevenueRate
 * <li>bookingEventTotalRate
 * <li>oId
 * </ul>
 */

public class CcaDcmHostRevenueDto extends PersistenceObjectDto {
	/**
	 * Unique Serial Version
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Attribute to hold <code>bookingEventCostAmount</code> property.
	 */
	private BigDecimal bookingEventCostAmount;

	/**
	 * Attribute to hold <code>bookingEventCostRate</code> property.
	 */
	private BigDecimal bookingEventCostRate;

	/**
	 * Attribute to hold <code>bookingEventGrossRevenue</code> property.
	 */
	private BigDecimal bookingEventGrossRevenue;
	
	/**
     * Attribute to hold <code>bookingEventGrossRevenue</code> property.
     */
    private BigDecimal bookingEventProCurGrossRevenue;

	/**
	 * Attribute to hold <code>bookingEventHostRevenue</code> property.
	 */
	private BigDecimal bookingEventHostRevenue;
	
	/**
     * Attribute to hold <code>bookingEventHostRevenue</code> property.
     */
    private BigDecimal bookingEventProCurHostRevenue;

	/**
	 * Attribute to hold <code>bookingEventHurdleAmount</code> property.
	 */
	private BigDecimal bookingEventHurdleAmount;

	/**
	 * Attribute to hold <code>bookingEventHurdleRate</code> property.
	 */
	private BigDecimal bookingEventHurdleRate;

	/**
	 * Attribute to hold <code>bookingEventHurdleRateReasonCode</code> property.
	 */
	private HurdleRateReasonType bookingEventHurdleRateReasonCode;

	/**
	 * Attribute to hold <code>bookingEventHurdleRateStatus</code> property.
	 */

	private String bookingEventHurdleRateStatus;

	/**
	 * Attribute to hold <code>bookingEventProduct</code> property.
	 */
	private String bookingEventProduct;

	/**
	 * Attribute to hold <code>bookingEventRevenueRate</code> property.
	 */
	private BigDecimal bookingEventRevenueRate;

	/**
	 * Attribute to hold <code>bookingEventTotalRate</code> property.
	 */
	private BigDecimal bookingEventTotalRate;
	
	/**
     * Attribute to hold <code>bookingEventTotalRate</code> property.
     */
    private BigDecimal bookingEventProCurTotalRate;

	/**
	 * Attribute to hold <code>oId</code> property.
	 */
	private Long oId;

	/**
	 * Gets the <code>bookingEventCostAmount</code> property.
	 * 
	 * @return the current value of the <code>bookingEventCostAmount</code>
	 *         property.<br>
	 */
	public BigDecimal getBookingEventCostAmount() {
		return this.bookingEventCostAmount;
	}

	/**
	 * Gets the <code>bookingEventCostRate</code> property.
	 * 
	 * @return the current value of the <code>bookingEventCostRate</code>
	 *         property.<br>
	 */
	public BigDecimal getBookingEventCostRate() {
		return this.bookingEventCostRate;
	}

	/**
	 * Gets the <code>bookingEventGrossRevenue</code> property.
	 * 
	 * @return the current value of the <code>bookingEventGrossRevenue</code>
	 *         property.<br>
	 */
	public BigDecimal getBookingEventGrossRevenue() {
		return this.bookingEventGrossRevenue;
	}

	/**
	 * Gets the <code>bookingEventHostRevenue</code> property.
	 * 
	 * @return the current value of the <code>bookingEventHostRevenue</code>
	 *         property.<br>
	 */
	public BigDecimal getBookingEventHostRevenue() {
		return this.bookingEventHostRevenue;
	}

	/**
	 * Gets the <code>bookingEventHurdleAmount</code> property.
	 * 
	 * @return the current value of the <code>bookingEventHurdleAmount</code>
	 *         property.<br>
	 */
	public BigDecimal getBookingEventHurdleAmount() {
		return this.bookingEventHurdleAmount;
	}

	/**
	 * Gets the <code>bookingEventHurdleRate</code> property.
	 * 
	 * @return the current value of the <code>bookingEventHurdleRate</code>
	 *         property.<br>
	 */
	public BigDecimal getBookingEventHurdleRate() {
		return this.bookingEventHurdleRate;
	}

	/**
	 * Gets the <code>bookingEventHurdleRateReasonCode</code> property.
	 * 
	 * @return the current value of the
	 *         <code>bookingEventHurdleRateReasonCode</code> property.<br>
	 */
	public HurdleRateReasonType getBookingEventHurdleRateReasonCode() {
		return this.bookingEventHurdleRateReasonCode;
	}

	/**
	 * Gets the <code>bookingEventHurdleRateStatus</code> property.
	 * 
	 * @return the current value of the
	 *         <code>bookingEventHurdleRateStatus</code> property.<br>
	 */
	public String getBookingEventHurdleRateStatus() {
		return this.bookingEventHurdleRateStatus;
	}

	/**
	 * Gets the <code>bookingEventProduct</code> property.
	 * 
	 * @return the current value of the <code>bookingEventProduct</code>
	 *         property.<br>
	 */
	public String getBookingEventProduct() {
		return this.bookingEventProduct;
	}

	/**
	 * Gets the <code>bookingEventRevenueRate</code> property.
	 * 
	 * @return the current value of the <code>bookingEventRevenueRate</code>
	 *         property.<br>
	 */
	public BigDecimal getBookingEventRevenueRate() {
		return this.bookingEventRevenueRate;
	}

	/**
	 * Gets the <code>bookingEventTotalRate</code> property.
	 * 
	 * @return the current value of the <code>bookingEventTotalRate</code>
	 *         property.<br>
	 */
	public BigDecimal getBookingEventTotalRate() {
		return this.bookingEventTotalRate;
	}

	/**
	 * Gets the <code>oId</code> property.
	 * 
	 * @return the current value of the <code>oId</code> property.<br>
	 */
	public Long getOId() {
		return this.oId;
	}

	/**
	 * Sets the <code>bookingEventCostAmount</code> property.
	 * <p>
	 * 
	 * @param pBookingEventCostAmount
	 *            the new value of the <code>bookingEventCostAmount</code>
	 *            property.
	 */
	public void setBookingEventCostAmount(
			final BigDecimal pBookingEventCostAmount) {
		this.bookingEventCostAmount = pBookingEventCostAmount;
	}

	/**
	 * Sets the <code>bookingEventCostRate</code> property.
	 * <p>
	 * 
	 * @param pBookingEventCostRate
	 *            the new value of the <code>bookingEventCostRate</code>
	 *            property.
	 */
	public void setBookingEventCostRate(final BigDecimal pBookingEventCostRate) {
		this.bookingEventCostRate = pBookingEventCostRate;
	}

	/**
	 * Sets the <code>bookingEventGrossRevenue</code> property.
	 * <p>
	 * 
	 * @param pBookingEventGrossRevenue
	 *            the new value of the <code>bookingEventGrossRevenue</code>
	 *            property.
	 */
	public void setBookingEventGrossRevenue(
			final BigDecimal pBookingEventGrossRevenue) {
		this.bookingEventGrossRevenue = pBookingEventGrossRevenue;
	}

	/**
	 * Sets the <code>bookingEventHostRevenue</code> property.
	 * <p>
	 * 
	 * @param pBookingEventHostRevenue
	 *            the new value of the <code>bookingEventHostRevenue</code>
	 *            property.
	 */
	public void setBookingEventHostRevenue(
			final BigDecimal pBookingEventHostRevenue) {
		this.bookingEventHostRevenue = pBookingEventHostRevenue;
	}

	/**
	 * Sets the <code>bookingEventHurdleAmount</code> property.
	 * <p>
	 * 
	 * @param pBookingEventHurdleAmount
	 *            the new value of the <code>bookingEventHurdleAmount</code>
	 *            property.
	 */
	public void setBookingEventHurdleAmount(
			final BigDecimal pBookingEventHurdleAmount) {
		this.bookingEventHurdleAmount = pBookingEventHurdleAmount;
	}

	/**
	 * Sets the <code>bookingEventHurdleRate</code> property.
	 * <p>
	 * 
	 * @param pBookingEventHurdleRate
	 *            the new value of the <code>bookingEventHurdleRate</code>
	 *            property.
	 */
	public void setBookingEventHurdleRate(
			final BigDecimal pBookingEventHurdleRate) {
		this.bookingEventHurdleRate = pBookingEventHurdleRate;
	}

	/**
	 * Sets the <code>bookingEventHurdleRateReasonCode</code> property.
	 * <p>
	 * 
	 * @param pBookingEventHurdleRateReasonCode
	 *            the new value of the
	 *            <code>bookingEventHurdleRateReasonCode</code> property.
	 */

	public void setBookingEventHurdleRateReasonCode(
			final HurdleRateReasonType pBookingEventHurdleRateReasonCode) {
		this.bookingEventHurdleRateReasonCode = pBookingEventHurdleRateReasonCode;
	}

	/**
	 * Sets the <code>bookingEventHurdleRateStatus</code> property.
	 * <p>
	 * 
	 * @param pBookingEventHurdleRateStatus
	 *            the new value of the <code>bookingEventHurdleRateStatus</code>
	 *            property.
	 */

	public void setBookingEventHurdleRateStatus(
			final String pBookingEventHurdleRateStatus) {
		this.bookingEventHurdleRateStatus = pBookingEventHurdleRateStatus;
	}

	/**
	 * Sets the <code>bookingEventProduct</code> property.
	 * <p>
	 * 
	 * @param pBookingEventProduct
	 *            the new value of the <code>bookingEventProduct</code>
	 *            property.
	 */
	public void setBookingEventProduct(final String pBookingEventProduct) {
		this.bookingEventProduct = pBookingEventProduct;
	}

	/**
	 * Sets the <code>bookingEventRevenueRate</code> property.
	 * <p>
	 * 
	 * @param pBookingEventRevenueRate
	 *            the new value of the <code>bookingEventRevenueRate</code>
	 *            property.
	 */
	public void setBookingEventRevenueRate(
			final BigDecimal pBookingEventRevenueRate) {
		this.bookingEventRevenueRate = pBookingEventRevenueRate;
	}

	/**
	 * Sets the <code>bookingEventTotalRate</code> property.
	 * <p>
	 * 
	 * @param pBookingEventTotalRate
	 *            the new value of the <code>bookingEventTotalRate</code>
	 *            property.
	 */
	public void setBookingEventTotalRate(final BigDecimal pBookingEventTotalRate) {
		this.bookingEventTotalRate = pBookingEventTotalRate;
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

    public BigDecimal getBookingEventProCurGrossRevenue() {
        return bookingEventProCurGrossRevenue;
    }

    public void setBookingEventProCurGrossRevenue(BigDecimal bookingEventProCurGrossRevenue) {
        this.bookingEventProCurGrossRevenue = bookingEventProCurGrossRevenue;
    }

    public BigDecimal getBookingEventProCurHostRevenue() {
        return bookingEventProCurHostRevenue;
    }

    public void setBookingEventProCurHostRevenue(BigDecimal bookingEventProCurHostRevenue) {
        this.bookingEventProCurHostRevenue = bookingEventProCurHostRevenue;
    }

    public BigDecimal getBookingEventProCurTotalRate() {
        return bookingEventProCurTotalRate;
    }

    public void setBookingEventProCurTotalRate(BigDecimal bookingEventProCurTotalRate) {
        this.bookingEventProCurTotalRate = bookingEventProCurTotalRate;
    }

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}
}
