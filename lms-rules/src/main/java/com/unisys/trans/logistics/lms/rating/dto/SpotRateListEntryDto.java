//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.rating.dto;

import java.math.BigDecimal;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.dto.ContactDto;
import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.ContractDefinitionType;
import com.unisys.trans.logistics.lms.rating.dto.constants.ContractStatusType;
import com.unisys.trans.logistics.lms.rating.dto.constants.PayCodeType;
import com.unisys.trans.logistics.lms.rating.dto.constants.ULDChargeType;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

/**
 * <code>SpotRateListEntryDto</code> contain details of SpotRateListEntries.
 * <p>
 * This contains all information about SpotRateListEntries.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>appliedToAWB
 * <li>associatedAWB
 * <li>authorizationDate
 * <li>authorizedAgent
 * <li>authuorizationCode
 * <li>classRatingId
 * <li>commodityNumber
 * <li>contactDto
 * <li>currencyCode
 * <li>dateRangeDto
 * <li>destination
 * <li>flightDate
 * <li>flightNumber
 * <li>identifier
 * <li>lastUpdateDate
 * <li>minimumShipmentSize
 * <li>minimumWeight
 * <li>name
 * <li>netOnNet
 * <li>oId
 * <li>origin
 * <li>overPivotRate
 * <li>participantAccountNumber
 * <li>payCode
 * <li>pivotWeight
 * <li>productCode
 * <li>rate
 * <li>rateAdjustment
 * <li>rateClass
 * <li>rateSource
 * <li>rateType
 * <li>ratingWeightUnitType
 * <li>remarks
 * <li>routeCompression
 * <li>specialNotes
 * <li>spotRateId
 * <li>sraDefinition
 * <li>status
 * <li>transfer
 * <li>uldChargeCode
 * <li>uldType
 * </ul>
 */

public class SpotRateListEntryDto extends PersistenceObjectDto {

	/**
	 * Attribute to hold <code>EMPTY_STRING</code> property.
	 */
	private static final String EMPTY_STRING = "";

	/**
	 * Attribute to hold <code>NO_LITERAL</code> property.
	 */
	private static final String NO_LITERAL = "No";

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 3646111507866310167L;

	/**
	 * Attribute to hold <code>YES_LITERAL</code> property.
	 */
	private static final String YES_LITERAL = "yes";

	/**
	 * Attribute to hold <code>acceptActionIndicator</code> property.
	 */
	private boolean acceptActionIndicator;

	/**
	 * Attribute to hold <code>allInPricingIndicator</code> property.
	 */
	private boolean allInPricingIndicator;

	/**
	 * Attribute to hold <code>appliedToAWB</code> property.
	 */
	private String appliedToAWB;

	/**
	 * Attribute to hold <code>associatedAWB</code> property.
	 */
	private String associatedAWB;

	/**
	 * Attribute to hold <code>authorizedAgent</code> property.
	 */
	private UserAuditDto authorizedAgent;

	/**
	 * Attribute to hold <code>authuorizationCode</code> property.
	 */
	private String authuorizationCode;

	/**
	 * Attribute to hold <code>classRatingId</code> property.
	 */
	private String classRatingId;

	/**
	 * Attribute to hold <code>commodityNumber</code> property.
	 */
	private String commodityNumber;

	/**
	 * Attribute to hold <code>contactDto</code> property.
	 */
	private ContactDto contactDto;

	/**
	 * Attribute to hold <code>currencyCode</code> property.
	 */
	private String currencyCode;

	/**
	 * Attribute to hold <code>dateRangeDto</code> property.
	 */
	private DateRangeDto dateRangeDto;

	/**
	 * Attribute to hold <code>destination</code> property.
	 */
	private GeographicDataDto destination;

	/**
	 * Attribute to hold <code>destination</code> property.
	 */
	private String destinationWithCarrier;

	/**
	 * Attribute to hold <code>flightDate</code> property.
	 */
	private Date flightDate;
	/**
	 * Attribute to hold <code>enforceHurdleRateInd</code> property.
	 */
	private boolean enforceHurdleRateInd;

	/**
	 * Attribute to hold <code>flightNumber</code> property.
	 */
	private BaseFlightDto flightNumber;

	/**
	 * Attribute to hold <code>identifier</code> property.
	 */
	private UserAuditDto identifier;

	/**
	 * Attribute to hold <code>minimumShipmentSize</code> property.
	 */
	private BigDecimal minimumShipmentSize;

	/**
	 * Attribute to hold <code>minimumWeight</code> property.
	 */
	private String minimumWeight;

