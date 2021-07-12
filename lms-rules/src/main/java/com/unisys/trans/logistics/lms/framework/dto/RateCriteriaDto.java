/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>RateCriteriaDto</code> contain details of RateCriteria.
 * <p>
 * This contains all information about RateCriteria.
 * <p>
 * This contains the following attributes:
 * <li>rateCriteriaCode
 * <li>rateOid
 * <li>rateConstructionAreaCode
 * <li>rateCriteriaDeletionDate
 * <li>additionalRateCriteriaCode
 * <li>multiDestCode
 * <li>multiOriginCode
 */
public class RateCriteriaDto {

    /**
     * Attribute to hold <code>additionalRateCriteriaCode</code> property.
     */
    private String additionalRateCriteriaCode;

    /**
     * Attribute to hold <code>multiDestCode</code> property.
     */
    private String multiDestCode;

    /**
     * Attribute to hold <code>multiOriginCode</code> property.
     */
    private String multiOriginCode;

    /**
     * Attribute to hold <code>rateConstructionAreaCode</code> property.
     */
    private Integer rateConstructionAreaCode;

    /**
     * Attribute to hold <code>rateCriteriaCode</code> property.
     */
    private String rateCriteriaCode;

    /**
     * Attribute to hold <code>rateCriteriaDeletionDate</code> property.
     */
    private Date rateCriteriaDeletionDate;

    /**
     * Attribute to hold <code>rateOid</code> property.
     */
    private long rateOid;

    /**
     * Gets the <code>additionalRateCriteriaCode</code> property.
     * 
     * 
     * @return the current value of the <code>additionalRateCriteriaCode</code> property.
     */
    public String getAdditionalRateCriteriaCode() {
        return this.additionalRateCriteriaCode;
    }

    /**
     * Gets the <code>multiDestCode</code> property.
     * 
     * 
     * @return the current value of the <code>multiDestCode</code> property.
     */
    public String getMultiDestCode() {
        return this.multiDestCode;
    }

    /**
     * Gets the <code>multiOriginCode</code> property.
     * 
     * 
     * @return the current value of the <code>multiOriginCode</code> property.
     */
    public String getMultiOriginCode() {
        return this.multiOriginCode;
    }

    /**
     * Gets the <code>rateConstructionAreaCode</code> property.
     * 
     * 
     * @return the current value of the <code>rateConstructionAreaCode</code> property.
     */
    public Integer getRateConstructionAreaCode() {
        return this.rateConstructionAreaCode;
    }

    /**
     * Gets the <code>rateCriteriaCode</code> property.
     * 
     * 
     * @return the current value of the <code>rateCriteriaCode</code> property.
     */
    public String getRateCriteriaCode() {
        return this.rateCriteriaCode;
    }

    /**
     * Gets the <code>rateCriteriaDeletionDate</code> property.
     * 
     * 
     * @return the current value of the <code>rateCriteriaDeletionDate</code> property.
     */
    public Date getRateCriteriaDeletionDate() {
        return ContractUtility.getClonedDate(this.rateCriteriaDeletionDate);
    }

    /**
     * Gets the <code>rateOid</code> property.
     * 
     * 
     * @return the current value of the <code>rateOid</code> property.
     */
    public long getRateOid() {
        return this.rateOid;
    }

    /**
     * Sets the <code>additionalRateCriteriaCode</code> data transfer object.
     * <p>
     * 
     * @param pAdditionalRateCriteriaCode
     *            holds the new value of <code>additionalRateCriteriaCode</code>.
     */
    public void setAdditionalRateCriteriaCode(final String pAdditionalRateCriteriaCode) {
        this.additionalRateCriteriaCode = pAdditionalRateCriteriaCode;
    }

    /**
     * Sets the <code>multiDestCode</code> data transfer object.
     * <p>
     * 
     * @param pMultiDestCode
     *            holds the new value of <code>multiDestCode</code>.
     */
    public void setMultiDestCode(final String pMultiDestCode) {
        this.multiDestCode = pMultiDestCode;
    }

    /**
     * Sets the <code>multiOriginCode</code> data transfer object.
     * <p>
     * 
     * @param pMultiOriginCode
     *            holds the new value of <code>multiOriginCode</code>.
     */
    public void setMultiOriginCode(final String pMultiOriginCode) {
        this.multiOriginCode = pMultiOriginCode;
    }

    /**
     * Sets the <code>rateConstructionAreaCode</code> data transfer object.
     * <p>
     * 
     * @param pRateConstructionAreaCode
     *            holds the new value of <code>rateConstructionAreaCode</code>.
     */
    public void setRateConstructionAreaCode(final Integer pRateConstructionAreaCode) {
        this.rateConstructionAreaCode = pRateConstructionAreaCode;
    }

    /**
     * Sets the <code>rateCriteriaCode</code> data transfer object.
     * <p>
     * 
     * @param pRateCriteriaCode
     *            holds the new value of <code>rateCriteriaCode</code>.
     */
    public void setRateCriteriaCode(final String pRateCriteriaCode) {
        this.rateCriteriaCode = pRateCriteriaCode;
    }

    /**
     * Sets the <code>rateCriteriaDeletionDate</code> data transfer object.
     * <p>
     * 
     * @param pRateCriteriaDeletionDate
     *            holds the new value of <code>rateCriteriaDeletionDate</code>.
     */
    public void setRateCriteriaDeletionDate(final Date pRateCriteriaDeletionDate) {
        this.rateCriteriaDeletionDate = ContractUtility.getClonedDate(pRateCriteriaDeletionDate);
    }

    /**
     * Sets the <code>rateOid</code> data transfer object.
     * <p>
     * 
     * @param pRateOid
     *            holds the new value of <code>rateOid</code>.
     */
    public void setRateOid(final long pRateOid) {
        this.rateOid = pRateOid;
    }

}
