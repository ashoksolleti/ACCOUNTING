/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ULDPrefixSerialRangeDeleteRequest</code> is the request object for deleting the
 * <code>UldSerialRange</code>.
 * <p>
 * The object ID of the ULD prefix being deleted is required to delete the ULD prefix Serial Range.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>startRange
 * <li>uldPrefixOid
 * <li>version</code>
 * </ul>
 */
public class ULDPrefixSerialRangeDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8213153985425049797L;

    /**
     * Attribute to hold <code>startRange</code> property.
     * <p>
     * Beginning serial range value.
     */
    private String startRange;

    /**
     * Attribute to hold <code>uldPrefixOid</code> property.
     */
    private Long uldPrefixOId;

    /**
     * Attribute to hold <code>version</code> property.
     */
    private Long version;

    /**
     * <code>Default constructor</code>.
     */
    public ULDPrefixSerialRangeDeleteRequest() {

    }

    /**
     * Gets the <code>startRange</code> property.
     * <p>
     * Beginning Serial Value. An Alphanumeric character is allowed in the first position the serial value
     * range based on system level parameter. The parameter
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ULD_SERIAL_NUMBER_INDICATOR
     * ULD_SERIAL_NUMBER_INDICATOR} should must be set to Y to allow the first character of serial value range
     * to be alphanumeric.
     * <p>
     * <b>Format: </b><br>
     * 4-5 alpha numeric.<br>
     * <b>Example: </b><br>
     * 1111, A0001, 00000 <br>
     * 
     * @return the current value of the <code>startRange</code> property.
     */
    public String getStartRange() {
        return this.startRange;
    }

    /**
     * Gets the <code>uldPrefixOId</code> property.
     * <p>
     * 
     * @return the current value of the <code>uldPrefixOId</code> property.
     */
    public Long getUldPrefixOId() {
        return this.uldPrefixOId;
    }

    /**
     * Gets the <code>version</code> property.
     * <p>
     * 
     * @return the current value of the <code>version</code> property.
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * Sets the <code>startRange</code> property.
     * <p>
     * Beginning Serial Value. An Alphanumeric character is allowed in the first position the serial value
     * range based on system level parameter. The parameter
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ULD_SERIAL_NUMBER_INDICATOR
     * ULD_SERIAL_NUMBER_INDICATOR} should must be set to Y to allow the first character of serial value range
     * to be alphanumeric.
     * <p>
     * <b>Format: </b><br>
     * 4-5 alpha numeric.<br>
     * <b>Example: </b><br>
     * 1111, A0001, 00000
     * <p>
     * 
     * @param pStartRange the new value of the <code>startRange</code> property.
     */
    public void setStartRange(final String pStartRange) {
        this.startRange = pStartRange;
    }

    /**
     * Sets the <code>uldPrefixOid</code> property.
     * <p>
     * 
     * @param pUldPrefixOId the new value of the <code>uldPrefixOId</code> property.
     */
    public void setUldPrefixOId(final Long pUldPrefixOId) {
        this.uldPrefixOId = pUldPrefixOId;
    }

    /**
     * Sets the <code>version</code> property.
     * <p>
     * 
     * @param pVersion the new value of the version property
     */
    public void setVersion(final Long pVersion) {
        this.version = pVersion;
    }

}
