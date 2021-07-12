/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.List;

/**
 * <code>StateTaxResponse</code> contains StateTaxDto object which will be sent to the web client, swing
 * client or any other client via web service.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>stateTaxes
 * </code>
 * </ul>
 */
public class StateTaxResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6182218377785943060L;

    /**
     * Attribute to hold <code>stateTaxes</code> property.
     */
    private List<StateTaxDto> stateTaxes;

    /**
     * <code>Default constructor.</code>
     */
    public StateTaxResponse() {

    }

    /**
     * Gets the value of the <code>stateTaxes</code> property.
     * <p>
     * 
     * @return the current value of the <code>stateTaxes</code> property.<br>
     */
    public List<StateTaxDto> getStateTaxes() {
        return this.stateTaxes;
    }

    /**
     * Sets the value of the <code>stateTaxes</code> property.
     * <p>
     * 
     * @param pStateTaxDtos the new value of the <code>stateTaxes</code> property.<br>
     */
    public void setStateTaxes(final List<StateTaxDto> pStateTaxDtos) {
        this.stateTaxes = pStateTaxDtos;
    }
}
