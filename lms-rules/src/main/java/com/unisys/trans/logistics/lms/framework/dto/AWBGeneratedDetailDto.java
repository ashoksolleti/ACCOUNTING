package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.InternationalAWBType;

public class AWBGeneratedDetailDto implements Serializable {

    /**
     * Attribute to hold <code>serialVersionUID</code> property.
     */
    private static final long serialVersionUID = -2267252710967683714L;

    /**
     * Attribute to hold <code>assignInd</code> property.
     */
    private boolean assignInd;

    /**
     * Attribute to hold <code>awbPrintIndicator</code> property.
     */
    private boolean awbPrintIndicator;

    /**
     * Attribute to hold <code>collectChargesResInd</code> property.
     */
    private boolean collectChargesResInd;

    /**
     * Attribute to hold <code>destination</code> property.
     */
    private String destination;

    /**
     * Attribute to hold <code>eQAIQAInd</code> property.
     */
    private String eQAIQAInd;

    /**
     * Attribute to hold <code>eQALockingAuthorityIndicator</code> property.
     */
    private boolean eqaLockingAuthorityIndicator;

    /**
     * Attribute to hold <code>eQAUser</code> property.
     */
    private UserAuditDto eQAUser;

    /**
     * Attribute to hold <code>exportAuditInd</code> property.
     */
    private String exportAuditInd;

    /**
     * Attribute to hold <code>fieldChangeInd</code> property.
     */
    private boolean fieldChangeInd;

    /**
     * Attribute to hold <code>forcedtoAccInd</code> property.
     */
    private String forcedtoAccInd;

    /**
     * Attribute to hold <code>importAuditInd</code> property.
     */
    private String importAuditInd;

    /**
     * Attribute to hold <code>inBondIndicator</code> property.
     */
    private boolean inBondIndicator;

    /**
     * Attribute to hold <code>internationalCode</code> property.
     */
    private InternationalAWBType internationalCode;

    /**
     * Attribute to hold <code>iQAUser</code> property.
     */
    private UserAuditDto iQAUser;

    /**
     * Attribute to hold <code>lockedIndicator</code> property.
     */
    private boolean lockedIndicator;

    /**
     * Attribute to hold <code>lockedUser</code> property.
     */
    private UserAuditDto lockedUser;

    /**
     * Attribute to hold <code>manualAuditInd</code> property.
     */
    private boolean manualAuditInd;

    /**
     * Attribute to hold <code>origin</code> property.
     */
    private String origin;

    /**
     * Attribute to hold <code>vworkItems</code> property.
     */
    private List<WorkItemDto> workItems;

    /**
     * Attribute to hold <code>rateLockInd</code> property.
     */
    private boolean rateLockInd;

    /**
     * Attribute to hold <code>readyforDeliveryInd</code> property.
     */
    private boolean readyforDeliveryInd;

    /**
     * Attribute to hold <code>releasedtoAccInd</code> property.
     */
    private String releasedtoAccInd;

    /**
     * Attribute to hold <code>sendAWBtoAccInd</code> property.
     */
    private boolean sendAWBtoAccInd;

    /**
     * Attribute to hold <code>shipmentStatus</code> property.
     */
    private String shipmentStatus;

    /**
     * Attribute to hold <code>totalHouseAWBPieces</code> property.
     */
    private Integer totalHouseAWBPieces;

    /**
     * Gets the <code>destination</code> property.
     * 
     * @return the current value of the <code>destination</code> property.
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * Gets the <code>eQAIQAInd</code> property.
     * 
     * @return the current value of the <code>eQAIQAInd</code> property.
     */
    public String geteQAIQAInd() {
        return this.eQAIQAInd;
    }

    /**
     * Gets the <code>eQAUser</code> property.
     * 
     * @return the current value of the <code>eQAUser</code> property.
     */
    public UserAuditDto geteQAUser() {
        return this.eQAUser;
    }

    /**
     * Gets the <code>exportAuditInd</code> property.
     * 
     * @return the current value of the <code>exportAuditInd</code> property.
     */
    public String getExportAuditInd() {
        return this.exportAuditInd;
    }

