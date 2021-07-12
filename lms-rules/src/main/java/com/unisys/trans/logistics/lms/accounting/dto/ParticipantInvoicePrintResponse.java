package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.OutputStream;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * * <code>ParticipantInvoicePrintResponse</code> is used for returning <code> OutputStream Object</code>
* information.
* <p>
* This contains the following attributes:
* <ul>
* <li><code>participantInvoicePrint</code>
 */
public class ParticipantInvoicePrintResponse extends AbstractResponse  {

	/**
     * Unique serial version UID.
     */
	private static final long serialVersionUID = 3546703328146525171L;
	
	/**
     * Attribute to hold the <code>file</code> object.
     */
	byte[] invoiceFile;
	byte[] creditInvoiceFile;

	/**
	 * @return the file
	 */
	public byte[] getFile() {
		return invoiceFile;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(byte[] file) {
		this.invoiceFile = file;
	}
	
	/**
	 * @return the file
	 */
	public byte[] getcreditInvoiceFile() {
		return creditInvoiceFile;
	}

	/**
	 * @param file the file to set
	 */
	public void setcreditInvoiceFile(byte[] file1) {
		this.creditInvoiceFile = file1;
	}

}
