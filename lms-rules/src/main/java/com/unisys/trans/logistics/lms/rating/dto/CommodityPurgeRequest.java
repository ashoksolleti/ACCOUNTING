/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>CommodityPurgeRequest</code> class represents the request to purge the
 * CommodityVersion. information.
 * <p>
 * <code>CommodityPurgeRequest</code> holds the following attributes:
 * <ul>
 * <code>
 * <li>commodityOID
 * <li>commodityVersionOId
 * </code>
 * </ul>
 */
public class CommodityPurgeRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */

    private static final long serialVersionUID = -4038119247446680412L;

    /**
     * Attribute to hold <code>commodityOIDNoteOID</code>.
     * <p>
     * This hold the Unique key value for <code>commodityOID</code>.
     */
    private Long commodityOId;

    /**
     * Attribute to hold <code>commodityVersionOId</code>.
     * <p>
     * This hold the Unique key value for <code>commodityVersionOId</code>.
     */
    private Long commodityVersionOId;

    /**
     * Gets the <code>commodityOID</code> property.
     * <p>
     * Unique key to identify the <code>commodityOID</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>commodityOID</code> property.<br>
     */
    public Long getCommodityOId() {
        return this.commodityOId;
    }

    /**
     * Gets the <code>commodityVersionOId</code> property.
     * <p>
     * Unique key to identify the <code>CommodityVersionOId</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>commodityVersionOId</code> property.<br>
     */
    public Long getCommodityVersionOId() {
        return this.commodityVersionOId;
    }

    /**
     * Sets the <code>commodityOID</code> property.
     * <p>
     * Unique key to identify the <code>CommodityOID</code>.It is of type Long.
     * <p>
     * 
     * @param pCommodityOId
     *            the new value of the <code>CommodityOID</code> property.<br>
     */
    public void setCommodityOId(final Long pCommodityOId) {
        this.commodityOId = pCommodityOId;
    }

    /**
     * Sets the <code>commodityVersionOId</code> property.
     * <p>
     * Unique key to identify the <code>CommodityVersionOId</code>.It is of type Long.
     * <p>
     * 
     * @param pCommodityVersionOId
     *            the new value of the <code>rommodityVersionOId</code> property.<br>
     */
    public void setCommodityVersionOId(final Long pCommodityVersionOId) {
        this.commodityVersionOId = pCommodityVersionOId;
    }

}
