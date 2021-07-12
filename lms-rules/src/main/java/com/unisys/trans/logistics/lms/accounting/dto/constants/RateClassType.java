/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto.constants;

import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassOptionType;

/**
 * <code>VolumeUOMType</code> indicates the different volume units.
 * <p>
 * The following are some of the commonly defined volume units: MC CF
 */

public enum RateClassType {

    M("M"),
    N("N"),
    E("E"),
    U("U"),
    Q("Q"),
    T("T");

    /**
     * Gives the string format of enumerated <code>RateClassType</code>.
     * <p>
     * 
     * @return the current string value of the <code>RateClassType</code>.
     */
    public String value() {
        return this.name();
    }
    
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

    RateClassType(final String pRate) {
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

}