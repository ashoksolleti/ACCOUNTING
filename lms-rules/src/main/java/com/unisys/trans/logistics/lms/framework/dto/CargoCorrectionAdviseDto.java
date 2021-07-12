/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>CargoCorrectionAdviseDto</code> contain details of CargoCorrectionAdvise.
 * <p>
 * This contains all information about CargoCorrectionAdvise.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>prevDisplayableCCAChargesDto
 * <li>prevActualCCAChargesDto
 * <li>prevPrintableCCAChargesDto
 * <li>revDisplayableCCAChargesDto
 * <li>revActualCCAChargesDto
 * <li>revPrintableCCAChargesDto
 * <li>routingSegmentOne
 * <li>routingSegmentTwo
 * <li>routingSegmentThree
 * <li>correctionAdviceRemarks
 * <li>correctionAdviceAdditionalRemarks
 * <li>referenceNumber
 * <li>autoAddCCAFeeOverrideInd
 * <li>executionDate
 * <li>station
 * <li>autoAddIndicator
 * <li>caMiscChargeAmt
 * <li>miscelleneousChargesIndicator
 * <li>lockIndicator
 * </ul>
 */
public class CargoCorrectionAdviseDto extends PersistenceObjectDto {
    /**
     * Default Serial Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>actualIssuingStation</code> property.
     */
    private String actualIssuingStation;

    /**
     * Attribute to Hold the <code>additionalAdd1</code>
     */
    private String additionalAdd1;

    /**
     * Attribute to Hold the <code>additionalAdd2</code>
     */
    private String additionalAdd2;

    /**
     * Attribute to Hold the <code>additionalAdd3</code>
     */
    private String additionalAdd3;

    /**
     * Attribute to Hold the <code>additionalAdd4</code>
     */
    private String additionalAdd4;

    /**
     * Attribute to Hold the <code>additionalAdd5</code>
     */
    private String additionalAdd5;

    /**
     * Attribute to Hold the <code>additionalAdd6</code>
     */
    private String additionalAdd6;

    /**
     * Attribute to Hold the <code>additionalEmailEight</code>
     */
    private String additionalEmailEight = "";

    /**
     * Attribute to Hold the <code>additionalEmailEleven</code>
     */
    private String additionalEmailEleven = "";

    /**
     * Attribute to Hold the <code>additionalEmailFive</code>
     */
    private String additionalEmailFive = "";

    /**
     * Attribute to Hold the <code>additionalEmailFour</code>
     */
    private String additionalEmailFour = "";

    /**
     * Attribute to Hold the <code>additionalEmailNine</code>
     */
    private String additionalEmailNine = "";

    /**
     * Attribute to Hold the <code>agentEmailCheck</code>
     */
    private String additionalEmailOne = "";

    /**
     * Attribute to Hold the <code>additionalEmailSeven</code>
     */
    private String additionalEmailSeven = "";

    /**
     * Attribute to Hold the <code>additionalEmailSix</code>
     */
    private String additionalEmailSix = "";

    /**
     * Attribute to Hold the <code>additionalEmailTen</code>
     */
    private String additionalEmailTen = "";

    /**
     * Attribute to Hold the <code>additionalEmailThree</code>
     */
    private String additionalEmailThree = "";

    /**
     * Attribute to Hold the <code>additionalEmailTwo</code>
     */
    private String additionalEmailTwo = "";

    /**
     * Attribute to Hold the <code>agentEmail</code>
     */
    private String agentEmail = "";

    /**
     * Attribute to Hold the <code>agentEmailCheck</code>
     */
    private boolean agentEmailCheck;

    /**
     * Attribute to hold <code>airlineName</code>.
     */
    private String airlineName;

    /**
     * Attribute to hold <code>actualIssuingStation</code> property.
     */
    private AirWaybillDto airWaybillDto;

    /**
     * Attribute to Hold the <code>allowAutoAddCCAOption</code>
     */
    private boolean allowAutoAddCCAOption = true;

    /**
     * Attribute to hold <code>autoAddCcaFeeIndicator</code> property.
     */
    private boolean autoAddCcaFeeIndicator;

    /**
     * Attribute to hold <code>autoAddCCAFeeOverrideInd</code> property.
     */
    private boolean autoAddCCAFeeOverrideInd;

    /**
     * Attribute to hold <code>autoAddIndicator</code> property.
     */
    private boolean autoAddIndicator;

    /**
     * Attribute to Hold the <code>bookingEmail</code>
     */
    private String bookingEmail = "";

    /**
     * Attribute to Hold the <code>bookingEmailCheck</code>
     */
    private boolean bookingEmailCheck = false;

    /**
     * Attribute to hold <code>caMiscChargeAmt</code> property.
     */
    private BigDecimal caMiscChargeAmt;

    /**
     * Attribute to hold <code>ccaCreatedStation</code> property.
     */
    private String ccaCreatedStation;

    /**
     * Attribute to Hold the <code>ccaLocked</code>
     */
    private boolean ccaLocked;

    /**
     * Attribute to hold <code>ccaLockedPriorEQA</code> property.
     */
    private String ccaLockedPriorEQA;

    /**
     * Attribute to Hold the <code>consigneeEmail</code>
     */
    private String consigneeEmail = "";

    /**
     * Attribute to Hold the <code>consigneeEmailCheck</code>
     */
    private boolean consigneeEmailCheck = false;

    /**
     * Attribute to hold <code>correctionAdviceAdditionalRemarks</code> property.
     */
    private String correctionAdviceAdditionalRemarks;

    /**
     * Attribute to hold <code>correctionAdviceRemarks</code> property.
     */
    private String correctionAdviceRemarks;

    /**
     * Attribute to hold <code>ccaLockSuccess</code>.
     */
    private boolean currentCCALockSuccess;

    /**
     * Attribute to Hold the <code> emailContentAsPrint</code>
     */
    private String emailContentAsPrint;

    /**
     * Attribute to Hold the <code>emailRemarks</code>
     */
    private String emailRemarks = "";

    /**
     * Attribute to hold <code>eqaAuthorityRequiredIndicator</code> property.
     */
    private boolean eqaAuthorityRequiredIndicator;

    /**
     * Attribute to hold <code>executionDate</code> property.
     */
    private Date executionDate;

    /**
     * Attribute to hold <code>miscelleneousChargesIndicator</code> property.
     */
    private String miscelleneousChargesIndicator;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>prevCollectDisplayableTotalCharges</code>.
     */
    private BigDecimal prevCollectDisplayableTotalCharges;

    /**
     * Attribute to hold <code>prevCollectPrintableWeightCharges</code>.
     */
    private BigDecimal prevCollectDisplayableWeightCharges;

    /**
     * Attribute to hold <code>Collect Due Agent Charges</code>.
     */
    private BigDecimal prevCollectDueAgentCharges;

    /**
     * Attribute to hold <code>Collect Due Carrier Charges</code>.
     */
    private BigDecimal prevCollectDueCarrierCharges;

    /**
     * Attribute to hold <code>prevCollectPrintableTotalCharges</code>.
     */
    private BigDecimal prevCollectPrintableTotalCharges;

    /**
     * Attribute to hold <code>prevCollectPrintableWeightCharges</code>.
     */
    private BigDecimal prevCollectPrintableWeightCharges;

    /**
     * Attribute to hold <code>Collect Total Charges</code>.
     */
    private BigDecimal prevCollectTotalCharges;

    /**
     * Attribute to hold <code>prevCollectTotalsInd</code> property.
     */
    private Boolean prevCollectTotalsInd;

    /**
     * Attribute to hold <code>Collect Valuation Charges</code>.
     */
    private BigDecimal prevCollectValuationCharges;

    /**
     * Attribute to hold <code>Collect Weight Charges</code>.
     */
    private BigDecimal prevCollectWeightCharges;

    /**
     * Attribute to hold <code>Destination Currency</code>.
     */
    private String prevDestinationCurrency;

    /**
     * Attribute to hold <code>ExchangeRates</code>.
     */
    private BigDecimal prevExchangeRates;

    /**
     * Attribute to hold <code>prevPrepaidDisplayableTotalCharges</code>.
     */
    private BigDecimal prevPrepaidDisplayableTotalCharges;

    /**
     * Attribute to hold <code>prevPrepaiDisplayableWeightCharges</code>.
     */
    private BigDecimal prevPrepaidDisplayableWeightCharges;

    /**
     * Attribute to hold <code>prevPrepaidDueAgentCharges</code>.
     */
    private BigDecimal prevPrepaidDueAgentCharges;

    /**
     * Attribute to hold <code>prevPrepaidDueCarrierChargess</code>.
     */
    private BigDecimal prevPrepaidDueCarrierCharges;

    /**
     * Attribute to hold <code>prevPrepaidPrintableTotalCharges</code>.
     */
    private BigDecimal prevPrepaidPrintableTotalCharges;

    /**
     * Attribute to hold <code>prevPrepaiPrintableWeightCharges</code>.
     */
    private BigDecimal prevPrepaidPrintableWeightCharges;

    /**
     * Attribute to hold <code>prevPrepaidTotalCharges</code>.
     */
    private BigDecimal prevPrepaidTotalCharges;

    /**
     * Attribute to hold <code>prevPrepaidTotalsInd</code> property.
     */
    private Boolean prevPrepaidTotalsInd;

