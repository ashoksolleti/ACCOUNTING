package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.DynamicHurdleRateIndicatorType;
import com.unisys.trans.logistics.lms.framework.constants.HurdleRateReasonCodeType;

/**
 * <code>AirwaybillDto</code> is used for find Airwaybill information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>awbEventGrossRevenue
 * <li>awbEventHostRevenue
 * <li>awbEventProrationReasonCode
 * <li>awbEventTotalRate
 * <li>bookingEventGrossRevenue
 * <li>bookingEventHostCostAmount
 * <li>bookingEventHostCostRate
 * <li>bookingEventHostHurdleAmount
 * <li>bookingEventHostHurdleRate
 * <li>bookingEventHostRevenue
 * <li>bookingEventHurdleRateProduct
 * <li>bookingEventHurdleRateReasonCode
 * <li>bookingEventHurdleRateStatus
 * <li>bookingEventRevenueRate
 * <li>bookingEventTotalRate
 * <li>interlineSegments
 * </ul>
 */
public class AirWaybillRevenueDto extends PersistenceObjectDto {

    /**
     * Unique Serial Version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>awbEventGrossRevenue</code> property.
     */
    private BigDecimal awbEventGrossRevenue;

    /**
     * Attribute to hold <code>awbEventHostRevenue</code> property.
     */
    private BigDecimal awbEventHostRevenue;

    /**
     * Attribute to hold <code>awbEventProrationReasonCode</code> property.
     */
    private String awbEventProrationReasonCode;

    /**
     * Attribute to hold <code>awbEventTotalRate</code> property.
     */
    private BigDecimal awbEventTotalRate;

    /**
     * Attribute to hold <code>bookingEventGrossRevenue</code> property.
     */
    private BigDecimal bookingEventGrossRevenue;

    /**
     * Attribute to hold <code>bookingEventHostCostAmount</code> property.
     */
    private BigDecimal bookingEventHostCostAmount;

    /**
     * Attribute to hold <code>bookingEventHostCostRate</code> property.
     */
    private BigDecimal bookingEventHostCostRate;

    /**
     * Attribute to hold <code>bookingEventHostHurdleAmount</code> property.
     */
    private BigDecimal bookingEventHostHurdleAmount;

    /**
     * Attribute to hold <code>bookingEventHostHurdleRate</code> property.
     */
    private BigDecimal bookingEventHostHurdleRate;

    /**
     * Attribute to hold <code>bookingEventHostRevenue</code> property.
     */
    private BigDecimal bookingEventHostRevenue;
    
    //MH002 additional costs starts
    /**
     * Attribute to hold <code>exportHandlingCost</code> property.
     */
    private BigDecimal bookingEventExportHandlingCost;

    /**
     * Attribute to hold <code>bookingEventTruckingCost</code> property.
     */
    private BigDecimal bookingEventTruckingCost;
    /**
     * Attribute to hold <code>bookingEventFuelCost</code> property.
     */
    private BigDecimal bookingEventFuelCost ;
    
    /**
     * Attribute to hold <code>bookingEventImportHandlingCost</code> property.
     */
    private BigDecimal bookingEventImportHandlingCost;
    /**
     * Attribute to hold <code>bookingEventTransitHandlingCost</code> property.
     */
    private BigDecimal bookingEventTransitHandlingCost;
   //MH002 additional costs ends
    /**
     * Attribute to hold <code>bookingEventHurdleRateProduct</code> property.
     */
 
    private String bookingEventHurdleRateProduct;

    /**
     * Attribute to hold <code>bookingEventHurdleRateReasonCode</code> property.
     */
    private HurdleRateReasonCodeType bookingEventHurdleRateReasonCode;

    /**
     * Attribute to hold <code>bookingEventHurdleRateStatus</code> property.
     */
    private String bookingEventHurdleRateStatus;

    /**
     * Attribute to hold <code>bookingEventRevenueRate</code> property.
     */
    private BigDecimal bookingEventRevenueRate;

    /**
     * Attribute to hold <code>bookingEventTotalRate</code> property.
     */
    private BigDecimal bookingEventTotalRate;

