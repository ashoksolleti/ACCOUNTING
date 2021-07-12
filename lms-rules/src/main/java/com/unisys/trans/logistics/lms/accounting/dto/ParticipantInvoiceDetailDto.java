/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AWBPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ExportPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InternationalAWBType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ProrationType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RevenueIndicatorType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

// TODO: Auto-generated Javadoc
/**
 * The Class ParticipantInvoiceDetailDto.
 */
public class ParticipantInvoiceDetailDto extends PersistenceObjectDto{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//private static final long serialVersionUID =  -6939620710340010289L;

	/** The o id. */
	private Long oId=0l;

	/** The awb number. */
	private AirWaybillNumberDto awbNumber;
	
	private String awbNumberString;
	
	/** The vat indicator. */
	private Boolean vatIndicator;

	/** The agent code. */
	private String agentCode;
	
	private BigDecimal chargeableWeight;
	
	
	/** The awb modular number check. */
	private String awbModularNumberCheck;
	
	/** The branch office indicator. */
	private Boolean branchOfficeIndicator;
	
	/** The execution date. */
	private Date executionDate;
	
	/** The origin station. */
	private String originStation;
	
	/** The destination station. */
	private String destinationStation;
	
	/** The gross weight. */
	private BigDecimal grossWeight;
	
	/** The weight indicator. */
	private Boolean weightIndicator;
	
	/** The currency code. */
	private String currencyCode;
	
	/** The weight charge. */
	private BigDecimal weightCharge;
	
	/** The date of awb acceptance. */
	private Date dateOfAWBAcceptance;
	
	/** The agent reference data. */
	private String agentReferenceData;
	
	/** The rate of exchange. */
	private BigDecimal rateOfExchange;
	
	/** The Shipper Name. */
	private String shipperName;
	
	
	/** The Consignee Name. */
	private String consigneeName;
	
	 private Date flightDate;
	 
	 private BigDecimal vatAmountActual;

	 private BigDecimal vatAmountBilled;
	    
	 private AWBPaymentType payCodeIndicator;
	 
	 private Integer proratePercentage;
	 
	 private WeightUOMType weightUnit;
	 
	 private String billingCode;

	 private List<AccountingOtherChargesBreakdownDto> accountingOtherchargesBreakDown;
	 
	private List<AccountingVatAmountBreakdownDto> accountingVatAmountBreakdownDtos;
	
	private ExportPaymentType exportPayCode;
	
	private String originCurrency;
	
	private String destinationCurrency;
	
	private Date creationDate;
	 
	private AccountingAirWaybillDto accAirWayBillDto;
	
	private ProrationType prorationType;
	// start
		private String fromAirport;

		private String toAirport;
		
		private String pType;
		

		private String shipmentIndicator;
		
		private BigDecimal proratePercent;
		
		private Date carriageDate; 
		
		private BigDecimal billedWeight;
		
		private WeightUOMType kgLbIndicator;
		
		private String currencyAdjIndicator;
		
		private String rateOfExchangeFormatted;
		
		private BigDecimal vatPercentage;
		
		
	private BigDecimal volumetricWeight;

	private BigDecimal grossRevenue;

	private BigDecimal netFlownRevenue;

	private BigDecimal nettNettFlownRevenue;
	
	private BigDecimal aWbSlidingScaleCommison;
	
	private BigDecimal cgst;
	
	private BigDecimal igst;
	
	private BigDecimal sgst;
	
	private String memoNumber;
	
	private MemoType memosType;
	
	private AccountingOriginalInvoiceDetailDto accountingOriginalInvoiceDetailDto;
	
	private BigDecimal weightChargesDiff;
	
	private BigDecimal valuationChargesDiff;
	
	private BigDecimal governmentTax;
	
	private BigDecimal stateTax;
	
	//Rehan Changes Start
	private BigDecimal keralaFloodCess;
	//Rehan Changes End
	
	private BigDecimal commercialSurcharge;

	private BigDecimal otherChargesDiff;
	
	private BigDecimal iscAmountDiff;
	
	private BigDecimal vatAmountDiff;
	
	private BigDecimal netRejectionAmount;
	
	private BigDecimal TotalProrateAmountDiff;
	
	private BigDecimal totalVatBaseAmountDiff;
	
