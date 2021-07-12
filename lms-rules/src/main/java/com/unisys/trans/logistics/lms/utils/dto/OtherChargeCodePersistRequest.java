/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>OtherChargeCodePersistRequest</code> class is the request to create or update OtherChargeCode.
 * <p>
 * <code>OtherChargeCodePersistRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>otherChargeCodeDto
 * </code>
 * </ul>
 */
public class OtherChargeCodePersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5239561340439604799L;

    /**
     * Attribute to hold the <code>otherChargeCode</code> property.
     */
    private OtherChargeCodeDto otherChargeCode;

    /**
     * <code>Default constructor.</code>>
     */
    public OtherChargeCodePersistRequest() {

    }

    /**
     * Gets the <code>otherChargeCodeDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>otherChargeCodeDto</code> property.
     */
    public OtherChargeCodeDto getOtherChargeCode() {
        return this.otherChargeCode;
    }

    /**
     * Sets the <code>otherChargeCodeDto</code> property.
     * <p>
     * 
     * @param pOtherChargeCode the new value of the <code>otherChargeCodeDto</code> property.
     */
    public void setOtherChargeCode(final OtherChargeCodeDto pOtherChargeCode) {
        this.otherChargeCode = pOtherChargeCode;
    }
}
