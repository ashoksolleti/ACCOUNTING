package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>SelectIdentifierType</code> holds the constants to indicate SelectIdentifierType applied.
 * <p>
 * Following are the possible SelectIdentifierType:<br>
 * <ul>
 * <li>RATING_NOTE -Rating Note
 * <li>CONTRACT -Contract
 * <li>SPOT_RATE - Spot Rate
 * </ul>
 */
public enum SelectIdentifierType {

    /**
     * RATING_NOTE represents Rating Note.
     */
    RATING_NOTE("R"),

    /**
     * CONTRACT represents Contract.
     */
    CONTRACT("C"),

    /**
     * SPOT_RATE represents Spot Rate.
     */
    SPOT_RATE("S");
    /**
     * Attribute to hold the <code>selectIdentifierType</code> property.
     */
    private String selectIdentifierType;

    /**
     * Parameterized Constructor.
     * 
     * @param pSelectIdentifierType
     *            holds the identifier Type.
     */
    SelectIdentifierType(final String pSelectIdentifierType) {
        this.setSelectIdentifierType(pSelectIdentifierType);
    }

    /**
     * Gets the value of the selectIdentifierType.
     * <p>
     * 
     * @return <code>selectIdentifierType</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public String getSelectIdentifierType() {
        return this.selectIdentifierType;
    }

    /**
     * Sets the selectIdentifierType value.
     * <p>
     * 
     * @param pSelectIdentifierType
     *            the current value of <code>selectIdentifierType</code> property.<br>
     */
    public void setSelectIdentifierType(final String pSelectIdentifierType) {
        this.selectIdentifierType = pSelectIdentifierType;
    }

    /**
     * The <code>fromValue</code> method returns the <code>SelectIdentifierType</code> value.
     * <p>
     * 
     * @param pSelectIdentifierType the new value of <code>SelectIdentifierType</code>.
     *            <p>
     * @return the current enumerated value of the <code>SelectIdentifierType</code>.
     */
    public static SelectIdentifierType fromValue(final String pSelectIdentifierType) {

        SelectIdentifierType selectIdentifierType = null;
        for (final SelectIdentifierType bSelectIdentifierType : SelectIdentifierType.values()) {
            if (bSelectIdentifierType.getSelectIdentifierType().equalsIgnoreCase(pSelectIdentifierType)) {
                selectIdentifierType = bSelectIdentifierType;
                break;
            }
        }
        return selectIdentifierType;
    }
}
