/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;

/**
 * <code>TeletypeAddressTypeDto</code> holds all the attributes that are associated to a TeletypeAddressType.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>thirdPartyRefAddress
 * <li>ttyAddress
 * </code>
 * </ul>
 */
public class TeletypeAddressTypeDto implements Serializable {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1956385305697218273L;

    /**
     * Attribute to hold <code>thirdPartyRefAddress</code> property.
     */
    private String thirdPartyRefAddress;

    /**
     * Attribute to hold <code>ttyAddress</code> property.
     */
    private String ttyAddress;

    /**
     * <code>Default constructor. </code>
     */
    public TeletypeAddressTypeDto() {
    }

    /**
     * Gets the <code>thirdPartyRefAddress</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-132 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * CARGO2000 OR schenkerlogistics@schenker.com
     * <p>
     * 
     * @return the current value of <code>thirdPartyRefAddress</code> property.<br>
     */
    public final String getThirdPartyRefAddress() {
        return this.thirdPartyRefAddress;
    }

    /**
     * Gets the <code>ttyAddress</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @return the current value of <code>ttyAddress</code> property.<br>
     */
    public final String getTtyAddress() {
        return this.ttyAddress;
    }

    /**
     * Sets the <code>thirdPartyRefAddress</code> property.<br>
     * <p>
     * The <code>currency code</code> is unique and it is a predefined ISO code.
     * <p>
     * <b>Format: </b><br>
     * 1-132 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * CARGO2000 OR schenkerlogistics@schenker.com
     * <p>
     * 
     * @param pTPRAddress the new value of <code>thirdPartyRefAddress</code> property.<br>
     */
    public final void setThirdPartyRefAddress(final String pTPRAddress) {
        this.thirdPartyRefAddress = pTPRAddress;
    }

    /**
     * Sets the <code>ttyAddress</code> property.<br>
     * <p>
     * The <code>currency code</code> is unique and it is a predefined ISO code.
     * <p>
     * <b>Format: </b><br>
     * 7 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @param pTtyAddress the new value of <code>ttyAddress</code> property.<br>
     */
    public final void setTtyAddress(final String pTtyAddress) {
        this.ttyAddress = ContractUtility.convertToUpperCase(pTtyAddress);
    }
}