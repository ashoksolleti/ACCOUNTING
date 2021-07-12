package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.utils.dto.CarrierDto;

public class InterlineInwardBillingCarrierResponse extends AbstractResponse {

    /**
     * 
     */
    private static final long serialVersionUID = 4887786834334957994L;
    
    private List<CarrierDto> carrierDtos = new ArrayList<CarrierDto>();


    public List<CarrierDto> getCarrierDtos() {
        return carrierDtos;
    }


    public void setCarrierDtos(final List<CarrierDto> pCarrierDtos) {
        this.carrierDtos = pCarrierDtos;
    }


}
