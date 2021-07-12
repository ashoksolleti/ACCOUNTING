/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.RatingCarrierFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.RatingCarrierPersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.RatingCarrierResponse;

/**
 * <code>RatingCarrierService</code> handles the RatingCarrier
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>Create the Rating Carrier.
 * <li>Find the Rating Carrier.
 * <li>Update a Rating Carrier.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.RatingCarrierFindRequest
 *      RatingCarrierFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RatingCarrierPersistRequest
 *      RatingCarrierPersistRequest
 */
public interface RatingCarrierService {

	/**
	 * Create a new rating carrier.
	 * <p>
	 * This method returns a created Rating carrier if successfully created.
	 * <p>
	 * To create a rating carrier user must provide following input:<br>
	 * <li>ratingCarrierDto.<br>
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
	 * MessageConstants#RATING_CARRIER_NOT_EXISTS}</code></td>
	 * <td align="left">Rating Note Version does not exists.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#RATING_CARRIER_CARRIER_CODE_MANDATORY}</code></td>
	 * <td align="left">Rating Note is marked for deletion.</td>
	 * </tr>
	 * </table>
	 * <p>
	 * 
	 * @param pRatingCarrierPersistRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingCarrierPersistRequest
	 *            RatingCarrierPersistRequest}</code><br>
	 *            includes the attributes to find a <code>Rate Source </code>.
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingCarrierPersistRequest#setRatingCarrierDto
	 *            ratingCarrierDto} - (C)</code>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingCarrierResponse
	 *         RatingCarrierResponse}</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields}</code><br>
	 *         holds the CodeMessage <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingCarrierResponse#getRatingCarrierDto()
	 *         ratingCarrierDto} - (1:*)</code>
	 *         </ul>
	 * @throws LMSException
	 *             If the validation fails, above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code, human
	 *             readable message, and message type.
	 */
	RatingCarrierResponse createRatingCarrier(
			RatingCarrierPersistRequest pRatingCarrierPersistRequest)
			throws LMSException;

	/**
	 * Finds the Rate Sources for a carrier.
	 * <p>
	 * This method returns a RatingSource along with its hierarchy.
	 * <p>
	 * To find the Rating Carrier for a carrier user must provide following
	 * input:<br>
	 * <li>Carrier Code.<br>
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
	 * MessageConstants#RATING_CARRIER_NOT_EXISTS}</code></td>
	 * <td align="left">Rating Note Version does not exists.</td>
	 * </tr>
	 * </table>
	 * <p>
	 * 
	 * @param pRatingCarrierFindRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingCarrierFindRequest
	 *            RatingCarrierFindRequest}</code><br>
	 *            includes the attributes to find a <code>Rate Source </code>.
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingCarrierFindRequest#setRateCarrierCode
	 *            rateCarrierCode} - (C)</code>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingCarrierResponse
	 *         RatingCarrierResponse}</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields}</code><br>
	 *         holds the CodeMessage <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto. RatingCarrierResponse#getRatingCarrierDto()
	 *         ratingCarrierDto} - (1:*)</code>
	 *         </ul>
	 * @throws LMSException
	 *             If the validation fails, above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code, human
	 *             readable message, and message type.
	 */
	RatingCarrierResponse findRateSourceCarrier(
			RatingCarrierFindRequest pRatingCarrierFindRequest)
			throws LMSException;

	/**
	 * Updates,delete and add the Rate Source hierarchy for a carrier.
	 * <p>
	 * This method returns a RateSource along with its hierarchy.
	 * <p>
	 * To upadte,delete and add user must provide following input:<br>
	 * <li>ratingCarrierDto.<br>
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
	 * .MessageConstants#RATING_CARRIER_NOT_EXISTS}</code></td>
	 * <td align="left">Rating Note Version does not exists.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#RATING_CARRIER_CARRIER_CODE_MANDATORY}</code></td>
	 * <td align="left">Rating Note is marked for deletion.</td>
	 * </tr>
	 * </table>
	 * <p>
	 * 
	 * @param pRatingCarrierPersistRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingCarrierPersistRequest
	 *            RatingCarrierPersistRequest}</code><br>
	 *            includes the attributes to find a <code>Rate Source </code>.
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingCarrierPersistRequest#setRatingCarrierDto
	 *            ratingCarrierDto} - (C)</code>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingCarrierResponse
	 *         RatingCarrierResponse}</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields}</code><br>
	 *         holds the CodeMessage <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto. RatingCarrierResponse#getRatingCarrierDto()
	 *         ratingCarrierDto} - (1:*)</code>
	 *         </ul>
	 * @throws LMSException
	 *             If the validation fails, above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code, human
	 *             readable message, and message type.
	 */
	RatingCarrierResponse updateRateSourceHierarchy(
			RatingCarrierPersistRequest pRatingCarrierPersistRequest)
			throws LMSException;

}
