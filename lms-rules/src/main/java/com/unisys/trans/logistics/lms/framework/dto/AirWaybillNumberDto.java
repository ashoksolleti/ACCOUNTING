package com.unisys.trans.logistics.lms.framework.dto;

//@formatter:off
/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on

import java.io.Serializable;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AirWaybillNumber</code> class holds the information to define an air waybill number.
 * <p>
 * The airwaybill number of the shipment comprises of the following:
 * <ul>
 * <li>Airline code number.</li>
 * <li>modOverrideIndicator</li>
 * <li>shipmentReference</li>
 * </ul>
 * 
 * 
 */

public class AirWaybillNumberDto implements Serializable {

    /**
     * unique serial version UID.
     */
    private static final long serialVersionUID = 2469225414044614849L;

    /**
     * Attribute to hold the value of <code>airlineCodeNbr</code> property.
     */

    private String airlineCodeNbr;

    /**
     * First 7 digits of shipment reference number.
     */
    private String flightNumber;

    /**
     * Non modular 7 override indicator.
     * <ul>
     * <li>X = non mod 7</li>
     * <li>SPACE = mod 7</li>
     * </ul>
     */

    private String modOverrideIndicator;

    /**
     * First 7 digits of shipment reference number.
     */
    private String shipmentReference;

    /**
     * Attribute to hold the <code>uldInputRequired</code> property.
     */
    private boolean uldInputRequired;
    
    /**
     * Attribute to hold the <code>awbCreationDate</code> property.
     */
    private Date awbCreationDate;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * Default constructor.
     */
    public AirWaybillNumberDto() {

    }

