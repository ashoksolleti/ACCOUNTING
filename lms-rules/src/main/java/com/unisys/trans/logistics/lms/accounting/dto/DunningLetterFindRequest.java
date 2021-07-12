/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
/**
 * @author SaifAhmad
 */

package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>GHAAgreementInformationFindRequest</code> contains all the attributes
 * which are required for processing the retrieve request from user.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>serialVersionUID 
 * <li>gHAAgreementDto 
 * <li>gHAAgreementSlidingRatesDto
 * </code>
 * </ul>
 * 
 */

public class DunningLetterFindRequest extends AbstractRequest
{

    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>dunningLetterDto</code> property.
     */
    private DunningLettersDto dunningLetterDto;

    /**
     * Attribute to hold <code>groupNameFind</code> property.
     */
    private String groupNameFind = "G";

    /**
     * Attribute to hold <code>participantGroupDtos</code> property.
     */
    private List<String> participantGroupDtos;

    /**
     * Gets the <code>participantGroupDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantGroupDtos</code> property.
     */
    public List<String> getParticipantGroupDtos() {
        return this.participantGroupDtos;
    }

    /**
     * Sets the <code>pParticipantGroupDtos</code>.
     * <p>
     * 
     * @param pParticipantGroupDtos
     *            holds the new value of <code>participantGroupDtos</code>
     */
    public void setParticipantGroupDtos(final List<String> pParticipantGroupDtos) {
        this.participantGroupDtos = pParticipantGroupDtos;
    }

    /**
     * Gets the <code>groupNameFind</code> property.
     * <p>
     * 
     * @return the current value of the <code>groupNameFind</code> property.
     */
    public String getGroupNameFind() {
        return this.groupNameFind;
    }

    /**
     * Sets the <code>pGroupNameFind</code>.
     * <p>
     * 
     * @param pGroupNameFind
     *            holds the new value of <code>groupNameFind</code>
     */
    public void setGroupNameFind(final String pGroupNameFind) {
        this.groupNameFind = pGroupNameFind;
    }

    /**
     * Gets the <code>dunningLetterDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>dunningLetterDto</code> property.
     */
    public DunningLettersDto getDunningLetterDto() {
        return this.dunningLetterDto;
    }

    /**
     * Sets the <code>pDunningLetterDto</code>.
     * <p>
     * 
     * @param pDunningLetterDto
     *            holds the new value of <code>dunningLetterDto</code>
     */
    public void setDunningLetterDto(final DunningLettersDto pDunningLetterDto) {
        this.dunningLetterDto = pDunningLetterDto;
    }

}
