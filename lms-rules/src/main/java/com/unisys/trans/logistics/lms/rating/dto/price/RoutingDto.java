/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;

/**
 * <code>RoutingDto</code> class contain information specific to a RoutingDto.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>carrierCode
 * <li>airportCode
 * <li>routingOrder
 * </code>
 * </ul>
 */
public class RoutingDto implements Serializable {
	@Override
	public String toString() {
		String routeDto = new String();
		routeDto = "routeDto ::: " + "carrierCode :" + carrierCode + "airportCode :" + airportCode + "routingOrder :"
				+ routingOrder;
		return routeDto;
	}

    /**
     * Unique serial version UID.
     */
	private static final long serialVersionUID = 8912223980372008202L;

	/**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>airportCode</code> property.
     */
    private String airportCode;

    /**
     * Attribute to hold <code>routingOrder</code> property.
     */
    private Integer routingOrder;

    /**
     * Gets the <code>airportCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>airportCode</code> property.
     */
    public String getAirportCode() {
        return this.airportCode;
    }

    /**
     * Gets the <code>carrierCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>carrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the <code>routingOrder</code> property.
     * <p>
     * 
     * @return the current value of the <code>routingOrder</code> property.
     */
    public Integer getRoutingOrder() {
        return this.routingOrder;
    }

    /**
     * Sets the <code>airportCode</code> property.
     * <p>
     * 
     * @param pAirportCode
     *            the current value of the <code>airportCode</code> property.
     */
    public void setAirportCode(final String pAirportCode) {
        this.airportCode = pAirportCode;
    }

    /**
     * Sets the <code>carrierCode</code> property.
     * <p>
     * 
     * @param pCarrierCode
     *            the current value of the <code>carrierCode</code> property.
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = pCarrierCode;
    }

    /**
     * Sets the <code>routingOrder</code> property.
     * <p>
     * 
     * @param pRoutingOrder
     *            the current value of the <code>routingOrder</code> property.
     */
    public void setRoutingOrder(final Integer pRoutingOrder) {
        this.routingOrder = pRoutingOrder;
    }
}