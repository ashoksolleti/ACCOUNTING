/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>DirectionType</code> holds the constants to indicate the DirectionType.
 * <p>
 * Following are the possible DirectionType :<br>
 * <ul>
 * <li>F -FROM
 * <li>T - TO
 * <li>B -BETWEEN
 * </ul>
 */
public enum DirectionType {
    /**
     * Constant B used for DirectionType.
     */
    B("BETWEEN", 3),
    /**
     * Constant F used for DirectionType.
     */
    F("FROM", 1),
    /**
     * Constant T used for DirectionType.
     */
    T("TO", 2);

    /** Priority with which rate class is displayed. */

    private final int displayPriority;

    /**
     * Attribute to hold the <code>UpdateSourceType</code> property.
     */
    private String type;

    /**
     * Constructor with <code>DirectionType</code> as an argument.
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code>.<br>
     * @param pDisplayPriority
     *            the new value of the <code>displayPriority</code>.<br>
     */
    private DirectionType(final String pType, final int pDisplayPriority) {
        this.type = pType;
        this.displayPriority = pDisplayPriority;
    }

    /**
     * Gets the <code>DirectionType</code> based on the given string.
     * 
     * @param pValue
     *            the string representation of <code>DirectionType</code>
     * @return A enum of type <code>DirectionType</code>
     */
    public static DirectionType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * This method <code>getDirectionType</code> returns the Direction type.
     * <p>
     * 
     * @param pNumericDirectionType
     *            <code>int</code><br>
     *            The value of due code.<br>
     *            </p>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.constants.DirectionType
     *         DirectionType}</code><br>
     *         Returns the Direction.<br>
     *         </p>
     */
    public static DirectionType getDirectionType(final int pNumericDirectionType) {

        DirectionType anDirectionType = null;

        for (final DirectionType aType : DirectionType.values()) {
            if (pNumericDirectionType == aType.displayPriority) {
                anDirectionType = aType;
                break;
            }
        }
        return anDirectionType;
    }
    
    /**
     * This method <code>getDirectionType</code> returns the Direction type.
     * <p>
     * 
     * @param pDirectionType
     *            <code>String</code><br>
     *            The value of due code.<br>
     *            </p>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.constants.DirectionType
     *         DirectionType}</code><br>
     *         Returns the Direction.<br>
     *         </p>
     */
    public static DirectionType getDirectionType(final String pDirectionType) {

        DirectionType anDirectionType = null;

        for (final DirectionType aType : DirectionType.values()) {
            if (pDirectionType.equals(aType.value())) {
                anDirectionType = aType;
                break;
            }
        }
        return anDirectionType;
    }

    /**
     * Gets the value of displayPriority.
     * 
     * @return the displayPriority
     */
    public int getDisplayPriority() {
        return this.displayPriority;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * Holds the DirectionType code applicable for a JointRate .
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
     * Holds the DirectionType code applicable for a JointRate .
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code> property.<br>
     */
    public void setType(final String pType) {
        this.type = pType;
    }

    /**
     * The <code>value</code> method gives the string format of DirectionType.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the DirectionType.<br>
     */
    public String value() {
        return this.type;
    }
}
