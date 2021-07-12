/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleCarrierRequest;
import com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleCarrierResponse;
import com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.ClassRatingRulePersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleResponse;

/**
 * <code>Class rating rule service</code> provides the functional methods to
 * maintain class rating rule information.
 * <p>
 * 
 * 
 * It offers the following services for maintaining class rating rule information:<br>
 * <ul>
 * <li>createClassRatingRule - Creates class rating rule information.
 * <li>deleteClassRatingRule - Deletes class rating rule information.
 * <li>findCarriersWithClassRatingRule - Finds all the carriers for the input class rating id and rate source.
 * <li>findClassRatingRule - Finds the class rating rule for the given input details.
 * <li>updateClassRatingRule - Updates class rating rule information.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDeleteRequest
 *      ClassRatingRuleDeleteRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleFindRequest
 *      ClassRatingRuleFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ClassRatingRulePersistRequest
 *      ClassRatingRulePersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleCarrierRequest
 *      ClassRatingRuleCarrierRequest
 * @see com.unisys.trans.logistics.lms.rating.domain.ClassRatingRule
 *      ClassRatingRule
 * @see com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleResponse
 *      ClassRatingRuleResponse
 * @see com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleCarrierResponse
 *      ClassRatingRuleCarrierResponse
 */

public interface ClassRatingRuleService {

