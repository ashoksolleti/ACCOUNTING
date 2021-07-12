/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;



public class ParticipantCarrierReceivablesDto extends PersistenceObjectDto{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ParticipantReceivableDto participantReceivableDto;
	private CarrierReceivableDto pCarrierReceivableDto;
	private String awbNumber;
	private String remarks;
	private String invoiceNumber;
	private String memoNumber;

	
	public String getMemoNumber() {
		return memoNumber;
	}
	public void setMemoNumber(String memoNumber) {
		this.memoNumber = memoNumber;
	}
	public ParticipantReceivableDto getParticipantReceivableDto() {
		return participantReceivableDto;
	}
	public void setParticipantReceivableDto(ParticipantReceivableDto aParticipantReceivableDto) {
		this.participantReceivableDto = aParticipantReceivableDto;
	}
	public CarrierReceivableDto getCarrierReceivableDto() {
		return pCarrierReceivableDto;
	}
	public void setCarrierReceivableDto(CarrierReceivableDto pCarrierReceivableDto) {
		this.pCarrierReceivableDto = pCarrierReceivableDto;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
private Boolean onHold;
	

	public Boolean getOnHold() {
		return this.onHold;
	}

	public void setOnHold(Boolean onHold) {
		this.onHold = onHold;
	}

	public String getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}


}