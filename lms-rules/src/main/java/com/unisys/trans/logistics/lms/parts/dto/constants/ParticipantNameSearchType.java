/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto.constants;

/**
 * <code>ParticipantNameSearchType</code> class represents the types of searches allowed for participants.
 * <p>
 */
public enum ParticipantNameSearchType {

    /**
     * This is an enumerated participant name type constant for alias participant search.
     */
    NAMETYPECODE_ALIAS_SEARCH("3"),

    /**
     * This is an enumerated participant name type constant for all type of searches.
     */
    NAMETYPECODE_GROUPED_SEARCH("4"),

    /**
     * This is an enumerated participant name type constant for only name search.
     */
    NAMETYPECODE_NAME_SEARCH("1"),

    /**
     * This is an enumerated participant name type constant for one time participant search.
     */
    NAMETYPECODE_ONETIME_SEARCH("2");

    /**
     * Attribute to hold the <code>val</code> property.
     */
    private String val;

    /**
     * <code>Parameterized constructor.</code>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.
     */
    ParticipantNameSearchType(final String pValue) {
        this.val = pValue;
    }

    /**
     * Gets the Enum Constant value for the given value.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.
     *            <p>
     * @return <code>ParticipantNameSearchType</code><br>
     *         Returns the value.
     */

    public static ParticipantNameSearchType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the key of the enum.
     * <p>
     * 
     * @param pVal <code>String</code><br>
     *            Contains the enum value.
     *            <p>
     * @return <code>ParticipantNameSearchType</code><br>
     *         Returns the value.
     */
    public static ParticipantNameSearchType getKey(final String pVal) {
        ParticipantNameSearchType aKey = null;
        for (final ParticipantNameSearchType bParticipantNameType : ParticipantNameSearchType.values()) {
            if (pVal.equalsIgnoreCase(bParticipantNameType.getValue())) {
                aKey = bParticipantNameType;
            }
        }
        return aKey;
    }

    /**
     * Gets the <code>ParticipantNameSearchType</code>.
     * <p>
     * 
     * @param pParticipantNameSearchType <code>String</code>
     *            <p>
     * @return <code>ParticipantNameSearchType</code><br>
     *         Returns the name type the participant holds.
     */
    public static ParticipantNameSearchType getParticipantNameSearchType(
                final String pParticipantNameSearchType) {

        ParticipantNameSearchType aParticipantNameSearchType = null;

        for (final ParticipantNameSearchType aType : ParticipantNameSearchType.values()) {

            if (pParticipantNameSearchType.equals(aType.value())) {
                aParticipantNameSearchType = aType;
                break;
            }
        }

        return aParticipantNameSearchType;

    }

    /**
     * Gets the value of the enum constant.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value.
     */
    public String getValue() {
        return this.val;
    }

    /**
     * Gets the string value of the object.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value.
     */
    public String value() {
        return this.name();
    }
}
