package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum ProrationType {

    JOINT_RATING("Joint Rating"),

    SECTOR_RATING("Sector Rating"),

    SPECIAL_PRORATE_AGREEMENT("SPA"),

    PROVISO_AGREEMENT("Proviso"),
    
    GREAT_CIRCLE_MILEAGE("Mileage"),

    PRORATE_FACTOR("Prorate Factor"),
    
    IATA_MPA_RULE("IATA MPA Rule 2.2"),
    
    NO_PRORATE_FACTOR("No Prorate Factor"),
    
    SPA_MILEAGE("SPA-FBP"),
    
	RQ("Requirement");

    /**
     * Attribute to hold the <code>val</code> property.
     */
    private String val;

    /**
     * Parameterize constructor.
     * 
     * @param pValue
     *            the value.
     */
    ProrationType(final String pValue) {
        this.val = pValue;
    }

    /**
     * Gets the <code>AccountRegionType</code>.
     * <p>
     * 
     * @param pAccountRegionType
     *            holds the new value of <code>AccountRegionType</code>
     *            <p>
     * @return the value of <code>AccountRegionType</code>
     */
    public static ProrationType getPaymentStatusType(
                final String pPaymentStatusType) {

        ProrationType aPaymentStatusType = null;

        for (final ProrationType aType : ProrationType.values()) {

            if (pPaymentStatusType.equals(aType.getVal())) {
                aPaymentStatusType = aType;
                break;
            }
        }

        return aPaymentStatusType;

    }

    /**
     * Gets the <code>val</code> property.
     * <p>
     * 
     * @return the current value of the <code>val</code> property.
     */
    public String getVal() {
        return this.val;
    }

    /**
     * Sets the <code>val</code> property.
     * <p>
     * 
     * @param pVal the new value of the <code>val</code> property.
     */
    public void setVal(final String pVal) {
        this.val = pVal;
    }

    /**
     * Gives the string format of enumerated <code>AccountRegionType</code>.
     * <p>
     * 
     * @return the current value of the <code>AccountRegionType</code>
     */
    public String value() {
        return this.name();
    }

}
