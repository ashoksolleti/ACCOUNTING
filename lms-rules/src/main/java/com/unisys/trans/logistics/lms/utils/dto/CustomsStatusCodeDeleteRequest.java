/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>CustomsStatusCodeDeleteRequest</code> is used for deleting the CustomsStatus details.The object ID of
 * the CustomsStatus code being deleted is required to delete the customsStatus details.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>oId</code></li>
 * </ul>
 */
public class CustomsStatusCodeDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1898962918060974572L;

    /**
     * Attribute to hold <code>code</code> property.
     */
    private String code;

    /**
     * Attribute to hold <code>countryCode</code> property.
     */
    private String countryCode;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * <code>Default constructor.</code>
     */
    public CustomsStatusCodeDeleteRequest() {
    }

    /**
     * Gets the value of <code>OId</code> property.
     * <p>
     * 
     * @return <code>long</code><br>
     *         Returns the current value of the <code>OId</code> property.<br>
     *         </p>
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Gets the value of the <code>countryCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alphanumeric<br>
     * <b>Example: </b><br>
     * A1
     * 
     * @return <code>String</code>.<br>
     *         Returns the <code> countryCode</code> of the customsStatus.<br>
     *         </p>
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Gets the value of the <code>oId</code> property.
     * <p>
     * 
     * @return <code>long</code><br>
     *         Returns the <code>oId</code> of the customsStatus.<br>
     *         </p>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the value of the <code>code</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alphanumeric<br>
     * <b>Example: </b><br>
     * P1
     * 
     * @param pCode <code>String</code><br>
     *            Contains the <code>code</code> of the customsStatus.<br>
     *            </p>
     */
    public void setCode(final String pCode) {
        this.code = pCode;
    }

    /**
     * Sets the value of the <code>countryCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alphanumeric<br>
     * <b>Example: </b><br>
     * A1
     * 
     * @param pCountryCode <code>String</code><br>
     *            Contains the <code>countryCode</code> of the customsStatus.<br>
     *            </p>
     */
    public void setCountryCode(final String pCountryCode) {
        this.countryCode = pCountryCode;
    }

    /**
     * Sets the value of the <code>oId</code> property.
     * <p>
     * 
     * @param pOId Unique identifier for customsStatus. <code>String</code><br>
     *            Contains the <code>oId</code> of the customsStatus.<br>
     *            </p>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }
}