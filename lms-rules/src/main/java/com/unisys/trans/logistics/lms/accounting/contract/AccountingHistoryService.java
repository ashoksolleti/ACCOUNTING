/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.accounting.contract;

import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.HistoryDeleteRequest;
import com.unisys.trans.logistics.lms.accounting.dto.HistoryFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.HistoryPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.HistoryResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>AccountingHistoryService</code> interface exposes the APIs which identifies various processing flows involved
 * in maintaining History information.
 * <p>
 * This includes the following operations:
 * <ul>
 * <li>createHistory
 * <li>findHistory
 * </ul>
 * <p>
 * The system maintains the history of static data that are frequently used. History is recorded whenever
 * there is creation, modification or deletion of these static data. <br>
 * <p>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.HistoryFindRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.HistoryPersistRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.HistoryResponse
 */

public interface AccountingHistoryService {

    /**
     * Creates the static data history.
     * <p>
     * This method is used for creating a history of static data. It persists the data as a complete new/old
     * object or only the difference between the old and new object along with other attributes. The system
     * records the modified data based on the following conditions:
     * <ul>
     * <li>When the maintenance data is created/deleted, the history is recorded along with the type of action
     * and the complete set of created/deleted data.
     * <li>When the maintenance data is modified, the history is recorded along with the type of action and
     * the complete set of old and new data.
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
     * <br>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.framework.constants.MessageConstants#XML_CONVERSION_ERROR}</td>
     *            <td>Error While recording History of Static data.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#NO_HISTORY_MATCH}</td>
     *            <td>Static data maintenance history does not exist for this code.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pHistoryPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.HistoryPersistRequest HistoryPersistRequest}
     *            </code><br>
     *            holds the request object which is used for creating a history data.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.HistoryPersistRequest#setCategory category} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.HistoryPersistRequest#setData data} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.HistoryPersistRequest#setIdentifier identifier} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.HistoryPersistRequest#setNewObject newObject} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.HistoryPersistRequest#setOfficeCode officeCode} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.HistoryPersistRequest#setOldObject oldObject} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.HistoryPersistRequest#setOwner owner} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.HistoryPersistRequest#setStationCode stationCode} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.HistoryPersistRequest#setStatus status} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.HistoryPersistRequest#setTimeStamp timeStamp} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.HistoryPersistRequest#setUserId userId} - (M)</code>
     *            </ul>
     *            <p>
     * @throws LMSException If the create history operation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    void createAccountingAWBHistory(HistoryPersistRequest pHistoryPersistRequest) throws LMSException;

    /**
     * Retrieves the static data history.
     * <p>
     * Finds the <code>History</code> based on the input owner, identifier and category.
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
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.framework.constants.MessageConstants#XML_CONVERSION_ERROR}</td>
     *            <td>Error While recording History of Static data.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#NO_HISTORY_MATCH}</td>
     *            <td>Static data maintenance history does not exist for this code.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pHistoryFindRequest <code>{@link com.unisys.trans.logistics.lms.utils.dto.HistoryFindRequest
     *            pHistoryFindRequest}</code><br>
     *            holds the request object for finding the history data.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.HistoryFindRequest#setCategory  Category} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.HistoryFindRequest#setIdentifier Identifier} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.HistoryFindRequest#setOwner Owner} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.HistoryResponse HistoryResponse} <ul>
     *         <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.HistoryResponse#getHistories() history} - (0:*)
     *         </ul> </code>
     *         <p>
     * @throws LMSException If the find operation fails the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message and message type.
     */
    HistoryResponse findAccountingAWBHistory(HistoryFindRequest pHistoryFindRequest) throws LMSException;
    
    void deleteAccountingAWBHistory(HistoryDeleteRequest historyDeleteRequest) throws LMSException;
    
     Date getformattedlocalDate(HistoryFindRequest findRequest) throws LMSException;

}
