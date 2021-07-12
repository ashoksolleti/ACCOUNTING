/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class PaymentDetailDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5325444757812384933L;

    /**
     * Attribute to hold <code>destCurrencyCode</code> property.
     */
    private String destCurrencyCode;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>originCurrencyCode</code> property.
     */
    private String originCurrencyCode;

    /**
     * Attribute to hold <code>origToDestCurrencyExchangeRate</code> property.
     */
    private BigDecimal origToDestCurrencyExchangeRate;

    /**
     * Attribute to hold <code>stationPayments</code> property.
     */
    private List<StationPaymentDto> stationPayments;

    /**
     * Gets the <code>destCurrencyCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>destCurrencyCode</code> property.
     */
    public String getDestCurrencyCode() {
        return this.destCurrencyCode;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>SpotRateId</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */

    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>originCurrencyCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>originCurrencyCode</code> property.
     */
    public String getOriginCurrencyCode() {
        return this.originCurrencyCode;
    }

    /**
     * Gets the <code>origToDestCurrencyExchangeRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>origToDestCurrencyExchangeRate</code> property.
     */
    public BigDecimal getOrigToDestCurrencyExchangeRate() {
        return this.origToDestCurrencyExchangeRate;
    }

    /**
     * Gets the <code>stationPayments</code> property.
     * <p>
     * 
     * @return the current value of the <code>stationPayments</code> property.
     */
    public List<StationPaymentDto> getStationPayments() {
        return this.stationPayments;
    }

    /**
     * Sets the <code>destCurrencyCode</code>.
     * <p>
     * 
     * @param pDestCurrencyCode
     *            holds the new value of <code>destCurrencyCode</code>
     */
    public void setDestCurrencyCode(final String pDestCurrencyCode) {
        this.destCurrencyCode = ContractUtility.convertToUpperCase(pDestCurrencyCode);
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
     * Sets the <code>originCurrencyCode</code>.
     * <p>
     * 
     * @param pOriginCurrencyCode
     *            holds the new value of <code>originCurrencyCode</code>
     */
    public void setOriginCurrencyCode(final String pOriginCurrencyCode) {
        this.originCurrencyCode = ContractUtility.convertToUpperCase(pOriginCurrencyCode);
    }

    /**
     * Sets the <code>origToDestCurrencyExchangeRate</code>.
     * <p>
     * 
     * @param pOrigToDestCurrencyExchangeRate
     *            holds the new value of <code>origToDestCurrencyExchangeRate</code>
     */
    public void setOrigToDestCurrencyExchangeRate(final BigDecimal pOrigToDestCurrencyExchangeRate) {
        this.origToDestCurrencyExchangeRate = pOrigToDestCurrencyExchangeRate;
    }

    /**
     * Sets the <code>stationPayments</code>.
     * <p>
     * 
     * @param pStationPayments
     *            holds the new value of <code>stationPayments</code>
     */
    public void setStationPayments(final List<StationPaymentDto> pStationPayments) {
        this.stationPayments = pStationPayments;
    }
}
