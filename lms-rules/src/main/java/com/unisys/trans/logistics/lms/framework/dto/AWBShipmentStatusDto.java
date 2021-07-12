package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ShipmentStatusDto</code> contains specific data applicable to the Shipment Status.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>eventDateTime
 * <li>eventTimeStamp
 * <li>oId
 * <li>shipmentStatus
 * <li>updateStation
 * </ul>
 * </code>
 */

public class AWBShipmentStatusDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 4140070441756220896L;

    /**
     * Attribute to hold <code>eventDateTime</code> property.
     */
    private Date eventDateTime;

    /**
     * Attribute to hold <code>eventTimeStamp</code> property.
     */
    private long eventTimeStamp;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    public AirWaybillDto getAirWaybillDto() {
		return airWaybillDto;
	}

	public void setAirWaybillDto(AirWaybillDto airWaybillDto) {
		this.airWaybillDto = airWaybillDto;
	}

	public void setEventDateTime(Date eventDateTime) {
		this.eventDateTime = eventDateTime;
	}

	public void setoId(Long oId) {
		this.oId = oId;
	}

	/**
     * Attribute to hold <code>shipmentStatus</code> property.
     */
    private String shipmentStatus;
    /**
     * Attribute to hold <code>shipmentStatus</code> property.
     */
    private AirWaybillDto airWaybillDto;
    /**
     * Attribute to hold <code>updateStation</code> property.
     */
    private String updateStation;

    /**
     * Gets the <code>eventDateTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>eventDateTime</code> property
     */
    public Date getEventDateTime() {

        if (this.eventTimeStamp > 0) {

            this.eventDateTime = new Date(this.eventTimeStamp);
        }
        return ContractUtility.getClonedDate(this.eventDateTime);
    }

    /**
     * Gets the <code>eventTimeStamp</code> property.
     * <p>
     * 
     * @return the current value of the <code>eventTimeStamp</code> property
     */
    public long getEventTimeStamp() {
        return this.eventTimeStamp;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property
     */
    
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>shipmentStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>shipmentStatus</code> property
     */
    public String getShipmentStatus() {
        return this.shipmentStatus;
    }

    /**
     * Gets the <code>updateStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>updateStation</code> property
     */
    public String getUpdateStation() {
        return this.updateStation;
    }

    /**
     * Sets the <code>eventTimeStamp</code> property.
     * <p>
     * 
     * @param pEventTimeStamp
     *            the new value of the <code>eventTimeStamp</code> property
     */
    public void setEventTimeStamp(final long pEventTimeStamp) {
        this.eventTimeStamp = pEventTimeStamp;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>shipmentStatus</code> property.
     * <p>
     * 
     * @param pShipmentStatus
     *            the new value of the <code>shipmentStatus</code> property
     */
    public void setShipmentStatus(final String pShipmentStatus) {
        this.shipmentStatus = pShipmentStatus;
    }

    /**
     * Sets the <code>updateStation</code> property.
     * <p>
     * 
     * @param pUpdateStation
     *            the new value of the <code>updateStation</code> property
     */
    public void setUpdateStation(final String pUpdateStation) {
        this.updateStation = pUpdateStation;
    }

}
