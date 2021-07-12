/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;

/**
 * <code>StationAutoCheckProductCodeDto</code> contains specific data applicable to the station auto check
 * product code.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>oId
 * <li>productCode
 * <li>stationOId
 * </code>
 * </ul>
 */
public class StationAutoCheckProductCodeDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 9062624778558045870L;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique identifier.
     */
    private Long oId;

    /**
     * Attribute to hold <code>productCode</code> property.
     * <p>
     * The code of the product which can be auto checked in to the station.
     */
    private String productCode;

    /**
     * Attribute to hold <code>stationOId</code> property.
     * <p>
     * The object ID of the station.
     */
    private Long stationOId;

    /**
     * <code>Default constructor.</code>
     */
    public StationAutoCheckProductCodeDto() {

    }

    /**
     * Gets the value of <code>OID</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the value of the <code>productCode</code> property.
     * <p>
     * The code of the product which can be auto checked in to the station.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @return the current value of the <code>productCode</code> property.<br>
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * Gets the value of <code>stationOId</code> property.
     * <p>
     * The object ID of the station.
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
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the value of the <code>productCode</code> property.
     * <p>
     * The code of the product which can be auto checked in to the station.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets.
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @param pProductCode the new value of the <code>productCode</code> property.<br>
     */
    public void setProductCode(final String pProductCode) {
        this.productCode = ContractUtility.convertToUpperCase(pProductCode);
    }

    /**
     * Sets the value of the <code>stationOId</code> property.
     * <p>
     * The object ID of the station.
     * <p>
     * 
     * @param pStationOId the new value of the <code>stationOId</code> property.<br>
     */
    public void setStationOId(final Long pStationOId) {
        this.stationOId = pStationOId;
    }
}
