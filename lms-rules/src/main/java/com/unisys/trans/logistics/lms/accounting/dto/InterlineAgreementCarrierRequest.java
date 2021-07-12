/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AgreementType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.CarrierRequestType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>InterlineAgreementCarrierRequest</code> class represents the request to retrieve
 * all the carrier associated with interline agreements details.
 * <p>
 * <code>InterlineAgreementCarrierRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>carrier
 * <li>agreementType
 * <li>carrierRequestType
 * </code>
 * </ul>
 */

public class InterlineAgreementCarrierRequest extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>agreementType</code> property.
     */
    private AgreementType agreementType;

    /**
     * Attribute to hold <code>carrier</code> property.
     */
    private String carrier;

    /**
     * Attribute to hold <code>carrierRequestType</code> property.
     */
    private CarrierRequestType carrierRequestType;

    /**
     * Gets the <code>AgreementType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Prorate,Proviso.
     * <p>
     * <b>Example: </b><br>
     * Prorate
     * <p>
     * 
     * @return the current value of the <code>agreementType</code> property.
     */
    public AgreementType getAgreementType() {
        return this.agreementType;
    }

    /**
     * Gets the <code>carrier</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3A
     * <p>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @return the current value of the <code>carrier</code> property.
     */
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * Gets the <code>CarrierRequestType</code> property.
     * <p>
     * <b>Format: </b><br>
     * ACN,CARRIER.
     * <p>
     * <b>Example: </b><br>
     * ACN
     * <p>
     * 
     * @return the current value of the <code>CarrierRequestType</code> property.
     */
    public CarrierRequestType getCarrierRequestType() {
        return this.carrierRequestType;
    }

    /**
     * Sets the <code>AgreementType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Prorate,Proviso.
     * <p>
     * <b>Example: </b><br>
     * Prorate
     * <p>
     * 
     * @param pAgreementType
     *            the current value of the <code>AgreementType</code> property.
     */
    public void setAgreementType(final AgreementType pAgreementType) {
        this.agreementType = pAgreementType;
    }

    /**
     * Sets the <code>carrier</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3A
     * <p>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @param pCarrier
     *            the current value of the <code>carrier</code> property.
     */
    public void setCarrier(final String pCarrier) {
        this.carrier = ContractUtility.convertToUpperCase(pCarrier);
    }

    /**
     * Sets the <code>carrierRequestType</code> property.
     * <p>
     * <b>Format: </b><br>
     * ACN,CARRIER.
     * <p>
     * <b>Example: </b><br>
     * ACN
     * <p>
     * 
     * @param pCarrierRequestType
     *            the current value of the <code>carrierRequestType</code> property.
     */
    public void setCarrierRequestType(final CarrierRequestType pCarrierRequestType) {
        this.carrierRequestType = pCarrierRequestType;
    }

}
