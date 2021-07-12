/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.JointRateDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.JointRateFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.JointRatePersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.JointRateResponse;
import com.unisys.trans.logistics.lms.rating.dto.JointRateRoutingRequest;
import com.unisys.trans.logistics.lms.rating.dto.JointRateRoutingResponse;

/**
 * <code>JointRateServiceImpl</code> provides the functional methods to maintain
 * joint rate information.
 * <p>
 * It offers the following services for maintaining joint rate information:<br>
 * <ul>
 * <li>createJointRate - Creates Joint rate information.
 * <li>deleteJointRate - Deletes Joint rate information.
 * <li>findJointRate - Finds the Joint rate information.
 * <li>findJointRateRoutings - Finds all the routings for a joint rate that exist in the system.
 * <li>updateJointRate - Updates Joint rate information.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.JointRateDeleteRequest
 *      JointRateDeleteRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.JointRateFindRequest
 *      JointRateFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.JointRatePersistRequest
 *      JointRatePersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.JointRateRoutingRequest
 *      JointRateRoutingRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.JointRateResponse
 *      JointRateResponse
 * @see com.unisys.trans.logistics.lms.rating.dto.JointRateRoutingResponse
 *      JointRateRoutingResponse
 */

public interface JointRateService {

    /**
     * This method creates the <code>JointRate</code> based on the given origin
     * and destination.<br>
     * A joint rate is a single rate applied to a shipment carried by two or
     * three carriers within North America to a destination.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.JointRateService#updateJointRate
     * updateJointRate}<br>
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JOINT_RATE_ALREADY_EXISTS JOINT_RATE_ALREADY_EXISTS}</code></td>
     * <td align="left">The Joint Rate already exists for the input details.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * 
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_CITY_NOT_WITHIN_NORTH_AMERICA JR_CITY_NOT_WITHIN_NORTH_AMERICA}</code></td>
     * <td align="left">All cities must be within North America.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_ALL_CITIES_MUST_BE_UNIQUE JR_ALL_CITIES_MUST_BE_UNIQUE}</code></td>
     * <td align="left">All cities must be unique..</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_ATP_RATE_SOURCE_ALLOWED JR_ATP_RATE_SOURCE_ALLOWED}</code></td>
     * <td align="left">Only Rate Source \u201CATP\u201D is allowed.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JOINT_RATE_NOT_EXISTS_FOR_THIS_ROUTING JOINT_RATE_NOT_EXISTS_FOR_THIS_ROUTING}</code>
     * </td>
     * <td align="left">The Joint Rate does not exist for the input details.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JOINT_RATE_NOT_EXISTS_FOR_FILTERS JOINT_RATE_NOT_EXISTS_FOR_FILTERS}</code></td>
     * <td align="left">The Joint Rate does not exist for the input details and Filter combination.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_RATE_TYPE_NOT_ALLOWED_FOR_RATESOURCE JR_RATE_TYPE_NOT_ALLOWED_FOR_RATESOURCE}</code>
     * </td>
     * <td align="left">The Rate Type is not allowed for ATP Rate Source.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_RATE_CLASS_NOT_ALLOWED_FOR_JOINT_RATE JR_RATE_CLASS_NOT_ALLOWED_FOR_JOINT_RATE}</code>
     * </td>
     * <td align="left">The Rate Class is not allowed for joint rate.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_RATE_CLASS_NOT_ALLOWED_FOR_ATPCO_RATING_RATETYPE JR_RATE_CLASS_NOT_ALLOWED_FOR_ATPCO_RATING_RATETYPE}</code>
     * </td>
     * <td align="left">The Rate Class is not allowed for ATPCO rating convention of input Rate Type.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_MIN_WT_MUST_GREATER_THAN_EQUAL_ONE_FOR_RATECLASS_U JR_MIN_WT_MUST_GREATER_THAN_EQUAL_ONE_FOR_RATECLASS_U}</code>
     * </td>
     * <td align="left">The Minimum Weight must be greater than or equal to 1 for Rate Class 'U'.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_MIN_WT_GREATER_THAN_MAX_CHARGE_WT JR_MIN_WT_GREATER_THAN_MAX_CHARGE_WT}</code></td>
     * <td align="left">The Minimum Weight is greater than Maximum Chargeable Weight Allowed of Rate Type.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_MIN_WT_GREATER_THAN_MAX_GROSS_WT JR_MIN_WT_GREATER_THAN_MAX_GROSS_WT}</code></td>
     * <td align="left">The Minimum Weight is greater than Maximum Gross Weight Allowed of Rate Type.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_DEC_POS_MIN_WT_ALLOWED_FOR_RATECLASS_N JR_DEC_POS_MIN_WT_ALLOWED_FOR_RATECLASS_N}</code>
     * </td>
     * <td align="left">The decimal position in Minimum Weight is allowed only for Rate Class \u2018N\u2019.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_RATE_AND_CURRENCY_DEC_SAME JR_RATE_AND_CURRENCY_DEC_SAME}</code></td>
     * <td align="left">The number of decimals in Rate must be same as Number of Decimals for the Currency..</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_EFF_DATE_GREATER_THAN_OR_EQUAL_CURRENCY_EFF_DATE JR_EFF_DATE_GREATER_THAN_OR_EQUAL_CURRENCY_EFF_DATE}</code>
     * </td>
     * <td align="left">The input Effective Date of the joint rate entry must be greater than or equal to the
     * Currency Effective Date.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_EFF_DATE_LESS_THAN_OR_EQUAL_CURRENCY_EXP_DATE JR_EFF_
     * DATE_LESS_THAN_OR_EQUAL_CURRENCY_EXP_DATE}</code></td>
     * <td align="left">The input Effective Date of the joint rate entry must be less than or equal to the
     * Currency Expiration Date.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_EXP_DATE_LESS_THAN_OR_EQUAL_CURRENCY_EXP_DATE JR_EXP_
     * DATE_LESS_THAN_OR_EQUAL_CURRENCY_EXP_DATE}</code></td>
     * <td align="left">The input Expiration Date of the joint rate entry must be less than or equal to the
     * Currency Expiration Date.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JOINT_RATE_HAS_DUPLICATE_ENTRIES JOINT_RATE_HAS_DUPLICATE_ENTRIES}</code></td>
     * <td align="left">The duplicate Joint rate entry is not allowed.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_RATING_NOTE_VALID_FOR_CARRIER_CODE1 JR_RATING_NOTE_
     * VALID_FOR_CARRIER_CODE1}</code></td>
     * <td align="left">The Rating Note must be valid for Intermediate Carrier Code 1.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_ATPCO_COMMODITY_NUMBER_ALLOWED JR_ATPCO_COMMODITY_NUMBER_ALLOWED}</code></td>
     * <td align="left">Only ATPCO Commodity Number is allowed.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_PERCENT_NOT_ALLOWED_FOR_NONFOUR_CITY_ROTUING 
     * JR_PERCENT_NOT_ALLOWED_FOR_NONFOUR_CITY_ROTUING}</code></td>
     * <td align="left">The Percentage 3 is not allowed for Non-Four city routing.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_TOTAL_PERCENT_ZERO_OR_HUNDRED JR_TOTAL_PERCENT_ZERO_OR_HUNDRED}</code></td>
     * <td align="left">The total of percentage fields must either be 0 or 100.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_ATLEAST_TWO_CARRIERS_MUST_BE_UNIQUE JR_ATLEAST_
     * TWO_CARRIERS_MUST_BE_UNIQUE}</code></td>
     * <td align="left">Atleast two carriers must be unique.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_MINIMUM_WEIGHT_GREATER_THAN_ZERO_FOR_RATE_
     * CLASS_K JR_MINIMUM_WEIGHT_GREATER_THAN_ZERO_FOR_RATE_CLASS_K}</code></td>
     * <td align="left">The Minimum Weight must be greater than 0 for Rate Class 'K'..</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pJointRatePersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRatePersistRequest
     *            JointRatePersistRequest} </code><br>
     *            holds the request object that includes attributes to create a
     *            joint rate.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto
     *            JointRateDto}</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto#setCurrencyCode
     *            currencyCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto#setOId
     *            oId} - (O)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto#setDestination
     *            destination} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto#setDestinationCarrierCode
     *            destinationCarrierCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto#setJointRateEntryDtos
     *            jointRateEntryDtos} </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setAmount
     *            amount} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setCommodityNumber
     *            commodityNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setDateRangeDto
     *            dateRangeDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setExpirationDate
     *            expirationDate} - (O)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto# setJointRatePercentageDtos
     *            jointRatePercentageDtos} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRatePercentageDto#setOId
     *            oId} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRatePercentageDto#setPercentage
     *            percentage} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRatePercentageDto#setpercentageOrder
     *            percentageOrder} - (If it is enabled as input it is mandatory else prohibited.) (M)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setMinimumWeight
     *            minimumWeight} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setOId
     *            oId} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setOverPivotRate
     *            overPivotRate} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setPivotWeight
     *            pivotWeight} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setRateClass
     *            rateClass}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setRateTypeCode
     *            rateTypeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setRatingNoteCode
     *            ratingNoteCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setUldType
     *            uldType}- (C) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setWeightUnit
     *            weightUnit} - (O)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto#setJointRateRoutingDtos
     *            jointRateRoutingDtos} </code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateRoutingDto#setCarrierCode
     *            carrierCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateRoutingDto#setCity
     *            city} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateRoutingDto#setOId
     *            oId} - (O) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateRoutingDto#setRoutingOrder
     *            routingOrder} - (M)</code>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto#setOrigin
     *            origin}- (M)</code>
     *            </ul>
     *            </ul>
     *            </p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateResponse
     *         JointRateResponse}</code>
     *         <ul>
     *         <li>
     *         <code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#JOINT_RATE_CREATED
     *         JOINT_RATE_CREATED} </code> <br>
     *         <code>for successful create.</code>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.JointRateResponse #getJointRateDto()
     *         JointRateDto} - (1:*)</code>
     *         </ul>
     * @throws LMSException
     *             If the create operation of joint rate fails, above mentioned
     *             error codes are returned. Each CodeMessage contains the
     *             status code, human readable message, and message type.
     */

