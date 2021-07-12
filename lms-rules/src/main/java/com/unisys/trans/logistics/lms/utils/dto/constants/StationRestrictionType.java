package com.unisys.trans.logistics.lms.utils.dto.constants;


/**
 * <code>RestrictionType</code> class holds the Restriciton Type that hold various type of restrictions as
 * follows: I - Import E - Export T - Transit C - Collect Charges Restriction.
 * <p>
 */
public enum StationRestrictionType {
    /**
     * Holds the collect charge type code.
     */
    COLLECTCHARGECODE("C","Collect"),
    /**
     * Holds the export type code.
     */
    EXPORTCODE("E","Export"),
    /**
     * Holds the import type code.
     */
    IMPORTCODE("I","Import"),
    /**
     * Holds the transit type code.
     */
    TRANSITCODE("T","Transit");
    /**
     * Holds the type code.
     */
    private final String codeType;
    
    private final String label;

    /**
     * Constructor with code type as an argument.
     * <p>
     * 
     * @param pCodeType holds the type code.
     */
    StationRestrictionType(final String pCodeType,final String pLabel) {
        this.codeType = pCodeType;
        this.label=pLabel;
    }

    public static StationRestrictionType getStationRestrictionType(final String pStationRestrictionType) {

        StationRestrictionType anStationRestrictionType = null;

        for (final StationRestrictionType aType : StationRestrictionType.values()) {
            if (pStationRestrictionType.equals(aType.getRestrictionType())) {
                anStationRestrictionType = aType;
                break;
            }
        }
        return anStationRestrictionType;
    }

    /**
     * Gets the <code>codeType</code> of a restriction.
     * <p>
     * Each restriction belongs to one restriction type code.
     * <p>
     * 
     * @return current value of <code>codeType</code>.
     */
    public String getRestrictionType() {
        return this.codeType;
    }

    /**
     * Gives the string format of enumerated <code>codeType</code> for a restriction.
     * <p>
     * 
     * @return the enumerated value of the <code>codeType</code>.<br>
     */
    public String value() {
        return this.name();
    }

    /**
     * Gets the <code>label</code> of a restriction.
     * <p>
     * Each label belongs to one restriction type code.
     * <p>
     * 
     * @return current value of <code>label</code>.
     */
    public String getLabel() {
        return this.label;
    }

}
