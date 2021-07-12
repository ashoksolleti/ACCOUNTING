package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/**
 * The enumerated class <code>ServiceType</code> represents the flight
 * information of type.
 * <p>
 * This contains the following Service Type classifications.<br>
 * <code>
 *  <ul>
 *  <li>ADDITIONAL_FLIGHTS_CARGO_OR_MAIL
 *  <li>ADDITIONAL_FLIGHTS_PASSENGER_NORMAL_SERVICE
 *  <li>ADDITIONAL_FLIGHTS_PASSENGER_OR_CARGO_IN_CABIN
 *  <li>ADDITIONAL_FLIGHTS_PASSENGER_SHUTTLE_MODE
 *  <li>SCHEDULED_PASSENGER_NORMAL_SERVICE
 *  <li>SCHEDULED_PASSENGER_SHUTTLE_MODE
 *  <li>SCHEDULED_PASSENGER_SERVICE_OPERATED_BY_SURFACE_VEHICLE
 *  <li>SCHEDULED_CARGO_MAIL_LOOSE_LOADED_CARGO_PRELOADED_DEVICES
 *  <li>SCHEDULED_CARGO_MAIL_SERVICE_OPERATED_BY_SURFACE_VEHICLE
 *  <li>SCHEDULED_CARGO_MAIL_MAIL_ONLY
 *  <li>CHARTER_PASSENGER_ONLY
 *  <li>SCHEDULED_PASSENGER_CARGO_IN_CABIN
 *  <li>CHARTER_REQUIRING_SPECIAL_HANDLING
 *  <li>CHARTER_PASSENGER_CARGO_MAIL
 *  <li>OTHERS_NON_REVENUE
 *  <li>OTHERS_TECHNICAL_TEST
 *  <li>OTHERS_TRAINING
 *  <li>OTHERS_GENERAL_AVIATION
 *  <li>OTHERS_SPECIAL
 *  <li>OTHERS_MILITARY
 *  <li>CHARTER_CARGO_ANDOR_MAIL
 *  </ul>
 *  </code>
 */
public enum FlightServiceType {
    /**
     * J - Scheduled, Passenger Normal Service.<br>
     */
    SCHEDULED_PASSENGER_NORMAL_SERVICE("J"),
    /**
     * S � Scheduled, Passenger Shuttle Mode.<br>
     */
    SCHEDULED_PASSENGER_SHUTTLE_MODE("S"),
    /**
     * U - Scheduled, Passenger Service Operated by surface Vehicle.<br>
     */
    SCHEDULED_PASSENGER_SERVICE_OPERATED_BY_SURFACE_VEHICLE("U"),
    /**
     * F � Scheduled, Cargo/Mail - Loose loaded cargo and/or preloaded devices.<br>
     */
    SCHEDULED_CARGO_MAIL_LOOSE_LOADED_CARGO_PRELOADED_DEVICES("F"),
    /**
     * V � Scheduled, Cargo/Mail - Service operated by surface vehicle.<br>
     */
    SCHEDULED_CARGO_MAIL_SERVICE_OPERATED_BY_SURFACE_VEHICLE("V"),
    /**
     * M � Scheduled, Cargo/Mail - Mail only.<br>
     */
    SCHEDULED_CARGO_MAIL_MAIL_ONLY("M"),
    /**
     * Q � Scheduled, Passenger/Cargo in cabin (pax cum freighter).<br>
     */
    SCHEDULED_PASSENGER_CARGO_IN_CABIN("Q"),
    /**
     * ASM represents Additional Flights, Passenger Normal Service.<br>
     */
    ADDITIONAL_FLIGHTS_PASSENGER_NORMAL_SERVICE("G"),
    /**
     * SSM represents SSM.<br>
     */
    ADDITIONAL_FLIGHTS_PASSENGER_SHUTTLE_MODE("B"),
    /**
     * Active represents Active.<br>
     */
    ADDITIONAL_FLIGHTS_CARGO_OR_MAIL("A"),
    /**
     * ASMSC represents ASMSC.<br>
     */
    ADDITIONAL_FLIGHTS_PASSENGER_OR_CARGO_IN_CABIN("R"),
    /**
     * C � Charter, Passenger Only.<br>
     */
    CHARTER_PASSENGER_ONLY("C"),
    /**
     * O � Charter, Charter requiring special handling (e.g Migrants /Immigrant
     * flights).<br>
     */
    CHARTER_REQUIRING_SPECIAL_HANDLING("O"),
    /**
     * Charter, Cargo and/or Mail.<br>
     */
    CHARTER_CARGO_ANDOR_MAIL("H"),

    /**
     * L � Charter, Passenger and Cargo and/or Mail.<br>
     */
    CHARTER_PASSENGER_CARGO_MAIL("L"),

    /**
     * P � Others, Non-revenue (Positioning/Ferry/Delivery/Demo).<br>
     */
    OTHERS_NON_REVENUE("P"),

    /**
     * T � Others, Technical Test.<br>
     */
    OTHERS_TECHNICAL_TEST("T"),

    /**
     * K � Others, Training (School/Crew check).<br>
     */
    OTHERS_TRAINING("K"),

    /**
     * D � Others, General Aviation.<br>
     */
    OTHERS_GENERAL_AVIATION("D"),
    /**
     * E � Others, Special (FAA /Government).<br>
     */
    OTHERS_SPECIAL("E"),
    /**
     * W � Others, Military.<br>
     */
    OTHERS_MILITARY("W");

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
    FlightServiceType(final String pValue) {
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
     * @return the enumerated value of the service type.<br>
     *         </p>
     */
    public static FlightServiceType fromValue(final String pValue) {
        return FlightServiceType.valueOf(pValue);
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
     * @return <code>ServiceType</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public static FlightServiceType getKey(final String pValue) {
        FlightServiceType aKey = null;
        for (final FlightServiceType aServiceType : FlightServiceType.values()) {
            if (pValue.equalsIgnoreCase(aServiceType.getValue())) {
                aKey = aServiceType;
            }
        }
        return aKey;
    }

    /**
     * This method checks if the flight is cargo only flight by checking the
     * service.
     * <p>
     * 
     * @param pServiceType
     *            <code>String</code><br>
     *            The service type.<br>
     *            <p>
     * @return <code>boolean</code><br>
     *         Values : 1. Returns 'true' if the service type is F,V,M or A
     *         2.Returns 'False' if the service type is not F,V,M or A.<br>
     */
    public static boolean isCargoOnlyFlight(final FlightServiceType pServiceType) {
        boolean isCargoOnly = false;
        if (FlightServiceType.SCHEDULED_CARGO_MAIL_SERVICE_OPERATED_BY_SURFACE_VEHICLE
                    .equals(pServiceType)
                    || FlightServiceType.SCHEDULED_CARGO_MAIL_LOOSE_LOADED_CARGO_PRELOADED_DEVICES
                                .equals(pServiceType)
                    || FlightServiceType.SCHEDULED_CARGO_MAIL_MAIL_ONLY
                                .equals(pServiceType)
                    || FlightServiceType.ADDITIONAL_FLIGHTS_CARGO_OR_MAIL
                                .equals(pServiceType)
                    || FlightServiceType.CHARTER_CARGO_ANDOR_MAIL
                                .equals(pServiceType)) {
            isCargoOnly = true;
        }
        return isCargoOnly;
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
     * This method gives the string format of service type.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the service type.<br>
     */
    public String value() {
        return this.name();
    }
}