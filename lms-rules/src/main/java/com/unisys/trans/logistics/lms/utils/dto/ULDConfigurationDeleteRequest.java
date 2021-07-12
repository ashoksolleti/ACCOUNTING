/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ULDConfigurationDeleteRequest</code> holds the attributes to delete the ULD configuration for a given
 * ULDPrefix.
 * <p>
 * This Deletes the ULDConfiguration based on the uldPrefix and oId.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>uldPrefix
 * </code>
 * </ul>
 */
public class ULDConfigurationDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3824830607642063022L;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>ULDConfiguration</code>.
     */
    private Long oId;

    /**
     * Attribute to hold <code>uldPrefix</code> property.
     * <p>
     * Aircraft type and carrier code cannot have duplicates for a specific ULD prefix which exists in the
     * system.
     */
    private String uldPrefix;

    /**
     * <code>Default constructor.</code>
     */
    public ULDConfigurationDeleteRequest() {

    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
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
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
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
     * AVE
     * <p>
     * 
     * @param pULDPrefix the new value of the <code>uldPrefix</code> property.
     */
    public void setUldPrefix(final String pULDPrefix) {
        this.uldPrefix = pULDPrefix;
    }

}
