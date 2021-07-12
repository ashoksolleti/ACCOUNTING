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
 * <code>ProductCodeResponse</code> contains the response information for all the request to the
 * <code>ProductCodeService</code> for maintaining a <code>productCode</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>productCodes
 * <li>sortCode
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto ProductCodeDto
 */
public class ProductCodeResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1685289267781177667L;

    /**
     * Attribute to hold the list of <code>productCode</code> property.
     */
    private List<ProductCodeDto> productCodes = new ArrayList<ProductCodeDto>();

    /**
     * Attribute to hold the <code>sortCode</code> property.
     */
    private String sortCode;

    /**
     * <code>Default constructor.</code>
     */
    public ProductCodeResponse() {

    }

    /**
     * Adds the <code>ProductCodeDto</code> retrieved from the system to the list of ProductCodeDtos.
     * <p>
     * 
     * @param pProductCodeDto the new value of <code>productCode</code> property.<br>
     */
    public void addProductCode(final ProductCodeDto pProductCodeDto) {
        this.productCodes.add(pProductCodeDto);
    }

    /**
     * Gets the <code>productCodes</code> property.<br>
     * <p>
     * Refers to the list of <code>ProductCodeDto</code>.
     * <p>
     * 
     * @return the current list of <code>productCodes</code> property.<br>
     */
    public List<ProductCodeDto> getProductCodes() {
        return this.productCodes;
    }

    /**
     * Gets the <code>sortCode</code> property.<br>
     * <p>
     * <b>Format :</b><br>
     * Alphanumeric
     * <p>
     * 
     * @return the current value of <code>sortCode</code> property.<br>
     */
    public String getSortCode() {
        return this.sortCode;
    }

    /**
     * Sets the <code>productCodes</code>.
     * <p>
     * Refers to the list of <code>ProductCodeDto</code>.
     * <p>
     * 
     * @param pProductCodes the new list of <code>ProductCodeDto</code>.
     */
    public void setProductCodes(final List<ProductCodeDto> pProductCodes) {
        this.productCodes = pProductCodes;
    }

    /**
     * Sets the <code>sortCode</code> property .
     * <p>
     * <b>Format :</b><br>
     * Alphanumeric
     * <p>
     * 
     * @param pSortCode the new value of <code>sortCode</code> property .<br>
     */
    public void setSortCode(final String pSortCode) {
        this.sortCode = pSortCode;
    }
}
