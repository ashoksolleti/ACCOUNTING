/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.*;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.utils.dto.constants.ExchangeRateType;

/**
 * <code>ParticipantPayableDto</code> class contain information specific to an
 * ParticpantPayables.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>participantRoleType
 * <li>participantAccountNumber
 * <li>participantAgreementType
 * <li>commissionType
 * <li>commissionAmount
 * <li>commissionPercentage
 * <li>currencyCode
 * <li>status
 * <li>oId
 * <li>agreementIdentifier
 * <li>billingCommissionAmount
 * <li>billingExchangeRate
 * <li>hostCommissionAmount
 * <li>hostCurrencyCode
 * <li>hostExchangeRate
 * <li>hostExchangeRateType
 * </code>
 * </ul>
 */
public class ParticipantPayableDto extends PersistenceObjectDto {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = -564304794779659070L;
	/**
	 * Attribute to hold <code>active</code> property.
	 */
	private Boolean active;
	/**
	 * Attribute to hold <code>adjustmentDto</code> property.
	 */
	private AdjustmentDto adjustmentDto;

	/**
	 * Attribute to hold <code>agreementIdentifier</code> property.
	 */
	private String agreementIdentifier;

	/**
	 * Attribute to hold <code>billingCommissionAmount</code> property.
	 */
	private BigDecimal billingCommissionAmount;

	/**
	 * Attribute to hold <code>billingCurrencyCode</code> property.
	 */
	private String billingCurrencyCode;

	/**
	 * Attribute to hold <code>billingExchangeRate</code> property.
	 */
	private BigDecimal billingExchangeRate;

	/**
	 * Attribute to hold <code>billingExchangeRateType</code> property.
	 */
	private ExchangeRateType billingExchangeRateType;

	/**
	 * Attribute to hold <code>commissionAmount</code> property.
	 */
	private BigDecimal commissionAmount;

	/**
	 * Attribute to hold <code>commissionPercentage</code> property.
	 */
	private BigDecimal commissionPercentage;

	/**
	 * Attribute to hold <code>commissionType</code> property.
	 */
	private CommissionType commissionType;

	/**
	 * Attribute to hold <code>currencyCode</code> property.
	 */
	private String currencyCode;

	/**
	 * Attribute to hold <code>genIDType</code> property.
	 */
	private GenIdType genIDType;

	/**
	 * Attribute to hold <code>hostCommissionAmount</code> property.
	 */
	private BigDecimal hostCommissionAmount;

	/**
	 * Attribute to hold <code>hostCurrencyCode</code> property.
	 */
	private String hostCurrencyCode;

	/**
	 * Attribute to hold <code>hostExchangeRate</code> property.
	 */
	private BigDecimal hostExchangeRate;

	/**
	 * Attribute to hold <code>hostExchangeRateType</code> property.
	 */
	private ExchangeRateType hostExchangeRateType;

	/**
	 * Attribute to hold <code>oId</code> property.
	 */
	private Long oId;

	/**
	 * Attribute to hold <code>participantAccountNumber</code> property.
	 */
	private String participantAccountNumber;

	/**
	 * Attribute to hold <code>participantAggrementType</code> property.
	 */
	private ParticipantAgreementType participantAgreementType;

	/**
	 * Attribute to hold <code>participantRoleType</code> property.
	 */
	private ParticipantRoleType participantRoleType;

	/**
	 * Attribute to hold <code>status</code> property.
	 */
	private PaymentStatusType status;
	/**
	 * Attribute to hold <code>userAudit</code> property.
	 */
	private UserAuditDto userAudit;
	/**
	 * Attribute to hold <code>station</code> property.
	 */
	private String station;

	/**
	 * Attribute to hold <code>Accounting AirwayBill</code> property.
	 */
	private AccountingAirWaybillDto accountingAirWaybillDto;

	
	
	 private Date invoiceDate;
	 
	 private String invoiceNumber;
	 
	 
	 private ParticipantAgreementsDetailDto participantAgreementsDetailDto;

	public boolean isDelIndicator() {
		return delIndicator;
	}

	public void setDelIndicator(boolean delIndicator) {
		this.delIndicator = delIndicator;
	}

	private boolean delIndicator;

	/**
	 * Attribute to hold <code>TDS</code> property.
	 */
	private BigDecimal tdsAmount;

