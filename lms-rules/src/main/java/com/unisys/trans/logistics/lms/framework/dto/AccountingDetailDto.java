package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.constants.ExclusionReasonType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AccountingDetail</code>is used for find Accounting Detail information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>acceptGoods</li>
 * <li>exclusionReason</li>
 * <li>exportReportingDate</li>
 * <li>importReportingDate</li>
 * <li>exportReportingStn</li>
 * <li>importReportingStn</li>
 * <li>releaseToAccountingIndicator</li>
 * <li>movementDate</li>
 * <li>movementStation</li>
 * </code>
 * </ul>
 */
public class AccountingDetailDto implements Serializable {

    /**
     * Unique Serial version UID.
     */
    private static final long serialVersionUID = -4058582401178359608L;

    /**
     * Attribute to holds <code>acceptGoods</code> property.
     */
    private String acceptGoods;

    /**
     * Attribute to holds <code>discrepancyReportingStation</code> property.
     */
    private String discrepancyReportingStn;

    /**
     * Attribute to holds <code>erReopenInd</code> property.
     */
    private boolean erReopenInd;

    private BigDecimal totalAcceptedVolumeAtER;

    private BigDecimal totalAcceptedWeightAtER;

    private Long totalDestinationPieces;

    /**
     * Attribute to holds <code>exclusionReason</code> property.
     */
    private ExclusionReasonType exclusionReason;

    /**
     * Attribute to holds <code>exportReportingDate</code> property.
     */
    private Date exportReportingDate;

    /**
     * Attribute to holds <code>exportReportingStn</code> property.
     */
    private String exportReportingStn;

    private Long exportReportingWeight;

    private String fdStatusInd;

    /**
     * Attribute to hold <code>firstAcceptedDateAtER </code>
     */
    private Date firstAcceptedDate;

    /**
     * Attribute to hold <code>firstAcceptedDateAtER </code>
     */
    private Date firstReceivedDateAtIR;

    /**
     * Attribute to holds <code>forcedToAccountingInd</code> property.
     */
    private String forcedToAccountingInd;

    /**
     * Attribute to holds <code>importReportingDate</code> property.
     */
    private Date importReportingDate;

    /**
     * Attribute to holds <code>importReportingStn</code> property.
     */
    private String importReportingStn;

    /**
     * Attribute to holds <code>irReopenInd</code> property.
     */
    private boolean irReopenInd;

    /**
     * Attribute to hold <code>lastAcceptedDateAtER  </code>
     */
    private Date lastAcceptedDate;

    /**
     * Attribute to hold <code>lastAcceptedDateAtER  </code>
     */
    private Date lastReceivedDateAtIR;

    /**
     * Attribute to holds <code>movementDate</code> property.
     */
    private Date movementDate;

    /**
     * Attribute to holds <code>movementStation</code> property.
     */
    private String movementStation;

    /**
     * Attribute to holds <code>releaseToAccountingIndicator</code> property.
     */
    private String releasedToAccountingInd;

    private Long totalAcceptedPieces;

    private BigDecimal totalAcceptedVolume;

    private BigDecimal totalAcceptedWeight;

    private Long bulkGoodsDiscrepancyBalancePieces;

    private BigDecimal bulkGoodsDiscrepancyBalanceVolume;

    private BigDecimal bulkGoodsDiscrepancyBalanceWeight;

    private Long slUldDiscrepancyBalancePieces;

    private BigDecimal SLULDDiscrepancyBalanceVolume;

    private BigDecimal SLULDDiscrepancyBalanceWeight;

    private Long totalExecutedPieces;

    private Long totalExportedPieces;

    private BigDecimal totalExportedVolume;

    private BigDecimal totalExportedWeight;

    private Long totalReceivedPiecesAtIR;

    private Long totalAcceptedPiecesAtER;

    private Long eligliblePiecesCheckIn;

    private Long eligliblePiecesDeliver;

    private Long actionedPiecesCheckIn;

    private Long actionedPiecesDeliver;

    private String shipmentLocation;

    private String deliveryRemarks;

    private Boolean delayIndicator;

