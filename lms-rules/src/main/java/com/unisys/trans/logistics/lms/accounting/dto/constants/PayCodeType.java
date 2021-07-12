/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>PayCodeType</code> holds the constants to indicate PayCodeType applied.
 * <p>
 * Following are the possible contract status type:<br>
 * <ul>
 * <li>PREPAID - P
 * <li>COLLECT - C
 * <li>COLLECT - D
 * </ul>
 */
public enum PayCodeType {

    /**
     * Constant used for Collect(origin currency is assumed).
     */
    COLLECT("Collect", "C"),

    /**
     * Constant used for Collect (destination currency is assumed).
     */
    COLLECT_DESTINATION("Collect Destination", "D"),

    /**
     * Constant used for EITHER.
     */
    EITHER("Either", "E"),

    /**
     * Constant used for PREPAID.
     */
    PREPAID("Prepaid", "P");

    /**
     * Attribute to hold the <code>PayCodeType</code> property.
     */
    private String type;

    /**
     * Attribute to hold the <code>payCode</code> property.
     */
    private String payCode;

    /**
     * Constructor with <code>PayCodeType</code> as an argument.
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code>.<br>
     */

    private PayCodeType(final String pPayCode, final String pType) {
        this.payCode = pPayCode;
        this.type = pType;
    }

    /**
     * Gets the <code>PayCodeType</code> based on the given string.
     * 
     * @param pValue
     *            the string representation of <code>PayCodeType</code>
     * @return A enum of type <code>PayCodeType</code>
     */

    public static PayCodeType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * This method <code>getPayCodeType</code> returns the ContractStatusType.
     * 
     * @param pPayCodeType
     *            <code>String</code><br>
     *            The value of due code.<br>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.constants.PayCodeType
     *         pPayCodeType}</code><br>
     *         Returns the type of Contract <br>
     *         </p>
     */
    public static PayCodeType getPayCodeType(final String pPayCodeType) {

        PayCodeType aMatchedPayCodeType = null;

        for (final PayCodeType aType : PayCodeType.values()) {
            if (pPayCodeType.equals(aType.value())) {
                aMatchedPayCodeType = aType;
                break;
            }
        }
        return aMatchedPayCodeType;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * Holds the PayCodeType code applicable for a contract .
     * <p>
     * 
     * @return the current value of the <code>type</code> property.<br>
     */
    public String getType() {
        return this.type;
    }

    /**
     * Sets the <code>type</code> property.
     * <p>
     * Holds the PayCodeType code applicable for a contract .
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code> property.<br>
     */
    public void setType(final String pType) {
        this.type = pType;
    }

    /**
     * The <code>value</code> method gives the string format of PayCodeType.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the PayCodeType.<br>
     */
    public String value() {
        return this.type;
    }

    public String getPayCode() {
        return this.payCode;
    }

}
