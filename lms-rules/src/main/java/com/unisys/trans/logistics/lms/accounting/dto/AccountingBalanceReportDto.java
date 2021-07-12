/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.ByteArrayOutputStream;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * @author KurmalNG
 *
 */
public class AccountingBalanceReportDto extends PersistenceObjectDto{
		
	/**
	 * 
	 */
	
	private Long oId;

	private static final long serialVersionUID = 1L;
	
	byte[] outputFile;
	
	private String fileName;
	
	private String reportStatus;
	
	private String reportType;
	
	private String reportName;
	
	private Boolean generalReportIndicator = true;
	
	private String accountingMonth;
	
	private String accountingYear;
	
	private Date reportGenerationDate;
	
	
	

	public Long getoId() {
		return oId;
	}

	public void setoId(Long oId) {
		this.oId = oId;
	}

	public String getAccountingMonth() {
		return accountingMonth;
	}

	public void setAccountingMonth(String accountingMonth) {
		this.accountingMonth = accountingMonth;
	}

	public String getAccountingYear() {
		return accountingYear;
	}

	public void setAccountingYear(String accountingYear) {
		this.accountingYear = accountingYear;
	}


	public Date getReportGenerationDate() {
		return reportGenerationDate;
	}


	public void setReportGenerationDate(Date reportGenerationDate) {
		this.reportGenerationDate = reportGenerationDate;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getReportStatus() {
		return reportStatus;
	}

	public void setReportStatus(String reportStatus) {
		this.reportStatus = reportStatus;
	}

	public byte[] getOutputFile() {
		return outputFile;
	}


	public Boolean getGeneralReportIndicator() {
		return generalReportIndicator;
	}


	public void setGeneralReportIndicator(Boolean generalReportIndicator) {
		this.generalReportIndicator = generalReportIndicator;
	}

	public void setOutputFile(byte[] outputFile) {
		this.outputFile = outputFile;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}



	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

}
