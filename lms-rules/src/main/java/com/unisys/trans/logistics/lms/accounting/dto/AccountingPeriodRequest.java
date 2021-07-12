package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * @author SeramRaK
 *
 */
public class AccountingPeriodRequest  extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7210693126621156036L;
	private AccountingPeriodDto accountingPeriodDto=new AccountingPeriodDto();
	private AccountingPeriodDto accountingPeriodFindDto=new AccountingPeriodDto();
	
	private List<AccountingPeriodDto> accountingPeriodDtos=new ArrayList<AccountingPeriodDto>();

	/**
	 * @return
	 */
	public List<AccountingPeriodDto> getAccountingPeriodDtos() {
		return accountingPeriodDtos;
	}

	/**
	 * @param accountingPeriodDtos
	 */
	public void setAccountingPeriodDtos(
			List<AccountingPeriodDto> accountingPeriodDtos) {
		this.accountingPeriodDtos = accountingPeriodDtos;
	}

	public AccountingPeriodDto getAccountingPeriodDto() {
		return accountingPeriodDto;
	}

	public void setAccountingPeriodDto(AccountingPeriodDto accountingPeriodDto) {
		this.accountingPeriodDto = accountingPeriodDto;
	}

	public AccountingPeriodDto getAccountingPeriodFindDto() {
		return accountingPeriodFindDto;
	}

	public void setAccountingPeriodFindDto(
			AccountingPeriodDto accountingPeriodFindDto) {
		this.accountingPeriodFindDto = accountingPeriodFindDto;
	}
	
	
	
}
