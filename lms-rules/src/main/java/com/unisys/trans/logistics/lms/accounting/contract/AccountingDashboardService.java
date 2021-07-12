package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingDashboardRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingDashboardResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * Interface of the services that are implemented by the Business services.
 * <p>
 * <code>AccountingDashboardService</code> provides find service for maintaining the accounting air waybill
 * information.<br>
 * This performs the following functions.<br>
 * <ul>
 * <li>Finds the Dashboard Details.
 * </ul>
 * Dashboard Details are retrieved based:<br>
 * <ul>
 * <li><br>
 * <br>
 * </ul>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.AccountingDashboardRequest AccountingDashboardRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.AccountingDashboardResponse AccountingDashboardResponse
 */
public interface AccountingDashboardService {

    public AccountingDashboardResponse findDashboardDetails(
                final AccountingDashboardRequest pAccountingDashboardRequest) throws LMSException;

}
