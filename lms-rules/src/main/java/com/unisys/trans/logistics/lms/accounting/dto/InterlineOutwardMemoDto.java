package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Transient;

import org.apache.commons.collections.CollectionUtils;


import com.unisys.trans.logistics.lms.accounting.dto.constants.ApprovalStatus;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ClearingHouseType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoStatus;
import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RejectionMemoStageType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.domain.UserAudit;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.StringUtility;

public class InterlineOutwardMemoDto extends PersistenceObjectDto {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Long OId;
    private String billedCarrier;
    private MemoType memoType;
    private Date memoDate;
    private String memoInvoiceNumber;
    private Long invoiceBillingDate;
    private BigDecimal netAmout;
    private String currencyAdjustmentInd;
    private BigDecimal weightCharges;
    private BigDecimal valuationCharges;
    private BigDecimal otherCharges;
    private BigDecimal iscSubjectedAmount;
    private BigDecimal iscPercentage;
    private BigDecimal iscAmount;
    private BigDecimal vatAmount;
    private String reasonCode;
    private String sisReferenceNumber;
    private String airlineRefNumber;
    private String reasonDescription;
    private boolean awbBreakdownIndicator = false;
    private ApprovalStatus approvalStatus;
    private MemoStatus memoStatus;
    private Date invoiceDate;
    private String invoiceNumber;
    private String createdUser;
    private Date creationDate;
    private InterlineOutwardMemoAwbDto awbDto;
    // supplementary fields
    private boolean create;
    private boolean delete;
    private boolean update;
    private boolean inter;
    private boolean error;
    private int versionIdentifier;
    private Date fromDate;
    private Date toDate;
    private int memoNumberLength = 11;
    private boolean checkApproval;
    private boolean checkRelease;
    private String memoBMCMNumber;
    private String remarks;
    private String reasonDescriptionDisplay;
	/** Attribute to hold <code>reasonDescription</code> property. */
    private List<String> reasonDescriptionDtos;

    private String memoNumber;
    
    private Boolean partShipmentIndicator;
    
    private String ourReference;
    
    private List<String> references;
    
    private String airlineOwnuse;
    
    private String actualDataLine;
    /**
     * Attribute to hold <code>invoiceAwbId</code> property.
     */
    private BigDecimal invoiceAwbId;
    /**
     * Attribute to hold <code>memoType</code> property.
     */
    private MemoType memoIndicatiorType;
    /**
     * Attribute to hold <code>originalInvoiceBillingMonth</code> property.
     */
    private String originalInvoiceBillingMonth;
    /**
     * Attribute to hold <code>originalInvoiceBillingPeriod</code> property.
     */
    private Integer originalInvoiceBillingPeriod;
    /**
     * Attribute to hold <code>originalInvoiceDate</code> property.
     */
    private Date originalInvoiceDate;

    /**
     * Attribute to hold <code>originalInvoiceNumber</code> property.
     */
    private String originalInvoiceNumber;
    /**
     * Attribute to hold <code>originalRejectionNumber</code> property.
     */
    private String originalMemoNumber;
    /**
     * Attribute to hold <code>originalRejectionNumber</code> property.
     */
    private String originalRejectionNumber;
    
    private String billingCurrency;
    
    private RejectionMemoStageType rejectionMemostage;
    
    private Boolean attachmentIndicator;
    
    private AccountingAttachmentDto accountingAttachmentDto;
	
	private List<AccountingAttachmentDto> accountingAttachmentDtos;

	private BigDecimal awbTotalActual;

	private BigDecimal awbTotalBilled;

	private BigDecimal awbTotalDiff;
	
	private BigDecimal awbTotalAccepted;
    
	private BigDecimal iscAmountActual;

	private BigDecimal iscAmountBilled;

	private BigDecimal iscAmountDiff;
	
	private BigDecimal iscAmountAccepted;

	private BigDecimal iscPercentageActual;

	private BigDecimal iscPercentageBilled;

	private BigDecimal iscPercentageDiff;
	
