/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.price;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>RateandQuoteResponse</code> contains the response of the maintenance
 * request received by <code>PriceQuoteService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>PriceDto
 * <li><code>PriceQuoteDto
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.price.PriceDto
 * @see com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto
 */
public class RateandQuoteResponse extends AbstractResponse {

    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>PriceDto</code> object.
     */
    private List<PriceDto> priceDtos;

    /**
     * Attribute to hold the <code>PriceQuoteDto</code> object.
     */
    private PriceQuoteDto priceQuoteDto;

    /**
     * <code>Default Constructor.</code>
     */
    public RateandQuoteResponse() {

    }

    /**
     * Gets the <code>PriceDto</code> property.
     * <p>
     * 
     * @return the list of current value of <code>priceDtos</code> property.
     */
    public List<PriceDto> getPriceDtos() {
        if (this.priceDtos == null) {
            this.priceDtos = new ArrayList<PriceDto>();
        }
        return this.priceDtos;
    }

    /**
     * Gets the <code>PriceQuoteDto</code> property.
     * <p>
     * 
     * @return the current value of <code>priceQuoteDto</code> property.
     */
    public PriceQuoteDto getPriceQuoteDto() {
        if (this.priceQuoteDto == null) {
            this.priceQuoteDto = new PriceQuoteDto();
        }
        return this.priceQuoteDto;
    }

    /**
     * Sets the <code>PriceDto</code> property.
     * <p>
     * 
     * @param pPriceDtos
     *            the new value of the <code>priceDtos</code> property.
     */
    public void setPriceDtos(final List<PriceDto> pPriceDtos) {
        this.priceDtos = pPriceDtos;
    }

    /**
     * Sets the <code>PriceQuoteDto</code> property.
     * <p>
     * 
     * @param pPriceQuoteDto
     *            the new value of the <code>priceQuoteDto</code> property.
     */
    public void setPriceQuoteDto(final PriceQuoteDto pPriceQuoteDto) {
        this.priceQuoteDto = pPriceQuoteDto;
    }

}
