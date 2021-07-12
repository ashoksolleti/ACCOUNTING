/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>OfficeStatusCodeType</code> holds the current status of the office. the possible values are:<br>
 * A- Active office.<br>
 * I - In-active office.<br>
 */
public enum OfficeStatusType {

    /**
     * A-Active Office.<br>
     */
    A,
    /**
     * I-Inactive Office.<br>
     */
    I;

    /**
     * This method <code>getOfficeStatusTypeCode</code> returns the office status.
     * <p>
     * 
     * @param pOfficeStatusTypeCode <code>String</code><br>
     *            The value of due code.<br>
     *            </p>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.constants.OfficeStatusType
     *         OfficeStatusTypeCode}</code><br>
     *         Returns the status of office.<br>
     *         </p>
     */
    public static OfficeStatusType getOfficeStatusCodeType(final String pOfficeStatusTypeCode) {

        OfficeStatusType anOfficeStatusType = null;

        for (final OfficeStatusType aType : OfficeStatusType.values()) {
            if (pOfficeStatusTypeCode.equals(aType.value())) {
                anOfficeStatusType = aType;
                break;
            }
        }
        return anOfficeStatusType;
    }

    /**
     * The <code>value</code> method gives the string format of office status.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the office status.<br>
     */
    public String value() {
        return this.name();
    }
}
