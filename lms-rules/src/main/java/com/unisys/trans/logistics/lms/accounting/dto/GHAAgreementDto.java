/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
/**
 * @author SaifAhmad
 */

package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;

/**
 * <code>GHAAgreementDto</code> data transfer class for
 * <code>GHAAgreement</code>.
 * <p>rate
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>ghaAgreementName
 * <li>participantName
 * <li>participantAccountNumber
 * <li>awbOrigin
 * <li>awbDestination
 * <li>awbOwnerCarrierCode
 * <li>currencyCode
 * <li>commissionParameters
 * <li>effectiveFromDate
 * <li>effectiveToDate
 * <li>createdDate
 * <li>createdUser
 * <li>applicableCharge
 * <li>percentageValue
 * <li>amount
 * <li>rate
 * <li>ghaAgreementId
 * <li>station
 * <li>participantName
 * <li>otherChargeCode
 * <li>flatCharge
 * <li>airCraftType
 * <li>flightLegDestination
 * <li>flightLegOrigin
 * <li>handlingStation
 * <li>handlingType
 * <li>uldType
 * <li>uldToChangeType
 * <li>rateApplicablePer
 * <li>rateApplicableOn
 * <li>pieces
 * <li>applicableWeight
 * <li>minimumCharge
 * <li>chargeCode
 * <li>freightCharge
 * <li>awbVolumeLowerBoundary
 * <li>awbVolumeUpperBoundary
 * <li>participantStation
 * <li>otherCommissionCharges
 * <li>AWBChargeCode
 * <li>revenue
 * <li>percentageOnHandlingCharges
 * <li>ghaAgreementRates
 * <li>ghaProductCodes
 * <li>ghaSpecialHandlingCodes
 * <li>ghaUldTypes
 * <li>ghaCommodityNumber
 * <li>create
 * <li>delete
 * <li>update
 * <li>versionIdentifier
 * <li>inter
 * </code>
 * </ul>
 *
 */

@SuppressWarnings({ "all" })

public class GHAAgreementDto extends PersistenceObjectDto {

	private static final long serialVersionUID = 1L;

	private Long oId;

	private String ghaAgreementName;

	private String participantName;

	private String participantAccountNumber;

	private String awbOrigin;

	private String awbDestination;
        
    private String awbOriginStationType;
    
    private String awbDestinationStationType;

	private String awbOwnerCarrierCode;

	private String currencyCode;

	private String commissionParameters;

	private Date effectiveFromDate;

	private Date effectiveToDate;

	private Date createdDate;

	private String createdUser;
	
    private String applicableCharge;
                
    private Double percentageValue;
	    
	private BigDecimal amount;
	
	private BigDecimal rate;
	
	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	private String ghaAgreementId;
	
	private String station;
	
	private String prticipantName;
   
    private String otherChargeCode; 
	
    private Integer flatCharge;

    private String airCraftType;
        
    private String flightLegDestination;
   
    private String flightLegOrigin;
    
    private String handlingStation;
        
    private String handlingType;
        
    /**
    * Attribute to hold <code>uldType</code> property.
    */
    private List<String> uldType;   
        
    private String uldToChangeType;
      
    private String rateApplicablePer;     
        
    private String rateApplicableOn;     
        
    private String pieces;     
        
    private String applicableWeight;     
        
    private String minimumCharge;     
        
    private String chargeCode;     
        
    private Integer freightCharge;

    private String awbVolumeLowerBoundary;     
        
    private String awbVolumeUpperBoundary;     
        
    private String participantStation;     
         
    private String otherCommissionCharges;     
        
    private String AWBChargeCode;     
      
    private Integer revenue;      
           
    /*private String percentageOnHandlingCharges;*/  
    
	private List<GHAAgreementSlidingRatesDto> ghaAgreementRates = new ArrayList<GHAAgreementSlidingRatesDto>();
	
