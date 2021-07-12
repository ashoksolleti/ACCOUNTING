package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;
import org.w3c.dom.Document;
public class MessageRequest implements Serializable{
	private static final long serialVersionUID = -3306860521161479411L;
	/**
	 * Attribute to hold the carrier.
	 */
	private String carrier;

	/**
	 * Attribute to hold the message retry count.
	 */
	private String count;
	
	/**
	 * Attribute to hold the message type.
	 */
	private String messageType;
	
	/**
	 * Attribute to hold the Recipient Id.
	 */
	private String recipientId;
	
	/**
	 * Attribute to hold the transformed XML.
	 */
	private Document transformedXML;
	
	/**
	 * Attribute to hold the tty address.
	 */
	private String TTYAddress;
	
	/**
	 * Attribute to hold the XML message.
	 */
	private String XMLMessage;
	private MessageDto pMessageDto;

	/**
	 * @return the carrier
	 */
	public String getCarrier() {
		return carrier;
	}

	/**
	 * @return the count
	 */
	public String getCount() {
		return this.count;
	}

	/**
	 * @return the messageType
	 */
	public String getMessageType() {
		return messageType;
	}

	/**
	 * @return the recipientId
	 */
	public String getRecipientId() {
		return recipientId;
	}

	/**
	 * @return the transformedXML
	 */
	public Document getTransformedXML() {
		return transformedXML;
	}


	/**
	 * @return the tTYAddress
	 */
	public String getTTYAddress() {
		return TTYAddress;
	}

	/**
	 * @return the xMLMessage
	 */
	public String getXMLMessage() {
		return this.XMLMessage;
	}

	/**
	 * @param carrier the carrier to set
	 */
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(String pCount) {
		this.count = pCount;
	}

	/**
	 * @param messageType the messageType to set
	 */
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	/**
	 * @param recipientId the recipientId to set
	 */
	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}


	/**
	 * @param transformedXML
	 *            the transformedXML to set
	 */
	public void setTransformedXML(Document transformedXML) {
		this.transformedXML = transformedXML;
	}

	/**
	 * @param tTYAddress the tTYAddress to set
	 */
	public void setTTYAddress(String tTYAddress) {
		TTYAddress = tTYAddress;
	}

	/**
	 * @param xMLMessage
	 *            the xMLMessage to set
	 */
	public void setXMLMessage(String pXMLMessage) {
		XMLMessage = pXMLMessage;
	}
	public MessageDto getpMessageDto() {
		return pMessageDto;
	}

	public void setpMessageDto(MessageDto pMessageDto) {
		this.pMessageDto = pMessageDto;
	}

	

}
