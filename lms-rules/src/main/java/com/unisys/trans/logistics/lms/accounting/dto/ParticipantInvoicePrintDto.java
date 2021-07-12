package com.unisys.trans.logistics.lms.accounting.dto;


import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
 

/**
 * 
 * 
 */
/**
 * <code>ParticipantInvoicePrint</code> domain contain details of ParticipantInvoicePrint.
 * <p>
 * This contains all information about ParticipantInvoicePrint.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>billingStartDate
 * <li>billingEndDate
 * <li>billingSheduleIdentifier
 * <li>billingSheduleType
 * <li>invoiceDate
 * <li>invoiceFile
 * <li>invoiceNumber
 * <li>invoiceStatus
 * <li>partAccountNumber
 * <li>invoiceFileName
 * <li>oId
 * </ul>
 */

public class ParticipantInvoicePrintDto extends PersistenceObjectDto{
	/**
	 * Unique Serial Version Id UID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Attribute to hold <code>oId</code> property.
	 */
	
	private Long oId;
	/**
	 * Attribute to hold <code>billingEndDate</code> property.
	 */
   
	private Date billingEndDate;

    /**
	 * Attribute to hold <code>billingSheduleIdentifier</code> property.
	 */
	
	private String billingSheduleIdentifier;
	 /**
		 * Attribute to hold <code>billingSheduleType</code> property.
		 */
	private String billingSheduleType;
	/**
	 * Attribute to hold <code>billingStartDate</code> property.
	 */
    private Date billingStartDate;
    /**
	 * Attribute to hold <code>invoiceDate</code> property.
	 */
    private Date invoiceDate;
    /**
   	 * Attribute to hold <code>invoiceFile</code> property.
   	 */
    private byte[] invoiceFile;
    /**
   	 * Attribute to hold <code>invoiceNumber</code> property.
   	 */
	private String invoiceNumber;
	/**
   	 * Attribute to hold <code>invoiceStatus</code> property.
   	 */
	private String invoiceStatus;
	/**
   	 * Attribute to hold <code>partAccountNumber</code> property.
   	 */
	private String partAccountNumber;
	/**
   	 * Attribute to hold <code>invoiceFileName</code> property.
   	 */
	private String invoiceFileName;
	
	
	
    public ParticipantInvoicePrintDto() {
    }
    /**
	 * Gets the <code>oId</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>oId</code> property.<br>
	 */

	public void setOId(Long oId) {
		this.oId = oId;
	}

    @Override
	public Long getOId() {
		
		return this.oId;
	}
    
    /**
	 * Gets the <code>billingEndDate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>billingEndDate</code> property.<br>
	 */

	public Date getBillingEndDate() {
		return this.billingEndDate;
	}
	/**
	 * Sets the <code>billingEndDate</code> property.
	 * <p>
	 * 
	 * @param billingEndDate
	 *            the new value of the <code>billingEndDate</code> property.
	 */
	public void setBillingEndDate(Date billingEndDate) {
		this.billingEndDate = billingEndDate;
	}
	/**
	 * Gets the <code>billingSheduleIdentifier</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>billingSheduleIdentifier</code> property.<br>
	 */
	public String getBillingSheduleIdentifier() {
		return this.billingSheduleIdentifier;
	}
	/**
	 * Sets the <code>billingSheduleIdentifier</code> property.
	 * <p>
	 * 
	 * @param billingSheduleIdentifier
	 *            the new value of the <code>billingSheduleIdentifier</code> property.
	 */
	public void setBillingSheduleIdentifier(String billingSheduleIdentifier) {
		this.billingSheduleIdentifier = billingSheduleIdentifier;
	}
	/**
	 * Gets the <code>billingSheduleType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>billingSheduleType</code> property.<br>
	 */
	public String getBillingSheduleType() {
		return this.billingSheduleType;
	}
	/**
	 * Sets the <code>billingSheduleIdentifier</code> property.
	 * <p>
	 * 
	 * @param billingSheduleType
	 *            the new value of the <code>billingSheduleType</code> property.
	 */
	public void setBillingSheduleType(String billingSheduleType) {
		this.billingSheduleType = billingSheduleType;
	}
	/**
	 * Gets the <code>billingStartDate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>billingStartDate</code> property.<br>
	 */
	public Date getBillingStartDate() {
		return this.billingStartDate;
	}
	/**
	 * Sets the <code>billingStartDate</code> property.
	 * <p>
	 * 
	 * @param billingStartDate
	 *            the new value of the <code>billingStartDate</code> property.
	 */
	public void setBillingStartDate(Date billingStartDate) {
		this.billingStartDate = billingStartDate;
	}
	/**
	 * Gets the <code>invoiceDate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>invoiceDate</code> property.<br>
	 */
	public Date getInvoiceDate() {
		return this.invoiceDate;
	}
	/**
	 * Sets the <code>invoiceDate</code> property.
	 * <p>
	 * 
	 * @param invoiceDate
	 *            the new value of the <code>invoiceDate</code> property.
	 */
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	/**
	 * Gets the <code>invoiceFile</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>invoiceFile</code> property.<br>
	 */
	public byte[] getInvoiceFile() {
		return this.invoiceFile;
	}
	/**
	 * Sets the <code>invoiceFile</code> property.
	 * <p>
	 * 
	 * @param invoiceFile
	 *            the new value of the <code>invoiceFile</code> property.
	 */
	public void setInvoiceFile(byte[] invoiceFile) {
		this.invoiceFile = invoiceFile;
	}
	/**
	 * Gets the <code>invoiceNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>invoiceNumber</code> property.<br>
	 */
	public String getInvoiceNumber() {
		return this.invoiceNumber;
	}
	/**
	 * Sets the <code>invoiceNumber</code> property.
	 * <p>
	 * invoiceNumber
	 * @param invoiceNumber
	 *            the new value of the <code>invoiceNumber</code> property.
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	/**
	 * Gets the <code>invoiceStatus</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>invoiceStatus</code> property.<br>
	 */
	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}
	/**
	 * Sets the <code>invoiceStatus</code> property.
	 * <p>
	 * @param invoiceStatus
	 *            the new value of the <code>invoiceStatus</code> property.
	 */
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}
	/**
	 * Gets the <code>partAccountNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>partAccountNumber</code> property.<br>
	 */
	public String getPartAccountNumber() {
		return this.partAccountNumber;
	}

	/**
	 * @return the invoiceFileName
	 */
	public String getInvoiceFileName() {
		return invoiceFileName;
	}

	/**
	 * @param invoiceFileName the invoiceFileName to set
	 */
	public void setInvoiceFileName(String invoiceFileName) {
		this.invoiceFileName = invoiceFileName;
	}
	/**
	 * Sets the <code>partAccountNumber</code> property.
	 * <p>
	 * @param partAccountNumber
	 *            the new value of the <code>partAccountNumber</code> property.
	 */
	public void setPartAccountNumber(String partAccountNumber) {
		this.partAccountNumber = partAccountNumber;
	}

	

}