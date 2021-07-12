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
 * <code>PalletCodeResponse</code>contains the response of the maintenance request received by
 * PalletCodeService.
 * <p>
 * This contains the following attribute:<br>
 * <ul>
 * <li><code>palletCodes</code>
 * </ul>
 */
public class PalletCodeResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8767455188553259558L;

    /**
     * Attribute to hold collection of <code>PalletCodeDto</code> object.<br>
     */
    private List<PalletCodeDto> palletCodes = new ArrayList<PalletCodeDto>();

    /**
     * <code>Default constructor.</code>
     */
    public PalletCodeResponse() {
    }

    /**
     * Gets the operation for the <code>PalletCodes</code>.
     * <p>
     * 
     * @return the current value of the <code>palletCodes</code> property.
     */
    public List<PalletCodeDto> getPalletCodes() {
        return this.palletCodes;
    }

    /**
     * Sets the operation for the <code>PalletCodes</code>.
     * <p>
     * 
     * @param pPalletCodes the new value of the <code>palletCodes</code> property.<br>
     */
    public void setPalletCodes(final List<PalletCodeDto> pPalletCodes) {
        this.palletCodes = pPalletCodes;
    }
}
