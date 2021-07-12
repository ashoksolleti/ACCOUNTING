/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRequest;
import com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateResponse;

/**
 * <code>RestrictionGenerateService</code> interface exposes the APIs which identifies various processing
 * flows involved in retrieving restrictions givent routing and segments.
 * <p>
 * It provides the functional methods to generate the restriction error and warning information and describes
 * the way in which the restriction errors and warnings are generated. The restrictions for a station/carrier
 * can be classified as follows.
 * <ul>
 * <li>Export restriction.
 * <li>Transit restriction.
 * <li>Import restriction.
 * <li>Collect charge restriction.
 * </ul>
 * <p>
 * This includes the following operations:
 * <ul>
 * <li>Find restriction for routing.
 * <li>Find restriction for segments.
 * <li>Find collect charge restrictions.
 * </ul>
 * <p>
 * 
 * @see com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateResponse
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateCodeDto
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRoutingDto
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateCodeDto
 */
public interface RestrictionGenerateService {
    /**
     * Finds the collect charge <code>Restriction</code> for the input awb routing.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.RestrictionGenerateService#findRestrictionsForAWBRouting(RestrictionGenerateRequest)
     * findRestrictionsForAWBRouting }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.RestrictionGenerateService#findRestrictionsForSegment(RestrictionGenerateRequest)}
     * findRestrictionsForSegment }
     * <p>
     * Retrieval of collect charge restriction is done,it may be of two kinds:
     * <ul>
     * <li>Collect charge restriction for routing destination station.
     * <li>System wide collect charge restriction for routing destination station.
     * </ul>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pRestrictionGenerateRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRequest
     *            RestrictionGenerateRequest}</code><br>
     *            This input parameter is used for finding restriction information.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRequest#setResponseMessageType
     *            responseMessageType} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateCodeDto
     *            RestrictionGenerateCodeDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateCodeDto#setCode code} -
     *            (O)</code>
     *            </ul>
     *            </ul>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRoutingDto
     *            RestrictionGenerateRoutingDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRoutingDto#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRoutingDto#setPosition
     *            position} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRoutingDto#setStationCode
     *            stationCode} -(M)</code>
     *            </ul>
     *            </ul>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto
     *            RestrictionGenerateSegmentDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setAircraftEquipmentCode
     *            aircraftEquipmentCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setAircraftRegistrationNumber
     *            aircraftRegistrationNumber} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setArrivalDate
     *            arrivalDate} -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setDepartureDate
     *            departureDate} -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setDestinationStation
     *            destinationStation} -(M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto BaseFlightDto}
     *            - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setNumber number} -(M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setSuffix suffix} -(O)
     *            </code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setOriginStation
     *            originStation} -(M)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRequest#setRestrictionOnlyIndicator
     *            restrictionOnlyIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRequest#setRoutingDate
     *            routingDate} - (O)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateResponse
     *         RestrictionGenerateResponse}<br> <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto RestrictionDto} </ul> </code>
     *         <p>
     * @throws LMSException If the retrieve operation fails the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code,human readable message and message type.
     */

    RestrictionGenerateResponse findCollectChargeRestriction(
                final RestrictionGenerateRequest pRestrictionGenerateRequest) throws LMSException;

