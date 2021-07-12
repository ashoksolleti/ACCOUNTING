package com.unisys.trans.logistics.lms.framework.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.exception.CodeMessage;

public class RuleExecutionContext {
	
	  private List<CodeMessage> codeMessageList;
	  private Object inputobject;
	  private Object outPutObject;
	  private String ruleParam;
	  private Map<String, CodeMessage> resultMap;
	  private List<Object> inputObjectList;
	  private List<Object> outputObjectList;
	  private CodeMessage codeMessage;
	  private String carrierCode;
	  
	  public RuleExecutionContext() {
		  this.resultMap= new HashMap<String, CodeMessage>();
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
		this.outPutObject = outPutObject;
		if (outputObjectList == null) {
		    outputObjectList = new ArrayList<Object>();    
        } 
        outputObjectList.add(outPutObject);
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
	/**
	 * @return the codeMessageList
	 */
	public List<CodeMessage> getCodeMessageList() {
		return codeMessageList;
	}
	/**
	 * @param codeMessageList the codeMessageList to set
	 */
	public void setCodeMessageList(List<CodeMessage> codeMessageList) {
		this.codeMessageList = codeMessageList;
	}

	/**
	 * @return the resultMap
	 */
	public Map<String, CodeMessage> getResultMap() {
		return this.resultMap;
	}

	/**
	 * @param resultMap the resultMap to set
	 */
	public void addResultMap(String strKey, CodeMessage codeMessage) {
		this.resultMap.put(strKey, codeMessage);
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
	
	public void addCodeMessage(CodeMessage message){
		if (message!=null){
			if(codeMessageList==null){
				codeMessageList = new ArrayList<CodeMessage>();
			}
			codeMessageList.add(message);
		}
	}

	public CodeMessage getCodeMessage() {
		return codeMessage;
	}

	public void setCodeMessage(CodeMessage codeMessage) {
		this.codeMessage = codeMessage;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}
	
	  
}
