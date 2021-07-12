package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ClearingHouseType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.CommercialInvoiceTypes;
import com.unisys.trans.logistics.lms.accounting.dto.constants.GenerateInvoiceType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceGenerationMode;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardInvoiceStatus;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PaymentStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.WeightType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.constants.GSAFrequencyType;
import com.unisys.trans.logistics.lms.framework.constants.GSARevenueType;
import com.unisys.trans.logistics.lms.framework.constants.GSATargetBasedOn;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceFrequencyType;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.logging.LMSLogger;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto;
import com.unisys.trans.logistics.lms.utils.dto.CarrierDto;

/**
 * The Class ParticipantInvoiceSummaryDto.
 */
public class ParticipantInvoiceSummaryDto extends PersistenceObjectDto{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3182601988070342909L;

	/** The o id. */
	private Long oId;
	
	

	private Long billingScheduleOId;
	
	private Long summaryOId;
	
	/** The billing schedule type. */
	private String billingScheduleType;
	
	/** The billing schedule identifier. */
	private String billingScheduleIdentifier;
	
	/** The invoice frequency. */
	private String invoiceFrequency;
	
	/** The billing start date. */
	private Date billingStartDate;
	
	/** The billing end date. */
	private Date billingEndDate;
	
	/** The invoice date. */
	private Date invoiceDate;
	
	/** The billing schedule name. */
	private String billingScheduleName;
	
	/** The billing schedule frequency. */
	private InvoiceFrequencyType billingScheduleFrequency;
		
	

	/** The generate invoice type. */
	private GenerateInvoiceType generateInvoiceType;
	
	/** The participant account number. */
	private String  participantAccountNumber;
	
	
	private String carrierCode;
	
	/** The generate invoice mode. */
	private InvoiceGenerationMode generateInvoiceMode;
	
	/** The invoice number. */
	private String invoiceNumber;
	
	/** The no of aw bs. */
	private BigDecimal noOfAWBs;
	
	/** The no of cc as. */
	private BigDecimal noOfCCAs;
	
	/** The no ofdc ms. */
	private BigDecimal noOFDCMs;
	
	/** The invoice status. */
	private InvoiceStatusType invoiceStatus;
	
	private String invoiceStatusValue;

	/** The file credentials. */
	private String fileCredentials;
	
	/** The billing currency. */
	private String billingCurrency;
	
	/** The ready for finalize. */
	private boolean readyForFinalize;
	
	/** The participant detail dto. */
	private ParticipantDetailDto  participantDetailDto;
	
	private String iataAccountNumber;
	
	 /** The country. */
 	private String country;
 	
 	private CarrierDto carrierDto;
 	
 	private InvoiceParticipantAccountType accountType;
 	
 	private ReceivableType receivableType;
 	
	private String hostCurrencyCode;

	private boolean errFlag;
	
	private String billingStartDateFormatted;
	
	private String billingEndDateFormatted;
	
	private String invoiceDateFormatted;
	
	private Date creationDate; 
	
	//new fields for Participant Invoice Summary
	
	private String generateInvoiceModeString;
	private String receivableTypeString;
	private Boolean sisIndicator;
	private InwardInvoiceStatus inwardInvoiceStatus;
	private String inwardInvoiceStatusString;
	private BigDecimal invoicePaidAmount;	
	private PaymentStatusType invoicePaymentStatus;
	private String invoicePaymentStatusString;
	private Boolean creditInvoice = false;
	private Boolean printIndicator = false;
	private boolean printIndicatorValue = false;
	private InvoiceStatusType invoiceEmailStatus;
	
	private String invoiceEmailStatusValue;
	
	// set new values for outward billing
	
		private String listingCurrency;
		
		private String billingCurrencySIS;
		
		private BigDecimal exchangeRate;
		
		private String settlementMethod;
		
		private BigDecimal settlementMonthPeriod;
		
		private String specificAirline;
		
