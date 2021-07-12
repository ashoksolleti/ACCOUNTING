package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AWBPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InternationalAWBType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardInvoiceStatus;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardQueueType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ProrationType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RejectionMemoStageType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RejectionMemoStatus;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * The persistent class for the ACC_INVOICE_AWB database table.
 * 
 */
public class AccountingInvoiceAWBDto extends PersistenceObjectDto {
	private static final long serialVersionUID = 1L;

	private AccountingInvoiceDetailDto accInvoiceDetail;

	private Set<AccountingInwardReasonCodeDto> accInwardReasonCodes;

	private AccountingOriginalInvoiceDetailDto accOriginalInvoiceDetail;

	private Set<AccountingOtherChargesBreakdownDto> accOtherChargesBreakdowns;

	private Set<AccountingProrateLadderBreakdownDto> accProrateLadderBreakdowns;

	private Set<AccountingVatAmountBreakdownDto> accVatAmountBreakdowns;

	private AccountingAirWaybillDto accAirWayBillDto;

	/**
	 * Attribute to hold <code>actionType</code> property.
	 */
	private ActionType actionType;

	/**
	 * Attribute to hold <code>actualDataLine</code> property.
	 */
	private String actualDataLine;

	private BigDecimal agentCode;

	private String agentReferenceData;

	private String airlineOwnuse;

	private BigDecimal airWaybillPaidAmount;

	private String airWaybillPaymentStatus;

	private InwardInvoiceStatus awbInvoiceStatus;

	private ReceivableStatusType receivableStatusType;

	private String awbModularNumberCheck;

	private AirWaybillNumberDto awbNumber;

	/**
	 * Attribute to hold <code>anAWBNumber</code> property.
	 */
	private String aWBNumberDisplay;

	private BigDecimal awbTotalActual;

	private BigDecimal awbTotalBilled;

	private BigDecimal awbTotalDiff;

	private String branchOfficeIndicator;

	private BigDecimal commissionAmount;

	private String commissionIndicator;

	private BigDecimal commissionpercentage;

	private String currencyCode;

	private Date dateOfAwbAcceptance;

	private String destinationStation;

	private BigDecimal discountAmount;

	private String discountIndicator;

	/**
	 * Attribute to hold <code>error</code> property.
	 */
	private boolean error;

	private String errorMessage;

	private Date executionDate;

	private String fromStation;

	private BigDecimal grossWeight;

	private InternationalAWBType internationalAWBType;

	/** Attribute to hold <code>inwardReasonCodeDtos</code> property. */
	private List<AccountingInwardReasonCodeDto> inwardReasonCodeDtos;

	private BigDecimal iscAmountActual;

	private BigDecimal iscAmountBilled;

	private BigDecimal iscAmountDiff;

	private BigDecimal iscPercentageActual;

	private BigDecimal iscPercentageBilled;

	private BigDecimal iscPercentageDiff;

	private BigDecimal amountSubToISCActual;

	private BigDecimal amountSubToISCBilled;

	private BigDecimal amountSubToISCAccepted;

	private BigDecimal amountSubToISCDiff;
	
	private BigDecimal fuelSurcharge;
	
	private BigDecimal governamentTax;
	
	private BigDecimal stateTax;
	
	private Long invoiceBillingDate;
	
	private boolean awbBreakdownInd = false;
	
	private String pType;

	/**
	 * Attribute to hold <code>TDS</code> property.
	 */
	private BigDecimal tdsAmount;
	
	private String settlementMethod;
	
	
	public String getSettlementMethod() {
		return settlementMethod;
	}