	private BigDecimal iscPercentageAccepted;

	private BigDecimal amountSubToISCActual;

	private BigDecimal amountSubToISCBilled;

	private BigDecimal amountSubToISCAccepted;

	private BigDecimal amountSubToISCDiff;
	
	private BigDecimal otherChargesActual;

	private BigDecimal otherChargesBilled;

	private BigDecimal otherChargesDiff;
	
	private BigDecimal otherChargesAccepted;
    
	private BigDecimal totalProrateAmountDiff;

	private BigDecimal totalVatBaseAmountDiff;

	private BigDecimal totalVatCalAmountDiff;

	private BigDecimal totalVatPercentageDiff;

	private BigDecimal valuationChargesActual;

	private BigDecimal valuationChargesBilled;

	private BigDecimal valuationChargesDiff;
	
	private BigDecimal valuationChargesAccepted;

	private BigDecimal vatAmountActual;

	private BigDecimal vatAmountBilled;

	private BigDecimal vatAmountDiff;
	
	private BigDecimal vatAmountAccepted; 

	private BigDecimal weightChargesActual;

	private BigDecimal weightChargesBilled;

	private BigDecimal weightChargesDiff;
	
	private BigDecimal weightChargesAccepted;
	
    private AirWaybillNumberDto airWaybillNumber;
    private ClearingHouseType clearingHouseType;
    private String specificAirline;
    private String carrier;

	private String billingYearMonth;

	private Integer billingPeriod;
	
	private Set<String> carriers;
	
	private String rejectionBillingCarrier;
	
	private AirWaybillNumberDto awbNumber;

	private List<String> reasonCodeList;

	private UserAuditDto userAudit;
	
	private InvoiceStatusType invoiceStatus;
	
	private Boolean sisIndicator;

	public Boolean getSisIndicator() {
		return sisIndicator;
	}

	public void setSisIndicator(Boolean sisIndicator) {
		this.sisIndicator = sisIndicator;
	}

	private boolean checkmemoStatus;
		
	  
   public boolean isCheckmemoStatus() {
		return checkmemoStatus;
	}

