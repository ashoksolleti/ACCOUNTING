package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AccountingPostingFileStatus;
import com.unisys.trans.logistics.lms.accounting.dto.constants.AccountingPostingFileType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
/**
 * <code>AccountingPostingDto</code> domain contain details of AccountingPostingDto.
 * <p>
 * This contains all information about AccountingPostingDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>oId
 * <li>postingFileName
 * <li>postingFileType
 * <li>postingFile
 * <li>postingFileGenerationDate
 * <li>postingFileCreationDate
 * <li>postingFileStatus
 * <li>triggerPoints
 * <li>postingFromDate
 * <li>postingToDate
 * </ul>
 */
public class AccountingPostingDto  extends PersistenceObjectDto{
	 /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;
    /**
     * Attribute to hold <code>postingFileName</code> property.
     */
	private String postingFileName;
	/**
     * Attribute to hold <code>postingFileType</code> property.
     */
	private AccountingPostingFileType postingFileType;
	
	/**
     * Attribute to hold <code>postingFile</code> property.
     */
	private byte[] postingFile;
	/**
     * Attribute to hold <code>postingFileGenerationDate</code> property.
     */
	private Date postingFileGenerationDate;
	/**
     * Attribute to hold <code>postingFileCreationDate</code> property.
     */
	private Date postingFilePostingDate;
	/**
     * Attribute to hold <code>postingFileStatus</code> property.
     */
	private AccountingPostingFileStatus postingFileStatus;
	/**
     * Attribute to hold <code>triggerPoints</code> property.
     */
	private List<String> triggerPoints;
	
	private String postingStatus;
	
	private String accTriggeringPoint;
	
	
	
	/**
     * Attribute to hold <code>postingFromDate</code> property.
     */
	private Date fromDate;
	/**
     * Attribute to hold <code>postingToDate</code> property.
     */
	private Date toDate;
	private String accountingMonth;
	private Integer accountingYear;

	
	
	
	public String getPostingStatus() {
		postingStatus = this.getPostingFileStatus().getType();
		return postingStatus;
	}

	public void setPostingStatus(String postingStatus) {
		this.postingStatus = postingStatus;
	}

	/**
	 * @return the accTriggeringPoint
	 */
	public String getAccTriggeringPoint() {
		return accTriggeringPoint;
	}

	/**
	 * @param accTriggeringPoint the accTriggeringPoint to set
	 */
	public void setAccTriggeringPoint(String accTriggeringPoint) {
		this.accTriggeringPoint = accTriggeringPoint;
	}

	/**
	 * @return the postingFilePostingDate
	 */
	public Date getPostingFilePostingDate() {
		return postingFilePostingDate;
	}

	/**
	 * @param postingFilePostingDate the postingFilePostingDate to set
	 */
	public void setPostingFilePostingDate(Date postingFilePostingDate) {
		this.postingFilePostingDate = postingFilePostingDate;
	}

	/**
	 * @return the accountingMonth
	 */
	public String getAccountingMonth() {
		return accountingMonth;
	}

	/**
	 * @param accountingMonth the accountingMonth to set
	 */
	public void setAccountingMonth(String accountingMonth) {
		this.accountingMonth = accountingMonth;
	}

	/**
	 * @return the accountingYear
	 */
	public Integer getAccountingYear() {
		return accountingYear;
	}

	/**
	 * @param accountingYear the accountingYear to set
	 */
	public void setAccountingYear(Integer accountingYear) {
		this.accountingYear = accountingYear;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return this.oId;
	}

	/**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
	public Long getoId() {
		return oId;
	}

	 /**
     * Sets the <code>oId</code>.
     * <p>
     * 
     * @param oId
     *            holds the new value of <code>oId</code>
     */
	public void setoId(Long oId) {
		this.oId = oId;
	}

	/**
     * Gets the <code>postingFileName</code> property.
     * <p>
     * 
     * @return the current value of the <code>postingFileName</code> property.
     */
	public String getPostingFileName() {
		return postingFileName;
	}

	 /**
     * Sets the <code>postingFileName</code>.
     * <p>
     * 
     * @param postingFileName
     *            holds the new value of <code>postingFileName</code>
     */
	public void setPostingFileName(String postingFileName) {
		this.postingFileName = postingFileName;
	}


	/**
     * Gets the <code>postingFileType</code> property.
     * <p>
     * 
     * @return the current value of the <code>postingFileType</code> property.
     */
	public AccountingPostingFileType getPostingFileType() {
		return postingFileType;
	}
	 /**
     * Sets the <code>postingFileType</code>.
     * <p>
     * 
     * @param postingFileType
     *            holds the new value of <code>postingFileType</code>
     */
	public void setPostingFileType(AccountingPostingFileType postingFileType) {
		this.postingFileType = postingFileType;
	}

	/**
     * Gets the <code>postingFile</code> property.
     * <p>
     * 
     * @return the current value of the <code>postingFile</code> property.
     */
	public byte[] getPostingFile() {
		return postingFile;
	}

	/**
     * Sets the <code>postingFile</code>.
     * <p>
     * 
     * @param postingFileType
     *            holds the new value of <code>postingFile</code>
     */
	public void setPostingFile(byte[] postingFile) {
		this.postingFile = postingFile;
	}

	/**
     * Gets the <code>postingFileGenerationDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>postingFileGenerationDate</code> property.
     */
	public Date getPostingFileGenerationDate() {
		return postingFileGenerationDate;
	}

	/**
     * Sets the <code>postingFileGenerationDate</code>.
     * <p>
     * 
     * @param postingFileType
     *            holds the new value of <code>postingFileGenerationDate</code>
     */
	public void setPostingFileGenerationDate(Date postingFileGenerationDate) {
		this.postingFileGenerationDate = postingFileGenerationDate;
	}

	/**
     * Gets the <code>postingFileCreationDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>postingFileCreationDate</code> property.
     */
	public Date getPostingFileCreationDate() {
		return postingFilePostingDate;
	}


	/**
     * Sets the <code>postingFileGenerationDate</code>.
     * <p>
     * 
     * @param postingFileCreationDate
     *            holds the new value of <code>postingFileCreationDate</code>
     */
	public void setPostingFileCreationDate(Date postingFilePostingDate) {
		this.postingFilePostingDate = postingFilePostingDate;
	}

	/**
     * Gets the <code>postingFileStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>postingFileStatus</code> property.
     */
	public AccountingPostingFileStatus getPostingFileStatus() {
		return postingFileStatus;
	}

	/**
     * Sets the <code>postingFileStatus</code>.
     * <p>
     * 
     * @param postingFileCreationDate
     *            holds the new value of <code>postingFileStatus</code>
     */
	public void setPostingFileStatus(AccountingPostingFileStatus postingFileStatus) {
		this.postingFileStatus = postingFileStatus;
	}
	/**
     * Gets the <code>triggerPoints</code> property.
     * <p>
     * 
     * @return the current value of the <code>triggerPoints</code> property.
     */
	public List<String> getTriggerPoints() {
		return triggerPoints;
	}
	/**
     * Sets the <code>triggerPoints</code>.
     * <p>
     * 
     * @param triggerPoints
     *            holds the new value of <code>triggerPoints</code>
     */
	public void setTriggerPoints(List<String> triggerPoints) {
		this.triggerPoints = triggerPoints;
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
	
	
}