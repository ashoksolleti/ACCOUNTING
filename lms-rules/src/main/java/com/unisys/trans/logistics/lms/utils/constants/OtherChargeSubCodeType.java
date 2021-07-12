/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.constants;

/**
 * <code>OtherChargeSubCodeType</code> class holds the OtherChargeSubCodeType constants.
 * <p>
 */
public enum OtherChargeSubCodeType {

    /**
     * Holds the value of default sub code value for A.
     */
    MISC_CHARGE_TO_AIRLINE("A"),

    /**
     * Holds the value of default sub code value for E.
     */
    ONE_CHAR_MISC_SUB_CODE("E"),

    /**
     * Holds the value of default sub code value for O.
     */
    OPTIONAL_SUB_CODE("O"),

    /**
     * Holds the value of default sub code value for S.
     */
    SINGLE_ALPHA_MISC_SUB_CODE("S"),

    /**
     * Holds the value of default sub code value for N.
     */
    SUB_CODE_PROHIBITED("N"),

    /**
     * Holds the value of default sub code value for D.
     */
    TWO_CHAR_MISC_SUB_CODE("D");

    /**
     * Attribute to hold the <code>otherChargeSubCodeType</code>.
     */
    private final String otherChargeSubCodeType;

    /**
     * Constructor with <code>OtherChargeSubCodeType</code> as an argument.
     * <p>
     * 
     * @param pOtherChargeSubCodeType the new value of the <code>OtherChargeSubCodeType</code>.<br>
     */
    OtherChargeSubCodeType(final String pOtherChargeSubCodeType) {
        this.otherChargeSubCodeType = pOtherChargeSubCodeType;
    }

    /**
     * Gets the value of the <code>OtherChargeSubCodeType</code> string.
     * <p>
     * 
     * @return the current value of <code>OtherChargeSubCodeType</code>.
     */
    public String getOtherChargeSubCodeType() {
        return this.otherChargeSubCodeType;
    }

    /**
     * The <code>value</code> method gives the string format of otherChargeSubCodeType.
     * <p>
     * 
     * @return the enumerated value of the <code>otherChargeSubCodeType</code>.
     */
    public String value() {
        return this.name();
    }
}
