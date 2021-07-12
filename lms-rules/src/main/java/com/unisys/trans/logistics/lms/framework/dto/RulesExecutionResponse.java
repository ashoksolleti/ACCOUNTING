package com.unisys.trans.logistics.lms.framework.dto;

import java.util.List;
import java.util.Map;


public class RulesExecutionResponse {

	private Object evaluatedObject;
	private List<RuleResult> ruleResults;
	private List<Object> evaluatedObjectList;
	private Map<String, RuleResult> resultMap;
	private RuleResult ruleResult;

	public RulesExecutionResponse(RulesExecutionContext context) {
		
		this.setEvaluatedObject(context.getOutPutObject());
		this.setEvaluatedObjectList(context.getOutputObjectList());
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

	public Map<String, RuleResult> getResultMap() {
		return resultMap;
	}

	public void setResultMap(Map<String, RuleResult> resultMap) {
		this.resultMap = resultMap;
	}

	public List<Object> getEvaluatedObjectList() {
		return evaluatedObjectList;
	}

	public void setEvaluatedObjectList(List<Object> evaluatedObjectList) {
		this.evaluatedObjectList = evaluatedObjectList;
	}

	/**
	 * @return the ruleResults
	 */
	public List<RuleResult> getRuleResults() {
		return ruleResults;
	}

	/**
	 * @param ruleResults the ruleResults to set
	 */
	public void setRuleResults(List<RuleResult> ruleResults) {
		this.ruleResults = ruleResults;
	}

	/**
	 * @return the ruleResult
	 */
	public RuleResult getRuleResult() {
		return ruleResult;
	}

	/**
	 * @param ruleResult the ruleResult to set
	 */
	public void setRuleResult(RuleResult ruleResult) {
		this.ruleResult = ruleResult;
	}

}
