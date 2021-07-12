/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.ValidationRequest;
import com.unisys.trans.logistics.lms.framework.dto.ValidationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.OtherChargeRatePersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateResponse;

/**
 * <code>OtherChargeRateService</code> is used to maintain other charge rate information for a specific other
 * charge code and sub-code.
 * <p>
 * Other charge rate is established for any station, country, or aggregate.It perform the following operations
 * <ul>
 * <li>createOtherChargeRate - Create an other charge rate information.
 * <li>updateOtherChargeRate - Update an other charge rate information.
 * <li>deleteOtherChargeRate - Delete an other charge rate information.
 * <li>findOtherChargeRates - Retrieve an other charge rate information. If input not provided retrieves the
 * information based on sign in station.
 * <li>validateRate - Validate and find the rate table for other charge code.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.OtherChargeRatePersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDeleteRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateResponse
 */
public interface OtherChargeRateService {

    /**
     * Persists the other charge rate information and returns the newly created other charge rate information.
     * <p>
     * Creates the details first when it does not exist for the other charge code, sub code and geographic
     * locations. The geographical location1, geographical location2 and other charge code passed in the
     * request are validated with the respective service in the rating system.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DESCRIPTION}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * 
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
     * <b>Errors: </b><br>
     * <b>Error Text: </b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_COUNTRY_DOES_NOT_EXIST}
     * </td>
     * <td>The country code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_STATION_DOES_NOT_EXIST}
     * </td>
     * <td>The station code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_IATA_AREA_DOES_NOT_EXIST}
     * </td>
     * <td>IATA area does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_SUB_AREA_DOES_NOT_EXIST}
     * </td>
     * <td>Sub area does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#AGGREGATE_DOES_NOT_EXIST}</td>
     * <td>The aggregate does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_REGION_DOES_NOT_EXIST}
     * </td>
     * <td>Region does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_OTHER_CHARGE_SUB_CODE_REQUIRED}
     * </td>
     * <td>Other charge sub code is mandatory for the other charge code.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_OTHER_CHARGE_SUB_CODE_DOES_NOT_EXIST}
     * </td>
     * <td>The other charge sub code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_OTHER_CHARGE_CODE_DOES_NOT_EXIST}
     * </td>
     * <td>The other charge code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_OTHER_CHARGE_RATE_CANNOT_BE_GENERATED}
     * </td>
     * <td>The other charge rate for the input other charge code cannot be created.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_USD_CAD_DECIMAL_POSITION_NOT_EQUAL}
     * </td>
     * <td>For currency USD and CAD the decimal position of the rate field is 4.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_RATE_DECIMAL_POSITION_GREATER_THAN_CURRENCY}
     * </td>
     * <td>The decimal position of the rate field should be less than or equal to {0} as defined in currency
     * rounding.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_END_DATE_OLDER_THAN_EFFECTIVE_DATE}
     * </td>
     * <td>End date is older than the effective date.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHAGERATE_EFFECTIVE_DATE_OLDER_THAN_TOMORROW}
     * </td>
     * <td>Effective date must be tomorrow or a future date.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHAGERATE_EFFECTIVE_DATE_OLDER_THAN_TODAY}
     * </td>
     * <td>Effective date must be today or a future date.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_RATE_IS_MANDATORY}
     * </td>
     * <td>Rate is mandatory for all table type except percentage of amount.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_BREAKPOINTUNIT_NOT_REQUIRED_RATE_FIXED}
     * </td>
     * <td>Break point unit not required when the break point type is for fixed rate.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_BREAK_POINT_FINAL_UPWARD_LIMIT_MUST_BE_SPACES}
     * </td>
     * <td>The last upward limit for a break point rate must be spaces or blank.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_BREAK_POINT_FINAL_UPWARD_LIMIT_MUST_NOT_BE_SPACES}
     * </td>
     * <td>The last upward limit for break point rates must not be spaces or blank when additional rate is
     * defined.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_ADDITIONAL_RATE_FINAL_UPWARD_LIMIT_MUST_BE_SPACES}
     * </td>
     * <td>The last upward limit for additional rates must be spaces or blank for fixed rate break point type.
     * </td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_ADDITIONAL_RATES_PROHIBITED}
     * </td>
     * <td>The last upward limit for additional rates must be spaces or blank for fixed rate break point type.
     * </td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_UNIQUE_FOR_COMBINATION}
     * </td>
     * <td>The other charge rate is unique for a particular location, other charge code and table type
     * combination.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_DATES_OVERLAP}</td>
     * <td>The effective and end dates can not overlap the effective and end dates of rates already existing
     * for the other charge code and sub code that the rates are being created for.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pOtherChargeRatePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRatePersistRequest
     *            OtherChargeRatePersistRequest}</code><br>
     *            Represents the request object for creating the other charge rate information. This request
     *            object contains OtherChargeDetailsDto that holds the other charge rate details to be
     *            created.
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRatePersistRequest
     *            OtherChargeRatePersistRequest} - (M)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeDetailDto
     *            OtherChargeDetailDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeDetailDto#setDescription
     *            description} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeDetailDto#setGeographicalLocation1
     *            geographicLocation1} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeDetailDto#setGeographicalLocation2
     *            geographicLocation2} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeDetailDto#setOId oId} - (C)
     *            </code><br>
     *            Prohibited for the create operation<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeDetailDto#setOtherChargeCode
     *            otherChargeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeDetailDto#setOtherChargeSubCode
     *            otherChargeSubCode} - (O)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto
     *            OtherChargeRateDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto#setBiDirectionalIndicator
     *            biDirectionalIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto#setCurrency currency}
     *            -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto#setEndDate endDate} -
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto#setMaximumCharge
     *            maximumCharge}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto#setMinimumCharge
     *            miminumCharge} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto#setOtherChargeRateType
     *            otherChargeRateType} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto#setWeightUOMType
     *            weightUOM} - (M)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateResponse
     *         OtherChargeRateResponse}</code> Returns the OtherChargeRateResponse object that contains the
     *         other charge rate information.
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateResponse#getOtherChargeDetails
     *         otherChargeDetails} - (1:*)</code>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         </code> <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeDetailDto
     *         OtherChargeDetailDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException <br>
     *             If the other charge rate create operation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human readable message and message
     *             type.
     */
    OtherChargeRateResponse
                createOtherChargeRate(OtherChargeRatePersistRequest pOtherChargeRatePersistRequest)
                            throws LMSException;

