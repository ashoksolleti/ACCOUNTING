package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class CASSReportDataSourceDto {
	
	private List<CASSParticipantInvoiceAWBDto> cassInvoiceList;
	//Contact#11828558 - variable type is changed
	private List<CASSParticipantInvoiceDCMDto> cassDCMList;
	private List<CASSParticipantInvoiceSummaryDto> cassSummaryList;

	  public Set<CASSReportDto> domesticCargoList=new HashSet<CASSReportDto>();

	public Set<CASSReportDto> getDomesticCargoList() {
		return domesticCargoList;
	}

	public void setDomesticCargoList(
			Set<CASSReportDto> domesticCargoList) {
		this.domesticCargoList = domesticCargoList;
	}
	
	 public Set<CASSReportDto> totalDomesticCargoList=new HashSet<CASSReportDto>();

	public Set<CASSReportDto> getTotalDomesticCargoList() {
		return totalDomesticCargoList;
	}

	public void setTotalDomesticCargoList(
			Set<CASSReportDto> totalDomesticCargoList) {
		this.totalDomesticCargoList = totalDomesticCargoList;
	}	
	
	
	 public Set<CASSReportDto> internationalCargoList=new HashSet<CASSReportDto>();

	public Set<CASSReportDto> getInternationalCargoList() {
		return internationalCargoList;
	}

	public void setInternationalCargoList(
			Set<CASSReportDto> internationalCargoList) {
		this.internationalCargoList = internationalCargoList;
	}
	
	 public Set<CASSReportDto> totalInternationalCargoList=new HashSet<CASSReportDto>();

	public Set<CASSReportDto> getTotalInternationalCargoList() {
		return totalInternationalCargoList;
	}

	public void setTotalInternationalCargoList(
			Set<CASSReportDto> totalInternationalCargoList) {
		this.totalInternationalCargoList = totalInternationalCargoList;
	}

	public List<CASSParticipantInvoiceAWBDto> getCassInvoiceList() {
		return cassInvoiceList;
	}

	public void setCassInvoiceList(
			List<CASSParticipantInvoiceAWBDto> cassInvoiceList) {
		this.cassInvoiceList = cassInvoiceList;
	}

	public List<CASSParticipantInvoiceDCMDto> getCassDCMList() {
		return cassDCMList;
	}

	public void setCassDCMList(List<CASSParticipantInvoiceDCMDto> cassDCMList) {
		this.cassDCMList = cassDCMList;
	}

	public List<CASSParticipantInvoiceSummaryDto> getCassSummaryList() {
		return cassSummaryList;
	}

	public void setCassSummaryList(
			List<CASSParticipantInvoiceSummaryDto> cassSummaryList) {
		this.cassSummaryList = cassSummaryList;
	}
	
	 
}
