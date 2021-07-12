/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.io.Serializable;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.constants.DensityFactorType;
import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.ShipmentCapacityDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.dto.WorkOrderDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.GoodsStatusType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.ContainerContourType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.CustomsStatusType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.CustomsSubStatusType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.DiscrepancyType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.DispositionType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.GoodsType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.LMSFunctionType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.LocationType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.ReceiptType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>GoodsDto</code> class represents the Goods information.
 * 
 */
public class BaseGoodsDto extends PersistenceObjectDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>arrivalDate</code> property.
     */
    private Date arrivalDate;

    /**
     * Attribute to hold <code>boardingStation</code> property.
     */
    private String boardingStation;

    /**
     * Attribute to hold <code>dispositionCode</code> property.
     */
    private DispositionType dispositionCode;

    /**
     * Attribute to hold <code>lastUpdateFunction</code> property.
     */
    private LMSFunctionType lastUpdateFunction;

    /**
     * Attribute to hold <code>location</code> property.
     */
    private String location;

    /**
     * Attribute to hold <code>goodsStatus</code> property.
     */
    private GoodsStatusType goodsStatus;

    /**
     * Attribute to hold <code>currentStation</code> property.
     */
    private String currentStation;

    /**
     * Attribute to hold <code>flightDate</code> property.
     */
    private Date flightDate;

    /**
     * Attribute to hold <code>flightDate</code> property.
     */
    private Date oldFlightDate;

    /**
     * Attribute to hold <code>flightLocalDate</code> property.
     */
    private Date flightLocalDate;

    /**
     * Attribute to hold <code>handlingRemarks</code> property.
     */
    private String handlingRemarks;

    /**
     * Attribute to hold <code>lastUpdateUser</code> property.
     */
    private String lastUpdateUser;

    /**
     * Attribute to hold <code>toCarrier</code> property.
     */
    private String toCarrier;

    /**
     * Attribute to hold <code>userDropOffDateTime</code> property.
     */
    private Date userDropOffDateTime;

    /**
     * Attribute to hold <code>manifestGroupCode</code> property.
     */
    private String manifestGroupCode;

    /**
     * Attribute to hold <code>fromCarrier</code> property.
     */
    private String fromCarrier;

    /**
     * Attribute to hold <code>userDropOffName</code> property.
     */
    private String userDropOffName;

    /**
     * Attribute to hold <code>lastUpdatedLocalTime</code> property.
     */
    private Date lastUpdatedLocalTime;

    /**
     * Attribute to hold <code>lastUpdatedUTCTime</code> property.
     */
    private Date lastUpdatedUTCTime;

    /**
     * Attribute to hold <code>shipperLoadedULDIndicator</code> property.
     */
    private boolean shipperLoadedULDIndicator;

    /**
     * Attribute to hold <code>subjectToDelayIndicator</code> property.
     */
    private boolean subjectToDelayIndicator;

    /**
     * Attribute to hold <code>densityFactor</code> property.
     */
    private DensityFactorType densityFactor;

    /**
     * Attribute to hold <code>deckPostion</code> property.
     */
    private ContainerContourType deckPostion;

    /**
     * Attribute to hold <code>labelsCount</code> property.
     */
    private Integer labelsCount;

    /**
     * Attribute to hold <code>labelPrinter</code> property.
     */
    private String labelPrinter;

    /**
     * Attribute to hold <code>goodsInCustoms</code> property.
     */
    private boolean goodsInCustoms;

    /**
     * Attribute to hold <code>goodsTransitControlIndicator</code> property.
     */
    private boolean goodsTransitControlIndicator;

    /**
     * Attribute to hold <code>goodsPiecesCleared</code> property.
     */
    private int goodsPiecesCleared;

    /**
     * Attribute to hold <code>goodsTransitControlFlag</code> property.
     */
    private String goodsTransitControlFlag;

    /**
     * Attribute to hold <code>goodsTransitControlFlag</code> property.
     */
    private String goodsPartIdentifier;

    /**
     * Attribute to hold <code>documentsReceived</code> property.
     */
    private boolean documentsReceived;

    /**
     * Attribute to hold <code>customsCode</code> property.
     */
    private CustomsStatusType customsCode;

    /**
     * Attribute to hold <code>locationType</code> property.
     */
    private LocationType locationType;

    /**
     * Attribute to hold <code>verifiedSLULDWeigntIndicator</code> property.
     */
    private boolean verifiedSLULDWeigntIndicator;

    /**
     * Attribute to hold <code>workorderNumber</code> property.
     */
    private Long workorderNumber;

    /**
     * Attribute to hold <code>workOrderOid</code> property.
     */
    private Long workOrderOid;

    /**
     * Attribute to hold <code>workOrderStation</code> property.
     */
    private String workOrderStation;

    /**
     * Attribute to hold <code>receiptIndicator</code> property.
     */
    private Boolean receiptIndicator;

    /**
     * Attribute to hold <code>receiptRequestType</code> property.
     */
    private ReceiptType receiptRequestType;

    /**
     * Attribute to hold <code>goodsType</code> property.
     */
    private GoodsType goodsType;

    /**
     * Attribute to hold <code>inboundIndicator</code> property.
     */
    private boolean inboundIndicator;

    /**
     * Attribute to hold <code>inboundIndicator</code> property.
     */
    private boolean internationalIndicator;

    /**
     * Attribute to hold <code>scheduleChangeIndicator</code> property.
     */
    private boolean scheduleChangeIndicator;

    /**
     * Attribute to hold <code>ecaCompletedIndicator</code> property.
     */
    private boolean ecaCompletedIndicator;

    /**
     * Attribute to hold <code>atCustomsStationIndicator</code> property.
     */
    private boolean atCustomsStationIndicator;

    /**
     * Attribute to hold <code>customsAutoIndicator</code> property.
     */
    private boolean customsAutoIndicator;

    /**
     * Attribute to hold <code>customSubStatusCode</code> property.
     */
    private CustomsSubStatusType customSubStatusCode;

    /**
     * Attribute to hold <code>pendingCustomStatusCode</code> property.
     */
    private CustomsStatusType pendingCustomStatusCode;

    /**
     * Attribute to hold <code>pendingCustomSubStatusCode</code> property.
     */
    private CustomsSubStatusType pendingCustomSubStatusCode;

    /**
     * Attribute to hold <code>capacity</code> property.
     */
    private ShipmentCapacityDto capacityDto;

    /**
     * Attribute to hold <code>offload</code> property.
     */
    private OffloadDto offloadDto;

    /**
     * Attribute to hold <code>flight</code> property.
     */
    private BaseFlightDto baseFlightDto;

    /**
     * Attribute to hold <code>oldFlight</code> property.
     */
    private BaseFlightDto oldBaseFlightDto;

    /**
     * Attribute to hold <code>userAuditDto</code> property.
     */
    private UserAuditDto userAuditDto;

    /**
     * Attribute to hold <code>discrepancyStatus</code> property.
     */
    private DiscrepancyType discrepancyType;

    /**
     * Attribute to hold <code>discrepancyIndicator</code> property.
     */
    private Boolean discrepancyIndicator;

    /**
     * Attribute to hold <code>customsDetailedStatus</code> property.
     */
    private String customsDetailedStatus;

    /**
     * Attribute to hold <code>workOrderDto</code> property.
     */
    private WorkOrderDto workOrderDto;

    // Added for PLT - UCG022 - Start
    /**
     * Attribute to hold <code>verifiedPieceWeightIndicator</code> property.
     */
    private boolean verifiedPieceWeightIndicator;

    // Added for PLT - UCG022 - End
    
    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Gets the <code>ArrivalDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>ArrivalDate</code> property.
     */
    public Date getArrivalDate() {
        if(arrivalDate!=null){
    	return (Date)arrivalDate.clone();
        }
        else{
        	return null;
        }
    }

    /**
     * Sets the <code>ArrivalDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pArrivalDate
     *            the current value of the <code>ArrivalDate</code> property.
     */
    public void setArrivalDate(Date arrivalDate) {
        if(arrivalDate!=null){
        	this.arrivalDate =(Date) arrivalDate.clone();
          }
        else
        {
        	this.arrivalDate=null;
        }
    }

    /**
     * Gets the <code>BoardingStation</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>BoardingStation</code> property.
     */
    public String getBoardingStation() {
        return boardingStation;
    }

    /**
     * Sets the <code>BoardingStation</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pBoardingStation
     *            the current value of the <code>BoardingStation</code> property.
     */
    public void setBoardingStation(String boardingStation) {
        this.boardingStation = boardingStation;
    }

    /**
     * Gets the <code>LastUpdateFunction</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>LastUpdateFunction</code> property.
     */
    public LMSFunctionType getLastUpdateFunction() {
        return lastUpdateFunction;
    }

    /**
     * Sets the <code>LastUpdateFunction</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pLastUpdateFunction
     *            the current value of the <code>LastUpdateFunction</code> property.
     */
    public void setLastUpdateFunction(LMSFunctionType lastUpdateFunction) {
        this.lastUpdateFunction = lastUpdateFunction;
    }

    /**
     * Gets the <code>Location</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>Location</code> property.
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the <code>Location</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pLocation
     *            the current value of the <code>Location</code> property.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Gets the <code>CurrentStation</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>CurrentStation</code> property.
     */
    public String getCurrentStation() {
        return currentStation;
    }

    /**
     * Sets the <code>CurrentStation</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pCurrentStation
     *            the current value of the <code>CurrentStation</code> property.
     */
    public void setCurrentStation(String currentStation) {
        this.currentStation = currentStation;
    }

    /**
     * Gets the <code>LastUpdateUser</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>LastUpdateUser</code> property.
     */
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    /**
     * Sets the <code>LastUpdateUser</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pLastUpdateUser
     *            the current value of the <code>LastUpdateUser</code> property.
     */
    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    /**
     * Gets the <code>Offload</code> property.
     * <p>
     * 
     * @return the current value of the <code>Offload</code> property.<br>
     */
    public OffloadDto getOffloadDto() {
        if (this.offloadDto == null) {
            this.offloadDto = new OffloadDto();
        }
        return this.offloadDto;
    }

    /**
     * Sets the <code>Offload</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>Offload</code> property.<br>
     */
    public void setOffloadDto(final OffloadDto pOffloadDto) {
        this.offloadDto = pOffloadDto;
    }

    /**
     * Gets the <code>FromCarrier</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>FromCarrier</code> property.
     */
    public String getFromCarrier() {
        return fromCarrier;
    }

    /**
     * Sets the <code>FromCarrier</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pFromCarrier
     *            the current value of the <code>FromCarrier</code> property.
     */
    public void setFromCarrier(String fromCarrier) {
        this.fromCarrier = fromCarrier;
    }

    /**
     * Gets the <code>HandlingRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>HandlingRemarks</code> property.
     */
    public String getHandlingRemarks() {
        return handlingRemarks;
    }

    /**
     * Sets the <code>HandlingRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pHandlingRemarks
     *            the current value of the <code>HandlingRemarks</code> property.
     */
    public void setHandlingRemarks(String handlingRemarks) {
    	if(handlingRemarks!=null && !handlingRemarks.isEmpty()){
        this.handlingRemarks = ContractUtility.convertToTitlecase(handlingRemarks);
    	}
    }

    /**
     * Gets the <code>ManifestGroupCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>ManifestGroupCode</code> property.
     */
    public String getManifestGroupCode() {
        return manifestGroupCode;
    }

    /**
     * Sets the <code>ManifestGroupCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pManifestGroupCode
     *            the current value of the <code>ManifestGroupCode</code> property.
     */
    public void setManifestGroupCode(String manifestGroupCode) {
        this.manifestGroupCode = manifestGroupCode;
    }

    /**
     * Gets the <code>ToCarrier</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>ToCarrier</code> property.
     */
    public String getToCarrier() {
        return toCarrier;
    }

    /**
     * Sets the <code>ToCarrier</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pToCarrier
     *            the current value of the <code>ToCarrier</code> property.
     */
    public void setToCarrier(String toCarrier) {
        this.toCarrier = toCarrier;
    }

    /**
     * Gets the <code>UserDropOffDateTime</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>UserDropOffDateTime</code> property.
     */
    public Date getUserDropOffDateTime() {
        if(userDropOffDateTime!=null){
        	return (Date)userDropOffDateTime.clone();
            }
            else{
            	return null;
            }
    }

    /**
     * Sets the <code>UserDropOffDateTime</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pUserDropOffDateTime
     *            the current value of the <code>UserDropOffDateTime</code> property.
     */
    public void setUserDropOffDateTime(Date userDropOffDateTime) {
       if(userDropOffDateTime!=null){
        	this.userDropOffDateTime =(Date) userDropOffDateTime.clone();
          }
       else
       {
    	   this.userDropOffDateTime=null;
       }
    }

    /**
     * Gets the <code>UserDropOffName</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>UserDropOffName</code> property.
     */
    public String getUserDropOffName() {
        return userDropOffName;
    }

    /**
     * Sets the <code>UserDropOffName</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pUserDropOffName
     *            the current value of the <code>UserDropOffName</code> property.
     */
    public void setUserDropOffName(String userDropOffName) {
        this.userDropOffName = userDropOffName;
    }

    /**
     * Gets the <code>CustomsCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>CustomsCode</code> property.
     */
    public CustomsStatusType getCustomsCode() {
        return customsCode;
    }

    /**
     * Sets the <code>CustomsCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pCustomsCode
     *            the current value of the <code>CustomsCode</code> property.
     */
    public void setCustomsCode(CustomsStatusType customsCode) {
        this.customsCode = customsCode;
    }

    /**
     * Gets the <code>LastUpdatedUTCTime</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>LastUpdatedUTCTime</code> property.
     */
    public Date getLastUpdatedUTCTime() {
        if(lastUpdatedUTCTime!=null){
        	return (Date)lastUpdatedUTCTime.clone();
            }
            else{
            	return null;
            }
    }

    /**
     * Sets the <code>LastUpdatedUTCTime</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pLastUpdatedUTCTime
     *            the current value of the <code>LastUpdatedUTCTime</code> property.
     */
    public void setLastUpdatedUTCTime(Date lastUpdatedUTCTime) {
      if(lastUpdatedUTCTime!=null){
    	this.lastUpdatedUTCTime =(Date) lastUpdatedUTCTime.clone();
      }
      else
      {
    	  this.lastUpdatedUTCTime=null;
      }
    }

    /**
     * Gets the <code>DocumentsReceived</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>DocumentsReceived</code> property.
     */
    public boolean getDocumentsReceived() {
        return documentsReceived;
    }

    /**
     * Sets the <code>DocumentsReceived</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pDocumentsReceived
     *            the current value of the <code>DocumentsReceived</code> property.
     */
    public void setDocumentsReceived(boolean documentsReceived) {
        this.documentsReceived = documentsReceived;
    }

    /**
     * Gets the <code>GoodsType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>GoodsType</code> property.
     */
    public GoodsType getGoodsType() {
        return goodsType;
    }

    /**
     * Sets the <code>GoodsType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pGoodsType
     *            the current value of the <code>GoodsType</code> property.
     */
    public void setGoodsType(GoodsType goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * Gets the <code>SubjectToDelayIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>SubjectToDelayIndicator</code> property.
     */
    public boolean getSubjectToDelayIndicator() {
        return subjectToDelayIndicator;
    }

    /**
     * Sets the <code>SubjectToDelayIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pSubjectToDelayIndicator
     *            the current value of the <code>SubjectToDelayIndicator</code> property.
     */
    public void setSubjectToDelayIndicator(boolean subjectToDelayIndicator) {
        this.subjectToDelayIndicator = subjectToDelayIndicator;
    }

    /**
     * Gets the <code>GoodsInCustoms</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>GoodsInCustoms</code> property.
     */
    public boolean getGoodsInCustoms() {
        return goodsInCustoms;
    }

    /**
     * Sets the <code>GoodsInCustoms</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pGoodsInCustoms
     *            the current value of the <code>GoodsInCustoms</code> property.
     */
    public void setGoodsInCustoms(boolean goodsInCustoms) {
        this.goodsInCustoms = goodsInCustoms;
    }

    /**
     * Gets the <code>VerifiedSLULDWeigntIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>VerifiedSLULDWeigntIndicator</code> property.
     */
    public boolean getVerifiedSLULDWeigntIndicator() {
        return verifiedSLULDWeigntIndicator;
    }

    /**
     * Sets the <code>VerifiedSLULDWeigntIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pVerifiedSLULDWeigntIndicator
     *            the current value of the <code>VerifiedSLULDWeigntIndicator</code> property.
     */
    public void setVerifiedSLULDWeigntIndicator(
                boolean verifiedSLULDWeigntIndicator) {
        this.verifiedSLULDWeigntIndicator = verifiedSLULDWeigntIndicator;
    }

    /**
     * Gets the <code>LocationType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>LocationType</code> property.
     */
    public LocationType getLocationType() {
        return locationType;
    }

    /**
     * Sets the <code>LocationType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pLocationType
     *            the current value of the <code>LocationType</code> property.
     */
    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }

    /**
     * Gets the <code>WorkorderNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>WorkorderNumber</code> property.
     */
    public Long getWorkorderNumber() {
        return workorderNumber;
    }

    /**
     * Sets the <code>WorkorderNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pWorkorderNumber
     *            the current value of the <code>WorkorderNumber</code> property.
     */
    public void setWorkorderNumber(Long workorderNumber) {
        this.workorderNumber = workorderNumber;
    }

    /**
     * Gets the <code>GoodsStatus</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>GoodsStatus</code> property.
     */
    public GoodsStatusType getGoodsStatus() {
        return goodsStatus;
    }

    /**
     * Sets the <code>GoodsStatus</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pGoodsStatus
     *            the current value of the <code>GoodsStatus</code> property.
     */
    public void setGoodsStatus(GoodsStatusType goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    /**
     * Gets the <code>FlightDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>FlightDate</code> property.
     */
    public Date getFlightDate() {
        	if(flightDate!=null){
        	return (Date)this.flightDate.clone();
            }
            else{
            	return null;
            }
       }
    
    /**
     * Gets the <code>flightLocalDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     *
     * @return the current value of the <code>flightLocalDate</code> property.
     */
    public Date getFlightLocalDate() {
		if(this.flightLocalDate!=null){
	    	return (Date)this.flightLocalDate.clone();
	        }
	        else{
	        	return null;
	        }
	}

    /**
     * Sets the <code>FlightDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pFlightDate
     *            the current value of the <code>FlightDate</code> property.
     */
    public void setFlightDate(Date flightDate) {
           	if(flightDate!=null){
            	this.flightDate =(Date) flightDate.clone();
           	} else {
           		this.flightDate = null;
           	}
    }
    
    /**
     * Sets the <code>flightLocalDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     *
     * @param pFlightLocalDate
     *            the current value of the <code>flightLocalDate</code> property.
     */
	public void setFlightLocalDate(final Date pFlightLocalDate) {
		if(pFlightLocalDate!=null){
	    	this.flightLocalDate =(Date) pFlightLocalDate.clone();
	      } else {
	    	  this.flightLocalDate = null;
	      }
	}

    /**
     * Gets the <code>scheduleChangeIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>scheduleChangeIndicator</code> property.
     */
    public boolean getScheduleChangeIndicator() {
        return scheduleChangeIndicator;
    }

    /**
     * Sets the <code>scheduleChangeIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param scheduleChangeIndicator
     *            the current value of the <code>scheduleChangeIndicator</code> property.
     */
    public void setScheduleChangeIndicator(boolean scheduleChangeIndicator) {
        this.scheduleChangeIndicator = scheduleChangeIndicator;
    }

    /**
     * Gets the <code>Capacity</code> property.
     * <p>
     * 
     * @return the current value of the <code>Capacity</code> property.<br>
     */
    public ShipmentCapacityDto getCapacityDto() {
        if (this.capacityDto == null) {
            this.capacityDto = new ShipmentCapacityDto();
        }
        return this.capacityDto;
    }

    /**
     * Sets the <code>Capacity</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>Capacity</code> property.<br>
     */
    public void setCapacityDto(final ShipmentCapacityDto pCapacityDto) {
        this.capacityDto = pCapacityDto;
    }

    /**
     * Gets the <code>baseFlightDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>baseFlightDto</code> property.<br>
     */
    public BaseFlightDto getBaseFlightDto() {
        if (this.baseFlightDto == null) {
            this.baseFlightDto = new BaseFlightDto();
        }
        return this.baseFlightDto;
    }

    /**
     * Sets the <code>baseFlightDto</code> property.
     * <p>
     * 
     * @param baseFlightDto
     *            the current value of the <code>baseFlightDto</code> property.<br>
     */
    public void setBaseFlightDto(final BaseFlightDto baseFlightDto) {
        this.baseFlightDto = baseFlightDto;
    }

    /**
     * Gets the <code>DensityFactor</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>DensityFactor</code> property.
     */
    public DensityFactorType getDensityFactor() {
        return densityFactor;
    }

    /**
     * Sets the <code>DensityFactor</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pDensityFactor
     *            the current value of the <code>DensityFactor</code> property.
     */
    public void setDensityFactor(DensityFactorType densityFactor) {
        this.densityFactor = densityFactor;
    }

    /**
     * Gets the <code>DeckPostion</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>DeckPostion</code> property.
     */
    public ContainerContourType getDeckPostion() {
        return deckPostion;
    }

    /**
     * Sets the <code>DeckPostion</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pDeckPostion
     *            the current value of the <code>DeckPostion</code> property.
     */
    public void setDeckPostion(ContainerContourType deckPostion) {
        this.deckPostion = deckPostion;
    }

    /**
     * Gets the <code>DispositionType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>DispositionType</code> property.
     */
    public DispositionType getDispositionCode() {
        return dispositionCode;
    }

    /**
     * Sets the <code>DispositionType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pDispositionCode
     *            the current value of the <code>DispositionType</code> property.
     */
    public void setDispositionCode(DispositionType pDispositionCode) {
        this.dispositionCode = pDispositionCode;
    }

    /**
     * Gets the <code>InboundIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>inboundIndicator</code> property.
     */
    public boolean isInboundIndicator() {
        return inboundIndicator;
    }

    /**
     * Sets the <code>InboundIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param inboundIndicator
     *            the current value of the <code>inboundIndicator</code> property.
     */
    public void setInboundIndicator(boolean inboundIndicator) {
        this.inboundIndicator = inboundIndicator;
    }

    /**
     * Gets the <code>LabelsCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>LabelsCount</code> property.
     */
    public Integer getLabelsCount() {
        return labelsCount;
    }

    /**
     * Sets the <code>LabelsCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pLabelsCount
     *            the current value of the <code>LabelsCount</code> property.
     */
    public void setLabelsCount(Integer labelsCount) {
        this.labelsCount = labelsCount;
    }

    /**
     * Gets the <code>LabelPrinter</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>LabelPrinter</code> property.
     */
    public String getLabelPrinter() {
        return labelPrinter;
    }

    /**
     * Sets the <code>LabelPrinter</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pLabelPrinter
     *            the current value of the <code>LabelPrinter</code> property.
     */
    public void setLabelPrinter(String labelPrinter) {
        this.labelPrinter = labelPrinter;
    }

    /**
     * Gets the <code>receiptIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>receiptIndicator</code> property.
     */
    public Boolean getReceiptIndicator() {
        return receiptIndicator;
    }

    /**
     * Sets the <code>receiptIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pReceiptRequest
     *            the current value of the <code>receiptIndicator</code> property.
     */
    public void setReceiptIndicator(Boolean receiptIndicator) {
        this.receiptIndicator = receiptIndicator;
    }

    /**
     * Gets the <code>receiptRequestType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return
     * 
     * @return the current value of the <code>receiptRequestType</code> property.
     */
    public ReceiptType getReceiptRequestType() {
        return this.receiptRequestType;
    }

    /**
     * Sets the <code>receiptRequestType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param receiptRequestType
     *            the current value of the <code>receiptRequestType</code> property.
     */
    public void setReceiptRequestType(ReceiptType receiptRequestType) {
        this.receiptRequestType = receiptRequestType;
    }

    /**
     * Gets the <code>userAuditDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>userAuditDto</code> property.<br>
     */
    public UserAuditDto getUserAuditDto() {
        if (this.userAuditDto == null) {
            this.userAuditDto = new UserAuditDto();
        }
        return userAuditDto;
    }

    /**
     * Sets the <code>userAuditDto</code> property.
     * <p>
     * 
     * @param userAuditDto
     *            the current value of the <code>userAuditDto</code> property.<br>
     */
    public void setUserAuditDto(UserAuditDto userAuditDto) {
        this.userAuditDto = userAuditDto;
    }

    /**
     * Gets the <code>LastUpdatedLocalTime</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>LastUpdatedLocalTime</code> property.
     */
    public Date getLastUpdatedLocalTime() {
        if(lastUpdatedLocalTime!=null){
        	return (Date)lastUpdatedLocalTime.clone();
            }
            else{
            	return null;
            } 
    }

    /**
     * Sets the <code>LastUpdatedLocalTime</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pLastUpdatedLocalTime
     *            the current value of the <code>LastUpdatedLocalTime</code> property.
     */
    public void setLastUpdatedLocalTime(Date lastUpdatedLocalTime) {
        if(lastUpdatedLocalTime!=null){
        	this.lastUpdatedLocalTime =(Date) lastUpdatedLocalTime.clone();
          }
        else
        {
        	this.lastUpdatedLocalTime=null;
        }
    }

    /**
     * Gets the <code>ShipperLoadedULDIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>ShipperLoadedULDIndicator</code> property.
     */
    public boolean getShipperLoadedULDIndicator() {
        return shipperLoadedULDIndicator;
    }

    /**
     * Sets the <code>ShipperLoadedULDIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pShipperLoadedULDIndicator
     *            the current value of the <code>ShipperLoadedULDIndicator</code> property.
     */
    public void setShipperLoadedULDIndicator(boolean shipperLoadedULDIndicator) {
        this.shipperLoadedULDIndicator = shipperLoadedULDIndicator;
    }

    /**
     * Gets the <code>ecaCompletedIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>ecaCompletedIndicator</code> property.
     */
    public boolean getEcaCompletedIndicator() {
        return ecaCompletedIndicator;
    }

    /**
     * Sets the <code>ecaCompletedIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pLastUpdatedLocalTime
     *            the current value of the <code>ecaCompletedIndicator</code> property.
     */
    public void setEcaCompletedIndicator(boolean ecaCompletedIndicator) {
        this.ecaCompletedIndicator = ecaCompletedIndicator;
    }

    /**
     * Gets the value of the <code>workOrderOid</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>workOrderOid</code> property.
     */
    public Long getWorkOrderOid() {
        return workOrderOid;
    }

    /**
     * Sets the value of the <code>workOrderOid</code> property.
     * <p>
     * 
     * @param <code>workOrderOid</code> Holds the new value of the <code>workOrderOid</code> property.
     */
    public void setWorkOrderOid(Long workOrderOid) {
        this.workOrderOid = workOrderOid;
    }

    /**
     * Gets the value of the <code>workOrderStation</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>workOrderStation</code> property.
     */
    public String getWorkOrderStation() {
        return workOrderStation;
    }

    /**
     * Sets the value of the <code>workOrderStation</code> property.
     * <p>
     * 
     * @param <code>workOrderStation</code> Holds the new value of the <code>workOrderStation</code> property.
     */
    public void setWorkOrderStation(String workOrderStation) {
        this.workOrderStation = workOrderStation;
    }

    /**
     * Gets the value of the <code>internationalIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>internationalIndicator</code> property.
     */
    public boolean isInternationalIndicator() {
        return internationalIndicator;
    }

    /**
     * Sets the value of the <code>internationalIndicator</code> property.
     * <p>
     * 
     * @param <code>internationalIndicator</code> Holds the new value of the
     *        <code>internationalIndicator</code> property.
     */
    public void setInternationalIndicator(boolean internationalIndicator) {
        this.internationalIndicator = internationalIndicator;
    }

    /**
     * Gets the value of the <code>atCustomsStationIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>atCustomsStationIndicator</code> property.
     */
    public boolean isAtCustomsStationIndicator() {
        return atCustomsStationIndicator;
    }

    /**
     * Sets the value of the <code>atCustomsStationIndicator</code> property.
     * <p>
     * 
     * @param <code>atCustomsStationIndicator</code> Holds the new value of the
     *        <code>atCustomsStationIndicator</code> property.
     */
    public void setAtCustomsStationIndicator(boolean atCustomsStationIndicator) {
        this.atCustomsStationIndicator = atCustomsStationIndicator;
    }

    /**
     * Gets the value of the <code>customsAutoIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>customsAutoIndicator</code> property.
     */
    public boolean isCustomsAutoIndicator() {
        return customsAutoIndicator;
    }

    /**
     * Sets the value of the <code>customsAutoIndicator</code> property.
     * <p>
     * 
     * @param <code>customsAutoIndicator</code> Holds the new value of the <code>customsAutoIndicator</code>
     *        property.
     */
    public void setCustomsAutoIndicator(boolean customsAutoIndicator) {
        this.customsAutoIndicator = customsAutoIndicator;
    }

    /**
     * Gets the value of the <code>customSubStatusCode</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>customSubStatusCode</code> property.
     */
    public CustomsSubStatusType getCustomSubStatusCode() {
        return customSubStatusCode;
    }

    /**
     * Sets the value of the <code>customSubStatusCode</code> property.
     * <p>
     * 
     * @param <code>customSubStatusCode</code> Holds the new value of the <code>customSubStatusCode</code>
     *        property.
     */
    public void setCustomSubStatusCode(CustomsSubStatusType customSubStatusCode) {
        this.customSubStatusCode = customSubStatusCode;
    }

    /**
     * Gets the value of the <code>pendingCustomStatusCode</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>pendingCustomStatusCode</code> property.
     */
    public CustomsStatusType getPendingCustomStatusCode() {
        return pendingCustomStatusCode;
    }

    /**
     * Sets the value of the <code>pendingCustomStatusCode</code> property.
     * <p>
     * 
     * @param <code>pendingCustomStatusCode</code> Holds the new value of the
     *        <code>pendingCustomStatusCode</code> property.
     */
    public void setPendingCustomStatusCode(
                CustomsStatusType pendingCustomStatusCode) {
        this.pendingCustomStatusCode = pendingCustomStatusCode;
    }

    /**
     * Gets the value of the <code>pendingCustomSubStatusCode</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>pendingCustomSubStatusCode</code> property.
     */
    public CustomsSubStatusType getPendingCustomSubStatusCode() {
        return pendingCustomSubStatusCode;
    }

    /**
     * Sets the value of the <code>pendingCustomSubStatusCode</code> property.
     * <p>
     * 
     * @param <code>pendingCustomSubStatusCode</code> Holds the new value of the
     *        <code>pendingCustomSubStatusCode</code> property.
     */
    public void setPendingCustomSubStatusCode(
                CustomsSubStatusType pendingCustomSubStatusCode) {
        this.pendingCustomSubStatusCode = pendingCustomSubStatusCode;
    }

    /**
     * Gets the value of the <code>discrepancyType</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>discrepancyType</code> property.
     */
    public DiscrepancyType getDiscrepancyType() {
        return discrepancyType;
    }

    /**
     * Sets the value of the <code>discrepancyType</code> property.
     * <p>
     * 
     * @param <code>discrepancyType</code> Holds the new value of the <code>discrepancyType</code> property.
     */
    public void setDiscrepancyType(DiscrepancyType discrepancyType) {
        this.discrepancyType = discrepancyType;
    }

    /**
     * Gets the value of the <code>discrepancyIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>discrepancyIndicator</code> property.
     */
    public Boolean getDiscrepancyIndicator() {
        return discrepancyIndicator;
    }

    /**
     * Sets the value of the <code>discrepancyIndicator</code> property.
     * <p>
     * 
     * @param <code>discrepancyIndicator</code> Holds the new value of the <code>discrepancyIndicator</code>
     *        property.
     */
    public void setDiscrepancyIndicator(Boolean discrepancyIndicator) {
        this.discrepancyIndicator = discrepancyIndicator;
    }

    /**
     * Gets the value of the <code>workOrderDto</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>workOrderDto</code> property.
     */
    public WorkOrderDto getWorkOrderDto() {
        return workOrderDto;
    }

    /**
     * Sets the value of the <code>workOrderDto</code> property.
     * <p>
     * 
     * @param <code>workOrderDto</code> Holds the new value of the <code>workOrderDto</code> property.
     */
    public void setWorkOrderDto(WorkOrderDto workOrderDto) {
        this.workOrderDto = workOrderDto;
    }

    /**
     * Gets the value of the <code>goodsTransitControlIndicator</code> property.
     * <p>
     *
     * @return Returns the current value of <code>goodsTransitControlIndicator</code> property.
     */
    public boolean isGoodsTransitControlIndicator() {
        return goodsTransitControlIndicator;
    }

    /**
     * Sets the value of the <code>goodsTransitControlIndicator</code> property.
     * <p>
     *
     * @param <code>goodsTransitControlIndicator</code> Holds the new value of the
     *        <code>goodsTransitControlIndicator</code> property.
     */
    public void setGoodsTransitControlIndicator(boolean goodsTransitControlIndicator) {
        this.goodsTransitControlIndicator = goodsTransitControlIndicator;
    }

    /**
     * Gets the value of the <code>goodsPiecesCleared</code> property.
     * <p>
     *
     * @return Returns the current value of <code>goodsPiecesCleared</code> property.
     */
    public int getGoodsPiecesCleared() {
        return goodsPiecesCleared;
    }

    /**
     * Sets the value of the <code>goodsPiecesCleared</code> property.
     * <p>
     *
     * @param <code>goodsPiecesCleared</code> Holds the new value of the <code>goodsPiecesCleared</code>
     *        property.
     */
    public void setGoodsPiecesCleared(int goodsPiecesCleared) {
        this.goodsPiecesCleared = goodsPiecesCleared;
    }

    /**
     * Gets the value of the <code>goodsTransitControlFlag</code> property.
     * <p>
     *
     * @return Returns the current value of <code>goodsTransitControlFlag</code> property.
     */
    public String getGoodsTransitControlFlag() {
        return goodsTransitControlFlag;
    }

    /**
     * Sets the value of the <code>goodsTransitControlFlag</code> property.
     * <p>
     *
     * @param <code>goodsTransitControlFlag</code> Holds the new value of the
     *        <code>goodsTransitControlFlag</code> property.
     */
    public void setGoodsTransitControlFlag(String goodsTransitControlFlag) {
        this.goodsTransitControlFlag = goodsTransitControlFlag;
    }

    /**
     * Gets the value of the <code>goodsPartIdentifier</code> property.
     * <p>
     *
     * @return Returns the current value of <code>goodsPartIdentifier</code> property.
     */
    public String getGoodsPartIdentifier() {
        return goodsPartIdentifier;
    }

    /**
     * Sets the value of the <code>goodsPartIdentifier</code> property.
     * <p>
     *
     * @param <code>goodsPartIdentifier</code> Holds the new value of the <code>goodsPartIdentifier</code>
     *        property.
     */
    public void setGoodsPartIdentifier(String goodsPartIdentifier) {
        this.goodsPartIdentifier = goodsPartIdentifier;
    }

    /**
     * Gets the value of the <code>customsDetailedStatus</code> property.
     * <p>
     *
     * @return Returns the current value of <code>customsDetailedStatus</code> property.
     */
    public String getCustomsDetailedStatus() {
        return customsDetailedStatus;
    }

    /**
     * Sets the value of the <code>customsDetailedStatus</code> property.
     * <p>
     *
     * @param <code>customsDetailedStatus</code>
     *            Holds the new value of the <code>customsDetailedStatus</code> property.
     */
    public void setCustomsDetailedStatus(String customsDetailedStatus) {
        this.customsDetailedStatus = customsDetailedStatus;
    }
    
    // Added for PLT - UCG022 - Start
    /**
     * Gets the <code>verifiedPieceWeightIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>verifiedPieceWeightIndicator</code> property.
     */
    public boolean isVerifiedPieceWeightIndicator() {
        return this.verifiedPieceWeightIndicator;
    }
    
    /**
     * Sets the <code>verifiedPieceWeightIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pVerifiedPieceWeightIndicator
     *            the current value of the <code>verifiedPieceWeightIndicator</code> property.
     */
    public void setVerifiedPieceWeightIndicator(final boolean pVerifiedPieceWeightIndicator) {
        this.verifiedPieceWeightIndicator = pVerifiedPieceWeightIndicator;
    }

    // Added for PLT - UCG022 - End
    



	public Date getGoodsStatusChangeLocalTime() {
		if(goodsStatusChangeLocalTime!=null){
	    	return (Date)goodsStatusChangeLocalTime.clone();
	        }
	        else{
	        	return null;
	        }
	}

	public String getGoodsStatusChangeStn() {
		return goodsStatusChangeStn;
	}

	public void setGoodsStatusChangeStn(String goodsStatusChangeStn) {
		this.goodsStatusChangeStn = goodsStatusChangeStn;
	}

	public void setGoodsStatusChangeLocalTime(Date goodsStatusChangeLocalTime) {
		if(goodsStatusChangeLocalTime!=null){
	    	this.goodsStatusChangeLocalTime =(Date) goodsStatusChangeLocalTime.clone();
	      }
		else
		{
			this.goodsStatusChangeLocalTime=null;
		}
	}


/**
     * Attribute to hold <code>goodsChangeStn</code> property.
     */
    private String goodsStatusChangeStn;
    
    /**
     * Attribute to hold <code>goodsChangeLocalTime</code> property.
     */
    private Date goodsStatusChangeLocalTime;
    
    

    private Date goodsStatusChangeUTCTime;

    private Date userEnteredLocaltime;

    private Date userEnteredUTCTime;
    
    private String creationSource;

	public Date getGoodsStatusChangeUTCTime() {
		if(goodsStatusChangeUTCTime!=null){
	    	return (Date)goodsStatusChangeUTCTime.clone();
	        }
	        else{
	        	return null;
	        }
	}

	public void setGoodsStatusChangeUTCTime(final Date goodsStatusChangeUTCTime) {
		if(goodsStatusChangeUTCTime!=null){
	    	this.goodsStatusChangeUTCTime =(Date) goodsStatusChangeUTCTime.clone();
	      }
		else
		{
			this.goodsStatusChangeUTCTime=null;
		}
	}

	public Date getUserEnteredLocaltime() {
		if(userEnteredLocaltime!=null){
	    	return (Date)userEnteredLocaltime.clone();
	        }
	        else{
	        	return null;
	        }
	}

	public void setUserEnteredLocaltime(final Date userEnteredLocaltime) {
			if(userEnteredLocaltime!=null){
	    	this.userEnteredLocaltime =(Date) userEnteredLocaltime.clone();
	      }
			else
			{
				this.userEnteredLocaltime=null;
			}
	}

	public Date getUserEnteredUTCTime() {
		if(userEnteredUTCTime!=null){
	    	return (Date)userEnteredUTCTime.clone();
	        }
	        else{
	        	return null;
	        }
	}

	public void setUserEnteredUTCTime(final Date userEnteredUTCTime) {
		if(userEnteredUTCTime!=null){
	    	this.userEnteredUTCTime =(Date) userEnteredUTCTime.clone();
	      }
		else
		{
			this.userEnteredUTCTime=null;
		}
	}
	
	public String getCreationSource() {
        return creationSource;
    }

	public void setCreationSource(final String creationSource) {
        this.creationSource = creationSource;
    }

    public Date getOldFlightDate() {
        return oldFlightDate;
    }

    public void setOldFlightDate(Date oldFlightDate) {
        this.oldFlightDate = oldFlightDate;
    }

    public BaseFlightDto getOldBaseFlightDto() {
        return oldBaseFlightDto;
    }

    public void setOldBaseFlightDto(BaseFlightDto oldBaseFlightDto) {
        this.oldBaseFlightDto = oldBaseFlightDto;
    }
}