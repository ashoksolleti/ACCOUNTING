/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AWBParticipantType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.CommissionType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.GenIdType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableType;
import com.unisys.trans.logistics.lms.framework.constants.CRAParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class ParticipantReceivableDto extends PersistenceObjectDto {

    @Override
    public boolean equals(final Object pObj) {
        if (this == pObj)
            return true;
        if (pObj == null)
            return false;
        if (getClass() != pObj.getClass())
            return false;
        final ParticipantReceivableDto other = (ParticipantReceivableDto) pObj;
        if (this.adjustmentDto == null) {
            if (other.adjustmentDto != null && other.adjustmentDto.getRevenueIndicatorType() != null)
                return false;
        }
        else if (this.adjustmentDto.getRevenueIndicatorType() != null) {
            if (other.adjustmentDto.getRevenueIndicatorType() == null)
                return false;
            else if (this.adjustmentDto.getRevenueIndicatorType() != null
                        && other.adjustmentDto.getRevenueIndicatorType() != null) {
                if (!(this.adjustmentDto.getRevenueIndicatorType()
                            .equals(other.adjustmentDto.getRevenueIndicatorType()))) {
                    return false;
                }
            }

        }
        if (this.amountToBeBilled == null) {
            if (other.amountToBeBilled != null)
                return false;
        }
        else if (!this.amountToBeBilled.equals(other.amountToBeBilled))
            return false;
        if (this.adjustmentDto == null) {
            if (other.adjustmentDto != null && other.adjustmentDto.getReasonCode() != null)
                return false;
        }
        else if (this.adjustmentDto.getReasonCode() != null) {
            if (other.adjustmentDto.getReasonCode() == null)
                return false;
            else if (this.adjustmentDto.getReasonCode() != null
                        && other.adjustmentDto.getReasonCode() != null) {
                if (!(this.adjustmentDto.getReasonCode()
                            .equals(other.adjustmentDto.getReasonCode()))) {
                    return false;
                }
            }

        }
        if (this.adjustmentDto == null) {
            if (other.adjustmentDto != null && other.adjustmentDto.getReasonText() != null)
                return false;
        }
        else if (this.adjustmentDto.getReasonText() != null) {
            if (other.adjustmentDto.getReasonText() == null)
                return false;
            else if (this.adjustmentDto.getReasonText() != null
                        && other.adjustmentDto.getReasonText() != null) {
                if (!(this.adjustmentDto.getReasonText()
                            .equals(other.adjustmentDto.getReasonText()))) {
                    return false;
                }
            }

        }
        if (this.adjustmentDto == null) {
            if (other.adjustmentDto != null && other.adjustmentDto.getAdjustmentComment() != null)
                return false;
        }
        else if (this.adjustmentDto.getAdjustmentComment() != null) {
            if (other.adjustmentDto.getAdjustmentComment() == null)
                return false;
            else if (this.adjustmentDto.getAdjustmentComment() != null
                        && other.adjustmentDto.getAdjustmentComment() != null) {
                if (!(this.adjustmentDto.getAdjustmentComment()
                            .equals(other.adjustmentDto.getAdjustmentComment()))) {
                    return false;
                }
            }

        }
        return true;
    }

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>accountNumber</code> property.
     */
    private String accountNumber;

    private ActionType actionType;

    //added Remarks
    
    private String remarks;
    
    public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
     * Attribute to hold <code>active</code> property.
     */
    private Boolean active;

    public ActionType getActionType() {
        return this.actionType;
    }

    public void setActionType(final ActionType pActionType) {
        this.actionType = pActionType;
    }

    /**
     * Attribute to hold <code>adjustmentDto</code> property.
     */
    private AdjustmentDto adjustmentDto;

    /**
     * Attribute to hold <code>amountToBeBilled</code> property.
     */
    private BigDecimal amountToBeBilled;

    /**
     * Attribute to hold <code>billingAmountToBeBilled</code> property.
     */
    private BigDecimal billingAmountToBeBilled;

    /**
     * Attribute to hold <code>billingCurrencyCode</code> property.
     */
    private String billingCurrencyCode;

    /**
     * Attribute to hold <code>billingOutstandingAmountToBeBilled</code> property.
     */
    private BigDecimal billingOutstandingAmountToBeBilled;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     */
    private String currencyCode;

    /**
     * Attribute to hold <code>discount</code> property.
     */
    private BigDecimal discount;

    /**
     * Attribute to hold <code>genIDType</code> property.
     */
    private GenIdType genIDType;

    /**
     * Attribute to hold <code>hostAmountToBeBilled</code> property.
     */
    private BigDecimal hostAmountToBeBilled;

    /**
     * Attribute to hold <code>hostCurrencyCode</code> property.
     */
    private String hostCurrencyCode;

    /**
     * Attribute to hold <code>hostOutstandingAmountToBeBilled</code> property.
     */
    private BigDecimal hostOutstandingAmountToBeBilled;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>outstandingAmountToBeBilled</code> property.
     */
    private BigDecimal outstandingAmountToBeBilled;

    /**
     * Attribute to hold <code>participantReceivableSplitDtos</code> property.
     */
    private List<ParticipantReceivableSplitDto> participantReceivableSplitDtos;

    /**
     * Attribute to hold <code>participantType</code> property.
     */

    private AWBParticipantType participantType;

    /**
     * Attribute to hold <code>receivablePaymentStatusType</code> property.
     */
    private ReceivableStatusType receivablePaymentStatusType;

    /**
     * Attribute to hold <code>receivableSplitDtos</code> property.
     */
    private List<ReceivableSplitDto> receivableSplitDtos;

    /**
     * Attribute to hold <code>receivableType</code> property.
     */
    private ReceivableType receivableType;

    /**
     * Attribute to hold <code>userAudit</code> property.
     */
    private UserAuditDto userAudit;

    /**
     * Attribute to hold <code>invoiceDate</code> property.
     */
    private Date invoiceDate;

    private InvoiceStatusType invoiceStatus;

    /**
     * Attribute to hold <code>invoiceNumber</code> property.
     */
    private String invoiceNumber;

    private boolean delIndicator;
    
    private InvoiceParticipantAccountType invoiceType;
    
    private AccountingAirWaybillDto accAirWayBillDto;
    
    /** The weight charge. */
	private BigDecimal weightCharge;
	
	private BigDecimal valuationCharge;
	
	
	/**
	 * Attribute to hold <code>customerGstin</code> property.
	 */
	private String customerGstin;
	
	/**
	 * Attribute to hold <code>taxableAmount</code> property.
	 */
	private BigDecimal taxableAmount = new BigDecimal(0);
	
	private String documentNumber;
	
	private Long gstr1ReturnOid;
	
	private String billingExchangeRate;
	
	
    public String getBillingExchangeRate() {
		return billingExchangeRate;
	}

	public void setBillingExchangeRate(String billingExchangeRate) {
		this.billingExchangeRate = billingExchangeRate;
	}

	/**
     * Attribute to hold <code>TDS</code> property.
     */
    private BigDecimal tdsAmount;

    public BigDecimal getTdsAmount() {
        return tdsAmount;
    }

    public void setTdsAmount(BigDecimal tdsAmount) {
        this.tdsAmount = tdsAmount;
    }

    /**
     * Attribute to hold <code>TDSpercentage</code> property.
     */
    private BigDecimal tdsPercentage;

    public BigDecimal getTdsPercentage() {
        return tdsPercentage;
    }

    public void setTdsPercentage(BigDecimal tdsPercentage) {
        this.tdsPercentage = tdsPercentage;
    }

    /**
     * Attribute to hold <code>TDS type</code> property.
     */
    private CommissionType tdsType;

    public CommissionType getTdsType() {
        return tdsType;
    }

    public void setTdsType(CommissionType tdsType) {
        this.tdsType = tdsType;
    }
    
    /**
     * Attribute to hold <code>Commission Amount</code> property.
     */
    private BigDecimal commissionAmount;
    
    //added AWBNumber
    
    public BigDecimal getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(BigDecimal commissionAmount) {
		this.commissionAmount = commissionAmount;
	}
	
	/**
     * Attribute to hold <code>Commission percentage</code> property.
     */
    private BigDecimal commissionPercentage;
	

	public BigDecimal getCommissionPercentage() {
		return commissionPercentage;
	}

	public void setCommissionPercentage(BigDecimal commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}
	
	/**
     * Attribute to hold <code>Commission type</code> property.
     */
    private CommissionType commissionType;

	public CommissionType getCommissionType() {
		return commissionType;
	}

	public void setCommissionType(CommissionType commissionType) {
		this.commissionType = commissionType;
	}

	public AccountingAirWaybillDto getAccAirWayBillDto() {
		return accAirWayBillDto;
	}

	public void setAccAirWayBillDto(AccountingAirWaybillDto accAirWayBillDto) {
		this.accAirWayBillDto = accAirWayBillDto;
	}

	private String awbNumber;
    public String getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}

	private Boolean onHold;
	

	public Boolean getOnHold() {
		return this.onHold;
	}

	public void setOnHold(Boolean onHold) {
		this.onHold = onHold;
	}

    /**
     * Gets the <code>accountNumber</code> property.
     * <p>
     * 
     * @return holds the <code>accountNumber</code> property.
     */
    public String getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Gets the <code>adjustmentDto</code> property.
     * <p>
     * 
     * @return holds the <code>adjustmentDto</code> property.
     */
    public AdjustmentDto getAdjustmentDto() {
    	if(adjustmentDto == null){
    		adjustmentDto = new AdjustmentDto();
    	}
        return this.adjustmentDto;
    }

    /**
     * Gets the <code>amountToBeBilled</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountToBeBilled</code> property.<br>
     */
    public BigDecimal getAmountToBeBilled() {
        return this.amountToBeBilled;
    }

    /**
     * Gets the <code>billingAmountToBeBilled</code> property.
     * <p>
     * 
     * @return holds the <code>billingAmountToBeBilled</code> property.
     */
    public BigDecimal getBillingAmountToBeBilled() {
        return this.billingAmountToBeBilled;
    }

    /**
     * Gets the <code>billingCurrencyCode</code> property.
     * <p>
     * 
     * @return holds the <code>billingCurrencyCode</code> property.
     */
    public String getBillingCurrencyCode() {
        return this.billingCurrencyCode;
    }

    /**
     * Gets the <code>billingOutstandingAmountToBeBilled</code> property.
     * <p>
     * 
     * @return holds the <code>billingOutstandingAmountToBeBilled</code> property.
     */
    public BigDecimal getBillingOutstandingAmountToBeBilled() {
        return this.billingOutstandingAmountToBeBilled;
    }

    /**
     * Gets the <code>currencyCode</code> property.
     * <p>
     * 
     * @return holds the <code>currencyCode</code> property.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Gets the <code>genIDType</code> property.
     * <p>
     * 
     * @return the current value of the <code>genIDType</code> property.<br>
     */
    public GenIdType getGenIDType() {
        return this.genIDType;
    }

    /**
     * Gets the <code>hostAmountToBeBilled</code> property.
     * <p>
     * 
     * @return holds the <code>hostAmountToBeBilled</code> property.
     */
    public BigDecimal getHostAmountToBeBilled() {
        return this.hostAmountToBeBilled;
    }

    /**
     * Gets the <code>hostCurrencyCode</code> property.
     * <p>
     * 
     * @return holds the <code>hostCurrencyCode</code> property.
     */
    public String getHostCurrencyCode() {
        return this.hostCurrencyCode;
    }

    /**
     * Gets the <code>hostOutstandingAmountToBeBilled</code> property.
     * <p>
     * 
     * @return holds the <code>hostOutstandingAmountToBeBilled</code> property.
     */
    public BigDecimal getHostOutstandingAmountToBeBilled() {
        return this.hostOutstandingAmountToBeBilled;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getoId() {
  		return oId;
  	}

    
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>outstandingAmountToBeBilled</code> property.
     * <p>
     * 
     * @return holds the <code>outstandingAmountToBeBilled</code> property.
     */
    public BigDecimal getOutstandingAmountToBeBilled() {
        return this.outstandingAmountToBeBilled;
    }

    /**
     * Gets the <code>participantReceivableSplitDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantReceivableSplitDtos</code> property.<br>
     */
    public List<ParticipantReceivableSplitDto> getParticipantReceivableSplitDtos() {
        return this.participantReceivableSplitDtos;
    }

    /**
     * Gets the <code>participantType</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantType</code> property.<br>
     */
    public AWBParticipantType getParticipantType() {
        return this.participantType;
    }

    /**
     * Gets the <code>receivablePaymentStatusType</code> property.
     * <p>
     * 
     * @return the current value of the <code>receivablePaymentStatusType</code> property.<br>
     */
    public ReceivableStatusType getReceivablePaymentStatusType() {
        return this.receivablePaymentStatusType;
    }

    /**
     * Gets the <code>receivableSplitDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>receivableSplitDtos</code> property.<br>
     */
    public List<ReceivableSplitDto> getReceivableSplitDtos() {
        return this.receivableSplitDtos;
    }

    /**
     * Gets the <code>receivableType</code> property.
     * <p>
     * 
     * @return holds the <code>receivableType</code> property.
     */
    public ReceivableType getReceivableType() {
        return this.receivableType;
    }

    /**
     * Gets the <code>userAudit</code> property.
     * <p>
     * 
     * @return holds the <code>userAudit</code> property.
     */
    public UserAuditDto getUserAudit() {
        return this.userAudit;
    }

    /**
     * Gets the <code>active</code> property.
     * <p>
     * 
     * @return holds the <code>active</code> property.
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Sets the <code>accountNumber</code> property.
     * <p>
     * 
     * @param pAccountNumber
     *            the new value of the <code>accountNumber</code> property.
     */
    public void setAccountNumber(final String pAccountNumber) {
        this.accountNumber = pAccountNumber;
    }

    /**
     * Sets the <code>active</code> property.
     * <p>
     * 
     * @param pActive
     *            the new value of the <code>active</code> property.
     */
    public void setActive(final Boolean pActive) {
        this.active = pActive;
    }

    /**
     * Sets the <code>adjustmentDto</code> property.
     * <p>
     * 
     * @param pAdjustmentDtos
     *            the new value of the <code>adjustmentDto</code> property.
     */
    public void setAdjustmentDto(final AdjustmentDto pAdjustmentDtos) {
        this.adjustmentDto = pAdjustmentDtos;
    }

    /**
     * Sets the <code>amountToBeBilled</code> property.
     * <p>
     * 
     * @param pAmountToBeBilled
     *            the new value of the <code>amountToBeBilled</code> property.
     */

    public void setAmountToBeBilled(final BigDecimal pAmountToBeBilled) {
        this.amountToBeBilled = pAmountToBeBilled;
    }

    /**
     * Sets the <code>billingAmountToBeBilled</code> property.
     * <p>
     * 
     * @param pBillingAmountToBeBilled
     *            the new value of the <code>billingAmountToBeBilled</code> property.
     */
    public void setBillingAmountToBeBilled(
                final BigDecimal pBillingAmountToBeBilled) {
        this.billingAmountToBeBilled = pBillingAmountToBeBilled;
    }

    /**
     * Sets the <code>billingCurrencyCode</code> property.
     * <p>
     * 
     * @param pBillingCurrencyCode
     *            the new value of the <code>billingCurrencyCode</code> property.
     */
    public void setBillingCurrencyCode(final String pBillingCurrencyCode) {
        this.billingCurrencyCode = pBillingCurrencyCode;
    }

    /**
     * @return the invoiceStatus
     */
    public InvoiceStatusType getInvoiceStatus() {
        return this.invoiceStatus;
    }

    /**
     * @param invoiceStatus the invoiceStatus to set
     */
    public void setInvoiceStatus(final InvoiceStatusType pInvoiceStatus) {
        this.invoiceStatus = pInvoiceStatus;
    }

    /**
     * Sets the <code>billingOutstandingAmountToBeBilled</code> property.
     * <p>
     * 
     * @param pBillingOutstandingAmountToBeBilled
     *            the new value of the <code>billingOutstandingAmountToBeBilled</code> property.
     */
    public void setBillingOutstandingAmountToBeBilled(
                final BigDecimal pBillingOutstandingAmountToBeBilled) {
        this.billingOutstandingAmountToBeBilled = pBillingOutstandingAmountToBeBilled;
    }

    /**
     * Sets the <code>currencyCode</code> property.
     * <p>
     * 
     * @param pCurrencyCode
     *            the new value of the <code>currencyCode</code> property.
     */
    public void setCurrencyCode(final String pCurrencyCode) {
        this.currencyCode = ContractUtility.convertToUpperCase(pCurrencyCode);
    }

    /**
     * Sets the <code>genIDType</code> property.
     * <p>
     * 
     * @param pGenIDType
     *            the new value of the <code>genIDType</code> property.
     */
    public void setGenIDType(final GenIdType pGenIDType) {
        this.genIDType = pGenIDType;
    }

    /**
     * Sets the <code>hostAmountToBeBilled</code> property.
     * <p>
     * 
     * @param pHostAmountToBeBilled
     *            the new value of the <code>hostAmountToBeBilled</code> property.
     */
    public void setHostAmountToBeBilled(final BigDecimal pHostAmountToBeBilled) {
        this.hostAmountToBeBilled = pHostAmountToBeBilled;
    }

    /**
     * Sets the <code>hostCurrencyCode</code> property.
     * <p>
     * 
     * @param pHostCurrencyCode
     *            the new value of the <code>hostCurrencyCode</code> property.
     */
    public void setHostCurrencyCode(final String pHostCurrencyCode) {
        this.hostCurrencyCode = pHostCurrencyCode;
    }

    /**
     * Sets the <code>hostOutstandingAmountToBeBilled</code> property.
     * <p>
     * 
     * @param pHostOutstandingAmountToBeBilled
     *            the new value of the <code>hostOutstandingAmountToBeBilled</code> property.
     */
    public void setHostOutstandingAmountToBeBilled(
                final BigDecimal pHostOutstandingAmountToBeBilled) {
        this.hostOutstandingAmountToBeBilled = pHostOutstandingAmountToBeBilled;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setoId(final Long pOId) {
        this.oId = pOId;
    }

  
	/**
     * Sets the <code>outstandingAmountToBeBilled</code> property.
     * <p>
     * 
     * @param pOutstandingAmountToBeBilled
     *            the new value of the <code>outstandingAmountToBeBilled</code> property.
     */
    public void setOutstandingAmountToBeBilled(
                final BigDecimal pOutstandingAmountToBeBilled) {
        this.outstandingAmountToBeBilled = pOutstandingAmountToBeBilled;
    }

    /**
     * Sets the <code>participantReceivableSplitDtos</code> property.
     * <p>
     * 
     * @param pParticipantReceivableSplitDtos
     *            the new value of the <code>participantReceivableSplitDtos</code> property.
     */
    public void setParticipantReceivableSplitDtos(
                final List<ParticipantReceivableSplitDto> pParticipantReceivableSplitDtos) {
        this.participantReceivableSplitDtos = pParticipantReceivableSplitDtos;
    }

    /**
     * Sets the <code>participantType</code> property.
     * <p>
     * 
     * @param pParticipantType
     *            the new value of the <code>participantType</code> property.
     */
    public void setParticipantType(final AWBParticipantType pParticipantType) {
        this.participantType = pParticipantType;
    }

    /**
     * Sets the <code>receivablePaymentStatusType</code> property.
     * <p>
     * 
     * @param pReceivablePaymentStatusType
     *            the new value of the <code>receivablePaymentStatusType</code> property.
     */
    public void setReceivablePaymentStatusType(
                final ReceivableStatusType pReceivablePaymentStatusType) {
        this.receivablePaymentStatusType = pReceivablePaymentStatusType;
    }

    /**
     * Sets the <code>receivableSplitDtos</code> property.
     * <p>
     * 
     * @param pReceivableSplitDtos
     *            the new value of the <code>receivableSplitDtos</code> property.
     */
    public void setReceivableSplitDtos(
                final List<ReceivableSplitDto> pReceivableSplitDtos) {
        this.receivableSplitDtos = pReceivableSplitDtos;
    }

    /**
     * Sets the <code>receivableType</code> property.
     * <p>
     * 
     * @param pReceivableType
     *            the new value of the <code>receivableType</code> property.
     */
    public void setReceivableType(final ReceivableType pReceivableType) {
        this.receivableType = pReceivableType;
    }

    /**
     * Sets the <code>userAudit</code> property.
     * <p>
     * 
     * @param pUserAudit
     *            the new value of the <code>userAudit</code> property.
     */
    public void setUserAudit(final UserAuditDto pUserAudit) {
        this.userAudit = pUserAudit;
    }

    @Override
    public String toString() {
        final StringBuilder aStrBuilder = new StringBuilder();
        if (this.getReceivableType() != null && this.getReceivableType().getVal() != null) {
            aStrBuilder.append(this.getReceivableType().getVal());
            aStrBuilder.append(" ");
        }
        if (this.getParticipantType() != null
                    && this.getParticipantType().getParticipant() != null) {
            aStrBuilder.append(this.getParticipantType().getParticipant());
            aStrBuilder.append(" ");
        }
        if (this.getAccountNumber() != null) {
            aStrBuilder.append(this.getAccountNumber());
            aStrBuilder.append(" ");
        }
        if (this.getAdjustmentDto() != null
                    && this.getAdjustmentDto().getRevenueIndicatorType() != null
                    && this.getAdjustmentDto().getRevenueIndicatorType()
                                .getRevenueIndicatorTypeName() != null) {
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
        if (this.getAmountToBeBilled() != null) {
            aStrBuilder.append(this.getAmountToBeBilled());
            aStrBuilder.append(" ");
        }
        if (this.getCurrencyCode() != null) {
            aStrBuilder.append(this.getCurrencyCode());
            aStrBuilder.append(" ");
        }
        if (this.getReceivablePaymentStatusType() != null
                    && this.getReceivablePaymentStatusType().getVal() != null) {
            aStrBuilder.append(this.getReceivablePaymentStatusType().getVal());
            aStrBuilder.append(" ");

        }
        if (invoiceStatus != null && invoiceStatus.value() != null)
        {
            aStrBuilder.append(this.getInvoiceStatus().value());
            aStrBuilder.append(" ");
        }
        return aStrBuilder.toString();
    }

    /**
     * Attribute to hold <code>netAmountToBeBilled</code> property.
     */
    private BigDecimal netAmountToBeBilled;

    /**
     * Attribute to hold <code>netBillingAmountToBeBilled</code> property.
     */
    private BigDecimal netBillingAmountToBeBilled;

    /**
     * Attribute to hold <code>netHostAmountToBeBilled</code> property.
     */
    private BigDecimal netHostAmountToBeBilled;

	private ParticipantAgreementsDetailDto participantAgreementsDetailDto;

    /**
     * Gets the <code>netAmountToBeBilled</code> property.
     * <p>
     * 
     * @return holds the <code>netAmountToBeBilled</code> property.
     */
    public BigDecimal getNetAmountToBeBilled() {
        return this.netAmountToBeBilled;
    }

    /**
     * Sets the <code>netAmountToBeBilled</code> implementation injected by the
     * IoC container.
     * <p>
     * 
     * @param pNetAmountToBeBilled
     *            the new value of the <code>netAmountToBeBilled</code> property.
     */
    public void setNetAmountToBeBilled(final BigDecimal pNetAmountToBeBilled) {
        this.netAmountToBeBilled = pNetAmountToBeBilled;
    }

    /**
     * Gets the <code>netBillingAmountToBeBilled</code> property.
     * <p>
     * 
     * @return holds the <code>netBillingAmountToBeBilled</code> property.
     */
    public BigDecimal getNetBillingAmountToBeBilled() {
        return this.netBillingAmountToBeBilled;
    }

    /**
     * Sets the <code>netBillingAmountToBeBilled</code> implementation injected
     * by the IoC container.
     * <p>
     * 
     * @param pNetBillingAmountToBeBilled
     *            the new value of the <code>netBillingAmountToBeBilled</code> property.
     */
    public void setNetBillingAmountToBeBilled(
                final BigDecimal pNetBillingAmountToBeBilled) {
        this.netBillingAmountToBeBilled = pNetBillingAmountToBeBilled;
    }

    /**
     * Gets the <code>netHostAmountToBeBilled</code> property.
     * <p>
     * 
     * @return holds the <code>netHostAmountToBeBilled</code> property.
     */
    public BigDecimal getNetHostAmountToBeBilled() {
        return this.netHostAmountToBeBilled;
    }

    /**
     * Sets the <code>netHostAmountToBeBilled</code> implementation injected by
     * the IoC container.
     * <p>
     * 
     * @param pNetHostAmountToBeBilled
     *            the new value of the <code>netHostAmountToBeBilled</code> property.
     */
    public void setNetHostAmountToBeBilled(
                final BigDecimal pNetHostAmountToBeBilled) {
        this.netHostAmountToBeBilled = pNetHostAmountToBeBilled;
    }

    /**
     * Gets the <code>discount</code> property.
     * <p>
     * 
     * @return holds the <code>discount</code> property.
     */
    public BigDecimal getDiscount() {
        return this.discount;
    }

    /**
     * Sets the <code>discount</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pDiscount
     *            the new value of the <code>discount</code> property.
     */
    public void setDiscount(final BigDecimal pDiscount) {
        this.discount = pDiscount;
    }

    

    /**
     * @return the invoiceDate
     */
    public Date getInvoiceDate() {
        return this.invoiceDate;
    }

    /**
     * @param invoiceDate the invoiceDate to set
     */
    public void setInvoiceDate(final Date pInvoiceDate) {
        this.invoiceDate = pInvoiceDate;
    }

    /**
     * @return the invoiceNumber
     */
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    /**
     * @param invoiceNumber the invoiceNumber to set
     */
    public void setInvoiceNumber(final String pInvoiceNumber) {
        this.invoiceNumber = pInvoiceNumber;
    }

	/**
	 * @return the invoiceType
	 */
	public InvoiceParticipantAccountType getInvoiceType() {
		return invoiceType;
	}

	/**
	 * @param invoiceType the invoiceType to set
	 */
	public void setInvoiceType(InvoiceParticipantAccountType invoiceType) {
		this.invoiceType = invoiceType;
	}

	public boolean isDelIndicator() {
		return delIndicator;
	}

	public void setDelIndicator(boolean delIndicator) {
		this.delIndicator = delIndicator;
	}

	public BigDecimal getWeightCharge() {
		return weightCharge;
	}

	public void setWeightCharge(BigDecimal weightCharge) {
		this.weightCharge = weightCharge;
	}

	public BigDecimal getValuationCharge() {
		return valuationCharge;
	}

	public void setValuationCharge(BigDecimal valuationCharge) {
		this.valuationCharge = valuationCharge;
	}

	
	public String getCustomerGstin() {
		return customerGstin;
	}

	public void setCustomerGstin(String customerGstin) {
		this.customerGstin = customerGstin;
	}

	public BigDecimal getTaxableAmount() {
		return taxableAmount;
	}

	public void setTaxableAmount(BigDecimal taxableAmount) {
		this.taxableAmount = taxableAmount;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public Long getGstr1ReturnOid() {
		return gstr1ReturnOid;
	}

	public void setGstr1ReturnOid(Long gstr1ReturnOid) {
		this.gstr1ReturnOid = gstr1ReturnOid;
	}

	public ParticipantAgreementsDetailDto getParticipantAgreementsDetailDto() {
		return participantAgreementsDetailDto;
	}

	public void setParticipantAgreementsDetailDto(ParticipantAgreementsDetailDto participantAgreementsDetailDto) {
		this.participantAgreementsDetailDto = participantAgreementsDetailDto;
	}	

}