	private BigDecimal totalVatCalAmountDiff;
	
	private BigDecimal totalVatPercentageDiff;
	
	private String reasoncode;
	
	/** documentNumber */
	private String documentNumber;
	
	/** original documentNumber */
	private String originalDocumentNumber;
	
	/** jrxml */
	private BigDecimal netTaxableValue;
	
	/** jrxml */
	private BigDecimal totalTaxableValue;
	
	/** jrxml */
	private BigDecimal otherChargesDueCarrier;
	
	/** jrxml */
	private BigDecimal cgstRate;
	
	/** jrxml */
	private BigDecimal sgstRate;
	
	/** jrxml */
	private BigDecimal igstRate;
	
	/** jrxml */
	private String city;	

	/** totalAmountOCDC = valutionCharge + Other Charge Due Carrier + FuelSurcharge	
	 * jrxml */
	private BigDecimal totalAmountOCDC;
		
	private ParticipantInvoiceDto participantInvoiceDto;
	
	private Date fromDate;

	private Date toDate;
		
	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public ParticipantInvoiceDto getParticipantInvoiceDto() {
		return participantInvoiceDto;
	}

	public void setParticipantInvoiceDto(ParticipantInvoiceDto participantInvoiceDto) {
		this.participantInvoiceDto = participantInvoiceDto;
	}

	public BigDecimal getTotalAmountOCDC() {
		return totalAmountOCDC;
	}

	public void setTotalAmountOCDC(BigDecimal totalAmountOCDC) {
		this.totalAmountOCDC = totalAmountOCDC;
	}
	
	public BigDecimal getTotalTaxableValue() {
		return totalTaxableValue;
	}

	public void setTotalTaxableValue(BigDecimal totalTaxableValue) {
		this.totalTaxableValue = totalTaxableValue;
	}

	public BigDecimal getOtherChargesDueCarrier() {
		return otherChargesDueCarrier;
	}

	public void setOtherChargesDueCarrier(BigDecimal otherChargesDueCarrier) {
		this.otherChargesDueCarrier = otherChargesDueCarrier;
	}

	public BigDecimal getCgstRate() {
		return cgstRate;
	}

	public void setCgstRate(BigDecimal cgstRate) {
		this.cgstRate = cgstRate;
	}

	public BigDecimal getSgstRate() {
		return sgstRate;
	}

	public void setSgstRate(BigDecimal sgstRate) {
		this.sgstRate = sgstRate;
	}

	public BigDecimal getIgstRate() {
		return igstRate;
	}

