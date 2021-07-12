/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>CustomsStatusCodePersistRequest</code> is used to create and update customs code.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>customsStatusCode</code></li>
 * </ul>
 */
public class CustomsStatusCodePersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4607884531105780865L;

    /**
     * <code>Customs status code data transfer object.</code>
     */
    private CustomsStatusCodeDto customsStatusCodeDto;

    /**
     * <code>Default Constructor</code>.
     * <p>
     */
    public CustomsStatusCodePersistRequest() {
    }

    /**
     * Gets the <code>CustomsStatusCodeDto</code> to be created/updated.
     * <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDto
     *         customsStatusCodeDto}</code><br>
     *         Returns the <code>CustomsStatusCode</code> data transfer object.
     */
    public CustomsStatusCodeDto getCustomsStatusCodeDto() {
        return this.customsStatusCodeDto;
    }

    /**
     * Sets the <code>customsStatusCodeDto</code> to be created/updated.
     * <p>
     * 
     * @param pCustomsStatusCodeDto <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDto customsStatusCodeDto}
     *            </code><br>
     *            Returns the <code>CustomsStatusCode</code> data transfer object.
     */
    public void setCustomsStatusCodeDto(final CustomsStatusCodeDto pCustomsStatusCodeDto) {

        this.customsStatusCodeDto = pCustomsStatusCodeDto;

    }
}