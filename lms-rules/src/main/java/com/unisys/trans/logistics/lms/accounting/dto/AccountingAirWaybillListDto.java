/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;
import com.unisys.trans.logistics.lms.framework.utility.StringUtility;

/**
 * <code>AirWaybillListDto</code> class contain information specific to an AirWaybill.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>creationDate
 * <li>executionDate
 * <li>originStation
 * <li>destinationStation
 * <li>airWaybillRouting 
 * <li>airWaybillNumber
 * <li>oId
 * </code>
 * </ul>
 */
public class AccountingAirWaybillListDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = -7458963101332520770L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>creationDate</code> property.
     */
    private String creationTime;

    /**
     * @return the creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @param creationTime the creationTime to set
     */
    public void setCreationTime(final String pCreationTime) {
        this.creationTime = pCreationTime;
    }

    /**
     * Attribute to hold <code>airWaybillNumber</code> property.
     */
    private AirWaybillNumberDto airWaybillNumber;

    /**
     * Attribute to hold <code>creationDate</code> property.
     */
    private Date creationDate;

    /**
     * Attribute to hold <code>originStation</code> property.
     */
    private String originStation;

    /**
     * Attribute to hold <code>destinationStation</code> property.
     */
    private String destinationStation;

    /**
     * Attribute to hold <code></code> property.
     */
    private Date executionDate;

    /**
     * Attribute to hold <code></code> property.
     */
    private List<String> airWaybillRouting;

    public Long getOId() {
        return this.oId;
    }

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    public AirWaybillNumberDto getAirWaybillNumber() {
        return this.airWaybillNumber;
    }

    public void setAirWaybillNumber(final AirWaybillNumberDto pAirWaybillNumber) {
        this.airWaybillNumber = pAirWaybillNumber;
    }

    public Date getCreationDate() {
        return ContractUtility.getClonedDate(this.creationDate);
    }

    public void setCreationDate(final Date pCreationDate) {
        this.creationDate = ContractUtility.getClonedDate(pCreationDate);
    }

    public String getOriginStation() {
        return this.originStation;
    }

    public void setOriginStation(final String pOriginStation) {
        this.originStation = pOriginStation;
    }

    public String getDestinationStation() {
        return this.destinationStation;
    }

    public void setDestinationStation(final String pDestinationStation) {
        this.destinationStation = pDestinationStation;
    }

    public Date getExecutionDate() {
        return ContractUtility.getClonedDate(this.executionDate);
    }

    public void setExecutionDate(final Date pExecutionDate) {
        this.executionDate = ContractUtility.getClonedDate(pExecutionDate);
    }

    public List<String> getAirWaybillRouting() {

        if (this.airWaybillRouting == null) {
            this.airWaybillRouting = new ArrayList<String>();
        }
        return this.airWaybillRouting;
    }

    public Date getCreationDateTimeDisplay() {
        Date aCreationDate = null;
        if (this.getCreationDate() != null && this.getCreationTime() != null) {
            aCreationDate = DateUtility.getDate(this.getCreationDate(), this.getCreationTime());
        }
        return aCreationDate;
    }

    public String getRoutingForDisplay() {
        String aRoutingStr = null;
        if (this.getAirWaybillRouting() != null && !this.getAirWaybillRouting().isEmpty()) {
            final StringBuffer aRoutingBuffer = new StringBuffer();
            for (String aRouting : this.getAirWaybillRouting()) {
                aRoutingBuffer.append(aRouting);
                aRoutingBuffer.append(FrameworkConstants.WHITE_SPACE);
            }
            aRoutingStr = aRoutingBuffer.toString().substring(0, aRoutingBuffer.toString().length() - 1);
        }
        return aRoutingStr;
    }

    public void setAirWaybillRouting(final List<String> pAirWaybillRouting) {
        this.airWaybillRouting = pAirWaybillRouting;
    }

    public String getAirWaybillNumberForDisplay() {
        String anAirWaybillNumber = null;
        if (this.getAirWaybillNumber() != null) {
            final StringBuffer anAirWaybillNumberBuffer = new StringBuffer();
            if (!StringUtility.isEmpty(this.getAirWaybillNumber().getAirlineCodeNbr())) {
                anAirWaybillNumberBuffer.append(this.getAirWaybillNumber().getAirlineCodeNbr());
            }
            if (!StringUtility.isEmpty(this.getAirWaybillNumber().getShipmentReference())) {
                anAirWaybillNumberBuffer.append(this.getAirWaybillNumber().getShipmentReference());
            }
            if (!StringUtility.isEmpty(this.getAirWaybillNumber().getModOverrideIndicator())) {
                anAirWaybillNumberBuffer.append(this.getAirWaybillNumber().getModOverrideIndicator());
            }
            anAirWaybillNumber = anAirWaybillNumberBuffer.toString();
        }
        return anAirWaybillNumber;
    }
}
