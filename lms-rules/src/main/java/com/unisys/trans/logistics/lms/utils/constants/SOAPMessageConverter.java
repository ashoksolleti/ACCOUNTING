/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.constants;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.unisys.trans.logistics.lms.framework.constants.MessageConstants;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.RecipientDetail;


/**
 * Utility class for formating the SOAP Message.
 * 
 * @author Unisys
 * @version 1.0
 */
public class SOAPMessageConverter {
	
	/**
	 * This method converts the SOAPMessage to String format.
	 * 
	 * @param pSOAPMessage
	 * @return String 
	 * @throws LMSException
	 */
	public static String getString(SOAPMessage pSOAPMessage) throws LMSException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		String strMsg = null;
		try {
			pSOAPMessage.writeTo(out);
			strMsg = new String(out.toByteArray());
		} catch (SOAPException e) {
			throw (LMSException.createException(e,MessageConstants.SOAP_EXCEPTION));
		} catch (IOException e) {
			throw (LMSException.createException(e, MessageConstants.SOAP_IO_EXCEPTION));
		}
		System.out.println(strMsg);
		return strMsg;
	}
	
	/**
	 * This method converts the XML String to DOM Object.
	 * 
	 * @param xmlSource
	 * @return Document
	 * @throws LMSException
	 */
	public static Document stringToDom(String xmlSource) throws LMSException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder = null;
		Document xmlDoc = null;
		try {
			builder = factory.newDocumentBuilder();
			xmlDoc = builder.parse(new InputSource(new StringReader(xmlSource)));
		} catch (SAXException e) {
			throw (LMSException.createException(e,MessageConstants.SOAP_SAX_EXCEPTION));
		} catch (IOException e) {
			throw (LMSException.createException(e,MessageConstants.SOAP_IO_EXCEPTION));
		} catch (ParserConfigurationException e) {
			throw (LMSException.createException(e, MessageConstants.SOAP_PARSER_CONFIG_EXCEPTION));
		}
		return xmlDoc;
	}
	
	/**
	 * This method converts the DOM object to String format.
	 * 
	 * @param pDocument
	 * @return String
	 * @throws LMSException
	 */
	public static String domToString(Document pDocument) throws LMSException {
		DOMSource domSource = new DOMSource(pDocument);
		StringWriter writer = new StringWriter();
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer;
		try {
			transformer = tf.newTransformer();
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");			
			transformer.transform(domSource, new StreamResult(writer));
		} catch (TransformerConfigurationException e) {
			throw (LMSException.createException(e, MessageConstants.SOAP_TRANSFORMER_CONFIG_EXCEPTION));
		} catch (TransformerException e) {
			throw (LMSException.createException(e, MessageConstants.SOAP_TRANSFORMER_EXCEPTION));
		}
		return writer.toString();
	}
	
