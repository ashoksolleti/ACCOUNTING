package com.unisys.trans.logistics.lms.framework.preferences;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>RestrictionCodeDto</code> contains specific data applicable to restriction.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>oId
 * <li>restrictionCode
 * <li>restrictionDetailOId
 * <li>typeCode
 * </code>
 * </ul>
 */
public class RestrictionCodeDto implements Serializable {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4650490151391237799L;

    /**
     * Attribute to hold <code>code</code> property.
     * <p>
     * Restriction is applied to given product code ,special handling code or country code..
     */
    private String code;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>RestrictionCodeDto</code>.It is of type Long.<br>
     */
    private Long oId;

    /**
     * Attribute to hold <code>restrictionDetailOId</code> property.
     * <p>
     * Unique key identify the <code>RestrictionDetailDto</code>.It is of type Long.<br>
     */
    private Long restrictionDetailOId;

    /**
     * Attribute to hold <code>type</code> property.
     * <p>
     * Denotes the type of the code.
     */
    private String type;
    
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
     * Gets the value of <code>OID</code> property.
     * <p>
     * Unique key identify the <code>RestrictionCodeDto</code>.It is of type Long.<br>
     * <p>
     * 
     * @return the current value of the <code>OID</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the value of <code>restrictionDetailOId</code> property.
     * <p>
     * Unique key identify the <code>RestrictionDetailDto</code>.It is of type Long.<br>
     * <p>
     * 
     * @return the current value of the <code>restrictionDetailOId</code> property.<br>
     */
    public Long getRestrictionDetailOId() {
        return this.restrictionDetailOId;
    }

    /**
     * Gets the value of the <code>type</code> property.
     * <p>
     * Denotes the type of the code.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <b>Example: </b><br>
     * P
     * <p>
     * 
     * @return the current value of the <code>type</code> property.<br>
     */
    public String getType() {
        return this.type;
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
        this.code = ContractUtility.convertToUpperCase(pCode);
    }

    /**
     * Sets the <code>OID</code> property.
     * <p>
     * Unique key identify the <code>RestrictionCodeDto</code>.It is of type Long.<br>
     * <p>
     * 
     * @param pOId the new value of the <code>OID</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>restrictionDetailOId</code> property.
     * <p>
     * Unique key identify the <code>RestrictionDetailDto</code>.It is of type Long.<br>
     * <p>
     * 
     * @param pRestrictionDetailOId the new value of the <code>restrictionDetailOId</code> property.<br>
     */
    public void setRestrictionDetailOId(final Long pRestrictionDetailOId) {
        this.restrictionDetailOId = pRestrictionDetailOId;
    }

    /**
     * Sets the <code>type</code> property.
     * <p>
     * Denotes the type of the code.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <b>Example: </b><br>
     * P
     * <p>
     * 
     * @param pType the new value of the <code>type</code> property.<br>
     */
    public void setType(final String pType) {
        this.type = pType;
    }
}

