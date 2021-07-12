package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.RateDiscriminatorType;
import com.unisys.trans.logistics.lms.framework.constants.RateGenerationType;
import com.unisys.trans.logistics.lms.framework.dto.constants.RateClassType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>RatingLineEntryDto</code> is used for Rating Line Entry information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>airwaybillOId
 * <li>chargeableWeight
 * <li>chargeableWeightA
 * <li>chargeableWeightF
 * <li>chargeableWeightP
 * <li>classRatingId
 * <li>commodityNumber
 * <li>contractNumber
 * <li>deleteIndicator
 * <li>grossWeight
 * <li>oId
 * <li>jointRatePercFirstAirline
 * <li>jointRatePercSecondAirline
 * <li>jointRatePercThirdAirline
 * <li>netNetIndicator
 * <li>owner
 * <li>rate
 * <li>rateA
 * <li>rateCharge
 * <li>rateType
 * <li>rateTypeA
 * <li>rateTypeP
 * <li>rateTypeF
 * <li>rateGenerationType;
 * <li>rateNote;
 * <li>rateP;
 * <li>ratePercentage;
 * <li>ratePieces;
 * <li>rateRCPIndicator;
 * <li>rateReduction;
 * <li>rateSource;
 * <li>ratingLineDescription;
 * <li>spotRateNumber;
 * <li>totalWeightCharge;
 * <li>uldType;
 * </ul>
 */

