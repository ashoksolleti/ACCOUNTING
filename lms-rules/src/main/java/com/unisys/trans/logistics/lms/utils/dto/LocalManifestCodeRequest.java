/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>LocalManifestCodeRequest</code> class represents the request to create
 * and update LocalManifestCode details.
 * <p>
 * <code>LocalManifestCodeRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>LocalManifestCodeDto
 * </code>
 * </ul>
 */
public class LocalManifestCodeRequest extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 997434851800144294L;

    /**
     * Attribute to hold <code>localManifestCodeDto</code> property.
     */
    private LocalManifestCodeDto localManifestCodeDto;

    /**
     * Gets the <code>localManifestCodeDto</code> property.
     * <p>
     * 
     * @return the current value of <code>localManifestCodeDto</code> property.
     */
    public LocalManifestCodeDto getLocalManifestCodeDto() {
        return this.localManifestCodeDto;
    }

    /**
     * Sets the <code>localManifestCodeDto</code> property.
     * <p>
     * 
     * @param pLocalManifestCodeDto
     *            the new value of the <code>localManifestCodeDto</code> property.
     */
    public void setLocalManifestCodeDto(final LocalManifestCodeDto pLocalManifestCodeDto) {
        this.localManifestCodeDto = pLocalManifestCodeDto;
    }

}
