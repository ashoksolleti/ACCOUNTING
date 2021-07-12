/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.PaymentStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ProrationType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>CarrierPayableDto</code> contains the details of CarrierPayableDto.
 * <p>
 * This contains all information about CarrierPayableDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>carrierCode
 * <li>prorationType
 * <li>prorateIdentifier
 * <li>interlineServiceCommissionPercentage
 * <li>paymentAmount
 * <li>paymentCurrencyCode
 * <li>oId
 * <li>status
 * </ul>
 */
public class CarrierPayableDto extends PersistenceObjectDto implements Comparable<CarrierPayableDto> {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5824453134958364787L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private String carrierCode;

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
     * Attribute to hold <code>billingCommissionAmount</code> property.
     */
    private BigDecimal billingAmountToBeBilled;

    /**
     * Attribute to hold <code>commissionAmount</code> property.
     */
    private BigDecimal interlineServiceCommissionAmount;
    
    /**
     * Attribute to hold <code>tdsAmount</code> property.
     */
    private BigDecimal interlineServiceTdsAmount;

	/**
     * Attribute to hold <code>interlineServiceTdsPercentage</code> property.
     */
    private BigDecimal interlineServiceTdsPercentage;

    /**
     * Attribute to hold <code>hostCommissionAmount</code> property.
     */
    private BigDecimal hostAmountToBeBilled;

    /**
     * Attribute to hold <code>hostCurrencyCode</code> property.
     */
    private String hostCurrencyCode;

    private String prorationCurrency;
    
    private String billingCurrencyCode;

    public String getBillingCurrencyCode() {
		return billingCurrencyCode;
	}

	public void setBillingCurrencyCode(String billingCurrencyCode) {
		this.billingCurrencyCode = billingCurrencyCode;
	}

	/**
     * Attribute to hold <code>interlineServiceCommissionPercentage</code> property.
     */
    private BigDecimal interlineServiceCommissionPercentage;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>amountToBeBilled</code> property.
     */
    private BigDecimal amountToBeBilled;

    /**
     * Attribute to hold <code>paymentCurrencyCode</code> property.
     */
    private String paymentCurrencyCode;

    /**
     * Attribute to hold <code>prorateIndicator</code> property.
     */
    private String prorateIdentifier;

    /**
     * Attribute to hold <code>prorationType</code> property.
     */
    private ProrationType prorationType;

    /**
     * Attribute to hold <code>status</code> property.
     */
    private PaymentStatusType status;

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
     * Attribute to hold <code>otherChargeSplit</code> property.
     */
    private List<OtherChargeSplitDto> otherChargeSplitDtos;

    /**
     * Attribute to hold <code>accountingAirWaybillDto</code> property.
     */
    private AccountingAirWaybillDto accountingAirWaybillDto;
    
    /**
     * Attribute to hold <code>origin</code> property.
     */
    private String origin;
    
    /**
     * Attribute to hold <code>destination</code> property.
     */
    private String destination;
    
    private BigDecimal prorPercent;
    
	private boolean delIndicator;
	
    public BigDecimal getProrPercent() {
		return prorPercent;
	}

