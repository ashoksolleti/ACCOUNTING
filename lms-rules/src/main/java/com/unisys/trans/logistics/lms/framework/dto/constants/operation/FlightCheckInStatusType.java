package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/**
 * Represents the various check-in statuses that a flight goes through during flight export processing.
 * 
 * @author FlowerHeart
 */
public enum FlightCheckInStatusType {
    /**
     * The flight check-in at Non-Mechanized Station is complete.
     */
    CHECK_IN_AT_NON_MECHANIZED_STATION_COMPLETE("Check-In at Non-Mechanized Station Complete"),
    /**
     * The flight check-in has begun.
     */
    CHECK_IN_BEGIN_COMPLETE("Check-in has begun"),
    /**
     * The flight check-in is complete.
     */
    CHECK_IN_COMPLETE("Check-in Complete");

    private String checkInStatus;

    FlightCheckInStatusType(final String pCheckInStatus) {
        this.checkInStatus = pCheckInStatus;
    }

    public String getCheckInStatus() {
        return this.checkInStatus;
    }
}