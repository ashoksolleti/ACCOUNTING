/* ====================================== */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.constants;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.exception.CodeMessage;
/**
 * <code>MessageConstants</code> class maintains a list of message constants.<br>
 */
public final class MessageConstants {

    /**
     * This constant is used to verify if the airline exists in the system.
     * <p>
     * Value = {@value}
     */
    public static final int AIRLINE_DOES_NOT_EXIST = 62;

    /**
     * This constant is used to verify the ClassRating Id OID.
     * <p>
     * The class rating ID Classification is Mandatory.
     * <p>
     * value = {@value}
     */

    public static final int CLASS_RATING_ID_CLASSIFICATION_MADANTORY = 631;

    /**
     * This constant is used to specify that the ClassRating Id creation
     * operation is successful.
     * <p>
     * The class rating ID is created.
     * <p>
     * value={@value}
     */

    public static final int CLASS_RATING_ID_CREATED_SUCCESSFULLY = 624;

    /**
     * This constant is used to verify the ClassRating Id.
     * <p>
     * The ClassRating Id description must be an alphanumeric of size 1-5000.
     * <p>
     * value = {@value}
     */
    public static final int CLASS_RATING_ID_DESCRIPTION_ALPHANMERIC_AND_WITHIN_5000_CHAR = 629;

    /**
     * This constant is used to verify whether the Description of ClassRating Id
     * is present in the request.
     * <p>
     * The Description of class rating ID is mandatory.
     * <p>
     * Value = {@value}
     */

    public static final int CLASS_RATING_ID_DESCRIPTION_MADANTORY = 607;

    /**
     * This constant is used to verify if the classRating Id mandatory.
     * <p>
     * The Class Rating ID is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int CLASS_RATING_ID_MADANTORY = 601;

    /**
     * This constant is used to verify if the ClassRating Id retrieved from the
     * system is marked for deletion.
     * <p>
     * The class rating ID is marked for deletion.
     * <p>
     * Value = {@value}
     */

    public static final int CLASS_RATING_ID_MARKED_FOR_DELETION = 623;

    /**
     * This constant is used to verify if the ClassRating Id retrieved from the
     * system is marked for deletion and cannot able to do update operation.
     * <p>
     * The class rating ID that is marked for deletion must not be updated.
     * <p>
     * Value = {@value}
     */

    public static final int CLASS_RATING_ID_MARKED_FOR_DELETION_CANNOT_UPDATE = 617;

    /**
     * This constant is used to verify the ClassRating Id object.
     * <p>
     * The class rating ID Object is invalid.
     * <p>
     * value = {@value}
     */
    public static final int CLASS_RATING_ID_OBJECT_INVALID = 630;

    /**
     * This constant is used to specify that the ClassRating Id Restore
     * operation is successful.
     * <p>
     * The class rating ID is restored.
     * <p>
     * value={@value}
     */

    public static final int CLASS_RATING_ID_RESTORED_SUCCESSFULLY = 625;

    /**
     * This constant is used to verify the ClassRating Id.
     * <p>
     * The ClassRating Id must be an alphanumeric of size 3-6 with first 2 characters being alphabets.
     * <p>
     * value = {@value}
     */

    public static final int CLASS_RATING_ID_THREE_TO_SIX_CHAR_ALPHANUMERIC = 602;

    /**
     * This constant is used to specify that the ClassRating Id version creation
     * operation is successful.
     * <p>
     * New version for the class rating ID is created.
     * <p>
     * value={@value}
     */

    public static final int CLASS_RATING_ID_VERSION_CREATED_SUCCESSFULLY = 626;

    /**
     * This constant is used to verify that given ClassRating Id version exists
     * for the given input date
     * <p>
     * The ClassRating Id version does not exist in the system for the given date.
     * <p>
     * value = {@value}
     */
    public static final int CLASS_RATING_ID_VERSION_DOES_NOT_EXIST_FOR_INPUT_DATE = 621;

    /**
     * This constant is used to verify that given ClassRating Id version object
     * is valid or not.
     * <p>
     * The ClassRating Id version object is invalid.
     * <p>
     * value = {@value}
     */

    public static final int CLASS_RATING_ID_VERSION_OBJECT_INVALID = 633;

    /**
     * This constant is used to specify that the ClassRating Id version purge
     * operation is successful.
     * <p>
     * value={@value}
     */
    public static final int CLASS_RATING_ID_VERSION_PURGED_SUCCESSFULLY = 628;

    /**
     * This constant is used to specify that the ClassRating Id version update
     * operation is successful.
     * <p>
     * The class rating ID version is updated.
     * <p>
     * value={@value}
     */
    public static final int CLASS_RATING_ID_VERSION_UPDATED_SUCCESSFULLY = 627;

    /**
     * This constant is used to acknowledge that commodity create transaction is
     * successful.
     * <p>
     * Commodity created successfully.<br>
     * </p>
     */
    public static final int COMMODITY_ACK_CREATED = 302;

    /**
     * This constant is used to acknowledge that commodity is marked for
     * deletion.
     * <p>
     * Commodity involved in current transaction is marked for deletion.<br>
     * </p>
     */
    public static final int COMMODITY_EFFECTIVE_DATE_MANDATORY = 303;

    /**
     * This constant is used to acknowledge that The Commodity is marked for
     * deletion.
     * <p>
     * Commodity involved in current transaction is marked for deletion.<br>
     * </p>
     */
    public static final int COMMODITY_ACK_MARKED_FOR_DELETION = 295;

    /**
     * This constant is used to acknowledge that commodity restore transaction
     * is successful.
     * <p>
     * Commodity restored successfully.<br>
     * </p>
     */
    public static final int COMMODITY_ACK_RESTORE_SUCCESSFUL = 305;

    /**
     * This constant is used to acknowledge that commodity update transaction is
     * successful.
     * <p>
     * Commodity updated successfully.<br>
     * </p>
     */
    public static final int COMMODITY_ACK_UPDATE_SUCCESSFUL = 304;

    /**
     * This constant is used to validate the content of Commodity, while create.
     * <p>
     * Failed when commodity number and type already exists, while create.<br>
     * </p>
     */
    public static final int COMMODITY_ALREADY_EXISTS = 285;

    /**
     * This constant is used to verify the content of end date/delete date.
     * <p>
     * Failed while trying to delete commodity that is already marked for deletion.<br>
     * </p>
     */
    public static final int COMMODITY_ALREADY_MARKED_FOR_DELETION = 311;

    /**
     * This constant is used to validate the content for commodity.
     * <p>
     * Failed when commodity version being updated is already in effect.<br>
     * </p>
     */
    public static final int COMMODITY_CANNOT_UPDATE_CREATE_NEW_VERSION = 292;

    /**
     * This constant is used to validate the BR8 rule for commodity.
     * <p>
     * Failed when a user tries to udpate a history version.<br>
     * </p>
     */
    public static final int COMMODITY_CANNOT_UPDATE_HISTORY_VERSION = 293;

    /**
     * This constant is used to validate the content of Commodity Code.
     * <p>
     * Failed when Commodity Code supplied does not exist in the database.<br>
     * </p>
     */
    public static final int COMMODITY_CODE_DOES_NOT_EXIST = 278;

    /**
     * This constant is used to validate the content of Commodity Code, while
     * Create or Update process.
     * <p>
     * Failed when Commodity Code supplied does not exist.<br>
     * </p>
     */
    public static final int COMMODITY_CODE_INVALID = 282;

    /**
     * This constant is used to verify the type and size of Commodity Code.
     * <p>
     * Failed when Commodity Code supplied does not adhere to valid format (4N/4N1A).<br>
     * </p>
     */
    public static final int COMMODITY_CODE_INVALID_FORMAT = 277;

    /**
     * This constant is used to verify the usage of Commodity Code, while
     * retrieving.
     * <p>
     * Failed when Commodity Code is not supplied while retrieving.<br>
     * </p>
     */
    public static final int COMMODITY_CODE_MANDATORY = 276;

    /**
     * This constant is used to verify the usage of Commodity Code, while Create
     * or Update process.
     * <p>
     * Failed when Commodity Code is not supplied while creating or updating a commodity.<br>
     * </p>
     */
    public static final int COMMODITY_CODE_MANDATORY_VOC = 281;

    /**
     * This constant is used to validate the content if the Commodity Code is
     * marked for deletion.
     * <p>
     * Failed when Commodity Code supplied is marked for deletion.<br>
     * </p>
     */
    public static final int COMMODITY_CODE_MARKED_FOR_DELETION = 279;

    /**
     * This constant is used to validate the usage/type of Delete Date.
     * <p>
     * Failed when delete date format is not valid(DDMMMYY).<br>
     * </p>
     */
    public static final int COMMODITY_DELETE_DATE_FORMAT = 298;

    /**
     * This constant is used to validate the usage of delete date.
     * <p>
     * Failed when delete date is not supplied, during delete operation.<br>
     * </p>
     */
    public static final int COMMODITY_DELETE_DATE_MANDATORY = 297;

    /**
     * This constant is used to validate the content of Delete Date.
     * <p>
     * Failed when delete date supplied is not today or later.<br>
     * </p>
     */
    public static final int COMMODITY_DELETE_DATE_T_OR_L = 299;

    /**
     * This constant is used to verify description length exceeds the maximum
     * allowed.
     * <p>
     * Failed while trying to create commodity description length exceeds the maximum allowed.<br>
     * </p>
     */
    public static final int COMMODITY_DESCRIPTION_INVALID = 314;

    /**
     * This constant is used to validate the content for Description.
     * <p>
     * Failed when description is not supplied by the user, while create or update.<br>
     * </p>
     */
    public static final int COMMODITY_DESCRIPTION_MANDATORY = 290;

    /**
     * This constant is used to validate the BR7 rule for Effective Date.
     * <p>
     * Failed when effecitve date supplied is not greater than current date and parameter allowable effective
     * date is 0.<br>
     * </p>
     */
    public static final int COMMODITY_EFFECTIVE_DATE_GT_CURRENT_DATE = 287;

    /**
     * This constant is used to validate the BR7 rule for Effective Date.
     * <p>
     * Failed when effecitve date supplied is not greater than or equal to current date and parameter
     * allowable effective date is 1.<br>
     * </p>
     */
    public static final int COMMODITY_EFFECTIVE_DATE_GT_OR_E_CURRENT_DATE = 288;

    /**
     * This constant is used to validate the content BR4 rule for Effective
     * Date.
     * <p>
     * Failed when effecitve date supplied is not greater than previous versions effective date.<br>
     * </p>
     */
    public static final int COMMODITY_EFFECTIVE_DATE_GT_PREV_VERSION = 289;

    /**
     * This constant is used to verify whether the commodity entity already
     * exists.
     * <p>
     * Failed since the entity already exists.<br>
     * </p>
     */
    public static final int COMMODITY_ENTITY_ALREADY_EXIST = 285;

    /**
     * This constant is used to validate the usage/type of Effective Date.
     * <p>
     * Failed when effecitve date format is not valid(DDMMMYY).<br>
     * </p>
     */
    public static final int COMMODITY_INVALID_EFFECTIVE_DATE_FORMAT = 286;

    /**
     * This constant is used to verify the Commodity.
     * <p>
     * Failed because of invalid commodity object instance.<br>
     * </p>
     */
    public static final int COMMODITY_INVALID_OBJECT_INSTANCE = 306;

    /**
     * This constant is used to validate the content for commodity.
     * <p>
     * Failed when commodity being updated is marked for deletion.<br>
     * </p>
     */
    public static final int COMMODITY_MARKED_FOR_DEL_CANNOT_UPDATE = 294;

    /**
     * This constant is used to validate the content for commodity.
     * <p>
     * Failed when commodity being updated is marked for deletion.<br>
     * </p>
     */
    public static final int COMMODITY_MARKED_FOR_DELETION = 291;

    /**
     * This constant is used to validate the content of commodity, during find
     * operation.
     * <p>
     * Failed when no data found based on search criteria.<br>
     * </p>
     */
    public static final int COMMODITY_NO_DATA_FOUND = 301;

    /**
     * This constant is used to verify the content of end date.
     * <p>
     * Failed while trying to restore commodity not marked for deletion.<br>
     * </p>
     */
    public static final int COMMODITY_NOT_MARKED_FOR_DELETION = 312;

    /**
     * This constant is used to verify whether the commodity object exists.
     * <p>
     * Failed since the object does not exist.<br>
     * </p>
     */
    public static final int COMMODITY_OBJECT_DOES_NOT_EXIST = 278;

    /**
     * This constant is used to verify the Search Text should be 1-25 charactes.
     * <p>
     * Failed while trying to search commodity with more than 25 characters.<br>
     * </p>
     */
    public static final int COMMODITY_SEARCH_TEXT_INVALID = 313;

    /**
     * This constant is used to validate the usage of search text.
     * <p>
     * Failed when search text is not entered by the user.<br>
     * </p>
     */
    public static final int COMMODITY_SEARCH_TEXT_MANDATORY = 296;

    /**
     * This constant is used to verify the Commodity Type Exist or Not.
     * <p>
     * Failed because commodity type supplied by the user does not exist in the system.<br>
     * </p>
     */
    public static final int COMMODITY_TYPE_DOES_NOT_EXIST = 310;

    /**
     * This constant is used to validate the content of Commodity Type, during
     * delete operation.
     * <p>
     * Failed due to incorrect selection of commodity type of a Commodity Code.<br>
     * </p>
     */
    public static final int COMMODITY_TYPE_I_OR_D = 300;

    /**
     * This constant is used to validate the content of Commodity Type.
     * <p>
     * Failed due to incorrect selection of commodity type of a Commodity Code.<br>
     * </p>
     */
    public static final int COMMODITY_EXPIRATION_DATE_GREATER_THAN_EFFECTIVE_DATE = 280;

    /**
     * This constant is used to validate the content of Commodity Type, while
     * create or update.
     * <p>
     * Failed due to incorrect selection of commodity type of a Commodity Code.<br>
     * </p>
     */
    public static final int COMMODITY_TYPE_INVALID_I_OR_D = 283;

    /**
     * This constant is used to validate the usage of Commodity Type, while
     * create or update.
     * <p>
     * Failed when commodity type is not supplied by the user.<br>
     * </p>
     */
    public static final int COMMODITY_TYPE_MANDATORY = 284;

    /**
     * This constant is used to verify the Commodity Version.
     * <p>
     * Failed because commodity version details not present while purging<br>
     * </p>
     */
    public static final int COMMODITY_VERSION_DOES_NOT_EXIST = 315;

    /**
     * This constant is used to verify the Commodity Version.
     * <p>
     * Failed because of invalid commodity version object instance.<br>
     * </p>
     */
    public static final int COMMODITY_VERSION_INVALID_OBJECT_INSTANCE = 307;

    /**
     * This constant is used to verify the Commodity Version.
     * <p>
     * Failed because commodity version details not present, while create or update.<br>
     * </p>
     */
    public static final int COMMODITY_VERSION_MANDATORY = 308;

    /**
     * This constant is used to verify the Commodity Version Details.
     * <p>
     * Failed because commodity object contains multiple version objects, during create or update.<br>
     * </p>
     */
    public static final int COMMODITY_VERSION_ONE_OBJECT_ONLY = 309;

    /**
     * This Constant is used to specify if the Commodity new version created
     * successfully.
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_NEW_VERSION_CREATED = 317;

    /**
     * This Constant is used to specify if the Commodity is purged successfully.
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_VERSION_PURGED = 316;

    /**
     * This constant is used to verify whether the currency end date is in
     * between rates effective date and end date.
     * <p>
     * Value = {@value}
     */
    public static final int CURRENCY_END_DATE_IS_IN_BETWEEN_EFFECTIVE_AND_END_DATE_OF_THE_RATES = 457;

    /**
     * This constant is used to verify if the currency is in effect.
     * <p>
     * Value = {@value}
     */
    public static final int CURRENCY_MARKED_FOR_DELETION = 445;

    /**
     * This constant is used to verify whether the Deletion date is present in
     * the request to delete the ClassRating Id in the system.
     * <p>
     * The Deletion Date is mandatory for Delete action.
     * <p>
     * Value = {@value}
     */

    public static final int DELETION_DATE_FOR_DELETING_CLASS_RATING_ID_MADANTORY = 608;

    /**
     * This constant is used to verify if the ClassRating Id expiration date is
     * of format DDMMMYY.
     * <p>
     * The Deletion Date must be of the format DDMMMYY.
     * <p>
     * Value = {@value}
     */

    public static final int DELETION_DATE_FORMAT_INVALID = 609;

    /**
     * This constant is used to verify if the destination exists in the system.
     * <p>
     * Destination can be a valid area, sub area, region, country, city, or aggregate.
     * <p>
     * Value = {@value}
     */
    public static final int DESTINATION_DOES_NOT_EXIST = 65;

    /**
     * This constant is used to verify if the ClassRating Id effective date is
     * of format DDMMMYY.
     * <p>
     * The Effective Date must be of format DDMMMYY.
     * <p>
     * Value = {@value}
     */
    public static final int EFFECTIVE_DATE_FORMAT_INVALID = 603;

    /**
     * This constant is used to verify if the effective date is greater than or
     * equal to current system date.
     * <p>
     * Value = {@value}
     */
    public static final int EFFECTIVE_DATE_GREATER_THAN_OR_EQUAL_TO_CURRENT_SYSTEM_DATE = 518;

    /**
     * This constant is used to verify if the effective date mandatory.
     * <p>
     * The Effective Date is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int EFFECTIVE_DATE_MADANTORY = 604;

    /**
     * This constant is used to verify if the effective date is greater than or
     * equal to the current system date. (When the ‘Allowable Effective Date’
     * dynamic parameter value is 1)
     * <p>
     * The Effective Date must be greater than or equal to the current system date.
     * <p>
     * Value = {@value}
     */
    public static final int EFFECTIVE_DATE_MUST_BE_GREATER_OR_EQUAL_TO_CURR_SYS_DATE = 614;

    /**
     * This constant is used to verify if the effective date is greater than
     * current system date. (When the ‘Allowable Effective Date’ dynamic
     * parameter value is 0)
     * <p>
     * The Effective Date must be greater than the current system date.
     * <p>
     * Value = {@value}
     */

    public static final int EFFECTIVE_DATE_MUST_BE_GREATER_THAN_CURR_SYS_DATE = 615;

    /**
     * This constant is used to verify whether the currency end date is after
     * rates effective date.
     * <p>
     * Value = {@value}
     */
    public static final int EFFECTIVE_DATE_OF_THE_RATE_IS_AFTER_CURRENCY_END_DATE = 456;

    /**
     * This Constant is used to check if the rating note effective date is
     * lesser than previous version effective date.
     * <p>
     * Value = {@value}
     */
    public static final int EFFECTIVE_LESSER_THAN_PREV_VERSION_EFFECTIVE = 534;

    /**
     * This constant is used to verify the effective tax rate.
     * <p>
     * Value = {@value}
     */
    public static final int EFFECTIVE_TAX_RATE_CONT_UPDATE = 228;

    /**
     * This constant is used to verify if the effective date is greater than
     * current system date.
     * <p>
     * Value = {@value}
     */
    public static final int EFFECTIVEDATE_GREATER_THAN_CURRENT_SYSTEMDATE = 519;

    /**
     * This constant is used to verify if the ClassRating Id expiration date is
     * of format DDMMMYY.
     * <p>
     * The Expiration Date must be of format DDMMMYY.
     * <p>
     * Value = {@value}
     */
    public static final int EXPIRATION_DATE_FORAMT_INVALID = 605;

    /**
     * This constant is used to verify the expired tax rate.
     * <p>
     * Value = {@value}
     */
    public static final int EXPIRED_TAX_RATE_CONT_UPDATE = 229;

    /**
     * This constant is used to verify if the expiration date mandatory.
     * <p>
     * The Expiration Date is mandatory.
     * <p>
     * Value = {@value}
     */

    public static final int EXPIRTATION_DATE_MADANTORY = 606;

    /**
     * This Constant is used to check if rating note version expiration date is
     * greater than next versions expiration date.
     * <p>
     * Value = {@value}
     */
    public static final int EXPIRY_GREATER_THAN_NEXT_VERSION_EXPIRY = 533;

    /**
     * This constant is used to verify the ClassRating Id in the system.<br>
     * Failed because the ClassRating Id is already exist in the system.<br>
     * <p>
     * The input Class Rating ID already exists in the system.
     * <p>
     */

    public static final int INPUT_CLASS_RATING_ID_ALREADY_EXISTS = 611;

    /**
     * This constant is used to verify that given ClassRating Id exists.
     * <p>
     * The ClassRating Id does not exist in the system.
     * <p>
     * value = {@value}
     */

    public static final int INPUT_CLASS_RATING_ID_DOES_NOT_EXIST = 610;

    /**
     * This constant is used to verify that given ClassRating Id version exists.
     * <p>
     * The ClassRating Id version does not exist in the system.
     * <p>
     * value = {@value}
     */

    public static final int INPUT_CLASS_RATING_ID_VERSION_DOES_NOT_EXIST = 612;

    /**
     * This constant is used to verify the ClassRating Id.
     * <p>
     * Date is Madantory to retrieve the Class rating ID Version.
     * <p>
     * value = {@value}
     */

    public static final int INPUT_DATE_TO_RETRIEVE_CLASSRATING_ID_VERSION_MADANTORY = 632;

    /**
     * This constant is used to verify if the city end date is valid.
     * <p>
     * The Deletion Date must not precede current date. (The Deletion Date must be today or later and cannot
     * be greater than the number of days specified in the run time parameter -
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DAYS} .)
     * <p>
     * Value = {@value}
     */

    public static final int INPUT_DELETION_DATE_INVALID = 620;

    /**
     * This constant is used to verify that the input Effective Date is greater
     * than the Effective Date of existing class rating ID’s last version.
     * <p>
     * The input Effective Date must be greater than the Effective Date of existing class rating ID’s last
     * version.
     * <p>
     * value = {@value}
     */

    public static final int INPUT_EFFECTIVE_DATE_MUST_BE_GREATER_THAN_EFF_DATE_OF_LASTVERSION = 619;

    /**
     * This constant is used to verify if the effective date is overlapping with
     * the other date ranges of ClassRating Id.
     * <p>
     * The input Effective Date overlaps with other versions/date ranges of class rating ID.
     * <p>
     * Value = {@value}
     */

    public static final int INPUT_EFFECTIVE_DATE_OVERLAPS_WITH_OTHER_DATE_RANGES_OF_CLASS_RATING_ID = 613;

    /**
     * This constant is used to specify invalid date.
     * <p>
     * Value = {@value}
     */
    public static final int INVALID_DATE = 458;

    /**
     * This constant is used to verify if only the end date is updated for an
     * effective other charge rate.
     * <p>
     * Value = {@value}
     */
    public static final int ONLY_END_DATE_CAN_BE_UPDATED_FOR_THE_OTHERCHARGERATE = 423;

    /**
     * This constant is used to verify if the origin exists in the system.
     * <p>
     * Origin can be a valid area, sub area, region, country, city, or aggregate.
     * <p>
     * Value = {@value}
     */
    public static final int ORIGIN_DOES_NOT_EXIST = 64;

    /**
     * This constant is used to verify whether effective date of an other charge
     * rate is older than current date .
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHAGERATE_EFFECTIVE_DATE_OLDER_THAN_TODAY = 402;

    /**
     * This constant is used to verify whether effective date of an other charge
     * rate is older than tomorrow's date.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHAGERATE_EFFECTIVE_DATE_OLDER_THAN_TOMORROW = 403;

    /**
     * This constant is used to verify if an update to an old rate is triggered.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHAREGRATE_OLD_RATE_UPDATE_INVALID = 436;

    /**
     * This constant is used to verify the final upward limit for an additional
     * rate .
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_ADDITIONAL_RATE_FINAL_UPWARD_LIMIT_MUST_BE_SPACES = 415;

    /**
     * This constant is used to verify if the additional rate is defined when
     * there is an additional unit or part thereof is defined.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_ADDITIONAL_RATE_REQUIRED_WHEN_UNIT_IS_DEFINED = 447;

    /**
     * This constant is used to verify if the additional rate or additional unit
     * is entered when there is an upward limit defined.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_ADDITIONAL_RATE_REQUIRED_WHEN_UPWARD_LIMIT_IS_DEFINED = 450;

    /**
     * This constant is used to verify if the additional rates upward limits are
     * in ascending oder.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_ADDITIONAL_RATE_UPWARD_LIMIT_NOT_IN_ASCENDING_ORDER = 443;

    /**
     * This constant is used to verify additional rate can be provided or not.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_ADDITIONAL_RATES_PROHIBITED = 419;

    /**
     * This constant is used to verify whether additional rate is entered when
     * corresponding upward limit is entered.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_ADDITIONAL_UNIT_REQUIRED_WHEN_RATE_IS_DEFINED = 441;

    /**
     * This constant is used to verify the existence of the aggregate provided
     * in other charge rate information.
     * <p>
     * Value = {@value}
     */
    public static final int AGGREGATE_DOES_NOT_EXIST = 397;

    /**
     * This constant is used to verify whether the final break point upward
     * limit is blank or spaces for an other charge rate.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_BREAK_POINT_FINAL_UPWARD_LIMIT_MUST_BE_SPACES = 409;

    /**
     * This constant is used to verify the break point rate final upward limit.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_BREAK_POINT_FINAL_UPWARD_LIMIT_MUST_NOT_BE_SPACES = 414;

    /**
     * This constant is used to verify whether break point rate is entered when
     * corresponding upward limit is entered.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_BREAK_POINT_RATE_MANDATORY_WHEN_UPWARD_LIMIT_DEFINED = 440;

    /**
     * This constant is used to verify if the break point rates upward limits
     * are in ascending oder.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_BREAK_POINT_UPWARD_LIMIT_NOT_IN_ASCENDING_ORDER = 437;

    /**
     * This constant is used to verify break point unit for an other charge
     * rate.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_BREAKPOINTUNIT_NOT_REQUIRED_RATE_FIXED = 407;

    /**
     * This constant is used to verify the first rate mandate for the charges
     * per shipment piece table type.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_CHARGES_PER_SHIPMENT_PIECE_RATE_MANDATORY = 433;

    /**
     * This constant is used to verify whether other charge code is provided or
     * not as input.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_CODE_MANDATORY = 382;

    /**
     * This constant is used to verify whether the country given in the other
     * charge rate information exist or not.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_COUNTRY_DOES_NOT_EXIST = 395;

    /**
     * This Constant is used to specify if the OtherChargeRate is created
     * successfully.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_CREATE_SUCCESSFUL = 412;

    /**
     * This constant is used to verify if a currency can be updated for future
     * other charge rate.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_CURRENCY_CANNOT_BE_UPDATED = 438;

    /**
     * This constant is used to verify currency mandate when the geographical
     * location1 input is not a station or country.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_CURRENCY_ENTRY_MANDATORY = 444;

    /**
     * This constant is used to verify if date is inputted when other charge
     * code and other charge sub code is inputted for a search criteria.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_DATE_MANDATORY = 442;

    /**
     * This constant is used to verify the overlapping of effective date and end
     * date for an other charge rate.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_DATES_OVERLAP = 413;

    /**
     * This Constant is used to specify if the OtherChargeRate is deleted
     * successfully.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_DELETE_SUCCESSFUL = 418;

    /**
     * This constant is used to verify if the description can be changed during
     * an update operation.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_DESCRIPTION_CANNOT_BE_UPDATED = 453;

    /**
     * This constant is used to verify whether effective date is given or not as
     * input.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_EFFECTIVE_DATE_MANDATORY = 384;

    /**
     * This constant is used to verify whether end date of an other charge rate
     * is older than the effective date.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_END_DATE_OLDER_THAN_EFFECTIVE_DATE = 404;

    /**
     * This constant is used to verify whether geographic location2 is given or
     * not for a bidirection.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_GEOGRAPHIC_LOCATION2_MANDATORY_FOR_BIDIRECTION = 385;

    /**
     * This constant is used to verify if the geographical location is of valid
     * format.
     * <p>
     * The geographical location must be 1-7 alphanumeric.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_GEOGRAPHICAL_LOCATION_INVALID = 376;

    /**
     * This constant is used to verify if an iata area exist or not.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_IATA_AREA_DOES_NOT_EXIST = 425;

    /**
     * This constant is used to verify breakpoint type applicable for an other
     * charge rate.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_INVALID_BREAKPOINT_TYPE = 392;

    /**
     * This constant is used to verify maximum charge for an other charge rate.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_INVALID_CHARGE_OR_RATE = 390;

    /**
     * This constant is used to verify the currency code for an other charge
     * rate.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_INVALID_CURRENCYCODE = 387;

    /**
     * This constant is used to verify delete request for an other charge rate.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_INVALID_DELETE_REQUEST = 394;

    /**
     * This constant is used to verify the description given by the user.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_INVALID_DESCRIPTION = 386;

    /**
     * This constant is used to verify free hours applicable for an other charge
     * rate.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_INVALID_FREEHOURS = 388;

    /**
     * This constant is used to verify if inputted iata area is valid.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_INVALID_IATA_AREA = 428;

    /**
     * This constant is used to verify whether the OtherChargeRate object is
     * invalid or not.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_INVALID_OBJECT_INSTANCE = 380;

    /**
     * This constant is used to verify if the inputted region or aggregate is
     * valid.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_INVALID_REGION_OR_AGGREGATE = 430;

    /**
     * This constant is used to verify start time applicable for an other charge
     * rate.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_INVALID_STARTTIME = 389;

    /**
     * <p>
     * This constant is used to verify if the inputted station is valid.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_INVALID_STATION = 431;

    /**
     * This constant is used to verify if inputted sub area or country is valid.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_INVALID_SUB_AREA_OR_COUNTRY = 429;

    /**
     * This constant is used to verify uld group for the table type Rate per ULD
     * type.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_INVALID_ULD_GROUP = 393;

    /**
     * This constant is used to verify the break point units and upward limit
     * value applicable for an other charge rate.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_INVALID_UNITS_OR_UPTO = 391;

    /**
     * This constant is used to verify whether the upward limit for break point
     * rate or additional rate is zero or not.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_INVALID_UPTO_VALUE = 455;

    /**
     * This constant is used to verify whether other charge rate minimum is
     * greater than maximum charge.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_MINIMUM_CHARGE_GREATER_THAN_MAXIMUM_CHARGE = 406;

    /**
     * This constant is used to verify if any break point rates upward limit is
     * spaces other than the last rate.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_ONLY_LAST_UPWARD_LIMIT_SHOULD_BE_SPACES = 439;

    /**
     * This constant is used to verify the existence of the otherchargecode
     * provided in other charge rate information.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_OTHER_CHARGE_CODE_DOES_NOT_EXIST = 398;

    /**
     * This constant is used to verify if the other charge code is of valid
     * format.
     * <p>
     * The other charge code must be 2 alphabets.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_OTHER_CHARGE_CODE_INVALID = 377;

    /**
     * This constant is used to verify whether other charge code is present or
     * not, while providing other charge sub code.
     * <p>
     * The other charge code must be present when other charge sub code is provided.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_OTHER_CHARGE_CODE_REQUIRED = 379;

    /**
     * This constant is used to verify whether othercharge rate can be generated
     * or not for an other charge rate.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_OTHER_CHARGE_RATE_CANNOT_BE_GENERATED = 401;

    /**
     * This constant is used to verify the existence of the othercharge rate
     * provided in the other charge rate information.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_OTHER_CHARGE_RATE_NOT_FOUND = 400;

    /**
     * This constant is used to verify the existence of the othercharge sub code
     * provided in other charge rate information.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_OTHER_CHARGE_SUB_CODE_DOES_NOT_EXIST = 399;

    /**
     * This constant is used to verify if the other charge sub code is of valid
     * format.
     * <p>
     * The other charge sub code must be 1-2 alpha numeric.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_OTHER_CHARGE_SUB_CODE_INVALID = 378;

    /**
     * This constant is used to verify sub code provision for an other charge
     * code given in an other charge rate information.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_OTHER_CHARGE_SUB_CODE_PROHIBITED = 410;

    /**
     * This constant is used to verify sub code requirement for an other charge
     * code given in an other charge rate information.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_OTHER_CHARGE_SUB_CODE_REQUIRED = 411;

    /**
     * This constant is used to verify if the percentage charge is zero or not.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_PERCENTAGE_CHARGE_CANNOT_BE_ZERO = 449;

    /**
     * This constant is used to verify the first rate mandate for percentage
     * charges table type.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_PERCENTAGE_CHARGE_MANDATORY = 435;

    /**
     * This constant is used to verify whether OtherChargeRate can be deleted or
     * not.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_RATE_CANNOT_BE_DELETED = 417;

    /**
     * This constant is used to verify if the rate is zero or not.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_RATE_CANNOT_BE_ZERO = 448;

    /**
     * This constant is used to verify the decimal position of rate with the
     * Currency Information(UC245).
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_RATE_DECIMAL_POSITION_GREATER_THAN_CURRENCY = 405;

    /**
     * This constant is used to verify if the rate is greater than the maximum
     * charge.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_RATE_GREATER_THAN_MAXIMUM_CHARGE = 451;

    /**
     * This constant is used to verify whether break point first rate is given
     * or not for an other charge rate.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_RATE_IS_MANDATORY = 408;

    /**
     * This constant is used to verify the rate for OtherchargeRate.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_RATE_NOT_FOUND = 416;

    /**
     * This constant is used to verify if a region exist in the system.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_REGION_DOES_NOT_EXIST = 427;

    /**
     * This constant is used to verify the existence of the station provided in
     * other charge rate information.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_STATION_DOES_NOT_EXIST = 396;

    /**
     * This constant is used to verify if sub area exist in the system.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_SUB_AREA_DOES_NOT_EXIST = 426;

    /**
     * This constant is used to verify if the table type is changed during an
     * update operation.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_TABLE_TYPE_CANNOT_BE_UPDATED = 452;

    /**
     * This constant is used to verify whether the table type for an other
     * charge rate is provided or not as input.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_TABLE_TYPE_MANDATORY = 383;

    /**
     * This constant is used to verify the first rate mandate for the total per
     * event table type.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_TOTAL_PER_EVENT_RATE_MANDATORY = 432;

    /**
     * This constant is used to verify if the uld group mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_ULD_GROUP_MANDATORY = 446;

    /**
     * This constant is used to verify whether the uld group exist or not.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_ULD_GROUP_NOT_FOUND = 421;

    /**
     * This constant is used to verify the first rate mandate for rate per uld
     * table type. Value = {@value}
     */
    public static final int OTHERCHARGERATE_ULD_RATE_MANDATORY = 434;

    /**
     * This constant is used to verify if the other charge created is unique for
     * the input location, other charge code, other charge sub code and table
     * type combination.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_UNIQUE_FOR_COMBINATION = 424;

    /**
     * This constant is used to verify whether Unique Key is provided or not as
     * input.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_UNIQUE_KEY_IS_MANDATORY = 381;

    /**
     * This constant is used to verify the update for other charge rate.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_UPDATE_INVALID = 420;

    /**
     * This Constant is used to specify if the OtherChargeRate is updated
     * successfully.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_UPDATE_SUCCESSFUL = 422;

    /**
     * This constant is used to verify if the decimal position for all the rates
     * is equal to 4 when the input currency is USD or CAD.
     * <p>
     * Value = {@value}
     */
    public static final int OTHERCHARGERATE_USD_CAD_DECIMAL_POSITION_NOT_EQUAL = 454;

    /**
     * This constant is used to verify if the commodity is in effect.
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_DELETION_DATE_MUSTNOT_PROCEED_CURRENTDATE = 318;

    /**
     * This constant is used to verify if the commodity is updated successfully.
     * <p>
     * Value = {@value}
     */

    public static final int COMMODITY_IS_UPDATED = 319;

    /**
     * This constant is used to acknowledge that rate type is marked for
     * deletion.
     * <p>
     * rate type involved in current transaction is marked for deletion.<br>
     */
    public static final int RATETYPE_ACK_DELETED = 97;

    /**
     * This constant is used to verify the content of Rate Type Code.
     * <p>
     * Failed because the Rate Type Code trying to delete is already marked for deletion.<br>
     */
    public static final int RATETYPE_ALREADY_DELETED = 91;

    /**
     * This constant is used to verify the content of Product Code associated
     * with Rate Type.
     * <p>
     * Failed because the Product Code not defined in the system.<br>
     */
    public static final int RATETYPE_CHARGEWT_INVALID_DATATYPE = 89;

    /**
     * This constant is used to verify the content of Rate Type Code input.
     * <p>
     * Failed when trying to change a Rate Type Code during update.<br>
     */
    public static final int RATETYPE_CODE_CANNOT_BE_UPDATED = 115;

    /**
     * This constant is used to acknowledge that rate type create transaction is
     * successful.
     * <p>
     * rate type created successfully.<br>
     */
    public static final int RATETYPE_CREATE_SUCCESSFUL = 98;

    /**
     * This constant is used to verify the usage of create and update input.
     * <p>
     * Failed when record to create/update rate type is not provided.<br>
     */
    public static final int RATETYPE_CREATE_UPDATE_INPUT = 110;

    /**
     * This constant is used to acknowledge that rate type delete transaction is
     * successful.
     * <p>
     * rate type deleted successfully.<br>
     */
    public static final int RATETYPE_DELETE_SUCCESSFUL = 99;

