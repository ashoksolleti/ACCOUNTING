/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>CommodityResponse </code> represents the response object of the maintenance request received by
 * <code>Commodity</code>.
 * <p>
 * <code>CommodityResponse </code> contains the following attribute:<br>
 * <ul>
 * <code>
 * <li>commodities
 * </code>
 * </ul>
 */
public class CommodityResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 109815339011030871L;

    /**
     * Attribute to hold list of <code>CommodityDto</code> property.
     * <p>
     * CommodityDto containing information about Commodity(s) to be sent as response.
     */
    private List<CommodityDto> commodities = new ArrayList<CommodityDto>();

    /**
     * Adds the commodity information to the <code>commodities</code> property.
     * <p>
     * 
     * @param pCommodityDto the new commodity information to be added to the <code>commodities</code>
     *            property.
     */
    public void addCommodity(final CommodityDto pCommodityDto) {
        this.commodities.add(pCommodityDto);
    }

    /**
     * Gets the <code>commodities</code> property.
     * <p>
     * 
     * @return the current value of <code>commodities</code> property.
     */
    public List<CommodityDto> getCommodities() {
        return this.commodities;
    }

    /**
     * Sets the <code>commodities</code> property.
     * <p>
     * 
     * @param pCommodities the new value of <code>commodities</code> property.
     */
    public void setCommodities(final List<CommodityDto> pCommodities) {
        this.commodities = pCommodities;
    }
}
