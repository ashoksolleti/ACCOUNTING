package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;



public class ProvisionStatementReportFindRequest extends AbstractRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProvisionStatementReportDto provisionStatementReportdto = new ProvisionStatementReportDto();

	public ProvisionStatementReportDto getProvisionStatementReportdto() {
		return provisionStatementReportdto;
	}

	public void setProvisionStatementReportdto(
			ProvisionStatementReportDto provisionStatementReportdto) {
		this.provisionStatementReportdto = provisionStatementReportdto;
	}
	
	
}
