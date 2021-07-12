/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.RatingNoteDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.RatingNoteFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.RatingNotePersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.RatingNotePurgeRequest;
import com.unisys.trans.logistics.lms.rating.dto.RatingNoteResponse;
import com.unisys.trans.logistics.lms.rating.dto.RatingNoteRestoreRequest;

/**
 * <code>RatingNoteService</code> provides the functional methods to maintain
 * rating note information.
 * <p>
 * The rating note information maintains<br>
 * <ul>
 * <li>The rating description needed for AWB pricing.
 * <li>The effective period of rating note.
 * </ul>
 * <p>
 * It offers the following services for maintaining rating note information:<br>
 * <ul>
 * <li>createRatingNote - Creates rating note information.
 * <li>createRatingNoteVersion - Creates a rating note version for a rating
 * note.
 * <li>deleteRatingNote - Deletes rating note information.
 * <li>findRatingNote - Finds rating note information for the given rating note.
 * <li>purgeRatingNoteVersion - Purges a rating note version for a given rating
 * note.
 * <li>restoreRatingNote - Restores the deleted rating note information.
 * <li>updateRatingNoteVersion - Updates a rating note version for a given
 * rating note.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.RatingNoteDeleteRequest
 *      RatingNoteDeleteRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RatingNoteFindRequest
 *      RatingNoteFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RatingNotePersistRequest
 *      RatingNotePersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RatingNotePurgeRequest
 *      RatingNotePurgeRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RatingNoteRestoreRequest
 *      RatingNoteRestoreRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RatingNoteResponse
 *      RatingNoteResponse
 */
public interface RatingNoteService {

	/**
	 * Creates the <code>RatingNote</code>.
	 * <p>
	 * This method validates the input, once validation is passed then checks
	 * for rating note duplicate with existing rating rating, then it will
	 * validates the effective date range from today's date. Then finally create
	 * a rating note and returns the assembled rating note.<br>
	 * <p>
	 * <b> Related methods include:</b><br>
	 * {@link com.unisys.trans.logistics.lms.rating.contract.RatingNoteService#createRatingNoteVersion
	 * createRatingNoteVersion}<br>
	 * <p>
	 * <b>Run Time Parameters:</b><br>
	 * <li>
	 * {@link com.unisys.trans.logistics.lms.framework.constants. ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
	 * <p>
	 * <br>
	 * <b>To create the RatingNote user must provide following input:</b><br>
	 * <li>Rating Note Format.<br>
	 * <li>Rating Note Code.<br>
	 * <li>Carrier Code.<br>
	 * <li>IATA Resolution Number. <br>
	 * <li>Description. <br>
	 * <li>Effective Date. <br>
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
	 * MessageConstants#RATING_NOTE_ALREADY_EXIST RATING_NOTE_ALREADY_EXIST}</code>
	 * </td>
	 * <td align="left">The Rating Note entry must not be duplicate.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#EFFECTIVEDATE_GREATER_THAN_CURRENT_SYSTEMDATE EFFECTIVEDATE_GREATER_THAN_CURRENT_SYSTEMDATE}</code>
	 * </td>
	 * <td align="left">The Effective Date must be greater than the current
	 * system date.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#EFFECTIVE_DATE_GREATER_THAN_OR_EQUAL_TO_CURRENT_SYSTEM_DATE EFFECTIVE_DATE_GREATER_THAN_OR_EQUAL_TO_CURRENT_SYSTEM_DATE}</code>
	 * </td>
	 * <td align="left">The Effective Date must be greater than or equal to the
	 * current system date.</td>
	 * </tr>
	 * </table>
	 * <p>
	 * 
	 * @param pRatingNotePersistRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingNotePersistRequest
	 *            RatingNotePersistRequest}</code><br>
	 *            includes the attributes to create a <code>RatingNote </code>.
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto
	 *            RatingNote} - (M)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingNoteDto#setCarrierCode
	 *            carrierCode} - (C)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto. DateRangeDto#setEffectiveDate
	 *            effectiveDate} - (M)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingNoteVersionDto#setIataResolutionNumber
	 *            iataResolutionNumber} - (C) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingNoteDto#setRatingNoteCode
	 *            ratingNoteCode} - (M) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingNoteVersionDto#setDescription
	 *            description} - (M)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingNoteDto#setOId
	 *            oId} - (C)</code> <br>
	 *            Prohibited for create operation. <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto. PersistenceObjectDto#setVersion
	 *            version} -(C)</code><br>
	 *            Prohibited for create operation.
	 *            </ul>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteResponse
	 *         RatingNoteResponse}</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields}</code><br>
	 *         holds the CodeMessage <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.constants. MessageConstants#RATING_NOTE_CREATED
	 *         RATING_NOTE_CREATED} </code> <br>
	 *         <code>for successful create.</code> <li><code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto. RatingNoteResponse#getRatingNoteDto()
	 *         RatingNoteDto} - (1:*)</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto
	 *         RatingNoteDto}</code>
	 *         </ul>
	 *         </ul>
	 * @throws LMSException
	 *             If the validation fails, above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code, human
	 *             readable message, and message type.
	 */

