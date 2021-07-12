/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <code>OfficeQueueResponse</code> represents the response object of the
 * request received by office queue service.
 * <p>
 * <code>OfficeQueueResponse</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>officeQueueDtos
 * </code>
 * </ul>
 */
public class OfficeQueueResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5088480546020275599L;

    /**
     * Attribute to hold <code>officeQueueDtos</code> property.
     */
    private List<OfficeQueueDto> officeQueueDtos;

    /**
     * Attribute to hold <code>officeQueueItemDto</code> property.
     */
    private OfficeQueueItemDto officeQueueItemDto;

    /**
     * Attribute to hold <code>QueueDto</code> property.
     */
    private List<QueueDto> queueDtos;
    
    private Map<String, List<OfficeQueueItemDto>> queueAndQueueItem;
    
    /**
     * Attribute to hold <code>officeQueueItemDtos</code> property.
     */
    private List<OfficeQueueItemDto> officeQueueItemDtos;

    public List<OfficeQueueItemDto> getOfficeQueueItemDtos() {
		return officeQueueItemDtos;
	}


	public void setOfficeQueueItemDtos(List<OfficeQueueItemDto> officeQueueItemDtos) {
		this.officeQueueItemDtos = officeQueueItemDtos;
	}


	/**
     * <code>Default constructor.</code>
     */
    public OfficeQueueResponse() {
    }

    
    public Map<String, List<OfficeQueueItemDto>> getQueueAndQueueItem() {
        return queueAndQueueItem;
    }

    public void setQueueAndQueueItem(Map<String, List<OfficeQueueItemDto>> pQueueAndQueueItem) {
        this.queueAndQueueItem = pQueueAndQueueItem;
    }

    /**
     * Gets the <code>officeQueueDtos</code> property.
     * <p>
     * It holds the specific data applicable to an OfficeQueue.
     * <p>
     * 
     * @return the current value of <code>officeQueueDtos</code> property.
     */
    public List<OfficeQueueDto> getOfficeQueueDtos() {

        if (this.officeQueueDtos == null) {
            this.officeQueueDtos = new ArrayList<OfficeQueueDto>();
        }
        return this.officeQueueDtos;

    }

    /**
     * Gets the <code>officeQueueItemDto</code> property.
     * <p>
     * It holds the specific data applicable to an officeQueueItemDto.
     * <p>
     * 
     * @return the current value of <code>officeQueueItemDto</code> property.
     */
    public OfficeQueueItemDto getOfficeQueueItemDto() {
        return this.officeQueueItemDto;
    }

    /**
     * Sets the <code>officeQueueDtos</code> property.
     * <p>
     * It holds the specific data applicable to an OfficeQueue.
     * <p>
     * 
     * @param pOfficeQueueDto
     *            the new value of <code>officeQueueDtos</code> property.<br>
     */
    public void setOfficeQueueDtos(final List<OfficeQueueDto> pOfficeQueueDto) {
        this.officeQueueDtos = pOfficeQueueDto;
    }

    /**
     * Sets the <code>officeQueueItemDto</code> property.
     * <p>
     * It holds the specific data applicable to an OfficeQueueItemDto.
     * <p>
     * 
     * @param pOfficeQueueItemDto
     *            the new value of <code>officeQueueItemDto</code> property.<br>
     */
    public void setOfficeQueueItemDto(
                final OfficeQueueItemDto pOfficeQueueItemDto) {
        this.officeQueueItemDto = pOfficeQueueItemDto;
    }

    /**
     * @return the queueDtos
     */
    public List<QueueDto> getQueueDtos() {
        return queueDtos;
    }

    /**
     * @param queueDtos the queueDtos to set
     */
    public void setQueueDtos(List<QueueDto> queueDtos) {
        this.queueDtos = queueDtos;
    }
}