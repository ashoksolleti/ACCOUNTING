/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>RatingCarrierDto</code> contains specific data applicable to the RatingCarrier.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>oId
 * <li>code
 * <li>allowContractAndSRAInd
 * <li>rateWithHostRatesInd
 * <li>includeHostRatesInd
 * </ul>
 */
public class RatingCarrierDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 792506804108841329L;

    /**
     * Attribute to hold <code>allowContractAndSRAIndicator</code> property.
     * <p>
     * This attribute defines if contract and SRA search is allowed for the Airline's Air Waybills.
     * </p>
     */
    private boolean allowContractAndSRAIndicator;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>includeHostRatesIndicator</code> property.
     * <p>
     * This attribute defines if host rates in rate search for non-host Air Waybills are included.
     * </p>
     */
    private boolean includeHostRatesIndicator;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>rateSourceHierarcy</code> property.
     */
    private List<RateSourceHierarchyDto> rateSourceHierarcy;

    /**
     * Attribute to hold <code>rateWithHostRatesIndicator</code> property.
     * <p>
     * This attribute defines if rate with host rates on host Air Waybills.
     * </p>
     */
    private boolean rateWithHostRatesIndicator;

    /**
     * <code>Default constructor.</code>
     */
    public RatingCarrierDto() {
    }

    /**
     * Gets the <code>carrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * AC
     * <p>
     * 
     * @return the current value of the carrier <code>carrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>rateSourceHierarcy</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * AC
     * <p>
     * 
     * @return the current value of the carrier <code>rateSourceHierarcy</code> property.
     */
    public List<RateSourceHierarchyDto> getRateSourceHierarcy() {
        if (this.rateSourceHierarcy == null) {
            this.rateSourceHierarcy = new ArrayList<RateSourceHierarchyDto>();
        }
        return this.rateSourceHierarcy;
    }

    /**
     * <li>Gets the allowContractAndSRAIndicator.</li>
     * <p>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     * @return <code>boolean</code><br>
     *         Returns the allowContractAndSRAIndicator.<br>
     */
    public boolean isAllowContractAndSRAIndicator() {
        return this.allowContractAndSRAIndicator;
    }

    /**
     * <li>Gets the includeHostRatesIndicator.</li>
     * <p>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     * @return <code>boolean</code><br>
     *         Returns the includeHostRatesIndicator.<br>
     */
    public boolean isIncludeHostRatesIndicator() {
        return this.includeHostRatesIndicator;
    }

    /**
     * <li>Gets the rateWithHostRatesIndicator.</li>
     * <p>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     * @return <code>boolean</code><br>
     *         Returns the rateWithHostRatesIndicator.<br>
     */
    public boolean isRateWithHostRatesIndicator() {
        return this.rateWithHostRatesIndicator;
    }

    /**
     * Sets the <code>allowContractAndSRAIndicator</code> property.
     * 
     * @param pAllowContractAndSRAIndicator
     *            the allowContractAndSRAIndicator to set
     */
    public void setAllowContractAndSRAIndicator(final boolean pAllowContractAndSRAIndicator) {
        this.allowContractAndSRAIndicator = pAllowContractAndSRAIndicator;
    }

    /**
     * Sets the <code>carrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * AC
     * <p>
     * 
     * @param pCarrierCode the new value of the <code>carrierCode</code> of the carrier.
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);
    }

    /**
     * Sets the <code>includeHostRatesIndicator</code> property.
     * 
     * @param pIincludeHostRatesIndicator
     *            the includeHostRatesIndicator to set
     */
    public void setIncludeHostRatesIndicator(final boolean pIincludeHostRatesIndicator) {
        this.includeHostRatesIndicator = pIincludeHostRatesIndicator;
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
     * Sets the <code>rateSourceHierarcy</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * AC
     * <p>
     * 
     * @param pRateSourceHierarcy the new value of the <code>rateSourceHierarcy</code> of the carrier.
     */
    public void setRateSourceHierarcy(final List<RateSourceHierarchyDto> pRateSourceHierarcy) {
        this.rateSourceHierarcy = pRateSourceHierarcy;
    }

    /**
     * Sets the <code>rateWithHostRatesIndicator</code> property.
     * 
     * @param pRateWithHostRatesIndicator
     *            the rateWithHostRatesIndicator to set
     */
    public void setRateWithHostRatesIndicator(final boolean pRateWithHostRatesIndicator) {
        this.rateWithHostRatesIndicator = pRateWithHostRatesIndicator;
    }
}
