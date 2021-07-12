package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class LocalParticipantPersistRequest extends AbstractRequest {

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

}
