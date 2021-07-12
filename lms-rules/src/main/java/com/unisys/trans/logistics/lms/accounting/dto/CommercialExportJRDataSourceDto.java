/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

/**
 * @author SeramRaK
 *
 */
public class CommercialExportJRDataSourceDto {

	private List<CommercialParticipantInvoiceSummaryDto> participantSummary;
	private List<CommercialParticipantInvoiceAWBDto> invoiceItemDetails;
	private List<CommercialExportReportDCMDto> shipperInvoiceItem;
	private List<GstrReturnInvoiceDto> bosTemplateDetails;
	private List<GstrReturnInvoiceDto> taxTemplateDetails;
	private List<GstrReturnInvoiceDto> creditTaxDetails;
	private List<GstrReturnInvoiceDto> debitTaxDetails;
	private List<GstrReturnInvoiceDto> creditBosDetails;     
	private List<GstrReturnInvoiceDto> debitBosDetails;
	private List<ParticipantInvoiceDetailDto> bosTemplateAwbDetails;
	private List<ParticipantInvoiceDetailDto> taxTemplateAwbDetails;
	private List<ParticipantInvoiceDetailDto> creditTaxAwbDetails;
	private List<ParticipantInvoiceDetailDto> debitTaxAwbDetails;
	private List<ParticipantInvoiceDetailDto> creditBosAwbDetails;
	private List<ParticipantInvoiceDetailDto> debitBosAwbDetails;
	private List<ParticipantInvoiceDetailDto> bosTemplateAwbDetails1;
	private List<ParticipantInvoiceDetailDto> taxTemplateAwbDetails1;
	private List<ParticipantInvoiceDetailDto> creditTaxAwbDetails1;
	private List<ParticipantInvoiceDetailDto> debitTaxAwbDetails1;
	private List<ParticipantInvoiceDetailDto> creditBosAwbDetails1;
	private List<ParticipantInvoiceDetailDto> debitBosAwbDetails1;
	
	
	public List<ParticipantInvoiceDetailDto> getBosTemplateAwbDetails() {
		return bosTemplateAwbDetails;
	}
	public void setBosTemplateAwbDetails(List<ParticipantInvoiceDetailDto> bosTemplateAwbDetails) {
		this.bosTemplateAwbDetails = bosTemplateAwbDetails;
	}
	public List<ParticipantInvoiceDetailDto> getTaxTemplateAwbDetails() {
		return taxTemplateAwbDetails;
	}
	public void setTaxTemplateAwbDetails(List<ParticipantInvoiceDetailDto> taxTemplateAwbDetails) {
		this.taxTemplateAwbDetails = taxTemplateAwbDetails;
	}
	public List<ParticipantInvoiceDetailDto> getCreditTaxAwbDetails() {
		return creditTaxAwbDetails;
	}
	public void setCreditTaxAwbDetails(List<ParticipantInvoiceDetailDto> creditTaxAwbDetails) {
		this.creditTaxAwbDetails = creditTaxAwbDetails;
	}
	public List<ParticipantInvoiceDetailDto> getDebitTaxAwbDetails() {
		return debitTaxAwbDetails;
	}
	public void setDebitTaxAwbDetails(List<ParticipantInvoiceDetailDto> debitTaxAwbDetails) {
		this.debitTaxAwbDetails = debitTaxAwbDetails;
	}
	public List<ParticipantInvoiceDetailDto> getCreditBosAwbDetails() {
		return creditBosAwbDetails;
	}
	public void setCreditBosAwbDetails(List<ParticipantInvoiceDetailDto> creditBosAwbDetails) {
		this.creditBosAwbDetails = creditBosAwbDetails;
	}
	public List<ParticipantInvoiceDetailDto> getDebitBosAwbDetails() {
		return debitBosAwbDetails;
	}
	public void setDebitBosAwbDetails(List<ParticipantInvoiceDetailDto> debitBosAwbDetails) {
		this.debitBosAwbDetails = debitBosAwbDetails;
	}
	public List<ParticipantInvoiceDetailDto> getBosTemplateAwbDetails1() {
		return bosTemplateAwbDetails1;
	}
	public void setBosTemplateAwbDetails1(List<ParticipantInvoiceDetailDto> bosTemplateAwbDetails1) {
		this.bosTemplateAwbDetails1 = bosTemplateAwbDetails1;
	}
	public List<ParticipantInvoiceDetailDto> getTaxTemplateAwbDetails1() {
		return taxTemplateAwbDetails1;
	}
	public void setTaxTemplateAwbDetails1(List<ParticipantInvoiceDetailDto> taxTemplateAwbDetails1) {
		this.taxTemplateAwbDetails1 = taxTemplateAwbDetails1;
	}
	public List<ParticipantInvoiceDetailDto> getCreditTaxAwbDetails1() {
		return creditTaxAwbDetails1;
	}
	public void setCreditTaxAwbDetails1(List<ParticipantInvoiceDetailDto> creditTaxAwbDetails1) {
		this.creditTaxAwbDetails1 = creditTaxAwbDetails1;
	}
	public List<ParticipantInvoiceDetailDto> getDebitTaxAwbDetails1() {
		return debitTaxAwbDetails1;
	}
	public void setDebitTaxAwbDetails1(List<ParticipantInvoiceDetailDto> debitTaxAwbDetails1) {
		this.debitTaxAwbDetails1 = debitTaxAwbDetails1;
	}
	public List<ParticipantInvoiceDetailDto> getCreditBosAwbDetails1() {
		return creditBosAwbDetails1;
	}
	public void setCreditBosAwbDetails1(List<ParticipantInvoiceDetailDto> creditBosAwbDetails1) {
		this.creditBosAwbDetails1 = creditBosAwbDetails1;
	}
	public List<ParticipantInvoiceDetailDto> getDebitBosAwbDetails1() {
		return debitBosAwbDetails1;
	}
	public void setDebitBosAwbDetails1(List<ParticipantInvoiceDetailDto> debitBosAwbDetails1) {
		this.debitBosAwbDetails1 = debitBosAwbDetails1;
	}
	public List<CommercialParticipantInvoiceSummaryDto> getParticipantSummary() {
		return participantSummary;
	}
	public void setParticipantSummary(
			List<CommercialParticipantInvoiceSummaryDto> participantSummary) {
		this.participantSummary = participantSummary;
	}
	public List<CommercialParticipantInvoiceAWBDto> getInvoiceItemDetails() {
		return invoiceItemDetails;
	}
	public void setInvoiceItemDetails(
			List<CommercialParticipantInvoiceAWBDto> invoiceItemDetails) {
		this.invoiceItemDetails = invoiceItemDetails;
	}
	public List<CommercialExportReportDCMDto> getShipperInvoiceItem() {
		return shipperInvoiceItem;
	}
	public void setShipperInvoiceItem(
			List<CommercialExportReportDCMDto> shipperInvoiceItem) {
		this.shipperInvoiceItem = shipperInvoiceItem;
	}
	public List<GstrReturnInvoiceDto> getCreditTaxDetails() {
		return creditTaxDetails;
	}
	public void setCreditTaxDetails(List<GstrReturnInvoiceDto> creditTaxDetails) {
		this.creditTaxDetails = creditTaxDetails;
	}
	public List<GstrReturnInvoiceDto> getBosTemplateDetails() {
		return bosTemplateDetails;
	}
	public void setBosTemplateDetails(List<GstrReturnInvoiceDto> bosTemplateDetails) {
		this.bosTemplateDetails = bosTemplateDetails;
	}
	public List<GstrReturnInvoiceDto> getTaxTemplateDetails() {
		return taxTemplateDetails;
	}
	public void setTaxTemplateDetails(List<GstrReturnInvoiceDto> taxTemplateDetails) {
		this.taxTemplateDetails = taxTemplateDetails;
	}
	public List<GstrReturnInvoiceDto> getDebitTaxDetails() {
		return debitTaxDetails;
	}
	public void setDebitTaxDetails(List<GstrReturnInvoiceDto> debitTaxDetails) {
		this.debitTaxDetails = debitTaxDetails;
	}
	public List<GstrReturnInvoiceDto> getCreditBosDetails() {
		return creditBosDetails;
	}
	public void setCreditBosDetails(List<GstrReturnInvoiceDto> creditBosDetails) {
		this.creditBosDetails = creditBosDetails;
	}
	public List<GstrReturnInvoiceDto> getDebitBosDetails() {
		return debitBosDetails;
	}
	public void setDebitBosDetails(List<GstrReturnInvoiceDto> debitBosDetails) {
		this.debitBosDetails = debitBosDetails;
	}
	
	
	
}
