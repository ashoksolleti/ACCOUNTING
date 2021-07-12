/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>TariffRateAdminPersistRequest</code> is used for creating and updating the
 * <code>TariffRateAdministration</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>tariffRateAdminDtos
 * </code>
 * </ul>
 */
public class TariffRateAdminPersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -380938964898613301L;

    /**
     * Attribute to hold the <code>oId</code> property.
     * <p>
     * The oId which holds the information that needs to be persisted.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>tariffRateAdminDtos</code> property.
     * <p>
     * The tariff rate admin data transfer object which holds the information that needs to be persisted.
     */
    private List<TariffRateAdminDto> tariffRateAdminDtos;

    /**
     * <code>Default constructor.</code>
     */
    public TariffRateAdminPersistRequest() {

    }

    /**
     * Gets the <code>oId</code>.
     * <p>
     * The oId which holds the information that needs to be persisted.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>tariffRateAdminDtos</code>.
     * <p>
     * The tariff Rate Admin data transfer object which holds the information that needs to be persisted.
     * <p>
     * 
     * @return the current value of the <code>tariffRateAdminDtos</code> property.<br>
     */
    public List<TariffRateAdminDto> getTariffRateAdminDtos() {
        return this.tariffRateAdminDtos;
    }

    /**
     * Sets the <code>oId</code>.
     * <p>
     * The oId which holds the information that needs to be persisted.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>tariffRateAdminDtos</code>.
     * <p>
     * The tariff Rate Admin data transfer object which holds the information that needs to be persisted.
     * <p>
     * 
     * @param pTariffRateAdminDtos the new value of the <code>tariffRateAdminDtos</code> property.<br>
     */
    public void setTariffRateAdminDtos(final List<TariffRateAdminDto> pTariffRateAdminDtos) {
        this.tariffRateAdminDtos = pTariffRateAdminDtos;
    }

}
