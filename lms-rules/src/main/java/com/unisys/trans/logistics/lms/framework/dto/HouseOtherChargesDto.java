package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.constants.CreditType;
import com.unisys.trans.logistics.lms.framework.constants.DueType;
import com.unisys.trans.logistics.lms.framework.constants.GenIdType;
import com.unisys.trans.logistics.lms.framework.constants.PayCodeType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>OtherChargesDto</code> contains specific data applicable to the Other Charges.
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

public class HouseOtherChargesDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>amount</code> property.
     */
    private BigDecimal amount;

    /**
     * Attribute to hold <code>autoIndicator</code> property.
     */

    private boolean autoIndicator;

    /**
     * Attribute to hold <code>chargeCode</code> property.
     */
    private String chargeCode;

    /**
     * Attribute to hold <code>autoAddDueCarrierInd</code> property.
     */
    private Boolean autoAddDueCarrierInd;

    /**
     * Attribute to hold <code>dueSetToEitherInd</code> property.
     */
    private Boolean dueSetToEitherInd;

    /**
     * Attribute to hold <code>destMiscAmount</code> property.
     */
    private BigDecimal destMiscAmount;

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
     * Attribute to hold <code>dueType</code> property.
     */
    private DueType dueType;

    /**
     * Attribute to hold <code>genIDType</code> property.
     */
    private GenIdType genIdType;

    /**
     * Attribute to hold <code>regenerateIndicator</code> property.
     */
    private boolean isRegenerateOtherCharge;

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
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>OtherChargeActualWeightIndicator</code> property.
     */
    private Boolean OtherChargeActualWeightIndicator;

    /**
     * Attribute to hold <code>time</code> property.
     */
    private Integer otherChargeTime;

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
     * Attribute to hold <code>subCode</code> property.
     */
    private String subCode;

    /**
     * Attribute to hold <code>timeIndicator</code> property.
     */
    private String timeIndicator;

    /**
     * Attribute to hold <code>timeIndicator</code> property.
     */
    private boolean weightChargeIndicator;

    /**
     * Gets the <code>Serialversionuid</code> property.
     * <p>
     * 
     * @return the current value of the <code>Serialversionuid</code> property.
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * Gets the <code>Amount</code> property.
     * <p>
     * 
     * @return the current value of the <code>Amount</code> property.
     */

    public BigDecimal getAmount() {
        if (this.amount != null) {
            this.amount = this.amount.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        }
        return this.amount;
    }

    /**
     * Gets the <code>ChargeCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>ChargeCode</code> property.
     */
    public String getChargeCode() {
        return this.chargeCode;
    }

    /**
     * Gets the <code>CreditType</code> property.
     * <p>
     * 
     * @return the current value of the <code>CreditType</code> property.
     */
    public CreditType getCreditType() {
        return this.creditType;
    }

    /**
     * Gets the <code>Date</code> property.
     * <p>
     * 
     * @return the current value of the <code>Date</code> property.
     */
    public Date getDate() {
        return ContractUtility.getClonedDate(this.date);
    }

    /**
     * Gets the <code>Description</code> property.
     * <p>
     * 
     * @return the current value of the <code>Description</code> property.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>DueType</code> property.
     * <p>
     * 
     * @return the current value of the <code>DueType</code> property.
     */
    public DueType getDueType() {
        return this.dueType;
    }

    /**
     * Gets the <code>GenIdType</code> property.
     * <p>
     * 
     * @return the current value of the <code>GenIdType</code> property.
     */
    public GenIdType getGenIdType() {
        return this.genIdType;
    }

    /**
     * Gets the <code>genIDType</code> property.
     * *@return the current value of the <code>GenIdType</code> property.
     */
    public GenIdType getGenIDType() {
        return this.genIdType;
    }

    /**
     * Gets the <code>MiscChargeAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>MiscChargeAmount</code> property.
     */
    public BigDecimal getMiscChargeAmount() {
        return this.miscChargeAmount;
    }

    /**
     * Gets the <code>MiscChargeParticipantCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>MiscChargeParticipantCode</code> property.
     */
    public String getMiscChargeParticipantCode() {
        return this.miscChargeParticipantCode;
    }

    /**
     * Gets the <code>MiscChargeQuantity</code> property.
     * <p>
     * 
     * @return the current value of the <code>MiscChargeQuantity</code> property.
     */
    public int getMiscChargeQuantity() {
        return this.miscChargeQuantity;
    }

    /**
     * Gets the <code>MiscChargeStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>MiscChargeStation</code> property.
     */
    public BigDecimal getMiscChargeStation() {
        return this.miscChargeStation;
    }

    /**
     * Gets the <code>MiscComputedDestiantionCharge</code> property.
     * <p>
     * 
     * @return the current value of the <code>MiscComputedDestiantionCharge</code> property.
     */
    public BigDecimal getMiscComputedDestiantionCharge() {
        return this.miscComputedDestiantionCharge;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>OId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>OtherChargeActualWeightIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>OtherChargeActualWeightIndicator</code> property.
     */
    public Boolean getOtherChargeActualWeightIndicator() {
        return this.OtherChargeActualWeightIndicator;
    }

    /**
     * Gets the <code>OtherChargeTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>OtherChargeTime</code> property.
     */

    public Integer getOtherChargeTime() {
        return this.otherChargeTime;
    }

    /**
     * Gets the <code>PayCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>PayCode</code> property.
     */
    public PayCodeType getPayCode() {
        return this.payCode;
    }

    /**
     * Gets the <code>Quantity</code> property.
     * <p>
     * 
     * @return the current value of the <code>Quantity</code> property.
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * Gets the <code>ServiceIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>ServiceIndicator</code> property.
     */
    public String getServiceIndicator() {
        return this.serviceIndicator;
    }

    /**
     * Gets the <code>SubCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>SubCode</code> property.
     */

    public String getSubCode() {
        return this.subCode;
    }

    /**
     * Gets the <code>TimeIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>TimeIndicator</code> property.
     */

    public String getTimeIndicator() {
        return this.timeIndicator;
    }

    /**
     * Gets the <code>AutoIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>AutoIndicator</code> property.
     */
    public boolean isAutoIndicator() {
        return this.autoIndicator;
    }

    /**
     * Gets the <code>DeleteIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>DeleteIndicator</code> property.
     */

    public boolean isDeleteIndicator() {
        return this.deleteIndicator;
    }

    /**
     * Gets the <code>PurgeIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>PurgeIndicator</code> property.
     */
    public boolean isPurgeIndicator() {
        return this.purgeIndicator;
    }

    /**
     * Gets the <code>RegenerateOtherCharge</code> property.
     * <p>
     * 
     * @return the current value of the <code>RegenerateOtherCharge</code> property.
     */
    public boolean isRegenerateOtherCharge() {
        return this.isRegenerateOtherCharge;
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
     * Sets the <code>amount</code> property.
     * <p>
     * 
     * the new value of the <code>amount</code> property.
     */
    public void setAmount(final BigDecimal pAmount) {
        this.amount = pAmount;
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
     * Sets the <code>dueType</code> property.
     * <p>
     * 
     * the new value of the <code>dueType</code> property.
     */

    public void setDueType(final DueType pDueType) {
        this.dueType = pDueType;
    }

    /**
     * Sets the <code>genIDType</code> property.
     * <p>
     * 
     * the new value of the <code>genIDType</code> property.
     */
    public void setGenIdType(final GenIdType pGenIdType) {
        this.genIdType = pGenIdType;
    }

    /**
     * Sets the <code>genIDType</code> property.
     * <p>
     * 
     * the new value of the <code>genIDType</code> property.
     */
    public void setGenIDType(final GenIdType pGenIDType) {
        this.genIdType = pGenIDType;
    }

    /**
     * Sets the <code>MiscChargeAmount</code> property.
     * <p>
     * 
     * the new value of the <code>MiscChargeAmount</code> property.
     */
    public void setMiscChargeAmount(final BigDecimal pMiscChargeAmount) {
        this.miscChargeAmount = pMiscChargeAmount;
    }

    /**
     * Sets the <code>MiscChargeParticipantCode</code> property.
     * <p>
     * 
     * the new value of the <code>MiscChargeParticipantCode</code> property.
     */
    public void setMiscChargeParticipantCode(final String pMiscChargeParticipantCode) {
        this.miscChargeParticipantCode = ContractUtility.convertToUpperCase(pMiscChargeParticipantCode);
    }

    /**
     * Sets the <code>MiscChargeQuantity</code> property.
     * <p>
     * 
     * the new value of the <code>MiscChargeQuantity</code> property.
     */
    public void setMiscChargeQuantity(final int pMiscChargeQuantity) {
        this.miscChargeQuantity = pMiscChargeQuantity;
    }

    /**
     * Sets the <code>MiscChargeStation</code> property.
     * <p>
     * 
     * the new value of the <code>MiscChargeStation</code> property.
     */
    public void setMiscChargeStation(final BigDecimal pMiscChargeStation) {
        this.miscChargeStation = pMiscChargeStation;
    }

    /**
     * Sets the <code>MiscComputedDestiantionCharge</code> property.
     * <p>
     * 
     * the new value of the <code>MiscComputedDestiantionCharge</code> property.
     */
    public void setMiscComputedDestiantionCharge(
                final BigDecimal pMiscComputedDestiantionCharge) {
        this.miscComputedDestiantionCharge = pMiscComputedDestiantionCharge;
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
     * the new value of the <code>OtherChargeActualWeightIndicator</code> property.
     */

    public void setOtherChargeActualWeightIndicator(final Boolean pOtherChargeActualWeightIndicator) {
        this.OtherChargeActualWeightIndicator = pOtherChargeActualWeightIndicator;
    }

    /**
     * Sets the <code>otherChargeEntries</code> property.
     * <p>
     * 
     * the new value of the <code>time</code> property.
     */
    public void setOtherChargeTime(final Integer pOtherChargeTime) {
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
     * Sets the <code>PurgeIndicator</code> property.
     * <p>
     * 
     * @param pPurgeIndicator
     *            holds the new value of <code>PurgeIndicator</code>.<br>
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
     * Sets the <code>RegenerateOtherCharge</code> property.
     * <p>
     * 
     * @param pRegenerateOtherCharge
     *            holds the new value of <code>RegenerateOtherCharge</code>.<br>
     */
    public void setRegenerateOtherCharge(final boolean pIsRegenerateOtherCharge) {
        this.isRegenerateOtherCharge = pIsRegenerateOtherCharge;
    }

    /**
     * Sets the <code>serviceIndicator</code> property.
     * <p>
     * 
     * the new value of the <code>serviceIndicator</code> property.
     */
    public void setServiceIndicator(final String pServiceIndicator) {
        this.serviceIndicator = ContractUtility.convertToUpperCase(pServiceIndicator);
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
     * Sets the <code>weightChargeIndicator</code> property.
     * <p>
     * 
     * @param pWeightChargeIndicator
     *            the new value of the <code>weightChargeIndicator</code> property.
     */
    public void setWeightChargeIndicator(final boolean pWeightChargeIndicator) {
        this.weightChargeIndicator = pWeightChargeIndicator;
    }

    /**
     * @return the autoAddDueCarrierInd
     */
    public Boolean isAutoAddDueCarrierInd() {
        return this.autoAddDueCarrierInd;
    }

    /**
     * @param autoAddDueCarrierInd the autoAddDueCarrierInd to set
     */
    public void setAutoAddDueCarrierInd(final Boolean pAutoAddDueCarrierInd) {
        this.autoAddDueCarrierInd = pAutoAddDueCarrierInd;
    }

    /**
     * @return the dueSetToEitherInd
     */
    public Boolean isDueSetToEitherInd() {
        return this.dueSetToEitherInd;
    }

    /**
     * @param dueSetToEitherInd the dueSetToEitherInd to set
     */
    public void setDueSetToEitherInd(final Boolean pDueSetToEitherInd) {
        this.dueSetToEitherInd = pDueSetToEitherInd;
    }

    /**
     * @return the destMiscAmount
     */
    public BigDecimal getDestMiscAmount() {
        return this.destMiscAmount;
    }

    /**
     * @param destMiscAmount the destMiscAmount to set
     */
    public void setDestMiscAmount(final BigDecimal pDestMiscAmount) {
        this.destMiscAmount = pDestMiscAmount;
    }
}
