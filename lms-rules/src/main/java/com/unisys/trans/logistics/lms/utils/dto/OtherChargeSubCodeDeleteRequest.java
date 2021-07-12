/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>OtherChargeSubCodeDeleteRequest</code> class is the delete OtherChargeSubCode.
 * <p>
 * <code>OtherChargeSubCodeDeleteRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>oId
 * <li>searchCode
 * </code>
 * </ul>
 */
public class OtherChargeSubCodeDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6122342636474898181L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * <code>Default constructor</code>.
     */
    public OtherChargeSubCodeDeleteRequest() {

    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

}
