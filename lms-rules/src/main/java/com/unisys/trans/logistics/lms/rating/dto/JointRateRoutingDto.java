/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>JointRateRoutingDto</code> contain details of JointRateRoutingDto.
 * <p>
 * This contains all information about JointRateRoutingDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>city
 * <li>oId
 * <li>carrierCode
 * <li>routingOrder
 * </ul>
 */
public class JointRateRoutingDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8255730360967243991L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>city</code> property.
     */
    private GeographicDataDto city;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>routingOrder</code> property.
     */
    private Integer routingOrder;

    /**
     * <code>Default Constructor.</code>
     */

    public JointRateRoutingDto() {
    }

    /**
     * Parameterize constructor.
     * 
     * @param pRoutingOrder
     *            the value.
     */

    public JointRateRoutingDto(final Integer pRoutingOrder) {
        this.routingOrder = pRoutingOrder;
    }

    /**
     * Gets the <code>CarrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @return the current value of the <code>CarrierCode</code> property.
     */

    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the <code>cityCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>cityCode</code> property.
     */
    public GeographicDataDto getCity() {
        if (this.city == null) {
            this.city = new GeographicDataDto();
        }
        return this.city;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
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
     * Sets the <code>CarrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @param pCarrierCode
     *            the current value of the <code>CarrierCode</code> property.
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);
    }

    /**
     * Sets the <code>city</code> property.
     * <p>
     * 
     * @param pCity
     *            the current value of the <code>city</code> property.
     */
    public void setCity(final GeographicDataDto pCity) {
        this.city = pCity;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
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