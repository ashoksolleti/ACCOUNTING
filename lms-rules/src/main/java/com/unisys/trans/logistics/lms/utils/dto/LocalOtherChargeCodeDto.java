/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>LocalOtherChargeCodeDto</code> contain details of LocalOtherChargeCodeDto.
 * <p>
 * This contains all information about LocalOtherChargeCode.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>lmsDatabaseKey
 * <li>languageId
 * <li>oId
 * <li>description
 * <li>otherChargeCode
 * </ul>
 */

public class LocalOtherChargeCodeDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8364956692387752505L;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Attribute to hold <code>lmsDatabaseKey</code> property.
     */

    private String lmsDatabaseKey;

    /**
     * Attribute to hold <code>languageId</code> property.
     */

    private String languageId;

    /**
     * Attribute to hold <code>description</code> property.
     */

    private String description;

    /**
     * Attribute to hold <code>otherChargeCode</code> property.
     */
    private String otherChargeCode;

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Gets the <code>lmsDatabaseKey</code> property.
     * <p>
     * <b>Format: </b><br>
     * 12 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 8234787838
     * <p>
     * 
     * @return the current value of the <code>lmsDatabaseKey</code> property.
     */
    public String getLmsDatabaseKey() {
        return this.lmsDatabaseKey;
    }

    /**
     * Sets the <code>lmsDatabaseKey</code> property.
     * <p>
     * <b>Format: </b><br>
     * 12 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 8234787838
     * <p>
     * 
     * @param pLmsDatabaseKey
     *            the new value of the <code>lmsDatabaseKey</code> property.
     */
    public void setLmsDatabaseKey(final String pLmsDatabaseKey) {
        this.lmsDatabaseKey = pLmsDatabaseKey;
    }

    /**
     * Gets the <code>languageId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 12 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * Chinese
     * <p>
     * 
     * @return the current value of the <code>languageId</code> property.
     */

    public String getLanguageId() {
        return this.languageId;
    }

    /**
     * Sets the <code>languageId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 12 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * Chinese
     * <p>
     * 
     * @param pLanguageId
     *            the new value of the <code>languageId</code> property.
     */
    public void setLanguageId(final String pLanguageId) {
        this.languageId = pLanguageId;
    }

    /**
     * Gets the <code>description</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-50 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * description
     * <p>
     * 
     * @return the current value of the <code>description</code> property.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * Sets the <code>description</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-50 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * description
     * <p>
     * 
     * @param pDescription
     *            the new value of the <code>description</code> property.
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Gets the <code>otherChargeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 45
     * <p>
     * 
     * @return the current value of the <code>otherChargeCode</code> property.
     */
    public String getOtherChargeCode() {
        return this.otherChargeCode;
    }

    /**
     * Sets the <code>otherChargeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 45
     * <p>
     * 
     * @param pOtherChargeCode
     *            the new value of the <code>otherChargeCode</code> property.
     */
    public void setOtherChargeCode(final String pOtherChargeCode) {
        this.otherChargeCode = pOtherChargeCode;
    }

}
