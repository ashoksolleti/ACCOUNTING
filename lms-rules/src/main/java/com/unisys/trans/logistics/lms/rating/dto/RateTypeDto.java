/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <code>RateTypeDto</code> holds all the attributes that are associated to a rate type class.<br>
 * It contains detail information about Rate Type. Rate type is a logical grouping of rate classes of
 * different rate sources.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>description
 * <li>displayPriority
 * <li>endDate
 * <li>maximumChargeableWeight
 * <li>maximumGrossWeight
 * <li>oId
 * <li>rateTypeCode
 * <li>rateTypeProductCodes
 * <li>rateTypeRateClasses
 * <li>typeOfRating
 * <li>useGrossWeightIndicator
 * <li>weightUOM
 * </code>
 * </ul>
 */
public class RateTypeDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2783971325881913025L;

    /**
     * Attribute to hold <code>description</code> property.
     * <p>
     * Rate Type Description describes Rate Type. Mandatory. Maximum 20 characters alphanumeric.
     */
    private String description;

    /**
     * Attribute to hold <code>displayPriority</code> property.
     * <p>
     * Priority with which rates for this rate type must be initially displayed in the Rate and Quote
     * Information functionality. Display Priority must be unique across all rate types. (BR5) Rates must be
     * displayed based on rate priority first. Rates for rate types that do not have a display priority must
     * be displayed last in alphabetical order. Optional. Maximum 3 characters numeric data.
     */
    private Integer displayPriority;

    /**
     * Attribute to hold <code>endDate</code> property.
     * <p>
     * Date that rates using this rate type must be end-dated with. The end date for the rate type must be
     * today’s date or later.(BR3). End date is mandatory when deleting a rate type.
     */
    private Date endDate;

    /**
     * Attribute to hold <code>maximumChargeableWeight</code> property.
     * <p>
     * The maximum chargeable weight allowed for rates defined using this rate type. In pricing, a rate type
     * must not be considered for rating if the rating line chargeable weight is greater than this value.
     * Note: When the rate type is a RATE PER PIECE type, the chargeable weight must be divided by the number
     * of pieces before the comparison is made. Optional.
     */
    private BigDecimal maximumChargeableWeight;

    /**
     * Attribute to hold <code>maximumGrossWeight</code> property.
     * <p>
     * The maximum gross weight allowed for rates defined using this rate type. In pricing, a rate type must
     * not considered for rating if the rating line gross weight is greater than this value. Note: When the
     * rate type is a RATE PER PIECE type, the gross weight must be divided by the number of pieces before the
     * comparison is made. Optional.
     */
    private BigDecimal maximumGrossWeight;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique Key for Rate Type.
     */
    private Long oId;

    /**
     * Attribute to hold <code>rateTypeCode</code> property.
     * <p>
     * Rate Type Code for the consignment. Rate type code must be unique. Mandatory. Length 3 characters.
     */
    private String rateTypeCode;

    /**
     * Attribute to hold <code>rateTypePercentageDtos</code> property.
     * <p>
     * Holds the values of rateTypePercentageDtos.
     */
    private List<RateTypePercentageDto> rateTypePercentageDtos;

    /**
     * Attribute to hold <code>rateTypeProductCodes</code> property.
     * <p>
     * List of Product Codes for which rates with this rate type are valid. It must be used in conjunction
     * with product code of the rate source. Occurs 1-50 times. Mandatory.
     */
    private List<RateTypeProductCodeDto> rateTypeProductCodes;

    /**
     * Attribute to hold <code>rateTypeRateClasses</code> property.
     * <p>
     * List of Rate Classes associated with the Rate Type. Each Rate Type can have 0 - 26 Rate Classes of IATA
     * and ATPCO Type associated with it. At least one Rate Class of IATA or ATPCO is required. Mandatory.
     */
    private List<RateTypeRateClassDto> rateTypeRateClasses;

    /**
     * Attribute to hold <code>typeOfRating</code> property.
     * <p>
     * The type of Rating for Rate Type. Mandatory.
     * <p>
     * 
     * <pre>
     * <ul>
     * Possible values are:
     * <li>
     * Standard(S)
     * <li>
     * Bulk Over Pivot (B)
     * <li>
     * Rate Per Piece (R)
     * </ul>
     * </pre>
     * <p>
     * Standard type must consider per unit rate except for rates with a rate class of U or rates with a
     * minimum weight of zero. Bulk Over Pivot rates are considered for general commodity and/or specific
     * commodity goods (rate class Q or C) where the rate is a flat rate with an optional per unit over pivot
     * portion. Without an over pivot portion, the rate is valid for shipments that weigh at most the rate’s
     * chargeable weight. Rate Per Piece rates are considered for flat rates with no over pivot portion. The
     * charge is considered for a single piece. Shipments of more than one piece are charged at the single
     * rate multiplied by the number of piece.
     */
    private RatingType typeOfRating;

    /**
     * Attribute to hold <code>useGrossWeightIndicator</code> property.
     * <p>
     * When this field is set to true, the chargeable weight must be ignored for the purposes of selecting and
     * applying the rate to use for the rating line. The gross weight of the shipment must be used instead.
     * Mandatory.
     */
    private boolean useGrossWeightIndicator;

    /**
     * Attribute to hold <code>weightUOM</code> property.
     * <p>
     * The unit of weight of an air waybill.
     * <p>
     * <b>Possible values : </b><br>
     * <ul>
     * <li>KG - Kilogram.
     * <li>LB - Pound.
     * </ul>
     */
    private WeightUOMType weightUOM;

    /**
     * Gets the <code>description</code> property.
     * <p>
     * Rate Type Description which describes Rate Type.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Character set of all types including alphabets, numbers, hyphen, space, dot and any other special
     * characters.<br>
     * <p>
     * <b>Example: </b><br>
     * Special Rate
     * <p>
     * 
     * @return the current value of <code>description</code> property.<br>
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>description</code> property.
     * <p>
     * Display Priority with which rates for this rate type must be initially displayed in the Rate and Quote
     * Information functionality.
     * <p>
     * <b>Range: </b><br>
     * 0-999<br>
     * <p>
     * 
     * @return the current value of <code>displayPriority</code> property.<br>
     */
    public Integer getDisplayPriority() {
        return this.displayPriority;
    }

    /**
     * Gets the <code>endDate</code> property.
     * <p>
     * End Date up to which the rate types are effective and applicable.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @return the current value of <code>endDate</code> property.<br>
     */
    public Date getEndDate() {
        return ContractUtility.getClonedDate(this.endDate);
    }

    /**
     * Gets the <code>maximumChargeableWeight</code> property.
     * <p>
     * Maximum Chargeable Weight allowed for rates defined using this rate type.
     * <p>
     * 
     * @return the current value of <code>maximumChargeableWeight</code> property.<br>
     */
    public BigDecimal getMaximumChargeableWeight() {
        return this.maximumChargeableWeight;
    }

    /**
     * Gets the <code>maximumGrossWeight</code> property.
     * <p>
     * Maximum Gross Weight allowed for rates defined using this rate type.
     * <p>
     * 
     * @return the current value of <code>maximumGrossWeight</code> property.<br>
     */
    public BigDecimal getMaximumGrossWeight() {
        return this.maximumGrossWeight;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>rateTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @return the current value of <code>rateTypeCode</code> property.<br>
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Gets the <code>rateTypePercentageDtos</code> property.
     * <p>
     * List of Rate type percentages associated with the Rate Type. It is a list that can have 0 - * Rate type
     * percentages.
     * <p>
     * 
     * @return the current value of <code>rateTypePercentages</code> property.<br>
     */
    public List<RateTypePercentageDto> getRateTypePercentageDtos() {
        if (this.rateTypePercentageDtos == null) {
            this.rateTypePercentageDtos = new ArrayList<RateTypePercentageDto>();
        }
        return this.rateTypePercentageDtos;
    }

    /**
     * Gets the <code>rateTypeProductCodes</code> property.
     * <p>
     * List of Product Codes for which rates with this rate type are valid.
     * <p>
     * 
     * @return the current value of <code>rateTypeProductCodes</code> property.<br>
     */
    public List<RateTypeProductCodeDto> getRateTypeProductCodes() {
        return this.rateTypeProductCodes;
    }

    /**
     * Gets the <code>rateTypeRateClasses</code> property.
     * <p>
     * List of Rate Classes associated with the Rate Type. It is a list that can have 0 - 26 Rate Classes of
     * IATA and ATPCO Type associated with it.
     * <p>
     * 
     * @return the current value of <code>rateTypeRateClasses</code> property.<br>
     */
    public List<RateTypeRateClassDto> getRateTypeRateClasses() {
        return this.rateTypeRateClasses;
    }

    /**
     * Gets the <code>typeOfRating</code> property.
     * <p>
     * Type Of rating.<br>
     * There are following types of Rating:
     * <ul>
     * <li>Standard (S)
     * <li>Bulk Over Pivot (B)
     * <li>Rate Per Piece (R)
     * </ul>
     * Standard type must consider per unit rate except for rates with a rate class of U or rates with a
     * minimum weight of zero.<br>
     * Bulk Over Pivot rates are considered for general commodity and/or specific commodity goods(rate class Q
     * or C) where the rate is a flat rate with an optional per unit over pivot portion. Without an over pivot
     * portion, the rate is valid for shipments that weigh at most the rate’s chargeable weight.<br>
     * Rate Per Piece rates are considered for flat rates with no over pivot portion. The charge is considered
     * for a single piece. Shipments of more than one piece are charged at the single rate multiplied by the
     * number of piece.
     * <p>
     * 
     * @return the current value of <code>typeOfRating</code> property.<br>
     */
    public RatingType getTypeOfRating() {
        return this.typeOfRating;
    }

    /**
     * Gets the <code>useGrossWeightIndicator</code> property.
     * <p>
     * Use Gross Weight Indicator which decides whether to use gross weight or chargeable weight for the
     * purposes of selecting and applying the rate.
     * <p>
     * 
     * @return the current value of <code>useGrossWeightIndicator</code> property.<br>
     */
    public boolean getUseGrossWeightIndicator() {
        return this.useGrossWeightIndicator;
    }

    /**
     * Gets the <code>weightUOM</code> property.
     * <p>
     * The unit of weight used to measure weight.
     * <p>
     * 
     * @return the current value of the <code>weightUOM</code> property.<br>
     */
    public WeightUOMType getWeightUOM() {
        return this.weightUOM;
    }

    /**
     * Sets the <code>description</code> property.
     * <p>
     * Rate Type Description which describes Rate Type.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Character set of all types including alphabets, numbers, hyphen, space, dot and any other special
     * characters.<br>
     * <p>
     * <b>Example: </b><br>
     * Special Rate
     * <p>
     * 
     * @param pDescription the new value of the <code>description</code> property.
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the <code>displayPriority</code> property.
     * <p>
     * Display Priority with which rates for this rate type must be initially displayed in the Rate and Quote
     * Information functionality.
     * <p>
     * <b>Range: </b><br>
     * 0-999<br>
     * <p>
     * 
     * @param pDisplayPriority the new value of the <code>displayPriority</code> property.
     */
    public void setDisplayPriority(final Integer pDisplayPriority) {
        this.displayPriority = pDisplayPriority;
    }

    /**
     * Sets the <code>endDate</code> property.
     * <p>
     * End Date up to which the rate types are effective and applicable.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @param pEndDate the new value of <code>endDate</code> property.<br>
     */
    public void setEndDate(final Date pEndDate) {
        this.endDate = ContractUtility.getClonedDate(pEndDate);
    }

    /**
     * Sets the <code>maximumChargeableWeight</code> property.
     * <p>
     * Maximum Chargeable Weight allowed for rates defined using this rate type.
     * <p>
     * 
     * @param pMaximumChargeableWeight the new value of <code>maximumChargeableWeight</code> property.<br>
     */
    public void setMaximumChargeableWeight(final BigDecimal pMaximumChargeableWeight) {
        this.maximumChargeableWeight = pMaximumChargeableWeight;
    }

    /**
     * Sets the <code>maximumGrossWeight</code> property.
     * <p>
     * Maximum Gross Weight allowed for rates defined using this rate type.
     * <p>
     * 
     * @param pMaximumGrossWeight the new value of <code>maximumGrossWeight</code> property.<br>
     */
    public void setMaximumGrossWeight(final BigDecimal pMaximumGrossWeight) {
        this.maximumGrossWeight = pMaximumGrossWeight;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>rateTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @param pRateTypeCode the new value of <code>rateTypeCode</code> property.<br>
     */
    public void setRateTypeCode(final String pRateTypeCode) {
        this.rateTypeCode = ContractUtility.convertToUpperCase(pRateTypeCode);
    }

    /**
     * Sets the <code>rateTypePercentageDtos</code> property.
     * <p>
     * List of Rate type percentages associated with the Rate Type. It is a list that can have 0 - * Rate type
     * percentages.
     * <p>
     * 
     * @param pRateTypePercentageDtos
     *            the new value of <code>rateTypePercentages</code> property.<br>
     */
    public void setRateTypePercentageDtos(final List<RateTypePercentageDto> pRateTypePercentageDtos) {
        this.rateTypePercentageDtos = pRateTypePercentageDtos;
    }

    /**
     * Sets the <code>rateTypeProductCodes</code> property.
     * <p>
     * List of Product Codes for which rates with this rate type are valid.
     * <p>
     * 
     * @param pRateTypeProductCodes the new value of <code>rateTypeProductCodes</code> property.<br>
     */
    public void setRateTypeProductCodes(final List<RateTypeProductCodeDto> pRateTypeProductCodes) {
        this.rateTypeProductCodes = pRateTypeProductCodes;
    }

    /**
     * Sets the <code>rateTypeRateClasses</code> property.
     * <p>
     * List of Rate Classes associated with the Rate Type. It is a list that can have 0 - 26 Rate Classes of
     * IATA and ATPCO Type associated with it.
     * <p>
     * 
     * @param pRateTypeRateClasses the new value of <code>rateTypeRateClasses</code> property.<br>
     */
    public void setRateTypeRateClasses(final List<RateTypeRateClassDto> pRateTypeRateClasses) {
        this.rateTypeRateClasses = pRateTypeRateClasses;
    }

    /**
     * Sets the <code>typeOfRating</code> property.
     * <p>
     * Type Of rating.<br>
     * There are following types of Rating:
     * <ul>
     * <li>Standard (S)
     * <li>Bulk Over Pivot (B)
     * <li>Rate Per Piece (R)
     * </ul>
     * Standard type must consider per unit rate except for rates with a rate class of U or rates with a
     * minimum weight of zero.<br>
     * Bulk Over Pivot rates are considered for general commodity and/or specific commodity goods(rate class Q
     * or C) where the rate is a flat rate with an optional per unit over pivot portion. Without an over pivot
     * portion, the rate is valid for shipments that weigh at most the rate’s chargeable weight.<br>
     * Rate Per Piece rates are considered for flat rates with no over pivot portion. The charge is considered
     * for a single piece. Shipments of more than one piece are charged at the single rate multiplied by the
     * number of piece.
     * <p>
     * 
     * @param pTypeOfRating the new value of <code>typeOfRating</code> property.<br>
     */
    public void setTypeOfRating(final RatingType pTypeOfRating) {
        this.typeOfRating = pTypeOfRating;
    }

    /**
     * Sets the <code>useGrossWeightIndicator</code> property.
     * <p>
     * Use Gross Weight Indicator which decides whether to use gross weight or chargeable weight for the
     * purposes of selecting and applying the rate.
     * <p>
     * 
     * @param pUseGrossWeightIndicator the new value of <code>useGrossWeightIndicator</code> property.<br>
     */
    public void setUseGrossWeightIndicator(final boolean pUseGrossWeightIndicator) {
        this.useGrossWeightIndicator = pUseGrossWeightIndicator;
    }

    /**
     * Sets the <code>weightUOM</code> property.
     * <p>
     * The unit of weight used to measure weight.
     * <p>
     * 
     * @param pWeightUOM the new value of <code>weightUOM</code> property.<br>
     */
    public void setWeightUOM(final WeightUOMType pWeightUOM) {
        this.weightUOM = pWeightUOM;
    }

}