public class HouseRatingLineEntryDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */

    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>chargeableWeight</code> property.
     */

    private Long airwaybillOId;

    /**
     * Attribute to hold <code>chargeableWeight</code> property.
     */
    private BigDecimal chargeableWeight;

    /**
     * Attribute to hold <code>chargeableWeight</code> property.
     */

    private BigDecimal chargeableWeightA;

    /**
     * Attribute to hold <code>chargeableWeight</code> property.
     */

    private BigDecimal chargeableWeightF;

    /**
     * Attribute to hold <code>chargeableWeight</code> property.
     */

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
     * Attribute to hold <code>description</code> property.
     */
    private String description;

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
     * <li>0 for manual rating lines or generated lines that do not use joint rates</li>
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
     * <li>0 for manual rating lines or generated lines that do not use joint rates</li>
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
     * <li>0 for manual rating lines or generated lines that do not use joint rates</li>
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

    /**
     * Attribute to hold <code>owner</code> property.
     */

    private String owner;

    /**
     * Attribute to hold <code>Pieces</code> property.
     */
    private Integer Pieces;

    /**
     * Attribute to hold <code>rate</code> property.
     */

    private BigDecimal rate;

    /**
     * Attribute to hold <code>rateA</code> property.
     */

    private BigDecimal rateA;

    /**
     * Attribute to hold <code>rateCharge</code> property.
     */
    private BigDecimal rateCharge;

    /**
     * Attribute to hold <code>rateClassQualifier</code> property.
     */

    private String rateClassQualifier;

    /**
     * Attribute to hold <code>rateClassType</code> property.
     */
    private RateClassType rateClassType;

    /**
     * Attribute to hold <code>rateClassTypeA</code> property.
     */

    private RateClassType rateClassTypeA;

    /**
     * Attribute to hold <code>rateClassTypeF</code> property.
     */

    private RateClassType rateClassTypeF;

    /**
     * Attribute to hold <code>rateClassTypeP</code> property.
     */

    private RateClassType rateClassTypeP;

    /**
     * Attribute to hold <code>rateDiscriminator</code> property.
     */

    private RateDiscriminatorType rateDiscriminator;

    /**
     * Attribute to hold <code>rateF</code> property.
     */

    private BigDecimal rateF;

    /**
     * Attribute to hold <code>rateGenerationType</code> property.
     */
    private RateGenerationType rateGenerationType;

    /**
     * Attribute to hold <code>rateNote</code> property.
     */
    private String rateNote;

    /**
     * Attribute to hold <code>rateP</code> property.
     */

    private BigDecimal rateP;

    /**
     * Attribute to hold <code>ratePercentage</code> property.
     */
    private Integer ratePercentage;

    /**
     * Attribute to hold <code>ratePieces</code> property.
     */
    private Integer ratePieces;

    /**
     * Attribute to hold <code>rateRCPIndicator</code> property.
     */
    private boolean rateRCPIndicator;

    /**
     * Attribute to hold <code>rateReduction</code> property.
     */

    private String rateReduction;

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
     * Attribute to hold <code>RLGI</code> property.
     */
    private boolean rlgiInd;

    /**
     * Attribute to hold <code>shipmentDimensions</code> property.
     * <p>
     * Represents the <code>shipmentDimensions</code> object which holds all the attributes that constitutes
     * the shipmentDimension.
     */
    private List<ShipmentDimensionDto> shipmentDimensions;

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
     * Gets the <code>Serialversionuid</code> property.
     * 
     * @return
     *         the current value of <code> Serialversionuid <code>
     * 
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * Gets the <code>airwaybillOId</code> property.
     * 
     * @return
     *         the current value of <code> airwaybillOId <code>
     * 
     */

    public Long getAirwaybillOId() {
        return this.airwaybillOId;
    }

    /**
     * Gets the <code>chargeableWeight</code> property.
     * 
     * @return
     *         the current value of <code> chargeableWeight </code>
     * 
     */
    public BigDecimal getChargeableWeight() {
        return this.chargeableWeight;
    }

    /**
     * Gets the <code>chargeableWeightA</code> property.
     * 
     * @return
     *         the current value of <code> chargeableWeightA </code>
     * 
     */

    public BigDecimal getChargeableWeightA() {
        if (this.rateDiscriminator != null
                    && this.rateDiscriminator == RateDiscriminatorType.A) {
            this.chargeableWeightA = this.chargeableWeight;
        }
        return this.chargeableWeightA;
    }

    /**
     * Gets the <code>chargeableWeightF</code> property.
     * 
     * @return
     *         the current value of <code> chargeableWeightF </code>
     * 
     */

    public BigDecimal getChargeableWeightF() {
        if (this.rateDiscriminator != null
                    && this.rateDiscriminator == RateDiscriminatorType.F) {
            this.chargeableWeightF = this.chargeableWeight;
        }
        return this.chargeableWeightF;
    }

    /**
     * Gets the <code>chargeableWeightP</code> property.
     * 
     * @return
     *         the current value of <code> chargeableWeightP </code>
     * 
     */

    public BigDecimal getChargeableWeightP() {
        if (this.rateDiscriminator != null
                    && this.rateDiscriminator == RateDiscriminatorType.P) {
            this.chargeableWeightP = this.chargeableWeight;
        }
        return this.chargeableWeightP;
    }

    /**
     * Gets the <code>classRatingId</code> property.
     * 
     * @return
     *         the current value of <code> classRatingId </code>
     */
    public String getClassRatingId() {
        return this.classRatingId;
    }

    /**
     * Gets the <code>commodityNumber</code> property.
     * 
     * @return
     *         the current value of <code> commodityNumber </code>
     */
    public String getCommodityNumber() {
        return this.commodityNumber;
    }

    /**
     * Gets the <code>contractNumber</code> property.
     * 
     * @return
     *         the current value of <code> contractNumber </code>
     */
    public String getContractNumber() {
        return this.contractNumber;
    }

    /**
     * Gets the <code>deleteIndicator</code> property.
     * 
     * @return
     *         the current value of <code> deleteIndicator </code>
     */
    public boolean getDeleteIndicator() {
        return this.deleteIndicator;
    }

    /**
     * Gets the <code>Description</code> property.
     * 
     * @return
     *         the current value of <code> description </code>
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>grossWeight</code> property.
     * 
     * @return
     *         the current value of <code> grossWeight </code>
     */
    public BigDecimal getGrossWeight() {
        return this.grossWeight;
    }

    /**
     * Gets the <code>jointRatePercFirstAirline</code> property.
     * 
     * @return
     *         the current value of <code> jointRatePercFirstAirline </code>
     */

    public Integer getJointRatePercFirstAirline() {
        return this.jointRatePercFirstAirline;
    }

    /**
     * Gets the <code>jointRatePercSecondAirline</code> property.
     * 
     * @return
     *         the current value of <code> jointRatePercSecondAirline </code>
     */
    public Integer getJointRatePercSecondAirline() {
        return this.jointRatePercSecondAirline;
    }

    /**
     * Gets the <code>jointRatePercThirdAirline</code> property.
     * 
     * @return
     *         the current value of <code> jointRatePercThirdAirline </code>
     */

    public Integer getJointRatePercThirdAirline() {
        return this.jointRatePercThirdAirline;
    }

    /**
     * Gets the <code>netNetIndicator</code> property.
     * 
     * @return
     *         the current value of <code> netNetIndicator </code>
     */

    public boolean getNetNetIndicator() {
        return this.netNetIndicator;
    }

    /**
     * Gets the <code>oId</code> property.
     * 
     * @return
     *         the current value of <code> oId </code>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>owner</code> property.
     * 
     * @return
     *         the current value of <code> owner </code>
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * Gets the <code>Pieces</code> property.
     * 
     * @return
     *         the current value of <code> Pieces </code>
     */
    public Integer getPieces() {
        return this.Pieces;
    }

    /**
     * Gets the <code>rate</code> property.
     * 
     * @return
     *         the current value of <code> rate </code>
     */

    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Gets the <code>rateA</code> property.
     * 
     * @return
     *         the current value of <code> rateA </code>
     */
    public BigDecimal getRateA() {

        if (this.rateDiscriminator != null
                    && this.rateDiscriminator == RateDiscriminatorType.A) {
            this.rateA = this.rate;
        }
        return this.rateA;
    }

    /**
     * Gets the <code>rateCharge</code> property.
     * 
     * @return
     *         the current value of <code> rateCharge </code>
     */

    public BigDecimal getRateCharge() {
        return this.rateCharge;
    }

    /**
     * Gets the <code>rateClassQualifier</code> property.
     * 
     * @return
     *         the current value of <code> rateClassQualifier </code>
     */

    public String getRateClassQualifier() {
        return this.rateClassQualifier;
    }

    /**
     * Gets the <code>rateClassType</code> property.
     * 
     * @return
     *         the current value of <code> rateClassType </code>
     */
    public RateClassType getRateClassType() {
        return this.rateClassType;
    }

    /**
     * Gets the <code>rateClassTypeA</code> property.
     * 
     * @return
     *         the current value of <code> rateClassTypeA </code>
     */

    public RateClassType getRateClassTypeA() {
        if (this.rateDiscriminator != null
                    && this.rateDiscriminator == RateDiscriminatorType.A) {
            this.rateClassTypeA = this.rateClassType;
        }
        return this.rateClassTypeA;
    }

    /**
     * Gets the <code>rateClassTypeF</code> property.
     * 
     * @return
     *         the current value of <code> rateClassTypeF </code>
     */

    public RateClassType getRateClassTypeF() {
        if (this.rateDiscriminator != null
                    && this.rateDiscriminator == RateDiscriminatorType.F) {
            this.rateClassTypeF = this.rateClassType;
        }
        return this.rateClassTypeF;
    }

    /**
     * Gets the <code>rateClassTypeP</code> property.
     * 
     * @return
     *         the current value of <code> rateClassTypeP </code>
     */

    public RateClassType getRateClassTypeP() {
        if (this.rateDiscriminator != null
                    && this.rateDiscriminator == RateDiscriminatorType.P) {
            this.rateClassTypeP = this.rateClassType;
        }
        return this.rateClassTypeP;
    }

    /**
     * Gets the <code>rateDiscriminator</code> property.
     * 
     * @return
     *         the current value of <code> rateDiscriminator </code>
     */

    public RateDiscriminatorType getRateDiscriminator() {
        return this.rateDiscriminator;
    }

    /**
     * Gets the <code>rateF</code> property.
     * 
     * @return
     *         the current value of <code> rateF </code>
     */

    public BigDecimal getRateF() {
        if (this.rateDiscriminator != null
                    && this.rateDiscriminator == RateDiscriminatorType.F) {
            this.rateF = this.rate;
        }

        return this.rateF;
    }

    /**
     * Gets the <code>rateGenerationType</code> property.
     * 
     * @return
     *         the current value of <code> rateGenerationType </code>
     */
    public RateGenerationType getRateGenerationType() {
        return this.rateGenerationType;
    }

    /**
     * Gets the <code>rateNote</code> property.
     * 
     * @return
     *         the current value of <code> rateNote </code>
     */

    public String getRateNote() {
        return this.rateNote;
    }

    /**
     * Gets the <code>rateP</code> property.
     * 
     * @return
     *         the current value of <code> rateP </code>
     */

    public BigDecimal getRateP() {
        if (this.rateDiscriminator != null
                    && this.rateDiscriminator == RateDiscriminatorType.P) {
            this.rateP = this.rate;
        }

        return this.rateP;
    }

    /**
     * Gets the <code>ratePercentage</code> property.
     * 
     * @return
     *         the current value of <code> ratePercentage </code>
     */

    public Integer getRatePercentage() {
        return this.ratePercentage;
    }

    /**
     * Gets the <code>ratePieces</code> property.
     * 
     * @return
     *         the current value of <code> ratePieces </code>
     */
    public Integer getRatePieces() {
        return this.ratePieces;
    }

    /**
     * Gets the <code>rateRCPIndicator</code> property.
     * 
     * @return
     *         the current value of <code> rateRCPIndicator </code>
     */
    public boolean getRateRCPIndicator() {
        return this.rateRCPIndicator;
    }

    /**
     * Gets the <code>rateReduction</code> property.
     * 
     * @return
     *         the current value of <code> rateReduction </code>
     */

    public String getRateReduction() {
        return this.rateReduction;
    }

    /**
     * Gets the <code>rateSource</code> property.
     * 
     * @return
     *         the current value of <code> rateSource </code>
     */

    public String getRateSource() {
        return this.rateSource;
    }

    /**
     * Gets the <code>rateType</code> property.
     * 
     * @return
     *         the current value of <code> rateType </code>
     */

    public String getRateType() {
        return this.rateType;
    }

    /**
     * Gets the <code>ratingLineDescription</code> property.
     * 
     * @return
     *         the current value of <code> ratingLineDescription </code>
     */

    public String getRatingLineDescription() {
        return this.ratingLineDescription;
    }

    /**
     * Gets the <code>shipmentDimensions</code> property.
     * 
     * @return the shipmentDimensions
     */
    public List<ShipmentDimensionDto> getShipmentDimensions() {
        return this.shipmentDimensions;
    }

    /**
     * Gets the <code>spotRateNumber</code> property.
     * 
     * @return
     *         the current value of <code> spotRateNumber </code>
     */

    public String getSpotRateNumber() {
        return this.spotRateNumber;
    }

    /**
     * Gets the <code>totalWeightCharge</code> property.
     * 
     * @return
     *         the current value of <code> totalWeightCharge </code>
     */

    public BigDecimal getTotalWeightCharge() {
        return this.totalWeightCharge;
    }

    /**
     * Gets the <code>uldType</code> property.
     * 
     * @return
     *         the current value of <code> uldType </code>
     */

    public String getUldType() {
        return this.uldType;
    }

    /**
     * Gets the <code>RLGI</code> property.
     * 
     * @return
     *         the current value of <code> RLGI <code>
     * 
     */
    public boolean isRlgiInd() {
		return rlgiInd;
	}
    /**
     * Gets the <code>airwaybillOId</code> property.
     * 
     * @return
     *         the current value of <code> airwaybillOId </code>.
     */

    public void setAirwaybillOId(final Long pAirwaybillOId) {
        this.airwaybillOId = pAirwaybillOId;
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

    /**
     * Sets the <code>chargeableWeightA</code> property.
     * <p>
     * 
     * the new value of the <code>chargeableWeightA</code> property.
     * 
     * @param current value of <code>pChargeableWeightA</code>.
     */

    public void setChargeableWeightA(final BigDecimal pChargeableWeightA) {
        this.chargeableWeightA = pChargeableWeightA;
    }

    /**
     * Sets the <code>chargeableWeightF</code> property.
     * <p>
     * 
     * the new value of the <code>chargeableWeightF</code> property.
     * 
     * @param current value of <code>pChargeableWeightF</code>.
     */

    public void setChargeableWeightF(final BigDecimal pChargeableWeightF) {
        this.chargeableWeightF = pChargeableWeightF;
    }

    /**
     * Sets the <code>chargeableWeightP</code> property.
     * <p>
     * 
     * the new value of the <code>chargeableWeightP</code> property.
     * 
     * @param current value of <code>pChargeableWeightP</code>.
     */

    public void setChargeableWeightP(final BigDecimal pChargeableWeightP) {
        this.chargeableWeightP = pChargeableWeightP;
    }

    /**
     * Sets the <code>classRatingId</code> property.
     * <p>
     * 
     * the new value of the <code>classRatingId</code> property.
     * 
     * @param current value of <code>pClassRatingId</code>.
     */
    public void setClassRatingId(final String pClassRatingId) {
        this.classRatingId = ContractUtility.convertToUpperCase(pClassRatingId);
    }

    /**
     * Sets the <code>commodityNumber</code> property.
     * <p>
     * 
     * the new value of the <code>commodityNumber</code> property.
     * 
     * @param current value of <code>pCommodityNumber</code>.
     */
    public void setCommodityNumber(final String pCommodityNumber) {
        this.commodityNumber = ContractUtility.convertToUpperCase(pCommodityNumber);
    }

    /**
     * Sets the <code>contractNumber</code> property.
     * <p>
     * 
     * the new value of the <code>contractNumber</code> property.
     * 
     * @param current value of <code>pContractNumber</code>.
     */
    public void setContractNumber(final String pContractNumber) {
        this.contractNumber = ContractUtility.convertToUpperCase(pContractNumber);
    }

    /**
     * Sets the <code>deleteIndicator</code> property.
     * <p>
     * 
     * the new value of the <code>deleteIndicator</code> property.
     * 
     * @param current value of <code>pDeleteIndicator</code>.
     */

    public void setDeleteIndicator(final boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the <code>Description</code> property.
     * <p>
     * 
     * the new value of the <code>description</code> property.
     * 
     * @param current value of <code>pDescription</code>.
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the <code>grossWeight</code> property.
     * <p>
     * 
     * the new value of the <code>grossWeight</code> property.
     * 
     * @param current value of <code>pGrossWeight</code>
     */
    public void setGrossWeight(final BigDecimal pGrossWeight) {
        this.grossWeight = pGrossWeight;
    }

    /**
     * Sets the <code>jointRatePercFirstAirline</code> property.
     * <p>
     * 
     * the new value of the <code>jointRatePercFirstAirline</code> property.
     * 
     * @param current value of <code>pJointRatePercFirstAirline</code>
     */

    public void setJointRatePercFirstAirline(final Integer pJointRatePercFirstAirline) {
        this.jointRatePercFirstAirline = pJointRatePercFirstAirline;
    }

    /**
     * Sets the <code>jointRatePercSecondAirline</code> property.
     * <p>
     * 
     * the new value of the <code>jointRatePercSecondAirline</code> property.
     * 
     * @param current value of <code>pJointRatePercSecondAirline</code>.
     */

    public void setJointRatePercSecondAirline(final Integer pJointRatePercSecondAirline) {
        this.jointRatePercSecondAirline = pJointRatePercSecondAirline;
    }

    /**
     * Sets the <code>jointRatePercThirdAirline</code> property.
     * <p>
     * 
     * the new value of the <code>jointRatePercThirdAirline</code> property.
     * 
     * @param current value of <code>pJointRatePercThirdAirline</code>.
     */

    public void setJointRatePercThirdAirline(final Integer pJointRatePercThirdAirline) {
        this.jointRatePercThirdAirline = pJointRatePercThirdAirline;
    }

    /**
     * Sets the <code>netNetIndicator</code> property.
     * <p>
     * 
     * the new value of the <code>netNetIndicator</code> property.
     * 
     * @param current value of <code>pNetNetIndicator</code>.
     */
    public void setNetNetIndicator(final boolean pNetNetIndicator) {
        this.netNetIndicator = pNetNetIndicator;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * the new value of the <code>oId</code> property.
     * 
     * @param current value of <code>pOId</code>.
     */

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>owner</code> property.
     * <p>
     * 
     * the new value of the <code>owner</code> property.
     * 
     * @param current value of <code>pOwner</code>.
     */

    public void setOwner(final String pOwner) {
        this.owner = ContractUtility.convertToUpperCase(pOwner);
    }

    /**
     * Sets the <code>Pieces</code> property.
     * <p>
     * 
     * the new value of the <code>Pieces</code> property.
     * 
     * @param current value of <code>pPieces</code>.
     */

    public void setPieces(final Integer pPieces) {
        this.Pieces = pPieces;
    }

    /**
     * Sets the <code>rate</code> property.
     * <p>
     * 
     * the new value of the <code>rate</code> property.
     * 
     * @param current value of <code>pRate</code>.
     */
    public void setRate(final BigDecimal pRate) {
        this.rate = pRate;
    }

    /**
     * Sets the <code>rateA</code> property.
     * <p>
     * 
     * the new value of the <code>rateA</code> property.
     * 
     * @param current value of <code>pRateA</code>.
     */

    public void setRateA(final BigDecimal pRateA) {
        this.rateA = pRateA;
    }

    /**
     * Sets the <code>rateCharge</code> property.
     * <p>
     * 
     * the new value of the <code>rateCharge</code> property.
     * 
     * @param current value of <code>pRateCharge</code>.
     */

    public void setRateCharge(final BigDecimal pRateCharge) {
        this.rateCharge = pRateCharge;
    }

    /**
     * Sets the <code>rateClassQualifier</code> property.
     * <p>
     * 
     * the new value of the <code>rateClassQualifier</code> property.
     * 
     * @param current value of <code>pRateClassQualifier</code>.
     */

    public void setRateClassQualifier(final String pRateClassQualifier) {
        this.rateClassQualifier = ContractUtility.convertToUpperCase(pRateClassQualifier);
    }

    /**
     * Sets the <code>rateClassType</code> property.
     * <p>
     * 
     * the new value of the <code>rateClassType</code> property.
     * 
     * @param current value of <code>pRateClassType</code>.
     */

    public void setRateClassType(final RateClassType pRateClassType) {
        this.rateClassType = pRateClassType;
    }

    /**
     * Sets the <code>rateClassTypeA</code> property.
     * <p>
     * 
     * the new value of the <code>rateClassTypeA</code> property.
     * 
     * @param current value of <code>pRateClassTypeA</code>.
     */

    public void setRateClassTypeA(final RateClassType pRateClassTypeA) {
        this.rateClassTypeA = pRateClassTypeA;
    }

    /**
     * Sets the <code>rateClassTypeF</code> property.
     * <p>
     * 
     * the new value of the <code>rateClassTypeF</code> property.
     * 
     * @param current value of <code>pRateClassTypeF</code>.
     */

    public void setRateClassTypeF(final RateClassType pRateClassTypeF) {
        this.rateClassTypeF = pRateClassTypeF;
    }

    /**
     * Sets the <code>rateClassTypeP</code> property.
     * <p>
     * 
     * the new value of the <code>rateClassTypeP</code> property.
     * 
     * @param current value of <code>pRateClassTypeP</code>.
     */

    public void setRateClassTypeP(final RateClassType pRateClassTypeP) {
        this.rateClassTypeP = pRateClassTypeP;
    }

    /**
     * Sets the <code>rateDiscriminator</code> property.
     * <p>
     * 
     * the new value of the <code>rateDiscriminator</code> property.
     * 
     * @param current value of <code>pRateDiscriminator</code>.
     */

    public void setRateDiscriminator(final RateDiscriminatorType pRateDiscriminator) {
        this.rateDiscriminator = pRateDiscriminator;
    }

    /**
     * Sets the <code>rateF</code> property.
     * <p>
     * 
     * the new value of the <code>rateF</code> property.
     * 
     * @param current value of <code>pRateF</code>.
     */

    public void setRateF(final BigDecimal pRateF) {
        this.rateF = pRateF;
    }

    /**
     * Sets the <code>rateGenerationType</code> property.
     * <p>
     * 
     * the new value of the <code>rateGenerationType</code> property.
     * 
     * @param current value of <code>pRateGenerationType</code>.
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
     * 
     * @param current value of <code>pRateNote</code>.
     */

    public void setRateNote(final String pRateNote) {
        this.rateNote = ContractUtility.convertToUpperCase(pRateNote);
    }

    /**
     * Sets the <code>rateP</code> property.
     * <p>
     * 
     * the new value of the <code>rateP</code> property.
     * 
     * @param current value of <code>pRateP</code>.
     */

    public void setRateP(final BigDecimal pRateP) {
        this.rateP = pRateP;
    }

    /**
     * Sets the <code>ratePercentage</code> property.
     * <p>
     * 
     * the new value of the <code>ratePercentage</code> property.
     * 
     * @param current value of <code>pRatePercentage</code>.
     */

    public void setRatePercentage(final Integer pRatePercentage) {
        this.ratePercentage = pRatePercentage;
    }

    /**
     * Sets the <code>ratePieces</code> property.
     * <p>
     * 
     * the new value of the <code>ratePieces</code> property.
     * 
     * @param current value of <code>pRatePieces</code>.
     */

    public void setRatePieces(final Integer pRatePieces) {
        this.ratePieces = pRatePieces;
    }

    /**
     * Sets the <code>rateRCPIndicator</code> property.
     * <p>
     * 
     * the new value of the <code>rateRCPIndicator</code> property.
     * 
     * @param current value of <code>pRateRCPIndicator</code>.
     */
    public void setRateRCPIndicator(final boolean pRateRCPIndicator) {
        this.rateRCPIndicator = pRateRCPIndicator;
    }

    /**
     * Sets the <code>rateReduction</code> property.
     * <p>
     * 
     * the new value of the <code>rateReduction</code> property.
     * 
     * @param current value of <code>pRateReduction</code>.
     */

    public void setRateReduction(final String pRateReduction) {
        this.rateReduction = ContractUtility.convertToUpperCase(pRateReduction);
    }

    /**
     * Sets the <code>rateSource</code> property.
     * <p>
     * 
     * the new value of the <code>rateSource</code> property.
     * 
     * @param current value of <code>pRateSource</code>.
     */
    public void setRateSource(final String pRateSource) {
        this.rateSource = ContractUtility.convertToUpperCase(pRateSource);
    }

    /**
     * Sets the <code>rateType</code> property.
     * <p>
     * 
     * the new value of the <code>rateType</code> property.
     * 
     * @param current value of <code>pRateType</code>.
     */
    public void setRateType(final String pRateType) {
        this.rateType = ContractUtility.convertToUpperCase(pRateType);
    }

    /**
     * Sets the <code>ratingLineDescription</code> property.
     * <p>
     * 
     * the new value of the <code>ratingLineDescription</code> property.
     * 
     * @param current value of <code>pRatingLineDescription</code>.
     */

    public void setRatingLineDescription(final String pRatingLineDescription) {
        this.ratingLineDescription = pRatingLineDescription;
    }

    
    /**
     * Sets the <code>RLGI</code> property.
     * <p>
     * 
     * the new value of the <code>RLGI</code> property.
     * 
     * @param current value of <code>pRLGI</code>.
     */
	public void setRlgiInd(boolean rlgiInd) {
		this.rlgiInd = rlgiInd;
	}

    /**
     * Sets the <code>shipmentDimensions</code> property.
     * 
     * @param pShipmentDimensions the shipmentDimensions to set.
     */
    public void setShipmentDimensions(final List<ShipmentDimensionDto> pShipmentDimensions) {
        this.shipmentDimensions = pShipmentDimensions;
    }

    /**
     * Sets the <code>spotRateNumber</code> property.
     * <p>
     * 
     * @param pSpotRateNumber the SpotRateNumber to set.
     */
    public void setSpotRateNumber(final String pSpotRateNumber) {
        this.spotRateNumber = pSpotRateNumber;
    }

    /**
     * Sets the <code>totalWeightCharge</code> property.
     * <p>
     * 
     * @param pTotalWeightCharge the TotalWeightCharge to set.
     */
    public void setTotalWeightCharge(final BigDecimal pTotalWeightCharge) {
        this.totalWeightCharge = pTotalWeightCharge;
    }

    /**
     * Sets the <code>uldType</code> property.
     * <p>
     * 
     * @param pUldType the UldType to set.
     */
    public void setUldType(final String pUldType) {
        this.uldType = ContractUtility.convertToUpperCase(pUldType);
    }
 // FIS136P2 start
 	@Override
 	public int hashCode() {
 		int hash = 3;
 		hash = 53 * hash
 				+ (this.grossWeight != null ? this.grossWeight.hashCode() : 0);
 		hash = 53 * hash + (this.ratePieces != null ? this.ratePieces.hashCode() : 0);
 		hash = 53 * hash
 				+ (this.ratingLineDescription != null ? this.ratingLineDescription.hashCode() : 0);
 		return hash;
 	}

 	@Override
	public boolean equals(final Object pRatingLineEntryDto) {
		HouseRatingLineEntryDto obj = (HouseRatingLineEntryDto) pRatingLineEntryDto;
		if (obj != null && this.grossWeight != null
				&& this.ratingLineDescription != null
				&& this.ratePieces != null)
			return this.grossWeight.setScale(2).equals(obj.getGrossWeight().setScale(2)) ? (this.ratePieces
					.equals(obj.getRatePieces()) ? this.ratingLineDescription
					.equals(obj.getRatingLineDescription()) : false) : false;
		return false;
	}
 	// FIS136P2 end
}