	RatingNoteResponse createRatingNote(
			RatingNotePersistRequest pRatingNotePersistRequest)
			throws LMSException;

	/**
	 * Creates the <code>RatingNote Version</code>for a rating note.
	 * <p>
	 * This method validates the input, once validation is passed then checks
	 * for rating note is exist and not marked for deletion, then it will
	 * validates the effective date range from today's date and previous version
	 * end date.Then finally add a rating note version to the rating note and
	 * returns the assembled rating note.<br>
	 * <p>
	 * <b> Related methods include:</b><br>
	 * {@link com.unisys.trans.logistics.lms.rating.contract. RatingNoteService#createRatingNote
	 * createRatingNote}<br>
	 * {@link com.unisys.trans.logistics.lms.rating.contract. RatingNoteService#updateRatingNoteVersion
	 * updateRatingNoteVersion}<br>
	 * {@link com.unisys.trans.logistics.lms.rating.contract. RatingNoteService#purgeRatingNoteVersion
	 * purgeRatingNoteVersion}<br>
	 * <p>
	 * <b>Run Time Parameters:</b><br>
	 * <li>
	 * {@link com.unisys.trans.logistics.lms.framework.constants. ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
	 * <p>
	 * <br>
	 * <p>
	 * To create the RatingNote user must provide following input:<br>
	 * <li>Rating Note Format.<br>
	 * <li>Rating Note Code.<br>
	 * <li>Carrier Code.<br>
	 * <li>IATA Resolution Number. <br>
	 * <li>Description. <br>
	 * <li>Effective Date. <br>
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
	 * <b>Errors:</b> <br>
	 * <b>The following Error Codes may be returned :</b>
	 * <table border="1" cell spacing="0" * cell padding="5">
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#RATING_NOTE_NOMORE_EXISTS RATING_NOTE_NOMORE_EXISTS}</code>
	 * </td>
	 * <td align="left">Rating Note does not exists.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#RATING_NOTE_MARKED_DELETION RATING_NOTE_MARKED_DELETION}</code>
	 * </td>
	 * <td align="left">Rating Note is marked for deletion.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#EFFECTIVEDATE_GREATER_THAN_CURRENT_SYSTEMDATE
	 *  EFFECTIVEDATE_GREATER_THAN_CURRENT_SYSTEMDATE}</code></td>
	 * <td align="left">The Effective Date must be greater than the current
	 * system date.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#EFFECTIVE_DATE_GREATER_THAN_OR_EQUAL_TO_CURRENT_
	 * SYSTEM_DATE EFFECTIVE_DATE_GREATER_THAN_OR_EQUAL_TO_CURRENT_SYSTEM_DATE}</code>
	 * </td>
	 * <td align="left">The Effective Date must be greater than or equal to the
	 * current system date.</td>
	 * </tr>
	 * </table>
	 * <p>
	 * 
	 * @param pRatingNotePersistRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNotePersistRequest
	 *            RatingNotePersistRequest}</code><br>
	 *            includes the attributes to create a <code>RatingNote </code>.
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto
	 *            RatingNote} - (M)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingNoteDto#setCarrierCode
	 *            carrierCode} - (C)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto. DateRangeDto#setEffectiveDate
	 *            effectiveDate} - (M)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingNoteVersionDto#setIataResolutionNumber
	 *            iataResolutionNumber} - (C) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingNoteDto#setRatingNoteCode
	 *            ratingNoteCode} - (M) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingNoteVersionDto#setDescription
	 *            description} - (M)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto. RatingNoteDto#setOId
	 *            oId} - (C)</code> <br>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto. PersistenceObjectDto#setVersion
	 *            version} -(C) Prohibited for create operation.
	 *            </ul>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteResponse
	 *         RatingNoteResponse}</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields}</code><br>
	 *         holds the CodeMessage <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.constants. MessageConstants#RATING_NOTE_NEW_VERSION_CREATED
	 *         RATING_NOTE_NEW_VERSION_CREATED} </code> <br>
	 *         <code>for successful create.</code> <li><code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto. RatingNoteResponse#getRatingNoteDto()
	 *         RatingNoteDto} - (1:*)</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto
	 *         RatingNoteDto}</code>
	 *         </ul>
	 *         </ul>
	 * @throws LMSException
	 *             If the validation fails, above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code, human
	 *             readable message, and message type.
	 */

