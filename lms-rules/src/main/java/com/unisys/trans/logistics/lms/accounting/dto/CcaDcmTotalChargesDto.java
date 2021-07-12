package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.GenIdType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.UnitType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.VolumeEvaluationMethodType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;

/**
 * <code>AccountingTotalCharges</code> domain contain details of AccountingTotalCharges.
 * <p>
 * This contains all information about AccountingTotalCharges.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>actCollectCharge
 * <li>actPrepaidCharge
 * <li>actWeightCharge
 * <li>codChargeGenIdType
 * <li>codCharges
 * <li>codCurrency
 * <li>codExchangeRate
 * <li>currencyCode
 * <li>dimensionalWeight
 * <li>faceCollectCharge
 * <li>facePrepaidCharge
 * <li>faceWeightCharge
 * <li>flightDate
 * <li>flightNumber
 * <li>oId
 * <li>pubCollectCharge
 * <li>pubPrepaidCharge
 * <li>pubWeightCharge
 * <li>totalCashOnDeliveryCOD
 * <li>totalChargeableWeight
 * <li>totalWeightCharges
 * <li>unitType
 * <li>valuationChargeGenIdType
 * <li>valuationCharges
 * <li>volume
 * <li>volumeEvaluationMethod
 * <li>weightUnit
 * </ul>
 */

public class CcaDcmTotalChargesDto extends PersistenceObjectDto {
	


    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3454584256669992188L;

    /**
     * Attribute to hold <code>codChargeGenIdType</code> property.
     */
    private GenIdType codChargeGenIdType;

    /**
     * Attribute to hold <code>codCharges</code> property.
     */
    private BigDecimal codCharges;

    /**
     * Attribute to hold <code>codCurrency</code> property.
     */
    private String codCurrency;

    /**
     * Attribute to hold <code>codExchangeRate</code> property.
     */
    private BigDecimal codExchangeRate;

    /**
     * Attribute to hold <code>collectCharges</code> property.
     */
    private List<TotalChargeEntryDto> collectCharges;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     */
    private String currencyCode;

    /**
     * Attribute to hold <code>dimensionalWeight</code> property.
     */
    private BigDecimal dimensionalWeight;

    /**
     * Attribute to hold <code>flightDate</code> property.
     */
    private Date flightDate;

    /**
     * Attribute to hold <code>flightNumber</code> property.
     */
    private String flightNumber;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>prepaidCharges</code> property.
     */
    private List<TotalChargeEntryDto> prepaidCharges;

    /**
     * Attribute to hold <code>totalCashOnDeliveryCOD</code> property.
     */
    private BigDecimal totalCashOnDeliveryCOD;

    /**
     * Attribute to hold <code>totalChargeableWeight</code> property.
     */
    private BigDecimal totalChargeableWeight;

    /**
     * Attribute to hold <code>totalWeightCharges</code> property.
     */
    private BigDecimal totalWeightCharges;

    /**
     * Attribute to hold <code>unitType</code> property.
     */
    private UnitType unitType;

    /**
     * Attribute to hold <code>valuationChargeGenIdType</code> property.
     */
    private GenIdType valuationChargeGenIdType;

    /**
     * Attribute to hold <code>valuationCharges</code> property.
     */
    private BigDecimal valuationCharges;

    /**
     * Attribute to hold <code>volume</code> property.
     */
    private Integer volume;

    /**
     * Attribute to hold <code>volumeEvaluationMethod</code> property.
     */
    private VolumeEvaluationMethodType volumeEvaluationMethod;

    /**
     * Attribute to hold <code>weightCharges</code> property.
     */
    private List<TotalChargeEntryDto> weightCharges;

    /**
     * Attribute to hold <code>weightUnit</code> property.
     */
    private WeightUOMType weightUnit;

    /**
     * Gets the <code>codChargeGenIdType</code> property.
     * <p>
     * 
     * @return the current value of the <code>codChargeGenIdType</code> property.
     */
    public GenIdType getCodChargeGenIdType() {
        return this.codChargeGenIdType;
    }

