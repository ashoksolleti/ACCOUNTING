/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>OtherChargeSubCodeDto</code> holds all the attributes that are associated to an Other Charge SubCode.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>description
 * <li>oId
 * <li>otherChargeCode
 * <li>otherChargeSubCode
 * </code>
 * </ul>
 */
public class OtherChargeSubCodeDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1427426131058398530L;

    /**
     * Attribute to hold <code>description</code> property.
     */
    private String description;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>otherChargeCode</code> property.
     */
    private String otherChargeCode;

    /**
     * Attribute to hold <code>otherChargeSubCode</code> property.
     */
    private String otherChargeSubCode;

    /**
     * <code>Default constructor</code>.
     */
    public OtherChargeSubCodeDto() {

    }

    /**
     * Gets the <code>description</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-50 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * ABCED
     * <p>
     * 
     * @return the current value of <code>description</code> property.<br>
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>otherChargeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * CO
     * <p>
     * 
     * @return the current value of <code>otherChargeCode</code> property.<br>
     */
    public String getOtherChargeCode() {
        return this.otherChargeCode;
    }

    /**
     * Gets the <code>otherChargeSubCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 or 2 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * C6
     * <p>
     * 
     * @return the current value of <code>otherChargeSubCode</code> property.<br>
     */
    public String getOtherChargeSubCode() {
        return this.otherChargeSubCode;
    }

    /**
     * Sets the <code>description</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-50 Alphanumeric <br>
     * <p>
     * <b>Example: </b><br>
     * ABCED
     * <p>
     * 
     * @param pDescription the new value of <code>description</code> property.<br>
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>otherChargeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric <br>
     * <p>
     * <b>Example: </b><br>
     * A1
     * <p>
     * 
     * @param pOtherChargeCode the new value of <code>otherChargeCode</code> property.<br>
     */
    public void setOtherChargeCode(final String pOtherChargeCode) {
        this.otherChargeCode = ContractUtility.convertToUpperCase(pOtherChargeCode);
    }

    /**
     * Sets the <code>otherChargeSubCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 or 2 Alphanumeric <br>
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pOtherChargeSubCode the new value of <code>otherChargeSubCode</code> property.<br>
     */
    public void setOtherChargeSubCode(final String pOtherChargeSubCode) {
        this.otherChargeSubCode = ContractUtility.convertToUpperCase(pOtherChargeSubCode);
    }

}
