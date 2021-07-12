/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingConventionType;

/**
 * <code>CommodityRestoreRequest</code> class represents the request to restore the commodity information.
 * <p>
 * <code>CommodityRestoreRequest</code> holds the following attributes:
 * <ul>
 * <code>
 * <li>commodityCode
 * <li>commodityType
 * <li>oId
 * </code>
 * </ul>
 */
public class CommodityRestoreRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3156198438230315446L;

    /**
     * Attribute to hold <code>commodityCode</code> property.
     * <p>
     * Commodity Code to be deleted that is referenced in Commodity Version.
     */
    private String commodityCode;

    /**
     * Attribute to hold <code>commodityType</code> property.
     * <p>
     * Commodity Type: Commodity types are a one character notation that denotes the type of commodity.<br>
     * <ul>
     * The following are the valid commodity types:<br>
     * <li>I - IATA (International Air Transport Association.)
     * <li>D - ATPCO (Airline Tariff Publishing Company.)
     * </ul>
     */
    private RatingConventionType commodityType;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique Key for Commodity to be deleted.
     */
    private Long oId;

    /**
     * Default constructor.
     */
    public CommodityRestoreRequest() {

    }

    /**
     * Gets the <code>commodityCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 4-5 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 999A
     * <p>
     * 
     * @return the current value of the <code>commodityCode</code> property.<br>
     */
    public final String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * Gets the <code>commodityType</code> property.
     * <p>
     * 
     * @return the current value of the <code>commodityType</code> property.<br>
     */
    public final RatingConventionType getCommodityType() {
        return this.commodityType;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.<br>
     */
    public final Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>commodityCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 4-5 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 999A
     * <p>
     * 
     * @param pCommodityCode the new value of the <code>commodityCode</code>property.<br>
     */
    public final void setCommodityCode(final String pCommodityCode) {
        this.commodityCode = pCommodityCode;
    }

    /**
     * Sets the <code>commodityType</code> property.
     * <p>
     * 
     * @param pCommodityType the new value of the <code>commodityType</code>property.<br>
     */
    public final void setCommodityType(final RatingConventionType pCommodityType) {
        this.commodityType = pCommodityType;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.<br>
     */
    public final void setOId(final Long pOId) {
        this.oId = pOId;
    }
}