    JointRateResponse createJointRate(
                final JointRatePersistRequest pJointRatePersistRequest)
                throws LMSException;

    /**
     * Deletes the Joint Rate.
     * <p>
     * This functions deletes the joint rate for origin and destination pair.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.JointRateService#findJointRate
     * findJointRate}<br>
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
     * MessageConstants #JOINT_RATE_NOT_EXISTS_FOR_THIS_ROUTING JOINT_RATE_NOT_EXISTS_FOR_THIS_ROUTING}</code>
     * </td>
     * <td align="left">The Joint Rate does not exist for the input details.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JOINT_RATE_EFFECTIVE_CANT_BE_DELETED JOINT_RATE_EFFECTIVE_CANT_BE_DELETED}</code></td>
     * <td align="left">The Effective Joint Rate cannot be deleted.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JOINT_RATE_NOT_EXISTS_FOR_FILTERS JOINT_RATE_NOT_EXISTS_FOR_FILTERS}</code></td>
     * <td align="left">The Joint Rate does not exist for the input details and Filter combination.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pJointRateDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDeleteRequest
     *            JointRateDeleteRequest}</code><br>
     *            holds the request object that includes attributes to delete a
     *            joint rate.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto
     *            JointRateDto} </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto#setOId
     *            oId}-(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto #setVersion
     *            version} -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateResponse
     *         JointRateResponse}</code>
     *         <ul>
     *         JointRateResponse <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants #JOINT_RATE_DELETED
     *         JOINT_RATE_DELETED} </code> <br>
     *         <code>for successful delete.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.JointRateResponse #getJointRateDto()
     *         JointRateDto} - (1:*)</code>
     *         </ul>
     * @throws LMSException
     *             If the deletion operation of joint rate is failed, above
     *             mentioned error codes are returned. Each CodeMessage contains
     *             the status code, human readable message, and message type.
     */
    JointRateResponse deleteJointRate(
                final JointRateDeleteRequest pJointRateDeleteRequest)
                throws LMSException;

