/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

/**
 * <code>ParameterHistory</code> entity holds history of static data.
 * <p>
 * History is recorded whenever there is creation, modification or deletion of these static data.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>category
 * <li>data
 * <li>identifier
 * <li>officeCode
 * <li>oId
 * <li>owner
 * <li>stationCode
 * <li>status
 * <li>timeStamp
 * <li>userId
 * </code>
 * </ul>
 */
public class ParameterHistoryDto extends BaseHistoryDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2279449963104497894L;

    /**
     * Attribute to hold <code>category</code> property.
     * <p>
     * Specifies the type for which the history information is recorded. The type indicates the Static Data,
     * AWB, etc.
     */
    private String category;

    /**
     * Attribute to hold <code>newName</code> property.
     * <p>
     * <code>newName</code> holds the information about the static data type.
     */
    private String newValue;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>History</code>. It is of type Long.<br>
     */
    private Long oId;

    /**
     * Attribute to hold <code>oldValue</code> property.
     * <p>
     * <code>oldValue</code> holds the information about the static data type.
     */
    private String oldValue;

    /**
     * Attribute to hold <code>owner</code> property.
     * <p>
     * <code>owner</code> holds the information about the static data type.
     */
    private String owner;

    /**
     * <code>Default constructor. </code>
     */
    public ParameterHistoryDto() {

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
     * Gets the <code>newValue</code> property.
     * <p>
     * returns the new value assigned to the parameter.
     * <p>
     * <b>Format: </b><br>
     * String
     * <p>
     * 
     * @return the current value of <code>newName</code> property.
     * 
     */
    public String getNewValue() {
        return this.newValue;
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
     * Gets the <code>oldValue</code> property.
     * <p>
     * returns the old value assigned to the parameter.
     * <p>
     * <b>Format: </b><br>
     * String
     * <p>
     * 
     * @return the current value of <code>oldValue</code> property.
     */
    public String getOldValue() {
        return this.oldValue;
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
     * Sets the <code>newValue</code> property.
     * <p>
     * Specifies the new value assigned to the parameter
     * <p>
     * <b>Format: </b><br>
     * Alphabet.
     * <p>
     * 
     * @param pNewValue the new value of <code>newValue</code> property.
     */
    public void setNewValue(final String pNewValue) {
        this.newValue = pNewValue;
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
     * Sets the <code>oldValue</code> property.
     * <p>
     * hold the old value assigned to the parameter
     * <p>
     * <b>Format: </b><br>
     * Alphabet.
     * <p>
     * 
     * @param pOldValue the value of <code>oldValue</code> property.
     */
    public void setOldValue(final String pOldValue) {
        this.oldValue = pOldValue;
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
