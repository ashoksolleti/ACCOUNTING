package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class SPAPerformanceReportFindRequest extends AbstractRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SPAPerformanceDto spaPerformanceDto = new SPAPerformanceDto();

	public SPAPerformanceDto getSpaPerformanceDto() {
		return spaPerformanceDto;
	}

	public void setSpaPerformanceDto(SPAPerformanceDto spaPerformanceDto) {
		this.spaPerformanceDto = spaPerformanceDto;
	}
}