	RatingNoteResponse createRatingNoteVersion(
			RatingNotePersistRequest pRatingNotePersistRequest)
			throws LMSException;

	/**
	 * Deletes the RatingNote.
	 * <p>
	 * This method validates the input, once validation is passed then checks
	 * for rating note is exist and not marked for deletion, then it will marks
	 * the rating note as deleted and returns the assembled rating note.<br>
	 * <p>
	 * <b> Related methods include:</b><br>
	 * {@link com.unisys.trans.logistics.lms.rating.contract.RatingNoteService#restoreRatingNote
	 * restoreRatingNote}<br>
	 * <p>
	 * To delete the RatingNote user must provide following input:<br>
	 * <li>Rating Note Format.<br>
	 * <li>Rating Note Code.<br>
	 * <li>Carrier Code.<br>
	 * <li>IATA Resolution Number. <br>
	 * <li>Description. <br>
	 * <li>DeletionDate. <br>
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
	 * MessageConstants#RATING_NOTE_NOMORE_EXISTS RATING_NOTE_NOMORE_EXISTS}</code>
	 * </td>
	 * <td align="left">Rating Note does not exists.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#RATING_NOTE_MARKED_DELETION RATING_NOTE_MARKED_DELETION}</code>
	 * </td>
	 * <td align="left">Rating Note is marked for deletion.</td>
	 * </tr>
	 * </table>
	 * <p>
	 * 
	 * @param pRatingNoteDeleteRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDeleteRequest
	 *            RatingNoteDeleteRequest}</code><br>
	 *            includes the attributes to delete a <code>RatingNote </code>.
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto
	 *            RatingNote} - (M)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setCarrierCode
	 *            carrierCode} - (C)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setRatingNoteFormat
	 *            ratingNoteFormat} - (M)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setDeletionDate
	 *            deletionDate} - (M)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setRatingNoteCode
	 *            ratingNoteCode} - (M) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setOId
	 *            oId} - (M)</code> <br>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
	 *            version} -(C) Prohibited for create operation.
	 *            </ul>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteResponse
	 *         RatingNoteResponse}</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields}</code><br>
	 *         holds the CodeMessage <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.constants. MessageConstants#RATING_NOTE_MARKED_DELETION
	 *         RATING_NOTE_MARKED_DELETION} </code> <br>
	 *         <code>for successful delete.</code> <li><code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteResponse#getRatingNoteDto()
	 *         RatingNoteDto} - (1:*)</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto
	 *         RatingNoteDto}</code>
	 *         </ul>
	 *         </ul>
	 * @throws LMSException
	 *             If the validation fails, above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code, human
	 *             readable message, and message type.
	 */
	RatingNoteResponse deleteRatingNote(
			RatingNoteDeleteRequest pRatingNoteDeleteRequest)
			throws LMSException;

