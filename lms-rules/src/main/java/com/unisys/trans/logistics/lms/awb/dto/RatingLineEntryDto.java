package com.unisys.trans.logistics.lms.awb.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.constants.RateDiscriminatorType;
import com.unisys.trans.logistics.lms.framework.constants.RateGenerationType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

public class RatingLineEntryDto extends PersistenceObjectDto {
	/**
     * 
     */
	private static final long serialVersionUID = 1L;

	/**
	 * Attribute to hold <code>chargeableWeight</code> property.
	 */
	private BigDecimal chargeableWeight;

	private BigDecimal chargeableWeightA;

	private BigDecimal chargeableWeightF;

	private BigDecimal chargeableWeightP;

	/**
	 * Attribute to hold <code>classRatingId</code> property.
	 */
	private String classRatingId;

	/**
	 * Attribute to hold <code>commodityNumber</code> property.
	 */
	private String commodityNumber;

	/**
	 * Attribute to hold <code>contractNumber</code> property.
	 */
	private String contractNumber;

	/**
	 * Attribute to hold <code>deleteIndicator</code> property.
	 */
	private boolean deleteIndicator;

	/**
	 * Attribute to hold <code>grossWeight</code> property.
	 */
	private BigDecimal grossWeight;

	/**
	 * 
	 * Joint rate percentage for the first airline associated with the joint
	 * rate. This field is used for advanced cargo rating. This field is never
	 * displayed; it is only stored so the information can be passed on to an
	 * accounting package. Values:
	 * <ul>
	 * <li>0 for manual rating lines or generated lines that do not use joint
	 * rates</li>
	 * <li>0 - 999 for generated rating lines that use a joint rate.</li>
	 * </ul>
	 */
	private Integer jointRatePercFirstAirline;

	/**
	 * 
	 * Joint rate percentage for the second airline associated with the joint
	 * rate. This field is used for advanced cargo rating. This field is never
	 * displayed; it is only stored so the information can be passed on to an
	 * accounting package. Values:
	 * <ul>
	 * <li>0 for manual rating lines or generated lines that do not use joint
	 * rates</li>
	 * <li>0 - 999 for generated rating lines that use a joint rate.</li>
	 * </ul>
	 */
	private Integer jointRatePercSecondAirline;

	/**
	 * 
	 * Joint rate percentage for the third airline associated with the joint
	 * rate. This field is used for advanced cargo rating. This field is never
	 * displayed; it is only stored so the information can be passed on to an
	 * accounting package. Values:
	 * <ul>
	 * <li>0 for manual rating lines or generated lines that do not use joint
	 * rates</li>
	 * <li>0 - 999 for generated rating lines that use a joint rate.</li>
	 * </ul>
	 */
	private Integer jointRatePercThirdAirline;

	/**
	 * Attribute to hold <code>netNetIndicator</code> property.
	 */
	private boolean netNetIndicator;

	/**
	 * Attribute to hold <code>oId</code> property.
	 */
	private Long oId;

	private String owner;

	private BigDecimal rate;

	private BigDecimal rateA;
	
	private Long airwaybillOId;

	public BigDecimal getRateA() {

		if (rateDiscriminator != null
				&& rateDiscriminator == RateDiscriminatorType.A) {
			rateA = this.rate;
		}
		return rateA;
	}

	public void setRateA(BigDecimal rateA) {
		this.rateA = rateA;
	}

	public BigDecimal getRateF() {
		if (rateDiscriminator != null
				&& rateDiscriminator == RateDiscriminatorType.F) {
			rateF = this.rate;
		}

		return rateF;
	}

	public void setRateF(BigDecimal rateF) {
		this.rateF = rateF;
	}

	public BigDecimal getRateP() {
		if (rateDiscriminator != null
				&& rateDiscriminator == RateDiscriminatorType.P) {
			rateP = this.rate;
		}

		return rateP;
	}

	public void setRateP(BigDecimal rateP) {
		this.rateP = rateP;
	}

	/**
	 * Attribute to hold <code>rateCharge</code> property.
	 */
	private BigDecimal rateCharge;

	/**
	 * Attribute to hold <code>rateClassType</code> property.
	 */
	private RateClassType rateClassType;

	private RateClassType rateClassTypeA;

	private RateClassType rateClassTypeF;

	private RateClassType rateClassTypeP;

	private RateDiscriminatorType rateDiscriminator;

	private BigDecimal rateF;

	/**
	 * Attribute to hold <code>rateGenerationType</code> property.
	 */
	private RateGenerationType rateGenerationType;

	/**
	 * Attribute to hold <code>rateNote</code> property.
	 */
	private String rateNote;

	private BigDecimal rateP;

