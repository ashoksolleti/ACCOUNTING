/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.SecurityUserType;

/**
 * <code>RatingSecurityDto</code> contains specific data applicable to the RatingSecurity.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>oId
 * <li>identifier
 * <li>userType
 * <li>ratingSecurityEntryDtos
 * </ul>
 */
public class RatingSecurityDto extends PersistenceObjectDto {

    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>identifier</code> property.
     */
    private String identifier;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>ratingSecurityEntryDtos</code> property.
     */
    private List<RatingSecurityEntryDto> ratingSecurityEntryDtos;

    /**
     * Attribute to hold <code>userType</code> property.
     */

    private SecurityUserType userType;

    /**
     * Gets the <code>Identifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>identifier</code> property.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>RatingSecurityEntryDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratingSecurityEntryDtos</code> property.
     */
    public List<RatingSecurityEntryDto> getRatingSecurityEntryDtos() {
        if (this.ratingSecurityEntryDtos == null) {
            this.ratingSecurityEntryDtos = new ArrayList<RatingSecurityEntryDto>();
        }
        return ratingSecurityEntryDtos;
    }

    /**
     * Gets the <code>UserType</code> property.
     * <p>
     * 
     * @return the current value of the <code>userType</code> property.
     */
    public SecurityUserType getUserType() {
        return this.userType;
    }

    /**
     * Sets the <code>Identifier</code> property.
     * <p>
     * 
     * @param pIdentifier
     *            the new value of the <code>Identifier</code> property.
     */
    public void setIdentifier(final String pIdentifier) {
        this.identifier = ContractUtility.convertToUpperCase(pIdentifier);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>RatingSecurityEntryDtos</code> property.
     * <p>
     * 
     * @param pRatingSecurityEntryDtos
     *            the new value of the <code>RatingSecurityEntryDtos</code> property.
     */
    public void setRatingSecurityEntryDtos(final List<RatingSecurityEntryDto> pRatingSecurityEntryDtos) {
        this.ratingSecurityEntryDtos = pRatingSecurityEntryDtos;
    }

    /**
     * Sets the <code>UserType</code> property.
     * <p>
     * 
     * @param pUserType
     *            the new value of the <code>UserType</code> property.
     */
    public void setUserType(final SecurityUserType pUserType) {
        this.userType = pUserType;
    }

}
