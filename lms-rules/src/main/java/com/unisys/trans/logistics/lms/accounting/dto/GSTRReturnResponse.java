package com.unisys.trans.logistics.lms.accounting.dto;

public class GSTRReturnResponse {
	
	private String noRecordFoundMessage;

	private boolean error;
	
	private GSTRReturnDto gstrReturnDto = new GSTRReturnDto();

	public String getNoRecordFoundMessage() {
		return noRecordFoundMessage;
	}

	public void setNoRecordFoundMessage(String noRecordFoundMessage) {
		this.noRecordFoundMessage = noRecordFoundMessage;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public GSTRReturnDto getGstrReturnDto() {
		return gstrReturnDto;
	}

	public void setGstrReturnDto(GSTRReturnDto gstrReturnDto) {
		this.gstrReturnDto = gstrReturnDto;
	}

}
