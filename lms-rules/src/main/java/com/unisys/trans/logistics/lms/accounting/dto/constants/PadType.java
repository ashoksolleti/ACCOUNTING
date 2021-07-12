//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>PadType</code> holds the constants to indicate Pad type applied.
 * <p>
 * Following are the possible Pad type:<br>
 * <ul>
 * <li>B
 * <li>F
 * <li>G
 * <li>H
 * <li>I
 * <li>K
 * <li>N
 * <li>R
 * <li>T
 * <li>Y
 * </ul>
 */
public enum PadType {

    /**
     * Terminal warehouse handling.
     */
    A("A"),
    
    /**
     * Constant used for ULD Booking.
     */
    B("B"),
    
    /**
     * Dimensions.
     */
    D("D"),
    
    /**
     * Email address.
     */
    E("E"),

    /**
     * Constant used for Freight Waybill (FWB).
     */
    F("F"),

    /**
     * Constant used for General.
     */
    G("G"),

    /**
     * Constant used for Handling.
     */
    H("H"),

    /**
     * Constant used for Images/ Attachments.
     */
    I("I"),

    /**
     * Constant used for Track & Trace is current status.
     */
    K("K"),

    /**
     * Constant used for Never Found is current status.
     */
    N("N"),

    /**
     * Constant used for Code Red is current status.
     */
    R("R"),

    /**
     * Constant used for Tracing.
     */
    T("T"),

    /**
     * Constant used for Found (inactive) is current status.
     */
    V("V");

    /**
     * Attribute to hold the <code>pad</code> property.
     */
    private String pad;

    /**
     * Parameterize constructor.
     * 
     * @param pPad
     *            the value.
     */
    PadType(final String pPad) {
        this.pad = pPad;
    }

    /**
     * @return the pad
     */
    public String getPad() {
        return this.pad;
    }

    /**
     * Gives the string format of enumerated <code>PadType</code>.
     * <p>
     * 
     * @return the current string value of the <code>PadType</code>.
     */
    public String value() {
        return this.name();
    }

    public static PadType getPadType(final String pPadType) {

    	PadType aMatchedPadType = null;

        for (final PadType aType : PadType.values()) {

            if (pPadType.equals(aType.value())) {
                aMatchedPadType = aType;
                break;
            }
        }

        return aMatchedPadType;

    }
}
