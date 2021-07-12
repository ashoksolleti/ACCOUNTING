/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>PalletCodePersistRequest</code> is used to create and update pallet code.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>palletCode</code>
 * </ul>
 */
public class PalletCodePersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1333612353878266654L;

    /**
     * <code>Pallet code data transfer object.</code>
     */
    private PalletCodeDto palletCode;

    /**
     * <code>Default Constructor</code>.
     * <p>
     */
    public PalletCodePersistRequest() {
    }

    /**
     * Gets the <code>pallet code</code> data transfer object.
     * <p>
     * 
     * @return the current value of the <code>palletCode</code> property.
     */
    public PalletCodeDto getPalletCode() {
        return this.palletCode;
    }

    /**
     * Sets the <code>pallet code</code> data transfer object.
     * <p>
     * 
     * @param pPalletCode the new value of the <code>palletCode</code> property.<br>
     */
    public void setPalletCode(final PalletCodeDto pPalletCode) {

        this.palletCode = pPalletCode;
    }
}