    /**
     * Creates the <code>Class Rating Rule</code>.
     * <p>
     * Creates the Class Rating Rule based on the class Rating Id, Carrier Code and Rate Source.<br>
     * The following lists the types of class rating rules that are supported.
     * <li>Class Rating Rules (IATA and ATPCO)
     * <li>Class Minimum Rating Rules (IATA)
     * <li>Joint Class Rating Rules (ATPCO) <br>
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.ClassRatingRuleService#updateClassRatingRule
     * updateClassRatingRule}<br>
     * <p>
     * To create the ClassRatingRule user must provide following input:<br>
     * <li>ClassRatingId. <br>
     * <li>Carrier Code. <br>
     * <li>Rate Source. <br>
     * <li>ClassRatingRuleEntryDto.
     * <p>
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * 
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CLASS_RATING_RULE_ALREADY_EXIST_IN_THE_SYSTEM CLASS_RATING_RULE_ALREADY_EXIST_IN_THE_SYSTEM}</code>
     * </td>
     * <td align="left">The class rating rule already exists in the system for the given Class Rating Id,
     * Carrier Code and Rate Source.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CLASS_RATING_ID_MARKED_FOR_DELETION CLASS_RATING_ID_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">Class Rating Id is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CLASS_RATING_ID_MUST_BE_VALID CLASS_RATING_ID_MUST_BE_VALID}</code>
     * </td>
     * <td align="left">Class Rating Id does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CARRIER_CODE_DOES_NOT_EXIST CARRIER_CODE_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Carrier Code does not exist in the system</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CARRIER_CODE_MARKED_FOR_DELETION CARRIER_CODE_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">Carrier Code is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_DOES_NOT_EXISTS RATE_SOURCE_DOES_NOT_EXISTS}</code>
     * </td>
     * <td align="left">Rate Source does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_MARKED_FOR_DELETION RATE_SOURCE_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">Rate Source is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_RATECODE_DOES_NOT_EXIST RATETYPE_RATECODE_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Rate Type code does not exist.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_TYPE_MARKED_FOE_DELETION RATE_TYPE_MARKED_FOE_DELETION}</code>
     * </td>
     * <td align="left">Rate Type is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#AIRPORT_MARKED_FOR_DELETION AIRPORT_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">Airport is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CITY_CODE_DOES_NOT_EXIST CITY_CODE_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">City code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CITY_CODE_MARKED_FOR_DELETION CITY_CODE_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">City code is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#AGGREGATE_DOES_NOT_EXIST AGGREGATE_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Aggregate does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#AGGREGATE_MARKED_FOR_DELETION AGGREGATE_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">Aggregate is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#EFFECTIVEDATE_GREATER_THAN_CURRENT_SYSTEMDATE EFFECTIVEDATE_GREATER_THAN_CURRENT_SYSTEMDATE}</code>
     * </td>
     * <td align="left">The Effective Date must be greater than the current system date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#EFFECTIVE_DATE_GREATER_THAN_OR_EQUAL_TO_CURRENT_SYSTEM_DATE EFFECTIVE_DATE_GREATER_THAN_OR_EQUAL_TO_CURRENT_SYSTEM_DATE}</code>
     * </td>
     * <td align="left">The Effective Date must be greater than or equal to the current system date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ORIGIN_DESTINATION_SAME ORIGIN_DESTINATION_SAME}</code>
     * </td>
     * <td align="left">Origin code and destination code should not be the same.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#IATA_PAIR_MUST_BE_1_TO_1_FOR_CLASS_RATING_TYPE_J IATA_PAIR_MUST_BE_1_TO_1_FOR_CLASS_RATING_TYPE_J}</code>
     * </td>
     * <td align="left">The IATA Area Pair must be 1-1 for Class Rating Type ‘J’.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#EITHER_PERCENTAGE_OR_RATE_MUST_BE_ENTERED_FOR_R_AND_J_CLASS_RATING_TYPE EITHER_PERCENTAGE_OR_RATE_MUST_BE_ENTERED_FOR_R_AND_J_CLASS_RATING_TYPE}</code>
     * </td>
     * <td align="left">Either Percentage or Rate must be entered for ‘R’ and ‘J’ Class Rating Types.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CURRENCY_CODE_DOES_NOT_EXIST CURRENCY_CODE_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Currency Code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * CURRENCY_MUST_HAVE_ROUNDING_FACTOR_AND_DECIMAL CURRENCY_MUST_HAVE_ROUNDING_FACTOR_AND_DECIMAL}</code></td>
     * <td align="left">The currency code must have the rounding factor and decimal position.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * NUMBER_OF_DECIMAL_IN_RATE_AND_CURRENCY_MUST_SAME NUMBER_OF_DECIMAL_IN_RATE_AND_CURRENCY_MUST_SAME}</code>
     * </td>
     * <td align="left">The number of decimals in Rate must be same as Number of Decimals for the Currency.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_MUST_BE_ROUNDED_OFF RATE_MUST_BE_ROUNDED_OFF}</code>
     * </td>
     * <td align="left">The Rate must be rounded off to Rounding Factor of Currency.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * CARRIER_CODE_YYY_IS_PROHIBITED_FOR_JOINT_EXCEPTION_RATING CARRIER_CODE_YYY_IS_PROHIBITED_FOR_JOINT_EXCEPTION_RATING}</code>
     * </td>
     * <td align="left">The Carrier Code ‘YYY’ is prohibited for Joint Exception Rating.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * RULE_TYPE_MUST_BE_A_OR_X_FOR_R_OR_J_WITH_ATPCO RULE_TYPE_MUST_BE_A_OR_X_FOR_R_OR_J_WITH_ATPCO}</code></td>
     * <td align="left">The Class Rating Rule Type must be A or X for ‘R’ or ‘J’</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#IATA_FOR_CLASS_MINIMUM_RATING IATA_FOR_CLASS_MINIMUM_RATING}</code>
     * </td>
     * <td align="left">The Class Rating Rule Type must be any one of the values N, U, O, A, P, E, X or Blank
     * for ‘R’ Class Rating Type with IATA convention Rate Source.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ATPCO_FOR_JOIN_CLASS_RATING ATPCO_FOR_JOIN_CLASS_RATING}</code>
     * </td>
     * <td align="left">The Class Rating Rule Type must be A or X for ‘R’ or ‘J’ Class Rating Types with ATPCO
     * convention Rate Source.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pClassRatingRulePersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRulePersistRequest
     *            ClassRatingRulePersistRequest}</code><br>
     *            holds the request object that includes attributes to create <code>ClassRatingRule</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDto
     *            ClassRatingRuleDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDto#setClassRatingId
     *            ClassRatingId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDto#setCarrierCode
     *            CarrierCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDto#setRateSource
     *            RateSource} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDto#setClassRatingRulesEntryDtos
     *            ClassRatingRulesEntryDtos}</code></li>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setActionType
     *            actionType} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setAmount
     *            amount} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setBiDirectionalIndicator
     *            biDirectionalIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setClassRatingType
     *            classRatingType} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setCurrencyCode
     *            currencyCode} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setDateRangeDto
     *            dateRangeDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.utility.ContractUtility.DateRangeDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.utility.ContractUtility.DateRangeDto#setExpirationDate
     *            expirationDate} - (O) </code></li>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setDestination
     *            destination} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setError
     *            error} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setIataAreaCodeFrom
     *            iataAreaCodeFrom} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setIataAreaCodeTo
     *            iataAreaCodeTo} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setIataDispPriority
     *            iataDispPriority} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setMinimumWeight
     *            minimumWeight} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setOId
     *            oId} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setOriDstDisplayPriority
     *            oriDstDisplayPriority} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setOrigin
     *            origin} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setPercentage
     *            percentage} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setRateTypeCode
     *            rateTypeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setRateTypePriority
     *            rateTypePriority} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setRatingRuleType
     *            ratingRuleType} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setRuleReference
     *            ruleReference} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setWeightUnit
     *            weightUnit} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setUserAudit
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
     *            <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleResponse
     *         ClassRatingRuleResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CLASS_RATING_RULE_IS_CREATED
     *         CLASS_RATING_RULE_IS_CREATED} </code> <br>
     *         <code>for successful create.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleResponse#getClassRatingRuleDto
     *         ClassRatingRuleDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto
     *         ClassRatingRuleEntryDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */

    ClassRatingRuleResponse createClassRatingRule(
                ClassRatingRulePersistRequest pClassRatingRulePersistRequest)
                throws LMSException;

    /**
     * Deletes the ClassRatingRule.
     * <p>
     * This function deletes the ClassRatingRule for Class Rating ID, Carrier code and Rate Source.
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CLASS_RATING_RULE_DOES_NOT_EXIST_IN_THE_SYSTEM CLASS_RATING_RULE_DOES_NOT_EXIST_IN_THE_SYSTEM}</code>
     * </td>
     * <td align="left">Class Rating Rule does not exists.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CLASS_RATING_RULE_EFFECTIVE_CANT_BE_DELETED CLASS_RATING_RULE_EFFECTIVE_CANT_BE_DELETED}</code>
     * </td>
     * <td align="left">Class Rating Rule cannot be deleted.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pClassRatingRuleDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDeleteRequest
     *            ClassRatingRuleDeleteRequest}</code><br>
     *            includes the attributes to delete an <code>class rating rule</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDto
     *            ClassRatingRuleDto} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDto#setOId
     *            oId}</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleResponse
     *         ClassRatingRuleResponse}</code>
     *         <ul>
     *         ClassRatingRuleResponse <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants #CLASS_RATING_RULE_IS_DELETED
     *         CLASS_RATING_RULE_IS_DELETED} </code> for successful delete. <li> <code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleResponse #getClassRatingRuleDto()
     *         ClassRatingRuleDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDto
     *         ClassRatingRuleDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the class rating rule delete operation fails, the above
     *             mentioned error codes are returned. Each CodeMessage contains
     *             the status code, human readable message, and message type.
     */

    ClassRatingRuleResponse deleteClassRatingRule(
                ClassRatingRuleDeleteRequest pClassRatingRuleDeleteRequest)
                throws LMSException;

