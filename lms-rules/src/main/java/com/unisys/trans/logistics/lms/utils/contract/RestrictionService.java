/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.RestrictionDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.RestrictionDto;
import com.unisys.trans.logistics.lms.utils.dto.RestrictionFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.RestrictionPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.RestrictionResponse;

/**
 * <code>RestrictionService</code> interface exposes the APIs which identifies various processing flows
 * involved in maintaining restrictions.
 * <p>
 * A restriction is a general station restriction, carrier restriction, or an industry restriction or collect
 * charge restriction.An restriction can be classified as export,transit,import or system wide import
 * restriction.
 * <p>
 * This performs the following functions.<br>
 * <ul>
 * <li>Creates the restriction.
 * <li>Deletes the restriction.
 * <li>Finds the restriction.
 * <li>Updates the restriction.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionPersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionResponse
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionDto
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionCodeDto
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionSearchDto
 */
public interface RestrictionService {

    /**
     * Creates the <code>Restriction</code> information.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.RestrictionService#updateRestriction(RestrictionPersistRequest)
     * UpdateRestrictionType }
     * <p>
     * The new restriction is created for a pair of station and carrier.Station and carrier is validated
     * against the system data.If system wide indicator is yes then restriction is valid for all stations and
     * input carrier.System validates the following inputs.
     * <ul>
     * <li>Flight.
     * <li>Restriction code.
     * <li>Product code.
     * <li>Special handling code.
     * <li>Country code.
     * <li>Date.
     * <li>Frequencies.
     * </ul>
     * <br>
     * If all the details are appropriate,the restriction gets created in the system.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     *      <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DAYS}
     *      <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * 
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
     * <br>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_UNAUTHORIZATION_STATION_CODE}</td>
     *            <td>Updates not allowed.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERCODE_NOTEXISTS}</td>
     *            <td>The Carrier Code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_CPARAM_EFFECTIVE_DATE_INVALID_ZERO}</td>
     *            <td>Effective date must be tomorrow or later. (If parameter Effective date today or tomorrow
     *            is set to 0)</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_CPARAM_EFFECTIVE_DATE_INVALID_ONE}</td>
     *            <td>Effective date must be today or later. (If parameter Effective date today or tomorrow
     *            is set to 1)</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_CPARAM_START_DATE_INVALID}</td>
     *            <td>Effective date must not be later than Future allowable input date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_EFFECTIVE_DATE_GREATER_THAN_END_DATE}</td>
     *            <td>Effective date can not be greater than end date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_CPARAM_END_DATE_INVALID}</td>
     *            <td>End date must not be later than Future allowable input date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_DUPLICATE_RECORD}</td>
     *            <td>Duplicate Restriction.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_PRODUCT_CODE_DOES_NOT_EXIST}</td>
     *            <td>The product code(s) does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_SPECIALHANDLINGCODE_OBJECT_DOES_NOT_EXIST}</td>
     *            <td>The special handling code(s) does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_STATION_DOES_NOT_EXIST}</td>
     *            <td>The station code(s) does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_COUNTRY_CODENOTEXIST}</td>
     *            <td>The country code(s) does not exist in the system.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pRestrictionPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionPersistRequest
     *            RestrictionPersistRequest}</code><br>
     *            holds the request object which includes the attributes to create a restriction for a station
     *            and carrier.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionPersistRequest
     *            RestrictionPersistRequest} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto RestrictionDto} -
     *            (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto#setCarrierCode
     *            carrierCode} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto#setOId oId} - (M)</code> <li>
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto#setRemarks remarks} -
     *            (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto#setRemarksDisplayCode
     *            remarksDisplayCode} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto#setStationCode stationCode} -
     *            (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto#setSystemWideIndicator
     *            systemWideIndicator} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto#setRestrictionDetails
     *            restrictionDetails} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto
     *            restrictionDetailDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setAircraftEquipmentCode
     *            aircraftEquipmentCode} - (o)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setAircraftRegistrationCode
     *            aircraftRegistrationCode} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setAircraftRegisterNumber
     *            aircraftRegisterNumber} - (o)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setDaysOfWeek
     *            daysOfWeek} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setEffectiveDate
     *            effectiveDate}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setEndDate endDate} -
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setEnforcementCode
     *            enforcementCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setFlight flight} - (O)
     *            </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setNumber number} -(O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setSuffix suffix} -(O)
     *            </code>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setOId oId}-
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setRestrictionCodes
     *            restrictionCodes} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionCodeDto
     *            RestrictionCodeDto} - (0)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionCodeDto#setCode code}
     *            - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionCodeDto#setOId oId} - (M)</code>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionCodeDto#setRestrictionDetailOId
     *            restrictionDetailOId} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionCodeDto#setType type} - (O)
     *            </code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setRestrictionOId
     *            restrictionOId}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setRestrictionTypeCode
     *            restrictionTypeCode} - (O)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionResponse RestrictionResponse
     *         * } <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionResponse#getRestriction()
     *         restriction} </ul> </code>
     *         <p>
     * @throws LMSException If creation of restriction fails the above message codes returned.Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    RestrictionResponse createRestriction(RestrictionPersistRequest pRestrictionPersistRequest)
                throws LMSException;

    /**
     * Deletes the existing <code>Restriction</code> information for provided unique key.
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
     * <br>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_UNAUTHORIZATION_STATION_CODE}</td>
     *            <td>Updates not allowed.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pRestrictionDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionPersistRequest
     *            RestrictionPersistRequest}</code><br>
     *            holds the request object that includes the attributes to delete a restriction for a station
     *            and carrier.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDeleteRequest
     *            RestrictionDeleteRequest} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDeleteRequest#setOId
     *            oId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDeleteRequest#setRestrictionDetailOId
     *            restrictionDetailOId} - (0)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDeleteRequest#setStationCode
     *            stationCode} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionResponse RestrictionResponse
     *         * } <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionResponse#getRestriction()
     *         restriction} </ul> </code>
     *         <p>
     * @throws LMSException If deletion of restriction fails the above message codes returned.Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    RestrictionResponse deleteRestriction(RestrictionDeleteRequest pRestrictionDeleteRequest)
                throws LMSException;

    /**
     * Finds the <code>Restriction</code> information based on the filter criteria.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.RestrictionService#findRestrictionByStationCarrier(RestrictionFindRequest)
     * findRestriction }
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
     * <br>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_DOES_NOT_EXIST}</td>
     *            <td>Restriction does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERCODE_NOTEXISTS}</td>
     *            <td>The Carrier Code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_PRODUCT_CODE_DOES_NOT_EXIST}</td>
     *            <td>The product code(s) does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_SPECIALHANDLINGCODE_OBJECT_DOES_NOT_EXIST}</td>
     *            <td>The special handling code(s) does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_STATION_DOES_NOT_EXIST}</td>
     *            <td>The station code(s) does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_COUNTRY_CODENOTEXIST}</td>
     *            <td>The country code(s) does not exist in the system.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pRestrictionFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionFindRequest
     *            RestrictionFindRequest}</code><br>
     *            holds the request object that includes the attributes to find a restriction information.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionFindRequest
     *            RestrictionFindRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionFindRequest#setCarrierCode
     *            carrierCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionFindRequest#setStationCode
     *            stationCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionFindRequest#setSystemWideIndicator
     *            systemWideIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionFindRequest#setRestrictionSearch
     *            restrictionSearch} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionSearchDto restrictionSearch} -
     *            (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionSearchDto#setAircraftEquipmentCode
     *            aircraftEquipmentCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionSearchDto#setAircraftRegistrationCode
     *            aircraftRegistrationCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionSearchDto#setAircraftRegisterNumber
     *            aircraftRegisterNumber} - (0)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionSearchDto#setDaysOfWeek
     *            daysOfWeek} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionSearchDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionSearchDto#setEndDate endDate} -
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionSearchDto#setEnforcementCode
     *            enforcementCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionSearchDto#setFlight flight} - (0)
     *            </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setNumber number} -(O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setSuffix suffix} -(O)
     *            </code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionSearchDto#setRestrictionCodes
     *            restrictionCodes} - (0)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionCodeDto
     *            RestrictionCodeDto} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionCodeDto#setCode code}
     *            - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionCodeDto#setOId oId} - (M)</code>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionCodeDto#setRestrictionDetailOId
     *            restrictionDetailOId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionCodeDto#setType type} - (O)
     *            </code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionResponse RestrictionResponse
     *         * } <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionResponse#getRestriction()
     *         restriction} </ul> </code>
     *         <p>
     * @throws LMSException If retrieve operation of restriction fails the above message codes returned.Each
     *             CodeMessage contains the status code,human readable message and message type.
     */
    RestrictionResponse findRestriction(RestrictionFindRequest pRestrictionFindRequest) throws LMSException;

