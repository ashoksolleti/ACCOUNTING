/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.rating.dto.constants.SecurityGeoType;
import com.unisys.trans.logistics.lms.rating.dto.constants.SecurityType;

/**
 * <code>RatingSecurityEntryDto</code> contains specific data applicable to the
 * RatingSecurity.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>destination
 * <li>destinationIndicator
 * <li>origin
 * <li>originIndicator
 * <li>rateSourceCode
 * <li>securityType
 * <li>userAuditDto
 * <li>actionType
 * </ul>
 */
public class RatingSecurityEntryDto extends PersistenceObjectDto {
    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>actionType</code> property.
     */
    private ActionType actionType;

    /**
     * Attribute to hold <code>destination</code> property.
     */
    private GeographicDataDto destination;

    /**
     * Attribute to hold <code>destinationIndicator</code> property.
     */
    private SecurityGeoType destinationIndicator;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>origin</code> property.
     */
    private GeographicDataDto origin;

    /**
     * Attribute to hold <code>originIndicator</code> property.
     */
    private SecurityGeoType originIndicator;

    /**
     * Attribute to hold <code>rateSourceCode</code> property.
     */
    private String rateSourceCode;

    /**
     * Attribute to hold <code>securityType</code> property.
     */
    private SecurityType securityType;

    /**
     * Attribute to hold <code>userAuditDto</code> property.
     */
    private UserAuditDto userAuditDto;

    /**
     * Attribute to hold <code>error</code> property.
     */
    private boolean error;

    /**
     * Gets the <code>ActionType</code> property.
     * <p>
     * 
     * @return the current value of the <code>actionType</code> property.
     */
    public ActionType getActionType() {
        return this.actionType;
    }

    /**
     * Gets the <code>Destination</code> property.
     * <p>
     * 
     * @return the current value of the <code>destination</code> property.
     */
    public GeographicDataDto getDestination() {
        if (this.destination == null) {
            this.destination = new GeographicDataDto();
        }
        return this.destination;
    }

