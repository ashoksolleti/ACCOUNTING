package com.unisys.trans.logistics.lms.framework.dto;

import java.util.Arrays;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ShipmentAttachmentsDto</code> entity contains specific data applicable
 * to the ShipmentAttachments.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>airWaybillNumberDto
 * <li>bpmfilename
 * <li>bpmfunction
 * <li>bpmProcess
 * <li>createdDate
 * <li>deleteDatetime
 * <li>deleteSelect
 * <li>deleteStation
 * <li>deleteUserID
 * <li>description
 * <li>destination
 * <li>fileContents
 * <li>fileContentType
 * <li>oId
 * <li>rowIndex
 * <li>station
 * <li>status
 * <li>uploadDate
 * <li>userID
 * <li>fileSize
 * */
public class ShipmentAttachmentsDto extends PersistenceObjectDto {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Attribute to hold the <code>airWaybillNumberDto</code> property.
	 */
	private AirWaybillNumberDto airWaybillNumberDto;

	/**
	 * Attribute to hold the <code>bpmfilename</code> property.
	 */
	private String bpmfilename;

	/**
	 * Attribute to hold the <code>bpmfunction</code> property.
	 */
	private String bpmfunction;

	/**
	 * Attribute to hold the <code>bpmProcess</code> property.
	 */
	private String bpmProcess;

	/**
	 * Attribute to hold the <code>createdDate</code> property.
	 */
	private Date createdDate;

	/**
	 * Attribute to hold the <code>deleteDatetime</code> property.
	 */
	private Date deleteDatetime;

	/**
	 * Attribute to hold the <code>deleteSelect</code> property.
	 */
	private boolean deleteSelect;

	/**
	 * Attribute to hold the <code>deleteSelectFromUI</code> property.
	 */
	private boolean deleteSelectFromUI;

	/**
	 * Attribute to hold the <code>deleteStation</code> property.
	 */
	private String deleteStation;

	/**
	 * Attribute to hold the <code>deleteUserID</code> property.
	 */
	private String deleteUserID;

	/**
	 * Attribute to hold the <code>description</code> property.
	 */
	private String description;

	/**
	 * Attribute to hold the <code>destination</code> property.
	 */
	private String destination;

	/**
	 * Attribute to hold the <code>contents</code> property.
	 */
	private byte[] fileContents;

	/**
	 * Attribute to hold the <code>contentType</code> property.
	 */
	private String fileContentType;

	/**
	 * Attribute to hold the <code>fileSize</code> property.
	 */
	private long fileSize;

	/**
	 * Attribute to hold the <code>oId</code> property.
	 */
	private Long oId;

	/**
	 * Attribute to hold the <code> origin</code> property.
	 */
	private String origin;

	/**
	 * Attribute to hold the <code> origin</code> property.
	 */
	private String rowIndex;

	/**
	 * Attribute to hold the <code>station</code> property.
	 */
	private String station;

	/**
	 * Attribute to hold the <code>status</code> property.
	 */
	private String status;

	/**
	 * Attribute to hold the <code>uploadDate</code> property.
	 */
	private Date uploadDate;

	/**
	 * Attribute to hold the <code>userID</code> property.
	 */
	private String userID;

	/**
	 * Attribute to hold <code>airwaybillDto</code> property.
	 */
	private AirWaybillDto airwaybillDto;

	/**
	 * Attribute to hold <code>jsonObject</code> property.
	 */
	private String jsonObject;
	
	private boolean checkListIndicator =true;

	/**
	 * @return the airwaybillDto
	 */
	public AirWaybillDto getAirwaybillDto() {
		if (this.airwaybillDto == null) {
			this.airwaybillDto = new AirWaybillDto();
		}
		return this.airwaybillDto;
	}

	/**
	 * @param pAirwaybillDto
	 *            the airwaybillDto to set
	 */
	public void setAirwaybillDto(final AirWaybillDto pAirwaybillDto) {
		this.airwaybillDto = pAirwaybillDto;
	}

	/**
	 * Gets the value of <code>airWaybillNumberDto</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>airWaybillNumberDto</code>
	 *         property.<br>
	 */
	public AirWaybillNumberDto getAirWaybillNumberDto() {
		return this.airWaybillNumberDto;
	}

	/**
	 * Gets the value of <code>bpmfilename</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>bpmfilename</code> property.<br>
	 */
	public String getBpmfilename() {
		return this.bpmfilename;
	}

	/**
	 * Gets the value of <code>bpmfunction</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>bpmfunction</code> property.<br>
	 */
	public String getBpmfunction() {
		return this.bpmfunction;
	}

	/**
	 * Gets the value of <code>bpmProcess</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>bpmProcess</code> property.<br>
	 */
	public String getBpmProcess() {
		return this.bpmProcess;
	}

	/**
	 * Gets the value of <code>createdDate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>createdDate</code> property.<br>
	 */
	public Date getCreatedDate() {
		return ContractUtility.getClonedDate(this.createdDate);
	}

