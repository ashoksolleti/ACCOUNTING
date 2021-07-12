package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.File;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;



/**
 * <code>CASSInvoiceFileDetailsDto</code> class contain information specific to an  CASSInvoiceFileDetails.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>billingSheduleIdentifier
 * <li>invoiceFrequency
 * <li>billingStartDate
 * <li>billingEndDate
 * <li>cassFileName 
 * <li>cassFile
 * </code>
 * </ul>
 */

public class CASSInvoiceFileDetailsDto extends PersistenceObjectDto{
	
	
	  /**
     * Unique serial version UID.
     */
	private static final long serialVersionUID = 4775709269389417063L;

	/**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>billingSheduleIdentifier</code> property.
     */
    private String billingSheduleIdentifier;
    
    /**
     * Attribute to hold <code>invoiceFrequency</code> property.
     */
    
    private String invoiceFrequency;
    
    /**
     * Attribute to hold <code>billingStartDate</code> property.
     */
    
    private Date billingStartDate;
    
    /**
     * Attribute to hold <code>billingEndDate</code> property.
     */
    
    private Date billingEndDate;
    
    /**
     * Attribute to hold <code>cassFileName</code> property.
     */
    
    private String cassFileName;
    
    /**
     * Attribute to hold <code>cassFileName</code> property.
     */
    private byte[] cassFile;

	/**
	 * @return the billingSheduleIdentifier
	 */
	public String getBillingSheduleIdentifier() {
		return billingSheduleIdentifier;
	}

	/**
	 * @param billingSheduleIdentifier the billingSheduleIdentifier to set
	 */
	public void setBillingSheduleIdentifier(String billingSheduleIdentifier) {
		this.billingSheduleIdentifier = billingSheduleIdentifier;
	}

	/**
	 * @return the invoiceFrequency
	 */
	public String getInvoiceFrequency() {
		return invoiceFrequency;
	}

	/**
	 * @param invoiceFrequency the invoiceFrequency to set
	 */
	public void setInvoiceFrequency(String invoiceFrequency) {
		this.invoiceFrequency = invoiceFrequency;
	}

	/**
	 * @return the billingStartDate
	 */
	public Date getBillingStartDate() {
		return billingStartDate;
	}

	/**
	 * @param billingStartDate the billingStartDate to set
	 */
	public void setBillingStartDate(Date billingStartDate) {
		this.billingStartDate = billingStartDate;
	}

	/**
	 * @return the billingEndDate
	 */
	public Date getBillingEndDate() {
		return billingEndDate;
	}

	/**
	 * @param billingEndDate the billingEndDate to set
	 */
	public void setBillingEndDate(Date billingEndDate) {
		this.billingEndDate = billingEndDate;
	}

	/**
	 * @return the cassFileName
	 */
	public String getCassFileName() {
		return cassFileName;
	}

	/**
	 * @param cassFileName the cassFileName to set
	 */
	public void setCassFileName(String cassFileName) {
		this.cassFileName = cassFileName;
	}

	/**
	 * @return the cassFile
	 */
	public byte[] getCassFile() {
		return cassFile;
	}

	/**
	 * @param cassFile the cassFile to set
	 */
	public void setCassFile(byte[] cassFile) {
		this.cassFile = cassFile;
	}

	@Override
	public Long getOId() {
		
		return this.oId;
	}

}
