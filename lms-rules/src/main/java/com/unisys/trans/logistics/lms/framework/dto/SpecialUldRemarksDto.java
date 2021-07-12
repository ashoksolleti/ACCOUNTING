package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <code>SpecialUldRemarksDto</code> contains specific data applicable to the
 * Special ULD Remarks.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>OId
 * <li>uldIdentifier
 * <li>pieces
 * <li>weight
 * <li>volume
 * <li>flightNumber
 * <li>flightDate
 * <li>deleteIndicator
 * </ul>
 * </code>
 */

public class SpecialUldRemarksDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>OId</code> property.
     */
    private Long OId;

    /**
     * Attribute to hold <code>uldIdentifier</code> property.
     */
    private String uldIdentifier;

    /**
     * Attribute to hold <code>pieces</code> property.
     */
    private Integer pieces;

    /**
     * Attribute to hold <code>weight</code> property.
     */
    private BigDecimal weight;
    
    /**
     * Attribute to hold <code>weight</code> property.
     */
    private BigDecimal volume;

    /**
     * Attribute to hold <code>flightNumber</code> property.
     */
    private String flightNumber;

    /**
     * Attribute to hold <code>flightDate</code> property.
     */
    private Date flightDate;

    /**
     * Attribute to hold <code>deleteIndicator</code> property.
     */
    private boolean deleteIndicator;
    
    /**
     * Attribute to hold <code>airwaybillNumber</code> property.
     */
    private String airwaybillNumber;
    
    /**
     * Attribute to hold <code>bookedFlightNumber</code> property.
     */
    private String bookedFlightNumber;
    
    /**
     * Attribute to hold <code>bookedFlightDate</code> property.
     */
    private String bookedFlightDate;

    /**
     * Gets the <code>uldIdentifier</code> property.
     * 
     * @return the current value of <code>uldIdentifier</code>.
     */
    public String getUldIdentifier() {
        return uldIdentifier;
    }

    /**
     * Sets the <code>uldIdentifier</code> property.
     * <p>
     * 
     * @param pUldIdentifier
     *            the new value of the <code>uldIdentifier</code> property.
     */
    public void setUldIdentifier(final String pUldIdentifier) {
        this.uldIdentifier = pUldIdentifier;
    }

    /**
     * Gets the <code>pieces</code> property.
     * 
     * @return the current value of <code>pieces</code>.
     */
    public Integer getPieces() {
        return this.pieces;
    }

    /**
     * Sets the <code>pieces</code> property.
     * <p>
     * 
     * @param pPieces
     *            the new value of the <code>pieces</code> property.
     */
    public void setPieces(final Integer pPieces) {
        this.pieces = pPieces;
    }

    /**
     * Gets the <code>weight</code> property.
     * 
     * @return the current value of <code>weight</code>.
     */
    public BigDecimal getWeight() {
        return this.weight;
    }

    /**
     * Sets the <code>weight</code> property.
     * <p>
     * 
     * @param pWeight
     *            the new value of the <code>weight</code> property.
     */
    public void setWeight(final BigDecimal pWeight) {
        this.weight = pWeight;
    }

    /**
     * Gets the <code>flightNumber</code> property.
     * 
     * @return the current value of <code>flightNumber</code>.
     */
    public String getFlightNumber() {
        return this.flightNumber;
    }

    /**
     * Sets the <code>flightNumber</code> property.
     * <p>
     * 
     * @param pFlightNumber
     *            the new value of the <code>flightNumber</code> property.
     */
    public void setFlightNumber(final String pFlightNumber) {
        this.flightNumber = pFlightNumber;
    }

    /**
     * Gets the <code>flightDate</code> property.
     * 
     * @return the current value of <code>flightDate</code>.
     */
    public Date getFlightDate() {
        if(this.flightDate!=null){
            return (Date)this.flightDate.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Sets the <code>flightDate</code> property.
     * <p>
     * 
     * @param pFlightDate
     *            the new value of the <code>flightDate</code> property.
     */
    public void setFlightDate(final Date pFlightDate) {
        if(pFlightDate!=null){
        	this.flightDate =(Date) pFlightDate.clone();
          }
        else
        {
        	this.flightDate=null;
        }
    }

    /**
     * Gets the <code>OId</code> property.
     * 
     * @return the current value of <code>OId</code>.
     */

    @Override
    public Long getOId() {
        return this.OId;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>OId</code> property.
     */
    public void setOId(final Long pOId) {
        this.OId = pOId;
    }

    /**
     * Gets the <code>deleteIndicator</code> property.
     * 
     * @return the current value of <code>deleteIndicator</code>.
     */
    public boolean isDeleteIndicator() {
        return this.deleteIndicator;
    }

    /**
     * Sets the <code>deleteIndicator</code> property.
     * <p>
     * 
     * @param pDeleteIndicator
     *            the new value of the <code>deleteIndicator</code> property.
     */
    public void setDeleteIndicator(final boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public String getAirwaybillNumber() {
        return airwaybillNumber;
    }

    public void setAirwaybillNumber(String airwaybillNumber) {
        this.airwaybillNumber = airwaybillNumber;
    }

    public String getBookedFlightNumber() {
        return bookedFlightNumber;
    }

    public void setBookedFlightNumber(String bookedFlightNumber) {
        this.bookedFlightNumber = bookedFlightNumber;
    }

    public String getBookedFlightDate() {
        return bookedFlightDate;
    }

    public void setBookedFlightDate(String bookedFlightDate) {
        this.bookedFlightDate = bookedFlightDate;
    }
    
    
}
