/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodePersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeResponse;

/**
 * <code>ReasonCodeService</code> interface exposes the APIs which identifies various processing flows
 * involved in maintaining the removal reason code information.
 * <p>
 * The Removal Reason Code are classified into four types:<br>
 * <ul>
 * <li>External Reason Code (E) - Specified during Goods Removal from Flight.
 * <li>Internal Reason Code (I) - Specified for the internal usage of the system.
 * <li>Location Change Code (L) - Specified when goods are moved from an assigned container either to a
 * terminal location or to an inactive or empty unassigned container and if the automatic re-assignment is not
 * enabled at the sign-in station.
 * <li>Offload Change Code (O) - Specified when the offload station of assigned goods is changed to another
 * offload station within the same flight routing.
 * </ul>
 * <br>
 * <code>ReasonCodeService</code> provides the following services for <code>RemovalReasonCode</code>
 * information.<br>
 * This performs the following functions:
 * <ul>
 * <li>createRemovalReasonCode
 * <li>deleteRemovalReasonCode
 * <li>findRemovalReasonCodes
 * <li>updateRemovalReasonCode
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodePersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeResponse
 */
public interface ReasonCodeService {

    /**
     * Creates the <code>RemovalReasonCode</code> information after validating the input data.
     * <p>
     * <b>Related Methods :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.utils.contract.ReasonCodeService#updateRemovalReasonCode UpdateRemovalReasonCode}
     * <li>{@link com.unisys.trans.logistics.lms.utils.contract.ReasonCodeService#deleteRemovalReasonCode DeleteRemovalReasonCode}
     * </ul>
     * </code>
     * <p>
     * <ul>
     * <li>Only one Removal Reason Code is allowed for each default type - Offload Change Code (O) and
     * Location Change Code (L).
     * <li>The Removal Reason Code must be unique.
     * </ul>
     * <br>
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
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#REMOVAL_REASON_CODE_DUPLICATE_NOT_ALLOWED}</td>
     *            <td>The Removal Reason Code already exists and duplicates are not allowed.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#REMOVAL_REASON_CODE_ONLY_ONE_FOR_TYPE_L_ALLOWED}</td>
     *            <td>Only one Removal Reason Code of type Location Change Code is allowed.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#REMOVAL_REASON_CODE_ONLY_ONE_FOR_TYPE_O_ALLOWED}</td>
     *            <td>Only one Removal Reason Code of type Offload Change Code is allowed.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pRemovalReasonCodePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodePersistRequest
     *            RemovalReasonCodePersistRequest}</code><br>
     *            which includes attributes for creating a RemovalReasonCode.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeDto removalReasonCode} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeDto#setOId oId} - (C)</code>
     *            <br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeResponse
     *         RemovalReasonCodeResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeResponse#getRemovalReasonCodes()
     *         removalReasonCodes} - (1:*) <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeDto RemovalReasonCodeDto}
     *         </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the Removal Reason code create operation fails the above mentioned error codes
     *             are returned.Each CodeMessage contains status code, human readable message and message
     *             type.
     */
    RemovalReasonCodeResponse createRemovalReasonCode(
                final RemovalReasonCodePersistRequest pRemovalReasonCodePersistRequest) throws LMSException;

    /**
     * Deletes the <code>RemovalReasonCode.</code><br>
     * <p>
     * This method is used for deleting an existing Removal Reason. It permanently deletes Removal Reason from
     * the database.<br>
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
     * @param pRemovalReasonCodeDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeDeleteRequest
     *            RemovalReasonCodeDeleteRequest}</code><br>
     *            which includes attributes for deleting a ReasonCode.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeDeleteRequest#setCode code} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeDeleteRequest#setOId oId} - (M)</code>
     *            <br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeResponse
     *         RemovalReasonCodeResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeResponse#getRemovalReasonCodes()
     *         removalReasonCodes} - (1:*) <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeDto RemovalReasonCodeDto}
     *         </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the reason code delete operation fails the corresponding error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    RemovalReasonCodeResponse deleteRemovalReasonCode(
                final RemovalReasonCodeDeleteRequest pRemovalReasonCodeDeleteRequest) throws LMSException;

    /**
     * Finds the <code>RemovalReasonCode</code> information based on the given code and type..<br>
     * <p>
     * This method retrieves the list of Removal Reason informations based on the following rules:<br>
     * <ul>
     * <li>Code and Type provided - If the given code and type combination exists, than the sorted list of
     * code details (for the given Type) starting with the given code is returned. If the code and type
     * combination doesn't exist, then the sorted list of code details (for the given Type) starting with the
     * code which is prior to the given code is returned. If no prior code for the given type exist then all
     * the codes for the given type is returned.
     * <li>Only type provided - Returns the sorted list of code details for the given type is returned. If no
     * code exists for the given type then an empty list is returned. If the type provided is
     * "A - All Reason Codes" then all Reason code from all the types is returned.
     * </ul>
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
     * @param pRemovalReasonCodeFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeFindRequest
     *            RemovalReasonCodeFindRequest}</code><br>
     *            which includes the attributes to find the removal reason code information.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeFindRequest#setCode code} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeFindRequest#setType type} - (O)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeResponse
     *         RemovalReasonCodeResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeResponse#getRemovalReasonCodes()
     *         removalReasonCodes} - (0:*) <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeDto RemovalReasonCodeDto}
     *         </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the removal reason code information does not exist the above mentioned error
     *             codes are returned.Each CodeMessage contains the status code, human readable message and
     *             message type.
     */
    RemovalReasonCodeResponse findRemovalReasonCodes(
                final RemovalReasonCodeFindRequest pRemovalReasonCodeFindRequest) throws LMSException;

    /**
     * Updates the <code>RemovalReasonCode</code> information and returns the updated information.<br>
     * <p>
     * <b>Related Methods :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.utils.contract.ReasonCodeService#deleteRemovalReasonCode DeleteRemovalReasonCode}
     * </ul>
     * </code>
     * <p>
     * <ul>
     * <li>The actor allowed to change "type" and "description" only, actor must not allowed to change the
     * "code".
     * <li>Only one Removal Reason Code is allowed for each default type - Offload Change Code (O) and
     * Location Change Code (L).
     * </ul>
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
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#REMOVAL_REASON_CODE_CANNOT_BE_UPDATED}</td>
     *            <td>The Removal Reason Code cannot be updated.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#REMOVAL_REASON_CODE_ONLY_ONE_FOR_TYPE_L_ALLOWED}</td>
     *            <td>Only one Removal Reason Code of type Location Change Code is allowed.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#REMOVAL_REASON_CODE_ONLY_ONE_FOR_TYPE_O_ALLOWED}</td>
     *            <td>Only one Removal Reason Code of type Offload Change Code is allowed.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pRemovalReasonCodePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodePersistRequest
     *            RemovalReasonCodePersistRequest}</code><br>
     *            which includes attributes for updating RemovalReasonCode information.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeDto removalReasonCode} - (M)</code>
     *            <br>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractCodeDto#setCode code} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractCodeDto#setDescription description} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeDto#setType type} - (O)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeResponse
     *         RemovalReasonCodeResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeResponse#getRemovalReasonCodes()
     *         removalReasonCodes} - (1:1) <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RemovalReasonCodeDto RemovalReasonCodeDto}
     *         </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the update removal reason code operation fails the above mentioned error codes
     *             are returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    RemovalReasonCodeResponse updateRemovalReasonCode(
                final RemovalReasonCodePersistRequest pRemovalReasonCodePersistRequest) throws LMSException;
}
