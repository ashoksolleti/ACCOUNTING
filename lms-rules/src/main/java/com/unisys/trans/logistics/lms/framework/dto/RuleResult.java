package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

public class RuleResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 461445207273871601L;
	

	private RuleMessage ruleMessage;
	
	private CheckListInfo checkListInfo;
	
	private AlertInfo alertInfo;
	
	private ActionInfo actionInfo;
	private EmailInfo emailInfo; 
	public RuleResult() {
		
	}


	/**
	 * @return the ruleMessage
	 */
	public RuleMessage getRuleMessage() {
		if(ruleMessage==null){
			ruleMessage = new RuleMessage();
		}
		return ruleMessage;
	}


	/**
	 * @param ruleMessage the ruleMessage to set
	 */
	public void setRuleMessage(RuleMessage ruleMessage) {
		this.ruleMessage = ruleMessage;
	}


	/**
	 * @return the checkListInfo
	 */
	public CheckListInfo getCheckListInfo() {
		if(checkListInfo==null){
			checkListInfo = new CheckListInfo();
		}
		return checkListInfo;
	}


	/**
	 * @param checkListInfo the checkListInfo to set
	 */
	public void setCheckListInfo(CheckListInfo checkListInfo) {
		this.checkListInfo = checkListInfo;
	}

	/**
     * @return the alertInfo
     */
    public AlertInfo getAlertInfo() {
        if(alertInfo==null){
            alertInfo =new AlertInfo();
        }
        return alertInfo;
    }


    /**
     * @param alertInfo the alertInfo to set
     */
    public void setAlertInfo(AlertInfo alertInfo) {
        this.alertInfo = alertInfo;
    }


    public ActionInfo getActionInfo() {
        if(actionInfo==null){
            actionInfo=new ActionInfo();
        }
        return actionInfo;
    }


    public void setActionInfo(ActionInfo actionInfo) {
        this.actionInfo = actionInfo;
    }


    public EmailInfo getEmailInfo() {
        if(emailInfo==null){
            emailInfo=new EmailInfo();
        }
        return emailInfo;
    }


    public void setEmailInfo(EmailInfo emailInfo) {
        this.emailInfo = emailInfo;
    }
	
}
