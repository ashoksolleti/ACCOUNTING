package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;

public class RoutingProrationDto implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private AirWaybillRevenueDto awbRevenue;
    
    private RoutingProrationRouteDto routingProrationRouteDto;
    private RoutingProrationProductDto routingProrationProductDto;

    public RoutingProrationRouteDto getRoutingProrationRouteDto() {
        return this.routingProrationRouteDto;
    }

    public RoutingProrationProductDto getRoutingProrationProductDto() {
        return this.routingProrationProductDto;
    }

    public AirWaybillRevenueDto getAwbRevenue() {
        return awbRevenue;
    }

    public void setAwbRevenue(AirWaybillRevenueDto awbRevenue) {
        this.awbRevenue = awbRevenue;
    }

    public void setRoutingProrationRouteDto(final RoutingProrationRouteDto pRoutingProrationRouteDto) {
        // TODO Auto-generated method stub
        this.routingProrationRouteDto = pRoutingProrationRouteDto;
    }

    public void setRoutingProrationProductDto(final RoutingProrationProductDto pRoutingProrationProductDto) {
        // TODO Auto-generated method stub
        this.routingProrationProductDto = pRoutingProrationProductDto;
    }
}
