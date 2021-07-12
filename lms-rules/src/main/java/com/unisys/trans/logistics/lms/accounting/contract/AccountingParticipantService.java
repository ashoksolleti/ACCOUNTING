/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingParticipantFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingParticipantPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingParticipantResponse;
import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>AccountingParticipantService</code> handles the AccountingParticipant
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>Create the Accounting Participant.
 * <li>Find the Accounting Participant by Account Number.
 * <li>Update a Accounting Participant.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.AccountingParticipantFindRequest
 *      AccountingParticipantPersistRequestFindRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.AccountingParticipantPersistRequest
 *      AccountingParticipantPersistRequest
 */
public interface AccountingParticipantService {
    /**
     * Create a new accounting participant.
     * <p>
     * This method returns a created Accounting participant if successfully created.
     * <p>
     * To create a accounting participant user must provide following input:<br>
     * <li>accountingParticipantDto.<br>
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
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#ACCOUNTING_PARTICIPANT_ALREADY_EXIST}</code></td>
     * <td align="left">Accounting Participant information already exists in the system.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pAccountingParticipantPersistRequest
     *            <code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.AccountingParticipantPersistRequest
     *            AccountingParticipantPersistRequest}</code><br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto. AccountingParticipantPersistRequest#setAccountingParticipantDto
     *            AccountingParticipantDto} - (C)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.AccountingParticipantResponse
     *         accountingParticipantResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.accounting.dto.AccountingParticipantResponse#getAccountingParticipantDtos()
     *         accountingParticipantDto} - (1:*)</code>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */

    AccountingParticipantResponse createAccountingParticipant(
                AccountingParticipantPersistRequest pAccountingParticipantPersistRequest)
                throws LMSException;

    /**
     * Finds the Accounting Participant for a Participant Account Number.
     * <p>
     * This method returns a AccountingParticipant along with its hierarchy.
     * <p>
     * To find the Accounting Participant for a Participant Account Number user must provide following input:<br>
     * <li>Participant Account Number.<br>
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
     * @param pAccountingParticipantFindRequest
     *            <code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.AccountingParticipantFindRequest
     *            AccountingParticipantFindRequest}</code><br>
     *            includes the attributes to find a <code>Accounting Participant </code>.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto. AccountingParticipantFindRequest#setAccountNumber
     *            accountNumber} - (C)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.AccountingParticipantResponse
     *         AccountingParticipantResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.accounting.dto. AccountingParticipantResponse#getAccountingParticipantDtos()
     *         accountingParticipantDtos} - (1:*)</code>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */

    AccountingParticipantResponse findByParticipantAccountNumber(
                AccountingParticipantFindRequest pAccountingParticipantFindRequest) throws LMSException;

    /**
     * Updates,delete and add the Account Participant hierarchy for a carrier.
     * <p>
     * This method returns a Account Participant along with its hierarchy.
     * <p>
     * To update,delete and add user must provide following input:<br>
     * <li>accountParticipantDto.<br>
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
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants
     * .MessageConstants#ACCOUNTING_PARTICIPANT_ACCOUNT_NUMBER_REQUIRED}</code></td>
     * <td align="left">The Account Number is required.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#ACCOUNTING_PARTICIPANT_NOT_EXIST}</code></td>
     * <td align="left">Accounting Participant Information not found in the accounting system.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pAccountingParticipantPersistRequest
     *            <code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto. AccountingParticipantPersistRequest
     *            AccountingParticipantPersistRequest}</code><br>
     *            includes the attributes to find a <code>Accounting Participant </code>.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto. AccountingParticipantPersistRequest#setAccountingParticipantDto
     *            accountingParticipantDto} - (C)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.AccountingParticipantResponse
     *         AccountingParticipantResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.accounting.dto. AccountingParticipantResponse#getAccountingParticipantDtos()
     *         accountingParticipantDtos} - (1:*)</code>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */

    AccountingParticipantResponse updateAccountingParticipant(
                AccountingParticipantPersistRequest pAccountingParticipantPersistRequest)
                throws LMSException;

    void purgeAccountingParticipant(BatchRequest pBatchRequest) throws LMSException;

}
