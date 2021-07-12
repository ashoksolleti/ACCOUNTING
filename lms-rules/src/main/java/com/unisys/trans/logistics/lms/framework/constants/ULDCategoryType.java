/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * Enum to describe the uld category. One of the following ULD category position in the flight apply: U -
 * Upper deck position. T - Tall upper deck position. L - Lower deck position. B - Both upper and lower deck
 * position. C - Lower deck container.
 */
public enum ULDCategoryType {

    /**
     * Both upper and lower deck position in the flight.
     */
    BOTH_UPPER_AND_LOWER_DECK_POSITION("B"),

    /**
     * Lower deck container in the flight.
     */
    LOWER_DECK_CONTAINER("C"),

    /**
     * Lower deck position in the flight.
     */
    LOWER_DECK_POSITION("L"),

    /**
     * Tall upper deck position in the flight.
     */
    TALL_UPPER_DECK_POSITION("T"),

    /**
     * Upper deck position in the flight.
     */
    UPPER_DECK_POSITION("U");

    /**
     * /** Attribute to hold the <code>val</code> property.
     */
    private String val;

    /**
     * <code>Parameterized Constructor.</code>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.<br>
     */
    ULDCategoryType(final String pValue) {
        this.val = pValue;
    }

    /**
     * Gets the enum constant for the given value.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.<br>
     * @return <code>ULDCategoryType</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public static ULDCategoryType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the value of the enum constant.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public String getValue() {
        return this.val;
    }

    /**
     * Gets the string value of the enum.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public String value() {
        return this.name();
    }
}
