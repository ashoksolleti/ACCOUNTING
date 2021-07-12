package com.unisys.trans.logistics.lms.parts.dto;

import java.util.List;

public class ParticipantHistoryResponse extends ParticipantResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5739742713350497373L;

    private ParticipantHistoryDto participantHistoryDto;

    private ParticipantHistoryChangeDetailsDto partHistoryChangeDtlsDto;

    private List<ParticipantHistoryChangeDetailsDto> partHistoryChangeDtlsDtos;

    /**
     * @return the participantHistoryDto
     */
    public ParticipantHistoryDto getParticipantHistoryDto() {
        return participantHistoryDto;
    }

    /**
     * @param participantHistoryDto the participantHistoryDto to set
     */
    public void setParticipantHistoryDto(final ParticipantHistoryDto pParticipantHistoryDto) {
        this.participantHistoryDto = pParticipantHistoryDto;
    }

    /**
     * @return the partHistoryChangeDtlsDto
     */
    public ParticipantHistoryChangeDetailsDto getPartHistoryChangeDtlsDto() {
        return partHistoryChangeDtlsDto;
    }

    /**
     * @param partHistoryChangeDtlsDto the partHistoryChangeDtlsDto to set
     */
    public void setPartHistoryChangeDtlsDto(ParticipantHistoryChangeDetailsDto partHistoryChangeDtlsDto) {
        this.partHistoryChangeDtlsDto = partHistoryChangeDtlsDto;
    }

    /**
     * @return the partHistoryChangeDtlsDtos
     */
    public List<ParticipantHistoryChangeDetailsDto> getPartHistoryChangeDtlsDtos() {
        return partHistoryChangeDtlsDtos;
    }

    /**
     * @param partHistoryChangeDtlsDtos the partHistoryChangeDtlsDtos to set
     */
    public void setPartHistoryChangeDtlsDtos(
                List<ParticipantHistoryChangeDetailsDto> partHistoryChangeDtlsDtos) {
        this.partHistoryChangeDtlsDtos = partHistoryChangeDtlsDtos;
    }

}
