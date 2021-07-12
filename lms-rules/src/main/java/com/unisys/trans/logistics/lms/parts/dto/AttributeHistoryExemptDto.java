package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class AttributeHistoryExemptDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = -8114829755270670629L;
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    private Boolean automaticEQA;

    private Boolean bookingChargeExemption;

    /**
     * Attribute to hold <code>commercialAccountRestrictionIndicator</code> property. It determines whether
     * the participant can be a shipper or a
     * consignee to any shipment. If set to false, then, the participant cannot
     * be associated with any shipment as either Shipper or Consignee.
     */
    private Boolean commercialAccountRestrictionIndicator;
    /**
     * Attribute to hold <code>customsNominatedAgentStatus</code> property.
     */
    private Boolean customsNominatedAgentStatus;

    /**
     * Attribute to hold <code>ediHouseAWBFeeEntryRestrictionIndicator</code> property. It denotes whether the
     * participant is exempted of the EDI House
     * entry fee charge.
     */
    private Boolean ediHouseAWBFeeEntryRestrictionIndicator;

    private Boolean fsuCharge;

    /**
     * Attribute to hold <code>govtTaxExemptIndicator</code> property. Indicator
     * to indicate that the participant is exempted from the assessment of
     * government tax.
     */

    private Boolean govtTaxExemptIndicator;
    /**
     * Attribute to hold <code>iataAgentPrepaidChargesIndicator</code> property.
     * It denotes that the IATA agent is responsible for the Waybill prepaid
     * charges and credit limits.
     */
    private Boolean iataAgentPrepaidChargesIndicator;

    /**
     * Attribute to hold <code>manualHouseAWBFeeRestrictionIndicator</code> property. It denotes whether the
     * participant is exempted of the Manual
     * House entry fee charge.
     */
    private Boolean manualHouseAWBFeeRestrictionIndicator;
    
    /**
     * Attribute to hold <code>noShipmentIndicator</code> property. It denotes
     * whether the participant can be a Shipper for any shipment.
     */
    private Boolean noShipmentIndicator;
    
    /**
     * Attribute to hold <code>restrictedArticlesExemptIndicator</code> property. It denotes that the
     * participant is exempted of restricted
     * Articles charge (RA) in case of dangerous goods being shipped.
     */
    private Boolean restrictedArticlesExemptIndicator;
    
    private Boolean restrictedChargeExemption;
    
    /**
     * Attribute to hold <code>stateTaxExemptIndicator</code> property. It is
     * used to denote that the participant is exempted from assessment of State
     * tax.
     */
    private Boolean stateTaxExemptIndicator;
    
    /**
     * Attribute to hold <code>valuableCargoExemptIndicator</code> property. The
     * participant is exempted of the Valuable Cargo charge, (VL) in case the
     * shipment involves valuable goods.
     */
    private Boolean valuableCargoExemptIndicator;

    public Boolean getAutomaticEQA() {
        return automaticEQA;
    }

    public Boolean getBookingChargeExemption() {
        return bookingChargeExemption;
    }

    /**
     * Gets the <code>commercialAccountRestrictionIndicator</code> property.
     * <p>
     * Indicator that determines whether the participant can be a shipper or Consignee to any shipment.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The participant can be a shipper or consignee to any shipment.
     * <li><code>false</code><br>
     * The participant cannot be a shipper or consignee to any shipment.
     * <p>
     * 
     * @return the current value of <code>commercialAccountRestrictionIndicator </code> property.<br>
     */
    public Boolean getCommercialAccountRestrictionIndicator() {
        return this.commercialAccountRestrictionIndicator;
    }

    /**
     * Gets the <code>customsNominatedAgentStatus</code> property.
     * <p>
     * Indicates the customs nominated Agent status.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * Customs nominated agent status is automated.
     * <li><code>false</code><br>
     * Customs nominated agent status is not automated.<br>
     * <p>
     * 
     * @return the current value of <code>customsNominatedAgentStatus</code> property.<br>
     */
    public Boolean getCustomsNominatedAgentStatus() {
        return this.customsNominatedAgentStatus;
    }

    /**
     * Gets the <code>ediHouseAWBFeeEntryRestrictionIndicator</code> property.
     * <p>
     * Indicator that denotes whether the participant is exempt of the EDI House entry fee charge.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The participant is exempted from the EDI House entry fee charge.
     * <li><code>false</code><br>
     * The participant is not exempted from the EDI House entry fee charge.<br>
     * <p>
     * 
     * @return the current value of <code> ediHouseAWBFeeEntryRestrictionIndicator</code> property.<br>
     */
    public Boolean getEdiHouseAWBFeeEntryRestrictionIndicator() {
        return this.ediHouseAWBFeeEntryRestrictionIndicator;
    }

    public Boolean getFsuCharge() {
        return fsuCharge;
    }

    /**
     * Gets the <code>govtTaxExemptIndicator</code> property.
     * <p>
     * Indicator that participant is exempt from the assessment of government tax.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The participant is exempted from the assessment of government tax.
     * <li><code>false</code><br>
     * The participant is not exempted from the assessment of government tax.<br>
     * <p>
     * 
     * @return the current value of <code>govtTaxExemptIndicator</code> property.<br>
     */
    public Boolean getGovtTaxExemptIndicator() {
        return this.govtTaxExemptIndicator;
    }

    /**
     * Gets the <code>iataAgentPrepaidChargesIndicator</code> property.
     * <p>
     * Indicator that denotes that the IATA agent is responsible for the Waybill
     * prepaid charges and credit limits.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The IATA agent is explicitly responsible for Waybill Prepaid charges and
     * Credit limits.
     * <li><code>false</code><br>
     * The IATA agent is not responsible for Waybill Prepaid charges and Credit
     * limits.<br>
     * <p>
     * 
     * @return the current value of <code>iataAgentPrepaidChargesIndicator
     *         </code> property.<br>
     */
    public Boolean getIataAgentPrepaidChargesIndicator() {
        return this.iataAgentPrepaidChargesIndicator;
    }

    /**
     * Gets the <code>manualHouseAWBFeeRestrictionIndicator</code> property.
     * <p>
     * Indicator that denotes whether the participant is exempt of the Manual House entry fee charge
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The participant is exempted from the Manual House entry fee charge.
     * <li><code>false</code><br>
     * The participant is not exempted from the Manual House entry fee charge.<br>
     * <p>
     * 
     * @return the current value of <code>manualHouseAWBFeeRestrictionIndicator </code> property.<br>
     */
    public Boolean getManualHouseAWBFeeRestrictionIndicator() {
        return this.manualHouseAWBFeeRestrictionIndicator;
    }

    /**
     * Gets the <code>noShipmentIndicator</code> property.
     * <p>
     * Indicator that denotes whether the participant can be a Shipper for any shipment or not.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The participant can be a shipper.
     * <li><code>false</code><br>
     * The participant cannot be a shipper.<br>
     * <p>
     * 
     * @return the current value of <code>noShipmentIndicator</code> property.<br>
     */
    public Boolean getNoShipmentIndicator() {
        return this.noShipmentIndicator;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Gets the <code>restrictedArticlesExemptIndicator</code> property.
     * <p>
     * Indicator that the participant is exempt of restricted Articles charge (RA) in case of dangerous goods
     * being shipped.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The participant is exempted from restricted articles charge.
     * <li><code>false</code><br>
     * The participant is not exempted from restricted articles charge.<br>
     * <p>
     * 
     * @return the current value of <code>restrictedArticlesExemptIndicator </code> property.<br>
     */
    public Boolean getRestrictedArticlesExemptIndicator() {
        return this.restrictedArticlesExemptIndicator;
    }

    public Boolean getRestrictedChargeExemption() {
        return restrictedChargeExemption;
    }

    /**
     * Gets the <code>stateTaxExemptIndicator</code> property.
     * <p>
     * Indicator that the participant is exempt from assessment of State tax.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The participant is exempted from assessment of State tax.
     * <li><code>false</code><br>
     * The participant is not exempted from assessment of State tax.<br>
     * <p>
     * 
     * @return the current value of <code>stateTaxExemptIndicator</code> property.<br>
     */
    public Boolean getStateTaxExemptIndicator() {
        return this.stateTaxExemptIndicator;
    }
    /**
     * Gets the <code>valuableCargoExemptIndicator</code> property.
     * <p>
     * Indicator that the participant is exempt of the Valuable Cargo charge, (VL) in case the shipment
     * involves valuable goods.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The participant is exempted from the Valuable Cargo charge.
     * <li><code>false</code><br>
     * The participant is not exempted from the Valuable Cargo charge.<br>
     * <p>
     * 
     * @return the current value of <code>valuableCargoExemptIndicator</code> property.<br>
     */
    public Boolean getValuableCargoExemptIndicator() {
        return this.valuableCargoExemptIndicator;
    }

    public void setAutomaticEQA(Boolean automaticEQA) {
        this.automaticEQA = automaticEQA;
    }

    public void setBookingChargeExemption(Boolean bookingChargeExemption) {
        this.bookingChargeExemption = bookingChargeExemption;
    }
    /**
     * Sets the <code>commercialAccountRestrictionIndicator</code> property.
     * <p>
     * Indicator that determines whether the participant can be a shipper or Consignee to any shipment.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The participant can be a shipper or consignee to any shipment.
     * <li><code>false</code><br>
     * The participant cannot be a shipper or consignee to any shipment.<br>
     * <p>
     * 
     * @param pCommercialAccountRestrictionIndicator
     *            the new value of <code> commercialAccountRestrictionIndicator </code> property.<bR>
     */
    public void setCommercialAccountRestrictionIndicator(
                final Boolean pCommercialAccountRestrictionIndicator) {
        this.commercialAccountRestrictionIndicator = pCommercialAccountRestrictionIndicator;
    }

    /**
     * Sets the <code>customsNominatedAgentStatus</code> property.
     * <p>
     * Indicates the customs nominated Agent status.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * Customs nominated agent status is automated.
     * <li><code>false</code><br>
     * Customs nominated agent status is not automated.<br>
     * <p>
     * 
     * @param pCustomsNominatedAgentStatus
     *            the new value of <code>customsNominatedAgentStatus</code> property.<bR>
     */
    public void setCustomsNominatedAgentStatus(
                final Boolean pCustomsNominatedAgentStatus) {
        this.customsNominatedAgentStatus = pCustomsNominatedAgentStatus;
    }

    /**
     * Sets the <code>ediHouseAWBFeeEntryRestrictionIndicator</code> property.
     * <p>
     * Indicator that denotes whether the participant is exempt of the EDI House entry fee charge.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The participant is exempted from the EDI House entry fee charge.
     * <li><code>false</code><br>
     * The participant is not exempted from the EDI House entry fee charge.<br>
     * <p>
     * 
     * @param pEdiHouseAWBFeeEntryRestrictionIndicator
     *            the new value of <code> ediHouseAWBFeeEntryRestrictionIndicator</code> property.<bR>
     */
    public void setEdiHouseAWBFeeEntryRestrictionIndicator(
                final Boolean pEdiHouseAWBFeeEntryRestrictionIndicator) {
        this.ediHouseAWBFeeEntryRestrictionIndicator = pEdiHouseAWBFeeEntryRestrictionIndicator;
    }
    public void setFsuCharge(Boolean fsuCharge) {
        this.fsuCharge = fsuCharge;
    }

    /**
     * Sets the <code>govtTaxExemptIndicator</code> property.
     * <p>
     * Indicator that participant is exempt from the assessment of government tax.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The participant is exempted from the assessment of government tax.
     * <li><code>false</code><br>
     * The participant is not exempted from the assessment of government tax.<br>
     * <p>
     * 
     * @param pGovtTaxExemptIndicator
     *            the new value of <code>govtTaxExemptIndicator</code> property.<bR>
     */
    public void setGovtTaxExemptIndicator(final Boolean pGovtTaxExemptIndicator) {
        this.govtTaxExemptIndicator = pGovtTaxExemptIndicator;
    }

    /**
     * Sets the <code>iataAgentPrepaidChargesIndicator</code> property.
     * <p>
     * Indicator that denotes that the IATA agent is responsible for the Waybill
     * prepaid charges and credit limits.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The IATA agent is explicitly responsible for Waybill Prepaid charges and
     * Credit limits.
     * <li><code>false</code><br>
     * The IATA agent is not responsible for Waybill Prepaid charges and Credit
     * limits.<br>
     * <p>
     * 
     * @param pIataAgentPrepaidChargesIndicator
     *            the new value of <code>iataAgentPrepaidChargesIndicator</code>
     *            property.<bR>
     */
    public void setIataAgentPrepaidChargesIndicator(
            final Boolean pIataAgentPrepaidChargesIndicator) {
        this.iataAgentPrepaidChargesIndicator = pIataAgentPrepaidChargesIndicator;
    }
    /**
     * Sets the <code>manualHouseAWBFeeRestrictionIndicator</code> property.
     * <p>
     * Indicator that denotes whether the participant is exempt of the Manual House entry fee charge.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The participant is exempted from the Manual House entry fee charge.
     * <li><code>false</code><br>
     * The participant is not exempted from the Manual House entry fee charge.<br>
     * <p>
     * 
     * @param pManualHouseAWBFeeRestrictionIndicator
     *            the new value of <code> manualHouseAWBFeeRestrictionIndicator </code> property.<bR>
     */
    public void setManualHouseAWBFeeRestrictionIndicator(
                final Boolean pManualHouseAWBFeeRestrictionIndicator) {
        this.manualHouseAWBFeeRestrictionIndicator = pManualHouseAWBFeeRestrictionIndicator;
    }
    /**
     * Sets the <code>noShipmentIndicator</code> property.
     * <p>
     * Indicator that denotes whether the participant can be a Shipper for any shipment or not.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The participant can be a shipper.
     * <li><code>false</code><br>
     * The participant cannot be a shipper.<br>
     * <p>
     * 
     * @param pNoShipmentIndicator
     *            the new value of <code>noShipmentIndicator</code> property.<bR>
     */
    public void setNoShipmentIndicator(final Boolean pNoShipmentIndicator) {
        this.noShipmentIndicator = pNoShipmentIndicator;
    }
    /**
     * Sets the <code>restrictedArticlesExemptIndicator</code> property.
     * <p>
     * Indicator that the participant is exempt of restricted Articles charge (RA) in case of dangerous goods
     * being shipped.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The participant is exempted from restricted articles charge.
     * <li><code>false</code><br>
     * The participant is not exempted from restricted articles charge.<br>
     * <p>
     * 
     * @param pRestrictedArticlesExemptIndicator
     *            the new value of <code>restrictedArticlesExemptIndicator </code> property.<bR>
     */
    public void setRestrictedArticlesExemptIndicator(
                final Boolean pRestrictedArticlesExemptIndicator) {
        this.restrictedArticlesExemptIndicator = pRestrictedArticlesExemptIndicator;
    }

    public void setRestrictedChargeExemption(Boolean restrictedChargeExemption) {
        this.restrictedChargeExemption = restrictedChargeExemption;
    }

    /**
     * Sets the <code>stateTaxExemptIndicator</code> property.
     * <p>
     * Indicator that the participant is exempt from assessment of State tax.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The participant is exempted from assessment of State tax.
     * <li><code>false</code><br>
     * The participant is not exempted from assessment of State tax.<br>
     * <p>
     * 
     * @param pStateTaxExemptIndicator
     *            the new value of <code>stateTaxExemptIndicator</code> property.<bR>
     */
    public void setStateTaxExemptIndicator(
                final Boolean pStateTaxExemptIndicator) {
        this.stateTaxExemptIndicator = pStateTaxExemptIndicator;
    }

    /**
     * Sets the <code>valuableCargoExemptIndicator</code> property.
     * <p>
     * Indicator that the participant is exempt of the Valuable Cargo charge, (VL) in case the shipment
     * involves valuable goods.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The participant is exempted from the Valuable Cargo charge.
     * <li><code>false</code><br>
     * The participant is not exempted from the Valuable Cargo charge.<br>
     * <p>
     * 
     * @param pValuableCargoExemptIndicator
     *            the new value of <code>valuableCargoExemptIndicator</code> property.<bR>
     */
    public void setValuableCargoExemptIndicator(
                final Boolean pValuableCargoExemptIndicator) {
        this.valuableCargoExemptIndicator = pValuableCargoExemptIndicator;
    }

}
