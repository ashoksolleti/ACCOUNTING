/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceGenerationMode;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**

 * 
 * @author SeramRaK

 */
public class ParticipantInvoiceErrorDto extends PersistenceObjectDto{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5749980810549094132L;

	private String errorDescription;
	
	private String billingScheduleIdentifier;
	
	private Date billingPeriodFromDate;
	
	private Date billingPeriodToDate;
	
	private InvoiceGenerationMode participantInvoiceType;
	
	private Long oId;

	@Override
	public Long getOId() {
		
		return oId;
	}

	
	public void setoId(Long oId) {
		this.oId = oId;
	}


	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public String getBillingScheduleIdentifier() {
		return billingScheduleIdentifier;
	}

	public void setBillingScheduleIdentifier(String billingScheduleIdentifier) {
		this.billingScheduleIdentifier = billingScheduleIdentifier;
	}

	public Date getBillingPeriodFromDate() {
		return billingPeriodFromDate;
	}

	public void setBillingPeriodFromDate(Date billingPeriodFromDate) {
		this.billingPeriodFromDate = billingPeriodFromDate;
	}

	public Date getBillingPeriodToDate() {
		return billingPeriodToDate;
	}

	public void setBillingPeriodToDate(Date billingPeriodToDate) {
		this.billingPeriodToDate = billingPeriodToDate;
	}

	public InvoiceGenerationMode getParticipantInvoiceType() {
		return participantInvoiceType;
	}

	public void setParticipantInvoiceType(InvoiceGenerationMode participantInvoiceType) {
		this.participantInvoiceType = participantInvoiceType;
	}

	

}