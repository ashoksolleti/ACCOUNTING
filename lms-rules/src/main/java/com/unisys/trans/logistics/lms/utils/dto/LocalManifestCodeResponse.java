/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>LocalManifestCodeResponse</code> contains the response of the maintenance request received by
 * <code>LocalManifestCodeService</code>.
 * <p>
 * <ul>
 * <li><code>LocalManifestCodeDtos</code></li>
 * </ul>
 */

public class LocalManifestCodeResponse extends AbstractResponse {

    /**
     * 
     */
    private static final long serialVersionUID = 1818072200870404441L;

    /**
     * Attribute to hold <code>localManifestCodeDtos</code> property.
     */
    private List<LocalManifestCodeDto> localManifestCodeDtos;

    private LocalManifestCodeDto localManifestCodeDto;

    /**
     * Gets the <code>localManifestCodeDtos</code>.
     * <p>
     * 
     * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.LocalManifestCodeDto
     *         LocalManifestCodeDto} </code><br>
     *         Returns the <code>localManifestCodeDtos</code>.
     *         </p>
     */
    public List<LocalManifestCodeDto> getLocalManifestCodeDtos() {
        return this.localManifestCodeDtos;
    }

    /**
     * Sets the <code>LocalManifestCodeDto</code>.
     * <p>
     * 
     * @param pLocalManifestCodeDtos <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.LocalManifestCodeDto
     *            LocalManifestCodeDto}</code><br>
     *            the local manifest code data transfer object
     *            </p>
     */
    public void setLocalManifestCodeDtos(List<LocalManifestCodeDto> pLocalManifestCodeDtos) {
        this.localManifestCodeDtos = pLocalManifestCodeDtos;
    }

    public LocalManifestCodeDto getLocalManifestCodeDto() {
        return localManifestCodeDto;
    }

    public void setLocalManifestCodeDto(LocalManifestCodeDto localManifestCodeDto) {
        this.localManifestCodeDto = localManifestCodeDto;
    }

}
