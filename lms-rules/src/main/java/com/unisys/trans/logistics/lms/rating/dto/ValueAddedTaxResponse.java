/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.List;

/**
 * <code>ValueAddedTaxResponse</code> contains ValueAddedTaxDto object which will be sent to the web client,
 * swing client or any other client via web service.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>valueAddedTaxes
 * </code>
 * </ul>
 */
public class ValueAddedTaxResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 4101511884673408452L;

    /**
     * Attribute to hold <code>valueAddedTaxes</code> property.
     */
    private List<ValueAddedTaxDto> valueAddedTaxes;

    /**
     * <code>Default constructor.</code>
     */
    public ValueAddedTaxResponse() {

    }

    /**
     * Gets the value of the <code>valueAddedTaxes</code> property.
     * <p>
     * 
     * @return the current value of the <code>valueAddedTaxes</code> property.<br>
     */
    public List<ValueAddedTaxDto> getValueAddedTaxes() {
        return this.valueAddedTaxes;
    }

    /**
     * Sets the value of the <code>valueAddedTaxes</code> property.
     * <p>
     * 
     * @param pValueAddedTaxDtos the new value of the <code>valueAddedTaxes</code> property.<br>
     */
    public void setValueAddedTaxes(final List<ValueAddedTaxDto> pValueAddedTaxDtos) {
        this.valueAddedTaxes = pValueAddedTaxDtos;
    }
}
