/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.response;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;

/**
 * <code>RateCriteriaPfmResponse</code> contains the response.
 */
public class RateCriteriaPfmResponse extends BatchResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>addonRateCount</code>.
     */
    private long addonRateCount;

    /**
     * Attribute to hold the <code>addonRateDeleteCount</code>.
     */
    private long addonRateDeleteCount;

    /**
     * Attribute to hold the <code>addOnRateInfo</code> object.
     */

    private String addOnRateInfo;

    /**
     * Attribute to hold the <code>aggregateCount</code>.
     */
    private long aggregateCount;

    /**
     * Attribute to hold the <code>aggregateDeleteCount</code>.
     */
    private long aggregateDeleteCount;

    /**
     * Attribute to hold the <code>aggregateDiscrepencyInfo</code> object.
     */
    private String aggregateDiscrepencyInfo;

    /**
     * Attribute to hold the <code>aggregateInfo</code>.
     */
    private String aggregateInfo;

    /**
     * Attribute to hold the <code>airportDiscrepancyInfo</code>.
     */
    private String airportDiscrepancyInfo;

    /**
     * Attribute to hold the <code>airportInfo</code>.
     */
    private String airportInfo;

    /**
     * Attribute to hold the <code>carrierCodeExist</code>.
     */
    private boolean carrierCodeExist;
    
    /**
     * Attribute to hold the <code>cityCodeExist</code>.
     */
    private boolean cityCodeExist;

    /**
     * Attribute to hold the <code>carrierDiscrepancyInfo</code>.
     */
    private String carrierDiscrepancyInfo;

    /**
     * Attribute to hold the <code>carrierInfo</code>.
     */
    private String carrierInfo;

    /**
     * Attribute to hold the <code>cityCount</code>.
     */
    private long cityCount;

    /**
     * Attribute to hold the <code>cityDiscrepancyInfo</code>.
     */
    private String cityDiscrepancyInfo;

    /**
     * Attribute to hold the <code>cityInfo</code>.
     */
    private String cityInfo;

    /**
     * Attribute to hold the <code>classRatingIdDiscrepancyInfo</code>.
     */
    private String classRatingIdDiscrepancyInfo;

    /**
     * Attribute to hold the <code>classRatingIdInfo</code>.
     */
    private String classRatingIdInfo;

    /**
     * Attribute to hold the <code>classRatingRuleCount</code>.
     */
    private long classRatingRuleCount;

    /**
     * Attribute to hold the <code>classRatingRuleDeleteCount</code>.
     */
    private long classRatingRuleDeleteCount;

    /**
     * Attribute to hold the <code>classRatingRuleInfo</code> object.
     */

    private String classRatingRuleInfo;

    /**
     * Attribute to hold the <code>commodityDiscrepancyInfo</code>.
     */
    private String commodityDiscrepancyInfo;

    /**
     * Attribute to hold the <code>commodityInfo</code>.
     */
    private String commodityInfo;

    /**
     * Attribute to hold the <code>contractCount</code>.
     */
    private long contractCount;

    /**
     * Attribute to hold the <code>contractDeleteCount</code>.
     */
    private long contractDeleteCount;

    /**
     * Attribute to hold the <code>contractRateInfo</code> object.
     */
    private String contractRateInfo;

    /**
     * Attribute to hold the <code>jointRateCount</code>.
     */
    private long jointRateCount;

    /**
     * Attribute to hold the <code>jointRateDeleteCount</code>.
     */
    private long jointRateDeleteCount;

    /**
     * Attribute to hold the <code>jointRateInfo</code> object.
     */
    private String jointRateInfo;

    /**
     * Attribute to hold the <code>nonActiveAddOnRateExist</code>.
     */
    private boolean nonActiveAddOnRateExist;

    /**
     * Attribute to hold the <code>nonActiveClassRatingIdExist</code>.
     */
    private boolean nonActiveClassRatingIdExist;

    /**
     * Attribute to hold the <code>nonActiveClassRatingRuleExist</code>.
     */
    private boolean nonActiveClassRatingRuleExist;

    /**
     * Attribute to hold the <code>nonActiveContractExist</code>.
     */
    private boolean nonActiveContractExist;

    /**
     * Attribute to hold the <code>nonActiveJointRateExist</code>.
     */
    private boolean nonActiveJointRateExist;

    /**
     * Attribute to hold the <code>nonActiveRatingSecuritExist</code>.
     */
    private boolean nonActiveRatingSecuritExist;

    /**
     * Attribute to hold the <code>nonActiveRatingSecurityUserExist</code>.
     */
    private boolean nonActiveRatingSecurityUserExist;

    /**
     * Attribute to hold the <code>nonActiveRatingSecurityUserGroupExist</code>.
     */
    private boolean nonActiveRatingSecurityUserGroupExist;

    /**
     * Attribute to hold the <code>nonActiveSpotRateExist</code>.
     */
    private boolean nonActiveSpotRateExist;

    /**
     * Attribute to hold the <code>nonActiveTariffRateExist</code>.
     */
    private boolean nonActiveTariffRateExist;

    /**
     * Attribute to hold the <code>nonActiveUldTypeExist</code>.
     */
    private boolean nonActiveUldTypeExist;

    /**
     * Attribute to hold the <code>participantGroupInfo</code> object.
     */
    private String participantGroupInfo;

    /**
     * Attribute to hold the <code>participantInfo</code> object.
     */
    private String participantInfo;

    /**
     * Attribute to hold the <code>rateCodes</code> object.
     */
    private List<String> rateCodes;

    /**
     * Attribute to hold the <code>rateSourceDiscrepancyInfo</code>.
     */
    private String rateSourceDiscrepancyInfo;

    /**
     * Attribute to hold the <code>rateSourceInfo</code>.
     */
    private String rateSourceInfo;

    /**
     * Attribute to hold the <code>rateTypeDiscrepancyInfo</code>.
     */
    private String rateTypeDiscrepancyInfo;

    /**
     * Attribute to hold the <code>rateTypeInfo</code>.
     */
    private String rateTypeInfo;

    /**
     * Attribute to hold the <code>ratingNoteCount</code>.
     */
    private long ratingNoteCount;

    /**
     * Attribute to hold the <code>ratingNoteDeleteCount</code>.
     */
    private long ratingNoteDeleteCount;

    /**
     * Attribute to hold the <code>ratingNoteDiscrepancyInfo</code>.
     */
    private String ratingNoteDiscrepancyInfo;

    /**
     * Attribute to hold the <code>ratingNoteExist</code>.
     */
    private boolean ratingNoteExist;

    /**
     * Attribute to hold the <code>ratingNoteInfo</code>.
     */
    private String ratingNoteInfo;

    /**
     * Attribute to hold the <code>ratingSecurityUserCount</code>.
     */
    private long ratingSecurityUserCount;

    /**
     * Attribute to hold the <code>ratingSecurityUserDeleteCount</code>.
     */
    private long ratingSecurityUserDeleteCount;

    /**
     * Attribute to hold the <code>ratingSecurityUserGroupCount</code>.
     */
    private long ratingSecurityUserGroupCount;

    /**
     * Attribute to hold the <code>ratingSecurityUserGroupDeleteCount</code>.
     */
    private long ratingSecurityUserGroupDeleteCount;

    /**
     * Attribute to hold the <code>ratingSecurityUserGroupInfo</code>.
     */
    private String ratingSecurityUserGroupInfo;

    /**
     * Attribute to hold the <code>ratingSecurityUserInfo</code>.
     */
    private String ratingSecurityUserInfo;

    /**
     * Attribute to hold the <code>rcaCodes</code>.
     */
    private List<Integer> rcaCodes;

    /**
     * Attribute to hold the <code>rcaCount</code>.
     */
    private long rcaCount;

    /**
     * Attribute to hold the <code>rcaDiscrepencyInfo</code>.
     */
    private String rcaDiscrepencyInfo;

    /**
     * Attribute to hold the <code>rcaExist</code>.
     */
    private boolean rcaExist;

    /**
     * Attribute to hold the <code>rcaInfo</code>.
     */
    private String rcaInfo;

    /**
     * Attribute to hold the <code>spotRateCount</code>.
     */
    private long spotRateCount;

    /**
     * Attribute to hold the <code>spotRateDeleteCount</code>.
     */
    private long spotRateDeleteCount;

    /**
     * Attribute to hold the <code>spotRateInfo</code> object.
     */

    private String spotRateInfo;

    /**
     * Attribute to hold the <code>tariffCount</code>.
     */
    private long tariffCount;

    /**
     * Attribute to hold the <code>tariffDeleteCount</code>.
     */
    private long tariffDeleteCount;

    /**
     * Attribute to hold the <code>tariffRateInfo</code> object.
     */
    private String tariffRateInfo;

    /**
     * Attribute to hold the <code>uldTypeCount</code>.
     */
    private long uldTypeCount;

    /**
     * Attribute to hold the <code>uldTypeDeleteCount</code>.
     */
    private long uldTypeDeleteCount;

    /**
     * Attribute to hold the <code>uldTypeDiscrepancyInfo</code>.
     */
    private String uldTypeDiscrepancyInfo;

    /**
     * Attribute to hold the <code>uldTypeInfo</code>.
     */
    private String uldTypeInfo;

    /**
     * Attribute to hold the <code>userCount</code>.
     */
    private long userCount;

    /**
     * Attribute to hold the <code>userGroupCount</code>.
     */
    private long userGroupCount;

    /**
     * Attribute to hold the <code>userGroupInfo</code>.
     */
    private String userGroupInfo;

    /**
     * Attribute to hold the <code>userInfo</code>.
     */
    private String userInfo;

    /**
     * Gets the <code>AddonRateCount</code> property.
     * <p>
     * 
     * @return the current value of <code>AddonRateCount</code> property.
     */
    public long getAddonRateCount() {
        return this.addonRateCount;
    }

    /**
     * Gets the <code>AddonRateDeleteCount</code> property.
     * <p>
     * 
     * @return the current value of <code>AddonRateDeleteCount</code> property.
     */
    public long getAddonRateDeleteCount() {
        return this.addonRateDeleteCount;
    }

    /**
     * Gets the <code>AddOnRateInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>AddOnRateInfo</code> property.
     */
    public String getAddOnRateInfo() {
        return this.addOnRateInfo;
    }

    /**
     * Gets the <code>aggregateCount</code> property.
     * <p>
     * 
     * @return the current value of <code>aggregateCount</code> property.
     */
    public long getAggregateCount() {
        return this.aggregateCount;
    }

    /**
     * Gets the <code>aggregateDeleteCount</code> property.
     * <p>
     * 
     * @return the current value of <code>aggregateDeleteCount</code> property.
     */
    public long getAggregateDeleteCount() {
        return this.aggregateDeleteCount;
    }

    /**
     * Gets the <code>aggregateDiscrepencyInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>aggregateDiscrepencyInfo</code> property.
     */
    public String getAggregateDiscrepencyInfo() {
        return this.aggregateDiscrepencyInfo;
    }

    /**
     * Gets the <code>aggregateInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>aggregateInfo</code> property.
     */
    public String getAggregateInfo() {
        return this.aggregateInfo;
    }

    /**
     * Gets the <code>airportDiscrepancyInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>airportDiscrepancyInfo</code> property.
     */
    public String getAirportDiscrepancyInfo() {
        return this.airportDiscrepancyInfo;
    }

    /**
     * Gets the <code>airportInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>airportInfo</code> property.
     */
    public String getAirportInfo() {
        return this.airportInfo;
    }

    /**
     * Gets the <code>carrierCodeExist</code> property.
     * <p>
     * 
     * @return the current value of <code>carrierCodeExist</code> property.
     */
    public boolean getCarrierCodeExist() {
        return this.carrierCodeExist;
    }

    /**
     * Gets the <code>carrierDiscrepancyInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>carrierDiscrepancyInfo</code> property.
     */
    public String getCarrierDiscrepancyInfo() {
        return this.carrierDiscrepancyInfo;
    }

    /**
     * Gets the <code>carrierInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>carrierInfo</code> property.
     */
    public String getCarrierInfo() {
        return this.carrierInfo;
    }

    /**
     * Gets the <code>cityCount</code> property.
     * <p>
     * 
     * @return the current value of <code>cityCount</code> property.
     */
    public long getCityCount() {
        return this.cityCount;
    }

    /**
     * Gets the <code>cityDiscrepancyInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>cityDiscrepancyInfo</code> property.
     */
    public String getCityDiscrepancyInfo() {
        return this.cityDiscrepancyInfo;
    }

    /**
     * Gets the <code>cityInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>cityInfo</code> property.
     */
    public String getCityInfo() {
        return this.cityInfo;
    }

    /**
     * Gets the <code>classRatingIdDiscrepancyInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>classRatingIdDiscrepancyInfo</code> property.
     */
    public String getClassRatingIdDiscrepancyInfo() {
        return this.classRatingIdDiscrepancyInfo;
    }

    /**
     * Gets the <code>classRatingIdInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>classRatingIdInfo</code> property.
     */
    public String getClassRatingIdInfo() {
        return this.classRatingIdInfo;
    }

    /**
     * Gets the <code>classRatingRuleCount</code> property.
     * <p>
     * 
     * @return the current value of <code>classRatingRuleCount</code> property.
     */
    public long getClassRatingRuleCount() {
        return this.classRatingRuleCount;
    }

    /**
     * Gets the <code>classRatingRuleDeleteCount</code> property.
     * <p>
     * 
     * @return the current value of <code>classRatingRuleDeleteCount</code> property.
     */
    public long getClassRatingRuleDeleteCount() {
        return this.classRatingRuleDeleteCount;
    }

    /**
     * Gets the <code>classRatingRuleInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>classRatingRuleInfo</code> property.
     */
    public String getClassRatingRuleInfo() {
        return this.classRatingRuleInfo;
    }

    /**
     * Gets the <code>commodityInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>commodityInfo</code> property.
     */
    public String getCommodityInfo() {
        return this.commodityInfo;
    }

    /**
     * Gets the <code>commodityDiscrepancyInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>commodityDiscrepancyInfo</code> property.
     */
    public String getCommodtiyDiscrepancyInfo() {
        return this.commodityDiscrepancyInfo;
    }

    /**
     * Gets the <code>contractCount</code> property.
     * <p>
     * 
     * @return the current value of <code>contractCount</code> property.
     */
    public long getContractCount() {
        return this.contractCount;
    }

    /**
     * Gets the <code>contractDeleteCount</code> property.
     * <p>
     * 
     * @return the current value of <code>contractDeleteCount</code> property.
     */
    public long getContractDeleteCount() {
        return this.contractDeleteCount;
    }

    /**
     * Gets the <code>contractRateInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>contractRateInfo</code> property.
     */
    public String getContractRateInfo() {
        return this.contractRateInfo;
    }

    /**
     * Gets the <code>jointRateCount</code> property.
     * <p>
     * 
     * @return the current value of <code>jointRateCount</code> property.
     */
    public long getJointRateCount() {
        return this.jointRateCount;
    }

    /**
     * Gets the <code>jointRateDeleteCount</code> property.
     * <p>
     * 
     * @return the current value of <code>jointRateDeleteCount</code> property.
     */
    public long getJointRateDeleteCount() {
        return this.jointRateDeleteCount;
    }

    /**
     * Gets the <code>jointRateInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>jointRateInfo</code> property.
     */
    public String getJointRateInfo() {
        return this.jointRateInfo;
    }

    /**
     * Gets the <code>nonActiveAddOnRateExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>nonActiveAddOnRateExist</code> property.
     */
    public boolean getNonActiveAddOnRateExist() {
        return this.nonActiveAddOnRateExist;
    }

    /**
     * Gets the <code>nonActiveClassRatingIdExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>nonActiveClassRatingIdExist</code> property.
     */
    public boolean getNonActiveClassRatingIdExist() {
        return this.nonActiveClassRatingIdExist;
    }

    /**
     * Gets the <code>nonActiveClassRatingRuleExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>nonActiveClassRatingRuleExist</code> property.
     */
    public boolean getNonActiveClassRatingRuleExist() {
        return this.nonActiveClassRatingRuleExist;
    }

    /**
     * Gets the <code>nonActiveContractExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>nonActiveContractExist</code> property.
     */
    public boolean getNonActiveContractExist() {
        return this.nonActiveContractExist;
    }

    /**
     * Gets the <code>nonActiveJointRateExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>nonActiveJointRateExist</code> property.
     */
    public boolean getNonActiveJointRateExist() {
        return this.nonActiveJointRateExist;
    }

    /**
     * Gets the <code>nonActiveRatingSecuritExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>nonActiveRatingSecuritExist</code> property.
     */
    public boolean getNonActiveRatingSecuritExist() {
        return this.nonActiveRatingSecuritExist;
    }

    /**
     * Gets the <code>nonActiveRatingSecurityUserExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>nonActiveRatingSecurityUserExist</code> property.
     */
    public boolean getNonActiveRatingSecurityUserExist() {
        return this.nonActiveRatingSecurityUserExist;
    }

    /**
     * Gets the <code>nonActiveRatingSecurityUserGroupExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>nonActiveRatingSecurityUserGroupExist</code> property.
     */
    public boolean getNonActiveRatingSecurityUserGroupExist() {
        return this.nonActiveRatingSecurityUserGroupExist;
    }

    /**
     * Gets the <code>nonActiveSpotRateExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>nonActiveSpotRateExist</code> property.
     */
    public boolean getNonActiveSpotRateExist() {
        return this.nonActiveSpotRateExist;
    }

    /**
     * Gets the <code>nonActiveTariffRateExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>nonActiveTariffRateExist</code> property.
     */
    public boolean getNonActiveTariffRateExist() {
        return this.nonActiveTariffRateExist;
    }

    /**
     * Gets the <code>nonActiveUldTypeExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>nonActiveUldTypeExist</code> property.
     */
    public boolean getNonActiveUldTypeExist() {
        return this.nonActiveUldTypeExist;
    }

    /**
     * Gets the <code>participantGroupInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>participantGroupInfo</code> property.
     */
    public String getParticipantGroupInfo() {
        return participantGroupInfo;
    }

    /**
     * Gets the <code>participantInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>participantInfo</code> property.
     */
    public String getParticipantInfo() {
        return this.participantInfo;
    }

    /**
     * Gets the <code>rateCodes</code> property.
     * <p>
     * 
     * @return the current value of <code>rateCodes</code> property.
     */
    public List<String> getRateCodes() {
        return this.rateCodes;
    }

    /**
     * Gets the <code>rateSourceDiscrepancyInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>rateSourceDiscrepancyInfo</code> property.
     */
    public String getRateSourceDiscrepancyInfo() {
        return this.rateSourceDiscrepancyInfo;
    }

    /**
     * Gets the <code>rateSourceInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>rateSourceInfo</code> property.
     */
    public String getRateSourceInfo() {
        return this.rateSourceInfo;
    }

    /**
     * Gets the <code>rateTypeDiscrepancyInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>rateTypeDiscrepancyInfo</code> property.
     */
    public String getRateTypeDiscrepancyInfo() {
        return this.rateTypeDiscrepancyInfo;
    }

    /**
     * Gets the <code>rateTypeInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>rateTypeInfo</code> property.
     */
    public String getRateTypeInfo() {
        return this.rateTypeInfo;
    }

    /**
     * Gets the <code>ratingNoteCount</code> property.
     * <p>
     * 
     * @return the current value of <code>ratingNoteCount</code> property.
     */
    public long getRatingNoteCount() {
        return this.ratingNoteCount;
    }

    /**
     * Gets the <code>ratingNoteDeleteCount</code> property.
     * <p>
     * 
     * @return the current value of <code>ratingNoteDeleteCount</code> property.
     */
    public long getRatingNoteDeleteCount() {
        return this.ratingNoteDeleteCount;
    }

    /**
     * Gets the <code>ratingNoteDiscrepancyInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>ratingNoteDiscrepancyInfo</code> property.
     */
    public String getRatingNoteDiscrepancyInfo() {
        return this.ratingNoteDiscrepancyInfo;
    }

    /**
     * Gets the <code>ratingNoteExist</code> property.
     * <p>
     * 
     * @return the current value of <code>ratingNoteExist</code> property.
     */
    public boolean getRatingNoteExist() {
        return this.ratingNoteExist;
    }

    /**
     * Gets the <code>ratingNoteInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>ratingNoteInfo</code> property.
     */
    public String getRatingNoteInfo() {
        return this.ratingNoteInfo;
    }

    /**
     * Gets the <code>ratingSecurityUserCount</code> property.
     * <p>
     * 
     * @return the current value of <code>ratingSecurityUserCount</code> property.
     */
    public long getRatingSecurityUserCount() {
        return this.ratingSecurityUserCount;
    }

    /**
     * Gets the <code>ratingSecurityUserDeleteCount</code> property.
     * <p>
     * 
     * @return the current value of <code>ratingSecurityUserDeleteCount</code> property.
     */
    public long getRatingSecurityUserDeleteCount() {
        return this.ratingSecurityUserDeleteCount;
    }

    /**
     * Gets the <code>ratingSecurityUserGroupCount</code> property.
     * <p>
     * 
     * @return the current value of <code>ratingSecurityUserGroupCount</code> property.
     */
    public long getRatingSecurityUserGroupCount() {
        return this.ratingSecurityUserGroupCount;
    }

    /**
     * Gets the <code>ratingSecurityUserGroupDeleteCount</code> property.
     * <p>
     * 
     * @return the current value of <code>ratingSecurityUserGroupDeleteCount</code> property.
     */
    public long getRatingSecurityUserGroupDeleteCount() {
        return this.ratingSecurityUserGroupDeleteCount;
    }

    /**
     * Gets the <code>ratingSecurityUserGroupInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>ratingSecurityUserGroupInfo</code> property.
     */
    public String getRatingSecurityUserGroupInfo() {
        return this.ratingSecurityUserGroupInfo;
    }

    /**
     * Gets the <code>ratingSecurityUserInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>ratingSecurityUserInfo</code> property.
     */
    public String getRatingSecurityUserInfo() {
        return this.ratingSecurityUserInfo;
    }

    /**
     * Gets the <code>rcaCodes</code> property.
     * <p>
     * 
     * @return the current value of <code>rcaCodes</code> property.
     */
    public List<Integer> getRcaCodes() {
        return this.rcaCodes;
    }

    /**
     * Gets the <code>rcaCount</code> property.
     * <p>
     * 
     * @return the current value of <code>rcaCount</code> property.
     */
    public long getRcaCount() {
        return this.rcaCount;
    }

    /**
     * Gets the <code>rcaDiscrepencyInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>rcaDiscrepencyInfo</code> property.
     */
    public String getRcaDiscrepencyInfo() {
        return this.rcaDiscrepencyInfo;
    }

    /**
     * Gets the <code>rcaExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>rcaExist</code> property.
     */
    public boolean getRcaExist() {
        return this.rcaExist;
    }

    /**
     * Gets the <code>rcaInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>rcaInfo</code> property.
     */
    public String getRcaInfo() {
        return this.rcaInfo;
    }

    /**
     * Gets the <code>spotRateCount</code> property.
     * <p>
     * 
     * @return the current value of <code>spotRateCount</code> property.
     */
    public long getSpotRateCount() {
        return this.spotRateCount;
    }

    /**
     * Gets the <code>spotRateDeleteCount</code> property.
     * <p>
     * 
     * @return the current value of <code>spotRateDeleteCount</code> property.
     */
    public long getSpotRateDeleteCount() {
        return this.spotRateDeleteCount;
    }

    /**
     * Gets the <code>spotRateInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>spotRateInfo</code> property.
     */
    public String getSpotRateInfo() {
        return this.spotRateInfo;
    }

    /**
     * Gets the <code>tariffCount</code> property.
     * <p>
     * 
     * @return the current value of <code>tariffCount</code> property.
     */
    public long getTariffCount() {
        return this.tariffCount;
    }

    /**
     * Gets the <code>tariffDeleteCount</code> property.
     * <p>
     * 
     * @return the current value of <code>tariffDeleteCount</code> property.
     */
    public long getTariffDeleteCount() {
        return this.tariffDeleteCount;
    }

    /**
     * Gets the <code>tariffRateInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>tariffRateInfo</code> property.
     */
    public String getTariffRateInfo() {
        return this.tariffRateInfo;
    }

    /**
     * Gets the <code>uldTypeCount</code> property.
     * <p>
     * 
     * @return the current value of <code>uldTypeCount</code> property.
     */
    public long getUldTypeCount() {
        return this.uldTypeCount;
    }

    /**
     * Gets the <code>uldTypeDeleteCount</code> property.
     * <p>
     * 
     * @return the current value of <code>uldTypeDeleteCount</code> property.
     */
    public long getUldTypeDeleteCount() {
        return this.uldTypeDeleteCount;
    }

    /**
     * Gets the <code>uldTypeDiscrepancyInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>uldTypeDiscrepancyInfo</code> property.
     */
    public String getUldTypeDiscrepancyInfo() {
        return this.uldTypeDiscrepancyInfo;
    }

    /**
     * Gets the <code>uldTypeInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>uldTypeInfo</code> property.
     */
    public String getUldTypeInfo() {
        return this.uldTypeInfo;
    }

    /**
     * Gets the <code>userCount</code> property.
     * <p>
     * 
     * @return the current value of <code>userCount</code> property.
     */
    public long getUserCount() {
        return this.userCount;
    }

    /**
     * Gets the <code>userGroupCount</code> property.
     * <p>
     * 
     * @return the current value of <code>userGroupCount</code> property.
     */
    public long getUserGroupCount() {
        return this.userGroupCount;
    }

    /**
     * Gets the <code>userGroupInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>userGroupInfo</code> property.
     */
    public String getUserGroupInfo() {
        return this.userGroupInfo;
    }

    /**
     * Gets the <code>userInfo</code> property.
     * <p>
     * 
     * @return the current value of <code>userInfo</code> property.
     */
    public String getUserInfo() {
        return this.userInfo;
    }

    /**
     * Sets the <code>addonRateCount</code> property.
     * <p>
     * 
     * @param pAddonRateCount
     *            the new value of <code>addonRateCount</code> property.
     */
    public void setAddonRateCount(final long pAddonRateCount) {
        this.addonRateCount = pAddonRateCount;
    }

    /**
     * Sets the <code>addonRateDeleteCount</code> property.
     * <p>
     * 
     * @param pAddonRateDeleteCount
     *            the new value of <code>addonRateDeleteCount</code> property.
     */

    public void setAddonRateDeleteCount(final long pAddonRateDeleteCount) {
        this.addonRateDeleteCount = pAddonRateDeleteCount;
    }

    /**
     * Sets the <code>addOnRateInfo</code> property.
     * <p>
     * 
     * @param pAddOnRateInfo
     *            the new value of <code>addOnRateInfo</code> property.
     */
    public void setAddOnRateInfo(final String pAddOnRateInfo) {
        this.addOnRateInfo = pAddOnRateInfo;
    }

    /**
     * Sets the <code>aggregateCount</code> property.
     * <p>
     * 
     * @param pAggregateCount
     *            the new value of <code>aggregateCount</code> property.
     */
    public void setAggregateCount(final long pAggregateCount) {
        this.aggregateCount = pAggregateCount;
    }

    /**
     * Sets the <code>aggregateDeleteCount</code> property.
     * <p>
     * 
     * @param pAggregateDeleteCount
     *            the new value of <code>aggregateDeleteCount</code> property.
     */
    public void setAggregateDeleteCount(final long pAggregateDeleteCount) {
        this.aggregateDeleteCount = pAggregateDeleteCount;
    }

    /**
     * Sets the <code>aggregateDiscrepencyInfo</code> property.
     * <p>
     * 
     * @param pAggregateDiscrepencyInfo
     *            the new value of <code>aggregateDiscrepencyInfo</code> property.
     */
    public void setAggregateDiscrepencyInfo(
                final String pAggregateDiscrepencyInfo) {
        this.aggregateDiscrepencyInfo = pAggregateDiscrepencyInfo;
    }

    /**
     * Sets the <code>aggregateInfo</code> property.
     * <p>
     * 
     * @param pAggregateInfo
     *            the new value of <code>aggregateInfo</code> property.
     */
    public void setAggregateInfo(final String pAggregateInfo) {
        this.aggregateInfo = pAggregateInfo;
    }

    /**
     * Sets the <code>airportDiscrepancyInfo</code> property.
     * <p>
     * 
     * @param pAirportDiscrepancyInfo
     *            the new value of <code>airportDiscrepancyInfo</code> property.
     */
    public void setAirportDiscrepancyInfo(final String pAirportDiscrepancyInfo) {
        this.airportDiscrepancyInfo = pAirportDiscrepancyInfo;
    }

    /**
     * Sets the <code>airportInfo</code> property.
     * <p>
     * 
     * @param pAirportInfo
     *            the new value of <code>airportInfo</code> property.
     */
    public void setAirportInfo(final String pAirportInfo) {
        this.airportInfo = pAirportInfo;
    }

    /**
     * Sets the <code>carrierCodeExist</code> property.
     * <p>
     * 
     * @param pCarrierCodeExist
     *            the new value of <code>carrierCodeExist</code> property.
     */
    public void setCarrierCodeExist(final boolean pCarrierCodeExist) {
        this.carrierCodeExist = pCarrierCodeExist;
    }

    /**
     * Sets the <code>carrierDiscrepancyInfo</code> property.
     * <p>
     * 
     * @param pCarrierDiscrepancyInfo
     *            the new value of <code>carrierDiscrepancyInfo</code> property.
     */
    public void setCarrierDiscrepancyInfo(final String pCarrierDiscrepancyInfo) {
        this.carrierDiscrepancyInfo = pCarrierDiscrepancyInfo;
    }

    /**
     * Sets the <code>carrierInfo</code> property.
     * <p>
     * 
     * @param pCarrierInfo
     *            the new value of <code>carrierInfo</code> property.
     */
    public void setCarrierInfo(final String pCarrierInfo) {
        this.carrierInfo = pCarrierInfo;
    }

    /**
     * Sets the <code>cityCount</code> property.
     * <p>
     * 
     * @param pCityCount
     *            the new value of <code>cityCount</code> property.
     */
    public void setCityCount(final long pCityCount) {
        this.cityCount = pCityCount;
    }

    /**
     * Sets the <code>cityDiscrepancyInfo</code> property.
     * <p>
     * 
     * @param pCityDiscrepancyInfo
     *            the new value of <code>cityDiscrepancyInfo</code> property.
     */
    public void setCityDiscrepancyInfo(final String pCityDiscrepancyInfo) {
        this.cityDiscrepancyInfo = pCityDiscrepancyInfo;
    }

    /**
     * Sets the <code>cityInfo</code> property.
     * <p>
     * 
     * @param pCityInfo
     *            the new value of <code>cityInfo</code> property.
     */
    public void setCityInfo(final String pCityInfo) {
        this.cityInfo = pCityInfo;
    }

    /**
     * Sets the <code>classRatingIdDiscrepancyInfo</code> property.
     * <p>
     * 
     * @param pClassRatingIdDiscrepancyInfo
     *            the new value of <code>classRatingIdDiscrepancyInfo</code> property.
     */
    public void setClassRatingIdDiscrepancyInfo(
                final String pClassRatingIdDiscrepancyInfo) {
        this.classRatingIdDiscrepancyInfo = pClassRatingIdDiscrepancyInfo;
    }

    /**
     * Sets the <code>classRatingIdInfo</code> property.
     * <p>
     * 
     * @param pClassRatingIdInfo
     *            the new value of <code>classRatingIdInfo</code> property.
     */
    public void setClassRatingIdInfo(final String pClassRatingIdInfo) {
        this.classRatingIdInfo = pClassRatingIdInfo;
    }

    /**
     * Sets the <code>classRatingRuleCount</code> property.
     * <p>
     * 
     * @param pClassRatingRuleCount
     *            the new value of <code>classRatingRuleCount</code> property.
     */
    public void setClassRatingRuleCount(final long pClassRatingRuleCount) {
        this.classRatingRuleCount = pClassRatingRuleCount;
    }

    /**
     * Sets the <code>classRatingRuleDeleteCount</code> property.
     * <p>
     * 
     * @param pClassRatingRuleDeleteCount
     *            the new value of <code>classRatingRuleDeleteCount</code> property.
     */
    public void setClassRatingRuleDeleteCount(
                final long pClassRatingRuleDeleteCount) {
        this.classRatingRuleDeleteCount = pClassRatingRuleDeleteCount;
    }

    /**
     * Sets the <code>classRatingRuleInfo</code> property.
     * <p>
     * 
     * @param pClassRatingRuleInfo
     *            the new value of <code>classRatingRuleInfo</code> property.
     */
    public void setClassRatingRuleInfo(final String pClassRatingRuleInfo) {
        this.classRatingRuleInfo = pClassRatingRuleInfo;
    }

    /**
     * Sets the <code>commodityInfo</code> property.
     * <p>
     * 
     * @param pCommodityInfo
     *            the new value of <code>commodityInfo</code> property.
     */
    public void setCommodityInfo(final String pCommodityInfo) {
        this.commodityInfo = pCommodityInfo;
    }

    /**
     * Sets the <code>commodityDiscrepancyInfo</code> property.
     * <p>
     * 
     * @param pCommodityDiscrepancyInfo
     *            the new value of <code>commodityDiscrepancyInfo</code> property.
     */
    public void setCommodtiyDiscrepancyInfo(
                final String pCommodityDiscrepancyInfo) {
        this.commodityDiscrepancyInfo = pCommodityDiscrepancyInfo;
    }

    /**
     * Sets the <code>contractCount</code> property.
     * <p>
     * 
     * @param pContractCount
     *            the new value of <code>contractCount</code> property.
     */
    public void setContractCount(final long pContractCount) {
        this.contractCount = pContractCount;
    }

    /**
     * Sets the <code>contractDeleteCount</code> property.
     * <p>
     * 
     * @param pContractDeleteCount
     *            the new value of <code>contractDeleteCount</code> property.
     */
    public void setContractDeleteCount(final long pContractDeleteCount) {
        this.contractDeleteCount = pContractDeleteCount;
    }

    /**
     * Sets the <code>contractRateInfo</code> property.
     * <p>
     * 
     * @param pContractRateInfo
     *            the new value of <code>contractRateInfo</code> property.
     */
    public void setContractRateInfo(final String pContractRateInfo) {
        this.contractRateInfo = pContractRateInfo;
    }

    /**
     * Sets the <code>jointRateCount</code> property.
     * <p>
     * 
     * @param pJointRateCount
     *            the new value of <code>jointRateCount</code> property.
     */
    public void setJointRateCount(final long pJointRateCount) {
        this.jointRateCount = pJointRateCount;
    }

    /**
     * Sets the <code>jointRateDeleteCount</code> property.
     * <p>
     * 
     * @param pJointRateDeleteCount
     *            the new value of <code>jointRateDeleteCount</code> property.
     */
    public void setJointRateDeleteCount(final long pJointRateDeleteCount) {
        this.jointRateDeleteCount = pJointRateDeleteCount;
    }

    /**
     * Sets the <code>jointRateInfo</code> property.
     * <p>
     * 
     * @param pJointRateInfo
     *            the new value of <code>jointRateInfo</code> property.
     */
    public void setJointRateInfo(final String pJointRateInfo) {
        this.jointRateInfo = pJointRateInfo;
    }

    /**
     * Sets the <code>nonActiveAddOnRateExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pNonActiveAddOnRateExist
     *            the current value of the <code>nonActiveAddOnRateExist</code> property.
     */
    public void setNonActiveAddOnRateExist(final boolean pNonActiveAddOnRateExist) {
        this.nonActiveAddOnRateExist = pNonActiveAddOnRateExist;
    }

    /**
     * Sets the <code>NonActiveClassRatingIdExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pNonActiveClassRatingIdExist
     *            the current value of the <code>NonActiveClassRatingIdExist</code> property.
     */
    public void setNonActiveClassRatingIdExist(final boolean pNonActiveClassRatingIdExist) {
        this.nonActiveClassRatingIdExist = pNonActiveClassRatingIdExist;
    }

    /**
     * Sets the <code>nonActiveClassRatingRuleExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pNonActiveClassRatingRuleExist
     *            the current value of the <code>nonActiveClassRatingRuleExist</code> property.
     */
    public void setNonActiveClassRatingRuleExist(final boolean pNonActiveClassRatingRuleExist) {
        this.nonActiveClassRatingRuleExist = pNonActiveClassRatingRuleExist;
    }

    /**
     * Sets the <code>nonActiveContractExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pNonActiveContractExist
     *            the current value of the <code>nonActiveContractExist</code> property.
     */
    public void setNonActiveContractExist(final boolean pNonActiveContractExist) {
        this.nonActiveContractExist = pNonActiveContractExist;
    }

    /**
     * Sets the <code>nonActiveJointRateExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pNonActiveJointRateExist
     *            the current value of the <code>nonActiveJointRateExist</code> property.
     */
    public void setNonActiveJointRateExist(final boolean pNonActiveJointRateExist) {
        this.nonActiveJointRateExist = pNonActiveJointRateExist;
    }

    /**
     * Sets the <code>nonActiveRatingSecuritExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pNonActiveRatingSecuritExist
     *            the current value of the <code>nonActiveRatingSecuritExist</code> property.
     */
    public void setNonActiveRatingSecuritExist(final boolean pNonActiveRatingSecuritExist) {
        this.nonActiveRatingSecuritExist = pNonActiveRatingSecuritExist;
    }

    /**
     * Sets the <code>nonActiveRatingSecurityUserExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pNonActiveRatingSecurityUserExist
     *            the current value of the <code>nonActiveRatingSecurityUserExist</code> property.
     */
    public void setNonActiveRatingSecurityUserExist(final boolean pNonActiveRatingSecurityUserExist) {
        this.nonActiveRatingSecurityUserExist = pNonActiveRatingSecurityUserExist;
    }

    /**
     * Sets the <code>nonActiveRatingSecurityUserGroupExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pNonActiveRatingSecurityUserGroupExist
     *            the current value of the <code>nonActiveRatingSecurityUserGroupExist</code> property.
     */
    public
                void
                setNonActiveRatingSecurityUserGroupExist(final boolean pNonActiveRatingSecurityUserGroupExist) {
        this.nonActiveRatingSecurityUserGroupExist = pNonActiveRatingSecurityUserGroupExist;
    }

    /**
     * Sets the <code>nonActiveSpotRateExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pNonActiveSpotRateExist
     *            the current value of the <code>nonActiveSpotRateExist</code> property.
     */
    public void setNonActiveSpotRateExist(final boolean pNonActiveSpotRateExist) {
        this.nonActiveSpotRateExist = pNonActiveSpotRateExist;
    }

    /**
     * Sets the <code>nonActiveTariffRateExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pNonActiveTariffRateExist
     *            the current value of the <code>nonActiveTariffRateExist</code> property.
     */
    public void setNonActiveTariffRateExist(final boolean pNonActiveTariffRateExist) {
        this.nonActiveTariffRateExist = pNonActiveTariffRateExist;
    }

    /**
     * Sets the <code>nonActiveUldTypeExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pNonActiveUldTypeExist
     *            the current value of the <code>nonActiveUldTypeExist</code> property.
     */
    public void setNonActiveUldTypeExist(final boolean pNonActiveUldTypeExist) {
        this.nonActiveUldTypeExist = pNonActiveUldTypeExist;
    }

    /**
     * Sets the <code>participantGroupInfo</code> property.
     * <p>
     * 
     * @param pParticipantGroupInfo
     *            the new value of <code>rateSourceDiscrepancyInfo</code> property.
     */
    public void setParticipantGroupInfo(final String pParticipantGroupInfo) {
        this.participantGroupInfo = pParticipantGroupInfo;
    }

    /**
     * Sets the <code>participantInfo</code> property.
     * <p>
     * 
     * @param pParticipantInfo
     *            the new value of <code>participantInfo</code> property.
     */
    public void setParticipantInfo(final String pParticipantInfo) {
        this.participantInfo = pParticipantInfo;
    }

    /**
     * Sets the <code>rateCodes</code> property.
     * <p>
     * 
     * @param pRateCodes
     *            the new value of <code>rateCodes</code> property.
     */
    public void setRateCodes(final List<String> pRateCodes) {
        this.rateCodes = pRateCodes;
    }

    /**
     * Sets the <code>rateSourceDiscrepancyInfo</code> property.
     * <p>
     * 
     * @param pRateSourceDiscrepancyInfo
     *            the new value of <code>rateSourceDiscrepancyInfo</code> property.
     */
    public void setRateSourceDiscrepancyInfo(
                final String pRateSourceDiscrepancyInfo) {
        this.rateSourceDiscrepancyInfo = pRateSourceDiscrepancyInfo;
    }

    /**
     * Sets the <code>rateSourceInfo</code> property.
     * <p>
     * 
     * @param pRateSourceInfo
     *            the new value of <code>rateSourceInfo</code> property.
     */
    public void setRateSourceInfo(final String pRateSourceInfo) {
        this.rateSourceInfo = pRateSourceInfo;
    }

    /**
     * Sets the <code>rateTypeDiscrepancyInfo</code> property.
     * <p>
     * 
     * @param pRateTypeDiscrepancyInfo
     *            the new value of <code>rateTypeDiscrepancyInfo</code> property.
     */
    public void setRateTypeDiscrepancyInfo(final String pRateTypeDiscrepancyInfo) {
        this.rateTypeDiscrepancyInfo = pRateTypeDiscrepancyInfo;
    }

    /**
     * Sets the <code>rateTypeInfo</code> property.
     * <p>
     * 
     * @param pRateTypeInfo
     *            the new value of <code>rateTypeInfo</code> property.
     */
    public void setRateTypeInfo(final String pRateTypeInfo) {
        this.rateTypeInfo = pRateTypeInfo;
    }

    /**
     * Sets the <code>ratingNoteCount</code> property.
     * <p>
     * 
     * @param pRatingNoteCount
     *            the new value of <code>ratingNoteCount</code> property.
     */
    public void setRatingNoteCount(final long pRatingNoteCount) {
        this.ratingNoteCount = pRatingNoteCount;
    }

    /**
     * Sets the <code>ratingNoteDeleteCount</code> property.
     * <p>
     * 
     * @param pRatingNoteDeleteCount
     *            the new value of <code>ratingNoteDeleteCount</code> property.
     */
    public void setRatingNoteDeleteCount(final long pRatingNoteDeleteCount) {
        this.ratingNoteDeleteCount = pRatingNoteDeleteCount;
    }

    /**
     * Sets the <code>ratingNoteDiscrepancyInfo</code> property.
     * <p>
     * 
     * @param pRatingNoteDiscrepancyInfo
     *            the new value of <code>ratingNoteDiscrepancyInfo</code> property.
     */
    public void setRatingNoteDiscrepancyInfo(
                final String pRatingNoteDiscrepancyInfo) {
        this.ratingNoteDiscrepancyInfo = pRatingNoteDiscrepancyInfo;
    }

    /**
     * Sets the <code>ratingNoteExist</code> property.
     * <p>
     * 
     * @param pRatingNoteExist
     *            the new value of <code>ratingNoteExist</code> property.
     */
    public void setRatingNoteExist(final boolean pRatingNoteExist) {
        this.ratingNoteExist = pRatingNoteExist;
    }

    /**
     * Sets the <code>ratingNoteInfo</code> property.
     * <p>
     * 
     * @param pRatingNoteInfo
     *            the new value of <code>ratingNoteInfo</code> property.
     */
    public void setRatingNoteInfo(final String pRatingNoteInfo) {
        this.ratingNoteInfo = pRatingNoteInfo;
    }

    /**
     * Sets the <code>ratingSecurityUserCount</code> property.
     * <p>
     * 
     * @param pRatingSecurityUserCount
     *            the new value of <code>ratingSecurityUserCount</code> property.
     */
    public void setRatingSecurityUserCount(final long pRatingSecurityUserCount) {
        this.ratingSecurityUserCount = pRatingSecurityUserCount;
    }

    /**
     * Sets the <code>ratingSecurityUserDeleteCount</code> property.
     * <p>
     * 
     * @param pRatingSecurityUserDeleteCount
     *            the new value of <code>ratingSecurityUserDeleteCount</code> property.
     */
    public void setRatingSecurityUserDeleteCount(final long pRatingSecurityUserDeleteCount) {
        this.ratingSecurityUserDeleteCount = pRatingSecurityUserDeleteCount;
    }

    /**
     * Sets the <code>ratingSecurityUserGroupCount</code> property.
     * <p>
     * 
     * @param pRatingSecurityUserGroupCount
     *            the new value of <code>ratingSecurityUserGroupCount</code> property.
     */
    public void setRatingSecurityUserGroupCount(
                final long pRatingSecurityUserGroupCount) {
        this.ratingSecurityUserGroupCount = pRatingSecurityUserGroupCount;
    }

    /**
     * Sets the <code>ratingSecurityUserGroupDeleteCount</code> property.
     * <p>
     * 
     * @param pRatingSecurityUserGroupDeleteCount
     *            the new value of <code>ratingSecurityUserGroupDeleteCount</code> property.
     */
    public void setRatingSecurityUserGroupDeleteCount(final long pRatingSecurityUserGroupDeleteCount) {
        this.ratingSecurityUserGroupDeleteCount = pRatingSecurityUserGroupDeleteCount;
    }

    /**
     * Sets the <code>ratingSecurityUserGroupInfo</code> property.
     * <p>
     * 
     * @param pRatingSecurityUserGroupInfo
     *            the new value of <code>ratingSecurityUserGroupInfo</code> property.
     */
    public void setRatingSecurityUserGroupInfo(
                final String pRatingSecurityUserGroupInfo) {
        this.ratingSecurityUserGroupInfo = pRatingSecurityUserGroupInfo;
    }

    /**
     * Sets the <code>ratingSecurityUserInfo</code> property.
     * <p>
     * 
     * @param pRatingSecurityUserInfo
     *            the new value of <code>ratingSecurityUserInfo</code> property.
     */

    public void setRatingSecurityUserInfo(final String pRatingSecurityUserInfo) {
        this.ratingSecurityUserInfo = pRatingSecurityUserInfo;
    }

    /**
     * Sets the <code>rcaCodes</code> property.
     * <p>
     * 
     * @param pRcaCodes
     *            the new value of <code>rcaCodes</code> property.
     */
    public void setRcaCodes(final List<Integer> pRcaCodes) {
        this.rcaCodes = pRcaCodes;
    }

    /**
     * Sets the <code>rcaCount</code> property.
     * <p>
     * 
     * @param pRcaCount
     *            the new value of <code>rcaCount</code> property.
     */

    public void setRcaCount(final long pRcaCount) {
        this.rcaCount = pRcaCount;
    }

    /**
     * Sets the <code>rcaDiscrepencyInfo</code> property.
     * <p>
     * 
     * @param pRcaDiscrepencyInfo
     *            the new value of <code>rcaDiscrepencyInfo</code> property.
     */

    public void setRcaDiscrepencyInfo(final String pRcaDiscrepencyInfo) {
        this.rcaDiscrepencyInfo = pRcaDiscrepencyInfo;
    }

    /**
     * Sets the <code>rcaExist</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pRcaExist
     *            the current value of the <code>rcaExist</code> property.
     */
    public void setRcaExist(final boolean pRcaExist) {
        this.rcaExist = pRcaExist;
    }

    /**
     * Sets the <code>rcaInfo</code> property.
     * <p>
     * 
     * @param pRcaInfo
     *            the new value of <code>rcaInfo</code> property.
     */

    public void setRcaInfo(final String pRcaInfo) {
        this.rcaInfo = pRcaInfo;
    }

    /**
     * Sets the <code>spotRateCount</code> property.
     * <p>
     * 
     * @param pSpotRateCount
     *            the new value of <code>spotRateCount</code> property.
     */
    public void setSpotRateCount(final long pSpotRateCount) {
        this.spotRateCount = pSpotRateCount;
    }

    /**
     * Sets the <code>spotRateDeleteCount</code> property.
     * <p>
     * 
     * @param pSpotRateDeleteCount
     *            the new value of <code>spotRateDeleteCount</code> property.
     */
    public void setSpotRateDeleteCount(final long pSpotRateDeleteCount) {
        this.spotRateDeleteCount = pSpotRateDeleteCount;
    }

    /**
     * Sets the <code>spotRateInfo</code> property.
     * <p>
     * 
     * @param pSpotRateInfo
     *            the new value of <code>spotRateInfo</code> property.
     */
    public void setSpotRateInfo(final String pSpotRateInfo) {
        this.spotRateInfo = pSpotRateInfo;
    }

    /**
     * Sets the <code>tariffCount</code> property.
     * <p>
     * 
     * @param pTariffCount
     *            the new value of <code>tariffCount</code> property.
     */
    public void setTariffCount(final long pTariffCount) {
        this.tariffCount = pTariffCount;
    }

    /**
     * Sets the <code>tariffDeleteCount</code> property.
     * <p>
     * 
     * @param pTariffDeleteCount
     *            the new value of <code>tariffDeleteCount</code> property.
     */
    public void setTariffDeleteCount(final long pTariffDeleteCount) {
        this.tariffDeleteCount = pTariffDeleteCount;
    }

    /**
     * Sets the <code>tariffRateInfo</code> property.
     * <p>
     * 
     * @param pTariffRateInfo
     *            the new value of <code>tariffRateInfo</code> property.
     */

    public void setTariffRateInfo(final String pTariffRateInfo) {
        this.tariffRateInfo = pTariffRateInfo;
    }

    /**
     * Sets the <code>uldTypeCount</code> property.
     * <p>
     * 
     * @param pUldTypeCount
     *            the new value of <code>uldTypeCount</code> property.
     */
    public void setUldTypeCount(final long pUldTypeCount) {
        this.uldTypeCount = pUldTypeCount;
    }

    /**
     * Sets the <code>uldTypeDeleteCount</code> property.
     * <p>
     * 
     * @param pUldTypeDeleteCount
     *            the new value of <code>uldTypeDeleteCount</code> property.
     */
    public void setUldTypeDeleteCount(final long pUldTypeDeleteCount) {
        this.uldTypeDeleteCount = pUldTypeDeleteCount;
    }

    /**
     * Sets the <code>uldTypeDiscrepancyInfo</code> property.
     * <p>
     * 
     * @param pUldTypeDiscrepancyInfo
     *            the new value of <code>uldTypeDiscrepancyInfo</code> property.
     */
    public void setUldTypeDiscrepancyInfo(final String pUldTypeDiscrepancyInfo) {
        this.uldTypeDiscrepancyInfo = pUldTypeDiscrepancyInfo;
    }

    /**
     * Sets the <code>uldTypeInfo</code> property.
     * <p>
     * 
     * @param pUldTypeInfo
     *            the new value of <code>uldTypeInfo</code> property.
     */
    public void setUldTypeInfo(final String pUldTypeInfo) {
        this.uldTypeInfo = pUldTypeInfo;
    }

    /**
     * Sets the <code>userCount</code> property.
     * <p>
     * 
     * @param pUserCount
     *            the new value of <code>userCount</code> property.
     */
    public void setUserCount(final long pUserCount) {
        this.userCount = pUserCount;
    }

    /**
     * Sets the <code>userGroupCount</code> property.
     * <p>
     * 
     * @param pUserGroupCount
     *            the new value of <code>userGroupCount</code> property.
     */
    public void setUserGroupCount(final long pUserGroupCount) {
        this.userGroupCount = pUserGroupCount;
    }

    /**
     * Sets the <code>userGroupInfo</code> property.
     * <p>
     * 
     * @param pUserGroupInfo
     *            the new value of <code>userGroupInfo</code> property.
     */
    public void setUserGroupInfo(final String pUserGroupInfo) {
        this.userGroupInfo = pUserGroupInfo;
    }

    /**
     * Sets the <code>userInfo</code> property.
     * <p>
     * 
     * @param pUserInfo
     *            the new value of <code>userInfo</code> property.
     */
    public void setUserInfo(final String pUserInfo) {
        this.userInfo = pUserInfo;
    }

    public boolean getCityCodeExist() {
        return cityCodeExist;
    }

    public void setCityCodeExist(boolean cityCodeExist) {
        this.cityCodeExist = cityCodeExist;
    }

}
