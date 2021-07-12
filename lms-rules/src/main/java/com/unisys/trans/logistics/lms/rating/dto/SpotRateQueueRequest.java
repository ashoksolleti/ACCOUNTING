/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>SpotRateQueueRequest</code> is used for <code>SpotRate</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>spotRateDto
 * </ul>
 */

public class SpotRateQueueRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3227933007006764747L;

    /**
     * Attribute to hold the <code>spotRateDto</code> property.
     */
    private SpotRateDto spotRateDto;

    /**
     * Attribute to hold the <code>awbNumber</code> property.
     */
    private AWBNumberDto awbNumber;

    /**
     * Gets the <code>awbNumber </code> data transfer object.
     * <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.AWBNumberDto
     *         AWBNumberDto}</code><br>
     *         the current value of <code>awbNumber</code> data transfer
     *         object.<br>
     */
    public AWBNumberDto getAwbNumber() {
        return awbNumber;
    }

    /**
     * Sets the <code>awbNumber</code> data transfer object.
     * <p>
     * 
     * @param pAwbNumber
     *            holds the new value of <code>awbNumber</code> data
     *            transfer object.<br>
     */
    public void setAwbNumber(final AWBNumberDto pAwbNumber) {
        this.awbNumber = pAwbNumber;
    }

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
     *            holds the new value of <code>SpotRateDto</code> data
     *            transfer object.<br>
     */
    public void setSpotRateDto(final SpotRateDto pSpotRateDto) {
        this.spotRateDto = pSpotRateDto;
    }

}
