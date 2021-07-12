package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;
import java.util.Date;


public class OtherChargeValidationDto implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1513833280709801890L;

    private GeographicDataDto aggregateIdentifier1;

    private GeographicDataDto aggregateIdentifier2;

    private int validateFlag;

    private String participantAccountNumber;
    private String commodityCode;
    private String uldType;
    private Date startDate;
    private Date endDate;

    public GeographicDataDto getAggregateIdentifier1() {
        return aggregateIdentifier1;
    }

    public GeographicDataDto getAggregateIdentifier2() {
        return aggregateIdentifier2;
    }

    public String getParticipantAccountNumber() {
        return participantAccountNumber;
    }

    public int getValidateFlag() {
        return validateFlag;
    }

    public void setAggregateIdentifier1(GeographicDataDto aggregateIdentifier1) {
        this.aggregateIdentifier1 = aggregateIdentifier1;
    }

    public void setAggregateIdentifier2(GeographicDataDto aggregateIdentifier2) {
        this.aggregateIdentifier2 = aggregateIdentifier2;
    }

   public void setParticipantAccountNumber(String participantAccountNumber) {
    this.participantAccountNumber = participantAccountNumber;
}
   
   public void setValidateFlag(int validateFlag) {
    this.validateFlag = validateFlag;
}
/**
 * Gets the <code>commodityCode</code> property.
 * <p>
 * 
 * @return the current value of the <code>commodityCode</code> property.<br>
 */
public String getCommodityCode() {
	return this.commodityCode;
}

/**
     * Sets the <code>commodityCode</code> property.
     * <p>
     * 
     * @param pCommodityCode
     *            the current value of the <code>commodityCode</code> property.
     */
public void setCommodityCode(final String pCommodityCode) {
	this.commodityCode = pCommodityCode;
}

/**
 * Gets the <code>uldType</code> property.
 * <p>
 * 
 * @return the current value of the <code>uldType</code> property.<br>
 */
public String getUldType() {
	return this.uldType;
}

/**
     * Sets the <code>uldType</code> property.
     * <p>
     * 
     * @param pUldType
     *            the current value of the <code>uldType</code> property.
     */
public void setUldType(final String pUldType) {
	this.uldType = pUldType;
}

/**
 * Gets the <code>startDate</code> property.
 * <p>
 * 
 * @return the current value of the <code>startDate</code> property.<br>
 */
public Date getStartDate() {
	return this.startDate;
}

/**
 * Gets the <code>endDate</code> property.
 * <p>
 * 
 * @return the current value of the <code>endDate</code> property.<br>
 */
public Date getEndDate() {
	return this.endDate;
}

/**
     * Sets the <code>startDate</code> property.
     * <p>
     * 
     * @param pStartDate
     *            the current value of the <code>startDate</code> property.
     */
public void setStartDate(final Date pStartDate) {
	this.startDate = pStartDate;
}

/**
     * Sets the <code>endDate</code> property.
     * <p>
     * 
     * @param pEndDate
     *            the current value of the <code>endDate</code> property.
     */
public void setEndDate(final Date pEndDate) {
	this.endDate = pEndDate;
}
}