    /**
     * Attribute to hold <code>interlineSegments</code> property.
     */
    private List<InterlineProrationSegmentDto> interlineSegments;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>onlineSegments</code> property.
     */
    private List<OnlineProrationSegmentDto> onlineSegments;

    /**
     * Attribute to hold <code>bookingEventHurdleRevenueAmount</code> property.
     */
    private BigDecimal bookingEventHurdleRevenueAmount;

    /**
     * Attribute to hold <code>dynamicHurdleRateIndicator</code> property.
     */
    private DynamicHurdleRateIndicatorType dynamicHurdleRateIndicator;
    
    private String hurdleRateReasonCodeType;

    /**
     * @return the bookingEventHurdleRevenueAmount
     */
    public BigDecimal getBookingEventHurdleRevenueAmount() {
        return this.bookingEventHurdleRevenueAmount;
    }

    /**
     * @param pBookingEventHurdleRevenueAmount the bookingEventHurdleRevenueAmount to set
     */
    public void setBookingEventHurdleRevenueAmount(final BigDecimal pBookingEventHurdleRevenueAmount) {
        this.bookingEventHurdleRevenueAmount = pBookingEventHurdleRevenueAmount;
    }

    /**
     * @return the dynamicHurdleRateIndicator
     */
    public DynamicHurdleRateIndicatorType getDynamicHurdleRateIndicator() {
        return this.dynamicHurdleRateIndicator;
    }

    /**
     * @param pDynamicHurdleRateIndicator the dynamicHurdleRateIndicator to set
     */

    public void setDynamicHurdleRateIndicator(
                final DynamicHurdleRateIndicatorType pDynamicHurdleRateIndicator) {
        this.dynamicHurdleRateIndicator = pDynamicHurdleRateIndicator;
    }

    /**
     * Gets the <code>awbEventGrossRevenue</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbEventGrossRevenue</code> property.
     */
    public BigDecimal getAwbEventGrossRevenue() {
        if (this.awbEventGrossRevenue != null) {
            this.awbEventGrossRevenue = this.awbEventGrossRevenue.setScale(2,
                BigDecimal.ROUND_HALF_EVEN);
        }
        return this.awbEventGrossRevenue;
    }

    /**
     * Gets the <code>awbEventHostRevenue</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbEventHostRevenue</code> property.
     */
    public BigDecimal getAwbEventHostRevenue() {

        if (this.awbEventHostRevenue != null) {
            this.awbEventHostRevenue = this.awbEventHostRevenue.setScale(2,
                BigDecimal.ROUND_HALF_EVEN);
        }
        return this.awbEventHostRevenue;
    }

    /**
     * Gets the <code>awbEventProrationReasonCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbEventProrationReasonCode</code> property.
     */
    public String getAwbEventProrationReasonCode() {
        return this.awbEventProrationReasonCode;
    }

    /**
     * Gets the <code>awbEventTotalRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbEventTotalRate</code> property.
     */
    public BigDecimal getAwbEventTotalRate() {
        if (this.awbEventTotalRate != null) {
            this.awbEventTotalRate = this.awbEventTotalRate.setScale(2,
                BigDecimal.ROUND_HALF_EVEN);
        }
        return this.awbEventTotalRate;
    }

    /**
     * Gets the <code>bookingEventGrossRevenue</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookingEventGrossRevenue</code> property.
     */
    public BigDecimal getBookingEventGrossRevenue() {
        if (this.bookingEventGrossRevenue != null) {
            this.bookingEventGrossRevenue = this.bookingEventGrossRevenue
                        .setScale(2, BigDecimal.ROUND_HALF_EVEN);
        }
        return this.bookingEventGrossRevenue;
    }

    /**
     * Gets the <code>bookingEventHostCostAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookingEventHostCostAmount</code> property.
     */
    public BigDecimal getBookingEventHostCostAmount() {
        if (this.bookingEventHostCostAmount != null) {
            this.bookingEventHostCostAmount = this.bookingEventHostCostAmount
                        .setScale(2, BigDecimal.ROUND_HALF_EVEN);
        }
        return this.bookingEventHostCostAmount;
    }

