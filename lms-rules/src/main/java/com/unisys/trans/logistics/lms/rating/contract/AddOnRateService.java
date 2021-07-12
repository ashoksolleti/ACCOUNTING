/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.AddOnRateCarrierRequest;
import com.unisys.trans.logistics.lms.rating.dto.AddOnRateCarrierResponse;
import com.unisys.trans.logistics.lms.rating.dto.AddOnRateDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.AddOnRateFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.AddOnRatePersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.AddOnRateResponse;

/**
 * <code>Add-on rate service</code> provides the functional methods to maintain
 * add-on rates information.
 * <p>
 * The add-on rates information maintains<br>
 * <ul>
 * <li>Geographical location data details like city code, city name,state code,state name and country code.
 * <li>User details like user identifier,station location,office and time.
 * <li>Various rate parameters to determine add-on rates.
 * </ul>
 * <p>
 * It offers the following services for maintaining add-on rates information:<br>
 * <ul>
 * <li>createAddOnRate - Creates add-on rate information.
 * <li>deleteAddOnRate - Deletes add-on rate information.
 * <li>findAddonRate - Finds the add-on rate for the given input details.
 * <li>findAllCitiesOfConstruction - Finds all the cities for which add-on rates exist.
 * <li>findCarriersWithAddOnRate - Finds all the carriers for the input city code and rate source code.
 * <li>updateAddOnRate - Updates add-on rate information.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.AddOnRateDeleteRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.AddOnRateFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.AddOnRatePersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.AddOnRateCarrierRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.AddOnRateResponse
 */
public interface AddOnRateService {

