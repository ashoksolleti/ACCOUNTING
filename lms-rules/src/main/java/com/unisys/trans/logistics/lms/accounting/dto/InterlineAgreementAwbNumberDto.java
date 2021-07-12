package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class InterlineAgreementAwbNumberDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Attribute to hold <code>oId</code> property.
     * 
     */

	/**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;
	/**
     * Attribute to hold <code>airlineCodeNbr</code> property.
     */
    private String airlineCodeNbr;

    /**
     * Attribute to hold <code>modOverrideIndicator</code> property.
     */
    private String modOverrideIndicator;

    /**
     * Attribute to hold <code>shipmentReference</code> property.
     */
    private String shipmentReference;

    /**
     * Gets the <code>airlineCodeNbr</code> property.
     * <p>
     * 
     * @return the current value of the <code>airlineCodeNbr</code> property.
     */
    public String getAirlineCodeNbr() {
        return this.airlineCodeNbr;
    }

    /**
     * Gets the <code>modOverrideIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>modOverrideIndicator</code> property.
     */
    public String getModOverrideIndicator() {
        return this.modOverrideIndicator;
    }

    /**
     * Gets the <code>shipmentReference</code> property.
     * <p>
     * 
     * @return the current value of the <code>shipmentReference</code> property.
     */
    public String getShipmentReference() {
        return this.shipmentReference;
    }

    /**
     * Sets the <code>airlineCodeNbr</code>.
     * <p>
     * 
     * @param pAirlineCodeNbr
     *            holds the new value of <code>airlineCodeNbr</code>
     */
    public void setAirlineCodeNbr(final String pAirlineCodeNbr) {
        this.airlineCodeNbr =  ContractUtility.convertToUpperCase(pAirlineCodeNbr);
    }

    /**
     * Sets the <code>modOverrideIndicator</code>.
     * <p>
     * 
     * @param pModOverrideIndicator
     *            holds the new value of <code>modOverrideIndicator</code>
     */

    public void setModOverrideIndicator(final String pModOverrideIndicator) {
        this.modOverrideIndicator = ContractUtility.convertToUpperCase( pModOverrideIndicator);
    }

    /**
     * Sets the <code>shipmentReference</code>.
     * <p>
     * 
     * @param pShipmentReference
     *            holds the new value of <code>shipmentReference</code>
     */
    public void setShipmentReference(final String pShipmentReference) {
        this.shipmentReference = ContractUtility.convertToUpperCase( pShipmentReference);
    }
    
    public boolean equals (final Object pAnotherObject){
    	if (pAnotherObject==null){
    		return false;
    	}
    	AirWaybillNumberDto airWaybillNumberDto =(AirWaybillNumberDto)pAnotherObject;
    	if(this.getAirlineCodeNbr().equals(airWaybillNumberDto.getAirlineCodeNbr()) && this.getModOverrideIndicator().equals(airWaybillNumberDto.getModOverrideIndicator())
    			&& this.getShipmentReference().equals(airWaybillNumberDto.getShipmentReference())){
    		return true;
    	}
		return false;
    	
    }
    
    /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

}
