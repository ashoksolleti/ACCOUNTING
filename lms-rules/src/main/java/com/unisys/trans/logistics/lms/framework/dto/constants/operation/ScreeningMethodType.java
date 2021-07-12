package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/*
 * Hold the Method of Screening List. It is used in security information. 
 */
public enum ScreeningMethodType {
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    EDS("Automated Explosives Detection - EDS"),
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    XR("X-Ray"),
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    ETD("Explosive Trace Detectors"),
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    PS("Physical Searches"),
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    TD("Trained Dogs"),
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    LAKP("Inspection of Live Animal kennel/packaging"),
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    GS("Government Screened"),
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    CCSF("Certified Facility(CCSF)"),
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    CM("Company Material"),
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    FI("Freighter Inspection"),
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    OVI("Under 16 Ounces-Visual Inspection"),
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    RAKC("Secured by Regulated Agent/Known Consignor"),
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    ISP("Secured by Israeli Security Program"),
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    EXR("Enhanced X-Ray"),
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    IETD("Internal ETD"),
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    EPSH("Enhanced Physical Search + Hold"),
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    EMD("Electronic Metal Detection - EMD");
	
	private String code;

	ScreeningMethodType(final String pCode) {
        this.code = pCode;
    }

    /**
     * Gets the value of the <code>code</code> property.
     * <p>
     *
     * @return Returns the current value of <code>code</code> property.
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the <code>code</code> property.
     * <p>
     *
     * @param <code>code</code>
     *        Holds the new value of the <code>code</code> property.
     */
    public void setCode(String code) {
        this.code = code;
    }
    

    /**
     * Gets the value of ScreeningMethodType for the <code>name</code> property.
     * <p>
     *
     * @return Returns the value of <code>name</code> property.
     */
    public static ScreeningMethodType getScreeningMethodForName(final String pName) {
        ScreeningMethodType aReturnedScreeningMethodType = null;
        for(ScreeningMethodType aScreeningMethodType :ScreeningMethodType.values()){
            if(aScreeningMethodType.name().equalsIgnoreCase(pName)){
                aReturnedScreeningMethodType = aScreeningMethodType; 
            }
        }
        return aReturnedScreeningMethodType;
    }
}