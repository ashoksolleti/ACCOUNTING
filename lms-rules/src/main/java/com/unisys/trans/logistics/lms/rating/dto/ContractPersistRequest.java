/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ContractPersistRequest</code> class represents the request to create/update contract information
 * details.
 * <p>
 * <code>ContractPersistRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>contractDto
 * </code>
 * </ul>
 */

public class ContractPersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 951211532710719831L;

    /**
     * Attribute to hold <code>contractDto</code> object.
     */
    private ContractDto contractDto;

    /**
     * Gets the <code>ContractDto </code> data transfer object.
     * <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *         ContractDto}</code><br>
     *         the current value of <code>contractDto</code> data transfer
     *         object.<br>
     */

    public ContractDto getContractDto() {
        return this.contractDto;
    }

    /**
     * Sets the <code>ContractDto</code> data transfer object.
     * <p>
     * 
     * @param pContractDto
     *            holds the new value of <code>contractDto</code> data
     *            transfer object.<br>
     */
    public void setContractDto(final ContractDto pContractDto) {
        this.contractDto = pContractDto;
    }

}
