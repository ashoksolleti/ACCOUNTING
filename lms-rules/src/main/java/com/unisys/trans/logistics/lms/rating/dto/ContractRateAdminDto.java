/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantRoleType;
import com.unisys.trans.logistics.lms.rating.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.rating.dto.constants.ContractDefinitionType;
import com.unisys.trans.logistics.lms.rating.dto.constants.PayCodeType;
import com.unisys.trans.logistics.lms.rating.dto.constants.RateAdjustmentType;
import com.unisys.trans.logistics.lms.rating.dto.constants.ULDChargeType;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

/**
 * <code>ContractRateAdminDto</code> contain details of ContractRateAdmin.
 * <p>
 * This contains all information about ContractRateAdminDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>actionType
 * <li>agent
 * <li>allCommodity
 * <li>allContractDestination
 * <li>allContractOrigin
 * <li>allMinimumWeight
 * <li>allUldType
 * <li>anyMinimumWeight
 * <li>anyPivotWeight
 * <li>biDirectional
 * <li>carrierCode1
 * <li>carrierCode2
 * <li>carrierCode3
 * <li>carrierCode4
 * <li>classRatingId
 * <li>commodityNumber
 * <li>consignee
 * <li>consigneeBillTo
 * <li>contractDefinition
 * <li>contractDestination
 * <li>contractOrigin
 * <li>currency
 * <li>forwarder
 * <li>minimumWeight
 * <li>oId
 * <li>oritoDesPayCode
 * <li>overPivotRateAdjustment
 * <li>overPivotRateAdjustmentType
 * <li>participantRoleType
 * <li>pivotWeight
 * <li>rateAdjustment
 * <li>rateAdjustmentType
 * <li>rateClass
 * <li>rateSource
 * <li>rateType
 * <li>roundingFactor
 * <li>shipper
 * <li>shipperBillTo
 * <li>uldCharge
 * <li>uldType
 * <li>weightUnit
 * <li>responsibleParty
 * </ul>
 */
public class ContractRateAdminDto extends PersistenceObjectDto {
    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>actionType</code>.
     * <p>
     * This holds the value of actionType
     * <p>
     */
    private ActionType actionType;

    /**
     * Attribute to hold <code>agent</code>.
     * <p>
     * This holds the value of agent
     * <p>
     */
    private boolean agent;

    /**
     * Attribute to hold <code>allCommodity</code>.
     * <p>
     * This holds the value of allCommodity
     * <p>
     */
    private boolean allCommodity;

    /**
     * Attribute to hold <code>allContractDestination</code>.
     * <p>
     * This holds the value of allContractDestination
     * <p>
     */
    private boolean allContractDestination;

    /**
     * Attribute to hold <code>allContractOrigin</code>.
     * <p>
     * This holds the value of allContractOrigin
     * <p>
     */
    private boolean allContractOrigin;

    /**
     * Attribute to hold <code>allMinimumWeight</code>.
     * <p>
     * This holds the value of allMinimumWeight
     * <p>
     */
    private boolean allMinimumWeight;

    /**
     * Attribute to hold <code>allUldType</code>.
     * <p>
     * This holds the value of allUldType
     * <p>
     */
    private boolean allUldType;

    /**
     * Attribute to hold <code>anyMinimumWeight</code>.
     * <p>
     * This holds the value of anyMinimumWeight
     * <p>
     */
    private boolean anyMinimumWeight;

    /**
     * Attribute to hold <code>anyPivotWeight</code>.
     * <p>
     * This holds the value of anyPivotWeight
     * <p>
     */
    private boolean anyPivotWeight;

    /**
     * Attribute to hold <code>biDirectional</code>.
     * <p>
     * This holds the value of biDirectional
     * <p>
     */
    private Boolean biDirectional;

    /**
     * Attribute to hold <code>carrierCode1</code>.
     * <p>
     * This holds the value of carrierCode1
     * <p>
     */
    private String carrierCode1;

    /**
     * Attribute to hold <code>carrierCode2</code>.
     * <p>
     * This holds the value of carrierCode2
     * <p>
     */
    private String carrierCode2;

    /**
     * Attribute to hold <code>carrierCode3</code>.
     * <p>
     * This holds the value of carrierCode3
     * <p>
     */
    private String carrierCode3;

    /**
     * Attribute to hold <code>carrierCode4</code>.
     * <p>
     * This holds the value of carrierCode4
     * <p>
     */
    private String carrierCode4;

    /**
     * Attribute to hold <code>classRatingId</code>.
     * <p>
     * This holds the value of classRatingId
     * <p>
     */
    private String classRatingId;

    /**
     * Attribute to hold <code>commodityNumber</code>.
     * <p>
     * This holds the value of commodityNumber
     * <p>
     */
    private String commodityNumber;

    /**
     * Attribute to hold <code>classRatingId</code>.
     * <p>
     * This holds the value of classRatingId
     * <p>
     */
    private boolean consignee;

    /**
     * Attribute to hold <code>consigneeBillTo</code>.
     * <p>
     * This holds the value of consigneeBillTo
     * <p>
     */
    private boolean consigneeBillTo;

    /**
     * Attribute to hold <code>contractDefinition</code>.
     * <p>
     * This holds the value of contractDefinition
     * <p>
     */
    private ContractDefinitionType contractDefinition;

    /**
     * Attribute to hold <code>destinationCode</code> property.
     */
    private GeographicDataDto contractDestination;