    /**
     * This constant is used to verify the content of Rate Type Code.
     * <p>
     * Failed because the Rate Type Code trying to update is marked for deletion.<br>
     */
    public static final int RATETYPE_DELETED = 79;

    /**
     * This constant is used to verify the type and size of Rate Type
     * Description.
     * <p>
     * Failed because the Rate Type Description is invalid.<br>
     */
    public static final int RATETYPE_DESCRIPTION_DATATYPE = 81;

    /**
     * This constant is used to verify the usage of Rate Type Description.
     * <p>
     * Failed because the Rate Type Description is not provided.<br>
     */
    public static final int RATETYPE_DESCRIPTION_MANDATORY = 80;

    /**
     * This constant is used to verify the content of end date.
     * <p>
     * Failed because the end date specified is less than current date.<br>
     */
    public static final int RATETYPE_ENDDATE_BACKDATE_NOT_ALLOWED = 94;

    /**
     * This constant is used to verify the type and size of end date.
     * <p>
     * Failed because the end date is invalid.<br>
     */
    public static final int RATETYPE_ENDDATE_INVALID_FORMAT = 93;

    /**
     * This constant is used to verify the usage of end date.
     * <p>
     * Failed because the end date is not specified while deleting rate type. <br>
     */
    public static final int RATETYPE_ENDDATE_MANDATORY = 92;

    /**
     * This constant is used to verify the content of Rate Type Code.
     * <p>
     * Failed because the Rate Type Code trying to create, already exists in the system.<br>
     */
    public static final int RATETYPE_ENTITY_ALREADY_EXIST = 78;

    /**
     * This constant is used to verify the type and size of gross weight
     * associated with Rate Type.
     * <p>
     * Failed because the gross weight is invalild.<br>
     */
    public static final int RATETYPE_GROSSWT_INVALID_DATATYPE = 90;

    /**
     * This constant is used to verify the usage of gross weight indicator.
     * <p>
     * Failed when gross weight indicator is not provided.<br>
     */
    public static final int RATETYPE_GRSWT_IND_MANDATORY = 107;

    /**
     * This constant is used to verify the usage of rate type code.
     * <p>
     * Failed when rate type code is not provided.<br>
     */
    public static final int RATETYPE_INVALID_OBJECT_INSTANCE = 109;

    /**
     * This constant is used to verify the rate type object id.
     * <p>
     * Failed when rate type object id is not provided or invalid.<br>
     */
    public static final int RATETYPE_INVALID_OID = 111;

    /**
     * This constant is used to verify the content of delete indicator.
     * <p>
     * Failed while trying to restore rate type not marked for deletion.<br>
     */
    public static final int RATETYPE_NOT_MARKED_FOR_DELETION = 95;

    /**
     * This constant is used to verify the content of Rate Type Code.
     * <p>
     * Failed because the Rate Type Code doesn't exist in the system.<br>
     */
    public static final int RATETYPE_OBJECT_DOES_NOT_EXIST = 77;

    /**
     * This constant is used to verify the display priority.
     * <p>
     * Failed because the display priority is in use.<br>
     */
    public static final int RATETYPE_PRIORITY_INUSE = 85;

    /**
     * This constant is used to verify the type and size of display priority.
     * <p>
     * Failed because the display priority is invalid.<br>
     */
    public static final int RATETYPE_PRIORITY_INVALID_DATATYPE = 86;

    /**
     * This constant is used to verify the content of product code input.
     * <p>
     * Failed when trying to associate product code with rate type more than once.<br>
     */
    public static final int RATETYPE_PRODUCTCODE_DUPLICATE = 114;

    /**
     * This constant is used to verify the type and size of Product Code
     * associated with Rate Type.
     * <p>
     * Failed because the Product Code is invalid.<br>
     */
    public static final int RATETYPE_PRODUCTCODE_INVALID_DATATYPE = 87;

    /**
     * This constant is used to verify the usage of product code associated with
     * rate type.
     * <p>
     * Failed when product code is not provided.<br>
     */
    public static final int RATETYPE_PRODUCTCODE_MANDATORY = 105;

    /**
     * This constant is used to verify the content of Product Code associated
     * with Rate Type.
     * <p>
     * Failed because the Product Code not defined in the system.<br>
     */
    public static final int RATETYPE_PRODUCTCODE_NOT_DEFINED = 88;

    /**
     * This constant is used to verify the content of rate class input.
     * <p>
     * Failed when trying to associate rate class with rate type more than once. <br>
     */
    public static final int RATETYPE_RATECLASS_DUPLICATE = 113;

    /**
     * This constant is used to verify the type, size and content of rate class
     * input.
     * <p>
     * Failed when rate class is invalid.<br>
     */
    public static final int RATETYPE_RATECLASS_INVALID = 112;

    /**
     * This constant is used to verify the priority number input.
     * <p>
     * Failed when priority is not given.<br>
     */
    public static final int RATETYPE_PRIORITY_MANDATORY = 117;

    /**
     * This constant is used to verify the usage of rate class.
     * <p>
     * Failed when rate class is not provided.<br>
     */
    public static final int RATETYPE_RATECLASS_MANDATORY = 106;

    /**
     * This constant is used to verify the content of Rate Type Code.
     * <p>
     * Failed because the Rate Type Code trying to create, already exists in the system.<br>
     */
    public static final int RATETYPE_RATECODE_ALREADY_EXIST = 78;

    /**
     * This constant is used to verify the content of Rate Type Code.
     * <p>
     * Failed because the Rate Type Code doesn't exist in the system.<br>
     */
    public static final int RATETYPE_RATECODE_DOES_NOT_EXIST = 77;

    /**
     * This constant is used to verify type and size of the Rate Type Code.
     * <p>
     * Failed because the Rate Type Code is invalid.<br>
     */
    public static final int RATETYPE_RATECODE_INVALID_TYPESIZE = 76;

    /**
     * This constant is used to verify the usage of rate type code.
     * <p>
     * Failed when rate type code is not provided.<br>
     */
    public static final int RATETYPE_RATECODE_MANDATORY = 102;

    /**
     * This constant is sed to acknowledge that rate type restore transaction is
     * successful.
     * <p>
     * rate type restored successfully.<br>
     */
    public static final int RATETYPE_RESTORE_SUCCESSFUL = 101;

    /**
     * This constant is used to verify the usage of type of rating.
     * <p>
     * Failed when type of rating is not provided.<br>
     */
    public static final int RATETYPE_TOR_MANDATORY = 104;

    /**
     * This constant is used to verify the type of Rating and rate class.
     * <p>
     * Failed while trying to associate bulk over type of rating with ULD type rate class.<br>
     */
    public static final int RATETYPE_TOR_RATECLASS_NOT_COMPATIBLE = 84;

    /**
     * This constant is used to verify the usage of unit of weight.
     * <p>
     * Failed when unit of weight is not provided.<br>
     */
    public static final int RATETYPE_UOMWEIGHT_MANDATORY = 108;

    /**
     * This constant is used to acknowledge that rate type update transaction is
     * successful.
     * <p>
     * rate type updated successfully.<br>
     */
    public static final int RATETYPE_UPDATE_SUCCESSFUL = 100;

    /**
     * This constant is used to verify whether the weight in rate type is within
     * the limits.
     * <p>
     * Value = {@value}
     */
    public static final int RATETYPE_WEIGHT_LIMIT_INVALID = 116;

    /**
     * This constant is used to specify the availability of the rating note.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_ALREADY_EXISTS = 515;

    /**
     * This constant is used to verify if the ATPCO is of valid format.
     * <p>
     * The ATPCO must be 1-2 alphanumeric.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_ATPCO_1TO2_ALPHANUMERIC = 502;

    /**
     * This constant is used to verify if the carrier mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_CARRIER_MANDATORY_FOR_ATPCO_FORMAT = 504;

    /**
     * This constant is used to verify if the Carrier is of valid format.
     * <p>
     * The carrier must be 2 alphanumeric.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_CARRIER_MUST_BE_TWO_ALPHANUMERIC = 505;

    /**
     * This Constant is used to specify if the rating note is created
     * successfully.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_CREATED = 528;

    /**
     * This constant is used to verify if the rating note is in effect.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_DELETION_DATE_MUSTNOT_PROCEED_CURRENTDATE = 524;

    /**
     * This constant is used to verify if the deletion date is of valid format.
     * <p>
     * The deletion date must be DDMMMYY.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_DELETIONDATE_FORMAT_DDMMMYY = 513;

    /**
     * This constant is used to verify if the deletion date mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_DELETIONDATE_MANDATORY_FOR_DELETE_ACTION = 512;

    /**
     * This constant is used to verify if the rating note description mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_DESCRIPTION_MANDATORY = 511;

    /**
     * This Constant is used to specify if the rating note effective date
     * greater than expiration date.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_EFFECTIVE_DATE_GREATER_THAN_EXPIRAION_DATE = 537;

    /**
     * This Constant is used to specify if the rating note must have one
     * version.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_ATLEAST_ONE_VERSION = 538;

    /**
     * This constant is used to verify if the effective date is of valid format.
     * <p>
     * The effective date must be 1-7 DDMMMYY.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_EFFECTIVEDATE_FORMAT_DDMMMYY = 507;

    /**
     * This constant is used to verify if the effective date mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_EFFECTIVEDATE_MANDATORY = 508;

    /**
     * This constant is used to verify if the expiration date is of valid
     * format.
     * <p>
     * The expiration date must be DDMMMYY.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_EXPIRATIONDATE_FORMAT_DDMMMYY = 509;

    /**
     * This constant is used to verify if the expiration date mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_EXPIRATIONDATE_MANDATORY = 510;

    /**
     * This Constant is used to specify if the rating note format is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_FORMAT_MANDATORY = 535;

    /**
     * This constant is used to verify if the IATA rating note is of valid
     * format.
     * <p>
     * The IATA rating note must be 4 alphanumeric.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_IATA_FOUR_ALPHANUMERIC = 503;

    /**
     * This constant is used to verify if the IATA resolution number is of valid
     * format.
     * <p>
     * The IATA resolution number must be 1-10 alphanumeric.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_IATA_RESOLUTION_NUMBER_FORMAT_1TO10_CHARACTERS = 506;

    /**
     * This constant is used to verify if the input effective date is greater
     * than existing rating notes last version.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_INPUT_EFFECTIVEDATE_OVERLAPS_OTHERDATE_RANGES_RATINGNOTE = 517;

    /**
     * This constant is used to verify if the input effective date is greater
     * than existing rating notes last version.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_INPUTEFFECTIVEDATE_GREATERTHAN_EXIXTINGERATINGNOTES_LASTVERSION = 523;

    /**
     * This constant is used to verify if the rating note mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_MANDATORY = 501;

    /**
     * This constant is used to verify if the rating note is in effect.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_MARK_ENTIRE_RATINGNOTE = 526;

    /**
     * This constant is used to verify if the rating note is in effect.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_MARKED_DELETION = 527;

    /**
     * This Constant is used to specify if the rating note new version is
     * created successfully.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_NEW_VERSION_CREATED = 530;

    /**
     * This constant is used to verify if an rating note exist or not.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_NOMORE_EXISTS = 525;

    /**
     * This constant is used to specify the non availability of the rating note.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_NOT_EXISTS = 514;

    /**
     * This constant is used to verify if the rating note is in effect.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_RESTORE_CANNOT_DONE_IF_RATINGNOTE_MARKED_FOR_DELETION = 522;

    /**
     * This Constant is used to specify if the rating note is updated
     * successfully.
     * <p>
     * Value = {@value}
     */

    public static final int RATING_NOTE_IS_UPDATED = 539;

    /**********************************************************/
    /** Start of UC063 - Maintain Other Charge Rates **/
    /**********************************************************/

    /**
     * This Constant is used to specify if the rating note is restored
     * successfully.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_RESTORED = 529;

    /**
     * This constant is used to verify if the updated rating note is in effect.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_UPDATION_CANNOT_DONE_IF_RATINGNOTE_MARKED_FOR_DELETION = 521;

    /**
     * This constant is used to verify if the effective date is greater than
     * current system date.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_UPDATION_DONE_EFFECTIVEDATE_GREATERTHAN_CURRENT_SYSTEMDATE = 520;

    /**
     * This Constant is used to specify if the rating note version is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_VERSION_INVALID = 536;

    /**
     * This constant is used to specify the non availability of the rating note
     * version.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_VERSION_IATA_NOT_EXISTS = 516;

    /**
     * This constant is used to specify the non availability of the rating note
     * version.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_VERSION_ATPCO_NOT_EXISTS = 540;

    /**
     * This Constant is used to specify if the rating note is purged
     * successfully.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_VERSION_PURGED = 532;

    /**
     * This Constant is used to specify if the rating note is updated
     * successfully.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_NOTE_VERSION_UPDATED = 531;

    /**
     * This constant is used to specify that the ClassRating Id and it cannot be
     * Restored operation if it is not marked for deletion.
     * <p>
     * value={@value}
     */
    public static final int RESTORATION_MUST_NOT_BE_DONE = 618;

    /**
     * This constant is used to specify the non availability of the default
     * rounding factor for currency.
     * <p>
     * Value = {@value}
     */
    public static final int ROUNDING_FACTOR_DOES_NOT_EXIST = 459;

    /**
     * This constant is used to verify the content of tax applies destination
     * code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_APPLIES_DESTINATION_NOT_EXISTS = 217;

    /**
     * This constant is used to verify the content of tax applies origin code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_APPLIES_ORIGIN_NOT_EXISTS = 218;

    /**
     * This constant is used to verify the usage of unit of other charge code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_APPLIES_OTHERCHARGE_CODE_REQUIRED = 190;

    /**
     * This constant is used to verify the usage of unit of destination.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_APPLIES_STATION_DESTINATION_REQUIRED = 189;

    /**
     * This constant is used to verify the usage of unit of origin/destination.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_APPLIES_STATION_ORIGIN_DESTINATION_REQUIRED = 175;

    /**
     * This constant is used to verify the usage of unit of origin.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_APPLIES_STATION_ORIGIN_REQUIRED = 188;

    /**
     * This constant is used to verify the tax deletion.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_CODE_CONT_DELETE = 224;

    /**
     * This constant is used to verify the content of tax code Code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_CODE_DOES_NOT_EXIST = 197;

    /**
     * This constant is used to verify the type and size of Tax code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_CODE_INVALID = 157;

    /**
     * This constant is used to give the success message for create country tax
     * operation.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_COUNTRY_CREATE_SUCCESSFUL = 208;

    /**
     * This constant is used to verify the content of country Code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_COUNTRY_DOES_NOT_EXIST = 192;

    /**
     * This constant is used to give the success message for update ineffect
     * country tax operation.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_COUNTRY_INEFFECT_UPDATE_SUCCESSFUL = 219;

    /**
     * This constant is used to verify the type and size of country.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_COUNTRY_INVALID = 156;

    /**
     * This constant is used to give the success message for update country
     * operation.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_COUNTRY_UPDATE_SUCCESSFUL = 212;

    /**
     * This constant is used to verify the usage of unit of country code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_COUNTRYCODE_REQUIRED = 172;

    /**
     * This constant is used to verify effective date w.r.t control parameter
     * value one.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_CPARAM_EFFECTIVE_DATE_ONE_INVALID = 181;

    /**
     * This constant is used to verify effective date w.r.t control parameter
     * value zero.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_CPARAM_EFFECTIVE_DATE_ZERO_INVALID = 182;

    /**
     * This constant is used to verify end date w.r.t control parameter.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_CPARAM_END_DATE_INVALID = 179;

    /**
     * This constant is used to verify date w.r.t control parameter.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_CPARAM_FUTURE_EFFECTIVE_DATE_INVALID = 180;

    /**
     * This constant is used to verify the input date w.r.t future allowable
     * control parameter.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_CPARAM_FUTURE_INVALID_DATE = 231;

    /**
     * This constant is used to verify the tax dates with existing tax rate
     * dates.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_DATE_OVERLAP = 225;

    /**
     * This constant is used to give the success message for delete operation.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_DELETE_SUCCESSFUL = 214;

    /**
     * This constant is used to verify the type and size of destination.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_DESTINATION_INVALID = 155;

    /**
     * This constant is used to verify the usage of unit of destination.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_DESTINATION_REQUIRED = 183;

    /**
     * This constant is used to verify the tax deletion.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_EFFECT_CAN_NOT_DELETE = 223;

    /**
     * This constant is used to verify the usage of unit of weight.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_EFFECTIVEDATE_REQUIRED = 173;

    /**
     * This constant is used to verify end date and effective date.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_ENDDATE_PRIOR_EFFECTIVE_DATE = 178;

    /**
     * This constant is used to verify the content of updated tax.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_ENDDATE_UPDATED_PRIOR_EFFECTIVE_DATE = 203;

    /**
     * This constant is used to verify the tax deletion.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_EXPIRED_CAN_NOT_DELETE = 184;

    /**
     * This constant is used to verify the content of country tax.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INFO_COUNTRY_CODE_DOES_NOT_EXIST = 202;

    /**
     * This constant is used to verify the content of State Tax.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INFO_STATE_CODE_DOES_NOT_EXIST = 199;

    /**
     * This constant is used to verify the content of US Tax.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INFO_USGOVT_DOES_NOT_EXIST = 201;

    /**
     * This constant is used to verify the content of VAT Tax.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INFO_VAT_DOES_NOT_EXIST = 200;

    /**
     * This constant is used to verify the type and size of Collect Tax sub
     * code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INVALID_COLLECT_TAX_SUBCODE = 158;

    /**
     * This constant is used to verify the station is belongs to european
     * country or not.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INVALID_EUROPEAN_STATION = 205;

    /**
     * This constant is used to verify the type and size of destination code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INVALID_EXCEPTION_DESTINATION_CODE = 163;

    /**
     * This constant is used to verify the duplicate destination code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INVALID_EXCEPTION_DESTINATION_DUPLICATE_CODE = 167;

    /**
     * This constant is used to verify the type and size of origin code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INVALID_EXCEPTION_ORIGIN_CODE = 162;

    /**
     * This constant is used to verify the duplicate origin code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INVALID_EXCEPTION_ORIGIN_DUPLICATE_CODE = 166;

    /**
     * This constant is used to verify the type and size of othercharge code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INVALID_EXCEPTION_OTHERCHARGE_CODE = 164;

    /**
     * This constant is used to verify the duplicate othercharge code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INVALID_EXCEPTION_OTHERCHARGE_DUPLICATE_CODE = 168;

    /**
     * This constant is used to verify the type and size of product code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INVALID_EXCEPTION_PRODUCT_CODE = 165;

    /**
     * This constant is used to verify the duplicate product code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INVALID_EXCEPTION_PRODUCT_DUPLICATE_CODE = 169;

    /**
     * This constant is used to verify the tax information.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INVALID_INFO = 177;

    /**
     * This constant is used to verify the type and size of Prepaid Tax sub
     * code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INVALID_PREPAID_TAX_SUBCODE = 159;

    /**
     * This constant is used to verify the type and size of shipment destination
     * code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INVALID_SHIPMENT_DESTINATION_CODE = 160;

    /**
     * This constant is used to verify the type and size of shipment origin
     * code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INVALID_SHIPMENT_ORIGIN_CODE = 161;

    /**
     * This constant is used to verify the tax information.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_INVALID_TAX = 174;

    /**
     * This constant is used to verify the station is an airport or not.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_NOT_AIRPORT = 198;

    /**
     * This constant is used to verify the origin and destination station codes.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_ORIGIN_DESTINATION_EQUAL = 230;

    /**
     * This constant is used to verify the usage of unit of origin/destination.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_ORIGIN_DESTINATION_REQUIRED = 187;

    /**
     * This constant is used to verify the type and size of origin.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_ORIGIN_INVALID = 154;

    /**
     * This constant is used to verify the usage of unit of origin.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_ORIGIN_REQUIRED = 170;

    /**
     * This constant is used to verify the content of othercharge Code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_OTHERCHARGE_CODE_DOES_NOT_EXIST = 195;

    /**
     * This constant is used to verify the content of othercharge sub Code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_OTHERCHARGE_SUBCODE_DOES_NOT_EXIST = 196;

    /**
     * This constant is used to verify the content of product Code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_PRODUCT_CODE_DOES_NOT_EXIST = 194;

    /**
     * This constant is used to verify the type and size of Tax rate.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_RATE_INVALID = 151;

    /**
     * This constant is used to give the success message for create state tax
     * operation.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_STATE_CREATE_SUCCESSFUL = 209;

    /**
     * This constant is used to verify the content of state Code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_STATE_DOES_NOT_EXIST = 193;

    /**
     * This constant is used to give the success message for update ineffect
     * state tax operation.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_STATE_INEFFECT_UPDATE_SUCCESSFUL = 222;

    /**
     * This constant is used to verify the state code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_STATE_INVALID = 185;

    /**
     * This constant is used to give the success message for update state tax
     * operation.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_STATE_UPDATE_SUCCESSFUL = 213;

    /**
     * This constant is used to verify the usage of unit of state code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_STATECODE_REQUIRED = 186;

    /**
     * This constant is used to verify the content of station Code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_STATION_DOES_NOT_EXIST = 191;

    /**
     * This constant is used to verify the station is an airport or not.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_STATION_EXCEPTION_NOT_AIRPORT = 227;

    /**
     * This constant is used to verify the state code for the station.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_STATION_NO_STATECODE = 215;

    /**
     * This constant is used to verify the station code is within the us or not.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_STATION_NOT_WITHIN_US = 216;

    /**
     * This constant is used to verify the content of tax sub code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_SUBCODE_DOES_NOT_EXIST = 226;

    /**
     * This constant is used to verify the usage of unit of tax code.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_TAXCODE_REQUIRED = 171;

    /**
     * This constant is used to verify the usage of unit of tax rate.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_TAXRATE_REQUIRED = 176;

    /**
     * This constant is used to give the success message for create us tax
     * operation.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_US_CREATE_SUCCESSFUL = 206;

    /**
     * This constant is used to give the success message for update ineffect us
     * tax operation.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_US_INEFFECT_UPDATE_SUCCESSFUL = 220;

    /**
     * This constant is used to give the success message for update us tax
     * operation.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_US_UPDATE_SUCCESSFUL = 210;

    /**
     * This constant is used to give the success message for create vat tax
     * operation.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_VAT_CREATE_SUCCESSFUL = 207;

    /**
     * This constant is used to give the success message for update ineffect vat
     * tax operation.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_VAT_INEFFECT_UPDATE_SUCCESSFUL = 221;

    /**********************************************************/
    /** End of UC063 - Maintain Other Charge Rates **/
    /**********************************************************/

    /**********************************************************/
    /** Start of UC141 - Maintain Rating Note **/
    /**********************************************************/

    /**
     * This constant is used to give the success message for update vat tax
     * operation.
     * <p>
     * Value = {@value}
     */
    public static final int TAX_VAT_UPDATE_SUCCESSFUL = 211;

    /**
     * This constant is used to verify existence of the object.
     * <p>
     * Value = {@value}
     */
    public static final int TAXINFORMATIONSERVICE_OBJECT_DOES_NOT_EXIST = 232;

    /**
     * This constant is used to verify the tax deletion.
     * <p>
     * Value = {@value}
     */
    public static final int TAXRATE_EXPIRED = 204;

    /**
     * This constant is used to verify if the uld type already exists in the
     * system.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_TYPE_ALREADY_EXIST = 28;

    /**
     * This constant is used to verify if the uld type is updated.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_TYPE_CANNOT_BE_UPDATED = 55;

    /**
     * This constant is used to verify if the end date is entered.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_TYPE_END_DATE = 30;

    /**
     * This constant is used to verify if the uld type exists in the system.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_TYPE_IS_NOT_FOUND = 27;

    /**
     * This constant is used to verify if the uld type is in use.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_TYPE_IS_NOT_IN_USE = 29;

    /**
     * This constant is used to verify whether the uld type to be updated is
     * marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_TYPE_MARKED_FOR_DELETION = 49;

    /**
     * This constant is used to verify if the ULD type is not marked for
     * deletion. for aircraft.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_TYPE_NOT_MARKED_FOR_DELETION = 33;

    /**
     * This constant is used to specify that the ULDType creation is successful.
     * <p>
     * value={@value}
     */
    public static final int ULDTYPE_CREATE_SUCCESSFUL = 56;

    /**
     * This constant is used to verify if the currency exists in the system.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_CURRENCY_INVALID_CODE_DOES_NOT_EXIST = 63;

    /**
     * This constant is used to verify the ULD type discount currency code is
     * prohibited for aircraft.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_DISCOUNT_CURRENCY_CODE_OBJECT_INSTANCE = 34;

    /**
     * This constant is used to verify the ULD type discount rate code is
     * prohibited.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_DISCOUNT_RATE_CODE_OBJECT_INSTANCE = 36;

    /**
     * This constant is used to verify if the discount currency code of ULDType
     * which is mandatory is present in the request.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_DISCOUNTCURRENCYCODE_OBJECT_INSTANCE = 23;

    /**
     * This constant is used to verify if the uld type discount rate code which
     * is mandatory is present in the request.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_DISCOUNTRATECODE_OBJECT_INSTANCE = 35;

    /**
     * This constant is used to verify if the effective date is today or later.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_EFFECTIVEDATE_SHOULD_BE_TODAY_OR_LATER = 44;

    /**
     * This constant is used to verify if the effective date is tomorrow or
     * later.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_EFFECTIVEDATE_SHOULD_BE_TOMORROW_OR_LATER = 43;

    /**
     * This constant is used to verify whether the effective dates are
     * overlapping.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_EFFECTIVEDATES_OVERLAPPING = 47;

    /**
     * This constant is used to verify if the end date is today or later.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_ENDDATE_SHOULD_BE_TODAY_OR_LATER = 53;

    /**
     * This constant is used to verify if the end date is tomorrow or later.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_ENDDATE_SHOULD_BE_TOMORROW_OR_LATER = 52;

    /**
     * This constant is used to verify if the discount rate is present in the
     * request.
     * <p>
     * Discount Rate is mandatory if Minimum Chargeable Weight is not entered.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_ENTER_EITHER_DISCOUNTRATE_OR_MINIMUMCHARGEWEIGHT = 22;

    /**
     * This constant is used to verify whether any one among origin, destination
     * or airline is entered.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_ENTER_EITHER_ORIGIN_DESTINATION_AIRLINE = 46;

    /**
     * This constant is used to verify if the expiration date is today or later.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_EXPIRATIONDATE_SHOULD_BE_TODAY_OR_LATER = 51;

    /**
     * This constant is used to verify if the expiration date is tomorrow or
     * later.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_EXPIRATIONDATE_SHOULD_BE_TOMORROW_OR_LATER = 50;

    /**
     * This constant is used to verify if the expiration date is greater than
     * effective date.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_EXPIRATIONDATE_SHOULD_NOT_BE_GREATER_THAN_EFFECTIVE_DATE = 54;

    /**
     * This constant is used to verify if the gross weight is greater than
     * minimum chargeable weight of the ULD type.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_GROSSWEIGHT_SHOULD_BE_GREATER_THAN_MINCHARGEWEIGHT = 37;

    /**
     * This constant is used to verify if the date of ULDType which is mandatory
     * is present in the request.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_INVALID_DATE_OBJECT_INSTANCE = 19;

    /**
     * This constant is used to verify if the uld type description exceeds 100
     * characters.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_INVALID_DESCRIPTION_OBJECT_INSTANCE = 25;

    /**
     * This constant is used to verify if the uld type dimension exceeds 100
     * characters.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_INVALID_DIMENSION_OBJECT_INSTANCE = 26;

    /**
     * This constant is used to verify if the expiration date is of valid date
     * format(ddmmmyy).
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_INVALID_EXPIRATION_DATE_OBJECT_INSTANCE = 42;

    /**
     * This constant is used to verify if the group code of the uld type is 4
     * characters alphanumeric.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_INVALID_GROUPCODE_OBJECT_INSTANCE = 12;

    /**
     * This constant is used to verify if the gross weight has more than one
     * digit after the decimal point.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_INVALID_MAXWGHT_OBJECT_INSTANCE = 10;

    /**
     * This constant is used to verify the instance of uld type name.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_INVALID_NAME_OBJECT_INSTANCE = 4;

    /**
     * This constant is used to verify if the uld type which is not required is
     * present in the request.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_INVALID_NOT_REQUIRED_OBJECT_INSTANCE = 2;

    /**
     * This constant is used to verify the instance of uld type.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_INVALID_OBJECT_INSTANCE = 3;

    /**
     * This constant is used to verify whether the uld type oid is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_INVALID_OID_OBJECT_INSTANCE = 38;

    /**********************************************************/
    /** End of UC141 - Maintain Rating Note **/
    /**********************************************************/

    /**********************************************************/
    /** UC339 - Maintain Class Rating IDs **/
    /**********************************************************/

    /**
     * This constant is used to verify if the effective date is of valid date
     * format(ddmmmyy).
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_INVALID_PENDINGEFFECTIVEDATE_OBJECT_INSTANCE = 24;

    /**
     * This constant is used to verify if the uld type is 3 characters
     * alphabetic.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_INVALID_ULDTYPENAME_SIZE = 9;

    /**
     * This constant is used to verify whether the weight is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_INVALID_WEIGHT = 70;

    /**
     * This constant is used to verify if the weight of ULDType which is
     * mandatory is present in the request.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_INVALID_WEIGHT_OBJECT_INSTANCE = 8;

    /**
     * This constant is used to verify if the uld type is already marked for
     * deletion.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_IS_ALREADY_MARKED_FOR_DELETION = 68;

    /**
     * This constant is used to verify if the uld type which is mandatory is
     * present in the request.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_IS_MANDATORY = 1;

    /**
     * This constant is used to specify that the ULDType deletion is successful.
     * <p>
     * value={@value}
     */
    public static final int ULDTYPE_IS_MARKED_FOR_DELETION = 57;

    /**
     * This constant is used to verify if the maximum gross weight of ULDType
     * which is mandatory is present in the request.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_MAXGROSSWEIGHT_IS_MANDATORY = 6;

    /**
     * This constant is used to verify the maximum gross weight is prohibited
     * for aircraft.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_MAXGROSSWEIGHT_IS_PROHIBITED_FOR_AIRCRAFT = 32;

    /**
     * This constant is used to verify if the maximum tare weight of ULDType
     * which is mandatory is present in the request.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_MAXTAREWEIGHT_IS_MANDATORY = 7;

    /**
     * This constant is used to verify the maximum tare weight is prohibited for
     * aircraft.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_MAXTAREWEIGHT_IS_PROHIBITED_FOR_AIRCRAFT = 31;

    /**
     * This constant is used to verify if the minimum chargeable weight is
     * present in the request.
     * <p>
     * Minimum Chargeable Weight is mandatory if Discount Rate is not entered.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_MINIMUMCHARGEWEIGHT_OBJECT_INSTANCE = 21;

    /**
     * This constant is used to verify whether any other fields except
     * expiration date are updated for effective rates.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_ONLY_EXPIRATION_DATE_CAN_BE_UPDATED = 48;

    /**
     * This constant is used to verify if the origin and destination of the uld
     * type is different.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_ORIGIN_DESTINATION_SHOULD_BE_DIFFERENT = 41;

    /**
     * This constant is used to verify if the overall status is in use.
     * <p>
     * value={@value}
     */
    public static final int ULDTYPE_OVERALL_STATUS_IS_IN_USE = 60;

    /**
     * This constant is used to verify if the effective date is of valid date
     * format(ddmmmyy).
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_PENDINGEFFECTIVEDATE_OBJECT_INSTANCE = 45;

    /**
     * This constant is used to verify the instance of uld type rate.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_RATE_INVALID_OBJECT_INSTANCE = 18;

    /**
     * This constant is used to specify that the rate amount is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_RATE_IS_INVALID = 13;

    /**
     * This constant is used to specify that the ULDType restore operation is
     * successful.
     * <p>
     * value={@value}
     */
    public static final int ULDTYPE_RESTORE_SUCCESSFUL = 59;

    /**
     * This constant is used to specify that the ULDType updation is successful.
     * <p>
     * value={@value}
     */
    public static final int ULDTYPE_UPDATE_SUCCESSFUL = 58;

    /**
     * This constant is used to verify if the airline of the uld type is 2 0r 3
     * characters alphanumeric.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPERANGE_INVALID_AIRLINE = 39;

    /**
     * This constant is used to verify if the discount currency code of the uld
     * type is 3 characters alphabetic.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPERANGE_INVALID_DISCOUNT_CURRENCYCODE_OBJECT_INSTANCE_ALPHABET = 14;

    /**
     * This constant is used to verify if the discount rate is not exceeding
     * nine digits inclusive of decimal point.
     * <p>
     * Value = {@value}
     */

    public static final int ULDTYPERANGE_INVALID_DISCOUNTRATE_WITH_DISCOUNTCURRENCY = 61;

    /**
     * This constant is used to verify if the effective date is of valid date
     * format(ddmmmyy or indef).
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPERANGE_INVALID_EFFECTIVEDATE_INDEF_OBJECT_INSTANCE_ALPHABET = 16;

    /**
     * This constant is used to verify if the effective date is of valid date
     * format(ddmmmyy).
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPERANGE_INVALID_EFFECTIVEDATE_OBJECT_INSTANCE_ALPHABET = 15;

    /**
     * This constant is used to verify the instance of uld type range.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPERANGE_INVALID_OBJECT_INSTANCE = 5;

    /**
     * This constant is used to verify if the origin and destination of the uld
     * type rate is 4 characters alphanumeric.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPERANGE_INVALID_ORIGIN_DESTINATION_OBJECT_INSTANCE_ALPHABET = 11;

    /**
     * This constant is used to verify the instance of uld type.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPES_INVALID_OBJECT_INSTANCE = 17;

    /**
     * This constant is used to verify if the uld type entity already exists in
     * the system.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPESERVICE_ENTITY_ALREADY_EXIST = 66;

    /**
     * This constant is used to verify if the uld type object exists in the
     * system.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPESERVICE_OBJECT_DOES_NOT_EXIST = 67;

    /**
     * This constant is used to verify whether class rating id has atleast one
     * version.
     * <p>
     * Value = {@value}
     */
    public static final int CLASS_RATING_ID_ATLEAST_ONE_VERSION = 622;

    /**********************************************************/
    /** END OF UC339 - Maintain Class Rating IDs **/
    /**********************************************************/

    /**********************************************************/
    /** START OF UC339 - Maintain Rate Source **/
    /**********************************************************/

    /**
     * This constant is used to verify if the Rate Source which is mandatory is
     * present in the request.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_MANDATORY = 651;

    /**
     * This constant is used to verify if the RateSourceCode is of valid format.
     * <p>
     * The IATA resolution number must be three characters.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_CODE_THREE_CHARACTERS = 652;

    /**
     * This constant is used to verify if the Rate Source deletion date which is
     * mandatory .
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_DELETION_DATE_MANDATORY_FOR_DELETE_ACTION = 653;

    /**
     * This constant is used to verify if the Rate Source description is
     * mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_DESCRIPTION_MANDATORY = 654;

    /**
     * This constant is used to verify if the Rate Source exists in the system.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_DOES_NOT_EXISTS = 655;

    /**
     * This constant is used to verify if the RateSource already exists in the
     * system.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_ALREADY_EXISTS = 656;

    /**
     * This constant is used to verify if the Rate Source retrieved from the
     * system is marked for deletion and cannot able to do update operation.
     * <p>
     * The rate Source that is marked for deletion must not be updated.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_MARKED_FOR_DELETION_CANNOT_BE_UPDATED = 657;

    /**
     * This constant is used to verify if the rate Source deletion date must not
     * precede current date.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_DELETION_DATE_MUST_NOT_PRECEDE_CURRENT_DATE = 659;

    /**
     * This constant is used to verify if the rate Source restoration cannot be
     * done when its marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_RESTORATION_NOT_DONE_IF_RATESOURCE_MARKED_DELETION = 658;

    /**
     * This constant is used to verify if the Rate Source retrieved from the
     * system is marked for deletion.
     * <p>
     * The class rate Source is marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_MARKED_FOR_DELETION = 660;

    /**
     * This Constant is used to specify if the Rate Source is created
     * successfully.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_CREATED = 661;

    /**
     * This Constant is used to specify if the Rate Source is restored
     * successfully.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_RESTORED = 662;

    /**
     * This Constant is used to specify if the Rate Source is updated
     * successfully.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_UPDATED = 663;

    /**
     * This constant is used to verify if the RateSourceCode is of valid format.
     * <p>
     * The IATA resolution number must be three alphabets.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_CODE_MUST_BE_THREE_ALPHABETS = 664;

    /**
     * This constant is used to verify if the RateType is of valid format.
     * <p>
     * The RateType already exists.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_DUPLICATE_RATE_TYPE = 665;

    /**
     * This constant is used to verify if the RateType is not present in
     * Database.
     * <p>
     * The RateType is not present in database.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_RATE_TYPE_NOT_PRESENTIN_DB = 666;

    /**
     * This Constant is used to specify rate type is marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_RATE_TYPE_MARKED_FOE_DELETION = 667;

    /**
     * This constant is used to verify if the effective date is less than the
     * expiration date.
     * <p>
     * Value = {@value}
     */
    public static final int CLASS_RATING_ID_EFFECTIVE_DATE_GREATER_THAN_EXPIRAION_DATE = 650;

