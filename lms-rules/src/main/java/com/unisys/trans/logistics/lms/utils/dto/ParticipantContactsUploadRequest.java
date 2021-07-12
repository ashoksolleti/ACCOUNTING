package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.preferences.TargetsUploadDto;

public class ParticipantContactsUploadRequest extends AbstractRequest {


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    Long runOid;

    /**
     * @return the runOid
     */
    public Long getRunOid() {
        return runOid;
    }

    /**
     * @param runOid the runOid to set
     */
    public void setRunOid(Long runOid) {
        this.runOid = runOid;
    }

    TargetsUploadDto targetsUploadDto;

    /**
     * @return the targetsUploadDto
     */
    public TargetsUploadDto getTargetsUploadDto() {
        return targetsUploadDto;
    }

    /**
     * @param targetsUploadDto the targetsUploadDto to set
     */
    public void setTargetsUploadDto(TargetsUploadDto targetsUploadDto) {
        this.targetsUploadDto = targetsUploadDto;
    }

}
