package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class ProrationSegmentDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = 387846538570664282L;

    private AirWaybillRevenueDto awbRevenueDto;

    private BigDecimal carrierISCPercent;

    private BigDecimal chargeableWeightPercent;

    private boolean clubbedIndicator;

    private String currency;

    private FlightInfoDto flightInfoDto;

    private boolean hostCarier;

    private Long oId;

    private BigDecimal prorationCurrencySegmentRevenue;

    private String prorationIdentifier;

    private Map<Integer, String> prorationIdentifiers;

    private String prorationIdIndicator;
    
    private String appliedProrationIdentifiers;

    private String prorationMethod;

    private String prorationType;

    private String segmentCarrier;

    private String segmentDestination;

    private BigDecimal segmentMileage;

    private BigDecimal segmentMileagePercent;

    private String segmentOrigin;

    private BigDecimal segmentProrationCurencyYield;

    private BigDecimal segmentRevenue;

    private String segmentType;

    private BigDecimal segmentYield;

    private BigDecimal totalChargeableWeight;

    private BigDecimal totalGrossWeight;

    private Integer totalPeices;

    private WeightUOMType weightUnit;
    
private Boolean clubbedSegmentIndicator;
    
    public Boolean getClubbedSegmentIndicator() {
		return clubbedSegmentIndicator;
	}

	public void setClubbedSegmentIndicator(Boolean clubbedSegmentIndicator) {
		this.clubbedSegmentIndicator = clubbedSegmentIndicator;
	}

    public AirWaybillRevenueDto getAwbRevenueDto() {
        return this.awbRevenueDto;
    }

    public BigDecimal getCarrierISCPercent() {
        return this.carrierISCPercent;
    }

    public BigDecimal getChargeableWeightPercent() {
        return this.chargeableWeightPercent;
    }

    public boolean getClubbedIndicator() {
        return this.clubbedIndicator;
    }

    public String getCurrency() {
        return this.currency;
    }

    public FlightInfoDto getFlightInfoDto() {
        return this.flightInfoDto;
    }

    public boolean getHostCarier() {
        return this.hostCarier;
    }

    public Long getOId() {
        return this.oId;
    }

    public BigDecimal getProrationCurrencySegmentRevenue() {
        return this.prorationCurrencySegmentRevenue;
    }

    public String getProrationIdentifier() {
        return this.prorationIdentifier;
    }

    public Map<Integer, String> getProrationIdentifiers() {
        return this.prorationIdentifiers;
    }

    public String getProrationIdIndicator() {
        return this.prorationIdIndicator;
    }

    public String getProrationMethod() {
        return this.prorationMethod;
    }

    public String getProrationType() {
        return this.prorationType;
    }

    public String getSegmentCarrier() {
        return this.segmentCarrier;
    }

    public String getSegmentDestination() {
        return this.segmentDestination;
    }

    public BigDecimal getSegmentMileage() {
        return this.segmentMileage;
    }

    public BigDecimal getSegmentMileagePercent() {
        return this.segmentMileagePercent;
    }

    public String getSegmentOrigin() {
        return this.segmentOrigin;
    }

    public BigDecimal getSegmentProrationCurencyYield() {
        return this.segmentProrationCurencyYield;
    }

    public BigDecimal getSegmentRevenue() {
        return this.segmentRevenue;
    }

    public String getSegmentType() {
        return this.segmentType;
    }

    public BigDecimal getSegmentYield() {
        return this.segmentYield;
    }

    public BigDecimal getTotalChargeableWeight() {
        return this.totalChargeableWeight;
    }

    public BigDecimal getTotalGrossWeight() {
        return this.totalGrossWeight;
    }

    public Integer getTotalPeices() {
        return this.totalPeices;
    }

    public WeightUOMType getWeightUnit() {
        return this.weightUnit;
    }

    public void setAwbRevenueDto(final AirWaybillRevenueDto pAwbRevenueDto) {
        this.awbRevenueDto = pAwbRevenueDto;
    }

    public void setCarrierISCPercent(final BigDecimal pCarrierISCPercent) {
        this.carrierISCPercent = pCarrierISCPercent;
    }

    public void setChargeableWeightPercent(final BigDecimal pChargeableWeightPercent) {
        this.chargeableWeightPercent = pChargeableWeightPercent;
    }

    public void setClubbedIndicator(final boolean pClubbedIndicator) {
        this.clubbedIndicator = pClubbedIndicator;
    }

    public void setCurrency(final String pCurrency) {
        this.currency = ContractUtility.convertToUpperCase(pCurrency);
    }

    public void setFlightInfoDto(final FlightInfoDto pFlightInfoDto) {
        this.flightInfoDto = pFlightInfoDto;
    }

    public void setHostCarier(final boolean pIsHostCarier) {
        this.hostCarier = pIsHostCarier;
    }

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    public void setProrationCurrencySegmentRevenue(final BigDecimal pProrationCurrencySegmentRevenue) {
        this.prorationCurrencySegmentRevenue = pProrationCurrencySegmentRevenue;
    }

    public void setProrationIdentifier(final String pProrationIdentifier) {
        this.prorationIdentifier = ContractUtility.convertToUpperCase(pProrationIdentifier);
    }

    public void setProrationIdentifiers(final Map<Integer, String> pProrationIdentifiers) {
        this.prorationIdentifiers = pProrationIdentifiers;
    }

    public void setProrationIdIndicator(final String pProrationIdIndicator) {
        this.prorationIdIndicator = ContractUtility.convertToUpperCase(pProrationIdIndicator);
    }

    public void setProrationMethod(final String pProrationMethod) {
        this.prorationMethod = pProrationMethod;
    }

    public void setProrationType(final String pProrationType) {
        this.prorationType = ContractUtility.convertToUpperCase(pProrationType);
    }

    public void setSegmentCarrier(final String pSegmentCarrier) {
        this.segmentCarrier = ContractUtility.convertToUpperCase(pSegmentCarrier);
    }

    public void setSegmentDestination(final String pSegmentDestination) {
        this.segmentDestination = ContractUtility.convertToUpperCase(pSegmentDestination);
    }

    public void setSegmentMileage(final BigDecimal pSegmentMileage) {
        this.segmentMileage = pSegmentMileage;
    }

    public void setSegmentMileagePercent(final BigDecimal pSegmentMileagePercent) {
        this.segmentMileagePercent = pSegmentMileagePercent;
    }

    public void setSegmentOrigin(final String pSegmentOrigin) {
        this.segmentOrigin = ContractUtility.convertToUpperCase(pSegmentOrigin);
    }

    public void setSegmentProrationCurencyYield(final BigDecimal pSegmentProrationCurencyYield) {
        this.segmentProrationCurencyYield = pSegmentProrationCurencyYield;
    }

    public void setSegmentRevenue(final BigDecimal pSegmentRevenue) {
        this.segmentRevenue = pSegmentRevenue;
    }

    public void setSegmentType(final String pSegmentType) {
        this.segmentType = ContractUtility.convertToUpperCase(pSegmentType);
    }

    public void setSegmentYield(final BigDecimal pSegmentYield) {
        this.segmentYield = pSegmentYield;
    }

    public void setTotalChargeableWeight(final BigDecimal pTotalChargeableWeight) {
        this.totalChargeableWeight = pTotalChargeableWeight;
    }

    public void setTotalGrossWeight(final BigDecimal pTotalGrossWeight) {
        this.totalGrossWeight = pTotalGrossWeight;
    }

    public void setTotalPeices(final Integer pTotalPeices) {
        this.totalPeices = pTotalPeices;
    }

    public void setWeightUnit(final WeightUOMType pWeightUnit) {
        this.weightUnit = pWeightUnit;
    }

    public void addProrationIdentifier(Integer rateLineNo, String strProrateIdentifier) {
        if (this.prorationIdentifiers == null) {
            this.prorationIdentifiers = new HashMap<Integer, String>();
        }
        this.getProrationIdentifiers().put(rateLineNo, strProrateIdentifier);
    }
    
    public String getAppliedProrationIdentifiers() {
		return appliedProrationIdentifiers;
	}

	public void setAppliedProrationIdentifiers(String appliedProrationIdentifiers) {
		this.appliedProrationIdentifiers = appliedProrationIdentifiers;
	}

	@Override
    public String toString() {

        final StringBuilder strBuilder = new StringBuilder();
        if (this.getSegmentOrigin() != null) {
            strBuilder.append(this.getSegmentOrigin());
            strBuilder.append(" ");
        }
        if (this.getSegmentDestination() != null) {
            strBuilder.append(this.getSegmentDestination());
            strBuilder.append(" ");
        }
        if (this.getSegmentCarrier() != null) {
            strBuilder.append(this.getSegmentCarrier());
            strBuilder.append(" ");
        }
        if (this.getSegmentRevenue() != null) {
            strBuilder.append(this.getSegmentRevenue());
            strBuilder.append(" ");
        }
        if (this.getSegmentYield() != null) {
            strBuilder.append(this.getSegmentYield());
            strBuilder.append(" ");
        }
        if (this.getTotalPeices() != null) {
            strBuilder.append(this.getTotalPeices());
            strBuilder.append(" ");
        }

        if (this.getTotalGrossWeight() != null) {
            strBuilder.append(this.getTotalGrossWeight());
            strBuilder.append(" ");
        }
        if (this.getTotalChargeableWeight() != null) {
            strBuilder.append(this.getTotalChargeableWeight());
            strBuilder.append(" ");
        }
        if (this.getSegmentMileage() != null) {
            strBuilder.append(this.getSegmentMileage());
            strBuilder.append(" ");
        }
        if (this.getSegmentMileagePercent() != null) {
            strBuilder.append(this.getSegmentMileagePercent());
            strBuilder.append(" ");
        }

        if (this.getProrationMethod() != null) {
            strBuilder.append(this.getProrationMethod());
            strBuilder.append(" ");
        }
        if (this.getProrationIdentifier() != null) {
            strBuilder.append(this.getProrationIdentifier());
            strBuilder.append(" ");
        }
        if (this.getProrationIdIndicator() != null) {
            strBuilder.append(this.getProrationIdIndicator());
            strBuilder.append(" ");
        }
        if (this.getAppliedProrationIdentifiers() != null) {
            strBuilder.append(this.getAppliedProrationIdentifiers());
            strBuilder.append(" ");
        }
        return strBuilder.toString();

    }

}
