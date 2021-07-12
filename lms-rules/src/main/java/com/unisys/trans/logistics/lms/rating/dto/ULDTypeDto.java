/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * <code>ULDTypeDto</code> contains specific data applicable to uld type.
 * <p>
 * For ULD (Unit Load Device) shipments, pricing is done based on IATA (International Air Transport
 * Association) and ATPCO (Airline Tariff Publishing Company) rules. For implementing the IATA and ATPCO
 * rules, ULD types are maintained.
 * <p>
 * There are two types of ULDs:
 * <li>aircraft.
 * <li>non-aircraft.<br>
 * A ULD type can contain information, which is used in some cases during air waybill rating, like minimum
 * chargeable weight and ULD discount information.<br>
 * The minimum chargeable weight and ULD discount information can be defined for specific combinations of
 * origin, destination, and airlines. This contains the following attributes:<br>
 * <p>
 * <code>
 * <ul>
 * <li>aircraftIndicator
 * <li>defaultMinChargeableWt
 * <li>deleteDate
 * <li>deleteUser
 * <li>description
 * <li>dimension 
 * <li>groupCode
 * <li>maximumGrossWeight
 * <li>maximumTareWeightAllowed
 * <li>oId
 * <li>uldType
 * <li>uldTypeRateDto
 * <li>weightUOM
 * </ul>
 * </code>
 */
