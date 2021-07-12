/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.preferences;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>ControlReceiptDto</code> class represents the ControlReceipt
 * information.
 * 
 */
public class ControlReceiptPreferencesDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>accountingSentDate</code> property.
     */
    private Date accountingSentDate;

    /**
     * Attribute to hold the <code>accountNumber</code> object.
     */
    private String accountNumber;

    /**
     * Attribute to hold the <code>airlineCodeNumber</code> object.
     */
    private String airlineCodeNumber;

    /**
     * Attribute to hold the <code>chargePerDay</code> object.
     */
    private BigDecimal chargePerDay;

    /**
     * Attribute to hold the <code>checkInDate</code> object.
     */
    private Date checkInDate;

    /**
     * Attribute to hold the <code>checkOutDate</code> object.
     */
    private Date checkOutDate;

    /**
     * Attribute to hold <code>conditionCode</code> property.
     */
    private String conditionCode;

    /**
     * Attribute to hold the <code>controlReceiptNumber</code> object.
     */
    private String controlReceiptNumber;

    /**
     * Attribute to hold the <code>demurageChargedDays</code> object.
     */
    private Integer demurageChargedDays;

    /**
     * Attribute to hold the <code>demurrageBeginDate</code> object.
     */
    private Date demurrageBeginDate;

    /**
     * Attribute to hold <code>demurrageCharges</code> property.
     */
    private BigDecimal demurrageCharges;

    /**
     * Attribute to hold <code>destination</code> property.
     */
    private String destination;

    /**
     * Attribute to hold the <code>excessDays</code> object.
     */
    private Integer excessDays;

    /**
     * Attribute to hold the <code>fromCarrierCode</code> object.
     */
    private String fromCarrierCode;

    /**
     * Attribute to hold the <code>oId</code> object.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>otherCharges</code> object.
     */
    private BigDecimal otherCharges;

    /**
     * Attribute to hold <code>ownerCode</code> property.
     */
    private String ownerCode;

    /**
     * Attribute to hold <code>reason</code> property.
     */
    private String reason;

    /**
     * Attribute to hold the <code>releasedAirWaybill</code> object.
     */
    private String releasedAirWaybill;

    /**
     * Attribute to hold the <code>releasedDoors</code> object.
     */
    private Integer releasedDoors;

    /**
     * Attribute to hold the <code>releasedFeetings</code> object.
     */
    private Integer releasedFeetings;

    /**
     * Attribute to hold the <code>releasedNets</code> object.
     */
    private Integer releasedNets;

    /**
     * Attribute to hold the <code>releasedState</code> object.
     */
    private String releasedState;

    /**
     * Attribute to hold the <code>releasedStraps</code> object.
     */
    private Integer releasedStraps;

    /**
     * Attribute to hold <code>releasedToAccounting</code> property.
     */
    private Integer releasedToAccounting;

    /**
     * Attribute to hold the <code>remarks</code> object.
     */
    private String remarks;

    /**
     * Attribute to hold the <code>returnedAirWaybill</code> object.
     */
    private String returnedAirWaybill;

    /**
     * Attribute to hold the <code>returnedDoors</code> object.
     */
    private Integer returnedDoors;

    /**
     * Attribute to hold the <code>returnedFeetings</code> object.
     */
    private Integer returnedFeetings;

    /**
     * Attribute to hold the <code>returnedNets</code> object.
     */
    private Integer returnedNets;

    /**
     * Attribute to hold the <code>returnedState</code> object.
     */
    private String returnedState;

    /**
     * Attribute to hold the <code>returnedStraps</code> object.
     */
    private Integer returnedStraps;

    /**
     * Attribute to hold <code>serialNo</code> property.
     */
    private String serialNo;

    /**
     * Attribute to hold the <code>stationOfTransfer</code> object.
     */
    private String stationOfTransfer;

    /**
     * Attribute to hold the <code>toCarrierCode</code> object.
     */
    private String toCarrierCode;

    /**
     * Attribute to hold the <code>totalCharges</code> object.
     */
    private BigDecimal totalCharges;

    /**
     * Attribute to hold the <code>totalDemurrageCharge</code> object.
     */
    private BigDecimal totalDemurrageCharge;

    /**
     * Attribute to hold the <code>transferDate</code> object.
     */
    private Date transferDate;

    /**
     * Attribute to hold the <code>transferTime</code> object.
     */
    private String transferTime;

    /**
     * Attribute to hold the <code>uldIdentifier</code> object.
     */
    private String uldIdentifier;

    /**
     * Attribute to hold <code>uldPrefix</code> property.
     */
    private String uldPrefix;

    public Date getAccountingSentDate() {
        if(this.accountingSentDate!=null){
            return (Date)this.accountingSentDate.clone();
            }
            else{
                return null;
            }
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAirlineCodeNumber() {
        return this.airlineCodeNumber;
    }

    public BigDecimal getChargePerDay() {
        return this.chargePerDay;
    }

    public Date getCheckInDate() {
        if(this.checkInDate!=null){
            return (Date)this.checkInDate.clone();
            }
            else{
                return null;
            }
    }

    public Date getCheckOutDate() {
        if(this.checkOutDate!=null){
            return (Date)this.checkOutDate.clone();
            }
            else{
                return null;
            }
    }

    public String getConditionCode() {
        return this.conditionCode;
    }

    public String getControlReceiptNumber() {
        return this.controlReceiptNumber;
    }

    public Integer getDemurageChargedDays() {
        return this.demurageChargedDays;
    }

    public Date getDemurrageBeginDate() {
        if(this.demurrageBeginDate!=null){
            return (Date)this.demurrageBeginDate.clone();
            }
            else{
                return null;
            }
    }

    public BigDecimal getDemurrageCharges() {
        return this.demurrageCharges;
    }

    public String getDestination() {
        return this.destination;
    }

    public Integer getExcessDays() {
        return this.excessDays;
    }

    public String getFromCarrierCode() {
        return this.fromCarrierCode;
    }

    public Long getoId() {
        return this.oId;
    }

    @Override
    public Long getOId() {
        return this.oId;
    }

    public BigDecimal getOtherCharges() {
        return this.otherCharges;
    }

    public String getOwnerCode() {
        return this.ownerCode;
    }

    public String getReason() {
        return this.reason;
    }

    public String getReleasedAirWaybill() {
        return this.releasedAirWaybill;
    }

    public Integer getReleasedDoors() {
        return this.releasedDoors;
    }

    public Integer getReleasedFeetings() {
        return this.releasedFeetings;
    }

    public Integer getReleasedNets() {
        return this.releasedNets;
    }

    public String getReleasedState() {
        return this.releasedState;
    }

    public Integer getReleasedStraps() {
        return this.releasedStraps;
    }

    public Integer getReleasedToAccounting() {
        return this.releasedToAccounting;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getReturnedAirWaybill() {
        return this.returnedAirWaybill;
    }

    public Integer getReturnedDoors() {
        return this.returnedDoors;
    }

    public Integer getReturnedFeetings() {
        return this.returnedFeetings;
    }

    public Integer getReturnedNets() {
        return this.returnedNets;
    }

    public String getReturnedState() {
        return this.returnedState;
    }

    public Integer getReturnedStraps() {
        return this.returnedStraps;
    }

    public String getSerialNo() {
        return this.serialNo;
    }

    public String getStationOfTransfer() {
        return this.stationOfTransfer;
    }

    public String getToCarrierCode() {
        return this.toCarrierCode;
    }

    public BigDecimal getTotalCharges() {
        return this.totalCharges;
    }

    public BigDecimal getTotalDemurrageCharge() {
        return this.totalDemurrageCharge;
    }

    public Date getTransferDate() {
        if(this.transferDate!=null){
            return (Date)this.transferDate.clone();
            }
            else{
                return null;
            }
    }

    public String getTransferTime() {
        return this.transferTime;
    }

    public String getUldIdentifier() {
        return this.uldIdentifier;
    }

    public String getUldPrefix() {
        return this.uldPrefix;
    }

    public void setAccountingSentDate(final Date accountingSentDate) {
        if(accountingSentDate!=null){
        	this.accountingSentDate =(Date) accountingSentDate.clone();
          }  
        else
        {
        	this.accountingSentDate=null;
        }
    }

    public void setAccountNumber(final String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAirlineCodeNumber(final String airlineCodeNumber) {
        this.airlineCodeNumber = airlineCodeNumber;
    }

    public void setChargePerDay(final BigDecimal chargePerDay) {
        this.chargePerDay = chargePerDay;
    }

    public void setCheckInDate(final Date checkInDate) {
        if(checkInDate!=null){
        	this.checkInDate =(Date) checkInDate.clone();
          }
        else
        {
        	this.checkInDate=null;
        }
    }

    public void setCheckOutDate(final Date checkOutDate) {
        if(checkOutDate!=null){
        	this.checkOutDate =(Date) checkOutDate.clone();
          }
        else
        {
        	this.checkOutDate=null;
        }
    }

    public void setConditionCode(final String conditionCode) {
        this.conditionCode = conditionCode;
    }

    public void setControlReceiptNumber(final String controlReceiptNumber) {
        this.controlReceiptNumber = controlReceiptNumber;
    }

    public void setDemurageChargedDays(final Integer demurageChargedDays) {
        this.demurageChargedDays = demurageChargedDays;
    }

    public void setDemurrageBeginDate(final Date demurrageBeginDate) {
        if(demurrageBeginDate!=null){
        	this.demurrageBeginDate =(Date) demurrageBeginDate.clone();
          }  
        else
        {
        	this.demurrageBeginDate=null;
        }
    }

    public void setDemurrageCharges(final BigDecimal demurrageCharges) {
        this.demurrageCharges = demurrageCharges;
    }

    public void setDestination(final String destination) {
        this.destination = destination;
    }

    public void setExcessDays(final Integer excessDays) {
        this.excessDays = excessDays;
    }

    public void setFromCarrierCode(final String fromCarrierCode) {
        this.fromCarrierCode = fromCarrierCode;
    }

    public void setoId(final Long oId) {
        this.oId = oId;
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

    public void setOtherCharges(final BigDecimal otherCharges) {
        this.otherCharges = otherCharges;
    }

    public void setOwnerCode(final String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public void setReleasedAirWaybill(final String releasedAirWaybill) {
        this.releasedAirWaybill = releasedAirWaybill;
    }

    public void setReleasedDoors(final Integer releasedDoors) {
        this.releasedDoors = releasedDoors;
    }

    public void setReleasedFeetings(final Integer releasedFeetings) {
        this.releasedFeetings = releasedFeetings;
    }

    public void setReleasedNets(final Integer releasedNets) {
        this.releasedNets = releasedNets;
    }

    public void setReleasedState(final String releasedState) {
        this.releasedState = releasedState;
    }

    public void setReleasedStraps(final Integer releasedStraps) {
        this.releasedStraps = releasedStraps;
    }

    public void setReleasedToAccounting(final Integer releasedToAccounting) {
        this.releasedToAccounting = releasedToAccounting;
    }

    public void setRemarks(final String remarks) {
        this.remarks = remarks;
    }

    public void setReturnedAirWaybill(final String returnedAirWaybill) {
        this.returnedAirWaybill = returnedAirWaybill;
    }

    public void setReturnedDoors(final Integer returnedDoors) {
        this.returnedDoors = returnedDoors;
    }

    public void setReturnedFeetings(final Integer returnedFeetings) {
        this.returnedFeetings = returnedFeetings;
    }

    public void setReturnedNets(final Integer returnedNets) {
        this.returnedNets = returnedNets;
    }

    public void setReturnedState(final String returnedState) {
        this.returnedState = returnedState;
    }

    public void setReturnedStraps(final Integer returnedStraps) {
        this.returnedStraps = returnedStraps;
    }

    public void setSerialNo(final String serialNo) {
        this.serialNo = serialNo;
    }

    public void setStationOfTransfer(final String stationOfTransfer) {
        this.stationOfTransfer = stationOfTransfer;
    }

    public void setToCarrierCode(final String toCarrierCode) {
        this.toCarrierCode = toCarrierCode;
    }

    public void setTotalCharges(final BigDecimal totalCharges) {
        this.totalCharges = totalCharges;
    }

    public void setTotalDemurrageCharge(final BigDecimal totalDemurrageCharge) {
        this.totalDemurrageCharge = totalDemurrageCharge;
    }

    public void setTransferDate(final Date transferDate) {
        if(transferDate!=null){
        	this.transferDate =(Date) transferDate.clone();
          } 
        else
        {
        	this.transferDate=null;
        }
    }

    public void setTransferTime(final String transferTime) {
        this.transferTime = transferTime;
    }

    public void setUldIdentifier(final String uldIdentifier) {
        this.uldIdentifier = uldIdentifier;
    }

    public void setUldPrefix(final String uldPrefix) {
        this.uldPrefix = uldPrefix;
    }

}
