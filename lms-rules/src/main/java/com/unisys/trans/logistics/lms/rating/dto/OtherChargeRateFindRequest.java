/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.util.Date;

/**
 * <code>OtherChargeRateFindRequest</code> class is used to retrieve the other charge rate information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>date
 * <li>geographicalLocation1
 * <li>geographicalLocation2
 * <li>otherChargeCode
 * <li>otherChargeSubCode
 * <li>otherChargeRateOId
 * </code>
 * </ul>
 */
public class OtherChargeRateFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -9078002290706122075L;

    /**
     * Attribute to hold <code>date</code>.
     * <p>
     * Represents the date for which the other charge code and other charge sub code have defined rates.
     */
    private Date date;

    /**
     * Attribute to hold <code>geographicalLocation1</code>.
     * <p>
     * Represents the location associated with the other charge rates.
     */
    private String geographicalLocation1;

    /**
     * Attribute to hold <code>geographicalLocation2</code>.
     * <p>
     * Represents the location associated with the other charge rates.
     */
    private String geographicalLocation2;

    /**
     * Attribute to hold <code>otherChargeCode</code>.
     * <p>
     * Represents the otherChargeCode which is associated with an air waybill during air waybill data capture.
     */
    private String otherChargeCode;

    /**
     * Attribute to hold <code>otherChargeRateOId</code>.
     * <p>
     * Represents the Unique key value for <code>OtherChargeRateDto</code>.
     */
    private Long otherChargeRateOId;

    /**
     * Attribute to hold <code>otherChargeSubCode</code>.
     * <p>
     * Represents the other charge sub code. Prohibited if other charge code is not provided otherwise
     * conditional.
     */
    private String otherChargeSubCode;

    /**
     * <code>Default constructor</code>.
     */
    public OtherChargeRateFindRequest() {

    }

    /**
     * Gets the <code>date</code> property.
     * <p>
     * Represents the date for which the other charge code and other charge sub code have defined rates.
     * <p>
     * <b>Format:</b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example:</b><br>
     * 07JUL08
     * <p>
     * 
     * @return the current value of <code>date</code> property.
     */
    public Date getDate() {
        return ContractUtility.getClonedDate(this.date);
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
     * Gets the <code>otherChargeRateOId</code> property.
     * <p>
     * Unique key to identify the <code>OtherChargeRateDto</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>otherChargeRateOId</code> property.<br>
     */
    public Long getOtherChargeRateOId() {
        return this.otherChargeRateOId;
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
     * Sets the <code>date</code> property.
     * <p>
     * Represents the date for which the other charge code and other charge sub code have defined rates.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example:</b><br>
     * 10AUG07
     * <p>
     * 
     * @param pDate the new value of the <code>date</code> property.
     */
    public void setDate(final Date pDate) {
        this.date = ContractUtility.getClonedDate(pDate);
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
     * Sets the <code>otherChargeRateOId</code> property.
     * <p>
     * Unique key to identify the <code>OtherChargeRateDto</code>.It is of type Long.
     * <p>
     * 
     * @param pOtherChargeRateOId the new value of the <code>otherChargeRateOId</code> property.<br>
     */
    public void setOtherChargeRateOId(final Long pOtherChargeRateOId) {
        this.otherChargeRateOId = pOtherChargeRateOId;
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

}
