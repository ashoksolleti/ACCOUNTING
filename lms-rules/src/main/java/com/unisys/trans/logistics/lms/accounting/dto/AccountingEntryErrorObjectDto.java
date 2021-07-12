package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AccountingRuleIndicators;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class AccountingEntryErrorObjectDto extends PersistenceObjectDto {
	private static final long serialVersionUID = 1L;

	private long oid;

	private byte[] invoiceFile;

	private AccountingRuleIndicators ruleIndicator;

	public AccountingRuleIndicators getRuleIndicator() {
		return ruleIndicator;
	}

	public void setRuleIndicator(AccountingRuleIndicators ruleIndicator) {
		this.ruleIndicator = ruleIndicator;
	}

	/**
	 * @param oid
	 *            the oid to set
	 */
	public void setOid(long oid) {
		this.oid = oid;
	}

	/**
	 * @return the invoiceFile
	 */
	public byte[] getInvoiceFile() {
		return invoiceFile;
	}

	/**
	 * @param invoiceFile
	 *            the invoiceFile to set
	 */
	public void setInvoiceFile(byte[] invoiceFile) {
		this.invoiceFile = invoiceFile;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return oid;
	}

}