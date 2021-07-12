/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>AddOnRateFindRequest</code> is used for retrieving <code> AddOnRate</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>AddOnRateFindDto</code>
 * </ul>
 */
public class AddOnRateFindRequest extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>addOnRateFindDto</code> property.
     */
    private AddOnRateFindDto addOnRateFindDto;

    /**
     * Gets the <code>AddOnRateFindDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>addOnRateFindDto</code> property.
     */
    public AddOnRateFindDto getAddOnRateFindDto() {
        if (this.addOnRateFindDto == null)
        {
            this.addOnRateFindDto = new AddOnRateFindDto();
        }
        return this.addOnRateFindDto;
    }

    /**
     * Sets the <code>AddOnRateFindDto</code> property.
     * <p>
     * 
     * @param pAddOnRateFindDto
     *            the current value of the <code>addOnRateFindDto</code> property.
     */
    public void setAddOnRateFindDto(final AddOnRateFindDto pAddOnRateFindDto) {
        this.addOnRateFindDto = pAddOnRateFindDto;
    }

}
