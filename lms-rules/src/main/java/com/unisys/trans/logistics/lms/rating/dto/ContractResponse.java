//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>ContractResponse</code> contains the response of the maintenance
 * request received by <code>ContractService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>contractListEntries
 * <li>contract
 * <li>totalVersions
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.ContractListEntryDto
 */
public class ContractResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7657725991873797971L;

    /**
     * Attribute to hold <code>contract</code> property.
     */
    private ContractDto contract;
    
    private List<ContractDto> contractList;

    /**
     * Attribute to hold <code>contractListEntries</code> property.
     */
    private List<ContractListEntryDto> contractListEntries;
    private String contractCount;

    /**
     * Attribute to hold <code>totalVersions</code> property.
     */
    private int totalVersions;

    /**
     * Adds the <code>ContractListEntry</code> property.
     * 
     * @param pContractListEntryDto
     *            the new value of the <code>ContractListEntry</code> property.
     */

    public void addContractListEntry(final ContractListEntryDto pContractListEntryDto) {
        if (this.getContractListEntries() == null) {
            this.setContractListEntries(new ArrayList<ContractListEntryDto>());
        }
        this.getContractListEntries().add(pContractListEntryDto);
    }

    /**
     * Get the <code>contract</code> property.
     * <p>
     * 
     * @return the current value of the <code>contract</code> property.
     */
    public ContractDto getContract() {
        return this.contract;
    }

    /**
     * Get the list of<code>contractListEntries</code> property.
     * <p>
     * 
     * @return the current value of the <code>contractListEntries</code> property.
     */
    public List<ContractListEntryDto> getContractListEntries() {
        return this.contractListEntries;
    }

    /**
     * Get the <code>totalVersions</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalVersions</code> property.
     */
    public int getTotalVersions() {
        return this.totalVersions;
    }

    /**
     * Sets the <code>contract</code> property.
     * <p>
     * 
     * @param pContract
     *            the current value of the <code>contract</code> property.
     */
    public void setContract(final ContractDto pContract) {
        this.contract = pContract;
    }

    /**
     * Sets the <code>contractListEntries</code> property.
     * <p>
     * 
     * @param pContractListEntries
     *            the current value of the <code>contractListEntries</code> property.
     */
    public void setContractListEntries(final List<ContractListEntryDto> pContractListEntries) {
        this.contractListEntries = pContractListEntries;
    }

    /**
     * Sets the <code>totalVersions</code> property.
     * <p>
     * 
     * @param pTotalVersions
     *            the current value of the <code>totalVersions</code> property.
     */
    public void setTotalVersions(final int pTotalVersions) {
        this.totalVersions = pTotalVersions;
    }
    /**
     * Get the <code>contract</code> property.
     * <p>
     * 
     * @return the current value of the <code>contract</code> property.
     */
    public String getContractCount() {
        return this.contractCount;
    }

    /**
     * Sets the <code>pContractCount</code> property.
     * <p>
     * 
     * @param pContractCount
     *            the current value of the <code>contractCount</code> property.
     */
    public void setContractCount(final String pContractCount) {
        this.contractCount = pContractCount;
    }

    public List<ContractDto> getContractList() {
        return contractList;
    }

    public void setContractList(List<ContractDto> contractList) {
        this.contractList = contractList;
    }

}
