//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.parts.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ParticipantRemarksDto</code> contain details of ParticipantRemarks.
 * <p>
 * This contains all information about ParticipantRemarks.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>stationCode
 * <li>productCodes
 * <li>allStationIndicator
 * <li>allProductCodeIndicator
 * <li>text
 * <li>oId
 * </ul>
 */

public class ParticipantRemarksDto extends PersistenceObjectDto {

    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = 1L;

    /*
     * private String associatedOfficeCode; private String associatedStationCode; private Date createdOn;
     * private String userIdentifier;
     */

    /**
     * Attribute to hold <code>allProductCodeIndicator</code> property.
     */
    private boolean allProductCodeIndicator;

    /**
     * Attribute to hold <code>allStationIndicator</code> property.
     */
    private boolean allStationIndicator;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Attribute to hold <code>participantOId</code> property.
     */
    private Long participantOId;

    /**
     * Attribute to hold <code>productcodes</code> property.
     */
    private List<String> productCodes = new ArrayList<String>();

    /**
     * Attribute to hold <code>productCodesString</code> property.
     */
    private String productCodesString;

    /**
     * Attribute to hold <code>stationCode</code> property.
     */
    private String stationCode;

    /**
     * Attribute to hold <code>text</code> property.
     */

    private String text;

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */

    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>participantOId</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantOId</code> property.
     */
    public Long getParticipantOId() {
        return this.participantOId;
    }

    /**
     * Gets the <code>ProductCodes</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * NOR
     * <p>
     * 
     * @return the current value of the <code>ProductCodes</code> property.
     */

    public List<String> getProductCodes() {
        return this.productCodes;
    }

    /**
     * Gets the <code>ProductCodesString</code> property.
     * <p>
     * <b>Format: </b><br>
     * Comma separated
     * <p>
     * <b>Example: </b><br>
     * NOR,HEA
     * <p>
     * 
     * @return the current value of the <code>ProductCodesString</code> property.
     */

    public String getProductCodesString() {
        return this.productCodesString;
    }

    /**
     * Gets the <code>StationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3-5 Alphabet
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>Text</code> property.
     */

    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Gets the <code>Text</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-30 character set for all
     * <p>
     * <b>Example: </b><br>
     * Test Remarks
     * <p>
     * 
     * @return the current value of the <code>Text</code> property.
     */

    public String getText() {
        return this.text;
    }

    /**
     * Gets the <code>allProductCodeIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @return the current value of the <code>allProductCodeIndicator</code> property.
     */

    public boolean getAllProductCodeIndicator() {
        return this.allProductCodeIndicator;
    }

    /**
     * Gets the <code>allStationIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @return the current value of the <code>allStationIndicator</code> property.
     */

    public boolean getAllStationIndicator() {
        return this.allStationIndicator;
    }

    /**
     * Sets the<code>allProductCodeIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pAllProductCodeIndicator the new value of the <code>allProductCodeIndicator</code> property.
     */

    public void setAllProductCodeIndicator(final boolean pAllProductCodeIndicator) {
        this.allProductCodeIndicator = pAllProductCodeIndicator;
    }

    /**
     * Sets the<code>allStationIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pAllStationIndicator the new value of the <code>allStationIndicator</code> property.
     */

    public void setAllStationIndicator(final boolean pAllStationIndicator) {
        this.allStationIndicator = pAllStationIndicator;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>participantOId</code> property.
     * <p>
     * 
     * @param pParticipantOId the new value of the <code>participantOId</code> property.
     */
    public void setParticipantOId(final Long pParticipantOId) {
        this.participantOId = pParticipantOId;
    }

    /**
     * Sets the <code>ProductCodes</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * NOR
     * <p>
     * 
     * @param pProductCodes the new value of the <code>ProductCodes</code> property.
     */

    public void setProductCodes(final List<String> pProductCodes) {
        this.productCodes = pProductCodes;
    }

    /**
     * Sets the <code>ProductCodesString</code> property.
     * <p>
     * <b>Format: </b><br>
     * Comma separated
     * <p>
     * <b>Example: </b><br>
     * NOR,HEA
     * <p>
     * 
     * @param pProductCodesString the new value of the <code>ProductCodesString</code> property.
     */

    public void setProductCodesString(final String pProductCodesString) {
        this.productCodesString = ContractUtility.convertToUpperCase(pProductCodesString);
    }

    /**
     * Sets the <code>StationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3-5 Alphabet
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pStationCode the new value of the <code>StationCode</code> property.
     */

    public void setStationCode(final String pStationCode) {
        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);
    }

    /**
     * Sets the <code>Text</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-30 character set for all
     * <p>
     * <b>Example: </b><br>
     * Test Remark
     * <p>
     * 
     * @param pText the new value of the <code>Text</code> property.
     */

    public void setText(final String pText) {
        this.text = ContractUtility.convertToUpperCase(pText);
    }

}
