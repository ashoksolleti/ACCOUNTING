/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>OfficeType</code> holds the office type for an office.<br>
 * . The value that is currently allowed is: D - Default Office.<br>
 * .
 */
public enum OfficeType {
    /**
     * D- Default office.<br>
     */
    DEFAULT("D");

    /**
     * Attribute to hold <code>officeType</code>.
     */
    private String officeType;

    /**
     * Constructor with office type as an argument.
     * <p>
     * 
     * @param pOfficeType <code>String</code> Holds the office type.<br>
     */
    private OfficeType(final String pOfficeType) {
        this.officeType = pOfficeType;
    }

    /**
     * This method <code>getOfficeType</code> returns the office type.
     * <p>
     * 
     * @param pOfficeType <code>String</code><br>
     *            The value of due code.<br>
     *            </p>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.constants.OfficeType OfficeType}</code><br>
     *         Returns the type of office which is default.<br>
     *         </p>
     */
    public static OfficeType getOfficeType(final String pOfficeType) {

        OfficeType anOfficeType = null;

        for (final OfficeType aType : OfficeType.values()) {
            if (pOfficeType.equals(aType.value())) {
                anOfficeType = aType;
                break;
            }
        }
        return anOfficeType;
    }

    /**
     * The <code>value</code> method gives the string format of office type.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the office type.<br>
     */

    public String value() {
        return this.officeType;
    }
}
