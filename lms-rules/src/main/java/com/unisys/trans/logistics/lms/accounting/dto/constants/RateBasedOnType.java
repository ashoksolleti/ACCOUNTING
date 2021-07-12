/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>RateBasedOnType</code> holds the constants to indicate Rate Based On type applied.
 * <p>
 * Following are the possible RateBasedOnType:<br>
 * <ul>
 * <li>FLAT - Flat
 * <li>MN - Minimum
 * <li>WT - Weight
 * </ul>
 */
public enum RateBasedOnType {

    /**
     * Flat Rate.
     */
    FLAT("F"),
    /**
     * Minimum.
     */
    MIN("M"),
    /**
     * Weight.
     */
    WT("W");

    /**
     * Rate.
     * */
    private final String rate;

    /**
     * Constructor.
     * 
     * @param pRate
     *            - Rate Description
     */

    RateBasedOnType(final String pRate) {
        this.rate = pRate;
    }

    /**
     * Gets the value of rate.
     * 
     * @return the rate
     */
    public String getRate() {
        return this.rate;
    }

    /**
     * Gives the string format of enumerated <code>RateBasedOnType</code>.
     * <p>
     * 
     * @return the current string value of the <code>RateBasedOnType</code>.
     */
    public String value() {
        return this.name();
    }
}
