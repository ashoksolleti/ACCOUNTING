/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.AircraftType;

/**
 * <code>DGFlightMasterSegmentDto</code> class represents the DGFlightMasterSegment information.
 * 
 */
public class DGFlightMasterSegmentDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>actionType</code> property.
     */
    private ActionType actionType;

    /**
     * Attribute to hold <code>aircraftRegistrationNumber</code> property.
     */
    private String aircraftRegistrationNumber;

    /**
     * Attribute to hold <code>aircraftType</code> property.
     */
    private AircraftType aircraftType;

    /**
     * Attribute to hold the <code>baseFlightDto</code> property.
     */
    private BaseFlightDto baseFlightDto;

    /**
     * Attribute to hold the <code>boardingStation</code> property.
     */
    private String boardingStation;

    /**
     * Attribute to hold <code>error</code> property.
     */
    private boolean error;

    /**
     * Attribute to hold the <code>flightDate</code> property.
     */
    private String flightDate;

    /**
     * Attribute to hold <code>lastUpdatedDate</code> property to display last updated date on UI.
     */
    private String lastUpdatedDate;

    /**
     * Attribute to hold <code>lastUpdatedDateTime</code> property.
     */
    private Date lastUpdatedDateTime;

    /**
     * Attribute to hold <code>lastUpdatedTime</code> property to last update time on UI.
     */
    private String lastUpdatedTime;

    /**
     * Attribute to hold <code>preparedBy</code> property.
     */
    private String preparedBy;

    /**
     * Attribute to hold <code>remarks</code> property.
     */
    private String remarks;

    /**
     * Attribute to hold <code>verifiedBy</code> property.
     */
    private String verifiedBy;

    /**
     * Gets the <code>ActionType</code> property.
     * <p>
     * 
     * @return the current value of the <code>ActionType</code> property.<br>
     */
    public ActionType getActionType() {
        return this.actionType;
    }

    /**
     * Gets the <code>AircraftRegistrationNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>AircraftRegistrationNumber</code> property.<br>
     */
    public String getAircraftRegistrationNumber() {
        return this.aircraftRegistrationNumber;
    }

    /**
     * Gets the <code>AircraftType</code> property.
     * <p>
     * 
     * @return the current value of the <code>AircraftType</code> property.<br>
     */
    public AircraftType getAircraftType() {
        return this.aircraftType;
    }

    /**
     * Gets the value of the <code>baseFlightDto</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>baseFlightDto</code> property.
     */
    public BaseFlightDto getBaseFlightDto() {
        return this.baseFlightDto;
    }

    /**
     * Gets the value of the <code>boardingStation</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>boardingStation</code> property.
     */
    public String getBoardingStation() {
        return this.boardingStation;
    }

    /**
     * Gets the <code>error</code> property.
     * <p>
     * 
     * @return the current value of the <code>error</code> property.<br>
     */
    public boolean getError() {
        return this.error;
    }

    /**
     * Gets the value of the <code>flightDate</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>flightDate</code> property.
     */
    public String getFlightDate() {
        return this.flightDate;
    }

    /**
     * Gets the <code>lastUpdatedDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>lastUpdatedDate</code> property which is used to display on UI.<br>
     */
    public final String getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * Gets the <code>lastUpdatedDateTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>lastUpdatedDateTime</code> property.<br>
     */
    public Date getLastUpdatedDateTime() {
        if(lastUpdatedDateTime!=null){
            return (Date)lastUpdatedDateTime.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Gets the <code>LastUpdatedDateTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>lastUpdatedTime</code> property.<br>
     */
    public final String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Gets the <code>PreparedBy</code> property.
     * <p>
     * 
     * @return the current value of the <code>PreparedBy</code> property.<br>
     */
    public String getPreparedBy() {
        return this.preparedBy;
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
     * Gets the <code>VerifiedBy</code> property.
     * <p>
     * 
     * @return the current value of the <code>VerifiedBy</code> property.<br>
     */
    public String getVerifiedBy() {
        return this.verifiedBy;
    }

    /**
     * Sets the <code>ActionType</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ActionType</code> property.<br>
     */
    public void setActionType(final ActionType actionType) {
        this.actionType = actionType;
    }

    /**
     * Sets the <code>AircraftRegistrationNumber</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>AircraftRegistrationNumber</code> property.<br>
     */
    public void setAircraftRegistrationNumber(final String pAircraftRegistrationNumber) {
        this.aircraftRegistrationNumber = pAircraftRegistrationNumber;
    }

    /**
     * Sets the <code>AircraftType</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>AircraftType</code> property.<br>
     */
    public void setAircraftType(final AircraftType pAircraftType) {
        this.aircraftType = pAircraftType;
    }

    /**
     * Sets the value of the <code>baseFlightDto</code> property.
     * <p>
     * 
     * @param <code>pBaseFlightDto</code> Holds the new value of the <code>baseFlightDto</code> property.
     */
    public void setBaseFlightDto(final BaseFlightDto pBaseFlightDto) {
        this.baseFlightDto = pBaseFlightDto;
    }

    /**
     * Sets the value of the <code>boardingStation</code> property.
     * <p>
     * 
     * @param <code>pBoardingStation</code> Holds the new value of the <code>boardingStation</code> property.
     */
    public void setBoardingStation(final String pBoardingStation) {
        this.boardingStation = pBoardingStation;
    }

    /**
     * Sets the <code>error</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>error</code> property.<br>
     */
    public void setError(final boolean error) {
        this.error = error;
    }

    /**
     * Sets the value of the <code>flightDate</code> property.
     * <p>
     * 
     * @param <code>pFlightDate</code> Holds the new value of the <code>flightDate</code> property.
     */
    public void setFlightDate(final String pFlightDate) {
        this.flightDate = pFlightDate;
    }

    /**
     * Sets the <code>LastUpdatedDateTime</code> property.
     * <p>
     * 
     * @param lastUpdatedDate the current value of the <code>LastUpdatedDateTime</code> property which is
     *            used to display on UI.<br>
     */
    public final void setLastUpdatedDate(final String pLastUpdatedDate) {
        this.lastUpdatedDate = pLastUpdatedDate;
    }

    /**
     * Sets the <code>LastUpdatedDateTime</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>LastUpdatedDateTime</code> property.<br>
     */
    public void setLastUpdatedDateTime(final Date pLastUpdatedDateTime) {
        if(pLastUpdatedDateTime!=null){
        	this.lastUpdatedDateTime =(Date) pLastUpdatedDateTime.clone();
          }
        else
        {
        	this.lastUpdatedDateTime=null;
        }
    }

    /**
     * Sets the <code>ActionType</code> property.
     * <p>
     * 
     * @param pLastUpdatedTime
     *            the current value of the <code>Last Updated Time</code> property.<br>
     */
    public final void setLastUpdatedTime(final String pLastUpdatedTime) {
        this.lastUpdatedTime = pLastUpdatedTime;
    }

    /**
     * Sets the <code>PreparedBy</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>PreparedBy</code> property.<br>
     */
    public void setPreparedBy(final String pPreparedBy) {
        this.preparedBy = pPreparedBy;
    }

    /**
     * Sets the <code>Remarks</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>Remarks</code> property.<br>
     */
    public void setRemarks(final String pRemarks) {
        this.remarks = pRemarks;
    }

    /**
     * Sets the <code>VerifiedBy</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>VerifiedBy</code> property.<br>
     */
    public void setVerifiedBy(final String pVerifiedBy) {
        this.verifiedBy = pVerifiedBy;
    }

}
