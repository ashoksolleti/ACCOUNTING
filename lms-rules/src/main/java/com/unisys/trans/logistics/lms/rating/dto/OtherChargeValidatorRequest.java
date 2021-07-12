package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class OtherChargeValidatorRequest extends AbstractRequest {
    /**
     * 
     */
    private static final long serialVersionUID = -8860831716995827446L;

    private OtherChargeValidationDto otherChargeValidationDto;

    public OtherChargeValidationDto getOtherChargeValidationDto() {
        return otherChargeValidationDto;
    }

    public void setOtherChargeValidationDto(OtherChargeValidationDto otherChargeValidationDto) {
        this.otherChargeValidationDto = otherChargeValidationDto;
    }
}
