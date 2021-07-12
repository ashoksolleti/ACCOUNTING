package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.dto.constants.operation.PLTMandatoryFieldType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.PLTRulesResponseType;



/**
 * <code>AllotmentEvaluatorStatusDto</code> holds the attributes that determine
 * Allotment Evaluator Status.<br>
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 *  * </code>
 * </ul>
 */
public class PLTRulesEvaluatorStatusDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>source</code> property.
     */
    private String source;

    /**
     * Attribute to hold <code>ruleIdentificationName</code> property.
     */
    private String ruleIdentificationName;

    /**
     * Attribute to hold <code>PLTRulesResponseType</code> property.
     */
    private PLTRulesResponseType responseType;

    /**
     * Attribute to hold <code>PLTMandatoryFieldType</code> property.
     */
    private PLTMandatoryFieldType pltMandatoryField;

    /**
     * Gets the <code>source</code> property.
     * 
     * @return the current value of the <code>source</code> property.
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Sets the <code>source</code> property.
     * 
     * @param pSource
     *            the current value of the <code>source</code> property.
     */
    public void setSource(final String pSource) {
        this.source = pSource;
    }

    /**
     * Gets the <code>ruleIdentificationName</code> property.
     * 
     * @return the current value of the <code>ruleIdentificationName</code> property.
     */
    public String getRuleIdentificationName() {
        return this.ruleIdentificationName;
    }

    /**
     * Sets the <code>ruleIdentificationName</code> property.
     * 
     * @param pRuleIdentificationName
     *            the current value of the <code>ruleIdentificationName</code> property.
     */
    public void setRuleIdentificationName(final String pRuleIdentificationName) {
        this.ruleIdentificationName = pRuleIdentificationName;
    }

    /**
     * Gets the <code>responseType</code> property.
     * 
     * @return the current value of the <code>responseType</code> property.
     */
    public PLTRulesResponseType getResponseType() {
        return this.responseType;
    }

    /**
     * Sets the <code>responseType</code> property.
     * 
     * @param pResponseType
     *            the current value of the <code>responseType</code> property.
     */
    public void setResponseType(final PLTRulesResponseType pResponseType) {
        this.responseType = pResponseType;
    }

    /**
     * Gets the <code>pltMandatoryField</code> property.
     * 
     * @return the current value of the <code>pltMandatoryField</code> property.
     */
    public PLTMandatoryFieldType getPltMandatoryField() {
        return this.pltMandatoryField;
    }

    /**
     * Sets the <code>pltMandatoryField</code> property.
     * 
     * @param pPltMandatoryField
     *            the current value of the <code>pltMandatoryField</code> property.
     */
    public void setPltMandatoryField(final PLTMandatoryFieldType pPltMandatoryField) {
        this.pltMandatoryField = pPltMandatoryField;
    }

}
