//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.framework.dto.ContactDto;

/**
 * <code>SpotRateResponse</code> contains the response of the maintenance
 * request received by <code>SpotRateService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>contactDto
 * <li>spotRateDto
 * <li>spotRateListEntryDtos
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.ContactDto
 * @see com.unisys.trans.logistics.lms.rating.dto.SpotRateDto
 * @see com.unisys.trans.logistics.lms.rating.dto.SpotRateListEntryDto
 */

public class SpotRateResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5400533249850551461L;

    /**
     * Attribute to hold <code>contactDto</code> property.
     */
    private ContactDto contactDto;

    /**
     * Attribute to hold <code>spotRateDto</code> property.
     */
    private SpotRateDto spotRateDto;

    /**
     * Attribute to hold <code>spotRateListEntryDtos</code> property.
     */
    private List<SpotRateListEntryDto> spotRateListEntryDtos;

    /**
     * Attribute to hold <code>rerateAwb</code> property.
     */
    private boolean rerateAwb;

    private boolean sraQueued;
    private boolean userAuthorization;
    /**
     * Gets the <code>rerateAwb</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>rerateAwb</code> property.
     */
    public boolean isRerateAwb() {
        return this.rerateAwb;
    }

    /**
     * Sets the <code>rerateAwb</code> property.
     * <p>
     * 
     * @param pRerateAwb
     *            the current value of the <code>rerateAwb</code> property.
     */
    public void setRerateAwb(final boolean pRerateAwb) {
        this.rerateAwb = pRerateAwb;
    }

    /**
     * Get the <code>contactDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>contactDto</code> property.
     */
    public ContactDto getContactDto() {
        return this.contactDto;
    }

    /**
     * Get the <code>SpotRateDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>spotRateDto</code> property.
     */
    public SpotRateDto getSpotRateDto() {
        return this.spotRateDto;
    }

    /**
     * Get the <code>SpotRateListEntryDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>spotRateListEntryDtos</code> property.
     */
    public List<SpotRateListEntryDto> getSpotRateListEntryDtos() {
        return this.spotRateListEntryDtos;
    }

    /**
     * Sets the <code>contactDto</code> property.
     * <p>
     * 
     * @param pContactDto
     *            the current value of the <code>contactDto</code> property.
     */
    public void setContactDto(final ContactDto pContactDto) {
        this.contactDto = pContactDto;
    }

    /**
     * Sets the <code>SpotRateDto</code> property.
     * <p>
     * 
     * @param pSpotRateDto
     *            the current value of the <code>SpotRateDto</code> property.
     */
    public void setSpotRateDto(final SpotRateDto pSpotRateDto) {
        this.spotRateDto = pSpotRateDto;
    }

    /**
     * Sets the <code>SpotRateListEntryDtos</code> property.
     * <p>
     * 
     * @param pSpotRateListEntryDtos
     *            the current value of the <code>SpotRateListEntryDtos</code> property.
     */
    public void setSpotRateListEntryDtos(
                final List<SpotRateListEntryDto> pSpotRateListEntryDtos) {
        this.spotRateListEntryDtos = pSpotRateListEntryDtos;
    }
    //SRA QUEUE AUTHORIZATION PARAMETER
	public boolean getSraQueued() 
	{
		return this.sraQueued;
	}

	public void setSraQueued(boolean pSraQueued) {
		this.sraQueued = pSraQueued;
		
	}
	
	//USER AUTHORIZATION PARAMETER
	public boolean getUserAuthorization() {
		return this.userAuthorization;
	}

	public void setUserAuthorization(boolean pUserAuthorization) {
		this.userAuthorization = pUserAuthorization;
	}
}
