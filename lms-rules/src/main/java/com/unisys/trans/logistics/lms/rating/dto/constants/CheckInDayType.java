/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>CheckInDayType</code> holds the constants to indicates whether the next day is free of storage
 * charges, if the goods are checked in on a Friday.
 * <p>
 * Valid values are:
 * <li>NEXT_DAY_IS_FREE
 * <li>NEXT_DAYS_IS_FREE_WITH_CHECK_CONTINGENCIES
 * <li>NO_FREE_DAYS <br>
 * Default value is: NO_FREE_DAYS
 */
public enum CheckInDayType {

    /**
     * Means that if goods are checked in on Friday the next day is free of storage charges.
     */
    NEXT_DAY_IS_FREE(2),
    /**
     * Means that the next day is free and if the goods are checked in before noon then storage starts at
     * 08:00, and if the goods are checked in after noon, then storage starts at noon.
     */
    NEXT_DAYS_IS_FREE_WITH_CHECK_CONTINGENCIES(3),
    /**
     * Means no free storage days if goods checked on a Friday.
     */
    NO_FREE_DAYS(1);

    /**
     * Attribute to hold the checkInDayType property.
     */
    private Integer checkInDayType;

    /**
     * Constructor with <code>checkInDayType</code> as an argument.
     * <p>
     * 
     * @param pCheckInDayType the new value of the <code>checkInDayType</code>.<br>
     */
    CheckInDayType(final Integer pCheckInDayType) {
        this.checkInDayType = pCheckInDayType;
    }

    /**
     * The <code>fromValue</code> method returns the <code>CheckInDayType</code> value.
     * <p>
     * 
     * @param pCheckInDayType the new value of <code>CheckInDayType</code>.
     *            <p>
     * @return the current enumerated value of the <code>CheckInDayType</code>.
     */
    public static CheckInDayType fromValue(final Integer pCheckInDayType) {
        CheckInDayType aCheckInDayType = null;
        for (final CheckInDayType bCheckInDayType : CheckInDayType.values()) {
            if (bCheckInDayType.getCheckInDayType().equals(pCheckInDayType)) {
                aCheckInDayType = bCheckInDayType;
                break;
            }
        }
        return aCheckInDayType;
    }

    /**
     * Gets the <code>checkInDayType</code> property.
     * <p>
     * Holds the value of check in day type.
     * <p>
     * 
     * @return current value of the <code>checkInDayType</code> property.<br>
     */
    public Integer getCheckInDayType() {
        return this.checkInDayType;
    }

    /**
     * The <code>value</code> method returns the Integer value of <code>CheckInDayType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>CheckInDayType</code>.
     */
    public Integer value() {
        return this.getCheckInDayType();
    }
}