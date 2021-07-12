package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.constants.RuleActionType;

public class ActionInfo implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = -7094258252017280247L;

    private String message;
    
    private String ruleID;
    
    private RuleActionType okAction;
    
    private RuleActionType cancelAction;

    /**
     * @return the okAction
     */
    public RuleActionType getOkAction() {
        return okAction;
    }

    /**
     * @param okAction the okAction to set
     */
    public void setOkAction(RuleActionType okAction) {
        this.okAction = okAction;
    }

    /**
     * @return the cancelAction
     */
    public RuleActionType getCancelAction() {
        return cancelAction;
    }

    /**
     * @param cancelAction the cancelAction to set
     */
    public void setCancelAction(RuleActionType cancelAction) {
        this.cancelAction = cancelAction;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    public String getRuleID() {
        return ruleID;
    }

    public void setRuleID(String ruleID) {
        this.ruleID = ruleID;
    }

}
