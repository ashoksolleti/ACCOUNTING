/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto.constants;

/**
 * <code>ParticipantAccountType</code> class represents the types of account numbers of the participant. A
 * participant can have billing account numbers and IATA agent account number.
 * <p>
 */
public enum ParticipantAccountType {

    /**
     * This is an enumerated participant account type constant for maintaining billing account1 operation.
     */
    BILLING_ACCOUNT("B"),
    
    GOVERNMENT_ACCOUNT("G"),    // LMSC-11111 UIS158 Change

    /**
     * This is an enumerated action type constant for maintaining IATA account operation.
     */
    IATA_ACCOUNT("I"), CGC_ACCOUNT("C"), CPF_ACCOUNT("P");
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
    ParticipantAccountType(final String pValue) {
        this.val = pValue;
    }

    /**
     * Gets the Enum Constant value for the given value.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.
     *            <p>
     * @return <code>ParticipantAccountType</code><br>
     *         Returns the value.
     */

    public static ParticipantAccountType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the key of the enum.
     * <p>
     * 
     * @param pVal <code>String</code><br>
     *            Contains the enum value.
     *            <p>
     * @return <code>ParticipantAccountType</code><br>
     *         Returns the value.
     */
    public static ParticipantAccountType getKey(final String pVal) {
        ParticipantAccountType aKey = null;
        for (final ParticipantAccountType bParticipantAccountType : ParticipantAccountType.values()) {
            if (pVal.equalsIgnoreCase(bParticipantAccountType.getValue())) {
                aKey = bParticipantAccountType;
            }
        }
        return aKey;
    }

    /**
     * Gets the <code>ParticipantAccountType</code>.
     * <p>
     * 
     * @param pParticipantAccountType <code>String</code>
     *            <p>
     * @return <code>ParticipantAccountType</code><br>
     *         Returns the account type the participant holds.
     */
    public static ParticipantAccountType getParticipantAccountType(final String pParticipantAccountType) {

        ParticipantAccountType aParticipantAccountType = null;

        for (final ParticipantAccountType aType : ParticipantAccountType.values()) {

            if (pParticipantAccountType.equals(aType.value())) {
                aParticipantAccountType = aType;
                break;
            }
        }

        return aParticipantAccountType;

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
