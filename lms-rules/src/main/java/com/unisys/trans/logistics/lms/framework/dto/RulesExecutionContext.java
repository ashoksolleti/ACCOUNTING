package com.unisys.trans.logistics.lms.framework.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class RulesExecutionContext {
	
	  private Object inputobject;
	  private Object outPutObject;
	  private String ruleParam;
	  private List<Object> inputObjectList;
	  private List<Object> outputObjectList;
	  private String carrierCode;
	  private String ruleName;
	  
	  public RulesExecutionContext() {
		  this.outputObjectList = new ArrayList<Object>();
	  }
	  
	/**
	 * @return the inputobject
	 */
	public Object getInputobject() {
		return inputobject;
	}
	/**
	 * @param inputobject the inputobject to set
	 */
	public void setInputobject(Object inputobject) {
		this.inputobject = inputobject;
	}
	/**
	 * @return the outPutObject
	 */
	public Object getOutPutObject() {
		return outPutObject;
	}
	/**
	 * @param outPutObject the outPutObject to set
	 */
	public void setOutPutObject(Object outPutObject) {
		
		if (outPutObject instanceof RuleMessage){
			RuleMessage ruleMessage = (RuleMessage)outPutObject;
			if(ruleMessage!=null && ruleMessage.getDynamicContent()!=null && ruleMessage.getMessageText()!=null) {
				try {
					StringTokenizer token = new StringTokenizer((String) ruleMessage.getDynamicContent(),",");
					String strText=ruleMessage.getMessageText();
					while (token.hasMoreElements()) {
						 String value= (String) token.nextElement();
						 strText= strText.replaceFirst("\\$@@", value);
					}
					ruleMessage.setMessageText(strText);
				}catch(Exception ex){
					ex.printStackTrace();
				}
				
			}
		}
		this.addOutputObject(outPutObject);
		this.outPutObject = outPutObject;
	}
	/**
	 * @return the ruleParam
	 */
	public String getRuleParam() {
		return ruleParam;
	}
	/**
	 * @param ruleParam the ruleParam to set
	 */
	public void setRuleParam(String ruleParam) {
		this.ruleParam = ruleParam;
	}


	public List<Object> getInputObjectList() {
		return inputObjectList;
	}

	public void setInputObjectList(List<Object> inputObjectList) {
		this.inputObjectList = inputObjectList;
	}

	public List<Object> getOutputObjectList() {
		return outputObjectList;
	}

	public void setOutputObjectList(List<Object> outputObjectList) {
		this.outputObjectList = outputObjectList;
	}
	
		
	public void addOutputObject(Object outputObject){
		if (outputObject!=null){
			if(outputObjectList==null || outputObjectList.size()==0){
				outputObjectList = new ArrayList<Object>();
			}
			outputObjectList.add(outputObject);
		}
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	  
}