	public List<PayableSplitDto> getPayableSplitDtos() {
		return this.payableSplitDtos;
	}

	public void setPayableSplitDtos(List<PayableSplitDto> payableSplitDtos) {
		this.payableSplitDtos = payableSplitDtos;
	}

	private List<PayableSplitDto> payableSplitDtos;

	public BigDecimal getTdsAmount() {
		return tdsAmount;
	}

	public void setTdsAmount(BigDecimal tdsAmount) {
		this.tdsAmount = tdsAmount;
	}

	/**
	 * Attribute to hold <code>TDSpercentage</code> property.
	 */
	private BigDecimal tdsPercentage;

	public BigDecimal getTdsPercentage() {
		return tdsPercentage;
	}

	public void setTdsPercentage(BigDecimal tdsPercentage) {
		this.tdsPercentage = tdsPercentage;
	}

	/**
	 * Attribute to hold <code>TDS type</code> property.
	 */
	private CommissionType tdsType;

	public CommissionType getTdsType() {
		return tdsType;
	}

	public void setTdsType(CommissionType tdsType) {
		this.tdsType = tdsType;
	}

	/**
	 * Gets the <code>active</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>active</code> property.
	 */
	public Boolean getActive() {
		return this.active;
	}

	/**
	 * Gets the <code>adjustmentDto</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>adjustmentDto</code> property.
	 */
	public AdjustmentDto getAdjustmentDto(){
	if(adjustmentDto == null){
		adjustmentDto = new AdjustmentDto();
	}
		return this.adjustmentDto;
	}

	/**
	 * Gets the <code>agreementIdentifier</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>agreementIdentifier</code>
	 *         property.
	 */
	public String getAgreementIdentifier() {
		return this.agreementIdentifier;
	}

	/**
	 * Gets the <code>billingCommissionAmount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>billingCommissionAmount</code>
	 *         property.
	 */
	public BigDecimal getBillingCommissionAmount() {
		return this.billingCommissionAmount;
	}

	/**
	 * Gets the <code>billingCurrencyCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>billingCurrencyCode</code>
	 *         property.
	 */
	public String getBillingCurrencyCode() {
		return this.billingCurrencyCode;
	}

	/**
	 * Gets the <code>billingExchangeRate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>billingExchangeRate</code>
	 *         property.
	 */
	public BigDecimal getBillingExchangeRate() {
		return this.billingExchangeRate;
	}

	/**
	 * Gets the <code>billingExchangeRateType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>billingExchangeRateType</code>
	 *         property.
	 */
	public ExchangeRateType getBillingExchangeRateType() {
		return this.billingExchangeRateType;
	}

	/**
	 * Gets the <code>commissionAmount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>commissionAmount</code> property.
	 */
	public BigDecimal getCommissionAmount() {
		return this.commissionAmount;
	}

	/**
	 * Gets the <code>commissionPercentage</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>commissionPercentage</code>
	 *         property.
	 */
	public BigDecimal getCommissionPercentage() {
		return this.commissionPercentage;
	}

	/**
	 * Gets the <code>commissionType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>commissionType</code> property.
	 */
	public CommissionType getCommissionType() {
		return this.commissionType;
	}

	/**
	 * Gets the <code>currencyCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>currencyCode</code> property.
	 */
	public String getCurrencyCode() {
		return this.currencyCode;
	}

	/**
	 * Gets the <code>genIDType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>genIDType</code> property.
	 */
	public GenIdType getGenIDType() {
		return this.genIDType;
	}

	/**
	 * Gets the <code>hostCommissionAmount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>hostCommissionAmount</code>
	 *         property.
	 */
	public BigDecimal getHostCommissionAmount() {
		return this.hostCommissionAmount;
	}

	/**
	 * Gets the <code>hostCurrencyCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>hostCurrencyCode</code> property.
	 */
	public String getHostCurrencyCode() {
		return this.hostCurrencyCode;
	}

	/**
	 * Gets the <code>hostExchangeRate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>hostExchangeRate</code> property.
	 */
	public BigDecimal getHostExchangeRate() {
		return this.hostExchangeRate;
	}

	/**
	 * Gets the <code>hostExchangeRateType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>hostExchangeRateType</code>
	 *         property.
	 */
	public ExchangeRateType getHostExchangeRateType() {
		return this.hostExchangeRateType;
	}

