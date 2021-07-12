/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto;

/**
 * The <code>MessageQueueSendRequest</code> contains Queue name and message. This contains the following
 * attributes:<br>
 * <ul>
 * <code>
 * <li>queueName
 * <li>message
 * </code>
 * </ul>
 */

public class MessageQueueSendRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>message</code> property.
     * <p>
     * The value of <code>message</code> associated with a queue.
     * <p>
     */
    private MessageQueueItemDto messageQueueItem;

    /**
     * Attribute to hold <code>QueueName</code> property.
     */
    private String queueName;

    /**
     * Gets the value of <code>messageQueueItem</code>.
     * <p>
     * 
     * @return the value of <code>messageQueueItem</code> associated with queue.
     *         <p>
     */
    public MessageQueueItemDto getMessageQueueItem() {
        if (this.messageQueueItem == null) {
            this.messageQueueItem = new MessageQueueItemDto();
        }
        return this.messageQueueItem;
    }

    /**
     * Gets the value of <code>queueName</code>.
     * <p>
     * 
     * @return the name of <code>queueName</code>
     *         <p>
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * Sets the value of <code>messageQueueItem</code> associated with a queue.
     * <p>
     * 
     * @param pMessageQueueItem the new value of <code>messageQueueItem</code> associated with a queue.<br>
     */
    public void setMessageQueueItem(final MessageQueueItemDto pMessageQueueItem) {
        this.messageQueueItem = pMessageQueueItem;
    }

    /**
     * Sets the value of <code>queueName</code>.
     * <p>
     * 
     * @param pQueueName the name of <code>queueName</code>
     */
    public void setQueueName(final String pQueueName) {
        this.queueName = pQueueName;
    }


    /**
     * Attribute to hold <code>replyTo</code> property.
     */
    private String replyTo;
    
    /**
     * Gets the value of <code>replyTo</code>
     * <p>
     * returns the value of <code>replyTo</code>.
     * <p>
     * 
     * @return replyTo the reply to queue name.
     */
    public String getReplyTo() {
        return this.replyTo;
    }

    /**
     * Sets the value to <code>replyTo</code>property.
     * <p>
     * 
     * @param pReplyTo
     *            the new value of <code>replyTo</code> associated with a queue.<br>
     */
    public void setReplyTo(final String pReplyTo) {
        this.replyTo = pReplyTo;
    }
}