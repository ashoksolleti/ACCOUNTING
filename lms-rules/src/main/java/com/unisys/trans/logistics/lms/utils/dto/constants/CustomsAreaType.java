/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/* All rights reserved. */
/* UNISYS CONFIDENTIAL */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>CustomsAreaType</code> contains the constants to specify the customs code.
 */

public enum CustomsAreaType {

    /**
     * EUROPEAN ECONOMIC COMMUNITY.
     */
    EURO_ECONOMIC_COMMUNITY("C"),
    /**
     * EUROPEAN FREE TRADE ASSOCIATION.
     */
    EURO_FREE_TRADE_ASSOCIATION("E"),
    /**
     * EUROPEAN VISEGRAD.
     */
    EURO_VISEGRAD("V"),
    /**
     * COUNTRY IS IN NORTH AMERICA.
     */
    NORTH_AMERICA("NA");

    /**
     * Attribute to hold <code>customsAreaType</code>.
     */
    private String customsAreaType;

    /**
     * Constructor with <code>CustomsAreaType</code> as an argument.
     * <p>
     * 
     * @param pCustomsAreaType the new value of <code>CustomsAreaType</code>.
     */
    private CustomsAreaType(final String pCustomsAreaType) {
        this.customsAreaType = pCustomsAreaType;
    }

    /**
     * Gets the <code>CustomsAreaType</code>.
     * <p>
     * 
     * @param pCustomsAreaType the new value of <code>CustomsAreaType</code>
     *            <p>
     * @return the current enumerated value of the <code>CustomsAreaType</code>.
     */
    public static CustomsAreaType getCustomsAreaType(final String pCustomsAreaType) {

        CustomsAreaType anCustomsAreaType = null;

        for (final CustomsAreaType aType : CustomsAreaType.values()) {

            if (pCustomsAreaType.equals(aType.value())) {
                anCustomsAreaType = aType;
                break;
            }
        }

        return anCustomsAreaType;

    }

    /**
     * Gives the string format of <code>CustomsAreaType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>CustomsAreaType</code>.
     */
    public String value() {
        return this.customsAreaType;
    }
}
