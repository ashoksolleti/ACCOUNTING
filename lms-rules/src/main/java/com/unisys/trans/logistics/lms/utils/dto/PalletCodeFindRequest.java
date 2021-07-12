/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>PalletCodeFindRequest</code> PalletCodeFindRequest is used for finding pallet code details.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>palletCode</code>
 * </ul>
 */
public class PalletCodeFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4190345898661528278L;

    /**
     * Attribute to hold the <code>palletCode</code> property.
     * <P>
     * The pallet code provided for filtering.
     */
    private String palletCode;

    /**
     * <code>Default constructor.</code>
     */
    public PalletCodeFindRequest() {
    }

    /**
     * Gets the value of pallet code property.
     * <p>
     * <b>Format: </b>
     * <P>
     * 2 Alphanumeric
     * <P>
     * <b>Example: </b>
     * <P>
     * P1
     * <p>
     * 
     * @return the current value of the <code>palletCode</code> property.
     */
    public String getPalletCode() {
        return this.palletCode;
    }

    /**
     * Sets the value of pallet code property.
     * <p>
     * <b>Format: </b>
     * <P>
     * 2 Alphanumeric
     * <P>
     * <b>Example: </b>
     * <P>
     * P1
     * <p>
     * 
     * @param pPalletCode the new value of the <code>palletCode</code> property.
     */
    public void setPalletCode(final String pPalletCode) {
        this.palletCode = ContractUtility.convertToUpperCase(pPalletCode);
    }
}
