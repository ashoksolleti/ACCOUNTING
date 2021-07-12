package com.unisys.trans.logistics.lms.framework.preferences;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.TargetsUploadStatusIndicator;

public class TargetsUploadDto extends PersistenceObjectDto{
	
	 
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		private Long oId;
		
		private String supportData;

	    private String userID;
	    
	    private String filename;
	   
	    private String station;
	    
	    private Date uploadDate;

	    private String description;
	    
		private byte[] uploadFile;
	    
		private byte[] resultsFile;
	    
	    private TargetsUploadStatusIndicator statusIndicator;
	    
	    private Date resultDate;
	    
	    private Date fromDate;
			
		private Date toDate;
		
		private long fileSize;
		
		private byte[] fileArray;
		
		private Boolean isUpload;
		
		private Date fileRetentionDate;

		
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
		 * @return the fileArray
		 */
		public byte[] getFileArray() {
			return fileArray;
		}

		/**
		 * @param fileArray the fileArray to set
		 */
		public void setFileArray(byte[] fileArray) {
			if(fileArray!=null){
			this.fileArray = fileArray.clone();
			}
			else {
			this.fileArray = null;	
			}
		}

		/**
		 * @return the supportData
		 */
		public String getSupportData() {
			return supportData;
		}

		/**
		 * @param supportData the supportData to set
		 */
		public void setSupportData(String supportData) {
			this.supportData = supportData;
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


		/**
		 * @return the oId
		 */
		public Long getoId() {
			return oId;
		}

		/**
		 * @param oId the oId to set
		 */
		public void setoId(Long oId) {
			this.oId = oId;
		}

		/**
		 * @return the userID
		 */
		public String getUserID() {
			return userID;
		}

		/**
		 * @param userID the userID to set
		 */
		public void setUserID(String userID) {
			this.userID = userID;
		}

		/**
		 * @return the filename
		 */
		public String getFilename() {
			return filename;
		}

		/**
		 * @param filename the filename to set
		 */
		public void setFilename(String filename) {
			this.filename = filename;
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
		 * @return the uploadDate
		 */
		public Date getUploadDate() {
			return uploadDate;
		}

		/**
		 * @param uploadDate the uploadDate to set
		 */
		public void setUploadDate(Date uploadDate) {
			this.uploadDate = uploadDate;
		}

		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * @param description the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}

		/**
		 * @return the uploadFile
		 */
		public byte[] getUploadFile() {
			return uploadFile;
		}

		/**
		 * @param uploadFile the uploadFile to set
		 */
		public void setUploadFile(byte[] uploadFile) {
			if(uploadFile!=null){
			this.uploadFile = uploadFile.clone();
			}
			else {
				this.uploadFile = null;	
			}
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
			if(resultsFile!=null){
			this.resultsFile = resultsFile.clone();
			}
			else {
			this.resultsFile = null;	
			}
		}

		/**
		 * @return the statusIndicator
		 */
		public TargetsUploadStatusIndicator getStatusIndicator() {
			return statusIndicator;
		}

		/**
		 * @param statusIndicator the statusIndicator to set
		 */
		public void setStatusIndicator(TargetsUploadStatusIndicator statusIndicator) {
			this.statusIndicator = statusIndicator;
		}

		/**
		 * @return the resultDate
		 */
		public Date getResultDate() {
			return resultDate;
		}

		/**
		 * @param resultDate the resultDate to set
		 */
		public void setResultDate(Date resultDate) {
			this.resultDate = resultDate;
		}

		@Override
		public Long getOId() {
			// TODO Auto-generated method stub
			return oId;
		}


}
