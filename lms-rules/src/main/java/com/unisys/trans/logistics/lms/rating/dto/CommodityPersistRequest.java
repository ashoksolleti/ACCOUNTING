/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>CommodityPersistRequest</code> class represents the request to create the commodity information.
 * <p>
 * <code>CommodityPersistRequest</code> holds the following attribute:
 * <ul>
 * <code>
 * <li>commodity
 * </code>
 * </ul>
 */
public class CommodityPersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1448100267757047427L;

    /**
     * Attribute to hold <code>commodity</code> property.
     * <p>
     * The <code>CommodityDto</code> includes commodity information and its associated commodity versions.
     */
    private CommodityDto commodity;

    /**
     * <code>Default constructor.</code>
     */
    public CommodityPersistRequest() {
    }

    /**
     * Gets the <code>commodity</code> property.
     * <p>
     * Represents the <code>CommodityDto</code> which holds all the attributes that are specific to commodity
     * information and its versions.
     * <p>
     * 
     * @return the current value of the <code>commodity</code> property.
     */
    public final CommodityDto getCommodity() {
        return this.commodity;
    }

    /**
     * Sets the <code>commodity</code> property.
     * <p>
     * Represents the <code>CommodityDto</code> which holds all the attributes that are specific to commodity
     * information and its versions.
     * <p>
     * 
     * @param pCommodityDto the new value of the <code>commodity</code> property.<br>
     */
    public final void setCommodity(final CommodityDto pCommodityDto) {
        this.commodity = pCommodityDto;
    }
}