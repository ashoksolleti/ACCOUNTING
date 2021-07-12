/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>TariffRateAdminResponse</code> contains the response of the maintenance request received by
 * <code>GlobalRatesAdminService</code>.
 * <p>
 * <ul>
 * <li><code>tariffAdminRateDtos</code></li>
 * </ul>
 */
public class TariffRateAdminResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6480916955187977237L;

    /**
     * Attribute to hold <code>tariffAdminRateDtos</code> property. The tariff rate admin data transfer object
     * which holds the
     * tariff rate administration tasks information that needs to be returned to client.
     */
    private List<TariffRateAdminDto> tariffRateAdminDtos;

    /**
     * <code>Default constructor.</code>
     */
    public TariffRateAdminResponse() {

    }

    /**
     * Gets the <code>tariffAdminRateDtos</code>.
     * <p>
     * 
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminDto TariffRateAdminDto}
     *         </code><br>
     *         Returns the <code>TariffRateAdminDto</code>.
     *         </p>
     */
    public List<TariffRateAdminDto> getTariffRateAdminDtos() {
        if (this.tariffRateAdminDtos == null || this.tariffRateAdminDtos.isEmpty()) {
            this.tariffRateAdminDtos = new ArrayList<TariffRateAdminDto>();
        }
        return this.tariffRateAdminDtos;
    }

    /**
     * Sets the <code>TariffRateAdminDto</code>.
     * <p>
     * 
     * @param pTariffRateAdminDtos <code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminDto
     *            TariffRateAdminDto}</code><br>
     *            The tariff rate admin data transfer object
     *            </p>
     */
    public void setTariffRateAdminDtos(final List<TariffRateAdminDto> pTariffRateAdminDtos) {
        this.tariffRateAdminDtos = pTariffRateAdminDtos;
    }

}
