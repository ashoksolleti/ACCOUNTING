/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.parts.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDeleteRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksPersistRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksResponse;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse;

/**
 * Interface of the services that are implemented by the Business services.
 * <p>
 * <code>ParticipantRemarksService</code> provides create, update, find, and delete services for maintaining
 * participantRemarks information.<br>
 * This performs the following functions.<br>
 * <ul>
 * <li>Creates the participantRemarks.
 * <li>Finds the participantRemarks.
 * <li>Deletes the participantRemarks.
 * <li>Updates the participantRemarks.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest ParticipantFindRequest
 * @see com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDeleteRequest
 *      ParticipantRemarksDeleteRequest
 * @see com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksPersistRequest
 *      ParticipantRemarksPersistRequest
 * @see com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksResponse ParticipantRemarksResponse
 */

public interface ParticipantRemarksService {

    /**
     * Creates the <code>ParticipantRemarks</code>.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantRemarksService#updateParticipantRemarks
     * updateParticipantRemarks}<br>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantRemarksService#deleteParticipantRemarks
     * deleteParticipantRemarks}<br>
     * <br>
     * <p>
     * To create the participant remarks user must provide following input:<br>
     * <li>Participant remarks text.<br>
     * <li>Station for which the remarks are to be printed for.<br>
     * <li>The product code(s) that the participant remarks applies to.<br>
     * The remarks can apply to all stations or to a specific station. Similarly the remarks can apply to all
     * products or to a list.<br>
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
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_REMARKS_INVALID_REMARKS_TEXT_INSTANCE PARTICIPANT_REMARKS_INVALID_REMARKS_TEXT_INSTANCE}</code>
     * </td>
     * <td align="left">The participant remark entry must not be duplicate.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_REMARKS_INVALID_STATION_CODE_INSTANCE PARTICIPANT_REMARKS_INVALID_STATION_CODE_INSTANCE}</code>
     * </td>
     * <td align="left">The station must be valid or set “All Station indicator” to Yes for selection of all
     * stations.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_REMARKS_INVALID_PRODUCT_CODE_INSTANCE PARTICIPANT_REMARKS_INVALID_PRODUCT_CODE_INSTANCE}</code>
     * </td>
     * <td align="left">The product must be valid or set “All product code indicator” to Yes for selection of
     * all product codes.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pParticipantRemarksPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksPersistRequest
     *            ParticipantRemarksPersistRequest}</code><br>
     *            includes the attributes to create a <code>ParticipantRemarks </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto
     *            ParticipantRemarks} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto#setStationCode
     *            stationCode} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto#setProductCodes
     *            productCodes} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto#setText text} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto#setOId oId} - (C)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto#setAllStationIndicator
     *            allStationIndicator} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto#setAllProductCodeIndicator
     *            allProductCodeIndicator} - (C)</code> <br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ParticipantRemarksResponse
     *         ParticipantRemarksResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#PARTICIPANT_REMARKS_GROUP_CREATE_SUCCESSFUL
     *         PARTICIPANT_REMARKS_GROUP_CREATE_SUCCESSFUL} </code> <br>
     *         <code>for successful create.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ParticipantRemarksResponse#getParticipantRemarksDto()
     *         ParticipantRemarksDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ParticipantRemarksDto
     *         ParticipantRemarksDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validation fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */

    ParticipantRemarksResponse createParticipantRemarks(
                ParticipantRemarksPersistRequest pParticipantRemarksPersistRequest) throws LMSException;

    /**
     * Deletes the ParticipantRemarks.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantRemarksService#updateParticipantRemarks
     * updateParticipantRemarks}<br>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantRemarksService#createParticipantRemarks
     * createParticipantRemarks}<br>
     * <br>
     * <p>
     * To delete the participant remarks user must provide the following input:<br>
     * <li>OId for which the remarks are to be printed for.<br>
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
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.MessageConstants#PARTICIPANT_REMARKS_INVALID_PRODUCT_CODE_INSTANCE PARTICIPANT_REMARKS_INVALID_PRODUCT_CODE_INSTANCE}</code>
     * </td>
     * <td align="left">The product must be valid or set “All product code indicator” to Yes for selection of
     * all product codes.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pParticipantRemarksDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDeleteRequest
     *            ParticipantRemarksDeleteRequest}</code><br>
     *            includes the attributes to delete a ParticipantRemarks.
     *            <ul>
     *            <code> <li>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDeleteRequest#setOId oId}
     *            - (M) </code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksResponse
     *         ParticipantRemarksResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_REMARKS_GROUP_DELETE_SUCCESSFUL
     *         PARTICIPANT_REMARKS_GROUP_DELETE_SUCCESSFUL} </code><br>
     *         <code>for successful delete</code>
     *         </ul>
     *         <p>
     * @throws LMSException If the validation fails, the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */

    ParticipantRemarksResponse deleteParticipantRemarks(
                ParticipantRemarksDeleteRequest pParticipantRemarksDeleteRequest) throws LMSException;

    /**
     * Finds the <code>ParticipantRemarks</code>(s) based on the criteria.
     * <p>
     * <li>The system returns all the ParticipantRemarks for the given Participant
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
     * <table border="1" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_INVALID_ACCOUNT_OBJECT_INSTANCE PARTICIPANT_INVALID_ACCOUNT_OBJECT_INSTANCE}</code>
     * </td>
     * <td align="left">Invalid Account number for the given Participant.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_INVALID_NAME_OBJECT_INSTANCE PARTICIPANT_INVALID_NAME_OBJECT_INSTANCE}</code>
     * </td>
     * <td align="left">Invalid name for the given Participant.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pParticipantFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
     *            ParticipantFindRequest}</code><br>
     *            includes the attributes to find ParticipantRemarks.
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ParticipantRemarksResponse
     *         ParticipantRemarksResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksResponse#getParticipantRemarksDtos()
     *         ParticipantRemarksDtos} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto
     *         ParticipantRemarksDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validations fail, the above mentioned error codes are returned.<br>
     *             Each CodeMessage contains the status code, human readable message, and message type.
     */

    ParticipantResponse findParticipantWithRemarks(ParticipantFindRequest pParticipantFindRequest)
                throws LMSException;

    /**
     * Updates the ParticipantRemarks details. <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantRemarksService#createParticipantRemarks
     * createParticipantRemarks}<br>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantRemarksService#deleteParticipantRemarks
     * deleteParticipantRemarks}<br>
     * <br>
     * <p>
     * To update the participant remarks user provide following input:<br>
     * <li>Participant remarks text.<br>
     * <li>Station for which the remarks are to be printed for.<br>
     * <li>The product code(s) that the participant remarks applies to.<br>
     * The remarks can apply to all stations or to a specific station. Similarly the remarks can apply to all
     * products or to a list.<br>
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
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_REMARKS_INVALID_REMARKS_TEXT_INSTANCE PARTICIPANT_REMARKS_INVALID_REMARKS_TEXT_INSTANCE}</code>
     * </td>
     * <td align="left">The participant remark entry must not be duplicate.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_REMARKS_INVALID_STATION_CODE_INSTANCE PARTICIPANT_REMARKS_INVALID_STATION_CODE_INSTANCE}</code>
     * </td>
     * <td align="left">The station must be valid or set “All Station indicator” to Yes for selection of all
     * stations.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_REMARKS_INVALID_PRODUCT_CODE_INSTANCE PARTICIPANT_REMARKS_INVALID_PRODUCT_CODE_INSTANCE}</code>
     * </td>
     * <td align="left">The product must be valid or set “All product code indicator” to Yes for selection of
     * all product codes.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pParticipantRemarksPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksPersistRequest
     *            ParticipantRemarksPersistRequest}</code><br>
     *            includes the attributes to create a ParticipantRemarks.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto
     *            ParticipantRemarks} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto#setStationCode
     *            stationCode} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto#setProductCodes
     *            productCodes} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto#setText text} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto#setOId oId} - (C)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto#setAllStationIndicator
     *            allStationIndicator} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto#setAllProductCodeIndicator
     *            allProductCodeIndicator} - (C)</code> <br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksResponse
     *         ParticipantRemarksResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         <code>holds the CodeMessage</code><br>
     *         <code>
     *         {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_REMARKS_UPDATE_SUCCESSFUL
     *         PARTICIPANT_REMARKS_UPDATE_SUCCESSFUL} </code><br>
     *         <code>for successful update.</code><br>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksResponse#getParticipantRemarksDtos()
     *         ParticipantRemarksDtos} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantRemarksDto
     *         ParticipantRemarksDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validations fail, the above mentioned error codes are returned.<br>
     *             Each CodeMessage contains the status code, human readable message and message type.
     */

    ParticipantRemarksResponse updateParticipantRemarks(
                ParticipantRemarksPersistRequest pParticipantRemarksPersistRequest) throws LMSException;

}
