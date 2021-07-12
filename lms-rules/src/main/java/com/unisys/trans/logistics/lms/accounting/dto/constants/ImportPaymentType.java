//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>ImportPaymentType</code> holds the constants to indicate ImportPayCode type applied.
 * <p>
 * Following are the possible ImportPayCode type:<br>
 * <ul>
 * <li>CG
 * <li>CK
 * <li>CP
 * <li>CR
 * <li>CS
 * <li>CX
 * <li>NC
 * <li>PX
 * </ul>
 */
public enum ImportPaymentType {

    /**
     * Constant used for Consigee.
     */
    CG("CG"),

    /**
     * Constant used for Consigee.
     */
    CK("CK"),

    /**
     * Constant used for Consigee.
     */
    CP("CP"),

    /**
     * Constant used for Consigee.
     */
    CR("CR"),

    /**
     * Constant used for Consigee.
     */
    CS("CS"),

    /**
     * Constant used for Consigee.
     */
    CX("CX"),

    /**
     * Constant used for Consigee.
     */
    NC("NC");

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
    ImportPaymentType(final String pPayCode) {
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
    
    public static ImportPaymentType getImportPaymentType(final String pImportPaymentType) {

        ImportPaymentType aMatchedImportPaymentType = null;

        for (final ImportPaymentType aType : ImportPaymentType.values()) {

            if (pImportPaymentType.equals(aType.value())) {
                aMatchedImportPaymentType = aType;
                break;
            }
        }

        return aMatchedImportPaymentType;

    }
}