	public void setProrPercent(BigDecimal prorPercent) {
		this.prorPercent = prorPercent;
	}
    /**
     * @return the active
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(final Boolean pActive) {
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
    public void setAdjustmentDto(final AdjustmentDto pAdjustmentDto) {
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
    public void setUserAudit(final UserAuditDto pUserAudit) {
        this.userAudit = pUserAudit;
    }

    /**
     * Gets the <code>carrierCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>carrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the <code>interlineServiceCommissionPercentage</code> property.
     * <p>
     * 
     * @return the current value of the <code>interlineServiceCommissionPercentage</code> property.
     */
    public BigDecimal getInterlineServiceCommissionPercentage() {
        return this.interlineServiceCommissionPercentage;
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
     * Gets the <code>prorationType</code> property.
     * <p>
     * 
     * @return the current value of the <code>prorationType</code> property.
     */
    public ProrationType getProrationType() {
        return this.prorationType;
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
     * Gets the <code>status</code> property.
     * <p>
     * 
     * @return the current value of the <code>status</code> property.
     */
    public PaymentStatusType getStatus() {
        return this.status;
    }

    /**
     * Sets the <code>status</code> property.
     * <p>
     * 
     * @param pStatus
     *            the current value of the <code>status</code> property.
     */
    public void setStatus(final PaymentStatusType pStatus) {
        this.status = pStatus;
    }

    public BigDecimal getBillingAmountToBeBilled() {
        return this.billingAmountToBeBilled;
    }

    public void setBillingAmountToBeBilled(final BigDecimal pBillingAmountToBeBilled) {
        this.billingAmountToBeBilled = pBillingAmountToBeBilled;
    }

    public BigDecimal getInterlineServiceCommissionAmount() {
        return this.interlineServiceCommissionAmount;
    }

    public void setInterlineServiceCommissionAmount(final BigDecimal pInterlineServiceCommissionAmount) {
        this.interlineServiceCommissionAmount = pInterlineServiceCommissionAmount;
    }
    
    public BigDecimal getInterlineServiceTdsAmount() {
		return this.interlineServiceTdsAmount;
	}

	public void setInterlineServiceTdsAmount(BigDecimal interlineServiceTdsAmount) {
		this.interlineServiceTdsAmount = interlineServiceTdsAmount;
	}

	public BigDecimal getInterlineServiceTdsPercentage() {
		return this.interlineServiceTdsPercentage;
	}

	public void setInterlineServiceTdsPercentage(BigDecimal interlineServiceTdsPercentage) {
		this.interlineServiceTdsPercentage = interlineServiceTdsPercentage;
	}

    public BigDecimal getHostAmountToBeBilled() {
        return this.hostAmountToBeBilled;
    }

    public void setHostAmountToBeBilled(final BigDecimal pHostAmountToBeBilled) {
        this.hostAmountToBeBilled = pHostAmountToBeBilled;
    }

    public String getHostCurrencyCode() {
        return this.hostCurrencyCode;
    }

    public void setHostCurrencyCode(final String pHostCurrencyCode) {
        this.hostCurrencyCode = pHostCurrencyCode;
    }

    public BigDecimal getAmountToBeBilled() {
        return this.amountToBeBilled;
    }

    public void setAmountToBeBilled(final BigDecimal pAmountToBeBilled) {
        this.amountToBeBilled = pAmountToBeBilled;
    }

    public String getProrateIdentifier() {
        return this.prorateIdentifier;
    }

    public void setProrateIdentifier(final String pProrateIdentifier) {
        this.prorateIdentifier = pProrateIdentifier;
    }

    public Date getInvoiceDate() {
        return this.invoiceDate;
    }

    public void setInvoiceDate(final Date pInvoiceDate) {
        this.invoiceDate = pInvoiceDate;
    }

    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public void setInvoiceNumber(final String pInvoiceNumber) {
        this.invoiceNumber = pInvoiceNumber;
    }

    public String getInvoiceRemarks() {
        return this.invoiceRemarks;
    }

    public void setInvoiceRemarks(final String pInvoiceRemarks) {
        this.invoiceRemarks = pInvoiceRemarks;
    }

    public BigDecimal getWeightCharges() {
        return this.weightCharges;
    }

    public void setWeightCharges(final BigDecimal pWeightCharges) {
        this.weightCharges = pWeightCharges;
    }

    public BigDecimal getValuationCharges() {
        return this.valuationCharges;
    }

    public void setValuationCharges(final BigDecimal pValuationCharges) {
        this.valuationCharges = pValuationCharges;
    }

    public BigDecimal getTotalOtherCharges() {
        return this.totalOtherCharges;
    }

    public void setTotalOtherCharges(final BigDecimal pTotalOtherCharges) {
        this.totalOtherCharges = pTotalOtherCharges;
    }

    public BigDecimal getTotalOtherChargesDueCarrier() {
        return this.totalOtherChargesDueCarrier;
    }

    public void setTotalOtherChargesDueCarrier(final BigDecimal pTotalOtherChargesDueCarrier) {
        this.totalOtherChargesDueCarrier = pTotalOtherChargesDueCarrier;
    }

    public BigDecimal getTotalOtherChargesDueAgent() {
        return this.totalOtherChargesDueAgent;
    }

    public void setTotalOtherChargesDueAgent(final BigDecimal pTotalOtherChargesDueAgent) {
        this.totalOtherChargesDueAgent = pTotalOtherChargesDueAgent;
    }

    public List<OtherChargeSplitDto> getOtherChargeSplitDtos() {
        return this.otherChargeSplitDtos;
    }

    public void setOtherChargeSplitDtos(final List<OtherChargeSplitDto> pOtherChargeSplitDtos) {
        this.otherChargeSplitDtos = pOtherChargeSplitDtos;
    }

    public AccountingAirWaybillDto getAccountingAirWaybillDto() {
        return this.accountingAirWaybillDto;
    }

    public void setAccountingAirWaybillDto(final AccountingAirWaybillDto pAccountingAirWaybillDto) {
        this.accountingAirWaybillDto = pAccountingAirWaybillDto;
    }

    @Override
    public String toString() {
        final StringBuilder aStrBuilder = new StringBuilder();
        if (this.getCarrierCode() != null) {
            aStrBuilder.append(this.getCarrierCode());
            aStrBuilder.append(" ");
        }
        if (this.getProrationType() != null && this.getProrationType().getVal() != null) {
            aStrBuilder.append(this.getProrationType().getVal());
            aStrBuilder.append(" ");
        }
        if (this.getProrateIdentifier() != null) {
            aStrBuilder.append(this.getProrateIdentifier());
            aStrBuilder.append(" ");
        }
        if (this.getInterlineServiceCommissionPercentage() != null) {
            aStrBuilder.append(this.getInterlineServiceCommissionPercentage());
            aStrBuilder.append(" ");
        }
        if (this.getAmountToBeBilled() != null) {
            aStrBuilder.append(this.getAmountToBeBilled());
            aStrBuilder.append(" ");
        }
        if (this.getAdjustmentDto() != null
                    && this.getAdjustmentDto().getRevenueIndicatorType() != null
                    && this.getAdjustmentDto().getRevenueIndicatorType().getRevenueIndicatorTypeName() != null) {
            aStrBuilder.append(this.getAdjustmentDto().getRevenueIndicatorType()
                        .getRevenueIndicatorTypeName());
            aStrBuilder.append(" ");
        }
        if (this.getActive() != null && this.getActive()) {
            aStrBuilder.append("Active");
            aStrBuilder.append(" ");
        }
        if (this.getActive() != null && !this.getActive()) {
            aStrBuilder.append("Not Active");
            aStrBuilder.append(" ");
        }
        if (this.getPaymentCurrencyCode() != null) {
            aStrBuilder.append(this.getPaymentCurrencyCode());
            aStrBuilder.append(" ");
        }
        if (this.getStatus() != null && this.getStatus().getVal() != null) {
            aStrBuilder.append(this.getStatus().getVal());
            aStrBuilder.append(" ");
        }

        return aStrBuilder.toString();
    }

    private BigDecimal interlineServiceProCurCommissionAmount;

    public BigDecimal getInterlineServiceProCurCommissionAmount() {
        return this.interlineServiceProCurCommissionAmount;
    }

    public void setInterlineServiceProCurCommissionAmount(
                final BigDecimal pInterlineServiceProCurCommissionAmount) {
        this.interlineServiceProCurCommissionAmount = pInterlineServiceProCurCommissionAmount;
    }

    private BigDecimal prorationAmountToBeBilled;

    public BigDecimal getProrationAmountToBeBilled() {
        return this.prorationAmountToBeBilled;
    }

    public void setProrationAmountToBeBilled(final BigDecimal pProrationAmountToBeBilled) {
        this.prorationAmountToBeBilled = pProrationAmountToBeBilled;
    }

    public String getProrationCurrency() {
        return this.prorationCurrency;
    }

    public void setProrationCurrency(final String pProrationCurrency) {
        this.prorationCurrency = pProrationCurrency;
    }

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public boolean isDelIndicator() {
		return delIndicator;
	}

	public void setDelIndicator(boolean delIndicator) {
		this.delIndicator = delIndicator;
	}

	@Override
	public int compareTo(CarrierPayableDto carrierPayableDto) {
        int returnVal = 0;

        if (this.oId < carrierPayableDto.getOId()) {
            returnVal = -1;
        }
        else if (this.oId == carrierPayableDto.getOId()) {
            returnVal = 0;
        }
        else if (this.oId > carrierPayableDto.getOId()) {
            returnVal = 1;
        }

        return returnVal;
	}
    
    
}
