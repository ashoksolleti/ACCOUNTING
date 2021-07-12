package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.util.Map;
/**
 * <code>AccountingBatchJobExecution</code> class contain information about a job execution corresponding to a single job instance.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>jobExecutionUrl
 * <li>jobExecutionId
 * <li>jobExecutionStatus
 * <li>startDateTime
 * <li>jobExecutionExitCode
 * <li>jobExecutionExitDesc
 * </code>
 * </ul>
 */
public class AccountingBatchJobExecution implements Serializable{

	private static final long serialVersionUID = 352973382691033L;
	
	private String jobExecutionUrl;

	private Integer jobExecutionId;
	
	private String jobExecutionStatus;
	
	private String startDateTime;

	private String jobExecutionExitCode;
	
	private String jobExecutionExitDesc;
	
	private String jobInstanceUrl;
	
	private Integer jobInstanceId;

	public Integer getJobExecutionId() {
		return jobExecutionId;
	}

	public void setJobExecutionId(Integer jobExecutionId) {
		this.jobExecutionId = jobExecutionId;
	}

	public String getJobExecutionUrl() {
		return jobExecutionUrl;
	}

	public void setJobExecutionUrl(String jobExecutionUrl) {
		this.jobExecutionUrl = jobExecutionUrl;
	}

	public String getJobExecutionExitCode() {
		return jobExecutionExitCode;
	}

	public void setJobExecutionExitCode(String jobExecutionExitCode) {
		this.jobExecutionExitCode = jobExecutionExitCode;
	}

	public String getJobExecutionExitDesc() {
		return jobExecutionExitDesc;
	}

	public void setJobExecutionExitDesc(String jobExecutionExitDesc) {
		this.jobExecutionExitDesc = jobExecutionExitDesc;
	}

	public String getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}
	
	public String getJobExecutionStatus() {
		return jobExecutionStatus;
	}

	public void setJobExecutionStatus(String jobExecutionStatus) {
		this.jobExecutionStatus = jobExecutionStatus;
	}

	public String getJobInstanceUrl() {
		return jobInstanceUrl;
	}

	public void setJobInstanceUrl(String jobInstanceUrl) {
		this.jobInstanceUrl = jobInstanceUrl;
	}

	public Integer getJobInstanceId() {
		return jobInstanceId;
	}

	public void setJobInstanceId(Integer jobInstanceId) {
		this.jobInstanceId = jobInstanceId;
	}
	
}
