package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingBalanceReportRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingBalanceReportResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface AccountingBalanceReportService {
	public AccountingBalanceReportResponse generateAccountBalanceReport(AccountingBalanceReportRequest accountingBalanceReportRequest) throws LMSException;
}
