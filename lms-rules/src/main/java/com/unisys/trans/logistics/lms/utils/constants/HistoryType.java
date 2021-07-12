/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.constants;

/**
 * <code>HistoryType</code> class holds the static data type of history.
 * <p>
 */
public enum HistoryType {

    /**
     * Holds the static data type for Aircraft Type Code.
     */
    AIRCRAFTTYPECODE("A"),

    /**
     * Holds the static data type for B Type Container Code.
     */
    BTYPECONTAINERCODE("B"),

    /**
     * Holds the static data type for Currency.
     */
    CURRENCY("C"),

    /**
     * Holds the static data type for Customs Status Code.
     */
    CUSTOMSSTATUSCODE("D"),

    /**
     * Holds the static data type for Manifest Group Header Code.
     */
    MANIFESTGROUPHEADERCODE("G"),

    /**
     * Holds the static data type for OtherChargeCode.
     */
    OTHERCHARGECODE("O"),

    /**
     * Holds the static data type for OtherChargeSubCode.
     */
    OTHERCHARGESUBCODE("M"),

    /**
     * Holds the static data type for PalletCode.
     */
    PALLETCODE("L"),

    /**
     * Holds the static data type for Parameter.
     */

    PARAMETER("P"),

    /**
     * Holds the static data type for Product code.
     */
    PRODUCTCODE("P"),

    /**
     * Holds the static data type for Product Code Station Exception.
     */
    PRODUCTCODESTATIONEXCEPTION("E"),

    /**
     * Holds the static data type for Removal Reason Code.
     */
    REMOVALREASONCODE("R"),
    /**
     * Holds the static data type for SpecialHandlingCode.
     */
    SPECIALHANDLINGCODE("S");

    /**
     * Attribute to hold the owner of history.
     */
    private final String type;

    /**
     * <code>Parameterized constructor.</code>
     * <p>
     * 
     * @param pType the new value of the <code>type</code> property.
     */
    HistoryType(final String pType) {
        this.type = pType;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * 
     * @return the current value of the <code>type</code> property.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Gives the string format of enumerated <code>HistoryType</code>.
     * <p>
     * 
     * @return the current value of the <code>HistoryType</code>.
     */
    public String value() {
        return this.name();
    }
}
