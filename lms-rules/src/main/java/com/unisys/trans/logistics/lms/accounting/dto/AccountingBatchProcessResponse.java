package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;


/**
 * 
 * @author SSeshaS
 *
 */

/**
 *<code>BatchProcessResponse</code> contains all the details 
 * of response such as Batch History details or details of a launched job sent from the service .
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li>cassFileUploadDto
 * </ul>
 */
public class AccountingBatchProcessResponse extends AbstractResponse{

	private static final long serialVersionUID = 4335107661610001860L;

	private AccountingBatchJobHistoryDto jobHistoryDto;
	
	private AccountingBatchJobExecution jobExecutionDto;

	private boolean success = false;

	private String launchedInstanceId = "";
	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public AccountingBatchJobHistoryDto getJobHistoryDto() {
		return jobHistoryDto;
	}

	public void setJobHistoryDto(AccountingBatchJobHistoryDto jobHistoryDto) {
		this.jobHistoryDto = jobHistoryDto;
	}

	public String getLaunchedInstanceId() {
		return launchedInstanceId;
	}

	public void setLaunchedInstanceId(String launchedInstanceId) {
		this.launchedInstanceId = launchedInstanceId;
	}

	public AccountingBatchJobExecution getJobExecutionDto() {
		return jobExecutionDto;
	}

	public void setJobExecutionDto(AccountingBatchJobExecution jobExecutionDto) {
		this.jobExecutionDto = jobExecutionDto;
	}
	
}