    private String firstHostMechanizedStation;
    //DL569 starts
    private Date forcedtoAccountingDate;
    
	public Date getForcedtoAccountingDate() {
		return forcedtoAccountingDate;
	}

	public void setForcedtoAccountingDate(Date forcedtoAccountingDate) {
		this.forcedtoAccountingDate = forcedtoAccountingDate;
	}
    //DL569 ends

    private Long totalPiecesDelivered;

    /**
     * Gets the
     * <code>totalPiecesDelivered For CustomsRouting If Import clearance is made for the AWB All the pieces delivered are mapped in TotalExecutedPieces</code>
     * property.
     * 
     * @return the totalPiecesDelivered
     */
    public Long getTotalPiecesDelivered() {
        return totalPiecesDelivered;
    }

    public void setTotalPiecesDelivered(final Long pTtotalPiecesDelivered) {
        this.totalPiecesDelivered = pTtotalPiecesDelivered;
    }

    public String getShipmentLocation() {
        return shipmentLocation;
    }

    public void setShipmentLocation(final String pShipmentLocation) {
        this.shipmentLocation = pShipmentLocation;
    }

    public String getDeliveryRemarks() {
        return deliveryRemarks;
    }

    public void setDeliveryRemarks(final String pDeliveryRemarks) {
        this.deliveryRemarks = pDeliveryRemarks;
    }

    private ShipmentCapacityDto capacityDto;

    public ShipmentCapacityDto getCapacityDto() {
        return capacityDto;
    }

    public void setCapacityDto(final ShipmentCapacityDto pCapacityDto) {
        this.capacityDto = pCapacityDto;
    }

    public Long getEligliblePiecesCheckIn() {
        return this.eligliblePiecesCheckIn;
    }

    public void setEligliblePiecesCheckIn(final Long pEligliblePiecesCheckIn) {
        this.eligliblePiecesCheckIn = pEligliblePiecesCheckIn;
    }

    public Long getEligliblePiecesDeliver() {
        return this.eligliblePiecesDeliver;
    }

    public void setEligliblePiecesDeliver(final Long pEligliblePiecesDeliver) {
        this.eligliblePiecesDeliver = pEligliblePiecesDeliver;
    }

    public Long getActionedPiecesCheckIn() {
        return this.actionedPiecesCheckIn;
    }

    public void setActionedPiecesCheckIn(final Long pActionedPiecesCheckIn) {
        this.actionedPiecesCheckIn = pActionedPiecesCheckIn;
    }

    public Long getActionedPiecesDeliver() {
        return this.actionedPiecesDeliver;
    }

    public void setActionedPiecesDeliver(final Long pActionedPiecesDeliver) {
        this.actionedPiecesDeliver = pActionedPiecesDeliver;
    }

    /**
     * Gets the <code>acceptGoods</code> property.
     * 
     * @return the acceptGoods
     */
    public String getAcceptGoods() {
        return this.acceptGoods;
    }

    /**
     * Gets the <code>discrepancyReportingStn</code> property.
     * 
     * @return the discrepancyReportingStn
     */
    public String getDiscrepancyReportingStn() {
        return this.discrepancyReportingStn;
    }

    /**
     * Gets the <code>exclusionReason</code> property.
     * 
     * @return the exclusionReason
     */
    public ExclusionReasonType getExclusionReason() {
        return this.exclusionReason;
    }

    /**
     * Gets the <code>exportReportingDate</code> property.
     * 
     * @return the exportReportingDate
     */
    public Date getExportReportingDate() {
        return ContractUtility.getClonedDate(this.exportReportingDate);
    }

    /**
     * Gets the <code>exportReportingStn</code> property.
     * 
     * @return the exportReportingStn
     */
    public String getExportReportingStn() {
        return this.exportReportingStn;
    }

    public Long getExportReportingWeight() {
        return this.exportReportingWeight;
    }

    public String getFdStatusInd() {
        return this.fdStatusInd;
    }

    /**
     * @return the firstAcceptedDateAtER
     */
    public Date getFirstAcceptedDate() {
        return ContractUtility.getClonedDate(this.firstAcceptedDate);
    }