    /**
     * Finds the <code>Restriction</code> information based on station and carrier code.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.RestrictionService#findRestriction(RestrictionFindRequest)
     * findRestrictionByStationCarrier }
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
     * <br>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERCODE_NOTEXISTS}</td>
     *            <td>The Carrier Code does not exist in the system.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pRestrictionFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionFindRequest
     *            RestrictionFindRequest}</code><br>
     *            holds request object that includes the attributes to find a restriction information.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionFindRequest
     *            RestrictionFindRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionFindRequest#setCarrierCode
     *            carrierCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionFindRequest#setStationCode
     *            stationCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionFindRequest#setSystemWideIndicator
     *            systemWideIndicator} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto RestrictionDto}</code><br>
     *         Returns the restriction data transfer object.<br>
     *         <p>
     * @throws LMSException If find operation fails the above message codes returned.Each CodeMessage contains
     *             the status code,human readable message and message type.
     */
    RestrictionDto findRestrictionByStationCarrier(final RestrictionFindRequest pRestrictionFindRequest)
                throws LMSException;

    /**
     * Updates the <code>Restriction</code> information.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.RestrictionService#createRestriction(RestrictionPersistRequest)
     * UpdateRestrictionType }
     * <p>
     * The existing restriction is updated. Station and carrier is validated against the system data. If
     * system wide indicator is yes then restriction is valid for all stations and input carrier.System
     * validates the following inputs.
     * <ul>
     * <li>Flight.
     * <li>Restriction code.
     * <li>Product code.
     * <li>Special handling code.
     * <li>Country code.
     * <li>Date.
     * <li>Frequencies.
     * </ul>
     * <br>
     * If all the details are appropriate,the restriction gets updated in the system.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     *      <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DAYS}
     *      <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * 
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
     * <br>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_STATION_CANNOT_BE_UPDATE}</td>
     *            <td>Station cannot be updated.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_CARRIER_CANNOT_BE_UPDATE}</td>
     *            <td>Carrier cannot be updated.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_UNAUTHORIZATION_STATION_CODE}</td>
     *            <td>Updates not allowed.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERCODE_NOTEXISTS}</td>
     *            <td>The Carrier Code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_CPARAM_EFFECTIVE_DATE_INVALID_ZERO}</td>
     *            <td>Effective date must be tomorrow or later. (If parameter Effective date today or tomorrow
     *            is set to 0)</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_CPARAM_EFFECTIVE_DATE_INVALID_ONE}</td>
     *            <td>Effective date must be today or later. (If parameter Effective date today or tomorrow
     *            is set to 1)</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_CPARAM_START_DATE_INVALID}</td>
     *            <td>Effective date must not be later than Future allowable input date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_EFFECTIVE_DATE_GREATER_THAN_END_DATE}</td>
     *            <td>Effective date can not be greater than end date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_CPARAM_END_DATE_INVALID}</td>
     *            <td>End date must not be later than Future allowable input date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_DUPLICATE_RECORD}</td>
     *            <td>Duplicate Restriction.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_PRODUCT_CODE_DOES_NOT_EXIST}</td>
     *            <td>The product code(s) does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_SPECIALHANDLINGCODE_OBJECT_DOES_NOT_EXIST}</td>
     *            <td>The special handling code(s) does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_STATION_DOES_NOT_EXIST}</td>
     *            <td>The station code(s) does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RESTRICTION_COUNTRY_CODENOTEXIST}</td>
     *            <td>The country code(s) does not exist in the system.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pRestrictionPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionPersistRequest
     *            RestrictionPersistRequest}</code><br>
     *            holds the request object that includes the attributes to create a restriction for a station
     *            and a carrier.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionPersistRequest
     *            RestrictionPersistRequest} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto RestrictionDto} -
     *            (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto#setCarrierCode
     *            carrierCode} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto#setOId oId} - (M)</code> <li>
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto#setRemarks remarks} -
     *            (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto#setRemarksDisplayCode
     *            remarksDisplayCode} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto#setStationCode stationCode} -
     *            (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto#setSystemWideIndicator
     *            systemWideIndicator} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDto#setRestrictionDetails
     *            restrictionDetails} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto
     *            restrictionDetailDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setAircraftEquipmentCode
     *            aircraftEquipmentCode} - (o)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setAircraftRegistrationCode
     *            aircraftRegistrationCode} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setAircraftRegisterNumber
     *            aircraftRegisterNumber} - (o)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setDaysOfWeek
     *            daysOfWeek} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setEffectiveDate
     *            effectiveDate}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setEndDate endDate} -
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setEnforcementCode
     *            enforcementCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setFlight flight} - (O)
     *            </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setNumber number} -(O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setSuffix suffix} -(O)
     *            </code>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setOId oId}-
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setRestrictionCodes
     *            restrictionCodes} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionCodeDto
     *            RestrictionCodeDto} - (0)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionCodeDto#setCode code}
     *            - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionCodeDto#setOId oId} - (M)</code>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionCodeDto#setRestrictionDetailOId
     *            restrictionDetailOId} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionCodeDto#setType type} - (O)
     *            </code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setRestrictionOId
     *            restrictionOId}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto#setRestrictionTypeCode
     *            restrictionTypeCode} - (O)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionResponse RestrictionResponse
     *         * } <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionResponse#getRestriction()
     *         restriction} </ul> </code>
     *         <p>
     * @throws LMSException If restriction update operation fails the above message codes returned.Each
     *             CodeMessage contains the status code,human readable message and message type.
     */
    RestrictionResponse updateRestriction(RestrictionPersistRequest pRestrictionPersistRequest)
                throws LMSException;

}
