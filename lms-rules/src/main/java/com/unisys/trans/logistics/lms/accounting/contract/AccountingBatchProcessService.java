package com.unisys.trans.logistics.lms.accounting.contract;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingBatchHistoryDetailsDto;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingBatchProcessRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingBatchProcessResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * 
 * @author SSeshaS
 *
 */
public interface AccountingBatchProcessService {
	public AccountingBatchProcessResponse 
		retrieveBatchJobHistory(AccountingBatchProcessRequest pAccountingBatchProcessRequest)
			throws LMSException;
	
	public AccountingBatchProcessResponse 
		launchBatchJob(AccountingBatchProcessRequest pAccountingBatchProcessRequest)
				throws LMSException;
	
	public AccountingBatchProcessResponse getBatchJobExecutionInfo(
			AccountingBatchProcessRequest pAccountingBatchProcessRequest)
			throws LMSException;

	public List<AccountingBatchHistoryDetailsDto> retrieveBatchJobHistoryDetails(AccountingBatchProcessRequest accountingBatchProcessRequest)
			throws LMSException;

	public void uploadFile(AccountingBatchProcessRequest accountingBatchProcessRequest) throws LMSException;
	
	public Date getformattedlocalDate(AccountingBatchProcessRequest accountingBatchProcessRequest) throws LMSException;
}
