/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdPersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdPurgeRequest;
import com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse;
import com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdRestoreRequest;

/**
 * * <code>ClassRatingIDServiceImpl</code> provides the functional methods to
 * maintain ClassRatingID information.
 * <p>
 * <ul>
 * <li>ClassRatingId is a description of a specific class of cargo.
 * <li>This specific class of cargo is used with ClassRatingRules.
 * <li>This has the following functions:
 * </ul>
 * <p>
 * It offers the following services for maintaining ClassRatingId information:<br>
 * <ul>
 * <li>findClassRatingId - finds the ClassRatingId details for the given ClassRatingID Code.
 * <li>createClassRatingId - Creates the ClassRatingId Information.
 * <li>deleteClassRatingId - Deletes the ClassRatingId Information.
 * <li>restoreClassRatingId - Restores the ClassRatingId Information.
 * <li>createClassRatingIdVersion - Creates the ClassRatingId version Information.
 * <li>updateClassRatingIdVersion - Updates the ClassRatingId version Information.
 * <li>purgeClassRatingIdVersion - Purges the ClassRatingId version Information.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdPersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdDeleteRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdRestoreRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse
 */
public interface ClassRatingIdService {

    /**
     * Creates the <code>ClassRatingId</code> information after validating all
     * the input data.
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
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants# EFFECTIVEDATE_GREATER_THAN_CURRENT_SYSTEMDATE}</td>
     *            <td>The Effective Date must be greater than the current system date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants# EFFECTIVE_DATE_GREATER_THAN_OR_EQUAL_TO_CURRENT_SYSTEM_DATE}</td>
     *            <td>The Effective Date must be greater than or equal to the
     *             current system date if the Run Time Parameter#ALLOWABLE_EFFECTIVE_DATE is 1.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#INPUT_CLASS_RATING_ID_ALREADY_EXISTS}</td>
     *            <td>The input Class Rating ID already exists in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants# CLASS_RATING_ID_CREATED_SUCCESSFULLY}</td>
     *            <td>The class rating ID is created.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pClassRatingIdPersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdPersistRequest} </code><br>
     *            holds the request object that includes attributes to create a
     *            classratingid.<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdDto
     *            ClassRatingIdDto} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdDto#setClassRatingId
     *            classRatingId} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdVersionDto
     *            ClassRatingIdVersionDto} -(M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdVersionDto#setDescription
     *            description} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdVersionDto#setClassification
     *            classification} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdVersionDto. DateRangeDto#setEffectiveDate
     *            effectiveDate} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdVersionDto. DateRangeDto#setExpirationDate
     *            expirationDate} - (O)</code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse
     *         ClassRatingIdResponse}<ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse#getClassRatingIds
     *         ClassRatingIds} </ul> </code>
     *         <p>
     * @throws LMSException
     *             If the ClassRatingId create operation fails the above mentioned error codes are returned.
     *             Each CodeMessage contains the status code, human readable message and message type.
     */

    ClassRatingIdResponse createClassRatingId(
                ClassRatingIdPersistRequest pClassRatingIdPersistRequest)
                throws LMSException;

    /**
     * Creates the <code>ClassRatingIdVersion</code> information after
     * validating the input data.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
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
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <br>
     * <code>
     *  <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#INPUT_CLASS_RATING_ID_DOES_NOT_EXIST}</td>
     *            <td>The input ClassRatingId does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#EFFECTIVEDATE_GREATER_THAN_CURRENT_SYSTEMDATE}</td>
     *            <td>The Effective Date must be greater than the current system date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CLASS_RATING_ID_MARKED_FOR_DELETION}</td>
     *            <td>The class rating ID is marked for deletion.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#EFFECTIVE_LESSER_THAN_PREV_VERSION_EFFECTIVE}</td>
     *            <td>The Effective Date must be greater than Previous version Effective Date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants# CLASS_RATING_ID_VERSION_CREATED_SUCCESSFULLY}</td>
     *            <td>New version for the class rating ID is created.</td>
     *            </tr>
     *            <tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pClassRatingIdPersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdPersistRequest
     *            ClassRatingIdPersistRequest}</code> holds the request object
     *            that includes attributes to create a ClassRatingId version
     *            details.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdPersistRequestt#setClassRatingId
     *            ClassRatingId} - (M)</code>
     *            <ul>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdDto#setDeletionDate
     *            deletionDate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdDto#setClassRatingId
     *            classRatingId} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdVersionDto#setClassification
     *            classification} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdVersionDto#setDescription
     *            description} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdVersionDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdVersionDto#setExpirationDate
     *            expirationDate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdVersionDto#setOId
     *            oId} - (C) </code><br>
     *            Prohibited for create operation.<br>
     * 
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse
     *         ClassRatingIdResponse}<br> <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse#getClassRatingIds
     *         ClassRatingIds} - (1:*) </ul> </code>
     *         <p>
     * @throws LMSException
     *             If the ClassRatingIdVersion create operation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    ClassRatingIdResponse createClassRatingIdVersion(
                ClassRatingIdPersistRequest pClassRatingIdPersistRequest)
                throws LMSException;

    /**
     * Deletes the <code>ClassRatingId</code> information after validating the
     * input data.
     * <p>
     * <b>Related Methods :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.
     * ClassRatingIdService#restoreClassRatingId RestoreClassRatingId}
     * </ul>
     * </code>
     * <p>
     * ClassRatingId is marked for deletion on the specified <code>deletionDate</code>.
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
     * <code></code><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#INPUT_CLASS_RATING_ID_DOES_NOT_EXIST}</td>
     *            <td>ClassRatingId does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#DELETION_DATE_FOR_DELETING_CLASS_RATING_ID_MADANTORY}</td>
     *            <td>The Deletion Date is mandatory for Delete action.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#INPUT_DELETION_DATE_INVALID}</td>
     *            <td>The Deletion Date must be today or later.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CLASS_RATING_ID_MARKED_FOR_DELETION}</td>
     *            <td>The class rating ID is marked for deletion.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pClassRatingIdDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdDeleteRequest
     *            ClassRatingIdDeleteRequest}</code> holds the information to
     *            find and mark a ClassRatingId as 'Deleted'.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdDeleteRequest#setClassRatingId
     *            ClassRatingId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdDeleteRequest#setDeletionDate
     *            ddeletionDate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdDeleteReques#setOId
     *            oId} - (M) </code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse
     *         ClassRatingIdResponse}<br> <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse#getClassRatingIds
     *         ClassRatingIds} - (0:1) </ul> </code>
     *         <p>
     * @throws LMSException
     *             If the ClassRatingId delete operation fails the above
     *             mentioned error codes are returned. Each CodeMessage contains
     *             the status code, human readable message and message type.
     */

