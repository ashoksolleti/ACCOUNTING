package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * The type Participant payable report response.
 */
public class ParticipantPayableReportResponse extends AbstractResponse {
	
    private List<GSAAgreementDto> gsaAgreementDtos;

	private List<ParticipantPayableReportDto> participantPayableReportDtos;

	private int totalCount;

    /**
     * Gets participant payable report dtos.
     *
     * @return the participant payable report dtos
     */
    public List<ParticipantPayableReportDto> getParticipantPayableReportDtos() {
		return participantPayableReportDtos;
	}

    /**
     * Sets participant payable report dtos.
     *
     * @param participantPayableReportDtos the participant payable report dtos
     */
    public void setParticipantPayableReportDtos(
			List<ParticipantPayableReportDto> participantPayableReportDtos) {
		this.participantPayableReportDtos = participantPayableReportDtos;
	}

    /**
     * Gets gsa agreement dtos.
     *
     * @return the gsaAgreementDtos
     */
    public List<GSAAgreementDto> getGsaAgreementDtos() {
        return gsaAgreementDtos;
    }

    /**
     * Sets gsa agreement dtos.
     *
     * @param gsaAgreementDtos the gsaAgreementDtos to set
     */
    public void setGsaAgreementDtos(List<GSAAgreementDto> gsaAgreementDtos) {
        this.gsaAgreementDtos = gsaAgreementDtos;
    }

    /**
     * Gets total count.
     *
     * @return the total count
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets total count.
     *
     * @param totalCount the total count
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
