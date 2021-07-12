package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class RoutingProrationResponse extends AbstractResponse {

    /**
     * 
     */
    private static final long serialVersionUID = 6567971233404795161L;


    private List<RoutingProrationDto> routingProrationDtos;

    public List<RoutingProrationDto> getRoutingProrationDtos() {
        return this.routingProrationDtos;
    }

    public void setRoutingProrationDtos(final List<RoutingProrationDto> pRoutingProrationDtos) {
        this.routingProrationDtos = pRoutingProrationDtos;
    }

    public void addRoutingAndPricingDto(final RoutingProrationDto pRoutingAndPricingDto) {
        if (this.routingProrationDtos == null) {
            this.setRoutingProrationDtos(new ArrayList<RoutingProrationDto>());
        }
        this.routingProrationDtos.add(pRoutingAndPricingDto);
    }

}
