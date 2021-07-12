/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>AirWaybillAdjustmentsResponse</code> is used for returning <code> AirWaybillAdjustments</code>
 * information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>interlineAgreementsDto</code>
 * <li><code>interlineAgreementsDtos</code>
 * </ul>
 */

public class AirWaybillAdjustmentsResponse extends AbstractResponse {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>airWaybillListDtos</code> property.
     */
    private List<AccountingAirWaybillListDto> airWaybillListDtos;

    /**
     * Attribute to hold <code>airWaybillDto</code> property.
     */
    private AccountingAirWaybillDto airWaybillDto;

    public List<AccountingAirWaybillListDto> getAirWaybillListDtos() {
        return this.airWaybillListDtos;
    }

    public void setAirWaybillListDtos(final List<AccountingAirWaybillListDto> pAirWaybillListDtos) {
        this.airWaybillListDtos = pAirWaybillListDtos;
    }

    public AccountingAirWaybillDto getAirWaybillDto() {
        return this.airWaybillDto;
    }

    public void setAirWaybillDto(final AccountingAirWaybillDto pAirWaybillDto) {
        this.airWaybillDto = pAirWaybillDto;
    }

    
}
