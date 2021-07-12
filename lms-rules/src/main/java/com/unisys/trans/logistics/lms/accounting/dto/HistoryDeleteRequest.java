/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>HistoryPersistRequest</code> is used for maintaining a history of static data.
 * <p>
 * It holds station code, category, owner, source, status, userid, data, timestamp, old object and new object.
 * It persists the data as XML string of complete new object or the only the difference between the old and
 * new object along with other attributes.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>category
 * <li>data
 * <li>identifier
 * <li>newObject
 * <li>officeCode
 * <li>oldObject
 * <li>owner
 * <li>stationCode
 * <li>status
 * <li>timeStamp
 * <li>userId
 * </code>
 * </ul>
 */
public class HistoryDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8870389059446576764L;
    
    List<AccountingHistoryDto>  accountingHistory = new ArrayList<AccountingHistoryDto>();

	/**
	 * @return the accountingHistory
	 */
	public List<AccountingHistoryDto> getAccountingHistory() {
		return this.accountingHistory;
	}

	/**
	 * @param accountingHistory the accountingHistory to set
	 */
	public void setAccountingHistory(final List<AccountingHistoryDto> pAccountingHistory) {
		this.accountingHistory = pAccountingHistory;
	}
    
}
