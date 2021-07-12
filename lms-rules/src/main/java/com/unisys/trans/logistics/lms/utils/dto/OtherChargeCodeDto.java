/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>OtherChargeCodeDto</code> holds all the attributes that are associated to an Other Charge Code.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>aggregateType
 * <li>allowableCurrencyCode
 * <li>allowableUsageCode
 * <li>autoAddChargeCode
 * <li>collectRateTableCode
 * <li>defaultSubCode
 * <li>description
 * <li>descriptionRequiredIndicator
 * <li>dueCode
 * <li>generationCode
 * <li>oId
 * <li>otherChargeCode
 * <li>otherChargeSubCodeDtos
 * <li>prepaidRateTableCode
 * <li>requiredParticipantCode
 * <li>specialValidationRule
 * <li>subcodeRequired
 * </code>
 * </ul>
 */

public class OtherChargeCodeDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 4913648766078423207L;

    /**
     * Attribute to hold <code>aggregateType</code> property.
     */
    private String aggregateType;

    /**
     * Attribute to hold <code>allowableCurrencyCode</code> property.
     */
    private String allowableCurrencyCode;

    /**
     * Attribute to hold <code>allowableUsageCode</code> property.
     */
    private int allowableUsageCode;

    /**
     * Attribute to hold <code>autoAddChargeCode</code> property.
     */
    private String autoAddChargeCode;

    /**
     * Attribute to hold <code>collectRateTableCode</code> property.
     */
    private String collectRateTableCode;

    /**
     * Attribute to hold <code>defaultSubCode</code> property.
     */
    private String defaultSubCode;

    /**
     * Attribute to hold <code>description</code> property.
     */
    private String description;

    /**
     * Attribute to hold <code>descriptionRequiredIndicator</code> property.
     * <p>
     * <li><code>true</code><br>
     * Description is mandatory
     * <li><code>false</code><br>
     * Description is not mandatory<br>
     */
    private boolean descriptionRequiredIndicator;

    /**
     * Attribute to hold <code>dueCode</code> property.
     */
    private String dueCode;

    /**
     * Attribute to hold <code>generationCode</code> property.
     */
    private String generationCode;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>otherChargeCode</code> property.
     */
    private String otherChargeCode;

    /**
     * Attribute to hold <code>otherChargeSubCodeDtos</code> property.
     */
    private List<OtherChargeSubCodeDto> otherChargeSubCodes;

    /**
     * Attribute to hold <code>prepaidRateTableCode</code> property.
     */
    private String prepaidRateTableCode;

    /**
     * Attribute to hold <code>requiredParticipantCode</code> property.
     */
    private String requiredParticipantCode;

    /**
     * Attribute to hold <code>specialValidationRule</code> property.
     */
    private int specialValidationRule;

    public boolean getIncludeRevenueIndicator() {
		return includeRevenueIndicator;
	}

	public void setIncludeRevenueIndicator(boolean includeRevenueIndicator) {
		this.includeRevenueIndicator = includeRevenueIndicator;
	}

	public boolean getIncludeProrationIndicator() {
		return includeProrationIndicator;
	}

	public void setIncludeProrationIndicator(boolean includeProrationIndicator) {
		this.includeProrationIndicator = includeProrationIndicator;
	}

	/**
     * Attribute to hold <code>subcodeRequired</code> property.
     */
    private String subcodeRequired;
    
    private boolean includeRevenueIndicator;
    
    
    private boolean includeProrationIndicator;

	private String groupCode;

	private String standardOrcontractBaseRate;
	private String paycargoPaymentAllowed;

    /**
     * <code>Default constructor</code>.
     */
    public OtherChargeCodeDto() {

    }

    /**
     * Constructor with <code>OId</code> and <code>OtherChargeCode</code> as an argument.
     * <p>
     * 
     * @param pOId the new value of <code>OId</code>.<br>
     *            <p>
     * @param pOtherChargeCode the new value of <code>OtherChargeCode</code>.<br>
     */
    public OtherChargeCodeDto(final Long pOId, final String pOtherChargeCode) {
        this.oId = pOId;
        this.otherChargeCode = pOtherChargeCode;
    }

    /**
     * Gets the <code>aggregateType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 alpha numeric<br>
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @return the current value of <code>aggregateType</code> property.<br>
     */
    public String getAggregateType() {
        return this.aggregateType;
    }

    /**
     * Gets the <code>allowableCurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabetic<br>
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of <code>allowableCurrencyCode</code> property.<br>
     */
    public String getAllowableCurrencyCode() {
        return this.allowableCurrencyCode;
    }

    /**
     * Gets the <code>allowableUsageCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 3
     * <p>
     * 
     * @return the current value of <code>allowableUsageCode</code> property.<br>
     */
    public int getAllowableUsageCode() {
        return this.allowableUsageCode;
    }

    /**
     * Gets the <code>autoAddChargeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 alpha numeric<br>
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @return the current value of <code>autoAddChargeCode</code> property.<br>
     */
    public String getAutoAddChargeCode() {
        return this.autoAddChargeCode;
    }

    /**
     * Gets the <code>collectRateTableCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabetic<br>
     * <p>
     * <b>Example: </b><br>
     * b
     * <p>
     * 
     * @return the current value of <code>collectRateTableCode</code> property.<br>
     */
    public String getCollectRateTableCode() {
        return this.collectRateTableCode;
    }

    /**
     * Gets the <code>defaultSubCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 alphabetic<br>
     * <p>
     * <b>Example: </b><br>
     * AB
     * <p>
     * 
     * @return the current value of <code>defaultSubCode</code> property.<br>
     */
    public String getDefaultSubCode() {
        return this.defaultSubCode;
    }

    /**
     * Gets the <code>description</code> property.
     * <p>
     * <b>Format: </b><br>
     * 50 character set<br>
     * <p>
     * <b>Example: </b><br>
     * FUEL
     * <p>
     * 
     * @return the current value of <code>description</code> property.<br>
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>descriptionRequiredIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false<br>
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @return the current value of <code>descriptionRequiredIndicator</code> property.<br>
     */
    public boolean getDescriptionRequiredIndicator() {
        return this.descriptionRequiredIndicator;
    }

    /**
     * Gets the <code>dueCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabetic<br>
     * <p>
     * <b>Example: </b><br>
     * E
     * <p>
     * 
     * @return the current value of <code>dueCode</code> property.<br>
     */
    public String getDueCode() {
        return this.dueCode;
    }

    /**
     * Gets the <code>generationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabetic<br>
     * <p>
     * <b>Example: </b><br>
     * H
     * <p>
     * 
     * @return the current value of <code>generationCode</code> property.<br>
     */
    public String getGenerationCode() {
        return this.generationCode;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>otherChargeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 alpha numeric<br>
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @return the current value of <code>otherChargeCode</code> property.<br>
     */
    public String getOtherChargeCode() {
        return this.otherChargeCode;
    }

    /**
     * Gets the <code>otherChargeSubCodes</code> property.
     * <p>
     * 
     * @return the current value of <code>otherChargeSubCodes</code> property.<br>
     */
    public List<OtherChargeSubCodeDto> getOtherChargeSubCodes() {
        if (this.otherChargeSubCodes == null) {
            this.otherChargeSubCodes = new ArrayList<OtherChargeSubCodeDto>();
        }
        return this.otherChargeSubCodes;
    }

    /**
     * Gets the <code>prepaidRateTableCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabetic<br>
     * <p>
     * <b>Example: </b><br>
     * D
     * <p>
     * 
     * @return the current value of <code>prepaidRateTableCode</code> property.<br>
     */
    public String getPrepaidRateTableCode() {
        return this.prepaidRateTableCode;
    }

    /**
     * Gets the <code>requiredParticipantCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabetic<br>
     * <p>
     * <b>Example: </b><br>
     * Y
     * <p>
     * 
     * @return the current value of <code>requiredParticipantCode</code> property.<br>
     */
    public String getRequiredParticipantCode() {
        return this.requiredParticipantCode;
    }

    /**
     * Gets the <code>specialValidationRule</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 1
     * <p>
     * 
     * @return the current value of <code>specialValidationRule</code> property.<br>
     */
    public int getSpecialValidationRule() {
        return this.specialValidationRule;
    }

    /**
     * Gets the <code>subcodeRequired</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabetic<br>
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of <code>subcodeRequired</code> property.<br>
     */
    public String getSubcodeRequired() {
        return this.subcodeRequired;
    }

    /**
     * Sets the <code>aggregateType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 alpha numeric <br>
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @param pAggregateType the new value of <code>aggregateType</code> property.<br>
     */
    public void setAggregateType(final String pAggregateType) {
        this.aggregateType = ContractUtility.convertToUpperCase(pAggregateType);
    }

    /**
     * Sets the <code>allowableCurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabetic <br>
     * <p>
     * <b>Example: </b><br>
     * C
     * <p>
     * 
     * @param pAllowableCurrencyCode the new value of <code>allowableCurrencyCode</code> property.<br>
     */
    public void setAllowableCurrencyCode(final String pAllowableCurrencyCode) {
        this.allowableCurrencyCode = ContractUtility.convertToUpperCase(pAllowableCurrencyCode);
    }

    /**
     * Sets the <code>allowableUsageCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 4
     * <p>
     * 
     * @param pAllowableUsageCode the new value of <code>allowableUsageCode</code> property.<br>
     */
    public void setAllowableUsageCode(final int pAllowableUsageCode) {
        this.allowableUsageCode = pAllowableUsageCode;
    }

    /**
     * Sets the <code>autoAddChargeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 alpha numeric <br>
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @param pAutoAddChargeCode the new value of <code>autoAddChargeCode</code> property.<br>
     */
    public void setAutoAddChargeCode(final String pAutoAddChargeCode) {
        this.autoAddChargeCode = ContractUtility.convertToUpperCase(pAutoAddChargeCode);
    }

    /**
     * Sets the <code>collectRateTableCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabetic <br>
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pCollectRateTableCode the new value of <code>collectRateTableCode</code> property.<br>
     */
    public void setCollectRateTableCode(final String pCollectRateTableCode) {
        this.collectRateTableCode = ContractUtility.convertToUpperCase(pCollectRateTableCode);
    }

    /**
     * Sets the <code>defaultSubCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 alphabetic <br>
     * <p>
     * <b>Example: </b><br>
     * AB
     * <p>
     * 
     * @param pDefaultSubCode the new value of <code>defaultSubCode</code> property.<br>
     */
    public void setDefaultSubCode(final String pDefaultSubCode) {
        this.defaultSubCode = ContractUtility.convertToUpperCase(pDefaultSubCode);
    }

    /**
     * Sets the <code>description</code> property.
     * <p>
     * <b>Format: </b><br>
     * 50 character set <br>
     * <p>
     * <b>Example: </b><br>
     * FUEL
     * <p>
     * 
     * @param pDescription the new value of <code>description</code> property.<br>
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the <code>descriptionRequiredIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false <br>
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pDescriptionRequiredIndicator the new value of <code>descriptionRequiredIndicator</code>
     *            property.<br>
     */
    public void setDescriptionRequiredIndicator(final boolean pDescriptionRequiredIndicator) {
        this.descriptionRequiredIndicator = pDescriptionRequiredIndicator;
    }

    /**
     * Sets the <code>dueCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabetic <br>
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pDueCode the new value of <code>dueCode</code> property.<br>
     */
    public void setDueCode(final String pDueCode) {
        this.dueCode = ContractUtility.convertToUpperCase(pDueCode);
    }

    /**
     * Sets the <code>generationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabetic <br>
     * <p>
     * <b>Example: </b><br>
     * H
     * <p>
     * 
     * @param pGenerationCode the new value of <code>generationCode</code> property.<br>
     */
    public void setGenerationCode(final String pGenerationCode) {
        this.generationCode = ContractUtility.convertToUpperCase(pGenerationCode);
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
     * Sets the <code>otherChargeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 alpha numeric <br>
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @param pOtherChargeCode the new value of <code>otherChargeCode</code> property.<br>
     */
    public void setOtherChargeCode(final String pOtherChargeCode) {
        this.otherChargeCode = ContractUtility.convertToUpperCase(pOtherChargeCode);
    }

    /**
     * Sets the <code>otherChargeSubCodeDtos</code> property.
     * <p>
     * 
     * @param pOtherChargeSubCodeDtos the new value of <code>otherChargeSubCodeDtos</code> property.<br>
     */
    public void setOtherChargeSubCodes(final List<OtherChargeSubCodeDto> pOtherChargeSubCodeDtos) {
        this.otherChargeSubCodes = pOtherChargeSubCodeDtos;
    }

    /**
     * Sets the <code>prepaidRateTableCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabetic <br>
     * <p>
     * <b>Example: </b><br>
     * D
     * <p>
     * 
     * @param pPrepaidRateTableCode the new value of <code>prepaidRateTableCode</code> property.<br>
     */
    public void setPrepaidRateTableCode(final String pPrepaidRateTableCode) {
        this.prepaidRateTableCode = ContractUtility.convertToUpperCase(pPrepaidRateTableCode);
    }

    /**
     * Sets the <code>requiredParticipantCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabetic <br>
     * <p>
     * <b>Example: </b><br>
     * Y
     * <p>
     * 
     * @param pRequiredParticipantCode the new value of <code>requiredParticipantCode</code> property.<br>
     */
    public void setRequiredParticipantCode(final String pRequiredParticipantCode) {
        this.requiredParticipantCode = ContractUtility.convertToUpperCase(pRequiredParticipantCode);
    }

    /**
     * Sets the <code>specialValidationRule</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 or 2 numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 3
     * <p>
     * 
     * @param pSpecialValidationRule the new value of <code>specialValidationRule</code> property.<br>
     */
    public void setSpecialValidationRule(final int pSpecialValidationRule) {
        this.specialValidationRule = pSpecialValidationRule;
    }

    /**
     * Sets the <code>subcodeRequired</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabetic <br>
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pSubcodeRequired the new value of <code>subcodeRequired</code> property.<br>
     */
    public void setSubcodeRequired(final String pSubcodeRequired) {
        this.subcodeRequired = ContractUtility.convertToUpperCase(pSubcodeRequired);
    }
	public String getGroupCode() {
		return this.groupCode;
	}

	public void setGroupCode(final String pGroupCode) {
		this.groupCode = pGroupCode;
	}

	public String getStandardOrcontractBaseRate() {
		return this.standardOrcontractBaseRate;
	}

	public void setStandardOrcontractBaseRate(final String pStandardOrcontractBaseRate) {
		this.standardOrcontractBaseRate = pStandardOrcontractBaseRate;
	}

	public String getPaycargoPaymentAllowed() {
		return paycargoPaymentAllowed;
	}

	public void setPaycargoPaymentAllowed(String paycargoPaymentAllowed) {
		this.paycargoPaymentAllowed = paycargoPaymentAllowed;
	}
}
