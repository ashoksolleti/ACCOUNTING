package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.constants.CreditType;
import com.unisys.trans.logistics.lms.framework.constants.DueType;
import com.unisys.trans.logistics.lms.framework.constants.GenIdType;
import com.unisys.trans.logistics.lms.framework.constants.OtherChargeCreationSourceType;
import com.unisys.trans.logistics.lms.framework.constants.PayCodeType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>OtherChargesDto</code> contains specific data applicable to the Other
 * Charges.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>amount
 * <li>chargeCode
 * <li>creditType
 * <li>date
 * <li>deleteIndicator
 * <li>description
 * <li>dueType
 * <li>genIdType
 * <li>oId
 * <li>otherChargeTime
 * <li>payCode
 * <li>quantity
 * <li>serviceIndicator
 * <li>subCode
 * <li>timeIndicator
 * </ul>
 * </code>
 */

public class OtherChargesDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    // For UC023
    /**
     * Attribute to hold <code>actualWeightChargesInd</code> property.
     */
    private boolean actualWeightChargesInd;

    /**
     * Attribute to hold <code>amount</code> property.
     */
    private BigDecimal amount;
    
    private String cashCreditType;
    private String responsibleParticipant;
    /**
     * Attribute to hold <code>appliedGTTaxPercentage</code> property.
     */
    private BigDecimal appliedGTTaxPercentage;
    
    public BigDecimal getAppliedGTTaxPercentage() {
		return appliedGTTaxPercentage;
	}

	public void setAppliedGTTaxPercentage(BigDecimal appliedGTTaxPercentage) {
		this.appliedGTTaxPercentage = appliedGTTaxPercentage;
	}

	public BigDecimal getAppliedVSTaxPercentage() {
		return appliedVSTaxPercentage;
	}

	public void setAppliedVSTaxPercentage(BigDecimal appliedVSTaxPercentage) {
		this.appliedVSTaxPercentage = appliedVSTaxPercentage;
	}

	public BigDecimal getAppliedVTTaxPercentage() {
		return appliedVTTaxPercentage;
	}

	public void setAppliedVTTaxPercentage(BigDecimal appliedVTTaxPercentage) {
		this.appliedVTTaxPercentage = appliedVTTaxPercentage;
	}

	/**
     * Attribute to hold <code>appliedVSTaxPercentage</code> property.
     */
    private BigDecimal appliedVSTaxPercentage;
    
    /**
     * Attribute to hold <code>appliedVTTaxPercentage</code> property.
     */
    private BigDecimal appliedVTTaxPercentage;

    /**
     * Attribute to hold <code>amountText</code> property.
     */
    private String amountText;

    /**
     * Attribute to hold <code>appliedRateType</code> property.
     */
    private String appliedRateType;

    /**
     * Attribute to hold <code>arbitaryNumber</code> property.
     */
    private Integer arbitaryNumber;

    /**
     * Attribute to hold <code>authority</code> property.
     */
    private boolean authority;

    /**
     * Attribute to hold <code>autoIndicator</code> property.
     */

    private boolean autoIndicator;

    /**
     * Attribute to hold <code>chargeCode</code> property.
     */
    private String chargeCode;

    /**
     * Attribute to hold <code>creditType</code> property.
     */
    private CreditType creditType;

    /**
     * Attribute to hold <code>date</code> property.
     */
    private Date date;

    /**
     * Attribute to hold <code>deleteIndicator</code> property.
     */
    private boolean deleteIndicator;

    /**
     * Attribute to hold <code>description</code> property.
     */
    private String description;
    
    /**
     * Attribute to hold <code>creationSourceType</code> property.
     * Stores the source of other charge creation(station based, product code, spl handling code based etc.)
     */
    private OtherChargeCreationSourceType creationSourceType;

    /**
     * Attribute to hold <code>destinationAmount</code> property.
     */
    private BigDecimal destinationAmount;

    /**
     * Attribute to hold <code>dueType</code> property.
     */
    private DueType dueType;

    /**
     * Attribute to hold <code>genAmount</code> property.
     */
    private BigDecimal genAmount;

    /**
     * Attribute to hold <code>genDays</code> property.
     */
    private Integer genDays;

    /**
     * Attribute to hold <code>genIDType</code> property.
     */
    private GenIdType genIDType;

    /**
     * Attribute to hold <code>includeInRevenue</code> property.
     */
    private String includeInRevenue;

    /**
     * Attribute to hold <code>isAmountNotGenerated</code> property.
     */
    private boolean amountNotGenerated;

    /**
     * Attribute to hold <code>isRegenerateOtherCharge</code> property.
     */
    private boolean regenerateOtherCharge;

    /**
     * Attribute to hold <code>isUserAmtEntryRequired</code> property.
     */
    private boolean userAmtEntryRequired;

    /**
	 * @return the cashCreditType
	 */
	public String getCashCreditType() {
		return cashCreditType;
	}

	/**
	 * @param cashCreditType the cashCreditType to set
	 */
	public void setCashCreditType(String cashCreditType) {
		this.cashCreditType = cashCreditType;
	}

	/**
	 * @return the responsibleParticipant
	 */
	public String getResponsibleParticipant() {
		return responsibleParticipant;
	}

	/**
	 * @param responsibleParticipant the responsibleParticipant to set
	 */
	public void setResponsibleParticipant(String responsibleParticipant) {
		this.responsibleParticipant = responsibleParticipant;
	}

	/**
     * Attribute to hold <code>localDescription</code> property.
     */
    private String localDescription;

    /**
     * Attribute to hold <code>localDescription</code> property.
     */
    private BigDecimal amountFWB;
    //For TR-1009585
    private boolean disableDuetype;
    
    private boolean styleDuetype;

    public boolean isStyleDuetype() {
        return styleDuetype;
    }

    public void setStyleDuetype(final boolean pStyleDuetype) {
        this.styleDuetype = pStyleDuetype;
    }

    public boolean isDisableDuetype() {
        return disableDuetype;
    }

    public void setDisableDuetype(final boolean pDisableDuetype) {
        this.disableDuetype = pDisableDuetype;
    }

    /**
     * Attribute to hold <code>Participant code Amount</code> property.
     */

    private BigDecimal miscChargeAmount;

    /**
     * Gets the <code>amount</code> property.
     * 
     */
    /**
     * Attribute to hold <code>Participant code misc</code> property.
     */

    private String miscChargeParticipantCode;

    /**
     * Attribute to hold <code>Participant charge quantity</code> property.
     */

    private int miscChargeQuantity;

    /**
     * Attribute to hold <code>Misc charge station </code> property.
     */

    private BigDecimal miscChargeStation;

    /**
     * Attribute to hold <code>Computed Destination misc charge </code> property.
     */

    private BigDecimal miscComputedDestiantionCharge;

    /**
     * Attribute to hold <code>negativeOtherChargeAmt</code> property.
     */
    private BigDecimal negativeOtherChargeAmt;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private boolean nonRatingLineBasedOCIndicator = false;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>OtherChargeActualWeightIndicator</code> property.
     */
    private Boolean OtherChargeActualWeightIndicator;

    /**
     * Attribute to hold <code>otherChargeRateType</code>.
     * <p>
     * Represents the rate type code controls how the rates are applied.
     */
    private String otherChargeRateType;

    private boolean otherChargeTaxInd;

    /**
     * Attribute to hold <code>time</code> property.
     */
    private String otherChargeTime;

    /**
     * Attribute to hold <code>payCode</code> property.
     */
    private PayCodeType payCode;

    /**
     * Attribute to hold <code>deleteIndicator</code> property.
     */
    private boolean purgeIndicator;

    /**
     * Attribute to hold <code>quantity</code> property.
     */
    private Integer quantity;

    /**
     * Attribute to hold <code>serviceIndicator</code> property.
     */
    private String serviceIndicator;

    /**
     * Attribute to hold <code>stationChargeApplied</code> property.
     */
    private boolean stationChargeApplied;
    
    /**
     * Attribute to hold <code>systemGeneratedOC</code> property.
     */
    private boolean systemGeneratedOC;

    /**
     * Attribute to hold <code>subCode</code> property.
     */
    private String subCode;

    /**
     * Attribute to hold <code>timeIndicator</code> property.
     */
    private String timeIndicator;

    /**
     * Attribute to hold <code>weightChargeIndicator</code> property.
     */
    private boolean weightChargeIndicator;

    /**
     * Attribute to hold <code>baseRateAggregate1</code> property.
     */
    private String baseRateAggregate1;

    /**
     * Attribute to hold <code>baseRateAggregate2</code> property.
     */
    private String baseRateAggregate2;

    /**
     * Attribute to hold <code>contractRateAggregate1</code> property.
     */
    private String contractRateAggregate1;

    /**
     * Attribute to hold <code>contractRateAggregate2</code> property.
     */
    private String contractRateAggregate2;

    /**
     * Attribute to hold <code>baseRateCurrency</code> property.
     */
    private String baseRateCurrency;

    /**
     * Attribute to hold <code>contractRateCurrency</code> property.
     */
    private String contractRateCurrency;

    /**
     * Attribute to hold <code>baseRate</code> property.
     */
    private BigDecimal baseRate;

    /**
     * Attribute to hold <code>contractRate</code> property.
     */
    private BigDecimal contractRate;

    /**
     * Attribute to hold <code>contractRate</code> property.
     */
    private boolean generateOCIndicator;

    /**
     * Attribute to hold <code>contractParticipant</code> property.
     */
    private String contractParticipant;

    /**
     * @return the baseRateAggregate1
     */
    public String getBaseRateAggregate1() {
        return this.baseRateAggregate1;
    }

    /**
     * @param pBaseRateAggregate1 the baseRateAggregate1 to set
     */
    public void setBaseRateAggregate1(final String pBaseRateAggregate1) {
        this.baseRateAggregate1 = pBaseRateAggregate1;
    }

    /**
     * @return the baseRateAggregate2
     */
    public String getBaseRateAggregate2() {
        return this.baseRateAggregate2;
    }

    /**
     * @param pBaseRateAggregate2 the baseRateAggregate2 to set
     */
    public void setBaseRateAggregate2(final String pBaseRateAggregate2) {
        this.baseRateAggregate2 = pBaseRateAggregate2;
    }

    /**
     * @return the contractRateAggregate1
     */
    public String getContractRateAggregate1() {
        return this.contractRateAggregate1;
    }

    /**
     * @param pContractRateAggregate1 the contractRateAggregate1 to set
     */
    public void setContractRateAggregate1(final String pContractRateAggregate1) {
        this.contractRateAggregate1 = pContractRateAggregate1;
    }

    /**
     * @return the contractRateAggregate2
     */
    public String getContractRateAggregate2() {
        return this.contractRateAggregate2;
    }

    /**
     * @param pContractRateAggregate2 the contractRateAggregate2 to set
     */
    public void setContractRateAggregate2(final String pContractRateAggregate2) {
        this.contractRateAggregate2 = pContractRateAggregate2;
    }

    /**
     * @return the baseRateCurrency
     */
    public String getBaseRateCurrency() {
        return this.baseRateCurrency;
    }

    /**
     * @param pBaseRateCurrency the baseRateCurrency to set
     */
    public void setBaseRateCurrency(final String pBaseRateCurrency) {
        this.baseRateCurrency = pBaseRateCurrency;
    }

    /**
     * @return the contractRateCurrency
     */
    public String getContractRateCurrency() {
        return this.contractRateCurrency;
    }

    /**
     * @param pContractRateCurrency the contractRateCurrency to set
     */
    public void setContractRateCurrency(final String pContractRateCurrency) {
        this.contractRateCurrency = pContractRateCurrency;
    }

    /**
     * @return the baseRate
     */
    public BigDecimal getBaseRate() {
        return this.baseRate;
    }

    /**
     * @param pBaseRate the baseRate to set
     */
    public void setBaseRate(final BigDecimal pBaseRate) {
        this.baseRate = pBaseRate;
    }

    /**
     * @return the contractRate
     */
    public BigDecimal getContractRate() {
        return this.contractRate;
    }

    /**
     * @param pContractRate the contractRate to set
     */
    public void setContractRate(final BigDecimal pContractRate) {
        this.contractRate = pContractRate;
    }

    /**
     * @return the contractParticipant
     */
    public String getContractParticipant() {
        return this.contractParticipant;
    }

    /**
     * @param pContractParticipant the contractParticipant to set
     */
    public void setContractParticipant(final String pContractParticipant) {
        this.contractParticipant = pContractParticipant;
    }

    /**
     * Gets the Serialversionuid.
     * <p>
     * 
     * @return the current value of <code>serialversionuid</code> property.<br>
     */

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * Gets the <code>Amount</code> property.
     * 
     * @return the current value of <code>Amount</code>.
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Gets the <code>amountText</code> property.
     * 
     * @return the current value of the <code>amountText</code> property.
     */
    public String getAmountText() {
        return this.amountText;
    }

    /**
     * Gets the <code>appliedRateType</code> property.
     * 
     * @return the current value of the <code>appliedRateType</code> property.
     */
    public String getAppliedRateType() {
        return this.appliedRateType;
    }

    /**
     * @return the arbitaryNumber
     */
    public Integer getArbitaryNumber() {
        return this.arbitaryNumber;
    }

    /**
     * Gets the <code>chargeCode</code> property.
     * 
     * @return the current value of <code>chargeCode</code>.
     */
    public String getChargeCode() {
        return ContractUtility.convertToUpperCase(this.chargeCode);
    }

    /**
     * Gets the <code>creditType</code> property.
     * 
     * @return the current value of <code>creditType</code>.
     */
    public CreditType getCreditType() {
        return this.creditType;
    }

    /**
     * Gets the <code>date</code> property.
     * 
     * @return the current value of <code>date</code>.
     */
    public Date getDate() {
        return ContractUtility.getClonedDate(this.date);
    }

    /**
     * Gets the <code>description</code> property.
     * 
     * @return the current value of <code>description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>destinationAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>destinationAmount</code> property.
     */
    public BigDecimal getDestinationAmount() {
        return this.destinationAmount;
    }

    /**
     * Gets the <code>dueType</code> property.
     * 
     * @return the current value of <code>dueType</code>.
     */
    public DueType getDueType() {
        return this.dueType;
    }

    /**
     * @return the genAmount
     */
    public BigDecimal getGenAmount() {
        return this.genAmount;
    }

    /**
     * @return the genDays
     */
    public Integer getGenDays() {
        return this.genDays;
    }

    /**
     * Gets the <code>genIDType</code> property.
     * 
     * @return the current value of <code>genIDType</code>.
     */
    public GenIdType getGenIDType() {
        return this.genIDType;
    }

    /**
     * @return the includeInRevenue
     */
    public String getIncludeInRevenue() {
        return this.includeInRevenue;
    }

    /**
     * Gets the <code>localDescription</code> property.
     * 
     * @return the current value of <code>localDescription</code>.
     */
    public String getLocalDescription() {
        return this.localDescription;
    }

    /**
     * Gets the MiscChargeAmount.
     * <p>
     * 
     * @return the current value of <code>miscChargeAmount</code> property.<br>
     */

    public BigDecimal getMiscChargeAmount() {
        return this.miscChargeAmount;
    }

    /**
     * Gets the MiscChargeParticipantCode.
     * <p>
     * 
     * @return the current value of <code>miscChargeParticipantCode</code> property.<br>
     */
    public String getMiscChargeParticipantCode() {
        return this.miscChargeParticipantCode;
    }

    /**
     * Gets theMiscChargeQuantity.
     * <p>
     * 
     * @return the current value of <code>miscChargeQuantity</code> property.<br>
     */

    public int getMiscChargeQuantity() {
        return this.miscChargeQuantity;
    }

    /**
     * Gets the MiscChargeStation.
     * <p>
     * 
     * @return the current value of <code>miscChargeStation</code> property.<br>
     */

    public BigDecimal getMiscChargeStation() {
        return this.miscChargeStation;
    }

    /**
     * Gets the MiscComputedDestiantionCharge.
     * <p>
     * 
     * @return the current value of <code>miscComputedDestiantionCharge</code> property.<br>
     */

    public BigDecimal getMiscComputedDestiantionCharge() {
        return this.miscComputedDestiantionCharge;
    }

    /**
     * Gets the <code>negativeOtherChargeAmt</code> property.
     * 
     * @return current value of the <code>negativeOtherChargeAmt</code> property.<br>
     */
    public BigDecimal getNegativeOtherChargeAmt() {
        return this.negativeOtherChargeAmt;
    }

    /**
     * Gets the oId.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.<br>
     */

    public Long getoId() {
        return this.oId;
    }

    /**
     * Gets the <code>OId</code> property.
     * 
     * @return the current value of <code>OId</code>.
     */

    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>OtherChargeActualWeightIndicator</code> property.
     * 
     * @return the current value of <code>OtherChargeActualWeightIndicator</code>.
     */
    public Boolean getOtherChargeActualWeightIndicator() {
        return this.OtherChargeActualWeightIndicator;
    }

    public String getOtherChargeRateType() {
        return this.otherChargeRateType;
    }

    public boolean getOtherChargeTaxInd() {
        return this.otherChargeTaxInd;
    }

    /**
     * Gets the <code>OtherChargeTime</code> property.
     * 
     * @return the current value of <code>OtherChargeTime</code>.
     */

    public String getOtherChargeTime() {
        return this.otherChargeTime;
    }

    /**
     * Gets the <code>payCode</code> property.
     * 
     * @return the current value of <code>payCode</code>.
     */
    public PayCodeType getPayCode() {
        return this.payCode;
    }

    /**
     * Gets the <code>quantity</code> property.
     * 
     * @return the current value of <code>quantity</code>.
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * Gets the <code>ServiceIndicator</code> property.
     * 
     * @return the current value of <code>ServiceIndicator</code>.
     */
    public String getServiceIndicator() {
        return this.serviceIndicator;
    }

    /**
     * Gets the <code>subCode</code> property.
     * 
     * @return the current value of <code>subCode</code>.
     */

    public String getSubCode() {
        return ContractUtility.convertToUpperCase(this.subCode);
    }

    /**
     * Gets the <code>timeIndicator</code> property.
     * 
     * @return the current value of <code>timeIndicator</code>.
     */

    public String getTimeIndicator() {
        return this.timeIndicator;
    }

    /**
     * @return the actualWeightChargesInd
     */
    public boolean isActualWeightChargesInd() {
        return this.actualWeightChargesInd;
    }

    /**
     * @return the isAmountNotGenerated
     */
    public boolean isAmountNotGenerated() {
        return this.amountNotGenerated;
    }

    /**
     * Gets the <code>authority</code> property.
     * 
     * @return the current value of <code>authority</code>.
     */
    public boolean isAuthority() {
        return this.authority;
    }

    /**
     * Gets the <code>autoIndicator</code> property.
     * 
     * 
     * @return this.the current value of the <code>autoIndicator</code> property.<br>
     */
    public boolean isAutoIndicator() {
        return this.autoIndicator;
    }

    /**
     * Gets the <code>deleteIndicator</code> property.
     * 
     * @return the current value of <code>flightRestrictionType</code>.
     */

    public boolean isDeleteIndicator() {
        return this.deleteIndicator;
    }

    /**
     * @return the nonRatingLineBasedOCIndicator
     */
    public boolean isNonRatingLineBasedOCIndicator() {
        return this.nonRatingLineBasedOCIndicator;
    }

    /**
     * Gets the <code>purgeIndicator</code> property.
     * 
     * @return the purgeIndicator.
     */
    public boolean isPurgeIndicator() {
        return this.purgeIndicator;
    }

    /**
     * Gets the <code>isRegenerateOtherCharge</code> property.
     * 
     * @return the isRegenerateOtherCharge.
     */
    public boolean isRegenerateOtherCharge() {
        return this.regenerateOtherCharge;
    }

    /**
     * @return the stationChargeApplied
     */
    public boolean isStationChargeApplied() {
        return this.stationChargeApplied;
    }

    /**
     * @return the isUserAmtEntryRequired
     */
    public boolean isUserAmtEntryRequired() {
        return this.userAmtEntryRequired;
    }

    /**
     * Gets the <code>weightChargeIndicator</code> property.
     * 
     * @return this.the current value of the <code>weightChargeIndicator</code> property.<br>
     */
    public boolean isWeightChargeIndicator() {
        return this.weightChargeIndicator;
    }

    /**
     * This method compares the old and new values of other charges
     * <p>
     * 
     * @param pObj
     *            holds the object of new other charges dto.
     * @returns true if it does not matches and false if it matches
     * 
     **/

    public boolean matches(final Object pObj) {

        final OtherChargesDto other = (OtherChargesDto) pObj;

        if (this.dueType == null && other.dueType != null) {
            return false;
        }
        else if (this.dueType != null && other.dueType == null) {
            return false;
        }
        else if (this.dueType != null && other.dueType != null) {
            if (!this.dueType.equals(other.getDueType())) {
                return false;
            }
        }

        if (this.amount == null && other.amount != null) {
            return false;
        }
        else if (this.amount != null && other.amount == null) {
            return false;
        }
        else if (this.amount != null && other.amount != null) {
            if (this.amount.compareTo(other.amount) != 0) {
                return false;
            }
        }

        if (this.date == null && other.date != null) {
            return false;
        }
        else if (this.date != null && other.date == null) {
            return false;
        }
        else if (this.date != null && other.date != null) {
            if (this.date.compareTo(other.date) != 0) {
                return false;
            }
        }

        if (this.quantity == null && other.quantity != null) {
            return false;
        }
        else if (this.quantity != null && other.quantity == null) {
            return false;
        }
        else if (this.quantity != null && other.quantity != null) {
            if (!this.quantity.equals(other.quantity)) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param pActualWeightChargesInd
     *            the actualWeightChargesInd to set
     */
    public void setActualWeightChargesInd(final boolean pActualWeightChargesInd) {
        this.actualWeightChargesInd = pActualWeightChargesInd;
    }

    /**
     * Sets the <code>amount</code> property.
     * <p>
     * 
     * the new value of the <code>amount</code> property.
     */
    public void setAmount(final BigDecimal pAmount) {
        this.amount = pAmount;
    }

    /**
     * @param pIsAmountNotGenerated
     *            the isAmountNotGenerated to set
     */
    public void setAmountNotGenerated(final boolean pIsAmountNotGenerated) {
        this.amountNotGenerated = pIsAmountNotGenerated;
    }

    /**
     * Sets the <code>amountText</code> property.
     * 
     * @param pAmountText
     *            the current value of the <code>amountText</code> property.
     */
    public void setAmountText(final String pAmountText) {
        this.amountText = pAmountText;
    }

    /**
     * Sets the <code>appliedRateType</code> property.
     * 
     * @param pApAppliedRateType
     *            the current value of the <code>appliedRateType</code> property.
     */
    public void setAppliedRateType(final String pApAppliedRateType) {
        this.appliedRateType = pApAppliedRateType;
    }

    /**
     * @param pArbitaryNumber
     *            the arbitaryNumber to set
     */
    public void setArbitaryNumber(final Integer pArbitaryNumber) {
        this.arbitaryNumber = pArbitaryNumber;
    }

    /**
     * Sets the <code>authority</code> property.
     * 
     * @param pAuthority
     *            the current value of the <code>authority</code> property.
     */
    public void setAuthority(final boolean pAuthority) {
        this.authority = pAuthority;
    }

    /**
     * Sets the <code>autoIndicator</code> property.
     * <p>
     * 
     * @param pAutoIndicator
     *            the new value of the <code>autoIndicator</code> property.
     */
    public void setAutoIndicator(final boolean pAutoIndicator) {
        this.autoIndicator = pAutoIndicator;
    }

    /**
     * Sets the <code>chargeCode</code> property.
     * <p>
     * 
     * the new value of the <code>chargeCode</code> property.
     */
    public void setChargeCode(final String pChargeCode) {
        this.chargeCode = ContractUtility.convertToUpperCase(pChargeCode);
    }

    /**
     * Sets the <code>creditType</code> property.
     * <p>
     * 
     * the new value of the <code>creditType</code> property.
     */

    public void setCreditType(final CreditType pCreditType) {
        this.creditType = pCreditType;
    }

    /**
     * Sets the <code>date</code> property.
     * <p>
     * 
     * the new value of the <code>date</code> property.
     */
    public void setDate(final Date pDate) {
        this.date = ContractUtility.getClonedDate(pDate);
    }

    /**
     * Sets the <code>deleteIndicator</code> property.
     * <p>
     * 
     * the new value of the <code>deleteIndicator</code> property.
     */

    public void setDeleteIndicator(final boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the <code>description</code> property.
     * <p>
     * 
     * the new value of the <code>description</code> property.
     */

    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the <code>pDestinationAmount</code>.
     * <p>
     * 
     * @param pDestinationAmount
     *            holds the new value of <code>destinationAmount</code>
     */
    public void setDestinationAmount(final BigDecimal pDestinationAmount) {
        this.destinationAmount = pDestinationAmount;
    }

    /**
     * Sets the <code>dueType</code> property.
     * <p>
     * 
     * the new value of the <code>dueType</code> property.
     */

    public void setDueType(final DueType pDueType) {
        this.dueType = pDueType;
    }

    /**
     * @param pGenAmount
     *            the genAmount to set
     */
    public void setGenAmount(final BigDecimal pGenAmount) {
        this.genAmount = pGenAmount;
    }

    /**
     * @param pGenDays
     *            the genDays to set
     */
    public void setGenDays(final Integer pGenDays) {
        this.genDays = pGenDays;
    }

    /**
     * Sets the <code>genIDType</code> property.
     * <p>
     * 
     * the new value of the <code>genIDType</code> property.
     */
    public void setGenIDType(final GenIdType pGenIDType) {
        this.genIDType = pGenIDType;
    }

    /**
     * @param pIncludeInRevenue
     *            the includeInRevenue to set
     */
    public void setIncludeInRevenue(final String pIncludeInRevenue) {
        this.includeInRevenue = pIncludeInRevenue;
    }

    /**
     * Sets the <code>localDescription</code> property.
     * 
     * @param pLocalDescription
     *            the current value of the <code>localDescription</code> property.
     */
    public void setLocalDescription(final String pLocalDescription) {
        this.localDescription = pLocalDescription;
    }

    /**
     * Sets the <code>MiscChargeAmount</code> property.
     * <p>
     * 
     * @param pMiscChargeAmount
     *            the new value of the <code>miscChargeAmount</code> property.
     */
    public void setMiscChargeAmount(final BigDecimal pMiscChargeAmount) {
        this.miscChargeAmount = pMiscChargeAmount;
    }

    /**
     * Sets the <code>miscChargeParticipantCode</code> property.
     * <p>
     * 
     * @param pMiscChargeParticipantCode
     *            the new value of the <code>miscChargeParticipantCode</code> property.
     */
    public void setMiscChargeParticipantCode(
                final String pMiscChargeParticipantCode) {
        this.miscChargeParticipantCode = pMiscChargeParticipantCode;
    }

    /**
     * Sets the <code>MiscChargeQuantity</code> property.
     * <p>
     * 
     * @param pMiscChargeQuantity
     *            the new value of the <code>miscChargeQuantity</code> property.
     */
    public void setMiscChargeQuantity(final int pMiscChargeQuantity) {
        this.miscChargeQuantity = pMiscChargeQuantity;
    }

    /**
     * Sets the <code>MiscChargeStation</code> property.
     * <p>
     * 
     * @param pMiscChargeStation
     *            the new value of the <code>miscChargeStation</code> property.
     */
    public void setMiscChargeStation(final BigDecimal pMiscChargeStation) {
        this.miscChargeStation = pMiscChargeStation;
    }

    /**
     * Sets the <code>MiscComputedDestiantionCharge</code> property.
     * <p>
     * 
     * @param pMiscComputedDestiantionCharge
     *            the new value of the <code>miscComputedDestiantionCharge</code> property.
     */
    public void setMiscComputedDestiantionCharge(
                final BigDecimal pMiscComputedDestiantionCharge) {
        this.miscComputedDestiantionCharge = pMiscComputedDestiantionCharge;
    }

    /**
     * Sets the <code>negativeOtherChargeAmt</code> property.
     * <p>
     * 
     * @param negativeOtherChargeAmt the pNegativeOtherChargeAmt to set
     */
    public void setNegativeOtherChargeAmt(final BigDecimal pNegativeOtherChargeAmt) {
        this.negativeOtherChargeAmt = pNegativeOtherChargeAmt;
    }

    /**
     * @param pNonRatingLineBasedOCIndicator
     *            the nonRatingLineBasedOCIndicator to set
     */
    public void setNonRatingLineBasedOCIndicator(
                final boolean pNonRatingLineBasedOCIndicator) {
        this.nonRatingLineBasedOCIndicator = pNonRatingLineBasedOCIndicator;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setoId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * the new value of the <code>oId</code> property.
     */

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>OtherChargeActualWeightIndicator</code> property.
     * <p>
     * 
     * @param pOtherChargeActualWeightIndicator
     *            the new value of the <code>OtherChargeActualWeightIndicator</code> property.
     */
    public void setOtherChargeActualWeightIndicator(
                final Boolean pOtherChargeActualWeightIndicator) {
        this.OtherChargeActualWeightIndicator = pOtherChargeActualWeightIndicator;
    }

    public void setOtherChargeRateType(final String pOtherChargeRateType) {
        this.otherChargeRateType = pOtherChargeRateType;
    }

    public void setOtherChargeTaxInd(final boolean pOtherChargeTaxInd) {
        this.otherChargeTaxInd = pOtherChargeTaxInd;
    }

    /**
     * Sets the <code>OtherChargeTime</code> property.
     * <p>
     * 
     * the new value of the <code>OtherChargeTime</code> property.
     */
    public void setOtherChargeTime(final String pOtherChargeTime) {
        this.otherChargeTime = pOtherChargeTime;
    }

    /**
     * Sets the <code>payCode</code> property.
     * <p>
     * 
     * the new value of the <code>payCode</code> property.
     */
    public void setPayCode(final PayCodeType pPayCode) {
        this.payCode = pPayCode;
    }

    /**
     * @param purgeIndicator
     *            the purgeIndicator to set
     */
    public void setPurgeIndicator(final boolean pPurgeIndicator) {
        this.purgeIndicator = pPurgeIndicator;
    }

    /**
     * Sets the <code>quantity</code> property.
     * <p>
     * 
     * the new value of the <code>quantity</code> property.
     */
    public void setQuantity(final Integer pQuantity) {
        this.quantity = pQuantity;
    }

    /**
     * @param isRegenerateOtherCharge
     *            the isRegenerateOtherCharge to set
     */
    public void setRegenerateOtherCharge(final boolean pIsRegenerateOtherCharge) {
        this.regenerateOtherCharge = pIsRegenerateOtherCharge;
    }

    /**
     * Sets the <code>serviceIndicator</code> property.
     * <p>
     * 
     * the new value of the <code>serviceIndicator</code> property.
     */
    public void setServiceIndicator(final String pServiceIndicator) {
        this.serviceIndicator = pServiceIndicator;
    }

    /**
     * @param pStationChargeApplied
     *            the stationChargeApplied to set
     */
    public void setStationChargeApplied(final boolean pStationChargeApplied) {
        this.stationChargeApplied = pStationChargeApplied;
    }

    /**
     * Sets the <code>subCode</code> property.
     * <p>
     * 
     * the new value of the <code>subCode</code> property.
     */
    public void setSubCode(final String pSubCode) {
        this.subCode = ContractUtility.convertToUpperCase(pSubCode);
    }

    /**
     * Sets the <code>timeIndicator</code> property.
     * <p>
     * 
     * the new value of the <code>timeIndicator</code> property.
     */

    public void setTimeIndicator(final String pTimeIndicator) {
        this.timeIndicator = ContractUtility.convertToUpperCase(pTimeIndicator);
    }

    /**
     * @param pIsUserAmtEntryRequired
     *            the isUserAmtEntryRequired to set
     */
    public void setUserAmtEntryRequired(final boolean pIsUserAmtEntryRequired) {
        this.userAmtEntryRequired = pIsUserAmtEntryRequired;
    }

    /**
     * Sets the <code>weightChargeIndicator</code> property.
     * <p>
     * 
     * @param pWeightChargeIndicator
     *            the new value of the <code>weightChargeIndicator</code> property.
     */
    public void setWeightChargeIndicator(final boolean pWeightChargeIndicator) {
        this.weightChargeIndicator = pWeightChargeIndicator;
    }

    public BigDecimal getAmountFWB() {
        return amountFWB;
    }

    public void setAmountFWB(final BigDecimal pAmountFWB) {
        this.amountFWB = pAmountFWB;
    }

    public boolean isGenerateOCIndicator() {
        return generateOCIndicator;
    }

    public void setGenerateOCIndicator(boolean generateOCIndicator) {
        this.generateOCIndicator = generateOCIndicator;
    }

	/**
	 * @return the systemGeneratedOC
	 */
	public boolean isSystemGeneratedOC() {
		return systemGeneratedOC;
	}

	/**
	 * @param systemGeneratedOC the systemGeneratedOC to set
	 */
	public void setSystemGeneratedOC(boolean systemGeneratedOC) {
		this.systemGeneratedOC = systemGeneratedOC;
	}

	/**
	 * @return the creationSourceType
	 */
	public OtherChargeCreationSourceType getCreationSourceType() {
		return this.creationSourceType;
	}

	/**
	 * @param pCreationSourceType the creationSourceType to set
	 */
	public void setCreationSourceType(final OtherChargeCreationSourceType pCreationSourceType) {
		this.creationSourceType = pCreationSourceType;
	}

}
