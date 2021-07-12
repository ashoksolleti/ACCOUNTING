/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import javax.xml.soap.SOAPPart;

import org.w3c.dom.Document;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * SOAPMessageBuilderService is used to construct the SOAP Message.
 * 
 * @author Unisys
 * @version 1.0
 */
public interface SOAPMessageBuilderService {

	public abstract Document buildSOAPBody(Document pDoc, String pMessageSender, String pMessageRecipient, String pMessageType) throws LMSException;
	


	void buildSecurityHeader(SOAPPart pSoapPart, String pMessageType,
			String pCarrier) throws LMSException;
}
