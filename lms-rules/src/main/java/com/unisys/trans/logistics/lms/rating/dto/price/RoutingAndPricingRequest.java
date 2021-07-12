package com.unisys.trans.logistics.lms.rating.dto.price;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.RevenueManagementInterfaceType;

/**
 * <code>RoutingAndPricingRequest</code> is used for retrieving <code>Routing and Pricing</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>awbCarrierCode
 * <li>awbExecutionDate
 * <li>bankSellingRate
 * <li>exportPaymentCode
 * <li>flightDtos
 * <li>originCurrencyCode
 * <li>participantDtos
 * <li>productCodeIndicator
 * <li>ratingLine
 * <li>ratingLineCount
 * <li>revenueManagementInterfaceType
 * <li>routingAndPricingRouteDtos
 * <li>weightUnit
 * </ul>
 */
public class RoutingAndPricingRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5135893975698550438L;

    /**
     * Attribute to hold <code>awbCarrierCode</code> property.
     */
    private String awbCarrierCode;

    /**
     * Attribute to hold <code>awbExecutionDate</code> property.
     */
    private Date awbExecutionDate;

    /**
     * Attribute to hold <code>bankSellingRate</code> property.
     */
    private BigDecimal bankSellingRate;

    /**
     * Attribute to hold <code>exportPaymentCode</code> property.
     */
    private String exportPaymentCode;

    // private List<PricingFlightDto> flightDtos;

    /**
     * Attribute to hold <code>hostCurrency</code> property.
     */
    private String hostCurrency;
    
    /**
     * Attribute to hold <code>originCurrencyCode</code> property.
     */
    private String originCurrencyCode;

    /**
     * Attribute to hold <code>participantDtos</code> property.
     */
    private List<ParticipantDto> participantDtos;

    /**
     * Attribute to hold <code>productCodeIndicator</code> property.
     */
    private boolean productCodeIndicator;

    /**
     * Attribute to hold <code>ratingLine</code> property.
     */
    private RatingLineDto ratingLine;

    /**
     * Attribute to hold <code>ratingLineCount</code> property.
     */
    private Integer ratingLineCount;

    /**
     * Attribute to hold <code>revenueManagementInterfaceType</code> property.
     */
    private RevenueManagementInterfaceType revenueManagementInterfaceType;
    

    /**
     * Attribute to hold <code>requoteIndicator</code> property.
     */    
    private String requoteIndicator;

    /**
     * Attribute to hold <code>routingAndPricingRouteDtos</code> property.
     */
    private List<RoutingAndPricingRouteDto> routingAndPricingRouteDtos;
    
    /**
     * Attribute to hold <code>skipHurdleRateCheckIndicator</code> property.
     */
    private boolean skipHurdleRateCheckIndicator;

    /**
     * Attribute to hold <code>tvldParam</code> property.
     */
    private String tvldParam;
    
    /**
     * Attribute to hold <code>weightUnit</code> property.
     */
    private WeightUOMType weightUnit;

    /**
     * UserId for the route and quote request
     */
    private String userId;
    
    /**
     * Station code for the route and quote request
     */
    private String station;
    
    /**
     * GroupId for the route and quote request
     */
    private String groupId;
    private List<String> specAirline;
    /**
     * LoyaltyRulesDto for route and Quote.
     */
    private LoyaltyRulesDto loyaltyRulesDto;
    
    /**
     * Attribute to hold <code>loyaltyId</code> property.
     */
    private String loyaltyId;
    
    /**
     * Attribute to hold <code>loyaltyQuoteInd</code> property.
     */
    private boolean loyaltyQuoteInd;
    
    /**
     * Attribute to hold <code>retrievalSource</code> property.
     */
    private String retrievalSource;

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
     * Gets the <code>awbCarrierCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbCarrierCode</code> property.<br>
     */
    public String getAwbCarrierCode() {
        return this.awbCarrierCode;
    }

    /**
     * Gets the <code>awbExecutionDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbExecutionDate</code> property.<br>
     */
    public Date getAwbExecutionDate() {
        return ContractUtility.getClonedDate(this.awbExecutionDate);
    }

    /**
     * Gets the <code>bankSellingRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>bankSellingRate</code> property.<br>
     */
    public BigDecimal getBankSellingRate() {
        return this.bankSellingRate;
    }

    /**
     * Gets the <code>exportPaymentCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>exportPaymentCode</code> property.<br>
     */
    public String getExportPaymentCode() {
        return this.exportPaymentCode;
    }

    /**
     * Gets the <code>hostCurrency</code> property.
     * <p>
     * 
     * @return the current value of the <code>hostCurrency</code> property.<br>
     */
    public String getHostCurrency() {
        return this.hostCurrency;
    }
    
    /*
     * public List<PricingFlightDto> getFlightDtos() {
     * return this.flightDtos;
     * }
     */

    /**
     * Gets the <code>DateRangeDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>DateRangeDto</code> property.<br>
     */
    public String getOriginCurrencyCode() {
        return this.originCurrencyCode;
    }

    /**
     * Holds the list of {@link com.unisys.trans.logistics.lms.rating.dto.price.ParticipantDto
     * ParticipantDto} containing <code>participantDtos</code> details.
     * <p>
     * 
     * @return the current value of <code>participantDtos</code> details.
     */
    public List<ParticipantDto> getParticipantDtos() {
        if (this.participantDtos == null) {
            participantDtos = new ArrayList<ParticipantDto>();
        }
        return this.participantDtos;
    }

    /**
     * Gets the <code>productCodeIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>productCodeIndicator</code> property.
     */
    public boolean getProductCodeIndicator() {
        return this.productCodeIndicator;
    }

    /**
     * Gets the <code>RatingLineDto </code> data transfer object.
     * <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.price.RatingLineDto
     *         RatingLineDto}</code><br>
     *         the current value of <code>ratingLine</code> data transfer
     *         object.<br>
     */
    public RatingLineDto getRatingLine() {
        return this.ratingLine;
    }

    /**
     * Gets the <code>DateRangeDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>DateRangeDto</code> property.<br>
     */
    public Integer getRatingLineCount() {
        return this.ratingLineCount;
    }

    /**
     * Gets the <code>revenueManagementInterfaceType</code> property.
     * <p>
     * Indicator that denotes the revenueManagementInterfaceType.
     * <p>
     * <b> Possible values :</b><br>
     * <li>USE_HURDLE_RATES -Y,
     * <li>DON0T_USE_HURDLE_RATES - N,
     * <li>DISPLAY_AND_COMPARE_DONOT_USE - T;
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * Y<br>
     * <p>
     * 
     * @return the current value of <code>revenueManagementInterfaceType</code> property.<br>
     */
    public RevenueManagementInterfaceType getRevenueManagementInterfaceType() {
        return this.revenueManagementInterfaceType;
    }
    
    public String getRequoteIndicator() {
        return this.requoteIndicator;
    }

    /**
     * Holds the list of {@link com.unisys.trans.logistics.lms.rating.dto.ContractParticipantDto
     * ContractParticipantDto} containing <code>ContractparticipantDtos</code> details.
     * <p>
     * 
     * @return the current value of <code>ContractparticipantDtos</code> details.
     */
    public List<RoutingAndPricingRouteDto> getRoutingAndPricingRouteDtos() {
        return this.routingAndPricingRouteDtos;
    }
    
    public String getTvldParam(){
        return this.tvldParam;
    }

    /**
     * Gets the <code>weightUnit</code> property.
     * <p>
     * Indicator that denotes the WeightUOMType.
     * <p>
     * <b> Possible values :</b><br>
     * <li>EACH-E,
     * <li>KG-K,,
     * <li>LB-P;
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * P<br>
     * <p>
     * 
     * @return the current value of <code>weightUnit</code> property.<br>
     */
    public WeightUOMType getWeightUnit() {
        return this.weightUnit;
    }

    /**
     * Sets the <code>awbCarrierCode</code> property.
     * <p>
     * 
     * @param pAwbCarrierCode
     *            the current value of the <code>awbCarrierCode</code> property.<br>
     */
    public void setAwbCarrierCode(final String pAwbCarrierCode) {
        this.awbCarrierCode = pAwbCarrierCode;
    }

    /**
     * Sets the <code>awbExecutionDate</code> property.
     * <p>
     * 
     * @param pAwbExecutionDate
     *            the current value of the <code>awbExecutionDate</code> property.<br>
     */
    public void setAwbExecutionDate(final Date pAwbExecutionDate) {
        this.awbExecutionDate = ContractUtility.getClonedDate(pAwbExecutionDate);
    }

    /**
     * Sets the <code>bankSellingRate</code> property.
     * <p>
     * 
     * @param pBankSellingRate
     *            the current value of the <code>bankSellingRate</code> property.<br>
     */
    public void setBankSellingRate(final BigDecimal pBankSellingRate) {
        this.bankSellingRate = pBankSellingRate;
    }

    /**
     * Sets the <code>exportPaymentCode</code> property.
     * <p>
     * 
     * @param pExportPaymentCode
     *            the current value of the <code>exportPaymentCode</code> property.<br>
     */
    public void setExportPaymentCode(final String pExportPaymentCode) {
        this.exportPaymentCode = pExportPaymentCode;
    }

    /**
     * Sets the <code>hostCurrency</code> property.
     * <p>
     * 
     * @param pHostCurrency
     *            the current value of the <code>hostCurrency</code> property.<br>
     */
    public void setHostCurrency(final String pHostCurrency) {
        this.hostCurrency = pHostCurrency;
    }
    
    /*
     * public void setFlightDtos(List<PricingFlightDto> pFlightDtos) {
     * this.flightDtos = pFlightDtos;
     * }
     */

    /**
     * Sets the <code>originCurrencyCode</code> property.
     * <p>
     * 
     * @param pOriginCurrencyCode
     *            the current value of the <code>originCurrencyCode</code> property.<br>
     */
    public void setOriginCurrencyCode(final String pOriginCurrencyCode) {
        this.originCurrencyCode = pOriginCurrencyCode;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.price.ParticipantDto
     * ParticipantDto} containing <code>ParticipantDto</code> details.
     * <p>
     * 
     * @param pParticipantDtos
     *            holds the new value of <code>participantDtos</code> type
     *            details.<br>
     */
    public void setParticipantDtos(List<ParticipantDto> pParticipantDtos) {
        this.participantDtos = pParticipantDtos;
    }

    /**
     * Sets the <code>productCodeIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pProductCodeIndicator
     *            the current value of the <code>productCodeIndicator</code> property.
     */
    public void setProductCodeIndicator(final boolean pProductCodeIndicator) {
        this.productCodeIndicator = pProductCodeIndicator;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.price.RatingLineDto
     * RatingLineDto} containing <code>ratingLine</code> details.
     * <p>
     * 
     * @param pRatingLine
     *            holds the new value of <code>ratingLine</code> type
     *            details.<br>
     */
    public void setRatingLine(final RatingLineDto pRatingLine) {
        this.ratingLine = pRatingLine;
    }

    /**
     * Sets the <code>DateRangeDto</code> property.
     * <p>
     * 
     * @param pDateRangeDto
     *            the current value of the <code>DateRangeDto</code> property.<br>
     */
    public void setRatingLineCount(final Integer pRatingLineCount) {
        this.ratingLineCount = pRatingLineCount;
    }

    /**
     * Sets the <code>RevenueManagementInterfaceType</code> property.
     * <p>
     * Indicator that denotes the RevenueManagementInterfaceType.
     * <p>
     * <b> Possible values :</b><br>
     * <li>USE_HURDLE_RATES -Y,
     * <li>DON0T_USE_HURDLE_RATES - N,
     * <li>DISPLAY_AND_COMPARE_DONOT_USE - T;
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * Y<br>
     * <p>
     * 
     * @param pRevenueManagementInterfaceType
     *            <code>{@link RevenueManagementInterfaceType}</code> holds the new value of <code>
     *            RevenueManagementInterfaceType</code> property.<br>
     */
    public void setRevenueManagementInterfaceType(
                final RevenueManagementInterfaceType pRevenueManagementInterfaceType) {
        this.revenueManagementInterfaceType = pRevenueManagementInterfaceType;
    }
    
    public void setRequoteIndicator(final String pRequoteIndicator) {
        this.requoteIndicator = pRequoteIndicator;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingRouteDto
     * RoutingAndPricingRouteDto} containing <code>RoutingAndPricingRouteDto</code> details.
     * <p>
     * 
     * @param pRoutingAndPricingRouteDtos
     *            holds the new value of <code>routingAndPricingRouteDtos</code> type
     *            details.<br>
     */
    public void setRoutingAndPricingRouteDtos(
                final List<RoutingAndPricingRouteDto> pRoutingAndPricingRouteDtos) {
        this.routingAndPricingRouteDtos = pRoutingAndPricingRouteDtos;
    }

    public void addRoutingAndPricingRouteDto(final RoutingAndPricingRouteDto pRoutingAndPricingRouteDto) {
        if (this.routingAndPricingRouteDtos == null) {
            this.setRoutingAndPricingRouteDtos(new ArrayList<RoutingAndPricingRouteDto>());
        }
        this.routingAndPricingRouteDtos.add(pRoutingAndPricingRouteDto);
    }

    /**
     * Sets the <code>weightUnit</code> property.
     * <p>
     * Indicator that denotes the WeightUOMType.
     * <p>
     * <b> Possible values :</b><br>
     * <li>EACH-E,
     * <li>KG-K,,
     * <li>LB-P;
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * P<br>
     * <p>
     * 
     * @param pWeightUnit
     *            <code>{@link WeightUOMType}</code> holds the new value of <code> WeightUOMType</code>
     *            property.<br>
     */
    public void setWeightUnit(final WeightUOMType pWeightUnit) {
        this.weightUnit = pWeightUnit;
    }
    
    public void setTvldParam(final String pTvldParam){
        this.tvldParam = pTvldParam;
    }
    
    public boolean getSkipHurdleRateCheckIndicator() {
        return this.skipHurdleRateCheckIndicator;
    }

    public void setSkipHurdleRateCheckIndicator(final boolean pSkipHurdleRateCheckIndicator) {
        this.skipHurdleRateCheckIndicator = pSkipHurdleRateCheckIndicator;
    }

	public List<String> getSpecAirline() {
		return specAirline;
	}
	public void setSpecAirline(List<String> specAirline) {
		this.specAirline = specAirline;
	}
	public LoyaltyRulesDto getLoyaltyRulesDto() {
		return this.loyaltyRulesDto;
	}

	public void setLoyaltyRulesDto(final LoyaltyRulesDto loyaltyRulesDto) {
		this.loyaltyRulesDto = loyaltyRulesDto;
	}

    /**
     * Gets the <code>loyaltyId</code> property.
     * <p>
     * 
     * @return the current value of the <code>loyaltyId</code> property.<br>
     */
	public String getLoyaltyId() {
		return this.loyaltyId;
	}

    /**
     * Sets the <code>loyaltyId</code> property.
     * <p>
     * 
     * @param pLoyaltyId
     *            the current value of the <code>loyaltyId</code> property.<br>
     */
	public void setLoyaltyId(final String pLoyaltyId) {
		this.loyaltyId = pLoyaltyId;
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
     * <p>
     * 
     * @param pLoyaltyQuoteInd
     *            the current value of the <code>loyaltyQuoteInd</code> property.<br>
     */
	public void setLoyaltyQuoteInd(boolean pLoyaltyQuoteInd) {
		this.loyaltyQuoteInd = pLoyaltyQuoteInd;
	}

    /**
     * Gets the <code>retrievalSource</code> property.
     * <p>
     * 
     * @return the current value of the <code>retrievalSource</code> property.<br>
     */
	public String getRetrievalSource() {
		return this.retrievalSource;
	}

    /**
     * Sets the <code>retrievalSource</code> property.
     * <p>
     * 
     * @param pRetrievalSource
     *            the current value of the <code>retrievalSource</code> property.<br>
     */
	public void setRetrievalSource(final String pRetrievalSource) {
		this.retrievalSource = pRetrievalSource;
	}
}