    /**
     * Gets the <code>codCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>codCharges</code> property.
     */
    public BigDecimal getCodCharges() {
        return this.codCharges;
    }

    /**
     * Gets the <code>codCurrency</code> property.
     * <p>
     * 
     * @return the current value of the <code>codCurrency</code> property.
     */
    public String getCodCurrency() {
        return this.codCurrency;
    }

    /**
     * Gets the <code>codExchangeRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>codExchangeRate</code> property.
     */
    public BigDecimal getCodExchangeRate() {
        return this.codExchangeRate;
    }

    /**
     * Gets the <code>collectCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectCharges</code> property.
     */
    public List<TotalChargeEntryDto> getCollectCharges() {
        return this.collectCharges;
    }

    /**
     * Gets the <code>currencyCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>currencyCode</code> property.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Gets the <code>dimensionalWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>dimensionalWeight</code> property.
     */
    public BigDecimal getDimensionalWeight() {
        return this.dimensionalWeight;
    }

    /**
     * Gets the <code>flightDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightDate</code> property.
     */
    public Date getFlightDate() {
        return ContractUtility.getClonedDate(this.flightDate);
    }

    /**
     * Gets the <code>flightNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightNumber</code> property.
     */
    public String getFlightNumber() {
        return this.flightNumber;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>prepaidCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>prepaidCharges</code> property.
     */
    public List<TotalChargeEntryDto> getPrepaidCharges() {
        return this.prepaidCharges;
    }

    /**
     * Gets the <code>totalCashOnDeliveryCOD</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalCashOnDeliveryCOD</code> property.
     */
    public BigDecimal getTotalCashOnDeliveryCOD() {
        return this.totalCashOnDeliveryCOD;
    }

    /**
     * Gets the <code>totalChargeableWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalChargeableWeight</code> property.
     */
    public BigDecimal getTotalChargeableWeight() {
        return this.totalChargeableWeight;
    }

    /**
     * Gets the <code>totalWeightCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalWeightCharges</code> property.
     */
    public BigDecimal getTotalWeightCharges() {
        return this.totalWeightCharges;
    }

    /**
     * Gets the <code>unitType</code> property.
     * <p>
     * 
     * @return the current value of the <code>unitType</code> property.
     */
    public UnitType getUnitType() {
        return this.unitType;
    }

    /**
     * Gets the <code>valuationChargeGenIdType</code> property.
     * <p>
     * 
     * @return the current value of the <code>valuationChargeGenIdType</code> property.
     */
    public GenIdType getValuationChargeGenIdType() {
        return this.valuationChargeGenIdType;
    }

    /**
     * Gets the <code>valuationCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>valuationCharges</code> property.
     */
    public BigDecimal getValuationCharges() {
        return this.valuationCharges;
    }

    /**
     * Gets the <code>volume</code> property.
     * <p>
     * 
     * @return the current value of the <code>volume</code> property.
     */
    public Integer getVolume() {
        return this.volume;
    }

    /**
     * Gets the <code>volumeEvaluationMethod</code> property.
     * <p>
     * 
     * @return the current value of the <code>volumeEvaluationMethod</code> property.
     */
    public VolumeEvaluationMethodType getVolumeEvaluationMethod() {
        return this.volumeEvaluationMethod;
    }

    /**
     * Gets the <code>weightCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>weightCharges</code> property.
     */
    public List<TotalChargeEntryDto> getWeightCharges() {
        return this.weightCharges;
    }

    /**
     * Gets the <code>weightUnit</code> property.
     * <p>
     * 
     * @return the current value of the <code>weightUnit</code> property.
     */
    public WeightUOMType getWeightUnit() {
        return this.weightUnit;
    }

    /**
     * Sets the <code>codChargeGenIdType</code>.
     * <p>
     * 
     * @param pCodChargeGenIdType
     *            holds the new value of <code>codChargeGenIdType</code>
     */
    public void setCodChargeGenIdType(final GenIdType pCodChargeGenIdType) {
        this.codChargeGenIdType = pCodChargeGenIdType;
    }

    /**
     * Sets the <code>codCharges</code>.
     * <p>
     * 
     * @param pCodCharges
     *            holds the new value of <code>codCharges</code>
     */

    public void setCodCharges(final BigDecimal pCodCharges) {
        this.codCharges = pCodCharges;
    }

    /**
     * Sets the <code>codCurrency</code>.
     * <p>
     * 
     * @param pCodCurrency
     *            holds the new value of <code>codCurrency</code>
     */
    public void setCodCurrency(final String pCodCurrency) {
        this.codCurrency = ContractUtility.convertToUpperCase( pCodCurrency);
    }

    /**
     * Sets the <code>codExchangeRate</code>.
     * <p>
     * 
     * @param pCodExchangeRate
     *            holds the new value of <code>codExchangeRate</code>
     */
    public void setCodExchangeRate(final BigDecimal pCodExchangeRate) {
        this.codExchangeRate = pCodExchangeRate;
    }

    /**
     * Sets the <code>collectCharges</code>.
     * <p>
     * 
     * @param pCollectCharges
     *            holds the new value of <code>collectCharges</code>
     */
    public void setCollectCharges(final List<TotalChargeEntryDto> pCollectCharges) {
        this.collectCharges = pCollectCharges;
    }

    /**
     * Sets the <code>currencyCode</code>.
     * <p>
     * 
     * @param pCurrencyCode
     *            holds the new value of <code>currencyCode</code>
     */
    public void setCurrencyCode(final String pCurrencyCode) {
        this.currencyCode = pCurrencyCode;
    }

    /**
     * Sets the <code>dimensionalWeight</code>.
     * <p>
     * 
     * @param pDimensionalWeight
     *            holds the new value of <code>dimensionalWeight</code>
     */
    public void setDimensionalWeight(final BigDecimal pDimensionalWeight) {
        this.dimensionalWeight = pDimensionalWeight;
    }

    /**
     * Sets the <code>flightDate</code>.
     * <p>
     * 
     * @param pFlightDate
     *            holds the new value of <code>flightDate</code>
     */
    public void setFlightDate(final Date pFlightDate) {
        this.flightDate = ContractUtility.getClonedDate(pFlightDate);
    }

    /**
     * Sets the <code>flightNumber</code>.
     * <p>
     * 
     * @param pFlightNumber
     *            holds the new value of <code>flightNumber</code>
     */
    public void setFlightNumber(final String pFlightNumber) {
        this.flightNumber = pFlightNumber;
    }

    /**
     * Sets the <code>oId</code> property.
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>prepaidCharges</code>.
     * <p>
     * 
     * @param pPrepaidCharges
     *            holds the new value of <code>prepaidCharges</code>
     */
    public void setPrepaidCharges(final List<TotalChargeEntryDto> pPrepaidCharges) {
        this.prepaidCharges = pPrepaidCharges;
    }

    /**
     * Sets the <code>pTotalCashOnDeliveryCOD</code>.
     * <p>
     * 
     * @param pTotalCashOnDeliveryCOD
     *            holds the new value of <code>pTotalCashOnDeliveryCOD</code>
     */
    public void setTotalCashOnDeliveryCOD(final BigDecimal pTotalCashOnDeliveryCOD) {
        this.totalCashOnDeliveryCOD = pTotalCashOnDeliveryCOD;
    }

    /**
     * Sets the <code>totalChargeableWeight </code>.
     * <p>
     * 
     * @param pTotalChargeableWeight
     *            holds the new value of <code>totalChargeableWeight</code>
     */
    public void setTotalChargeableWeight(final BigDecimal pTotalChargeableWeight) {
        this.totalChargeableWeight = pTotalChargeableWeight;
    }

    /**
     * Sets the <code>totalWeightCharges</code>.
     * <p>
     * 
     * @param pTotalWeightCharges
     *            holds the new value of <code>totalWeightCharges</code>
     */
    public void setTotalWeightCharges(final BigDecimal pTotalWeightCharges) {
        this.totalWeightCharges = pTotalWeightCharges;
    }

    /**
     * Sets the <code>unitType</code>.
     * <p>
     * 
     * @param pUnitType
     *            holds the new value of <code>unitType</code>
     */
    public void setUnitType(final UnitType pUnitType) {
        this.unitType = pUnitType;
    }

    /**
     * Sets the <code>valuationChargeGenIdType</code>.
     * <p>
     * 
     * @param pValuationChargeGenIdType
     *            holds the new value of <code>valuationChargeGenIdType</code>
     */
    public void setValuationChargeGenIdType(final GenIdType pValuationChargeGenIdType) {
        this.valuationChargeGenIdType = pValuationChargeGenIdType;
    }

    /**
     * Sets the <code>valuationCharges</code>.
     * <p>
     * 
     * @param pValuationCharges
     *            holds the new value of <code>valuationCharges</code>
     */
    public void setValuationCharges(final BigDecimal pValuationCharges) {
        this.valuationCharges = pValuationCharges;
    }

    /**
     * Sets the <code>volume</code>.
     * <p>
     * 
     * @param pVolume
     *            holds the new value of <code>volume</code>
     */
    public void setVolume(final Integer pVolume) {
        this.volume = pVolume;
    }

    /**
     * Sets the <code>volumeEvaluationMethod</code>.
     * <p>
     * 
     * @param pVolumeEvaluationMethod
     *            holds the new value of <code>volumeEvaluationMethod</code>
     */
    public void setVolumeEvaluationMethod(final VolumeEvaluationMethodType pVolumeEvaluationMethod) {
        this.volumeEvaluationMethod = pVolumeEvaluationMethod;
    }

    /**
     * Sets the <code>weightCharges</code>.
     * <p>
     * 
     * @param pWeightCharges
     *            holds the new value of <code>weightCharges</code>
     */
    public void setWeightCharges(final List<TotalChargeEntryDto> pWeightCharges) {
        this.weightCharges = pWeightCharges;
    }

    /**
     * Sets the <code>weightUnit</code>.
     * <p>
     * 
     * @param pWeightUnit
     *            holds the new value of <code>weightUnit</code>
     */
    public void setWeightUnit(final WeightUOMType pWeightUnit) {
        this.weightUnit = pWeightUnit;
    }
    @Override
    public String toString() {
        final StringBuilder strBuilder = new StringBuilder();
        if(this.getDimensionalWeight()!=null){
            strBuilder.append(this.getDimensionalWeight());
            strBuilder.append(" ");
        }
        if(this.getVolume()!=null){
            strBuilder.append(this.getVolume());
            strBuilder.append(" ");
        }
       if(this.getUnitType()!=null && this.getUnitType().getUnit()!=null){
           strBuilder.append(this.getUnitType().getUnit());
           strBuilder.append(" ");
       }
       if(this.getVolumeEvaluationMethod()!=null && this.getVolumeEvaluationMethod().getUnit()!=null){
        strBuilder.append(this.getVolumeEvaluationMethod().getUnit());
        strBuilder.append(" ");
       }
       if(this.getFlightNumber()!=null){
           strBuilder.append(this.getFlightNumber());
           strBuilder.append(" ");
          }
       if(this.getFlightDate()!=null){
           strBuilder.append(DateUtility.getFormattedDate(
               FrameworkConstants.DATEFORMAT,
               this.getFlightDate()));
        strBuilder.append(" ");
          }
        return strBuilder.toString();
    }
 
    public String toStringTotalCharges() {
       final StringBuilder strBuilder = new StringBuilder();
        //Face contains weight,prepaid and collect
        if (this.getWeightCharges() != null) {
            for (TotalChargeEntryDto totalChargeEntryDto : this.getWeightCharges()) {
                if(totalChargeEntryDto.getFaceIndicator()){
                    strBuilder.append("Face" );
                    strBuilder.append(" "); 
                   if( totalChargeEntryDto.getChargeGenIdType()!=null){ 
                    strBuilder.append(totalChargeEntryDto.getChargeGenIdType());
                    strBuilder.append(" "); 
                   }
                   if(totalChargeEntryDto.getCharge()!=null){
                    strBuilder.append(totalChargeEntryDto.getCharge());
                    strBuilder.append(" "); 
                   }
                    strBuilder.append(" "); 
                    
                }
               
        }
            }
        if (this.getPrepaidCharges() != null) {
            for (TotalChargeEntryDto totalChargeEntryDto : this.getPrepaidCharges()) {
                if(totalChargeEntryDto.getFaceIndicator()){
                    if(!strBuilder.toString().contains("Face")){
                    strBuilder.append("Face" );
                    strBuilder.append(" "); 
                    }
                    if( totalChargeEntryDto.getChargeGenIdType()!=null){ 
                    strBuilder.append(totalChargeEntryDto.getChargeGenIdType());
                    strBuilder.append(" "); 
                    }
                    if(totalChargeEntryDto.getCharge()!=null){
                    strBuilder.append(totalChargeEntryDto.getCharge());
                    strBuilder.append(" "); 
                    }
                    strBuilder.append(" "); 
                    
                }
               
        }
            }
        if (this.getCollectCharges() != null) {
            for (TotalChargeEntryDto totalChargeEntryDto : this.getCollectCharges()) {
                if(totalChargeEntryDto.getFaceIndicator()){
                    if(!strBuilder.toString().contains("Face")){
                    strBuilder.append("Face" );
                    strBuilder.append(" "); 
                    }
                    if( totalChargeEntryDto.getChargeGenIdType()!=null){ 
                        strBuilder.append(totalChargeEntryDto.getChargeGenIdType());
                        strBuilder.append(" "); 
                        }
                        if(totalChargeEntryDto.getCharge()!=null){
                        strBuilder.append(totalChargeEntryDto.getCharge());
                        strBuilder.append(" "); 
                        }
                    strBuilder.append(" "); 
                    
                }
               
        }
            }
        
        //Published contains WEIGHT,PREPAID,COLLECT
        if (this.getWeightCharges() != null) {
            for (TotalChargeEntryDto totalChargeEntryDto : this.getWeightCharges()) {
                if(totalChargeEntryDto.getPublishedIndicator()){
                    strBuilder.append("<br/>");
                    strBuilder.append("Published" );
                    strBuilder.append(" "); 
                   if( totalChargeEntryDto.getChargeGenIdType()!=null){ 
                    strBuilder.append(totalChargeEntryDto.getChargeGenIdType());
                    strBuilder.append(" "); 
                   }
                   if(totalChargeEntryDto.getCharge()!=null){
                    strBuilder.append(totalChargeEntryDto.getCharge());
                    strBuilder.append(" "); 
                   }
                    strBuilder.append(" "); 
                    
                }
               
        }
            }
        if (this.getPrepaidCharges() != null) {
            for (TotalChargeEntryDto totalChargeEntryDto : this.getPrepaidCharges()) {
                if(totalChargeEntryDto.getPublishedIndicator()){
                    if(!strBuilder.toString().contains("Published")){
                        strBuilder.append("<br/>");
                    strBuilder.append("Published" );
                    strBuilder.append(" "); 
                    }
                    if( totalChargeEntryDto.getChargeGenIdType()!=null){ 
                    strBuilder.append(totalChargeEntryDto.getChargeGenIdType());
                    strBuilder.append(" "); 
                    }
                    if(totalChargeEntryDto.getCharge()!=null){
                    strBuilder.append(totalChargeEntryDto.getCharge());
                    strBuilder.append(" "); 
                    }
                    strBuilder.append(" "); 
                    
                }
               
        }
            }
        if (this.getCollectCharges() != null) {
            for (TotalChargeEntryDto totalChargeEntryDto : this.getCollectCharges()) {
                if(totalChargeEntryDto.getPublishedIndicator()){
                    if(!strBuilder.toString().contains("Published")){
                        strBuilder.append("<br/>");
                    strBuilder.append("Published" );
                    strBuilder.append(" "); 
                    }
                    if( totalChargeEntryDto.getChargeGenIdType()!=null){ 
                        strBuilder.append(totalChargeEntryDto.getChargeGenIdType());
                        strBuilder.append(" "); 
                        }
                        if(totalChargeEntryDto.getCharge()!=null){
                        strBuilder.append(totalChargeEntryDto.getCharge());
                        strBuilder.append(" "); 
                        }
                    strBuilder.append(" "); 
                    
                }
               
        }
            }
        
        //Actual Contains WEIGHT,VALUATION,PREPAID,COLLECT,COD
        if (this.getWeightCharges() != null) {
            for (TotalChargeEntryDto totalChargeEntryDto : this.getWeightCharges()) {
                if(totalChargeEntryDto.getActualIndicator()){
                    strBuilder.append("<br/>");
                    strBuilder.append("Actual" );
                    strBuilder.append(" "); 
                   if( totalChargeEntryDto.getChargeGenIdType()!=null){ 
                    strBuilder.append(totalChargeEntryDto.getChargeGenIdType());
                    strBuilder.append(" "); 
                   }
                   if(totalChargeEntryDto.getCharge()!=null){
                    strBuilder.append(totalChargeEntryDto.getCharge());
                    strBuilder.append(" "); 
                   }
                    strBuilder.append(" "); 
                    
                }
               
        }
            }
        
        if(this.getValuationChargeGenIdType()!=null){
            strBuilder.append(this.getValuationChargeGenIdType());
            strBuilder.append(" ");
           }
        if(this.getValuationCharges()!=null){
            strBuilder.append(this.getValuationCharges());
            strBuilder.append(" ");
           }
        if (this.getPrepaidCharges() != null) {
            for (TotalChargeEntryDto totalChargeEntryDto : this.getPrepaidCharges()) {
                if(totalChargeEntryDto.getActualIndicator()){
                    if(!strBuilder.toString().contains("Actual")){
                        strBuilder.append("<br/>");
                    strBuilder.append("Actual" );
                    strBuilder.append(" "); 
                    }
                    if( totalChargeEntryDto.getChargeGenIdType()!=null){ 
                    strBuilder.append(totalChargeEntryDto.getChargeGenIdType());
                   // strBuilder.append(" $$$"); 
                    strBuilder.append(" "); 
                    }
                    if(totalChargeEntryDto.getCharge()!=null){
                    strBuilder.append(totalChargeEntryDto.getCharge());
                    strBuilder.append(" "); 
                    }
                    strBuilder.append(" "); 
                    
                }
               
        }
            }
        if (this.getCollectCharges() != null) {
            for (TotalChargeEntryDto totalChargeEntryDto : this.getCollectCharges()) {
                if(totalChargeEntryDto.getActualIndicator()){
                    if(!strBuilder.toString().contains("Actual")){
                        strBuilder.append("<br/>");
                    strBuilder.append("Actual" );
                    strBuilder.append(" "); 
                    }
                    if( totalChargeEntryDto.getChargeGenIdType()!=null){ 
                        strBuilder.append(totalChargeEntryDto.getChargeGenIdType());
                        strBuilder.append(" "); 
                        }
                        if(totalChargeEntryDto.getCharge()!=null){
                        strBuilder.append(totalChargeEntryDto.getCharge());
                        strBuilder.append(" "); 
                        }
                    strBuilder.append(" "); 
                    
                }
        }
            if(this.getCodChargeGenIdType()!=null){
                strBuilder.append(this.getCodChargeGenIdType());
                strBuilder.append(" ");
               }
            if(this.getCodCharges()!=null){
                strBuilder.append(this.getCodCharges());
                strBuilder.append(" ");
               }
            
            }
        return strBuilder.toString();
        
        
    }

}
