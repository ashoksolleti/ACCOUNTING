/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.dto.SuggestiveSearchResponse;
import com.unisys.trans.logistics.lms.framework.dto.ValidationRequest;
import com.unisys.trans.logistics.lms.framework.dto.ValidationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodePersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeResponse;

/**
 * <code>SpecialHandlingCodeService</code> handles the maintenance of special handling codes required for a
 * cargo application.
 * <p>
 * Special handling codes are assigned to cargo that requires special processing. <br>
 * This has the following functions:
 * <ul>
 * <li>Creates a special handling code.
 * <li>Updates a special handling code.
 * <li>Deletes a special handling code.
 * <li>Retrieves the special handling codes.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodePersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeResponse
 */
@Path("specialHandlingCodeService")
public interface SpecialHandlingCodeService {

    /**
     * Creates the special handling code.
     * <p>
     * Special handling codes are assigned to cargo that requires special processing. Special handling codes
     * must be unique and are validated for their existence before create operation. The system records
     * history for the special handling code creation.
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
     * <table border="0" cellspacing="0" * cellpadding="5">
     * <tr>
     * <td>
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#SPL_OBJECT_ALREADY_EXIST}</code>
     * </td>
     * <td>Special Handling Code already exists.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodePersistRequest
     *            SpecialHandlingCodePersistRequest}</code><br>
     *            includes the attributes to create a special handling code.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto
     *            specialHandlingCode} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setAlertGroupCode
     *            alertGroupCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setCopyGoodsIndicator
     *            copyGoodsIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setDangerousGoodsCode
     *            dangerousGoodsCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setDeleteSensitiveIndicator
     *            deleteSensitiveIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setDescription
     *            description} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setForcedBookingCode
     *            forcedBookingCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setFzdFzeMsgIndicator
     *            fzdFzeMsgIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setHeavyIndicator
     *            heavyIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setHostIndicator
     *            hostIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setOtherChargeCode
     *            otherChargeCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setQueueReasonCode
     *            queueReasonCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setRateClassCode
     *            rateClassCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setSortingPriority
     *            sortingPriority} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setSpecialHandlingCode
     *            specialHandlingCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setSubstituteIataCode
     *            substituteIataCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setOId oId} - (C)
     *            </code> <br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeResponse
     *         SpecialHandlingCodeResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#SPL_CREATE_SUCCESSFUL}
     *         </code> for successful create. <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeResponse#getSpecialHandlingCodes()
     *         specialHandlingCodes} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto
     *         SpecialHandlingCodeDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validation fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    SpecialHandlingCodeResponse createSpecialHandlingCode(SpecialHandlingCodePersistRequest pPersistRequest)
                throws LMSException;

    /**
     * Deletes the special handling code.
     * <p>
     * In order to delete a special handling code, the given special handling code must exist in the system.
     * The system records history for the delete of the special handling code.
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
     * <table border="0" cellspacing="0" * cellpadding="5">
     * <tr>
     * <td>
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.MessageConstants#NO_EXACT_MATCH}</code>
     * </td>
     * <td>No exact match found for special handling code.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDeleteRequest
     *            specialHandlingCodeDeleteRequest}</code><br>
     *            includes the attributes to delete a special handling code.
     *            <ul>
     *            <code> <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDeleteRequest#setOId oId}
     *            - (M) <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDeleteRequest#setSpecialHandlingCode
     *            specialHandlingCode} - (O) </code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeResponse
     *         SpecialHandlingCodeResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#SPL_DELETE_SUCCESSFUL}
     *         </code> for successful delete.
     *         </ul>
     *         <p>
     * @throws LMSException If the validation fails, the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    SpecialHandlingCodeResponse deleteSpecialHandlingCode(SpecialHandlingCodeDeleteRequest pDeleteRequest)
                throws LMSException;

    /**
     * Finds the special handling code.
     * <p>
     * <li>If an exact match is required, the system finds the special handling code that exactly matches the
     * input special handling code.
     * <li>If an exact match is not required, the system returns all the special handling codes that closely
     * match the input special handling code sorted alphabetically.
     * <li>When special handling code is not provided as filter, the system returns all the special handling
     * codes. <br>
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
     * <table border="0" cellspacing="0" * cellpadding="5">
     * <tr>
     * <td>
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.MessageConstants#NO_EXACT_MATCH}</code>
     * </td>
     * <td>No exact match found for special handling code.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeFindRequest
     *            SpecialHandlindCodeFindRequest}</code><br>
     *            includes the attributes to find special handling code.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeFindRequest
     *            SpecialHandlingCodeFindRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeFindRequest#setSpecialHandlingCode
     *            specialHandlingCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeFindRequest#setExactMatchRequiredIndicator
     *            exactMatchRequiredIndicator} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeResponse
     *         SpecialHandlingCodeResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeResponse#getSpecialHandlingCodes()
     *         specialHandlingCodes} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto
     *         SpecialHandlingCodeDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validations fail, the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    SpecialHandlingCodeResponse findSpecialHandlingCode(SpecialHandlingCodeFindRequest pFindRequest)
                throws LMSException;

    /**
     * This methods retrieves all the special handling code details for the set of special handling codes
     * input.
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
     * @param pMultipleFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest MultipleFindRequest}
     *            </code><br>
     *            holds the request object which includes the attributes to find the special handling code.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs} - (M) (1:*)</code><br>
     *            holds the special handling codes.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code><br>
     *         holds the list of the special handling data transfer objects.<br>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         retrievedObjects} - (0:*)</code><br>
     *         holds a map of special handling code details with special handling code as key and <code>
     *         SpecialHandlingCodeDto</code> as value.
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto
     *         SpecialHandlingCodeDto}</code>
     *         </ul>
     *         </ul>
     */
    MultipleFindResponse findSpecialHandlingCodes(final MultipleFindRequest pMultipleFindRequest);
    
