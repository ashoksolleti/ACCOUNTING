/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.constants.ExceptionType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.preferences.CheckType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>RestrictionGenerateRequest</code>is used for finding restriction errors
 * and warnings for AWB routing, segment and collect charge restrictions.It
 * contains the list of RestrictionGenerateRoutingDto,
 * RestrictionGenerateSegmentDto and RestrictionGenerateCodeDto that hold the
 * input information to find the export, import, transit and systemwide
 * restriction for a particular station and carrier with other input filters
 * such as date, dayofoperation, ToStaion/Country, Product Codes, Special
 * Handling Codes, Flight Number, Aircraft type, Aircraft Registration Number.
 * RestrictionGenerateDto contains the routing station and carrier information.
 * RestrictionGenerateSegmentDto contains the segment origin, destination
 * stations and flight information. RestrictionGenerateCodeDto contains the
 * specialhandling and product code informations.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>restrictionOnlyIndicator
 * <li>responseMessageType
 * <li>routingDate
 * <li>restrictionGenerateRoutings
 * <li>restrictionGenerateSegments
 * <li>restrictionGenerateCodes
 * </code>
 * </ul>
 */
public class RestrictionCheckerRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8747850993052652534L;

    /**
     * Attribute to hold <code>responseMessageType</code> property.
     * <p>
     * it refers to the Response Message type.
     * <ul>
     * <li>WARN - Return warning response messages for restrictive station restrictions.
     * <li>ERR - Return error response messages for restrictive station restrictions.
     * </ul>
     */
    private ExceptionType responseMessageType;

    /**
     * Attribute to hold <code>showAllInd</code> property.
     * <p>
     * Attribute to check whether routing should be displayed for error condition.
     */
    private boolean showAllInd;
    private boolean multiSegment;
    private List<RestrictionCheckerCodeDto> exportRestrictionCodes;
    private List<RestrictionCheckerCodeDto> importRestrictionCodes;
    private List<RestrictionCheckerCodeDto> transitRestrictionCodes;
    private boolean isFromBooking;
    private boolean skipExportCodes;
    private int mutisegmentIndex;
    
    //LMS-57779
    private Map<String,List<RestrictionCheckerCodeDto>>  segmentRestrictions;

    /**
     * Attribute to hold <code>restrictionGenerateCodes</code> property.
     * <p>
     * Represent the codes applicable to a restriction.It is of type <code>RestrictionGenerateCodeDto</code>
     * class.
     */
    private List<RestrictionCheckerCodeDto> restrictionGenerateCodes;

    /**
     * Attribute to hold <code>restrictionGenerateRoutings</code> property.
     * <p>
     * Indicates routing origin station to the destination station through a set of intermediate stations.
     * There can be up to 5 intermediate stations.It is of type <code>RestrictionGenerateRoutingDto</code>.
     */
    private List<RestrictionCheckerRoutingDto> restrictionGenerateRoutings;

    /**
     * Attribute to hold <code>restrictionGenerateRoutings</code> property.
     * <p>
     * Indicates the segment informations such as segment origin, segment destination, arrivalDate,
     * departureDate, aircraftEquipmentCode and aircraftRegistrationNumber.It is of type
     * <code>RestrictionGenerateSegmentDto</code>.
     */
    private List<RestrictionCheckerSegmentDto> restrictionGenerateSegments;

    /**
     * Attribute to hold <code>restrictionOnlyIndicator</code> property.
     * <p>
     * Attribute specifies whether restriction or both restrictions and warnings have to be returned.
     * <li>True - Restrictions only.
     * <li>False - Return both warnings and restrictions.
     */
    private boolean restrictionOnlyIndicator;

    /**
     * Attribute to hold <code>restrictionConditionIndicator</code> property.
     * <p>
     * Attribute specifies only restriction Condition have to be returned if error condition does not apply.
     * <li>True -Returns error condition if any.
     */
    private boolean restrictionConditionIndicator;

    /**
     * Gets the <code>errorOnlyIndicator</code> property.
     * <p>
     * Attribute specifies only restriction Condition have to be returned if error condition does not apply.
     * <li>True -Returns error condition if any.
     * <p>
     * 
     * @return The current value of <code>isRestrictionOnlyIndicator</code> property.<br>
     */
