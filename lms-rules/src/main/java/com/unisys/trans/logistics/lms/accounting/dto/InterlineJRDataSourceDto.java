 /**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

/**
 * @author SeramRaK
 *
 */
public class InterlineJRDataSourceDto {

	private List<InterlineParticipantInvoiceAWBDto> invoiceList;
	private List<InterlineReportDto> invoiceDetailsList;
	private List<InterlineRejectionMemoReportDto> rejectionMemoList;
	private List<InterlineReportDto> billingMemoAccountList;
	private List<InterlineParticipantInvoiceSummaryDto> invoiceSummaryList;
	
	public List<InterlineReportDto> getInvoiceDetailsList() {
		return invoiceDetailsList;
	}
	public void setInvoiceDetailsList(List<InterlineReportDto> invoiceDetailsList) {
		this.invoiceDetailsList = invoiceDetailsList;
	}
	public List<InterlineRejectionMemoReportDto> getRejectionMemoList() {
		return rejectionMemoList;
	}
	public void setRejectionMemoList(List<InterlineRejectionMemoReportDto> rejectionMemoList) {
		this.rejectionMemoList = rejectionMemoList;
	}
	public List<InterlineReportDto> getBillingMemoAccountList() {
		return billingMemoAccountList;
	}
	public void setBillingMemoAccountList(
			List<InterlineReportDto> billingMemoAccountList) {
		this.billingMemoAccountList = billingMemoAccountList;
	}
	public List<InterlineParticipantInvoiceAWBDto> getInvoiceList() {
		return invoiceList;
	}
	public void setInvoiceList(List<InterlineParticipantInvoiceAWBDto> invoiceList) {
		this.invoiceList = invoiceList;
	}
	public List<InterlineParticipantInvoiceSummaryDto> getInvoiceSummaryList() {
		return invoiceSummaryList;
	}
	public void setInvoiceSummaryList(
			List<InterlineParticipantInvoiceSummaryDto> invoiceSummaryList) {
		this.invoiceSummaryList = invoiceSummaryList;
	}
	
	
	
}
