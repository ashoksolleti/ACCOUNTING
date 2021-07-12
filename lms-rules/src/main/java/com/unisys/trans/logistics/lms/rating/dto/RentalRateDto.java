/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

/**
 * <code>RentalRateDto</code> class is used to maintain other charge for Rental rate per item per minute,
 * Rental rate per item per day and Charges based on COD table type.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>breakPointTable
 * </code>
 * </ul>
 */
public class RentalRateDto extends OtherChargeRateDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5133601738312460485L;

    /**
     * Attribute to hold <code>breakPointTable</code>.
     * <p>
     * Represents the instance of <code>BreakPointTableDto</code>.
     */
    private BreakPointTableDto breakPointTable;

    /**
     * <code>Default constructor</code>.
     */
    public RentalRateDto() {

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