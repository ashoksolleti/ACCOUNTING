/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.utils.dto.constants.QueueItemObjectType;

/**
 * <code>OfficeQueueItemsFindRequest</code> class represents the request to
 * retrieve office queue items.
 * <p>
 * The queue details are retrieved based on the name of the queue, number of
 * Items and the office identifier.
 * <p>
 * <code>OfficeQueueItemsFindRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>numberOfItems
 * <li>queueName
 * <li>queueItemOId
 * </code>
 * </ul>
 */
public class OfficeQueueItemsFindRequest extends OfficeQueueFindRequest {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = -7018887663131758098L;

	/**
	 * Attribute to hold <code>numberOfItems</code> property.
	 * <p>
	 * Specifies the number of items to be retrieved from the queue.
	 */
	private Integer numberOfItems;

	/**
	 * Attribute to hold <code>queueItemObjectType</code> property.
	 * <p>
	 * States item object type of the queue.
	 * <p>
	 * <b>Possible Values:</b>
	 * <ul>
	 * <li>SPOTRATE
	 * </ul>
	 */
	private QueueItemObjectType objectType;

	/**
	 * Attribute to hold <code>OId</code> property.
	 * <p>
	 * Specifies OId of the item to be retrieved.
	 */
	private Long oId;

	/**
	 * Attribute to hold <code>queueName</code> property.
	 * <p>
	 * Specifies Name of the queue from which the queue items are retrieved.
	 */
	private String queueName;
	/**
	 * Attribute to hold <code>messageText</code> property.
	 * 
	 */
	
    private String messageText;
    
	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	/**
	 * <code>Default constructor. </code>
	 */
	public OfficeQueueItemsFindRequest() {
	}

	/**
	 * Gets the <code>numberOfItems</code> attribute.
	 * <p>
	 * It specifies the number of items to be retrieved from the queue.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-5 Numeric
	 * <p>
	 * <b>Example: </b><br>
	 * 99
	 * <p>
	 * 
	 * @return the current value of the <code>numberOfItems</code> property.
	 */
	public Integer getNumberOfItems() {
		return this.numberOfItems;
	}

	/**
	 * Gets the <code>queueItemObjectType</code> property.
	 * <p>
	 * States item object type of the queue.
	 * <p>
	 * 
	 * @return the current value of the <code>queueItemObjectType</code>
	 *         property.<br>
	 */
	public QueueItemObjectType getObjectType() {
		return this.objectType;
	}

	/**
	 * Gets the <code>OId</code> attribute.
	 * <p>
	 * It specifies the OId of the item to be retrieved.
	 * <p>
	 * <b>Format: </b><br>
	 * Numeric
	 * <p>
	 * <b>Example: </b><br>
	 * 2003
	 * <p>
	 * 
	 * @return the current value of the <code>OId</code> property.
	 */
	public Long getOId() {
		return this.oId;

	}

	/**
	 * Gets the <code>queueName</code> attribute.
	 * <p>
	 * It specifies the name of the queue whose details are to be retrieved.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-50 AlphaNumeric and Space
	 * <p>
	 * <b>Example: </b><br>
	 * AR Actual Rate queue
	 * <p>
	 * 
	 * @return the current value of the <code>queueName</code> property.
	 */
	public String getQueueName() {
		return this.queueName;

	}

	/**
	 * Sets the <code>numberOfItems</code> property.
	 * <p>
	 * It specifies the number of items to be retrieved from the queue.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-5 Numeric
	 * <p>
	 * <b>Example: </b><br>
	 * 99
	 * <p>
	 * 
	 * @param pNumberOfItems
	 *            the new value of the <code>numberOfItems</code> property.
	 */
	public void setNumberOfItems(final Integer pNumberOfItems) {
		this.numberOfItems = pNumberOfItems;
	}

	/**
	 * Sets the <code>objectType</code> property.
	 * <p>
	 * States item object type of the queue.
	 * <p>
	 * 
	 * @param pObjectType
	 *            the new value of <code>objectType</code> property for an
	 *            office.<br>
	 */
	public void setObjectType(final QueueItemObjectType pObjectType) {
		this.objectType = pObjectType;
	}

	/**
	 * Sets the <code>OId</code> property.
	 * <p>
	 * It specifies the OId of the item to be retrieved.
	 * <p>
	 * <b>Format: </b><br>
	 * Numeric
	 * <p>
	 * <b>Example: </b><br>
	 * 2003
	 * <p>
	 * 
	 * @param pOId
	 *            the new value of the <code>OId</code> property.
	 */
	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

	/**
	 * Sets the <code>queueName</code> property.
	 * <p>
	 * It specifies the name of the queue whose details are to be retrieved.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-50 AlphaNumeric and Space
	 * <p>
	 * <b>Example: </b><br>
	 * AR Actual Rate queue
	 * <p>
	 * 
	 * @param pQueueName
	 *            the new value of the <code>queueName</code> property.
	 */
	public void setQueueName(final String pQueueName) {
		this.queueName = pQueueName;
	}
}