	/**
	 * Finds the RatingNote.
	 * <p>
	 * This method validates the input, once validation is passed then checks
	 * for rating note is exist and also checks for rating note version
	 * availability with respect to date filter, then it will return the
	 * assembled rating note along with marked for deletion message if rating
	 * note is marked for deletion.<br>
	 * <p>
	 * To find the RatingNote user must provide following input:<br>
	 * <li>Rating Note Format.<br>
	 * <li>Rating Note Code.<br>
	 * <li>Carrier Code.<br>
	 * <li>Date. <br>
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
	 * MessageConstants#RATING_NOTE_NOT_EXISTS RATING_NOTE_NOT_EXISTS}</code></td>
	 * <td align="left">Rating Note does not exists.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants
	 * .MessageConstants#RATING_NOTE_VERSION_NOT_EXISTS RATING_NOTE_VERSION_NOT_EXISTS}</code>
	 * </td>
	 * <td align="left">Rating Note Version does not exists.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#RATING_NOTE_MARKED_DELETION RATING_NOTE_MARKED_DELETION}</code>
	 * </td>
	 * <td align="left">Rating Note is marked for deletion.</td>
	 * </tr>
	 * </table>
	 * <p>
	 * 
	 * @param pRatingNoteVersionFindRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteVersionFindRequest
	 *            RatingNoteVersionFindRequest}</code><br>
	 *            includes the attributes to find a <code>RatingNote </code>.
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto
	 *            RatingNote} - (M)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setCarrierCode
	 *            carrierCode} - (C)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setRatingNoteFormat
	 *            ratingNoteFormat} - (M)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setDate
	 *            date} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setRatingNoteCode
	 *            ratingNoteCode} - (M) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setOId
	 *            oId} - (C)</code> <br>
	 *            Prohibited for create operation. <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
	 *            version} -(C)</code><br>
	 *            Prohibited for create operation.
	 *            </ul>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteResponse
	 *         RatingNoteResponse}</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields}</code><br>
	 *         holds the CodeMessage <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteResponse#getRatingNoteDto()
	 *         RatingNoteDto} - (1:*)</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto
	 *         RatingNoteDto}</code>
	 *         </ul>
	 *         </ul>
	 * @throws LMSException
	 *             If the validation fails, above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code, human
	 *             readable message, and message type.
	 */
	RatingNoteResponse findRatingNote(
			RatingNoteFindRequest pRatingNoteVersionFindRequest)
			throws LMSException;

