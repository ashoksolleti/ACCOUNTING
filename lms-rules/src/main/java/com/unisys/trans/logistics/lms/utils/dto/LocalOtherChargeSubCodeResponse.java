/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>LocalOtherChargeSubCodeResponse</code> contains the response of the maintenance request received by
 * <code>LocalOtherChargeSubCodeService</code>.
 * <p>
 * <ul>
 * <li><code>localOtherChargeSubCodeDtos</code></li>
 * </ul>
 */

public class LocalOtherChargeSubCodeResponse extends AbstractResponse {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 6848639675347062749L;

    /**
     * Attribute to hold <code>localOtherChargeSubCodeDtos</code> property.
     */
    private List<LocalOtherChargeSubCodeDto> localOtherChargeSubCodeDtos;

    private LocalOtherChargeSubCodeDto localOtherChargeSubCodeDto;

    /**
     * Gets the <code>localOtherChargeSubCodeDtos</code>.
     * <p>
     * 
     * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.LocalOtherChargeSubCodeDto
     *         LocalOtherChargeSubCodeDto} </code><br>
     *         Returns the <code>localOtherChargeSubCodeDtos</code>.
     *         </p>
     */
    public List<LocalOtherChargeSubCodeDto> getLocalOtherChargeSubCodeDtos() {
        return this.localOtherChargeSubCodeDtos;
    }

    /**
     * Sets the <code>LocalOtherChargeSubCodeDto</code>.
     * <p>
     * 
     * @param pLocalOtherChargeSubCodeDtos <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.LocalOtherChargeSubCodeDto
     *            LocalOtherChargeSubCodeDto}</code><br>
     *            the local other charge sub code data transfer object
     *            </p>
     */
    public void setLocalOtherChargeSubCodeDtos(List<LocalOtherChargeSubCodeDto> pLocalOtherChargeSubCodeDtos) {
        this.localOtherChargeSubCodeDtos = pLocalOtherChargeSubCodeDtos;
    }

    public LocalOtherChargeSubCodeDto getLocalOtherChargeSubCodeDto() {
        return localOtherChargeSubCodeDto;
    }

    public void setLocalOtherChargeSubCodeDto(LocalOtherChargeSubCodeDto localOtherChargeSubCodeDto) {
        this.localOtherChargeSubCodeDto = localOtherChargeSubCodeDto;
    }

}
