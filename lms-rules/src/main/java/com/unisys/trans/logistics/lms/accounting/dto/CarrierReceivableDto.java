/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AmountType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ProrationType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableType;
import com.unisys.trans.logistics.lms.framework.constants.CRAParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class CarrierReceivableDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>prorationType</code> property.
     */
    private ProrationType prorationType;
    private AmountType amountType;

    public AmountType getAmountType() {
		return this.amountType;
	}

	public void setAmountType(AmountType amountType) {
		this.amountType = amountType;
	}
	/**
     * Attribute to hold <code>active</code> property.
     */
    private Boolean active;

    /**
     * Attribute to hold <code>adjustmentDto</code> property.
     */
    private AdjustmentDto adjustmentDto;

    /**
     * Attribute to hold <code>userAudit</code> property.
     */
    private UserAuditDto userAudit;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>prorateIndicator</code> property.
     */
    private String prorateIdentifier;

    public String getProrateIdentifier() {
		return prorateIdentifier;
	}

	public void setProrateIdentifier(String prorateIdentifier) {
		this.prorateIdentifier = prorateIdentifier;
	}
	/**
     * Attribute to hold <code>interlineServiceCommissionPercentage</code> property.
     */
    private BigDecimal interlineServiceCommissionPercentage;

    /**
     * Attribute to hold <code>amountToBeBilled</code> property.
     */
    private BigDecimal amountToBeBilled;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>paymentCurrencyCode</code> property.
     */
    private String paymentCurrencyCode;

    /**
     * Attribute to hold <code>status</code> property.
     */
    private ReceivableStatusType status;

    /**
     * Attribute to hold <code>otherChargeSplitDtos</code> property.
     */
    private List<OtherChargeSplitDto> carrierReceivableOtherChargeSplitDtos;

    /**
     * Attribute to hold <code>billingCommissionAmount</code> property.
     */
    private BigDecimal billingAmountToBeBilled;

    /**
     * Attribute to hold <code>commissionAmount</code> property.
     */
    private BigDecimal interlineServiceCommissionAmount;

    /**
     * Attribute to hold <code>hostCommissionAmount</code> property.
     */
    private BigDecimal hostAmountToBeBilled;

    /**
     * Attribute to hold <code>hostCurrencyCode</code> property.
     */
    private String hostCurrencyCode;

    private String prorationCurrency;

    /**
     * Attribute to hold <code>invoiceDate</code> property.
     */

    private Date invoiceDate;

    /**
     * Attribute to hold <code>invoiceNumber</code> property.
     */
    private String invoiceNumber;

    /**
     * Attribute to hold <code>invoiceRemarks</code> property.
     */
    private String invoiceRemarks;

    /**
     * Attribute to hold <code>weightCharges</code> property.
     */
    private BigDecimal weightCharges;

    /**
     * Attribute to hold <code>valuationCharges</code> property.
     */
    private BigDecimal valuationCharges;

    /**
     * Attribute to hold <code>totalOtherCharges</code> property.
     */
    private BigDecimal totalOtherCharges;

    /**
     * Attribute to hold <code>totalOtherChargesDueCarrier</code> property.
     */
    private BigDecimal totalOtherChargesDueCarrier;

    /**
     * Attribute to hold <code>totalOtherChargesDueAgent</code> property.
     */
    private BigDecimal totalOtherChargesDueAgent;

    /**
     * Attribute to hold <code>partShipmentIndicator</code> property.
     */

    private ReceivableType receivableType;

    private boolean partShipmentIndicator;

    private String billingCurrencyCode;

    private String origin;

    private String destination;

    private CRAParticipantAccountType invoiceType;

    private InvoiceStatusType invoiceStatus;
    
    private BigDecimal prorPercent;
    
    private String currencyAdjIndicator;

	private List<CarrierReceivableProratedSegmentDto> carrierReceivableProratedSegmentDtos;
	
	private boolean delIndicator;

	public String getCurrencyAdjIndicator() {
		return currencyAdjIndicator;
	}
	
	public void setCurrencyAdjIndicator(String currencyAdjIndicator) {
		this.currencyAdjIndicator = currencyAdjIndicator;
	}
	
	public BigDecimal getProrPercent() {
		return prorPercent;
	}
	
	public void setProrPercent(BigDecimal prorPercent) {
		this.prorPercent = prorPercent;
	}
    
    public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
private Boolean onHold;
	

	public Boolean getOnHold() {
		return this.onHold;
	}

	public void setOnHold(Boolean onHold) {
		this.onHold = onHold;
	}

	//item 317
	
	