    /**
     * This constant is used to verify deletion date must not proceed current
     * date.
     */
    public static final int CLASS_RATING_ID_DELETION_DATE_MUSTNOT_PROCEED_CURRENTDATE = 649;

    /**********************************************************/
    /** Start OF UC045 - Maintain Tariff Rates **/
    /**********************************************************/

    /**
     * This Constant is used to specify origin type must be following.
     * <p>
     * Value = {@value}
     */
    public static final int ORIGIN_TYPE_MUST_BE_FOLLOWING = 700;

    /**
     * This Constant is used to specify origin code mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int ORIGIN_CODE_MANDATORY = 701;

    /**
     * This Constant is used to specify origin code type size error.
     * <p>
     * Value = {@value}
     */
    public static final int ORIGIN_CODE_TYPE_SIZE_ERROR = 702;

    /**
     * This Constant is used to specify destination type type size.
     * <p>
     * Value = {@value}
     */
    public static final int DESTINATION_TYPE_TYPE_SIZE = 703;

    /**
     * This Constant is used to specify destination code mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int DESTINATION_CODE_MANDATORY = 704;

    /**
     * This Constant is used to specify destination code type size.
     * <p>
     * Value = {@value}
     */
    public static final int DESTINATION_CODE_TYPE_SIZE = 705;

    /**
     * This Constant is used to specify carrier code type size.
     * <p>
     * Value = {@value}
     */
    public static final int CARRIER_CODE_TYPE_SIZE = 707;

    /**
     * This Constant is used to specify rate source type size.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_TYPE_SIZE = 709;

    /**
     * This Constant is used to specify rate type mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_TYPE_MANDATORY = 710;

    /**
     * This Constant is used to specify rate type type size.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_TYPE_TYPE_SIZE = 711;

    /**
     * This Constant is used to specify rate class mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_CLASS_MANDATORY = 712;

    /**
     * This Constant is used to specify rate class type size.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_CLASS_TYPE_SIZE = 713;

    /**
     * This Constant is used to specify commodity number mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_NUMBER_MANDATORY = 714;

    /**
     * This Constant is used to specify commodity number type size.
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_NUMBER_TYPE_SIZE = 715;

    /**
     * This Constant is used to specify commodity type size.
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_TYPE_SIZE = 716;

    /**
     * This Constant is used to specify ULD type size.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_TYPE_SIZE = 717;

    /**
     * This Constant is used to specify ULD charge code mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_CHARGE_CODE_MANDATORY = 718;

    /**
     * This Constant is used to specify ULD charge code type size.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_CHARGE_CODE_TYPE_SIZE = 719;

    /**
     * This Constant is used to specify rate note type size.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_NOTE_TYPE_SIZE = 720;

    /**
     * This Constant is used to specify minimum weight type size.
     * <p>
     * Value = {@value}
     */
    public static final int MINIMUM_WEIGHT_TYPE_SIZE = 721;

    /**
     * This Constant is used to specify the rate type mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_MANDATORY = 722;

    /**
     * This Constant is used to specify the rate type size.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_TYPE_SIZE = 723;

    /**
     * This Constant is used to specify the currency code mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int CURRENCY_CODE_MANDATORY = 724;

    /**
     * This Constant is used to specify the currency code type size.
     * <p>
     * Value = {@value}
     */
    public static final int CURRENCY_CODE_TYPE_SIZE = 725;

    /**
     * This Constant is used to specify the pivot weight type size.
     * <p>
     * Value = {@value}
     */
    public static final int PIVOT_WEIGHT_TYPE_SIZE = 726;

    /**
     * This Constant is used to specify the over pivot rate type size.
     * <p>
     * Value = {@value}
     */
    public static final int OVER_PIVOT_RATE_TYPE_SIZE = 727;

    /**
     * This Constant is used to specify the effective date mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int EFFECTIVE_DATE_MANDATORY = 728;

    /**
     * This Constant is used to specify the effective date type size.
     * <p>
     * Value = {@value}
     */
    public static final int EFFECTIVE_DATE_TYPE_SIZE = 729;

    /**
     * This Constant is used to specify the expiration date type size.
     * <p>
     * Value = {@value}
     */
    public static final int EXPIRATION_DATE_TYPE_SIZE = 730;

    /**
     * This Constant is used to specify the weight unit mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int WEIGHT_UNIT_MANDATORY = 731;

    /**
     * This Constant is used to specify the weight unit type size.
     * <p>
     * Value = {@value}
     */
    public static final int WEIGHT_UNIT_TYPE_SIZE = 732;

    /**
     * This Constant is used to specify the random construction indicator
     * mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int RANDOM_CONSTRUCTION_INDICATOR_MANDATORY = 733;

    /**
     * This Constant is used to specify the random construction indicator type
     * size.
     * <p>
     * Value = {@value}
     */
    public static final int RANDOM_CONSTRUCTION_INDICATOR_TYPE_SIZE = 734;

    /**
     * This Constant is used to specify the pending approval indicator type
     * size.
     * <p>
     * Value = {@value}
     */
    public static final int PENDING_GOVERMENT_APPROVAL_INDICATOR_TYPE_SIZE = 735;

    /**
     * This Constant is used to specify the flight specific rate indicator
     * mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int FLIGHT_SPECIFIC_RATE_INDICATOR_MANDATORY = 736;

    /**
     * This Constant is used to specify the flight specific rate indicator type
     * size.
     * <p>
     * Value = {@value}
     */
    public static final int FLIGHT_SPECIFIC_RATE_INDICATOR_TYPE_SIZE = 737;

    /**
     * This Constant is used to specify the all flight indicator type size.
     * <p>
     * Value = {@value}
     */
    public static final int ALL_FLIGHT_INDICATOR_TYPE_SIZE = 738;

    /**
     * This Constant is used to specify the flight carrier code type size.
     * <p>
     * Value = {@value}
     */
    public static final int FLIGHT_CARRIER_CODE_TYPE_SIZE = 739;

    /**
     * This Constant is used to specify the flight number type size.
     * <p>
     * Value = {@value}
     */
    public static final int FLIGHT_NUMBER_TYPE_SIZE = 740;

    /**
     * This Constant is used to specify the flight operation day type size.
     * <p>
     * Value = {@value}
     */
    public static final int FLIGHT_OPERATION_DAY_TYPE_SIZE = 741;

    /**
     * This Constant is used to specify the flight operation from time.
     * <p>
     * Value = {@value}
     */
    public static final int FLIGHT_OPERATION_FROM_TIME = 742;

    /**
     * This Constant is used to specify the flight operation to time.
     * <p>
     * Value = {@value}
     */
    public static final int FLIGHT_OPERATION_TO_TIME = 743;

    /**
     * This Constant is used to specify airport code does not exist.
     * <p>
     * Value = {@value}
     */
    public static final int AIRPORT_CODE_DOES_NOT_EXIST = 744;

    /**
     * This Constant is used to specify city code does not exist.
     * <p>
     * Value = {@value}
     */
    public static final int CITY_CODE_DOES_NOT_EXIST = 745;

    /**
     * This Constant is used to specify city code is marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int CITY_CODE_MARKED_FOR_DELETION = 746;

    /**
     * This Constant is used to specify country code does not exists.
     * <p>
     * Value = {@value}
     */
    public static final int COUNTRY_CODE_DOES_NOT_EXIST = 747;

    /**
     * This Constant is used to specify fractional weight is only for N Rate
     * class.
     * <p>
     * Value = {@value}
     */
    public static final int FRACTIONAL_WEIGHT_ONLY_FOR_N_RATECLASS = 748;

    /**
     * This Constant is used to specify flight suffix type size.
     * <p>
     * Value = {@value}
     */
    public static final int FLIGHT_SUFFIX_TYPE_SIZE = 749;

    /**
     * This Constant is used to specify aggregate is marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int AGGREGATE_MARKED_FOR_DELETION = 750;

    /**
     * This Constant is used to specify aggregate must be membership country.
     * <p>
     * Value = {@value}
     */
    public static final int AGGREGATE_MUST_BE_MEMBERSHIP_COUNTRY = 751;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int CARRIER_CODE_DOES_NOT_EXIST = 752;

    /**
     * This Constant is used to specify carrier code marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int CARRIER_CODE_MARKED_FOR_DELETION = 753;

    /**
     * This Constant is used to specify tariff rate does not exist for origin
     * and destination.
     * <p>
     * Value = {@value}
     */
    public static final int TARIFF_RATE_DOES_NOT_EXIST_ORIGIN_DESTINATION = 754;

    /**
     * This Constant is used to specify tariff rate not exist for origin and
     * destination filter.
     * <p>
     * Value = {@value}
     */
    public static final int TARIFF_RATE_DOES_NOT_EXIST_ORIGIN_DESTINATION_FILTER = 755;

    /**
     * This Constant is used to specify tariff rate already exist for origin and
     * destination.
     * <p>
     * Value = {@value}
     */
    public static final int TARIFF_RATE_ALREADY_EXIST_ORIGIN_DESTINATION = 756;

    /**
     * This Constant is used to specify rate source code not belongs to carrier.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_NOT_BELONGS_TO_CARRIER = 758;

    /**
     * This Constant is used to specify currency code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int CURRENCY_CODE_DOES_NOT_EXIST = 759;

    /**
     * This Constant is used to specify currency code does not match with
     * currency of origin country.
     * <p>
     * Value = {@value}
     */
    public static final int CURRENCY_CODE_NOT_MATCH_WITH_CURRENCY_OF_ORIGIN_COUNTRY = 760;

    /**
     * This Constant is used to specify currency must have rounding factor.
     * <p>
     * Value = {@value}
     */
    public static final int CURRENCY_MUST_HAVE_ROUNDING_FACTOR_AND_DECIMAL = 761;

    /**
     * This Constant is used to specify rate type not exists.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_TYPE_DOES_NOT_EXIST = 762;

    /**
     * This Constant is used to specify rate type is marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_TYPE_MARKED_FOE_DELETION = 763;

    /**
     * This Constant is used to specify rate type is not allowed for rate
     * source.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_TYPE_NOT_ALLOWED_FOR_RATE_SOURCE = 764;

    /**
     * This Constant is used to specify rate class not exists.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_CLASS_DOES_NOT_EXIST = 765;

    /**
     * This Constant is used to specify rate class is not allowed for
     * TariffRate.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_CLASS_NOT_ALLOWED_FOR_TARIFF_RATE = 766;

    /**
     * This Constant is used to specify rate class is not allowed for IATA rate
     * type.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_CLASS_NOT_ALLOWED_FOR_IATA_RATE_TYPE = 767;

    /**
     * This Constant is used to specify rate class is not allowed for ATPCO rate
     * type.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_CLASS_NOT_ALLOWED_FOR_ATPCO_RATE_TYPE = 768;

    /**
     * This Constant is used to specify ULD type is mandatory for rate class.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_TYPE_MANDATORY_FOR_RATE_CLASS = 769;

    /**
     * This Constant is used to specify ULD charge code is mandatory for rate
     * class.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_CHARGE_CODE_MANDATORY_FOR_RATE_CLASS = 770;

    /**
     * This Constant is used to specify commodity number is mandatory for rate
     * class.
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_NUMBER_MANDATORY_FOR_RATE_CLASS = 771;

    /**
     * This Constant is used to specify whether minimum weight is mandatory for
     * rate class.
     * <p>
     * Value = {@value}
     */
    public static final int MINIMUN_WEIGHT_MANDATORY_FOR_RATE_CLASS = 772;

    /**
     * This Constant is used to specify ULD type is not allowed for rate class.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_TYPE_NOT_ALLOWED_FOR_RATE_CLASS = 773;

    /**
     * This Constant is used to specify ULD charge code is not allowed for rate
     * class.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_CHARGE_CODE_NOT_ALLOWED_FOR_RATE_CLASS = 774;

    /**
     * This Constant is used to specify commodity number is not allowed for rate
     * class.
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_NUMBER_NOT_ALLOWED_FOR_RATE_CLASS = 775;

    /**
     * This Constant is used to specify minimum weight is not allowed for rate
     * class.
     * <p>
     * Value = {@value}
     */
    public static final int MINIMUN_WEIGHT_NOT_ALLOWED_FOR_RATE_CLASS = 776;

    /**
     * This Constant is used to specify whether the ULD charge code mandatory
     * for rate class U and E.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_CHARGE_CODE_MANDATORY_FOR_RATE_CLASS_U_AND_E = 777;

    /**
     * This Constant is used to specify whether the commodity number exists.
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_NUMBER_DOES_NOT_EXIST = 778;

    /**
     * This Constant is used to specify whether the commodity number is marked
     * for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_NUMBER_MARKED_FOR_DELETION = 779;

    /**
     * This Constant is used to specify whether the ULD type exists.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_TYPE_DOES_NOT_EXIST = 780;

    /**
     * This Constant is used to specify whether the ULD type is marked for
     * deletion.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_TYPE_MARKED_DELETION = 781;

    /**
     * This Constant is used to specify whether the ULD charge code exists or
     * not.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_CHARGE_CODE_DOES_NOT_EXIST = 782;

    /**
     * This Constant is used to specify whether the ULD charge code is allowed
     * for ATPCO.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_CHARGE_CODE_NOT_ALLOWED_FOR_ATPCO = 783;

    /**
     * This Constant is used to specify whether the rate class is not for ULD
     * charge code.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_CLASS_NOT_FOR_ULD_CHARGE_CODE = 784;

    /**
     * This Constant is used to specify whether the rate note exists or not.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_NOTE_DOES_NOT_EXIST = 785;

    /**
     * This Constant is used to specify whether the rating note is marked for
     * deletion.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_NOTE_MARKED_FOR_DELETION = 786;

    /**
     * This Constant is used to specify whether minimum weight is greater than
     * maximum chargeable weight.
     * <p>
     * Value = {@value}
     */
    public static final int MINIMUM_WEIGHT_GREATER_THAN_MAXIMUM_CHARGEABLE_WEIGHT = 787;

    /**
     * This Constant is used to specify whether minimum weight is greater than
     * maximum gross weight.
     * <p>
     * Value = {@value}
     */
    public static final int MINIMUM_WEIGHT_GREATER_THAN_MAXIMUM_GROSS_WEIGHT = 788;

    /**
     * This Constant is used to specify whether minimum weight is zero for rate
     * class B and M.
     * <p>
     * Value = {@value}
     */
    public static final int MINIMUM_WEIGHT_ZERO_FOR_RATE_CLASS_B_AND_M = 789;

    /**
     * This Constant is used to specify whether minimum weight is one for rate
     * class N.
     * <p>
     * Value = {@value}
     */
    public static final int MINIMUM_WEIGHT_ONE_FOR_RATE_CLASS_N = 790;

    /**
     * This Constant is used to specify whether minimum weight is greater than
     * zero for rate class K.
     * <p>
     * Value = {@value}
     */
    public static final int MINIMUM_WEIGHT_GREATER_THAN_ZERO_FOR_RATE_CLASS_K = 791;

    /**
     * This Constant is used to specify whether minimum weight is greater than
     * one for rate class Q.
     * <p>
     * Value = {@value}
     */
    public static final int MINIMUM_WEIGHT_GREATER_THAN_ONE_FOR_RATE_CLASS_Q = 792;

    /**
     * This Constant is used to specify whether minimum weight is zero for rate
     * class U.
     * <p>
     * Value = {@value}
     */
    public static final int MINIMUM_WEIGHT_ZERO_FOR_RATE_CLASS_U = 793;

    /**
     * This Constant is used to specify whether minimum weight is greater than
     * one for rate class U.
     * <p>
     * Value = {@value}
     */
    public static final int MINIMUM_WEIGHT_EQUAL_OR_GREATER_THAN_ONE_FOR_RATE_CLASS_U = 794;

    /**
     * This Constant is used to specify whether number of decimal in rate and
     * currency must is same.
     * <p>
     * Value = {@value}
     */
    public static final int NUMBER_OF_DECIMAL_IN_RATE_AND_CURRENCY_MUST_SAME = 795;

    /**
     * This Constant is used to specify whether rate must be round off.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_MUST_BE_ROUNDED_OFF = 796;

    /**
     * This Constant is used to specify whether pivot rate allowed for ATPCO ULD
     * rates.
     * <p>
     * Value = {@value}
     */
    public static final int PIVOT_WEIGHT_ALLOWED_ONLY_FOR_ATPCO_ULD_RATES = 797;

    /**
     * This Constant is used to specify whether over pivot rate allowed for
     * ATPCO ULD rates.
     * <p>
     * Value = {@value}
     */
    /* public static final int OVER_PIVOT_RATE_ALLOWED_ONLY_FOR_ATPCO_ULD_RATES = 798; */

    /**
     * This Constant is used to specify whether the number of decimal in over
     * pivot rate and currency same.
     * <p>
     * Value = {@value}
     */
    public static final int NUMBER_OF_DECIMAL_IN_OVER_PIVOT_RATE_AND_CURRENCY_MUST_SAME = 799;

    /**
     * This Constant is used to specify over pivot rate is round off.
     * <p>
     * Value = {@value}
     */
    public static final int OVER_PIVOT_RATE_MUST_BE_ROUNDED_OFF = 800;

    /**
     * This Constant is used to specify whether the effective date is future
     * date.
     * <p>
     * Value = {@value}
     */
    public static final int EFFECTIVE_DATE_MUST_BE_FUTURE_DATE = 801;

    /**
     * This Constant is used to specify whether the input effective date is
     * greater than or equal to currency effective date.
     * <p>
     * Value = {@value}
     */
    public static final int INPUT_EFFECTIVE_DATE_GREATER_THAN_OR_EQUAL_TO_CURRENCY_EFFECTIVE_DATE = 802;

    /**
     * This Constant is used to specify whether the input effective date is less
     * than or equal to currency effective date.
     * <p>
     * Value = {@value}
     */
    public static final int INPUT_EFFECTIVE_DATE_LESS_THAN_OR_EQUAL_TO_CURRENCY_EFFECTIVE_DATE = 803;

    /**
     * This Constant is used to specify whether the expiration date is future
     * date.
     * <p>
     * Value = {@value}
     */
    public static final int EXPIRATION_DATE_MUST_NOT_BE_PAST_DATE = 804;

    /**
     * This Constant is used to specify whether the expiration date is equal or
     * greater than effective date.
     * <p>
     * Value = {@value}
     */
    public static final int EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE = 805;

    /**
     * This Constant is used to specify whether the input expiration date is
     * less than or equal to currency expiration date.
     * <p>
     * Value = {@value}
     */
    public static final int INPUT_EXPIRATION_DATE_LESS_THAN_OR_EQUAL_TO_CURRENCY_EXPIRATION_DATE = 806;

    /**
     * This Constant is used to specify whether the expiration date can be
     * updated.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_ENTRY_EFFECTIVE_ONLY_EXPIRATION_DATE_CAN_BE_UPDATED = 807;

    /**
     * This Constant is used to specify whether the tariff rate has duplicate
     * entries.
     * <p>
     * Value = {@value}
     */
    public static final int TARIFF_RATE_ENTRIES_HAS_DUPLICATES = 808;

    /**
     * This Constant is used to specify whether the rate source rate type
     * carrier currency origin and destination different.
     * <p>
     * Value = {@value}
     */
    public static final int ORIGIN_DEST_CARRIER_CURRENCY_RATETYPE_RATESOURCE_MUST_BE_DIFFERENT = 809;

    /**
     * This Constant is used to specify whether the tariff rate found for origin
     * and destination.
     * <p>
     * Value = {@value}
     */
    public static final int NO_RATES_FOUND_FOR_ORIGIN_AND_DESTINATION = 810;

    /**
     * This Constant is used to specify whether the tariff rate can be deleted.
     * <p>
     * Value = {@value}
     */
    public static final int TARIFF_RATE_EFFECTIVE_CANT_BE_DELETED = 811;

    /**
     * This Constant is used to specify if the tariff rate is deleted
     * successfully.
     * <p>
     * Value = {@value}
     */
    public static final int TARIFF_RATE_DELETED_SUCCESSFULLY = 812;

    /**
     * This Constant is used to specify if the airport is marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int AIRPORT_MARKED_FOR_DELETION = 813;

    /**
     * This Constant is used to specify if the Origin and Destination are same.
     * <p>
     * Value = {@value}
     */
    public static final int ORIGIN_AND_DEST_ARE_SAME = 814;

    /**
     * This Constant is used to specify if the Tariff Carrier is modified
     * successfully.
     * <p>
     * Value = {@value}
     */
    public static final int TARIFF_CARRIER_MODIFIED = 815;

    /**
     * This Constant is used to specify if the Tariff Origin is modified
     * successfully.
     * <p>
     * Value = {@value}
     */
    public static final int TARIFF_ORIGIN_MODIFIED = 816;

    /**
     * This Constant is used to specify if the tariff rate is created
     * successfully.
     * <p>
     * Value = {@value}
     */
    public static final int TARIFF_RATE_CREATED_SUCCESSFULLY = 818;

    /**
     * This constant is used to state that TariffRate entries invalid.
     * <p>
     * Value = {@value}
     */
    public static final int TARIFF_RATE_ENTRIES_INAVLID = 819;

    /**
     * This Constant is used to specify that operation from time must be lesser
     * than the operation to time.
     * <p>
     * Value = {@value}
     */
    public static final int OPERATION_FROMTIME_LESSER_THAN_OPERATION_TOTIME = 820;

    /**
     * This Constant is used to specify the operation from time format.
     * <p>
     * Value = {@value}
     */
    public static final int OPERATION_FROMTIME_FORMAT = 821;

    /**
     * This Constant is used to specify the operation to time format.
     * <p>
     * Value = {@value}
     */
    public static final int OPERATION_TOTIME_FORMAT = 822;

    /**
     * This Constant is used to specify if the rate class is not allowed for
     * ATPCO rate type.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_CLASS_E_NOT_ALLOWED_FOR_ATPCO_RATE_SOURCE = 823;

    /**
     * This Constant is used to specify that operation from time and operation
     * to time must be present.
     * <p>
     * Value = {@value}
     */
    public static final int VALID_FROM_TO_TIME = 824;

    /**
     * This Constant is used to specify if the Tariff Destination is modified
     * successfully.
     * <p>
     * Value = {@value}
     */

    public static final int TARIFF_DESTINATION_MODIFIED = 817;

    /**
     * This Constant is used to specify the aggregate is not allowed for tariff
     * rate.
     * <p>
     * Value = {@value}
     */
    public static final int AGGREGATE_NOT_ALLOWED_FOR_TARIFF_RATE = 826;

    /**
     * This Constant is used to specify create or update not allowed without
     * tariff rate entries.
     * <p>
     * Value = {@value}
     */

    public static final int TARIFF_RATES_ENTRIES_REQUIRED = 827;

    /**
     * This Constant is used to specify the minimum weight between 0 and 1 is
     * allowed for rate class N with Bulk over Pivot type of rating for rate
     * type.
     * <p>
     * Value = {@value}
     */

    public static final int MINIMUMWEIGHT_0_TO_1_FOR_RATECLASS_N_BULKOVERPIVOT = 828;

    /**
     * This Constant is used to specify the minimum weight of 1 is allowed for
     * rate class N with Standard or Rate per Piece Type of rating for rate
     * type.
     * <p>
     * Value = {@value}
     */

    public static final int MINIMUMWEIGHT_1_FOR_RATECLASS_N_STANDARD_RATEPERPIECE = 829;

    /**
     * This Constant is used to specify if the tariff rate is updated
     * successfully.
     * <p>
     * Value = {@value}
     */
    public static final int TARIFF_RATE_UPDATED_SUCCESSFULLY = 830;

    /**
     * This Constant is used to specify RateType display priority is required.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_TYPE_DISPLAY_PRIORITY_REQUIRED = 831;

    /**
     * This Constant is used to specify Pivot Rate allowed for Bulk over pivot.
     * <p>
     * Value = {@value}
     */
    public static final int OVER_PIVOT_RATE_NOT_ALLOWED_FOR_BULK_OVER_PIVOT = 832;

    /**
     * This Constant is used to specify Pivot Rate allowed for standard.
     * <p>
     * Value = {@value}
     */
    public static final int OVER_PIVOT_RATE_NOT_ALLOWED_FOR_STANDARD = 833;

    /**
     * This Constant is used to specify Pivot Rate allowed for standard.
     * <p>
     * Value = {@value}
     */
    public static final int MINIMUM_WEIGHT_GREATER_THAN_ZERO_ATPCO = 834;

    public static final int RATING_CONVENTION_MANDATORY_FOR_COMMODITY_CODE = 835;

    /**
     * This Constant is used to specify that flight frequency is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int FLIGHT_FREQUENCY_IS_MANDATORY = 836;

    /**
     * This Constant is used to specify that flight number is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int FLIGHT_NUMBER_IS_MANDATORY = 837;
    public static final int CARRIER_CODE_MANDATORY = 838;
    public static final int INVALID_CARRIER_CODE = 839;
    public static final int NO_HOST_CARRIER_AUTHORITY = 840;
    public static final int NOT_AUTHORIZED_TO_VIEW_SRA_DETAILS = 841;
    public static final int NOT_AUTHORIZED_TO_CREATE_COMMODITY = 842;
    public static final int COMMODITY_EXIST_FOR_OTHER_CARRIERS = 843;
    public static final int NOT_AUTHORIZED_TO_VIEW_CONTRACT_DETAILS = 1158;
    public static final int HOST_CARRIER_ONLY_ALLOWDED = 844;
    public static final int INVALID_PARTICIPANT_FOR_USER = 845;
    public static final int AT_LEASE_ONE_OF_THE_CARRIER_CODE_SHOULD_MAP_WITH_LOGGED_IN_USER = 846;
    public static final int PRODUCT_AND_COMMODITY_SHOULD_HAVE_SAME_CARRIER = 847;
    public static final int AT_LEASE_ONE_OF_THE_CARRIER_CODE_OF_PRODUCT_SHOULD_MAP_WITH_LOGGED_IN_USER = 848;

    /**********************************************************/
    /** End OF UC045 - Maintain Tariff Rates **/
    /**********************************************************/

    /**********************************************************/
    /** Start OF UC094 - Maintain Contracts **/
    /**********************************************************/