	/**
	 * Attribute to hold <code>name</code> property.
	 */
	private String name;

	/**
	 * Attribute to hold <code>netOnNet</code> property.
	 */
	private boolean netOnNet;

	/**
	 * Attribute to hold <code>oId</code> property.
	 */
	private Long oId;

	/**
	 * Attribute to hold <code>origin</code> property.
	 */
	private GeographicDataDto origin;

	/**
	 * Attribute to hold <code>overPivotRate</code> property.
	 */
	private BigDecimal overPivotRate;

	/**
	 * Attribute to hold <code>participantAccountNumber</code> property.
	 */
	private String participantAccountNumber;

	/**
	 * Attribute to hold <code>payCode</code> property.
	 */
	private PayCodeType payCode;

	/**
	 * Attribute to hold <code>pivotWeight</code> property.
	 */
	private BigDecimal pivotWeight;

	/**
	 * Attribute to hold <code>productCode</code> property.
	 */
	private String productCode;

	/**
	 * Attribute to hold <code>rate</code> property.
	 */
	private BigDecimal rate;

	/**
	 * Attribute to hold <code>rateAdjustment</code> property.
	 */
	private BigDecimal rateAdjustment;

	/**
	 * Attribute to hold <code>rateClass</code> property.
	 */
	private RateClassType rateClass;

	/**
	 * Attribute to hold <code>rateEntryDtos</code> property.
	 */
	private List<RateEntryDto> rateEntryDtos;

	/**
	 * Attribute to hold <code>rateSource</code> property.
	 */
	private String rateSource;

	/**
	 * Attribute to hold <code>rateType</code> property.
	 */
	private String rateType;

	/**
	 * Attribute to hold <code>ratingWeightUnitType</code> property.
	 */
	private WeightUOMType ratingWeightUnitType;

	/**
	 * Attribute to hold <code>rejectActionIndicator</code> property.
	 */
	private boolean rejectActionIndicator;

	/**
	 * Attribute to hold <code>remarks</code> property.
	 */
	private String remarks;

	/**
	 * Attribute to hold <code>routeCompression</code> property.
	 */
	private boolean routeCompression;

	/**
	 * Attribute to hold <code>specialNotes</code> property.
	 */
	private String specialNotes;

	/**
	 * Attribute to hold <code>spotRateId</code> property.
	 */
	private String spotRateId;

	/**
	 * Attribute to hold <code>sraDefinition</code> property.
	 */
	private ContractDefinitionType sraDefinition;

	/**
	 * Attribute to hold <code>status</code> property.
	 */
	private ContractStatusType status;

	/**
	 * Attribute to hold <code>transfer</code> property.
	 */
	private String transfer;

	/**
	 * Attribute to hold <code>uldChargeCode</code> property.
	 */
	private ULDChargeType uldChargeCode;

	/**
	 * Attribute to hold <code>uldType</code> property.
	 */
	private String uldType;

	/**
	 * Gets the <code>acceptActionIndicator</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>acceptActionIndicator</code> property.
	 */
	public boolean getAcceptActionIndicator() {
		return this.acceptActionIndicator;
	}

	/**
	 * Gets the <code>allInPricingIndicator</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @return the current value of the <code>allInPricingIndicator</code> property.
	 */
	public boolean getAllInPricingIndicator() {
		return this.allInPricingIndicator;
	}

	/**
	 * Gets the <code>AppliedToAWB</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>AppliedToAWB</code> property.
	 */
	public String getAppliedToAWB() {
		return this.appliedToAWB;
	}

	/**
	 * Gets the <code>associatedAWB</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>associatedAWB</code> property.
	 */
	public String getAssociatedAWB() {
		return this.associatedAWB;
	}

	/**
	 * Gets the <code>AuthorizedAgent</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>AuthorizedAgent</code> property.
	 */
	public UserAuditDto getAuthorizedAgent() {
		return this.authorizedAgent;
	}

	/**
	 * Gets the <code>AuthuorizationCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>AuthuorizationCode</code> property.
	 */
	public String getAuthuorizationCode() {
		return this.authuorizationCode;
	}

	/**
	 * Gets the <code>ClassRatingId</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>ClassRatingId</code> property.
	 */
	public String getClassRatingId() {
		return this.classRatingId;
	}

	/**
	 * Gets the <code>CommodityNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>CommodityNumber</code> property.
	 */
	public String getCommodityNumber() {
		return this.commodityNumber;
	}

	/**
	 * Gets the <code>ContactDto</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>ContactDto</code> property.
	 */
	public ContactDto getContactDto() {
		return this.contactDto;
	}

