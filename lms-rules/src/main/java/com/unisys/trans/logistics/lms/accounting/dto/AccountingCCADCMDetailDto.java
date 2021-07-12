package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Transient;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AuditStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ExclusionReasonType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ExportPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.FWBType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ImportPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InternationalAWBType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ShipmentStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.SpecialPurgeType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto;

/**
 * <code>AccountingAirWaybillDetail</code> domain contain details of AccountingAirWaybillDetail.
 * <p>
 * This contains all information about AccountingAirWaybillDetail.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>accountingRemarks
 * <li>airwaybillRoutingSegments
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
 * <li>notifyDate
 * <li>oId
 * <li>originCurrency
 * <li>originStation
 * <li>padType
 * <li>paperAWBOverrideInd
 * <li>priority
 * <li>productCode
 * <li>shipperRemarks
 * <li>specialHandlingCodes
 * <li>specialPurge
 * <li>status
 * <li>surfaceDestinationStation
 * <li>surfaceOriginStation
 * <li>taxIndicator
 * <li>unitOfWeight
 * <li>pricingDate
 * <li>hostExchangeRate
 * <li>billingExchangeRate
 * <li>hostExchangeRateDetail
 * <li>billingExchangeRateDetail
 * </ul>
 */
public class AccountingCCADCMDetailDto extends PersistenceObjectDto {

    /**
     * Unique Serial Version Id UID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to holds <code>accountingRemarks</code> property.
     */
    private String accountingRemarks;

    /**
     * Attribute to holds <code>cODamount</code> property.
     */
    private BigDecimal cODamount;

    /**
     * Attribute to holds <code>cODCurrency</code> property.
     */
    private String cODCurrency;

    /**
     * Attribute to holds <code>cODExchangeRate</code> property.
     */
    private BigDecimal cODExchangeRate;

    /**
     * Attribute to holds <code>consigneeRemarks1</code> property.
     */
    private String consigneeRemarks1;

    /**
     * Attribute to holds <code>consigneeRemarks2</code> property.
     */
    private String consigneeRemarks2;

    /**
     * Attribute to holds <code>contractSRAAppliesIndicator</code> property.
     */
    private boolean contractSRAAppliesIndicator;   
   

    /**
     * Attribute to holds <code>crossReference1</code> property.
     */
    private String crossReference1;

    /**
     * Attribute to holds <code>crossReference2</code> property.
     */
    private String crossReference2;    
    
    /**
     * Attribute to hold <code>crossReference1indicator</code> property.
     */
    private String crossReference1Type ;

    /**
     * Attribute to hold <code>crossReference2indicator</code> property.
     */
    private String crossReference2Type ;


    /**
     * Attribute to holds <code>customsValue</code> property.
     */
    private String customsValue;

    /**
     * Attribute to holds <code>declaredValue</code> property.
     */
    private String declaredValue;

    /**
     * Attribute to holds <code>deliveryDate</code> property.
     */
    private Date deliveryDate;

    /**
     * Attribute to holds <code>destinationCarrier</code> property.
     */
    private String destinationCarrier;

    /**
     * Attribute to hold <code>destinationCurrency</code> property.
     */
    private String destinationCurrency;

    /**
     * Attribute to holds <code>destinationStation</code> property.
     */
    private String destinationStation;

    /**
     * Attribute to holds <code>discrepancies</code> property.
     */
    private String discrepancies;

    /**
     * Attribute to holds <code>eAWBIndicator</code> property.
     */
    private Boolean eAWBIndicator;

    /**
     * Attribute to holds <code>exchangeRate</code> property.
     */
    private BigDecimal exchangeRate;

    /**
     * Attribute to holds <code>executionDate</code> property.
     */
    private Date executionDate;

    /**
     * Attribute to holds <code>exportAuditType</code> property.
     */
    private AuditStatusType exportAuditType;

    /**
     * Attribute to holds <code>exportPaycode</code> property.
     */
    private ExportPaymentType exportPaycode;

    /**
     * Attribute to holds <code>exportReportingDate</code> property.
     */
    private Date exportReportingDate;

    /**
     * Attribute to holds <code>exportReportingStation</code> property.
     */
    private String exportReportingStation;

    /**
     * Attribute to holds <code>forceToAccAcceptGoods</code> property.
     */
    private String forceToAccAcceptGoods;

    /**
     * Attribute to holds <code>forceToAccExclusionReason</code> property.
     */
    private ExclusionReasonType forceToAccExclusionReason;

    /**
     * Attribute to holds <code>forceToAccMovementDate</code> property.
     */
    private Date forceToAccMovementDate;

    /**
     * Attribute to holds <code>forceToAccMovementStation</code> property.
     */
    private String forceToAccMovementStation;

    /**
     * Attribute to holds <code>destinationStation</code> property.
     */
    private String customsStation;

    /**
     * Attribute to holds <code>fWBType</code> property.
     */
    private FWBType fWBType;

    /**
     * Attribute to holds <code>importAudit</code> property.
     */
    private AuditStatusType importAudit;

