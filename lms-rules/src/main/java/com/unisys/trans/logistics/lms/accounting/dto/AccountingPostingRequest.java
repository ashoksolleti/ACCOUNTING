package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AccountingModes;
import com.unisys.trans.logistics.lms.accounting.dto.constants.AccountingPostingActionType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.AccountingPostingFileType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>AccountingPostingRequest</code> contains all the attributes
 * which are required for processing the retrieve request from user.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>serialVersionUID 
 * <li>triggerPoints 
 * <li>postingFromDate
 * <li>postingToDate
 * <li>accountingMonth
 * <li>financialYear
 * <li>accountingPostingFileType
 * <li>accountingPostingActionType
 * <li>accountingPostingMode
 * <li>postingFileNames
 * </code>
 * </ul>
 * 
 */
public class AccountingPostingRequest extends AbstractRequest{
	private static final long serialVersionUID = 1L;
	private List<String> triggerPoints;

	private Date postingFromDate;
	
	private Date postingToDate;
	
	private String accountingMonth;
	
	private Integer financialYear;
	
	private AccountingPostingFileType accountingPostingFileType;
	
	private AccountingPostingActionType accountingPostingActionType;
	
	private AccountingModes accountingPostingMode;
	
	private String postingFileNames;

	 private AccountingPostingDto accountingPostingDto;
	 
	 private String triggeringPoint;
	 
	private boolean isScheduled;
	
	private List<AccountingEntryDto> accountingEntryDtos = new ArrayList<AccountingEntryDto>();

	/**
	 * @return the isScheduled
	 */
	public boolean getIsScheduled() {
		return isScheduled;
	}

	/**
	 * @param isScheduled the isScheduled to set
	 */
	public void setIsScheduled(boolean isScheduled) {
		this.isScheduled = isScheduled;
	}

	/**
	 * @return the triggeringPoint
	 */
	public String getTriggeringPoint() {
		return triggeringPoint;
	}

	/**
	 * @param triggeringPoint the triggeringPoint to set
	 */
	public void setTriggeringPoint(String triggeringPoint) {
		this.triggeringPoint = triggeringPoint;
	}

	/**
	 * @return the accountingPostingDto
	 */
	public AccountingPostingDto getAccountingPostingDto() {
		return accountingPostingDto;
	}

	/**
	 * @param accountingPostingDto the accountingPostingDto to set
	 */
	public void setAccountingPostingDto(AccountingPostingDto accountingPostingDto) {
		this.accountingPostingDto = accountingPostingDto;
	}

	/**
	 * @return the triggerPoints
	 */
	public List<String> getTriggerPoints() {
		return triggerPoints;
	}

	/**
	 * @param triggerPoints the triggerPoints to set
	 */
	public void setTriggerPoints(List<String> triggerPoints) {
		this.triggerPoints = triggerPoints;
	}

	/**
	 * @return the postingFromDate
	 */
	public Date getPostingFromDate() {
		return postingFromDate;
	}

	/**
	 * @param postingFromDate the postingFromDate to set
	 */
	public void setPostingFromDate(Date postingFromDate) {
		this.postingFromDate = postingFromDate;
	}

	/**
	 * @return the postingToDate
	 */
	public Date getPostingToDate() {
		return postingToDate;
	}

	/**
	 * @param postingToDate the postingToDate to set
	 */
	public void setPostingToDate(Date postingToDate) {
		this.postingToDate = postingToDate;
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
	 * @return the financialYear
	 */
	public Integer getFinancialYear() {
		return financialYear;
	}

	/**
	 * @param financialYear the financialYear to set
	 */
	public void setFinancialYear(Integer financialYear) {
		this.financialYear = financialYear;
	}

	/**
	 * @return the accountingPostingFileType
	 */
	public AccountingPostingFileType getAccountingPostingFileType() {
		return accountingPostingFileType;
	}

	/**
	 * @param accountingPostingFileType the accountingPostingFileType to set
	 */
	public void setAccountingPostingFileType(
			AccountingPostingFileType accountingPostingFileType) {
		this.accountingPostingFileType = accountingPostingFileType;
	}

	/**
	 * @return the accountingPostingActionType
	 */
	public AccountingPostingActionType getAccountingPostingActionType() {
		return accountingPostingActionType;
	}

	/**
	 * @param accountingPostingActionType the accountingPostingActionType to set
	 */
	public void setAccountingPostingActionType(
			AccountingPostingActionType accountingPostingActionType) {
		this.accountingPostingActionType = accountingPostingActionType;
	}

	/**
	 * @return the accountingPostingMode
	 */
	public AccountingModes getAccountingPostingMode() {
		return accountingPostingMode;
	}

	/**
	 * @param accountingPostingMode the accountingPostingMode to set
	 */
	public void setAccountingPostingMode(AccountingModes accountingPostingMode) {
		this.accountingPostingMode = accountingPostingMode;
	}

	/**
	 * @return the postingFileNames
	 */
	public String getPostingFileNames() {
		return postingFileNames;
	}

	/**
	 * @param postingFileNames the postingFileNames to set
	 */
	public void setPostingFileNames(String postingFileNames) {
		this.postingFileNames = postingFileNames;
	}

	/**
	 * @return the accountingEntryDtos
	 */
	public List<AccountingEntryDto> getAccountingEntryDtos() {
		return accountingEntryDtos;
	}

	/**
	 * @param accountingEntryDtos the accountingEntryDtos to set
	 */
	public void setAccountingEntryDtos(List<AccountingEntryDto> accountingEntryDtos) {
		this.accountingEntryDtos = accountingEntryDtos;
	}
	
}