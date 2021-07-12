/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * <code>WeekDaysType</code> holds the constants to indicate WeekDaysType applied.
 * <p>
 * Following are the possible WeekDaysType:<br>
 * <ul>
 * <li>SUNDAY - 1
 * <li>MONDAY - 2
 * <li>TUESDAY - 3
 * <li>WEDNESDAY - 4
 * <li>THURSDAY - 5
 * <li>FRIDAY - 6
 * <li>SATURDAY - 7
 * </ul>
 */

public enum WeekDaysType {

    /**
     * Constant used for FRIDAY.
     */
    FRIDAY(6),
    /**
     * Constant used for MONDAY.
     */
    MONDAY(2),
    /**
     * Constant used for SATURDAY.
     */
    SATURDAY(7),
    /**
     * Constant used for SUNDAY.
     */
    SUNDAY(1),
    /**
     * Constant used for THURSDAY.
     */
    THURSDAY(5),
    /**
     * Constant used for TUESDAY.
     */
    TUESDAY(3),
    /**
     * Constant used for WEDNESDAY.
     */
    WEDNESDAY(4);

    /**
     * Attribute to hold the <code>value</code> property.
     */
    private Integer value;

    /**
     * Parameterize constructor.
     * 
     * @param pVal
     *            the value.
     */
    WeekDaysType(final Integer pVal) {
        this.value = pVal;
    }

    /**
     * Gets the <code>WeekDaysType</code>.
     * <p>
     * 
     * @param pType <code>Integer</code><br>
     *            Contains the enum type.<br>
     *            </p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.constants.WeekDaysType WeekDaysType}</code>
     * <br>
     *         Returns the <code>WeekDaysType</code>
     */
    public static WeekDaysType getWeekDaysType(final Integer pType) {
        WeekDaysType aWeekDaysType = null;
        for (WeekDaysType aType : WeekDaysType.values()) {
            if (aType.getValue().equals(pType)) {
                aWeekDaysType = aType;
                break;
            }
        }
        return aWeekDaysType;
    }

    /**
     * Gets the enum Constant value.
     * <p>
     * 
     * @return the current value of <code>value</code> property.<br>
     */
    public Integer getValue() {
        return this.value;
    }
}
