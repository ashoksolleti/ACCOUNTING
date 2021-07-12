package com.unisys.trans.logistics.lms.framework.dto;



public enum EawbStatusType {
    
    
    /**
     * This is an enumerated action type constant to specify Yes.
     */
    YES("Y"),
    /**
     * This is an enumerated action type constant to specify Print.
     */
    PRINT("P"),
    /**
     * This is an enumerated action type constant to specify No.
     */
    NO("N");
    
    private String eawbStatus;
    /**
     * This method <code>fromValue</code> returns the enumerated value.
     * <p>
     * It is a type of Yes,Print,No.
     * <p>
     * 
     * @param pValue the value of enumerated type.
     *            <p>
     * @return the enumerated value of the action type.
     */
   
    EawbStatusType(final String pEawbstatusType) {

        this.setEawbStatus(pEawbstatusType);
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

    public String getEawbStatus() {
        return eawbStatus;
    }

    public void setEawbStatus(String eawbStatus) {
        this.eawbStatus = eawbStatus;
    }
    
    public static EawbStatusType getEawbStatusType(final String pEawbStatusType) {

        EawbStatusType aEawbStatusType = null;

        for (final EawbStatusType aType : EawbStatusType.values()) {

            if (pEawbStatusType.equals(aType.getEawbStatus())) {
                aEawbStatusType = aType;
                break;
            }
        }

        return aEawbStatusType;

    }
}
