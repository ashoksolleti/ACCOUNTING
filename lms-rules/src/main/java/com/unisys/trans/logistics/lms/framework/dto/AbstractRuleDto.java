package com.unisys.trans.logistics.lms.framework.dto;

import com.unisys.trans.logistics.lms.framework.constants.RuleMatrixType;

/**
 * The <code>AbstractRuleDto</code> holds the rule matrix type.
 * <p>
 * This contains the following attributes: <code>
 * <ul>
 * <li>ruleMatrixType
 * </ul>
 * </code>
 */
public abstract class AbstractRuleDto {

    /**
     * Attribute to hold <code>ruleMatrixType</code> property.
     */
    private RuleMatrixType ruleMatrixType;

    /**
     * Gets the key property.
     * <p>
     * Represents the rule matrix type.
     * <p>
     * 
     * @return the new value of key property.
     */
    public abstract String getKey();

    /**
     * Gets the <code>ruleMatrixType</code> property.
     * <p>
     * Represents the rule matrix type.
     * <p>
     * 
     * @return the current value of the <code>ruleMatrixType</code> property.
     */
    public RuleMatrixType getRuleMatrixType() {
        return this.ruleMatrixType;
    }

    /**
     * Sets the <code>ruleMatrixType</code> property.
     * <p>
     * Represents the rule matrix type.
     * <p>
     * 
     * @param pRuleMatrixType the new value of the <code>ruleMatrixType</code> property.
     */
    public void setRuleMatrixType(final RuleMatrixType pRuleMatrixType) {
        this.ruleMatrixType = pRuleMatrixType;
    }
}
