package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class OtherChargeResponse extends AbstractResponse {

    /**
     * 
     */
    private static final long serialVersionUID = 590863087701479376L;
    
    private OtherChargeResponseDto otherChargeResponseDto;

    public OtherChargeResponseDto getOtherChargeResponseDto() {
        return otherChargeResponseDto;
    }

    public void setOtherChargeResponseDto(OtherChargeResponseDto otherChargeResponseDto) {
        this.otherChargeResponseDto = otherChargeResponseDto;
    }


}
