/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.rating.dto.constants.WeightType;

/**
 * <code>WeightRateDto</code> class is used to maintain other charge for Weight charges per HAWB and Weight
 * charges per MAWB.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>breakPointTable
 * <li>weightType
 * </code>
 * </ul>
 */
public class WeightRateDto extends OtherChargeRateDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -850060967447550861L;

    /**
     * Attribute to hold <code>breakPointTable</code>.
     * <p>
     * Represents the instance of <code>BreakPointTableDto</code>.
     */
    private BreakPointTableDto breakPointTable;

    /**
     * Attribute to hold <code>weightType</code>.
     * <p>
     * This indicates how the other charge should be generated based on the type of weight charges.
     */
    private WeightType weightType;

    /**
     * <code>Default constructor</code>.
     */
    public WeightRateDto() {

    }

    /**
     * Gets the <code>breakPointTable</code> property.
     * <p>
     * Represents the instance of <code>BreakPointTableDto</code>.
     * <p>
     * 
     * @return the current value of the <code>breakPointTable</code> property.<br>
     */
    public BreakPointTableDto getBreakPointTable() {
        return this.breakPointTable;
    }

    /**
     * Gets the <code>weightType</code> property.
     * <p>
     * This indicates how the other charge should be generated based on the type of weight charges.
     * <p>
     * 
     * @return the current value of the <code>weightType</code> property.<br>
     */
    public WeightType getWeightType() {
        return this.weightType;
    }

    /**
     * Sets the <code>breakPointTable</code> property.
     * <p>
     * Represents the instance of <code>BreakPointTableDto</code>.
     * <p>
     * 
     * @param pBreakPointTable the new value of the <code>breakPointTable</code>.<br>
     */
    public void setBreakPointTable(final BreakPointTableDto pBreakPointTable) {
        this.breakPointTable = pBreakPointTable;
    }

    /**
     * Sets the <code>weightType</code> property.
     * <p>
     * This indicates how the other charge should be generated based on the type of weight charges.
     * <p>
     * 
     * @param pWeightType the new value of the <code>weightType</code>.<br>
     */
    public void setWeightType(final WeightType pWeightType) {
        this.weightType = pWeightType;
    }

    /**
     * This method overrides toString property.
     * <p>
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
        aCapacity.append(this.weightType);
        return aCapacity.toString();
    }
}
