package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class InterlineBillingReportFindRequest extends AbstractRequest {
	
	private static final long serialVersionUID = 1L;
	
	private InterlineBillingReportDto interlineBillingReportDto =new InterlineBillingReportDto();

	/**
	 * @return the interlineBillingReportDto
	 */
	public InterlineBillingReportDto getInterlineBillingReportDto() {
		return interlineBillingReportDto;
	}

	/**
	 * @param interlineBillingReportDto the interlineBillingReportDto to set
	 */
	public void setInterlineBillingReportDto(
			InterlineBillingReportDto interlineBillingReportDto) {
		this.interlineBillingReportDto = interlineBillingReportDto;
	}
	
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
