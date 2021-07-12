package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RoutingProrationRouteDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -3515357462631943114L;

    private List<FlightInfoDto> flightInfoDtos;

    private List<RoutingProrationProductDto> routingProducts = new ArrayList<RoutingProrationProductDto>();

    private List<RoutingSegmentDto> routingList = new ArrayList<RoutingSegmentDto>();
    
    private int routingNumber;

    public int getRoutingNumber() {
        return this.routingNumber;
    }

    public void setRoutingNumber(final int pRoutingNumber) {
        this.routingNumber = pRoutingNumber;
    }

    public List<FlightInfoDto> getFlightInfoDtos() {
        return this.flightInfoDtos;
    }

    public List<RoutingProrationProductDto> getRoutingProducts() {
        return this.routingProducts;
    }

    public void setFlightInfoDtos(final List<FlightInfoDto> pFlightInfoDtos) {
        this.flightInfoDtos = pFlightInfoDtos;
    }

    public void setRoutingProducts(final List<RoutingProrationProductDto> pRoutingProducts) {
        this.routingProducts = pRoutingProducts;
    }

    public List<RoutingSegmentDto> getRoutingList() {
        return this.routingList;
    }

    public void setRoutingList(final List<RoutingSegmentDto> pRoutingList) {
        this.routingList = pRoutingList;
    }
}
