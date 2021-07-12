package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class BatchControlReportFindRequest extends AbstractRequest{ 
	
	private static final long serialVersionUID = 1L;
	
	private BatchControlReportDto batchControlReportDto =new BatchControlReportDto();

	public BatchControlReportDto getBatchControlReportDto() {
		return batchControlReportDto;
	}

	public void setBatchControlReportDto(BatchControlReportDto batchControlReportDto) {
		this.batchControlReportDto = batchControlReportDto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