    /**
     * Attribute to holds <code>importPaycode</code> property.
     */
    private ImportPaymentType importPaycode;

    /**
     * Attribute to holds <code>importReportingDate</code> property.
     */
    private Date importReportingDate;

    /**
     * Attribute to holds <code>importReportingStation</code> property.
     */
    private String importReportingStation;

    /**
     * Attribute to holds <code>insuranceCode</code> property.
     */
    private String insuranceCode;

    /**
     * Attribute to holds <code>insuranceValue</code> property.
     */
    private String insuranceValue;

    /**
     * Attribute to holds <code>internationalAWB</code> property.
     */
    private InternationalAWBType internationalAWB;

    /**
     * Attribute to holds <code>northAmericanIndicator</code> property.
     */
    private boolean northAmericanIndicator;

    /**
     * Attribute to holds <code>notifyDate</code> property.
     */
    private Date notifyDate;

    /**
     * Attribute to holds <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to holds <code>originCurrency</code> property.
     */
    private String originCurrency;

    /**
     * Attribute to holds <code>originStation</code> property.
     */
    private String originStation;

    /**
     * Attribute to holds <code>padType</code> property.
     */
    
    private String padType;

    /**
     * Attribute to holds <code>paperAWBOverrideInd</code> property.
     */
    private boolean paperAWBOverrideInd;

    /**
     * Attribute to holds <code>priority</code> property.
     */
    private Integer priority;

    /**
     * Attribute to holds <code>productCode</code> property.
     */
    private String productCode;

    /**
     * Attribute to holds <code>shipperRemarks</code> property.
     */
    private String shipperRemarks;

    /**
     * Attribute to holds <code>specialPurge</code> property.
     */
    private SpecialPurgeType specialPurge;

    /**
     * Attribute to holds <code>status</code> property.
     */
    private ShipmentStatusType status;

    /**
     * Attribute to holds <code>surfaceDestinationStation</code> property.
     */
    private String surfaceDestinationStation;

    /**
     * Attribute to holds <code>surfaceOriginStation</code> property.
     */
    private String surfaceOriginStation;

    /**
     * Attribute to holds <code>taxIndicator</code> property.
     */
    private Boolean taxIndicator;

    /**
     * Attribute to holds <code>unitOfWeight</code> property.
     */
    private WeightUOMType unitOfWeight;

    /**
     * Attribute to holds <code>pricingDate</code> property.
     */
    private Date pricingDate;

    /**
     * Gets the <code>accountingRemarks</code> property.
     * 
     * @return the current value of the <code>accountingRemarks</code> property.<br>
     */
    public String getAccountingRemarks() {
        return this.accountingRemarks;
    }

    /**
     * Gets the <code>cODamount</code> property.
     * 
     * @return the current value of the <code>cODamount</code> property.<br>
     */
    public BigDecimal getcODamount() {
        return this.cODamount;
    }

    /**
     * Gets the <code>cODCurrency</code> property.
     * 
     * @return the current value of the <code>cODCurrency</code> property.<br>
     */

    public String getcODCurrency() {
        return this.cODCurrency;
    }

    /**
     * Gets the <code>cODExchangeRate</code> property.
     * 
     * @return the current value of the <code>cODExchangeRate</code> property.<br>
     */

    public BigDecimal getcODExchangeRate() {
        return this.cODExchangeRate;
    }

    /**
     * Gets the <code>consigneeRemarks1</code> property.
     * 
     * @return the current value of the <code>consigneeRemarks1</code> property.<br>
     */
    public String getConsigneeRemarks1() {
        return this.consigneeRemarks1;
    }

    /**
     * Gets the <code>consigneeRemarks2</code> property.
     * 
     * @return the current value of the <code>consigneeRemarks2</code> property.<br>
     */
    public String getConsigneeRemarks2() {
        return this.consigneeRemarks2;
    }

    /**
     * Gets the <code>crossReference2</code> property.
     * 
     * @return the current value of the <code>crossReference2</code> property.<br>
     */
    public String getCorssReference2() {
        return this.crossReference2;
    }

    /**
     * Gets the <code>crossReference1</code> property.
     * 
     * @return the current value of the <code>crossReference1</code> property.<br>
     */
    public String getCrossReference1() {
        return this.crossReference1;
    }

    /**
     * Gets the <code>crossReference2</code> property.
     * 
     * @return the current value of the <code>crossReference2</code> property.<br>
     */

    public String getCrossReference2() {
        return this.crossReference2;
    }

    /**
     * Gets the <code>customsValue</code> property.
     * 
     * @return the current value of the <code>customsValue</code> property.<br>
     */

    public String getCustomsValue() {
        return this.customsValue;
    }

    /**
     * Gets the <code>declaredValue</code> property.
     * 
     * @return the current value of the <code>declaredValue</code> property.<br>
     */
    public String getDeclaredValue() {
        return this.declaredValue;
    }

    /**
     * Gets the <code>deliveryDate</code> property.
     * 
     * @return the current value of the <code>deliveryDate</code> property.<br>
     */
    public Date getDeliveryDate() {
        return ContractUtility.getClonedDate(this.deliveryDate);
    }


