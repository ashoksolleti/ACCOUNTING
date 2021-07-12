/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>LocalOtherChargeSubCodeRequest</code> class represents the request to create
 * and update LocalOtherChargeSubCode details.
 * <p>
 * <code>LocalOtherChargeSubCodeRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>LocalOtherChargeSubCodeDto
 * </code>
 * </ul>
 */
public class LocalOtherChargeSubCodeRequest extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = -3344950892223683392L;

    /**
     * Attribute to hold <code>localOtherChargeSubCodeDto</code> property.
     */
    private LocalOtherChargeSubCodeDto localOtherChargeSubCodeDto;

    /**
     * Gets the <code>localOtherChargeSubCodeDto</code> property.
     * <p>
     * 
     * @return the current value of <code>localOtherChargeSubCodeDto</code> property.
     */
    public LocalOtherChargeSubCodeDto getLocalOtherChargeSubCodeDto() {
        return this.localOtherChargeSubCodeDto;
    }

    /**
     * Sets the <code>localOtherChargeSubCodeDto</code> property.
     * <p>
     * 
     * @param pLocalOtherChargeSubCodeDto
     *            the new value of the <code>localOtherChargeSubCodeDto</code> property.
     */
    public void setLocalOtherChargeSubCodeDto(final LocalOtherChargeSubCodeDto pLocalOtherChargeSubCodeDto) {
        this.localOtherChargeSubCodeDto = pLocalOtherChargeSubCodeDto;
    }

}
