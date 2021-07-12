package com.unisys.trans.logistics.lms.rating.dto.price;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.rating.dto.constants.ContractDefinitionType;
import com.unisys.trans.logistics.lms.rating.dto.constants.PricingBookingSourceType;

public class LoyaltyRulesDto extends PersistenceObjectDto {
	
	@Override
	public String toString() {
		String loyaltyRulesDto = new String();
		loyaltyRulesDto = "loyaltyRulesDto ::: " + "bookingSource : " + bookingSource + "awbOrigin : " + awbOrigin
				+ "awbDestination :" + awbDestination + "chargeableWeight :" + chargeableWeight + "grossWeight :"
				+ grossWeight + "pricingDate :" + pricingDate + "awbCreationDate :" + awbCreationDate + "ContractType :"
				+ ContractType + "productCode :" + productCode + "commodityCodes :" + commodityCodes + " grossRevenue :"
				+ grossRevenue + "otherServiceCharges :" + otherServiceCharges + "loyaltyId :" + loyaltyId
				+ "finalDispositionStatus :" + finalDispositionStatus + "specialHandlingCodes :" + specialHandlingCodes
				+ "airlineCodeNbr :" + airlineCodeNbr + "shipmentReference :" + shipmentReference + "base :" + base
				+ "bonus :" + bonus + "totalLoyaltyPoints :" + totalLoyaltyPoints + "eAwbIndicator :" + eAwbIndicator
				+ "splitShipmentIndicator :" + splitShipmentIndicator + "ruleIds :" + ruleIds + "routingAndPriceInd"
				+ routingAndPriceInd;
		return loyaltyRulesDto;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -5439091552509998321L;
	 /**
     * Attribute to hold <code>bookingSource</code> property.
     */
	private PricingBookingSourceType bookingSource;
	 /**
     * Attribute to hold <code>shipmentOrigin</code> property.
     */
	private String awbOrigin;
	 /**
     * Attribute to hold <code>shipmentDestination</code> property.
     */
	private String awbDestination;
	 /**
     * Attribute to hold <code>chargeableWeight</code> property.
     */
	private BigDecimal chargeableWeight;
	 /**
     * Attribute to hold <code>grossWeight</code> property.
     */
	private BigDecimal grossWeight; 
	 /**
     * Attribute to hold <code>pricingDate</code> property.
     */
	private int pricingDate;
	 /**
     * Attribute to hold <code>awbCreationDate</code> property.
     */
	private int awbCreationDate;
	 /**
     * Attribute to hold <code>routingDtos</code> property.
     */
	private List<RoutingDto> routingDtos;
	 /**
     * Attribute to hold <code>ContractType</code> property.
     */
	private ContractDefinitionType ContractType;
	 /**
     * Attribute to hold <code>productCode</code> property.
     */
	private String productCode;
	 /**
     * Attribute to hold <code>commodityCodes</code> property.
     */
	private List<String> commodityCodes;
	 /**
     * Attribute to hold <code>grossRevenue</code> property.
     */
	private BigDecimal grossRevenue;
	 /**
     * Attribute to hold <code>otherServiceCharges</code> property.
     */
	private BigDecimal otherServiceCharges;
    /**
     * Attribute to hold <code>loyaltyId</code> property.
     */
	private String loyaltyId;
	 /**
     * Attribute to hold <code>finalDispositionStatus</code> property.
     */
	private String finalDispositionStatus;  
	 /**
     * Attribute to hold <code>specialHandlingCodes</code> property.
     */
	private List<String> specialHandlingCodes;
	/**
     * Attribute to hold <code>airlineCodeNbr</code> property.
     */
	private String airlineCodeNbr;
	/**
     * Attribute to hold <code>shipmentReference</code> property.
     */ 
	private String shipmentReference;
	/**
     * Attribute to hold <code>otherChargeDtos</code> property.
     */ 
	private List<PricingOtherChargeDto> otherChargeDtos;
	
	/**
     * Attribute to hold <code>pricingFlightDetailDtos</code> property.
     */ 
	private List<PricingFlightDetailDto> pricingFlightDetailDtos;
	/**
     * Attribute to hold <code>participantDtos</code> property.
     */ 
	private List<ParticipantDto> participantDtos;
	
	/**
     * Attribute to hold <code>base</code> property.
     */
	private BigDecimal base;
	/**
     * Attribute to hold <code>bonus</code> property.
     */
	private BigDecimal bonus;
	/**
     * Attribute to hold <code>totalLoyaltyPoints</code> property.
     */
	private BigDecimal totalLoyaltyPoints;
	
	/**
     * Attribute to hold <code>eAwbIndicator</code> property.
     */
	private boolean eAwbIndicator;
	
	/**
     * Attribute to hold <code>eAwbIndicator</code> property.
     */
	private boolean splitShipmentIndicator;
	/**
     * Attribute to hold <code>ruleIds</code> property.
     */
	private List<String> ruleIds;
	
	private boolean routingAndPriceInd;
	
	/**
     * Gets the <code>base</code> property.
     * <p>
     * 
     * @return the current value of the <code>base</code> property.<br>
     */
	public List<String> getRuleIds() {
		if(this.ruleIds == null){
			this.ruleIds = new ArrayList<String>();
		}
		return this.ruleIds;
	}
	/**
     * Sets the <code>ruleIds</code> property.
     * <p>
     * 
     * @param pRuleIds
     *            the current value of the <code>ruleIds</code> property.
     */
	public void setRuleIds(final List<String> pRuleIds) {
		this.ruleIds = pRuleIds;
	}
	@Override	
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
     * Gets the <code>base</code> property.
     * <p>
     * 
     * @return the current value of the <code>base</code> property.<br>
     */
	public BigDecimal getBase() {
		return this.base;
	}
	/**
     * Gets the <code>bonus</code> property.
     * <p>
     * 
     * @return the current value of the <code>bonus</code> property.<br>
     */
	public BigDecimal getBonus() {
		return this.bonus;
	}
	/**
     * Gets the <code>totalLoyaltyPoints</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalLoyaltyPoints</code> property.<br>
     */
	public BigDecimal getTotalLoyaltyPoints() {
		return this.totalLoyaltyPoints;
	}
	/**
     * Gets the <code>bookingSource</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookingSource</code> property.<br>
     */
	public PricingBookingSourceType getBookingSource() {
		return this.bookingSource;
	}
	/**
     * Gets the <code>awbOrigin</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbOrigin</code> property.<br>
     */
	public String getAwbOrigin() {
		return this.awbOrigin;
	}
	/**
     * Gets the <code>awbDestination</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbDestination</code> property.<br>
     */
	public String getAwbDestination() {
		return this.awbDestination;
	}
	/**
     * Gets the <code>chargeableWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>chargeableWeight</code> property.<br>
     */
	public BigDecimal getChargeableWeight() {
		return this.chargeableWeight;
	}
	/**
     * Gets the <code>grossWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>grossWeight</code> property.<br>
     */
	public BigDecimal getGrossWeight() {
		return this.grossWeight;
	}


	/**
     * Gets the <code>pricingDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>pricingDate</code> property.<br>
     */
	public int getPricingDate() {
		return this.pricingDate;
	}
	/**
     * Gets the <code>awbCreationDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbCreationDate</code> property.<br>
     */
	public int getAwbCreationDate() {
		return this.awbCreationDate;
	}
	/**
     * Gets the <code>routingDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>routingDtos</code> property.<br>
     */
	public List<RoutingDto> getRoutingDtos() {
		return this.routingDtos;
	}
	/**
     * Gets the <code>ContractType</code> property.
     * <p>
     * 
     * @return the current value of the <code>ContractType</code> property.<br>
     */
	public ContractDefinitionType getContractType() {
		return this.ContractType;
	}
	/**
     * Gets the <code>productCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>productCode</code> property.<br>
     */
	public String getProductCode() {
		return this.productCode;
	}
	/**
     * Gets the <code>commodityCodes</code> property.
     * <p>
     * 
     * @return the current value of the <code>commodityCodes</code> property.<br>
     */
	public List<String> getCommodityCodes() {
		return this.commodityCodes;
	}
	/**
     * Gets the <code>grossRevenue</code> property.
     * <p>
     * 
     * @return the current value of the <code>grossRevenue</code> property.<br>
     */
	public BigDecimal getGrossRevenue() {
		return this.grossRevenue;
	}
	/**
     * Gets the <code>otherServiceCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>otherServiceCharges</code> property.<br>
     */
	public BigDecimal getOtherServiceCharges() {
		return this.otherServiceCharges;
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
     * Gets the <code>finalDispositionStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>finalDispositionStatus</code> property.<br>
     */
	public String getFinalDispositionStatus() {
		return this.finalDispositionStatus;
	}
	/**
     * Gets the <code>specialHandlingCodes</code> property.
     * <p>
     * 
     * @return the current value of the <code>specialHandlingCodes</code> property.<br>
     */
	public List<String> getSpecialHandlingCodes() {
		return this.specialHandlingCodes;
	}
	/**
     * Gets the <code>airlineCodeNbr</code> property.
     * <p>
     * 
     * @return the current value of the <code>airlineCodeNbr</code> property.<br>
     */
	public String getAirlineCodeNbr() {
		return this.airlineCodeNbr;
	}
	/**
     * Gets the <code>shipmentReference</code> property.
     * <p>
     * 
     * @return the current value of the <code>shipmentReference</code> property.<br>
     */
	public String getShipmentReference() {
		return this.shipmentReference;
	}
	/**
     * Gets the <code>otherChargeDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>otherChargeDto</code> property.<br>
     */
	public List<PricingOtherChargeDto> getOtherChargeDtos() {
		return this.otherChargeDtos;
	}
	/**
     * Gets the <code>participantDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantDtos</code> property.<br>
     */
	public List<ParticipantDto> getParticipantDtos() {
		return this.participantDtos;
	}
	 /**
     * Sets the <code>bookingSource</code> property.
     * <p>
     * 
     * @param pBookingSource
     *            the current value of the <code>bookingSource</code> property.
     */
	public void setBookingSource(final PricingBookingSourceType pBookingSource) {
		this.bookingSource = pBookingSource;
	}
	 /**
     * Sets the <code>awbOrigin</code> property.
     * <p>
     * 
     * @param pAwbOrigin
     *            the current value of the <code>awbOrigin</code> property.
     */
	public void setAwbOrigin(final String pAwbOrigin) {
		this.awbOrigin = pAwbOrigin;
	}
	 /**
     * Sets the <code>awbDestination</code> property.
     * <p>
     * 
     * @param pAwbDestination
     *            the current value of the <code>awbDestination</code> property.
     */
	public void setAwbDestination(final String pAwbDestination) {
		this.awbDestination = pAwbDestination;
	}
	 /**
     * Sets the <code>chargeableWeight</code> property.
     * <p>
     * 
     * @param pChargeableWeight
     *            the current value of the <code>chargeableWeight</code> property.
     */
	public void setChargeableWeight(final BigDecimal pChargeableWeight) {
		this.chargeableWeight = pChargeableWeight;
	}
	 /**
     * Sets the <code>grossWeight</code> property.
     * <p>
     * 
     * @param pGrossWeight
     *            the current value of the <code>grossWeight</code> property.
     */
	public void setGrossWeight(final BigDecimal pGrossWeight) {
		this.grossWeight = pGrossWeight;
	}


	 /**
     * Sets the <code>pricingDate</code> property.
     * <p>
     * 
     * @param pPricingDate
     *            the current value of the <code>pricingDate</code> property.
     */
	public void setPricingDate(final int pPricingDate) {
		this.pricingDate = pPricingDate;
	}
	 /**
     * Sets the <code>awbCreationDate</code> property.
     * <p>
     * 
     * @param pAwbCreationDate
     *            the current value of the <code>awbCreationDate</code> property.
     */
	public void setAwbCreationDate(final int pAwbCreationDate) {
		this.awbCreationDate = pAwbCreationDate;
	}
	 /**
     * Sets the <code>routingDtos</code> property.
     * <p>
     * 
     * @param pRoutingDtos
     *            the current value of the <code>routingDtos</code> property.
     */
	public void setRoutingDtos(final List<RoutingDto> pRoutingDtos) {
		this.routingDtos = pRoutingDtos;
	}
	 /**
     * Sets the <code>ContractType</code> property.
     * <p>
     * 
     * @param pContractType
     *            the current value of the <code>ContractType</code> property.
     */
	public void setContractType(final ContractDefinitionType pContractType) {
		ContractType = pContractType;
	}
	 /**
     * Sets the <code>productCode</code> property.
     * <p>
     * 
     * @param pProductCode
     *            the current value of the <code>productCode</code> property.
     */
	public void setProductCode(final String pProductCode) {
		this.productCode = pProductCode;
	}
	 /**
     * Sets the <code>commodityCodes</code> property.
     * <p>
     * 
     * @param pCommodityCode
     *            the current value of the <code>commodityCodes</code> property.
     */
	public void setCommodityCodes(final List<String> pCommodityCodes) {
		this.commodityCodes = pCommodityCodes;
	}
	 /**
     * Sets the <code>grossRevenue</code> property.
     * <p>
     * 
     * @param pGrossRevenue
     *            the current value of the <code>grossRevenue</code> property.
     */
	public void setGrossRevenue(final BigDecimal pGrossRevenue) {
		this.grossRevenue = pGrossRevenue;
	}
	 /**
     * Sets the <code>otherServiceCharges</code> property.
     * <p>
     * 
     * @param pOtherServiceCharges
     *            the current value of the <code>otherServiceCharges</code> property.
     */
	public void setOtherServiceCharges(final BigDecimal pOtherServiceCharges) {
		this.otherServiceCharges = pOtherServiceCharges;
	}
	 /**
     * Sets the <code>loyaltyId</code> property.
     * <p>
     * 
     * @param pLoyaltyId
     *            the current value of the <code>loyaltyId</code> property.
     */
	public void setLoyaltyId(final String pLoyaltyId) {
		this.loyaltyId = pLoyaltyId;
	}
	 /**
     * Sets the <code>finalDispositionStatus</code> property.
     * <p>
     * 
     * @param pFinalDispositionStatus
     *            the current value of the <code>finalDispositionStatus</code> property.
     */
	public void setFinalDispositionStatus(final String pFinalDispositionStatus) {
		this.finalDispositionStatus = pFinalDispositionStatus;
	}
	 /**
     * Sets the <code>specialHandlingCodes</code> property.
     * <p>
     * 
     * @param pSpecialHandlingCodes
     *            the current value of the <code>specialHandlingCodes</code> property.
     */
	public void setSpecialHandlingCodes(final List<String> pSpecialHandlingCodes) {
		this.specialHandlingCodes = pSpecialHandlingCodes;
	}

	 /**
     * Sets the <code>airlineCodeNbr</code> property.
     * <p>
     * 
     * @param pAirlineCodeNbr
     *            the current value of the <code>airlineCodeNbr</code> property.
     */
	public void setAirlineCodeNbr(final String pAirlineCodeNbr) {
		this.airlineCodeNbr = pAirlineCodeNbr;
	}
	 /**
     * Sets the <code>shipmentReference</code> property.
     * <p>
     * 
     * @param pShipmentReference
     *            the current value of the <code>shipmentReference</code> property.
     */
	public void setShipmentReference(final String pShipmentReference) {
		this.shipmentReference = pShipmentReference;
	}
	/**
     * Sets the <code>otherChargeDto</code> property.
     * <p>
     * 
     * @param pOtherChargeDto
     *            the current value of the <code>otherChargeDto</code> property.
     */
	public void setOtherChargeDtos(final List<PricingOtherChargeDto> pOtherChargeDtos) {
		this.otherChargeDtos = pOtherChargeDtos;
	}
	
	/**
     * Gets the <code>shipmentReference</code> property.
     * <p>
     * 
     * @return the current value of the <code>shipmentReference</code> property.<br>
     */
	public List<PricingFlightDetailDto> getPricingFlightDetailDtos() {
		return pricingFlightDetailDtos;
	}
	/**
     * Sets the <code>otherChargeDto</code> property.
     * <p>
     * 
     * @param pOtherChargeDto
     *            the current value of the <code>otherChargeDto</code> property.
     */
	public void setPricingFlightDetailDtos(List<PricingFlightDetailDto> pricingFlightDetailDtos) {
		this.pricingFlightDetailDtos = pricingFlightDetailDtos;
	}
	/**
     * Sets the <code>base</code> property.
     * <p>
     * 
     * @param pBase
     *            the current value of the <code>base</code> property.
     */
	public void setBase(final BigDecimal pBase) {
		this.base = pBase;
	}
	/**
     * Sets the <code>bonus</code> property.
     * <p>
     * 
     * @param pBonus
     *            the current value of the <code>bonus</code> property.
     */
	public void setBonus(final BigDecimal pBonus) {
		this.bonus = pBonus;
	}
	/**
     * Sets the <code>totalLoyaltyPoints</code> property.
     * <p>
     * 
     * @param pTotalLoyaltyPoints
     *            the current value of the <code>totalLoyaltyPoints</code> property.
     */
	public void setTotalLoyaltyPoints(final BigDecimal pTotalLoyaltyPoints) {
		this.totalLoyaltyPoints = pTotalLoyaltyPoints;
	}
	/**
     * Sets the <code>participantDtos</code> property.
     * <p>
     * 
     * @param pParticipantDtos
     *            the current value of the <code>participantDtos</code> property.
     */
	public void setParticipantDtos(final List<ParticipantDto> pParticipantDtos) {
		this.participantDtos = pParticipantDtos;
	}
	/**
	 * @return the eAwbIndicator
	 */
	public boolean iseAwbIndicator() {
		return eAwbIndicator;
	}
	/**
	 * @param eAwbIndicator the eAwbIndicator to set
	 */
	public void seteAwbIndicator(boolean eAwbIndicator) {
		this.eAwbIndicator = eAwbIndicator;
	}
	/**
	 * @return the splitShipmentIndicator
	 */
	public boolean isSplitShipmentIndicator() {
		return splitShipmentIndicator;
	}
	/**
	 * @param splitShipmentIndicator the splitShipmentIndicator to set
	 */
	public void setSplitShipmentIndicator(boolean splitShipmentIndicator) {
		this.splitShipmentIndicator = splitShipmentIndicator;
	}
	public boolean isRoutingAndPriceInd() {
		return routingAndPriceInd;
	}
	public void setRoutingAndPriceInd(boolean pRoutingAndPriceInd) {
		this.routingAndPriceInd = pRoutingAndPriceInd;
	}
}