/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ULDConfigurationFindRequest</code> holds the attributes to find the ULD configuration.
 * <p>
 * This Finds the list of ULDConfiguration for the ULD prefix.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>uldPrefix
 * </code>
 * </ul>
 */
public class ULDConfigurationFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3285414801012216569L;

    /**
     * Attribute to hold <code>uldPrefix</code> property.
     * <p>
     * Aircraft type and carrier code cannot have duplicates for a specific ULD prefix which exists in the
     * system.
     */
    private String uldPrefix;

    /**
     * <code>Default constructor</code>.
     */
    public ULDConfigurationFindRequest() {

    }

    /**
     * Gets the <code>uldPrefix</code> property.
     * <p>
     * Aircraft type and carrier code cannot have duplicates for a specific ULD prefix which exists in the
     * system.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * AVE
     * <p>
     * 
     * @return the current value of the <code>uldPrefix</code> property.
     */
    public String getUldPrefix() {
        return this.uldPrefix;
    }

    /**
     * Sets the <code>uldPrefix</code> property.
     * <p>
     * Aircraft type and carrier code cannot have duplicates for a specific ULD prefix which exists in the
     * system.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * LLB
     * <p>
     * 
     * @param pUldPrefix the new value of the <code>uldPrefix</code> property.
     */
    public void setUldPrefix(final String pUldPrefix) {
        this.uldPrefix = ContractUtility.convertToUpperCase(pUldPrefix);
    }
}