    /**
     * Attribute to hold <code>contractOrigin</code> property.
     */
    private GeographicDataDto contractOrigin;

    /**
     * Attribute to hold <code>currency</code>.
     * <p>
     * This holds the value of currency
     * <p>
     */
    private String currency;

    /**
     * Attribute to hold <code>destoOriPayCode</code>.
     * <p>
     * This holds the value of destoOriPayCode
     * <p>
     */
    private PayCodeType destoOriPayCode;

    /**
     * Attribute to hold <code>error</code>.
     * <p>
     * This holds the value of error
     * <p>
     */
    private boolean error;

    /**
     * Attribute to hold <code>errorRateCriteria</code> property.
     */
    private String errorRateCriteria;

    /**
     * Attribute to hold <code>classRatingId</code>.
     * <p>
     * This holds the value of classRatingId
     * <p>
     */
    private boolean forwarder;

    /**
     * Attribute to hold <code>ignoreTaskIndicator</code> property.
     */
    private boolean ignoreTaskIndicator;

    /**
     * Attribute to hold <code>ignoreTaskReasonType</code> property.
     */
    private String ignoreTaskReasonType;

    /**
     * Attribute to hold <code>minimumWeight</code> property.
     */
    private BigDecimal minimumWeight;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Attribute to hold <code>oritoDesPayCode</code>.
     * <p>
     * This holds the value of oritoDesPayCode
     * <p>
     */
    private PayCodeType oritoDesPayCode;

    /**
     * Attribute to hold <code>classRatingId</code>.
     * <p>
     * This holds the value of classRatingId
     * <p>
     */
    private BigDecimal overPivotRateAdjustment;

    /**
     * Attribute to hold <code>classRatingId</code>.
     * <p>
     * This holds the value of classRatingId
     * <p>
     */
    private RateAdjustmentType overPivotRateAdjustmentType;

    /**
     * Attribute to hold <code>classRatingId</code>.
     * <p>
     * This holds the value of classRatingId
     * <p>
     */
    private ParticipantRoleType participantRoleType;

    /**
     * Attribute to hold <code>pivotWeight</code> property.
     */
    private BigDecimal pivotWeight;

    /**
     * Attribute to hold <code>rateAdjustment</code>.
     * <p>
     * This holds the value of rateAdjustment
     * <p>
     */
    private BigDecimal rateAdjustment;

    /**
     * Attribute to hold <code>rateAdjustmentType</code>.
     * <p>
     * This holds the value of rateAdjustmentType
     * <p>
     */
    private RateAdjustmentType rateAdjustmentType;

    /**
     * Attribute to hold <code>rateClass</code>.
     * <p>
     * This holds the value of rateClass
     * <p>
     */
    private RateClassType rateClass;

    /**
     * Attribute to hold <code>rateSource</code>.
     * <p>
     * This holds the value of rateSource
     * <p>
     */
    private String rateSource;

    /**
     * Attribute to hold <code>rateType</code>.
     * <p>
     * This holds the value of rateType
     * <p>
     */
    private String rateType;

    /**
     * Attribute to hold <code>classRatingId</code>.
     * <p>
     * This holds the value of classRatingId
     * <p>
     */
    private boolean responsibleParty;

    /**
     * Attribute to hold <code>roundingFactor</code>.
     * <p>
     * This holds the value of roundingFactor
     * <p>
     */
    private BigDecimal roundingFactor;

    /**
     * Attribute to hold <code>classRatingId</code>.
     * <p>
     * This holds the value of classRatingId
     * <p>
     */
    private boolean shipper;

    /**
     * Attribute to hold <code>shipperBillTo</code>.
     * <p>
     * This holds the value of shipperBillTo
     * <p>
     */
    private boolean shipperBillTo;

    /**
     * Attribute to hold <code>taskSelectedIndicator</code> property.
     */
    private boolean taskSelectedIndicator;

    /**
     * Attribute to hold <code>uldCharge</code> property.
     */
    private ULDChargeType uldCharge;

    /**
     * Attribute to hold <code>uldType</code>.
     * <p>
     * This holds the value of uldType
     * <p>
     */
    private String uldType;

    /**
     * Attribute to hold <code>weightUnit</code> property.
     */
    private WeightUOMType weightUnit;

