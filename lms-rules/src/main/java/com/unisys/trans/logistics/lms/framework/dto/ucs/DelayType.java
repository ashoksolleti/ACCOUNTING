/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.ucs;

/**
 * The enumerated class <code>DelayType</code> represents the the arrival or departure delay of the flight.
 * <p>
 * This contains the following delay classifications.<br>
 * <ul>
 * <li><code>A</code></li>
 * <li><code>D</code></li>
 * </ul>
 */
public enum DelayType {
    /**
     * A represents ARRIVAL.<br>
     */
    ARRIVAL("A"),

    /**
     * D represents DEPARTURE.<br>
     */
    DEPARTURE("D");

    private final String delayType;

    /**
     * <code>Parameterized Constructor.</code>
     * <p>
     * 
     * @param pDelayType
     *            holds the Flight Date Type
     */
    DelayType(final String pDelayType) {
        this.delayType = pDelayType;
    }

    /**
     * Returns the enumerated value.
     * 
     * @param pValue
     *            value of enumerated <code>DelayType</code>.
     *            <p>
     * @return the enumerated value of the <code>DelayType</code>.<br>
     */
    public static DelayType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the key of the <code>DelayType</code>.
     * <p>
     * 
     * @param pVal
     *            value of the <code>DelayType</code>.
     *            <p>
     * @return the current value of <code>DelayType</code>.<br>
     */
    public static DelayType getKey(final String pVal) {
        DelayType aKey = null;
        for (final DelayType aDelayType : DelayType.values()) {
            if (pVal.equalsIgnoreCase(aDelayType.getValue())) {
                aKey = aDelayType;
            }
        }
        return aKey;
    }

    /**
     * Gets the value of the <code>DelayType</code>.
     * <p>
     * 
     * @return the value of the <code>DelayType</code>.<br>
     */
    public String getValue() {
        return this.delayType;
    }

    /**
     * Gives the string format of <code>DelayType</code>.
     * <p>
     * 
     * @return the enumerated value of the <code>DelayType</code>.<br>
     */
    public String value() {
        return this.name();
    }

}