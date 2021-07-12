package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class AccountingPeriodResponse extends AbstractResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9103426534006514590L;
	private List<AccountingPeriodDto> accountingPeriodDtos=new ArrayList<AccountingPeriodDto>();
	private boolean download;
	private boolean error;
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

	public boolean isDownload() {
		return download;
	}

	public void setDownload(boolean download) {
		this.download = download;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}
	
	
	
}
