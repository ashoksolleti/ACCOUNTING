//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on

package com.unisys.trans.logistics.lms.accounting.dto;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AgreementType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.dto.TapeRateEntry;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.GeographicDataDto;

/**
 * <code>InterlineAgreementsDto</code> contain details of InterlineAgreements.
 * <p>
 * This contains all information about InterlineAgreements.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>agreementIdentifier
 * <li>agreementType
 * <li>airWayDestination
 * <li>airwayOrigin
 * <li>carrier
 * <li>interlineAgreementsEntries
 * <li>issuingACN
 * <li>oId
 * </ul>
 */

public class InterlineAgreementsDto extends TapeRateEntry {

    /**
     * Attribute to hold <code>EMPTY_STRING</code> property.
     */
    private static final String EMPTY_STRING = "";

    /**
     * Attribute to hold <code>INDEF</code> property.
     */
    private static final String INDEF = "INDEF";

    /**
     * Attribute to hold <code>NO_LITERAL</code> property.
     */
    private static final String NO_LITERAL = "No";

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = -5445814418006761858L;

    /**
     * Attribute to hold <code>YES_LITERAL</code> property.
     */
    private static final String YES_LITERAL = "Yes";

    /**
     * Attribute to hold <code>agreementIdentifier</code> property.
     */
    private String agreementIdentifier;

    /**
     * Attribute to hold <code>agreementType</code> property.
     */
    private AgreementType agreementType;

    /**
     * Attribute to hold <code>airWayBillDestination</code> property.
     */
    private GeographicDataDto airWayBillDestination;

    /**
     * Attribute to hold <code>airWayBillOrigin</code> property.
     */
    private GeographicDataDto airWayBillOrigin;

    /**
     * Attribute to hold <code>allDestinationInd</code> property.
     */

    private boolean allDestinationInd;

    /**
     * Attribute to hold <code>allOriginInd</code> property.
     */

    private boolean allOriginInd;

    /**
     * Attribute to hold <code>carrier</code> property.
     */
    private String carrier;

    /**
     * Attribute to hold <code>interlineAgreementsEntries</code> property.
     */
    private List<InterlineAgreementsEntryDto> interlineAgreementsEntries;

    /**
     * Attribute to hold <code>issuingACN</code> property.
     */
    private String issuingACN;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * <code>Default constructor.</code>
     */
    public InterlineAgreementsDto() {

    }

