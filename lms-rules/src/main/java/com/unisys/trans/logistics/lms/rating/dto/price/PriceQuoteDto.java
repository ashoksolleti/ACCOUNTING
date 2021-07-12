/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.price;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.VolumeUOMType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantRoleType;
import com.unisys.trans.logistics.lms.utils.dto.CarrierDto;

/**
 * <code>PriceQuoteDto</code> contain details of Rate and Quote.
 * <p>
 * This contains all information about Rate and Quote.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>allContractsInd
 * <li>chargeableWeight
 * <li>classRatingId
 * <li>commodityCode
 * <li>currencyCode
 * <li>destinationCode
 * <li>destinationName
 * <li>destinationPostalCode
 * <li>expirationDate
 * <li>oId
 * <li>originCode
 * <li>originName
 * <li>originPostalCode
 * <li>participantAccountNumber
 * <li>participantName
 * <li>participantStation
 * <li>participantType
 * <li>productCode
 * <li>rateClass
 * <li>ratePieces
 * <li>rateTotalCharges
 * <li>rateType
 * <li>shipmentDate
 * <li>splCodes
 * <li>uldType
 * <li>volume
 * <li>volumeUnit
 * <li>weight
 * <li>weightUnit
 * </ul>
 */
public class PriceQuoteDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6732389485711103676L;

    /**
     * Attribute to hold <code>allContractsInd</code> property.
     */
    private boolean allContractsInd;

    /**
     * Attribute to hold <code>chargeableWeight</code> property.
     */
    private BigDecimal chargeableWeight;

    /**
     * Attribute to hold <code>classRatingId</code> property.
     */
    private String classRatingId;

    /**
     * Attribute to hold <code>commodityCode</code> property.
     */
    private String commodityCode;

    // added for SK164C
    /**
     * Attribute to hold <code>contractToApply</code> property.
     */
    private String contractToApply;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     */
    private String currencyCode;

    /**
     * Attribute to hold <code>destinationCode</code> property.
     */
    private String destinationCode;

    /**
     * Attribute to hold <code>destinationName</code> property.
     */
    private String destinationName;

    /**
     * Attribute to hold <code>destinationPostalCode</code> property.
     */
    private String destinationPostalCode;

    /**
     * Attribute to hold <code>expirationDate</code> property.
     */
    private DateRangeDto expirationDate;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>originCode</code> property.
     */
    private String originCode;

    /**
     * Attribute to hold <code>originName</code> property.
     */
    private String originName;

    /**
     * Attribute to hold <code>originPostalCode</code> property.
     */
    private String originPostalCode;

    /**
     * Attribute to hold <code>participantAccountNumber</code> property.
     */
    private String participantAccountNumber;

    /**
     * Attribute to hold <code>participantName</code> property.
     */
    private String participantName;

    /**
     * Attribute to hold <code>participantStation</code> property.
     */
    private String participantStation;

    /**
     * Attribute to hold <code>participantType</code> property.
     */
    private ParticipantRoleType participantType;

    /**
     * Attribute to hold <code>productCode</code> property.
     */
    private String productCode;

    /**
     * Attribute to hold <code>rateClass</code> property.
     */
    private String rateClass;

    /**
     * Attribute to hold <code>ratePieces</code> property.
     */
    private Integer ratePieces;

    /**
     * Attribute to hold <code>rateTotalCharges</code> property.
     */
    private BigDecimal rateTotalCharges;

    /**
     * Attribute to hold <code>rateType</code> property.
     */
    private String rateType;

    /**
     * Attribute to hold <code>selectedPriceEntry</code> property.
     */
    private List<SelectedPriceEntry> selectedPriceEntry;

    /**
     * Attribute to hold <code>shipmentDate</code> property.
     */
    private Date shipmentDate;

    /**
     * Attribute to hold <code>splCodes</code> property.
     */
    private List<String> splCodes;

    /**
     * Attribute to hold <code>uldType</code> property.
     */
    private String uldType;

    /**
     * Attribute to hold <code>volume</code> property.
     */
    private BigDecimal volume;

    /**
     * Attribute to hold <code>volumeUnit</code> property.
     */
    private VolumeUOMType volumeUnit;

    /**
     * Attribute to hold <code>weight</code> property.
     */
    private BigDecimal weight;

    /**
     * Attribute to hold <code>weightUnit</code> property.
     */
    private WeightUOMType weightUnit;
    
    
    /**
     * Attribute to hold <code>showRates</code> property.
     */
    private boolean showRates;
    /**
     * Attribute to hold <code>contractAllowed</code> property.
     */
    private boolean contractAllowed;
    
    private String 	airlineCodeNumber;
    
    private AirWaybillDto awbDto;
    private List<String> specificAirline;
    
    private String carrier;

    public boolean isContractAllowed() {
        return contractAllowed;
    }

    public void setContractAllowed(boolean contractAllowed) {
        this.contractAllowed = contractAllowed;
    }

    /**
     * Gets the <code>allContractsInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>allContractsInd</code> property.
     */
    public boolean getAllContractsInd() {
        return this.allContractsInd;
    }

    /**
     * Gets the <code>chargeableWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>chargeableWeight</code> property.
     */
    public BigDecimal getChargeableWeight() {
        return this.chargeableWeight;
    }

    /**
     * Gets the <code>classRatingId</code> property.
     * <p>
     * 
     * @return the current value of the <code>classRatingId</code> property.
     */
    public String getClassRatingId() {
        return this.classRatingId;
    }

    /**
     * Gets the <code>commodityCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>commodityCode</code> property.
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    // added for SK164C
    /**
     * Gets the <code>contractToApply</code> property.
     * <p>
     * 
     * @return the current value of the <code>contractToApply</code> property.
     */
    public String getContractToApply() {
        return this.contractToApply;
    }

    /**
     * Gets the <code>currencyCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>currencyCode</code> property.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Gets the <code>destinationCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>destinationCode</code> property.
     */
    public String getDestinationCode() {
        return this.destinationCode;
    }

    /**
     * Gets the <code>destinationName</code> property.
     * <p>
     * 
     * @return the current value of the <code>destinationName</code> property.
     */
    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * Gets the <code>destinationPostalCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>destinationPostalCode</code> property.
     */
    public String getDestinationPostalCode() {
        return this.destinationPostalCode;
    }

    /**
     * Gets the <code>expirationDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>expirationDate</code> property.
     */
    public DateRangeDto getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */

    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>originCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>originCode</code> property.
     */
    public String getOriginCode() {
        return this.originCode;
    }

    /**
     * Gets the <code>originName</code> property.
     * <p>
     * 
     * @return the current value of the <code>originName</code> property.
     */
    public String getOriginName() {
        return this.originName;
    }

    /**
     * Gets the <code>originPostalCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>originPostalCode</code> property.
     */
    public String getOriginPostalCode() {
        return this.originPostalCode;
    }

    /**
     * Gets the <code>participantAccountNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantAccountNumber</code> property.
     */
    public String getParticipantAccountNumber() {
        return this.participantAccountNumber;
    }

    /**
     * Gets the <code>participantName</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantName</code> property.
     */
    public String getParticipantName() {
        return this.participantName;
    }

    /**
     * Gets the <code>participantStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantStation</code> property.
     */
    public String getParticipantStation() {
        return this.participantStation;
    }

    /**
     * Gets the <code>participantType</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantType</code> property.
     */
    public ParticipantRoleType getParticipantType() {
        return this.participantType;
    }

    /**
     * Gets the <code>productCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>productCode</code> property.
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * Gets the <code>rateClass</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateClass</code> property.
     */
    public String getRateClass() {
        return this.rateClass;
    }

    /**
     * Gets the <code>ratePieces</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratePieces</code> property.
     */
    public Integer getRatePieces() {
        return this.ratePieces;
    }

    /**
     * Gets the <code>rateTotalCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateTotalCharges</code> property.
     */
    public BigDecimal getRateTotalCharges() {
        return this.rateTotalCharges;
    }

    /**
     * Gets the <code>rateType</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateType</code> property.
     */
    public String getRateType() {
        return this.rateType;
    }

    /**
     * Gets the <code>selectedPriceEntry</code> property.
     * <p>
     * 
     * @return the current value of the <code>selectedPriceEntry</code> property.
     */
    public List<SelectedPriceEntry> getSelectedPriceEntry() {
        return selectedPriceEntry;
    }

    /**
     * Gets the <code>shipmentDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>shipmentDate</code> property.
     */
    public Date getShipmentDate() {
        return ContractUtility.getClonedDate(this.shipmentDate);
    }

    /**
     * Gets the <code>splCodes</code> property.
     * <p>
     * 
     * @return the current value of the <code>splCodes</code> property.
     */
    public List<String> getSplCodes() {
        return this.splCodes;
    }

    /**
     * Gets the <code>uldType</code> property.
     * <p>
     * 
     * @return the current value of the <code>uldType</code> property.
     */
    public String getUldType() {
        return this.uldType;
    }

    /**
     * Gets the <code>volume</code> property.
     * <p>
     * 
     * @return the current value of the <code>volume</code> property.
     */
    public BigDecimal getVolume() {
        return this.volume;
    }

    /**
     * Gets the <code>volumeUnit</code> property.
     * <p>
     * 
     * @return the current value of the <code>volumeUnit</code> property.
     */
    public VolumeUOMType getVolumeUnit() {
        return this.volumeUnit;
    }

    /**
     * Gets the <code>weight</code> property.
     * <p>
     * 
     * @return the current value of the <code>weight</code> property.
     */
    public BigDecimal getWeight() {
        return this.weight;
    }

    /**
     * Gets the <code>weightUnit</code> property.
     * <p>
     * 
     * @return the current value of the <code>weightUnit</code> property.
     */
    public WeightUOMType getWeightUnit() {
        return this.weightUnit;
    }

    /**
     * Sets the <code>allContractsInd</code> property.
     * <p>
     * 
     * @param pAllContractsInd
     *            the current value of the <code>allContractsInd</code> property.<br>
     */
    public void setAllContractsInd(final boolean pAllContractsInd) {
        this.allContractsInd = pAllContractsInd;
    }

    /**
     * Sets the <code>chargeableWeight</code> property.
     * <p>
     * 
     * @param pChargeableWeight
     *            the current value of the <code>chargeableWeight</code> property.<br>
     */
    public void setChargeableWeight(final BigDecimal pChargeableWeight) {
        this.chargeableWeight = pChargeableWeight;
    }

    /**
     * Sets the <code>classRatingId</code> property.
     * <p>
     * 
     * @param pClassRatingId
     *            the current value of the <code>classRatingId</code> property.<br>
     */
    public void setClassRatingId(final String pClassRatingId) {
        this.classRatingId = ContractUtility.convertToUpperCase(pClassRatingId);
    }

    /**
     * Sets the <code>commodityCode</code> property.
     * <p>
     * 
     * @param pCommodityCode
     *            the current value of the <code>commodityCode</code> property.<br>
     */
    public void setCommodityCode(final String pCommodityCode) {
        this.commodityCode = ContractUtility.convertToUpperCase(pCommodityCode);
    }

    // added for SK164C
    /**
     * Sets the <code>contractToApply</code> property.
     * <p>
     * 
     * @param pContractToApply
     *            the current value of the <code>commodityCode</code> property.<br>
     */
    public void setContractToApply(final String pContractToApply) {
        this.contractToApply = ContractUtility.convertToUpperCase(pContractToApply);
    }

    /**
     * Sets the <code>currencyCode</code> property.
     * <p>
     * 
     * @param pCurrencyCode
     *            the current value of the <code>currencyCode</code> property.<br>
     */
    public void setCurrencyCode(final String pCurrencyCode) {
        this.currencyCode = ContractUtility.convertToUpperCase(pCurrencyCode);
    }

    /**
     * Sets the <code>destinationCode</code> property.
     * <p>
     * 
     * @param pDestinationCode
     *            the current value of the <code>destinationCode</code> property.<br>
     */
    public void setDestinationCode(final String pDestinationCode) {
        this.destinationCode = ContractUtility.convertToUpperCase(pDestinationCode);
    }

    /**
     * Sets the <code>destinationName</code> property.
     * <p>
     * 
     * @param pDestinationName
     *            the current value of the <code>destinationName</code> property.<br>
     */
    public void setDestinationName(final String pDestinationName) {
        this.destinationName = ContractUtility.convertToUpperCase(pDestinationName);
    }

    /**
     * Sets the <code>destinationPostalCode</code> property.
     * <p>
     * 
     * @param pDestinationPostalCode
     *            the current value of the <code>destinationPostalCode</code> property.<br>
     */
    public void setDestinationPostalCode(final String pDestinationPostalCode) {
        this.destinationPostalCode = ContractUtility.convertToUpperCase(pDestinationPostalCode);
    }

    /**
     * Sets the <code>expirationDate</code> property.
     * <p>
     * 
     * @param pExpirationDate
     *            the current value of the <code>expirationDate</code> property.<br>
     */
    public void setExpirationDate(final DateRangeDto pExpirationDate) {
        this.expirationDate = pExpirationDate;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>originCode</code> property.
     * <p>
     * 
     * @param pOriginCode
     *            the current value of the <code>originCode</code> property.<br>
     */
    public void setOriginCode(final String pOriginCode) {
        this.originCode = ContractUtility.convertToUpperCase(pOriginCode);
    }

    /**
     * Sets the <code>originName</code> property.
     * <p>
     * 
     * @param pOriginName
     *            the current value of the <code>originName</code> property.<br>
     */
    public void setOriginName(final String pOriginName) {
        this.originName = ContractUtility.convertToUpperCase(pOriginName);
    }

    /**
     * Sets the <code>originPostalCode</code> property.
     * <p>
     * 
     * @param pOriginPostalCode
     *            the current value of the <code>originPostalCode</code> property.<br>
     */
    public void setOriginPostalCode(final String pOriginPostalCode) {
        this.originPostalCode = ContractUtility.convertToUpperCase(pOriginPostalCode);
    }

    /**
     * Sets the <code>participantAccountNumber</code> property.
     * <p>
     * 
     * @param pParticipantAccountNumber
     *            the current value of the <code>participantAccountNumber</code> property.<br>
     */
    public void setParticipantAccountNumber(final String pParticipantAccountNumber) {
        this.participantAccountNumber = ContractUtility.convertToUpperCase(pParticipantAccountNumber);
    }

    /**
     * Sets the <code>participantName</code> property.
     * <p>
     * 
     * @param pParticipantName
     *            the current value of the <code>participantName</code> property.<br>
     */
    public void setParticipantName(final String pParticipantName) {
        this.participantName = ContractUtility.convertToUpperCase(pParticipantName);
    }

    /**
     * Sets the <code>participantStation</code> property.
     * <p>
     * 
     * @param pParticipantStation
     *            the current value of the <code>participantStation</code> property.<br>
     */
    public void setParticipantStation(final String pParticipantStation) {
        this.participantStation = ContractUtility.convertToUpperCase(pParticipantStation);
    }

    /**
     * Sets the <code>participantType</code> property.
     * <p>
     * 
     * @param pParticipantType
     *            the current value of the <code>participantType</code> property.<br>
     */
    public void setParticipantType(final ParticipantRoleType pParticipantType) {
        this.participantType = pParticipantType;
    }

    /**
     * Sets the <code>productCode</code> property.
     * <p>
     * 
     * @param pProductCode
     *            the current value of the <code>productCode</code> property.<br>
     */
    public void setProductCode(final String pProductCode) {
        this.productCode = ContractUtility.convertToUpperCase(pProductCode);
    }

    /**
     * Sets the <code>rateClass</code> property.
     * <p>
     * 
     * @param pRateClass
     *            the current value of the <code>rateClass</code> property.<br>
     */
    public void setRateClass(final String pRateClass) {
        this.rateClass = ContractUtility.convertToUpperCase(pRateClass);
    }

    /**
     * Sets the <code>ratePieces</code> property.
     * <p>
     * 
     * @param pRatePieces
     *            the current value of the <code>ratePieces</code> property.<br>
     */
    public void setRatePieces(final Integer pRatePieces) {
        this.ratePieces = pRatePieces;
    }

    /**
     * Sets the <code>rateTotalCharges</code> property.
     * <p>
     * 
     * @param pRateTotalCharges
     *            the current value of the <code>rateTotalCharges</code> property.<br>
     */
    public void setRateTotalCharges(final BigDecimal pRateTotalCharges) {
        this.rateTotalCharges = pRateTotalCharges;
    }

    /**
     * Sets the <code>rateType</code> property.
     * <p>
     * 
     * @param pRateType
     *            the current value of the <code>rateType</code> property.<br>
     */
    public void setRateType(final String pRateType) {
        this.rateType = ContractUtility.convertToUpperCase(pRateType);
    }

    /**
     * Sets the <code>selectedPriceEntry</code> property.
     * <p>
     * 
     * @param pSelectedPriceEntry
     *            the current value of the <code>selectedPriceEntry</code> property.<br>
     */
    public void setSelectedPriceEntry(final List<SelectedPriceEntry> pSelectedPriceEntry) {
        this.selectedPriceEntry = pSelectedPriceEntry;
    }

    /**
     * Sets the <code>shipmentDate</code> property.
     * <p>
     * 
     * @param pShipmentDate
     *            the current value of the <code>shipmentDate</code> property.<br>
     */
    public void setShipmentDate(final Date pShipmentDate) {
        this.shipmentDate = ContractUtility.getClonedDate(pShipmentDate);
    }

    /**
     * Sets the <code>splCodes</code> property.
     * <p>
     * 
     * @param pSplCodes
     *            the current value of the <code>splCodes</code> property.<br>
     */
    public void setSplCodes(final List<String> pSplCodes) {
        this.splCodes = pSplCodes;
    }

    /**
     * Sets the <code>uldType</code> property.
     * <p>
     * 
     * @param pUldType
     *            the current value of the <code>uldType</code> property.<br>
     */
    public void setUldType(final String pUldType) {
        this.uldType = ContractUtility.convertToUpperCase(pUldType);
    }

    /**
     * Sets the <code>volume</code> property.
     * <p>
     * 
     * @param pVolume
     *            the current value of the <code>volume</code> property.<br>
     */
    public void setVolume(final BigDecimal pVolume) {
        this.volume = pVolume;
    }

    /**
     * Sets the <code>volumeUnit</code> property.
     * <p>
     * 
     * @param pVolumeUnit
     *            the current value of the <code>volumeUnit</code> property.<br>
     */
    public void setVolumeUnit(final VolumeUOMType pVolumeUnit) {
        this.volumeUnit = pVolumeUnit;
    }

    /**
     * Sets the <code>weight</code> property.
     * <p>
     * 
     * @param pWeight
     *            the current value of the <code>weight</code> property.<br>
     */
    public void setWeight(final BigDecimal pWeight) {
        this.weight = pWeight;
    }

    /**
     * Sets the <code>allCarrier</code> property.
     * <p>
     * 
     * @param pWeightUnit
     *            the current value of the <code>allCarrier</code> property.<br>
     */
    public void setWeightUnit(final WeightUOMType pWeightUnit) {
        this.weightUnit = pWeightUnit;
    }

    /**
     * Gets the <code>showRates</code> property.
     * <p>
     * 
     * @return the current value of the <code>showRates</code> property.
     */
    public boolean isShowRates() {
        return showRates;
    }

    /**
     * Sets the <code>showRates</code> property.
     * <p>
     * 
     * @param pShowRates
     *            the current value of the <code>showRates</code> property.<br>
     */
    public void setShowRates(final boolean pShowRates) {
        this.showRates = pShowRates;
    }

	public AirWaybillDto getAwbDto() {
		return awbDto;
	}

	public void setAwbDto(AirWaybillDto awbDto) {
		this.awbDto = awbDto;
	}

	public List<String> getSpecificAirline() {
		return this.specificAirline;
	}
	public void setSpecificAirline(final List<String> pSpecificAirline) {
		this.specificAirline = pSpecificAirline;
	}

	public String getAirlineCodeNumber() {
		return airlineCodeNumber;
	}

	public void setAirlineCodeNumber(String airlineCodeNumber) {
		this.airlineCodeNumber = airlineCodeNumber;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String aCarrier) {
		this.carrier = aCarrier;
	}
}
