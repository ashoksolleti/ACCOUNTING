/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.List;

/**
 * <code>USGovernmentTaxResponse</code> contains USGovernmentTaxDto object which will be sent to the web
 * client, swing client or any other client via web service.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>usGovernmentTaxes
 * </code>
 * </ul>
 */
public class USGovernmentTaxResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3101236460670665364L;

    /**
     * Attribute to hold <code>usGovernmentTaxes</code> property.
     */
    private List<USGovernmentTaxDto> uSGovernmentTaxes;

    /**
     * <code>Default constructor.</code>
     */
    public USGovernmentTaxResponse() {

    }

    /**
     * Gets the value of the <code>usGovernmentTaxes</code> property.
     * <p>
     * 
     * @return the current value of the <code>uSGovernmentTaxes</code> property.<br>
     */
    public List<USGovernmentTaxDto> getUSGovernmentTaxes() {
        return this.uSGovernmentTaxes;
    }

    /**
     * Sets the value of the <code>usGovernmentTaxes</code> property.
     * <p>
     * 
     * @param pUSGovernmentTaxDtos the new value of the <code>usGovernmentTaxes</code> property.<br>
     */
    public void setUSGovernmentTaxes(final List<USGovernmentTaxDto> pUSGovernmentTaxDtos) {
        this.uSGovernmentTaxes = pUSGovernmentTaxDtos;
    }
}
