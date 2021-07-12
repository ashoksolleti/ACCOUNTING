/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.RateSourceDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.RateSourceFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.RateSourcePersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.RateSourceResponse;
import com.unisys.trans.logistics.lms.rating.dto.RateSourceRestoreRequest;

/**
 * <code>RateSourceService</code> handles the RateSource
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>Create a RateSource.
 * <li>Delete a RateSource.
 * <li>Restore a RateSource.
 * <li>Find the RateSource.
 * <li>Find all RateSources.
 * <li>Update a RateSource.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.RateSourceDeleteRequest RateSourceDeleteRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RateSourceFindRequest RateSourceFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RateSourcePersistRequest RateSourcePersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RateSourceRestoreRequest RateSourceRestoreRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RateSourceResponse RateSourceResponse
 */

public interface RateSourceService {

    /**
     * Creates the <code>RateSource</code>.
     * <p>
     * This method creates a RateSource along with description, RatingConventionType and RateTypes. <br>
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.RateSourceService#updateRateSource
     * updateRateSource}<br>
     * <p>
     * To create the RateSource user must provide following input:<br>
     * <li>RateSourceCode.<br>
     * <li>Description. <br>
     * <li>RateTypes. <br>
     * <li>RatingConventionType. <br>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_RATE_TYPE_NOT_PRESENTIN_DB RATE_SOURCE_RATE_TYPE_NOT_PRESENTIN_DB}</code>
     * </td>
     * <td align="left">RateType is not present in database.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pRateSourcePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateSourcePersistRequest
     *            RateSourcePersistRequest}</code><br>
     *            includes the attributes to create a <code>RateSource </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto
     *            RateSource} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto#setRatingConventionType
     *            ratingConventionType} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto#setRateSourceCode
     *            RateSourceCode} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto#setDescription
     *            description} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto#setOId
     *            oId} - (C)</code> <br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceResponse
     *         RateSourceResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_CREATED
     *         RATE_SOURCE_CREATED} </code> <br>
     *         <code>for successful create.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceResponse#getRateSourceDto()
     *         RateSourceDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto
     *         RateSourceDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validation fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */

    RateSourceResponse createRateSource(RateSourcePersistRequest
                pRateSourcePersistRequest) throws LMSException;

    /**
     * Deletes the RateSource.
     * <p>
     * This functions marks a RateSource for deletion.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.RateSourceService#restoreRateSource
     * restoreRateSource}<br>
     * <p>
     * To delete the RateSource user must provide following input:<br>
     * <li>OId.<br>
     * <li>RateSourceCode.<br>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_DOES_NOT_EXISTS RATE_SOURCE_DOES_NOT_EXISTS}</code>
     * </td>
     * <td align="left">Rate Source does not exists.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_MARKED_FOR_DELETION RATE_SOURCE_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">Rate Source is marked for deletion.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pRateSourceDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDeleteRequest
     *            RateSourceDeleteRequest}</code><br>
     *            includes the attributes to delete a <code>RateSource </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto
     *            RateSource} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto#setDeletionDate
     *            deletionDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto#setRateSourceCode
     *            rateSourceCode} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto#setOId
     *            oId} - (M)</code> <br>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            -(C) Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceResponse
     *         RateSourceResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_MARKED_FOR_DELETION
     *         RATE_SOURCE_MARKED_FOR_DELETION} </code> <br>
     *         <code>for successful delete.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceResponse#getRateSourceDto()
     *         RateSourceDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto
     *         RateSourceDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validation fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */

    RateSourceResponse deleteRateSource(RateSourceDeleteRequest
                pRateSourceDeleteRequest) throws LMSException;

    /**
     * Finds all the RateSource.
     * <p>
     * This method returns all the RateSource. The returned RateSourceDto will contain:
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.RateSourceService#findRateSource
     * findRateSource}<br>
     * <p>
     * To find the RateSource user must provide following input:<br>
     * <li>RateSourceCode.<br>
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
     * <p>
     * 
     * @param pRateSourceFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceFindRequest
     *            RateSourceFindRequest}</code><br>
     *            includes the attributes to find a <code>RateSource </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto
     *            RateSource} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto#setRateSourceCode
     *            rateSourceCode}</code> Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceResponse
     *         RateSourceResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceResponse#getRateSourceDto()
     *         RateSourceDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto
     *         RateSourceDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validation fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */

    RateSourceResponse findAllRateSources(RateSourceFindRequest
                pRateSourceFindRequest) throws LMSException;

