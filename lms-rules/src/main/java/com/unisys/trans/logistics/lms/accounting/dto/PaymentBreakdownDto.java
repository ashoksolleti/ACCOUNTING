package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PaymentLevel;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PaymentStatusType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.logging.LMSLogger;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;

public class PaymentBreakdownDto extends PersistenceObjectDto{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean create = false;

	private boolean delete = false;

	private boolean update = false;
	
	private boolean inter = false; 
	
	private ActionType actionType;

	
	
	
	
    public boolean isCreate() {
		return create;
	}


	public void setCreate(boolean create) {
		this.create = create;
	}


	public boolean isDelete() {
		return delete;
	}


	public void setDelete(boolean delete) {
		this.delete = delete;
	}


	public boolean isUpdate() {
		return update;
	}


	public void setUpdate(boolean update) {
		this.update = update;
	}


	public boolean isInter() {
		return inter;
	}


	public void setInter(boolean inter) {
		this.inter = inter;
	}


	public ActionType getActionType() {
		return actionType;
	}


	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}


	private Long oId;
	

	private static final String EMPTY_STRING = "";
	private String airwaybillNumber;
	private Date awbDate;
	private String awbDestination;
	private String awbOrigin;
	private String awbPaymentType;
	private BigDecimal commissionAmount;
	private BigDecimal commissionPercentage;
	private String dcmReference;
	private BigDecimal grossWeight;
	private BigDecimal netAmount;
	private BigDecimal ocda;
	private BigDecimal ocdc;
	private String paymentDetailsIdentifier;
	private BigInteger pieces;
	private BigDecimal valuationCharge;
	private BigDecimal vatAmount;
	private BigDecimal weightCharges;
	private PaymentStatusType settlementStatus;
	private String invoiceNumber;
	private PaymentLevel paymentLevel;
	private BigDecimal invoiceAmount;
	private String pricingDateFormatted;
	private String code;
	private String amount;
	private String settlementStatusString;
	private PaymentDetailsDto paymentDetailsDto;
	private String documentArchived;
	
	public PaymentDetailsDto getPaymentDetailsDto() {
		return paymentDetailsDto;
	}

	public void setPaymentDetailsDto(PaymentDetailsDto paymentDetailsDto) {
		this.paymentDetailsDto = paymentDetailsDto;
	}

	

	public BigDecimal getInvoiceAmount() {
		return invoiceAmount;
	}


	public void setInvoiceAmount(BigDecimal invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	private String unit;
	private boolean error;
	private List<PaymentOtherChargeBreakdownDto> paymentOtherChargeBreakdownDtos =  new ArrayList<PaymentOtherChargeBreakdownDto>();
	private List<PaymentVatBreakdownDto> paymentVatBreakdownDtos = new ArrayList<PaymentVatBreakdownDto>();
	
	
	
	

	
	


	public String getPricingDateFormatted() {
		String value="";
    	if(this.getAwbDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getAwbDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		pricingDateFormatted=value.toUpperCase();
    	}
		return pricingDateFormatted;
	}


	public void setPricingDateFormatted(String pricingDateFormatted) {
		this.pricingDateFormatted = pricingDateFormatted;
	}


	public PaymentLevel getPaymentLevel() {
		return paymentLevel;
	}


	public void setPaymentLevel(PaymentLevel paymentLevel) {
		this.paymentLevel = paymentLevel;
	}


	public String getInvoiceNumber() {
		if(invoiceNumber!=null)
			invoiceNumber = invoiceNumber.toUpperCase();
		return invoiceNumber;
	}


	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	
	public List<PaymentOtherChargeBreakdownDto> getPaymentOtherChargeBreakdownDtos() {
		return paymentOtherChargeBreakdownDtos;
	}


	public void setPaymentOtherChargeBreakdownDtos(
			List<PaymentOtherChargeBreakdownDto> paymentOtherChargeBreakdownDtos) {
		this.paymentOtherChargeBreakdownDtos = paymentOtherChargeBreakdownDtos;
	}


	public List<PaymentVatBreakdownDto> getPaymentVatBreakdownDtos() {
		return paymentVatBreakdownDtos;
	}


	public void setPaymentVatBreakdownDtos(
			List<PaymentVatBreakdownDto> paymentVatBreakdownDtos) {
		this.paymentVatBreakdownDtos = paymentVatBreakdownDtos;
	}


	public Long getoId() {
		return oId;
	}


	public void setoId(Long oId) {
		this.oId = oId;
	}
	
	public boolean isError() {
		return error;
	}


	public void setError(boolean error) {
		this.error = error;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
	}

	public PaymentStatusType getSettlementStatus() {
		return settlementStatus;
	}


	public void setSettlementStatus(PaymentStatusType settlementStatus) {
		this.settlementStatus = settlementStatus;
	}


	public void setPaymentDetailsIdentifier(String paymentDetailsIdentifier) {
		this.paymentDetailsIdentifier = paymentDetailsIdentifier;
	}


	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return this.oId;
	}


	public String getAirwaybillNumber() {
		return airwaybillNumber;
	}


	public void setAirwaybillNumber(String airwaybillNumber) {
		this.airwaybillNumber = airwaybillNumber;
	}


	public Date getAwbDate() {
		return awbDate;
	}
	
	


	public void setAwbDate(Date awbDate) {
		this.awbDate = awbDate;
	}


	public String getAwbDestination() {
		if(awbDestination!=null)
			awbDestination = awbDestination.toUpperCase();
		return awbDestination;
	}


	public void setAwbDestination(String awbDestination) {
		this.awbDestination = awbDestination;
	}


	public String getAwbOrigin() {
		if(awbOrigin!=null)
			awbOrigin = awbOrigin.toUpperCase();
		return awbOrigin;
	}


	public void setAwbOrigin(String awbOrigin) {
		this.awbOrigin = awbOrigin;
	}


	public String getAwbPaymentType() {
		return awbPaymentType;
	}


	public void setAwbPaymentType(String awbPaymentType) {
		this.awbPaymentType = awbPaymentType;
	}


	public BigDecimal getCommissionAmount() {
		return commissionAmount;
	}


	public void setCommissionAmount(BigDecimal commissionAmount) {
		this.commissionAmount = commissionAmount;
	}


	public BigDecimal getCommissionPercentage() {
		return commissionPercentage;
	}


	public void setCommissionPercentage(BigDecimal commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}


	public String getDcmReference() {
		return dcmReference;
	}


	public void setDcmReference(String dcmReference) {
		this.dcmReference = dcmReference;
	}


	public BigDecimal getGrossWeight() {
		return grossWeight;
	}


	public void setGrossWeight(BigDecimal grossWeight) {
		this.grossWeight = grossWeight;
	}


	public BigDecimal getNetAmount() {
		return netAmount;
	}


	public void setNetAmount(BigDecimal netAmount) {
		this.netAmount = netAmount;
	}


	public BigDecimal getOcda() {
		return ocda;
	}


	public void setOcda(BigDecimal ocda) {
		this.ocda = ocda;
	}


	public BigDecimal getOcdc() {
		return ocdc;
	}


	public void setOcdc(BigDecimal ocdc) {
		this.ocdc = ocdc;
	}


	public String getPaymentDetailsIdentifier() {
		return paymentDetailsIdentifier;
	}


	public void setPaymentIdentifier(String paymentDetailsIdentifier) {
		this.paymentDetailsIdentifier = paymentDetailsIdentifier;
	}


	
	public BigInteger getPieces() {
		return pieces;
	}


	public void setPieces(BigInteger pieces) {
		this.pieces = pieces;
	}


	public BigDecimal getValuationCharge() {
		return valuationCharge;
	}


	public void setValuationCharge(BigDecimal valuationCharge) {
		this.valuationCharge = valuationCharge;
	}


	public BigDecimal getVatAmount() {
		return vatAmount;
	}


	public void setVatAmount(BigDecimal vatAmount) {
		this.vatAmount = vatAmount;
	}


	public BigDecimal getWeightCharges() {
		return weightCharges;
	}


	public void setWeightCharges(BigDecimal weightCharges) {
		this.weightCharges = weightCharges;
	}
	
	public String toString() {
        // SuppressOn:MagicNumber
        final StringBuffer csvString = new StringBuffer();
        
        if (this.getInvoiceNumber() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getInvoiceNumber()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        
        if (this.getAirwaybillNumber() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getAirwaybillNumber()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getDcmReference() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getDcmReference()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getAwbPaymentType() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getAwbPaymentType()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getPricingDateFormatted() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getPricingDateFormatted()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getAwbOrigin() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getAwbOrigin()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getAwbDestination() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getAwbDestination()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getGrossWeight() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getGrossWeight().toString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getUnit() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getUnit()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getPieces() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getPieces().toString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getOcda() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getOcda().toString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getOcdc() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getOcdc().toString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getWeightCharges() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getWeightCharges().toString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getValuationCharge() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getValuationCharge().toString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getCommissionPercentage() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getCommissionPercentage().toString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getCommissionAmount() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getCommissionAmount().toString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getVatAmount() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getVatAmount().toString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getInvoiceAmount() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getInvoiceAmount().toString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getNetAmount() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getNetAmount().toString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        
        if (this.getSettlementStatus() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getSettlementStatus().getVal()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        return csvString.toString();
    }
	
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
	 
	 
	public String getSettlementStatusString() {
		if(this.getSettlementStatus()!=null)
		{
			this.setSettlementStatusString(this.getSettlementStatus().getVal());
			LMSLogger.info("settlementStatusString : "+settlementStatusString);
		}
		return settlementStatusString;
	}


	public void setSettlementStatusString(String settlementStatusString) {
		this.settlementStatusString = settlementStatusString;
	}


	public String getDocumentArchived() {
		return documentArchived;
	}


	public void setDocumentArchived(String documentArchived) {
		this.documentArchived = documentArchived;
	}
	
}
