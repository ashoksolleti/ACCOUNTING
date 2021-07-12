package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class AccountingAWBChargesDto extends PersistenceObjectDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 
     private String indicator;
    
     private String method;
    
     private BigDecimal amt;
     
     private String currency;
     
     private String agent;
     
     private String drawer;
     
     private Date date;
     
     private Long oId;
     
     private Long partReceivable_Oid;
     
     // Added new column to store export and import reporting stations against each AWB Charge
     private String station;
     
	
	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public Long getPartReceivable_Oid() {
		return partReceivable_Oid;
	}

	public void setPartReceivable_Oid(Long partReceivable_Oid) {
		this.partReceivable_Oid = partReceivable_Oid;
	}

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public BigDecimal getAmt() {
		return amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public String getDrawer() {
		return drawer;
	}

	public void setDrawer(String drawer) {
		this.drawer = drawer;
	}

	public Long getOId() {
		return this.oId;
	}

	public void setOId(final Long pOId) {
        this.oId = pOId;
    }

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


}