    /**
     * Deletes the other charge rate information based on the OID sent as a part of the request object.
     * <p>
     * This method deletes the rate only if it is not in effect, i.e., only future and pending entries can be
     * deleted.
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
     * <b>Errors: </b><br>
     * <b>Error Text: </b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_RATE_CANNOT_BE_DELETED}
     * </td>
     * <td>Only Pending/Future entries can be deleted. History and Effective entries cannot be deleted.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pOtherChargeRateDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDeleteRequest
     *            OtherChargeRateDeleteRequest}</code><br>
     *            Represents the request object for creating the other charge rate information. This request
     *            object contains OtherChargeDetailsDto that holds the other charge rate details to be
     *            created.
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDeleteRequest
     *            OtherChargeRateDeleteRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDeleteRequest#setOtherChargeRateOId
     *            otherChargeRateOId} - (M)</code>
     *            </ul>
     *            </ul>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateResponse
     *         OtherChargeRateResponse}</code> Returns the OtherChargeRateResponse object that contains the
     *         other charge rate information.
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateResponse#getOtherChargeDetails
     *         otherChargeDetails} - (1,*)</code>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeDetailDto
     *         OtherChargeDetailDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException <br>
     *             If the delete operation fails the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code,human readable message and message type.
     */
    OtherChargeRateResponse deleteOtherChargeRate(OtherChargeRateDeleteRequest pOtherChargeRateDeleteRequest)
                throws LMSException;

