/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>ExchangeRateType</code> represents types of exchange rate such as bank selling rate, IATA five day,
 * IATA rating.
 * 
 * @author Unisys
 * @version 1.0
 */
public enum ExchangeRateType {
    /**
     * Constant used for Bank selling rate.
     */
    BANKSELLING('B'),
    /**
     * Constant used for IATA Five day exchange rate.
     */
    IATAFIVEDAY('F'),
    /**
     * Constant used for IATA Rating exchange rate.
     */
    IATARATING('I');
    /**
     * Attribute to hold the <code>value</code> property.
     */
    private char value;

    /**
     * Parameterize constructor.
     * 
     * @param pVal the value.
     */
    ExchangeRateType(final char pVal) {
        this.value = pVal;
    }

    /**
     * Gets the enum Constant value.
     * <p>
     * 
     * @return the current value of <code>value</code> property.<br>
     */
    public char getValue() {
        return this.value;
    }

}