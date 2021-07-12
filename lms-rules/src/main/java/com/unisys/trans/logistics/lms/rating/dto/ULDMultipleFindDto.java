/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ClassRatingRuleFindDto</code> contain details to retrieve
 * ClassRatingRule Information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>iataAreaTo
 * <li>iataAreaFrom
 * <li>classRatingId
 * <li>rateSource
 * <li>carrierCode
 * </ul>
 */
public class ULDMultipleFindDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -7372369821831170038L;

    private List<String> carrierCodes;

    private List<String> destinationCodes;

    private Date executionDate;

    private List<String> originCodes;

    /**
     * Attribute to hold <code>carrierCodes</code> property.
     */
    private String uldType;

    public List<String> getCarrierCodes() {
        return this.carrierCodes;
    }

    public List<String> getDestinationCodes() {
        return this.destinationCodes;
    }

    public Date getExecutionDate() {
        return ContractUtility.getClonedDate(this.executionDate);
    }

    public List<String> getOriginCodes() {
        return this.originCodes;
    }

    public String getUldType() {
        return this.uldType;
    }

    public void setCarrierCodes(List<String> pCarrierCodes) {
        this.carrierCodes = pCarrierCodes;
    }

    public void setDestinationCodes(List<String> pDestinationCodes) {
        this.destinationCodes = pDestinationCodes;
    }

    public void setExecutionDate(Date pExecutionDate) {
        this.executionDate = ContractUtility.getClonedDate(pExecutionDate);
    }

    public void setOriginCodes(List<String> pOriginCodes) {
        this.originCodes = pOriginCodes;
    }

    public void setUldType(String pUldType) {
        this.uldType = pUldType;
    }

}
