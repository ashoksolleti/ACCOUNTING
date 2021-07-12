/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.FlightDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.ContractStatusType;
import com.unisys.trans.logistics.lms.rating.dto.constants.PayCodeType;

/**
 * <code>Spot Rate</code> class contain information specific to a spot rate.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>agentCommission
 * <li>authorizationCode
 * <li>authorizationQueueOffice
 * <li>authorizedAgent
 * <li>awbNumber
 * <li>currencyCode
 * <li>deletion
 * <li>enforceHurdle
 * <li>effectivePeriod
 * <li>lastUpdatedAgent
 * <li>flight
 * <li>history
 * <li>netOnNet
 * <li>oId
 * <li>participant
 * <li>payCode
 * <li>productCode
 * <li>rateEntries
 * <li>remarks
 * <li>routeCompression
 * <li>oId
 * <li>participant
 * <li>originDestPayCode
 * <li>rateConstructionInd
 * <li>routeCompressionInd
 * <li>routingStations
 * <li>specialNotes
 * <li>sraNumber
 * <li>status
 * <li>weightUnit
 * <li>creationDate
 * </code>
 * </ul>
 */
public class SpotRateDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4254993716602316212L;

    /**
     * Attribute to hold <code>agentCommission</code> property.
     */
    private boolean agentCommission;
    
    /**
     * Attribute to hold <code>allInPricingIndicator</code> property.
     */
    private boolean allInPricingIndicator;

    /**
     * Attribute to hold <code>authorizationCode</code> property.
     */
    private String authorizationCode;

    /**
     * Attribute to hold <code>authorizationQueueOffice</code> property.
     */
    private String authorizationQueueOffice;

    /**
     * Attribute to hold <code>authorizedAgent</code> property.
     */
    private UserAuditDto authorizedAgent;

    /**
     * Attribute to hold <code>awbNumber</code> property.
     */
    private AWBNumberDto awbNumber;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     */
    private String currencyCode;

    /**
     * Attribute to hold <code>deletion</code> property.
     */
    private boolean deletion;

    /**
     * Attribute to hold <code>effectivePeriod</code> property.
     */
    private DateRangeDto effectivePeriod;

    /**
     * Attribute to hold <code>enforceHurdle</code> property.
     */
    private boolean enforceHurdle;

    /**
     * Attribute to hold <code>specialNotesValue</code> property.
     */
    private boolean specialNotesValue;

    /**
     * Attribute to hold <code>flight</code> property.
     */
    private FlightDto flight;

    /**
     * Attribute to hold <code>hardDeleteIndicator</code> property.
     */
    private boolean hardDeleteIndicator;

    /**
     * Attribute to hold <code>history</code> property.
     */
    private boolean history;

    /**
     * Attribute to hold <code>inputText</code> property.
     */
    private String inputText;

    /**
     * Attribute to hold <code>lastUpdatedAgent</code> property.
     */
    private UserAuditDto lastUpdatedAgent;

    /**
     * Attribute to hold <code>netOnNet</code> property.
     */
    private boolean netOnNet;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>participant</code> property.
     */
    private SpotRateParticipantDto participant;

    /**
     * Attribute to hold <code>payCode</code> property.
     */
    private PayCodeType payCode;

    /**
     * Attribute to hold <code>pricingIndicator</code> property.
     */
    private boolean pricingIndicator;

    /**
     * Attribute to hold <code>productCode</code> property.
     */
    private String productCode;

    /**
     * Attribute to hold <code>rateEntryDtos</code> property.
     */
    private List<RateEntryDto> rateEntryDtos;

    /**
     * Attribute to hold <code>remarks</code> property.
     */
    private String remarks;

    /**
     * Attribute to hold <code>routeCompression</code> property.
     */
    private boolean routeCompression;

    /**
     * Attribute to hold <code>routingStations</code> property.
     */
    private List<SpotRateStationDto> routingStations;

    /**
     * Attribute to hold <code>specialNotes</code> property.
     */
    private String specialNotes;

    /**
     * Attribute to hold <code>sraNumber</code> property.
     */
    private String sraNumber;

    /**
     * Attribute to hold <code>sraVersion</code> property.
     */
    private long sraVersion;

    /**
     * Attribute to hold <code>status</code> property.
     */
    private ContractStatusType status;

    /**
     * Attribute to hold <code>weightUnit</code> property.
     */
    private WeightUOMType weightUnit;

    /**
     * Attribute to hold <code>creationDate</code> property.
     */
    private Date creationDate;
    /**
     * Attribute to hold <code>agentId</code> property.
     */
    private String agentId;
    
    /**
     * Attribute to hold <code>authorizedAgentId</code> property.
     */
    private String authorizedAgentId;
   

    /**
     * Gets the <code>agentCommission</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>AgentCommission</code> property.
     */

    public boolean getAgentCommission() {
        return this.agentCommission;
    }
    
    /**
     * Gets the <code>allInPricingIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>allInPricingIndicator</code> property.
     */
    public boolean getAllInPricingIndicator() {
        return this.allInPricingIndicator;
    }

    /**
     * Gets the <code>authorizationCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>authorizationCode</code> property.
     */
    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    /**
     * Gets the <code>AuthorizationQueueOffice</code> property.
     * <p>
     * 
     * @return the current value of the <code>AuthorizationQueueOffice</code> property.
     */

    public String getAuthorizationQueueOffice() {
        return this.authorizationQueueOffice;
    }

    /**
     * Gets the <code>UserAuditDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>authorizedAgent</code> property.
     */

    public UserAuditDto getAuthorizedAgent() {
        return this.authorizedAgent;
    }

    /**
     * Gets the <code>awbNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbNumber</code> property.
     */
    public AWBNumberDto getAwbNumber() {
        return this.awbNumber;
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
     * Gets the <code>deletion</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>Deletion</code> property.
     */

    public boolean getDeletion() {
        return this.deletion;
    }

    /**
     * Gets the <code>EffectivePeriod</code> property.
     * <p>
     * 
     * @return the current value of the <code>effectivePeriod</code> property.
     */

    public DateRangeDto getEffectivePeriod() {
        return this.effectivePeriod;
    }

    /**
     * Gets the <code>EnforceHurdle</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>EnforceHurdle</code> property.
     */

    public boolean getEnforceHurdle() {
        return this.enforceHurdle;
    }

    /**
     * Gets the <code>FlightDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>flight</code> property.
     */
    public FlightDto getFlight() {
        return this.flight;
    }

    /**
     * Gets the <code>History</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>history</code> property.
     */

    public boolean getHistory() {
        return this.history;
    }

    /**
     * Gets the <code>inputText</code> property.
     * <p>
     * 
     * @return the current value of the <code>inputText</code> property.
     */
    public String getInputText() {
        return this.inputText;
    }

    /**
     * Gets the <code>UserAuditDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>lastUpdatedAgent</code> property.
     */
    public UserAuditDto getLastUpdatedAgent() {
        return this.lastUpdatedAgent;
    }

    /**
     * Gets the <code>NetOnNet</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>netOnNet</code> property.
     */

    public boolean getNetOnNet() {
        return this.netOnNet;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>SpotRateId</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */

    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>SpotRateParticipantDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>participant</code> property.
     */
    public SpotRateParticipantDto getParticipant() {
        return this.participant;
    }

    /**
     * Gets the <code>PayCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>payCode</code> property.
     */

    public PayCodeType getPayCode() {
        return this.payCode;
    }

    /**
     * Gets the <code>pricingIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>pricingIndicator</code> property.
     */
    public boolean getPricingIndicator() {
        return this.pricingIndicator;
    }

    /**
     * Gets the <code>ProductCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>productCode</code> property.
     */

    public String getProductCode() {
        return this.productCode;
    }

    /**
     * Gets the list of <code>RateEntryDto</code> associated with the
     * Spot Rate.
     * <p>
     * 
     * @return the current list of <code>rateEntryDtos</code> associated
     *         with a Spot Rate.
     */
    public List<RateEntryDto> getRateEntryDtos() {
        if (this.rateEntryDtos == null) {
            this.rateEntryDtos = new ArrayList<RateEntryDto>();
        }
        return this.rateEntryDtos;
    }

    /**
     * Gets the <code>Remarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>remarks</code> property.
     */

    public String getRemarks() {
        return this.remarks;
    }

    /**
     * Gets the <code>RouteCompression</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>routeCompression</code> property.
     */

    public boolean getRouteCompression() {
        return this.routeCompression;
    }

    /**
     * Gets the list of <code>SpotRateStationDto</code> associated with the
     * Spot Rate.
     * <p>
     * 
     * @return the current list of <code>routingStations</code> associated
     *         with a Spot Rate.
     */
    public List<SpotRateStationDto> getRoutingStations() {
        return this.routingStations;
    }

    /**
     * Gets the <code>SpecialNotes</code> property.
     * <p>
     * 
     * @return the current value of the <code>specialNotes</code> property.
     */

    public String getSpecialNotes() {
        return this.specialNotes;
    }

    /**
     * Gets the <code>SraNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>sraNumber</code> property.
     */

    public String getSraNumber() {
        return this.sraNumber;
    }

    /**
     * Gets the <code>SraVersion</code> property.
     * <p>
     * 
     * @return the current value of the <code>sraVersion</code> property.
     */

    public long getSraVersion() {
        return this.sraVersion;
    }

    /**
     * Gets the <code>ContractStatusType</code> property.
     * <p>
     * 
     * @return the current value of the <code>status</code> property.
     */

    public ContractStatusType getStatus() {
        return this.status;
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
     * @return the current value of the <code>weightUnit</code> property.
     */

    public WeightUOMType getWeightUnit() {
        return this.weightUnit;
    }

    public boolean isHardDeleteIndicator() {
        return hardDeleteIndicator;
    }

    /**
     * Sets the <code>AgentCommission</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pAgentCommission
     *            the current value of the <code>AgentCommission</code> property.
     */

    public void setAgentCommission(final boolean pAgentCommission) {
        this.agentCommission = pAgentCommission;
    }

    /**
     * Sets the <code>allInPricingIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pAllInPricingIndicator
     *            the current value of the <code>allInPricingIndicator</code> property.
     */

    public void setAllInPricingIndicator(final boolean pAllInPricingIndicator) {
        this.allInPricingIndicator = pAllInPricingIndicator;
    }

    /**
     * Sets the <code>authorizationCode</code> property.
     * <p>
     * 
     * @param pAuthorizationCode
     *            the current value of the <code>authorizationCode</code> property.
     */
    public void setAuthorizationCode(final String pAuthorizationCode) {
        this.authorizationCode = pAuthorizationCode;
    }

    /**
     * Sets the <code>AuthorizationQueueOffice</code> data transfer object.
     * <p>
     * 
     * @param pAuthorizationQueueOffice
     *            holds the new value of <code>AuthorizationQueueOffice</code> data
     *            transfer object.<br>
     */

    public void setAuthorizationQueueOffice(final String pAuthorizationQueueOffice) {
        this.authorizationQueueOffice = pAuthorizationQueueOffice;
    }

    /**
     * Sets the <code>UserAuditDto</code> property.
     * <p>
     * This domain object contains the the User information details.
     * <p>
     * 
     * @param pAuthorizedAgent
     *            the new value of the <code>authorizedAgent</code> property.<br>
     */

    public void setAuthorizedAgent(final UserAuditDto pAuthorizedAgent) {
        this.authorizedAgent = pAuthorizedAgent;
    }

    /**
     * Sets the <code>awbNumber</code> property.
     * <p>
     * 
     * @param pAWBNumber
     *            holds the new value of <code>awbNumber</code><br>
     *            .
     */
    public void setAwbNumber(final AWBNumberDto pAWBNumber) {
        this.awbNumber = pAWBNumber;
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
     * Sets the <code>Deletion</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pDeletion
     *            the current value of the <code>Deletion</code> property.
     */

    public void setDeletion(final boolean pDeletion) {
        this.deletion = pDeletion;
    }

    /**
     * Sets the <code>DateRangeDto</code> data transfer object.
     * <p>
     * 
     * @param pEffectivePeriod
     *            holds the new value of <code>EffectivePeriod</code> data
     *            transfer object.<br>
     */

    public void setEffectivePeriod(final DateRangeDto pEffectivePeriod) {
        this.effectivePeriod = pEffectivePeriod;
    }

    /**
     * Sets the <code>EnforceHurdle</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pEnforceHurdle
     *            the current value of the <code>EnforceHurdle</code> property.
     */

    public void setEnforceHurdle(final boolean pEnforceHurdle) {
        this.enforceHurdle = pEnforceHurdle;
    }

    /**
     * Sets the <code>Flight</code> data transfer object.
     * <p>
     * 
     * @param pFlight
     *            holds the new value of <code>Flight</code> data
     *            transfer object.<br>
     */

    public void setFlight(final FlightDto pFlight) {
        this.flight = pFlight;
    }

    public void setHardDeleteIndicator(boolean hardDeleteIndicator) {
        this.hardDeleteIndicator = hardDeleteIndicator;
    }

    /**
     * Sets the <code>History</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pHistory
     *            the current value of the <code>History</code> property.
     */
    public void setHistory(final boolean pHistory) {
        this.history = pHistory;
    }

    /**
     * Sets the <code>inputText</code> property.
     * <p>
     * 
     * @param pInputText
     *            holds the new value of <code>inputText</code> property.<br>
     */
    public void setInputText(final String pInputText) {
        this.inputText = pInputText;
    }

    /**
     * Sets the <code>userAudit</code> property.
     * <p>
     * This domain object contains the the User information details.
     * <p>
     * 
     * @param pLastUpdatedAgent
     *            the new value of the <code>lastUpdatedAgent</code> property.<br>
     */
    public void setLastUpdatedAgent(final UserAuditDto pLastUpdatedAgent) {
        this.lastUpdatedAgent = pLastUpdatedAgent;
    }

    /**
     * Sets the <code>NetOnNet</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pNetOnNet
     *            the current value of the <code>NetOnNet</code> property.
     */
    public void setNetOnNet(final boolean pNetOnNet) {
        this.netOnNet = pNetOnNet;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>ClassRatingId</code>.It is of type Long.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>Participant</code> data transfer object.
     * <p>
     * 
     * @param pParticipant
     *            holds the new value of <code>Participant</code> data
     *            transfer object.<br>
     */
    public void setParticipant(final SpotRateParticipantDto pParticipant) {
        this.participant = pParticipant;
    }

    /**
     * Sets the <code>PayCode</code> data transfer object.
     * <p>
     * 
     * @param pPayCode
     *            holds the new value of <code>PayCode</code> data
     *            transfer object.<br>
     */
    public void setPayCode(final PayCodeType pPayCode) {
        this.payCode = pPayCode;
    }

    /**
     * Sets the <code>pricingIndicator</code>.
     * <p>
     * 
     * @param pPricingIndicator
     *            holds the new value of <code>PricingIndicator</code>.<br>
     */
    public void setPricingIndicator(final boolean pPricingIndicator) {
        this.pricingIndicator = pPricingIndicator;
    }

    /**
     * Sets the <code>ProductCode</code> data transfer object.
     * <p>
     * 
     * @param pProductCode
     *            holds the new value of <code>ProductCode</code> data
     *            transfer object.<br>
     */
    public void setProductCode(final String pProductCode) {
        this.productCode = ContractUtility.convertToUpperCase(pProductCode);
    }

    /**
     * Sets the list of <code>RateEntryDto</code> associated with Spot Rate.
     * <p>
     * 
     * @param pRateEntryDtos
     *            the new list of <code>rateEntryDtos</code> associated with
     *            Spot Rate.<br>
     */
    public void setRateEntryDtos(final List<RateEntryDto> pRateEntryDtos) {
        this.rateEntryDtos = pRateEntryDtos;
    }

    /**
     * Sets the <code>Remarks</code> data transfer object.
     * <p>
     * 
     * @param pRemarks
     *            holds the new value of <code>remarks</code> data
     *            transfer object.<br>
     */
    public void setRemarks(final String pRemarks) {
        this.remarks = pRemarks;
    }

    /**
     * Sets the <code>RouteCompression</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pRouteCompression
     *            the current value of the <code>RouteCompression</code> property.
     */
    public void setRouteCompression(final boolean pRouteCompression) {
        this.routeCompression = pRouteCompression;
    }

    /**
     * Sets the list of <code>RoutingStations</code> associated with Spot Rate.
     * <p>
     * 
     * @param pRoutingStations
     *            the new list of <code>routingStations</code> associated with
     *            Spot Rate.<br>
     */
    public void setRoutingStations(final List<SpotRateStationDto> pRoutingStations) {
        this.routingStations = pRoutingStations;
    }

    /**
     * Sets the <code>SpecialNotes</code> data transfer object.
     * <p>
     * 
     * @param pSpecialNotes
     *            holds the new value of <code>SpecialNotes</code> data
     *            transfer object.<br>
     */
    public void setSpecialNotes(final String pSpecialNotes) {
        this.specialNotes = pSpecialNotes;
    }

    /**
     * Sets the <code>SraNumber</code> data transfer object.
     * <p>
     * 
     * @param pSraNumber
     *            holds the new value of <code>SraNumber</code> data
     *            transfer object.<br>
     */
    public void setSraNumber(final String pSraNumber) {
        this.sraNumber = ContractUtility.convertToUpperCase(pSraNumber);
    }

    /**
     * Sets the <code>SraVersion</code> data transfer object.
     * <p>
     * 
     * @param pSraVersion
     *            holds the new value of <code>SraVersion</code> data
     *            transfer object.<br>
     */
    public void setSraVersion(final long pSraVersion) {
        this.sraVersion = pSraVersion;
    }

    /**
     * Sets the <code>Status</code> data transfer object.
     * <p>
     * 
     * @param pStatus
     *            holds the new value of <code>Status</code> data
     *            transfer object.<br>
     */
    public void setStatus(final ContractStatusType pStatus) {
        this.status = pStatus;
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
    
    public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
   
    public boolean isSpecialNotesValue() {
		return specialNotesValue;
	}

	public void setSpecialNotesValue(final boolean specialNotesValue) {
		this.specialNotesValue = specialNotesValue;
	}
	
	 /**
     * Gets the <code>agentId</code> property.

     * @return the current value of the <code>agentId</code> property.
     */

	public String getAgentId() {
         return this.agentId;
     }
	   /**
     * Sets the <code>agentId</code> property.
     * 
     * @param pAgentId
     *            the current value of the <code>agentId</code> property.
     */
    public void setAgentId(final String pAgentId) {
          this.agentId = pAgentId;
    }

    public String getAuthorizedAgentId() {
        return authorizedAgentId;
    }

    public void setAuthorizedAgentId(String authorizedAgentId) {
        this.authorizedAgentId = authorizedAgentId;
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
        return "SpotRateDto [agentCommission=" + agentCommission + ", authorizationQueueOffice="
                    + authorizationQueueOffice + ", authorizedAgent=" + authorizedAgent
                    + ", authuorizationCode=" + authorizationCode + ", awbNumber=" + awbNumber
                    + ", currencyCode=" + currencyCode + ", deletion=" + deletion + ", effectivePeriod="
                    + effectivePeriod + ", enforceHurdle=" + enforceHurdle + ", flight=" + flight
                    + ", history=" + history + ", lastUpdatedAgent=" + lastUpdatedAgent + ", netOnNet="
                    + netOnNet + ", oId=" + oId + ", participant=" + participant + ", payCode=" + payCode
                    + ", productCode=" + productCode + ", rateEntryDtos=" + rateEntryDtos + ", remarks="
                    + remarks + ", routeCompression=" + routeCompression + ", routingStations="
                    + routingStations + ", specialNotes=" + specialNotes + ", sraNumber=" + sraNumber
                    + ", sraVersion=" + sraVersion + ", status=" + status + ", weightUnit=" + weightUnit
                    + "]";
    }
    
    //FIS150a
    
    private List<String> spotRateLines;


	public List<String> getSpotRateLines() {
		return spotRateLines;
	}

	public void setSpotRateLines(List<String> spotRateLines) {
		this.spotRateLines = spotRateLines;
	}
    
    

}