	public void setIgstRate(BigDecimal igstRate) {
		this.igstRate = igstRate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public RevenueIndicatorType getRevenueIndicatorType() {
		return revenueIndicatorType;
	}

	public void setRevenueIndicatorType(RevenueIndicatorType revenueIndicatorType) {
		this.revenueIndicatorType = revenueIndicatorType;
	}

	public String getCreditNoteNumber() {
		return creditNoteNumber;
	}

	public void setCreditNoteNumber(String creditNoteNumber) {
		this.creditNoteNumber = creditNoteNumber;
	}

	public String getDebitNoteNumber() {
		return debitNoteNumber;
	}

	public void setDebitNoteNumber(String debitNoteNumber) {
		this.debitNoteNumber = debitNoteNumber;
	}

	public String getNoteType() {
		return noteType;
	}

	public void setNoteType(String noteType) {
		this.noteType = noteType;
	}

	public BigDecimal getTotalNeTtaxvalue() {
		return totalNeTtaxvalue;
	}

	public void setTotalNeTtaxvalue(BigDecimal totalNeTtaxvalue) {
		this.totalNeTtaxvalue = totalNeTtaxvalue;
	}

	public BigDecimal getTotalCgsttaxvalue() {
		return totalCgsttaxvalue;
	}

	public void setTotalCgsttaxvalue(BigDecimal totalCgsttaxvalue) {
		this.totalCgsttaxvalue = totalCgsttaxvalue;
	}

	public BigDecimal getTotalSgsttaxvalue() {
		return totalSgsttaxvalue;
	}

	public void setTotalSgsttaxvalue(BigDecimal totalSgsttaxvalue) {
		this.totalSgsttaxvalue = totalSgsttaxvalue;
	}

	public BigDecimal getTotalIgsttaxvalue() {
		return totalIgsttaxvalue;
	}

	public void setTotalIgsttaxvalue(BigDecimal totalIgsttaxvalue) {
		this.totalIgsttaxvalue = totalIgsttaxvalue;
	}

	public BigDecimal getTotalwithTaxes() {
		return totalwithTaxes;
	}

	public void setTotalwithTaxes(BigDecimal totalwithTaxes) {
		this.totalwithTaxes = totalwithTaxes;
	}

	/** jrxml */
	private String state;
	
	private RevenueIndicatorType revenueIndicatorType;
	
	private String creditNoteNumber;
	
	private String debitNoteNumber;
	
	private String noteType;
	
	private BigDecimal totalNeTtaxvalue;
	
	private BigDecimal totalCgsttaxvalue;
	private BigDecimal totalSgsttaxvalue;
	private BigDecimal totalIgsttaxvalue;
	private BigDecimal totalwithTaxes;
	
	
	public AccountingOriginalInvoiceDetailDto getAccountingOriginalInvoiceDetailDto() {
		return accountingOriginalInvoiceDetailDto;
	}

	public void setAccountingOriginalInvoiceDetailDto(
			AccountingOriginalInvoiceDetailDto accountingOriginalInvoiceDetailDto) {
		this.accountingOriginalInvoiceDetailDto = accountingOriginalInvoiceDetailDto;
	}

	public String getReasoncode() {
		return reasoncode;
	}

	public void setReasoncode(String reasoncode) {
		this.reasoncode = reasoncode;
	}
	
	public BigDecimal getTotalVatPercentageDiff() {
		return totalVatPercentageDiff;
	}

	public void setTotalVatPercentageDiff(BigDecimal totalVatPercentageDiff) {
		this.totalVatPercentageDiff = totalVatPercentageDiff;
	}
	
	public BigDecimal getTotalVatCalAmountDiff() {
		return totalVatCalAmountDiff;
	}

	public void setTotalVatCalAmountDiff(BigDecimal totalVatCalAmountDiff) {
		this.totalVatCalAmountDiff = totalVatCalAmountDiff;
	}
	
	public BigDecimal getTotalVatBaseAmountDiff() {
		return totalVatBaseAmountDiff;
	}

	public void setTotalVatBaseAmountDiff(BigDecimal totalVatBaseAmountDiff) {
		this.totalVatBaseAmountDiff = totalVatBaseAmountDiff;
	}
	
	public BigDecimal getTotalProrateAmountDiff() {
		return TotalProrateAmountDiff;
	}

	public void setTotalProrateAmountDiff(BigDecimal totalProrateAmountDiff) {
		TotalProrateAmountDiff = totalProrateAmountDiff;
	}


	public BigDecimal getNetRejectionAmount() {
		return netRejectionAmount;
	}

	public void setNetRejectionAmount(BigDecimal netRejectionAmount) {
		this.netRejectionAmount = netRejectionAmount;
	}
	
	public BigDecimal getVatAmountDiff() {
		return vatAmountDiff;
	}

	public void setVatAmountDiff(BigDecimal vatAmountDiff) {
		this.vatAmountDiff = vatAmountDiff;
	}
	
	public BigDecimal getIscAmountDiff() {
		return iscAmountDiff;
	}

	public void setIscAmountDiff(BigDecimal iscAmountDiff) {
		this.iscAmountDiff = iscAmountDiff;
	}
	
	private BigDecimal fuelSurcharge= new BigDecimal(0);
	
	public BigDecimal getFuelSurcharge() {
		if(fuelSurcharge==null)
		{
			fuelSurcharge=new BigDecimal(0);
		}
		return fuelSurcharge;
	}

	public void setFuelSurcharge(BigDecimal fuelSurcharge) {
		this.fuelSurcharge = fuelSurcharge;
	}

	public BigDecimal getGovernmentTax(){

		if(governmentTax==null)
		{
			governmentTax=new BigDecimal(0);
		}
		return governmentTax;
	}

	public void setGovernmentTax(BigDecimal governmentTax) {
		this.governmentTax = governmentTax;
	}

	public BigDecimal getStateTax(){

		if(stateTax==null)
		{
			stateTax=new BigDecimal(0);
		}
		return stateTax;
	}

	public void setStateTax(BigDecimal stateTax) {
		this.stateTax = stateTax;
	}
	
	//Rehan Changes Start
	
	public BigDecimal getKeralaFloodCess() {
		if(keralaFloodCess==null)
		{
			keralaFloodCess=new BigDecimal(0);
		}
		return keralaFloodCess;
	}

	public void setKeralaFloodCess(BigDecimal keralaFloodCess) {
		this.keralaFloodCess = keralaFloodCess;
	}
	
	//Rehan Changes End
	
	public BigDecimal getOtherChargesDiff() {
		return otherChargesDiff;
	}

	public void setOtherChargesDiff(BigDecimal otherChargesDiff) {
		this.otherChargesDiff = otherChargesDiff;
	}
	
	public BigDecimal getValuationChargesDiff() {
		return valuationChargesDiff;
	}

	public void setValuationChargesDiff(BigDecimal valuationChargesDiff) {
		this.valuationChargesDiff = valuationChargesDiff;
	}
	
	public BigDecimal getWeightChargesDiff() {
		return weightChargesDiff;
	}

	public void setWeightChargesDiff(BigDecimal weightChargesDiff) {
		this.weightChargesDiff = weightChargesDiff;
	}
	
	public MemoType getMemosType() {
		return memosType;
	}

	public void setMemosType(MemoType memosType) {
		this.memosType = memosType;
	}

	public String getMemoNumber() {
		return memoNumber;
	}

	public void setMemoNumber(String memoNumber) {
		this.memoNumber = memoNumber;
	}

	


	// changes end

	public BigDecimal getCgst() {
		return cgst;
	}

	public BigDecimal getaWbSlidingScaleCommison() {
		return aWbSlidingScaleCommison;
	}

	public void setaWbSlidingScaleCommison(BigDecimal aWbSlidingScaleCommison) {
		this.aWbSlidingScaleCommison = aWbSlidingScaleCommison;
	}

	public void setCgst(BigDecimal cgst) {
		this.cgst = cgst;
	}

	public BigDecimal getIgst() {
		return igst;
	}

	public void setIgst(BigDecimal igst) {
		this.igst = igst;
	}

	public BigDecimal getSgst() {
		return sgst;
	}

	public void setSgst(BigDecimal sgst) {
		this.sgst = sgst;
	}

	public BigDecimal getVolumetricWeight() {
		return volumetricWeight;
	}

	public void setVolumetricWeight(BigDecimal volumetricWeight) {
		this.volumetricWeight = volumetricWeight;
	}

	public BigDecimal getGrossRevenue() {
		return grossRevenue;
	}

	public void setGrossRevenue(BigDecimal grossRevenue) {
		this.grossRevenue = grossRevenue;
	}

	public BigDecimal getNetFlownRevenue() {
		return netFlownRevenue;
	}

	public void setNetFlownRevenue(BigDecimal netFlownRevenue) {
		this.netFlownRevenue = netFlownRevenue;
	}

	public BigDecimal getNettNettFlownRevenue() {
		return nettNettFlownRevenue;
	}

	public void setNettNettFlownRevenue(BigDecimal nettNettFlownRevenue) {
		this.nettNettFlownRevenue = nettNettFlownRevenue;
	}

     // changes end
        
        public String getpType() {
			return pType;
		}
		
		public void setpType(String pType) {
			this.pType = pType;
		}
		
		public String getShipmentIndicator() {
			return shipmentIndicator;
		}

		public void setShipmentIndicator(String shipmentIndicator) {
			this.shipmentIndicator = shipmentIndicator;
		}

		/**
		 * @return the prorationType
		 */
		public ProrationType getProrationType() {
			return prorationType;
		}

		/**
		 * @param prorationType the prorationType to set
		 */
		public void setProrationType(ProrationType prorationType) {
			this.prorationType = prorationType;
		}

		public String getCurrencyAdjIndicator() {
			return currencyAdjIndicator;
		}

		public void setCurrencyAdjIndicator(String currencyAdjIndicator) {
			this.currencyAdjIndicator = currencyAdjIndicator;
		}

		public WeightUOMType getKgLbIndicator() {
			return kgLbIndicator;
		}

		public void setKgLbIndicator(WeightUOMType kgLbIndicator) {
			this.kgLbIndicator = kgLbIndicator;
		}

		private Boolean cCAIndicator;
			

		public String getFromAirport() {
			return fromAirport;
		}

		public void setFromAirport(String fromAirport) {
			this.fromAirport = fromAirport;
		}

		public String getToAirport() {
			return toAirport;
		}

		public void setToAirport(String toAirport) {
			this.toAirport = toAirport;
		}

		public BigDecimal getProratePercent() {
			return proratePercent;
		}

		public void setProratePercent(BigDecimal proratePercent) {
			this.proratePercent = proratePercent;
		}

		public Date getCarriageDate() {
			return carriageDate;
		}

		public void setCarriageDate(Date carriageDate) {
			this.carriageDate = carriageDate;
		}

		public BigDecimal getBilledWeight() {
			return billedWeight;
		}

		public void setBilledWeight(BigDecimal billedWeight) {
			this.billedWeight = billedWeight;
		}

		public Boolean getcCAIndicator() {
			return cCAIndicator;
		}

		public void setcCAIndicator(Boolean cCAIndicator) {
			this.cCAIndicator = cCAIndicator;
		}
		
		//end


	/**
	 * @return the accountingOtherchargesBreakDown
	 */
	public List<AccountingOtherChargesBreakdownDto> getAccountingOtherchargesBreakDown() {
		if(accountingOtherchargesBreakDown==null)
		{
			accountingOtherchargesBreakDown = new ArrayList<AccountingOtherChargesBreakdownDto>();
		}
		return accountingOtherchargesBreakDown;
	}

	/**
	 * @return the vatAmountActual
	 */
	public BigDecimal getVatAmountActual() {
		return vatAmountActual;
	}

	/**
	 * @param vatAmountActual the vatAmountActual to set
	 */
	public void setVatAmountActual(BigDecimal vatAmountActual) {
		this.vatAmountActual = vatAmountActual;
	}

	/**
	 * @return the vatAmountBilled
	 */
	public BigDecimal getVatAmountBilled() {
		if(vatAmountBilled == null)
		{
			vatAmountBilled = new BigDecimal(0);
		}
		return vatAmountBilled;
	}

	/**
	 * @param vatAmountBilled the vatAmountBilled to set
	 */
	public void setVatAmountBilled(BigDecimal vatAmountBilled) {
		this.vatAmountBilled = vatAmountBilled;
	}

	/**
	 * @param accountingOtherchargesBreakDown the accountingOtherchargesBreakDown to set
	 */
	public void setAccountingOtherchargesBreakDown(
			List<AccountingOtherChargesBreakdownDto> accountingOtherchargesBreakDown) {
		this.accountingOtherchargesBreakDown = accountingOtherchargesBreakDown;
	}

	/**
	 * @return the payCodeIndicator
	 */
	public AWBPaymentType getPayCodeIndicator() {
		return payCodeIndicator;
	}

	/**
	 * @param payCodeIndicator the payCodeIndicator to set
	 */
	public void setPayCodeIndicator(AWBPaymentType payCodeIndicator) {
		this.payCodeIndicator = payCodeIndicator;
	}

	/**
      * Attribute to holds <code>flightNumber</code> property.
      */
    
     private String flightNumber;

	
	/** The international awb type. */
	private InternationalAWBType internationalAWBType;
	
	
	private List<ParticipantReceivableDto> participantReceivableDtos;
	//
	private String remarks;
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the participantReceivableDtos
	 */
	public List<ParticipantReceivableDto> getParticipantReceivableDtos() {
		if(participantReceivableDtos==null)
		{
			participantReceivableDtos = new ArrayList<ParticipantReceivableDto>();
		}
		return participantReceivableDtos;
	}

	/**
	 * @param participantReceivableDtos the participantReceivableDtos to set
	 */
	public void setParticipantReceivableDtos(
			List<ParticipantReceivableDto> participantReceivableDtos) {
		this.participantReceivableDtos = participantReceivableDtos;
	}

	private Set<CommercialParticipantInvoiceDCMDto> commercialParticipantInvoiceDCMDto;
	
	
	/* (non-Javadoc)
	 * @see com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#getOId()
	 */
	@Override
	public Long getOId() {
		
		return oId;
	}
	
	/**
	 * Gets the awb number.
	 *
	 * @return the awb number
	 */
	public AirWaybillNumberDto getAwbNumber() {
		return awbNumber;
	}
	
	/**
	 * Sets the awb number.
	 *
	 * @param awbNumber the new awb number
	 */
	public void setAwbNumber(AirWaybillNumberDto awbNumber) {
		this.awbNumber = awbNumber;
	}
	
	
	/**
	 * Checks if is vat indicator.
	 *
	 * @return true, if is vat indicator
	 */
	
	/**
	 * Gets the agent code.
	 *
	 * @return the agent code
	 */
	public String getAgentCode() {
		if(agentCode==null)
		{
			agentCode="";
		}
		return agentCode;
	}
	
	/**
	 * @return the vatIndicator
	 */
	public Boolean getVatIndicator() {
		return vatIndicator;
	}

	/**
	 * @param vatIndicator the vatIndicator to set
	 */
	public void setVatIndicator(Boolean vatIndicator) {
		this.vatIndicator = vatIndicator;
	}

	/**
	 * Sets the agent code.
	 *
	 * @param agentCode the new agent code
	 */
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	
	/**
	 * Gets the awb modular number check.
	 *
	 * @return the awb modular number check
	 */
	public String getAwbModularNumberCheck() {
		return awbModularNumberCheck;
	}
	
	/**
	 * Sets the awb modular number check.
	 *
	 * @param awbModularNumberCheck the new awb modular number check
	 */
	public void setAwbModularNumberCheck(String awbModularNumberCheck) {
		this.awbModularNumberCheck = awbModularNumberCheck;
	}
	
	

	/**
	 * Gets the branch office indicator.
	 *
	 * @return the branch office indicator
	 */
	public Boolean getBranchOfficeIndicator() {
		return branchOfficeIndicator;
	}
	
	/**
	 * @return the chargeableWeight
	 */
	public BigDecimal getChargeableWeight() {
		if(chargeableWeight== null )
		{
			// System.out.println("hi");
			chargeableWeight= new BigDecimal(0);
		}
		return chargeableWeight;
	}

	/**
	 * @param chargeableWeight the chargeableWeight to set
	 */
	public void setChargeableWeight(BigDecimal chargeableWeight) {
		this.chargeableWeight = chargeableWeight;
	}

	/**
	 * Sets the branch office indicator.
	 *
	 * @param branchOfficeIndicator the new branch office indicator
	 */
	public void setBranchOfficeIndicator(Boolean branchOfficeIndicator) {
		this.branchOfficeIndicator = branchOfficeIndicator;
	}
	
	/**
	 * Gets the execution date.
	 *
	 * @return the execution date
	 */
	public Date getExecutionDate() {
		return executionDate;
	}
	
	/**
	 * Sets the execution date.
	 *
	 * @param executionDate the new execution date
	 */
	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}
	
