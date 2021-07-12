package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.framework.preferences.TargetsUploadDto;

public class ParticipantContactsUploadResponse extends AbstractResponse {

    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>runOid</code> property.
     */
    String runOid;
    /**
     * Attribute to hold <code>targetsUploadDto</code> property.
     */
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


    /**
     * @return the runOid
     */
    public String getRunOid() {
        return runOid;
    }

    /**
     * @param runOid the runOid to set
     */
    public void setRunOid(String runOid) {
        this.runOid = runOid;
    }


}
