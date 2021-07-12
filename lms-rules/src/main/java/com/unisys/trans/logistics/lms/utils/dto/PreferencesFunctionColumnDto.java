/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>PreferencesFunctionColumnDto</code> class contain information specific
 * to a PreferencesFunctionColumn.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>columnFormat
 * <li>columnJsfEL
 * <li>columnLabel
 * <li>columnName
 * <li>columnStyleClass
 * <li>dataStyleClass
 * <li>immutableJSFEL
 * <li>oId
 * <li>preferencesFunction
 * </code>
 * </ul>
 */
public class PreferencesFunctionColumnDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2802868536569417069L;

    /**
     * Attribute to hold <code>columnFormat</code> property.
     */
    private String columnFormat;

    /**
     * Attribute to hold <code>columnJsfEL</code> property.
     */
    private String columnJsfEL;

    /**
     * Attribute to hold <code>columnFilter</code> property.
     */
    private String columnFilter;

    /**
     * Attribute to hold <code>columnLabel</code> property.
     */
    private String columnLabel;

    /**
     * Attribute to hold <code>columnName</code> property.
     */
    private String columnName;

    /**
     * Attribute to hold <code>columnStyleClass</code> property.
     */
    private String columnStyleClass;

    /**
     * Attribute to hold <code>dataStyleClass</code> property.
     */
    private String dataStyleClass;

    /**
     * Attribute to hold <code>immutableJSFEL</code> property.
     */
    private String immutableJSFEL;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>preferencesFunction</code> property.
     */
    private PreferencesFunctionDto preferencesFunction;

    private String functionGroup;

    private String columnWidth;

    /**
     * Attribute to hold <code>propertyName</code> property.
     */
    private String propertyName;

    /**
     * Attribute to hold <code>preferencesFunction</code> property.
     */
    private PreferencesFunctionEntityDto preferencesFunctionEntity;


    /**
     * Gets the <code>agentCommission</code> property.
     * <p>
     *
     * @return the current value of the <code>AgentCommission</code> property.
     */
    public String getColumnFormat() {
        return this.columnFormat;
    }

    /**
     * Gets the <code>columnJsfEL</code> property.
     * <p>
     *
     * @return the current value of the <code>columnJsfEL</code> property.
     */
    public String getColumnJsfEL() {
        return this.columnJsfEL;
    }

    /**
     * Gets the <code>columnFilter</code> property.
     * <p>
     *
     * @return the current value of the <code>columnFilter</code> property.
     */
    public String getColumnFilter() {
        return columnFilter;
    }

    /**
     * Gets the <code>columnLabel</code> property.
     * <p>
     *
     * @return the current value of the <code>columnLabel</code> property.
     */
    public String getColumnLabel() {
        return this.columnLabel;
    }

    /**
     * Gets the <code>columnName</code> property.
     * <p>
     *
     * @return the current value of the <code>columnName</code> property.
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * Gets the <code>columnStyleClass</code> property.
     * <p>
     *
     * @return the current value of the <code>columnStyleClass</code> property.
     */
    public String getColumnStyleClass() {
        return this.columnStyleClass;
    }

    /**
     * Gets the <code>dataStyleClass</code> property.
     * <p>
     *
     * @return the current value of the <code>dataStyleClass</code> property.
     */
    public String getDataStyleClass() {
        return this.dataStyleClass;
    }

    /**
     * Gets the <code>immutableJSFEL</code> property.
     * <p>
     *
     * @return the current value of the <code>immutableJSFEL</code> property.
     */
    public String getImmutableJSFEL() {
        return this.immutableJSFEL;
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
     * Gets the <code>preferencesFunction</code> property.
     * <p>
     *
     * @return the current value of the <code>preferencesFunction</code> property.
     */
    public PreferencesFunctionDto getPreferencesFunction() {
        return this.preferencesFunction;
    }

    /**
     * Sets the <code>columnFormat</code> property.
     * <p>
     *
     * @param pColumnFormat
     *            the current value of the <code>columnFormat</code> property.
     */
    public void setColumnFormat(final String pColumnFormat) {
        this.columnFormat = pColumnFormat;
    }

    /**
     * Sets the <code>columnJsfEL</code> property.
     * <p>
     *
     * @param pColumnJsfEL
     *            the current value of the <code>columnJsfEL</code> property.
     */
    public void setColumnJsfEL(final String pColumnJsfEL) {
        this.columnJsfEL = pColumnJsfEL;
    }

    /**
     * Sets the <code>columnFilter</code> property.
     * <p>
     *
     * @param pColumnFilter
     *            the current value of the <code>columnFilter</code> property.
     */
    public void setColumnFilter(String columnFilter) {
        this.columnFilter = columnFilter;
    }


    /**
     * Sets the <code>columnLabel</code> property.
     * <p>
     *
     * @param pColumnLabel
     *            the current value of the <code>columnLabel</code> property.
     */
    public void setColumnLabel(final String pColumnLabel) {
        this.columnLabel = pColumnLabel;
    }

    /**
     * Sets the <code>columnName</code> property.
     * <p>
     *
     * @param pColumnName
     *            the current value of the <code>columnName</code> property.
     */
    public void setColumnName(final String pColumnName) {
        this.columnName = pColumnName;
    }

    /**
     * Sets the <code>columnStyleClass</code> property.
     * <p>
     *
     * @param pColumnStyleClass
     *            the current value of the <code>columnStyleClass</code> property.
     */
    public void setColumnStyleClass(final String pColumnStyleClass) {
        this.columnStyleClass = pColumnStyleClass;
    }

    /**
     * Sets the <code>dataStyleClass</code> property.
     * <p>
     *
     * @param pDataStyleClass
     *            the current value of the <code>dataStyleClass</code> property.
     */
    public void setDataStyleClass(final String pDataStyleClass) {
        this.dataStyleClass = pDataStyleClass;
    }

    /**
     * Sets the <code>immutableJSFEL</code> property.
     * <p>
     *
     * @param pImmutableJSFEL
     *            the current value of the <code>immutableJSFEL</code> property.
     */
    public void setImmutableJSFEL(final String pImmutableJSFEL) {
        this.immutableJSFEL = pImmutableJSFEL;
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
     * Sets the <code>preferencesFunction</code> property.
     * <p>
     *
     * @param pPreferencesFunction
     *            the current value of the <code>preferencesFunction</code> property.
     */
    public void setPreferencesFunction(
            final PreferencesFunctionDto pPreferencesFunction) {
        this.preferencesFunction = pPreferencesFunction;
    }

    public String getFunctionGroup() {
        return functionGroup;
    }

    public void setFunctionGroup(String functionGroup) {
        this.functionGroup = functionGroup;
    }

    public PreferencesFunctionEntityDto getPreferencesFunctionEntity() {
        return preferencesFunctionEntity;
    }

    public void setPreferencesFunctionEntity(
            PreferencesFunctionEntityDto preferencesFunctionEntity) {
        this.preferencesFunctionEntity = preferencesFunctionEntity;
    }

    public String getColumnWidth() {
        return columnWidth;
    }

    public void setColumnWidth(String columnWidth) {
        this.columnWidth = columnWidth;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

}
