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
/**
 * <code>OtherChargeDto</code> class contain information specific to OtherChargeDto.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>oId
 * <li>otherChargeEntries
 * <li>totalCollectDueAgent
 * <li>totalCollectDueCarrier
 * <li>totalPrepaidDueAgent
 * <li>totalPrepaidDueCarrier
 * </code>
 * </ul>
 */
public class OtherChargeDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1803766843032431825L;

    /**
     * Attribute to hold <code>totalCollectDueAgent</code> property.
     */
    private BigDecimal totalCollectDueAgent;

    /**
     * Attribute to hold <code>totalCollectDueCarrier</code> property.
     */
    private BigDecimal totalCollectDueCarrier;

    /**
     * Attribute to hold <code>totalPrepaidDueAgent</code> property.
     */
    private BigDecimal totalPrepaidDueAgent;

    /**
     * Attribute to hold <code>totalPrepaidDueCarrier</code> property.
     */
    private BigDecimal totalPrepaidDueCarrier;

    /**
     * Attribute to hold <code>amount</code> property.
     */
    private BigDecimal amount;

    /**
     * Attribute to hold <code>chargeCode</code> property.
     */
    private String chargeCode;

    /**
     * Attribute to hold <code>subCode</code> property.
     */
    private String subCode;

    /**
     * Attribute to hold <code>otherChargeTime</code> property.
     */
    private Integer otherChargeTime;

    /**
     * Attribute to hold <code>revenueIndicator</code> property.
     */
    private Boolean revenueIndicator;

    /**
     * Attribute to hold <code>chargeLineNumber</code> property.
     */
    private Integer chargeLineNumber;


    /**
     * Gets the <code>totalCollectDueAgent</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalCollectDueAgent</code> property.
     */
    public BigDecimal getTotalCollectDueAgent() {
        return this.totalCollectDueAgent;
    }

    /**
     * Gets the <code>totalCollectDueCarrier</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalCollectDueCarrier</code> property.
     */
    public BigDecimal getTotalCollectDueCarrier() {
        return this.totalCollectDueCarrier;
    }

    /**
     * Gets the <code>totalPrepaidDueAgent</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalPrepaidDueAgent</code> property.
     */
    public BigDecimal getTotalPrepaidDueAgent() {
        return this.totalPrepaidDueAgent;
    }

    /**
     * Gets the <code>totalPrepaidDueCarrier</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalPrepaidDueCarrier</code> property.
     */
    public BigDecimal getTotalPrepaidDueCarrier() {
        return this.totalPrepaidDueCarrier;
    }

    /**
     * Sets the <code>totalCollectDueAgent</code>.
     * <p>
     * 
     * @param pTotalCollectDueAgent
     *            holds the new value of <code>totalCollectDueAgent</code>
     */
    public void setTotalCollectDueAgent(final BigDecimal pTotalCollectDueAgent) {
        this.totalCollectDueAgent = pTotalCollectDueAgent;
    }

    /**
     * Sets the <code>totalCollectDueCarrier</code>.
     * <p>
     * 
     * @param pTotalCollectDueCarrier
     *            holds the new value of <code>totalCollectDueCarrier</code>
     */
    public void setTotalCollectDueCarrier(final BigDecimal pTotalCollectDueCarrier) {
        this.totalCollectDueCarrier = pTotalCollectDueCarrier;
    }

    /**
     * Sets the <code>totalPrepaidDueAgent</code>.
     * <p>
     * 
     * @param pTotalPrepaidDueAgent
     *            holds the new value of <code>totalPrepaidDueAgent</code>
     */
    public void setTotalPrepaidDueAgent(final BigDecimal pTotalPrepaidDueAgent) {
        this.totalPrepaidDueAgent = pTotalPrepaidDueAgent;
    }

    /**
     * Sets the <code>totalPrepaidDueCarrier</code>.
     * <p>
     * 
     * @param pTotalPrepaidDueCarrier
     *            holds the new value of <code>totalPrepaidDueCarrier</code>
     */
    public void setTotalPrepaidDueCarrier(final BigDecimal pTotalPrepaidDueCarrier) {
        this.totalPrepaidDueCarrier = pTotalPrepaidDueCarrier;
    }

    public Boolean getRevenueIndicator() {
		return revenueIndicator;
	}

	public void setRevenueIndicator(Boolean revenueIndicator) {
		this.revenueIndicator = revenueIndicator;
	}

	public Integer getOtherChargeTime() {
        return otherChargeTime;
    }

    public void setOtherChargeTime(Integer otherChargeTime) {
        this.otherChargeTime = otherChargeTime;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(final String pSubCode) {
        this.subCode = ContractUtility.convertToUpperCase(pSubCode);
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(final String pChargeCode) {
        this.chargeCode = ContractUtility.convertToUpperCase(pChargeCode);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getChargeLineNumber() {
        return chargeLineNumber;
    }

    public void setChargeLineNumber(Integer chargeLineNumber) {
        this.chargeLineNumber = chargeLineNumber;
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        if(this.getTotalPrepaidDueAgent()!=null){
            strBuilder.append(this.getTotalPrepaidDueAgent());
            strBuilder.append(" ");
        }
       if(this.getTotalPrepaidDueCarrier()!=null){
           strBuilder.append(this.getTotalPrepaidDueCarrier());
           strBuilder.append(" "); 
       }
      if(this.getTotalCollectDueAgent()!=null){
        strBuilder.append(this.getTotalCollectDueAgent());
        strBuilder.append(" ");
      }
      if(this.getTotalCollectDueCarrier()!=null){
          strBuilder.append(this.getTotalCollectDueCarrier());
          strBuilder.append(" ");  
      }
       
      
        return strBuilder.toString();
    }
}
