/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>QueueItemType</code> holds the the content type of the queue.
 */
public enum QueueCategoryType {
    /**
     * AUDITQUEUE - Indicates type of queue 'AuditQueue' which holds the actual information/content
     * of the queue items .<br>
     */
    AUDITQUEUE("AuditQueue"),
    BILLINGQUEUE("BillingQueue"),
    ACASERRORQ("ACASERRORQ");

    /**
     * Attribute to hold the <code>queueCategoryType</code> property.
     */
    private String queueCategoryType;

    /**
     * Constructor with <code>queueCategoryType</code> as an argument.
     * <p>
     * 
     * @param pQueueCategoryType the new value of the <code>queueCategoryType</code>.<br>
     */
    QueueCategoryType(final String pQueueCategoryType) {
        this.queueCategoryType = pQueueCategoryType;
    }

    /**
     * This method returns the enumerated value of <code>QueueCategoryType</code> value.
     * <p>
     * 
     * @param pQueueCategoryType the new value of <code>QueueCategoryType</code>.
     *            <p>
     * @return the enumerated value of the <code>QueueCategoryType</code>.
     */
    public static QueueCategoryType fromValue(final String pQueueCategoryType) {
        return valueOf(pQueueCategoryType);
    }

    /**
     * Gets the key of the enum.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            The value of the enumerated type.<br>
     *            </p>
     *            <p>
     * @return <code>QueueCategoryType</code><br>
     *         Returns the value.<br>
     *         <p>
     */
    public static QueueCategoryType getKey(final String pValue) {
        QueueCategoryType aKey = null;
        for (final QueueCategoryType aQueueCategoryType : QueueCategoryType.values()) {
            if (pValue.equalsIgnoreCase(aQueueCategoryType.getValue())) {
                aKey = aQueueCategoryType;
            }
        }
        return aKey;
    }

    /**
     * Gets the <code>QueueCategoryType</code>.
     * <p>
     * 
     * @param pQueueCategoryType <code>String</code><br>
     *            Contains the enum type.<br>
     *            </p>
     * @return
     *         Returns the <code>QueueCategoryType</code>
     */
    public static String getQueueCategoryType(final QueueCategoryType pQueueCategoryType) {

        String avalue = null;

        for (final QueueCategoryType aType : QueueCategoryType.values()) {

            if (pQueueCategoryType.equals(aType)) {
                avalue = aType.getQueueCategoryType();
                break;
            }
        }

        return avalue;

    }

    /**
     * Gets the type of queue.
     * 
     * @return the queueCategoryType
     */
    public String getQueueCategoryType() {
        return queueCategoryType;
    }

    /**
     * Gives the string format of <code>queueCategoryType</code>.
     * <p>
     * 
     * @return the current value of <code>queueCategoryType</code>.
     */
    public String getValue() {
        return this.queueCategoryType;
    }

    /**
     * Sets the type of queue.
     * 
     * @param pQueueCategoryType the new value of the <code>QueueCategoryType</code> property.
     */
    public void setQueueCategoryType(final String pQueueCategoryType) {
        this.queueCategoryType = pQueueCategoryType;
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