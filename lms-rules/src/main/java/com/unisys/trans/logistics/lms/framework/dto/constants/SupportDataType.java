package com.unisys.trans.logistics.lms.framework.dto.constants;

public enum SupportDataType {
	
	STATION_RESTRICTION("SR","Station Restiction"),

    PARTICIPANT_CONTACT_TARGETS("PCT","Participant Contact");

    private final String codeType;

    /**
     * Attribute to holds <code> label</code> property.
     */
    private final String label;

    /**
     * Constructor with code type as an argument.
     * <p>
     * 
     * @param pCodeType holds the type code.
     * @param pLabel holds the label value.
     */
    SupportDataType(final String pCodeType, final String pLabel) {
        this.codeType = pCodeType;
        this.label = pLabel;
    }

    /**
     * Gets the value of the StationRestrictionType property.
     * 
     * @param pSupportDataType holds the station restriction value.
     * @return the current value of <code>StationRestrictionType</code>.
     */
    public static SupportDataType getSupportDataType(final String pSupportDataType) {

    	SupportDataType anSupportDataType = null;

        for (final SupportDataType aType : SupportDataType.values()) {
            if (pSupportDataType.equals(aType.getRestrictionType())) {
                anSupportDataType = aType;
                break;
            }
        }
        return anSupportDataType;
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


}
