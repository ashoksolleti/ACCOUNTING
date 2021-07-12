/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>HistoryDeleteRequest</code> is used for delete history of static data.
 * <p>
 * It deletes the history of static data based on the category, identifier and owner.
 * <ul>
 * <li>If the identifier is found then it deletes the list of history of static data for a particular
 * owner.
 * </ul>
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>owner
 * <li>identifier
 * <li>category
 * </code>
 * </ul>
 */
public class HistoryDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2518131738287604068L;

    /**
     * Attribute to hold <code>category</code> property.
     * <p>
     * Specifies the type for which the history information is recorded. The type indicates the Static Data,
     * AWB, etc.
     */
    private String category;

    /**
     * Attribute to hold <code>historyRateType</code> property.
     * <p>
     * <code>historyRateType</code> holds the key information for identifying data.
     */
    private int historyRateType;

    /**
     * Attribute to hold <code>owner</code> property.
     * <p>
     * <code>owner</code> holds the information about the static data type.
     */
    private String owner;

    /**
     * <code>Default constructor.</code>
     */
    public HistoryDeleteRequest() {

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
     * @return category the current value of <code>category</code> property.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Gets the <code>historyRateType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * AVI - the special handling code key when the owner is SpecialHandlingCode.
     * <p>
     * 
     * @return identifier the current value of <code>historyRateType</code> property.
     */
    public int getHistoryRateType() {
        return this.historyRateType;
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
     * @return owner the current value of <code>owner</code> property.
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
        this.category = ContractUtility.convertToUpperCase(pCategory);
    }

    /**
     * Sets the <code>historyRateType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * AVI - the special handling code key when the owner is SpecialHandlingCode.
     * <p>
     * 
     * @param pHistoryRateType the new value of <code>historyRateType</code> property.
     */
    public void setHistoryRateType(final int pHistoryRateType) {
        this.historyRateType = pHistoryRateType;
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
