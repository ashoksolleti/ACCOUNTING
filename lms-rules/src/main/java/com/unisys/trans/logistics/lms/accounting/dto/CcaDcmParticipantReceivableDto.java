package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AWBParticipantType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.GenIdType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableType;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.domain.UserAudit;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto;

public class CcaDcmParticipantReceivableDto extends PersistenceObjectDto {

	private static final long serialVersionUID = 1L;
	/**
	 * Attribute to hold <code>accAirWayBill</code> property.
	 */
	private AccountingAirWaybillDto accAirWayBill;

	/**
	 * Attribute to hold <code>amountToBeBilled</code> property.
	 */
	private BigDecimal amountToBeBilled;

	/**
	 * Attribute to hold <code>outstandingAmountToBeBilled</code> property.
	 */
	private BigDecimal outstandingAmountToBeBilled;

	/**
	 * Attribute to hold <code>currencyCode</code> property.
	 */
	private String currencyCode;

	/**
	 * Attribute to hold <code>discount</code> property.
	 */
	private BigDecimal discount;

	/**
	 * Attribute to hold <code>paymentStatusType</code> property.
	 */
	private ReceivableStatusType receivablePaymentStatusType;

	/**
	 * Attribute to hold <code>billingAmountToBeBilled</code> property.
	 */
	private BigDecimal billingAmountToBeBilled;

	/**
	 * Attribute to hold <code>billingOutstandingAmountToBeBilled</code>
	 * property.
	 */
	private BigDecimal billingOutstandingAmountToBeBilled;

	/**
	 * Attribute to hold <code>hostAmountToBeBilled</code> property.
	 */
	private BigDecimal hostAmountToBeBilled;

	/**
	 * Attribute to hold <code>hostOutstandingAmountToBeBilled</code> property.
	 */
	private BigDecimal hostOutstandingAmountToBeBilled;

	/**
	 * Attribute to hold <code>oId</code> property.
	 */
	private Long oId;

	/**
	 * Attribute to hold <code>accountNumber</code> property.
	 */
	private String accountNumber;

	/**
	 * Attribute to hold <code>receivableType</code> property.
	 */
	private ReceivableType receivableType;

	/**
	 * Attribute to hold <code>accountNumber</code> property.
	 */
	private String billingCurrencyCode;

	/**
	 * Attribute to hold <code>accountNumber</code> property.
	 */
	private String hostCurrencyCode;

	/**
	 * Attribute to hold <code>participantType</code> property.
	 */
	private AWBParticipantType participantType;

	/**
	 * Attribute to hold <code>genIDType</code> property.
	 */
	private GenIdType genIDType;

	/**
	 * Attribute to hold <code>receivableSplits</code> property.
	 *//*
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "RECEIVABLE_OID", referencedColumnName = "OID")
	private List<ReceivableSplit> receivableSplits;*/

	/**
     * Attribute to hold <code>invoiceDate</code> property.
     */

    private Date invoiceDate;

    /**
     * Attribute to hold <code>invoiceNumber</code> property.
     */
    private String invoiceNumber;

    /**
     * Attribute to hold <code>invoiceType</code> property.
     */
    private InvoiceParticipantAccountType invoiceType;
    
    
    private InvoiceStatusType invoiceStatus;
    
    //lavanya 
    /*@Column(name = "REMARKS", length = 100, nullable = true)
    private String remarks;*/

	/**
	 * Gets the <code>receivableSplits</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>receivableSplits</code> property.<br>
	 */
	/*public List<ReceivableSplit> getReceivableSplits() {
		return this.receivableSplits;
	}*/

	/**
	 * Sets the <code>receivableSplits</code> property.
	 * <p>
	 * 
	 * @param pReceivableSplits
	 *            the new value of the <code>receivableSplits</code> property.
	 */
	/*public void setReceivableSplits(
			final List<ReceivableSplit> pReceivableSplits) {
		this.receivableSplits = pReceivableSplits;
	}*/

	/**
	 * Gets the <code>participantType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>participantType</code> property.<br>
	 */
	public AWBParticipantType getParticipantType() {
		return this.participantType;
	}

	/**
	 * Sets the <code>participantType</code> property.
	 * <p>
	 * 
	 * @param pParticipantType
	 *            the new value of the <code>participantType</code> property.
	 */