    /**
     * Finds the Joint Rate for the routing requested by the user.
     * <p>
     * This method provides the retrieved joint rates for the given origin, intermediate and destination
     * cities.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.JointRateService #findJointRate
     * findJointRate}<br>
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
     * MessageConstants #RATE_TYPE_DOES_NOT_EXIST RATE_TYPE_DOES_NOT_EXIST}</code></td>
     * <td align="left">The RateType does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JOINT_RATE_NOT_EXISTS_FOR_THIS_ROUTING JOINT_RATE_NOT_EXISTS_FOR_THIS_ROUTING}</code>
     * </td>
     * <td align="left">The Joint Rate does not exist for the input details.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JOINT_RATE_NOT_EXISTS_FOR_FILTERS JOINT_RATE_NOT_EXISTS_FOR_FILTERS}</code></td>
     * <td align="left">The Joint Rate does not exist for the input details.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#COUNTRY_CODE_DOES_NOT_EXIST COUNTRY_CODE_DOES_NOT_EXIST}</code></td>
     * <td align="left">CountryCode does not exist.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#CITY_CODE_DOES_NOT_EXIST CITY_CODE_DOES_NOT_EXIST}</code></td>
     * <td align="left">City does not exist.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#JR_CITY_NOT_WITHIN_NORTH_AMERICA JR_CITY_NOT_WITHIN_NORTH_AMERICA}</code></td>
     * <td align="left">All cities must be within North America.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#JR_ALL_CITIES_MUST_BE_UNIQUE JR_ALL_CITIES_MUST_BE_UNIQUE}</code></td>
     * <td align="left">All cities must be unique.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#JR_ATLEAST_TWO_CARRIERS_MUST_BE_UNIQUE JR_ATLEAST_TWO_CARRIERS_MUST_BE_UNIQUE}</code></td>
     * <td align="left">Atleast two carriers must be unique.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_SOURCE_NOT_BELONGS_TO_CARRIER RATE_SOURCE_NOT_BELONGS_TO_CARRIER}</code></td>
     * <td align="left">The Rate Source does not belong to the Carrier.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#AOR_INPUT_CURRENCY_MUST_BE_VALID_CURRENCY_OF_CITY AOR_
     * INPUT_CURRENCY_MUST_BE_VALID_CURRENCY_OF_CITY}</code></td>
     * <td align="left">The input currency must be one of the allowed currencies of City To Be Constructed
     * Code.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pJointRateFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateFindRequest
     *            JointRateFindRequest}</code><br>
     *            includes the attributes to find a <code>JointRate</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto
     *            JointRateDto} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto
     *            rateTypeCode} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateResponse
     *         JointRateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.JointRateResponse #getJointRateDto()
     *         JointRateDto} - (1:*)</code><br>
     *         holds a joint rate details with <code>JointRateDto</code> as value.
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation for finding joint rate fails, above
     *             mentioned error codes are returned. Each CodeMessage contains
     *             the status code, human readable message, and message type.
     */
    JointRateResponse findJointRate(
                final JointRateFindRequest pJointRateFindRequest)
                throws LMSException;

