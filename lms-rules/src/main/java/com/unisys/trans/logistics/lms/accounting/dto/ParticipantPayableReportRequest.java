package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class ParticipantPayableReportRequest extends AbstractRequest  {
	
	private ParticipantPayableReportDto participantPayableReportDto;

	private GSAAgreementDto gsaAgreementDto;

	public ParticipantPayableReportDto getParticipantPayableReportDto() {
		return participantPayableReportDto;
	}

	public void setParticipantPayableReportDto(
			ParticipantPayableReportDto participantPayableReportDto) {
		this.participantPayableReportDto = participantPayableReportDto;
	}

	public GSAAgreementDto getGsaAgreementDto() {
		return gsaAgreementDto;
	}

	public void setGsaAgreementDto(GSAAgreementDto gsaAgreementDto) {
		this.gsaAgreementDto = gsaAgreementDto;
	}
}
