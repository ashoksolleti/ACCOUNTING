package com.unisys.trans.logistics.lms.rating.dto.price;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class RoutingAndPricingResponse extends AbstractResponse {

    /**
     * 
     */
    private static final long serialVersionUID = -2207361573589755174L;

    private List<RoutingAndPricingDto> routingAndPricingDtos;

    public List<RoutingAndPricingDto> getRoutingAndPricingDtos() {
        return this.routingAndPricingDtos;
    }

    public void setRoutingAndPricingDtos(final List<RoutingAndPricingDto> pRoutingAndPricingDtos) {
        this.routingAndPricingDtos = pRoutingAndPricingDtos;
    }

    public void addRoutingAndPricingDto(final RoutingAndPricingDto pRoutingAndPricingDto) {
        if (this.routingAndPricingDtos == null) {
            this.setRoutingAndPricingDtos(new ArrayList<RoutingAndPricingDto>());
        }
        this.routingAndPricingDtos.add(pRoutingAndPricingDto);
    }
}
