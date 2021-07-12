package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class AccountingSisFileGenerationDto extends PersistenceObjectDto{

private static final long serialVersionUID = -5898418926001069065L;

	

	private Long oId=0l;

	private String sisStartDate;

	private String sisEndDate;

	private String sisRunDate;
	
	private String status;
	
	private String currentdate;
	

	public String getSisStartDate() {
		return sisStartDate;
	}

	public void setSisStartDate(String sisStartDate) {
		this.sisStartDate = sisStartDate;
	}

	public String getSisEndDate() {
		return sisEndDate;
	}

	public void setSisEndDate(String sisEndDate) {
		this.sisEndDate = sisEndDate;
	}

	public String getSisRunDate() {
		return sisRunDate;
	}

	public void setSisRunDate(String sisRunDate) {
		this.sisRunDate = sisRunDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

	
	public String getCurrentdate() {
		return currentdate;
	}

	public void setCurrentdate(String currentdate) {
		this.currentdate = currentdate;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

	
}
