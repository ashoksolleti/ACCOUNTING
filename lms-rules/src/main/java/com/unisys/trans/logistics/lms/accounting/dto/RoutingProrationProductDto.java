package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RoutingProrationProductDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -2284140595973590438L;

    private BigDecimal actualWeightCharges;


    private String productCode;

    private List<String> specialHandlingCodes;
    
    private List<OtherChargeEntryDto> otherCharges;

    private BigDecimal totalChargeableWeight;

    public BigDecimal getActualWeightCharges() {
        return this.actualWeightCharges;
    }

    public List<OtherChargeEntryDto> getOtherCharges() {
        return this.otherCharges;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public List<String> getSpecialHandlingCodes() {
        return this.specialHandlingCodes;
    }

    public BigDecimal getTotalChargeableWeight() {
        return this.totalChargeableWeight;
    }

    public void setActualWeightCharges(final BigDecimal pActualWeightCharges) {
        this.actualWeightCharges = pActualWeightCharges;
    }

    public void setOtherCharges(final List<OtherChargeEntryDto> pOtherCharges) {
        this.otherCharges = pOtherCharges;
    }

    public void setProductCode(final String pProductCode) {
        this.productCode = pProductCode;
    }

    public void setSpecialHandlingCodes(final List<String> pSpecialHandlingCodes) {
        this.specialHandlingCodes = pSpecialHandlingCodes;
    }

    public void setTotalChargeableWeight(final BigDecimal pTotalChargeableWeight) {
        this.totalChargeableWeight = pTotalChargeableWeight;
    }

}
