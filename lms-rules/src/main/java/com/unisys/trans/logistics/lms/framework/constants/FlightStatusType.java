/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * The enumerated class <code> Flight Status </code> represents the the flight status at arrival/departure
 * station.
 * <p>
 * This contains the following flight status classifications.<br>
 * <ul>
 * <li><code>Arrived</code></li>
 * <li><code>Cancelled</code></li>
 * <li><code>Delayed</code></li>
 * <li><code>Departed</code></li>
 * <li><code>Diverted</code></li>
 * <li><code>Early</code></li>
 * <li><code>Early?</code></li>
 * <li><code>Inflight</code></li>
 * <li><code>Landed</code></li>
 * <li><code>Late</code></li>
 * <li><code>Late?</code></li>
 * <li><code>Locked</code></li>
 * <li><code>Ontime</code></li>
 * <li><code>Returning</code></li>
 * </ul>
 */
public enum FlightStatusType {

    /**
     * It represents the status Arrived.<br>
     */
    ARRIVED("Arrived"),
    /**
     * It represents the status Cancelled.<br>
     */
    CANCELLED("Cancelled"),
    /**
     * It represents the status Delayed.<br>
     */
    DELAYED("Delayed"),
    /**
     * It represents the status Departed.<br>
     */
    DEPARTED("Departed"),
    /**
     * It represents the status Diverted.<br>
     */
    DIVERTED("Diverted"),
    /**
     * It represents the status Early.<br>
     */
    EARLY("Early"),
    /**
     * It represents the status Early?.<br>
     */
    EARLY_UNCONFIRMED("Early?"),
    /**
     * It represents the status Inflight.<br>
     */
    INFLIGHT("Inflight"),
    /**
     * It represents the status Inflight.<br>
     */
    SCHEDULED("Scheduled"),    // LMSC-11111 UIS158 Change
    /**
     * It represents the status Landed.<br>
     */
    LANDED("Landed"),
    /**
     * It represents the status Late.<br>
     */
    LATE("Late"),
    /**
     * It represents the status Late?.<br>
     */
    LATE_UNCONFIRMED("Late?"),
    /**
     * It represents the status Locked.<br>
     */
    LOCKED("Locked"),
    /**
     * It represents the status On Time.<br>
     */
    ONTIME("On Time"),
    /**
     * It represents the status Returning.<br>
     */
    RETURNING("Returning");
    /**
     * Attribute to hold the <code>value</code> property.
     */
    private String value;

    /**
     * <code> Parameterized Constructor.</code>
     * 
     * @param pValue
     *            <code>String</code><br>
     *            Contains the enum value.<br>
     */
    FlightStatusType(final String pValue) {
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
     * @return the enumerated value of the flight status.<br>
     *         </p>
     */
    public static FlightStatusType fromValue(final String pValue) {
        return FlightStatusType.valueOf(pValue);
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
     * @return <code>FlightStatus</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public static FlightStatusType getKey(final String pValue) {
        FlightStatusType aKey = null;
        for (final FlightStatusType aFlightStatus : FlightStatusType.values()) {
            if (pValue.equalsIgnoreCase(aFlightStatus.getValue())) {
                aKey = aFlightStatus;
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
     * This method gives the string format of flight status.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the flight status.<br>
     */
    public String value() {
        return this.name();
    }
}