/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.rating.dto.constants.RatePercentageType;

import java.math.BigDecimal;

/**
 * <code>PercentageRateDto</code> class contain other charge rate, which is applicable for Percentage of
 * amount table type.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>percentageCharge
 * <li>ratePercentageType
 * </code>
 * </ul>
 */
public class PercentageRateDto extends OtherChargeRateDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2995057639259420533L;

    /**
     * Attribute to hold <code>percentageCharge</code>.
     * <p>
     * This holds the percentage charge applicable for calculating the other charge rate.
     */
    private BigDecimal percentageCharge;

    /**
     * Attribute to hold <code>ratePercentageType</code>.
     * <p>
     * This holds the percent applied to the different rates that are charged.
     */
    private RatePercentageType ratePercentageType;

    /**
     * <code>Default constructor</code>.
     */
    public PercentageRateDto() {

    }

    /**
     * Gets the <code>percentageCharge</code> property.
     * <p>
     * Represents the percentage charge applicable for calculating the other charge rate.
     * <p>
     * <b>Format: </b><br>
     * 1-9 BigDecimal<br>
     * <p>
     * <b>Example: </b><br>
     * 100.1
     * <p>
     * 
     * @return the current value of the <code>percentageCharge</code> property.<br>
     */
    public BigDecimal getPercentageCharge() {
        return this.percentageCharge;
    }

    /**
     * Gets the <code>ratePercentageType</code> property.
     * <p>
     * Represents the percent applied to the different rates that are charged.
     * <p>
     * 
     * @return the current value of the <code>ratePercentageType</code> property.<br>
     */
    public RatePercentageType getRatePercentageType() {
        return this.ratePercentageType;
    }

    /**
     * Sets the <code>percentageCharge</code> property.
     * <p>
     * Represents the percentage charge applicable for calculating the other charge rate.
     * <p>
     * <b>Format: </b><br>
     * 1-9 BigDecimal<br>
     * <b>Example: </b><br>
     * 100.369
     * <p>
     * 
     * @param pPercentageCharge the new value of the <code>percentageCharge</code> property.<br>
     */
    public void setPercentageCharge(final BigDecimal pPercentageCharge) {
        this.percentageCharge = pPercentageCharge;
    }

    /**
     * Sets the <code>ratePercentageType</code> property.
     * <p>
     * Represents the percent applied to the different rates that are charged.
     * <p>
     * 
     * @param pRatePercentageType the new value of the <code>ratePercentageType</code> property.<br>
     */
    public void setRatePercentageType(final RatePercentageType pRatePercentageType) {
        this.ratePercentageType = pRatePercentageType;
    }

    /**
     * This method overrides toString property.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the string value.<br>
     *         </p>
     */
    @Override
    public String toString() {
        final StringBuilder aCapacity = new StringBuilder();
        aCapacity.append(this.isBiDirectionalIndicator());
        aCapacity.append(this.getCurrency());
        aCapacity.append(this.getMaximumCharge());
        aCapacity.append(this.getMinimumCharge());
        aCapacity.append(this.getOtherChargeRateType().value());
        aCapacity.append(this.getWeightUOMType().value());
        aCapacity.append(this.ratePercentageType);
        aCapacity.append(this.percentageCharge);
        return aCapacity.toString();
    }

}
