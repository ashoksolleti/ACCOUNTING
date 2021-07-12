/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>VolumeUOMType</code> indicates the different volume units.
 * <p>
 * The following are some of the commonly defined volume units: MC CF
 */

public enum ProvisoType {

    B("B"),
    M("M"),
    P("P");
    private final String proviso;

    /**
     * Constructor.
     * 
     * @param pRate
     *            - Rate Description
     */

    ProvisoType(final String pProviso) {
        this.proviso = pProviso;
    }

    /**
     * @return the proviso
     */
    public String getProviso() {
        return proviso;
    }
   
    /**
     * Gives the string format of enumerated <code>RateClassType</code>.
     * <p>
     * 
     * @return the current string value of the <code>RateClassType</code>.
     */
    public String value() {
        return this.name();
    }
   
}