    /**
     * Gets the <code>bookingEventHostCostRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookingEventHostCostRate</code> property.
     */
    public BigDecimal getBookingEventHostCostRate() {
        if (this.bookingEventHostCostRate != null) {
            this.bookingEventHostCostRate = this.bookingEventHostCostRate
                        .setScale(2, BigDecimal.ROUND_HALF_EVEN);
        }
        return this.bookingEventHostCostRate;
    }

    /**
     * Gets the <code>bookingEventHostHurdleAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookingEventHostHurdleAmount</code> property.
     */
    public BigDecimal getBookingEventHostHurdleAmount() {
        if (this.bookingEventHostHurdleAmount != null) {
            this.bookingEventHostHurdleAmount = this.bookingEventHostHurdleAmount
                        .setScale(2, BigDecimal.ROUND_HALF_EVEN);
        }
        return this.bookingEventHostHurdleAmount;
    }

    /**
     * Gets the <code>bookingEventHostHurdleRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookingEventHostHurdleRate</code> property.
     */
    public BigDecimal getBookingEventHostHurdleRate() {
        if (this.bookingEventHostHurdleRate != null) {
            this.bookingEventHostHurdleRate = this.bookingEventHostHurdleRate
                        .setScale(2, BigDecimal.ROUND_HALF_EVEN);
        }
        return this.bookingEventHostHurdleRate;
    }

    /**
     * Gets the <code>bookingEventHostRevenue</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookingEventHostRevenue</code> property.
     */
    public BigDecimal getBookingEventHostRevenue() {
        if (this.bookingEventHostRevenue != null) {
            this.bookingEventHostRevenue = this.bookingEventHostRevenue
                        .setScale(2, BigDecimal.ROUND_HALF_EVEN);
        }
        return this.bookingEventHostRevenue;
    }

    /**
     * Gets the <code>bookingEventHurdleRateProduct</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookingEventHurdleRateProduct</code> property.
     */
    public String getBookingEventHurdleRateProduct() {
        return this.bookingEventHurdleRateProduct;
    }

    /**
     * Gets the <code>bookingEventHurdleRateReasonCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookingEventHurdleRateReasonCode</code> property.
     */
    public HurdleRateReasonCodeType getBookingEventHurdleRateReasonCode() {
        return this.bookingEventHurdleRateReasonCode;
    }

    /**
     * Gets the <code>bookingEventHurdleRateStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookingEventHurdleRateStatus</code> property.
     */
    public String getBookingEventHurdleRateStatus() {
        return this.bookingEventHurdleRateStatus;
    }

    /**
     * Gets the <code>bookingEventRevenueRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookingEventRevenueRate</code> property.
     */
    public BigDecimal getBookingEventRevenueRate() {
        if (this.bookingEventRevenueRate != null) {
            this.bookingEventRevenueRate = this.bookingEventRevenueRate
                        .setScale(2, BigDecimal.ROUND_HALF_EVEN);
        }
        return this.bookingEventRevenueRate;
    }

    /**
     * Gets the <code>bookingEventTotalRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookingEventTotalRate</code> property.
     */
    public BigDecimal getBookingEventTotalRate() {
        if (this.bookingEventTotalRate != null) {
            this.bookingEventTotalRate = this.bookingEventTotalRate.setScale(2,
                BigDecimal.ROUND_HALF_EVEN);
        }
        return this.bookingEventTotalRate;
    }

