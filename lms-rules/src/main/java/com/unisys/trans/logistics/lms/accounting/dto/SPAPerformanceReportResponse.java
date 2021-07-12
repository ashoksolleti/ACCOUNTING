package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class SPAPerformanceReportResponse extends AbstractResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SPAPerformanceDto spaPerformanceDto = new SPAPerformanceDto();

	private List<SPAPerformanceDto> spaPerformanceDtoList = new ArrayList<SPAPerformanceDto>();
	public SPAPerformanceDto getSpaPerformanceDto() {
		return spaPerformanceDto;
	}

	public void setSpaPerformanceDto(SPAPerformanceDto spaPerformanceDto) {
		this.spaPerformanceDto = spaPerformanceDto;
	}

	public List<SPAPerformanceDto> getSpaPerformanceDtoList() {
		return spaPerformanceDtoList;
	}

	public void setSpaPerformanceDtoList(List<SPAPerformanceDto> spaPerformanceDtoList) {
		this.spaPerformanceDtoList = spaPerformanceDtoList;
	}
}
