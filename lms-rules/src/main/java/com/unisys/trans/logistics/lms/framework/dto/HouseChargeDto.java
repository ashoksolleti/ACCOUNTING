/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class HouseChargeDto extends PersistenceObjectDto {

    /**
     * <code>BookingDto</code> is used for find Booking information.
     * <p>
     * This contains the following attributes:
     * <ul>
     * <li>awbTotalCol
     * <li>awbTotalPpd
     * <li>awbTotalWeightCharge
     * <li>codCur
     * <li>codExchangeRate
     * <li>displayTotalColCharges
     * <li>displayTotalPpdCharges
     * <li>displayTotalWeightCharge
     * <li>printableTotalColCharges
     * <li>printableTotalPpdCharges
     * <li>printableTotalWeightCharge
     * <li>oId
     * <li>totalCodAmount
     * <li>valuationChargeGeneration
     * </ul>
     */
    private static final long serialVersionUID = 3352238544804346900L;

    /**
     * Freight Bill Total Prepaid- Actual Prepaid Charges.
     */
    private BigDecimal awbDestination;

    /**
     * Freight bill total collect - Actual Collect Charges.
     */
    private BigDecimal awbTotalCol;

    /**
     * Freight Bill Total Prepaid- Actual Prepaid Charges.
     */
    private BigDecimal awbTotalPpd;

    /**
     * Freight Bill Total Weight Charge - Actual Weight Charges.
     */
    private BigDecimal awbTotalWeightCharge;

    /**
     * Cash on delivery currency code.
     */
    private String codCur;

    /**
     * COD Exchange Rate (Bank Selling Rate).
     */
    private BigDecimal codExchangeRate;

    /**
     * Displayable Total Collect Shipment Charges- Face collect Charges.
     */
    private BigDecimal displayTotalColCharges;

    /**
     * Displayable Total Prepaid Shipment Charges - Face Prepaid Charges.
     */
    private BigDecimal displayTotalPpdCharges;

    /**
     * Displayable Total Weight Charge - Prepaid Weight Charges.
     */
    private BigDecimal displayTotalWeightCharge;

    /**
     * Unique objectID for persistence.
     */
    private Long oId;

    /**
     * Printable Total Collect Shipment Charges - Published Collect Charges.
     */
    private BigDecimal printableTotalColCharges;

    /**
     * Printable Total Weight Charge - PprintableTotalDestinationCharge.
     */
    private BigDecimal printableTotalDestinationCharge;

    /**
     * Printable Total Prepaid Shipment Charges - Published Prepaid Charges.
     */
    private BigDecimal printableTotalPpdCharges;

    /**
     * Printable Total Weight Charge - Published Weight Charges.
     */
    private BigDecimal printableTotalWeightCharge;

    /**
     * Cash on delivery amount.
     */
    private BigDecimal totalCodAmount;

    /**
     * Indicator showing how data item FRAVCH was generated.
     * <ul>
     * <li>M - manually generated</li>
     * <li>G - system generated</li>
     * </ul>
     */
    private String valuationChargeGeneration;

    /**
     * Valuation Charges for shipment.
     */
    private BigDecimal valuationCharges;

    /**
     * Gets the <code>AwbDestination</code> property.
     * <p>
     * 
     * @return the current value of the <code>AwbDestination</code> property.
     */

    public BigDecimal getAwbDestination() {
        return this.awbDestination;
    }

    /**
     * Gets the <code>awbTotalCol</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbTotalCol</code> property.
     */

    public BigDecimal getAwbTotalCol() {
        if (this.awbTotalCol != null) {
            this.awbTotalCol = this.awbTotalCol.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        }
        return this.awbTotalCol;
    }

    /**
     * Gets the <code>awbTotalPpd</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbTotalPpd</code> property.
     */

    public BigDecimal getAwbTotalPpd() {
        if (this.awbTotalPpd != null) {
            this.awbTotalPpd = this.awbTotalPpd.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        }
        return this.awbTotalPpd;
    }

    /**
     * Gets the <code>awbTotalWeightCharge</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbTotalWeightCharge</code> property.
     */

    public BigDecimal getAwbTotalWeightCharge() {
        if (this.awbTotalWeightCharge != null) {
            this.awbTotalWeightCharge = this.awbTotalWeightCharge.setScale(2,
                BigDecimal.ROUND_HALF_EVEN);
        }
        return this.awbTotalWeightCharge;
    }

    /**
     * Gets the <code>codCur</code> property.
     * <p>
     * 
     * @return the current value of the <code>codCur</code> property.
     */

    public String getCodCur() {
        return this.codCur;
    }

    /**
     * Gets the <code>codExchangeRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>codExchangeRate</code> property.
     */

    public BigDecimal getCodExchangeRate() {
        if (this.codExchangeRate != null) {
            this.codExchangeRate = this.codExchangeRate.setScale(2,
                BigDecimal.ROUND_HALF_EVEN);
        }
        return this.codExchangeRate;
    }

    /**
     * Gets the <code>displayTotalColCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>displayTotalColCharges</code> property.
     */

    public BigDecimal getDisplayTotalColCharges() {
        if (this.displayTotalColCharges != null) {
            this.displayTotalColCharges = this.displayTotalColCharges.setScale(2,
                BigDecimal.ROUND_HALF_EVEN);
        }
        return this.displayTotalColCharges;
    }

    /**
     * Gets the <code>displayTotalColCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>displayTotalColCharges</code> property.
     */

    public BigDecimal getDisplayTotalPpdCharges() {
        if (this.displayTotalPpdCharges != null) {
            this.displayTotalPpdCharges = this.displayTotalPpdCharges.setScale(2,
                BigDecimal.ROUND_HALF_EVEN);
        }
        return this.displayTotalPpdCharges;
    }

    /**
     * Gets the <code>displayTotalColCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>displayTotalColCharges</code> property.
     */

    public BigDecimal getDisplayTotalWeightCharge() {
        if (this.displayTotalWeightCharge != null) {
            this.displayTotalWeightCharge = this.displayTotalWeightCharge.setScale(2,
                BigDecimal.ROUND_HALF_EVEN);
        }
        return this.displayTotalWeightCharge;
    }

    /**
     * Gets the <code>displayTotalColCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>displayTotalColCharges</code> property.
     */

    @Override
    public Long getOId() {

        return this.oId;
    }

    /**
     * Gets the <code>displayTotalColCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>displayTotalColCharges</code> property.
     */

    public BigDecimal getPrintableTotalColCharges() {
        if (this.printableTotalColCharges != null) {
            this.printableTotalColCharges = this.printableTotalColCharges.setScale(2,
                BigDecimal.ROUND_HALF_EVEN);
        }
        return this.printableTotalColCharges;
    }

    /**
     * Gets the <code>printableTotalDestinationCharge</code> property.
     * <p>
     * 
     * @return the current value of the <code>printableTotalDestinationCharge</code> property.
     */
    public BigDecimal getPrintableTotalDestinationCharge() {
        return this.printableTotalDestinationCharge;
    }

    /**
     * Gets the <code>printableTotalPpdCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>printableTotalPpdCharges</code> property.
     */

    public BigDecimal getPrintableTotalPpdCharges() {
        if (this.printableTotalPpdCharges != null) {
            this.printableTotalPpdCharges = this.printableTotalPpdCharges.setScale(2,
                BigDecimal.ROUND_HALF_EVEN);
        }
        return this.printableTotalPpdCharges;
    }

    /**
     * Gets the <code>printableTotalWeightCharge</code> property.
     * <p>
     * 
     * @return the current value of the <code>printableTotalWeightCharge</code> property.
     */

    public BigDecimal getPrintableTotalWeightCharge() {
        if (this.printableTotalWeightCharge != null) {
            this.printableTotalWeightCharge = this.printableTotalWeightCharge.setScale(2,
                BigDecimal.ROUND_HALF_EVEN);
        }
        return this.printableTotalWeightCharge;
    }

    /**
     * Gets the <code>totalCodAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalCodAmount</code> property.
     */

    public BigDecimal getTotalCodAmount() {
        if (this.totalCodAmount != null) {
            this.totalCodAmount = this.totalCodAmount.setScale(2,
                BigDecimal.ROUND_HALF_EVEN);
        }
        return this.totalCodAmount;
    }

    /**
     * Gets the <code>valuationChargeGeneration</code> property.
     * <p>
     * 
     * @return the current value of the <code>valuationChargeGeneration</code> property.
     */

    public String getValuationChargeGeneration() {
        return this.valuationChargeGeneration;
    }

    /**
     * Gets the <code>valuationCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>valuationCharges</code> property.
     */

    public BigDecimal getValuationCharges() {
        return this.valuationCharges;
    }

    public void setAwbDestination(final BigDecimal pAwbDestination) {
        this.awbDestination = pAwbDestination;
    }

    /**
     * Sets the <code>pAwbTotalCol</code> property.
     * <p>
     * 
     * @param pAwbTotalCol
     *            holds the new value of <code>pAwbTotalCol</code>.<br>
     */

    public void setAwbTotalCol(final BigDecimal pAwbTotalCol) {
        this.awbTotalCol = pAwbTotalCol;
    }

    /**
     * Sets the <code>pAwbTotalPpd</code> property.
     * <p>
     * 
     * @param pAwbTotalPpd
     *            holds the new value of <code>pAwbTotalPpd</code>.<br>
     */

    public void setAwbTotalPpd(final BigDecimal pAwbTotalPpd) {
        this.awbTotalPpd = pAwbTotalPpd;
    }

    /**
     * Sets the <code>pAwbTotalWeightCharge</code> property.
     * <p>
     * 
     * @param pAwbTotalWeightCharge
     *            holds the new value of <code>pAwbTotalWeightCharge</code>.<br>
     */

    public void setAwbTotalWeightCharge(final BigDecimal pAwbTotalWeightCharge) {
        this.awbTotalWeightCharge = pAwbTotalWeightCharge;
    }

    /**
     * Sets the <code>pCodCur</code> property.
     * <p>
     * 
     * @param pCodCur
     *            holds the new value of <code>pCodCur</code>.<br>
     */

    public void setCodCur(final String pCodCur) {
        this.codCur = ContractUtility.convertToUpperCase(pCodCur);
    }

    /**
     * Sets the <code>pCodExchangeRate</code> property.
     * <p>
     * 
     * @param pCodExchangeRate
     *            holds the new value of <code>pCodExchangeRate</code>.<br>
     */

    public void setCodExchangeRate(final BigDecimal pCodExchangeRate) {
        this.codExchangeRate = pCodExchangeRate;
    }

    /**
     * Sets the <code>pDisplayTotalColCharges</code> property.
     * <p>
     * 
     * @param pDisplayTotalColCharges
     *            holds the new value of <code>pDisplayTotalColCharges</code>.<br>
     */

    public void setDisplayTotalColCharges(final BigDecimal pDisplayTotalColCharges) {
        this.displayTotalColCharges = pDisplayTotalColCharges;
    }

    /**
     * Sets the <code>pDisplayTotalPpdCharges</code> property.
     * <p>
     * 
     * @param pDisplayTotalPpdCharges
     *            holds the new value of <code>pDisplayTotalPpdCharges</code>.<br>
     */

    public void setDisplayTotalPpdCharges(final BigDecimal pDisplayTotalPpdCharges) {
        this.displayTotalPpdCharges = pDisplayTotalPpdCharges;
    }

    /**
     * Sets the <code>pDisplayTotalWeightCharge</code> property.
     * <p>
     * 
     * @param pDisplayTotalWeightCharge
     *            holds the new value of <code>pDisplayTotalWeightCharge</code>.<br>
     */

    public void setDisplayTotalWeightCharge(final BigDecimal pDisplayTotalWeightCharge) {
        this.displayTotalWeightCharge = pDisplayTotalWeightCharge;
    }

    /**
     * Sets the <code>pOId</code> property.
     * <p>
     * 
     * @param pOId
     *            holds the new value of <code>pOId</code>.<br>
     */

    public void setOId(final Long pOId) {

        this.oId = pOId;
    }

    /**
     * Sets the <code>pPrintableTotalColCharges</code> property.
     * <p>
     * 
     * @param pPrintableTotalColCharges
     *            holds the new value of <code>pPrintableTotalColCharges</code>.<br>
     */

    public void setPrintableTotalColCharges(final BigDecimal pPrintableTotalColCharges) {
        this.printableTotalColCharges = pPrintableTotalColCharges;
    }

    /**
     * Sets the <code>PrintableTotalDestinationCharge</code> property.
     * <p>
     * 
     * @param pPrintableTotalDestinationCharge
     *            holds the new value of <code>printableTotalDestinationCharge</code>.<br>
     */
    public void setPrintableTotalDestinationCharge(
                final BigDecimal pPrintableTotalDestinationCharge) {
        this.printableTotalDestinationCharge = pPrintableTotalDestinationCharge;
    }

    /**
     * Sets the <code>printableTotalPpdCharges</code> property.
     * <p>
     * 
     * @param pPrintableTotalPpdCharges
     *            holds the new value of <code>printableTotalPpdCharges</code>.<br>
     */

    public void setPrintableTotalPpdCharges(final BigDecimal pPrintableTotalPpdCharges) {
        this.printableTotalPpdCharges = pPrintableTotalPpdCharges;
    }

    /**
     * Sets the <code>printableTotalWeightCharge</code> property.
     * <p>
     * 
     * @param pPrintableTotalWeightCharge
     *            holds the new value of <code>printableTotalWeightCharge</code>.<br>
     */

    public void setPrintableTotalWeightCharge(
                final BigDecimal pPrintableTotalWeightCharge) {
        this.printableTotalWeightCharge = pPrintableTotalWeightCharge;
    }

    /**
     * Sets the <code>totalCodAmount</code> property.
     * <p>
     * 
     * @param pTotalCodAmount
     *            holds the new value of <code>totalCodAmount</code>.<br>
     */

    public void setTotalCodAmount(final BigDecimal pTotalCodAmount) {
        this.totalCodAmount = pTotalCodAmount;
    }

    /**
     * Sets the <code>valuationChargeGeneration</code> property.
     * <p>
     * 
     * @param pValuationChargeGeneration
     *            holds the new value of <code>valuationChargeGeneration</code>.<br>
     */

    public void setValuationChargeGeneration(final String pValuationChargeGeneration) {
        this.valuationChargeGeneration = pValuationChargeGeneration;
    }

    /**
     * Sets the <code>valuationCharges</code> property.
     * <p>
     * 
     * @param pValuationCharges
     *            holds the new value of <code>valuationCharges</code>.<br>
     */

    public void setValuationCharges(final BigDecimal pValuationCharges) {
        this.valuationCharges = pValuationCharges;
    }

}