    /**
     * Creates an <code>add-on rate</code> for a specific city to be constructed
     * and city of construction,after validating all the input data.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.rating.contract.AddOnRateService#updateAddOnRate
     * updateAddOnRate}
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
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
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CITY_CODE_DOES_NOT_EXIST}</td>
     *            <td>The city does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CITY_CODE_MARKED_FOR_DELETION}</td>
     *            <td>The city is marked for deletion.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CARRIER_CODE_DOES_NOT_EXIST}</td>
     *            <td>The Carrier Code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CARRIER_CODE_MARKED_FOR_DELETION}</td>
     *            <td>The Carrier Code is marked for deletion.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATE_SOURCE_DOES_NOT_EXISTS}</td>
     *            <td>The Rate Source does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATE_SOURCE_NOT_BELONGS_TO_CARRIER}</td>
     *            <td>The Rate Source does not belong to the Carrier.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CURRENCY_CODE_DOES_NOT_EXIST}</td>
     *            <td>The Currency Code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_INPUT_CURRENCY_MUST_BE_VALID_CURRENCY_OF_CITY}</td>
     *            <td>The input currency must be one of the allowed currencies of City To Be Constructed Code.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants
     *            .MessageConstants#CURRENCY_MUST_HAVE_ROUNDING_FACTOR_AND_DECIMAL}</td>
     *            <td>The Currency must have Rounding Factor and Decimal Positions.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_ADDON_RATE_ALREADY_EXISTS}</td>
     *            <td>The Add-on Rate already exists for the input details.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATE_TYPE_DOES_NOT_EXIST}</td>
     *            <td>The Rate Type does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATE_TYPE_MARKED_FOE_DELETION}</td>
     *            <td>The Rate Type is marked for deletion.</tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATE_TYPE_NOT_ALLOWED_FOR_RATE_SOURCE}</td>
     *            <td>The Rate Type is not allowed for Rate Source.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_STANDARD_RATE_TYPES_ALLOWED_FOR_ADDON_RATE}</td>
     *            <td>Only Standard Rate Types are allowed for Add-on Rates.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.M
     *           essageConstants#RATE_CLASS_DOES_NOT_EXIST}</td>
     *            <td>The Rate Class does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_RATECLASS_NOT_ALLOWED_FOR_ADDON_RATE}</td>
     *            <td>The Rate Class is not allowed for add-on rate.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_IATA_RATE_TYPE}</td>
     *            <td>The Rate Class is not allowed for IATA rate type.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_ATPCO_RATE_TYPE}</td>
     *            <td>The Rate Class is not allowed for ATPCO rate type.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#ULD_TYPE_MANDATORY_FOR_RATE_CLASS}</td>
     *            <td>The ULD Type is mandatory for Rate Class.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#ULD_CHARGE_CODE_MANDATORY_FOR_RATE_CLASS}</td>
     *            <td>The ULD Charge Code is mandatory for Rate Class.</tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#MINIMUN_WEIGHT_MANDATORY_FOR_RATE_CLASS}</td>
     *            <td>The Minimum Weight is mandatory for Rate Class.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#ULD_TYPE_NOT_ALLOWED_FOR_RATE_CLASS}</td>
     *            <td>The ULD Type is not allowed for Rate Class.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#ULD_CHARGE_CODE_NOT_ALLOWED_FOR_RATE_CLASS}</td>
     *            <td>The ULD Charge Code is not allowed for Rate Class.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#MINIMUN_WEIGHT_NOT_ALLOWED_FOR_RATE_CLASS}</td>
     *            <td>The Minimum Weight is not allowed for Rate Class.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#ULD_TYPE_DOES_NOT_EXIST}</td>
     *            <td>The ULD Type does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#ULD_TYPE_MARKED_DELETION}</td>
     *            <td>The ULD Type is marked for deletion.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#ULD_CHARGE_CODE_DOES_NOT_EXIST}</td>
     *            <td>The ULD Charge Code does not exist in the system.</tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#ULD_CHARGE_CODE_NOT_ALLOWED_FOR_ATPCO}</td>
     *            <td>The ULD Charge Code is not allowed for ATPCO rate source.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_RATE_CLASS_NOT_ALLOWED_FOR_ULDCHARGE_CODE}</td>
     *            <td>The Rate Class is not allowed for the input ULD Charge Code.</td>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#MINIMUM_WEIGHT_GREATER_THAN_ONE_FOR_RATE_CLASS_Q}</td>
     *            <td>The Minimum Weight must be greater than 1 for Rate Class ‘Q’.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_MIN_WEIGHT_ZERO_FOR_RC_U_AND_ULD_A}</td>
     *            <td>The Minimum Weight must be 0 for Rate Class ‘U’ and ULD Charge Code ‘A’.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_MIN_WEIGHT_ONE_FOR_STANDARD_AND_RC_N}</td>
     *            <td>The Minimum Weight must be 1 for “Standard” Rate Types with “N” Rate Class.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_DEC_POSITION_FOR_MIN_WEIGHT_NOT_ALLOWED}</td>
     *            <td>The decimal position in Minimum Weight is not allowed</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#NUMBER_OF_DECIMAL_IN_RATE_AND_CURRENCY_MUST_SAME}</td>
     *            <td>The number of decimals in Rate must be same as Number of Decimals for the Currency.</tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#NUMBER_OF_DECIMAL_IN_OVER_PIVOT_RATE_AND_CURRENCY_MUST_SAME}</td>
     *            <td>The number of decimals in Over Pivot Rate must be same as Number of Decimals for the Currency.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants
     *            .MessageConstants#RATE_MUST_BE_ROUNDED_OFF}</td>
     *            <td>The Rate must be rounded off to Rounding Factor of Currency.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_OVER_PIVOTRATE_MUST_ROUND_OFF}</td>
     *            <td>The Over Pivot Rate must be rounded off to Rounding Factor of Currency.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_PIVOT_WEIGHT_ALLOWED_FOR_ATPCO_ULD_RATES_WITH_STD_RATE}</td>
     *            <td>The Pivot Weight is allowed only for ATPCO ULD rates  with Standard Rate Type.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_OVER_PIVOT_RATE_ALLOWED_FOR_ATPCO_ULD_RATES_WITH_STD_RATE}</td>
     *            <td>The Over Pivot Rate is allowed only for ATPCO ULD rates with Standard Rate Type.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#EFFECTIVE_DATE_MUST_BE_GREATER_OR_EQUAL_TO_CURR_SYS_DATE}</td>
     *            <td>The Effective Date must be greater than or equal to the current system date. </td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_EFF_DATE_GREATER_THAN_OR_EQUAL_CURRENCY_EFF_DATE}</td>
     *            <td>The input Effective Date of the add-on rate entry 
     *            must be greater than or equal to the Currency Effective Date.</td>
     *            </tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#INPUT_EXPIRATION_DATE_LESS_THAN_OR_EQUAL_TO_CURRENCY_EXPIRATION_DATE}</td>
     *            <td>The input Expiration Date of the add-on rate entry 
     *            must be less than or equal to the Currency Expiration Date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE}</td>
     *            <td>The Expiration Date must be equal or greater than Effective Date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_DUPLICATE_ADDON_RATE}</td>
     *            <td>The duplicate add-on rate entry is not allowed.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_RATE_CONST_MUST_VALID}</td>
     *            <td>The Rate Construction Area Code must be valid.</tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_RATE_CONST_MARKED_FOR_DELETION}</td>
     *            <td>The Rate Construction Area Code is marked for deletion.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pAddOnRatePersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRatePersistRequest
     *            AddOnRatePersistRequest} </code><br>
     *            holds the request object that includes attributes to create an add-on rate.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto
     *            AddOnRateDto} -(M) </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto#setCarrierCode
     *            carrierCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto#setCityCode
     *            cityCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto#setOId
     *            oId} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto#setAddOnRateEntryDtos
     *            addOnRateEntryDtos}</code></li>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setAction
     *            action} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setAmount
     *            amount} -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setCityCode
     *            cityCode} - (M)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setCurrencyCode
     *            currencyCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setDateRangeDto
     *            dateRangeDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.utility. ContractUtility.DateRangeDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.utility. ContractUtility.DateRangeDto#setExpirationDate
     *            expirationDate} - (O) </code></li>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setDirection
     *            direction}</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.constants.DirectionType#setType
     *            type} - (M)</code> </li>
     *            </ul>
     *            <li> <code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setError
     *            error} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setIataAreaZone
     *            iataAreaZone} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setMinimumWeight
     *            minimumWeight} -(C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setOId
     *            oId} - (C)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setOverPivotRate
     *            overPivotRate} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setPivotWeight
     *            pivotWeight}- (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setPlusOrMinusIndicator
     *            plusOrMinusIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setRateClassCode
     *            rateClassCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setRateConstructionAreaCode
     *            rateConstructionAreaCode} -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setRateSourceCode
     *            rateSourceCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setRateTypeCode
     *            rateTypeCode} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setRateTypePriority
     *            rateTypePriority}- (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setUldChargeCode
     *            uldChargeCode} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setUldTypeCode
     *            uldTypeCode} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setUserAudit
     *            userAudit}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.UserAuditDto#setAssociatedOffice
     *            associatedOffice} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.UserAuditDto#setAssociatedStation
     *            associatedStation} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.UserAuditDto#setCreatedOn
     *            createdOn} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.UserAuditDto#setUserIdentifier
     *            userIdentifier} - (M) </code></li>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateResponse
     *         AddOnRateResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateResponse#getAddOnRateDto
     *         addOnRateDto} </ul> </code>
     *         <p>
     * @throws LMSException
     *             If the add-on rate create operation fails,the above mentioned error codes are returned.
     *             Each Code Message contains the status code,human readable message and message type.
     */
    AddOnRateResponse createAddOnRate(
                final AddOnRatePersistRequest pAddOnRatePersistRequest)
                throws LMSException;