    /**
     * This methods retrieves all the special handling code details for the given special handling code search string.
     * the search is done by comparing the search string with the special handling code or description.
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
     * @param pFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeFindRequest pFindRequest}
     *            </code><br>
     *            holds the request object which includes the attributes to find the special handling code.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeFindRequest#specialHandlingCode
     *            specialHandlingCode} - (M) (1)</code><br>
     *            holds the special handling code.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.SuggestiveSearchResponse
     *         SuggestiveSearchResponse}</code><br>
     *         holds the list of the special handling data transfer objects.<br>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.SuggestiveSearchResponse#getResultSet()
     *         resultSet} - (0:*)</code><br>
     *         holds a map of special handling code details with special handling code as key and <code>
     *         SpecialHandlingCodeDto</code> as value.
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto
     *         SpecialHandlingCodeDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException 
     */
    @POST
    @Path("/specialHandlingCodes")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    SuggestiveSearchResponse findSplCodesSuggestiveSearch(final SpecialHandlingCodeFindRequest pFindRequest) throws LMSException;

    /**
     * Updates the special handling code details.
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
     * <table border="0" cellspacing="0" * cellpadding="5">
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.framework.constants.MessageConstants#NO_EXACT_MATCH}</td>
     * <td>No exact match found for special handling code.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodePersistRequest
     *            SpecialHandlingCodePersistRequest}</code><br>
     *            includes the attributes to update a specified special handling code.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto
     *            SpecialHandlingCodeDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setAlertGroupCode
     *            alertGroupCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setCopyGoodsIndicator
     *            copyGoodsIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setDangerousGoodsCode
     *            dangerousGoodsCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setDeleteSensitiveIndicator
     *            deleteSensitiveIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setDescription
     *            description} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setForcedBookingCode
     *            forcedBookingCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setFzdFzeMsgIndicator
     *            fzdFzeMsgIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setHeavyIndicator
     *            heavyIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setHostIndicator
     *            hostIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setOId oId} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setOtherChargeCode
     *            otherChargeCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setQueueReasonCode
     *            queueReasonCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setRateClassCode
     *            rateClassCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setSortingPriority
     *            sortingPriority} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setSpecialHandlingCode
     *            specialHandlingCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto#setSubstituteIataCode
     *            substituteIataCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            -(M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeResponse
     *         SpecialHandlingCodeResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#SPL_UPDATE_SUCCESSFUL}
     *         </code> for successful update. <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeResponse#getSpecialHandlingCodes()
     *         specialHandlingCodes} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto
     *         SpecialHandlingCodeDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validations fail, the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message and message type.
     */
    SpecialHandlingCodeResponse updateSpecialHandlingCode(SpecialHandlingCodePersistRequest pPersistRequest)
                throws LMSException;

    /**
     * Validates if the <code>SpecialHandlingCode</code> exists for the input code.
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
     * <table border="0" cellspacing="0" * cellpadding="5">
     * <tr>
     * <td>
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.MessageConstants#NO_EXACT_MATCH}</code>
     * </td>
     * <td>No exact match found for special handling codes.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pValidationRequest <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest
     *            ValidationRequest}</code><br>
     *            includes the attributes to find special handling code.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest#setSearchInputs
     *            searchInputs} - (M)(1:*)</code><br>
     *            holds the list of special handling codes.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
     *         ValidationResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getValidInputs
     *         validInputs}-(0:*)</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getSearchInputs
     *         searchInputs} -(1:*)</code>
     *         </ul>
     *         <p>
     * @throws LMSException If the validaion fails, the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    ValidationResponse validateSpecialHandlingByCodes(ValidationRequest pValidationRequest)
                throws LMSException;
    
    
    List<String> findSpecialHandlingCodePrefix(String pPrefix)throws LMSException;

    List<String> findAllSpecialHandlingCode() throws LMSException;
}

