/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.utils.dto.constants.QueueBaseType;
/**
 * <code>QueueDto</code> holds all the attributes that are associated to a Queue.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>oId
 * <li>limit
 * <li>name
 * <li>queueRestrictionType
 * <li>queueType
 * <li>resubmitQueueName
 * </code>
 * </ul>
 */

public class QueueDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>limit</code> property.
     */

    private Long limit;

    /**
     * Attribute to hold <code>name</code> property.
     * <p>
     * This is name of the queue.
     */

    private String name;

    /**
     * Attribute to hold <code>queueIndicator</code> property.
     */

    private boolean queueSelect;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Attribute to hold <code>queueRestrictionType</code> property.
     * <p>
     * States restriction type of the queue.
     * <p>
     * <b>Possible Values:</b>
     * <ul>
     * <li>R - Restricted Queue
     * <li>N - Non-Restricted Queue
     * </ul>
     */

    private String queueRestrictionType;

    /**
     * Attribute to hold <code>queueType</code> property.
     * <p>
     * States type of the queue.
     * <p>
     * <b>Possible Values:</b>
     * <ul>
     * <li>M - Message Queue
     * <li>N - Non-Message Queue
     * </ul>
     */

    private String queueType;
    private QueueBaseType queueBaseType;

    /**
     * @return the queueBaseType
     */
    public QueueBaseType getQueueBaseType() {
        return this.queueBaseType;
    }

    /**
     * @param pQueueBaseType the queueBaseType to set
     */
    public void setQueueBaseType(final QueueBaseType pQueueBaseType) {
        this.queueBaseType = pQueueBaseType;
    }

    /**
     * Attribute to hold <code>resubmitQueueName</code> property.
     * <p>
     * This is resubmit name of the queue.
     */

    private String resubmitQueueName;

    /**
     * Gets the <code>limit</code> property. <b>Format : </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example : </b><br>
     * 11
     * <p>
     * 
     * @return the current value of the <code>limit</code> property.
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * Gets the <code>name</code> property.
     * <p>
     * Name of the queue.
     * <p>
     * <b>Format : </b><br>
     * 1-50 Alphanumeric space
     * <p>
     * <b>Example : </b><br>
     * Actual Rate Queue
     * <p>
     * 
     * @return the current value of the <code>name</code> property.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the value of <code>OID</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */

    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>queueRestrictionType</code> property.
     * <p>
     * States restriction type of the queue.
     * <p>
     * 
     * @return the current value of the <code>queueRestrictionType</code> property.<br>
     */
    public String getQueueRestrictionType() {
        return this.queueRestrictionType;
    }

    /**
     * Gets the <code>queueType</code> property.
     * <p>
     * States type of the queue.
     * <p>
     * 
     * @return the current value of the <code>queueType</code> property.<br>
     */
    public String getQueueType() {
        return this.queueType;
    }

    /**
     * Gets the <code>resubmitQueueName</code> property.
     * <p>
     * Resubmit name of the queue.
     * <p>
     * <b>Format : </b><br>
     * 1-50 Alphanumeric space
     * <p>
     * <b>Example : </b><br>
     * Actual Rate Queue
     * <p>
     * 
     * @return the current value of the <code>resubmitQueueName</code> property.
     */
    public String getResubmitQueueName() {
        return this.resubmitQueueName;
    }

    /**
     * Sets the <code>limit</code> property. <b>Format : </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example : </b><br>
     * 11
     * <p>
     * 
     * @param pLimit the new value of <code>limit</code> property.<br>
     */
    public void setLimit(final Long pLimit) {
        this.limit = pLimit;
    }

    /**
     * Sets the <code>name</code> property.
     * <p>
     * Name of the queue.
     * <p>
     * <b>Format : </b><br>
     * 1-50 Alphanumeric space
     * <p>
     * <b>Example : </b><br>
     * Actual Rate Queue
     * <p>
     * 
     * @param pName the new value of <code>name</code> property.<br>
     */
    public void setName(final String pName) {
        this.name = pName;
    }

    /**
     * Sets the value of the <code>OID</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>OID</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>queueRestrictionType</code> property.
     * <p>
     * States restriction type of the queue.
     * <p>
     * <b>Possible Values:</b>
     * <ul>
     * <li>R - Restricted Queue
     * <li>N - Non-Restricted Queue
     * </ul>
     * 
     * @param pQueueRestrictionType the new value of <code>queueRestrictionType</code> property for an office.<br>
     */
    public void setQueueRestrictionType(final String pQueueRestrictionType) {
        this.queueRestrictionType = pQueueRestrictionType;
    }

    /**
     * Sets the <code>queueType</code> property.
     * <p>
     * States type of the queue.
     * <p>
     * <b>Possible Values:</b>
     * <ul>
     * <li>M - Message Queue
     * <li>N - Non-Message Queue
     * </ul>
     * 
     * @param pQueueType the new value of <code>queueType</code> property for an office.<br>
     */
    public void setQueueType(final String pQueueType) {
        this.queueType = pQueueType;
    }

    /**
     * Sets the <code>resubmitQueueName</code> property.
     * <p>
     * Resubmit name of the queue.
     * <p>
     * <b>Format : </b><br>
     * 1-50 Alphanumeric space
     * <p>
     * <b>Example : </b><br>
     * Actual Rate Queue
     * <p>
     * 
     * @param pResubmitQueueName the new value of <code>resubmitQueueName</code> property.<br>
     */
    public void setResubmitQueueName(final String pResubmitQueueName) {
        this.resubmitQueueName = pResubmitQueueName;
    }

    /**
     * @return the queueSelect
     */
    public boolean isQueueSelect() {
        return queueSelect;
    }

    /**
     * @param queueSelect the queueSelect to set
     */
    public void setQueueSelect(boolean queueSelect) {
        this.queueSelect = queueSelect;
    }

}