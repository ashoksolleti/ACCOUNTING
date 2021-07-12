/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>UpdateSourceType</code> holds the constants to indicate the update
 * source type applied.
 * <p>
 * Following are the possible update source type :<br>
 * <ul>
 * <li>MANUAL - M
 * <li>TAPELOAD - T
 * <li>PFM (PERIODIC FILE MAINTANENCE) - P
 * </ul>
 */
public enum UpdateSourceType {

    /**
     * Indicates that the UpdateSourceType type is MANUAL.
     */
    MANUAL("M", "Manual"),
    /**
     * Indicates that the UpdateSourceType type is PERIODIC FILE MAINTANENCE.
     */
    PFM("P", "PFM"),
    /**
     * Indicates that the UpdateSourceType type is GLOBAL TASK.
     */
    GLOBAL("G", "Global"),
    /**
     * Indicates that the UpdateSourceType type is TAPELOAD.
     */
    RATELOAD("T", "Rate Load");

    /**
     * Attribute to hold the <code>UpdateSourceType</code> property.
     */
    private String type;

    /**
     * Attribute to hold the <code>UpdateSourceType</code> property.
     */
    private String name;

    /**
     * Constructor with <code>UpdateSourceType</code> as an argument.
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code>.<br>
     */
    private UpdateSourceType(final String pType, final String pName) {
        this.type = pType;
        this.name = pName;
    }

    /**
     * Gets the <code>UpdateSourceType</code> based on the given string.
     * 
     * @param pValue
     *            the string representation of <code>UpdateSourceType</code>
     * @return A enum of type <code>UpdateSourceType</code>
     */
    public static UpdateSourceType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * Holds the update source type code applicable for a tariff rate.
     * 
     * @param pUpdateSourcetype
     *            the enum representation of <code>UpdateSourceType</code>
     *            <p>
     * 
     * @return the current value of the <code>type</code> property.<br>
     */
    public static UpdateSourceType getUpdateSourceType(
                final String pUpdateSourcetype) {

        UpdateSourceType anUpdateSourceType = null;

        for (final UpdateSourceType aType : UpdateSourceType.values()) {
            if (aType.value().equalsIgnoreCase(pUpdateSourcetype)) {
                anUpdateSourceType = aType;
                break;
            }
        }
        return anUpdateSourceType;
    }

    /**
     * Sets the <code>type</code> property.
     * <p>
     * Holds the update source type code applicable for a tariff rate.
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code> property.<br>
     * 
     * @return the current value of the <code>type</code> property.<br>
     */
    public String getType() {
        return this.type;
    }

    /**
     * The <code>value</code> method gives the string format of
     * UpdateSourceType.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the UpdateSourceType.<br>
     */
    public String value() {
        return this.type;
    }

    /**
     * The <code>name</code> method gives the string format of
     * UpdateSourceType.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the UpdateSourceType.<br>
     */
    public String getName() {
        return this.name;
    }

}