    /**
     * Finds the RateSource.
     * <p>
     * This method returns a RateSource. The returned RateSourceDto will contain:
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.RateSourceService#findAllRateSource
     * findAllRateSource}<br>
     * <p>
     * To find the RateSource user must provide following input:<br>
     * <li>RateSourceCode.<br>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_MANDATORY RATE_SOURCE_MANDATORY}</code>
     * </td>
     * <td align="left">RateSource is mandatory.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_DOES_NOT_EXISTS RATE_SOURCE_DOES_NOT_EXISTS}</code>
     * </td>
     * <td align="left">RateSource does not exists.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pRateSourceFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceFindRequest
     *            RateSourceFindRequest}</code><br>
     *            includes the attributes to find a <code>RateSource </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto
     *            RateSource} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto#setRateSourceCode
     *            rateSourceCode}</code> Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceResponse
     *         RateSourceResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceResponse#getRateSourceDto()
     *         RateSourceDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto
     *         RateSourceDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validation fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */

    RateSourceResponse findRateSource(RateSourceFindRequest
                pRateSourceFindRequest) throws LMSException;

/**
     * Restores the RateSource.
     * <p>
     * This function restores a RateSource which is marked for deletion. It updates the deletion date of
     * RateSource to null.<br>
     * <b>Related Method :</b> <code>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.RateSourceService#deleteRateSource deleteRateSource}</code>
     * <p>
     * To restore RateSource user must provide following input:<br>
     * <li>OId. <br>
     * <li>rateSourceCode. <br>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_DOES_NOT_EXISTS RATE_SOURCE_DOES_NOT_EXISTS}</code>
     * </td>
     * <td align="left">RateSource does not exists.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>
     * {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_RESTORATION_NOT_DONE_IF_RATESOURCE_MARKED_DELETION 
     * RATE_SOURCE_RESTORATION_NOT_DONE_IF_RATESOURCE_MARKED_DELETION}</code>
     * </td>
     * <td align="left">RateSource restoration cannot be done if the rateSource 
     * is not marked for deletion.</td>
     * </table>
     * <p>
     * 
     * @param pRateSourceRestoreRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceRestoreRequest
     *            RateSourceRestoreRequest}</code><br>
     *            includes the attributes to restore a <code>RateSource </code>.
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto
     *            RateSource} - (M)</code>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto#setRateSourceCode
     *            rateSourceCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto#setOId
     *            Prohibited for create operation.</code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceResponse
     *         RateSourceResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_RESTORED
     *         RATE_SOURCE_RESTORED} </code> <br>
     *         <code>for successful restore.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceResponse#getRateSourceDto()
     *         RateSourceDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto  RateSourceDto}
     *        </code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validation fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */

    RateSourceResponse restoreRateSource(RateSourceRestoreRequest
                pRateSourceRestoreRequest) throws LMSException;

    /**
     * Updates the RateSource.
     * <p>
     * This method updates the RateSource.<br>
     * <p>
     * <b>Related Method :</b>
     * {@link com.unisys.trans.logistics.lms.rating.contract.RateSourceService#findRateSource
     * findRateSource}
     * <p>
     * To update RateSource user must provide following input:<br>
     * <li>OId. <br>
     * <li>RatingConventionType. <br>
     * <li>Description.<br>
     * <li>RateTypes.<br>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_DOES_NOT_EXISTS RATE_SOURCE_DOES_NOT_EXISTS}</code>
     * </td>
     * <td align="left">RateSource does not exists.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_MARKED_FOR_DELETION RATE_SOURCE_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">RateSource is marked for deletion.</td>
     * </table>
     * <p>
     * 
     * @param pRateSourcePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateSourcePersistRequest
     *            RateSourcePersistRequest}</code><br>
     *            includes the attributes to update a <code>RateSource </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto
     *            RateSource} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto#setRatingConventionType
     *            ratingConventionType} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto#setDescription
     *            description} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto#setRateTypes
     *            rateTypes} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto#setOId oId} - (C)
     *            </code> <br>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            -(C)<br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceResponse
     *         RateSourceResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATE_SOURCE_UPDATED
     *         RATE_SOURCE_UPDATED} </code> <br>
     *         <code>for successful update.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceResponse#getRateSourceDto()
     *         RateSourceDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateSourceDto
     *         RateSourceDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validation fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */

    RateSourceResponse updateRateSource(RateSourcePersistRequest
                pRateSourcePersistRequest) throws LMSException;

}