	/**
	 * Gets the <code>oId</code> property.
	 * 
	 * @return the current value of the <code>oId</code> property.<br>
	 */
	@Override
	public Long getOId() {
		return this.oId;
	}

	/**
	 * Gets the <code>participantAccountNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>participantAccountNumber</code>
	 *         property.
	 */
	public String getParticipantAccountNumber() {
		return this.participantAccountNumber;
	}

	/**
	 * Gets the <code>participantAgreementType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>participantAgreementType</code>
	 *         property.
	 */
	public ParticipantAgreementType getParticipantAgreementType() {
		return this.participantAgreementType;
	}

	/**
	 * Gets the <code>participantRoleType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>participantRoleType</code>
	 *         property.
	 */
	public ParticipantRoleType getParticipantRoleType() {
		return this.participantRoleType;
	}

	/**
	 * Gets the <code>station</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>station</code> property.
	 */
	public String getStation() {
		return this.station;
	}

	/**
	 * Gets the <code>status</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>status</code> property.
	 */
	public PaymentStatusType getStatus() {
		return this.status;
	}

	/**
	 * Gets the <code>userAudit</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>userAudit</code> property.
	 */
	public UserAuditDto getUserAudit() {
		return this.userAudit;
	}

	/**
	 * Sets the <code>active</code>.
	 * <p>
	 * 
	 * @param pActive
	 *            holds the new value of <code>active</code>
	 */
	public void setActive(final Boolean pActive) {
		this.active = pActive;
	}

	/**
	 * Sets the <code>adjustmentDto</code>.
	 * <p>
	 * 
	 * @param pAdjustmentDto
	 *            holds the new value of <code>adjustmentDto</code>
	 */
	public void setAdjustmentDto(final AdjustmentDto pAdjustmentDto) {
		this.adjustmentDto = pAdjustmentDto;
	}

	/**
	 * Sets the <code>agreementIdentifier</code>.
	 * <p>
	 * 
	 * @param pAgreementIdentifier
	 *            holds the new value of <code>agreementIdentifier</code>
	 */
	public void setAgreementIdentifier(final String pAgreementIdentifier) {
		this.agreementIdentifier = ContractUtility
				.convertToUpperCase(pAgreementIdentifier);
	}

	/**
	 * Sets the <code>billingCommissionAmount</code>.
	 * <p>
	 * 
	 * @param pBillingCommissionAmount
	 *            holds the new value of <code>billingCommissionAmount</code>
	 */
	public void setBillingCommissionAmount(
			final BigDecimal pBillingCommissionAmount) {
		this.billingCommissionAmount = pBillingCommissionAmount;
	}

	/**
	 * Sets the <code>billingCurrencyCode</code>.
	 * <p>
	 * 
	 * @param pBillingCurrencyCode
	 *            holds the new value of <code>billingCurrencyCode</code>
	 */
	public void setBillingCurrencyCode(final String pBillingCurrencyCode) {
		this.billingCurrencyCode = ContractUtility
				.convertToUpperCase(pBillingCurrencyCode);
	}

	/**
	 * Sets the <code>billingExchangeRate</code>.
	 * <p>
	 * 
	 * @param pBillingExchangeRate
	 *            holds the new value of <code>billingExchangeRate</code>
	 */
	public void setBillingExchangeRate(final BigDecimal pBillingExchangeRate) {
		this.billingExchangeRate = pBillingExchangeRate;
	}

	/**
	 * Sets the <code>billingExchangeRateType</code>.
	 * <p>
	 * 
	 * @param pBillingExchangeRateType
	 *            holds the new value of <code>billingExchangeRateType</code>
	 */
	public void setBillingExchangeRateType(
			final ExchangeRateType pBillingExchangeRateType) {
		this.billingExchangeRateType = pBillingExchangeRateType;
	}

	/**
	 * Sets the <code>commissionAmount</code>.
	 * <p>
	 * 
	 * @param pCommissionAmount
	 *            holds the new value of <code>commissionAmount</code>
	 */
	public void setCommissionAmount(final BigDecimal pCommissionAmount) {
		this.commissionAmount = pCommissionAmount;
	}

