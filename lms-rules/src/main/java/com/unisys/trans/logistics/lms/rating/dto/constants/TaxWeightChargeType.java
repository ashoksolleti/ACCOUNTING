/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>TaxWeightChargeType</code> class holds the value of weight charge codes.
 * <p>
 */
public enum TaxWeightChargeType {
    /**
     * Represents Actual tax.
     */
    ACTUAL_TAX("A"),
    /**
     * Represents Face tax.
     */
    FACE_TAX("F"),
    /**
     * Represents Not tax.
     */
    NOT_TAXED("N");
    /**
     * Attribute to hold the <code>val</code> property.
     */
    private String val;

    /**
     * Constructor with <code>TaxWeightChargeType</code> as an argument.
     * <p>
     * 
     * @param pValue the new value of <code>TaxWeightChargeType</code>.
     */

    TaxWeightChargeType(final String pValue) {
        this.val = pValue;
    }

    /**
     * Gets the <code>TaxWeightChargeType</code> for the given value.
     * <p>
     * 
     * @param pValue the new value of <code>TaxWeightChargeType</code>.
     *            <p>
     * @return the new enumerated value of the <code>TaxWeightChargeType</code> property.
     */

    public static TaxWeightChargeType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the <code>TaxWeightChargeType</code> attribute.
     * <p>
     * 
     * @param pValue the new value of <code>TaxWeightChargeType</code> property.
     *            <p>
     * @return the current value of <code>TaxWeightChargeType</code> property.
     */

    public static TaxWeightChargeType getKey(final String pValue) {
        TaxWeightChargeType aKey = null;
        for (final TaxWeightChargeType bTaxWeightChargeType : TaxWeightChargeType.values()) {
            if (pValue.equalsIgnoreCase(bTaxWeightChargeType.getValue())) {
                aKey = bTaxWeightChargeType;
            }
        }
        return aKey;
    }

    /**
     * Gives the string format of enumerated <code>TaxWeightChargeType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>TaxWeightChargeType</code>.
     */

    public String getValue() {
        return this.val;
    }

    /**
     * Gives the string format of enumerated <code>TaxWeightChargeType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>TaxWeightChargeType</code>.
     */

    public String value() {
        return this.name();
    }
}