    /**
     * This Constant is used to specify Contract number is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_NUMBER_MANDATORY = 901;

    /**
     * This Constant is used to specify Contract number must be alphanumeric.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_NUMBER_MUST_ALPHANUMERIC = 902;

    /**
     * This Constant is used to specify The Active filter must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ACTIVE_FILTER_MUST_YES_NO = 903;

    /**
     * This Constant is used to specify The Pending filter must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PENDING_FILTER_MUST_YES_NO = 904;

    /**
     * This Constant is used to specify The Expired filter must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_EXPIRED_FILTER_MUST_YES_NO = 905;

    /**
     * This Constant is used to specify The History filter must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_HISTORY_FILTER_MUST_YES_NO = 906;

    /**
     * This Constant is used to specify The Deleted filter must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_DELETED_FILTER_MUST_YES_NO = 907;

    /**
     * This Constant is used to specify At least one of the Active, Pending,
     * Expired, History, Deleted filter is required.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ATLEAST_ONE_FILTER_REQUIRED = 908;

    /**
     * This Constant is used to specify The Effective Date is required.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_EFFECTIVE_DATE_REQUIRED = 909;

    /**
     * This Constant is used to specify The Effective Date must be of DDMMMYY
     * format.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_EFFECTIVE_DATE_FORMAT = 910;

    /**
     * This Constant is used to specify The Expiration Date must be of DDMMMYY
     * format or ‘INDEF’.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_EXPIRATION_DATE_FORMAT = 911;

    /**
     * This Constant is used to specify The Origin Code must be 1-7 alphanumeric
     * characters.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ORIGIN_CODE_ALPHANUMERIC = 912;

    /**
     * This Constant is used to specify The Origin Code is required if All
     * Origin is not Yes.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ORIGIN_CODE_REQ_IF_ALLORIGIN_NOT_YES = 913;

    /**
     * This Constant is used to specify The Origin Code is not allowed if All
     * Origin is Yes.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ORIGIN_CODE_NOT_ALLOWED_IF_ALLORIGIN_YES = 914;

    /**
     * This Constant is used to specify The Destination must be 1-7 alphanumeric
     * characters.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_DEST_CODE_ALPHANUMERIC = 915;

    /**
     * This Constant is used to specify The Destination Code is required if All
     * Destination is not ‘Yes’.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_DEST_CODE_REQ_IF_ALLDEST_NOT_YES = 916;

    /**
     * This Constant is used to specify The Destination Code is not allowed if
     * All Destination is Yes.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_DEST_CODE_NOT_ALLOWED_IF_ALLDEST_YES = 917;

    /**
     * This Constant is used to specify The valid Carrier Code format is 2A,
     * 1A1N, or 1N1A or ‘YYY’.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_INVALID_CARRIER_CODE = 918;

    /**
     * This Constant is used to specify The Carrier Code is required if there
     * are no-multi segment routings entered.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CARRIERCODE_REQ_IF_NO_MULSEG_ROUTINGS = 919;

    /**
     * This Constant is used to specify The Allow Routing Compression must be
     * Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ALLOW_ROUTING_COMPRESSION_MUST_YES_NO = 920;

    /**
     * This Constant is used to specify The Allow Routing Compression is not
     * allowed if Carrier Code is not entered.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ALLOW_ROUTING_COMPRESSION_NOT_ALLOWED = 921;

    /**
     * This Constant is used to specify The Origin/Destination Pay Code must be
     * Prepaid, Collect or Either.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ORIGIN_DEST_PAYCODE_INVALID = 922;

    /**
     * This Constant is used to specify The Origin/Destination Pay Code is
     * required.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ORIGIN_DEST_PAYCODE_REQUIRED = 923;

    /**
     * This Constant is used to specify The Destination/Origin Pay Code must be
     * Prepaid, Collect or Either.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_DEST_ORIGIN_PAYCODE_INVALID = 924;

    /**
     * This Constant is used to specify The Destination/Origin Pay Code is
     * required if Bi-Directional Indicator is Yes.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_DEST_ORIGIN_PAYCODE_REQ_IF_BIDIRECTIONAL_IND_YES = 925;

    /**
     * This Constant is used to specify The Destination/Origin Pay Code is not
     * allowed if Bi-directional Indicator is No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_DEST_ORIGIN_PAYCODE_REQ_IF_BIDIRECTIONAL_IND_NO = 926;

    /**
     * This Constant is used to specify The Bi-Directional Indicator must be Yes
     * or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_BIDIRECTIONALIND_MUST_YES_NO = 927;

    /**
     * This Constant is used to specify The Special Notes must be 1-240
     * characters.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_SPECIAL_NOTES_EXCEEDS = 928;

    /**
     * This Constant is used to specify The Currency Code must be 3 alphabetic
     * characters.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CURRENCY_CODE_INVALID = 929;

    /**
     * This Constant is used to specify The Currency Code is required if all
     * Contract Definition lines are ‘Percent Reduction’.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CURRENCY_CODE_REQ_FOR_PERCENT_REDUCTION = 930;

    /**
     * This Constant is used to specify The Weight Unit must be KG, LB or EACH.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_WEIGHT_UNIT_INVALID = 931;

    /**
     * This Constant is used to specify The Weight Unit must be EACH only if ULD
     * Type is entered or All ULD Type Indicator is set to “Yes”.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_WEIGHT_UNIT_FOR_ULDTYPE_IND = 932;

    /**
     * This Constant is used to specify The Use With Add-Ons must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ADD_ONS_MUST_YES_NO = 933;

    /**
     * This Constant is used to specify The Agent Commission must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_AGENT_COMM_MUST_YES_NO = 934;

    /**
     * This Constant is used to specify The Contract Priority must be 1 through
     * 9.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PRIORITY_INVALID = 935;

    /**
     * This Constant is used to specify The Special Handling Codes must be 3
     * alphabetic characters.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_SPL_CODES_INVALID = 936;

    /**
     * This Constant is used to specify More than 5 Special Handling Codes are
     * not allowed for Special Handling Code Rule ALL.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MORE_THAN_FIVE_SPLCODE_NOT_ALLOWED = 937;

    /**
     * This Constant is used to specify More than 10 Special Handling Codes are
     * not allowed for Special Handling Code Rule ANY or NOT.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MORE_THAN_TEN_SPLCODE_NOT_ALLOWED = 938;

    /**
     * This Constant is used to specify The Special Handling Code Rule must be
     * ANY, ALL or NOT.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_SPL_CODE_INVALID = 939;

    /**
     * This Constant is used to specify The Enforce Hurdle Rates is not allowed
     * if “Revenue Management Interface” dynamic parameter value is ‘N’.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ENFORCE_HURDLE_RATES_NOT_ALLOWED = 940;

    /**
     * This Constant is used to specify The Enforce Hurdle Rates must be Yes or
     * No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ENFORCE_HURDLE_RATES_MUST_YES_NO = 941;

    /**
     * This Constant is used to specify The Multi-Segment Origin Code must be
     * 1-7 alphanumeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_ORIGINCODE_MUST_ALPHANUMERIC = 942;

    /**
     * This Constant is used to specify The Multi-Segment Origin Code must be
     * Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_ORIGINCODE_MUST_YES_NO = 943;

    /**
     * This Constant is used to specify The Multi-Segment Origin Code is
     * required if Multi-Segment All Origin is No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_ORIGIN_CODE_REQ_IF_ALLORIGIN_NO = 944;

    /**
     * This Constant is used to specify The Multi-Segment Allow Routing
     * Compression must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_ALLOW_ROUTING_COMPRESSION_MUST_YES_NO = 945;

    /**
     * This Constant is used to specify The Multi-Segment Intermediate Station
     * Code must be 1-7 alphanumeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_INTERMED_STATION_MUST_ALPHANUMERIC = 946;

    /**
     * This Constant is used to specify The Multi-Segment Intermediate Station
     * Code is required if Multi-Segment Origin Code is entered.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_INTERMED_STATION_REQ_FOR_ORIGINCODE = 947;

    /**
     * This Constant is used to specify The Multi-Segment Intermediate Station
     * Code is required if Multi-Segment All Origin is Yes.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_INTERMED_STATION_REQ_FOR_ALLORIGIN = 948;

    /**
     * This Constant is used to specify At least two Multi-Segment Intermediate
     * Station Codes are required per Multi-Segment Origin Code.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ALTEAST_TWO_MULSEG_STATION_REQ_FOR_PER_MULSEG_ORIGIN = 949;

    /**
     * This Constant is used to specify More than four Multi-Segment
     * Intermediate Station Codes are not allowed per Multi-Segment Origin Code.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MORE_THAN_FOUR_MULSEG_STATION_NOT_ALLOWED_PER_MULSEG_ORIGIN = 950;

    /**
     * This Constant is used to specify The Multi-Segment Intermediate Station
     * Code is required if Multi-Segment All Intermediate Station is No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_STATION_REQ_FOR_ALL_MULSEG_INTERMED_STATION = 951;

    /**
     * This Constant is used to specify The valid Multi-Segment Carrier Code
     * format is 2A, 1A1N, or 1N1A or ‘YYY’.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_CARRIERCODE_INVALID = 952;

    /**
     * This Constant is used to specify At least one Multi-Segment Carrier Code
     * is required.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ATLEAST_ONE_MULSEG_CARRIERCODE_REQ = 953;

    /**
     * This Constant is used to specify More than 4 Multi-Segment Carrier Codes
     * are not allowed per Multi-Segment Intermediate Station Code.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MORE_THAN_FOUR_MULSEG_CARRIERCODE_ALLOWED_PER_MULSEG_INTERMED_STATION =
                954;

    /**
     * This Constant is used to specify The Participant or Participant Group
     * Account Number must be 1-14 alphanumeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PARTICIPANT_GROUP_NUMBER_ALPHANUMERIC = 955;

    /**
     * This Constant is used to specify At least one Participant Account Number
     * is required.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ATLEAST_ONE_PARTICIPANT_ACCOUNTNO_REQUIRED = 956;

    /**
     * This Constant is used to specify The Responsible Party must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RESPONSIBLE_PARTY_MUST_YES_NO = 957;

    /**
     * This Constant is used to specify The Responsible Party is not allowed for
     * additional Participant Account Numbers.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RESPONSIBLE_PARTY_NOT_ALLOWED_FOR_ADD_PAR_ACCNOS = 958;

    /**
     * This Constant is used to specify The Responsible Party must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_SHIPPER_MUST_YES_NO = 959;

    /**
     * This Constant is used to specify The Shipper is not allowed if
     * Responsible Party is Yes.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_SHIPPER_NOT_ALLOWED_FOR_RESPONSIBLE_PARTY = 960;

    /**
     * This Constant is used to specify The Consignee must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CONSIGNEE_MUST_YES_NO = 961;

    /**
     * This Constant is used to specify The Consignee is not allowed if
     * Responsible Party is Yes.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CONSIGNEE_NOT_ALLOWED_FOR_RESPONSIBLE_PARTY = 962;

    /**
     * This Constant is used to specify The Forwarder must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_FORWARDER_MUST_YES_NO = 963;

    /**
     * This Constant is used to specify The Forwarder is not allowed if
     * Responsible Party is Yes.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_FORWARDER_NOT_ALLOWED_FOR_RESPONSIBLE_PARTY = 964;

    /**
     * This Constant is used to specify The Agent must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_AGENT_MUST_YES_NO = 965;

    /**
     * This Constant is used to specify The Agent is not allowed if Responsible
     * Party is Yes.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_AGENT_NOT_ALLOWED_FOR_RESPONSIBLE_PARTY = 966;

    /**
     * This Constant is used to specify The Bill-To Shipper must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_BILL_TO_SHIPPER_MUST_YES_NO = 967;

    /**
     * This Constant is used to specify The Bill-To Shipper is not allowed if
     * Responsible is Yes.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_BILL_TO_SHIPPER_NOT_ALLOWED_FOR_RESPONSIBLE_PARTY = 968;

    /**
     * This Constant is used to specify The Bill-To Consignee must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_BILL_TO_CONSIGNEE_MUST_YES_NO = 969;

    /**
     * This Constant is used to specify The Bill-To Consignee is not allowed if
     * Responsible Party is Yes.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_BILL_TO_CONSIGNEE_NOT_ALLOWED_FOR_RESPONSIBLE_PARTY = 970;

    /**
     * This Constant is used to specify The Flight is not allowed if All Flights
     * Indicator is Yes.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_FLIGHT_NOT_ALLOWED_FOR_ALLFLIGHTIND_YES = 971;

    /**
     * This Constant is used to specify The Flight is not allowed if Allotment
     * Id is entered.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_FLIGHT_NOT_ALLOWED_FOR_ALLOTMENTID = 972;

    /**
     * This Constant is used to specify The Flight Carrier Code must be two
     * alphanumeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_FLIGHT_CARRIERCODE_MUST_ALPHANUMERIC = 973;

    /**
     * This Constant is used to specify The Flight Number must be 3-4 digit
     * numeric.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_FLIGHT_NUMBER_INVALID = 974;

    /**
     * This Constant is used to specify The Flight Suffix must be one alphabetic
     * character.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_FLIGHT_SUFFIX_MUST_ONE_ALPHABET = 975;

    /**
     * This Constant is used to specify The All Flights Indicator must be Yes or
     * No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ALLFLIGHTSIND_MUST_YES_NO = 976;

    /**
     * This Constant is used to specify The Flight Operation From Time must be
     * four digit numeric.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_FLIGHT_OPERATION_FROM_TIME_INVALID = 977;

    /**
     * This Constant is used to specify The Flight Operation From Time is not
     * allowed if All Flights Indicator is No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_FLIGHT_OPERATION_FROM_TIME_NOT_ALLOWED_IF_ALL_DAY = 978;

    /**
     * This Constant is used to specify The Flight Operation To Time must be
     * four digit numeric.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_FLIGHT_OPERATION_TO_TIME_INVALID = 979;

    /**
     * This Constant is used to specify The Flight Operation To Time is not
     * allowed if All Flights Indicator is No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_FLIGHT_OPERATION_TO_TIME_NOT_ALLOWED_IF_ALL_DAY = 980;

    /**
     * This Constant is used to specify The Flight Operation Day must be Monday
     * through Sunday.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_FLIGHT_OPERATION_DAY_MUST_MON_THROUGH_SUN = 981;

    /**
     * This Constant is used to specify The Flight Operation Day is required if
     * Flight is entered.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_FLIGHT_OPERATION_DAY_REQUIRED = 982;

    /**
     * This Constant is used to specify The Flight Operation Day is required if
     * All Flights Indicator is Yes.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_FLIGHT_OPERATION_DAY_REQ_IF_ALLFLIGHTIND_YES = 983;

    /**
     * This Constant is used to specify The Flight Operation Day is required if
     * Allotment Id is entered.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_FLIGHT_OPERATION_DAY_REQ_FOR_ALLOTMENT_ID = 984;

    /**
     * This Constant is used to specify Only a maximum of seven Flight Operation
     * Days can be entered.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MAX_SEVEN_FLIGHT_OPERATION_DAYS = 985;

    /**
     * This Constant is used to specify The Flight Operation Days must not be
     * duplicate.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_DUPLICATE_FLIGHT_OPERATION_DAYS_NOT_NOT_ALLOWED = 986;

    /**
     * This Constant is used to specify The Cargo Classification – Passenger
     * must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CARGO_CLASSIFICATION_PASSENGER_MUST_YES_NO = 987;

    /**
     * This Constant is used to specify The Cargo Classification – Passenger is
     * not allowed if All Flights Indicator is No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CARGO_CLASSIFICATION_PASSENGER_NOT_ALLOWED_IF_ALLFLIGHTIND_NO = 988;

    /**
     * This Constant is used to specify The Cargo Classification – Freighter
     * must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CARGO_CLASSIFICATION_FREIGHTER_MUST_YES_NO = 989;

    /**
     * This Constant is used to specify The Cargo Classification – Freighter is
     * not allowed if All Flights Indicator is No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CARGO_CLASSIFICATION_FREIGHTER_NOT_ALLOWED_IF_ALLFLIGHTIND_NO = 990;

    /**
     * This Constant is used to specify The Cargo Classification – Combination
     * must be Yes or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CARGO_CLASSIFICATION_COMBINATION_MUST_YES_NO = 991;

    /**
     * This Constant is used to specify The Cargo Classification – Combination
     * is not allowed if All Flights Indicator is No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CARGO_CLASSIFICATION_COMBINATION_NOT_ALLOWED_IF_ALLFLIGHTIND_NO = 992;

    /**
     * This Constant is used to specify At least one of the Cargo
     * Classifications (Passenger/Freighter/Combination) must be Yes if All
     * Flights Indicator is Yes.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ATLEAST_ONE_OF_THE_CARGO_CLASSIFICATION_MUST_YES = 993;

    /**
     * This Constant is used to specify The Allotment Id must be 1-14
     * alphanumeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ALLOTMENT_ID_MUST_ALPHANUMERIC = 994;

    /**
     * This Constant is used to specify The Allotment Id is not allowed if
     * Flight is entered or if All Flights Indicator is Yes.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ALLOTMENT_ID_NOT_ALLOWED_IF_FLIGHT_OR_FLIGHTIND_PRESENT = 995;

    /**
     * This Constant is used to specify The valid values for Contract Definition
     * are PERCENT (Percent Reduction), PRICE (Price Reduction), FIXED (Fixed
     * Rate) or FLAT (Flat Rate).
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_DEFINITION_INVALID = 996;

    /**
     * This Constant is used to specify The Contract Definition is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_DEFINITION_MANDATORY = 997;

    /**
     * This Constant is used to specify The Rate Source must be three alphabetic
     * characters.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RATE_SOURCE_MUST_THREE_ALPHA = 998;

    /**
     * This Constant is used to specify The Rate Source is required if Contract
     * Definition is PERCENT (Percent Reduction), PRICE (Price Reduction).
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RATE_SOURCE_REQ_IF_CONTRACT_DEFINITION_PERCENT_OR_PRICE = 999;

    /**
     * This Constant is used to specify The Rate Type must be three alphabetic
     * characters.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RATE_TYPE_MUST_THREE_ALPHA = 1000;

    /**
     * This Constant is used to specify The Rate Class must be one alphabetic
     * character.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RATE_CLASS_MUST_ONE_ALPHA = 1001;

    /**
     * This Constant is used to specify The Rate Class is required if Contract
     * Definition is FIXED (Fixed Rate) or FLAT (Flat Rate).
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RATE_CLASS_REQ_IF_CONTRACT_DEFINITION_FIXED_OR_FLAT = 1002;

    /**
     * This Constant is used to specify The valid Rate Classes are M, N, Q, C, U
     * and K for FIXED (Fixed Rate) Contract Definition.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RATE_CLASS_INVALID_FOR_FIXED_PERCENT_PRICE = 1003;

    /**
     * This Constant is used to specify The valid Rate Classes are U for FLAT
     * (Flat Rate) Contract Definition .
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RATE_CLASS_INVALID_FOR_FLAT = 1004;

    /**
     * This Constant is used to specify The valid Rate Classes are M, N, Q, C, U
     * and K for PERCENT (Percent Reduction) and PRICE (Price Reduction)
     * Contract Definitions.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RATE_CLASS_INVALID_FOR_PERCENT_AND_PRICE = 1005;

    /**
     * This Constant is used to specify The Commodity Number must be
     * (1a)1n3x(1a) alphanumeric.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_COMMODITY_NUMBER_MUST_ALPHANUMERIC = 1006;

    /**
     * This Constant is used to specify The Commodity Number is not allowed if
     * Class Rating ID is entered or if All Commodity Indicator is set to “Yes”.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_COMMODITY_NUMBER_NOT_ALLOWED = 1007;

    /**
     * This Constant is used to specify The Commodity Type is required if
     * Commodity Number is entered.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_COMMODITY_TYPE_REQUIRED = 1008;

    /**
     * This Constant is used to specify The Commodity Type must be ‘I’ for IATA
     * or ‘D’ for ATPCO.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_COMMODITY_TYPE_MUST_I_OR_A = 1009;

    /**
     * This Constant is used to specify The All Commodity Indicator must be Yes
     * or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ALL_COMMODITY_MUST_YES_OR_NO = 1010;

    /**
     * This Constant is used to specify The All Commodity Indicator must be set
     * to “No” if Class Rating ID or Commodity Number is entered.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ALL_COMMODITYIND_SET_NO_IF_CLASSRATINGID_OR_COMMODITYIND_PRESENT = 1011;

    /**
     * This Constant is used to specify The Class Rating ID must be 3-6
     * alphanumeric with first two characters being alphabetic.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CLASSRATING_ID_ALPHANUMERIC = 1012;

    /**
     * This Constant is used to specify The Class Rating ID is not allowed if
     * Commodity Number is entered or if All Commodity Indicator is set to
     * “Yes”.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CLASSRATING_ID_NOT_ALLOWED_IF_CLASSRATINGID_OR_COMMODITYIND_YES = 1013;

    /**
     * This Constant is used to specify The Class Rating ID is not allowed for
     * FLAT (Flat Rate) Contract Definition.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CLASSRATING_ID_NOT_ALLOWED_FLAT_DEFINITON = 1014;

    /**
     * This Constant is used to specify The ULD Type must be 1-4 AN.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ULDTYPE_MUST_ALPHANUMERIC = 1015;

    /**
     * This Constant is used to specify The ULD Type is not allowed if All ULD
     * Type Indicator is set to “Yes” or if the Class Rating ID is entered.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ULDTYPE_NOT_ALLOWED_IF_CLASSRATINGID_OR_ALLULDTYPEIND_YES = 1016;

    /**
     * This Constant is used to specify The All ULD Type Indicator must be Yes
     * or No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ALL_ULDTYPE_MUST_YES_OR_NO = 1017;

    /**
     * This Constant is used to specify The All ULD Type Indicator is prohibited
     * for FLAT (Flat Rate) and FIXED (Fixed Rate) Contract Definitions.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ALL_ULDTYPEIND_PROHIBITED_FOR_FLAT_AND_FIXED = 1018;

    /**
     * This Constant is used to specify The ULD Charge Code must be one
     * alphabetic character.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ULDCHARGE_CODE_MUST_ONE_ALPHA = 1019;

    /**
     * This Constant is used to specify The ULD Charge Code valid values are A,
     * B, D, F, H, I, J, and blank.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ULDCHARGE_CODE_INVALID = 1020;

    /**
     * This Constant is used to specify The ULD Charge is not allowed if
     * non-IATA Rate Source is entered. The ULD Charge is allowed only if the
     * Rate Source follows IATA-rating convention.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ULDCHARGE_CODE_NOT_ALLOWED_FOR_NON_IATA = 1021;

    /**
     * This Constant is used to specify The Minimum Weight must have 1-5 digits
     * to the left of decimal point and 0-1 digit to the right of the decimal
     * point.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MINIMUM_WEIGHT_INVALID = 1022;

    /**
     * This Constant is used to specify The Minimum Weight is not allowed if All
     * Minimum Weight is set to “Yes” .
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MINIMUM_WEIGHT_NOT_ALLOWED_IF_ALLMINWEIGHT_YES = 1023;

    /**
     * This Constant is used to specify The All Minimum Weight must be Yes or
     * No.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ALL_MINIMUM_WEIGHT_MUST_YES_OR_NO = 1024;

    /**
     * This Constant is used to specify The All Minimum Weight is not allowed
     * for FIXED (Fixed Rate), FLAT (Flat Rate) Contract Definitions.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ALL_MINIMUM_WEIGHT_NOT_ALLOWED_FOR_FLAT_AND_FIXED = 1025;

    /**
     * This Constant is used to specify The Rate Adjustment Weight must have 1-9
     * digits to the left of the decimal point and 0-4 digits to the right of
     * the decimal point.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RATE_ADJUSTMENT_WEIGHT_INVALID = 1026;

    /**
     * This Constant is used to specify The Rate Adjustment is required for FLAT
     * (Flat Rate) Contract Definition.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RATE_ADJUSTMENT_WEIGHT_REQUIRED_FOR_FLAT_DEFINITION = 1027;

    /**
     * This Constant is used to specify The Pivot Weight must be 1-5 digit
     * numbers.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PIVOT_WEIGHT_INVALID = 1028;

    /**
     * This Constant is used to specify The Pivot Weight is allowed only for
     * FIXED (Fixed Rate) Contract Definition with U Rate Class.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PIVOT_WEIGHT_ALLOWED_ONLY_IF_FIXED_U_RATE_CLASSES = 1029;

    /**
     * This Constant is used to specify The Over Pivot / B Rate must have 1-7
     * digits to the left of the decimal point and 0-4 digits to the right of
     * the decimal point.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_OVER_PIVOT_B_RATE_INVALID = 1030;

    /**
     * This Constant is used to specify Over Pivot / B Rate is allowed only for
     * Rate Classes U, K and Q.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_OVER_PIVOT_B_RATE_ALLOWED_FOR_VALID_RATECLASSES = 1031;

    /**
     * This Constant is used to specify The Minimum Shipment Size must be 1-5
     * digits number.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MIN_SHIPMENT_SIZE_INVALID = 1032;

    /**
     * This Constant is used to specify The Contract Rating Line Weight Unit
     * valid values are KG, LB or EACH.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RATING_LINE_WEIGHT_INVALID = 1033;

    /**
     * This Constant is used to specify The Contract Rating Line Weight Unit is
     * mandatory if Weight Unit is blank.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RATING_LINE_WEIGHT_MANDATORY = 1034;

    /**
     * This Constant is used to specify The Participant Account Number must be
     * 1-14 alphanumeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PARTICIPANT_ACCOUNT_NUMBER_ALPHANUMERIC = 1035;

    /**
     * This Constant is used to specify The Participant Account Number is
     * required if Participant Name is not entered.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PARTICIPANT_NAME_REQUIRED = 1036;

    /**
     * This Constant is used to specify The Participant Name must be 1-35
     * characters.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PARTICIPANT_NAME_ALPHANUMERIC = 1037;

    /**
     * This Constant is used to specify The Participant Station is not allowed
     * if Participant Name is not entered.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PARTICIPANT_STATION_NOT_ALLOWED = 1038;

    /**
     * This Constant is used to specify At least any one in Active, Pending,
     * Expired, History, Deleted must be Yes.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ATLEAST_ONE_FILTER_MUST_YES = 1039;

    /**
     * This Constant is used to specify The Contract Number does not exist in
     * the system.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_NUMBER_DOES_NOT_EXIST = 1040;

    /**
     * This Constant is used to specify No contracts found for the Input
     * Contract Number and Active, Pending, Expired, History, Deleted filters
     * combination.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_NOT_FOUND = 1041;

    /**
     * This Constant is used to specify Contract version does not exist in the
     * system.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_VERSION_DOES_NOT_EXIST = 1042;

    /**
     * This Constant is used to specify Expired, History and Deleted contract
     * versions cannot be deleted.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_E_OR_H_D_CONTRACT_VERSIONS_CANT_DELETE = 1043;

    /**
     * This Constant is used to specify Expired, History and Deleted contract
     * versions cannot be update.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_E_OR_H_D_CONTRACT_VERSIONS_CANT_UPDATE = 1044;

    /**
     * This Constant is used to specify Contract is not marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_NOT_MARKED_FOR_DELETION = 1045;

    /**
     * This Constant is used to specify User not authorized for this contract
     * routing.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_USER_NOT_AUTHORIZED = 1046;

    /**
     * This Constant is used to specify The Expiration Date is required.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_EXPIRATION_DATE_REQUIRED = 1047;

    /**
     * This Constant is used to specify The Expiration Date must not precede
     * Effective Date.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_EXPIRATION_DATE_MUST_NOT_PRECEDE_EFFECTIVE_DATE = 1048;

    /**
     * This Constant is used to specify Only one Pending version is allowed.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ONLY_ONE_PENDING_VERSION_ALLOWED = 1049;

    /**
     * This Constant is used to specify The Expiration Date of Active contract
     * version must not overlap with the Effective Date of Pending contract
     * version.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_EXPDATE_ACTIVE_VERSION_MUST_NOT_OVERLAP_WITH_EFFDATE_PENDING_VERSION =
                1050;

    /**
     * This Constant is used to specify The Effective Date of Pending contract
     * version must not overlap with the Expiration Date of Active contract
     * version.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_EFFDATE_ACTIVE_VERSION_MUST_NOT_OVERLAP_WITH_EXPDATE_PENDING_VERSION =
                1051;

    /**
     * This Constant is used to specify The Area is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_AREA_INVALID = 1052;

    /**
     * This Constant is used to specify The Subarea is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_SUBAREA_INVALID = 1053;

    /**
     * This Constant is used to specify The Region is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_REGION_INVALID = 1054;

    /**
     * This Constant is used to specify The Multi-Segment Carrier Code does not
     * exist in the system.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CARRIERCODE_DOES_NOT_EXIST = 1055;

    /**
     * This Constant is used to specify The Multi-Segment Carrier Code must not
     * be marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CARRIERCODE_MARKED_FOR_DELETION = 1056;

    /**
     * This Constant is used to specify The Special Handling Code does not exist
     * in the system.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_SPLCODE_DOES_NOT_EXIST = 1057;

    /**
     * This Constant is used to specify The Participant Account Number does not
     * exist in the system.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PARTICIPANT_ACCOUNTNO_DOES_NOT_EXIST = 1058;

    /**
     * This Constant is used to specify The Participant Account Number must not
     * be duplicated.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PARTICIPANT_ACCOUNTNO_ALREADY_EXISTS = 1059;

    /**
     * This Constant is used to specify The Multi-Segment Origin Code is not
     * same or within the Origin Code.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_ORIGINCODE_NOT_SAME_OR_WITHIN_ORIGINCODE = 1060;

    /**
     * This Constant is used to specify The Multi-Segment Origin Code is not the
     * same or within the Origin Code and Destination Code.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_ORIGINCODE_NOT_SAME_OR_WITHIN_ORG_AND_DEST_CODE = 1061;

    /**
     * This Constant is used to specify The Multi-Segment Destination Code is
     * not same or within the Destination Code.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_DESTCODE_NOT_SAME_OR_WITHIN_DESTCODE = 1062;

    /**
     * This Constant is used to specify The Multi-Segment Destination Code is
     * not same or within the Origin Code and Destination Code.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_DESTCODE_NOT_SAME_OR_WITHIN_ORG_AND_DEST_CODE = 1063;

    /**
     * This Constant is used to specify At least one of the Multi-Segment
     * Carrier Code in one of the multi-routing segments must be host Carrier
     * Code or YYY.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ATLEAST_ONE_MULSEG_CARRIERCODE_BE_HOST_CARRIERCODE = 1064;

    /**
     * This Constant is used to specify Over Pivot / B Rate is not allowed for
     * the input Rate Class.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_OVER_PIVOT_B_RATE_NOT_ALLOWED_FOR_INVALID_RATECLASSES = 1065;

    /**
     * This Constant is used to specify Only up to 3 decimal positions are
     * allowed for PERCENT (Percent Reduction) Contract Definition.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_DECIMAL_POSITIONS_INVALID_FOR_PERCENT_DEFINITION = 1066;

    /**
     * This Constant is used to specify Only if Currency Code is ‘USD’, ‘CAD’
     * and rating lines following ATPCO convention, decimal positions 0, 2 and 4
     * are allowed.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_INVALID_CURRENCY_CODE_AND_CONVENTIONS = 1067;

    /**
     * This Constant is used to specify Multi-Segment Origin Code must be the
     * same or must be within the contract’s Origin Code.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_ORIGINCODE_MUST_SAME_OR_WITHIN_CONTRACT_ORIGINCODE = 1068;

    /**
     * This Constant is used to specify If Bi-Directional Indicator is Yes, the
     * Multi-Segment Origin Code must be the same or must be within the
     * contract’s Destination Code.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_ORIGINCODE_MUST_SAME_IF_BIDIRECTIONALIND_YES = 1069;

    /**
     * This Constant is used to specify Multi-Segment Destination Code must be
     * the same or must be within the contract’s Destination Code.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_ORIGINCODE_MUST_SAME_OR_WITHIN_CONTRACT_DESTCODE = 1070;

    /**
     * This Constant is used to specify If Bi-Directional Indicator is Yes, the
     * Multi-Segment Destination Code must be the same or must be within the
     * contract’s Origin Code.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_DESTCODE_MUST_SAME_IF_BIDIRECTIONALIND_YES = 1071;

    /**
     * This Constant is used to specify Contract created.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CREATED_SUCCESSFULLY = 1072;

    /**
     * This Constant is used to specify Contract updated.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_UPDATED_SUCCESSFULLY = 1073;

    /**
     * This Constant is used to specify Contract deleted.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_DELETED_SUCCESSFULLY = 1074;

    /**
     * This Constant is used to specify Contract restored.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RESTORED_SUCCESSFULLY = 1075;

    /**
     * This Constant is used to specify Contract does not exist.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_DOES_NOT_EXIST = 1076;

    /**
     * This Constant is used to specify Multisegment route does not exist.
     * <p>
     * Value = {@value}
     */
    public static final int MULTISEGMENT_ROUTE_DOES_NOT_EXIST = 1077;

    /**
     * This Constant is used to specify Multisegment destination does not exist.
     * <p>
     * Value = {@value}
     */
    public static final int MULTISEGMENT_DESTINATION_DOES_NOT_EXIST = 1078;

    /**
     * This Constant is used to specify Fetches are mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int FETCHES_ARE_MANDATORY = 1079;

    /**
     * This Constant is used to specify Contract carrier is marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CARRIER_MARKED_FOR_DELETE = 1080;

    /**
     * This Constant is used to specify Contract participant is marked for
     * deletion.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PARTICIPANT_MARKED_FOR_DELETE = 1081;

    /**
     * This Constant is used to specify Airport name.
     * <p>
     * Value = {@value}
     */
    public static final int AIRPORT_NAME_OF_ANY_CHAR = 1082;

    /**
     * This Constant is used to specify Fetches are mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int VALIDATOR_STATION_CITY_CODE = 1083;

    /**
     * This Constant is used to specify Fetches are mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int VALIDATOR_CITY_NAME = 1084;

    /**
     * This Constant is used to specify Fetches are mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int VALIDATOR_COUNTRYCODE = 1085;

    /**
     * This Constant is used to specify Fetches are mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int VALIDATOR_COUNTRYNAME = 1086;

    /**
     * This Constant is used to specify Fetches are mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int VALIDATOR_STATIONCODE = 1087;

    /**
     * This Constant is used to specify Carrier code is duplicate.
     * <p>
     * Value = {@value}
     */
    public static final int DUPLICATE_OF_CARRIERS = 1088;

    /**
     * This Constant is used to specify Contract number already exist.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_NUMBER_ALREADY_EXIST = 1089;

    /**
     * This Constant is used to specify Contract origin and destination are
     * same.
     * <p>
     * Value = {@value}
     */
    public static final int ORIGIN_DESTINATION_SAME = 1090;

    /**
     * This Constant is used to specify Contract duplicate rate entry is
     * present.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_DUPLICATE_RATE_ENTRY = 1091;

    /**
     * This Constant is used to specify Fetches are mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ALL_ORIGIN_IF_MULTISEGMENT_ALL_ORIGIN = 1092;

    /**
     * This Constant is used to specify Fetches are mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ALL_DEST_IF_MULTISEGMENT_ALL_DEST = 1093;

    /**
     * This Constant is used to specify Flight suffix is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int FLIGHT_SUFFIX_INVALID = 1094;

    /**
     * This Constant is used to specify Flight number is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int FLIGHT_NUMBER_INVALID = 1095;

    /**
     * This Constant is used to specify Origin code is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ORIGIN_CODE_MANDATORY = 1096;

    /**
     * This Constant is used to specify Destination Code is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_DESTINATION_CODE_MANDATORY = 1097;

    /**
     * This Constant is used to specify Destination Code is invalid.
     * <p>
     * Value = {@value}
     */
    // public static final int
    // CONTRACT_ORIGIN_DEST_PAYCODE_REQUIRED_IF_CONTRACT_IS_BIDIRECTIONAL =
    // 1098;

    /**
     * This Constant is used to specify Currency Code is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CURRENCY_CODE_IS_MANDATORY_IF_NOT_PERCENT_REDUCTION = 1099;

    /**
     * This Constant is used to specify Multi_Segment Cerrier Code is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MULSEG_CARRIER_CODE_IS_MANDATORY = 1100;

    /**
     * This Constant is used to Restore number is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RESTORE_NOT_ALLOWED = 1101;

    /**
     * This Constant is used to specify Participant Account Number is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PARTICIPANT_ACCOUNT_NUM_MANDATORY = 1102;

    /**
     * This Constant is used to specify Flight Specific Indicator is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CARRIER_NOT_ALLOWED_WITH_YYY = 1103;

    /**
     * This Constant is used to specify Flight Operation Day is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_FLIGHT_OPERATION_DAY_REQ_IF_FLIGHT_ENTERED = 1104;

    /**
     * This Constant is used to specify Class RatingID is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CLASSRATINGID_NOT_ALLOWED_IF_COMMODITYNUM_OR_ALLCOMIND_YES = 1105;

    /**
     * This Constant is used to specify ULDTYPEIND is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ULDTYPEIND_PROHIBITED_IF_FIXED_OR_FLAT = 1106;

    /**
     * This Constant is used to specify Rate Adjustment is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RATE_ADJUSTMENT_REQUIRED_IF_CLASSRATINGID_AND_FIXED = 1107;

    // public static final int
    // CONTRACT_CARRIER_CODE_MUST_BE_TWO_TO_THREE_ALPHANUMERIC = 1149;
    /**
     * This Constant is used to specify Multi_Segment Destination Code is
     * invalid.
     * <p>
     * Value = {@value}
     */

    public static final int CONTRACT_MULSEG_DESTCODE_MUST_BE_ONE_TO_SEVEN_ALPHANUMERIC = 1108;

    /**
     * This Constant is used to specify carrier Code is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_CARRIERCODE_NOT_EXIST = 1109;

    /**
     * This Constant is used to specify Pivot Weight is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PIVOT_WEIGHT_ALLOWED_FIXED_U_RATE_CLASSES = 1110;

    /**
     * This Constant is used to specify Origin Destination Pay Code is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ORIGIN_DEST_PAYCODE_MANDATORY = 1111;

    /**
     * This Constant is used to specify Flight Number is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_FLIGHT_NUMBER_IS_MANDATORY = 1112;

    /**
     * This Constant is used to specify only one active version allowed.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ONLY_ONE_ACTIVE_VERSION_ALLOWED = 1113;

    /**
     * This Constant is used to specify contract minimum rate not present.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_NON_MINIMUM_RATE_NOT_PRESENT = 1114;
    //Code changes for UCF 11897959 starts
    /**
     * This Constant is used to specify spot rate minimum rate not present.
     * <p>
     * Value = {@value}
     */
    public static final int SPOTRATE_NON_MINIMUM_RATE_NOT_PRESENT = 4545;
    //Code changes for UCF 11897959 ends
    /**
     * This Constant is used to specify contract has duplicate entries.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_DUPLICATE_CARRIER_ENTRIES_FOR_COMPRESSION = 1115;

    /**
     * This Constant is used to specify contract commodity type is not
     * compatible with ratesource.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_COMMODITY_TYPE_NOT_COMPATIBLE_WITH_RATESOURCE = 1116;

    /**
     * This Constant is used to specify atleast one participant is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ATLEAST_ONE_PARTICIPANT_MANDATORY = 1117;

    /**
     * This Constant is used to specify atleast one rate entry is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ATLEAST_ONE_RATEENTRY_MANDATORY = 1118;

    /**
     * This Constant is used to specify Participant account number is
     * duplciated.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PARTICIPANT_ACCOUNT_NUMBER_DUPLICATE = 1119;

    /**
     * This Constant is used to specify Allotment number is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ALLOTMENTID_MANDATORY = 1120;

    /**
     * This Constant is used to specify SPLcode is duplicate.
     * <p>
     * Value = {@value}
     */
    public static final int DUPLICATE_OF_SPLCODES = 1121;

    /**
     * This Constant is used to specify Contract deleted.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_IS_DELETED = 1074;

    /**
     * This Constant is used to specify Contract Participant Group is marked for
     * deletion.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PARTICIPANT_GROUP_MARKED_FOR_DELETE = 1122;

    /**
     * This Constant is used to specify The Rate Adjustment Weight must have 1-9
     * digits to the left of the decimal point and 0-4 digits to the right of
     * the decimal point.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RATE_ADJUSTMENT_PERCENT_INVALID = 1123;

    /**
     * This Constant is used to specify No contract exist for the participant.
     * <p>
     * Value = {@value}
     */
    public static final int NO_CONTRACT_EXIST_FOR_PARTICIPANT = 1124;

    /**
     * This Constant is used to specify Expiration date must not precede current
     * date.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_EXPIRATION_DATE_NOT_PRECEDE_SYSDATE = 1125;

    /**
     * This Constant is used to specify the Participant Group is not present in
     * the system.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PARTICIPANT_GROUP_NO_DOES_NOT_EXIST = 1126;

    /**
     * This Constant is used to specify the Participant Group is not present in
     * the system.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ENFORCE_HURLDERATE_NOT_ALLOWED_IF_REVENUE_MANAGEMENT = 1127;

    /**
     * This Constant is used to specify the Participant Group is not present in
     * the system.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_RATE_ADJUSTMENT_PERCENT_REQUIRED_IF_PERCENT = 1128;

    /**
     * This Constant is used to specify Minimum weight must be greater than 1
     * for all rate classes other than 'N'.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MIN_WEIGHT_GREATER_THAN_ONE = 1129;

    /**
     * This Constant is used to specify Minimum weight is prohibited for M rate
     * class. 'N'.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MINIMUM_WEIGHT_NOT_ALLOWED_FOR_M_RATE_CLASS = 1130;

    /**
     * This Constant is used to specify Minimum weight is prohibited for Price
     * or Percent Reduction lines with Rate Class U. 'N'.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MINIMUM_WEIGHT_NOT_ALLOWED_FOR_U_RATE_CLASS = 1131;

    /**
     * This Constant is used to specify ULD Type mandatory for Rate Class U.
     * 'N'.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_ULD_TYPE_MANDATORY_FOR_U_RATE_CLASS = 1132;

    /**
     * This Constant is used to specify Minimum weight Minimum weight is
     * prohibited if Class Rating ID is input. 'N'.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_MINIMUM_WEIGHT_NOT_ALLOWED_IF_CLASS_RATING_IS_INPUT = 1133;

    /**
     * This Constant is used to specify that a Participant account can not be
     * changed.
     *
     * Value = {@value}
     */
    public static final int CONTRACT_PRIMARY_PARTICIPANT_CANT_CHANGE = 1134;

    /**
     * This Constant is used to specify that Only K, M, N, Q and BlankRate
     * Classesare allowed for Fixed contract lines with a Class Rating ID.
     *
     * Value = {@value}
     */
    public static final int CONTRACT_K_M_N_Q_FOR_FIXED_CLASSRATING = 1136;

    /**
     * This Constant is used to specify that Only K, M and Blank Rate Classes
     * are allowed for Percent and Price contract lines with a Class Rating ID.
     *
     * Value = {@value}
     */
    public static final int CONTRACT_K_M_FOR_PERCENT_PRICE_CLASSRATING = 1137;

    /**
     * This Constant is used to specify that the Minimum Weight must be 1.
     *
     * Value = {@value}
     */
    public static final int CONTRACT_MIN_WEIGHT_1 = 1138;

    /**
     * This Constant is used to specify that The Minimum Weight is required for
     * ULD rating lines with ULD Charge Code ‘I’ or ‘J’.
     *
     * Value = {@value}
     */
    public static final int CONTRACT_MIN_WEIGHT_MANDATORY_FOR_I_J_ULD = 1139;

    /**
     * This Constant is used to specify that The Minimum Weight input is not
     * allowed.
     *
     * Value = {@value}
     */
    public static final int CONTRACT_MIN_WEIGHT_NOT_ALLOWED = 1140;

    /**
     * This Constant is used to specify that The Minimum Weight input is not
     * allowed for FIXED and FLAT.
     *
     * Value = {@value}
     */
    public static final int CONTRACT_MIN_WEIGHT_NOT_ALLOWED_FOR_NON_PERCENT_PRICE = 1141;

    /**
     * This Constant is used to specify Pivot Weight is not allowed.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_PIVOT_WEIGHT_ALLOWED_FIXED_RATE_CLASSES = 1142;

    /**
     * This Constant is used to specify Over Pivot / B Rate is mandatory for the
     * input Rate Class.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_OVER_PIVOT_B_RATE_MANDATORY_FOR_RATECLASSES = 1145;

    /**
     * This Constant is used to specify that Contract can not be created for the
     * input Participant.
     * <p>
     * Value = {@value}
     */
    public static final int CONTRACT_NOT_ALLOWED_FOR_PARTICIPANT = 1146;

    /**
     * This Constant is used to specify that contract does not exist for the
     * participant.
     * <p>
     * Value = {@value}
     */

    public static final int CONTRACT_NOT_EXIST_FOR_PARTICIPANT = 1147;

    /**
     * This Constant is used to specify that Contract maximum shipment size is
     * invalid.
     * <p>
     * Value = {@value}
     */

    public static final int CONTRACT_MAX_SHIPMENT_SIZE_INVALID = 1147;

    /**
     * This Constant is used to specify that minimum shipment size should be
     * less than maximum shipment size.
     * <p>
     * Value = {@value}
     */

    public static final int CONTRACT_MINSHIPMENTSIZE_SHOULD_NOT_BE_GREATER_THAN_MAXSHIPMENTSIZE = 1148;

    /**
     * This Constant is used to specify that Rate Percentage is prohibited for FIXED and FLAT REDUCTION.
     * <p>
     * Value = {@value}
     */

    public static final int CONTRACT_RATE_PERCENT_PROHIBITED_FOR_PRICE_FIXED_FLAT = 1149;

    /**
     * This Constant is used to specify that Rate is prohibited for PERCENT and PRICE REDUCTION.
     * <p>
     * Value = {@value}
     */

    public static final int CONTRACT_RATE_PROHIBITED_FOR_PERCENT_REDUCTION = 1150;

    /**
     * This constant is used to specify the sra warnings.
     * <p>
     * 11
     * <p>
     * value = {@value}
     */
    public static final int CONTRACT_FLIGHT_MANDATORY_FOR_ALLOTMENTID = 1151;

    /**
     * This constant is used to specify the sra warnings.
     * <p>
     * 11
     * <p>
     * value = {@value}
     */
    public static final int ONLY_FIXED_RATE_ALLOWED_FOR_ALLOTMENT_SET_TO_HARD_OR_SOFT_BLOCK = 1152;

    /**
     * This constant is used to specify that the Other Charge Contract ID is not
     * defined in the Other Charge Contracts function for Account *GENOCC.
     * <p>
     * 11
     * <p>
     * value = {@value}
     */
    public static final int OTHER_CHARGE_CONTRACT_ID_DOES_NOT_EXIST = 1153;
    /**
     * This constant is used to specify that the Other Charge Contract is null
     * defined in the Other Charge Contracts function for Account *GENOCC.
     * <p>
     * 11
     * <p>
     * value = {@value}
     */
    public static final int OTHER_CHARGE_CONTRACT_REQUEST_NOT_PROCESSED = 1155;

    /**
     * This Constant is used to specify other charge Contract ID must be
     * alphanumeric.
     * <p>
     * Value = {@value}
     */
    public static final int OTHER_CHARGE_CONTRACT_ID_MUST_ALPHANUMERIC = 1154;

    /**********************************************************/
    /** End OF UC094 - Maintain Contracts **/
    /**********************************************************/

    /**********************************************************/
    /** Start OF Rating Carrier **/
    /**********************************************************/

