/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/** 
 */
public enum FlightIrregularityType {
    /** 
	 */
    ASSIGNMENT("ASSIGNMENT", "Flight Assignment Irregularity"),
    /** 
	 */
    REMOVAL("REMOVAL", "Flight Removal Irregularity"),

    UPDATE("UPDATE", "Flight Update Irregularity");

    private String flightIrregularityCode;

    private String flightIrregularityDescription;

    FlightIrregularityType(String flightIrregularityCode, String flightIrregularityDescription) {
        this.flightIrregularityCode = flightIrregularityCode;
        this.flightIrregularityDescription = flightIrregularityDescription;
    }

    /**
     * Gets the value of the <code>flightIrregularityCode</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>flightIrregularityCode</code> property.
     */
    public String getFlightIrregularityCode() {
        return flightIrregularityCode;
    }

    /**
     * Gets the value of the <code>flightIrregularityDescription</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>flightIrregularityDescription</code> property.
     */
    public String getFlightIrregularityDescription() {
        return flightIrregularityDescription;
    }
}