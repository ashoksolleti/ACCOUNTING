/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>SpecialHandlingCodeDto</code> contain details of cargo that requires special processing.
 * <p>
 * This contains all information about special handling code.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>alertGroupCode
 * <li>copyGoodsIndicator
 * <li>dangerousGoodsCode
 * <li>deleteSensitiveIndicator
 * <li>description
 * <li>forcedBookingCode
 * <li>fzdFzeMsgIndicator
 * <li>heavyIndicator
 * <li>hostIndicator
 * <li>oId
 * <li>otherChargeCode
 * <li>queueReasonCode
 * <li>rateClassCode
 * <li>sortingPriority
 * <li>specialHandlingCode
 * <li>substituteIataCode
 * </ul>
 */
public class SpecialHandlingCodeDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 334689856942507568L;

    /**
     * Attribute to hold <code>alertGroupCode</code> property.
     */
    private String alertGroupCode;

    /**
     * Attribute to hold <code>copyGoodsIndicator</code> property.
     */

    private boolean copyGoodsIndicator;

    /**
     * Attribute to hold <code>copyGoodsIndicator</code> property.
     * <p>
     * Copy Goods Indicator.It returns true or false value.<br>
     * <ul>
     * <li>Y - Copy SPL to existing goods/SLULD records when SPL code is added at AWB level.
     * <li>N - Does not copy to existing goods.
     * <li>
     * </ul>
     */

    private String dangerousGoodsCode;

    /**
     * Attribute to hold <code>dangerousGoodsCode</code> property.
     * <p>
     * Code that represents dangerous goods.
     */

    private boolean deleteSensitiveIndicator;

    /**
     * Attribute to hold <code>description</code> property.
     * <p>
     * It contains the description of the special handling code.
     */
    private String description;

    /**
     * Attribute to hold <code>forcedBookingCode</code> property.
     * <p>
     * It specifies the code for placing the booking on forced booking queue.
     */

    private String forcedBookingCode;

    /**
     * Attribute to hold <code>fzdFzeMsgIndicator</code> property.
     * <p>
     * Indicates whether the associated product type causes the automatic generation of FZD/FZE messages.
     */
    private boolean fzdFzeMsgIndicator;

    /**
     * Attribute to hold <code>heavyIndicator</code> property.
     * <p>
     * Indicates whether the presence of SPL allows the automatic generation of SPL HEA.
     */

    private boolean heavyIndicator;

    /**
     * Attribute to hold <code>hostIndicator</code> property.
     * <p>
     * Indicates if SPL code is defined by host.
     */

    private boolean hostIndicator;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Attribute to hold <code>otherChargeCode</code> property.
     * <p>
     * Miscellaneous charge code.
     */

    private String otherChargeCode;

    /**
     * Attribute to hold <code>queueReasonCode</code> property.
     * <p>
     * Alternate booking queue reason code.
     */
    private String queueReasonCode;

    /**
     * Attribute to hold <code>rateClassCode</code> property.
     */

    private String rateClassCode;

    /**
     * Attribute to hold <code>sortingPriority</code> property.
     */

    private int sortingPriority;

    /**
     * Attribute to hold <code>specialHandlingCode</code> property.
     */

    private String specialHandlingCode;
    /**
     * Attribute to hold <code>oldSpecialHandlingCode</code> property.
     */

    private String oldSpecialHandlingCode;

    /**
     * Attribute to hold <code>substituteIataCode</code> property.
     */

    private String substituteIataCode;

    /**
     * <code>Default Constructor.</code>
     */
    
    /**
     * Attribute to hold <code>restrictedonAircraft</code> property.
     * <p>
     * Indicates if SPL code is defined by host.
     */

    private boolean restrictedonAircraft;
    
    public SpecialHandlingCodeDto() {

    }

    /**
     * <code>Parameterized Constructor.</code>
     * <p>
     * 
     * @param pOId contains the Object Id.
     *            <p>
     * @param pSpecialHandlingCode contains the Special Handling Code.
     */

    public SpecialHandlingCodeDto(final Long pOId, final String pSpecialHandlingCode) {

        this.oId = pOId;
        this.specialHandlingCode = pSpecialHandlingCode;

    }

    /**
     * <code>Parameterized Constructor.</code>
     * <p>
     * 
     * @param pOId contains the Object Id.
     *            <p>
     * @param pSpecialHandlingCode contains the Special Handling Code.
     *            <p>
     * @param pSortPriority contains the sort priority.
     *            <p>
     * @param pHeavyIndicator contains the heavy indicator.
     *            <p>
     * @param pAlertGroupCode contains the alert group code.
     */
    public SpecialHandlingCodeDto(final Long pOId, final String pSpecialHandlingCode,
                final int pSortPriority, final boolean pHeavyIndicator, final String pAlertGroupCode) {

        this.oId = pOId;
        this.specialHandlingCode = pSpecialHandlingCode;
        this.sortingPriority = pSortPriority;
        this.heavyIndicator = pHeavyIndicator;
        this.alertGroupCode = pAlertGroupCode;
    

    }
    
    /**
     * <code>Parameterized Constructor.</code>
     * <p>
     * 
     * @param pOId contains the Object Id.
     *            <p>
     * @param pSpecialHandlingCode contains the Special Handling Code.
     *            <p>
     * @param pDescription contains the description.
     */
    public SpecialHandlingCodeDto(final Long pOId, final String pSpecialHandlingCode,
                final String pDescription) {

        this.oId = pOId;
        this.specialHandlingCode = pSpecialHandlingCode;
        this.description = pDescription;

    }

    /**
     * Gets the <code>alertGroupCode</code> property.
     * <p>
     * Below are the values used when storage charge dynamic parameter is set to S :
     * <ul>
     * <li>C - Forced CRU acceptance
     * <li>D - Dangerous Goods
     * <li>S - Special Storage Charges
     * <li>W - Dangerous goods requiring special storage charges (value D and S together).
     * <li>Y - Dangerous goods requiring CRU acceptance (value C and D together).
     * <li>Z - SPLs requiring CRU acceptance and special storage charges (value C and S together).
     * </ul>
     * <br>
     * When storage charge dynamic parameter is set to S, the GRP field values use alert codes C, D, S, W, Y,
     * and Z and these alert codes cannot be used for other purposes. However, other alert codes can be used
     * which do not affect the storage charge fees.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * C – Forced CRU acceptance
     * <p>
     * 
     * @return the current value of the <code>alertGroupCode</code> property.
     */
    public String getAlertGroupCode() {
        return this.alertGroupCode;
    }

    /**
     * Gets the <code>copyGoodsIndicator</code> property.
     * <p>
     * <b>Possible Values: </b>
     * <ul>
     * <li><code>true</code> <br>
     * If the <code>copyGoodsIndicator</code> property is host defined.
     * <li><code>false</code> <br>
     * If the <code>copyGoodsIndicator</code> property is not host defined,and is an IATA standard.
     * </ul>
     * <p>
     * 
     * @return the current value of the <code>copyGoodsIndicator</code> property.
     */
    @JsonIgnore
    public boolean getCopyGoodsIndicator() {
        return this.copyGoodsIndicator;
    }

    /**
     * Gets the <code>dangerousGoodsCode</code> property.
     * <p>
     * Code that represents dangerous goods.<br>
     * <b>Possible values :</b>
     * <ul>
     * <li>D <br>
     * Dangerous
     * <li>S <br>
     * Special Goods
     * </ul>
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * D – Dangerous
     * <p>
     * 
     * @return the current value of the <code>dangerousGoodsCode</code> property.
     */
    public String getDangerousGoodsCode() {
        return this.dangerousGoodsCode;
    }

    /**
     * Gets the <code>deleteSensitiveIndicator</code> property.
     * <p>
     * Indicator for queuing booking history to PCTL queue. <br>
     * It specifies that the booking having this SPL, if deleted within minutes before expected flight
     * departure, should cause the booking history to be queued to the PCTL DL queue.
     * <p>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li> <code>true</code> <br>
     * Causes booking history to be queued to the BCTL DL queue<br>
     * <li><code>false</code> <br>
     * Does not cause booking history to be queued to the BCTL DL queue.
     * </ul>
     * <p>
     * 
     * @return the current value of the <code>deleteSensitiveIndicator</code> property.
     */
    @JsonIgnore
    public boolean getDeleteSensitiveIndicator() {
        return this.deleteSensitiveIndicator;
    }

    /**
     * Gets the <code>description</code> property.
     * <p>
     * It contains the description of the special handling code.
     * <p>
     * <b>Format: </b><br>
     * 1-50 Characters
     * <p>
     * <b>Example: </b><br>
     * Live Animal
     * <p>
     * 
     * @return the current value of the <code>description</code> property.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>forcedBookingCode</code> property.
     * <p>
     * It specifies the code for placing the booking on forced booking queue. <br>
     * <b>Possible values :</b>
     * <ul>
     * <li>Y <br>
     * It must be approved by controlling station of the flight for guaranteed Booking.
     * <li>A <br>
     * It must be approved by controlling station of the flight for Allotment booking segments.
     * <li>B <br>
     * It must be approved by controlling station of the flight for both guaranteed Booking Capacity and
     * Allotment booking segments.
     * <li>N <br>
     * It does not need controlling station of the flight approval.
     * </ul>
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * Y – special handling code must be approved by controlling station of the flight for guaranteed booking
     * capacity booking segments.
     * <p>
     * 
     * @return the current value of the <code>forcedBookingCode</code> property.
     */
    public String getForcedBookingCode() {
        return this.forcedBookingCode;
    }

    /**
     * Gets the <code>fzdFzeMsgIndicator</code> property.
     * <p>
     * FZD/FZE message generation indicator.Indicates whether the associated product type causes the automatic
     * generation of FZD/FZE messages.
     * <p>
     * <b>Possible values: </b><br>
     * <ul>
     * <li> <code>true</code> <br>
     * Causes FZD/FZE message generation.
     * <li><code>false</code> <br>
     * Does not cause FZD/FZE message generation.
     * </ul>
     * <p>
     * 
     * @return the current value of the <code>fzdFzeMsgIndicator</code> property.
     */
    @JsonIgnore
    public boolean getFzdFzeMsgIndicator() {
        return this.fzdFzeMsgIndicator;
    }

    /**
     * Gets the <code>heavyIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li>Y <br>
     * Presence of SPL stops auto HEA generation.
     * <li>N <br>
     * Presence of SPL does not stop auto HEA generation.
     * </ul>
     * <p>
     * 
     * @return the current value of the <code>heavyIndicator</code> property.
     */
    @JsonIgnore
    public boolean getHeavyIndicator() {
        return this.heavyIndicator;
    }

    /**
     * Gets the <code>hostIndicator</code> property.
     * <p>
     * Indicates whether the presence of this SPL allows the automatic generation of SPL HEA. <br>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li><code>true</code> <br>
     * SPL code defined by host.
     * <li><code>false</code> <br>
     * SPL is not host defined, code is an IATA standard.
     * </ul>
     * <p>
     * 
     * @return the current value of the <code>heavyIndicator</code> property.
     */
    @JsonIgnore
    public boolean getHostIndicator() {
        return this.hostIndicator;
    }

    /**
     * Gets the value of <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the value of <code>otherChargeCode</code> property.
     * <p>
     * Miscellaneous charge code. This is automatically included in the AWB along with the SPL code. The other
     * charge code should be validated against the other charge code table.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets
     * <p>
     * <b>Example: </b><br>
     * AA
     * <p>
     * 
     * @return the current value of the <code>otherChargeCode</code>property.
     */
    public String getOtherChargeCode() {
        return this.otherChargeCode;
    }

    /**
     * Gets the <code>queueReasonCode</code> property.
     * <p>
     * Alternate booking queue reason code. The queue reason code should be validated against the queue reason
     * code table.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets
     * <p>
     * <b>Example: </b><br>
     * BA
     * <p>
     * 
     * @return the current value of the<code> queueReasonCode</code> property.
     */
    public String getQueueReasonCode() {
        return this.queueReasonCode;
    }

    /**
     * Gets the <code>rateClassCode</code> property.
     * <p>
     * Rate class ID that is used with the SPL to rate the air waybill.
     * <p>
     * <b>Format: </b><br>
     * 1-6 Alphabets
     * <p>
     * <b>Example: </b><br>
     * HUM
     * <p>
     * 
     * @return the current value of the<code>rateClassCode</code> property.
     */
    public String getRateClassCode() {
        return this.rateClassCode;
    }

    /**
     * Gets the <code>sortingPriority</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of the <code>sortingPriority</code> property.
     */
    public int getSortingPriority() {
        return this.sortingPriority;
    }

    /**
     * Gets the <code>specialHandlingCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @return the current value of the <code>specialHandlingCode</code> property.
     */
    public String getSpecialHandlingCode() {
        return this.specialHandlingCode;
    }

    /**
     * Gets the <code>substituteIataCode</code> property.
     * <p>
     * Substitute SPL code for SPL code on out bound CGOIMP messages. When entered must be an existing IATA
     * defined code and not a host defined SPL code.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @return the current value of the <code>substituteIataCode</code> property.
     */
    public String getSubstituteIataCode() {
        return this.substituteIataCode;
    }

    /**
     * Determines if the <code>copyGoodsIndicator</code> property is true.
     * <p>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li><code>true</code> <br>
     * If the <code>copyGoodsIndicator</code> property is host defined.<br>
     * <li><code>false</code> <br>
     * If the <code>copyGoodsIndicator</code> property is not host defined, and is an IATA standard.
     * </ul>
     * <p>
     * 
     * @return the current value of <code>copyGoodsIndicator</code> property.
     */
    public boolean isCopyGoodsIndicator() {
        return this.copyGoodsIndicator;
    }

    /**
     * Determines if the <code>deleteSensitiveIndicator</code> property is true.
     * <p>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li><code>true</code> <br>
     * Causes booking history to be queued to the BCTL DL queue.
     * <li><code>false</code> <br>
     * Does not cause booking history to be queued to the BCTL DL queue.
     * </ul>
     * <p>
     * 
     * @return the current value of <code>deleteSensitiveIndicator</code> property.
     */
    public boolean isDeleteSensitiveIndicator() {
        return this.deleteSensitiveIndicator;
    }

    /**
     * Determines if the <code>fzdFzeMsgGenerationIndicator</code> property is true.
     * <p>
     * <b>Possible values: </b><br>
     * <ul>
     * <li><code>true</code> <br>
     * Causes FSD/FZG message generation.
     * <li><code>false</code> <br>
     * Does not cause FSD/FZG message generation.
     * </ul>
     * <p>
     * 
     * @return the current value of <code>fzdFzeMsgIndicator</code> property.
     */
    public boolean isFzdFzeMsgIndicator() {
        return this.fzdFzeMsgIndicator;
    }

    /**
     * Determines if the <code>heavyGenerationIndicator</code> property is true.
     * <p>
     * <b>Possible Values: </b>
     * <ul>
     * <li><code>true</code> <br>
     * Stops auto HEA generation.
     * <li><code>false</code> <br>
     * Does not stop auto HEA generation.
     * </ul>
     * <p>
     * 
     * @return the current value of <code>heavyGenerationIndicator</code> property.
     */
    public boolean isHeavyIndicator() {
        return this.heavyIndicator;
    }

    /**
     * Determines if the <code>hostDefinedCodeIndicator</code> property is true.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> <br>
     * SPL code defined by host. <code>false</code> <br>
     * SPL is not host defined, code is an IATA standard.
     * <p>
     * 
     * @return the current value of <code>hostDefinedCodeIndicator</code> property.
     */
    public boolean isHostIndicator() {
        return this.hostIndicator;
    }

    /**
     * Sets the <code>alertGroupCode</code> property.
     * <p>
     * Below are the values used when storage charge dynamic parameter is set to S :
     * <ul>
     * <li>C - Forced CRU acceptance
     * <li>D - Dangerous Goods
     * <li>S - Special Storage Charges
     * <li>W - Dangerous goods requiring special storage charges (value D and S together).
     * <li>Y - Dangerous goods requiring CRU acceptance (value C and D together).
     * <li>Z - SPLs requiring CRU acceptance and special storage charges (value C and S together).
     * </ul>
     * <br>
     * When storage charge dynamic parameter is set to S, the GRP field values use alert codes C, D, S, W, Y,
     * and Z and these alert codes cannot be used for other purposes. However, other alert codes can be used
     * which do not affect the storage charge fees.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * C – Forced CRU acceptance
     * <p>
     * 
     * @param pAlertGroupCode the new value of the <code>alertGroupCode</code> property.
     */
    public void setAlertGroupCode(final String pAlertGroupCode) {
        this.alertGroupCode = ContractUtility.convertToUpperCase(pAlertGroupCode);
    }

    /**
     * Sets the <code>copyGoodsIndicator</code> property.
     * <p>
     * <b>Possible Values: </b>
     * <ul>
     * <li><code>true</code> <br>
     * If the <code>copyGoodsIndicator</code> property is host defined.
     * <li><code>false</code> <br>
     * If the <code>copyGoodsIndicator</code> property is not host defined,and is an IATA standard.
     * </ul>
     * <p>
     * 
     * @param pCopyGoodsIndicator the new value of the <code>copyGoodsIndicator</code> property.
     */
    public void setCopyGoodsIndicator(final boolean pCopyGoodsIndicator) {
        this.copyGoodsIndicator = pCopyGoodsIndicator;
    }

    /**
     * Sets the <code>dangerousGoodsCode</code> property.
     * <p>
     * Code that represents dangerous goods.<br>
     * <b>Possible values :</b>
     * <ul>
     * <li>D <br>
     * Dangerous
     * <li>S <br>
     * Special Goods
     * </ul>
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * D – Dangerous
     * <p>
     * 
     * @param pDangerousGoodsCode the new value of the <code>dangerousGoodsCode</code> property.
     */
    public void setDangerousGoodsCode(final String pDangerousGoodsCode) {
        this.dangerousGoodsCode = ContractUtility.convertToUpperCase(pDangerousGoodsCode);
    }

    /**
     * Sets the <code>deleteSensitiveIndicator</code> property.
     * <p>
     * Indicator for queuing booking history to PCTL queue. <br>
     * It specifies that the booking having this SPL, if deleted within minutes before expected flight
     * departure, should cause the booking history to be queued to the PCTL DL queue.
     * <p>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li> <code>true</code> <br>
     * Causes booking history to be queued to the BCTL DL queue<br>
     * <li><code>false</code> <br>
     * Does not cause booking history to be queued to the BCTL DL queue.
     * </ul>
     * <p>
     * 
     * @param pDeleteSensitiveIndicator the new value of the <code>deleteSensitiveIndicator</code> property.
     */
    public void setDeleteSensitiveIndicator(final boolean pDeleteSensitiveIndicator) {
        this.deleteSensitiveIndicator = pDeleteSensitiveIndicator;
    }

    /**
     * Sets the <code>description</code> property.
     * <p>
     * It contains the description of the special handling code.
     * <p>
     * <b>Format: </b><br>
     * 1-50 Characters
     * <p>
     * <b>Example: </b><br>
     * Live Animal
     * <p>
     * 
     * @param pDescription the new value of the <code>description</code> property.
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the <code>forcedBookingCode</code> property.
     * <p>
     * It specifies the code for placing the booking on forced booking queue. <br>
     * <b>Possible values :</b>
     * <ul>
     * <li>Y <br>
     * It must be approved by controlling station of the flight for guaranteed Booking.
     * <li>A <br>
     * It must be approved by controlling station of the flight for Allotment booking segments.
     * <li>B <br>
     * It must be approved by controlling station of the flight for both guaranteed Booking Capacity and
     * Allotment booking segments.
     * <li>N <br>
     * It does not need controlling station of the flight approval.
     * </ul>
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * Y – special handling code must be approved by controlling station of the flight for guaranteed booking
     * capacity booking segments.
     * <p>
     * 
     * @param pForcedBookingCode the new value of the <code>forcedBookingCode </code>property.
     */
    public void setForcedBookingCode(final String pForcedBookingCode) {
        this.forcedBookingCode = ContractUtility.convertToUpperCase(pForcedBookingCode);
    }

    /**
     * Sets the <code>fzdFzeMsgIndicator</code> property.
     * <p>
     * FZD/FZE message generation indicator.Indicates whether the associated product type causes the automatic
     * generation of FZD/FZE messages.
     * <p>
     * <b>Possible values: </b><br>
     * <ul>
     * <li> <code>true</code> <br>
     * Causes FZD/FZE message generation.
     * <li><code>false</code> <br>
     * Does not cause FZD/FZE message generation.
     * </ul>
     * <p>
     * 
     * @param pFzdFzeMsgIndicator the new value of the <code>fzdFzeMsgIndicator</code> property.
     */
    public void setFzdFzeMsgIndicator(final boolean pFzdFzeMsgIndicator) {
        this.fzdFzeMsgIndicator = pFzdFzeMsgIndicator;
    }

    /**
     * Sets the value of the <code>heavyIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> <br>
     * Stops auto HEA generation. <code>false</code> <br>
     * Does not stop auto HEA generation.
     * <p>
     * 
     * @param pHeavyIndicator the new value of the <code>heavyGenerationIndicator</code> property.
     */
    public void setHeavyIndicator(final boolean pHeavyIndicator) {
        this.heavyIndicator = pHeavyIndicator;
    }

    /**
     * Sets the <code>hostIndicator</code> property.
     * <p>
     * Indicates whether the presence of this SPL allows the automatic generation of SPL HEA. <br>
     * <b>Possible Values: </b><br>
     * <code>true</code> <br>
     * SPL code defined by host. <code>false</code> <br>
     * SPL is not host defined, code is an IATA standard.
     * <p>
     * 
     * @param pHostIndicator the new value of the <code>hostDefinedCodeIndicator</code> property.
     */
    public void setHostIndicator(final boolean pHostIndicator) {
        this.hostIndicator = pHostIndicator;
    }

    /**
     * Sets the value of <code>oId</code> property.
     * <p>
     * 
     * @param pOid the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOid) {
        this.oId = pOid;
    }

    /**
     * Sets the value of <code>otherChargeCode</code> property.
     * <p>
     * Miscellaneous charge code. This is automatically included in the AWB along with the SPL code. The other
     * charge code should be validated against the other charge code table.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets
     * <p>
     * <b>Example: </b><br>
     * AA
     * <p>
     * 
     * @param pOtherChargeCode the new value of the <code>otherChargeCode</code> property.
     */
    public void setOtherChargeCode(final String pOtherChargeCode) {
        this.otherChargeCode = ContractUtility.convertToUpperCase(pOtherChargeCode);
    }

    /**
     * Sets the <code>queueReasonCode</code> property.
     * <p>
     * Alternate booking queue reason code. The queue reason code should be validated against the queue reason
     * code table. When entered this queue is used instead of the Force bookings queue.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets
     * <p>
     * <b>Example: </b><br>
     * BA
     * <p>
     * 
     * @param pQueueReasonCode the new value of the <code>queueReasonCode</code> property.
     */
    public void setQueueReasonCode(final String pQueueReasonCode) {
        this.queueReasonCode = ContractUtility.convertToUpperCase(pQueueReasonCode);
    }

    /**
     * Sets the <code>rateClassCode</code> property.
     * <p>
     * Rate class ID. Specifies the rate class ID that can be used with this SPL to rate the air waybill.
     * <p>
     * <b>Format: </b><br>
     * 1-6 Alphabets
     * <p>
     * <b>Example: </b><br>
     * HUM
     * <p>
     * 
     * @param pRateClassCode the new value of the <code>rateClassCode</code> property.
     */
    public void setRateClassCode(final String pRateClassCode) {
        this.rateClassCode = ContractUtility.convertToUpperCase(pRateClassCode);
    }

    /**
     * Sets the <code>sortingPriority</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pSortingPriority the new value of the <code>sortingPriority</code> property.
     */
    public void setSortingPriority(final int pSortingPriority) {
        this.sortingPriority = pSortingPriority;
    }

    /**
     * Sets the <code>specialHandlingCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @param pSpecialHandlingCode the new value of the <code>specialHandlingCode</code> property.
     */
    public void setSpecialHandlingCode(final String pSpecialHandlingCode) {
        this.specialHandlingCode = ContractUtility.convertToUpperCase(pSpecialHandlingCode);
    }

    /**
     * Sets the <code>substituteIataCode</code> property.
     * <p>
     * Substitute SPL code for SPL code on out bound CGOIMP messages. When entered must be an existing IATA
     * defined code and not a host defined SPL code.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @param pSubstituteIataCode the new value of the <code>substituteIataCode</code> property.
     */
    public void setSubstituteIataCode(final String pSubstituteIataCode) {
        this.substituteIataCode = ContractUtility.convertToUpperCase(pSubstituteIataCode);
    }
    
    /**
     * Gets the <code>restrictedonAircraft</code> property.
     * <p>
     * Indicates whether the SPL is restricted <br>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li><code>true</code> <br>
     * SPL code is restricted.
     * <li><code>false</code> <br>
     * SPL is not host defined, code is an IATA standard.
     * </ul>
     * <p>
     * 
     * @return the current value of the <code>heavyIndicator</code> property.
     */
    public boolean getRestrictedonAircraft() {
        return this.restrictedonAircraft;
    }
    
    /**
     * Sets the <code>restrictedonAircraft</code> property.
     * <p>
     * Set the restricted SPL code<br>
     * <b>Possible Values: </b><br>
     * <code>true</code> <br>
     * SPL code defined by host. <code>false</code> <br>
     * SPL is not host defined, code is an IATA standard.
     * <p>
     * 
     * @param pRestrictedonAircraft the new value of the <code>restrictedonAircraft</code> property.
     */
    public void setRestrictedonAircraft(final boolean pRestrictedonAircraft) {
        this.restrictedonAircraft = pRestrictedonAircraft;
    }
    /**
     * Gets the <code>oldSpecialHandlingCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @return the current value of the <code>oldSpecialHandlingCode</code> property.
     */
    public String getOldSpecialHandlingCode() {
        return this.oldSpecialHandlingCode;
    }

    /**
     * Sets the <code>oldSpecialHandlingCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @param pOldSpecialHandlingCode the new value of the <code>oldSpecialHandlingCode</code> property.
     */
    public void setOldSpecialHandlingCode(String pOldSpecialHandlingCode) {
        this.oldSpecialHandlingCode = ContractUtility.convertToUpperCase(pOldSpecialHandlingCode);
    }
}
