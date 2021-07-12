package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.constants.LanguageType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>FieldTranslationDeleteRequest</code> class is the request to delete the FieldTranslation information.
 * <p>
 * The object ID of the Field Translation being deleted is required to delete the Field Translation.
 * <code>FieldTranslationDeleteRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>oId
 * </code>
 * </ul>
 */
public class FieldTranslationDeleteRequest extends AbstractRequest {

    /**
     * unique serial version UID.
     */
    private static final long serialVersionUID = 2407580563554344693L;

    /**
     * Attribute to hold <code>fieldId</code> property.
     */
    private String fieldId;

    /**
     * Attribute to hold <code>fieldIdType</code> property.
     */
    private String fieldIdType;

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
     * default constructor.
     */
    public FieldTranslationDeleteRequest() {

    }

    /**
     * Gets the <code>fieldId</code> property.
     * 
     * @return the current value of <code>fieldId</code> property.
     */
    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * Gets the <code>fieldIdType</code> property.
     * 
     * @return the current value of <code>fieldIdType</code> property.
     */
    public String getFieldIdType() {
        return this.fieldIdType;
    }

    /**
     * Gets the <code>language</code> property.
     * 
     * @return the current value of <code>language</code> property.
     */
    public LanguageType getLanguage() {
        return this.language;
    }

    /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>page</code> property.
     * 
     * @return the current value of <code>page</code> property.
     */
    public String getPage() {
        return this.page;
    }

    /**
     * Sets the <code>fieldId</code> property.
     * 
     * @param pFieldId
     *            the new value of the <code>fieldId</code> property.
     */
    public void setFieldId(final String pFieldId) {
        this.fieldId = pFieldId;
    }

    /**
     * Sets the <code>fieldIdType</code> property.
     * 
     * @param pFieldIdType
     *            the new value of the <code>fieldIdType</code> property.
     */
    public void setFieldIdType(final String pFieldIdType) {
        this.fieldIdType = pFieldIdType;
    }

    /**
     * Sets the <code>language</code> property.
     * 
     * @param pLanguage
     *            the new value of the <code>language</code> property.
     */
    public void setLanguage(final LanguageType pLanguage) {
        this.language = pLanguage;
    }

    /**
     * Sets the <code>OId</code> property.
     * 
     * @param pOId
     *            the new value of the <code>OId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>page</code> property.
     * 
     * @param pPage
     *            the new value of the <code>page</code> property.
     */
    public void setPage(final String pPage) {
        this.page = pPage;
    }

}
