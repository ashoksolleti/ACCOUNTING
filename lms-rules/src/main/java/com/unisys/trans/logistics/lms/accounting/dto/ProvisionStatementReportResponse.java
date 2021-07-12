package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class ProvisionStatementReportResponse extends AbstractResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ProvisionStatementReportDto provisionStatementReportdto = new ProvisionStatementReportDto();
	
	private List<ProvisionStatementReportDto> provisionStatementReportdtoList = new ArrayList<ProvisionStatementReportDto>();

	public ProvisionStatementReportDto getProvisionStatementReportdto() {
		return provisionStatementReportdto;
	}

	public void setProvisionStatementReportdto(
			ProvisionStatementReportDto provisionStatementReportdto) {
		this.provisionStatementReportdto = provisionStatementReportdto;
	}

	public List<ProvisionStatementReportDto> getProvisionStatementReportdtoList() {
		return provisionStatementReportdtoList;
	}

	public void setProvisionStatementReportdtoList(
			List<ProvisionStatementReportDto> provisionStatementReportdtoList) {
		this.provisionStatementReportdtoList = provisionStatementReportdtoList;
	}
}
