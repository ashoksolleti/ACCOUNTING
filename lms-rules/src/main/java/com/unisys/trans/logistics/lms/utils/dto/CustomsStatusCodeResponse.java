/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.List;

/**
 * <code>CustomsStatusCodeResponse</code>contains the response of the maintenance request received by
 * CustomsStatusCodeService.
 * <p>
 * This contains the following attribute:<br>
 * <ul>
 * <li><code>customsStatusCodes</code></li>
 * </ul>
 */
public class CustomsStatusCodeResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8901081688954472495L;

    /**
     * Variable to hold collection of <code>CustomsStatusCodeDto</code> object.<br>
     */
    private List<CustomsStatusCodeDto> customsStatusCodes;

    /**
     * <code>Default constructor.</code>
     */
    public CustomsStatusCodeResponse() {
    }

    /**
     * Adds <code>CustomsStatusCodeDto</code> (Customs Status data transfer) object to the list of Customs
     * Status data transfer objects.
     * <p>
     * 
     * @param pCustomsStatusCode <code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDto
     *            customsStatusCodeDto}</code> object of <code>CustomsStatusCodeDto</code> to be added to the
     *            list.
     */
    public void addCustomsStatusCodesDto(final CustomsStatusCodeDto pCustomsStatusCode) {
        if (this.customsStatusCodes == null) {
            this.customsStatusCodes = new java.util.ArrayList<CustomsStatusCodeDto>();
        }
        this.customsStatusCodes.add(pCustomsStatusCode);
    }

    /**
     * Gets the operation for the <code>CustomsStatusCodes</code>.
     * <p>
     * 
     * @return <code>List</code><br>
     *         Returns the list of <code>customsStatusCodes</code>.<br>
     *         </p>
     */
    public java.util.List<CustomsStatusCodeDto> getCustomsStatusCodes() {
        if (this.customsStatusCodes == null) {
            this.customsStatusCodes = new java.util.ArrayList<CustomsStatusCodeDto>();
        }
        return this.customsStatusCodes;
    }

    /**
     * Sets the <code>CustomsStatusCodes</code>.
     * <p>
     * 
     * @param pCustomsStatusCodes <code>List</code><br>
     *            The list of customs status code data transfer objects.<br>
     *            </p>
     */
    public void setCustomsStatusCodes(final List<CustomsStatusCodeDto> pCustomsStatusCodes) {
        this.customsStatusCodes = pCustomsStatusCodes;
    }
}