package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.util.List;
/**
 * <code>AccountingBatchJobHistoryDto</code> class contain history information related to an Accounting Batch Job.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>jobUrl
 * <li>jobName
 * <li>jobInstanceList
 * <li>nextPageUrl
 * </code>
 * </ul>
 */
public class AccountingBatchJobHistoryDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7651058501302037929L;

	private String jobUrl;
	
	private String jobName;
	
	private List<AccountingBatchJobInstance> jobInstanceList;
	
	private String nextPageUrl;

	private String specificAirline;
	
	public String getJobUrl() {
		return jobUrl;
	}
	
	public void setJobUrl(String jobUrl) {
		this.jobUrl = jobUrl;
	}
	
	public String getJobName() {
		return jobName;
	}
	
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	public List<AccountingBatchJobInstance> getJobInstanceList() {
		return jobInstanceList;
	}
	
	public void setJobInstanceList(List<AccountingBatchJobInstance> jobInstanceList) {
		this.jobInstanceList = jobInstanceList;
	}
	
	public String getNextPageUrl() {
		return nextPageUrl;
	}
	
	public void setNextPageUrl(String nextPageUrl) {
		this.nextPageUrl = nextPageUrl;
	}
	/**
	 * @return the specificAirline
	 */
	public String getSpecificAirline() {
		return this.specificAirline;
	}

	/**
	 * @param specificAirline the specificAirline to set
	 */
	public void setSpecificAirline(final String specificAirline) {
		this.specificAirline = specificAirline;
	}
}
