/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>TaxApplicabilityType</code> class holds the state type code.
 * <p>
 */
public enum TaxApplicabilityType {
    /**
     * Maintaining all states information.
     */
    ALL_STATES("A"),

    /**
     * Maintaining between states information.
     */
    BETWEEN_STATES("B");

    /**
     * Attribute to hold the <code>val</code>.<br>
     */
    private String val;

    /**
     * Constructor with <code>TaxApplicabilityType</code> as an argument.
     * <p>
     * 
     * @param pValue the new value of <code>TaxApplicabilityType</code>.
     */
    TaxApplicabilityType(final String pValue) {
        this.val = pValue;
    }

    /**
     * Gets the <code>TaxApplicabilityType</code> for the given value.
     * <p>
     * 
     * @param pValue the new value of <code>TaxApplicabilityType</code>.
     *            <p>
     * @return the new enumerated value of the <code>TaxApplicabilityType</code> property.
     */

    public static TaxApplicabilityType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the <code>TaxApplicabilityType</code> attribute.
     * <p>
     * 
     * @param pVal the new value of <code>TaxApplicabilityType</code> property.
     *            <p>
     * @return the current value of <code>TaxApplicabilityType</code> property.
     */
    public static TaxApplicabilityType getKey(final String pVal) {
        TaxApplicabilityType aKey = null;
        for (final TaxApplicabilityType bTaxApplicabilityType : TaxApplicabilityType.values()) {
            if (pVal.equalsIgnoreCase(bTaxApplicabilityType.getValue())) {
                aKey = bTaxApplicabilityType;
            }
        }
        return aKey;
    }

    /**
     * Gives the string format of enumerated <code>TaxApplicabilityType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>TaxApplicabilityType</code>.
     */

    public String getValue() {
        return this.val;
    }

    /**
     * Gives the string format of enumerated <code>TaxApplicabilityType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>TaxApplicabilityType</code>.
     */
    public String value() {
        return this.name();
    }
}
