package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class RuleNameDto extends PersistenceObjectDto {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    String ruleName;

    Boolean ruleSelected;

    String ruleCount;

    String priority;

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(final String pPriority) {
        this.priority = pPriority;
    }

    public String getRuleCount() {
        return this.ruleCount;
    }

    public void setRuleCount(final String pRuleCount) {
        this.ruleCount = pRuleCount;
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public void setRuleName(final String pRuleName) {
        this.ruleName = pRuleName;
    }

    public Boolean getRuleSelected() {
        return this.ruleSelected;
    }

    public void setRuleSelected(final Boolean pRuleSelected) {
        this.ruleSelected = pRuleSelected;
    }

    @Override
    public Long getOId() {
        return null;
    }

}
