package com.unisys.trans.logistics.lms.awb.dto;


public enum AwbRoutingIndType {

    /**
     * This is an enumerated action type constant to specify DOMESTIC.
     */
    DOMESTIC("D"),
    /**
     * This is an enumerated action type constant to specify INTERNATIONAL.
     */
    INTERNATIONAL("I"),
    /**
     * This is an enumerated action type constant to specify NORTHAMERICA.
     */
    NORTHAMERICA("N");
   
    /**
     * This method <code>fromValue</code> returns the enumerated value.
     * <p>
     * It is a type of DOMESTIC,INTERNATIONAL
     * <p>
     * 
     * @param pValue the value of enumerated type.
     *            <p>
     * @return the enumerated value of the action type.
     */
    
    
    private String awbRoutingTypeInd;
    
    /**
     * @return the awbRoutingTypeInd
     */
    public String getAwbRoutingTypeInd() {
        return awbRoutingTypeInd;
    }
    
    public static AwbRoutingIndType getAwbRoutingType(final String pAwbRoutingTypeInd) {

        AwbRoutingIndType aAwbRoutingTypeInd = null;

        for (final AwbRoutingIndType aType : AwbRoutingIndType.values()) {

            if (pAwbRoutingTypeInd.equals(aType.getAwbRoutingTypeInd())) {
                aAwbRoutingTypeInd = aType;
                break;
            }
        }

        return aAwbRoutingTypeInd;

    }

    /**
     * @param awbRoutingTypeInd the awbRoutingTypeInd to set
     */
    public void setAwbRoutingTypeInd(String awbRoutingTypeInd) {
        this.awbRoutingTypeInd = awbRoutingTypeInd;
    }

    AwbRoutingIndType(final String pAwbRoutingInd) {

        this.setAwbRoutingTypeInd(pAwbRoutingInd);
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
