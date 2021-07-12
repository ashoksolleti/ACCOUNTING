package com.unisys.trans.logistics.lms.framework.constants;

public enum AirWaybillFWBStatus {

    /**
     * Constant used to denote air waybill not from FWB.
     */
    ZERO("0"),
    /**
     * Constant used to denote FWB on error queue.
     */
    ONE("1"),
    /**
     * Constant used to denote FWB on select queue.
     */
    TWO("2"),
    /**
     * Constant used to denote FWB on error queue.
     */
    THREE("3"),
    /**
     * Constant used to denote that FWB provided data for air waybill.
     */
    F("F"),
    /**
     * Constant used to denote FWB on rate queue.
     */
    W("W"),
    /**
     * Constant used to denote Automatic FWB.
     */
    A("A");
    /**
     * Attribute to hold the <code>airWaybillFWBStatus</code> property.
     */
    private String airWaybillFWBStatus;

    /**
     * Parameterized constructor. Accepts the string representation of the enum
     * as the parameter
     * 
     * @param pAirWaybillFWBStatus
     *            String representation of the enum
     */
    private AirWaybillFWBStatus(final String pAirWaybillFWBStatus) {
        this.airWaybillFWBStatus = pAirWaybillFWBStatus;
    }

    /**
     * Gets the <code>AirWaybillFWBStatus</code>.
     * <p>
     * 
     * @param pAirWaybillFWBStatus
     *            the new value of <code>AirWaybillFWBStatus</code>.
     *            <p>
     * @return the current value of <code>AirWaybillFWBStatus</code>.
     */
    public static AirWaybillFWBStatus getAirWaybillFWBStatus(final String pAirWaybillFWBStatus) {

        AirWaybillFWBStatus anAirWaybillFWBStatus = null;

        for (final AirWaybillFWBStatus aStatus : AirWaybillFWBStatus.values()) {

            if (pAirWaybillFWBStatus.equals(aStatus.value())) {
                anAirWaybillFWBStatus = aStatus;
                break;
            }
        }

        return anAirWaybillFWBStatus;
    }

    /**
     * Gets the <code>airWaybillFWBStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWaybillFWBStatus</code> property.
     */
    public String getAirWaybillFWBStatus() {
        return this.airWaybillFWBStatus;
    }

    /**
     * Sets the <code>airWaybillFWBStatus</code> property.
     * <p>
     * 
     * @param pairWaybillFWBStatus
     *            holds the new value of <code>airWaybillFWBStatus</code>.<br>
     */
    public void setAirWaybillFWBStatus(final String pairWaybillFWBStatus) {
        this.airWaybillFWBStatus = pairWaybillFWBStatus;
    }

    /**
     * Gets the value for<code>airWaybillFWBStatus</code>.
     * <p>
     * 
     * @return the current value of <code>airWaybillFWBStatus</code> property.
     */
    public String value() {
        return this.airWaybillFWBStatus;
    }

}
