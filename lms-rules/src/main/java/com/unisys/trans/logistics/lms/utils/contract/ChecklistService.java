/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.ChecklistRequest;
import com.unisys.trans.logistics.lms.utils.dto.ChecklistResponse;

/**
 * <code>ChecklistService</code> interface exposes the APIs which identifies various checklist Details
 * and stores checklists as attachments.
 * <p>
 * <p>
 * This includes the following operations:
 * <ul>
 * <li>Find checklists - Find Checklist Information.
 * <li>Store Attachments - Stores Checklist in Shipment Attachments.
 * </ul>
 * <p>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.ChecklistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.ChecklistResponse
 */
public interface ChecklistService {

    /**
     * Find the Checklist Information by the checklist name.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ChecklistService#getCheckList getCheckList }
     * <p>
     * <p> 
     * </table>
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
     * @param pChecklistRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.ChecklistRequest
     *            ChecklistRequest}</code><br>
     *            holds all the required information for retrieving checklist information
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ChecklistRequest
     *            ChecklistRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ChecklistRequest#setChecklistName(String)
     *            checklistName} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ChecklistResponse ChecklistResponse}</code>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ChecklistResponse#getChecklistValues() checklistValues}
     *         </ul>
     *         <p>
     * @throws LMSException If the method fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message and message type.
     */
    ChecklistResponse getCheckList(ChecklistRequest pChecklistRequest) throws LMSException;

    /**
     * Store the checklist as Attachment.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ChecklistService#storeAttachment storeAttachment }
     * <p>
     * <p> 
     * </table>
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
     * @param pChecklistRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.ChecklistRequest
     *            ChecklistRequest}</code><br>
     *            holds all the required information for retrieving checklist information
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ChecklistRequest
     *            ChecklistRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ChecklistRequest#setChecklistHtml(String)
     *            checklistName} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ChecklistResponse ChecklistResponse}</code>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ChecklistResponse#getMessage() message}
     *         </ul>
     *         <p>
     * @throws LMSException If the method fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message and message type.
     */

	ChecklistResponse storeAttachment(ChecklistRequest pChecklistRequest) throws LMSException;
}
