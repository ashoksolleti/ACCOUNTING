package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AccountingPostingFileType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class AccountingPostingResponse extends AbstractResponse{
	
	private static final long serialVersionUID = 1L;
	private String postingFileName;

	private AccountingPostingFileType postingFileType;

	private byte[] postingFile;
	
	private Date postingFileGenerationDate;
	
	private Date postingFilePostingDate;
	
	private String postingFileStatus;
	
	private String triggerPoints;
    private List<AccountingPostingDto> accountingPostingDtos;
	/**
	 * @return the postingFileName
	 */
	public String getPostingFileName() {
		return postingFileName;
	}

	/**
	 * @param postingFileName the postingFileName to set
	 */
	public void setPostingFileName(String postingFileName) {
		this.postingFileName = postingFileName;
	}

	/**
	 * @return the postingFileType
	 */
	public AccountingPostingFileType getPostingFileType() {
		return postingFileType;
	}

	/**
	 * @param postingFileType the postingFileType to set
	 */
	public void setPostingFileType(AccountingPostingFileType postingFileType) {
		this.postingFileType = postingFileType;
	}

	/**
	 * @return the postingFile
	 */
	public byte[] getPostingFile() {
		return postingFile;
	}

	/**
	 * @param postingFile the postingFile to set
	 */
	public void setPostingFile(byte[] postingFile) {
		this.postingFile = postingFile;
	}

	/**
	 * @return the postingFileGenerationDate
	 */
	public Date getPostingFileGenerationDate() {
		return postingFileGenerationDate;
	}

	/**
	 * @param postingFileGenerationDate the postingFileGenerationDate to set
	 */
	public void setPostingFileGenerationDate(Date postingFileGenerationDate) {
		this.postingFileGenerationDate = postingFileGenerationDate;
	}

	/**
	 * @return the postingFileCreationDate
	 */
	public Date getPostingFileCreationDate() {
		return postingFilePostingDate;
	}

	/**
	 * @param postingFileCreationDate the postingFileCreationDate to set
	 */
	public void setPostingFileCreationDate(Date postingFilePostingDate) {
		this.postingFilePostingDate = postingFilePostingDate;
	}

	/**
	 * @return the postingFileStatus
	 */
	public String getPostingFileStatus() {
		return postingFileStatus;
	}

	/**
	 * @param postingFileStatus the postingFileStatus to set
	 */
	public void setPostingFileStatus(String postingFileStatus) {
		this.postingFileStatus = postingFileStatus;
	}

	/**
	 * @return the triggerPoints
	 */
	public String getTriggerPoints() {
		return triggerPoints;
	}

	/**
	 * @param triggerPoints the triggerPoints to set
	 */
	public void setTriggerPoints(String triggerPoints) {
		this.triggerPoints = triggerPoints;
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
	 * @return the accountingPostingDtos
	 */
	public List<AccountingPostingDto> getAccountingPostingDtos() {
		return accountingPostingDtos;
	}

	/**
	 * @param accountingPostingDtos the accountingPostingDtos to set
	 */
	public void setAccountingPostingDtos(
			List<AccountingPostingDto> accountingPostingDtos) {
		this.accountingPostingDtos = accountingPostingDtos;
	}

	
	
}