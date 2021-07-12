/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>NetworkType</code> defines the valid values of Network indicator for Teletype Address Profile
 * Information.<br>
 * <p>
 * Following are the list of valid values:<br>
 * <ul>
 * <li>T - TDNI</li>
 * <li>A - AVEX</li>
 * <li>G - GEIS</li>
 * <li>X - TRAXON</li>
 * <li>D - DIRECT</li>
 * <li>B - BRITISH TELECOM</li>
 * </ul>
 */
public enum NetworkType {
    /**
     * AVEX network provider.
     */
    AVEX("A"),

    /**
     * BRITISH_TELECOM network provider.
     */
    BRITISH_TELECOM("B"),

    /**
     * Direct.
     */
    DIRECT("D"),

    /**
     * GEIS network provider.
     */
    GEIS("G"),

    /**
     * TDNI network provider.
     */
    TDNI("T"),

    /**
     * TRAXON network provider.
     */
    TRAXON("X");

    /**
     * Attribute to hold <code>networkType</code> value.
     */
    private String networkType;

    /**
     * Constructor with network type as an argument.
     * <p>
     * 
     * @param pNetworkType <code>String</code><br>
     *            Holds the Network type.<br>
     */
    private NetworkType(final String pNetworkType) {
        this.networkType = pNetworkType;
    }

    /**
     * Gets <code>NetworkType</code> enum from the enum value.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.<br>
     *            </p>
     * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.constants.NetworkType NetworkType}</code><br>
     *         Returns the Network type.<br>
     */
    public static NetworkType getNetworkTypeFromValue(final String pValue) {
        NetworkType aKey = null;
        for (final NetworkType aNetworkType : NetworkType.values()) {
            if (aNetworkType.value().equals(pValue)) {
                aKey = aNetworkType;
                break;
            }
        }
        return aKey;
    }

    /**
     * Returns the value of the <code>NetworkType</code> enum.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value of the NetworkType type.<br>
     */
    public String value() {
        return this.networkType;
    }
}