    /**
     * Finds all the joint rate routings for the given Origin and Destination
     * code.
     * <p>
     * This method, used for pop up,will return the details such as state and country of the given origin and
     * destination.<br>
     * Also it gives the destination carrier and intermediate city details such as code and carrier.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.JointRateService#findJointRateRoutings
     * findJointRateRoutings}<br>
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
     * @param pJointRateRoutingRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateRoutingRequest
     *            JointRateRoutingRequest}</code><br>
     *            includes the attributes to find all the joint rate routings
     *            for a origin and destination given.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateRoutingDto
     *            JointRate} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateRoutingDto#setOriginCode
     *            OriginCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateRoutingDto#setDestinationCode
     *            DestinationCode} - (M)</code>Prohibited for create operation. <li> <code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateRoutingResponse
     *         JointRateRoutingResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds a joint rate details with <code>JointRateDto</code> as value.
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto. JointRateRoutingResponse #getJointRateDto()
     *         JointRateDto} - (1:*)</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto. JointRateRoutingResponse #getDestination()
     *         Destination} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto. JointRateRoutingResponse #getOrigin()
     *         Origin} </code><br>
     *         </ul>
     * 
     *         </ul>
     * @throws LMSException
     *             If the validation for finding joint rate routings fails,
     *             above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message
     *             type.
     */
    JointRateRoutingResponse findJointRateRoutings(
                final JointRateRoutingRequest pJointRateRoutingRequest)
                throws LMSException;

