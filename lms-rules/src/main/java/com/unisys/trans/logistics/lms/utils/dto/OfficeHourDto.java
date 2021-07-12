/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;

/**
 * <code>OfficeHourDto</code>contains specific data applicable to office hours.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>holidayCloseHour</code></li>
 * <li><code>holidayOpenHour</code></li>
 * <li><code>saturdayCloseHour</code></li>
 * <li><code>saturdayOpenHour</code></li>
 * <li><code>sundayCloseHour</code></li>
 * <li><code>sundayOpenHour</code></li>
 * <li><code>weekdayCloseHour</code></li>
 * <li><code>weekdayOpenHour</code></li>
 * </ul>
 */
public class OfficeHourDto implements Serializable {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8055784621142427154L;

    /**
     * Attribute to hold <code>holidayCloseHour</code> property. Closing hour (expressed in military time
     * format) of station operations on holidays. This is an optional attribute. This is a string of format
     * 4n-4n or 12x. E.g. 0800 - 2000 or 24:00
     */
    private int holidayCloseHour;

    /**
     * Attribute to hold <code>holidayOpenHour</code> property. Opening operating hour (expressed in military
     * time format) of the station on holidays. This is optional attribute. This is a string of format 4n-4n
     * or 12x. E.g. 0800 - 2000 or 24:00
     */
    private int holidayOpenHour;

    /**
     * Attribute to hold <code>saturdayCloseHour</code> property. Closing hour (expressed in military time
     * format) of station operations on Saturdays. This is an optional attribute. This is a string of format
     * 4n-4n or 12x. E.g. 0800 - 2000 or 24:00
     */
    private int saturdayCloseHour;

    /**
     * Attribute to hold <code>saturdayOpenHour</code> property. Opening hour (expressed in military time
     * format) of station operations on Saturdays. This is an optional attribute. This is a string of format
     * 4n-4n or 12x. E.g. 0800 - 2000 or 24:00
     */
    private int saturdayOpenHour;

    /**
     * Attribute to hold <code>sundayCloseHour</code> property.
     */
    private int sundayCloseHour;

    /**
     * Attribute to hold <code>sundayOpenHour</code> property. Opening hour (expressed in military time
     * format) of station operations on Sundays. This is an optional attribute. This is a string of format
     * 4n-4n or 12x. E.g. 0800 - 2000 or 24:00
     */
    private int sundayOpenHour;

    /**
     * Attribute to hold <code>weekdayCloseHour</code> property. Closing hour (expressed in military time
     * format) of station operations on weekdays. This is an optional attribute. This is a string of format
     * 4n-4n or 12x. E.g. 0800 - 2000 or 24:00
     */
    private int weekdayCloseHour;

    /**
     * Attribute to hold <code>weekdayOpenHour</code> property. Opening operating hour (expressed in military
     * time format) of the station on weekdays. This is optional attribute. This is a string of format 4n-4n
     * or 12x. E.g. 0800 - 2000 or 24:00
     */
    private int weekdayOpenHour;

    /**
     * <code>Default constructor.</code>
     */
    public OfficeHourDto() {

    }

    /**
     * Gets the value of the <code>holidayCloseHour</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Numeric<br>
     * <b>Example: </b><br>
     * 0800
     * 
     * @return <code>int</code><br>
     *         Returns the current value of the <code>holidayCloseHour</code> property.<br>
     *         </p>
     */
    public int getHolidayCloseHour() {
        return this.holidayCloseHour;
    }

    /**
     * Gets the value of the <code>holidayOpenHour</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Numeric<br>
     * <b>Example: </b><br>
     * 0800
     * 
     * @return <code>int</code><br>
     *         Returns the current value of the <code>holidayOpenHour</code> property.<br>
     *         </p>
     */
    public int getHolidayOpenHour() {
        return this.holidayOpenHour;
    }

    /**
     * Gets the value of the <code>saturdayCloseHour</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Numeric<br>
     * <b>Example: </b><br>
     * 0800
     * 
     * @return <code>int</code><br>
     *         Returns the current value of the <code>saturdayCloseHour</code> property.<br>
     *         </p>
     */
    public int getSaturdayCloseHour() {
        return this.saturdayCloseHour;
    }

    /**
     * Gets the value of the <code>saturdayOpenHour</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Numeric<br>
     * <b>Example: </b><br>
     * 0800
     * 
     * @return <code>int</code><br>
     *         Returns the current value of the <code>saturdayOpenHour</code> property.<br>
     *         </p>
     */
    public int getSaturdayOpenHour() {
        return this.saturdayOpenHour;
    }

    /**
     * Gets the value of the <code>sundayCloseHour</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Numeric<br>
     * <b>Example: </b><br>
     * 0800
     * 
     * @return <code>int</code><br>
     *         Returns the current value of the <code>sundayCloseHour</code> property.<br>
     *         </p>
     */
    public int getSundayCloseHour() {
        return this.sundayCloseHour;
    }

