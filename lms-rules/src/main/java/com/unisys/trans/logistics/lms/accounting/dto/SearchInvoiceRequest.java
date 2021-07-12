/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardInvoiceStatus;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PaymentStatusType;

 public class SearchInvoiceRequest extends ParticipantInvoiceRequest{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 
	  
	  
	 */
	private String participantType;
	
	private InvoiceStatusType statusType = InvoiceStatusType.FINAL;
	/** 
	  
	  
	 */
	private String invoiceNumber;
	/** 
	  
	  
	 */
	private String countryCode;
	/** 
	  
	  
	 */
	private String participantAccount;
	/** 
	  
	  
	 */
	private String participantName;
	/** 
	  
	  
	 */
	private String station;
	/** 
	  
	  
	 */
	private Date billingFromDate;
	/** 
	  
	  
	 */
	private Date billingToDate;
	/** 
	  
	  
	 */
   private Date invoiceDate;
   
   private Date lastModifiedDate;

	private PaymentStatusType paymentStatusType;

	private InwardInvoiceStatus inwardStatusType;
	
	private String billingGroup;
	
	private String carrierCode;
	
	private Date invoiceFromDate;
	
	private Date invoiceToDate;

	public Date getInvoiceFromDate() {
		return invoiceFromDate;
	}
	public void setInvoiceFromDate(Date invoiceFromDate) {
		this.invoiceFromDate = invoiceFromDate;
	}
	public Date getInvoiceToDate() {
		return invoiceToDate;
	}
	public void setInvoiceToDate(Date invoiceToDate) {
		this.invoiceToDate = invoiceToDate;
	}
	public String getCarrierCode() {
		return carrierCode;
	}
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}
	/**
	 * @return the statusType
	 */
	public InvoiceStatusType getStatusType() {
		return statusType;
	}
	/**
	 * @param statusType the statusType to set
	 */
	public void setStatusType(InvoiceStatusType statusType) {
		this.statusType = statusType;
	}
	public String getParticipantType() {
		return participantType;
	}
	public void setParticipantType(String participantType) {
		this.participantType = participantType;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getParticipantAccount() {
		return participantAccount;
	}
	public void setParticipantAccount(String participantAccount) {
		this.participantAccount = participantAccount;
	}
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public Date getBillingFromDate() {
		return billingFromDate;
	}
	public void setBillingFromDate(Date billingFromDate) {
		this.billingFromDate = billingFromDate;
	}
	public Date getBillingToDate() {
		return billingToDate;
	}
	public void setBillingToDate(Date billingToDate) {
		this.billingToDate = billingToDate;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @return the lastModifiedDate
	 */
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	/**
	 * @param lastModifiedDate the lastModifiedDate to set
	 */
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public PaymentStatusType getPaymentStatusType() {
		return paymentStatusType;
	}

	public void setPaymentStatusType(PaymentStatusType paymentStatusType) {
		this.paymentStatusType = paymentStatusType;
	}

	public InwardInvoiceStatus getInwardStatusType() {
		return inwardStatusType;
	}
	public void setInwardStatusType(InwardInvoiceStatus inwardStatusType) {
		this.inwardStatusType = inwardStatusType;
	}
	/**
	 * @return the billingGroup
	 */
	public String getBillingGroup() {
		return billingGroup;
	}
	/**
	 * @param billingGroup the billingGroup to set
	 */
	public void setBillingGroup(String billingGroup) {
		this.billingGroup = billingGroup;
	}
	
	

}