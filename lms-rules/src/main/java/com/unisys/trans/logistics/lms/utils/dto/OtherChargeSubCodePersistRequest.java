/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>OtherChargeSubCodePersistRequest</code> class is the request to create or update OtherChargeSubCode.
 * <p>
 * <code>OtherChargeSubCodePersistRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>OtherChargeCodeDto
 * <li>searchCode
 * </code>
 * </ul>
 */
public class OtherChargeSubCodePersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2455649616155445488L;

    /**
     * Attribute to hold <code>otherChargeCode</code> property.
     */
    private OtherChargeCodeDto otherChargeCode;

    /**
     * <code>Default constructor.</code>>
     */
    public OtherChargeSubCodePersistRequest() {

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
