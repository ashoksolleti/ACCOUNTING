/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

/**
 * The persistent class for the ARC_STATION database table.
 * 
 */
public class RouteDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */

    private static final long serialVersionUID = 1L;

    /**
     * Freight bill routing segment carrier code.
     */
    private String carrier;

    /**
     * Freight bill routing segment carrier code.
     */
    private Long oid;

    /**
     * Ordering of the Routing Segments.
     */
    private Integer routeOrder;

    /**
     * Freight bill routing segment station code.
     */
    private String station;

    /**
     * default constructor.
     */

    public RouteDto() {
    }

    /**
     * constructor with single parameter.
     * 
     * @param holds the current value of <code> pStation </code>property.
     */
    public RouteDto(final String pStation) {
        this.station = pStation;
    }

    /**
     * constructor with double parameter.
     * 
     * @param holds the current value of <code> pCarrier </code> and <code> pStation </code>property.
     */

    public RouteDto(final String pStation, final String pCarrier) {
        if (pStation == null) {

            throw new IllegalArgumentException("Station code expected ");
        }
        this.station = pStation;
        this.carrier = pCarrier;
    }

    /**
     * Gets the <code>carrier</code> property.
     * 
     * @return
     *         the current value of <code> carrier </code>.
     */

    public String getCarrier() {
        return this.carrier;
    }

    /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of <code>oId</code>.
     */

    @Override
    public Long getOId() {

        return this.oid;
    }

    /**
     * Gets the <code>routeOrder</code> property.
     * 
     * @return the current value of <code>routeOrder</code>.
     */

    public Integer getRouteOrder() {
        return this.routeOrder;
    }

    /**
     * Gets the <code>station</code> property.
     * 
     * @return the current value of <code>station</code>.
     */

    public String getStation() {
        return this.station;
    }

    /**
     * Sets the <code>carrier</code> property.
     * 
     * carrier code size 2-3 alphanumeric
     * Example:
     * UW
     * 
     */

    public void setCarrier(final String pCarrier) {
        this.carrier = pCarrier;
    }

    /**
     * Sets the <code>pOId</code> property.
     * 
     */

    public void setOId(final Long pOId) {
        this.oid = pOId;
    }

    /**
     * Sets the <code>pRouteOrder</code> property.
     * 
     * @param holds the current value of <code> pRouteOrder <code>
     */

    public void setRouteOrder(final Integer pRouteOrder) {
        this.routeOrder = pRouteOrder;
    }

    /**
     * Sets the <code>pStation</code> value.
     * 
     * @param holds the current value of Station
     * 
     *            Station must be 3-5 alphabets.
     *            Example :
     *            MSP,ORD
     */

    public void setStation(final String pStation) {
        this.station = pStation;
    }

    @Override
    // SuppressOn:MagicNumber
    public int hashCode() {
        int result = (this.carrier == null ? 3
                    : this.carrier.hashCode() * 13) + (this.station == null ? 5 : this.station.hashCode() * 17);
        return result;
    }

    @Override
    public boolean equals(final Object pObj) {
        boolean isEqual = true;

        if (pObj == null) {
            isEqual = false;
        }
        else if (this == pObj) {
            isEqual = true;
        }
        else if (getClass() != pObj.getClass()) {
            isEqual = false;
        }
        else {
            RouteDto other = (RouteDto) pObj;
            if (carrier == null) {
                if (other.carrier != null) {
                    isEqual = false;
                }
            }
            else if (!carrier.equals(other.carrier)) {
                isEqual = false;
            }

            if (station == null) {
                if (other.station != null) {
                    isEqual = false;
                }
            }
            else if (!station.equals(other.station)) {
                isEqual = false;
            }
        }

        return isEqual;
    }
}