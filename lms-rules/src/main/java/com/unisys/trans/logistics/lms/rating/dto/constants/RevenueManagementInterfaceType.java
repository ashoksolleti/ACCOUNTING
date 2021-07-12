package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>RevenueManagementInterfaceType</code> holds the constants to indicate RevenueManagementInterfaceType
 * applied.
 * <p>
 * Following are the possible RevenueManagementInterfaceType:<br>
 * <ul>
 * <li>USE_HURDLE_RATES -Y
 * <li>DON0T_USE_HURDLE_RATES - N
 * <li>DISPLAY_AND_COMPARE_DONOT_USE - T
 * </ul>
 */
public enum RevenueManagementInterfaceType {

    /**
     * USE_HURDLE_RATES represents Yes.
     */
    USE_HURDLE_RATES("Y"),

    /**
     * DON0T_USE_HURDLE_RATES represents No.
     */
    DON0T_USE_HURDLE_RATES("N"),

    /**
     * DISPLAY_AND_COMPARE_DONOT_USE represents T(not to use).
     */
    DISPLAY_AND_COMPARE_DONOT_USE("T");
    /**
     * Attribute to hold the <code>typeCode</code> property.
     */
    private final String typeCode;

    /**
     * <code>Parameterized Constructor.</code>
     * 
     * @param pTypeCode <code>String</code><br>
     *            Contains the value.<br>
     */
    RevenueManagementInterfaceType(final String pTypeCode) {
        this.typeCode = pTypeCode;
    }

    /**
     * Gets the value of the typeCode.
     * <p>
     * 
     * @return <code>typeCode</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public String getTypeCode() {
        return this.typeCode;
    }

    /**
     * This method <code>getRevenueManagementInterfaceType</code> returns the RevenueManagementInterfaceType.
     * 
     * @param pTypeCode <code>String</code><br>
     *            The value of due code.<br>
     *            <p>
     * @return <code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.constants.RevenueManagementInterfaceType
     *         pRevenueManagementInterfaceType}</code><br>
     *         Returns the type of Contract <br>
     *         </p>
     */
    public static RevenueManagementInterfaceType getRevenueManagementInterfaceType(final String pTypeCode) {
        final RevenueManagementInterfaceType[] revenueManagementInterfaceTypeValues =
                    RevenueManagementInterfaceType.values();
        RevenueManagementInterfaceType aRevenueManagementInterfaceType = null;
        for (RevenueManagementInterfaceType aValue : revenueManagementInterfaceTypeValues) {
            if (aValue.getTypeCode().equalsIgnoreCase(pTypeCode)) {
                aRevenueManagementInterfaceType = aValue;
                break;
            }
        }
        return aRevenueManagementInterfaceType;
    }
}
