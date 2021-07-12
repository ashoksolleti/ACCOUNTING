package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/**
 * 
 * Represents the status of the flight. It also provides various options such as SCM, SCA, etc that indicates
 * the flight information is locked and cannot be manipulated.
 */
public enum FlightStatusType {
    /** 
	 */
    IN_PROGRESS,
    /**
     * Enter Customs Application in Progress
     */
    ECA_IN_PROGRESS,
    /**
     * Flight has been finalized for the day (active).
     */
    FINALIZED,
    /**
     * Profile locked during master schedule change (applicable only for master profiles).
     */
    MASTER_SCHEDULE_CHANGE,
    /**
     * Profile locked during active schedule change (applicable only for active profiles).
     */
    ACTIVE_SCHEDULE_CHANGE,
    /**
     * Flight has been cancelled for the day (active).
     */
    CANCELLED,
    /**
     * Manifest Edit has locked the active flight profile
     */
    MANIFEST_EDIT,
    /**
     * Booking re-accommodations has locked the active flight profile.
     */
    BOOKING_REACCOMODATION;

    public boolean isFlightScheduleChanged() {
        return FlightStatusType.ACTIVE_SCHEDULE_CHANGE.equals(this)
                    || FlightStatusType.MASTER_SCHEDULE_CHANGE.equals(this);
    }
}