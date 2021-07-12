package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.rating.dto.constants.RevenueManagementInterfaceType;

public class PricingRevenueDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private boolean contractHurdleRateEnforcementIndicator;

    private BigDecimal eventHurdleAmount;

    private BigDecimal mileageHostPercentage;

    private BigDecimal otherTotalCharges;

    private RevenueManagementInterfaceType revenueManagementInterfaceType;
    
    private boolean skipHurdleRateCheckIndicator;

    private boolean sraHurdleRateEnforcementIndicator;
    
    private String revenueHostCurrency;
    
    private BigDecimal allinOtherCharges;
    private BigDecimal includeRevenuePercentage;

    public BigDecimal getAllinOtherCharges() {
        return this.allinOtherCharges;
    }

    public BigDecimal getIncludeRevenuePercentage() {
		return this.includeRevenuePercentage;
	}

	public void setIncludeRevenuePercentage(BigDecimal pIncludeRevenuePercentage) {
		this.includeRevenuePercentage = pIncludeRevenuePercentage;
	}

    public void setAllinOtherCharges(final BigDecimal pAllinOtherCharges) {
        this.allinOtherCharges = pAllinOtherCharges;
    }

    public String getRevenueHostCurrency() {
		return revenueHostCurrency;
	}

	public void setRevenueHostCurrency(String revenueHostCurrency) {
		this.revenueHostCurrency = revenueHostCurrency;
	}

	public BigDecimal getEventHurdleAmount() {
        return this.eventHurdleAmount;
    }

    public BigDecimal getMileageHostPercentage() {
        return this.mileageHostPercentage;
    }

    public BigDecimal getOtherTotalCharges() {
        return this.otherTotalCharges;
    }

    public RevenueManagementInterfaceType getRevenueManagementInterfaceType() {
        return this.revenueManagementInterfaceType;
    }

    public boolean isContractHurdleRateEnforcementIndicator() {
        return this.contractHurdleRateEnforcementIndicator;
    }

    public boolean isSraHurdleRateEnforcementIndicator() {
        return this.sraHurdleRateEnforcementIndicator;
    }

    public void setContractHurdleRateEnforcementIndicator(
                final boolean pContractHurdleRateEnforcementIndicator) {
        this.contractHurdleRateEnforcementIndicator = pContractHurdleRateEnforcementIndicator;
    }

    public void setEventHurdleAmount(final BigDecimal pEventHurdleAmount) {
        this.eventHurdleAmount = pEventHurdleAmount;
    }

    public void setMileageHostPercentage(final BigDecimal pMileageHostPercentage) {
        this.mileageHostPercentage = pMileageHostPercentage;
    }

    public void setOtherTotalCharges(final BigDecimal pOtherTotalCharges) {
        this.otherTotalCharges = pOtherTotalCharges;
    }

    public void setRevenueManagementInterfaceType(
                final RevenueManagementInterfaceType pRevenueManagementInterfaceType) {
        this.revenueManagementInterfaceType = pRevenueManagementInterfaceType;
    }

    public void setSraHurdleRateEnforcementIndicator(final boolean pSraHurdleRateEnforcementIndicator) {
        this.sraHurdleRateEnforcementIndicator = pSraHurdleRateEnforcementIndicator;
    }

    public boolean getSkipHurdleRateCheckIndicator() {
        return this.skipHurdleRateCheckIndicator;
    }

    public void setSkipHurdleRateCheckIndicator(final boolean pSkipHurdleRateCheckIndicator) {
        this.skipHurdleRateCheckIndicator = pSkipHurdleRateCheckIndicator;
    }

}