    /**
     * Constructor with <code>SettlementMethodType</code> as an argument.
     * <p>
     * 
     * @param pAirlineCode
     *            the new value of the <code>airlineCode</code>.<br>
     * @param pShipmentReference
     *            the new value of the <code>shipmentReference</code>.<br>
     * 
     */
    public AirWaybillNumberDto(final String pAirlineCode, final String pShipmentReference) {
        this.airlineCodeNbr = pAirlineCode;
        this.shipmentReference = pShipmentReference;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null){
            return false;}
        if (this == obj){
            return true;}
        if (this.getClass() != obj.getClass()){
            return false;}
        AirWaybillNumberDto airWaybillNumberDto = (AirWaybillNumberDto) obj;
        if (this.airlineCodeNbr == null) {
            if (airWaybillNumberDto.airlineCodeNbr != null) {
                return false;
            }
        }
        else if (!this.airlineCodeNbr.equals(airWaybillNumberDto.airlineCodeNbr)) {
            return false;
        }
        if (this.shipmentReference == null) {
            if (airWaybillNumberDto.shipmentReference != null) {
                return false;
            }
        }
        else if (!this.shipmentReference.equals(airWaybillNumberDto.shipmentReference)) {
            return false;
        }
        if (this.modOverrideIndicator == null) {
            if (airWaybillNumberDto.modOverrideIndicator != null) {
                return false;
            }
        }
        else if (!this.modOverrideIndicator.equals(airWaybillNumberDto.modOverrideIndicator)) {
            return false;
        }
        if (this.flightNumber == null) {
            if (airWaybillNumberDto.flightNumber != null) {
                return false;
            }
        }
        else if (!this.flightNumber.equals(airWaybillNumberDto.flightNumber)) {
            return false;
        }
        else if (awbCreationDate != null && !this.awbCreationDate.equals(airWaybillNumberDto.awbCreationDate)) {
            return false;
        }
        return true;
    }

    /**
     * Gets the <code>airlineCodeNbr</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>airlineCodeNbr</code> property.
     */
    public String getAirlineCodeNbr() {
        return this.airlineCodeNbr;
    }

    /**
     * Gets the <code>flightNumber</code> property.
     * <p>
     * 
     * @return the current value of <code>flightNumber</code> property.
     */
    public String getFlightNumber() {
        return this.flightNumber;
    }

    /**
     * Gets the <code>modOverrideIndicator</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>modOverrideIndicator</code> property.
     */
    public String getModOverrideIndicator() {
        return this.modOverrideIndicator;
    }

    /**
     * Gets the <code>shipmentReference</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code>shipmentReference</code> property.
     */
    public String getShipmentReference() {
        return this.shipmentReference;
    }

    /**
     * Gets the <code>ShipmentReferenceWithMod</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code> aAWBNo</code> property.
     */
    public String getShipmentReferenceWithMod() {
        final StringBuffer aAWBNo = new StringBuffer();
        if (this.getShipmentReference() != null) {
            aAWBNo.append(this.getShipmentReference());
        }
        if (this.getModOverrideIndicator() != null) {
            aAWBNo.append(this.getModOverrideIndicator());
        }

        return aAWBNo.toString();
    }

    @Override
    public int hashCode() {
        return this.airlineCodeNbr.hashCode() * 13 + this.shipmentReference.hashCode() * 17
                    + (this.modOverrideIndicator != null ? 3 : 5);
    }

    /**
     * Checks whether shipment reference and an airline code are initialized.
     * 
     * @return {@code true} if both values are defined, else returns {@code false} if either of
     *         these are not present.
     * 
     */
    public boolean isNumberDefined() {

        return (this.shipmentReference == null || this.shipmentReference.isEmpty() ? false : true);
    }

    /**
     * Gets the <code>uldInputRequired</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @return the current value of <code> uldInputRequired</code> property.
     */
    public boolean isUldInputRequired() {
        return this.uldInputRequired;
    }

    /**
     * Sets the <code>airlineCodeNbr</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pAirlineCodeNbr
     *            the new value of <code>airlineCodeNbr</code> property.
     */

    public void setAirlineCodeNbr(final String pAirlineCodeNbr) {
        this.airlineCodeNbr = pAirlineCodeNbr;
    }

    /**
     * Sets the <code>flightNumber</code> property.
     * <p>
     * 
     * @param pFlightNumber
     *            the new value of <code>flightNumber</code> property.
     */
    public void setFlightNumber(final String pFlightNumber) {
        this.flightNumber = pFlightNumber;
    }

    /**
     * Sets the <code>modOverrideIndicator</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pModOverrideIndicator
     *            the new value of <code>modOverrideIndicator</code> property.
     */

    public void setModOverrideIndicator(final String pModOverrideIndicator) {
        this.modOverrideIndicator = ContractUtility.convertToUpperCase(pModOverrideIndicator);
    }

    /**
     * Sets the <code>shipmentReference</code> injected by the Inversion of
     * Control (IoC) container.
     * <p>
     * 
     * @param pShipmentReference
     *            the new value of <code>shipmentReference</code> property.
     */

    public void setShipmentReference(final String pShipmentReference) {
        this.shipmentReference = pShipmentReference;
    }

    /**
     * Sets the <code>ShipmentReferenceWithMod</code> property.
     * <p>
     * 
     * @param shipmentReferenceWithMod
     *            the new value of <code>ShipmentReferenceWithMod</code> property.
     */
    public void setShipmentReferenceWithMod(final String shipmentReferenceWithMod) {
        if (shipmentReferenceWithMod != null && !shipmentReferenceWithMod.isEmpty()) {
            final String lastChar = shipmentReferenceWithMod.substring(shipmentReferenceWithMod.length() - 1);
            if (ContractUtility.isNumber(lastChar)) {
                this.shipmentReference = shipmentReferenceWithMod;
            }
            else {
                this.shipmentReference =
                            shipmentReferenceWithMod.substring(0, shipmentReferenceWithMod.length() - 1);
                this.modOverrideIndicator = lastChar;
            }
        }
        else {
            this.shipmentReference = null;
            this.modOverrideIndicator = null;
        }
    }
    /**
     * Sets the <code>uldInputRequired</code> property.
     * <p>
     * 
     * @param pUldInputRequired
     *            the new value of <code>uldInputRequired</code> property.
     */
    public void setUldInputRequired(final boolean pUldInputRequired) {
        this.uldInputRequired = pUldInputRequired;
    }

    /**
     * Appends the <code>airlineCodeNbr</code> and <code>shipmentReference</code> and
     * <code>modOverrideIndicator</code> if present.
     */
    @Override
    public String toString() {

        final StringBuilder awbNumber = new StringBuilder();

        if (this.airlineCodeNbr != null && this.shipmentReference != null) {
            awbNumber.append(this.airlineCodeNbr + "-" + this.shipmentReference +
                        (this.modOverrideIndicator != null ? this.modOverrideIndicator : ""));
        }
        return awbNumber.toString();
    }

    /**
     * @return the oId
     */
    public Long getoId() {
        return this.oId;
    }

    /**
     * @param oId the oId to set
     */
    public void setoId(final Long pOId) {
        this.oId = pOId;
    }

	public Date getAwbCreationDate() {
		if(awbCreationDate!=null){
	    	return (Date)awbCreationDate.clone();
	        }
	        else{
	        	return null;
	        }
	}

	public void setAwbCreationDate(Date pAwbCreationDate) {
		if(pAwbCreationDate!=null){
	    	this.awbCreationDate =(Date) pAwbCreationDate.clone();
	      }
		else
		{
			this.awbCreationDate=null;
		}
	}
    
}
