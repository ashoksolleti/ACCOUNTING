/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.unisys.trans.logistics.lms.accounting.dto.constants.CommissionType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.GenIdType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ParticipantAgreementType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ParticipantRoleType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PaymentStatusType;
import com.unisys.trans.logistics.lms.framework.domain.PersistenceObject;
import com.unisys.trans.logistics.lms.framework.domain.UserAudit;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto;
import com.unisys.trans.logistics.lms.utils.dto.constants.ExchangeRateType;

/**
 * <code>ParticipantPayable</code> class contain information specific to an
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

public class CcaDcmParticipantPayableDto extends PersistenceObjectDto {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/*@ManyToOne
	@JoinColumn(name = "ACC_AWB_OID", columnDefinition = "NUMBER(38)", nullable = true)
	private AccountingAirWaybill accAirWayBill;*/

	/**
	 * Attribute to hold <code>participantRoleType</code> property.
	 */
	private ParticipantRoleType participantRoleType;

	/**
	 * Attribute to hold <code>participantAccountNumber</code> property.
	 */
	private String participantAccountNumber;

	/**
	 * Attribute to hold <code>participantAggrementType</code> property.
	 */
	private ParticipantAgreementType participantAgreementType;

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
	 * Attribute to hold <code>oId</code> property.
	 */
	private Long oId;

	/**
	 * Attribute to hold <code>status</code> property.
	 */
	private PaymentStatusType status;

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
	 * Attribute to hold <code>billingExchangeRateType</code> property.
	 */
	private ExchangeRateType billingExchangeRateType;

	/**
	 * Attribute to hold <code>hostCommissionAmount</code> property.
	 */
	private BigDecimal hostCommissionAmount;

	/**
	 * Attribute to hold <code>hostCurrencyCode</code> property.
	 */
	private String hostCurrencyCode;

	/**
	 * Attribute to hold <code>hostExchangeRateType</code> property.
	 */
	private ExchangeRateType hostExchangeRateType;

	/**
	 * Attribute to hold <code>genIDType</code> property.
	 */
	private GenIdType genIDType;

	private String station;

	/**
	 * Attribute to hold <code>slidingScaleEntry</code> property.
	 */
	//@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	//@JoinColumn(name = "ACC_SLIDINGSCALENTRY_OID", columnDefinition = "NUMBER(38)", nullable = true)
	//private SlidingScaleEntry slidingScaleEntry;

	/**
	 * Gets the <code>accAirWayBill</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>accAirWayBill</code> property.<br>
	 */
	/*public AccountingAirWaybill getAccAirWayBill() {
		return this.accAirWayBill;
	}
*/
	/**
	 * Gets the <code>agreementIdentifier</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>agreementIdentifier</code>
	 *         property.<br>
	 */
	public String getAgreementIdentifier() {
		return this.agreementIdentifier;
	}

	/**
	 * Gets the <code>billingCommissionAmount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>billingCommissionAmount</code>
	 *         property.<br>
	 */
	public BigDecimal getBillingCommissionAmount() {
		return this.billingCommissionAmount;
	}

	/**
	 * Gets the <code>billingCommissionAmount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>billingCommissionAmount</code>
	 *         property.<br>
	 */
	public String getBillingCurrencyCode() {
		return this.billingCurrencyCode;
	}

	/**
	 * Gets the <code>billingExchangeRateType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>billingExchangeRateType</code>
	 *         property.<br>
	 */
	public ExchangeRateType getBillingExchangeRateType() {
		return this.billingExchangeRateType;
	}

	/**
	 * Gets the <code>commissionAmount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>commissionAmount</code> property.<br>
	 */
	public BigDecimal getCommissionAmount() {
		return this.commissionAmount;
	}

	/**
	 * Gets the <code>commissionPercentage</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>commissionPercentage</code>
	 *         property.<br>
	 */

	public BigDecimal getCommissionPercentage() {
		return this.commissionPercentage;
	}

	/**
	 * Gets the <code>commissionType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>commissionType</code> property.<br>
	 */
	public CommissionType getCommissionType() {
		return this.commissionType;
	}

	/**
	 * Gets the <code>currencyCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>currencyCode</code> property.<br>
	 */

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	/**
	 * Gets the <code>hostCommissionAmount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>hostCommissionAmount</code>
	 *         property.<br>
	 */
	public BigDecimal getHostCommissionAmount() {
		return this.hostCommissionAmount;
	}

	/**
	 * Gets the <code>hostCurrencyCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>hostCurrencyCode</code> property.<br>
	 */
	public String getHostCurrencyCode() {
		return this.hostCurrencyCode;
	}

	/**
	 * Gets the <code>hostExchangeRateType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>hostExchangeRateType</code>
	 *         property.<br>
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
	 *         property.<br>
	 */
	public String getParticipantAccountNumber() {
		return this.participantAccountNumber;
	}

	/**
	 * Gets the <code>participantAgreementType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>participantAgreementType</code>
	 *         property.<br>
	 */
	public ParticipantAgreementType getParticipantAgreementType() {
		return this.participantAgreementType;
	}

	/**
	 * Gets the <code>participantRoleType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>participantRoleType</code>
	 *         property.<br>
	 */
	public ParticipantRoleType getParticipantRoleType() {
		return this.participantRoleType;
	}

	/**
	 * Gets the <code>status</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>status</code> property.<br>
	 */
	public PaymentStatusType getStatus() {
		return this.status;
	}

	/**
	 * Sets the <code>accAirWayBill</code> property.
	 * <p>
	 * 
	 * @param pAccAirWayBill
	 *            the new value of the <code>stataccAirWayBillus</code>
	 *            property.
	 */
	/*public void setAccAirWayBill(AccountingAirWaybill pAccAirWayBill) {
		this.accAirWayBill = pAccAirWayBill;
	}*/

	/**
	 * Sets the <code>agreementIdentifier</code> property.
	 * <p>
	 * 
	 * @param pAgreementIdentifier
	 *            the new value of the <code>agreementIdentifier</code>
	 *            property.
	 */
	public void setAgreementIdentifier(final String pAgreementIdentifier) {
		this.agreementIdentifier = pAgreementIdentifier;
	}

	/**
	 * Sets the <code>billingCommissionAmount</code> property.
	 * <p>
	 * 
	 * @param pBillingCommissionAmount
	 *            the new value of the <code>billingCommissionAmount</code>
	 *            property.
	 */
	public void setBillingCommissionAmount(
			final BigDecimal pBillingCommissionAmount) {
		this.billingCommissionAmount = pBillingCommissionAmount;
	}

	/**
	 * Sets the <code>billingCurrencyCode</code> property.
	 * <p>
	 * 
	 * @param pBillingCurrencyCode
	 *            the new value of the <code>billingCurrencyCode</code>
	 *            property.
	 */
	public void setBillingCurrencyCode(final String pBillingCurrencyCode) {
		this.billingCurrencyCode = pBillingCurrencyCode;
	}

	/**
	 * Sets the <code>billingExchangeRateType</code> property.
	 * <p>
	 * 
	 * @param pBillingExchangeRateType
	 *            the new value of the <code>billingExchangeRateType</code>
	 *            property.
	 */
	public void setBillingExchangeRateType(
			final ExchangeRateType pBillingExchangeRateType) {
		this.billingExchangeRateType = pBillingExchangeRateType;
	}

	/**
	 * Sets the <code>commissionAmount</code> property.
	 * <p>
	 * 
	 * @param pCommissionAmount
	 *            the new value of the <code>commissionAmount</code> property.
	 */
	public void setCommissionAmount(final BigDecimal pCommissionAmount) {
		this.commissionAmount = pCommissionAmount;
	}

	/**
	 * Sets the <code>commissionPercentage</code> property.
	 * <p>
	 * 
	 * @param pCommissionPercentage
	 *            the new value of the <code>commissionPercentage</code>
	 *            property.
	 */

	public void setCommissionPercentage(final BigDecimal pCommissionPercentage) {
		this.commissionPercentage = pCommissionPercentage;
	}

	/**
	 * Sets the <code>commissionType</code> property.
	 * <p>
	 * 
	 * @param pCommissionType
	 *            the new value of the <code>commissionType</code> property.
	 */
	public void setCommissionType(final CommissionType pCommissionType) {
		this.commissionType = pCommissionType;
	}

	/**
	 * Sets the <code>currencyCode</code> property.
	 * <p>
	 * 
	 * @param pCurrencyCode
	 *            the new value of the <code>currencyCode</code> property.
	 */
	public void setCurrencyCode(final String pCurrencyCode) {
		this.currencyCode = pCurrencyCode;
	}

	/**
	 * Sets the <code>hostCommissionAmount</code> property.
	 * <p>
	 * 
	 * @param pHostCommissionAmount
	 *            the new value of the <code>hostCommissionAmount</code>
	 *            property.
	 */
	public void setHostCommissionAmount(final BigDecimal pHostCommissionAmount) {
		this.hostCommissionAmount = pHostCommissionAmount;
	}

	/**
	 * Sets the <code>hostCurrencyCode</code> property.
	 * <p>
	 * 
	 * @param pHostCurrencyCode
	 *            the new value of the <code>hostCurrencyCode</code> property.
	 */
	public void setHostCurrencyCode(final String pHostCurrencyCode) {
		this.hostCurrencyCode = pHostCurrencyCode;
	}

	/**
	 * Sets the <code>hostExchangeRateType</code> property.
	 * <p>
	 * 
	 * @param pHostExchangeRateType
	 *            the new value of the <code>hostExchangeRateType</code>
	 *            property.
	 */
	public void setHostExchangeRateType(
			final ExchangeRateType pHostExchangeRateType) {
		this.hostExchangeRateType = pHostExchangeRateType;
	}

	/**
	 * Sets the <code>oId</code> property.
	 * <p>
	 * 
	 * @param pOId
	 *            the new value of the <code>oId</code> property.
	 */
	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

	/**
	 * Sets the <code>participantAccountNumber</code> property.
	 * <p>
	 * 
	 * @param pParticipantAccountNumber
	 *            the new value of the <code>participantAccountNumber</code>
	 *            property.
	 */

	public void setParticipantAccountNumber(
			final String pParticipantAccountNumber) {
		this.participantAccountNumber = pParticipantAccountNumber;
	}

	/**
	 * Sets the <code>participantAgreementType</code> property.
	 * <p>
	 * 
	 * @param pParticipantAgreementType
	 *            the new value of the <code>participantAgreementType</code>
	 *            property.
	 */
	public void setParticipantAgreementType(
			ParticipantAgreementType pParticipantAgreementType) {
		this.participantAgreementType = pParticipantAgreementType;
	}

	/**
	 * Sets the <code>participantRoleType</code> property.
	 * <p>
	 * 
	 * @param pParticipantRoleType
	 *            the new value of the <code>participantRoleType</code>
	 *            property.
	 */
	public void setParticipantRoleType(
			final ParticipantRoleType pParticipantRoleType) {
		this.participantRoleType = pParticipantRoleType;
	}

	/**
	 * Sets the <code>status</code> property.
	 * <p>
	 * 
	 * @param pStatus
	 *            the new value of the <code>status</code> property.
	 */
	public void setStatus(final PaymentStatusType pStatus) {
		this.status = pStatus;
	}

	/**
	 * Gets the <code>genIDType</code> property.
	 * 
	 * @return the current value of the <code>genIDType</code> property.<br>
	 */
	public GenIdType getGenIDType() {
		return genIDType;
	}

	/**
	 * Sets the <code>genIDType</code> property.
	 * <p>
	 * 
	 * @param pStatus
	 *            the new value of the <code>genIDType</code> property.
	 */
	public void setGenIDType(final GenIdType pGenIDType) {
		this.genIDType = pGenIDType;
	}

	@Column(name = "ACTIVE", columnDefinition = "NUMBER(1)", nullable = true)
	private Boolean active;

	public Boolean getActive() {
		return active;
	}

	public void setActive(final Boolean pActive) {
		this.active = pActive;
	}

	/**
	 * Attribute to hold <code>adjustment</code> property.
	 */
	@Embedded
	private AdjustmentDto adjustment;


	/**
	 * Attribute to hold <code>userAudit</code> property.
	 */
	@Embedded
	private UserAudit userAudit;

	/**
	 * Gets the <code>UserAudit</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>userAudit</code> property.
	 */
	public UserAudit getUserAudit() {
		return this.userAudit;
	}

	/**
	 * Sets the <code>UserAudit</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * KG or LB List
	 * <p>
	 * <b>Example: </b><br>
	 * KG
	 * <p>
	 * 
	 * @param pUserAudit
	 *            the current value of the <code>UserAudit</code> property.
	 */
	public void setUserAudit(final UserAudit pUserAudit) {
		this.userAudit = pUserAudit;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(final String pStation) {
		this.station = pStation;
	}

	@Column(name = "HOSTEXCHANGERATE", length = 200, nullable = true)
	private String hostExchangeRate;

	public String getHostExchangeRate() {
		return hostExchangeRate;
	}

	public void setHostExchangeRate(String pHostExchangeRate) {
		this.hostExchangeRate = pHostExchangeRate;
	}

	private ExchangeRateDto hostExchangeRateDetail;


	private String billingExchangeRate;

	public String getBillingExchangeRate() {
		return billingExchangeRate;
	}

	public void setBillingExchangeRate(String pBillingExchangeRate) {
		this.billingExchangeRate = pBillingExchangeRate;
	}

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

	/**
	 * @return the adjustment
	 */
	public AdjustmentDto getAdjustment() {
		return adjustment;
	}

	/**
	 * @param adjustment the adjustment to set
	 */
	public void setAdjustment(AdjustmentDto adjustment) {
		this.adjustment = adjustment;
	}

	/**
	 * @return the hostExchangeRateDetail
	 */
	public ExchangeRateDto getHostExchangeRateDetail() {
		return hostExchangeRateDetail;
	}

	/**
	 * @param hostExchangeRateDetail the hostExchangeRateDetail to set
	 */
	public void setHostExchangeRateDetail(ExchangeRateDto hostExchangeRateDetail) {
		this.hostExchangeRateDetail = hostExchangeRateDetail;
	}

	/**
	 * Gets the <code>slidingScaleEntry</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>slidingScaleEntry</code> property.
	 */
	/*public SlidingScaleEntry getSlidingScaleEntry() {
		return this.slidingScaleEntry;
	}*/

	/**
	 * Sets the <code>slidingScaleEntry</code> property.
	 * <p>
	 * 
	 * @param pSlidingScaleEntry
	 *            the new value of the <code>slidingScaleEntry</code> property.
	 */
	/*public void setSlidingScaleEntry(final SlidingScaleEntry pSlidingScaleEntry) {
		this.slidingScaleEntry = pSlidingScaleEntry;
	}*/

}