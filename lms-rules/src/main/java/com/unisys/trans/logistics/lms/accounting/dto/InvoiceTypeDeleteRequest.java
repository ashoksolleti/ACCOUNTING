package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class InvoiceTypeDeleteRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	private InvoiceTypeDto invoicesTypeDto = new InvoiceTypeDto();

	/**
	 * @return the invoicesTypeDto
	 */
	public InvoiceTypeDto getInvoiceTypeDto() {
		return invoicesTypeDto;
	}

	/**
	 * @param invoicesTypeDto
	 *            the invoicesTypeDto to set
	 */
	public void setInvoiceTypeDto(InvoiceTypeDto invoicesTypeDto) {
		this.invoicesTypeDto = invoicesTypeDto;
	}

}