/*	*//**
	 * This method is used to transform the XML String to IATAECSAWSOUT using
	 * the IATAECSAWS_OUT.xsl
	 * 
	 * @param xmlString
	 * @return String
	 * @throws LMSException
	 *//*
	public static Document transformIATAECSAWSOUT(String xmlString) throws LMSException {
		Document formattedOutput = null;
		TransformerFactory tFactory = TransformerFactory.newInstance();
		Transformer transformer;
		try {
			transformer = tFactory
					.newTransformer(new StreamSource(
							new File("properties/IATAECSAWS_OUT.xsl")));
			StreamSource xmlSource = new StreamSource(new ByteArrayInputStream(
					xmlString.getBytes()));
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			transformer.transform(xmlSource, new StreamResult(baos));
			String XMLString = baos.toString();
			XMLString = XMLString.replace("&lt;", "<");
			XMLString = XMLString.replace("&gt;", ">");
			formattedOutput = stringToDom(XMLString);
		} catch (TransformerConfigurationException e) {
			throw (LMSException.createException(e, LMSErrorCodeConstants.SOAP_TRANSFORMER_CONFIG_EXCEPTION));
		} catch (TransformerException e) {
			throw (LMSException.createException(e, LMSErrorCodeConstants.SOAP_TRANSFORMER_EXCEPTION));
		} 
		return formattedOutput;
	}*/
	
	/**
	 * This Method is used to retrieve the received Client information from the
	 * DOM object.
	 * 
	 * @param xmlDoc
	 * @return String
	 * @throws LMSException
	 */
	public static String getClient(Document xmlDoc) throws LMSException {
		String aClient = null;
		if (xmlDoc != null) {
			NodeList aNodeList = xmlDoc.getElementsByTagName("CLIENT");
			if (aNodeList != null && aNodeList.getLength() > 0) {
				Element element = (Element) aNodeList.item(0);
				if (element != null) {
					aClient = element.getTextContent();				
				}
			}
		}
		return aClient;
	}
	
	/**
	 * This Method is used to retrieve the IATA Message Type information from
	 * the DOM object.
	 * 
	 * @param xmlDoc
	 * @return String
	 * @throws LMSException
	 */
	public static String getMessageType(Document xmlDoc) throws LMSException {
		String aMessageType = null;
		if (xmlDoc != null) {
			NodeList aNodeList = xmlDoc.getElementsByTagName("MSG-TYPE");
			if (aNodeList != null && aNodeList.getLength() > 0) {
				Element element = (Element) aNodeList.item(0);
				if (element != null) {
					aMessageType = element.getTextContent();
				}
			}
		}
		return aMessageType;
	}
	
	/**
	 * This Method is used to retrieve the IATA Message Type information from
	 * the DOM object.
	 * 
	 * @param xmlDoc
	 * @return String
	 * @throws LMSException
	 */
	public static List<RecipientDetail> getRecipientDetails(Document xmlDoc) throws LMSException {
		List<RecipientDetail> aRecipientDetails = new ArrayList<RecipientDetail>();
		NodeList aNodeList = xmlDoc.getElementsByTagName("ENTRY");
		for (int i = 0; i < aNodeList.getLength(); i++) {
			Element element = (Element) aNodeList.item(i);
			RecipientDetail aRecipientDetail = new RecipientDetail();
			 NodeList aTTY = element.getChildNodes();
			 if(aTTY.getLength() == 3){
			 Element aCarrierID = (Element)aTTY.item(0);
			 aRecipientDetail.setRecipientId(aCarrierID.getTextContent());
			 Element aKey = (Element)aTTY.item(1);
			 aRecipientDetail.setRecipientKey(aKey.getTextContent());
			 Element aTTYAddress = (Element)aTTY.item(2);
			 aRecipientDetail.setTTYAddress(aTTYAddress.getTextContent());
			 aRecipientDetails.add(aRecipientDetail);
			 }
		}
		return aRecipientDetails;
	}
	

	/**
	 * This method returns the list of carries present in the TTY of the DOM
	 * Object.
	 * 
	 * @param xmlDoc
	 * @return
	 * @throws LMSException
	 */
	public static List<String> getCarriers(Document xmlDoc) throws LMSException {
		List<String> aClient = new ArrayList<String>();
		NodeList aNodeList = xmlDoc.getElementsByTagName("TTY");
		for (int i = 0; i < aNodeList.getLength(); i++) {
			Element element = (Element) aNodeList.item(i);
			String aTTY = element.getTextContent();
			if (aTTY != null) {
				if (aTTY.length() == 7) {
					aClient.add(aTTY.substring(5, 7));
				} else if (aTTY.length() == 8) {
					aClient.add(aTTY.substring(5, 8));
				} else if (aTTY.length() == 2 || aTTY.length() == 3) {
					aClient.add(aTTY);
				}
			}
		}
		return aClient;
	}
	
	
	/**
	 * This method returns the list of TTY address present in the DOM
	 * Object.
	 * 
	 * @param xmlDoc
	 * @return
	 * @throws LMSException
	 */
	public static List<String> getTTY(Document xmlDoc) throws LMSException {
		List<String> aTTYList = new ArrayList<String>();
		NodeList aNodeList = xmlDoc.getElementsByTagName("TTY");
		for (int i = 0; i < aNodeList.getLength(); i++) {
			Element element = (Element) aNodeList.item(i);
			String aTTY = element.getTextContent();
			if (aTTY != null) {
				aTTYList.add(aTTY);
			}
		}
		return aTTYList;
	}
	
	/**
	 * This method returns the carries code present in the TTY Address.
	 * 
	 * @param pTTY
	 * @return String
	 * @throws LMSException
	 */
	public static String getCarrier(String pTTY) throws LMSException {
		String aClient = null;
		if (pTTY != null) {
			if (pTTY.length() == 7) {
				aClient = pTTY.substring(5, 7);
			} else if (pTTY.length() == 8) {
				aClient = pTTY.substring(5, 8);
			} else if (pTTY.length() == 2 || pTTY.length() == 3) {
				aClient = pTTY;
			}
		}
		return aClient;
	}