    /**
     * This constant is used to verify if the rate source hierarchy is of valid
     * format.
     * <p>
     * The rate source hierarchy is invalid format.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_CARRIER_INVALID_HIERARCHY = 1227;

    /**
     * This constant is used to verify if carrier code is available or not.
     * <p>
     * The carrier code is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_CARRIER_CARRIER_CODE_MANDATORY = 1228;

    /**
     * This constant is used to verify if rate source hierarchy is available or
     * not.
     * <p>
     * The rate source hierarchy is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_CARRIER_RATE_SOURCE_HIERARCHY_MANDATORY = 1229;

    /**
     * This constant is used to verify if rating carrier is exist or not.
     * <p>
     * The rating carrier is not exist.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_CARRIER_NOT_EXISTS = 1230;

    /**
     * This constant is used to verify if Request is available or not.
     * <p>
     * The rating carrier request is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_CARRIER_INVALID_REQUEST = 1231;

    /**
     * This constant is used to verify if rating carrier is already exist or
     * not.
     * <p>
     * The rating carrier already exist.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_CARRIER_ALREADY_EXIST = 1232;

    /**
     * This constant is used to verify if rate source hierarchy is unique for a
     * rating carrier.
     * <p>
     * The rate source hierarchy is unique for a rating carrier.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_CARRIER_RATE_SOURCE_HIERARCHY_UNIQUE = 1233;

    /**
     * This constant is used to state that rating carrier is created
     * successfully.
     * <p>
     * The rating carrier is created successfully.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_CARRIER_CREATED_SUCCESSFULLY = 1234;

    /**
     * This constant is used to state that rating carrier is updated
     * successfully.
     * <p>
     * The rating carrier is updated successfully.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_CARRIER_UPDATED_SUCCESSFULLY = 1235;

    /**
     * This constant is used to state that rate source hierarchy is missing.
     * <p>
     * The rating carrier rate source hierarchy is not continuous missing.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_CARRIER_RATE_SOURCE_HIERARCHY_MISSING = 1236;

    /**
     * This constant is used to state that rating carrier rate source hierarchy
     * must not be zero.
     * <p>
     * rate source hierarchy must not be zero.
     * <p>
     * Value = {@value}
     */
    public static final int RATING_CARRIER_RATE_SOURCE_HIERARCHY_MUST_NOT_BE_ZERO = 1238;

    /**********************************************************/
    /** End OF Rating Carrier **/
    /**********************************************************/

    /**********************************************************/
    /** Start OF UC142 - Maintain Class Rating Rule **/
    /**********************************************************/

    /**
     * This Constant is used to specify the combination of the IATA Area values.
     * <p>
     * Value = {@value}
     */

    public static final int IATA_AREA_VALUE = 1301;

    /**
     * This Constant is used to specify the rule reference type size.
     * <p>
     * Value = {@value}
     */

    public static final int RULE_REFERENCE_MUST_BE_1_TO_3_ALPHANUMERIC = 1302;

    /**
     * This Constant is used to specify the Class rating type is mandatory.
     * <p>
     * Value = {@value}
     */

    public static final int CLASS_RATING_TYPE_IS_MANDATORY = 1303;

    /**
     * This Constant is used to specify the origin code type size.
     * <p>
     * Value = {@value}
     */

    public static final int ORIGIN_CODE_MUST_BE_1_TO_7_ALPAHANUMERIC = 1304;

    /**
     * This Constant is used to specify the destination code type size.
     * <p>
     * Value = {@value}
     */

    public static final int DESTINATION_CODE_MUST_BE_1_TO_7_ALPAHANUMERIC = 1305;

    /**
     * This Constant is used to specify the bidirectional indicator is
     * mandatory.
     * <p>
     * Value = {@value}
     */

    public static final int BIDIRECTIONAL_INDICATOR_IS_MANDATORY = 1306;

    /**
     * This Constant is used to specify the percentage type size.
     * <p>
     * Value = {@value}
     */

    public static final int PERCENTAGE_MUST_BE_1_TO_3_NUMERICS = 1307;

    /**
     * This Constant is used to specify the rate type code type size.
     * <p>
     * Value = {@value}
     */

    public static final int RATE_TYPE_CODE_MUST_BE_3_ALPHABETIC = 1308;

    /**
     * This Constant is used to specify the rate type tyep and size.
     * <p>
     * Value = {@value}
     */

    public static final int RATE_TYPE_AND_SIZE = 1310;

    /**
     * This Constant is used to specify the rate is prohibited if the percentage
     * is entered for class rating type.
     * <p>
     * Value = {@value}
     */

    public static final int RATE_IS_PROHIBITED_IF_PERCENTAGE_ENTERED_FOR_R_AND_J_CLASS_RATING_TYPE = 1311;

    /**
     * This Constant is used to specify the weight unit must be KG or LB type.
     * <p>
     * Value = {@value}
     */

    public static final int WEIGHT_UNIT_MUST_BE_KG_OR_LB = 1312;

    /**
     * This Constant is used to specify the expiration date format(ddmmmyy) or
     * INDEF.
     * <p>
     * Value = {@value}
     */

    public static final int EXPIRATION_DATE_MUST_BE_IN_THE_FORMAT_DDMMMYY_OR_INDEF = 1313;

    /**
     * This Constant is used to specify the uld rate type is prohibited for rate
     * class.
     * <p>
     * Value = {@value}
     */

    public static final int ULD_RATE_TYPE_CODE_IS_PROHIBITED_FOR_RATECLASS = 1314;

    /**
     * This Constant is used to specify the rule type is prohibited for rate
     * type when rate value is entered.
     * <p>
     * Value = {@value}
     */

    public static final int RULE_TYPE_PROHIBITED_WHEN_RATE_ENTERED_FOR_R_AND_J_RATE_TYPE = 1315;

    /**
     * This Constant is used to specify the rule type is prohibited for rate
     * type when currency code is entered.
     * <p>
     * Value = {@value}
     */

    public static final int RULE_TYPE_PROHIBITED_WHEN_CURRENCY_CODE_ENTERED_FOR_R_AND_J_RATE_TYPE = 1316;

    /**
     * This Constant is used to specify the rule type is mandatory for R rate
     * class when percentage is entered.
     * <p>
     * Value = {@value}
     */

    public static final int RULE_TYPE_IS_MANDATORY_WHEN_PERCENTAGE_ENTERED_FOR_R_RATE_CLASS = 1317;

    /**
     * This Constant is used to specify the currency code is mandatory when rate
     * is entered.
     * <p>
     * Value = {@value}
     */

    public static final int CURRECY_IS_MANDATORY_WHEN_RATE_IS_ENTERED = 1318;

    /**
     * This Constant is used to specify the currency is prohibited for R and J
     * Rate type when percentage is entered.
     * <p>
     * Value = {@value}
     */

    public static final int CURRENCY_PROHIBITED_WHEN_PERCENTAGE_ENTERED_FOR_R_AND_J_RATE_TYPE = 1319;

    /**
     * This Constant is used to specify the minimum weight must be entered for
     * when class rating type is ATPCO 'R' or 'J' and class rating rule type is
     * A or X.
     * <p>
     * Value = {@value}
     */

    public static final int MINIMUM_WEIGHT_FOR_RATING_TYPE_AND_RULE_TYPE = 1320;

    /**
     * This Constant is used to specify the weight unit is mandatory if minimum
     * weight is entered.
     * <p>
     * Value = {@value}
     */

    public static final int WEIGHT_UNIT_IS_MANDATORY_IF_MINIMUM_WEIGHT_IS_ENTERED = 1321;

    /**
     * This Constant is used to specify if the class rating id must be valid.
     * <p>
     * Value = {@value}
     */

    public static final int CLASS_RATING_ID_MUST_BE_VALID = 1322;

    /**
     * This Constant is used to specify if the carrier code must be valid.
     * <p>
     * Value = {@value}
     */

    public static final int CARRIER_CODE_MUST_BE_VALID = 1323;

    /**
     * This Constant is used to specify the carrier code 'YYY' is prohibited for
     * Joint Exception Rating.
     * <p>
     * Value = {@value}
     */

    public static final int CARRIER_CODE_YYY_IS_PROHIBITED_FOR_JOINT_EXCEPTION_RATING = 1324;

    /**
     * This Constant is used to specify if the rate source is valid or not.
     * <p>
     * Value = {@value}
     */

    public static final int RATE_SOURCE_MUST_BE_VALID = 1325;

    /**
     * This Constant is used to specify the IATA Area is valid or not.
     * <p>
     * Value = {@value}
     */

    public static final int IATA_AREA_MUST_BE_VALID = 1326;

    /**
     * This Constant is used to specify if city code is valid or not.
     * <p>
     * Value = {@value}
     */

    public static final int CITY_CODE_MUST_BE_VALID = 1327;

    /**
     * This Constant is used to specify if country code is valid or not.
     * <p>
     * Value = {@value}
     */

    public static final int COUNTRY_CODE_MUST_BE_VALID = 1328;

    /**
     * This Constant is used to specify if region code is valid or not.
     * <p>
     * Value = {@value}
     */

    public static final int REGION_MUST_BE_VALID = 1329;

    /**
     * This Constant is used to specify if subarea is valid or not.
     * <p>
     * Value = {@value}
     */

    public static final int SUBAREA_MUST_BE_VALID = 1330;

    /**
     * This Constant is used to specify if the area is valid or not.
     * <p>
     * Value = {@value}
     */

    public static final int AREA_MUST_BE_VALID = 1331;

    /**
     * This Constant is used to specify if the aggregate is valid or not.
     * <p>
     * Value = {@value}
     */

    public static final int AGGREGATE_MUST_BE_VALID = 1332;

    /**
     * This Constant is used to specify the Class Rating Rule Type must be any
     * one of the values N, U, O, A, P, E, X or Blank for ‘R’ Class Rating Type
     * with IATA convention Rate Source.
     * <p>
     * Value = {@value}
     */

    public static final int RULE_TYPE_MUST_HAVE_STANDARDS_FOR_CLASS_RATING_TYPE_R = 1333;

    /**
     * This Constant is used to specify the Class Rating Rule Type must be A or
     * X for ‘R’ or ‘J’ Class Rating Types with ATPCO convention Rate Source.
     * <p>
     * Value = {@value}
     */

    public static final int RULE_TYPE_MUST_BE_A_OR_X_FOR_R_OR_J_WITH_ATPCO = 1334;

    /**
     * This Constant is used to specify the Class Rating Rule Type must be M, A
     * or Blank for ‘M’ Class Rating Type.
     * <p>
     * Value = {@value}
     */

    public static final int RULE_TYPE_MUST_BE_M_A_OR_BLANK_FOR_M_CLASS_RATING_TYPE = 1335;

    /**
     * This Constant is used to specify the rate must be greater than 0.
     * <p>
     * Value = {@value}
     */

    public static final int RATE_MUST_BE_GREATER_THAN_0 = 1336;

    /**
     * This Constant is used to specify the currency is marked for deletion or
     * not.
     * <p>
     * Value = {@value}
     */

    public static final int CURRENCY_IS_MARKED_FOR_DELETION = 1337;

    /**
     * This Constant is used to specify that delete is not allowed for Effective
     * rule.
     * <p>
     * Value = {@value}
     */

    public static final int EFFECTIVE_RULE_MUST_NOT_BE_DELETED = 1338;

    /**
     * This Constant is used to specify that update is not allowed for the
     * effective rule.
     * <p>
     * Value = {@value}
     */

    public static final int EFFECTIVE_RULE_MUST_NOT_BE_UPDATED = 1339;

    /**
     * This Constant is used to specify the rate type code is valid or not for
     * the rate source.
     * <p>
     * Value = {@value}
     */

    public static final int RATE_TYPE_CODE_MUST_BE_VALID_FOR_RATE_SOURCE = 1340;

    /**
     * This Constant is used to specify the IATA Pair for the class rating type
     * 'J'.
     * <p>
     * Value = {@value}
     */

    public static final int IATA_PAIR_MUST_BE_1_TO_1_FOR_CLASS_RATING_TYPE_J = 1341;

    /**
     * This Constant is used to specify the percentage or rate value for class
     * rating type 'R' and 'J'.
     * <p>
     * Value = {@value}
     */

    public static final int EITHER_PERCENTAGE_OR_RATE_MUST_BE_ENTERED_FOR_R_AND_J_CLASS_RATING_TYPE = 1342;

    /**
     * This Constant is used to specify whether number of decimal in rate and
     * currency must be same.
     * <p>
     * Value = {@value}
     */

    public static final int RATE_NUMBER_OF_DECIMAL_PLACES_MUST_MATCH_WITH_CURRENCY_DECIMAL_POSITION = 1343;

    /**
     * This Constant is used to specify whether duplicate rule entry is allowed
     * or not.
     * <p>
     * Value = {@value}
     */

    public static final int DUPLICATE_RULE_IS_NOT_ALLOWED = 1344;

    /**
     * This Constant is used to specify the class rating rule entry is effective
     * and only update of Expiration Date is allowed or not.
     * <p>
     * Value = {@value}
     */

    public static final int ENTRY_IS_EFFECTIVE_AND_ONLY_UPDATE_OF_EXPIRATION_DATE_IS_ALLOWED = 1345;

    /**
     * This Constant is used to specify the effective date of the class rating
     * rule is greater than or equal to currency effective date or not.
     * <p>
     * Value = {@value}
     */

    public static final int EFFECTIVEDATE_ENTRY_MUST_BE_GREATER_THAN_EFFECTIVEDATE = 1346;

    /**
     * This Constant is used to specify the effective date of the class rating
     * rule is less than or equal to the currency expiration date.
     * <p>
     * Value = {@value}
     */

    public static final int EFFECTIVEDATE_ENTRY_MUST_BE_LESS_THAN_OR_EQUAL_TO_CURRENCY_EXPIRATIONDATE = 1347;

    /**
     * This Constant is used to specify whether class rating rule is exist for
     * the given input and filter combination.
     * <p>
     * Value = {@value}
     */

    public static final int CLASS_RATING_RULE_DOESNOT_EXIST_FOR_INPUT_AND_FILTER_COMBINATION = 1348;

    /**
     * This Constant is used to specify whether the class rating rule is already
     * exist in the system or not.
     * <p>
     * Value = {@value}
     */

    public static final int CLASS_RATING_RULE_ALREADY_EXIST_IN_THE_SYSTEM = 1349;

    /**
     * This Constant is used to specify the class rating rule is present in the
     * system.
     * <p>
     * Value = {@value}
     */

    public static final int CLASS_RATING_RULE_DOES_NOT_EXIST_IN_THE_SYSTEM = 1350;

    /**
     * This Constant is used to to state that class rating rule is created
     * successfully.
     * <p>
     * Value = {@value}
     */

    public static final int CLASS_RATING_RULE_IS_CREATED = 1351;

    /**
     * This Constant is used to state that class rating rule is updated
     * successfully.
     * <p>
     * Value = {@value}
     */

    public static final int CLASS_RATING_RULE_IS_UPDATED = 1352;

    /**
     * This Constant is used to state that class rating rule is deleted
     * successfully.
     * <p>
     * Value = {@value}
     */

    public static final int CLASS_RATING_RULE_IS_DELETED = 1353;

    /**
     * This Constant is used to specify that effective class rating rule cannot
     * be deleted.
     * <p>
     * Value = {@value}
     */

    public static final int CLASS_RATING_RULE_EFFECTIVE_CANT_BE_DELETED = 1354;

    /**
     * This Constant is used to specify that class rating rule carrier modified
     * or not.
     * <p>
     * Value = {@value}
     */

    public static final int CLASS_RATING_RULE_CARRIER_MODIFIED = 1355;

    /**
     * This Constant is used to specify that class rating id carrier modified or
     * not.
     * <p>
     * Value = {@value}
     */

    public static final int CLASS_RATING_ID_MODIFIED = 1356;

    /**
     * This Constant is used to specify that rate source is modified or not.
     * <p>
     * Value = {@value}
     */

    public static final int RATING_SOURCE_MODIFIED = 1357;

    /**
     * This Constant is used to specify whether the currency is valid or not.
     * <p>
     * Value = {@value}
     */

    public static final int CURRENCY_IS_NOT_VALID = 1358;

    /**
     * This Constant is used to specify that the class rating rule entries are
     * valid or not.
     * <p>
     * Value = {@value}
     */

    public static final int CLASS_RATING_RULE_ENTRIES_INVALID = 1359;

    /**
     * This Constant is used to specify that atleast one class rating rule entry
     * is required for create/update.
     * <p>
     * Value = {@value}
     */
    public static final int CLASS_RATING_RULE_ENTRIES_REQUIRED = 1360;

    /**
     * This Constant is used to specify whether Rating Convention must be IATA
     * for Class Minimum Rating rules.
     * <p>
     * Value = {@value}
     */
    public static final int IATA_FOR_CLASS_MINIMUM_RATING = 1361;

    /**
     * This Constant is used to specify whether Rating Convention must be ATPCO
     * for Joint Class Rating rules.
     * <p>
     * Value = {@value}
     */
    public static final int ATPCO_FOR_JOIN_CLASS_RATING = 1362;

    /**
     * This Constant is used to specify whether There are No Class Rating Rules
     * for given search criteria.
     * <p>
     * Value = {@value}
     */
    public static final int CLASS_RATING_RULE_ENTRIES_NOT_EXIST_FOR_GIVEN_SEARCH_CRITERIA = 1363;

    /**
     * This Constant is used to specify whether Rate or percentage is mandatory
     * for class minimum rating.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_OR_PERCENTAGE_IS_MANDATORY_FOR_CLASS_MINIMUM_RATING = 1364;

    /**********************************************************/
    /** End OF UC142 - Maintain Class Rating Rule **/
    /**********************************************************/

    /**
     * This Constant is used to specify SpotRate does not exists.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_DOES_NOT_EXIST = 1500;

    /**
     * This Constant is used to specify SpotRate does not exists.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_NUMBER_MANDATORY = 1501;

    /**
     * This Constant is used to specify At least one of the Active, Pending,
     * Expired, History, Deleted filter is required.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_ATLEAST_ONE_FILTER_REQUIRED = 1502;

    /**
     * This Constant is used to specify The Effective Date is required.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_EFFECTIVE_DATE_MANDATORY = 1503;

    /**
     * This Constant is used to specify The Spot Rate Number must be 1-12
     * alphanumeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_NUMBER_INVALID = 1504;

    /**
     * This Constant is used to specify The Pay Code is required.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_PAYCODE_REQUIRED = 1505;

    /**
     * This Constant is used to specify Carrier Code is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_CARRIER_CODE_MANDATORY = 1506;

    /**
     * This Constant is used to specify Suffix mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_SUFFIX_MANDATORY = 1507;

    /**
     * This Constant is used to specify Participant Account Number is required.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_PARTICIPANT_ACCOUNT_NUMBER_REQUIRED = 1508;

    /**
     * This Constant is used to specify Participant name required.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_PARTICIPANT_NAME_REQUIRED = 1509;

    /**
     * This Constant is used to specify Atleast one spot rate entry mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int ATLEAST_ONE_SPOT_RATE_ENTRY_REQUIRED = 1510;

    /**
     * This Constant is used to specify The Spot Rate Definition is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_SRA_DEFINITION_MANDATORY = 1511;

    /**
     * This Constant is used to specify The Rate Source is required if Spot Rate
     * Definition is PERCENT (Percent Reduction), PRICE (Price Reduction).
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_MANDATORY_FOR_PERCENT_PRICE_DEFINITION = 1512;

    /**
     * This Constant is used to specify The Commodity Number is not allowed if
     * Class Rating ID is entered.
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_NUMBER_PROHIBITED = 1513;

    /**
     * This Constant is used to specify The Class Rating ID is not allowed if
     * Commodity Number is entered.
     * <p>
     * Value = {@value}
     */
    public static final int CLASS_RATING_ID_PROHIBITED_IF_COMMODITY_NUMBER_EXIST = 1514;

    /**
     * This Constant is used to specify The Class Rating ID is not allowed for
     * FLAT (Flat Rate) Spot Rate Definition.
     * <p>
     * Value = {@value}
     */
    public static final int CLASS_RATING_ID_PROHIBITED_IF_FLAT_DEFINITION_TYPE = 1515;

    /**
     * This Constant is used to specifyThe ULD Type is not allowed if the Class
     * Rating ID is entered.
     * <p>
     * Value = {@value}
     */
    public static final int ULDTYPE_ID_PROHIBITED_IF_CLASS_RATING_ID_IS_INPUT = 1516;

    /**
     * This Constant is used to specify Invalid Air Waybill Number.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_AIRWAYBILL_CODE_NUMBER = 1517;

    /**
     * This Constant is used to specify The Product Code must be three
     * characters alphabetic.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_PRODUCT_CODE_INVALID = 1518;

    /**
     * This Constant is used to specify The Remarks must be 1-240 characters.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATES_REMARKS_INVALID = 1519;

    /**
     * This Constant is used to specify The Spot Rate Number already exists in
     * the system.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_ALREADY_EXIST = 1520;

    /**
     * This Constant is used to specify The Expiration Date must not precede
     * Effective Date.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_EXPIRATION_DATE_NOT_PRECEDE_SYSDATE = 1521;

    /**
     * This Constant is used to specify SpotRate created successfully.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_CREATED_SUCCESSFULLY = 1522;

    /**
     * This Constant is used to specify SpotRate cannot be deleted.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_CANT_BE_DELETED = 1523;

    /**
     * This Constant is used to specify SpotRate deleted successfully.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_DELETED_SUCCESSFULLY = 1524;

    /**
     * This Constant is used to specify No SpotRate exist for the participant.
     * <p>
     * Value = {@value}
     */
    public static final int NO_SPOT_RATE_EXIST_FOR_PARTICIPANT = 1525;

    /**
     * This Constant is used to specify SpotRate carrierCode does not exist in
     * the system.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_CARRIER_CODE_DOES_NOT_EXIST = 1526;

    /**
     * This Constant is used to specify SpotRate updated successfully.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_UPDATED_SUCCESSFULLY = 1527;

    /**
     * This Constant is used to specify History and Deleted spotRate versions
     * cannot be update.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_E_OR_H_D_VERSIONS_CANT_UPDATE = 1528;

    /**
     * This Constant is used to specify SpotRate participant is marked for
     * deletion.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_PARTICIPANT_MARKED_FOR_DELETE = 1529;

    /**
     * This Constant is used to specify SpotRate carrier is marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_CARRIER_MARKED_FOR_DELETE = 1530;

    /**
     * This Constant is used to specify Duplicate SpotRate Entry present.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_DUPLICATE_RATE_ENTRY = 1531;

    /**
     * This Constant is used to specify The user is not authorized for the
     * requested spot rate information.
     * <p>
     * Value = {@value}
     */
    public static final int USER_NOT_AUTHORISED_FOR_THE_REQUESTED_SPOT_RATE_INFORMATION = 1532;
    /**
     * This Constant is used to specify The user is not authorized for the
     * requested spot rate information.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_QUEUED_FOR_AUTHORIZATION = 4542;
    /**
     * This Constant is used to specify The Enforce Hurdle Rates is not allowed
     * if Revenue Management Interface dynamic parameter value is N.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_ENFORCE_HURLDERATE_NOT_ALLOWED_IF_REVENUE_MANAGEMENT = 1533;

    /**
     * This Constant is used to specify SpotRate stations must be airport or
     * city.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_STATION_MUST_BE_CITY_OR_AIRPORT = 1534;

    /**
     * This Constant is used to specify RateSource mandatory if if the value of
     * dynamic parameter Rate Source for Spot Rates is M.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_MANDATORY_FOR_SPOTRATES = 1535;

    /**
     * This Constant is used to specify RateType mandatory if the value of
     * dynamic parameter Rate Type for Spot Rates is M.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_TYPE_MANDATORY_FOR_SPOTRATES = 1536;

    /**
     * This Constant is used to specify RateSource prohibited if the value of
     * dynamic parameter Rate Source for Spot Rates is P.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_SOURCE_PROHIBITED_FOR_SPOTRATES = 1537;

    /**
     * This Constant is used to specify RateType prohibited if the value of
     * dynamic parameter Rate Type for Spot Rates is P.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_TYPE_PROHIBITED_FOR_SPOTRATES = 1538;

    /**
     * This Constant is used to specify RateClass is prohibited if the value of
     * the dynamic parameter Commodity Code for Spot Rates is P.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_CLASS_C_PROHIBITED_FOR_P_COMMODITY_CODE = 1539;

    /**
     * This Constant is used to specify Commodity Number mandatory if the value
     * of dynamic parameter Commodity Code for Spot Rates is M and Class Rating
     * ID is not input.
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_NUMBER_MANDATORY_FOR_M_COMMODITY_CODE = 1540;

    /**
     * This Constant is used to specify Commodity Number prohibited if the value
     * of dynamic parameter Commodity Code for Spot Rates is P.
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_NUMBER_PROHIBITED_FOR_P_COMMODITY_CODE = 1541;

    /**
     * This Constant is used to specify ClassRatingID mandatory if the value of
     * dynamic parameter Commodity Code for Spot Rates is Mand Commodity Number
     * is not input.
     * <p>
     * Value = {@value}
     */
    public static final int CLASS_RATING_ID_MANDATORY_FOR_M_COMMODITY_CODE = 1542;

    /**
     * This Constant is used to specify ClassRatingID prohibited if the value of
     * dynamic parameter Commodity Code for Spot Rates is P.
     * <p>
     * Value = {@value}
     */
    public static final int CLASS_RATING_ID_PROHIBITED_FOR_P_COMMODITY_CODE = 1543;

    /**
     * This Constant is used to specify The Spot Rate Origin Code and
     * Destination Code is required.
     * <p>
     * Value = {@value}
     */
    public static final int SPOTRATE_ORIGIN_DESTIN_CODE_MANDATORY = 1544;

    /**
     * This Constant is used to specify Carrier Code not allowed for Origin.
     * <p>
     * Value = {@value}
     */
    public static final int CARRIER_CODE_NOT_ALLOWED_FOR_ORIGIN = 1545;

    /**
     * This Constant is used to specify The Spot Rate Intermediate Station Code
     * must be 3 or 5 alphabets.
     * <p>
     * Value = {@value}
     */
    public static final int SPOTRATE_STATION_CODE_MUST_BE_THREE_ALPHABETS = 1546;

    /**
     * This Constant is used to specify SpotRate should have atleast one
     * non-minimum entry.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_NON_MINIMUM_RATE_NOT_PRESENT = 1548;

    /**
     * This Constant is used to specify No filters found for the spotrate.
     * <p>
     * Value = {@value}
     */
    public static final int NO_SPOT_RATE_FOUND_FOR_FILTERS = 1549;

    /**
     * This Constant is used to specify SpotRate already deleted.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_ALREADY_DELETED = 1550;

    /**
     * This Constant is used to specify unable to generate spotrate number.
     * <p>
     * Value = {@value}
     */
    public static final int UNABLE_TO_GENERATE_SPOT_RATE_NUMBER_TRY_LATER = 1551;

    /**
     * This Constant is used to specify The Participant Account Number must be
     * the same for all spot rate versions.
     * <p>
     * Value = {@value}
     */
    public static final int SAME_PART_ACCONT_FOR_ALL_VERSIONS = 1552;

    /**
     * This Constant is used to specify Rate Entry minimum weight is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_ENTRY_MINIMUM_WEIGHT_MANDATORY = 1553;

    /**
     * This Constant is used to specify Spot Rate Intermediate Station Codes
     * must not be same.
     * <p>
     * Value = {@value}
     */
    public static final int ROUTING_STATION_UNIQUE = 1554;

    /**
     * This Constant is used to specify Shipment Reference number invalid.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_SHIPMENT_REFERNCE_NUMBER_INVALID = 1555;

    /**
     * This Constant is used to specify AirwayBill code number prohibited if
     * Shipment Reference Number is not input.
     * <p>
     * Value = {@value}
     */
    public static final int AIRWAYBILL_CODE_NUMBER_PROHIBITED = 1556;

    /**
     * This Constant is used to specify Unable to load parameters for Spot
     * Rates.
     * <p>
     * Value = {@value}
     */
    public static final int UNABLE_TO_LOAD_PARAMETER = 1557;

    /**
     * This Constant is used to specify Shipment Reference number invalid.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_SHIPMENT_REFERNCE_NUMBER_INVALID1 = 1558;

    /**
     * This Constant is used to specify Shipment Reference number invalid.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_SHIPMENT_REFERNCE_NUMBER_INVALID2 = 1559;

    /**
     * This Constant is used to specify Shipment Reference number mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_SHIPMENT_REFERENCE_MANDATORY = 1560;

    /**
     * This Constant is used to specify Spot Rate flight number mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_FLIGHT_NUMBER_MANDATORY = 1561;

    /**
     * This Constant is used to specify Spot Rate flight number prohibited.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_FLIGHT_NUMBER_PROHIBITED = 1562;

    /**
     * This Constant is used to specify Spot Rate flight date mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_FLIGHT_DATE_MANDATORY = 1563;

    /**
     * This Constant is used to specify Spot Rate flight date prohibited.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_FLIGHT_DATE_PROHIBITED = 1564;

    /**
     * This Constant is used to specify Spot Rate product code mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_PRODUCT_CODE_MANDATORY = 1565;

    /**
     * This Constant is used to specify Spot Rate product code prohibited.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_PRODUCT_CODE_PROHIBITED = 1566;

    /**
     * This Constant is used to specify Spot Rate special instructions
     * prohibited.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_SPECIAL_INSTRUCTIONS_PROHIBITED = 1567;

    /**
     * This Constant is used to specify Spot Rate carrier code is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int SPOT_RATE_CARRIER_CODE_TYPE_SIZE = 1568;

    /**
     * This Constant is used to specify Spot Rate uld type is required.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_TYPE_REQUIRED_FOR_EACH_WEIGHT_UNIT = 1569;

    /**
     * This Constant is used to specify Spot Rate uld type is required.
     * <p>
     * Value = {@value}
     */

    public static final int SPOT_RATE_FLIGHT_NUMBER_INVALID = 1570;

    /**
     * This constant is used to specify the SpotRate Entry.
     * <p>
     * Code does not exists.
     * <p>
     * value = {@value}
     */
    public static final int CODE_DOES_NOT_EXIST = 1571;

    /**
     * This constant is used to specify the SpotRate Entry.
     * <p>
     * SpotRate Code is invalid..
     * <p>
     * value = {@value}
     */
    public static final int SPOT_RATE_STATION_CODE_TYPE_SIZE = 1572;

    /**
     * This constant is used to specify The Pivot Weight is allowed only for
     * FIXED (Fixed Rate) Spot Rate Definition with U Rate Class.
     * <p>
     * value = {@value}
     */
    public static final int SPOT_RATE_PIVOT_WEIGHT_ALLOWED_ONLY_IF_FIXED_U_RATE_CLASSES = 1573;

    /**
     * This constant is used to specify the The Pivot Weight is allowed only for
     * FIXED (Fixed Rate) Contract Definition with U Rate Class..
     * <p>
     * value = {@value}
     */
    public static final int SPOT_RATE_PIVOT_WEIGHT_ALLOWED_FIXED_U_RATE_CLASSES = 1574;

    /**
     * This constant is used to specify The Rate Source is required if Spot Rate
     * Definition is PERCENT (Percent Reduction), PRICE (Price Reduction)..
     * <p>
     * value = {@value}
     */
    public static final int SPOT_RATE_RATE_SOURCE_REQ_IF_CONTRACT_DEFINITION_PERCENT_OR_PRICE = 1575;

    /**
     * This constant is used to specify Only up to 3 decimal positions are
     * allowed for PERCENT (Percent Reduction) Spot Rate Definition.
     * <p>
     * value = {@value}
     */
    public static final int SPOT_RATE_DECIMAL_POSITIONS_INVALID_FOR_PERCENT_DEFINITION = 1576;

    /**
     * The Rate Class is required if SpotRate Definition is FIXED (Fixed Rate)
     * or FLAT (Flat Rate).
     * <p>
     * value = {@value}
     */
    public static final int SPOT_RATE_CLASS_REQ_IF_CONTRACT_DEFINITION_FIXED_OR_FLAT = 1577;

    /**
     * The Rate Class is required if The valid Rate Classes are M, N, Q, C, U
     * and K for FIXED (Fixed Rate),PERCENT(Percent Reduction),PRICE(Price
     * Reduction) SpotRate Definition.
     * <p>
     * value = {@value}
     */
    public static final int SPOT_RATE_CLASS_INVALID_FOR_FIXED_PERCENT_PRICE = 1578;

    /**
     * The Rate Adjustment is required for FLAT (Flat Rate) SpotRate Definition.
     * <p>
     * value = {@value}
     */
    public static final int SPOT_RATE_ADJUSTMENT_WEIGHT_REQUIRED_FOR_FLAT_DEFINITION = 1579;

    /**
     * The Rate Adjustment is required for FLAT (Flat Rate) SpotRate Definition.
     * <p>
     * value = {@value}
     */
    public static final int SPOT_RATE_ALL_MINIMUM_WEIGHT_NOT_ALLOWED_FOR_FLAT_AND_FIXED = 1580;

    /**
     * The valid Rate Classes are U for FLAT (Flat Rate) SpotRate Definition.
     * <p>
     * value = {@value}
     */
    public static final int SPOT_RATE_RATE_CLASS_INVALID_FOR_FLAT = 1581;

    /**
     * Spot Rate already exists for the input Spot Rate Origin Code, Spot Rate
     * Destination Code, Air Waybill Flight, Flight Date and Participant Account
     * Number combination.
     * <p>
     * value = {@value}
     */
    public static final int SPOT_RATE_DUPLICATE_FOR_ORIGIN_DEST_AWB_FLIGHT_PARTICIPANT = 1582;

    /**
     * This constant is used to specify the SpotRate Entry.
     * <p>
     * SpotRate commodity number must be alphanumeric.
     * <p>
     * value = {@value}
     */
    public static final int COMMODITY_NUMBER_ALPHANUMERIC = 1583;

    /**
     * This constant is used to specify the SpotRate flight number.
     * <p>
     * SpotRate flight number must be 2A(3,4)N(1A).
     * <p>
     * value = {@value}
     */
    public static final int FLIGHT_NUMBER_TYPE_SIZE1 = 1584;

    /**
     * This constant is used to specify Only letters, numbers, hyphen, period
     * and space up to 35 characters are accepted. Other special characters are
     * not accepted..
     *
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_NAME_OBJECT_INSTANCE = 1585;

    /**
     * This constant is used to specify the Only letters, numbers, hyphen,
     * period and space up to 36 characters are accepted. Other special
     * characters are not accepted.
     *
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_ADDRESS_OBJECT_INSTANCE = 1586;

    /**
     * This constant is used to specify the Only letters, numbers, hyphen,
     * period and space up to 20 characters are accepted. Other special
     * characters are not accepted.
     *
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_CITY_OBJECT_INSTANCE = 1587;

    /**
     * This constant is used to specify the Only letters, numbers, hyphen,
     * period and space up to 24 characters are accepted. Other special
     * characters are not accepted.
     *
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_STATE_OBJECT_INSTANCE = 1588;

    /**
     * This constant is used to specify the The country code has to be two
     * characters alphabets only.
     *
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_COUNTRY_OBJECT_INSTANCE = 1589;

    /**
     * This constant is used to specify Only letters, numbers, hyphen, period
     * and space up to 9 characters are accepted. Other special characters are
     * not accepted.
     *
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_POSTALCODE_OBJECT_INSTANCE = 1590;

    /**
     * This constant is used to specify the The currency code is mandatory for
     * price,flat,fixed reductions.
     *
     * value = {@value}
     */
    public static final int SPOTRATE_CURRENCY_CODE_IS_MANDATORY_IF_NOT_PERCENT_REDUCTION = 1591;

    /**
     * This constant is used to specify the Rate Adjustment is required if class
     * rating ID is not entered.
     *
     * value = {@value}
     */
    public static final int SPOTRATE_RATE_ADJUSTMENT_REQUIRED_IF_CLASSRATINGID_AND_FIXED = 1592;

    /**
     * This constant is used to specify the spot rate queue item exist or not.
     *
     * value = {@value}
     */
    public static final int SPOT_RATE_QUEUE_ITEM_DOES_NOT_EXIST = 1593;

    /**
     * This constant is used to specify that queue spot rate is mandatory.
     *
     * value = {@value}
     */
    public static final int NO_QUEUE_SPOT_RATE_SELCTED = 1594;

    /**
     * This constant is used to specify that defer participant is not allowed
     * for authorized user.
     *
     * value = {@value}
     */
    public static final int DEFER_PART_NOT_ALLOWED_FOR_AUTHORIZED_USER = 1595;

    /**
     * This constant is used to specify that spot rate is authorized
     * successfully.
     *
     * value = {@value}
     */
    public static final int SPOT_RATE_AUTHORIZED_SUCCESSFULLY = 1596;

    /**
     * This constant is used to specify that spot rate added to AWB re-rate
     * queue.
     *
     * value = {@value}
     */
    public static final int SPOT_RATE_ADDEDED_TO_AWB_RE_RATE_QUEUE = 1597;

    /**
     * This constant is used to specify that spot rate does not exist for the participant.
     *
     * value = {@value}
     */

    public static final int SPOTRATE_NOT_EXIST_FOR_PARTICIPANT = 1598;

    /**
     * This constant is used to specify that The Spot Rate Effective and Expiration Date range must be within
     * the Product Code Effective and Expiration Date range.
     *
     * value = {@value}
     */

    public static final int SPOTRATE_PRODUCT_CODE_DATE_RANGE = 1599;

    /**
     * This constant is used to specify that The Spot Rate Can not be authorized by the current user because
     * of less privilege.
     *
     * value = {@value}
     */

    public static final int SPOTRATE_CANNOT_AUTHORIZED = 1600;

    /**********************************************************/
    /** UC196 - Start Of Maintain Add On Rates **/
    /**********************************************************/

    /**
     * This constant is used to specify the City To Be Constructed Code is
     * mandatory.
     * <p>
     * The City To Be Constructed Code is mandatory.
     * <p>
     * value = {@value}
     */

    public static final int AOR_CITY_TO_CONSTRUCT_CODE_MANDATORY = 1401;

