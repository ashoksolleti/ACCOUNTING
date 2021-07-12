package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.constants.AWBPaycodeType;
import com.unisys.trans.logistics.lms.framework.constants.InbondStatusType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.constants.CompletedHAWBCreationSourceType;
import com.unisys.trans.logistics.lms.framework.dto.constants.HouseAirWaybillCreateSourceType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>HouseAirwaybillDto</code> is used for find HouseAirwaybill information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>HouseAirwaybillNumber
 * <li>airWaybillNumber
 * <li>awbDestinationIataRegion
 * <li>awbDetail
 * <li>booking
 * <li>bookingSegment
 * <li>charge
 * <li>commodityCode
 * <li>createdDate
 * <li>customerSegmentation
 * <li>destination
 * <li>executionDateTime
 * <li>houseAirwaybills
 * <li>identifier
 * <li>numberOfPages
 * <li>oId
 * <li>origin
 * <li>otherCharges
 * <li>padType
 * <li>participants
 * <li>productCode
 * <li>productQueueServiceLevel
 * <li>rateEntries
 * <li>revenue
 * <li>routes
 * <li>shipmentStatusEntries
 * <li>specialHandlingCodes
 * <li>splCodes
 * <li>status
 * <li>transfer
 * <li>userAudit
 * <li>userIdentifier
 * <li>routes
 * <li>shipmentStatusEntries
 * <li>specialHandlingCodes
 * <li>purposeCode
 * </ul>
 */