		private BigDecimal vatPercentage;
		
		private BigDecimal totalFuelSurcharge;
		
		private String paymentDueDays;
		
		private BigDecimal cgst;

		private BigDecimal sgst;

		private BigDecimal igst;
		
		private String invoiceType;
		
		//Rehan Changes start
		private BigDecimal keralaFloodCess;
		
		private CommercialInvoiceTypes participantInvoiceType;
		
		private BigDecimal commercialSurcharge;
			
		public BigDecimal getCommercialSurcharge() {
			if (commercialSurcharge == null)
			{
				commercialSurcharge = new BigDecimal(0);
			}
			return commercialSurcharge;
		}

		public void setCommercialSurcharge(BigDecimal commercialSurcharge) {
			this.commercialSurcharge = commercialSurcharge;
		}

		public BigDecimal getKeralaFloodCess() {
			if (keralaFloodCess == null)
			{
				keralaFloodCess = new BigDecimal(0);
			}
			return keralaFloodCess;
		}
		
		public void setKeralaFloodCess(BigDecimal keralaFloodCess) {
			this.keralaFloodCess = keralaFloodCess;
		}
		//Rehan Changes end
		
		public String getInvoiceType() {
			return invoiceType;
		}
		public void setInvoiceType(String invoiceType) {
			this.invoiceType = invoiceType;
		}
		
	
		public BigDecimal getCgst() {
			if (cgst == null)
			{
				cgst = new BigDecimal(0);
			}
			return cgst;
		}

		public void setCgst(BigDecimal cgst) {
			this.cgst = cgst;
		}

		public BigDecimal getSgst() {
			if (sgst == null)
			{
				sgst = new BigDecimal(0);
			}
			return sgst;
		}

		public void setSgst(BigDecimal sgst) {
			this.sgst = sgst;
		}

		public BigDecimal getIgst() {
			if (igst == null)
			{
				igst = new BigDecimal(0);
			}
			return igst;
		}

		public void setIgst(BigDecimal igst) {
			this.igst = igst;
		}

		private BigDecimal totalSlidingScaleCommission;
	
		private String targetBasedOn;
	
		private String calculatedOn;
	
		private String weightType;
	
		private String unitOfWeight;
	
		private String commissionFrequency;
	
		private BigDecimal ratePerAWB;
	
		private BigDecimal percentage;
		
		private String gsaAgreementName;
		
		private List<Long> gsaOid; 

		// MSD

		

		public List<Long> getGsaOid() {
			return gsaOid;
		}

		public void setGsaOid(List<Long> gsaOid) {
			this.gsaOid = gsaOid;
		}

		public String getGsaAgreementName() {
			return gsaAgreementName;
		}

		public void setGsaAgreementName(String gsaAgreementName) {
			this.gsaAgreementName = gsaAgreementName;
		}

		public BigDecimal getTotalSlidingScaleCommission() {
			return totalSlidingScaleCommission;
		}
	
		public void setTotalSlidingScaleCommission(BigDecimal totalSlidingScaleCommission) {
			this.totalSlidingScaleCommission = totalSlidingScaleCommission;
		}
	
		
		
		public String getTargetBasedOn() {
			return targetBasedOn;
		}

		public void setTargetBasedOn(String targetBasedOn) {
			this.targetBasedOn = targetBasedOn;
		}

		public String getCalculatedOn() {
			return calculatedOn;
		}

		public void setCalculatedOn(String calculatedOn) {
			this.calculatedOn = calculatedOn;
		}

		public String getWeightType() {
			return weightType;
		}

		public void setWeightType(String weightType) {
			this.weightType = weightType;
		}

		public String getUnitOfWeight() {
			return unitOfWeight;
		}

		public void setUnitOfWeight(String unitOfWeight) {
			this.unitOfWeight = unitOfWeight;
		}

		public String getCommissionFrequency() {
			return commissionFrequency;
		}

