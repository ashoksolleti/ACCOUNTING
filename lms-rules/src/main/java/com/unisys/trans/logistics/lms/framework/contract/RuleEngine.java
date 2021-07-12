package com.unisys.trans.logistics.lms.framework.contract;


import com.unisys.trans.logistics.lms.framework.dto.RuleExecutionRequest;
import com.unisys.trans.logistics.lms.framework.dto.RulesExecutionResponse;
import com.unisys.trans.logistics.lms.framework.exception.RuleEngineException;

public interface RuleEngine {

	public RulesExecutionResponse executeRule(
			RuleExecutionRequest ruleExecutionRequest)
			throws RuleEngineException;

}