    /**
     * Finds <code>Restriction</code> for the input awb routing.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.RestrictionGenerateService#findCollectChargeRestriction(RestrictionGenerateRequest)
     * findCollectChargeRestriction }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.RestrictionGenerateService#findRestrictionsForSegment(RestrictionGenerateRequest)}
     * findRestrictionsForSegment }
     * <p>
     * For a given awb routing it performs following operations.
     * <ul>
     * <li>Retrieve export restrictions for origin station.
     * <li>Retrieve import restrictions for destination station.
     * <li>Retrieve transit restrictions for all intermediate station.
     * <li>Retrieve all system wide export restrictions.
     * <li>Retrieve all system wide import restrictions.
     * <li>It filters out all restrictions based on input data like date,frequency,restriction type.
     * </ul>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pRestrictonGenerateRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRequest
     *            RestrictionGenerateRequest}</code><br>
     *            This input parameter is used for finding restriction information.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRequest#setResponseMessageType
     *            responseMessageType} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateCodeDto
     *            RestrictionGenerateCodeDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateCodeDto#setCode code} -
     *            (O)</code>
     *            </ul>
     *            </ul>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRoutingDto
     *            RestrictionGenerateRoutingDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRoutingDto#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRoutingDto#setPosition
     *            position} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRoutingDto#setStationCode
     *            stationCode} -(M)</code>
     *            </ul>
     *            </ul>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto
     *            RestrictionGenerateSegmentDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setAircraftEquipmentCode
     *            aircraftEquipmentCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setAircraftRegistrationNumber
     *            aircraftRegistrationNumber} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setArrivalDate
     *            arrivalDate} -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setDepartureDate
     *            departureDate} -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setDestinationStation
     *            destinationStation} -(M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto BaseFlightDto}
     *            - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setNumber number} -(M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setSuffix suffix} -(O)
     *            </code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setOriginStation
     *            originStation} -(M)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRequest#setRestrictionOnlyIndicator
     *            restrictionOnlyIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRequest#setRoutingDate
     *            routingDate} - (O)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateResponse
     *         RestrictionGenerateResponse}<br> <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto RestrictionDto} </ul> </code>
     *         <p>
     * @throws LMSException If the retrieve operation fails the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code,human readable message and message type.
     */
    RestrictionGenerateResponse findRestrictionsForAWBRouting(
                final RestrictionGenerateRequest pRestrictonGenerateRequest) throws LMSException;

    /**
     * Finds the export, import, transit and system wide <code>Restriction</code> for the input segments.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.RestrictionGenerateService#findCollectChargeRestriction(RestrictionGenerateRequest)
     * findCollectChargeRestriction }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.RestrictionGenerateService#findRestrictionsForSegment(RestrictionGenerateRequest)}
     * findRestrictionsForSegment }
     * <p>
     * For a given awb routing and list of segments it performs following operations.
     * <ul>
     * <li>If the segment origin is same as the routing origin,it retrieves all export station restrictions
     * for the segment origin station and the segment carrier
     * <li>If the segment destination is same as the routing destination,it retrieves all import station
     * restrictions for the segment destination station and the segment carrier
     * <li>Retrieve transit restrictions at the segment destination/source station and segment carrier .
     * <li>Retrieve all system wide export restrictions.
     * <li>Retrieve all system wide import restrictions.
     * <li>It filters out all restrictions based on input data like date,frequency,restriction type and
     * segment informations.
     * </ul>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pRestrictonGenerateRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRequest
     *            RestrictionGenerateRequest}</code><br>
     *            This input parameter is used for finding restriction information.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRequest#setResponseMessageType
     *            responseMessageType} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateCodeDto
     *            RestrictionGenerateCodeDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateCodeDto#setCode code} -
     *            (O)</code>
     *            </ul>
     *            </ul>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRoutingDto
     *            RestrictionGenerateRoutingDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRoutingDto#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRoutingDto#setPosition
     *            position} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRoutingDto#setStationCode
     *            stationCode} -(M)</code>
     *            </ul>
     *            </ul>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto
     *            RestrictionGenerateSegmentDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setAircraftEquipmentCode
     *            aircraftEquipmentCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setAircraftRegistrationNumber
     *            aircraftRegistrationNumber} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setArrivalDate
     *            arrivalDate} -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setDepartureDate
     *            departureDate} -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setDestinationStation
     *            destinationStation} -(M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto BaseFlightDto}
     *            - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setNumber number} -(M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setSuffix suffix} -(O)
     *            </code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateSegmentDto#setOriginStation
     *            originStation} -(M)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRequest#setRestrictionOnlyIndicator
     *            restrictionOnlyIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateRequest#setRoutingDate
     *            routingDate} - (O)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionGenerateResponse
     *         RestrictionGenerateResponse}<br> <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto RestrictionDto} </ul> </code>
     *         <p>
     * @throws LMSException If the retrieve operation fails the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code,human readable message and message type.
     */
    RestrictionGenerateResponse findRestrictionsForSegment(
                final RestrictionGenerateRequest pRestrictonGenerateRequest) throws LMSException;

}