	/**
	 * Gets the origin station.
	 *
	 * @return the origin station
	 */
	public String getOriginStation() {
		return originStation;
	}
	
	/**
	 * @return the proratePercentage
	 */
	public Integer getProratePercentage() {
		return proratePercentage;
	}

	/**
	 * @return the weightUnit
	 */
	public WeightUOMType getWeightUnit() {
		return weightUnit;
	}

	/**
	 * @return the billingCode
	 */
	public String getBillingCode() {
		return billingCode;
	}

	/**
	 * @param proratePercentage the proratePercentage to set
	 */
	public void setProratePercentage(Integer proratePercentage) {
		this.proratePercentage = proratePercentage;
	}

	/**
	 * @param weightUnit the weightUnit to set
	 */
	public void setWeightUnit(WeightUOMType weightUnit) {
		this.weightUnit = weightUnit;
	}

	/**
	 * @param billingCode the billingCode to set
	 */
	public void setBillingCode(String billingCode) {
		this.billingCode = billingCode;
	}

	/**
	 * @return the accountingVatAmountBreakdownDtos
	 */
	public List<AccountingVatAmountBreakdownDto> getAccountingVatAmountBreakdownDtos() {
		if(accountingVatAmountBreakdownDtos==null)
		{
			accountingVatAmountBreakdownDtos = new ArrayList<AccountingVatAmountBreakdownDto>();
		}
		return accountingVatAmountBreakdownDtos;
	}