	/**
	 * Purge the Rating Note Version of a rating note.
	 * <p>
	 * This method validates the input, once validation is passed then checks
	 * for rating note is exist and not marked for deletion, then it will
	 * validates for rating note version presence and checks for not purging
	 * last version.Then finally remove a rating note version from the rating
	 * note and returns the assembled rating note.<br>
	 * <li>
	 * {@link com.unisys.trans.logistics.lms.rating.contract.RatingNoteService#deleteRatingNote
	 * deleteRatingNote}
	 * <li>
	 * {@link com.unisys.trans.logistics.lms.rating.contract.RatingNoteService#updateRatingNoteVersion
	 * updateRatingNoteVersion}<br>
	 * <li>
	 * {@link com.unisys.trans.logistics.lms.rating.contract.RatingNoteService#purgeRatingNoteVersion
	 * purgeRatingNoteVersion}<br>
	 * <p>
	 * To purge RatingNote user must provide following input:<br>
	 * <li>OId. <br>
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
	 * MessageConstants#RATING_NOTE_NOMORE_EXIXTS RATING_NOTE_NOMORE_EXISTS}</code>
	 * </td>
	 * <td align="left">Rating Note Version does not exists.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#RATING_NOTE_MARKED_DELETION RATING_NOTE_MARKED_DELETION}</code>
	 * </td>
	 * <td align="left">Rating Note is marked for deletion.</td>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#RATING_NOTE_ATLEAST_ONE_VERSION RATING_NOTE_ATLEAST_ONE_VERSION}</code>
	 * </td>
	 * <td align= "left">Only one version exists for the input rating note.
	 * Delete the rating note with a Deletion Date to mark the entire rating
	 * note for deletion.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#RATING_NOTE_VERSION_NOT_EXISTS RATING_NOTE_VERSION_NOT_EXISTS}</code>
	 * </td>
	 * <td align= "left">Rating Note Version does not exists.</td>
	 * </tr>
	 * </table>
	 * <p>
	 * 
	 * @param pRatingNotePurgeRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNotePurgeRequest
	 *            RatingNotePurgeRequest}</code><br>
	 *            includes the attributes to purge a <code>RatingNote </code>.
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto
	 *            RatingNote} - (M)</code>
	 *            <ul>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setOId
	 *            oId} - (M) <br>
	 *            Prohibited for create operation. <li>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
	 *            version} -(C) Prohibited for create operation.
	 *            </ul>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteResponse
	 *         RatingNoteResponse}</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields}</code><br>
	 *         holds the CodeMessage <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.constants. MessageConstants#RATING_NOTE_VERSION_PURGED
	 *         RATING_NOTE_VERSION_PURGED} </code> <br>
	 *         <code>for successful purge.</code> <li><code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteResponse#getRatingNoteDto()
	 *         RatingNoteDto} - (1:*)</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto
	 *         RatingNoteDto}</code>
	 *         </ul>
	 *         </ul>
	 * @throws LMSException
	 *             If the validation fails, above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code, human
	 *             readable message, and message type.
	 */

	RatingNoteResponse purgeRatingNoteVersion(
			RatingNotePurgeRequest pRatingNotePurgeRequest) throws LMSException;

	/**
	 * Restores the RatingNote.
	 * <p>
	 * This method validates the input, once validation is passed then checks
	 * for rating note is exist and marked for deletion, then it will restores
	 * the rating note and returns the assembled rating note.<br>
	 * 
	 * <li>
	 * {@link com.unisys.trans.logistics.lms.rating.contract. RatingNoteService#deleteRatingNote(RatingNoteDeleteRequest)
	 * deleteRatingNote}
	 * <p>
	 * To restore RatingNote user must provide following input:<br>
	 * <li>OId. <br>
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
	 * MessageConstants#RATING_NOTE_NOT_EXISTS RATING_NOTE_NOT_EXISTS}</code></td>
	 * <td align="left">Rating Note does not exists.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#RATING_NOTE_MARKED_DELETION RATING_NOTE_MARKED_DELETION}</code>
	 * </td>
	 * <td align="left">Rating Note is marked for deletion.</td>
	 * </table>
	 * <p>
	 * 
	 * @param pRatingNoteRestoreRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteRestoreRequest
	 *            RatingNoteRestoreRequest}</code><br>
	 *            includes the attributes to restore a <code>RatingNote </code>.
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto
	 *            RatingNote} - (M)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setCarrierCode
	 *            carrierCode} - (C)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setRatingNoteFormat
	 *            ratingNoteFormat} - (M)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setRatingNoteCode
	 *            ratingNoteCode} - (M) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setOId
	 *            oId} - (C)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
	 *            version} -(C)</code><br>
	 *            Prohibited for create operation.
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteResponse
	 *         RatingNoteResponse}</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields}</code><br>
	 *         holds the CodeMessage <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.constants. MessageConstants#RATING_NOTE_RESTORED
	 *         RATING_NOTE_RESTORED} </code> <br>
	 *         <code>for successful restore.</code> <li><code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteResponse#getRatingNoteDto()
	 *         RatingNoteDto} - (1:*)</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto
	 *         RatingNoteDto}</code>
	 *         </ul>
	 *         </ul>
	 * @throws LMSException
	 *             If the validation fails, above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code, human
	 *             readable message, and message type.
	 */
	RatingNoteResponse restoreRatingNote(
			RatingNoteRestoreRequest pRatingNoteRestoreRequest)
			throws LMSException;

