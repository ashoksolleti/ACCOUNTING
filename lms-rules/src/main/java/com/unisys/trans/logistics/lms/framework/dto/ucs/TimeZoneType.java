/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.ucs;

/**
 * <code>TimeZoneType</code> class holds the time mode of the flight such as Local or UTC.
 */

public enum TimeZoneType {

    /**
     * This is an enumerated time mode constant for the Local time (default) mode.<br>
     */
    LOCAL("L"),

    /**
     * This is an enumerated time mode constant for the Universal Time Coordinated (UTC) mode.<br>
     */
    UTC("U");

    /**
     * Attribute to hold the <code>val</code> property.
     */
    private String val;

    /**
     * <code>Parameterized Constructor.</code>
     * 
     * @param pVal
     *            <code>String</code><br>
     *            Contains the enum value.<br>
     */
    TimeZoneType(final String pVal) {
        this.val = pVal;
    }

    /**
     * This method returns the enumerated value.
     * <p>
     * 
     * @param pValue
     *            <code>String</code><br>
     *            The value of enumerated type.<br>
     *            </p>
     *            <p>
     * @return the enumerated value of the time mode.<br>
     *         </p>
     */
    public static TimeZoneType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the key of the enum.
     * <p>
     * 
     * @param pVal
     *            <code>String</code><br>
     *            The value of the enumerated type.<br>
     *            </p>
     *            <p>
     * @return <code>TimeZoneType</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public static TimeZoneType getKey(final String pVal) {
        TimeZoneType aKey = null;
        for (final TimeZoneType aTimeZoneType : TimeZoneType.values()) {
            if (pVal.equalsIgnoreCase(aTimeZoneType.getValue())) {
                aKey = aTimeZoneType;
            }
        }
        return aKey;
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
     * This method gives the string format of action type.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the action type.<br>
     */
    public String value() {
        return this.name();
    }
}