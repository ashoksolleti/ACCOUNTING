/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.price;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>PriceQuoteRequest</code> is used for retrieving <code> PriceQuoteDto </code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>PriceQuoteDto</code>
 * </ul>
 */
public class PriceQuoteRequest extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = -5626045883901849762L;

    /**
     * Attribute to hold <code>rateQuoteDto</code> property.
     */
    private PriceQuoteDto rateQuoteDto;

    /**
     * Gets the <code>PriceQuoteDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateQuoteDto</code> property.
     */
    public PriceQuoteDto getRateQuoteDto() {
        return this.rateQuoteDto;
    }

    /**
     * Sets the <code>PriceQuoteDto</code> property.
     * <p>
     * 
     * @param pRateQuoteDto
     *            the current value of the <code>rateQuoteDto</code> property.
     */
    public void setRateQuoteDto(final PriceQuoteDto pRateQuoteDto) {
        this.rateQuoteDto = pRateQuoteDto;
    }

}
