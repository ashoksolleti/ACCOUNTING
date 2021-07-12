/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.math.BigDecimal;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.TapeRateEntry;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.dto.ValidityTimeDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingConventionType;
import com.unisys.trans.logistics.lms.rating.dto.constants.ULDChargeType;
import com.unisys.trans.logistics.lms.rating.dto.constants.UpdateSourceType;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

/**
 * <code>TariffRateDto</code> contain details of TariffRate.
 * <p>
 * This contains all information about TariffRate.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>amount
 * <li>action
 * <li>oId
 * <li>commodityNumber
 * <li>commodityType
 * <li>currencyCode
 * <li>dateRangeDto
 * <li>error
 * <li>flightNumber
 * <li>flightSpecificRateInd
 * <li>minimumWeight
 * <li>overPivotRate
 * <li>pendingGovernmentAppInd
 * <li>pivotWeight
 * <li>rateClassCode
 * <li>rateConstructionInd
 * <li>rateSourceCode
 * <li>rateTypeCode
 * <li>ratingNoteCode
 * <li>uldChargeCode
 * <li>uldType
 * <li>updateSource
 * <li>weightUnit
 * <li>rateValidityTimeDtos
 * <li>error
 * </ul>
 */

public class TariffRateDto extends TapeRateEntry {
    /**
     * Attribute to hold <code>_24</code> property.
     */
    private static final String _24 = "24";

    /**
     * Attribute to hold <code>A</code> property.
     */
    private static final String A = "A";

    /**
     * Attribute to hold <code>EMPTY_STRING</code> property.
     */
    private static final String EMPTY_STRING = "";

    /**
     * Attribute to hold <code>IFEN</code> property.
     */
    private static final String IFEN = "-";

    /**
     * Attribute to hold <code>NO_LITERAL</code> property.
     */
    private static final String NO_LITERAL = "No";

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>T</code> property.
     */
    private static final String T = "T";

    /**
     * Attribute to hold <code>YES_LITERAL</code> property.
     */
    private static final String YES_LITERAL = "yes";

    /**
     * Attribute to hold <code>action</code> property.
     */
    private ActionType action;
    
    /**
     * Attribute to hold <code>actionATPReport</code> property.
     */
    private ActionType actionATPReport;

    /**
     * Attribute to hold <code>amount</code> property.
     */
    private BigDecimal amount;

    /**
     * Attribute to hold <code>commodityNumber</code> property.
     */
    private String commodityNumber;

    /**
     * Attribute to hold <code>commodityType</code> property.
     */
    private RatingConventionType commodityType;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     */
    private String currencyCode;

    /**
     * Attribute to hold <code>dateRangeDto</code> property.
     */
    private DateRangeDto dateRangeDto;

    /**
     * Attribute to hold <code>error</code> property.
     */
    private boolean error;

    /**
     * Attribute to hold <code>errorCriteria</code> property.
     */
    private String errorCriteria;

    /**
     * Attribute to hold <code>flightNumber</code> property.
     */
    private String flightNumber;

    /**
     * Attribute to hold <code>weightUnit</code> property.
     */
    private String flightRadio;

    /**
     * Attribute to hold <code>flightSpecificRateInd</code> property.
     */
    private boolean flightSpecificRateInd;

    /**
     * Attribute to hold <code>hardDeleteIndicator</code> property.
     */
    private boolean hardDeleteIndicator;

    /**
     * Attribute to hold <code>minimumWeight</code> property.
     */
    private BigDecimal minimumWeight;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>overPivotRate</code> property.
     */
    private BigDecimal overPivotRate;

    /**
     * Attribute to hold <code>pendingGovernmentAppInd</code> property.
     */
    private boolean pendingGovernmentAppInd;

    /**
     * Attribute to hold <code>pivotWeight</code> property.
     */
    private BigDecimal pivotWeight;

    /**
     * Attribute to hold <code>rateClassCode</code> property.
     */
    private RateClassType rateClassCode;

    /**
     * Attribute to hold <code>rateConstructionInd</code> property.
     */
    private boolean rateConstructionInd;

    /**
     * Attribute to hold <code>rateSourceCode</code> property.
     */
    private String rateSourceCode;

    /**
     * Attribute to hold <code>rateSourceConventionType</code> property.
     */
    private RatingConventionType rateSourceConventionType;

    /**
     * Attribute to hold <code>rateTypeCode</code> property.
     */
    private String rateTypeCode;

    /**
     * Attribute to hold <code>rateTypePriority</code> property.
     */
    private Integer rateTypePriority;

    /**
     * Attribute to hold list of<code>rateValidityTimeDtos</code> property.
     */
    private List<ValidityTimeDto> rateValidityTimeDtos;

    /**
     * Attribute to hold <code>ratingNoteCode</code> property.
     */
    private String ratingNoteCode;

    /**
     * Attribute to hold <code>taskMatchedIndicator</code> property.
     */
    private boolean taskMatchedIndicator;

    /**
     * Attribute to hold <code>taskOId</code> property.
     */
    private Long taskOId;

    /**
     * Attribute to hold <code>taskProcessedIndicator</code> property.
     */
    private boolean taskProcessedIndicator;

    /**
     * Attribute to hold <code>uldChargeCode</code> property.
     */
    private ULDChargeType uldChargeCode;

    /**
     * Attribute to hold <code>uldType</code> property.
     */
    private String uldType;

    /**
     * Attribute to hold <code>updatedJobName</code> property.
     */
    private String updatedJobName;

    /**
     * Attribute to hold <code>updateSource</code> property.
     */
    private UpdateSourceType updateSource;

    /**
     * Attribute to hold <code>UserAuditDto</code> property.
     */

    private UserAuditDto userAudit;

    /**
     * Attribute to hold <code>weightUnit</code> property.
     */
    private WeightUOMType weightUnit;
    
    private boolean validRateLine;
    
    /**
     * Attribute to hold <code>rowIndex </code> property.
     * <p>
     * Datatable row index value
     */
    private String rowIndex;
    
