/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.ExtractRequest;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.ExtractResponse;
import com.unisys.trans.logistics.lms.rating.dto.TariffRateCarrierRequest;
import com.unisys.trans.logistics.lms.rating.dto.TariffRateCarrierResponse;
import com.unisys.trans.logistics.lms.rating.dto.TariffRateDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.TariffRateFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.TariffRatePersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.TariffRateResponse;

/**
 * <code>TariffRateService</code> handles the TariffRate
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>Create a TariffRate.
 * <li>Delete a TariffRate.
 * <li>Find a TariffRate.
 * <li>Update a TariffRate.
 * <li>Find Carriers With TariffRate
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.TariffRateDeleteRequest
 *      TariffRateDeleteRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.TariffRateFindRequest
 *      TariffRateFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.TariffRatePersistRequest
 *      TariffRatePersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.TariffRateCarrierRequest
 *      TariffRateCarrierRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.TariffRateResponse
 *      TariffRateResponse
 * @see com.unisys.trans.logistics.lms.rating.dto.TariffRateCarrierResponse
 *      TariffRateCarrierResponse
 */
public interface TariffRateService {

    /**
     * Creates the TariffRates for Origin, Destination and Carrier.
     * <p>
     * The system validates the input provided by the user. Finds if Tariff Rates already exists for given
     * Origin, Destination and Carrier. If rates does not exist each Tariff Rate is validated for Rating
     * validations. Creates the TariffRates for Origin and Destination. The origin and Destination Type can be
     * City,Airport,Country,Country-Aggregate. Origin and Destination distance is calculated if Origin and
     * Destination are City or Airport.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.TariffRateService#updateTariffRate
     * updateTariffRate}<br>
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#TARIFF_RATE_ALREADY_EXIST_ORIGIN_DESTINATION 
     * TARIFF_RATE_ALREADY_EXIST_ORIGIN_DESTINATION}</code></td>
     * <td align="left">TariffRate already exist for origin and destination.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_SOURCE_DOES_NOT_EXISTS RATE_SOURCE_DOES_NOT_EXISTS}</code></td>
     * <td align="left">The input Rate Source does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_SOURCE_MARKED_FOR_DELETION RATE_SOURCE_MARKED_FOR_DELETION}</code></td>
     * <td align="left">Rate Source is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants
     * .MessageConstants#RATE_SOURCE_NOT_BELONGS_TO_CARRIER RATE_SOURCE_NOT_BELONGS_TO_CARRIER}</code></td>
     * <td align="left">The Rate Source does not belong to the Carrier.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CURRENCY_CODE_NOT_MATCH_WITH_CURRENCY_OF_ORIGIN_
     * COUNTRY CURRENCY_CODE_NOT_MATCH_WITH_CURRENCY_OF_ORIGIN_COUNTRY}</code></td>
     * <td align="left">The Currency does not match with Currency of Origin Country.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CURRENCY_MUST_HAVE_ROUNDING_FACTOR_AND_DECIMAL
     *  CURRENCY_MUST_HAVE_ROUNDING_FACTOR_AND_DECIMAL}</code></td>
     * <td align="left">The Currency must have Rounding Factor and Decimal Positions.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_TYPE_DOES_NOT_EXIST RATE_TYPE_DOES_NOT_EXIST}</code></td>
     * <td align="left">The Rate Type does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_TYPE_MARKED_FOE_DELETION RATE_TYPE_MARKED_FOE_DELETION}</code></td>
     * <td align="left">The Rate Type is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_TYPE_NOT_ALLOWED_FOR_RATE_SOURCE RATE_TYPE_NOT_ALLOWED_FOR_RATE_SOURCE}</code></td>
     * <td align="left">The Rate Type is not allowed for Rate Source.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_TARIFF_RATE RATE_CLASS_NOT_ALLOWED_FOR_TARIFF_RATE}</code></td>
     * <td align="left">The Rate Class is not allowed for Tariff Rate.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_IATA_RATE_TYPE RATE_CLASS_NOT_ALLOWED_FOR_IATA_RATE_TYPE}</code>
     * </td>
     * <td align="left">The Rate Class is not allowed for IATA rate type.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants
     * .MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_ATPCO_RATE_TYPE RATE_CLASS_NOT_ALLOWED_FOR_ATPCO_RATE_TYPE}</code>
     * </td>
     * <td align="left">The Rate Class is not allowed for ATPCO rate type.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#ULD_CHARGE_CODE_MANDATORY_FOR_RATE_CLASS_U_AND_E
     *  ULD_CHARGE_CODE_MANDATORY_FOR_RATE_CLASS_U_AND_E}</code></td>
     * <td align="left">The ULD Charge Code is mandatory for Rate Class 'U' and 'E'.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_CLASS_E_NOT_ALLOWED_FOR_ATPCO_RATE_SOURCE
     *  RATE_CLASS_E_NOT_ALLOWED_FOR_ATPCO_RATE_SOURCE}</code></td>
     * <td align="left">RateClass E is not allowed if Rate Source has ATPCO Rating Convention.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#COMMODITY_CODE_DOES_NOT_EXIST COMMODITY_CODE_DOES_NOT_EXIST}</code></td>
     * <td align="left">The input Commodity Number does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#COMMODITY_MARKED_FOR_DELETION COMMODITY_MARKED_FOR_DELETION}</code></td>
     * <td align="left">The commodity is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#ULD_TYPE_DOES_NOT_EXIST ULD_TYPE_DOES_NOT_EXIST}</code></td>
     * <td align="left">The ULD Type does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#ULD_TYPE_MARKED_DELETION ULD_TYPE_MARKED_DELETION}</code></td>
     * <td align="left">The ULD Type is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#ULD_CHARGE_CODE_NOT_ALLOWED_FOR_ATPCO ULD_CHARGE_CODE_NOT_ALLOWED_FOR_ATPCO}</code></td>
     * <td align="left">The ULD Charge Code is not allowed for ATPCO rate source.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_CLASS_NOT_FOR_ULD_CHARGE_CODE RATE_CLASS_NOT_FOR_ULD_CHARGE_CODE}</code></td>
     * <td align="left">The ULD Charge Code is not allowed for the input Rate Class.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#FRACTIONAL_WEIGHT_ONLY_FOR_N_RATECLASS FRACTIONAL_WEIGHT_ONLY_FOR_N_RATECLASS}</code></td>
     * <td align="left">The decimal position in Minimum weight is allowed only for Rate Class 'N'.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#MINIMUM_WEIGHT_GREATER_THAN_MAXIMUM_CHARGEABLE_
     * WEIGHT MINIMUM_WEIGHT_GREATER_THAN_MAXIMUM_CHARGEABLE_WEIGHT}</code></td>
     * <td align="left">The Minimum Weight is greater than Maximum Chargeable Weight Allowed of Rate Type.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#MINIMUM_WEIGHT_GREATER_THAN_MAXIMUM_GROSS_
     * WEIGHT MINIMUM_WEIGHT_GREATER_THAN_MAXIMUM_GROSS_WEIGHT}</code></td>
     * <td align="left">The Minimum Weight is greater than Maximum Gross Weight Allowed of Rate Type.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#MINIMUM_WEIGHT_ZERO_FOR_RATE_CLASS_B_AND_M MINIMUM_WEIGHT_ZERO_FOR_RATE_CLASS_B_AND_M}</code>
     * </td>
     * <td align="left">The Minimum Weight must be 0 for Rate Class 'B' and 'M'.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#MINIMUM_WEIGHT_GREATER_THAN_ZERO_FOR_RATE_C
     * LASS_K MINIMUM_WEIGHT_GREATER_THAN_ZERO_FOR_RATE_CLASS_K}</code></td>
     * <td align="left">The Minimum Weight must be greater than 0 for Rate Class 'K' with IATA Rating
     * Convention.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#MINIMUM_WEIGHT_GREATER_THAN_ONE_FOR_RATE_CLASS
     * _Q MINIMUM_WEIGHT_GREATER_THAN_ONE_FOR_RATE_CLASS_Q}</code></td>
     * <td align="left">The Minimum Weight must be greater than 1 for Rate Class 'Q'.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#MINIMUMWEIGHT_0_TO_1_FOR_RATECLASS_N_BULKOVERPIVOT 
     * MINIMUMWEIGHT_0_TO_1_FOR_RATECLASS_N_BULKOVERPIVOT}</code></td>
     * <td align="left">RateClass E is not allowed if Rate Source has ATPCO Rating Convention.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#MINIMUMWEIGHT_1_FOR_RATECLASS_N_STANDARD_RATEPERPIECE
     *  MINIMUMWEIGHT_1_FOR_RATECLASS_N_STANDARD_RATEPERPIECE}</code></td>
     * <td align="left">The Minimum Weight must be 1 for "Standard" and "Rate per Piece" Rate Types with "N"
     * Rate Class.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#PIVOT_WEIGHT_ALLOWED_ONLY_FOR_ATPCO_ULD_RATES 
     * PIVOT_WEIGHT_ALLOWED_ONLY_FOR_ATPCO_ULD_RATES}</code></td>
     * <td align="left">The Pivot Weight is allowed only for ATPCO ULD rates.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#OVER_PIVOT_RATE_ALLOWED_ONLY_FOR_ATPCO_ULD_RATES 
     * OVER_PIVOT_RATE_ALLOWED_ONLY_FOR_ATPCO_ULD_RATES}</code></td>
     * <td align="left">The Over Pivot Rate is allowed only for ATPCO ULD rates.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#OVER_PIVOT_RATE_NOT_ALLOWED_FOR_BULK_OVER_PIVOT 
     * OVER_PIVOT_RATE_NOT_ALLOWED_FOR_BULK_OVER_PIVOT}</code></td>
     * <td align="left">The Over Pivot Rate is not allowed for Bulk Over Pivot Rate Types if the Rate Class is
     * not 'Q' or 'C'.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#OVER_PIVOT_RATE_NOT_ALLOWED_FOR_STANDARD OVER_
     * PIVOT_RATE_NOT_ALLOWED_FOR_STANDARD}</code></td>
     * <td align="left">The Over Pivot Rate is not allowed for Standard and Rate Per Piece Rate Types if the
     * Rate Class is not 'U'</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#EFFECTIVE_DATE_MUST_BE_GREATER_OR_EQUAL_TO_CURR_
     * SYS_DATE EFFECTIVE_DATE_MUST_BE_GREATER_OR_EQUAL_TO_CURR_SYS_DATE}</code></td>
     * <td align="left">The Effective Date must be greater than or equal to the current system date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#EFFECTIVE_DATE_MUST_BE_GREATER_THAN_CURR_SYS_DATE 
     * EFFECTIVE_DATE_MUST_BE_GREATER_THAN_CURR_SYS_DATE}</code></td>
     * <td align="left">The Effective Date must be greater than the current system date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_CLASS_NOT_FOR_ULD_CHARGE_CODE RATE_CLASS_NOT_FOR_ULD_CHARGE_CODE}</code></td>
     * <td align="left">The ULD Charge Code is not allowed for the input Rate Class.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_TARIFF_RATE RATE_CLASS_NOT_ALLOWED_FOR_TARIFF_RATE}</code></td>
     * <td align="left">The Rate Class is not allowed for Tariff Rate.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_
     * EFFECTIVE_DATE EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE}</code></td>
     * <td align="left">The Expiration Date must be equal or greater than Effective Date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATING_NOTE_NOT_EXISTS RATING_NOTE_NOT_EXISTS}</code></td>
     * <td align="left">The input {0} Rating Note does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATING_NOTE_MARKED_DELETION RATING_NOTE_MARKED_DELETION}</code></td>
     * <td align="left">The rating note is marked for deletion.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pTariffRatePersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRatePersistRequest
     *            TariffRatePersistRequest}</code><br>
     *            includes the attributes to create a <code>TariffRate </code>.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. TariffRateOriginAndDestinationDto
     *            TariffRateOriginAndDestinationDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. TariffRateOriginAndDestinationDto#setCarrierCode
     *            CarrierCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. TariffRateOriginAndDestinationDto#setOrigin
     *            Origin} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. TariffRateOriginAndDestinationDto#setDestination
     *            Destination} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. TariffRateOriginAndDestinationDto#setTariffRateDtos
     *            TariffRateDtos} - (1:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setAmount
     *            Amount} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setCommodityNumber
     *            CommodityNumber} - (C) Mandatory if Rate Type is SCR </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setCurrencyCode
     *            CurrencyCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setDateRangeDto
     *            DateRangeDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setEffectiveDate
     *            EffectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setExpirationDate
     *            ExpirationDate} - (O)</code>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setFlightNumber
     *            FlightNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setMinimumWeight
     *            MinimumWeight} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setOverPivotRate
     *            OverPivotRate} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. TariffRateDto#setPendingGovernmentAppInd
     *            PendingGovernmentAppInd} - (O) Default value is False</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setPivotWeight
     *            PivotWeight} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setRateClassCode
     *            RateClassCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setRateConstructionInd
     *            RateConstructionInd} - (M) Default value is False</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setRateSourceCode
     *            RateSourceCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setRateTypeCode
     *            RateTypeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setRateValidityTimeDtos
     *            RateValidityTimeDtos} - (O) (0:7)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setRatingNoteCode
     *            RatingNoteCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setUldChargeCode
     *            UldChargeCode} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setUldType
     *            UldType} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setWeightUnit
     *            WeightUnit} - (M) Default value is LB</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C) Prohibited for create operation.</code></br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateResponse
     *         TariffRateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants. MessageConstants#TARIFF_RATE_CREATED_SUCCESSFULLY
     *         TARIFF_RATE_CREATED_SUCCESSFULLY} </code> <br>
     *         <code>for successful create.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateResponse#getTariffRateDto()
     *         TariffRateDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto
     *         TariffRateDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */

    TariffRateResponse createTariffRate(
                TariffRatePersistRequest pTariffRatePersistRequest)
                throws LMSException;

    /**
     * Deletes the TariffRate.
     * <p>
     * This functions deletes the TariffRate for origin and destination pair.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.TariffRateService#findTariffRate
     * findTariffRate}<br>
     * <p>
     * To delete the TariffRate user must provide following input:<br>
     * <li>OId.<br>
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#TARIFF_RATE_DOES_NOT_EXIST_ORIGIN_DESTINATION 
     * TARIFF_RATE_DOES_NOT_EXIST_ORIGIN_DESTINATION}</code></td>
     * <td align="left">TariffRate does not exists.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#TARIFF_RATE_EFFECTIVE_CANT_BE_DELETED TARIFF_RATE_EFFECTIVE_CANT_BE_DELETED}</code></td>
     * <td align="left">TariffRate cannot be deleted.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pTariffRateDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDeleteRequest
     *            TariffRateDeleteRequest}</code><br>
     *            includes the attributes to find a <code>TariffRate </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto
     *            TariffRate} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setOId
     *            OId}</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateResponse
     *         TariffRateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants. MessageConstants#TARIFF_RATE_DELETED_SUCCESSFULLY
     *         TARIFF_RATE_DELETED_SUCCESSFULLY} </code> <br>
     *         <code>for successful delete.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateResponse#getTariffRateDto()
     *         TariffRateDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto
     *         TariffRateDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    TariffRateResponse deleteTariffRate(
                TariffRateDeleteRequest pTariffRateDeleteRequest)
                throws LMSException;

    /**
     * Finds carriersWithTariffRate based on the origin code and Destination
     * code.
     * <p>
     * This method returns a TariffRate. The returned TariffRateFindDto will contain:
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.TariffRateService#findTariffRate
     * findTariffRate}<br>
     * <p>
     * To find the TariffRate user must provide following input:<br>
     * <li>OriginCode.<br>
     * <li>OriginType.<br>
     * <li>DestinationCode. <br>
     * <li>DestinationType.<br>
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
     * @param pTariffRateCarrierRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateCarrierRequest
     *            TariffRateCarrierRequest}</code><br>
     *            includes the attributes to find a <code>TariffRate </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateFindDto
     *            TariffRate} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateFindDto#setOriginCode
     *            OriginCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateFindDto#setOriginType
     *            OriginType} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateFindDto#setDestinationType
     *            DestinationType} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateFindDto#setDestinationCode
     *            DestinationCode} - (M)</code> Prohibited for create operation. <li> <code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateCarrierResponse
     *         TariffRateCarrierResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateCarrierResponse#getCarrierDto()
     *         TariffRateDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateFindDto
     *         TariffRateFindDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */

    TariffRateCarrierResponse findCarriersWithTariffRate(
                TariffRateCarrierRequest pTariffRateCarrierRequest)
                throws LMSException;

    /**
     * Finds Tariff Rates for an Origin and Destination.
     * <p>
     * The System validates input provided by user. The origin and Destination Type can be
     * city,airport,country or Country-aggregate. Origin and Destination distance is calculated if Origin and
     * destination are City or Airport.It finds the TariffRates for the Origin, Destination, Carrier and
     * filters Tariff Rates if Filters are entered.
     * </p>
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_SOURCE_DOES_NOT_EXISTS RATE_SOURCE_DOES_NOT_EXISTS}</code></td>
     * <td align="left">RateSource does not exists.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_TYPE_DOES_NOT_EXIST RATE_TYPE_DOES_NOT_EXIST}</code></td>
     * <td align="left">RateType does not exists.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#NO_RATES_FOUND_FOR_ORIGIN_AND_DESTINATION NO_R
     * ATES_FOUND_FOR_ORIGIN_AND_DESTINATION}</code></td>
     * <td align="left">No rates found for origin and destination.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#AGGREGATE_DOES_NOT_EXIST AGGREGATE_DOES_NOT_EXIST}</code></td>
     * <td align="left">Aggregate does not exist.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.M
     * essageConstants#COUNTRY_CODE_DOES_NOT_EXIST COUNTRY_CODE_DOES_NOT_EXIST}</code></td>
     * <td align="left">CountryCode does not exist.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CITY_CODE_DOES_NOT_EXIST CITY_CODE_DOES_NOT_EXIST}</code></td>
     * <td align="left">City does not exist.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pTariffRateFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateFindRequest
     *            TariffRateFindRequest}</code><br>
     *            includes the attributes to find a <code>TariffRate </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateFindDto
     *            TariffRateFindDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateFindDto#setCarrierCode
     *            CarrierCode} - (M)</code><li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateFindDto#setCurrencyCode
     *            CurrencyCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateFindDto#setDestinationCode
     *            DestinationCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateFindDto#setDestinationType
     *            DestinationType} - (O)</code><li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateFindDto#setOriginCode
     *            OriginCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateFindDto#setOriginType
     *            OriginType} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateFindDto#setRateSourceCode
     *            RateSourceCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateFindDto#setRateTypeCode
     *            RateTypeCode} - (O)</code> <br>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateResponse
     *         TariffRateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto. TariffRateResponse#getTariffRateOriginAndDestinationDto()
     *         TariffRateOriginAndDestinationDto}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto
     *         TariffRateDto} - (1:*)</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */

    TariffRateResponse findTariffRate(
                TariffRateFindRequest pTariffRateFindRequest) throws LMSException;

    /**
     * Updates the TariffRates for Origin, Destination and Carrier.
     * <p>
     * The system validates the input provided by the user. Finds if Tariff Rates already exists for given
     * Origin, Destination and Carrier. If rates exists each new, updated, deleted Tariff Rate is validated
     * for Rating validations. Updates the TariffRates for Origin and Destination. The origin and Destination
     * Type can be City,Airport,Country,Country-Aggregate. Origin and Destination distance is calculated if
     * Origin and Destination are City or Airport.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.TariffRateService#createTariffRate
     * createTariffRate}<br>
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#NO_RATES_FOUND_FOR_ORIGIN_AND_DESTINATION 
     * NO_RATES_FOUND_FOR_ORIGIN_AND_DESTINATION}</code></td>
     * <td align="left">No TariffRates found for origin and destination.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#ORIGIN_AND_DEST_ARE_SAME ORIGIN_AND_DEST_ARE_SAME}</code></td>
     * <td align="left">Origin and destination are same.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_SOURCE_DOES_NOT_EXISTS RATE_SOURCE_DOES_NOT_EXISTS}</code></td>
     * <td align="left">The input Rate Source does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_SOURCE_MARKED_FOR_DELETION RATE_SOURCE_MARKED_FOR_DELETION}</code></td>
     * <td align="left">Rate Source is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants
     * .MessageConstants#RATE_SOURCE_NOT_BELONGS_TO_CARRIER RATE_SOURCE_NOT_BELONGS_TO_CARRIER}</code></td>
     * <td align="left">The Rate Source does not belong to the Carrier.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CURRENCY_CODE_NOT_MATCH_WITH_CURRENCY_OF_ORIGIN_
     * COUNTRY CURRENCY_CODE_NOT_MATCH_WITH_CURRENCY_OF_ORIGIN_COUNTRY}</code></td>
     * <td align="left">The Currency does not match with Currency of Origin Country.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CURRENCY_MUST_HAVE_ROUNDING_FACTOR_AND_DECIMAL
     *  CURRENCY_MUST_HAVE_ROUNDING_FACTOR_AND_DECIMAL}</code></td>
     * <td align="left">The Currency must have Rounding Factor and Decimal Positions.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_TYPE_DOES_NOT_EXIST RATE_TYPE_DOES_NOT_EXIST}</code></td>
     * <td align="left">The Rate Type does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_TYPE_MARKED_FOE_DELETION RATE_TYPE_MARKED_FOE_DELETION}</code></td>
     * <td align="left">The Rate Type is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_TYPE_NOT_ALLOWED_FOR_RATE_SOURCE RATE_TYPE_NOT_ALLOWED_FOR_RATE_SOURCE}</code></td>
     * <td align="left">The Rate Type is not allowed for Rate Source.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_TARIFF_RATE RATE_CLASS_NOT_ALLOWED_FOR_TARIFF_RATE}</code></td>
     * <td align="left">The Rate Class is not allowed for Tariff Rate.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_IATA_RATE_TYPE RATE_CLASS_NOT_ALLOWED_FOR_IATA_RATE_TYPE}</code>
     * </td>
     * <td align="left">The Rate Class is not allowed for IATA rate type.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants
     * .MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_ATPCO_RATE_TYPE RATE_CLASS_NOT_ALLOWED_FOR_ATPCO_RATE_TYPE}</code>
     * </td>
     * <td align="left">The Rate Class is not allowed for ATPCO rate type.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#ULD_CHARGE_CODE_MANDATORY_FOR_RATE_CLASS_U_AND_E
     *  ULD_CHARGE_CODE_MANDATORY_FOR_RATE_CLASS_U_AND_E}</code></td>
     * <td align="left">The ULD Charge Code is mandatory for Rate Class 'U' and 'E'.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_CLASS_E_NOT_ALLOWED_FOR_ATPCO_RATE_SOURCE
     *  RATE_CLASS_E_NOT_ALLOWED_FOR_ATPCO_RATE_SOURCE}</code></td>
     * <td align="left">RateClass E is not allowed if Rate Source has ATPCO Rating Convention.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#COMMODITY_CODE_DOES_NOT_EXIST COMMODITY_CODE_DOES_NOT_EXIST}</code></td>
     * <td align="left">The input Commodity Number does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#COMMODITY_MARKED_FOR_DELETION COMMODITY_MARKED_FOR_DELETION}</code></td>
     * <td align="left">The commodity is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#ULD_TYPE_DOES_NOT_EXIST ULD_TYPE_DOES_NOT_EXIST}</code></td>
     * <td align="left">The ULD Type does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#ULD_TYPE_MARKED_DELETION ULD_TYPE_MARKED_DELETION}</code></td>
     * <td align="left">The ULD Type is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#ULD_CHARGE_CODE_NOT_ALLOWED_FOR_ATPCO ULD_CHARGE_CODE_NOT_ALLOWED_FOR_ATPCO}</code></td>
     * <td align="left">The ULD Charge Code is not allowed for ATPCO rate source.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_CLASS_NOT_FOR_ULD_CHARGE_CODE RATE_CLASS_NOT_FOR_ULD_CHARGE_CODE}</code></td>
     * <td align="left">The ULD Charge Code is not allowed for the input Rate Class.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#FRACTIONAL_WEIGHT_ONLY_FOR_N_RATECLASS FRACTIONAL_WEIGHT_ONLY_FOR_N_RATECLASS}</code></td>
     * <td align="left">The decimal position in Minimum weight is allowed only for Rate Class 'N'.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#MINIMUM_WEIGHT_GREATER_THAN_MAXIMUM_CHARGEABLE_
     * WEIGHT MINIMUM_WEIGHT_GREATER_THAN_MAXIMUM_CHARGEABLE_WEIGHT}</code></td>
     * <td align="left">The Minimum Weight is greater than Maximum Chargeable Weight Allowed of Rate Type.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#MINIMUM_WEIGHT_GREATER_THAN_MAXIMUM_GROSS_
     * WEIGHT MINIMUM_WEIGHT_GREATER_THAN_MAXIMUM_GROSS_WEIGHT}</code></td>
     * <td align="left">The Minimum Weight is greater than Maximum Gross Weight Allowed of Rate Type.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#MINIMUM_WEIGHT_ZERO_FOR_RATE_CLASS_B_AND_M MINIMUM_WEIGHT_ZERO_FOR_RATE_CLASS_B_AND_M}</code>
     * </td>
     * <td align="left">The Minimum Weight must be 0 for Rate Class 'B' and 'M'.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#MINIMUM_WEIGHT_GREATER_THAN_ZERO_FOR_RATE_C
     * LASS_K MINIMUM_WEIGHT_GREATER_THAN_ZERO_FOR_RATE_CLASS_K}</code></td>
     * <td align="left">The Minimum Weight must be greater than 0 for Rate Class 'K' with IATA Rating
     * Convention.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#MINIMUM_WEIGHT_GREATER_THAN_ONE_FOR_RATE_CLASS
     * _Q MINIMUM_WEIGHT_GREATER_THAN_ONE_FOR_RATE_CLASS_Q}</code></td>
     * <td align="left">The Minimum Weight must be greater than 1 for Rate Class 'Q'.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#MINIMUMWEIGHT_0_TO_1_FOR_RATECLASS_N_BULKOVERPIVOT 
     * MINIMUMWEIGHT_0_TO_1_FOR_RATECLASS_N_BULKOVERPIVOT}</code></td>
     * <td align="left">RateClass E is not allowed if Rate Source has ATPCO Rating Convention.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#MINIMUMWEIGHT_1_FOR_RATECLASS_N_STANDARD_RATEPERPIECE
     *  MINIMUMWEIGHT_1_FOR_RATECLASS_N_STANDARD_RATEPERPIECE}</code></td>
     * <td align="left">The Minimum Weight must be 1 for "Standard" and "Rate per Piece" Rate Types with "N"
     * Rate Class.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#PIVOT_WEIGHT_ALLOWED_ONLY_FOR_ATPCO_ULD_RATES 
     * PIVOT_WEIGHT_ALLOWED_ONLY_FOR_ATPCO_ULD_RATES}</code></td>
     * <td align="left">The Pivot Weight is allowed only for ATPCO ULD rates.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#OVER_PIVOT_RATE_ALLOWED_ONLY_FOR_ATPCO_ULD_RATES 
     * OVER_PIVOT_RATE_ALLOWED_ONLY_FOR_ATPCO_ULD_RATES}</code></td>
     * <td align="left">The Over Pivot Rate is allowed only for ATPCO ULD rates.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#OVER_PIVOT_RATE_NOT_ALLOWED_FOR_BULK_OVER_PIVOT 
     * OVER_PIVOT_RATE_NOT_ALLOWED_FOR_BULK_OVER_PIVOT}</code></td>
     * <td align="left">The Over Pivot Rate is not allowed for Bulk Over Pivot Rate Types if the Rate Class is
     * not 'Q' or 'C'.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#OVER_PIVOT_RATE_NOT_ALLOWED_FOR_STANDARD OVER_
     * PIVOT_RATE_NOT_ALLOWED_FOR_STANDARD}</code></td>
     * <td align="left">The Over Pivot Rate is not allowed for Standard and Rate Per Piece Rate Types if the
     * Rate Class is not 'U'</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#EFFECTIVE_DATE_MUST_BE_GREATER_OR_EQUAL_TO_CURR_
     * SYS_DATE EFFECTIVE_DATE_MUST_BE_GREATER_OR_EQUAL_TO_CURR_SYS_DATE}</code></td>
     * <td align="left">The Effective Date must be greater than or equal to the current system date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#EFFECTIVE_DATE_MUST_BE_GREATER_THAN_CURR_SYS_DATE 
     * EFFECTIVE_DATE_MUST_BE_GREATER_THAN_CURR_SYS_DATE}</code></td>
     * <td align="left">The Effective Date must be greater than the current system date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_CLASS_NOT_FOR_ULD_CHARGE_CODE RATE_CLASS_NOT_FOR_ULD_CHARGE_CODE}</code></td>
     * <td align="left">The ULD Charge Code is not allowed for the input Rate Class.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_TARIFF_RATE RATE_CLASS_NOT_ALLOWED_FOR_TARIFF_RATE}</code></td>
     * <td align="left">The Rate Class is not allowed for Tariff Rate.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_
     * EFFECTIVE_DATE EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE}</code></td>
     * <td align="left">The Expiration Date must be equal or greater than Effective Date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATING_NOTE_NOT_EXISTS RATING_NOTE_NOT_EXISTS}</code></td>
     * <td align="left">The input {0} Rating Note does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATING_NOTE_MARKED_DELETION RATING_NOTE_MARKED_DELETION}</code></td>
     * <td align="left">The rating note is marked for deletion.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pTariffRatePersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRatePersistRequest
     *            TariffRatePersistRequest}</code><br>
     *            includes the attributes to create a <code>TariffRate </code>.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. TariffRateOriginAndDestinationDto
     *            TariffRateOriginAndDestinationDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. TariffRateOriginAndDestinationDto#setCarrierCode
     *            CarrierCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. TariffRateOriginAndDestinationDto#setOrigin
     *            Origin} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. TariffRateOriginAndDestinationDto#setDestination
     *            Destination} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. TariffRateOriginAndDestinationDto#setTariffRateDtos
     *            TariffRateDtos} - (1:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setAmount
     *            Amount} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setCommodityNumber
     *            CommodityNumber} - (C) Mandatory if Rate Type is SCR </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setCurrencyCode
     *            CurrencyCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setDateRangeDto
     *            DateRangeDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setEffectiveDate
     *            EffectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setExpirationDate
     *            ExpirationDate} - (O)</code>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setFlightNumber
     *            FlightNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setMinimumWeight
     *            MinimumWeight} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setOverPivotRate
     *            OverPivotRate} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. TariffRateDto#setPendingGovernmentAppInd
     *            PendingGovernmentAppInd} - (O) Default value is False</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setPivotWeight
     *            PivotWeight} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setRateClassCode
     *            RateClassCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setRateConstructionInd
     *            RateConstructionInd} - (M) Default value is False</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setRateSourceCode
     *            RateSourceCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setRateTypeCode
     *            RateTypeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setRateValidityTimeDtos
     *            RateValidityTimeDtos} - (O) (0:7)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setRatingNoteCode
     *            RatingNoteCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setUldChargeCode
     *            UldChargeCode} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setUldType
     *            UldType} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto#setWeightUnit
     *            WeightUnit} - (M) Default value is LB</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C) Prohibited for create operation.</code></br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateResponse
     *         TariffRateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants. MessageConstants#TARIFF_RATE_CREATED_SUCCESSFULLY
     *         TARIFF_RATE_CREATED_SUCCESSFULLY} </code> <br>
     *         <code>for successful create.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateResponse#getTariffRateDto()
     *         TariffRateDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto
     *         TariffRateDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */

    TariffRateResponse updateTariffRate(
                TariffRatePersistRequest pTariffRatePersistRequest)
                throws LMSException;

    /**
     * Finds the Tariif Rate's.
     * <p>
     * This method retrieves list of TariffRates.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.TariffRateService#findTariffRate
     * findTariffRate}<br>
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#TARIFF_RATE_DOES_NOT_EXIST_ORIGIN_DESTINATION_FILTER}</code></td>
     * <td align="left">The Tariff Rate does not exist in the system.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pExtractRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.ExtractRequest
     *            ExtractRequest}</code><br>
     *            includes the attributes to find a <code>TariffRate </code>.
     *            <ul>
     *            <li><code> extractOrigin - (O)</code> </li> <li><code> extractDestination - (O)</code> </li>
     *            <li><code> extractFormatType - (O)</code> </li> <li><code>updateDate - (O)</code> </li> <li>
     *            <code> rateSourceCode - (O)</code> </li> <li><code>rateTypeCode - (O)</code> </li> <li>
     *            <code> currency - (O)</code> </li> <li><code>carrierCode - (O)</code> </li> <li><code>
     *            ratingConventionType - (O)</code> </li> <li><code> updateDateEmpty - (O)</code> </li> <li>
     *            <code> allExtractOriginIndicator - (O)</code> </li> <li><code>
     *            allExtractDestinationIndicator - (O)</code> </li> <li><code> biDirectionalIndicator - (O)
     *            </code> </li> <li><code> effectiveDate - (O)</code> </li> <li><code> pendingGovApprovalInd -
     *            (O)</code> </li>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ExtractResponse
     *         ExtractResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage </li> <li> <code>list of TariffRate's </code></li>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    ExtractResponse findTariffRates(ExtractRequest pExtractRequest)
                throws LMSException;
}
