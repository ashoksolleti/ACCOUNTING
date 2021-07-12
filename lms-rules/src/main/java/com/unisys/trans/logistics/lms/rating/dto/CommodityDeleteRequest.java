/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingConventionType;

import java.util.Date;

/**
 * <code>CommodityDeleteRequest</code> class represents the request to delete the commodity information.
 * <p>
 * <code>commodityCode</code>, <code>commodityType</code> and <code>endDate</code> is required to mark the
 * commodity information as deleted. The commodity information is not deleted but is marked for deletion. The
 * commodity marked for deletion can be retrieved but not updated when the end date exists.
 * <p>
 * <code>CommodityDeleteRequest</code> holds the following attributes:
 * <ul>
 * <code>
 * <li>commodityCode
 * <li>commodityType
 * <li>deletionDate
 * <li>oId
 * </code>
 * </ul>
 */
public class CommodityDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8061372848388830420L;

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
     * Attribute to hold <code>deleteDate</code> property.
     * <p>
     * End date of the commodity during ‘delete’ action. Mandatory for ‘delete’ action. The End Date must be
     * today or later.
     */
    private Date deletionDate;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique Key for Commodity to be deleted.
     */
    private Long oId;

    /**
     * Default constructor.
     */
    public CommodityDeleteRequest() {

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
     * Gets the <code>deletionDate</code> property.
     * <p>
     * Represents the value of the <code>endDate</code> to check whether the commodity is marked for deletion.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @return the current value of the <code>deletionDate</code> property.<br>
     */
    public final Date getDeletionDate() {
        return ContractUtility.getClonedDate(this.deletionDate);
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
     * Sets the <code>deletionDate</code> property.
     * <p>
     * Represents the value of the <code>endDate</code> to check whether the commodity is marked for deletion.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @param pDeletionDate the new value of the <code>deletionDate</code>property.<br>
     */
    public final void setDeletionDate(final Date pDeletionDate) {
        this.deletionDate = ContractUtility.getClonedDate(pDeletionDate);
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
