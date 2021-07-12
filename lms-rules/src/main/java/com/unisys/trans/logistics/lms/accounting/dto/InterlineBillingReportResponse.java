package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineBillingReportDto;

public class InterlineBillingReportResponse extends AbstractResponse {
	
    private static final long serialVersionUID = 1L;
	
	private InterlineBillingReportDto interlineBillingReportDto= new InterlineBillingReportDto();
	
	private List<InterlineBillingReportDto> interlineBillingReportDtoList=new ArrayList<InterlineBillingReportDto>();
	
	private String noRecordFoundMessage;

	private boolean error;
	
	private int totalNumberofRecords;
	

	public int getTotalNumberofRecords() {
		return totalNumberofRecords;
	}

	public void setTotalNumberofRecords(int totalNumberofRecords) {
		this.totalNumberofRecords = totalNumberofRecords;
	}

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
	 * @return the interlineBillingReportDtoList
	 */
	public List<InterlineBillingReportDto> getInterlineBillingReportDtoList() {
		return interlineBillingReportDtoList;
	}

	/**
	 * @param interlineBillingReportDtoList the interlineBillingReportDtoList to set
	 */
	public void setInterlineBillingReportDtoList(
			List<InterlineBillingReportDto> interlineBillingReportDtoList) {
		this.interlineBillingReportDtoList = interlineBillingReportDtoList;
	}

	/**
	 * @return the noRecordFoundMessage
	 */
	public String getNoRecordFoundMessage() {
		return noRecordFoundMessage;
	}

	/**
	 * @param noRecordFoundMessage the noRecordFoundMessage to set
	 */
	public void setNoRecordFoundMessage(String noRecordFoundMessage) {
		this.noRecordFoundMessage = noRecordFoundMessage;
	}

	/**
	 * @return the error
	 */
	public boolean isError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(boolean error) {
		this.error = error;
	}
	
	

}