	/**
	 * Updates the RatingNoteVersion.
	 * <p>
	 * This method validates the input, once validation is passed then checks
	 * for rating note is exist and not marked for deletion, then it will
	 * validates the effective date range from today's date, previous version
	 * end date and date overlap check with previous and next version.Then
	 * finally update a rating note version to the rating note and returns the
	 * assembled rating note.<br>
	 * <p>
	 * <b> Related methods include:</b><br>
	 * {@link com.unisys.trans.logistics.lms.rating.contract.RatingNoteService#createRatingNote
	 * createRatingNote}<br>
	 * {@link com.unisys.trans.logistics.lms.rating.contract.RatingNoteService#createRatingNoteVersion
	 * updateRatingNoteVersion}<br>
	 * {@link com.unisys.trans.logistics.lms.rating.contract.RatingNoteService#purgeRatingNoteVersion
	 * purgeRatingNoteVersion}<br>
	 * <p>
	 * <b>Run Time Parameters:</b><br>
	 * <li>
	 * {@link com.unisys.trans.logistics.lms.framework.constants. ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
	 * <p>
	 * <br>
	 * To update RatingNoteVersion user must provide following input:<br>
	 * <li>OId. <br>
	 * <li>RatingNoteFormat. <br>
	 * <li>RatingNoteCode.<br>
	 * <li>CarrierCode. <br>
	 * <li>IATAResolutionNumber. <br>
	 * <li>Description.<br>
	 * <li>EffectiveDate.<br>
	 * <li>ExpirationDate.<br>
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
	 * MessageConstants#RATING_NOTE_NOT_EXISTS RATING_NOTE_NOT_EXISTS}</code></td>
	 * <td align="left">Rating Note does not exists.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#RATING_NOTE_MARKED_DELETION RATING_NOTE_MARKED_DELETION}</code>
	 * </td>
	 * <td align="left">Rating Note is marked for deletion.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#EFFECTIVEDATE_GREATER_THAN_CURRENT_SYSTEMDATE EFFECTIVEDATE_GREATER_THAN_CURRENT_SYSTEMDATE}</code>
	 * </td>
	 * <td align="left">The Effective Date must be greater than the current
	 * system date.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#EFFECTIVE_DATE_GREATER_THAN_OR_EQUAL_TO_CURRENT_SYSTEM_DATE EFFECTIVE_DATE_GREATER_THAN_OR_EQUAL_TO_CURRENT_SYSTEM_DATE}</code>
	 * </td>
	 * <td align="left">The Effective Date must be greater than or equal to the
	 * current system date.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#EFFECTIVE_LESSER_THAN_PREV_VERSION_EFFECTIVE EFFECTIVE_LESSER_THAN_PREV_VERSION_EFFECTIVE}</code>
	 * </td>
	 * <td align="left">The Effective Date must be greater than Previous version
	 * Effective Date.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#EXPIRY_GREATER_THAN_NEXT_VERSION_EXPIRY EXPIRY_GREATER_THAN_NEXT_VERSION_EXPIRY}</code>
	 * </td>
	 * <td align="left">The Expiration Date must be less than Next version
	 * Expiration Date.</td>
	 * </tr>
	 * </table>
	 * <p>
	 * 
	 * @param pRatingNotePersistRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNotePersistRequest
	 *            RatingNotePersistRequest}</code><br>
	 *            includes the attributes to update a <code>RatingNoteVersion
	 *            </code>.
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto
	 *            RatingNote} - (M)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setCarrierCode
	 *            carrierCode} - (C)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setRatingNoteFormat
	 *            ratingNoteFormat} - (M)</code> <br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setRatingNoteCode
	 *            ratingNoteCode} - (O)</code> <br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setEffectiveDate
	 *            effectiveDate} - (O)</code> <br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteVersionDto#setIataResolutionNumber
	 *            iataResolutionNumber} - (C)</code> <br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setExpirationDate
	 *            expirationDate} - (O)</code> <br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setOId
	 *            oId} - (C) </code> <br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteVersionDto#setDescription
	 *            description} - (O)</code> <br>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
	 *            version} -(C)<br>
	 *            Prohibited for create operation.
	 *            </ul>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteResponse
	 *         RatingNoteResponse}</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields}</code><br>
	 *         holds the CodeMessage <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.constants. MessageConstants#RATING_NOTE_VERSION_UPDATED
	 *         RATING_NOTE_VERSION_UPDATED} </code> <br>
	 *         <code>for successful update.</code> <li><code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteResponse#getRatingNoteDto()
	 *         RatingNoteDto} - (1:*)</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto
	 *         RatingNoteDto}</code>
	 *         </ul>
	 *         </ul>
	 * @throws LMSException
	 *             If the validation fails, above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code, human
	 *             readable message, and message type.
	 */
	RatingNoteResponse updateRatingNoteVersion(
			RatingNotePersistRequest pRatingNotePersistRequest)
			throws LMSException;