    /**
     * This constant is used to verify the City To Be Constructed Code.
     * <p>
     * The City To Be Constructed Code must be 3 alphabetic characters.
     * <p>
     * value = {@value}
     */
    public static final int AOR_CITY_TO_CONSTRUCT_TYPE_SIZE = 1402;

    /**
     * This constant is used to specify the City Of Construction Code is
     * mandatory.
     * <p>
     * The City Of Construction Code is mandatory..
     * <p>
     * value = {@value}
     */
    public static final int AOR_CITY_OF_CONSTRUCTION_CODE_MANDATORY = 1403;

    /**
     * This constant is used to verify the City Of Construction Code.
     * <p>
     * The City Of Construction Code must be 3 alphabetic characters.
     * <p>
     * value = {@value}
     */
    public static final int AOR_CITY_OF_CONSTRUCTION_TYPE_SIZE = 1404;

    /**
     * This constant is used to verify the IATA Area of Rate Construction Area.
     * <p>
     * The IATA Area of Rate Construction Area must be 1, 2 or 3.
     * <p>
     * value = {@value}
     */
    public static final int AOR_IATA_AREA_INVALID = 1405;

    /**
     * This constant is used to verify the Update Indicator.
     * <p>
     * The Update Indicator is mandatory for Update action.
     * <p>
     * value = {@value}
     */
    public static final int AOR_UPDATE_IND_MANDATORY = 1406;

    /**
     * This constant is used to verify the Update Indicator.
     * <p>
     * The Update Indicator must be Add, Update or Delete.
     * <p>
     * value = {@value}
     */
    public static final int AOR_UPDATE_IND_INVALID = 1407;

    /**
     * This constant is used to verify the Rate Class.
     * <p>
     * The Rate Class must be M, N, Q, U, E, C or K.
     * <p>
     * value = {@value}
     */
    public static final int AOR_RATE_CLASS_INVALID = 1408;

    /**
     * This constant is used to specify the Direction is mandatory.
     * <p>
     * The Direction is mandatory.
     * <p>
     * value = {@value}
     */
    public static final int AOR_DIRECTION_MANDATORY = 1409;

    /**
     * This constant is used to verify the Direction.
     * <p>
     * The Direction must be B (Between), F (From) or T (To).
     * <p>
     * value = {@value}
     */
    public static final int AOR_DIRECTION_TYPE_INVALID = 1410;

    /**
     * This constant is used to specify the Rate Construction Area Code is
     * mandatory.
     * <p>
     * The Rate Construction Area Code is mandatory.
     * <p>
     * value = {@value}
     */
    public static final int AOR_RATE_CONS_AREA_CODE_MANDATORY = 1411;

    /**
     * This constant is used to verify the Rate Construction Area Code.
     * <p>
     * The Rate Construction Area Code must be 3 numeric characters.
     * <p>
     * value = {@value}
     */
    public static final int AOR_RATE_CONS_AREA_CODE_TYPE_SIZE = 1412;

    /**
     * This constant is used to specify the ULD Type prohibited Rate Classes.
     * <p>
     * The ULD Type is prohibited if Rate Class is not \u2018U\u2019 or \u2018E\u2019.
     * <p>
     * value = {@value}
     */

    public static final int AOR_ULDTYPE_PROHIBITED_RATE_CLASS = 1413;

    /**
     * This constant is used to specify the ULD Charge Code.
     * <p>
     * The ULD Charge Code is mandatory if Rate Source is \u2018IRI\u2019 and Rate Class is \u2018U\u2019 or
     * \u2018E\u2019; Prohibited otherwise.
     * <p>
     * value = {@value}
     */
    public static final int AOR_ULDCHARGE_CODE_MANDATORY_FOR_RATESOURCE_AND_RATECLASS = 1414;

    /**
     * This constant is used to specify the ULD Charge Code.
     * <p>
     * The ULD Charge Code must be A, B, C, D, E, F, G, H, I or J.
     * <p>
     * value = {@value}
     */
    public static final int AOR_ULDCHARGE_CODE_INVALID = 1415;

    /**
     * This constant is used to specify the Rate.
     * <p>
     * The Rate must have 1-12 digits to the left of the decimal point and 0-5 digits to the right of the
     * decimal point.
     * <p>
     * value = {@value}
     */

    public static final int AOR_RATE_AMOUNT_INVALID = 1416;

    /**
     * This constant is used to specify the Rate classes for uldchargecode.
     * <p>
     * The Rate Class is not allowed for the input ULD Charge Code.
     * <p>
     * value = {@value}
     */
    public static final int AOR_RATE_CLASS_NOT_ALLOWED_FOR_ULDCHARGE_CODE = 1417;

    /**
     * This constant is used to specify the overpivot rate.
     * <p>
     * The Over Pivot Rate is mandatory if Pivot Weight is entered.
     * <p>
     * value = {@value}
     */
    public static final int AOR_OVER_PIVOTRATE_MANDATORY_FOR_PIVOT_WEIGHT = 1418;

    /**
     * This constant is used to specify the decimal position.
     * <p>
     * The decimal position in Minimum Weight is not allowed.
     * <p>
     * value = {@value}
     */
    public static final int AOR_DEC_POSITION_FOR_MIN_WEIGHT_NOT_ALLOWED = 1419;

    /**
     * This constant is used to specify the Plus/Minus Add-on Rate Indicator.
     * <p>
     * The Plus/Minus Add-on Rate Indicator must be + or -.
     * <p>
     * value = {@value}
     */
    public static final int AOR_PLUS_MINUS_IND_INVALID = 1420;

    /**
     * This constant is used to specify the input currency.
     * <p>
     * The input currency must be one of the allowed currencies of City To Be Constructed Code.
     * <p>
     * value = {@value}
     */
    public static final int AOR_INPUT_CURRENCY_MUST_BE_VALID_CURRENCY_OF_CITY = 1421;

    /**
     * This constant is used to specify the Rounding Factor of Currency.
     * <p>
     * The Over Pivot Rate must be rounded off to Rounding Factor of Currency.
     * <p>
     * value = {@value}
     */
    public static final int AOR_OVER_PIVOTRATE_MUST_ROUND_OFF = 1422;

    /**
     * This constant is used to specify the existence of Add-on Rate.
     * <p>
     * The Add-on Rate does not exist for the input details.
     * <p>
     * value = {@value}
     */
    public static final int AOR_ADDON_RATE_NOT_EXISTS = 1423;

    /**
     * This constant is used to specify the existence of Add-on Rate for given
     * filters.
     * <p>
     * The Add-on Rate does not exist for the input details and Filter combination.
     * <p>
     * value = {@value}
     */
    public static final int AOR_ADDON_RATE_NOT_EXISTS_FOR_FILTERS = 1424;

    /**
     * This constant is used to specify the existence of Add-on Rate .
     * <p>
     * The Add-on Rate already exists for the input details.
     * <p>
     * value = {@value}
     */
    public static final int AOR_ADDON_RATE_ALREADY_EXISTS = 1425;

    /**
     * This constant is used to specify the Rate Types of Add-on Rate .
     * <p>
     * Only Standard Rate Types are allowed for Add-on Rates.
     * <p>
     * value = {@value}
     */
    public static final int AOR_STANDARD_RATE_TYPES_ALLOWED_FOR_ADDON_RATE = 1426;

    /**
     * This constant is used to specify the Rate Class of Add-on Rate .
     * <p>
     * The Rate Class is not allowed for add-on rate.
     * <p>
     * value = {@value}
     */
    public static final int AOR_RATECLASS_NOT_ALLOWED_FOR_ADDON_RATE = 1427;

    /**
     * This constant is used to specify the Minimum Weight.
     * <p>
     * The Minimum Weight must be 0 for Rate Class \u2018M\u2019.
     * <p>
     * value = {@value}
     */
    public static final int AOR_MIN_WEIGHT_ZERO_FOR_RC_M = 1428;

    /**
     * This constant is used to specify the Minimum Weight.
     * <p>
     * The Minimum Weight must be greater than 1 for Rate Class \u2018Q\u2019.
     * <p>
     * value = {@value}
     */
    public static final int AOR_PIVOT_WEIGHT_MANDATORY_FOR_OVER_PIVOTRATE = 1429;

    /**
     * This constant is used to specify the Minimum Weight.
     * <p>
     * The Minimum Weight must be 0 for Rate Class \u2018U\u2019 and ULD Charge Code \u2018A\u2019.
     * <p>
     * value = {@value}
     */
    public static final int AOR_MIN_WEIGHT_ZERO_FOR_RC_U_AND_ULD_A = 1430;

    /**
     * This constant is used to specify the Minimum Weight.
     * <p>
     * The Minimum Weight must be 1 for \u201CStandard\u201D Rate Types with \u201CN\u201D Rate Class.
     * <p>
     * value = {@value}
     */
    public static final int AOR_MIN_WEIGHT_ONE_FOR_STANDARD_AND_RC_N = 1431;

    /**
     * This constant is used to specify the Pivot Weight.
     * <p>
     * The Pivot Weight is allowed only for ATPCO ULD rates with Standard Rate Type.
     * <p>
     * value = {@value}
     */
    public static final int AOR_PIVOT_WEIGHT_ALLOWED_FOR_ATPCO_ULD_RATES_WITH_STD_RATE = 1432;

    /**
     * This constant is used to specify the Over Pivot Rate.
     * <p>
     * The Over Pivot Rate is allowed only for ATPCO ULD rates with Standard Rate Type.
     * <p>
     * value = {@value}
     */
    public static final int AOR_OVER_PIVOT_RATE_ALLOWED_FOR_ATPCO_ULD_RATES_WITH_STD_RATE = 1433;

    /**
     * This constant is used to specify the Currency Effective Date.
     * <p>
     * The input Effective Date of the add-on rate entry must be greater than or equal to the Currency
     * Effective Date.
     * <p>
     * value = {@value}
     */
    public static final int AOR_EFF_DATE_GREATER_THAN_OR_EQUAL_CURRENCY_EFF_DATE = 1434;

    /**
     * This constant is used to specify the Currency Effective Date.
     * <p>
     * The input Effective Date of the add-on rate entry must be less than or equal to the Currency Expiration
     * Date.
     * <p>
     * value = {@value}
     */
    public static final int AOR_EFF_DATE_LESS_THAN_OR_EQUAL_CURRENCY_EXP_DATE = 1435;

    /**
     * This constant is used to specify the Currency Expiration Date.
     * <p>
     * The input Expiration Date of the add-on rate entry must be less than or equal to the Currency
     * Expiration Date.
     * <p>
     * value = {@value}
     */
    public static final int AOR_EXP_DATE_LESS_THAN_OR_EQUAL_CURRENCY_EXP_DATE = 1436;

    /**
     * This constant is used to specify the Expiration Date.
     * <p>
     * The Add-on Rate Entry is effective and only Expiration date can be updated.
     * <p>
     * value = {@value}
     */
    public static final int AOR_EFFECTIVE_ADDON_RATE_EXP_DATE_ONLY_UPDATED = 1437;

    /**
     * This constant is used to specify the duplicate add-on rate entry.
     * <p>
     * The duplicate add-on rate entry is not allowed.
     * <p>
     * value = {@value}
     */
    public static final int AOR_DUPLICATE_ADDON_RATE = 1438;

    /**
     * This constant is used to specify the Rate Construction Area Code.
     * <p>
     * The Rate Construction Area Code must be valid.
     * <p>
     * value = {@value}
     */
    public static final int AOR_RATE_CONST_MUST_VALID = 1439;

    /**
     * This constant is used to specify the Rate Construction Area Code.
     * <p>
     * The Rate Construction Area Code is marked for deletion.
     * <p>
     * value = {@value}
     */
    public static final int AOR_RATE_CONST_MARKED_FOR_DELETION = 1440;

    /**
     * This constant is used to specify the add-on rate is created.
     * <p>
     * The add-on rate is created.
     * <p>
     * value = {@value}
     */
    public static final int AOR_ADDON_RATE_CREATED = 1441;

    /**
     * This constant is used to specify the add-on rate is created.
     * <p>
     * The add-on rate is created.
     * <p>
     * value = {@value}
     */
    public static final int AOR_ADDON_RATE_UPDATED = 1442;

    /**
     * This constant is used to specify the add-on rate is updated.
     * <p>
     * The add-on rate is updated.
     * <p>
     * value = {@value}
     */
    public static final int AOR_ADDON_RATE_DELETED = 1443;

    /**
     * This constant is used to specify the add-on rate is deleted.
     * <p>
     * The add-on rate is deleted.
     * <p>
     * value = {@value}
     */
    public static final int ADDON_RATE_EFFECTIVE_CANT_BE_DELETED = 1444;

    /**
     * This constant is used to specify the add-on rate entries.
     * <p>
     * Invalid add-on rate entries.
     * <p>
     * value = {@value}
     */
    public static final int ADD_ON_RATE_ENTRIES_INAVLID = 1445;

    /**
     * This constant is used to specify the Add-on rate carrier code.
     * <p>
     * Add-on rate carrier code is modified.
     * <p>
     * value = {@value}
     */
    public static final int AOR_ADDON_RATE_CARRIER_CODE_MODIFIED = 1446;

    /**
     * This constant is used to specify the city to be constructed code
     * <p>
     * Add-on rate city to be constructed code is modified.
     * <p>
     * value = {@value}
     */
    public static final int AOR_CITY_TO_BE_CONSTRUCTED_CODE_MODIFIED = 1447;

    /**
     * This constant is used to specify the AddOn Rate Entry.
     * <p>
     * At least one AddOn Rate Entry must be added/updated for create/update.
     * <p>
     * value = {@value}
     */
    public static final int AOR_ADDON_RATE_ENTRIES_REQUIRED = 1448;

    /**
     * This constant is used to specify the Rate Class.
     * <p>
     * The Rate Class is mandatory.
     *
     * <p>
     * value = {@value}
     */
    public static final int AOR_RATE_CLASS_MANDATORY = 1449;

    /**********************************************************/
    /** UC196 - End Of Maintain Add On Rates **/
    /**********************************************************/

    /**********************************************************/
    /** UC197 - Start Of Maintain Joint Rates **/
    /**********************************************************/

    /**
     * This constant is used to specify the OriginCode.
     * <p>
     * The Origin Code must be 3 or 5 alphabetic characters.
     * <p>
     * value = {@value}
     */
    public static final int JR_ORIGIN_CODE_TYPE_SIZE = 1601;

    /**
     * This constant is used to specify the IntermediateCityCode 1.
     * <p>
     * The Intermediate City Code 1 is mandatory.
     * <p>
     * value = {@value}
     */
    public static final int JR_INTERMEDIATE_CITY_CODE1_MANDATORY = 1602;

    /**
     * This constant is used to specify the IntermediateCityCode.
     * <p>
     * The Intermediate City Code 2 is mandatory if Intermediate Carrier Code 2 is entered.
     * <p>
     * value = {@value}
     */
    public static final int JR_INTERMEDIATE_CITY_CODE_MANDATORY = 1603;

    /**
     * This constant is used to specify the IntermediateCityCode.
     * <p>
     * The Intermediate City Code must be 3 or 5 alphabetic characters.
     * <p>
     * value = {@value}
     */
    public static final int JR_INTERMEDIATE_CITY_CODE_TYPE_SIZE = 1604;

    /**
     * This constant is used to specify the CarrierCode1.
     * <p>
     * The Intermediate Carrier Code 1 is mandatory.
     * <p>
     * value = {@value}
     */
    public static final int JR_INTERMEDIATE_CARRIERCODE1_MANDATORY = 1605;

    /**
     * This constant is used to specify the CarrierCode.
     * <p>
     * The Intermediate Carrier Code 2 is mandatory if Intermediate City Code 2 is entered.
     * <p>
     * value = {@value}
     */
    public static final int JR_INTERMEDIATE_CARRIERCODE_MANDATORY = 1606;

    /**
     * This constant is used to specify the CarrierCode.
     * <p>
     * The Intermediate Carrier Code must be 2 or 3 alphabetic characters.
     * <p>
     * value = {@value}
     */
    public static final int JR_INTERMEDIATE_CARRIER_CODE_TYPE_SIZE = 1607;

    /**
     * This constant is used to specify the DestinationCode.
     * <p>
     * The Destination Code is mandatory.
     * <p>
     * value = {@value}
     */
    public static final int JR_DESTINATION_CODE_MANDATORY = 1608;

    /**
     * This constant is used to specify the DestinationCode.
     * <p>
     * The Destination Code must be 3 or 5 alphabetic characters.
     * <p>
     * value = {@value}
     */
    public static final int JR_DESTINATION_CODE_TYPE_SIZE = 1609;

    /**
     * This constant is used to specify the DestinationCarrierCode.
     * <p>
     * The Destination Carrier Code is mandatory.
     * <p>
     * value = {@value}
     */
    public static final int JR_DESTINATION_CARRIERCODE_MANDATORY = 1610;

    /**
     * This constant is used to specify the DestinationCarrierCode.
     * <p>
     * The Destination Carrier Code must be 2 or 3 alphabetic characters.
     * <p>
     * value = {@value}
     */
    public static final int JR_DESTINATION_CARRIER_CODE_TYPE_SIZE = 1611;

    /**
     * This constant is used to specify the PivotWeight .
     * <p>
     * The Pivot Weight is mandatory if Over Pivot Rate is entered.
     * <p>
     * value = {@value}
     */
    public static final int JR_PIVOT_WEIGHT_MANDATORY = 1612;

    /**
     * This constant is used to specify the percentage.
     * <p>
     * The total of all 3 percentages must be either 0 or 100 if entered.
     * <p>
     * value = {@value}
     */
    public static final int JR_PERCENT_MUST_ENTERED = 1613;

    /**
     * This constant is used to specify the percentage.
     * <p>
     * The Percentage 1 must be 1-2 digit numbers.
     * <p>
     * value = {@value}
     */
    public static final int JR_PERCENT_TYPE_SIZE = 1614;

    /**
     * This constant is used to specify the cityCode.
     * <p>
     * All cities must be within North America.
     * <p>
     * value = {@value}
     */
    public static final int JR_CITY_NOT_WITHIN_NORTH_AMERICA = 1615;

    /**
     * This constant is used to specify the cityCode.
     * <p>
     * All cities must be unique.
     * <p>
     * value = {@value}
     */
    public static final int JR_ALL_CITIES_MUST_BE_UNIQUE = 1616;

    /**
     * This constant is used to specify the RateSource.
     * <p>
     * Only Rate Source “ATP” is allowed..
     * <p>
     * value = {@value}
     */
    public static final int JR_ATP_RATE_SOURCE_ALLOWED = 1617;

    /**
     * This constant is used to specify the JointRate.
     * <p>
     * The Joint Rate does not exist for the input details.
     * <p>
     * value = {@value}
     */
    public static final int JOINT_RATE_NOT_EXISTS_FOR_THIS_ROUTING = 1618;

    /**
     * This constant is used to specify the JointRate for the given filters.
     * <p>
     * The Joint Rate does not exist for the input details and Filter combination.
     * <p>
     * value = {@value}
     */
    public static final int JOINT_RATE_NOT_EXISTS_FOR_FILTERS = 1619;

    /**
     * This constant is used to specify the JointRate.
     * <p>
     * The Joint Rate already exists for the input details.
     * <p>
     * value = {@value}
     */
    public static final int JOINT_RATE_ALREADY_EXISTS = 1620;

    /**
     * This constant is used to specify the RateType.
     * <p>
     * The Rate Type is not allowed for ATP Rate Source.
     * <p>
     * value = {@value}
     */
    public static final int JR_RATE_TYPE_NOT_ALLOWED_FOR_RATESOURCE = 1621;

    /**
     * This constant is used to specify the RateClass for the JointRate.
     * <p>
     * The Rate Class is not allowed for joint rate.
     * <p>
     * value = {@value}
     */
    public static final int JR_RATE_CLASS_NOT_ALLOWED_FOR_JOINT_RATE = 1622;

    /**
     * This constant is used to specify the RateClass.
     * <p>
     * The Rate Class is not allowed for ATPCO rating convention of input Rate Type.
     * <p>
     * value = {@value}
     */
    public static final int JR_RATE_CLASS_NOT_ALLOWED_FOR_ATPCO_RATING_RATETYPE = 1623;

    /**
     * This constant is used to specify the minimumWeight.
     * <p>
     * The Minimum Weight must be greater than or equal to 1 for Rate Class ‘U’.
     * <p>
     * value = {@value}
     */
    public static final int JR_MIN_WT_MUST_GREATER_THAN_EQUAL_ONE_FOR_RATECLASS_U = 1624;

    /**
     * This constant is used to specify the minimumWeight.
     * <p>
     * The Minimum Weight is greater than Maximum Chargeable Weight Allowed of Rate Type.
     * <p>
     * value = {@value}
     */
    public static final int JR_MIN_WT_GREATER_THAN_MAX_CHARGE_WT = 1625;

    /**
     * This constant is used to specify the minimumWeight and
     * MaximumGrossWeight.
     * <p>
     * The Minimum Weight is greater than Maximum Gross Weight Allowed of Rate Type.
     * <p>
     * value = {@value}
     */
    public static final int JR_MIN_WT_GREATER_THAN_MAX_GROSS_WT = 1626;

    /**
     * This constant is used to specify the Decimal Postion Allowed for
     * RateClass N.
     * <p>
     * The decimal position in Minimum Weight is allowed only for Rate Class ‘N’.
     * <p>
     * value = {@value}
     */
    public static final int JR_DEC_POS_MIN_WT_ALLOWED_FOR_RATECLASS_N = 1627;

    /**
     * This constant is used to specify the Decimal Position for Currency.
     * <p>
     * The number of decimals in Rate must be same as Number of Decimals for the Currency.
     * <p>
     * value = {@value}
     */
    public static final int JR_RATE_AND_CURRENCY_DEC_SAME = 1628;

    /**
     * This constant is used to specify the DateRange for the JointRate.
     * <p>
     * The input Effective Date of the joint rate entry must be greater than or equal to the Currency
     * Effective Date.
     * <p>
     * value = {@value}
     */
    public static final int JR_EFF_DATE_GREATER_THAN_OR_EQUAL_CURRENCY_EFF_DATE = 1629;

    /**
     * This constant is used to specify the DateRange for the JointRate.
     * <p>
     * The input Effective Date of the joint rate entry must be less than or equal to the Currency Expiration
     * Date.
     * <p>
     * value = {@value}
     */
    public static final int JR_EFF_DATE_LESS_THAN_OR_EQUAL_CURRENCY_EXP_DATE = 1630;

    /**
     * This constant is used to specify the DateRange for the JointRate.
     * <p>
     * The input Expiration Date of the joint rate entry must be less than or equal to the Currency Expiration
     * Date.
     * <p>
     * value = {@value}
     */
    public static final int JR_EXP_DATE_LESS_THAN_OR_EQUAL_CURRENCY_EXP_DATE = 1631;

    /**
     * This constant is used to specify the EffectiveDate and ExpirationDate for
     * the JointRate.
     * <p>
     * The Joint Rate Entry is effective and only Expiration date can be updated.
     * <p>
     * value = {@value}
     */
    public static final int JR_EFFECTIVE_JOINT_RATE_EXP_DATE_ONLY_UPDATED = 1632;

    /**
     * This constant is used to specify the Duplicate JointRateEntries.
     * <p>
     * The duplicate Joint rate entry is not allowed.
     * <p>
     * value = {@value}
     */
    public static final int JOINT_RATE_HAS_DUPLICATE_ENTRIES = 1633;

    /**
     * This constant is used to specify the RatingNote.
     * <p>
     * The Rating Note must be valid for Intermediate Carrier Code 1.
     * <p>
     * value = {@value}
     */
    public static final int JR_RATING_NOTE_VALID_FOR_CARRIER_CODE1 = 1634;

    /**
     * This constant is used to specify the Commodity Number.
     * <p>
     * Only ATPCO Commodity Number is allowed.
     * <p>
     * value = {@value}
     */
    public static final int JR_ATPCO_COMMODITY_NUMBER_ALLOWED = 1635;

    /**
     * This constant is used to specify the Percentage for Routing.
     * <p>
     * The Percentage 3 is not allowed for Non-Four city routing.
     * <p>
     * value = {@value}
     */
    public static final int JR_PERCENT_NOT_ALLOWED_FOR_NONFOUR_CITY_ROTUING = 1636;

    /**
     * This constant is used to specify the Total Percentage.
     * <p>
     * The total of percentage fields must either be 0 or 100.
     * <p>
     * value = {@value}
     */
    public static final int JR_TOTAL_PERCENT_ZERO_OR_HUNDRED = 1637;

    /**
     * This constant is used to specify the JointRate is Created.
     * <p>
     * The joint rate is created.
     * <p>
     * value = {@value}
     */
    public static final int JOINT_RATE_CREATED = 1638;

    /**
     * This constant is used to specify the JointRate is Updated .
     * <p>
     * The joint rate is updated.
     * <p>
     * value = {@value}
     */
    public static final int JOINT_RATE_UPDATED = 1639;

    /**
     * This constant is used to specify the JointRate is Deleted.
     * <p>
     * The joint rate is deleted.
     * <p>
     * value = {@value}
     */
    public static final int JOINT_RATE_DELETED = 1640;

    /**
     * This constant is used to specify the Effective JointRate.
     * <p>
     * The Effective Joint Rate cannot be deleted.
     * <p>
     * value = {@value}
     */
    public static final int JOINT_RATE_EFFECTIVE_CANT_BE_DELETED = 1641;

    /**
     * This constant is used to specify the IntermediateCityCode.
     * <p>
     * Atleast one intermediate code is mandatory.
     * <p>
     * value = {@value}
     */
    public static final int JOINT_RATE_ATLEAST_ONE_INTERMEDIATE_CODE_IS_MANDATORY = 1642;

    /**
     * This constant is used to specify the Unique CarrierCode.
     * <p>
     * Atleast one intermediate code is mandatory.
     * <p>
     * value = {@value}
     */
    public static final int JR_ATLEAST_TWO_CARRIERS_MUST_BE_UNIQUE = 1643;

    /**
     * This constant is used to specify the ExpirationDate of Effective
     * JointRate.
     * <p>
     * The effective joint rate expiration date can only be updated.
     * <p>
     * value = {@value}
     */
    public static final int JR_JOINT_RATE_EFFECTIVE_CANT_BE_UPDATED = 1644;

    /**
     * This constant is used to specify the OriginCityCode.
     * <p>
     * The Origin City code is modified.
     * <p>
     * value = {@value}
     */
    public static final int ORIGIN_CITY_CODE_MODIFIED = 1645;

    /**
     * This constant is used to specify the IntermediateCityCode1.
     * <p>
     * The Intermediate City code 1 is modified.
     * <p>
     * value = {@value}
     */
    public static final int INTERMEDIATE_CITY1_CODE_MODIFIED = 1646;

    /**
     * This constant is used to specify the CarrierCode1.
     * <p>
     * The Intermediate Carrier code 1 is modified.
     * <p>
     * value = {@value}
     */
    public static final int INTERMEDIATE_CARRIER1_CODE_MODIFIED = 1647;

    /**
     * This constant is used to specify the IntermediateCityCode2.
     * <p>
     * The Intermediate City code 2 is modified.
     * <p>
     * value = {@value}
     */
    public static final int INTERMEDIATE_CITY2_CODE_MODIFIED = 1648;

    /**
     * This constant is used to specify the CarrierCode2.
     * <p>
     * The Intermediate Carrier code 2 is modified.
     * <p>
     * value = {@value}
     */
    public static final int INTERMEDIATE_CARRIER2_CODE_MODIFIED = 1649;

    /**
     * This constant is used to specify the CurrencyCode.
     * <p>
     * The Currency Code is modified.
     * <p>
     * value = {@value}
     */
    public static final int CURRENCY_CODE_MODIFIED = 1650;

    /**
     * This constant is used to specify the AddOn Rate Entry.
     * <p>
     * At least one AddOn Rate Entry must be added/updated for create/update.
     * <p>
     * value = {@value}
     */
    public static final int DESTINATION_CITY_CODE_MODIFIED = 1651;

    /**
     * This constant is used to specify the DestinationCarrierCode.
     * <p>
     * The Destination Carrier code is modified.
     * <p>
     * value = {@value}
     */
    public static final int DESTINATION_CARRIER_CODE_MODIFIED = 1652;

    /**
     * This constant is used to specify the Intermediate CityCode.
     * <p>
     * The Intermediate CityCode is mandatory.
     * <p>
     * value = {@value}
     */
    public static final int INTERMEDIATE_CITY_CODE_MANDATORY = 1653;

    /**
     * This constant is used to specify the Intermediate CarrierCode.
     * <p>
     * The Intermediate CarrierCode is mandatory.
     * <p>
     * value = {@value}
     */
    public static final int INTERMEDIATE_CARRIER_CODE_MANDATORY = 1654;

    /**
     * This constant is used to specify the Intermediate and Destination Code.
     * <p>
     * The Intermediate and Destination are Mandatory.
     * <p>
     * value = {@value}
     */
    public static final int INTERMEDIATE_AND_DESTINATION_ARE_MANDATORY = 1655;

    /**
     * This constant is used to specify the OverPivot Weight.
     * <p>
     * The Over Pivot weight is Mandatory.
     * <p>
     * value = {@value}
     */
    public static final int JR_OVER_PIVOT_WEIGHT_IS_MANDATORY = 1656;

    /**
     * This constant is used to specify the Intermediate and Destination Code.
     * <p>
     * The IntermediateCityCode1 and CarrierCode1 are Mandatory.
     * <p>
     * value = {@value}
     */
    public static final int JR_INTERMEDIATE_CITYCODE1_AND_CARRIERCODE1_MANDATORY = 1657;

    /**
     * This constant is used to specify the Joint Rate Entry.
     * <p>
     * At least one Joint Rate Entry must be added/updated for create/update.
     * <p>
     * value = {@value}
     */
    public static final int JR_JOINT_RATE_ENTRIES_REQUIRED = 1658;

    /**
     * This constant is used to specify that the minimum weight must be greater
     * than 0 for rate class k.
     * <p>
     * The minimum weight must be greater than 0 for rate class k
     * <p>
     * value = {@value}
     */
    public static final int JR_MINIMUM_WEIGHT_GREATER_THAN_ZERO_FOR_RATE_CLASS_K = 1659;

    /**
     * This constant is used to specify the rate source for joint rates.
     * <p>
     * Only Rate Source “ATP” is allowed.
     * <p>
     * value = {@value}
     */
    public static final int JOINT_RATE_RATESOURCE_MUST_BE_ATPCO = 1670;

    /**
     * This constant is used to specify that YYY carrier Cannot be Used for Joint Rates.
     * <p>
     * The carrier code YYY is not allowed for creating Joint Rates.
     * <p>
     * value = {@value}
     */
    public static final int JR_YYY_CARRIER_MUST_NOT_BE_USED = 1671;

    /**********************************************************/
    /** UC197 - End Of Maintain Joint Rates **/
    /**********************************************************/

    /**********************************************************/
    /** UC320-- Start Maintain Security Information **/
    /**********************************************************/

    /**
     * This constant is used to specify the UserId.
     * <p>
     * The User ID is required.
     * <p>
     * value = {@value}
     */
    public static final int USER_ID_IS_REQUIRED = 1701;

    /**
     * This constant is used to specify the UserId.
     * <p>
     * The User ID must be 1-12 alphanumeric characters.
     * <p>
     * value = {@value}
     */
    public static final int USER_ID_MUST_BE_1_TO_12_ALPHANUMERIC = 1702;

    /**
     * This constant is used to specify the UserGroupId.
     * <p>
     * The User Group ID is required.
     * <p>
     * value = {@value}
     */
    public static final int USER_GROUP_ID_IS_REQUIRED = 1703;

    /**
     * This constant is used to specify the UserGroupId.
     * <p>
     * The User Group ID must be 2 alphanumeric characters.
     * <p>
     * value = {@value}
     */
    public static final int USER_GROUP_ID_MUST_BE_2_ALPHANUMERIC_CHARACTERS = 1704;

    /**
     * This constant is used to specify the SecurityType.
     * <p>
     * The Security Type must be S (Sign-in Station) or C (Contract / Spot Rate).
     * <p>
     * value = {@value}
     */
    public static final int SECURITY_TYPE_MUST_BE_S_OR_C = 1705;

    /**
     * This constant is used to specify the SecurityType.
     * <p>
     * The Security Type is required.
     * <p>
     * value = {@value}
     */
    public static final int SECURITY_TYPE_IS_REQUIRED = 1706;

    /**
     * This constant is used to specify the OriginCode for IATA Area Code.
     * <p>
     * The Origin Code must be 1 numeric for IATA Area Code.
     * <p>
     * value = {@value}
     */
    public static final int ORIGIN_CODE_MUST_BE_1NUMERIC_FOR_IATA_AREA_CODE = 1707;

    /**
     * This constant is used to specify the OriginCode for IATA Sub-Area Codes.
     * <p>
     * The Origin Code must be 2 alphanumeric characters for IATA Sub-Area Codes.
     * <p>
     * value = {@value}
     */
    public static final int ORIGIN_CODE_MUST_BE_2_ALPHA_NUMERIC_FOR_IATA_SUB_AREA_CODE = 1708;

    /**
     * This constant is used to specify the OriginCode for IATA Region Codes.
     * <p>
     * The Origin Code must be 4 alphanumeric characters for IATA Region Codes.
     * <p>
     * value = {@value}
     */
    public static final int ORIGIN_CODE_MUST_BE_4_ALPHA_NUMERIC_FOR_IATA_REGION_CODE = 1709;

    /**
     * This constant is used to specify the OriginCode for Country Code.
     * <p>
     * The Origin Code must be 2 alphabetic characters for Country Code.
     * <p>
     * value = {@value}
     */
    public static final int ORIGIN_CODE_MUST_BE_2_ALPHABETIC_CHARACTER_FOR_COUNTRY_CODE = 1710;

    /**
     * This constant is used to specify the OriginCode for City Code.
     * <p>
     * The Origin Code must be 3 or 5 alphabetic characters for City Code.
     * <p>
     * value = {@value}
     */
    public static final int ORIGIN_CODE_MUST_BE_3_OR_5_ALPHABETIC_CHARACTER_FOR_CITY_CODE = 1711;

    /**
     * This constant is used to specify the OriginCode for Aggregate.
     * <p>
     * The Origin Code must be 4-7 alphanumeric characters for Aggregate.
     * <p>
     * value = {@value}
     */
    public static final int ORIGIN_CODE_MUST_BE_4_TO_7_ALPHA_NUMERIC_FOR_AGGREGATE = 1712;

    /**
     * This constant is used to specify the OriginCode for Origin Indicator.
     * <p>
     * The Origin Code is not allowed if Origin Indicator is input.
     * <p>
     * value = {@value}
     */
    public static final int ORIGIN_CODE_IS_NOT_ALLOWED_IF_ORIGIN_INDICATOR_IS_INPUT = 1713;

    /**
     * This constant is used to specify the Origin Indicator.
     * <p>
     * The Origin Indicator must be \u2018S\u2019 (Sign-in Station) or \u2018A\u2019 (All Origin).
     * <p>
     * value = {@value}
     */
    public static final int ORIGIN_INDICATOR_MUST_BE_S_OR_A = 1714;

    /**
     * This constant is used to specify the DestinationCode for IATA Area Code.
     * <p>
     * The Destination Code must be 1 numeric for IATA Area Code.
     * <p>
     * value = {@value}
     */
    public static final int DESTINATION_CODE_MUST_BE_1NUMERIC_FOR_IATA_AREA_CODE = 1715;

    /**
     * This constant is used to specify the DestinationCode for IATA Sub-Area
     * Codes.
     * <p>
     * The Destination Code must be 2 alphanumeric characters for IATA Sub-Area Codes.
     * <p>
     * value = {@value}
     */
    public static final int DESTINATION_CODE_MUST_BE_2_ALPHA_NUMERIC_FOR_IATA_SUB_AREA_CODE = 1716;

    /**
     * This constant is used to specify the DestinationCode for IATA Region
     * Codes.
     * <p>
     * The Destination Code must be 4 alphanumeric characters for IATA Region Codes.
     * <p>
     * value = {@value}
     */
    public static final int DESTINATION_CODE_MUST_BE_4_ALPHA_NUMERIC_FOR_IATA_REGION_CODE = 1717;

    /**
     * This constant is used to specify the DestinationCode for Country Code.
     * <p>
     * The Destination Code must be 2 alphabetic characters for Country Code.
     * <p>
     * value = {@value}
     */
    public static final int DESTINATION_CODE_MUST_BE_2_ALPHABETIC_CHARACTER_FOR_COUNTRY_CODE = 1718;

    /**
     * This constant is used to specify the DestinationCode for City Code.
     * <p>
     * The Destination Code must be 3 or 5 alphabetic characters for City Code.
     * <p>
     * value = {@value}
     */
    public static final int DESTINATION_CODE_MUST_BE_3_OR_5_ALPHABETIC_CHARACTER_FOR_CITY_CODE = 1719;

    /**
     * This constant is used to specify the DestinationCode for Aggregate.
     * <p>
     * The Origin Code must be 4-7 alphanumeric characters for Aggregate.
     * <p>
     * value = {@value}
     */
    public static final int DESTINATION_CODE_MUST_BE_4_TO_7_ALPHA_NUMERIC_FOR_AGGREGATE = 1720;