	public void setParticipantType(final AWBParticipantType pAWBParticipantType) {
		this.participantType = pAWBParticipantType;
	}

	/**
	 * Gets the <code>receivableType</code> property.
	 * <p>
	 * 
	 * @return holds the <code>receivableType</code> property.
	 */
	public ReceivableType getReceivableType() {
		return this.receivableType;
	}

	/**
	 * Sets the <code>receivableType</code> property.
	 * <p>
	 * 
	 * @param pReceivableType
	 *            the new value of the <code>receivableType</code> property.
	 */
	public void setReceivableType(ReceivableType pReceivableType) {
		this.receivableType = pReceivableType;
	}

	/**
	 * Gets the <code>accountNumber</code> property.
	 * <p>
	 * 
	 * @return holds the <code>accountNumber</code> property.
	 */
	public String getAccountNumber() {
		return this.accountNumber;
	}

	/**
	 * Gets the <code>amountToBeBilled</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>amountToBeBilled</code> property.<br>
	 */
	public BigDecimal getAmountToBeBilled() {
		return this.amountToBeBilled;
	}

	/**
	 * Gets the <code>oId</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>oId</code> property.<br>
	 */
	@Override
	public Long getOId() {
		return this.oId;
	}

	/**
	 * Sets the <code>accountNumber</code> property.
	 * <p>
	 * 
	 * @param pAccountNumber
	 *            the new value of the <code>accountNumber</code> property.
	 */
	public void setAccountNumber(final String pAccountNumber) {
		this.accountNumber = pAccountNumber;
	}

	/**
	 * Sets the <code>amountToBeBilled</code> property.
	 * <p>
	 * 
	 * @param pAmountToBeBilled
	 *            the new value of the <code>amountToBeBilled</code> property.
	 */

	public void setAmountToBeBilled(final BigDecimal pAmountToBeBilled) {
		this.amountToBeBilled = pAmountToBeBilled;
	}

	/**
	 * Sets the <code>oId</code> property.
	 * <p>
	 * 
	 * @param pOId
	 *            the new value of the <code>oId</code> property.
	 */
	public void setoId(final Long pOId) {
		this.oId = pOId;
	}

	/**
	 * Gets the <code>billingCurrencyCode</code> property.
	 * <p>
	 * 
	 * @return holds the <code>billingCurrencyCode</code> property.
	 */
	public String getBillingCurrencyCode() {
		return this.billingCurrencyCode;
	}

	/**
	 * Sets the <code>billingCurrencyCode</code> implementation injected by the
	 * IoC container.
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
	 * Gets the <code>hostCurrencyCode</code> property.
	 * <p>
	 * 
	 * @return holds the <code>hostCurrencyCode</code> property.
	 */
	public String getHostCurrencyCode() {
		return this.hostCurrencyCode;
	}

	/**
	 * Sets the <code>hostCurrencyCode</code> implementation injected by the IoC
	 * container.
	 * <p>
	 * 
	 * @param pHostCurrencyCode
	 *            the new value of the <code>hostCurrencyCode</code> property.
	 */
	public void setHostCurrencyCode(final String pHostCurrencyCode) {
		this.hostCurrencyCode = pHostCurrencyCode;
	}

	/**
	 * Gets the <code>outstandingAmountToBeBilled</code> property.
	 * <p>
	 * 
	 * @return holds the <code>outstandingAmountToBeBilled</code> property.
	 */
	public BigDecimal getOutstandingAmountToBeBilled() {
		return this.outstandingAmountToBeBilled;
	}

	/**
	 * Sets the <code>outstandingAmountToBeBilled</code> implementation injected
	 * by the IoC container.
	 * <p>
	 * 
	 * @param pOutstandingAmountToBeBilled
	 *            the new value of the <code>outstandingAmountToBeBilled</code>
	 *            property.
	 */
	public void setOutstandingAmountToBeBilled(
			final BigDecimal pOutstandingAmountToBeBilled) {
		this.outstandingAmountToBeBilled = pOutstandingAmountToBeBilled;
	}

	/**
	 * Gets the <code>currencyCode</code> property.
	 * <p>
	 * 
	 * @return holds the <code>currencyCode</code> property.
	 */
	public String getCurrencyCode() {
		return this.currencyCode;
	}

