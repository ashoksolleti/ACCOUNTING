/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ProrationType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.TransactionSubType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.TransactionType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AirWaybillRevenueDto</code> contains the details of HostRevenueDto.
 * <p>
 * This contains all information about AirWaybillRevenueDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>accountingAirWaybill
 * <li>airWaybillEventGrossRevenue
 * <li>airWaybillEventHostRevenue
 * <li>airWaybillEventTotalRate
 * <li>airwaybillGrossRevenueAmount
 * <li>airwaybillHostRevenueAmount
 * <li>airwaybillNetAmount
 * <li>airwaybillOutstandingAmount
 * <li>awbTotalOALRevenueAmount
 * <li>hostNetYield
 * <li>hostNetRevenue
 * <li>oId
 * <li>totalAirWaybillMileage
 * <li>totalGrossWeight
 * <li>totalHostMileage
 * <li>totalOALMileage
 * <li>transactionSubType
 * <li>transactionType
 * </ul>
 */
public class AirWaybillRevenueDto extends PersistenceObjectDto {

	/**
     * Unique Serial Version
	 */
	private static final long serialVersionUID = -9049219432458556506L;

	   /**
     * Attribute to hold <code>accountingAirWaybill</code> property.
     */
    private AccountingAirWaybillDto accountingAirWaybillDto;

    /**
     * Attribute to hold <code>airWaybillEventGrossRevenue</code> property.
     */
    private BigDecimal airWaybillEventGrossRevenue;

    /**
     * Attribute to hold <code>airWaybillEventHostRevenue</code> property.
     */
    private BigDecimal airWaybillEventHostRevenue;

    /**
     * Attribute to hold <code>airWaybillEventTotalRate</code> property.
     */
    private BigDecimal airWaybillEventTotalRate;

    /**
     * Attribute to hold <code>airwaybillGrossRevenueAmount</code> property.
     */
    private BigDecimal airwaybillGrossRevenueAmount;

    /**
     * Attribute to hold <code>airwaybillHostRevenueAmount</code> property.
     */
    private BigDecimal airwaybillHostRevenueAmount;

    /**
     * Attribute to hold <code>airwaybillNetAmount</code> property.
     */
    private BigDecimal airwaybillNetAmount;

    /**
     * Attribute to hold <code>airwaybillOutstandingAmount</code> property.
     */
    private BigDecimal airwaybillOutstandingAmount;

    /**
     * Attribute to hold <code>airwaybillTotalOALRevenueAmount</code> property.
     */
    private BigDecimal awbTotalOALRevenueAmount;

     /**
     * Attribute to hold <code>interlineAgreementsEntries</code> property.
     */
    private List<OnlineProrationDetailDto> onlineProrationDetailsDto;

    /**
     * Attribute to hold <code>hostNetRevenue</code> property.
     */
    private BigDecimal hostNetRevenue;

    /**
     * Attribute to hold <code>hostNetYield</code> property.
     */
    private BigDecimal hostNetYield;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>totalAirWaybillMileage</code> property.
     */
    private BigDecimal totalAirWaybillMileage;

    /**
     * Attribute to hold <code>totalGrossWeight</code> property.
     */
    private BigDecimal totalGrossWeight;

    /**
     * Attribute to hold <code>totalHostMileage</code> property.
     */
    private BigDecimal totalHostMileage;

    /**
     * Attribute to hold <code>totalOALMileage</code> property.
     */
    private BigDecimal totalOALMileage;

    /**
     * Attribute to hold <code>transactionSubType</code> property.
     */
    private TransactionSubType transactionSubType;

    /**
     * Attribute to hold <code>transactionType</code> property.
     */
    private TransactionType transactionType;

    /**
     * Attribute to hold <code>prorationReasonCodeType</code> property.
     */
    private ProrationType airWaybillEventProrationReasonCode;

    /**
     * Attribute to hold <code>awbEventWeightCharge</code> property.
     */
    private BigDecimal awbEventWeightCharge;
    
    /**
     * Attribute to hold <code>awbEventProrationCurrencyWeightCharge</code> property.
     */
    private BigDecimal awbEventProrationCurrencyWeightCharge;

    /**
     * Attribute to hold <code>awbEventWeightCharge</code> property.
     */
    private String awbEventCurrency;