    /**
     * This constant is used to specify the DestinationCode for Destination
     * Indicator.
     * <p>
     * The Destination Code is not allowed if Destination Indicator is input.
     * <p>
     * value = {@value}
     */
    public static final int DESTINATION_CODE_IS_NOT_ALLOWED_IF_DESTINATION_INDICATOR_IS_INPUT = 1721;

    /**
     * This constant is used to specify the Destination Indicator.
     * <p>
     * The Destination Indicator must be \u2018S\u2019 (Sign-in Station) or \u2018A\u2019 (All Origin) .
     * <p>
     * value = {@value}
     */
    public static final int DESTINATION_INDICATOR_MUST_BE_S_OR_A = 1722;

    /**
     * This constant is used to specify the UserId is existing in the system.
     * <p>
     * The input User ID does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int INPUT_USER_ID_DOES_NOT_EXIST_IN_THE_SYSTEM = 1723;

    /**
     * This constant is used to specify the Security Information for the UserId.
     * <p>
     * No security information is available for the input User ID.
     * <p>
     * value = {@value}
     */
    public static final int NO_SECURITY_INFORMATION_IS_AVAILABLE_FOR_THE_INPUT_USER_ID = 1724;

    /**
     * This constant is used to specify the already existing Security
     * Information for the UserId.
     * <p>
     * The security information already exists for the input user.
     * <p>
     * value = {@value}
     */
    public static final int SECURITY_INFORMATION_ALREADY_EXIST_FOR_THE_INPUT_USER = 1725;

    /**
     * This constant is used to specify the GroupUserId.
     * <p>
     * The input User Group ID does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int INPUT_USER_GROUP_ID_DOES_NOT_EXIST_IN_THE_SYSTEM = 1726;

    /**
     * This constant is used to specify the Security Information for the
     * GroupUserId.
     * <p>
     * No security information is available for the input User Group ID.
     * <p>
     * value = {@value}
     */
    public static final int INPUT_USER_GROUP_ID_NO_SECURITY_INFO = 1727;

    /**
     * This constant is used to specify the already existing Security
     * Information for the GroupUserId.
     * <p>
     * The security information already exists for the input user group.
     * <p>
     * value = {@value}
     */
    public static final int INPUT_USER_GROUP_ID_SECURITY_INFO_ALREADY_EXIST = 1728;

    /**
     * This constant is used to specify the RateSource.
     * <p>
     * The Rate Source does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int RATE_SOURCE_ALREADY_EXIST = 1729;

    /**
     * This constant is used to specify the RateSource.
     * <p>
     * The Rate Source must be valid Private Rate Source.
     * <p>
     * value = {@value}
     */
    public static final int RATE_SOURCE_MUST_BE_VALID_PRIVATE = 1730;

    /**
     * This constant is used to specify the OriginCode.
     * <p>
     * Invalid Origin Code.
     * <p>
     * value = {@value}
     */
    public static final int INVALID_ORIGIN_CODE = 1731;

    /**
     * This constant is used to specify the DestinationCode.
     * <p>
     * Invalid Destination Code.
     * <p>
     * value = {@value}
     */
    public static final int INVALID_DESTIN_CODE = 1732;

    /**
     * This constant is used to specify the OriginCode Country.
     * <p>
     * The Origin Code Country does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int ORIGIN_CODE_COUNTRY_NOT_EXIST = 1733;

    /**
     * This constant is used to specify the DestinationCode Country.
     * <p>
     * The Destination Code Country does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int DESTIN_CODE_COUNTRY_NOT_EXIST = 1734;

    /**
     * This constant is used to specify the OriginCode City.
     * <p>
     * The Origin Code City does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int ORIGIN_CODE_CITY_NOT_EXIST = 1735;

    /**
     * This constant is used to specify the OriginCode City marked for deletion.
     * <p>
     * The Origin Code City is marked for deletion.
     * <p>
     * value = {@value}
     */
    public static final int ORIGIN_CODE_CITY_MARKED_FOR_DELETION = 1736;

    /**
     * This constant is used to specify the DestinationCode City.
     * <p>
     * The Destination Code City does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int DESTIN_CODE_CITY_NOT_EXIST = 1737;

    /**
     * This constant is used to specify the DestinationCode City marked for
     * deletion.
     * <p>
     * The Destination Code City is marked for deletion.
     * <p>
     * value = {@value}
     */
    public static final int DESTIN_CODE_CITY_MARKED_FOR_DELETION = 1738;

    /**
     * This constant is used to specify the OriginCode Aggregate.
     * <p>
     * The Origin Code Aggregate does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int ORIGIN_CODE_AGGREGATE_NOT_EXIST = 1739;

    /**
     * This constant is used to specify the OriginCode Aggregate marked for
     * deletionw.
     * <p>
     * The Origin Code Aggregate is marked for deletion.
     * <p>
     * value = {@value}
     */
    public static final int ORIGIN_CODE_AGGREGATE_MARKED_FOR_DELETION = 1740;

    /**
     * This constant is used to specify the DestinationCode.
     * <p>
     * The Destination Code Aggregate does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int DESTIN_CODE_AGGREGATE_NOT_EXIST = 1741;

    /**
     * This constant is used to specify the DestinationCode Aggregate marked for
     * deletion.
     * <p>
     * The Destination Code Aggregate is marked for deletion.
     * <p>
     * value = {@value}
     */
    public static final int DESTIN_CODE_AGGREGATE_MARKED_FOR_DELETION = 1742;

    /**
     * This constant is used to specify the UserId and UserGroupId for
     * OriginCode.
     * <p>
     * User ID / User Group ID is not authorized for this Contract Origin Code.
     * <p>
     * value = {@value}
     */
    public static final int USER_ID_OR_USER_GROUP_ID_FOR_ORIGIN_CODE_NOT_AUTHERIZED = 1743;

    /**
     * This constant is used to specify the UserId and UserGroupId for
     * DestinationCode.
     * <p>
     * User ID / User Group ID is not authorized for this Contract Destination Code.
     * <p>
     * value = {@value}
     */
    public static final int USER_ID_OR_USER_GROUP_ID_FOR_DESTIN_CODE_NOT_AUTHERIZED = 1744;

    /**
     * This constant is used to specify the Security Information for the UserId.
     * <p>
     * No security information is defined for given user ID.
     * <p>
     * value = {@value}
     */
    public static final int NO_SECURITY_INFO_DEFINED_FOR_USER_ID = 1745;

    /**
     * This constant is used to specify the Security Information for the
     * UserGroup.
     * <p>
     * No security information is defined for given user groups.
     * <p>
     * value = {@value}
     */
    public static final int NO_SECURITY_INFO_DEFINED_FOR_USER_GROUP = 1746;

    /**
     * This constant is used to specify that the SecurityInformation is created.
     * <p>
     * The security information for the user is created.
     * <p>
     * value = {@value}
     */
    public static final int SECURITY_INFORMATION_IS_CREATED = 1747;

    /**
     * This constant is used to specify the SecurityInformation is Updated.
     * <p>
     * The security information for the user is updated.
     * <p>
     * value = {@value}
     */
    public static final int SECURITY_INFORMATION_IS_UPDATED = 1748;

    /**
     * This constant is used to specify the SecurityInformation is Deleted.
     * <p>
     * The security information for the user is deleted.
     * <p>
     * value = {@value}
     */
    public static final int SECURITY_INFORMATION_IS_DELETED = 1749;

    /**
     * This constant is used to specify the SecurityInformation for the group is
     * created.
     * <p>
     * The security information for the user group is created.
     * <p>
     * value = {@value}
     */
    public static final int SECURITY_INFORMATION_GRP_IS_CREATED = 1750;

    /**
     * This constant is used to specify the SecurityInformation for the group is
     * updated.
     * <p>
     * The security information for the user group is updated.
     * <p>
     * value = {@value}
     */
    public static final int SECURITY_INFORMATION_GRP_IS_UPDATED = 1751;

    /**
     * This constant is used to specify the SecurityInformation for the group is
     * Deleted.
     * <p>
     * The security information for the user group is deleted.
     * <p>
     * value = {@value}
     */
    public static final int SECURITY_INFORMATION_GRP_IS_DELETED = 1752;

    /**
     * This constant is used to specify the UserID.
     * <p>
     * Identifier Modified.
     * <p>
     * value = {@value}
     */
    public static final int IDENTIFIER_MODIFIED = 1753;

    /**
     * This constant is used to specify the UserType.
     * <p>
     * User Type Modified.
     * <p>
     * value = {@value}
     */
    public static final int USER_TYPE_MODIFIED = 1754;

    /**
     * This constant is used to specify the SecurityInformation for the given
     * filter.
     * <p>
     * No Security Information is available for the input Filter.
     * <p>
     * value = {@value}
     */
    public static final int NO_SECURITY_INFO_FOR_GIVEN_INPUT_FILTER = 1755;

    /**
     * This constant is used to specify the Duplicate Entries.
     * <p>
     * Duplicate Security Information Entries are not allowed.
     * <p>
     * value = {@value}
     */
    public static final int NO_DUPLICATE_ENTRIES_ARE_ALLOWED = 1756;

    /**
     * This constant is used to specify the RatingSecurityInformation Entry.
     * <p>
     * Atleast one Rating Security Entry is Required.
     * <p>
     * value = {@value}
     */
    public static final int ATLEAST_ONE_ENTRY_IS_REQUIRED = 1759;

    /**
     * This constant is used to specify the OriginCode.
     * <p>
     * Origin Code is Mandatory
     * <p>
     * value = {@value}
     */
    public static final int ORGIN_CODE_IS_MANDATORY = 1760;

    /**
     * This constant is used to specify the DestinationCode.
     * <p>
     * Destination Code is Mandatory
     * <p>
     * value = {@value}
     */
    public static final int DESTINATION_CODE_IS_MANDATORY = 1761;

    /**
     * This constant is used to specify the RateSource prohibition for contract
     * or spotRates.
     * <p>
     * Rate Source is prohibited for Security type Contract/Spot Rate.
     * <p>
     * value = {@value}
     */
    public static final int RATE_SOURCE_IS_PROHIBITED_FOR_CONTRACT_OR_SPOT_RATES = 1762;

    /**
     * This constant is used to specify the RateSource for SecurityType.
     * <p>
     * Rate Source is Mandatory for Security type Rate Source
     * <p>
     * value = {@value}
     */
    public static final int RATE_SOURCE_IS_MANDATORY_WHEN_SECURITY_TYPE_IS_RATE_SOURCE = 1763;

    /**********************************************************/
    /** UC320-- End Maintain Security Information **/
    /**********************************************************/

    /*************************************************************************
     * UC198 - start of Extract Tariff Rates, Contracts and Spot Rates
     *************************************************************************/

    /**
     * This constant is used to specify the The Extract Origin Code is mandatory if All Extract Origin is yes
     * or no.
     * value = {@value}
     */
    public static final int REPORT_ORIGIN_MANDATORY_IF_ALL_ORIGIN_IS_NO = 3000;

    /**
     * This constant is used to specify the report all origin.
     * <p>
     * The All Extract Origin must be yes or no.
     * <p>
     * value = {@value}
     */

    public static final int REPORT_ALL_ORIGIN_MUST_BE_YES_OR_NO = 3001;

    /**
     * This constant is used to specify the report origin.
     * <p>
     * The Extract Origin Code must be 1-7 alphanumeric characters.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_ORIGIN_ALPHANUMERIC = 3002;

    /**
     * This constant is used to specify the report destination.
     * <p>
     * The Extract Destination Code must be 1-7 alphanumeric characters.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_DESTINATION_ALPHANUMERIC = 3003;

    /**
     * This constant is used to specify the report all destination.
     * <p>
     * The All Extract Destination must be yes or no.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_ALL_DEST_MUST_BE_YES_OR_NO = 3004;

    /**
     * This constant is used to specify the report carrier.
     * <p>
     * The Carrier Code must be 2-3 alphanumeric characters.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_CARRIER_ALPHANUMERIC = 3005;

    /**
     * This constant is used to specify the report Email Id.
     * <p>
     * The Email must be 1-100 characters.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_EMAIL_ID_CHARACTERS = 3006;

    /**
     * This constant is used to specify the report rate.
     * <p>
     * The Rate Source must be 3 alphanumeric characters.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_RATE_SRC_ALPHANUMERIC = 3007;

    /**
     * This constant is used to specify the report currency.
     * <p>
     * The Currency Code must be 3 alphabetic characters.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_CURRENCY_ALPHANUMERIC = 3008;

    /**
     * This constant is used to specify the report rate type.
     * <p>
     * The Rate Type must be 3 alphanumeric characters.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_TYP_ALPHANUMERIC = 3009;

    /**
     * This constant is used to specify the report pending government approval.
     * <p>
     * The Pending Government Approval Indicator must be yes or no.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_PENDING_GOV_APPRIVAL_IND_MUST_BE_YES_NO = 3010;

    /**
     * This constant is used to specify the report effective date format.
     * <p>
     * The Effective Date must be of format DDMMMYY.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_EFFECTIVE_DATE_FORMAT = 3011;

    /**
     * This constant is used to specify the report status.
     * <p>
     * The status active must be yes or no.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_STATUS_ACTIVE_MUST_BE_YES_NO = 3012;

    /**
     * This constant is used to specify the report status.
     * <p>
     * The status pending must be yes or no.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_STATUS_PENDING_MUST_BE_YES_NO = 3013;

    /**
     * This constant is used to specify the report status.
     * <p>
     * The status expired must be yes or no.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_STATUS_EXPIRED_MUST_BE_YES_NO = 3014;

    /**
     * This constant is used to specify the report status.
     * <p>
     * The status history must be yes or no.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_STATUS_HISTORY_MUST_BE_YES_NO = 3015;

    /**
     * This constant is used to specify the report status.
     * <p>
     * The status deleted must be yes or no.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_STATUS_DELETED_MUST_BE_YES_NO = 3016;

    /**
     * This constant is used to specify the report area.
     * <p>
     * The input Area does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_AREA_NOT_EXIST = 3017;

    /**
     * This constant is used to specify the report subarea.
     * <p>
     * The input subarea does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_SUBAREA_NOT_EXIST = 3018;

    /**
     * This constant is used to specify the report region.
     * <p>
     * The input Region/Aggregate does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_REGION_OR_AGGREGATE_NOT_EXIST = 3019;

    /**
     * This constant is used to specify the report country.
     * <p>
     * The input country does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_COUNTRY_NOT_EXIST = 3020;

    /**
     * This constant is used to specify the report city or airport.
     * <p>
     * The input City/Airport does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_CITY_OR_AIRPORT_NOT_EXIST = 3021;

    /**
     * This constant is used to specify the report city or airport or aggregate.
     * <p>
     * The input City/Airport/Aggregate does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_CITY_OR_AIRPORT_AGGREGATE_NOT_EXIST = 3022;

    /**
     * This constant is used to specify the report aggregate.
     * <p>
     * The input Aggregate does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_AGGREGATE_NOT_EXIST = 3023;

    /**
     * This constant is used to specify the report origin code.
     * <p>
     * The input Extract Origin Code is not valid.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_ORIGIN_CODE_INVALID = 3024;

    /**
     * This constant is used to specify the report destination code.
     * <p>
     * The input Extract destination code is not valid.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_DEST_CODE_INVALID = 3025;

    /**
     * This constant is used to specify the report extract file size.
     * <p>
     * The extract file size exceeds size limit and cannot be emailed.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_EXTRACT_FILE_SIZE_EXCEEDED = 3026;

    /**
     * This constant is used to specify the report currency code.
     * <p>
     * The Currency Code does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_CURRECY_CODE_NOT_EXIST = 3027;

    /**
     * This constant is used to specify the report rate source.
     * <p>
     * The Rate Source does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_RATE_SRC_NOT_EXIST = 3028;

    /**
     * This constant is used to specify the report rate type.
     * <p>
     * The Rate Type does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_RATE_TYPE_NOT_EXIST = 3029;

    /**
     * This constant is used to specify the report origin destination pair.
     * <p>
     * The requested rate for Extract Origin-Extract DestinationPair with input filters is not found.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_ORIGIN_DEST_PAIR_WITH_FILTERS_NOT_FOUND = 3030;

    /**
     * This constant is used to specify the report extract request.
     * <p>
     * Invalid extract request.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_INVALID_EXTRACT_REQUEST = 3031;

    /**
     * This constant is used to specify the report status.
     * <p>
     * At least one of the Active, Pending, Expired, History, Deleted filter is required.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_ATLEAST_ONE_STATUS_REQUIRED = 3032;

    /**
     * This constant is used to specify the report extract format type.
     * <p>
     * The extract format is empty.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_EXTRACT_FORMAT_TYPE_EMPTY = 3033;

    /**
     * This constant is used to specify the report update date.
     * <p>
     * Update Time filter prohibited, if Update Date is not entered.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_UPDATE_DATE_EMPTY = 3034;

    /**
     * This constant is used to specify the report rate source.
     * <p>
     * Rate Source mandatory if report format is Comma Delimited or Fixed Width.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_RATE_SRC_MANDATORY_IF_NOT_CMR = 3035;

    /**
     * This constant is used to specify the report server request.
     * <p>
     * internal error.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_BAD_SERVER_REQUEST = 3036;

    /**
     * This constant is used to specify the report submission.
     * <p>
     * Report submitted sucessfully.
     * <p>
     * value = {@value}
     */
    public static final int REPORT_SUBMITTED_SUCESSFULLY = 3037;

    /*************************************************************************
     * UC198 - end of Extract Tariff Rates, Contracts and Spot Rates
     *************************************************************************/

    /****************************************************************************
     * UC143 - Start of Maintain Global Tariff and Contract Rate Administration.
     ****************************************************************************/

    /**
     * This constant is used to verify the origin code.
     * <p>
     * Failed because of invalid origin code.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_ORIGIN_CODE_ALPHANUMERIC = 1801;

    /**
     * This constant is used to verify the origin code.
     * <p>
     * Failed because of non-existence origin code.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_ORIGIN_CODE_REQUIRED = 1802;

    /**
     * This constant is used to verify the destination code.
     * <p>
     * Failed because of invalid destination code.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_DESTINATION_CODE_ALPHANUMERIC = 1803;

    /**
     * This constant is used to verify the destination code.
     * <p>
     * Failed because of non-existence destination code.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_DESTINATION_CODE_REQUIRED = 1804;

    /**
     * This constant is used to verify the carrier code.
     * <p>
     * Failed because of invalid carrier code.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_CARRIER_CODE_FORMAT = 1805;

    /**
     * This constant is used to verify the carrier code.
     * <p>
     * Failed because of non-existence carrier code.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_CARRIER_CODE_REQUIRED = 1806;

    /**
     * This constant is used to verify the tasks.
     * <p>
     * Failed if no tasks are entered.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_ATLEAST_ONE_TASK_FOR_CREATE_UPDATE = 1807;

    /**
     * This constant is used to verify the currency code.
     * <p>
     * Failed because of non-existence of currency code.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_CURRENCY_CODE_REQUIRED = 1808;

    /**
     * This constant is used to verify the currency code.
     * <p>
     * Failed because of currency code entered.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_CURRENCY_CODE_NOT_ALLOWED = 1809;

    /**
     * This constant is used to verify the inputs.
     * <p>
     * Failed if no values are entered in modified rate section.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_ATLEAST_ONE_FIELD_IS_MANDATORY = 1810;

    /**
     * This constant is used to verify the rate source code.
     * <p>
     * Failed because of non-existence of rate source code.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_RATE_SOURCE_REQUIRED = 1811;

    /**
     * This constant is used to verify the rate type code.
     * <p>
     * Failed because of invalid rate type code.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_RATE_TYPE_3_ALPHANUMERIC = 1812;

    /**
     * This constant is used to verify the rate class code.
     * <p>
     * Failed because of invalid rate class code.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_RATE_CLASS_MUST_BE_ONE_CHARACTER = 1813;

    /**
     * This constant is used to verify the commodity code.
     * <p>
     * Failed because of invalid commodity code.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_COMMODITY_CODE_ALPHANUMERIC = 1814;

    /**
     * This constant is used to verify the commodity code.
     * <p>
     * Failed if commodity is not compatible with rate class.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_COMMODITY_CODE_ALLOWED_RATE_CLASSES = 1815;

    /**
     * This constant is used to acknowledge if tariff task is created.
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_TARIFF_RATES_ADMIN_CREATED = 1816;

    /**
     * This constant is used to verify the uld type code.
     * <p>
     * Failed because of invalid uld type code.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_ULD_TYPE_ALLOWED_RATE_CLASSES = 1817;

    /**
     * This constant is used to verify the uld charge code.
     * <p>
     * Failed because of invalid uld charge code.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_ULD_CHARGE_MUST_BE_ONE_CHARACTER = 1818;

    /**
     * This constant is used to verify the uld charge code.
     * <p>
     * Failed because of invalid uld charge code.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_ULD_CHARGE_ALLOWED_RATE_CLASSES = 1819;

    /**
     * This constant is used to verify the currencu code.
     * <p>
     * Failed if currency does not have rounding factor and decimal.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_CURRENCY_DOES_NOT_HAVE_ROUNDING_AND_DECIMAL = 1820;

    /**
     * This constant is used to verify the weight unit.
     * <p>
     * Failed because of invalid weight unit.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_WEIGHT_UNIT_VALID_VALUES = 1821;

    /**
     * This constant is used to verify the selection date.
     * <p>
     * Failed because of invalid selection date.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_SELECTION_DATE_FORMAT = 1822;

    /**
     * This constant is used to verify the currency code.
     * <p>
     * Failed if currency code is marked for deletion.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_CURRENCY_CODE_MARKED_FOR_DELETION = 1823;

    /**
     * This constant is used to verify the action values.
     * <p>
     * Failed because of invalid action values.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_ACTION_VALID_VALUES = 1825;

    /**
     * This constant is used to verify the rate adjustment.
     * <p>
     * Failed because of invalid rate adjustment.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_RATE_ADJUSTMENT_SIZE_VALIDATION_FAILS = 1826;

    /**
     * This constant is used to verify the rate adjustment.
     * <p>
     * Failed if rate adjustment is given for exclude action.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_RATE_ADJUSTMENT_NOT_ALLOWED_FOR_EXCLUDE = 1827;

    /**
     * This constant is used to verify the rate adjustment type.
     * <p>
     * Failed because of invalid rate adjustment type.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_RATE_ADJUSTMENT_TYPE_VALID_VALUES = 1828;

    /**
     * This constant is used to verify the rate adjustment type.
     * <p>
     * Failed if rate adjustment type is given for exclude action.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_TYPE_OF_RATE_ADJUSTMENT_NOT_ALLOWED_FOR_EXCLUDE = 1829;

    /**
     * This constant is used to verify the rate adjustment type.
     * <p>
     * Failed if rate adjustment type is not given.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_TYPE_OF_RATE_ADJUSTMENT_REQUIRED_FOR_RATE_ADJUSTMENT = 1830;

    /**
     * This constant is used to verify the over pivot rate adjustment.
     * <p>
     * Failed because of invalid over pivot rate adjustment.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_OVER_PIVOT_RATE_ADJUSTMENT_VALIDATION = 1831;

    /**
     * This constant is used to verify the over pivot rate adjustment.
     * <p>
     * Failed if over pivot rate adjustment is given for exclude action.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_OVER_PIVOT_NOT_ALLOWED_FOR_EXCLUDE = 1832;

    /**
     * This constant is used to verify the over pivot rate adjustment type.
     * <p>
     * Failed because of invalid over pivot rate adjustment type.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_OVER_PIVOT_RATE_ADJUSTMENT_VALID_VALUES = 1833;

    /**
     * This constant is used to verify the over pivot rate adjustment type.
     * <p>
     * Failed if over pivot rate adjustment type is given for exclude action. <br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_TYPE_OF_OVER_PIVOT_NOT_ALLOWED_FOR_EXCLUDE = 1834;

    /**
     * This constant is used to verify the over pivot rate adjustment type.
     * <p>
     * Failed if over pivot rate adjustment type is not given.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_TYPE_OF_OVER_PIVOT_REQUIRED = 1835;

    /**
     * This constant is used to verify the effective date.
     * <p>
     * Failed because of invalid effective date.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_EFFECTIVE_DATE_INVALID_FORMAT = 1836;

    /**
     * This constant is used to verify the effective date.
     * <p>
     * Failed because of invalid effective date.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_EFFECTIVE_DATE_NOT_ALLOWED_FOR_EXCLUDE = 1837;

    /**
     * This constant is used to verify the expiration date.
     * <p>
     * Failed because of invalid expiration date.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_EXPIRATION_DATE_INVALID_FORMAT = 1838;

    /**
     * This constant is used to verify the expiration date.
     * <p>
     * Failed because of invalid expiration date.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_EXPIRATION_DATE_NOT_ALLOWED_FOR_EXCLUDE = 1839;

    /**
     * This constant is used to acknowledge that tariff tasks are updated.
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_TARIFF_TASKS_UPDATED = 1840;

    /**
     * This constant is used to acknowledge that tariff tasks are deleted.
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_TARIFF_TASKS_DELETED = 1841;

    /**
     * This constant is used to verify the unique key.
     * <p>
     * Failed because of invalid unique key.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_INVALID_GLOBAL_TASK_UNIQUE_KEY = 1842;

    /**
     * This constant is used to verify whether tariff tasks exist.
     * <p>
     * Failed if no tariff tasks exist.<br>
     * <p>
     * Value = {@value}
     */
    public static final int NO_GLOBAL_TARIFF_TASKS_EXIST = 1843;

    /**
     * This constant is used to verify whether tariff tasks exist.
     * <p>
     * Failed if tariff tasks exist.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_TASKS_EXIST_CREATION_DENIED = 1844;

    /**
     * This constant is used to verify whether tariff tasks exist.
     * <p>
     * Failed if tariff tasks exist.<br>
     * <p>
     * Value = {@value}
     */
    public static final int NO_GLOBAL_TARIFF_TASKS_UPDATION_NOT_ALLOWED = 1845;

    /**
     * This constant is used to verify whether tariff tasks exist.
     * <p>
     * Failed if no tariff tasks exist.<br>
     * <p>
     * Value = {@value}
     */
    public static final int NO_GLOBAL_TARIFF_TASKS_DELETION_NOT_ALLOWED = 1846;

    /**
     * This constant is used to verify the duplicate tariff tasks.
     * <p>
     * Failed because of duplicate tariff tasks.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_DUPLICATE_TARIFF_TASKS_NOT_ALLOWED = 1847;

    /**
     * This constant is used to verify the rate adjustment.
     * <p>
     * Failed if rate adjustment is more than 100.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_RATE_ADJUSTMENT_SHOULD_NOT_MORE_THAN_100 = 1851;

    /**
     * This constant is used to verify the over pivot rate adjustment.
     * <p>
     * Failed if over pivot rate adjustment is more than 100.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_OVER_PIVOT_RATE_ADJUSTMENT_SHOULD_NOT_MORE_THAN_100 = 1852;

    /**
     * This constant is used to verify the commodity code.
     * <p>
     * Failed because of incompatibility of commodity with rate source.<br>
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_NOT_COMPATIBLE_WITH_RATE_SORCE = 1861;

    /**
     * This constant is used to verify the minimum weight.
     * <p>
     * Failed because of minimum weight with decimal positions.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_MINIMUM_WEIGHT_DECIMAL_NOT_ALLOWED = 1862;

    /**
     * This constant is used to verify the currency code.
     * <p>
     * Failed if currency does not have rounding factor.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_ROUNDING_FACTOR_MULTIPLE_OF_CURRENCY = 1863;

    /**
     * This constant is used to verify whether percentage rate types are
     * present.
     * <p>
     * Failed if percentage rate types are present.<br>
     * <p>
     * Value = {@value}
     */
    public static final int PERCENTAGE_RATE_TYPES_NOT_ALLOWED = 1864;

    /**
     * This constant is used to verify the effective date field.
     * <p>
     * Failed because of absence of effective date.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_EFFECTIVE_DATE_MANDATORY = 1865;

    /**
     * This constant is used to verify the Contract Task.
     * <p>
     * Failed if Contract Does not exist.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int NO_GLOBAL_CONTRACT_TASK_EXISTS = 1901;

    /**
     * This constant is used to verify the Contract Task.
     * <p>
     * Failed if Contract Does not exist in the system.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int GLOBAL_CONTRACT_ADMIN_DOES_NOT_EXIST = 1902;

    /**
     * This constant is used to verify the Contract Task.
     * <p>
     * Failed if Contract participant acoount number does not belong to the given contract number.<br>
     * <p>
     * Value = {@value}
     * */

    public static final int GLOBAL_CONTRACT_THE_PARTICIPANT_ACCOUNT_NO_DOES_NOT_BELONG_TO_CONTRACT_NUMBER =
                1903;

    /**
     * This constant is used to verify the Contract Task.
     * <p>
     * Failed if no Contract task exist for the given contract no.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int NO_GLOBAL_CONTRACT_TASK_EXISTS__FOR_INPUT_PARTICIPANT_AND_CONTRACT = 1904;

    /**
     * This constant is used to verify the deletion of Contract Task.
     * <p>
     * Global Contract admin deleted sucessfully.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int GLOBAL_CONTARCTADMIN_DELETED = 1905;

    /**
     * This constant is used to verify the participant account number is
     * mandatory.
     * <p>
     * Participant number is mandatory.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int GLOBAL_PARTICIPANT_ACCOUNT_NUMBER_MANDATORY = 1906;

    /**
     * This constant is used to verify the Contract Number mandatory.
     * <p>
     * Contract number mandatory.<br>
     * <p>
     * Value = {@value}
     * */

    public static final int GLOBAL_CONTRACT_NUMBER_MANDATORY = 1907;

    /**
     * This constant is used to verify the Selection date required.
     * <p>
     * Global Contract admin selection date required.<br>
     * <p>
     * Value = {@value}
     * */

    public static final int GLOBAL_SELECTION_DATE_REQUIRED = 1908;

    /**
     * This constant is used to verify the commodity number prohibited.
     * <p>
     * Global Contract admin commodity number prohibited.<br>
     * <p>
     * Value = {@value}
     * */

    public static final int GLOBAL_CONTRACT_COMMODITY_NUMBER_PROHIBITED = 1909;

    /**
     * This constant is used to verify the commodity indicator prohibited.
     * <p>
     * All commodity indicator not allowed.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int GLOBAL_CONTRACT_ALL_COMMODITY_INDICATOR_NOT_ALLOWED = 1910;

    /**
     * This constant is used to verify the class rating id prohibited.
     * <p>
     * class Rating Id prohibited for flat definition type.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int GLOBAL_CLASS_RATING_ID_PROHIBITED_IF_FLAT_DEFINITION_TYPE = 1911;

    /**
     * This constant is used to verify the contrac talready exist.
     * <p>
     * Global contract already exist.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int GLOBAL_CONTRACT_ALREADY_EXIST = 1912;

    /**
     * This constant is used to verify the Effective task cannot be deleted.
     * <p>
     * Global contract rate task effective cannot be deleted.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int CONTRACT_RATE_EFFECTIVE_CANT_BE_DELETED = 1913;

    /**
     * This constant is used to verify the global contract admin deleted
     * successfully.
     * <p>
     * Global Contract admin task deleted successfully.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int GLOBAL_CONTRACT_ADMIN_DELETED_SUCCESSFULLY = 1914;

    /**
     * This constant is used to verify the Global contract admin updated
     * successfully.
     * <p>
     * Global contract admin updated successfully.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int GLOBAL_CONTRACT_ADMIN_UPDATED_SUCCESSFULLY = 1915;

    /**
     * This constant is used to verify the Raounding factor type size.
     * <p>
     * Rounding factor should be proper.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int ROUNDING_FACTOR_TYPE_SIZE = 1916;

    /**
     * This constant is used to verify the New effective date required.
     * <p>
     * New effective date required.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int NEW_EFFECTIVE_DATRE_REQ = 1917;

    /**
     * This constant is used to verify the Currency is required when rounding
     * factor has value.
     * <p>
     * the Currency is required when rounding factor has value.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int CURRENCY_REQ_WHEN_ROUNDING_FACTOR_HAS_VALUE = 1918;

    /**
     * This constant is used to verify the Uld type is not allowed if class
     * rating id has value.
     * <p>
     * the Uld type is not allowed if class rating id has value.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int ULD_TYPE_NOT_ALLOWED_CLASSRATING_HAS_VALUE = 1919;

    /**
     * This constant is used to verify the all uld indicator prohibited.
     * <p>
     * the all uld indicator prohibited.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int ALL_ULD_TYPE_NOT_ALLOWED = 1920;

    /**
     * This constant is used to verify the minimum weight is prohibited.
     * <p>
     * the minimum weight is prohibited.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int MINIMUM_WEIGHT_NOT_ALLOWED = 1921;

    /**
     * This constant is used to verify the minimum weight is prohibited for rate
     * class m.
     * <p>
     * the minimum weight is prohibited for rate class m.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int MINIMUM_WEIGHT_NOT_ALLOWED_IF_RATE_CLASS_M = 1922;

    /**
     * This constant is used to verify the the all minimum weight is prohibited
     * for rate class m.
     * <p>
     * the minimum weight is prohibited for rate class m.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int ALL_MINIMUM_WEIGHT_INDICATOR_NOT_ALLOWED = 1923;

    /**
     * This constant is used to verify the any minimum weight is prohibited for
     * rate class m.
     * <p>
     * the any minimum weight is prohibited for rate class m.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int ANY_MINIMUM_WEIGHT_INDICATOR_NOT_ALLOWED = 1924;

    /**
     * This constant is used to verify the pivot weight prohibited.
     * <p>
     * the pivot weight prohibited.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int PIVOT_WEIGHT_NOT_ALLOWED = 1925;

    /**
     * This constant is used to verify the pivot weight is allowed only when
     * contract definition is flat.
     * <p>
     * the pivot weight is allowed only when contract definition is flat.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int PIVOT_WEIGHT_ALLOWED_IF_CONTRACT_DEFINITION_FLAT = 1926;

    /**
     * This constant is used to verify the pivot weight is not allowed if uld
     * charge code is A.
     * <p>
     * the pivot weight is not allowed if uld charge code is A.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int PIVOT_WEIGHT_NOT_ALLOWED_IF_ULDCHARGECODE_A = 1927;

    /**
     * This constant is used to verify the pivot weight not allowed.
     * <p>
     * the pivot weight not allowed.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int ANY_PIVOT_WEIGHT_NOT_ALLOWED = 1928;

    /**
     * This constant is used to verify the pivot weight not allowed if contract
     * definition is fixed.
     * <p>
     * the pivot weight not allowed if contract definition is fixed.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int ANY_PIVOT_WEIGHT_NOT_ALLOWED_CONTRACT_DEFINITION_FIXED = 1929;

    /**
     * This constant is used to verify the currency code not allowed.
     * <p>
     * the currency code not allowed.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int CURRENCY_CODE_NOT_ALLOWED = 1930;

    /**
     * This constant is used to verify the Type of over pivot rate adjustment
     * need to be checked.
     * <p>
     * the Type of over pivot rate adjustment need to be checked.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int TYPE_OF_OVER_PIVOT_RATE_ADJUSTMENT = 1931;

    /**
     * This constant is used to verify the Type of rate pivot rate adjustment
     * need to be checked.
     * <p>
     * the Type of rate pivot rate adjustment need to be checked.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int TYPE_OF_RATE_PIVOT_RATE_ADJUSTMENT = 1932;

    /**
     * This constant is used to verify the origin code not allowed
     * <p>
     * the origin code not allowed.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int CONTRACT_ORIGIN_CODE_NOT_ALLOWED = 1933;

    /**
     * This constant is used to verify the destination code not allowed.
     * <p>
     * the destination code not allowed.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int CONTRACT_DESTINATION_CODE_NOT_ALLOWED = 1934;

    /**
     * This constant is used to verify the commodity number type must be I or D
     * <p>
     * the commodity number type must be I or D.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int CONTRACT_COMMODITY_NUMBER_TYPE_MUST_BE_I_OR_D = 1935;

    /**
     * This constant is used to verify the Global pivot weight is not allowed.
     * <p>
     * the Global pivot weight is not allowed.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int GLOBAL_PIVOT_WEIGHT_IS_NOT_ALLOWED = 1936;

    /**
     * This constant is used to verify the Decimal position need to be checked
     * for rate adjustment type which was given.
     * <p>
     * the Decimal position need to be checked for rate adjustment type which was given.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int DECIMAL_POSITION_NOT_ALLOWED_FOR_RATE_ADJUSTMENT = 1937;

    /**
     * This constant is used to verify the Invalid participant contract.
     * <p>
     * the Invalid participant contract.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int GLOBAL_CONTRACT_INVALID_PARTICIPANT = 1938;

    /**
     * This constant is used to verify the other carriers are prohibited.
     * <p>
     * the other carriers are prohibited.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int GLOBAL_CONTRACT_OTHER_CARRIERS_ARE_PROHIBITED = 1939;

    /**
     * This constant is used to verify the other carriers are prohibited.
     * <p>
     * the other carriers are prohibited.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int GLOBAL_CONTRACT_OTHER_CARRIERS_ARE_PROHIBITED_YYY = 1940;

    /**
     * This constant is used to verify the other carriers are prohibited.
     * <p>
     * the other carriers are prohibited.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int GLOBAL_CONTRACT_CONTRACT_NUMBER_INVALID_TYPE = 1941;

    /**
     * This constant is used to verify the Global contract participant number is
     * invalid type.
     * <p>
     * Value = {@value}
     * */
    public static final int GLOBAL_CONTRACT_PARTICIPANT_NUMBER_INVALID_TYPE = 1942;