    /**
     * Gets the <code>destinationCarrier</code> property.
     * 
     * @return the current value of the <code>destinationCarrier</code> property.<br>
     */

    public String getDestinationCarrier() {
        return this.destinationCarrier;
    }

    /**
     * Gets the <code>destinationCurrency</code> property.
     * 
     * @return the current value of the <code>destinationCurrency</code> property.<br>
     */
    public String getDestinationCurrency() {
        return this.destinationCurrency;
    }

    /**
     * Gets the <code>destinationStation</code> property.
     * 
     * @return the current value of the <code>destinationStation</code> property.<br>
     */
    public String getDestinationStation() {
        return this.destinationStation;
    }

    /**
     * Gets the <code>discrepancies</code> property.
     * 
     * @return the current value of the <code>discrepancies</code> property.<br>
     */
    public String getDiscrepancies() {
        return this.discrepancies;
    }

    /**
     * Gets the <code>exchangeRate</code> property.
     * 
     * @return the current value of the <code>exchangeRate</code> property.<br>
     */
    public BigDecimal getExchangeRate() {
        return this.exchangeRate;
    }

    /**
     * Gets the <code>executionDate</code> property.
     * 
     * @return the current value of the <code>executionDate</code> property.<br>
     */
    public Date getExecutionDate() {
        return ContractUtility.getClonedDate(this.executionDate);
    }

    /**
     * Gets the <code>exportAuditType</code> property.
     * 
     * @return the current value of the <code>exportAuditType</code> property.<br>
     */
    public AuditStatusType getExportAuditType() {
        return this.exportAuditType;
    }

    /**
     * Gets the <code>exportPaycode</code> property.
     * 
     * @return the current value of the <code>exportPaycode</code> property.<br>
     */
    public ExportPaymentType getExportPaycode() {
        return this.exportPaycode;
    }

    /**
     * Gets the <code>exportReportingDate</code> property.
     * 
     * @return the current value of the <code>exportReportingDate</code> property.<br>
     */
    public Date getExportReportingDate() {
        return ContractUtility.getClonedDate(this.exportReportingDate);
    }

    /**
     * Gets the <code>exportReportingStation</code> property.
     * 
     * @return the current value of the <code>exportReportingStation</code> property.<br>
     */
    public String getExportReportingStation() {
        return this.exportReportingStation;
    }

    /**
     * Gets the <code>forceToAccAcceptGoods</code> property.
     * 
     * @return the current value of the <code>forceToAccAcceptGoods</code> property.<br>
     */
    public String getForceToAccAcceptGoods() {
        return this.forceToAccAcceptGoods;
    }

    /**
     * Gets the <code>forceToAccExclusionReason</code> property.
     * 
     * @return the current value of the <code>forceToAccExclusionReason</code> property.<br>
     */
    public ExclusionReasonType getForceToAccExclusionReason() {
        return this.forceToAccExclusionReason;
    }

    /**
     * Gets the <code>forceToAccMovementDate</code> property.
     * 
     * @return the current value of the <code>forceToAccMovementDate</code> property.<br>
     */
    public Date getForceToAccMovementDate() {
        return ContractUtility.getClonedDate(this.forceToAccMovementDate);
    }

    /**
     * Gets the <code>forceToAccMovementStation</code> property.
     * 
     * @return the current value of the <code>forceToAccMovementStation</code> property.<br>
     */

    public String getForceToAccMovementStation() {
        return this.forceToAccMovementStation;
    }

    /**
     * Gets the <code>fWBType</code> property.
     * 
     * @return the current value of the <code>fWBType</code> property.<br>
     */
    public FWBType getfWBType() {
        return this.fWBType;
    }

    /**
     * Gets the <code>importAudit</code> property.
     * 
     * @return the current value of the <code>importAudit</code> property.<br>
     */

    public AuditStatusType getImportAudit() {
        return this.importAudit;
    }

    /**
     * Gets the <code>importPaycode</code> property.
     * 
     * @return the current value of the <code>importPaycode</code> property.<br>
     */
    public ImportPaymentType getImportPaycode() {
        return this.importPaycode;
    }

    /**
     * Gets the <code>importReportingDate</code> property.
     * 
     * @return the current value of the <code>importReportingDate</code> property.<br>
     */
    public Date getImportReportingDate() {
        return ContractUtility.getClonedDate(this.importReportingDate);
    }

    /**
     * Gets the <code>importReportingStation</code> property.
     * 
     * @return the current value of the <code>importReportingStation</code> property.<br>
     */
    public String getImportReportingStation() {
        return this.importReportingStation;
    }

    /**
     * Gets the <code>insuranceCode</code> property.
     * 
     * @return the current value of the <code>insuranceCode</code> property.<br>
     */

    public String getInsuranceCode() {
        return this.insuranceCode;
    }

    /**
     * Gets the <code>insuranceValue</code> property.
     * 
     * @return the current value of the <code>insuranceValue</code> property.<br>
     */
    public String getInsuranceValue() {
        return this.insuranceValue;
    }

