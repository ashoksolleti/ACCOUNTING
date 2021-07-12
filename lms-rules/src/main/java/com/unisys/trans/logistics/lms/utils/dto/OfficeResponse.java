/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.Set;

/**
 * The response to the maintenance request processed by the OfficeService.
 */
public class OfficeResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6310210532410549517L;

    /**
     * Attribute to hold the <code>office</code> property.
     * <p>
     * Reference of <code>OfficeDto</code> which holds the office information.
     */
    private Set<OfficeDto> office;

    /**
     * <code>Default Constructor.</code>
     */
    public OfficeResponse() {

    }

    /**
     * Gets the <code>Office</code> property.<br>
     * <p>
     * 
     * @return the current value of the <code>office</code> property.<br>
     */
    public Set<OfficeDto> getOffice() {
        return this.office;
    }

    /**
     * Sets the <code>office</code> property.
     * <p>
     * 
     * @param pOfficeDto the new value of the <code>office</code> property.
     */
    public void setOffice(final Set<OfficeDto> pOfficeDto) {
        this.office = pOfficeDto;
    }

}
