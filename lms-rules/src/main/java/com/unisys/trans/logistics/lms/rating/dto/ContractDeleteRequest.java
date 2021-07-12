/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ContractDeleteRequest</code> is the request object to delete a Contract
 * Details Information.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>contractOId
 * </ul>
 * </code>
 */
public class ContractDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 9198070341184745437L;

    /**
     * Attribute to hold <code>contractOId</code> property.
     */
    private Long contractOId;

    /**
     * Attribute to hold the <code>contractNumber</code> property.
     */
    private String contractNumber;

    /**
     * Attribute to hold the <code>searchDate</code> property.
     */
    private Date searchDate;

    /**
     * Gets the <code>ContractOId</code> property.
     * 
     * 
     * @return the current value of the <code>ContractOId</code> property.
     */

    public Long getContractOId() {
        return this.contractOId;
    }

    /**
     * Sets the <code>ContractOId</code> property.
     * 
     * @param pContractOId
     *            the current value of the <code>ContractOId</code> property.
     */
    public void setContractOId(final Long pContractOId) {
        this.contractOId = pContractOId;
    }

    /**
     * Gets the <code>ContractNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-12 Alphanumeric Characters
     * <p>
     * <b>Example: </b><br>
     * FGRT31
     * <p>
     * 
     * @return the current value of the <code>ContractNumber</code> property.
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the <code>ContractNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-12 Alphanumeric Characters
     * <p>
     * <b>Example: </b><br>
     * FGRT31
     * <p>
     * 
     * @param pContractNumber
     *            the current value of the <code>ContractNumber</code> property.
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = ContractUtility
                .convertToUpperCase(contractNumber);
    }

    /**
     * Gets the <code>SearchDate</code> property.
     * 
     * @return the current value of the <code>SearchDate</code> property.
     */

    public Date getSearchDate() {
        return searchDate;
    }

    /**
     * Sets the <code>SearchDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pSearchDate
     *            the current value of the <code>searchDate</code> property.
     */
    public void setSearchDate(Date searchDate) {
        this.searchDate = ContractUtility.getClonedDate(searchDate);
    }

}
