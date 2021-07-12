package com.unisys.trans.logistics.lms.parts.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantCategoryType;

public class ParticipantHistoryChangeDetailsDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = 5864035093233499922L;
    
    private String lmsDatabaseKey;
    
    private String displayString;
    
    private String displayValue;
    
    private ParticipantCategoryType participantCategoryType;
    
    private Long OId;
    
    private Date participantCreationDateTime;
    
    private Date localDateTime;
    
    private String OLDMSgStringData;
    
    private String NewMSgStringData;
    
    private String stationCode;
    
    private String userId;
    
    private Date gmtDateTime;
    
    
    private boolean strValueInd;
   
    /**
     * @return the lmsDatabaseKey
     */
    public String getLmsDatabaseKey() {
        return this.lmsDatabaseKey;
    }

    /**
     * @param pLmsDatabaseKey the lmsDatabaseKey to set
     */
    public void setLmsDatabaseKey(final String pLmsDatabaseKey) {
        this.lmsDatabaseKey = pLmsDatabaseKey;
    }

    /**
     * @return the displayString
     */
    public String getDisplayString() {
        return this.displayString;
    }

    /**
     * @param pDisplayString the displayString to set
     */
    public void setDisplayString(final String pDisplayString) {
        this.displayString = pDisplayString;
    }

    /**
     * @return the participantCategoryType
     */
    public ParticipantCategoryType getParticipantCategoryType() {
        return this.participantCategoryType;
    }

    /**
     * @param pParticipantCategoryType the participantCategoryType to set
     */
    public void setParticipantCategoryType(final ParticipantCategoryType pParticipantCategoryType) {
        this.participantCategoryType = pParticipantCategoryType;
    }

    /**
     * @return the participantCreationDateTime
     */
    public Date getParticipantCreationDateTime() {
        return this.participantCreationDateTime;
    }

    /**
     * @param pParticipantCreationDateTime the participantCreationDateTime to set
     */
    public void setParticipantCreationDateTime(final Date pParticipantCreationDateTime) {
        this.participantCreationDateTime = pParticipantCreationDateTime;
    }

    /**
     * @return the localDateTime
     */
    public Date getLocalDateTime() {
        return this.localDateTime;
    }

    /**
     * @param pLocalDateTime the localDateTime to set
     */
    public void setLocalDateTime(final Date pLocalDateTime) {
        this.localDateTime = pLocalDateTime;
    }

    /**
     * @return the oLDMSgStringData
     */
    public String getOLDMSgStringData() {
        return this.OLDMSgStringData;
    }

    /**
     * @param pOLDMSgStringData the oLDMSgStringData to set
     */
    public void setOLDMSgStringData(final String pOLDMSgStringData) {
        this.OLDMSgStringData = pOLDMSgStringData;
    }

    /**
     * @return the newMSgStringData
     */
    public String getNewMSgStringData() {
        return this.NewMSgStringData;
    }

    /**
     * @param pNewMSgStringData the newMSgStringData to set
     */
    public void setNewMSgStringData(final String pNewMSgStringData) {
        this.NewMSgStringData = pNewMSgStringData;
    }

    /**
     * @return the stationCode
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * @param pStationCode the stationCode to set
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = pStationCode;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param pUserId the userId to set
     */
    public void setUserId(final String pUserId) {
        this.userId = pUserId;
    }

    /**
     * @return the gmtDateTime
     */
    public Date getGmtDateTime() {
        return this.gmtDateTime;
    }

    /**
     * @param pGmtDateTime the gmtDateTime to set
     */
    public void setGmtDateTime(final Date pGmtDateTime) {
        this.gmtDateTime = pGmtDateTime;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @param oId the oId to set
     */
    public void setOId(Long oId) {
        this.OId = oId;
    }
    
    public ParticipantHistoryChangeDetailsDto()
    {
        
    }

    /**
     * @return the displayValue
     */
    public String getDisplayValue() {
        return displayValue;
    }

    /**
     * @param displayValue the displayValue to set
     */
    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    /**
     * @return the strValueInd
     */
    public boolean isStrValueInd() {
        return strValueInd;
    }

    /**
     * @param strValueInd the strValueInd to set
     */
    public void setStrValueInd(boolean strValueInd) {
        this.strValueInd = strValueInd;
    }

}