		public void setCommissionFrequency(String commissionFrequency) {
			this.commissionFrequency = commissionFrequency;
		}

		public BigDecimal getRatePerAWB() {
			return ratePerAWB;
		}
	
		public void setRatePerAWB(BigDecimal ratePerAWB) {
			this.ratePerAWB = ratePerAWB;
		}
	
		public BigDecimal getPercentage() {
			return percentage;
		}
	
		public void setPercentage(BigDecimal percentage) {
			this.percentage = percentage;
		}

    public String getGenerateInvoiceModeString() {
		if(this.getGenerateInvoiceMode() != null)
		{
			generateInvoiceModeString=this.getGenerateInvoiceMode().getType();
		}
		return generateInvoiceModeString;
	}

	public void setGenerateInvoiceModeString(String generateInvoiceModeString) {
		this.generateInvoiceModeString = generateInvoiceModeString;
	}

	public String getReceivableTypeString() {
		if(this.getReceivableType() != null)
		{
			receivableTypeString = this.getReceivableType().getVal();
		}
		return receivableTypeString;
	}

	public void setReceivableTypeString(String receivableTypeString) {
		this.receivableTypeString = receivableTypeString;
	}
    
    public Boolean getSisIndicator() {
		return sisIndicator;
	}

	public void setSisIndicator(Boolean sisIndicator) {
		this.sisIndicator = sisIndicator;
	}

	public InwardInvoiceStatus getInwardInvoiceStatus() {
		return inwardInvoiceStatus;
	}

	public void setInwardInvoiceStatus(InwardInvoiceStatus inwardInvoiceStatus) {
		this.inwardInvoiceStatus = inwardInvoiceStatus;
	}

	public String getInwardInvoiceStatusString() {
		if(this.getInwardInvoiceStatus() != null)
		{
			inwardInvoiceStatusString = this.getInwardInvoiceStatus().getStringValue();
		}
		return inwardInvoiceStatusString;
	}

	public void setInwardInvoiceStatusString(String inwardInvoiceStatusString) {
		this.inwardInvoiceStatusString = inwardInvoiceStatusString;
	}

	public BigDecimal getInvoicePaidAmount() {
		return invoicePaidAmount;
	}

	public void setInvoicePaidAmount(BigDecimal invoicePaidAmount) {
		this.invoicePaidAmount = invoicePaidAmount;
	}

	public PaymentStatusType getInvoicePaymentStatus() {
		return invoicePaymentStatus;
	}

	public void setInvoicePaymentStatus(PaymentStatusType invoicePaymentStatus) {
		this.invoicePaymentStatus = invoicePaymentStatus;
	}

	public String getInvoicePaymentStatusString() {
		if(this.getInvoicePaymentStatus() != null)
		{
			invoicePaymentStatusString = this.getInvoicePaymentStatus().getVal();
		}
		return invoicePaymentStatusString;
	}

