/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto;

/**
 * <code>AirWaybillResponse</code> contains the response of the
 * AirWaybillPersistRequest of AirWaybillFindRequest received by <code>AirWaybillLoadServioce</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>AirWaybillDto</code>
 * <li><code>batchErrorMessages</code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillResponse
 */

public class AccountingAirWaybillResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>airWaybillDtos</code> property.
     */
    // private List<AccountingAirWaybillDto> airWaybillDtos;
    /**
     * Attribute to hold <code>airWaybillListDtos</code> property.
     */
    private List<AccountingAirWaybillListDto> airWaybillListDtos;

    public List<AccountingAirWaybillListDto> getAirWaybillListDtos() {
        return this.airWaybillListDtos;
    }

    public void setAirWaybillListDtos(final List<AccountingAirWaybillListDto> pAirWaybillListDtos) {
        this.airWaybillListDtos = pAirWaybillListDtos;
    }

    /**
     * Attribute to hold <code>airWaybillDto</code> property.
     */
    private AccountingAirWaybillDto airWaybillDto;

    private List<AccountingAirWaybillDto> accountingAirWaybillDtos;

    /**
     * Attribute to hold <code>batchErrorMessages</code> property.
     */
    private String batchErrorMessages;
    
    private boolean notAuthorizedIndicator;
    
    private Long oidToReteriveRevenue;
    
    private Map<GSAAgreementDto, List<AccountingAirWaybillDto>> listOfAWB;
    
    private Map<Long,SlidingScaleEntryDto> slidingScaleEntryMap;
    
    private Map<Long,SlidingScaleEntryDto> slidingScaleAWBEntryMap;
    
    

    
	public Map<Long, SlidingScaleEntryDto> getSlidingScaleAWBEntryMap() {
		return slidingScaleAWBEntryMap;
	}

	public void setSlidingScaleAWBEntryMap(Map<Long, SlidingScaleEntryDto> slidingScaleAWBEntryMap) {
		this.slidingScaleAWBEntryMap = slidingScaleAWBEntryMap;
	}

	public Map<Long, SlidingScaleEntryDto> getSlidingScaleEntryMap() {
		return slidingScaleEntryMap;
	}

	public void setSlidingScaleEntryMap(Map<Long, SlidingScaleEntryDto> slidingScaleEntryMap) {
		this.slidingScaleEntryMap = slidingScaleEntryMap;
	}

	/**
     * Gets the <code>airWaybillDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWaybillDtos</code> property.
     */
    /*
     * public List<AccountingAirWaybillDto> getAirWaybillDtos() {
     * return this.airWaybillDtos;
     * }
     */

    
	public Map<GSAAgreementDto, List<AccountingAirWaybillDto>> getListOfAWB() {
		return listOfAWB;
	}

	public void setListOfAWB(Map<GSAAgreementDto, List<AccountingAirWaybillDto>> listOfAWB) {
		this.listOfAWB = listOfAWB;
	}

	/**
     * Sets the <code>airWaybillDtos</code>.
     * <p>
     * 
     * @param pAirWaybillDtos
     *            holds the new value of <code>airWaybillDtos</code>
     */
    /*
     * public void setAirWaybillDtos(
     * final List<AccountingAirWaybillDto> pAirWaybillDtos) {
     * this.airWaybillDtos = pAirWaybillDtos;
     * }
     */


	public Long getOidToReteriveRevenue() {
		return oidToReteriveRevenue;
	}

	public void setOidToReteriveRevenue(Long oidToReteriveRevenue) {
		this.oidToReteriveRevenue = oidToReteriveRevenue;
	}

    /**
     * Gets the <code>airWaybillDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWaybillDtos</code> property.
     */
    public AccountingAirWaybillDto getAirWaybillDto() {
        return this.airWaybillDto;
    }

    /**
     * Sets the <code>airWaybillDto</code>.
     * <p>
     * 
     * @param pAirWaybillDto
     *            holds the new value of <code>airWaybillDto</code>
     */
    public void setAirWaybillDto(final AccountingAirWaybillDto pAirWaybillDto) {
        this.airWaybillDto = pAirWaybillDto;
    }

    /**
     * Gets the <code>batchErrorMessages</code> property.
     * <p>
     * 
     * @return the current value of the <code>batchErrorMessages</code> property.
     */
    public String getBatchErrorMessages() {
        return this.batchErrorMessages;
    }

    /**
     * Sets the <code>batchErrorMessages</code>.
     * <p>
     * 
     * @param pBatchErrorMessages
     *            holds the new value of <code>batchErrorMessages</code>
     */
    public void setBatchErrorMessages(final String pBatchErrorMessages) {
        this.batchErrorMessages = pBatchErrorMessages;
    }

    public List<AccountingAirWaybillDto> getAccountingAirWaybillDtos() {
        return this.accountingAirWaybillDtos;
    }

    public void setAccountingAirWaybillDtos(final List<AccountingAirWaybillDto> pAccountingAirWaybillDtos) {
        this.accountingAirWaybillDtos = pAccountingAirWaybillDtos;
    }

    /**
     * Attribute to hold <code>participantSearchDto</code> property.
     */
    private List<ParticipantSearchDto> participantSearchDtos;

    /**
     * Gets the <code>accountingparticipants</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantSearchDto</code> property.
     */
    public List<ParticipantSearchDto> getParticipantSearchDtos() {
        return this.participantSearchDtos;
    }

    /**
     * Gets the <code>accountingparticipants</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantSearchDto</code> property.
     */

    public void setParticipantSearchDtos(final List<ParticipantSearchDto> pParticipantSearchDtos) {
        this.participantSearchDtos = pParticipantSearchDtos;
    }
    
    

    public boolean isNotAuthorizedIndicator() {
		return notAuthorizedIndicator;
	}

	public void setNotAuthorizedIndicator(boolean notAuthorizedIndicator) {
		this.notAuthorizedIndicator = notAuthorizedIndicator;
	}

}
