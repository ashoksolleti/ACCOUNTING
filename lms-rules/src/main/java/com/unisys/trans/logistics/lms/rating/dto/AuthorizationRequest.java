package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.rating.dto.constants.SecurityUserType;

/**
 * <code>AuthorizationRequest</code> retrieves the <code>Authorization Request information</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>destination
 * <li>identifier
 * <li>securityUserType
 * </code>
 * </ul>
 */
public class AuthorizationRequest {
    /**
     * Attribute to hold <code>destination</code> property.
     */
    private GeographicDataDto destination;

    /**
     * Attribute to hold <code>identifier</code> property.
     */
    private String identifier;

    /**
     * Attribute to hold <code>origin</code> property.
     */
    private GeographicDataDto origin;

    /**
     * Attribute to hold <code>securityUserType</code> property.
     */
    private SecurityUserType securityUserType;

    /**
     * Gets the <code>destination</code> property.
     * <p>
     * 
     * @return the current value of the <code>destination</code> property.
     */
    public GeographicDataDto getDestination() {
        return this.destination;
    }

    /**
     * Gets the <code>identifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>identifier</code> property.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Gets the <code>origin</code> property.
     * <p>
     * 
     * @return the current value of the <code>origin</code> property.
     */
    public GeographicDataDto getOrigin() {
        return this.origin;
    }

    /**
     * Gets the <code>securityUserType</code> property.
     * <p>
     * 
     * @return the current value of the <code>securityUserType</code> property.
     */
    public SecurityUserType getSecurityUserType() {
        return this.securityUserType;
    }

    /**
     * Sets the <code>destination</code> property.
     * <p>
     * 
     * @param pDestination
     *            the current value of the <code>destination</code> property.
     */
    public void setDestination(final GeographicDataDto pDestination) {
        this.destination = pDestination;
    }

    /**
     * Sets the <code>identifier</code> data transfer object.
     * <p>
     * 
     * @param pIdentifier
     *            holds the new value of <code>identifier</code> data
     *            transfer object.<br>
     */
    public void setIdentifier(final String pIdentifier) {
        this.identifier = pIdentifier;
    }

    /**
     * Sets the <code>origin</code> property.
     * <p>
     * 
     * @param pOrigin
     *            the current value of the <code>origin</code> property.
     */
    public void setOrigin(final GeographicDataDto pOrigin) {
        this.origin = pOrigin;
    }

    /**
     * Sets the <code>securityUserType</code> data transfer object.
     * <p>
     * 
     * @param pSecurityUserType
     *            holds the new value of <code>securityUserType</code> data
     *            transfer object.<br>
     */
    public void setSecurityUserType(final SecurityUserType pSecurityUserType) {
        this.securityUserType = pSecurityUserType;
    }

}
