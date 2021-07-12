package com.unisys.trans.logistics.lms.parts.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class LocalParticipantResponse extends AbstractResponse {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private LocalParticipantDto localParticipantDto;

    public LocalParticipantDto getLocalParticipantDto() {
        return localParticipantDto;
    }

    public void setLocalParticipantDto(LocalParticipantDto localParticipantDto) {
        this.localParticipantDto = localParticipantDto;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    private List<LocalParticipantDto> thelocalParticipantDtos;

    public List<LocalParticipantDto> getThelocalParticipantDtos() {
        if (this.thelocalParticipantDtos == null) {
            this.thelocalParticipantDtos = new ArrayList<LocalParticipantDto>();
        }
        return thelocalParticipantDtos;
    }

    public void setThelocalParticipantDtos(List<LocalParticipantDto> thelocalParticipantDtos) {
        this.thelocalParticipantDtos = thelocalParticipantDtos;
    }

}