    /**
     * Gets the <code>importAuditInd</code> property.
     * 
     * @return the current value of the <code>importAuditInd</code> property.
     */
    public String getImportAuditInd() {
        return this.importAuditInd;
    }

    /**
     * Gets the <code>internationalCode</code> property.
     * 
     * @return the current value of the <code>internationalCode</code> property.
     */
    public InternationalAWBType getInternationalCode() {
        return this.internationalCode;
    }

    /**
     * Gets the <code>iQAUser</code> property.
     * 
     * @return the current value of the <code>iQAUser</code> property.
     */
    public UserAuditDto getiQAUser() {
        return this.iQAUser;
    }

    /**
     * Gets the <code>lockedIndicator</code> property.
     * 
     * @return the current value of the <code>lockedIndicator</code> property.
     */
    public boolean getLockedIndicator() {
        return this.lockedIndicator;
    }

    /**
     * Gets the <code>lockedUser</code> property.
     * 
     * @return the current value of the <code>lockedUser</code> property.
     */
    public UserAuditDto getLockedUser() {
        return this.lockedUser;
    }

    /**
     * Gets the <code>origin</code> property.
     * 
     * @return the current value of the <code>origin</code> property.
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * Gets the <code>workItems</code> property.
     * 
     * @return the current value of the <code>workItems</code> property.
     */
    public List<WorkItemDto> getWorkItems() {
        return this.workItems;
    }

    /**
     * Gets the <code>shipmentStatus</code> property.
     * 
     * @return the current value of the <code>shipmentStatus</code> property.
     */
    public String getShipmentStatus() {
        return this.shipmentStatus;
    }

    /**
     * Gets the <code>totalHouseAWBPieces</code> property.
     * 
     * @return the current value of the <code>totalHouseAWBPieces</code> property.
     */
    public Integer getTotalHouseAWBPieces() {
        return this.totalHouseAWBPieces;
    }

    /**
     * Gets the <code>assignInd</code> property.
     * 
     * @return the current value of the <code>assignInd</code> property.
     */
    public boolean isAssignInd() {
        return this.assignInd;
    }

    /**
     * Gets the <code>awbPrintIndicator</code> property.
     * 
     * @return the current value of the <code>awbPrintIndicator</code> property.
     */
    public boolean isAwbPrintIndicator() {
        return this.awbPrintIndicator;
    }

    /**
     * Gets the <code>collectChargesResInd</code> property.
     * 
     * @return the current value of the <code>collectChargesResInd</code> property.
     */
    public boolean isCollectChargesResInd() {
        return this.collectChargesResInd;
    }

    /**
     * Gets the <code>eQALockingAuthorityIndicator</code> property.
     * 
     * @return the current value of the <code>eQALockingAuthorityIndicator</code> property.
     */
    public boolean isEqaLockingAuthorityIndicator() {
        return this.eqaLockingAuthorityIndicator;
    }

    /**
     * Gets the <code>fieldChangeInd</code> property.
     * 
     * @return the current value of the <code>fieldChangeInd</code> property.
     */
    public boolean isFieldChangeInd() {
        return this.fieldChangeInd;
    }

    /**
     * Gets the <code>forcedtoAccInd</code> property.
     * 
     * @return the current value of the <code>forcedtoAccInd</code> property.
     */
    public String getForcedtoAccInd() {
        return this.forcedtoAccInd;
    }

    /**
     * Gets the <code>inBondIndicator</code> property.
     * 
     * @return the current value of the <code>inBondIndicator</code> property.
     */
    public boolean isInBondIndicator() {
        return this.inBondIndicator;
    }

    /**
     * Gets the <code>manualAuditInd</code> property.
     * 
     * @return the current value of the <code>manualAuditInd</code> property.
     */
    public boolean isManualAuditInd() {
        return this.manualAuditInd;
    }

    /**
     * Gets the <code>rateLockInd</code> property.
     * 
     * @return the current value of the <code>rateLockInd</code> property.
     */
    public boolean isRateLockInd() {
        return this.rateLockInd;
    }

    /**
     * Gets the <code>readyforDeliveryInd</code> property.
     * 
     * @return the current value of the <code>readyforDeliveryInd</code> property.
     */
    public boolean isReadyforDeliveryInd() {
        return this.readyforDeliveryInd;
    }

