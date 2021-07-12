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

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ClearingHouseType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ExportPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardInvoiceStatus;
import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ProrationType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RejectionMemoStageType;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;

/** 
 * 
 * @author KV5
 * 
 */
public class InterlineParticipantInvoiceAWBDto extends ParticipantInvoiceDetailDto {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Double iscAmountActual;
	
	/*private OriginalInvoiceDetailDto originalInvoiceDetailDto;*/
	private BigDecimal otherChargeSum;
	
	public BigDecimal getOtherChargeSum() {
		return otherChargeSum;
	}

	public void setOtherChargeSum(BigDecimal otherChargeSum) {
		this.otherChargeSum = otherChargeSum;
	}

	private BigDecimal iscAmountBilled;
	
	private List memoType;
	
	private String ourReference;
	
	private List rejectionMemoStage;
	
	private Boolean partShipmentIndicator;
	
	private Double weightChargeActual;
	
	private Double valuationChargeActual;
	
	private BigDecimal otherChargesBilled;
	
	private Double otherChargesActual;
	
	private Double awbTotalActual;
	
	private BigDecimal awbTotalBilled;
	
	private String agentReferenceData;
	
	private String airlineOwnUse;
	
	private ExportPaymentType paymentType;
	
	private String billingCarrier;
	
	private UserAuditDto userAudit;
	
	private String references;
	
	private String remarks;
	
	private BigDecimal iscPercentageActual;
	
	private BigDecimal iscPercentageBilled;
	
	private String interlineOrigin;
	private String interlineDestination;
	
	private ProrationType prorationType;
	
	private List<String> listOfreferences;
	
	private Date memoDate;
	
	private String yourInvoiceNumber;
	
	private Long invoiceBillingDate;
	
	private BigDecimal amtSubjToISC;
	
	private Long bmCmMemoOId;
	
	private String partShipmentType;

	private String memoCcaIndiactor;
	
	
	
	private String reasonDescription;
	
	private RejectionMemoStageType rejectionMemostage;
	
	private Date dateOfAwbAcceptance;
	
	
	
	
	private BigDecimal weightChargesBilled;
	
	private BigDecimal valuationChargesBilled;

	private Boolean attachmentIndicator;
	
	Set<AccountingInwardReasonCodeDto> accountingInwardReasonCodeDtos;
	
	private String settlementMethod;
	
	
	public String getSettlementMethod() {
		return settlementMethod;
	}

	public void setSettlementMethod(String settlementMethod) {
		this.settlementMethod = settlementMethod;
	}
	
	public Set<AccountingInwardReasonCodeDto> getAccountingInwardReasonCodeDtos() {
		return accountingInwardReasonCodeDtos;
	}

	public void setAccountingInwardReasonCodeDtos(Set<AccountingInwardReasonCodeDto> accountingInwardReasonCodeDtos) {
		this.accountingInwardReasonCodeDtos = accountingInwardReasonCodeDtos;
	}

	public BigDecimal getWeightChargesBilled() {
		return weightChargesBilled;
	}

	public void setWeightChargesBilled(BigDecimal weightChargesBilled) {
		this.weightChargesBilled = weightChargesBilled;
	}

	public BigDecimal getValuationChargesBilled() {
		return valuationChargesBilled;
	}

	public void setValuationChargesBilled(BigDecimal valuationChargesBilled) {
		this.valuationChargesBilled = valuationChargesBilled;
	}






	public Date getDateOfAwbAcceptance() {
		return dateOfAwbAcceptance;
	}

	public void setDateOfAwbAcceptance(Date dateOfAwbAcceptance) {
		this.dateOfAwbAcceptance = dateOfAwbAcceptance;
	}

	public RejectionMemoStageType getRejectionMemostage() {
		return rejectionMemostage;
	}

	public void setRejectionMemostage(RejectionMemoStageType rejectionMemostage) {
		this.rejectionMemostage = rejectionMemostage;
	}

	public MemoType getMemoIndicatiorType() {
		return memoIndicatiorType;
	}

	public void setMemoIndicatiorType(MemoType memoIndicatiorType) {
		this.memoIndicatiorType = memoIndicatiorType;
	}

	public String getOriginalInvoiceBillingMonth() {
		return originalInvoiceBillingMonth;
	}

