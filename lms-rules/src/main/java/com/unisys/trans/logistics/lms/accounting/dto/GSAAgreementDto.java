package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.LogicalOperationType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;
import com.unisys.trans.logistics.lms.framework.utility.StringUtility;
import org.apache.commons.collections.CollectionUtils;

/**
 * @author KurmalNG
 *
 */
public class GSAAgreementDto extends PersistenceObjectDto {
    private static final long serialVersionUID = 1L;

    private Long oId;

    /**
     * 
     */
    private static final String EMPTY_STRING = "";
    private ActionType actionType;
    private String gsaAgreementName;

    private String participantName;

    private String participantAccountNumber;

    private String awbOrigin;

    private String awbDestination;

    private String awbOwnerCarrierCode;

    private String currency;

    private String gsaCommissionType;

    private Date effectiveDate;

    private Date expirationDate;

    private Date creationDate;
    
    private String specificAirline;

    //private Date lastUpdatedDate;

    //private String lastUpdatedUser;

    public String getSpecificAirline() {
		return specificAirline;
	}

	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}

    private String applicableCharge;

    private Double percentage;

    private BigDecimal amount;

    private BigDecimal ratePerAwb;

    private String gsaAgreementIdentifier;

    private String station;

    private String prticipantName;

    private List<GSAAgreementRatesDto> gsaAgreementRates = new ArrayList<GSAAgreementRatesDto>();

    private boolean create = false;

    private boolean delete = false;

    private boolean update = false;

    private int versionIdentifier = 0;

    private boolean inter = false;

    private boolean error;
    
    private Boolean weightChargeInd;
   
    private Boolean valuationChargeInd;
    
    private Boolean otherChargeInd;
    
    private String originType;

    private String destinationType;

    // LMSC-4470
    private String gsaTargetBasedOn;

    private String gsaCalculatedOn;

    private String gsaWeightType;

    private String gsaUnitOfWeight;

    private String gsaCommissionFreq;

    private LogicalOperationType gsaCommodityNumberSelection;

    private LogicalOperationType gsaSpecialHandlingCodeSelection;

    private LogicalOperationType gsaRoutingSelection;

    private LogicalOperationType gsaProductCodeSelection;
    
    private LogicalOperationType gsaOtherChargeSelection;

    private List<String> gsaProductCode;

    private List<String> gsaCommodityNumber;

    private List<String> gsaSpecialHandlingCode;

    private List<GSAAgreementRoutingDto> gsaAgreementRouting = new ArrayList<GSAAgreementRoutingDto>();
    
    private List<String> gsaOtherCharge;

    private List<String> gsaExtendedTerritory;

    private BigDecimal gsaMinGuaranteedRevYearly;

    private BigDecimal gsaMinGuaranteedRevMonthly;

    /**
     * Attribute to hold <code>NEW_LINE</code> property.
     */
    private static final String NEW_LINE = "<br>";

    /**
     * Attribute to hold <code>WHITE_SPACE</code> property.
     */
    private static final String WHITE_SPACE = " ";

    private static final String YES = "YES";

    private static final String NO = "NO";
    
    private UserAuditDto userAudit;


    public UserAuditDto getUserAudit() {
		return userAudit;
	}

	public void setUserAudit(UserAuditDto userAudit) {
		this.userAudit = userAudit;
	}

	/**
     * @return the gsaTargetBasedOn
     */
    public String getGsaTargetBasedOn() {
        return gsaTargetBasedOn;
    }

    /**
     * @param gsaTargetBasedOn
     *            the gsaTargetBasedOn to set
     */
    public void setGsaTargetBasedOn(String gsaTargetBasedOn) {
        this.gsaTargetBasedOn = gsaTargetBasedOn;
    }

    /**
     * @return the gsaCalculatedOn
     */
    public String getGsaCalculatedOn() {
        return gsaCalculatedOn;
    }

    /**
     * @param gsaCalculatedOn
     *            the gsaCalculatedOn to set
     */
    public void setGsaCalculatedOn(String gsaCalculatedOn) {
        this.gsaCalculatedOn = gsaCalculatedOn;
    }

    /**
     * @return the gsaWeightType
     */
    public String getGsaWeightType() {
        return gsaWeightType;
    }

    /**
     * @param gsaWeightType
     *            the gsaWeightType to set
     */
    public void setGsaWeightType(String gsaWeightType) {
        this.gsaWeightType = gsaWeightType;
    }

    /**
     * @return the gsaUnitOfWeight
     */
    public String getGsaUnitOfWeight() {
        return gsaUnitOfWeight;
    }

    /**
     * @param gsaUnitOfWeight
     *            the gsaUnitOfWeight to set
     */
    public void setGsaUnitOfWeight(String gsaUnitOfWeight) {
        this.gsaUnitOfWeight = gsaUnitOfWeight;
    }

    /**
     * @return the gsaCommissionFreq
     */
    public String getGsaCommissionFreq() {
        return gsaCommissionFreq;
    }

    /**
     * @param gsaCommissionFreq
     *            the gsaCommissionFreq to set
     */
    public void setGsaCommissionFreq(String gsaCommissionFreq) {
        this.gsaCommissionFreq = gsaCommissionFreq;
    }

    /**
     * @return the gsaCommodityNumberSelection
     */
    public LogicalOperationType getGsaCommodityNumberSelection() {
        return gsaCommodityNumberSelection;
    }

    /**
     * @param gsaCommodityNumberSelection
     *            the gsaCommodityNumberSelection to set
     */
    public void setGsaCommodityNumberSelection(LogicalOperationType gsaCommodityNumberSelection) {
        this.gsaCommodityNumberSelection = gsaCommodityNumberSelection;
    }

    /**
     * @return the gsaSpecialHandlingCodeSelection
     */
    public LogicalOperationType getGsaSpecialHandlingCodeSelection() {
        return gsaSpecialHandlingCodeSelection;
    }

    /**
     * @param gsaSpecialHandlingCodeSelection
     *            the gsaSpecialHandlingCodeSelection to set
     */
    public void setGsaSpecialHandlingCodeSelection(LogicalOperationType gsaSpecialHandlingCodeSelection) {
        this.gsaSpecialHandlingCodeSelection = gsaSpecialHandlingCodeSelection;
    }


    /**
     * @return the gsaRoutingSelection
     */
    public LogicalOperationType getGsaRoutingSelection() {
        return gsaRoutingSelection;
    }

    /**
     * @param gsaRoutingSelection
     *            the gsaRoutingSelection to set
     */
    public void setGsaRoutingSelection(LogicalOperationType gsaRoutingSelection) {
        this.gsaRoutingSelection = gsaRoutingSelection;
    }

    /**
     * @return the gsaProductCodeSelection
     */
    public LogicalOperationType getGsaProductCodeSelection() {
        return gsaProductCodeSelection;
    }

    /**
     * @param gsaProductCodeSelection
     *            the gsaProductCodeSelection to set
     */
    public void setGsaProductCodeSelection(LogicalOperationType gsaProductCodeSelection) {
        this.gsaProductCodeSelection = gsaProductCodeSelection;
    }

    /**
     * @return the gsaProductCode
     */
    public List<String> getGsaProductCode() {
        return gsaProductCode;
    }

    /**
     * @param gsaProductCode
     *            the gsaProductCode to set
     */
    public void setGsaProductCode(List<String> gsaProductCode) {
        this.gsaProductCode = gsaProductCode;
    }

    /**
     * @return the gsaCommodityNumber
     */
    public List<String> getGsaCommodityNumber() {
        return gsaCommodityNumber;
    }

    /**
     * @param gsaCommodityNumber
     *            the gsaCommodityNumber to set
     */
    public void setGsaCommodityNumber(List<String> gsaCommodityNumber) {
        this.gsaCommodityNumber = gsaCommodityNumber;
    }

    /**
     * @return the gsaSpecialHandlingCode
     */
    public List<String> getGsaSpecialHandlingCode() {
        return gsaSpecialHandlingCode;
    }

    /**
     * @param gsaSpecialHandlingCode
     *            the gsaSpecialHandlingCode to set
     */
    public void setGsaSpecialHandlingCode(List<String> gsaSpecialHandlingCode) {
        this.gsaSpecialHandlingCode = gsaSpecialHandlingCode;
    }

    public List<GSAAgreementRoutingDto> getGsaAgreementRouting() {
        return gsaAgreementRouting;
    }

    public void setGsaAgreementRouting(List<GSAAgreementRoutingDto> gsaAgreementRouting) {
        this.gsaAgreementRouting = gsaAgreementRouting;
    }

    /**
     * Returns the Product code values as space and new line appended value.
     *
     * @return aModifiedString the new value of the <code>product codes</code>.
     *
     */
    public String getProductAsString() {
        return this.formatCodesForDisplay(this.getGsaProductCode());
    }

    /**
     * Returns the Commodity code values as space and new line appended value.
     *
     * @return aModifiedString the new value of the <code>commodity codes</code>.
     *
     */
    public String getCommodityAsString() {
        return this.formatCodesForDisplay(this.getGsaCommodityNumber());
    }

    /**
     * Returns the Special Handling code values as space and new line appended value.
     *
     * @return aModifiedString the new value of the <code>special Handling codes</code>.
     *
     */
    public String getSplAsString() {
        return this.formatCodesForDisplay(this.getGsaSpecialHandlingCode());
    }

    /**
     * Returns the Other Charge code values as space and new line appended value.
     *
     * @return aModifiedString the new value of the <code>other charge codes</code>.
     *
     */
    public String getOtherChargeAsString() {
        return this.formatCodesForDisplay(this.getGsaOtherCharge());
    }

    /**
     * Returns the given Code's values as space and new line appended value.
     *
     * @param pInputCodes
     *            the list of <code>codes</code>.
     *
     * @return aModifiedString the new value of the given<code>Code's</code>.
     *
     */
    public String formatCodesForDisplay(final List<String> pInputCodes) {
        final StringBuilder aCodeAsString = new StringBuilder();
        if (!CollectionUtils.isEmpty(pInputCodes)) {
            final int size = pInputCodes.size();
            if (size > 0) {
                aCodeAsString.append(pInputCodes.get(0).toUpperCase(Locale.US));
                for (int i = 1; i < size; i++) {
                    if (i % 5 == 0) {
                        aCodeAsString.append(NEW_LINE);
                        aCodeAsString.append(pInputCodes.get(i).toUpperCase());
                        continue;
                    }
                    aCodeAsString.append(WHITE_SPACE);
                    aCodeAsString.append(pInputCodes.get(i).toUpperCase());
                }
            }
        }
        return aCodeAsString.toString();
    }

    public String getRatesPercentage(){
        return getgsaAgreementRatesMap(gsaAgreementRates).get(3);
    }

    public String getRatesRangeFrom(){
        return getgsaAgreementRatesMap(gsaAgreementRates).get(1);
    }

    public String getRatesRangeTo(){
        return getgsaAgreementRatesMap(gsaAgreementRates).get(2);
    }

    public Map<Integer, String> getgsaAgreementRatesMap(List<GSAAgreementRatesDto> gsaAgreementRatesList){
        Map<Integer, String> gsaAgreementRatesMap = new HashMap<Integer, String>();
        final StringBuilder rangeFrmAsString = new StringBuilder();
        final StringBuilder rangeToAsString = new StringBuilder();
        final StringBuilder percentageAsString = new StringBuilder();
        int i=0;
        int ratesListSize = gsaAgreementRatesList.size();
        for (GSAAgreementRatesDto ratesDto : gsaAgreementRatesList) {
            rangeFrmAsString.append((ratesDto.getAwbVolRangeFrom() == null) ? EMPTY_STRING : ratesDto.getAwbVolRangeFrom());
            rangeToAsString.append((ratesDto.getAwbVolRangeTo() == null) ? EMPTY_STRING : ratesDto.getAwbVolRangeTo());
            percentageAsString.append((ratesDto.getPercentage() == null) ? EMPTY_STRING : ratesDto.getPercentage());
            if((ratesListSize != 1 || i++ != ratesListSize-1)){
                rangeFrmAsString.append(NEW_LINE);
                rangeToAsString.append(NEW_LINE);
                percentageAsString.append(NEW_LINE);
            }

        }
        gsaAgreementRatesMap.put(1, rangeFrmAsString.toString());
        gsaAgreementRatesMap.put(2, rangeToAsString.toString());
        gsaAgreementRatesMap.put(3, percentageAsString.toString());
        return gsaAgreementRatesMap;
    }

    public String getRoutingSegOrg(){
        return getgsaAgreementRoutingMap(gsaAgreementRouting).get(1);
    }

    public String getRoutingSegDest(){
        return getgsaAgreementRoutingMap(gsaAgreementRouting).get(2);
    }

    public String getRoutingSegCarr(){
        return getgsaAgreementRoutingMap(gsaAgreementRouting).get(3);
    }

    public String getRoutingFlightNum(){
        return getgsaAgreementRoutingMap(gsaAgreementRouting).get(4);
    }

    public Map<Integer, String> getgsaAgreementRoutingMap(List<GSAAgreementRoutingDto> gsaAgreementRoutingList){
        Map<Integer, String> gsaAgreementRoutingMap = new HashMap<Integer, String>();
        final StringBuilder segOriginAsString = new StringBuilder();
        final StringBuilder segDestinationAsString = new StringBuilder();
        final StringBuilder segCarrierAsString = new StringBuilder();
        final StringBuilder flightNumAsString = new StringBuilder();
        int i = 0;
        int routingListSize = gsaAgreementRoutingList.size();
        for (GSAAgreementRoutingDto routingDto : gsaAgreementRoutingList) {
            segOriginAsString.append((routingDto.getGsaSegOrigin() == null) ? EMPTY_STRING : routingDto.getGsaSegOrigin());
            segDestinationAsString.append((routingDto.getGsaSegDestination() == null) ? EMPTY_STRING : routingDto.getGsaSegDestination());
            segCarrierAsString.append((routingDto.getGsaSegCarrier() == null) ? EMPTY_STRING : routingDto.getGsaSegCarrier());
            flightNumAsString.append((routingDto.getGsaFlightNum() == null) ? EMPTY_STRING : routingDto.getGsaFlightNum());
            if((routingListSize != 1 || i++ != routingListSize-1)){
                segOriginAsString.append(NEW_LINE);
                segDestinationAsString.append(NEW_LINE);
                segCarrierAsString.append(NEW_LINE);
                flightNumAsString.append(NEW_LINE);
            }

        }
        gsaAgreementRoutingMap.put(1, segOriginAsString.toString());
        gsaAgreementRoutingMap.put(2, segDestinationAsString.toString());
        gsaAgreementRoutingMap.put(3, segCarrierAsString.toString());
        gsaAgreementRoutingMap.put(4, flightNumAsString.toString());
        return gsaAgreementRoutingMap;
    }

    /// LMSC-4470

    /**
     * @return the oId
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * @return the oId
     */
    public Long getoId() {
        return this.oId;
    }

    /**
     * @param oId
     *            the oId to set
     */
    public void setoId(Long oId) {
        this.oId = oId;
    }

    /**
     * @return the gsaAgreementName
     */
    public String getGsaAgreementName() {
        return gsaAgreementName;
    }

    /**
     * @param gsaAgreementName
     *            the gsaAgreementName to set
     */
    public void setGsaAgreementName(String gsaAgreementName) {
        this.gsaAgreementName = gsaAgreementName;
    }

    /**
     * @return the participantName
     */
    public String getParticipantName() {
        return participantName;
    }

    /**
     * @param participantName
     *            the participantName to set
     */
    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    /**
     * @return the participantAccountNumber
     */
    public String getParticipantAccountNumber() {
        return participantAccountNumber;
    }

    /**
     * @param participantAccountNumber
     *            the participantAccountNumber to set
     */
    public void setParticipantAccountNumber(String participantAccountNumber) {
        this.participantAccountNumber = participantAccountNumber;
    }

    /**
     * @return the awbOrigin
     */
    public String getAwbOrigin() {
        return awbOrigin;
    }

    /**
     * @param awbOrigin
     *            the awbOrigin to set
     */
    public void setAwbOrigin(String awbOrigin) {
        this.awbOrigin = awbOrigin;
    }

    /**
     * @return the awbDestination
     */
    public String getAwbDestination() {
        return awbDestination;
    }

    /**
     * @param awbDestination
     *            the awbDestination to set
     */
    public void setAwbDestination(String awbDestination) {
        this.awbDestination = awbDestination;
    }

    /**
     * @return the awbOwnerCarrierCode
     */
    public String getAwbOwnerCarrierCode() {
        return awbOwnerCarrierCode;
    }

    /**
     * @param awbOwnerCarrierCode
     *            the awbOwnerCarrierCode to set
     */
    public void setAwbOwnerCarrierCode(String awbOwnerCarrierCode) {
        this.awbOwnerCarrierCode = awbOwnerCarrierCode;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        if (currency != null && !currency.isEmpty()) {
            currency = currency.toUpperCase();
        }
        return currency;
    }

    /**
     * @param currency
     *            the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the gsaCommissionType
     */
    public String getGsaCommissionType() {
        return gsaCommissionType;
    }

    /**
     * @param gsaCommissionType
     *            the gsaCommissionType to set
     */
    public void setGsaCommissionType(String gsaCommissionType) {
        this.gsaCommissionType = gsaCommissionType;
    }

    /**
     * @return the effectiveDate
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * @param effectiveDate
     *            the effectiveDate to set
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * @return the expirationDate
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * @param expirationDate
     *            the expirationDate to set
     */
    @SuppressWarnings("static-access")
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * @return the lastUpdatedDate
     *//*
    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    *//**
     * @param lastUpdatedDate
     *            the lastUpdatedDate to set
     *//*
    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    *//**
     * @return the lastUpdatedUser
     *//*
    public String getLastUpdatedUser() {
        return lastUpdatedUser;
    }

    *//**
     * @param lastUpdatedUser
     *            the lastUpdatedUser to set
     *//*
    public void setLastUpdatedUser(String lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
    }
