//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>StateProvinceDto</code> contain details of State/Province.
 * <p>
 * This contains all information about State/Province.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>abbreviation
 * <li>countryCode
 * <li>iataCode
 * <li>name
 * <li>oId
 * </ul>
 */
public class StateProvinceDto extends PersistenceObjectDto {

    /**
     * TODO default serial version added. add a valid serial version id
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>abbreviation</code> property.
     */
    private String abbreviation;

    /**
     * Attribute to hold <code>countryCode</code> property.
     */
    private String countryCode;

    /**
     * Attribute to hold <code>iataCode</code> property.
     */
    private String iataCode;

    /**
     * Attribute to hold <code>name</code> property.
     */
    private String name;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Gets the <code>abbreviation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * LA
     * <p>
     * 
     * @return the current value of the <code>abbreviation</code> property.
     */
    public final String getAbbreviation() {
        return this.abbreviation;
    }

    /**
     * Gets the <code>countryCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabet
     * <p>
     * <b>Example: </b><br>
     * US
     * <p>
     * 
     * @return the current value of the <code>countryCode</code> property.
     */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Gets the <code>iataCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabet
     * <p>
     * <b>Example: </b><br>
     * LA
     * <p>
     * 
     * @return the current value of the <code>iataCode</code> property.
     */
    public final String getIataCode() {
        return this.iataCode;
    }

    /**
     * Gets the <code>name</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * Los Angeles
     * <p>
     * 
     * @return the current value of the <code>name</code> property.
     */
    public final String getName() {
        return this.name;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public final Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>abbreviation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * LA
     * <p>
     * 
     * @param pAbbreviation the new value of the <code>abbreviation</code> property.
     */
    public final void setAbbreviation(final String pAbbreviation) {
        this.abbreviation = pAbbreviation;
    }

    /**
     * Sets the <code>countryCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabet
     * <p>
     * <b>Example: </b><br>
     * US
     * <p>
     * 
     * @param pCountryCode the new value of the <code>countryCode</code> property.
     */
    public final void setCountryCode(final String pCountryCode) {
        this.countryCode = ContractUtility.convertToUpperCase(pCountryCode);
    }

    /**
     * Sets the <code>iataCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabet
     * <p>
     * <b>Example: </b><br>
     * LA
     * <p>
     * 
     * @param pIataCode the new value of the <code>iataCode</code> property.
     */
    public final void setIataCode(final String pIataCode) {
        this.iataCode = ContractUtility.convertToUpperCase(pIataCode);
    }

    /**
     * Sets the <code>name</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * Los Angeles
     * <p>
     * 
     * @param pName the new value of the <code>name</code> property.
     */
    public final void setName(final String pName) {
        this.name = pName;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public final void setOId(final Long pOId) {
        this.oId = pOId;
    }
}
