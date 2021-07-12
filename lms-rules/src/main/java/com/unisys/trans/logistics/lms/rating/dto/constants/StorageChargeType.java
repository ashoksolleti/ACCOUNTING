/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>StorageChargeType</code> holds the constants to indicate whether the charge is per day (Single) or
 * for all days (Multiple).
 * <p>
 * Valid values for <code>StorageChargeType</code> are:
 * <ul>
 * <li>MULTIPLE_DAYS - M
 * <li>SINGLE_DAYS - S
 * </ul>
 * Default value is : SINGLE_DAY
 */
public enum StorageChargeType {

    /**
     * Indicates that the storage charge is for Multiple Days.
     */
    MULTIPLE_DAYS("M"),
    /**
     * Indicates that the storage charge for a Single Day.
     */
    SINGLE_DAY("S");

    /**
     * Attribute to hold the storageChargeType property.
     */
    private String storageChargeType;

    /**
     * Constructor with <code>storageChargeType</code> as an argument.
     * <p>
     * 
     * @param pStorageChargeType the new value of the <code>storageChargeType</code>.<br>
     */
    StorageChargeType(final String pStorageChargeType) {
        this.storageChargeType = pStorageChargeType;
    }

    /**
     * The <code>fromValue</code> method returns the <code>StorageChargeType</code> value.
     * <p>
     * 
     * @param pStorageChargeType the new value of <code>StorageChargeType</code>.
     *            <p>
     * @return the current enumerated value of the <code>StorageChargeType</code>.
     */
    public static StorageChargeType fromValue(final String pStorageChargeType) {

        StorageChargeType aStorageChargeType = null;
        for (final StorageChargeType bStorageChargeType : StorageChargeType.values()) {
            if (bStorageChargeType.getStorageChargeType().equals(pStorageChargeType)) {
                aStorageChargeType = bStorageChargeType;
                break;
            }
        }
        return aStorageChargeType;
    }

    /**
     * Gets the <code>storageChargeType</code> property.
     * <p>
     * Holds the value of storage charge type.
     * <p>
     * 
     * @return the current value of the <code>storageChargeType</code> property.<br>
     */
    public String getStorageChargeType() {
        return this.storageChargeType;
    }

    /**
     * The <code>value</code> method returns the string value of <code>StorageChargeType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>StorageChargeType</code>.<br>
     */
    public String value() {
        return this.getStorageChargeType();
    }
}