    /**
     * Gets the <code>DestinationIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>destinationIndicator</code> property.
     */
    public SecurityGeoType getDestinationIndicator() {
        return this.destinationIndicator;
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
     * Gets the <code>Origin</code> property.
     * <p>
     * 
     * @return the current value of the <code>origin</code> property.
     */
    public GeographicDataDto getOrigin() {
        if (this.origin == null) {
            this.origin = new GeographicDataDto();
        }
        return this.origin;
    }

    /**
     * Gets the <code>OriginIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>originIndicator</code> property.
     */
    public SecurityGeoType getOriginIndicator() {
        return this.originIndicator;
    }

    /**
     * Gets the <code>RateSourceCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateSourceCode</code> property.
     */
    public String getRateSourceCode() {
        return this.rateSourceCode;
    }

    /**
     * Gets the <code>SecurityType</code> property.
     * <p>
     * 
     * @return the current value of the <code>securityType</code> property.
     */
    public SecurityType getSecurityType() {
        return this.securityType;
    }

    /**
     * Gets the <code>UserAuditDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>userAuditDto</code> property.
     */
    public UserAuditDto getUserAuditDto() {

        if (this.userAuditDto == null) {
            this.userAuditDto = new UserAuditDto();
        }
        return this.userAuditDto;
    }

    /**
     * Sets the <code>ActionType</code> property.
     * <p>
     * 
     * @param pActionType
     *            the new value of the <code>ActionType</code> property.
     */
    public void setActionType(final ActionType pActionType) {
        this.actionType = pActionType;
    }

    /**
     * Sets the <code>Destination</code> property.
     * <p>
     * 
     * @param pDestination
     *            the new value of the <code>Destination</code> property.
     */
    public void setDestination(final GeographicDataDto pDestination) {
        this.destination = pDestination;
    }

    /**
     * Sets the <code>DestinationIndicator</code> property.
     * <p>
     * 
     * @param pDestinationIndicator
     *            the new value of the <code>DestinationIndicator</code> property.
     */
    public void setDestinationIndicator(
                final SecurityGeoType pDestinationIndicator) {
        this.destinationIndicator = pDestinationIndicator;
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
     * Sets the <code>pOrigin</code> property.
     * <p>
     * 
     * @param pOrigin
     *            the new value of the <code>pOrigin</code> property.
     */
    public void setOrigin(final GeographicDataDto pOrigin) {
        this.origin = pOrigin;
    }

    /**
     * Sets the <code>OriginIndicator</code> property.
     * <p>
     * 
     * @param pOriginIndicator
     *            the new value of the <code>OriginIndicator</code> property.
     */
    public void setOriginIndicator(final SecurityGeoType pOriginIndicator) {
        this.originIndicator = pOriginIndicator;
    }

    /**
     * Sets the <code>RateSourceCode</code> property.
     * <p>
     * 
     * @param pRateSourceCode
     *            the new value of the <code>RateSourceCode</code> property.
     */
    public void setRateSourceCode(final String pRateSourceCode) {
        this.rateSourceCode = ContractUtility
                    .convertToUpperCase(pRateSourceCode);
    }

    /**
     * Sets the <code>SecurityType</code> property.
     * <p>
     * 
     * @param pSecurityType
     *            the new value of the <code>SecurityType</code> property.
     */
    public void setSecurityType(final SecurityType pSecurityType) {
        this.securityType = pSecurityType;
    }

    /**
     * Sets the <code>UserAuditDto</code> property.
     * <p>
     * 
     * @param pUserAuditDto
     *            the new value of the <code>UserAuditDto</code> property.
     */
    public void setUserAuditDto(final UserAuditDto pUserAuditDto) {
        this.userAuditDto = pUserAuditDto;
    }

    /**
     * Gets the <code>RatingSecurityEntryDto</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param obj
     *            the new value of the <code>object</code> property.
     * @return the current value of the <code>RatingSecurityEntryDto</code> property.
     */
    @Override
    public boolean equals(Object obj) {
        boolean value = true;
        if (this == obj) {
            value = true;
        }
        if (obj == null) {
            value = false;
        }
        if (getClass() != obj.getClass()) {
            value = false;
        }
        RatingSecurityEntryDto other = (RatingSecurityEntryDto) obj;
        if (value) {
            if (this.getDestination().getCode() != null) {
                if (other.getDestination().getCode() == null) {
                    value = false;
                }
            }
            if (value && other.getDestination().getCode() != null) {
                if (this.getDestination().getCode() == null) {
                    value = false;
                }
            }
            if (value && this.getDestination().getCode() != null && other.getDestination().getCode() != null) {
                if (!this.getDestination().getCode().equalsIgnoreCase(other.getDestination().getCode())) {
                    value = false;
                }

            }

            if (value && this.getOrigin().getCode() != null) {
                if (other.getOrigin().getCode() == null) {
                    value = false;
                }
            }
            if (value && other.getOrigin().getCode() != null) {
                if (this.getOrigin().getCode() == null) {
                    value = false;
                }
            }
            if (value && this.getOrigin().getCode() != null && other.getOrigin().getCode() != null) {
                if (!this.getOrigin().getCode().equalsIgnoreCase(other.getOrigin().getCode())) {
                    value = false;
                }

            }

            if (value && this.getDestinationIndicator() != null
                        && other.getDestinationIndicator() == null) {
                value = false;
            }
            else if (value && other.getDestinationIndicator() != null
                        && this.getDestinationIndicator() == null) {
                value = false;
            }
            else if (value && this.getDestinationIndicator() != null
                        && other.getDestinationIndicator() != null
                        && !this.getDestinationIndicator()
                                    .getGeoType()
                                    .equalsIgnoreCase(
                                        other.getDestinationIndicator()
                                                    .getGeoType())) {
                value = false;
            }

            if (value && this.getOriginIndicator() == null
                        && other.getOriginIndicator() != null) {
                value = false;
            }
            else if (value && this.getOriginIndicator() != null
                        && other.getOriginIndicator() == null) {
                value = false;
            }
            else if (value && this.getOriginIndicator() != null
                        && other.getOriginIndicator() != null
                        && !this.getOriginIndicator()
                                    .getGeoType()
                                    .equalsIgnoreCase(
                                        other.getOriginIndicator().getGeoType())) {
                value = false;
            }
            if (value && this.getRateSourceCode() == null) {
                if (other.getRateSourceCode() != null) {
                    value = false;
                }
            }
            else if (value && other.getRateSourceCode() == null
                        && this.getRateSourceCode() != null) {
                value = false;
            }
            else if (value && this.getRateSourceCode() != null
                        && other.getRateSourceCode() != null
                        && !this.getRateSourceCode().equalsIgnoreCase(
                            other.getRateSourceCode())) {
                value = false;
            }
            if (value && this.getSecurityType() == null
                        && other.getSecurityType() != null) {
                value = false;
            }
            else if (value && this.getSecurityType() != null
                        && other.getSecurityType() == null) {
                value = false;
            }
            else if (value && this.getSecurityType() != null
                        && other.getSecurityType() != null
                        && !this.getSecurityType()
                                    .getType()
                                    .equalsIgnoreCase(other.getSecurityType().getType())) {
                value = false;
            }

        }
        return value;
    }

    /**
     * Gets the <code>error</code> property.
     * <p>
     * 
     * @return the current value of the <code>error</code> property.
     */
    public boolean isError() {
        return this.error;
    }

    /**
     * Sets the <code>error</code> property.
     * <p>
     * 
     * @param pError
     *            the new value of the <code>error</code> property.
     */
    public void setError(final boolean pError) {
        this.error = pError;
    }

    /**
     * Generate hascode
     */
    @Override
    public int hashCode() {
        final int result = 1;

        return result;
    }

}