    /**
     * Attribute to hold <code>prevPrepaidValuationCharges</code>.
     */
    private BigDecimal prevPrepaidValuationCharges;

    /**
     * Attribute to hold <code>prevPrepaidWeightCharges</code>.
     */
    private BigDecimal prevPrepaidWeightCharges;

    /**
     * Attribute to hold <code>referenceNumber</code> property.
     */
    private CcaReferenceNumberDto referenceNumber;

    /**
     * Attribute to hold <code>RevCollectDisplayableTotalCharges</code>.
     */
    private BigDecimal revCollectDisplayableTotalCharges;

    /**
     * Attribute to hold <code>RevCollectDisplayableWeightCharges</code>.
     */
    private BigDecimal revCollectDisplayableWeightCharges;

    /**
     * Attribute to hold <code>Collect Due Agent Charges</code>.
     */
    private BigDecimal revCollectDueAgentCharges;

    /**
     * Attribute to hold <code>Collect Due Carrier Charges</code>.
     */
    private BigDecimal revCollectDueCarrierCharges;

    /**
     * Attribute to hold <code>RevCollectPrintableTotalCharges</code>.
     */
    private BigDecimal revCollectPrintableTotalCharges;

    /**
     * Attribute to hold <code>RevCollectPrintableWeightCharges</code>.
     */
    private BigDecimal revCollectPrintableWeightCharges;

    /**
     * Attribute to hold <code>Collect Total Charges</code>.
     */
    private BigDecimal revCollectTotalCharges;

    /**
     * Attribute to hold <code>revCollectTotalsInd</code> property.
     */
    private Boolean revCollectTotalsInd;

    /**
     * Attribute to hold <code>Collect Valuation Charges</code>.
     */
    private BigDecimal revCollectValuationCharges;

    /**
     * Attribute to hold <code>Collect Weight Charges</code>.
     */
    private BigDecimal revCollectWeightCharges;

    /**
     * Attribute to hold <code>Destination Currency</code>.
     */
    private String revDestinationCurrency;

    /**
     * Attribute to hold <code>ExchangeRates</code>.
     */
    private BigDecimal revExchangeRates;

    /**
     * Attribute to hold <code>RevPrepaidDisplayableTotalCharges</code>.
     */
    private BigDecimal revPrepaidDisplayableTotalCharges;

    /**
     * Attribute to hold <code>RevPrepaiDisplayableWeightCharges</code>.
     */
    private BigDecimal revPrepaidDisplayableWeightCharges;

    /**
     * Attribute to hold <code>revPrepaidDueAgentCharges Due Agent Charges</code>.
     */
    private BigDecimal revPrepaidDueAgentCharges;

    /**
     * Attribute to hold <code>revPrepaidDueCarrierCharges Due Carrier Charges</code>.
     */
    private BigDecimal revPrepaidDueCarrierCharges;

    /**
     * Attribute to hold <code>RevPrepaidPrintableTotalCharges</code>.
     */
    private BigDecimal revPrepaidPrintableTotalCharges;

    /**
     * Attribute to hold <code>revPrepaidTotalCharges </code>.
     */
    private BigDecimal revPrepaidTotalCharges;

    /**
     * Attribute to hold <code>revPrepaidTotalsInd</code> property.
     */
    private Boolean revPrepaidTotalsInd;

    /**
     * Attribute to hold <code>revPrepaidValuationCharges</code>.
     */
    private BigDecimal revPrepaidValuationCharges;

    /**
     * Attribute to hold <code>revPrepaidWeightCharges</code>.
     */
    private BigDecimal revPrepaidWeightCharges;

    /**
     * Attribute to hold <code>revPrepaiPrintableWeightCharges</code>.
     */
    private BigDecimal revPrepaiPrintableWeightCharges;

    /**
     * Attribute to hold <code>Collect Due Agent Charges</code> property.
     */
    private RoutingSegmentDto routingSegmentOne;

    /**
     * Attribute to hold <code>routingSegmentThree</code> property.
     */
    private RoutingSegmentDto routingSegmentThree;

    /**
     * Attribute to hold <code>routingSegmentTwo</code> property.
     */
    private RoutingSegmentDto routingSegmentTwo;

    /**
     * Attribute to Hold the <code>shipperEmail</code>
     */
    private String shipperEmail = "";

    /**
     * 
     */
    private boolean confirmCCALocked;
    
    /*Changes for DL590 starts*/
    /**
     * Attribute to hold <code>isShipperModified</code> property.
     */
    private boolean isShipperModified;
    
    /**
     * Attribute to hold <code>isConsigneeModified</code> property.
     */
    private boolean isConsigneeModified;
    /**
     * Attribute to hold <code>autoSendEmail</code> property.
     */
    private boolean autoSendEmail;
    /**
     * Attribute to hold <code>prepaidParticipant</code> property. 
     */
    private boolean prepaidParticipant;
    /**
     * Attribute to hold <code>collectParticipant</code> property. 
     */
    private boolean collectParticipant;
    /*Changes for DL590 ends*/

    /**
     * 
     * @return
     */
    public boolean isConfirmCCALocked() {
        return this.confirmCCALocked;
    }

    /**
     * 
     * @param pConfirmCCALocked
     */
    public void setConfirmCCALocked(boolean pConfirmCCALocked) {
        this.confirmCCALocked = pConfirmCCALocked;
    }

    /**
     * Attribute to Hold the <code>shipperEmailCheck</code>
     */
    private boolean shipperEmailCheck = false;

    /**
     * Gets the <code>actualIssuingStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>actualIssuingStation</code> property.
     */
    public String getActualIssuingStation() {
        return this.actualIssuingStation;
    }

    /**
     * Gets the <code>additionalAdd1</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalAdd1</code> property.
     */
    public String getAdditionalAdd1() {
        return this.additionalAdd1;
    }

    /**
     * Gets the <code>additionalAdd2</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalAdd2</code> property.
     */
    public String getAdditionalAdd2() {
        return this.additionalAdd2;
    }

    /**
     * Gets the <code>additionalAdd3</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalAdd3</code> property.
     */
    public String getAdditionalAdd3() {
        return this.additionalAdd3;
    }

    /**
     * Gets the <code>additionalAdd4</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalAdd4</code> property.
     */
    public String getAdditionalAdd4() {
        return this.additionalAdd4;
    }

    /**
     * Gets the <code>additionalAdd5</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalAdd5</code> property.
     */
    public String getAdditionalAdd5() {
        return this.additionalAdd5;
    }

    /**
     * Gets the <code>additionalAdd6</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalAdd6</code> property.
     */
    public String getAdditionalAdd6() {
        return this.additionalAdd6;
    }

    /**
     * Gets the <code>additionalEmailEight</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalEmailEight</code> property.
     */
    public String getAdditionalEmailEight() {
        return this.additionalEmailEight;
    }

    /**
     * Gets the <code>additionalEmailEleven</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalEmailEleven</code> property.
     */
    public String getAdditionalEmailEleven() {
        return this.additionalEmailEleven;
    }

    /**
     * Gets the <code>additionalEmailFive</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalEmailFive</code> property.
     */
    public String getAdditionalEmailFive() {
        return this.additionalEmailFive;
    }

    /**
     * Gets the <code>additionalEmailFour</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalEmailFour</code> property.
     */
    public String getAdditionalEmailFour() {
        return this.additionalEmailFour;
    }

    /**
     * Gets the <code>additionalEmailNine</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalEmailNine</code> property.
     */
    public String getAdditionalEmailNine() {
        return this.additionalEmailNine;
    }

    /**
     * Gets the <code>additionalEmailOne</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalEmailOne</code> property.
     */

    public String getAdditionalEmailOne() {
        return this.additionalEmailOne;
    }

    /**
     * Gets the <code>additionalEmailSeven</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalEmailSeven</code> property.
     */

    public String getAdditionalEmailSeven() {
        return this.additionalEmailSeven;
    }

    /**
     * Gets the <code>additionalEmailSix</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalEmailSix</code> property.
     */
    public String getAdditionalEmailSix() {
        return this.additionalEmailSix;
    }

    /**
     * Gets the <code>additionalEmailTen</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalEmailTen</code> property.
     */
    public String getAdditionalEmailTen() {
        return this.additionalEmailTen;
    }

    /**
     * Gets the <code>additionalEmailThree</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalEmailThree</code> property.
     */
    public String getAdditionalEmailThree() {
        return this.additionalEmailThree;
    }

    /**
     * Gets the <code>additionalEmailTwo</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalEmailTwo</code> property.
     */
    public String getAdditionalEmailTwo() {
        return this.additionalEmailTwo;
    };

    /**
     * Gets the <code>agentEmail</code> property.
     * <p>
     * 
     * @return the current value of the <code>agentEmail</code> property.
     */
    public String getAgentEmail() {
        return this.agentEmail;
    }

    /**
     * Gets the <code>airlineName</code> property.
     * <p>
     * 
     * @return the current value of the <code>airlineName</code> property.
     */
    public String getAirlineName() {
        return this.airlineName;
    }

    /**
     * Gets the <code>airWaybillDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWaybillDto</code> property.
     */
    public AirWaybillDto getAirWaybillDto() {
        return this.airWaybillDto;
    }

