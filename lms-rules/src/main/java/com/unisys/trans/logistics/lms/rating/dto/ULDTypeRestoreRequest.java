/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ULDTypeRestoreRequest</code> class represents the request to restore uld type information.
 * <p>
 * ULDType information is restored based on the following attribute: <code>
 * <ul>
 * <li>uldType
 * <li>oId
 * <li>version
 * </ul>
 * </code>
 */
public class ULDTypeRestoreRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3037964273568445068L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>uldType</code> property.
     */
    private String uldType;

    /**
     * Attribute to hold <code>version</code> property.
     */
    private long version;

    /**
     * Default constructor.
     */
    public ULDTypeRestoreRequest() {

    }

    /**
     * Gets the <code>oId</code>.
     * <p>
     * The unique database key for an uld type. This ID is assigned when the object gets persisted (EOT).<br>
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>uldType</code> property.
     * <p>
     * Unique Identifier.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabets.<br>
     * <p>
     * <b>Example :</b><br>
     * 1S
     * <p>
     * 
     * @return the current value of the <code>uldType</code> property.<br>
     */
    public String getUldType() {
        return this.uldType;
    }

    /**
     * Gets the <code>version</code>.
     * <p>
     * 
     * @return the current value of <code>version</code> property.
     */
    public long getVersion() {
        return this.version;
    }

    /**
     * Sets the value of the oId property.
     * <p>
     * 
     * @param pOId the new value of the oId property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>uldType</code> property.
     * <p>
     * Unique Identifier.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabets.<br>
     * <p>
     * <b>Example :</b><br>
     * 1S
     * <p>
     * 
     * @param pUldType
     *            the new value of the <code>uldType</code> property.<br>
     */

    public void setUldType(final String pUldType) {
        this.uldType = pUldType;
    }

    /**
     * Sets the value of the version property.
     * <p>
     * 
     * @param pVersion the new value of the version property.
     */
    public void setVersion(final long pVersion) {
        this.version = pVersion;
    }
}
