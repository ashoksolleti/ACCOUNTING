/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>AccountingAwbInformationFindRequest</code> is used for retrieving
 * <code> Air waybill information</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>AirWaybillNumberDto</code>
 * <li><code>currencyCodeType</code>
 * <li><code>awbOid</code>
 * 
 * </ul>
 */
public class AirwaybillAdjustmentsFindRequest extends AbstractRequest {
    /**
     * 
     */
    private static final long serialVersionUID = 8732223616831917121L;

    /**
     * Attribute to hold <code>interlineAgreementsFindDto</code> property.
     */
    private AdjustmentsFindDto adjustmentsFindDto;

    public AdjustmentsFindDto getAdjustmentsFindDto() {
        return this.adjustmentsFindDto;
    }

    public void setAdjustmentsFindDto(final AdjustmentsFindDto pAdjustmentsFindDto) {
        this.adjustmentsFindDto = pAdjustmentsFindDto;
    }

}
