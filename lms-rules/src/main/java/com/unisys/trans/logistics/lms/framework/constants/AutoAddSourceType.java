package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>AirWayBillParticipantDto</code> holds the constants to indicate
 * AutoAddSourceType applied for auto addition.
 * <p>
 * Following are the possible AutoAddSourceType :<br>
 * <ul>
 * <li>SHIPPER - S
 * <li>CONSIGNEE - C
 * <li>COLLECT_AWB - CA
 * <li>PICKUP_OPERATOR_STATION - GS
 * <li>PICKUP_OPERATOR_OC - GC
 * <li>DELIVERY_OPERATOR_STATION - DS
 * <li>DELIVERY_OPERATOR_OC - DC
 * </ul>
 */
public enum AutoAddSourceType {
    /**
     * Constant used for ALLOTMENT for specifying auto addition.
     */
    ALLOTMENT("AA"),
    /**
     * Constant used for COLLECT_AWB for specifying auto addition.
     */
    COLLECT_AWB("CA"),
    /**
     * Constant used for CONSIGNEE for specifying auto addition.
     */
    CONSIGNEE("C"),
    /**
     * Constant used for DELIVERY_OPERATOR_OC for specifying auto addition.
     */
    DELIVERY_OPERATOR_OC("DC"),
    /**
     * Constant used for DELIVERY_OPERATOR_STATION for specifying auto addition.
     */
    DELIVERY_OPERATOR_STATION("DS"),
    /**
     * Constant used for PICKUP_OPERATOR_OC for specifying auto addition.
     */
    PICKUP_OPERATOR_OC("GC"),
    /**
     * Constant used for PICKUP_OPERATOR_STATION for specifying auto addition.
     */
    PICKUP_OPERATOR_STATION("GS"),
    /**
     * Constant used for SHIPPER for specifying auto addition.
     */
    SHIPPER("S");
    /**
     * Attribute to hold the <code>autoAddSourceType</code> property.
     */
    private String autoAddSourceType;

    /**
     * Parameterized constructor. Accepts the string representation of the enum
     * as the parameter
     * 
     * @param pAutoAddSourceType
     *            String representaion of the enum
     */
    private AutoAddSourceType(final String pAutoAddSourceType) {
        this.autoAddSourceType = pAutoAddSourceType;
    }

    /**
     * This method <code>getAutoAddSourceType</code> returns the
     * AutoAddSourceType.
     * 
     * @param pAutoAddSourceType
     *            <code>String</code><br>
     *            The value of due code.<br>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.frmaework.constants.AutoAddSourceType
     *         pAutoAddSourceType}</code><br>
     *         Returns the type of AutoAddSourceType <br>
     *         </p>
     */
    public static AutoAddSourceType getAutoAddSourceType(
                final String pAutoAddSourceType) {

        AutoAddSourceType anAutoAddSourceType = null;

        for (final AutoAddSourceType aAutoAddSourceType : AutoAddSourceType
                    .values()) {

            if (pAutoAddSourceType.equals(aAutoAddSourceType.value())) {
                anAutoAddSourceType = aAutoAddSourceType;
                break;
            }
        }

        return anAutoAddSourceType;
    }

    /**
     * Gets the autoAddSourceType.
     * <p>
     * 
     * @return the current value of <code>autoAddSourceType</code> property.<br>
     */
    public String getAutoAddSourceType() {
        return this.autoAddSourceType;
    }

    /**
     * Sets the AutoAddSourceType.
     * <p>
     * 
     * @param pAutoAddSourceType
     *            the current value of <code>autoAddSourceType</code> property.<br>
     */

    public void setAutoAddSourceType(final String pAutoAddSourceType) {
        this.autoAddSourceType = pAutoAddSourceType;
    }

    /**
     * The <code>value</code> method gives the string format of
     * AutoAddSourceType.
     * <p>
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the AutoAddSourceType.<br>
     */
    public String value() {
        return this.autoAddSourceType;
    }

}
