package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class ProrationResponse extends AbstractResponse {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    private AirWaybillRevenueDto airWaybillRevenueDto;

    private List<OtherChargeSplitDto> hostRevenueSplit;

    public AirWaybillRevenueDto getAirWaybillRevenueDto() {
        return this.airWaybillRevenueDto;
    }

    public List<OtherChargeSplitDto> getHostRevenueSplit() {
        return this.hostRevenueSplit;
    }

    public void setAirWaybillRevenueDto(final AirWaybillRevenueDto pAirWaybillRevenueDto) {
        this.airWaybillRevenueDto = pAirWaybillRevenueDto;
    }

    public void setHostRevenueSplit(final List<OtherChargeSplitDto> pHostRevenueSplit) {
        this.hostRevenueSplit = pHostRevenueSplit;
    }

}