	public void setInvoicePaymentStatusString(String invoicePaymentStatusString) {
		this.invoicePaymentStatusString = invoicePaymentStatusString;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public Long getoId() {
		return oId;
	}

	public String getInvoiceStatusValue() {
		if(this.getInvoiceStatus() != null)
		{
			invoiceStatusValue = this.getInvoiceStatus().getType();
		}
		return invoiceStatusValue;
	}

	public void setInvoiceStatusValue(String invoiceStatusValue) {
		this.invoiceStatusValue = invoiceStatusValue;
	}

	/**
	 * @return the errFlag
	 */
	public boolean getErrFlag() {
		return errFlag;
	}

	/**
	 * @param errFlag to set
	 */
	public void setErrFlag(boolean errFlag) {
		this.errFlag = errFlag;
	}

 	private ClearingHouseType clearingHouseType;
	public ReceivableType getReceivableType() {
		return receivableType;
	}

	public void setReceivableType(ReceivableType receivableType) {
		this.receivableType = receivableType;
	}
	
	/**
	 * Gets the billing schedule type.
	 *
	 * @return the billing schedule type
	 */
	public String getBillingScheduleType() {
		return billingScheduleType;
	}
	
	/**
	 * Sets the billing schedule type.
	 *
	 * @param billingScheduleType the new billing schedule type
	 */
	public void setBillingScheduleType(String billingScheduleType) {
		this.billingScheduleType = billingScheduleType;
	}
	
	/**
	 * Gets the billing schedule identifier.
	 *
	 * @return the billing schedule identifier
	 */
	public String getBillingScheduleIdentifier() {
		return billingScheduleIdentifier;
	}
	
	/**
	 * Sets the billing schedule identifier.
	 *
	 * @param billingScheduleIdentifier the new billing schedule identifier
	 */
	public void setBillingScheduleIdentifier(String billingScheduleIdentifier) {
		this.billingScheduleIdentifier = billingScheduleIdentifier;
	}
	
	/**
	 * Gets the invoice frequency.
	 *
	 * @return the invoice frequency
	 */
	public String getInvoiceFrequency() {
		return invoiceFrequency;
	}
	
	/**
	 * Sets the invoice frequency.
	 *
	 * @param invoiceFrequency the new invoice frequency
	 */
	public void setInvoiceFrequency(String invoiceFrequency) {
		this.invoiceFrequency = invoiceFrequency;
	}
	
	/**
	 * Gets the billing start date.
	 *
	 * @return the billing start date
	 */
	public Date getBillingStartDate() {
		return billingStartDate;
	}
	
	
	
	
	public String getBillingStartDateFormatted() {
		
		
		
			String value="";
	    	if(this.getBillingStartDate()!=null)
	    	{
	    		value=DateUtility.convertToGMTDate(this.getBillingStartDate(),FrameworkConstants.DATEFORMAT);
	    	}	
	    	if(value!=null)
	    	{
	    		billingStartDateFormatted=value.toUpperCase();
	    	}
			return billingStartDateFormatted;
		
	}

	public void setBillingStartDateFormatted(String billingStartDateFormatted) {
		this.billingStartDateFormatted = billingStartDateFormatted;
	}

	public String getBillingEndDateFormatted() {
		String value="";
    	if(this.getBillingEndDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getBillingEndDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		billingEndDateFormatted=value.toUpperCase();
    	}
		return billingEndDateFormatted;
	}

	public void setBillingEndDateFormatted(String billingEndDateFormatted) {
		this.billingEndDateFormatted = billingEndDateFormatted;
	}

	public String getInvoiceDateFormatted() {
		
		String value="";
    	if(this.getInvoiceDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getInvoiceDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		invoiceDateFormatted=value.toUpperCase();
    	}
		return invoiceDateFormatted;
	}

	public void setInvoiceDateFormatted(String invoiceDateFormatted) {
		this.invoiceDateFormatted = invoiceDateFormatted;
	}

	public String getFormattedBillingStartDate()
	{
		String date=" ";
		if(this.getBillingStartDate()!=null)
			date= DateUtility.convertToGMTDate(this.getBillingStartDate());
		return date;
	}
	
	public String getFormattedBillingEndDate()
	{
		String date=" ";
		if(this.getBillingEndDate()!=null)
			date= DateUtility.convertToGMTDate(this.getBillingEndDate());
		return date;
	}
	
	public String getFormattedInvoiceDate()
	{
		String date=" ";
		if(this.getInvoiceDate()!=null)
			date= DateUtility.convertToGMTDate(this.getInvoiceDate());
		return date;
	}
	
	/**
	 * Sets the billing start date.
	 *
	 * @param billingStartDate the new billing start date
	 */
	public void setBillingStartDate(Date billingStartDate) {
		this.billingStartDate = billingStartDate;
	}
	
	/**
	 * Gets the billing end date.
	 *
	 * @return the billing end date
	 */
	public Date getBillingEndDate() {
		return billingEndDate;
	}
	
	/**
	 * Sets the billing end date.
	 *
	 * @param billingEndDate the new billing end date
	 */
	public void setBillingEndDate(Date billingEndDate) {
		this.billingEndDate = billingEndDate;
	}
	
	/**
	 * Gets the invoice date.
	 *
	 * @return the invoice date
	 */
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	
	/**
	 * Sets the invoice date.
	 *
	 * @param invoiceDate the new invoice date
	 */
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	
	/**
	 * Gets the billing schedule name.
	 *
	 * @return the billing schedule name
	 */
	public String getBillingScheduleName() {
		return billingScheduleName;
	}
	
	/**
	 * Sets the billing schedule name.
	 *
	 * @param billingScheduleName the new billing schedule name
	 */
	public void setBillingScheduleName(String billingScheduleName) {
		this.billingScheduleName = billingScheduleName;
	}
	
	/**
	 * Gets the generate invoice type.
	 *
	 * @return the generate invoice type
	 */
	public GenerateInvoiceType getGenerateInvoiceType() {
		return generateInvoiceType;
	}
	
	/**
	 * Sets the generate invoice type.
	 *
	 * @param generateInvoiceType the new generate invoice type
	 */
	public void setGenerateInvoiceType(GenerateInvoiceType generateInvoiceType) {
		this.generateInvoiceType = generateInvoiceType;
	}

	
	/**
	 * Gets the generate invoice mode.
	 *
	 * @return the generate invoice mode
	 */
	public InvoiceGenerationMode getGenerateInvoiceMode() {
		return generateInvoiceMode;
	}
	
	/**
	 * Sets the generate invoice mode.
	 *
	 * @param generateInvoiceMode the new generate invoice mode
	 */
	public void setGenerateInvoiceMode(InvoiceGenerationMode generateInvoiceMode) {
		this.generateInvoiceMode = generateInvoiceMode;
	}
	
	/**
	 * Gets the invoice number.
	 *
	 * @return the invoice number
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	
	/**
	 * Sets the invoice number.
	 *
	 * @param invoiceNumber the new invoice number
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	
	/**
	 * Gets the no of aw bs.
	 *
	 * @return the no of aw bs
	 */
	public BigDecimal getNoOfAWBs() {
		if(noOfAWBs==null)
		{
			noOfAWBs=new BigDecimal(0);
		}
		return noOfAWBs;
	}
	
	/**
	 * Sets the no of aw bs.
	 *
	 * @param noOfAWBs the new no of aw bs
	 */
	public void setNoOfAWBs(BigDecimal noOfAWBs) {
		this.noOfAWBs = noOfAWBs;
	}
	
	/**
	 * Gets the no of cc as.
	 *
	 * @return the no of cc as
	 */
	public BigDecimal getNoOfCCAs() {
		if(noOfCCAs==null)
		{
			LMSLogger.info("getNoOfCCAs() resetting no of cca s");
			noOfCCAs = new BigDecimal(0);
		}
		return noOfCCAs;
	}
	
	/**
	 * Sets the no of cc as.
	 *
	 * @param noOfCCAs the new no of cc as
	 */
	public void setNoOfCCAs(BigDecimal noOfCCAs) {
		this.noOfCCAs = noOfCCAs;
	}
	
	/**
	 * Gets the no ofdc ms.
	 *
	 * @return the no ofdc ms
	 */
	public BigDecimal getNoOFDCMs() {
		if(noOFDCMs==null)
		{
			noOFDCMs=new BigDecimal(0);
		}
		return noOFDCMs;
	}
	
	/**
	 * Sets the no ofdc ms.
	 *
	 * @param noOFDCMs the new no ofdc ms
	 */
	public void setNoOFDCMs(BigDecimal noOFDCMs) {
		this.noOFDCMs = noOFDCMs;
	}

	/**
	 * @return the hostCurrencyCode
	 */
	public String getHostCurrencyCode() {
		return hostCurrencyCode;
	}

	/**
	 * @return the clearingHouseType
	 */
	public ClearingHouseType getClearingHouseType() {
		return clearingHouseType;
	}

	/**
	 * @param clearingHouseType the clearingHouseType to set
	 */
	public void setClearingHouseType(ClearingHouseType clearingHouseType) {
		this.clearingHouseType = clearingHouseType;
	}

	/**
	 * @param hostCurrencyCode the hostCurrencyCode to set
	 */
	public void setHostCurrencyCode(String hostCurrencyCode) {
		this.hostCurrencyCode = hostCurrencyCode;
	}

	/**
	 * Gets the file credentials.
	 *
	 * @return the file credentials
	 */
	public String getFileCredentials() {
		return fileCredentials;
	}
	
	/**
	 * Sets the file credentials.
	 *
	 * @param fileCredentials the new file credentials
	 */
	public void setFileCredentials(String fileCredentials) {
		this.fileCredentials = fileCredentials;
	}
	
	/**
	 * Gets the billing currency.
	 *
	 * @return the billing currency
	 */
	public String getBillingCurrency() {
		return billingCurrency;
	}
	
	/**
	 * Checks if is ready for finalize.
	 *
	 * @return true, if is ready for finalize
	 */
	public boolean isReadyForFinalize() {
		return readyForFinalize;
	}
	
	/**
	 * Sets the ready for finalize.
	 *
	 * @param readyForFinalize the new ready for finalize
	 */
	public void setReadyForFinalize(boolean readyForFinalize) {
		this.readyForFinalize = readyForFinalize;
	}
	
	/**
	 * Sets the billing currency.
	 *
	 * @param billingCurrency the new billing currency
	 */
	public void setBillingCurrency(String billingCurrency) {
		this.billingCurrency = billingCurrency;
	}
	
	/* (non-Javadoc)
	 * @see com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#getOId()
	 */
	@Override
	public Long getOId() {
		return oId;
	}
	
	/**
	 * Sets the o id.
	 *
	 * @param oId the new o id
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}
	
	/**
	 * Gets the participant account number.
	 *
	 * @return the participant account number
	 */
	public String getParticipantAccountNumber() {
		return participantAccountNumber;
	}
	
	/**
	 * Sets the participant account number.
	 *
	 * @param participantAccountNumber the new participant account number
	 */
	public void setParticipantAccountNumber(String participantAccountNumber) {
		this.participantAccountNumber = participantAccountNumber;
	}
	
	/**
	 * Gets the invoice status.
	 *
	 * @return the invoice status
	 */
	public InvoiceStatusType getInvoiceStatus() {
		return invoiceStatus;
	}
	
	/**
	 * Sets the invoice status.
	 *
	 * @param invoiceStatus the new invoice status
	 */
	public void setInvoiceStatus(InvoiceStatusType invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}
	
	/**
	 * Gets the participant detail dto.
	 *
	 * @return the participant detail dto
	 */
//	public ParticipantDetailDto getParticipantDetailDto() {
//		return participantDetailDto;
//	}
//	
//	/**
//	 * Sets the participant detail dto.
//	 *
//	 * @param participantDetailDto the new participant detail dto
//	 */
//	public void setParticipantDetailDto(ParticipantDetailDto participantDetailDto) {
//		this.participantDetailDto = participantDetailDto;
//	}
	
	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	
	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	

	public CarrierDto getCarrierDto() {
		return carrierDto;
	}

	public void setCarrierDto(CarrierDto carrierDto) {
		this.carrierDto = carrierDto;
	}
	
	

	public String getIataAccountNumber() {
		return iataAccountNumber;
	}

	public void setIataAccountNumber(String iataAccountNumber) {
		this.iataAccountNumber = iataAccountNumber;
	}
	
	

	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((billingEndDate == null) ? 0 : billingEndDate.hashCode());
		result = prime
				* result
				+ ((billingScheduleIdentifier == null) ? 0
						: billingScheduleIdentifier.hashCode());
		result = prime
				* result
				+ ((billingScheduleName == null) ? 0 : billingScheduleName
						.hashCode());
		result = prime
				* result
				+ ((billingScheduleType == null) ? 0 : billingScheduleType
						.hashCode());
		result = prime
				* result
				+ ((billingStartDate == null) ? 0 : billingStartDate.hashCode());
		result = prime * result
				+ ((invoiceStatus == null) ? 0 : invoiceStatus.hashCode());
		result = prime
				* result
				+ ((participantAccountNumber == null) ? 0
						: participantAccountNumber.hashCode());
		return result;
	}
	