	/**
	 * Sets the <code>currencyCode</code> implementation injected by the IoC
	 * container.
	 * <p>
	 * 
	 * @param pCurrencyCode
	 *            the new value of the
	 *            <code>billingcurrencyCodeAmountToBeBilled</code> property.
	 */
	public void setCurrencyCode(final String pCurrencyCode) {
		this.currencyCode = pCurrencyCode;
	}

	/**
	 * Gets the <code>billingAmountToBeBilled</code> property.
	 * <p>
	 * 
	 * @return holds the <code>billingAmountToBeBilled</code> property.
	 */
	public BigDecimal getBillingAmountToBeBilled() {
		return this.billingAmountToBeBilled;
	}

	/**
	 * Sets the <code>billingAmountToBeBilled</code> implementation injected by
	 * the IoC container.
	 * <p>
	 * 
	 * @param pBillingAmountToBeBilled
	 *            the new value of the <code>billingAmountToBeBilled</code>
	 *            property.
	 */
	public void setBillingAmountToBeBilled(
			final BigDecimal pBillingAmountToBeBilled) {
		this.billingAmountToBeBilled = pBillingAmountToBeBilled;
	}

	/**
	 * Gets the <code>billingOutstandingAmountToBeBilled</code> property.
	 * <p>
	 * 
	 * @return holds the <code>billingOutstandingAmountToBeBilled</code>
	 *         property.
	 */
	public BigDecimal getBillingOutstandingAmountToBeBilled() {
		return this.billingOutstandingAmountToBeBilled;
	}

	/**
	 * Sets the <code>billingOutstandingAmountToBeBilled</code> implementation
	 * injected by the IoC container.
	 * <p>
	 * 
	 * @param pBillingOutstandingAmountToBeBilled
	 *            the new value of the
	 *            <code>billingOutstandingAmountToBeBilled</code> property.
	 */
	public void setBillingOutstandingAmountToBeBilled(
			final BigDecimal pBillingOutstandingAmountToBeBilled) {
		this.billingOutstandingAmountToBeBilled = pBillingOutstandingAmountToBeBilled;
	}

	/**
	 * Gets the <code>hostAmountToBeBilled</code> property.
	 * <p>
	 * 
	 * @return holds the <code>hostAmountToBeBilled</code> property.
	 */
	public BigDecimal getHostAmountToBeBilled() {
		return this.hostAmountToBeBilled;
	}

	/**
	 * Sets the <code>hostAmountToBeBilled</code> implementation injected by the
	 * IoC container.
	 * <p>
	 * 
	 * @param pHostAmountToBeBilled
	 *            the new value of the <code>hostAmountToBeBilled</code>
	 *            property.
	 */
	public void setHostAmountToBeBilled(final BigDecimal pHostAmountToBeBilled) {
		this.hostAmountToBeBilled = pHostAmountToBeBilled;
	}

	/**
	 * Gets the <code>hostOutstandingAmountToBeBilled</code> property.
	 * <p>
	 * 
	 * @return holds the <code>hostOutstandingAmountToBeBilled</code> property.
	 */
	public BigDecimal getHostOutstandingAmountToBeBilled() {
		return this.hostOutstandingAmountToBeBilled;
	}

	/**
	 * Sets the <code>hostOutstandingAmountToBeBilled</code> implementation
	 * injected by the IoC container.
	 * <p>
	 * 
	 * @param pHostOutstandingAmountToBeBilled
	 *            the new value of the
	 *            <code>hostOutstandingAmountToBeBilled</code> property.
	 */
	public void setHostOutstandingAmountToBeBilled(
			final BigDecimal pHostOutstandingAmountToBeBilled) {
		this.hostOutstandingAmountToBeBilled = pHostOutstandingAmountToBeBilled;
	}


	/**
	 * @return the invoiceStatus
	 */
	public InvoiceStatusType getInvoiceStatus() {
		return invoiceStatus;
	}

	/**
	 * @param invoiceStatus the invoiceStatus to set
	 */
	public void setInvoiceStatus(InvoiceStatusType invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}


	/**
	 * Gets the <code>receivablePaymentStatusType</code> property.
	 * <p>
	 * 
	 * @return holds the <code>receivablePaymentStatusType</code> property.
	 */
	public ReceivableStatusType getReceivablePaymentStatusType() {
		return this.receivablePaymentStatusType;
	}

