/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>TTYOutgoingDoubleSignatureIndicator</code> defines the Outgoing Double signature values for the
 * messages. Following are the valid values:<br>
 * <ul>
 * <li>A - Use the airline code from the TTY address of the message recipient.</li>
 * <li>F - Use carrier/airline code of the flight/ACN number from the message.</li>
 * </ul>
 */
public enum TTYOutgoingDoubleSignatureType {
    /**
     * A - Use the airline code from the TTY address of the message recipient. If being sent to more than one
     * TTY address, use the first non-central TTY/TPR address.
     */
    A,
    /**
     * F - For FFM and FWB, use the carrier code of the flight from the message (if present in the FWB
     * message). For FFR, FFA, FSR, FSA, FSU, FAD, FWR, FBL, FBR, FZC, FZD, FZE, and FWB (when no flight is
     * present), use the airline code corresponding to the ACN number from the message. For FVR, FVA, FOR,
     * FOA, FMA and FNA messages this value is treated as a blank.
     */
    F;
    /**
     * Default constructor.
     */
    private TTYOutgoingDoubleSignatureType() {
    }

    /**
     * Gets <code>TTYOutgoingDoubleSignatureIndicator</code> enum from the enum value.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.<br>
     *            </p>
     * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.constants.TTYOutgoingDoubleSignatureType TTYOutgoingDoubleSignatureType}</code>
     * <br>
     *         Returns the <code>TTYOutgoingDoubleSignatureIndicator</code> enum.<br>
     */
    public static TTYOutgoingDoubleSignatureType getFromValue(final String pValue) {
        TTYOutgoingDoubleSignatureType aKey = null;
        for (final TTYOutgoingDoubleSignatureType aTTYOutgoingDoubleSignatureIndicatorValue : TTYOutgoingDoubleSignatureType
                    .values()) {
            if (aTTYOutgoingDoubleSignatureIndicatorValue.name().equals(pValue)) {
                aKey = aTTYOutgoingDoubleSignatureIndicatorValue;
                break;
            }
        }
        return aKey;
    }
}