    ClassRatingIdResponse deleteClassRatingId(
                ClassRatingIdDeleteRequest pClassRatingIdDeleteRequest)
                throws LMSException;

    /**
     * Retrieves all the <code>ClassRatingId</code> information currently
     * defined in the system.<br>
     * ClassRatingId marked for deletion are also returned in the list of all
     * ClassRatingIds.
     * <p>
     * <b>Related Method :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.
     * ClassRatingIdService#findClassRatingId findClassRatingId}
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
     * @param pClassRatingIdFindRequest
     *            <code>pClassRatingIdFindRequest</code> is a dummy parameter
     *            ,given to satisfy the LMSNG convention.
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse
     *         ClassRatingIdResponse} </code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse#getClassRatingIds()
     *         ClassRatingIds} - (0:*)</code><br>
     *         holds the list of <code>ClassRatingIdDto</code> objects.
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If the <code>ClassRatingId</code> information does not exist
     *             the above mentioned error codes are returned. Each <code>CodeMessage</code> contains the
     *             status code, human
     *             readable message and message type.
     */
    ClassRatingIdResponse findAllClassRatingIds(
                final ClassRatingIdFindRequest pClassRatingIdFindRequest)
                throws LMSException;

    /**
     * Retrieves the <code>ClassRatingId</code> information for the given <code>ClassRatingId</code> code.<br>
     * <p>
     * <b>Related Method :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.
     * RateTypeService#findAllClassRatingIds findAllClassRatingIds}
     * </ul>
     * </code> <b>Release Notes:</b> <br>
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
     *            MessageConstants#INPUT_CLASS_RATING_ID_DOES_NOT_EXIST}</td>
     *            <td>ClassRatingId does not exist.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pClassRatingIdFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdFindRequest
     *            ClassRatingIdFindRequest}</code> holds the request Object that
     *            contains the <code>ClassRatingId</code> code.
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse
     *         ClassRatingIdResponse} </code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse#getClassRatingIds()
     *         ClassRatingId} - (0:1)</code><br>
     *         holds the <code>ClassRatingIdDto</code> object.
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If the <code>getClassRatingId</code> information does not
     *             exist the above mentioned error codes are returned. Each <code>CodeMessage</code> contains
     *             the status code, human
     *             readable message and message type.
     */
    ClassRatingIdResponse findClassRatingId(
                ClassRatingIdFindRequest pClassRatingIdFindRequest)
                throws LMSException;
	ClassRatingIdResponse findClassRatingIdInfo(
			ClassRatingIdFindRequest pClassRatingIdFindRequest)
			throws LMSException;