    /**
     * Retrieves the other charge rate information based on GeographicalLocation1 or GeographicalLocation2 or
     * OtherChargeCode.
     * <p>
     * It returns all the existing entries for the other charge rate and sorts the other charge code and sub
     * code alphabetically and the effective date in descending order. User can retrieve other charge details
     * either by providing GeographicalLocation1 or GeographicalLocation1 and GeographicalLocation2 or both,
     * In which case the system retrieves all the existing other charge details for the given location inputs.
     * The user can further limit the retrieval output by providing additional filter criteria like the Other
     * Charge code and the corresponding sub code and effective date along with the Geographical locations
     * (GeographicalLocation1 or GeographicalLocation1 and GeographicalLocation2 or both). In which case, the
     * system returns all other charge codes details for the location and other charge code/sub code effective
     * on the input date.
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
     * <b>Errors: </b><br>
     * <b>Error Text: </b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_COUNTRY_DOES_NOT_EXIST}
     * </td>
     * <td>The country code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_STATION_DOES_NOT_EXIST}
     * </td>
     * <td>The station code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_IATA_AREA_DOES_NOT_EXIST}
     * </td>
     * <td>IATA area does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_SUB_AREA_DOES_NOT_EXIST}
     * </td>
     * <td>Sub area does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#AGGREGATE_DOES_NOT_EXIST}</td>
     * <td>The aggregate does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_REGION_DOES_NOT_EXIST}
     * </td>
     * <td>Region does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_OTHER_CHARGE_RATE_NOT_FOUND}
     * </td>
     * <td>No other charge exists in the system for the input provided.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pOtherChargeRateFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateFindRequest
     *            OtherChargeRateFindRequest}</code><br>
     *            Represents the request object for finding the other charge rate information.
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateFindRequest
     *            OtherChargeRateFindRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateFindRequest#setDate date} -
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateFindRequest#setGeographicalLocation1
     *            geographicalLocation1} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateFindRequest#setGeographicalLocation2
     *            geographicalLocation2} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateFindRequest#setOtherChargeCode
     *            otherChargeCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateFindRequest#setOtherChargeSubCode
     *            otherChargeSubCode} - (O)</code>
     *            </ul>
     *            </ul>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateResponse
     *         OtherChargeRateResponse}</code> Returns the OtherChargeRateResponse object that contains the
     *         other charge rate information.
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateResponse#getOtherChargeDetails
     *         otherChargeDetails} - (1,*)</code>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeDetailDto
     *         OtherChargeDetailDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException <br>
     *             If the find operation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    OtherChargeRateResponse findOtherChargeRates(OtherChargeRateFindRequest pOtherChargeRateFindRequest)
                throws LMSException;

    /**
     * Persists the other charge information and returns the updated other charge rate information.
     * <p>
     * Update of only end date is allowed if the rate is already in effect and this method accepts only a
     * single OtherChargeRateDto instance in OtherChargeDetailDto.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DESCRIPTION}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * 
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
     * <b>Errors: </b><br>
     * <b>Error Text: </b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_COUNTRY_DOES_NOT_EXIST}
     * </td>
     * <td>The country code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_STATION_DOES_NOT_EXIST}
     * </td>
     * <td>The station code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_IATA_AREA_DOES_NOT_EXIST}
     * </td>
     * <td>IATA area does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_SUB_AREA_DOES_NOT_EXIST}
     * </td>
     * <td>Sub area does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#AGGREGATE_DOES_NOT_EXIST}</td>
     * <td>The aggregate does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_REGION_DOES_NOT_EXIST}
     * </td>
     * <td>Region does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_OTHER_CHARGE_SUB_CODE_REQUIRED}
     * </td>
     * <td>Other charge sub code is mandatory for the other charge code.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_OTHER_CHARGE_SUB_CODE_DOES_NOT_EXIST}
     * </td>
     * <td>The other charge sub code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_OTHER_CHARGE_CODE_DOES_NOT_EXIST}
     * </td>
     * <td>The other charge code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_OTHER_CHARGE_RATE_CANNOT_BE_GENERATED}
     * </td>
     * <td>The other charge rate for the input other charge code cannot be created.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_USD_CAD_DECIMAL_POSITION_NOT_EQUAL}
     * </td>
     * <td>For currency USD and CAD the decimal position of the rate field is 4.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_RATE_DECIMAL_POSITION_GREATER_THAN_CURRENCY}
     * </td>
     * <td>The decimal position of the rate field should be less than or equal to {0} as defined in currency
     * rounding.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_END_DATE_OLDER_THAN_EFFECTIVE_DATE}
     * </td>
     * <td>End date is older than the effective date.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHAGERATE_EFFECTIVE_DATE_OLDER_THAN_TOMORROW}
     * </td>
     * <td>Effective date must be tomorrow or a future date.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHAGERATE_EFFECTIVE_DATE_OLDER_THAN_TODAY}
     * </td>
     * <td>Effective date must be today or a future date.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_RATE_IS_MANDATORY}
     * </td>
     * <td>Rate is mandatory for all table type except percentage of amount.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_BREAKPOINTUNIT_NOT_REQUIRED_RATE_FIXED}
     * </td>
     * <td>Break point unit not required when the break point type is for fixed rate.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_BREAK_POINT_FINAL_UPWARD_LIMIT_MUST_BE_SPACES}
     * </td>
     * <td>The last upward limit for a break point rate must be spaces or blank.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_BREAK_POINT_FINAL_UPWARD_LIMIT_MUST_NOT_BE_SPACES}
     * </td>
     * <td>The last upward limit for break point rates must not be spaces or blank when additional rate is
     * defined.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_ADDITIONAL_RATE_FINAL_UPWARD_LIMIT_MUST_BE_SPACES}
     * </td>
     * <td>The last upward limit for additional rates must be spaces or blank for fixed rate break point type.
     * </td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_ADDITIONAL_RATES_PROHIBITED}
     * </td>
     * <td>The last upward limit for additional rates must be spaces or blank for fixed rate break point type.
     * </td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_UNIQUE_FOR_COMBINATION}
     * </td>
     * <td>The other charge rate is unique for a particular location, other charge code and table type
     * combination.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_DATES_OVERLAP}</td>
     * <td>The effective and end dates can not overlap the effective and end dates of rates already existing
     * for the other charge code and sub code that the rates are being created for.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_CURRENCY_CANNOT_BE_UPDATED}
     * </td>
     * <td>The currency cannot be updated after the rate is entered. To change the currency, delete the rate,
     * and re-create the rate with the new currency code.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ONLY_END_DATE_CAN_BE_UPDATED_FOR_THE_OTHERCHARGERATE}
     * </td>
     * <td>Only end date can be updated for an effective other charge rate.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#OTHERCHARGERATE_TABLE_TYPE_CANNOT_BE_UPDATED}
     * </td>
     * <td>Table type cannot be updated. To change the table type of an other charge code, delete the rate and
     * then recreate with the new table type</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pOtherChargeRatePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRatePersistRequest
     *            OtherChargeRatePersistRequest}</code><br>
     *            Represents the request object for creating the other charge rate information. This request
     *            object contains OtherChargeDetailsDto that holds the other charge rate details to be
     *            created.
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRatePersistRequest
     *            OtherChargeRatePersistRequest} - (M)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeDetailDto
     *            OtherChargeDetailDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeDetailDto#setDescription
     *            description} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeDetailDto#setGeographicalLocation1
     *            geographicLocation1} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeDetailDto#setGeographicalLocation2
     *            geographicLocation2} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeDetailDto#setOtherChargeCode
     *            otherChargeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeDetailDto#setOtherChargeSubCode
     *            otherChargeSubCode} - (O)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto
     *            OtherChargeRateDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto#setBiDirectionalIndicator
     *            biDirectionalIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto#setCurrency currency}
     *            -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto#setEndDate endDate} -
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto#setMaximumCharge
     *            maximumCharge}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto#setMinimumCharge
     *            miminumCharge} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto#setOtherChargeRateType
     *            otherChargeRateType} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateDto#setWeightUOMType
     *            weightUOM} - (M)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateResponse
     *         OtherChargeRateResponse}</code> Returns the OtherChargeRateResponse object that contains the
     *         other charge rate information.
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeRateResponse#getOtherChargeDetails
     *         otherChargeDetails} - (1,*)</code>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeDetailDto
     *         OtherChargeDetailDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException <br>
     *             If the update operation fails the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code,human readable message and message type.
     */
    OtherChargeRateResponse
                updateOtherChargeRate(OtherChargeRatePersistRequest pOtherChargeRatePersistRequest)
                            throws LMSException;

    /**
     * Validates if an other charge rate exist in the system for the other charge code input.
     * <p>
     * The other charge rate existence is checked for the other charge code and the sign in station
     * combination.
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
     * @param pValidationRequest <code>{@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest
     *            ValidationRequest}</code><br>
     *            The request object which contains the list of search input values
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest#setSearchInputs
     *            searchInputs} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
     *         ValidationResponse}</code><br>
     *         Returns the valid response object.<br>
     *         <ul>
     *         <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         <code>{@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getValidInputs
     *         validInputs}-(0:*)</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getSearchInputs
     *         searchInputs} -(1:*)</code>
     *         </ul>
     */
    ValidationResponse validateRate(final ValidationRequest pValidationRequest);
}