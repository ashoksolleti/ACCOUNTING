package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.DateTypes;

public class AwbFindRequest {

	Date startDate;
	Date endDate;
	boolean firstRequestIndicator;
	int chunkSize;
	DateTypes dateType;
	List<Long> airWaybillIds;
	List<String> awbStatusList;
	String goodsAcceptedStatus;
	
	
	/**
	 * @return the goodsAcceptedStatus
	 */
	public String getGoodsAcceptedStatus() {
		return goodsAcceptedStatus;
	}
	/**
	 * @param goodsAcceptedStatus the goodsAcceptedStatus to set
	 */
	public void setGoodsAcceptedStatus(String goodsAcceptedStatus) {
		this.goodsAcceptedStatus = goodsAcceptedStatus;
	}
	public List<String> getAwbStatusList() {
		return awbStatusList;
	}
	public void setAwbStatusList(List<String> awbStatusList) {
		this.awbStatusList = awbStatusList;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public boolean isFirstRequestIndicator() {
		return firstRequestIndicator;
	}
	public void setFirstRequestIndicator(boolean firstRequestIndicator) {
		this.firstRequestIndicator = firstRequestIndicator;
	}
	public int getChunkSize() {
		return chunkSize;
	}
	public void setChunkSize(int chunkSize) {
		this.chunkSize = chunkSize;
	}
	public DateTypes getDateType() {
		return dateType;
	}
	public void setDateType(DateTypes dateType) {
		this.dateType = dateType;
	}
	public List<Long> getAirWaybillIds() {
		return airWaybillIds;
	}
	public void setAirWaybillIds(List<Long> airWaybillId) {
		this.airWaybillIds = airWaybillId;
	}
}
