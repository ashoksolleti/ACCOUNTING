/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
/**
 * @author SaifAhmad
 */

package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>InterlineOutwardBillingDto</code> data transfer class for
 * <code>InterlineOutwardBilling</code>.
 * <p>
 * rate This contains the following attributes:<br>
 * <ul>
 * <code>
 * </code>
 * </ul>
 * 
 */

@SuppressWarnings({ "all" })
public class InterlineOutwardBillingDto extends PersistenceObjectDto {

	private static final long serialVersionUID = 1L;

	private Long oId;

	private Date scheduleFromDate;

	private Date scheduleToDate;

	private String clearingHouse;

	private String accountingMonth;

	private String fileName = "DownloadIDECFile.txt";

	private String xmlFileName = "DownloadIDECFile.xml";
	
	private String zipFileName;
	
	private String attachFileName;
	
	private String attachFilePath;
	
	private byte[] attachFileContent;

	private byte[] byteIdecContent;

	private byte[] byteXmlContent;

	private boolean error = false;
	
	private boolean processSISFile=false;
	
	private boolean processZIPFile=false;
	
	private boolean reProcessZIPFile=false;
	
	private boolean enableSISProcess = true;
	
	private boolean enableZIPFileProcess = true;
	
	private boolean enableZIPFileReProcess = true;

	private String specificAirline;

	private int rateRowIndex;
	
	private String status;
	
	private Date attchGenDate;
	
	private String scheduleStatus;

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public void setByteIdecContent(byte[] byteIdecContent) {
		this.byteIdecContent = byteIdecContent;
	}

	public byte[] getByteIdecContent() {
		return byteIdecContent;
	}

	public Date getScheduleFromDate() {
		return scheduleFromDate;
	}

	public void setScheduleFromDate(Date scheduleFromDate) {
		this.scheduleFromDate = scheduleFromDate;
	}

	public Date getScheduleToDate() {
		return scheduleToDate;
	}

	public void setScheduleToDate(Date scheduleToDate) {
		this.scheduleToDate = scheduleToDate;
	}

	public String getClearingHouse() {
		return clearingHouse;
	}

	public void setClearingHouse(String clearingHouse) {
		this.clearingHouse = clearingHouse;
	}

	public String getAccountingMonth() {
		return accountingMonth;
	}

	public void setAccountingMonth(String accountingMonth) {
		this.accountingMonth = accountingMonth;
	}

	public String getFileName() {
		if ((fileName != null) && (!fileName.isEmpty()))
			return fileName;
		else
			return "DownloadIDECFile.txt";
	}

	public void setFileName(String fileName) {
		if ((fileName != null) && (!fileName.isEmpty()))
			this.fileName = fileName;
	}

	/**
	 * @return the byteXmlContent
	 */
	public byte[] getByteXmlContent() {
		return byteXmlContent;
	}

	/**
	 * @param byteXmlContent
	 *            the byteXmlContent to set
	 */
	public void setByteXmlContent(byte[] byteXmlContent) {
		this.byteXmlContent = byteXmlContent;
	}

	/**
	 * @return the xmlFileName
	 */
	public String getXmlFileName() {
		return xmlFileName;
	}

	/**
	 * @param xmlFileName
	 *            the xmlFileName to set
	 */
	public void setXmlFileName(String xmlFileName) {
		this.xmlFileName = xmlFileName;
	}

	@Override
	public Long getOId() {

		return oId;
	}

	public Long getoId() {

		return this.oId;
	}

	public Long setoId(Long oid) {
		this.oId = oid;
		return null;
	}

	public Long setOId(Long oid) {
		this.oId = oid;
		return null;
	}
	public String getSpecificAirline() {
		return this.specificAirline;
	}

	/**
	 * @param specificAirline the specificAirline to set
	 */
	public void setSpecificAirline(final String specificAirline) {
		this.specificAirline = specificAirline;
	}


	public boolean isEnableSISProcess() {
		return enableSISProcess;
	}

	public void setEnableSISProcess(boolean enableSISProcess) {
		this.enableSISProcess = enableSISProcess;
	}
	
	
	
	public boolean isEnableZIPFileProcess() {
		return enableZIPFileProcess;
	}

	public void setEnableZIPFileProcess(boolean enableZIPFileProcess) {
		this.enableZIPFileProcess = enableZIPFileProcess;
	}

	/**
	 * @return the rateRowIndex
	 */
	public int getRateRowIndex() {
		return rateRowIndex;
	}

	public boolean isProcessSISFile() {
		return processSISFile;
	}

	public void setProcessSISFile(boolean processSISFile) {
		this.processSISFile = processSISFile;
	}

	public boolean isProcessZIPFile() {
		return processZIPFile;
	}

	public void setProcessZIPFile(boolean processZIPFile) {
		this.processZIPFile = processZIPFile;
	}

	/**
	 * @param rateRowIndex
	 *            the rateRoenableGenerateButtonwIndex to set
	 */
	public void setRateRowIndex(int rateRowIndex) {
		this.rateRowIndex = rateRowIndex;
	}

	public String getZipFileName() {
		return zipFileName;
	}

	public void setZipFileName(String zipFileName) {
		this.zipFileName = zipFileName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isReProcessZIPFile() {
		return reProcessZIPFile;
	}

	public void setReProcessZIPFile(boolean reProcessZIPFile) {
		this.reProcessZIPFile = reProcessZIPFile;
	}

	public boolean isEnableZIPFileReProcess() {
		return enableZIPFileReProcess;
	}

	public void setEnableZIPFileReProcess(boolean enableZIPFileReProcess) {
		this.enableZIPFileReProcess = enableZIPFileReProcess;
	}

	public String getAttachFileName() {
		return attachFileName;
	}

	public void setAttachFileName(String attachFileName) {
		this.attachFileName = attachFileName;
	}

	public byte[] getAttachFileContent() {
		return attachFileContent;
	}

	public void setAttachFileContent(byte[] attachFileContent) {
		this.attachFileContent = attachFileContent;
	}

	public String getAttachFilePath() {
		return attachFilePath;
	}

	public void setAttachFilePath(String attachFilePath) {
		this.attachFilePath = attachFilePath;
	}
	
	public Date getAttchGenDate() {
		return attchGenDate;
	}

	public void setAttchGenDate(Date attchGenDate) {
		this.attchGenDate = attchGenDate;
	}

	public String getScheduleStatus() {
		return scheduleStatus;
	}

	public void setScheduleStatus(String scheduleStatus) {
		this.scheduleStatus = scheduleStatus;
	}
	
}