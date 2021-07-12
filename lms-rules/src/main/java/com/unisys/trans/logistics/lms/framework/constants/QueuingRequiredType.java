package com.unisys.trans.logistics.lms.framework.constants;

public enum QueuingRequiredType {

    QUEUING_NOT_REQUIRED("ZERO"),
    QUEUING_REQUIRED_FOR_BOTH_SPL_AND_CAPACITY_RESTRICTION("THREE"),
    QUEUING_REQUIRED_FOR_CAPACITY_RESTRICTION("TWO"),
    QUEUING_REQUIRED_FOR_SPL_RESTRICTION("ONE");
    /**
     * Attribute to hold <code>QueuingRequiredType</code>.
     */
    private String aQueuingRequiredType;

    /**
     * Constructor with QueuingRequiredType as an argument.
     * <p>
     * 
     * @param pQueuingRequiredType
     *            <code>String</code> Holds the QueuingRequiredType.<br>
     */
    private QueuingRequiredType(final String pQueuingRequiredType) {
        this.aQueuingRequiredType = pQueuingRequiredType;
    }

    /**
     * Gets the QueuingRequiredType.
     * <p>
     * 
     * @param pQueuingRequiredType
     *            <code>String</code><br>
     *            Contains the pQueuingRequiredType.<br>
     *            </p>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.reservation.dto.constants.QueuingRequiredType
     *         QueuingRequiredType}</code><br>
     *         Returns the QueuingRequiredType.<br>
     *         </p>
     */
    public static QueuingRequiredType getQueuingRequiredType(final String pQueuingRequiredType) {
        QueuingRequiredType aQueuingRequiredType = null;
        for (final QueuingRequiredType aType : QueuingRequiredType.values()) {
            if (pQueuingRequiredType.equals(aType.value())) {
                aQueuingRequiredType = aType;
                break;
            }
        }
        return aQueuingRequiredType;
    }

    public String getQueuingRequiredType() {
        return this.aQueuingRequiredType;
    }

    public void setQueuingRequiredType(final String pQueuingRequiredType) {
        this.aQueuingRequiredType = pQueuingRequiredType;
    }

    /**
     * The <code>value</code> method gives the string format of awb servicetype.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the awbServiceType.<br>
     */
    public String value() {
        return this.aQueuingRequiredType;
    }
}
