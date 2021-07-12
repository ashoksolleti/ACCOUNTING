package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class SpotRateSettingRequest extends AbstractRequest {

    /**
	 * 
	 */
    private static final long serialVersionUID = -7433336860994973865L;

    private SpotRateAuthorizationSettingDto spotRateAuthorizationSettingDto;

    private SpotRateAuthResponseSettingDto spotRateAuthResponseSettingDto;

    public SpotRateAuthorizationSettingDto getSpotRateAuthorizationSettingDto() {
        return spotRateAuthorizationSettingDto;
    }

    public void setSpotRateAuthorizationSettingDto(
                SpotRateAuthorizationSettingDto spotRateAuthorizationSettingDto) {
        this.spotRateAuthorizationSettingDto = spotRateAuthorizationSettingDto;
    }

    public SpotRateAuthResponseSettingDto getSpotRateAuthResponseSettingDto() {
        return spotRateAuthResponseSettingDto;
    }

    public void setSpotRateAuthResponseSettingDto(
                SpotRateAuthResponseSettingDto spotRateAuthResponseSettingDto) {
        this.spotRateAuthResponseSettingDto = spotRateAuthResponseSettingDto;
    }

}