	public void setOriginalInvoiceBillingMonth(String originalInvoiceBillingMonth) {
		this.originalInvoiceBillingMonth = originalInvoiceBillingMonth;
	}

	public Integer getOriginalInvoiceBillingPeriod() {
		return originalInvoiceBillingPeriod;
	}

	public void setOriginalInvoiceBillingPeriod(Integer originalInvoiceBillingPeriod) {
		this.originalInvoiceBillingPeriod = originalInvoiceBillingPeriod;
	}

	public Date getOriginalInvoiceDate() {
		return originalInvoiceDate;
	}

	public void setOriginalInvoiceDate(Date originalInvoiceDate) {
		this.originalInvoiceDate = originalInvoiceDate;
	}

	public String getOriginalInvoiceNumber() {
		return originalInvoiceNumber;
	}

	public void setOriginalInvoiceNumber(String originalInvoiceNumber) {
		this.originalInvoiceNumber = originalInvoiceNumber;
	}

	public String getOriginalMemoNumber() {
		return originalMemoNumber;
	}

	public void setOriginalMemoNumber(String originalMemoNumber) {
		this.originalMemoNumber = originalMemoNumber;
	}

	public String getOriginalRejectionNumber() {
		return originalRejectionNumber;
	}

	public void setOriginalRejectionNumber(String originalRejectionNumber) {
		this.originalRejectionNumber = originalRejectionNumber;
	}

	public String getBillingCurrency() {
		return billingCurrency;
	}

	public void setBillingCurrency(String billingCurrency) {
		this.billingCurrency = billingCurrency;
	}

	public String getMemoNumber() {
		return memoNumber;
	}

	public void setMemoNumber(String memoNumber) {
		this.memoNumber = memoNumber;
	}

	public BigDecimal getValuationChargesActual() {
		return valuationChargesActual;
	}

	public void setValuationChargesActual(BigDecimal valuationChargesActual) {
		this.valuationChargesActual = valuationChargesActual;
	}

	public BigDecimal getVatAmountActual() {
		return vatAmountActual;
	}

	public void setVatAmountActual(BigDecimal vatAmountActual) {
		this.vatAmountActual = vatAmountActual;
	}

	public BigDecimal getWeightChargesActual() {
		return weightChargesActual;
	}

	public void setWeightChargesActual(BigDecimal weightChargesActual) {
		this.weightChargesActual = weightChargesActual;
	}

	public BigDecimal getAmountSubToISCActual() {
		return amountSubToISCActual;
	}

	public void setAmountSubToISCActual(BigDecimal amountSubToISCActual) {
		this.amountSubToISCActual = amountSubToISCActual;
	}

	public BigDecimal getIscAmountAccepted() {
		return iscAmountAccepted;
	}

	public void setIscAmountAccepted(BigDecimal iscAmountAccepted) {
		this.iscAmountAccepted = iscAmountAccepted;
	}

	public BigDecimal getIscPercentageAccepted() {
		return iscPercentageAccepted;
	}

	public void setIscPercentageAccepted(BigDecimal iscPercentageAccepted) {
		this.iscPercentageAccepted = iscPercentageAccepted;
	}

	public BigDecimal getOtherChargesAccepted() {
		return otherChargesAccepted;
	}

	public void setOtherChargesAccepted(BigDecimal otherChargesAccepted) {
		this.otherChargesAccepted = otherChargesAccepted;
	}

	public BigDecimal getValuationChargesAccepted() {
		return valuationChargesAccepted;
	}

	public void setValuationChargesAccepted(BigDecimal valuationChargesAccepted) {
		this.valuationChargesAccepted = valuationChargesAccepted;
	}

	public BigDecimal getVatAmountAccepted() {
		return vatAmountAccepted;
	}

	public void setVatAmountAccepted(BigDecimal vatAmountAccepted) {
		this.vatAmountAccepted = vatAmountAccepted;
	}

	public BigDecimal getWeightChargesAccepted() {
		return weightChargesAccepted;
	}

	public void setWeightChargesAccepted(BigDecimal weightChargesAccepted) {
		this.weightChargesAccepted = weightChargesAccepted;
	}