    /**
     * It find the carriers which have the class rating rules based on the given
     * class rating id and rate source.
     * <p>
     * This method returns a ClassRatingRuleEntry. The returned ClassRatingRuleFindDto will contain:
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.ClassRatingRuleService#findClassRatingRule
     * findClassRatingRule}<br>
     * <p>
     * To find the Carrier with Class Rating Rule user must provide following input:<br>
     * <li>Class Rating Id.<br>
     * <li>Rate Source.<br>
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
     * @param pClassRatingRuleCarrierRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleCarrierRequest
     *            ClassRatingRuleCarrierRequest}</code><br>
     *            includes the attributes to find a <code>ClassRatingRule </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDto
     *            ClassRatingRuleDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleFindDto#setClassRatingId
     *            ClassRatingId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleFindDto#setCarrierCode
     *            CarrierCode} - (O)</code> </li>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleCarrierResponse
     *         ClassRatingRuleCarrierResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleCarrierResponse#getCarrierDtos()
     *         CarrierDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleFindDto
     *         ClassRatingRuleFindDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */

    ClassRatingRuleCarrierResponse findCarriersWithClassRatingRule(
                ClassRatingRuleCarrierRequest pClassRatingRuleCarrierRequest)
                throws LMSException;

    /**
     * Retrieves all the class rating rules that exist in the system for the
     * Class rating id, carrier code and Rate source combination.
     * <p>
     * The following inputs could be given as filter:
     * <li>Rate Source <br>
     * <p>
     * Rate Source can be given as a filter to retrieve the specific class rating rule that applies to the
     * class rating id, carrier code and rate source.
     * <p>
     * 
     * <b> Related methods include:</b><br>
     * 
     * {@link com.unisys.trans.logistics.lms.rating.contract.ClassRatingRuleService #findCarriersWithClassRatingRule
     * findCarriersWithClassRatingRule}<br>
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#INPUT_CLASS_RATING_ID_VERSION_DOES_NOT_EXIST INPUT_CLASS_RATING_ID_VERSION_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">The input Class Rating ID does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_DOES_NOT_EXISTS RATE_SOURCE_DOES_NOT_EXISTS}</code>
     * </td>
     * <td align="left">RateSource does not exists.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CARRIER_CODE_DOES_NOT_EXIST CARRIER_CODE_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">The Carrier Code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CLASS_RATING_RULE_DOESNOT_EXIST_FOR_INPUT_AND_FILTER_COMBINATION 
     * CLASS_RATING_RULE_DOESNOT_EXIST_FOR_INPUT_AND_FILTER_COMBINATION}</code></td>
     * <td align="left">The class rating rule does not exist for the Input and Filter combination.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * 
     * @param pClassRatingRuleFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleFindRequest
     *            ClassRatingRuleFindRequest}</code><br>
     *            includes the attributes to find an <code>class rating rule </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleFindDto
     *            ClassRatingRuleFindDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleFindDto#setClassRatingId
     *            classRatingId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleFindDto#setCarrierCode
     *            carrierCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleFindDto#setRateSource
     *            rateSource} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleFindDto#setIataAreaFrom
     *            iataAreaFrom} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleFindDto#setIataAreaTo
     *            iataAreaTo} - (O)</code> </li>
     *            </ul>
     *            </ul>
     *            <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleResponse
     *         ClassRatingRuleResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleResponse#getClassRatingRuleDto
     *         classRatingRuleDto} - (1:*) </ul> </code>
     *         <p>
     * 
     * @throws LMSException
     *             If the find operation fails, the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */

    ClassRatingRuleResponse findClassRatingRule(
                ClassRatingRuleFindRequest pClassRatingRuleFindRequest)
                throws LMSException;

