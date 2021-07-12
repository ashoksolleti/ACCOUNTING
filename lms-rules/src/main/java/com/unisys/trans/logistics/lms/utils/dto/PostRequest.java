/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.utils.constants.ServiceType;


/**
 * <code>PostRequest</code> is used for for generating an EU Custom XML.
 * 
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>OId
 *<li>customXML
 *<li>endPointUrl
 *<li>fileName
 *<li>carrierCode
</code>
 * </ul>
 */
public class PostRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1283744401384095316L;
	    
	/**
	 * Attribute to hold the <code>customXML</code> property.
     */
	private  String customXML; 
	    
	/**
	 * Attribute to hold the <code>endPointUrl</code> property.
     */
	private  String endPointUrl; 
	    
	/**
	 * Attribute to hold the <code>fileName</code> property.
     */
	private  String fileName; 
	    
	/**
	 * Attribute to hold the <code>carrierCode</code> property.
     */
	private  String carrierCode; 
	
	/**
	 * Attribute to hold the <code>originalMessage</code> property.
     */
	private  String originalMessage; 
	
	/**
	 * Attribute to hold the <code>serviceType</code> property.
     */
	private  ServiceType serviceType; 
	
	/**
	 * Attribute to hold the <code>userId</code> property.
     */
	private String userId;
	
	/**
	 * Attribute to hold the <code>pwd</code> property.
     */
	private String pwd;
	
	/**
	 * Attribute to hold the <code>station</code> property.
     */
	private String station;
	
	/**
	 * Attribute to hold the <code>office</code> property.
     */
	private String office;
	
	/**
	 * Attribute to hold the <code>parameterName</code> property.
     */
	private String parameterName;
		
	/**
     * <code>Default constructor.</code>
     */
    public PostRequest() {

    }
	
	
	
	public String getParameterName() {
		return parameterName;
	}



	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}



	/**
	 * @param customXML
	 *        the customXML to set
    */
	public String getCustomXML() {
		return this.customXML;
	}
	
	/**
	 * @return the customXML
	*/
	public void setCustomXML(String customXML) {
		this.customXML = customXML;
	}
	
	/**
	 * @param carrierCode
	 *        the carrierCode to set
    */
	public String getCarrierCode() {
		return this.carrierCode;
	}
	
	/**
	 * @return the carrierCode
	*/
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}
	
	/**
	 * @param endPointUrl
	 *        the endPointUrl to set
    */
	public String getEndPointUrl() {
		return this.endPointUrl;
	}
	
	/**
	 * @return the endPointUrl
	*/
	public void setEndPointUrl(String endPointUrl) {
		this.endPointUrl = endPointUrl;
	}
	
	/**
	 * @param fileName
	 *        the fileName to set
    */
	public String getFileName() {
		return this.fileName;
	}
	
	/**
	 * @return the fileName
	*/
	public void setFileName(String fileName) {
		this.fileName = fileName;
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
	 * @return the serviceType
	 */
	public ServiceType getServiceType() {
		return serviceType;
	}



	/**
	 * @param serviceType the serviceType to set
	 */
	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}



	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}



	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}



	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}



	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	/**
	 * @return the station
	 */
	public String getStation() {
		return station;
	}



	/**
	 * @param station the station to set
	 */
	public void setStation(String station) {
		this.station = station;
	}



	/**
	 * @return the office
	 */
	public String getOffice() {
		return office;
	}



	/**
	 * @param office the office to set
	 */
	public void setOffice(String office) {
		this.office = office;
	}
		
}
