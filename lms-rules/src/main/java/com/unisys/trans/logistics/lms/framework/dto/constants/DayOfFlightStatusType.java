package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * <code>DayOfFlightStatusType</code> holds the constants to indicate
 * DayOfFlightStatusType applied.
 * <p>
 * Following are the possible DayOfFlightStatusType:<br>
 * <ul>
 * <li>DAY_OF_FLIGHT_CAPACITY_EXIST
 * <li>DAY_OF_FLIGHT_CAPACITY_EXIST_AND_FINALIZED
 * <li>DAY_OF_FLIGHT_CAPACITY_EXIST_AND_CLOSED
 * <li>DAY_OF_FLIGHT_CAPACITY_DOES_NOT_EXIST_VALID_FOR_CREATION
 * <li>DAY_OF_FLIGHT_CAPACITY_DOES_NOT_EXIST_NOT_STOP_BOOKING
 * <li>DAY_OF_FLIGHT_CAPACITY_EXIST_UNDERGOING_SCHEDULE_CHANGE
 * 
 * 
 * </ul>
 * **/
public enum DayOfFlightStatusType {

    /**
     * The enum constant represents Status Day of Flight capacity does not exist for non stop booking.
     * 5 enum constant returns the value 'DAY_OF_FLIGHT_CAPACITY_DOES_NOT_EXIST_NOT_STOP_BOOKING'.
     * <p>
     * value = {@value}
     * 
     */
    DAY_OF_FLIGHT_CAPACITY_DOES_NOT_EXIST_NOT_STOP_BOOKING(5),
    /**
     * The enum constant represents Status Day of Flight capacity does not exist for creation.
     * 4 enum constant returns the value 'DAY_OF_FLIGHT_CAPACITY_DOES_NOT_EXIST_VALID_FOR_CREATION'.
     * <p>
     * value = {@value}
     */
    DAY_OF_FLIGHT_CAPACITY_DOES_NOT_EXIST_VALID_FOR_CREATION(4),
    /**
     * The enum constant represents Status Day of Flight capacity does not exist for creation.
     * 1 enum constant returns the value 'DAY_OF_FLIGHT_CAPACITY_EXIST'.
     * <p>
     * value = {@value}
     */
    DAY_OF_FLIGHT_CAPACITY_EXIST(1),
    /**
     * The enum constant represents Status Day of Flight capacity exist and is closed.
     * 3 enum constant returns the value 'DAY_OF_FLIGHT_CAPACITY_EXIST_AND_CLOSED'.
     * <p>
     * value = {@value}
     */
    DAY_OF_FLIGHT_CAPACITY_EXIST_AND_CLOSED(3),
    /**
     * The enum constant represents Status Day of Flight capacity exist and is finalized.
     * 2 enum constant returns the value 'DAY_OF_FLIGHT_CAPACITY_EXIST_AND_FINALIZED'.
     * <p>
     * value = {@value}
     */
    DAY_OF_FLIGHT_CAPACITY_EXIST_AND_FINALIZED(2),
    
    DAY_OF_FLIGHT_CAPACITY_CANCELED(7),
    /**
     * The enum constant represents Status Day of Flight capacity exist and is undergoing schedule change.
     * 6 enum constant returns the value 'DAY_OF_FLIGHT_CAPACITY_EXIST_UNDERGOING_SCHEDULE_CHANGE'.
     * <p>
     * value = {@value}
     */
    DAY_OF_FLIGHT_CAPACITY_EXIST_UNDERGOING_SCHEDULE_CHANGE(6);

    /**
     * The enum constant represents Status Day of Flight capacity exist and is closed.
     * Attribute to holds <code>dayOfFlightStatusType</code> property.
     * <p>
     * value = {@value}
     */
    private int dayOfFlightStatusType;

    /**
     * Constructor with DayOfFlightStatusType as an argument.
     * <p>
     * 
     * @param pDayOfFlightStatusType
     *            DayOfFlightStatusType Holds the DayOfFlightStatusType.
     */

    private DayOfFlightStatusType(final int pDayOfFlightStatusType) {
        this.dayOfFlightStatusType = pDayOfFlightStatusType;
    }

    /**
     * Gets the value of the DayOfFlightStatusType.
     * 
     */
    public int getDayOfFlightStatusType() {
        return this.dayOfFlightStatusType;
    }

    /**
     * Sets the value of theDayOfFlightStatusType.
     * 
     * @param pDayOfFlightStatusType
     */

    public void setDayOfFlightStatusType(final int pDayOfFlightStatusType) {
        this.dayOfFlightStatusType = pDayOfFlightStatusType;
    }

    /**
     * Gives the string format of enumerated <code>DayOfFlightStatusType</code>.
     * <p>
     * 
     * @return the current string value of the <code>DayOfFlightStatusType</code>.
     */
    public int value() {
        return this.getDayOfFlightStatusType();
    }
}