    /**
     * Attribute to hold <code>awbEventWeightCharge</code> property.
     */
    private WeightUOMType awbEventWeightUnit;

    /**
     * Attribute to hold <code>awbEventHostPercent</code> property.
     */
    private BigDecimal awbEventHostPercent;

    /**
     * Attribute to hold <code>awbEventOALRevenue</code> property.
     */
    private BigDecimal awbEventOALRevenue;

    /**
     * Attribute to hold <code>awbEventTotalCosts</code> property.
     */
    private BigDecimal awbEventTotalCosts;

    /**
     * Attribute to hold <code>awbEventHostNetRevenue</code> property.
     */
    private BigDecimal awbEventHostNetRevenue;

    /**
     * Attribute to hold <code>awbEventHostNetYield</code> property.
     */
    private BigDecimal awbEventHostNetYield;

    /**
     * Attribute to hold <code>awbEventTotalAirwayBillMilleage</code> property.
     */
    private BigDecimal awbEventTotalAirwayBillMilleage;

    /**
     * Attribute to hold <code>awbEventTotalHostMilleage</code> property.
     */
    private BigDecimal awbEventTotalHostMilleage;
    
    private List<ProrationSegmentDto> interlineProrationSegments;

    private List<ProrationSegmentDto> onlineProrationSegments;
    
    private BigDecimal awbTotalEventSegChargebleWeightPercent;
    
    private String specificAirline;
    
    private boolean triggerFromGLScreen;
    
    public boolean isTriggerFromGLScreen() {
		return triggerFromGLScreen;
	}

	public void setTriggerFromGLScreen(boolean triggerFromGLScreen) {
		this.triggerFromGLScreen = triggerFromGLScreen;
	}

	/**
     * Gets the <code>awbTotalEventSegChargebleWeightPercent</code> property.
     * 
     * @return the current value of the <code>awbTotalEventSegChargebleWeightPercent</code> property.<br>
     */
    
    public BigDecimal getAwbTotalEventSegChargebleWeightPercent() {
        return this.awbTotalEventSegChargebleWeightPercent;
    }

    /**
     * Sets the <code>awbTotalEventSegChargebleWeightPercent</code> property.
     * <p>
     * 
     * @param pAwbTotalEventSegChargebleWeightPercent
     *            the new value of the <code>awbTotalEventSegChargebleWeightPercent</code> property.
     */
    
    public void setAwbTotalEventSegChargebleWeightPercent(
                BigDecimal pAwbTotalEventSegChargebleWeightPercent) {
        this.awbTotalEventSegChargebleWeightPercent = pAwbTotalEventSegChargebleWeightPercent;
    }
    
    /**
     * Gets the <code>airWaybillEventGrossRevenue</code> property.
     * 
     * @return the current value of the <code>airWaybillEventGrossRevenue</code> property.<br>
     */
    public BigDecimal getAirWaybillEventGrossRevenue() {
        return this.airWaybillEventGrossRevenue;
    }

    /**
     * Gets the <code>airWaybillEventHostRevenue</code> property.
     * 
     * @return the current value of the <code>airWaybillEventHostRevenue</code> property.<br>
     */
    public BigDecimal getAirWaybillEventHostRevenue() {
        return this.airWaybillEventHostRevenue;
    }

    /**
     * Gets the <code>airWaybillEventTotalRate</code> property.
     * 
     * @return the current value of the <code>airWaybillEventTotalRate</code> property.<br>
     */
    public BigDecimal getAirWaybillEventTotalRate() {
        return this.airWaybillEventTotalRate;
    }

    /**
     * Gets the <code>airwaybillGrossRevenueAmount</code> property.
     * 
     * @return the current value of the <code>airwaybillGrossRevenueAmount</code> property.<br>
     */
    public BigDecimal getAirwaybillGrossRevenueAmount() {
        return this.airwaybillGrossRevenueAmount;
    }

    /**
     * Gets the <code>airwaybillHostRevenueAmount</code> property.
     * 
     * @return the current value of the <code>airwaybillHostRevenueAmount</code> property.<br>
     */
    public BigDecimal getAirwaybillHostRevenueAmount() {
        return this.airwaybillHostRevenueAmount;
    }

