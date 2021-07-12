/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

/**
 * @author SeramRaK
 *
 */
public class CommercialImportJRDataSourceDto {

	private List<CommercialParticipantInvoiceAWBDto> awbInformationList;
	private List<CommercialImportRepotDTO> summaryList;
	private List<CommercialImportRepotDTO> debitSummary;
	private List<CommercialParticipantInvoiceDCMDto> debitCreditMemoList;
	private List<CommercialParticipantInvoiceSummaryDto> grandTotalList;
	/**
	 * @return the awbInformationList
	 */
	public List<CommercialParticipantInvoiceAWBDto> getAwbInformationList() {
		return awbInformationList;
	}
	/**
	 * @param awbInformationList the awbInformationList to set
	 */
	public void setAwbInformationList(
			List<CommercialParticipantInvoiceAWBDto> awbInformationList) {
		this.awbInformationList = awbInformationList;
	}
	/**
	 * @return the summaryList
	 */
	public List<CommercialImportRepotDTO> getSummaryList() {
		return summaryList;
	}
	/**
	 * @param summaryList the summaryList to set
	 */
	public void setSummaryList(List<CommercialImportRepotDTO> summaryList) {
		this.summaryList = summaryList;
	}
	
	/**
	 * @return the debitCreditMemoList
	 */
	public List<CommercialParticipantInvoiceDCMDto> getDebitCreditMemoList() {
		return debitCreditMemoList;
	}
	/**
	 * @param debitCreditMemoList the debitCreditMemoList to set
	 */
	public void setDebitCreditMemoList(
			List<CommercialParticipantInvoiceDCMDto> debitCreditMemoList) {
		this.debitCreditMemoList = debitCreditMemoList;
	}
	/**
	 * @return the grandTotalList
	 */
	public List<CommercialParticipantInvoiceSummaryDto> getGrandTotalList() {
		return grandTotalList;
	}
	/**
	 * @param grandTotalList the grandTotalList to set
	 */
	public void setGrandTotalList(List<CommercialParticipantInvoiceSummaryDto> grandTotalList) {
		this.grandTotalList = grandTotalList;
	}
	/**
	 * @return the debitSummary
	 */
	public List<CommercialImportRepotDTO> getDebitSummary() {
		return debitSummary;
	}
	/**
	 * @param debitSummary the debitSummary to set
	 */
	public void setDebitSummary(List<CommercialImportRepotDTO> debitSummary) {
		this.debitSummary = debitSummary;
	}
	
	
	
}
