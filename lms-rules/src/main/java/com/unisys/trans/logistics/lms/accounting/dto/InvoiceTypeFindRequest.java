package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class InvoiceTypeFindRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	private InvoiceTypeFindDto invoiceTypeFindDto = new InvoiceTypeFindDto();
	// NAC004 Starts
	private String specificAirline;

	/**
	 * @return the invoicesTypeFindDto
	 */
	public InvoiceTypeFindDto getInvoiceTypeFindDto() {
		return invoiceTypeFindDto;
	}

	/**
	 * @param invoicesTypeFindDto
	 *            the invoicesTypeFindDto to set
	 */
	public void setInvoiceTypeFindDto(InvoiceTypeFindDto invoiceTypeFindDto) {
		this.invoiceTypeFindDto = invoiceTypeFindDto;
	}

	/* NAC004 Starts */
	/**
	 * @return the specificAirline
	 */
	public String getSpecificAirline() {
		return specificAirline;
	}

	/**
	 * @param specificAirline
	 *            the specificAirline to set
	 */
	public void setSpecificAirline(final String specificAirline) {

		this.specificAirline = specificAirline;
	}
	/* NAC004 Ends */

}