	/**
	 * Sets the <code>commissionPercentage</code>.
	 * <p>
	 * 
	 * @param pCommissionPercentage
	 *            holds the new value of <code>commissionPercentage</code>
	 */
	public void setCommissionPercentage(final BigDecimal pCommissionPercentage) {
		this.commissionPercentage = pCommissionPercentage;
	}

	/**
	 * Sets the <code>commissionType</code>.
	 * <p>
	 * 
	 * @param pCommissionType
	 *            holds the new value of <code>commissionType</code>
	 */
	public void setCommissionType(final CommissionType pCommissionType) {
		this.commissionType = pCommissionType;
	}

	/**
	 * Sets the <code>currencyCode</code>.
	 * <p>
	 * 
	 * @param pCurrencyCode
	 *            holds the new value of <code>currencyCode</code>
	 */
	public void setCurrencyCode(final String pCurrencyCode) {
		this.currencyCode = ContractUtility.convertToUpperCase(pCurrencyCode);
	}

	/**
	 * Sets the <code>genIDType</code>.
	 * <p>
	 * 
	 * @param pGenIDType
	 *            holds the new value of <code>genIDType</code>
	 */
	public void setGenIDType(final GenIdType pGenIDType) {
		this.genIDType = pGenIDType;
	}

	/**
	 * Sets the <code>hostCommissionAmount</code>.
	 * <p>
	 * 
	 * @param pHostCommissionAmount
	 *            holds the new value of <code>hostCommissionAmount</code>
	 */
	public void setHostCommissionAmount(final BigDecimal pHostCommissionAmount) {
		this.hostCommissionAmount = pHostCommissionAmount;
	}

	/**
	 * Sets the <code>hostCurrencyCode</code>.
	 * <p>
	 * 
	 * @param pHostCurrencyCode
	 *            holds the new value of <code>hostCurrencyCode</code>
	 */
	public void setHostCurrencyCode(final String pHostCurrencyCode) {
		this.hostCurrencyCode = ContractUtility
				.convertToUpperCase(pHostCurrencyCode);
	}

	/**
	 * Sets the <code>hostExchangeRate</code>.
	 * <p>
	 * 
	 * @param pHostExchangeRate
	 *            holds the new value of <code>hostExchangeRate</code>
	 */
	public void setHostExchangeRate(final BigDecimal pHostExchangeRate) {
		this.hostExchangeRate = pHostExchangeRate;
	}

	/**
	 * Sets the <code>hostExchangeRateType</code>.
	 * <p>
	 * 
	 * @param pHostExchangeRateType
	 *            holds the new value of <code>hostExchangeRateType</code>
	 */
	public void setHostExchangeRateType(
			final ExchangeRateType pHostExchangeRateType) {
		this.hostExchangeRateType = pHostExchangeRateType;
	}

	/**
	 * Sets the <code>oId</code> property.
	 * 
	 * @param pOId
	 *            the new value of the <code>oId</code> property.<br>
	 */
	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

	/**
	 * Sets the <code>participantAccountNumber</code>.
	 * <p>
	 * 
	 * @param pParticipantAccountNumber
	 *            holds the new value of <code>participantAccountNumber</code>
	 */
	public void setParticipantAccountNumber(
			final String pParticipantAccountNumber) {
		this.participantAccountNumber = ContractUtility
				.convertToUpperCase(pParticipantAccountNumber);
	}

	/**
	 * Sets the <code>participantAgreementType</code>.
	 * <p>
	 * 
	 * @param pParticipantAgreementType
	 *            holds the new value of <code>participantAgreementType</code>
	 */
	public void setParticipantAgreementType(
			final ParticipantAgreementType pParticipantAgreementType) {
		this.participantAgreementType = pParticipantAgreementType;
	}

	/**
	 * Sets the <code>participantRoleType</code>.
	 * <p>
	 * 
	 * @param pParticipantRoleType
	 *            holds the new value of <code>participantRoleType</code>
	 */
	public void setParticipantRoleType(
			final ParticipantRoleType pParticipantRoleType) {
		this.participantRoleType = pParticipantRoleType;
	}

	/**
	 * Sets the <code>station</code>.
	 * <p>
	 * 
	 * @param pStation
	 *            holds the new value of <code>station</code>
	 */
	public void setStation(final String pStation) {
		this.station = pStation;
	}

