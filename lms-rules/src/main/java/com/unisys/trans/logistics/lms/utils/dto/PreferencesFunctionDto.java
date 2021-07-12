/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code> PreferencesFunctionDto</code> holds all the information related to PrefencesFunctionDto.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li>elExpression
 * <li>functionName
 * <li>oId
 * <li>originalColumns
 * <li>variable
 * </ul>
 */

public class PreferencesFunctionDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2802868536569417069L;

    /**
     * Attribute to hold <code>elExpression</code> property.
     */
    private String elExpression;

    /**
     * Attribute to hold <code>functionName</code> property.
     */
    private String functionName;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>originalColumns</code> property.
     */
    private List<PreferencesFunctionColumnDto> originalColumns;

    /**
     * Attribute to hold <code>variable</code> property.
     */
    private String variable;

    /**
     * Gets the <code>elExpression</code> property.
     * <p>
     * 
     * @return the current value of the <code>elExpression</code> property.
     */
    public String getElExpression() {
        return this.elExpression;
    }

    /**
     * Gets the <code>functionName</code> property.
     * <p>
     * 
     * @return the current value of the <code>functionName</code> property.
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>originalColumns</code> property.
     * <p>
     * 
     * @return the current value of the <code>originalColumns</code> property.
     */
    public List<PreferencesFunctionColumnDto> getOriginalColumns() {
        return this.originalColumns;
    }

    /**
     * Gets the <code>variable</code> property.
     * <p>
     * 
     * @return the current value of the <code>variable</code> property.
     */
    public String getVariable() {
        return this.variable;
    }

    /**
     * Sets the <code>elExpression</code> property.
     * <p>
     * 
     * @param pElExpression
     *            the current value of the <code>elExpression</code> property.
     */
    public void setElExpression(final String pElExpression) {
        this.elExpression = pElExpression;
    }

    /**
     * Sets the <code>functionName</code> property.
     * <p>
     * 
     * @param pFunctionName
     *            the current value of the <code>functionName</code> property.
     */
    public void setFunctionName(final String pFunctionName) {
        this.functionName = pFunctionName;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>originalColumns</code> property.
     * <p>
     * 
     * @param pOriginalColumns
     *            the current value of the <code>originalColumns</code> property.
     */
    public void setOriginalColumns(
                final List<PreferencesFunctionColumnDto> pOriginalColumns) {
        this.originalColumns = pOriginalColumns;
    }

    /**
     * Sets the <code>variable</code> property.
     * <p>
     * 
     * @param pVariable
     *            the current value of the <code>variable</code> property.
     */
    public void setVariable(final String pVariable) {
        this.variable = pVariable;
    }

}
