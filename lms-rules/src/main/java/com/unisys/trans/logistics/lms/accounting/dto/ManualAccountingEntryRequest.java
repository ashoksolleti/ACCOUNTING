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
public class ManualAccountingEntryRequest extends AbstractRequest {

	
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
	
	
	private boolean AirWaybillOnlyFlag = false;
	
	private String specificAirline;
	
	 /**
     * <code>Default constructor.</code>
     */
	public ManualAccountingEntryRequest(){
		
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

	public boolean isAirWaybillOnlyFlag() {
		return AirWaybillOnlyFlag;
	}

	public void setAirWaybillOnlyFlag(boolean airWaybillOnlyFlag) {
		AirWaybillOnlyFlag = airWaybillOnlyFlag;
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
}
