/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>AccountNumberType</code> holds the constants to indicate the AccountNumberType applied.
 * <p>
 * Following are the possible AccountNumberType :<br>
 * <ul>
 * <li>ACTIVE- A
 * <li>INACTIVE - I
 * </ul>
 */
public enum AccountNumberType {
    /**
     * Indicates that the contract status type is ACTIVE.
     */
    ACTIVE("A"),
    /**
     * Indicates that the contract status type is INACTIVE.
     */
    INACTIVE("I");

    /**
     * Attribute to hold the <code>AccountNumberType</code> property.
     */

    private String type;

    /**
     * Constructor with <code>AccountNumberType</code> as an argument.
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code>.<br>
     */
    private AccountNumberType(final String pType) {
        this.type = pType;
    }

    /**
     * Gets the <code>AccountNumberType</code> based on the given string.
     * 
     * @param pValue
     *            the string representation of <code>AccountNumberType</code>
     * @return
     *         A enum of type <code>AccountNumberType</code>
     */

    public static AccountNumberType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * This method <code>getAccountNumberType</code> returns the AccountNumberType.
     * 
     * @param pAccountNumberType <code>String</code><br>
     *            The value of due code.<br>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.constants.AccountNumberType
     *         pAccountNumberType}</code><br>
     *         Returns the type of Contract <br>
     *         </p>
     */
    public static AccountNumberType getAccountNumberType(final String pAccountNumberType) {

        AccountNumberType anAccountNumberType = null;

        for (final AccountNumberType aType : AccountNumberType.values()) {
            if (pAccountNumberType.equals(aType.value())) {
                anAccountNumberType = aType;
                break;
            }
        }
        return anAccountNumberType;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * Holds the AccountNumberType code applicable for a contract.
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
     * Holds the AccountNumberType code applicable for a contract.
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code> property.<br>
     */
    public void setType(final String pType) {
        this.type = pType;
    }

    /**
     * The <code>value</code> method gives the string format of AccountNumberType.
     * <p>
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the AccountNumberType.<br>
     */
    public String value() {
        return this.type;
    }
}
