/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>HolidayResponse</code> contains the response of the maintenance request received by
 * <code>HolidayService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>holiday
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.arc.dto.HolidayDto
 */
public class HolidayResponse extends AbstractResponse {

    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = 1402714312673873046L;

    /**
     * Attribute to hold list of <code>holiday</code> object.
     */
    private HolidayDto holiday;

    /**
     * <code>Default Constructor.</code>
     */
    public HolidayResponse() {

    }

    /**
     * Gets the list of <code>holiday</code> property.
     * <p>
     * 
     * @return the current value of list of <code>holiday</code> property.
     */
    public HolidayDto getHoliday() {
        return this.holiday;
    }

    /**
     * Sets the <code>pHolidayDto</code> property.
     * <p>
     * 
     * @param pHolidayDto the new value of list of <code>pHolidayDto</code> property.
     */
    public void setHoliday(final HolidayDto pHolidayDto) {
        this.holiday = pHolidayDto;
    }

}
