/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

/**
 * <code>AbstractCodeDto</code> represents the code and description pair.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>code</code>.
 * <li><code>description</code>.
 * </ul>
 */
public abstract class AbstractCodeDto extends PersistenceObjectDto {
    
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>code</code> property.
     */
    private String code;

    /**
     * Attribute to hold the <code>description</code> of the code property.
     */
    private String description;

    /**
     * Gets the <code>code</code> property.
     * <p>
     * <b>Format :</b><br>
     * 1 - 3 Alphanumeric
     * <p>
     * <b>Example :</b><br>
     * AW1
     * <p>
     * 
     * @return the new value of the <code>code</code> property.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Gets the <code>description</code> property.
     * <p>
     * <b>Format :</b><br>
     * 1 - 64 Any Keyboard character
     * <p>
     * <b>Example :</b><br>
     * This description is for removal reason code.
     * <p>
     * 
     * @return the new value of the <code>description</code> property.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the object identifier property.
     * <p>
     * 
     * @return the current value of the object identifier property.
     */
    public abstract Long getOId();

    /**
     * Sets the <code>code</code> property.
     * <p>
     * <b>Format :</b><br>
     * 1 - 3 Alphanumeric
     * <p>
     * <b>Example :</b><br>
     * AW1
     * <p>
     * 
     * @param pCode the new value of the <code>code</code> property.
     */
    public void setCode(final String pCode) {
        this.code = pCode;
    }

    /**
     * Sets the <code>description</code> property for the code.
     * <p>
     * <b>Format :</b><br>
     * 1 - 64 Any Keyboard character
     * <p>
     * <b>Example :</b><br>
     * This description is for removal reason code.
     * <p>
     * 
     * @param pDescription the new value of the <code>description</code> property.
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }
}
