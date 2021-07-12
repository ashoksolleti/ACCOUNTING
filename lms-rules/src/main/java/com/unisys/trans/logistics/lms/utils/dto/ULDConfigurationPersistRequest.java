/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ULDConfigurationPersistRequest</code> holds the attributes to create and update ULD configuration
 * information details.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>ULDConfigurationDto
 * </code>
 * </ul>
 */
public class ULDConfigurationPersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -9184762978394221606L;

    /**
     * Attribute to hold <code>ULDConfigurationDto</code> object.
     * <p>
     * This consists of all the details to persist the uldConfiguration.
     */
    private ULDConfigurationDto uldConfiguration;

    /**
     * <code>Default constructor</code>.
     * <p>
     */
    public ULDConfigurationPersistRequest() {

    }

    /**
     * Gets the <code>uldConfiguration</code> property.
     * <p>
     * 
     * @return the current value of <code>uldConfiguration</code> property.
     */
    public ULDConfigurationDto getUldConfiguration() {
        return this.uldConfiguration;
    }

    /**
     * Sets the <code>uldConfiguration</code> property.
     * <p>
     * 
     * @param pULDConfigurationDto the new value of <code>uldConfiguration</code> property.
     */
    public void setUldConfiguration(final ULDConfigurationDto pULDConfigurationDto) {
        this.uldConfiguration = pULDConfigurationDto;
    }
}
