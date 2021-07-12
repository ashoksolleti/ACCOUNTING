/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.ucs;

/**
 * The enumerated class <code>FlightDateType</code> represents the the input flight date type.
 * <p>
 * This contains the following Flight Date Type classifications.<br>
 * <ul>
 * <li><code>FOD</code></li>
 * <li><code>LFD</code></li>
 * <li><code>LFA</code></li>
 * </ul>
 */
public enum FlightDateType {

    /**
     * FOD represents Flight Origin Date.<br>
     */
    FLIGHTORIGIN("FOD"),
    /**
     * LFA represents Local Flight Arrival Date.<br>
     */
    LOCALARRIVAL("LFA"),
    /**
     * LFD represents Flight Departure Date.<br>
     */
    LOCALDEPARTURE("LFD");

    private final String flightDateType;

    /**
     * Constructor with the Value of Flight Date Type.
     * 
     * @param pFlightDateType
     *            the Flight Date Type
     */
    FlightDateType(final String pFlightDateType) {
        this.flightDateType = pFlightDateType;
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
     * @return the enumerated value of the flight date type.<br>
     *         </p>
     */
    public static FlightDateType fromValue(final String pValue) {
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
     * @return <code>FlightDateType</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public static FlightDateType getKey(final String pVal) {
        FlightDateType aKey = null;
        for (final FlightDateType aFlightDateType : FlightDateType.values()) {
            if (pVal.equalsIgnoreCase(aFlightDateType.getValue())) {
                aKey = aFlightDateType;
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
        return this.flightDateType;
    }

    /**
     * This method gives the string format of flight date type.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the flight date type.<br>
     */
    public String value() {
        return this.name();
    }
}