package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class PaymentInformationPersistRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	private Long oId;

	private Boolean fileUploaded = false;

	private PaymentDetailsDto paymentDetailsDto;

	private byte[] inputBytes;
	
	private String fileName;
	
	private String fileExtension;
	
		
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	

	public byte[] getInputBytes() {
		return inputBytes;
	}

	public void setInputBytes(byte[] inputBytes) {
		this.inputBytes = inputBytes;
	}

	private List<PaymentDetailsDto> paymentDetailsDtos;

	/**
	 * @return the paymentDetailsDtos
	 */
	public List<PaymentDetailsDto> getPaymentDetailsDtos() {
		return paymentDetailsDtos;
	}

	/**
	 * @param paymentDetailsDtos
	 *            the paymentDetailsDtos to set
	 */
	public void setPaymentDetailsDtos(List<PaymentDetailsDto> paymentDetailsDtos) {
		this.paymentDetailsDtos = paymentDetailsDtos;
	}

	public PaymentDetailsDto getPaymentDetailsDto() {
		return paymentDetailsDto;
	}

	public void setPaymentDetailsDto(PaymentDetailsDto paymentDetailsDto) {
		this.paymentDetailsDto = paymentDetailsDto;
	}

	public Boolean getFileUploaded() {
		return fileUploaded;
	}

	public void setFileUploaded(Boolean fileUploaded) {
		this.fileUploaded = fileUploaded;
	}

	public PaymentInformationPersistRequest() {

	}

	public String getFileExtension() {
		return fileExtension;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

}