    /**
     * This compareDifferenceForUpdate used to compare values. It checks the
     * current and passing object values and returns boolean value accordingly
     * 
     * @param obj
     *            the current value of the <code>Object</code> property.
     * @return boolean value
     */
    @Override
    public boolean equals(final Object obj) {
        boolean value = true;

        if (this == obj) {
            value = true;
        }
        if (obj == null) {
            value = false;
        }
        if (getClass() != obj.getClass()) {
            value = false;
        }
        if (value) {
            ContractRateAdminDto other = (ContractRateAdminDto) obj;
            if (carrierCode1 == null) {
                if (other.carrierCode1 != null) {
                    value = false;
                }
            }
            else if (!carrierCode1.equalsIgnoreCase(other.carrierCode1)) {
                value = false;
            }
            if (value)
                if (carrierCode2 == null) {
                    if (other.carrierCode2 != null) {
                        value = false;
                    }
                }
                else if (carrierCode2 != null
                            && !carrierCode2.equalsIgnoreCase(other.carrierCode2)) {
                    value = false;
                }
            if (value)
                if (carrierCode3 == null) {
                    if (other.carrierCode3 != null) {
                        value = false;
                    }
                }
                else if (carrierCode3 != null
                            && !carrierCode3.equalsIgnoreCase(other.carrierCode3)) {
                    value = false;
                }
            if (value)
                if (carrierCode4 == null) {
                    if (other.carrierCode4 != null) {
                        value = false;
                    }
                }
                else if (carrierCode4 != null
                            && !carrierCode4.equalsIgnoreCase(other.carrierCode4)) {
                    value = false;
                }
            if (value)
                if (classRatingId == null) {
                    if (other.classRatingId != null) {
                        value = false;
                    }
                }
                else if (other.classRatingId == null) {
                    if (classRatingId != null) {
                        value = false;
                    }
                }
                else if (!classRatingId.equalsIgnoreCase(other.classRatingId)) {
                    value = false;
                }
            if (value)
                if (commodityNumber == null) {
                    if (other.commodityNumber != null) {
                        value = false;
                    }
                }
                else if (other.commodityNumber == null) {
                    if (commodityNumber != null) {
                        value = false;
                    }
                }
                else if (!commodityNumber.equalsIgnoreCase(other.commodityNumber)) {
                    value = false;
                }
            if (value && consignee != other.consignee) {
                value = false;
            }
            if (value && consigneeBillTo != other.consigneeBillTo) {
                value = false;
            }
            if (value && contractDefinition != other.contractDefinition) {
                value = false;
            }
            if (value)
                if (contractDestination == null) {
                    if (other.contractDestination != null) {
                        if (other.contractDestination.getCode() != null) {
                            value = false;
                        }
                    }
                }
                else if (other.contractDestination == null) {
                    if (contractDestination != null) {
                        if (contractDestination.getCode() != null) {
                            value = false;
                        }
                    }
                }
                else if (other.contractDestination != null
                            && contractDestination != null
                            && contractDestination.getCode() != null
                            && !contractDestination.getCode().equalsIgnoreCase(
                                other.contractDestination.getCode())) {
                    value = false;
                }
            if (value)
                if (contractOrigin == null) {
                    if (other.contractOrigin != null) {
                        if (other.contractOrigin.getCode() != null) {
                            value = false;
                        }
                    }
                }
                else if (other.contractOrigin == null) {
                    if (contractOrigin != null) {
                        if (contractOrigin.getCode() != null) {
                            value = false;
                        }
                    }

                }
                else if (contractOrigin != null
                            && other.contractOrigin != null) {
                    if (contractOrigin.getCode() != null) {
                        if (other.contractOrigin.getCode() != null) {
                            if (!contractOrigin.getCode().equalsIgnoreCase(
                                other.contractOrigin.getCode())) {
                                value = false;
                            }
                        }
                    }
                }

            if (value && destoOriPayCode != other.destoOriPayCode) {
                value = false;
            }

            if (value && forwarder != other.forwarder) {
                value = false;
            }
            if (value)
                if (minimumWeight == null) {
                    if (other.minimumWeight != null) {
                        value = false;
                    }
                }
                else if (!minimumWeight.equals(other.minimumWeight)) {
                    value = false;
                }
            if (value && oritoDesPayCode != other.oritoDesPayCode) {
                value = false;
            }

            if (value && participantRoleType != other.participantRoleType) {
                value = false;
            }
            if (value)
                if (pivotWeight == null) {
                    if (other.pivotWeight != null) {
                        value = false;
                    }
                }
                else if (!pivotWeight.equals(other.pivotWeight)) {
                    value = false;
                }

            if (value && rateClass != other.rateClass) {
                value = false;
            }
            if (value)
                if (rateSource == null) {
                    if (other.rateSource != null) {
                        value = false;
                    }
                }
                else if (other.rateSource == null) {
                    value = false;
                }
                else if (!rateSource.equalsIgnoreCase(other.rateSource)) {
                    value = false;
                }
            if (value)
                if (rateType == null) {
                    if (other.rateType != null) {
                        value = false;
                    }
                }
                else if (other.rateType == null) {
                    value = false;
                }
                else if (!rateType.equalsIgnoreCase(other.rateType)) {
                    value = false;
                }
            if (value && responsibleParty != other.responsibleParty) {
                value = false;
            }

            if (value && agent != other.agent) {
                value = false;
            }
            if (value && allCommodity != other.allCommodity) {
                value = false;
            }
            if (value && allContractDestination != other.allContractDestination) {
                value = false;
            }
            if (value && allContractOrigin != other.allContractOrigin) {
                value = false;
            }
            if (value && allMinimumWeight != other.allMinimumWeight) {
                value = false;
            }
            if (value && allUldType != other.allUldType) {
                value = false;
            }
            if (value && anyMinimumWeight != other.anyMinimumWeight) {
                value = false;
            }
            if (value && anyPivotWeight != other.anyPivotWeight) {
                value = false;
            }
            if (value && biDirectional != other.biDirectional) {
                value = false;
            }
            if (value && shipper != other.shipper) {
                value = false;
            }
            if (value && shipperBillTo != other.shipperBillTo) {
                value = false;
            }
            if (value && uldCharge != other.uldCharge) {
                value = false;
            }
            if (value)
                if (this.uldType == null) {
                    if (other.uldType != null) {
                        value = false;
                    }
                }
                else if (other.uldType == null) {
                    value = false;
                }
                else if (!uldType.equalsIgnoreCase(other.uldType)) {
                    value = false;
                }
            if (value && weightUnit != other.weightUnit) {
                value = false;
            }
        }
        return value;

    }

