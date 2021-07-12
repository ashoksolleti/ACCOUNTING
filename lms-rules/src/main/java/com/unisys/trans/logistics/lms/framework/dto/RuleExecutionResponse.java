package com.unisys.trans.logistics.lms.framework.dto;

import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.exception.CodeMessage;

public class RuleExecutionResponse {

	private Object evaluatedObject;
	private List<CodeMessage> codeMessageList;
	private List<Object> evaluatedObjectList;
	private Map<String, CodeMessage> resultMap;
	private CodeMessage codeMessage;

	public RuleExecutionResponse(RuleExecutionContext context) {
		
		this.setEvaluatedObject(context.getOutPutObject());
		this.setCodeMessageList(context.getCodeMessageList());
		this.setEvaluatedObjectList(context.getOutputObjectList());
		this.setResultMap(context.getResultMap());
		this.setCodeMessage(context.getCodeMessage());
	}

	/**
	 * @return the evaluatedObject
	 */
	public Object getEvaluatedObject() {
		return evaluatedObject;
	}

	/**
	 * @param evaluatedObject
	 *            the evaluatedObject to set
	 */
	public void setEvaluatedObject(Object evaluatedObject) {
		this.evaluatedObject = evaluatedObject;
	}

	/**
	 * @return the codeMessageList
	 */
	public List<CodeMessage> getCodeMessageList() {
		return codeMessageList;
	}

	/**
	 * @param codeMessageList
	 *            the codeMessageList to set
	 */
	public void setCodeMessageList(List<CodeMessage> codeMessageList) {
		this.codeMessageList = codeMessageList;
	}

	public Map<String, CodeMessage> getResultMap() {
		return resultMap;
	}

	public void setResultMap(Map<String, CodeMessage> resultMap) {
		this.resultMap = resultMap;
	}

	public List<Object> getEvaluatedObjectList() {
		return evaluatedObjectList;
	}

	public void setEvaluatedObjectList(List<Object> evaluatedObjectList) {
		this.evaluatedObjectList = evaluatedObjectList;
	}

	public CodeMessage getCodeMessage() {
		return codeMessage;
	}

	public void setCodeMessage(CodeMessage codeMessage) {
		this.codeMessage = codeMessage;
	}

}