//added AWBNumber
    
    private String awbNumber;
    public String getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}

	private String remarks;

    /**
     * @return the active
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(Boolean pActive) {
        this.active = pActive;
    }

    /**
     * @return the adjustmentDto
     */
    public AdjustmentDto getAdjustmentDto() {
        return this.adjustmentDto;
    }

    /**
     * @param adjustmentDto the adjustmentDto to set
     */
    public void setAdjustmentDto(AdjustmentDto pAdjustmentDto) {
        this.adjustmentDto = pAdjustmentDto;
    }

    /**
     * @return the userAudit
     */
    public UserAuditDto getUserAudit() {
        return this.userAudit;
    }

    /**
     * @param userAudit the userAudit to set
     */
    public void setUserAudit(UserAuditDto pUserAudit) {
        this.userAudit = pUserAudit;
    }

    /**
     * Gets the <code>amountToBeBilled</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountToBeBilled</code> property.
     */
    public BigDecimal getAmountToBeBilled() {
        return this.amountToBeBilled;
    }

    /**
     * Gets the <code>carrierCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>carrierCode</code> property.
     */

    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Gets the <code>interlineServiceCommissionPercentage</code> property.
     * <p>
     * 
     * @return the current value of the <code>interlineServiceCommissionPercentage</code> property.
     */

    public BigDecimal getInterlineServiceCommissionPercentage() {
        return interlineServiceCommissionPercentage;
    }

    /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */

    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>paymentCurrencyCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>paymentCurrencyCode</code> property.
     */
    public String getPaymentCurrencyCode() {
        return this.paymentCurrencyCode;
    }

    /**
     * Gets the <code>prorateIdentifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>prorateIdentifier</code> property.
     */
  /*  public Long getProrateIdentifier() {
        return this.prorateIdentifier;
    }
*/
    /**
     * Gets the <code>prorationType</code> property.
     * <p>
     * 
     * @return the current value of the <code>prorationType</code> property.
     */
    public ProrationType getProrationType() {
        return this.prorationType;
    }

    /**
     * Gets the <code>status</code> property.
     * <p>
     * 
     * @return the current value of the <code>status</code> property.
     */
    public ReceivableStatusType getStatus() {
        return this.status;
    }

    /**
     * Sets the <code>amountToBeBilled</code> property.
     * <p>
     * 
     * @param pAuthorizationCode
     *            the current value of the <code>amountToBeBilled</code> property.
     */
    public void setAmountToBeBilled(final BigDecimal pAmountToBeBilled) {
        this.amountToBeBilled = pAmountToBeBilled;
    }

    /**
     * Sets the <code>carrierCode</code> property.
     * <p>
     * 
     * @param pCarrierCode
     *            the current value of the <code>carrierCode</code> property.
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);
    }

    /**
     * Sets the <code>interlineServiceCommissionPercentage</code> property.
     * <p>
     * 
     * @param pInterlineServiceCommissionPercentage
     *            the current value of the <code>interlineServiceCommissionPercentage</code> property.
     */
    public
                void
                setInterlineServiceCommissionPercentage(final BigDecimal pInterlineServiceCommissionPercentage) {
        this.interlineServiceCommissionPercentage = pInterlineServiceCommissionPercentage;
    }

    /**
     * Sets the <code>oId</code> property.
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * @return the billingCurrencyCode
     */
    public String getBillingCurrencyCode() {
        return billingCurrencyCode;
    }

    /**
     * @param billingCurrencyCode the billingCurrencyCode to set
     */
    public void setBillingCurrencyCode(String billingCurrencyCode) {
        this.billingCurrencyCode = billingCurrencyCode;
    }

    /**
     * Sets the <code>paymentCurrencyCode</code> property.
     * <p>
     * 
     * @param pPaymentCurrencyCode
     *            the current value of the <code>paymentCurrencyCode</code> property.
     */
    public void setPaymentCurrencyCode(final String pPaymentCurrencyCode) {
        this.paymentCurrencyCode = ContractUtility.convertToUpperCase(pPaymentCurrencyCode);
    }

    /**
     * Sets the <code>prorateIdentifier</code> property.
     * <p>
     * 
     * @param pProrateIdentifier
     *            the current value of the <code>prorateIdentifier</code> property.
     */
