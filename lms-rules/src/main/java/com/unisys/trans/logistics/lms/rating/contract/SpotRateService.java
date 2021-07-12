/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.dto.ExtractRequest;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantAccNumValidatorResponse;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.ExtractResponse;
import com.unisys.trans.logistics.lms.rating.dto.SpotRateDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.SpotRateListRequest;
import com.unisys.trans.logistics.lms.rating.dto.SpotRatePersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.SpotRateQueueItemsUpdateRequest;
import com.unisys.trans.logistics.lms.rating.dto.SpotRateQueueRequest;
import com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse;

/**
 * <code>SpotRateService</code> handles the SpotRate
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>createSpotRateVersion - Creates the Spot Rate Version information.
 * <li>deleteSpotRateVersion - Deletes the Spot Rate Version information.
 * <li>findSpotRate - Retrieves Spot Rate Information.
 * <li>findSpotRateListByNoParticipantAccountNumber - List all the Spot Rates. with No Participant Account
 * Number
 * <li>findSpotRateByParticipant - Retrieves Spot Rate List information by Participant Account Number.
 * <li>findSpotRateListForQueue - Find Spot Rate List for Queue.
 * <li>queueItemforReRating - Queue the Item for Re-Rating.
 * <li>updateQueueSpotRate - Queue Spot Rates for authorization.
 * <li>updateSpotRateVersion - Update Spot Rate Version information.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.SpotRatePersistRequest
 *      SpotRatePersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.SpotRateDeleteRequest
 *      SpotRateDeleteRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest
 *      SpotRateFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.SpotRateQueueRequest
 *      SpotRateQueueRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse
 *      SpotRateResponse
 * @see com.unisys.trans.logistics.lms.rating.dto.SpotRateListRequest
 *      SpotRateListRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.SpotRateQueueItemsUpdateRequest
 *      SpotRateQueueItemsUpdateRequest
 */

public interface SpotRateService {