    /**
     * Deletes the <code>add-on rate</code> for a specific city to be
     * constructed and city of construction/cities of construction.
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
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants #AOR_ADDON_RATE_NOT_EXISTS}</td>
     *            <td>The Add-on Rate does not exist for the input details.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants #ADDON_RATE_EFFECTIVE_CANT_BE_DELETED}</td>
     *            <td>The Add-on Rate Entry is effective and only Expiration date can be updated.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pAddOnRateDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDeleteRequest
     *            AddOnRateDeleteRequest}</code><br>
     *            includes the attributes to delete an <code>add on-rate</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto
     *            AddOnRateDto} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto #setOId
     *            oId}</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateResponse
     *         AddOnRateResponse}</code>
     *         <ul>
     *         AddOnRateResponse <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants #AOR_ADDON_RATE_DELETED
     *         AOR_ADDON_RATE_DELETED} </code> for successful delete. <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateResponse #getAddOnRateDto()
     *         AddOnRateDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto
     *         AddOnRateDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the add-on rate delete operation fails, the above
     *             mentioned error codes are returned. Each CodeMessage contains
     *             the status code, human readable message, and message type.
     */
    AddOnRateResponse deleteAddOnRate(
                final AddOnRateDeleteRequest pAddOnRateDeleteRequest)
                throws LMSException;