    /**
     * Gets the <code>airwaybillNetAmount</code> property.
     * 
     * @return the current value of the <code>airwaybillNetAmount</code> property.<br>
     */
    public BigDecimal getAirwaybillNetAmount() {
        return this.airwaybillNetAmount;
    }

    /**
     * Gets the <code>airwaybillOutstandingAmount</code> property.
     * 
     * @return the current value of the <code>airwaybillOutstandingAmount</code> property.<br>
     */
    public BigDecimal getAirwaybillOutstandingAmount() {
        return this.airwaybillOutstandingAmount;
    }

    /**
     * Gets the <code>airwaybillTotalOALRevenueAmount</code> property.
     * 
     * @return the current value of the <code>airwaybillTotalOALRevenueAmount</code> property.<br>
     */
    public BigDecimal getAwbTotalOALRevenueAmount() {
        return this.awbTotalOALRevenueAmount;
    }

    /**
     * Gets the <code>onlineProrationDetail</code> property.
     * 
     * @return the current value of the <code>onlineProrationDetail</code> property.<br>
     */
    public List<OnlineProrationDetailDto> getOnlineProrationDetailsDto() {
        return this.onlineProrationDetailsDto;
    }

    /**
     * Gets the <code>hostNetRevenue</code> property.
     * 
     * @return the current value of the <code>hostNetRevenue</code> property.<br>
     */
    public BigDecimal getHostNetRevenue() {
        return this.hostNetRevenue;
    }