    /**
     * This constant is used to verify the uld type.
     * <p>
     * Value = {@value}
     * */
    public static final int ULD_TYPE_MUST_BE_1TO4_AN = 1943;

    /**
     * This constant is used to verify the currency code is required if amount
     * increase or decrease.
     * <p>
     * Value = {@value}
     * */
    public static final int CURRENCY_CODE_IS_REQUIRED_IF_AMOUNT_INCREASE_OR_DECREASE = 1944;

    /**
     * This constant is used to verify the other indicators are not allowed if
     * responsible party is yes.
     * <p>
     * Value = {@value}
     * */
    public static final int INDICATORS_NOT_ALLOWED_IF_RESPONSIBLE_PARTY_IS_YES = 1945;

    /**
     * This constant is used to verify Effect task to delete.
     * <p>
     * Value = {@value}
     * */
    public static final int EFFECTIVE_TASK_CANNOT_BE_DELETED = 1946;

    /**
     * This constant is used to verify effective task to update.
     * <p>
     * Value = {@value}
     * */
    public static final int EFFECTIVE_TASK_CANNOT_BE_UPDATED = 1947;

    /**
     * This constant is used to verify selecection date with effective date.
     * <p>
     * Value = {@value}
     * */
    public static final int GLOBAL_SELECTION_DATE_SHOULD_BE_GREATER_THAN_EFFECTIVE_DATE = 1948;

    /**
     * This constant is used to verify participant types of maximum numbers.
     * <p>
     * Value = {@value}
     * */
    public static final int MAXIMUM_OF_5_PARTICIPANT_TYPES_CAN_BE_ALLOWED = 1949;

    /**
     * This constant is used to verify global contract effective date.
     * <p>
     * Value = {@value}
     * */
    public static final int GLOBAL_EFFECTIVE_DATE_SHOULD_BE_FUTURE_DATE = 1950;

    /**
     * This constant is used to specify the global rate adjustment.
     * <p>
     * The Rate Adjustment type is Required if Rate Adjustment Rate has value.
     * <p>
     * value = {@value}
     */
    public static final int GLOBAL_RATE_ADJUSTMENT_REQUIRED_IF_TYPE_HAS_VALUE = 1951;

    /**
     * This constant is used to specify the global over rate adjustment.
     * <p>
     * The Over Pivot Adjustment type is Required if Over Pivot Rate Adjustment has value.
     * <p>
     * value = {@value}
     */
    public static final int GLOBAL_OVER_ADJUSTMENT_REQUIRED_IF_TYPE_HAS_VALUE = 1952;

    /**
     * This constant is used to specify the global selection date.
     * <p>
     * The selection date should be less than expiration date.
     * <p>
     * value = {@value}
     */
    public static final int GLOBAL_SELECTION_DATE_SHOULD_BE_LESS_THAN_EXPIRATION_DATE = 1953;

    /**
     * This constant is used to specify the global rate adjustment.
     * <p>
     * Either the Rate Adjustment or Over Pivot Rate Adjustment is required.
     * <p>
     * value = {@value}
     */
    public static final int RATE_ADJUSTMENT_OR_OVER_PIVOT_RATE_ADJUST_IS_REQUIRED = 1954;

    /**
     * This constant is used to specify that given rounding factor is valid or not.
     *
     * value = {@value}
     */
    public static final int ROUNDING_FACTOR_IS_NOT_VALID = 1955;

    public static final int GLOBAL_CONTRACT_ADMIN_TASK_CONFLICT = 1956;

    /*************************************************************************
     * UC143 - End of Maintain Global Tariff and Contract Rate Administration.
     *************************************************************************/
    /**
     * This constant is used to specify the spot rate authority queue.
     * <p>
     * Authority Queue Settings Not Defined.
     * <p>
     * value = {@value}
     */

    public static final int SPOT_RATE_AUTHORITY_QUEUE_NOT_FOUND = 4540;

    /*************************************************************************
     * UC105 - Start of Process Air Waybill Rating Request – Joint Rating.
     *************************************************************************/
    /**
     * This constant is used to verify whether joint rate entries are present.
     * <p>
     * Value = {@value}
     * */
    public static final int JOINT_SEARCH_NO_JOINT_RATES = 1971;

    /*************************************************************************
     * UC143 - End of Process Air Waybill Rating Request – Joint Rating.
     *************************************************************************/
    /**
     * This constant is used to verify the effective rate type percentage .
     * <p>
     * Value = {@value}
     * */
    public static final int EFFECTIV_PERCENTAGE_CANNOT_BE_DELETED = 2000;

    /**
     * This constant is used to verify Rate type of percentage should not have
     * percentage.
     * <p>
     * Value = {@value}
     */
    public static final int PERCENTAGE_RATE_TYPE_MUST_NOT_HAVE_ANY_PERCENTAGE = 2001;

    /**
     * This constant is used to specify the percentage rate type.
     * <p>
     * Percentage Rate Type does not exist.
     * <p>
     * value = {@value}
     */
    public static final int PERCENTAGE_RATE_TYPE_DOES_NOT_EXITS = 2002;

    /**
     * This constant is used to specify the percentage rate type.
     * <p>
     * Rate Type Required for percentage entry.
     * <p>
     * value = {@value}
     */
    public static final int RATE_TYPE_REQUIRED_FOR_PERCENTAGE = 2003;

    /**
     * This constant is used to specify the effective date.
     * <p>
     * Effective date Required for percentage entry.
     * <p>
     * value = {@value}
     */
    public static final int EFFECTIVE_DATE_REQUIRED_FOR_PERCENTAGE = 2004;

    /**
     * This constant is used to specify the percentage.
     * <p>
     * Percentage value Required for percentage entry.
     * <p>
     * value = {@value}
     */
    public static final int PERCENTAGE_REQUIRED_FOR_PERCENTAGE = 2005;

    public static final int ALTEAST_ONE_PERCENTAGE_ENTRY_IS_REQUIRED = 2006;

    /**
     * This constant is used to specify the percentage value.
     * <p>
     * The percentage value should be within 0 to 999.
     * <p>
     * value = {@value}
     */
    public static final int PERCENTAGE_VALUE_SHOULD_BE_WITHIN_0_TO_1000 = 2007;

    /**
     * This constant is used to specify the percentage value.
     * <p>
     * The percentage value should be numeric.
     * <p>
     * value = {@value}
     */
    public static final int PERCENTAGE_SHOULD_BE_NUMERIC = 2008;

    /**
     * This constant is used to specify the percentage value.
     * <p>
     * The percentage value should be numeric.
     * <p>
     * value = {@value}
     */
    public static final int EFFECTIVE_PERCENTAGE_ONLY_EXPIRATIONDATE_CAN_BE_UPDATED = 2012;

    /**
     * This constant is used to specify the percentage value.
     * <p>
     * The percentage value should be numeric.
     * <p>
     * value = {@value}
     */
    public static final int EXPIRED_PERCENTAGE_CANNOT_BE_UPDATED = 2013;

    /**
     * This constant is used to verify the effective rate type percentage .
     * <p>
     * Value = {@value}
     * */
    public static final int EXPIRED_PERCENTAGE_CANNOT_BE_DELETED = 2014;

    /**
     * This constant is used to specify the percentage overlap dates.
     * <p>
     * The input Effective Date overlaps with another Percentage Entry's date range.
     * <p>
     * value = {@value}
     */
    public static final int PERCENTAGE_OVERLAP_DATES = 2009;

    /**
     * This constant is used to specify the percentage.
     * <p>
     * At least one Percentage Entry is mandatory.
     * <p>
     * value = {@value}
     */
    public static final int ATLEAST_ONE_PERCENTAGE_REQUIRED = 2010;

    /**
     * This constant is used to specify the rate type code.
     * <p>
     * Rate type code must be 3 alphanumeric.
     * <p>
     * value = {@value}
     */
    public static final int RATE_TYPE_CODE_MUST_BE_3_ALPHANUMERIC = 2011;

    /**
     * This constant is used to specify the request.
     * <p>
     * Request Processed Successfully.
     * <p>
     * value = {@value}
     */
    public static final int REQUEST_PROCESSED_SUCCESSFULLY = 2020;

    /**********************************************************
     * UC105 - Start - Process Rating Request
     **********************************************************/
    /**
     * This constant is used to specify that no published rates were found in
     * the system for all the request lines. value = {@value}
     */
    public static final int PUBLISHED_RATES_NOT_FOUND = 1764;

    /**
     * This constant is used to specify that no actual rates were found in the
     * system for all the request lines. value = {@value}
     */
    public static final int ACTUAL_RATES_NOT_FOUND = 1765;

    /**
     * This constant is used to specify that no rates were found in the system
     * for a particular request line. value = {@value}
     */
    public static final int NO_RATES = 1766;

    /**
     * This constant is used to specify the chargable weight.
     * <p>
     * The Input Chargeable weight Exceeds the Maximum value defined for the Rate Type.
     * <p>
     * value = {@value}
     */
    public static final int INPUT_CHARGABLE_WT_EXCEEDS_MAX_VALUE = 1767;

    /**
     * This constant is used to specify the gross weight.
     * <p>
     * The Input Gross weight Exceeds the Maximum value defined for the Rate Type.
     * <p>
     * value = {@value}
     */
    public static final int INPUT_GROSS_WT_EXCEEDS_MAX_VALUE = 1768;

    /**********************************************************
     * UC105 - End - Process Rating Request
     **********************************************************/
    /*************************************************************************
     * UC105 - Process Air Waybill Rating Request
     *************************************************************************/
    /**
     * This constant is used to specify the gross weight.
     * <p>
     * The Gross Weight exceeds the Maximum Gross Weight allowed for the rate type.
     * <p>
     * value = {@value}
     */
    public static final int PAB_MAX_GWGT_EXCEEDED = 4001;

    /**
     * This constant is used to specify the Rate Combination Point.
     * <p>
     * The Rate Combination Point entered must be in the AWB Routing.
     * <p>
     * value = {@value}
     */
    public static final int PAB_RCP_MUST_BE_IN_ROUTNG = 4002;

    /**
     * This constant is used to specify the class rating.
     * <p>
     * The Class rating is prohibited for the product code/AWB Type.
     * <p>
     * value = {@value}
     */
    public static final int PAB_CLS_RATING_PROHIBITED_FOR_PRODUCT_AND_AWBTYPE = 4003;

    /**
     * This constant is used to specify the class rating Id.
     * <p>
     * The Class ID is not available in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_CLASSRATING_ID_NOT_EXISTS = 4004;

    /**
     * This constant is used to specify the class rating.
     * <p>
     * There are no rates for the Class rating.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_RATES_FOR_CLASSRATING = 4005;

    /**
     * This constant is used to specify the class rating ID.
     * <p>
     * The class rating ID does not have a minimum class rate defined in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_CLSRATINGID_NOT_EXISTS_MIN_CLSRATE = 4006;

    /**
     * This constant is used to specify the minimum weight.
     * <p>
     * The Minimum weight Condition is not satisfied for a rating Segment.
     * <p>
     * value = {@value}
     */
    public static final int PAB_MIN_WEIGHT_NOT_SATISFIED = 4007;

    /**
     * This constant is used to specify the minimum weight.
     * <p>
     * The Minimum weight Condition may not be satisfied for a rating Segment.
     * <p>
     * value = {@value}
     */
    public static final int PAB_MIN_WEIGHT_MAY_NOT_SATISFIED = 4077;

    /**
     * This constant is used to specify the class rating ID.
     * <p>
     * The class rating ID has no rules defined for the given AWB routing.
     * <p>
     * value = {@value}
     */
    public static final int PAB_CLASS_RATING_ID_HAS_NO_RULES = 4008;

    /**
     * This constant is used to specify the Rate Source.
     * <p>
     * The Rate Source is not valid as either AWB should have a participant with CACC or participant with CACC
     * is not allowed.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NOT_VALID_FOR_RATE_SOURCE_WITH_CACC = 4009;

    /**
     * This constant is used to specify the destination station.
     * <p>
     * The destination station is not available in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_DEST_STATION_INVALID = 4010;

    /**
     * This constant is used to specify the Rate Combination point .
     * <p>
     * The Input Rate Combination point is found in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_RATE_COMB_POINT_NOT_FOUND = 4011;

    /**
     * This constant is used to specify the ULD Type .
     * <p>
     * The Input ULD Type is not available in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_ULD_TYPE_NOT_EXISTS = 4012;

    /**
     * This constant is used to specify the AWB.
     * <p>
     * AWB is rated with multiple rating lines.
     * <p>
     * value = {@value}
     */
    public static final int PAB_MULTIPLE_RATE_LINES = 4013;

    /**
     * This constant is used to specify the ULD Charge Code.
     * <p>
     * The input ULD Charge Code is not available in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_ULD_CHARGE_NOT_EXISTS = 4014;

    /**
     * This constant is used to specify the Actual Rating.
     * <p>
     * The Actual Rating was not rated with a Contract/SRA.
     * <p>
     * value = {@value}
     */
    public static final int PAB_ACTUAL_RATING_NOT_RATED_WITH_CSRA = 4015;

    /**
     * This constant is used to specify the Rate Source.
     * <p>
     * The Rate Source is not available in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_RATE_SOURCE_NOT_EXISTS = 4016;

    /**
     * This constant is used to specify the Commodity.
     * <p>
     * The Commodity is not available in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_COMMODITY_NOT_EXISTS = 4017;

    /**
     * This constant is used to specify the Note.
     * <p>
     * The Note is not available in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NOTE_NOT_EXISTS = 4018;

    /**
     * This constant is used to specify the currency.
     * <p>
     * The currency is not available in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_CURRENCY_NOT_EXISTS = 4019;

    /**
     * This constant is used to specify the published currency.
     * <p>
     * There is no published currency defined for the Country in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_PUB_CUR_FOR_COUNTRY = 4020;

    /**
     * This constant is used to specify the Actual Rating.
     * <p>
     * The Actual Rating has no Contract applied even when the Special Contract Information code is set.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_CONTRACT_FOR_ACTUAL_RATING = 4021;

    /**
     * This constant is used to specify the rate type.
     * <p>
     * The rate type is not available in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_RATE_TYPE_NOT_EXISTS = 4022;

    /**
     * This constant is used to specify the Special Instructions.
     * <p>
     * There is a Contract/SRA/Note with Special Instructions applicable to AWB.
     * <p>
     * value = {@value}
     */
    public static final int PAB_SPECIAL_INSTRUCTIONS = 4023;

    /**
     * This constant is used to specify the rate class.
     * <p>
     * The rate class is not available in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_RATE_CLASS_NOT_EXISTS = 4024;

    /**
     * This constant is used to specify the rates.
     * <p>
     * There are no rates for the input AWB type in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_RATES_FOR_AWB_TYPE = 4025;

    /**
     * This constant is used to specify the Commodity Code .
     * <p>
     * The Commodity Code does not match with the Rate source of the AWB.
     * <p>
     * value = {@value}
     */
    public static final int PAB_MISMATCH_COMMODITY_AND_RATESOURCE = 4026;

    /**
     * This constant is used to specify the Bank Selling rate .
     * <p>
     * The Bank Selling rate is not available in the system.
     * <p>
     * value = {@value}
     */
    public static final int PAB_BANK_SELLING_RATE_NOT_EXISTS = 4027;

    /**
     * This constant is used to specify the AWB Origin Currency .
     * <p>
     * The AWB Origin Currency is not available in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_AWB_CURRENCY_NOT_EXISTS = 4028;

    /**
     * This constant is used to specify the IATA Exchange rate .
     * <p>
     * The IATA Exchange rate is not available for the Currency of the Rate defined in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_IATA_EXCHANGE_RATE_NOT_EXISTS = 4029;

    /**
     * This constant is used to specify the no of rating lines .
     * <p>
     * The no of rating lines are greater than the value defined .
     * <p>
     * value = {@value}
     */
    public static final int PAB_MAX_RATNG_LINES_EXCEEDED = 4030;

    /**
     * This constant is used to specify the rates .
     * <p>
     * There are no rates defined for the Input note in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_RATES_FOR_NOTE = 4031;

    /**
     * This constant is used to specify the rates .
     * <p>
     * System Cannot rate ULD's with Class Rating.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_CLASS_RTG_FOR_ULD = 4032;

    /**
     * This constant is used to specify the Airline in AWB routing.
     * <p>
     * The Airline in AWB routing is not available in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_AWB_AIRLINE_NOT_EXISTS = 4033;

    /**
     * This constant is used to specify the Origin station.
     * <p>
     * The Origin station is not available in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_ORIGIN_STATION_NOT_EXISTS = 4034;

    /**
     * This constant is used to specify the class Rating ID's.
     * <p>
     * There are no class Rating ID's for the Input Routing in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_CLASS_RATINGID_FOR_ROUTING = 4035;

    /**
     * This constant is used to specify the class rating lines.
     * <p>
     * Multiple 'K' class rating lines are prohibited.
     * <p>
     * value = {@value}
     */
    public static final int PAB_K_RATINGLINES_PROHIBITED = 4036;

    /**
     * This constant is used to specify the rate class.
     * <p>
     * The rate class 'B' is not defined in the system.
     * <p>
     * value = {@value}
     */
    public static final int PAB_RATECLASS_B_NOT_EXISTS = 4037;

    /**
     * This constant is used to specify the rate class.
     * <p>
     * The rate class 'E' is not defined in the system.
     * <p>
     * value = {@value}
     */
    public static final int PAB_RATECLASS_E_NOT_EXISTS = 4038;

    /**
     * This constant is used to specify the rate class.
     * <p>
     * The rate class 'X' is not defined in the system.
     * <p>
     * value = {@value}
     */
    public static final int PAB_RATECLASS_X_NOT_EXISTS = 4039;

    /**
     * This constant is used to specify the rate class.
     * <p>
     * The rate class 'Y' is not defined in the system.
     * <p>
     * value = {@value}
     */
    public static final int PAB_RATECLASS_Y_NOT_EXISTS = 4040;

    /**
     * This constant is used to specify the rate class.
     * <p>
     * The rates already defined for the Input Routing .
     * <p>
     * value = {@value}
     */
    public static final int PAB_ENTER_RATE_TYPE_TO_RESTRICT_SEARCH = 4041;

    /**
     * This constant is used to specify the Class ID.
     * <p>
     * The Class ID field is mandatory.
     * <p>
     * value = {@value}
     */
    public static final int PAB_CLS_ID_MANDATORY = 4042;

    /**
     * This constant is used to specify the Commodity rate.
     * <p>
     * The Commodity rate is found but the General Commodity Rate(GCR) is still cheaper.
     * <p>
     * value = {@value}
     */
    public static final int PAB_GCR_CHEAPER = 4043;

    /**
     * This constant is used to specify the Minimum weight.
     * <p>
     * There are no Minimum weight to compare for the rates defined.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_MIN_WEIGHT_FOR_COMPARISON = 4044;

    /**
     * This constant is used to specify the Minimum weight.
     * <p>
     * The Minimum weight is satisfied.
     * <p>
     * value = {@value}
     */
    public static final int PAB_MIN_WEIGHT_SATISFIED = 4045;

    /**
     * This constant is used to specify the rates.
     * <p>
     * There is no GEN/GCR rates in the System which can be applied.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_GEN_GCR_RATES = 4046;

    /**
     * This constant is used to specify the Airport/City.
     * <p>
     * The Airport/City in the Routing is not available in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_ROUTING_AIRPORT_CITY_NOT_EXISTS = 4047;

    /**
     * This constant is used to specify the Airline.
     * <p>
     * The Airline is not available in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_ROUTING_AIRLINE_NOT_EXISTS = 4048;

    /**
     * This constant is used to specify the Minimum Chargeable weight.
     * <p>
     * There is no Minimum Chargeable weight found for ULD rates in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_MIN_CHARGE_WT_FOUND = 4049;

    /**
     * This constant is used to specify the joint rates.
     * <p>
     * system cannot pick joint rates when four or more segments with different airlines are input.
     * <p>
     * value = {@value}
     */
    public static final int PAB_TOO_MANY_SEGMENTS_FOR_JNT = 4050;

    /**
     * This constant is used to specify the ATPCO Source.
     * <p>
     * The ATPCO Source is not valid for one of the airlines used in the Routing.
     * <p>
     * value = {@value}
     */
    public static final int PAB_ATPCO_SOURCE_INVALID = 4051;

    /**
     * This constant is used to specify the Airline.
     * <p>
     * The Airline does not have a Interline Minimum defined in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_INTERLINE_AIRLINE = 4052;

    /**
     * This constant is used to specify the ULD type definition.
     * <p>
     * The ULD type definition does not match with that defined in ACR.
     * <p>
     * value = {@value}
     */
    public static final int PAB_MISMATCH_ULDTYPE_DEF = 4053;

    /**
     * This constant is used to specify the Airport/City.
     * <p>
     * The Airport/City in the routing has duplicates.
     * <p>
     * value = {@value}
     */
    public static final int PAB_DUPLICATE_ROUTINGS = 4054;

    /**
     * This constant is used to specify the ULD discounts.
     * <p>
     * The ULD discounts applied to the ULD rating line results in Zero Total charge.
     * <p>
     * value = {@value}
     */
    public static final int PAB_ULD_DISC_ZERO_CHARGE = 4055;

    /**
     * This constant is used to specify the rates.
     * <p>
     * System has applied a normal rate for ULD discounts.
     * <p>
     * value = {@value}
     */
    public static final int PAB_CHECK_WEIGHT_FOR_ACCURACY = 4056;

    /**
     * This constant is used to specify the Joint Rates.
     * <p>
     * There is no applicable Joint Rates in the System for the Input routing.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_JNT_RATES_FOR_INPUT_ROTUING = 4057;

    /**
     * This constant is used to specify the ULD Rates.
     * <p>
     * There is no applicable ULD Rates in the System for the Input routing.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_ULD_RATES_FOR_INPUT_ROTUING = 4058;

    /**
     * This constant is used to specify the Commodity Rates.
     * <p>
     * There is no applicable Commodity Rates in the System for the Input routing.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_COMMODITY_RATES_FOR_INPUT_ROTUING = 4059;

    /**
     * This constant is used to specify the Rates.
     * <p>
     * There is no applicable GEN/GCR Rates in the System for the Input routing.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_GEN_GCR_FOR_INPUT_ROTUING = 4060;

    /**
     * This constant is used to specify the Contract Rates.
     * <p>
     * There is no applicable Contract Rates in the System for the Input Routing.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_CONTRATES_FOR_INPUT_ROTUING = 4061;

    /**
     * This constant is used to specify the Spot Rate.
     * <p>
     * There is no applicable Spot Rate in the System for the Input Routing.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_SRA_RATES_FOR_INPUT_ROTUING = 4062;

    /**
     * This constant is used to specify the Commodity.
     * <p>
     * The Commodity has no specific rates defined in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_SPECIFIC_RATES_FOR_COMMODITY = 4063;

    /**
     * This constant is used to specify the Gross weight.
     * <p>
     * The Gross weight is too Low to apply a Minimum rate for the ULD rating line.
     * <p>
     * value = {@value}
     */
    public static final int PAB_TOO_LOW_GROSS_WEIGHT = 4064;

    /**
     * This constant is used to specify the Tare weight .
     * <p>
     * The Tare weight Exceeds the Maximum value defined in the System for the ULD Type.
     * <p>
     * value = {@value}
     */
    public static final int PAB_TARE_WEIGHT_EXCEEDS = 4065;

    /**
     * This constant is used to specify the ULD rate.
     * <p>
     * There is no applicable ULD rate defined in the System for the input ULD type.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_APPLICABLE_ULD_RATE = 4066;

    /**
     * This constant is used to specify the Special Contract information.
     * <p>
     * The Special Contract information is not available in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_SPL_CONTRACT_NOT_EXISTS = 4067;

    /**
     * This constant is used to specify the Chargeable weight.
     * <p>
     * The Chargeable weight Exceeds the Maximum value defined for the Rate Type.
     * <p>
     * value = {@value}
     */
    public static final int PAB_CHARGEABLE_WEIGHT_EXCEEDS = 4068;

    /**
     * This constant is used to specify the Rate Source/Rate Type.
     * <p>
     * The Rate Source/Rate Type is not valid for the AWB Type in the AWB.
     * <p>
     * value = {@value}
     */
    public static final int PAB_INVALID_RATESOURCE_AND_RATETYPE_FOR_AWB = 4069;

    /**
     * This constant is used to specify the Multiple Rating lines.
     * <p>
     * Multiple Rating lines with Rate class 'Q' is invalid.
     * <p>
     * value = {@value}
     */
    public static final int PAB_RATE_CLASS_Q_INVALID_FOR_MULRATINGLINES = 4070;

    /**
     * This constant is used to specify the Rating lines.
     * <p>
     * The Rating lines have Duplicate Commodity codes.
     * <p>
     * value = {@value}
     */
    public static final int PAB_DUPLICATE_COMMODITY_CODES = 4071;

    /**
     * This constant is used to specify the Conversion rate.
     * <p>
     * The Conversion rate for a currency in a Contract is not defined in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_CONVERSION_RATE_NOT_DEFINED = 4072;

    /**
     * This constant is used to specify the SRA.
     * <p>
     * The SRA is not applied to the AWB due to Mismatch condition.
     * <p>
     * value = {@value}
     */
    public static final int PAB_SRA_AWB_MISMATCH_CONDITION = 4073;

    /**
     * This constant is used to specify the Gross weight.
     * <p>
     * The Gross weight Exceeds the Maximum value defined for the Rate Type.
     * <p>
     * value = {@value}
     */
    public static final int PAB_GROSS_WEIGHT_EXCEEDED = 4074;

    /**
     * This constant is used to specify the Spot rate or Contract.
     * <p>
     * The Spot rate or Contract has no rates defined in the System.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NO_RATES_FOR_SRA_CTC = 4075;

    /**
     * This constant is used to specify the Rate type.
     * <p>
     * The Rate type is field is mandatory for CRU users.
     * <p>
     * value = {@value}
     */
    public static final int PAB_RATETYPE_MANDATORY_CRU_USERS = 4076;

    /**
     *Added for SK164C
     *This constant is used to specify the Rate type.
     * <p>
     * The Rate type is field is mandatory for CRU users.
     * <p>
     * value = {@value}
     */
    public static final int CONTRACT_TO_APPLY_NOT_FOUND = 4091;

    /**
     *Added for SK164C
     * This constant is used to specify the Rate type.
     * <p>
     * The Rate type is field is mandatory for CRU users.
     * <p>
     * value = {@value}
     */
    public static final int CONTRACT_CAN_NOT_BE_APPLIED = 4092;


    /**
     * This constant is used to specify the Participant.
     * <p>
     * The Participant has Contracts,and Spot Rates,and/or is a member of a participant group, therefore the
     * and account number cannot be changed.
     * <p>
     * value = {@value}
     */
    public static final int CONTRACT_SPOTRATE_GROUP_EXIST_FOR_PARTICIPANT = 4080;

    /**
     * This constant is used to specify the Joint Rates.
     * <p>
     * Joint Rates are not present and Rating Line should be Auto RCP.
     * <p>
     * value = {@value}
     */
    public static final int PAB_JOINTRATE_RCP_REQUIRED = 4081;

    /**
     * This constant is used to specify the ULD Tare Weight.
     * <p>
     * ULD Tare Weight should not be present for Non Aircraft ULD.
     * <p>
     * value = {@value}
     */
    public static final int PAB_NON_AIRCRAFT_ULD_TAREWT_PRESENT = 4082;

    /**
     * This constant is used to specify the ULD Tare Weight.
     * <p>
     * ULD Tare Weight should be present for Aircraft ULD.
     * <p>
     * value = {@value}
     */
    public static final int PAB_AIRCRAFT_ULD_TAREWT_NOT_PRESENT = 4083;

    /**
     * This constant is used to specify the ULD Description.
     * <p>
     * ULD Description is invalid.
     * <p>
     * value = {@value}
     */
    public static final int PAB_ULD_DESCRIPTION_INVALID = 4084;

    /**
     * This constant is used to specify the ULD Maximum Gross Weight.
     * <p>
     * Input Chargable Weight should not exceed ULD Maximum Gross Weight.
     * <p>
     * value = {@value}
     */
    public static final int PAB_CHARGABLEWT_GT_ULD_MAX_GROSSWT = 4085;

    /*************************************************************************
     * UC046 - Process Rate and Price Requests
     *************************************************************************/
    /**
     * This constant is used to verify the commodity code.
     * <p>
     * Failed because of invalid commodity code.<br>
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_TYPE_SIZE_VALIDATE = 2500;

    /**
     * This constant is used to verify the input volume.
     * <p>
     * Failed because of non-existence of weight.<br>
     * <p>
     * Value = {@value}
     */
    public static final int PRICES_DO_NOT_EXIST = 2501;

    /**
     * This constant is used to verify if other rates could apply.
     * <p>
     * Failed because of existence of other rates.<br>
     * <p>
     * Value = {@value}
     */
    public static final int RATEQUOTE_WARNING_MESSAGE = 2502;

    /**
     * This constant is used to specify the Commodity Number.
     * <p>
     * Commodity Number is mandatory if the Rate Class is 'C'.
     * <p>
     * value = {@value}
     */
    public static final int COMMODITY_NUMBER_MANDATORY_FOR_C = 2503;

    /**
     * This constant is used to specify the account number.
     * <p>
     * The account number does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_ACCOUNT_NUMBER_DOES_NOT_EXIST = 2504;

    /**
     * This constant is used to specify the sra warnings.
     * <p>
     * 1
     * <p>
     * value = {@value}
     */
    public static final int PRICING_SRA_WARNING01 = 4501;

    /**
     * This constant is used to specify the sra warnings.
     * <p>
     * 2
     * <p>
     * value = {@value}
     */
    public static final int PRICING_SRA_WARNING02 = 4502;

    /**
     * This constant is used to specify the sra warnings.
     * <p>
     * 3
     * <p>
     * value = {@value}
     */
    public static final int PRICING_SRA_WARNING03 = 4503;

    /**
     * This constant is used to specify the sra warnings.
     * <p>
     * 4
     * <p>
     * value = {@value}
     */
    public static final int PRICING_SRA_WARNING04 = 4504;

    /**
     * This constant is used to specify the sra warnings.
     * <p>
     * 5
     * <p>
     * value = {@value}
     */
    public static final int PRICING_SRA_WARNING05 = 4505;

    /**
     * This constant is used to specify the sra warnings.
     * <p>
     * 6
     * <p>
     * value = {@value}
     */
    public static final int PRICING_SRA_WARNING06 = 4506;

    /**
     * This constant is used to specify the sra warnings.
     * <p>
     * 7
     * <p>
     * value = {@value}
     */
    public static final int PRICING_SRA_WARNING07 = 4507;

    /**
     * This constant is used to specify the sra warnings.
     * <p>
     * 8
     * <p>
     * value = {@value}
     */
    public static final int PRICING_SRA_WARNING08 = 4508;

    /**
     * This constant is used to specify the sra warnings.
     * <p>
     * 9
     * <p>
     * value = {@value}
     */
    public static final int PRICING_SRA_WARNING09 = 4509;

    /**
     * This constant is used to specify the sra warnings.
     * <p>
     * 10
     * <p>
     * value = {@value}
     */
    public static final int PRICING_SRA_WARNING10 = 4510;

    /**
     * This constant is used to specify the sra warnings.
     * <p>
     * 11
     * <p>
     * value = {@value}
     */
    public static final int PRICING_SRA_WARNING11 = 4511;

    /**
     * This constant is used to specify the sra warnings user security doesnt
     * allow SRA for Pricing.
     * <p>
     * 11
     * <p>
     * value = {@value}
     */
    public static final int PRICING_SRA_WARNING12 = 4543;
    /**
     * Message constant to map to the text,
     * <p>
     * Global Contract Administration created.
     * <p>
     * value = {@value}
     */

    public static final int GLOBAL_CONTRACT_ADMIN_CREATED = 4512;

    public static final int SPOT_RATE_QUEUE_REQUIRED = 4527;

    public static final int SPOT_RATE_SETTING = 4528;

    public static final int SPOT_RATE_OFFICE = 4529;

    public static final int SPOT_RATE_STATION = 4530;

    public static final int SPOT_RATE_QUEUE_NAME = 4531;

    public static final int SPOT_RATE_SIGNIN_STATION = 4532;

    public static final int SPOT_RATE_OBJECT_INVALID = 4533;

    public static final int SPOT_RATE_ORGDEST_INVALID = 4534;

    public static final int CONTRACT_LIMIT_EXCEEDS_FOR_PARTICIPANT = 4541;
    /**
     * This constant is used to specify the Rate type.
     * <p>
     * The Rate type is field is mandatory for CRU users.
     * <p>
     * value = {@value}
     */
    public static final int PAB_GEN_RATES_FOR_COMMODITY= 4544;


    /**
     * This constant is used to specify the Rate type.
     * <p>
     * The Rate type is field is mandatory for CRU users.
     * <p>
     * value = {@value}
     */

    public static final int NO_ACCOUNT_NUMBER_FOR_THE_PARTICIPANT = 4550;

   // public static final int CONTRACT_NO_STATUS_CHECKED = 4544;

    public static final int ONLY_SPECIFIC_RATE_CLASS_AVAILABLE_FOR_ALLOTMENT_SET_TO_HARD_OR_SOFT_BLOCK=1157;

public static final int GLOBAL_RATE_OR_OVER_PIVOT_RATE_ADJUSTMENT_MANDATORY=1160;
    /**
     * This constant is used to specify for soft /hard block allotments.
     * <p>
     * only station codes can be entered for the origin and destination for a soft block or hard block
     * allotment contract.
     * <p>
     * value = {@value}
     */

    public static final int ONLY_ORI_DEST_STATION_ALLOWED_FOR_SOFT_OR_HARD_BLOCK_ALLOT_CONTRACT = 4551;
    public static final int MAX_PIECES_PER_RATING_LINE_GREATER_THAN_OR_EQUAL_TO_INPUT_PIECE = 4552;

    public static final int MAX_PIECES_PER_AWB_GREATER_THAN_OR_EQUAL_TO_INPUT_PIECE = 4553;

    public static final int MAX_WEIGHT_PER_AWB_GREATER_THAN_OR_EQUAL_TO_INPUT_PIECE = 4554;
    /**
     * This constant is used to specify the spotrateQueue.
     * <p>
     * <p>
     * value = {@value}
     */
    public static final int SPOTRATEQUEUE_IS_ADDED = 4555;
    public static final int SPOTRATEQUEUE_IS_UPDATED = 4556;
    public static final int SPOTRATEQUEUE_IS_DELETED = 4557;
    /**
     * This constant is used to verify the duplicate tariff tasks.
     * <p>
     * Failed because of duplicate tariff tasks.<br>
     * <p>
     * Value = {@value}
     */
    public static final int GLOBAL_DUPLICATE_CONTRACT_TASKS_NOT_ALLOWED = 1866;

    /**
     * This constant is used to specify the Allotment associated with the  contract.
     * <p>
     * There is a Contract/SRA/Note allotment applicable to AWB.
     * <p>
     * value = {@value}
     */
    public static final int PAB_ALLOTMENT_ID = 4093;
    /**
     * This constant is used to specify the Allotment associated with the  contract.
     * <p>
     * There is a Contract/SRA/Note allotment applicable to AWB.
     * <p>
     * value = {@value}
     */
    public static final int PAB_ADDITIONAL_PARTICIPANT = 4094;
    /**
     * This constant is used to specify the Allotment associated with the  contract.
     * <p>
     * There is a Contract/SRA/Note allotment applicable to AWB.
     * <p>
     * value = {@value}
     */
    public static final int PAB_PAYCODE_PREPAID = 4095;
    /**
     * This constant is used to specify the Allotment associated with the  contract.
     * <p>
     * There is a Contract/SRA/Note allotment applicable to AWB.
     * <p>
     * value = {@value}
     */
    public static final int PAB_PAYCODE_COLLECT = 4096;


    /**
     * This constant is used to specify the Rating note associated with Tariff Rate.
     * <p>
     * There is a Contract/SRA/Note allotment applicable to AWB.
     * <p>
     * value = {@value}
     */
    public static final int PAB_RATE_NOTE = 4097;


    /**
     * This constant is used to verify the Invalid participant group contract.
     * <p>
     * the Invalid participant group contract.<br>
     * <p>
     * Value = {@value}
     * */
    public static final int GLOBAL_CONTRACT_INVALID_PARTICIPANT_GROUP = 1957;

    /**
     * This constant is used to verify the Contract Task.
     * <p>
     * Failed if Contract participant acoount number does not belong to the given contract number.<br>
     * <p>
     * Value = {@value}
     * */

    public static final int GLOBAL_CONTRACT_GROUP_ACCOUNT_NO_DOES_NOT_BELONG_TO_CONTRACT_NUMBER = 1958;
    public static final int INPUT_WEIGHT_UNIT_IS_MANDATORY_IF_PIVOT_WEIGHT_INPUT = 4098 ;
    /**
     * <code>Private constructor.</code>
     */
    public static final int CARRIER_NUMBER_DOES_NOT_EXIST = 550;
    private MessageConstants() {

    }
}