/*	*//**
	 * This method is used to transform the DOM Object to IATAECSAWSOUT DOM Object using
	 * the IATAECSAWS_OUT.xsl
	 * 
	 * @param xmlDoc
	 * @return
	 * @throws LMSException
	 *//*
	public static Document transformIATAECSAWSOUT(Document xmlDoc, String pMessageSender, String pMessageRecipient) throws LMSException {
		Document formattedOutput = null;
		TransformerFactory tFactory = TransformerFactory.newInstance();
		Transformer transformer;
		Source xmlSource = null;
		try {
			transformer = tFactory
					.newTransformer(new StreamSource(
							new File("properties/IATAECSAWS_OUT.xsl")));
			NodeList aNodeList = xmlDoc.getElementsByTagName("ECSAWS-OUT");
			if (aNodeList != null && aNodeList.getLength() > 0) {
				Element element = (Element) aNodeList.item(0);
			xmlSource = new javax.xml.transform.dom.DOMSource(element);
			}
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			transformer.transform(xmlSource, new StreamResult(baos));
			String XMLString = baos.toString();
			XMLString = XMLString.replace("&lt;", "<");
			XMLString = XMLString.replace("&gt;", ">");
			if(pMessageSender!= null && !"".equals(pMessageSender)){
				StringBuilder aOrgTTY = new StringBuilder();
				aOrgTTY.append("schemeID=\"P\">");
				aOrgTTY.append(pMessageSender);
				XMLString = XMLString.replaceAll("(?i)schemeID=\"P\">Unisys", aOrgTTY.toString());
			}
			if(pMessageRecipient != null && !"".equals(pMessageRecipient)){
				StringBuilder aRecTTY = new StringBuilder();
				aRecTTY.append("RecipientParty><ram:PrimaryID  schemeID=\"P\">");
				aRecTTY.append(pMessageRecipient);
				XMLString = XMLString.replace("RecipientParty><ram:PrimaryID  schemeID=\"P\">", aRecTTY.toString());
			}
			formattedOutput = stringToDom(XMLString);
		} catch (TransformerConfigurationException e) {
			throw (LMSException.createException(e,LMSErrorCodeConstants.SOAP_TRANSFORMER_CONFIG_EXCEPTION));
		} catch (TransformerException e) {
			throw (LMSException.createException(e,LMSErrorCodeConstants.SOAP_TRANSFORMER_EXCEPTION));
		} 
		return formattedOutput;
	}*/
	