    /**
     * Parameterize constructor.
     * 
     * @param pOId
     *            the value.
     */
    public InterlineAgreementsDto(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Adds the <code>InterlineAgreementsEntry</code> property.
     * 
     * @param pInterlineAgreementsEntryDto
     *            the new value of the <code>interlineAgreementsEntry</code> property.
     */
    public void addAggrementsEntry(
                final InterlineAgreementsEntryDto pInterlineAgreementsEntryDto) {
        if (this.interlineAgreementsEntries == null) {
            this.interlineAgreementsEntries = new ArrayList<InterlineAgreementsEntryDto>();
        }
        this.interlineAgreementsEntries.add(pInterlineAgreementsEntryDto);
    }

    /**
     * Gets the <code>agreementIdentifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>agreementIdentifier</code> property.
     */
    public String getAgreementIdentifier() {
        return this.agreementIdentifier;
    }

    /**
     * Gets the <code>agreementType</code> property.
     * <p>
     * 
     * @return the current value of the <code>agreementType</code> property.
     */
    public AgreementType getAgreementType() {
        return this.agreementType;
    }

    /**
     * Gets the <code>airWayBillDestination</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWayBillDestination</code> property.
     */
    public GeographicDataDto getAirWayBillDestination() {
        return this.airWayBillDestination;
    }

    /**
     * Gets the <code>airWayBillOrigin</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWayBillOrigin</code> property.
     */
    public GeographicDataDto getAirWayBillOrigin() {
        return this.airWayBillOrigin;
    }

    /**
     * Gets the <code>AllDestinationInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>AllDestinationInd</code> property.
     */
    public boolean getAllDestinationInd() {
        return this.allDestinationInd;
    }

    /**
     * Gets the <code>AllOriginInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>AllOriginInd</code> property.
     */

    public boolean getAllOriginInd() {
        return this.allOriginInd;
    }

    /**
     * Gets the <code>carrier</code> property.
     * <p>
     * 
     * @return the current value of the <code>carrier</code> property.
     */
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * Gets the <code>interlineAgreementsEntries</code> property.
     * <p>
     * 
     * @return the current value of the <code>interlineAgreementsEntries</code> property.
     */
    public List<InterlineAgreementsEntryDto> getInterlineAgreementsEntries() {
        return this.interlineAgreementsEntries;
    }

    /**
     * Gets the <code>issuingACN</code> property.
     * <p>
     * 
     * @return the current value of the <code>issuingACN</code> property.
     */
    public String getIssuingACN() {
        return this.issuingACN;
    }

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
     * Sets the <code>agreementIdentifier</code> property.
     * <p>
     * 
     * @param pAgreementIdentifier
     *            the current value of the <code>agreementIdentifier</code> property.
     */
    public void setAgreementIdentifier(final String pAgreementIdentifier) {
        this.agreementIdentifier = ContractUtility
                    .convertToUpperCase(pAgreementIdentifier);
    }

    /**
     * Sets the <code>agreementType</code> property.
     * <p>
     * 
     * @param pAgreementType
     *            the current value of the <code>agreementType</code> property.
     */
    public void setAgreementType(final AgreementType pAgreementType) {
        this.agreementType = pAgreementType;
    }

    /**
     * Sets the <code>airWayBillDestination</code> property.
     * <p>
     * 
     * @param pAirWayBillDestination
     *            the current value of the <code>airWayBillDestination</code> property.
     */
    public void setAirWayBillDestination(
                final GeographicDataDto pAirWayBillDestination) {
        this.airWayBillDestination = pAirWayBillDestination;
    }

    /**
     * Sets the <code>airWayBillOrigin</code> property.
     * <p>
     * 
     * @param pAirWayBillOrigin
     *            the current value of the <code>airWayBillOrigin</code> property.
     */
    public void setAirWayBillOrigin(final GeographicDataDto pAirWayBillOrigin) {
        this.airWayBillOrigin = pAirWayBillOrigin;
    }

    /**
     * Sets the <code>AllDestinationInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pAllDestinationInd
     *            the current value of the <code>AllDestinationInd</code> property.
     */
    public void setAllDestinationInd(final boolean pAllDestinationInd) {
        this.allDestinationInd = pAllDestinationInd;
    }

    /**
     * Sets the <code>AllOriginInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pAllOriginInd
     *            the current value of the <code>AllOriginInd</code> property.
     */

    public void setAllOriginInd(final boolean pAllOriginInd) {
        this.allOriginInd = pAllOriginInd;
    }

    /**
     * Sets the <code>carrier</code> property.
     * <p>
     * 
     * @param pCarrier
     *            the current value of the <code>carrier</code> property.
     */
    public void setCarrier(final String pCarrier) {
        this.carrier = ContractUtility.convertToUpperCase(pCarrier);
    }

    /**
     * Sets the <code>interlineAgreementsEntries</code> property.
     * <p>
     * 
     * @param pInterlineAgreementsEntries
     *            the current value of the <code>interlineAgreementsEntries</code> property.
     */
    public void setInterlineAgreementsEntries(
                final List<InterlineAgreementsEntryDto> pInterlineAgreementsEntries) {
        this.interlineAgreementsEntries = pInterlineAgreementsEntries;
    }

    /**
     * Sets the <code>issuingACN</code> property.
     * <p>
     * 
     * @param pIssuingACN
     *            the current value of the <code>issuingACN</code> property.
     */
    public void setIssuingACN(final String pIssuingACN) {
        this.issuingACN = ContractUtility.convertToUpperCase(pIssuingACN);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the current value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Creates the String representation of <code>InterlineAgreements</code>.
     * <p>
     * This will return the String representation based on InterlineAgreements.
     * <p>
     * 
     * @return the String representation of <code>InterlineAgreements</code>.
     */
    public String toString() {
        String csvString = new String();

        if (AgreementType.PROVISO.equals(this.getAgreementType())) {

            csvString = this.buildProvisoCSVString();
        }
        else if (AgreementType.PRORATE.equals(this.getAgreementType())) {
            csvString = this.buildProrateCSVString();
        }

        return csvString;

    }

    /**
     * Creates the String representation of <code>Interline Prorate</code>.
     * <p>
     * This will return the String representation based on Interline Prorate.
     * <p>
     * 
     * @return the String representation of <code>Interline Prorate</code>.
     */
    private String buildProrateCSVString() {
        final StringBuffer csvString = new StringBuffer();

        csvString.append(this.prefixSuffixByQuotes(this.getCarrier()));
        csvString.append(this.prefixSuffixByQuotes(this.getIssuingACN()));
        if (this.getAirWayBillOrigin() != null && this.getAirWayBillOrigin().getCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getAirWayBillOrigin().getCode()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getAllOriginInd())));
        if (this.getAirWayBillDestination() != null && this.getAirWayBillDestination().getCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getAirWayBillDestination().getCode()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getAllDestinationInd())));
        csvString.append(this.prefixSuffixByQuotes(this.getAgreementIdentifier()));
        return csvString.toString();
    }

    /**
     * Creates the String representation of <code>Interline Proviso</code>.
     * <p>
     * This will return the String representation based on Interline Proviso.
     * <p>
     * 
     * @return the String representation of <code>Interline Proviso</code>.
     */
    private String buildProvisoCSVString() {
        final StringBuffer csvString = new StringBuffer();

        csvString.append(this.prefixSuffixByQuotes(this.getCarrier()));
        if (this.getAirWayBillOrigin() != null && this.getAirWayBillOrigin().getCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getAirWayBillOrigin().getCode()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getAllOriginInd())));
        if (this.getAirWayBillDestination() != null && this.getAirWayBillDestination().getCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getAirWayBillDestination().getCode()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this
                    .readBooleanAsString(this.getAllDestinationInd())));
        csvString.append(this.prefixSuffixByQuotes(this
                    .getAgreementIdentifier()));
        return csvString.toString();
    }

    /**
     * Converts given date object into equivalent String object.
     * 
     * @param pDate
     *            the date object.
     * 
     * @return String value of the <code>pDate</code>.
     * 
     */
    private String dateToString(final Date pDate) {
        final Format aSimpleDateFormat = new SimpleDateFormat(
                    FrameworkConstants.DATEFORMAT, Locale.UK);
        return ContractUtility.convertToUpperCase(aSimpleDateFormat
                    .format(pDate));
    }

    /**
     * prefixes and suffixes a given string with open quotes.
     * 
     * @param pString
     *            the new value of the <code>value</code>.
     * 
     * @return aModifiedString the new value of the <code>aModifiedString</code> .
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
     * This methods gets the boolean input and gives the String (Yes/No).
     * 
     * @param pIndicator
     *            the value of the <code>indicator</code>.
     * 
     * @return aString the value of the given <code>indicator</code>.
     * 
     * 
     */
    private String readBooleanAsString(final boolean pIndicator) {
        String aString = NO_LITERAL;
        if (pIndicator) {
            aString = YES_LITERAL;
        }
        return aString;
    }

}