	/**
	 * Attribute to hold <code>ratePercentage</code> property.
	 */
	private Integer ratePercentage;
	/**
	 * Attribute to hold <code>ratePieces</code> property.
	 */
	private String ratePieces;

	/**
	 * Attribute to hold <code>rateRCPIndicator</code> property.
	 */
	private boolean rateRCPIndicator;

	/**
	 * Attribute to hold <code>rateSource</code> property.
	 */
	private String rateSource;

	/**
	 * Attribute to hold <code>rateType</code> property.
	 */
	private String rateType;

	/**
	 * Attribute to hold <code>ratingLineDescription</code> property.
	 */
	private String ratingLineDescription;

	/**
	 * Attribute to hold <code>spotRateNumber</code> property.
	 */
	private String spotRateNumber;

	/**
	 * Attribute to hold <code>totalWeightCharge</code> property.
	 */
	private BigDecimal totalWeightCharge;

	/**
	 * Attribute to hold <code>uldType</code> property.
	 */
	private String uldType;

	/**
	 * Gets the <code>chargeableWeight</code> property.
	 * 
	 */
	public BigDecimal getChargeableWeight() {
		return this.chargeableWeight;
	}

	public BigDecimal getChargeableWeightA() {
		if (rateDiscriminator != null
				&& rateDiscriminator == RateDiscriminatorType.A) {
			chargeableWeightA = chargeableWeight;
		}
		return chargeableWeightA;
	}

	public BigDecimal getChargeableWeightF() {
		if (rateDiscriminator != null
				&& rateDiscriminator == RateDiscriminatorType.F) {
			chargeableWeightF = chargeableWeight;
		}
		return chargeableWeightF;
	}

	public BigDecimal getChargeableWeightP() {
		if (rateDiscriminator != null
				&& rateDiscriminator == RateDiscriminatorType.P) {
			chargeableWeightP = chargeableWeight;
		}
		return chargeableWeightP;
	}

	/**
	 * Gets the <code>classRatingId</code> property.
	 * 
	 */
	public String getClassRatingId() {
		return this.classRatingId;
	}

	/**
	 * Gets the <code>commodityNumber</code> property.
	 * 
	 */
	public String getCommodityNumber() {
		return this.commodityNumber;
	}

	/**
	 * Gets the <code>contractNumber</code> property.
	 * 
	 */
	public String getContractNumber() {
		return this.contractNumber;
	}

	/**
	 * Gets the <code>deleteIndicator</code> property.
	 * 
	 */
	public boolean getDeleteIndicator() {
		return this.deleteIndicator;
	}

	/**
	 * Gets the <code>grossWeight</code> property.
	 * 
	 */
	public BigDecimal getGrossWeight() {
		return this.grossWeight;
	}

	public Integer getJointRatePercFirstAirline() {
		return jointRatePercFirstAirline;
	}

	public Integer getJointRatePercSecondAirline() {
		return jointRatePercSecondAirline;
	}

	public Integer getJointRatePercThirdAirline() {
		return jointRatePercThirdAirline;
	}

	/**
	 * Gets the <code>netNetIndicator</code> property.
	 * 
	 */
	public boolean getNetNetIndicator() {
		return this.netNetIndicator;
	}

	public Long getOId() {
		return this.oId;
	}

	public String getOwner() {
		return owner;
	}

	/**
	 * Gets the <code>rate</code> property.
	 * 
	 */
	public BigDecimal getRate() {
		return this.rate;
	}

	/**
	 * Gets the <code>rateCharge</code> property.
	 * 
	 */
	public BigDecimal getRateCharge() {
		return this.rateCharge;
	}

	/**
	 * Gets the <code>rateClassType</code> property.
	 * 
	 */
	public RateClassType getRateClassType() {
		return this.rateClassType;
	}

	public RateClassType getRateClassTypeA() {
		if (rateDiscriminator != null
				&& rateDiscriminator == RateDiscriminatorType.A) {
			rateClassTypeA = rateClassType;
		}
		return rateClassTypeA;
	}

	public RateClassType getRateClassTypeF() {
		if (rateDiscriminator != null
				&& rateDiscriminator == RateDiscriminatorType.F) {
			rateClassTypeF = rateClassType;
		}
		return rateClassTypeF;
	}

	public RateClassType getRateClassTypeP() {
		if (rateDiscriminator != null
				&& rateDiscriminator == RateDiscriminatorType.P) {
			rateClassTypeP = rateClassType;
		}
		return rateClassTypeP;
	}

	public RateDiscriminatorType getRateDiscriminator() {
		return rateDiscriminator;
	}

	/**
	 * Gets the <code>rateGenerationType</code> property.
	 * 
	 */
	public RateGenerationType getRateGenerationType() {
		return this.rateGenerationType;
	}

