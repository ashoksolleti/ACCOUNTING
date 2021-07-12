package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class InvoiceTypeResponse extends AbstractResponse {

	private static final long serialVersionUID = 1L;

	private InvoiceTypeDto invoicesTypeDto = new InvoiceTypeDto();

	private List<InvoiceTypeDto> invoiceTypeDtoList = new ArrayList<InvoiceTypeDto>();

	private String updateComment;
	private String duplicateInvoiceTypeConfirmationMessage;
	private String noRecordFoundMessage;
	private String deleteInvoiceTypeMessage;
	private String cannotDeleteInvoiceTypeMessage;
	private String deleteACK;
	
	private boolean error;

	/**
	 * @return the error
	 */
	public boolean isError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(boolean error) {
		this.error = error;
	}

	/**
	 * @return the invoicesTypeDto
	 */
	public InvoiceTypeDto getInvoicesTypeDto() {
		return invoicesTypeDto;
	}

	/**
	 * @param invoicesTypeDto
	 *            the invoicesTypeDto to set
	 */
	public void setInvoicesTypeDto(InvoiceTypeDto invoicesTypeDto) {
		this.invoicesTypeDto = invoicesTypeDto;
	}

	/**
	 * @return the invoiceTypeDtoList
	 */
	public List<InvoiceTypeDto> getInvoiceTypeDtoList() {
		return invoiceTypeDtoList;
	}

	/**
	 * @param invoiceTypeDtoList
	 *            the invoiceTypeDtoList to set
	 */
	public void setInvoiceTypeDtoList(List<InvoiceTypeDto> invoiceTypeDtoList) {
		this.invoiceTypeDtoList = invoiceTypeDtoList;
	}

	/**
	 * @return the updateComment
	 */
	public String getUpdateComment() {
		return updateComment;
	}

	/**
	 * @param updateComment
	 *            the updateComment to set
	 */
	public void setUpdateComment(String updateComment) {
		this.updateComment = updateComment;
	}

	/**
	 * @return the duplicateInvoiceTypeConfirmationMessage
	 */
	public String getDuplicateInvoiceTypeConfirmationMessage() {
		return duplicateInvoiceTypeConfirmationMessage;
	}

	/**
	 * @param duplicateInvoiceTypeConfirmationMessage
	 *            the duplicateInvoiceTypeConfirmationMessage to set
	 */
	public void setDuplicateInvoiceTypeConfirmationMessage(
			String duplicateInvoiceTypeConfirmationMessage) {
		this.duplicateInvoiceTypeConfirmationMessage = duplicateInvoiceTypeConfirmationMessage;
	}

	/**
	 * @return the noRecordFoundMessage
	 */
	public String getNoRecordFoundMessage() {
		return noRecordFoundMessage;
	}

	/**
	 * @param noRecordFoundMessage
	 *            the noRecordFoundMessage to set
	 */
	public void setNoRecordFoundMessage(String noRecordFoundMessage) {
		this.noRecordFoundMessage = noRecordFoundMessage;
	}

	/**
	 * @return the deleteInvoiceTypeMessage
	 */
	public String getDeleteInvoiceTypeMessage() {
		return deleteInvoiceTypeMessage;
	}

	/**
	 * @param deleteInvoiceTypeMessage
	 *            the deleteInvoiceTypeMessage to set
	 */
	public void setDeleteInvoiceTypeMessage(String deleteInvoiceTypeMessage) {
		this.deleteInvoiceTypeMessage = deleteInvoiceTypeMessage;
	}

	/**
	 * @return the cannotDeleteInvoiceTypeMessage
	 */
	public String getCannotDeleteInvoiceTypeMessage() {
		return cannotDeleteInvoiceTypeMessage;
	}

	/**
	 * @param cannotDeleteInvoiceTypeMessage
	 *            the cannotDeleteInvoiceTypeMessage to set
	 */
	public void setCannotDeleteInvoiceTypeMessage(
			String cannotDeleteInvoiceTypeMessage) {
		this.cannotDeleteInvoiceTypeMessage = cannotDeleteInvoiceTypeMessage;
	}

	/**
	 * @return the deleteACK
	 */
	public String getDeleteACK() {
		return deleteACK;
	}

	/**
	 * @param deleteACK
	 *            the deleteACK to set
	 */
	public void setDeleteACK(String deleteACK) {
		this.deleteACK = deleteACK;
	}

}
