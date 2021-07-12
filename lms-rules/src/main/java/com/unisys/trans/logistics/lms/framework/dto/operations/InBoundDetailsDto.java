/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.ReceiptType;

/**
 * <code>InBondDetailsDto</code> class represents the InBondDetails information.
 * 
 */
public class InBoundDetailsDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>acceptedPieces</code> property.
     */
    private int acceptedPieces;

    /**
     * Attribute to hold <code>arrivalPort</code> property.
     */
    private String arrivalPort;

    /**
     * Attribute to hold <code>customsDestinationStation</code> property.
     */
    private String customsDestinationStation;

    /**
     * Attribute to hold <code>importFlightDate</code> property.
     */
    private Date importFlightDate;

    /**
     * Attribute to hold <code>importFlight</code> property.
     */
    private BaseFlightDto importFlightDto;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>partArrivalIndicator</code> property.
     */
    private boolean partArrivalIndicator;

    /**
     * Attribute to hold <code>receiptRequestIndicator</code> property.
     */
    private boolean receiptRequestIndicator;

    /**
     * Attribute to hold <code>receiptType</code> property.
     */
    private ReceiptType receiptType;

    /**
     * Gets the <code>AcceptedPieces</code> property.
     * <p>
     * 
     * @return the current value of the <code>AcceptedPieces</code> property.<br>
     */
    public int getAcceptedPieces() {
        return this.acceptedPieces;
    }

    /**
     * Gets the <code>ArrivalPort</code> property.
     * <p>
     * 
     * @return the current value of the <code>ArrivalPort</code> property.<br>
     */
    public String getArrivalPort() {
        return this.arrivalPort;
    }

    /**
     * Gets the <code>CustomsDestinationStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>CustomsDestinationStation</code> property.<br>
     */
    public String getCustomsDestinationStation() {
        return this.customsDestinationStation;
    }

    /**
     * Gets the <code>ImportFlightDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>ImportFlightDate</code> property.<br>
     */
    public Date getImportFlightDate() {
        if(this.importFlightDate!=null){
            return (Date)this.importFlightDate.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Gets the <code>ImportFlight</code> property.
     * <p>
     * 
     * @return the current value of the <code>ImportFlight</code> property.<br>
     */
    public BaseFlightDto getImportFlightDto() {
        return this.importFlightDto;
    }

    /**
     * Gets the value of the <code>oId</code> property.
     * <p>
     *
     * @return Returns the current value of <code>oId</code> property.
     */
    public Long getoId() {
        return oId;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>OId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>PartArrivalIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>PartArrivalIndicator</code> property.<br>
     */
    public boolean isPartArrivalIndicator() {
        return this.partArrivalIndicator;
    }

    /**
     * Gets the <code>ReceiptRequestIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>ReceiptRequestIndicator</code> property.<br>
     */
    public boolean getReceiptRequestIndicator() {
        return this.receiptRequestIndicator;
    }

    /**
     * Gets the <code>ReceiptType</code> property.
     * <p>
     * 
     * @return the current value of the <code>ReceiptType</code> property.<br>
     */
    public ReceiptType getReceiptType() {
        return this.receiptType;
    }

    /**
     * Sets the <code>AcceptedPieces</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>AcceptedPieces</code> property.<br>
     */
    public void setAcceptedPieces(final int pAcceptedPieces) {
        this.acceptedPieces = pAcceptedPieces;
    }

    /**
     * Sets the <code>ArrivalPort</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ArrivalPort</code> property.<br>
     */
    public void setArrivalPort(final String pArrivalPort) {
        this.arrivalPort = pArrivalPort;
    }

    /**
     * Sets the <code>CustomsDestinationStation</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>CustomsDestinationStation</code> property.<br>
     */
    public void setCustomsDestinationStation(final String pCustomsDestinationStation) {
        this.customsDestinationStation = pCustomsDestinationStation;
    }

    /**
     * Sets the <code>ImportFlightDate</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ImportFlightDate</code> property.<br>
     */
    public void setImportFlightDate(final Date pImportFlightDate) {
        if(pImportFlightDate!=null){
        	this.importFlightDate =(Date) pImportFlightDate.clone();
          }
        else
        {
        	this.importFlightDate=null;
        }
    }

    /**
     * Sets the <code>ImportFlight</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ImportFlight</code> property.<br>
     */
    public void setImportFlightDto(final BaseFlightDto pImportFlightDto) {
        this.importFlightDto = pImportFlightDto;
    }

    /**
     * Sets the value of the <code>oId</code> property.
     * <p>
     *
     * @param <code>oId</code>
     *            Holds the new value of the <code>oId</code> property.
     */
    public void setoId(Long oId) {
        this.oId = oId;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>OId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>PartArrivalIndicator</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>PartArrivalIndicator</code> property.<br>
     */
    public void setPartArrivalIndicator(final boolean pPartArrivalIndicator) {
        this.partArrivalIndicator = pPartArrivalIndicator;
    }

    /**
     * Sets the <code>ReceiptRequestIndicator</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ReceiptRequestIndicator</code> property.<br>
     */
    public void setReceiptRequestIndicator(final boolean pReceiptRequestIndicator) {
        this.receiptRequestIndicator = pReceiptRequestIndicator;
    }

    /**
     * Sets the <code>ReceiptType</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ReceiptType</code> property.<br>
     */
    public void setReceiptType(final ReceiptType pReceiptType) {
        this.receiptType = pReceiptType;
    }

}