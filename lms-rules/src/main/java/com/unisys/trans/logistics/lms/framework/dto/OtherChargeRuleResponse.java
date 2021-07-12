package com.unisys.trans.logistics.lms.framework.dto;

public class OtherChargeRuleResponse {

    private String ruleNumber;

    private OtherChargeActionType action;

    private String otherChargeCode;

    private String otherChargeSubCode;

    /**
     * @return the ruleNumber
     */
    public String getRuleNumber() {
        return ruleNumber;
    }

    /**
     * @param ruleNumber the ruleNumber to set
     */
    public void setRuleNumber(String ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    /**
     * @return the action
     */
    public OtherChargeActionType getAction() {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(OtherChargeActionType action) {
        this.action = action;
    }

    /**
     * @return the otherChargeCode
     */
    public String getOtherChargeCode() {
        return otherChargeCode;
    }

    /**
     * @param otherChargeCode the otherChargeCode to set
     */
    public void setOtherChargeCode(String otherChargeCode) {
        this.otherChargeCode = otherChargeCode;
    }

    /**
     * @return the otherChargeSubCode
     */
    public String getOtherChargeSubCode() {
        return otherChargeSubCode;
    }

    /**
     * @param otherChargeSubCode the otherChargeSubCode to set
     */
    public void setOtherChargeSubCode(String otherChargeSubCode) {
        this.otherChargeSubCode = otherChargeSubCode;
    }

}
