package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class StationAdminResponse extends AbstractResponse {
    /**
     * 
     */
    private static final long serialVersionUID = -4185009020042839685L;

    private List<StationInfoSectionDto> stationInfoSectionDto;

    public List<StationInfoSectionDto> getStationInfoSectionDto() {
        return this.stationInfoSectionDto;
    }

    public void setStationInfoSectionDto(
                final List<StationInfoSectionDto> pStationInfoSectionDto) {
        this.stationInfoSectionDto = pStationInfoSectionDto;
    }
}
