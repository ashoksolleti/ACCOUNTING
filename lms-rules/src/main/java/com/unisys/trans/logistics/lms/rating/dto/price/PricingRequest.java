package com.unisys.trans.logistics.lms.rating.dto.price;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.rating.dto.OtherChargeDto;

/**
 * 
 * PricingRequest is the request object needed for pricing a shipment. This
 * object is used for AWB Pricing.
 * 
 */
public class PricingRequest extends AbstractRequest {

    private boolean routingAndPricingIndicator;
    
    public boolean getRoutingAndPricingIndicator() {
        return routingAndPricingIndicator;
    }

    public void setRoutingAndPricingIndicator(final boolean pRoutingAndPricingIndicator) {
        this.routingAndPricingIndicator = pRoutingAndPricingIndicator;
    }
    
    private boolean bookingIndicator;

    public boolean getBookingIndicator() {
        return bookingIndicator;
    }

    public void setBookingIndicator(final boolean pBookingIndicator) {
        this.bookingIndicator = pBookingIndicator;
    }

    /**
     * 
     */
    private static final long serialVersionUID = -8244378722294149595L;

    // ******************************************Start of Newly added Fields
    // ************************************************

    private Boolean authorizedCRUAgent;

    private boolean automaticFWBIndicator;
    
    private BigDecimal totalAwbChargeableWeight;

    private int spotRateWarningCount;
    
    private int otherChargeIndicator;

    public int getSpotRateWarningCount() {
        return this.spotRateWarningCount;
    }

    public void setSpotRateWarningCount(final int pSpotRateWarningCount) {
        this.spotRateWarningCount = pSpotRateWarningCount;
    }

	public BigDecimal getTotalAwbChargeableWeight() {
        return this.totalAwbChargeableWeight;
    }

    public void setTotalAwbChargeableWeight(final BigDecimal pTotalAwbChargeableWeight) {
        this.totalAwbChargeableWeight = pTotalAwbChargeableWeight;
    }

    /**
     * Air Waybill information to be used for pricing.
     */
    private AirWaybillDto awbDto;

    private BigDecimal bankSellingRate;

    private Boolean bestRateIndicator;

    /**
     * Booking Information of the air waybill.
     */
    private BookingDto bookingDto;

    private Boolean bulkShipmentsXRatingLinesAllowedIndicator;

    private Boolean cpsRateQuoteIndicator;

    private Boolean currencyInputIndicator;

    private Integer decimalPositions;

    private PricingFlightDto flightDto;

    private Boolean iATAAgentIndicator;

    private Boolean interlineMinimumIndicator;

    private String originatingTransactionCode;
    
    private boolean userHasAuthority;      
    private List<String> specAirline = null;
    
	/**
     * Attribute to hold <code>loyaltyRulesDto</code> property.
     */
    private LoyaltyRulesDto loyaltyRulesDto;
    
	/**
     * Attribute to hold <code>loyaltyRulesDto</code> property.
     */
    private boolean loyaltyQuoteInd;

    public boolean isUserHasAuthority() {
        return userHasAuthority;
    }

    public void setUserHasAuthority(boolean userHasAuthority) {
        this.userHasAuthority = userHasAuthority;
    }

    /**
     * UserId for the pricing request
     */
    private String userId;
    
    /**
     * Station code for the pricing request
     */
    private String station;
    
    /**
     * GroupId for the pricing request
     */
    private String groupId;

    public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	/**
     * Air Waybill participants
     */
    private ArrayList<ParticipantDto> participantDto;

    /**
     * AirWaybill participants in the order of hierarchy
     */
    private List<ParticipantDto> participantsToSearch;

    public List<ParticipantDto> getParticipantsToSearch() {
        return this.participantsToSearch;
    }

    public void setParticipantsToSearch(final List<ParticipantDto> pParticipantsToSearch) {
        this.participantsToSearch = pParticipantsToSearch;
    }

    private boolean productCodeIndicator;

    private boolean rateWithActualIndicator;

    private Boolean ratingCompleteIndicator;

    private boolean looseGoodsIndicator;
    /**
     * The rating lines of the air waybill that needs pricing.
     */
    private ArrayList<RatingLineDto> ratingLines;

    private Boolean referenceShipmentTriggerIndicator;

    private PricingRevenueDto revenueDto;

    private BigDecimal roundingFactor;

    private Boolean routingAvailabilityPriceIndicator;

    private Boolean showAllContractsIndicator;

    private String selectedEntry;
    
    private OtherChargeDto otherChargeDto;
    /**
     * Planned Allotment identifier associated to Way bill reference
     * */
    private String plannedAllotmentId;

    public String getPlannedAllotmentId() {
        return plannedAllotmentId;
    }

    public void setPlannedAllotmentId(String plannedAllotmentId) {
        this.plannedAllotmentId = plannedAllotmentId;
    }