	/**
	 * Gets the value of <code>deleteDatetime</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>deleteDatetime</code> property.<br>
	 */
	public Date getDeleteDatetime() {
		return ContractUtility.getClonedDate(this.deleteDatetime);
	}

	/**
	 * Gets the value of <code>deleteStation</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>deleteStation</code> property.<br>
	 */
	public String getDeleteStation() {
		return this.deleteStation;
	}

	/**
	 * Gets the value of <code>deleteUserID</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>deleteUserID</code> property.<br>
	 */
	public String getDeleteUserID() {
		return this.deleteUserID;
	}

	/**
	 * Gets the value of <code>description</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>description</code> property.<br>
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Gets the value of <code>destination</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>destination</code> property.<br>
	 */
	public String getDestination() {
		return this.destination;
	}

	/**
	 * Gets the value of <code>fileContents</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>fileContents</code> property.<br>
	 */
	public byte[] getFileContents() {
		if(this.fileContents!=null){
            return this.fileContents.clone();
            }
            else{
                   return null;
            }

	}

	/**
	 * Gets the value of <code>fileContentType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>fileContentType</code> property.<br>
	 */
	public String getFileContentType() {
		return this.fileContentType;
	}

	/**
	 * Gets the value of <code>fileSize</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>fileSize</code> property.<br>
	 */
	public long getFileSize() {
		return this.fileSize;
	}

	/**
	 * Gets the value of <code>oId</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>oId</code> property.<br>
	 */
	@Override
	public Long getOId() {
		return this.oId;
	}

	/**
	 * Gets the value of <code>origin</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>origin</code> property.<br>
	 */
	public String getOrigin() {
		return this.origin;
	}

	/**
	 * Gets the value of <code>rowIndex</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>rowIndex</code> property.<br>
	 */
	public String getRowIndex() {
		return this.rowIndex;
	}

	/**
	 * Gets the value of <code>station</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>station</code> property.<br>
	 */
	public String getStation() {
		return this.station;
	}

	/**
	 * Gets the value of <code>status</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>status</code> property.<br>
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * Gets the value of <code>uploadDate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>uploadDate</code> property.<br>
	 */
	public Date getUploadDate() {
		return ContractUtility.getClonedDate(this.uploadDate);
	}

	/**
	 * Gets the value of <code>userID</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>userID</code> property.<br>
	 */
	public String getUserID() {
		return this.userID;
	}

	/**
	 * Gets the value of <code>deleteSelect</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>deleteSelect</code> property.<br>
	 */
	public boolean isDeleteSelect() {
		return this.deleteSelect;
	}

	/**
	 * Sets the <code>airWaybillNumberDto</code> property.
	 * 
	 * @param pAirWaybillNumberDto
	 *            holds the new value of <code>airWaybillNumberDto</code>.<br>
	 */
	public void setAirWaybillNumberDto(
			final AirWaybillNumberDto pAirWaybillNumberDto) {
		this.airWaybillNumberDto = pAirWaybillNumberDto;
	}

	/**
	 * Sets the <code>bpmfilename</code> property.
	 * 
	 * @param pBpmfilename
	 *            holds the new value of <code>bpmfilename</code>.<br>
	 */
	public void setBpmfilename(final String pBpmfilename) {
		this.bpmfilename = pBpmfilename;
	}

	/**
	 * Sets the <code>bpmfunction</code> property.
	 * 
	 * @param pBpmfunction
	 *            holds the new value of <code>bpmfunction</code>.<br>
	 */
	public void setBpmfunction(final String pBpmfunction) {
		this.bpmfunction = pBpmfunction;
	}

	/**
	 * Sets the <code>bpmProcess</code> property.
	 * 
	 * @param pBpmProcess
	 *            holds the new value of <code>bpmProcess</code>.<br>
	 */
	public void setBpmProcess(final String pBpmProcess) {
		this.bpmProcess = pBpmProcess;
	}

	/**
	 * Sets the <code>createdDate</code> property.
	 * 
	 * @param pCreatedDate
	 *            holds the new value of <code>createdDate</code>.<br>
	 */
	public void setCreatedDate(final Date pCreatedDate) {
		this.createdDate = ContractUtility.getClonedDate(pCreatedDate);
	}

	/**
	 * Sets the <code>deleteDatetime</code> property.
	 * 
	 * @param pDeleteDatetime
	 *            holds the new value of <code>deleteDatetime</code>.<br>
	 */
	public void setDeleteDatetime(final Date pDeleteDatetime) {
		this.deleteDatetime = ContractUtility.getClonedDate(pDeleteDatetime);
	}

	/**
	 * Sets the <code>deleteSelect</code> property.
	 * 
	 * @param pDeleteSelect
	 *            holds the new value of <code>deleteSelect</code>.<br>
	 */
	public void setDeleteSelect(final boolean pDeleteSelect) {
		this.deleteSelect = pDeleteSelect;
	}

