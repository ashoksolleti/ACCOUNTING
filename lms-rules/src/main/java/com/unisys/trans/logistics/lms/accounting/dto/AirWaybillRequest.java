/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class AirWaybillRequest extends AbstractRequest {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private AirWaybillRevenueDto airWaybillRevenueDto;

    public AirWaybillRevenueDto getAirWaybillRevenueDto() {
        return this.airWaybillRevenueDto;
    }

    public void setAirWaybillRevenueDto(final AirWaybillRevenueDto pAirWaybillRevenueDto) {
        this.airWaybillRevenueDto = pAirWaybillRevenueDto;
    }

}