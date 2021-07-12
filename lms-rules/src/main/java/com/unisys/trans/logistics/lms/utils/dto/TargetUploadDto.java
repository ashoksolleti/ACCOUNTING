/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.TargetsUploadCSVDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.TargetsUploadStatusIndicator;
/**
 * RFC UIS157
 * <code>TargetUploadDto</code> holds the fixed space allocated for a
 * Targets csv file.<br>
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>supportData</li>
 * <li>userId</li>
 * <li>station</li>
 * <li>fromDate</li>
 * <li>toDate</li>
 * <li>fileRetentionDate</li>
 * <li>fileArray</li>
 * <li>fileName</li>
 * <li>fileSize</li>
 * <li>isUpload</li>
 * <li>listUploadCSVDtos</li>
 * <li>listResultsCSVDtos</li>
 * <li>uploadedFile</li>
 * <li>resultsFile</li>
 * <li>fileStatus</li>
 * <li>description</li>
 * </code>
 * </ul>
 */
public class TargetUploadDto extends PersistenceObjectDto {

    
	private static final String EMPTY_STRING = "";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * Attribute to hold <code>supportData</code> property.
     */
	
	private String supportData;

	/**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;
	
	/**
     * Attribute to hold <code>userId</code> property.
     */
	private String userId;
	

	/**
     * Attribute to hold <code>station</code> property.
     */
	private String station;
	

	/**
     * Attribute to hold <code>fromDate</code> property.
     */
	private Date fromDate;
	

	/**
     * Attribute to hold <code>toDate</code> property.
     */
	private Date toDate;
	

	/**
     * Attribute to hold <code>fileRetentionDate</code> property.
     */
	

	/**
     * Attribute to hold <code>fileArray</code> property.
     */
	

	/**
     * Attribute to hold <code>fileName</code> property.
     */
	private String uploadFileName;
	

	/**
     * Attribute to hold <code>fileName</code> property.
     */
	private String resultsFileName;
	/**
     * Attribute to hold <code>fileSize</code> property.
     */
	private long fileSize;
	
	private byte[] fileArray;

	/**
     * Attribute to hold <code>isUpload</code> property.
     */
	private Boolean isUpload;
	private Date fileRetentionDate;
	

	/**
     * Attribute to hold <code>listUploadCSVDtos</code> property.
     */
	private List<TargetsUploadCSVDto> listUploadCSVDtos;
	

	/**
     * Attribute to hold <code>listResultsCSVDtos</code> property.
     */
	private List<TargetsUploadCSVDto> listResultsCSVDtos;
	

	/**
     * Attribute to hold <code>uploadedFile</code> property.
     */
	private byte[] uploadedFile;
	

	/**
     * Attribute to hold <code>resultsFile</code> property.
     */
	private byte[] resultsFile;
	

	/**
     * Attribute to hold <code>fileStatus</code> property.
     */
	private TargetsUploadStatusIndicator fileStatus;
	

	/**
     * Attribute to hold <code>description</code> property.
     */
	private String description;
	
	/**
     * Attribute to hold <code>uploadedDate</code> property.
     */
	private Date uploadedDate;
	
	/**
     * Attribute to hold <code>fileName</code> property.
     */
	private String fileName;
	
	private boolean status;
	
	private Date resultDate;
	
	private String uploadDateAsString;
	
	private String resultDateAsString;
	
	



	/**
	 * @return the uploadDateAsString
	 */
	public String getUploadDateAsString() {
		return uploadDateAsString;
	}



	/**
	 * @param uploadDateAsString the uploadDateAsString to set
	 */
	public void setUploadDateAsString(String uploadDateAsString) {
		this.uploadDateAsString = uploadDateAsString;
	}



	/**
	 * @return the resultDateAsString
	 */
	public String getResultDateAsString() {
		return resultDateAsString;
	}



	/**
	 * @param resultDateAsString the resultDateAsString to set
	 */
	public void setResultDateAsString(String resultDateAsString) {
		this.resultDateAsString = resultDateAsString;
	}



	public Date getUploadedDate() {
		return uploadedDate;
	}



	public void setUploadedDate(Date uploadedDate) {
		this.uploadedDate = uploadedDate;
	}



	public Date getResultDate() {
		return resultDate;
	}