    /**
     * Gets the <code>hostNetYield</code> property.
     * 
     * @return the current value of the <code>hostNetYield</code> property.<br>
     */
    public BigDecimal getHostNetYield() {
        return this.hostNetYield;
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
     * Gets the <code>totalAirWaybillMileage</code> property.
     * 
     * @return the current value of the <code>totalAirWaybillMileage</code> property.<br>
     */
    public BigDecimal getTotalAirWaybillMileage() {
        return this.totalAirWaybillMileage;
    }

    /**
     * Gets the <code>totalGrossWeight</code> property.
     * 
     * @return the current value of the <code>totalGrossWeight</code> property.<br>
     */

    public BigDecimal getTotalGrossWeight() {
        return this.totalGrossWeight;
    }

    /**
     * Gets the <code>totalHostMileage</code> property.
     * 
     * @return the current value of the <code>totalHostMileage</code> property.<br>
     */

    public BigDecimal getTotalHostMileage() {
        return this.totalHostMileage;
    }

    /**
     * Gets the <code>totalOALMileage</code> property.
     * 
     * @return the current value of the <code>totalOALMileage</code> property.<br>
     */

    public BigDecimal getTotalOALMileage() {
        return this.totalOALMileage;
    }

    /**
     * Gets the <code>transactionSubType</code> property.
     * 
     * @return the current value of the <code>transactionSubType</code> property.<br>
     */
    public TransactionSubType getTransactionSubType() {
        return this.transactionSubType;
    }

    /**
     * Gets the <code>transactionType</code> property.
     * 
     * @return the current value of the <code>transactionType</code> property.<br>
     */
    public TransactionType getTransactionType() {
        return this.transactionType;
    }

    /**
     * Sets the <code>airWaybillEventGrossRevenue</code> property.
     * <p>
     * 
     * @param pAirWaybillEventGrossRevenue
     *            the new value of the <code>airWaybillEventGrossRevenue</code> property.
     */
    public void setAirWaybillEventGrossRevenue(final BigDecimal pAirWaybillEventGrossRevenue) {
        this.airWaybillEventGrossRevenue = pAirWaybillEventGrossRevenue;
    }

    /**
     * Sets the <code>airWaybillEventHostRevenue</code> property.
     * <p>
     * 
     * @param pAirWaybillEventHostRevenue
     *            the new value of the <code>airWaybillEventHostRevenue</code> property.
     */
    public void setAirWaybillEventHostRevenue(final BigDecimal pAirWaybillEventHostRevenue) {
        this.airWaybillEventHostRevenue = pAirWaybillEventHostRevenue;
    }

    /**
     * Sets the <code>airWaybillEventTotalRate</code> property.
     * <p>
     * 
     * @param pAirWaybillEventTotalRate
     *            the new value of the <code>airWaybillEventTotalRate</code> property.
     */
    public void setAirWaybillEventTotalRate(final BigDecimal pAirWaybillEventTotalRate) {
        this.airWaybillEventTotalRate = pAirWaybillEventTotalRate;
    }

    /**
     * Sets the <code>airwaybillGrossRevenueAmount</code> property.
     * <p>
     * 
     * @param pAirwaybillGrossRevenueAmount
     *            the new value of the <code>airwaybillGrossRevenueAmount</code> property.
     */
    public void setAirwaybillGrossRevenueAmount(final BigDecimal pAirwaybillGrossRevenueAmount) {
        this.airwaybillGrossRevenueAmount = pAirwaybillGrossRevenueAmount;
    }

    /**
     * Sets the <code>airwaybillHostRevenueAmount</code> property.
     * <p>
     * 
     * @param pAirwaybillHostRevenueAmount
     *            the new value of the <code>airwaybillHostRevenueAmount</code> property.
     */
    public void setAirwaybillHostRevenueAmount(final BigDecimal pAirwaybillHostRevenueAmount) {
        this.airwaybillHostRevenueAmount = pAirwaybillHostRevenueAmount;
    }

    /**
     * Sets the <code>airwaybillNetAmount</code> property.
     * <p>
     * 
     * @param pAirwaybillNetAmount
     *            the new value of the <code>airwaybillNetAmount</code> property.
     */
    public void setAirwaybillNetAmount(final BigDecimal pAirwaybillNetAmount) {
        this.airwaybillNetAmount = pAirwaybillNetAmount;
    }

    /**
     * Sets the <code>airwaybillOutstandingAmount</code> property.
     * <p>
     * 
     * @param pAirwaybillOutstandingAmount
     *            the new value of the <code>airwaybillOutstandingAmount</code> property.
     */
    public void setAirwaybillOutstandingAmount(final BigDecimal pAirwaybillOutstandingAmount) {
        this.airwaybillOutstandingAmount = pAirwaybillOutstandingAmount;
    }

    /**
     * Sets the <code>awbTotalOALRevenueAmount</code> property.
     * <p>
     * 
     * @param pAwbTotalOALRevenueAmount
     *            the new value of the <code>awbTotalOALRevenueAmount</code> property.
     */
    public void setAwbTotalOALRevenueAmount(final BigDecimal pAwbTotalOALRevenueAmount) {
        this.awbTotalOALRevenueAmount = pAwbTotalOALRevenueAmount;
    }

    /**
     * Sets the <code>onlineProrationDetails</code> property.
     * <p>
     * 
     * @param pOnlineProrationDetails
     *            the new value of the <code>onlineProrationDetails</code> property.
     */
    public void setOnlineProrationDetailsDto(final List<OnlineProrationDetailDto> pOnlineProrationDetailsDto) {
        this.onlineProrationDetailsDto = pOnlineProrationDetailsDto;
    }

    /**
     * Sets the <code>hostNetRevenue</code> property.
     * <p>
     * 
     * @param pHostNetRevenue
     *            the new value of the <code>hostNetRevenue</code> property.
     */
    public void setHostNetRevenue(final BigDecimal pHostNetRevenue) {
        this.hostNetRevenue = pHostNetRevenue;
    }

    /**
     * Sets the <code>hostNetYield</code> property.
     * <p>
     * 
     * @param pHostNetYield
     *            the new value of the <code>hostNetYield</code> property.
     */
    public void setHostNetYield(final BigDecimal pHostNetYield) {
        this.hostNetYield = pHostNetYield;
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
     * Sets the <code>totalAirWaybillMileage</code> property.
     * <p>
     * 
     * @param pTotalAirWaybillMileage
     *            the new value of the <code>totalAirWaybillMileage</code> property.
     */
    public void setTotalAirWaybillMileage(final BigDecimal pTotalAirWaybillMileage) {
        this.totalAirWaybillMileage = pTotalAirWaybillMileage;
    }

    /**
     * Sets the <code>totalGrossWeight</code> property.
     * <p>
     * 
     * @param pTotalGrossWeight
     *            the new value of the <code>totalGrossWeight</code> property.
     */
    public void setTotalGrossWeight(final BigDecimal pTotalGrossWeight) {
        this.totalGrossWeight = pTotalGrossWeight;
    }

    /**
     * Sets the <code>totalHostMileage</code> property.
     * <p>
     * 
     * @param pTotalHostMileage
     *            the new value of the <code>totalHostMileage</code> property.
     */
    public void setTotalHostMileage(final BigDecimal pTotalHostMileage) {
        this.totalHostMileage = pTotalHostMileage;
    }

    /**
     * Sets the <code>totalOALMileage</code> property.
     * <p>
     * 
     * @param pTotalOALMileage
     *            the new value of the <code>totalOALMileage</code> property.
     */
    public void setTotalOALMileage(final BigDecimal pTotalOALMileage) {
        this.totalOALMileage = pTotalOALMileage;
    }

    /**
     * Sets the <code>transactionSubType</code> property.
     * <p>
     * 
     * @param pTransactionSubType
     *            the new value of the <code>transactionSubType</code> property.
     */
    public void setTransactionSubType(final TransactionSubType pTransactionSubType) {
        this.transactionSubType = pTransactionSubType;
    }

    /**
     * Sets the <code>transactionType</code> property.
     * <p>
     * 
     * @param pTransactionType
     *            the new value of the <code>transactionType</code> property.
     */
    public void setTransactionType(final TransactionType pTransactionType) {
        this.transactionType = pTransactionType;
    }

    /**
     * @return the accountingAirWaybill
     */
    public AccountingAirWaybillDto getAccountingAirWaybillDto() {
        return this.accountingAirWaybillDto;
    }

    /**
     * @param pAccountingAirWaybillDto the accountingAirWaybillDto to set
     */
    public void setAccountingAirWaybillDto(final AccountingAirWaybillDto pAccountingAirWaybillDto) {
        this.accountingAirWaybillDto = pAccountingAirWaybillDto;
    }

    /**
     * Gets the <code>prorationReasonCodeType</code> property.
     * 
     * @return the current value of the <code>prorationReasonCodeType</code> property.<br>
     */
    public ProrationType getAirWaybillEventProrationReasonCode() {
        return this.airWaybillEventProrationReasonCode;
    }

    /**
     * Sets the <code>prorationReasonCodeType</code> property.
     * <p>
     * 
     * @param pAirWaybillEventProrationReasonCode
     *            the new value of the <code>prorationReasonCodeType</code> property.
     */

	public void setAirWaybillEventProrationReasonCode(
			final ProrationType pAirWaybillEventProrationReasonCode) {
		this.airWaybillEventProrationReasonCode = pAirWaybillEventProrationReasonCode;
	}

    public BigDecimal getAwbEventWeightCharge() {
        return awbEventWeightCharge;
    }

    public void setAwbEventWeightCharge(BigDecimal awbEventWeightCharge) {
        this.awbEventWeightCharge = awbEventWeightCharge;
    }

    public String getAwbEventCurrency() {
        return awbEventCurrency;
    }

    public void setAwbEventCurrency(String awbEventCurrency) {
        this.awbEventCurrency =ContractUtility.convertToUpperCase(awbEventCurrency);
    }

    public WeightUOMType getAwbEventWeightUnit() {
        return awbEventWeightUnit;
    }

    public void setAwbEventWeightUnit(WeightUOMType awbEventWeightUnit) {
        this.awbEventWeightUnit = awbEventWeightUnit;
    }

    public BigDecimal getAwbEventHostPercent() {
        return awbEventHostPercent;
    }

    public void setAwbEventHostPercent(BigDecimal awbEventHostPercent) {
        this.awbEventHostPercent = awbEventHostPercent;
    }

    public BigDecimal getAwbEventOALRevenue() {
        return awbEventOALRevenue;
    }

    public void setAwbEventOALRevenue(BigDecimal awbEventOALRevenue) {
        this.awbEventOALRevenue = awbEventOALRevenue;
    }

    public BigDecimal getAwbEventTotalCosts() {
        return awbEventTotalCosts;
    }

    public void setAwbEventTotalCosts(BigDecimal awbEventTotalCosts) {
        this.awbEventTotalCosts = awbEventTotalCosts;
    }

    public BigDecimal getAwbEventHostNetRevenue() {
        return awbEventHostNetRevenue;
    }

    public void setAwbEventHostNetRevenue(BigDecimal awbEventHostNetRevenue) {
        this.awbEventHostNetRevenue = awbEventHostNetRevenue;
    }

    public BigDecimal getAwbEventHostNetYield() {
        return awbEventHostNetYield;
    }

    public void setAwbEventHostNetYield(BigDecimal awbEventHostNetYield) {
        this.awbEventHostNetYield = awbEventHostNetYield;
    }

    public BigDecimal getAwbEventTotalAirwayBillMilleage() {
        return awbEventTotalAirwayBillMilleage;
    }

    public void setAwbEventTotalAirwayBillMilleage(BigDecimal awbEventTotalAirwayBillMilleage) {
        this.awbEventTotalAirwayBillMilleage = awbEventTotalAirwayBillMilleage;
    }

    public BigDecimal getAwbEventTotalHostMilleage() {
        return awbEventTotalHostMilleage;
    }

    public void setAwbEventTotalHostMilleage(BigDecimal awbEventTotalHostMilleage) {
        this.awbEventTotalHostMilleage = awbEventTotalHostMilleage;
    }

    public List<ProrationSegmentDto> getInterlineProrationSegments() {
        return interlineProrationSegments;
    }

    public void setInterlineProrationSegments(List<ProrationSegmentDto> interlineProrationSegments) {
        this.interlineProrationSegments = interlineProrationSegments;
    }

    public List<ProrationSegmentDto> getOnlineProrationSegments() {
        return onlineProrationSegments;
    }

    public void setOnlineProrationSegments(List<ProrationSegmentDto> onlineProrationSegments) {
        this.onlineProrationSegments = onlineProrationSegments;
    }
    
    private BigDecimal airWaybillEventProrationGrossRevenue;
    
    private BigDecimal airWaybillEventProrationTotalRate;
    
    public BigDecimal getAirWaybillEventProrationGrossRevenue() {
        return this.airWaybillEventProrationGrossRevenue;
    }

    public void setAirWaybillEventProrationGrossRevenue(final BigDecimal pAirWaybillEventProrationGrossRevenue) {
        this.airWaybillEventProrationGrossRevenue = pAirWaybillEventProrationGrossRevenue;
    }

    public BigDecimal getAirWaybillEventProrationTotalRate() {
        return airWaybillEventProrationTotalRate;
    }

    public void setAirWaybillEventProrationTotalRate(BigDecimal airWaybillEventProrationTotalRate) {
        this.airWaybillEventProrationTotalRate = airWaybillEventProrationTotalRate;
    }
    
    private BigDecimal awbEventProrationHostRevenue;
    
    public BigDecimal getAwbEventProrationHostRevenue() {
        return awbEventProrationHostRevenue;
    }

    public void setAwbEventProrationHostRevenue(BigDecimal awbEventProrationHostRevenue) {
        this.awbEventProrationHostRevenue = awbEventProrationHostRevenue;
    }
    
    private BigDecimal airwaybillProrationNetAmount;
    
    public BigDecimal getAirwaybillProrationNetAmount() {
        return airwaybillProrationNetAmount;
    }

    public void setAirwaybillProrationNetAmount(BigDecimal airwaybillProrationNetAmount) {
        this.airwaybillProrationNetAmount = airwaybillProrationNetAmount;
    }
    
    private BigDecimal hostNetProrationYield;
    
    public BigDecimal getHostNetProrationYield() {
        return hostNetProrationYield;
    }

    public void setHostNetProrationYield(BigDecimal hostNetProrationYield) {
        this.hostNetProrationYield = hostNetProrationYield;
    }
    
    private BigDecimal awbTotalOALRevenueProrationCurrencyAmount;
    
    public BigDecimal getAwbTotalOALRevenueProrationCurrencyAmount() {
        return awbTotalOALRevenueProrationCurrencyAmount;
    }

    public
                void
                setAwbTotalOALRevenueProrationCurrencyAmount(BigDecimal awbTotalOALRevenueProrationCurrencyAmount) {
        this.awbTotalOALRevenueProrationCurrencyAmount = awbTotalOALRevenueProrationCurrencyAmount;
    }

    public BigDecimal getAwbEventProrationCurrencyWeightCharge() {
        return awbEventProrationCurrencyWeightCharge;
    }

    public void setAwbEventProrationCurrencyWeightCharge(BigDecimal awbEventProrationCurrencyWeightCharge) {
        this.awbEventProrationCurrencyWeightCharge = awbEventProrationCurrencyWeightCharge;
    }

	public String getSpecificAirline() {
		return specificAirline;
	}

	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}
}
    