	public void setSettlementMethod(String settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	public BigDecimal getTdsAmount() {
		return tdsAmount;
	}

	public void setTdsAmount(BigDecimal tdsAmount) {
		this.tdsAmount = tdsAmount;
	}

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	public Long getInvoiceBillingDate() {
		return invoiceBillingDate;
	}

	public void setInvoiceBillingDate(Long invoiceBillingDate) {
		this.invoiceBillingDate = invoiceBillingDate;
	}
	private String documentNumber; 
	
	private Long gstr1ReturnOid;

	

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

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

	public BigDecimal getGovernamentTax() {
		if(governamentTax==null)
		{
			governamentTax=new BigDecimal(0);
		}
		return governamentTax;
	}

	public void setGovernamentTax(BigDecimal governamentTax) {
		this.governamentTax = governamentTax;
	}

	public BigDecimal getStateTax() {
		if(stateTax==null)
		{
			stateTax=new BigDecimal(0);
		}
		return stateTax;
	}

	public void setStateTax(BigDecimal stateTax) {
		this.stateTax = stateTax;
	}

	// NAC
	private String specificAirline;

	public BigDecimal getAmountSubToISCActual() {
		return amountSubToISCActual;
	}

	public void setAmountSubToISCActual(BigDecimal amountSubToISCActual) {
		this.amountSubToISCActual = amountSubToISCActual;
	}

	public BigDecimal getAmountSubToISCBilled() {
		return amountSubToISCBilled;
	}

	public void setAmountSubToISCBilled(BigDecimal amountSubToISCBilled) {
		this.amountSubToISCBilled = amountSubToISCBilled;
	}

	public BigDecimal getAmountSubToISCAccepted() {
		return amountSubToISCAccepted;
	}

	public void setAmountSubToISCAccepted(BigDecimal amountSubToISCAccepted) {
		this.amountSubToISCAccepted = amountSubToISCAccepted;
	}

	/**
	 * @return the amountSubToISCDiff
	 */
	public BigDecimal getAmountSubToISCDiff() {
		return amountSubToISCDiff;
	}

	/**
	 * @param amountSubToISCDiff
	 *            the amountSubToISCDiff to set
	 */
	public void setAmountSubToISCDiff(BigDecimal amountSubToISCDiff) {
		this.amountSubToISCDiff = amountSubToISCDiff;
	}

	private String memoNumber;

	private MemoType memoType;

	private BigDecimal netAmountBeforeTax;

	private BigDecimal netAmountPayable;

	/**
	 * Attribute to hold <code>referenceDisplay</code> property.
	 */
	private BigDecimal netRejectionAmount;

	private Long oId;

	private String originStation;

	private BigDecimal otherChargesActual;

	private BigDecimal otherChargesBilled;

	/** Attribute to hold <code>otherChargesBreakdownDtos</code> property. */
	private List<AccountingOtherChargesBreakdownDto> otherChargesBreakdownDtos;

	private BigDecimal otherChargesDiff;

	private BigDecimal otherChargesDueAgent;

	private BigDecimal otherChargesDueCarrier;

	private String ourReference;

	private Boolean partShipmentIndicator;

	private AWBPaymentType paymentType;

	/** Attribute to hold <code>prorateLadderDtos</code> property. */
	private List<AccountingProrateLadderBreakdownDto> prorateLadderDtos;

	private ProrationType prorationType;

	private InwardQueueType queueType;

	private BigDecimal rateOfExchange;

	private String reasoncode;

	/**
	 * Attribute to hold <code>reasonDisplay</code> property.
	 */
	private String reasonDisplay;

	/**
	 * Attribute to hold <code>referenceDisplay</code> property.
	 */
	private String referenceDisplay;

	private List<String> references;

	private RejectionMemoStageType rejectionMemostage;

	private RejectionMemoStatus rejectionMemostatus;

	private Date memoDate;

	public RejectionMemoStatus getRejectionMemostatus() {
		return rejectionMemostatus;
	}

	public void setRejectionMemostatus(RejectionMemoStatus rejectionMemostatus) {
		this.rejectionMemostatus = rejectionMemostatus;
	}

	/**
	 * Attribute to hold <code>remarkDisplay</code> property.
	 */
	private String remarkDisplay;

	private List<String> remarks;

	private String sectorDest;

	private String sectorDestination;

	private String sectorOrig;

	private String sectorOrigin;

	private BigDecimal taxDueAgent;

	private BigDecimal taxDueAirline;

	private String taxDueAirlineIndicator;

	private String toStation;

	private BigDecimal totalProrateAmountDiff;

	private BigDecimal totalVatBaseAmountDiff;

	private BigDecimal totalVatCalAmountDiff;

	private BigDecimal totalVatPercentageDiff;

	private UserAuditDto userAudit;

	private BigDecimal valuationChargesActual;

	private BigDecimal valuationChargesBilled;

	private BigDecimal valuationChargesDiff;

	private BigDecimal vatAmountActual;

	private BigDecimal vatAmountBilled;

	/** Attribute to hold <code>vatAmountBreakdownDtos</code> property. */
	private List<AccountingVatAmountBreakdownDto> vatAmountBreakdownDtos;

	private BigDecimal vatAmountDiff;

	private BigDecimal vatIndicator;

	private BigDecimal weightChargesActual;

	private BigDecimal weightChargesBilled;

	private BigDecimal weightChargesDiff;

	private String weightIndicator;

	private Date flightDate;

	private Date carriageDate;

	private boolean updatableOutwardMemo = true;

	private String memoFillingReference;

	private boolean memoCCAIndicator;

	private byte[] inwardAttachment;

	private Boolean ccaIndicator;

	private String inwardFillingReference;

	private BigDecimal amtSubjToISC;

	private WeightUOMType weightUnit;

	private String currAdjIndicator;

	private BigDecimal iscAmountAccepted;

	private BigDecimal iscPercentageAccepted;

	private BigDecimal otherChargesAccepted;

	private BigDecimal valuationChargesAccepted;

	private BigDecimal vatAmountAccepted;

	private BigDecimal weightChargesAccepted;

	private BigDecimal awbTotalAccepted;
	
	private BigDecimal billedWeight;
	
	private Integer proratePercentage;
	
	private BigDecimal openProvision;
	
	public BigDecimal getOpenProvision() {
		return openProvision;
	}

	public void setOpenProvision(BigDecimal openProvision) {
		this.openProvision = openProvision;
	}

	public Integer getProratePercentage() {
		return proratePercentage;
	}

	public void setProratePercentage(Integer proratePercentage) {
		this.proratePercentage = proratePercentage;
	}

	public BigDecimal getBilledWeight() {
		return billedWeight;
	}

	public void setBilledWeight(BigDecimal billedWeight) {
		this.billedWeight = billedWeight;
	}

	public AccountingInvoiceAWBDto() {
	}

	public AccountingInvoiceDetailDto getAccInvoiceDetail() {
		return this.accInvoiceDetail;
	}

	public Set<AccountingInwardReasonCodeDto> getAccInwardReasonCodes() {
		return this.accInwardReasonCodes;
	}

	public AccountingOriginalInvoiceDetailDto getAccOriginalInvoiceDetail() {
		if (this.accOriginalInvoiceDetail == null) {
			this.accOriginalInvoiceDetail = new AccountingOriginalInvoiceDetailDto();
		}
		return this.accOriginalInvoiceDetail;
	}

	public Set<AccountingOtherChargesBreakdownDto> getAccOtherChargesBreakdowns() {
		return this.accOtherChargesBreakdowns;
	}

	public Set<AccountingProrateLadderBreakdownDto> getAccProrateLadderBreakdowns() {
		return this.accProrateLadderBreakdowns;
	}

	public Set<AccountingVatAmountBreakdownDto> getAccVatAmountBreakdowns() {
		return this.accVatAmountBreakdowns;
	}

	public ActionType getActionType() {
		return this.actionType;
	}

	public AccountingAirWaybillDto getAccAirWayBillDto() {
		return this.accAirWayBillDto;
	}

	public String getActualDataLine() {
		return this.actualDataLine;
	}

	public BigDecimal getAgentCode() {
		return this.agentCode;
	}

	public String getAgentReferenceData() {
		return this.agentReferenceData;
	}

	public String getAirlineOwnuse() {
		return this.airlineOwnuse;
	}

	public BigDecimal getAirWaybillPaidAmount() {
		return airWaybillPaidAmount;
	}

	public String getAirWaybillPaymentStatus() {
		return this.airWaybillPaymentStatus;
	}

	/**
	 * @return the awbInvoiceStatus
	 */
	public InwardInvoiceStatus getAwbInvoiceStatus() {
		return this.awbInvoiceStatus;
	}

	public String getAwbModularNumberCheck() {
		return this.awbModularNumberCheck;
	}

	public AirWaybillNumberDto getAwbNumber() {
		return this.awbNumber;
	}

	/**
	 * @return the aWBNumberDisplay
	 */
	public String getAWBNumberDisplay() {
		return this.aWBNumberDisplay;
	}

	public BigDecimal getAwbTotalActual() {
		return this.awbTotalActual;
	}

	public BigDecimal getAwbTotalBilled() {
		return this.awbTotalBilled;
	}

	/**
	 * @return the awbTotalDiff
	 */
	public BigDecimal getAwbTotalDiff() {
		return this.awbTotalDiff;
	}

	public String getBranchOfficeIndicator() {
		return this.branchOfficeIndicator;
	}

	public BigDecimal getCommissionAmount() {
		return this.commissionAmount;
	}

	public String getCommissionIndicator() {
		return this.commissionIndicator;
	}

	public BigDecimal getCommissionpercentage() {
		return this.commissionpercentage;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public Date getDateOfAwbAcceptance() {
		return this.dateOfAwbAcceptance;
	}

	public String getDestinationStation() {
		return this.destinationStation;
	}

	public BigDecimal getDiscountAmount() {
		return this.discountAmount;
	}

	public String getDiscountIndicator() {
		return this.discountIndicator;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return this.errorMessage;
	}

	public Date getExecutionDate() {
		return this.executionDate;
	}

	/**
	 * @return the fromStation
	 */
	public String getFromStation() {
		return this.fromStation;
	}

	public BigDecimal getGrossWeight() {
		if(grossWeight==null)
		{
			grossWeight=new BigDecimal(0);
		}
		return this.grossWeight;
	}

	/**
	 * @return the internationalAWBType
	 */
	public InternationalAWBType getInternationalAWBType() {
		return this.internationalAWBType;
	}

	public List<AccountingInwardReasonCodeDto> getInwardReasonCodeDtos() {
		if (inwardReasonCodeDtos == null) {
			inwardReasonCodeDtos = new ArrayList<AccountingInwardReasonCodeDto>();
		}
		return this.inwardReasonCodeDtos;
	}

	public BigDecimal getIscAmountActual() {
		return this.iscAmountActual;
	}

	public BigDecimal getIscAmountBilled() {
		return this.iscAmountBilled;
	}

	/**
	 * @return the iscAmountDiff
	 */
	public BigDecimal getIscAmountDiff() {
		return this.iscAmountDiff;
	}

	public BigDecimal getIscPercentageActual() {
		return this.iscPercentageActual;
	}

	public BigDecimal getIscPercentageBilled() {
		return this.iscPercentageBilled;
	}

	/**
	 * @return the iscPercentageDiff
	 */
	public BigDecimal getIscPercentageDiff() {
		return this.iscPercentageDiff;
	}

	public String getMemoNumber() {
		return this.memoNumber;
	}

	public MemoType getMemoType() {
		return this.memoType;
	}

	public BigDecimal getNetAmountBeforeTax() {
		return this.netAmountBeforeTax;
	}

	public BigDecimal getNetAmountPayable() {
		if (netAmountPayable == null) {
			netAmountPayable = new BigDecimal(0);
		}
		return this.netAmountPayable;
	}

	/**
	 * @return the netRejectionAmount
	 */
	public BigDecimal getNetRejectionAmount() {
		return this.netRejectionAmount;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return this.oId;
	}

	public String getOriginStation() {
		return this.originStation;
	}

	public BigDecimal getOtherChargesActual() {
		return this.otherChargesActual;
	}

	public BigDecimal getOtherChargesBilled() {
		return this.otherChargesBilled;
	}

	public List<AccountingOtherChargesBreakdownDto> getOtherChargesBreakdownDtos() {
		if (otherChargesBreakdownDtos == null) {
			otherChargesBreakdownDtos = new ArrayList<AccountingOtherChargesBreakdownDto>();
		}
		return this.otherChargesBreakdownDtos;
	}

	/**
	 * @return the otherChargesDiff
	 */
	public BigDecimal getOtherChargesDiff() {
		return this.otherChargesDiff;
	}

	public BigDecimal getOtherChargesDueAgent() {
		return this.otherChargesDueAgent;
	}

	public BigDecimal getOtherChargesDueCarrier() {
		return this.otherChargesDueCarrier;
	}

	public String getOurReference() {
		return this.ourReference;
	}

	public Boolean getPartShipmentIndicator() {
		return this.partShipmentIndicator;
	}

	public AWBPaymentType getPaymentType() {
		return this.paymentType;
	}

	public List<AccountingProrateLadderBreakdownDto> getProrateLadderDtos() {
		if (this.prorateLadderDtos == null) {
			this.prorateLadderDtos = new ArrayList<AccountingProrateLadderBreakdownDto>();
		}
		return this.prorateLadderDtos;
	}

	public ProrationType getProrationType() {
		return prorationType;
	}

	/**
	 * @return the queueType
	 */
	public InwardQueueType getQueueType() {
		return this.queueType;
	}

	public BigDecimal getRateOfExchange() {
		return this.rateOfExchange;
	}

	public String getReasoncode() {
		return this.reasoncode;
	}

	// item 317

	private Boolean onHold;

	private BigDecimal sgst;

	private BigDecimal igst;

	private BigDecimal cgst;
	
	private String yourInvoiceNumber;

	private String fromAirport;

	private String toAirport;
	
	private String billingCode;
	
	//LMSC-16223
	private BigDecimal keralaFloodCess;
	
	private BigDecimal commercialSurcharge;

	public BigDecimal getCommercialSurcharge() {
		return commercialSurcharge;
	}

	public void setCommercialSurcharge(BigDecimal commercialSurcharge) {
		this.commercialSurcharge = commercialSurcharge;
	}

	public BigDecimal getKeralaFloodCess() {
		return keralaFloodCess;
	}

	public void setKeralaFloodCess(BigDecimal keralaFloodCess) {
		this.keralaFloodCess = keralaFloodCess;
	}

	public String getBillingCode() {
		return billingCode;
	}

	public void setBillingCode(String billingCode) {
		this.billingCode = billingCode;
	}

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

	public String getYourInvoiceNumber() {
		return yourInvoiceNumber;
	}

	public void setYourInvoiceNumber(String yourInvoiceNumber) {
		this.yourInvoiceNumber = yourInvoiceNumber;
	}

	public Boolean getOnHold() {
		return this.onHold;
	}

	public void setOnHold(Boolean onHold) {
		this.onHold = onHold;
	}

	private String correspondingReference;

	public String getCorrespondingReference() {
		return this.correspondingReference;
	}

	public void setCorrespondingReference(String correspondingReference) {
		this.correspondingReference = correspondingReference;
	}

	/**
	 * @return the reasonDisplay
	 */
	public String getReasonDisplay() {
		this.reasonDisplay = "";
		if (this.getInwardReasonCodeDtos() != null) {
			for (AccountingInwardReasonCodeDto reasonCode : this
					.getInwardReasonCodeDtos()) {
				if (reasonCode != null && reasonCode.getCode() != null) {
					this.reasonDisplay = this.reasonDisplay.concat(
							reasonCode.getCode()).concat(" ");

				}
			}

		}
		return this.reasonDisplay;
	}

	/**
	 * @return the referenceDisplay
	 */
	public String getReferenceDisplay() {
		if (this.getOurReference() != null) {
			this.referenceDisplay = this.getOurReference();
		} else {
			this.referenceDisplay = "";
		}
		if (this.getReferences() != null) {
			for (String reerence : this.getReferences()) {
				if (reerence != null) {
					this.referenceDisplay = this.referenceDisplay.concat(" ")
							.concat(reerence);
				}
			}
		}
		return this.referenceDisplay;
	}

	public List<String> getReferences() {
		if (references == null) {
			references = new ArrayList<String>();
		}
		int referencesSize = references.size();
		for (int i = referencesSize; i < 5; i++) {
			references.add(new String());
		}
		return this.references;
	}

	public RejectionMemoStageType getRejectionMemostage() {
		return this.rejectionMemostage;
	}

	/**
	 * @return the remarkDisplay
	 */
	public String getRemarkDisplay() {
		this.remarkDisplay = "";
		if (this.getRemarks() != null) {
			for (String remark : this.getRemarks()) {
				if (remark != null) {
					this.remarkDisplay = this.remarkDisplay.concat(remark)
							.concat(" ");
				}
			}
		}
		return remarkDisplay;
	}

	public List<String> getRemarks() {
		return this.remarks;
	}

	public String getSectorDest() {
		return sectorDest;
	}

	/**
	 * @return the sectorDestination
	 */
	public String getSectorDestination() {
		if (this.getProrateLadderDtos() != null) {
			for (AccountingProrateLadderBreakdownDto prorateLadder : this.prorateLadderDtos) {
				this.sectorDestination = prorateLadder.getSectorDest();
				break;
			}
		}
		return this.sectorDestination;
	}

	public String getSectorOrig() {
		return sectorOrig;
	}

	/**
	 * @return the sectorOrigin
	 */
	public String getSectorOrigin() {
		if (this.getProrateLadderDtos() != null) {
			for (AccountingProrateLadderBreakdownDto prorateLadder : this.prorateLadderDtos) {
				this.sectorOrigin = prorateLadder.getSectorOrig();
				break;
			}
		}
		return this.sectorOrigin;
	}

	public BigDecimal getTaxDueAgent() {
		return this.taxDueAgent;
	}

	public BigDecimal getTaxDueAirline() {
		return this.taxDueAirline;
	}

	public String getTaxDueAirlineIndicator() {
		return this.taxDueAirlineIndicator;
	}

	/**
	 * @return the toStation
	 */
	public String getToStation() {
		return this.toStation;
	}

	/**
	 * @return the totalProrateAmountDiff
	 */
	public BigDecimal getTotalProrateAmountDiff() {
		return this.totalProrateAmountDiff;
	}

	/**
	 * @return the totalVatBaseAmountDiff
	 */
	public BigDecimal getTotalVatBaseAmountDiff() {
		return this.totalVatBaseAmountDiff;
	}

	/**
	 * @return the totalVatCalAmountDiff
	 */
	public BigDecimal getTotalVatCalAmountDiff() {
		return this.totalVatCalAmountDiff;
	}

	/**
	 * @return the totalVatPercentageDiff
	 */
	public BigDecimal getTotalVatPercentageDiff() {
		return this.totalVatPercentageDiff;
	}

	public UserAuditDto getUserAudit() {
		return this.userAudit;
	}

	public BigDecimal getValuationChargesActual() {
		return this.valuationChargesActual;
	}

	public BigDecimal getValuationChargesBilled() {
		return this.valuationChargesBilled;
	}

	/**
	 * @return the valuationChargesDiff
	 */
	public BigDecimal getValuationChargesDiff() {
		return this.valuationChargesDiff;
	}

	public BigDecimal getVatAmountActual() {
		return this.vatAmountActual;
	}

	public BigDecimal getVatAmountBilled() {
		return this.vatAmountBilled;
	}

	public List<AccountingVatAmountBreakdownDto> getVatAmountBreakdownDtos() {
		if (vatAmountBreakdownDtos == null) {
			vatAmountBreakdownDtos = new ArrayList<AccountingVatAmountBreakdownDto>();
		}
		return this.vatAmountBreakdownDtos;
	}

	/**
	 * @return the vatAmountDiff
	 */
	public BigDecimal getVatAmountDiff() {
		return this.vatAmountDiff;
	}

	public BigDecimal getVatIndicator() {
		return this.vatIndicator;
	}

	public BigDecimal getWeightChargesActual() {
		return this.weightChargesActual;
	}

	public BigDecimal getWeightChargesBilled() {
		return this.weightChargesBilled;
	}

	/**
	 * @return the weightChargesDiff
	 */
	public BigDecimal getWeightChargesDiff() {
		return this.weightChargesDiff;
	}

	public String getWeightIndicator() {
		return this.weightIndicator;
	}

	/**
	 * @return the error
	 */
	public boolean isError() {
		return this.error;
	}

	public void setAccInvoiceDetail(
			final AccountingInvoiceDetailDto pAccInvoiceDetail) {
		this.accInvoiceDetail = pAccInvoiceDetail;
	}

	public void setAccInwardReasonCodes(
			final Set<AccountingInwardReasonCodeDto> pAccInwardReasonCodes) {
		this.accInwardReasonCodes = pAccInwardReasonCodes;
	}

	public void setAccOriginalInvoiceDetail(
			final AccountingOriginalInvoiceDetailDto pAccOriginalInvoiceDetail) {
		this.accOriginalInvoiceDetail = pAccOriginalInvoiceDetail;
	}

	public void setAccOtherChargesBreakdowns(
			final Set<AccountingOtherChargesBreakdownDto> pAccOtherChargesBreakdowns) {
		this.accOtherChargesBreakdowns = pAccOtherChargesBreakdowns;
	}

	public void setAccProrateLadderBreakdowns(
			final Set<AccountingProrateLadderBreakdownDto> pAccProrateLadderBreakdowns) {
		this.accProrateLadderBreakdowns = pAccProrateLadderBreakdowns;
	}

	public void setAccVatAmountBreakdowns(
			final Set<AccountingVatAmountBreakdownDto> pAccVatAmountBreakdowns) {
		this.accVatAmountBreakdowns = pAccVatAmountBreakdowns;
	}

	/**
	 * @param pActionType
	 *            the actionType to set
	 */
	public void setActionType(final ActionType pActionType) {
		this.actionType = pActionType;
	}

	public void setActualDataLine(final String pActualDataLine) {
		this.actualDataLine = pActualDataLine;
	}

	public void setAccAirWayBillDto(
			final AccountingAirWaybillDto pAccAirWayBillDto) {
		this.accAirWayBillDto = pAccAirWayBillDto;
	}

	public void setAgentCode(final BigDecimal pAgentCode) {
		this.agentCode = pAgentCode;
	}

	public void setAgentReferenceData(final String pAgentReferenceData) {
		this.agentReferenceData = pAgentReferenceData;
	}

	public void setAirlineOwnuse(final String pAirlineOwnuse) {
		this.airlineOwnuse = pAirlineOwnuse;
	}

	public void setAirWaybillPaidAmount(final BigDecimal pAirWaybillPaidAmount) {
		this.airWaybillPaidAmount = pAirWaybillPaidAmount;
	}

	public void setAirWaybillPaymentStatus(final String pAirWaybillPaymentStatus) {
		this.airWaybillPaymentStatus = pAirWaybillPaymentStatus;
	}

	/**
	 * @param pAwbInvoiceStatus
	 *            the awbInvoiceStatus to set
	 */
	public void setAwbInvoiceStatus(final InwardInvoiceStatus pAwbInvoiceStatus) {
		this.awbInvoiceStatus = pAwbInvoiceStatus;
	}

	public void setAwbModularNumberCheck(final String pAwbModularNumberCheck) {
		this.awbModularNumberCheck = pAwbModularNumberCheck;
	}

	public void setAwbNumber(final AirWaybillNumberDto pAwbNumber) {
		this.awbNumber = pAwbNumber;
	}

	/**
	 * @param pAWBNumberDisplay
	 *            the aWBNumberDisplay to set
	 */
	public void setAWBNumberDisplay(final String pAWBNumberDisplay) {
		this.aWBNumberDisplay = ContractUtility
				.convertToUpperCase(pAWBNumberDisplay);
	}

	public void setAwbTotalActual(final BigDecimal pAwbTotalActual) {
		this.awbTotalActual = pAwbTotalActual;
	}

	public void setAwbTotalBilled(final BigDecimal pAwbTotalBilled) {
		this.awbTotalBilled = pAwbTotalBilled;
	}

	/**
	 * @param pAwbTotalDiff
	 *            the awbTotalDiff to set
	 */
	public void setAwbTotalDiff(final BigDecimal pAwbTotalDiff) {
		this.awbTotalDiff = pAwbTotalDiff;
	}

	public void setBranchOfficeIndicator(final String pBranchOfficeIndicator) {
		this.branchOfficeIndicator = pBranchOfficeIndicator;
	}

	public void setCommissionAmount(final BigDecimal pCommissionAmount) {
		this.commissionAmount = pCommissionAmount;
	}

	public void setCommissionIndicator(final String pCommissionIndicator) {
		this.commissionIndicator = pCommissionIndicator;
	}

	public void setCommissionpercentage(final BigDecimal pCommissionpercentage) {
		this.commissionpercentage = pCommissionpercentage;
	}

	public void setCurrencyCode(final String pCurrencyCode) {
		this.currencyCode = ContractUtility.convertToUpperCase(pCurrencyCode);
	}

	public void setDateOfAwbAcceptance(final Date pDateOfAwbAcceptance) {
		this.dateOfAwbAcceptance = pDateOfAwbAcceptance;
	}

	public void setDestinationStation(final String pDestinationStation) {
		this.destinationStation = ContractUtility
				.convertToUpperCase(pDestinationStation);
	}

	public void setDiscountAmount(final BigDecimal pDiscountAmount) {
		this.discountAmount = pDiscountAmount;
	}

	public void setDiscountIndicator(final String pDiscountIndicator) {
		this.discountIndicator = pDiscountIndicator;
	}

	/**
	 * @param pError
	 *            the error to set
	 */
	public void setError(final boolean pError) {
		this.error = pError;
	}

	public void setErrorMessage(final String pErrorMessage) {
		this.errorMessage = pErrorMessage;
	}

	public void setExecutionDate(final Date pExecutionDate) {
		this.executionDate = pExecutionDate;
	}

	/**
	 * @param pFromStation
	 *            the fromStation to set
	 */
	public void setFromStation(final String pFromStation) {
		this.fromStation = ContractUtility.convertToUpperCase(pFromStation);
	}

	public void setGrossWeight(final BigDecimal pGrossWeight) {
		this.grossWeight = pGrossWeight;
	}

	/**
	 * @param pInternationalAWBType
	 *            the internationalAWBType to set
	 */
	public void setInternationalAWBType(
			final InternationalAWBType pInternationalAWBType) {
		this.internationalAWBType = pInternationalAWBType;
	}

	public void setInwardReasonCodeDtos(
			final List<AccountingInwardReasonCodeDto> pInwardReasonCodeDtos) {
		this.inwardReasonCodeDtos = pInwardReasonCodeDtos;
	}

	public void setIscAmountActual(final BigDecimal pIscAmountActual) {
		this.iscAmountActual = pIscAmountActual;
	}

	public void setIscAmountBilled(final BigDecimal pIscAmountBilled) {
		this.iscAmountBilled = pIscAmountBilled;
	}

	/**
	 * @param pIscAmountDiff
	 *            the iscAmountDiff to set
	 */
	public void setIscAmountDiff(final BigDecimal pIscAmountDiff) {
		this.iscAmountDiff = pIscAmountDiff;
	}

	public void setIscPercentageActual(final BigDecimal pIscPercentageActual) {
		this.iscPercentageActual = pIscPercentageActual;
	}

	public void setIscPercentageBilled(final BigDecimal pIscPercentageBilled) {
		this.iscPercentageBilled = pIscPercentageBilled;
	}

	/**
	 * @param pIscPercentageDiff
	 *            the iscPercentageDiff to set
	 */
	public void setIscPercentageDiff(final BigDecimal pIscPercentageDiff) {
		this.iscPercentageDiff = pIscPercentageDiff;
	}

	public void setMemoNumber(final String pMemoNumber) {
		this.memoNumber = ContractUtility.convertToUpperCase(pMemoNumber);
	}

	public void setMemoType(final MemoType pMemoType) {
		this.memoType = pMemoType;
	}

	public void setNetAmountBeforeTax(final BigDecimal pNetAmountBeforeTax) {
		this.netAmountBeforeTax = pNetAmountBeforeTax;
	}

	public void setNetAmountPayable(final BigDecimal pNetAmountPayable) {
		this.netAmountPayable = pNetAmountPayable;
	}

	/**
	 * @param pNetRejectionAmount
	 *            the netRejectionAmount to set
	 */
	public void setNetRejectionAmount(final BigDecimal pNetRejectionAmount) {
		this.netRejectionAmount = pNetRejectionAmount;
	}

	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

	public void setOriginStation(final String pOriginStation) {
		this.originStation = ContractUtility.convertToUpperCase(pOriginStation);
	}

	public void setOtherChargesActual(final BigDecimal pOtherChargesActual) {
		this.otherChargesActual = pOtherChargesActual;
	}

	public void setOtherChargesBilled(final BigDecimal pOtherChargesBilled) {
		this.otherChargesBilled = pOtherChargesBilled;
	}

	public void setOtherChargesBreakdownDtos(
			final List<AccountingOtherChargesBreakdownDto> pOtherChargesBreakdownDtos) {
		this.otherChargesBreakdownDtos = pOtherChargesBreakdownDtos;
	}

	/**
	 * @param pOtherChargesDiff
	 *            the otherChargesDiff to set
	 */
	public void setOtherChargesDiff(final BigDecimal pOtherChargesDiff) {
		this.otherChargesDiff = pOtherChargesDiff;
	}

	public void setOtherChargesDueAgent(final BigDecimal pOtherChargesDueAgent) {
		this.otherChargesDueAgent = pOtherChargesDueAgent;
	}

	public void setOtherChargesDueCarrier(
			final BigDecimal pOtherChargesDueCarrier) {
		this.otherChargesDueCarrier = pOtherChargesDueCarrier;
	}

	public void setOurReference(final String pOurreference) {
		this.ourReference = ContractUtility.convertToUpperCase(pOurreference);
	}

	public void setPartShipmentIndicator(final Boolean pPartShipmentIndicator) {
		this.partShipmentIndicator = pPartShipmentIndicator;
	}

	public void setPaymentType(final AWBPaymentType pPaymentType) {
		this.paymentType = pPaymentType;
	}

	public void setProrateLadderDtos(
			final List<AccountingProrateLadderBreakdownDto> pProrateLadderDtos) {
		this.prorateLadderDtos = pProrateLadderDtos;
	}

	public void setProrationType(ProrationType prorationType) {
		this.prorationType = prorationType;
	}

	public void setQueueType(final InwardQueueType pQueueType) {
		this.queueType = pQueueType;
	}

	public void setRateOfExchange(final BigDecimal pRateOfExchange) {
		this.rateOfExchange = pRateOfExchange;
	}

	public void setReasoncode(final String pReasoncode) {
		this.reasoncode = ContractUtility.convertToUpperCase(pReasoncode);
	}

	/**
	 * @param pReasonDisplay
	 *            the reasonDisplay to set
	 */
	public void setReasonDisplay(final String pReasonDisplay) {
		this.reasonDisplay = ContractUtility.convertToUpperCase(pReasonDisplay);
	}

	/**
	 * @param pReferenceDisplay
	 *            the referenceDisplay to set
	 */
	public void setReferenceDisplay(final String pReferenceDisplay) {
		this.referenceDisplay = pReferenceDisplay;
	}

	public void setReferences(final List<String> pReferences) {
		this.references = ContractUtility.convertListToUpperCase(pReferences);
	}

	public void setRejectionMemostage(
			final RejectionMemoStageType pRejectionMemostage) {
		this.rejectionMemostage = pRejectionMemostage;
	}

	/**
	 * @param pRemarkDisplay
	 *            the remarkDisplay to set
	 */
	public void setRemarkDisplay(final String pRemarkDisplay) {
		this.remarkDisplay = ContractUtility.convertToUpperCase(pRemarkDisplay);
	}

	public void setRemarks(final List<String> pRemarks) {
		this.remarks = ContractUtility.convertListToUpperCase(pRemarks);
	}

	public void setSectorDest(String sectorDest) {
		this.sectorDest = sectorDest;
	}

	/**
	 * @param pSectorDestination
	 *            the sectorDestination to set
	 */
	public void setSectorDestination(final String pSectorDestination) {
		this.sectorDestination = ContractUtility
				.convertToUpperCase(pSectorDestination);
	}

	public void setSectorOrig(String sectorOrig) {
		this.sectorOrig = sectorOrig;
	}

	/**
	 * @param pSectorOrigin
	 *            the sectorOrigin to set
	 */
	public void setSectorOrigin(final String pSectorOrigin) {
		this.sectorOrigin = ContractUtility.convertToUpperCase(pSectorOrigin);
	}

	public void setTaxDueAgent(final BigDecimal pTaxDueAgent) {
		this.taxDueAgent = pTaxDueAgent;
	}

	public void setTaxDueAirline(final BigDecimal pTaxDueAirline) {
		this.taxDueAirline = pTaxDueAirline;
	}

	public void setTaxDueAirlineIndicator(final String pTaxDueAirlineIndicator) {
		this.taxDueAirlineIndicator = pTaxDueAirlineIndicator;
	}

	/**
	 * @param pToStation
	 *            the toStation to set
	 */
	public void setToStation(final String pToStation) {
		this.toStation = ContractUtility.convertToUpperCase(pToStation);
	}

	/**
	 * @param pTotalProrateAmountDiff
	 *            the totalProrateAmountDiff to set
	 */
	public void setTotalProrateAmountDiff(
			final BigDecimal pTotalProrateAmountDiff) {
		this.totalProrateAmountDiff = pTotalProrateAmountDiff;
	}

	/**
	 * @param pTotalVatBaseAmountDiff
	 *            the totalVatBaseAmountDiff to set
	 */
	public void setTotalVatBaseAmountDiff(
			final BigDecimal pTotalVatBaseAmountDiff) {
		this.totalVatBaseAmountDiff = pTotalVatBaseAmountDiff;
	}

	/**
	 * @param pTotalVatCalAmountDiff
	 *            the totalVatCalAmountDiff to set
	 */
	public void setTotalVatCalAmountDiff(final BigDecimal pTotalVatCalAmountDiff) {
		this.totalVatCalAmountDiff = pTotalVatCalAmountDiff;
	}

	/**
	 * @param pTotalVatPercentageDiff
	 *            the totalVatPercentageDiff to set
	 */
	public void setTotalVatPercentageDiff(
			final BigDecimal pTotalVatPercentageDiff) {
		this.totalVatPercentageDiff = pTotalVatPercentageDiff;
	}

	public void setUserAudit(final UserAuditDto pUserAudit) {
		this.userAudit = pUserAudit;
	}

	public void setValuationChargesActual(
			final BigDecimal pValuationChargesActual) {
		this.valuationChargesActual = pValuationChargesActual;
	}

	public void setValuationChargesBilled(
			final BigDecimal pValuationChargesBilled) {
		this.valuationChargesBilled = pValuationChargesBilled;
	}

	/**
	 * @param pValuationChargesDiff
	 *            the valuationChargesDiff to set
	 */
	public void setValuationChargesDiff(final BigDecimal pValuationChargesDiff) {
		this.valuationChargesDiff = pValuationChargesDiff;
	}

	public void setVatAmountActual(final BigDecimal pVatAmountActual) {
		this.vatAmountActual = pVatAmountActual;
	}

	public void setVatAmountBilled(final BigDecimal pVatAmountBilled) {
		this.vatAmountBilled = pVatAmountBilled;
	}

	public void setVatAmountBreakdownDtos(
			final List<AccountingVatAmountBreakdownDto> pVatAmountBreakdownDtos) {
		this.vatAmountBreakdownDtos = pVatAmountBreakdownDtos;
	}

	/**
	 * @param pVatAmountDiff
	 *            the vatAmountDiff to set
	 */
	public void setVatAmountDiff(final BigDecimal pVatAmountDiff) {
		this.vatAmountDiff = pVatAmountDiff;
	}

	public void setVatIndicator(final BigDecimal pVatIndicator) {
		this.vatIndicator = pVatIndicator;
	}

	public void setWeightChargesActual(final BigDecimal pWeightChargesActual) {
		this.weightChargesActual = pWeightChargesActual;
	}

	public void setWeightChargesBilled(final BigDecimal pWeightChargesBilled) {
		this.weightChargesBilled = pWeightChargesBilled;
	}

	/**
	 * @param pWeightChargesDiff
	 *            the weightChargesDiff to set
	 */
	public void setWeightChargesDiff(final BigDecimal pWeightChargesDiff) {
		this.weightChargesDiff = pWeightChargesDiff;
	}

	public void setWeightIndicator(final String pWeightIndicator) {
		this.weightIndicator = pWeightIndicator;
	}

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	/**
	 * @return the receivableStatusType
	 */
	public ReceivableStatusType getReceivableStatusType() {
		return receivableStatusType;
	}

	/**
	 * @param receivableStatusType
	 *            the receivableStatusType to set
	 */
	public void setReceivableStatusType(
			ReceivableStatusType receivableStatusType) {
		this.receivableStatusType = receivableStatusType;
	}

	/**
	 * @return the carriageDate
	 */
	public Date getCarriageDate() {
		return carriageDate;
	}

	/**
	 * @param carriageDate
	 *            the carriageDate to set
	 */
	public void setCarriageDate(Date carriageDate) {
		this.carriageDate = carriageDate;
	}

	/**
	 * @return the updatableOutwardMemo
	 */
	public boolean isUpdatableOutwardMemo() {
		return updatableOutwardMemo;
	}

	/**
	 * @param updatableOutwardMemo
	 *            the updatableOutwardMemo to set
	 */
	public void setUpdatableOutwardMemo(boolean updatableOutwardMemo) {
		this.updatableOutwardMemo = updatableOutwardMemo;
	}

	/**
	 * @return the memoDate
	 */
	public Date getMemoDate() {
		return memoDate;
	}

	/**
	 * @param memoDate
	 *            the memoDate to set
	 */
	public void setMemoDate(Date memoDate) {
		this.memoDate = memoDate;
	}

	/**
	 * @return the memoFillingReference
	 */
	public String getMemoFillingReference() {
		return memoFillingReference;
	}

	/**
	 * @param memoFillingReference
	 *            the memoFillingReference to set
	 */
	public void setMemoFillingReference(String memoFillingReference) {
		this.memoFillingReference = memoFillingReference;
	}

	/**
	 * @return the memoCCAIndicator
	 */
	public boolean isMemoCCAIndicator() {
		return memoCCAIndicator;
	}

	/**
	 * @param memoCCAIndicator
	 *            the memoCCAIndicator to set
	 */
	public void setMemoCCAIndicator(boolean memoCCAIndicator) {
		this.memoCCAIndicator = memoCCAIndicator;
	}

	/**
	 * @return the inwardAttachment
	 */
	public byte[] getInwardAttachment() {
		return inwardAttachment;
	}

	/**
	 * @param inwardAttachment
	 *            the inwardAttachment to set
	 */
	public void setInwardAttachment(byte[] inwardAttachment) {
		this.inwardAttachment = inwardAttachment;
	}

	/**
	 * @return the ccaIndicator
	 */
	public Boolean getCcaIndicator() {
		return ccaIndicator;
	}

	/**
	 * @param ccaIndicator
	 *            the ccaIndicator to set
	 */
	public void setCcaIndicator(Boolean ccaIndicator) {
		this.ccaIndicator = ccaIndicator;
	}

	/**
	 * @return the inwardFillingReference
	 */
	public String getInwardFillingReference() {
		return inwardFillingReference;
	}

	/**
	 * @param inwardFillingReference
	 *            the inwardFillingReference to set
	 */
	public void setInwardFillingReference(String inwardFillingReference) {
		this.inwardFillingReference = inwardFillingReference;
	}

	/**
	 * @return the amtSubjToISC
	 */
	public BigDecimal getAmtSubjToISC() {
		return amtSubjToISC;
	}

	/**
	 * @param amtSubjToISC
	 *            the amtSubjToISC to set
	 */
	public void setAmtSubjToISC(BigDecimal amtSubjToISC) {
		this.amtSubjToISC = amtSubjToISC;
	}

	/**
	 * @return the weightUnit
	 */
	public WeightUOMType getWeightUnit() {
		return weightUnit;
	}

	/**
	 * @param weightUnit
	 *            the weightUnit to set
	 */
	public void setWeightUnit(WeightUOMType weightUnit) {
		this.weightUnit = weightUnit;
	}

	/**
	 * @return the currAdjIndicator
	 */
	public String getCurrAdjIndicator() {
		return currAdjIndicator;
	}

	/**
	 * @param currAdjIndicator
	 *            the currAdjIndicator to set
	 */
	public void setCurrAdjIndicator(String currAdjIndicator) {
		this.currAdjIndicator = currAdjIndicator;
	}

	/**
	 * @return the iscAmountAccepted
	 */
	public BigDecimal getIscAmountAccepted() {
		return iscAmountAccepted;
	}

	/**
	 * @param iscAmountAccepted
	 *            the iscAmountAccepted to set
	 */
	public void setIscAmountAccepted(BigDecimal iscAmountAccepted) {
		this.iscAmountAccepted = iscAmountAccepted;
	}

	/**
	 * @return the iscPercentageAccepted
	 */
	public BigDecimal getIscPercentageAccepted() {
		return iscPercentageAccepted;
	}

	/**
	 * @param iscPercentageAccepted
	 *            the iscPercentageAccepted to set
	 */
	public void setIscPercentageAccepted(BigDecimal iscPercentageAccepted) {
		this.iscPercentageAccepted = iscPercentageAccepted;
	}

	/**
	 * @return the otherChargesAccepted
	 */
	public BigDecimal getOtherChargesAccepted() {
		return otherChargesAccepted;
	}

	/**
	 * @param otherChargesAccepted
	 *            the otherChargesAccepted to set
	 */
	public void setOtherChargesAccepted(BigDecimal otherChargesAccepted) {
		this.otherChargesAccepted = otherChargesAccepted;
	}

	/**
	 * @return the valuationChargesAccepted
	 */
	public BigDecimal getValuationChargesAccepted() {
		return valuationChargesAccepted;
	}

	/**
	 * @param valuationChargesAccepted
	 *            the valuationChargesAccepted to set
	 */
	public void setValuationChargesAccepted(BigDecimal valuationChargesAccepted) {
		this.valuationChargesAccepted = valuationChargesAccepted;
	}

	/**
	 * @return the vatAmountAccepted
	 */
	public BigDecimal getVatAmountAccepted() {
		return vatAmountAccepted;
	}

	/**
	 * @param vatAmountAccepted
	 *            the vatAmountAccepted to set
	 */
	public void setVatAmountAccepted(BigDecimal vatAmountAccepted) {
		this.vatAmountAccepted = vatAmountAccepted;
	}

	/**
	 * @return the weightChargesAccepted
	 */
	public BigDecimal getWeightChargesAccepted() {
		return weightChargesAccepted;
	}

	/**
	 * @param weightChargesAccepted
	 *            the weightChargesAccepted to set
	 */
	public void setWeightChargesAccepted(BigDecimal weightChargesAccepted) {
		this.weightChargesAccepted = weightChargesAccepted;
	}

	/**
	 * @return the awbTotalAccepted
	 */
	public BigDecimal getAwbTotalAccepted() {
		return awbTotalAccepted;
	}

	/**
	 * @param awbTotalAccepted
	 *            the awbTotalAccepted to set
	 */
	public void setAwbTotalAccepted(BigDecimal awbTotalAccepted) {
		this.awbTotalAccepted = awbTotalAccepted;
	}

	/* NAC starts */
	/**
	 * @return the specificAirline
	 */
	public String getSpecificAirline() {
		return specificAirline;
	}

	/**
	 * @param specificAirline
	 *            the specificAirline to set
	 */
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}
	
	public BigDecimal getCgst() {
		return cgst;
	}

	public void setCgst(BigDecimal cgst) {
		this.cgst = cgst;
	}

	public BigDecimal getSgst() {
		return sgst;
	}

	public void setSgst(BigDecimal sgst) {
		this.sgst = sgst;
	}

	public BigDecimal getIgst() {
		return igst;
	}

	public void setIgst(BigDecimal igst) {
		this.igst = igst;
	}
	
	public boolean isAwbBreakdownInd() {
		return awbBreakdownInd;
	}

	public void setAwbBreakdownInd(boolean awbBreakdownInd) {
		this.awbBreakdownInd = awbBreakdownInd;
	}
	
	/* NAC ends */

	private String reasonDescription;

	public String getReasonDescription() {
		return reasonDescription;
	}

	public void setReasonDescription(String reasonDescription) {
		this.reasonDescription = reasonDescription;
	}

	/* Attachment Indicator*/
	private Boolean attachmentIndicator;

	public Boolean getAttachmentIndicator() {
		return attachmentIndicator;
	}

	public void setAttachmentIndicator(Boolean attachmentIndicator) {
		this.attachmentIndicator = attachmentIndicator;
	}
	public Long getGstr1ReturnOid() {
		return gstr1ReturnOid;
	}

	public void setGstr1ReturnOid(Long gstr1ReturnOid) {
		this.gstr1ReturnOid = gstr1ReturnOid;
	}
}