/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>TariffRatePersistRequest</code> class represents the request to
 * create and update TariffRateinformation details.
 * <p>
 * <code>TariffRatePersistRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>TariffRateOriginAndDestinationDto
 * <li>oId
 * </code>
 * </ul>
 */

public class TariffRatePersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>oId</code> object.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>tariffRateOriginAndDestinationDto</code> object.
     */
    private TariffRateOriginAndDestinationDto tariffRateOriginAndDestinationDto;

    /**
     * <code>Default Constructor.</code>
     */
    public TariffRatePersistRequest() {

    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>TariffRateOriginAndDestinationDto</code> property.
     * <p>
     * 
     * @return the current value of <code>TariffRateOriginAndDestinationDto</code> property.
     */
    public TariffRateOriginAndDestinationDto getTariffRateOriginAndDestinationDto() {
        return this.tariffRateOriginAndDestinationDto;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>OId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>TariffRateOriginAndDestinationDto</code> property.
     * <p>
     * 
     * @param pTariffRateOriginAndDestinationDto
     *            the new value of the <code>TariffRateOriginAndDestinationDto</code> property.
     */
    public void setTariffRateOriginAndDestinationDto(
                final TariffRateOriginAndDestinationDto pTariffRateOriginAndDestinationDto) {
        this.tariffRateOriginAndDestinationDto = pTariffRateOriginAndDestinationDto;
    }

}
