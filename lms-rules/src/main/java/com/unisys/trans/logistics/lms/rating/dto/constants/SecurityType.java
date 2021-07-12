/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>SecurityType</code> holds the constants to indicate SecurityType
 * applied.
 * <p>
 * Following are the possible Security type:<br>
 * <ul>
 * <li>R - Rate Source
 * <li>C - Contract / Spot Rate
 * </ul>
 */
public enum SecurityType {

    /**
     * Constant used for Contract / Spot Rate.
     */
    C("Contract / Spot Rate"),

    /**
     * Constant used for Rate Source.
     */

    R("Rate Source");
    /**
     * Attribute to hold the <code>type</code> property.
     */
    private String type;

    /**
     * Parameterize constructor.
     * 
     * @param pType
     *            the value.
     */
    SecurityType(final String pType) {
        this.type = pType;
    }

    /**
     * Gets the type.
     * <p>
     * 
     * @return the current value of <code>type</code> property.<br>
     */

    public String getType() {
        return this.type;
    }

    /**
     * Gets the value.
     * <p>
     * 
     * @return the current value of <code>name</code> property.<br>
     */
    public String value() {
        return this.name();
    }

}
