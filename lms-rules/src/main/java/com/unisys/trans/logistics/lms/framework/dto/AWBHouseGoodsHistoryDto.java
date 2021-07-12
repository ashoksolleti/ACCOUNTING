package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AWBHouseGoodsHistoryDto</code> contain details of HouseGoodsHistory.
 * <p>
 * This contains all information about HouseGoodsHistory.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>action
 * <li>airWaybillNumberDto
 * <li>awbCreationDate
 * <li>flightDate
 * <li>gmtTime
 * <li>housAWBDataBaseKey
 * <li>house
 * <li>houseAction
 * <li>houseGmtDate
 * <li>houseIdentifier
 * <li>houseLocalDate
 * <li>housePieces
 * <li>houseTotalPieces
 * <li>houseTotalWeight
 * <li>houseUserId
 * <li>houseWeight
 * <li>localTimeInchange
 * <li>masterAWBDataBaseKey
 * <li>masterCustomsStatus
 * <li>masterFlight
 * <li>masterGoodsStatus
 * <li>masterLocation
 * <li>masterPieces
 * <li>masterStation
 * <li>masterWeight
 * <li>oId
 * <li>station
 * <li>status
 * <li>userId
 * <li>subCode
 * </ul>
 */
public class AWBHouseGoodsHistoryDto extends PersistenceObjectDto {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>action</code> property.
     */
    private String action;

    /**
     * Attribute to hold <code>airWaybillNumberDto</code> property.
     */
    private AirWaybillNumberDto airWaybillNumberDto;

    /**
     * Attribute to hold <code>awbCreationDate</code> property.
     */
    private Date awbCreationDate;

    /**
     * Attribute to hold <code>gmtTime</code> property.
     */
    private String gmtTime;

    /**
     * Attribute to hold <code>housAWBDataBaseKey</code> property.
     */
    private String housAWBDataBaseKey;

    /**
     * Attribute to hold <code>house</code> property.
     */
    private String house;

    /**
     * Attribute to hold <code>houseAction</code> property.
     */
    private String houseAction;

    /**
     * Attribute to hold <code>houseAirwaybillOid</code> property.
     */
    private Long houseAirwaybillOid;

    /**
     * Attribute to hold <code>houseGmtDate</code> property.
     */
    private Date houseGmtDate;

    /**
     * Attribute to hold <code>houseIdentifier</code> property.
     */

    private String houseIdentifier;

    /**
     * Attribute to hold <code>houseLocalDate</code> property.
     */
    private Date houseLocalDate;

    /**
     * Attribute to hold <code>housePieces</code> property.
     */
    private BigDecimal housePieces;

    /**
     * Attribute to hold <code>houseTotalPieces</code> property.
     */
    private BigDecimal houseTotalPieces;

    /**
     * Attribute to hold <code>houseTotalWeight</code> property.
     */
    private BigDecimal houseTotalWeight;

    /**
     * Attribute to hold <code>houseUserId</code> property.
     */
    private String houseUserId;

    /**
     * Attribute to hold <code>houseWeight</code> property.
     */
    private BigDecimal houseWeight;

    /**
     * Attribute to hold <code>localTimeInchange</code> property.
     */
    private String localTimeInchange;

    /**
     * Attribute to hold <code>masterAWBDataBaseKey</code> property.
     */
    private String masterAWBDataBaseKey;

    /**
     * Attribute to hold <code>masterCustomsStatus</code> property.
     */
    private String masterCustomsStatus;

    /**
     * Attribute to hold <code>masterFlight</code> property.
     */
    private String masterFlight;

    /**
     * Attribute to hold <code>masterGoodsStatus</code> property.
     */
    private String masterGoodsStatus;

    /**
     * Attribute to hold <code>masterLocation</code> property.
     */
    private String masterLocation;

    /**
     * Attribute to hold <code>masterPieces</code> property.
     */
    private BigDecimal masterPieces;

    /**
     * Attribute to hold <code>masterStation</code> property.
     */
    private String masterStation;

    /**
     * Attribute to hold <code>masterWeight</code> property.
     */
    private BigDecimal masterWeight;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Attribute to hold <code>station</code> property.
     */

    private String station;

    /**
     * Attribute to hold <code>status</code> property.
     */

    private String status;

    /**
     * Attribute to hold <code>subCode</code> property.
     */
    private String subCode;

    /**
     * Attribute to hold <code>userId</code> property.
     */

    private String userId;

    /**
     * Gets the <code>action</code> property.
     * <p>
     * 
     * @return the current value of the <code>action</code> property.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * Gets the <code>airWaybillNumberDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWaybillNumberDto</code> property.
     */
    public AirWaybillNumberDto getAirWaybillNumberDto() {
        return this.airWaybillNumberDto;
    }

