/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>RemovalReasonCodePersistRequest</code> class is the request to create or update RemovalReasonCode.
 * <p>
 * <code>RemovalReasonCodePersistRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>removalReasonCode
 * </code>
 * </ul>
 */
public class RemovalReasonCodePersistRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8224781990534700145L;

    /**
     * Attribute to hold the <code>removalReasonCode</code> property.
     */
    private RemovalReasonCodeDto removalReasonCode;

    /**
     * <code>Default constructor.</code>>
     */
    public RemovalReasonCodePersistRequest() {
    }

    /**
     * Gets the <code>removalReasonCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>removalReasonCode</code> property.
     */
    public RemovalReasonCodeDto getRemovalReasonCode() {
        return this.removalReasonCode;
    }

    /**
     * Sets the <code>removalReasonCode</code> property.
     * <p>
     * 
     * @param pRemovalReasonCode the new value of the <code>removalReasonCode</code> property.
     */
    public void setRemovalReasonCode(final RemovalReasonCodeDto pRemovalReasonCode) {
        this.removalReasonCode = pRemovalReasonCode;
    }
}
