package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class AccountingAttachmentDto extends PersistenceObjectDto {

	private static final long serialVersionUID = 1L;

	private InterlineOutwardMemoDto interlineOutwardMemoDto;

	public InterlineOutwardMemoDto getInterlineOutwardMemoDto() {
		return interlineOutwardMemoDto;
	}

	public void setInterlineOutwardMemoDto(InterlineOutwardMemoDto interlineOutwardMemoDto) {
		this.interlineOutwardMemoDto = interlineOutwardMemoDto;
	}

	private Long OId;

	public Long getOId() {
		return OId;
	}

	public void setOId(Long oId) {
		OId = oId;
	}

	public byte[] getAttachment() {
		return attachment;
	}

	public void setAttachment(byte[] attachment) {
		this.attachment = attachment;
	}

	private byte[] attachment;

	private String fileName;
	
	private String memoNumber;

	public String getMemoNumber() {
		return memoNumber;
	}

	public void setMemoNumber(String memoNumber) {
		this.memoNumber = memoNumber;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
