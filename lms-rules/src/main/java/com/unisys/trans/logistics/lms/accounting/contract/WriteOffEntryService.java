package com.unisys.trans.logistics.lms.accounting.contract;


import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingBalanceReportDetailsDto;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingEntryResponse;
import com.unisys.trans.logistics.lms.accounting.dto.WriteOffEntryRequest;
import com.unisys.trans.logistics.lms.framework.dto.RequestHeader;
import com.unisys.trans.logistics.lms.framework.exception.DaoException;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface WriteOffEntryService {
	
	public AccountingEntryResponse generateWriteOffEntry(WriteOffEntryRequest aWriteOffEntryRequest) throws LMSException, DaoException;
	
	public void generateWriteOffEntryForAccPeriod(WriteOffEntryRequest aWriteOffEntryRequest) throws LMSException, DaoException;
	
	public AccountingEntryResponse generateReportBasedOnAccountingPeriodForWriteOffAccPrd(WriteOffEntryRequest aWriteOffRequest) throws LMSException,DaoException;

}