    /**
     * Gets the value of the <code>weekdayCloseHour</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Numeric<br>
     * <b>Example: </b><br>
     * 0800
     * 
     * @return <code>int</code><br>
     *         Returns the current value of the <code>weekdayCloseHour</code> property.<br>
     *         </p>
     */
    public int getSundayOpenHour() {
        return this.sundayOpenHour;
    }

    /**
     * Gets the value of the <code>weekdayCloseHour</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Numeric<br>
     * <b>Example: </b><br>
     * 0800
     * 
     * @return <code>int</code><br>
     *         Returns the current value of the <code>weekdayCloseHour</code> property.<br>
     *         </p>
     */
    public int getWeekdayCloseHour() {
        return this.weekdayCloseHour;
    }

    /**
     * Gets the value of the <code>weekdayOpenHour</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Numeric<br>
     * <b>Example: </b><br>
     * 0800
     * 
     * @return <code>int</code><br>
     *         Returns the current value of the <code>weekdayOpenHour</code> property.<br>
     *         </p>
     */
    public int getWeekdayOpenHour() {
        return this.weekdayOpenHour;
    }

    /**
     * Sets the value of the <code>holidayCloseHour</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Numeric<br>
     * <b>Example: </b><br>
     * 0800
     * 
     * @param pHolidayCloseHour <code>int</code><br>
     *            The new value of the <code>holidayCloseHour</code> property.<br>
     *            </p>
     */
    public void setHolidayCloseHour(final int pHolidayCloseHour) {
        this.holidayCloseHour = pHolidayCloseHour;
    }

    /**
     * Sets the value of the <code>holidayOpenHour</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Numeric<br>
     * <b>Example: </b><br>
     * 0800
     * 
     * @param pHolidayOpenHour <code>int</code><br>
     *            The new value of the <code>holidayOpenHour</code> property.<br>
     *            </p>
     */
    public void setHolidayOpenHour(final int pHolidayOpenHour) {
        this.holidayOpenHour = pHolidayOpenHour;
    }

    /**
     * Sets the value of the <code>saturdayCloseHour</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Numeric<br>
     * <b>Example: </b><br>
     * 0800
     * 
     * @param pSaturdayCloseHour <code>int</code><br>
     *            The new value of the <code>saturdayCloseHour</code> property.<br>
     *            </p>
     */
    public void setSaturdayCloseHour(final int pSaturdayCloseHour) {
        this.saturdayCloseHour = pSaturdayCloseHour;
    }

    /**
     * Sets the value of the <code>saturdayOpenHour</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Numeric<br>
     * <b>Example: </b><br>
     * 0800
     * 
     * @param pSaturdayOpenHour <code>int</code><br>
     *            The new value of the <code>saturdayOpenHour</code> property.<br>
     *            </p>
     */
    public void setSaturdayOpenHour(final int pSaturdayOpenHour) {
        this.saturdayOpenHour = pSaturdayOpenHour;
    }

    /**
     * Sets the value of the <code>sundayCloseHour</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Numeric<br>
     * <b>Example: </b><br>
     * 0800
     * 
     * @param pSundayCloseHour <code>int</code><br>
     *            The new value of the <code>sundayCloseHour</code> property.<br>
     *            </p>
     */
    public void setSundayCloseHour(final int pSundayCloseHour) {
        this.sundayCloseHour = pSundayCloseHour;
    }

    /**
     * Sets the value of the <code>sundayOpenHour</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Numeric<br>
     * <b>Example: </b><br>
     * 0800
     * 
     * @param pSundayOpenHour <code>int</code><br>
     *            The new value of the <code>sundayOpenHour</code> property.<br>
     *            </p>
     */
    public void setSundayOpenHour(final int pSundayOpenHour) {
        this.sundayOpenHour = pSundayOpenHour;
    }

    /**
     * Sets the value of the <code>weekdayCloseHour</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Numeric<br>
     * <b>Example: </b><br>
     * 0800
     * 
     * @param pWeekdayCloseHour <code>int</code><br>
     *            The new value of the <code>weekdayCloseHour</code> property.<br>
     *            </p>
     */
    public void setWeekdayCloseHour(final int pWeekdayCloseHour) {
        this.weekdayCloseHour = pWeekdayCloseHour;
    }

    /**
     * Sets the value of the <code>weekdayOpenHour</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Numeric<br>
     * <b>Example: </b><br>
     * 0800
     * 
     * @param pWeekdayOpenHour <code>int</code><br>
     *            The new value of the <code>weekdayOpenHour</code> property.<br>
     *            </p>
     */
    public void setWeekdayOpenHour(final int pWeekdayOpenHour) {
        this.weekdayOpenHour = pWeekdayOpenHour;
    }

}