    /**
     * Updates an <code>class rating rule</code> for a specific ,after
     * validating all the input data.
     * <p>
     * <b>Related Method :</b>
     * {@link com.unisys.trans.logistics.lms.rating.contract.ClassRatingRuleService#findClassRatingRule
     * findClassRatingRule}
     * <p>
     * To update ClassRatingRule user must provide following input:<br>
     * <li>ClassRatingId. <br>
     * <li>CarrierCode. <br>
     * <li>RateSource.<br>
     * <li>oId.<br>
     * <li>classRatingRuleDtos.<br>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CLASS_RATING_RULE_DOESNOT_EXIST_FOR_INPUT_AND_FILTER_COMBINATION CLASS_RATING_RULE_DOESNOT_EXIST_FOR_INPUT_AND_FILTER_COMBINATION}</code>
     * </td>
     * <td align="left">The class rating rule does not exist for the Input and Filter combination.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#EFFECTIVE_RULE_MUST_NOT_BE_UPDATED EFFECTIVE_RULE_MUST_NOT_BE_UPDATED}</code>
     * </td>
     * <td align="left">The effective rule must not be updated.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CLASS_RATING_ID_MARKED_FOR_DELETION CLASS_RATING_ID_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">Class Rating Id is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CLASS_RATING_ID_MUST_BE_VALID CLASS_RATING_ID_MUST_BE_VALID}</code>
     * </td>
     * <td align="left">Class Rating Id does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CARRIER_CODE_DOES_NOT_EXIST CARRIER_CODE_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Carrier Code does not exist in the system</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CARRIER_CODE_MARKED_FOR_DELETION CARRIER_CODE_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">Carrier Code is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_DOES_NOT_EXISTS RATE_SOURCE_DOES_NOT_EXISTS}</code>
     * </td>
     * <td align="left">Rate Source does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_MARKED_FOR_DELETION RATE_SOURCE_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">Rate Source is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_RATECODE_DOES_NOT_EXIST RATETYPE_RATECODE_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Rate Type code does not exist.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_TYPE_MARKED_FOE_DELETION RATE_TYPE_MARKED_FOE_DELETION}</code>
     * </td>
     * <td align="left">Rate Type is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#AIRPORT_MARKED_FOR_DELETION AIRPORT_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">Airport is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CITY_CODE_DOES_NOT_EXIST CITY_CODE_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">City code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CITY_CODE_MARKED_FOR_DELETION CITY_CODE_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">City code is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#AGGREGATE_DOES_NOT_EXIST AGGREGATE_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Aggregate does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#AGGREGATE_MARKED_FOR_DELETION AGGREGATE_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">Aggregate is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#EFFECTIVEDATE_GREATER_THAN_CURRENT_SYSTEMDATE EFFECTIVEDATE_GREATER_THAN_CURRENT_SYSTEMDATE}</code>
     * </td>
     * <td align="left">The Effective Date must be greater than the current system date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#EFFECTIVE_DATE_GREATER_THAN_OR_EQUAL_TO_CURRENT_SYSTEM_DATE EFFECTIVE_DATE_GREATER_THAN_OR_EQUAL_TO_CURRENT_SYSTEM_DATE}</code>
     * </td>
     * <td align="left">The Effective Date must be greater than or equal to the current system date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ORIGIN_DESTINATION_SAME ORIGIN_DESTINATION_SAME}</code>
     * </td>
     * <td align="left">Origin code and destination code should not be the same.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#IATA_PAIR_MUST_BE_1_TO_1_FOR_CLASS_RATING_TYPE_J IATA_PAIR_MUST_BE_1_TO_1_FOR_CLASS_RATING_TYPE_J}</code>
     * </td>
     * <td align="left">The IATA Area Pair must be 1-1 for Class Rating Type ‘J’.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#EITHER_PERCENTAGE_OR_RATE_MUST_BE_ENTERED_FOR_R_AND_J_CLASS_RATING_TYPE EITHER_PERCENTAGE_OR_RATE_MUST_BE_ENTERED_FOR_R_AND_J_CLASS_RATING_TYPE}</code>
     * </td>
     * <td align="left">Either Percentage or Rate must be entered for ‘R’ and ‘J’ Class Rating Types.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CURRENCY_CODE_DOES_NOT_EXIST CURRENCY_CODE_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Currency Code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * CURRENCY_MUST_HAVE_ROUNDING_FACTOR_AND_DECIMAL CURRENCY_MUST_HAVE_ROUNDING_FACTOR_AND_DECIMAL}</code></td>
     * <td align="left">The currency code must have the rounding factor and decimal position.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * NUMBER_OF_DECIMAL_IN_RATE_AND_CURRENCY_MUST_SAME NUMBER_OF_DECIMAL_IN_RATE_AND_CURRENCY_MUST_SAME}</code>
     * </td>
     * <td align="left">The number of decimals in Rate must be same as Number of Decimals for the Currency.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_MUST_BE_ROUNDED_OFF RATE_MUST_BE_ROUNDED_OFF}</code>
     * </td>
     * <td align="left">The Rate must be rounded off to Rounding Factor of Currency.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * CARRIER_CODE_YYY_IS_PROHIBITED_FOR_JOINT_EXCEPTION_RATING CARRIER_CODE_YYY_IS_PROHIBITED_FOR_JOINT_EXCEPTION_RATING}</code>
     * </td>
     * <td align="left">The Carrier Code ‘YYY’ is prohibited for Joint Exception Rating.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * RULE_TYPE_MUST_BE_A_OR_X_FOR_R_OR_J_WITH_ATPCO RULE_TYPE_MUST_BE_A_OR_X_FOR_R_OR_J_WITH_ATPCO}</code></td>
     * <td align="left">The Class Rating Rule Type must be A or X for ‘R’ or ‘J’</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#IATA_FOR_CLASS_MINIMUM_RATING IATA_FOR_CLASS_MINIMUM_RATING}</code>
     * </td>
     * <td align="left">The Class Rating Rule Type must be any one of the values N, U, O, A, P, E, X or Blank
     * for ‘R’ Class Rating Type with IATA convention Rate Source.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ATPCO_FOR_JOIN_CLASS_RATING ATPCO_FOR_JOIN_CLASS_RATING}</code>
     * </td>
     * <td align="left">The Class Rating Rule Type must be A or X for ‘R’ or ‘J’ Class Rating Types with ATPCO
     * convention Rate Source.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pClassRatingRulePersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRulePersistRequest
     *            ClassRatingRulePersistRequest}</code><br>
     *            includes the attributes to update a <code>ClassRatingRule </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDto
     *            ClassRatingRuleDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDto#setClassRatingId
     *            ClassRatingId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDto#setCarrierCode
     *            CarrierCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDto#setRateSource
     *            RateSource} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDto#setClassRatingRulesEntryDtos
     *            ClassRatingRulesEntryDtos}</code></li>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setActionType
     *            actionType} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setAmount
     *            amount} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setBiDirectionalIndicator
     *            biDirectionalIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setClassRatingType
     *            classRatingType} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setCurrencyCode
     *            currencyCode} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setDateRangeDto
     *            dateRangeDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.utility. ContractUtility.DateRangeDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.utility. ContractUtility.DateRangeDto#setExpirationDate
     *            expirationDate} - (O) </code></li>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setDestination
     *            destination} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setError
     *            error} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setIataAreaCodeFrom
     *            iataAreaCodeFrom} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setIataAreaCodeTo
     *            iataAreaCodeTo} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setIataDispPriority
     *            iataDispPriority} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setMinimumWeight
     *            minimumWeight} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setOId
     *            oId} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setOriDstDisplayPriority
     *            oriDstDisplayPriority} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setOrigin
     *            origin} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setPercentage
     *            percentage} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setRateTypeCode
     *            rateTypeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setRateTypePriority
     *            rateTypePriority} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setRatingRuleType
     *            ratingRuleType} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setRuleReference
     *            ruleReference} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setWeightUnit
     *            weightUnit} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto#setUserAudit
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
     *            <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleResponse
     *         ClassRatingRuleResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants. MessageConstants#CLASS_RATING_RULE_IS_UPDATED
     *         CLASS_RATING_RULE_IS_UPDATED} </code> <br>
     *         <code>for successful update.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleResponse#getClassRatingRuleDto()
     *         ClassRatingRuleDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto
     *         ClassRatingRuleEntryDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     * 
     */
    ClassRatingRuleResponse updateClassRatingRule(
                ClassRatingRulePersistRequest pClassRatingRulePersistRequest)
                throws LMSException;

}
