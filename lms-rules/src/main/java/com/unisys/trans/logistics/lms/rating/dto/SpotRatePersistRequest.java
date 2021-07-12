/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>SpotRatePersistRequest</code> is used to persist <code>SpotRate</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>spotRateDto
 * </ul>
 */

public class SpotRatePersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8700097220941899641L;

    /**
     * Attribute to hold the <code>spotRateDto</code> property.
     */
    private SpotRateDto spotRateDto;

    /**
     * Gets the <code>SpotRateDto </code> data transfer object.
     * <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto
     *         SpotRateDto}</code><br>
     *         the current value of <code>SpotRateDto</code> data transfer
     *         object.<br>
     */
    public SpotRateDto getSpotRateDto() {
        return this.spotRateDto;
    }

    /**
     * Sets the <code>SpotRateDto</code> data transfer object.
     * <p>
     * 
     * @param pSpotRateDto
     *            holds the new value of <code>spotRateDto</code> data
     *            transfer object.<br>
     */
    public void setSpotRateDto(final SpotRateDto pSpotRateDto) {
        this.spotRateDto = pSpotRateDto;
    }
}