    /**
     * Retrieves all the add-on rates that exist in the system for the city to
     * be constructed and carrier code.
     * <p>
     * The following inputs could be given as filters:<br>
     * <li>Currency code
     * <li>City of construction code
     * <li>Iata Area Zone
     * <li>Rate source code
     * <li>Rate Type Code
     * 
     * <p>
     * The city of construction can be given as a filter to retrieve the specific add-on rate that applies to
     * the city to be constructed and city of construction.
     * <p>
     * 
     * <b> Related methods include:</b><br>
     * 
     * {@link com.unisys.trans.logistics.lms.rating.contract.AddOnRateService #findAllCitiesToBeConstructed
     * findAllCitiesToBeConstructed}<br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.AddOnRateService #findCarriersWithAddOnRate
     * findCarriersWithAddOnRate}<br>
     * <p>
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
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CITY_CODE_DOES_NOT_EXIST}</td>
     *            <td>The city does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CARRIER_CODE_DOES_NOT_EXIST}</td>
     *            <td>The Carrier Code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_ADDON_RATE_NOT_EXISTS_FOR_FILTERS}</td>
     *            <td>The Add-on Rate does not exist for the input details and Filter combination.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_ADDON_RATE_NOT_EXISTS}</td>
     *            <td>The Add-on Rate does not exist for the input details.</td>
     *            </tr>
     *            
     *            </code>
     * </table>
     * <p>
     * 
     * 
     * @param pAddOnRateFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateFindRequest
     *            AddOnRateFindRequest}</code><br>
     *            includes the attributes to find an <code>add-on rate</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateFindDto
     *            AddOnRateDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateFindDto#setCityToBeConstructedCode
     *            cityToBeConstructedCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateFindDto#setCarrierCode
     *            carrierCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateFindDto#setRateSourceCode
     *            rateSourceCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateFindDto#setRateTypeCode
     *            rateTypeCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateFindDto#setCurrencyCode
     *            currencyCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateFindDto#setIataAreaZone
     *            iataAreaZone} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateFindDto#setcityOfConstructionCode
     *            cityOfConstructionCode} - (O)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateResponse
     *         AddOnRateResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateResponse#getAddOnRateDto
     *         addOnRateDto} - (1:*) </ul> </code>
     *         <p>
     * 
     * @throws LMSException
     *             If the find operation fails, the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    AddOnRateResponse findAddonRate(
                final AddOnRateFindRequest pAddOnRateFindRequest)
                throws LMSException;

    /**
     * Retrieves all the <code>cities</code> for which add-on rates exist in the
     * system.<br>
     * <p>
     * <b>Related Methods include :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.AddOnRateService#findAddonRate findAddonRate}
     * </ul>
     * </code>
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
     * @param pAddOnRateFindRequest
     *            <code>pAddOnRateFindRequest</code> is a dummy parameter ,given
     *            to satisfy the LMSNG convention.
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateResponse
     *         AddOnRateResponse} </code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateResponse #getcityDtos()
     *         cityDtos} - (0:*)</code><br>
     *         holds the list of <code>City</code> objects.
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If the <code>city</code> information does not exist,the error
     *             codes are returned.
     */
    AddOnRateResponse findAllCitiesOfConstruction(
                final AddOnRateFindRequest pAddOnRateFindRequest)
                throws LMSException;

