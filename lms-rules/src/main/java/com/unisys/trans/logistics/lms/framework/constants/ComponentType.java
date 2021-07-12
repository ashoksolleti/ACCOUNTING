/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>ComponentType</code> enum maintains a list of component type constants pertaining to LMS module.
 */
public enum ComponentType {

    /**
     * This is an enumerated action type constant to specify ACCOUNTING component.
     */
    ACCOUNTING,
	/**
     * This is an enumerated action type constant to specify ARC component.
     */
    ARCHIVE,
    /**
     * This is an enumerated action type constant to specify AWB component.
     */
    AWB,
    /**
     * This is an enumerated action type constant to specify FLIGHTS component.
     */
    FLIGHTS,
    /**
     * This is an enumerated action type constant to specify FRAMEWORK component.
     */
    FRAMEWORK,
    /**
     * This is an enumerated action type constant to specify PARTS component.
     */
    PARTS,
    /**
     * This is an enumerated action type constant to specify PLT component.
     */
    PLT,
    /**
     * This is an enumerated action type constant to specify RATING component.
     */
    RATING,
    /**
     * This is an enumerated action type constant to specify RESERVATION component.
     */
    RESERVATION,
    /**
     * This is an enumerated action type constant to specify ROUTING component.
     */
    ROUTING,
    /**
     * This is an enumerated action type constant to specify SPACE component.
     */
    SPACE,
    /**
     * This is an enumerated action type constant to specify SYSTEM component.
     */
    SYSTEM,
    /**
     * This is an enumerated action type constant to specify ULDCONTROL component.
     */
    ULDCONTROL,
    /**
     * This is an enumerated action type constant to specify UTILS component.
     */
    UTILS,

    /**
     * This is an enumerated action type constant to specify WAREHOUSE component.
     */
    WAREHOUSE;

    /**
     * Gets the <code>ComponentType</code>.
     * <p>
     * 
     * @param pValue the new value of <code>ComponentType</code>
     *            <p>
     * @return the current value of <code>ComponentType</code>
     */
    public static ComponentType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the <code>ComponentType</code>.
     * <p>
     * 
     * @param pComponentType the new value of <code>ComponentType</code>
     *            <p>
     * @return the current value of <code>ComponentType</code>
     */
    public static ComponentType getComponentType(final String pComponentType) {

        ComponentType aComponentType = null;

        for (final ComponentType aType : ComponentType.values()) {

            if (pComponentType.equals(aType.value())) {
                aComponentType = aType;
                break;
            }
        }

        return aComponentType;

    }

    /**
     * Gives the string format of enumerated <code>ComponentType</code>.
     * <p>
     * 
     * @return the current value of the <code>ComponentType</code>
     */
    public String value() {
        return this.name();
    }

}
