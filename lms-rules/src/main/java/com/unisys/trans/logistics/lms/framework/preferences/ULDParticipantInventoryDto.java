/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.preferences;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ControlReceiptDto</code> class represents the ControlReceipt
 * information.
 * 
 */
public class ULDParticipantInventoryDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>oId</code> object.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>checkInDate</code> object.
     */
    private Date checkInDate;

    /**
     * Attribute to hold the <code>checkOutDate</code> object.
     */
    private Date checkOutDate;

    /**
     * Attribute to hold the <code>controlReceiptNumber</code> object.
     */
    private String controlReceiptNumber;

    /**
     * Attribute to hold the <code>participantOId</code> object.
     */
    private Long participantOId;

    /**
     * Attribute to hold the <code>toCarrierCode</code> object.
     */
    private String toCarrierCode;

    /**
     * Attribute to hold the <code>fromCarrierCode</code> object.
     */
    private String fromCarrierCode;

    /**
     * Attribute to hold the <code>stationOfTransfer</code> object.
     */
    private String stationOfTransfer;

    /**
     * Attribute to hold the <code>remarks</code> object.
     */
    private String remarks;

    /**
     * Attribute to hold <code>ownerCarrierCode</code> property.
     */
    private String ownerCarrierCode;

    /**
     * Attribute to hold <code>uldPrefix</code> property.
     */
    private String uldPrefix;

    /**
     * Attribute to hold <code>serialNumber</code> property.
     */
    private String serialNumber;

    /**
     * Attribute to hold <code>destination</code> property.
     */
    private String destination;
    /**
     * Attribute to hold <code>destination</code> property.
     */
    private String movementStatus;

    /**
     * Attribute to hold <code>destination</code> property.
     */
    private Date movementStatusDateAndTime;
    
    private String flightDate;
    
    private String location;
    
    private String condition;
    
    private String groupNumber;
    
    private String flightNumber;
    
    private String stationCode;

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getoId() {
        return oId;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>oId</code> property.<br>
     */
    public void setoId(Long oId) {
        this.oId = oId;
    }

    /**
     * Gets the <code>CheckInDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>CheckInDate</code> property.<br>
     */
    public Date getCheckInDate() {
        return ContractUtility.getClonedDate(this.checkInDate);
    }

    /**
     * Sets the <code>CheckInDate</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>CheckInDate</code> property.<br>
     */
    public void setCheckInDate(final Date pCheckInDate) {
        this.checkInDate = ContractUtility.getClonedDate(pCheckInDate);
    }

    /**
     * Gets the <code>CheckOutDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>CheckOutDate</code> property.<br>
     */
    public Date getCheckOutDate() {
        return ContractUtility.getClonedDate(this.checkOutDate);
    }

    /**
     * Sets the <code>CheckOutDate</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>CheckOutDate</code> property.<br>
     */
    public void setCheckOutDate(final Date pCheckOutDate) {
        this.checkOutDate = ContractUtility.getClonedDate(pCheckOutDate);
    }

    /**
     * Gets the <code>ControlReceiptNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>ControlReceiptNumber</code> property.<br>
     */
    public String getControlReceiptNumber() {
        return this.controlReceiptNumber;
    }

    /**
     * Sets the <code>ControlReceiptNumber</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ControlReceiptNumber</code> property.<br>
     */
    public void setControlReceiptNumber(final String pControlReceiptNumber) {
        this.controlReceiptNumber = pControlReceiptNumber;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @return the participantOId
     */
    public Long getParticipantOId() {
        return participantOId;
    }

    /**
     * @param participantOId the participantOId to set
     */
    public void setParticipantOId(Long participantOId) {
        this.participantOId = participantOId;
    }

    /**
     * @return the toCarrierCode
     */
    public String getToCarrierCode() {
        return toCarrierCode;
    }

    /**
     * @param toCarrierCode the toCarrierCode to set
     */
    public void setToCarrierCode(String toCarrierCode) {
        this.toCarrierCode = toCarrierCode;
    }

    /**
     * @return the fromCarrierCode
     */
    public String getFromCarrierCode() {
        return fromCarrierCode;
    }

    /**
     * @param fromCarrierCode the fromCarrierCode to set
     */
    public void setFromCarrierCode(String fromCarrierCode) {
        this.fromCarrierCode = fromCarrierCode;
    }

    /**
     * @return the stationOfTransfer
     */
    public String getStationOfTransfer() {
        return stationOfTransfer;
    }

    /**
     * @param stationOfTransfer the stationOfTransfer to set
     */
    public void setStationOfTransfer(String stationOfTransfer) {
        this.stationOfTransfer = stationOfTransfer;
    }

    /**
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks the remarks to set
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return the ownerCarrierCode
     */
    public String getOwnerCarrierCode() {
        return ownerCarrierCode;
    }

    /**
     * @param ownerCarrierCode the ownerCarrierCode to set
     */
    public void setOwnerCarrierCode(String ownerCarrierCode) {
        this.ownerCarrierCode = ownerCarrierCode;
    }

    /**
     * @return the uldPrefix
     */
    public String getUldPrefix() {
        return uldPrefix;
    }

    /**
     * @param uldPrefix the uldPrefix to set
     */
    public void setUldPrefix(String uldPrefix) {
        this.uldPrefix = uldPrefix;
    }

    /**
     * @return the serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }


    /**
     * @return the movementStatus
     */
    public String getMovementStatus() {
        return movementStatus;
    }

    /**
     * @param movementStatus the movementStatus to set
     */
    public void setMovementStatus(String movementStatus) {
        this.movementStatus = movementStatus;
    }

    /**
     * @return the movementStatusDateAndTime
     */
    public Date getMovementStatusDateAndTime() {
        return ContractUtility.getClonedDate(movementStatusDateAndTime);
    }

    /**
     * @param movementStatusDateAndTime the movementStatusDateAndTime to set
     */
    public void setMovementStatusDateAndTime(Date movementStatusDateAndTime) {
        this.movementStatusDateAndTime = ContractUtility.getClonedDate(movementStatusDateAndTime);
    }


    /**
     * @return the flightDate
     */
    public String getFlightDate() {
        return flightDate;
    }

    /**
     * @param flightDate the flightDate to set
     */
    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }


    /**
     * @return the groupNumber
     */
    public String getGroupNumber() {
        return groupNumber;
    }

    /**
     * @param groupNumber the groupNumber to set
     */
    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    /**
     * @return the flightNumber
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * @param flightNumber the flightNumber to set
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * @return the stationCode
     */
    public String getStationCode() {
        return stationCode;
    }

    /**
     * @param stationCode the stationCode to set
     */
    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    /**
     * @return the condition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * @param condition the condition to set
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    
}
