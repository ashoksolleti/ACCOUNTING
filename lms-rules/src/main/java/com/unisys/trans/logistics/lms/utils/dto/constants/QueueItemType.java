/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>QueueItemType</code> holds the constants specific to queue item type.
 * <p>
 * The Queue item type is applicable only in the case of 'Non-Message' queues.
 */
public enum QueueItemType {

    /**
     * Indicates that the queue item type pertains to an air waybill.
     */
    AIR_WAYBILL("A");

    /**
     * Attribute to hold the <code>queueItemType</code> property.
     */
    private String queueItemType;

    /**
     * Constructor with <code>queueItemType</code> as an argument.
     * <p>
     * 
     * @param pQueueItemType the new value of the <code>queueItemType</code>.<br>
     */
    QueueItemType(final String pQueueItemType) {
        this.queueItemType = pQueueItemType;
    }

    /**
     * This method returns the enumerated value of <code>QueueItemType</code> value.
     * <p>
     * 
     * @param pQueueItemType the new value of <code>QueueItemType</code>.
     *            <p>
     * @return the enumerated value of the <code>QueueItemType</code>.
     */
    public static QueueItemType fromValue(final String pQueueItemType) {
        return valueOf(pQueueItemType);
    }

    /**
     * Gets the key of the enum.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            The value of the enumerated type.<br>
     *            </p>
     *            <p>
     * @return <code>QueueItemType</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public static QueueItemType getKey(final String pValue) {
        QueueItemType aKey = null;
        for (final QueueItemType aQueueItemType : QueueItemType.values()) {
            if (pValue.equalsIgnoreCase(aQueueItemType.getValue())) {
                aKey = aQueueItemType;
            }
        }
        return aKey;
    }

    /**
     * Gives the string format of <code>queueItemType</code>.
     * <p>
     * 
     * @return the current value of <code>queueItemType</code>.
     */
    public String getValue() {
        return this.queueItemType;
    }

    /**
     * The <code>value</code> method gives the string format of queue item type.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of queue item type.<br>
     */
    public String value() {
        return this.name();
    }
}