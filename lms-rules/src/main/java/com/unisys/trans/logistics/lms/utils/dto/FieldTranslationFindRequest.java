package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.constants.LanguageType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>FieldTranslationFindRequest</code> class is the request to find Field Translation information.
 * <p>
 * <code>FieldTranslationFindRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>language
 * <li>download
 * <li>fieldIdType
 * <li>fieldId
 * <li>page
 * </code>
 * </ul>
 */
public class FieldTranslationFindRequest extends AbstractRequest {

    /**
     * unique serial version UID.
     */
    private static final long serialVersionUID = -3091850818685804539L;

    /**
     * Attribute to hold the <code>download</code> property.
     */
    private boolean download;

    /**
     * Attribute to hold the <code>fieldId</code> property.
     */
    private String fieldId;

    /**
     * Attribute to hold the <code>fieldIdType</code> property.
     */
    private String fieldIdType;

    /**
     * Attribute to hold the <code>language</code> property.
     */
    private LanguageType language;

    /**
     * Attribute to hold the <code>page</code> property.
     */
    private String page;
    
    private boolean isFromDBResourbundle;
    
    

    public boolean isFromDBResourbundle() {
		return isFromDBResourbundle;
	}

	public void setFromDBResourbundle(boolean isFromDBResourbundle) {
		this.isFromDBResourbundle = isFromDBResourbundle;
	}

	/**
     * Gets the <code>fieldId</code> property.
     * <p>
     * 
     * @return the current value of the <code>fieldId</code> property.
     */
    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * Gets the <code>fieldIdType</code> property.
     * <p>
     * 
     * @return the current value of the <code>fieldIdType</code> property.
     */
    public String getFieldIdType() {
        return this.fieldIdType;
    }

    /**
     * Gets the <code>language</code> property.
     * <p>
     * 
     * @return the current value of the <code>language</code> property.
     */
    public LanguageType getLanguage() {
        return this.language;
    }

    /**
     * Gets the <code>page</code> property.
     * <p>
     * 
     * @return the current value of the <code>page</code> property.
     */
    public String getPage() {
        return this.page;
    }

    /**
     * Gets the <code>download</code> property.
     * <p>
     * 
     * @return the current value of the <code>download</code> property.
     */
    public boolean isDownload() {
        return this.download;
    }

    /**
     * Sets the <code>download</code> property.
     * 
     * @param pDownload the new value of the <code>download</code> property.
     */
    public void setDownload(final boolean pDownload) {
        this.download = pDownload;
    }

    /**
     * Sets the <code>fieldId</code> property.
     * 
     * @param pFieldId the new value of the <code>fieldId</code> property.
     */
    public void setFieldId(final String pFieldId) {
        this.fieldId = pFieldId;
    }

    /**
     * Sets the <code>fieldIdType</code> property.
     * 
     * 
     * @param pFieldIdType the new value of the <code>fieldIdType</code> property.
     */
    public void setFieldIdType(final String pFieldIdType) {
        this.fieldIdType = pFieldIdType;
    }

    /**
     * Sets the <code>language</code> property.
     * 
     * @param pLanguage the new value of the <code>language</code> property.
     */
    public void setLanguage(final LanguageType pLanguage) {
        this.language = pLanguage;
    }

    /**
     * Sets the <code>page</code> property.
     * 
     * 
     * @param pPage the new value of the <code>page</code> property.
     */
    public void setPage(final String pPage) {
        this.page = pPage;
    }

}
