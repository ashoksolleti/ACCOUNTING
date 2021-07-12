/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Arrays;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>FctlUpdateDto</code> contain details of FctUpdate.
 * <p>
 * This contains all information about FctlUpdate.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>CarrierCode
 * <li>FlightNumber
 * <li>StartDate
 * <li>EndDate
 * <li>OldFctl
 * <li>NewFctl
 * <li>NewFctlOffice
 * </ul>
 */

public class FctlUpdateDto extends PersistenceObjectDto {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = -4323443775583337396L;

	@Override
	public String toString() {
		return "FctlUpdateDto [carrierCode=" + carrierCode + ", flightNumber=" + flightNumber + ", startDate="
				+ startDate + ", endDate=" + endDate + ", oldFctl=" + oldFctl + ", newFctl=" + newFctl
				+ ", newFctlOffice=" + newFctlOffice + ", oId=" + oId + ", error=" + error + ", updatedFile="
				+ Arrays.toString(updatedFile) + ", uploadFileSize=" + uploadFileSize + ", uploadFileName="
				+ uploadFileName + ", uploadFileLocation=" + uploadFileLocation + "]";
	}

	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 */
	private String carrierCode;

	/**
	 * Attribute to hold <code>flightNumber</code> property.
	 */
	private String flightNumber;

	/**
	 * Attribute to hold <code>startDate</code> property.
	 */
	private String startDate;

	/**
	 * Attribute to hold <code>endDate</code> property.
	 */
	private String endDate;

	/**
	 * Attribute to hold <code>oldFctl</code> property.
	 */
	private String oldFctl;

	/**
	 * Attribute to hold <code>newFctl</code> property.
	 */
	private String newFctl;

	/**
	 * Attribute to hold <code>newFctlOffice</code> property.
	 */
	private String newFctlOffice;
	/**
	 * Attribute to hold <code>oId</code> property.
	 */
	private Long oId;

	/**
	 * Attribute to hold <code>error</code> property.
	 */
	private boolean error;
	/**
	 * Attribute to hold <code>updatedFile</code> property.
	 */
	private byte[] updatedFile;
	/**
	 * Attribute to hold <code>uploadFileSize</code> property.
	 */
	private long uploadFileSize;
	/**
	 * Attribute to hold <code>uploadFileName</code> property.
	 */
	private String uploadFileName;
	/**
	 * Attribute to hold <code>uploadFileLocation</code> property.
	 */
	private String uploadFileLocation;

	public byte[] getUpdatedFile() {
		return updatedFile;
	}

	public void setUpdatedFile(byte[] updatedFile) {
		this.updatedFile = updatedFile;
	}

	public long getUploadFileSize() {
		return uploadFileSize;
	}

