/* ====================================== */
/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.WorkOrderCompletenessType;
import com.unisys.trans.logistics.lms.framework.constants.WorkOrderIssueType;
import com.unisys.trans.logistics.lms.framework.constants.WorkOrderStatus;
import com.unisys.trans.logistics.lms.framework.constants.WorkOrderType;
import com.unisys.trans.logistics.lms.framework.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.framework.dto.operations.ContainerDto;
import com.unisys.trans.logistics.lms.framework.dto.operations.GoodsDto;
import com.unisys.trans.logistics.lms.framework.dto.operations.OffloadDto;


/**
 * <code>WorkOrderDto</code> class represents the WorkOrder information.
 *
 */
public class WorkOrderDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.	
     */
    private static final long serialVersionUID = 1L;

    private boolean accept;

    /**
     * Attribute to hold <code>actionType</code> property.
     */
    private ActionType actionType;

    /**
     * Attribute to hold <code>offload</code> property.
     */
    private List<AirWaybillDto> airwaybills;

    /**
     * Attribute to hold <code>completenessStatus</code> property.
     */
    private WorkOrderCompletenessType completenessStatus;

    /**
     * Attribute to hold <code>confirmedVolume</code> property.
     */
    private BigDecimal confirmedVolume;

    private String wrkOrderStatus;

    private String wrkOrderType;
    
    private String itemType;
    
    private String itemStatus;
    
    private String workOrderLocation;

    public String getWrkOrderType() {
    	
    	if(this.type!=null){
    		wrkOrderType = this.type.value();
    	}

        return this.wrkOrderType;
    }

    public void setWrkOrderType(String wrkOrderType) {
        this.wrkOrderType = wrkOrderType;
    }

    public String getWrkOrderStatus() {
    	if(this.status!=null){

        this.wrkOrderStatus = this.status.value();
    	}

        return this.wrkOrderStatus;
    }

    public void setWrkOrderStatus(String wrkOrderStatus) {
        this.wrkOrderStatus = wrkOrderStatus;
    }

    /**
     * Attribute to hold <code>confirmedVolumePercentage</code> property.
     */
    private BigDecimal confirmedVolumePercentage;

    /**
     * Attribute to hold <code>confirmedWeight</code> property.
     */
    private BigDecimal confirmedWeight;

    /**
     * Attribute to hold <code>confirmedWeightPercentage</code> property.
     */
    private BigDecimal confirmedWeightPercentage;

    /**
     * Attribute to hold <code>confirmedWeightPercentage</code> property.
     */
    private BigDecimal partialWeightPercentage;

    public BigDecimal getPartialWeightPercentage() {
        return partialWeightPercentage;
    }

    public void setPartialWeightPercentage(BigDecimal partialWeightPercentage) {
        this.partialWeightPercentage = partialWeightPercentage;
    }

    /**
     * Attribute to hold <code>offload</code> property.
     */
    private List<ContainerDto> containers;

    /**
     * Attribute to hold <code>destination</code> property.
     */
    private String destination;

    private String displayColor;

    /**
     * Attribute to hold <code>error</code> property.
     */
    private boolean error;

    /**
     * Attribute to hold <code>Flight</code> property.
     */
    private BaseFlightDto flight;

    /**
     * Attribute to hold <code>flightDate</code> property.
     */
    private Date flightDate;

    /**
     * Attribute to hold <code>flightDepartureDateTime</code> property.
     */
    private Date flightDepartureDateTime;

    public String getInfluences() {
        return influences;
    }

    public void setInfluences(String influences) {
        this.influences = influences;
    }

    private Date flightArrival;

    private String flightArrivalStatus;

    private String influences;

    public Date getFlightArrival() {
        if(flightArrival!=null){
            return (Date)flightArrival.clone();
            }
            else{
                return null;
            }
    }

    public void setFlightArrival(Date flightArrival) {
        if(flightArrival!=null){
        	 this.flightArrival =(Date) flightArrival.clone();
          }
        else{
        	 this.flightArrival  =null;	
        }
    }

    public String getFlightArrivalStatus() {
        return flightArrivalStatus;
    }

    public void setFlightArrivalStatus(String flightArrivalStatus) {
        this.flightArrivalStatus = flightArrivalStatus;
    }

    private String flightNumber;

    private String flightStatus;

    /**
     * Attribute to hold <code>containers</code> property.
     */
    private List<GoodsDto> goods;

    /**
     * Attribute to hold <code>issue</code> property.
     */
    private String issue;

    private WorkOrderIssueType issueType;

    /**
     * Attribute to hold <code>maximumVolume</code> property.
     */
    private BigDecimal maximumVolume;

    /**
     * Attribute to hold <code>maximumWeight</code> property.
     */
    private BigDecimal maximumWeight;

    /**
     * Attribute to hold <code>Offload</code> property.
     */
    private OffloadDto offload;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>workOrderNumber</code> property.
     */
    private String operationWorkOrderNumber;

    private boolean override;

    /**
     * Attribute to hold <code>partialCompletenesPercentage</code> property.
     */
    private BigDecimal partialCompletenesPercentage;

    private Integer pieces;

    private String plannedItemInconsistencies;

    /**
     * Attribute to hold <code>plannedVolume</code> property.
     */
    private BigDecimal plannedVolume;

    /**
     * Attribute to hold <code>plannedVolumePercentage</code> property.
     */
    private BigDecimal plannedVolumePercentage;

    /**
     * Attribute to hold <code>plannedWeight</code> property.
     */
    private BigDecimal plannedWeight;

    /**
     * Attribute to hold <code>plannedWeightPercentage</code> property.
     */
    private BigDecimal plannedWeightPercentage;

    /**
     * Attribute to hold <code>prority</code> property.
     */
    private Integer prority;

    private boolean reject;

    /**
     * Attribute to hold <code>remark</code> property.
     */
    private String remark;

    /**
     * Attribute to hold <code>stationCode</code> property.
     */
    private String stationCode;

    /**
     * Attribute to hold <code>status</code> property.
     */
    private WorkOrderStatus status;

    /**
     * Attribute to hold <code>target</code> property.
     */
    private String target;

    /**
     * Attribute to hold <code>targetLocationviewgroup</code> property.
     */
    private String targetLocation;

    /**
     * Attribute to hold <code>terminalArea</code> property.
     */
    private String terminalArea;

    private BigDecimal totalVolume;

    private BigDecimal totalWeight;

    private BigDecimal totalVolumePercentage;

    private BigDecimal totalWeightPercentage;

    /**
     * Attribute to hold <code>type</code> property.
     */
    private WorkOrderType type;

    /**
     * Attribute to hold <code>uldCarrier</code> property.
     */
    private String uldCarrier;

    /**
     * Attribute to hold <code>uldContour</code> property.
     */
    private String uldContour;

    /**
     * Attribute to hold <code>uldPrefix</code> property.
     */
    private String uldPrefix;

    /**
     * Attribute to hold <code>offload</code> property.
     */
    private UserAuditDto userAudit;

    private BigDecimal volume;

    private BigDecimal weight;

    private String workOrderNumber;

    /**
     * Attribute to hold <code>workOrderStatus</code> property.
     */
    private String workOrderStatus;

    /**
     * Attribute to hold <code>workOrderStatus</code> property.
     */
    private String workOrderType;
    
    private String workOrderTarget;
    
    private String workOrderItemType;

    /**
     * Gets the <code>ActionType</code> property.
     * <p>
     *
     * @return the current value of the <code>ActionType</code> property.<br>
     */
    public ActionType getActionType() {
        return actionType;
    }

    public List<AirWaybillDto> getAirwaybills() {
        if (airwaybills == null) {
            airwaybills = new ArrayList<AirWaybillDto>();
        }
        return airwaybills;
    }

    /**
     * Gets the <code>CompletenessStatus</code> property.
     * <p>
     *
     * @return the current value of the <code>CompletenessStatus</code> property.<br>
     */
    public WorkOrderCompletenessType getCompletenessStatus() {
        return completenessStatus;
    }

    /**
     * Gets the <code>ConfirmedVolume</code> property.
     * <p>
     *
     * @return the current value of the <code>ConfirmedVolume</code> property.<br>
     */
    public BigDecimal getConfirmedVolume() {
        return confirmedVolume;
    }

    /**
     * Gets the <code>ConfirmedVolumePercentage</code> property.
     * <p>
     *
     * @return the current value of the <code>ConfirmedVolumePercentage</code> property.<br>
     */
    public BigDecimal getConfirmedVolumePercentage() {
        return confirmedVolumePercentage;
    }

    /**
     * Gets the <code>ConfirmedWeight</code> property.
     * <p>
     *
     * @return the current value of the <code>ConfirmedWeight</code> property.<br>
     */
    public BigDecimal getConfirmedWeight() {
        return confirmedWeight;
    }

    /**
     * Gets the <code>ConfirmedWeightPercentage</code> property.
     * <p>
     *
     * @return the current value of the <code>ConfirmedWeightPercentage</code> property.<br>
     */
    public BigDecimal getConfirmedWeightPercentage() {
        return confirmedWeightPercentage;
    }

    /**
     * Gets the <code>containers</code> property.
     * <p>
     *
     * @return the current value of the <code>containers</code> property.<br>
     */
    public List<ContainerDto> getContainers() {
        if (containers == null) {
            containers = new ArrayList<ContainerDto>();
        }
        return containers;
    }

    /**
     * Gets the <code>Destination</code> property.
     * <p>
     *
     * @return the current value of the <code>Destination</code> property.<br>
     */
    public String getDestination() {
        return destination;
    }

    public String getDisplayColor() {
        return displayColor;
    }

    /**
     * Gets the <code>error</code> property.
     * <p>
     *
     * @return the current value of the <code>error</code> property.<br>
     */
    public boolean getError() {
        return error;
    }

    /**
     * Gets the <code>Flight</code> property.
     * <p>
     *
     * @return the current value of the <code>Flight</code> property.<br>
     */
    public BaseFlightDto getFlight() {
        if (flight == null) {
            flight = new BaseFlightDto();
        }
        return flight;
    }

    /**
     * Gets the <code>FlightDate</code> property.
     * <p>
     *
     * @return the current value of the <code>FlightDate</code> property.<br>
     */
    public Date getFlightDate() {
        if(flightDate!=null){
            return (Date)flightDate.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Gets the <code>FlightDepartureDateTime</code> property.
     * <p>
     *
     * @return the current value of the <code>FlightDepartureDateTime</code> property.<br>
     */
    public Date getFlightDepartureDateTime() {
        if(flightDepartureDateTime!=null){
            return (Date)flightDepartureDateTime.clone();
            }
            else{
                return null;
            }
    }

  

    public String getFlightStatus() {
        return flightStatus;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Gets the <code>goods</code> property.
     * <p>
     *
     * @return the current value of the <code>goods</code> property.<br>
     */
    public List<GoodsDto> getGoods() {
        if (goods == null) {
            goods = new ArrayList<GoodsDto>();
        }
        return goods;
    }

    /**
     * Gets the <code>Issue</code> property.
     * <p>
     *
     * @return the current value of the <code>Issue</code> property.<br>
     */
    public String getIssue() {
        return issue;
    }

    public WorkOrderIssueType getIssueType() {
        return issueType;
    }

    /**
     * Gets the <code>MaximumVolume</code> property.
     * <p>
     *
     * @return the current value of the <code>MaximumVolume</code> property.<br>
     */
    public BigDecimal getMaximumVolume() {
        return maximumVolume;
    }

    /**
     * Gets the <code>MaximumWeight</code> property.
     * <p>
     *
     * @return the current value of the <code>MaximumWeight</code> property.<br>
     */
    public BigDecimal getMaximumWeight() {
        return maximumWeight;
    }

    /**
     * Gets the <code>Offload</code> property.
     * <p>
     *
     * @return the current value of the <code>Offload</code> property.<br>
     */
    public OffloadDto getOffload() {
        if (offload == null) {
            offload = new OffloadDto();
        }
        return offload;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     *
     * @return the current value of the <code>OId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return oId;
    }

    public String getOperationWorkOrderNumber() {
        return operationWorkOrderNumber;
    }

    /**
     * Gets the <code>PartialCompletenesPercentage</code> property.
     * <p>
     *
     * @return the current value of the <code>PartialCompletenesPercentage</code> property.<br>
     */
    public BigDecimal getPartialCompletenesPercentage() {
        return partialCompletenesPercentage;
    }

    public Integer getPieces() {
        return pieces;
    }

    public String getPlannedItemInconsistencies() {
        return plannedItemInconsistencies;
    }

    /**
     * Gets the <code>PlannedVolume</code> property.
     * <p>
     *
     * @return the current value of the <code>PlannedVolume</code> property.<br>
     */
    public BigDecimal getPlannedVolume() {
        return plannedVolume;
    }

    /**
     * Gets the <code>PlannedVolumePercentage</code> property.
     * <p>
     *
     * @return the current value of the <code>PlannedVolumePercentage</code> property.<br>
     */
    public BigDecimal getPlannedVolumePercentage() {
        return plannedVolumePercentage;
    }

    /**
     * Gets the <code>PlannedWeight</code> property.
     * <p>
     *
     * @return the current value of the <code>PlannedWeight</code> property.<br>
     */
    public BigDecimal getPlannedWeight() {
        return plannedWeight;
    }

    /**
     * Gets the <code>PlannedWeightPercentage</code> property.
     * <p>
     *
     * @return the current value of the <code>PlannedWeightPercentage</code> property.<br>
     */
    public BigDecimal getPlannedWeightPercentage() {
        return plannedWeightPercentage;
    }

    /**
     * Gets the <code>Prority</code> property.
     * <p>
     *
     * @return the current value of the <code>Prority</code> property.<br>
     */
    public Integer getPrority() {
        return prority;
    }

    /**
     * Gets the <code>Remark</code> property.
     * <p>
     *
     * @return the current value of the <code>Remark</code> property.<br>
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Gets the <code>StationCode</code> property.
     * <p>
     *
     * @return the current value of the <code>StationCode</code> property.<br>
     */
    public String getStationCode() {
        return stationCode;
    }

    public WorkOrderStatus getStatus() {
        return status;
    }

    /**
     * Gets the <code>Target</code> property.
     * <p>
     *
     * @return the current value of the <code>Target</code> property.<br>
     */
    public String getTarget() {
        return target;
    }

    /**
     * Gets the <code>TargetLocationviewgroup</code> property.
     * <p>
     *
     * @return the current value of the <code>TargetLocationviewgroup</code> property.<br>
     */
    public String getTargetLocation() {
        return targetLocation;
    }

    /**
     * Gets the <code>TerminalArea</code> property.
     * <p>
     *
     * @return the current value of the <code>TerminalArea</code> property.<br>
     */
    public String getTerminalArea() {
        return terminalArea;
    }

    public BigDecimal getTotalVolume() {
        return totalVolume;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public BigDecimal getTotalVolumePercentage() {
        return totalVolumePercentage;
    }

    public void setTotalVolumePercentage(BigDecimal totalVolumePercentage) {
        this.totalVolumePercentage = totalVolumePercentage;
    }

    public BigDecimal getTotalWeightPercentage() {
        return totalWeightPercentage;
    }

    public void setTotalWeightPercentage(BigDecimal totalWeightPercentage) {
        this.totalWeightPercentage = totalWeightPercentage;
    }

    /**
     * Gets the <code>Type</code> property.
     * <p>
     *
     * @return the current value of the <code>Type</code> property.<br>
     */
    public WorkOrderType getType() {
        return type;
    }

    /**
     * Gets the <code>UldCarrier</code> property.
     * <p>
     *
     * @return the current value of the <code>UldCarrier</code> property.<br>
     */
    public String getUldCarrier() {
        return uldCarrier;
    }

    /**
     * Gets the <code>UldContour</code> property.
     * <p>
     *
     * @return the current value of the <code>UldContour</code> property.<br>
     */
    public String getUldContour() {
        return uldContour;
    }

    /**
     * Gets the <code>UldPrefix</code> property.
     * <p>
     *
     * @return the current value of the <code>UldPrefix</code> property.<br>
     */
    public String getUldPrefix() {
        return uldPrefix;
    }

    /**
     * Gets the <code>userAudit</code> property.
     * <p>
     *
     * @return the current value of the <code>userAudit</code> property.<br>
     */
    public UserAuditDto getUserAudit() {
        if (userAudit == null) {
            userAudit = new UserAuditDto();
        }
        return userAudit;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public String getWorkOrderNumber() {
        return workOrderNumber;
    }

    /**
     * @return the workOrderStatus
     */
    public String getWorkOrderStatus() {
        return workOrderStatus;
    }

    public String getWorkOrderType() {
        return workOrderType;
    }

    public boolean isAccept() {
        return accept;
    }

    public boolean isOverride() {
        return override;
    }

    public boolean isReject() {
        return reject;
    }

    public void setAccept(final boolean accept) {
        this.accept = accept;
    }

    /**
     * Sets the <code>ActionType</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>ActionType</code> property.<br>
     */
    public void setActionType(final ActionType actionType) {
        this.actionType = actionType;
    }

    public void setAirwaybills(final List<AirWaybillDto> airwaybills) {
        this.airwaybills = airwaybills;
    }

    /**
     * Sets the <code>CompletenessStatus</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>CompletenessStatus</code> property.<br>
     */
    public void setCompletenessStatus(
                final WorkOrderCompletenessType pCompletenessStatus) {
        completenessStatus = pCompletenessStatus;
    }

    /**
     * Sets the <code>ConfirmedVolume</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>ConfirmedVolume</code> property.<br>
     */
    public void setConfirmedVolume(final BigDecimal pConfirmedVolume) {
        confirmedVolume = pConfirmedVolume;
    }

    /**
     * Sets the <code>ConfirmedVolumePercentage</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>ConfirmedVolumePercentage</code> property.<br>
     */
    public void setConfirmedVolumePercentage(
                final BigDecimal pConfirmedVolumePercentage) {
        confirmedVolumePercentage = pConfirmedVolumePercentage;
    }

    /**
     * Sets the <code>ConfirmedWeight</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>ConfirmedWeight</code> property.<br>
     */
    public void setConfirmedWeight(final BigDecimal pConfirmedWeight) {
        confirmedWeight = pConfirmedWeight;
    }

    /**
     * Sets the <code>ConfirmedWeightPercentage</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>ConfirmedWeightPercentage</code> property.<br>
     */
    public void setConfirmedWeightPercentage(
                final BigDecimal pConfirmedWeightPercentage) {
        confirmedWeightPercentage = pConfirmedWeightPercentage;
    }

    /**
     * Sets the <code> containers</code> property.
     * <p>
     *
     * @param containers
     *            the current value of the <code> containers</code> property.<br>
     */
    public void setContainers(final List<ContainerDto> containers) {
        this.containers = containers;
    }

    /**
     * Sets the <code>Destination</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>Destination</code> property.<br>
     */
    public void setDestination(final String pDestination) {
        destination = pDestination;
    }

    public void setDisplayColor(final String displayColor) {
        this.displayColor = displayColor;
    }

    /**
     * Sets the <code>error</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>error</code> property.<br>
     */
    public void setError(final boolean error) {
        this.error = error;
    }

    /**
     * Sets the <code>Flight</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>Flight</code> property.<br>
     */
    public void setFlight(final BaseFlightDto pFlight) {
        flight = pFlight;
    }

    /**
     * Sets the <code>FlightDate</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>FlightDate</code> property.<br>
     */
    public void setFlightDate(final Date pFlightDate) {
        if(pFlightDate!=null){
        	this.flightDate =(Date) pFlightDate.clone();
          }
        else
        {
        	this.flightDate=null;
        }
    }

    /**
     * Sets the <code>FlightDepartureDateTime</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>FlightDepartureDateTime</code> property.<br>
     */
    public void setFlightDepartureDateTime(final Date pFlightDepartureDateTime) {
        if(pFlightDepartureDateTime!=null){
        	this.flightDepartureDateTime =(Date) pFlightDepartureDateTime.clone();
          }
        else
        {
        	this.flightDepartureDateTime=null;
        }
    }

    public void setFlightNumber(final String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setFlightStatus(final String flightStatus) {
        this.flightStatus = flightStatus;
    }

    /**
     * Sets the <code> goods</code> property.
     * <p>
     *
     * @param goods
     *            the current value of the <code> goods</code> property.<br>
     */
    public void setGoods(final List<GoodsDto> goods) {
        this.goods = goods;
    }

    /**
     * Sets the <code>Issue</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>Issue</code> property.<br>
     */
    public void setIssue(final String pIssue) {
        issue = pIssue;
    }

    public void setIssueType(final WorkOrderIssueType issueType) {
        this.issueType = issueType;
    }

    /**
     * Sets the <code>MaximumVolume</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>MaximumVolume</code> property.<br>
     */
    public void setMaximumVolume(final BigDecimal pMaximumVolume) {
        maximumVolume = pMaximumVolume;
    }

    /**
     * Sets the <code>MaximumWeight</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>MaximumWeight</code> property.<br>
     */
    public void setMaximumWeight(final BigDecimal pMaximumWeight) {
        maximumWeight = pMaximumWeight;
    }

    /**
     * Sets the <code>Offload</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>Offload</code> property.<br>
     */
    public void setOffload(final OffloadDto pOffload) {
        offload = pOffload;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>OId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        oId = pOId;
    }

    public void setOperationWorkOrderNumber(final String operationWorkOrderNumber) {
        this.operationWorkOrderNumber = operationWorkOrderNumber;
    }

    public void setOverride(final boolean override) {
        this.override = override;
    }

    /**
     * Sets the <code>PartialCompletenesPercentage</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>PartialCompletenesPercentage</code> property.<br>
     */
    public void setPartialCompletenesPercentage(
                final BigDecimal pPartialCompletenesPercentage) {
        partialCompletenesPercentage = pPartialCompletenesPercentage;
    }

    public void setPieces(final Integer pieces) {
        this.pieces = pieces;
    }

    public void setPlannedItemInconsistencies(
                final String plannedItemInconsistencies) {
        this.plannedItemInconsistencies = plannedItemInconsistencies;
    }

    /**
     * Sets the <code>PlannedVolume</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>PlannedVolume</code> property.<br>
     */
    public void setPlannedVolume(final BigDecimal pPlannedVolume) {
        plannedVolume = pPlannedVolume;
    }

    /**
     * Sets the <code>PlannedVolumePercentage</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>PlannedVolumePercentage</code> property.<br>
     */
    public void setPlannedVolumePercentage(
                final BigDecimal pPlannedVolumePercentage) {
        plannedVolumePercentage = pPlannedVolumePercentage;
    }

    /**
     * Sets the <code>PlannedWeight</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>PlannedWeight</code> property.<br>
     */
    public void setPlannedWeight(final BigDecimal pPlannedWeight) {
        plannedWeight = pPlannedWeight;
    }

    /**
     * Sets the <code>PlannedWeightPercentage</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>PlannedWeightPercentage</code> property.<br>
     */
    public void setPlannedWeightPercentage(
                final BigDecimal pPlannedWeightPercentage) {
        plannedWeightPercentage = pPlannedWeightPercentage;
    }

    /**
     * Sets the <code>Prority</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>Prority</code> property.<br>
     */
    public void setPrority(final Integer pPrority) {
        prority = pPrority;
    }

    public void setReject(final boolean reject) {
        this.reject = reject;
    }

    /**
     * Sets the <code>Remark</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>Remark</code> property.<br>
     */
    public void setRemark(final String pRemark) {
        remark = pRemark;
    }

    /**
     * Sets the <code>StationCode</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>StationCode</code> property.<br>
     */
    public void setStationCode(final String pStationCode) {
        stationCode = pStationCode;
    }

    public void setStatus(final WorkOrderStatus status) {
        this.status = status;
    }

    /**
     * Sets the <code>Target</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>Target</code> property.<br>
     */
    public void setTarget(final String pTarget) {
        target = pTarget;
    }

    /**
     * Sets the <code>TargetLocationviewgroup</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>TargetLocationviewgroup</code> property.<br>
     */
    public void setTargetLocation(final String pTargetLocation) {
        targetLocation = pTargetLocation;
    }

    /**
     * Sets the <code>TerminalArea</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>TerminalArea</code> property.<br>
     */
    public void setTerminalArea(final String pTerminalArea) {
        terminalArea = pTerminalArea;
    }

    public void setTotalVolume(final BigDecimal totalVolume) {
        this.totalVolume = totalVolume;
    }

    public void setTotalWeight(final BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    /**
     * Sets the <code>Type</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>Type</code> property.<br>
     */
    public void setType(final WorkOrderType pType) {
        type = pType;
    }

    /**
     * Sets the <code>UldCarrier</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>UldCarrier</code> property.<br>
     */
    public void setUldCarrier(final String pUldCarrier) {
        uldCarrier = pUldCarrier;
    }

    /**
     * Sets the <code>UldContour</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>UldContour</code> property.<br>
     */
    public void setUldContour(final String pUldContour) {
        uldContour = pUldContour;
    }

    /**
     * Sets the <code>UldPrefix</code> property.
     * <p>
     *
     * @param pAmount
     *            the current value of the <code>UldPrefix</code> property.<br>
     */
    public void setUldPrefix(final String pUldPrefix) {
        uldPrefix = pUldPrefix;
    }

    /**
     * Sets the <code> userAudit</code> property.
     * <p>
     *
     * @param userAudit
     *            the current value of the <code> userAudit</code> property.<br>
     */
    public void setUserAudit(final UserAuditDto userAudit) {
        this.userAudit = userAudit;
    }

    public void setVolume(final BigDecimal volume) {
        this.volume = volume;
    }

    public void setWeight(final BigDecimal weight) {
        this.weight = weight;
    }

    public void setWorkOrderNumber(final String workOrderNumber) {
        this.workOrderNumber = workOrderNumber;
    }

    /**
     * @param workOrderStatus
     *            the workOrderStatus to set
     */
    public void setWorkOrderStatus(final String workOrderStatus) {
        this.workOrderStatus = workOrderStatus;
    }

    public void setWorkOrderType(final String workOrderType) {
        this.workOrderType = workOrderType;
    }

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getWorkOrderLocation() {
		return workOrderLocation;
	}

	public void setWorkOrderLocation(String workOrderLocation) {
		this.workOrderLocation = workOrderLocation;
	}

	public String getWorkOrderTarget() {
		return workOrderTarget;
	}

	public void setWorkOrderTarget(String workOrderTarget) {
		this.workOrderTarget = workOrderTarget;
	}

	public String getWorkOrderItemType() {
		return workOrderItemType;
	}

	public void setWorkOrderItemType(String workOrderItemType) {
		this.workOrderItemType = workOrderItemType;
	}

}
