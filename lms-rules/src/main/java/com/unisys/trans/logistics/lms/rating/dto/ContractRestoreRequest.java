/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ContractRestoreRequest</code> is the request object to restore a Contract Details Information.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>contractOId
 * </ul>
 * </code>
 */
public class ContractRestoreRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6097708294416711734L;

    /**
     * Attribute to hold <code>contractOId</code> property.
     */
    private ContractDto contractDto;

    /**
     * Gets the <code>ContractOId</code> property.
     * 
     * 
     * @return the current value of the <code>ContractOId</code> property.
     */
    public ContractDto getContractDto() {
        return this.contractDto;
    }

    /**
     * Sets the <code>ContractOId</code> property.
     * 
     * @param pContractDto
     *            the current value of the <code>ContractOId</code> property.
     */

    public void setContractDto(final ContractDto pContractDto) {
        this.contractDto = pContractDto;
    }
}
