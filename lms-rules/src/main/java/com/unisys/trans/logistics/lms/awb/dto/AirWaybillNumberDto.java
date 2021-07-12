package com.unisys.trans.logistics.lms.awb.dto;

//@formatter:off
/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on

import java.io.Serializable;

/**
 * <code>AirWaybillNumber</code> class holds the information to define an air waybill number.
 * <p>
 * The air waybill number of the shipment comprises of the following:
 * <ul>
 * <li>Airline code number.</li>
 * <li>First 7 digits of shipment reference number.</li>
 * <li>Mod 7 Check Digit</li>
 * <li>Non modular 7 override indicator</li>
 * </ul>
 * 
 * 
 */

public class AirWaybillNumberDto implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 2469225414044614849L;

    /**
     * Airline Code Number
     */

    private String airlineCodeNbr;

    /**
     * First 7 digits of shipment reference number
     */

    /**
     * Modular 7 check digit
     * 
     */

    /**
     * Non modular 7 override indicator
     * <ul>
     * <li>X = non mod 7</li>
     * <li>SPACE = mod 7</li>
     * </ul>
     */

    private String modOverrideIndicator;

	/**
	 * First 7 digits of shipment reference number
	 */
	private String shipmentReference;
	
	public AirWaybillNumberDto() {
		
	}
	
	public AirWaybillNumberDto(final String pAirlineCode, final String pShipmentReference) {
		this.airlineCodeNbr = pAirlineCode;
		this.shipmentReference = pShipmentReference;
	}

	public AirWaybillNumberDto(final String pAirlineCode, final String pShipmentReference,final String pModIndicator) {
		this.airlineCodeNbr = pAirlineCode;
		this.shipmentReference = pShipmentReference;
		this.modOverrideIndicator=pModIndicator;
	}
    public String getAirlineCodeNbr() {
        return this.airlineCodeNbr;
    }

    public String getModOverrideIndicator() {
        return this.modOverrideIndicator;
    }

    public String getShipmentReference() {
        return this.shipmentReference;
    }

    public void setAirlineCodeNbr(String pAirlineCodeNbr) {
        this.airlineCodeNbr = pAirlineCodeNbr;
    }

    public void setModOverrideIndicator(String pModOverrideIndicator) {
        this.modOverrideIndicator = pModOverrideIndicator;
    }

    public void setShipmentReference(String pShipmentReference) {
       this.shipmentReference=pShipmentReference;
    }

    /**
     * Checks whether shipment reference and an airline code are initialized.
     * 
     * @return {@code true} if both values are defined, else returns {@code false} if either of
     *         these are not present
     * 
     */
    public boolean isNumberDefined() {

        return (this.shipmentReference == null || this.shipmentReference.isEmpty() ? false : true);
    }
	@Override
    public String toString() {
        
        StringBuilder awbNumber = new StringBuilder();
        
        if(this.airlineCodeNbr != null && this.shipmentReference !=null) {
            awbNumber.append(this.airlineCodeNbr+this.shipmentReference+ 
                (this.modOverrideIndicator != null ? this.modOverrideIndicator : ""));
        }
        return awbNumber.toString();
    }
}
