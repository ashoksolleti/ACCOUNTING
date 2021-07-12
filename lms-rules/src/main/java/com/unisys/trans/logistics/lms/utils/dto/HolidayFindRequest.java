/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.utils.dto.constants.HolidayType;

/**
 * <code>HolidayFindRequest</code> is used to find holiday information.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <li><code>holidayType</code>
 * <li><code>stationCode</code>
 * </ul>
 */
public class HolidayFindRequest extends AbstractRequest {

    /**
     * TODO Generated serial version added. add a valid serial version id
     */
    private static final long serialVersionUID = 2300417201876261876L;

    /**
     * Attribute to hold <code>holidayType</code> property.
     */
    private HolidayType holidayType;

    /**
     * Attribute to hold <code>stationCode</code> property.
     */
    private String stationCode;

    /**
     * <code>Default Constructor.</code>
     */
    public HolidayFindRequest() {

    }

    /**
     * Gets the <code>holidayType</code> property.
     * <p>
     * 
     * @return holidayType the new value of the <code>holidayType</code> property.
     */
    public HolidayType getHolidayType() {
        return holidayType;
    }

    /**
     * Gets the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return stationCode the new value of the <code>stationCode</code> property.
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Sets the <code>holidayType</code> property.
     * <p>
     * 
     * @param pHolidayType the new value of the <code>holidayType</code> property.
     */
    public void setHolidayType(final HolidayType pHolidayType) {
        this.holidayType = pHolidayType;
    }

    /**
     * Sets the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pStationCode the new value of the <code>stationCode</code> property.
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = pStationCode;
    }

}
