/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.ucs;

/**
 * <code>ScheduleType</code> class holds the schedule type constants.
 * <p>
 * This contains the following ScheduleTypes.<br>
 * <ul>
 * <li><code>BOTH</code></li>
 * <li><code>ASM</code></li>
 * <li><code>SSM</code></li>
 * </ul>
 */

public enum ScheduleType {

    /**
     * This is an enumerated schedule type constant for the BOTH ASM and SSM schedule.<br>
     */
    ADHOC_AND_STANDARD("BOTH"),
    /**
     * This is an enumerated schedule type constant for the Adhoc Schedule.<br>
     */
    ADHOC_SCHEDULE("ASM"),

    /**
     * This is an enumerated schedule type constant for the Current Schedule.<br>
     */
    CURRENT("CURRENT"),

    /**
     * This is an enumerated schedule type constant for the Standard Schedule.<br>
     */
    STANDARD_SCHEDULE("SSM"),
    /**
     * This is an enumerated schedule type constant for the Standard Schedule.<br>
     */
    ADHOC_CANCEL("CNL");

    /**
     * Attribute to hold the <code>value</code> property.
     */
    private String value;

    /**
     * <code>Parameterized Constructor.</code>
     * 
     * @param pValue
     *            <code>String</code><br>
     *            Contains the enum value.<br>
     */
    ScheduleType(final String pValue) {
        this.value = pValue;
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
     * @return the enumerated value of the schedule type.<br>
     *         </p>
     */
    public static ScheduleType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the key of the enum.
     * <p>
     * 
     * @param pValue
     *            <code>String</code><br>
     *            The value of the enumerated type.<br>
     *            </p>
     *            <p>
     * @return <code>ScheduleType</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public static ScheduleType getKey(final String pValue) {
        ScheduleType aKey = null;
        for (final ScheduleType aScheduleType : ScheduleType.values()) {
            if (pValue.equalsIgnoreCase(aScheduleType.getValue())) {
                aKey = aScheduleType;
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
        return this.value;
    }

    /**
     * This method gives the string format of schedule type.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the schedule type.<br>
     */
    public String value() {
        return this.name();
    }
}