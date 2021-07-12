/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>ExchangeRateResponse</code> contains the response of the maintenance request received by
 * <code>ExchangeRateService</code>.
 * <p>
 * This contains the following attribute:<br>
 * <ul>
 * <li><code>exchangeRates</code>
 * </ul>
 */
public class ExchangeRateResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7949635206045714347L;

    /**
     * Variable to hold collection of <code>ExchangeRateDto</code> object.<br>
     */

    private List<ExchangeRateDto> exchangeRates = new ArrayList<ExchangeRateDto>();

    /**
     * Default constructor.
     */
    public ExchangeRateResponse() {

    }

    /**
     * Adds the <code>ExchangeRate</code> to the list of <code>exchangeRates</code>.
     * <p>
     * 
     * @param pExchangeRate <code> {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto
     *            ExchangeRateDto} </code><br>
     *            the exchange rate data transfer object.<br>
     */
    public void addExchangeRate(final ExchangeRateDto pExchangeRate) {

        this.exchangeRates.add(pExchangeRate);
    }

    /**
     * Gets the operation for the <code>exchangeRates</code>.
     * <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto ExchangeRateDto}</code><br>
     *         the list of <code>ExchangeRateDto</code>.
     */
    public List<ExchangeRateDto> getExchangeRates() {

        return this.exchangeRates;
    }

    /**
     * Sets the <code>exchangeRates</code>.
     * <p>
     * The field holds list of <code>ExchangeRateDto</code> object.
     * <p>
     * 
     * @param pExchangeRates <code> {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto
     *            ExchangeRateDto} </code><br>
     *            the list of exchange rate data transfer objects.<br>
     */
    public void setExchangeRates(final List<ExchangeRateDto> pExchangeRates) {
        this.exchangeRates = pExchangeRates;
    }

}