	/**
	 * Gets the <code>CurrencyCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>CurrencyCode</code> property.
	 */
	public String getCurrencyCode() {
		return this.currencyCode;
	}

	/**
	 * Gets the <code>DateRangeDto</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>DateRangeDto</code> property.
	 */
	public DateRangeDto getDateRangeDto() {
		return this.dateRangeDto;
	}

	/**
	 * Gets the <code>Destination</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>Destination</code> property.
	 */
	public GeographicDataDto getDestination() {
		return this.destination;
	}

	/**
	 * Gets the <code>destinationWithCarrier</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>destinationWithCarrier</code>
	 *         property.
	 */
	public String getDestinationWithCarrier() {
		return this.destinationWithCarrier;
	}

	/**
	 * Gets the <code>FlightDate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>FlightDate</code> property.
	 */
	public Date getFlightDate() {
		return ContractUtility.getClonedDate(this.flightDate);
	}

	/**
	 * Gets the <code>FlightNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>FlightNumber</code> property.
	 */
	public BaseFlightDto getFlightNumber() {
		return this.flightNumber;
	}

	/**
	 * Gets the <code>Identifier</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>Identifier</code> property.
	 */
	public UserAuditDto getIdentifier() {
		return this.identifier;
	}

	/**
	 * Gets the <code>MinimumShipmentSize</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>MinimumShipmentSize</code> property.
	 */
	public BigDecimal getMinimumShipmentSize() {
		return this.minimumShipmentSize;
	}

	/**
	 * Gets the <code>MinimumWeight</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>MinimumWeight</code> property.
	 */
	public String getMinimumWeight() {
		return this.minimumWeight;
	}

	/**
	 * Gets the <code>Name</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>Name</code> property.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Gets the <code>NetOnNet</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>NetOnNet</code> property.
	 */
	public boolean getNetOnNet() {
		return this.netOnNet;
	}

	/**
	 * Gets the <code>OId</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>OId</code> property.
	 */
	@Override
	public Long getOId() {
		return this.oId;
	}

	/**
	 * Gets the <code>Origin</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>Origin</code> property.
	 */
	public GeographicDataDto getOrigin() {
		return this.origin;
	}

	/**
	 * Gets the <code>OverPivotRate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>OverPivotRate</code> property.
	 */
	public BigDecimal getOverPivotRate() {
		return this.overPivotRate;
	}

	/**
	 * Gets the <code>ParticipantAccountNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>ParticipantAccountNumber</code>
	 *         property.
	 */
	public String getParticipantAccountNumber() {
		return this.participantAccountNumber;
	}

	/**
	 * Gets the <code>PayCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>PayCode</code> property.
	 */
	public PayCodeType getPayCode() {
		return this.payCode;
	}

	/**
	 * Gets the <code>PivotWeight</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>PivotWeight</code> property.
	 */
	public BigDecimal getPivotWeight() {
		return this.pivotWeight;
	}

	/**
	 * Gets the <code>ProductCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>ProductCode</code> property.
	 */
	public String getProductCode() {
		return this.productCode;
	}

	/**
	 * Gets the <code>Rate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>Rate</code> property.
	 */
	public BigDecimal getRate() {
		return this.rate;
	}

	/**
	 * Gets the <code>RateAdjustment</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>RateAdjustment</code> property.
	 */
	public BigDecimal getRateAdjustment() {
		return this.rateAdjustment;
	}

	/**
	 * Gets the <code>RateClass</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>RateClass</code> property.
	 */
	public RateClassType getRateClass() {
		return this.rateClass;
	}

	/**
	 * Gets the <code>rateEntryDtos</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>rateEntryDtos</code> property.
	 */
	public List<RateEntryDto> getRateEntryDtos() {
		return this.rateEntryDtos;
	}

	/**
	 * Gets the <code>RateSource</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>RateSource</code> property.
	 */
	public String getRateSource() {
		return this.rateSource;
	}

	/**
	 * Gets the <code>RateType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>RateType</code> property.
	 */
	public String getRateType() {
		return this.rateType;
	}

	/**
	 * Gets the <code>RatingWeightUnitType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>RatingWeightUnitType</code> property.
	 */
	public WeightUOMType getRatingWeightUnitType() {
		return this.ratingWeightUnitType;
	}

	/**
	 * Gets the <code>rejectActionIndicator</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>rejectActionIndicator</code> property.
	 */
	public boolean getRejectActionIndicator() {
		return this.rejectActionIndicator;
	}