    /**
     * Gets the <code>autoAddCCAFeeOverrideInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>autoAddCCAFeeOverrideInd</code> property.
     */
    public boolean getAutoAddCCAFeeOverrideInd() {
        return this.autoAddCCAFeeOverrideInd;
    }

    /**
     * Gets the <code>autoAddIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>autoAddIndicator</code> property.
     */
    public boolean getAutoAddIndicator() {
        return this.autoAddIndicator;
    }

    /**
     * Gets the <code>bookingEmail</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookingEmail</code> property.
     */
    public String getBookingEmail() {
        return this.bookingEmail;
    }

    /**
     * Gets the <code>caMiscChargeAmt</code> property.
     * <p>
     * 
     * @return the current value of the <code>caMiscChargeAmt</code> property.
     */
    public BigDecimal getCaMiscChargeAmt() {
        return this.caMiscChargeAmt;
    }

    /**
     * Gets the <code>ccaCreatedStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>ccaCreatedStation</code> property.
     */
    public String getCcaCreatedStation() {
        return this.ccaCreatedStation;
    }

    /**
     * Gets the <code>consigneeEmail</code> property.
     * <p>
     * 
     * @return the current value of the <code>consigneeEmail</code> property.
     */

    public String getConsigneeEmail() {
        return this.consigneeEmail;
    }

    /**
     * Gets the <code>correctionAdviceAdditionalRemarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>correctionAdviceAdditionalRemarks</code> property.
     */
    public String getCorrectionAdviceAdditionalRemarks() {
        return this.correctionAdviceAdditionalRemarks;
    }

    /**
     * Gets the <code>correctionAdviceRemarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>correctionAdviceRemarks</code> property.
     */
    public String getCorrectionAdviceRemarks() {
        return this.correctionAdviceRemarks;
    }

    /**
     * Gets the <code>emailContentAsPrint</code> property.
     * <p>
     * 
     * @return the current value of the <code>emailContentAsPrint</code> property.
     */
    public String getEmailContentAsPrint() {
        return this.emailContentAsPrint;
    }

    /**
     * Gets the <code>emailRemarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>emailRemarks</code> property.
     */
    public String getEmailRemarks() {
        return this.emailRemarks;
    }

    /**
     * Gets the <code>executionDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>executionDate</code> property.
     */
    public Date getExecutionDate() {
        return ContractUtility.getClonedDate(this.executionDate);
    }

