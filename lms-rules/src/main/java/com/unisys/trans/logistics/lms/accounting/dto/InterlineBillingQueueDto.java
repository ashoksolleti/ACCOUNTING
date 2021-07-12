package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AWBPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ClearingHouseType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardActionType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardInvoiceStatus;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardQueueType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RejectionMemoStageType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.framework.utility.StringUtility;

public class InterlineBillingQueueDto extends PersistenceObjectDto implements
		Serializable {

	/**
	 * Attribute to hold <code>AND_SPL_CHAR</code> property.
	 */
	private static final String AND_SPL_CHAR = "&";

	/**
	 * Attribute to hold <code>EMPTY_STRING</code> property.
	 */
	private static final String EMPTY_STRING = "";

	/**
	 * Attribute to hold <code>INDEF</code> property.
	 */
	private static final String INDEF = "INDEF";

	/**
	 * Attribute to hold <code>NEW_LINE</code> property.
	 */
	private static final String NEW_LINE = "<br>";

	/**
	 * Attribute to hold <code>NO_LITERAL</code> property.
	 */
	private static final String NO_LITERAL = "No";

	/**     
     */
	private static final long serialVersionUID = 1L;

	/**
	 * Attribute to hold <code>WHITE_SPACE</code> property.
	 */
	private static final String WHITE_SPACE = " ";

	/**
	 * Attribute to hold <code>YES_LITERAL</code> property.
	 */
	private static final String YES_LITERAL = "Yes";

	private boolean action = true;

	/** Attribute to hold <code>rejectionMemostage</code> property. */
	private AccountingAirWaybillDto airWaybillDto;

	private InwardInvoiceStatus awbInvoiceStatus;

	private AirWaybillNumberDto awbNumber;

	private String aWBNumberDisplay;

	private BigDecimal awbTotalAccepted;

	private BigDecimal awbTotalActual;

	private BigDecimal awbTotalBilled;

	private String billingCarrier;

	private String destinationStation;
	
	private String payableCarrier;

	/**
	 * Attribute to hold <code>error</code> property.
	 */
	private boolean error;

	private Date executionDate;

	private String fromStation;

	private String invoiceCurrency;

	private Date invoiceDate;

	private String invoiceNumber;

	private InwardActionType inwardActionType;

	private InwardInvoiceStatus inwardInvoiceStatus;

	/** Attribute to hold <code>inwardReasonCodeDtos</code> property. */
	private List<AccountingInwardReasonCodeDto> inwardReasonCodeDtos;

	private BigDecimal iscAmountAccepted;

	private BigDecimal iscAmountActual;

	private BigDecimal iscAmountBilled;

	private BigDecimal iscPercentageAccepted;

	private BigDecimal iscPercentageActual;

	private BigDecimal iscPercentageBilled;

	private String memoNumber;

	private MemoType memoType;

	private Long oId;

	private String originStation;

	private BigDecimal otherChargesAccepted;

	private BigDecimal otherChargesActual;

	private BigDecimal otherChargesBilled;

	/** Attribute to hold <code>otherChargesBreakdownDtos</code> property. */
	private List<AccountingOtherChargesBreakdownDto> otherChargesBreakdownDtos;

	private Boolean partShipmentIndicator;

	private AWBPaymentType paymentType;

	/** Attribute to hold <code>prorateLadderDtos</code> property. */
	private List<AccountingProrateLadderBreakdownDto> prorateLadderDtos;

	private String queueReason;

	/** Attribute to hold <code>queueType</code> property. */
	private InwardQueueType queueType;

	private List<String> references;
	
	private String ourReferences;

	/** Attribute to hold <code>rejectionMemostage</code> property. */
	private RejectionMemoStageType rejectionMemostage;

	/** Attribute to hold <code>otherChargesBreakdownDtos</code> property. */
	private List<AccountingOtherChargesBreakdownDto> rejectOtherChargesBreakdownDtos;

	/** Attribute to hold <code>inwardReasonCodeDtos</code> property. */
	private List<AccountingInwardReasonCodeDto> rejectReasonCodeDtos;

	/** Attribute to hold <code>remarksDtos</code> property. */
	private List<String> rejectRemarksDtos = null;

	private List<String> remarks;

	private String sectorDestination;

	private String sectorOrigin;

	private Boolean sisIndicator;

	private String toStation;

	private BigDecimal valuationChargesAccepted;

	private BigDecimal valuationChargesActual;

	private BigDecimal valuationChargesBilled;

	private BigDecimal vatAmountAccepted;

	private BigDecimal vatAmountActual;

	private BigDecimal vatAmountBilled;

	/** Attribute to hold <code>vatAmountBreakdownDtos</code> property. */
	private List<AccountingVatAmountBreakdownDto> vatAmountBreakdownDtos;

	private BigDecimal weightChargesAccepted;

	private BigDecimal weightChargesActual;

	private BigDecimal weightChargesBilled;

	private BigDecimal amountSubToISCActual;

	private BigDecimal amountSubToISCBilled;

	private BigDecimal amountSubToISCAccepted;
	
	private ClearingHouseType clearingHouseType;
	
	private String billingYearMonth;
	
	private Integer billingPeriod;
	
	private BigDecimal openProvisionAmount;
	
	private String revenueIndicatorType;
	
	private BigDecimal iscAmount;
	
	private Date awbCarriageDate;
	
	
	private String settlementMethod;
	
	public String getSettlementMethod() {
		return settlementMethod;
	}

	public void setSettlementMethod(String settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	

	// NAC

	public Date getAwbCarriageDate() {
		return awbCarriageDate;
	}

	public void setAwbCarriageDate(Date awbCarriageDate) {
		this.awbCarriageDate = awbCarriageDate;
	}

	public BigDecimal getIscAmount() {
		return iscAmount;
	}

	public void setIscAmount(BigDecimal iscAmount) {
		this.iscAmount = iscAmount;
	}

	public String getRevenueIndicatorType() {
		return revenueIndicatorType;
	}

	public void setRevenueIndicatorType(String revenueIndicatorType) {
		this.revenueIndicatorType = revenueIndicatorType;
	}

	/** Attribute to hold <code>specificAirline</code> property. */

	private String specificAirline;

	public String getOurReferences() {
        return ourReferences;
    }

    public void setOurReferences(String ourReferences) {
        this.ourReferences = ourReferences;
    }

	/**
     * @return the references
     */
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

    /**
     * @param references the references to set
     */
    public void setReferences(final List<String> pReferences) {
        this.references = ContractUtility.convertListToUpperCase(pReferences);
    }
    
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

	public InterlineBillingQueueDto() {
	}

	public AccountingAirWaybillDto getAirWaybillDto() {
		return airWaybillDto;
	}

	public InwardInvoiceStatus getAwbInvoiceStatus() {
		return awbInvoiceStatus;
	}

	public AirWaybillNumberDto getAwbNumber() {
		return awbNumber;
	}

	/* NAC starts */
	/**
	 * Gets the <code>specificAirline</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>specificAirline</code> property.
	 */
	public String getSpecificAirline() {
		return specificAirline;
	}

	/**
	 * @param pRemarks
	 *            the remarks to set
	 */
	public void setSpecificAirline(String specificAirline) {

		this.specificAirline = specificAirline;
	}

	/* NAC ends */

	/**
	 * @return the aWBNumberDisplay
	 */
	public String getAWBNumberDisplay() {
		if (this.getAwbNumber() != null) {
			if (StringUtility.isEmpty(this.getAwbNumber()
					.getModOverrideIndicator())) {
				this.aWBNumberDisplay = this.getAwbNumber().getAirlineCodeNbr()
						.concat(this.getAwbNumber().getShipmentReference());
			} else {
				this.aWBNumberDisplay = this.getAwbNumber().getAirlineCodeNbr()
						.concat(this.getAwbNumber().getShipmentReference())
						.concat(this.getAwbNumber().getModOverrideIndicator());
			}
		}
		return this.aWBNumberDisplay;
	}

	public BigDecimal getAwbTotalAccepted() {
		return this.awbTotalAccepted;
	}

	public BigDecimal getAwbTotalActual() {
		return this.awbTotalActual;
	}

	public BigDecimal getAwbTotalBilled() {
		return this.awbTotalBilled;
	}

	public String getBillingCarrier() {
		return this.billingCarrier;
	}

	public String getDestinationStation() {
		return this.destinationStation;
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

	public String getInvoiceCurrency() {
		return this.invoiceCurrency;
	}

	public Date getInvoiceDate() {
		return this.invoiceDate;
	}

	public String getInvoiceNumber() {
		return this.invoiceNumber;
	}

	/**
	 * @return the inwardActionType
	 */
	public InwardActionType getInwardActionType() {
		return this.inwardActionType;
	}

	public InwardInvoiceStatus getInwardInvoiceStatus() {
		return this.inwardInvoiceStatus;
	}

	public List<AccountingInwardReasonCodeDto> getInwardReasonCodeDtos() {
		if (this.inwardReasonCodeDtos == null) {
			this.inwardReasonCodeDtos = new ArrayList<AccountingInwardReasonCodeDto>();
		}
		return this.inwardReasonCodeDtos;
	}

	public BigDecimal getIscAmountAccepted() {
		return this.iscAmountAccepted;
	}

	public BigDecimal getIscAmountActual() {
		return this.iscAmountActual;
	}

	public BigDecimal getIscAmountBilled() {
		return this.iscAmountBilled;
	}

	public BigDecimal getIscPercentageAccepted() {
		return this.iscPercentageAccepted;
	}

	public BigDecimal getIscPercentageActual() {
		return this.iscPercentageActual;
	}

	public BigDecimal getIscPercentageBilled() {
		return this.iscPercentageBilled;
	}

	public String getMemoNumber() {
		return this.memoNumber;
	}

	public MemoType getMemoType() {
		return this.memoType;
	}

	public Long getOId() {
		return this.oId;
	}

	public String getOriginStation() {
		return this.originStation;
	}

	public BigDecimal getOtherChargesAccepted() {
		return this.otherChargesAccepted;
	}

	public BigDecimal getOtherChargesActual() {
		return this.otherChargesActual;
	}

	public BigDecimal getOtherChargesBilled() {
		return this.otherChargesBilled;
	}

	public List<AccountingOtherChargesBreakdownDto> getOtherChargesBreakdownDtos() {
		if (this.otherChargesBreakdownDtos == null) {
			this.otherChargesBreakdownDtos = new ArrayList<AccountingOtherChargesBreakdownDto>();
		}
		return this.otherChargesBreakdownDtos;
	}

	/**
	 * @return the partShipmentIndicator
	 */
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

	public String getQueueReason() {
		return this.queueReason;
	}

	public InwardQueueType getQueueType() {
		return this.queueType;
	}

	public RejectionMemoStageType getRejectionMemostage() {
		return this.rejectionMemostage;
	}

	/**
	 * @return the rejectOtherChargesBreakdownDtos
	 */
	public List<AccountingOtherChargesBreakdownDto> getRejectOtherChargesBreakdownDtos() {
		if (this.rejectOtherChargesBreakdownDtos == null) {
			this.rejectOtherChargesBreakdownDtos = new ArrayList<AccountingOtherChargesBreakdownDto>();
		}
		return this.rejectOtherChargesBreakdownDtos;
	}

	/**
	 * @return the rejectReasonCodeDtos
	 */
	public List<AccountingInwardReasonCodeDto> getRejectReasonCodeDtos() {
		return this.rejectReasonCodeDtos;
	}

	/**
	 * @return the rejectRemarksDtos
	 */
	public List<String> getRejectRemarksDtos() {
		return this.rejectRemarksDtos;
	}

	/**
	 * @return the remarks
	 */
	public List<String> getRemarks() {
		return this.remarks;
	}

	public String getSectorDestination() {
		if (this.getProrateLadderDtos() != null) {
			for (AccountingProrateLadderBreakdownDto prorateLadder : this
					.getProrateLadderDtos()) {
				this.sectorDestination = prorateLadder.getSectorDest();
				break;
			}
		}
		return this.sectorDestination;
	}

	public String getSectorOrigin() {
		if (this.getProrateLadderDtos() != null) {
			for (AccountingProrateLadderBreakdownDto prorateLadder : this
					.getProrateLadderDtos()) {
				this.sectorOrigin = prorateLadder.getSectorOrig();
				break;
			}
		}
		return this.sectorOrigin;
	}

	/**
	 * @return the sisIndicator
	 */
	public Boolean getSisIndicator() {
		return this.sisIndicator;
	}

	/**
	 * @return the toStation
	 */
	public String getToStation() {
		return this.toStation;
	}

	public BigDecimal getValuationChargesAccepted() {
		return this.valuationChargesAccepted;
	}

	public BigDecimal getValuationChargesActual() {
		return this.valuationChargesActual;
	}

	public BigDecimal getValuationChargesBilled() {
		return this.valuationChargesBilled;
	}

	public BigDecimal getVatAmountAccepted() {
		return this.vatAmountAccepted;
	}

	public BigDecimal getVatAmountActual() {
		return this.vatAmountActual;
	}

	public BigDecimal getVatAmountBilled() {
		return this.vatAmountBilled;
	}

	public List<AccountingVatAmountBreakdownDto> getVatAmountBreakdownDtos() {
		if (this.vatAmountBreakdownDtos == null) {
			this.vatAmountBreakdownDtos = new ArrayList<AccountingVatAmountBreakdownDto>();
		}
		return this.vatAmountBreakdownDtos;
	}

	public BigDecimal getWeightChargesAccepted() {
		return this.weightChargesAccepted;
	}

	public BigDecimal getWeightChargesActual() {
		return this.weightChargesActual;
	}

	public BigDecimal getWeightChargesBilled() {
		return this.weightChargesBilled;
	}

	public boolean isAction() {
		return this.action;
	}

	/**
	 * @return the error
	 */
	public boolean isError() {
		return this.error;
	}

	public void setAction(final boolean pAction) {
		this.action = pAction;
	}

	public void setAirWaybillDto(AccountingAirWaybillDto airWaybillDto) {
		this.airWaybillDto = airWaybillDto;
	}

	public void setAwbInvoiceStatus(final InwardInvoiceStatus pAwbInvoiceStatus) {
		this.awbInvoiceStatus = pAwbInvoiceStatus;
	}

	public void setAwbNumber(final AirWaybillNumberDto pAwbNumber) {
		this.awbNumber = pAwbNumber;
	}

	/**
	 * @param pAWBNumberDisplay
	 *            the aWBNumberDisplay to set
	 */
	public void setAWBNumberDisplay(final String pAWBNumberDisplay) {
		this.aWBNumberDisplay = pAWBNumberDisplay;
	}

	public void setAwbTotalAccepted(final BigDecimal pAwbTotalAccepted) {
		this.awbTotalAccepted = pAwbTotalAccepted;
	}

	public void setAwbTotalActual(final BigDecimal pAwbTotalActual) {
		this.awbTotalActual = pAwbTotalActual;
	}

	public void setAwbTotalBilled(final BigDecimal pAwbTotalBilled) {
		this.awbTotalBilled = pAwbTotalBilled;
	}

	public void setBillingCarrier(final String pBillingCarrier) {
		this.billingCarrier = pBillingCarrier;
	}

	public void setDestinationStation(final String pDestinationStation) {
		this.destinationStation = pDestinationStation;
	}

	/**
	 * @param error
	 *            the error to set
	 */
	public void setError(boolean error) {
		this.error = error;
	}

	public void setExecutionDate(final Date pExecutionDate) {
		this.executionDate = pExecutionDate;
	}

	/**
	 * @param pFromStation
	 *            the fromStation to set
	 */
	public void setFromStation(final String pFromStation) {
		this.fromStation = pFromStation;
	}

	public void setInvoiceCurrency(final String pInvoiceCurrency) {
		this.invoiceCurrency = pInvoiceCurrency;
	}

	public void setInvoiceDate(final Date pInvoiceDate) {
		this.invoiceDate = pInvoiceDate;
	}

	public void setInvoiceNumber(final String pInvoiceNumber) {
		this.invoiceNumber = pInvoiceNumber;
	}

	/**
	 * @param pInwardActionType
	 *            the inwardActionType to set
	 */
	public void setInwardActionType(final InwardActionType pInwardActionType) {
		this.inwardActionType = pInwardActionType;
	}

	public void setInwardInvoiceStatus(
			final InwardInvoiceStatus pInwardInvoiceStatus) {
		this.inwardInvoiceStatus = pInwardInvoiceStatus;
	}

	public void setInwardReasonCodeDtos(
			List<AccountingInwardReasonCodeDto> pInwardReasonCodeDtos) {
		this.inwardReasonCodeDtos = pInwardReasonCodeDtos;
	}

	public void setIscAmountAccepted(final BigDecimal pIscAmountAccepted) {
		this.iscAmountAccepted = pIscAmountAccepted;
	}

	public void setIscAmountActual(final BigDecimal pIscAmountActual) {
		this.iscAmountActual = pIscAmountActual;
	}

	public void setIscAmountBilled(final BigDecimal pIscAmountBilled) {
		this.iscAmountBilled = pIscAmountBilled;
	}

	public void setIscPercentageAccepted(final BigDecimal pIscPercentageAccepted) {
		this.iscPercentageAccepted = pIscPercentageAccepted;
	}

	public void setIscPercentageActual(final BigDecimal pIscPercentageActual) {
		this.iscPercentageActual = pIscPercentageActual;
	}

	public void setIscPercentageBilled(final BigDecimal pIscPercentageBilled) {
		this.iscPercentageBilled = pIscPercentageBilled;
	}

	public void setMemoNumber(final String pMemoNumber) {
		this.memoNumber = pMemoNumber;
	}

	public void setMemoType(final MemoType pMemoType) {
		this.memoType = pMemoType;
	}

	public void setOId(Long pOId) {
		this.oId = pOId;
	}

	public void setOriginStation(final String pOriginStation) {
		this.originStation = pOriginStation;
	}

	public void setOtherChargesAccepted(final BigDecimal pOtherChargesAccepted) {
		this.otherChargesAccepted = pOtherChargesAccepted;
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
	 * @param pPartShipmentIndicator
	 *            the partShipmentIndicator to set
	 */
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

	public void setQueueReason(final String pQueueReason) {
		this.queueReason = pQueueReason;
	}

	public void setQueueType(final InwardQueueType pQueueType) {
		this.queueType = pQueueType;
	}

	public void setRejectionMemostage(
			final RejectionMemoStageType pRejectionMemostage) {
		this.rejectionMemostage = pRejectionMemostage;
	}

	/**
	 * @param pRejectOtherChargesBreakdownDtos
	 *            the rejectOtherChargesBreakdownDtos to set
	 */
	public void setRejectOtherChargesBreakdownDtos(
			final List<AccountingOtherChargesBreakdownDto> pRejectOtherChargesBreakdownDtos) {
		this.rejectOtherChargesBreakdownDtos = pRejectOtherChargesBreakdownDtos;
	}

	/**
	 * @param pRejectReasonCodeDtos
	 *            the rejectReasonCodeDtos to set
	 */
	public void setRejectReasonCodeDtos(
			final List<AccountingInwardReasonCodeDto> pRejectReasonCodeDtos) {
		this.rejectReasonCodeDtos = pRejectReasonCodeDtos;
	}

	/**
	 * @param pRejectRemarksDtos
	 *            the rejectRemarksDtos to set
	 */
	public void setRejectRemarksDtos(final List<String> pRejectRemarksDtos) {
		this.rejectRemarksDtos = pRejectRemarksDtos;
	}

	/**
	 * @param pRemarks
	 *            the remarks to set
	 */
	public void setRemarks(final List<String> pRemarks) {
		this.remarks = pRemarks;
	}

	public void setSectorDestination(final String pSectorDestination) {
		this.sectorDestination = pSectorDestination;
	}

	public void setSectorOrigin(final String pSectorOrigin) {
		this.sectorOrigin = pSectorOrigin;
	}

	/**
	 * @param pSisIndicator
	 *            the sisIndicator to set
	 */
	public void setSisIndicator(final Boolean pSisIndicator) {
		this.sisIndicator = pSisIndicator;
	}

	/**
	 * @param pToStation
	 *            the toStation to set
	 */
	public void setToStation(final String pToStation) {
		this.toStation = pToStation;
	}

	public void setValuationChargesAccepted(
			final BigDecimal pValuationChargesAccepted) {
		this.valuationChargesAccepted = pValuationChargesAccepted;
	}

	public void setValuationChargesActual(
			final BigDecimal pValuationChargesActual) {
		this.valuationChargesActual = pValuationChargesActual;
	}

	public void setValuationChargesBilled(
			final BigDecimal pValuationChargesBilled) {
		this.valuationChargesBilled = pValuationChargesBilled;
	}

	public void setVatAmountAccepted(final BigDecimal pVatAmountAccepted) {
		this.vatAmountAccepted = pVatAmountAccepted;
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

	public void setWeightChargesAccepted(final BigDecimal pWeightChargesAccepted) {
		this.weightChargesAccepted = pWeightChargesAccepted;
	}

	public void setWeightChargesActual(final BigDecimal pWeightChargesActual) {
		this.weightChargesActual = pWeightChargesActual;
	}

	public void setWeightChargesBilled(final BigDecimal pWeightChargesBilled) {
		this.weightChargesBilled = pWeightChargesBilled;
	}

	/**
	 * Creates the String representation of
	 * <code>InterlineAgreement Entry</code>.
	 * <p>
	 * This will return the String representation based on InterlineAgreement
	 * Entry.
	 * <p>
	 * 
	 * @return the String representation of
	 *         <code>InterlineAgreement Entry</code>.
	 */
	public String toString() {
		String csvString = new String();
		csvString = this.buildQueueCSVString();
		return csvString;

	}

	/**
	 * Creates the String representation of <code>Interline Proviso Entry</code>
	 * .
	 * <p>
	 * This will return the String representation based on Interline Proviso
	 * Entry.
	 * <p>
	 * 
	 * @return the String representation of <code>Interline Proviso Entry</code>
	 *         .
	 */
	private String buildQueueCSVString() {
		final StringBuffer csvString = new StringBuffer();

		if (this.getInvoiceNumber() != null) {
			csvString
					.append(this.prefixSuffixByQuotes(this.getInvoiceNumber()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		if (this.getInvoiceDate() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.dateToString(this
					.getInvoiceDate())));
		} else {
			csvString.append(this.prefixSuffixByQuotes(INDEF));
		}
		if (this.getInvoiceCurrency() != null) {
			csvString.append(this.prefixSuffixByQuotes(this
					.getInvoiceCurrency()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getAwbInvoiceStatus() != null) {
			csvString.append(this.prefixSuffixByQuotes(this
					.getAwbInvoiceStatus().getStringValue()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getSisIndicator() == true) {
			csvString.append(this.prefixSuffixByQuotes(YES_LITERAL));
		} else {
			csvString.append(this.prefixSuffixByQuotes(NO_LITERAL));
		}
		if (this.getBillingCarrier() != null) {
			csvString
					.append(this.prefixSuffixByQuotes(this.getBillingCarrier()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getMemoType() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getMemoType()
					.getStringValue()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getMemoNumber() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getMemoNumber()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getPaymentType() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getPaymentType()
					.getStringValue()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getAWBNumberDisplay() != null) {
			csvString.append(this.prefixSuffixByQuotes(this
					.getAWBNumberDisplay()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getExecutionDate() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.dateToString(this
					.getExecutionDate())));
		} else {
			csvString.append(this.prefixSuffixByQuotes(INDEF));
		}
		if (this.getOriginStation() != null) {
			csvString
					.append(this.prefixSuffixByQuotes(this.getOriginStation()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getDestinationStation() != null) {
			csvString.append(this.prefixSuffixByQuotes(this
					.getDestinationStation()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getSectorOrigin() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getSectorOrigin()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getSectorDestination() != null) {
			csvString.append(this.prefixSuffixByQuotes(this
					.getSectorDestination()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getAwbTotalBilled() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getAwbTotalBilled()
					.toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getWeightChargesBilled() != null) {
			csvString.append(this.prefixSuffixByQuotes(this
					.getWeightChargesBilled().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getValuationChargesBilled() != null) {
			csvString.append(this.prefixSuffixByQuotes(this
					.getValuationChargesBilled().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getOtherChargesBilled() != null) {
			csvString.append(this.prefixSuffixByQuotes(this
					.getOtherChargesBilled().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getIscPercentageBilled() != null) {
			csvString.append(this.prefixSuffixByQuotes(this
					.getIscPercentageBilled().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getIscAmountBilled() != null) {
			csvString.append(this.prefixSuffixByQuotes(this
					.getIscAmountBilled().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getVatAmountBilled() != null) {
			csvString.append(this.prefixSuffixByQuotes(this
					.getVatAmountBilled().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		return csvString.toString();
	}

	/**
	 * Converts given date object into equivalent String object.
	 * 
	 * @param pDate
	 *            the date object.
	 * 
	 * @return String value of the <code>pDate</code>.
	 * 
	 */
	private String dateToString(final Date pDate) {
		final Format aSimpleDateFormat = new SimpleDateFormat(
				FrameworkConstants.DATEFORMAT, Locale.UK);
		return ContractUtility.convertToUpperCase(aSimpleDateFormat
				.format(pDate));
	}

	/**
	 * prefixes and suffixes a given string with open quotes.
	 * 
	 * @param pString
	 *            the new value of the <code>value</code>.
	 * 
	 * @return aModifiedString the new value of the <code>aModifiedString</code>
	 *         .
	 * 
	 */
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

	public BigDecimal getOpenProvisionAmount() {
		return openProvisionAmount;
	}

	public void setOpenProvisionAmount(BigDecimal openProvisionAmount) {
		this.openProvisionAmount = openProvisionAmount;
	}

	public String getPayableCarrier() {
		return payableCarrier;
	}

	public void setPayableCarrier(String payableCarrier) {
		this.payableCarrier = payableCarrier;
	}
	
}