	/**
	 * Gets the <code>Remarks</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>Remarks</code> property.
	 */
	public String getRemarks() {
		return this.remarks;
	}

	/**
	 * Gets the <code>routeCompression</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>routeCompression</code> property.
	 */
	public boolean getRouteCompression() {
		return this.routeCompression;
	}

	/**
	 * Gets the <code>SpecialNotes</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>SpecialNotes</code> property.
	 */
	public String getSpecialNotes() {
		return this.specialNotes;
	}

	/**
	 * Gets the <code>SpotRateId</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>SpotRateId</code> property.
	 */
	public String getSpotRateId() {
		return this.spotRateId;
	}

	/**
	 * Gets the <code>SraDefinition</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>SraDefinition</code> property.
	 */
	public ContractDefinitionType getSraDefinition() {
		return this.sraDefinition;
	}

	/**
	 * Gets the <code>Status</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>Status</code> property.
	 */
	public ContractStatusType getStatus() {
		return this.status;
	}

	/**
	 * Gets the <code>Transfer</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>Transfer</code> property.
	 */
	public String getTransfer() {
		return this.transfer;
	}

	/**
	 * Gets the <code>UldChargeCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>UldChargeCode</code> property.
	 */
	public ULDChargeType getUldChargeCode() {
		return this.uldChargeCode;
	}

	/**
	 * Gets the <code>UldType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>UldType</code> property.
	 */
	public String getUldType() {
		return this.uldType;
	}

	/**
	 * Sets the <code>acceptActionIndicator</code> property.
	 * <p>
	 * 
	 * @param pAcceptActionIndicator the current value of the
	 *                               <code>acceptActionIndicator</code> property.
	 */
	public void setAcceptActionIndicator(final boolean pAcceptActionIndicator) {
		this.acceptActionIndicator = pAcceptActionIndicator;
	}

	/**
	 * Sets the <code>allInPricingIndicator</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param pAllInPricingIndicator the current value of the
	 *                               <code>allInPricingIndicator</code> property.
	 */

	public void setAllInPricingIndicator(final boolean pAllInPricingIndicator) {
		this.allInPricingIndicator = pAllInPricingIndicator;
	}

	/**
	 * Sets the <code>AppliedToAWB</code> property.
	 * <p>
	 * 
	 * @param pAppliedToAWB the current value of the <code>AppliedToAWB</code>
	 *                      property.
	 */
	public void setAppliedToAWB(final String pAppliedToAWB) {
		this.appliedToAWB = pAppliedToAWB;
	}

	/**
	 * Sets the <code>AssociatedAWB</code> property.
	 * <p>
	 * 
	 * @param pAssociatedAWB the current value of the <code>AssociatedAWB</code>
	 *                       property.
	 */
	public void setAssociatedAWB(final String pAssociatedAWB) {
		this.associatedAWB = pAssociatedAWB;
	}

	/**
	 * Sets the <code>AuthorizedAgent</code> property.
	 * <p>
	 * 
	 * @param pAuthorizedAgent the current value of the <code>AuthorizedAgent</code>
	 *                         property.
	 */
	public void setAuthorizedAgent(final UserAuditDto pAuthorizedAgent) {
		this.authorizedAgent = pAuthorizedAgent;
	}

	/**
	 * Sets the <code>AuthuorizationCode</code> property.
	 * <p>
	 * 
	 * @param pAuthuorizationCode the current value of the
	 *                            <code>AuthuorizationCode</code> property.
	 */
	public void setAuthuorizationCode(final String pAuthuorizationCode) {
		this.authuorizationCode = pAuthuorizationCode;
	}

	/**
	 * Sets the <code>ClassRatingId</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 3-6 Alphanumeric Characters
	 * <p>
	 * <b>Example: </b><br>
	 * HU#@
	 * <p>
	 * 
	 * @param pClassRatingId the current value of the <code>ClassRatingId</code>
	 *                       property.
	 */
	public void setClassRatingId(final String pClassRatingId) {
		this.classRatingId = pClassRatingId;
	}

	/**
	 * Sets the <code>CommodityNumber</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 6 AlphaNumeric Characters
	 * <p>
	 * <b>Example: </b><br>
	 * Q5674W
	 * <p>
	 * 
	 * @param pCommodityNumber the current value of the <code>CommodityNumber</code>
	 *                         property.
	 */
	public void setCommodityNumber(final String pCommodityNumber) {
		this.commodityNumber = pCommodityNumber;
	}

	/**
	 * Sets the <code>contactDto</code> property.
	 * <p>
	 * 
	 * @param pContactDto the current value of the <code>contactDto</code> property.
	 */
	public void setContactDto(final ContactDto pContactDto) {
		this.contactDto = pContactDto;
	}