    /**
     * Gets the <code>releasedtoAccInd</code> property.
     * 
     * @return the current value of the <code>releasedtoAccInd</code> property.
     */
    public String getReleasedtoAccInd() {
        return this.releasedtoAccInd;
    }

    /**
     * Gets the <code>sendAWBtoAccInd</code> property.
     * 
     * @return the current value of the <code>sendAWBtoAccInd</code> property.
     */
    public boolean isSendAWBtoAccInd() {
        return this.sendAWBtoAccInd;
    }

    /**
     * Sets the <code>assignInd</code> property.
     * 
     * @param pAssignInd
     *            the current value of the <code>assignInd</code> property.
     */
    public void setAssignInd(final boolean pAssignInd) {
        this.assignInd = pAssignInd;
    }

    /**
     * Sets the <code>awbPrintIndicator</code> property.
     * 
     * @param pAwbPrintIndicator
     *            the current value of the <code>awbPrintIndicator</code> property.
     */
    public void setAwbPrintIndicator(final boolean pAwbPrintIndicator) {
        this.awbPrintIndicator = pAwbPrintIndicator;
    }

    /**
     * Sets the <code>collectChargesResInd</code> property.
     * 
     * @param pCollectChargesResInd
     *            the current value of the <code>collectChargesResInd</code> property.
     */
    public void setCollectChargesResInd(final boolean pCollectChargesResInd) {
        this.collectChargesResInd = pCollectChargesResInd;
    }

    /**
     * Sets the <code>destination</code> property.
     * 
     * @param pDestination
     *            the current value of the <code>destination</code> property.
     */
    public void setDestination(final String pDestination) {
        this.destination = pDestination;
    }

    /**
     * Sets the <code>eQAIQAInd</code> property.
     * 
     * @param pEQAIQAInd
     *            the current value of the <code>eQAIQAInd</code> property.
     */
    public void seteQAIQAInd(final String pEQAIQAInd) {
        this.eQAIQAInd = pEQAIQAInd;
    }

    /**
     * Sets the <code>eQALockingAuthorityIndicator</code> property.
     * 
     * @param pEQALockingAuthorityIndicator
     *            the current value of the <code>eQALockingAuthorityIndicator</code> property.
     */
    public void setEqaLockingAuthorityIndicator(final boolean pEQALockingAuthorityIndicator) {
        this.eqaLockingAuthorityIndicator = pEQALockingAuthorityIndicator;
    }

    /**
     * Sets the <code>eQAUser</code> property.
     * 
     * @param pEQAUser
     *            the current value of the <code>eQAUser</code> property.
     */
    public void seteQAUser(final UserAuditDto pEQAUser) {
        this.eQAUser = pEQAUser;
    }

    /**
     * Sets the <code>exportAuditInd</code> property.
     * 
     * @param pExportAuditInd
     *            the current value of the <code>exportAuditInd</code> property.
     */
    public void setExportAuditInd(final String pExportAuditInd) {
        this.exportAuditInd = pExportAuditInd;
    }

    /**
     * Sets the <code>fieldChangeInd</code> property.
     * 
     * @param pFieldChangeInd
     *            the current value of the <code>fieldChangeInd</code> property.
     */
    public void setFieldChangeInd(final boolean pFieldChangeInd) {
        this.fieldChangeInd = pFieldChangeInd;
    }

    /**
     * Sets the <code>forcedtoAccInd</code> property.
     * 
     * @param pForcedtoAccInd
     *            the current value of the <code>forcedtoAccInd</code> property.
     */
    public void setForcedtoAccInd(final String pForcedtoAccInd) {
        this.forcedtoAccInd = pForcedtoAccInd;
    }

    /**
     * Sets the <code>importAuditInd</code> property.
     * 
     * @param pImportAuditInd
     *            the current value of the <code>importAuditInd</code> property.
     */
    public void setImportAuditInd(final String pImportAuditInd) {
        this.importAuditInd = pImportAuditInd;
    }

    /**
     * Sets the <code>inBondIndicator</code> property.
     * 
     * @param pInBondIndicator
     *            the current value of the <code>inBondIndicator</code> property.
     */
    public void setInBondIndicator(final boolean pInBondIndicator) {
        this.inBondIndicator = pInBondIndicator;
    }