	/**
	 * Sets the <code>deleteStation</code> property.
	 * 
	 * @param pDeleteStation
	 *            holds the new value of <code>deleteStation</code>.<br>
	 */
	public void setDeleteStation(final String pDeleteStation) {
		this.deleteStation = pDeleteStation;
	}

	/**
	 * Sets the <code>deleteUserID</code> property.
	 * 
	 * @param pDeleteUserID
	 *            holds the new value of <code>deleteUserID</code>.<br>
	 */
	public void setDeleteUserID(final String pDeleteUserID) {
		this.deleteUserID = pDeleteUserID;
	}

	/**
	 * Sets the <code>description</code> property.
	 * 
	 * @param pDescription
	 *            holds the new value of <code>description</code>.<br>
	 */
	public void setDescription(final String pDescription) {
		this.description = pDescription;
	}

	/**
	 * Sets the <code>destination</code> property.
	 * 
	 * @param pDestination
	 *            holds the new value of <code>destination</code>.<br>
	 */
	public void setDestination(final String pDestination) {
		this.destination = pDestination;
	}

	/**
	 * Sets the <code>fileContents</code> property.
	 * 
	 * @param pFileContents
	 *            holds the new value of <code>fileContents</code>.<br>
	 */
	public void setFileContents(final byte[] pFileContents) {
		this.fileContents = (pFileContents == null ? null : Arrays.copyOf(
				pFileContents, pFileContents.length));

	}

	/**
	 * Sets the <code>fileContentType</code> property.
	 * 
	 * @param pFileContentType
	 *            holds the new value of <code>fileContentType</code>.<br>
	 */
	public void setFileContentType(final String pFileContentType) {
		this.fileContentType = pFileContentType;
	}

	/**
	 * Sets the <code>fileSize</code> property.
	 * 
	 * @param pFileSize
	 *            holds the new value of <code>fileSize</code>.<br>
	 */
	public void setFileSize(final long pFileSize) {
		this.fileSize = pFileSize;
	}

	/**
	 * Sets the <code>oId</code> property.
	 * 
	 * @param pOId
	 *            holds the new value of <code>oId</code>.<br>
	 */
	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

	/**
	 * Sets the <code>origin</code> property.
	 * 
	 * @param pOrigin
	 *            holds the new value of <code>origin</code>.<br>
	 */
	public void setOrigin(final String pOrigin) {
		this.origin = pOrigin;
	}

	/**
	 * Sets the <code>rowIndex</code> property.
	 * 
	 * @param pRowIndex
	 *            holds the new value of <code>rowIndex</code>.<br>
	 */
	public void setRowIndex(final String pRowIndex) {
		this.rowIndex = pRowIndex;
	}

	/**
	 * Sets the <code>station</code> property.
	 * 
	 * @param pStation
	 *            holds the new value of <code>station</code>.<br>
	 */
	public void setStation(final String pStation) {
		this.station = pStation;
	}

	/**
	 * Sets the <code>status</code> property.
	 * 
	 * @param pStatus
	 *            holds the new value of <code>status</code>.<br>
	 */
	public void setStatus(final String pStatus) {
		this.status = pStatus;
	}

	/**
	 * Sets the <code>uploadDate</code> property.
	 * 
	 * @param pUploadDate
	 *            holds the new value of <code>uploadDate</code>.<br>
	 */
	public void setUploadDate(final Date pUploadDate) {
		this.uploadDate = ContractUtility.getClonedDate(pUploadDate);
	}

	/**
	 * Sets the <code>userID</code> property.
	 * 
	 * @param pUserID
	 *            holds the new value of <code>userID</code>.<br>
	 */
	public void setUserID(final String pUserID) {
		this.userID = pUserID;
	}

	/**
	 * @return the jsonObject
	 */
	public String getJsonObject() {
		return this.jsonObject;
	}

	/**
	 * @param pJsonObject
	 *            the jsonObject to set
	 */
	public void setJsonObject(final String pJsonObject) {
		this.jsonObject = pJsonObject;
	}

	/**
	 * @return the deleteSelectFromUI
	 */
	public boolean isDeleteSelectFromUI() {
		return this.deleteSelectFromUI;
	}

	/**
	 * @param pDeleteSelectFromUI
	 *            the deleteSelectFromUI to set
	 */
	public void setDeleteSelectFromUI(final boolean pDeleteSelectFromUI) {
		this.deleteSelectFromUI = pDeleteSelectFromUI;
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
	 * @return the checkListIndicator
	 */
	public boolean isCheckListIndicator() {
		return checkListIndicator;
	}

	/**
	 * @param checkListIndicator the checkListIndicator to set
	 */
	public void setCheckListIndicator(boolean checkListIndicator) {
		this.checkListIndicator = checkListIndicator;
	}

}
