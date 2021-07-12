/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;

/**
 * <code>MonthHolidayDto</code> contains details of MonthHoliday.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>holidayOid
 * <li>month
 * <li>openOnMonth
 * <li>openOnSaturday
 * <li>openOnSunday
 * <li>oId
 * </ul>
 */
public class MonthHolidayDto implements Serializable {

    /**
     * TODO Generated serial version added. add a valid serial version id
     */
    private static final long serialVersionUID = 532829083605423937L;

    /**
     * Attribute to hold <code>holidayOid</code> property.
     */
    private Long holidayOid;

    /**
     * Attribute to hold <code>month</code> property.
     */
    private Integer month;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>openOnMonth</code> property.
     */
    private boolean openOnMonth;

    /**
     * Attribute to hold <code>openOnSaturday</code> property.
     */
    private boolean openOnSaturday;

    /**
     * Attribute to hold <code>openOnSunday</code> property.
     */
    private boolean openOnSunday;

    /**
     * Gets the <code>holidayOid</code> property.
     * <p>
     * 
     * @return holidayOid the new value of the <code>holidayOid</code> property.
     */
    public Long getHolidayOid() {
        return this.holidayOid;
    }

    /**
     * Gets the <code>month</code> property.
     * 
     * @return month the new value of the <code>month</code> property.
     */
    public Integer getMonth() {
        return this.month;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>openOnMonth</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * 0
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true:</code><br>
     * Indicates Static Parameter.<br>
     * <li><code>false:</code> <br>
     * Indicates non Static Parameter.
     * <p>
     * 
     * @return the current value of the <code>openOnMonth</code> property.
     */
    public boolean isOpenOnMonth() {
        return this.openOnMonth;
    }

    /**
     * Gets the <code>openOnSaturday</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * 0
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true:</code><br>
     * Indicates Static Parameter.<br>
     * <li><code>false:</code> <br>
     * Indicates non Static Parameter.
     * <p>
     * 
     * @return the current value of the <code>openOnSaturday</code> property.
     */
    public boolean isOpenOnSaturday() {
        return this.openOnSaturday;
    }

    /**
     * Gets the <code>openOnSunday</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * 0
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true:</code><br>
     * Indicates Static Parameter.<br>
     * <li><code>false:</code> <br>
     * Indicates non Static Parameter.
     * <p>
     * 
     * @return the current value of the <code>openOnSunday</code> property.
     */
    public boolean isOpenOnSunday() {
        return this.openOnSunday;
    }

    /**
     * Sets the <code>pHolidayOid</code> property.
     * <p>
     * 
     * @param pHolidayOid the new value of the <code>pHolidayOid</code> property.
     */
    public void setHolidayOid(final Long pHolidayOid) {
        this.holidayOid = pHolidayOid;
    }

    /**
     * Sets the <code>pMonth</code> property.
     * 
     * @param pMonth the new value of the <code>pMonth</code> property.
     */
    public void setMonth(final Integer pMonth) {
        this.month = pMonth;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>openOnMonth</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * 0
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true:</code><br>
     * Indicates Static Parameter.<br>
     * <li><code>false:</code> <br>
     * Indicates non Static Parameter.
     * <p>
     * 
     * @param pOpenOnMonth the current value of the <code>openOnMonth</code> property.
     */
    public void setOpenOnMonth(final boolean pOpenOnMonth) {
        this.openOnMonth = pOpenOnMonth;
    }

    /**
     * Sets the <code>openOnSaturday</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * 0
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true:</code><br>
     * Indicates Static Parameter.<br>
     * <li><code>false:</code> <br>
     * Indicates non Static Parameter.
     * <p>
     * 
     * @param pOpenOnSaturday the current value of the <code>openOnSaturday</code> property.
     */
    public void setOpenOnSaturday(final boolean pOpenOnSaturday) {
        this.openOnSaturday = pOpenOnSaturday;
    }

    /**
     * Sets the <code>openOnSunday</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * 0
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true:</code><br>
     * Indicates Static Parameter.<br>
     * <li><code>false:</code> <br>
     * Indicates non Static Parameter.
     * <p>
     * 
     * @param pOpenOnSunday the current value of the <code>openOnSunday</code> property.
     */
    public void setOpenOnSunday(final boolean pOpenOnSunday) {
        this.openOnSunday = pOpenOnSunday;
    }

}
