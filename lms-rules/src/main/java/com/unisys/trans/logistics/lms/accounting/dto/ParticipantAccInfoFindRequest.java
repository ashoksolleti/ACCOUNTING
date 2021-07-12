package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class ParticipantAccInfoFindRequest extends AbstractRequest {
	
    private static final long serialVersionUID = 1L;
	
	private ParticipantAccInformationReportDto participantAccInformationReportDto =new ParticipantAccInformationReportDto();

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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