    public void addRatingLines(final RatingLineDto pRatingLineDto) {
        if (this.ratingLines == null) {
            this.ratingLines = new ArrayList<RatingLineDto>();
        }
        this.ratingLines.add(pRatingLineDto);
    }

    public Boolean getAuthorizedCRUAgent() {
        return this.authorizedCRUAgent;
    }

    public Boolean getAutomaticFWBIndicator() {
        return this.automaticFWBIndicator;
    }

    public AirWaybillDto getAwbDto() {
        return this.awbDto;
    }

    public BigDecimal getBankSellingRate() {
        return this.bankSellingRate;
    }

    public Boolean getBestRateIndicator() {
        return this.bestRateIndicator;
    }

    public BookingDto getBookingDto() {
        return this.bookingDto;
    }

    public Boolean getBulkShipmentsXRateingLinesAllowedIndicator() {
        return this.bulkShipmentsXRatingLinesAllowedIndicator;
    }

    public Boolean getBulkShipmentsXRatingLinesAllowedIndicator() {
        return this.bulkShipmentsXRatingLinesAllowedIndicator;
    }

    public Boolean getCpsRateQuoteIndicator() {
        return this.cpsRateQuoteIndicator;
    }

    public Boolean getCurrencyInputIndicator() {
        return this.currencyInputIndicator;
    }

    public Integer getDecimalPositions() {
        return this.decimalPositions;
    }

    public PricingFlightDto getFlightDto() {
        return this.flightDto;
    }

    public Boolean getiATAAgentIndicator() {
        return this.iATAAgentIndicator;
    }

    public Boolean getInterlineMinimumIndicator() {
        return this.interlineMinimumIndicator;
    }

    public String getOriginatingTransactionCode() {
        return this.originatingTransactionCode;
    }

    public ArrayList<ParticipantDto> getParticipantDto() {
        return this.participantDto;
    }

    public boolean getProductCodeIndicator() {
        return this.productCodeIndicator;
    }

    public boolean getRateWithActualIndicator() {
        return this.rateWithActualIndicator;
    }

    public Boolean getRatingCompleteFlag() {
        return this.ratingCompleteIndicator;
    }

    public Boolean getRatingCompleteIndicator() {
        return this.ratingCompleteIndicator;
    }

    public ArrayList<RatingLineDto> getRatingLines() {
        return this.ratingLines;
    }

    public Boolean getReferenceShipmentTrigger() {
        return this.referenceShipmentTriggerIndicator;
    }

    public Boolean getReferenceShipmentTriggerIndicator() {
        return this.referenceShipmentTriggerIndicator;
    }

    public PricingRevenueDto getRevenueDto() {
        return revenueDto;
    }

    public BigDecimal getRoundingFactor() {
        return this.roundingFactor;
    }

    public Boolean getRoutingAvailabilityPriceIndicator() {
        return this.routingAvailabilityPriceIndicator;
    }

    public Boolean getShowAllContractsIndicator() {
        return this.showAllContractsIndicator;
    }

    public void setAuthorizedCRUAgent(final Boolean pAuthorizedCRUAgent) {
        this.authorizedCRUAgent = pAuthorizedCRUAgent;
    }

    public void setAutomaticFWBIndicator(final boolean pAutomaticFWBIndicator) {
        this.automaticFWBIndicator = pAutomaticFWBIndicator;
    }

    public void setAwbDto(final AirWaybillDto pAwbDto) {
        this.awbDto = pAwbDto;
    }

    public void setBankSellingRate(final BigDecimal pBankSellingRate) {
        this.bankSellingRate = pBankSellingRate;
    }

    public void setBestRateIndicator(final Boolean pBestRateIndicator) {
        this.bestRateIndicator = pBestRateIndicator;
    }

    public void setBookingDto(final BookingDto pBookingDto) {
        this.bookingDto = pBookingDto;
    }

    public void setBulkShipmentsXRateingLinesAllowedIndicator(
                final Boolean pBulkShipmentsXRatingLinesAllowedIndicator) {
        this.bulkShipmentsXRatingLinesAllowedIndicator = pBulkShipmentsXRatingLinesAllowedIndicator;
    }

    public void
                setBulkShipmentsXRatingLinesAllowedIndicator(
                            final Boolean pBulkShipmentsXRatingLinesAllowedIndicator) {
        this.bulkShipmentsXRatingLinesAllowedIndicator = pBulkShipmentsXRatingLinesAllowedIndicator;
    }

    public void setCpsRateQuoteIndicator(final Boolean pCpsRateQuoteIndicator) {
        this.cpsRateQuoteIndicator = pCpsRateQuoteIndicator;
    }

    public void setCurrencyInputIndicator(final Boolean pCurrencyInputIndicator) {
        this.currencyInputIndicator = pCurrencyInputIndicator;
    }

    public void setDecimalPositions(final Integer pDecimalPositions) {
        this.decimalPositions = pDecimalPositions;
    }

    public void setFlightDto(final PricingFlightDto pFlightDto) {
        this.flightDto = pFlightDto;
    }

