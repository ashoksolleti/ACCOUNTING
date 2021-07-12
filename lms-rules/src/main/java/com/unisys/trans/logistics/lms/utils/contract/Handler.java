package com.unisys.trans.logistics.lms.utils.contract;

import javax.xml.soap.SOAPPart;

import org.w3c.dom.Document;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface Handler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.unisys.trans.logistics.lms.webservice.message.SOAPMessageBuilderService
	 * #buildSOAPBody(org.w3c.dom.Document)
	 */
	public abstract Document buildSOAPBody(Document pDoc,
			String pMessageRecipient, String pCarrier, String pMessageType)
			throws LMSException;

	public abstract void buildSecurityHeader(SOAPPart pSoapPart,
			String pMessageType) throws LMSException;

}