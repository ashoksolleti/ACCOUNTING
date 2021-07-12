/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;
import java.util.Date;

/**
 * <code>FreightStatistics</code> contains statistical details of freight participant that is frequently
 * updated from other modules like AWB and ULD.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>lastShipmentDate
 * <li>totalShipments
 * <li>totalHouseAWB
 * </ul>
 * </code>
 */
public class FreightStatisticsDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6635493057491557792L;

    /**
     * Attribute to hold <code>lastShipmentDate</code> property. Last Shipment Date is Date when the latest
     * shipment associated with the participant is present in the system.
     */
    private Date lastShipmentDate;

    /**
     * Attribute to hold <code>totalHouseAWB</code> property. It contains the total number of House Air
     * Waybills involving the participants till current date from the initial shipment date.
     */
    private int totalHouseAWB;

    /**
     * Attribute to hold <code>totalShipments</code> property. It contains the total number of shipments
     * involving the participants till current date from the initial shipment date.
     */
    private int totalShipments;

    /**
     * <code>Default constructor.</code>
     */
    public FreightStatisticsDto() {

    }

    /**
     * Gets the <code>lastShipmentDate</code> property.
     * <p>
     * Date when the latest shipment associated with the participant is entered in the system.<br>
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT
     * * }<br>
     * <p>
     * <b>Example: </b><br>
     * 26JUN07
     * <p>
     * 
     * @return the current value of <code>lastShipmentDate</code> property.<br>
     */
    public Date getLastShipmentDate() {
        return ContractUtility.getClonedDate(this.lastShipmentDate);
    }

    /**
     * Gets the <code>totalHouseAWB</code> property.
     * <p>
     * Total number of House Air Waybills involving the participants till date from the initial shipment date.
     * <br>
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 1000
     * <p>
     * 
     * @return the current value of <code>totalHouseAWB</code> property.
     */
    public int getTotalHouseAWB() {
        return this.totalHouseAWB;
    }

    /**
     * Gets the <code>totalShipments</code> property.
     * <p>
     * Total number of shipments involving the Total number of shipments involving the participants till<br>
     * date from the initial shipment date.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @return the current value of <code>totalShipments</code> property.<br>
     */
    public int getTotalShipments() {
        return this.totalShipments;
    }

    /**
     * Sets the <code>lastShipmentDate</code> property.
     * <p>
     * Date when the latest shipment associated with the participant is entered in the system.
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT
     * * }<br>
     * <br>
     * <p>
     * <b>Example: </b><br>
     * 26JUN07
     * <p>
     * 
     * @param pLastShipmentDate the new value of <code>lastShipmentDate</code> property.<br>
     */
    public void setLastShipmentDate(final Date pLastShipmentDate) {
        this.lastShipmentDate = ContractUtility.getClonedDate(pLastShipmentDate);
    }

    /**
     * Sets the <code>totalHouseAWB</code> property.
     * <p>
     * Total number of House Air Waybills involving the participants till date from the initial shipment date.
     * <br>
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 1000
     * <p>
     * 
     * @param pTotalHouseAWB the new value of <code>totalHouseAWB</code> property.<br>
     */
    public void setTotalHouseAWB(final int pTotalHouseAWB) {
        this.totalHouseAWB = pTotalHouseAWB;
    }

    /**
     * Sets the <code>totalShipments</code> property.
     * <p>
     * Total number of shipments involving the Total number of shipments involving the participants till<br>
     * date from the initial shipment date.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @param pTotalShipments the new value of <code>totalShipments</code> property.<br>
     */
    public void setTotalShipments(final int pTotalShipments) {
        this.totalShipments = pTotalShipments;
    }

}
