/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.AccountRegionType;
import com.unisys.trans.logistics.lms.framework.dto.ContactDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>SalesInfoDto</code> class contain information specific to a SalesInfo.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>accountRegion
 * <li>areaRepresentative
 * <li>countryRepresentative
 * <li>stations
 * <li>salesContact
 * <li>salesContact1
 * <li>salesContact2
 * <li>contactInformation
 * <li>oId
 * <li>primaryCommodity
 * <li>seasonalShipping
 * <li>specialHandling
 * <li>accountExecutive
 * <li>natureOfBusiness
 * </code>
 * </ul>
 */
public class SalesInfoDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4057053650363428519L;

    /**
     * Attribute to hold <code>accountExecutive</code> property.
     */
    private String accountExecutive;

    /**
     * Attribute to hold <code>accountRegion</code> property.
     */
    private AccountRegionType accountRegion;

    /**
     * Attribute to hold <code>areaRepresentative</code> property.
     */
    private String areaRepresentative;

    /**
     * Attribute to hold <code>contactInformation</code> property.
     */
    private String contactInformation;

    /**
     * Attribute to hold <code>countryRepresentative</code> property.
     */
    private String countryRepresentative;

    /**
     * Attribute to hold <code>natureOfBusiness</code> property.
     */
    private String natureOfBusiness;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>primaryCommodity</code> property.
     */
    private String primaryCommodity;

    /**
     * Attribute to hold <code>salesContact</code> property.
     */
    private ContactDto salesContact;

    /**
     * Attribute to hold <code>salesContact1</code> property.
     */
    private String salesContact1;

    /**
     * Attribute to hold <code>salesContact2</code> property.
     */
    private String salesContact2;

    /**
     * Attribute to hold <code>seasonalShipping</code> property.
     */
    private String seasonalShipping;

    /**
     * Attribute to hold <code>specialHandling</code> property.
     */
    private String specialHandling;

    /**
     * Attribute to hold <code>stations</code> property.
     */
    private List<String> stations;

    /**
     * Gets the <code>accountExecutive</code> property.
     * <p>
     * 
     * @return the current value of the <code>accountExecutive</code> property.
     */
    public String getAccountExecutive() {
        return this.accountExecutive;
    }

    /**
     * Gets the <code>accountRegion</code> property.
     * <p>
     * 
     * @return the current value of the <code>accountRegion</code> property.
     */
    public AccountRegionType getAccountRegion() {
        return this.accountRegion;
    }

    /**
     * Gets the <code>areaRepresentative</code> property.
     * <p>
     * 
     * @return the current value of the <code>areaRepresentative</code> property.
     */
    public String getAreaRepresentative() {
        return this.areaRepresentative;
    }

    /**
     * Gets the <code>contactInformation</code> property.
     * <p>
     * 
     * @return the current value of the <code>contactInformation</code> property.
     */
    public String getContactInformation() {
        return this.contactInformation;
    }

    /**
     * Gets the <code>countryRepresentative</code> property.
     * <p>
     * 
     * @return the current value of the <code>countryRepresentative</code> property.
     */
    public String getCountryRepresentative() {
        return this.countryRepresentative;
    }

    /**
     * Gets the <code>natureOfBusiness</code> property.
     * <p>
     * 
     * @return the current value of the <code>natureOfBusiness</code> property.
     */
    public String getNatureOfBusiness() {
        return this.natureOfBusiness;
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
     * Gets the <code>primaryCommodity</code> property.
     * <p>
     * 
     * @return the current value of the <code>primaryCommodity</code> property.
     */
    public String getPrimaryCommodity() {
        return this.primaryCommodity;
    }

    /**
     * Gets the <code>salesContact</code> property.
     * <p>
     * 
     * @return the current value of the <code>salesContact</code> property.
     */
    public ContactDto getSalesContact() {
        if (this.salesContact == null) {
            this.salesContact = new ContactDto();
        }
        return this.salesContact;
    }

    /**
     * Gets the <code>salesContact1</code> property.
     * <p>
     * 
     * @return the current value of the <code>salesContact1</code> property.
     */
    public String getSalesContact1() {
        return this.salesContact1;
    }

    /**
     * Gets the <code>salesContact2</code> property.
     * <p>
     * 
     * @return the current value of the <code>salesContact2</code> property.
     */
    public String getSalesContact2() {
        return this.salesContact2;
    }

    /**
     * Gets the <code>seasonalShipping</code> property.
     * <p>
     * 
     * @return the current value of the <code>seasonalShipping</code> property.
     */
    public String getSeasonalShipping() {
        return this.seasonalShipping;
    }

    /**
     * Gets the <code>specialHandling</code> property.
     * <p>
     * 
     * @return the current value of the <code>specialHandling</code> property.
     */
    public String getSpecialHandling() {
        return this.specialHandling;
    }

    /**
     * Gets the <code>stations</code> property.
     * <p>
     * 
     * @return the current value of the <code>stations</code> property.
     */
    public List<String> getStations() {
        return this.stations;
    }

    /**
     * Sets the <code>accountExecutive</code> property.
     * <p>
     * 
     * @param pAccountExecutive the new value of the <code>accountExecutive</code> property.
     */
    public void setAccountExecutive(final String pAccountExecutive) {
        this.accountExecutive = pAccountExecutive;
    }

    /**
     * Sets the <code>accountRegion</code> property.
     * <p>
     * 
     * @param pAccountRegion the new value of the <code>accountRegion</code> property.
     */
    public void setAccountRegion(final AccountRegionType pAccountRegion) {
        this.accountRegion = pAccountRegion;
    }

    /**
     * Sets the <code>areaRepresentative</code> property.
     * <p>
     * 
     * @param pAreaRepresentative the new value of the <code>areaRepresentative</code> property.
     */
    public void setAreaRepresentative(final String pAreaRepresentative) {
        this.areaRepresentative = pAreaRepresentative;
    }

    /**
     * Sets the <code>contactInformation</code> property.
     * <p>
     * 
     * @param pContactInformation the new value of the <code>contactInformation</code> property.
     */
    public void setContactInformation(final String pContactInformation) {
        this.contactInformation = pContactInformation;
    }

    /**
     * Sets the <code>countryRepresentative</code> property.
     * <p>
     * 
     * @param pCountryRepresentative the new value of the <code>countryRepresentative</code> property.
     */
    public void setCountryRepresentative(final String pCountryRepresentative) {
        this.countryRepresentative = pCountryRepresentative;
    }

    /**
     * Sets the <code>natureOfBusiness</code> property.
     * <p>
     * 
     * @param pNatureOfBusiness the new value of the <code>natureOfBusiness</code> property.
     */
    public void setNatureOfBusiness(final String pNatureOfBusiness) {
        this.natureOfBusiness = pNatureOfBusiness;
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
     * Sets the <code>primaryCommodity</code> property.
     * <p>
     * 
     * @param pPrimaryCommodity the new value of the <code>primaryCommodity</code> property.
     */
    public void setPrimaryCommodity(final String pPrimaryCommodity) {
        this.primaryCommodity = pPrimaryCommodity;
    }

    /**
     * Sets the <code>salesContact</code> property.
     * <p>
     * 
     * @param pSalesContact the new value of the <code>salesContact</code> property.
     */
    public void setSalesContact(final ContactDto pSalesContact) {
        this.salesContact = pSalesContact;
    }

    /**
     * Sets the <code>salesContact1</code> property.
     * <p>
     * 
     * @param pSalesContact1 the new value of the <code>salesContact1</code> property.
     */
    public void setSalesContact1(final String pSalesContact1) {
        this.salesContact1 = pSalesContact1;
    }

    /**
     * Sets the <code>salesContact2</code> property.
     * <p>
     * 
     * @param pSalesContact2 the new value of the <code>salesContact2</code> property.
     */
    public void setSalesContact2(final String pSalesContact2) {
        this.salesContact2 = pSalesContact2;
    }

    /**
     * Sets the <code>seasonalShipping</code> property.
     * <p>
     * 
     * @param pSeasonalShipping the new value of the <code>seasonalShipping</code> property.
     */
    public void setSeasonalShipping(final String pSeasonalShipping) {
        this.seasonalShipping = pSeasonalShipping;
    }

    /**
     * Sets the <code>specialHandling</code> property.
     * <p>
     * 
     * @param pSpecialHandling the new value of the <code>specialHandling</code> property.
     */
    public void setSpecialHandling(final String pSpecialHandling) {
        this.specialHandling = pSpecialHandling;
    }

    /**
     * Sets the <code>stations</code> property.
     * <p>
     * 
     * @param pStations the new value of the <code>stations</code> property.
     */
    public void setStations(final List<String> pStations) {
        this.stations = pStations;
    }

}