    /**
     * Attribute to hold <code>status</code> property.
     */
    private String status;
    
    

    public boolean isValidRateLine() {
		return validRateLine;
	}

	public void setValidRateLine(final boolean validRateLine) {
		this.validRateLine = validRateLine;
	}

    public String getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(String pRowIndex) {
        this.rowIndex = pRowIndex;
    }

    public void addValidityTime(final ValidityTimeDto pValidityTime) {

        if (pValidityTime == null) {

            throw new AssertionError("Null argument input");
        }

        if (this.rateValidityTimeDtos == null) {

            this.rateValidityTimeDtos = new ArrayList<ValidityTimeDto>();
        }

        this.rateValidityTimeDtos.add(pValidityTime);
    }

    /**
     * Gets the <code>TariffRateDto</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pObj the new value of the <code>object</code> property.
     * @return the current value of the <code>TariffRateDto</code> property.
     */
    @Override
    public boolean equals(final Object pObj) {
        final TariffRateDto other = (TariffRateDto) pObj;
        if (getCommodityNumber() == null || getCommodityNumber().isEmpty()) {
            if (other.getCommodityNumber() != null && !other.getCommodityNumber().isEmpty()) {
                return false;
            }
        }
        else if (!getCommodityNumber().equalsIgnoreCase(other.getCommodityNumber())) {
            return false;
        }
        if (getCommodityType() != other.getCommodityType()) {
            return false;
        }
        if (getCurrencyCode() == null || getCurrencyCode().isEmpty()) {
            if (other.getCurrencyCode() != null) {
                return false;
            }
        }
        else if (!getCurrencyCode().equalsIgnoreCase(other.getCurrencyCode())) {
            return false;
        }
        if (getDateRangeDto() == null) {
            if (other.getDateRangeDto() != null) {
                return false;
            }
        }
        else if (!getDateRangeDto().equals(other.getDateRangeDto())) {
            return false;
        }
        if (getFlightNumber() == null || getFlightNumber().isEmpty()) {
            if (!(other.getFlightNumber() == null || other.getFlightNumber().isEmpty())) {
                return false;
            }
        }
        else if (!getFlightNumber().equalsIgnoreCase(other.getFlightNumber())) {
            return false;
        }
        if (getFlightSpecificRateInd() ^ other.getFlightSpecificRateInd()) {
            return false;
        }
        if (getMinimumWeight() == null) {
            if (other.getMinimumWeight() != null) {
                return false;
            }
        }
        else if (other.getMinimumWeight() != null
                    && getMinimumWeight().compareTo(other.getMinimumWeight()) != 0) {
            return false;
        }
        if (getOverPivotRate() == null) {
            if (other.getOverPivotRate() != null) {
                return false;
            }
        }
        else if (other.getOverPivotRate() != null
                    && getOverPivotRate().compareTo(other.getOverPivotRate()) != 0) {
            return false;
        }
        if (getPendingGovernmentAppInd() ^ other.getPendingGovernmentAppInd()) {
            return false;
        }
        if (getPivotWeight() == null) {
            if (other.getPivotWeight() != null) {
                return false;
            }
        }
        else if (other.getPivotWeight() != null && getPivotWeight().compareTo(other.getPivotWeight()) != 0) {
            return false;
        }
        if (getRateClassCode() != other.getRateClassCode()) {
            return false;
        }
        if (getRateConstructionInd() ^ other.getRateConstructionInd()) {
            return false;
        }
        if (getRateSourceCode() == null || getRateSourceCode().isEmpty()) {
            if (other.getRateSourceCode() != null) {
                return false;
            }
        }
        else if (!getRateSourceCode().equalsIgnoreCase(other.getRateSourceCode())) {
            return false;
        }
        if (getRateTypeCode() == null || getRateTypeCode().isEmpty()) {
            if (other.getRateTypeCode() != null) {
                return false;
            }
        }
        else if (!getRateTypeCode().equalsIgnoreCase(other.getRateTypeCode())) {
            return false;
        }
        if (getRateValidityTimeDtos() == null || getRateValidityTimeDtos().isEmpty()) {
            if (other.getRateValidityTimeDtos() != null && !other.getRateValidityTimeDtos().isEmpty()) {
                return false;
            }
        }
        else if (!getRateValidityTimeDtos().equals(other.getRateValidityTimeDtos())) {
            return false;
        }
        if (getRatingNoteCode() == null || getRatingNoteCode().isEmpty()) {
            if (other.getRatingNoteCode() != null && !other.getRatingNoteCode().isEmpty()) {
                return false;
            }
        }
        else if (!getRatingNoteCode().equalsIgnoreCase(other.getRatingNoteCode())) {
            return false;
        }
        if (getUldChargeCode() != other.getUldChargeCode()) {
            return false;
        }
        if (getUldType() == null || getUldType().isEmpty()) {
            if (other.getUldType() != null && !other.getUldType().isEmpty()) {
                return false;
            }
        }
        else if (!getUldType().equals(other.getUldType())) {
            return false;
        }
        if (getUpdateSource() == null) {
            if (other.getUpdateSource() != null) {
                return false;
            }
        }
        else if (!getUpdateSource().equals(other.getUpdateSource())) {
            return false;
        }
        if (!getWeightUnit().equals(other.getWeightUnit())) {
            return false;
        }
        return true;
    }

    /**
     * Gets the <code>Action</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * COUNTRYTAXCREATE
     * <p>
     * 
     * @return the current value of the <code>Action</code> property.
     */
    public ActionType getAction() {
        return this.action;
    }
    
    /**
     * Gets the <code>actionATPReport</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * CREATE
     * <p>
     * 
     * @return the current value of the <code>actionATPReport</code> property.
     */
    public ActionType getActionATPReport() {
        return this.actionATPReport;
    }
    
    /**
     * Gets the <code>Amount</code> property.
     * <p>
     * 
     * @return the current value of the <code>Amount</code> property.<br>
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Gets the <code>CommodityNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 9999
     * <p>
     * 
     * @return the current value of the <code>CommodityNumber</code> property.
     */
    public String getCommodityNumber() {
        return this.commodityNumber;
    }