    /**
     * Retrieves a list of <code> carriers</code> for which add-on rates exist
     * for the input city to be constructed and rate source code combination.
     * <p>
     * 
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.AddOnRateService#findAddonRate
     * findAddonRate}<br>
     * <p>
     * 
     * To find the list of carriers,user must provide following input:<br>
     * <li>cityCode
     * <li>rateSourceCode
     * 
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cell spacing="0" cell padding="5" width="80%">
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
     * <p>
     * 
     * @param pAddOnRateCarrierRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateCarrierRequest
     *            AddOnRateCarrierRequest}</code><br>
     *            includes the attributes to find an <code>Add-On Rate</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateFindDto
     *            AddOnRateDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateFindDto#setRateSourceCode
     *            rateSourceCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateFindDto#setCityToBeConstructedCode
     *            cityToBeConstructedCode} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateCarrierResponse
     *         AddOnRateCarrierResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateCarrierResponse#getCarrierDto()
     *         carrierDtos} - (0:*)</code>
     *         </ul>
     * @throws LMSException
     *             If the <code>carrier</code> information does not exist,the error codes are returned.
     */

    AddOnRateCarrierResponse findCarriersWithAddOnRate(
                final AddOnRateCarrierRequest pAddOnRateCarrierRequest)
                throws LMSException;

