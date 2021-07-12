/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/**
 <code>AircraftType </code> class represents the AircraftType Information
 */
public enum AircraftType {

    /**
     * Attribute to hold <code>CARGO_AIRCRAFT<code> property
     */
    CARGO_AIRCRAFT("CARGO_AIRCRAFT"),

    /**
     * Attribute to hold <code>PASSENGER_AIRCRAFT<code> property
     */
    PASSENGER_AIRCRAFT("PASSENGER_AIRCRAFT");
    
    /**
     * Attribute to hold <code>airCraftType<code> property
     */
    private String airCraftType;
    /**
     * Default Constructor
     */
    private AircraftType(final String pAircraftType) {
        this.airCraftType = pAircraftType;
    }
     /**
     * @param pAircraftType
     * @return
     */
    public static AircraftType getAircraftType(final String pAircraftType) {

         AircraftType aAircraftType = null;

            for (final AircraftType aType : AircraftType.values()) {

                if (pAircraftType.equals(aType.value())) {
                    aAircraftType = aType;
                    break;
                }
            }
            return aAircraftType;

        }
    
     /**
     * @return
     */
    public String value() {
            return this.airCraftType;
        }
    
    
    
}