/*	public static Document transformIATAECSEHIOUT(Document xmlDoc, String pMessageSender, String pMessageRecipient) throws LMSException {
		Document formattedOutput = null;
		TransformerFactory tFactory = TransformerFactory.newInstance();
		Transformer transformer;
		Source xmlSource = null;
		try {
			transformer = tFactory
					.newTransformer(new StreamSource(
							new File("properties/IATAECSEHI_OUT.xsl")));
			NodeList aNodeList = xmlDoc.getElementsByTagName("ECSEHI-OUT");
			if (aNodeList != null && aNodeList.getLength() > 0) {
				Element element = (Element) aNodeList.item(0);
			xmlSource = new javax.xml.transform.dom.DOMSource(element);
			}
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			transformer.transform(xmlSource, new StreamResult(baos));
			String XMLString = baos.toString();
			XMLString = XMLString.replace("&lt;", "<");
			XMLString = XMLString.replace("&gt;", ">");
			if(pMessageSender!= null && !"".equals(pMessageSender)){
				StringBuilder aOrgTTY = new StringBuilder();
				aOrgTTY.append("schemeID=\"P\">");
				aOrgTTY.append(pMessageSender);
				XMLString = XMLString.replaceAll("(?i)schemeID=\"P\">Unisys", aOrgTTY.toString());
			}
			if(pMessageRecipient != null && !"".equals(pMessageRecipient)){
				StringBuilder aRecTTY = new StringBuilder();
				aRecTTY.append("RecipientParty><ram:PrimaryID  schemeID=\"P\">");
				aRecTTY.append(pMessageRecipient);
				XMLString = XMLString.replace("RecipientParty><ram:PrimaryID  schemeID=\"P\">", aRecTTY.toString());
			}
			formattedOutput = stringToDom(XMLString);
		} catch (TransformerConfigurationException e) {
			throw (LMSException.createException(e,LMSErrorCodeConstants.SOAP_TRANSFORMER_CONFIG_EXCEPTION));
		} catch (TransformerException e) {
			throw (LMSException.createException(e,LMSErrorCodeConstants.SOAP_TRANSFORMER_EXCEPTION));
		} 
		return formattedOutput;
	}*/
	