    /**
     * Updates an <code>add-on rate</code> for a specific city to be constructed
     * and city of construction,after validating all the input data.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.rating.contract.AddOnRateService#deleteAddOnRate
     * deleteAddOnRate}
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
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
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CITY_CODE_DOES_NOT_EXIST}</td>
     *            <td>The city does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CITY_CODE_MARKED_FOR_DELETION}</td>
     *            <td>The city is marked for deletion.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CARRIER_CODE_DOES_NOT_EXIST}</td>
     *            <td>The Carrier Code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CARRIER_CODE_MARKED_FOR_DELETION}</td>
     *            <td>The Carrier Code is marked for deletion.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATE_SOURCE_DOES_NOT_EXISTS}</td>
     *            <td>The Rate Source does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATE_SOURCE_NOT_BELONGS_TO_CARRIER}</td>
     *            <td>The Rate Source does not belong to the Carrier.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CURRENCY_CODE_DOES_NOT_EXIST}</td>
     *            <td>The Currency Code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_INPUT_CURRENCY_MUST_BE_VALID_CURRENCY_OF_CITY}</td>
     *            <td>The input currency must be one of the allowed
     *             currencies of City To Be Constructed Code.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CURRENCY_MUST_HAVE_ROUNDING_FACTOR_AND_DECIMAL}</td>
     *            <td>The Currency must have Rounding Factor and Decimal Positions.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATE_TYPE_DOES_NOT_EXIST}</td>
     *            <td>The Rate Type does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATE_TYPE_MARKED_FOE_DELETION}</td>
     *            <td>The Rate Type is marked for deletion.</tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATE_TYPE_NOT_ALLOWED_FOR_RATE_SOURCE}</td>
     *            <td>The Rate Type is not allowed for Rate Source.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_STANDARD_RATE_TYPES_ALLOWED_FOR_ADDON_RATE}</td>
     *            <td>Only Standard Rate Types are allowed for Add-on Rates.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATE_CLASS_DOES_NOT_EXIST}</td>
     *            <td>The Rate Class does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_RATECLASS_NOT_ALLOWED_FOR_ADDON_RATE}</td>
     *            <td>The Rate Class is not allowed for add-on rate.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_IATA_RATE_TYPE}</td>
     *            <td>The Rate Class is not allowed for IATA rate type.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_ATPCO_RATE_TYPE}</td>
     *            <td>The Rate Class is not allowed for ATPCO rate type.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#ULD_TYPE_MANDATORY_FOR_RATE_CLASS}</td>
     *            <td>The ULD Type is mandatory for Rate Class.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#ULD_CHARGE_CODE_MANDATORY_FOR_RATE_CLASS}</td>
     *            <td>The ULD Charge Code is mandatory for Rate Class.</tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants
     *            .MessageConstants#MINIMUN_WEIGHT_MANDATORY_FOR_RATE_CLASS}</td>
     *            <td>The Minimum Weight is mandatory for Rate Class.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#ULD_TYPE_NOT_ALLOWED_FOR_RATE_CLASS}</td>
     *            <td>The ULD Type is not allowed for Rate Class.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#ULD_CHARGE_CODE_NOT_ALLOWED_FOR_RATE_CLASS}</td>
     *            <td>The ULD Charge Code is not allowed for Rate Class.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#MINIMUN_WEIGHT_NOT_ALLOWED_FOR_RATE_CLASS}</td>
     *            <td>The Minimum Weight is not allowed for Rate Class.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#ULD_TYPE_DOES_NOT_EXIST}</td>
     *            <td>The ULD Type does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#ULD_TYPE_MARKED_DELETION}</td>
     *            <td>The ULD Type is marked for deletion.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#ULD_CHARGE_CODE_DOES_NOT_EXIST}</td>
     *            <td>The ULD Charge Code does not exist in the system.</tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#ULD_CHARGE_CODE_NOT_ALLOWED_FOR_ATPCO}</td>
     *            <td>The ULD Charge Code is not allowed for ATPCO rate source.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_RATE_CLASS_NOT_ALLOWED_FOR_ULDCHARGE_CODE}</td>
     *            <td>The Rate Class is not allowed for the input ULD Charge Code.</td>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#MINIMUM_WEIGHT_GREATER_THAN_ONE_FOR_RATE_CLASS_Q}</td>
     *            <td>The Minimum Weight must be greater than 1 for Rate Class ‘Q’.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_MIN_WEIGHT_ZERO_FOR_RC_U_AND_ULD_A}</td>
     *            <td>The Minimum Weight must be 0 for Rate Class ‘U’ and ULD Charge Code ‘A’.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_MIN_WEIGHT_ONE_FOR_STANDARD_AND_RC_N}</td>
     *            <td>The Minimum Weight must be 1 for “Standard” Rate Types with “N” Rate Class.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_DEC_POSITION_FOR_MIN_WEIGHT_NOT_ALLOWED}</td>
     *            <td>The decimal position in Minimum Weight is not allowed</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#NUMBER_OF_DECIMAL_IN_RATE_AND_CURRENCY_MUST_SAME}</td>
     *            <td>The number of decimals in Rate must be same as Number of Decimals for the Currency.</tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#NUMBER_OF_DECIMAL_IN_OVER_PIVOT_RATE_AND_CURRENCY_MUST_SAME}</td>
     *            <td>The number of decimals in Over Pivot Rate must be same as Number of Decimals for the Currency.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATE_MUST_BE_ROUNDED_OFF}</td>
     *            <td>The Rate must be rounded off to Rounding Factor of Currency.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_OVER_PIVOTRATE_MUST_ROUND_OFF}</td>
     *            <td>The Over Pivot Rate must be rounded off to Rounding Factor of Currency.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_PIVOT_WEIGHT_ALLOWED_FOR_ATPCO_ULD_RATES_WITH_STD_RATE}</td>
     *            <td>The Pivot Weight is allowed only for ATPCO ULD rates  with Standard Rate Type.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_OVER_PIVOT_RATE_ALLOWED_FOR_ATPCO_ULD_RATES_WITH_STD_RATE}</td>
     *            <td>The Over Pivot Rate is allowed only for ATPCO ULD rates with Standard Rate Type.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#EFFECTIVE_DATE_MUST_BE_GREATER_OR_EQUAL_TO_CURR_SYS_DATE}</td>
     *            <td>The Effective Date must be greater than or equal to the current system date. </td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_EFF_DATE_GREATER_THAN_OR_EQUAL_CURRENCY_EFF_DATE}</td>
     *            <td>The input Effective Date of the add-on rate entry must be greater 
     *            than or equal to the Currency Effective Date.</td>
     *            </tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#INPUT_EXPIRATION_DATE_LESS_THAN_OR_EQUAL_TO_CURRENCY_EXPIRATION_DATE}</td>
     *            <td>The input Expiration Date of the add-on rate entry must be less 
     *            than or equal to the Currency Expiration Date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE}</td>
     *            <td>The Expiration Date must be equal or greater than Effective Date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_EFFECTIVE_ADDON_RATE_EXP_DATE_ONLY_UPDATED}</td>
     *            <td>The Add-on Rate Entry is effective and only Expiration date can be updated. </td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_DUPLICATE_ADDON_RATE}</td>
     *            <td>The duplicate add-on rate entry is not allowed.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_RATE_CONST_MUST_VALID}</td>
     *            <td>The Rate Construction Area Code must be valid.</tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#AOR_RATE_CONST_MARKED_FOR_DELETION}</td>
     *            <td>The Rate Construction Area Code is marked for deletion.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pAddOnRatePersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRatePersistRequest
     *            AddOnRatePersistRequest} </code><br>
     *            holds the request object that includes attributes to update an add-on rate.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto
     *            AddOnRateDto} -(M) </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto#setCarrierCode
     *            carrierCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto#setCityCode
     *            cityCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto#setOId
     *            oId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto#setAddOnRateEntryDtos
     *            addOnRateEntryDtos}</code></li>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setAction
     *            action} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setAmount
     *            amount} -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setCityCode
     *            cityCode} - (M)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setCurrencyCode
     *            currencyCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setDateRangeDto
     *            dateRangeDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.utility. ContractUtility.DateRangeDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.utility. ContractUtility.DateRangeDto#setExpirationDate
     *            expirationDate} - (O) </code></li>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setDirection
     *            direction}</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.constants.DirectionType#setType
     *            type} - (M)</code> </li>
     *            </ul>
     *            <li> <code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setError
     *            error} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setIataAreaZone
     *            iataAreaZone} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setMinimumWeight
     *            minimumWeight} -(C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setOId
     *            oId} - (M)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setOverPivotRate
     *            overPivotRate} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setPivotWeight
     *            pivotWeight}- (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setPlusOrMinusIndicator
     *            plusOrMinusIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setRateClassCode
     *            rateClassCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setRateConstructionAreaCode
     *            rateConstructionAreaCode} -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setRateSourceCode
     *            rateSourceCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setRateTypeCode
     *            rateTypeCode} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setRateTypePriority
     *            rateTypePriority}- (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setUldChargeCode
     *            uldChargeCode} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setUldTypeCode
     *            uldTypeCode} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setUserAudit
     *            userAudit}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.UserAuditDto#setAssociatedOffice
     *            associatedOffice} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.UserAuditDto#setAssociatedStation
     *            associatedStation} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.UserAuditDto#setCreatedOn
     *            createdOn} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.UserAuditDto#setUserIdentifier
     *            userIdentifier} - (M) </code></li>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateResponse
     *         AddOnRateResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateResponse#getAddOnRateDto
     *         addOnRateDto} </ul> </code>
     *         <p>
     * @throws LMSException
     *             If the add-on rate update operation fails,the above mentioned error codes are returned.
     *             Each Code Message contains the status code,human readable message and message type.
     */
    AddOnRateResponse updateAddOnRate(
                final AddOnRatePersistRequest pAddOnRatePersistRequest)
                throws LMSException;

}
