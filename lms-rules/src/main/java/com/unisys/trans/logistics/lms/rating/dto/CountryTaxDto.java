/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>CountryTaxDto</code> contains tax details of a given country.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>countryCode
 * <li>taxCode
 * <li>taxDetail
 * </code>
 * </ul>
 */
public class CountryTaxDto extends TaxDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7034527687784903040L;

    /**
     * Attribute to hold <code>countryCode</code> property.
     * <p>
     * This represents the country code where the tax is applicable.
     */
    private String countryCode;

    /**
     * Attribute to hold <code>taxCode</code> property.
     * <p>
     * The tax code is the other charge code that tax is associated with.
     */
    private String taxCode;

    /**
     * Attribute to hold <code>taxDetail</code> property.
     * <p>
     * TaxDetailDto object contains tax details for country tax and state tax.
     */
    private TaxDetailDto taxDetail;

    /**
     * <code>Default constructor.</code>
     */
    public CountryTaxDto() {

    }

    /**
     * Gets the value of the <code>countryCode</code> property.
     * <p>
     * This represents the country code where the tax is applicable.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 2.
     * <p>
     * <b>Example: </b><br>
     * US
     * <p>
     * 
     * @return the current value of the <code>countryCode</code> property.<br>
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Gets the value of the <code>taxCode</code> property.
     * <p>
     * The tax code is the other charge code that tax is associated with.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 2.
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @return the current value of the <code>taxCode</code> property.<br>
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Gets the value of the <code>taxDetail</code> property.
     * <p>
     * TaxDetailDto object contains tax details for country tax and state tax.
     * <p>
     * 
     * @return the current value of the <code>taxDetail</code> property.<br>
     */
    public TaxDetailDto getTaxDetail() {
        return this.taxDetail;
    }

    /**
     * Sets the value of <code>countryCode</code> property.
     * <p>
     * Code to denote the country for which tax is applicable.
     * <p>
     * <b>Format: </b><br>
     * Alphabets of size 2.
     * <p>
     * <b>Example: </b><br>
     * US
     * <p>
     * 
     * @param pCountryCode the new value of the <code>countryCode</code> property.<br>
     */
    public void setCountryCode(final String pCountryCode) {
        this.countryCode = ContractUtility.convertToUpperCase(pCountryCode);
    }

    /**
     * Sets the value of <code>taxCode</code> property.
     * <p>
     * The tax code is the other charge code that the tax is associated with.
     * <p>
     * <b>Format: </b><br>
     * Alphabets of size 2.
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @param pTaxCode the new value of the <code>taxCode</code> property.<br>
     */
    public void setTaxCode(final String pTaxCode) {
        this.taxCode = ContractUtility.convertToUpperCase(pTaxCode);
    }

    /**
     * Sets the value of the <code>taxDetail</code> property.
     * <p>
     * TaxDetailDto object contains tax details for country tax and state tax.
     * <p>
     * 
     * @param pTaxDetail the new value of the <code>taxDetail</code> property.<br>
     */
    public void setTaxDetail(final TaxDetailDto pTaxDetail) {
        this.taxDetail = pTaxDetail;
    }
}