	/**
	 * Sets the <code>CurrencyCode</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 Alphabet
	 * <p>
	 * <b>Example: </b><br>
	 * USD
	 * <p>
	 * 
	 * @param pCurrencyCode the current value of the <code>CurrencyCode</code>
	 *                      property.
	 */
	public void setCurrencyCode(final String pCurrencyCode) {
		this.currencyCode = pCurrencyCode;
	}

	/**
	 * Sets the <code>DateRangeDto</code> property.
	 * <p>
	 * 
	 * @param pDateRangeDto the current value of the <code>DateRangeDto</code>
	 *                      property.<br>
	 */
	public void setDateRangeDto(final DateRangeDto pDateRangeDto) {
		this.dateRangeDto = pDateRangeDto;
	}

	/**
	 * Sets the <code>Destination</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-7 AlphaNumeric
	 * <p>
	 * <b>Example: </b><br>
	 * 23FGS
	 * <p>
	 * 
	 * @param pDestination the current value of the <code>Destination</code>
	 *                     property.
	 */
	public void setDestination(final GeographicDataDto pDestination) {
		this.destination = pDestination;
	}

	/**
	 * Sets the <code>DestinationWithCarrier</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-7 AlphaNumeric
	 * <p>
	 * <b>Example: </b><br>
	 * 23FGS
	 * <p>
	 * 
	 * @param pDestinationWithCarrier the current value of the
	 *                                <code>DestinationWithCarrier</code> property.
	 */
	public void setDestinationWithCarrier(final String pDestinationWithCarrier) {
		this.destinationWithCarrier = pDestinationWithCarrier;
	}

	/**
	 * Sets the <code>FlightDate</code> property.
	 * <p>
	 * 
	 * @param pFlightDate the current value of the <code>FlightDate</code> property.
	 */
	public void setFlightDate(final Date pFlightDate) {
		this.flightDate = ContractUtility.getClonedDate(pFlightDate);
	}

	/**
	 * Sets the <code>flightNumber</code> property.
	 * <p>
	 * 
	 * @param pFlightNumber the current value of the <code>flightNumber</code>
	 *                      property.
	 */
	public void setFlightNumber(final BaseFlightDto pFlightNumber) {
		this.flightNumber = pFlightNumber;
	}

	/**
	 * Sets the <code>identifier</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-5 Numeric
	 * <p>
	 * <b>Example: </b><br>
	 * 125
	 * <p>
	 * 
	 * @param pIdentifier the current value of the <code>identifier</code> property.
	 */
	public void setIdentifier(final UserAuditDto pIdentifier) {
		this.identifier = pIdentifier;
	}

	/**
	 * Sets the <code>MinimumShipmentSize</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-5 Numeric
	 * <p>
	 * <b>Example: </b><br>
	 * 125
	 * <p>
	 * 
	 * @param pMinimumShipmentSize the current value of the
	 *                             <code>MinimumShipmentSize</code> property.
	 */
	public void setMinimumShipmentSize(final BigDecimal pMinimumShipmentSize) {
		this.minimumShipmentSize = pMinimumShipmentSize;
	}

	/**
	 * Sets the <code>MinimumWeight</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-5.(0-1) Numeric
	 * <p>
	 * <b>Example: </b><br>
	 * 125.0
	 * <p>
	 * 
	 * @param pMinimumWeight the current value of the <code>MinimumWeight</code>
	 *                       property.
	 */
	public void setMinimumWeight(final String pMinimumWeight) {
		this.minimumWeight = pMinimumWeight;
	}

	/**
	 * Sets the <code>Name</code> property.
	 * <p>
	 * 
	 * @param pName the current value of the <code>Name</code> property.
	 */
	public void setName(final String pName) {
		this.name = pName;
	}

	/**
	 * Sets the <code>netOnNet</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param pNetOnNet the current value of the <code>netOnNet</code> property.
	 */
	public void setNetOnNet(final boolean pNetOnNet) {
		this.netOnNet = pNetOnNet;
	}

	/**
	 * Sets the <code>oId</code> property.
	 * <p>
	 * 
	 * @param pOId the new value of the <code>oId</code> property.
	 */

	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

	/**
	 * Sets the <code>Origin</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-7 AlphaNumeric
	 * <p>
	 * <b>Example: </b><br>
	 * 23FG
	 * <p>
	 * 
	 * @param pOrigin the current value of the <code>Origin</code> property.
	 */
	public void setOrigin(final GeographicDataDto pOrigin) {
		this.origin = pOrigin;
	}

