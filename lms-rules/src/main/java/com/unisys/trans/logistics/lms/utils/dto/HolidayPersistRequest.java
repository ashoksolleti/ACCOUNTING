/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>HolidayPersistRequest</code> is used to create or update holiday information.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <li><code>HolidayDto</code>
 * </ul>
 */
public class HolidayPersistRequest extends AbstractRequest {

    /**
     * TODO Generated serial version added. add a valid serial version id
     */
    private static final long serialVersionUID = -6796518591382098031L;

    /**
     * Attribute to hold the <code>holidayInformation</code> object.
     */
    private HolidayDto holidayInformation;

    /**
     * <code>Default Constructor.</code>
     */
    public HolidayPersistRequest() {

    }

    /**
     * Gets the <code>holidayInformation</code> property.
     * <p>
     * 
     * @return the current value of <code>holidayInformation</code> property.
     */
    public HolidayDto getHolidayInformation() {
        return this.holidayInformation;
    }

    /**
     * Sets the <code>pHolidayInformation</code> property.
     * <p>
     * 
     * @param pHolidayInformation the new value of the <code>pHolidayInformation</code> property.
     */
    public void setHolidayInformation(final HolidayDto pHolidayInformation) {
        this.holidayInformation = pHolidayInformation;
    }

}
