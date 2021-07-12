package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.util.Map;
/**
 * <code>AccountingBatchJobInstance</code> class contain information about a single JobInstance of an Accounting Batch Job.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>jobInstanceId
 * <li>jobInstanceUrl
 * <li>executionCount
 * <li>lastJobExecutionUrl
 * <li>lastJobExecutionStatus
 * <li>userId
 * <li>jobParameters
 * </code>
 * </ul>
 */
public class AccountingBatchJobInstance implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3527129733826914033L;

	private String jobInstanceId;
	
	private String jobInstanceUrl;
	
	private Integer executionCount;
	
	private String lastJobExecutionUrl;
	
	private String lastJobExecutionStatus;
	
	private String userId;
	
	private Map<String,String> jobParameters;
	
	private String startDateTime;
	
	public String getJobInstanceId() {
		return jobInstanceId;
	}
	
	public void setJobInstanceId(String jobInstanceId) {
		this.jobInstanceId = jobInstanceId;
	}
	
	public String getJobInstanceUrl() {
		return jobInstanceUrl;
	}
	
	public void setJobInstanceUrl(String jobInstanceUrl) {
		this.jobInstanceUrl = jobInstanceUrl;
	}
	
	public Integer getExecutionCount() {
		return executionCount;
	}
	
	public void setExecutionCount(Integer executionCount) {
		this.executionCount = executionCount;
	}
	
	public String getLastJobExecutionUrl() {
		return lastJobExecutionUrl;
	}
	
	public void setLastJobExecutionUrl(String lastJobExecutionUrl) {
		this.lastJobExecutionUrl = lastJobExecutionUrl;
	}
	
	public String getLastJobExecutionStatus() {
		return lastJobExecutionStatus;
	}
	
	public void setLastJobExecutionStatus(String lastJobExecutionStatus) {
		this.lastJobExecutionStatus = lastJobExecutionStatus;
	}
	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Map<String, String> getJobParameters() {
		return jobParameters;
	}
	
	public void setJobParameters(Map<String, String> jobParameters) {
		this.jobParameters = jobParameters;
	}

	public String getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}
	
}
