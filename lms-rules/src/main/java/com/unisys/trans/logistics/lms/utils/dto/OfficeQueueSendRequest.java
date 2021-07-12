/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.utils.dto.constants.QueueType;

/**
 * <code>OfficeQueueSendRequest</code> holds all the information to add Queue Items to Queue.
 * <p>
 * Queue Items are added to the appropriate queue based on the queueName, numberOfItems officeIdentifier and
 * officeQueueItem.<br>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>queueName
 * <li>officeQueueItemDto
 * <li>officeIdentifier
 * <li>queueType
 * <li>numberOfItems
 * </code>
 * </ul>
 */
public class OfficeQueueSendRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 510777537981985582L;

    /**
     * Attribute to hold <code>numberOfItems</code> property.
     * <p>
     * Specifies the number of items to be retrieved from the queue.
     */
    private Integer numberOfItems;

    /**
     * Attribute to hold the <code>officeIdentifier</code> property.
     * <p>
     * Name of the Office.
     * <p>
     */
    private String officeIdentifier;

    /**
     * Attribute to hold the <code>officeQueueItemDto</code> property.
     * <p>
     * Name of the OfficeQueueItemDto.
     * <p>
     */
    private OfficeQueueItemDto officeQueueItem;

    /**
     * Attribute to hold the <code>queueName</code> property.
     * <p>
     * Name of the Queue.
     * <p>
     */
    private String queueName;

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
    private QueueType queueType;
   
    /**
     * Attribute to hold <code>numberOfmessage</code> property.*/
    private Integer numberOfmessage;

    /**
     * <code>Default constructor.</code>
     */
    public OfficeQueueSendRequest() {
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
     * Gets the<code>officeIdentifier</code> property.
     * <p>
     * Name of the Office.
     * <p>
     * <b>Format : </b><br>
     * 1-20 AlphaNumeric
     * <p>
     * <b>Example : </b><br>
     * MSP.
     * <p>
     * 
     * @return the current value of the <code>officeIdentifier</code> property.<br>
     */

    public String getOfficeIdentifier() {
        return this.officeIdentifier;
    }

    /**
     * Gets the <code>officeQueueItemDto</code> property.
     * <p>
     * Name of the OfficeQueueItemDto.
     * 
     * @return the current value of the<code>officeQueueItem</code> property.
     */

    public OfficeQueueItemDto getOfficeQueueItem() {
        return this.officeQueueItem;
    }

    /**
     * Gets the <code>queueName</code> property.
     * <p>
     * Name of the Queue.
     * <p>
     * <b>Format: </b><br>
     * 1-50 Alphanumeric and Space
     * <p>
     * <b>Example:</b><br>
     * MSP 001
     * <p>
     * 
     * @return the current value of the<code>queueName</code> property.
     */

    public String getQueueName() {
        return this.queueName;
    }

    /**
     * Gets the <code>queueType</code> property.
     * <p>
     * States type of the queue.
     * <p>
     * <b>Possible Values:</b>
     * <ul>
     * <li>M - Message Queue
     * <li>N - Non-Message Queue
     * </ul>
     * 
     * @return the current value of the <code>queueType</code> property.<br>
     */
    public QueueType getQueueType() {
        return this.queueType;
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
     * @param pNumberOfItems the new value of the <code>numberOfItems</code> property.
     */
    public void setNumberOfItems(final Integer pNumberOfItems) {
        this.numberOfItems = pNumberOfItems;
    }

    /**
     * Sets the <code>officeIdentifier</code> property.
     * <p>
     * Name of the Office.
     * <p>
     * <b>Format : </b><br>
     * 1-20 AlphaNumeric
     * <p>
     * <b>Example : </b><br>
     * MSP.
     * <p>
     * 
     * @param pOfficeIdentifier the current value of the <code>officeIdentifier</code> property.<br>
     */

    public void setOfficeIdentifier(final String pOfficeIdentifier) {
        this.officeIdentifier = pOfficeIdentifier;
    }

    /**
     * Sets the <code>officeQueueItemDto</code> property.<br>
     * <p>
     * Name of the OfficeQueueItemDto.
     * 
     * @param pOfficeQueueItemDto the new value of the <code>officeQueueItem</code> property.<br>
     */

    public void setOfficeQueueItem(final OfficeQueueItemDto pOfficeQueueItemDto) {
        this.officeQueueItem = pOfficeQueueItemDto;
    }

    /**
     * Sets the <code>queueName</code> property.<br>
     * <p>
     * Name of the Queue.
     * <p>
     * <b>Format: </b><br>
     * 1-50 Alphanumeric and Space
     * <p>
     * <b>Example:</b><br>
     * MSP 001
     * <p>
     * 
     * @param pQueueName the new value of the <code>queueName</code> property.<br>
     */

    public void setQueueName(final String pQueueName) {
        this.queueName = pQueueName;
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
    public void setQueueType(final QueueType pQueueType) {
        this.queueType = pQueueType;
    }

	/**
	 * @return the numberOfmessage
	 */
	public Integer getNumberOfmessage() {
		return numberOfmessage;
	}

	/**
	 * @param numberOfmessage the numberOfmessage to set
	 */
	public void setNumberOfmessage(Integer numberOfmessage) {
		this.numberOfmessage = numberOfmessage;
	}
}