    /**
     * Creates the <code>SpotRateVersion</code>.
     * <p>
     * A Spot Rate is only applicable to one participant for a single airway bill. If the input spot Rate
     * number does not have a value the system sets the input spot rate number to the current system date and
     * time in the format ddmmyyhhmmss.If five attempts to generate Spot Rate number fails, it throws Unable
     * to generate Spot Rate number. The rest of the input details are validated and the Spot Rate is
     * created.It checks for the User authority.If the authority function is not true,the created spot Rate is
     * sent to Queue for authorization.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_DAYS_FOR_SPOTRATE_EXPIRATION}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOW_INDEFINITE_EXPIRATION_DATE_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#SECURITY_DEFAULT_VALUE_FOR_ORIGIN}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#SYSTEM_PARAMETER_MODULE_NAME}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#FLIGHT_NUMBER_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#AIRWAYBILL_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#REVENUE_MANAGEMENT_INTERFACE}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#SPOTRATE_DEFAULT_EFFECTIVE_DATE_FROM_TODAY}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#SPECIAL_INSTRUCTIONS_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#SECURITY_FOR_CONTRACTS_AND_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#RATETYPE_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#RATESOURCE_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#RATECLASS_PROHIBITED_FOR_COMMODITY_CODE_P}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#PRODUCT_CODE_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#FLIGHT_DATE_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_PAYCODE_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_RATESOURCE}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#COMMODITY_CODE_FOR_SPOTRATES}
     * 
     * </pre>
     * <p>
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.SpotRateService#updateSpotRateVersion
     * updateSpotRateVersion}<br>
     * <p>
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
     * MessageConstants#SPOT_RATE_ALREADY_EXIST 
     * SPOT_RATE_ALREADY_EXIST}</code></td>
     * <td align="left">Spot Rate already exists.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_EXPIRATION_DATE_NOT_PRECEDE_SYSDATE 
     * SPOT_RATE_EXPIRATION_DATE_NOT_PRECEDE_SYSDATE}</code></td>
     * <td align="left">Expiration date must not precede system date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants
     * .MessageConstants#CONTRACT_PARTICIPANT_ACCOUNTNO_DOES_NOT_EXIST 
     * CONTRACT_PARTICIPANT_ACCOUNTNO_DOES_NOT_EXIST}</code></td>
     * <td align="left">The Participant Account Number does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_PARTICIPANT_MARKED_FOR_DELETE 
     * SPOT_RATE_PARTICIPANT_MARKED_FOR_DELETE}</code></td>
     * <td align="left">The participant is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#UNABLE_TO_GENERATE_SPOT_RATE_NUMBER_TRY_LATER 
     * UNABLE_TO_GENERATE_SPOT_RATE_NUMBER_TRY_LATER}</code></td>
     * <td align="left">Unable to generate Spot Rate Number, please try again.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_NON_MINIMUM_RATE_NOT_PRESENT 
     * SPOT_RATE_NON_MINIMUM_RATE_NOT_PRESENT}</code></td>
     * <td align="left">Spot Rate should have atleast one non-minimum entry.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_EXPIRATION_DATE_REQUIRED 
     * CONTRACT_EXPIRATION_DATE_REQUIRED}</code></td>
     * <td align="left">The Expiration Date is required.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE 
     * EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE}</code></td>
     * <td align="left">The Expiration Date must be equal or greater than Effective Date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#DEFER_PART_NOT_ALLOWED_FOR_AUTHORIZED_USER 
     * DEFER_PART_NOT_ALLOWED_FOR_AUTHORIZED_USER}</code></td>
     * <td align="left">The Defer Participant Input is not valid for authorizing user / Participant Account
     * Number is required for authorizing user.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_ENFORCE_HURLDERATE_NOT_ALLOWED_IF_REVENUE_MANAGEMENT 
     * SPOT_RATE_ENFORCE_HURLDERATE_NOT_ALLOWED_IF_REVENUE_MANAGEMENT}</code></td>
     * <td align="left">The Enforce Hurdle Rates is not allowed if Revenue Management Interface dynamic
     * parameter value is N.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_STATION_MUST_BE_CITY_OR_AIRPORT 
     * SPOT_RATE_STATION_MUST_BE_CITY_OR_AIRPORT}</code></td>
     * <td align="left">Spot Rate stations must be airport or city.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#USER_NOT_AUTHORISED_FOR_THE_REQUESTED_SPOT_RATE_INFORMATION 
     * USER_NOT_AUTHORISED_FOR_THE_REQUESTED_SPOT_RATE_INFORMATION}</code></td>
     * <td align="left">The user is not authorized for the requested spot rate information.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_CLASS_INVALID_FOR_FIXED_PERCENT_PRICE 
     * SPOT_RATE_CLASS_INVALID_FOR_FIXED_PERCENT_PRICE}</code></td>
     * <td align="left">The valid Rate Classes are M, N, Q, C, U and K for FIXED (Fixed Rate),PERCENT(Percent
     * Reduction),PRICE(Price Reduction) Spot Rate Definition.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_CLASS_REQ_IF_CONTRACT_DEFINITION_FIXED_OR_FLAT 
     * SPOT_RATE_CLASS_REQ_IF_CONTRACT_DEFINITION_FIXED_OR_FLAT}</code></td>
     * <td align="left">The Rate Class is required if Spot Rate Definition is FIXED (Fixed Rate) or FLAT (Flat
     * Rate).</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_PIVOT_WEIGHT_ALLOWED_ONLY_IF_FIXED_U_RATE_CLASSES 
     * SPOT_RATE_PIVOT_WEIGHT_ALLOWED_ONLY_IF_FIXED_U_RATE_CLASSES}</code></td>
     * <td align="left">The Pivot Weight is allowed only for FIXED (Fixed Rate) Spot Rate Definition with U
     * Rate Class.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_RATE_CLASS_INVALID_FOR_FLAT 
     * SPOT_RATE_RATE_CLASS_INVALID_FOR_FLAT}</code></td>
     * <td align="left">The valid Rate Classes are U for FLAT (Flat Rate) Spot Rate Definition.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_ALL_MINIMUM_WEIGHT_NOT_ALLOWED_FOR_FLAT_AND_FIXED 
     * SPOT_RATE_ALL_MINIMUM_WEIGHT_NOT_ALLOWED_FOR_FLAT_AND_FIXED}</code></td>
     * <td align="left">The All Minimum Weight is not allowed for FIXED (Fixed Rate), FLAT (Flat Rate) Spot
     * Rate Definitions.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_ADJUSTMENT_WEIGHT_REQUIRED_FOR_FLAT_DEFINITION 
     * SPOT_RATE_ADJUSTMENT_WEIGHT_REQUIRED_FOR_FLAT_DEFINITION}</code></td>
     * <td align="left">The Rate Adjustment is required for FLAT (Flat Rate) Spot Rate Definition.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_CLASSRATINGID_NOT_ALLOWED_IF_COMMODITYNUM_OR_ALLCOMIND_YES 
     * CONTRACT_CLASSRATINGID_NOT_ALLOWED_IF_COMMODITYNUM_OR_ALLCOMIND_YES}</code></td>
     * <td align="left">The Class Rating ID is not allowed if Commodity Number is entered or if All Commodity
     * Indicator is set to Yes.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_ULDTYPE_NOT_ALLOWED_IF_CLASSRATINGID_OR_ALLULDTYPEIND_YES 
     * CONTRACT_ULDTYPE_NOT_ALLOWED_IF_CLASSRATINGID_OR_ALLULDTYPEIND_YES}</code></td>
     * <td align="left">The ULD Type is not allowed if All ULD Type Indicator is set to "Yes" or if the Class
     * Rating ID is entered.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_MINIMUM_WEIGHT_NOT_ALLOWED_IF_ALLMINWEIGHT_YES 
     * CONTRACT_MINIMUM_WEIGHT_NOT_ALLOWED_IF_ALLMINWEIGHT_YES}</code></td>
     * <td align="left">The Minimum Weight is not allowed if All Minimum Weight is set to Yes.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_MIN_WEIGHT_NOT_ALLOWED_FOR_NON_PERCENT_PRICE 
     * CONTRACT_MIN_WEIGHT_NOT_ALLOWED_FOR_NON_PERCENT_PRICE}</code></td>
     * <td align="left">All Minimum Weight is allowed only for PERCENTAGE and PRICE.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_MINIMUM_WEIGHT_NOT_ALLOWED_FOR_U_RATE_CLASS 
     * CONTRACT_MINIMUM_WEIGHT_NOT_ALLOWED_FOR_U_RATE_CLASS}</code></td>
     * <td align="left">Minimum weight is prohibited for Price or Percent Reduction lines with Rate Class U.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_MINIMUM_WEIGHT_NOT_ALLOWED_FOR_M_RATE_CLASS 
     * CONTRACT_MINIMUM_WEIGHT_NOT_ALLOWED_FOR_M_RATE_CLASS}</code></td>
     * <td align="left">Minimum weight is prohibited for M rate class.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_ULD_TYPE_MANDATORY_FOR_U_RATE_CLASS 
     * CONTRACT_ULD_TYPE_MANDATORY_FOR_U_RATE_CLASS}</code></td>
     * <td align="left">ULD Type mandatory for Rate Class U.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_MINIMUM_WEIGHT_NOT_ALLOWED_IF_CLASS_RATING_IS_INPUT 
     * CONTRACT_MINIMUM_WEIGHT_NOT_ALLOWED_IF_CLASS_RATING_IS_INPUT}</code></td>
     * <td align="left">Minimum weight is prohibited if Class Rating ID is input.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOTRATE_RATE_ADJUSTMENT_REQUIRED_IF_CLASSRATINGID_AND_FIXED 
     * SPOTRATE_RATE_ADJUSTMENT_REQUIRED_IF_CLASSRATINGID_AND_FIXED}</code></td>
     * <td align="left">The Rate Adjustment is required if Class Rating ID is not entered and Spot Rate
     * Definition is FIXED (Fixed Rate).</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_PIVOT_WEIGHT_ALLOWED_FIXED_U_RATE_CLASSES 
     * SPOT_RATE_PIVOT_WEIGHT_ALLOWED_FIXED_U_RATE_CLASSES}</code></td>
     * <td align="left">The Pivot Weight is allowed only for FIXED (Fixed Rate) Spot Rate Definition with U
     * Rate Class.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CLASS_RATING_ID_PROHIBITED_IF_COMMODITY_NUMBER_EXIST 
     * CLASS_RATING_ID_PROHIBITED_IF_COMMODITY_NUMBER_EXIST}</code></td>
     * <td align="left">The Class Rating ID is not allowed if Commodity Number is entered.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#ULD_TYPE_REQUIRED_FOR_EACH_WEIGHT_UNIT 
     * ULD_TYPE_REQUIRED_FOR_EACH_WEIGHT_UNIT}</code></td>
     * <td align="left">The Weight Unit must be EACH only if ULD Type is entered.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CLASS_RATING_ID_PROHIBITED_IF_FLAT_DEFINITION_TYPE 
     * CLASS_RATING_ID_PROHIBITED_IF_FLAT_DEFINITION_TYPE}</code></td>
     * <td align="left">The Class Rating ID is not allowed for FLAT (Flat Rate) Spot Rate Definition.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#ULDTYPE_ID_PROHIBITED_IF_CLASS_RATING_ID_IS_INPUT 
     * ULDTYPE_ID_PROHIBITED_IF_CLASS_RATING_ID_IS_INPUT}</code></td>
     * <td align="left">The ULD Type is not allowed if the Class Rating ID is entered.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_SOURCE_MANDATORY_FOR_SPOTRATES 
     * RATE_SOURCE_MANDATORY_FOR_SPOTRATES}</code></td>
     * <td align="left">RateSource mandatory if if the value of dynamic parameter Rate Source for Spot Rates
     * is M.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_SOURCE_PROHIBITED_FOR_SPOTRATES 
     * RATE_SOURCE_PROHIBITED_FOR_SPOTRATES}</code></td>
     * <td align="left">RateSource prohibited if the value of dynamic parameter Rate Source for Spot Rates is
     * P.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_TYPE_MANDATORY_FOR_SPOTRATES 
     * RATE_TYPE_MANDATORY_FOR_SPOTRATES}</code></td>
     * <td align="left">RateType mandatory if the value of dynamic parameter Rate Type for Spot Rates is M.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_TYPE_PROHIBITED_FOR_SPOTRATES 
     * RATE_TYPE_PROHIBITED_FOR_SPOTRATES}</code></td>
     * <td align="left">RateType prohibited if the value of dynamic parameter Rate Type for Spot Rates is P.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_CLASS_C_PROHIBITED_FOR_P_COMMODITY_CODE 
     * RATE_CLASS_C_PROHIBITED_FOR_P_COMMODITY_CODE}</code></td>
     * <td align="left">RateClass \u2018C\u2019 is prohibited if the value of the dynamic parameter Commodity
     * Code for Spot Rates is P.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#COMMODITY_NUMBER_MANDATORY_FOR_M_COMMODITY_CODE 
     * COMMODITY_NUMBER_MANDATORY_FOR_M_COMMODITY_CODE}</code></td>
     * <td align="left">Commodity Number mandatory if the value of dynamic parameter Commodity Code for Spot
     * Rates is M and Class Rating ID is not input.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#COMMODITY_NUMBER_PROHIBITED_FOR_P_COMMODITY_CODE 
     * COMMODITY_NUMBER_PROHIBITED_FOR_P_COMMODITY_CODE}</code></td>
     * <td align="left">Commodity Number prohibited if the value of dynamic parameter Commodity Code for Spot
     * Rates is P.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CLASS_RATING_ID_MANDATORY_FOR_M_COMMODITY_CODE 
     * CLASS_RATING_ID_MANDATORY_FOR_M_COMMODITY_CODE}</code></td>
     * <td align="left">ClassRatingID mandatory if the value of dynamic parameter Commodity Code for Spot
     * Rates is Mand Commodity Number is not input.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CLASS_RATING_ID_PROHIBITED_FOR_P_COMMODITY_CODE 
     * CLASS_RATING_ID_PROHIBITED_FOR_P_COMMODITY_CODE}</code></td>
     * <td align="left">ClassRatingID prohibited if the value of dynamic parameter Commodity Code for Spot
     * Rates\u2019 is P.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_K_M_FOR_PERCENT_PRICE_CLASSRATING 
     * CONTRACT_K_M_FOR_PERCENT_PRICE_CLASSRATING}</code></td>
     * <td align="left">Only K, M and Blank Rate Classes are allowed for Percent and Price contract lines with
     * a Class Rating ID.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_K_M_N_Q_FOR_FIXED_CLASSRATING 
     * CONTRACT_K_M_N_Q_FOR_FIXED_CLASSRATING}</code></td>
     * <td align="left">Only K, M, N, Q and BlankRate Classes are allowed for Fixed contract lines with a
     * Class Rating ID.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_COMMODITY_TYPE_NOT_COMPATIBLE_WITH_RATESOURCE 
     * CONTRACT_COMMODITY_TYPE_NOT_COMPATIBLE_WITH_RATESOURCE}</code></td>
     * <td align="left">The Commodity Type is not compatible with the Rate Source.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_COMMODITY_TYPE_MUST_I_OR_A 
     * CONTRACT_COMMODITY_TYPE_MUST_I_OR_A}</code></td>
     * <td align="left">The Commodity Type must be 'I' for IATA or 'D' for ATPCO.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#NUMBER_OF_DECIMAL_IN_OVER_PIVOT_RATE_AND_CURRENCY_MUST_SAME 
     * NUMBER_OF_DECIMAL_IN_OVER_PIVOT_RATE_AND_CURRENCY_MUST_SAME}</code></td>
     * <td align="left">The number of decimals in Over Pivot Rate must be same as Number of Decimals for the
     * Currency.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#NUMBER_OF_DECIMAL_IN_RATE_AND_CURRENCY_MUST_SAME 
     * NUMBER_OF_DECIMAL_IN_RATE_AND_CURRENCY_MUST_SAME}</code></td>
     * <td align="left">The number of decimals in Rate must be same as Number of Decimals for the Currency.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_DECIMAL_POSITIONS_INVALID_FOR_PERCENT_DEFINITION 
     * SPOT_RATE_DECIMAL_POSITIONS_INVALID_FOR_PERCENT_DEFINITION}</code></td>
     * <td align="left">Only up to 3 decimal positions are allowed for PERCENT (Percent Reduction) Spot Rate
     * Definition.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_MIN_WEIGHT_GREATER_THAN_ONE 
     * CONTRACT_MIN_WEIGHT_GREATER_THAN_ONE}</code></td>
     * <td align="left">Minimum weight must be greater than 1.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_MIN_WEIGHT_1 
     * CONTRACT_MIN_WEIGHT_1}</code></td>
     * <td align="left">The Minimum Weight must be 1.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_MIN_WEIGHT_NOT_ALLOWED 
     * CONTRACT_MIN_WEIGHT_NOT_ALLOWED}</code></td>
     * <td align="left">The Minimum Weight input is not allowed.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_MIN_WEIGHT_MANDATORY_FOR_I_J_ULD 
     * CONTRACT_MIN_WEIGHT_MANDATORY_FOR_I_J_ULD}</code></td>
     * <td align="left">The Minimum Weight is required for ULD rating lines with ULD Charge Code 'I' or 'J'.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_OVER_PIVOT_B_RATE_MANDATORY_FOR_RATECLASSES 
     * CONTRACT_OVER_PIVOT_B_RATE_MANDATORY_FOR_RATECLASSES}</code></td>
     * <td align="left">Over Pivot / B Rate is mandatory for the input Rate Class.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CONTRACT_OVER_PIVOT_B_RATE_NOT_ALLOWED_FOR_INVALID_RATECLASSES 
     * CONTRACT_OVER_PIVOT_B_RATE_NOT_ALLOWED_FOR_INVALID_RATECLASSES}</code></td>
     * <td align="left">Over Pivot / B Rate is not allowed for the input Rate Class.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#COMMODITY_NUMBER_MANDATORY_FOR_RATE_CLASS 
     * COMMODITY_NUMBER_MANDATORY_FOR_RATE_CLASS}</code></td>
     * <td align="left">The Commodity Number is mandatory for Rate Class.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#COMMODITY_NUMBER_NOT_ALLOWED_FOR_RATE_CLASS 
     * COMMODITY_NUMBER_NOT_ALLOWED_FOR_RATE_CLASS}</code></td>
     * <td align="left">The Commodity Number is not allowed for Rate Class.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_RATE_SOURCE_REQ_IF_CONTRACT_DEFINITION_PERCENT_OR_PRICE 
     * SPOT_RATE_RATE_SOURCE_REQ_IF_CONTRACT_DEFINITION_PERCENT_OR_PRICE}</code></td>
     * <td align="left">The Rate Source is required if Spot Rate Definition is PERCENT (Percent Reduction),
     * PRICE (Price Reduction).</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#MINIMUN_WEIGHT_NOT_ALLOWED_FOR_RATE_CLASS 
     * MINIMUN_WEIGHT_NOT_ALLOWED_FOR_RATE_CLASS}</code></td>
     * <td align="left">The Minimum Weight is not allowed for Rate Class.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pSpotRatePersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRatePersistRequest
     *            SpotRatePersistRequest}</code><br>
     *            includes the attributes to create a <code>SpotRate</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto
     *            SpotRateDto} - (C)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setWeightUnit
     *            WeightUnit} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setRemarks
     *            Remarks} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setSpecialNotes
     *            SpecialNotes} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setRouteCompression
     *            RouteCompression} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setOId
     *            OId} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setEnforceHurdle
     *            EnforceHurdle} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setEffectivePeriod
     *            EffectivePeriod} - (C)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setEffectiveDate
     *            EffectiveDate} - (M) </code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setExpirationDate
     *            ExpirationDate} - (O) </code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setCurrencyCode
     *            CurrencyCode} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setRateEntryDtos
     *            RateEntryDtos} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setAllCommodity
     *            AllCommodity} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setUldType
     *            UldType} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setUldChargeCode
     *            UldChargeCode} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setSraDefinition
     *            SraDefinition} - (M)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setRatingWeightUnitType
     *            RatingWeightUnitType} - (M)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setRateType
     *            RateType} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setRateSource
     *            RateSource} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setRateAdjustment
     *            RateClass} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setRate
     *            Rate} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setPivotWeight
     *            PivotWeight} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setOverPivotRate
     *            OverPivotRate} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setMinimumWeight
     *            MinimumWeight} - (C)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setMinimumShipmentSize
     *            MinimumShipmentSize} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setCommodityType
     *            CommodityType} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setCommodityNumber
     *            CommodityNumber} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setClassRatingId
     *            ClassRatingId} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setAllUldType
     *            AllUldType} - (C)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setAllMinimumWeight
     *            AllMinimumWeight} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setAllCommodity
     *            AllCommodity} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setParticipant
     *            Participant} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setPayCode
     *            PayCode} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setNetOnNet
     *            NetOnNet} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setLastUpdatedAgent
     *            LastUpdatedAgent} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setFlight
     *            Flight} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setaWBNumber
     *            aWBNumber} - (C)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setAuthorizationCode
     *            authorizationCode} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setAuthorizedAgent
     *            AuthorizedAgent} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setAuthorizationQueueOffice
     *            AuthorizationQueueOffice} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setRateEntryDtos
     *            RateEntryDtos} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setProductCode
     *            ProductCode} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setParticipant
     *            participant} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setSraNumber
     *            SraNumber} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setFlight
     *            Flight} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setRoutingStations
     *            RoutingStations} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setSraNumber
     *            SraNumber} - (O)</code> <br>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)<br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse
     *         SpotRateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code> {@link com.unisys.trans.logistics.lms.rating.constants
     *         MessageConstants#SPOT_RATE_CREATED_SUCCESSFULLY SPOT_RATE_CREATED_SUCCESSFULLY} </code> <br>
     *         <code>for successful create.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse#getSpotRateDto()
     *         SpotRateDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto
     *         SpotRateDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    SpotRateResponse createSpotRateVersion(
                SpotRatePersistRequest pSpotRatePersistRequest) throws LMSException;

    /**
     * Deletes the SpotRate.
     * <p>
     * Only active,expired and Deleted Spot Rate Versions can be deleted.Deleted and history Spot Rate
     * versions cannot be deleted.User Authority, User Profile, User Group, Rating Security and System default
     * authorization are validated. The system sets the spot rate versions status as 'History' and updates the
     * spot rate version information only for the Status changes. The system sets the spot rate versions
     * status as 'deleted' and creates a new spot rate version. If user don't have authority,the spot Rate is
     * sent to Queue for authorization.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.SpotRateService#findSpotRate
     * findSpotRate}<br>
     * <p>
     * To delete the SpotRate user must provide following input:<br>
     * <li>SpotRateId.<br>
     * <li>oId.<br>
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#SYSTEM_PARAMETER_MODULE_NAME}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#SECURITY_FOR_CONTRACTS_AND_SPOTRATES}
     * </pre>
     * 
     * <p>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants
MessageConstants#SPOT_RATE_DOES_NOT_EXIST SPOT_RATE_DOES_NOT_EXIST}</code></td>
     * <td align="left">Spot Rate number does not exists.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_CANT_BE_DELETED SPOT_RATE_CANT_BE_DELETED}</code></td>
     * <td align="left">Spot Rate cannot be deleted.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#USER_NOT_AUTHORISED_FOR_THE_REQUESTED_SPOT_
     * RATE_INFORMATION USER_NOT_AUTHORISED_FOR_THE_REQUESTED_SPOT_RATE_INFORMATION}</code></td>
     * <td align="left">The user is not authorized for the requested spot rate information.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_DELETED_SUCCESSFULLY SPOT_RATE_DELETED_SUCCESSFULLY}</code></td>
     * <td align="left">Spot Rate deleted.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pSpotRateDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDeleteRequest
     *            SpotRateDeleteRequest}</code><br>
     *            includes the attributes to find a <code>SpotRate </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto
     *            SpotRate} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDeleteRequest#setSpotRateId
     *            SpotRateId} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDeleteRequest#setOId
     *            OId} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse
     *         SpotRateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants. MessageConstants#SPOT_RATE_DELETED_SUCCESSFULLY
     *         SPOT_RATE_DELETED_SUCCESSFULLY} </code> <br>
     *         <code>for successful delete.</code>
     *         <ul>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */

    SpotRateResponse deleteSpotRateVersion(
                SpotRateDeleteRequest pSpotRateDeleteRequest) throws LMSException;

    /**
     * Finds the SpotRate .
     * <p>
     * The system finds all versions of the input Spot Rate.The Spot Rate is retrieved for the input filter
     * combination also.The system sorts the spot rate information in the descending order of effective date.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.SpotRateService#createSpotRateVersion
     * createSpotRateVersion}<br>
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
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#SYSTEM_PARAMETER_MODULE_NAME}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#SECURITY_FOR_CONTRACTS_AND_SPOTRATES}
     * </pre>
     * 
     * <p>
     * <p>
     * <p>
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_DOES_NOT_EXIST SPOT_RATE_DOES_NOT_EXIST}</code></td>
     * <td align="left">Spot Rate does not exists.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#NO_SPOT_RATE_FOUND_FOR_FILTERS NO_SPOT_RATE_FOUND_FOR_FILTERS}</code></td>
     * <td align="left">No SpotRate found for the filter combination.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_DELETED_SUCCESSFULLY SPOT_RATE_DELETED_SUCCESSFULLY}</code></td>
     * <td align="left">SpotRate deleted successfully.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pSpotRateFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest
     *            SpotRateFindRequest}</code><br>
     *            includes the attributes to find a <code>SpotRate </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto
     *            SpotRate} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. SpotRateFindRequest#setStatusFilters
     *            StatusFilters} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest#setAccountNumber
     *            AccountNumber} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest#setDate
     *            Date} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. SpotRateFindRequest#setFetchMultipleVersions
     *            FetchMultipleVersions} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest#setSpotRateOId
     *            SpotRateOId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest#setSraNumber
     *            SraNumber} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse
     *         SpotRateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse#getSpotRateDto()
     *         SpotRateDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto
     *         SpotRateDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    SpotRateResponse findSpotRate(SpotRateFindRequest pSpotRateFindRequest)
                throws LMSException;

    /**
     * Finds the SpotRate with no participant account number .
     * <p>
     * This method finds all spot rate versions that has Defer Participant Input set to Yes.For each spot rate
     * version found, the system executes the Spot Rate Version Status. 5. The system sorts the spot rate
     * version information details in ascending order of Spot Rate Number and then by descending order of spot
     * rate version’s Effective Date for each spot rate.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.SpotRateService#createSpotRateVersion
     * createSpotRateVersion}<br>
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
     * MessageConstants#NO_SPOT_RATE_EXIST_FOR_PARTICIPANT NO_SPOT_RATE_EXIST_FOR_PARTICIPANT}</code></td>
     * <td align="left">No SpotRate exist for the participant..</td>
     * </tr>
     * </table>
     * 
     * <p>
     * 
     * @param pSpotRateFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest
     *            SpotRateFindRequest}</code><br>
     *            includes the attributes to find a <code>SpotRate </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto
     *            SpotRate} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest#setStatusFilters
     *            StatusFilters} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. SpotRateFindRequest#setDeferParticipantInput
     *            DeferParticipantInput} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest#setSpotRateOId
     *            SpotRateOId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest#setAccountNumber
     *            AccountNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest#setStation
     *            Station} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse
     *         SpotRateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse#getSpotRateDto()
     *         SpotRateDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto
     *         SpotRateDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    SpotRateResponse findSpotRateListByNoParticipantAccountNumber(
                SpotRateFindRequest pSpotRateFindRequest) throws LMSException;

    /**
     * Finds the SpotRateListByParticipant .
     * <p>
     * This method finds all spot rate versions for the input participant details.The system sorts the spot
     * rate version information details in ascending order of Spot Rate Number and then by descending order of
     * spot rate version’s Effective Date for each spot rate.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.SpotRateService#createSpotRateVersion
     * createSpotRateVersion}<br>
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
     * MessageConstants#NO_SPOT_RATE_EXIST_FOR_PARTICIPANT NO_SPOT_RATE_EXIST_FOR_PARTICIPANT}</code></td>
     * <td align="left">No Spot Rate exists for the participant.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pSpotRateListFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest
     *            SpotRateFindRequest}</code><br>
     *            includes the attributes to find a <code>SpotRate </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto
     *            SpotRate} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest#setStatusFilters
     *            StatusFilters} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. SpotRateFindRequest#setDeferParticipantInput
     *            DeferParticipantInput} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest#setAccountNumber
     *            AccountNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest#setStation
     *            Station} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest#setContact
     *            Contact} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateFindRequest#setOId
     *            ParticipantOId} - (M)</code> <li><code> Prohibited for create operation.</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse
     *         SpotRateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse#getSpotRateDto()
     *         SpotRateDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto
     *         SpotRateDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    SpotRateResponse findSpotRateListByParticipant(
                SpotRateFindRequest pSpotRateListFindRequest) throws LMSException;

    /**
     * Finds the SpotRateListByParticipant .
     * <p>
     * This method finds all spot rate versions for the input participant details.The system sorts the spot
     * rate version information details in ascending order of Spot Rate Number and then by descending order of
     * spot rate version’s Effective Date for each spot rate.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.SpotRateService#createSpotRateVersion
     * createSpotRateVersion}<br>
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
     * MessageConstants#NO_SPOT_RATE_EXIST_FOR_PARTICIPANT NO_SPOT_RATE_EXIST_FOR_PARTICIPANT}</code></td>
     * <td align="left">No Spot Rate exists for the participant.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pSpotRateQueueRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateQueueRequest
     *            SpotRateQueueRequest}</code><br>
     *            includes the attributes to find the queue item for <code>SpotRate </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto
     *            SpotRateDto} - (M)</code>
     *            <ul>
     *            <li><code> <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.AWBNumberDto
     *            AWBNumberDto} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse
     *         SpotRateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse#getSpotRateDto()
     *         SpotRateDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto
     *         SpotRateDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    SpotRateResponse queueItemforReRating(
                SpotRateQueueRequest pSpotRateQueueRequest) throws LMSException;

    /**
     * Updates the <code>SpotRateVersion</code>.
     * <p>
     * Deleted and history spot rate version versions cannot be updated.The input details are validated.The
     * system sets the spot rate version’s Expiration Date to today’s date and sets the spot rate versions
     * status as History. The system updates the spot rate version information only for the changes to the
     * Expiration Date and Status (History). The system creates a new spot rate version.<br>
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.SpotRateService#findSpotRate
     * findSpotRate}<br>
     * <p>
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#DEFAULT_DAYS_FOR_SPOTRATE_EXPIRATION}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#ALLOW_INDEFINITE_EXPIRATION_DATE_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#SECURITY_DEFAULT_VALUE_FOR_ORIGIN}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#SYSTEM_PARAMETER_MODULE_NAME}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#FLIGHT_NUMBER_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#AIRWAYBILL_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#REVENUE_MANAGEMENT_INTERFACE}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#SPOTRATE_DEFAULT_EFFECTIVE_DATE_FROM_TODAY}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#SPECIAL_INSTRUCTIONS_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#SECURITY_FOR_CONTRACTS_AND_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#RATETYPE_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#RATESOURCE_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants
     * .ParameterConstants#RATECLASS_PROHIBITED_FOR_COMMODITY_CODE_P}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#PRODUCT_CODE_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#FLIGHT_DATE_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#DEFAULT_PAYCODE_FOR_SPOTRATES}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#DEFAULT_RATESOURCE}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#COMMODITY_CODE_FOR_SPOTRATES}
     * </pre>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants
     * .MessageConstants#SPOT_RATE_DOES_NOT_EXIST 
     * SPOT_RATE_DOES_NOT_EXIST}</code></td>
     * <td align="left">SpotRate does not exists.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_EXPIRATION_DATE_NOT_PRECEDE_SYSDATE 
     * SPOT_RATE_EXPIRATION_DATE_NOT_PRECEDE_SYSDATE}</code></td>
     * <td align="left">Expiration date must not precede system date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_E_OR_H_D_VERSIONS_CANT_UPDATE 
     * SPOT_RATE_E_OR_H_D_VERSIONS_CANT_UPDATE}</code></td>
     * <td align="left">SpotRate history or deleted versions cannot be updated.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SPOT_RATE_UPDATED_SUCCESSFULLY 
     * SPOT_RATE_UPDATED_SUCCESSFULLY}</code></td>
     * <td align="left">SpotRate updated successfully.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pSpotRatePersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRatePersistRequest
     *            SpotRatePersistRequest}</code><br>
     *            includes the attributes to create a <code>SpotRate</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto
     *            SpotRateDto} - (C)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setWeightUnit
     *            WeightUnit} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setRemarks
     *            Remarks} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setSpecialNotes
     *            SpecialNotes} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setRouteCompression
     *            RouteCompression} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setOId
     *            OId} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setEnforceHurdle
     *            EnforceHurdle} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setEffectivePeriod
     *            EffectivePeriod} - (C)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setEffectiveDate
     *            EffectiveDate} - (M) </code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setExpirationDate
     *            ExpirationDate} - (O) </code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setCurrencyCode
     *            CurrencyCode} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setRateEntryDtos
     *            RateEntryDtos} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setAllCommodity
     *            AllCommodity} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setUldType
     *            UldType} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setUldChargeCode
     *            UldChargeCode} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setSraDefinition
     *            SraDefinition} - (M)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setRatingWeightUnitType
     *            RatingWeightUnitType} - (M)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setRateType
     *            RateType} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setRateSource
     *            RateSource} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setRateAdjustment
     *            RateClass} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setRate
     *            Rate} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setPivotWeight
     *            PivotWeight} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setOverPivotRate
     *            OverPivotRate} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setMinimumWeight
     *            MinimumWeight} - (C)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setMinimumShipmentSize
     *            MinimumShipmentSize} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setCommodityType
     *            CommodityType} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setCommodityNumber
     *            CommodityNumber} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setClassRatingId
     *            ClassRatingId} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setAllUldType
     *            AllUldType} - (C)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setAllMinimumWeight
     *            AllMinimumWeight} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateEntryDto#setAllCommodity
     *            AllCommodity} - (C)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setPayCode
     *            PayCode} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setNetOnNet
     *            NetOnNet} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setLastUpdatedAgent
     *            LastUpdatedAgent} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setFlight
     *            Flight} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setaWBNumber
     *            aWBNumber} - (C)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setAuthorizationCode
     *            authorizationCode} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setAuthorizedAgent
     *            AuthorizedAgent} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setAuthorizationQueueOffice
     *            AuthorizationQueueOffice} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setRateEntryDtos
     *            RateEntryDtos} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setProductCode
     *            ProductCode} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setParticipant
     *            participant} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setSraNumber
     *            SraNumber} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setFlight
     *            Flight} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setRoutingStations
     *            RoutingStations} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto#setSraNumber
     *            SraNumber} - (O)</code> <br>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)<br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse
     *         SpotRateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants. MessageConstants#SPOT_RATE_UPDATED_SUCCESSFULLY
     *         SPOT_RATE_UPDATED_SUCCESSFULLY} </code> <br>
     *         <code>for successful update.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse#getSpotRateDto()
     *         SpotRateDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto
     *         SpotRateDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */

    SpotRateResponse updateSpotRateVersion(
                SpotRatePersistRequest pSpotRatePersistRequest) throws LMSException;

    /**
     * Finds the SpotRateList for list of OIds.
     * <p>
     * This method retrieves list of SpotRates with the input OIds to display Spot Rate Queue information
     * details.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract. SpotRateService#findSpotRateListByParticipant
     * findSpotRateListByParticipant}<br>
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
     * MessageConstants#SPOT_RATE_DOES_NOT_EXIST SPOT_RATE_DOES_NOT_EXIST}</code></td>
     * <td align="left">The Spot Rate Number does not exist in the system.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pSpotRateListFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateListRequest
     *            SpotRateListRequest}</code><br>
     *            includes the attributes to find a <code>SpotRate </code>.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateListRequest#setAccountNumber
     *            AccountNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateListRequest#setName
     *            Name} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateListRequest#setParticipantOId
     *            ParticipantOId} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateListRequest#setStation
     *            Station} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateListRequest#setStatusFilters
     *            StatusFilters} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateListRequest#setSpotRateOIds
     *            SpotRateOIds} - (M)</code>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse
     *         SpotRateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse#getSpotRateDto()
     *         SpotRateDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateDto
     *         SpotRateDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    SpotRateResponse findSpotRateListForQueue(
                SpotRateListRequest pSpotRateListFindRequest) throws LMSException;

    /**
     * Updates the <code>QueueSpotRate</code>.
     * <p>
     * This method updates a queue SpotRate. <br>
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.SpotRateService#updateSpotRateVersion
     * updateSpotRateVersion}<br>
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
     * MessageConstants#SPOT_RATE_DOES_NOT_EXIST 
     * SPOT_RATE_DOES_NOT_EXIST}</code></td>
     * <td align="left">SpotRate does not exists.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pSpotRateQueueItemsUpdateRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateQueueItemsUpdateRequest
     *            SpotRateQueueItemsUpdateRequest}</code><br>
     *            includes the attributes to update a <code>queued SpotRate
     *            </code>.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. SpotRateQueueItemsUpdateRequest#setQueueItemsMap
     *            queueItemsMap} - (M)</code>
     *            <ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse
     *         SpotRateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants. MessageConstants#SPOT_RATE_AUTHORIZED_SUCCESSFULLY
     *         SPOT_RATE_AUTHORIZED_SUCCESSFULLY} </code><br>
     *         <code>for successful update.</code> </li>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */

    SpotRateResponse updateQueueSpotRate(
                SpotRateQueueItemsUpdateRequest pSpotRateQueueItemsUpdateRequest)
                throws LMSException;

    /**
     * Checks whether the spot rate exists for the participant.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.SpotRateService#createSpotRateVersion
     * createSpotRateVersion}<br>
     * <p>
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
     * 
     * @param pParticipantAccnumber
     *            holds the list of Participant Account numbers. </ul>
     *            <p>
     *            <ul>
     *            <li>
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *            </ul>
     * @throws LMSException
     *             If the validation fails, LMS Exception is thrown.
     */
    void findSpotRateExistForParticipant(List<String> pParticipantAccnumber)
                throws LMSException;

    /**
     * Deletes spot rate for the participant.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract. SpotRateService#createSpotRateVersion
     * createSpotRateVersion}<br>
     * <p>
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
     * 
     * @param pParticipantAccNumbers
     *            holds the list of Participant Account numbers.
     *            <p>
     *            <ul>
     *            <li>
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.
     *            AbstractResponse
     *         Response fields}</code><br>
     *            </ul>
     * @throws LMSException
     *             If the validation fails,LMS Exception is thrown.
     */
    SpotRateResponse deleteSpotRateForParticipant(List<String> pParticipantAccNumbers,
                ParticipantDeleteRequest pParticipantDeleteRequest)
                throws LMSException;

