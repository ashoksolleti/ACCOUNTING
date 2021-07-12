package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

import com.unisys.trans.logistics.lms.accounting.dto.constants.VATIdentifier;


public class AccountingVatAmountBreakdownDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>actualDataLine</code> property.
     */
    private String actualDataLine;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>vatBaseAmountActual</code> property.
     */
    private BigDecimal vatBaseAmountActual;

    /**
     * Attribute to hold <code>vatBaseAmountAccepted</code> property.
     */
    private BigDecimal vatBaseAmountAccepted;

    /**
     * Attribute to hold <code>vatBaseAmountBilled</code> property.
     */
    private BigDecimal vatBaseAmountBilled;

    /**
     * Attribute to hold <code>vatBaseAmountDiff</code> property.
     */
    private BigDecimal vatBaseAmountDiff;

    /**
     * Attribute to hold <code>vatCalAmountActual</code> property.
     */
    private BigDecimal vatCalAmountActual;

    /**
     * Attribute to hold <code>vatCalAmountAccepted</code> property.
     */
    private BigDecimal vatCalAmountAccepted;

    /**
     * Attribute to hold <code>vatCalAmountBilled</code> property.
     */
    private BigDecimal vatCalAmountBilled;

    /**
     * Attribute to hold <code>vatCalAmountDiff</code> property.
     */
    private BigDecimal vatCalAmountDiff;

    /**
     * Attribute to hold <code>vatId</code> property.
     */
    private String vatId;

    /**
     * Attribute to hold <code>vatLabel</code> property.
     */
    private String vatLabel;

    /**
     * Attribute to hold <code>vatPercentageActual</code> property.
     */
    private BigDecimal vatPercentageActual;

    /**
     * Attribute to hold <code>vatPercentageAccepted</code> property.
     */
    private BigDecimal vatPercentageAccepted;

    /**
     * Attribute to hold <code>vatPercentageBilled</code> property.
     */
    private BigDecimal vatPercentageBilled;

    /**
     * Attribute to hold <code>vatPercentageDiff</code> property.
     */
    private BigDecimal vatPercentageDiff;

    /**
     * Attribute to hold <code>vatText</code> property.
     */
    private String vatText;
    
    private VATIdentifier vatIdentifier ; 
    
    private  String vatCode ;

    public String getVatCode() {
		return vatCode;
	}

	public void setVatCode(String vatCode) {
		this.vatCode = vatCode;
	}

	public VATIdentifier getVatIdentifier() {
		return vatIdentifier;
	}

	public void setVatIdentifier(VATIdentifier vatIdentifier) {
		this.vatIdentifier = vatIdentifier;
	}

	/**
     * 
     */
    public AccountingVatAmountBreakdownDto() {
    }

    /**
     * @return
     */
    public String getActualDataLine() {
        return this.actualDataLine;
    }

    /**
     * @return
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * @return
     */
    public BigDecimal getVatBaseAmountActual() {
        return this.vatBaseAmountActual;
    }

    /**
     * @return
     */
    public BigDecimal getVatBaseAmountBilled() {
        return this.vatBaseAmountBilled;
    }

    /**
     * @return the vatBaseAmountDiff
     */
    public BigDecimal getVatBaseAmountDiff() {
        return this.vatBaseAmountDiff;
    }

    /**
     * @return
     */
    public BigDecimal getVatCalAmountActual() {
        return this.vatCalAmountActual;
    }

    /**
     * @return
     */
    public BigDecimal getVatCalAmountBilled() {
        return this.vatCalAmountBilled;
    }

    /**
     * @return the vatCalAmountDiff
     */
    public BigDecimal getVatCalAmountDiff() {
        return this.vatCalAmountDiff;
    }

    /**
     * @return
     */
    public String getVatId() {
        return this.vatId;
    }

    /**
     * @return
     */
    public String getVatLabel() {
        return this.vatLabel;
    }

    /**
     * @return
     */
    public BigDecimal getVatPercentageActual() {
        return this.vatPercentageActual;
    }

    /**
     * @return
     */
    public BigDecimal getVatPercentageBilled() {
        return this.vatPercentageBilled;
    }

    /**
     * @return the vatPercentageDiff
     */
    public BigDecimal getVatPercentageDiff() {
        return this.vatPercentageDiff;
    }

    /**
     * @return
     */
    public String getVatText() {
        return this.vatText;
    }

    /**
     * @param pActualDataLine
     */
    public void setActualDataLine(String pActualDataLine) {
        this.actualDataLine = pActualDataLine;
    }

    /**
     * @param pOId
     */
    public void setOId(Long pOId) {
        this.oId = pOId;
    }

    /**
     * @param pVatBaseAmountActual
     */
    public void setVatBaseAmountActual(final BigDecimal pVatBaseAmountActual) {
        this.vatBaseAmountActual = pVatBaseAmountActual;
    }

    /**
     * @param pVatBaseAmountBilled
     */
    public void setVatBaseAmountBilled(final BigDecimal pVatBaseAmountBilled) {
        this.vatBaseAmountBilled = pVatBaseAmountBilled;
    }

    /**
     * @param pVatBaseAmountDiff the vatBaseAmountDiff to set
     */
    public void setVatBaseAmountDiff(final BigDecimal pVatBaseAmountDiff) {
        this.vatBaseAmountDiff = pVatBaseAmountDiff;
    }

    /**
     * @param pVatCalAmountActual
     */
    public void setVatCalAmountActual(final BigDecimal pVatCalAmountActual) {
        this.vatCalAmountActual = pVatCalAmountActual;
    }

    /**
     * @param pVatCalAmountBilled
     */
    public void setVatCalAmountBilled(final BigDecimal pVatCalAmountBilled) {
        this.vatCalAmountBilled = pVatCalAmountBilled;
    }

    /**
     * @param pVatCalAmountDiff the vatCalAmountDiff to set
     */
    public void setVatCalAmountDiff(BigDecimal pVatCalAmountDiff) {
        this.vatCalAmountDiff = pVatCalAmountDiff;
    }

    /**
     * @param pVatId
     */
    public void setVatId(final String pVatId) {
        this.vatId = pVatId;
    }

    /**
     * @param pVatLabel
     */
    public void setVatLabel(final String pVatLabel) {
        this.vatLabel = pVatLabel;
    }

    /**
     * @param pVatPercentageActual
     */
    public void setVatPercentageActual(final BigDecimal pVatPercentageActual) {
        this.vatPercentageActual = pVatPercentageActual;
    }

    /**
     * @param pVatPercentageBilled
     */
    public void setVatPercentageBilled(final BigDecimal pVatPercentageBilled) {
        this.vatPercentageBilled = pVatPercentageBilled;
    }

    /**
     * @param pVatPercentageDiff the vatPercentageDiff to set
     */
    public void setVatPercentageDiff(BigDecimal pVatPercentageDiff) {
        this.vatPercentageDiff = pVatPercentageDiff;
    }

    /**
     * @param pVatText
     */
    public void setVatText(final String pVatText) {
        this.vatText = pVatText;
    }

    public BigDecimal getVatBaseAmountAccepted() {
        return vatBaseAmountAccepted;
    }

    public void setVatBaseAmountAccepted(BigDecimal vatBaseAmountAccepted) {
        this.vatBaseAmountAccepted = vatBaseAmountAccepted;
    }

    public BigDecimal getVatCalAmountAccepted() {
        return vatCalAmountAccepted;
    }

    public void setVatCalAmountAccepted(BigDecimal vatCalAmountAccepted) {
        this.vatCalAmountAccepted = vatCalAmountAccepted;
    }

    public BigDecimal getVatPercentageAccepted() {
        return vatPercentageAccepted;
    }

    public void setVatPercentageAccepted(BigDecimal vatPercentageAccepted) {
        this.vatPercentageAccepted = vatPercentageAccepted;
    }


}