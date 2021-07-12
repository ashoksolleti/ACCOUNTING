/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>OfficeQueueDto</code> holds all the attributes that are associated to a Office Queue.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>oId
 * <li>itemsCount
 * <li>officeQueueItemDtos
 * <li>queueDto
 * <li>queueOfficeDto
 * </code>
 * </ul>
 */
public class OfficeQueueDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1530068234222571998L;

    /**
     * Attribute to hold <code>itemsCount</code> property.
     */
    private Integer itemsCount;

    /**
     * Attribute to hold <code>functionName</code> property.
     */
    private String functionName;

    /**
     * Attribute to hold <code>officeQueueItemDtos</code> property.
     */
    private List<OfficeQueueItemDto> officeQueueItemDtos;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>queueDto</code> property.
     * <p>
     * Specifies the queue<br>
     */
    private QueueDto queueDto;

    /**
     * Attribute to hold <code>queueOfficeDto</code> property.
     * <p>
     * Specifies Name of the queue from which the queue items are retrieved.
     */
    private OfficeDto queueOfficeDto;

    /**
     * <code>Default constructor. </code>
     */
    public OfficeQueueDto() {
    }

    /**
     * Gets the <code>itemsCount</code> property.
     * <p>
     * itemsCount specifies the number of items to be retrieved from the OfficeQueue.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 2
     * <p>
     * 
     * @return the current value of <code>itemsCount</code> property.<br>
     */
    public Integer getItemsCount() {
        return this.itemsCount;
    }

    /**
     * Gets the <code>functionName</code> property.
     * <p>
     * functionName specifies the type of the Object in officequeue.
     * <p>
     * 
     * @return the current value of <code>functionName</code> property.<br>
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * Gets the <code>officeQueueItemDtos</code> property.
     * <p>
     * The list of OfficeQueueItemDto holds the specific data applicable to an office queue item.
     * <p>
     * 
     * @return the current value of <code>officeQueueItemDtos</code> property.<br>
     */
    public List<OfficeQueueItemDto> getOfficeQueueItemDtos() {
        if (this.officeQueueItemDtos == null) {
            this.officeQueueItemDtos = new ArrayList<OfficeQueueItemDto>();
        }
        return this.officeQueueItemDtos;
    }

    /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>queueDto</code> property.
     * <p>
     * It specifies the particular name of Queue.
     * 
     * @return the current value of <code>queueDto</code> property.<br>
     */
    public QueueDto getQueueDto() {

        if (this.queueDto == null) {
            this.queueDto = new QueueDto();
        }
        return this.queueDto;
    }

    /**
     * Gets the <code>queueOfficeDto</code> property.
     * <p>
     * The queueOffice attribute specifies the particular Queue office having the required queues.
     * 
     * @return the current value of <code>queueOfficeDto</code> property.<br>
     */
    public OfficeDto getQueueOfficeDto() {

        if (this.queueOfficeDto == null) {
            this.queueOfficeDto = new OfficeDto();
        }
        return this.queueOfficeDto;
    }

    /**
     * Sets the <code>itemsCount</code> property.
     * <p>
     * ItemsCount specifies the number of items to be retrieved from the OfficeQueue.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 2
     * <p>
     * 
     * @param pItemsCount the new value of <code>itemCount</code> property.<br>
     */
    public void setItemsCount(final Integer pItemsCount) {
        this.itemsCount = pItemsCount;
    }

    /**
     * Sets the <code>functionName</code> property.
     * <p>
     * functionName specifies the type of the Object in officequeue.
     * <p>
     * 
     * @param pFunctionName the new value of <code>functionName</code> property.<br>
     */
    public void setFunctionName(final String pFunctionName) {
        this.functionName = pFunctionName;
    }

    /**
     * Sets the <code>officeQueueItems</code> property.
     * <p>
     * The list of OfficeQueueItemDto holds the specific data applicable to an office queue item.
     * 
     * @param pOfficeQueueItemsDtos the new value of <code>officeQueueItems</code> property.<br>
     */
    public void setOfficeQueueItemDtos(final List<OfficeQueueItemDto> pOfficeQueueItemsDtos) {
        this.officeQueueItemDtos = pOfficeQueueItemsDtos;
    }

    /**
     * Sets the <code>oId</code> property.
     * 
     * @param pOId the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>queueDto</code> property.
     * <p>
     * It specifies the particular name of Queue.
     * 
     * @param pQueueDto the new value of <code>queueDto</code> property.<br>
     */
    public void setQueueDto(final QueueDto pQueueDto) {
        this.queueDto = pQueueDto;
    }

    /**
     * Sets the <code>queueOfficeDto</code> property.
     * <p>
     * The queueOffice attribute specifies the particular Queue office having the required queues.
     * 
     * @param pQueueOfficeDto the new value of <code>queueOfficeDto</code> property.<br>
     */
    public void setQueueOfficeDto(final OfficeDto pQueueOfficeDto) {
        this.queueOfficeDto = pQueueOfficeDto;
    }
    
	/**
     * Creates the String representation of <code>OfficeQueue</code>.
     * <p>
     * This will return the String representation based on Queue Information.
     * <p>
     * 
     * @return the String representation of <code>Queue</code>.
     */
    public String toString() {
    	final StringBuffer csvString = new StringBuffer();
        final String aCOMMA = ",";
    	csvString.append(replaceNullValue(this.queueDto.getName()));
    	csvString.append(aCOMMA);
    	csvString.append(this.getItemsCount().intValue());
    	csvString.append(aCOMMA);
    	csvString.append(replaceNullValue(this.queueDto.getQueueRestrictionType()));
        return csvString.toString();

    }

	private String replaceNullValue(String name) {
		return (name != null) ? name: "";
	}
}