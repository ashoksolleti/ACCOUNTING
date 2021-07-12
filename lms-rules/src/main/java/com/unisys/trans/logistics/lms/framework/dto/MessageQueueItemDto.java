/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * The <code>MessageQueueItemDto</code> contains message and type of message. This contains the following
 * attributes:<br>
 * <ul>
 * <code>
 * <li>message
 * <li>messageType
 * </code>
 * </ul>
 */

public class MessageQueueItemDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>correlationID</code> property.
     */
    private String correlationId;
    
    /**
     * Attribute to hold <code>jmsId</code> property.
     */
    private String jmsId;

    /**
     * Attribute to hold <code>message</code> property.
     */
    protected String message;
    
    private Serializable objectMessage;

    /**
     * Attribute to hold <code>messageType</code> property.
     */
    private String messageType;

    /**
     * Gets the value of <code>correlationId</code>
     * <p>
     * returns the value of <code>correlationId</code>.
     * <p>
     * 
     * @return correlationId the correlation ID s.
     */
    public String getCorrelationId() {
        return this.correlationId;
    }
    
    /**
     * Gets the value of <code>jmsId</code>
     * <p>
     * returns the value of <code>jmsId</code>.
     * <p>
     * 
     * @return jmsId the JMS ID s.
     */
    public String getJmsId() {
        return this.jmsId;
    }

    /**
     * Gets the value of <code>message</code>
     * <p>
     * returns the value of <code>message</code>.
     * <p>
     * 
     * @return message the message inside the queue item.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Gets the value of <code>messageType</code>
     * <p>
     * returns the value of <code>messageType</code>.
     * <p>
     * 
     * @return messageType The type of the message.
     */
    public String getMessageType() {
        return this.messageType;
    }

    /**
     * Sets the value to <code>correlationId</code>property.
     * <p>
     * 
     * @param pCorrelationID
     *            the new value of <code>correlationId</code> associated with a queue.<br>
     */
    public void setCorrelationId(final String pCorrelationID) {
        this.correlationId = pCorrelationID;
    }

    /**
     * Sets the value to <code>jmsId</code>property.
     * <p>
     * 
     * @param pJmsId
     *            the new value of <code>jmsId</code> associated with a queue.<br>
     */
    public void setJmsId(final String pJmsId) {
        this.jmsId = pJmsId;
    }

    /**
     * Sets the value to <code>message</code>property by converting to UPPERCASE.
     * <p>
     * 
     * @param pMessage the new value of <code>Message</code> associated with a queue.<br>
     */
    public void setMessage(final String pMessage) {
        this.message = ContractUtility.convertToUpperCase(pMessage);
    }
    
    /**
     * Sets the value to <code>message</code>property without changing case.
     * <p>
     * 
     * @param pMessage the new value of <code>Message</code> associated with a queue.<br>
     */
    public void setCaseSensitiveMessage(final String pMessage) {
        this.message = pMessage;
    }

    /**
     * Sets the value to <code>messagesType</code>.
     * <p>
     * 
     * @param pMessageType the new value of <code>MessageType</code> associated with a queue.<br>
     */
    public void setMessageType(final String pMessageType) {
        this.messageType = pMessageType;
    }

	public Serializable getObjectMessage() {
		return objectMessage;
	}

	public void setObjectMessage(Serializable objectMessage) {
		this.objectMessage = objectMessage;
	}
    
    
    
}
