package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardInvoiceStatus;
import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoStatus;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * The DTO class for selection list.
 * 
 */
public class SelectionInvoiceDetailDto extends PersistenceObjectDto {
    private static final long serialVersionUID = 1L;

    private Long oId;

    private String billingCurrency;

    private Date invoiceDate;

    private String invoiceNumber;
    
    private String memoNumber;

	private InwardInvoiceStatus invoiceStatus;

    private Boolean sisIndicator;
    
    private String billingCarrier;
    
	private String aWBNumberDisplay;
	
	private InvoiceStatusType rmInvoiceStatus;
	
	private MemoStatus rejectionMemoStatus;

	public MemoStatus getRejectionMemoStatus() {
		return rejectionMemoStatus;
	}

	public void setRejectionMemoStatus(MemoStatus rejectionMemoStatus) {
		this.rejectionMemoStatus = rejectionMemoStatus;
	}

	public InvoiceStatusType getRmInvoiceStatus() {
		return rmInvoiceStatus;
	}

	public void setRmInvoiceStatus(InvoiceStatusType rmInvoiceStatus) {
		this.rmInvoiceStatus = rmInvoiceStatus;
	}

	 public String getMemoNumber() {
			return memoNumber;
		}

		public void setMemoNumber(String memoNumber) {
			this.memoNumber = memoNumber;
		}
	/**
	 * @return the aWBNumberDisplay
	 */
	public String getAWBNumberDisplay() {
		return this.aWBNumberDisplay;
	}

	/**
	 * @param pAWBNumberDisplay
	 *            the aWBNumberDisplay to set
	 */
	public void setAWBNumberDisplay(final String pAWBNumberDisplay) {
		this.aWBNumberDisplay = ContractUtility
				.convertToUpperCase(pAWBNumberDisplay);
	}
	
    public SelectionInvoiceDetailDto() {
    }

    public void setOId(Long pOId) {
        this.oId = pOId;
    }

    public String getBillingCurrency() {
        return this.billingCurrency;
    }

    public void setBillingCurrency(String billingCurrency) {
        this.billingCurrency = ContractUtility.convertToUpperCase(billingCurrency);
    }

    public Date getInvoiceDate() {
        return this.invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public InwardInvoiceStatus getInvoiceStatus() {
        return this.invoiceStatus;
    }

    public void setInvoiceStatus(InwardInvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return this.oId;
    }

    public Boolean getSisIndicator() {
        return sisIndicator;
    }

    public void setSisIndicator(final Boolean pSisIndicator) {
        this.sisIndicator = pSisIndicator;
    }

    public String getBillingCarrier() {
        return billingCarrier;
    }

    public void setBillingCarrier(final String pBillingCarrier) {
        this.billingCarrier = pBillingCarrier;
    }
    
    
}