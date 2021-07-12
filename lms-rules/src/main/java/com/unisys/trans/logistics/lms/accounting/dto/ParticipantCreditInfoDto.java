package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.AmountType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceStatusType;
import com.unisys.trans.logistics.lms.framework.constants.*;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;

import java.math.BigDecimal;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ParticipantCreditInfoDto extends PersistenceObjectDto {


	private static final long serialVersionUID = 1L;

	private ActionType actionType;

	private static final String EMPTY_STRING = "";

	private Long oId;

	private String participantName;

	private String station;

	private String participantAccountNo;

	private boolean download;

	private BigDecimal availableSecurityDeposit = BigDecimal.ZERO;

	private String currency;

	private AmountType amountType;

	private BigDecimal advancePaymentAmount;

	private BigDecimal availableLimitAfterAdvancePayment;

	private BigDecimal securityDepositAmount;

	private String remarks;

	private Date timeStamp;

	private String userId;

	private String office;

	private AccountingParticipantDto accParticipantInfoDto;


	public ParticipantCreditInfoDto() {
		super();
	}

	@Override
	public Long getOId() {
		return oId;
	}

	public void setOId(Long oId) {
		this.oId = oId;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = ContractUtility
				.convertToUpperCase(participantName);
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = ContractUtility.convertToUpperCase(station);
	}

	public String getParticipantAccountNo() {
		return participantAccountNo;
	}

	public void setParticipantAccountNo(String participantAccountNo) {
		this.participantAccountNo = ContractUtility
				.convertToUpperCase(participantAccountNo);
	}

	public boolean isDownload() {
		return download;
	}

	public void setDownload(boolean download) {
		this.download = download;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public AmountType getAmountType() {
		return amountType;
	}

	public void setAmountType(AmountType amountType) {
		this.amountType = amountType;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public ActionType getActionType() {
		return actionType;
	}

	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}

	public BigDecimal getAvailableSecurityDeposit() {
		return availableSecurityDeposit;
	}

	public void setAvailableSecurityDeposit(BigDecimal availableSecurityDeposit) {
		this.availableSecurityDeposit = availableSecurityDeposit;
	}

	public BigDecimal getAdvancePaymentAmount() {
		return advancePaymentAmount;
	}

	public void setAdvancePaymentAmount(BigDecimal advancePaymentAmount) {
		this.advancePaymentAmount = advancePaymentAmount;
	}

	public BigDecimal getAvailableLimitAfterAdvancePayment() {
		return availableLimitAfterAdvancePayment;
	}

	public void setAvailableLimitAfterAdvancePayment(BigDecimal availableLimitAfterAdvancePayment) {
		this.availableLimitAfterAdvancePayment = availableLimitAfterAdvancePayment;
	}

	public BigDecimal getSecurityDepositAmount() {
		return securityDepositAmount;
	}

	public void setSecurityDepositAmount(BigDecimal securityDepositAmount) {
		this.securityDepositAmount = securityDepositAmount;
	}

	public AccountingParticipantDto getAccParticipantInfoDto() {
		return accParticipantInfoDto;
	}

	public void setAccParticipantInfoDto(AccountingParticipantDto accParticipantInfoDto) {
		this.accParticipantInfoDto = accParticipantInfoDto;
	}

	@Override
	public String toString() {
		final StringBuilder csvString = new StringBuilder();

		csvString.append(this.prefixSuffixByQuotes(this.getAmountType().getValue()));

		if (null != this.getAccParticipantInfoDto().getBillingAccountNumber()) {
			csvString.append(this.prefixSuffixByQuotes(this.getAccParticipantInfoDto().getBillingAccountNumber()));
		}
		csvString.append(this.prefixSuffixByQuotes(String.valueOf(this.getAdvancePaymentAmount())));

		csvString.append(this.prefixSuffixByQuotes(String.valueOf(this.getAvailableLimitAfterAdvancePayment())));

		csvString.append(this.prefixSuffixByQuotes(String.valueOf(this.getSecurityDepositAmount())));

		csvString.append(this.prefixSuffixByQuotes(this.getCurrency()));

		csvString.append(this.prefixSuffixByQuotes(this.getRemarks()));

		try {
			csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToTimeStamp(this.getTimeStamp())));
		} catch (LMSException lmsException) {
			lmsException.setErrorMessage("Error while parsing date in toString()");
		}

		csvString.append(this.prefixSuffixByQuotes(this.getUserId()));

		csvString.append(this.prefixSuffixByQuotes(this.getStation()));

		csvString.append(this.prefixSuffixByQuotes("\t"+this.getOffice()));

		return csvString.toString();
	}

	private String prefixSuffixByQuotes(final String pString) {
		final String aQUOTATION = "\"";
		final String aCOMMA = ",";

		final StringBuffer aModifiedString = new StringBuffer();
		aModifiedString.append(aQUOTATION);
		aModifiedString.append(pString);
		aModifiedString.append(aQUOTATION);
		aModifiedString.append(aCOMMA);

		return aModifiedString.toString();
	}
}