    public void setiATAAgentIndicator(final Boolean pIATAAgentIndicator) {
        this.iATAAgentIndicator = pIATAAgentIndicator;
    }

    public void setInterlineMinimumIndicator(final Boolean pInterlineMinimumIndicator) {
        this.interlineMinimumIndicator = pInterlineMinimumIndicator;
    }

    public void setOriginatingTransactionCode(final String pOriginatingTransactionCode) {
        this.originatingTransactionCode = pOriginatingTransactionCode;
    }

    public void setParticipantDto(final ArrayList<ParticipantDto> pParticipantDto) {
        this.participantDto = pParticipantDto;
    }

    public void setProductCodeIndicator(final boolean pProductCodeIndicator) {
        this.productCodeIndicator = pProductCodeIndicator;
    }

    public void setRateWithActualIndicator(final boolean pRateWithActualIndicator) {
        this.rateWithActualIndicator = pRateWithActualIndicator;
    }

    public void setRatingCompleteFlag(final Boolean pRatingCompleteFlag) {
        this.ratingCompleteIndicator = pRatingCompleteFlag;
    }

    public void setRatingCompleteIndicator(final Boolean pRatingCompleteIndicator) {
        this.ratingCompleteIndicator = pRatingCompleteIndicator;
    }

    public void setRatingLines(final ArrayList<RatingLineDto> pRatingLines) {
        this.ratingLines = pRatingLines;
    }

    public void setReferenceShipmentTrigger(final Boolean pReferenceShipmentTrigger) {
        this.referenceShipmentTriggerIndicator = pReferenceShipmentTrigger;
    }

    public void setReferenceShipmentTriggerIndicator(final Boolean pReferenceShipmentTriggerIndicator) {
        this.referenceShipmentTriggerIndicator = pReferenceShipmentTriggerIndicator;
    }

    public void setRevenueDto(PricingRevenueDto revenueDto) {
        this.revenueDto = revenueDto;
    }

    public void setRoundingFactor(final BigDecimal pRoundingFactor) {
        this.roundingFactor = pRoundingFactor;
    }

    public void setRoutingAvailabilityPriceIndicator(final Boolean pRoutingAvailabilityPriceIndicator) {
        this.routingAvailabilityPriceIndicator = pRoutingAvailabilityPriceIndicator;
    }

    public void setShowAllContractsIndicator(final Boolean pShowAllContractsIndicator) {
        this.showAllContractsIndicator = pShowAllContractsIndicator;
    }

    /**
     * @return the selectedEntry
     */
    public String getSelectedEntry() {
        return selectedEntry;
    }

    /**
     * @param selectedEntry the selectedEntry to set
     */
    public void setSelectedEntry(String pSelectedEntry) {
        this.selectedEntry = pSelectedEntry;
    }

    public int getOtherChargeIndicator() {
        return otherChargeIndicator;
    }

    public void setOtherChargeIndicator(int otherChargeIndicator) {
        this.otherChargeIndicator = otherChargeIndicator;
    }

    public OtherChargeDto getOtherChargeDto() {
        return otherChargeDto;
    }

    public void setOtherChargeDto(OtherChargeDto otherChargeDto) {
        this.otherChargeDto = otherChargeDto;
    }

	public List<String> getSpecAirline() {
		return specAirline;
	}

	public void setSpecAirline(List<String> specAirline) {
		this.specAirline = specAirline;
	}

    /**
     * Gets the <code>loyaltyRulesDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>loyaltyRulesDto</code> property.<br>
     */
	public LoyaltyRulesDto getLoyaltyRulesDto() {
		return this.loyaltyRulesDto;
	}

    /**
     * Sets the <code>loyaltyRulesDto</code> property.
     * 
     * @param pLoyaltyRulesDto
     *            the new value of the <code>loyaltyRulesDto</code> property.
     */
	public void setLoyaltyRulesDto(final LoyaltyRulesDto pLoyaltyRulesDto) {
		this.loyaltyRulesDto = pLoyaltyRulesDto;
	}

    /**
     * Gets the <code>loyaltyQuoteInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>loyaltyQuoteInd</code> property.<br>
     */
	public boolean getLoyaltyQuoteInd() {
		return this.loyaltyQuoteInd;
	}

    /**
     * Sets the <code>loyaltyQuoteInd</code> property.
     * 
     * @param pLoyaltyQuoteInd
     *            the new value of the <code>loyaltyQuoteInd</code> property.
     */
	public void setLoyaltyQuoteInd(final boolean pLoyaltyQuoteInd) {
		this.loyaltyQuoteInd = pLoyaltyQuoteInd;
	}

	public boolean getLooseGoodsIndicator() {
		return looseGoodsIndicator;
	}

	public void setLooseGoodsIndicator(boolean looseGoodsIndicator) {
		this.looseGoodsIndicator = looseGoodsIndicator;
	}
}