/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;

public class AccountingStatusDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2949913117300710691L;

    /**
     * Attribute to hold <code>accountStatusEntries</code> property.
     */
    private List<AccountingStatusEntryDto> accountStatusEntries;
    
    private boolean manualAduitQueueStatus;
    
    public boolean isManualAduitQueueStatus() {
		return manualAduitQueueStatus;
	}

	public void setManualAduitQueueStatus(boolean manualAduitQueueStatus) {
		this.manualAduitQueueStatus = manualAduitQueueStatus;
	}

	public boolean isErrorQueueStatus() {
		return errorQueueStatus;
	}

	public void setErrorQueueStatus(boolean errorQueueStatus) {
		this.errorQueueStatus = errorQueueStatus;
	}

	public boolean isGlQueueSataus() {
		return glQueueSataus;
	}

	public void setGlQueueSataus(boolean glQueueSataus) {
		this.glQueueSataus = glQueueSataus;
	}

	private boolean errorQueueStatus;
    
    private boolean glQueueSataus;

    /**
     * Attribute to hold <code>invoiceIndicator</code> property.
     */
    private boolean invoiceIndicator;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>postingIndicator</code> property.
     */
    private boolean postingIndicator;

    /**
     * Attribute to hold <code>queueName</code> property.
     */
    private String queueName;

    /**
     * Attribute to hold <code>queueOffice</code> property.
     */
    private String queueOffice;

    /**
     * Attribute to hold <code>queueStation</code> property.
     */
    private String queueStation;

    /**
     * Attribute to hold <code>queueStatus</code> property.
     */
    private boolean queueStatus;

    /**
     * Attribute to hold <code>reportIndicator</code> property.
     */
    private boolean reportIndicator;

    /**
     * Gets the <code>accountStatusEntries</code> property.
     * <p>
     * 
     * @return the current value of the <code>accountStatusEntries</code> property.
     */
    public List<AccountingStatusEntryDto> getAccountStatusEntries() {
        if (this.accountStatusEntries == null || this.accountStatusEntries.isEmpty()) {
            this.accountStatusEntries = new ArrayList<AccountingStatusEntryDto>();
        }
        return this.accountStatusEntries;
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
     * Gets the <code>queueName</code> property.
     * <p>
     * 
     * @return the current value of the <code>queueName</code> property.
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * Gets the <code>queueOffice</code> property.
     * <p>
     * 
     * @return the current value of the <code>queueOffice</code> property.
     */
    public String getQueueOffice() {
        return this.queueOffice;
    }

    /**
     * Gets the <code>queueStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>queueStation</code> property.
     */
    public String getQueueStation() {
        return this.queueStation;
    }

    /**
     * Gets the <code>invoiceIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>invoiceIndicator</code> property.
     */
    public boolean getInvoiceIndicator() {
        return this.invoiceIndicator;
    }

    /**
     * Gets the <code>postingIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>postingIndicator</code> property.
     */
    public boolean getPostingIndicator() {
        return this.postingIndicator;
    }

    /**
     * Gets the <code>queueStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>queueStatus</code> property.
     */
    public boolean getQueueStatus() {
        return this.queueStatus;
    }

    /**
     * Gets the <code>reportIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>reportIndicator</code> property.
     */
    public boolean getReportIndicator() {
        return this.reportIndicator;
    }

    /**
     * Sets the <code>accountStatusEntries</code>.
     * <p>
     * 
     * @param pAccountStatusEntries
     *            holds the new value of <code>accountStatusEntries</code>
     */
    public void setAccountStatusEntries(final List<AccountingStatusEntryDto> pAccountStatusEntries) {
        this.accountStatusEntries = pAccountStatusEntries;
    }

    /**
     * Sets the <code>invoiceIndicator</code>.
     * <p>
     * 
     * @param pInvoiceIndicator
     *            holds the new value of <code>invoiceIndicator</code>
     */
    public void setInvoiceIndicator(final boolean pInvoiceIndicator) {
        this.invoiceIndicator = pInvoiceIndicator;
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
     * Sets the <code>postingIndicator</code>.
     * <p>
     * 
     * @param pPostingIndicator
     *            holds the new value of <code>postingIndicator</code>
     */
    public void setPostingIndicator(final boolean pPostingIndicator) {
        this.postingIndicator = pPostingIndicator;
    }

    /**
     * Sets the <code>queueName</code>.
     * <p>
     * 
     * @param pQueueName
     *            holds the new value of <code>queueName</code>
     */
    public void setQueueName(final String pQueueName) {
        this.queueName = ContractUtility.convertToUpperCase(pQueueName);
    }

    /**
     * Sets the <code>queueOffice</code>.
     * <p>
     * 
     * @param pQueueOffice
     *            holds the new value of <code>queueOffice</code>
     */
    public void setQueueOffice(final String pQueueOffice) {
        this.queueOffice = ContractUtility.convertToUpperCase(pQueueOffice);
    }

    /**
     * Sets the <code>queueStation</code>.
     * <p>
     * 
     * @param pQueueStation
     *            holds the new value of <code>queueStation</code>
     */
    public void setQueueStation(final String pQueueStation) {
        this.queueStation = ContractUtility.convertToUpperCase(pQueueStation);
    }

    /**
     * Sets the <code>queueStatus</code>.
     * <p>
     * 
     * @param pQueueStatus
     *            holds the new value of <code>queueStatus</code>
     */
    public void setQueueStatus(final boolean pQueueStatus) {
        this.queueStatus = pQueueStatus;
    }

    /**
     * Sets the <code>reportIndicator</code>.
     * <p>
     * 
     * @param pReportIndicator
     *            holds the new value of <code>reportIndicator</code>
     */
    public void setReportIndicator(final boolean pReportIndicator) {
        this.reportIndicator = pReportIndicator;
    }

    @Override
    public String toString() {
        final StringBuilder strBuilder = new StringBuilder();

        if (this.isManualAduitQueueStatus()) {
            strBuilder.append("Yes");
            strBuilder.append(" ");
        }
        if (!this.isManualAduitQueueStatus()) {
            strBuilder.append("No");
            strBuilder.append(" ");
        }
        if(this.isErrorQueueStatus()){
            strBuilder.append("Yes");
            strBuilder.append(" ");
        }
        if(!this.isErrorQueueStatus()){
            strBuilder.append("No");
            strBuilder.append(" ");
        }
        if(this.isGlQueueSataus()){
            strBuilder.append("Yes");
            strBuilder.append(" ");
 
        }
        if(!this.isGlQueueSataus()){
            strBuilder.append("No");
            strBuilder.append(" ");
 
        }
        if (this.getAccountStatusEntries() != null) {
            for (AccountingStatusEntryDto accountingStatusDto : this.getAccountStatusEntries()) {

                if (accountingStatusDto.getAirWaybillUpdateReasonCode() != null) {
                    strBuilder.append(accountingStatusDto.getAirWaybillUpdateReasonCode());
                    strBuilder.append(" ");
                }
                if (accountingStatusDto.getAirWaybillUpdateReasontext() != null) {
                    strBuilder.append(accountingStatusDto.getAirWaybillUpdateReasontext());
                    strBuilder.append(" ");
                }
                if (accountingStatusDto.getAccountingRemarks() != null) {
                	strBuilder.append(accountingStatusDto.getAccountingRemarks());
                	strBuilder.append(" ");
                }
            }
        }
      /*
        if (this.getAccountStatusEntries() != null) {
            for (AccountingStatusEntryDto accountingStatusDto : this.getAccountStatusEntries()) {
                if (accountingStatusDto.getAirWaybillUpdateReasonCode() != null) {
                    strBuilder.append(accountingStatusDto.getAirWaybillUpdateReasonCode());
                    strBuilder.append(" ");
                }
                if (accountingStatusDto.getAirWaybillUpdateReasontext() != null) {
                    strBuilder.append(accountingStatusDto.getAirWaybillUpdateReasontext());
                    strBuilder.append(" ");
                }

            }
        }*/
        return strBuilder.toString();
    }
}
