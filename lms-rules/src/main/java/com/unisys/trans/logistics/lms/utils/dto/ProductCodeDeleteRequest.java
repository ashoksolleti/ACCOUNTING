/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ProductCodeDeleteRequest</code> holds the information required to delete a <code>ProductCode</code>
 * <p>
 * The object ID of the product to be deleted is required to delete the product code.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>oId
 * <li>sortCode
 * <li>productCode
 * </code>
 * </ul>
 */
public class ProductCodeDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2373228131931027600L;

    /**
     * Attribute to hold the <code>objectId.</code> property.
     * <p>
     * Unique identifier for <code>ProductCodeDeleteRequest</code>
     */
    private Long oId;

    /**
     * Attribute to hold the <code>productCode</code> property.
     * <p>
     * Represents the <code>productCode</code> that has to be deleted.
     */
    private String productCode;

    /**
     * <code>Default Constructor.</code>
     */
    public ProductCodeDeleteRequest() {

    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique identifier for <code>ProductCodeDeleteRequest</code>.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>productCode</code> property.
     * <p>
     * Represents the <code>productCode</code> that has to be deleted.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @return the current value of the <code>productCode</code> property.<br>
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * Unique identifier for <code>ProductCodeDeleteRequest</code>.
     * <p>
     * 
     * @param pOid the new value of the <code>OId</code> property.<br>
     */
    public void setOId(final Long pOid) {
        this.oId = pOid;
    }

    /**
     * Sets the <code>productCode</code> property.
     * <p>
     * Represents the <code>productCode</code> that has to be deleted.
     * <p>
     * 
     * @param pProductCode the new value of the <code>ProductCode</code> property.<br>
     */
    public void setProductCode(final String pProductCode) {
        this.productCode = pProductCode;
    }

}