// AC432A

	Map<String, String> participnts;

	private BigDecimal weight;

	private String weightUnit;

	private BigDecimal dimension;

	private String dimensionUnit;

	private String shipmentImpacted;

	private String alert;

	private String world;

	private String startTime;

	private String endTime;

	private String country;

	private String commodity;
	
	private boolean goodsAccepted = false;
	
	private Date firstAcceptedDate;
	
	private Date awbExecutionDate;
	
	private List<Date> flightExecutionDates;
	
	private Date flightDepartureDate;
	
	private Date flightArrivalDate;
	
	private boolean orderExecutedInd; 
	
	private boolean hiddenSegmentsFound;  
	
	List<RestrictionCheckerRoutingDto> hiddenSegmentsDtoList;
	
	private String autoFlightAssignment;
    private String manualFlightAssignment;
    private String overrideIndicator;

	private List<FlightInformationDto> flightInformationDtos;

	private CheckType transitCheckType;
	
	private int segmentsSeqNum;
	
	private Map<String, RestrictionCheckerRoutingDto> routingMap;
	//private List<LegInformationDto> hiddenLegs;

	// AC432A End
    public boolean isRestrictionConditionIndicator() {
        return restrictionConditionIndicator;
    }

    /**
     * Sets <code>errorOnlyIndicator</code> property.
     * <p>
     * Attribute specifies only restriction Condition have to be returned if error condition does not apply.
     * <li>True -Returns error condition if any.
     * <p>
     * 
     * @param pErrorOnlyIndicator
     *            new value of the <code>errorOnlyIndicator</code> property.
     */
    public void setRestrictionConditionIndicator(boolean restrictionConditionIndicator) {
        this.restrictionConditionIndicator = restrictionConditionIndicator;
    }

    /**
     * Attribute to hold <code>routingDate</code> property.
     * <p>
     * it refers the AWB routing date.
     */
    private Date routingDate;
    
    private CheckType checkType;
    
    private String AWBpaycode;
    
    private boolean paycodeCollect;
    
    private boolean fromCollectCharge;
    
    public String getAWBpaycode() {
		return AWBpaycode;
	}

	public void setAWBpaycode(String aWBpaycode) {
		AWBpaycode = aWBpaycode;
	}

    public CheckType getCheckType() {
        return checkType;
    }

    public void setCheckType(CheckType checkType) {
        this.checkType = checkType;
    }

    /**
     * Default constructor.
     */
    public RestrictionCheckerRequest() {

    }

    /**
     * Gets the the reference of <code>ExceptionType</code> property.
     * <p>
     * it refers to the Response Message type.
     * <ul>
     * <li>WARN - Return warning response messages for restrictive station restrictions.
     * <li>ERR - Return error response messages for restrictive station restrictions.
     * </ul>
     * <p>
     * 
     * @return the current value of the <code>responseMessageType</code> property.
     */

    public ExceptionType getResponseMessageType() {
        return this.responseMessageType;
    }

    /**
     * Holds the list of <code>restrictionGenerateCodes</code> that contains the
     * restriction codes.
     * <p>
     * Represent the codes applicable to a restriction.It is of type <code>RestrictionGenerateCodeDto</code>
     * class.
     * <p>
     * 
     * @return the current value of <code>restrictionCodes</code> property.
     */

    public List<RestrictionCheckerCodeDto> getRestrictionGenerateCodes() {
    	if (this.restrictionGenerateCodes == null) {
            this.restrictionGenerateCodes = new ArrayList<RestrictionCheckerCodeDto>();
        }
        return this.restrictionGenerateCodes;
    }

    /**
     * Gets the set of <code>RestrictionGenerateRoutingDto</code>that contains
     * the restrictionGenerateRoutings.
     * <p>
     * Indicates routing origin station to the destination station through a set of intermediate stations.
     * There can be up to 5 intermediate stations.It is of type <code>RestrictionGenerateRoutingDto</code>
     * <p>
     * 
     * @return the current value of <code>restrictionGenerateRoutings</code> property.
     */

    public List<RestrictionCheckerRoutingDto> getRestrictionGenerateRoutings() {
        if (this.restrictionGenerateRoutings == null) {
            this.restrictionGenerateRoutings = new ArrayList<RestrictionCheckerRoutingDto>();
        }
        return this.restrictionGenerateRoutings;
    }

    /**
     * Gets <code>restrictionGenerateSegments</code> property.
     * <p>
     * Indicates the segment informations such as segment origin, segment destination, arrivalDate,
     * departureDate, aircraftEquipmentCode and aircraftRegistrationNumber.It is of type
     * <code>RestrictionGenerateSegmentDto</code>.
     * <p>
     * 
     * @return the current value of <code>restrictionGenerateSegments</code> property.
     */

    public List<RestrictionCheckerSegmentDto> getRestrictionGenerateSegments() {
        if (this.restrictionGenerateSegments == null) {
            this.restrictionGenerateSegments = new ArrayList<RestrictionCheckerSegmentDto>();
        }
        return this.restrictionGenerateSegments;

    }

    /**
     * Gets the value of the <code>routingDate</code> property.
     * <p>
     * it refers the AWB routing date.
     * <p>
     * <b>Format: </b><br>
     * 7 DATE ddMMMyy<br>
     * <b>Example: </b><br>
     * 06MAR07
     * 
     * @return the current value of reference of<code>routingDate</code> property.
     */

    public Date getRoutingDate() {

        return ContractUtility.getClonedDate(this.routingDate);

    }

    /**
     * Gets the <code>restrictionOnlyIndicator</code> property.
     * <p>
     * Attribute specifies whether restriction or both restrictions and warnings have to be returned.
     * <li>True - Restrictions only.
     * <li>False - Return both warnings and restrictions.
     * <p>
     * 
     * @return The current value of <code>isRestrictionOnlyIndicator</code> property.<br>
     */
    public boolean isRestrictionOnlyIndicator() {

        return this.restrictionOnlyIndicator;

    }

    /**
     * Sets the <code>ExceptionType</code> enum class.
     * <p>
     * it refers to the Response Message type.
     * <ul>
     * <li>WARN - Return warning response messages for restrictive station restrictions.
     * <li>ERR - Return error response messages for restrictive station restrictions.
     * </ul>
     * <p>
     * 
     * @param pResponseMessageType
     *            the new value of the <code>responseMessageType</code> property.
     */

    public void setResponseMessageType(final ExceptionType pResponseMessageType) {
        this.responseMessageType = pResponseMessageType;
    }

    /**
     * Sets the <code>restrictionGenerateCodes</code> property.
     * <p>
     * Represent the codes applicable to a restriction.It is of type <code>RestrictionCodeDto</code> class.
     * <p>
     * 
     * @param pRestrictionGenerateCode
     *            the new value of the <code>restrictionGenerateCodes</code> property.
     */

    public void setRestrictionGenerateCodes(
                final List<RestrictionCheckerCodeDto> pRestrictionGenerateCode) {
        this.restrictionGenerateCodes = pRestrictionGenerateCode;
    }

    /**
     * Sets the <code>RestrictionGenerateRoutingDto</code> that contains
     * restrictionGenerateRoutings.
     * <p>
     * Indicates routing origin station to the destination station through a set of intermediate stations.
     * There can be up to 5 intermediate stations.It is of type <code>RestrictionGenerateRoutingDto</code>.
     * <p>
     * 
     * @param pRestrictionGenerateRouting
     *            the new value of the <code>restrictionGenerateRoutings</code> property.
     */

    public void setRestrictionGenerateRoutings(
                final List<RestrictionCheckerRoutingDto> pRestrictionGenerateRouting) {
        this.restrictionGenerateRoutings = pRestrictionGenerateRouting;
    }

    /**
     * Sets the <code>RestrictionGenerateSegmentDto</code> that contains segment
     * information.
     * <p>
     * Indicates the segment informations such as segment origin, segment destination, arrivalDate,
     * departureDate, aircraftEquipmentCode and aircraftRegistrationNumber.It is of type
     * <code>RestrictionGenerateSegmentDto</code>.
     * <p>
     * 
     * @param pRestrictionGenerateSegment
     *            the new value of the <code>restrictionGenerateSegments</code> property.
     */

    public void setRestrictionGenerateSegments(
                final List<RestrictionCheckerSegmentDto> pRestrictionGenerateSegment) {
        this.restrictionGenerateSegments = pRestrictionGenerateSegment;
    }

    /**
     * Sets <code>restrictionOnlyIndicator</code> property.
     * <p>
     * Attribute specifies whether restriction or both restrictions and warnings have to be returned.
     * <li>True - Restrictions only.
     * <li>False - Return both warnings and restrictions.
     * <p>
     * 
     * @param pRestrictionOnlyIndicator
     *            new value of the <code>restrictionOnlyIndicator</code> property.
     */

    public void setRestrictionOnlyIndicator(
                final boolean pRestrictionOnlyIndicator) {
        this.restrictionOnlyIndicator = pRestrictionOnlyIndicator;
    }

    /**
     * Sets the value of AWB <code>routingDate</code> property.
     * <p>
     * it refers the AWB routing date.
     * <p>
     * <b>Format: </b><br>
     * 7 DATE ddMMMyy<br>
     * <b>Example: </b><br>
     * 06MAR07
     * <p>
     * 
     * @param pRoutingDate
     *            the new value of the <code>routingDate</code> property.
     */

    public void setRoutingDate(final Date pRoutingDate) {
        this.routingDate = ContractUtility.getClonedDate(pRoutingDate);

    }

    /**
     * Attribute to hold <code>showAllInd</code> property.
     * <p>
     * Attribute to check whether routing should be displayed for error condition.
     */
    public boolean isShowAllInd() {
        return showAllInd;
    }

    /**
     * Attribute to hold <code>showAllInd</code> property.
     * <p>
     * Attribute to check whether routing should be displayed for error condition.
     */
    public void setShowAllInd(boolean showAllInd) {
        this.showAllInd = showAllInd;
    }

	/**
	 * @return the participnts
	 */
	public Map<String, String> getParticipnts() {
		return participnts;
	}

	/**
	 * @param participnts the participnts to set
	 */
	public void setParticipnts(Map<String, String> participnts) {
		this.participnts = participnts;
	}

	/**
	 * @return the weight
	 */
	public BigDecimal getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	/**
	 * @return the weightUnit
	 */
	public String getWeightUnit() {
		return weightUnit;
	}

	/**
	 * @param weightUnit the weightUnit to set
	 */
	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	/**
	 * @return the dimension
	 */
	public BigDecimal getDimension() {
		return dimension;
	}

	/**
	 * @param dimension the dimension to set
	 */
	public void setDimension(BigDecimal dimension) {
		this.dimension = dimension;
	}

	/**
	 * @return the dimensionUnit
	 */
	public String getDimensionUnit() {
		return dimensionUnit;
	}

	/**
	 * @param dimensionUnit the dimensionUnit to set
	 */
	public void setDimensionUnit(String dimensionUnit) {
		this.dimensionUnit = dimensionUnit;
	}

	/**
	 * @return the shipmentImpacted
	 */
	public String getShipmentImpacted() {
		return shipmentImpacted;
	}

	/**
	 * @param shipmentImpacted the shipmentImpacted to set
	 */
	public void setShipmentImpacted(String shipmentImpacted) {
		this.shipmentImpacted = shipmentImpacted;
	}

	/**
	 * @return the alert
	 */
	public String getAlert() {
		return alert;
	}

	/**
	 * @param alert the alert to set
	 */
	public void setAlert(String alert) {
		this.alert = alert;
	}

	/**
	 * @return the world
	 */
	public String getWorld() {
		return world;
	}

	/**
	 * @param world the world to set
	 */
	public void setWorld(String world) {
		this.world = world;
	}

	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the commodity
	 */
	public String getCommodity() {
		return commodity;
	}

	/**
	 * @param commodity the commodity to set
	 */
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}

	/**
	 * @return the goodsAccepted
	 */
	public boolean isGoodsAccepted() {
		return goodsAccepted;
	}

	/**
	 * @param goodsAccepted the goodsAccepted to set
	 */
	public void setGoodsAccepted(boolean goodsAccepted) {
		this.goodsAccepted = goodsAccepted;
	}

	/**
	 * @return the firstAcceptedDate
	 */
	public Date getFirstAcceptedDate() {
		return firstAcceptedDate;
	}

	/**
	 * @param firstAcceptedDate the firstAcceptedDate to set
	 */
	public void setFirstAcceptedDate(Date firstAcceptedDate) {
		this.firstAcceptedDate = firstAcceptedDate;
	}

	/**
	 * @return the awbExecutionDate
	 */
	public Date getAwbExecutionDate() {
		return awbExecutionDate;
	}

	/**
	 * @param awbExecutionDate the awbExecutionDate to set
	 */
	public void setAwbExecutionDate(Date awbExecutionDate) {
		this.awbExecutionDate = awbExecutionDate;
	}

	/**
	 * @return the flightExecutionDates
	 */
	public List<Date> getFlightExecutionDates() {
		return flightExecutionDates;
	}

	/**
	 * @param flightExecutionDates the flightExecutionDates to set
	 */
	public void setFlightExecutionDates(List<Date> flightExecutionDates) {
		this.flightExecutionDates = flightExecutionDates;
	}

	/**
	 * @return the flightDepartureDate
	 */
	public Date getFlightDepartureDate() {
		return flightDepartureDate;
	}

	/**
	 * @param flightDepartureDate the flightDepartureDate to set
	 */
	public void setFlightDepartureDate(Date flightDepartureDate) {
		this.flightDepartureDate = flightDepartureDate;
	}

	/**
	 * @return the flightArrivalDate
	 */
	public Date getFlightArrivalDate() {
		return flightArrivalDate;
	}

	/**
	 * @param flightArrivalDate the flightArrivalDate to set
	 */
	public void setFlightArrivalDate(Date flightArrivalDate) {
		this.flightArrivalDate = flightArrivalDate;
	}

	/**
	 * @return the orderExecutedInd
	 */
	public boolean isOrderExecutedInd() {
		return orderExecutedInd;
	}

	/**
	 * @param orderExecutedInd the orderExecutedInd to set
	 */
	public void setOrderExecutedInd(boolean orderExecutedInd) {
		this.orderExecutedInd = orderExecutedInd;
	}

	public boolean isHiddenSegmentsFound() {
		return hiddenSegmentsFound;
	}

	public void setHiddenSegmentsFound(boolean hiddenSegmentsFound) {
		this.hiddenSegmentsFound = hiddenSegmentsFound;
	}

	public List<RestrictionCheckerRoutingDto> getHiddenSegmentsDtoList() {
		return hiddenSegmentsDtoList;
	}

	public void setHiddenSegmentsDtoList(List<RestrictionCheckerRoutingDto> hiddenSegmentsDtoList) {
		this.hiddenSegmentsDtoList = hiddenSegmentsDtoList;
	}

	/**
	 * @return the autoFlightAssignment
	 */
	public String getAutoFlightAssignment() {
		return autoFlightAssignment;
	}

	/**
	 * @param autoFlightAssignment the autoFlightAssignment to set
	 */
	public void setAutoFlightAssignment(String autoFlightAssignment) {
		this.autoFlightAssignment = autoFlightAssignment;
	}

	/**
	 * @return the manualFlightAssignment
	 */
	public String getManualFlightAssignment() {
		return manualFlightAssignment;
	}

	/**
	 * @param manualFlightAssignment the manualFlightAssignment to set
	 */
	public void setManualFlightAssignment(String manualFlightAssignment) {
		this.manualFlightAssignment = manualFlightAssignment;
	}

	/**
	 * @return the overrideIndicator
	 */
	public String getOverrideIndicator() {
		return overrideIndicator;
	}

	/**
	 * @param overrideIndicator the overrideIndicator to set
	 */
	public void setOverrideIndicator(String overrideIndicator) {
		this.overrideIndicator = overrideIndicator;
	}

	public List<FlightInformationDto> getFlightInformationDtos() {
		return flightInformationDtos;
	}

	public void setFlightInformationDtos(List<FlightInformationDto> flightInformationDtos) {
		this.flightInformationDtos = flightInformationDtos;
	}

    public void setTransitCheckType(CheckType transitCheckType) {
        this.transitCheckType = transitCheckType;
    }

	public CheckType getTransitCheckType() {
		return transitCheckType;
	}

	public List<RestrictionCheckerCodeDto> getExportRestrictionCodes() {
		
		if(exportRestrictionCodes==null){
			exportRestrictionCodes=new ArrayList<RestrictionCheckerCodeDto>();
		}
		return exportRestrictionCodes;
	}

	public void setExportRestrictionCodes(List<RestrictionCheckerCodeDto> exportRestrictionCodes) {
		this.exportRestrictionCodes = exportRestrictionCodes;
	}

	public List<RestrictionCheckerCodeDto> getImportRestrictionCodes() {
		if(importRestrictionCodes==null){
			importRestrictionCodes=new ArrayList<RestrictionCheckerCodeDto>();
		}
		return importRestrictionCodes;
	}

	public void setImportRestrictionCodes(List<RestrictionCheckerCodeDto> importRestrictionCodes) {
		this.importRestrictionCodes = importRestrictionCodes;
	}

	public List<RestrictionCheckerCodeDto> getTransitRestrictionCodes() {
		if(transitRestrictionCodes==null){
			transitRestrictionCodes=new ArrayList<RestrictionCheckerCodeDto>();
		}
		return transitRestrictionCodes;
	}

	public void setTransitRestrictionCodes(List<RestrictionCheckerCodeDto> transitRestrictionCodes) {
		this.transitRestrictionCodes = transitRestrictionCodes;
	}

	public boolean isMultiSegment() {
		return multiSegment;
	}

	public void setMultiSegment(boolean multiSegment) {
		this.multiSegment = multiSegment;
	}

	public boolean isFromBooking() {
		return isFromBooking;
	}

	public void setFromBooking(boolean isFromBooking) {
		this.isFromBooking = isFromBooking;
	}

	public boolean isSkipExportCodes() {
		return skipExportCodes;
	}

	public void setSkipExportCodes(boolean skipExportCodes) {
		this.skipExportCodes = skipExportCodes;
	}

	//LMS-57779
	public Map<String, List<RestrictionCheckerCodeDto>> getSegmentRestrictions() {
		
		if(segmentRestrictions==null){
			segmentRestrictions=new HashMap<String, List<RestrictionCheckerCodeDto>>();
		}
		return segmentRestrictions;
	}

	public void setSegmentRestrictions(Map<String, List<RestrictionCheckerCodeDto>> segmentRestrictions) {
		this.segmentRestrictions = segmentRestrictions;
	}

	public int getMutisegmentIndex() {
		return mutisegmentIndex;
	}

	public void setMutisegmentIndex(int mutisegmentIndex) {
		this.mutisegmentIndex = mutisegmentIndex;
	}

	public boolean isPaycodeCollect() {
		return paycodeCollect;
	}

	public void setPaycodeCollect(boolean paycodeCollect) {
		this.paycodeCollect = paycodeCollect;
	}

	public boolean isFromCollectCharge() {
		return fromCollectCharge;
	}

	public void setFromCollectCharge(boolean fromCollectCharge) {
		this.fromCollectCharge = fromCollectCharge;
	}

	/**
	 * @return the segmentsSeqNum
	 */
	public int getSegmentsSeqNum() {
		return segmentsSeqNum;
	}

	/**
	 * @param segmentsSeqNum the segmentsSeqNum to set
	 */
	public void setSegmentsSeqNum(int segmentsSeqNum) {
		this.segmentsSeqNum = segmentsSeqNum;
	}

	/**
	 * @return the routingMap
	 */
	public Map<String, RestrictionCheckerRoutingDto> getRoutingMap() {
		if(routingMap == null){
			routingMap = new HashMap<String, RestrictionCheckerRoutingDto>();
		}
		return routingMap;
	}

	/**
	 * @param routingMap the routingMap to set
	 */
	public void setRoutingMap(Map<String, RestrictionCheckerRoutingDto> routingMap) {
		this.routingMap = routingMap;
	}
	
}