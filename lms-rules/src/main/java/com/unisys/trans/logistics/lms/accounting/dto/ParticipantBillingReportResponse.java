package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.ParticipantBillingReportDto;
import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class ParticipantBillingReportResponse extends AbstractResponse {

	private static final long serialVersionUID = 1L;
	
	private ParticipantBillingReportDto participantBillingReportDto= new ParticipantBillingReportDto();
	
	private List<ParticipantBillingReportDto> participantBillingReportDtoList=new ArrayList<ParticipantBillingReportDto>();
	
	private String noRecordFoundMessage;
	
	private int totalNumberofRecords;
	
	private int numberOfRecordsPerPage;

	private boolean error;
	
	
	public int getNumberOfRecordsPerPage() {
		return numberOfRecordsPerPage;
	}

	public void setNumberOfRecordsPerPage(int numberOfRecordsPerPage) {
		this.numberOfRecordsPerPage = numberOfRecordsPerPage;
	}

	public int getTotalNumberofRecords() {
		return totalNumberofRecords;
	}

	public void setTotalNumberofRecords(int totalNumberofRecords) {
		this.totalNumberofRecords = totalNumberofRecords;
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

	/**
	 * @return the participantBillingReportDto
	 */
	public ParticipantBillingReportDto getParticipantBillingReportDto() {
		return participantBillingReportDto;
	}

	/**
	 * @param participantBillingReportDto the participantBillingReportDto to set
	 */
	public void setParticipantBillingReportDto(
			ParticipantBillingReportDto participantBillingReportDto) {
		this.participantBillingReportDto = participantBillingReportDto;
	}

	/**
	 * @return the participantBillingReportDtoList
	 */
	public List<ParticipantBillingReportDto> getParticipantBillingReportDtoList() {
		return participantBillingReportDtoList;
	}

	/**
	 * @param participantBillingReportDtoList the participantBillingReportDtoList to set
	 */
	public void setParticipantBillingReportDtoList(
			List<ParticipantBillingReportDto> participantBillingReportDtoList) {
		this.participantBillingReportDtoList = participantBillingReportDtoList;
	}
	

	
}

