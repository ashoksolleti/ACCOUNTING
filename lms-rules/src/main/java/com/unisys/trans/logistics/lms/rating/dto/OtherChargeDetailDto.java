/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>OtherChargeDetailDto</code> class contain the details specific to an other charge rate type.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>otherChargeCode
 * <li>otherChargeSubCode
 * <li>description
 * <li>otherChargeRates
 * <li>geographicalLocation1
 * <li>geographicalLocation2
 * </code>
 * </ul>
 */
public class OtherChargeDetailDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7372205208952914139L;

    /**
     * Attribute to hold <code>description</code>.
     * <p>
     * Represents the description of the other charge code.If the description for other charge code is not
     * present then it will represents the description provided for other charge sub code.
     */
    private String description;

    /**
     * Attribute to hold <code>geographicLocation1</code>.
     * <p>
     * Represents the location associated with the other charge rates.
     */
    private String geographicalLocation1;

    /**
     * Attribute to hold <code>geographicLocation2</code>.
     * <p>
     * Represents the location associated with the other charge rates.
     */
    private String geographicalLocation2;

    /**
     * Attribute to hold <code>oId</code>.
     * <p>
     * Represents the unique key value for <code>OtherChargeDetailDto</code>.
     */
    private Long oId;

    /**
     * Attribute to hold <code>otherChargeCode</code>.
     * <p>
     * Represents the otherChargeCode which is associated with an air waybill during air waybill data capture.
     */
    private String otherChargeCode;

    /**
     * Attribute to hold <code>otherChargeRates</code>.
     * <p>
     * Represents the List of other charge rate data transfer objects that are associated with the other
     * charge.
     */
    private List<OtherChargeRateDto> otherChargeRates;

    /**
     * Attribute to hold <code>otherChargeSubCode</code>.
     * <p>
     * Represents the Sub codes for other charge code defines when a particular other charge has to be
     * applied.
     */
    private String otherChargeSubCode;

    /**
     * <code>Default constructor</code>.
     */
    public OtherChargeDetailDto() {

    }

    /**
     * Gets the <code>description</code> property.
     * <p>
     * Represents the description of the other charge code.If the description for other charge code is not
     * present then it will represents the description provided for other charge sub code.
     * <p>
     * <b>Format: </b><br>
     * 1-50 Any keyboard character.
     * <p>
     * <b>Example: </b><br>
     * Computer parts
     * <p>
     * 
     * @return the current value of the <code>description</code> property.<br>
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>geographicalLocation1</code> property.
     * <p>
     * Represents the location associated with the other charge rates.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric.
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>geographicalLocation1</code> property.<br>
     */
    public String getGeographicalLocation1() {
        return this.geographicalLocation1;
    }

    /**
     * Gets the <code>geographicalLocation2</code> property.
     * <p>
     * Represents the location associated with the other charge rates.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric.
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>geographicalLocation2</code> property.<br>
     */
    public String getGeographicalLocation2() {
        return this.geographicalLocation2;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>OtherChargeDetailDto</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>otherChargeCode</code> property.
     * <p>
     * Represents the otherChargeCode which is associated with an air waybill during air waybill data capture.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets(Upper Case).
     * <p>
     * <b>Example: </b><br>
     * AC
     * <p>
     * 
     * @return the current value of the <code>otherChargeCode</code> property.<br>
     */
    public String getOtherChargeCode() {
        return this.otherChargeCode;
    }

    /**
     * Gets the <code>otherChargeRates</code> property.
     * <p>
     * Represents the list of other charge rate which is applicable for an other charge rate type.
     * <p>
     * 
     * @return the current list of the <code>otherChargeRates</code> property.<br>
     */
    public List<OtherChargeRateDto> getOtherChargeRates() {

        if (this.otherChargeRates == null) {
            this.otherChargeRates = new ArrayList<OtherChargeRateDto>();
        }
        return this.otherChargeRates;
    }

    /**
     * Gets the <code>otherChargeSubCode</code> property.
     * <p>
     * Represents the Sub codes for other charge code defines when a particular other charge has to be
     * applied.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alphabet(Upper Case).
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of the <code>otherChargeSubCode</code> property.<br>
     */
    public String getOtherChargeSubCode() {
        return this.otherChargeSubCode;
    }

    /**
     * Sets the <code>description</code> property.
     * <p>
     * Represents the description of the other charge code.If the description for other charge code is not
     * present then it will represents the description provided for other charge sub code.
     * <p>
     * <b>Format: </b><br>
     * 1-50 Any keyboard character.
     * <p>
     * <b>Example: </b><br>
     * Computer Parts
     * <p>
     * 
     * @param pDescription the new value of the <code>description</code> property.<br>
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the <code>geographicalLocation1</code> property.
     * <p>
     * Represents the location associated with the other charge rates.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric.
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pGeographicalLocation1 the new value of the <code>geographicalLocation1</code> property.<br>
     */
    public void setGeographicalLocation1(final String pGeographicalLocation1) {
        this.geographicalLocation1 = ContractUtility.convertToUpperCase(pGeographicalLocation1);
    }

    /**
     * Sets the <code>geographicalLocation2</code> property.
     * <p>
     * Represents the location associated with the other charge rates.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric.
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pGeographicalLocation2 the new value of the <code>geographicalLocation2</code> property.<br>
     */
    public void setGeographicalLocation2(final String pGeographicalLocation2) {
        this.geographicalLocation2 = ContractUtility.convertToUpperCase(pGeographicalLocation2);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>OtherChargeDetailDto</code>.It is of type Long.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>otherChargeCode</code> property.
     * <p>
     * Represents the otherChargeCode which is associated with an air waybill during air waybill data capture.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets(Upper Case).
     * <p>
     * <b>Example: </b><br>
     * AC
     * <p>
     * 
     * @param pOtherChargeCode the new value of the <code>otherChargeCode</code> property.<br>
     */
    public void setOtherChargeCode(final String pOtherChargeCode) {
        this.otherChargeCode = ContractUtility.convertToUpperCase(pOtherChargeCode);
    }

    /**
     * Sets the <code>otherChargeRates</code> property.
     * <p>
     * Represents the list of other charge rate data transfer objects that are associated with the other
     * charge.
     * <p>
     * 
     * @param pOtherChargeRates the new list of the <code>otherChargeRates</code> property.<br>
     */
    public void setOtherChargeRates(final List<OtherChargeRateDto> pOtherChargeRates) {
        this.otherChargeRates = pOtherChargeRates;
    }

    /**
     * Sets the <code>otherChargeSubCode</code> property.
     * <p>
     * Represents the Sub codes for other charge code defines when a particular other charge has to be
     * applied.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alphabet(Upper Case).
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pOtherChargeSubCode the new list of the <code>otherChargeSubCode</code> property.<br>
     */
    public void setOtherChargeSubCode(final String pOtherChargeSubCode) {
        this.otherChargeSubCode = ContractUtility.convertToUpperCase(pOtherChargeSubCode);
    }

    /**
     * This method overrides toString property.
     * <p>
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the string value.<br>
     *         </p>
     */
    @Override
    public String toString() {
        final StringBuilder anOtherChargeDetail = new StringBuilder();
        anOtherChargeDetail.append(this.geographicalLocation1);
        anOtherChargeDetail.append(this.geographicalLocation2);
        anOtherChargeDetail.append(this.otherChargeCode);
        anOtherChargeDetail.append(this.otherChargeSubCode);
        return anOtherChargeDetail.toString();
    }

}
