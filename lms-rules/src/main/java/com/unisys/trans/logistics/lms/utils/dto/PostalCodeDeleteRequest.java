/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>PostalCodeDeleteRequest</code> holds the attributes to Delete Postal code details for a Postal code.
 * <p>
 * This includes the following operations:
 * <ul>
 * <li>Deletes a Postal code - Deletes a Postal code and its details based on the input Postal code.
 * </ul>
 * <p>
 * <ul>
 * <code>
 * <li>postalCode
 * <li>stationCode
 * <li>postalCodeOId
 * <li>version
 * </code>
 * </ul>
 */
public class PostalCodeDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4326488544041034243L;

    /**
     * Attribute to hold <code>postalCode</code> property.
     */
    private String postalCode;

    /**
     * Attribute to hold <code>postalCodeOId</code> property.
     * <p>
     * Unique key to identify the <code>PostalCode</code>.
     */
    private Long postalCodeOId;

    /**
     * Attribute to hold <code>stationCode</code> property.
     * <p>
     * Indicates the station to which the Postal code belongs.
     */
    private String stationCode;

    /**
     * Attribute to hold <code>version</code> property.
     * <p>
     * Indicates the version of the Postal code for which the information needs to deleted.
     */
    private Long version;

    /**
     * <code>Default constructor</code>.
     */
    public PostalCodeDeleteRequest() {

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
     * Gets the <code>postalCodeOId</code> property.
     * <p>
     * Indicates the oId of the Postal code.
     * <p>
     * 
     * @return the current value of the <code>postalCodeOId</code> property.
     */
    public Long getPostalCodeOId() {
        return this.postalCodeOId;
    }

    /**
     * Gets the <code>stationCode</code> property.
     * <p>
     * Indicates the value of the stationCode to which the Postal code belongs.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet.
     * <p>
     * <b>Example :</b><br>
     * ORD
     * <p>
     * 
     * @return the current value of the <code>stationCode</code> property.
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Gets the <code>version</code> property.
     * <p>
     * Indicates the version of the Postal code for which the information needs to deleted.
     * <p>
     * 
     * @return the current value of the <code>version</code> property.
     */
    public Long getVersion() {
        return this.version;
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
     * Sets the <code>postalCodeOId</code> property.
     * <p>
     * Indicates the oId of the Postal code.
     * <p>
     * 
     * @param pPostalCodeOid the new value of the <code>PostalCodeOid</code> property.
     */
    public void setPostalCodeOId(final Long pPostalCodeOid) {
        this.postalCodeOId = pPostalCodeOid;
    }

    /**
     * Sets the <code>stationCode</code> property.
     * <p>
     * Indicates the value of the stationCode to which the Postal code belongs.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet.
     * <p>
     * <b>Example :</b><br>
     * ORD
     * <p>
     * 
     * @param pStationCode the new value of the <code>stationCode</code> property.
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = pStationCode;
    }

    /**
     * Sets the <code>version</code> property.
     * <p>
     * Indicates the version of the Postal code for which the information needs to deleted.
     * <p>
     * 
     * @param pVersion the new value of the <code>version</code> property.
     */
    public void setVersion(final Long pVersion) {
        this.version = pVersion;
    }
}