	/**
	 * Gets the <code>rateNote</code> property.
	 * 
	 */
	public String getRateNote() {
		return this.rateNote;
	}

	/**
	 * Gets the <code>ratePercentage</code> property.
	 * 
	 */
	public Integer getRatePercentage() {
		return this.ratePercentage;
	}

	/**
	 * Gets the <code>ratePieces</code> property.
	 * 
	 */
	public String getRatePieces() {
		return this.ratePieces;
	}

	/**
	 * Gets the <code>rateRCPIndicator</code> property.
	 * 
	 */
	public boolean getRateRCPIndicator() {
		return this.rateRCPIndicator;
	}

	/**
	 * Gets the <code>rateSource</code> property.
	 * 
	 */

	public String getRateSource() {
		return this.rateSource;
	}

	/**
	 * Gets the <code>rateType</code> property.
	 * 
	 */
	public String getRateType() {
		return this.rateType;
	}

	/**
	 * Gets the <code>ratingLineDescription</code> property.
	 * 
	 */
	public String getRatingLineDescription() {
		return this.ratingLineDescription;
	}

	/**
	 * Gets the <code>spotRateNumber</code> property.
	 * 
	 */

	public String getSpotRateNumber() {
		return this.spotRateNumber;
	}

	/**
	 * Gets the <code>totalWeightCharge</code> property.
	 * 
	 */
	public BigDecimal getTotalWeightCharge() {
		return this.totalWeightCharge;
	}

	/**
	 * Gets the <code>uldType</code> property.
	 * 
	 */
	public String getUldType() {
		return this.uldType;
	}

	/**
	 * Sets the <code>chargeableWeight</code> property.
	 * <p>
	 * 
	 * the new value of the <code>chargeableWeight</code> property.
	 */

	public void setChargeableWeight(final BigDecimal pChargeableWeight) {
		this.chargeableWeight = pChargeableWeight;
	}

	public void setChargeableWeightA(BigDecimal chargeableWeightA) {
		this.chargeableWeightA = chargeableWeightA;
	}

	public void setChargeableWeightF(BigDecimal chargeableWeightF) {
		this.chargeableWeightF = chargeableWeightF;
	}

	public void setChargeableWeightP(BigDecimal chargeableWeightP) {
		this.chargeableWeightP = chargeableWeightP;
	}

	/**
	 * Sets the <code>classRatingId</code> property.
	 * <p>
	 * 
	 * the new value of the <code>classRatingId</code> property.
	 */
	public void setClassRatingId(final String pClassRatingId) {
		this.classRatingId = pClassRatingId;
	}

	/**
	 * Sets the <code>commodityNumber</code> property.
	 * <p>
	 * 
	 * the new value of the <code>commodityNumber</code> property.
	 */
	public void setCommodityNumber(final String pCommodityNumber) {
		this.commodityNumber = pCommodityNumber;
	}

	/**
	 * Sets the <code>contractNumber</code> property.
	 * <p>
	 * 
	 * the new value of the <code>contractNumber</code> property.
	 */
	public void setContractNumber(final String pContractNumber) {
		this.contractNumber = pContractNumber;
	}

	/**
	 * Sets the <code>deleteIndicator</code> property.
	 * <p>
	 * 
	 * the new value of the <code>deleteIndicator</code> property.
	 */

	public void setDeleteIndicator(final boolean pDeleteIndicator) {
		this.deleteIndicator = pDeleteIndicator;
	}

	/**
	 * Sets the <code>grossWeight</code> property.
	 * <p>
	 * 
	 * the new value of the <code>grossWeight</code> property.
	 */
	public void setGrossWeight(final BigDecimal pGrossWeight) {
		this.grossWeight = pGrossWeight;
	}

	public void setJointRatePercFirstAirline(Integer jointRatePercFirstAirline) {
		this.jointRatePercFirstAirline = jointRatePercFirstAirline;
	}

	public void setJointRatePercSecondAirline(Integer jointRatePercSecondAirline) {
		this.jointRatePercSecondAirline = jointRatePercSecondAirline;
	}

	public void setJointRatePercThirdAirline(Integer jointRatePercThirdAirline) {
		this.jointRatePercThirdAirline = jointRatePercThirdAirline;
	}

	/**
	 * Sets the <code>netNetIndicator</code> property.
	 * <p>
	 * 
	 * the new value of the <code>netNetIndicator</code> property.
	 */
	public void setNetNetIndicator(final boolean pNetNetIndicator) {
		this.netNetIndicator = pNetNetIndicator;
	}

	/**
	 * Sets the <code>oId</code> property.
	 * <p>
	 * 
	 * the new value of the <code>oId</code> property.
	 */

