package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.unisys.trans.logistics.lms.accounting.dto.constants.PaymentStatusType;
import com.unisys.trans.logistics.lms.framework.constants.CRAParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;

public class PaymentDetailsDto extends PersistenceObjectDto{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	

	private Long oId;
	private String participantAccNumber;
	private String paymentCurrency;
	private Date paymentDate;
	private Date paymentDueDate;
	private String paymentIdentifier;
	private PaymentStatusType paymentStatus;
	private String paymentSource;
	private String paymentType;
	/*private String participantType;*/
	private CRAParticipantAccountType participantType;
    private Date billingStartDate;
    private Date billingEndDate;
    private String fileName;
    private Date fileUploadedDate;
    private static final String EMPTY_STRING = "";
    private String formatPaymentDate;
    private String formatBillingDate;
    
    
    
    //no of doc
    
    
  

	private PaymentSummaryDto paymentSummaryDto = new PaymentSummaryDto();
	private List<PaymentBreakdownDto> paymentBreakdownDtos = new ArrayList<PaymentBreakdownDto>();
	
	
	
	public CRAParticipantAccountType getParticipantType() {
		return participantType;
	}

	public void setParticipantType(CRAParticipantAccountType participantType) {
		this.participantType = participantType;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	

	public String getFormatPaymentDate() {
		String value="";
    	if(this.getPaymentDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getPaymentDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		formatPaymentDate=value.toUpperCase();
    	}
		
		
		return formatPaymentDate;
	}

	public void setFormatPaymentDate(String formatPaymentDate) {
		this.formatPaymentDate = formatPaymentDate;
	}

	public String getFormatBillingDate() {
		String value="";
    	if(this.getBillingStartDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getBillingStartDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		formatBillingDate=value.toUpperCase();
    	}
		
		return formatBillingDate;
	}

	public void setFormatBillingDate(String formatBillingDate) {
		this.formatBillingDate = formatBillingDate;
	}

	public Date getFileUploadedDate() {
		return fileUploadedDate;
	}

	public void setFileUploadedDate(Date fileUploadedDate) {
		this.fileUploadedDate = fileUploadedDate;
	}

	public Date getBillingStartDate() {
		return billingStartDate;
	}

	public void setBillingStartDate(Date billingStartDate) {
		this.billingStartDate = billingStartDate;
	}

	public Date getBillingEndDate() {
		return billingEndDate;
	}

	public void setBillingEndDate(Date billingEndDate) {
		this.billingEndDate = billingEndDate;
	}
	




	
	
	

	

	public String getParticipantAccNumber() {
		return participantAccNumber;
	}

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

	public void setParticipantAccNumber(String participantAccNumber) {
		this.participantAccNumber = participantAccNumber;
	}

	public String getPaymentCurrency() {
		if(paymentCurrency!=null)
			paymentCurrency = paymentCurrency.toUpperCase();
		return paymentCurrency;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Date getPaymentDueDate() {
		return paymentDueDate;
	}

	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}

	public String getPaymentIdentifier() {
		if(paymentIdentifier!=null)
			paymentIdentifier = paymentIdentifier.toUpperCase();
		return paymentIdentifier;
	}

	public void setPaymentIdentifier(String paymentIdentifier) {
		this.paymentIdentifier = paymentIdentifier;
	}



	public PaymentStatusType getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatusType paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentSource() {
		return paymentSource;
	}

	public void setPaymentSource(String paymentSource) {
		this.paymentSource = paymentSource;
	}


	public List<PaymentBreakdownDto> getPaymentBreakdownDtos() {
		return paymentBreakdownDtos;
	}

	public void setPaymentBreakdownDtos(
			List<PaymentBreakdownDto> paymentBreakdownDtos) {
		this.paymentBreakdownDtos = paymentBreakdownDtos;
	}

	public PaymentSummaryDto getPaymentSummaryDto() {
		return paymentSummaryDto;
	}

	public void setPaymentSummaryDto(PaymentSummaryDto paymentSummaryDto) {
		this.paymentSummaryDto = paymentSummaryDto;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return this.oId;
	}

/*	public String toString() {
        // SuppressOn:MagicNumber
        final StringBuffer csvString = new StringBuffer();
        if (this.getPaymentIdentifier() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getPaymentIdentifier()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        return csvString.toString();
    }*/
	
	 private String prefixSuffixByQuotes(final String pString) {
	        final String aQUOTATION = "\"";
	        final String aCOMMA = ",";

	        final StringBuffer aModifiedString = new StringBuffer();
	        aModifiedString.append(aQUOTATION);
	        aModifiedString.append(pString);
	        aModifiedString.append(aQUOTATION);
	        aModifiedString.append(aCOMMA);

	        return aModifiedString.toString();
	    }
	 
	 public String toString() {
	        // SuppressOn:MagicNumber
	        final StringBuffer csvString = new StringBuffer();
	        
	        if (this.getPaymentIdentifier() != null) {
	            csvString.append(this.prefixSuffixByQuotes(this.getPaymentIdentifier()));
	        }
	        else {

	            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
	        }
	        
	        
	        if (this.getParticipantAccNumber() != null) {
	            csvString.append(this.prefixSuffixByQuotes(this.getParticipantAccNumber()));
	        }
	        else {

	            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
	        }
	        
	        if (this.getParticipantType() != null) {
	            csvString.append(this.prefixSuffixByQuotes(this.getParticipantType().getStringValue()));
	        }
	        else {

	            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
	        }
	        
	        if (this.getPaymentDate() != null) {
	            csvString.append(this.prefixSuffixByQuotes(this.getFormatPaymentDate()));
	        }
	        else {

	            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
	        }
	        
	        if (this.getBillingStartDate() != null) {
	            csvString.append(this.prefixSuffixByQuotes(this.getFormatBillingDate()));
	        }
	        else {

	            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
	        }
	        
	        if (this.getPaymentSummaryDto().getTotalPaymentNetamount() != null) {
	            csvString.append(this.prefixSuffixByQuotes(this.getPaymentSummaryDto().getTotalPaymentNetamount().toString()));
	        }
	        else {

	            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
	        }
	        return csvString.toString();
	 }
	
}
