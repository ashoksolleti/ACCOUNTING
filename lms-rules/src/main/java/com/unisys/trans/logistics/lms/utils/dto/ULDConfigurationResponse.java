/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>ULDConfigurationResponse</code> contains the response of the maintenance request received by
 * <code>ULDConfiguration</code>.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <code>
 * <li>ULDConfigurationDto
 * </code>
 * </ul>
 */
public class ULDConfigurationResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3887418671234203845L;

    // As per NG standards,elements are added one by one to the assembler which eliminates the usage of a
    // setter method and thus,it is replaced by the 'addUldConfiguration' method.
    /**
     * Attribute to hold collection of <code>ULDConfigurationDto</code> object.
     */
    private final List<ULDConfigurationDto> uldConfigurations = new ArrayList<ULDConfigurationDto>(); // NOPMD

    /**
     * <code>Default constructor</code>.
     */
    public ULDConfigurationResponse() {

    }

    /**
     * Adds the <code>uldConfigurations</code> property.
     * <p>
     * 
     * @param pULDConfigurationDto the new value of the <code>uldConfigurations</code> property.
     */
    public void addUldConfiguration(final ULDConfigurationDto pULDConfigurationDto) {

        this.uldConfigurations.add(pULDConfigurationDto);
    }

    /**
     * Gets the list of <code>uldConfigurations</code> property.
     * <p>
     * 
     * @return the current value of list of <code>uldConfigurations</code> property.
     */
    public List<ULDConfigurationDto> getUldConfigurations() {
        return this.uldConfigurations;
    }

}
