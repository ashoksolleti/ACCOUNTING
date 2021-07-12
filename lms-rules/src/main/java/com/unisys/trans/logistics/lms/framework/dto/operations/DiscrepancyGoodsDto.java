package com.unisys.trans.logistics.lms.framework.dto.operations;

/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.constants.operation.DiscrepancyType;

/**
 * <code>DiscrepancyGoodsDto</code> class represents the DiscrepancyGoods information.
 * <p>
 * This contains the following attributes:<br/>
 * <li><code>candidateBookingSegmentDtos</code></li>
 * <li><code>containerDto</code></li>
 * <li><code>creationTimeStamp</code></li>
 * <li><code>discrepancyRemarks</code></li>
 * <li><code>discrepancyStation</code></li>
 * <li><code>discrepancyStatus</code></li>
 * <li><code>goodsSpecialHandlingCode</code></li>
 * <li><code>houseGoods</code></li>
 * <li><code>inBoundDetailsDto</code></li>
 * <li><code>oId</code></li>
 * <li><code>operationFlightSegmentDto</code></li>
 * <li><code>serialVersionUID</code></li>
 * <li><code>shipmentDto</code></li>
 * <p>
 * 
 * @see com.unisys.trans.logistics.lms.framework.dto.constants.operation.DiscrepancyType
 * 
 * @author Unisys
 * @version 1.0
 * @since 1.0
 */
public class DiscrepancyGoodsDto extends GoodsDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>discrepancyRemarks</code> property.
     */
    private String discrepancyRemarks;

    /**
     * Attribute to hold <code>count</code> property.
     */
    private int count;

    /**
     * Attribute to hold <code>discrepancyStatus</code> property.
     */
    private DiscrepancyType discrepancyStatus;

    /**
     * Attribute to hold <code>discrepancyStation</code> property.
     */
    private String discrepancyStation;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>creationTimeStamp</code> property.
     */
    private Date creationTimeStamp;

    private List<FADMessageDetailsDto> fadMessageDetails;

    /**
     * Gets the <code>DiscrepancyRemarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>DiscrepancyRemarks</code> property.<br>
     */
    public String getDiscrepancyRemarks() {
        return this.discrepancyRemarks;
    }

    /**
     * Sets the <code>DiscrepancyRemarks</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>DiscrepancyRemarks</code> property.<br>
     */
    public void setDiscrepancyRemarks(final String pDiscrepancyRemarks) {
        this.discrepancyRemarks = pDiscrepancyRemarks;
    }

    /**
     * Gets the value of the <code>discrepancyStation</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>discrepancyStation</code> property.
     */
    public String getDiscrepancyStation() {
        return discrepancyStation;
    }

    /**
     * Sets the value of the <code>discrepancyStation</code> property.
     * <p>
     * 
     * @param <code>discrepancyStation</code> Holds the new value of the <code>discrepancyStation</code>
     *        property.
     */
    public void setDiscrepancyStation(String discrepancyStation) {
        this.discrepancyStation = discrepancyStation;
    }

    /**
     * Gets the <code>discrepancyStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>discrepancyStatus</code> property.<br>
     */
    public DiscrepancyType getDiscrepancyStatus() {
        return discrepancyStatus;
    }

    /**
     * Sets the <code>discrepancyStatus</code> property.
     * <p>
     * 
     * @param discrepancyStatus
     *            the current value of the <code>discrepancyStatus</code> property.<br>
     */
    public void setDiscrepancyStatus(DiscrepancyType discrepancyStatus) {
        this.discrepancyStatus = discrepancyStatus;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>OId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>OId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Gets the <code>CreationTimeStamp</code> property.
     * <p>
     * 
     * @return the current value of the <code>CreationTimeStamp</code> property.<br>
     */
    public Date getCreationTimeStamp() {
        if(this.creationTimeStamp!=null){
            return (Date)this.creationTimeStamp.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Sets the <code>CreationTimeStamp</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>CreationTimeStamp</code> property.<br>
     */
    public void setCreationTimeStamp(final Date pCreationTimeStamp) {
        if(pCreationTimeStamp!=null){
        	this.creationTimeStamp =(Date) pCreationTimeStamp.clone();
          }
        else
        {
        	this.creationTimeStamp=null;
        }
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Gets the value of the <code>fadMessageDetails</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>fadMessageDetails</code> property.
     */
    public List<FADMessageDetailsDto> getFadMessageDetails() {
        return fadMessageDetails;
    }

    /**
     * Sets the value of the <code>fadMessageDetails</code> property.
     * <p>
     * 
     * @param <code>fadMessageDetails</code> Holds the new value of the <code>fadMessageDetails</code>
     *        property.
     */
    public void setFadMessageDetails(List<FADMessageDetailsDto> fadMessageDetails) {
        this.fadMessageDetails = fadMessageDetails;
    }
}