    /**
     * Gets the <code>awbCreationDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbCreationDate</code> property.
     */
    public Date getAwbCreationDate() {
        return ContractUtility.getClonedDate(this.awbCreationDate);
    }

    /**
     * Gets the <code>gmtTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>gmtTime</code> property.
     */

    public String getGmtTime() {
        return this.gmtTime;
    }

    /**
     * Gets the <code>housAWBDataBaseKey</code> property.
     * <p>
     * 
     * @return the current value of the <code>housAWBDataBaseKey</code> property.
     */

    public String getHousAWBDataBaseKey() {
        return this.housAWBDataBaseKey;
    }

    /**
     * Gets the <code>house</code> property.
     * <p>
     * 
     * @return the current value of the <code>house</code> property.
     */

    public String getHouse() {
        return this.house;
    }

    /**
     * Gets the <code>houseAction</code> property.
     * <p>
     * 
     * @return the current value of the <code>houseAction</code> property.
     */

    public String getHouseAction() {
        return this.houseAction;
    }

    /**
     * Gets the <code>houseAirwaybillOid</code> property.
     * <p>
     * 
     * @return the current value of <code>houseAirwaybillOid</code> property.
     */
    public Long getHouseAirwaybillOid() {
        return this.houseAirwaybillOid;
    }

    /**
     * Gets the <code>houseGmtDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @return the current value of the <code>houseGmtDate</code> property.
     */

    public Date getHouseGmtDate() {
        return ContractUtility.getClonedDate(this.houseGmtDate);
    }

    /**
     * Gets the <code>houseIdentifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>houseIdentifier</code> property.
     */

    public String getHouseIdentifier() {
        return this.houseIdentifier;
    }

    /**
     * Gets the <code>houseLocalDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @return the current value of the <code>houseLocalDate</code> property.
     */

    public Date getHouseLocalDate() {

        return ContractUtility.getClonedDate(this.houseLocalDate);
    }

    /**
     * Gets the <code>housePieces</code> property.
     * <p>
     * 
     * @return the current value of the <code>housePieces</code> property.
     */

    public BigDecimal getHousePieces() {
        return this.housePieces;
    }

    /**
     * Gets the <code>houseTotalPieces</code> property.
     * <p>
     * 
     * @return the current value of the <code>houseTotalPieces</code> property.
     */

    public BigDecimal getHouseTotalPieces() {
        return this.houseTotalPieces;
    }

    /**
     * Gets the <code>houseTotalWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>houseTotalWeight</code> property.
     */

    public BigDecimal getHouseTotalWeight() {
        return this.houseTotalWeight;
    }

    /**
     * Gets the <code>houseUserId</code> property.
     * <p>
     * 
     * @return the current value of the <code>houseUserId</code> property.
     */

    public String getHouseUserId() {
        return this.houseUserId;
    }

    /**
     * Gets the <code>houseWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>houseWeight</code> property.
     */

    public BigDecimal getHouseWeight() {
        return this.houseWeight;
    }

    /**
     * Gets the <code>localTimeInchange</code> property.
     * <p>
     * 
     * @return the current value of the <code>localTimeInchange</code> property.
     */

    public String getLocalTimeInchange() {
        return this.localTimeInchange;
    }

    /**
     * Gets the <code>masterAWBDataBaseKey</code> property.
     * <p>
     * 
     * @return the current value of the <code>masterAWBDataBaseKey</code> property.
     */

    public String getMasterAWBDataBaseKey() {
        return this.masterAWBDataBaseKey;
    }

    /**
     * Gets the <code>masterCustomsStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>masterCustomsStatus</code> property.
     */

    public String getMasterCustomsStatus() {
        return this.masterCustomsStatus;
    }

    /**
     * Gets the <code>masterFlight</code> property.
     * <p>
     * 
     * @return the current value of the <code>masterFlight</code> property.
     */

    public String getMasterFlight() {
        return this.masterFlight;
    }

    /**
     * Gets the <code>masterGoodsStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>masterGoodsStatus</code> property.
     */

    public String getMasterGoodsStatus() {
        return this.masterGoodsStatus;
    }

    /**
     * Gets the <code>masterLocation</code> property.
     * <p>
     * 
     * @return the current value of the <code>masterLocation</code> property.
     */

    public String getMasterLocation() {
        return this.masterLocation;
    }

    /**
     * Gets the <code>masterPieces</code> property.
     * <p>
     * 
     * @return the current value of the <code>masterPieces</code> property.
     */

    public BigDecimal getMasterPieces() {
        return this.masterPieces;
    }

    /**
     * Gets the <code>masterStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>masterStation</code> property.
     */

    public String getMasterStation() {
        return this.masterStation;
    }

    /**
     * Gets the <code>masterWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>masterWeight</code> property.
     */