    /**
     * Gets the <code>internationalAWB</code> property.
     * 
     * @return the current value of the <code>internationalAWB</code> property.<br>
     */
    public InternationalAWBType getInternationalAWB() {
        return this.internationalAWB;
    }

    /**
     * Gets the <code>notifyDate</code> property.
     * 
     * @return the current value of the <code>notifyDate</code> property.<br>
     */
    public Date getNotifyDate() {
        return ContractUtility.getClonedDate(this.notifyDate);
    }


    /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>originCurrency</code> property.
     * 
     * @return the current value of the <code>originCurrency</code> property.<br>
     */
    public String getOriginCurrency() {
        return this.originCurrency;
    }

    /**
     * Gets the <code>originStation</code> property.
     * 
     * @return the current value of the <code>originStation</code> property.<br>
     */
    public String getOriginStation() {
        return this.originStation;
    }

    /**
     * Gets the <code>padType</code> property.
     * 
     * @return the current value of the <code>padType</code> property.<br>
     */
    public String getPadType() {
        return this.padType;
    }

    /**
     * Gets the <code>pricingDate</code> property.
     * 
     * @return the current value of the <code>pricingDate</code> property.<br>
     */
    public Date getPricingDate() {
        return ContractUtility.getClonedDate(this.pricingDate);
    }

    /**
     * Gets the <code>priority</code> property.
     * 
     * @return the current value of the <code>priority</code> property.<br>
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Gets the <code>productCode</code> property.
     * 
     * @return the current value of the <code>productCode</code> property.<br>
     */

    public String getProductCode() {
        return this.productCode;
    }

    /**
     * Gets the <code>shipperRemarks</code> property.
     * 
     * @return the current value of the <code>shipperRemarks</code> property.<br>
     */
    public String getShipperRemarks() {
        return this.shipperRemarks;
    }

    /**
     * Gets the <code>specialPurge</code> property.
     * 
     * @return the current value of the <code>specialPurge</code> property.<br>
     */
    public SpecialPurgeType getSpecialPurge() {
        return this.specialPurge;
    }

    /**
     * Gets the <code>status</code> property.
     * 
     * @return the current value of the <code>status</code> property.<br>
     */
    public ShipmentStatusType getStatus() {
        return this.status;
    }

    /**
     * Gets the <code>surfaceDestinationStation</code> property.
     * 
     * @return the current value of the <code>surfaceDestinationStation</code> property.<br>
     */
    public String getSurfaceDestinationStation() {
        return this.surfaceDestinationStation;
    }

    /**
     * Gets the <code>surfaceOriginStation</code> property.
     * 
     * @return the current value of the <code>surfaceOriginStation</code> property.<br>
     */

    public String getSurfaceOriginStation() {
        return this.surfaceOriginStation;
    }

    /**
     * Gets the <code>unitOfWeight</code> property.
     * 
     * @return the current value of the <code>unitOfWeight</code> property.<br>
     */

    public WeightUOMType getUnitOfWeight() {
        return this.unitOfWeight;
    }

    /**
     * Gets the <code>contractSRAAppliesIndicator</code> property.
     * 
     * @return the current value of the <code>contractSRAAppliesIndicator</code> property.<br>
     */
    public boolean getContractSRAAppliesIndicator() {
        return this.contractSRAAppliesIndicator;
    }

    /**
     * Gets the <code>eAWBIndicator</code> property.
     * 
     * @return the current value of the <code>eAWBIndicator</code> property.<br>
     */
    public Boolean getEAWBIndicator() {
        return this.eAWBIndicator;
    }

    /**
     * Gets the <code>northAmericanIndicator</code> property.
     * 
     * @return the current value of the <code>northAmericanIndicator</code> property.<br>
     */
    public boolean getNorthAmericanIndicator() {
        return this.northAmericanIndicator;
    }

    /**
     * Gets the <code>paperAWBOverrideInd</code> property.
     * 
     * @return the current value of the <code>paperAWBOverrideInd</code> property.<br>
     */
    public boolean getPaperAWBOverrideInd() {
        return this.paperAWBOverrideInd;
    }

    /**
     * Gets the <code>taxIndicator</code> property.
     * 
     * @return the current value of the <code>taxIndicator</code> property.<br>
     */
    public Boolean getTaxIndicator() {
        return this.taxIndicator;
    }

    /**
     * Sets the <code>accountingRemarks</code> property.
     * <p>
     * 
     * @param pAccountingRemarks
     *            the new value of the <code>accountingRemarks</code> property.
     */
    public void setAccountingRemarks(final String pAccountingRemarks) {
        this.accountingRemarks = pAccountingRemarks;
    }

    /**
     * Sets the <code>cODamount</code> property.
     * <p>
     * 
     * @param pCODamount
     *            the new value of the <code>cODamount</code> property.
     */

    public void setcODamount(final BigDecimal pCODamount) {
        this.cODamount = pCODamount;
    }

