package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class ParticipantAccInfoResponse extends AbstractResponse {
	
   private static final long serialVersionUID = 1L;
	
	private ParticipantAccInformationReportDto participantAccInformationReportDto= new ParticipantAccInformationReportDto();
	
	private List<ParticipantAccInformationReportDto> participantAccInformationReportDtoList =new ArrayList<ParticipantAccInformationReportDto>();
	
	private String noRecordFoundMessage;

	private boolean error;

	/**
	 * @return the participantAccInformationReportDto
	 */
	public ParticipantAccInformationReportDto getParticipantAccInformationReportDto() {
		return participantAccInformationReportDto;
	}

	/**
	 * @param participantAccInformationReportDto the participantAccInformationReportDto to set
	 */
	public void setParticipantAccInformationReportDto(
			ParticipantAccInformationReportDto participantAccInformationReportDto) {
		this.participantAccInformationReportDto = participantAccInformationReportDto;
	}

	/**
	 * @return the participantAccInformationReportDtoList
	 */
	public List<ParticipantAccInformationReportDto> getParticipantAccInformationReportDtoList() {
		return participantAccInformationReportDtoList;
	}

	/**
	 * @param participantAccInformationReportDtoList the participantAccInformationReportDtoList to set
	 */
	public void setParticipantAccInformationReportDtoList(
			List<ParticipantAccInformationReportDto> participantAccInformationReportDtoList) {
		this.participantAccInformationReportDtoList = participantAccInformationReportDtoList;
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