	public void setoId(final Long pOId) {
		this.oId = pOId;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * Sets the <code>rate</code> property.
	 * <p>
	 * 
	 * the new value of the <code>rate</code> property.
	 */
	public void setRate(final BigDecimal pRate) {
		this.rate = pRate;
	}

	/**
	 * Sets the <code>rateCharge</code> property.
	 * <p>
	 * 
	 * the new value of the <code>rateCharge</code> property.
	 */

	public void setRateCharge(final BigDecimal pRateCharge) {
		this.rateCharge = pRateCharge;
	}

	/**
	 * Sets the <code>rateClassType</code> property.
	 * <p>
	 * 
	 * the new value of the <code>rateClassType</code> property.
	 */

	public void setRateClassType(final RateClassType pRateClassType) {
		this.rateClassType = pRateClassType;
	}

	public void setRateClassTypeA(RateClassType rateClassTypeA) {
		this.rateClassTypeA = rateClassTypeA;
	}

	public void setRateClassTypeF(RateClassType rateClassTypeF) {
		this.rateClassTypeF = rateClassTypeF;
	}

	public void setRateClassTypeP(RateClassType rateClassTypeP) {
		this.rateClassTypeP = rateClassTypeP;
	}

	public void setRateDiscriminator(RateDiscriminatorType rateDiscriminator) {
		this.rateDiscriminator = rateDiscriminator;
	}

	/**
	 * Sets the <code>rateGenerationType</code> property.
	 * <p>
	 * 
	 * the new value of the <code>rateGenerationType</code> property.
	 */

	public void setRateGenerationType(
			final RateGenerationType pRateGenerationType) {
		this.rateGenerationType = pRateGenerationType;
	}

	/**
	 * Sets the <code>rateNote</code> property.
	 * <p>
	 * 
	 * the new value of the <code>rateNote</code> property.
	 */

	public void setRateNote(final String pRateNote) {
		this.rateNote = pRateNote;
	}

	/**
	 * Sets the <code>ratePercentage</code> property.
	 * <p>
	 * 
	 * the new value of the <code>ratePercentage</code> property.
	 */

	public void setRatePercentage(final Integer pRatePercentage) {
		this.ratePercentage = pRatePercentage;
	}

	/**
	 * Sets the <code>ratePieces</code> property.
	 * <p>
	 * 
	 * the new value of the <code>ratePieces</code> property.
	 */

	public void setRatePieces(final String pRatePieces) {
		this.ratePieces = pRatePieces;
	}

	/**
	 * Sets the <code>rateRCPIndicator</code> property.
	 * <p>
	 * 
	 * the new value of the <code>rateRCPIndicator</code> property.
	 */
	public void setRateRCPIndicator(final boolean pRateRCPIndicator) {
		this.rateRCPIndicator = pRateRCPIndicator;
	}

	/**
	 * Sets the <code>rateSource</code> property.
	 * <p>
	 * 
	 * the new value of the <code>rateSource</code> property.
	 */
	public void setRateSource(final String pRateSource) {
		this.rateSource = pRateSource;
	}

	/**
	 * Sets the <code>rateType</code> property.
	 * <p>
	 * 
	 * the new value of the <code>rateType</code> property.
	 */
	public void setRateType(final String pRateType) {
		this.rateType = pRateType;
	}

	/**
	 * Sets the <code>ratingLineDescription</code> property.
	 * <p>
	 * 
	 * the new value of the <code>ratingLineDescription</code> property.
	 */

	public void setRatingLineDescription(final String pRatingLineDescription) {
		this.ratingLineDescription = pRatingLineDescription;
	}

	/**
	 * Sets the <code>spotRateNumber</code> property.
	 * <p>
	 * 
	 * the new value of the <code>spotRateNumber</code> property.
	 */
	public void setSpotRateNumber(final String pSpotRateNumber) {
		this.spotRateNumber = pSpotRateNumber;
	}

	/**
	 * Sets the <code>totalWeightCharge</code> property.
	 * <p>
	 * 
	 * the new value of the <code>totalWeightCharge</code> property.
	 */
	public void setTotalWeightCharge(final BigDecimal pTotalWeightCharge) {
		this.totalWeightCharge = pTotalWeightCharge;
	}

	/**
	 * Sets the <code>uldType</code> property.
	 * <p>
	 * 
	 * the new value of the <code>uldType</code> property.
	 */
	public void setUldType(final String pUldType) {
		this.uldType = pUldType;
	}

	public Long getAirwaybillOId() {
		return airwaybillOId;
	}

	public void setAirwaybillOId(Long airwaybillOId) {
		this.airwaybillOId = airwaybillOId;
	}

}
