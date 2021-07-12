package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class OtherChargeValidatorResponse extends AbstractResponse {

    /**
     * 
     */
    private static final long serialVersionUID = -2686419852505916156L;

    private OtherChargeValidatorResponseDto otherChargeValidatorResponseDto;

    public OtherChargeValidatorResponseDto getOtherChargeValidatorResponseDto() {
        return otherChargeValidatorResponseDto;
    }

    public void setOtherChargeValidatorResponseDto(
                OtherChargeValidatorResponseDto otherChargeValidatorResponseDto) {
        this.otherChargeValidatorResponseDto = otherChargeValidatorResponseDto;
    }

}
