/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>QueueItemType</code> holds the the content type of the queue.
 */
public enum DeletionType {

    /**
     * M - Indicates a queue of type 'Message' which holds the actual information/content
     * of the queue items .<br>
     */
    ALL("A"),

    /**
     * N - Indicates a queue of type 'Non-Message' which holds references to a queue item type which can be a
     * AWB,Booking, etc .<br>
     */
    SELECTED("S");

    /**
     * Attribute to hold the <code>queueType</code> property.
     */
    private String deletionType;

    /**
     * Constructor with <code>deletionType</code> as an argument.
     * <p>
     * 
     * @param pDeletionType the new value of the <code>deletionType</code>.<br>
     */
    DeletionType(final String pDeletionType) {
        this.deletionType = pDeletionType;
    }

    /**
     * This method returns the enumerated value of <code>DeletionType</code> value.
     * <p>
     * 
     * @param pDeletionType the new value of <code>QueueType</code>.
     *            <p>
     * @return the enumerated value of the <code>DeletionType</code>.
     */
    public static DeletionType fromValue(final String pDeletionType) {
        return valueOf(pDeletionType);
    }

    /**
     * Gets the key of the enum.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            The value of the enumerated type.<br>
     *            </p>
     *            <p>
     * @return <code>DeletionType</code><br>
     *         Returns the value.<br>
     *         <p>
     */
    public static DeletionType getKey(final String pValue) {
        DeletionType aKey = null;
        for (final DeletionType aDeletioType : DeletionType.values()) {
            if (pValue.equalsIgnoreCase(aDeletioType.getValue())) {
                aKey = aDeletioType;
            }
        }
        return aKey;
    }

    /**
     * Gives the string format of <code>deletionType</code>.
     * <p>
     * 
     * @return the current value of <code>deletionType</code>.
     */
    public String getValue() {
        return this.deletionType;
    }

    /**
     * The <code>value</code> method gives the string format of queue type.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of queue type.<br>
     */
    public String value() {
        return this.name();
    }

}