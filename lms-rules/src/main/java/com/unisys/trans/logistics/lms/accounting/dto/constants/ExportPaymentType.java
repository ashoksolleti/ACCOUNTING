//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>ExportPaymentType</code> holds the constants to indicate ExportPayCode type applied.
 * <p>
 * Following are the possible ExportPayCode type:<br>
 * <ul>
 * <li>CA
 * <li>CB
 * <li>CC
 * <li>NC
 * <li>PC
 * <li>PD
 * <li>PG
 * <li>PP
 * <li>PX
 * <li>P
 * <li>C
 * </ul>
 */
public enum ExportPaymentType {

    /**
     * Constant used for Consignee.
     */
    CA("CA"),

    /**
     * Constant used for Consignee.
     */
    CB("CB"),

    /**
     * Constant used for Consignee.
     */
    CC("CC"),

    /**
     * Constant used for Consignee.
     */
    NC("NC"),

    /**
     * Constant used for Consignee.
     */
    PC("PC"),

    /**
     * Constant used for Consignee.
     */
    PD("PD"),

    /**
     * Constant used for Consignee.
     */
    PG("PG"),

    /**
     * Constant used for Consignee.
     */
    PP("PP"),

    /**
     * Constant used for Consignee.
     */
    PX("PX"),

    /**
     * Constant used for Consignee.
     */
    P("P"),

    /**
     * Constant used for Consignee.
     */
    C("C");

    /**
     * Attribute to hold the <code>payCode</code> property.
     */
    private String payCode;

    /**
     * Parameterize constructor.
     * 
     * @param pDue
     *            the value.
     */
    ExportPaymentType(final String pPayCode) {
        this.payCode = pPayCode;
    }

    /**
     * @return the payCode
     */
    public String getPayCode() {
        return this.payCode;
    }

    /**
     * Gives the string format of enumerated <code>ExportPaymentType</code>.
     * <p>
     * 
     * @return the current string value of the <code>ExportPaymentType</code>.
     */
    public String value() {
        return this.name();
    }

    public static ExportPaymentType getExportPaymentType(final String pExportPaymentType) {

        ExportPaymentType aSelectedExportPaymentType = null;

        for (final ExportPaymentType aType : ExportPaymentType.values()) {

            if (pExportPaymentType.equals(aType.value())) {
                aSelectedExportPaymentType = aType;
                break;
            }
        }

        return aSelectedExportPaymentType;

    }
}
