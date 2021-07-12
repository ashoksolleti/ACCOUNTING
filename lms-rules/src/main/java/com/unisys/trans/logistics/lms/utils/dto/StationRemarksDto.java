/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;

/**
 * <code>StationRemarksDto</code> contains station service remarks and the customs remarks.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>remark
 * <li>remarksType
 * <li>stationOId
 * </code>
 * </ul>
 */
public class StationRemarksDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6676409627519773004L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>remark</code> property.
     */
    private String remark;

    /**
     * Attribute to hold <code>remarksType</code> property.
     * <p>
     * The type indicates whether the remarks is service or customs.
     */
    private String remarksType;

    /**
     * Attribute to hold <code>stationOId</code> property.
     * <p>
     * Object ID of the station entity.
     */
    private Long stationOId;

    /**
     * <code>Default constructor.</code>
     */
    public StationRemarksDto() {

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
     * Gets the value of <code>remark</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-75 Z
     * <p>
     * <b>Example: </b><br>
     * REMARKS
     * <p>
     * 
     * @return the current value of the <code>remark</code> property.<br>
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * Gets the value of <code>remarksType</code> property.
     * <p>
     * The type indicates whether the remarks is service or customs.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * S
     * <p>
     * 
     * @return the current value of the <code>remarksType</code> property.<br>
     */
    public String getRemarksType() {
        return this.remarksType;
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
     * Sets the value of the <code>remark</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-75 Z
     * <p>
     * <b>Example: </b><br>
     * REMARKS
     * <p>
     * 
     * @param pRemark the new value of the <code>remark</code> property.<br>
     */
    public void setRemark(final String pRemark) {
        this.remark = pRemark;
    }

    /**
     * Sets the value of the <code>remarksType</code> property.
     * <p>
     * The type indicates whether the remarks is service or customs.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * S
     * <p>
     * 
     * @param pRemarksType the new value of the <code>remarksType</code> property.<br>
     */
    public void setRemarksType(final String pRemarksType) {
        this.remarksType = pRemarksType;
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
