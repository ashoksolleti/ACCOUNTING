/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>CustomsStatusCodeDto</code> contains specific data applicable to the customsStatus.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>code</code></li>
 * <li><code>countryCode</code></li>
 * <li><code>description</code></li>
 * <li><code>oId</code></li>
 * </ul>
 */
public class CustomsStatusCodeDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8126131965445705515L;

    /**
     * Attribute to hold <code>customsStatusCode</code> property.
     */
    private String code;

    /**
     * Attribute to hold <code>countryCode</code> property.
     */
    private String countryCode;

    /**
     * Attribute to hold <code>description</code> property.
     */
    private String description;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * <code>Default Constructor.</code>
     */
    public CustomsStatusCodeDto() {
    }

    /**
     * Gets the value of the <code>code</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alphanumeric<br>
     * <b>Example: </b><br>
     * P1
     * 
     * @return <code>String</code>.<br>
     *         Returns the <code>code</code> of the customsStatus.<br>
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
     * Gets the value of the <code>description</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-50 String<br>
     * <b>Example: </b><br>
     * Description of customsStatus.
     * 
     * @return <code>String</code>.<br>
     *         Returns the <code>description</code> of the customsStatus.<br>
     *         </p>
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the value of the <code>oId</code> property.
     * <p>
     * 
     * @return <code>{@link java.lang.Long Long}</code><br>
     *         Returns the <code>oId</code> of the customsStatus.<br>
     *         </p>
     */
    @Override
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

        this.code = ContractUtility.convertToUpperCase(pCode);

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
        this.countryCode = ContractUtility.convertToUpperCase(pCountryCode);

    }

    /**
     * Sets the value of the <code>description</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-50 String<br>
     * <b>Example: </b><br>
     * Description of pallet.
     * 
     * @param pDescription <code>String</code><br>
     *            Contains the <code>description</code> of the customsStatus.<br>
     *            </p>
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;

    }

    /**
     * Sets the value of the <code>oId</code> property.
     * <p>
     * 
     * @param pOId Unique identifier for customsStatus. <code> {@link java.lang.Long Long}</code><br>
     *            Contains the <code>oId</code> of the customsStatus.<br>
     *            </p>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;

    }
}