/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import com.unisys.trans.logistics.lms.framework.dto.constants.TargetsUploadStatusIndicator;


/**
 * RFC UIS157
 * <code>TargetsUploadCSVDto</code> holds the fixed space allocated for a
 * Targets csv file.<br>
 * 
 */

public class TargetsUploadCSVDto extends PersistenceObjectDto{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String flight;
	private String flightDate;
	private String targetRevenue;
	private String targetWeight;
	private String targetVolume;
	private String key;
	private TargetsUploadStatusIndicator uploadStatus;
	private String uploadMessage;
	


	/**
	 * @return the flightDate
	 */

	public String getFlightDate() {
		return flightDate;
	}

	/**
	 * @param flightDate the flightDate to set
	 */



	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}


	/**
	 * @return the targetRevenue
	 */

	public String getTargetRevenue() {
		return targetRevenue;
	}

	/**
	 * @param targetRevenue the targetRevenue to set
	 */



	public void setTargetRevenue(String targetRevenue) {
		this.targetRevenue = targetRevenue;
	}


	/**
	 * @return the targetWeight
	 */

	public String getTargetWeight() {
		return targetWeight;
	}


	/**
	 * @param targetWeight the targetWeight to set
	 */


	public void setTargetWeight(String targetWeight) {
		this.targetWeight = targetWeight;
	}

	/**
	 * @return the targetVolume
	 */


	public String getTargetVolume() {
		return targetVolume;
	}

	/**
	 * @param targetVolume the targetVolume to set
	 */



	public void setTargetVolume(String targetVolume) {
		this.targetVolume = targetVolume;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
		
		
	}
	
	/**
	 * @return the uploadStatus
	 */
	
	public TargetsUploadStatusIndicator getUploadStatus() {
		return uploadStatus;
	}

	/**
	 * @param uploadStatus the uploadStatus to set
	 */
	
	public void setUploadStatus(TargetsUploadStatusIndicator uploadStatus) {
		this.uploadStatus = uploadStatus;
	}
	
	/**
	 * @return the uploadMessage
	 */
	
	public String getUploadMessage() {
		return uploadMessage;
	}

	/**
	 * @param uploadMessage the uploadMessage to set
	 */
	
	public void setUploadMessage(String uploadMessage) {
		this.uploadMessage = uploadMessage;
	}


	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	@Override
	    public String toString() {
	        final StringBuffer commaSeperatedValue = new StringBuffer(300);
	        
	        commaSeperatedValue.append(this.getFlight() == null ? "" : this.getFlight()).append(",");
	        commaSeperatedValue.append(this.getFlightDate() == null ? "" : this.getFlightDate()).append(",");
	        commaSeperatedValue.append(this.getTargetRevenue() == null ? "" : this.getTargetRevenue()).append(",");
	        commaSeperatedValue.append(this.getTargetWeight() == null ? "" : this.getTargetWeight()).append(",");
	        commaSeperatedValue.append(this.getTargetVolume() == null ? "" : this.getTargetVolume()).append(",");
	        
	        if(this.getUploadStatus() != null){
	        	commaSeperatedValue.append(this.getUploadStatus()).append(" "+this.getUploadMessage()).append(",");
	        	commaSeperatedValue.append(",");
	        }
	        
	        
	        return commaSeperatedValue.toString();

}

	public String getFlight() {
		return flight;
	}

	public void setFlight(String flight) {
		this.flight = flight;
	}


	


	

}