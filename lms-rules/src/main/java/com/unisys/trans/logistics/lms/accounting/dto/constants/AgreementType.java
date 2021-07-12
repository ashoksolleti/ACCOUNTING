package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum AgreementType {

    PROVISO("PROVISO"),
    PRORATE("PRORATE");

    private String aggrementType;

    AgreementType(final String pAgreementType) {
        this.aggrementType = pAgreementType;
    }

    public String getAggrementType() {
        return this.aggrementType;
    }

    public void setAggrementType(final String pAggrementType) {
        this.aggrementType = pAggrementType;
    }

    
    /**
     * The <code>value</code> method returns the string value of <code>WeightType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>WeightType</code>.<br>
     */
    public String value() {
        return this.getAggrementType();
    }
}
