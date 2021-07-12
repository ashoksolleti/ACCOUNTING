/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>StationLocalTimeFindRequest</code> class represents the request to find the station's local date and
 * time.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>stationCode
 * <li>utcDate
 * </code>
 * </ul>
 */
public class StationLocalTimeFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8344607397213574841L;

    /**
     * Attribute to hold the <code>stationCode</code> property.
     */
    private String stationCode;

    /**
     * Attribute to hold the <code>utcDate</code> property.
     */
    private Date utcDate;

    /**
     * <code>Default constructor.</code>
     */
    public StationLocalTimeFindRequest() {

    }

    /**
     * Gets the value of the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets<br>
     * <b>Example: </b><br>
     * MSP
     * 
     * @return <code>String</code><br>
     *         Returns the current value of the <code>stationCode</code> property.<br>
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Gets the value of the <code>utcDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 30JUN07
     * <p>
     * 
     * @return the current value of the <code>utcDate</code> property.
     */
    public Date getUtcDate() {
        return ContractUtility.getClonedDate(this.utcDate);
    }

    /**
     * Sets the value of the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets<br>
     * <b>Example: </b><br>
     * MSP
     * 
     * @param pStationCode <code>String</code><br>
     *            The new value of the <code>stationCode</code> property.<br>
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);
    }

    /**
     * Sets the value of the <code>utcDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 01JAN07
     * <p>
     * 
     * @param pUTCDate the new value of the <code>utcDate</code> property.<br>
     */
    public void setUtcDate(final Date pUTCDate) {
        this.utcDate = ContractUtility.getClonedDate(pUTCDate);
    }
}
