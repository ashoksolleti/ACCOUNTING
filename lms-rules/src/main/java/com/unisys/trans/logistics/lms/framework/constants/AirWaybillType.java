package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>PayCodeType</code> holds the constants to indicate AirWaybillType applied.
 * <p>
 * Following are the possible contract status type:<br>
 * <ul>
 * <li>DOMESTIC - D
 * <li>REFERENCE - R
 * <li>AWB - A
 * <li>ULD - U
 * </ul>
 */
public enum AirWaybillType {

    /**
     * Constant used for AWB.
     */
    AWB("A"),
    /**
     * Constant used for DOMESTIC.
     */
    DOMESTIC("D"),
    /**
     * Constant used for REFERENCE.
     */
    REFERENCE("R"),
    /**
     * Constant used for ULD.
     */
    ULD("U");
    /**
     * Attribute to hold the <code>awbType</code> property.
     */
    private String awbType;

    /**
     * Parameterized constructor. Accepts the string representation of the enum
     * as the parameter
     * 
     * @param pAirWaybillType
     *            String representaion of the enum
     */
    private AirWaybillType(final String pAirWaybillType) {
        this.awbType = pAirWaybillType;
    }

    /**
     * Gets the <code>AirWaybillType</code>.
     * <p>
     * This is used as a Mandatory field for create ,update and reassign.
     * <p>
     * 
     * @param pAirWaybillType
     *            the new value of <code>AirWaybillType</code>.
     *            <p>
     * @return the current value of <code>AirWaybillType</code>.
     */
    public static AirWaybillType getAirWaybillType(final String pAirWaybillType) {

        AirWaybillType anAirWaybillType = null;

        for (final AirWaybillType aType : AirWaybillType.values()) {

            if (pAirWaybillType.equals(aType.value())) {
                anAirWaybillType = aType;
                break;
            }
        }

        return anAirWaybillType;
    }

    /**
     * Gets the <code>awbType</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbType</code> property.
     */
    public String getAwbType() {
        return this.awbType;
    }

    /**
     * Sets the <code>awbType</code> property.
     * <p>
     * 
     * @param pAwbType
     *            holds the new value of <code>awbType</code>.<br>
     */
    public void setAwbType(final String pAwbType) {
        this.awbType = pAwbType;
    }

    /**
     * Gets the value for<code>awbType</code>.
     * <p>
     * 
     * @return the current value of <code>awbType</code> property. 
     */
    public String value() {
        return this.awbType;
    }

}