	/**
	 * Sets the <code>receivablePaymentStatusType</code> implementation injected
	 * by the IoC container.
	 * <p>
	 * 
	 * @param pReceivablePaymentStatusType
	 *            the new value of the <code>receivablePaymentStatusType</code>
	 *            property.
	 */
	public void setReceivablePaymentStatusType(
			ReceivableStatusType pReceivablePaymentStatusType) {
		this.receivablePaymentStatusType = pReceivablePaymentStatusType;
	}

	/**
	 * Gets the <code>genIDType</code> property.
	 * <p>
	 * 
	 * @return holds the <code>genIDType</code> property.
	 */
	public GenIdType getGenIDType() {
		return this.genIDType;
	}

	/**
	 * Sets the <code>genIDType</code> implementation injected by the IoC
	 * container.
	 * <p>
	 * 
	 * @param pGenIDType
	 *            the new value of the <code>genIDType</code> property.
	 */
	public void setGenIDType(GenIdType pGenIDType) {
		this.genIDType = pGenIDType;
	}

	@Column(name = "ACTIVE", columnDefinition = "NUMBER(1)", nullable = true)
	private Boolean active;

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
	 * Sets the <code>active</code> property.
	 * <p>
	 * 
	 * @param pActive
	 *            the new value of the <code>active</code> property.
	 */
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

	@Column(name = "HOSTEXCHANGERATE", length = 200, nullable = true)
	private String hostExchangeRate;

	/**
	 * Gets the <code>hostExchangeRate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>hostExchangeRate</code> property.<br>
	 */
	public String getHostExchangeRate() {
		return this.hostExchangeRate;
	}

	/**
	 * Sets the <code>hostExchangeRate</code> property.
	 * <p>
	 * 
	 * @param pHostExchangeRate
	 *            the new value of the <code>hostExchangeRate</code> property.
	 */
	public void setHostExchangeRate(String pHostExchangeRate) {
		this.hostExchangeRate = pHostExchangeRate;
	}

	private ExchangeRateDto hostExchangeRateDetail;


	private String billingExchangeRate;

	/**
	 * Gets the <code>billingExchangeRate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>billingExchangeRate</code>
	 *         property.<br>
	 */
	public String getBillingExchangeRate() {
		return this.billingExchangeRate;
	}

	/**
	 * Sets the <code>billingExchangeRate</code> property.
	 * <p>
	 * 
	 * @param pBillingExchangeRate
	 *            the new value of the <code>billingExchangeRate</code>
	 *            property.
	 */
	public void setBillingExchangeRate(String pBillingExchangeRate) {
		this.billingExchangeRate = pBillingExchangeRate;
	}




	/**
	 * Attribute to hold <code>netAmountToBeBilled</code> property.
	 */
	private BigDecimal netAmountToBeBilled = new BigDecimal(0);

	/**
	 * Attribute to hold <code>netBillingAmountToBeBilled</code> property.
	 */
	private BigDecimal netBillingAmountToBeBilled = new BigDecimal(0);

	/**
	 * Attribute to hold <code>netHostAmountToBeBilled</code> property.
	 */
	private BigDecimal netHostAmountToBeBilled = new BigDecimal(0);

	/**
	 * Gets the <code>netBillingAmountToBeBilled</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>netBillingAmountToBeBilled</code>
	 *         property.<br>
	 */
	public BigDecimal getNetAmountToBeBilled() {
		return this.netAmountToBeBilled;
	}

	/**
	 * Sets the <code>netAmountToBeBilled</code> property.
	 * <p>
	 * 
	 * @param pNetAmountToBeBilled
	 *            the new value of the <code>netAmountToBeBilled</code>
	 *            property.
	 */
	public void setNetAmountToBeBilled(final BigDecimal pNetAmountToBeBilled) {
		this.netAmountToBeBilled = pNetAmountToBeBilled;
	}

	/**
	 * Gets the <code>netBillingAmountToBeBilled</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>netBillingAmountToBeBilled</code>
	 *         property.<br>
	 */
	public BigDecimal getNetBillingAmountToBeBilled() {
		return this.netBillingAmountToBeBilled;
	}

