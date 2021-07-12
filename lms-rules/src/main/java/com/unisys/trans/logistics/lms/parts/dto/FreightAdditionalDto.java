/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;
import java.util.Date;

/**
 * <code>FreightAdditionalDto</code> contains the freight additional information details.
 * <p>
 * This contains the following attributes: <code>
 * <ul>
 * <li>establishedDate
 * <li>initialShipmentDate
 * <li>regionCode
 * <li>districtCode
 * <li>subDistrictCode
 * <li>agentCustomsCode
 * <li>customsCode
 * <li>manualAuditIndicator
 * <li>govtBillLadingIndicator
 * <li>messageProfileName
 * <li>awbPriority
 * <li>vatNumber
 * </ul>
 * </code>
 */
public class FreightAdditionalDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -973023913991077695L;

    /**
     * Attribute to hold <code>agentCustomsCode</code> property.
     */
    private String agentCustomsCode;

    /**
     * Attribute to hold <code>awbPriority</code> property. It is the Priority associated with the Air Way
     * Bill when the participant is a Shipper, Consignee, or Agent.
     */
    private String awbPriority;

    /**
     * Attribute to hold <code>customsCode</code> property.
     */
    private String customsCode;

    /**
     * Attribute to hold <code>districtCode</code> property. Only users with special privilege can update this
     * field.
     */
    private String districtCode;

    /**
     * Attribute to hold <code>establishedDate</code> property. Holds the date when the participant was
     * established in the system.
     */
    private Date establishedDate;

    /**
     * Attribute to hold <code>govtBillLadingIndicator</code> property.
     */
    private Boolean govtBillLadingIndicator;

    /**
     * Attribute to hold <code>initialShipmentDate</code> property. It is generated when the participant was
     * first associated with a shipment.
     */
    private Date initialShipmentDate;

    /**
     * Attribute to hold <code>manualAuditIndicator</code> property. The shipments associated with this
     * participant as Shipper or Consignee is manually audited if the Manual Audit indicator is true.<br>
     * Default is based on system parameter (C$MAUD - in LMS).
     */
    private Boolean manualAuditIndicator;

    /**
     * Attribute to hold <code>messageProfileName</code> property. This is a link to the Message Sender record
     * is required for the system to send automatic Freight Status Update (FSU) messages or emails to the
     * participant.
     */
    private String messageProfileName;

    /**
     * Attribute to hold <code>regionCode</code> property. The region code of the participant. Only users with
     * special privilege can update this field.
     */
    private String regionCode;

    /**
     * Attribute to hold <code>subDistrictCode</code> property. Only users with special privilege can update
     * this field.
     */
    private String subDistrictCode;

    /**
     * Attribute to hold <code>vatNumber</code> property.
     */
    private String vatNumber;
    /**
     * Attribute to hold <code>customerSegmentation</code> property. To prioritize bookings on the Queue Information function.
     */
    private String customerSegmentation;
    
    private Date lastCanadianShipmentDate1;
    
    private Date lastCanadianShipmentDate2;
    
    private Date lastCanadianShipmentDate3;
    
  
    private String shipmentLink;
    
    private String shipperShipmentLink;
    
    private String consigneeShipmentLink;
    
    public String getShipperShipmentLink() {
        return shipperShipmentLink;
    }

    public void setShipperShipmentLink(String shipperShipmentLink) {
        this.shipperShipmentLink = shipperShipmentLink;
    }

    public String getConsigneeShipmentLink() {
        return consigneeShipmentLink;
    }

    public void setConsigneeShipmentLink(String consigneeShipmentLink) {
        this.consigneeShipmentLink = consigneeShipmentLink;
    }
    private String voucher;

    public Date getLastCanadianShipmentDate1() {
        return lastCanadianShipmentDate1;
    }

    public void setLastCanadianShipmentDate1(Date lastCanadianShipmentDate1) {
        this.lastCanadianShipmentDate1 = lastCanadianShipmentDate1;
    }

    public Date getLastCanadianShipmentDate2() {
        return lastCanadianShipmentDate2;
    }

    public void setLastCanadianShipmentDate2(Date lastCanadianShipmentDate2) {
        this.lastCanadianShipmentDate2 = lastCanadianShipmentDate2;
    }

    public Date getLastCanadianShipmentDate3() {
        return lastCanadianShipmentDate3;
    }

    public void setLastCanadianShipmentDate3(Date lastCanadianShipmentDate3) {
        this.lastCanadianShipmentDate3 = lastCanadianShipmentDate3;
    }

  

    public String getShipmentLink() {
        return shipmentLink;
    }

    public void setShipmentLink(String shipmentLink) {
        this.shipmentLink = shipmentLink;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * <code>Default constructor.</code>
     */
    public FreightAdditionalDto() {

    }

    /**
     * Gets the <code>agentCustomsCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 1122334
     * <p>
     * 
     * @return the current value of <code>agentCustomsCode</code> property.<br>
     */
    public String getAgentCustomsCode() {
        return this.agentCustomsCode;
    }

    /**
     * Gets the <code>awbPriority</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Numeric
     * <p>
     * <b>Example: </b><br>
     * 2
     * <p>
     * 
     * @return the current value of <code>awbPriority</code> property.<br>
     */
    public String getAwbPriority() {
        return this.awbPriority;
    }

    /**
     * Gets the <code>customsCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * ABC12345678
     * <p>
     * 
     * @return the current value of <code>customsCode</code> property.<br>
     */
    public String getCustomsCode() {
        return this.customsCode;
    }

    /**
     * Gets the <code>districtCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * TEX
     * <p>
     * 
     * @return the current value of <code>districtCode</code> property.<br>
     */
    public String getDistrictCode() {
        return this.districtCode;
    }

    /**
     * Gets the <code>establishedDate</code> property.
     * <p>
     * Date when the participant was established in the system.
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 07MAR07
     * <p>
     * 
     * @return the current value of <code>establishedDate</code> property.<br>
     */
    public Date getEstablishedDate() {
        return ContractUtility.getClonedDate(this.establishedDate);
    }

    /**
     * Gets the <code>govtBillLadingIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * Participant is valid Government Bill of Lading Participant.<br>
     * <li><code>false</code><br>
     * Participant is not a valid Government Bill of Lading Participant.<br>
     * <p>
     * 
     * @return the current value of <code>govtBillLadingIndicator</code> property.<br>
     */
    public Boolean getGovtBillLadingIndicator() {
        return this.govtBillLadingIndicator;
    }

    /**
     * Gets the <code>initialShipmentDate</code> property.
     * <p>
     * It is generated when the participant first was associated with a shipment.
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <br>
     * <p>
     * <b>Example: </b><br>
     * 07MAR07
     * <p>
     * 
     * @return the current value of <code>initialShipmentDate</code> property.<br>
     */
    public Date getInitialShipmentDate() {
        return ContractUtility.getClonedDate(this.initialShipmentDate);
    }

    /**
     * Gets the <code>manualAuditIndicator</code> property.
     * <p>
     * The shipments associated with this participant as Shipper or Consignee is manually audited if the
     * Manual Audit indicator is checked.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The shipments associated with this participant as shipper or consignee is manually audited .
     * <li><code>false</code><br>
     * The shipments associated with this participant as shipper or consignee is not manually audited .<br>
     * <p>
     * 
     * @return the current value of <code>manualAuditIndicator</code> property.<br>
     */
    public Boolean getManualAuditIndicator() {
        return this.manualAuditIndicator;
    }

    /**
     * Gets the <code>messageProfileName</code> property.
     * <p>
     * A link to the Message Sender record is required for the system to send automatic Freight Status Update
     * (FSU) messages or emails to the participant.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * MSPRCUW
     * <p>
     * 
     * @return the current value of <code>messageProfileName</code> property.<br>
     */
    public String getMessageProfileName() {
        return this.messageProfileName;
    }

    /**
     * Gets the <code>regionCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * TES
     * <p>
     * 
     * @return the current value of <code>regionCode</code> property.<br>
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * Gets the <code>subDistrictCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * POB
     * <p>
     * 
     * @return the current value of <code>subDistrictCode</code> property.<br>
     */
    public String getSubDistrictCode() {
        return this.subDistrictCode;
    }

    /**
     * Gets the <code>vatNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * VATIDENT123
     * <p>
     * 
     * @return the current value of <code>vatNumber</code> property.<br>
     */
    public String getVatNumber() {
        return this.vatNumber;
    }
    /**
     * Gets the <code>customerSegmentation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * V
     * <p>
     * 
     * @return the current value of <code>customerSegmentation</code> property.<br>
     */
    public String getCustomerSegmentation() {
        return this.customerSegmentation;
    }

    /**
     * Sets the <code>agentCustomsCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alphanumeric <br>
     * <p>
     * <b>Example: </b><br>
     * 1122334
     * <p>
     * 
     * @param pAgentCustomsCode the new value of <code>agentCustomsCode</code> property.<br>
     */
    public void setAgentCustomsCode(final String pAgentCustomsCode) {
        this.agentCustomsCode = pAgentCustomsCode;
    }

    /**
     * Sets the <code>awbPriority</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 2
     * <p>
     * 
     * @param pAwbPriority the new value of <code>awbPriority</code> property.<br>
     */
    public void setAwbPriority(final String pAwbPriority) {
        this.awbPriority = pAwbPriority;
    }

    /**
     * Sets the <code>customsCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * ABC12345678
     * <p>
     * 
     * @param pCustomsCode the new value of <code>customsCode</code> property.<br>
     */
    public void setCustomsCode(final String pCustomsCode) {
        this.customsCode = pCustomsCode;
    }

    /**
     * Sets the <code>districtCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * TEX
     * <p>
     * 
     * @param pDistrictCode the new value of <code>districtCode</code> property.<br>
     */
    public void setDistrictCode(final String pDistrictCode) {
        this.districtCode = ContractUtility.convertToUpperCase(pDistrictCode);
    }

    /**
     * Sets the <code>establishedDate</code> property.
     * <p>
     * Date when the participant was established in the system.
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}<br>
     * <p>
     * <b>Example: </b><br>
     * 07MAR07
     * <p>
     * 
     * @param pEstablishedDate the new value of <code>establishedDate</code> property.<br>
     */
    public void setEstablishedDate(final Date pEstablishedDate) {
        this.establishedDate = ContractUtility.getClonedDate(pEstablishedDate);
    }

    /**
     * Sets the <code>govtBillLadingIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * Participant is valid Government Bill of Lading Participant.
     * <li><code>false</code><br>
     * Participant is not a valid Government Bill of Lading Participant.<br>
     * <p>
     * 
     * @param pGovtBillLadingIndicator the new value of <code>govtBillLadingIndicator</code> property.<bR>
     */
    public void setGovtBillLadingIndicator(final Boolean pGovtBillLadingIndicator) {
        this.govtBillLadingIndicator = pGovtBillLadingIndicator;
    }

    /**
     * Sets the <code>initialShipmentDate</code> property.
     * <p>
     * It is generated when the participant first was associated with a shipment.
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}<br>
     * <p>
     * <b>Example: </b><br>
     * 07MAR07
     * <p>
     * 
     * @param pInitialShipmentDate the new value of <code>initialShipmentDate</code> property.
     */
    public void setInitialShipmentDate(final Date pInitialShipmentDate) {
        this.initialShipmentDate = ContractUtility.getClonedDate(pInitialShipmentDate);
    }

    /**
     * Sets the <code>manualAuditIndicator</code> property.
     * <p>
     * The shipments associated with this participant as Shipper or Consignee is manually audited if the
     * Manual Audit indicator is checked.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The shipments associated with this participant as shipper or consignee is manually audited .
     * <li><code>false</code><br>
     * The shipments associated with this participant as shipper or consignee is not manually audited .
     * <p>
     * 
     * @param pManualAuditIndicator the new value of <code>manualAuditIndicator</code> property.
     */
    public void setManualAuditIndicator(final Boolean pManualAuditIndicator) {
        this.manualAuditIndicator = pManualAuditIndicator;
    }

    /**
     * Sets the <code>messageProfileName</code> property.
     * <p>
     * A link to the Message Sender record is required for the system to send automatic Freight Status Update
     * (FSU) messages or emails to the participant.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * MSPRCUW
     * <p>
     * 
     * @param pMessageProfileName the new value of <code>messageProfileName</code> property.
     */
    public void setMessageProfileName(final String pMessageProfileName) {
        this.messageProfileName = pMessageProfileName;
    }

    /**
     * Sets the <code>regionCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * TEX
     * <p>
     * 
     * @param pRegionCode the new value of <code>regionCode</code> property.
     */
    public void setRegionCode(final String pRegionCode) {
        this.regionCode = ContractUtility.convertToUpperCase(pRegionCode);
    }

    /**
     * Sets the <code>subDistrictCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * QUE
     * <p>
     * 
     * @param pSubDistrictCode the new value of <code>subDistrictCode</code> property.
     */
    public void setSubDistrictCode(final String pSubDistrictCode) {
        this.subDistrictCode = ContractUtility.convertToUpperCase(pSubDistrictCode);
    }

    /**
     * Sets the <code>vatNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <p>
     * <b>Example: </b><br>
     * VATIDENT123
     * <p>
     * 
     * @param pVatNumber the new value of <code>vatNumber</code> property.
     */
    public void setVatNumber(final String pVatNumber) {
        this.vatNumber = pVatNumber;
    }
    /**
     * Sets the <code>customerSegmentation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * V
     * <p>
     * 
     * @param pCustomerSegmentation the new value of <code>customerSegmentation</code> property.
     */
    public void setCustomerSegmentation(final String pCustomerSegmentation) {
        this.customerSegmentation = pCustomerSegmentation;
    }
}
