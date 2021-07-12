package com.unisys.trans.logistics.lms.parts.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class ParticipantHistoryAdditionalDto extends PersistenceObjectDto {
    public String getShipmentLink() {
        return shipmentLink;
    }

    public String getVoucher() {
        return voucher;
    }

    /**
     * 
     */
    private static final long serialVersionUID = 1014215197059381389L;

    /**
     * Attribute to hold <code>oId</code> property. Unique key reference for participant entity.
     */
    private Long oId;
    /**
     * Attribute to hold <code>regionCode</code> property. The region code of the participant. Only users with
     * special privilege can update this field.
     */
    private String regionCode;
    /**
     * Attribute to hold <code>districtCode</code> property. Only users with special privilege can update this
     * field.
     */
    private String districtCode;
    /**
     * Attribute to hold <code>subDistrictCode</code> property. Only users with special privilege can update
     * this field.
     */
    private String subDistrictCode;
    /**
     * Attribute to hold <code>bondedPremises</code> property.
     */
    private List<BondedPremiseDto> bondedPremises = new ArrayList<BondedPremiseDto>();
    /**
     * Attribute to hold <code>creditInformations</code> property.
     */
    private List<CreditInformationDto> creditInformations = new ArrayList<CreditInformationDto>();
    /**
     * Attribute to hold <code>agentCustomsCode</code> property.
     */
    private String agentCustomsCode;
    /**
     * Attribute to hold <code>customsCode</code> property.
     */
    private String customsCode;
    /**
     * Attribute to hold <code>govtBillLadingIndicator</code> property.
     */
    private Boolean govtBillLadingIndicator;
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
     * Attribute to hold <code>awbPriority</code> property. It is the Priority associated with the Air Way
     * Bill when the participant is a Shipper, Consignee, or Agent.
     */
    private String awbPriority;
    
    /* Attribute to hold <code>customerSegmentation</code> property. To prioritize bookings on the Queue Information function.
    */
   private String customerSegmentation;
   /**
    * Attribute to hold <code>lastCanadianShipmentDate1</code> property. It contains  last date from the initial shipment date.
    */
   private Date lastCanadianShipmentDate1;
   /**
    * Attribute to hold <code>lastCanadianShipmentDate2</code> property. It contains  last date from the initial shipment date.
    */
   private Date lastCanadianShipmentDate2;
   /**
    * Attribute to hold <code>lastCanadianShipmentDate3</code> property. It contains  last date from the initial shipment date.
    */
   private Date lastCanadianShipmentDate3;
   /**
    * Attribute to hold <code>establishedDate</code> property. It contains  last date from the initial shipment date.
    */
   private Date establishedDate;
   /**
    * Attribute to hold <code>initialShipmentDate</code> property. It contains  last date from the initial shipment date.
    */
   
   private Date initialShipmentDate;
   /**
    * Attribute to hold <code>lastShipmentDate</code> property. It contains  last date from the initial shipment date.
    */
   private UserAuditDto userAuditDto;
   
   private Date lastShipmentDate;
   
   
   private String shipperShipmentLink;
   
   private String consigneeShipmentLink;
   
   public Date getDateEstablished() {
    return dateEstablished;
}

private int totalHouseAWB;
   
   
   private int totalShipments;

private Date dateEstablished;

private String shipmentLink;

private String voucher;
   
    /**
 * @return the establishedDate
 */
public Date getEstablishedDate() {
    return this.establishedDate;
}

/**
 * @param pEstablishedDate the establishedDate to set
 */
public void setEstablishedDate(Date pEstablishedDate) {
    this.establishedDate = pEstablishedDate;
}

/**
 * @return the initialShipmentDate
 */
public Date getInitialShipmentDate() {
    return this.initialShipmentDate;
}

/**
 * @param pInitialShipmentDate the initialShipmentDate to set
 */
public void setInitialShipmentDate(Date pInitialShipmentDate) {
    this.initialShipmentDate = pInitialShipmentDate;
}

/**
 * @return the lastShipmentDate
 */
public Date getLastShipmentDate() {
    return this.lastShipmentDate;
}

/**
 * @param pLastShipmentDate the lastShipmentDate to set
 */
public void setLastShipmentDate(Date pLastShipmentDate) {
    this.lastShipmentDate = pLastShipmentDate;
}

/**
 * @return the totalHouseAWB
 */
public int getTotalHouseAWB() {
    return this.totalHouseAWB;
}

/**
 * @param pTotalHouseAWB the totalHouseAWB to set
 */
public void setTotalHouseAWB(int pTotalHouseAWB) {
    this.totalHouseAWB = pTotalHouseAWB;
}

/**
 * @return the totalShipments
 */
public int getTotalShipments() {
    return this.totalShipments;
}

/**
 * @param pTotalShipments the totalShipments to set
 */
public void setTotalShipments(int pTotalShipments) {
    this.totalShipments = pTotalShipments;
}

    /**
 * @return the lastCanadianShipmentDate1
 */
public Date getLastCanadianShipmentDate1() {
    return this.lastCanadianShipmentDate1;
}

/**
 * @param pLastCanadianShipmentDate1 the lastCanadianShipmentDate1 to set
 */
public void setLastCanadianShipmentDate1(Date pLastCanadianShipmentDate1) {
    this.lastCanadianShipmentDate1 = pLastCanadianShipmentDate1;
}

/**
 * @return the lastCanadianShipmentDate2
 */
public Date getLastCanadianShipmentDate2() {
    return this.lastCanadianShipmentDate2;
}

/**
 * @param pLastCanadianShipmentDate2 the lastCanadianShipmentDate2 to set
 */
public void setLastCanadianShipmentDate2(Date pLastCanadianShipmentDate2) {
    this.lastCanadianShipmentDate2 = pLastCanadianShipmentDate2;
}

/**
 * @return the lastCanadianShipmentDate3
 */
public Date getLastCanadianShipmentDate3() {
    return this.lastCanadianShipmentDate3;
}

/**
 * @param pLastCanadianShipmentDate3 the lastCanadianShipmentDate3 to set
 */
public void setLastCanadianShipmentDate3(Date pLastCanadianShipmentDate3) {
    this.lastCanadianShipmentDate3 = pLastCanadianShipmentDate3;
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
     * Gets the credit information data transfer object.
     * <p>
     * 
     * @return the current value of credit information data transfer objects.<br>
     */

    public List<CreditInformationDto> getCreditInformations() {
        return this.creditInformations;
    }
    /**
     * Sets the credit information data transfer object.
     * <p>
     * 
     * @param pCreditInformationDtos the new value of credit information data transfer object<br>
     */

    public void setCreditInformations(final List<CreditInformationDto> pCreditInformationDtos) {
        this.creditInformations = pCreditInformationDtos;
    }

    /**
     * Gets the Bonded premises data transfer object.
     * <p>
     * 
     * @return the current value of bonded premises data transfer object.<br>
     */

    public List<BondedPremiseDto> getBondedPremises() {
        return this.bondedPremises;
    }
    /**
     * Sets the bonded premises data transfer object.
     * <p>
     * 
     * @param pBondedPremiseDtos the new value of bonded premises data transfer object<br>
     */

    public void setBondedPremises(final List<BondedPremiseDto> pBondedPremiseDtos) {
        this.bondedPremises = pBondedPremiseDtos;
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
     * @return the oId
     */
    public Long getoId() {
        return this.oId;
    }

    /**
     * @param pOId the oId to set
     */
    public void setoId(Long pOId) {
        this.oId = pOId;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @return the userAuditDto
     */
    public UserAuditDto getUserAuditDto() {
        return userAuditDto;
    }

    /**
     * @param userAuditDto the userAuditDto to set
     */
    public void setUserAuditDto(UserAuditDto userAuditDto) {
        this.userAuditDto = userAuditDto;
    }

    public void setDateEstablished(Date date) {
      this.dateEstablished=date;
    }

    public void setShipmentLink(String shipmentLink) {
    this.shipmentLink=shipmentLink;
    }

    public void setVoucher(String voucher) {
        this.voucher=voucher;
    }

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
    
    
 

       

}