	/**
	 * Sets the <code>netBillingAmountToBeBilled</code> property.
	 * <p>
	 * 
	 * @param pNetBillingAmountToBeBilled
	 *            the new value of the <code>netBillingAmountToBeBilled</code>
	 *            property.
	 */
	public void setNetBillingAmountToBeBilled(
			final BigDecimal pNetBillingAmountToBeBilled) {
		this.netBillingAmountToBeBilled = pNetBillingAmountToBeBilled;
	}

	/**
	 * Gets the <code>netHostAmountToBeBilled</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>netHostAmountToBeBilled</code>
	 *         property.<br>
	 */
	public BigDecimal getNetHostAmountToBeBilled() {
		return this.netHostAmountToBeBilled;
	}

	/**
	 * Sets the <code>netHostAmountToBeBilled</code> property.
	 * <p>
	 * 
	 * @param pNetHostAmountToBeBilled
	 *            the new value of the <code>netHostAmountToBeBilled</code>
	 *            property.
	 */
	public void setNetHostAmountToBeBilled(
			final BigDecimal pNetHostAmountToBeBilled) {
		this.netHostAmountToBeBilled = pNetHostAmountToBeBilled;
	}

	/**
	 * Gets the <code>discount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>discount</code> property.<br>
	 */
	public BigDecimal getDiscount() {
		return this.discount;
	}

	/**
	 * Sets the <code>discount</code> property.
	 * <p>
	 * 
	 * @param pDiscount
	 *            the new value of the <code>discount</code> property.
	 */
	public void setDiscount(BigDecimal pDiscount) {
		this.discount = pDiscount;
	}

	/**
	 * Attribute to hold <code>netDiscount</code> property.
	 */
	private BigDecimal netDiscount;

	/**
	 * Gets the <code>netDiscount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>netDiscount</code> property.<br>
	 */
	public BigDecimal getNetDiscount() {
		return this.netDiscount;
	}

	/**
	 * Sets the <code>netDiscount</code> property.
	 * <p>
	 * 
	 * @param pNetDiscount
	 *            the new value of the <code>netDiscount</code> property.
	 */
	public void setNetDiscount(final BigDecimal pNetDiscount) {
		this.netDiscount = pNetDiscount;
	}
	 /**
     * Gets the <code>invoiceDate</code> property.
     * 
     * @return the current value of the <code>invoiceDate</code> property.<br>
     */
    public Date getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the <code>otherChargeSplits</code> property.
     * <p>
     * 
     * @param pInvoiceDate
     *            the new value of the <code>otherChargeSplits</code> property.
     */
    public void setInvoiceDate(final Date pInvoiceDate) {
        this.invoiceDate = pInvoiceDate;
    }

    /**
     * Gets the <code>invoiceNumber</code> property.
     * 
     * @return the current value of the <code>invoiceNumber</code> property.<br>
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the <code>invoiceNumber</code> property.
     * <p>
     * 
     * @param pInvoiceNumber
     *            the new value of the <code>invoiceNumber</code> property.
     */
    public void setInvoiceNumber(final String pInvoiceNumber) {
        this.invoiceNumber = pInvoiceNumber;
    }

    
    //lavanya 
      
    /**
     * Gets the <code>remarks</code> property.
     * 
     * @return the current value of the <code>remarks</code> property.<br>
     */
   /* public String getRemarks() {
        return remarks;
    }*/

    /**
     * Sets the <code>remarks</code> property.
     * <p>
     * 
     * @param pRemarks
     *            the new value of the <code>remarks</code> property.
     */
    /*public void setRemarks(final String pRemarks) {
        this.remarks = pRemarks;
    }*/
    
    /**
     * @return the invoiceType
     */
    public InvoiceParticipantAccountType getInvoiceType() {
        return invoiceType;
    }

    /**
     * @param invoiceType the invoiceType to set
     */
    public void setInvoiceType(InvoiceParticipantAccountType invoiceType) {
        this.invoiceType = invoiceType;
    }

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @return the accAirWayBill
	 */
	public AccountingAirWaybillDto getAccAirWayBill() {
		return accAirWayBill;
	}

	/**
	 * @param accAirWayBill the accAirWayBill to set
	 */
	public void setAccAirWayBill(AccountingAirWaybillDto accAirWayBill) {
		this.accAirWayBill = accAirWayBill;
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

}