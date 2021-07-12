//@formatter:off
/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * 
 * Creation/update source
 * <ul>
 * 
 * <li>S-Shipment Data Capture
 *     T-Terminal Warehouse
 *     I-Import Quality Assurance</li>
 * 
 * </ul>
 * 
 */
public enum ExchangeRateGenerationType {
    /**
     * Constant used for Fixed
     */
    F("F"),
    /**
     * Constant used for Import Quality Assurance.
     */
    I("I"),
    /**
     * Constant used for Shipment Data Capture.
     */
    S("S"),

    /**
     * Constant used for Terminal Warehouse.
     */
    T("T");

    /**
     * The <code>value</code> method gives the string format of action type.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the action type.<br>
     */
    private String value;

    /**
     * Parameterized constructor. Accepts the string representation of the enum
     * as the parameter
     * 
     * @param pValue
     *            String representaion of the enum
     */
    ExchangeRateGenerationType(final String pValue) {
        this.value = pValue;
    }

    /**
     * Parse the given string and find the matching enumeration constant. If no
     * match is found returns a null value.
     * 
     * @param pValue
     *            String value defined for the enum constant to be found.
     * @return Returns ExchangeRateGenerationType Enumerated value , or <code>null</code> if no matching enum is
     *         found.
     */
    ExchangeRateGenerationType parse(final String pValue) {
        ExchangeRateGenerationType itemFound = null;
        for (final ExchangeRateGenerationType item : ExchangeRateGenerationType
                    .values()) {
            if (pValue.equalsIgnoreCase(item.value)) {
                itemFound = item;
                break;
            }
        }
        return itemFound;
    }

}
