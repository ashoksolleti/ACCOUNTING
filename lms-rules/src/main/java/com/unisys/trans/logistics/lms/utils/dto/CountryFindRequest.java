/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>CountryFindRequest</code> is used for finding the country code.
 * <p>
 * Country information is retrieved based on the following attributes:<br>
 * <ul>
 * <li><code>countryCode</code></li>
 * </ul>
 */
public class CountryFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3384194710474098074L;

    /**
     * Attribute to hold the <code>countryCode</code> property.<br>
     * Country code is required to retrieve country information.<br>
     */
    private String countryCode;

    /**
     * <code>Default Constructor</code>.
     * <p>
     */
    public CountryFindRequest() {

    }

    /**
     * Gets the <code>countryCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets <br>
     * <b>Example: </b><br>
     * DE
     * <p>
     * 
     * @return the current value of the <code>countryCode</code> property.<br>
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Sets the <code>countryCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets <br>
     * <b>Example: </b><br>
     * DE
     * <p>
     * 
     * @param pCountryCode the new value of the <code>countryCode</code> property.<br>
     */
    public void setCountryCode(final String pCountryCode) {
        this.countryCode = ContractUtility.convertToUpperCase(pCountryCode);
    }

    //UIS157
    /**
     * Attribute to hold the <code>searchText</code> property.
     */
    private String searchText;

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }
    //UIS157
}
