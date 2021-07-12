/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>LocalOtherChargeCodeRequest</code> class represents the request to create
 * and update LocalOtherChargeCode details.
 * <p>
 * <code>LocalOtherChargeCodeRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>LocalOtherChargeCodeDto
 * </code>
 * </ul>
 */
public class LocalOtherChargeCodeRequest extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = -6547144861753885626L;

    /**
     * Attribute to hold <code>localOtherChargeCodeDto</code> property.
     */
    private LocalOtherChargeCodeDto localOtherChargeCodeDto;

    /**
     * Gets the <code>localOtherChargeCodeDto</code> property.
     * <p>
     * 
     * @return the current value of <code>localOtherChargeCodeDto</code> property.
     */
    public LocalOtherChargeCodeDto getLocalOtherChargeCodeDto() {
        return this.localOtherChargeCodeDto;
    }

    /**
     * Sets the <code>localOtherChargeCodeDto</code> property.
     * <p>
     * 
     * @param pLocalOtherChargeCodeDto
     *            the new value of the <code>localOtherChargeCodeDto</code> property.
     */
    public void setLocalOtherChargeCodeDto(final LocalOtherChargeCodeDto pLocalOtherChargeCodeDto) {
        this.localOtherChargeCodeDto = pLocalOtherChargeCodeDto;
    }

}