	public ParticipantDetailDto getParticipantDetailDto() {
		return participantDetailDto;
	}

	public void setParticipantDetailDto(ParticipantDetailDto participantDetailDto) {
		this.participantDetailDto = participantDetailDto;
	}
	
	

	public Long getBillingScheduleOId() {
		return billingScheduleOId;
	}

	public void setBillingScheduleOId(Long billingScheduleOId) {
		this.billingScheduleOId = billingScheduleOId;
	}
	
	

	public Long getSummaryOId() {
		return summaryOId;
	}

	public void setSummaryOId(Long summaryOId) {
		this.summaryOId = summaryOId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParticipantInvoiceSummaryDto other = (ParticipantInvoiceSummaryDto) obj;
		if (billingEndDate == null) {
			if (other.billingEndDate != null)
				return false;
		} else if (!billingEndDate.equals(other.billingEndDate))
			return false;
		if (billingScheduleIdentifier == null) {
			if (other.billingScheduleIdentifier != null)
				return false;
		} else if (!billingScheduleIdentifier
				.equals(other.billingScheduleIdentifier))
			return false;
		
		if (billingScheduleType == null) {
			if (other.billingScheduleType != null)
				return false;
		} else if (!billingScheduleType.equals(other.billingScheduleType))
			return false;
		if (billingStartDate == null) {
			if (other.billingStartDate != null)
				return false;
		} else if (!billingStartDate.equals(other.billingStartDate))
			return false;
		if (invoiceStatus != other.invoiceStatus)
			return false;
		//changes start
		if (invoiceType == null) {
			if (other.invoiceType != null)
				return false;
		} else if (!invoiceType.equals(other.invoiceType))
			return false;
		// changes end
		
		//changes started for GSA
		if (gsaAgreementName == null) {
			if (other.gsaAgreementName != null)
				return false;
		} else if (!gsaAgreementName.equals(other.gsaAgreementName))
			return false;
		
		/*if (targetBasedOn == null) {
			if (other.targetBasedOn != null)
				return false;
		} else if (!targetBasedOn.equals(other.targetBasedOn))
			return false;

		if (calculatedOn == null) {
			if (other.calculatedOn != null)
				return false;
		} else if (!calculatedOn.equals(other.calculatedOn))
			return false;

		if (weightType == null) {
			if (other.weightType != null)
				return false;
		} else if (!weightType.equals(other.weightType))
			return false;*/
		
		// changes end
		
		if (participantAccountNumber == null) {
			if (other.participantAccountNumber != null)
				return false;
		} else if (!participantAccountNumber
				.equals(other.participantAccountNumber))
			return false;
		if (creditInvoice == null) {
			if (other.creditInvoice != null)
				return false;
		} else if ((creditInvoice.compareTo(other.creditInvoice)!=0))
			return false;
		
		
		
		return true;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	/**
	 * @return the accountType
	 */
	public InvoiceParticipantAccountType getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(InvoiceParticipantAccountType accountType) {
		this.accountType = accountType;
	}

	public String getListingCurrency() {
		return listingCurrency;
	}

	public void setListingCurrency(String listingCurrency) {
		this.listingCurrency = listingCurrency;
	}

	public String getBillingCurrencySIS() {
		return billingCurrencySIS;
	}

	public void setBillingCurrencySIS(String billingCurrencySIS) {
		this.billingCurrencySIS = billingCurrencySIS;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getSettlementMethod() {
		return settlementMethod;
	}

	public void setSettlementMethod(String settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	public BigDecimal getSettlementMonthPeriod() {
		return settlementMonthPeriod;
	}

	public void setSettlementMonthPeriod(BigDecimal settlementMonthPeriod) {
		this.settlementMonthPeriod = settlementMonthPeriod;
	}

	/**
	 * @return the creditInvoice
	 */
	public Boolean getCreditInvoice() {
		return creditInvoice;
	}

	/**
	 * @param creditInvoice the creditInvoice to set
	 */
	public void setCreditInvoice(Boolean creditInvoice) {
		this.creditInvoice = creditInvoice;
	}

	public InvoiceStatusType getInvoiceEmailStatus() {
		return invoiceEmailStatus;
	}

	public void setInvoiceEmailStatus(InvoiceStatusType invoiceEmailStatus) {
		this.invoiceEmailStatus = invoiceEmailStatus;
	}

	public String getInvoiceEmailStatusValue() {
		if(this.getInvoiceEmailStatus() != null)
		{
			invoiceEmailStatusValue = this.getInvoiceEmailStatus().getType();
		}
		return invoiceEmailStatusValue;
	}

	public void setInvoiceEmailStatusValue(String invoiceEmailStatusValue) {
		this.invoiceEmailStatusValue = invoiceEmailStatusValue;
	}

	/**
	 * @return the printIndicator
	 */
	public Boolean getPrintIndicator() {
		return printIndicator;
	}
	
	/**
	 * @param printIndicator the printIndicator to set
	 */
	public void setPrintIndicator(Boolean printIndicator) {
		this.printIndicator = printIndicator;
	}

	public boolean isPrintIndicatorValue() {
		if(this.getPrintIndicator() != null)
		{
			printIndicatorValue = this.getPrintIndicator().booleanValue();
		}
		return printIndicatorValue;
	}

	public void setPrintIndicatorValue(boolean printIndicatorValue) {
		this.printIndicatorValue = printIndicatorValue;
	}

	/**
	 * @return the specificAirline
	 */
	public String getSpecificAirline() {
		return specificAirline;
	}

	/**
	 * @param specificAirline the specificAirline to set
	 */
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}

	public BigDecimal getVatPercentage() {
		return vatPercentage;
	}

	public void setVatPercentage(BigDecimal vatPercentage) {
		this.vatPercentage = vatPercentage;
	}
	
	public InvoiceFrequencyType getBillingScheduleFrequency() {
		return billingScheduleFrequency;
	}

	public void setBillingScheduleFrequency(
			InvoiceFrequencyType billingScheduleFrequency) {
		this.billingScheduleFrequency = billingScheduleFrequency;
	}
	
	//Getter and Setter for Total Fuel Surcharge field - Contact#11819168
	public BigDecimal getTotalFuelSurcharge() {
		
		if(totalFuelSurcharge == null){
			totalFuelSurcharge = new BigDecimal(0);
		}
		
		
		return totalFuelSurcharge;
	}

	public void setTotalFuelSurcharge(BigDecimal totalFuelSurcharge) {
		this.totalFuelSurcharge = totalFuelSurcharge;
	}
	
	public String getPaymentDueDays() {
		return paymentDueDays;
	}

	public void setPaymentDueDays(String paymentDueDays) {
		this.paymentDueDays = paymentDueDays;
	}
	
	public CommercialInvoiceTypes getParticipantInvoiceType() {
		return participantInvoiceType;
	}

	public void setParticipantInvoiceType(CommercialInvoiceTypes participantInvoiceType) {
		this.participantInvoiceType = participantInvoiceType;
	}
	
}
