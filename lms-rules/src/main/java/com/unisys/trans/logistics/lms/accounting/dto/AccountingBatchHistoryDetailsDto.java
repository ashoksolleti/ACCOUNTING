package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class AccountingBatchHistoryDetailsDto extends PersistenceObjectDto {
	private static final long serialVersionUID = 1L;
	private Long oId;
	private String invoiceNumber;
	private String participantNumber;
	private boolean status;
	private String description;
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getParticipantNumber() {
		return participantNumber;
	}
	public void setParticipantNumber(String participantNumber) {
		this.participantNumber = participantNumber;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String passedString;
	public String getPassedString() {
		return this.passedString;
	}
	public void setPassedString(String passedString) {
		this.passedString = passedString;
	}
	@Override
	public Long getOId() {
		return this.oId;
	}
	public void setOId(long oId) {
		this.oId = oId;
	}
	public String toString() {
		if(this.getPassedString() != null && this.getPassedString().length() > 0){
			if("null".equals(this.getPassedString())){
				return "Batch Not Processed Due to Null. ";
			}
			return this.getPassedString();
		} else {
			final StringBuffer csvString = new StringBuffer();
			csvString.append(prefixSuffixByQuotesAndHandleNull(this.getOId()+""));
			csvString.append(prefixSuffixByQuotesAndHandleNull(this.getInvoiceNumber()));
			csvString.append(prefixSuffixByQuotesAndHandleNull(this.getParticipantNumber()));
			csvString.append(prefixSuffixByQuotesAndHandleNull(this.getStatus() ? "SUCCESS" : "FAILED"));
			csvString.append(prefixSuffixByQuotesAndHandleNull(this.getDescription()));
			return csvString.toString();
		}
	}
	 private String prefixSuffixByQuotesAndHandleNull(final String pString) {
		 final StringBuffer aModifiedString = new StringBuffer();
		 final String aQUOTATION = "\"";
		 final String aCOMMA = ",";
		 aModifiedString.append(aQUOTATION);
		 if(pString != null){
			 aModifiedString.append(pString);
		 } else {
			 aModifiedString.append(" ");
		 }
		 aModifiedString.append(aQUOTATION);
		 aModifiedString.append(aCOMMA);
		 return aModifiedString.toString();
	    }
}