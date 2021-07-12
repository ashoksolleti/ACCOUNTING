package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class InvoiceTypePersistRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	private InvoiceTypeDto invoicesTypeDto = new InvoiceTypeDto();

	private List<InvoiceTypeDto> invoiceTypeDtos = new ArrayList<InvoiceTypeDto>();
	
	private String templateType;

	private String specificAirline;

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

	/**
	 * @return the invoiceTypeDtos
	 */
	public List<InvoiceTypeDto> getInvoiceTypeDtos() {
		return invoiceTypeDtos;
	}

	/**
	 * @param invoiceTypeDtos
	 *            the invoiceTypeDtos to set
	 */
	public void setInvoiceTypeDtos(List<InvoiceTypeDto> invoiceTypeDtos) {
		this.invoiceTypeDtos = invoiceTypeDtos;
	}

	/**
	 * @return the templateType
	 */
	public String getTemplateType() {
		return templateType;
	}

	/**
	 * @param templateType the templateType to set
	 */
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}
	
	/**
	 * @return the specificAirline
	 */
	public String getSpecificAirline() {
		return this.specificAirline;
	}

	/**
	 * @param specificAirline
	 *            the specificAirline to set
	 */
	public void setSpecificAirline(final String specificAirline) {

		this.specificAirline = specificAirline;

	}

}