    /**
     * Gets the <code>CommodityType</code> property.
     * <p>
     * <b>Format: </b><br>
     * IATA or ATPCO
     * <p>
     * <b>Example: </b><br>
     * IATA
     * <p>
     * 
     * @return the current value of the <code>CommodityType</code> property.
     */
    public RatingConventionType getCommodityType() {
        return this.commodityType;
    }

    /**
     * Gets the <code>CurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @return the current value of the <code>CurrencyCode</code> property.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto
     * DateRangeDto} containing <code>DateRangeDto</code> details.
     * <p>
     * 
     * @return the current value of <code>DateRangeDto</code> details.
     */
    public DateRangeDto getDateRangeDto() {
        if (this.dateRangeDto == null) {
            this.dateRangeDto = new DateRangeDto();
        }
        return this.dateRangeDto;
    }

    /**
     * This compareDifferenceForUpdate used to compare values.
     * It checks the current and passing object values and
     * returns boolean value accordingly
     * 
     * @param pObj
     *            the current value of the <code>Object</code> property.
     * @return boolean value
     */

    /**
     * Gets the <code>errorCriteria</code> details.
     * <p>
     * <b>Format: </b><br>
     * String
     * <p>
     * <b>Example: </b><br>
     * Error
     * <p>
     * 
     * @return the current value of the <code>errorCriteria</code> property.
     */
    public String getErrorCriteria() {
        return this.errorCriteria;
    }

    /**
     * Gets the {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto
     * BaseFlightDto} containing <code>FlightNumber</code> details.
     * <p>
     * <b>Format: </b><br>
     * 3-4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 7500
     * <p>
     * 
     * @return the current value of the <code>FlightNumber</code> property.
     */
    public String getFlightNumber() {
        return this.flightNumber;
    }

    /**
     * Get the FlightRadio.
     * <p>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return <code>FlightRadio</code><br>
     *         Returns the FlightRadio.
     *         </p>
     */
    public String getFlightRadio() {
        return this.flightRadio;
    }

    /**
     * Gets the <code>FlightSpecificRateInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>FlightSpecificRateInd</code> property.
     */
    public boolean getFlightSpecificRateInd() {
        return this.flightSpecificRateInd;
    }

    /**
     * Gets the <code>hardDeleteIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>hardDeleteIndicator</code> property.
     */

    public boolean getHardDeleteIndicator() {
        return this.hardDeleteIndicator;
    }

