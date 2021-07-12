package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;

/**
 * @author KurmalNG
 *
 */
public class BatchControlReportDto extends PersistenceObjectDto {
	private static final long serialVersionUID = 1L;
	
	private static final String EMPTY_STRING = "";
	
	private Long oId;
	
	byte[] outputFile;
	
	private String fileName;

    private String reportType;
	
	private String reportName;
	
	private Date startDate;
	
	private Date endDate;
	
	private String accountingMonth;
	
	private String accountingYear;
	
	private Date reportGenerationDate;
	
	private String reportStatus;
	
	private Boolean generalReportIndicator = true;
	
	private boolean action = false;
	
	private boolean download;
	
	private boolean disableAction=false;
	
	private boolean disablePrint=true;
	
	

	public boolean isDisableAction() {
		return disableAction;
	}



	public void setDisableAction(boolean disableAction) {
		this.disableAction = disableAction;
	}



	public boolean isDisablePrint() {
		return disablePrint;
	}



	public void setDisablePrint(boolean disablePrint) {
		this.disablePrint = disablePrint;
	}



	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	public String getFileName() {
		return fileName;
	}



	public void setFileName(String fileName) {
		this.fileName = fileName;
	}



	public String getReportStatus() {
		return reportStatus;
	}



	public void setReportStatus(String reportStatus) {
		this.reportStatus = reportStatus;
	}



	public Boolean getGeneralReportIndicator() {
		return generalReportIndicator;
	}



	public void setGeneralReportIndicator(Boolean generalReportIndicator) {
		this.generalReportIndicator = generalReportIndicator;
	}



	public byte[] getOutputFile() {
		return outputFile;
	}



	public void setOutputFile(byte[] outputFile) {
		this.outputFile = outputFile;
	}



	public Long getoId() {
		return oId;
	}

	public void setoId(Long oId) {
		this.oId = oId;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getReportName() {
		if(reportName!=null&&!reportName.isEmpty()){
			reportName = reportName.toUpperCase();
		}
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getAccountingMonth() {
		if(accountingMonth!=null&&!accountingMonth.isEmpty()){
			accountingMonth = accountingMonth.toUpperCase();
		}
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

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public boolean isDownload() {
		return download;
	}

	public void setDownload(boolean download) {
		this.download = download;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	public String toString() {
        // SuppressOn:MagicNumber
        final StringBuffer csvString = new StringBuffer();
        // SuppressOff:MagicNumber
  
        	if (this.getReportType() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getReportType()));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getReportName() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getReportName()));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
            if (this.getReportGenerationDate()!= null) {
                csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getReportGenerationDate())));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

            }

            if (this.getAccountingMonth() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getAccountingMonth()));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

            }
            
            if (this.getAccountingYear() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getAccountingYear()));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
            
        	
            if (this.getStartDate()!= null) {
                csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getStartDate())));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

            }
            if (this.getEndDate()!= null) {
                csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getEndDate())));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

            }
		
        return csvString.toString();
    }

    private String prefixSuffixByQuotes(final String pString) {
        final String aQUOTATION = "\"";
        final String aCOMMA = ",";

        final StringBuffer aModifiedString = new StringBuffer();
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(pString);
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(aCOMMA);

        return aModifiedString.toString();
    }

}