	public void setUploadFileSize(long uploadFileSize) {
		this.uploadFileSize = uploadFileSize;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadFileLocation() {
		return uploadFileLocation;
	}

	public void setUploadFileLocation(String uploadFileLocation) {
		this.uploadFileLocation = uploadFileLocation;
	}

	public FctlUpdateDto() {
	}

	/**
	 * Gets the <code>carrierCode</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 Alphanumeric.
	 * <p>
	 * <b>Example: </b><br>
	 * DL1
	 * <p>
	 * 
	 * @return the current value of the <code>carrierCode</code> property.
	 */
	public Long getoId() {
		return oId;
	}

	public void setoId(Long oId) {
		this.oId = oId;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	/**
	 * Gets the <code>carrierCode</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 Alphanumeric.
	 * <p>
	 * <b>Example: </b><br>
	 * DL1
	 * <p>
	 * 
	 * @return the current value of the <code>carrierCode</code> property.
	 */

	public String getCarrierCode() {
		return this.carrierCode;
	}

	/**
	 * Gets the <code>startDate</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * DDMMMYY
	 * <p>
	 * <b>Example: </b><br>
	 * 18DEC18
	 * <p>
	 * 
	 * @return the current value of the <code>startDate</code> property.
	 */

	public String getStartDate() {
		return this.startDate;
	}

	/**
	 * Sets the <code>startDate</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * DDMMMYY
	 * <p>
	 * <b>Example: </b><br>
	 * 18DEC18
	 * <p>
	 * 
	 * @param pStartDate
	 *            the new value of the <code>startDate</code> property.
	 * @return
	 */
	public void setStartDate(final String pStartDate) {
		this.startDate = pStartDate;
	}

	/**
	 * Gets the <code>endDate</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * DDMMMYY
	 * <p>
	 * <b>Example: </b><br>
	 * 18DEC18
	 * <p>
	 * 
	 * @return the current value of the <code>endDate</code> property.
	 */
	public String getEndDate() {
		return this.endDate;
	}

	/**
	 * Sets the <code>endDate</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * DDMMMYY
	 * <p>
	 * <b>Example: </b><br>
	 * 18DEC18
	 * <p>
	 * 
	 * @param pEndDate
	 *            the new value of the <code>endDate</code> property.
	 */
	public void setEndDate(final String pEndDate) {
		this.endDate = pEndDate;
	}

	/**
	 * Gets the <code>oldFctl</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 5 Alphanumeric
	 * <p>
	 * <b>Example: </b><br>
	 * ABC12
	 * <p>
	 * 
	 * @return the current value of the <code>oldFctl</code> property.
	 */

	public String getOldFctl() {
		return this.oldFctl;
	}

	/**
	 * Sets the <code>oldFctl</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 5 Alphanumeric
	 * <p>
	 * <b>Example: </b><br>
	 * ABC12
	 * <p>
	 * 
	 * @param pOldFctl
	 *            the new value of the <code>oldFctl</code> property.
	 */

	public void setOldFctl(final String oldFctl) {
		this.oldFctl = oldFctl;
	}

	/**
	 * Gets the <code>newFctl</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 5 Alphanumeric
	 * <p>
	 * <b>Example: </b><br>
	 * ABC12
	 * <p>
	 * 
	 * @return the current value of the <code>newFctl</code> property.
	 */
	public String getNewFctl() {
		return this.newFctl;
	}

	/**
	 * Sets the <code>newFctl</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 5 Alphanumeric
	 * <p>
	 * <b>Example: </b><br>
	 * ABC12
	 * <p>
	 * 
	 * @param pOldFctl
	 *            the new value of the <code>newFctl</code> property.
	 */
	public void setNewFctl(final String newFctl) {
		this.newFctl = newFctl;
	}

	/**
	 * Gets the <code>newFctlOffice</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 Alphanumeric
	 * <p>
	 * <b>Example: </b><br>
	 * ABC12
	 * <p>
	 * 
	 * @return the current value of the <code>newFctlOffcie</code> property.
	 */
	public String getNewFctlOffice() {
		return this.newFctlOffice;
	}

	/**
	 * Sets the <code>newFctlOffcie</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 Alphanumeric
	 * <p>
	 * <b>Example: </b><br>
	 * ABC12
	 * <p>
	 * 
	 * @param pOldFctlOffcie
	 *            the new value of the <code>newFctlOffcie</code> property.
	 */

	public void setNewFctlOffice(final String newFctlOffice) {
		this.newFctlOffice = newFctlOffice;
	}

	/**
	 * Gets the <code>flightNumber</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 5 Alphanumeric
	 * <p>
	 * <b>Example: </b><br>
	 * ABC12
	 * <p>
	 * 
	 * @return the current value of the <code>flightNumber</code> property.
	 */
	public String getFlightNumber() {
		return this.flightNumber;
	}

	/**
	 * Sets the <code>flightNumber</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 Alphanumeric
	 * <p>
	 * <b>Example: </b><br>
	 * ABC12
	 * <p>
	 * 
	 * @param pFlightNumber
	 *            the new value of the <code>flightNumber</code> property.
	 */
	public void setFlightNumber(final String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * Sets the <code>carrierCode</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 Alphanumeric
	 * <p>
	 * <b>Example: </b><br>
	 * A12
	 * <p>
	 * 
	 * @param pFlightNumber
	 *            the new value of the <code>flightNumber</code> property.
	 */
	public FctlUpdateDto(final String pCarrierCode) {
		this.carrierCode = pCarrierCode;
	}

	@Override
	public Long getOId() {
		return this.oId;
	}

	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

	public Object getAction() {
		return null;
	}

	/**
	 * Gets the <code>Error</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 Alphanumeric.
	 * <p>
	 * <b>Example: </b><br>
	 * DL1
	 * <p>
	 * 
	 * @return the current value of the <code>carrierCode</code> property.
	 */
	public boolean getError() {
		return error;
	}

	public void setError(boolean berror) {
		this.error = berror;
	}

}
