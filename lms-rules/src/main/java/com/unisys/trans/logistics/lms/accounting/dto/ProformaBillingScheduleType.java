package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class ProformaBillingScheduleType extends PersistenceObjectDto {

	
	
	
	
	public ProformaBillingScheduleType() {
		
	}
	public ProformaBillingScheduleType(String invoiceNumber,
			String participantType, String string, String string2,
			String string3, String status) {
		
		this.invoiceNumber = invoiceNumber;
		this.participantType = participantType;
		this.datePeriodStart = string;
		this.datePeriodEnd = string2;
		this.invoiceDate = string3;
		this.status = status;
	}
	
	private String CASSAreaCode;
	private String invoiceNumber;
	private String participantType;
	private String datePeriodStart;
	private String datePeriodEnd;
	private String invoiceDate;
	private String status;
	private String participantAccount;
	private String participantName;
	private String station;
	
	
	/**
	 * @return the cASSAreaCode
	 */
	public String getCASSAreaCode() {
		return CASSAreaCode;
	}
	/**
	 * @param cASSAreaCode the cASSAreaCode to set
	 */
	public void setCASSAreaCode(String cASSAreaCode) {
		CASSAreaCode = cASSAreaCode;
	}
	/**
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	/**
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	/**
	 * @return the participantType
	 */
	public String getParticipantType() {
		return participantType;
	}
	/**
	 * @param participantType the participantType to set
	 */
	public void setParticipantType(String participantType) {
		this.participantType = participantType;
	}
	/**
	 * @return the datePeriodStart
	 */
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @return the datePeriodStart
	 */
	public String getDatePeriodStart() {
		return datePeriodStart;
	}
	/**
	 * @param datePeriodStart the datePeriodStart to set
	 */
	public void setDatePeriodStart(String datePeriodStart) {
		this.datePeriodStart = datePeriodStart;
	}
	/**
	 * @return the datePeriodEnd
	 */
	public String getDatePeriodEnd() {
		return datePeriodEnd;
	}
	/**
	 * @param datePeriodEnd the datePeriodEnd to set
	 */
	public void setDatePeriodEnd(String datePeriodEnd) {
		this.datePeriodEnd = datePeriodEnd;
	}
	/**
	 * @return the invoiceDate
	 */
	public String getInvoiceDate() {
		return invoiceDate;
	}
	/**
	 * @param invoiceDate the invoiceDate to set
	 */
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

}
