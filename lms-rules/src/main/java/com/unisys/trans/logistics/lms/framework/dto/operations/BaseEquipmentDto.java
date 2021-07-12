package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.io.Serializable;

/**
 * <code>BaseEquipmentDto</code> class represents the BaseEquipment information.
 * 
 */
public class BaseEquipmentDto implements Serializable{
   
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;


	/**
	* Attribute to hold <code>aircraftType</code> property.
	*/
	private String aircraftType;

	/**
	* Attribute to hold <code>aircraftVersion</code> property.
	*/
	private String aircraftVersion;



    /**
     * Gets the <code>AircraftType</code> property.
     * <p>
     * 
     * @return the current value of the <code>AircraftType</code> property.<br>
     */
    public String getAircraftType() {
        return this.aircraftType;
    }
	
	/**
     * Sets the <code>AircraftType</code> property.
     * <p>
     * 
     * @param pAmount
     * the current value of the <code>AircraftType</code> property.<br>
     */ 
    public void setAircraftType(final String pAircraftType) {
        this.aircraftType = pAircraftType;
    }
    /**
     * Gets the <code>AircraftVersion</code> property.
     * <p>
     * 
     * @return the current value of the <code>AircraftVersion</code> property.<br>
     */
    public String getAircraftVersion() {
        return this.aircraftVersion;
    }
	
	/**
     * Sets the <code>AircraftVersion</code> property.
     * <p>
     * 
     * @param pAmount
     * the current value of the <code>AircraftVersion</code> property.<br>
     */ 
    public void setAircraftVersion(final String pAircraftVersion) {
        this.aircraftVersion = pAircraftVersion;
    }
}
