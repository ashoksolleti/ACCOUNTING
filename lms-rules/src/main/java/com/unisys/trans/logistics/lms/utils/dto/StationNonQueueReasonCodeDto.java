/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;

/**
 * <code>StationNonQueueReasonCodeDto</code> contains reason codes not to be queued.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>reasonCodeNotQueued
 * <li>stationOId
 * </code>
 * </ul>
 */
public class StationNonQueueReasonCodeDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8905850826372697137L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>reasonCodeNotQueued</code> property.
     * <p>
     * The reason code which is not queued in the station.
     */
    private String reasonCodeNotQueued;

    /**
     * Attribute to hold <code>stationOId</code> property.
     * <p>
     * Object ID of the station entity.
     */
    private Long stationOId;

    /**
     * <code>Default constructor.</code>
     */
    public StationNonQueueReasonCodeDto() {

    }

    /**
     * Gets the value of <code>OID</code> property.
     * <p>
     * 
     * @return the current value of the <code>OID</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the value of the <code>reasonCodeNotQueued</code> property.
     * <p>
     * The reason code which is not queued in the station.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets
     * <p>
     * <b>Example: </b><br>
     * GM
     * <p>
     * 
     * @return the current value of the <code>reasonCodeNotQueued</code> property.<br>
     */
    public String getReasonCodeNotQueued() {
        return this.reasonCodeNotQueued;
    }

    /**
     * Gets the value of <code>stationOId</code> property.
     * <p>
     * Object ID of the station entity.
     * <p>
     * 
     * @return the current value of the <code>stationOId</code> property.<br>
     */
    public Long getStationOId() {
        return this.stationOId;
    }

    /**
     * Sets the value of the <code>OID</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>OID</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the value of the <code>reasonCodeNotQueued</code> property.
     * <p>
     * The reason code which is not queued in the station.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets
     * <p>
     * <b>Example: </b><br>
     * GM
     * <p>
     * 
     * @param pReasonCodeNotQueued the new value of the <code>reasonCodeNotQueued</code> property.<br>
     */
    public void setReasonCodeNotQueued(final String pReasonCodeNotQueued) {
        this.reasonCodeNotQueued = ContractUtility.convertToUpperCase(pReasonCodeNotQueued);
    }

    /**
     * Sets the value of the <code>stationOId</code> property.
     * <p>
     * Object ID of the station entity.
     * <p>
     * 
     * @param pStationOId the new value of the <code>stationOId</code> property.<br>
     */
    public void setStationOId(final Long pStationOId) {
        this.stationOId = pStationOId;
    }
}