    /**
     * Gets the <code>MinimumWeight</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7.1 Numeric
     * <p>
     * <b>Example: </b><br>
     * 125
     * <p>
     * 
     * @return the current value of the <code>MinimumWeight</code> property.
     */
    public BigDecimal getMinimumWeight() {
        return this.minimumWeight;
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
     * Gets the <code>OverPivotRate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9.1-4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 123.4567
     * <p>
     * 
     * @return the current value of the <code>OverPivotRate</code> property.
     */
    public BigDecimal getOverPivotRate() {
        return this.overPivotRate;
    }

    /**
     * Gets the <code>PendingGovernmentAppInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>PendingGovernmentAppInd</code> property.
     */
    public boolean getPendingGovernmentAppInd() {
        return this.pendingGovernmentAppInd;
    }

    /**
     * Gets the <code>PivotWeight</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7.1 Numeric
     * <p>
     * <b>Example: </b><br>
     * 130
     * <p>
     * 
     * @return the current value of the <code>PivotWeight</code> property.
     */
    public BigDecimal getPivotWeight() {
        return this.pivotWeight;
    }

    /**
     * Gets the <code>RateClassCode</code> property.
     * <p>
     * <b>Example: </b><br>
     * M
     * <p>
     * 
     * @return the current value of the <code>rateClassCode</code> property.
     */
    public RateClassType getRateClassCode() {
        return this.rateClassCode;
    }

    /**
     * Gets the <code>RateConstructionInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>rateConstructionInd</code> property.
     */
    public boolean getRateConstructionInd() {
        return this.rateConstructionInd;
    }

    /**
     * Gets the <code>RateSourceCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Characters
     * <p>
     * <b>Example: </b><br>
     * IRI
     * <p>
     * 
     * @return the current value of the <code>rateSourceCode</code> property.
     */
    public String getRateSourceCode() {
        return this.rateSourceCode;
    }

    /**
     * Gets the <code>rateSourceConventionType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Characters
     * <p>
     * <b>Example: </b><br>
     * I
     * <p>
     * 
     * @return the current value of the <code>rateSourceConventionType</code> property.
     */
    public RatingConventionType getRateSourceConventionType() {
        return this.rateSourceConventionType;
    }

    /**
     * Gets the <code>RateTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @return the current value of the <code>rateTypeCode</code> property.
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Gets the <code>rateTypePriority</code> property.
     * <p>
     * Rate Type Priority with which rates for this rate type must be initially displayed.
     * <p>
     * <b>Range: </b><br>
     * 0-999<br>
     * <p>
     * 
     * @return the current value of <code>rateTypePriority</code> property.<br>
     */
    public Integer getRateTypePriority() {
        return this.rateTypePriority;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.rating.dto.ValidityTimeDto
     * ValidityTimeDto} containing <code>ValidityTimeDto</code> details.
     * <p>
     * 
     * @return the current value of <code>ValidityTimeDto</code> details.
     */
    public List<ValidityTimeDto> getRateValidityTimeDtos() {
        if (this.rateValidityTimeDtos == null) {
            this.rateValidityTimeDtos = new ArrayList<ValidityTimeDto>();
        }
        return this.rateValidityTimeDtos;
    }

    /**
     * Gets the <code>RatingNoteCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 for ATPCO or 4 for IATA Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * IA01,T1,R
     * <p>
     * 
     * @return the current value of the <code>ratingNoteCode</code> property.
     */
    public String getRatingNoteCode() {
        return this.ratingNoteCode;
    }

    /**
     * Gets the value of <code>taskMatchedIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * <li><code>false</code><br>
     * <p>
     * 
     * @return the current value of the <code>taskMatchedIndicator</code> property.<br>
     */
    public boolean getTaskMatchedIndicator() {
        return this.taskMatchedIndicator;
    }

    /**
     * Gets the value of <code>taskOId</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * <li><code>false</code><br>
     * <p>
     * 
     * @return the current value of the <code>taskOId</code> property.<br>
     */
    public Long getTaskOId() {
        return this.taskOId;
    }

    /**
     * Gets the value of <code>taskProcessedIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * <li><code>false</code><br>
     * <p>
     * 
     * @return the current value of the <code>taskProcessedIndicator</code> property.<br>
     */
    public boolean getTaskProcessedIndicator() {
        return this.taskProcessedIndicator;
    }

    /**
     * Gets the <code>ULDChargeType</code> property.
     * <p>
     * <b>Format: </b><br>
     * List
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of the <code>uldChargeCode</code> property.
     */
    public ULDChargeType getUldChargeCode() {
        return this.uldChargeCode;
    }

    /**
     * Gets the <code>UldType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * 1S
     * <p>
     * 
     * @return the current value of the <code>uldType</code> property.
     */
    public String getUldType() {
        return this.uldType;
    }

    /**
     * Gets the <code>updatedJobName</code> property.
     * 
     * 
     * @return the updatedJobName.
     */
    public String getUpdatedJobName() {
        return this.updatedJobName;
    }

    /**
     * Gets the <code>UpdateSource</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * 1S
     * <p>
     * 
     * @return the current value of the <code>UpdateSource</code> property.
     */
    public UpdateSourceType getUpdateSource() {
        return this.updateSource;
    }

    /**
     * Gets the {@link com.unisys.trans.logistics.lms.framework.dto.UserAuditDto
     * UserAuditDto} containing <code>UserAuditDto</code> details.
     * <p>
     * 
     * @return the current value of <code>UserAuditDto</code> details.
     */
    public UserAuditDto getUserAudit() {
        if (this.userAudit == null) {
            this.userAudit = new UserAuditDto();
        }
        return this.userAudit;
    }

    /**
     * Gets the <code>WeightUnit</code> property.
     * <p>
     * <b>Format: </b><br>
     * KG or LB List
     * <p>
     * <b>Example: </b><br>
     * KG
     * <p>
     * 
     * @return the current value of the <code>WeightUnit</code> property.
     */
    public WeightUOMType getWeightUnit() {
        return this.weightUnit;
    }

    /**
     * The<code>hashCode </code> object.
     * <p>
     * 
     * @return <code>int</code> hashcode of super class.
     */
    @Override
    public int hashCode() {
        // SuppressOn:MagicNumber
        final int prime = 31;
        int result = 1;
        result = prime * result + ((action == null) ? 0 : action.hashCode());
        result = prime * result + ((amount == null) ? 0 : amount.hashCode());
        result = prime * result + ((commodityNumber == null) ? 0 : commodityNumber.hashCode());
        result = prime * result + ((commodityType == null) ? 0 : commodityType.hashCode());
        result = prime * result + ((currencyCode == null) ? 0 : currencyCode.hashCode());
        result = prime * result + ((dateRangeDto == null) ? 0 : dateRangeDto.hashCode());
        result = prime * result + ((flightNumber == null) ? 0 : flightNumber.hashCode());
        result = prime * result + (flightSpecificRateInd ? 1231 : 1237);
        result = prime * result + ((minimumWeight == null) ? 0 : minimumWeight.hashCode());
        result = prime * result + ((oId == null) ? 0 : oId.hashCode());
        result = prime * result + ((overPivotRate == null) ? 0 : overPivotRate.hashCode());
        result = prime * result + (pendingGovernmentAppInd ? 1231 : 1237);
        result = prime * result + ((pivotWeight == null) ? 0 : pivotWeight.hashCode());
        result = prime * result + ((rateClassCode == null) ? 0 : rateClassCode.hashCode());
        result = prime * result + (rateConstructionInd ? 1231 : 1237);
        result = prime * result + ((rateSourceCode == null) ? 0 : rateSourceCode.hashCode());
        result = prime * result + ((rateTypeCode == null) ? 0 : rateTypeCode.hashCode());
        result = prime * result + ((rateValidityTimeDtos == null) ? 0 : rateValidityTimeDtos.hashCode());
        result = prime * result + ((ratingNoteCode == null) ? 0 : ratingNoteCode.hashCode());
        result = prime * result + ((uldChargeCode == null) ? 0 : uldChargeCode.hashCode());
        result = prime * result + ((uldType == null) ? 0 : uldType.hashCode());
        result = prime * result + ((updateSource == null) ? 0 : updateSource.hashCode());
        result = prime * result + ((userAudit == null) ? 0 : userAudit.hashCode());
        result = prime * result + ((weightUnit == null) ? 0 : weightUnit.hashCode());
        return result;
        // SuppressOff:MagicNumber
    }

    /**
     * Gets the <code>error</code> property.
     * <p>
     * 
     * @return the current value of the <code>error</code> property.
     */
    public boolean isError() {
        return this.error;
    }

    /**
     * Sets the <code>Action</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * COUNTRYTAXCREATE
     * <p>
     * 
     * @param pAction
     *            the current value of the <code>Action</code> property.
     */
    public void setAction(final ActionType pAction) {
        this.action = pAction;
    }
    
    /**
     * Sets the <code>ActionATPReport</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * CREATE
     * <p>
     * 
     * @param pAction
     *            the current value of the <code>ActionATPReport</code> property.
     */
    public void setActionATPReport(final ActionType pActionATPReport) {
        this.actionATPReport = pActionATPReport;
    }
    
    /**
     * Sets the <code>Amount</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>Amount</code> property.<br>
     */
    public void setAmount(final BigDecimal pAmount) {
        this.amount = pAmount;
    }

    /**
     * Sets the <code>CommodityNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 9999
     * <p>
     * 
     * @param pCommodityNumber
     *            the current value of the <code>CommodityNumber</code> property.
     */
    public void setCommodityNumber(final String pCommodityNumber) {
        this.commodityNumber = ContractUtility.convertToUpperCase(pCommodityNumber);
    }

    /**
     * Sets the <code>CommodityType</code> property.
     * <p>
     * <b>Format: </b><br>
     * IATA or ATPCO List
     * <p>
     * <b>Example: </b><br>
     * IATA
     * <p>
     * 
     * @param pCommodityType
     *            the current value of the <code>CommodityType</code> property.
     */
    public void setCommodityType(final RatingConventionType pCommodityType) {
        this.commodityType = pCommodityType;
    }

    /**
     * Sets the <code>CurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @param pCurrencyCode
     *            the current value of the <code>CurrencyCode</code> property.
     */
    public void setCurrencyCode(final String pCurrencyCode) {
        this.currencyCode = ContractUtility.convertToUpperCase(pCurrencyCode);
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto
     * DateRangeDto} containing <code>DateRange</code> details.
     * <p>
     * 
     * @param pDateRangeDto
     *            holds the new value of <code>DateRangeDto</code> type
     *            details.<br>
     */
    public void setDateRangeDto(final DateRangeDto pDateRangeDto) {
        this.dateRangeDto = pDateRangeDto;
    }

    /**
     * Sets the <code>error</code> details.
     * <p>
     * 
     * @param pError
     *            holds the new value of <code>error</code> type
     *            details.<br>
     */
    public void setError(final boolean pError) {
        this.error = pError;
    }

    /**
     * Sets the <code>errorCriteria</code> details.
     * <p>
     * 
     * @param pErrorCriteria
     *            holds the new value of <code>errorCriteria</code> type
     *            details.<br>
     */
    public void setErrorCriteria(final String pErrorCriteria) {
        this.errorCriteria = pErrorCriteria;
    }

    /**
     * Sets the {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto
     * BaseFlightDto} containing <code>FlightNumber</code> details.
     * <p>
     * <b>Format: </b><br>
     * 3-4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 7500
     * <p>
     * 
     * @param pFlightNumber
     *            the current value of the <code>FlightNumber</code> property.
     */
    public void setFlightNumber(final String pFlightNumber) {
        this.flightNumber = ContractUtility.convertToUpperCase(pFlightNumber);
    }

    /**
     * Sets the <code>flightRadio</code> property.
     * 
     * @param pFlightRadio
     *            the new value of the <code>flightRadio</code> property.
     */
    public void setFlightRadio(final String pFlightRadio) {
        this.flightRadio = pFlightRadio;
    }

    /**
     * Sets the <code>FlightSpecificRateInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pFlightSpecificRateInd
     *            the current value of the <code>FlightSpecificRateInd</code> property.
     */
    public void setFlightSpecificRateInd(final boolean pFlightSpecificRateInd) {
        this.flightSpecificRateInd = pFlightSpecificRateInd;
    }

    /**
     * Sets the <code>hardDeleteIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pHardDeleteIndicator
     *            the current value of the <code>hardDeleteIndicator</code> property.
     */
    public void setHardDeleteIndicator(final boolean pHardDeleteIndicator) {
        this.hardDeleteIndicator = pHardDeleteIndicator;
    }

    /**
     * Sets the <code>MinimumWeight</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7.1 Numeric
     * <p>
     * <b>Example: </b><br>
     * 125
     * <p>
     * 
     * @param pMinimumWeight
     *            the current value of the <code>MinimumWeight</code> property.
     */
    public void setMinimumWeight(final BigDecimal pMinimumWeight) {
        this.minimumWeight = pMinimumWeight;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>OverPivotRate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9.1-4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 123.4567
     * <p>
     * 
     * @param pOverPivotRate
     *            the current value of the <code>OverPivotRate</code> property.
     */
    public void setOverPivotRate(final BigDecimal pOverPivotRate) {
        this.overPivotRate = pOverPivotRate;
    }

    /**
     * Sets the <code>PendingGovernmentAppInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pPendingGovernmentAppInd
     *            the current value of the <code>PendingGovernmentAppInd</code> property.
     */
    public void setPendingGovernmentAppInd(
                final boolean pPendingGovernmentAppInd) {
        this.pendingGovernmentAppInd = pPendingGovernmentAppInd;
    }

    /**
     * Sets the <code>PivotWeight</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7.1 Numeric
     * <p>
     * <b>Example: </b><br>
     * 130
     * <p>
     * 
     * @param pPivotWeight
     *            the current value of the <code>PivotWeight</code> property.
     */
    public void setPivotWeight(final BigDecimal pPivotWeight) {
        this.pivotWeight = pPivotWeight;
    }

    /**
     * Sets the <code>RateClassCode</code> property.
     * <p>
     * <b>Example: </b><br>
     * M
     * <p>
     * 
     * @param pRateClassCode
     *            the current value of the <code>RateClassCode</code> property.
     */
    public void setRateClassCode(final RateClassType pRateClassCode) {
        this.rateClassCode = pRateClassCode;
    }

    /**
     * Sets the <code>RateConstructionInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pRateConstructionInd
     *            the current value of the <code>RateConstructionInd</code> property.
     */
    public void setRateConstructionInd(final boolean pRateConstructionInd) {
        this.rateConstructionInd = pRateConstructionInd;
    }

    /**
     * Sets the <code>RateSourceCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * IRI
     * <p>
     * 
     * @param pRateSourceCode
     *            the new value of the <code>rateSourceCode</code> property.
     */
    public void setRateSourceCode(final String pRateSourceCode) {
        this.rateSourceCode = ContractUtility.convertToUpperCase(pRateSourceCode);
    }

    /**
     * Sets the <code>rateSourceConventionType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * I
     * <p>
     * 
     * @param pRateSourceConventionType
     *            the new value of the <code>rateSourceConventionType</code> property.
     */
    public void setRateSourceConventionType(final RatingConventionType pRateSourceConventionType) {
        this.rateSourceConventionType = pRateSourceConventionType;
    }

    /**
     * Sets the <code>RateTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @param pRateTypeCode
     *            the current value of the <code>RateTypeCode</code> property.
     */
    public void setRateTypeCode(final String pRateTypeCode) {
        this.rateTypeCode = ContractUtility.convertToUpperCase(pRateTypeCode);
    }

    /**
     * Sets the <code>rateTypePriority</code> property.
     * <p>
     * RateType Priority with which rates for this rate type must be initially displayed.
     * <p>
     * 
     * @param pRateTypePriority
     *            the new value of the <code>rateTypePriority</code> property.
     */
    public void setRateTypePriority(final Integer pRateTypePriority) {
        this.rateTypePriority = pRateTypePriority;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.ValidityTimeDto
     * ValidityTimeDto} containing <code>ValidityTimeDto</code> details.
     * <p>
     * 
     * @param pRateValidityTimeDtos
     *            the current value of the <code>rateValidityTimeDtos</code> property.
     */
    public void setRateValidityTimeDtos(
                final List<ValidityTimeDto> pRateValidityTimeDtos) {
        this.rateValidityTimeDtos = pRateValidityTimeDtos;
    }

    /**
     * Sets the <code>RatingNoteCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 for ATPCO or 4 for IATA Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * IA01,T1,R
     * <p>
     * 
     * @param pRatingNoteCode
     *            the new value of the <code>ratingNoteCode</code> property.
     */
    public void setRatingNoteCode(final String pRatingNoteCode) {
        this.ratingNoteCode = ContractUtility.convertToUpperCase(pRatingNoteCode);
    }

    /**
     * Sets the value of the <code>taskMatchedIndicator</code> property.
     * <p>
     * 
     * @param pTaskMatchedIndicator
     *            the new value of the <code>taskMatchedIndicator</code> property.<br>
     */
    public void setTaskMatchedIndicator(final boolean pTaskMatchedIndicator) {
        this.taskMatchedIndicator = pTaskMatchedIndicator;
    }

    /**
     * Sets the value of the <code>taskOId</code> property.
     * <p>
     * 
     * @param pTaskOId
     *            the new value of the <code>taskOId</code> property.<br>
     */
    public void setTaskOId(final Long pTaskOId) {
        this.taskOId = pTaskOId;
    }

    /**
     * Sets the value of the <code>taskProcessedIndicator</code> property.
     * <p>
     * 
     * @param pTaskProcessedIndicator
     *            the new value of the <code>taskProcessedIndicator</code> property.<br>
     */
    public void setTaskProcessedIndicator(final boolean pTaskProcessedIndicator) {
        this.taskProcessedIndicator = pTaskProcessedIndicator;
    }

    /**
     * Sets the <code>UldChargeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * List
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pUldChargeCode
     *            the current value of the <code>uldChargeCode</code> property.
     */
    public void setUldChargeCode(final ULDChargeType pUldChargeCode) {
        this.uldChargeCode = pUldChargeCode;
    }

    /**
     * Sets the <code>UldType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * 1S
     * <p>
     * 
     * @param pUldType
     *            the current value of the <code>uldType</code> property.
     */
    public void setUldType(final String pUldType) {
        this.uldType = ContractUtility.convertToUpperCase(pUldType);
    }

    /**
     * Sets the <code>updatedJobName</code> property.
     * 
     * @param pUpdatedJobName
     *            the updatedJobName.
     */
    public void setUpdatedJobName(final String pUpdatedJobName) {
        this.updatedJobName = pUpdatedJobName;
    }

    /**
     * Sets the <code>UpdateSource</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * 1S
     * <p>
     * 
     * @param pUpdateSource
     *            the current value of the <code>UpdateSource</code> property.
     */
    public void setUpdateSource(final UpdateSourceType pUpdateSource) {
        this.updateSource = pUpdateSource;
    }

    /**
     * Sets the <code>UserAudit</code> property.
     * <p>
     * 
     * @param pUserAuditDto
     *            the current value of the <code>UserAuditDto</code> property.<br>
     * 
     */

    public void setUserAudit(final UserAuditDto pUserAuditDto) {
        this.userAudit = pUserAuditDto;
    }

    /**
     * Sets the <code>WeightUnit</code> property.
     * <p>
     * <b>Format: </b><br>
     * KG or LB List
     * <p>
     * <b>Example: </b><br>
     * KG
     * <p>
     * 
     * @param pWeightUnit
     *            the current value of the <code>WeightUnit</code> property.
     */
    public void setWeightUnit(final WeightUOMType pWeightUnit) {
        this.weightUnit = pWeightUnit;
    }

    /**
     * Creates the String representation of <code>ContractListEntryDto</code>.
     * <p>
     * This will return the String representation based on Contract List.
     * <p>
     * 
     * @return the String representation of <code>ContractListEntryDto</code>.
     */
    public String toString() {
        // SuppressOn:MagicNumber
        final StringBuffer csvString = new StringBuffer();

        csvString.append(this.prefixSuffixByQuotes(this.getRateSourceCode()));

        csvString.append(this.prefixSuffixByQuotes(this.getRateTypeCode()));

        csvString.append(this.prefixSuffixByQuotes(this.getRateClassCode()
                    .toString()));

        if (this.getCommodityNumber() != null) {
            csvString.append(this.prefixSuffixByQuotes(this
                        .getCommodityNumber()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getUldType() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getUldType()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getUldChargeCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getUldChargeCode()
                        .toString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getRatingNoteCode() != null) {
            csvString
                        .append(this.prefixSuffixByQuotes(this.getRatingNoteCode()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getMinimumWeight() != null) {
            csvString.append(this.prefixSuffixByQuotes(String.valueOf(this
                        .getMinimumWeight())));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        csvString.append(this.prefixSuffixByQuotes(String.valueOf(this
                    .getAmount())));

        csvString.append(this.prefixSuffixByQuotes(this.getCurrencyCode()));

        if (this.getPivotWeight() != null) {
            csvString.append(this.prefixSuffixByQuotes(String.valueOf(this
                        .getPivotWeight())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getOverPivotRate() != null) {
            csvString.append(this.prefixSuffixByQuotes(String.valueOf(this
                        .getOverPivotRate())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        csvString.append(this.prefixSuffixByQuotes(this.dateToString(this
                    .getDateRangeDto().getEffectiveDate())));

        if (this.getDateRangeDto() != null
                    && this.getDateRangeDto().getExpirationDate() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.dateToString(this
                        .getDateRangeDto().getExpirationDate())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        csvString.append(this.prefixSuffixByQuotes(this.getWeightUnit()
                    .toString()));

        if (this.getRateConstructionInd()) {
            csvString.append(this.prefixSuffixByQuotes(YES_LITERAL));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(NO_LITERAL));
        }

        if (this.getPendingGovernmentAppInd()) {
            csvString.append(this.prefixSuffixByQuotes(YES_LITERAL));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(NO_LITERAL));
        }

        if (this.getUpdateSource() != null) {
            csvString.append(this.prefixSuffixByQuotes(String.valueOf(this
                        .getUpdateSource())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getFlightSpecificRateInd()) {
            csvString.append(this.prefixSuffixByQuotes(YES_LITERAL));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(NO_LITERAL));
        }

        if (this.getFlightNumber() != null) {
            csvString.append(this.prefixSuffixByQuotes(String.valueOf(this
                        .getFlightNumber())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (!this.getRateValidityTimeDtos().isEmpty() &&
                    this.getRateValidityTimeDtos().get(0).getOperationDays().SUNDAY != null) {
            if (this.getRateValidityTimeDtos().get(0).getValidRadio() == null) {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
            else {
                if (this.getRateValidityTimeDtos().get(0).getValidRadio()
                            .equalsIgnoreCase(T)) {

                    final String Fromtime = this.getRateValidityTimeDtos().get(0)
                                .getTimeRangeDto().getOperationFromTime()
                                .toString();
                    csvString.append(Fromtime);
                    csvString.append(IFEN);
                    final String Totime = this.getRateValidityTimeDtos().get(0)
                                .getTimeRangeDto().getOperationToTime().toString();
                    csvString.append(Totime);
                    csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
                }
                else if (this.getRateValidityTimeDtos().get(0)
                            .getValidRadio() != T
                            && this.getRateValidityTimeDtos().get(0)
                                        .getValidRadio() != A) {

                    csvString.append(this.prefixSuffixByQuotes(IFEN));
                }
                else if (this.getRateValidityTimeDtos().get(0)
                            .getValidRadio().equalsIgnoreCase(A)) {

                    csvString.append(this.prefixSuffixByQuotes(_24));
                }
            }
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (!this.getRateValidityTimeDtos().isEmpty() &&
                    this.getRateValidityTimeDtos().get(1).getOperationDays().MONDAY != null) {
            if (this.getRateValidityTimeDtos().get(1).getValidRadio() == null) {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
            else {
                if (this.getRateValidityTimeDtos().get(1).getValidRadio()
                            .equalsIgnoreCase(T)) {

                    final String Fromtime = this.getRateValidityTimeDtos().get(1)
                                .getTimeRangeDto().getOperationFromTime()
                                .toString();
                    csvString.append(Fromtime);
                    csvString.append(IFEN);
                    final String Totime = this.getRateValidityTimeDtos().get(1)
                                .getTimeRangeDto().getOperationToTime().toString();
                    csvString.append(Totime);
                    csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
                }
                else if (this.getRateValidityTimeDtos().get(1)
                            .getValidRadio() != T
                            && this.getRateValidityTimeDtos().get(1)
                                        .getValidRadio() != A) {

                    csvString.append(this.prefixSuffixByQuotes(IFEN));
                }
                else if (this.getRateValidityTimeDtos().get(1)
                            .getValidRadio().equalsIgnoreCase(A)) {

                    csvString.append(this.prefixSuffixByQuotes(_24));
                }
            }
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (!this.getRateValidityTimeDtos().isEmpty()
                    && this.getRateValidityTimeDtos().get(2).getOperationDays().TUESDAY != null) {
            if (this.getRateValidityTimeDtos().get(2).getValidRadio() == null) {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
            else {

                if (this.getRateValidityTimeDtos().get(2).getValidRadio()
                            .equalsIgnoreCase(T)) {

                    final String Fromtime = this.getRateValidityTimeDtos().get(2)
                                .getTimeRangeDto().getOperationFromTime()
                                .toString();
                    csvString.append(Fromtime);

                    csvString.append(IFEN);
                    final String Totime = this.getRateValidityTimeDtos().get(2)
                                .getTimeRangeDto().getOperationToTime().toString();
                    csvString.append(Totime);
                    csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
                }
                else if (this.getRateValidityTimeDtos().get(2)
                            .getValidRadio() != T
                            && this.getRateValidityTimeDtos().get(2)
                                        .getValidRadio() != A) {

                    csvString.append(this.prefixSuffixByQuotes(IFEN));
                }
                else if (this.getRateValidityTimeDtos().get(2)
                            .getValidRadio().equalsIgnoreCase(A)) {

                    csvString.append(this.prefixSuffixByQuotes(_24));
                }
            }

        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (!this.getRateValidityTimeDtos().isEmpty()
                    && this.getRateValidityTimeDtos().get(3).getOperationDays().WEDNESDAY != null) {

            if (this.getRateValidityTimeDtos().get(3).getValidRadio() == null) {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
            else {
                if (this.getRateValidityTimeDtos().get(3).getValidRadio()
                            .equalsIgnoreCase(T)) {
                    final String Fromtime = this.getRateValidityTimeDtos().get(3)
                                .getTimeRangeDto().getOperationFromTime()
                                .toString();
                    csvString.append(Fromtime);

                    csvString.append(IFEN);
                    final String Totime = this.getRateValidityTimeDtos().get(3)
                                .getTimeRangeDto().getOperationToTime().toString();
                    csvString.append(Totime);
                    csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
                }
                else if (this.getRateValidityTimeDtos().get(3)
                            .getValidRadio() != T
                            && this.getRateValidityTimeDtos().get(3)
                                        .getValidRadio() != A) {

                    csvString.append(this.prefixSuffixByQuotes(IFEN));
                }
                else if (this.getRateValidityTimeDtos().get(3)
                            .getValidRadio().equalsIgnoreCase(A)) {

                    csvString.append(this.prefixSuffixByQuotes(_24));
                }
            }
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (!this.getRateValidityTimeDtos().isEmpty()
                    && this.getRateValidityTimeDtos().get(4).getOperationDays().THURSDAY != null) {

            if (this.getRateValidityTimeDtos().get(4).getValidRadio() == null) {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
            else {
                if (this.getRateValidityTimeDtos().get(4).getValidRadio()
                            .equalsIgnoreCase(T)) {
                    final String Fromtime = this.getRateValidityTimeDtos().get(4)
                                .getTimeRangeDto().getOperationFromTime()
                                .toString();
                    csvString.append(Fromtime);

                    csvString.append(IFEN);
                    final String Totime = this.getRateValidityTimeDtos().get(4)
                                .getTimeRangeDto().getOperationToTime().toString();
                    csvString.append(Totime);
                    csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
                }
                else if (this.getRateValidityTimeDtos().get(4)
                            .getValidRadio() != T
                            && this.getRateValidityTimeDtos().get(4)
                                        .getValidRadio() != A) {

                    csvString.append(this.prefixSuffixByQuotes(IFEN));
                }
                else if (this.getRateValidityTimeDtos().get(4)
                            .getValidRadio().equalsIgnoreCase(A)) {

                    csvString.append(this.prefixSuffixByQuotes(_24));
                }
            }
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (!this.getRateValidityTimeDtos().isEmpty()
                    && this.getRateValidityTimeDtos().get(5).getOperationDays().FRIDAY != null) {
            if (this.getRateValidityTimeDtos().get(5).getValidRadio() == null) {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
            else {
                if (this.getRateValidityTimeDtos().get(5).getValidRadio()
                            .equalsIgnoreCase(T)) {
                    final String Fromtime = this.getRateValidityTimeDtos().get(5)
                                .getTimeRangeDto().getOperationFromTime()
                                .toString();
                    csvString.append(Fromtime);

                    csvString.append(IFEN);
                    final String Totime = this.getRateValidityTimeDtos().get(5)
                                .getTimeRangeDto().getOperationToTime().toString();
                    csvString.append(Totime);
                    csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
                }
                else if (this.getRateValidityTimeDtos().get(5)
                            .getValidRadio() != T
                            && this.getRateValidityTimeDtos().get(5)
                                        .getValidRadio() != A) {

                    csvString.append(this.prefixSuffixByQuotes(IFEN));
                }
                else if (this.getRateValidityTimeDtos().get(5)
                            .getValidRadio().equalsIgnoreCase(A)) {

                    csvString.append(this.prefixSuffixByQuotes(_24));
                }
            }
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (!this.getRateValidityTimeDtos().isEmpty()
                    && this.getRateValidityTimeDtos().get(6).getOperationDays().SATURDAY != null) {
            if (this.getRateValidityTimeDtos().get(6).getValidRadio() == null) {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
            else {
                if (this.getRateValidityTimeDtos().get(6).getValidRadio()
                            .equalsIgnoreCase(T)) {
                    final String Fromtime = this.getRateValidityTimeDtos().get(6)
                                .getTimeRangeDto().getOperationFromTime()
                                .toString();
                    csvString.append(Fromtime);

                    csvString.append(IFEN);
                    final String Totime = this.getRateValidityTimeDtos().get(6)
                                .getTimeRangeDto().getOperationToTime().toString();
                    csvString.append(Totime);
                    csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
                }
                else if (this.getRateValidityTimeDtos().get(6)
                            .getValidRadio() != T
                            && this.getRateValidityTimeDtos().get(6)
                                        .getValidRadio() != A) {

                    csvString.append(this.prefixSuffixByQuotes(IFEN));
                }
                else if (this.getRateValidityTimeDtos().get(6)
                            .getValidRadio().equalsIgnoreCase(A)) {

                    csvString.append(this.prefixSuffixByQuotes(_24));
                }
            }
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getUserAudit().getUserIdentifier() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getUserAudit()
                        .getUserIdentifier()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getUserAudit().getAssociatedStation() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getUserAudit()
                        .getAssociatedStation()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getUserAudit().getAssociatedOffice() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getUserAudit()
                        .getAssociatedOffice()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getUserAudit().getCreatedOn() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getUserAudit()
                        .getCreatedOn().toString()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        return csvString.toString();

        // SuppressOff:MagicNumber
    }

    /**
     * Converts given date object into equivalent String object.
     * 
     * @param pDate the date object.
     * 
     * @return String value of the <code>pDate</code>.
     * 
     */
    private String dateToString(final Date pDate) {
        final Format aSimpleDateFormat = new SimpleDateFormat("ddMMMyyyy", Locale.UK);
        return ContractUtility.convertToUpperCase(aSimpleDateFormat.format(pDate));
    }

    /**
     * prefixes and suffixes a given string with open quotes.
     * 
     * @param pString the new value of the <code>value</code>.
     * 
     * @return aModifiedString the new value of the <code>aModifiedString</code>.
     * 
     * 
     */
    private String prefixSuffixByQuotes(final String pString) {
        final String aQUOTATION = "\"";
        final String aCOMMA = ",";

        final StringBuffer aModifiedString = new StringBuffer();
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(pString);
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(aCOMMA);

        return aModifiedString.toString();
    }

    /**
     * Gets the <code>status</code> property.
     * <p>
     * 
     * @return the current value of the <code>status</code> property.
     */
    
    public String getStatus() {
        return this.status;
    }

    /**
     * Sets the <code>status</code> property.
     * <p>
     * 
     * @param pStatus
     *            the current value of the <code>status</code> property.<br>
     * 
     */

    public void setStatus(final String pStatus) {
        this.status = pStatus;
    }
}