public class ULDTypeDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1873425957976822952L;

    /**
     * Attribute to hold <code>aircraftIndicator</code> property.
     * <p>
     * Indicator that denotes the ULD type is aircraft (A) or non aircraft (N). Default is aircraft (A).
     */
    private boolean aircraftIndicator = true;

    /**
     * Attribute to hold <code>defaultMinChargeableWt</code> property.
     * <p>
     * This weight is employed in case no rating information is present for the ULD type. This must not be
     * greater than maximum gross weight.
     */
    private BigDecimal defaultMinChargeableWt;

    /**
     * Attribute to hold <code>deleteDate</code> property.
     */
    private Date deleteDate;

    /**
     * Attribute to hold <code>deleteUser</code> property.
     */
    private String deleteUser;

    /**
     * Attribute to hold <code>description</code> property.
     */
    private String description;

    /**
     * Attribute to hold <code>dimension</code> property.
     */
    private String dimension;

    /**
     * Attribute to hold <code>groupCode</code> property.
     */
    private String groupCode;

    /**
     * Attribute to hold <code>maximumGrossWeight</code> property.
     * <p>
     * Mandatory for non aircraft ULDs.Prohibited for aircraft ULDs.
     */
    private BigDecimal maximumGrossWeight;

    /**
     * Attribute to hold <code>maximumTareWeightAllowed</code> property.
     * <p>
     * Mandatory for non aircraft ULDs.Prohibited for aircraft ULDs.
     */
    private BigDecimal maximumTareWeightAllowed;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>uldType</code> property.
     */
    private String uldType;

    /**
     * Attribute to hold <code>uldTypeRateDto</code> property.
     */
    private List<ULDTypeRateDto> uldTypeRates = new ArrayList<ULDTypeRateDto>();

    /**
     * Attribute to hold <code>weightUOM</code> property.
     * <p>
     * Unit of weight applicable for the ULD type.Default is KG.
     */
    private WeightUOMType weightUOM;

    /**
     * <code>Default constructor.</code>
     */
    public ULDTypeDto() {

    }
    
    /**
     * Constructor with code as an argument.
     * <p>
     * 
     * @param pCode
     *            holds the carrier code.
     * @param pName
     *            holds the name.
     * @param pDate
     *            holds the date.
     * @param pAirlineCodeNumber
     *            holds the airlinecodenumber.
     *            <p>
     * @param pShipmentCaptureIndicator
     *            holds the shipment capture indicator.
     */
    public ULDTypeDto(final String pUldType, final Date pDate,
            final String pDescription) {
        this.uldType = pUldType;
        this.deleteDate = ContractUtility.getClonedDate(pDate);
        this.description = pDescription;
    }

    /**
     * Adds the <code>uldTypeRates</code> property.
     * <p>
     * 
     * @param pULDTypeRateDto the new value of the <code>uldTypeRates</code> property.<br>
     */
    public void addUldTypeRate(final ULDTypeRateDto pULDTypeRateDto) {
        this.uldTypeRates.add(pULDTypeRateDto);
    }

    /**
     * Gets the <code>defaultMinChargeableWt</code> property.
     * <p>
     * Indicator to denote the default minimum chargeable weight. This weight is employed in case no rating
     * information is present for the ULD type. This must not be greater than maximum gross weight.
     * <p>
     * <b>Format: </b><br>
     * 9.1 Numeric with decimal point.
     * <p>
     * <b>Example :</b><br>
     * 234.5
     * <p>
     * 
     * @return the current value of the <code>defaultMinChargeableWt</code> property.<br>
     */
    public BigDecimal getDefaultMinChargeableWt() {
        return this.defaultMinChargeableWt;
    }

    /**
     * Gets the value of <code>deleteDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 07JUL07
     * <p>
     * 
     * @return the current value of the <code>deleteDate</code> property.
     */
    public Date getDeleteDate() {
        return ContractUtility.getClonedDate(this.deleteDate);
    }

    /**
     * Gets the value of <code>deleteDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 07JUL07
     * <p>
     * 
     * @return the current value of the <code>deleteDate</code> property.
     */
    public String getDeleteUser() {
        return this.deleteUser;
    }

    /**
     * Gets the <code>description</code> property.
     * <p>
     * Description of the uld type.
     * <p>
     * <b>Format: </b><br>
     * character(set for all characters).<br>
     * <p>
     * <b>Example :</b><br>
     * Main Deck Pallet with Net/MainDeck Non StructuralLgloo with net
     * <p>
     * 
     * @return the current value of the <code>description</code> property.<br>
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>description</code> property.
     * <p>
     * Description of the uld type.
     * <p>
     * <b>Format: </b><br>
     * character(set for all characters).<br>
     * <p>
     * <b>Example :</b><br>
     * 2,234*3,456*2,345 mm(88*125*96 in)
     * <p>
     * 
     * @return the current value of the <code>description</code> property.<br>
     */
    public String getDimension() {
        return this.dimension;
    }

    /**
     * Gets the <code>groupCode</code> property.
     * <p>
     * Group code of the uld type.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alpha Numeric.<br>
     * <p>
     * <b>Example :</b><br>
     * PA
     * <p>
     * 
     * @return the current value of the <code>groupCode</code> property.<br>
     */
    public String getGroupCode() {
        return this.groupCode;
    }

    /**
     * Gets the <code>maximumGrossWeight</code> property.
     * <p>
     * Mandatory for non aircraft ULDs.Prohibited for aircraft ULDs.
     * <p>
     * <b>Format: </b><br>
     * 6.1 Numeric.<br>
     * <p>
     * <b>Example :</b><br>
     * 123.1
     * <p>
     * 
     * @return the current value of the <code>maximumGrossWeight</code> property.<br>
     */
    public BigDecimal getMaximumGrossWeight() {
        return this.maximumGrossWeight;
    }

    /**
     * Gets the <code>maximumTareWeightAllowed</code> property.
     * <p>
     * Mandatory for non aircraft ULDs.Prohibited for aircraft ULDs.
     * <p>
     * <b>Format: </b><br>
     * 6.1 Numeric.<br>
     * <p>
     * <b>Example :</b><br>
     * 123.1
     * <p>
     * 
     * @return the current value of the <code>maximumTareWeightAllowed</code> property.<br>
     */
    public BigDecimal getMaximumTareWeightAllowed() {
        return this.maximumTareWeightAllowed;
    }

    /**
     * Gets the <code>oId</code>.
     * <p>
     * The unique database key for an uld type. This ID is assigned when the object gets persisted (EOT).<br>
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    @Override
    @JsonProperty("oId")
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>uldType</code> property.
     * <p>
     * Unique Identifier.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabets.<br>
     * <p>
     * <b>Example :</b><br>
     * 1S
     * <p>
     * 
     * @return the current value of the <code>uldType</code> property.<br>
     */
    public String getUldType() {
        return this.uldType;
    }

    /**
     * Gets the <code>uldTypeRates</code> property.
     * <p>
     * The <code>ULDTypeRate</code> holds all the rate details of an uld type.
     * <p>
     * 
     * @return the current value of <code>uldTypeRates</code> property.
     */
    public List<ULDTypeRateDto> getUldTypeRates() {
        return this.uldTypeRates;
    }

    /**
     * Gets the <code>weightUOM</code> property.
     * <p>
     * Unique Identifier.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric.<br>
     * <p>
     * <b>Example :</b><br>
     * KG
     * <p>
     * 
     * @return the current value of the <code>weightUOM</code> property.<br>
     */
    public WeightUOMType getWeightUOM() {
        return this.weightUOM;
    }

    /**
     * Gets the <code>aircraftIndicator</code> property.
     * <p>
     * Indicator that denotes the ULD type is aircraft (A) or non aircraft (N). Default is aircraft (A).
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true:</code><br>
     * It will be an aircraft<br>
     * <li><code>false:</code> <br>
     * It will be a non - aircraft<br>
     * <p>
     * 
     * @return the current value of the <code>aircraftIndicator</code> property.<br>
     */
    public boolean isAircraftIndicator() {
        return this.aircraftIndicator;
    }

    /**
     * Sets the <code>aircraftIndicator</code> property.
     * <p>
     * Holds the active profle indicator regarding the flight profile.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true:</code><br>
     * It will be an aircraft<br>
     * <li><code>false:</code> <br>
     * It will be a non - aircraft<br>
     * <p>
     * 
     * @param pAircraftIndicator the new value of the <code>aircraftIndicator</code> property.<br>
     */
    public void setAircraftIndicator(final boolean pAircraftIndicator) {
        this.aircraftIndicator = pAircraftIndicator;
    }

    /**
     * Sets the <code>defaultMinChargeableWt</code> property.
     * <p>
     * Indicator to denote the default minimum chargeable weight. This weight is employed in case no rating
     * information is present for the ULD type. This must not be greater than maximum gross weight.
     * <p>
     * <b>Format: </b><br>
     * 9.1 Numeric with decimal point.
     * <p>
     * <b>Example :</b><br>
     * 234.5
     * <p>
     * 
     * @param pDefaultMinChargeableWt the new value of the <code>defaultMinChargeableWt</code> property.<br>
     */
    public void setDefaultMinChargeableWt(final BigDecimal pDefaultMinChargeableWt) {
        this.defaultMinChargeableWt = pDefaultMinChargeableWt;
    }

    /**
     * Sets the <code>deleteDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 07JUL07
     * <p>
     * 
     * @param pDeleteDate the new value of the <code>deleteDate</code> property.<br>
     */
    public void setDeleteDate(final Date pDeleteDate) {
        this.deleteDate = ContractUtility.getClonedDate(pDeleteDate);
    }

    /**
     * Sets the <code>deleteUser</code> property.
     * <p>
     * 
     * @param pDeleteUser the new value of the <code>deleteUser</code> property.<br>
     */
    public void setDeleteUser(final String pDeleteUser) {
        this.deleteUser = pDeleteUser;
    }

    /**
     * Sets the <code>description</code> property.
     * <p>
     * Description of the uld type.
     * <p>
     * <b>Format: </b><br>
     * character(set for all characters).<br>
     * <p>
     * <b>Example :</b><br>
     * Main Deck Pallet with Net/MainDeck Non StructuralLgloo with net
     * <p>
     * 
     * @param pDescription the new value of the <code>description</code> property.<br>
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the <code>dimension</code> property.
     * <p>
     * Description of the uld type.
     * <p>
     * <b>Format: </b><br>
     * character(set for all characters).<br>
     * <p>
     * <b>Example :</b><br>
     * 2,234*3,456*2,345 mm(88*125*96 in)
     * <p>
     * 
     * @param pDimension the new value of the <code>dimension</code> property.<br>
     */
    public void setDimension(final String pDimension) {
        this.dimension = pDimension;
    }

    /**
     * Sets the <code>groupCode</code> property.
     * <p>
     * Group code of the uld type.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alpha Numeric.<br>
     * <p>
     * <b>Example :</b><br>
     * PA
     * <p>
     * 
     * @param pGroupCode the new value of the <code>groupCode</code> property.<br>
     */
    public void setGroupCode(final String pGroupCode) {
        this.groupCode = ContractUtility.convertToUpperCase(pGroupCode);
    }

    /**
     * Sets the <code>maximumGrossWeight</code> property.
     * <p>
     * Mandatory for non aircraft ULDs.Prohibited for aircraft ULDs.
     * <p>
     * <b>Format: </b><br>
     * 6.1 Numeric.<br>
     * <p>
     * <b>Example :</b><br>
     * 123.1
     * <p>
     * 
     * @param pMaximumGrossWeight the new value of the <code>maximumGrossWeight</code> property.<br>
     */
    public void setMaximumGrossWeight(final BigDecimal pMaximumGrossWeight) {
        this.maximumGrossWeight = pMaximumGrossWeight;
    }

    /**
     * Sets the <code>maximumTareWeightAllowed</code> property.
     * <p>
     * Mandatory for non aircraft ULDs.Prohibited for aircraft ULDs.
     * <p>
     * <b>Format: </b><br>
     * 6.1 Numeric.<br>
     * <p>
     * <b>Example :</b><br>
     * 123.1
     * <p>
     * 
     * @param pMaximumTareWeightAllowed the new value of the <code>maximumTareWeightAllowed</code> property.<br>
     */
    public void setMaximumTareWeightAllowed(final BigDecimal pMaximumTareWeightAllowed) {
        this.maximumTareWeightAllowed = pMaximumTareWeightAllowed;
    }

    /**
     * Sets the value of the oId property.
     * <p>
     * 
     * @param pOId the new value of the oId property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>uldType</code> property.
     * <p>
     * Unique Identifier.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabets.<br>
     * <p>
     * <b>Example :</b><br>
     * 1S
     * <p>
     * 
     * @param pULDType the new value of the <code>uldType</code> property.<br>
     */
    public void setUldType(final String pULDType) {
        this.uldType = ContractUtility.convertToUpperCase(pULDType);
    }

    /**
     * Sets the <code>uldType</code> property.
     * <p>
     * Hold the information of all the uld type rates.
     * <p>
     * 
     * @param pULDTypeRateDto the new value of the <code>uldType</code> property.<br>
     */
    public void setUldTypeRates(final List<ULDTypeRateDto> pULDTypeRateDto) {
        this.uldTypeRates = pULDTypeRateDto;
    }

    /**
     * Sets the <code>weightUOM</code> property.
     * <p>
     * Unique Identifier.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric.<br>
     * <p>
     * <b>Example :</b><br>
     * KG
     * <p>
     * 
     * @param pWeightUOM the new value of the <code>weightUOM</code> property.<br>
     */
    public void setWeightUOM(final WeightUOMType pWeightUOM) {
        this.weightUOM = pWeightUOM;
    }

}