    /**
     * Finds the SpotRate's by Status filtes.
     * <p>
     * This method retrieves list of SpotRates with the input of Status filter(s).
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract. SpotRateService#findSpotRate
     * findSpotRate}<br>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants
MessageConstants#SPOT_RATE_DOES_NOT_EXIST SPOT_RATE_DOES_NOT_EXIST}</code></td>
     * <td align="left">The Spot Rate Number does not exist in the system.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pExtractRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.ExtractRequest
     *            ExtractRequest}</code><br>
     *            includes the attributes to find a <code>SpotRate </code>.
     *            <ul>
     *            <li><code> IncludedStatuses - (M)</code> </li> <li><code> UpdatedDate - (O)</code> </li>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ExtractResponse
     *         ExtractResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage </li> <li> <code>list of SpotRateDto's </code></li>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    ExtractResponse findSpotRatesByStatusFilters(ExtractRequest pExtractRequest)
                throws LMSException;

    /**
     * Updates the Spot Rate Date Range if any spot rate exist for given
     * Participant Group Information.
     * <p>
     * This method updates the Spot Rate Date Range.
     * <p>
     * To update SpotRate user must provide following participant input:<br>
     * <ul>
     * <li>BillingAccountNumber1
     * <li>BillingAccountNumber2
     * <li>oId
     * </ul>
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
     * 
     * @param pBatchRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     *            includes the attributes to update a <code>Contract </code>.
     *            <ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse
     *         SpotRateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRate
     *         SpotRate}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails,LMSException is thrown.
     */
    BatchResponse maintainSpotRateForParticipant(BatchRequest pBatchRequest)
                throws LMSException;

