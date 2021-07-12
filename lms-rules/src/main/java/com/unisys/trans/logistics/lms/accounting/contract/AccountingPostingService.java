package com.unisys.trans.logistics.lms.accounting.contract;

import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingPostingRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingPostingResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>AccountingPostingService</code> processes the Accounting Posting Files & Accounting ERP File.
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>retrieve All Posting Files.
 * <li>process Accounting ERP File.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.AccountingPostingRequest
 *      
 */
public interface AccountingPostingService {

	public AccountingPostingResponse retrieveAllPostingFiles(AccountingPostingRequest accountingPostingRequest) throws LMSException;

	public AccountingPostingResponse processAccountingERPFile(
			AccountingPostingRequest accountingPostingRequest) throws LMSException;
	public AccountingPostingResponse generatePostingFile (
			AccountingPostingRequest accountingPostingRequest) throws LMSException;
	public AccountingPostingResponse downloadFile (
			AccountingPostingRequest accountingPostingRequest) throws LMSException;
	public void uploadPostingFile (
			AccountingPostingRequest accountingPostingRequest) throws LMSException;
	 public AccountingPostingResponse generateScheduledGLARFile(
	            AccountingPostingRequest accountingPostingRequest)throws LMSException ;
	public void generateAccountingSAPFile(
			AccountingPostingRequest accountingPostingRequest)
			throws LMSException;
	
	 public void  generateAccountingGSTR1File(AccountingPostingRequest accountingPostingRequest, String filePath,  Date fromDate, Date toDate) throws LMSException;
}