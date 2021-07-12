package com.unisys.trans.logistics.lms.framework.constants;

public enum PowerUnitType {

    /**
     * Constant used for Acceptance.
     */
    VOLTS("V", "Volts(V)"),

    /**
     * Constant used for Warehouse.
     */
    PERCENTAGE("%", "Percentage(%)");

    /**
     * Attribute to hold the <code>powerUnit</code> property.
     */
    private String description;

    /**
     * Attribute to hold the <code>value</code> property.
     */
    private String code;

    /**
     * Parameterize constructor.
     * 
     * @param pPharmaEvent
     *            the value.
     */
    PowerUnitType(final String pCode, final String pDescription) {
        this.description = pDescription;
        this.code = pCode;
    }

    /**
     * @return the powerUnit
     */
    public String getPowerUnit() {
        return this.description;
    }
    
    /**
     * @return the value
     */
    public String getValue() {
        return this.code;
    }

    /**
     * Gives the string format of enumerated <code>PowerUnitType</code>.
     * <p>
     * 
     * @return the current string value of the <code>PowerUnitType</code>.
     */
    public String value() {
        return this.name();
    }
    
    public static PowerUnitType getPowerUnitType(final String pValue) {
        PowerUnitType powerUnitType = null;
        for(PowerUnitType powerUnit : PowerUnitType.values()) {
            if(pValue.equalsIgnoreCase(powerUnit.getPowerUnit()) || powerUnit.getPowerUnit().startsWith(pValue)) {
                powerUnitType = powerUnit;
                break;
            }
        }
        return powerUnitType;
                    
    }
}
