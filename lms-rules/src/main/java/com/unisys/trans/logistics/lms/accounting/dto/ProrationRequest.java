package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.accounting.dto.constants.WeightType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class ProrationRequest extends AbstractRequest {

    /**
     * 
     */
    private static final long serialVersionUID = 1604199852432959464L;

    private boolean accountingIndicator;

    private String acn;

    private AirWaybillRevenueDto airWaybillRevenueDto;

    private List<BookingSegmentDto> bookingSegmentDtos;

    private Date executionDate;

    private String hostCurrencyCode;

    private boolean includeAccountingIndicator;

    private boolean lmsProrationRequestIndicator;

    private OtherChargeDto otherChargeDto;

    private List<OtherChargeEntryDto> otherChargeEntryDtos;

    private boolean partShipmentIndicator;

    private String productCode;

    private String prorationCurrencyCode;

    private List<RatingLineEntryDto> ratingLineEntryDtos;

    private List<RoutingSegmentDto> routeDtos;

    private boolean skipProvisoIndicator;

    private boolean skipSPAIndicator;

    private Map<String, ArrayList<String>> spaIdentifiers;

    private List<String> specialHandlingCodes;

    private BigDecimal totalActualWeightCharges;

    private BigDecimal totalChargeableWeight;

    private BigDecimal totalGrossWeight;

    private BigDecimal totalPublishedWeightCharges;

    private boolean useGCMIndicator;

    private BigDecimal volumetricWeight;

    private WeightType weightType;

    private WeightUOMType hostWeightUnit;

    private WeightUOMType awbWeightUnit;
    
    private boolean routingAndProrationIndicator;
    
    private String awbOrigin;
    

	private String awbDestn;
    
    public boolean getRoutingAndProrationIndicator() {
        return this.routingAndProrationIndicator;
    }

    public void setRoutingAndProrationIndicator(final boolean pRoutingAndProrationIndicator) {
        this.routingAndProrationIndicator = pRoutingAndProrationIndicator;
    }

    public void addBookingLine(final BookingSegmentDto pBookingSegmentDto) {
        if (this.bookingSegmentDtos == null) {
            this.bookingSegmentDtos = new ArrayList<BookingSegmentDto>();
        }
        this.bookingSegmentDtos.add(pBookingSegmentDto);
    }

    public void addOtherChargeLine(final OtherChargeEntryDto pOtherChargeDto) {
        if (this.otherChargeEntryDtos == null) {
            this.otherChargeEntryDtos = new ArrayList<OtherChargeEntryDto>();
        }
        this.otherChargeEntryDtos.add(pOtherChargeDto);
    }

    public void addRatingLine(final RatingLineEntryDto pRatingLineEntryDto) {
        if (this.ratingLineEntryDtos == null) {
            this.ratingLineEntryDtos = new ArrayList<RatingLineEntryDto>();
        }
        if (this.publishedRatingLineEntryDtos == null) {
            this.publishedRatingLineEntryDtos = new ArrayList<RatingLineEntryDto>();
        }
        this.ratingLineEntryDtos.add(pRatingLineEntryDto);
        this.publishedRatingLineEntryDtos.add(pRatingLineEntryDto);
    }

    public void addRouteDtos(final RoutingSegmentDto pRouteDto) {
        if (this.routeDtos == null) {
            this.routeDtos = new ArrayList<RoutingSegmentDto>();
        }
        this.routeDtos.add(pRouteDto);
    }

    public boolean getAccountingIndicator() {
        return this.accountingIndicator;
    }

    public String getAcn() {
        return this.acn;
    }

    public AirWaybillRevenueDto getAirWaybillRevenueDto() {
        if (this.airWaybillRevenueDto == null) {
            this.airWaybillRevenueDto = new AirWaybillRevenueDto();
        }
        return this.airWaybillRevenueDto;
    }

    public List<BookingSegmentDto> getBookingSegmentDtos() {
        return this.bookingSegmentDtos;
    }

    public Date getExecutionDate() {
        return ContractUtility.getClonedDate(this.executionDate);
    }

    public String getHostCurrencyCode() {
        return this.hostCurrencyCode;
    }

    public boolean getIncludeAccountingIndicator() {
        return includeAccountingIndicator;
    }

    public boolean getLmsProrationRequestIndicator() {
        return this.lmsProrationRequestIndicator;
    }

    public OtherChargeDto getOtherChargeDto() {
        return this.otherChargeDto;
    }

    public List<OtherChargeEntryDto> getOtherChargeEntryDtos() {
        return this.otherChargeEntryDtos;
    }

    public boolean getPartShipmentIndicator() {
        return this.partShipmentIndicator;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getProrationCurrencyCode() {
        return this.prorationCurrencyCode;
    }

    public List<RatingLineEntryDto> getRatingLineEntryDtos() {
        return this.ratingLineEntryDtos;
    }

    public List<RoutingSegmentDto> getRouteDtos() {
        return this.routeDtos;
    }

    public boolean getSkipProvisoIndicator() {
        return this.skipProvisoIndicator;
    }

    public boolean getSkipSPAIndicator() {
        return this.skipSPAIndicator;
    }

    public Map<String, ArrayList<String>> getSpaIdentifiers() {
        return this.spaIdentifiers;
    }

    public List<String> getSpecialHandlingCodes() {
        return this.specialHandlingCodes;
    }

    public BigDecimal getTotalActualWeightCharges() {
        return this.totalActualWeightCharges;
    }

    public BigDecimal getTotalChargeableWeight() {
        return this.totalChargeableWeight;
    }

    public BigDecimal getTotalGrossWeight() {
        return this.totalGrossWeight;
    }

    public BigDecimal getTotalPublishedWeightCharges() {
        return this.totalPublishedWeightCharges;
    }

    public boolean getUseGCMIndicator() {
        return this.useGCMIndicator;
    }

    /**
     * @return the volumetricWeight
     */
    public BigDecimal getVolumetricWeight() {
        return this.volumetricWeight;
    }

    public WeightType getWeightType() {
        return this.weightType;
    }

    public WeightUOMType getHostWeightUnit() {
        return this.hostWeightUnit;
    }

    public void setAccountingIndicator(final boolean pAccountingIndicator) {
        this.accountingIndicator = pAccountingIndicator;
    }

    public void setAcn(final String pAcn) {
        this.acn = pAcn;
    }

    public void setAirWaybillRevenueDto(final AirWaybillRevenueDto pAirWaybillRevenueDto) {
        this.airWaybillRevenueDto = pAirWaybillRevenueDto;
    }

    public void setBookingSegmentDtos(final List<BookingSegmentDto> pBookingSegmentDtos) {
        this.bookingSegmentDtos = pBookingSegmentDtos;
    }

    public void setExecutionDate(final Date pExecutionDate) {
        this.executionDate = ContractUtility.getClonedDate(pExecutionDate);
    }

    public void setHostCurrencyCode(final String pCurrencyCode) {
        this.hostCurrencyCode = pCurrencyCode;
    }

    public void setIncludeAccountingIndicator(final boolean pIncludeAccountingIndicator) {
        this.includeAccountingIndicator = pIncludeAccountingIndicator;
    }

    public void setLmsProrationRequestIndicator(final boolean pLmsProrationRequestIndicator) {
        this.lmsProrationRequestIndicator = pLmsProrationRequestIndicator;
    }

    public void setOtherChargeDto(final OtherChargeDto pOtherChargeDto) {
        this.otherChargeDto = pOtherChargeDto;
    }

    public void setOtherChargeEntryDtos(final List<OtherChargeEntryDto> pOtherChargeEntryDtos) {
        this.otherChargeEntryDtos = pOtherChargeEntryDtos;
    }

    public void setPartShipmentIndicator(final boolean pPartShipmentIndicator) {
        this.partShipmentIndicator = pPartShipmentIndicator;
    }

    public void setProductCode(final String pProductCode) {
        this.productCode = pProductCode;
    }

    public void setProrationCurrencyCode(final String pProrationCurrencyCode) {
        this.prorationCurrencyCode = pProrationCurrencyCode;
    }

    public void setRatingLineEntryDtos(final List<RatingLineEntryDto> pRatingLineEntryDtos) {
        this.ratingLineEntryDtos = pRatingLineEntryDtos;
    }

    public void setRouteDtos(final List<RoutingSegmentDto> pRouteDtos) {
        this.routeDtos = pRouteDtos;
    }

    public void setSkipProvisoIndicator(final boolean pSkipProvisoIndicator) {
        this.skipProvisoIndicator = pSkipProvisoIndicator;
    }

    public void setSkipSPAIndicator(final boolean pSkipSPAIndicator) {
        this.skipSPAIndicator = pSkipSPAIndicator;
    }

    public void setSpaIdentifiers(final Map<String, ArrayList<String>> pSpaIdentifiers) {
        this.spaIdentifiers = pSpaIdentifiers;
    }

    public void setSpecialHandlingCodes(final List<String> pSpecialHandlingCodes) {
        this.specialHandlingCodes = pSpecialHandlingCodes;
    }

    public void setTotalActualWeightCharges(final BigDecimal pTotalActualWeightCharges) {
        this.totalActualWeightCharges = pTotalActualWeightCharges;
    }

    public void setTotalChargeableWeight(final BigDecimal pTotalChargeableWeight) {
        this.totalChargeableWeight = pTotalChargeableWeight;
    }

    public void setTotalGrossWeight(final BigDecimal pTotalGrossWeight) {
        this.totalGrossWeight = pTotalGrossWeight;
    }

    public void setTotalPublishedWeightCharges(final BigDecimal pTotalPublishedWeightCharges) {
        this.totalPublishedWeightCharges = pTotalPublishedWeightCharges;
    }

    public void setUseGCMIndicator(final boolean pUseGCMIndicator) {
        this.useGCMIndicator = pUseGCMIndicator;
    }

    /**
     * @param volumetricWeight the volumetricWeight to set
     */
    public void setVolumetricWeight(final BigDecimal pVolumetricWeight) {
        this.volumetricWeight = pVolumetricWeight;
    }

    public void setWeightType(final WeightType pWeightType) {
        this.weightType = pWeightType;
    }

    public void setHostWeightUnit(final WeightUOMType pHostWeightUnit) {
        this.hostWeightUnit = pHostWeightUnit;
    }

    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("ACN :");
        strBuilder.append(this.getAcn());
        strBuilder.append(" ");
        strBuilder.append("Product Code: ");
        strBuilder.append(this.getProductCode());
        strBuilder.append(" ");
        strBuilder.append("Execution Date: ");
        strBuilder.append(this.getExecutionDate());
        strBuilder.append(" ");
        strBuilder.append("Total Actual Weight Charge: ");
        strBuilder.append(this.getTotalActualWeightCharges());
        strBuilder.append(" ");
        strBuilder.append("Total Gross Weight: ");
        strBuilder.append(this.getTotalGrossWeight());
        strBuilder.append(" ");
        strBuilder.append("Total Chargeable Weight: ");
        strBuilder.append(this.getTotalChargeableWeight());
        strBuilder.append(" ");
        strBuilder.append("Currency Code: ");
        strBuilder.append(this.getHostCurrencyCode());
        if (this.getHostWeightUnit() != null) {
            strBuilder.append(" ");
            strBuilder.append("Host Weight Unit: ");
            strBuilder.append(this.getHostWeightUnit());
        }
        strBuilder.append(" ");
        strBuilder.append("Routing Details : ");
        if (this.getRouteDtos() != null) {
            for (RoutingSegmentDto routingDto : this.getRouteDtos()) {
                strBuilder.append(" ORIGIN  " + routingDto.getOriginStation());
                strBuilder.append(" DESTINATION "
                            + routingDto.getDestinationStation());
                strBuilder.append(" CARRIER "
                            + routingDto.getDestinationCarrier());
                strBuilder.append(" FLIGHT NO " + routingDto.getFlightNumber());
            }
        }
        strBuilder.append(" ");
        return strBuilder.toString();

    }

    private List<RatingLineEntryDto> publishedRatingLineEntryDtos;

    public List<RatingLineEntryDto> getPublishedRatingLineEntryDtos() {
        return this.publishedRatingLineEntryDtos;
    }

    public void setPublishedRatingLineEntryDtos(final List<RatingLineEntryDto> pPublishedRatingLineEntryDtos) {
        this.publishedRatingLineEntryDtos = pPublishedRatingLineEntryDtos;
    }

    public WeightUOMType getAwbWeightUnit() {
        return this.awbWeightUnit;
    }

    public void setAwbWeightUnit(final WeightUOMType pAwbWeightUnit) {
        this.awbWeightUnit = pAwbWeightUnit;
    }
    
    //Deeps
    private List<AirwaybillRouteDto> airwaybillRoutes;
    
    public List<AirwaybillRouteDto> getAirwaybillRoutes() {
        return this.airwaybillRoutes;
    }
    public void setAirwaybillRoutes(
                final List<AirwaybillRouteDto> pAirwaybillRoutes) {
    	this.airwaybillRoutes = pAirwaybillRoutes;
}
    private List<AirWaybillNumberDto> airwaybillNumber;

	public List<AirWaybillNumberDto> getAirwaybillNumber() {
		return this.airwaybillNumber;
	}

	public void setAirwaybillNumber(List<AirWaybillNumberDto> airwaybillNumber) {
		this.airwaybillNumber = airwaybillNumber;
	}
    
	public void addAirwaybillNumber(final AirWaybillNumberDto anAccountingAirWaybillDto){
		if(this.getAirwaybillNumber()==null){
			this.airwaybillNumber = new ArrayList<AirWaybillNumberDto>();
		}
		this.airwaybillNumber.add(anAccountingAirWaybillDto);
	}
	
    public String getAwbOrigin() {
		return awbOrigin;
	}

	public void setAwbOrigin(String awbOrigin) {
		this.awbOrigin = awbOrigin;
	}

	public String getAwbDestn() {
		return awbDestn;
	}

	public void setAwbDestn(String awbDestn) {
		this.awbDestn = awbDestn;
	}

}
