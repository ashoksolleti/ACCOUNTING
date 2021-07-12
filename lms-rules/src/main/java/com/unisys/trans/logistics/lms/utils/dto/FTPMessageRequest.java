/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;


/**
 * <code>FTPMessageRequest</code> contains information about the FTP Service request attributes.
 * 
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>OId
 *<li>orignalMessage
 *<li>blnKSDACFile
 *<li>clientStation
 *<li>blnKSDFile
 *<li>customMessage
</code>
 * </ul>
 */
public class FTPMessageRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1283744401384095316L;
	    
	/**
	 * Attribute to hold the <code>originalMessage</code> property.
     */
	private  String originalMessage; 
	    
	/**
	 * Attribute to hold the <code>blnKSDACFile</code> property.
     */
	private  boolean blnKSDACFile; 
	    
	/**
	 * Attribute to hold the <code>clientStation</code> property.
     */
	private  String clientStation; 
	    
	/**
	 * Attribute to hold the <code>blnKSDFile</code> property.
     */
	private  boolean blnKSDFile; 
	    
	/**
	 * Attribute to hold the <code>customMessage</code> property.
     */
	private  String customMessage; 
	
	/**
	 * Attribute to hold the <code>fromAddress</code> property.
     */
	private  String fromAddress; 
	
	/**
	 * Attribute to hold the <code>toAddress</code> property.
     */
	private  String toAddress; 
	
	/**
	 * Attribute to hold the <code>carrierCode</code> property.
     */
	private  String carrierCode; 
	
	/**
	 * Attribute to hold the <code>szToAddr</code> property.
     */
	private  String szToAddr; 
		
		
	/**
     * <code>Default constructor.</code>
     */
    public FTPMessageRequest() {

    }
	
	
	
	/**
	 * @param customMessage
	 *        the customMessage to set
    */
	public String getCustomMessage() {
		return this.customMessage;
	}
	
	/**
	 * @return the customMessage
	*/
	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
	}
	
	/**
	 * @param clientStation
	 *        the clientStation to set
    */
	public String getClientStation() {
		return this.clientStation;
	}
	
	/**
	 * @return the clientStation
	*/
	public void setClientStation(String clientStation) {
		this.clientStation = clientStation;
	}
	
	/**
	 * @param blnKSDACFile
	 *        the blnKSDACFile to set
    */
	public boolean getBlnKSDACFile() {
		return this.blnKSDACFile;
	}
	
	/**
	 * @return the blnKSDACFile
	*/
	public void setBlnKSDACFile(boolean blnKSDACFile) {
		this.blnKSDACFile = blnKSDACFile;
	}
	
	/**
	 * @param blnKSDFile
	 *        the blnKSDFile to set
    */
	public boolean getBlnKSDFile() {
		return this.blnKSDFile;
	}
	
	/**
	 * @return the blnKSDFile
	*/
	public void setBlnKSDFile(boolean blnKSDFile) {
		this.blnKSDFile = blnKSDFile;
	}



	/**
	 * @return the originalMessage
	 */
	public String getOriginalMessage() {
		return originalMessage;
	}



	/**
	 * @param originalMessage the originalMessage to set
	 */
	public void setOriginalMessage(String originalMessage) {
		this.originalMessage = originalMessage;
	}



	/**
	 * @return the toAddress
	 */
	public String getToAddress() {
		return toAddress;
	}



	/**
	 * @param toAddress the toAddress to set
	 */
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}



	/**
	 * @return the fromAddress
	 */
	public String getFromAddress() {
		return fromAddress;
	}



	/**
	 * @param fromAddress the fromAddress to set
	 */
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}



	/**
	 * @return the carrierCode
	 */
	public String getCarrierCode() {
		return carrierCode;
	}



	/**
	 * @param carrierCode the carrierCode to set
	 */
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}



	/**
	 * @return the szToAddr
	 */
	public String getSzToAddr() {
		return szToAddr;
	}



	/**
	 * @param szToAddr the szToAddr to set
	 */
	public void setSzToAddr(String szToAddr) {
		this.szToAddr = szToAddr;
	}
		
}
