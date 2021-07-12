package com.unisys.trans.logistics.lms.framework.dto;

import java.util.List;


public class RuleExecutionRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7153912436402048548L;
	private RulesExecutionContext ruleExecutionContext;
	private String ruleName;
	private String ruleNameStartWith;
	private String ruleNameEndsWith;
	private String guvnorChangeSetURL;
	private String carrierCode;
	private String packageName;
	private String rulesJar;
	private boolean accountingRules = false;
	private boolean routingAndPriceRules = false;
	

	public RuleExecutionRequest() {
		ruleExecutionContext = new RulesExecutionContext();
	}

	public void setEvaluationObject(Object object) {
		ruleExecutionContext.setInputobject(object);
	}

	public void setRuleParam(String strParam) {
		ruleExecutionContext.setRuleParam(strParam);
	}
	
	public void setEvaluationListofObject(List<Object> inputObjectList){
		ruleExecutionContext.setInputObjectList(inputObjectList);
	}

	/**
	 * @return the ruleName
	 */ 
	public String getRuleName() {
		return ruleName;
	}

	/**
	 * @param ruleName
	 *            the ruleName to set
	 */
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	/**
	 * @return the ruleExecutionContext
	 */
	public RulesExecutionContext getEvaluationObject() {
		return ruleExecutionContext;
	}

	public String getRuleNameStartWith() {
		return ruleNameStartWith;
	}

	public void setRuleNameStartWith(String ruleNameStartWith) {
		this.ruleNameStartWith = ruleNameStartWith;
	}

	public String getRuleNameEndsWith() {
		return ruleNameEndsWith;
	}

	public void setRuleNameEndsWith(String ruleNameEndsWith) {
		this.ruleNameEndsWith = ruleNameEndsWith;
	}

	public String getGuvnorChangeSetURL() {
		return guvnorChangeSetURL;
	}

	public void setGuvnorChangeSetURL(String guvnorChangeSetURL) {
		this.guvnorChangeSetURL = guvnorChangeSetURL;
	}

	/**
	 * @param ruleExecutionContext
	 *            the ruleExecutionContext to set
	 */
//	public void setRuleExecutionContext(
//			RuleExecutionContext ruleExecutionContext) {
//		this.ruleExecutionContext = ruleExecutionContext;
//	}
	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		ruleExecutionContext.setCarrierCode(carrierCode);
		this.carrierCode = carrierCode;
	}

	/**
	 * @return the packageName
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * @param packageName the packageName to set
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getRulesJar() {
		return rulesJar;
	}

	public void setRulesJar(String rulesJar) {
		this.rulesJar = rulesJar;
	}

	public boolean isAccountingRules() {
		return accountingRules;
	}

	public void setAccountingRules(boolean accountingRules) {
		this.accountingRules = accountingRules;
	}

	public boolean isRoutingAndPriceRules() {
		return routingAndPriceRules;
	}
	public void setRoutingAndPriceRules(boolean routingAndPriceRules) {
		this.routingAndPriceRules = routingAndPriceRules;
	}
	

}
