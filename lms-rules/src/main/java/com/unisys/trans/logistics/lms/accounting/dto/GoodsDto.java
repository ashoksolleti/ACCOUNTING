package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;


public class GoodsDto implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = -2888821369282403442L;

    private Integer lowerDeckContainers;

    private Integer lowerDeckPallets;

    private Integer shipmentPieces;

    private BigDecimal shipmentVolume;

    private BigDecimal shipmentWeight;

    private Integer upperDeckPallets;

    public Integer getLowerDeckContainers() {
        return lowerDeckContainers;
    }

    public Integer getLowerDeckPallets() {
        return lowerDeckPallets;
    }

    public Integer getShipmentPieces() {
        return shipmentPieces;
    }

    public BigDecimal getShipmentVolume() {
        return shipmentVolume;
    }

    public BigDecimal getShipmentWeight() {
        return shipmentWeight;
    }

    public Integer getUpperDeckPallets() {
        return upperDeckPallets;
    }

    public void setLowerDeckContainers(Integer lowerDeckContainers) {
        this.lowerDeckContainers = lowerDeckContainers;
    }
    
    public void setLowerDeckPallets(Integer lowerDeckPallets) {
        this.lowerDeckPallets = lowerDeckPallets;
    }
    
    public void setShipmentPieces(Integer shipmentPieces) {
        this.shipmentPieces = shipmentPieces;
    }
    
    public void setShipmentVolume(BigDecimal shipmentVolume) {
        this.shipmentVolume = shipmentVolume;
    }
    
    public void setShipmentWeight(BigDecimal shipmentWeight) {
        this.shipmentWeight = shipmentWeight;
    }
    
    public void setUpperDeckPallets(Integer upperDeckPallets) {
        this.upperDeckPallets = upperDeckPallets;
    }
    
    
}
