package com.unisys.trans.logistics.lms.framework.dto.operations;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.DestinationType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.ServiceLevelType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.ShipmentType;

public class FlightManifestGroupDto extends PersistenceObjectDto {
    
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Attribute to hold the <code>shipmentType</code> property.
     */
    private ShipmentType shipmentType;

    /**
     * Attribute to hold the <code>destinationType</code> property.
     */
    private DestinationType destinationType;

    /**
     * Attribute to hold the <code>serviceLevelType</code> property.
     */
    private ServiceLevelType serviceLevelType;

    /**
     * Attribute to hold the <code>destBulkFreightOrder</code> property.
     */
    private boolean changeIndicator;

    /**
     * Gets the value of the <code>shipmentType</code> property.
     * <p>
     *
     * @return Returns the current value of <code>shipmentType</code> property.
     */
    public ShipmentType getShipmentType() {
        return shipmentType;
    }



    /**
     * Sets the value of the <code>shipmentType</code> property.
     * <p>
     *
     * @param <code>shipmentType</code>
     *        Holds the new value of the <code>shipmentType</code> property.
     */
    public void setShipmentType(ShipmentType shipmentType) {
        this.shipmentType = shipmentType;
    }



    /**
     * Gets the value of the <code>destinationType</code> property.
     * <p>
     *
     * @return Returns the current value of <code>destinationType</code> property.
     */
    public DestinationType getDestinationType() {
        return destinationType;
    }



    /**
     * Sets the value of the <code>destinationType</code> property.
     * <p>
     *
     * @param <code>destinationType</code>
     *        Holds the new value of the <code>destinationType</code> property.
     */
    public void setDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType;
    }



    /**
     * Gets the value of the <code>serviceLevelType</code> property.
     * <p>
     *
     * @return Returns the current value of <code>serviceLevelType</code> property.
     */
    public ServiceLevelType getServiceLevelType() {
        return serviceLevelType;
    }



    /**
     * Sets the value of the <code>serviceLevelType</code> property.
     * <p>
     *
     * @param <code>serviceLevelType</code>
     *        Holds the new value of the <code>serviceLevelType</code> property.
     */
    public void setServiceLevelType(ServiceLevelType serviceLevelType) {
        this.serviceLevelType = serviceLevelType;
    }



    /**
     * Gets the value of the <code>changeIndicator</code> property.
     * <p>
     *
     * @return Returns the current value of <code>changeIndicator</code> property.
     */
    public boolean isChangeIndicator() {
        return changeIndicator;
    }



    /**
     * Sets the value of the <code>changeIndicator</code> property.
     * <p>
     *
     * @param <code>changeIndicator</code>
     *        Holds the new value of the <code>changeIndicator</code> property.
     */
    public void setChangeIndicator(boolean changeIndicator) {
        this.changeIndicator = changeIndicator;
    }



    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }
}
