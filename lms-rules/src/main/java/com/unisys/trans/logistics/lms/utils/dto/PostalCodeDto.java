/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>PostalCodeDto</code> holds all the attributes that are associated to a Postal code.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>postalCode
 * <li>postalCodeDetails
 * <li>oId
 * </code>
 * </ul>
 */
public class PostalCodeDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6565911611683326325L;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>PostalCodeDto</code>. It is of type Long.
     */
    private Long oId;

    /**
     * Attribute to hold <code>postalCode</code> property.
     */
    private String postalCode;

    /**
     * Attribute to hold <code>postalCodeDetails</code> property.
     * <p>
     * Represents the <code>PostalCodeDetailDto</code> object which holds all the attributes that are specific
     * to an Postal code.
     */
    private List<PostalCodeDetailDto> postalCodeDetails;

    /**
     * <code>Default constructor</code>.
     */
    public PostalCodeDto() {

    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>PostalCodeDto</code>. It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>postalCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 5-9 AlphaNumeric.
     * <p>
     * <b>Example :</b><br>
     * 55122
     * <p>
     * 
     * @return the current value of the <code>postalCode</code> property.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Gets the <code>postalCodeDetails</code> property.
     * <p>
     * 
     * @return the current value of the <code>postalCodeDetails</code> property.
     */
    public List<PostalCodeDetailDto> getPostalCodeDetails() {
        if (this.postalCodeDetails == null) {
            this.postalCodeDetails = new ArrayList<PostalCodeDetailDto>();
        }
        return this.postalCodeDetails;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>PostalCodeDto</code>.It is of type Long.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>PostalCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 5-9 AlphaNumeric.
     * <p>
     * <b>Example :</b><br>
     * 55122
     * <p>
     * 
     * @param pPostalCode the new value of <code>postalCode</code> property.
     */
    public void setPostalCode(final String pPostalCode) {
        this.postalCode = pPostalCode;
    }

    /**
     * Sets the <code>postalCodeDetails</code> property.
     * <p>
     * Indicates the Postal code information for a Postal code.
     * <p>
     * 
     * @param pPostalCodeDetails the new value of the <code>postalCodeDetails</code> property.
     */
    public void setPostalCodeDetails(final List<PostalCodeDetailDto> pPostalCodeDetails) {
        this.postalCodeDetails = pPostalCodeDetails;
    }

}