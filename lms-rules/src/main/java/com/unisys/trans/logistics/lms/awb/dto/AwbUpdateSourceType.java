package com.unisys.trans.logistics.lms.awb.dto;


public enum AwbUpdateSourceType {
    
    /**
     * This is an enumerated action type constant to specify AWB_INFORMATION.
     */
    AWB_INFORMATION("A"),
    /**
     * This is an enumerated action type constant to specify EXPRESS_AWB.
     */
    EXPRESS_AWB("E"),
    /**
     * This is an enumerated action type constant to specify PRICE_QUOTE.
     */
    PRICE_QUOTE("Q"),
    /**
     * This is an enumerated action type constant to specify FWB_MESSAGE.
     */
    FWB_MESSAGE("F"),
    /**
     * This is an enumerated action type constant to specify EXPRESS_SLULD.
     */
    EXPRESS_SLULD("S");
   
    private String awbUpdateSource;

    /**
     * @return the awbUpdateSource
     */
    public String getAwbUpdateSource() {
        return awbUpdateSource;
    }

    public static AwbUpdateSourceType getAwbUpdateSourceType(final String pAwbUpdateSourceType) {

        AwbUpdateSourceType aAwbUpdateSourceType = null;

        for (final AwbUpdateSourceType aType : AwbUpdateSourceType.values()) {

            if (pAwbUpdateSourceType.equals(aType.getAwbUpdateSource())) {
                aAwbUpdateSourceType = aType;
                break;
            }
        }

        return aAwbUpdateSourceType;

    }
    
    /**
     * @param awbUpdateSource the awbUpdateSource to set
     */
    public void setAwbUpdateSource(String awbUpdateSource) {
        this.awbUpdateSource = awbUpdateSource;
    }

    AwbUpdateSourceType(final String pAwbUpdateSource) {

        this.setAwbUpdateSource(pAwbUpdateSource);
    }
    /**
     * The <code>value</code> method gives the string format of action type.
     * <p>
     * 
     * @return the enumerated value of the action type.
     */
    public String value() {
        return this.name();
    }
}
