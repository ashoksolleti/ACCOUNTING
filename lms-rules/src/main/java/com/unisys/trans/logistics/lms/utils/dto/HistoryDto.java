/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.BaseHistoryDto;

/**
 * <code>HistoryDto</code> contains specific data applicable for maintaining history.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>userId
 * <li>stationCode
 * <li>officeCode
 * <li>timeStamp
 * <li>owner
 * <li>identifier
 * <li>category
 * <li>data
 * <li>status
 * </code>
 * </ul>
 */
public class HistoryDto extends BaseHistoryDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6572408453925674467L;

    /**
     * Attribute to hold <code>category</code> property.
     * <p>
     * Specifies the type for which the history information is recorded. The type indicates the Static Data,
     * AWB, etc.
     */
    private String category;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>History</code>. It is of type Long.<br>
     */
    private Long oId;

    /**
     * Attribute to hold <code>owner</code> property.
     * <p>
     * <code>owner</code> holds the information about the static data type.
     */
    private String owner;

    /**
     * <code>Default constructor. </code>
     */
    public HistoryDto() {

    }

    /**
     * Gets the <code>category</code> property.
     * <p>
     * Specifies the type for which the history information is recorded. The type indicates the Static Data,
     * AWB, etc.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * StaticData
     * <p>
     * 
     * @return the current value of <code>category</code> property.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>owner</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * S - the owner is SpecialHandlingCode.
     * <p>
     * 
     * @return the current value of <code>owner</code> property.
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * Sets the <code>category</code> property.
     * <p>
     * Specifies the type for which the history information is recorded. The type indicates the Static Data,
     * AWB, etc.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * 
     * @param pCategory the new value of <code>category</code> property.
     */
    public void setCategory(final String pCategory) {
        this.category = pCategory;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the<code>owner</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * S - the owner is SpecialHandlingCode.
     * <p>
     * 
     * @param pOwner the new value of <code>owner</code> property.
     */
    public void setOwner(final String pOwner) {
        this.owner = pOwner;
    }
}
