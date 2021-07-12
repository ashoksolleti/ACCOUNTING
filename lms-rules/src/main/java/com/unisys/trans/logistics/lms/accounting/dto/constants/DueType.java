//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>DueType</code> holds the constants to indicate Due type applied.
 * <p>
 * Following are the possible Due type:<br>
 * <ul>
 * <li>A
 * <li>C
 * <li>T
 * <li>S
 * <li>N
 * </ul>
 */
public enum DueType {

    /**
     * Constant used for Consignee.
     */
    A("A"),

    /**
     * Constant used for Consignee.
     */
    C("C"),

    /**
     * Constant used for Consignee.
     */
    T("T"),

    /**
     * Constant used for Consignee.
     */
    S("S"),
    
    /**
     * Constant used for Consignee.
     */
    E("E"),

    /**
     * Constant used for Consignee.
     */
    N("N");

    /**
     * Attribute to hold the <code>due</code> property.
     */
    private String due;

    /**
     * Parameterize constructor.
     * 
     * @param pDue
     *            the value.
     */
    DueType(final String pDue) {
        this.due = pDue;
    }

    /**
     * @return the due
     */
    public String getDue() {
        return this.due;
    }

    /**
     * Gives the string format of enumerated <code>DueType</code>.
     * <p>
     * 
     * @return the current string value of the <code>DueType</code>.
     */
    public String value() {
        return this.name();
    }
}
