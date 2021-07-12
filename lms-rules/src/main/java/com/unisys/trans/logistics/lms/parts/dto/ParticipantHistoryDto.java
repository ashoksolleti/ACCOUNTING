/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.BaseHistoryDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantCategoryType;

/**
 * <code>ParticipantHistoryDto</code> contains specific data applicable for maintaining history.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>displayString
 * <li>participantCreationDateTime
 * <li>newObject
 * <li>oldObject
 * <li>oId
 * <li>ParticipantCategoryType
 * </code>
 * </ul>
 */
public class ParticipantHistoryDto extends BaseHistoryDto {

   

    private Date participantCreationDateTime;

    private ParticipantCategoryType particicipantCategoryType;
    
    private String lmsDatabaseKey;


    private Object newObject;

  
    /**
     * @return the participantCreationDateTime
     */
    public Date getParticipantCreationDateTime() {
        return ContractUtility.getClonedDate(this.participantCreationDateTime);
    }

    /**
     * @param pParticipantCreationDateTime the participantCreationDateTime to set
     */
    public void setParticipantCreationDateTime(Date pParticipantCreationDateTime) {
        this.participantCreationDateTime = pParticipantCreationDateTime;
    }

    /**
     * @return the particicipantCategoryType
     */
    public ParticipantCategoryType getParticicipantCategoryType() {
        return this.particicipantCategoryType;
    }

    /**
     * @param pParticicipantCategoryType the particicipantCategoryType to set
     */
    public void setParticicipantCategoryType(ParticipantCategoryType pParticicipantCategoryType) {
        this.particicipantCategoryType = pParticicipantCategoryType;
    }

    /**
     * @return the newObject
     */
    public Object getNewObject() {
        return this.newObject;
    }

    /**
     * @param pNewObject the newObject to set
     */
    public void setNewObject(Object pNewObject) {
        this.newObject = pNewObject;
    }

    /**
     * @return the oId
     */
    public Long getoId() {
        return this.oId;
    }

    /**
     * @param pOId the oId to set
     */
    public void setoId(Long pOId) {
        this.oId = pOId;
    }

    /**
     * @return the oldObject
     */
    public Object getOldObject() {
        return this.oldObject;
    }

    /**
     * @param pOldObject the oldObject to set
     */
    public void setOldObject(Object pOldObject) {
        this.oldObject = pOldObject;
    }

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>History</code>. It is of type Long.<br>
     */
    private Long oId;

    private Object oldObject;

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

   

    /**
     * @return the lmsDatabaseKey
     */
    public String getLmsDatabaseKey() {
        return lmsDatabaseKey;
    }

    /**
     * @param lmsDatabaseKey the lmsDatabaseKey to set
     */
    public void setLmsDatabaseKey(String lmsDatabaseKey) {
        this.lmsDatabaseKey = lmsDatabaseKey;
    }

}
