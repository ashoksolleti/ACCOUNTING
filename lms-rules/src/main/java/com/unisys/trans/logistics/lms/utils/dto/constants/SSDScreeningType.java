package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * Gets the <code>SSDScreeningType</code> property.
 * <p>
 * <code>SSDScreeningType</code> class holds the SSD Screening type constants. The SSD Screening type can be
 * of: <br>
 * <code>
 * <ul>
 * <li>T
 * <li>E
 * <li>M
 * </ul>
 * </code>
 * <p>
 * <b>Format: </b><br>
 * 1
 * <p>
 * <b>Example: </b><br>
 * 0
 * 
 * @return the current value of the <code>SSDScreeningType</code> property.
 */
public enum SSDScreeningType {

    TSA("T"),

    ETD("E"),

    MANUAL("M");

    private String type;

    /**
     * Constructor.
     * 
     * @param pType
     *            - SSD Screening Type
     */
    SSDScreeningType(final String pType) {
        this.type = pType;
    }

    /**
     * Gets the <code>HolidayType</code>.
     * <p>
     * 
     * @param pType
     *            <code>Integer</code><br>
     *            Contains the enum type.<br>
     *            </p>
     * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.constants.HolidayType HolidayType}</code> <br>
     *         Returns the <code>HolidayType</code>
     */
    public static SSDScreeningType getSSDScreeningType(final String pType) {
        SSDScreeningType aSSDScreeningType = null;
        for (SSDScreeningType aType : SSDScreeningType.values()) {
            if (aType.getType().equals(pType)) {
                aSSDScreeningType = aType;
                break;
            }
        }
        return aSSDScreeningType;
    }

    /**
     * Gets the type of holiday.
     * 
     * @return the type
     */
    public String getType() {
        return this.type;
    }

    /**
     * Sets the type of holiday.
     * 
     * @param pType
     *            the new value of the <code>pType</code> property.
     */
    public void setType(final String pType) {
        this.type = pType;
    }
}