    /**
     * Gets the <code>actionType</code> property.
     * <p>
     * 
     * @return the current value of the <code>actionType</code> property.
     */
    public ActionType getActionType() {
        return this.actionType;
    }

    /**
     * Gets the <code>agent</code> property.
     * <p>
     * 
     * @return the current value of the <code>agent</code> property.
     */

    public boolean getAgent() {
        return this.agent;
    }

    /**
     * Gets the <code>allCommodity</code> property.
     * <p>
     * 
     * @return the current value of the <code>allCommodity</code> property.
     */
    public boolean getAllCommodity() {
        return this.allCommodity;
    }

    /**
     * Gets the <code>allContractDestination</code> property.
     * <p>
     * 
     * @return the current value of the <code>allContractDestination</code> property.
     */
    public boolean getAllContractDestination() {
        return this.allContractDestination;
    }

    /**
     * Gets the <code>allContractOrigin</code> property.
     * <p>
     * 
     * @return the current value of the <code>allContractOrigin</code> property.
     */
    public boolean getAllContractOrigin() {
        return this.allContractOrigin;
    }

    /**
     * Gets the <code>allMinimumWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>allMinimumWeight</code> property.
     */
    public boolean getAllMinimumWeight() {
        return this.allMinimumWeight;
    }

    /**
     * Gets the <code>allUldType</code> property.
     * <p>
     * 
     * @return the current value of the <code>allUldType</code> property.
     */
    public boolean getAllUldType() {
        return this.allUldType;
    }

    /**
     * Gets the <code>anyMinimumWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>anyMinimumWeight</code> property.
     */
    public boolean getAnyMinimumWeight() {
        return this.anyMinimumWeight;
    }

    /**
     * Gets the <code>anyPivotWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>anyPivotWeight</code> property.
     */
    public boolean getAnyPivotWeight() {
        return this.anyPivotWeight;
    }

    /**
     * Gets the <code>biDirectional</code> property.
     * <p>
     * 
     * @return the current value of the <code>biDirectional</code> property.
     */
    public Boolean getBiDirectional() {
        return this.biDirectional;
    }

    /**
     * Gets the <code>carrierCode1</code> property.
     * <p>
     * 
     * @return the current value of the <code>carrierCode1</code> property.
     */
    public String getCarrierCode1() {
        return this.carrierCode1;
    }

    /**
     * Gets the <code>carrierCode2</code> property.
     * <p>
     * 
     * @return the current value of the <code>carrierCode2</code> property.
     */
    public String getCarrierCode2() {
        return this.carrierCode2;
    }

    /**
     * Gets the <code>carrierCode3</code> property.
     * <p>
     * 
     * @return the current value of the <code>carrierCode3</code> property.
     */
    public String getCarrierCode3() {
        return this.carrierCode3;
    }

