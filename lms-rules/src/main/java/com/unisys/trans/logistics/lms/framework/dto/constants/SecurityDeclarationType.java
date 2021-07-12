package com.unisys.trans.logistics.lms.framework.dto.constants;

public enum SecurityDeclarationType {

    ELECTRONIC("ELECTRONIC"),
    
    BLANK(""),
    
    PAPER("PAPER");
    

    
    
    private String securityDeclarationType;
    
    private SecurityDeclarationType(final String pSecurityDeclarationType) {
        this.securityDeclarationType = pSecurityDeclarationType;
    }
    
   
    public static SecurityDeclarationType getSecurityDeclarationType(final String pSecurityDeclarationType) {

        SecurityDeclarationType aSecurityDeclarationType = null;

        for (final SecurityDeclarationType aType : SecurityDeclarationType.values()) {

            if (pSecurityDeclarationType.equals(aType.value())) {
                aSecurityDeclarationType = aType;
                break;
            }
        }
        return aSecurityDeclarationType;

    }

    /**
     * Gives the string format of enumerated <code>AWBSourceType</code> for an air waybill.
     * <p>
     * 
     * @return the current value of the <code>AWBSourceType</code>.
     */
    public String value() {
        return this.securityDeclarationType;
    }
    
    public String getSecurityStatusType() {
        return securityDeclarationType;
    }


    public void setSecurityDeclarationType(String securityDeclarationType) {
        this.securityDeclarationType = securityDeclarationType;
    }



}