    /**
     * Updates the <code>JointRate</code>based on the entry selected.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.JointRateService#updateJointRate
     * updateJointRate}<br>
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
     * .MessageConstants #JR_EFFECTIVE_JOINT_RATE_EXP_DATE_ONLY_UPDATED
     *  JR_EFFECTIVE_JOINT_RATE_EXP_DATE_ONLY_UPDATED}</code></td>
     * <td align="left">The Joint Rate Entry is effective and only Expiration date can be updated</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JOINT_RATE_ALREADY_EXISTS JOINT_RATE_ALREADY_EXISTS}</code></td>
     * <td align="left">The Joint Rate already exists for the input details.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_CITY_NOT_WITHIN_NORTH_AMERICA JR_CITY_NOT_WITHIN_NORTH_AMERICA}</code></td>
     * <td align="left">All cities must be within North America.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_ALL_CITIES_MUST_BE_UNIQUE JR_ALL_CITIES_MUST_BE_UNIQUE}</code></td>
     * <td align="left">All cities must be unique..</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_ATP_RATE_SOURCE_ALLOWED JR_ATP_RATE_SOURCE_ALLOWED}</code></td>
     * <td align="left">Only Rate Source \u201CATP\u201D is allowed.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JOINT_RATE_NOT_EXISTS_FOR_THIS_ROUTING JOINT_RATE_NOT_
     * EXISTS_FOR_THIS_ROUTING}</code></td>
     * <td align="left">The Joint Rate does not exist for the input details.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JOINT_RATE_NOT_EXISTS_FOR_FILTERS JOINT_RATE_NOT_EXISTS_FOR_FILTERS}</code></td>
     * <td align="left">The Joint Rate does not exist for the input details and Filter combination.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_RATE_TYPE_NOT_ALLOWED_FOR_RATESOURCE JR_RATE_TYPE_NOT_
     * ALLOWED_FOR_RATESOURCE}</code></td>
     * <td align="left">The Rate Type is not allowed for ATP Rate Source.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_RATE_CLASS_NOT_ALLOWED_FOR_JOINT_RATE JR_RATE_CLASS_NOT_
     * ALLOWED_FOR_JOINT_RATE}</code></td>
     * <td align="left">The Rate Class is not allowed for joint rate.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_RATE_CLASS_NOT_ALLOWED_FOR_ATPCO_RATING_
     * RATETYPE JR_RATE_CLASS_NOT_ALLOWED_FOR_ATPCO_RATING_RATETYPE}</code></td>
     * <td align="left">The Rate Class is not allowed for ATPCO rating convention of input Rate Type.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_MIN_WT_MUST_GREATER_THAN_EQUAL_ONE_FOR_
     * RATECLASS_U JR_MIN_WT_MUST_GREATER_THAN_EQUAL_ONE_FOR_RATECLASS_U}</code></td>
     * <td align="left">The Minimum Weight must be greater than or equal to 1 for Rate Class 'U'.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_MIN_WT_GREATER_THAN_MAX_CHARGE_WT JR_MIN_WT_GREATER_THAN_MAX_CHARGE_WT}</code></td>
     * <td align="left">The Minimum Weight is greater than Maximum Chargeable Weight Allowed of Rate Type.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_MIN_WT_GREATER_THAN_MAX_GROSS_WT JR_MIN_WT_GREATER_THAN_MAX_GROSS_WT}</code></td>
     * <td align="left">The Minimum Weight is greater than Maximum Gross Weight Allowed of Rate Type.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_DEC_POS_MIN_WT_ALLOWED_FOR_RATECLASS_N JR_DEC_POS_MIN_WT_ALLOWED_
     * FOR_RATECLASS_N}</code></td>
     * <td align="left">The decimal position in Minimum Weight is allowed only for Rate Class \u2018N\u2019.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_RATE_AND_CURRENCY_DEC_SAME JR_RATE_AND_CURRENCY_DEC_SAME}</code></td>
     * <td align="left">The number of decimals in Rate must be same as Number of Decimals for the Currency..</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_EFF_DATE_GREATER_THAN_OR_EQUAL_CURRENCY_EFF_
     * DATE JR_EFF_DATE_GREATER_THAN_OR_EQUAL_CURRENCY_EFF_DATE}</code></td>
     * <td align="left">The input Effective Date of the joint rate entry must be greater than or equal to the
     * Currency Effective Date.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_EFF_DATE_LESS_THAN_OR_EQUAL_CURRENCY_EXP_DATE JR_EFF_
     * DATE_LESS_THAN_OR_EQUAL_CURRENCY_EXP_DATE}</code></td>
     * <td align="left">The input Effective Date of the joint rate entry must be less than or equal to the
     * Currency Expiration Date.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_EXP_DATE_LESS_THAN_OR_EQUAL_CURRENCY_EXP_DATE 
     * JR_EXP_DATE_LESS_THAN_OR_EQUAL_CURRENCY_EXP_DATE}</code></td>
     * <td align="left">The input Expiration Date of the joint rate entry must be less than or equal to the
     * Currency Expiration Date.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JOINT_RATE_HAS_DUPLICATE_ENTRIES JOINT_RATE_HAS_DUPLICATE_ENTRIES}</code></td>
     * <td align="left">The duplicate Joint rate entry is not allowed.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_RATING_NOTE_VALID_FOR_CARRIER_CODE1 JR_RATING_NOTE_VALID_FOR_CARRIER_CODE1}</code>
     * </td>
     * <td align="left">The Rating Note must be valid for Intermediate Carrier Code 1.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_ATPCO_COMMODITY_NUMBER_ALLOWED JR_ATPCO_COMMODITY_NUMBER_ALLOWED}</code></td>
     * <td align="left">Only ATPCO Commodity Number is allowed.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_PERCENT_NOT_ALLOWED_FOR_NONFOUR_CITY_ROTUING JR_
     * PERCENT_NOT_ALLOWED_FOR_NONFOUR_CITY_ROTUING}</code></td>
     * <td align="left">The Percentage 3 is not allowed for Non-Four city routing.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_TOTAL_PERCENT_ZERO_OR_HUNDRED JR_TOTAL_PERCENT_ZERO_OR_HUNDRED}</code></td>
     * <td align="left">The total of percentage fields must either be 0 or 100.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants #JR_ATLEAST_TWO_CARRIERS_MUST_BE_UNIQUE JR_ATLEAST_TWO_CARRIERS_MUST_BE_UNIQUE}
     * </code></td>
     * <td align="left">Atleast two carriers must be unique.</td>
     * </tr>
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants #JR_MINIMUM_
     * WEIGHT_GREATER_THAN_ZERO_FOR_RATE_CLASS_K JR_MINIMUM_WEIGHT_GREATER_THAN_ZERO_FOR_RATE_CLASS_K}</code></td>
     * <td align="left">The Minimum Weight must be greater than 0 for Rate Class 'K'..</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pJointRatePersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRatePersistRequest
     *            JointRatePersistRequest} </code><br>
     *            holds the request object that includes attributes to create a
     *            joint rate.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto
     *            JointRateDto}</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto#setCurrencyCode
     *            currencyCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto#setOId
     *            oId} - (M)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto#setDestination
     *            destination} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto#setDestinationCarrierCode
     *            destinationCarrierCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto#setJointRateEntryDtos
     *            jointRateEntryDtos} </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setAmount
     *            amount} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setCommodityNumber
     *            commodityNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setDateRangeDto
     *            dateRangeDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setExpirationDate
     *            expirationDate} - (O)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setJointRatePercentageDtos
     *            jointRatePercentageDtos} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRatePercentageDto#setOId
     *            oId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRatePercentageDto#setPercentage
     *            percentage} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRatePercentageDto#setpercentageOrder
     *            percentageOrder} - (If it is enabled as input it is mandatory else prohibited.) (M)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setMinimumWeight
     *            minimumWeight} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setOId
     *            oId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setOverPivotRate
     *            overPivotRate} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setPivotWeight
     *            pivotWeight} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setRateClass
     *            rateClass} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setRateTypeCode
     *            rateTypeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setRatingNoteCode
     *            ratingNoteCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setUldType
     *            uldType} - (C) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto#setWeightUnit
     *            weightUnit} - (O)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto#setJointRateRoutingDtos
     *            jointRateRoutingDtos} </code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateRoutingDto#setCarrierCode
     *            carrierCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateRoutingDto#setCity
     *            city} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateRoutingDto#setOId
     *            oId} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.JointRateRoutingDto#setRoutingOrder
     *            routingOrder} - (M)</code>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateDto#setOrigin
     *            origin}- (M)</code>
     *            </ul>
     *            </ul>
     *            </p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.JointRateResponse
     *         JointRateResponse}</code>
     *         <ul>
     *         <li>
     *         <code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#JOINT_RATE_UPDATED
     *         JOINT_RATE_UPDATED} </code> <br>
     *         <code>for successful update.</code>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.JointRateResponse #getJointRateDto()
     *         JointRateDto} - (1:*)</code>
     *         </ul>
     * @throws LMSException
     *             If the update operation of joint rate fails, above mentioned
     *             error codes are returned. Each CodeMessage contains the
     *             status code, human readable message, and message type.
     */
    JointRateResponse updateJointRate(
                final JointRatePersistRequest pJointRatePersistRequest)
                throws LMSException;
    
    BatchResponse updateJointRateForCity(BatchRequest pBatchRequest)
                throws LMSException;
}