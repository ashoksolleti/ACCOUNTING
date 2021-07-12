/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.math.BigDecimal;

/**
 * <code>PerEventAndShipmentRateDto</code> class contain other charge rate, which is applicable for Total per
 * event and Charges per shipment piece table type.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>rate
 * </code>
 * </ul>
 */
public class PerEventAndShipmentRateDto extends OtherChargeRateDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4195652310536335224L;

    /**
     * Attribute to hold <code>rate</code>.
     * <p>
     * Represents the rate applicable for the other charge.
     */
    private BigDecimal rate;

    /**
     * <code>Default constructor</code>.
     */
    public PerEventAndShipmentRateDto() {

    }

    /**
     * Gets the <code>rate</code> property.
     * <p>
     * Represents the rate applicable for the other charge.
     * <p>
     * <b>Format: </b><br>
     * 1-9 BigDecimal<br>
     * <b>Example: </b><br>
     * 100.369
     * <p>
     * 
     * @return the current value of the <code>rate</code> property.<br>
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Sets the <code>rate</code> property.
     * <p>
     * Represents the rate applicable for the other charge.
     * <p>
     * <b>Format: </b><br>
     * 1-9 BigDecimal<br>
     * <b>Example: </b><br>
     * 100.369
     * <p>
     * 
     * @param pRate the new value of the <code>rate</code> property.<br>
     */
    public void setRate(final BigDecimal pRate) {
        this.rate = pRate;
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
        aCapacity.append(this.rate);
        return aCapacity.toString();
    }
}