	/**
	 * Updates the Rating note Information.
	 * <p>
	 * This method validates the input, once validation is passed then checks
	 * for rating note is exist and not marked for deletion.<br>
	 * <p>
	 * <b> Related methods include:</b><br>
	 * {@link com.unisys.trans.logistics.lms.rating.contract.RatingNoteService#updateRatingNoteVersion
	 * updateRatingNoteVersion}<br>
	 * <p>
	 * <br>
	 * To update RatingNoteVersion user must provide following input:<br>
	 * <li>OId. <br>
	 * <li>RatingNoteFormat. <br>
	 * <li>RatingNoteCode.<br>
	 * <li>CarrierCode. <br>
	 * <li>RetainIndicator.<br>
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
	 * MessageConstants#RATING_NOTE_NOT_EXISTS RATING_NOTE_NOT_EXISTS}</code></td>
	 * <td align="left">Rating Note does not exists.</td>
	 * </tr>
	 * <tr>
	 * <td align="left">
	 * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
	 * MessageConstants#RATING_NOTE_MARKED_DELETION RATING_NOTE_MARKED_DELETION}</code>
	 * </td>
	 * <td align="left">Rating Note is marked for deletion.</td>
	 * </tr>
	 * </table>
	 * <p>
	 * 
	 * @param pRatingNotePersistRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNotePersistRequest
	 *            RatingNotePersistRequest}</code><br>
	 *            includes the attributes to update a <code>RatingNoteVersion
	 *            </code>.
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto
	 *            RatingNote} - (M)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setCarrierCode
	 *            carrierCode} - (C)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setRatingNoteFormat
	 *            ratingNoteFormat} - (M)</code> <br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setRatingNoteCode
	 *            ratingNoteCode} - (O)</code> <br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto#setOId
	 *            oId} - (C) </code> <br>
	 *            </ul>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteResponse
	 *         RatingNoteResponse}</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields}</code><br>
	 *         holds the CodeMessage <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.constants. MessageConstants#RATING_NOTE_IS_UPDATED
	 *         RATING_NOTE_IS_UPDATED} </code> <br>
	 *         <code>for successful update.</code> <li><code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteResponse#getRatingNoteDto()
	 *         RatingNoteDto} - (1:*)</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto
	 *         RatingNoteDto}</code>
	 *         </ul>
	 *         </ul>
	 * @throws LMSException
	 *             If the validation fails, above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code, human
	 *             readable message, and message type.
	 */
	RatingNoteResponse updateRatingNote(
			RatingNotePersistRequest pRatingNotePersistRequest)
			throws LMSException;

}
