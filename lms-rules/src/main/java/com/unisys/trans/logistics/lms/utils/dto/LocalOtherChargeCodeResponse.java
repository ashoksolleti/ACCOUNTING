/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>LocalOtherChargeCodeResponse</code> contains the response of the maintenance request received by
 * <code>LocalOtherChargeCodeService</code>.
 * <p>
 * <ul>
 * <li><code>localOtherChargeCodeDtos</code></li>
 * </ul>
 */
public class LocalOtherChargeCodeResponse extends AbstractResponse {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 5357140683022015879L;

    /**
     * Attribute to hold <code>localOtherChargeCodeDtos</code> property.
     */
    private List<LocalOtherChargeCodeDto> localOtherChargeCodeDtos;

    private LocalOtherChargeCodeDto localOtherChargeCodeDto;

    /**
     * Gets the <code>localOtherChargeCodeDtos</code>.
     * <p>
     * 
     * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.LocalOtherChargeCodeDto
     *         LocalOtherChargeCodeDto} </code><br>
     *         Returns the <code>localOtherChargeCodeDtos</code>.
     *         </p>
     */
    public List<LocalOtherChargeCodeDto> getLocalOtherChargeCodeDtos() {
        return this.localOtherChargeCodeDtos;
    }

    /**
     * Sets the <code>LocalOtherChargeCodeDto</code>.
     * <p>
     * 
     * @param pLocalOtherChargeCodeDtos <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.LocalOtherChargeCodeDto
     *            LocalOtherChargeCodeDto}</code><br>
     *            the local other charge code data transfer object
     *            </p>
     */
    public void setLocalOtherChargeCodeDtos(List<LocalOtherChargeCodeDto> pLocalOtherChargeCodeDtos) {
        this.localOtherChargeCodeDtos = pLocalOtherChargeCodeDtos;
    }

    public LocalOtherChargeCodeDto getLocalOtherChargeCodeDto() {
        return this.localOtherChargeCodeDto;
    }

    public void setLocalOtherChargeCodeDto(final LocalOtherChargeCodeDto pLocalOtherChargeCodeDto) {
        this.localOtherChargeCodeDto = pLocalOtherChargeCodeDto;
    }
}