/*	*//**
	 * This method is used to transform the DOM Object to IATAECSAWSOUT format using
	 * the IATAECSAWS_OUT.xsl
	 * 
	 * @param xmlDoc
	 * @return
	 * @throws LMSException
	 *//*
	public static String transformIATAXML(Document xmlDoc, String pXSLType, String pRecTTY)
			throws LMSException {
		TransformerFactory tFactory = TransformerFactory.newInstance();
		Transformer transformer = null;
		NodeList aNodeList = null;
		Source xmlSource = null;
		String XMLString = null;
		try {
			if (pXSLType.equals("ECSAWS")) {
				transformer = tFactory.newTransformer(new StreamSource(
						new File("properties/IATAECSAWS_OUT.xsl")));
				aNodeList = xmlDoc.getElementsByTagName("ECSAWS-OUT");
			} else if (pXSLType.equals("FSU")) {
				transformer = tFactory.newTransformer(new StreamSource(
						new File("properties/IATAFSU_OUT.xsl")));
				aNodeList = xmlDoc.getElementsByTagName("FSU-OUT");
			} else if (pXSLType.equals("ECSEHI")) {
				transformer = tFactory.newTransformer(new StreamSource(
						new File("properties/IATAECSEHI_OUT.xsl")));
				aNodeList = xmlDoc.getElementsByTagName("ECSEHI-OUT");
			}
			if (aNodeList != null && aNodeList.getLength() > 0) {
				Element element = (Element) aNodeList.item(0);
				xmlSource = new javax.xml.transform.dom.DOMSource(element);
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				transformer.transform(xmlSource, new StreamResult(baos));
				XMLString = baos.toString();
				XMLString = XMLString.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "");
				XMLString = XMLString.replace("&lt;", "<");
				XMLString = XMLString.replace("&gt;", ">");

				if (pRecTTY != null && !"".equals(pRecTTY)) {
					StringBuilder aRecTTY = new StringBuilder();
					aRecTTY.append("RecipientParty><ram:PrimaryID  schemeID=\"P\">");
					aRecTTY.append(pRecTTY);
					XMLString = XMLString.replace("RecipientParty><ram:PrimaryID  schemeID=\"P\">", aRecTTY.toString());
				}
			}
		} catch (TransformerConfigurationException e) {
			throw (LMSException.createException(e, LMSErrorCodeConstants.SOAP_TRANSFORMER_CONFIG_EXCEPTION));
		} catch (TransformerException e) {
			throw (LMSException.createException(e,LMSErrorCodeConstants.SOAP_TRANSFORMER_EXCEPTION));
		}
		return XMLString;
	}*/
	
	/**
	 * Builds an error string from a SOAP fault. The structure of the 
	 * error string is as follows:
	 * <SVCERROR>
	 * 	<ENTRY>
	 * 		<ERRCD>SOAPFault.getFaultCode()</ERRCD>
	 * 		<ERRTX>SOAPFault.getFaultString()</ERRTX>
	 * 	</ENTRY>
	 * </SVCERROR>
	 * @param pSOAPFault the SOAP fault to be processed.
	 * @return the error string.
	 * @throws SOAPException 
	 * @throws SOAPCommunicationException
	 */
	public static String processSOAPFault(final SOAPFault pSOAPFault) 
			throws LMSException, SOAPException {

		String error = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		Document document;
		try {
			document = factory.newDocumentBuilder().newDocument();
			Element svcerror = document.createElement("SVCERROR");
			document.appendChild(svcerror);
			Element entry = document.createElement("ENTRY");
			svcerror.appendChild(entry);
			Element errorCode = document.createElement("ERRCD");
			entry.appendChild(errorCode);
			if(pSOAPFault.getFaultCode() != null){
				Text faultCode = document.createTextNode(pSOAPFault.getFaultCode());
				errorCode.appendChild(faultCode);
			}
			Element errorText = document.createElement("ERRTX");
			entry.appendChild(errorText);
			if(pSOAPFault.getFaultString() != null){
				Text faultText = document.createTextNode(pSOAPFault.getFaultString());
				errorText.appendChild(faultText);
			}
			error = domToString(document);
		} catch (ParserConfigurationException e) {
			throw (LMSException.createException(e,MessageConstants.SOAP_PARSER_CONFIG_EXCEPTION));
		}
		return error;
	}
	
	public static String replaceTTYNode(Document pDOM, String pCarrier) throws LMSException {
		String XMLString = null;
		Element aroot = pDOM.getDocumentElement();
		Element ttys = pDOM.createElement("TTYS");
		Element tty = pDOM.createElement("TTY");
		ttys.appendChild(tty);
		Text Carrier = pDOM.createTextNode(pCarrier);
		tty.appendChild(Carrier);
		NodeList aNodeList = aroot.getElementsByTagName("TTYS");
		if (aNodeList != null && aNodeList.getLength() > 0) {
			Element element = (Element) aNodeList.item(0);
			aroot.replaceChild(ttys, element);			
			XMLString = domToString(pDOM);
		}
		return XMLString;

	}

	public static Node replaceRecipient(Document pDoc, String pMessageRecipient) throws LMSException {
		Node payload = null;
		NodeList aNodeList = pDoc.getElementsByTagNameNS("iata:datamodel:3", "RecipientParty");
		if (aNodeList != null ) {
			Element element = (Element) aNodeList.item(0);
			NodeList aPrimaryIdNodeList = element.getElementsByTagNameNS("iata:datamodel:3", "PrimaryID");
			if (aPrimaryIdNodeList != null && aPrimaryIdNodeList.getLength() > 0) {
				Element primaryIdElement = (Element) aPrimaryIdNodeList.item(0);
				primaryIdElement.setTextContent(pMessageRecipient);
			}
		}
		NodeList aIATANodeList = pDoc.getElementsByTagName("IATA-MESSAGE");
		if (aIATANodeList != null) {
			Element element = (Element) aIATANodeList.item(0);
			payload = element.getFirstChild();
		}
		return payload;
	}

	public static Document getPayload(Document pDoc) throws LMSException {
		Document aDocument = null;
		NodeList aNodeList = pDoc.getElementsByTagName("IATA-MESSAGE");
		if (aNodeList != null && aNodeList.getLength() > 0) {
			Element element = (Element) aNodeList.item(0);			
			StringWriter sw = new StringWriter();
			try {
				Transformer t = TransformerFactory.newInstance().newTransformer();
				t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
				t.transform(new DOMSource(element.getFirstChild()), new StreamResult(sw));
			} catch (TransformerException te) {
				throw (LMSException.createException(te,MessageConstants.SOAP_TRANSFORMER_EXCEPTION));
			}
			aDocument = stringToDom(sw.toString());
		}
		return aDocument;
	}
	
	/**
	 * This method converts the Node to String.
	 * 
	 * @param aNode
	 * @return String
	 * @throws LMSException
	 */
	public static String nodeToString(Node aNode) throws LMSException {
		StringWriter sw = new StringWriter();
		try {
			Transformer t = TransformerFactory.newInstance().newTransformer();
			t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			t.transform(new DOMSource(aNode), new StreamResult(sw));
		} catch (TransformerException te) {
			throw (LMSException.createException(te,MessageConstants.SOAP_TRANSFORMER_EXCEPTION));
		}
		return sw.toString();
	}
	
	/**
	 * This Method is used to retrieve the IATA Message Type information from
	 * the DOM object.
	 * 
	 * @param xmlDoc
	 * @return String
	 * @throws LMSException
	 */
	public static String getMessage(Document xmlDoc) throws LMSException {
		String aMessageType = null;
		if (xmlDoc != null) {
			NodeList aNodeList = xmlDoc.getElementsByTagName("MSG");
			if (aNodeList != null && aNodeList.getLength() > 0) {
				Element element = (Element) aNodeList.item(0);
				if (element != null) {
					aMessageType = element.getTextContent();
				}
			}
		}
		return aMessageType;
	}
	
	
	/**
	 * This Method is used to retrieve the IATA Message Type information from
	 * the DOM object.
	 * 
	 * @param xmlDoc
	 * @return String
	 * @throws LMSException
	 */
	public static String getTTYAddress(Document xmlDoc) throws LMSException {
		String aMessageType = null;
		if (xmlDoc != null) {
			NodeList aNodeList = xmlDoc.getElementsByTagName("TTY");
			if (aNodeList != null && aNodeList.getLength() > 0) {
				Element element = (Element) aNodeList.item(0);
				if (element != null) {
					aMessageType = element.getTextContent();
				}
			}
		}
		return aMessageType;
	}
	
	public static List<String> getReceiptParty(Document pDoc) throws LMSException {
		List<String> recipientPartyIDs = new ArrayList<String>();
		NodeList aNodeList = pDoc.getElementsByTagNameNS("iata:datamodel:3","RecipientParty");
		if (aNodeList != null && aNodeList.getLength() > 0) {
			Element element = (Element) aNodeList.item(0);
			NodeList aPrimaryIdNodeList = element.getElementsByTagNameNS("iata:datamodel:3", "PrimaryID");
			if (aPrimaryIdNodeList != null && aPrimaryIdNodeList.getLength() > 0) {
				Element primaryIdElement = (Element) aPrimaryIdNodeList.item(0);
				recipientPartyIDs.add(primaryIdElement.getTextContent());
			}
		}
		return recipientPartyIDs;
	}
	

	/**
	 * This Method is used to retrieve the IATA Message Type information from
	 * the DOM object.
	 * 
	 * @param xmlDoc
	 * @return String
	 * @throws LMSException
	 */
	public static String getPayLoad(Document xmlDoc, String pTag) throws LMSException {
		String aMessageType = null;
		if (xmlDoc != null) {
			NodeList aNodeList = xmlDoc.getElementsByTagName(pTag);
			if (aNodeList != null && aNodeList.getLength() > 0) {
				Element element = (Element) aNodeList.item(0);			
				StringWriter sw = new StringWriter();
				try {
					Transformer t = TransformerFactory.newInstance().newTransformer();
					t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
					t.transform(new DOMSource(element.getFirstChild()), new StreamResult(sw));
				} catch (TransformerException te) {
					throw (LMSException.createException(te,MessageConstants.SOAP_TRANSFORMER_EXCEPTION));
				}
				aMessageType = sw.toString();
			}
		}
		return aMessageType;
	}
	
	/**
	 * This Method is used to retrieve the IATA Message Type information from
	 * the DOM object.
	 * 
	 * @param pXmlDoc
	 * @param pTagName
	 * @return String
	 * @throws LMSException
	 */
	public static String getTagValue(Document pXmlDoc, String pTagName) throws LMSException {
		String aMessageType = null;
		if (pXmlDoc != null) {
			NodeList aNodeList = pXmlDoc.getElementsByTagName(pTagName);
			if (aNodeList != null && aNodeList.getLength() > 0) {
				Element element = (Element) aNodeList.item(0);
				if (element != null) {
					aMessageType = element.getTextContent();
				}
			}
		}
		return aMessageType;
	}
}
