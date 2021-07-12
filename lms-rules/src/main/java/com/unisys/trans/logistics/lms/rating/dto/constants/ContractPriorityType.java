/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>ContractPriorityType</code> holds the constants to indicate Contract Priority type applied.
 * <p>
 * Following are the possible Contract Priority type:<br>
 * <ul>
 * <li>ONE
 * <li>TWO
 * <li>THREE
 * <li>FOUR
 * <li>FIVE
 * <li>SIX
 * <li>SEVEN
 * <li>EIGHT
 * <li>NINE
 * </ul>
 */

public enum ContractPriorityType {

    /**
     * Constant used for ContractPriorityType.
     */
    EIGHT("8"),
    /**
     * Constant used for ContractPriorityType.
     */
    FIVE("5"),
    /**
     * Constant used for ContractPriorityType.
     */
    FOUR("4"),
    /**
     * Constant used for ContractPriorityType.
     */
    NINE("9"),
    /**
     * Constant used for ContractPriorityType.
     */
    ONE("1"),
    /**
     * Constant used for ContractPriorityType.
     */
    SEVEN("7"),
    /**
     * Constant used for ContractPriorityType.
     */
    SIX("6"),
    /**
     * Constant used for ContractPriorityType.
     */
    THREE("3"),
    /**
     * Constant used for ContractPriorityType.
     */
    TWO("2");

    /**
     * Attribute to hold the <code>ContractStatusType</code> property.
     */
    private String type;

    /**
     * <code>Default constructor.</code>
     */
    private ContractPriorityType() {

    }

    /**
     * Constructor with <code>ContractStatusType</code> as an argument.
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code>.<br>
     */

    private ContractPriorityType(final String pType) {
        this.type = pType;
    }

    /**
     * This method <code>getContractPriorityType</code> returns the ContractPriorityType.
     * 
     * @param pContractPriorityType <code>String</code><br>
     *            The String value of ContractPriorityPriorityType type.<br>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.constants.ContractPriorityType
     *         pContractPriorityType}</code><br>
     *         Returns the type of Contract <br>
     *         </p>
     */
    public static ContractPriorityType getContractPriorityType(final String pContractPriorityType) {

        ContractPriorityType anContractPriorityType = null;

        for (final ContractPriorityType aType : ContractPriorityType.values()) {
            if (pContractPriorityType.equals(aType.getType())) {
                anContractPriorityType = aType;
                break;
            }
        }
        return anContractPriorityType;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * 
     * @return the current value of the <code>type</code> property.
     */
    public String getType() {
        return this.type;
    }

    /**
     * The <code>value</code> method gives the string format of contract status type.
     * <p>
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the contract status type.<br>
     */
    public String value() {
        return this.name();
    }
}
