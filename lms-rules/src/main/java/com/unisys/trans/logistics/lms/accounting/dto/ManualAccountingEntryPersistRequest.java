/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * @author JainP2
 *
 */
public class ManualAccountingEntryPersistRequest extends AbstractRequest {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
     * Attribute to hold <code>AccountingEntryDto</code> property.
     */
	private AccountingEntryDto accountingEntryDto = new AccountingEntryDto();
	
	 /**
     * Attribute to hold <code>AccountingEntryDto</code> property.
     */
	private List<AccountingEntryDto> accountingEntryDtoList = new ArrayList<AccountingEntryDto>();
	
	private AccountingEntryDto deleteAccountEntry ;
	
	public AccountingEntryDto getDeleteAccountEntry() {
		return deleteAccountEntry;
	}

	public void setDeleteAccountEntry(AccountingEntryDto deleteAccountEntry) {
		this.deleteAccountEntry = deleteAccountEntry;
	}

	private String specificAirlineParameter;
	
	 public String getSpecificAirlineParameter() {
		return specificAirlineParameter;
	}

	public void setSpecificAirlineParameter(String specificAirlineParameter) {
		this.specificAirlineParameter = specificAirlineParameter;
	}

	/**
     * <code>Default constructor.</code>
     */
	public ManualAccountingEntryPersistRequest(){
		
	}

	/**
	 * @return the accountingEntryDto
	 */
	public final AccountingEntryDto getAccountingEntryDto() {
		return accountingEntryDto;
	}

	/**
	 * @param accountingEntryDto the accountingEntryDto to set
	 */
	public final void setAccountingEntryDto(AccountingEntryDto accountingEntryDto) {
		this.accountingEntryDto = accountingEntryDto;
	}

	/**
	 * @return the accountingEntryDtoList
	 */
	public final List<AccountingEntryDto> getAccountingEntryDtoList() {
		return accountingEntryDtoList;
	}

	/**
	 * @param accountingEntryDtoList the accountingEntryDtoList to set
	 */
	public final void setAccountingEntryDtoList(List<AccountingEntryDto> accountingEntryDtoList) {
		this.accountingEntryDtoList = accountingEntryDtoList;
	}
	
	
}
