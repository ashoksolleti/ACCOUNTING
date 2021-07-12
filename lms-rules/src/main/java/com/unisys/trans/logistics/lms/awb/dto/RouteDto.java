/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.awb.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * The persistent class for the ARC_STATION database table.
 * 
 */
public class RouteDto extends PersistenceObjectDto
{

    private static final long serialVersionUID = 1L;

    /**
     * Freight bill routing segment carrier code
     */
    private String carrier;

    private Long oId;

    /**
     * Ordering of the Routing Segments
     */
    private Integer routeOrder;

    /**
     * Freight bill routing segment station code
     */
    private String station;
    /**
     * Country of the Routing Station
     */
    private String country;

    /**
     * @return the country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @param pCountry the country to set
     */
    public void setCountry(final String pCountry) {
        this.country = pCountry;
    }

    public RouteDto()
    {
    }

    public RouteDto(final String pStation)
    {
        this.station = pStation;
    }

    public RouteDto(final String pStation, final String pCarrier)
    {
        // do nothing if the station code is null
        if (pStation == null) {

            throw new IllegalArgumentException("Station code expected ");
        }
        this.station = pStation;
        this.carrier = pCarrier;
    }

    public String getCarrier()
    {
        return carrier;
    }

    public Long getOId()
    {

        return this.oId;
    }

    public Integer getRouteOrder()
    {
        return routeOrder;
    }

    public String getStation()
    {
        return station;
    }

    public void setCarrier(String pCarrier)
    {
        this.carrier = pCarrier;
    }

    public void setRouteOrder(Integer routeOrder)
    {
        this.routeOrder = routeOrder;
    }

    public void setStation(String pStation)
    {
        this.station = pStation;
    }

    public void setOId(Long pOId)
    {
        this.oId = pOId;
    }
}