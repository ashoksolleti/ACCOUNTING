/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.constants.MessageConstants;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.MessageHistoryRequest;

public class TTYAddressIdentifier {
	
/*	private static String pOriginalMessage = '\1'+ "\r\n" + "  MX HISTSTA" + "\r\n" + ".ATLDDDL 172015 " + "\r\n"
			+ "MVT" + "\r\n" + "DL4022/21.XXXXX.MEM" + "\r\n" + "AD212330/212341 EA0032 TYS " + "\r\n"
			+ "FLD21" + "\r\n" + "SI LFO2" + "\r\n";*/

	/**
	 * This constant defines the start of the message.
	 */
	public static final char SOM = '\1';

	/**
	 * This constant defines the start of the text.
	 */
	public static final char STX = '\2';

	/**
	 * This constant defines the end of the text.
	 */
	public static final char ETX = '\3';
	
	/**
	 * This constant defines the carriage return.
	 */
	public static final char CR = '\15';

	
	public static void findTTYAddress(MessageHistoryRequest pRequest) throws LMSException {

		try {
			String aFromAddr = null;
			String aToAddr = null;
			String aMessage = pRequest.getOriginalMessage();
			StringBuffer buffer = new StringBuffer();
			aMessage = aMessage.replace(SOM, ' ');
			aMessage = aMessage.replace(STX, ' ');
			aMessage = aMessage.replace(CR, ' ');
			
			String[] theLines = aMessage.split("[\\n]+");
			for (String string : theLines) {
				buffer.append(string.trim());
				buffer.append("\n");
			}
			aMessage = buffer.toString();

			int anIndexOfAddr = 0;
			if (aMessage.charAt(2) == ' ') {
				anIndexOfAddr = 3;
			} else if (aMessage.charAt(3) == ' ') {
				anIndexOfAddr = 3;
			} else if (aMessage.charAt(0) == (char) 10 || aMessage.charAt(0) == (char) 13) {
				anIndexOfAddr = 1;
			}
			pRequest.setWrkMessage(aMessage);

			aFromAddr = aMessage.substring(anIndexOfAddr, anIndexOfAddr + 8);
			if (aFromAddr != null) {
				pRequest.setFromAddr(aFromAddr.trim());
			}
			anIndexOfAddr = aMessage.indexOf(".");
			aToAddr = aMessage.substring(anIndexOfAddr + 1, anIndexOfAddr + 9);
			if(aToAddr != null){
				pRequest.setToAddr(aToAddr.trim());
			}
		} catch (Throwable th) {
			throw (LMSException.createException(th, MessageConstants.EXCEPTION_IN_TTYADDRESS_IDENTIFIER));
		}
	}
	
/*	public static void main(String[] args) {
		String aFromAddr = null;
		List<String> allFromAddr = new ArrayList<String>();
		String aToAddr = null;
		String aMsgType = null;
		String aMsgVersion = null;
		String aMessage = pOriginalMessage;
		System.out.println("aMessage : "+ aMessage);
		
		aMessage = aMessage.replace(SOM, ' ');
		aMessage = aMessage.replace(STX, ' ');
		aMessage = aMessage.replace(CR, ' ');
		aMessage = aMessage.trim();
		
		int anIndexOfAddr = 0;
		if(aMessage.charAt(2) == ' '){
			anIndexOfAddr = 3;
		} else if (aMessage.charAt(3) == ' '){
			anIndexOfAddr = 3;
		}else if(aMessage.charAt(0) == (char) 10 || aMessage.charAt(0) == (char) 13){
			anIndexOfAddr = 1;
		}
		
		int line = aMessage.indexOf("\n");
		
		System.out.println("anIndexOfAddr : "+anIndexOfAddr);
		//aFromAddr = aMessage.substring(anIndexOfAddr, anIndexOfAddr + 8);
		aFromAddr = aMessage.substring(anIndexOfAddr, line);
		allFromAddr = Arrays.asList(aFromAddr.split(" "));
		
		anIndexOfAddr = aMessage.indexOf(".");
		aToAddr = aMessage.substring(anIndexOfAddr+1, anIndexOfAddr + 9);
		
		String[] msgArray = aMessage.split("\n");
		boolean match= false;
		for (String msgLine : msgArray) {
			if(match){
				String [] msgIdentifier = msgLine.split("/");
				if(msgIdentifier.length >= 2){
					aMsgType = msgIdentifier[0];
					aMsgVersion = msgIdentifier[1];
				}else if(msgIdentifier.length == 1){
					aMsgType = msgIdentifier[0];
				}
				break;
			}
			else if(msgLine.startsWith(".")){
				match = true;
			}
		}
		
		System.out.println("aMessage : "+ aMessage);
		System.out.println("aFromAddr : " + aFromAddr);
		System.out.println("allFromAddr : "+ allFromAddr.toString());
		System.out.println("aToAddr : " + aToAddr);
		System.out.println("aToAddr : " + aToAddr.trim());
		System.out.println("aMsgType : " + aMsgType.trim());
		System.out.println("aMsgVersion : " + aMsgVersion);
	}*/

}
