/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AuditStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ExclusionReasonType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ExportPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.FWBType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ImportPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InternationalAWBType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PadType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ShipmentStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.SpecialPurgeType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.GeographicDataDto;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;

/**
 * <code>AirWaybillDetailDto</code> class contain information specific to an AirWaybillDetails.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>accountingRemarks
 * <li>cODamount
 * <li>cODCurrency
 * <li>cODExchangeRate
 * <li>consigneeRemarks1
 * <li>consigneeRemarks2
 * <li>contractSRAAppliesIndicator
 * <li>crossReference1
 * <li>crossReference2
 * <li>customsValue
 * <li>declaredValue
 * <li>deliveryDate
 * <li>destinationCarrier
 * <li>destinationCurrency
 * <li>destinationStation
 * <li>discrepancies
 * <li>eAWBIndicator
 * <li>exchangeRate
 * <li>executionDate
 * <li>oId
 * <li>exportAuditType
 * <li>exportPaycode
 * <li>exportReportingDate
 * <li>exportReportingStation
 * <li>forceToAccAcceptGoods
 * <li>forceToAccExclusionReason
 * <li>forceToAccMovementDate
 * <li>forceToAccMovementStation
 * <li>fWBType
 * <li>importAudit
 * <li>importPaycode
 * <li>importReportingDate
 * <li>importReportingStation
 * <li>insuranceCode
 * <li>insuranceValue
 * <li>internationalAWB
 * <li>northAmericanIndicator
 * <li>originCurrency
 * <li>originStation
 * <li>padType
 * <li>paperAWBOverrideInd
 * <li>priority
 * <li>productCode
 * <li>shipperRemarks
 * <li>specialPurge
 * <li>status
 * <li>surfaceDestinationStation
 * <li>surfaceOriginStation
 * <li>taxIndicator
 * <li>unitOfWeight
 * <li>pricingDate
 * </code>
 * </ul>
 */
public class AccountingAirWaybillDetailDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3411792720226850198L;

    /**
     * Attribute to hold <code>accountingRemarks</code> property.
     */
    private String accountingRemarks;

    /**
     * Attribute to hold <code>cODamount</code> property.
     */
    private BigDecimal cODamount;

    /**
     * Attribute to hold <code>cODCurrency</code> property.
     */
    private String cODCurrency;

    /**
     * Attribute to hold <code>cODExchangeRate</code> property.
     */
    private BigDecimal cODExchangeRate;

    /**
     * Attribute to hold <code>consigneeRemarks1</code> property.
     */
    private String consigneeRemarks1;

    /**
     * Attribute to hold <code>consigneeRemarks2</code> property.
     */
    private String consigneeRemarks2;

    /**
     * Attribute to hold <code>contractSRAAppliesIndicator</code> property.
     */
    private boolean contractSRAAppliesIndicator;

    /**
     * Attribute to hold <code>crossReference1</code> property.
     */
    private String crossReference1;

    /**
     * Attribute to hold <code>crossReference2</code> property.
     */
    private String crossReference2;

    /**
     * Attribute to hold <code>crossReference1indicator</code> property.
     */
    private String crossReference1Type;

    /**
     * Attribute to hold <code>crossReference2indicator</code> property.
     */
    private String crossReference2Type;

    /**
     * Attribute to hold <code>customsValue</code> property.
     */
    private String customsValue;

    /**
     * Attribute to hold <code>declaredValue</code> property.
     */
    private String declaredValue;

    /**
     * Attribute to hold <code>deliveryDate</code> property.
     */
    private Date deliveryDate;

    /**
     * Attribute to hold <code>destinationCarrier</code> property.
     */
    private String destinationCarrier;

    /**
     * Attribute to hold <code>originCurrency</code> property.
     */
    private String destinationCurrency;

    /**
     * Attribute to hold <code>destinationStation</code> property.
     */
    private String destinationStation;

    /**
     * Attribute to hold <code>discrepancies</code> property.
     */
    private String discrepancies;

    /**
     * Attribute to hold <code>eAWBIndicator</code> property.
     */
    private Boolean eAWBIndicator;

    /**
     * Attribute to hold <code>exchangeRate</code> property.
     */
    private BigDecimal exchangeRate;

    /**
     * Attribute to hold <code>executionDate</code> property.
     */
    private Date executionDate;

    /**
     * Attribute to hold <code>exportAuditType</code> property.
     */
    private AuditStatusType exportAuditType;

    /**
     * Attribute to hold <code>exportPaycode</code> property.
     */
    private ExportPaymentType exportPaycode;

    /**
     * Attribute to hold <code>exportReportingDate</code> property.
     */
    private Date exportReportingDate;

    /**
     * Attribute to hold <code>exportReportingStation</code> property.
     */
    private String exportReportingStation;

    /**
     * Attribute to hold <code>forceToAccAcceptGoods</code> property.
     */
    private String forceToAccAcceptGoods;

    /**
     * Attribute to hold <code>forceToAccExclusionReason</code> property.
     */
    private ExclusionReasonType forceToAccExclusionReason;

    /**
     * Attribute to hold <code>forceToAccMovementDate</code> property.
     */
    private Date forceToAccMovementDate;

    /**
     * Attribute to hold <code>forceToAccMovementStation</code> property.
     */
    private String forceToAccMovementStation;

    /**
     * Attribute to hold <code>fWBIndicator</code> property.
     */
    private FWBType fWBType;

    /**
     * Attribute to hold <code>importAudit</code> property.
     */
    private AuditStatusType importAudit;

    /**
     * Attribute to hold <code>importPaycode</code> property.
     */
    private ImportPaymentType importPaycode;

    /**
     * Attribute to hold <code>importReportingDate</code> property.
     */
    private Date importReportingDate;

    /**
     * Attribute to hold <code>importReportingStation</code> property.
     */
    private String importReportingStation;

    /**
     * Attribute to hold <code>insuranceCode</code> property.
     */
    private String insuranceCode;

    /**
     * Attribute to hold <code>insuranceValue</code> property.
     */
    private String insuranceValue;

    /**
     * Attribute to hold <code>internationalAWB</code> property.
     */
    private InternationalAWBType internationalAWB;

    /**
     * Attribute to hold <code>northAmericanIndicator</code> property.
     */
    private boolean northAmericanIndicator;

    /**
     * Attribute to hold <code>notifyDate</code> property.
     */
    private Date notifyDate;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>originCurrency</code> property.
     */
    private String originCurrency;

    /**
     * Attribute to hold <code>originStation</code> property.
     */
    private String originStation;

    /**
     * Attribute to hold <code>padType</code> property.
     */
    private String padType;

    /**
     * Attribute to hold <code>paperAWBOverrideInd</code> property.
     */
    private boolean paperAWBOverrideInd;

    /**
     * Attribute to hold <code>priority</code> property.
     */
    private Integer priority;

    /**
     * Attribute to hold <code>productCode</code> property.
     */
    private String productCode;

    /**
     * Attribute to hold <code>shipperRemarks</code> property.
     */
    private String shipperRemarks;

    /**
     * Attribute to hold <code>specialPurge</code> property.
     */
    private SpecialPurgeType specialPurge;

    /**
     * Attribute to hold <code>specialHandlingCodes</code> property.
     */

    /**
     * Attribute to hold <code>status</code> property.
     */
    private ShipmentStatusType status;

    /**
     * Attribute to hold <code>surfaceDestinationStation</code> property.
     */
    private String surfaceDestinationStation;

    /**
     * Attribute to hold <code>surfaceOriginStation</code> property.
     */
    private String surfaceOriginStation;

    /**
     * Attribute to hold <code>taxIndicator</code> property.
     */
    private Boolean taxIndicator;

    /**
     * Attribute to hold <code>unitOfWeight</code> property.
     */
    private WeightUOMType unitOfWeight;

    /**
     * Attribute to hold <code>pricingDate</code> property.
     */

    private Date pricingDate;

    /**
     * Attribute to hold <code>originStationGeoraphicData</code> property.
     */
    private GeographicDataDto originStationGeoraphicData;

    /**
     * Attribute to hold <code>destinationStationGeoraphicData</code> property.
     */
    private GeographicDataDto destinationStationGeoraphicData;

    /**
     * Attribute to hold <code>movementStationGeoraphicData</code> property.
     */
    private GeographicDataDto movementStationGeoraphicData;

    /**
     * Attribute to hold <code>acceptGoodsGeoraphicData</code> property.
     */
    private GeographicDataDto acceptGoodsGeoraphicData;

    /**
     * Attribute to hold <code>surfaceDestinationGeoraphicData</code> property.
     */
    private GeographicDataDto surfaceDestinationGeoraphicData;

    /**
     * Attribute to hold <code>surfaceOriginGeoraphicData</code> property.
     */
    private GeographicDataDto surfaceOriginGeoraphicData;

    /**
     * Attribute to hold <code>exportReportingGeoraphicData</code> property.
     */
    private GeographicDataDto exportReportingGeoraphicData;

    /**
     * Attribute to hold <code>importReportingGeophicData</code> property.
     */
    private GeographicDataDto importReportingGeophicData;

    /**
     * Attribute to hold <code>forceAccountingGeophicData</code> property.
     */
    private GeographicDataDto forceAccountingGeophicData;

    /**
     * Attribute to hold <code>customStation</code> property.
     */
    private String customStation;
    
    private Date ccaDate;
    
    /**
   	 * Attribute to hold <code>supplierGstinOriginStn</code> property.
   	 */
   	private String supplierGstinOriginStn;
   	
   	/**
   	 * Attribute to hold <code>supplierGstinDestnStn</code> property.
   	 */
   	private String supplierGstinDestnStn;
   	
   
    


    /**
     * Gets the <code>accountingRemarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>accountingRemarks</code> property.
     */
    public String getAccountingRemarks() {
        return this.accountingRemarks;
    }

    /**
     * Gets the <code>cODamount</code> property.
     * <p>
     * 
     * @return the current value of the <code>cODamount</code> property.
     */
    public BigDecimal getcODamount() {
        return this.cODamount;
    }

    /**
     * Gets the <code>cODCurrency</code> property.
     * <p>
     * 
     * @return the current value of the <code>cODCurrency</code> property.
     */
    public String getcODCurrency() {
        return this.cODCurrency;
    }

    /**
     * Gets the <code>cODExchangeRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>cODExchangeRate</code> property.
     */
    public BigDecimal getcODExchangeRate() {
        return this.cODExchangeRate;
    }

    /**
     * Gets the <code>consigneeRemarks1</code> property.
     * <p>
     * 
     * @return the current value of the <code>consigneeRemarks1</code> property.
     */
    public String getConsigneeRemarks1() {
        return this.consigneeRemarks1;
    }

    /**
     * Gets the <code>consigneeRemarks2</code> property.
     * <p>
     * 
     * @return the current value of the <code>consigneeRemarks2</code> property.
     */
    public String getConsigneeRemarks2() {
        return this.consigneeRemarks2;
    }

    /**
     * Gets the <code>contractSRAAppliesIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>contractSRAAppliesIndicator</code> property.
     */
    public boolean getContractSRAAppliesIndicator() {
        return this.contractSRAAppliesIndicator;
    }

    /**
     * Gets the <code>crossReference1</code> property.
     * <p>
     * 
     * @return the current value of the <code>crossReference1</code> property.
     */
    public String getCrossReference1() {
        return this.crossReference1;
    }

    /**
     * Gets the <code>crossReference2</code> property.
     * <p>
     * 
     * @return the current value of the <code>crossReference2</code> property.
     */
    public String getCrossReference2() {
        return this.crossReference2;
    }

    /**
     * Gets the <code>customsValue</code> property.
     * <p>
     * 
     * @return the current value of the <code>customsValue</code> property.
     */
    public String getCustomsValue() {
        return this.customsValue;
    }

    /**
     * Gets the <code>declaredValue</code> property.
     * <p>
     * 
     * @return the current value of the <code>declaredValue</code> property.
     */
    public String getDeclaredValue() {
        return this.declaredValue;
    }

    /**
     * Gets the <code>deliveryDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>deliveryDate</code> property.
     */
    public Date getDeliveryDate() {
        return ContractUtility.getClonedDate(this.deliveryDate);
    }

    /**
     * Gets the <code>destinationCarrier</code> property.
     * <p>
     * 
     * @return the current value of the <code>destinationCarrier</code> property.
     */
    public String getDestinationCarrier() {
        return this.destinationCarrier;
    }

    /**
     * Gets the <code>destinationCurrency</code> property.
     * <p>
     * 
     * @return the current value of the <code>destinationCurrency</code> property.
     */
    public String getDestinationCurrency() {
        return this.destinationCurrency;
    }

    /**
     * Gets the <code>destinationStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>destinationStation</code> property.
     */
    public String getDestinationStation() {
        return this.destinationStation;
    }

    /**
     * Gets the <code>discrepancies</code> property.
     * <p>
     * 
     * @return the current value of the <code>discrepancies</code> property.
     */
    public String getDiscrepancies() {
        return this.discrepancies;
    }

    public String getEawbIndicatorText() {
        String eawbIndicatorText = null;
        if (this.eAWBIndicator != null) {
            if (this.eAWBIndicator) {
                eawbIndicatorText = FrameworkConstants.YES_LITERAL;
            }
            else {
                eawbIndicatorText = FrameworkConstants.NO_LITERAL;
            }
        }
        return eawbIndicatorText;
    }

    /**
     * Gets the <code>eAWBIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>eAWBIndicator</code> property.
     */
    public Boolean getEAWBIndicator() {
        return this.eAWBIndicator;
    }

    /**
     * Gets the <code>exchangeRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>exchangeRate</code> property.
     */
    public BigDecimal getExchangeRate() {
        return this.exchangeRate;
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
     * Gets the <code>exportAuditType</code> property.
     * <p>
     * 
     * @return the current value of the <code>exportAuditType</code> property.
     */
    public AuditStatusType getExportAuditType() {
        return this.exportAuditType;
    }

    /**
     * Gets the <code>exportPaycode</code> property.
     * <p>
     * 
     * @return the current value of the <code>exportPaycode</code> property.
     */
    public ExportPaymentType getExportPaycode() {
        return this.exportPaycode;
    }

    /**
     * Gets the <code>exportReportingDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>exportReportingDate</code> property.
     */
    public Date getExportReportingDate() {
        return ContractUtility.getClonedDate(this.exportReportingDate);
    }

    /**
     * Gets the <code>exportReportingStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>exportReportingStation</code> property.
     */
    public String getExportReportingStation() {
        return this.exportReportingStation;
    }

    /**
     * Gets the <code>forceToAccAcceptGoods</code> property.
     * <p>
     * 
     * @return the current value of the <code>forceToAccAcceptGoods</code> property.
     */
    public String getForceToAccAcceptGoods() {
        return this.forceToAccAcceptGoods;
    }

    /**
     * Gets the <code>forceToAccExclusionReason</code> property.
     * <p>
     * 
     * @return the current value of the <code>forceToAccExclusionReason</code> property.
     */
    public ExclusionReasonType getForceToAccExclusionReason() {
        return this.forceToAccExclusionReason;
    }

    /**
     * Gets the <code>forceToAccMovementDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>forceToAccMovementDate</code> property.
     */
    public Date getForceToAccMovementDate() {
        return ContractUtility.getClonedDate(this.forceToAccMovementDate);
    }

    /**
     * Gets the <code>forceToAccMovementStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>forceToAccMovementStation</code> property.
     */
    public String getForceToAccMovementStation() {
        return this.forceToAccMovementStation;
    }

    /**
     * Gets the <code>fWBType</code> property.
     * <p>
     * 
     * @return the current value of the <code>fWBType</code> property.
     */
    public FWBType getfWBType() {
        return this.fWBType;
    }

    /**
     * Gets the <code>importAudit</code> property.
     * <p>
     * 
     * @return the current value of the <code>importAudit</code> property.
     */
    public AuditStatusType getImportAudit() {
        return this.importAudit;
    }

    /**
     * Gets the <code>importPaycode</code> property.
     * <p>
     * 
     * @return the current value of the <code>importPaycode</code> property.
     */
    public ImportPaymentType getImportPaycode() {
        return this.importPaycode;
    }

    /**
     * Gets the <code>importReportingDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>importReportingDate</code> property.
     */
    public Date getImportReportingDate() {
        return ContractUtility.getClonedDate(this.importReportingDate);
    }

    /**
     * Gets the <code>importReportingStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>importReportingStation</code> property.
     */
    public String getImportReportingStation() {
        return this.importReportingStation;
    }

    /**
     * Gets the <code>insuranceCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>insuranceCode</code> property.
     */
    public String getInsuranceCode() {
        return this.insuranceCode;
    }

    /**
     * Gets the <code>insuranceValue</code> property.
     * <p>
     * 
     * @return the current value of the <code>insuranceValue</code> property.
     */
    public String getInsuranceValue() {
        return this.insuranceValue;
    }

    /**
     * Gets the <code>internationalAWB</code> property.
     * <p>
     * 
     * @return the current value of the <code>internationalAWB</code> property.
     */
    public InternationalAWBType getInternationalAWB() {
        return this.internationalAWB;
    }

    /**
     * Gets the <code>northAmericanIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>northAmericanIndicator</code> property.
     */
    public boolean getNorthAmericanIndicator() {
        return this.northAmericanIndicator;
    }

    /**
     * Gets the <code>notifyDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>notifyDate</code> property.
     */
    public Date getNotifyDate() {
        return ContractUtility.getClonedDate(this.notifyDate);
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>SpotRateId</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */

    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>originCurrency</code> property.
     * <p>
     * 
     * @return the current value of the <code>originCurrency</code> property.
     */
    public String getOriginCurrency() {
        return this.originCurrency;
    }

    /**
     * Gets the <code>originStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>originStation</code> property.
     */
    public String getOriginStation() {
        return this.originStation;
    }

    /**
     * Gets the <code>padType</code> property.
     * <p>
     * 
     * @return the current value of the <code>padType</code> property.
     */
    public String getPadType() {
        return this.padType;
    }

    /**
     * Gets the <code>paperAWBOverrideInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>paperAWBOverrideInd</code> property.
     */
    public boolean getPaperAWBOverrideInd() {
        return this.paperAWBOverrideInd;
    }

    /**
     * Gets the <code>priority</code> property.
     * <p>
     * 
     * @return the current value of the <code>priority</code> property.
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Gets the <code>productCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>productCode</code> property.
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * Gets the <code>shipperRemarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>shipperRemarks</code> property.
     */
    public String getShipperRemarks() {
        return this.shipperRemarks;
    }

    /**
     * Gets the <code>specialPurge</code> property.
     * <p>
     * 
     * @return the current value of the <code>specialPurge</code> property.
     */
    public SpecialPurgeType getSpecialPurge() {
        return this.specialPurge;
    }

    /**
     * Gets the <code>status</code> property.
     * <p>
     * 
     * @return the current value of the <code>status</code> property.
     */
    public ShipmentStatusType getStatus() {
        return this.status;
    }

    /**
     * Gets the <code>surfaceDestinationStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>surfaceDestinationStation</code> property.
     */
    public String getSurfaceDestinationStation() {
        return this.surfaceDestinationStation;
    }

    /**
     * Gets the <code>surfaceOriginStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>surfaceOriginStation</code> property.
     */
    public String getSurfaceOriginStation() {
        return this.surfaceOriginStation;
    }

    /**
     * Gets the <code>taxIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>taxIndicator</code> property.
     */
    public Boolean getTaxIndicator() {
        return this.taxIndicator;
    }

    /**
     * Gets the <code>unitOfWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>unitOfWeight</code> property.
     */
    public WeightUOMType getUnitOfWeight() {
        return this.unitOfWeight;
    }

    /**
     * Sets the <code>accountingRemarks</code>.
     * <p>
     * 
     * @param pAccountingRemarks
     *            holds the new value of <code>accountingRemarks</code>
     */
    public void setAccountingRemarks(final String pAccountingRemarks) {
        this.accountingRemarks = ContractUtility.convertToUpperCase(pAccountingRemarks);
    }

    /**
     * Sets the <code>cODamount</code>.
     * <p>
     * 
     * @param pCODamount
     *            holds the new value of <code>cODamount</code>
     */

    public void setcODamount(final BigDecimal pCODamount) {
        this.cODamount = pCODamount;
    }

    /**
     * Sets the <code>cODCurrency</code>.
     * <p>
     * 
     * @param pCODCurrency
     *            holds the new value of <code>cODCurrency</code>
     */
    public void setcODCurrency(final String pCODCurrency) {
        this.cODCurrency = ContractUtility.convertToUpperCase(pCODCurrency);
    }

    /**
     * Sets the <code>cODExchangeRate</code>.
     * <p>
     * 
     * @param pCODExchangeRate
     *            holds the new value of <code>cODExchangeRate</code>
     */
    public void setcODExchangeRate(final BigDecimal pCODExchangeRate) {
        this.cODExchangeRate = pCODExchangeRate;
    }

    /**
     * Sets the <code>consigneeRemarks1</code>.
     * <p>
     * 
     * @param pConsigneeRemarks1
     *            holds the new value of <code>consigneeRemarks1</code>
     */
    public void setConsigneeRemarks1(final String pConsigneeRemarks1) {
        this.consigneeRemarks1 = ContractUtility.convertToUpperCase(pConsigneeRemarks1);
    }

    /**
     * Sets the <code>consigneeRemarks2</code>.
     * <p>
     * 
     * @param pConsigneeRemarks2
     *            holds the new value of <code>consigneeRemarks2</code>
     */
    public void setConsigneeRemarks2(final String pConsigneeRemarks2) {
        this.consigneeRemarks2 = ContractUtility.convertToUpperCase(pConsigneeRemarks2);
    }

    /**
     * Sets the <code>contractSRAAppliesIndicator</code>.
     * <p>
     * 
     * @param pContractSRAAppliesIndicator
     *            holds the new value of <code>contractSRAAppliesIndicator</code>
     */
    public void setContractSRAAppliesIndicator(final boolean pContractSRAAppliesIndicator) {
        this.contractSRAAppliesIndicator = pContractSRAAppliesIndicator;
    }

    /**
     * Sets the <code>crossReference1</code>.
     * <p>
     * 
     * @param pCrossReference1
     *            holds the new value of <code>crossReference1</code>
     */
    public void setCrossReference1(final String pCrossReference1) {
        this.crossReference1 = ContractUtility.convertToUpperCase(pCrossReference1);
    }

    /**
     * Sets the <code>crossReference2</code>.
     * <p>
     * 
     * @param pCrossReference2
     *            holds the new value of <code>crossReference2</code>
     */
    public void setCrossReference2(final String pCrossReference2) {
        this.crossReference2 = ContractUtility.convertToUpperCase(pCrossReference2);
    }

    /**
     * Sets the <code>customsValue</code>.
     * <p>
     * 
     * @param pCustomsValue
     *            holds the new value of <code>customsValue</code>
     */

    public void setCustomsValue(final String pCustomsValue) {
        this.customsValue = ContractUtility.convertToUpperCase(pCustomsValue);
    }

    /**
     * Sets the <code>declaredValue</code>.
     * <p>
     * 
     * @param pDeclaredValue
     *            holds the new value of <code>declaredValue</code>
     */
    public void setDeclaredValue(final String pDeclaredValue) {
        this.declaredValue = ContractUtility.convertToUpperCase(pDeclaredValue);
    }

    /**
     * Sets the <code>deliveryDate</code>.
     * <p>
     * 
     * @param pDeliveryDate
     *            holds the new value of <code>deliveryDate</code>
     */
    public void setDeliveryDate(final Date pDeliveryDate) {
        this.deliveryDate = ContractUtility.getClonedDate(pDeliveryDate);
    }

    /**
     * Sets the <code>destinationCarrier</code>.
     * <p>
     * 
     * @param pDestinationCarrier
     *            holds the new value of <code>destinationCarrier</code>
     */
    public void setDestinationCarrier(final String pDestinationCarrier) {
        this.destinationCarrier = ContractUtility.convertToUpperCase(pDestinationCarrier);
    }

    /**
     * Sets the <code>destinationCurrency</code>.
     * <p>
     * 
     * @param pDestinationCurrency
     *            holds the new value of <code>destinationCurrency</code>
     */
    public void setDestinationCurrency(final String pDestinationCurrency) {
        this.destinationCurrency = ContractUtility.convertToUpperCase(pDestinationCurrency);
    }

    /**
     * Sets the <code>destinationStation</code>.
     * <p>
     * 
     * @param pDestinationStation
     *            holds the new value of <code>destinationStation</code>
     */
    public void setDestinationStation(final String pDestinationStation) {
        this.destinationStation = ContractUtility.convertToUpperCase(pDestinationStation);
    }

    /**
     * Sets the <code>discrepancies</code>.
     * <p>
     * 
     * @param pDiscrepencies
     *            holds the new value of <code>discrepancies</code>
     */
    public void setDiscrepancies(final String pDiscrepancies) {
        this.discrepancies = ContractUtility.convertToUpperCase(pDiscrepancies);
    }

    /**
     * Sets the <code>eAWBIndicator</code>.
     * <p>
     * 
     * @param pEAWBIndicator
     *            holds the new value of <code>eAWBIndicator</code>
     */
    public void setEAWBIndicator(final Boolean pEAWBIndicator) {
        this.eAWBIndicator = pEAWBIndicator;
    }

    /**
     * Sets the <code>exchangeRate</code>.
     * <p>
     * 
     * @param pExchangeRate
     *            holds the new value of <code>exchangeRate</code>
     */
    public void setExchangeRate(final BigDecimal pExchangeRate) {
        this.exchangeRate = pExchangeRate;
    }

    /**
     * Sets the <code>executionDate</code>.
     * <p>
     * 
     * @param pExecutionDate
     *            holds the new value of <code>executionDate</code>
     */
    public void setExecutionDate(final Date pExecutionDate) {
        this.executionDate = ContractUtility.getClonedDate(pExecutionDate);
    }

    /**
     * Sets the <code>exportAuditType</code>.
     * <p>
     * 
     * @param pExportAuditType
     *            holds the new value of <code>exportAuditType</code>
     */
    public void setExportAuditType(final AuditStatusType pExportAuditType) {
        this.exportAuditType = pExportAuditType;
    }

    /**
     * Sets the <code>exportPaycode</code>.
     * <p>
     * 
     * @param pExportPaycode
     *            holds the new value of <code>exportPaycode</code>
     */
    public void setExportPaycode(final ExportPaymentType pExportPaycode) {
        this.exportPaycode = pExportPaycode;
    }

    /**
     * Sets the <code>exportReportingDate</code>.
     * <p>
     * 
     * @param pExportReportingDate
     *            holds the new value of <code>exportReportingDate</code>
     */
    public void setExportReportingDate(final Date pExportReportingDate) {
        this.exportReportingDate = ContractUtility.getClonedDate(pExportReportingDate);
    }

    /**
     * Sets the <code>exportReportingStation</code>.
     * <p>
     * 
     * @param pExportReportingStation
     *            holds the new value of <code>exportReportingStation</code>
     */
    public void setExportReportingStation(final String pExportReportingStation) {
        this.exportReportingStation = ContractUtility.convertToUpperCase(pExportReportingStation);
    }

    /**
     * Sets the <code>forceToAccAcceptGoods</code>.
     * <p>
     * 
     * @param pForceToAccAcceptGoods
     *            holds the new value of <code>forceToAccAcceptGoods</code>
     */
    public void setForceToAccAcceptGoods(final String pForceToAccAcceptGoods) {
        this.forceToAccAcceptGoods = ContractUtility.convertToUpperCase(pForceToAccAcceptGoods);
    }

    /**
     * Sets the <code>forceToAccExclusionReason</code>.
     * <p>
     * 
     * @param pForceToAccExclusionReason
     *            holds the new value of <code>forceToAccExclusionReason</code>
     */
    public void setForceToAccExclusionReason(final ExclusionReasonType pForceToAccExclusionReason) {
        this.forceToAccExclusionReason = pForceToAccExclusionReason;
    }

    /**
     * Sets the <code>forceToAccMovementDate</code>.
     * <p>
     * 
     * @param pForceToAccMovementDate
     *            holds the new value of <code>forceToAccMovementDate</code>
     */
    public void setForceToAccMovementDate(final Date pForceToAccMovementDate) {
        this.forceToAccMovementDate = ContractUtility.getClonedDate(pForceToAccMovementDate);
    }

    /**
     * Sets the <code>forceToAccMovementStation</code>.
     * <p>
     * 
     * @param pForceToAccMovementStation
     *            holds the new value of <code>forceToAccMovementStation</code>
     */
    public void setForceToAccMovementStation(final String pForceToAccMovementStation) {
        this.forceToAccMovementStation = ContractUtility.convertToUpperCase(pForceToAccMovementStation);
    }

    /**
     * Sets the <code>fWBType</code>.
     * <p>
     * 
     * @param pFWBType
     *            holds the new value of <code>fWBType</code>
     */
    public void setfWBType(final FWBType pFWBType) {
        this.fWBType = pFWBType;
    }

    /**
     * Sets the <code>importAudit</code>.
     * <p>
     * 
     * @param pImportAudit
     *            holds the new value of <code>importAudit</code>
     */
    public void setImportAudit(final AuditStatusType pImportAudit) {
        this.importAudit = pImportAudit;
    }

    /**
     * Sets the <code>importPaycode</code>.
     * <p>
     * 
     * @param pImportPaycode
     *            holds the new value of <code>importPaycode</code>
     */
    public void setImportPaycode(final ImportPaymentType pImportPaycode) {
        this.importPaycode = pImportPaycode;
    }

    /**
     * Sets the <code>importReportingDate</code>.
     * <p>
     * 
     * @param pImportReportingDate
     *            holds the new value of <code>importReportingDate</code>
     */
    public void setImportReportingDate(final Date pImportReportingDate) {
        this.importReportingDate = ContractUtility.getClonedDate(pImportReportingDate);
    }

    /**
     * Sets the <code>importReportingStation</code>.
     * <p>
     * 
     * @param pImportReportingStation
     *            holds the new value of <code>importReportingStation</code>
     */
    public void setImportReportingStation(final String pImportReportingStation) {
        this.importReportingStation = ContractUtility.convertToUpperCase(pImportReportingStation);
    }

    /**
     * Sets the <code>insuranceCode</code>.
     * <p>
     * 
     * @param pInsuranceCode
     *            holds the new value of <code>insuranceCode</code>
     */
    public void setInsuranceCode(final String pInsuranceCode) {
        this.insuranceCode = ContractUtility.convertToUpperCase(pInsuranceCode);
    }

    /**
     * Sets the <code>insuranceValue</code>.
     * <p>
     * 
     * @param pInsuranceValue
     *            holds the new value of <code>insuranceValue</code>
     */
    public void setInsuranceValue(final String pInsuranceValue) {
        this.insuranceValue = ContractUtility.convertToUpperCase(pInsuranceValue);
    }

    /**
     * Sets the <code>internationalAWB</code>.
     * <p>
     * 
     * @param pInternationalAWB
     *            holds the new value of <code>internationalAWB</code>
     */
    public void setInternationalAWB(final InternationalAWBType pInternationalAWB) {
        this.internationalAWB = pInternationalAWB;
    }

    /**
     * Sets the <code>northAmericanIndicator</code>.
     * <p>
     * 
     * @param pNorthAmericanIndicator
     *            holds the new value of <code>northAmericanIndicator</code>
     */
    public void setNorthAmericanIndicator(final boolean pNorthAmericanIndicator) {
        this.northAmericanIndicator = pNorthAmericanIndicator;
    }

    /**
     * Sets the <code>notifyDate</code>.
     * <p>
     * 
     * @param pNotifyDate
     *            holds the new value of <code>notifyDate</code>
     */
    public void setNotifyDate(final Date pNotifyDate) {
        this.notifyDate = ContractUtility.getClonedDate(pNotifyDate);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>originCurrency</code>.
     * <p>
     * 
     * @param pOriginCurrency
     *            holds the new value of <code>originCurrency</code>
     */
    public void setOriginCurrency(final String pOriginCurrency) {
        this.originCurrency = ContractUtility.convertToUpperCase(pOriginCurrency);
    }

    /**
     * Sets the <code>originStation</code>.
     * <p>
     * 
     * @param pOriginStation
     *            holds the new value of <code>originStation</code>
     */
    public void setOriginStation(final String pOriginStation) {
        this.originStation = ContractUtility.convertToUpperCase(pOriginStation);
    }

    /**
     * Sets the <code>padType</code>.
     * <p>
     * 
     * @param pPadType
     *            holds the new value of <code>padType</code>
     */

    public void setPadType(final String pPadType) {
        this.padType = pPadType;
    }

    /**
     * Sets the <code>paperAWBOverrideInd</code>.
     * <p>
     * 
     * @param pPaperAWBOverrideInd
     *            holds the new value of <code>paperAWBOverrideInd</code>
     */
    public void setPaperAWBOverrideInd(final boolean pPaperAWBOverrideInd) {
        this.paperAWBOverrideInd = pPaperAWBOverrideInd;
    }

    /**
     * Sets the <code>priority</code>.
     * <p>
     * 
     * @param pPriority
     *            holds the new value of <code>priority</code>
     */
    public void setPriority(final Integer pPriority) {
        this.priority = pPriority;
    }

    /**
     * Sets the <code>productCode</code>.
     * <p>
     * 
     * @param pProductCode
     *            holds the new value of <code>productCode</code>
     */
    public void setProductCode(final String pProductCode) {
        this.productCode = ContractUtility.convertToUpperCase(pProductCode);
    }

    /**
     * Sets the <code>shipperRemarks</code>.
     * <p>
     * 
     * @param pShipperRemarks
     *            holds the new value of <code>shipperRemarks</code>
     */
    public void setShipperRemarks(final String pShipperRemarks) {
        this.shipperRemarks = ContractUtility.convertToUpperCase(pShipperRemarks);
    }

    /**
     * Sets the <code>specialPurge</code>.
     * <p>
     * 
     * @param pSpecialPurge
     *            holds the new value of <code>specialPurge</code>
     */
    public void setSpecialPurge(final SpecialPurgeType pSpecialPurge) {
        this.specialPurge = pSpecialPurge;
    }

    /**
     * Sets the <code>status</code>.
     * <p>
     * 
     * @param pStatus
     *            holds the new value of <code>status</code>
     */
    public void setStatus(final ShipmentStatusType pStatus) {
        this.status = pStatus;
    }

    /**
     * Sets the <code>surfaceDestinationStation</code>.
     * <p>
     * 
     * @param pSurfaceDestinationStation
     *            holds the new value of <code>surfaceDestinationStation</code>
     */
    public void setSurfaceDestinationStation(final String pSurfaceDestinationStation) {
        this.surfaceDestinationStation = ContractUtility.convertToUpperCase(pSurfaceDestinationStation);
    }

    /**
     * Sets the <code>surfaceOriginStation</code>.
     * <p>
     * 
     * @param pSurfaceOriginStation
     *            holds the new value of <code>surfaceOriginStation</code>
     */
    public void setSurfaceOriginStation(final String pSurfaceOriginStation) {
        this.surfaceOriginStation = ContractUtility.convertToUpperCase(pSurfaceOriginStation);
    }

    /**
     * Sets the <code>taxIndicator</code>.
     * <p>
     * 
     * @param pTaxIndicator
     *            holds the new value of <code>taxIndicator</code>
     */
    public void setTaxIndicator(final Boolean pTaxIndicator) {
        this.taxIndicator = pTaxIndicator;
    }

    /**
     * Sets the <code>unitOfWeight</code>.
     * <p>
     * 
     * @param pUnitOfWeight
     *            holds the new value of <code>unitOfWeight</code>
     */
    public void setUnitOfWeight(final WeightUOMType pUnitOfWeight) {
        this.unitOfWeight = pUnitOfWeight;
    }

    /**
     * Gets the <code>pricingDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>pricingDate</code> property.
     */
    public Date getPricingDate() {
        return ContractUtility.getClonedDate(this.pricingDate);
    }

    /**
     * Sets the <code>pricingDate</code>.
     * <p>
     * 
     * @param pPricingDate
     *            holds the new value of <code>pricingDate</code>
     */

    public void setPricingDate(final Date pPricingDate) {
        this.pricingDate = ContractUtility.getClonedDate(pPricingDate);
    }

    private List<GeographicDataDto> geographicDataDtos;

    public List<GeographicDataDto> getGeographicDataDtos() {
        return this.geographicDataDtos;
    }

    public void setGeographicDataDtos(final List<GeographicDataDto> pGeographicDataDtos) {
        this.geographicDataDtos = pGeographicDataDtos;
    }

    private List<GeographicDataDto> intermediateStationGeographicDataDtos;

    public List<GeographicDataDto> getIntermediateStationGeographicDataDtos() {
        return this.intermediateStationGeographicDataDtos;
    }

    public void setIntermediateStationGeographicDataDtos(final List<GeographicDataDto> pGeographicDataDtos) {
        this.intermediateStationGeographicDataDtos = pGeographicDataDtos;
    }

    public GeographicDataDto getOriginStationGeoraphicData() {
        return this.originStationGeoraphicData;
    }

    public void setOriginStationGeoraphicData(final GeographicDataDto pOriginStationGeoraphicData) {
        this.originStationGeoraphicData = pOriginStationGeoraphicData;
    }

    public GeographicDataDto getDestinationStationGeoraphicData() {
        return this.destinationStationGeoraphicData;
    }

    public void setDestinationStationGeoraphicData(final GeographicDataDto pDestinationStationGeoraphicData) {
        this.destinationStationGeoraphicData = pDestinationStationGeoraphicData;
    }

    public GeographicDataDto getMovementStationGeoraphicData() {
        return this.movementStationGeoraphicData;
    }

    public void setMovementStationGeoraphicData(final GeographicDataDto pMovementStationGeoraphicData) {
        this.movementStationGeoraphicData = pMovementStationGeoraphicData;
    }

    public GeographicDataDto getAcceptGoodsGeoraphicData() {
        return this.acceptGoodsGeoraphicData;
    }

    public void setAcceptGoodsGeoraphicData(final GeographicDataDto pAcceptGoodsGeoraphicData) {
        this.acceptGoodsGeoraphicData = pAcceptGoodsGeoraphicData;
    }

    public GeographicDataDto getSurfaceDestinationGeoraphicData() {
        return this.surfaceDestinationGeoraphicData;
    }

    public void setSurfaceDestinationGeoraphicData(final GeographicDataDto pSurfaceDestinationGeoraphicData) {
        this.surfaceDestinationGeoraphicData = pSurfaceDestinationGeoraphicData;
    }

    public GeographicDataDto getSurfaceOriginGeoraphicData() {
        return this.surfaceOriginGeoraphicData;
    }

    public void setSurfaceOriginGeoraphicData(final GeographicDataDto pSurfaceOriginGeoraphicData) {
        this.surfaceOriginGeoraphicData = pSurfaceOriginGeoraphicData;
    }

    public GeographicDataDto getExportReportingGeoraphicData() {
        return this.exportReportingGeoraphicData;
    }

    public void setExportReportingGeoraphicData(final GeographicDataDto pExportReportingGeoraphicData) {
        this.exportReportingGeoraphicData = pExportReportingGeoraphicData;
    }

    public GeographicDataDto getImportReportingGeophicData() {
        return this.importReportingGeophicData;
    }

    public void setImportReportingGeophicData(final GeographicDataDto pImportReportingGeophicData) {
        this.importReportingGeophicData = pImportReportingGeophicData;
    }

    public GeographicDataDto getForceAccountingGeophicData() {
        return this.forceAccountingGeophicData;
    }

    public void setForceAccountingGeophicData(final GeographicDataDto pForceAccountingGeophicData) {
        this.forceAccountingGeophicData = pForceAccountingGeophicData;
    }

    public String getCustomStation() {
        return this.customStation;
    }

    public void setCustomStation(final String pCustomStation) {
        this.customStation = ContractUtility.convertToUpperCase(pCustomStation);
    }

    public String getCrossReference1Type() {
        return this.crossReference1Type;
    }

    public void setCrossReference1Type(final String pCrossReference1Type) {
        this.crossReference1Type = ContractUtility.convertToUpperCase(pCrossReference1Type);
    }

    public String getCrossReference2Type() {
        return this.crossReference2Type;
    }

    public void setCrossReference2Type(final String pCrossReference2Type) {
        this.crossReference2Type = ContractUtility.convertToUpperCase(pCrossReference2Type);
    }

    public String toStringBeforeCreationDate() {
        final StringBuilder strBuilder = new StringBuilder();

        if (this.getProductCode() != null) {
            strBuilder.append(this.getProductCode());
            strBuilder.append(" ");
        }
        if (this.getPriority() != null) {
            strBuilder.append(this.getPriority());
            strBuilder.append(" ");
        }
        if (this.getStatus() != null && this.getStatus().getStatus() != null) {
            strBuilder.append(this.getStatus().getStatus());
            strBuilder.append(" ");
        }
        if (this.getExportPaycode() != null && this.getExportPaycode().getPayCode() != null) {
            strBuilder.append(this.getExportPaycode().getPayCode());
            strBuilder.append(" ");
        }
        if (this.getExportAuditType() != null) {
            strBuilder.append(this.getExportAuditType());
            strBuilder.append(" ");
        }
        if (this.getImportPaycode() != null && this.getImportPaycode().getPayCode() != null) {
            strBuilder.append(this.getImportPaycode().getPayCode());
            strBuilder.append(" ");
        }
        if (this.getImportAudit() != null) {
            strBuilder.append(this.getImportAudit());
            strBuilder.append(" ");
        }
        return strBuilder.toString();
    }

    public String toStringAfterCreationDate() {
        final StringBuilder strBuilder = new StringBuilder();
        if (this.getExecutionDate() != null) {
            strBuilder.append(DateUtility.getFormattedDate(
                FrameworkConstants.DATEFORMAT,
                this.getExecutionDate()));
            strBuilder.append(" ");
        }
        if (this.getCustomStation() != null) {
            strBuilder.append(this.getCustomStation());
            strBuilder.append(" ");
        }
        if (this.getDeclaredValue() != null) {
            strBuilder.append(this.getDeclaredValue());
            strBuilder.append(" ");
        }
        if (this.getCustomsValue() != null) {
            strBuilder.append(this.getCustomsValue());
            strBuilder.append(" ");
        }
        if (this.getInsuranceValue() != null) {
            strBuilder.append(this.getInsuranceValue());
            strBuilder.append(" ");
        }
        if (this.getInsuranceCode() != null) {
            strBuilder.append(this.getInsuranceCode());
            strBuilder.append(" ");
        }
        if (this.getOriginCurrency() != null) {
            strBuilder.append(this.getOriginCurrency());
            strBuilder.append(" ");
        }
        if (this.getDestinationCurrency() != null) {
            strBuilder.append(this.getDestinationCurrency());
            strBuilder.append(" ");
        }
        if (this.getUnitOfWeight() != null) {

            strBuilder.append(this.getUnitOfWeight());
            strBuilder.append(" ");
        }
        if (this.getPricingDate() != null) {
            strBuilder.append(DateUtility.getFormattedDate(
                FrameworkConstants.DATEFORMAT,
                this.getPricingDate()));
            strBuilder.append(" ");
        }
        if (this.getNotifyDate() != null) {
            strBuilder.append(DateUtility.getFormattedDate(
                FrameworkConstants.DATEFORMAT,
                this.getNotifyDate()));
            strBuilder.append(" ");
        }
        if (this.getNotifyDate() != null) {
            strBuilder.append(DateUtility.getTimeAsString(
                        this.getNotifyDate()));
            strBuilder.append(" ");
        }
        if (this.getDeliveryDate() != null) {
            strBuilder.append(DateUtility.getFormattedDate(
                FrameworkConstants.DATEFORMAT,
                this.getDeliveryDate()));
            strBuilder.append(" ");
        }
        if (this.getDeliveryDate() != null) {
            strBuilder.append(DateUtility.getTimeAsString(
                        this.getDeliveryDate()));
            strBuilder.append(" ");
        }
        if (this.getInternationalAWB() != null && this.getInternationalAWB().getShipment() != null) {
            strBuilder.append(this.getInternationalAWB().getShipment());
            strBuilder.append(" ");
        }
        if (this.getCrossReference1Type() != null) {
            strBuilder.append(this.getCrossReference1Type());
            strBuilder.append(" ");
        }
        if (this.getCrossReference1() != null) {
            strBuilder.append(this.getCrossReference1());
            strBuilder.append(" ");
        }

        if (this.getCrossReference2Type() != null) {
            strBuilder.append(this.getCrossReference2Type());
            strBuilder.append(" ");
        }
        if (this.getCrossReference2() != null) {
            strBuilder.append(this.getCrossReference2());
            strBuilder.append(" ");
        }
        if (this.getSurfaceOriginStation() != null) {
            strBuilder.append(this.getSurfaceOriginStation());
            strBuilder.append(" ");
        }
        if (this.getSurfaceDestinationStation() != null) {
            strBuilder.append(this.getSurfaceDestinationStation());
            strBuilder.append(" ");
        }
        if (this.getExchangeRate() != null) {
            strBuilder.append(this.getExchangeRate());
            strBuilder.append(" ");
        }
        if (this.getTaxIndicator() != null && this.getTaxIndicator()) {

            strBuilder.append("Yes");
            strBuilder.append(" ");
        }
        if (this.getTaxIndicator() != null && !this.getTaxIndicator()) {

            strBuilder.append("No");
            strBuilder.append(" ");
        }

        if (this.getAccountingRemarks() != null) {
            strBuilder.append(this.getAccountingRemarks());
            strBuilder.append(" ");
        }
        if (this.getcODamount() != null) {
            strBuilder.append(this.getcODamount());
            strBuilder.append(" ");
        }
        if (this.getcODCurrency() != null) {
            strBuilder.append(this.getcODCurrency());
            strBuilder.append(" ");
        }
        if (this.getExchangeRate() != null) {
            strBuilder.append(this.getExchangeRate());
            strBuilder.append(" ");
        }
        if (this.getShipperRemarks() != null) {
            strBuilder.append(this.getShipperRemarks());
            strBuilder.append(" ");
        }
        if (this.getDiscrepancies() != null) {
            strBuilder.append(this.getDiscrepancies());
            strBuilder.append(" ");
        }
        if (this.getConsigneeRemarks1() != null) {
            strBuilder.append(this.getConsigneeRemarks1());
            strBuilder.append(" ");
        }
        if (this.getContractSRAAppliesIndicator()) {
            strBuilder.append("Yes");
            strBuilder.append(" ");
        }
        if (!this.getContractSRAAppliesIndicator()) {
            strBuilder.append("No");
            strBuilder.append(" ");
        }

        if (this.getConsigneeRemarks2() != null) {
            strBuilder.append(this.getConsigneeRemarks2());
            strBuilder.append(" ");
        }
        if (this.getExportReportingStation() != null) {

            strBuilder.append(this.getExportReportingStation());
            strBuilder.append(" ");
        }
        if (this.getExportReportingDate() != null) {
            strBuilder.append(DateUtility.getFormattedDate(
                FrameworkConstants.DATEFORMAT,
                this.getExportReportingDate()));
            strBuilder.append(" ");
        }
        if (this.getImportReportingStation() != null) {
            strBuilder.append(this.getImportReportingStation());
            strBuilder.append(" ");
        }
        if (this.getImportReportingDate() != null) {
            strBuilder.append(DateUtility.getFormattedDate(
                FrameworkConstants.DATEFORMAT,
                this.getImportReportingDate()));
            strBuilder.append(" ");
        }
        if (this.getForceToAccExclusionReason() != null
                    && this.getForceToAccExclusionReason().getReasonType() != null) {
            strBuilder.append(this.getForceToAccExclusionReason().getReasonType());
            strBuilder.append(" ");
        }
        if (this.getForceToAccAcceptGoods() != null) {
            strBuilder.append(this.getForceToAccAcceptGoods());
            strBuilder.append(" ");
        }
        if (this.getForceToAccMovementStation() != null) {
            strBuilder.append(this.getForceToAccMovementStation());
            strBuilder.append(" ");
        }
        if (this.getForceToAccMovementDate() != null) {
            strBuilder.append(DateUtility.getFormattedDate(
                FrameworkConstants.DATEFORMAT,
                this.getForceToAccMovementDate()));
            strBuilder.append(" ");
        }
        if (this.getSpecialPurge() != null && this.getSpecialPurge().getPurge() != null) {
            strBuilder.append(this.getSpecialPurge().getPurge());
            strBuilder.append(" ");
        }
        return strBuilder.toString();
    }

	/**
	 * @return the ccaDate
	 */
	public Date getCcaDate() {
		return ccaDate;
	}

	/**
	 * @param ccaDate the ccaDate to set
	 */
	public void setCcaDate(Date ccaDate) {
		this.ccaDate = ccaDate;
	}
	
	@Override
    public String toString() {
      final StringBuilder strBuilder = new StringBuilder();
     
      if(this.getExportPaycode()!=null){
          strBuilder.append(this.getExportPaycode());  
          strBuilder.append(" ");
      }
      if(this.getExportAuditType()!=null){
          strBuilder.append(this.getExportAuditType());
            strBuilder.append(" ");
      }
       if(this.getImportPaycode()!=null){
           strBuilder.append(this.getImportPaycode());
            strBuilder.append(" ");
       }
       if(this.getImportAudit()!=null){
           strBuilder.append(this.getImportAudit());
            strBuilder.append(" ");  
       }
        return strBuilder.toString();
  }

	public String getSupplierGstinOriginStn() {
		return supplierGstinOriginStn;
	}

	public void setSupplierGstinOriginStn(String supplierGstinOriginStn) {
		this.supplierGstinOriginStn = supplierGstinOriginStn;
	}

	public String getSupplierGstinDestnStn() {
		return supplierGstinDestnStn;
	}

	public void setSupplierGstinDestnStn(String supplierGstinDestnStn) {
		this.supplierGstinDestnStn = supplierGstinDestnStn;
	}

	
              
}
