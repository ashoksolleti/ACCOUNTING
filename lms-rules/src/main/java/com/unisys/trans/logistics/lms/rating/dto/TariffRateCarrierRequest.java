/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.constants.GeographicType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>TariffRateCarrierRequest</code> class represents the request to update
 * TariffRateCarrierinformation details.
 * <p>
 * <code>TariffRateCarrierRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>destinationCode
 * <li>destinationType
 * <li>originCode
 * <li>originType
 * </code>
 * </ul>
 */

public class TariffRateCarrierRequest extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>destinationCode</code> property.
     */
    private String destinationCode;

    /**
     * Attribute to hold <code>destinationType</code> property.
     */
    private GeographicType destinationType;

    /**
     * Attribute to hold <code>originCode</code> property.
     */
    private String originCode;

    /**
     * Attribute to hold <code>originType</code> property.
     */
    private GeographicType originType;

    /**
     * Gets the <code>DestinationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2A for Country Code. 3A for Airport,City Code. 4-7 for Aggregate. AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * EUR1
     * <p>
     * 
     * @return the current value of the <code>DestinationCode</code> property.
     */
    public String getDestinationCode() {
        return this.destinationCode;
    }

    /**
     * Gets the <code>DestinationType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Airport,city,Country,Aggregate List.
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of the <code>DestinationType</code> property.
     */
    public GeographicType getDestinationType() {
        return this.destinationType;
    }

    /**
     * Gets the <code>OriginCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2A for Country Code. 3A for Airport,City Code. 4-7 for Aggregate. AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * USA1.
     * <p>
     * 
     * @return the current value of the <code>OriginCode</code> property.
     */
    public String getOriginCode() {
        return this.originCode;
    }

    /**
     * Gets the <code>OriginType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Airport,city,Country,Aggregate List.
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of the <code>OriginType</code> property.
     */
    public GeographicType getOriginType() {
        return this.originType;
    }

    /**
     * Sets the <code>DestinationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2A for Country Code. 3A for Airport,City Code. 4-7 for Aggregate. AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * EUR1
     * <p>
     * 
     * @param pDestinationCode
     *            the current value of the <code>DestinationCode</code> property.
     */
    public void setDestinationCode(final String pDestinationCode) {
        this.destinationCode = pDestinationCode;
    }

    /**
     * Sets the <code>DestinationType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Airport,city,Country,Aggregate List.
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pDestinationType
     *            the current value of the <code>DestinationType</code> property.
     */
    public void setDestinationType(final GeographicType pDestinationType) {
        this.destinationType = pDestinationType;
    }

    /**
     * Sets the <code>OriginCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2A for Country Code. 3A for Airport,City Code. 4-7 for Aggregate. AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * USA1.
     * <p>
     * 
     * @param pOriginCode
     *            the current value of the <code>OriginCode</code> property.
     */
    public void setOriginCode(final String pOriginCode) {
        this.originCode = pOriginCode;
    }

    /**
     * Sets the <code>OriginType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Airport,city,Country,Aggregate List.
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pOriginType
     *            the current value of the <code>OriginType</code> property.
     */
    public void setOriginType(final GeographicType pOriginType) {
        this.originType = pOriginType;
    }

}
