/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>ContractStatusType</code> holds the constants to indicate contract status type applied.
 * <p>
 * Following are the possible contract status type:<br>
 * <ul>
 * <li>ACTIVE - A
 * <li>DELETED - D
 * <li>HISTORY - H
 * <li>PENDING - P
 * <li>EXPIRED - E
 * </ul>
 */
public enum ContractStatusType {
    /**
     * Indicates that the contract status type is ACTIVE.
     */
    ACTIVE("A", "Active",2),
    /**
     * Indicates that the contract status type is DELETED.
     */
    DELETED("D", "Deleted",5),
    /**
     * Indicates that the contract status type is EXPIRED.
     */
    EXPIRED("E", "Expired",3),
    /**
     * Indicates that the contract status type is HISTORY.
     */
    HISTORY("H", "History",4),
    /**
     * Indicates that the contract status type is PENDING.
     */
    PENDING("P", "Pending",1);

    /**
     * Attribute to hold the <code>ContractStatusType</code> property.
     */
    private String type;

    /**
     * Attribute to hold the <code>ContractStatusName</code> property.
     */

    private String name;

    /**
     * Attribute to hold the <code>ContractStatusSortPriority</code> property.
     */

    private int sortPriority;

    /**
     * Constructor with <code>ContractStatusType</code> as an argument.
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code>.<br>
     * @param pName
     *            the new value of the <code>Name</code>.<br>
     */

    private ContractStatusType(final String pType, final String pName,final int pSortPriority) {
        this.type = pType;
        this.name = pName;
        this.sortPriority = pSortPriority;
    }

    /**
     * Gets the <code>ContractStatusType</code> based on the given string.
     * 
     * @param pValue
     *            the string representation of <code>ContractStatusType</code>
     * @return
     *         A enum of type <code>ContractStatusType</code>
     */
    public static ContractStatusType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * This method <code>getContractStatusType</code> returns the ContractStatusType.
     * 
     * @param pContractStatusTypeCode <code>String</code><br>
     *            The value of due code.<br>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.constants.ContractStatusType
     *         pContractStatusType}</code><br>
     *         Returns the type of Contract <br>
     *         </p>
     */

    public static ContractStatusType getContractStatusType(final String pContractStatusTypeCode) {

        ContractStatusType anContractStatusType = null;

        for (final ContractStatusType aType : ContractStatusType.values()) {
            if (aType.getName().equalsIgnoreCase(pContractStatusTypeCode)) {
                anContractStatusType = aType;
                break;
            }
        }

        return anContractStatusType;
    }

    /**
     * Gets the contract by <code>type</code> property.
     * <p>
     * Holds the ContractStatusType code applicable for a contract.
     * </p>
     * 
     * @param pContractStatusTypeCode
     *            holds the contract status type
     * 
     * @return the current value of the <code>type</code> property.<br>
     */
    public static ContractStatusType getContractStatusByType(final String pContractStatusTypeCode) {

        ContractStatusType anContractStatusType = null;

        for (final ContractStatusType aType : ContractStatusType.values()) {
            if (aType.getType().equalsIgnoreCase(pContractStatusTypeCode)) {
                anContractStatusType = aType;
                break;
            }
        }

        return anContractStatusType;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * Holds the ContractStatusType code applicable for a contract .
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
     * Holds the ContractStatusType code applicable for a contract .
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code> property.<br>
     */
    public void setType(final String pType) {
        this.type = pType;
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
        return this.type;
    }

    /**
     * Gets the <code>name</code> property.
     * <p>
     * Holds the ContractStatusType code applicable for a contract .
     * <p>
     * 
     * @return the current value of the <code>name</code> property.<br>
     */
    public String getName() {
        return this.name;
    }
    /**
     * Gets the <code>sortPriority</code> property.
     * <p>
     * Holds the ContractStatusType sort priority applicable for a Contract .
     * <p>
     * 
     * @return the current value of the <code>sortPriority</code> property.<br>
     */
    public int getSortPriority() {
        return sortPriority;
    }

    /**
     * Sets the <code>sortPriority</code> property.
     * <p>
     * Holds the ContractStatusType sort priority applicable for a contract .
     * <p>
     * 
     * @param pSortPriority
     *            the new value of the <code>sortPriority</code> property.<br>
     */
    public void setSortPriority(final int pSortPriority) {
        this.sortPriority = pSortPriority;
    }
}
