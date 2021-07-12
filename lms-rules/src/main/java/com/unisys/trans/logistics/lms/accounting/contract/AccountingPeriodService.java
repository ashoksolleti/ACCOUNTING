package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingPeriodRequest; 
import com.unisys.trans.logistics.lms.accounting.dto.AccountingPeriodResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import java.io.Serializable;

public interface AccountingPeriodService extends Serializable{

	AccountingPeriodResponse processAccountingPeriod(AccountingPeriodRequest accountingPeriodRequest)throws LMSException;
	
	AccountingPeriodResponse retrieveAccountingPeriod(AccountingPeriodRequest accountingPeriodRequest)throws LMSException;
	
}
