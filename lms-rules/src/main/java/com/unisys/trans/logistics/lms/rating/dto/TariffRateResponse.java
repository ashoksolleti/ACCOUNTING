//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>TariffRateResponse</code> contains the response of the maintenance
 * request received by <code>TariffRateService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>TariffRateOriginAndDestinationDto
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.TariffRateOriginAndDestinationDto
 */

public class TariffRateResponse extends AbstractResponse {

    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>TariffRateOriginAndDestinationDto</code> property.
     * <p>
     * <code>TariffRateOriginAndDestinationDto</code> contains the tariffOriginAndDestination information.
     */
    private TariffRateOriginAndDestinationDto tariffRateOriginAndDestinationDto;

    /**
     * <code>Default Constructor.</code>
     */
    public TariffRateResponse() {
    }

    /**
     * Gets the <code>TariffRateOriginAndDestinationDto</code> property.
     * <p>
     * 
     * @return the current value of <code>tariffRateOriginAndDestinationDto</code> property.
     */
    public TariffRateOriginAndDestinationDto getTariffRateOriginAndDestinationDto() {
        return this.tariffRateOriginAndDestinationDto;
    }

    /**
     * Sets the <code>TariffRateOriginAndDestinationDto</code> property.
     * <p>
     * 
     * @param pTariffRateOriginAndDestinationDto
     *            the new value of <code>TariffRateOriginAndDestinationDto</code> information.<br>
     */
    public void setTariffRateOriginAndDestinationDto(
                final TariffRateOriginAndDestinationDto pTariffRateOriginAndDestinationDto) {
        this.tariffRateOriginAndDestinationDto = pTariffRateOriginAndDestinationDto;
    }

}
