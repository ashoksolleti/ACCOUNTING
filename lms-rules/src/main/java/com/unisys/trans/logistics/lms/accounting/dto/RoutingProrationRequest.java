package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class RoutingProrationRequest extends AbstractRequest {

    /**
     * 
     */
    private static final long serialVersionUID = 1762120568658352598L;

    private String acn;

    private BigDecimal chargeableWeight;

    private String classRatingId;

    private String commodityCode;

    private BigDecimal enteredChargeableWeight;

    private Date executionDate;

    private BigDecimal grossWeight;

    final private List<RoutingProrationRouteDto> routingProrationRouteDtos =
                new ArrayList<RoutingProrationRouteDto>();

    private BigDecimal totalCharges;

    private String uldType;

    private BigDecimal volume;

    private WeightUOMType weightUnit;

    public void addRoutingProrationRouteDto(final RoutingProrationRouteDto pRoutingProrationRouteDto) {
        this.routingProrationRouteDtos.add(pRoutingProrationRouteDto);
    }

    public String getAcn() {
        return this.acn;
    }

    public BigDecimal getChargeableWeight() {
        return this.chargeableWeight;
    }

    public String getClassRatingId() {
        return this.classRatingId;
    }

    public String getCommodityCode() {
        return this.commodityCode;
    }

    public BigDecimal getEnteredChargeableWeight() {
        return this.enteredChargeableWeight;
    }

    public Date getExecutionDate() {
        return this.executionDate;
    }

    public BigDecimal getGrossWeight() {
        return this.grossWeight;
    }

    public List<RoutingProrationRouteDto> getRoutingProrationRouteDtos() {
        return this.routingProrationRouteDtos;
    }

    public BigDecimal getTotalCharges() {
        return this.totalCharges;
    }

    public String getUldType() {
        return this.uldType;
    }

    public BigDecimal getVolume() {
        return this.volume;
    }

    public WeightUOMType getWeightUnit() {
        return this.weightUnit;
    }

    public void setAcn(final String pAcn) {
        this.acn = pAcn;
    }

    public void setChargeableWeight(final BigDecimal pChargeableWeight) {
        this.chargeableWeight = pChargeableWeight;
    }

    public void setClassRatingId(final String pClassRatingId) {
        this.classRatingId = pClassRatingId;
    }

    public void setCommodityCode(final String pCommodityCode) {
        this.commodityCode = pCommodityCode;
    }

    public void setEnteredChargeableWeight(final BigDecimal pEnteredChargeableWeight) {
        this.enteredChargeableWeight = pEnteredChargeableWeight;
    }

    public void setExecutionDate(final Date pReadDate) {
        this.executionDate = pReadDate;
    }

    public void setGrossWeight(final BigDecimal pGrossWeight) {
        this.grossWeight = pGrossWeight;
    }

    public void setTotalCharges(final BigDecimal pTotalCharges) {
        this.totalCharges = pTotalCharges;
    }

    public void setUldType(final String pUldType) {
        this.uldType = pUldType;
    }

    public void setVolume(final BigDecimal pVolume) {
        this.volume = pVolume;
    }

    public void setWeightUnit(final WeightUOMType pWeightUnit) {
        this.weightUnit = pWeightUnit;
    }
}