	private List<String> ghaProductCodeList = new ArrayList<String>();
	
	private List<String> ghaSpecialHandlingCodeList = new ArrayList<String>();
	
	private List<String> ghaUldTypeList = new ArrayList<String>();
	
	private List<String> ghaCommodityNumberList = new ArrayList<String>();
	
    private boolean applyProduct = true;    

    private boolean applyCommodity = true;    
    
    private boolean applySpecialHandling = true;    
    
    private boolean applyUldType = true;    
    
	private boolean create = false;

	private boolean delete = false;

	private boolean update = false;
	
	private int versionIdentifier=0;
	
	private boolean inter = false;
	/**
     * Attribute to hold <code>NEW_LINE</code> property.
     */
    private static final String NEW_LINE = "<br>";
    
    /**
     * Attribute to hold <code>WHITE_SPACE</code> property.
     */
    private static final String WHITE_SPACE = " ";
	
	private static final String EMPTY_STRING = "";
	/**

     * Attribute to hold <code>error</code> property.

     */

    private boolean error;

    private ActionType actionType;
    
	
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
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}
	
	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public ActionType getActionType() {
		return actionType;
	}

	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}

	/**
	 * @return the ghaAgreementName
	 */
	public String getGhaAgreementName() {
		return ghaAgreementName;
	}

	/**
	 * @param ghaAgreementName the ghaAgreementName to set
	 */
	public void setGhaAgreementName(String ghaAgreementName) {
		this.ghaAgreementName = ghaAgreementName;
	}

	/**
	 * @return the participantName
	 */
	public String getParticipantName() {
		return participantName;
	}

	/**
	 * @param participantName the participantName to set
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
	 * @param participantAccountNumber the participantAccountNumber to set
	 */
	public void setParticipantAccountNumber(String participantAccountNumber) {
		this.participantAccountNumber = participantAccountNumber;
	}

	/**
	 * @return the awbOrigin
	 */
	public String getAwbOrigin() {
		if(awbOrigin!=null&&!awbOrigin.isEmpty()){
			awbOrigin = awbOrigin.toUpperCase();
		}
		return awbOrigin;
	}

	/**
	 * @param awbOrigin the awbOrigin to set
	 */
	public void setAwbOrigin(String awbOrigin) {
		this.awbOrigin = awbOrigin;
	}

	/**
	 * @return the awbDestination
	 */
	public String getAwbDestination() {
		if(awbDestination!=null&&!awbDestination.isEmpty()){
			awbDestination = awbDestination.toUpperCase();
		}
		return awbDestination;
	}

	/**
	 * @param awbDestination the awbDestination to set
	 */
	public void setAwbDestination(String awbDestination) {
		this.awbDestination = awbDestination;
	}
        /**
         * @return the awbOriginStationType
         */                         
        public void setAwbOriginStationType(String awbOriginStationType) {
            this.awbOriginStationType = awbOriginStationType;
        }
        
        /**
         * @return the awbOriginStationType
         */
        public String getAwbOriginStationType() {
            return awbOriginStationType;
        }
        
        /**
         * @return the awbDestinationStationType
         */     
        public void setAwbDestinationStationType(String awbDestinationStationType) {
            this.awbDestinationStationType = awbDestinationStationType;
        }
        
        /**
         * @return the awbDestinationStationType
         */
        public String getAwbDestinationStationType() {
            return awbDestinationStationType;
        }


	/**
	 * @return the awbOwnerCarrierCode
	 */
	public String getAwbOwnerCarrierCode() {
		return awbOwnerCarrierCode;
	}

	/**
	 * @param awbOwnerCarrierCode the awbOwnerCarrierCode to set
	 */
	public void setAwbOwnerCarrierCode(String awbOwnerCarrierCode) {
		this.awbOwnerCarrierCode = awbOwnerCarrierCode;
	}

	/**
	 * @return the currencyCode
	 */
	public String getCurrency() {
		if(currencyCode!=null&&!currencyCode.isEmpty()){
			currencyCode = currencyCode.toUpperCase();
		}
		return currencyCode;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * @return the ghaCommissionType
	 */
	public String getGhaCommissionType() {
		return commissionParameters;
	}

	/**
	 * @param ghaCommissionType the ghaCommissionType to set
	 */
	public void setGhaCommissionType(String ghaCommissionType) {
		this.commissionParameters = ghaCommissionType;
	}

	/**
	 * @return the effectiveDate
	 */
	public Date getEffectiveDate() {
		return effectiveFromDate;
	}

	/**
	 * @param effectiveDate the effectiveDate to set
	 */
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveFromDate = effectiveDate;
	}

	/**
	 * @return the expirationDate
	 */
	public Date getExpirationDate() {
		return effectiveToDate;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(Date expirationDate) {
		if(expirationDate!=null){
			Calendar cal = Calendar.getInstance();
			cal.setTime(expirationDate);
			if(cal.get(cal.YEAR)==1999){
				cal.set(2033, cal.get(cal.MONTH), cal.get(cal.DATE), cal.get(cal.HOUR_OF_DAY),cal.get(cal.MINUTE),cal.get(cal.SECOND));
				expirationDate = cal.getTime();
			}
		}
		this.effectiveToDate = expirationDate;
	}

	/**
	 * @return the lastUpdatedDate
	 */
	public Date getLastUpdatedDate() {
		return createdDate;
	}

	/**
	 * @param lastUpdatedDate the lastUpdatedDate to set
	 */
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.createdDate = lastUpdatedDate;
	}

	/**
	 * @return the lastUpdatedUser
	 */
	public String getLastUpdatedUser() {
		return createdUser;
	}

	/**
	 * @param lastUpdatedUser the lastUpdatedUser to set
	 */
	public void setLastUpdatedUser(String lastUpdatedUser) {
		this.createdUser = lastUpdatedUser;
	}

	/**
	 * @return the ghaAgreementRates
	 */
	public List<GHAAgreementSlidingRatesDto> getGhaAgreementRates() {
		return ghaAgreementRates;
	}

	/**
	 * @param ghaAgreementRates the ghaAgreementRates to set
	 */
	public void setGhaAgreementRates(List<GHAAgreementSlidingRatesDto> ghaAgreementRates) {
		this.ghaAgreementRates = ghaAgreementRates;
	}

	/**
	 * @return the create
	 */
	public boolean isCreate() {
		return create;
	}

	/**
	 * @param create the create to set
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
	 * @param delete the delete to set
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
	 * @param update the update to set
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
	 * @param applicableCharge the applicableCharge to set
	 */
	public void setApplicableCharge(String applicableCharge) {
		this.applicableCharge = applicableCharge;
	}

	/**
	 * @return the percentage
	 */
	public Double getPercentage() {
		return percentageValue;
	}

	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(Double percentage) {
		this.percentageValue = percentage;
	}
	
	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * @return the ratePerAwb
	 */
	public BigDecimal getRatePerAwb() {
		return rate;
	}

	/**
	 * @param ratePerAwb the ratePerAwb to set
	 */
	public void setRatePerAwb(BigDecimal ratePerAwb) {
		this.rate = ratePerAwb;
	}

	/**
	 * @return the ghaAgreementIdentifier
	 */
	public String getGhaAgreementIdentifier() {
		return ghaAgreementId;
	}

	/**
	 * @param ghaAgreementIdentifier the ghaAgreementIdentifier to set
	 */
	public void setGhaAgreementIdentifier(String ghaAgreementIdentifier) {
		this.ghaAgreementId = ghaAgreementIdentifier;
	}

	/**
	 * @return the station
	 */
	public String getStation() {
		if(station!=null&&!station.isEmpty()){
			station = station.toUpperCase();
		}
		return station;
	}

	/**
	 * @param station the station to set
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
	 * @param prticipantName the prticipantName to set
	 */
	public void setPrticipantName(String prticipantName) {
		this.prticipantName = prticipantName;
	}
        
	/**
	 * @param otherChargeCode the otherChargeCode to set
	 */
    public void setOtherChargeCode(String otherChargeCode) {
        this.otherChargeCode = otherChargeCode;
    }
    
    /**
	 * @return the otherChargeCode
	 */
	public String getOtherChargeCode() {
        return otherChargeCode;
    }
    
	/**
	 * @param flatCharge the flatCharge to set
	 */
    public void setFlatCharge(Integer flatCharge) {
        this.flatCharge = flatCharge;
    }
    
    /**
	 * @return the flatCharge
	 */
	public Integer getFlatCharge() {
        return flatCharge;
    }
    
	/**
	 * @param airCraftType the airCraftType to set
	 */
    public void setAirCraftType(String airCraftType) {
        this.airCraftType = airCraftType;
    }
    
    /**
	 * @return the airCraftType
	 */
    public String getAirCraftType() {
    	if(airCraftType!=null && !airCraftType.isEmpty()){
    		airCraftType=airCraftType.toUpperCase();
    	}
        return airCraftType;
    }
    
    /**
	 * @param flightLegDestination the flightLegDestination to set
	 */
    public void setFlightLegDestination(String flightLegDestination) {
        this.flightLegDestination = flightLegDestination;
    }
    
    /**
	 * @return the flightLegDestination
	 */
    public String getFlightLegDestination() {
        if(flightLegDestination!=null&&!flightLegDestination.isEmpty()){
        	flightLegDestination = flightLegDestination.toUpperCase();
    }
        return flightLegDestination;
    }
    
    /**
	 * @param flightLegOrigin the flightLegOrigin to set
	 */
    public void setFlightLegOrigin(String flightLegOrigin) {
        this.flightLegOrigin = flightLegOrigin;
    }
    
    /**
	 * @return the flightLegOrigin
	 */
    public String getFlightLegOrigin() {
        if(flightLegOrigin!=null&&!flightLegOrigin.isEmpty()){
        	flightLegOrigin = flightLegOrigin.toUpperCase();
    	}
        return flightLegOrigin;
    }
    
    /**
	 * @return the handlingStation
	 */
	public String getHandlingStation() {
		if(handlingStation!=null && !handlingStation.isEmpty()){
			this.handlingStation = handlingStation.toUpperCase();
		}
		return handlingStation;
	}

	/**
	 * @param handlingStation the handlingStation to set
	 */
	public void setHandlingStation(String handlingStation) {
		this.handlingStation = handlingStation;
	}

	/**
	 * @param handlingType the handlingType to set
	 */
    public void setHandlingType(String handlingType) {
        this.handlingType = handlingType;
    }
    
    /**
	 * @return the handlingType
	 */
    public String getHandlingType() {
        return handlingType;
    }
    
    /**
     * Gets the <code>uldType</code> property.
     * <p>
     * 
     * @return the current value of the <code>uldType</code> property.
     */
    public List<String> getUldType() {
        return this.uldType;
    }
    /**
     * Sets the <code>uldType</code> property.
     * <p>
     * 
     * @param pUldType
     *            the current value of the <code>uldType</code> property.
     */
    public void setUldType(final List<String> pUldType) {
        this.uldType = this.covertListToUpperCase(pUldType);
    	 
    }
    
    /**
     * Gets the <code>uldType</code> property.
     * <p>
     * 
     * @return the current value of the <code>uldType</code> property.
     */
    public String getUldToChangeType() {
        return this.uldToChangeType;
    }
    /**
     * Sets the <code>uldType</code> property.
     * <p>
     * 
     * @param pUldType
     *            the current value of the <code>uldType</code> property.
     */
    public void setUldToChangeType(final String uldToChangeType) {
    	  this.uldToChangeType = uldToChangeType;
    }
    
    
    public void setRateApplicablePer(String rateApplicablePer) {
        this.rateApplicablePer = rateApplicablePer;
    }

    /**
	 * @return the rateApplicablePer
	 */
    public String getRateApplicablePer() {
        return rateApplicablePer;
    }

    /**
	 * @param rateApplicableOn the rateApplicableOn to set
	 */
    public void setRateApplicableOn(String rateApplicableOn) {
        this.rateApplicableOn = rateApplicableOn;
    }

    /**
	 * @return the rateApplicableOn
	 */
    public String getRateApplicableOn() {
        return rateApplicableOn;
    }

    /**
	 * @param pieces the pieces to set
	 */
    public void setPieces(String pieces) {
        this.pieces = pieces;
    }

    /**
	 * @return the pieces
	 */
    public String getPieces() {
        return pieces;
    }

    /**
	 * @param applicableWeight the applicableWeight to set
	 */
    public void setApplicableWeight(String applicableWeight) {
        this.applicableWeight = applicableWeight;
    }

    /**
	 * @return the applicableWeight
	 */
    public String getApplicableWeight() {
        return applicableWeight;
    }

    /**
	 * @param minimumCharge the minimumCharge to set
	 */
    public void setMinimumCharge(String minimumCharge) {
        this.minimumCharge = minimumCharge;
    }

    /**
	 * @return the minimumCharge
	 */
    public String getMinimumCharge() {
        return minimumCharge;
    }

    /**
	 * @param chargeCode the chargeCode to set
	 */
    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    /**
	 * @return the chargeCode
	 */
    public String getChargeCode() {
        return chargeCode;
    }

    /**
	 * @param freightCharge the freightCharge to set
	 */
    public void setFreightCharge(Integer freightCharge) {
        this.freightCharge = freightCharge;
    }

    /**
	 * @return the freightCharge
	 */
    public Integer getFreightCharge() {
        return freightCharge;
    }

    /**
	 * @param awbVolumeLowerBoundary the awbVolumeLowerBoundary to set
	 */
    public void setAwbVolumeLowerBoundary(String awbVolumeLowerBoundary) {
        this.awbVolumeLowerBoundary = awbVolumeLowerBoundary;
    }

    /**
	 * @return the awbVolumeLowerBoundary
	 */
    public String getAwbVolumeLowerBoundary() {
        return awbVolumeLowerBoundary;
    }

    /**
	 * @param awbVolumeUpperBoundary the awbVolumeUpperBoundary to set
	 */
    public void setAwbVolumeUpperBoundary(String awbVolumeUpperBoundary) {
        this.awbVolumeUpperBoundary = awbVolumeUpperBoundary;
    }

    /**
	 * @return the awbVolumeUpperBoundary
	 */
    public String getAwbVolumeUpperBoundary() {
        return awbVolumeUpperBoundary;
    }

    /**
	 * @param participantStation the participantStation to set
	 */
    public void setParticipantStation(String participantStation) {
        this.participantStation = participantStation;
    }

    /**
	 * @return the participantStation
	 */
    public String getParticipantStation() {
        return participantStation;
    }
    
    /**
	 * @param otherCommissionCharges the otherCommissionCharges to set
	 */
    public void setOtherCommissionCharges(String otherCommissionCharges) {
        this.otherCommissionCharges = otherCommissionCharges;
    }

    /**
	 * @return the otherCommissionCharges
	 */
    public String getOtherCommissionCharges() {
        return otherCommissionCharges;
    }

    /**
	 * @param AWBChargeCode the AWBChargeCode to set
	 */
    public void setAWBChargeCode(String AWBChargeCode) {
        this.AWBChargeCode = AWBChargeCode;
    }

    /**
	 * @return the AWBChargeCode
	 */
    public String getAWBChargeCode() {
        return AWBChargeCode;
    }

    /**
	 * @param revenue the revenue to set
	 */
    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    /**
	 * @return the revenue
	 */
    public Integer getRevenue() {
        return revenue;
    }

    /**
	 * @param percentageOnHandlingCharges 
	 * the percentageOnHandlingCharges to set
	 *//*
    public void setPercentageOnHandlingCharges(String percentageOnHandlingCharges) {
        this.percentageOnHandlingCharges = percentageOnHandlingCharges;
    }

     *//**
 	 * @return the percentageOnHandlingCharges
 	 *//* 
    public String getPercentageOnHandlingCharges() {
        return percentageOnHandlingCharges;
    }*/
	/**
	 * @return the versionIdentifier
	 */
	public int getVersionIdentifier() {
		return versionIdentifier;
	}

	/**
	 * @param versionIdentifier the versionIdentifier to set
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
	 * @param inter the inter to set
	 */
	public void setInter(boolean inter) {
		this.inter = inter;
	}

	  /**
     * This methods converts the input code's to uppercase.
     * 
     * @param pList
     *            the list of <code>code</code>'s.
     * 
     * @return aNewList the list of uppercase <code>code</code>'s.
     * 
     */
    private List<String> covertListToUpperCase(final List<String> pList) {
        final List<String> aNewList = new ArrayList<String>();
        String anUpperCaseString = null;
        if (pList != null) {
            for (String aCode : pList) {
                anUpperCaseString = ContractUtility.convertToUpperCase(aCode);
                aNewList.add(anUpperCaseString);
            }
        }
        return aNewList;
    }

	/**
	 * @return the ghaProductCodeList
	 */
	public List<String> getGhaProductCodeList() {
		return ghaProductCodeList;
	}

	/**
	 * @param ghaProductCodeList the ghaProductCodeList to set
	 */
	public void setGhaProductCodeList(List<String> ghaProductCodeList) {
		this.ghaProductCodeList = ghaProductCodeList;
	}
	
	/**
	 * @return the applyProduct
	 */
	public boolean isApplyProduct() {
		return applyProduct;
	}

	/**
	 * @param boolean the applyProduct to set
	 */
	public void setApplyProduct(boolean applyProduct) {
		this.applyProduct = applyProduct;
	}

	/**
	 * @return the applyCommodity
	 */
	public boolean isApplyCommodity() {
		return applyCommodity;
	}

	/**
	 * @param boolean the applyCommodity to set
	 */
	public void setApplyCommodity(boolean applyCommodity) {
		this.applyCommodity = applyCommodity;
	}

	/**
	 * @return the applySpecialHandling
	 */
	public boolean isApplySpecialHandling() {
		return applySpecialHandling;
	}

	/**
	 * @param boolean the applySpecialHandling to set
	 */
	public void setApplySpecialHandling(boolean applySpecialHandling) {
		this.applySpecialHandling = applySpecialHandling;
	}

	/**
	 * @return the applyUldType
	 */
	public boolean isApplyUldType() {
		return applyUldType;
	}

	/**
	 * @param boolean the applyUldType to set
	 */
	public void setApplyUldType(boolean applyUldType) {
		this.applyUldType = applyUldType;
	}

	/**
	 * @return the codes
	 */
	public List<String> getProductCode(){
		
		ArrayList<String> codes = new ArrayList<String>();
		/*if( this.getGhaProductCodes() != null ){
			List<String> ghaProductCodes = this.getGhaProductCodes();
			
			if(ghaProductCodes != null)
				for( GHAProductCodeDto ghaProductCodeDto : ghaProductCodes ){
					if( ( ghaProductCodeDto.getProductTextBoxOne() != null ) && ( ghaProductCodeDto.getProductTextBoxOne() != "" ) )
						codes.add( ghaProductCodeDto.getProductTextBoxOne() );
					if( ( ghaProductCodeDto.getProductTextBoxTwo() != null ) && ( ghaProductCodeDto.getProductTextBoxTwo() != "" ) )
						codes.add( ghaProductCodeDto.getProductTextBoxTwo() );
					if( ( ghaProductCodeDto.getProductTextBoxThree() != null ) && ( ghaProductCodeDto.getProductTextBoxThree() != "" ) )
						codes.add( ghaProductCodeDto.getProductTextBoxThree() );
					if( ( ghaProductCodeDto.getProductTextBoxFour() != null ) && ( ghaProductCodeDto.getProductTextBoxFour() != "" ) )
						codes.add( ghaProductCodeDto.getProductTextBoxFour() );
					if( ( ghaProductCodeDto.getProductTextBoxFive() != null ) && ( ghaProductCodeDto.getProductTextBoxFive() != "" ) )
						codes.add( ghaProductCodeDto.getProductTextBoxFive() );
				}
			
		}*/
		return codes;
	}
	
	/**
	 * @return String 
	 * Returns the List of Product Codes delimited by single blank space 
	 * as a single string. 
	 */
	/*public String getProductCodesAsString(){
		return this.formatCodesForDisplay(this.getProductCode());
	}
*/
	

	

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((oId == null) ? 0 : oId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GHAAgreementDto other = (GHAAgreementDto) obj;
		if (oId == null) {
			if (other.oId != null)
				return false;
		} else if (!oId.equals(other.oId))
			return false;
		return true;
	}

    @SuppressWarnings({ "all" })
    public String toString() {
        // SuppressOn:MagicNumber
        final StringBuffer csvString = new StringBuffer();
        // SuppressOff:MagicNumber
        if (this.actionType!=null&&this.actionType.equals(ActionType.FIND)) {
        	
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
            if (this.getFlightLegOrigin()!= null) {
                csvString.append(this.prefixSuffixByQuotes(this.getFlightLegOrigin()));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
            if (this.getFlightLegDestination()!= null) {
                csvString.append(this.prefixSuffixByQuotes(this.getFlightLegDestination()));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
            
            if (this.getHandlingStation()!=null) {
            	csvString.append(this.prefixSuffixByQuotes(this.getHandlingStation()));
            }
            else {
            	csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
            
        	if (this.getGhaAgreementName()!= null) {
                csvString.append(this.prefixSuffixByQuotes(this.getGhaAgreementName()));
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
            
            if (this.getEffectiveDate()!= null) {
                csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getEffectiveDate())));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

            }
            if (this.getExpirationDate()!= null) {
                csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getExpirationDate())));
            }
            else {

                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
		} else {

        if (this.getGhaAgreementName()!= null) {
            csvString.append(this.prefixSuffixByQuotes(this.getGhaAgreementName()));
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
        if (this.getFlightLegOrigin()!= null) {
            csvString.append(this.prefixSuffixByQuotes(this.getFlightLegOrigin()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getFlightLegDestination()!= null) {
            csvString.append(this.prefixSuffixByQuotes(this.getFlightLegDestination()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if(this.getHandlingStation()!=null){
        	csvString.append(this.prefixSuffixByQuotes(this.getHandlingStation()));
        }
        else{
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
        if (this.getHandlingType() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getHandlingType()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        }
        if (this.getAirCraftType() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getAirCraftType()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        }
        /*if (this.getPercentageOnHandlingCharges() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getPercentageOnHandlingCharges()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        }*/
        if (this.getGhaCommodityNumberList() != null && !this.getGhaCommodityNumberList().isEmpty()) {
            csvString.append(this.prefixSuffixByQuotes(this.getCommodityNumbersAsString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        }
        if (this.getGhaProductCodeList() != null && !this.getGhaProductCodeList().isEmpty()) {
            csvString.append(this.prefixSuffixByQuotes(this.getProductCodesAsString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        }
        if (this.getGhaSpecialHandlingCodeList() != null && !this.getGhaSpecialHandlingCodeList().isEmpty()) {
            csvString.append(this.prefixSuffixByQuotes(this.getSpecialHandlingAsString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        }
        if (this.getGhaUldTypeList() != null && !this.getGhaUldTypeList().isEmpty()) {
            csvString.append(this.prefixSuffixByQuotes(this.getUldTypesAsString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        }
        if (this.getGhaCommissionType() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getGhaCommissionType()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        }
        if (this.getEffectiveDate()!= null) {
            csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getEffectiveDate())));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        }
        if (this.getExpirationDate()!= null) {
            csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getExpirationDate())));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        }
        
        if (this.getLastUpdatedDate()!= null) {
            csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getLastUpdatedDate())));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        }
        
        if (this.getLastUpdatedDate()!= null) {
            csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getLastUpdatedDate(),"HH:mm")));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        }
        
        if (this.getLastUpdatedUser()!= null) {
            csvString.append(this.prefixSuffixByQuotes(this.getLastUpdatedUser()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        }
		}
        return csvString.toString();
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
     * Returns the given Code's values as space and new line appended value.
     * 
     * @param pInputCodes
     *            the list of <code>codes</code>.
     * 
     * @return aModifiedString the new value of the given<code>Code's</code>.
     * 
     */
    public String formatCodesForDisplay(final List<String> pInputCodes) {
        final StringBuffer aCodeAsString = new StringBuffer();
        if (pInputCodes != null && !pInputCodes.isEmpty()) {
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

	/**
	 * @return the productCodesAsString
	 */
	public String getProductCodesAsString() {
		
		return this.formatCodesForDisplay(this.getGhaProductCodeList());
	}
	
	/**
	 * @return String 
	 * Returns the List of Special Handling Codes delimited by single blank space 
	 * as a single string. 
	 */
	public String getSpecialHandlingAsString(){
		
		
		return this.formatCodesForDisplay(this.getGhaSpecialHandlingCodeList());
	}
	/**
	 * @return String 
	 * Returns the List of commodity numbers delimited by single blank space 
	 * as a single string. 
	 */
	public String getCommodityNumbersAsString(){
		
		
		return this.formatCodesForDisplay(this.getGhaCommodityNumberList());
	}
	
	/**
	 * @return String 
	 * Returns the List of ULD Types delimited by single blank space 
	 * as a single string. 
	 */
	public String getUldTypesAsString(){
		
		
		return this.formatCodesForDisplay(this.getGhaUldTypeList());
	}
	/**
	 * @return the ghaSpecialHandlingCodeList
	 */
	public List<String> getGhaSpecialHandlingCodeList() {
		return ghaSpecialHandlingCodeList;
	}

	/**
	 * @param ghaSpecialHandlingCodeList the ghaSpecialHandlingCodeList to set
	 */
	public void setGhaSpecialHandlingCodeList(
			List<String> ghaSpecialHandlingCodeList) {
		this.ghaSpecialHandlingCodeList = ghaSpecialHandlingCodeList;
	}

	/**
	 * @return the ghaUldTypeList
	 */
	public List<String> getGhaUldTypeList() {
		return ghaUldTypeList;
	}

	/**
	 * @param ghaUldTypeList the ghaUldTypeList to set
	 */
	public void setGhaUldTypeList(List<String> ghaUldTypeList) {
		this.ghaUldTypeList = ghaUldTypeList;
	}

	/**
	 * @return the ghaCommodityNumberList
	 */
	public List<String> getGhaCommodityNumberList() {
		return ghaCommodityNumberList;
	}

	/**
	 * @param ghaCommodityNumberList the ghaCommodityNumberList to set
	 */
	public void setGhaCommodityNumberList(List<String> ghaCommodityNumberList) {
		this.ghaCommodityNumberList = ghaCommodityNumberList;
	}
	
	
}
