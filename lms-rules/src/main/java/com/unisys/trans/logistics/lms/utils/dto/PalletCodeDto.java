/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.math.BigDecimal;

/**
 * <code>PalletCodeDto</code> contains specific data applicable to the pallet.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>contourCode
 * <li>description
 * <li>code
 * <li>oId
 * <li>volume
 * </code>
 * </ul>
 */
public class PalletCodeDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8275761436019575850L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private String code;

    /**
     * Attribute to hold <code>contourCode</code> property.
     */
    private String contourCode;

    /**
     * Attribute to hold <code>description</code> property.
     */
    private String description;

    /**
     * Attribute to hold <code>palletCode</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>volume</code> property.
     */
    private BigDecimal volume;

    /**
     * <code>Default Constructor.</code>
     */
    public PalletCodeDto() {
    }

    /**
     * Constructor with palletCode as an argument.
     * <p>
     * 
     * @param pCode the new value of the <code>code</code> property.
     */
    public PalletCodeDto(final String pCode) {
        this.code = pCode;
    }

    /**
     * Gets the value of the <code>palletCode</code> property.
     * <p>
     * <b>Format: </b>
     * <p>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b>
     * <p>
     * P1
     * <p>
     * 
     * @return the current value of the <code>code</code> property.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Gets the value of the <code>contourCode</code> property.
     * <p>
     * <b>Format: </b>
     * <p>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b>
     * <p>
     * A1
     * <p>
     * 
     * @return the current value of the <code>contourCode</code> property.
     */
    public String getContourCode() {
        return this.contourCode;
    }

    /**
     * Gets the value of the <code>description</code> property.
     * <p>
     * <b>Format: </b>
     * <p>
     * 1-50 String
     * <p>
     * <b>Example: </b>
     * <p>
     * Description of pallet.
     * <p>
     * 
     * @return the current value of the <code>description</code> property.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the value of <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the value of the <code>volume</code> property.
     * <p>
     * <b>Format: </b>
     * <p>
     * 2-8[p] float
     * <p>
     * <b>Example: </b>
     * <p>
     * 10.23
     * <p>
     * 
     * @return the current value of the <code>volume</code> property.
     */
    public BigDecimal getVolume() {
        return this.volume;
    }

    /**
     * Sets the value of the <code>palletCode</code> property.
     * <p>
     * <b>Format: </b>
     * <p>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b>
     * <p>
     * P1
     * <p>
     * 
     * @param pCode the new value of the <code>code</code> property.
     */
    public void setCode(final String pCode) {
        this.code = ContractUtility.convertToUpperCase(pCode);
    }

    /**
     * Sets the value of the <code>contourCode</code> property.
     * <p>
     * <b>Format: </b>
     * <p>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b>
     * <p>
     * A1
     * <p>
     * 
     * @param pContourCode the new value of the <code>contourCode</code> property.
     */
    public void setContourCode(final String pContourCode) {
        this.contourCode = ContractUtility.convertToUpperCase(pContourCode);
    }

    /**
     * Sets the value of the <code>description</code> property.
     * <p>
     * <b>Format: </b>
     * <p>
     * 1-50 String
     * <p>
     * <b>Example: </b>
     * <p>
     * Description of pallet.
     * <p>
     * 
     * @param pDescription the new value of the <code>description</code> property.
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the value of <code>OId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the value of the <code>volume</code> property.
     * <p>
     * <b>Format: </b>
     * <p>
     * 2-8[p] float
     * <p>
     * <b>Example: </b>
     * <p>
     * 10.23
     * <p>
     * 
     * @param pVolume the new value of the <code>volume</code> property.
     */
    public void setVolume(final BigDecimal pVolume) {
        this.volume = pVolume;
    }
}
