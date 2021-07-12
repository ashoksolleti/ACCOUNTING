/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>ClassRatingRuleDto</code> contain details of ClassRatingRule.
 * <p>
 * This contains all information about ClassRatingRule.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>carrierCode
 * <li>classRatingId
 * <li>oId
 * <li>classRatingIdDescription
 * <li>classRatingRulesEntryDtos
 * <li>iataAreaFrom
 * <li>iataAreraTo
 * </ul>
 */
public class ClassRatingRuleDto extends PersistenceObjectDto {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>classRatingId</code> property.
     */
    private String classRatingId;

    /**
     * Attribute to hold <code>classRatingIdDescription</code> property.
     */
    private String classRatingIdDescription;

    /**
     * Attribute to hold <code>classRatingRulesEntryDtos</code> property.
     */
    private List<ClassRatingRuleEntryDto> classRatingRulesEntryDtos;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>rateSource</code> property.
     */
    private String rateSource;

    /**
     * Gets the <code>CarrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @return the current value of the <code>CarrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
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
     * Gets the <code>classRatingIdDescription</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5000 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * THE AUTOMOTIVE VEHICLES ARE ELECTRICAL
     * <p>
     * 
     * @return the current value of the <code>classRatingIdDescription</code> property.
     */
    public String getClassRatingIdDescription() {
        return this.classRatingIdDescription;
    }

    /**
     * Gets the <code>classRatingRulesEntryDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>classRatingRulesEntryDtos</code> property.
     */
    public List<ClassRatingRuleEntryDto> getClassRatingRulesEntryDtos() {
        if (this.classRatingRulesEntryDtos == null) {
            this.classRatingRulesEntryDtos = new ArrayList<ClassRatingRuleEntryDto>();
        }
        return this.classRatingRulesEntryDtos;
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
     * Gets the <code>RateSource</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Characters
     * <p>
     * <b>Example: </b><br>
     * IRI
     * <p>
     * 
     * @return the current value of the <code>rateSource</code> property.
     */
    public String getRateSource() {
        return this.rateSource;
    }

    /**
     * Sets the <code>CarrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @param pCarrierCode
     *            the current value of the <code>CarrierCode</code> property.
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = pCarrierCode;
    }

    /**
     * Sets the <code>classRatingId</code> property.
     * <p>
     * 
     * @param pClassRatingId
     *            the current value of the <code>classRatingId</code> property.
     */
    public void setClassRatingId(final String pClassRatingId) {
        this.classRatingId = pClassRatingId;
    }

    /**
     * Sets the <code>classRatingIdDescription</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5000 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * THE AUTOMOTIVE VEHICLES ARE ELECTRICAL
     * <p>
     * 
     * @param pClassRatingIdDescription
     *            the current value of the <code>classRatingIdDescription</code> property.
     */
    public void setClassRatingIdDescription(
                final String pClassRatingIdDescription) {
        this.classRatingIdDescription = pClassRatingIdDescription;
    }

    /**
     * Sets the <code>classRatingRulesEntryDtos</code> property.
     * <p>
     * 
     * @param pClassRatingRulesEntryDtos
     *            the current value of the <code>classRatingRulesEntryDtos</code> property.
     */
    public void setClassRatingRulesEntryDtos(final List<ClassRatingRuleEntryDto> pClassRatingRulesEntryDtos) {
        this.classRatingRulesEntryDtos = pClassRatingRulesEntryDtos;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>RateSource</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * IRI
     * <p>
     * 
     * @param pRateSource
     *            the new value of the <code>rateSource</code> property.
     */
    public void setRateSource(final String pRateSource) {
        this.rateSource = pRateSource;
    }

}
