/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>SpecialHandlingCodePersistRequest</code> is used to create and update special handling code.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>specialHandlingCodeDto
 * <li>sortCode
 * <li>searchCode</code>
 * </ul>
 */
public class SpecialHandlingCodePersistRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6978663082811296389L;

    /**
     * Attribute to hold the <code>SpecialHandlingCodeDto</code> object.
     */
    private SpecialHandlingCodeDto specialHandlingCode;

    /**
     * <code>Default Constructor.</code>
     */
    public SpecialHandlingCodePersistRequest() {

    }

    /**
     * Gets the <code>specialHandlingCode</code> property.
     * <p>
     * 
     * @return the current value of <code>specialHandlingCode</code> property.
     */
    public SpecialHandlingCodeDto getSpecialHandlingCode() {
        return this.specialHandlingCode;
    }

    /**
     * Sets the <code>specialHandlingCode</code> property.
     * <p>
     * 
     * @param pSpecialHandlingCodeDto the new value of the <code>specialHandlingCode</code> property.
     */
    public void setSpecialHandlingCode(final SpecialHandlingCodeDto pSpecialHandlingCodeDto) {

        this.specialHandlingCode = pSpecialHandlingCodeDto;

    }
}
