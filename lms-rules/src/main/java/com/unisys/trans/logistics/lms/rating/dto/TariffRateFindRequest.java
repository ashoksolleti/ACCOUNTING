/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>TariffRateFindRequest</code> is used for retrieving <code>TariffRate</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>TariffRateFindDto</code>
 * </ul>
 */

public class TariffRateFindRequest extends AbstractRequest {

    /**
     * Generated serial version UID.
     */
    private static final long serialVersionUID = -7849517387746162463L;

    /**
     * Attribute to hold <code>tariffRateFindDto</code> property.
     */
    private TariffRateFindDto tariffRateFindDto;

    /**
     * Gets the <code>TariffRateFindDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>tariffRateFindDto</code> property.
     */
    public TariffRateFindDto getTariffRateFindDto() {
        return this.tariffRateFindDto;
    }

    /**
     * Sets the <code>TariffRateFindDto</code> property.
     * <p>
     * 
     * @param pTariffRateFindDto
     *            the current value of the <code>tariffRateFindDto</code> property.
     */
    public void setTariffRateFindDto(final TariffRateFindDto pTariffRateFindDto) {
        this.tariffRateFindDto = pTariffRateFindDto;
    }

}
