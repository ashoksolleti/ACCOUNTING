package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * 
 * @author SSeshaS
 *
 */

/**
 * <code>BatchProcessRequest</code> contains all the attributes
 * which are required for launching a Batch Job from Accounting screen and for getting the Batch Job history.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>jobName 
 * <li>jobParameter
 * <li>uriParameter
 * </code>
 * </ul>
 * 
 */
public class AccountingBatchProcessRequest extends AbstractRequest{

	private static final long serialVersionUID = -1724286169103200437L;
	
	private String jobName;
	
	private String jobParameter;
	
	private String uriParameter;
	
	private String specificAirline;
	
	private String fileName;

	private int launchCount = 0;
	
	private byte[] fileInformation;
	
	private Date invoiceGeneration;
	
	//LMSC-5253
	private Date gstrFromDate;
	
	private Date gstrToDate;
	
	private Date localtimeStamp;
	    

    public Date getLocaltimeStamp() {
		return localtimeStamp;
	}

	public void setLocaltimeStamp(Date localtimeStamp) {
		this.localtimeStamp = localtimeStamp;
	}
	
	
	/*public void setInvoiceGeneration(String invoiceGeneration) {
		this.invoiceGeneration = invoiceGeneration;
	}

	

	public String getInvoiceGeneration() {
		return invoiceGeneration;
	}
*/


	public String getJobName() {
		return jobName;
	}

	public Date getInvoiceGeneration() {
		return invoiceGeneration;
	}

	public void setInvoiceGeneration(Date invoiceGeneration) {
		this.invoiceGeneration = invoiceGeneration;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobParameter() {
		return jobParameter;
	}

	public void setJobParameter(String jobParameter) {
		this.jobParameter = jobParameter;
	}

	public String getUriParameter() {
		return uriParameter;
	}

	public void setUriParameter(String uriParameter) {
		this.uriParameter = uriParameter;
	}

	public int getLaunchCount() {
		return launchCount;
	}

	public void incrementLaunchCount() {
		this.launchCount++;
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
	public byte[] getFileInformation() {
		return fileInformation;
	}

	public void setFileInformation(byte[] fileInformation) {
		this.fileInformation = fileInformation;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Date getGstrFromDate() {
		return gstrFromDate;
	}

	public void setGstrFromDate(Date gstrFromDate) {
		this.gstrFromDate = gstrFromDate;
	}

	public Date getGstrToDate() {
		return gstrToDate;
	}

	public void setGstrToDate(Date gstrToDate) {
		this.gstrToDate = gstrToDate;
	}
	
}
