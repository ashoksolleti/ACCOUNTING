/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


import com.unisys.trans.logistics.lms.accounting.dto.constants.CategoryType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.EventType;
import com.unisys.trans.logistics.lms.framework.dto.BaseHistoryDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>HistoryDto</code> contains specific data applicable for maintaining history.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>userId
 * <li>stationCode
 * <li>officeCode
 * <li>timeStamp
 * <li>owner
 * <li>identifier
 * <li>category
 * <li>data
 * <li>status
 * </code>
 * </ul>
 */
public class AccountingHistoryDto extends BaseHistoryDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6572408453925674467L;

    private String additionalInfo;

    private Date awbCreationDate;

    /**
     * Attribute to hold <code>category</code> property.
     * <p>
     * Specifies the type for which the history information is recorded. The type indicates the Static Data,
     * AWB, etc.
     */
    private CategoryType category;

    private String displayString;

    private EventType event;

    private Object newObject;
    
    private String oldValue;
    
    private String newValue;
    
 private Date localtimeStamp;
    
    
    
	public Date getLocaltimeStamp() {
		return ContractUtility.getClonedDate(this.localtimeStamp);
	}

	public void setLocaltimeStamp(Date localtimeStamp) {
		this.localtimeStamp = localtimeStamp;
	}

	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}


	
    

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>History</code>. It is of type Long.<br>
     */
    private Long oId;

    private Object oldObject;

    /**
     * Attribute to hold <code>owner</code> property.
     * <p>
     * <code>owner</code> holds the information about the static data type.
     */
    private String owner;



    /**
     * Attribute to hold <code>airWaybillNumber</code> property.
     */
    private AirWaybillNumberDto airWaybillNumber;
    /**
     * <code>Default constructor. </code>
     */
    public AccountingHistoryDto() {

    }

    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    public Date getAwbCreationDate() {
        return ContractUtility.getClonedDate(this.awbCreationDate);
    }

    /**
     * Gets the <code>category</code> property.
     * <p>
     * Specifies the type for which the history information is recorded. The type indicates the Static Data,
     * AWB, etc.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * StaticData
     * <p>
     * 
     * @return the current value of <code>category</code> property.
     */
    public CategoryType getCategory() {
        return this.category;
    }

    public String getDisplayString() {
        return this.displayString;
    }

    /**
     * @return the event
     */
    public EventType getEvent() {
        return this.event;
    }

    /**
     * @return the newobject
     */
    public Object getNewObject() {
        return this.newObject;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * @return the oldobject
     */
    public Object getOldObject() {
        return this.oldObject;
    }

    /**
     * Gets the <code>owner</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * S - the owner is SpecialHandlingCode.
     * <p>
     * 
     * @return the current value of <code>owner</code> property.
     */
    public String getOwner() {
        return this.owner;
    }

  
    /**
     * Gets the <code>airWaybillNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWaybillNumber</code> property.
     */
    public AirWaybillNumberDto getAirWaybillNumber() {
        return this.airWaybillNumber;
    }

    public void setAdditionalInfo(final String pAdditionalInfo) {
        this.additionalInfo = pAdditionalInfo;
    }

    public void setAwbCreationDate(final Date pAwbCreationDate) {
        this.awbCreationDate = ContractUtility.getClonedDate(pAwbCreationDate);
    }

    /**
     * Sets the <code>category</code> property.
     * <p>
     * Specifies the type for which the history information is recorded. The type indicates the Static Data,
     * AWB, etc.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * 
     * @param pCategory the new value of <code>category</code> property.
     */
    public void setCategory(final CategoryType pCategory) {
        this.category = pCategory;
    }

    public void setDisplayString(final String pDisplayString) {
        this.displayString = pDisplayString;
    }

    /**
     * @param event the event to set
     */
    public void setEvent(final EventType pEvent) {
        this.event = pEvent;
    }

    /**
     * @param newobject the newobject to set
     */
    public void setNewobject(final Object pNewobject) {
        this.newObject = pNewobject;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * @param oldobject the oldobject to set
     */
    public void setOldobject(final Object pOldobject) {
        this.oldObject = pOldobject;
    }

    /**
     * Sets the<code>owner</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * S - the owner is SpecialHandlingCode.
     * <p>
     * 
     * @param pOwner the new value of <code>owner</code> property.
     */
    public void setOwner(final String pOwner) {
        this.owner = pOwner;
    }

   
    /**
     * Sets the <code>airWaybillNumber</code>.
     * <p>
     * 
     * @param pAirWaybillNumber
     *            holds the new value of <code>airWaybillNumber</code>
     */
    public void setAirWaybillNumber(final AirWaybillNumberDto pAirWaybillNumber) {
        this.airWaybillNumber = pAirWaybillNumber;
    }

}