    /**
     * Gets the <code>interlineSegments</code> property.
     * <p>
     * 
     * @return the current value of the <code>interlineSegments</code> property.
     */
    public List<InterlineProrationSegmentDto> getInterlineSegments() {
        return this.interlineSegments;
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
     * Gets the <code>onlineSegments</code> property.
     * <p>
     * 
     * @return the current value of the <code>onlineSegments</code> property.
     */
    public List<OnlineProrationSegmentDto> getOnlineSegments() {
        return this.onlineSegments;
    }

    /**
     * Sets the <code>awbEventGrossRevenue</code> property.
     * <p>
     * 
     * @param pAwbEventGrossRevenue
     *            holds the new value of <code>awbEventGrossRevenue</code>.<br>
     */
    public void setAwbEventGrossRevenue(final BigDecimal pAwbEventGrossRevenue) {
        this.awbEventGrossRevenue = pAwbEventGrossRevenue;
    }

    /**
     * Sets the <code>awbEventHostRevenue</code> property.
     * <p>
     * 
     * @param pAwbEventHostRevenue
     *            holds the new value of <code>awbEventHostRevenue</code>.<br>
     */
    public void setAwbEventHostRevenue(final BigDecimal pAwbEventHostRevenue) {
        this.awbEventHostRevenue = pAwbEventHostRevenue;
    }

    /**
     * Sets the <code>awbEventProrationReasonCode</code> property.
     * <p>
     * 
     * @param pAwbEventProrationReasonCode
     *            holds the new value of <code>awbEventProrationReasonCode</code>.<br>
     */
    public void setAwbEventProrationReasonCode(
                final String pAwbEventProrationReasonCode) {
        this.awbEventProrationReasonCode = pAwbEventProrationReasonCode;
    }

    /**
     * Sets the <code>awbEventTotalRate</code> property.
     * <p>
     * 
     * @param pAwbEventTotalRate
     *            holds the new value of <code>awbEventTotalRate</code>.<br>
     */
    public void setAwbEventTotalRate(final BigDecimal pAwbEventTotalRate) {
        this.awbEventTotalRate = pAwbEventTotalRate;
    }

    /**
     * Sets the <code>bookingEventGrossRevenue</code> property.
     * <p>
     * 
     * @param pBookingEventGrossRevenue
     *            holds the new value of <code>bookingEventGrossRevenue</code>.<br>
     */
    public void setBookingEventGrossRevenue(
                final BigDecimal pBookingEventGrossRevenue) {
        this.bookingEventGrossRevenue = pBookingEventGrossRevenue;
    }

    /**
     * Sets the <code>bookingEventHostCostAmount</code> property.
     * <p>
     * 
     * @param pBookingEventHostCostAmount
     *            holds the new value of <code>bookingEventHostCostAmount</code> .<br>
     */
    public void setBookingEventHostCostAmount(
                final BigDecimal pBookingEventHostCostAmount) {
        this.bookingEventHostCostAmount = pBookingEventHostCostAmount;
    }

    /**
     * Sets the <code>bookingEventHostCostRate</code> property.
     * <p>
     * 
     * @param pBookingEventHostCostRate
     *            holds the new value of <code>bookingEventHostCostRate</code>.<br>
     */
    public void setBookingEventHostCostRate(
                final BigDecimal pBookingEventHostCostRate) {
        this.bookingEventHostCostRate = pBookingEventHostCostRate;
    }

    /**
     * Sets the <code>bookingEventHostHurdleAmount</code> property.
     * <p>
     * 
     * @param pBookingEventHostHurdleAmount
     *            holds the new value of <code>bookingEventHostHurdleAmount</code>.<br>
     */
    public void setBookingEventHostHurdleAmount(
                final BigDecimal pBookingEventHostHurdleAmount) {
        this.bookingEventHostHurdleAmount = pBookingEventHostHurdleAmount;
    }

    /**
     * Sets the <code>bookingEventHostHurdleRate</code> property.
     * <p>
     * 
     * @param pBookingEventHostHurdleRate
     *            holds the new value of <code>bookingEventHostHurdleRate</code> .<br>
     */
    public void setBookingEventHostHurdleRate(
                final BigDecimal pBookingEventHostHurdleRate) {
        this.bookingEventHostHurdleRate = pBookingEventHostHurdleRate;
    }

    /**
     * Sets the <code>bookingEventHostRevenue</code> property.
     * <p>
     * 
     * @param pBookingEventHostRevenue
     *            holds the new value of <code>bookingEventHostRevenue</code>.<br>
     */
    public void setBookingEventHostRevenue(
                final BigDecimal pBookingEventHostRevenue) {
        this.bookingEventHostRevenue = pBookingEventHostRevenue;
    }

    /**
     * Sets the <code>bookingEventHurdleRateProduct</code> property.
     * <p>
     * 
     * @param pBookingEventHurdleRateProduct
     *            holds the new value of <code>bookingEventHurdleRateProduct</code>.<br>
     */
    public void setBookingEventHurdleRateProduct(
                final String pBookingEventHurdleRateProduct) {
        this.bookingEventHurdleRateProduct = pBookingEventHurdleRateProduct;
    }

    /**
     * Sets the <code>bookingEventHurdleRateReasonCode</code> property.
     * <p>
     * 
     * @param pBookingEventHurdleRateReasonCode
     *            holds the new value of <code>bookingEventHurdleRateReasonCode</code>.<br>
     */
    public void setBookingEventHurdleRateReasonCode(
                final HurdleRateReasonCodeType pBookingEventHurdleRateReasonCode) {
        this.bookingEventHurdleRateReasonCode = pBookingEventHurdleRateReasonCode;
    }

    /**
     * Sets the <code>bookingEventHurdleRateStatus</code> property.
     * <p>
     * 
     * @param pBookingEventHurdleRateStatus
     *            holds the new value of <code>bookingEventHurdleRateStatus</code>.<br>
     */
    public void setBookingEventHurdleRateStatus(
                final String pBookingEventHurdleRateStatus) {
        this.bookingEventHurdleRateStatus = pBookingEventHurdleRateStatus;
    }

    /**
     * Sets the <code>bookingEventRevenueRate</code> property.
     * <p>
     * 
     * @param pBookingEventRevenueRate
     *            holds the new value of <code>bookingEventRevenueRate</code>.<br>
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
     *            holds the new value of <code>bookingEventTotalRate</code>.<br>
     */
    public void setBookingEventTotalRate(final BigDecimal pBookingEventTotalRate) {
        this.bookingEventTotalRate = pBookingEventTotalRate;
    }

    /**
     * Sets the <code>interlineSegments</code> property.
     * <p>
     * 
     * @param pInterlineSegments
     *            holds the new value of <code>interlineSegments</code>.<br>
     */
    public void setInterlineSegments(
                final List<InterlineProrationSegmentDto> pInterlineSegments) {
        this.interlineSegments = pInterlineSegments;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            holds the new value of <code>oId</code>.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>onlineSegments</code> property.
     * <p>
     * 
     * @param pOnlineSegments
     *            holds the new value of <code>onlineSegments</code>.<br>
     */
    public void setOnlineSegments(
                final List<OnlineProrationSegmentDto> pOnlineSegments) {
        this.onlineSegments = pOnlineSegments;
    }
    
 //MH002 code changes starts
    
    public BigDecimal getBookingEventExportHandlingCost() {
        return this.bookingEventExportHandlingCost;
    }

    public void setBookingEventExportHandlingCost(final BigDecimal pBookingEventExportHandlingCost) {
        this.bookingEventExportHandlingCost = pBookingEventExportHandlingCost;
    }

    public BigDecimal getBookingEventTruckingCost() {
        return this.bookingEventTruckingCost;
    }

    public void setBookingEventTruckingCost(final BigDecimal pBookingEventTruckingCost) {
        this.bookingEventTruckingCost = pBookingEventTruckingCost;
    }

    public BigDecimal getBookingEventFuelCost() {
        return this.bookingEventFuelCost;
    }

    public void setBookingEventFuelCost(final BigDecimal pBookingEventFuelCost) {
        this.bookingEventFuelCost = pBookingEventFuelCost;
    }

    public BigDecimal getBookingEventImportHandlingCost() {
        return this.bookingEventImportHandlingCost;
    }

    public void setBookingEventImportHandlingCost(final BigDecimal pBookingEventImportHandlingCost) {
        this.bookingEventImportHandlingCost = pBookingEventImportHandlingCost;
    }

    public BigDecimal getBookingEventTransitHandlingCost() {
        return this.bookingEventTransitHandlingCost;
    }

    public void setBookingEventTransitHandlingCost(final BigDecimal pBookingEventTransitHandlingCost) {
        this.bookingEventTransitHandlingCost = pBookingEventTransitHandlingCost;
    }
    //MH002 code changes ends

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

	public String getHurdleRateReasonCodeType() {
		return hurdleRateReasonCodeType;
	}

	public void setHurdleRateReasonCodeType(String hurdleRateReasonCodeType) {
		this.hurdleRateReasonCodeType = hurdleRateReasonCodeType;
	}
}
