package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.unisys.trans.logistics.lms.rating.dto.constants.AllotmentCategoryType;

/**
 * <code>RoutingProductDto</code> contain details of RoutingProduct.
 * <p>
 * This contains all information about Routing.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>awbType
 * <li>eventHurdleAmount
 * <li>hostPercentage
 * <li>productCode
 * <li>revenueTotalOtherCharges
 * <li>specialHandlingCodes
 * </ul>
 */
public class RoutingProductDto implements Serializable {

    private AllotmentCategoryType allotmentCategory;

    private boolean allotmentRestricted;

    public AllotmentCategoryType getAllotmentCategory() {
        return this.allotmentCategory;
    }

    public void setAllotmentCategory(final AllotmentCategoryType pAllotmentCategory) {
        this.allotmentCategory = pAllotmentCategory;
    }

    public boolean getAllotmentRestricted() {
        return this.allotmentRestricted;
    }

    public void setAllotmentRestricted(final boolean pAllotmentRestricted) {
        this.allotmentRestricted = pAllotmentRestricted;
    }

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 39323341848994862L;

    /**
     * Attribute to hold <code>awbType</code> property.
     */
    private String awbType;

    /**
     * Attribute to hold <code>eventHurdleAmount</code> property.
     */
    private BigDecimal eventHurdleAmount;

    /**
     * Attribute to hold <code>hostPercentage</code> property.
     */
    private BigDecimal hostPercentage;

    /**
     * Attribute to hold <code>productCode</code> property.
     */
    private String productCode;

    /**
     * Attribute to hold <code>revenueTotalOtherCharges</code> property.
     */
    private BigDecimal revenueTotalOtherCharges;
    
    /**
     * Attribute to hold <code>rateTypeInd</code> property.
     */
    private boolean rateTypeInd;

    /**
     * Attribute to hold <code>specialHandlingCodes</code> property.
     */
    private List<String> specialHandlingCodes;
    /**
     * Attribute to hold <code>revenuePercentage</code> property.
     */
    private BigDecimal revenuePercentage;
    /**
     * Attribute to hold <code>pricingOtherChargeDtos</code> property.
     */
    private List<PricingOtherChargeDto> pricingOtherChargeDtos;

    /**
     * Gets the <code>awbType</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbType</code> property.<br>
     */
    public String getAwbType() {
        return this.awbType;
    }

    /**
     * Gets the <code>revenuePercentage</code> property.
     * <p>
     * 
     * @return the current value of the <code>revenuePercentage</code> property.<br>
     */
    public BigDecimal getRevenuePercentage() {
		return this.revenuePercentage;
	}

    /**
     * Sets the <code>revenuePercentage</code> property.
     * 
     * @param pRevenuePercentage
     *            the new value of the <code>revenuePercentage</code> property.
     */
	public void setRevenuePercentage(BigDecimal pRevenuePercentage) {
		this.revenuePercentage = pRevenuePercentage;
	}

	/**
     * Gets the <code>eventHurdleAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>eventHurdleAmount</code> property.<br>
     */
    public BigDecimal getEventHurdleAmount() {
        return this.eventHurdleAmount;
    }

    /**
     * Gets the <code>hostPercentage</code> property.
     * <p>
     * 
     * @return the current value of the <code>hostPercentage</code> property.<br>
     */
    public BigDecimal getHostPercentage() {
        return this.hostPercentage;
    }

    /**
     * Gets the <code>productCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>productCode</code> property.<br>
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * Gets the <code>revenueTotalOtherCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revenueTotalOtherCharges</code> property.<br>
     */
    public BigDecimal getRevenueTotalOtherCharges() {
        return this.revenueTotalOtherCharges;
    }

    /**
     * Holds the list of string containing <code>specialHandlingCodes</code> details.
     * <p>
     * 
     * @return the current value of <code>specialHandlingCodes</code> details.
     */
    public List<String> getSpecialHandlingCodes() {
        return this.specialHandlingCodes;
    }

    /**
     * Sets the <code>awbType</code> property.
     * 
     * @param pAwbType
     *            the new value of the <code>awbType</code> property.
     */
    public void setAwbType(final String pAwbType) {
        this.awbType = pAwbType;
    }

    /**
     * Sets the <code>eventHurdleAmount</code> property.
     * 
     * @param pEventHurdleAmount
     *            the new value of the <code>eventHurdleAmount</code> property.
     */
    public void setEventHurdleAmount(final BigDecimal pEventHurdleAmount) {
        this.eventHurdleAmount = pEventHurdleAmount;
    }

    /**
     * Sets the <code>hostPercentage</code> property.
     * 
     * @param pHostPercentage
     *            the new value of the <code>hostPercentage</code> property.
     */
    public void setHostPercentage(final BigDecimal pHostPercentage) {
        this.hostPercentage = pHostPercentage;
    }

    /**
     * Sets the <code>productCode</code> property.
     * 
     * @param pProductCode
     *            the new value of the <code>productCode</code> property.
     */
    public void setProductCode(final String pProductCode) {
        this.productCode = pProductCode;
    }

    /**
     * Sets the <code>revenueTotalOtherCharges</code> property.
     * 
     * @param pRevenueTotalOtherCharges
     *            the new value of the <code>revenueTotalOtherCharges</code> property.
     */
    public void setRevenueTotalOtherCharges(final BigDecimal pRevenueTotalOtherCharges) {
        this.revenueTotalOtherCharges = pRevenueTotalOtherCharges;
    }

    /**
     * Sets the <code>specialHandlingCodes</code> property.
     * 
     * @param pSpecialHandlingCodes
     *            the new value of the <code>specialHandlingCodes</code> property.
     */
    public void setSpecialHandlingCodes(final List<String> pSpecialHandlingCodes) {
        this.specialHandlingCodes = pSpecialHandlingCodes;
    }

    /**
     * @return the rateTypeInd
     */
    public boolean isRateTypeInd() {
        return this.rateTypeInd;
    }

    /**
     * @param rateTypeInd the rateTypeInd to set
     */
    public void setRateTypeInd(final boolean pRateTypeInd) {
        this.rateTypeInd = pRateTypeInd;
    }

    /**
     * Gets the <code>pricingOtherChargeDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>pricingOtherChargeDtos</code> property.<br>
     */
	public List<PricingOtherChargeDto> getPricingOtherChargeDtos() {
		return this.pricingOtherChargeDtos;
	}

    /**
     * Sets the <code>pricingOtherChargeDtos</code> property.
     * 
     * @param pPricingOtherChargeDtos
     *            the new value of the <code>pricingOtherChargeDtos</code> property.
     */
	public void setPricingOtherChargeDtos(final List<PricingOtherChargeDto> pPricingOtherChargeDtos) {
		this.pricingOtherChargeDtos = pPricingOtherChargeDtos;
	}
}