	public void setCheckmemoStatus(boolean checkmemoStatus) {
		this.checkmemoStatus = checkmemoStatus;
	}

public InvoiceStatusType getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(InvoiceStatusType invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

public RejectionMemoStageType getRejectionMemostage() {
		return rejectionMemostage;
	}

	public void setRejectionMemostage(RejectionMemoStageType rejectionMemostage) {
		this.rejectionMemostage = rejectionMemostage;
	}


    public Boolean isAttachmentIndicator() {
        if(null == attachmentIndicator) {
            attachmentIndicator = false;
        }

        return attachmentIndicator;
    }

    public void setAttachmentIndicator(Boolean attachmentIndicator) {
        if(null == attachmentIndicator) {
            attachmentIndicator = false;
        }
        this.attachmentIndicator = attachmentIndicator;
    }


    

    public AccountingAttachmentDto getAccountingAttachmentDto() {
        return accountingAttachmentDto;
    }

    public void setAccountingAttachmentDto(AccountingAttachmentDto accountingAttachmentDto) {
        this.accountingAttachmentDto = accountingAttachmentDto;
    }


	public List<AccountingAttachmentDto> getAccountingAttachmentDtos() {
		if (CollectionUtils.isEmpty(accountingAttachmentDtos)) {
			this.accountingAttachmentDtos = new ArrayList<AccountingAttachmentDto>();
		}
		return this.accountingAttachmentDtos;
	}

	public void setAccountingAttachmentDtos(List<AccountingAttachmentDto> accountingAttachmentDtos) {
		this.accountingAttachmentDtos = accountingAttachmentDtos;
	}
       
    public String getBillingCurrency() {
		return billingCurrency;
	}

	public void setBillingCurrency(String billingCurrency) {
		this.billingCurrency = billingCurrency;
	}

	public Boolean getPartShipmentIndicator() {
		return partShipmentIndicator;
	}

	public void setPartShipmentIndicator(Boolean partShipmentIndicator) {
		this.partShipmentIndicator = partShipmentIndicator;
	}

	public String getOurReference() {
		return ourReference;
	}

	public void setOurReference(String ourReference) {
		this.ourReference = ourReference;
	}

	public List<String> getReferences() {
		if (references == null) {
			references = new ArrayList<String>();
		}
		int referencesSize = references.size();
		for (int i = referencesSize; i < 5; i++) {
			references.add(new String());
		}
		return references;
	}

	public void setReferences(List<String> references) {
		this.references = references;
	}

	public String getAirlineOwnuse() {
		return airlineOwnuse;
	}

	public void setAirlineOwnuse(String airlineOwnuse) {
		this.airlineOwnuse = airlineOwnuse;
	}

	public String getActualDataLine() {
		return actualDataLine;
	}

	public void setActualDataLine(String actualDataLine) {
		this.actualDataLine = actualDataLine;
	}

	public BigDecimal getInvoiceAwbId() {
		return invoiceAwbId;
	}

	public void setInvoiceAwbId(BigDecimal invoiceAwbId) {
		this.invoiceAwbId = invoiceAwbId;
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

		public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


    public Long getOId() {
        return OId;
    }

    /**
     * @return the currencyAdjustmentInd
     */
    public String getCurrencyAdjustmentInd() {
        return currencyAdjustmentInd;
    }

    /**
     * @param currencyAdjustmentInd the currencyAdjustmentInd to set
     */
    public void setCurrencyAdjustmentInd(String currencyAdjustmentInd) {
        this.currencyAdjustmentInd = (currencyAdjustmentInd != null) ? currencyAdjustmentInd.toUpperCase() : currencyAdjustmentInd;
    }

    public void setOId(Long oId) {
        OId = oId;
    }

    public String getBilledCarrier() {
        return billedCarrier;
    }

    public void setBilledCarrier(String billedCarrier) {
        this.billedCarrier = (billedCarrier != null) ? billedCarrier.toUpperCase() : billedCarrier;
    }

    public MemoType getMemoType() {
        return memoType;
    }

    public void setMemoType(MemoType memoType) {
        this.memoType = memoType;
    }

    public Date getMemoDate() {
        return memoDate;
    }

    public void setMemoDate(Date memoDate) {
        this.memoDate = memoDate;
    }

    /**
     * @return the memoInvoiceNumber
     */
    public String getMemoInvoiceNumber() {
        return memoInvoiceNumber;
    }

    /**
     * @param memoInvoiceNumber
     *            the memoInvoiceNumber to set
     */
    public void setMemoInvoiceNumber(String memoInvoiceNumber) {
        this.memoInvoiceNumber = memoInvoiceNumber;
    }

    /**
     * @return the memoNumberLength
     */
    public int getMemoNumberLength() {
        return memoNumberLength;
    }

    /**
     * @param memoNumberLength
     *            the memoNumberLength to set
     */
    public void setMemoNumberLength(int memoNumberLength) {
        this.memoNumberLength = memoNumberLength;
    }

    public Long getInvoiceBillingDate() {
        return invoiceBillingDate;
    }

    public void setInvoiceBillingDate(Long invoiceBillingDate) {
        this.invoiceBillingDate = invoiceBillingDate;
    }

    public BigDecimal getNetAmout() {
        if (this.netAmout == null) {
            this.netAmout = BigDecimal.valueOf(0).setScale(2, BigDecimal.ROUND_HALF_UP);
        }
        return this.netAmout;
    }

    public void setNetAmout(BigDecimal netAmout) {
        this.netAmout = netAmout;
    }

    public BigDecimal getWeightCharges() {
        if (this.weightCharges == null) {
            this.weightCharges = BigDecimal.valueOf(0).setScale(2, BigDecimal.ROUND_HALF_UP);
        }
        return this.weightCharges;
    }

    public void setWeightCharges(BigDecimal weightCharges) {
        this.weightCharges = weightCharges;
    }

    public BigDecimal getValuationCharges() {
        if (this.valuationCharges == null) {
            this.valuationCharges = BigDecimal.valueOf(0).setScale(2, BigDecimal.ROUND_HALF_UP);
        }
        return this.valuationCharges;
    }

    public void setValuationCharges(BigDecimal valuationCharges) {
        this.valuationCharges = valuationCharges;
    }

    public BigDecimal getOtherCharges() {
        if (this.otherCharges == null) {
            this.otherCharges = BigDecimal.valueOf(0).setScale(2, BigDecimal.ROUND_HALF_UP);
        }
        return this.otherCharges;
    }

    public void setOtherCharges(BigDecimal otherCharges) {
        this.otherCharges = otherCharges;
    }

    public BigDecimal getIscSubjectedAmount() {
        if (this.iscSubjectedAmount == null) {
            this.iscSubjectedAmount = BigDecimal.valueOf(0).setScale(2, BigDecimal.ROUND_HALF_UP);
        }
        return this.iscSubjectedAmount;
    }

    public void setIscSubjectedAmount(BigDecimal iscSubjectedAmount) {
        this.iscSubjectedAmount = iscSubjectedAmount;
    }

    public BigDecimal getIscPercentage() {
        if (this.iscPercentage == null) {
            this.iscPercentage = BigDecimal.valueOf(0).setScale(2, BigDecimal.ROUND_HALF_UP);
        }
        return this.iscPercentage;
    }

    public void setIscPercentage(BigDecimal iscPercentage) {
        this.iscPercentage = iscPercentage;
    }

    public BigDecimal getIscAmount() {
        if (this.iscAmount == null) {
            this.iscAmount = BigDecimal.valueOf(0).setScale(2, BigDecimal.ROUND_HALF_UP);
        }
        return this.iscAmount;
    }

    public void setIscAmount(BigDecimal iscAmount) {
        this.iscAmount = iscAmount;
    }

    public BigDecimal getVatAmount() {
        if (this.vatAmount == null) {
            this.vatAmount = BigDecimal.valueOf(0).setScale(2, BigDecimal.ROUND_HALF_UP);
        }
        return this.vatAmount;
    }

    public void setVatAmount(BigDecimal vatAmount) {
        this.vatAmount = vatAmount;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = (reasonCode != null) ? reasonCode.toUpperCase() : reasonCode;
    }

    public String getSisReferenceNumber() {
        return sisReferenceNumber;
    }

    public void setSisReferenceNumber(String sisReferenceNumber) {
        this.sisReferenceNumber = sisReferenceNumber;
    }

    public String getAirlineRefNumber() {
        return airlineRefNumber;
    }

    public void setAirlineRefNumber(String airlineRefNumber) {
        this.airlineRefNumber = airlineRefNumber;
    }

    public String getReasonDescription() {
        return reasonDescription;
    }

    public void setReasonDescription(String reasonDescription) {
        this.reasonDescription = reasonDescription;
    }

    public boolean isAwbBreakdownIndicator() {
        return awbBreakdownIndicator;
    }

    public void setAwbBreakdownIndicator(boolean awbBreakdownIndicator) {
        this.awbBreakdownIndicator = awbBreakdownIndicator;
    }

    public ApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public MemoStatus getMemoStatus() {
        return memoStatus;
    }

    public void setMemoStatus(MemoStatus memoStatus) {
        this.memoStatus = memoStatus;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public InterlineOutwardMemoAwbDto getAwbDto() {
        if (this.awbDto == null) {
            this.awbDto = new InterlineOutwardMemoAwbDto();
        }
        return awbDto;
    }

    public void setAwbDto(InterlineOutwardMemoAwbDto interlineOutwardMemoAwbDto) {
        this.awbDto = interlineOutwardMemoAwbDto;
    }

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

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public int getVersionIdentifier() {
        return versionIdentifier;
    }

    public void setVersionIdentifier(int versionIdentifier) {
        this.versionIdentifier = versionIdentifier;
    }

    /**
     * @return the invoiceDate
     */
    public Date getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * @param invoiceDate
     *            the invoiceDate to set
     */
    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    /**
     * @return the invoiceNumber
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * @param invoiceNumber
     *            the invoiceNumber to set
     */
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    
    public String getMemoNumber() {
        if (this.memoNumber != null)
            return this.memoNumber;
        else if (this.OId != null) {
            setMemoNumber(buildMemoNumber());
            return this.memoNumber;
        }
        else
            return null;
	}
    
    private String buildMemoNumber() {
        if (this.OId == null)
            return null;
        String oid = Long.toString(this.OId);
        String nMemoType = this.memoType.name();
        int prepend = memoNumberLength - (nMemoType.length() + oid.length());
        StringBuilder rMemoNumber = new StringBuilder(nMemoType);
        while (prepend-- > 0)
            rMemoNumber.append(StringUtility.ZERO_STRING);
        rMemoNumber.append(oid);
        return rMemoNumber.toString();
    }

	public void setMemoNumber(String memoNumber) {
		this.memoNumber = memoNumber;
	}

	public Long getOIDForMemoNumber(String memoNumber) {
        int index = 0;
        char[] chars = memoNumber.toCharArray();
        for (int c : chars) {
            if (c >= 48 && c <= 57)
                break;
            index++;
        }
        String oidString = memoNumber.substring(index);
        if (oidString.length() > 0)
            return Long.parseLong(oidString);
        else
            return 0L;
    }

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

    public boolean isCheckApproval() {
        return checkApproval;
    }

    public void setCheckApproval(boolean checkApproval) {
        this.checkApproval = checkApproval;
    }

    public boolean isCheckRelease() {
        return checkRelease;
    }

    public void setCheckRelease(boolean checkRelease) {
        this.checkRelease = checkRelease;
    }

    public void setReasonDescriptionDtos(final List<String> pReasonDescriptionDtos) {
        this.reasonDescriptionDtos = pReasonDescriptionDtos;
    }

    public List<String> getReasonDescriptionDtos() {
        if (this.reasonDescriptionDtos == null) {
            this.reasonDescriptionDtos = new ArrayList<>();
        }
        if (this.reasonDescriptionDtos.isEmpty()) {
            this.reasonDescriptionDtos.add(FrameworkConstants.EMPTY_STRING);
        }
        return this.reasonDescriptionDtos;
    }
    
        
    public String getReasonDescriptionDisplay() {
        StringBuilder displayValue = new StringBuilder();
        String NEW_LINE = "<br>";
        if (this.reasonDescriptionDtos != null && CollectionUtils.isNotEmpty(this.reasonDescriptionDtos)) {
            boolean addNewLine = false;
            for (String desc : reasonDescriptionDtos) {
                displayValue = (addNewLine) ? displayValue.append(NEW_LINE) : displayValue;
                displayValue.append(desc);
                addNewLine = true;
            }
        }
        this.reasonDescriptionDisplay = displayValue.toString(); 
        return reasonDescriptionDisplay ;
    }

    
    /**
     * @return the memoBMCMNumber
     */
    public String getMemoBMCMNumber() {
        return memoBMCMNumber;
    }

    /**
     * @param memoBMCMNumber the memoBMCMNumber to set
     */
    public void setMemoBMCMNumber(String memoBMCMNumber) {
        this.memoBMCMNumber = memoBMCMNumber;
    }

	
				
	public BigDecimal getAwbTotalAccepted() {
		return awbTotalAccepted;
	}

	public void setAwbTotalAccepted(BigDecimal awbTotalAccepted) {
		this.awbTotalAccepted = awbTotalAccepted;
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

	public BigDecimal getVatAmountAccepted() {
		return vatAmountAccepted;
	}

	public void setVatAmountAccepted(BigDecimal vatAmountAccepted) {
		this.vatAmountAccepted = vatAmountAccepted;
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

	public BigDecimal getWeightChargesAccepted() {
		return weightChargesAccepted;
	}

	public void setWeightChargesAccepted(BigDecimal weightChargesAccepted) {
		this.weightChargesAccepted = weightChargesAccepted;
	}

	public BigDecimal getAwbTotalActual() {
		return awbTotalActual;
	}

	public void setAwbTotalActual(BigDecimal awbTotalActual) {
		this.awbTotalActual = awbTotalActual;
	}

	public BigDecimal getAwbTotalBilled() {
		return awbTotalBilled;
	}

	public void setAwbTotalBilled(BigDecimal awbTotalBilled) {
		this.awbTotalBilled = awbTotalBilled;
	}

	public BigDecimal getAwbTotalDiff() {
		return awbTotalDiff;
	}

	public void setAwbTotalDiff(BigDecimal awbTotalDiff) {
		this.awbTotalDiff = awbTotalDiff;
	}

	public BigDecimal getIscAmountActual() {
		return iscAmountActual;
	}

	public void setIscAmountActual(BigDecimal iscAmountActual) {
		this.iscAmountActual = iscAmountActual;
	}

	public BigDecimal getIscAmountBilled() {
		return iscAmountBilled;
	}

	public void setIscAmountBilled(BigDecimal iscAmountBilled) {
		this.iscAmountBilled = iscAmountBilled;
	}

	public BigDecimal getIscAmountDiff() {
		return iscAmountDiff;
	}

	public void setIscAmountDiff(BigDecimal iscAmountDiff) {
		this.iscAmountDiff = iscAmountDiff;
	}

	public BigDecimal getIscPercentageActual() {
		return iscPercentageActual;
	}

	public void setIscPercentageActual(BigDecimal iscPercentageActual) {
		this.iscPercentageActual = iscPercentageActual;
	}

	public BigDecimal getIscPercentageBilled() {
		return iscPercentageBilled;
	}

	public void setIscPercentageBilled(BigDecimal iscPercentageBilled) {
		this.iscPercentageBilled = iscPercentageBilled;
	}

	public BigDecimal getIscPercentageDiff() {
		return iscPercentageDiff;
	}

	public void setIscPercentageDiff(BigDecimal iscPercentageDiff) {
		this.iscPercentageDiff = iscPercentageDiff;
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

	public BigDecimal getAmountSubToISCDiff() {
		return amountSubToISCDiff;
	}

	public void setAmountSubToISCDiff(BigDecimal amountSubToISCDiff) {
		this.amountSubToISCDiff = amountSubToISCDiff;
	}

	public BigDecimal getOtherChargesActual() {
		return otherChargesActual;
	}

	public void setOtherChargesActual(BigDecimal otherChargesActual) {
		this.otherChargesActual = otherChargesActual;
	}

	public BigDecimal getOtherChargesBilled() {
		return otherChargesBilled;
	}

	public void setOtherChargesBilled(BigDecimal otherChargesBilled) {
		this.otherChargesBilled = otherChargesBilled;
	}

	public BigDecimal getOtherChargesDiff() {
		return otherChargesDiff;
	}

	public void setOtherChargesDiff(BigDecimal otherChargesDiff) {
		this.otherChargesDiff = otherChargesDiff;
	}

	public BigDecimal getTotalProrateAmountDiff() {
		return totalProrateAmountDiff;
	}

	public void setTotalProrateAmountDiff(BigDecimal totalProrateAmountDiff) {
		this.totalProrateAmountDiff = totalProrateAmountDiff;
	}

	public BigDecimal getTotalVatBaseAmountDiff() {
		return totalVatBaseAmountDiff;
	}

	public void setTotalVatBaseAmountDiff(BigDecimal totalVatBaseAmountDiff) {
		this.totalVatBaseAmountDiff = totalVatBaseAmountDiff;
	}

	public BigDecimal getTotalVatCalAmountDiff() {
		return totalVatCalAmountDiff;
	}

	public void setTotalVatCalAmountDiff(BigDecimal totalVatCalAmountDiff) {
		this.totalVatCalAmountDiff = totalVatCalAmountDiff;
	}

	public BigDecimal getTotalVatPercentageDiff() {
		return totalVatPercentageDiff;
	}

	public void setTotalVatPercentageDiff(BigDecimal totalVatPercentageDiff) {
		this.totalVatPercentageDiff = totalVatPercentageDiff;
	}

	public BigDecimal getValuationChargesActual() {
		return valuationChargesActual;
	}

	public void setValuationChargesActual(BigDecimal valuationChargesActual) {
		this.valuationChargesActual = valuationChargesActual;
	}

	public BigDecimal getValuationChargesBilled() {
		return valuationChargesBilled;
	}

	public void setValuationChargesBilled(BigDecimal valuationChargesBilled) {
		this.valuationChargesBilled = valuationChargesBilled;
	}

	public BigDecimal getValuationChargesDiff() {
		return valuationChargesDiff;
	}

	public void setValuationChargesDiff(BigDecimal valuationChargesDiff) {
		this.valuationChargesDiff = valuationChargesDiff;
	}

	public BigDecimal getVatAmountActual() {
		return vatAmountActual;
	}

	public void setVatAmountActual(BigDecimal vatAmountActual) {
		this.vatAmountActual = vatAmountActual;
	}

	public BigDecimal getVatAmountBilled() {
		return vatAmountBilled;
	}

	public void setVatAmountBilled(BigDecimal vatAmountBilled) {
		this.vatAmountBilled = vatAmountBilled;
	}

	public BigDecimal getVatAmountDiff() {
		return vatAmountDiff;
	}

	public void setVatAmountDiff(BigDecimal vatAmountDiff) {
		this.vatAmountDiff = vatAmountDiff;
	}

	public BigDecimal getWeightChargesActual() {
		return weightChargesActual;
	}

	public void setWeightChargesActual(BigDecimal weightChargesActual) {
		this.weightChargesActual = weightChargesActual;
	}

	public BigDecimal getWeightChargesBilled() {
		return weightChargesBilled;
	}

	public void setWeightChargesBilled(BigDecimal weightChargesBilled) {
		this.weightChargesBilled = weightChargesBilled;
	}

	public BigDecimal getWeightChargesDiff() {
		return weightChargesDiff;
	}

	public void setWeightChargesDiff(BigDecimal weightChargesDiff) {
		this.weightChargesDiff = weightChargesDiff;
	}

	public AirWaybillNumberDto getAirWaybillNumber() {
		return airWaybillNumber;
	}

	public void setAirWaybillNumber(AirWaybillNumberDto airWaybillNumber) {
		this.airWaybillNumber = airWaybillNumber;
	}

	public ClearingHouseType getClearingHouseType() {
		return clearingHouseType;
	}

	public void setClearingHouseType(ClearingHouseType clearingHouseType) {
		this.clearingHouseType = clearingHouseType;
	}

	public String getSpecificAirline() {
		return specificAirline;
	}

	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
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

	public Set<String> getCarriers() {
		return carriers;
	}

	public void setCarriers(Set<String> carriers) {
		this.carriers = carriers;
	}

	public Boolean getAttachmentIndicator() {
		return attachmentIndicator;
	}

	public String getRejectionBillingCarrier() {
		return rejectionBillingCarrier;
	}

	public void setRejectionBillingCarrier(String rejectionBillingCarrier) {
		this.rejectionBillingCarrier = rejectionBillingCarrier;
	}

	public AirWaybillNumberDto getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(AirWaybillNumberDto awbNumber) {
		this.awbNumber = awbNumber;
	}

	public List<String> getReasonCodeList() {
		return reasonCodeList;
	}

	public void setReasonCodeList(List<String> reasonCodeList) {
		this.reasonCodeList = reasonCodeList;
	}

	public UserAuditDto getUserAudit() {
		return userAudit;
	}

	public void setUserAudit(UserAuditDto userAudit) {
		this.userAudit = userAudit;
	}
	
	
}
