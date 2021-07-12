package com.unisys.trans.logistics.lms.framework.dto.constants;


public enum SecurityStatusType {

    IAC("IAC"),
    
    AAC("AAC");
    

    
    
    private String securityStatusType;
    
    private SecurityStatusType(final String pSecurityStatusType) {
        this.securityStatusType = pSecurityStatusType;
    }
    
   
    public static SecurityStatusType getSecurityStatusType(final String pSecurityStatusType) {

        SecurityStatusType aSecurityStatusType = null;

        for (final SecurityStatusType aType : SecurityStatusType.values()) {

            if (pSecurityStatusType.equals(aType.value())) {
                aSecurityStatusType = aType;
                break;
            }
        }
        return aSecurityStatusType;

    }

    /**
     * Gives the string format of enumerated <code>AWBSourceType</code> for an air waybill.
     * <p>
     * 
     * @return the current value of the <code>AWBSourceType</code>.
     */
    public String value() {
        return this.securityStatusType;
    }
    
    public String getSecurityStatusType() {
        return securityStatusType;
    }


    public void setSecurityStatusType(String securityStatusType) {
        this.securityStatusType = securityStatusType;
    }



}
