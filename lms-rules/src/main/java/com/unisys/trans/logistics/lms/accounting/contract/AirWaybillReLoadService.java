/* ====================================== */
/* Copyright (c) 2020 Unisys Corporation. */
/* All rights reserved. */
/* UNISYS CONFIDENTIAL */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
/**
 * <code>AirWaybillReLoadService</code> handles the AWB Reload process from the
 * operational LMS system.
 * <p>
 * This service has the following function:
 * <ul>
 * <li>Create/Update an Air Waybill.
 * </ul>
 * 
 */

public interface AirWaybillReLoadService {

	void loadAirWaybill(final String string) throws LMSException;

	void postMessageToErrorQueue(final String message) throws LMSException;

	void addAWBLoadErrorQueueItem(String airWaybillXML, String string, String specificAirline, String value)
			throws LMSException;

	boolean invoiceGenerationInprogress(long awbOID) throws LMSException;

	String findSpecificAirline(long awbOID);

}