    /**
     * Sets the <code>cODCurrency</code> property.
     * <p>
     * 
     * @param pCODCurrency
     *            the new value of the <code>cODCurrency</code> property.
     */

    public void setcODCurrency(final String pCODCurrency) {
        this.cODCurrency = pCODCurrency;
    }

    /**
     * Sets the <code>cODExchangeRate</code> property.
     * <p>
     * 
     * @param pCODExchangeRate
     *            the new value of the <code>cODExchangeRate</code> property.
     */
    public void setcODExchangeRate(final BigDecimal pCODExchangeRate) {
        this.cODExchangeRate = pCODExchangeRate;
    }

    /**
     * Sets the <code>consigneeRemarks1</code> property.
     * <p>
     * 
     * @param pConsigneeRemarks1
     *            the new value of the <code>consigneeRemarks1</code> property.
     */
    public void setConsigneeRemarks1(final String pConsigneeRemarks1) {
        this.consigneeRemarks1 = pConsigneeRemarks1;
    }

    /**
     * Sets the <code>consigneeRemarks2</code> property.
     * <p>
     * 
     * @param pConsigneeRemarks2
     *            the new value of the <code>consigneeRemarks2</code> property.
     */

    public void setConsigneeRemarks2(final String pConsigneeRemarks2) {
        this.consigneeRemarks2 = pConsigneeRemarks2;
    }

    /**
     * Sets the <code>contractSRAAppliesIndicator</code> property.
     * <p>
     * 
     * @param pContractSRAAppliesIndicator
     *            the new value of the <code>contractSRAAppliesIndicator</code> property.
     */
    public void setContractSRAAppliesIndicator(final boolean pContractSRAAppliesIndicator) {
        this.contractSRAAppliesIndicator = pContractSRAAppliesIndicator;
    }

    /**
     * Sets the <code>crossReference2</code> property.
     * <p>
     * 
     * @param pCorssReference2
     *            the new value of the <code>crossReference2</code> property.
     */
    public void setCorssReference2(final String pCorssReference2) {
        this.crossReference2 = pCorssReference2;
    }

    /**
     * Sets the <code>crossReference1</code> property.
     * <p>
     * 
     * @param pCrossReference1
     *            the new value of the <code>crossReference1</code> property.
     */
    public void setCrossReference1(final String pCrossReference1) {
        this.crossReference1 = pCrossReference1;
    }

    /**
     * Sets the <code>crossReference2</code> property.
     * <p>
     * 
     * @param pCrossReference2
     *            the new value of the <code>crossReference2</code> property.
     */
    public void setCrossReference2(final String pCrossReference2) {
        this.crossReference2 = pCrossReference2;
    }

    /**
     * Sets the <code>customsValue</code> property.
     * <p>
     * 
     * @param pCustomsValue
     *            the new value of the <code>customsValue</code> property.
     */
    public void setCustomsValue(final String pCustomsValue) {
        this.customsValue = pCustomsValue;
    }

    /**
     * Sets the <code>declaredValue</code> property.
     * <p>
     * 
     * @param pDeclaredValue
     *            the new value of the <code>declaredValue</code> property.
     */
    public void setDeclaredValue(final String pDeclaredValue) {
        this.declaredValue = pDeclaredValue;
    }

    /**
     * Sets the <code>deliveryDate</code> property.
     * <p>
     * 
     * @param pDeliveryDate
     *            the new value of the <code>deliveryDate</code> property.
     */
    public void setDeliveryDate(final Date pDeliveryDate) {
        this.deliveryDate = ContractUtility.getClonedDate(pDeliveryDate);
    }

    /**
     * Sets the <code>destinationCarrier</code> property.
     * <p>
     * 
     * @param pDestinationCarrier
     *            the new value of the <code>destinationCarrier</code> property.
     */
    public void setDestinationCarrier(final String pDestinationCarrier) {
        this.destinationCarrier = pDestinationCarrier;
    }

    /**
     * Sets the <code>destinationCurrency</code> property.
     * <p>
     * 
     * @param pDestinationCurrency
     *            the new value of the <code>destinationCurrency</code> property.
     */
    public void setDestinationCurrency(final String pDestinationCurrency) {
        this.destinationCurrency = pDestinationCurrency;
    }

    /**
     * Sets the <code>destinationStation</code> property.
     * <p>
     * 
     * @param pDestinationStation
     *            the new value of the <code>destinationStation</code> property.
     */
    public void setDestinationStation(final String pDestinationStation) {
        this.destinationStation = pDestinationStation;
    }

    /**
     * Sets the <code>discrepencies</code> property.
     * <p>
     * 
     * @param pDiscrepencies
     *            the new value of the <code>discrepencies</code> property.
     */
    public void setDiscrepancies(final String pDiscrepancies) {
        this.discrepancies = pDiscrepancies;
    }

