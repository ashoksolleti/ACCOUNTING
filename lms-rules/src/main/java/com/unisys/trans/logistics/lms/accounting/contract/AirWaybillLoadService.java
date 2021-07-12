/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillResponse;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillResubmitRequest;
import com.unisys.trans.logistics.lms.accounting.dto.constants.AdjustmentSourceType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>LoadAirWaybillService</code> handles the AWB load process from the
 * operational LMS system.
 * <p>
 * This service has the following function:
 * <ul>
 * <li>Create/Update an Air Waybill.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.AccountingParticipantPersistRequest
 *      AccountingParticipantPersistRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillResponse
 *      AccountingAirWaybillResponse
 */
public interface AirWaybillLoadService {

	/**
	 * Loads a AirWaybill into the accounting system.
	 * <p>
	 * This method loads the AirWaybill input from operational LMS system into
	 * the accounting system.
	 * <p>
	 * To load a AirWaybill following input are needed:<br>
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
	 * 
	 * @param pAccountingParticipantPersistRequest
	 *            <ul>
	 *            <li><code> {@link String airWaybillXML} -(M)</code><br>
	 *            <li><code> {@link String messageId} -(O)</code><br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.accounting.dto. AccountingAirWaybillDto#setAccountingAirWaybillDto
	 *            AccountingAirWaybillDto} - (C)</code>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillResponse
	 *         AccountingAirWaybillResponse}</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields}</code> holds the CodeMessage <code> <li>
	 *         {@link com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillResponse#getAirWaybillDtos()
	 *         airWaybillDtos} - (1:*)</code><li>
	 *         {@link com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillResponse#getAirWaybillDto()
	 *         airWaybillDto} - (1:1)</code>
	 * 
	 *         </ul>
	 * @throws LMSException
	 *             If the validation fails, above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code, human
	 *             readable message, and message type.
	 */
	AccountingAirWaybillResponse loadAirWaybill(
			final AccountingAirWaybillPersistRequest pAirWaybillPersistRequest)
			throws LMSException;

	/**
	 * Reload the AirWaybill into the accounting system.
	 * <p>
	 * This method Reload the AirWaybill input from operational LMS system into
	 * the accounting system.
	 * <p>
	 * To Reload a AirWaybill following input are needed:<br>
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
	 * 
	 * @param pAccountingAirWaybillResubmitRequest
	 *            <ul>
	 *            <li><code> {@link String airWaybillXML} -(M)</code><br>
	 *            <li><code> {@link String messageId} -(O)</code><br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.accounting.dto. AccountingAirWaybillDto#setAccountingAirWaybillDto
	 *            AccountingAirWaybillDto} - (C)</code>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillResponse
	 *         AccountingAirWaybillResponse}</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields}</code> holds the CodeMessage <code> <li>
	 *         {@link com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillResponse#getAirWaybillDtos()
	 *         airWaybillDtos} - (1:*)</code><li>
	 *         {@link com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillResponse#getAirWaybillDto()
	 *         airWaybillDto} - (1:1)</code>
	 * 
	 *         </ul>
	 * @throws LMSException
	 *             If the validation fails, above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code, human
	 *             readable message, and message type.
	 */
	void reprocessAirWaybill(
			final AccountingAirWaybillResubmitRequest pAccountingAirWaybillResubmitRequest)
			throws LMSException;

	/* Logging and Nagios Monitoring */
	void postMessageToErrorQueue(final String message) throws LMSException;
	
	void validateAwbErrorQueue(AccountingAirWaybillPersistRequest anAirWaybillPersistRequest,final Long oid) throws LMSException;

	void postMessageToQPostConcurrentModificationFailure(AccountingAirWaybillPersistRequest anAirWaybillPersistRequest) throws LMSException;

}