    /**
     * Updates the Spot Rate Date Range if any spot rate exist for given
     * Participant Information.
     * <p>
     * This method updates the Spot Rate Date Range.
     * <p>
     * To update SpotRate user must provide following participant input:<br>
     * <ul>
     * <li>ParticipantGroupNumber
     * <li>ParticipantGroupIndicator
     * <li>oId
     * </ul>
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
     * 
     * @param pBatchRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     *            includes the attributes to update a <code>Contract </code>.
     *            <ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRateResponse
     *         SpotRateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.SpotRate
     *         SpotRate}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails,LMSException is thrown.
     */
    BatchResponse maintainSpotRateForPartsGroup(BatchRequest pBatchRequest)
                throws LMSException;
    
    /**
     * This method deletes all the spotrates exists in the system.
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
     * 
     * @param pAbstractRequest - <code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractRequest
     *            AbstractRequest}</code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse
     *         BatchResponse}</code> </ul>
     * @throws LMSException If the operation fails.
     */
    BatchResponse deleteAllSpotRates(AbstractRequest pAbstractRequest) throws LMSException;
    /**
     * This method validates all the spotRates exists in the system for the particular participant.
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
     * 
     * @param ParticipantAccNumValidatorResponse - <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAccNumValidatorResponse
     *            ParticipantAccNumValidatorResponse}</code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAccNumValidatorResponse
     *         ParticipantAccNumValidatorResponse}</code> </ul>
     * @throws LMSException If the operation fails.
     */
    ParticipantAccNumValidatorResponse validateSpotRateExistForParticipant(
                final ParticipantAccNumValidatorResponse pAccNumValidatorResponse) throws LMSException;
    SpotRateResponse findSpotRatebyExistingAwb(final SpotRateFindRequest pfindRequest)
                throws LMSException;

	

}