	/**
	 * @param accountingVatAmountBreakdownDtos the accountingVatAmountBreakdownDtos to set
	 */
	public void setAccountingVatAmountBreakdownDtos(
			List<AccountingVatAmountBreakdownDto> accountingVatAmountBreakdownDtos) {
		this.accountingVatAmountBreakdownDtos = accountingVatAmountBreakdownDtos;
	}

	/**
	 * Sets the origin station.
	 *
	 * @param originStation the new origin station
	 */
	public void setOriginStation(String originStation) {
		this.originStation = originStation;
	}
	
	/**
	 * Gets the destination station.
	 *
	 * @return the destination station
	 */
	public String getDestinationStation() {
		return destinationStation;
	}
	
	/**
	 * Sets the destination station.
	 *
	 * @param destinationStation the new destination station
	 */
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}
	
	/**
	 * Gets the gross weight.
	 *
	 * @return the gross weight
	 */
	public BigDecimal getGrossWeight() {
		if(grossWeight==null)
		{
			grossWeight=new BigDecimal(0);
		}
		return grossWeight;
	}
	
	/**
	 * Sets the gross weight.
	 *
	 * @param grossWeight the new gross weight
	 */
	public void setGrossWeight(BigDecimal grossWeight) {
		this.grossWeight = grossWeight;
	}
	
	/**
	 * Gets the weight indicator.
	 *
	 * @return the weight indicator
	 */
	public Boolean getWeightIndicator() {
		return weightIndicator;
	}
	
	/**
	 * Sets the weight indicator.
	 *
	 * @param weightIndicator the new weight indicator
	 */
	public void setWeightIndicator(Boolean weightIndicator) {
		this.weightIndicator = weightIndicator;
	}
	
	/**
	 * Gets the currency code.
	 *
	 * @return the currency code
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}
	
	/**
	 * Sets the currency code.
	 *
	 * @param currencyCode the new currency code
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	/**
	 * Gets the weight charge.
	 *
	 * @return the weight charge
	 */
	public BigDecimal getWeightCharge() {
		if(weightCharge==null)
		{
			weightCharge=new BigDecimal(0);
		}
		return weightCharge;
	}
	
	/**
	 * Sets the weight charge.
	 *
	 * @param weightCharge the new weight charge
	 */
	public void setWeightCharge(BigDecimal weightCharge) {
		this.weightCharge = weightCharge;
	}
	
	/**
	 * Gets the date of awb acceptance.
	 *
	 * @return the date of awb acceptance
	 */
	public Date getDateOfAWBAcceptance() {
		return dateOfAWBAcceptance;
	}
	
	/**
	 * Sets the date of awb acceptance.
	 *
	 * @param dateOfAWBAcceptance the new date of awb acceptance
	 */
	public void setDateOfAWBAcceptance(Date dateOfAWBAcceptance) {
		this.dateOfAWBAcceptance = dateOfAWBAcceptance;
	}
	
	/**
	 * Gets the agent reference data.
	 *
	 * @return the agent reference data
	 */
	public String getAgentReferenceData() {
		return agentReferenceData;
	}
	
	/**
	 * Sets the agent reference data.
	 *
	 * @param agentReferenceData the new agent reference data
	 */
	public void setAgentReferenceData(String agentReferenceData) {
		this.agentReferenceData = agentReferenceData;
	}
	
	public void setAwbNumberString(String awbNumberString) {
		this.awbNumberString = awbNumberString;
	}

	/**
	 * Gets the rate of exchange.
	 *
	 * @return the rate of exchange
	 */
	public BigDecimal getRateOfExchange() {
		if(rateOfExchange==null)
		{
			rateOfExchange=new BigDecimal(0);
		}
		return rateOfExchange;
	} 
	
	/**
	 * Sets the rate of exchange.
	 *
	 * @param rateOfExchange the new rate of exchange
	 */
	public void setRateOfExchange(BigDecimal rateOfExchange) {
		this.rateOfExchange = rateOfExchange;
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
	 * Gets the international awb type.
	 *
	 * @return the international awb type
	 */
	public InternationalAWBType getInternationalAWBType() {
		return internationalAWBType;
	}
	
	/**
	 * @return the flightDate
	 */
	public Date getFlightDate() {
		return flightDate;
	}

	/**
	 * @param flightDate the flightDate to set
	 */
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * Sets the international awb type.
	 *
	 * @param internationalAWBType the new international awb type
	 */
	public void setInternationalAWBType(InternationalAWBType internationalAWBType) {
		this.internationalAWBType = internationalAWBType;
	}

	public String getAwbNumberString() {
		if(awbNumber!=null)
		{
			awbNumberString=awbNumber.getAirlineCodeNbr()+awbNumber.getShipmentReference();
		}
		return awbNumberString;
	}
	

	/**
	 * @return the commercialParticipantInvoiceDCMDto
	 */
	public Set<CommercialParticipantInvoiceDCMDto> getCommercialParticipantInvoiceDCMDto() {
		if(commercialParticipantInvoiceDCMDto==null)
		{
			commercialParticipantInvoiceDCMDto = new LinkedHashSet<CommercialParticipantInvoiceDCMDto>();
		}
		return commercialParticipantInvoiceDCMDto;
	}

	/**
	 * @return the exportPayCode
	 */
	public ExportPaymentType getExportPayCode() {
		return exportPayCode;
	}

	/**
	 * @param exportPayCode the exportPayCode to set
	 */
	public void setExportPayCode(ExportPaymentType exportPayCode) {
		this.exportPayCode = exportPayCode;
	}

	/**
	 * @return the originCurrency
	 */
	public String getOriginCurrency() {
		return originCurrency;
	}

	/**
	 * @param originCurrency the originCurrency to set
	 */
	public void setOriginCurrency(String originCurrency) {
		this.originCurrency = originCurrency;
	}

	/**
	 * @return the destinationCurrency
	 */
	public String getDestinationCurrency() {
		return destinationCurrency;
	}

	/**
	 * @param destinationCurrency the destinationCurrency to set
	 */
	public void setDestinationCurrency(String destinationCurrency) {
		this.destinationCurrency = destinationCurrency;
	}

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @param commercialParticipantInvoiceDCMDto the commercialParticipantInvoiceDCMDto to set
	 */
	public void setCommercialParticipantInvoiceDCMDto(
			Set<CommercialParticipantInvoiceDCMDto> commercialParticipantInvoiceDCMDto) {
		this.commercialParticipantInvoiceDCMDto = commercialParticipantInvoiceDCMDto;
	}

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}
	
	public String getShipperName() {
		return shipperName;
	}

	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}

	public String getConsigneeName() {
		return consigneeName;
	}

	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}


	public AccountingAirWaybillDto getAccAirWayBillDto() {
		return accAirWayBillDto;
	}

	public void setAccAirWayBillDto(AccountingAirWaybillDto accAirWayBillDto) {
		this.accAirWayBillDto = accAirWayBillDto;
	}

	public String getRateOfExchangeFormatted() {
		if(rateOfExchangeFormatted==null || (rateOfExchangeFormatted!=null && rateOfExchangeFormatted.isEmpty())){
			if(rateOfExchange==null){
				return "";
			}
			else return rateOfExchange.toString();
		}
		else return rateOfExchangeFormatted;
	}

	public void setRateOfExchangeFormatted(String rateOfExchangeFormatted) {
		this.rateOfExchangeFormatted = rateOfExchangeFormatted;
	}

	public BigDecimal getVatPercentage() {
		return vatPercentage;
	}

	public void setVatPercentage(BigDecimal vatPercentage) {
		this.vatPercentage = vatPercentage;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getOriginalDocumentNumber() {
		return originalDocumentNumber;
	}

	public void setOriginalDocumentNumber(String originalDocumentNumber) {
		this.originalDocumentNumber = originalDocumentNumber;
	}

	public BigDecimal getNetTaxableValue() {
		return netTaxableValue;
	}

	public void setNetTaxableValue(BigDecimal netTaxableValue) {
		this.netTaxableValue = netTaxableValue;
	}

	public BigDecimal getCommercialSurcharge() {
		if(commercialSurcharge==null)
		{
			commercialSurcharge=new BigDecimal(0);
		}
		return commercialSurcharge;
	}

	public void setCommercialSurcharge(BigDecimal commercialSurcharge) {
		this.commercialSurcharge = commercialSurcharge;
	}


	
	

}