    public BigDecimal getMasterWeight() {
        return this.masterWeight;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * This object ID is an auto-generated value at the system level. Hence, this cannot be updated.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>station</code> property.
     * <p>
     * 
     * @return the current value of the <code>station</code> property.
     */

    public String getStation() {
        return this.station;
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
     * Gets the <code>subCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>subCode</code> property.
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * Gets the <code>userId</code> property.
     * <p>
     * 
     * @return the current value of the <code>userId</code> property.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * Sets the <code>action</code> property.
     * <p>
     * 
     * @param pAction
     *            the current value of the <code>action</code> property.
     */

    public void setAction(final String pAction) {
        this.action = pAction;
    }

    /**
     * Sets the <code>airWaybillNumberDto</code> property.
     * <p>
     * 
     * @param pAirWaybillNumberDto
     *            the current value of the <code>airWaybillNumberDto</code> property.
     */
    public void setAirWaybillNumberDto(
                final AirWaybillNumberDto pAirWaybillNumberDto) {
        this.airWaybillNumberDto = pAirWaybillNumberDto;
    }

    /**
     * Sets the <code>awbCreationDate</code> property.
     * <p>
     * 
     * @param pAwbCreationDate
     *            the current value of the <code>awbCreationDate</code> property.
     */
    public void setAwbCreationDate(final Date pAwbCreationDate) {
        this.awbCreationDate = ContractUtility.getClonedDate(pAwbCreationDate);
    }

    /**
     * Sets the <code>gmtTime</code> property.
     * <p>
     * 
     * @param pGmtTime
     *            the current value of the <code>gmtTime</code> property.
     */

    public void setGmtTime(final String pGmtTime) {
        this.gmtTime = pGmtTime;
    }

    /**
     * Sets the <code>housAWBDataBaseKey</code> property.
     * <p>
     * 
     * @param pHousAWBDataBaseKey
     *            the current value of the <code>housAWBDataBaseKey</code> property.
     */

    public void setHousAWBDataBaseKey(final String pHousAWBDataBaseKey) {
        this.housAWBDataBaseKey = pHousAWBDataBaseKey;
    }

    /**
     * Sets the <code>house</code> property.
     * <p>
     * 
     * @param pHouse
     *            the current value of the <code>house</code> property.
     */
    public void setHouse(final String pHouse) {
        this.house = ContractUtility.convertToUpperCase(pHouse);
    }

    /**
     * Sets the <code>houseAction</code> property.
     * <p>
     * 
     * @param pHouseAction
     *            the current value of the <code>houseAction</code> property.
     */
    public void setHouseAction(final String pHouseAction) {
        this.houseAction = pHouseAction;
    }

    /**
     * Sets the <code>houseAirwaybillOid</code> property.
     * <p>
     * 
     * @param pHouseAirwaybillOid
     *            the current value of the <code>houseAirwaybillOid</code> property.
     */
    public void setHouseAirwaybillOid(final Long pHouseAirwaybillOid) {
        this.houseAirwaybillOid = pHouseAirwaybillOid;
    }

    /**
     * Sets the <code>houseGmtDate</code> property.
     * <p>
     * 
     * @param pHouseGmtDate
     *            the current value of the <code>houseGmtDate</code> property.
     */
    public void setHouseGmtDate(final Date pHouseGmtDate) {
        this.houseGmtDate = ContractUtility.getClonedDate(pHouseGmtDate);
    }

    /**
     * Sets the <code>houseIdentifier</code> property.
     * <p>
     * 
     * @param pHouseIdentifier
     *            the current value of the <code>houseIdentifier</code> property.
     */
    public void setHouseIdentifier(final String pHouseIdentifier) {
        this.houseIdentifier = pHouseIdentifier;
    }

    /**
     * Sets the <code>houseLocalDate</code> property.
     * <p>
     * 
     * @param pHouseLocalDate
     *            the current value of the <code>houseLocalDate</code> property.
     */
    public void setHouseLocalDate(final Date pHouseLocalDate) {
        this.houseLocalDate = ContractUtility.getClonedDate(pHouseLocalDate);
    }

    /**
     * Sets the <code>housePieces</code> property.
     * <p>
     * 
     * @param pHousePieces
     *            the current value of the <code>housePieces</code> property.
     */
    public void setHousePieces(final BigDecimal pHousePieces) {
        this.housePieces = pHousePieces;
    }

    /**
     * Sets the <code>houseTotalPieces</code> property.
     * <p>
     * 
     * @param pHouseTotalPieces
     *            the current value of the <code>houseTotalPieces</code> property.
     */
    public void setHouseTotalPieces(final BigDecimal pHouseTotalPieces) {
        this.houseTotalPieces = pHouseTotalPieces;
    }

    /**
     * Sets the <code>houseTotalWeight</code> property.
     * <p>
     * 
     * @param pHouseTotalWeight
     *            the current value of the <code>houseTotalWeight</code> property.
     */
    public void setHouseTotalWeight(final BigDecimal pHouseTotalWeight) {
        this.houseTotalWeight = pHouseTotalWeight;
    }

    /**
     * Sets the <code>houseUserId</code> property.
     * <p>
     * 
     * @param pHouseUserId
     *            the current value of the <code>houseUserId</code> property.
     */

    public void setHouseUserId(final String pHouseUserId) {
        this.houseUserId = pHouseUserId;
    }

    /**
     * Sets the <code>houseWeight</code> property.
     * <p>
     * 
     * @param pHouseWeight
     *            the current value of the <code>houseWeight</code> property.
     */
    public void setHouseWeight(final BigDecimal pHouseWeight) {
        this.houseWeight = pHouseWeight;
    }

    /**
     * Sets the <code>localTimeInchange</code> property.
     * <p>
     * 
     * @param pLocalTimeInchange
     *            the current value of the <code>localTimeInchange</code> property.
     */

    public void setLocalTimeInchange(final String pLocalTimeInchange) {
        this.localTimeInchange = pLocalTimeInchange;
    }

    /**
     * Sets the <code>masterAWBDataBaseKey</code> property.
     * <p>
     * 
     * @param pMasterAWBDataBaseKey
     *            the current value of the <code>masterAWBDataBaseKey</code> property.
     */

    public void setMasterAWBDataBaseKey(final String pMasterAWBDataBaseKey) {
        this.masterAWBDataBaseKey = pMasterAWBDataBaseKey;
    }

    /**
     * Sets the <code>masterCustomsStatus</code> property.
     * <p>
     * 
     * @param pMasterCustomsStatus
     *            the current value of the <code>masterCustomsStatus</code> property.
     */

    public void setMasterCustomsStatus(final String pMasterCustomsStatus) {
        this.masterCustomsStatus = pMasterCustomsStatus;
    }

    /**
     * Sets the <code>masterFlight</code> property.
     * <p>
     * 
     * @param pMasterFlight
     *            the current value of the <code>masterFlight</code> property.
     */
    public void setMasterFlight(final String pMasterFlight) {
        this.masterFlight = pMasterFlight;
    }

    /**
     * Sets the <code>masterGoodsStatus</code> property.
     * <p>
     * 
     * @param pMasterGoodsStatus
     *            the current value of the <code>masterGoodsStatus</code> property.
     */
    public void setMasterGoodsStatus(final String pMasterGoodsStatus) {
        this.masterGoodsStatus = pMasterGoodsStatus;
    }

    /**
     * Sets the <code>masterLocation</code> property.
     * <p>
     * 
     * @param pMasterLocation
     *            the current value of the <code>masterLocation</code> property.
     */
    public void setMasterLocation(final String pMasterLocation) {
        this.masterLocation = pMasterLocation;
    }

    /**
     * Sets the <code>masterPieces</code> property.
     * <p>
     * 
     * @param pMasterPieces
     *            the current value of the <code>masterPieces</code> property.
     */

    public void setMasterPieces(final BigDecimal pMasterPieces) {
        this.masterPieces = pMasterPieces;
    }

    /**
     * Sets the <code>masterStation</code> property.
     * <p>
     * 
     * @param pMasterStation
     *            the current value of the <code>masterStation</code> property.
     */
    public void setMasterStation(final String pMasterStation) {
        this.masterStation = pMasterStation;
    }

    /**
     * Sets the <code>masterWeight</code> property.
     * <p>
     * 
     * @param pMasterWeight
     *            the current value of the <code>masterWeight</code> property.
     */
    public void setMasterWeight(final BigDecimal pMasterWeight) {
        this.masterWeight = pMasterWeight;
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
     * Sets the <code>station</code> property.
     * <p>
     * 
     * @param pStation
     *            the current value of the <code>station</code> property.
     */

    public void setStation(final String pStation) {
        this.station = pStation;
    }

    /**
     * Sets the <code>status</code> property.
     * <p>
     * 
     * @param pStatus
     *            the current value of the <code>status</code> property.
     */

    public void setStatus(final String pStatus) {
        this.status = pStatus;
    }

    /**
     * Sets the <code>subCode</code> property.
     * <p>
     * 
     * @param pSubCode
     *            the current value of the <code>subCode</code> property.
     */
    public void setSubCode(final String pSubCode) {
        this.subCode = pSubCode;
    }

    /**
     * Sets the <code>userId</code> property.
     * <p>
     * 
     * @param pUserId
     *            the current value of the <code>userId</code> property.
     */

    public void setUserId(final String pUserId) {
        this.userId = pUserId;
    }

}