    /**
     * @return the firstReceivedDateAtIR
     */
    public Date getFirstReceivedDateAtIR() {
        return ContractUtility.getClonedDate(this.firstReceivedDateAtIR);
    }

    /**
     * Gets the <code>forcedToAccountingInd</code> property.
     * 
     * @return the forcedToAccountingInd
     */
    public String getForcedToAccountingInd() {
        return this.forcedToAccountingInd;
    }

    /**
     * Gets the <code>importReportingDate</code> property.
     * 
     * @return the importReportingDate
     */
    public Date getImportReportingDate() {
        return ContractUtility.getClonedDate(this.importReportingDate);
    }

    /**
     * Gets the <code>importReportingStn</code> property.
     * 
     * @return the importReportingStn
     */
    public String getImportReportingStn() {
        return this.importReportingStn;
    }

    /**
     * @return the lastAcceptedDateAtER
     */
    public Date getLastAcceptedDate() {
        return ContractUtility.getClonedDate(this.lastAcceptedDate);
    }

    /**
     * @return the lastReceivedDateAtIR
     */
    public Date getLastReceivedDateAtIR() {
        return ContractUtility.getClonedDate(this.lastReceivedDateAtIR);
    }

    /**
     * Gets the <code>movementDate</code> property.
     * 
     * @return the movementDate
     */
    public Date getMovementDate() {
        return ContractUtility.getClonedDate(this.movementDate);
    }

    /**
     * Gets the <code>movementStation</code> property.
     * 
     * @return the movementStation
     */
    public String getMovementStation() {
        return this.movementStation;
    }

    /**
     * Gets the <code>releaseToAccountingInd</code> property.
     * 
     * @return the releaseToAccountingInd
     */
    public String getReleasedToAccountingInd() {
        return this.releasedToAccountingInd;
    }

    /**
     * Gets the <code>totalAcceptedPieces</code> property.
     * <p>
     * 
     * @return the current value of <code>totalAcceptedPieces</code> property.
     */
    public Long getTotalAcceptedPieces() {
        return this.totalAcceptedPieces;
    }

    /**
     * Gets the <code>totalAcceptedVolume</code> property.
     * <p>
     * 
     * @return the current value of <code>totalAcceptedVolume</code> property.
     */
    public BigDecimal getTotalAcceptedVolume() {
        return this.totalAcceptedVolume;
    }

    /**
     * Gets the <code>totalAcceptedWeight</code> property.
     * <p>
     * 
     * @return the current value of <code>totalAcceptedWeight</code> property.
     */
    public BigDecimal getTotalAcceptedWeight() {
        return this.totalAcceptedWeight;
    }

    /**
     * Gets the <code>totalExecutedPieces</code> property.
     * <p>
     * 
     * @return the current value of <code>totalExecutedPieces</code> property.
     */
    public Long getTotalExecutedPieces() {
        return this.totalExecutedPieces;
    }

    /**
     * @return the totalExportedtedPieces
     */
    public Long getTotalExportedPieces() {
        return this.totalExportedPieces;
    }

    /**
     * @return the totalExportedVolume
     */
    public BigDecimal getTotalExportedVolume() {
        return this.totalExportedVolume;
    }

    /**
     * @return the totalExportedWeight
     */
    public BigDecimal getTotalExportedWeight() {
        return this.totalExportedWeight;
    }

    /**
     * Gets the <code>totalReceivedPiecesAtIR</code> property.
     * <p>
     * 
     * @return the current value of <code>totalReceivedPiecesAtIR</code>
     *         property.
     */
    public Long getTotalReceivedPiecesAtIR() {
        return this.totalReceivedPiecesAtIR;
    }

    /**
     * Gets the <code>erReopenInd</code> property.
     * 
     * @return the erReopenInd
     */
    public boolean isErReopenInd() {
        return this.erReopenInd;
    }

    /**
     * Gets the <code>irReopenInd</code> property.
     * 
     * @return the irReopenInd
     */
    public boolean isIrReopenInd() {
        return this.irReopenInd;
    }

