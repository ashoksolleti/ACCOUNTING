package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.AWBNumberDto;
import com.unisys.trans.logistics.lms.rating.dto.constants.AllotmentCategoryType;

/**
 * <code>AirWaybillDto</code> identifies the air waybill to be priced.
 */
public class AirWaybillDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1336208952805084196L;

    /**
     * Input option to denote if the rating request is for actual rates only.<br />
     * Yes- Rate with Actual rates only.
     * 
     */
    private boolean actualRatesIndicator;

    /**
     * Carrier code corresponding to the Air waybill ACN (Airline/Carrier Code
     * Number)
     * 
     */
    private String awbCarrierCode;

    /**
     * Execution date of the air waybill
     * 
     */
    private Date awbExecutionDate;

    /**
     * Indicator to denote if AWB is host<br />
     * Yes – AWB is host or Reference AWB.<br />
     * No – AWB is not host and Reference AWB.<br />
     * 
     */
    private boolean awbHostIndicator;

    /**
     * The air waybill number of the shipment.
     * 
     */
    private AWBNumberDto awbNumber;

    private AWBNumberDto awbReferenceNumber;

    /**
     * The routing of the air waybill
     * 
     */
    private List<RoutingDto> awbRouting;

    /**
     * Holds the input awbType value
     * 
     */
    private String awbType;

    /**
     * Bank selling rate for Origin-Destination
     * 
     */
    private BigDecimal bankSellingRate;

    /**
     * Export payment code of the shipment.
     * 
     */
    private String exportPaymentCode;

    /**
     * Currency of Air Waybill Origin
     * 
     */
    private String originCurrencyCode;

    /**
     * Product Code of the shipment.
     * 
     */
    private String productCode;

    /**
     * Input that denotes number of rating lines in the request.
     */
    private Integer ratingLineCount;

    /**
     * Special handling codes of the shipment.
     * 
     */
    private List<String> specialHandlingCodes;

    /**
     * Unit of weight
     * 
     */
    private WeightUOMType weightUnit;

    /**
     * @return the actualRatesIndicator
     * 
     */
    public boolean getActualRatesIndicator() {
        return this.actualRatesIndicator;
    }

    /**
     * @return the awbCarrierCode
     * 
     */
    public String getAwbCarrierCode() {
        return this.awbCarrierCode;
    }

    /**
     * @return the awbExecutionDate
     */
    public Date getAwbExecutionDate() {
        return ContractUtility.getClonedDate(this.awbExecutionDate);
    }

    /**
     * @return the awbHostIndicator
     * 
     */
    public boolean getAwbHostIndicator() {
        return this.awbHostIndicator;
    }

    /**
     * @return the awbNumber
     * 
     */
    public AWBNumberDto getAwbNumber() {
        return this.awbNumber;
    }

    public AWBNumberDto getAwbReferenceNumber() {
        return this.awbReferenceNumber;
    }

    public List<RoutingDto> getAwbRouting() {
        return this.awbRouting;
    }

    public String getAwbType() {
        return this.awbType;
    }

    /**
     * @return the bankSellingRate
     */
    public BigDecimal getBankSellingRate() {
        return this.bankSellingRate;
    }

    public String getDestination() {
        String aDest = null;
        int lastitem = 0;
        if (awbRouting != null && !awbRouting.isEmpty()) {
            lastitem = awbRouting.size() - 1;
            aDest = awbRouting.get(lastitem).getAirportCode();
        }
        return aDest;

    }

    /**
     * 
     * @return the exportPaymentCode
     */
    public String getExportPaymentCode() {
        return this.exportPaymentCode;
    }

    public String getOrigin() {
        String aOrigin = null;
        if (awbRouting != null && !awbRouting.isEmpty()) {
            aOrigin = awbRouting.get(0).getAirportCode();
        }
        return aOrigin;
    }

    /**
     * @return the originCurrencyCode
     */
    public String getOriginCurrencyCode() {
        return this.originCurrencyCode;
    }

    /**
     * @return the productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public Integer getRatingLineCount() {
        return this.ratingLineCount;
    }

    /**
     * @return the specialHandlingCode
     */
    public List<String> getSpecialHandlingCodes() {
        return this.specialHandlingCodes;
    }

    /**
     * @return the weightUnit
     */
    public WeightUOMType getWeightUnit() {
        return this.weightUnit;
    }

    /**
     * @param actualRatesIndicator
     *            the actualRatesIndicator to set
     */
    public void setActualRatesIndicator(final boolean pActualRatesIndicator) {

        this.actualRatesIndicator = pActualRatesIndicator;

    }

    /**
     * @param awbCarrierCode
     *            the awbCarrierCode to set
     */
    public void setAwbCarrierCode(final String pAwbCarrierCode) {
        this.awbCarrierCode = pAwbCarrierCode;
    }

    /**
     * @param awbExecutionDate
     *            the awbExecutionDate to set
     * 
     */
    public void setAwbExecutionDate(final Date pAwbExecutionDate) {
        this.awbExecutionDate = ContractUtility.getClonedDate(pAwbExecutionDate);
    }

    /**
     * @param awbHostIndicator
     *            the awbHostIndicator to set
     */
    public void setAwbHostIndicator(final boolean pAwbHostIndicator) {
        this.awbHostIndicator = pAwbHostIndicator;
    }

    public void setAwbNumber(final AWBNumberDto pAwbNumber) {
        this.awbNumber = pAwbNumber;
    }

    public void setAwbReferenceNumber(final AWBNumberDto pAwbReferenceNumber) {
        this.awbReferenceNumber = pAwbReferenceNumber;
    }

    public void setAwbRouting(final List<RoutingDto> pAwbRouting) {
        this.awbRouting = pAwbRouting;
    }

    public void setAwbType(final String pAwbType) {
        this.awbType = pAwbType;
    }

    /**
     * @param bankSellingRate
     *            the bankSellingRate to set
     * 
     */
    public void setBankSellingRate(final BigDecimal pBankSellingRate) {
        this.bankSellingRate = pBankSellingRate;
    }

    /**
     * @param exportPaymentCode
     *            the exportPaymentCode to set
     */
    public void setExportPaymentCode(final String pExportPaymentCode) {
        this.exportPaymentCode = pExportPaymentCode;
    }

    /**
     * @param originCurrencyCode
     *            the originCurrencyCode to set
     */
    public void setOriginCurrencyCode(final String pOriginCurrencyCode) {
        this.originCurrencyCode = pOriginCurrencyCode;
    }

    /**
     * @param productCode
     *            the productCode to set
     */
    public void setProductCode(final String pProductCode) {
        this.productCode = pProductCode;
    }

    public void setRatingLineCount(final Integer pRatingLineCount) {
        this.ratingLineCount = pRatingLineCount;
    }

    /**
     * @param specialHandlingCode
     *            the specialHandlingCode to set
     */
    public void setSpecialHandlingCodes(final List<String> pSpecialHandlingCodes) {
        this.specialHandlingCodes = pSpecialHandlingCodes;
    }

    /**
     * @param weightUnit
     *            the weightUnit to set
     */
    public void setWeightUnit(final WeightUOMType pWeightUnit) {
        this.weightUnit = pWeightUnit;
    }

    private boolean allomentRestrictedIndicator;

    private AllotmentCategoryType allotmentCategory;

    public boolean getAllomentRestrictedIndicator() {
        return this.allomentRestrictedIndicator;
    }

    public void setAllomentRestrictedIndicator(final boolean pAllomentRestrictedIndicator) {
        this.allomentRestrictedIndicator = pAllomentRestrictedIndicator;
    }

    public AllotmentCategoryType getAllotmentCategory() {
        return allotmentCategory;
    }

    public void setAllotmentCategory(final AllotmentCategoryType pAllotmentCategory) {
        this.allotmentCategory = pAllotmentCategory;
    }
}