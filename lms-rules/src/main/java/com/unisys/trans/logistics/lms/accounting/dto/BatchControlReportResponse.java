package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class BatchControlReportResponse extends AbstractResponse  {

	private static final long serialVersionUID = 1L;
	
	private BatchControlReportDto batchControlReportDto= new BatchControlReportDto();
	
	private AccountingBalanceReportDto accountingBalanceReportDto;
	
	private List<BatchControlReportDto> batchControlReportDtos=new ArrayList<BatchControlReportDto>();
	
	private List<AccountingBatchReportDto> accountingBatchReport = new ArrayList<AccountingBatchReportDto>();
	
	private String noRecordFoundMessage;

	private boolean error;
	

	public List<AccountingBatchReportDto> getAccountingBatchReport() {
		return accountingBatchReport;
	}


	public void setAccountingBatchReport(
			List<AccountingBatchReportDto> accountingBatchReport) {
		this.accountingBatchReport = accountingBatchReport;
	}


	public AccountingBalanceReportDto getAccountingBalanceReportDto() {
		return accountingBalanceReportDto;
	}


	public void setAccountingBalanceReportDto(
			AccountingBalanceReportDto accountingBalanceReportDto) {
		this.accountingBalanceReportDto = accountingBalanceReportDto;
	}

	public BatchControlReportDto getBatchControlReportDto() {
		return batchControlReportDto;
	}

	public void setBatchControlReportDto(BatchControlReportDto batchControlReportDto) {
		this.batchControlReportDto = batchControlReportDto;
	}


	public List<BatchControlReportDto> getBatchControlReportDtos() {
		return batchControlReportDtos;
	}

	public void setBatchControlReportDtos(
			List<BatchControlReportDto> batchControlReportDtos) {
		this.batchControlReportDtos = batchControlReportDtos;
	}


	public String getNoRecordFoundMessage() {
		return noRecordFoundMessage;
	}

	public void setNoRecordFoundMessage(String noRecordFoundMessage) {
		this.noRecordFoundMessage = noRecordFoundMessage;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