    /**
     * Sets the <code>acceptGoods</code> property.
     * <p>
     * 
     * @param pAcceptGoods
     *            the new value of <code>acceptGoods</code> property.
     */
    public void setAcceptGoods(final String pAcceptGoods) {
        this.acceptGoods = pAcceptGoods;
    }

    /**
     * Sets the <code>discrepancyReportingStn</code> property.
     * <p>
     * 
     * @param pDiscrepancyReportingStn
     *            the new value of <code>discrepancyReportingStn</code>
     *            property.
     */
    public void setDiscrepancyReportingStn(final String pDiscrepancyReportingStn) {
        this.discrepancyReportingStn = pDiscrepancyReportingStn;
    }

    /**
     * Sets the <code>erReopenInd</code> property.
     * 
     * @param pErReopenInd
     *            the erReopenInd to set
     */
    public void setErReopenInd(final boolean pErReopenInd) {
        this.erReopenInd = pErReopenInd;
    }

    /**
     * Sets the <code>exclusionReason</code> property.
     * <p>
     * 
     * @param pExclusionReason
     *            the new value of <code>exclusionReason</code> property.
     */
    public void setExclusionReason(final ExclusionReasonType pExclusionReason) {
        this.exclusionReason = pExclusionReason;
    }

    /**
     * Sets the <code>exportReportingDate</code> property.
     * <p>
     * 
     * @param pExportReportingDate
     *            the new value of <code>exportReportingDate</code> property.
     */
    public void setExportReportingDate(final Date pExportReportingDate) {
        this.exportReportingDate = ContractUtility
                    .getClonedDate(pExportReportingDate);
    }

    /**
     * Sets the <code>exportReportingStn</code> property.
     * <p>
     * 
     * @param pExportReportingStn
     *            the new value of <code>exportReportingStn</code> property.
     */
    public void setExportReportingStn(final String pExportReportingStn) {
        this.exportReportingStn = pExportReportingStn;
    }

    /**
     * Sets the <code>exportReportingWeight</code> property.
     * <p>
     * 
     * @param pExportReportingWeight
     *            the new value of <code>exportReportingWeight</code> property.
     */
    public void setExportReportingWeight(final Long pExportReportingWeight) {
        this.exportReportingWeight = pExportReportingWeight;
    }

    public void setFdStatusInd(final String pFdStatusInd) {
        this.fdStatusInd = pFdStatusInd;
    }

    /**
     * @param firstAcceptedDate
     *            the firstAcceptedDateAtER to set
     */
    public void setFirstAcceptedDate(final Date pFirstAcceptedDate) {
        this.firstAcceptedDate = ContractUtility.getClonedDate(pFirstAcceptedDate);
    }

    /**
     * @param firstReceivedDateAtIR
     *            the firstReceivedDateAtIR to set
     */
    public void setFirstReceivedDateAtIR(final Date pFirstReceivedDateAtIR) {
        this.firstReceivedDateAtIR = ContractUtility.getClonedDate(pFirstReceivedDateAtIR);
    }

    /**
     * Sets the <code>forcedToAccountingInd</code> property.
     * <p>
     * 
     * @param pForcedToAccountingInd
     *            the new value of <code>forcedToAccountingInd</code> property.
     */
    public void setForcedToAccountingInd(final String pForcedToAccountingInd) {
        this.forcedToAccountingInd = pForcedToAccountingInd;
    }

    /**
     * Sets the <code>importReportingDate</code> property.
     * <p>
     * 
     * @param pImportReportingDate
     *            the new value of <code>importReportingDate</code> property.
     */
    public void setImportReportingDate(final Date pImportReportingDate) {
        this.importReportingDate = ContractUtility
                    .getClonedDate(pImportReportingDate);
    }

    /**
     * Sets the <code>importReportingStn</code> property.
     * <p>
     * 
     * @param pImportReportingStn
     *            the new value of <code>importReportingStn</code> property.
     */
    public void setImportReportingStn(final String pImportReportingStn) {
        this.importReportingStn = pImportReportingStn;
    }

    /**
     * Sets the <code>irReopenInd</code> property.
     * 
     * @param pIrReopenInd
     *            the irReopenInd to set
     */
    public void setIrReopenInd(final boolean pIrReopenInd) {
        this.irReopenInd = pIrReopenInd;
    }

