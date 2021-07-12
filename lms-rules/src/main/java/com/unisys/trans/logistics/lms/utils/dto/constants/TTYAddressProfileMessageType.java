/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>TTYAddressProfileMessageType</code> defines Message Type Code for Teletype Address Profile.
 */
public enum TTYAddressProfileMessageType {

    /**
     * Advice of Discrepancy.
     */
    FAD,
    /**
     * Freight Booked List.
     */
    FBL,
    /**
     * Freight Booking List Request.
     */
    FBR,
    /**
     * Space Allocation Answer.
     */
    FFA,
    /**
     * Flight Manifest Message.
     */
    FFM,
    /**
     * AWB Space Allocation Request.
     */
    FFR,
    /**
     * Freight Consolidation List.
     */
    FHL,
    /**
     * Message Acknowledgment.
     */
    FMA,
    /**
     * Error Message.
     */
    FNA,
    /**
     * Allotment Information Answer.
     */
    FOA,
    /**
     * Allotment Information Request.
     */
    FOR,
    /**
     * Status Answer.
     */
    FSA,
    /**
     * Status Request.
     */
    FSR,
    /**
     * Freight Status Update.
     */
    FSU,
    /**
     * Schedule and Availability Information Answer.
     */
    FVA,
    /**
     * Schedule and Availability Information Request.
     */
    FVR,
    /**
     * Air Waybill Data.
     */
    FWB,
    /**
     * Air Waybill Data Request.
     */
    FWR,
    /**
     * House Waybill Status Request.
     */
    FZC,
    /**
     * House Waybill Status Answer.
     */
    FZD,
    /**
     * House Waybill Status Update.
     */
    FZE;

    /**
     * Gets <code>TTYAddressProfileMessageType</code> enum from the enum value.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.<br>
     *            </p>
     * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.constants.TTYAddressProfileMessageType TTYAddressProfileMessageType}</code>
     * <br>
     *         Returns the <code>TTYAddressProfileMessageType</code> enum.<br>
     */
    public static TTYAddressProfileMessageType getTTYAddressProfileMessageTypeFromValue(final String pValue) {
        TTYAddressProfileMessageType aKey = null;
        for (final TTYAddressProfileMessageType aTTYAddressProfileMessageType : TTYAddressProfileMessageType
                    .values()) {
            if (aTTYAddressProfileMessageType.name().equals(pValue)) {
                aKey = aTTYAddressProfileMessageType;
                break;
            }
        }
        return aKey;
    }

    /**
     * The <code>value</code> method gives the string format of Message type.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns an enumerated value of the Message type.<br>
     */
    public String value() {
        return this.name();
    }
}
