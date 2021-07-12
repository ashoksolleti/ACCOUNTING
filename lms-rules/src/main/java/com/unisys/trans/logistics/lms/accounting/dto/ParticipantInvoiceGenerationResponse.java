/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.BillingSchedulesDto;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceDto;
import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author KV5
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ParticipantInvoiceGenerationResponse extends AbstractResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private ParticipantInvoiceDto billingSchedulesManualDto;
	private ParticipantInvoiceDto billingSchedulesOnDemandDto;
	
	private List<ParticipantInvoiceDto> billingSchedulesDtos = new ArrayList<ParticipantInvoiceDto>();
	/**
	 * @return the billingSchedulesDtos
	 */
	public List<ParticipantInvoiceDto> getBillingSchedulesDtos() {
		return billingSchedulesDtos;
	}
	/**
	 * @param billingSchedulesDtos the billingSchedulesDtos to set
	 */
	public void setBillingSchedulesDtos(
			List<ParticipantInvoiceDto> billingSchedulesDtos) {
		this.billingSchedulesDtos = billingSchedulesDtos;
	}
	/**
	 * @return the billingSchedulesManualDto
	 */
	public ParticipantInvoiceDto getBillingSchedulesManualDto() {
		return billingSchedulesManualDto;
	}
	/**
	 * @param billingSchedulesManualDto the billingSchedulesManualDto to set
	 */
	public void setBillingSchedulesManualDto(
			ParticipantInvoiceDto billingSchedulesManualDto) {
		this.billingSchedulesManualDto = billingSchedulesManualDto;
	}
	/**
	 * @return the billingSchedulesOnDemandDto
	 */
	public ParticipantInvoiceDto getBillingSchedulesOnDemandDto() {
		return billingSchedulesOnDemandDto;
	}
	/**
	 * @param billingSchedulesOnDemandDto the billingSchedulesOnDemandDto to set
	 */
	public void setBillingSchedulesOnDemandDto(
			ParticipantInvoiceDto billingSchedulesOnDemandDto) {
		this.billingSchedulesOnDemandDto = billingSchedulesOnDemandDto;
	}
	
	
	
	
	
}