    /**
     * @param lastAcceptedDate
     *            the lastAcceptedDateAtER to set
     */
    public void setLastAcceptedDate(final Date pLastAcceptedDate) {
        this.lastAcceptedDate = ContractUtility.getClonedDate(pLastAcceptedDate);
    }

    /**
     * @param lastReceivedDateAtIR
     *            the lastReceivedDateAtIR to set
     */
    public void setLastReceivedDateAtIR(final Date pLastReceivedDateAtIR) {
        this.lastReceivedDateAtIR = ContractUtility.getClonedDate(pLastReceivedDateAtIR);
    }

    /**
     * Sets the <code>movementDate</code> property.
     * <p>
     * 
     * @param pMovementDate
     *            the new value of <code>movementDate</code> property.
     */
    public void setMovementDate(final Date pMovementDate) {
        this.movementDate = ContractUtility.getClonedDate(pMovementDate);
    }

    /**
     * Sets the <code>movementStation</code> property.
     * <p>
     * 
     * @param pMovementStation
     *            the new value of <code>movementStation</code> property.
     */
    public void setMovementStation(final String pMovementStation) {
        this.movementStation = pMovementStation;
    }

    /**
     * Sets the <code>releaseToAccountingInd</code> property.
     * <p>
     * 
     * @param pReleaseToAccountingInd
     *            the new value of <code>releaseToAccountingInd</code> property.
     */
    public void setReleasedToAccountingInd(final String pReleaseToAccountingInd) {
        this.releasedToAccountingInd = pReleaseToAccountingInd;
    }

    /**
     * Sets the <code>totalAcceptedPieces</code> property.
     * 
     * @param pTotalAcceptedPieces
     *            the totalAcceptedPieces to set
     */
    public void setTotalAcceptedPieces(final Long pTotalAcceptedPieces) {
        this.totalAcceptedPieces = pTotalAcceptedPieces;
    }

    /**
     * Sets the <code>totalAcceptedVolume</code> property.
     * 
     * @param pTotalAcceptedVolume
     *            the totalAcceptedVolume to set
     */
    public void setTotalAcceptedVolume(final BigDecimal pTotalAcceptedVolume) {
        this.totalAcceptedVolume = pTotalAcceptedVolume;
    }

    /**
     * Sets the <code>totalAcceptedWeight</code> property.
     * 
     * @param pTotalAcceptedWeight
     *            the totalAcceptedWeight to set
     */
    public void setTotalAcceptedWeight(final BigDecimal pTotalAcceptedWeight) {
        this.totalAcceptedWeight = pTotalAcceptedWeight;
    }

    /**
     * Sets the <code>totalExecutedPieces</code> property.
     * 
     * @param pTotalExecutedPieces
     *            the totalExecutedPieces to set
     */
    public void setTotalExecutedPieces(final Long pTotalExecutedPieces) {
        this.totalExecutedPieces = pTotalExecutedPieces;
    }

    /**
     * @param totalExportedPieces
     *            the totalExportedtedPieces to set
     */
    public void setTotalExportedPieces(final Long pTotalExportedPieces) {
        this.totalExportedPieces = pTotalExportedPieces;
    }

    /**
     * @param totalExportedVolume
     *            the totalExportedVolume to set
     */
    public void setTotalExportedVolume(final BigDecimal pTotalExportedVolume) {
        this.totalExportedVolume = pTotalExportedVolume;
    }

    /**
     * @param totalExportedWeight
     *            the totalExportedWeight to set
     */
    public void setTotalExportedWeight(final BigDecimal pTotalExportedWeight) {
        this.totalExportedWeight = pTotalExportedWeight;
    }

    /**
     * Sets the <code>totalReceivedPiecesAtIR</code> property.
     * 
     * @param pTotalReceivedPiecesAtIR
     *            the totalReceivedPiecesAtIR to set
     */
    public void setTotalReceivedPiecesAtIR(final Long pTotalReceivedPiecesAtIR) {
        this.totalReceivedPiecesAtIR = pTotalReceivedPiecesAtIR;
    }

