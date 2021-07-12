package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/*
 * Holds the Reason of Exemption List. It is used in security information.
 */
public enum ExemptionReasonType {
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    SLULD("Shipper Loadded ULD"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    SWSP("Shrink-wrapped to skid or pallet"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    BSP("Banded to skid or pallet"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    DG("Dangerous Goods"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    SFR("Sealed Federal Reserve/U.S. Treasury shipment"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    HOBP("Human Organs and By-Products"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    DS("Diagnostic Specimens(e.g. biological substances)"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    HBBP("Human Blood and By-Products"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    HR("Human Remains"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    ELSD("Emergency Life-Saving Drugs"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    SEP("Special Exemption Procedure"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    MAIL("Mail"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    ITAC("Interline from other TSA-approved carrier"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    AOGN("AOG non-U.S. origin"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    COMATN("COMAT non-U.S. origin"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    FRTRHS("FRTR-Hard Sided Locked ULD"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    DODS("DOD Shipments"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    FRTRCA("FRTR-COMAT or AOG"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    FRTROS("FRTR-Cannot open from inside"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    FRTROD("FRTR-No opening for indivisual"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    FRTRFD("FRTR-No access to flight deck"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    FRTRPM("FRTR-Pieces<150 Ibs"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    RACA("RACA Cargo Delivered by Authorised Driver"),
    
    /**
     * This is an enumerated GoodsStatusType constant to specify SSPD unconfirmed.
     */
    DP("Diplomatic Pouch");
	
	private String code;

	ExemptionReasonType(final String pCode) {
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
     * Gets the value of ExemptionReasonType for the <code>name</code> property.
     * <p>
     *
     * @return Returns the value of <code>name</code> property.
     */
    public static ExemptionReasonType getExemptionReasonType(final String pName) {
        ExemptionReasonType aReturnedExemptionReasonType = null;
        for(ExemptionReasonType aExemptionReasonType :ExemptionReasonType.values()){
            if(aExemptionReasonType.name().equalsIgnoreCase(pName)){
                aReturnedExemptionReasonType = aExemptionReasonType; 
            }
        }
        return aReturnedExemptionReasonType;
    }
}