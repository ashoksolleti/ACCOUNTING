/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>QueueItemType</code> holds the the content type of the queue.
 */
public enum QueueType {

    /**
     * M - Indicates a queue of type 'Message' which holds the actual information/content
     * of the queue items .<br>
     */
    M("Message"),

    /**
     * N - Indicates a queue of type 'Non-Message' which holds references to a queue item type which can be a
     * AWB,Booking, etc .<br>
     */
    N("Non Message");

    /**
     * Attribute to hold the <code>queueType</code> property.
     */
    private String queueType;

    /**
     * Constructor with <code>queueType</code> as an argument.
     * <p>
     * 
     * @param pQueueType the new value of the <code>queueType</code>.<br>
     */
    QueueType(final String pQueueType) {
        this.queueType = pQueueType;
    }

    /**
     * This method returns the enumerated value of <code>QueueType</code> value.
     * <p>
     * 
     * @param pQueueType the new value of <code>QueueType</code>.
     *            <p>
     * @return the enumerated value of the <code>QueueType</code>.
     */
    public static QueueType fromValue(final String pQueueType) {
        return valueOf(pQueueType);
    }

    /**
     * Gets the key of the enum.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            The value of the enumerated type.<br>
     *            </p>
     *            <p>
     * @return <code>QueueType</code><br>
     *         Returns the value.<br>
     *         <p>
     */
    public static QueueType getKey(final String pValue) {
        QueueType aKey = null;
        for (final QueueType aQueueType : QueueType.values()) {
            if (pValue.equalsIgnoreCase(aQueueType.getValue())) {
                aKey = aQueueType;
            }
        }
        return aKey;
    }

    /**
     * Gets the <code>QueueType</code>.
     * <p>
     * 
     * @param pQueueType <code>String</code><br>
     *            Contains the enum type.<br>
     *            </p>
     * @return
     *         Returns the <code>QueueType</code>
     */
    public static String getQueueType(final QueueType pQueueType) {

        String avalue = null;

        for (final QueueType aType : QueueType.values()) {

            if (pQueueType.equals(aType)) {
                avalue = aType.getQueueType();
                break;
            }
        }

        return avalue;

    }

    /**
     * Gets the type of queue.
     * 
     * @return the queueType
     */
    public String getQueueType() {
        return queueType;
    }

    /**
     * Gives the string format of <code>queueType</code>.
     * <p>
     * 
     * @return the current value of <code>queueType</code>.
     */
    public String getValue() {
        return this.queueType;
    }

    /**
     * Sets the type of queue.
     * 
     * @param pQueueType the new value of the <code>QueueType</code> property.
     */
    public void setQueueType(final String pQueueType) {
        this.queueType = pQueueType;
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