/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.RatingSecurityDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.RatingSecurityFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.RatingSecurityMultipleFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.RatingSecurityMultipleFindResponse;
import com.unisys.trans.logistics.lms.rating.dto.RatingSecurityPersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.RatingSecurityResponse;

/**
 * <code>RatingSecurityService</code> handles the RatingSecurity
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>Create a RatingSecurity.
 * <li>Delete a RatingSecurity.
 * <li>authorizeUser for RatingSecurity.
 * <li>Find a RatingSecurity.
 * <li>Update a RatingSecurity.
 * <li>Finds all the RatingSecurity.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.RatingSecurityDeleteRequest
 *      RatingSecurityDeleteRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RatingSecurityFindRequest
 *      RatingSecurityFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RatingSecurityPersistRequest
 *      RatingSecurityPersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RatingSecurityMultipleFindRequest
 *      RatingSecurityMultipleFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RatingSecurityResponse
 *      RatingSecurityResponse
 * @see com.unisys.trans.logistics.lms.framework.dto.AbstractRequest
 *      AbstractRequest
 */
public interface RatingSecurityService {

    /**
     * Creates the <code>RatingSecurity</code>.
     * <p>
     * Creates the RatingSecurity based upon the User identifier and User type. creates the
     * RatingSecurityEntry based upon origin,destination and securitytype. The origin and Destination can be
     * city,airport,country,aggregate.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.RatingSecurityService#findRatingSecurity
     * findRatingSecurity}<br>
     * <p>
     * To create the RatingSecurity user must provide following input:<br>
     * <li>Identifier. <br>
     * <li>Security User Type. <br>
     * <li>Security Type<br>
     * <li>Origin<br>
     * <li>Destination<br>
     * <li>Rate Souce Code<br>
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
     * MessageConstants#INPUT_USER_ID_DOES_NOT_EXIST_IN_THE_SYSTEM
              INPUT_USER_ID_DOES_NOT_EXIST_IN_THE_SYSTEM}</code></td>
     * <td align="left">User Id in RatingSecurity is invalid</td>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#INPUT_USER_GROUP_ID_DOES_NOT_EXIST_IN_THE_SYSTEM
              INPUT_USER_GROUP_ID_DOES_NOT_EXIST_IN_THE_SYSTEM}</code></td>
     * <td align="left">User Group in RatingSecurity is invalid</td>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#SECURITY_INFORMATION_ALREADY_EXIST_FOR_THE_INPUT_USER
              SECURITY_INFORMATION_ALREADY_EXIST_FOR_THE_INPUT_USER}</code></td>
     * <td align="left">User ID in RatingSecurity if already Exists</td>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#INPUT_USER_GROUP_ID_SECURITY_INFO_ALREADY_EXIST
              INPUT_USER_GROUP_ID_SECURITY_INFO_ALREADY_EXIST}</code></td>
     * <td align="left">User Group in RatingSecurity if already Exists</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_SOURCE_DOES_NOT_EXISTS
              RATE_SOURCE_DOES_NOT_EXISTS}</code></td>
     * <td align="left">Rate Source Does Not Exist In the System</td>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#ORIGIN_DOES_NOT_EXIST
              ORIGIN_DOES_NOT_EXIST}</code></td>
     * <td align="left">Input Origin Code does not exist in the system</td>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#DESTINATION_DOES_NOT_EXIST
              DESTINATION_DOES_NOT_EXIST}</code></td>
     * <td align="left">Input Destination Code does not exist in the system</td>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#AGGREGATE_DOES_NOT_EXIST
              AGGREGATE_DOES_NOT_EXIST}</code></td>
     * <td align="left">Input Aggregate code does not exist in the system</td>
     * </table>
     * <p>
     * 
     * @param pRatingSecurityPersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityPersistRequest
     *            RatingSecurityPersistRequest}</code><br>
     *            includes the attributes to create a <code>RatingSecurity </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityDto#getIdentifier
     *            Identifier} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityDto#getUserType
     *            SecurityUserType} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingSecurityDto#getRatingSecurityEntryDtos()
     *            RatingSecurityEntryDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingSecurityEntryDto#getSecurityType
     *            Security Type} - (M)</code><li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingSecurityEntryDto#getOrigin
     *            Origin} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingSecurityEntryDto#getDestination
     *            Destination} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingSecurityEntryDto#getRateSourceCode
     *            Rate Source Code} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingSecurityEntryDto#getOriginIndicator
     *            Origin Indicator} - (C)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.constants.SecurityGeoType
     *            Security Geographic type } </code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingSecurityEntryDto#getDestinationIndicator
     *            Destination Indicator} - (C)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.constants.SecurityGeoType
     *            Security Geographic type}</code>
     *            </ul>
     * 
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityResponse
     *         RatingSecurityResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants. MessageConstants#SECURITY_INFORMATION_IS_CREATED
     *         SECURITY_INFORMATION_IS_CREATED} </code> <br>
     *         <code>for successful create.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityResponse#getRatingSecurityDto()
     *         RatingSecurityDto}</code>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    RatingSecurityResponse createRatingSecurity(
                RatingSecurityPersistRequest pRatingSecurityPersistRequest)
                throws LMSException;

    /**
     * Deletes the RatingSecurity.
     * <p>
     * This functions deletes the RatingSecurity for an User type with its identifier.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.RatingSecurityService#findRatingSecurity
     * findRatingSecurity}<br>
     * <p>
     * To delete the RatingSecurity user must provide following input:<br>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#NO_SECURITY_INFO_DEFINED_FOR_USER_ID NO_SECURITY_INFO_DEFINED_FOR_USER_ID}</code>
     * </td>
     * <td align="left">User ID for RatingSecurity does not exists.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#NO_SECURITY_INFO_DEFINED_FOR_USER_GROUP NO_SECURITY_INFO_DEFINED_FOR_USER_GROUP}</code>
     * </td>
     * <td align="left">User Group for RatingSecurity does not exists</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pRatingSecurityDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityDeleteRequest
     *            RatingSecurityDeleteRequest}</code><br>
     *            includes the attributes to find a <code>RatingSecurity</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityDto#getOId
     *            OId}-(M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityResponse
     *         RatingSecurityResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#SECURITY_INFORMATION_IS_DELETED
     *         SECURITY_INFORMATION_IS_DELETED} </code> <br>
     *         <code>for successful delete.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityResponse#getRatingSecurityDto()
     *         RatingSecurityDto}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityEntryDto
     *         RatingSecurityEntryDto}- (1:*)</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    RatingSecurityResponse deleteRatingSecurity(
                RatingSecurityDeleteRequest pRatingSecurityDeleteRequest)
                throws LMSException;

    /**
     * Retrieves all <code>User Identifiers</code> of <code>RatingSecurity</code> information currently
     * defined in the system
     * for given sepecific user type.<br>
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
     * <p>
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#NO_SECURITY_INFO_DEFINED_FOR_USER_ID NO_SECURITY_INFO_DEFINED_FOR_USER_ID}</code>
     * </td>
     * <td align="left">User ID for RatingSecurity does not exist.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#NO_SECURITY_INFO_DEFINED_FOR_USER_GROUP NO_SECURITY_INFO_DEFINED_FOR_USER_GROUP}</code>
     * </td>
     * <td align="left">User Group for RatingSecurity does not exist.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pRatingSecurityMultipleFindRequest
     *            <code>pRatingSecurityMultipleFindRequest</code> is a dummy
     *            parameter ,given to satisfy the LMSNG convention.
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityResponse
     *         RatingSecurityResponse} </code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityDto#getIdentifier
     *         Rating Identifier} - (0:*)</code><br>
     *         holds the list of <code>Rating User Identifiers which belongs to given User type</code>.
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If the <code>RatingSecurity</code> information does not exist
     *             the above mentioned error codes are returned. Each <code>CodeMessage</code> contains the
     *             status code, human
     *             readable message and message type.
     */
    RatingSecurityMultipleFindResponse findAllRatingSecurity(
                RatingSecurityMultipleFindRequest pRatingSecurityMultipleFindRequest)
                throws LMSException;