	/**
	 * Sets the <code>OverPivotRate</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-7.0-4 Numeric
	 * <p>
	 * <b>Example: </b><br>
	 * 567.3
	 * <p>
	 * 
	 * @param pOverPivotRate the current value of the <code>overPivotRate</code>
	 *                       property..
	 */
	public void setOverPivotRate(final BigDecimal pOverPivotRate) {
		this.overPivotRate = pOverPivotRate;
	}

	/**
	 * Sets the <code>participantAccountNumber</code> property.
	 * <p>
	 * 
	 * @param pParticipantAccountNumber the current value of the
	 *                                  <code>participantAccountNumber</code>
	 *                                  property.
	 */
	public void setParticipantAccountNumber(final String pParticipantAccountNumber) {
		this.participantAccountNumber = pParticipantAccountNumber;
	}

	/**
	 * Sets the <code>payCode</code> property.
	 * <p>
	 * 
	 * @param pPayCode the current value of the <code>payCode</code> property.
	 */
	public void setPayCode(final PayCodeType pPayCode) {
		this.payCode = pPayCode;
	}

	/**
	 * Sets the <code>PivotWeight</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-5 Numeric
	 * <p>
	 * <b>Example: </b><br>
	 * 130
	 * <p>
	 * 
	 * @param pPivotWeight the current value of the <code>PivotWeight</code>
	 *                     property.
	 */
	public void setPivotWeight(final BigDecimal pPivotWeight) {
		this.pivotWeight = pPivotWeight;
	}

	/**
	 * Sets the <code>productCode</code> property.
	 * <p>
	 * 
	 * @param pProductCode the current value of the <code>productCode</code>
	 *                     property.
	 */
	public void setProductCode(final String pProductCode) {
		this.productCode = pProductCode;
	}

	/**
	 * Sets the <code>Rate</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-9.0.4 Numeric
	 * <p>
	 * <b>Example: </b><br>
	 * 130
	 * <p>
	 * 
	 * @param pRate the current value of the <code>Rate</code> property.
	 */
	public void setRate(final BigDecimal pRate) {
		this.rate = pRate;
	}

	/**
	 * Sets the <code>RateAdjustment</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-9.0.4 Numeric
	 * <p>
	 * <b>Example: </b><br>
	 * 130
	 * <p>
	 * 
	 * @param pRateAdjustment the current value of the <code>RateAdjustment</code>
	 *                        property.
	 */
	public void setRateAdjustment(final BigDecimal pRateAdjustment) {
		this.rateAdjustment = pRateAdjustment;
	}

	/**
	 * Sets the <code>RateClass</code> property.
	 * <p>
	 * Indicator that denotes the RateClassType.
	 * <p>
	 * <li>B-European Basic Charge
	 * <p>
	 * <b>Format: </b><br>
	 * 17 Z<br>
	 * <p>
	 * <b>Example: </b><br>
	 * R<br>
	 * <p>
	 * 
	 * @param pRateClass <code>{@link RateClassType}</code> holds the new value of
	 *                   <code>RateClass</code> type details.
	 */
	public void setRateClass(final RateClassType pRateClass) {
		this.rateClass = pRateClass;
	}

	/**
	 * Sets the <code>rateEntryDtos</code> property.
	 * <p>
	 * 
	 * @param pRateEntryDtos the current value of the <code>rateEntryDtos</code>
	 *                       property.
	 */
	public void setRateEntryDtos(final List<RateEntryDto> pRateEntryDtos) {
		this.rateEntryDtos = pRateEntryDtos;
	}

	/**
	 * Sets the <code>RateSource</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 ALPHABETS
	 * <p>
	 * <b>Example: </b><br>
	 * TYR
	 * <p>
	 * 
	 * @param pRateSource the current value of the <code>RateSource</code> property.
	 */
	public void setRateSource(final String pRateSource) {
		this.rateSource = pRateSource;
	}

	/**
	 * Sets the <code>RateType</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 Alphanumeric
	 * <p>
	 * <b>Example: </b><br>
	 * GEN
	 * <p>
	 * 
	 * @param pRateType the current value of the <code>RateType</code> property.
	 */
	public void setRateType(final String pRateType) {
		this.rateType = pRateType;
	}

