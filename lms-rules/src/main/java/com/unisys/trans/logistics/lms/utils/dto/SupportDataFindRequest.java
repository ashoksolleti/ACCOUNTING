package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.constants.SupportDataType;

public class SupportDataFindRequest extends AbstractRequest {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SupportDataType supportDataType;
	
	private String userId;
	
	private String station;
	
	private Date fromDate;
	
	private Date toDate;
	
	private boolean download;
	
	private boolean viewAllIndicator;

	/**
	 * @return the supportDataType
	 */
	public SupportDataType getSupportDataType() {
		return supportDataType;
	}

	/**
	 * @param supportDataType the supportDataType to set
	 */
	public void setSupportDataType(SupportDataType supportDataType) {
		this.supportDataType = supportDataType;
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
		this.userId = ContractUtility.convertToUpperCase(userId);
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
		this.station = ContractUtility.convertToUpperCase(station);
	}

	/**
	 * @return the fromDate
	 */
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public Date getToDate() {
		return toDate;
	}

	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	/**
	 * @return the download
	 */
	public boolean isDownload() {
		return download;
	}

	/**
	 * @param download the download to set
	 */
	public void setDownload(boolean download) {
		this.download = download;
	}

	public boolean isViewAllIndicator() {
		return viewAllIndicator;
	}

	public void setViewAllIndicator(boolean viewAllIndicator) {
		this.viewAllIndicator = viewAllIndicator;
	}

}