    /**
     * Gets the <code>miscelleneousChargesIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>miscelleneousChargesIndicator</code> property.
     */
    public String getMiscelleneousChargesIndicator() {
        return this.miscelleneousChargesIndicator;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>prevCollectDisplayableTotalCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevCollectDisplayableTotalCharges</code> property.
     */
    public BigDecimal getPrevCollectDisplayableTotalCharges() {
        return this.prevCollectDisplayableTotalCharges;
    }

    /**
     * Gets the <code>prevCollectDisplayableWeightCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevCollectDisplayableWeightCharges</code> property.
     */
    public BigDecimal getPrevCollectDisplayableWeightCharges() {
        return this.prevCollectDisplayableWeightCharges;
    }

    /**
     * Gets the <code>prevCollectDueAgentCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevCollectDueAgentCharges</code> property.
     */
    public BigDecimal getPrevCollectDueAgentCharges() {
        return this.prevCollectDueAgentCharges;
    }

    /**
     * Gets the <code>prevCollectDueCarrierCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevCollectDueCarrierCharges</code> property.
     */
    public BigDecimal getPrevCollectDueCarrierCharges() {
        return this.prevCollectDueCarrierCharges;
    }

    /**
     * Gets the <code>prevCollectPrintableTotalCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevCollectPrintableTotalCharges</code> property.
     */
    public BigDecimal getPrevCollectPrintableTotalCharges() {
        return this.prevCollectPrintableTotalCharges;
    }

    /**
     * Gets the <code>prevCollectPrintableWeightCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevCollectPrintableWeightCharges</code> property.
     */
    public BigDecimal getPrevCollectPrintableWeightCharges() {
        return this.prevCollectPrintableWeightCharges;
    }

    /**
     * Gets the <code>prevCollectTotalCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevCollectTotalCharges</code> property.
     */
    public BigDecimal getPrevCollectTotalCharges() {
        return this.prevCollectTotalCharges;
    }

    /**
     * Gets the <code>prevCollectTotalsInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevCollectTotalsInd</code> property.
     */
    public Boolean getPrevCollectTotalsInd() {
        return this.prevCollectTotalsInd;
    }

    /**
     * Gets the <code>prevCollectValuationCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevCollectValuationCharges</code> property.
     */
    public BigDecimal getPrevCollectValuationCharges() {
        return this.prevCollectValuationCharges;
    }

    /**
     * Gets the <code>prevCollectWeightCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevCollectWeightCharges</code> property.
     */
    public BigDecimal getPrevCollectWeightCharges() {
        return this.prevCollectWeightCharges;
    }

    /**
     * Gets the <code>prevDestinationCurrency</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevDestinationCurrency</code> property.
     */
    public String getPrevDestinationCurrency() {
        return this.prevDestinationCurrency;
    }

    /**
     * Gets the <code>prevExchangeRates</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevExchangeRates</code> property.
     */
    public BigDecimal getPrevExchangeRates() {
        return this.prevExchangeRates;
    }

    /**
     * Gets the <code>prevPrepaidDisplayableTotalCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevPrepaidDisplayableTotalCharges</code> property.
     */
    public BigDecimal getPrevPrepaidDisplayableTotalCharges() {
        return this.prevPrepaidDisplayableTotalCharges;
    }

    /**
     * Gets the <code>prevPrepaidDueAgentCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevPrepaidDueAgentCharges</code> property.
     */
    public BigDecimal getPrevPrepaidDueAgentCharges() {
        return this.prevPrepaidDueAgentCharges;
    }

    /**
     * Gets the <code>prevPrepaidDueCarrierCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevPrepaidDueCarrierCharges</code> property.
     */
    public BigDecimal getPrevPrepaidDueCarrierCharges() {
        return this.prevPrepaidDueCarrierCharges;
    }

    /**
     * Gets the <code>prevPrepaidDisplayableWeightCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevPrepaidDisplayableWeightCharges</code> property.
     */
    public BigDecimal getPrevPrepaiDisplayableWeightCharges() {
        return this.prevPrepaidDisplayableWeightCharges;
    }

    /**
     * Gets the <code>prevPrepaidPrintableTotalCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevPrepaidPrintableTotalCharges</code> property.
     */
    public BigDecimal getPrevPrepaidPrintableTotalCharges() {
        return this.prevPrepaidPrintableTotalCharges;
    }

    /**
     * Gets the <code>prevPrepaidPrintableWeightCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevPrepaidPrintableWeightCharges</code> property.
     */
    public BigDecimal getPrevPrepaidPrintableWeightCharges() {
        return this.prevPrepaidPrintableWeightCharges;
    }

    /**
     * Gets the <code>prevPrepaidTotalCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevPrepaidTotalCharges</code> property.
     */
    public BigDecimal getPrevPrepaidTotalCharges() {
        return this.prevPrepaidTotalCharges;
    }

    /**
     * Gets the <code>prevPrepaidTotalsInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevPrepaidTotalsInd</code> property.
     */
    public Boolean getPrevPrepaidTotalsInd() {
        return this.prevPrepaidTotalsInd;
    }

    /**
     * Gets the <code>prevPrepaidValuationCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevPrepaidValuationCharges</code> property.
     */
    public BigDecimal getPrevPrepaidValuationCharges() {
        return this.prevPrepaidValuationCharges;
    }

    /**
     * Gets the <code>prevPrepaidWeightCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prevPrepaidWeightCharges</code> property.
     */
    public BigDecimal getPrevPrepaidWeightCharges() {
        return this.prevPrepaidWeightCharges;
    }

    /**
     * Gets the <code>referenceNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>referenceNumber</code> property.
     */
    public CcaReferenceNumberDto getReferenceNumber() {
        if (referenceNumber == null) {
            this.referenceNumber = new CcaReferenceNumberDto();
        }

        return this.referenceNumber;
    }

    /**
     * Gets the <code>revCollectDisplayableTotalCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revCollectDisplayableTotalCharges</code> property.
     */
    public BigDecimal getRevCollectDisplayableTotalCharges() {
        return this.revCollectDisplayableTotalCharges;
    }

    /**
     * Gets the <code>revCollectDisplayableWeightCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revCollectDisplayableWeightCharges</code> property.
     */
    public BigDecimal getRevCollectDisplayableWeightCharges() {
        return this.revCollectDisplayableWeightCharges;
    }

    /**
     * Gets the <code>revCollectDueAgentCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revCollectDueAgentCharges</code> property.
     */
    public BigDecimal getRevCollectDueAgentCharges() {
        return this.revCollectDueAgentCharges;
    }

    /**
     * Gets the <code>revCollectDueCarrierCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revCollectDueCarrierCharges</code> property.
     */
    public BigDecimal getRevCollectDueCarrierCharges() {
        return this.revCollectDueCarrierCharges;
    }

    /**
     * Gets the <code>revCollectPrintableTotalCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revCollectPrintableTotalCharges</code> property.
     */
    public BigDecimal getRevCollectPrintableTotalCharges() {
        return this.revCollectPrintableTotalCharges;
    }

    /**
     * Gets the <code>revCollectPrintableWeightCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revCollectPrintableWeightCharges</code> property.
     */
    public BigDecimal getRevCollectPrintableWeightCharges() {
        return this.revCollectPrintableWeightCharges;
    }

    /**
     * Gets the <code>revCollectTotalCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revCollectTotalCharges</code> property.
     */
    public BigDecimal getRevCollectTotalCharges() {
        return this.revCollectTotalCharges;
    }

    /**
     * Gets the <code>revCollectTotalsInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>revCollectTotalsInd</code> property.
     */
    public Boolean getRevCollectTotalsInd() {
        return this.revCollectTotalsInd;
    }

    /**
     * Gets the <code>revCollectValuationCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revCollectValuationCharges</code> property.
     */
    public BigDecimal getRevCollectValuationCharges() {
        return this.revCollectValuationCharges;
    }

    /**
     * Gets the <code>revCollectWeightCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revCollectWeightCharges</code> property.
     */
    public BigDecimal getRevCollectWeightCharges() {
        return this.revCollectWeightCharges;
    }

    /**
     * Gets the <code>revDestinationCurrency</code> property.
     * <p>
     * 
     * @return the current value of the <code>revDestinationCurrency</code> property.
     */
    public String getRevDestinationCurrency() {
        return this.revDestinationCurrency;
    }

    /**
     * Gets the <code>revExchangeRates</code> property.
     * <p>
     * 
     * @return the current value of the <code>revExchangeRates</code> property.
     */
    public BigDecimal getRevExchangeRates() {
        return this.revExchangeRates;
    }

    /**
     * Gets the <code>revPrepaidDisplayableTotalCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revPrepaidDisplayableTotalCharges</code> property.
     */
    public BigDecimal getRevPrepaidDisplayableTotalCharges() {
        return this.revPrepaidDisplayableTotalCharges;
    }

    /**
     * Gets the <code>revPrepaidDisplayableWeightCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revPrepaidDisplayableWeightCharges</code> property.
     */
    public BigDecimal getRevPrepaidDisplayableWeightCharges() {
        return this.revPrepaidDisplayableWeightCharges;
    }

    /**
     * Gets the <code>revPrepaidDueAgentCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revPrepaidDueAgentCharges</code> property.
     */
    public BigDecimal getRevPrepaidDueAgentCharges() {
        return this.revPrepaidDueAgentCharges;
    }

    /**
     * Gets the <code>revPrepaidDueCarrierCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revPrepaidDueCarrierCharges</code> property.
     */
    public BigDecimal getRevPrepaidDueCarrierCharges() {
        return this.revPrepaidDueCarrierCharges;
    }

    /**
     * Gets the <code>revPrepaidPrintableTotalCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revPrepaidPrintableTotalCharges</code> property.
     */
    public BigDecimal getRevPrepaidPrintableTotalCharges() {
        return this.revPrepaidPrintableTotalCharges;
    }

    /**
     * Gets the <code>revPrepaidTotalCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revPrepaidTotalCharges</code> property.
     */
    public BigDecimal getRevPrepaidTotalCharges() {
        return this.revPrepaidTotalCharges;
    }

    /**
     * Gets the <code>revPrepaidTotalsInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>revPrepaidTotalsInd</code> property.
     */
    public Boolean getRevPrepaidTotalsInd() {
        return this.revPrepaidTotalsInd;
    }

    /**
     * Gets the <code>revPrepaidValuationCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revPrepaidValuationCharges</code> property.
     */
    public BigDecimal getRevPrepaidValuationCharges() {
        return this.revPrepaidValuationCharges;
    }

    /**
     * Gets the <code>revPrepaidWeightCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revPrepaidWeightCharges</code> property.
     */
    public BigDecimal getRevPrepaidWeightCharges() {
        return this.revPrepaidWeightCharges;
    }

    /**
     * Gets the <code>revPrepaiPrintableWeightCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>revPrepaiPrintableWeightCharges</code> property.
     */
    public BigDecimal getRevPrepaiPrintableWeightCharges() {
        return this.revPrepaiPrintableWeightCharges;
    }

    /**
     * Gets the <code>routingSegmentOne</code> property.
     * <p>
     * 
     * @return the current value of the <code>routingSegmentOne</code> property.
     */
    public RoutingSegmentDto getRoutingSegmentOne() {
        return this.routingSegmentOne;
    }

    /**
     * Gets the <code>routingSegmentThree</code> property.
     * <p>
     * 
     * @return the current value of the <code>routingSegmentThree</code> property.
     */
    public RoutingSegmentDto getRoutingSegmentThree() {
        return this.routingSegmentThree;
    }

    /**
     * Gets the <code>routingSegmentTwo</code> property.
     * <p>
     * 
     * @return the current value of the <code>routingSegmentTwo</code> property.
     */
    public RoutingSegmentDto getRoutingSegmentTwo() {
        return this.routingSegmentTwo;
    }

    /**
     * Gets the <code>shipperEmail</code> property.
     * <p>
     * 
     * @return the current value of the <code>shipperEmail</code> property.
     */
    public String getShipperEmail() {
        return this.shipperEmail;
    }

    /**
     * Gets the <code>agentEmailCheck</code> property.
     * <p>
     * 
     * @return the current value of the <code>agentEmailCheck</code> property.
     */
    public boolean isAgentEmailCheck() {
        return this.agentEmailCheck;
    }

    /**
     * Gets the <code>allowAutoAddCCAOption</code> property.
     * <p>
     * 
     * @return the current value of the <code>allowAutoAddCCAOption</code> property.
     */
    public boolean isAllowAutoAddCCAOption() {
        return this.allowAutoAddCCAOption;
    }

    /**
     * Gets the <code>autoAddCcaFeeIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>autoAddCcaFeeIndicator</code> property.
     */
    public boolean isAutoAddCcaFeeIndicator() {
        return this.autoAddCcaFeeIndicator;
    }

    /**
     * Gets the <code>bookingEmailCheck</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookingEmailCheck</code> property.
     */
    public boolean isBookingEmailCheck() {
        return this.bookingEmailCheck;
    }

    /**
     * Gets the <code>ccaLocked</code> property.
     * <p>
     * 
     * @return the current value of the <code>ccaLocked</code> property.
     */

    public boolean isCcaLocked() {
        return this.ccaLocked;
    }

    /**
     * Gets the <code>ccaLockedPriorEQA</code> property.
     * <p>
     * 
     * @return the current value of the <code>ccaLockedPriorEQA</code> property.
     */
    public String isCcaLockedPriorEQA() {
        return this.ccaLockedPriorEQA;
    }

    /**
     * Gets the <code>consigneeEmailCheck</code> property.
     * <p>
     * 
     * @return the current value of the <code>consigneeEmailCheck</code> property.
     */
    public boolean isConsigneeEmailCheck() {
        return this.consigneeEmailCheck;
    }

    /**
     * Gets the <code>currentCCALockSuccess</code> property.
     * <p>
     * 
     * @return the current value of the <code>currentCCALockSuccess</code> property.
     */

    public boolean isCurrentCCALockSuccess() {
        return this.currentCCALockSuccess;
    }

    /**
     * Gets the <code>eqaAuthorityRequiredIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>eqaAuthorityRequiredIndicator</code> property.
     */
    public boolean isEqaAuthorityRequiredIndicator() {
        return this.eqaAuthorityRequiredIndicator;
    }

    /**
     * Gets the <code>shipperEmailCheck</code> property.
     * <p>
     * 
     * @return the current value of the <code>shipperEmailCheck</code> property.
     */
    public boolean isShipperEmailCheck() {
        return this.shipperEmailCheck;
    }

    /**
     * Sets the <code>actualIssuingStation</code> property.
     * <p>
     * 
     * @param pActualIssuingStation
     *            the new value of the <code>actualIssuingStation</code> property.
     */
    public void setActualIssuingStation(final String pActualIssuingStation) {
        this.actualIssuingStation = pActualIssuingStation;
    }

    /**
     * Sets the <code>additionalAdd1</code> property.
     * <p>
     * 
     * @param pAdditionalAdd1
     *            the new value of the <code>additionalAdd1</code> property.
     */
    public void setAdditionalAdd1(final String pAdditionalAdd1) {
        this.additionalAdd1 = pAdditionalAdd1;
    }

    /**
     * Sets the <code>additionalAdd2</code> property.
     * <p>
     * 
     * @param pAdditionalAdd2
     *            the new value of the <code>additionalAdd2</code> property.
     */
    public void setAdditionalAdd2(final String pAdditionalAdd2) {
        this.additionalAdd2 = pAdditionalAdd2;
    }

    /**
     * Sets the <code>additionalAdd3</code> property.
     * <p>
     * 
     * @param pAdditionalAdd3
     *            the new value of the <code>additionalAdd3</code> property.
     */
    public void setAdditionalAdd3(final String pAdditionalAdd3) {
        this.additionalAdd3 = pAdditionalAdd3;
    }

    /**
     * Sets the <code>additionalAdd4</code> property.
     * <p>
     * 
     * @param pAdditionalAdd4
     *            the new value of the <code>additionalAdd4</code> property.
     */
    public void setAdditionalAdd4(final String pAdditionalAdd4) {
        this.additionalAdd4 = pAdditionalAdd4;
    }

    /**
     * Sets the <code>additionalAdd5</code> property.
     * <p>
     * 
     * @param pAdditionalAdd5
     *            the new value of the <code>additionalAdd5</code> property.
     */
    public void setAdditionalAdd5(final String pAdditionalAdd5) {
        this.additionalAdd5 = pAdditionalAdd5;
    }

    /**
     * Sets the <code>additionalAdd6</code> property.
     * <p>
     * 
     * @param pAdditionalAdd6
     *            the new value of the <code>additionalAdd6</code> property.
     */
    public void setAdditionalAdd6(final String pAdditionalAdd6) {
        this.additionalAdd6 = pAdditionalAdd6;
    }

    /**
     * Sets the <code>additionalEmailEight</code> property.
     * <p>
     * 
     * @param pAdditionalEmailEight
     *            the new value of the <code>additionalEmailEight</code> property.
     */
    public void setAdditionalEmailEight(final String pAdditionalEmailEight) {
        this.additionalEmailEight = pAdditionalEmailEight;
    }

    /**
     * Sets the <code>PAdditionalEmailEleven</code> property.
     * <p>
     * 
     * @param PAdditionalEmailEleven
     *            the new value of the <code>PAdditionalEmailEleven</code> property.
     */
    public void setAdditionalEmailEleven(final String pAdditionalEmailEleven) {
        this.additionalEmailEleven = pAdditionalEmailEleven;
    }

    /**
     * Sets the <code>additionalEmailFive</code> property.
     * <p>
     * 
     * @param pAdditionalEmailFive
     *            the new value of the <code>additionalEmailFive</code> property.
     */
    public void setAdditionalEmailFive(final String pAdditionalEmailFive) {
        this.additionalEmailFive = pAdditionalEmailFive;
    }

    /**
     * Sets the <code>additionalEmailFour</code> property.
     * <p>
     * 
     * @param pAdditionalEmailFour
     *            the new value of the <code>additionalEmailFour</code> property.
     */
    public void setAdditionalEmailFour(final String pAdditionalEmailFour) {
        this.additionalEmailFour = pAdditionalEmailFour;
    }

    /**
     * Sets the <code>additionalEmailNine</code> property.
     * <p>
     * 
     * @param pAdditionalEmailNine
     *            the new value of the <code>additionalEmailNine</code> property.
     */
    public void setAdditionalEmailNine(final String pAdditionalEmailNine) {
        this.additionalEmailNine = pAdditionalEmailNine;
    }

    /**
     * Sets the <code>additionalEmailOne</code> property.
     * <p>
     * 
     * @param pAdditionalEmailOne
     *            the new value of the <code>additionalEmailOne</code> property.
     */
    public void setAdditionalEmailOne(final String pAdditionalEmailOne) {
        this.additionalEmailOne = pAdditionalEmailOne;
    }

    /**
     * Sets the <code>pAdditionalEmailSeven</code> property.
     * <p>
     * 
     * @param pAdditionalEmailSeven
     *            the new value of the <code>pAdditionalEmailSeven</code> property.
     */
    public void setAdditionalEmailSeven(final String pAdditionalEmailSeven) {
        this.additionalEmailSeven = pAdditionalEmailSeven;
    }

    /**
     * Sets the <code>additionalEmailSix</code> property.
     * <p>
     * 
     * @param pAdditionalEmailSix
     *            the new value of the <code>additionalEmailSix</code> property.
     */
    public void setAdditionalEmailSix(final String pAdditionalEmailSix) {
        this.additionalEmailSix = pAdditionalEmailSix;
    }

    /**
     * Sets the <code>additionalEmailTen</code> property.
     * <p>
     * 
     * @param pAdditionalEmailTen
     *            the new value of the <code>additionalEmailTen</code> property.
     */
    public void setAdditionalEmailTen(final String pAdditionalEmailTen) {
        this.additionalEmailTen = pAdditionalEmailTen;
    }

    /**
     * Sets the <code>additionalEmailThree</code> property.
     * <p>
     * 
     * @param pAdditionalEmailThree
     *            the new value of the <code>additionalEmailThree</code> property.
     */
    public void setAdditionalEmailThree(final String pAdditionalEmailThree) {
        this.additionalEmailThree = pAdditionalEmailThree;
    }

    /**
     * Sets the <code>additionalEmailTwo</code> property.
     * <p>
     * 
     * @param pAdditionalEmailTwo
     *            the new value of the <code>additionalEmailTwo</code> property.
     */
    public void setAdditionalEmailTwo(final String pAdditionalEmailTwo) {
        this.additionalEmailTwo = pAdditionalEmailTwo;
    }

    /**
     * Sets the <code>agentEmail</code> property.
     * <p>
     * 
     * @param pAgentEmail
     *            the new value of the <code>agentEmail</code> property.
     */
    public void setAgentEmail(final String pAgentEmail) {
        this.agentEmail = pAgentEmail;
    }

    /**
     * Sets the <code>agentEmailCheck</code> property.
     * <p>
     * 
     * @param pAgentEmailCheck
     *            the new value of the <code>agentEmailCheck</code> property.
     */
    public void setAgentEmailCheck(final boolean pAgentEmailCheck) {
        this.agentEmailCheck = pAgentEmailCheck;
    }

    /**
     * Sets the <code>airlineName</code> property.
     * <p>
     * 
     * @param pAirlineName
     *            the new value of the <code>airlineName</code> property.
     */
    public void setAirlineName(final String pAirlineName) {
        this.airlineName = pAirlineName;
    }

    /**
     * Sets the <code>airWaybillDto</code> property.
     * <p>
     * 
     * @param pAirWaybillDto
     *            the new value of the <code>airWaybillDto</code> property.
     */
    public void setAirWaybillDto(final AirWaybillDto pAirWaybillDto) {
        this.airWaybillDto = pAirWaybillDto;
    }

    /**
     * Sets the <code>allowAutoAddCCAOption</code> property.
     * <p>
     * 
     * @param pAllowAutoAddCCAOption
     *            the new value of the <code>allowAutoAddCCAOption</code> property.
     */
    public void setAllowAutoAddCCAOption(final boolean pAllowAutoAddCCAOption) {
        this.allowAutoAddCCAOption = pAllowAutoAddCCAOption;
    }

    /**
     * Sets the <code>autoAddCcaFeeIndicator</code> property.
     * <p>
     * 
     * @param pAutoAddCcaFeeIndicator
     *            the new value of the <code>autoAddCcaFeeIndicator</code> property.
     */
    public void setAutoAddCcaFeeIndicator(final boolean pAutoAddCcaFeeIndicator) {
        this.autoAddCcaFeeIndicator = pAutoAddCcaFeeIndicator;
    }

    /**
     * Sets the <code>autoAddCCAFeeOverrideInd</code> property.
     * <p>
     * 
     * @param pAutoAddCCAFeeOverrideInd
     *            the new value of the <code>autoAddCCAFeeOverrideInd</code> property.
     */
    public void setAutoAddCCAFeeOverrideInd(final boolean pAutoAddCCAFeeOverrideInd) {
        this.autoAddCCAFeeOverrideInd = pAutoAddCCAFeeOverrideInd;
    }

    /**
     * Sets the <code>autoAddIndicator</code> property.
     * <p>
     * 
     * @param pAutoAddIndicator
     *            the new value of the <code>autoAddIndicator</code> property.
     */
    public void setAutoAddIndicator(final boolean pAutoAddIndicator) {
        this.autoAddIndicator = pAutoAddIndicator;
    }

    /**
     * Sets the <code>bookingEmail</code> property.
     * <p>
     * 
     * @param pBookingEmail
     *            the new value of the <code>bookingEmail</code> property.
     */
    public void setBookingEmail(final String pBookingEmail) {
        this.bookingEmail = pBookingEmail;
    }

    /**
     * Sets the <code>bookingEmailCheck</code> property.
     * <p>
     * 
     * @param pBookingEmailCheck
     *            the new value of the <code>bookingEmailCheck</code> property.
     */
    public void setBookingEmailCheck(final boolean pBookingEmailCheck) {
        this.bookingEmailCheck = pBookingEmailCheck;
    }

    /**
     * Sets the <code>caMiscChargeAmt</code> property.
     * <p>
     * 
     * @param pCaMiscChargeAmt
     *            the new value of the <code>caMiscChargeAmt</code> property.
     */
    public void setCaMiscChargeAmt(final BigDecimal pCaMiscChargeAmt) {
        this.caMiscChargeAmt = pCaMiscChargeAmt;
    }

    /**
     * Sets the <code>ccaCreatedStation</code> property.
     * <p>
     * 
     * @param pCcaCreatedStation
     *            the new value of the <code>ccaCreatedStation</code> property.
     */
    public void setCcaCreatedStation(final String pCcaCreatedStation) {
        this.ccaCreatedStation = pCcaCreatedStation;
    }

    /**
     * Sets the <code>ccaLocked</code> property.
     * <p>
     * 
     * @param pCcaLocked
     *            the new value of the <code>ccaLocked</code> property.
     */
    public void setCcaLocked(final boolean pCcaLocked) {
        this.ccaLocked = pCcaLocked;
    }

    /**
     * Sets the <code>ccaLockedPriorEQA</code> property.
     * <p>
     * 
     * @param pCcaLockedPriorEQA
     *            the new value of the <code>ccaLockedPriorEQA</code> property.
     */
    public void setCcaLockedPriorEQA(final String pCcaLockedPriorEQA) {
        this.ccaLockedPriorEQA = pCcaLockedPriorEQA;
    }

    /**
     * Sets the <code>consigneeEmail</code> property.
     * <p>
     * 
     * @param pConsigneeEmail
     *            the new value of the <code>consigneeEmail</code> property.
     */
    public void setConsigneeEmail(final String pConsigneeEmail) {
        this.consigneeEmail = pConsigneeEmail;
    }

    /**
     * Sets the <code>consigneeEmailCheck</code> property.
     * <p>
     * 
     * @param pConsigneeEmailCheck
     *            the new value of the <code>consigneeEmailCheck</code> property.
     */
    public void setConsigneeEmailCheck(final boolean pConsigneeEmailCheck) {
        this.consigneeEmailCheck = pConsigneeEmailCheck;
    }

    /**
     * Sets the <code>correctionAdviceAdditionalRemarks</code> property.
     * <p>
     * 
     * @param pCorrectionAdviceAdditionalRemarks
     *            the new value of the <code>correctionAdviceAdditionalRemarks</code> property.
     */
    public void setCorrectionAdviceAdditionalRemarks(final String pCorrectionAdviceAdditionalRemarks) {
        this.correctionAdviceAdditionalRemarks = pCorrectionAdviceAdditionalRemarks;
    }

    /**
     * Sets the <code>correctionAdviceRemarks</code> property.
     * <p>
     * 
     * @param pCorrectionAdviceRemarks
     *            the new value of the <code>correctionAdviceRemarks</code> property.
     */
    public void setCorrectionAdviceRemarks(final String pCorrectionAdviceRemarks) {
        this.correctionAdviceRemarks = pCorrectionAdviceRemarks;
    }

    /**
     * Sets the <code>currentCCALockSuccess</code> property.
     * <p>
     * 
     * @param pCurrentCCALockSuccess
     *            the new value of the <code>currentCCALockSuccess</code> property.
     */
    public void setCurrentCCALockSuccess(final boolean pCurrentCCALockSuccess) {
        this.currentCCALockSuccess = pCurrentCCALockSuccess;
    }

    /**
     * Sets the <code>emailContentAsPrint</code> property.
     * <p>
     * 
     * @param pEmailContentAsPrint
     *            the new value of the <code>emailContentAsPrint</code> property.
     */
    public void setEmailContentAsPrint(final String pEmailContentAsPrint) {
        this.emailContentAsPrint = pEmailContentAsPrint;
    }

    /**
     * Sets the <code>emailRemarks</code> property.
     * <p>
     * 
     * @param pEmailRemarks
     *            the new value of the <code>emailRemarks</code> property.
     */
    public void setEmailRemarks(final String pEmailRemarks) {
        this.emailRemarks = pEmailRemarks;
    }

    /**
     * Sets the <code>ccaFees</code> property.
     * <p>
     * 
     * @param pEqaAuthorityRequiredIndicator
     *            the new value of the <code>eqaAuthorityRequiredIndicator</code> property.
     */
    public void setEqaAuthorityRequiredIndicator(final boolean pEqaAuthorityRequiredIndicator) {
        this.eqaAuthorityRequiredIndicator = pEqaAuthorityRequiredIndicator;
    }

    /**
     * Sets the <code>executionDate</code> property.
     * <p>
     * 
     * @param pExecutionDate
     *            the new value of the <code>executionDate</code> property.
     */
    public void setExecutionDate(final Date pExecutionDate) {
        this.executionDate = ContractUtility.getClonedDate(pExecutionDate);
    }

    /**
     * Sets the <code>miscelleneousChargesIndicator</code> property.
     * <p>
     * 
     * @param pMiscelleneousChargesIndicator
     *            the new value of the <code>miscelleneousChargesIndicator</code> property.
     */
    public void setMiscelleneousChargesIndicator(final String pMiscelleneousChargesIndicator) {
        this.miscelleneousChargesIndicator = pMiscelleneousChargesIndicator;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>revPrepaidTotalCharges</code> property.
     * <p>
     * 
     * @param pRevPrepaidTotalCharges
     *            the new value of the <code>revPrepaidTotalCharges</code> property.
     */
    public void setPrevCollectDisplayableTotalCharges(final BigDecimal pPrevCollectDisplayableTotalCharges) {
        this.prevCollectDisplayableTotalCharges = pPrevCollectDisplayableTotalCharges;
    }

    /**
     * Sets the <code>prevCollectDisplayableWeightCharges</code> property.
     * <p>
     * 
     * @param pPrevCollectDisplayableWeightCharges
     *            the new value of the <code>prevCollectDisplayableWeightCharges</code> property.
     */
    public void setPrevCollectDisplayableWeightCharges(
                final BigDecimal pPrevCollectDisplayableWeightCharges) {
        this.prevCollectDisplayableWeightCharges = pPrevCollectDisplayableWeightCharges;
    }

    /**
     * Sets the <code>prevCollectDueAgentCharges</code> property.
     * <p>
     * 
     * @param pPrevCollectDueAgentCharges
     *            the new value of the <code>prevCollectDueAgentCharges</code> property.
     */
    public void setPrevCollectDueAgentCharges(final BigDecimal pPrevCollectDueAgentCharges) {
        this.prevCollectDueAgentCharges = pPrevCollectDueAgentCharges;
    }

    /**
     * Sets the <code>prevCollectDueCarrierCharges</code> property.
     * <p>
     * 
     * @param pPrevCollectDueCarrierCharges
     *            the new value of the <code>prevCollectDueCarrierCharges</code> property.
     */
    public void setPrevCollectDueCarrierCharges(final BigDecimal pPrevCollectDueCarrierCharges) {
        this.prevCollectDueCarrierCharges = pPrevCollectDueCarrierCharges;
    }

    /**
     * Sets the <code>prevCollectPrintableTotalCharges</code> property.
     * <p>
     * 
     * @param pPrevCollectPrintableTotalCharges
     *            the new value of the <code>prevCollectPrintableTotalCharges</code> property.
     */
    public void setPrevCollectPrintableTotalCharges(final BigDecimal pPrevCollectPrintableTotalCharges) {
        this.prevCollectPrintableTotalCharges = pPrevCollectPrintableTotalCharges;
    }

    /**
     * Sets the <code>prevCollectPrintableWeightCharges</code> property.
     * <p>
     * 
     * @param pPrevCollectPrintableWeightCharges
     *            the new value of the <code>prevCollectPrintableWeightCharges</code> property.
     */
    public void setPrevCollectPrintableWeightCharges(final BigDecimal pPrevCollectPrintableWeightCharges) {
        this.prevCollectPrintableWeightCharges = pPrevCollectPrintableWeightCharges;
    }

    /**
     * Sets the <code>prevCollectTotalCharges</code> property.
     * <p>
     * 
     * @param pPrevCollectTotalCharges
     *            the new value of the <code>prevCollectTotalCharges</code> property.
     */
    public void setPrevCollectTotalCharges(final BigDecimal pPrevCollectTotalCharges) {
        this.prevCollectTotalCharges = pPrevCollectTotalCharges;
    }

    /**
     * Sets the <code>prevCollectTotalsInd</code> property.
     * <p>
     * 
     * @param pPrevCollectTotalsInd
     *            the new value of the <code>prevCollectTotalsInd</code> property.
     */
    public void setPrevCollectTotalsInd(final Boolean pPrevCollectTotalsInd) {
        this.prevCollectTotalsInd = pPrevCollectTotalsInd;
    }

    /**
     * Sets the <code>prevCollectValuationCharges</code> property.
     * <p>
     * 
     * @param pPrevCollectValuationCharges
     *            the new value of the <code>prevCollectValuationCharges</code> property.
     */
    public void setPrevCollectValuationCharges(final BigDecimal pPrevCollectValuationCharges) {
        this.prevCollectValuationCharges = pPrevCollectValuationCharges;
    }

    /**
     * Sets the <code>prevCollectWeightCharges</code> property.
     * <p>
     * 
     * @param pPrevCollectWeightCharges
     *            the new value of the <code>prevCollectWeightCharges</code> property.
     */
    public void setPrevCollectWeightCharges(final BigDecimal pPrevCollectWeightCharges) {
        this.prevCollectWeightCharges = pPrevCollectWeightCharges;
    }

    /**
     * Sets the <code>prevDestinationCurrency</code> property.
     * <p>
     * 
     * @param pPrevDestinationCurrency
     *            the new value of the <code>prevDestinationCurrency</code> property.
     */
    public void setPrevDestinationCurrency(final String pPrevDestinationCurrency) {
        this.prevDestinationCurrency = pPrevDestinationCurrency;
    }

    /**
     * Sets the <code>prevExchangeRates</code> property.
     * <p>
     * 
     * @param pPrevExchangeRates
     *            the new value of the <code>prevExchangeRates</code> property.
     */
    public void setPrevExchangeRates(final BigDecimal pPrevExchangeRates) {
        this.prevExchangeRates = pPrevExchangeRates;
    }

    /**
     * Sets the <code>prevPrepaidDisplayableTotalCharges</code> property.
     * <p>
     * 
     * @param pPrevPrepaidDisplayableTotalCharges
     *            the new value of the <code>prevPrepaidDisplayableTotalCharges</code> property.
     */
    public void setPrevPrepaidDisplayableTotalCharges(final BigDecimal pPrevPrepaidDisplayableTotalCharges) {
        this.prevPrepaidDisplayableTotalCharges = pPrevPrepaidDisplayableTotalCharges;
    }

    /**
     * Sets the <code>prevPrepaidDueAgentCharges</code> property.
     * <p>
     * 
     * @param pPrevPrepaidDueAgentCharges
     *            the new value of the <code>prevPrepaidDueAgentCharges</code> property.
     */
    public void setPrevPrepaidDueAgentCharges(final BigDecimal pPrevPrepaidDueAgentCharges) {
        this.prevPrepaidDueAgentCharges = pPrevPrepaidDueAgentCharges;
    }

    /**
     * Sets the <code>prevPrepaidDueCarrierCharges</code> property.
     * <p>
     * 
     * @param pPrevPrepaidDueCarrierCharges
     *            the new value of the <code>prevPrepaidDueCarrierCharges</code> property.
     */
    public void setPrevPrepaidDueCarrierCharges(final BigDecimal pPrevPrepaidDueCarrierCharges) {
        this.prevPrepaidDueCarrierCharges = pPrevPrepaidDueCarrierCharges;
    }

    /**
     * Sets the <code>prevPrepaidDisplayableWeightCharges</code> property.
     * <p>
     * 
     * @param pPrevPrepaiDisplayableWeightCharges
     *            the new value of the <code>prevPrepaidDisplayableWeightCharges</code> property.
     */
    public void setPrevPrepaiDisplayableWeightCharges(final BigDecimal pPrevPrepaiDisplayableWeightCharges) {
        this.prevPrepaidDisplayableWeightCharges = pPrevPrepaiDisplayableWeightCharges;
    }

    /**
     * Sets the <code>prevPrepaidPrintableTotalCharges</code> property.
     * <p>
     * 
     * @param pPrevPrepaidPrintableTotalCharges
     *            the new value of the <code>prevPrepaidPrintableTotalCharges</code> property.
     */
    public void setPrevPrepaidPrintableTotalCharges(final BigDecimal pPrevPrepaidPrintableTotalCharges) {
        this.prevPrepaidPrintableTotalCharges = pPrevPrepaidPrintableTotalCharges;
    }

    /**
     * Sets the <code>prevPrepaidPrintableWeightCharges</code> property.
     * <p>
     * 
     * @param pPrevPrepaiPrintableWeightCharges
     *            the new value of the <code>prevPrepaidPrintableWeightCharges</code> property.
     */
    public void setPrevPrepaidPrintableWeightCharges(final BigDecimal pPrevPrepaiPrintableWeightCharges) {
        this.prevPrepaidPrintableWeightCharges = pPrevPrepaiPrintableWeightCharges;
    }

    /**
     * Sets the <code>prevPrepaidTotalCharges</code> property.
     * <p>
     * 
     * @param pPrevPrepaidTotalCharges
     *            the new value of the <code>prevPrepaidTotalCharges</code> property.
     */
    public void setPrevPrepaidTotalCharges(final BigDecimal pPrevPrepaidTotalCharges) {
        this.prevPrepaidTotalCharges = pPrevPrepaidTotalCharges;
    }

    /**
     * Sets the <code>prevPrepaidTotalsInd</code> property.
     * <p>
     * 
     * @param pPrevPrepaidTotalsInd
     *            the new value of the <code>prevPrepaidTotalsInd</code> property.
     */
    public void setPrevPrepaidTotalsInd(final Boolean pPrevPrepaidTotalsInd) {
        this.prevPrepaidTotalsInd = pPrevPrepaidTotalsInd;
    }

    /**
     * Sets the <code>prevPrepaidValuationCharges</code> property.
     * <p>
     * 
     * @param pPrevPrepaidValuationCharges
     *            the new value of the <code>prevPrepaidValuationCharges</code> property.
     */
    public void setPrevPrepaidValuationCharges(final BigDecimal pPrevPrepaidValuationCharges) {
        this.prevPrepaidValuationCharges = pPrevPrepaidValuationCharges;
    }

    /**
     * Sets the <code>prevPrepaidWeightCharges</code> property.
     * <p>
     * 
     * @param pPrevPrepaidWeightCharges
     *            the new value of the <code>prevPrepaidWeightCharges</code> property.
     */
    public void setPrevPrepaidWeightCharges(final BigDecimal pPrevPrepaidWeightCharges) {
        this.prevPrepaidWeightCharges = pPrevPrepaidWeightCharges;
    }

    /**
     * Sets the <code>referenceNumber</code> property.
     * <p>
     * 
     * @param pReferenceNumber
     *            the new value of the <code>referenceNumber</code> property.
     */
    public void setReferenceNumber(final CcaReferenceNumberDto pReferenceNumber) {

        this.referenceNumber = pReferenceNumber;
    }

    /**
     * Sets the <code>revCollectDisplayableTotalCharges</code> property.
     * <p>
     * 
     * @param pRevCollectDisplayableTotalCharges
     *            the new value of the <code>revCollectDisplayableTotalCharges</code> property.
     */
    public void setRevCollectDisplayableTotalCharges(final BigDecimal pRevCollectDisplayableTotalCharges) {
        this.revCollectDisplayableTotalCharges = pRevCollectDisplayableTotalCharges;
    }

    /**
     * Sets the <code>revCollectDisplayableWeightCharges</code> property.
     * <p>
     * 
     * @param pRevCollectDisplayableWeightCharges
     *            the new value of the <code>revCollectDisplayableWeightCharges</code> property.
     */
    public void setRevCollectDisplayableWeightCharges(final BigDecimal pRevCollectDisplayableWeightCharges) {
        this.revCollectDisplayableWeightCharges = pRevCollectDisplayableWeightCharges;
    }

    /**
     * Sets the <code>revCollectDueAgentCharges</code> property.
     * <p>
     * 
     * @param pRevCollectDueAgentCharges
     *            the new value of the <code>revCollectDueAgentCharges</code> property.
     */
    public void setRevCollectDueAgentCharges(final BigDecimal pRevCollectDueAgentCharges) {
        this.revCollectDueAgentCharges = pRevCollectDueAgentCharges;
    }

    /**
     * Sets the <code>revCollectDueCarrierCharges</code> property.
     * <p>
     * 
     * @param pRevCollectDueCarrierCharges
     *            the new value of the <code>revCollectDueCarrierCharges</code> property.
     */
    public void setRevCollectDueCarrierCharges(final BigDecimal pRevCollectDueCarrierCharges) {
        this.revCollectDueCarrierCharges = pRevCollectDueCarrierCharges;
    }

    /**
     * Sets the <code>revCollectPrintableTotalCharges</code> property.
     * <p>
     * 
     * @param pRevCollectPrintableTotalCharges
     *            the new value of the <code>revCollectPrintableTotalCharges</code> property.
     */
    public void setRevCollectPrintableTotalCharges(final BigDecimal pRevCollectPrintableTotalCharges) {
        this.revCollectPrintableTotalCharges = pRevCollectPrintableTotalCharges;
    }

    /**
     * Sets the <code>revCollectPrintableWeightCharges</code> property.
     * <p>
     * 
     * @param pRevCollectPrintableWeightCharges
     *            the new value of the <code>revCollectPrintableWeightCharges</code> property.
     */
    public void setRevCollectPrintableWeightCharges(final BigDecimal pRevCollectPrintableWeightCharges) {
        this.revCollectPrintableWeightCharges = pRevCollectPrintableWeightCharges;
    }

    /**
     * Sets the <code>revCollectTotalCharges</code> property.
     * <p>
     * 
     * @param pRevCollectTotalCharges
     *            the new value of the <code>revCollectTotalCharges</code> property.
     */
    public void setRevCollectTotalCharges(final BigDecimal pRevCollectTotalCharges) {
        this.revCollectTotalCharges = pRevCollectTotalCharges;
    }

    /**
     * Sets the <code>revCollectTotalsInd</code> property.
     * <p>
     * 
     * @param pRevCollectTotalsInd
     *            the new value of the <code>revCollectTotalsInd</code> property.
     */
    public void setRevCollectTotalsInd(final Boolean pRevCollectTotalsInd) {
        this.revCollectTotalsInd = pRevCollectTotalsInd;
    }

    /**
     * Sets the <code>revCollectValuationCharges</code> property.
     * <p>
     * 
     * @param pRevCollectValuationCharges
     *            the new value of the <code>revCollectValuationCharges</code> property.
     */
    public void setRevCollectValuationCharges(final BigDecimal pRevCollectValuationCharges) {
        this.revCollectValuationCharges = pRevCollectValuationCharges;
    }

    /**
     * Sets the <code>revCollectWeightCharges</code> property.
     * <p>
     * 
     * @param pRevCollectWeightCharges
     *            the new value of the <code>revCollectWeightCharges</code> property.
     */
    public void setRevCollectWeightCharges(final BigDecimal pRevCollectWeightCharges) {
        this.revCollectWeightCharges = pRevCollectWeightCharges;
    }

    /**
     * Sets the <code>revDestinationCurrency</code> property.
     * <p>
     * 
     * @param pRevDestinationCurrency
     *            the new value of the <code>revDestinationCurrency</code> property.
     */
    public void setRevDestinationCurrency(final String pRevDestinationCurrency) {
        this.revDestinationCurrency = pRevDestinationCurrency;
    }

    /**
     * Sets the <code>revExchangeRates</code> property.
     * <p>
     * 
     * @param pRevExchangeRates
     *            the new value of the <code>revExchangeRates</code> property.
     */
    public void setRevExchangeRates(final BigDecimal pRevExchangeRates) {
        this.revExchangeRates = pRevExchangeRates;
    }

    /**
     * Sets the <code>revPrepaidDisplayableTotalCharges</code> property.
     * <p>
     * 
     * @param pRevPrepaidDisplayableTotalCharges
     *            the new value of the <code>revPrepaidDisplayableTotalCharges</code> property.
     */
    public void setRevPrepaidDisplayableTotalCharges(final BigDecimal pRevPrepaidDisplayableTotalCharges) {
        this.revPrepaidDisplayableTotalCharges = pRevPrepaidDisplayableTotalCharges;
    }

    /**
     * Sets the <code>revPrepaidDisplayableWeightCharges</code> property.
     * <p>
     * 
     * @param pRevPrepaidDisplayableWeightCharges
     *            the new value of the <code>revPrepaidDisplayableWeightCharges</code> property.
     */
    public void setRevPrepaidDisplayableWeightCharges(final BigDecimal pRevPrepaidDisplayableWeightCharges) {
        this.revPrepaidDisplayableWeightCharges = pRevPrepaidDisplayableWeightCharges;
    }

    /**
     * Sets the <code>revPrepaidDueAgentCharges</code> property.
     * <p>
     * 
     * @param pRevPrepaidDueAgentCharges
     *            the new value of the <code>revPrepaidDueAgentCharges</code> property.
     */
    public void setRevPrepaidDueAgentCharges(final BigDecimal pRevPrepaidDueAgentCharges) {
        this.revPrepaidDueAgentCharges = pRevPrepaidDueAgentCharges;
    }

    /**
     * Sets the <code>revPrepaidDueCarrierCharges</code> property.
     * <p>
     * 
     * @param pRevPrepaidDueCarrierCharges
     *            the new value of the <code>revPrepaidDueCarrierCharges</code> property.
     */
    public void setRevPrepaidDueCarrierCharges(final BigDecimal pRevPrepaidDueCarrierCharges) {
        this.revPrepaidDueCarrierCharges = pRevPrepaidDueCarrierCharges;
    }

    /**
     * Sets the <code>revPrepaidPrintableTotalCharges</code> property.
     * <p>
     * 
     * @param pRevPrepaidPrintableTotalCharges
     *            the new value of the <code>revPrepaidPrintableTotalCharges</code> property.
     */
    public void setRevPrepaidPrintableTotalCharges(final BigDecimal pRevPrepaidPrintableTotalCharges) {
        this.revPrepaidPrintableTotalCharges = pRevPrepaidPrintableTotalCharges;
    }

    /**
     * Sets the <code>revPrepaidTotalCharges</code> property.
     * <p>
     * 
     * @param pRevPrepaidTotalCharges
     *            the new value of the <code>revPrepaidTotalCharges</code> property.
     */
    public void setRevPrepaidTotalCharges(final BigDecimal pRevPrepaidTotalCharges) {
        this.revPrepaidTotalCharges = pRevPrepaidTotalCharges;
    }

    /**
     * Sets the <code>revPrepaidTotalsInd</code> property.
     * <p>
     * 
     * @param pRevPrepaidTotalsInd
     *            the new value of the <code>revPrepaidTotalsInd</code> property.
     */
    public void setRevPrepaidTotalsInd(final Boolean pRevPrepaidTotalsInd) {
        this.revPrepaidTotalsInd = pRevPrepaidTotalsInd;
    }

    /**
     * Sets the <code>revPrepaidValuationCharges</code> property.
     * <p>
     * 
     * @param pRevPrepaidValuationCharges
     *            the new value of the <code>revPrepaidValuationCharges</code> property.
     */
    public void setRevPrepaidValuationCharges(final BigDecimal pRevPrepaidValuationCharges) {
        this.revPrepaidValuationCharges = pRevPrepaidValuationCharges;
    }

    /**
     * Sets the <code>revPrepaidWeightCharges</code> property.
     * <p>
     * 
     * @param pRevPrepaidWeightCharges
     *            the new value of the <code>revPrepaidWeightCharges</code> property.
     */
    public void setRevPrepaidWeightCharges(final BigDecimal pRevPrepaidWeightCharges) {
        this.revPrepaidWeightCharges = pRevPrepaidWeightCharges;
    }

    /**
     * Sets the <code>revPrepaiPrintableWeightCharges</code> property.
     * <p>
     * 
     * @param pRevPrepaiPrintableWeightCharges
     *            the new value of the <code>revPrepaiPrintableWeightCharges</code> property.
     */
    public void setRevPrepaiPrintableWeightCharges(final BigDecimal pRevPrepaiPrintableWeightCharges) {
        this.revPrepaiPrintableWeightCharges = pRevPrepaiPrintableWeightCharges;
    }

    /**
     * Sets the <code>routingSegmentOne</code> property.
     * <p>
     * 
     * @param pRoutingSegmentOne
     *            the new value of the <code>routingSegmentOne</code> property.
     */
    public void setRoutingSegmentOne(final RoutingSegmentDto pRoutingSegmentOne) {
        this.routingSegmentOne = pRoutingSegmentOne;
    }

    /**
     * Sets the <code>routingSegmentThree</code> property.
     * <p>
     * 
     * @param pRoutingSegmentThree
     *            the new value of the <code>routingSegmentThree</code> property.
     */
    public void setRoutingSegmentThree(final RoutingSegmentDto pRoutingSegmentThree) {
        this.routingSegmentThree = pRoutingSegmentThree;
    }

    /**
     * Sets the <code>routingSegmentTwo</code> property.
     * <p>
     * 
     * @param pRoutingSegmentTwo
     *            the new value of the <code>routingSegmentTwo</code> property.
     */
    public void setRoutingSegmentTwo(final RoutingSegmentDto pRoutingSegmentTwo) {
        this.routingSegmentTwo = pRoutingSegmentTwo;
    }

    /**
     * Sets the <code>shipperEmail</code> property.
     * <p>
     * 
     * @param pShipperEmail
     *            the new value of the <code>shipperEmail</code> property.
     */
    public void setShipperEmail(final String pShipperEmail) {
        this.shipperEmail = pShipperEmail;
    }

    /**
     * Sets the <code>shipperEmailCheck</code> property.
     * <p>
     * 
     * @param pShipperEmailCheck
     *            the new value of the <code>shipperEmailCheck</code> property.
     */
    public void setShipperEmailCheck(final boolean pShipperEmailCheck) {
        this.shipperEmailCheck = pShipperEmailCheck;
    }

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

	/**
	 * @return the prevPrepaidDisplayableWeightCharges
	 */
	public BigDecimal getPrevPrepaidDisplayableWeightCharges() {
		return prevPrepaidDisplayableWeightCharges;
	}

	/**
	 * @param prevPrepaidDisplayableWeightCharges the prevPrepaidDisplayableWeightCharges to set
	 */
	public void setPrevPrepaidDisplayableWeightCharges(BigDecimal prevPrepaidDisplayableWeightCharges) {
		this.prevPrepaidDisplayableWeightCharges = prevPrepaidDisplayableWeightCharges;
	}

	/**
	 * @return the ccaLockedPriorEQA
	 */
	public String getCcaLockedPriorEQA() {
		return ccaLockedPriorEQA;
	}

    //DL590 changes starts
	/**
	 * @return the isShipperModified
	 */
	public boolean isShipperModified() {
		return isShipperModified;
	}

    /*
	*Sets <code>isShipperModified</code>
	*/
	public void setShipperModified(boolean isShipperModified) {
		this.isShipperModified = isShipperModified;
	}

    /**
	 * @return the isConsigneeModified
	 */
	public boolean isConsigneeModified() {
		return isConsigneeModified;
	}

    /*
	*Sets <code>isConsigneeModified</code>
	*/
	public void setConsigneeModified(boolean isConsigneeModified) {
		this.isConsigneeModified = isConsigneeModified;
	}

	/**
	 * @return the autoSendEmail
	 */
	public boolean isAutoSendEmail() {
		return autoSendEmail;
	}

	/**
	 * @param autoSendEmail the autoSendEmail to set
	 */
	public void setAutoSendEmail(boolean autoSendEmail) {
		this.autoSendEmail = autoSendEmail;
	}

	/**
	 * @return the prepaidParticipant
	 */
	public boolean isPrepaidParticipant() {
		return prepaidParticipant;
	}

	/**
	 * @param prepaidParticipant the prepaidParticipant to set
	 */
	public void setPrepaidParticipant(boolean prepaidParticipant) {
		this.prepaidParticipant = prepaidParticipant;
	}

	/**
	 * @return the collectParticipant
	 */
	public boolean isCollectParticipant() {
		return collectParticipant;
	}

	/**
	 * @param collectParticipant the collectParticipant to set
	 */
	public void setCollectParticipant(boolean collectParticipant) {
		this.collectParticipant = collectParticipant;
	}
	//DL590 changes ends

}