    /**
     * Purges the <code>ClassRatingIdVersion</code> information after validating
     * the input data.
     * <p>
     * <b>Related Methods :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.
     * ClassRatingIdService#deleteClassRatingIdVersion deleteClassRatingIdVersion}
     * </ul>
     * </code>
     * <p>
     * If ClassRatingId is marked for deletion on the specified <code>deletionDate</code>Purge cannot be able
     * to do.
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
     * <code></code><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5" width="80%">
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#INPUT_CLASS_RATING_ID_DOES_NOT_EXIST}</td>
     *            <td>The input Class Rating ID does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CLASS_RATING_ID_MARKED_FOR_DELETION}</td>
     *            <td>The class rating ID is marked for deletion.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#INPUT_DELETION_DATE_INVALID}</td>
     *            <td>The Deletion Date must be today or later.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CLASS_RATING_ID_VERSION_PURGED_SUCCESSFULLY}</td>
     *            <td> The class rating ID version is purged.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pClassRatingIdPurgeRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdPurgeRequest
     *            ClassRatingIdPurgeRequest}</code> holds the information to
     *            find and mark a ClassRatingId as 'Deleted'. if it is marked
     *            for deletion, purge cannot be done.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. ClassRatingIdPurgeRequest#setClassRatingId
     *            ClassRatingId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. ClassRatingIdPurgeRequest#setOId
     *            oId} - (M) </code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse
     *         ClassRatingIdResponse}<br> <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse#getClassRatingIds
     *         ClassRatingIds} - (0:1) </ul> </code>
     *         <p>
     * @throws LMSException
     *             If the ClassRatingId purge operation fails the above
     *             mentioned error codes are returned. Each CodeMessage contains
     *             the status code, human readable message and message type.
     */

    ClassRatingIdResponse purgeClassRatingIdVersion(
                ClassRatingIdPurgeRequest pClassRatingIdPurgeRequest)
                throws LMSException;

    /**
     * Restores the <code>ClassRatingId</code> which has been marked for
     * deletion.<br>
     * <p>
     * The precondition is that the ClassRatingId information should have been retrieved and marked for
     * deletion.<br>
     * The system validates the ClassRatingId information to check whether the classRatingId is not marked for
     * deletion. If the ClassRatingId is not marked for deletion, the error message is thrown.
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
     * <code></code><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5" width="80%">
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants
     *            .MessageConstants#INPUT_CLASS_RATING_ID_DOES_NOT_EXIST}</td>
     *            <td>ClassRatingId does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RESTORATION_MUST_NOT_BE_DONE}</td>
     *            <td>Cannot restore an ClassRatingId  that is not marked for deletion.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pClassRatingIdRestoreRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdRestoreRequest
     *            ClassRatingIdRestoreRequest}</code> request Object to restore
     *            ClassRatingId. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto. ClassRatingIdPersistRequest#setClassRatingId
     *            classRatingId} - (M)</code>
     *            <ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse
     *         ClassRatingIdResponse }<br> <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse#getClassRatingIds
     *         ClassRatingIds} - (0:1) </ul> </code>
     *         <p>
     * @throws LMSException
     *             If the ClassRatingId restore operation fails the above mentioned error codes are returned.
     *             Each CodeMessage contains the status code, human readable message and message type.
     */
    ClassRatingIdResponse restoreClassRatingId(
                ClassRatingIdRestoreRequest pClassRatingIdRestoreRequest)
                throws LMSException;

    /**
     * Updates the <code>ClassRatingIdVersion</code> information after
     * validating the input data.
     * <p>
     * <b>Related Methods:</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.
     * ClassRatingIdService#createClassRatingIdVersion createClassRatingIdVersion}</ul>
     * </code>
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
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
     * <code></code><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5" width="80%">
     * <code>
     * 
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#INPUT_CLASS_RATING_ID_DOES_NOT_EXIST}</td>
     *            <td>The input Class Rating ID does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#  INPUT_CLASS_RATING_ID_VERSION_DOES_NOT_EXIST}</td>
     *            <td>The input Class Rating ID version does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#EFFECTIVEDATE_GREATER_THAN_CURRENT_SYSTEMDATE}</td>
     *            <td>The Effective Date must be greater than the current system date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CLASS_RATING_ID_MARKED_FOR_DELETION}</td>
     *            <td>The class rating ID is marked for deletion.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#EFFECTIVE_LESSER_THAN_PREV_VERSION_EFFECTIVE}</td>
     *            <td>The Effective Date must be greater than Previous version Effective Date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants# CLASS_RATING_ID_VERSION_CREATED_SUCCESSFULLY}</td>
     *            <td>New version for the class rating ID is created.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pClassRatingIdPersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdPersistRequest
     *            ClassRatingIdPersistRequest}</code> holds all the required
     *            information for creating a ClassRatingId and its
     *            relatedClassRatingId version details as input by the actor.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdPersistRequestt#setClassRatingId
     *            ClassRatingId} - (M)</code>
     *            <ul>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdDto#setDeletionDate
     *            deletionDate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdDto#setClassRatingId
     *            classRatingId} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdVersionDto#setClassification
     *            classification} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdVersionDto#setDescription
     *            description} - (M)</code><li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdVersionDto#setEffectiveDate
     *            effectiveDate} - (M)</code><li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdVersionDto#setExpirationDate
     *            expirationDate} - (O)</code><li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdVersionDto#setOId
     *            oId} - (C) </code><br>
     *            Prohibited for create operation.<br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse
     *         ClassRatingIdResponse}<br> <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ClassRatingIdResponse#getClassRatingIds
     *         ClassRatingIds} - (1:*) </ul> </code>
     *         <p>
     * @throws LMSException
     *             If the ClassRatingIdVersion update operation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    ClassRatingIdResponse updateClassRatingIdVersion(
                ClassRatingIdPersistRequest pClassRatingIdPersistRequest)
                throws LMSException;

}
