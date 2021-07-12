/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceType;
import com.unisys.trans.logistics.lms.framework.constants.HostType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class AccountingStatusEntryDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6914109672357325001L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>invoiceNumber</code> property.
     */
    private String invoiceNumber;

    /**
     * Attribute to hold <code>invoiceType</code> property.
     */
    private InvoiceType invoiceType;

    /**
     * Attribute to hold <code>userAudit</code> property.
     */
    private UserAuditDto userAudit;

    /**
     * Attribute to hold <code>airWaybillUpdateReason</code> property.
     */
    private String airWaybillUpdateReasonCode;
    
    
    private String airWaybillUpdateReasontext;
    
    
    private String accountingRemarks;

    /**
     * Gets the <code>airWaybillUpdateReasonCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWaybillUpdateReasonCode</code> property.
     */
    public String getAirWaybillUpdateReasonCode() {
        return this.airWaybillUpdateReasonCode;
    }

    /**
     * Gets the <code>invoiceNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>invoiceNumber</code> property.
     */
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    /**
     * Gets the <code>invoiceType</code> property.
     * <p>
     * 
     * @return the current value of the <code>invoiceType</code> property.
     */
    public InvoiceType getInvoiceType() {
        return this.invoiceType;
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
     * Gets the <code>userAudit</code> property.
     * <p>
     * 
     * @return the current value of the <code>userAudit</code> property.
     */
    public UserAuditDto getUserAudit() {
       if(this.userAudit ==null)
       {
           this.userAudit=new UserAuditDto();
       }
        return this.userAudit;
    }

    /**
     * Sets the <code>airWaybillUpdateReasonCode</code>.
     * <p>
     * 
     * @param pAirWaybillUpdateReasonCode
     *            holds the new value of <code>airWaybillUpdateReasonCode</code>
     */

    public void setAirWaybillUpdateReasonCode(final String pAirWaybillUpdateReasonCode) {
        this.airWaybillUpdateReasonCode = ContractUtility.convertToUpperCase( pAirWaybillUpdateReasonCode);
    }

    /**
     * Sets the <code>invoiceNumber</code>.
     * <p>
     * 
     * @param pInvoiceNumber
     *            holds the new value of <code>invoiceNumber</code>
     */
    public void setInvoiceNumber(final String pInvoiceNumber) {
        this.invoiceNumber = ContractUtility.convertToUpperCase(pInvoiceNumber);
    }

    /**
     * Sets the <code>invoiceType</code>.
     * <p>
     * 
     * @param pInvoiceType
     *            holds the new value of <code>invoiceType</code>
     */
    public void setInvoiceType(final InvoiceType pInvoiceType) {
        this.invoiceType = pInvoiceType;
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
     * Sets the <code>userAudit</code>.
     * <p>
     * 
     * @param pUserAudit
     *            holds the new value of <code>userAudit</code>
     */
    public void setUserAudit(final UserAuditDto pUserAudit) {
        this.userAudit = pUserAudit;
    }

    public String getAirWaybillUpdateReasontext() {
        return airWaybillUpdateReasontext;
    }

    public void setAirWaybillUpdateReasontext(final String pAirWaybillUpdateReasontext) {
        this.airWaybillUpdateReasontext = ContractUtility.convertToUpperCase( pAirWaybillUpdateReasontext);
    }

    //Contact 11796567
    public String getAccountingRemarks() {
        return accountingRemarks;
    }

    public void setAccountingRemarks(final String accountingRemarks) {
    	this.accountingRemarks = accountingRemarks;
    	
    }

}
