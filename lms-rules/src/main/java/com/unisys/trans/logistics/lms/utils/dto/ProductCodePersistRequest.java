/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ProductCodePersistRequest</code> holds all the information required to create and update product code
 * details.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>productCode
 * <li>sortCode
 * </code>
 * </ul>
 */
public class ProductCodePersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2403190246805529119L;

    /**
     * Attribute to hold <code>productCode</code> property.
     * <p>
     * Holds all the <code>productCode</code> information.It is of type <code>ProductCodeDto</code>.
     */
    private ProductCodeDto productCode;

    /**
     * <code>Default constructor</code>.
     */
    public ProductCodePersistRequest() {

    }

    /**
     * Gets the <code>productCode</code> property.
     * <p>
     * Holds all the <code>productCode</code> information.It is of type <code>ProductCodeDto</code>.
     * <p>
     * 
     * @return the current value of <code>productCode</code>.<br>
     */
    public ProductCodeDto getProductCode() {
        return this.productCode;
    }

    /**
     * Sets the <code>productCode</code> property.<br>
     * <p>
     * 
     * @param pProductCode the new value of <code>productCode</code> property.<br>
     */
    public void setProductCode(final ProductCodeDto pProductCode) {
        this.productCode = pProductCode;
    }

}
