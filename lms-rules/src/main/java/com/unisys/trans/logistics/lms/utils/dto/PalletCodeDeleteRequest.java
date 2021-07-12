/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>PalletCodeDeleteRequest</code> is used for deleting the Pallet details.The object ID of the Pallet
 * code being deleted is required to delete the pallet details.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>oId</code>
 * </ul>
 */
public class PalletCodeDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2267054633152499243L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private long oId;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private long version;

    /**
     * <code>Default constructor.</code>
     */
    public PalletCodeDeleteRequest() {
    }

    /**
     * Gets the value of <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the value of <code>version</code> property.
     * <p>
     * 
     * @return the current value of the <code>version</code> property.
     */
    public long getVersion() {
        return this.version;
    }

    /**
     * Sets the value of <code>OId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public void setOId(final long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the value of <code>version</code> property.
     * <p>
     * 
     * @param pversion the new value of the <code>version</code> property.
     */

    public void setVersion(final long pversion) {
        this.version = pversion;
    }
}
