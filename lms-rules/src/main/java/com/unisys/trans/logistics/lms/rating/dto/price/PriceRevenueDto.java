package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.rating.dto.constants.RevenueManagementInterfaceType;

public class PriceRevenueDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private RevenueManagementInterfaceType revenueManagementInterfaceType;

    private boolean contractHurdleRateEnforcementIndicator;

    private boolean sraHurdleRateEnforcementIndicator;

    private BigDecimal otherTotalCharges;

    private BigDecimal mileageHostPercentage;

    private BigDecimal eventHurdleAmount;

    public RevenueManagementInterfaceType getRevenueManagementInterfaceType() {
        return this.revenueManagementInterfaceType;
    }

    public void setRevenueManagementInterfaceType(
                final RevenueManagementInterfaceType pRevenueManagementInterfaceType) {
        this.revenueManagementInterfaceType = pRevenueManagementInterfaceType;
    }

    public boolean isContractHurdleRateEnforcementIndicator() {
        return this.contractHurdleRateEnforcementIndicator;
    }

    public void setContractHurdleRateEnforcementIndicator(
                final boolean pContractHurdleRateEnforcementIndicator) {
        this.contractHurdleRateEnforcementIndicator = pContractHurdleRateEnforcementIndicator;
    }

    public boolean isSraHurdleRateEnforcementIndicator() {
        return this.sraHurdleRateEnforcementIndicator;
    }

    public void setSraHurdleRateEnforcementIndicator(final boolean pSraHurdleRateEnforcementIndicator) {
        this.sraHurdleRateEnforcementIndicator = pSraHurdleRateEnforcementIndicator;
    }

    public BigDecimal getOtherTotalCharges() {
        return this.otherTotalCharges;
    }

    public void setOtherTotalCharges(final BigDecimal pOtherTotalCharges) {
        this.otherTotalCharges = pOtherTotalCharges;
    }

    public BigDecimal getMileageHostPercentage() {
        return this.mileageHostPercentage;
    }

    public void setMileageHostPercentage(final BigDecimal pMileageHostPercentage) {
        this.mileageHostPercentage = pMileageHostPercentage;
    }

    public BigDecimal getEventHurdleAmount() {
        return this.eventHurdleAmount;
    }

    public void setEventHurdleAmount(final BigDecimal pEventHurdleAmount) {
        this.eventHurdleAmount = pEventHurdleAmount;
    }

}
