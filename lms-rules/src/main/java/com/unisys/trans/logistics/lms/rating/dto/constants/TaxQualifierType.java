/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>TaxQualifierType</code> class holds the value indicating the other charges, origin or destination
 * stations that are taxed.
 * <p>
 */
public enum TaxQualifierType {
    /**
     * Represents all othercharges/origins/destination.<br>
     */
    ALL("A"),
    /**
     * Represents that all othercharges/origins/destination except those listed are taxed.<br>
     */
    EXCEPTION("B"),
    /**
     * Represents that tax is specific to the othercharges/origins/destination listed.<br>
     */
    SPECIFIC("C");
    /**
     * Attribute to hold the <code>val</code>.<br>
     */
    private String val;

    /**
     * Constructor with <code>TaxQualifierType</code> as an argument.
     * <p>
     * 
     * @param pValue the new value of <code>TaxQualifierType</code>.
     */

    TaxQualifierType(final String pValue) {
        this.val = pValue;
    }

    /**
     * Gets the <code>TaxQualifierType</code> for the given value.
     * <p>
     * 
     * @param pValue the new value of <code>TaxQualifierType</code>.
     *            <p>
     * @return the new enumerated value of the <code>TaxQualifierType</code> property.
     */

    public static TaxQualifierType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the <code>TaxQualifierType</code> attribute.
     * <p>
     * 
     * @param pValue the new value of <code>TaxQualifierType</code> property.
     *            <p>
     * @return the current value of <code>TaxQualifierType</code> property.
     */

    public static TaxQualifierType getKey(final String pValue) {
        TaxQualifierType aKey = null;
        for (final TaxQualifierType bTaxQualifierType : TaxQualifierType.values()) {
            if (pValue.equalsIgnoreCase(bTaxQualifierType.getValue())) {
                aKey = bTaxQualifierType;
            }
        }
        return aKey;
    }

    /**
     * Gives the string format of enumerated <code>TaxQualifierType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>TaxQualifierType</code>.
     */

    public String getValue() {
        return this.val;
    }

    /**
     * Gives the string format of enumerated <code>TaxQualifierType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>TaxQualifierType</code>.
     */
    public String value() {
        return this.name();
    }
}