    /**
     * Sets the <code>internationalCode</code> property.
     * 
     * @param pInternationalCode
     *            the current value of the <code>internationalCode</code> property.
     */
    public void setInternationalCode(final InternationalAWBType pInternationalCode) {
        this.internationalCode = pInternationalCode;
    }

    /**
     * Sets the <code>iQAUser</code> property.
     * 
     * @param pIQAUser
     *            the current value of the <code>iQAUser</code> property.
     */
    public void setiQAUser(final UserAuditDto pIQAUser) {
        this.iQAUser = pIQAUser;
    }

    /**
     * Sets the <code>lockedIndicator</code> property.
     * 
     * @param pLockedIndicator
     *            the current value of the <code>lockedIndicator</code> property.
     */
    public void setLockedIndicator(final boolean pLockedIndicator) {
        this.lockedIndicator = pLockedIndicator;
    }

    /**
     * Sets the <code>lockedUser</code> property.
     * 
     * @param pLockedUser
     *            the current value of the <code>lockedUser</code> property.
     */
    public void setLockedUser(final UserAuditDto pLockedUser) {
        this.lockedUser = pLockedUser;
    }

    /**
     * Sets the <code>manualAuditInd</code> property.
     * 
     * @param pManualAuditInd
     *            the current value of the <code>manualAuditInd</code> property.
     */
    public void setManualAuditInd(final boolean pManualAuditInd) {
        this.manualAuditInd = pManualAuditInd;
    }

    /**
     * Sets the <code>origin</code> property.
     * 
     * @param pOrigin
     *            the current value of the <code>origin</code> property.
     */
    public void setOrigin(final String pOrigin) {
        this.origin = pOrigin;
    }

    /**
     * Sets the <code>workItems</code> property.
     * 
     * @param pWorkItems
     *            the current value of the <code>workItems</code> property.
     */
    public void setWorkItems(final List<WorkItemDto> pWorkItems) {
        this.workItems = pWorkItems;
    }

    /**
     * Sets the <code>rateLockInd</code> property.
     * 
     * @param pRateLockInd
     *            the current value of the <code>rateLockInd</code> property.
     */
    public void setRateLockInd(final boolean pRateLockInd) {
        this.rateLockInd = pRateLockInd;
    }

    /**
     * Sets the <code>readyforDeliveryInd</code> property.
     * 
     * @param pReadyforDeliveryInd
     *            the current value of the <code>readyforDeliveryInd</code> property.
     */
    public void setReadyforDeliveryInd(final boolean pReadyforDeliveryInd) {
        this.readyforDeliveryInd = pReadyforDeliveryInd;
    }

    /**
     * Sets the <code>releasedtoAccInd</code> property.
     * 
     * @param pReleasedtoAccInd
     *            the current value of the <code>releasedtoAccInd</code> property.
     */
    public void setReleasedtoAccInd(final String pReleasedtoAccInd) {
        this.releasedtoAccInd = pReleasedtoAccInd;
    }

    /**
     * Sets the <code>sendAWBtoAccInd</code> property.
     * 
     * @param pSendAWBtoAccInd
     *            the current value of the <code>sendAWBtoAccInd</code> property.
     */
    public void setSendAWBtoAccInd(final boolean pSendAWBtoAccInd) {
        this.sendAWBtoAccInd = pSendAWBtoAccInd;
    }

    /**
     * Sets the <code>shipmentStatus</code> property.
     * 
     * @param pShipmentStatus
     *            the current value of the <code>shipmentStatus</code> property.
     */
    public void setShipmentStatus(final String pShipmentStatus) {
        this.shipmentStatus = pShipmentStatus;
    }

    /**
     * Sets the <code>totalHouseAWBPieces</code> property.
     * 
     * @param pTotalHouseAWBPieces
     *            the current value of the <code>totalHouseAWBPieces</code> property.
     */
    public void setTotalHouseAWBPieces(final Integer pTotalHouseAWBPieces) {
        this.totalHouseAWBPieces = pTotalHouseAWBPieces;
    }

}
