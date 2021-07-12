/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * Holds the possible values for the flight status indicating whether the flight is closed or re-opened to
 * shipments.
 */
public enum FlightCloseStatusType {
    /**
     * Flight is closed except for express and booked shipments.
     */
    CLOSE_FLIGHT_EXCEPT_EXPRESS_AND_BOOKED_SHIPMENTS("Y"),
    /**
     * Flight is closed to all non-express shipments.
     */
    CLOSE_FLIGHT_TO_ALL_NON_EXPRESS_SHIPMENTS("P"),
    /**
     * Flight is closed to all shipments and releases unused allotment and guaranteed booking capacity space
     * (GBC) to the down line stations.
     */
    CLOSE_FLIGHT_TO_ALL_SHIPMENTS_AND_RELEASE_CAPACITY("C"),
    /**
     * Flight is closed to all shipments except for booked shipments.
     */
    CLOSE_FLIGHT_TO_ALL_SHIPMENTS_EXCEPT_BOOKED_SHIPMENTS("X"),
    /**
     * Flight is closed to all shipments without releasing unused allotment or guaranteed booking capacity
     * space (GBC) to the down line stations.
     */
    CLOSE_FLIGHT_TO_ALL_SHIPMENTS_WITHOUT_RELEASING_CAPACITY("S"),
    /**
     * The initial status - Flight is open to assignment for all shipments (indicating that the flight has
     * never been set to a close or re-open status).
     */
    INITIAL_STATUS("O"),
    /**
     * Flight is reopened only for booked shipments.
     */
    REOPEN_FLIGHT_ONLY_FOR_BOOKED_SHIPMENTS("B"),
    /**
     * Flight is reopened only for express shipments.
     */
    REOPEN_FLIGHT_ONLY_FOR_EXPRESS_SHIPMENTS("Q"),
    /**
     * Flight is reopened only to express and booked shipments.
     */
    REOPEN_FLIGHT_ONLY_TO_EXPRESS_AND_BOOKED_SHIPMENTS("Z"),
    /**
     * Flight is reopened to all shipments.
     */
    REOPEN_FLIGHT_TO_ALL_SHIPMENTS("R"),
    /**
     * Flight is reopened to all shipments only after a strictly close flight.
     */
    REOPEN_FLIGHT_TO_ALL_SHIPMENTS_AFTER_STRICTLY_CLOSE_FLIGHT("G"),
    /**
     * Flight is strictly closed to all assignments and removals except for authorized users.
     */
    STRICTLY_CLOSED_EXCEPT_AUTHORIZED_USERS("H");

    /**
     * Attribute to hold the openCloseType property.
     */
    private String openCloseType;

    /**
     * Constructor.
     * 
     * @param pOpenCloseType The request object holds the Rate Type Code.<br>
     */
    FlightCloseStatusType(final String pOpenCloseType) {
        this.openCloseType = pOpenCloseType;
    }

    /**
     * The <code>fromValue</code> method returns the FlightCloseStatus value.
     * <p>
     * 
     * @param pOpenCloseType The request object holds the open close type.<br>
     * @return <code>FlightCloseStatusType</code><br>
     *         Returns the enumerated value of the FlightCloseStatusType class.<br>
     */
    public static FlightCloseStatusType fromValue(final String pOpenCloseType) {

        FlightCloseStatusType aFlightCloseStatus = null;
        for (final FlightCloseStatusType anOpenCloseType : FlightCloseStatusType.values()) {
            if (anOpenCloseType.getOpenCloseType().equals(pOpenCloseType)) {
                aFlightCloseStatus = anOpenCloseType;
                break;
            }
        }
        return aFlightCloseStatus;
    }

    /**
     * Gets the value of <code>openCloseType</code> property.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the current value of the <code>openCloseType</code> property.<br>
     *         </p>
     */
    public String getOpenCloseType() {
        return this.openCloseType;
    }

    /**
     * The <code>value</code> method returns the string value of FlightCloseStatusType.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the FlightCloseStatusType class.<br>
     */
    public String value() {
        return this.getOpenCloseType();
    }
}