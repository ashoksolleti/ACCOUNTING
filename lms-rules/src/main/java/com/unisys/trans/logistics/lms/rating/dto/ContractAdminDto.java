/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.ContactDto;
import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ContractAdminDto</code> class contain information specific to a ContractAdmin.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>contactDto
 * <li>contractNumber
 * <li>contractRateAdminDto
 * <li>dateRangeDto
 * <li>participantAccountNumber
 * <li>selectionDate
 * </code>
 * </ul>
 */
public class ContractAdminDto extends PersistenceObjectDto {

    /**
     * Serial Version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>contactDto</code> property.
     */
    private ContactDto contactDto;

    /**
     * Attribute to hold <code>contractNumber</code> property.
     */
    private String contractNumber;

    /**
     * Attribute to hold <code>contractRateAdminDto</code> property.
     */
    private List<ContractRateAdminDto> contractRateAdminDto;

    /**
     * Attribute to hold <code>dateRangeDto</code> property.
     */
    private DateRangeDto dateRangeDto;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>participantAccountNumber</code> property.
     */
    private String participantAccountNumber;

    /**
     * Attribute to hold <code>selectionDate</code> property.
     */
    private Date selectionDate;
    
    /**
     * Attribute to hold <code>participantGroupInd</code> property.
     */
    private boolean participantGroupInd;

    /**
     * Gets the contact details.
     * <p>
     * 
     * @return contactDto
     * 
     */
    public ContactDto getContactDto() {
        if (this.contactDto == null) {
            this.contactDto = new ContactDto();
        }
        return contactDto;
    }

    /**
     * Gets the <code>contractNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>contractNumber</code> property.
     */
    public String getContractNumber() {
        return this.contractNumber;
    }

    /**
     * Gets the <code>contractRateAdminList</code> property.
     * <p>
     * 
     * @return the current value of the <code>contractRateAdminList</code> property.
     */
    public List<ContractRateAdminDto> getContractRateAdminDto() {
        if (this.contractRateAdminDto == null) {
            this.contractRateAdminDto = new ArrayList<ContractRateAdminDto>();
        }
        return this.contractRateAdminDto;
    }

    /**
     * Gets the <code>dateRange</code> property.
     * <p>
     * 
     * @return the current value of the <code>dateRange</code> property.
     */
    public DateRangeDto getDateRangeDto() {
        if (this.dateRangeDto == null) {
            this.dateRangeDto = new DateRangeDto();
        }
        return this.dateRangeDto;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>participantAccountNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantAccountNumber</code> property.
     */
    public String getParticipantAccountNumber() {
        return this.participantAccountNumber;
    }

    /**
     * Gets the <code>selectionDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>selectionDate</code> property.
     */
    public Date getSelectionDate() {
        return ContractUtility.getClonedDate(this.selectionDate);
    }

    /**
     * Sets the <code>ContactDto</code> property.
     * <p>
     * 
     * @param pContactDto
     *            the new value of the <code>ContactDto</code> property.
     */
    public void setContactDto(final ContactDto pContactDto) {
        this.contactDto = pContactDto;
    }

    /**
     * Sets the <code>ContractNumber</code> property.
     * <p>
     * 
     * @param pContractNumber
     *            the new value of the <code>ContractNumber</code> property.
     */
    public void setContractNumber(final String pContractNumber) {
        this.contractNumber = ContractUtility
                    .convertToUpperCase(pContractNumber);
    }

    /**
     * Sets the <code>ContractRateAdminDto</code> property.
     * <p>
     * 
     * @param pContractRateAdminDto
     *            the new value of the <code>ContractRateAdminDto</code> property.
     */
    public void setContractRateAdminDto(
                final List<ContractRateAdminDto> pContractRateAdminDto) {
        this.contractRateAdminDto = pContractRateAdminDto;
    }

    /**
     * Sets the <code>DateRangeDto</code> property.
     * <p>
     * 
     * @param pDateRangeDto
     *            the new value of the <code>DateRangeDto</code> property.
     */
    public void setDateRangeDto(final DateRangeDto pDateRangeDto) {
        this.dateRangeDto = pDateRangeDto;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>participantAccountNumber</code> property.
     * <p>
     * 
     * @param pParticipantAccountNumber
     *            the new value of the <code>participantAccountNumber</code> property.
     */
    public void setParticipantAccountNumber(
                final String pParticipantAccountNumber) {
        this.participantAccountNumber = ContractUtility
                    .convertToUpperCase(pParticipantAccountNumber);
    }

    /**
     * Sets the <code>SelectionDate</code> property.
     * <p>
     * 
     * @param pSelectionDate
     *            the new value of the <code>SelectionDate</code> property.
     */
    public void setSelectionDate(final Date pSelectionDate) {
        this.selectionDate = ContractUtility.getClonedDate(pSelectionDate);
    }

    /**
     * Gets the <code>participantGroupInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantGroupInd</code> property.
     */
    public boolean getParticipantGroupInd() {
        return this.participantGroupInd;
    }

    /**
     * Sets the <code>participantGroupInd</code> property.
     * <p>
     * 
     * @param pParticipantGroupInd
     *            the new value of the <code>participantGroupInd</code> property.
     */
    public void setParticipantGroupInd(final boolean pParticipantGroupInd) {
        this.participantGroupInd = pParticipantGroupInd;
    }

}
