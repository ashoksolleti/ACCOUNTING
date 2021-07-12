/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ExchangeRatePersistRequest</code> is used for creating a new exchange rate.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>exchangeRate</code>
 * </ul>
 */
public class ExchangeRatePersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1337041157161899063L;

    /**
     * <code> Exchange Rate Data Transfer object.</code>
     */

    private ExchangeRateDto exchangeRate;
    private RoundingFactorDto roundingFactorDto;

    /**
     * Default constructor.
     */
    public ExchangeRatePersistRequest() {

    }

    /**
     * Gets the exchange rate data transfer object.
     * <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto ExchangeRateDto}</code><br>
     *         the current value of <code>exchangeRate</code> property.
     */
    public ExchangeRateDto getExchangeRate() {

        return this.exchangeRate;
    }

    /**
     * Sets the exchange rate data transfer object.
     * <p>
     * 
     * @param pExchangeRate <code> {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto
     *            ExchangeRateDto} </code><br>
     *            the new value for the <code>exchangeRate</code> property.
     */
    public void setExchangeRate(final ExchangeRateDto pExchangeRate) {

        this.exchangeRate = pExchangeRate;

    }

	public RoundingFactorDto getRoundingFactorDto() {
		return roundingFactorDto;
	}
	public void setRoundingFactorDto(RoundingFactorDto roundingFactorDto) {
		this.roundingFactorDto = roundingFactorDto;
	}
}