    public Long getTotalAcceptedPiecesAtER() {
        return this.totalAcceptedPiecesAtER;
    }

    public void setTotalAcceptedPiecesAtER(final Long pTotalAcceptedPiecesAtER) {
        this.totalAcceptedPiecesAtER = pTotalAcceptedPiecesAtER;
    }

    public BigDecimal getTotalAcceptedVolumeAtER() {
        return this.totalAcceptedVolumeAtER;
    }

    public void setTotalAcceptedVolumeAtER(final BigDecimal pTotalAcceptedVolumeAtER) {
        this.totalAcceptedVolumeAtER = pTotalAcceptedVolumeAtER;
    }

    public BigDecimal getTotalAcceptedWeightAtER() {
        return this.totalAcceptedWeightAtER;
    }

    public void setTotalAcceptedWeightAtER(final BigDecimal pTotalAcceptedWeightAtER) {
        this.totalAcceptedWeightAtER = pTotalAcceptedWeightAtER;
    }

    public Long getSlUldDiscrepancyBalancePieces() {
        return this.slUldDiscrepancyBalancePieces;
    }

    public void setSlUldDiscrepancyBalancePieces(
                final Long pSLULDDiscrepancyBalancePieces) {
        this.slUldDiscrepancyBalancePieces = pSLULDDiscrepancyBalancePieces;
    }

    public BigDecimal getSLULDDiscrepancyBalanceVolume() {
        return this.SLULDDiscrepancyBalanceVolume;
    }

    public void setSLULDDiscrepancyBalanceVolume(final BigDecimal pSLULDDiscrepancyBalanceVolume) {
        this.SLULDDiscrepancyBalanceVolume = pSLULDDiscrepancyBalanceVolume;
    }

    public BigDecimal getSLULDDiscrepancyBalanceWeight() {
        return this.SLULDDiscrepancyBalanceWeight;
    }

    public void setSLULDDiscrepancyBalanceWeight(final BigDecimal pSLULDDiscrepancyBalanceWeight) {
        this.SLULDDiscrepancyBalanceWeight = pSLULDDiscrepancyBalanceWeight;
    }

    public Long getBulkGoodsDiscrepancyBalancePieces() {
        return this.bulkGoodsDiscrepancyBalancePieces;
    }

    public void setBulkGoodsDiscrepancyBalancePieces(final Long pBulkGoodsDiscrepancyBalancePieces) {
        this.bulkGoodsDiscrepancyBalancePieces = pBulkGoodsDiscrepancyBalancePieces;
    }

    public BigDecimal getBulkGoodsDiscrepancyBalanceVolume() {
        return this.bulkGoodsDiscrepancyBalanceVolume;
    }

    public void setBulkGoodsDiscrepancyBalanceVolume(final BigDecimal pBulkGoodsDiscrepancyBalanceVolume) {
        this.bulkGoodsDiscrepancyBalanceVolume = pBulkGoodsDiscrepancyBalanceVolume;
    }

    public BigDecimal getBulkGoodsDiscrepancyBalanceWeight() {
        return this.bulkGoodsDiscrepancyBalanceWeight;
    }

    public void setBulkGoodsDiscrepancyBalanceWeight(final BigDecimal pBulkGoodsDiscrepancyBalanceWeight) {
        this.bulkGoodsDiscrepancyBalanceWeight = pBulkGoodsDiscrepancyBalanceWeight;
    }

    public Boolean getDelayIndicator() {
        return delayIndicator;
    }

    public void setDelayIndicator(final Boolean pDelayIndicator) {
        this.delayIndicator = pDelayIndicator;
    }

    public String getFirstHostMechanizedStation() {
        return firstHostMechanizedStation;
    }

    public void setFirstHostMechanizedStation(final String pFirstHostMechanizedStation) {
        this.firstHostMechanizedStation = pFirstHostMechanizedStation;
    }

    public Long getTotalDestinationPieces() {
        return this.totalDestinationPieces;
    }

    public void setTotalDestinationPieces(final Long pTotalDestinationPieces) {
        this.totalDestinationPieces = pTotalDestinationPieces;
    }

}