/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import java.io.Serializable;

/**
 * <code>StationHandledCarrierDto</code> contains the carriers handled by the station.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>carrierCode
 * <li>oId
 * <li>stationOId
 * </code>
 * </ul>
 */
public class StationHandledCarrierDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5531474026188196301L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     * <p>
     * The code of the carrier which is handled in the station.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>stationOId</code> property.
     * <p>
     * Object ID of the station entity.
     */
    private Long stationOId;

    /**
     * <code>Default constructor.</code>
     */
    public StationHandledCarrierDto() {

    }

    /**
     * Gets the value of the <code>carrierCode</code> property.
     * <p>
     * The code of the carrier which is handled in the station.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @return the current value of the <code>carrierCode</code> property.<br>
     */
    public String getCarrierCode() {
        return this.carrierCode;
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
     * Sets the value of the <code>carrierCode</code> property.
     * <p>
     * The code of the carrier which is handled in the station.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @param pCarrierCode the new value of the <code>carrierCode</code> property.<br>
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);
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