public class HouseAWBDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3074496136563043353L;

    /**
     * Attribute to hold the <code>airWaybillNumber</code> property.
     */
    private AirWaybillNumberDto airWaybillNumber;
    
    private Long awbOid;

    /**
	 * @return the awbOid
	 */
	public Long getAwbOid() {
		return awbOid;
	}

	/**
	 * @param awbOid the awbOid to set
	 */
	public void setAwbOid(Long awbOid) {
		this.awbOid = awbOid;
	}

	/**
     * Attribute to hold the <code>hawbCustomsInformation</code> property.
     */
    private HAWBCustomsInformationDto hawbCustomsInformation;
    
    /**
     * Attribute to hold <code>message</code> property.
     */
    private String message;
    
    private String teleTypeAddress;
    
    private boolean autoAssociateflag;
    
    private String airwaybillOrigin;
    
    private String airwaybillOriginCurrency;
    
    private String houseAWbImportCustomsStatus;
    
    /** 
     * Attribute to hold <code>uniqueTaxIdentificationCode (CUIT)</code> property.
     */
    private String uniqueTaxIdentificationCode;//HIS019 UC026
    
    private String cuitOrTrinPrefix;//HIS019 && AC426G
    
    /**
     * Attribute to hold the <code>splswithColorCodes</code> property.
     */
    private Map<String, String> splswithColorCodes = new HashMap<String, String>();
    
    public String getAirwaybillOrigin() {
        return this.airwaybillOrigin;
    }

    public void setAirwaybillOrigin(String pAirwaybillOrigin) {
        this.airwaybillOrigin = pAirwaybillOrigin;
    }

    public String getHouseAWbImportCustomsStatus() {
        return houseAWbImportCustomsStatus;
    }

    public void setHouseAWbImportCustomsStatus(String houseAWbImportCustomsStatus) {
        this.houseAWbImportCustomsStatus = houseAWbImportCustomsStatus;
    }

    public String getAirwaybillDestination() {
        return this.airwaybillDestination;
    }

    public void setAirwaybillDestination(String pAirwaybillDestination) {
        this.airwaybillDestination = pAirwaybillDestination;
    }

    private String airwaybillDestination;
    
    private String airwaybillDestinationCurrency;

    

	public String getAirwaybillOriginCurrency() {
        return this.airwaybillOriginCurrency;
    }

    public void setAirwaybillOriginCurrency(String pAirwaybillOriginCurrency) {
        this.airwaybillOriginCurrency = pAirwaybillOriginCurrency;
    }

    public String getAirwaybillDestinationCurrency() {
        return this.airwaybillDestinationCurrency;
    }

    public void setAirwaybillDestinationCurrency(String pAirwaybillDestinationCurrency) {
        this.airwaybillDestinationCurrency = pAirwaybillDestinationCurrency;
    }

    /**
	 * @return the autoAssociateflag
	 */
	public boolean isAutoAssociateflag() {
		return autoAssociateflag;
	}

	/**
	 * @param autoAssociateflag the autoAssociateflag to set
	 */
	public void setAutoAssociateflag(boolean autoAssociateflag) {
		this.autoAssociateflag = autoAssociateflag;
	}

	/**
     * Attribute to hold the <code>calculatedAmount</code> property.
     */
    private BigDecimal calculatedAmount;

    /**
     * Attribute to hold the <code>houseGoods</code> property.
     */
    private String houseGoods;

    /**
     * Attribute to hold the <code>purposeCodeXFZB</code> property.
     */
	private String purposeCodeXFZB;

    /**
     * Gets the <code>purposeCodeXFZB</code> property.
     * 
     * @return the current value of the <code>purposeCodeXFZB</code> property.
     */
    public String getPurposeCodeXFZB() {
        return this.purposeCodeXFZB;
    }

    /**
     * Sets the <code>purposeCodeXFZB</code> property.
     * 
     * @param pPurposeCodeXFZB
     *            the current value of the <code>purposeCodeXFZB</code> property.
     */
    public void setPurposeCodeXFZB(final String pPurposeCodeXFZB) {
        this.purposeCodeXFZB = pPurposeCodeXFZB;
    }

    /**
     * @return the calculatedAmount
     */
    public BigDecimal getCalculatedAmount() {
        return this.calculatedAmount;
    }

    /**
     * @param pCalculatedAmount
     *            the calculatedAmount to set
     */
    public void setCalculatedAmount(final BigDecimal pCalculatedAmount) {
        this.calculatedAmount = pCalculatedAmount;
    }

    /**
     * Attribute to hold <code>calculatedDays</code> property.
     */
    private String calculatedDays;

    /**
     * @return the calculatedDays
     */
    public String getCalculatedDays() {
        return this.calculatedDays;
    }

    /**
     * @param pCalculatedDays
     *            the calculatedDays to set
     */
    public void setCalculatedDays(final String pCalculatedDays) {
        this.calculatedDays = pCalculatedDays;
    }

    /**
     * Attribute to hold the <code>awbDeleteIndicator</code> property.
     */

    private String awbDeleteIndicator;

    /**
     * Attribute to hold the <code>awbDeletionInd</code> property.
     */

    private boolean awbDeletionInd;

    /**
     * Attribute to hold the <code>due</code> property.
     */
    private BigDecimal due;

    /**
     * @return the due
     */
    public BigDecimal getDue() {
        return this.due;
    }

    /**
     * @param pDue
     *            the due to set
     */
    public void setDue(final BigDecimal pDue) {
        this.due = pDue;
    }

    /**
     * Attribute to hold the <code>paidAmount</code> property.
     */
    private BigDecimal paidAmount;

    /**
     * @return the paidAmount
     */
    public BigDecimal getPaidAmount() {
        return this.paidAmount;
    }

    /**
     * @param pPaidAmount
     *            the paidAmount to set
     */
    public void setPaidAmount(final BigDecimal pPaidAmount) {
        this.paidAmount = pPaidAmount;
    }

    /**
     * Attribute to hold the <code>awbProductCode</code> property.
     */
    private String awbProductCode;

    /**
     * Attribute to hold the <code>description</code> property.
     */
    private String description;

    /**
     * Attribute to hold the <code>charge</code> property.
     */
    private HouseChargeDto charge;

    /**
     * Attribute to hold the <code>shpContactDetails</code> property.
     */
    private String shpContactDetails;

    /**
     * Attribute to hold the <code>cneContactDetails</code> property.
     */
    private String cneContactDetails;

    /**
     * Attribute to hold the <code> consignee</code> property.
     */
    private HouseAirWaybillParticipantDto consignee;

    /**
     * Attribute to holds <code>createdUserAudit</code> property.
     */

    private UserAuditDto createdUserAudit;

    /**
     * Attribute to holds <code>createorUpdateSource</code> property.
     */
    private HouseAirWaybillCreateSourceType createorUpdateSource;

    /**
     * Attribute to holds <code>creationSource</code> property.
     */
    private String creationSource;

    /**
     * Attribute to holds <code>crossReference1</code> property.
     */
    private String crossReference1;

    /**
     * Attribute to holds <code>crossReference2</code> property.
     */
    private String crossReference2;

    /**
     * Attribute to holds <code>crossReferenceIndicator1</code> property.
     */
    private String crossReferenceIndicator1;

    /**
     * Attribute to holds <code>crossReferenceIndicator2</code> property.
     */
    private String crossReferenceIndicator2;

    /**
     * Attribute to holds <code>customApplicationIndicator</code> property.
     */
    private int customApplicationIndicator;

    /**
     * Attribute to holds <code>customStation</code> property.
     */
    private String customStation;

    /**
     * Attribute to holds <code>customsValue</code> property.
     */
    private String customsValue;

    /**
     * Attribute to holds <code>customsValueCurrencyCode</code> property.
     */
    private String customsValueCurrencyCode;

    /**
     * Attribute to holds <code>declaredValue</code> property.
     */
    private String declaredValue;

    /**
     * Attribute to holds <code>deletedUserAudit</code> property.
     */
    private UserAuditDto deletedUserAudit;

    /**
     * Attribute to holds <code>deletionRemarks</code> property.
     */
    private String deletionRemarks;

    /**
     * Attribute to holds <code>destination</code> property.
     */
    private String destination;

    /**
     * Attribute to holds <code>destinationCurrency</code> property.
     */
    private String destinationCurrency;

    /**
     * Attribute to holds <code>executionDateTime</code> property.
     */
    private Date executionDateTime;

    /**
     * Attribute to holds <code>exportPaycode</code> property.
     */
    private AWBPaycodeType exportPaycode;

    /**
     * Attribute to hold <code>houseIdentifier</code> property.
     */
    private String houseIdentifier;

    /**
     * Attribute to holds <code>houseRemarks1</code> property.
     */
    private String houseRemarks2;

    /**
     * Attribute to holds <code>customsStationChangeAllowedIndicator</code> property.
     */

    private boolean customsStationChangeAllowedIndicator;

    /**
     * @return the housePaymentEntries
     */
    public List<HousePaymentEntryDto> getHousePaymentEntries() {
        return this.housePaymentEntries;
    }

    /**
     * @param pHousePaymentEntries
     *            the housePaymentEntries to set
     */
    public void setHousePaymentEntries(
                final List<HousePaymentEntryDto> pHousePaymentEntries) {
        this.housePaymentEntries = pHousePaymentEntries;
    }

    /**
     * Attribute to hold <code>housePaymentEntries</code> property.
     */
    private List<HousePaymentEntryDto> housePaymentEntries;

    /**
     * Attribute to holds <code>htsCodes</code> property.
     */

    private List<String> htsCodes;

    /**
     * Attribute to holds <code>importPaycode</code> property.
     */
    private AWBPaycodeType importPaycode;

    /**
     * Attribute to holds <code>inBondIndicator</code> property.
     */
    private String inBondIndicator;

    /**
     * Attribute to holds <code>insuranceCode</code> property.
     */
    private String insuranceCode;
    
   


    /**
     * Attribute to holds <code>insuranceValue</code> property.
     */
    private String insuranceValue;

    /**
     * Attribute to hold the <code>numberMisslaneous</code> property.
     */

    private int numberMisslaneous;
    
  

	private String status; 

    /**
     * @return the collect
     */
    public BigDecimal getCollect() {
        return this.collect;
    }

    /**
     * @param pCollect
     *            the collect to set
     */
    public void setCollect(final BigDecimal pCollect) {
        this.collect = pCollect;
    }

    /**
     * Attribute to hold <code>collect</code> property.
     */
    private BigDecimal collect;

    /**
     * Attribute to hold the <code>numberParticipantHawb</code> property.
     */

    private int numberParticipantHawb;

    /**
     * Attribute to hold the <code>numberRatingLines</code> property.
     */

    private int numberRatingLines;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>PostalCodeDto</code>. It is of type Long.
     */

    private Long oId;

    /**
     * Attribute to hold the <code>origin</code> property.
     */

    private String origin;

    /**
     * Attribute to hold the <code>originatedAsFhl</code> property.
     */

    private String originatedAsFhl;

    /**
     * Attribute to hold the <code>originCurrency</code> property.
     */

    private String originCurrency;

    /**
     * Attribute to hold the <code>creationSourceForCompletedHAWB</code> property.
     */
    private CompletedHAWBCreationSourceType creationSourceForCompletedHAWB;

    /**
     * Attribute to hold the list of OtherChargesDto <code> otherCharges</code> property.
     */
    private List<HouseOtherChargesDto> otherCharges;

    /**
     * Attribute to hold the list of AirWaybillParticipantDto <code> participants</code> property.
     */
    private List<HouseAirWaybillParticipantDto> participants;

    /**
     * Attribute to hold the <code>phone</code> property.
     */

    private String phone;

    /**
     * Attribute to hold the <code>purgedUserAudit</code> property.
     */

    private UserAuditDto purgedUserAudit;

    /**
     * Attribute to hold the <code> rateEntries</code> property.
     */
    private List<HouseRatingLineEntryDto> rateEntries;

    /**
     * Attribute to hold the <code>shipmentCustomClearanceStatus</code> property.
     */

    private Integer shipmentCustomClearanceStatus;
    
    private InbondStatusType inBondStatusType;

    /**
     * Attribute to hold the <code> shipper</code> property.
     */
    private HouseAirWaybillParticipantDto shipper;

    /**
     * Attribute to hold the <code>specialHandlingCodes</code> property.
     */

    private List<String> specialHandlingCodes;

    /**
     * Attribute to hold the <code>totalCashCollectedtoDate</code> property.
     */

    private BigDecimal totalCashCollectedtoDate;

    /**
     * Attribute to hold the <code>totalCashDue</code> property.
     */

    private Integer totalCashDue;

    /**
     * Attribute to hold the <code>totalCollectDueAgent</code> property.
     */

    private BigDecimal totalCollectDueAgent;

    /**
     * Attribute to hold the <code>totalCollectDueCarrier</code> property.
     */

    private Integer totalCollectDueCarrier;

    /**
     * Attribute to hold the <code>totalCollectedMiscCharges</code> property.
     */

    private BigDecimal totalCollectedMiscCharges;

    /**
     * Attribute to hold the <code>totalCollectOtherCharge</code> property.
     */
    private BigDecimal totalCollectOtherCharge;

    /**
     * Attribute to hold the <code>totalGoodsPieces</code> property.
     */

    private Integer totalGoodsPieces;

    /**
     * Attribute to hold the <code>totalGoodsWeight</code> property.
     */
    private BigDecimal totalGoodsWeight;

    /**
     * Attribute to hold the <code>goodsWeightUnit</code> property.
     */
    private WeightUOMType goodsWeightUnit;

    /**
     * Attribute to hold the <code>totalGrossWeightOfShipment</code> property.
     */

    private BigDecimal totalGrossWeightOfShipment;

    /**
     * Attribute to hold <code>totalHouseAWBPieces</code> property.
     */

    private BigDecimal totalHawbGrossWeight;

    /**
     * Attribute to hold the <code>totalHawbPieces</code> property.
     */
    private Long totalHawbPieces;

    /**
     * Attribute to hold <code>totalHouseAWBPieces</code> property.
     */

    private long totalHouseAWBPieces;

    /**
     * Attribute to hold <code>totalMasterAWBPieces</code> property.
     */

    private long totalMasterAWBPieces;

    /**
     * Attribute to hold the <code>totalShipment</code> property.
     */

    private int totalShipment;

    /**
     * Attribute to hold the <code>totalWeightofAllHouseGoodsAttached</code> property.
     */

    private BigDecimal totalWeightofAllHouseGoodsAttached;

    /**
     * Attribute to hold the <code>unitOfWeight</code> property.
     */

    private WeightUOMType unitOfWeight;

    /**
     * Attribute to holds <code>ecaIndicator</code> property.
     */

    private boolean ecaIndicator;

    /**
     * Attribute to holds <code>customsStation</code> property.
     */
    private String customsStation;

    /**
     * Gets the <code>ecaIndicator</code> property.
     * 
     * @return the current value of the <code>ecaIndicator</code> property.
     */
    public boolean isEcaIndicator() {
        return this.ecaIndicator;
    }

    /**
     * Sets the <code>ecaIndicator</code> property.
     * 
     * @param pEcaIndicator
     *            the current value of the <code>ecaIndicator</code> property.
     */
    public void setEcaIndicator(final boolean pEcaIndicator) {
        this.ecaIndicator = pEcaIndicator;
    }

    /**
     * Gets the <code>customsStation</code> property.
     * 
     * @return the current value of the <code>customsStation</code> property.
     */
    public String getCustomsStation() {
        return this.customsStation;
    }

    /**
     * Sets the <code>customsStation</code> property.
     * 
     * @param pCustomsStation
     *            the current value of the <code>customsStation</code> property.
     */
    public void setCustomsStation(final String pCustomsStation) {
        this.customsStation = pCustomsStation;
    }

    /**
     * Attribute to holds <code>unNumbers</code> property.
     */

    private List<Integer> unNumbers;

    /**
     * Attribute to hold the <code>updateOrDeleteFlag</code> property.
     */

    private String updateOrDeleteFlag;

    /**
     * Attribute to hold the <code>eCACompleted</code> property.
     */
    private boolean eCACompleted;

    /**
     * @return the eCACompleted
     */
    public boolean iseCACompleted() {
        return this.eCACompleted;
    }

    /**
     * @param pECACompleted
     *            the eCACompleted to set
     */
    public void seteCACompleted(final boolean pECACompleted) {
        this.eCACompleted = pECACompleted;
    }

    /**
     * Gets the <code>AirWaybillNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>AirWaybillNumber</code> property.
     */
    public AirWaybillNumberDto getAirWaybillNumber() {
        return this.airWaybillNumber;
    }

    /**
     * Gets the <code>AwbDeleteIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>AwbDeleteIndicator</code> property.
     */
    public String getAwbDeleteIndicator() {
        return this.awbDeleteIndicator;
    }

    /**
     * 
     * Gets the <code>awbProductCode</code> property.
     * 
     * @return the current value of the <code>awbProductCodedicator</code> property. <br>
     */
    public String getAwbProductCode() {
        return this.awbProductCode;
    }

    /**
     * Gets the <code>Charge</code> property.
     * <p>
     * 
     * @return the current value of the <code>Charge</code> property.
     */
    public HouseChargeDto getCharge() {
        return this.charge;
    }

    /**
     * 
     * Gets the <code>Consignee</code> property.
     * 
     * @return the current value of the <code>Consignee</code> property. <br>
     */
    public HouseAirWaybillParticipantDto getConsignee() {
        return this.consignee;
    }

    /**
     * Gets the <code>CreatedUserAudit</code> property.
     * <p>
     * 
     * @return the current value of the <code>CreatedUserAudit</code> property.
     */
    public UserAuditDto getCreatedUserAudit() {
        return this.createdUserAudit;
    }

    /**
     * Gets the <code>CreateorUpdateSource</code> property.
     * <p>
     * 
     * @return the current value of the <code>CreateorUpdateSource</code> property.
     */
    public HouseAirWaybillCreateSourceType getCreateorUpdateSource() {
        return this.createorUpdateSource;
    }

    /**
     * Gets the <code>CreationSource</code> property.
     * <p>
     * 
     * @return the current value of the <code>CreationSource</code> property.
     */
    public String getCreationSource() {
        return this.creationSource;
    }

    /**
     * Gets the <code>CrossReference1</code> property.
     * <p>
     * 
     * @return the current value of the <code>CrossReference1</code> property.
     */
    public String getCrossReference1() {
        return this.crossReference1;
    }

    /**
     * Gets the <code>CrossReference2</code> property.
     * <p>
     * 
     * @return the current value of the <code>CrossReference2</code> property.
     */
    public String getCrossReference2() {
        return this.crossReference2;
    }

    /**
     * Gets the <code>CrossReferenceIndicator1</code> property.
     * <p>
     * 
     * @return the current value of the <code>CrossReferenceIndicator1</code> property.
     */
    public String getCrossReferenceIndicator1() {
        return this.crossReferenceIndicator1;
    }

    /**
     * Gets the <code>CrossReferenceIndicator2</code> property.
     * <p>
     * 
     * @return the current value of the <code>CrossReferenceIndicator2</code> property.
     */
    public String getCrossReferenceIndicator2() {
        return this.crossReferenceIndicator2;
    }

    /**
     * Gets the <code>CustomApplicationIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>CustomApplicationIndicator</code> property.
     */
    public int getCustomApplicationIndicator() {
        return this.customApplicationIndicator;
    }

    /**
     * Gets the <code>CustomStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>CustomStation</code> property.
     */
    public String getCustomStation() {
        return this.customStation;
    }

    /**
     * Gets the <code>CustomsValue</code> property.
     * <p>
     * 
     * @return the current value of the <code>CustomsValue</code> property.
     */
    public String getCustomsValue() {
        return this.customsValue;
    }

    /**
     * Gets the <code>CustomsValueCurrencyCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>CustomsValueCurrencyCode</code> property.
     */
    public String getCustomsValueCurrencyCode() {
        return this.customsValueCurrencyCode;
    }

    /**
     * Gets the <code>DeclaredValue</code> property.
     * <p>
     * 
     * @return the current value of the <code>DeclaredValue</code> property.
     */
    public String getDeclaredValue() {
        return this.declaredValue;
    }

    /**
     * Gets the <code>DeletedUserAudit</code> property.
     * <p>
     * 
     * @return the current value of the <code>DeletedUserAudit</code> property.
     */
    public UserAuditDto getDeletedUserAudit() {
        return this.deletedUserAudit;
    }

    /**
     * Gets the <code>DeletionRemarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>DeletionRemarks</code> property.
     */
    public String getDeletionRemarks() {
        return this.deletionRemarks;
    }

    /**
     * Gets the <code>Destination</code> property.
     * <p>
     * 
     * @return the current value of the <code>Destination</code> property.
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * Gets the <code>DestinationCurrency</code> property.
     * <p>
     * 
     * @return the current value of the <code>DestinationCurrency</code> property.
     */
    public String getDestinationCurrency() {
        return this.destinationCurrency;
    }

    /**
     * Gets the <code>ExecutionDateTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>ExecutionDateTime</code> property.
     */
    public Date getExecutionDateTime() {
        return ContractUtility.getClonedDate(this.executionDateTime);
    }

    /**
     * Gets the <code>ExportPaycode</code> property.
     * <p>
     * 
     * @return the current value of the <code>ExportPaycode</code> property.
     */
    public AWBPaycodeType getExportPaycode() {
        return this.exportPaycode;
    }

    /**
     * Gets the <code>HouseIdentifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>HouseIdentifier</code> property.
     */
    public String getHouseIdentifier() {
        return this.houseIdentifier;
    }

    /**
     * 
     * Gets the <code>HtsCodes</code> property.
     * 
     * @return the current value of the <code>HtsCodes</code> property. <br>
     */
    public List<String> getHtsCodes() {
        return this.htsCodes;
    }

    /**
     * Gets the <code>ImportPaycode</code> property.
     * <p>
     * 
     * @return the current value of the <code>ImportPaycode</code> property.
     */
    public AWBPaycodeType getImportPaycode() {
        return this.importPaycode;
    }

    /**
     * Gets the <code>InBondIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>InBondIndicator</code> property.
     */
    public String getInBondIndicator() {
        return this.inBondIndicator;
    }

    /**
     * Gets the <code>InsuranceCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>InsuranceCode</code> property.
     */
    public String getInsuranceCode() {
        return this.insuranceCode;
    }

    /**
     * Gets the <code>InsuranceValue</code> property.
     * <p>
     * 
     * @return the current value of the <code>InsuranceValue</code> property.
     */
    public String getInsuranceValue() {
        return this.insuranceValue;
    }

    /**
     * Gets the <code>NumberMisslaneous</code> property.
     * <p>
     * 
     * @return the current value of the <code>NumberMisslaneous</code> property.
     */
    public int getNumberMisslaneous() {
        return this.numberMisslaneous;
    }

    /**
     * Gets the <code>NumberParticipantHawb</code> property.
     * <p>
     * 
     * @return the current value of the <code>NumberParticipantHawb</code> property.
     */
    public int getNumberParticipantHawb() {
        return this.numberParticipantHawb;
    }

    /**
     * Gets the <code>NumberRatingLines</code> property.
     * <p>
     * 
     * @return the current value of the <code>NumberRatingLines</code> property.
     */
    public int getNumberRatingLines() {
        return this.numberRatingLines;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>PostalCodeDto</code>. It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>Origin</code> property.
     * <p>
     * 
     * @return the current value of the <code>Origin</code> property.
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * Gets the <code>OriginatedAsFhl</code> property.
     * <p>
     * 
     * @return the current value of the <code>OriginatedAsFhl</code> property.
     */
    public String getOriginatedAsFhl() {
        return this.originatedAsFhl;
    }

    /**
     * Gets the <code>OriginCurrency</code> property.
     * <p>
     * 
     * @return the current value of the <code>OriginCurrency</code> property.
     */
    public String getOriginCurrency() {
        return this.originCurrency;
    }

    /**
     * Gets the <code>OtherCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>OtherCharges</code> property.
     */
    public List<HouseOtherChargesDto> getOtherCharges() {
        return this.otherCharges;
    }

    /**
     * Gets the <code>Participants</code> property.
     * <p>
     * 
     * @return the current value of the <code>Participants</code> property.
     */
    public List<HouseAirWaybillParticipantDto> getParticipants() {
        return this.participants;
    }

    /**
     * Gets the <code>Phone</code> property.
     * <p>
     * 
     * @return the current value of the <code>Phone</code> property.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Gets the <code>PurgedUserAudit</code> property.
     * <p>
     * 
     * @return the current value of the <code>PurgedUserAudit</code> property.
     */
    public UserAuditDto getPurgedUserAudit() {
        return this.purgedUserAudit;
    }

    /**
     * Gets the <code>RateEntries</code> property.
     * <p>
     * 
     * @return the current value of the <code>RateEntries</code> property.
     */
    public List<HouseRatingLineEntryDto> getRateEntries() {
    	if(this.rateEntries==null)
    		return this.rateEntries=new ArrayList<HouseRatingLineEntryDto>();
        return this.rateEntries;
    }

    /**
     * Gets the <code>ShipmentCustomClearanceStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>ShipmentCustomClearanceStatus</code> property.
     */
    public Integer getShipmentCustomClearanceStatus() {
        return this.shipmentCustomClearanceStatus;
    }

    /**
     * 
     * Gets the <code>Shipper</code> property.
     * 
     * @return the current value of the <code>Shipper</code> property. <br>
     */

    public HouseAirWaybillParticipantDto getShipper() {

        return this.shipper;
    }
    
    
    

    /**
     * Gets the <code>SpecialHandlingCodes</code> property.
     * <p>
     * 
     * @return the current value of the <code>SpecialHandlingCodes</code> property.
     */
    public List<String> getSpecialHandlingCodes() {
        return this.specialHandlingCodes;
    }

    /**
     * Gets the <code>TotalCashCollectedtoDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>TotalCashCollectedtoDate</code> property.
     */
    public BigDecimal getTotalCashCollectedtoDate() {
        return this.totalCashCollectedtoDate;
    }

    /**
     * Gets the <code>TotalCashDue</code> property.
     * <p>
     * 
     * @return the current value of the <code>TotalCashDue</code> property.
     */
    public Integer getTotalCashDue() {
        return this.totalCashDue;
    }

    /**
     * Gets the <code>TotalCollectDueAgent</code> property.
     * <p>
     * 
     * @return the current value of the <code>TotalCollectDueAgent</code> property.
     */
    public BigDecimal getTotalCollectDueAgent() {
        return this.totalCollectDueAgent;
    }

    /**
     * Gets the <code>TotalCollectDueCarrier</code> property.
     * <p>
     * 
     * @return the current value of the <code>TotalCollectDueCarrier</code> property.
     */
    public Integer getTotalCollectDueCarrier() {
        return this.totalCollectDueCarrier;
    }

    /**
     * Gets the <code>TotalCollectedMiscCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>TotalCollectedMiscCharges</code> property.
     */
    public BigDecimal getTotalCollectedMiscCharges() {
        return this.totalCollectedMiscCharges;
    }

    /**
     * Gets the <code>TotalGoodsPieces</code> property.
     * <p>
     * 
     * @return the current value of the <code>TotalGoodsPieces</code> property.
     */
    public Integer getTotalGoodsPieces() {
        return this.totalGoodsPieces;
    }

    /**
     * Gets the <code>TotalGrossWeightOfShipment</code> property.
     * <p>
     * 
     * @return the current value of the <code>TotalGrossWeightOfShipment</code> property.
     */
    public BigDecimal getTotalGrossWeightOfShipment() {
        return this.totalGrossWeightOfShipment;
    }

    /**
     * @return the totalHawbGrossWeight
     */
    public BigDecimal getTotalHawbGrossWeight() {
        return this.totalHawbGrossWeight;
    }

    /**
     * @return the totalHawbPieces
     */
    public Long getTotalHawbPieces() {
        return this.totalHawbPieces;
    }

    /**
     * Gets the <code>TotalHouseAWBPieces</code> property.
     * <p>
     * 
     * @return the current value of the <code>TotalHouseAWBPieces</code> property.
     */

    public long getTotalHouseAWBPieces() {
        return this.totalHouseAWBPieces;
    }

    /**
     * Gets the <code>TotalMasterAWBPieces</code> property.
     * <p>
     * 
     * @return the current value of the <code>TotalMasterAWBPieces</code> property.
     */
    public long getTotalMasterAWBPieces() {
        return this.totalMasterAWBPieces;
    }

    /**
     * Gets the <code>TotalShipment</code> property.
     * <p>
     * 
     * @return the current value of the <code>TotalShipment</code> property.
     */
    public int getTotalShipment() {
        return this.totalShipment;
    }

    /**
     * Gets the <code>TotalWeightofAllHouseGoodsAttached</code> property.
     * <p>
     * 
     * @return the current value of the <code>TotalWeightofAllHouseGoodsAttached</code> property.
     */
    public BigDecimal getTotalWeightofAllHouseGoodsAttached() {
        return this.totalWeightofAllHouseGoodsAttached;
    }

    /**
     * Gets the <code>UnitOfWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>UnitOfWeight</code> property.
     */
    public WeightUOMType getUnitOfWeight() {
        return this.unitOfWeight;
    }

    /**
     * 
     * Gets the <code>UnNumbers</code> property.
     * 
     * @return the current value of the <code>UnNumbers</code> property. <br>
     */
    public List<Integer> getUnNumbers() {
        return this.unNumbers;
    }

    /**
     * Gets the <code>UpdateOrDeleteFlag</code> property.
     * <p>
     * 
     * @return the current value of the <code>UpdateOrDeleteFlag</code> property.
     */
    public String getUpdateOrDeleteFlag() {
        return this.updateOrDeleteFlag;
    }

    /**
     * Gets the <code>AwbDeletionInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>AwbDeletionInd</code> property.
     */
    public boolean isAwbDeletionInd() {
        return this.awbDeletionInd;
    }

    /**
     * Sets the <code>AirWaybillNumber</code> property.
     * <p>
     * 
     * @param pAirWaybillNumber
     *            holds the new value of <code>AirWaybillNumber</code>.<br>
     */
    public void setAirWaybillNumber(final AirWaybillNumberDto pAirWaybillNumber) {
        this.airWaybillNumber = pAirWaybillNumber;
    }

    /**
     * Sets the <code>AwbDeleteIndicator</code> property.
     * <p>
     * 
     * @param pAwbDeleteIndicator
     *            holds the new value of <code>AwbDeleteIndicator</code>.<br>
     */
    public void setAwbDeleteIndicator(final String pAwbDeleteIndicator) {
        this.awbDeleteIndicator = ContractUtility
                    .convertToUpperCase(pAwbDeleteIndicator);
    }

    /**
     * Sets the <code>AwbDeletionInd</code> property.
     * <p>
     * 
     * @param pAwbDeletionInd
     *            holds the new value of <code>AwbDeletionInd</code>.<br>
     */
    public void setAwbDeletionInd(final boolean pAwbDeletionInd) {
        this.awbDeletionInd = pAwbDeletionInd;
    }

    /**
     * Sets the <code>AwbProductCode</code> property.
     * <p>
     * 
     * @param pAwbProductCode
     *            holds the new value of <code>AwbProductCode</code>.<br>
     */
    public void setAwbProductCode(final String pAwbProductCode) {
        this.awbProductCode = pAwbProductCode;
    }

    /**
     * Sets the <code>Charge</code> property.
     * <p>
     * 
     * @param pCharge
     *            holds the new value of <code>Charge</code>.<br>
     */
    public void setCharge(final HouseChargeDto pCharge) {
        this.charge = pCharge;
    }

    /**
     * Sets the <code>Consignee</code> property.
     * <p>
     * 
     * @param pConsignee
     *            holds the new value of <code>Consignee</code>.<br>
     */
    public void setConsignee(final HouseAirWaybillParticipantDto pConsignee) {
        this.consignee = pConsignee;
    }

    /**
     * Sets the <code>CreatedUserAudit</code> property.
     * <p>
     * 
     * @param pCreatedUserAudit
     *            holds the new value of <code>CreatedUserAudit</code>.<br>
     */
    public void setCreatedUserAudit(final UserAuditDto pCreatedUserAudit) {
        this.createdUserAudit = pCreatedUserAudit;
    }

    /**
     * Sets the <code>CreateorUpdateSource</code> property.
     * <p>
     * 
     * @param pCreateorUpdateSource
     *            holds the new value of <code>CreateorUpdateSource</code>.<br>
     */
    public void setCreateorUpdateSource(
                final HouseAirWaybillCreateSourceType pCreateorUpdateSource) {
        this.createorUpdateSource = pCreateorUpdateSource;

    }

    /**
     * Sets the <code>CreationSource</code> property.
     * <p>
     * 
     * @param pCreationSource
     *            holds the new value of <code>CreationSource</code>.<br>
     */
    public void setCreationSource(final String pCreationSource) {
        this.creationSource = ContractUtility
                    .convertToUpperCase(pCreationSource);

    }

    /**
     * Sets the <code>CrossReference1</code> property.
     * <p>
     * 
     * @param pCrossReference1
     *            holds the new value of <code>CrossReference1</code>.<br>
     */
    public void setCrossReference1(final String pCrossReference1) {
        this.crossReference1 = pCrossReference1;

    }

    /**
     * Sets the <code>CrossReference2</code> property.
     * <p>
     * 
     * @param pCrossReference2
     *            holds the new value of <code>CrossReference2</code>.<br>
     */
    public void setCrossReference2(final String pCrossReference2) {
        this.crossReference2 = pCrossReference2;
    }

    /**
     * Sets the <code>CrossReferenceIndicator1</code> property.
     * <p>
     * 
     * @param pCrossReferenceIndicator1
     *            holds the new value of <code>CrossReferenceIndicator1</code>.<br>
     */
    public void setCrossReferenceIndicator1(
                final String pCrossReferenceIndicator1) {
        this.crossReferenceIndicator1 = ContractUtility
                    .convertToUpperCase(pCrossReferenceIndicator1);
    }

    /**
     * Sets the <code>CrossReferenceIndicator2</code> property.
     * <p>
     * 
     * @param pCrossReferenceIndicator2
     *            holds the new value of <code>CrossReferenceIndicator2</code>.<br>
     */
    public void setCrossReferenceIndicator2(
                final String pCrossReferenceIndicator2) {
        this.crossReferenceIndicator2 = ContractUtility
                    .convertToUpperCase(pCrossReferenceIndicator2);
    }

    /**
     * Sets the <code>CustomApplicationIndicator</code> property.
     * <p>
     * 
     * @param pCustomApplicationIndicator
     *            holds the new value of <code>CustomApplicationIndicator</code> .<br>
     */
    public void setCustomApplicationIndicator(
                final int pCustomApplicationIndicator) {
        this.customApplicationIndicator = pCustomApplicationIndicator;
    }

    /**
     * Sets the <code>CustomStation</code> property.
     * <p>
     * 
     * @param pCustomStation
     *            holds the new value of <code>CustomStation</code>.<br>
     */
    public void setCustomStation(final String pCustomStation) {
        this.customStation = ContractUtility.convertToUpperCase(pCustomStation);
    }

    /**
     * Sets the <code>CustomsValue</code> property.
     * <p>
     * 
     * @param pCustomsValue
     *            holds the new value of <code>CustomsValue</code>.<br>
     */
    public void setCustomsValue(final String pCustomsValue) {
        this.customsValue = ContractUtility.convertToUpperCase(pCustomsValue);
    }

    /**
     * Sets the <code>CustomsValueCurrencyCode</code> property.
     * <p>
     * 
     * @param pCustomsValueCurrencyCode
     *            holds the new value of <code>CustomsValueCurrencyCode</code>.<br>
     */
    public void setCustomsValueCurrencyCode(
                final String pCustomsValueCurrencyCode) {

        this.customsValueCurrencyCode = ContractUtility
                    .convertToUpperCase(pCustomsValueCurrencyCode);
    }

    /**
     * Sets the <code>DeclaredValue</code> property.
     * <p>
     * 
     * @param pDeclaredValue
     *            holds the new value of <code>DeclaredValue</code>.<br>
     */
    public void setDeclaredValue(final String pDeclaredValue) {
        this.declaredValue = ContractUtility.convertToUpperCase(pDeclaredValue);
    }

    /**
     * Sets the <code>DeletedUserAudit</code> property.
     * <p>
     * 
     * @param pDeletedUserAudit
     *            holds the new value of <code>DeletedUserAudit</code>.<br>
     */
    public void setDeletedUserAudit(final UserAuditDto pDeletedUserAudit) {
        this.deletedUserAudit = pDeletedUserAudit;
    }

    /**
     * Sets the <code>DeletionRemarks</code> property.
     * <p>
     * 
     * @param pDeletionRemarks
     *            holds the new value of <code>DeletionRemarks</code>.<br>
     */
    public void setDeletionRemarks(final String pDeletionRemarks) {
        this.deletionRemarks = pDeletionRemarks;
    }

    /**
     * Sets the <code>Destination</code> property.
     * <p>
     * 
     * @param pDestination
     *            holds the new value of <code>Destination</code>.<br>
     */
    public void setDestination(final String pDestination) {
        this.destination = ContractUtility.convertToUpperCase(pDestination);
    }

    /**
     * Sets the <code>DestinationCurrency</code> property.
     * <p>
     * 
     * @param pDestinationCurrency
     *            holds the new value of <code>DestinationCurrency</code>.<br>
     */
    public void setDestinationCurrency(final String pDestinationCurrency) {
        this.destinationCurrency = ContractUtility
                    .convertToUpperCase(pDestinationCurrency);
    }

    /**
     * Sets the <code>ExecutionDateTime</code> property.
     * <p>
     * 
     * @param pExecutionDateTime
     *            holds the new value of <code>ExecutionDateTime</code>.<br>
     */
    public void setExecutionDateTime(final Date pExecutionDateTime) {
        this.executionDateTime = ContractUtility
                    .getClonedDate(pExecutionDateTime);
    }

    /**
     * Sets the <code>ExportPaycode</code> property.
     * <p>
     * 
     * @param pExportPaycode
     *            holds the new value of <code>ExportPaycode</code>.<br>
     */
    public void setExportPaycode(final AWBPaycodeType pExportPaycode) {
        this.exportPaycode = pExportPaycode;
    }

    /**
     * Sets the <code>HouseIdentifier</code> property.
     * <p>
     * 
     * @param pHouseIdentifier
     *            holds the new value of <code>HouseIdentifier</code>.<br>
     */
    public void setHouseIdentifier(final String pHouseIdentifier) {
        this.houseIdentifier = ContractUtility
                    .convertToUpperCase(pHouseIdentifier);
    }

    /**
     * Sets the <code>HtsCodes</code> property.
     * <p>
     * 
     * @param pHtsCodes
     *            holds the new value of <code>HtsCodes</code>.<br>
     */
    public void setHtsCodes(final List<String> pHtsCodes) {
        this.htsCodes = pHtsCodes;
    }

    /**
     * Sets the <code>ImportPaycode</code> property.
     * <p>
     * 
     * @param pImportPaycode
     *            holds the new value of <code>ImportPaycode</code>.<br>
     */
    public void setImportPaycode(final AWBPaycodeType pImportPaycode) {
        this.importPaycode = pImportPaycode;
    }

    /**
     * Sets the <code>InBondIndicator</code> property.
     * <p>
     * 
     * @param pInBondIndicator
     *            holds the new value of <code>InBondIndicator</code>.<br>
     */
    public void setInBondIndicator(final String pInBondIndicator) {
        this.inBondIndicator = ContractUtility
                    .convertToUpperCase(pInBondIndicator);
    }

    /**
     * Sets the <code>InsuranceCode</code> property.
     * <p>
     * 
     * @param pInsuranceCode
     *            holds the new value of <code>InsuranceCode</code>.<br>
     */
    public void setInsuranceCode(final String pInsuranceCode) {
        this.insuranceCode = ContractUtility.convertToUpperCase(pInsuranceCode);
    }

    /**
     * Sets the <code>InsuranceValue</code> property.
     * <p>
     * 
     * @param pInsuranceValue
     *            holds the new value of <code>InsuranceValue</code>.<br>
     */
    public void setInsuranceValue(final String pInsuranceValue) {
        this.insuranceValue = pInsuranceValue;
    }

    /**
     * Sets the <code>NumberMisslaneous</code> property.
     * <p>
     * 
     * @param pNumberMisslaneous
     *            holds the new value of <code>NumberMisslaneous</code>.<br>
     */
    public void setNumberMisslaneous(final int pNumberMisslaneous) {
        this.numberMisslaneous = pNumberMisslaneous;
    }

    /**
     * Sets the <code>NumberParticipantHawb</code> property.
     * <p>
     * 
     * @param pNumberParticipantHawb
     *            holds the new value of <code>NumberParticipantHawb</code>.<br>
     */
    public void setNumberParticipantHawb(final int pNumberParticipantHawb) {
        this.numberParticipantHawb = pNumberParticipantHawb;
    }

    /**
     * Sets the <code>NumberRatingLines</code> property.
     * <p>
     * 
     * @param pNumberRatingLines
     *            holds the new value of <code>NumberRatingLines</code>.<br>
     */
    public void setNumberRatingLines(final int pNumberRatingLines) {
        this.numberRatingLines = pNumberRatingLines;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>PostalCodeDto</code>.It is of type Long.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>Origin</code> property.
     * <p>
     * 
     * @param pOrigin
     *            holds the new value of <code>Origin</code>.<br>
     */
    public void setOrigin(final String pOrigin) {
        this.origin = ContractUtility.convertToUpperCase(pOrigin);
    }

    /**
     * Sets the <code>OriginatedAsFhl</code> property.
     * <p>
     * 
     * @param pOriginatedAsFhl
     *            holds the new value of <code>OriginatedAsFhl</code>.<br>
     */
    public void setOriginatedAsFhl(final String pOriginatedAsFhl) {
        this.originatedAsFhl = ContractUtility
                    .convertToUpperCase(pOriginatedAsFhl);
    }

    /**
     * Sets the <code>OriginCurrency</code> property.
     * <p>
     * 
     * @param pOriginCurrency
     *            holds the new value of <code>OriginCurrency</code>.<br>
     */
    public void setOriginCurrency(final String pOriginCurrency) {
        this.originCurrency = ContractUtility
                    .convertToUpperCase(pOriginCurrency);
    }

    /**
     * Sets the <code>OtherCharges</code> property.
     * <p>
     * 
     * @param pOtherCharges
     *            holds the new value of <code>OtherCharges</code>.<br>
     */
    public void setOtherCharges(final List<HouseOtherChargesDto> pOtherCharges) {
        this.otherCharges = pOtherCharges;
    }

    /**
     * Sets the <code>Participants</code> property.
     * <p>
     * 
     * @param pParticipants
     *            holds the new value of <code>Participants</code>.<br>
     */
    public void setParticipants(
                final List<HouseAirWaybillParticipantDto> pParticipants) {
        this.participants = pParticipants;
    }

    /**
     * Sets the <code>Phone</code> property.
     * <p>
     * 
     * @param pPhone
     *            holds the new value of <code>Phone</code>.<br>
     */
    public void setPhone(final String pPhone) {
        this.phone = ContractUtility.convertToUpperCase(pPhone);
    }

    /**
     * Sets the <code>PurgedUserAudit</code> property.
     * <p>
     * 
     * @param pPurgedUserAudit
     *            holds the new value of <code>PurgedUserAudit</code>.<br>
     */
    public void setPurgedUserAudit(final UserAuditDto pPurgedUserAudit) {
        this.purgedUserAudit = pPurgedUserAudit;
    }

    /**
     * Sets the <code>RateEntries</code> property.
     * <p>
     * 
     * @param pRateEntries
     *            holds the new value of <code>RateEntries</code>.<br>
     */
    public void setRateEntries(final List<HouseRatingLineEntryDto> pRateEntries) {
        this.rateEntries = pRateEntries;
    }

    /**
     * Sets the <code>ShipmentCustomClearanceStatus</code> property.
     * <p>
     * 
     * @param pShipmentCustomClearanceStatus
     *            holds the new value of <code>ShipmentCustomClearanceStatus</code>.<br>
     */
    public void setShipmentCustomClearanceStatus(
                final Integer pShipmentCustomClearanceStatus) {
        this.shipmentCustomClearanceStatus = pShipmentCustomClearanceStatus;
    }

    /**
     * Sets the <code>Shipper</code> property.
     * <p>
     * 
     * @param pShipper
     *            holds the new value of <code>Shipper</code>.<br>
     */
    public void setShipper(final HouseAirWaybillParticipantDto pShipper) {
        this.shipper = pShipper;
    }

    /**
     * Sets the <code>SpecialHandlingCodes</code> property.
     * <p>
     * 
     * @param pSpecialHandlingCodes
     *            holds the new value of <code>SpecialHandlingCodes</code>.<br>
     */
    public void setSpecialHandlingCodes(final List<String> pSpecialHandlingCodes) {
        this.specialHandlingCodes = pSpecialHandlingCodes;
    }

    /**
     * Sets the <code>TotalCashCollectedtoDate</code> property.
     * <p>
     * 
     * @param pTotalCashCollectedtoDate
     *            holds the new value of <code>TotalCashCollectedtoDate</code>.<br>
     */
    public void setTotalCashCollectedtoDate(
                final BigDecimal pTotalCashCollectedtoDate) {
        this.totalCashCollectedtoDate = pTotalCashCollectedtoDate;
    }

    /**
     * Sets the <code>TotalCashDue</code> property.
     * <p>
     * 
     * @param pTotalCashDue
     *            holds the new value of <code>TotalCashDue</code>.<br>
     */
    public void setTotalCashDue(final Integer pTotalCashDue) {
        this.totalCashDue = pTotalCashDue;
    }

    /**
     * Sets the <code>TotalCollectDueAgent</code> property.
     * <p>
     * 
     * @param pTotalCollectDueAgent
     *            holds the new value of <code>TotalCollectDueAgent</code>.<br>
     */
    public void setTotalCollectDueAgent(final BigDecimal pTotalCollectDueAgent) {
        this.totalCollectDueAgent = pTotalCollectDueAgent;
    }


    /**
     * Sets the <code>TotalCollectDueCarrier</code> property.
     * <p>
     * 
     * @param pTotalCollectDueCarrier
     *            holds the new value of <code>TotalCollectDueCarrier</code>.<br>
     */
    public void setTotalCollectDueCarrier(final Integer pTotalCollectDueCarrier) {
        this.totalCollectDueCarrier = pTotalCollectDueCarrier;
    }

    /**
     * Sets the <code>TotalCollectedMiscCharges</code> property.
     * <p>
     * 
     * @param pTotalCollectedMiscCharges
     *            holds the new value of <code>TotalCollectedMiscCharges</code>.<br>
     */
    public void setTotalCollectedMiscCharges(
                final BigDecimal pTotalCollectedMiscCharges) {
        this.totalCollectedMiscCharges = pTotalCollectedMiscCharges;
    }

    /**
     * Sets the <code>TotalGoodsPieces</code> property.
     * <p>
     * 
     * @param pTotalGoodsPieces
     *            holds the new value of <code>TotalGoodsPieces</code>.<br>
     */
    public void setTotalGoodsPieces(final Integer pTotalGoodsPieces) {
        this.totalGoodsPieces = pTotalGoodsPieces;
    }

    /**
     * Sets the <code>TotalGrossWeightOfShipment</code> property.
     * <p>
     * 
     * @param pTotalGrossWeightOfShipment
     *            holds the new value of <code>TotalGrossWeightOfShipment</code> .<br>
     */
    public void setTotalGrossWeightOfShipment(
                final BigDecimal pTotalGrossWeightOfShipment) {
        this.totalGrossWeightOfShipment = pTotalGrossWeightOfShipment;
    }

    /**
     * @param pTotalHawbGrossWeight
     *            the totalHawbGrossWeight to set
     */
    public void setTotalHawbGrossWeight(final BigDecimal pTotalHawbGrossWeight) {
        this.totalHawbGrossWeight = pTotalHawbGrossWeight;
    }

    /**
     * @param pTotalHawbPieces
     *            the totalHawbPieces to set
     */
    public void setTotalHawbPieces(final Long pTotalHawbPieces) {
        this.totalHawbPieces = pTotalHawbPieces;
    }

    /**
     * Sets the <code>TotalHouseAWBPieces</code> property.
     * <p>
     * 
     * @param pTotalHouseAWBPieces
     *            holds the new value of <code>TotalHouseAWBPieces</code>.<br>
     */
    public void setTotalHouseAWBPieces(final long pTotalHouseAWBPieces) {
        this.totalHouseAWBPieces = pTotalHouseAWBPieces;
    }

    /**
     * Sets the <code>TotalMasterAWBPieces</code> property.
     * <p>
     * 
     * @param pTotalMasterAWBPieces
     *            holds the new value of <code>TotalMasterAWBPieces</code>.<br>
     */
    public void setTotalMasterAWBPieces(final long pTotalMasterAWBPieces) {
        this.totalMasterAWBPieces = pTotalMasterAWBPieces;
    }

    /**
     * Sets the <code>TotalShipment</code> property.
     * <p>
     * 
     * @param pTotalShipment
     *            holds the new value of <code>TotalShipment</code>.<br>
     */
    public void setTotalShipment(final int pTotalShipment) {
        this.totalShipment = pTotalShipment;
    }

    /**
     * Sets the <code>TotalWeightofAllHouseGoodsAttached</code> property.
     * <p>
     * 
     * @param pTotalWeightofAllHouseGoodsAttached
     *            holds the new value of <code>TotalWeightofAllHouseGoodsAttached</code>.<br>
     */
    public void setTotalWeightofAllHouseGoodsAttached(
                final BigDecimal pTotalWeightofAllHouseGoodsAttached) {
        this.totalWeightofAllHouseGoodsAttached = pTotalWeightofAllHouseGoodsAttached;
    }

    /**
     * Sets the <code>UnitOfWeight</code> property.
     * <p>
     * 
     * @param pUnitOfWeight
     *            holds the new value of <code>UnitOfWeight</code>.<br>
     */
    public void setUnitOfWeight(final WeightUOMType pUnitOfWeight) {
        this.unitOfWeight = pUnitOfWeight;
    }

    /**
     * Sets the <code>UnNumbers</code> property.
     * <p>
     * 
     * @param pUnNumbers
     *            holds the new value of <code>UnNumbers</code>.<br>
     */
    public void setUnNumbers(final List<Integer> pUnNumbers) {
        this.unNumbers = pUnNumbers;
    }

    /**
     * Sets the <code>UpdateOrDeleteFlag</code> property.
     * <p>
     * 
     * @param pUpdateOrDeleteFlag
     *            holds the new value of <code>UpdateOrDeleteFlag</code>.<br>
     */
    public void setUpdateOrDeleteFlag(final String pUpdateOrDeleteFlag) {
        this.updateOrDeleteFlag = ContractUtility
                    .convertToUpperCase(pUpdateOrDeleteFlag);
    }

    /**
     * @return the totalCollectOtherCharge
     */
    public BigDecimal getTotalCollectOtherCharge() {
        return this.totalCollectOtherCharge;
    }

    /**
     * @param totalCollectOtherCharge
     *            the totalCollectOtherCharge to set
     */
    public void setTotalCollectOtherCharge(
                final BigDecimal pTotalCollectOtherCharge) {
        this.totalCollectOtherCharge = pTotalCollectOtherCharge;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Gets the <code>totalGoodsWeight</code> property.
     * 
     * @return the current value of the <code>totalGoodsWeight</code> property.
     */
    public BigDecimal getTotalGoodsWeight() {
        return this.totalGoodsWeight;
    }

    /**
     * Sets the <code>totalGoodsWeight</code> property.
     * 
     * @param pTotalGoodsWeight
     *            the current value of the <code>totalGoodsWeight</code> property.
     */
    public void setTotalGoodsWeight(final BigDecimal pTotalGoodsWeight) {
        this.totalGoodsWeight = pTotalGoodsWeight;
    }

    /**
     * Gets the <code>goodsWeightUnit</code> property.
     * 
     * @return the current value of the <code>goodsWeightUnit</code> property.
     */
    public WeightUOMType getGoodsWeightUnit() {
        return this.goodsWeightUnit;
    }

    /**
     * Sets the <code>goodsWeightUnit</code> property.
     * 
     * @param pGoodsWeightUnit
     *            the current value of the <code>goodsWeightUnit</code> property.
     */
    public void setGoodsWeightUnit(final WeightUOMType pGoodsWeightUnit) {
        this.goodsWeightUnit = pGoodsWeightUnit;
    }

    /**
     * @return the creationSourceForCompletedHAWB
     */
    public CompletedHAWBCreationSourceType getCreationSourceForCompletedHAWB() {
        return this.creationSourceForCompletedHAWB;
    }

    /**
     * @param pCreationSourceForCompletedHAWB
     *            the creationSourceForCompletedHAWB to set
     */
    public void setCreationSourceForCompletedHAWB(
                final CompletedHAWBCreationSourceType pCreationSourceForCompletedHAWB) {
        this.creationSourceForCompletedHAWB = pCreationSourceForCompletedHAWB;
    }

    /**
     * @return the houseGoods
     */
    public String getHouseGoods() {
        return this.houseGoods;
    }

    /**
     * @param houseGoods
     *            the houseGoods to set
     */
    public void setHouseGoods(final String pHouseGoods) {
        this.houseGoods = pHouseGoods;
    }

    /**
     * @return the hawbCustomsInformation
     */
    public HAWBCustomsInformationDto getHawbCustomsInformation() {
        if (hawbCustomsInformation == null) {
            hawbCustomsInformation = new HAWBCustomsInformationDto();
        }
        return this.hawbCustomsInformation;
    }

    /**
     * @param pHawbCustomsInformation
     *            the hawbCustomsInformation to set
     */
    public void setHawbCustomsInformation(
                final HAWBCustomsInformationDto pHawbCustomsInformation) {
        this.hawbCustomsInformation = pHawbCustomsInformation;
    }

    /**
     * @return the customsStationChangeAllowedIndicator
     */
    public boolean isCustomsStationChangeAllowedIndicator() {
        return this.customsStationChangeAllowedIndicator;
    }

    /**
     * @param pCustomsStationChangeAllowedIndicator
     *            the customsStationChangeAllowedIndicator to set
     */
    public void setCustomsStationChangeAllowedIndicator(
                final boolean pCustomsStationChangeAllowedIndicator) {
        this.customsStationChangeAllowedIndicator = pCustomsStationChangeAllowedIndicator;
    }

    /**
     * @return the shpContactDetails
     */
    public String getShpContactDetails() {
        return this.shpContactDetails;
    }

    /**
     * @param pShpContactDetails the shpContactDetails to set
     */
    public void setShpContactDetails(final String pShpContactDetails) {
        this.shpContactDetails = pShpContactDetails;
    }

    /**
     * @return the cneContactDetails
     */
    public String getCneContactDetails() {
        return this.cneContactDetails;
    }

    /**
     * @param pCneContactDetails the cneContactDetails to set
     */
    public void setCneContactDetails(final String pCneContactDetails) {
        this.cneContactDetails = pCneContactDetails;
    }

    /**
     * Gets the <code>houseRemarks2</code> property.
     * 
     * @return the current value of the <code>houseRemarks2</code> property.
     */
    public String getHouseRemarks2() {
        return this.houseRemarks2;
    }

    /**
     * Sets the <code>houseRemarks2</code> property.
     * 
     * @param pHouseRemarks2
     *            the current value of the <code>houseRemarks2</code> property.
     */
    public void setHouseRemarks2(final String pHouseRemarks2) {
        this.houseRemarks2 = pHouseRemarks2;
    }

	/**
	 * @return the inBondStatusType
	 */
	public InbondStatusType getInBondStatusType() {
		return this.inBondStatusType;
	}

	/**
	 * @param pInBondStatusType
	 *            the inBondStatusType to set
	 */
	public void setInBondStatusType(final InbondStatusType pInBondStatusType) {
		this.inBondStatusType = pInBondStatusType;
	}

	/**
	 * @return the UniqueTaxIdentificationCode
	 */
	//HIS019 UC026 starts
	public String getUniqueTaxIdentificationCode() {
		return uniqueTaxIdentificationCode;
	}

	/**
	 * @param the UniqueTaxIdentificationCode
	 */
	public void setUniqueTaxIdentificationCode(String uniqueTaxIdentificationCode) {
		this.uniqueTaxIdentificationCode = uniqueTaxIdentificationCode;
	}
	//HIS019 UC026 ends
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the teleTypeAddress
	 */
	public String getTeleTypeAddress() {
		return teleTypeAddress;
	}

	/**
	 * @param teleTypeAddress the teleTypeAddress to set
	 */
	public void setTeleTypeAddress(String teleTypeAddress) {
		this.teleTypeAddress = teleTypeAddress;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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
	 * @return the splswithColorCodes
	 */
	public Map<String, String> getSplswithColorCodes() {
		return splswithColorCodes;
	}

	/**
	 * @param splswithColorCodes the splswithColorCodes to set
	 */
	public void setSplswithColorCodes(Map<String, String> splswithColorCodes) {
		this.splswithColorCodes = splswithColorCodes;
	}

	//HIS019 and AC426G
	public String getCuitOrTrinPrefix() {
		return cuitOrTrinPrefix;
	}

	public void setCuitOrTrinPrefix(String cuitOrTrinPrefix) {
		this.cuitOrTrinPrefix = cuitOrTrinPrefix;
	}
	//HIS019 and AC426G

	

}
