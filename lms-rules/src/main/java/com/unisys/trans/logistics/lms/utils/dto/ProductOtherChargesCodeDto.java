/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;

/**
 * <code>ProductOtherChargesCode</code> defines the other charge codes associated with the product code.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>productOid
 * <li>otherChargesCode
 * </code>
 * </ul>
 */
public class ProductOtherChargesCodeDto implements Serializable {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 492010597641523847L;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique identifier for <code>ProductOtherChargesCodeDto</code>.
     */

    private Long oId;

    /**
     * Attribute to hold <code>otherChargesCode</code> property.
     * <p>
     * These other charge codes which will get automatically added to the air waybill when the associated
     * product code is entered. Maximum of 3 other charges can be entered.
     */

    private String otherChargesCode;

    /**
     * Attribute to hold <code>productOid</code> property.
     * <p>
     * Unique identifier of the <code>ProductCode</code> to which the other charge codes are to be associated.
     */

    private Long productCodeOId;

    /**
     * <code>Default constructor.</code>
     */
    public ProductOtherChargesCodeDto() {

    }

    /**
     * Gets the <code>oid</code> property.
     * <p>
     * Unique identifier for <code>ProductOtherChargesCodeDto</code>.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>otherChargesCode</code> property.
     * <p>
     * These other charge codes which will get automatically added to the air waybill when the associated
     * product code is entered. Maximum of 2 other charges can be entered.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @return the current value of <code>otherChargesCode</code> of the <code>productCode</code>.<br>
     */
    public String getOtherChargesCode() {
        return this.otherChargesCode;
    }

    /**
     * Gets the <code>productOid</code> property.
     * <p>
     * Unique identifier of the <code>ProductCode</code> to which the other charge codes are to be associated.
     * <p>
     * 
     * @return the current value of the <code>productOid</code> property.<br>
     */
    public Long getProductCodeOId() {
        return this.productCodeOId;
    }

    /**
     * Sets the <code>oid</code> property.
     * <p>
     * Unique identifier for <code>ProductOtherChargesCodeDto</code>.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>otherChargesCode</code> property.
     * <p>
     * These other charge codes which will get automatically added to the air waybill when the associated
     * product code is entered. Maximum of 2 other charges can be entered.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @param pOtherChargesCode the new value of the <code>otherChargesCode</code> property.<br>
     */
    public void setOtherChargesCode(final String pOtherChargesCode) {
        this.otherChargesCode = ContractUtility.convertToUpperCase(pOtherChargesCode);
    }

    /**
     * Sets the <code>productOid</code> property.
     * <p>
     * Unique identifier of the <code>ProductCode</code> to which the other charge codes are to be associated.
     * <p>
     * 
     * @param pProductCodeOId the new value of the <code>productOid</code> property.<br>
     */
    public void setProductCodeOId(final Long pProductCodeOId) {
        this.productCodeOId = pProductCodeOId;
    }
}
