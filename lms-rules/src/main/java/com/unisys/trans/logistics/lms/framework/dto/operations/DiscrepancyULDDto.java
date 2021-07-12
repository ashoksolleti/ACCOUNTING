/* ====================================== */
/* Copyright (c) 2016 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.DiscrepancyType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>DiscrepancyULDDto</code> class represents the DiscrepancyULD information.
 * 
 */
public class DiscrepancyULDDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>discrepancyStatus</code> property.
     */
    private DiscrepancyType discrepancyStatus;

    /**
     * Attribute to hold <code>remarks</code> property.
     */
    private String remarks;

    /**
     * Attribute to hold <code>creationTimeStamp</code> property.
     */
    private Date creationTimeStamp;

    /**
     * Attribute to hold <code>discrepancyStation</code> property.
     */
    private String discrepancyStation;

    /**
     * Attribute to hold <code>discrepancyLocation</code> property.
     */
    private String discrepancyLocation;

    /**
     * Attribute to hold <code>discrepancyFlightDdate</code> property.
     */
    private Date discrepancyFlightDate;

    /**
     * Attribute to hold <code>DiscrepancyFlight</code> property.
     */
    private BaseFlightDto discrepancyFlight = new BaseFlightDto();

    /**
     * Attribute to hold <code>DiscrepancyOffload</code> property.
     */
    private OffloadDto discrepancyOffload = new OffloadDto();

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>weight</code> property.
     */
    private BigDecimal weight;

    
    private String discrepancyStatusType;
    /**
     * Gets the <code>CreationTimeStamp</code> property.
     * <p>
     * 
     * @return the current value of the <code>CreationTimeStamp</code> property.<br>
     */
    public Date getCreationTimeStamp() {
        return ContractUtility.getClonedDate(this.creationTimeStamp);
    }

    /**
     * Gets the <code>DiscrepancyFlight</code> property.
     * <p>
     * 
     * @return the current value of the <code>DiscrepancyFlight</code> property.<br>
     */
    public BaseFlightDto getDiscrepancyFlight() {
        return this.discrepancyFlight;
    }

    /**
     * Gets the <code>DiscrepancyFlightDdate</code> property.
     * <p>
     * 
     * @return the current value of the <code>DiscrepancyFlightDdate</code> property.<br>
     */
    public Date getDiscrepancyFlightDate() {
        return ContractUtility.getClonedDate(this.discrepancyFlightDate);
    }

    /**
     * Gets the <code>DiscrepancyLocation</code> property.
     * <p>
     * 
     * @return the current value of the <code>DiscrepancyLocation</code> property.<br>
     */
    public String getDiscrepancyLocation() {
        return this.discrepancyLocation;
    }

    /**
     * Gets the <code>DiscrepancyOffload</code> property.
     * <p>
     * 
     * @return the current value of the <code>DiscrepancyOffload</code> property.<br>
     */
    public OffloadDto getDiscrepancyOffload() {
        return this.discrepancyOffload;
    }

    /**
     * Gets the <code>DiscrepancyStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>DiscrepancyStation</code> property.<br>
     */
    public String getDiscrepancyStation() {
        return this.discrepancyStation;
    }

    /**
     * Gets the <code>DiscrepancyStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>DiscrepancyStatus</code> property.<br>
     */
    public DiscrepancyType getDiscrepancyStatus() {
        return this.discrepancyStatus;
    }

    /**
     * Gets the value of the <code>oId</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>oId</code> property.
     */
    public Long getoId() {
        return this.oId;
    }

    /**
     * Gets the <code>Remarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>Remarks</code> property.<br>
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * Gets the <code>weight</code> property.
     * <p>
     * 
     * @return the current value of the <code>weight</code> property.<br>
     */
    public BigDecimal getWeight() {
        return this.weight;
    }

    /**
     * Sets the <code>CreationTimeStamp</code> property.
     * <p>
     * 
     * @param pCreationTimeStamp
     *            the current value of the <code>CreationTimeStamp</code> property.<br>
     */
    public void setCreationTimeStamp(final Date pCreationTimeStamp) {
        this.creationTimeStamp = ContractUtility.getClonedDate(pCreationTimeStamp);
    }

    /**
     * Sets the <code>DiscrepancyFlight</code> property.
     * <p>
     * 
     * @param pDiscrepancyFlight
     *            the current value of the <code>DiscrepancyFlight</code> property.<br>
     */
    public void setDiscrepancyFlight(final BaseFlightDto pDiscrepancyFlight) {
        this.discrepancyFlight = pDiscrepancyFlight;
    }

    /**
     * Sets the <code>DiscrepancyFlightDdate</code> property.
     * <p>
     * 
     * @param pDiscrepancyFlightDate
     *            the current value of the <code>DiscrepancyFlightDdate</code> property.<br>
     */
    public void setDiscrepancyFlightDate(final Date pDiscrepancyFlightDate) {
        this.discrepancyFlightDate = ContractUtility.getClonedDate(pDiscrepancyFlightDate);
    }

    /**
     * Sets the <code>DiscrepancyLocation</code> property.
     * <p>
     * 
     * @param pDiscrepancyLocation
     *            the current value of the <code>DiscrepancyLocation</code> property.<br>
     */
    public void setDiscrepancyLocation(final String pDiscrepancyLocation) {
        this.discrepancyLocation = pDiscrepancyLocation;
    }

    /**
     * Sets the <code>DiscrepancyOffload</code> property.
     * <p>
     * 
     * @param pDiscrepancyOffload
     *            the current value of the <code>DiscrepancyOffload</code> property.<br>
     */
    public void setDiscrepancyOffload(final OffloadDto pDiscrepancyOffload) {
        this.discrepancyOffload = pDiscrepancyOffload;
    }

    /**
     * Sets the <code>DiscrepancyStation</code> property.
     * <p>
     * 
     * @param pDiscrepancyStation
     *            the current value of the <code>DiscrepancyStation</code> property.<br>
     */
    public void setDiscrepancyStation(final String pDiscrepancyStation) {
        this.discrepancyStation = pDiscrepancyStation;
    }

    /**
     * Sets the <code>DiscrepancyStatus</code> property.
     * <p>
     * 
     * @param pDiscrepancyStatus
     *            the current value of the <code>DiscrepancyStatus</code> property.<br>
     */
    public void setDiscrepancyStatus(final DiscrepancyType pDiscrepancyStatus) {
        this.discrepancyStatus = pDiscrepancyStatus;
    }

    /**
     * Sets the value of the <code>oId</code> property.
     * <p>
     * 
     * @param <code>pOId</code> Holds the new value of the <code>oId</code> property.
     */
    public void setoId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>Remarks</code> property.
     * <p>
     * 
     * @param pRemarks
     *            the current value of the <code>Remarks</code> property.<br>
     */
    public void setRemarks(final String pRemarks) {
        this.remarks = pRemarks;
    }

    /**
     * Sets the <code>weight</code> property.
     * <p>
     * 
     * @param pWeight
     *            the current value of the <code>weight</code> property.<br>
     */
    public void setWeight(final BigDecimal pWeight) {
        this.weight = pWeight;
    }

    public String getDiscrepancyStatusType() {
        return discrepancyStatusType;
    }

    public void setDiscrepancyStatusType(String discrepancyStatusType) {
        this.discrepancyStatusType = discrepancyStatusType;
    }
}
