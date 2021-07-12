/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>OfficePersistRequest</code> holds all the information used for creating and updating the office
 * information.
 */

public class OfficePersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7295516312023711384L;

    /**
     * Attribute to hold the <code>office</code> property.
     * <p>
     * Holds the reference of the <code>OfficeDto</code> which holds the office information.
     */
    private OfficeDto office;

    /**
     * Attribute to hold the <code>QueueDtos</code> property.
     * <p>
     * Holds the reference of the <code>QueueDtos</code> which holds the Queue information.
     */
    private List<QueueDto> QueueDtos;

    /**
     * <code>Default constructor.</code>
     */
    public OfficePersistRequest() {

    }

    /**
     * Gets the <code>office</code> property.
     * <p>
     * Holds the reference of the <code>OfficeDto</code> which holds the office information.
     * <p>
     * 
     * @return the current value of the <code>office</code> property.
     */

    public OfficeDto getOffice() {
        return this.office;
    }

    /**
     * Sets the <code>office</code> property.
     * <p>
     * Holds the reference of the <code>OfficeDto</code> which holds the office information.
     * <p>
     * 
     * @param pOffice the value of the <code>office</code> property.
     */
    public void setOffice(final OfficeDto pOffice) {
        this.office = pOffice;
    }

    /**
     * @return the queueDtos
     */
    public List<QueueDto> getQueueDtos() {
        return QueueDtos;
    }

    /**
     * @param queueDtos the queueDtos to set
     */
    public void setQueueDtos(List<QueueDto> queueDtos) {
        QueueDtos = queueDtos;
    }

}
