/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.DeletionType;
import com.unisys.trans.logistics.lms.utils.dto.constants.QueueItemObjectType;

/**
 * <code>OfficeQueueItemsDeleteRequest</code> holds all the information need to delete one or more queue
 * item(s) and all queue items.
 * <p>
 * The queue items are deleted based on the office identifier, queue name, deletion type and
 * OfficeQueueItemDto.<br>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>officeQueueItems
 * <li>officeQueueItem
 * <li>officeIdentifier
 * <li>deletionType
 * <li>queueName
 * </code>
 * </ul>
 */
public class OfficeQueueItemsDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 510777537981985582L;

    /**
     * Attribute to hold the <code>deletionType</code> property.
     * <p>
     * Defines the type of deletion.
     * <p>
     * <b>Possible Values:</b>
     * <ul>
     * <li>A - All
     * <li>S - Selected
     * </ul>
     */
    private DeletionType deletionType;

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
     * Attribute to hold the <code>officeIdentifier</code> property.
     * <p>
     * Name of the Office.
     * <p>
     */
    private String officeIdentifier;

    /**
     * Attribute to hold the <code>officeQueueItem</code> property.
     * <p>
     * Name of the officeQueueItem.
     * <p>
     */
    private OfficeQueueItemDto officeQueueItem;

    /**
     * Attribute to hold the <code>officeQueueItems</code> property.
     * <p>
     * Name of the officeQueueItems.
     * <p>
     */
    private List<OfficeQueueItemDto> officeQueueItems;

    /**
     * Attribute to hold the <code>queueName</code> property.
     * <p>
     * Name of the Queue.
     * <p>
     */
    private String queueName;

    /**
     * <code>Default constructor.</code>
     */
    public OfficeQueueItemsDeleteRequest() {

    }

    /**
     * Returns the value of <code>deletionType</code> property.
     * <p>
     * Defines the type of deletion.
     * <p>
     * <b>Possible Values:</b>
     * <ul>
     * <li>A - All
     * <li>S - Selected
     * </ul>
     * 
     * @return the current value of the<code>deletionType</code> property.
     */
    public DeletionType getDeletionType() {
        return this.deletionType;
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
     * @return the current value of the <code>queueItemObjectType</code> property.<br>
     */
    public QueueItemObjectType getObjectType() {
        return this.objectType;
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
     * Gets the <code>officeQueueItem</code> property.
     * <p>
     * Name of the officeQueueItem.
     * 
     * @return the current value of the<code>officeQueueItem</code> property.
     */

    public OfficeQueueItemDto getOfficeQueueItem() {
        return this.officeQueueItem;
    }

    /**
     * Gets the <code>officeQueueItems</code> property.
     * <p>
     * Name of the officeQueueItems.
     * 
     * @return the current value of the<code>officeQueueItems</code> property.
     */

    public List<OfficeQueueItemDto> getOfficeQueueItems() {
        if (this.officeQueueItems == null) {
            this.officeQueueItems = new ArrayList<OfficeQueueItemDto>();
        }
        return this.officeQueueItems;
    }

    /**
     * Gets the <code>queueName</code> property.
     * <p>
     * Name of the Queue.
     * <p>
     * <b>Format: </b><br>
     * 1-50 Alphanumeric adn Space
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
     * Sets the <code>deletionType</code> property.<br>
     * <p>
     * Defines the type of deletion.
     * <p>
     * <b>Possible Values:</b>
     * <ul>
     * <li>A - All
     * <li>S - Selected
     * </ul>
     * 
     * @param pDeletionType the new value of the <code>deletionType</code> property.<br>
     */
    public void setDeletionType(final DeletionType pDeletionType) {
        this.deletionType = pDeletionType;
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
     * Sets the <code>objectType</code> property.
     * <p>
     * States item object type of the queue.
     * <p>
     * 
     * @param pObjectType the new value of <code>objectType</code> property for an office.<br>
     */
    public void setObjectType(final QueueItemObjectType pObjectType) {
        this.objectType = pObjectType;
    }

    /**
     * Sets the <code>officeIdentifier</code> property.
     * <p>
     * Name of the Office.
     * <p>
     * <b>Format : </b><br>
     * 1-20 Alphanumeric.
     * <p>
     * <b>Example : </b><br>
     * MSP.
     * <p>
     * 
     * @param pOfficeIdentifier the current value of the <code>officeIdentifier</code> property.<br>
     */

    public void setOfficeIdentifier(final String pOfficeIdentifier) {
        this.officeIdentifier = ContractUtility.convertToUpperCase(pOfficeIdentifier);
    }

    /**
     * Sets the <code>officeQueueItem</code> property.<br>
     * <p>
     * Name of the officeQueueItem.
     * 
     * @param pOfficeQueueItem the new value of the <code>officeQueueItem</code> property.<br>
     */

    public void setOfficeQueueItem(final OfficeQueueItemDto pOfficeQueueItem) {
        this.officeQueueItem = pOfficeQueueItem;
    }

    /**
     * Sets the <code>officeQueueItems</code> property.<br>
     * <p>
     * Name of the officeQueueItems.
     * 
     * @param pOfficeQueueItems the new value of the <code>officeQueueItems</code> property.<br>
     */

    public void setOfficeQueueItems(final List<OfficeQueueItemDto> pOfficeQueueItems) {
        this.officeQueueItems = pOfficeQueueItems;
    }

    /**
     * Sets the <code>queueName</code> property.<br>
     * <p>
     * Name of the Queue.
     * <p>
     * <b>Format: </b><br>
     * 1-50 Alphanumeric and Space.
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
}
