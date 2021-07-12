package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.constants.LanguageType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>FieldTranslationDto</code> holds all the attributes that are associated to an Edit Field Translation.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>fieldId
 * <li>fieldIdType
 * <li>fieldValue
 * <li>language
 * <li>oId
 * <li>page
 * <li>rowIndex
 * </code>
 * </ul>
 */

public class FieldTranslationDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5167759941092673449L;

    /**
     * Attribute to hold <code>fieldId</code> property.
     */
    private String fieldId;

    /**
     * Attribute to hold <code>fieldIdType</code> property.
     */
    private String fieldIdType;

    /**
     * Attribute to hold <code>fieldValue</code> property.
     */
    private String fieldValue;

    /**
     * Attribute to hold <code>language</code> property.
     */
    private LanguageType language;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>page</code> property.
     */
    private String page;

    /**
     * Gets the <code>fieldId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-200 Y<br>
     * <p>
     * <b>Example: </b><br>
     * accept_acceptance_lbl
     * <p>
     * 
     * @return the current value of <code>fieldId</code> property.<br>
     */
    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * Gets the <code>fieldIdType</code> property.
     * <p>
     * <b>Format: </b><br>
     * List<br>
     * <p>
     * <b>Example: </b><br>
     * Rollover
     * <p>
     * 
     * @return the current value of <code>fieldIdType</code> property.<br>
     */
    public String getFieldIdType() {
        return this.fieldIdType;
    }

    /**
     * Gets the <code>fieldValue</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-600 Z<br>
     * <p>
     * <b>Example: </b><br>
     * Display the booking flights associated with the AWB.
     * <p>
     * 
     * @return the current value of <code>fieldValue</code> property.<br>
     */
    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * Gets the <code>language</code> property.
     * <p>
     * <b>Format: </b><br>
     * List<br>
     * <p>
     * <b>Example: </b><br>
     * Language
     * <p>
     * 
     * @return the current value of <code>language</code> property.<br>
     */
    public LanguageType getLanguage() {
        return this.language;
    }

    /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {

        return this.oId;
    }

    /**
     * Gets the <code>Page</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-100 X<br>
     * <p>
     * <b>Example: </b><br>
     * Accept Goods
     * <p>
     * 
     * @return the current value of <code>Page</code> property.<br>
     */
    public String getPage() {
        return this.page;
    }

    /**
     * Sets the <code>fieldId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-200 Y<br>
     * <p>
     * <b>Example: </b><br>
     * accept_acceptance_lbl
     * <p>
     * 
     * @param pFieldId the new value of <code>fieldId</code> property.<br>
     */
    public void setFieldId(final String pFieldId) {
        this.fieldId = pFieldId;
    }

    /**
     * Sets the <code>fieldIdType</code> property.
     * <p>
     * <b>Format: </b><br>
     * List<br>
     * <p>
     * <b>Example: </b><br>
     * Rollover
     * <p>
     * 
     * @param pFieldIdType the new value of <code>fieldIdType</code> property.<br>
     */
    public void setFieldIdType(final String pFieldIdType) {
        this.fieldIdType = pFieldIdType;
    }

    /**
     * Sets the <code>fieldValue</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-600 Z<br>
     * <p>
     * <b>Example: </b><br>
     * Display the booking flights associated with the AWB.
     * <p>
     * 
     * @param pFieldValue the new value of <code>fieldValue</code> property.<br>
     */
    public void setFieldValue(final String pFieldValue) {
        this.fieldValue = pFieldValue;
    }

    /**
     * Sets the <code>language</code> property.
     * <p>
     * <b>Format: </b><br>
     * List<br>
     * <p>
     * <b>Example: </b><br>
     * Language
     * <p>
     * 
     * @param pLanguage the new value of <code>language</code> property.<br>
     */
    public void setLanguage(final LanguageType pLanguage) {
        this.language = pLanguage;
    }

    /**
     * Sets the <code>oId</code> property.
     * 
     * 
     * @param pOId the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>page</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-100 X<br>
     * <p>
     * <b>Example: </b><br>
     * Accept Goods
     * <p>
     * 
     * @param pPage the new value of <code>page</code> property.<br>
     */
    public void setPage(final String pPage) {
        this.page = pPage;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final StringBuffer commaSeperatedValue = new StringBuffer(300);
        commaSeperatedValue.append(this.language).append(",");
        commaSeperatedValue.append(this.page).append(",");
        commaSeperatedValue.append(this.fieldId).append(",");
        commaSeperatedValue.append(this.fieldValue);
        return commaSeperatedValue.toString();

    }

}
