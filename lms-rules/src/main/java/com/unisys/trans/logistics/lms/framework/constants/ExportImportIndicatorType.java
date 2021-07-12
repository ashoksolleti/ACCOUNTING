/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>ExportImportIndicatorType</code> holds the constants to indicate ExportImportIndicator applied.
 * <p>
 * Following are the possible goods status type:<br>
 * <ul>
 * <li>EXPORT - E
 * <li>IMPORT - I
 * <li>TRANSIT - T
 * <li>EXPORT_TRANSFER - ET
 * <li>IMPORT_TRANSFER - IT
 * </ul>
 */
public enum ExportImportIndicatorType {

    /**
     * Constant used for EXPORT GOODS
     */
    EXPORT("E"),

    /**
     * Constant used for IMPORT GOODS.
     */
    IMPORT("I"),

    /**
     * Constant used for TRANSIT GOODS.
     */
    TRANSIT("T"),

    /**
     * Constant used for EXPORT_TRANSFER GOODS.
     */
    EXPORT_TRANSFER("ET"),

    /**
     * Constant used for IMPORT_TRANSFER GOODS.
     */
    IMPORT_TRANSFER("IT");

    /**
     * Attribute to hold the <code>ExportImportIndicatorType</code> property.
     */
    private String type;

    /**
     * Constructor with <code>ExportImportIndicatorType</code> as an argument.
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code>.<br>
     */

    private ExportImportIndicatorType(final String pType) {
        this.type = pType;
    }

    /**
     * Gets the <code>ExportImportIndicatorType</code> based on the given string.
     * 
     * @param pValue
     *            the string representation of <code>ExportImportIndicatorType</code>
     * @return
     *         A enum of type <code>ExportImportIndicatorType</code>
     */

    public static ExportImportIndicatorType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * This method <code>getExportImportIndicatorType</code> returns the ExportImportIndicatorType.
     * 
     * @param pExportImportIndicatorType <code>String</code><br>
     *            The value of due code.<br>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.constants.ExportImportIndicatorType
     *         ExportImportIndicatorType}</code><br>
     *         Returns the type of Goods <br>
     *         </p>
     */
    public static ExportImportIndicatorType getExportImportIndicatorType(
                final String pExportImportIndicatorType) {

        ExportImportIndicatorType anExportImportIndicatorType = null;

        for (final ExportImportIndicatorType aType : ExportImportIndicatorType.values()) {
            if (pExportImportIndicatorType.equals(aType.value())) {
                anExportImportIndicatorType = aType;
                break;
            }
        }
        return anExportImportIndicatorType;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * Holds the ExportImportIndicatorType code applicable for a goods .
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
     * Holds the ExportImportIndicatorType code applicable for a goods .
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code> property.<br>
     */
    public void setType(final String pType) {
        this.type = pType;
    }

    /**
     * The <code>value</code> method gives the string format of ExportImportIndicatorType.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the ExportImportIndicatorType.<br>
     */
    public String value() {
        return this.type;
    }
}
