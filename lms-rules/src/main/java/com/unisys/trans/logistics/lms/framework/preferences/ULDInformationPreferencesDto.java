/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.preferences;

import java.math.BigDecimal;
import java.util.Date;


import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ControlReceiptDto</code> class represents the ControlReceipt
 * information.
 * 
 */
public class ULDInformationPreferencesDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>oId</code> object.
     */
    private Long oId;
    /**
     * Attribute to hold the <code>condition</code> object.
     */
    private String condition;

    /**
     * Attribute to hold the <code>date</code> object.
     */
    private Date date;

    /**
     * Attribute to hold the <code>time</code> object.
     */
    private String time;
    
    /**
     * Attribute to hold the <code>contents</code> object.
     */
    
    private String contents;
    
    /**
     * Attribute to hold the <code>Manufacturer</code> object.
     */
    
    private String manufacturer;

    /**
     * Attribute to hold the <code>initialEntryDate</code> object.
     */
    private Date initialEntryDate;
    /**
     * Attribute to hold the <code>groupNumber</code> object.
     */
    private String groupNumber;
    
    /**
     * Attribute to hold the <code>groupGame</code> object.
     */
    private String groupName;
    /**
     * Attribute to hold the <code>uldRemarks</code> object.
     */
    private String uldRemarks;
 
    private BigDecimal demurrageCharges;
    
    public BigDecimal getDemurrageCharges() {
		return demurrageCharges;
	}

	public void setDemurrageCharges(BigDecimal demurrageCharges) {
		this.demurrageCharges = demurrageCharges;
	}

	/**
     * Attribute to hold the <code>uldRemarks</code> object.
     */
    private String location;
    
    /**
     * Attribute to hold the <code>baseULDIdentifier</code> object.
     */
    private String baseULDIdentifier;
    
    /**
     * Attribute to hold the <code>unifiedULDIndicator</code> object.
     */
    private String unifiedULDIndicator;
    
    /**
     * Attribute to hold the <code>uldStatus</code> object.
     */
    private String uldStatus;

    /**
     * Attribute to hold <code>movementStatus</code> property.
     */
    private String movementStatus;
    
    /**
     * Attribute to hold the <code>stationFrom</code> object.
     */
    private String stationFrom;
    
    /**
     * Attribute to hold the <code>stationTo</code> object.
     */
    private String stationTo;
    /**
     * Attribute to hold the <code>flightNumber</code> object.
     */
    private String flightNumber;
    /**
     * Attribute to hold the <code>flightDate</code> object.
     */
    private Date flightDate;
    
    /**
     * Attribute to hold the <code>participantAccount</code> object.
     */
    private String participantAccount;

    /**
     * @return the participantAccount
     */
    public String getParticipantAccount() {
        return participantAccount;
    }

    /**
     * @param participantAccount the participantAccount to set
     */
    public void setParticipantAccount(String participantAccount) {
        this.participantAccount = participantAccount;
    }

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
    private Date movementStatusDateAndTime;
    
   
    
   
    
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getInitialEntryDate() {
		if(initialEntryDate!=null){
	        return (Date)initialEntryDate.clone();
	        }
	        else{
	            return null;
	        }
	}

	public void setInitialEntryDate(Date initialEntryDate) {
		if(initialEntryDate!=null){
			this.initialEntryDate =(Date) initialEntryDate.clone();
          }
        else{
        	this.initialEntryDate =null;	
        }
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getUldRemarks() {
		return uldRemarks;
	}

	public void setUldRemarks(String uldRemarks) {
		this.uldRemarks = uldRemarks;
	}

	public String getBaseULDIdentifier() {
		return baseULDIdentifier;
	}

	public void setBaseULDIdentifier(String baseULDIdentifier) {
		this.baseULDIdentifier = baseULDIdentifier;
	}

	public String getUnifiedULDIndicator() {
		return unifiedULDIndicator;
	}

	public void setUnifiedULDIndicator(String unifiedULDIndicator) {
		this.unifiedULDIndicator = unifiedULDIndicator;
	}

	public String getUldStatus() {
		return uldStatus;
	}

	public void setUldStatus(String uldStatus) {
		this.uldStatus = uldStatus;
	}

	public String getStationFrom() {
		return stationFrom;
	}

	public void setStationFrom(String stationFrom) {
		this.stationFrom = stationFrom;
	}

	public String getStationTo() {
		return stationTo;
	}

	public void setStationTo(String stationTo) {
		this.stationTo = stationTo;
	}

	public Date getFlightDate() {
		if(flightDate!=null){
	        return (Date)flightDate.clone();
	        }
	        else{
	            return null;
	        }
	}

	public void setFlightDate(Date flightDate) {
		if(flightDate!=null){
			this.flightDate =(Date) flightDate.clone();
          }
        else{
        	this.flightDate =null;	
        }
	}

	public Date getDate() {
		if(date!=null){
	        return (Date)date.clone();
	        }
	        else{
	            return null;
	        }
	}

	public void setDate(Date date) {
		if(date!=null){
			this.date =(Date) date.clone();
          }
        else{
        	this.date=null;	
        }
	}

}
