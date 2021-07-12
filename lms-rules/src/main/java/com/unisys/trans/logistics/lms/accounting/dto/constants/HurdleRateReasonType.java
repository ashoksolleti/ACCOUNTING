package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum HurdleRateReasonType {

    A("Hurdle Rate allotment exclusion"),
    B("Hurdle rate contract exclusion"),
    C("Hurdle rate SRA exclusion"),
    D("Flight Control Rejected Hurdle Rate Request"),
    E("Hurdle Rate Not Enforced Cannot Determine Host Revenue"),
    F("Failed the hurdle rate check"),
    G("Passed the hurdle rate check"),
    H("Flight Control Confirmed Hurdle Rate Request"),
    I("Hurdle Rate not enforced for some of the flights"),
    J("Booking status partially confirmed   "),
    K("FSU or FBL indicated segment"),
    L("Hurdle Rate not enforced for all of the flights"),
    M("C$CROI set to T- Hurdle Rate not enforced"),
    N("Weight charges not generated"),
    O("Hurdle Rate does not exist for any of the segments"),
    X("Goods already accepted"),
    Y("Air waybill data capture done "),
    Z("Air waybill data capture (FWB/QWB) done ");

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
    HurdleRateReasonType(final String pValue) {
        this.val = pValue;
    }

    /**
     * Gets the <code>HurdleRateReasonType</code>.
     * <p>
     * 
     * @param pHurdleRateReasonType
     *            holds the new value of <code>HurdleRateReasonType</code>
     *            <p>
     * @return the value of <code>HurdleRateReasonType</code>
     */
    public static HurdleRateReasonType getHurdleRateReasonType(
                final String pHurdleRateReasonType) {

        HurdleRateReasonType aMatchedHurdleRateReasonType = null;

        for (final HurdleRateReasonType aType : HurdleRateReasonType.values()) {

            if (pHurdleRateReasonType.equals(aType.getVal())) {
                aMatchedHurdleRateReasonType = aType;
                break;
            }
        }

        return aMatchedHurdleRateReasonType;

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