	public BigDecimal getAwbTotalAccepted() {
		return awbTotalAccepted;
	}

	public void setAwbTotalAccepted(BigDecimal awbTotalAccepted) {
		this.awbTotalAccepted = awbTotalAccepted;
	}

	public BigDecimal getAmountSubToISCAccepted() {
		return amountSubToISCAccepted;
	}

	public void setAmountSubToISCAccepted(BigDecimal amountSubToISCAccepted) {
		this.amountSubToISCAccepted = amountSubToISCAccepted;
	}

	public BigDecimal getAwbTotalDiff() {
		return awbTotalDiff;
	}

	public void setAwbTotalDiff(BigDecimal awbTotalDiff) {
		this.awbTotalDiff = awbTotalDiff;
	}

	public BigDecimal getIscPercentageDiff() {
		return iscPercentageDiff;
	}

	public void setIscPercentageDiff(BigDecimal iscPercentageDiff) {
		this.iscPercentageDiff = iscPercentageDiff;
	}

	public BigDecimal getAmountSubToISCDiff() {
		return amountSubToISCDiff;
	}

	public void setAmountSubToISCDiff(BigDecimal amountSubToISCDiff) {
		this.amountSubToISCDiff = amountSubToISCDiff;
	}





	

	public ClearingHouseType getClearingHouseType() {
		return clearingHouseType;
	}

	public void setClearingHouseType(ClearingHouseType clearingHouseType) {
		this.clearingHouseType = clearingHouseType;
	}

	public String getBillingYearMonth() {
		return billingYearMonth;
	}

	public void setBillingYearMonth(String billingYearMonth) {
		this.billingYearMonth = billingYearMonth;
	}

	public Integer getBillingPeriod() {
		return billingPeriod;
	}

	public void setBillingPeriod(Integer billingPeriod) {
		this.billingPeriod = billingPeriod;
	}

