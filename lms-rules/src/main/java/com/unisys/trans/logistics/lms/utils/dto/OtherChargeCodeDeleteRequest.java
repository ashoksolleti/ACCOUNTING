/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>OtherChargeCodeDeleteRequest</code> class is the request to delete the OtherChargeCode information.
 * <p>
 * The object ID of the other charge code being deleted is required to delete the other charge code.
 * <code>OtherChargeCodeDeleteRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>oId
 * <li>searchCode
 * </code>
 * </ul>
 */
public class OtherChargeCodeDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7462035101456656299L;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private long oId;

    
    private String otherChargeCode;
    
    /**
     * <code>Default constructor</code>.
     */
    public OtherChargeCodeDeleteRequest() {

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

    public String getOtherChargeCode() {
        return otherChargeCode;
    }

    public void setOtherChargeCode(String otherChargeCode) {
        this.otherChargeCode = otherChargeCode;
    }
}
