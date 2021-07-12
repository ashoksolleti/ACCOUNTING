/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;

/**
 * <code>ProductSpecialHandlingCode</code> defines the special handling code associated with the product code.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>oId
 * <li>productOid
 * <li>specialHandlingCode
 * </code>
 * </ul>
 */
public class ProductSpecialHandlingCodeDto implements Serializable {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2033666491238460031L;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique identifier for <code>ProductSpecialHandlingCodeDto</code>.
     */

    private Long oId;

    /**
     * Attribute to hold <code>productOId</code> property.
     * <p>
     * Unique identifier of the <code>ProductCode</code> to which the special handling codes are to be
     * associated.
     */

    private Long productOId;

    /**
     * Attribute to hold <code>specialHandlingCode</code> property.
     * <p>
     * Special handling codes associated with the product code.Maximum of 5 are allowed.
     */

    private String specialHandlingCode;

    /**
     * <code>Default constructor.</code>
     */
    public ProductSpecialHandlingCodeDto() {

    }

    /**
     * Gets the <code>oid</code> property.
     * <p>
     * Unique identifier for <code>ProductSpecialHandlingCodeDto</code>.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>productOid</code> property.
     * <p>
     * Unique identifier of the <code>ProductCode</code> to which the special handling codes are to be
     * associated.
     * <p>
     * 
     * @return the current value of the <code>productOid</code> property.<br>
     */
    public Long getProductOId() {
        return this.productOId;
    }

    /**
     * Gets the <code>specialHandlingCode</code> property.
     * <p>
     * Special handling codes associated with the product code.Maximum of 5 are allowed.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * HEA
     * <p>
     * 
     * @return the current value of <code>specialHandlingCode</code> property.
     */
    public String getSpecialHandlingCode() {
        return this.specialHandlingCode;
    }

    /**
     * Sets the <code>oid</code> property.
     * <p>
     * Unique identifier for <code>ProductSpecialHandlingCodeDto</code>.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>productOid</code> property.
     * <p>
     * Unique identifier of the <code>ProductCode</code> to which the special handling codes are to be
     * associated.
     * <p>
     * 
     * @param pProductOid the new value of the <code>productOid</code> property.<br>
     */
    public void setProductOId(final Long pProductOid) {
        this.productOId = pProductOid;
    }

    /**
     * Sets the <code>specialHandlingCode</code> property.
     * <p>
     * Special handling codes associated with the product code.Maximum of 5 are allowed.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * HEA
     * <p>
     * 
     * @param pSpecialHandlingCode the new value of the <code>specialHandlingCode</code> property.<br>
     */
    public void setSpecialHandlingCode(final String pSpecialHandlingCode) {
        this.specialHandlingCode = ContractUtility.convertToUpperCase(pSpecialHandlingCode);
    }
}
