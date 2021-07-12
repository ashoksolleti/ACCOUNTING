/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;

/**
 * <code>RestrictionGenerateCodeDto</code> contains code details on the restriction associated to the list of
 * product codes and special handling codes that need restriction. It holds the following attributes code -
 * holds special handling code or product code value. codeType - represent the type of code used in the
 * restriction and the restrictionCodes enum class is used to specify the type as follows, H - Special
 * handling code P - Product code
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>code
 * <li>restrictionType
 * </code>
 * </ul>
 */
public class RestrictionCheckerCodeDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 4948632565616417154L;

    /**
     * Attribute to hold <code>code</code> property.
     * <p>
     * Restriction is applied to given product code ,special handling code or country code..
     */
    private String code;

    /**
     * Attribute to hold <code>restrictionType</code> property.
     * <p>
     * Type of the restriction.
     */
    private String restrictionType;

    /**
     * Default constructor.
     */
    public RestrictionCheckerCodeDto() {

    }

    /**
     * Gets the <code>code</code> property.
     * <p>
     * Restriction is applied to given product code ,special handling code or country code.Restriction is
     * applied for all codes available in the system if left blank.
     * <p>
     * <b>Format: </b><br>
     * 2-3 Alphabets<br>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @return the current value of the <code>code</code> property.<br>
     */

    public String getCode() {

        return this.code;
    }

    /**
     * Gets the value of the <code>restrictionType</code> property.
     * <p>
     * Denotes the type of the code.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <b>Example: </b><br>
     * P
     * <p>
     * 
     * @return the current value of the <code>restrictionType</code> property.<br>
     */
    public String getRestrictionType() {

        return this.restrictionType;

    }

    /**
     * Sets the <code>code</code> property.
     * <p>
     * Restriction is applied to given product code ,special handling code or country code.Restriction is
     * applied for all codes available in the system if left blank.
     * <p>
     * <b>Format: </b><br>
     * 2-3 Alphabets<br>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @param pCode the new value of the <code>code</code> property.<br>
     */

    public void setCode(final String pCode) {
        this.code = pCode;
    }

    /**
     * Sets the <code>restrictionType</code> property.
     * <p>
     * Denotes the type of the code.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <b>Example: </b><br>
     * P
     * <p>
     * 
     * @param pRestrictionType the new value of the <code>restrictionType</code> property.<br>
     */
    public void setRestrictionType(final String pRestrictionType) {
        this.restrictionType = pRestrictionType;

    }
}