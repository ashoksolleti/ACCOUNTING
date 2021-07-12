/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import com.unisys.trans.logistics.lms.framework.dto.constants.ExtractType;

/**
 * <code>ExtractRequest</code> holds the request parameters required to retrieve the Tariff Rates,contracts or
 * spot rates.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>extractDto</li>
 * <li>extractType</li>
 * <li>emailAddress</li>
 * </ul>
 */
public class ExtractRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3561562483469442635L;

    /**
     * Indicates the email address of the report recipient.
     */
    private String emailAddress;

    /**
     * Attribute to hold <code>extractDto</code> property.
     * <p>
     * The value can be <code>ExtractContractSpotRateDto</code> or <code>ExtractTariffDto</code>.
     */
    private PersistenceObjectDto extractDto;

    /**
     * Indicates the type of report. i.e whether contract,spot rate or tariff.
     */
    private ExtractType extractType;

    /**
     * Attribute to hold <code>status</code> property.
     */
    private String status;

    /**
     * Gets the recipient email address.
     * 
     * @return the emailAddress
     *         -recipient email address.
     */
    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * Gets the value of <code>extractDto</code>.
     * The <code>extractDto</code> can be of the following types.
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.rating.dto.ExtractContractSpotRateDto
     * ExtractContractSpotRateDto}
     * <li>{@link com.unisys.trans.logistics.lms.rating.dto.ExtractTariffDto ExtractTariffDto}
     * </ul>
     * 
     * @return the extractDto
     *         - the extractDto that is being returned.
     */
    public PersistenceObjectDto getExtractDto() {
        return this.extractDto;
    }

    /**
     * Gets the type of report that is being extracted.
     * <p>
     * Possible values could be.
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <td>{@link com.unisys.trans.logistics.lms.rating.dto.ExtractType#CONTRACT_EXTRACT CONTRACT_EXTRACT}</td>
     * <td>Report type is Contract</td>
     * </tr>
     * <tr>
     * <td>{@link com.unisys.trans.logistics.lms.rating.dto.ExtractType#TARIFF_EXTRACT TARIFF_EXTRACT}</td>
     * <td>Report type is Tariff</td>
     * </tr>
     * <tr>
     * <td>{@link com.unisys.trans.logistics.lms.rating.dto.ExtractType#SPOTRATE_EXTRACT SPOTRATE_EXTRACT}</td>
     * <td>Report type is Spot Rate</td>
     * </tr>
     * </table>
     * 
     * @return the extractType
     *         -type of report that is being extracted.
     */
    public ExtractType getExtractType() {
        return this.extractType;
    }

    /**
     * Gets the status .
     * 
     * @return the status
     *         returns the status.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Sets the recipient email address.
     * 
     * @param pEmailAddress - the emailAddress to set
     */
    public void setEmailAddress(final String pEmailAddress) {
        this.emailAddress = pEmailAddress;
    }

    /**
     * Sets the following types to <code>extractDto</code>.
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.rating.dto.ExtractContractSpotRateDto
     * ExtractContractSpotRateDto}
     * <li>{@link com.unisys.trans.logistics.lms.rating.dto.ExtractTariffDto ExtractTariffDto}
     * </ul>
     * 
     * @param pExtractDto
     *            - the extractDto to set
     */
    public void setExtractDto(final PersistenceObjectDto pExtractDto) {
        this.extractDto = pExtractDto;
    }

    /**
     * Sets the type of the report that is being extracted.
     * Gets the type of report that is being extracted.
     * <p>
     * Possible values could be.
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <td>{@link com.unisys.trans.logistics.lms.rating.dto.ExtractType#CONTRACT_EXTRACT CONTRACT_EXTRACT}</td>
     * <td>Report type is Contract</td>
     * </tr>
     * <tr>
     * <td>{@link com.unisys.trans.logistics.lms.rating.dto.ExtractType#TARIFF_EXTRACT TARIFF_EXTRACT}</td>
     * <td>Report type is Tariff</td>
     * </tr>
     * <tr>
     * <td>{@link com.unisys.trans.logistics.lms.rating.dto.ExtractType#SPOTRATE_EXTRACT SPOTRATE_EXTRACT}</td>
     * <td>Report type is Spot Rate</td>
     * </tr>
     * </table>
     * 
     * @param pExtractType
     *            - type of report that is being extracted
     */
    public void setExtractType(final ExtractType pExtractType) {
        this.extractType = pExtractType;
    }

    /**
     * Sets the <code>status</code> property.
     * <p>
     * @param pStatus
     *            the current value of the <code>status</code> property.
     */
    public void setStatus(final String pStatus) {
        this.status = pStatus;
    }

}
