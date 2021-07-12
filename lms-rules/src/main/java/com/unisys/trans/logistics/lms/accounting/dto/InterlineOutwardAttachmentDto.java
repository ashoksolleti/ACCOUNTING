package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class InterlineOutwardAttachmentDto extends PersistenceObjectDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String billingEntityCode;

	private String clearenceMonth;

	private String clearencePeriod;

	private String billedEntityCode;

	private String billingCategory;

	private String invoiceNumber;

	private String batchNumber;

	private String sequenceNumber;

	private String brkdownSerialNo;
	
	private String attachementInd;

	public String getBillingEntityCode() {
		return billingEntityCode;
	}

	public void setBillingEntityCode(String billingEntityCode) {
		this.billingEntityCode = billingEntityCode;
	}

	public String getClearenceMonth() {
		return clearenceMonth;
	}

	public void setClearenceMonth(String clearenceMonth) {
		this.clearenceMonth = clearenceMonth;
	}

	public String getClearencePeriod() {
		return clearencePeriod;
	}

	public void setClearencePeriod(String clearencePeriod) {
		this.clearencePeriod = clearencePeriod;
	}

	public String getBilledEntityCode() {
		return billedEntityCode;
	}

	public void setBilledEntityCode(String billedEntityCode) {
		this.billedEntityCode = billedEntityCode;
	}

	public String getBillingCategory() {
		return billingCategory;
	}

	public void setBillingCategory(String billingCategory) {
		this.billingCategory = billingCategory;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getBrkdownSerialNo() {
		return brkdownSerialNo;
	}

	public void setBrkdownSerialNo(String brkdownSerialNo) {
		this.brkdownSerialNo = brkdownSerialNo;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAttachementInd() {
		return attachementInd;
	}

	public void setAttachementInd(String attachementInd) {
		this.attachementInd = attachementInd;
	}
	
	

	/**
	 * 
	 */

}