	/**
	 * Sets the <code>status</code>.
	 * <p>
	 * 
	 * @param pStatus
	 *            holds the new value of <code>status</code>
	 */
	public void setStatus(final PaymentStatusType pStatus) {
		this.status = pStatus;
	}

	/**
	 * Sets the <code>userAudit</code>.
	 * <p>
	 * 
	 * @param pUserAudit
	 *            holds the new value of <code>userAudit</code>
	 */
	public void setUserAudit(final UserAuditDto pUserAudit) {
		this.userAudit = pUserAudit;
	}

	@Override
	public String toString() {
		final StringBuilder aStrBuilder = new StringBuilder();
		if (this.getParticipantRoleType() != null
				&& this.getParticipantRoleType().getParticipantRoleName() != null) {
			aStrBuilder.append(this.getParticipantRoleType()
					.getParticipantRoleName());
			aStrBuilder.append(" ");
		}
		if (this.getParticipantAccountNumber() != null) {
			aStrBuilder.append(this.getParticipantAccountNumber());
			aStrBuilder.append(" ");
		}

		if (this.getParticipantAgreementType() != null
				&& this.getParticipantAgreementType()
						.getParticipantAgreementName() != null) {
			aStrBuilder.append(this.getParticipantAgreementType()
					.getParticipantAgreementName());
			aStrBuilder.append(" ");
		}
		if (this.getAgreementIdentifier() != null) {
			aStrBuilder.append(this.getAgreementIdentifier());
			aStrBuilder.append(" ");
		}

		if (this.getCommissionType() != null
				&& this.getCommissionType().getCommissionType() != null) {
			aStrBuilder.append(this.getCommissionType().getCommissionType());
			aStrBuilder.append(" ");
		}
		if (this.getCommissionPercentage() != null) {
			aStrBuilder.append(this.getCommissionPercentage());
			aStrBuilder.append(" ");
		}
		if (this.getCommissionAmount() != null) {
			aStrBuilder.append(this.getCommissionAmount());
			aStrBuilder.append(" ");
		}
		if (this.getAdjustmentDto() != null
				&& this.getAdjustmentDto().getRevenueIndicatorType() != null
				&& this.getAdjustmentDto().getRevenueIndicatorType()
						.getRevenueIndicatorTypeName() != null) {
			aStrBuilder.append(this.getAdjustmentDto().getRevenueIndicatorType()
					.getRevenueIndicatorTypeName());
			aStrBuilder.append(" ");
		}
		if (this.getActive() != null && this.getActive()) {
			aStrBuilder.append("Active");
			aStrBuilder.append(" ");
		}
		 if(this.getActive()!=null && !this.getActive()){
             aStrBuilder.append("Not Active");
              aStrBuilder.append(" ");  
         }
		if (this.getCurrencyCode() != null) {
			aStrBuilder.append(this.getCurrencyCode());
			aStrBuilder.append(" ");
		}
		if (this.getStatus() != null && this.getStatus().getVal()!=null) {
			aStrBuilder.append(this.getStatus().getVal());
			aStrBuilder.append(" ");
		}

		return aStrBuilder.toString();
	}

	public AccountingAirWaybillDto getAccountingAirWaybillDto() {
		return this.accountingAirWaybillDto;
	}

	public void setAccountingAirWaybillDto(final 
			AccountingAirWaybillDto pAccountingAirWaybillDto) {
		this.accountingAirWaybillDto = pAccountingAirWaybillDto;
	}

	
	/**
	 * Gets the <code>invoiceDate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>invoiceDate</code> property.
	 */
	public Date getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * Sets the <code>invoiceDate</code>.
	 * <p>
	 * 
	 * @param invoiceDate
	 *            holds the new value of <code>InvoiceDate</code>
	 */
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	/**
	 * Gets the <code>invoiceNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>invoiceNumber</code> property.
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	
	/**
	 * Sets the <code>InvoiceNumber</code>.
	 * <p>
	 * 
	 * @param invoiceNumber
	 *            holds the new value of <code>InvoiceNumber</code>
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	
	public ParticipantAgreementsDetailDto getParticipantAgreementsDetailDto() {
		return participantAgreementsDetailDto;
	}

	public void setParticipantAgreementsDetailDto(ParticipantAgreementsDetailDto participantAgreementsDetailDto) {
		this.participantAgreementsDetailDto = participantAgreementsDetailDto;
	}	

	
}