/*    public void setProrateIdentifier(final Long pProrateIdentifier) {
        this.prorateIdentifier = pProrateIdentifier;
    }*/

    /**
     * Sets the <code>prorationType</code> property.
     * <p>
     * 
     * @param pProrationType
     *            the current value of the <code>prorationType</code> property.
     */
    public void setProrationType(final ProrationType pProrationType) {
        this.prorationType = pProrationType;
    }

    /**
     * Sets the <code>status</code> property.
     * <p>
     * 
     * @param pStatus
     *            the current value of the <code>status</code> property.
     */
    public void setStatus(final ReceivableStatusType pStatus) {
        this.status = pStatus;
    }

    public List<OtherChargeSplitDto> getOtherChargeSplitDtos() {
        if (carrierReceivableOtherChargeSplitDtos == null)
        {
            carrierReceivableOtherChargeSplitDtos = new ArrayList<OtherChargeSplitDto>();
        }
        return carrierReceivableOtherChargeSplitDtos;
    }

    /**
     * @return the receivableType
     */
    public ReceivableType getReceivableType() {
        return receivableType;
    }

    /**
     * @param receivableType the receivableType to set
     */
    public void setReceivableType(ReceivableType receivableType) {
        this.receivableType = receivableType;
    }

    public void setOtherChargeSplitDtos(List<OtherChargeSplitDto> otherChargeSplitDtos) {
        this.carrierReceivableOtherChargeSplitDtos = otherChargeSplitDtos;
    }

    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @return the invoiceStatus
     */
    public InvoiceStatusType getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * @param invoiceStatus the invoiceStatus to set
     */
    public void setInvoiceStatus(InvoiceStatusType invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public BigDecimal getBillingAmountToBeBilled() {
        return billingAmountToBeBilled;
    }

    public void setBillingAmountToBeBilled(BigDecimal billingAmountToBeBilled) {
        this.billingAmountToBeBilled = billingAmountToBeBilled;
    }

    public BigDecimal getInterlineServiceCommissionAmount() {
        return interlineServiceCommissionAmount;
    }

    public void setInterlineServiceCommissionAmount(BigDecimal interlineServiceCommissionAmount) {
        this.interlineServiceCommissionAmount = interlineServiceCommissionAmount;
    }

    public BigDecimal getHostAmountToBeBilled() {
        return hostAmountToBeBilled;
    }

    /**
     * @return the carrierReceivableProratedSegmentDtos
     */
    public List<CarrierReceivableProratedSegmentDto> getCarrierReceivableProratedSegmentDtos() {
        if (carrierReceivableProratedSegmentDtos == null)
        {
            carrierReceivableProratedSegmentDtos = new ArrayList<CarrierReceivableProratedSegmentDto>();
        }
        return carrierReceivableProratedSegmentDtos;
    }

    /**
     * @param carrierReceivableProratedSegmentDtos the carrierReceivableProratedSegmentDtos to set
     */
    public void setCarrierReceivableProratedSegmentDtos(
                List<CarrierReceivableProratedSegmentDto> carrierReceivableProratedSegmentDtos) {
        this.carrierReceivableProratedSegmentDtos = carrierReceivableProratedSegmentDtos;
    }

    public void setHostAmountToBeBilled(BigDecimal hostAmountToBeBilled) {
        this.hostAmountToBeBilled = hostAmountToBeBilled;
    }

    public String getHostCurrencyCode() {
        return hostCurrencyCode;
    }

    public void setHostCurrencyCode(String hostCurrencyCode) {
        this.hostCurrencyCode = hostCurrencyCode;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * @return the carrierReceivableOtherChargeSplitDtos
     */
    public List<OtherChargeSplitDto> getCarrierReceivableOtherChargeSplitDtos() {
        if (carrierReceivableOtherChargeSplitDtos == null)
        {
            carrierReceivableOtherChargeSplitDtos = new ArrayList<OtherChargeSplitDto>();
        }
        return carrierReceivableOtherChargeSplitDtos;
    }

    /**
     * @param carrierReceivableOtherChargeSplitDtos the carrierReceivableOtherChargeSplitDtos to set
     */
    public void setCarrierReceivableOtherChargeSplitDtos(
                List<OtherChargeSplitDto> carrierReceivableOtherChargeSplitDtos) {
        this.carrierReceivableOtherChargeSplitDtos = carrierReceivableOtherChargeSplitDtos;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceRemarks() {
        return invoiceRemarks;
    }

    public void setInvoiceRemarks(String invoiceRemarks) {
        this.invoiceRemarks = invoiceRemarks;
    }

    public BigDecimal getWeightCharges() {
        return weightCharges;
    }

    public void setWeightCharges(BigDecimal weightCharges) {
        this.weightCharges = weightCharges;
    }

    public BigDecimal getValuationCharges() {
        return valuationCharges;
    }

    public void setValuationCharges(BigDecimal valuationCharges) {
        this.valuationCharges = valuationCharges;
    }

    public BigDecimal getTotalOtherCharges() {
        return totalOtherCharges;
    }

    public void setTotalOtherCharges(BigDecimal totalOtherCharges) {
        this.totalOtherCharges = totalOtherCharges;
    }

    public BigDecimal getTotalOtherChargesDueCarrier() {
        return totalOtherChargesDueCarrier;
    }

    public void setTotalOtherChargesDueCarrier(BigDecimal totalOtherChargesDueCarrier) {
        this.totalOtherChargesDueCarrier = totalOtherChargesDueCarrier;
    }

    public BigDecimal getTotalOtherChargesDueAgent() {
        return totalOtherChargesDueAgent;
    }

    public void setTotalOtherChargesDueAgent(BigDecimal totalOtherChargesDueAgent) {
        this.totalOtherChargesDueAgent = totalOtherChargesDueAgent;
    }

    /**
     * @return the partShipmentIndicator
     */
    public boolean isPartShipmentIndicator() {
        return partShipmentIndicator;
    }

    /**
     * @param partShipmentIndicator the partShipmentIndicator to set
     */
    public void setPartShipmentIndicator(boolean partShipmentIndicator) {
        this.partShipmentIndicator = partShipmentIndicator;
    }

    @Override
    public String toString() {
        final StringBuilder strBuilder = new StringBuilder();
        if (this.getCarrierCode() != null) {
            strBuilder.append(this.getCarrierCode());
            strBuilder.append(" ");
        }
        if (this.getProrationType() != null && this.getProrationType().getVal() != null) {
            strBuilder.append(this.getProrationType().getVal());
            strBuilder.append(" ");
        }
        if (this.getProrateIdentifier() != null) {
            strBuilder.append(this.getProrateIdentifier());
            strBuilder.append(" ");
        }
        if (this.getInterlineServiceCommissionPercentage() != null) {
            strBuilder.append(this.getInterlineServiceCommissionPercentage());
            strBuilder.append(" ");
        }
        if (this.getAmountToBeBilled() != null) {
            strBuilder.append(this.getAmountToBeBilled());
            strBuilder.append(" ");
        }
        if (this.getAdjustmentDto() != null
                    && this.getAdjustmentDto().getRevenueIndicatorType() != null
                    && this.getAdjustmentDto().getRevenueIndicatorType().getRevenueIndicatorTypeName() != null) {
            strBuilder.append(this.getAdjustmentDto().getRevenueIndicatorType().getRevenueIndicatorTypeName());
            strBuilder.append(" ");
        }
        if (this.getActive() != null && this.getActive()) {
            strBuilder.append("Active");
            strBuilder.append(" ");
        }
        if (this.getActive() != null && !this.getActive()) {
            strBuilder.append("Not Active");
            strBuilder.append(" ");
        }
        if (this.getPaymentCurrencyCode() != null) {
            strBuilder.append(this.getPaymentCurrencyCode());
            strBuilder.append(" ");
        }
        if (this.getStatus() != null && this.getStatus().getVal() != null) {
            strBuilder.append(this.getStatus().getVal());
            strBuilder.append(" ");
        }

        return strBuilder.toString();
    }

    /**
     * @return the invoiceType
     */
    public CRAParticipantAccountType getInvoiceType() {
        return invoiceType;
    }

    /**
     * @param invoiceType the invoiceType to set
     */
    public void setInvoiceType(CRAParticipantAccountType invoiceType) {
        this.invoiceType = invoiceType;
    }

    private BigDecimal prorationAmountToBeBilled;

    public BigDecimal getProrationAmountToBeBilled() {
        return prorationAmountToBeBilled;
    }

    public void setProrationAmountToBeBilled(BigDecimal prorationAmountToBeBilled) {
        this.prorationAmountToBeBilled = prorationAmountToBeBilled;
    }

    private BigDecimal interlineServiceProCurCommissionAmount;

    public BigDecimal getInterlineServiceProCurCommissionAmount() {
        return interlineServiceProCurCommissionAmount;
    }

    public void setInterlineServiceProCurCommissionAmount(BigDecimal interlineServiceProCurCommissionAmount) {
        this.interlineServiceProCurCommissionAmount = interlineServiceProCurCommissionAmount;
    }

    public String getProrationCurrency() {
        return prorationCurrency;
    }

    public void setProrationCurrency(String prorationCurrency) {
        this.prorationCurrency = prorationCurrency;
    }

	public boolean isDelIndicator() {
		return delIndicator;
	}

	public void setDelIndicator(boolean delIndicator) {
		this.delIndicator = delIndicator;
	}
    
    
}
