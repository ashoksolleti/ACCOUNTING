/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.constants.ExceptionType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.util.Date;
import java.util.List;

/**
 * <code>RestrictionGenerateRequest</code>is used for finding restriction errors and warnings for AWB routing,
 * segment and collect charge restrictions.It contains the list of RestrictionGenerateRoutingDto,
 * RestrictionGenerateSegmentDto and RestrictionGenerateCodeDto that hold the input information to find the
 * export, import, transit and systemwide restriction for a particular station and carrier with other input
 * filters such as date, dayofoperation, ToStaion/Country, Product Codes, Special Handling Codes, Flight
 * Number, Aircraft type, Aircraft Registration Number. RestrictionGenerateDto contains the routing station
 * and carrier information. RestrictionGenerateSegmentDto contains the segment origin, destination stations
 * and flight information. RestrictionGenerateCodeDto contains the specialhandling and product code
 * informations.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>restrictionOnlyIndicator
 * <li>responseMessageType
 * <li>routingDate
 * <li>restrictionGenerateRoutings
 * <li>restrictionGenerateSegments
 * <li>restrictionGenerateCodes
 * </code>
 * </ul>
 */
public class RestrictionGenerateRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8747850993052652534L;

    /**
     * Attribute to hold <code>responseMessageType</code> property.
     * <p>
     * it refers to the Response Message type.
     * <ul>
     * <li>WARN – Return warning response messages for restrictive station restrictions.
     * <li>ERR – Return error response messages for restrictive station restrictions.
     * </ul>
     */
    private ExceptionType responseMessageType;

    /**
     * Attribute to hold <code>restrictionGenerateCodes</code> property.
     * <p>
     * Represent the codes applicable to a restriction.It is of type <code>RestrictionGenerateCodeDto</code>
     * class.
     */
    private List<RestrictionGenerateCodeDto> restrictionGenerateCodes;

    /**
     * Attribute to hold <code>restrictionGenerateRoutings</code> property.
     * <p>
     * Indicates routing origin station to the destination station through a set of intermediate stations.
     * There can be up to 5 intermediate stations.It is of type <code>RestrictionGenerateRoutingDto</code>.
     */
    private List<RestrictionGenerateRoutingDto> restrictionGenerateRoutings;

    /**
     * Attribute to hold <code>restrictionGenerateRoutings</code> property.
     * <p>
     * Indicates the segment informations such as segment origin, segment destination, arrivalDate,
     * departureDate, aircraftEquipmentCode and aircraftRegistrationNumber.It is of type
     * <code>RestrictionGenerateSegmentDto</code>.
     */
    private List<RestrictionGenerateSegmentDto> restrictionGenerateSegments;

    /**
     * Attribute to hold <code>restrictionOnlyIndicator</code> property.
     * <p>
     * Attribute specifies whether restriction or both restrictions and warnings have to be returned.
     * <li>True - Restrictions only.
     * <li>False - Return both warnings and restrictions.
     */
    private boolean restrictionOnlyIndicator;

    /**
     * Attribute to hold <code>routingDate</code> property.
     * <p>
     * it refers the AWB routing date.
     */
    private Date routingDate;

    /**
     * Default constructor.
     */
    public RestrictionGenerateRequest() {

    }

    /**
     * Gets the the reference of <code>ExceptionType</code> property.
     * <p>
     * it refers to the Response Message type.
     * <ul>
     * <li>WARN – Return warning response messages for restrictive station restrictions.
     * <li>ERR – Return error response messages for restrictive station restrictions.
     * </ul>
     * <p>
     * 
     * @return the current value of the <code>responseMessageType</code> property.
     */

    public ExceptionType getResponseMessageType() {
        return this.responseMessageType;
    }

    /**
     * Holds the list of <code>restrictionGenerateCodes</code> that contains the restriction codes.
     * <p>
     * Represent the codes applicable to a restriction.It is of type <code>RestrictionGenerateCodeDto</code>
     * class.
     * <p>
     * 
     * @return the current value of <code>restrictionCodes</code> property.
     */

    public List<RestrictionGenerateCodeDto> getRestrictionGenerateCodes() {
        return this.restrictionGenerateCodes;
    }

    /**
     * Gets the set of <code>RestrictionGenerateRoutingDto</code>that contains the
     * restrictionGenerateRoutings.
     * <p>
     * Indicates routing origin station to the destination station through a set of intermediate stations.
     * There can be up to 5 intermediate stations.It is of type <code>RestrictionGenerateRoutingDto</code>
     * <p>
     * 
     * @return the current value of <code>restrictionGenerateRoutings</code> property.
     */

    public List<RestrictionGenerateRoutingDto> getRestrictionGenerateRoutings() {
        return this.restrictionGenerateRoutings;
    }

    /**
     * Gets <code>restrictionGenerateSegments</code> property.
     * <p>
     * Indicates the segment informations such as segment origin, segment destination, arrivalDate,
     * departureDate, aircraftEquipmentCode and aircraftRegistrationNumber.It is of type
     * <code>RestrictionGenerateSegmentDto</code>.
     * <p>
     * 
     * @return the current value of <code>restrictionGenerateSegments</code> property.
     */

    public List<RestrictionGenerateSegmentDto> getRestrictionGenerateSegments() {

        return this.restrictionGenerateSegments;

    }

    /**
     * Gets the value of the <code>routingDate</code> property.
     * <p>
     * it refers the AWB routing date.
     * <p>
     * <b>Format: </b><br>
     * 7 DATE ddMMMyy<br>
     * <b>Example: </b><br>
     * 06MAR07
     * 
     * @return the current value of reference of<code>routingDate</code> property.
     */

    public Date getRoutingDate() {

        return ContractUtility.getClonedDate(this.routingDate);

    }

    /**
     * Gets the <code>restrictionOnlyIndicator</code> property.
     * <p>
     * Attribute specifies whether restriction or both restrictions and warnings have to be returned.
     * <li>True - Restrictions only.
     * <li>False - Return both warnings and restrictions.
     * <p>
     * 
     * @return The current value of <code>isRestrictionOnlyIndicator</code> property.<br>
     */
    public boolean isRestrictionOnlyIndicator() {

        return this.restrictionOnlyIndicator;

    }

    /**
     * Sets the <code>ExceptionType</code> enum class.
     * <p>
     * it refers to the Response Message type.
     * <ul>
     * <li>WARN – Return warning response messages for restrictive station restrictions.
     * <li>ERR – Return error response messages for restrictive station restrictions.
     * </ul>
     * <p>
     * 
     * @param pResponseMessageType the new value of the <code>responseMessageType</code> property.
     */

    public void setResponseMessageType(final ExceptionType pResponseMessageType) {
        this.responseMessageType = pResponseMessageType;
    }

    /**
     * Sets the <code>restrictionGenerateCodes</code> property.
     * <p>
     * Represent the codes applicable to a restriction.It is of type <code>RestrictionCodeDto</code> class.
     * <p>
     * 
     * @param pRestrictionGenerateCode the new value of the <code>restrictionGenerateCodes</code> property.
     */

    public void setRestrictionGenerateCodes(final List<RestrictionGenerateCodeDto> pRestrictionGenerateCode) {
        this.restrictionGenerateCodes = pRestrictionGenerateCode;
    }

    /**
     * Sets the <code>RestrictionGenerateRoutingDto</code> that contains restrictionGenerateRoutings.
     * <p>
     * Indicates routing origin station to the destination station through a set of intermediate stations.
     * There can be up to 5 intermediate stations.It is of type <code>RestrictionGenerateRoutingDto</code>.
     * <p>
     * 
     * @param pRestrictionGenerateRouting the new value of the <code>restrictionGenerateRoutings</code>
     *            property.
     */

    public void setRestrictionGenerateRoutings(
                final List<RestrictionGenerateRoutingDto> pRestrictionGenerateRouting) {
        this.restrictionGenerateRoutings = pRestrictionGenerateRouting;
    }

    /**
     * Sets the <code>RestrictionGenerateSegmentDto</code> that contains segment information.
     * <p>
     * Indicates the segment informations such as segment origin, segment destination, arrivalDate,
     * departureDate, aircraftEquipmentCode and aircraftRegistrationNumber.It is of type
     * <code>RestrictionGenerateSegmentDto</code>.
     * <p>
     * 
     * @param pRestrictionGenerateSegment the new value of the <code>restrictionGenerateSegments</code>
     *            property.
     */

    public void setRestrictionGenerateSegments(
                final List<RestrictionGenerateSegmentDto> pRestrictionGenerateSegment) {
        this.restrictionGenerateSegments = pRestrictionGenerateSegment;
    }

    /**
     * Sets <code>restrictionOnlyIndicator</code> property.
     * <p>
     * Attribute specifies whether restriction or both restrictions and warnings have to be returned.
     * <li>True - Restrictions only.
     * <li>False - Return both warnings and restrictions.
     * <p>
     * 
     * @param pRestrictionOnlyIndicator new value of the <code>restrictionOnlyIndicator</code> property.
     */

    public void setRestrictionOnlyIndicator(final boolean pRestrictionOnlyIndicator) {
        this.restrictionOnlyIndicator = pRestrictionOnlyIndicator;
    }

    /**
     * Sets the value of AWB <code>routingDate</code> property.
     * <p>
     * it refers the AWB routing date.
     * <p>
     * <b>Format: </b><br>
     * 7 DATE ddMMMyy<br>
     * <b>Example: </b><br>
     * 06MAR07
     * <p>
     * 
     * @param pRoutingDate the new value of the <code>routingDate</code> property.
     */

    public void setRoutingDate(final Date pRoutingDate) {
        this.routingDate = ContractUtility.getClonedDate(pRoutingDate);

    }
}