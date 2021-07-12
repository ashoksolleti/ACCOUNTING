//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>TotalChargesType</code> holds the constants to indicate TotalCharges type applied.
 * <p>
 * Following are the possible TotalCharges type:<br>
 * <ul>
 * <li>COLLECT
 * <li>PREPAID
 * <li>WEIGHT
 * </ul>
 */
public enum TotalChargesType {

    /**
     * Constant used for Percent Reduction.
     */
    COLLECT("Collect"),

    /**
     * Constant used for Percent Reduction.
     */
    PREPAID("Prepaid"),

    /**
     * Constant used for Percent Reduction.
     */
    WEIGHT("Weight");

    /**
     * Attribute to hold the <code>totalChargesType</code> property.
     */
    private String totalChargesType;

    /**
     * Parameterize constructor.
     * 
     * @param pTotalChargesType
     *            the totalChargesType.
     */
    TotalChargesType(final String pTotalChargesType) {
        this.totalChargesType = pTotalChargesType;
    }

    /**
     * Gets the <code>totalChargesType</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalChargesType</code> property.
     */
    public String getTotalChargesType() {
        return this.totalChargesType;
    }

    /**
     * Gives the string format of enumerated <code>ShipmentStatusType</code>.
     * <p>
     * 
     * @return the current string value of the <code>ShipmentStatusType</code>.
     */
    public String value() {
        return this.name();
    }
}
