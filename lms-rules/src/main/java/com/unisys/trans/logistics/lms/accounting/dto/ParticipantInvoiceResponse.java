/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.unisys.trans.logistics.lms.accounting.dto.constants.GenerateInvoiceType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceGenerationMode;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceStatusType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/** 
 
 * @author SeramRaK
 
 */
public class ParticipantInvoiceResponse extends AbstractResponse {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean isErrorQueuePresent;
	
	private InvoiceStatusType generateInvoice;

	private InvoiceGenerationMode invoiceGenerationMode;
	private GenerateInvoiceType generateInvoiceType;
	private boolean isScheduled;
	private boolean reversalIndicator;

	private Map<String,List<ParticipantInvoiceSummaryDto>> invoiceDetailsByCarrierCode;

	public Map<String, List<ParticipantInvoiceSummaryDto>> getInvoiceDetailsByCarrierCode() {
		return invoiceDetailsByCarrierCode;
	}

	public void setInvoiceDetailsByCarrierCode(Map<String, List<ParticipantInvoiceSummaryDto>> invoiceDetailsByCarrierCode) {
		this.invoiceDetailsByCarrierCode = invoiceDetailsByCarrierCode;
	}

	//nagaraj
    private List<ParticipantReceivableDto> participantReceivableDtoList  = new ArrayList();     
    private AccountingInvoiceDetailDto accountingInvoiceDetailDto;
	
	 public boolean isReversalIndicator() {
		return reversalIndicator;
	}

	public void setReversalIndicator(boolean reversalIndicator) {
		this.reversalIndicator = reversalIndicator;
	}

	private Set<AccountingInvoiceDetailDto> accountingInvoiceDetails;
	
	 private List<AccountingParticipantDto> accountingParticipantDtoList = new ArrayList();
	 private Set<CommercialParticipantInvoiceAWBDto> existingAWBDtos;
	 

	public Set<CommercialParticipantInvoiceAWBDto> getExistingAWBDtos() {
		return existingAWBDtos;
	}

	public void setExistingAWBDtos(Set<CommercialParticipantInvoiceAWBDto> existingAWBDtos) {
		this.existingAWBDtos = existingAWBDtos;
	}

	public InvoiceStatusType getGenerateInvoice() {
		return generateInvoice;
	}

	public void setGenerateInvoice(InvoiceStatusType generateInvoice) {
		this.generateInvoice = generateInvoice;
	}

	public InvoiceGenerationMode getInvoiceGenerationMode() {
		return invoiceGenerationMode;
	}

	public void setInvoiceGenerationMode(InvoiceGenerationMode invoiceGenerationMode) {
		this.invoiceGenerationMode = invoiceGenerationMode;
	}

	public GenerateInvoiceType getGenerateInvoiceType() {
		return generateInvoiceType;
	}

	public void setGenerateInvoiceType(GenerateInvoiceType generateInvoiceType) {
		this.generateInvoiceType = generateInvoiceType;
	}

	private List<ParticipantInvoiceSummaryDto> invoiceDetails;

	public boolean isErrorQueuePresent() {
		return isErrorQueuePresent;
	}

	public void setErrorQueuePresent(boolean isErrorQueuePresent) {
		this.isErrorQueuePresent = isErrorQueuePresent;
	}

	public List<ParticipantInvoiceSummaryDto> getInvoiceDetails() {
		return invoiceDetails;
	}

	public void setInvoiceDetails(List<ParticipantInvoiceSummaryDto> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

	/**
	 * @return the isScheduled
	 */
	public boolean getIsScheduled() {
		return isScheduled;
	}

	/**
	 * @param isScheduled the isScheduled to set
	 */
	public void setIsScheduled(boolean isScheduled) {
		this.isScheduled = isScheduled;
	}

	/**
	 * @return the accountingInvoiceDetails
	 */
	public Set<AccountingInvoiceDetailDto> getAccountingInvoiceDetails() {
		return accountingInvoiceDetails;
	}

	/**
	 * @param accountingInvoiceDetails the accountingInvoiceDetails to set
	 */
	public void setAccountingInvoiceDetails(
			Set<AccountingInvoiceDetailDto> accountingInvoiceDetails) {
		this.accountingInvoiceDetails = accountingInvoiceDetails;
	}

	public List<AccountingParticipantDto> getAccountingParticipantDtoList() {
		return accountingParticipantDtoList;
	}

	public void setAccountingParticipantDtoList(
			List<AccountingParticipantDto> accountingParticipantDtoList) {
		this.accountingParticipantDtoList = accountingParticipantDtoList;
	}
	
	public List<ParticipantReceivableDto> getParticipantReceivableDtoList() {
		return participantReceivableDtoList;
	}
	
	public void setParticipantReceivableDtoList(List<ParticipantReceivableDto> participantReceivableDtoList) {
		this.participantReceivableDtoList = participantReceivableDtoList;
	}
	
	public AccountingInvoiceDetailDto getAccountingInvoiceDetailDto() {
		return accountingInvoiceDetailDto;
	}

	public void setAccountingInvoiceDetailDto(AccountingInvoiceDetailDto accountingInvoiceDetailDto) {
		this.accountingInvoiceDetailDto = accountingInvoiceDetailDto;
	}

}