    /**
     * Sets the <code>eAWBIndicator</code> property.
     * <p>
     * 
     * @param pEAWBIndicator
     *            the new value of the <code>eAWBIndicator</code> property.
     */
    public void setEAWBIndicator(final Boolean pEAWBIndicator) {
        this.eAWBIndicator = pEAWBIndicator;
        if (this.eAWBIndicator == null) {
            this.eAWBIndicator = false;
        }
    }

    /**
     * Sets the <code>exchangeRate</code> property.
     * <p>
     * 
     * @param pExchangeRate
     *            the new value of the <code>exchangeRate</code> property.
     */
    public void setExchangeRate(final BigDecimal pExchangeRate) {
        this.exchangeRate = pExchangeRate;
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
     * Sets the <code>exportAuditType</code> property.
     * <p>
     * 
     * @param pExportAuditType
     *            the new value of the <code>exportAuditType</code> property.
     */
    public void setExportAuditType(final AuditStatusType pExportAuditType) {
        this.exportAuditType = pExportAuditType;
    }

    /**
     * Sets the <code>exportPaycode</code> property.
     * <p>
     * 
     * @param pExportPaycode
     *            the new value of the <code>exportPaycode</code> property.
     */
    public void setExportPaycode(final ExportPaymentType pExportPaycode) {
        this.exportPaycode = pExportPaycode;
    }

    /**
     * Sets the <code>exportReportingDate</code> property.
     * <p>
     * 
     * @param pExportReportingDate
     *            the new value of the <code>exportReportingDate</code> property.
     */
    public void setExportReportingDate(final Date pExportReportingDate) {
        this.exportReportingDate = ContractUtility.getClonedDate(pExportReportingDate);
    }

    /**
     * Sets the <code>exportReportingStation</code> property.
     * <p>
     * 
     * @param pExportReportingStation
     *            the new value of the <code>exportReportingStation</code> property.
     */
    public void setExportReportingStation(final String pExportReportingStation) {
        this.exportReportingStation = pExportReportingStation;
    }

    /**
     * Sets the <code>forceToAccAcceptGoods</code> property.
     * <p>
     * 
     * @param pForceToAccAcceptGoods
     *            the new value of the <code>forceToAccAcceptGoods</code> property.
     */
    public void setForceToAccAcceptGoods(final String pForceToAccAcceptGoods) {
        this.forceToAccAcceptGoods = pForceToAccAcceptGoods;
    }

    /**
     * Sets the <code>forceToAccExclusionReason</code> property.
     * <p>
     * 
     * @param pForceToAccExclusionReason
     *            the new value of the <code>forceToAccExclusionReason</code> property.
     */
    public void setForceToAccExclusionReason(final ExclusionReasonType pForceToAccExclusionReason) {
        this.forceToAccExclusionReason = pForceToAccExclusionReason;
    }

    /**
     * Sets the <code>forceToAccMovementDate</code> property.
     * <p>
     * 
     * @param pForceToAccMovementDate
     *            the new value of the <code>forceToAccMovementDate</code> property.
     */

    public void setForceToAccMovementDate(final Date pForceToAccMovementDate) {
        this.forceToAccMovementDate = ContractUtility.getClonedDate(pForceToAccMovementDate);
    }

    /**
     * Sets the <code>forceToAccMovementStation</code> property.
     * <p>
     * 
     * @param pForceToAccMovementStation
     *            the new value of the <code>forceToAccMovementStation</code> property.
     */

    public void setForceToAccMovementStation(final String pForceToAccMovementStation) {
        this.forceToAccMovementStation = pForceToAccMovementStation;
    }

    /**
     * Sets the <code>fWBType</code> property.
     * <p>
     * 
     * @param pFWBType
     *            the new value of the <code>fWBType</code> property.
     */

    public void setfWBType(final FWBType pFWBType) {
        this.fWBType = pFWBType;
    }

    /**
     * Sets the <code>importAudit</code> property.
     * <p>
     * 
     * @param pImportAudit
     *            the new value of the <code>importAudit</code> property.
     */

    public void setImportAudit(final AuditStatusType pImportAudit) {
        this.importAudit = pImportAudit;
    }

    /**
     * Sets the <code>importPaycode</code> property.
     * <p>
     * 
     * @param pImportPaycode
     *            the new value of the <code>importPaycode</code> property.
     */

    public void setImportPaycode(final ImportPaymentType pImportPaycode) {
        this.importPaycode = pImportPaycode;
    }

    /**
     * Sets the <code>importReportingDate</code> property.
     * <p>
     * 
     * @param pImportReportingDate
     *            the new value of the <code>importReportingDate</code> property.
     */

    public void setImportReportingDate(final Date pImportReportingDate) {
        this.importReportingDate = ContractUtility.getClonedDate(pImportReportingDate);
    }

    /**
     * Sets the <code>importReportingStation</code> property.
     * <p>
     * 
     * @param pImportReportingStation
     *            the new value of the <code>importReportingStation</code> property.
     */

    public void setImportReportingStation(final String pImportReportingStation) {
        this.importReportingStation = pImportReportingStation;
    }

    /**
     * Sets the <code>insuranceCode</code> property.
     * <p>
     * 
     * @param pInsuranceCode
     *            the new value of the <code>insuranceCode</code> property.
     */

    public void setInsuranceCode(final String pInsuranceCode) {
        this.insuranceCode = pInsuranceCode;
    }

    /**
     * Sets the <code>insuranceValue</code> property.
     * <p>
     * 
     * @param pInsuranceValue
     *            the new value of the <code>insuranceValue</code> property.
     */

    public void setInsuranceValue(final String pInsuranceValue) {
        this.insuranceValue = pInsuranceValue;
    }

    /**
     * Sets the <code>internationalAWB</code> property.
     * <p>
     * 
     * @param pInternationalAWB
     *            the new value of the <code>internationalAWB</code> property.
     */

    public void setInternationalAWB(final InternationalAWBType pInternationalAWB) {
        this.internationalAWB = pInternationalAWB;
    }

    /**
     * Sets the <code>northAmericanIndicator</code> property.
     * <p>
     * 
     * @param pNorthAmericanIndicator
     *            the new value of the <code>northAmericanIndicator</code> property.
     */

    public void setNorthAmericanIndicator(final boolean pNorthAmericanIndicator) {
        this.northAmericanIndicator = pNorthAmericanIndicator;
    }

    /**
     * Sets the <code>notifyDate</code> property.
     * <p>
     * 
     * @param pNotifyDate
     *            the new value of the <code>notifyDate</code> property.
     */

    public void setNotifyDate(final Date pNotifyDate) {
        this.notifyDate = ContractUtility.getClonedDate(pNotifyDate);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>originCurrency</code> property.
     * <p>
     * 
     * @param pOriginCurrency
     *            the new value of the <code>originCurrency</code> property.
     */

    public void setOriginCurrency(final String pOriginCurrency) {
        this.originCurrency = pOriginCurrency;
    }

    /**
     * Sets the <code>originStation</code> property.
     * <p>
     * 
     * @param pOriginStation
     *            the new value of the <code>originStation</code> property.
     */

    public void setOriginStation(final String pOriginStation) {
        this.originStation = pOriginStation;
    }

    /**
     * Sets the <code>padType</code> property.
     * <p>
     * 
     * @param pPadType
     *            the new value of the <code>padType</code> property.
     */

    public void setPadType(final String pPadType) {
        this.padType = pPadType;
    }

    /**
     * Sets the <code>paperAWBOverrideInd</code> property.
     * <p>
     * 
     * @param pPaperAWBOverrideInd
     *            the new value of the <code>paperAWBOverrideInd</code> property.
     */

    public void setPaperAWBOverrideInd(final boolean pPaperAWBOverrideInd) {
        this.paperAWBOverrideInd = pPaperAWBOverrideInd;
    }

    /**
     * Sets the <code>pricingDate</code> property.
     * <p>
     * 
     * @param pPricingDate
     *            the new value of the <code>pricingDate</code> property.
     */
    public void setPricingDate(final Date pPricingDate) {
        this.pricingDate = ContractUtility.getClonedDate(pPricingDate);
    }

    /**
     * Sets the <code>priority</code> property.
     * <p>
     * 
     * @param pPriority
     *            the new value of the <code>priority</code> property.
     */

    public void setPriority(final Integer pPriority) {
        this.priority = pPriority;
    }

    /**
     * Sets the <code>productCode</code> property.
     * <p>
     * 
     * @param pProductCode
     *            the new value of the <code>productCode</code> property.
     */

    public void setProductCode(final String pProductCode) {
        this.productCode = pProductCode;
    }

    /**
     * Sets the <code>shipperRemarks</code> property.
     * <p>
     * 
     * @param pShipperRemarks
     *            the new value of the <code>shipperRemarks</code> property.
     */

    public void setShipperRemarks(final String pShipperRemarks) {
        this.shipperRemarks = pShipperRemarks;
    }

    /**
     * Sets the <code>specialPurge</code> property.
     * <p>
     * 
     * @param pSpecialPurge
     *            the new value of the <code>specialPurge</code> property.
     */

    public void setSpecialPurge(final SpecialPurgeType pSpecialPurge) {
        this.specialPurge = pSpecialPurge;
    }

    /**
     * Sets the <code>status</code> property.
     * <p>
     * 
     * @param pStatus
     *            the new value of the <code>status</code> property.
     */

    public void setStatus(final ShipmentStatusType pStatus) {
        this.status = pStatus;
    }

    /**
     * Sets the <code>surfaceDestinationStation</code> property.
     * <p>
     * 
     * @param pSurfaceDestinationStation
     *            the new value of the <code>surfaceDestinationStation</code> property.
     */

    public void setSurfaceDestinationStation(final String pSurfaceDestinationStation) {
        this.surfaceDestinationStation = pSurfaceDestinationStation;
    }

    /**
     * Sets the <code>surfaceOriginStation</code> property.
     * <p>
     * 
     * @param pSurfaceOriginStation
     *            the new value of the <code>surfaceOriginStation</code> property.
     */

    public void setSurfaceOriginStation(final String pSurfaceOriginStation) {
        this.surfaceOriginStation = pSurfaceOriginStation;
    }

    /**
     * Sets the <code>taxIndicator</code> property.
     * <p>
     * 
     * @param pTaxIndicator
     *            the new value of the <code>taxIndicator</code> property.
     */

    public void setTaxIndicator(final Boolean pTaxIndicator) {
        /*
         * if(pTaxIndicator == null){
         * this.taxIndicator = false;
         * }else{
         */
        this.taxIndicator = pTaxIndicator;
    }

    /**
     * Sets the <code>unitOfWeight</code> property.
     * <p>
     * 
     * @param pUnitOfWeight
     *            the new value of the <code>unitOfWeight</code> property.
     */

    
    public void setUnitOfWeight(final WeightUOMType pUnitOfWeight) {
        this.unitOfWeight = pUnitOfWeight;
    }

   
    /**
     * Gets the <code>customsStation</code> property.
     * 
     * @return the current value of the <code>customsStation</code> property.<br>
     */
    public String getCustomsStation() {
        return customsStation;
    }

    /**
     * Sets the <code>unitOfWeight</code> property.
     * <p>
     * 
     * @param pUnitOfWeight
     *            the new value of the <code>unitOfWeight</code> property.
     */
    public void setCustomsStation(final String customsStation) {
        this.customsStation = customsStation;
    }

    /**
     * Gets the <code>crossReference1Type</code> property.
     * 
     * @return the current value of the <code>crossReference1Type</code> property.<br>
     */
    public String getCrossReference1Type() {
        return this.crossReference1Type;
    }

    /**
     * Sets the <code>crossReference1Type</code> property.
     * <p>
     * 
     * @param pCrossReference1Type
     *            the new value of the <code>crossReference1Type</code> property.
     */
    public void setCrossReference1Type(final String pCrossReference1Type) {
        this.crossReference1Type = pCrossReference1Type;
    }

    /**
     * Gets the <code>crossReference2Type</code> property.
     * 
     * @return the current value of the <code>crossReference2Type</code> property.<br>
     */
    public String getCrossReference2Type() {
        return this.crossReference2Type;
    }

    
    /**
     * Sets the <code>crossReference2Type</code> property.
     * <p>
     * 
     * @param pCrossReference2Type
     *            the new value of the <code>crossReference2Type</code> property.
     */
    public void setCrossReference2Type(final String pCrossReference2Type) {
        this.crossReference2Type = pCrossReference2Type;
    } 
    
    /**
   	* Attribute to hold <code>hostExchangeRateDetail</code> property.
   	*/
    @Column(name = "HOSTEXCHANGERATE", length = 200, nullable = true)
   	private String hostExchangeRate;

    /**
     * Gets the <code>hostExchangeRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>hostExchangeRate</code> property.<br>
    */	
    public String getHostExchangeRate() {
		return hostExchangeRate;
	}

    /**
     * Sets the <code>hostExchangeRate</code> property.
     * <p>
     * 
     * @param pHostExchangeRate
     *            the new value of the <code>hostExchangeRate</code> property.
    */
    public void setHostExchangeRate(final String pHostExchangeRate) {
		this.hostExchangeRate = pHostExchangeRate;
	}
    

    /**
  	 * Attribute to hold <code>hostExchangeRateDetail</code> property.
  	*/
	@Transient
	private ExchangeRateDto exchangeRateDetail;

	/**
	 * @return the eAWBIndicator
	 */
	public Boolean geteAWBIndicator() {
		return eAWBIndicator;
	}

	/**
	 * @param eAWBIndicator the eAWBIndicator to set
	 */
	public void seteAWBIndicator(Boolean eAWBIndicator) {
		this.eAWBIndicator = eAWBIndicator;
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
	 * @return the exchangeRateDetail
	 */
	public ExchangeRateDto getExchangeRateDetail() {
		return exchangeRateDetail;
	}

	/**
	 * @param exchangeRateDetail the exchangeRateDetail to set
	 */
	public void setExchangeRateDetail(ExchangeRateDto exchangeRateDetail) {
		this.exchangeRateDetail = exchangeRateDetail;
	}

	/**
     * Gets the <code>hostExchangeRateDetail</code> property.
     * <p>
     * 
     * @return the current value of the <code>hostExchangeRateDetail</code> property.<br>
     */
	/*public ExchangeRateDetail getExchangeRateDetail() {
		if (!StringUtility.isEmpty(this.hostExchangeRate)) {
			this.exchangeRateDetail = ExchangeRateDetailUtility
					.getExchangeRateDetail(this.hostExchangeRate);

		}
		return this.exchangeRateDetail;
	}*/

	/**
     * Sets the <code>hostExchangeRateDetail</code> property.
     * <p>
     * 
     * @param pHostExchangeRateDetail
     *            the new value of the <code>hostExchangeRateDetail</code> property.
     */
	/*public void setExchangeRateDetail(
			final ExchangeRateDetail pExchangeRateDetail) {
		this.exchangeRateDetail = pExchangeRateDetail;
	}*/
     
}