	public void setResultDate(Date resultDate) {
		this.resultDate = resultDate;
	}



	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}



	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}



	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}



	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	/**
	 * @return the listUploadCSVDtos
	 */
	public List<TargetsUploadCSVDto> getListUploadCSVDtos() {
		return listUploadCSVDtos;
	}



	/**
	 * @param listUploadCSVDtos the listUploadCSVDtos to set
	 */
	public void setListUploadCSVDtos(List<TargetsUploadCSVDto> listUploadCSVDtos) {
		this.listUploadCSVDtos = listUploadCSVDtos;
	}



	/**
	 * @return the listResultsCSVDtos
	 */
	public List<TargetsUploadCSVDto> getListResultsCSVDtos() {
		return listResultsCSVDtos;
	}



	/**
	 * @param listResultsCSVDtos the listResultsCSVDtos to set
	 */
	public void setListResultsCSVDtos(List<TargetsUploadCSVDto> listResultsCSVDtos) {
		this.listResultsCSVDtos = listResultsCSVDtos;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public TargetsUploadStatusIndicator getFileStatus() {
		return fileStatus;
	}



	public void setFileStatus(TargetsUploadStatusIndicator fileStatus) {
		this.fileStatus = fileStatus;
	}



	/**
	 * @return the uploadedFile
	 */
	public byte[] getUploadedFile() {
		return uploadedFile;
	}



	/**
	 * @param uploadedFile the uploadedFile to set
	 */
	public void setUploadedFile(byte[] uploadedFile) {
        this.uploadedFile = (uploadedFile == null ? null : Arrays.copyOf(
            uploadedFile, uploadedFile.length));
}



	/**
	 * @return the resultsFile
	 */
	public byte[] getResultsFile() {
		return resultsFile;
	}



	/**
	 * @param resultsFile the resultsFile to set
	 */
	public void setResultsFile(byte[] resultsFile) {
        this.resultsFile = (resultsFile == null ? null : Arrays.copyOf(
            resultsFile, resultsFile.length));
}




	/**
	 * @return the isUpload
	 */
	public Boolean getIsUpload() {
		return isUpload;
	}



	/**
	 * @param isUpload the isUpload to set
	 */
	public void setIsUpload(Boolean isUpload) {
		this.isUpload = isUpload;
	}



	/**
	 * @return the fileArray
	 */
	public byte[] getFileArray() {
		return fileArray;
	}



	/**
	 * @param fileArray the fileArray to set
	 */
	public void setFileArray(byte[] fileArray) {
        this.fileArray = (fileArray == null ? null : Arrays.copyOf(
            fileArray, fileArray.length));
}




	/**
	 * @return the uploadFileName
	 */
	public String getUploadFileName() {
		return uploadFileName;
	}



	/**
	 * @param uploadFileName the uploadFileName to set
	 */
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}



	/**
	 * @return the resultsFileName
	 */
	public String getResultsFileName() {
		return resultsFileName;
	}



	/**
	 * @param resultsFileName the resultsFileName to set
	 */
	public void setResultsFileName(String resultsFileName) {
		this.resultsFileName = resultsFileName;
	}



	/**
	 * @return the fileSize
	 */
	public long getFileSize() {
		return fileSize;
	}



	/**
	 * @param fileSize the fileSize to set
	 */
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}



	/**
	 * @return the fileRetentionDate
	 */
	public Date getFileRetentionDate() {
		return fileRetentionDate;
	}



	/**
	 * @param fileRetentionDate the fileRetentionDate to set
	 */
	public void setFileRetentionDate(Date fileRetentionDate) {
		this.fileRetentionDate = fileRetentionDate;
	}



	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}



	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}



	/**
	 * @return the station
	 */
	public String getStation() {
		return station;
	}



	/**
	 * @param station the station to set
	 */
	public void setStation(String station) {
		this.station = station;
	}



	/**
	 * @return the fromDate
	 */
	public Date getFromDate() {
		return fromDate;
	}



	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}



	/**
	 * @return the toDate
	 */
	public Date getToDate() {
		return toDate;
	}



	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}




	@Override
	public Long getOId() {
		return oId;
	}



	public void setoId(Long oId) {
		this.oId = oId;
	}



	public String getSupportData() {
		return supportData;
	}



	public void setSupportData(String supportData) {
		this.supportData = supportData;
	}

	@Override
	public String toString() {
		String csvString;
		csvString = this.buildSimplifiedstationRestrictionsCSVString();
		return csvString;

	}
	
	private String buildSimplifiedstationRestrictionsCSVString() {
		final StringBuffer csvString = new StringBuffer();
		if (this.getUserId() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getUserId()));

		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getStation() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getStation()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getFileName() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getDescription()));

		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getUploadDateAsString() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getUploadDateAsString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getUploadFileName() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getUploadFileName()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getResultDateAsString() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getResultDateAsString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		if (this.getResultsFileName() != null) {
			csvString.append(this.prefixSuffixByQuotes((this.getResultsFileName())));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		
		return csvString.toString();
	}

	private String prefixSuffixByQuotes(final String pString) {
		final String aQUOTATION = "\"";
		final String aCOMMA = ",";
		final StringBuffer aModifiedString = new StringBuffer();
		aModifiedString.append(aQUOTATION);
		aModifiedString.append(pString);
		aModifiedString.append(aQUOTATION);
		aModifiedString.append(aCOMMA);

		return aModifiedString.toString();
	}
}
