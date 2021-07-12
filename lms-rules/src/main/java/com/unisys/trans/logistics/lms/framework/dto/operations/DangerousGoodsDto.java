/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.DGWeightType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.UNIDType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.UnitOfQuantityType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>DangerousGoodsDto</code> class represents the DangerousGoods
 * information.
 * 
 */
public class DangerousGoodsDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>accessibilityIndicator</code> property.
     */
    private String accessibilityIndicator;

    /**
     * Attribute to hold <code>actionType</code> property.
     */
    private ActionType actionType;

    /**
     * Attribute to hold <code>overpackNewInd</code> property.
     */
    private boolean apioNewInd;

    private Integer apioNumber;

    /**
     * Attribute to hold <code>apioOverpackSupplementaryInfo</code> property.
     */
    private String apioOverpackSupplementaryInfo;

    private Integer apioPieces;

    /**
     * Attribute to hold <code>aWBOid</code> property.
     */
    private Long aWBOid;

    /**
     * Attribute to hold <code>cargoOnlyIndicator</code> property.
     */
    private Boolean cargoOnlyIndicator;

    /**
     * Attribute to hold <code>classCode</code> property.
     */
    private String classCode;

    /**
     * Attribute to hold <code>createInd<code> property
     */
    private Boolean createInd = false;

    /**
     * Attribute to hold <code>createIndicator</code> property.
     */
    private boolean createIndicator;

    /**
     * Attribute to hold <code>dangerousPieces</code> property.
     */
    private Integer dangerousPieces;

    /**
     * Attribute to hold <code>deleteInd<code> property
     */
    private Boolean deleteInd = false;

    /**
     * Attribute to hold <code>deleteIndicator</code> property.
     */
    private boolean deleteIndicator;

    /**
     * Attribute to hold <code>dgSerialNumber</code> property.
     */
    private String dgSerialNumber;

    /**
     * Attribute to hold <code>dGWeightType</code> property.
     */
    private DGWeightType dGWeightType;

    private float displayQValue;

    /**
     * Attribute to hold <code>division</code> property.
     */
    private String division;

    /**
     * Attribute to hold <code>drillCode</code> property.
     */
    private String drillCode;

    /**
     * Attribute to hold <code>drillSuffix</code> property.
     */
    private String drillSuffix;

    /**
     * Attribute to hold <code>error</code> property.
     */
    private boolean error;

    /**
     * Attribute to hold <code>exceptionPermissionRemarks</code> property.
     */
    private String exceptionPermissionRemarks;

    /**
     * Attribute to hold <code>flight</code> property.
     */
    private BaseFlightDto flight;

    /**
     * Attribute to hold <code>flightDate</code> property.
     */
    private Date flightDate;

    private Integer flightPieces;

    private boolean forceAssignAWB;

    private GoodsDto goodsDto;

    /**
     * Attribute to hold <code>maximumQuantity</code> property.
     */
    private BigDecimal maximumQuantity;

    /**
     * Attribute to hold <code>minimumQuantity</code> property.
     */
    private BigDecimal minimumQuantity;

    private boolean missingEntries;

    /**
     * Attribute to hold <code>nonHostAWBIndicator</code> property.
     */
    private boolean nonHostAWBIndicator;

    private String offloadStation;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>overpackNewInd</code> property.
     */
    private Boolean overpackNewInd;

    private Integer overpackNumber;

    private Integer overpackPieces;

    /**
     * Attribute to hold <code>packagingGroup</code> property.
     */
    private String packagingGroup;

    /**
     * Attribute to hold <code>packagingInstructions</code> property.
     */
    private String packagingInstructions;

    /**
     * Attribute to hold <code>packagingType</code> property.
     */
    private String packagingType;

    private boolean printIndicator;

    /**
     * Attribute to hold <code>properShippingName</code> property.
     */
    private String properShippingName;

    /**
     * Attribute to hold <code>properShippingNameToDisplay</code> property.
     */
    private String properShippingNameToDisplay;

    /**
     * Attribute to hold <code>quantityIndicator<code> property
     */
    private boolean quantityIndicator;

    /**
     * Attribute to hold <code>quantityPerPiece</code> property.
     */
    private BigDecimal quantityPerPiece;

    /**
     * Attribute to hold <code>quantityToDisplay</code> property.
     */
    private String quantityToDisplay;

    private Float qValue;

    /**
     * Attribute to hold <code>radioActiveActivity</code> property.
     */
    private String radioActiveActivity;

    /**
     * Attribute to hold <code>radioactiveCategory</code> property.
     */
    private String radioactiveCategory;

    /**
     * Attribute to hold <code>radioactiveHeight</code> property.
     */
    private BigDecimal radioactiveHeight;

    /**
     * Attribute to hold <code>radioactiveTransportIndex</code> property.
     */
    private BigDecimal radioactiveTransportIndex;

    /**
     * Attribute to hold <code>radioactiveUnitOfHeight</code> property.
     */
    private String radioactiveUnitOfHeight;

    private Float risk1;

    private Float risk2;

    private OperationFlightSegmentDto segmentDto;

    /**
     * Attribute to hold <code>selectedIndicator</code> property.
     */
    private boolean selectedIndicator;

    private ShipmentDto shipment;

    /**
     * Attribute to hold <code>shipperName</code> property.
     */
    private String shipperName;

    private List<String> specialHandlingCodes;

    private String subsidiaryRisks;

    /**
     * Attribute to hold <code>supplementaryInfo</code> property.
     */
    private String supplementaryInfo;

    /**
     * Attribute to hold <code>supplementaryInfoToDisplay</code> property.
     */
    private String supplementaryInfoToDisplay;

    /**
     * Attribute to hold <code>technicalName</code> property.
     */
    private String technicalName;

    /**
     * Attribute to hold <code>technicalNameToDisplay</code> property.
     */
    private String technicalNameToDisplay;

    /**
     * Attribute to hold <code>totalWeightToDisplay</code> property.
     */
    private String totalWeightToDisplay;

    /**
     * Attribute to hold <code>typeOfRecord</code> property.
     */
    private UNIDType typeOfRecord;

    private String uLDIdentifier;

    private String uLDLoadPosition;

    /**
     * Attribute to hold <code>unId</code> property.
     */
    private String unId;
    
    private Long unidMasterId;

    /**
     * Attribute to hold <code>unitOfQuantity</code> property.
     */
    private UnitOfQuantityType unitOfQuantity;

    /**
     * Attribute to hold <code>updateInd<code> property
     */
    private Boolean updateInd = false;

    /**
     * Attribute to hold <code>updateIndicator</code> property.
     */
    private boolean updateIndicator;

    /**
     * Gets the <code>AccessibilityIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>AccessibilityIndicator</code> property.<br>
     */
    public String getAccessibilityIndicator() {
        return this.accessibilityIndicator;
    }

    /**
     * Gets the <code>ActionType</code> property.
     * <p>
     * 
     * @return the current value of the <code>ActionType</code> property.<br>
     */
    public ActionType getActionType() {
        return this.actionType;
    }

    public boolean isApioNewInd() {
        return this.apioNewInd;
    }

    public Integer getApioNumber() {
        return this.apioNumber;
    }

    /**
     * Gets the <code>apioOverpackSupplementaryInfo</code> property.
     * <p>
     * 
     * @return the current value of the <code>apioOverpackSupplementaryInfo</code> property.<br>
     */
    public String getApioOverpackSupplementaryInfo() {
        return this.apioOverpackSupplementaryInfo;
    }

    public Integer getApioPieces() {
        return this.apioPieces;
    }

    public Long getaWBOid() {
        return this.aWBOid;
    }

    /**
     * Gets the <code>CargoOnlyIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>CargoOnlyIndicator</code> property.<br>
     */
    public Boolean getCargoOnlyIndicator() {
        return this.cargoOnlyIndicator;
    }

    /**
     * Gets the <code>ClassCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>ClassCode</code> property.<br>
     */
    public String getClassCode() {
        return this.classCode;
    }

    /**
     * Gets the <code>DangerousPieces</code> property.
     * <p>
     * 
     * @return the current value of the <code>DangerousPieces</code> property.<br>
     */
    public Integer getDangerousPieces() {
        return this.dangerousPieces;
    }


    /**
     * Gets the <code>AccessibilityIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>AccessibilityIndicator</code> property.<br>
     */
    public String getdgSerialNumber() {
        return this.dgSerialNumber;
    }

    /**
     * Gets the <code>dGWeightType</code> property.
     * <p>
     * 
     * @return the current value of the <code>dGWeightType</code> property.<br>
     */
    public DGWeightType getdGWeightType() {
        return this.dGWeightType;
    }

    /**
     * Gets the <code>DGWeightType</code> property.
     * <p>
     * 
     * @return the current value of the <code>DGWeightType</code> property.<br>
     */
    public DGWeightType getDGWeightType() {
        return this.dGWeightType;
    }

    /**
     * Gets the <code>displayQValue</code> property.
     * <p>
     * 
     * @return the current value of the <code>displayQValue</code> property.<br>
     */
    public float getDisplayQValue() {
        return this.displayQValue;
    }

    /**
     * Gets the <code>Division</code> property.
     * <p>
     * 
     * @return the current value of the <code>Division</code> property.<br>
     */
    public String getDivision() {
        return this.division;
    }

    /**
     * Gets the <code>DrillCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>DrillCode</code> property.<br>
     */
    public String getDrillCode() {
        return this.drillCode;
    }

    /**
     * Gets the <code>DrillSuffix</code> property.
     * <p>
     * 
     * @return the current value of the <code>DrillSuffix</code> property.<br>
     */
    public String getDrillSuffix() {
        return this.drillSuffix;
    }

    /**
     * Gets the <code>error</code> property.
     * <p>
     * 
     * @return the current value of the <code>error</code> property.<br>
     */
    public boolean getError() {
        return this.error;
    }

    /**
     * Gets the <code>ExceptionPermissionRemarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>ExceptionPermissionRemarks</code> property.<br>
     */
    public String getExceptionPermissionRemarks() {
        return this.exceptionPermissionRemarks;
    }

    /**
     * Gets the <code>Flight</code> property.
     * <p>
     * 
     * @return the current value of the <code>Flight</code> property.<br>
     */
    public BaseFlightDto getFlight() {
        return this.flight;
    }

    /**
     * Gets the <code>FlightDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>FlightDate</code> property.<br>
     */
    public Date getFlightDate() {
        if(flightDate!=null){
            return (Date)flightDate.clone();
            }
            else{
                return null;
            }
    }

    public Integer getFlightPieces() {
        return this.flightPieces;
    }

    public GoodsDto getGoodsDto() {
        if (this.goodsDto == null) {

            this.goodsDto = new GoodsDto();
        }

        return this.goodsDto;
    }

    /**
     * Gets the <code>MaximumQuantity</code> property.
     * <p>
     * 
     * @return the current value of the <code>MaximumQuantity</code> property.<br>
     */
    public BigDecimal getMaximumQuantity() {
        return this.maximumQuantity;
    }

    /**
     * Gets the <code>MinimumQuantity</code> property.
     * <p>
     * 
     * @return the current value of the <code>MinimumQuantity</code> property.<br>
     */
    public BigDecimal getMinimumQuantity() {
        return this.minimumQuantity;
    }

    /**
     * Gets the value of the <code>offloadStation</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>offloadStation</code> property.
     */
    public String getOffloadStation() {
        return this.offloadStation;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getoId() {
        return this.oId;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>OId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    public Boolean getOverpackNewInd() {
        this.overpackNewInd = Boolean.FALSE;
        if (this.getOverpackNumber() != null && this.getOverpackPieces() != null) {
            this.overpackNewInd = Boolean.TRUE;
        }
        return this.overpackNewInd;
    }

    public Integer getOverpackNumber() {
        return this.overpackNumber;
    }

    public Integer getOverpackPieces() {
        return this.overpackPieces;
    }

    /**
     * Gets the <code>PackagingGroup</code> property.
     * <p>
     * 
     * @return the current value of the <code>PackagingGroup</code> property.<br>
     */
    public String getPackagingGroup() {
        return this.packagingGroup;
    }

    /**
     * Gets the <code>PackagingInstructions</code> property.
     * <p>
     * 
     * @return the current value of the <code>PackagingInstructions</code> property.<br>
     */
    public String getPackagingInstructions() {
        return this.packagingInstructions;
    }

    /**
     * Gets the <code>PackagingType</code> property.
     * <p>
     * 
     * @return the current value of the <code>PackagingType</code> property.<br>
     */
    public String getPackagingType() {
        return this.packagingType;
    }

    /**
     * Gets the value of the <code>properShippingName</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>properShippingName</code> property.
     */
    public String getProperShippingName() {
        return this.properShippingName;
    }

    /**
     * Gets the value of the <code>properShippingNameToDisplay</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>properShippingNameToDisplay</code> property.
     */
    public String getProperShippingNameToDisplay() {
        return this.properShippingNameToDisplay;
    }

    /**
     * Gets the <code>QuantityPerPiece</code> property.
     * <p>
     * 
     * @return the current value of the <code>QuantityPerPiece</code> property.<br>
     */
    public BigDecimal getQuantityPerPiece() {
        return this.quantityPerPiece;
    }

    /**
     * Gets the <code>quantityToDisplay</code> property.
     * <p>
     * 
     * @return the current value of the <code>quantityToDisplay</code> property.<br>
     */
    public String getQuantityToDisplay() {
        return this.quantityToDisplay;
    }

    public Float getqValue() {
        return this.qValue;
    }

    /**
     * Gets the <code>RadioActiveActivity</code> property.
     * <p>
     * 
     * @return the current value of the <code>RadioActiveActivity</code> property.<br>
     */
    public String getRadioActiveActivity() {
        return this.radioActiveActivity;
    }

    /**
     * Gets the <code>RadioactiveCategory</code> property.
     * <p>
     * 
     * @return the current value of the <code>RadioactiveCategory</code> property.<br>
     */
    public String getRadioactiveCategory() {
        return this.radioactiveCategory;
    }

    /**
     * Gets the <code>RadioactiveHeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>RadioactiveHeight</code> property.<br>
     */
    public BigDecimal getRadioactiveHeight() {
        return this.radioactiveHeight;
    }

    /**
     * Gets the <code>RadioactiveTransportIndex</code> property.
     * <p>
     * 
     * @return the current value of the <code>RadioactiveTransportIndex</code> property.<br>
     */
    public BigDecimal getRadioactiveTransportIndex() {
        return this.radioactiveTransportIndex;
    }

    /**
     * Gets the <code>RadioactiveUnitOfHeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>RadioactiveUnitOfHeight</code> property.<br>
     */
    public String getRadioactiveUnitOfHeight() {
        return this.radioactiveUnitOfHeight;
    }

    public Float getRisk1() {
        return this.risk1;
    }

    public Float getRisk2() {
        return this.risk2;
    }

    /**
     * Gets the value of the <code>segmentDto</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>segmentDto</code> property.
     */
    public OperationFlightSegmentDto getSegmentDto() {

        if (this.segmentDto == null) {
            this.segmentDto = new OperationFlightSegmentDto();
        }
        return this.segmentDto;
    }

    public ShipmentDto getShipment() {

        if (this.shipment == null) {
            this.shipment = new ShipmentDto();
        }
        return this.shipment;
    }

    /**
     * Gets the <code>ShipperName</code> property.
     * <p>
     * 
     * @return the current value of the <code>ShipperName</code> property.<br>
     */
    public String getShipperName() {
        return this.shipperName;
    }

    /**
     * Gets the value of the <code>specialHandlingCodes</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>specialHandlingCodes</code> property.
     */
    public List<String> getSpecialHandlingCodes() {
        return this.specialHandlingCodes;
    }

    public String getSubsidiaryRisks() {
        return this.subsidiaryRisks;
    }

    /**
     * Gets the <code>SupplementaryInfo</code> property.
     * <p>
     * 
     * @return the current value of the <code>SupplementaryInfo</code> property.<br>
     */
    public String getSupplementaryInfo() {
        return this.supplementaryInfo;
    }

    /**
     * Gets the <code>supplementaryInfoToDisplay</code> property.
     * <p>
     * 
     * @return the current value of the <code>supplementaryInfoToDisplay</code> property.<br>
     */
    public String getSupplementaryInfoToDisplay() {
        return this.supplementaryInfoToDisplay;
    }

    /**
     * Gets the <code>TechnicalName</code> property.
     * <p>
     * 
     * @return the current value of the <code>TechnicalName</code> property.<br>
     */
    public String getTechnicalName() {
        return this.technicalName;
    }

    /**
     * Gets the <code>technicalNameToDisplay</code> property.
     * <p>
     * 
     * @return the current value of the <code>technicalNameToDisplay</code> property.<br>
     */
    public String getTechnicalNameToDisplay() {
        return this.technicalNameToDisplay;
    }

    /**
     * Gets the <code>totalWeightToDisplay</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalWeightToDisplay</code> property.<br>
     */
    public String getTotalWeightToDisplay() {
        return this.totalWeightToDisplay;
    }

    /**
     * Gets the <code>TypeOfRecord</code> property.
     * <p>
     * 
     * @return the current value of the <code>TypeOfRecord</code> property.<br>
     */
    public UNIDType getTypeOfRecord() {
        return this.typeOfRecord;
    }

    public String getuLDIdentifier() {
        return this.uLDIdentifier;
    }

    public String getuLDLoadPosition() {
        return this.uLDLoadPosition;
    }

    /**
     * Gets the value of the <code>unId</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>unId</code> property.
     */
    public String getUnId() {
        return this.unId;
    }

    /**
     * Gets the <code>UnitOfQuantity</code> property.
     * <p>
     * 
     * @return the current value of the <code>UnitOfQuantity</code> property.<br>
     */
    public UnitOfQuantityType getUnitOfQuantity() {
        return this.unitOfQuantity;
    }


    /**
     * Gets the <code>createInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>createInd</code> property.<br>
     */
    public Boolean isCreateInd() {
        return this.createInd;
    }

    public boolean isCreateIndicator() {
        return this.createIndicator;
    }

    /**
     * Gets the <code>deleteInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>deleteInd</code> property.<br>
     */
    public Boolean isDeleteInd() {
        return this.deleteInd;
    }

    public boolean isDeleteIndicator() {
        return this.deleteIndicator;
    }

    public boolean isForceAssignAWB() {
        return this.forceAssignAWB;
    }

    public boolean isMissingEntries() {
        return this.missingEntries;
    }

    public boolean isNonHostAWBIndicator() {
        return this.nonHostAWBIndicator;
    }

    /**
     * Gets the value of the <code>printIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>printIndicator</code> property.
     */
    public boolean isPrintIndicator() {
        return this.printIndicator;
    }

    /**
     * Gets the <code>quantityIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>quantityIndicator</code> property.<br>
     */
    public boolean isQuantityIndicator() {
        return this.quantityIndicator;
    }

    public boolean isSelectedIndicator() {
        return this.selectedIndicator;
    }

    /**
     * Gets the <code>updateInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>updateInd</code> property.<br>
     */
    public Boolean isUpdateInd() {
        return this.updateInd;
    }

    public boolean isUpdateIndicator() {
        return this.updateIndicator;
    }

    /**
     * Sets the <code>AccessibilityIndicator</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>AccessibilityIndicator</code> property.<br>
     */
    public void setAccessibilityIndicator(final String pAccessibilityIndicator) {
        this.accessibilityIndicator = ContractUtility.convertToUpperCase(pAccessibilityIndicator);
    }

    /**
     * Sets the <code>ActionType</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ActionType</code> property.<br>
     */
    public void setActionType(final ActionType actionType) {
        this.actionType = actionType;
    }

    public void setApioNewInd(final boolean pApioNewInd) {
        this.apioNewInd = pApioNewInd;
    }

    public void setApioNumber(final Integer apioNumber) {
        this.apioNumber = apioNumber;
    }

    /**
     * Sets the <code>apioOverpackSupplementaryInfo</code> property.
     * <p>
     * 
     * @param pSupplementaryInfoToDisplay
     *            the current value of the <code>apioOverpackSupplementaryInfo</code> property.<br>
     */
    public void setApioOverpackSupplementaryInfo(final String pApioOverpackSupplementaryInfo) {
        this.apioOverpackSupplementaryInfo = ContractUtility.convertToUpperCase(pApioOverpackSupplementaryInfo);
    }

    public void setApioPieces(final Integer apioPieces) {
        this.apioPieces = apioPieces;
    }

    public void setaWBOid(final Long pAWBOid) {
        this.aWBOid = pAWBOid;
    }

    /**
     * Sets the <code>CargoOnlyIndicator</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>CargoOnlyIndicator</code> property.<br>
     */
    public void setCargoOnlyIndicator(final Boolean pCargoOnlyIndicator) {
        this.cargoOnlyIndicator = pCargoOnlyIndicator;
    }

    /**
     * Sets the <code>ClassCode</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ClassCode</code> property.<br>
     */
    public void setClassCode(final String pClassCode) {
        this.classCode = ContractUtility.convertToUpperCase(pClassCode);
    }

    /**
     * Sets the <code>createInd</code> property.
     * <p>
     * 
     * @param createInd
     *            the current value of the <code>createInd</code> property.<br>
     */
    public void setCreateInd(final Boolean createInd) {
        this.createInd = createInd;
    }

    public void setCreateIndicator(final boolean pCreateIndicator) {
        this.createIndicator = pCreateIndicator;
    }

    /**
     * Sets the <code>DangerousPieces</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>DangerousPieces</code> property.<br>
     */
    public void setDangerousPieces(final Integer pDangerousPieces) {
        this.dangerousPieces = pDangerousPieces;
    }

    /**
     * Sets the <code>deleteInd</code> property.
     * <p>
     * 
     * @param deleteInd
     *            the current value of the <code>deleteInd</code> property.<br>
     */
    public void setDeleteInd(final Boolean deleteInd) {
        this.deleteInd = deleteInd;
    }

    public void setDeleteIndicator(final boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the <code>dgSerialNumber</code> property.
     * <p>
     * 
     * @param pDgSerialNumber
     *            the current value of the <code>dgSerialNumber</code> property.<br>
     */
    public void setDgSerialNumber(final String pDgSerialNumber) {
        this.dgSerialNumber = ContractUtility.convertToUpperCase(pDgSerialNumber);
    }

    /**
     * Sets the <code>dGWeightType</code> property.
     * <p>
     * 
     * @param dGWeightType
     *            the current value of the <code>dGWeightType</code> property.<br>
     */
    public void setdGWeightType(final DGWeightType dGWeightType) {
        this.dGWeightType = dGWeightType;
    }

    /**
     * Sets the <code>DGWeightType</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>DGWeightType</code> property.<br>
     */
    public void setDGWeightType(final DGWeightType pDGWeightType) {
        this.dGWeightType = pDGWeightType;
    }

    /**
     * Sets the <code>displayQValue</code> property.
     * <p>
     * 
     * @param pDisplayQValue
     *            the current value of the <code>displayQValue</code> property.<br>
     */
    public void setDisplayQValue(final float pDisplayQValue) {
        this.displayQValue = pDisplayQValue;
    }

    /**
     * Sets the <code>Division</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>Division</code> property.<br>
     */
    public void setDivision(final String pDivision) {
        this.division = ContractUtility.convertToUpperCase(pDivision);
    }

    /**
     * Sets the <code>DrillCode</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>DrillCode</code> property.<br>
     */
    public void setDrillCode(final String pDrillCode) {
        this.drillCode = ContractUtility.convertToUpperCase(pDrillCode);
    }

    /**
     * Sets the <code>DrillSuffix</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>DrillSuffix</code> property.<br>
     */
    public void setDrillSuffix(final String pDrillSuffix) {
        this.drillSuffix = ContractUtility.convertToUpperCase(pDrillSuffix);
    }

    /**
     * Sets the <code>error</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>error</code> property.<br>
     */
    public void setError(final boolean error) {
        this.error = error;
    }

    /**
     * Sets the <code>ExceptionPermissionRemarks</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ExceptionPermissionRemarks</code> property.<br>
     */
    public void setExceptionPermissionRemarks(
                final String pExceptionPermissionRemarks) {
        this.exceptionPermissionRemarks = pExceptionPermissionRemarks;
    }

    /**
     * Sets the <code>Flight</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>Flight</code> property.<br>
     */
    public void setFlight(final BaseFlightDto pFlight) {
        this.flight = pFlight;
    }

    /**
     * Sets the <code>FlightDate</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>FlightDate</code> property.<br>
     */
    public void setFlightDate(final Date pFlightDate) {
        if(pFlightDate!=null){
        	this.flightDate =(Date) pFlightDate.clone();
          }
        else
        {
        	this.flightDate=null;
        }
    }

    public void setFlightPieces(final Integer pFlightPieces) {
        this.flightPieces = pFlightPieces;
    }

    public void setForceAssignAWB(final boolean forceAssignAWB) {
        this.forceAssignAWB = forceAssignAWB;
    }

    public void setGoodsDto(final GoodsDto goodsDto) {
        this.goodsDto = goodsDto;
    }

    /**
     * Sets the <code>MaximumQuantity</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>MaximumQuantity</code> property.<br>
     */
    public void setMaximumQuantity(final BigDecimal pMaximumQuantity) {
        this.maximumQuantity = pMaximumQuantity;
    }

    /**
     * Sets the <code>MinimumQuantity</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>MinimumQuantity</code> property.<br>
     */
    public void setMinimumQuantity(final BigDecimal pMinimumQuantity) {
        this.minimumQuantity = pMinimumQuantity;
    }

    public void setMissingEntries(final boolean missingEntries) {
        this.missingEntries = missingEntries;
    }

    public void setNonHostAWBIndicator(final boolean pNonHostAWBIndicator) {
        this.nonHostAWBIndicator = pNonHostAWBIndicator;
    }

    /**
     * Sets the value of the <code>offloadStation</code> property.
     * <p>
     * 
     * @param <code>offloadStation</code> Holds the new value of the <code>offloadStation</code> property.
     */
    public void setOffloadStation(final String pOffloadStation) {
        this.offloadStation = ContractUtility.convertToUpperCase(pOffloadStation);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param oId
     *            the current value of the <code>oId</code> property.<br>
     */
    public void setoId(final Long oId) {
        this.oId = oId;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>OId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    public void setOverpackNewInd(final Boolean pOverpackNewInd) {
        this.overpackNewInd = pOverpackNewInd;
    }

    public void setOverpackNumber(final Integer overpackNumber) {
        this.overpackNumber = overpackNumber;
    }

    public void setOverpackPieces(final Integer overpackPieces) {
        this.overpackPieces = overpackPieces;
    }

    /**
     * Sets the <code>PackagingGroup</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>PackagingGroup</code> property.<br>
     */
    public void setPackagingGroup(final String pPackagingGroup) {
        this.packagingGroup = ContractUtility.convertToUpperCase(pPackagingGroup);
    }

    /**
     * Sets the <code>PackagingInstructions</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>PackagingInstructions</code> property.<br>
     */
    public void setPackagingInstructions(final String pPackagingInstructions) {
        this.packagingInstructions = ContractUtility.convertToUpperCase(pPackagingInstructions);
    }

    /**
     * Sets the <code>PackagingType</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>PackagingType</code> property.<br>
     */
    public void setPackagingType(final String pPackagingType) {
        this.packagingType = ContractUtility.convertToUpperCase(pPackagingType);
    }

    /**
     * Sets the value of the <code>printIndicator</code> property.
     * <p>
     * 
     * @param <code>printIndicator</code> Holds the new value of the <code>printIndicator</code> property.
     */
    public void setPrintIndicator(final boolean printIndicator) {
        this.printIndicator = printIndicator;
    }

    /**
     * Sets the value of the <code>properShippingName</code> property.
     * <p>
     * 
     * @param <code>properShippingName</code> Holds the new value of the <code>properShippingName</code>
     *        property.
     */
    public void setProperShippingName(final String properShippingName) {
        this.properShippingName = properShippingName;
    }

    /**
     * Sets the value of the <code>properShippingNameToDisplay</code> property.
     * <p>
     * 
     * @param <code>pProperShippingNameToDisplay</code> Holds the new value of the
     *        <code>properShippingNameToDisplay</code> property.
     */
    public void setProperShippingNameToDisplay(final String pProperShippingNameToDisplay) {
        this.properShippingNameToDisplay = pProperShippingNameToDisplay;
    }

    /**
     * Gets the <code>quantityIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>pQuantityIndicator</code> property.<br>
     */
    public void setQuantityIndicator(final boolean pQuantityIndicator) {
        this.quantityIndicator = pQuantityIndicator;
    }

    /**
     * Sets the <code>QuantityPerPiece</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>QuantityPerPiece</code> property.<br>
     */
    public void setQuantityPerPiece(final BigDecimal pQuantityPerPiece) {
        this.quantityPerPiece = pQuantityPerPiece;
    }

    /**
     * Sets the <code>quantityToDisplay</code> property.
     * <p>
     * 
     * @param pQuantityToDisplay
     *            the current value of the <code>quantityToDisplay</code> property.<br>
     */
    public void setQuantityToDisplay(final String pQuantityToDisplay) {
        this.quantityToDisplay = pQuantityToDisplay;
    }

    public void setqValue(final Float qValue) {
        this.qValue = qValue;
    }

    /**
     * Sets the <code>RadioActiveActivity</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>RadioActiveActivity</code> property.<br>
     */
    public void setRadioActiveActivity(final String pRadioActiveActivity) {
        this.radioActiveActivity = pRadioActiveActivity;
    }

    /**
     * Sets the <code>RadioactiveCategory</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>RadioactiveCategory</code> property.<br>
     */
    public void setRadioactiveCategory(final String pRadioactiveCategory) {
        this.radioactiveCategory = pRadioactiveCategory;
    }

    /**
     * Sets the <code>RadioactiveHeight</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>RadioactiveHeight</code> property.<br>
     */
    public void setRadioactiveHeight(final BigDecimal pRadioactiveHeight) {
        this.radioactiveHeight = pRadioactiveHeight;
    }

    /**
     * Sets the <code>RadioactiveTransportIndex</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>RadioactiveTransportIndex</code> property.<br>
     */
    public void setRadioactiveTransportIndex(
                final BigDecimal pRadioactiveTransportIndex) {
        this.radioactiveTransportIndex = pRadioactiveTransportIndex;
    }

    /**
     * Sets the <code>RadioactiveUnitOfHeight</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>RadioactiveUnitOfHeight</code> property.<br>
     */
    public void setRadioactiveUnitOfHeight(final String pRadioactiveUnitOfHeight) {
        this.radioactiveUnitOfHeight = pRadioactiveUnitOfHeight;
    }

    public void setRisk1(final Float risk1) {
        this.risk1 = risk1;
    }

    public void setRisk2(final Float risk2) {
        this.risk2 = risk2;
    }

    /**
     * Sets the value of the <code>segmentDto</code> property.
     * <p>
     * 
     * @param <code>segmentDto</code> Holds the new value of the <code>segmentDto</code> property.
     */
    public void setSegmentDto(final OperationFlightSegmentDto segmentDto) {
        this.segmentDto = segmentDto;
    }

    public void setSelectedIndicator(final boolean pSelectedIndicator) {
        this.selectedIndicator = pSelectedIndicator;
    }

    public void setShipment(final ShipmentDto shipment) {
        this.shipment = shipment;
    }

    /**
     * Sets the <code>ShipperName</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ShipperName</code> property.<br>
     */
    public void setShipperName(final String pShipperName) {
        this.shipperName = pShipperName;
    }

    /**
     * Sets the value of the <code>specialHandlingCodes</code> property.
     * <p>
     * 
     * @param <code>specialHandlingCodes</code> Holds the new value of the <code>specialHandlingCodes</code>
     *        property.
     */
    public void setSpecialHandlingCodes(final List<String> specialHandlingCodes) {
        this.specialHandlingCodes = specialHandlingCodes;
    }

    public void setSubsidiaryRisks(final String subsidiaryRisks) {
        this.subsidiaryRisks = subsidiaryRisks;
    }

    /**
     * Sets the <code>SupplementaryInfo</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>SupplementaryInfo</code> property.<br>
     */
    public void setSupplementaryInfo(final String pSupplementaryInfo) {
        this.supplementaryInfo = pSupplementaryInfo;
    }

    /**
     * Sets the <code>supplementaryInfoToDisplay</code> property.
     * <p>
     * 
     * @param pSupplementaryInfoToDisplay
     *            the current value of the <code>supplementaryInfoToDisplay</code> property.<br>
     */
    public void setSupplementaryInfoToDisplay(final String pSupplementaryInfoToDisplay) {
        this.supplementaryInfoToDisplay = pSupplementaryInfoToDisplay;
    }

    /**
     * Sets the <code>TechnicalName</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>TechnicalName</code> property.<br>
     */
    public void setTechnicalName(final String pTechnicalName) {
        this.technicalName = pTechnicalName;
    }

    /**
     * Sets the <code>technicalNameToDisplay</code> property.
     * <p>
     * 
     * @param pTechnicalNameToDisplay
     *            the current value of the <code>technicalNameToDisplay</code> property.<br>
     */
    public void setTechnicalNameToDisplay(final String pTechnicalNameToDisplay) {
        this.technicalNameToDisplay = pTechnicalNameToDisplay;
    }

    /**
     * Sets the <code>totalWeightToDisplay</code> property.
     * <p>
     * 
     * @param pTotalWeightToDisplay
     *            the current value of the <code>totalWeightToDisplay</code> property.<br>
     */
    public void setTotalWeightToDisplay(final String pTotalWeightToDisplay) {
        this.totalWeightToDisplay = pTotalWeightToDisplay;
    }

    /**
     * Sets the <code>TypeOfRecord</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>TypeOfRecord</code> property.<br>
     */
    public void setTypeOfRecord(final UNIDType pTypeOfRecord) {
        this.typeOfRecord = pTypeOfRecord;
    }

    public void setuLDIdentifier(final String uLDIdentifier) {
        this.uLDIdentifier = ContractUtility.convertToUpperCase(uLDIdentifier);
    }

    public void setuLDLoadPosition(final String uLDLoadPosition) {
        this.uLDLoadPosition = ContractUtility.convertToUpperCase(uLDLoadPosition);
    }

    /**
     * Sets the value of the <code>unId</code> property.
     * <p>
     * 
     * @param <code>unId</code> Holds the new value of the <code>unId</code> property.
     */
    public void setUnId(final String unId) {
        this.unId = ContractUtility.convertToUpperCase(unId);
    }

    /**
     * Sets the <code>UnitOfQuantity</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>UnitOfQuantity</code> property.<br>
     */
    public void setUnitOfQuantity(final UnitOfQuantityType pUnitOfQuantity) {
        this.unitOfQuantity = pUnitOfQuantity;
    }

    /**
     * Sets the <code>updateInd</code> property.
     * <p>
     * 
     * @param updateInd
     *            the current value of the <code>updateInd</code> property.<br>
     */
    public void setUpdateInd(final Boolean updateInd) {
        this.updateInd = updateInd;
    }

    public void setUpdateIndicator(final boolean pUpdateIndicator) {
        this.updateIndicator = pUpdateIndicator;
    }

    public Long getUnidMasterId() {
        return unidMasterId;
    }

    public void setUnidMasterId(Long unidMasterId) {
        this.unidMasterId = unidMasterId;
    }

}