    /**
     * Gets the <code>carrierCode4</code> property.
     * <p>
     * 
     * @return the current value of the <code>carrierCode4</code> property.
     */
    public String getCarrierCode4() {
        return this.carrierCode4;
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
     * Gets the <code>commodityNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>commodityNumber</code> property.
     */
    public String getCommodityNumber() {
        return this.commodityNumber;
    }

    /**
     * Gets the <code>consignee</code> property.
     * <p>
     * 
     * @return the current value of the <code>consignee</code> property.
     */
    public boolean getConsignee() {
        return this.consignee;
    }

    /**
     * Gets the <code>consigneeBillTo</code> property.
     * <p>
     * 
     * @return the current value of the <code>consigneeBillTo</code> property.
     */
    public boolean getConsigneeBillTo() {
        return this.consigneeBillTo;
    }

    /**
     * Gets the <code>contractDefinition</code> property.
     * <p>
     * 
     * @return the current value of the <code>contractDefinition</code> property.
     */
    public ContractDefinitionType getContractDefinition() {
        return this.contractDefinition;
    }

    /**
     * Gets the <code>contractDestination</code> property.
     * <p>
     * 
     * @return the current value of the <code>contractDestination</code> property.
     */
    public GeographicDataDto getContractDestination() {
        if (this.contractDestination == null) {
            this.contractDestination = new GeographicDataDto();
        }
        return this.contractDestination;
    }

    /**
     * Gets the <code>contractOrigin</code> property.
     * <p>
     * 
     * @return the current value of the <code>contractOrigin</code> property.
     */
    public GeographicDataDto getContractOrigin() {
        if (this.contractOrigin == null) {
            this.contractOrigin = new GeographicDataDto();
        }
        return this.contractOrigin;
    }

    /**
     * Gets the <code>currency</code> property.
     * <p>
     * 
     * @return the current value of the <code>currency</code> property.
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Gets the <code>destoOriPayCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>destoOriPayCode</code> property.
     */
    public PayCodeType getDestoOriPayCode() {
        return this.destoOriPayCode;
    }

    /**
     * Gets the <code>error</code> property.
     * <p>
     * 
     * @return the current value of the <code>error</code> property.
     */
    public boolean getError() {
        return this.error;
    }

    /**
     * Gets the value for the <code>errorRateCriteria</code> property.
     * <p>
     * 
     * @return the current value of the <code>errorRateCriteria</code> property.<br>
     */
    public String getErrorRateCriteria() {
        return errorRateCriteria;
    }

    /**
     * Gets the <code>forwarder</code> property.
     * <p>
     * 
     * @return the current value of the <code>forwarder</code> property.
     */
    public boolean getForwarder() {
        return this.forwarder;
    }

    /**
     * Gets the value for the <code>ignoreTaskReasonType</code> property.
     * <p>
     * 
     * @return the current value of the <code>ignoreTaskReasonType</code> property.<br>
     */
    public String getIgnoreTaskReasonType() {
        return ignoreTaskReasonType;
    }

    /**
     * Gets the <code>minimumWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>minimumWeight</code> property.
     */
    public BigDecimal getMinimumWeight() {
        return this.minimumWeight;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>oritoDesPayCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>oritoDesPayCode</code> property.
     */
    public PayCodeType getOritoDesPayCode() {
        return this.oritoDesPayCode;
    }

    /**
     * Gets the <code>Identifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>identifier</code> property.
     */
    public BigDecimal getOverPivotRateAdjustment() {
        return this.overPivotRateAdjustment;
    }

    /**
     * Gets the <code>Identifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>identifier</code> property.
     */
    public RateAdjustmentType getOverPivotRateAdjustmentType() {
        return this.overPivotRateAdjustmentType;
    }

    /**
     * Gets the <code>Identifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>identifier</code> property.
     */
    public ParticipantRoleType getParticipantRoleType() {
        return this.participantRoleType;
    }

    /**
     * Gets the <code>pivotWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>pivotWeight</code> property.
     */
    public BigDecimal getPivotWeight() {
        return this.pivotWeight;
    }

    /**
     * Gets the <code>rateAdjustment</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateAdjustment</code> property.
     */
    public BigDecimal getRateAdjustment() {
        return this.rateAdjustment;
    }

    /**
     * Gets the <code>rateAdjustmentType</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateAdjustmentType</code> property.
     */
    public RateAdjustmentType getRateAdjustmentType() {
        return this.rateAdjustmentType;
    }

    /**
     * Gets the <code>rateClass</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateClass</code> property.
     */
    public RateClassType getRateClass() {
        return this.rateClass;
    }

    /**
     * Gets the <code>rateSource</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateSource</code> property.
     */
    public String getRateSource() {
        return this.rateSource;
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
     * Gets the <code>responsibleParty</code> property.
     * <p>
     * 
     * @return the current value of the <code>responsibleParty</code> property.
     */
    public boolean getResponsibleParty() {
        return this.responsibleParty;
    }

    /**
     * Gets the <code>roundingFactor</code> property.
     * <p>
     * 
     * @return the current value of the <code>roundingFactor</code> property.
     */
    public BigDecimal getRoundingFactor() {
        return this.roundingFactor;
    }

    /**
     * Gets the <code>shipper</code> property.
     * <p>
     * 
     * @return the current value of the <code>shipper</code> property.
     */
    public boolean getShipper() {
        return this.shipper;
    }

    /**
     * Gets the <code>shipperBillTo</code> property.
     * <p>
     * 
     * @return the current value of the <code>shipperBillTo</code> property.
     */
    public boolean getShipperBillTo() {
        return this.shipperBillTo;
    }

    /**
     * Gets the value of <code>taskSelectedIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * <li><code>false</code><br>
     * <p>
     * 
     * @return the current value of the <code>taskSelectedIndicator</code> property.<br>
     */
    public boolean getTaskSelectedIndicator() {
        return this.taskSelectedIndicator;
    }

    /**
     * Gets the <code>uldCharge</code> property.
     * <p>
     * 
     * @return the current value of the <code>uldCharge</code> property.
     */
    public ULDChargeType getUldCharge() {
        return this.uldCharge;
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
     * Gets the <code>weightUnit</code> property.
     * <p>
     * 
     * @return the current value of the <code>weightUnit</code> property.
     */
    public WeightUOMType getWeightUnit() {
        return this.weightUnit;
    }

    @Override
    public int hashCode() {
        final int result = 1;
        return result;
    }

    /**
     * Gets the value of <code>ignoreTaskIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * Ignore task indicator is included for task.
     * <li><code>false</code><br>
     * Ignore task indicator is not included for task.
     * <p>
     * 
     * @return the current value of the <code>ignoreTaskIndicator</code> property.<br>
     */
    public boolean isIgnoreTaskIndicator() {
        return ignoreTaskIndicator;
    }

    /**
     * Sets the <code>actionType</code> property.
     * <p>
     * 
     * @param pActionType
     *            the new value of the <code>actionType</code> property.
     */
    public void setActionType(final ActionType pActionType) {
        this.actionType = pActionType;
    }

    /**
     * Sets the <code>agent</code> property.
     * <p>
     * 
     * @param pAgent
     *            the new value of the <code>agent</code> property.
     */
    public void setAgent(final boolean pAgent) {
        this.agent = pAgent;
    }

    /**
     * Sets the <code>allCommodity</code> property.
     * <p>
     * 
     * @param pAllCommodity
     *            the new value of the <code>allCommodity</code> property.
     */
    public void setAllCommodity(final boolean pAllCommodity) {
        this.allCommodity = pAllCommodity;
    }

    /**
     * Sets the <code>allContractDestination</code> property.
     * <p>
     * 
     * @param pAllContractDestination
     *            the new value of the <code>allContractDestination</code> property.
     */
    public void setAllContractDestination(final boolean pAllContractDestination) {
        this.allContractDestination = pAllContractDestination;
    }

    /**
     * Sets the <code>allContractOrigin</code> property.
     * <p>
     * 
     * @param pAllContractOrigin
     *            the new value of the <code>allContractOrigin</code> property.
     */
    public void setAllContractOrigin(final boolean pAllContractOrigin) {
        this.allContractOrigin = pAllContractOrigin;
    }

    /**
     * Sets the <code>allMinimumWeight</code> property.
     * <p>
     * 
     * @param pAllMinimumWeight
     *            the new value of the <code>allMinimumWeight</code> property.
     */
    public void setAllMinimumWeight(final boolean pAllMinimumWeight) {
        this.allMinimumWeight = pAllMinimumWeight;
    }

    /**
     * Sets the <code>allUldType</code> property.
     * <p>
     * 
     * @param pAllUldType
     *            the new value of the <code>allUldType</code> property.
     */
    public void setAllUldType(final boolean pAllUldType) {
        this.allUldType = pAllUldType;
    }

    /**
     * Sets the <code>anyMinimumWeight</code> property.
     * <p>
     * 
     * @param pAnyMinimumWeight
     *            the new value of the <code>anyMinimumWeight</code> property.
     */
    public void setAnyMinimumWeight(final boolean pAnyMinimumWeight) {
        this.anyMinimumWeight = pAnyMinimumWeight;
    }

    /**
     * Sets the <code>anyPivotWeight</code> property.
     * <p>
     * 
     * @param pAnyPivotWeight
     *            the new value of the <code>anyPivotWeight</code> property.
     */
    public void setAnyPivotWeight(final boolean pAnyPivotWeight) {
        this.anyPivotWeight = pAnyPivotWeight;
    }

    /**
     * Sets the <code>biDirectional</code> property.
     * <p>
     * 
     * @param pBiDirectional
     *            the new value of the <code>biDirectional</code> property.
     */
    public void setBiDirectional(final Boolean pBiDirectional) {
        this.biDirectional = pBiDirectional;
    }

    /**
     * Sets the <code>carrierCode1</code> property.
     * <p>
     * 
     * @param pCarrierCode1
     *            the new value of the <code>carrierCode1</code> property.
     */
    public void setCarrierCode1(final String pCarrierCode1) {
        this.carrierCode1 = ContractUtility.convertToUpperCase(pCarrierCode1);
    }

    /**
     * Sets the <code>carrierCode2</code> property.
     * <p>
     * 
     * @param pCarrierCode2
     *            the new value of the <code>carrierCode2</code> property.
     */
    public void setCarrierCode2(final String pCarrierCode2) {
        this.carrierCode2 = ContractUtility.convertToUpperCase(pCarrierCode2);
    }

    /**
     * Sets the <code>carrierCode3</code> property.
     * <p>
     * 
     * @param pCarrierCode3
     *            the new value of the <code>carrierCode3</code> property.
     */
    public void setCarrierCode3(final String pCarrierCode3) {
        this.carrierCode3 = ContractUtility.convertToUpperCase(pCarrierCode3);
    }

    /**
     * Sets the <code>carrierCode4</code> property.
     * <p>
     * 
     * @param pCarrierCode4
     *            the new value of the <code>carrierCode4</code> property.
     */
    public void setCarrierCode4(final String pCarrierCode4) {
        this.carrierCode4 = ContractUtility.convertToUpperCase(pCarrierCode4);
    }

    /**
     * Sets the <code>classRatingId</code> property.
     * <p>
     * 
     * @param pClassRatingId
     *            the new value of the <code>classRatingId</code> property.
     */
    public void setClassRatingId(final String pClassRatingId) {
        this.classRatingId = ContractUtility.convertToUpperCase(pClassRatingId);
    }

    /**
     * Sets the <code>commodityNumber</code> property.
     * <p>
     * 
     * @param pCommodityNumber
     *            the new value of the <code>commodityNumber</code> property.
     */
    public void setCommodityNumber(final String pCommodityNumber) {
        this.commodityNumber = ContractUtility
                    .convertToUpperCase(pCommodityNumber);
    }

    /**
     * Sets the <code>consignee</code> property.
     * <p>
     * 
     * @param pConsignee
     *            the new value of the <code>consignee</code> property.
     */
    public void setConsignee(final boolean pConsignee) {
        this.consignee = pConsignee;
    }

    /**
     * Sets the <code>consigneeBillTo</code> property.
     * <p>
     * 
     * @param pConsigneeBillTo
     *            the new value of the <code>consigneeBillTo</code> property.
     */
    public void setConsigneeBillTo(final boolean pConsigneeBillTo) {
        this.consigneeBillTo = pConsigneeBillTo;
    }

    /**
     * Sets the <code>contractDefinition</code> property.
     * <p>
     * 
     * @param pContractDefinition
     *            the new value of the <code>contractDefinition</code> property.
     */
    public void setContractDefinition(
                final ContractDefinitionType pContractDefinition) {
        this.contractDefinition = pContractDefinition;
    }

    /**
     * Sets the <code>contractDestination</code> property.
     * <p>
     * 
     * @param pContractDestination
     *            the new value of the <code>contractDestination</code> property.
     */
    public void setContractDestination(
                final GeographicDataDto pContractDestination) {
        this.contractDestination = pContractDestination;
    }

    /**
     * Sets the <code>contractOrigin</code> property.
     * <p>
     * 
     * @param pContractOrigin
     *            the new value of the <code>contractOrigin</code> property.
     */
    public void setContractOrigin(final GeographicDataDto pContractOrigin) {
        this.contractOrigin = pContractOrigin;
    }

    /**
     * Sets the <code>currency</code> property.
     * <p>
     * 
     * @param pCurrency
     *            the new value of the <code>currency</code> property.
     */
    public void setCurrency(final String pCurrency) {
        this.currency = ContractUtility.convertToUpperCase(pCurrency);
    }

    /**
     * Sets the <code>destoOriPayCode</code> property.
     * <p>
     * 
     * @param pDestoOriPayCode
     *            the new value of the <code>destoOriPayCode</code> property.
     */
    public void setDestoOriPayCode(final PayCodeType pDestoOriPayCode) {
        this.destoOriPayCode = pDestoOriPayCode;
    }

    /**
     * Sets the <code>error</code> property.
     * <p>
     * 
     * @param pError
     *            the new value of the <code>error</code> property.
     */
    public void setError(final boolean pError) {
        this.error = pError;
    }

    /**
     * Sets the value of the <code>errorRateCriteria</code> property.
     * <p>
     * 
     * @param pErrorRateCriteria
     *            the new value of the <code>errorRateCriteria</code> property.<br>
     */
    public void setErrorRateCriteria(final String pErrorRateCriteria) {
        this.errorRateCriteria = pErrorRateCriteria;
    }

    /**
     * Sets the <code>forwarder</code> property.
     * <p>
     * 
     * @param pForwarder
     *            the new value of the <code>forwarder</code> property.
     */
    public void setForwarder(final boolean pForwarder) {
        this.forwarder = pForwarder;
    }

    /**
     * Sets the value of the <code>ignoreTaskIndicator</code> property.
     * <p>
     * 
     * @param pIgnoreTaskIndicator
     *            the new value of the <code>ignoreTaskIndicator</code> property.<br>
     */
    public void setIgnoreTaskIndicator(final boolean pIgnoreTaskIndicator) {
        this.ignoreTaskIndicator = pIgnoreTaskIndicator;
    }

    /**
     * Sets the value of the <code>ignoreTaskReasonType</code> property.
     * <p>
     * 
     * @param pIgnoreTaskReasonType
     *            the new value of the <code>ignoreTaskReasonType</code> property.<br>
     */
    public void setIgnoreTaskReasonType(final String pIgnoreTaskReasonType) {
        this.ignoreTaskReasonType = pIgnoreTaskReasonType;
    }

    /**
     * Sets the <code>minimumWeight</code> property.
     * <p>
     * 
     * @param pMinimumWeight
     *            the new value of the <code>minimumWeight</code> property.
     */
    public void setMinimumWeight(final BigDecimal pMinimumWeight) {
        this.minimumWeight = pMinimumWeight;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOid
     *            the new value of the <code>pOid</code> property.
     */
    public void setOId(final Long pOid) {
        this.oId = pOid;
    }

    /**
     * Sets the <code>oritoDesPayCode</code> property.
     * <p>
     * 
     * @param pOritoDesPayCode
     *            the new value of the <code>oritoDesPayCode</code> property.
     */
    public void setOritoDesPayCode(final PayCodeType pOritoDesPayCode) {
        this.oritoDesPayCode = pOritoDesPayCode;
    }

    /**
     * Sets the <code>overPivotRateAdjustment</code> property.
     * <p>
     * 
     * @param pOverPivotRateAdjustment
     *            the new value of the <code>overPivotRateAdjustment</code> property.
     */
    public void setOverPivotRateAdjustment(
                final BigDecimal pOverPivotRateAdjustment) {
        this.overPivotRateAdjustment = pOverPivotRateAdjustment;
    }

    /**
     * Sets the <code>overPivotRateAdjustmentType</code> property.
     * <p>
     * 
     * @param pOverPivotRateAdjustmentType
     *            the new value of the <code>overPivotRateAdjustmentType</code> property.
     */
    public void setOverPivotRateAdjustmentType(
                final RateAdjustmentType pOverPivotRateAdjustmentType) {
        this.overPivotRateAdjustmentType = pOverPivotRateAdjustmentType;
    }

    /**
     * Sets the <code>participantRoleType</code> property.
     * <p>
     * 
     * @param pParticipantRoleType
     *            the new value of the <code>participantRoleType</code> property.
     */
    public void setParticipantRoleType(
                final ParticipantRoleType pParticipantRoleType) {
        this.participantRoleType = pParticipantRoleType;
    }

    /**
     * Sets the <code>pivotWeight</code> property.
     * <p>
     * 
     * @param pPivotWeight
     *            the new value of the <code>pivotWeight</code> property.
     */
    public void setPivotWeight(final BigDecimal pPivotWeight) {
        this.pivotWeight = pPivotWeight;
    }

    /**
     * Sets the <code>rateAdjustment</code> property.
     * <p>
     * 
     * @param pRateAdjustment
     *            the new value of the <code>rateAdjustment</code> property.
     */
    public void setRateAdjustment(final BigDecimal pRateAdjustment) {
        this.rateAdjustment = pRateAdjustment;
    }

    /**
     * Sets the <code>rateAdjustmentType</code> property.
     * <p>
     * 
     * @param pRateAdjustmentType
     *            the new value of the <code>rateAdjustmentType</code> property.
     */
    public void setRateAdjustmentType(
                final RateAdjustmentType pRateAdjustmentType) {
        this.rateAdjustmentType = pRateAdjustmentType;
    }

    /**
     * Sets the <code>rateClass</code> property.
     * <p>
     * 
     * @param pRateClass
     *            the new value of the <code>rateClass</code> property.
     */
    public void setRateClass(final RateClassType pRateClass) {
        this.rateClass = pRateClass;
    }

    /**
     * Sets the <code>rateSource</code> property.
     * <p>
     * 
     * @param pRateSource
     *            the new value of the <code>rateSource</code> property.
     */
    public void setRateSource(final String pRateSource) {
        this.rateSource = ContractUtility.convertToUpperCase(pRateSource);
    }

    /**
     * Sets the <code>rateType</code> property.
     * <p>
     * 
     * @param pRateType
     *            the new value of the <code>rateType</code> property.
     */
    public void setRateType(final String pRateType) {
        this.rateType = ContractUtility.convertToUpperCase(pRateType);
    }

    /**
     * Sets the <code>responsibleParty</code> property.
     * <p>
     * 
     * @param pResponsibleParty
     *            the new value of the <code>responsibleParty</code> property.
     */
    public void setResponsibleParty(final boolean pResponsibleParty) {
        this.responsibleParty = pResponsibleParty;
    }

    /**
     * Sets the <code>roundingFactor</code> property.
     * <p>
     * 
     * @param pRoundingFactor
     *            the new value of the <code>roundingFactor</code> property.
     */
    public void setRoundingFactor(final BigDecimal pRoundingFactor) {
        this.roundingFactor = pRoundingFactor;
    }

    /**
     * Sets the <code>shipper</code> property.
     * <p>
     * 
     * @param pShipper
     *            the new value of the <code>shipper</code> property.
     */
    public void setShipper(final boolean pShipper) {
        this.shipper = pShipper;
    }

    /**
     * Sets the <code>shipperBillTo</code> property.
     * <p>
     * 
     * @param pShipperBillTo
     *            the new value of the <code>shipperBillTo</code> property.
     */
    public void setShipperBillTo(final boolean pShipperBillTo) {
        this.shipperBillTo = pShipperBillTo;
    }

    /**
     * Sets the value of the <code>taskSelectedIndicator</code> property.
     * <p>
     * 
     * @param pTaskSelectedIndicator
     *            the new value of the <code>taskSelectedIndicator</code> property.<br>
     */
    public void setTaskSelectedIndicator(final boolean pTaskSelectedIndicator) {
        this.taskSelectedIndicator = pTaskSelectedIndicator;
    }

    /**
     * Sets the <code>uldCharge</code> property.
     * <p>
     * 
     * @param pUldCharge
     *            the new value of the <code>uldCharge</code> property.
     */
    public void setUldCharge(final ULDChargeType pUldCharge) {
        this.uldCharge = pUldCharge;
    }

    /**
     * Sets the <code>uldType</code> property.
     * <p>
     * 
     * @param pUldType
     *            the new value of the <code>uldType</code> property.
     */
    public void setUldType(final String pUldType) {
        this.uldType = ContractUtility.convertToUpperCase(pUldType);
    }

    /**
     * Sets the <code>weightUnit</code> property.
     * <p>
     * 
     * @param pWeightUnit
     *            the new value of the <code>weightUnit</code> property.
     */
    public void setWeightUnit(final WeightUOMType pWeightUnit) {
        this.weightUnit = pWeightUnit;
    }

    /**
     * Gets the Agent, Responsible party, consignee, shipper,forwarder, shipperbillto and consigneebill to
     * This is used to display in UI
     * 
     * @return ParticipantTypes
     */
    public String getParticipantTypes() {
        StringBuffer partTypes = new StringBuffer();
        if (this.getResponsibleParty()) {
            partTypes.append("Responsible Party");
            if (this.getShipper() || this.getConsignee() || this.getForwarder() || this.getAgent()
                        || this.getShipperBillTo() || this.getConsigneeBillTo()) {
                partTypes.append(",");
            }
        }
        if (this.getShipper()) {
            partTypes.append("Shipper");
            if (this.getConsignee() || this.getForwarder() || this.getAgent()
                        || this.getShipperBillTo() || this.getConsigneeBillTo()) {
                partTypes.append(",");
            }
        }
        if (this.getConsignee()) {
            partTypes.append("Consignee");
            if (this.getForwarder() || this.getAgent()
                        || this.getShipperBillTo() || this.getConsigneeBillTo()) {
                partTypes.append(",");
            }
        }
        if (this.getForwarder()) {
            partTypes.append("Forwarder");
            if (this.getAgent()
                        || this.getShipperBillTo() || this.getConsigneeBillTo()) {
                partTypes.append(",");
            }
        }
        if (this.getAgent()) {
            partTypes.append("Agent");
            if (this.getShipperBillTo() || this.getConsigneeBillTo()) {
                partTypes.append(",");
            }
        }
        if (this.getShipperBillTo()) {
            partTypes.append("Bill-To Shipper");
            if (this.getConsigneeBillTo()) {
                partTypes.append(",");
            }
        }
        if (this.getConsigneeBillTo()) {
            partTypes.append("Bill-To Consignee");
        }

        return partTypes.toString();
    }

}
