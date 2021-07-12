package com.unisys.trans.logistics.lms.rating.dto;

public enum AllParticipantContractType {
    
    INCLUDE("I"),
    
    DO_NOT_INCLUDE("D"),
    
    SHOW_ALL_PART_ONLY("A");
    
    /**
     * Attribute to hold the <code>allPartContractType</code> property.
     */
    private String allPartContractType;

    /**
     * Constructor with <code>allPartContractType</code> as an argument.
     * <p>
     * 
     * @param pAllPartContractType the new value of the <code>allPartContractType</code>.<br>
     */
    AllParticipantContractType(final String pAllPartContractType) {
        this.allPartContractType = pAllPartContractType;
    }
    
    /**
     * Gets the <code>allPartContractType</code> property.
     * <p>
     * Holds the rate type code applicable for an other charge rate.
     * <p>
     * 
     * @return the current value of the <code>allPartContractType</code> property.<br>
     */
    public String getAllPartContractType() {
        return this.allPartContractType;
    }

    /**
     * The <code>value</code> method returns the string value of <code>AllPartContractType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>AllPartContractType</code>.<br>
     */
    public String value() {
        return this.getAllPartContractType();
    }

}
