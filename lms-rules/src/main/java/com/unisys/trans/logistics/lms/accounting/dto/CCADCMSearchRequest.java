package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

public class CCADCMSearchRequest extends
AbstractParticipantInvoiceRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String statusType;
	
	 
	private Date fromDate;


	private Date toDate;  
	
	private String origin;
	
	private String version_No;
	
	//getters
	public String getStatusType() {
		return statusType;
	}
	
	public Date getFromDate() {
		return fromDate;
	}

	public Date getToDate() {
		return toDate;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	
	public String getDestination() {
		return destination;
	}
	
	public String getVersion_No() {
		return version_No;
	}
	
	//setters
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	private String destination;
	

	public void setDestination(String destination) {
		this.destination = destination;
	}



	public void setVersion_No(String version_No) {
		this.version_No = version_No;
	}
	
	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}

	public void setFromDate(Date fromDate) {
		fromDate = fromDate;
	}
	

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
}
