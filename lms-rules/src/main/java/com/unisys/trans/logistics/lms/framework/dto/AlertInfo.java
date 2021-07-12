package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

public class AlertInfo implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 8941493495361536699L;
    /**
     * 
     */
    
    private String message;
    
    private String ruleID;
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
