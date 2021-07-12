/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;

public class AirwaybillRouteDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6195759865859623901L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>Station</code> property.
     */
    private String station;

    /**
     * Attribute to hold <code>Carrier</code> property.
     */
    private String carrier;

    /**
     * Attribute to hold <code>routeOrder</code> property.
     */
    private Integer routeOrder;

    /**
     * Gets the <code>Carrier</code> property.
     * <p>
     * 
     * @return the current value of the <code>Carrier</code> property.
     */
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * Gets the <code>Station</code> property.
     * <p>
     * 
     * @return the current value of the <code>Station</code> property.
     */
    public String getStation() {
        return this.station;
    }

    /**
     * Gets the <code>routeOrder</code> property.
     * <p>
     * 
     * @return the current value of the <code>routeOrder</code> property.
     */
    public Integer getRouteOrder() {
        return this.routeOrder;
    }

    /**
     * Sets the <code>Carrier</code>.
     * <p>
     * 
     * @param pCarrier
     *            holds the new value of <code>Carrier</code>
     */
    public void setCarrier(final String pCarrier) {
        this.carrier = pCarrier;
    }

    /**
     * Sets the <code>Station</code>.
     * <p>
     * 
     * @param pStation
     *            holds the new value of <code>Station</code>
     */
    public void setStation(final String pStation) {
        this.station = pStation;
    }

    /**
     * Sets the <code>routeOrder</code>.
     * <p>
     * 
     * @param pRouteOrder
     *            holds the new value of <code>routeOrder</code>
     */
    public void setRouteOrder(final Integer pRouteOrder) {
        this.routeOrder = pRouteOrder;
    }


    /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }


    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>ClassRatingId</code>.It is of type Long.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }
    @Override
    public String toString() {
        final StringBuilder aStrBuilder = new StringBuilder();
        if(this.getStation()!=null){
            aStrBuilder.append(this.getStation());
           
        }
        if (this.getCarrier()!=null) {
            aStrBuilder.append(this.getCarrier());
            aStrBuilder.append(" "); 
        }
            return aStrBuilder.toString();
        }

}
