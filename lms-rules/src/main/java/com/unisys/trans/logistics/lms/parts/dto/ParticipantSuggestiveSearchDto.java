/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * <code>ParticipantSuggestiveSearchDto</code> contains the search criteria for the participant table.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>name
 * <li>pageNumber
 * <li>station
 * </ul>
 * </code>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParticipantSuggestiveSearchDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2048357005853090770L;

    /**
     * Attribute to hold <code>searchText<code> property.
     */
    private String searchText;

    /**
     * Attribute to hold <code>rowNum<code> property.
     */
    private int rowNum;

    /**
     * Attribute to hold <code>station<code> property.
     */
    private String station;
    
    /**
     * Attribute to hold <code>searchByIata<code> property.
     */
    private boolean searchByIata;
    
    /**
     * Attribute to hold <code>searchByBilling<code> property.
     */
    private boolean searchByBilling;

    
    /**
     * Attribute to hold <code>searchByGovtId<code> property.
     */
    private boolean searchByGovtId;
    
    
    /**
     * Attribute to hold <code>type<code> property.
     */
    private String type;
    
    
    /**
     * Attribute to hold <code>ignoreOneTimeParticipant<code> property.
     */
    private boolean ignoreOneTimeParticipant;

    /**
     * Gets the <code>searchText</code> property.
     * <p>
     * <b>Format: </b><br>
     * alpha numeric and special characters like ampersand,single quotes etc..
     * <p>
     * 
     * @return the current value of <code>searchText</code> property.<br>
     */
    public String getSearchText() {
        return this.searchText;
    }

    /**
     * Gets the <code>rowNum</code> property.
     * <p>
     * <b>Format:</b><br>
     * Integer
     * 
     * @return the current value of <code>rowNum</code> property.<br>
     * 
     */
    public int getRowNum() {
        return this.rowNum;
    }


    /**
     * Gets the value of the <code>station</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 digit alphabetic.
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return <code>String</code><br>
     *         the current value of <code>station</code> property.<br>
     */
    public String getStation() {
        return station;
    }

    
    /**
     * Sets the <code>searchText</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-34 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <b>Example: </b><br>
     * Also Unisys
     * <p>
     * 
     * @param pSearchText the new value of <code>searchText</code> of the participant.<br>
     */
    public void setSearchText(final String pSearchText) {
        this.searchText = pSearchText;
    }

    /**
     * Sets the <code>rowNum</code> property.
     * <p>
     * <b>Format: </b><br>
     * Integer
     * <b>Example: </b><br>
     * 1,2,3 etc...
     * <p>
     * 
     * @param pRowNum the new value of <code>rowNum</code> of the participant.<br>
     */
    public void setRowNum(final int pRowNum) {
        this.rowNum = pRowNum;
    }


    /**
     * Sets the <code>station</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 digit alphabetic.
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pStation the new value of <code>station</code> of the participant.<br>
     */
    public void setStation(final String pStation) {
        this.station = pStation;
    }

    /**
     * Gets the <code>searchByIata</code> property.
     * <p>
     * <b>Format:</b><br>
     * boolean
     * <b>Example: </b><br>
     * true,false
     * 
     * @return the current value of <code>searchByIata</code> property.<br>
     * 
     */
    public boolean isSearchByIata() {
        return this.searchByIata;
    }


    /**
     * Sets the <code>searchByIata</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <b>Example: </b><br>
     * true,false
     * <p>
     * 
     * @param pSearchByIata the new value of <code>searchByIata</code> of the participant.<br>
     */
    public void setSearchByIata(final boolean pSearchByIata) {
        this.searchByIata = pSearchByIata;
    }

    /**
     * Gets the <code>searchByBilling</code> property.
     * <p>
     * <b>Format:</b><br>
     * boolean
     * <b>Example: </b><br>
     * true,false
     * 
     * @return the current value of <code>searchByBilling</code> property.<br>
     * 
     */
    public boolean isSearchByBilling() {
        return this.searchByBilling;
    }

    /**
     * Sets the <code>searchByBilling</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <b>Example: </b><br>
     * true,false
     * <p>
     * 
     * @param pSearchByBilling the new value of <code>searchByBilling</code> of the participant.<br>
     */
    public void setSearchByBilling(final boolean pSearchByBilling) {
        this.searchByBilling = pSearchByBilling;
    }

    
    /**
     * Gets the <code>searchByGovtId</code> property.
     * <p>
     * <b>Format:</b><br>
     * boolean
     * <b>Example: </b><br>
     * true,false
     * @return the current value of <code>searchByGovtId</code> property.<br>
     * 
     */
    public boolean isSearchByGovtId() {
        return this.searchByGovtId;
    }

    /**
     * Sets the <code>searchByGovtId</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <b>Example: </b><br>
     * true,false
     * <p>
     * 
     * @param pSearchByGovtId the new value of <code>searchByGovtId</code> of the participant.<br>
     */
    public void setSearchByGovtId(final boolean pSearchByGovtId) {
        this.searchByGovtId = pSearchByGovtId;
    }

    
    /**
     * Gets the <code>type</code> property.
     * <p>
     * <b>Format:</b><br>
     * Character
     * <b>Example: </b><br>
     * B,C,S
     * <p>
     * @return the current value of <code>type</code> property.<br>
     * 
     */
    public String getType() {
        return this.type;
    }

    /**
     * Sets the <code>pType</code> property.
     * <p>
     * <b>Format:</b><br>
     * Character
     * <b>Example: </b><br>
     * B,C,S
     * <p>
     * @param pType the new value of <code>pType</code> of the participant.<br>
     */
    public void setType(final String pType) {
        this.type = pType;
    }

    /**
     * Gets the <code>ignoreOneTimeParticipant</code> property.
     * <p>
     * <b>Format:</b><br>
     * boolean
     * <b>Example: </b><br>
     * true,false
     * @return the current value of <code>ignoreOneTimeParticipant</code> property.<br>
     * 
     */
    public boolean isIgnoreOneTimeParticipant() {
        return this.ignoreOneTimeParticipant;
    }

    /**
     * Sets the <code>ignoreOneTimeParticipant</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <b>Example: </b><br>
     * true,false
     * <p>
     * 
     * @param pIgnoreOneTimeParticipant the new value of <code>ignoreOneTimeParticipant</code> of the participant.<br>
     */
    public void setIgnoreOneTimeParticipant(final boolean pIgnoreOneTimeParticipant) {
        this.ignoreOneTimeParticipant = pIgnoreOneTimeParticipant;
    }

}