	/**
	 * Sets the <code>RatingWeightUnitType</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * KG or LB List
	 * <p>
	 * <b>Example: </b><br>
	 * KG
	 * <p>
	 * 
	 * @param pRatingWeightUnitType <code>{@link WeightUOMType}</code> the current
	 *                              value of the <code>RatingWeightUnitType</code>
	 *                              property.
	 */
	public void setRatingWeightUnitType(final WeightUOMType pRatingWeightUnitType) {
		this.ratingWeightUnitType = pRatingWeightUnitType;
	}

	/**
	 * Sets the <code>rejectActionIndicator</code> property.
	 * <p>
	 * 
	 * @param pRejectActionIndicator the current value of the
	 *                               <code>rejectActionIndicator</code> property.
	 */
	public void setRejectActionIndicator(final boolean pRejectActionIndicator) {
		this.rejectActionIndicator = pRejectActionIndicator;
	}

	/**
	 * Sets the <code>Remarks</code> property.
	 * <p>
	 * 
	 * @param pRemarks the current value of the <code>Remarks</code> property.
	 */
	public void setRemarks(final String pRemarks) {
		this.remarks = pRemarks;
	}

	/**
	 * Sets the <code>RouteCompression</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param pRouteCompression the current value of the
	 *                          <code>RouteCompression</code> property.
	 */

	public void setRouteCompression(final boolean pRouteCompression) {
		this.routeCompression = pRouteCompression;
	}

	/**
	 * Sets the <code>SpecialNotes</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-240 Free-form text
	 * <p>
	 * <b>Example: </b><br>
	 * Storage charges applicable.
	 * <p>
	 * 
	 * @param pSpecialNotes the current value of the <code>SpecialNotes</code>
	 *                      property.
	 */
	public void setSpecialNotes(final String pSpecialNotes) {
		this.specialNotes = pSpecialNotes;
	}

	/**
	 * Sets the <code>spotRateId</code> property.
	 * <p>
	 * <p>
	 * 
	 * @param pSpotRateId the current value of the <code>spotRateId</code> property.
	 */
	public void setSpotRateId(final String pSpotRateId) {
		this.spotRateId = pSpotRateId;
	}

	/**
	 * Sets the <code>sraDefinition</code> property.
	 * <p>
	 * <p>
	 * 
	 * @param pSraDefinition the current value of the <code>sraDefinition</code>
	 *                       property.
	 */
	public void setSraDefinition(final ContractDefinitionType pSraDefinition) {
		this.sraDefinition = pSraDefinition;
	}

	/**
	 * Sets the <code>Status</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * 6-7 Alphabets <b>Example: </b><br>
	 * ACTIVE
	 * <p>
	 * 
	 * @param pStatus the current value of the <code>Status</code> property.
	 */
	public void setStatus(final ContractStatusType pStatus) {
		this.status = pStatus;
	}

	/**
	 * Sets the <code>transfer</code> property.
	 * <p>
	 * 
	 * @param pTransfer the current value of the <code>transfer</code> property.
	 */
	public void setTransfer(final String pTransfer) {
		this.transfer = pTransfer;
	}

	/**
	 * Sets the <code>uldChargeCode</code> property.
	 * <p>
	 * 
	 * @param pUldChargeCode the current value of the <code>uldChargeCode</code>
	 *                       property.
	 */
	public void setUldChargeCode(final ULDChargeType pUldChargeCode) {
		this.uldChargeCode = pUldChargeCode;
	}

	/**
	 * Sets the <code>uldType</code> property.
	 * <p>
	 * 
	 * @param pUldType the current value of the <code>uldType</code> property.
	 */
	public void setUldType(final String pUldType) {
		this.uldType = pUldType;
	}