*/
    /**
     * @return the gsaAgreementRates
     */
    public List<GSAAgreementRatesDto> getGsaAgreementRates() {
        return gsaAgreementRates;
    }

    /**
     * @param gsaAgreementRates
     *            the gsaAgreementRates to set
     */
    public void setGsaAgreementRates(List<GSAAgreementRatesDto> gsaAgreementRates) {
        this.gsaAgreementRates = gsaAgreementRates;
    }

    /**
     * @return the create
     */
    public boolean isCreate() {
        return create;
    }

    /**
     * @param create
     *            the create to set
     */
    public void setCreate(boolean create) {
        this.create = create;
    }

    /**
     * @return the delete
     */
    public boolean isDelete() {
        return delete;
    }

    /**
     * @param delete
     *            the delete to set
     */
    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    /**
     * @return the update
     */
    public boolean isUpdate() {
        return update;
    }

    /**
     * @param update
     *            the update to set
     */
    public void setUpdate(boolean update) {
        this.update = update;
    }

    /**
     * @return the applicableCharge
     */
    public String getApplicableCharge() {
        return applicableCharge;
    }

    /**
     * @param applicableCharge
     *            the applicableCharge to set
     */
    public void setApplicableCharge(String applicableCharge) {
        this.applicableCharge = applicableCharge;
    }

    /**
     * @return the percentage
     */
    public Double getPercentage() {
        return percentage;
    }

    /**
     * @param percentage
     *            the percentage to set
     */
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    /**
     * @return the amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount
     *            the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * @return the ratePerAwb
     */
    public BigDecimal getRatePerAwb() {
        return ratePerAwb;
    }

    /**
     * @param ratePerAwb
     *            the ratePerAwb to set
     */
    public void setRatePerAwb(BigDecimal ratePerAwb) {
        this.ratePerAwb = ratePerAwb;
    }

    /**
     * @return the gsaAgreementIdentifier
     */
    public String getGsaAgreementIdentifier() {
        return gsaAgreementIdentifier;
    }

    /**
     * @param gsaAgreementIdentifier
     *            the gsaAgreementIdentifier to set
     */
    public void setGsaAgreementIdentifier(String gsaAgreementIdentifier) {
        this.gsaAgreementIdentifier = gsaAgreementIdentifier;
    }

    /**
     * @return the station
     */
    public String getStation() {
        if (station != null && !station.isEmpty()) {
            station = station.toUpperCase();
        }
        return station;
    }

    /**
     * @param station
     *            the station to set
     */
    public void setStation(String station) {
        this.station = station;
    }

    /**
     * @return the prticipantName
     */
    public String getPrticipantName() {
        return prticipantName;
    }

    /**
     * @param prticipantName
     *            the prticipantName to set
     */
    public void setPrticipantName(String prticipantName) {
        this.prticipantName = prticipantName;
    }

    /**
     * @return the versionIdentifier
     */
    public int getVersionIdentifier() {
        return versionIdentifier;
    }

    /**
     * @param versionIdentifier
     *            the versionIdentifier to set
     */
    public void setVersionIdentifier(int versionIdentifier) {
        this.versionIdentifier = versionIdentifier;
    }

    /**
     * @return the inter
     */
    public boolean isInter() {
        return inter;
    }

    /**
     * @param inter
     *            the inter to set
     */
    public void setInter(boolean inter) {
        this.inter = inter;
    }

    /**
     * @return the actionType
     */
    public ActionType getActionType() {
        return actionType;
    }

    /**
     * @param actionType
     *            the actionType to set
     */
    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    /**
     * @return the creationDate
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate
     *            the creationDate to set
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return the error
     */
    public boolean isError() {
        return error;
    }

    /**
     * @param error
     *            the error to set
     */
    public void setError(boolean error) {
        this.error = error;
    }

    /**
     * @return the originType
     */
    public String getOriginType() {
        return originType;
    }

    /**
     * @param originType
     *            the originType to set
     */
    public void setOriginType(String originType) {
        this.originType = originType;
    }

    /**
     * @return the destinationType
     */
    public String getDestinationType() {
        return destinationType;
    }

    /**
     * @param destinationType
     *            the destinationType to set
     */
    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

	 /**
     * @return the weightChargeInd
     */
	public Boolean getWeightChargeInd() {
	    if(this.weightChargeInd==null)
	        this.weightChargeInd = false;
		return this.weightChargeInd;
	}

	/**
     * @param weightChargeInd
     *            the weightChargeInd to set
     */
	public void setWeightChargeInd(Boolean weightChargeInd) {
		this.weightChargeInd = weightChargeInd;
	}

	 /**
     * @return the valuationChargeInd
     */
	public Boolean getValuationChargeInd() {
        if(this.valuationChargeInd==null)
            this.valuationChargeInd = false;
        return this.valuationChargeInd;
	}

	/**
     * @param valuationChargeInd
     *            the valuationChargeInd to set
     */
	public void setValuationChargeInd(Boolean valuationChargeInd) {
		this.valuationChargeInd = valuationChargeInd;
	}

	 /**
     * @return the otherChargeInd
     */
	public Boolean getOtherChargeInd() {
        if(this.otherChargeInd==null)
            this.otherChargeInd = false;
        return this.otherChargeInd;
	}

	/**
     * @param otherChargeInd
     *            the otherChargeInd to set
     */
	public void setOtherChargeInd(Boolean otherChargeInd) {
		this.otherChargeInd = otherChargeInd;
	}

	 /**
     * @return the gsaOtherChargeSelection
     */
	public LogicalOperationType getGsaOtherChargeSelection() {
		return gsaOtherChargeSelection;
	}

	/**
     * @param gsaOtherChargeSelection
     *            the gsaOtherChargeSelection to set
     */
	public void setGsaOtherChargeSelection(LogicalOperationType gsaOtherChargeSelection) {
		this.gsaOtherChargeSelection = gsaOtherChargeSelection;
	}

	 /**
     * @return the gsaOtherCharge
     */
	public List<String> getGsaOtherCharge() {
		return gsaOtherCharge;
	}

	/**
     * @param gsaOtherCharge
     *            the gsaOtherCharge to set
     */
	public void setGsaOtherCharge(List<String> gsaOtherCharge) {
		this.gsaOtherCharge = gsaOtherCharge;
	}

    /**
     * @return the gsaExtendedTerritory
     */
    public List<String> getGsaExtendedTerritory() {
        return gsaExtendedTerritory;
    }

    /**
     * @param gsaExtendedTerritory
     *            the gsaExtendedTerritory to set
     */
    public void setGsaExtendedTerritory(List<String> gsaExtendedTerritory) {
        this.gsaExtendedTerritory = gsaExtendedTerritory;
    }

    /**
     * @return the gsaMinGuaranteedRevYearly
     */
    public BigDecimal getGsaMinGuaranteedRevYearly() {
        return gsaMinGuaranteedRevYearly;
    }

    /**
     * @param gsaMinGuaranteedRevYearly
     *            the gsaMinGuaranteedRevYearly to set
     */
    public void setGsaMinGuaranteedRevYearly(BigDecimal gsaMinGuaranteedRevYearly) {
        this.gsaMinGuaranteedRevYearly = gsaMinGuaranteedRevYearly;
    }

    /**
     * @return the gsaMinGuaranteedRevMonthly
     */
    public BigDecimal getGsaMinGuaranteedRevMonthly() {
        return gsaMinGuaranteedRevMonthly;
    }

    /**
     * @param gsaMinGuaranteedRevMonthly
     *            the gsaMinGuaranteedRevMonthly to set
     */
    public void setGsaMinGuaranteedRevMonthly(BigDecimal gsaMinGuaranteedRevMonthly) {
        this.gsaMinGuaranteedRevMonthly = gsaMinGuaranteedRevMonthly;
    }

    /**
     * Returns the Extended Territory values as space and new line appended value.
     *
     * @return aModifiedString the new value of the <code>Extended Territory</code>.
     *
     */
    public String getGsaExtendedTerritoryAsString() {
        return this.formatCodesForDisplay(this.getGsaExtendedTerritory());
    }

    public String toString() {
        // SuppressOn:MagicNumber
        final StringBuilder csvString = new StringBuilder();
        // SuppressOff:MagicNumber
        if (this.actionType != null && this.actionType.equals(ActionType.FIND)) {

            if (this.getAwbOrigin() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getAwbOrigin()));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getAwbDestination() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getAwbDestination()));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
            if (this.getGsaAgreementName() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getGsaAgreementName()));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getParticipantAccountNumber() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getParticipantAccountNumber()));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

            }
            if (this.getParticipantName() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getParticipantName()));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
            if (this.getStation() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getStation()));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

            }

            if (this.getEffectiveDate() != null) {
                csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getEffectiveDate())));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

            }
            if (this.getExpirationDate() != null) {
                csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getExpirationDate())));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
        }
        else {

            if (this.getGsaAgreementName() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getGsaAgreementName()));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getParticipantName() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getParticipantName()));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getAwbOrigin() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getAwbOrigin()));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getAwbDestination() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getAwbDestination()));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }


            if (this.getAwbOwnerCarrierCode() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getAwbOwnerCarrierCode()));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getCurrency() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getCurrency()));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getEffectiveDate() != null) {
                csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getEffectiveDate())));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getExpirationDate() != null) {
                csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getExpirationDate())));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getGsaCommissionType() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getGsaCommissionType()));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getApplicableCharge()!=null) {
                csvString.append(this.prefixSuffixByQuotes(this.getApplicableCharge()));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getPercentage()!=null) {
                csvString.append(this.prefixSuffixByQuotes(this.getPercentage().toString()));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getGsaTargetBasedOn()!=null) {
                csvString.append(this.prefixSuffixByQuotes(this.getGsaTargetBasedOn()));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getGsaCalculatedOn()!=null) {
                csvString.append(this.prefixSuffixByQuotes(this.getGsaCalculatedOn()));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getGsaCommissionFreq()!=null) {
                csvString.append(this.prefixSuffixByQuotes(this.getGsaCommissionFreq()));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getGsaWeightType()!=null && this.getGsaCommissionType().equals("Sliding Scale")) {
                csvString.append(this.prefixSuffixByQuotes(this.getGsaWeightType()));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getGsaUnitOfWeight()!=null && this.getGsaCommissionType().equals("Sliding Scale")) {
                csvString.append(this.prefixSuffixByQuotes(this.getGsaUnitOfWeight()));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getRatesRangeFrom()!=null) {
                csvString.append(this.prefixSuffixByQuotes(this.getRatesRangeFrom().replaceAll("<br>", " ")));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getRatesRangeTo()!=null) {
                csvString.append(this.prefixSuffixByQuotes(this.getRatesRangeTo().replaceAll("<br>", " ")));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getRatesPercentage()!=null) {
                csvString.append(this.prefixSuffixByQuotes(this.getRatesPercentage().replaceAll("<br>", " ")));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getGsaWeightType()!=null && this.getGsaCommissionType().equals("Rate")) {
                csvString.append(this.prefixSuffixByQuotes(this.getGsaWeightType()));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getGsaUnitOfWeight()!=null && this.getGsaCommissionType().equals("Rate")) {
                csvString.append(this.prefixSuffixByQuotes(this.getGsaUnitOfWeight()));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getAmount()!=null) {
                csvString.append(this.prefixSuffixByQuotes(this.getAmount().toString()));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            //Charges - Weight Charge
            csvString.append(this.prefixSuffixByQuotes((this.getWeightChargeInd())?YES:NO));

            //Charges - Valuation Charge
            csvString.append(this.prefixSuffixByQuotes((this.getValuationChargeInd())?YES:NO));

            //Charges - Other Charge
            csvString.append(this.prefixSuffixByQuotes((this.getOtherChargeInd())?YES:NO));

            //Apply If AWB has(Other Charge)
            if (this.getGsaOtherChargeSelection()!=null && CollectionUtils.isNotEmpty(this.getGsaOtherCharge())) {
                if(this.getGsaOtherChargeSelection().value().equals("O")) {
                    csvString.append(this.prefixSuffixByQuotes("Include Only"));
                }else if(this.getGsaOtherChargeSelection().value().equals("A")) {
                    csvString.append(this.prefixSuffixByQuotes("Include All"));
                }else if(this.getGsaOtherChargeSelection().value().equals("N")) {
                    csvString.append(this.prefixSuffixByQuotes("Exclude Only"));
                }
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            //Other Charge Codes
            if (this.getOtherChargeAsString()!=null) {
                csvString.append(this.prefixSuffixByQuotes(this.getOtherChargeAsString().replaceAll("<br>"," ")));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getGsaProductCodeSelection()!=null && CollectionUtils.isNotEmpty(this.getGsaProductCode())) {
                csvString.append(this.prefixSuffixByQuotes(checkSelectionType(this.getGsaProductCodeSelection())));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getProductAsString()!=null) {
                csvString.append(this.prefixSuffixByQuotes(this.getProductAsString().replaceAll("<br>"," ")));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getGsaSpecialHandlingCode()!=null  && CollectionUtils.isNotEmpty(this.getGsaSpecialHandlingCode())) {
                csvString.append(this.prefixSuffixByQuotes(checkSelectionType(this.getGsaSpecialHandlingCodeSelection())));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getSplAsString()!=null) {
                csvString.append(this.prefixSuffixByQuotes(this.getSplAsString().replaceAll("<br>"," ")));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getGsaCommodityNumberSelection()!=null && CollectionUtils.isNotEmpty(this.getGsaCommodityNumber())) {
                csvString.append(this.prefixSuffixByQuotes(checkSelectionType(this.getGsaCommodityNumberSelection())));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getCommodityAsString()!=null) {
                csvString.append(this.prefixSuffixByQuotes(this.getCommodityAsString().replaceAll("<br>"," ")));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getGsaRoutingSelection()!=null
                    && (!StringUtility.isEmpty(this.getRoutingSegOrg()) || !StringUtility.isEmpty(this.getRoutingSegDest())
                            || !StringUtility.isEmpty(this.getRoutingSegCarr()) || !StringUtility.isEmpty(this.getRoutingFlightNum()) )) {
                csvString.append(this.prefixSuffixByQuotes(checkSelectionType(this.getGsaRoutingSelection())));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getRoutingSegOrg()!=null) {
                csvString.append(this.prefixSuffixByQuotes(this.getRoutingSegOrg().replaceAll("<br>"," ")));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getRoutingSegDest()!=null) {
                csvString.append(this.prefixSuffixByQuotes(this.getRoutingSegDest().replaceAll("<br>"," ")));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getRoutingSegCarr()!=null) {
                csvString.append(this.prefixSuffixByQuotes(this.getRoutingSegCarr().replaceAll("<br>"," ")));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getRoutingFlightNum() !=null) {
                csvString.append(this.prefixSuffixByQuotes(this.getRoutingFlightNum().replaceAll("<br>"," ")));
            }
            else{
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if(null!= this.getGsaMinGuaranteedRevYearly() && EMPTY_STRING != String.valueOf(this.getGsaMinGuaranteedRevYearly())) {
                csvString.append(this.prefixSuffixByQuotes((getGsaMinGuaranteedRevYearly() == null) ? EMPTY_STRING : getGsaMinGuaranteedRevYearly().toString()));
            } else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if(null != this.getGsaMinGuaranteedRevMonthly() && EMPTY_STRING != String.valueOf(this.getGsaMinGuaranteedRevMonthly())) {
                csvString.append(this.prefixSuffixByQuotes((getGsaMinGuaranteedRevMonthly() == null) ? EMPTY_STRING : getGsaMinGuaranteedRevMonthly().toString()));
            } else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if(CollectionUtils.isNotEmpty(this.getGsaExtendedTerritory())) {
                csvString.append(this.prefixSuffixByQuotes(this.getGsaExtendedTerritoryAsString().replaceAll("<br>"," ")));
            } else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getUserAudit() != null && this.getUserAudit().getCreatedOn() != null) {
                csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getUserAudit().getCreatedOn())));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getUserAudit() != null && this.getUserAudit().getCreatedOn() != null) {
                csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getUserAudit().getCreatedOn(), "HH:mm")));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }

            if (this.getUserAudit() != null && this.getUserAudit().getUserIdentifier() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getUserAudit().getUserIdentifier()));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
        }
        return csvString.toString();
    }

    private String checkSelectionType(LogicalOperationType operationType) {
        String selType="";
        if (operationType.value().equals("O")) {
            selType = "Any";
        }
        else if (operationType.value().equals("A")) {
            selType = "All";
        }
        else if (operationType.value().equals("N")) {
            selType = "Do Not";
        }
        return selType;
    }

    /**
     * prefixes and suffixes a given string with open quotes.
     * 
     * @param pString
     *            the new value of the <code>value</code>.
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
}
