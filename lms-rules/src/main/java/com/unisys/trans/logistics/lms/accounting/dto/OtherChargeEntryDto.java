/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.CreditType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.DueType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.GenIdType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PayCodeType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;

public class OtherChargeEntryDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -747306863157445533L;

    /**
     * Attribute to hold <code>amount</code> property.
     */
    private BigDecimal amount;

    /**
     * Attribute to hold <code>chargeCode</code> property.
     */
    private String chargeCode;

    /**
     * Attribute to hold <code>creditType</code> property.
     */
    private CreditType creditType;

    /**
     * Attribute to hold <code>date</code> property.
     */
    private Date date;

    /**
     * Attribute to hold <code>deleteIndicator</code> property.
     */
    private boolean deleteIndicator;

    /**
     * Attribute to hold <code>description</code> property.
     */
    private String description;

    /**
     * Attribute to hold <code>dueType</code> property.
     */
    private DueType dueType;

    /**
     * Attribute to hold <code>genIDType</code> property.
     */
    private GenIdType genIDType;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>payCode</code> property.
     */
    private PayCodeType payCode;

    /**
     * Attribute to hold <code>quantity</code> property.
     */
    private Integer quantity;

    /**
     * Attribute to hold <code>serviceIndicator</code> property.
     */
    private String serviceIndicator;

    /**
     * Attribute to hold <code>subCode</code> property.
     */
    private String subCode;

    /**
     * Attribute to hold <code>timeIndicator</code> property.
     */
    private String timeIndicator;
    

    /**
     * Attribute to hold <code>time</code> property.
     */
    private String time;
    
    /**
     * Attribute to hold <code>taxIndicator</code> property.
     */
    private Boolean taxIndicator;



    public Boolean getTaxIndicator() {
		return taxIndicator;
	}

	public void setTaxIndicator(Boolean taxIndicator) {
		this.taxIndicator = taxIndicator;
	}

	public String getTime() {
        return time;
    }

    public void setTime(final String pTime) {
        this.time = pTime;
    }

    /**
     * Gets the <code>amount</code> property.
     * <p>
     * 
     * @return the current value of the <code>amount</code> property.
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Gets the <code>chargeCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>chargeCode</code> property.
     */
    public String getChargeCode() {
        return this.chargeCode;
    }

    /**
     * Gets the <code>creditType</code> property.
     * <p>
     * 
     * @return the current value of the <code>creditType</code> property.
     */
    public CreditType getCreditType() {
        return this.creditType;
    }

    /**
     * Gets the <code>date</code> property.
     * <p>
     * 
     * @return the current value of the <code>date</code> property.
     */
    public Date getDate() {
        return ContractUtility.getClonedDate(this.date);
    }

    /**
     * Gets the <code>deleteIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>deleteIndicator</code> property.
     */
    public boolean getDeleteIndicator() {
        return this.deleteIndicator;
    }

    /**
     * Gets the <code>description</code> property.
     * <p>
     * 
     * @return the current value of the <code>description</code> property.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>dueType</code> property.
     * <p>
     * 
     * @return the current value of the <code>dueType</code> property.
     */
    public DueType getDueType() {
        return this.dueType;
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
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */

    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>payCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>payCode</code> property.
     */
    public PayCodeType getPayCode() {
        return this.payCode;
    }

    /**
     * Gets the <code>quantity</code> property.
     * <p>
     * 
     * @return the current value of the <code>quantity</code> property.
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * Gets the <code>serviceIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>serviceIndicator</code> property.
     */
    public String getServiceIndicator() {
        return this.serviceIndicator;
    }

    /**
     * Gets the <code>subCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>subCode</code> property.
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * Gets the <code>timeIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>timeIndicator</code> property.
     */
    public String getTimeIndicator() {
        return this.timeIndicator;
    }

    /**
     * Sets the <code>amount</code>.
     * <p>
     * 
     * @param pAmount
     *            holds the new value of <code>amount</code>
     */
    public void setAmount(final BigDecimal pAmount) {
        this.amount = pAmount;
    }

    /**
     * Sets the <code>chargeCode</code>.
     * <p>
     * 
     * @param pChargeCode
     *            holds the new value of <code>chargeCode</code>
     */
    public void setChargeCode(final String pChargeCode) {
        this.chargeCode = ContractUtility.convertToUpperCase(pChargeCode);
    }

    /**
     * Sets the <code>creditType</code>.
     * <p>
     * 
     * @param pCreditType
     *            holds the new value of <code>creditType</code>
     */
    public void setCreditType(final CreditType pCreditType) {
        this.creditType = pCreditType;
    }

    /**
     * Sets the <code>date</code>.
     * <p>
     * 
     * @param pDate
     *            holds the new value of <code>date</code>
     */
    public void setDate(final Date pDate) {
        this.date = ContractUtility.getClonedDate(pDate);
    }

    /**
     * Sets the <code>deleteIndicator</code>.
     * <p>
     * 
     * @param pDeleteIndicator
     *            holds the new value of <code>deleteIndicator</code>
     */
    public void setDeleteIndicator(final boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the <code>description</code>.
     * <p>
     * 
     * @param pDescription
     *            holds the new value of <code>description</code>
     */
    public void setDescription(final String pDescription) {
        this.description = ContractUtility.convertToUpperCase(pDescription);
    }

    /**
     * Sets the <code>dueType</code>.
     * <p>
     * 
     * @param pDueType
     *            holds the new value of <code>dueType</code>
     */
    public void setDueType(final DueType pDueType) {
        this.dueType = pDueType;
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
     * Sets the <code>oId</code> property.
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>payCode</code>.
     * <p>
     * 
     * @param pPayCode
     *            holds the new value of <code>payCode</code>
     */

    public void setPayCode(final PayCodeType pPayCode) {
        this.payCode = pPayCode;
    }

    /**
     * Sets the <code>quantity</code>.
     * <p>
     * 
     * @param pQuantity
     *            holds the new value of <code>quantity</code>
     */
    public void setQuantity(final Integer pQuantity) {
        this.quantity = pQuantity;
    }

    /**
     * Sets the <code>serviceIndicator</code>.
     * <p>
     * 
     * @param pServiceIndicator
     *            holds the new value of <code>serviceIndicator</code>
     */
    public void setServiceIndicator(final String pServiceIndicator) {
        this.serviceIndicator = ContractUtility.convertToUpperCase(pServiceIndicator);
    }

    /**
     * Sets the <code>subCode</code>.
     * <p>
     * 
     * @param pSubCode
     *            holds the new value of <code>subCode</code>
     */
    public void setSubCode(final String pSubCode) {
        this.subCode = ContractUtility.convertToUpperCase(pSubCode);
    }

    /**
     * Sets the <code>timeIndicator</code>.
     * <p>
     * 
     * @param pTimeIndicator
     *            holds the new value of <code>timeIndicator</code>
     */
    public void setTimeIndicator(final String pTimeIndicator) {
        this.timeIndicator = ContractUtility.convertToUpperCase(pTimeIndicator);
    }
    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        if(this.getGenIDType()!=null && this.getGenIDType().getStatus()!=null){
            strBuilder.append(this.getGenIDType().getStatus());
            strBuilder.append(" ");
        }
           if(this.getPayCode()!=null && this.getPayCode().getType()!=null){
               strBuilder.append(this.getPayCode().getType());
               strBuilder.append(" ");
           }
          if(this.getChargeCode()!=null){
              strBuilder.append(this.getChargeCode());
              strBuilder.append(" ");
          }
          if(this.getSubCode()!=null){
              strBuilder.append(this.getSubCode());
              strBuilder.append(" ");
          }
           if(this.getDueType()!=null && this.getDueType().getDue()!=null){
               strBuilder.append(this.getDueType().getDue());
               strBuilder.append(" ");
           }
           if(this.getAmount()!=null){
               strBuilder.append(this.getAmount());      
               strBuilder.append(" ");
           }
            if(this.getCreditType()!=null && this.getCreditType().getCredit()!=null){
                strBuilder.append(this.getCreditType().getCredit());
                strBuilder.append(" "); 
            }
           if(this.getDescription()!=null){
               strBuilder.append(this.getDescription());
               strBuilder.append(" ");
           }
           if(this.getTime()!=null){
               strBuilder.append(this.getTime());
               strBuilder.append(" "); 
           }
           if(this.getQuantity()!=null){
               strBuilder.append(this.getQuantity());
               strBuilder.append(" ");
           }
            if(this.getDate()!=null){
                
                strBuilder.append(DateUtility.getFormattedDate(
                    FrameworkConstants.DATEFORMAT,
                    this.getDate()));
                strBuilder.append(" ");
            }
           if(this.getServiceIndicator()!=null){
               strBuilder.append(this.getServiceIndicator());
               strBuilder.append(" ");
           }
           if(this.getTimeIndicator()!=null){
               strBuilder.append(this.getTimeIndicator());
               strBuilder.append(" ");  
           }

            return strBuilder.toString();
        
    }
    /**
     * Attribute to hold <code>revenueIndicator</code> property.
     */
    private Boolean revenueIndicator;

    /**
     * Attribute to hold <code>chargeLineNumber</code> property.
     */
    private Integer chargeLineNumber;

    public Integer getChargeLineNumber() {
        return chargeLineNumber;
    }

    public void setChargeLineNumber(Integer chargeLineNumber) {
        this.chargeLineNumber = chargeLineNumber;
    }

    /**
     * @return the revenueIndicator
     */
    public Boolean getRevenueIndicator() {
        return revenueIndicator;
    }

    /**
     * @param revenueIndicator the revenueIndicator to set
     */
    public void setRevenueIndicator(Boolean revenueIndicator) {
        this.revenueIndicator = revenueIndicator;
    }

	
}
