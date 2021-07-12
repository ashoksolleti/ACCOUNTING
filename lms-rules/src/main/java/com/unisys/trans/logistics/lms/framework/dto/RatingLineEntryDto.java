package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
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
 * <li>localPackageDescription
 * </ul>
 */

public class RatingLineEntryDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */

    private static final long serialVersionUID = 1L;

    /**
     * Gets the <code>Serialversionuid</code> property.
     *
     * @return the current value of <code> Serialversionuid <code>
     *
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * Attribute to hold <code>chargeableWeight</code> property.
     */

    private Long airwaybillOId;

    private String chkDimension;

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
     * Attribute to hold <code>manualChargeableWeight</code> property.
     */
    private BigDecimal manualChargeableWeight;

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
     * Attribute to hold <code>localPackageDescription</code> property.
     */
    private String localPackageDescription;

    /**
     * Attribute to hold <code>deleteIndicator</code> property.
     */
    private boolean deleteIndicator;

    /**
     * Attribute to hold <code>description</code> property.
     */
    private String description;

    /**
     * Attribute to hold <code>discountWeight</code> property.
     */
    private BigDecimal discountWeight;

    /**
     * Attribute to hold <code>grossWeight</code> property.
     */
    private BigDecimal grossWeight;

    /**
     * Attribute to hold <code>rateTotalCharges</code> property.
     */
    private BigDecimal rateTotalCharges;

    /**
     * Attribute to hold <code>isULDRatingLineBased</code> property.
     */
    private boolean uldRatingLineBased;

    /**
     * Attribute to hold <code>specialRemarksFlagF</code> property.
     */
    private boolean specialRemarksFlagF;

    /**
     * Attribute to hold <code>specialRemarksFlagP</code> property.
     */
    private boolean specialRemarksFlagP;

    /**
     * Attribute to hold <code>specialRemarksFlagA</code> property.
     */
    private boolean specialRemarksFlagA;


    private String rateClassDisplay;

    /**
     * @return the rateTotalCharges
     */
    public BigDecimal getRateTotalCharges() {
        return this.rateTotalCharges;
    }

    /**
     * @param pRateTotalCharges
     *            the rateTotalCharges to set
     */
    public void setRateTotalCharges(final BigDecimal pRateTotalCharges) {
        this.rateTotalCharges = pRateTotalCharges;
    }

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
     * Attribute to hold <code>overPivotCharge</code> property.
     */
    private BigDecimal overPivotCharge;

    /**
     * Attribute to hold <code>overPivotRate</code> property.
     */
    private BigDecimal overPivotRate;

    /**
     * Attribute to hold <code>overPivotWeight</code> property.
     */
    private BigDecimal overPivotWeight;

    /**
     * Attribute to hold <code>owner</code> property.
     */

    private String owner;

    /**
     * Attribute to hold <code>pieceDisplay</code> property.
     */
    private String pieceDisplay;

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
     * Attribute to hold <code>rateLineNumber</code> property.
     */
    private int rateLineNumber;

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
     * Attribute to hold <code>ratePerKilo</code> property.
     */
    private BigDecimal ratePerKilo;

    /**
     * Attribute to hold <code>ratePieces</code> property.
     */
    private String ratePieces;

    /**
     * Attribute to hold <code>rateRCPIndicator</code> property.
     */
    private boolean rateRCPIndicator;

    /**
     * Attribute to hold <code>rateRCPNumber</code> property.
     */
    private int rateRCPNumber;

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
     * Attribute to hold <code>rcp</code> property.
     */
    private String rcp;

    /**
     * Attribute to hold <code>RLGI</code> property.
     */
    private boolean rlgi;

    /**
     * Attribute to hold <code>serviceLineIndicator</code> property.
     */
    private boolean serviceLineIndicator;

    /**
     * Attribute to hold <code>shipmentDimensions</code> property.
     * <p>
     * Represents the <code>shipmentDimensions</code> object which holds all the attributes that constitutes
     * the shipmentDimension.
     */
    private List<ShipmentDimensionDto> shipmentDimensions;

    /**
     * Attribute to hold <code>ratePieces</code> property.
     */

    private Integer Slac;

    /**
     * Attribute to hold <code>specialRemarks</code> property.
     */
    private List<RatingSpecialRemarksDto> specialRemarks;

    /**
     * Attribute to hold <code>spotRateNumber</code> property.
     */
    private String spotRateNumber;

    /**
     * Attribute to hold <code>tareWeight</code> property.
     */
    private BigDecimal tareWeight;

    /**
     * Attribute to hold <code>totalWeightCharge</code> property.
     */
    private BigDecimal totalWeightCharge;

    /**
     * Attribute to hold <code>uldDiscount</code> property.
     */
    private BigDecimal uldDiscount;

    /**
     * Attribute to hold <code>uldDiscountCharge</code> property.
     */
    private BigDecimal uldDiscountCharge;

    /**
     * Attribute to hold <code>uldType</code> property.
     */
    private String uldType;

    /**
     * Attribute to hold <code>uldPosition</code> property.
     */
    private Integer uldPosition;


    /**
     * Gets the <code>airwaybillOId</code> property.
     *
     * @return the current value of <code> airwaybillOId <code>
     *
     */

    public Long getAirwaybillOId() {
        return this.airwaybillOId;
    }

    /**
     * Gets the <code>chargeableWeight</code> property.
     *
     * @return the current value of <code> chargeableWeight </code>
     *
     */
    public BigDecimal getChargeableWeight() {
        return this.chargeableWeight;
    }

    /**
     * Gets the <code>localPackageDescription</code> property.
     *
     * @return the current value of <code> localPackageDescription </code>
     *
     */
    public String getLocalPackageDescription() {
        return this.localPackageDescription;
    }

    /**
     * Gets the <code>chargeableWeightA</code> property.
     *
     * @return the current value of <code> chargeableWeightA </code>
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
     * @return the current value of <code> chargeableWeightF </code>
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
     * @return the current value of <code> chargeableWeightP </code>
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
     * @return the current value of <code> classRatingId </code>
     */
    public String getClassRatingId() {
        return this.classRatingId;
    }

    /**
     * Gets the <code>commodityNumber</code> property.
     *
     * @return the current value of <code> commodityNumber </code>
     */
    public String getCommodityNumber() {
        return this.commodityNumber;
    }

    /**
     * Gets the <code>contractNumber</code> property.
     *
     * @return the current value of <code> contractNumber </code>
     */
    public String getContractNumber() {
        return this.contractNumber;
    }

    /**
     * Gets the <code>deleteIndicator</code> property.
     *
     * @return the current value of <code> deleteIndicator </code>
     */
    public boolean getDeleteIndicator() {
        return this.deleteIndicator;
    }

    /**
     * Gets the <code>Description</code> property.
     *
     * @return the current value of <code> description </code>
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return the discountWeight
     */
    public BigDecimal getDiscountWeight() {
        return this.discountWeight;
    }

    /**
     * Gets the <code>grossWeight</code> property.
     *
     * @return the current value of <code> grossWeight </code>
     */
    public BigDecimal getGrossWeight() {
        return this.grossWeight;
    }

    /**
     * Gets the <code>jointRatePercFirstAirline</code> property.
     *
     * @return the current value of <code> jointRatePercFirstAirline </code>
     */

    public Integer getJointRatePercFirstAirline() {
        return this.jointRatePercFirstAirline;
    }

    /**
     * Gets the <code>jointRatePercSecondAirline</code> property.
     *
     * @return the current value of <code> jointRatePercSecondAirline </code>
     */
    public Integer getJointRatePercSecondAirline() {
        return this.jointRatePercSecondAirline;
    }

    /**
     * Gets the <code>jointRatePercThirdAirline</code> property.
     *
     * @return the current value of <code> jointRatePercThirdAirline </code>
     */

    public Integer getJointRatePercThirdAirline() {
        return this.jointRatePercThirdAirline;
    }

    /**
     * Gets the <code>netNetIndicator</code> property.
     *
     * @return the current value of <code> netNetIndicator </code>
     */

    public boolean getNetNetIndicator() {
        return this.netNetIndicator;
    }

    /**
     * Gets the <code>oId</code> property.
     *
     * @return the current value of <code> oId </code>
     */
    public Long getoId() {
        return this.oId;
    }

    /**
     * Gets the <code>oId</code> property.
     *
     * @return the current value of <code> oId </code>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>overPivotCharge</code> property.
     * <p>
     *
     * @return the current value of the <code>overPivotCharge</code> property.
     */
    public BigDecimal getOverPivotCharge() {
        return this.overPivotCharge;
    }

    /**
     * Gets the <code>overPivotRate</code> property.
     * <p>
     *
     * @return the current value of the <code>overPivotRate</code> property.
     */
    public BigDecimal getOverPivotRate() {
        return this.overPivotRate;
    }

    /**
     * Gets the <code>overPivotWeight</code> property.
     * <p>
     *
     * @return the current value of the <code>overPivotWeight</code> property.
     */
    public BigDecimal getOverPivotWeight() {
        return this.overPivotWeight;
    }

    /**
     * Gets the <code>owner</code> property.
     *
     * @return the current value of <code> owner </code>
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * Gets the <code>pieceDisplay</code> property.
     *
     * @return the current value of <code> pieceDisplay </code>
     *
     */
    public String getPieceDisplay() {

        if (this.ratePieces != null && this.uldPosition == null) {
            pieceDisplay = String.valueOf(this.ratePieces);
        }
        else if(this.ratePieces != null && this.uldPosition != null) {
        	pieceDisplay = String.valueOf(this.ratePieces)+FrameworkConstants.FORWARD_SLASH+this.uldPosition;
        }
        else {
            pieceDisplay = this.rcp;
        }
        return this.pieceDisplay;
    }

    /**
     * Gets the <code>Pieces</code> property.
     *
     * @return the current value of <code> pieces </code>
     */
    public Integer getPieces() {
        return this.Pieces;
    }

    /**
     * Gets the <code>rate</code> property.
     *
     * @return the current value of <code> rate </code>
     */

    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Gets the <code>rateA</code> property.
     *
     * @return the current value of <code> rateA </code>
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
     * @return the current value of <code> rateCharge </code>
     */

    public BigDecimal getRateCharge() {
        return this.rateCharge;
    }

    /**
     * Gets the <code>rateClassQualifier</code> property.
     *
     * @return the current value of <code> rateClassQualifier </code>
     */

    public String getRateClassQualifier() {
        return this.rateClassQualifier;
    }

    /**
     * Gets the <code>rateClassType</code> property.
     *
     * @return the current value of <code> rateClassType </code>
     */
    public RateClassType getRateClassType() {
        return this.rateClassType;
    }

    public String getRateClassDisplay(){
        /*rateClassDisplay="";
        if(this.rateClassQualifier!=null){
            rateClassDisplay = rateClassDisplay.concat(this.rateClassQualifier);
        }
        if(this.rateClassType != null){
            rateClassDisplay = rateClassDisplay.concat(this.rateClassType.toString());
        }*/
        return rateClassDisplay;
    }

    public void setRateClassDisplay(final String pRateClassDisplay){
        if(pRateClassDisplay!=null){
            if(pRateClassDisplay.length()>1){
                String aFirstChar = pRateClassDisplay.substring(0,1);
                String aSecondChar = pRateClassDisplay.substring(1);
                RateClassType aRateClassType=RateClassType.getRateClassFromName(aFirstChar);
                if(aRateClassType != null){
                    this.rateClassQualifier = aSecondChar;
                    this.rateClassType = aRateClassType;
                }else{
                    aRateClassType = RateClassType.getRateClassFromName(aSecondChar);
                     if(aRateClassType!=null){
                         this.rateClassQualifier = aFirstChar;
                         this.rateClassType = aRateClassType;
                     }else{
                         this.rateClassQualifier = pRateClassDisplay;
                     }
                }
            }else{
                this.rateClassType = RateClassType.getRateClassFromName(pRateClassDisplay);
            }
        }else{
            this.rateClassQualifier = null;
            this.rateClassType = null;
        }
        this.rateClassDisplay = pRateClassDisplay;
    }

    /**
     * Gets the <code>rateClassTypeA</code> property.
     *
     * @return the current value of <code> rateClassTypeA </code>
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
     * @return the current value of <code> rateClassTypeF </code>
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
     * @return the current value of <code> rateClassTypeP </code>
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
     * @return the current value of <code> rateDiscriminator </code>
     */

    public RateDiscriminatorType getRateDiscriminator() {
        return this.rateDiscriminator;
    }

    /**
     * Gets the <code>rateF</code> property.
     *
     * @return the current value of <code> rateF </code>
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
     * @return the current value of <code> rateGenerationType </code>
     */
    public RateGenerationType getRateGenerationType() {
        return this.rateGenerationType;
    }

    /**
     * Gets the <code>rateLineNumber</code> property.
     *
     * @return the current value of <code> rateLineNumber </code>
     */
    public int getRateLineNumber() {
        return this.rateLineNumber;
    }

    /**
     * Gets the <code>rateNote</code> property.
     *
     * @return the current value of <code> rateNote </code>
     */

    public String getRateNote() {
        return this.rateNote;
    }

    /**
     * Gets the <code>rateP</code> property.
     *
     * @return the current value of <code> rateP </code>
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
     * @return the current value of <code> ratePercentage </code>
     */

    public Integer getRatePercentage() {
        return this.ratePercentage;
    }

    /**
     * Gets the <code>ratePerKilo</code> property.
     *
     * @return the current value of <code> ratePerKilo </code>
     */
    public BigDecimal getRatePerKilo() {
        return this.ratePerKilo;
    }

    /**
     * Gets the <code>ratePieces</code> property.
     *
     * @return the current value of <code> ratePieces </code>
     */
    public String getRatePieces() {
        return this.ratePieces;
    }

    /**
     * Gets the <code>rateRCPIndicator</code> property.
     *
     * @return the current value of <code> rateRCPIndicator </code>
     */
    public boolean getRateRCPIndicator() {
        return this.rateRCPIndicator;
    }

    /**
     * Gets the <code>rateRCPNumber</code> property.
     *
     * @return the current value of the <code>rateRCPNumber</code> property.<br>
     */
    public int getRateRCPNumber() {
        return this.rateRCPNumber;
    }

    /**
     * Gets the <code>rateReduction</code> property.
     *
     * @return the current value of <code> rateReduction </code>
     */

    public String getRateReduction() {
        return this.rateReduction;
    }

    /**
     * Gets the <code>rateSource</code> property.
     *
     * @return the current value of <code> rateSource </code>
     */

    public String getRateSource() {
        return this.rateSource;
    }

    /**
     * Gets the <code>rateType</code> property.
     *
     * @return the current value of <code> rateType </code>
     */

    public String getRateType() {
        return this.rateType;
    }

    /**
     * Gets the <code>ratingLineDescription</code> property.
     *
     * @return the current value of <code> ratingLineDescription </code>
     */

    public String getRatingLineDescription() {
        return this.ratingLineDescription;
    }

    /**
     * Gets the <code>rcp</code> property.
     *
     * @return the current value of <code> rcp </code>
     *
     */
    public String getRcp() {
        return this.rcp;
    }

    /**
     * Gets the <code>shipmentDimensions</code> property.
     *
     * @return the shipmentDimensions
     */
    public List<ShipmentDimensionDto> getShipmentDimensions() {
        if (this.shipmentDimensions == null) {
            this.shipmentDimensions = new ArrayList<ShipmentDimensionDto>();
        }
        return this.shipmentDimensions;
    }

    /**
     * Gets the <code>Slac</code> property.
     *
     * @return the Slac
     */
    public Integer getSlac() {
        return this.Slac;
    }

    /**
     * Gets the <code>specialRemarks</code> property.
     *
     * @return the specialRemarks
     */
    public List<RatingSpecialRemarksDto> getSpecialRemarks() {
        if (this.specialRemarks == null) {
            this.specialRemarks = new ArrayList<RatingSpecialRemarksDto>();
        }
        return this.specialRemarks;
    }

    /**
     * Gets the <code>spotRateNumber</code> property.
     *
     * @return the current value of <code> spotRateNumber </code>
     */

    public String getSpotRateNumber() {
        return this.spotRateNumber;
    }

    /**
     * Gets the <code>tareWeight</code> property.
     *
     * @return the current value of <code> tareWeight </code>
     */
    public BigDecimal getTareWeight() {
        return this.tareWeight;
    }

    /**
     * Gets the <code>totalWeightCharge</code> property.
     *
     * @return the current value of <code> totalWeightCharge </code>
     */

    public BigDecimal getTotalWeightCharge() {
        return this.totalWeightCharge;
    }

    /**
     * Gets the <code>uldDiscountCharge</code> property.
     *
     * @return the current value of <code> uldDiscountCharge </code>
     */

    public BigDecimal getUldDiscountCharge() {
        return this.uldDiscountCharge;
    }

    /**
     * Gets the <code>uldDiscount</code> property.
     *
     * @return the current value of <code> uldDiscount </code>
     */

    public BigDecimal getUldDiscount() {
        return this.uldDiscount;
    }

    /**
     * Gets the <code>uldType</code> property.
     *
     * @return the current value of <code> uldType </code>
     */

    public String getUldType() {
        return this.uldType;
    }

    /**
     * Gets the <code>RLGI</code> property.
     * <p>
     *
     * @return the current value of the <code>RLGI</code> property.
     */

    public boolean isRLGI() {
        return this.rlgi;
    }

    /**
     * @return the serviceLineIndicator
     */
    public boolean isServiceLineIndicator() {
        return this.serviceLineIndicator;
    }

    /**
     * Gets the <code>airwaybillOId</code> property.
     *
     * @return the current value of <code> airwaybillOId </code>
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
     * @param current
     *            value of <code>pChargeableWeightA</code>
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
     * @param current
     *            value of <code>pChargeableWeightF</code>
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
     * @param current
     *            value of <code>pChargeableWeightP</code>
     */

    public void setChargeableWeightP(final BigDecimal pChargeableWeightP) {
        this.chargeableWeightP = pChargeableWeightP;
    }

    /**
     * Sets the <code>classRatingId</code> property.
     * <p>
     *
     * the new value of the <code>classRatingId</code> property.
     */
    public void setClassRatingId(final String pClassRatingId) {
        this.classRatingId = ContractUtility.convertToUpperCase(pClassRatingId);
    }

    /**
     * Sets the <code>commodityNumber</code> property.
     * <p>
     *
     * the new value of the <code>commodityNumber</code> property.
     */
    public void setCommodityNumber(final String pCommodityNumber) {
        this.commodityNumber = ContractUtility
                    .convertToUpperCase(pCommodityNumber);
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
     * Sets the <code>Description</code> property.
     * <p>
     *
     * the new value of the <code>Description</code> property.
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the <code>localPackageDescription</code> property.
     * <p>
     *
     * the new value of the <code>localPackageDescription</code> property.
     */
    public void setLocalPackageDescription(final String pLocalPackageDescription) {
        this.localPackageDescription = pLocalPackageDescription;
    }

    /**
     * @param discountWeight
     *            the discountWeight to set
     */
    public void setDiscountWeight(final BigDecimal pDiscountWeight) {
        this.discountWeight = pDiscountWeight;
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

    /**
     * Sets the <code>jointRatePercFirstAirline</code> property.
     * <p>
     *
     * the new value of the <code>jointRatePercFirstAirline</code> property.
     */

    public void setJointRatePercFirstAirline(
                final Integer pJointRatePercFirstAirline) {
        this.jointRatePercFirstAirline = pJointRatePercFirstAirline;
    }

    /**
     * Sets the <code>jointRatePercSecondAirline</code> property.
     * <p>
     *
     * the new value of the <code>jointRatePercSecondAirline</code> property.
     */

    public void setJointRatePercSecondAirline(
                final Integer pJointRatePercSecondAirline) {
        this.jointRatePercSecondAirline = pJointRatePercSecondAirline;
    }

    /**
     * Sets the <code>jointRatePercThirdAirline</code> property.
     * <p>
     *
     * the new value of the <code>jointRatePercThirdAirline</code> property.
     */

    public void setJointRatePercThirdAirline(
                final Integer pJointRatePercThirdAirline) {
        this.jointRatePercThirdAirline = pJointRatePercThirdAirline;
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

    /**
     * Sets the <code>oId</code> property.
     * <p>
     *
     * the new value of the <code>oId</code> property.
     */

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>overPivotCharge</code> property.
     * <p>
     *
     * @param pOverPivotCharge
     *            the current value of the <code>overPivotCharge</code> property.<br>
     */
    public void setOverPivotCharge(final BigDecimal pOverPivotCharge) {
        this.overPivotCharge = pOverPivotCharge;
    }

    /**
     * Sets the <code>overPivotRate</code> property.
     * <p>
     *
     * @param pOverPivotRate
     *            the current value of the <code>overPivotRate</code> property.<br>
     */
    public void setOverPivotRate(final BigDecimal pOverPivotRate) {
        this.overPivotRate = pOverPivotRate;
    }

    /**
     * Sets the <code>overPivotWeight</code> property.
     * <p>
     *
     * @param pOverPivotWeight
     *            the current value of the <code>overPivotWeight</code> property.<br>
     */
    public void setOverPivotWeight(final BigDecimal pOverPivotWeight) {
        this.overPivotWeight = pOverPivotWeight;
    }

    /**
     * Sets the <code>owner</code> property.
     * <p>
     *
     * the new value of the <code>owner</code> property.
     */

    public void setOwner(final String pOwner) {
        this.owner = pOwner;
    }

    /**
     * Sets the <code>pieceDisplay</code> property.
     * <p>
     *
     * the new value of the <code>pieceDisplay</code> property.
     */
    public void setPieceDisplay(String pPieceDisplay) {
        if (pPieceDisplay != null && ContractUtility.isNumber(pPieceDisplay)) {
            this.setRatePieces(pPieceDisplay);
            this.setRcp(null);
            this.setRateRCPIndicator(false);
            this.pieceDisplay = pPieceDisplay;
            this.setUldPosition(null);
		} else {
			if (pPieceDisplay != null && pPieceDisplay.contains(FrameworkConstants.FORWARD_SLASH)) {
				String[] pieces = pPieceDisplay.split(FrameworkConstants.FORWARD_SLASH);
				this.setRatePieces(pieces[0]);
				this.setUldPosition(Integer.parseInt(pieces[1]));
			} else {
				this.setRatePieces(null);
				this.setRcp(pPieceDisplay);
				this.setRateRCPIndicator(true);
				this.pieceDisplay = pPieceDisplay;
			}
		}
	}

    /**
     * Sets the <code>owner</code> property.
     * <p>
     *
     * the new value of the <code>owner</code> property.
     */
    public void setPieces(final Integer pPieces) {
        this.Pieces = pPieces;
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
     * Sets the <code>rateA</code> property.
     * <p>
     *
     * the new value of the <code>rateA</code> property.
     */

    public void setRateA(final BigDecimal pRateA) {
        this.rateA = pRateA;
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
     * Sets the <code>rateClassQualifier</code> property.
     * <p>
     *
     * the new value of the <code>rateClassQualifier</code> property.
     */

    public void setRateClassQualifier(final String pRateClassQualifier) {
        this.rateClassQualifier = ContractUtility
                    .convertToUpperCase(pRateClassQualifier);
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

    /**
     * Sets the <code>rateClassTypeA</code> property.
     * <p>
     *
     * the new value of the <code>rateClassTypeA</code> property.
     */

    public void setRateClassTypeA(final RateClassType pRateClassTypeA) {
        this.rateClassTypeA = pRateClassTypeA;
    }

    /**
     * Sets the <code>rateClassTypeF</code> property.
     * <p>
     *
     * the new value of the <code>rateClassTypeF</code> property.
     */

    public void setRateClassTypeF(final RateClassType pRateClassTypeF) {
        this.rateClassTypeF = pRateClassTypeF;
    }

    /**
     * Sets the <code>rateClassTypeP</code> property.
     * <p>
     *
     * the new value of the <code>rateClassTypeP</code> property.
     */

    public void setRateClassTypeP(final RateClassType pRateClassTypeP) {
        this.rateClassTypeP = pRateClassTypeP;
    }

    /**
     * Sets the <code>rateDiscriminator</code> property.
     * <p>
     *
     * the new value of the <code>rateDiscriminator</code> property.
     */

    public void setRateDiscriminator(
                final RateDiscriminatorType pRateDiscriminator) {
        this.rateDiscriminator = pRateDiscriminator;
    }

    /**
     * Sets the <code>rateF</code> property.
     * <p>
     *
     * the new value of the <code>rateF</code> property.
     */

    public void setRateF(final BigDecimal pRateF) {
        this.rateF = pRateF;
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
     * Sets the <code>rateLineNumber</code> property.
     *
     * @param pRateLineNumber
     *            the current value of the <code>rateLineNumber</code> property.
     */
    public void setRateLineNumber(final int pRateLineNumber) {
        this.rateLineNumber = pRateLineNumber;
    }

    /**
     * Sets the <code>rateNote</code> property.
     * <p>
     *
     * the new value of the <code>rateNote</code> property.
     */

    public void setRateNote(final String pRateNote) {
        this.rateNote = ContractUtility.convertToUpperCase(pRateNote);
    }

    /**
     * Sets the <code>rateP</code> property.
     * <p>
     *
     * the new value of the <code>rateP</code> property.
     */

    public void setRateP(final BigDecimal pRateP) {
        this.rateP = pRateP;
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
     * Sets the <code>ratePerKilo</code> property.
     *
     * @param pRatePerKilo
     *            the current value of the <code>ratePerKilo</code> property.
     */
    public void setRatePerKilo(final BigDecimal pRatePerKilo) {
        this.ratePerKilo = pRatePerKilo;
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
     * Sets the <code>rateRCPNumber</code> property.
     * <p>
     *
     * @param pRateRCPNumber
     *            the new value of the <code>rateRCPNumber</code> property.
     */
    public void setRateRCPNumber(final int pRateRCPNumber) {
        this.rateRCPNumber = pRateRCPNumber;
    }

    /**
     * Sets the <code>rateReduction</code> property.
     * <p>
     *
     * the new value of the <code>rateReduction</code> property.
     */

    public void setRateReduction(final String pRateReduction) {
        this.rateReduction = ContractUtility.convertToUpperCase(pRateReduction);
    }

    /**
     * Sets the <code>rateSource</code> property.
     * <p>
     *
     * the new value of the <code>rateSource</code> property.
     */
    public void setRateSource(final String pRateSource) {
        this.rateSource = ContractUtility.convertToUpperCase(pRateSource);
    }

    /**
     * Sets the <code>rateType</code> property.
     * <p>
     *
     * the new value of the <code>rateType</code> property.
     */
    public void setRateType(final String pRateType) {
        this.rateType = ContractUtility.convertToUpperCase(pRateType);
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
     * Sets the <code>rcp</code> property.
     * <p>
     *
     * the new value of the <code>rcp</code> property.
     */
    public void setRcp(final String pRcp) {
        this.rcp = ContractUtility.convertToUpperCase(pRcp);
    }

    /**
     * Sets the <code>RLGI</code> property.
     * <p>
     *
     * @param pRLGI
     *            holds the new value of <code>RLGI</code>.<br>
     */
    public void setRlgi(final boolean pRLGI) {
        this.rlgi = pRLGI;
    }

    /**
     * @param pServiceLineIndicator
     *            the serviceLineIndicator to set
     */
    public void setServiceLineIndicator(final boolean pServiceLineIndicator) {
        this.serviceLineIndicator = pServiceLineIndicator;
    }

    /**
     * Sets the <code>shipmentDimensions</code> property.
     *
     * @param shipmentDimensions
     *            the shipmentDimensions to set
     */
    public void setShipmentDimensions(
                final List<ShipmentDimensionDto> pShipmentDimensions) {
        this.shipmentDimensions = pShipmentDimensions;
    }

    /**
     * Sets the <code>Slac</code> property.
     *
     * @param pSlac
     *            the Slac to set
     */
    public void setSlac(final Integer pSlac) {
        this.Slac = pSlac;
    }

    /**
     * Sets the <code>specialRemarks</code> property.
     *
     * @param pSpecialRemarks
     *            the specialRemarks to set
     */
    public void setSpecialRemarks(
                final List<RatingSpecialRemarksDto> pSpecialRemarks) {
        this.specialRemarks = pSpecialRemarks;
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
     * Sets the <code>tareWeight</code> property.
     *
     * @param pTareWeight
     *            the tareWeight to set
     */
    public void setTareWeight(final BigDecimal pTareWeight) {
        this.tareWeight = pTareWeight;
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
     * Sets the <code>uldDiscount</code> property.
     * <p>
     *
     * the new value of the <code>uldDiscount</code> property.
     */
    public void setUldDiscount(final BigDecimal pUldDiscount) {
        this.uldDiscount = pUldDiscount;
    }

    /**
     * Sets the <code>uldDiscountCharge</code> property.
     * <p>
     *
     * the new value of the <code>uldDiscountCharge</code> property.
     */
    public void setUldDiscountCharge(final BigDecimal pUldDiscountCharge) {
        this.uldDiscountCharge = pUldDiscountCharge;
    }

    /**
     * Sets the <code>uldType</code> property.
     * <p>
     *
     * the new value of the <code>uldType</code> property.
     */
    public void setUldType(final String pUldType) {
        this.uldType = ContractUtility.convertToUpperCase(pUldType);
    }

    /**
     * Gets the <code>isULDRatingLineBased</code> property.
     *
     * @return the current value of the <code>isULDRatingLineBased</code> property.
     */
    public boolean isUldRatingLineBased() {
        return this.uldRatingLineBased;
    }

    /**
     * Sets the <code>isULDRatingLineBased</code> property.
     *
     * @param pIsULDRatingLineBased
     *            the isULDRatingLineBased to set
     */
    public void setUldRatingLineBased(final boolean pIsULDRatingLineBased) {
        this.uldRatingLineBased = pIsULDRatingLineBased;
    }

    public String getChkDimension() {
        return chkDimension;
    }

    public void setChkDimension(final String pChkDimension) {
        this.chkDimension = pChkDimension;
    }

    /**
     * @return the specialRemarksFlagF
     */
    public boolean getSpecialRemarksFlagF() {
        return specialRemarksFlagF;
    }

    /**
     * @param specialRemarksFlagF the specialRemarksFlagF to set
     */
    public void setSpecialRemarksFlagF(boolean specialRemarksFlagF) {
        this.specialRemarksFlagF = specialRemarksFlagF;
    }

    /**
     * @return the specialRemarksFlagP
     */
    public boolean getSpecialRemarksFlagP() {
        return specialRemarksFlagP;
    }

    /**
     * @param specialRemarksFlagP the specialRemarksFlagP to set
     */
    public void setSpecialRemarksFlagP(boolean specialRemarksFlagP) {
        this.specialRemarksFlagP = specialRemarksFlagP;
    }

    /**
     * @return the specialRemarksFlagA
     */
    public boolean getSpecialRemarksFlagA() {
        return specialRemarksFlagA;
    }

    /**
     * @param specialRemarksFlagA the specialRemarksFlagA to set
     */
    public void setSpecialRemarksFlagA(boolean specialRemarksFlagA) {
        this.specialRemarksFlagA = specialRemarksFlagA;
    }

    /**
     * @return the manualChargeableWeight
     */
    public BigDecimal getManualChargeableWeight() {
        return manualChargeableWeight;
    }

    /**
     * @param manualChargeableWeight the manualChargeableWeight to set
     */
    public void setManualChargeableWeight(BigDecimal manualChargeableWeight) {
        this.manualChargeableWeight = manualChargeableWeight;
    }

	/**
	 * @return the uldPosition
	 */
	public Integer getUldPosition() {
		return uldPosition;
	}

	/**
	 * @param uldPosition the uldPosition to set
	 */
	public void setUldPosition(Integer uldPosition) {
		this.uldPosition = uldPosition;
	}

	// FIS136P2 start
	@Override
	public int hashCode() {
		int hash = 3;
		hash = 53 * hash
				+ (this.grossWeight != null ? this.grossWeight.hashCode() : 0);
		hash = 53 * hash + (this.pieceDisplay != null ? this.pieceDisplay.hashCode() : 0);
		hash = 53 * hash
				+ (this.ratingLineDescription != null ? this.ratingLineDescription.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(final Object pRatingLineEntryDto) {
		RatingLineEntryDto obj = (RatingLineEntryDto) pRatingLineEntryDto;
		if (obj != null && this.grossWeight != null
				&& this.ratingLineDescription != null
				&& this.pieceDisplay != null)
			return this.grossWeight.equals(obj.getGrossWeight()) ? (this.pieceDisplay
					.equals(obj.getPieceDisplay()) ? this.ratingLineDescription
					.equals(obj.getRatingLineDescription()) : false) : false;
		return false;
	}
	// FIS136P2 end
}
