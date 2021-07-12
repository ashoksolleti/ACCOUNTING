/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.constants.InvoiceFrequencyType;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceMediaType;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceSequenceType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>BillingInfoDto</code> class contain information specific to a BillingInfo.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>invoiceMedia
 * <li>invoiceSequence
 * <li>invoiceLanguage
 * <li>currency
 * <li>invoiceSite
 * <li>invoiceFrequency
 * <li>billingPaymentDueDays
 * <li>serviceFeePercentage
 * <li>discountPercentage
 * <li>accountingPeriod
 * <li>billingPaymentDiscountDays
 * <li>commissionPercentage
 * <li>incentivePercentage
 * <li>oId
 * <li>ytdSales
 * <li>prevYTDSales
 * <li>mtdSales
 * <li>prevMTDSales
 * </code>
 * </ul>
 */
public class BillingInfoDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2675698905781532855L;

    /**
     * Attribute to hold <code>accountingPeriod</code> property.
     */
    private String accountingPeriod;

    /**
     * Attribute to hold <code>billingPaymentDiscountDays</code> property.
     */
    private String billingPaymentDiscountDays;

    /**
     * Attribute to hold <code>billingPaymentDueDays</code> property.
     */
    private String billingPaymentDueDays;

    /**
     * Attribute to hold <code>commissionPercentage</code> property.
     */
    private BigDecimal commissionPercentage;

    private Boolean tdsApply;


    private String commissionPercent;

    public String getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(String commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public String getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(String discountPercent) {
        this.discountPercent = discountPercent;
    }

    public String getIncentivePercent() {
        return incentivePercent;
    }

    public void setIncentivePercent(String incentivePercent) {
        this.incentivePercent = incentivePercent;
    }

    public String getServicePercentage() {
        return servicePercentage;
    }

    public void setServicePercentage(String servicePercentage) {
        this.servicePercentage = servicePercentage;
    }

    /**
     * Attribute to hold <code>currency</code> property.
     */
    private String currency;

    /**
     * Attribute to hold <code>discountPercentage</code> property.
     */
    private BigDecimal discountPercentage;

    private String discountPercent;

    /**
     * Attribute to hold <code>incentivePercentage</code> property.
     */
    private BigDecimal incentivePercentage;

    private String incentivePercent;

    /**
     * Attribute to hold <code>invoiceFrequency</code> property.
     */
    private InvoiceFrequencyType invoiceFrequency;

    /**
     * Attribute to hold <code>invoiceLanguage</code> property.
     */
    private String invoiceLanguage;

    /**
     * Attribute to hold <code>invoiceMedia</code> property.
     */
    private InvoiceMediaType invoiceMedia;

    /**
     * Attribute to hold <code>invoiceSequence</code> property.
     */
    private InvoiceSequenceType invoiceSequence;

    /**
     * Attribute to hold <code>invoiceSite</code> property.
     */
    private String invoiceSite;
    
    /**
     * Attribute to hold <code>iscPercentage</code> property.
     */
    private BigDecimal iscPercentage;

    /**
     * Attribute to hold <code>mtdSales</code> property.
     */
    private String mtdSales;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>prevMTDSales</code> property.
     */
    private String prevMTDSales;

    /**
     * Attribute to hold <code>prevYTDSales</code> property.
     */
    private String prevYTDSales;

    /**
     * Attribute to hold <code>serviceFeePercentage</code> property.
     */
    private BigDecimal serviceFeePercentage;

    private String servicePercentage;

    /**
     * Attribute to hold <code>ytdSales</code> property.
     */
    private String ytdSales;

    /**
     * Attribute to hold <code>accountingDto</code> property.
     */
    private String invoiceEmail;
    
    private InvoiceFrequencyType invoiceFrequencyForCommImp;
    
    private InvoiceFrequencyType invoiceFrequencyForCASS;

    private String accountReceivable;
    
    private String accountPayable;
    
    private Boolean commissionAsShipper;
    
    private Boolean invoiceHardCopy;
    
    private Boolean awbHardCopies;
    
    private Boolean attachAWBHardCopies;
    
    //NAS004
    
    private String airline;
    /**
     * Gets the <code>accountingPeriod</code> property.
     * <p>
     * 
     * @return the current value of the <code>accountingPeriod</code> property.
     */
    public String getAccountingPeriod() {
        return this.accountingPeriod;
    }

    /**
     * Gets the <code>billingPaymentDiscountDays</code> property.
     * <p>
     * 
     * @return the current value of the <code>billingPaymentDiscountDays</code> property.
     */
    public String getBillingPaymentDiscountDays() {
        return this.billingPaymentDiscountDays;
    }

    /**
     * Gets the <code>billingPaymentDueDays</code> property.
     * <p>
     * 
     * @return the current value of the <code>billingPaymentDueDays</code> property.
     */
    public String getBillingPaymentDueDays() {
        return this.billingPaymentDueDays;
    }

    /**
     * Gets the <code>commissionPercentage</code> property.
     * <p>
     * 
     * @return the current value of the <code>commissionPercentage</code> property.
     */
    public BigDecimal getCommissionPercentage() {
        return this.commissionPercentage;
    }

    /**
     * Gets the <code>currency</code> property.
     * <p>
     * 
     * @return the current value of the <code>currency</code> property.
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Gets the <code>discountPercentage</code> property.
     * <p>
     * 
     * @return the current value of the <code>discountPercentage</code> property.
     */
    public BigDecimal getDiscountPercentage() {
        return this.discountPercentage;
    }

    /**
     * Gets the <code>incentivePercentage</code> property.
     * <p>
     * 
     * @return the current value of the <code>incentivePercentage</code> property.
     */
    public BigDecimal getIncentivePercentage() {
        return this.incentivePercentage;
    }

    /**
     * Gets the <code>invoiceFrequency</code> property.
     * <p>
     * 
     * @return the current value of the <code>invoiceFrequency</code> property.
     */
    public InvoiceFrequencyType getInvoiceFrequency() {
        return this.invoiceFrequency;
    }

    /**
     * Gets the <code>invoiceLanguage</code> property.
     * <p>
     * 
     * @return the current value of the <code>invoiceLanguage</code> property.
     */
    public String getInvoiceLanguage() {
        return this.invoiceLanguage;
    }

    /**
     * Gets the <code>invoiceMedia</code> property.
     * <p>
     * 
     * @return the current value of the <code>invoiceMedia</code> property.
     */
    public InvoiceMediaType getInvoiceMedia() {
        return this.invoiceMedia;
    }

    /**
     * Gets the <code>invoiceSequence</code> property.
     * <p>
     * 
     * @return the current value of the <code>invoiceSequence</code> property.
     */
    public InvoiceSequenceType getInvoiceSequence() {
        return this.invoiceSequence;
    }

    /**
     * Gets the <code>invoiceSite</code> property.
     * <p>
     * 
     * @return the current value of the <code>invoiceSite</code> property.
     */
    public String getInvoiceSite() {
        return ContractUtility.convertToUpperCase(this.invoiceSite);

    }
    
    /**
     * Gets the <code>iscPercentage</code> property.
     * <p>
     * 
     * @return the current value of the <code>iscPercentage</code> property.
     */
    public BigDecimal getIscPercentage() {
        return this.iscPercentage;
    }

    /**
     * Gets the <code>mtdSales</code> property.
     * <p>
     * 
     * @return the current value of the <code>mtdSales</code> property.
     */
    public String getMtdSales() {
        return this.mtdSales;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>prevMTDSales</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevMTDSales</code> property.
     */
    public String getPrevMTDSales() {
        return this.prevMTDSales;
    }

    /**
     * Gets the <code>prevYTDSales</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevYTDSales</code> property.
     */
    public String getPrevYTDSales() {
        return this.prevYTDSales;
    }

    /**
     * Gets the <code>serviceFeePercentage</code> property.
     * <p>
     * 
     * @return the current value of the <code>serviceFeePercentage</code> property.
     */
    public BigDecimal getServiceFeePercentage() {
        return this.serviceFeePercentage;
    }

    /**
     * Gets the <code>ytdSales</code> property.
     * <p>
     * 
     * @return the current value of the <code>ytdSales</code> property.
     */
    public String getYtdSales() {
        return this.ytdSales;
    }

    /**
     * Sets the <code>accountingPeriod</code> property.
     * <p>
     * 
     * @param pAccountingPeriod the new value of the <code>accountingPeriod</code> property.
     */
    public void setAccountingPeriod(final String pAccountingPeriod) {
        this.accountingPeriod = pAccountingPeriod;
    }

    /**
     * Sets the <code>billingPaymentDiscountDays</code> property.
     * <p>
     * 
     * @param pBillingPaymentDiscountDays the new value of the <code>billingPaymentDiscountDays</code>
     *            property.
     */
    public void setBillingPaymentDiscountDays(final String pBillingPaymentDiscountDays) {
        this.billingPaymentDiscountDays = pBillingPaymentDiscountDays;
    }

    /**
     * Sets the <code>billingPaymentDueDays</code> property.
     * <p>
     * 
     * @param pBillingPaymentDueDays the new value of the <code>billingPaymentDueDays</code> property.
     */
    public void setBillingPaymentDueDays(final String pBillingPaymentDueDays) {
        this.billingPaymentDueDays = pBillingPaymentDueDays;
    }

    /**
     * Sets the <code>commissionPercentage</code> property.
     * <p>
     * 
     * @param pCommissionPercentage the new value of the <code>commissionPercentage</code> property.
     */
    public void setCommissionPercentage(final BigDecimal pCommissionPercentage) {
        this.commissionPercentage = pCommissionPercentage;
    }

    /**
     * Sets the <code>currency</code> property.
     * <p>
     * 
     * @param pCurrency the new value of the <code>currency</code> property.
     */
    public void setCurrency(final String pCurrency) {
        this.currency = ContractUtility.convertToUpperCase(pCurrency);
    }

    /**
     * Sets the <code>discountPercentage</code> property.
     * <p>
     * 
     * @param pDiscountPercentage the new value of the <code>discountPercentage</code> property.
     */
    public void setDiscountPercentage(final BigDecimal pDiscountPercentage) {
        this.discountPercentage = pDiscountPercentage;
    }

    /**
     * Sets the <code>incentivePercentage</code> property.
     * <p>
     * 
     * @param pIncentivePercentage the new value of the <code>incentivePercentage</code> property.
     */
    public void setIncentivePercentage(final BigDecimal pIncentivePercentage) {
        this.incentivePercentage = pIncentivePercentage;
    }

    /**
     * Sets the <code>invoiceFrequency</code> property.
     * <p>
     * 
     * @param pInvoiceFrequency the new value of the <code>invoiceFrequency</code> property.
     */
    public void setInvoiceFrequency(final InvoiceFrequencyType pInvoiceFrequency) {
        this.invoiceFrequency = pInvoiceFrequency;
    }

    /**
     * Sets the <code>invoiceLanguage</code> property.
     * <p>
     * 
     * @param pInvoiceLanguage the new value of the <code>invoiceLanguage</code> property.
     */
    public void setInvoiceLanguage(final String pInvoiceLanguage) {
        this.invoiceLanguage = ContractUtility.convertToUpperCase(pInvoiceLanguage);
    }

    /**
     * Sets the <code>invoiceMedia</code> property.
     * <p>
     * 
     * @param pInvoiceMedia the new value of the <code>invoiceMedia</code> property.
     */
    public void setInvoiceMedia(final InvoiceMediaType pInvoiceMedia) {
        this.invoiceMedia = pInvoiceMedia;
    }

    /**
     * Sets the <code>invoiceSequence</code> property.
     * <p>
     * 
     * @param pInvoiceSequence the new value of the <code>invoiceSequence</code> property.
     */
    public void setInvoiceSequence(final InvoiceSequenceType pInvoiceSequence) {
        this.invoiceSequence = pInvoiceSequence;
    }

    /**
     * Sets the <code>invoiceSite</code> property.
     * <p>
     * 
     * @param pInvoiceSite the new value of the <code>invoiceSite</code> property.
     */
    public void setInvoiceSite(final String pInvoiceSite) {
        this.invoiceSite = ContractUtility.convertToUpperCase(pInvoiceSite);
    }
    
    /**
     * Gets the <code>iscPercentage</code> property.
     * <p>
     * 
     * @return the current value of the <code>iscPercentage</code> property.
     */
    public void setIscPercentage(final BigDecimal pIscPercentage) {
        this.iscPercentage = pIscPercentage;
    }

    /**
     * Sets the <code>mtdSales</code> property.
     * <p>
     * 
     * @param pMtdSales the new value of the <code>mtdSales</code> property.
     */
    public void setMtdSales(final String pMtdSales) {
        this.mtdSales = pMtdSales;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>prevMTDSales</code> property.
     * <p>
     * 
     * @param pPrevMTDSales the new value of the <code>prevMTDSales</code> property.
     */
    public void setPrevMTDSales(final String pPrevMTDSales) {
        this.prevMTDSales = pPrevMTDSales;
    }

    /**
     * Sets the <code>prevYTDSales</code> property.
     * <p>
     * 
     * @param pPrevYTDSales the new value of the <code>prevYTDSales</code> property.
     */
    public void setPrevYTDSales(final String pPrevYTDSales) {
        this.prevYTDSales = pPrevYTDSales;
    }

    /**
     * Sets the <code>serviceFeePercentage</code> property.
     * <p>
     * 
     * @param pServiceFeePercentage the new value of the <code>serviceFeePercentage</code> property.
     */
    public void setServiceFeePercentage(final BigDecimal pServiceFeePercentage) {
        this.serviceFeePercentage = pServiceFeePercentage;
    }

    /**
     * Sets the <code>ytdSales</code> property.
     * <p>
     * 
     * @param pYtdSales the new value of the <code>ytdSales</code> property.
     */
    public void setYtdSales(final String pYtdSales) {
        this.ytdSales = pYtdSales;
    }

	public String getInvoiceEmail() {
		return invoiceEmail;
	}

	public void setInvoiceEmail(String invoiceEmail) {
		this.invoiceEmail = invoiceEmail;
	}

	/**
	 * @return the invoiceFrequencyForCommImp
	 */
	public InvoiceFrequencyType getInvoiceFrequencyForCommImp() {
		return invoiceFrequencyForCommImp;
	}

	/**
	 * @param invoiceFrequencyForCommImp the invoiceFrequencyForCommImp to set
	 */
	public void setInvoiceFrequencyForCommImp(
			InvoiceFrequencyType invoiceFrequencyForCommImp) {
		this.invoiceFrequencyForCommImp = invoiceFrequencyForCommImp;
	}

	/**
	 * @return the invoiceFrequencyForCASS
	 */
	public InvoiceFrequencyType getInvoiceFrequencyForCASS() {
		return invoiceFrequencyForCASS;
	}

	/**
	 * @param invoiceFrequencyForCASS the invoiceFrequencyForCASS to set
	 */
	public void setInvoiceFrequencyForCASS(
			InvoiceFrequencyType invoiceFrequencyForCASS) {
		this.invoiceFrequencyForCASS = invoiceFrequencyForCASS;
	}

	/**
	 * @return the accountReceivable
	 */
	public String getAccountReceivable() {
		return accountReceivable;
	}

	/**
	 * @param accountReceivable the accountReceivable to set
	 */
	public void setAccountReceivable(String accountReceivable) {
		this.accountReceivable = accountReceivable;
	}

	/**
	 * @return the accountPayable
	 */
	public String getAccountPayable() {
		return accountPayable;
	}

	/**
	 * @param accountPayable the accountPayable to set
	 */
	public void setAccountPayable(String accountPayable) {
		this.accountPayable = accountPayable;
	}

	/**
	 * @return the commissionAsShipper
	 */
	public Boolean getCommissionAsShipper() {
		return commissionAsShipper;
	}

	/**
	 * @param commissionAsShipper the commissionAsShipper to set
	 */
	public void setCommissionAsShipper(Boolean commissionAsShipper) {
		this.commissionAsShipper = commissionAsShipper;
	}

	/**
	 * @return the invoiceHardCopy
	 */
	public Boolean getInvoiceHardCopy() {
		return invoiceHardCopy;
	}

	/**
	 * @param invoiceHardCopy the invoiceHardCopy to set
	 */
	public void setInvoiceHardCopy(Boolean invoiceHardCopy) {
		this.invoiceHardCopy = invoiceHardCopy;
	}

	/**
	 * @return the awbHardCopies
	 */
	public Boolean getAwbHardCopies() {
		return awbHardCopies;
	}

	/**
	 * @param awbHardCopies the awbHardCopies to set
	 */
	public void setAwbHardCopies(Boolean awbHardCopies) {
		this.awbHardCopies = awbHardCopies;
	}

	/**
	 * @return the attachAWBHardCopies
	 */
	public Boolean getAttachAWBHardCopies() {
		return attachAWBHardCopies;
	}

	/**
	 * @param attachAWBHardCopies the attachAWBHardCopies to set
	 */
	public void setAttachAWBHardCopies(Boolean attachAWBHardCopies) {
		this.attachAWBHardCopies = attachAWBHardCopies;
	}

	/**
	 * @return the airline
	 */
	public String getAirline() {
		return airline;
	}

	/**
	 * @param airline the airline to set
	 */
	public void setAirline(String airline) {
		this.airline = airline;
	}

	public Boolean getTdsApply() {
		return tdsApply;
	}

	public void setTdsApply(Boolean tdsApply) {
		this.tdsApply = tdsApply;
	}	

}
