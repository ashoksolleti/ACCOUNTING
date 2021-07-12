package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class AccountingEntryJournalDto extends PersistenceObjectDto {

	private static final long serialVersionUID = 1L;
	private Long oId = 0l;
	private String journalId;
	private String entryId;
	private String accountCode;
	private String glAccountNumber;
	private String glAccountCode;
	private String glAccountName;
	private BigDecimal debitAmountHostCurrency;
	private BigDecimal creditAmountHostCurrency;
	private BigDecimal debitAmountSourceCurrency;
	private BigDecimal creditAmountSourceCurrency;
	private String costCenter;
	private String ruleName;
	private String amountType;
	private String arAccountNumber;
	private String glAccountNumberAsString;
	private GlAccountCodeDto glAccountCodeDto;
	private String profitCenter;
	private String apAccountNumber;
	/**
	 * @return the ruleName
	 */
	public String getRuleName() {
		return ruleName;
	}

	/**
	 * @param ruleName
	 *            the ruleName to set
	 */
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	/**
	 * @return the amountType
	 */
	public String getAmountType() {
		return amountType;
	}

	/**
	 * @param amountType
	 *            the amountType to set
	 */
	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId
	 *            the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}


	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return this.getoId();
	}

	/**
	 * @return the journalId
	 */
	public String getJournalId() {
		return journalId;
	}

	/**
	 * @param journalId
	 *            the journalId to set
	 */
	public void setJournalId(String journalId) {
		this.journalId = journalId;
	}

	/**
	 * @return the entryId
	 */
	public String getEntryId() {
		return entryId;
	}

	/**
	 * @param entryId
	 *            the entryId to set
	 */
	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}

	/**
	 * @return the glAccountNumber
	 */
	public String getGlAccountNumber() {
		if(this.getGlAccountCodeDto()!=null){
			if(this.getGlAccountCodeDto().getAccountNumber()!=null){
				glAccountNumber = this.getGlAccountCodeDto().getAccountNumber();
			}
		}
		return glAccountNumber;
	}

	/**
	 * @param glAccountNumber
	 *            the glAccountNumber to set
	 */
	public void setGlAccountNumber(String glAccountNumber) {
		this.glAccountNumber = glAccountNumber;
	}

	/**
	 * @return the debitAmountHostCurrency
	 */
	public BigDecimal getDebitAmountHostCurrency() {
		if(debitAmountHostCurrency == null){
			debitAmountHostCurrency=new BigDecimal(0);
		}
		return debitAmountHostCurrency;
	}

	/**
	 * @param debitAmountHostCurrency
	 *            the debitAmountHostCurrency to set
	 */
	public void setDebitAmountHostCurrency(BigDecimal debitAmountHostCurrency) {
		this.debitAmountHostCurrency = debitAmountHostCurrency;
	}

	/**
	 * @return the creditAmountHostCurrency
	 */
	public BigDecimal getCreditAmountHostCurrency() {
		if(creditAmountHostCurrency == null){
			creditAmountHostCurrency=new BigDecimal(0);
		}
		return creditAmountHostCurrency;
	}

	/**
	 * @param creditAmountHostCurrency
	 *            the creditAmountHostCurrency to set
	 */
	public void setCreditAmountHostCurrency(BigDecimal creditAmountHostCurrency) {
		this.creditAmountHostCurrency = creditAmountHostCurrency;
	}

	/**
	 * @return the debitAmountSourceCurrency
	 */
	public BigDecimal getDebitAmountSourceCurrency() {
		if(debitAmountSourceCurrency == null){
			debitAmountSourceCurrency=new BigDecimal(0);
		}
		return debitAmountSourceCurrency;
	}

	/**
	 * @param debitAmountSourceCurrency
	 *            the debitAmountSourceCurrency to set
	 */
	public void setDebitAmountSourceCurrency(
			BigDecimal debitAmountSourceCurrency) {
		this.debitAmountSourceCurrency = debitAmountSourceCurrency;
	}

	/**
	 * @return the creditAmountSourceCurrency
	 */
	public BigDecimal getCreditAmountSourceCurrency() {
		if(creditAmountSourceCurrency == null){
			creditAmountSourceCurrency=new BigDecimal(0);
		}
		return creditAmountSourceCurrency;
	}

	/**
	 * @param creditAmountSourceCurrency
	 *            the creditAmountSourceCurrency to set
	 */
	public void setCreditAmountSourceCurrency(
			BigDecimal creditAmountSourceCurrency) {
		this.creditAmountSourceCurrency = creditAmountSourceCurrency;
	}

	/**
	 * @return the costCenter
	 */
	public String getCostCenter() {
		return costCenter;
	}

	/**
	 * @param costCenter
	 *            the costCenter to set
	 */
	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	/**
	 * @return the arAccountNumber
	 */
	public String getArAccountNumber() {
		return arAccountNumber;
	}

	/**
	 * @param arAccountNumber
	 *            the arAccountNumber to set
	 */
	public void setArAccountNumber(String arAccountNumber) {
		this.arAccountNumber = arAccountNumber;
	}
	

		public String getGlAccountNumberAsString() {
		if(glAccountNumber!=null){
				String a,b;
				a=glAccountNumber.substring(0,4);
				b=glAccountNumber.substring(4);
				glAccountNumberAsString = a+" "+b;
			}
		return glAccountNumberAsString;
	}
	/**
	 * @return the glAccountCodeDto
	 */
	public GlAccountCodeDto getGlAccountCodeDto() {
		return glAccountCodeDto;
	}

	/**
	 * @param glAccountCodeDto the glAccountCodeDto to set
	 */
	public void setGlAccountCodeDto(GlAccountCodeDto glAccountCodeDto) {
		this.glAccountCodeDto = glAccountCodeDto;
	}

	/**
	 * @return the glAccountName
	 */
	public String getGlAccountName() {
		if(this.getGlAccountCodeDto()!=null){
			if(this.getGlAccountCodeDto().getAccountName()!=null){
				glAccountName = this.getGlAccountCodeDto().getAccountName();
			}
		}
		return glAccountName;
	}

	/**
	 * @param glAccountName the glAccountName to set
	 */
	public void setGlAccountName(String glAccountName) {
		this.glAccountName = glAccountName;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getProfitCenter() {
		return profitCenter;
	}

	public void setProfitCenter(String profitCenter) {
		this.profitCenter = profitCenter;
	}

	public String getApAccountNumber() {
		return apAccountNumber;
	}

	public void setApAccountNumber(String apAccountNumber) {
		this.apAccountNumber = apAccountNumber;
	}

	public String getGlAccountCode() {
		if(this.getGlAccountCodeDto()!=null){
			if(this.getGlAccountCodeDto().getAccountCode()!=null){
				glAccountCode = this.getGlAccountCodeDto().getAccountCode();
			}}
		return glAccountCode ;
	}

	public void setGlAccountCode(String glAccountCode) {
		this.glAccountCode = glAccountCode;
	}
	
}