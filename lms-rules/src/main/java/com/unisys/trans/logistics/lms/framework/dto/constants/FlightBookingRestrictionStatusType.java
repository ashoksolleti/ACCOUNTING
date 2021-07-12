package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * <code>MCTStatusType</code> holds the constants to indicate MCTStatusType
 * applied.
 * <p>
 * Following are the possible MCTStatusType:<br>
 * <ul>
 * <li>NO_RESTRICTION
 * <li>RESTRICTION_EXIST_NON_OVERRIDEABLE
 * <li>RESTRICTION_EXIST_OVERRIDEABLE
 * 
 * </ul>
 * **/

public enum FlightBookingRestrictionStatusType {
    /**
     * This is an enumerated FlightBookingRestrictionStatusType constant to specify
     * FlightBookingRestrictionStatus Type -
     * NO_RESTRICTION.
     * <p>
     * value = {@value}
     */

    NO_RESTRICTION(0),
    /**
     * This is an enumerated FlightBookingRestrictionStatusType constant to specify
     * FlightBookingRestrictionStatusType -
     * IMPOSSIBLE RESTRICTION_EXIST_NON_OVERRIDEABLE.
     * <p>
     * value = {@value}
     */

    RESTRICTION_EXIST_NON_OVERRIDEABLE(2),
    /**
     * This is an enumerated FlightBookingRestrictionStatusType constant to specify
     * FlightBookingRestrictionStatusType -
     * RESTRICTION_EXIST_OVERRIDEABLE.
     * <p>
     * value = {@value}
     */

    RESTRICTION_EXIST_OVERRIDEABLE(1);
    /**
     * Attribute to holds <code> flightBookingRestrictionStatusType</code> property.
     */

    private int flightBookingRestrictionStatusType;

    /**
     * Constructor with FlightBookingRestrictionType as an argument.
     * <p>
     * 
     * @param pFlightBookingRestrictionType
     *            Holds the FlightBookingRestrictionType.
     */
    private FlightBookingRestrictionStatusType(final int pFlightBookingRestrictionType) {
        this.flightBookingRestrictionStatusType = pFlightBookingRestrictionType;
    }

    /**
     * Gets the value of the FlightBookingRestrictionStatusType.
     * 
     */

    public int getFlightBookingRestrictionStatusType() {
        return this.flightBookingRestrictionStatusType;
    }

    /**
     * Sets the value of the FlightBookingRestrictionStatusType property.
     * 
     */
    public void setFlightBookingRestrictionStatusType(final int pFlightBookingRestrictionStatusType) {
        this.flightBookingRestrictionStatusType = pFlightBookingRestrictionStatusType;
    }

    /**
     * Gives the string format of enumerated <code>FlightBookingRestrictionStatusType</code>.
     * <p>
     * 
     * @return the current string value of the <code>FlightBookingRestrictionStatusType</code>.
     */
    public int value() {
        return this.getFlightBookingRestrictionStatusType();
    }
}
