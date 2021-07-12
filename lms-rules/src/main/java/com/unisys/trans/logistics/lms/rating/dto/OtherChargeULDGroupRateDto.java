/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>OtherChargeULDGroupRateDto</code> class contain information specific to an ULD groups.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>uldGroupRates
 * </code>
 * </ul>
 */
public class OtherChargeULDGroupRateDto extends OtherChargeRateDto {

    /**
     * Holds the value for the maximum possible occurrences of uld group rates.
     * <p>
     * Value = {@value}
     */
    private static final int ALLOWABLE_ULD_GROUP_RATES = 10;

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5703728116893189984L;

    /**
     * Attribute to hold <code>uldGroupRates</code>.
     * <p>
     * This hold the values of UldRate and UldGroup which occur maximum of 10 times.
     */
    private List<ULDGroupRateDto> uldGroupRates = new ArrayList<ULDGroupRateDto>(ALLOWABLE_ULD_GROUP_RATES);

    /**
     * <code>Default constructor</code>.
     */
    public OtherChargeULDGroupRateDto() {

    }

    /**
     * Gets the <code>otherChargeDetails</code> property.
     * <p>
     * Represents the list of uldGroupRates which is applicable for an other charge type.
     * <p>
     * 
     * @return the current list of the <code>uldGroupRates</code> property.<br>
     */
    public List<ULDGroupRateDto> getUldGroupRates() {
        return this.uldGroupRates;
    }

    /**
     * Sets the <code>uldGroupRates</code> property.
     * <p>
     * Represents the uldGroupRates applicable for an other charge rate type.
     * <p>
     * 
     * @param pULDGroupRates the new list of the <code>uldGroupRates</code> property.<br>
     */
    public void setUldGroupRates(final List<ULDGroupRateDto> pULDGroupRates) {
        this.uldGroupRates = pULDGroupRates;
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
        return aCapacity.toString();
    }

}
