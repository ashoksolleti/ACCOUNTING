package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class InvoiceTypeFindDto extends PersistenceObjectDto {

	private static final long serialVersionUID = 1L;

	private Long oId;

	private String templateType;

	private String invoiceTypeName;

	private String invoiceFormatType;

	private String invoiceIdentifier;
	// NAC004
	private String specificAirline;

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	public Long getOId() {
		// TODO Auto-generated method stub
		return this.oId;
	}

	/**
	 * @param oId
	 *            the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

	/**
	 * @return the invoiceTypeName
	 */
	public String getInvoiceTypeName() {
		return invoiceTypeName;
	}

	/**
	 * @param invoiceTypeName
	 *            the invoiceTypeName to set
	 */
	public void setInvoiceTypeName(String invoiceTypeName) {
		this.invoiceTypeName = invoiceTypeName;
	}

	/**
	 * @return the invoiceFormatType
	 */
	public String getInvoiceFormatType() {
		return invoiceFormatType;
	}

	/**
	 * @param invoiceFormatType
	 *            the invoiceFormatType to set
	 */
	public void setInvoiceFormatType(String invoiceFormatType) {
		this.invoiceFormatType = invoiceFormatType;
	}

	/**
	 * @return the invoiceIdentifier
	 */
	public String getInvoiceIdentifier() {
		return invoiceIdentifier;
	}

	/**
	 * @param invoiceIdentifier
	 *            the invoiceIdentifier to set
	 */
	public void setInvoiceIdentifier(String invoiceIdentifier) {
		this.invoiceIdentifier = invoiceIdentifier;
	}

	/**
	 * @return the invoiceTemplate
	 */

	/**
	 * @return the templateType
	 */
	public String getTemplateType() {
		return templateType;
	}

	/**
	 * @param templateType
	 *            the templateType to set
	 */
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

	/* NAC004 Starts */
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
	/* NAC004 Ends */
}
