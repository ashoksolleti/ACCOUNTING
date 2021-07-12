package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class SpotRateSettingResponse extends AbstractResponse  implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -2913434465660485397L;
	
	private List<SpotRateAuthorizationSettingDto> spotRateAuthrorizationSettingsDto = new ArrayList<SpotRateAuthorizationSettingDto>();
	private List<SpotRateAuthResponseSettingDto>  SpotRateAuthResponseSettingDto = new ArrayList<SpotRateAuthResponseSettingDto>();
	private String response;
	
	public List<SpotRateAuthorizationSettingDto> getSpotRateAuthrorizationSettingsDto() {
		return spotRateAuthrorizationSettingsDto;
	}
	public void setSpotRateAuthrorizationSettingsDto(
			List<SpotRateAuthorizationSettingDto> spotRateAuthrorizationSettingsDto) {
		this.spotRateAuthrorizationSettingsDto = spotRateAuthrorizationSettingsDto;
	}
	public List<SpotRateAuthResponseSettingDto> getSpotRateAuthResponseSettingDto() {
		return SpotRateAuthResponseSettingDto;
	}
	public void setSpotRateAuthResponseSettingDto(
			List<SpotRateAuthResponseSettingDto> spotRateAuthResponseSettingDto) {
		SpotRateAuthResponseSettingDto = spotRateAuthResponseSettingDto;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}

	

	

}
