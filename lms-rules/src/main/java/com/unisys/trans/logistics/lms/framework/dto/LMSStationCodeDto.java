package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.util.List;

public class LMSStationCodeDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String stationCode;   
    private String stationName;
    private List<LMSStationCodeDto> lmsStationCodeDtos;

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public List<LMSStationCodeDto> getLmsStationCodeDtos() {
		return lmsStationCodeDtos;
	}

	public void setLmsStationCodeDtos(List<LMSStationCodeDto> lmsStationCodeDtos) {
		this.lmsStationCodeDtos = lmsStationCodeDtos;
	}

	@Override
    public String toString() {
        return stationName;
    }
}