	/**
	 * Creates the String representation of <code>ContractListEntryDto</code>.
	 * <p>
	 * This will return the String representation based on Contract List.
	 * <p>
	 * 
	 * @return the String representation of <code>ContractListEntryDto</code>.
	 */
	public String toString() {
		// SuppressOn:MagicNumber
		final StringBuffer csvString = new StringBuffer();
		// SuppressOff:MagicNumber

		csvString.append(this.prefixSuffixByQuotes(this.getSpotRateId()));
		csvString.append(this.prefixSuffixByQuotes(this.getOrigin().getCode()));
		csvString.append(this.prefixSuffixByQuotes(this.getDestination().getCode()));
		if (YES_LITERAL.equalsIgnoreCase(this.getAppliedToAWB())) {
			csvString.append(this.prefixSuffixByQuotes(YES_LITERAL));
		} else {
			csvString.append(this.prefixSuffixByQuotes(NO_LITERAL));
		}
		if (this.getAssociatedAWB() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getAssociatedAWB()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getFlightDate() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.dateToString(this.getFlightDate())));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getFlightNumber() != null && this.getFlightNumber().getNumber() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getFlightNumber().getNumber()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getDateRangeDto() != null && this.getDateRangeDto().getEffectiveDate() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.dateToString(this.getDateRangeDto().getEffectiveDate())));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getDateRangeDto() != null && this.getDateRangeDto().getExpirationDate() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.dateToString(this.getDateRangeDto().getExpirationDate())));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getSraDefinition() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getSraDefinition().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getRateSource() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getRateSource()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getRateType() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getRateType()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		if (this.getRateClass() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getRateClass().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getCommodityNumber() != null) {

			csvString.append(this.prefixSuffixByQuotes(this.getCommodityNumber()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getClassRatingId() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getClassRatingId()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getUldType() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getUldType()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getUldChargeCode() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getUldChargeCode().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getMinimumWeight() != null) {

			csvString.append(this.prefixSuffixByQuotes(this.getMinimumWeight()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getRateAdjustment() != null) {

			csvString.append(this.prefixSuffixByQuotes(String.valueOf(this.getRateAdjustment())));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getRate() != null) {
			csvString.append(this.prefixSuffixByQuotes(String.valueOf(this.getRate())));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getPivotWeight() != null) {
			csvString.append(this.prefixSuffixByQuotes(String.valueOf(this.getPivotWeight())));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getOverPivotRate() != null) {
			csvString.append(this.prefixSuffixByQuotes(String.valueOf(this.getOverPivotRate())));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		if (this.getMinimumShipmentSize() != null) {

			csvString.append(this.prefixSuffixByQuotes(String.valueOf(this.getMinimumShipmentSize())));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		if (this.getRatingWeightUnitType() != null) {

			csvString.append(this.prefixSuffixByQuotes(this.getRatingWeightUnitType().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getRemarks() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getRemarks()));
		}

		else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getAuthorizedAgent() != null && this.getAuthorizedAgent().getCreatedOn() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.dateToString(this.getAuthorizedAgent().getCreatedOn())));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getTransfer() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getTransfer()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getStatus() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getStatus().getType()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		if (this.getPayCode() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getPayCode().toString()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		if (this.getNetOnNet()) {
			csvString.append(this.prefixSuffixByQuotes(YES_LITERAL));
		} else {
			csvString.append(this.prefixSuffixByQuotes(NO_LITERAL));
		}
		if (this.getRouteCompression()) {
			csvString.append(this.prefixSuffixByQuotes(YES_LITERAL));
		} else {
			csvString.append(this.prefixSuffixByQuotes(NO_LITERAL));
		}
		if (this.getAuthorizedAgent() != null && this.getAuthorizedAgent().getCreatedOn() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.dateToString(this.getAuthorizedAgent().getCreatedOn())));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getAuthuorizationCode() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getAuthuorizationCode()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getParticipantAccountNumber() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getParticipantAccountNumber()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getCurrencyCode() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getCurrencyCode()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}
		if (this.getProductCode() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getProductCode()));
		} else {
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		}

		return csvString.toString();
	}

	/**
	 * Converts given date object into equivalent String object.
	 * 
	 * @param pDate the date object.
	 * 
	 * @return String value of the <code>pDate</code>.
	 * 
	 */
	private String dateToString(final Date pDate) {
		final Format aSimpleDateFormat = new SimpleDateFormat("ddMMMyyyy", Locale.UK);
		return ContractUtility.convertToUpperCase(aSimpleDateFormat.format(pDate));
	}

	/**
	 * prefixes and suffixes a given string with open quotes.
	 * 
	 * @param pString the new value of the <code>value</code>.
	 * 
	 * @return aModifiedString the new value of the <code>aModifiedString</code>.
	 */
	private String prefixSuffixByQuotes(final String pString) {
		final String aQUOTATION = "\"";
		final String aCOMMA = ",";
		final StringBuffer aModifiedString = new StringBuffer();

		aModifiedString.append(aQUOTATION);
		aModifiedString.append(pString);
		aModifiedString.append(aQUOTATION);
		aModifiedString.append(aCOMMA);

		return aModifiedString.toString();
	}

	public boolean getEnforceHurdleRateInd() {
		return this.enforceHurdleRateInd;
	}

	public void setEnforceHurdleRateInd(final boolean pEnforceHurdleRateInd) {
		this.enforceHurdleRateInd = pEnforceHurdleRateInd;
	}

	public void resetAcceptActionIndicator() {
		this.acceptActionIndicator = false;
	}

	public void resetRejectActionIndicator() {
		this.rejectActionIndicator = false;
	}
}
