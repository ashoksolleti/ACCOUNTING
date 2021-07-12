package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

public class AccountingAirwaybillAuditDto extends Object implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String ruleName;
    
    private String queueName;
    
    private String ruleDescription;
    
    private String officeIndentifier;
    
    private String addtionalInformation;
    
    private String priority;


    public AccountingAirwaybillAuditDto() {}

    
    public String getOfficeIndentifier() {
        return officeIndentifier;
    }


    public void setOfficeIndentifier(String officeIndentifier) {
        this.officeIndentifier = officeIndentifier;
    }


    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getRuleDescription() {
        return ruleDescription;
    }

    public void setRuleDescription(String addtionalInformation) {
        this.ruleDescription = addtionalInformation;
    }


    public String getAddtionalInformation() {
        return addtionalInformation;
    }


    public void setAddtionalInformation(String addtionalInformation) {
        this.addtionalInformation = addtionalInformation;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }


}