    /**
     * Finds the RatingSecurity based on the given origin,Destination and User
     * Type.
     * <p>
     * RatingSecurityFindRequest will contain:
     * <p>
     * <code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityDto
     *       RatingSecurityDto}</code><br>
     * <p>
     * To find the RatingSecurity user must provide following input:<br>
     * <li>Identifier.<br>
     * <li>SecurityType.<br>
     * <li>UserType. <br>
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
     * MessageConstants#NO_SECURITY_INFO_DEFINED_FOR_USER_ID NO_SECURITY_INFO_DEFINED_FOR_USER_ID}</code></td>
     * <td align="left">User ID for RatingSecurity does not exist.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#NO_SECURITY_INFO_DEFINED_FOR_USER_GROUP NO_SECURITY_INFO_DEFINED_FOR_USER_GROUP}</code>
     * </td>
     * <td align="left">User Group for RatingSecurity does not exist.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pRatingSecurityFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityFindRequest
     *            RatingSecurityFindRequest}</code><br>
     *            includes the attributes to find a <code>RatingSecurity </code> .
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityFindRequest
     *            RatingSecurityFindRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityFindRequest#getIdentifier
     *            identifier} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityFindRequest#getUserType
     *            userType} - (M)</code><li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityFindRequest#getSecurityType
     *            securityType} - (O)</code><br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityResponse
     *         RatingSecurityResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityResponse#getRatingSecurity()
     *         RatingSecurityDto}</code> holds the <code> RatingSecurityDto </code> objects.<br>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityDto#getRatingSecurityEntryDtos()
     *         RatingSecurityEntryDto}- (0:*)</code> holds the list of <code> RatingSecurityEntryDto</code>
     *         objects.
     *         </ul>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    RatingSecurityResponse findRatingSecurity(
                RatingSecurityFindRequest pRatingSecurityFindRequest)
                throws LMSException;

    /**
     * Finds the RatingSecurity User for Aggregate PFM.
     * <p>
     * If the rating security is found for the origin or destination aggregate code then the indicator is set
     * to true .<br>
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
     * 
     * @param pBatchRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     *            <p>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    BatchResponse findRatingSecurityForAggregate(BatchRequest pBatchRequest) throws LMSException;

    /**
     * Finds the RatingSecurity User for Airport PFM.
     * <p>
     * If the rating security is found for the origin or destination airport code then the indicator is set to
     * true .<br>
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
     * 
     * @param pBatchRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     *            <p>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    BatchResponse findRatingSecurityForAirport(BatchRequest pBatchRequest)
                throws LMSException;

    BatchResponse findRatingSecurityForCity(BatchRequest pBatchRequest)
                throws LMSException;

    /**
     * Finds the RatingSecurity User Group for Aggregate PFM.
     * <p>
     * If the rating security is found for the origin or destination aggregate code then the indicator is set
     * to true .<br>
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
     * 
     * @param pBatchRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     *            <p>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    BatchResponse findRatingSecurityGroupForAggregate(BatchRequest pBatchRequest) throws LMSException;

    /**
     * Finds the RatingSecurity User Group for Airport PFM.
     * <p>
     * If the rating security is found for the origin or destination Airport code then the indicator is set to
     * true .<br>
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
     * 
     * @param pBatchRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     *            <p>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    BatchResponse findRatingSecurityGroupForAirport(BatchRequest pBatchRequest) throws LMSException;

    /**
     * Updates the RatingSecurity.
     * <p>
     * Updates the <code>RatingSecurity</code> as well as <code>RatingSecurityEntry</code> based on the
     * origin,destination and userType.
     * <p>
     * <b>Related Method :</b>
     * {@link com.unisys.trans.logistics.lms.rating.contract.RatingSecurityService#findRatingSecurity
     * findRatingSecurity}
     * <p>
     * To update RatingSecurity user must provide following input:<br>
     * <li>SecurityType. <br>
     * <li>RateSource. <br>
     * <li>OriginCode. <br>
     * <li>OriginIndicator. <br>
     * <li>DestinationIndicator.<br>
     * <li>DestinationCode. <br>
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
     * MessageConstants#NO_SECURITY_INFORMATION_IS_AVAILABLE_FOR_THE_INPUT_USER_ID 
              NO_SECURITY_INFORMATION_IS_AVAILABLE_FOR_THE_INPUT_USER_ID}</code></td>
     * <td align="left">If Security Information is not there for User ID</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#INPUT_USER_GROUP_ID_NO_SECURITY_INFO INPUT_USER_GROUP_ID_NO_SECURITY_INFO}</code></td>
     * <td align="left">If Security Information is not there for User Group ID</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#RATE_SOURCE_DOES_NOT_EXISTS
              RATE_SOURCE_DOES_NOT_EXISTS}</code></td>
     * <td align="left">Rate Source Does Not Exist In the System</td>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#ORIGIN_DOES_NOT_EXIST
              ORIGIN_DOES_NOT_EXIST}</code></td>
     * <td align="left">Input Origin Code does not exist in the system</td>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#DESTINATION_DOES_NOT_EXIST
              DESTINATION_DOES_NOT_EXIST}</code></td>
     * <td align="left">Input Destination Code does not exist in the system</td>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#AGGREGATE_DOES_NOT_EXIST
              AGGREGATE_DOES_NOT_EXIST}</code></td>
     * <td align="left">Input Aggregate code does not exist in the system</td>
     * </table>
     * <p>
     * 
     * @param pRatingSecurityPersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityPersistRequest
     *            RatingSecurityPersistRequest}</code><br>
     *            includes the attributes to update a <code>RatingSecurity </code>.
     *            <ul>
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityDto
     *            RatingSecurityDto}</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityEntryDto
     *            RatingSecurityEntryDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityEntryDto#getDestinationIndicator
     *            Destination Indicator} -(O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.constants.SecurityGeoType
     *            Security Geographic type }-(O) </code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityEntryDto#getDestination
     *            Destination} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityEntryDto#getOrigin
     *            Origin} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityEntryDto#getOriginIndicator
     *            Origin Indicator} - (C)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.constants.SecurityGeoType
     *            Security Geographic type }-(O) </code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityEntryDto#getRateSourceCode
     *            Rate Source Code} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityEntryDto#SecurityType
     *            Security Type} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityEntryDto#getOid
     *            RatingSecurityEntry Oid} - (C)</code><br>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityDto#getOId
     *            RatingSecurity Oid} - (M)</code>
     *            </ul>
     *            destination destinationIndicator origin originIndicator rateSourceCode securityType
     *            userAuditDto actionType
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityResponse
     *         RatingSecurityResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#SECURITY_INFORMATION_IS_UPDATED
     *         SECURITY_INFORMATION_IS_UPDATED} </code> <br>
     *         <code>for successful update.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityResponse#getRatingSecurityDto()
     *         RatingSecurityDto}</code> holds the <code>RatingSecurityDto </code> objects.
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RatingSecurityEntryDto
     *         RatingSecurityEntryDto} - (1:*)</code> holds the list of <code> RatingSecurityEntryDto</code>
     *         objects.
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */

    RatingSecurityResponse updateRatingSecurity(
                RatingSecurityPersistRequest pRatingSecurityPersistRequest)
                throws LMSException;

}
