/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;
import java.util.Properties;

/**
 * LMSMessageRequest holds the information related to Queue request.
 * 
 * @author Unisys
 * @version 1.0
 */
public class LMSMessageRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4586788530191318323L;

	private String correlationID;

	private String errorQueueName;

	/**
	 * Holds the jmsProperties values.
	 */
	private Properties jmsProperties = null;

	private boolean outgoingMsgIndicator;

	private String queueConnectionFactory;

	private String queueName;

	private String retryQueueName;

	private String textMessage;

	/**
	 * @return the correlationID
	 */
	public String getCorrelationID() {
		return correlationID;
	}

	public String getErrorQueueName() {
		return errorQueueName;
	}
	/**
	 * @return the jmsProperties
	 */
	public Properties getJmsProperties() {
		return jmsProperties;
	}

	/**
	 * @return the queueConnectionFactory
	 */
	public String getQueueConnectionFactory() {
		return queueConnectionFactory;
	}

	/**
	 * @return the queueName
	 */
	public String getQueueName() {
		return queueName;
	}

	public String getRetryQueueName() {
		return retryQueueName;
	}

	/**
	 * @return the textMessage
	 */
	public String getTextMessage() {
		return textMessage;
	}

	/**
	 * @return the outgoingMsgIndicator
	 */
	public boolean isOutgoingMsgIndicator() {
		return this.outgoingMsgIndicator;
	}

	/**
	 * @param correlationID
	 *            the correlationID to set
	 */
	public void setCorrelationID(String correlationID) {
		this.correlationID = correlationID;
	}

	public void setErrorQueueName(String errorQueueName) {
		this.errorQueueName = errorQueueName;
	}

	/**
	 * @param jmsProperties
	 *            the jmsProperties to set
	 */
	public void setJmsProperties(Properties pJmsProperties) {
		this.jmsProperties = pJmsProperties;
	}

	/**
	 * @param outgoingMsgIndicator the outgoingMsgIndicator to set
	 */
	public void setOutgoingMsgIndicator(boolean pOutgoingMsgIndicator) {
		this.outgoingMsgIndicator = pOutgoingMsgIndicator;
	}

	/**
	 * @param queueConnectionFactory
	 *            the queueConnectionFactory to set
	 */
	public void setQueueConnectionFactory(String pQueueConnectionFactory) {
		this.queueConnectionFactory = pQueueConnectionFactory;
	}

	/**
	 * @param queueName
	 *            the queueName to set
	 */
	public void setQueueName(String pQueueName) {
		this.queueName = pQueueName;
	}

	public void setRetryQueueName(String retryQueueName) {
		this.retryQueueName = retryQueueName;
	}

	/**
	 * @param textMessage
	 *            the textMessage to set
	 */
	public void setTextMessage(String pTextMessage) {
		this.textMessage = pTextMessage;
	}

}