	public String getSpecificAirline() {
		return specificAirline;
	}

	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}

	public String getRejectionBillingCarrier() {
		return rejectionBillingCarrier;
	}

	public void setRejectionBillingCarrier(String rejectionBillingCarrier) {
		this.rejectionBillingCarrier = rejectionBillingCarrier;
	}

    private MemoType memoIndicatiorType;
	
    private String originalInvoiceBillingMonth;

    private Integer originalInvoiceBillingPeriod;

    private Date originalInvoiceDate;

    private String originalInvoiceNumber;

    private String originalMemoNumber;

    private String originalRejectionNumber;
	
    private String billingCurrency;
	
	private String airlineOwnuse;
	
	public String getAirlineOwnuse() {
		return airlineOwnuse;
	}

	public void setAirlineOwnuse(String airlineOwnuse) {
		this.airlineOwnuse = airlineOwnuse;
	}

	private String memoNumber;

	private BigDecimal valuationChargesActual;

	private BigDecimal vatAmountActual;

	private BigDecimal weightChargesActual;

	private BigDecimal amountSubToISCActual;

	private BigDecimal iscAmountAccepted;

	private BigDecimal iscPercentageAccepted;

	private BigDecimal otherChargesAccepted;

	private BigDecimal valuationChargesAccepted;

	private BigDecimal vatAmountAccepted;

	private BigDecimal weightChargesAccepted;

	private BigDecimal awbTotalAccepted;

	private BigDecimal amountSubToISCAccepted;

	private BigDecimal awbTotalDiff;

	private BigDecimal iscPercentageDiff;
	
	private BigDecimal amountSubToISCDiff;



	

	
    private ClearingHouseType clearingHouseType;

    private String billingYearMonth;
	
    private Integer billingPeriod;
	
    private String specificAirline;

	private String rejectionBillingCarrier;
	
	private BigDecimal openProvision;
	
	public BigDecimal getOpenProvision() {
		return openProvision;
	}

	public void setOpenProvision(BigDecimal openProvision) {
		this.openProvision = openProvision;
	}
	
	public String getReasonDescription() {
		return reasonDescription;
	}

	public void setReasonDescription(String reasonDescription) {
		this.reasonDescription = reasonDescription;
	}



	public String getPartShipmentType() {
		return partShipmentType;
	}

	public void setPartShipmentType(String partShipmentType) {
		this.partShipmentType = partShipmentType;
	}

	public String getMemoCcaIndiactor() {
		return memoCcaIndiactor;
	}

	public void setMemoCcaIndiactor(String memoCcaIndiactor) {
		this.memoCcaIndiactor = memoCcaIndiactor;
	}
	
	public Long getBmCmMemoOId() {
		return bmCmMemoOId;
	}
	public void setBmCmMemoOId(Long bmCmMemoOId) {
		this.bmCmMemoOId = bmCmMemoOId;
	}

	public BigDecimal getAmtSubjToISC() {
		return amtSubjToISC;
	}

	public void setAmtSubjToISC(BigDecimal amtSubjToISC) {
		this.amtSubjToISC = amtSubjToISC;
	}

	public Long getInvoiceBillingDate() {
		return invoiceBillingDate;
	}

	public void setInvoiceBillingDate(Long invoiceBillingDate) {
		this.invoiceBillingDate = invoiceBillingDate;
	}

	public String getYourInvoiceNumber() {
		return yourInvoiceNumber;
	}

	public void setYourInvoiceNumber(String yourInvoiceNumber) {
		this.yourInvoiceNumber = yourInvoiceNumber;
	}

	public Date getMemoDate() {
		return memoDate;
	}

	public void setMemoDate(Date memoDate) {
		this.memoDate = memoDate;
	}


	public List<String> getListOfreferences() {
		return listOfreferences;
	}

	public void setListOfreferences(List<String> listOfreferences) {
		this.listOfreferences = listOfreferences;
	}

	public ProrationType getProrationType() {
		return prorationType;
	}

	public void setProrationType(ProrationType prorationType) {
		this.prorationType = prorationType;
	}

	private Long prorationFactor;
	
	private InwardInvoiceStatus awbInvoiceStatus;
	
	

		/** The number of pieces */       
	private String pieces;

	public String getCommodityType() {
		return commodityType;
	}

	public void setCommodityType(String commodityType) {
		this.commodityType = commodityType;
	}

	/** The commodity type */
	private String commodityType;
	
	// item tax 177
	
	/*private Set<ProrateLadderBreakdownDto> prorateLadderBreakdown;
	*//** 
	
	 *//*
	private Set<InwardReasonCodeDto> reasonCode;
	*//** 
	
	 *//*
	private Set<OtherChargesBreakdownDto> otherChargesBreakdown;
	*//** 
	
	 *//*
	private Set<VatAmountBreakdownDto> vatAmountBreakdown;
	*//** 
	
	 *//*
	private OriginalInvoiceDetailDto originalInvoiceDetailDto2;
	*//** 
	
	 *//*
	private Set<VatAmountBreakdownDto> vatAmountBreakdownDto;
	*//** 
	
	 *//*
	private Set<OtherChargesBreakdownDto> otherChargesBreakdownDto;
	*//** 
	 
	 *//*
	private Set<InwardReasonCodeDto> inwardReasonCodeDto;
	
	 */
	private Set<AccountingProrateLadderBreakdownDto> prorateLadderBreakdownDto;
	
	/** The participant receivable dto. */
	private ParticipantReceivableDto participantReceivableDto;
	
	private List<OtherChargeSplitDto> otherchargesBreakDown;
	
	private CarrierReceivableDto carrierReceivableDto;
	
	private List<CarrierReceivableDto> carrierReceivableDtos;

	/**
	 * @return the carrierReceivableDto
	 */
	public CarrierReceivableDto getCarrierReceivableDto() {
		return carrierReceivableDto;
	}

	/**
	 * @param carrierReceivableDto the carrierReceivableDto to set
	 */
	public void setCarrierReceivableDto(CarrierReceivableDto carrierReceivableDto) {
		this.carrierReceivableDto = carrierReceivableDto;
	}

	public List<OtherChargeSplitDto> getOtherchargesBreakDown() {
		if(otherchargesBreakDown ==null)
		{
			otherchargesBreakDown = new ArrayList<OtherChargeSplitDto>();
		}
		return otherchargesBreakDown;
	}

	public void setOtherchargesBreakDown(
			List<OtherChargeSplitDto> otherchargesBreakDown) {
		this.otherchargesBreakDown = otherchargesBreakDown;
	}

	public ParticipantReceivableDto getParticipantReceivableDto() {
		return participantReceivableDto;
	}
	public void setParticipantReceivableDto(
			ParticipantReceivableDto participantReceivableDto) {
		this.participantReceivableDto = participantReceivableDto;
	}
	public Double getIscAmountActual() {
		return iscAmountActual;
	}
	public void setIscAmountActual(Double iscAmountActual) {
		this.iscAmountActual = iscAmountActual;
	}
	public BigDecimal getIscAmountBilled() {
		if(iscAmountBilled==null)
		{
			iscAmountBilled=new BigDecimal(0);
		}
		return iscAmountBilled;
	}
	public void setIscAmountBilled(BigDecimal bigDecimal) {
		this.iscAmountBilled = bigDecimal;
	}
	public List getMemoType() {
		return memoType;
	}
	public void setMemoType(List memoType) {
		this.memoType = memoType;
	}
	public String getOurReference() {
		return ourReference;
	}
	public void setOurReference(String ourReference) {
		this.ourReference = ourReference;
	}
	public List getRejectionMemoStage() {
		return rejectionMemoStage;
	}
	public void setRejectionMemoStage(List rejectionMemoStage) {
		this.rejectionMemoStage = rejectionMemoStage;
	}
	public Boolean getPartShipmentIndicator() {
		return partShipmentIndicator;
	}
	public void setPartShipmentIndicator(Boolean partShipmentIndicator) {
		this.partShipmentIndicator = partShipmentIndicator;
	}
	public Double getWeightChargeActual() {
		return weightChargeActual;
	}
	public void setWeightChargeActual(Double weightChargeActual) {
		this.weightChargeActual = weightChargeActual;
	}
	public Double getValuationChargeActual() {
		return valuationChargeActual;
	}
	public void setValuationChargeActual(Double valuationChargeActual) {
		this.valuationChargeActual = valuationChargeActual;
	}
	public BigDecimal getOtherChargesBilled() {
		if(otherChargesBilled==null)
		{
			otherChargesBilled = new BigDecimal(0);
		}
		return otherChargesBilled;
	}
	public void setOtherChargesBilled(BigDecimal otherChargesBilled) {
		this.otherChargesBilled = otherChargesBilled;
	}
	public Double getOtherChargesActual() {
		return otherChargesActual;
	}
	/**
	 * @return the prorationFactor
	 */
	public Long getProrationFactor() {
		return prorationFactor;
	}

	/**
	 * @param prorationFactor the prorationFactor to set
	 */
	public void setProrationFactor(Long prorationFactor) {
		this.prorationFactor = prorationFactor;
	}
        
	

	/**
	 * @return the carrierReceivableDtos
	 */
	public List<CarrierReceivableDto> getCarrierReceivableDtos() {
		if(carrierReceivableDtos==null)
		{
			carrierReceivableDtos = new ArrayList<CarrierReceivableDto>();
		}
		return carrierReceivableDtos;
	}

	/**
	 * @param carrierReceivableDtos the carrierReceivableDtos to set
	 */
	public void setCarrierReceivableDtos(
			List<CarrierReceivableDto> carrierReceivableDtos) {
		this.carrierReceivableDtos = carrierReceivableDtos;
	}

	/**
	 * @return the interlineOrigin
	 */
	public String getInterlineOrigin() {
		return interlineOrigin;
	}

	/**
	 * @param interlineOrigin the interlineOrigin to set
	 */
	public void setInterlineOrigin(String interlineOrigin) {
		this.interlineOrigin = interlineOrigin;
	}

	/**
	 * @return the interlineDestination
	 */
	public String getInterlineDestination() {
		return interlineDestination;
	}

	/**
	 * @param interlineDestination the interlineDestination to set
	 */
	public void setInterlineDestination(String interlineDestination) {
		this.interlineDestination = interlineDestination;
	}

	/**
	 * @return the iscPercentageActual
	 */
	public BigDecimal getIscPercentageActual() {
		return iscPercentageActual;
	}

	/**
	 * @param iscPercentageActual the iscPercentageActual to set
	 */
	public void setIscPercentageActual(BigDecimal iscPercentageActual) {
		this.iscPercentageActual = iscPercentageActual;
	}

	/**
	 * @return the iscPercentageBilled
	 */
	public BigDecimal getIscPercentageBilled() {
		return iscPercentageBilled;
	}

	/**
	 * @param iscPercentageBilled the iscPercentageBilled to set
	 */
	public void setIscPercentageBilled(BigDecimal iscPercentageBilled) {
		this.iscPercentageBilled = iscPercentageBilled;
	}

	public void setOtherChargesActual(Double otherChargesActual) {
		this.otherChargesActual = otherChargesActual;
	}
	
	public Double getAwbTotalActual() {
		return awbTotalActual;
	}
	public void setAwbTotalActual(Double awbTotalActual) {
		this.awbTotalActual = awbTotalActual;
	}
	public String getAgentReferenceData() {
		return agentReferenceData;
	}
	public void setAgentReferenceData(String agentReferenceData) {
		this.agentReferenceData = agentReferenceData;
	}
	public String getAirlineOwnUse() {
		return airlineOwnUse;
	}
	public void setAirlineOwnUse(String airlineOwnUse) {
		this.airlineOwnUse = airlineOwnUse;
	}
	public ExportPaymentType getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(ExportPaymentType paymentType) {
		this.paymentType = paymentType;
	}
	public String getBillingCarrier() {
		return billingCarrier;
	}
	public void setBillingCarrier(String billingCarrier) {
		this.billingCarrier = billingCarrier;
	}
	public UserAuditDto getUserAudit() {
		return userAudit;
	}
	public void setUserAudit(UserAuditDto userAudit) {
		this.userAudit = userAudit;
	}
	public String getReferences() {
		return references;
	}
	public void setReferences(String references) {
		this.references = references;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
	
	
	/** adding new variables. */
	
	
	
	
	
	
	
	/** The valuation charge. */
	private BigDecimal valuationCharge;
	
	/** The other charges due carrier. */
	private BigDecimal otherChargesDueCarrier;
	
	/** The other charges due agent. */
	private BigDecimal otherChargesDueAgent;
	
	/** The commission percentage. */
	private BigDecimal commissionPercentage;
	
	/** The commission amount. */
	private BigDecimal commissionAmount;
	
	/** The tds percentage. */
	private BigDecimal tdsPercentage;

	/** The tds amount. */
	private BigDecimal tdsAmount;
	
	/** The commission indicator. */
	private boolean commissionIndicator;
	
	/** The discount amount. */
	private BigDecimal discountAmount;
	
	
	/** The tax due airline. */
	private BigDecimal taxDueAirline;
	
	/** The tax due agent. */
	private BigDecimal taxDueAgent;
	
	/** The tax due airline indicator. */
	private boolean taxDueAirlineIndicator;
	
	/** The discount indicator. */
	private boolean discountIndicator;

	private BigDecimal  netAmountBeforeTax;
	private BigDecimal  netAmountPayable;
	
	
	/**
	 * Gets the valuation charge.
	 *
	 * @return the valuation charge
	 */
	public BigDecimal getValuationCharge() {
		if(valuationCharge==null)
		{
			valuationCharge=new BigDecimal(0);
		}
		return valuationCharge;
	}

	/**
	 * Sets the valuation charge.
	 *
	 * @param valuationCharge the new valuation charge
	 */
	public void setValuationCharge(BigDecimal valuationCharge) {
		this.valuationCharge = valuationCharge;
	}

	/**
	 * Gets the other charges due carrier.
	 *
	 * @return the other charges due carrier
	 */
	public BigDecimal getOtherChargesDueCarrier() {
		if(otherChargesDueCarrier==null)
		{
			otherChargesDueCarrier=new BigDecimal(0);
		}
		return otherChargesDueCarrier;
	}

	/**
	 * Sets the other charges due carrier.
	 *
	 * @param otherChargesDueCarrier the new other charges due carrier
	 */
	public void setOtherChargesDueCarrier(BigDecimal otherChargesDueCarrier) {
		this.otherChargesDueCarrier = otherChargesDueCarrier;
	}

	/**
	 * Gets the other charges due agent.
	 *
	 * @return the other charges due agent
	 */
	public BigDecimal getOtherChargesDueAgent() {
		
		if(otherChargesDueAgent==null)
		{
			otherChargesDueAgent=new BigDecimal(0);
		}
		return otherChargesDueAgent;
	}

	/**
	 * Sets the other charges due agent.
	 *
	 * @param otherChargesDueAgent the new other charges due agent
	 */
	public void setOtherChargesDueAgent(BigDecimal otherChargesDueAgent) {
		this.otherChargesDueAgent = otherChargesDueAgent;
	}

	/**
	 * Gets the commission percentage.
	 *
	 * @return the commission percentage
	 */
	public BigDecimal getCommissionPercentage() {
		if(commissionPercentage==null)
		{
			commissionPercentage=new BigDecimal(0);
		}
		return commissionPercentage;
	}

	/**
	 * Sets the commission percentage.
	 *
	 * @param commissionPercentage the new commission percentage
	 */
	public void setCommissionPercentage(BigDecimal commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}

	/**
	 * Gets the commission amount.
	 *
	 * @return the commission amount
	 */
	public BigDecimal getCommissionAmount() {
		if(commissionAmount==null)
		{
			commissionAmount=new BigDecimal(0);
		}
		return commissionAmount;
	}
	
	/**
	 * Sets the commission amount.
	 *
	 * @param commissionAmount the new commission amount
	 */
	public void setCommissionAmount(BigDecimal commissionAmount) {
		this.commissionAmount = commissionAmount;
	}
	
	public BigDecimal getTdsPercentage() {
		if(tdsPercentage==null)
		{
			tdsPercentage=new BigDecimal(0);
		}
		return tdsPercentage;
	}

	public void setTdsPercentage(BigDecimal tdsPercentage) {
		this.tdsPercentage = tdsPercentage;
	}

	public BigDecimal getTdsAmount() {
		if(tdsAmount==null)
		{
			tdsAmount=new BigDecimal(0);
		}
		return tdsAmount;
	}

	public void setTdsAmount(BigDecimal tdsAmount) {
		this.tdsAmount = tdsAmount;
	}

	/**
	 * Gets the commission indicator.
	 *
	 * @return the commission indicator
	 */
	public boolean getCommissionIndicator() {
		return commissionIndicator;
	}

	/**
	 * Sets the commission indicator.
	 *
	 * @param commissionIndicator the new commission indicator
	 */
	public void setCommissionIndicator(boolean commissionIndicator) {
		this.commissionIndicator = commissionIndicator;
	}

	/**
	 * Gets the discount amount.
	 *
	 * @return the discount amount
	 */
	public BigDecimal getDiscountAmount() {
		if(discountAmount==null)
		{
			discountAmount=new BigDecimal(0);
		}
		return discountAmount;
	}

	/**
	 * Sets the discount amount.
	 *
	 * @param discountAmount the new discount amount
	 */
	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	/**
	 * Gets the tax due airline.
	 *
	 * @return the tax due airline
	 */
	public BigDecimal getTaxDueAirline() {
		if(taxDueAirline==null)
		{
			taxDueAirline=new BigDecimal(0);
		}
		return taxDueAirline;
	}

	/**
	 * Sets the tax due airline.
	 *
	 * @param taxDueAirline the new tax due airline
	 */
	public void setTaxDueAirline(BigDecimal taxDueAirline) {
		this.taxDueAirline = taxDueAirline;
	}

	//item number 177

	/**
	 * Gets the tax due agent.
	 *
	 * @return the tax due agent
	 */
	public BigDecimal getTaxDueAgent() {
		if(taxDueAgent==null)
		{
			taxDueAgent=new BigDecimal(0);
		}
		return taxDueAgent;
	}

	/**
	 * Sets the tax due agent.
	 *
	 * @param taxDueAgent the new tax due agent
	 */
	public void setTaxDueAgent(BigDecimal taxDueAgent) {
		this.taxDueAgent = taxDueAgent;
	}

	/**
	 * Gets the tax due airline indicator.
	 *
	 * @return the tax due airline indicator
	 */
	public boolean getTaxDueAirlineIndicator() {
		return taxDueAirlineIndicator;
	}

	/**
	 * Sets the tax due airline indicator.
	 *
	 * @param taxDueAirlineIndicator the new tax due airline indicator
	 */
	public void setTaxDueAirlineIndicator(boolean taxDueAirlineIndicator) {
		this.taxDueAirlineIndicator = taxDueAirlineIndicator;
	}

	/**
	 * Gets the discount indicator.
	 *
	 * @return the discount indicator
	 */
	public boolean getDiscountIndicator() {
		return discountIndicator;
	}

	/**
	 * Sets the discount indicator.
	 *
	 * @param discountIndicator the new discount indicator
	 */
	public void setDiscountIndicator(boolean discountIndicator) {
		this.discountIndicator = discountIndicator;
	}

	public Boolean getAttachmentIndicator() {
		return attachmentIndicator;
	}

	public void setAttachmentIndicator(Boolean attachmentIndicator) {
		this.attachmentIndicator = attachmentIndicator;
	}

	public BigDecimal getNetAmountBeforeTax() {
		
	    //For BM and CM the net amount before tax is calculated while creation of the object. Refer LMSC-6486
	    if(this.getMemosType() == MemoType.BM || this.getMemosType() == MemoType.CM )
	        return this.netAmountBeforeTax;
		
	    netAmountBeforeTax=new BigDecimal(0); 
		//System.out.println("in net tax1");
		netAmountBeforeTax=netAmountBeforeTax.add(getWeightCharge());
		netAmountBeforeTax=netAmountBeforeTax.add(getValuationCharge());
		netAmountBeforeTax=netAmountBeforeTax.add(getOtherChargesDueCarrier());
		netAmountBeforeTax=netAmountBeforeTax.add(getFuelSurcharge());
	   
	   netAmountBeforeTax=netAmountBeforeTax.subtract(getCommissionAmount());
	   netAmountBeforeTax=netAmountBeforeTax.add(getTdsAmount());
	   //netAmountBeforeTax=netAmountBeforeTax.subtract(getOtherChargesDueAgent());
	   //As per the proration manual, OCDA should be added
	   netAmountBeforeTax=netAmountBeforeTax.add(getOtherChargesDueAgent());
	   netAmountBeforeTax=netAmountBeforeTax.add(getIscAmountBilled());
	   //System.out.println("in net tax1");   
		return netAmountBeforeTax;
	}
	public void setNetAmountBeforeTax(BigDecimal netAmountBeforeTax) {
		this.netAmountBeforeTax = netAmountBeforeTax;
	}
	public BigDecimal getNetAmountPayable() {
		
		if(netAmountPayable==null){
			netAmountPayable=new BigDecimal(0);
			netAmountPayable=netAmountPayable.add(getNetAmountBeforeTax());
			netAmountPayable=netAmountPayable.add(getTaxDueAirline());
			netAmountPayable=netAmountPayable.subtract(getTaxDueAgent());
			return netAmountPayable;
		}
		
		else return netAmountPayable;
	}
	public void setNetAmountPayable(BigDecimal netAmountPayable) {
		this.netAmountPayable = netAmountPayable;
	}

	public Set<AccountingProrateLadderBreakdownDto> getProrateLadderBreakdownDto() {
		if(prorateLadderBreakdownDto== null)
		{
			prorateLadderBreakdownDto= new LinkedHashSet<AccountingProrateLadderBreakdownDto>();
		}
		
		return prorateLadderBreakdownDto;
	}

	public void setProrateLadderBreakdownDto(
			Set<AccountingProrateLadderBreakdownDto> prorateLadderBreakdownDto) {
		this.prorateLadderBreakdownDto = prorateLadderBreakdownDto;
	}

	public String getPieces() {
		return pieces;
	}

	public void setPieces(String pieces) {
		this.pieces = pieces;
	}

	public BigDecimal getAwbTotalBilled() {
		if(awbTotalBilled==null)
		{
			awbTotalBilled=new BigDecimal(0);
		}
		return awbTotalBilled;
	}

	public void setAwbTotalBilled(BigDecimal awbTotalBilled) {
		this.awbTotalBilled = awbTotalBilled;
	}

	public InwardInvoiceStatus getAwbInvoiceStatus() {
		return awbInvoiceStatus;
	}

	public void setAwbInvoiceStatus(InwardInvoiceStatus awbInvoiceStatus) {
		this.awbInvoiceStatus = awbInvoiceStatus;
	}
	
	

}

