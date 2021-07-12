/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>FSUOptionType</code> defines the valid values of FSU/FZE Status Option for Teletype Address Profile
 * Information.<br>
 * <p>
 * Following are the list of valid values:<br>
 * <ul>
 * <li>B - BOTH</li>
 * <li>H - FZE_IF_HOUSEGOODSEXIST</li>
 * <li>N - NONE</li>
 * <li>X - FZE_IF_HOUSEGOODS_ELSE_FSU</li>
 * <li>Y - FSU_ONLY</li>
 * </ul>
 */
public enum FSUOptionType {
    /**
     * B - Send both FSU and FZE messages. Only send the FZE message if house goods exist.
     */
    BOTH("B"),
    /**
     * Y - Send FSU messages only.
     */
    FSU_ONLY("Y"),
    /**
     * H - Send FZE messages only if house goods exist.
     */
    FZE_IF_HOUSEGOODSEXIST("H"),
    /**
     * X - Send FZE messages if requested and if house goods exist; otherwise send FSU messages.
     */
    FZE_IF_REQUESTED_AND_HOUSEGOODS_EXISTS_ELSE_FSU("X"),
    /**
     * N - Do not send FSU or FZE messages.
     */
    NONE("N");
    /**
     * Attribute to hold <code>fsuOptionType</code> value.
     */
    private String fsuOptionType;

    /**
     * Constructor with FSU Option type value as argument.<br>
     * 
     * @param pFSUOptionType <code>String</code><br>
     *            Holds the FSU Option type.<br>
     */
    private FSUOptionType(final String pFSUOptionType) {
        this.fsuOptionType = pFSUOptionType;
    }

    /**
     * Gets <code>FSUOptionType</code> enum from the enum value.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.<br>
     *            </p>
     * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.constants.FSUOptionType FSUOptionType}</code>
     * <br>
     *         Returns the <code>FSUOptionType</code> enum if a match found else returns null.<br>
     */
    public static FSUOptionType getFSUOptionTypeFromValue(final String pValue) {
        FSUOptionType aKey = null;
        for (final FSUOptionType aFSUStatusOption : FSUOptionType.values()) {
            if (aFSUStatusOption.value().equals(pValue)) {
                aKey = aFSUStatusOption;
                break;
            }
        }
        return aKey;
    }

    /**
     * Returns the value of the <code>FSUOptionType</code> enum.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value of the <code>FSUOptionType</code>.<br>
     */
    public String value() {
        return this.fsuOptionType;
    }
}