package com.unisys.trans.logistics.lms.rating.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ExtractTariffDto</code> class contain information specific to a ExtractTariff rates.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>awbNumberDto
 * <li>destination
 * <li>expirationDate
 * <li>lastUpdatedDate
 * <li>origin
 * <li>sraNumber
 * </code>
 * </ul>
 */
public class SpotRateDetailDto {

    private AWBNumberDto awbNumberDto;

    private GeographicDataDto destination;

    private Date effectiveDate;

    private Date expirationDate;

    private Date lastUpdatedDate;

    private GeographicDataDto origin;

    private String sraNumber;

    /**
     * @return the awbNumberDto
     */
    public AWBNumberDto getAwbNumberDto() {
        return this.awbNumberDto;
    }

    /**
     * @return the destination
     */
    public GeographicDataDto getDestination() {
        return this.destination;
    }

    /**
     * @return the effectiveDate
     */
    public Date getEffectiveDate() {
        return ContractUtility.getClonedDate(this.effectiveDate);
    }

    /**
     * @return the expirationDate
     */
    public Date getExpirationDate() {
        return ContractUtility.getClonedDate(this.expirationDate);
    }

    /**
     * @return the lastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return ContractUtility.getClonedDate(this.lastUpdatedDate);
    }

    /**
     * @return the origin
     */
    public GeographicDataDto getOrigin() {
        return origin;
    }

    /**
     * @return the sraNumber
     */
    public String getSraNumber() {
        return sraNumber;
    }

    /**
     * @param awbNumberDto
     *            the awbNumberDto to set
     */
    public void setAwbNumberDto(AWBNumberDto awbNumberDto) {
        this.awbNumberDto = awbNumberDto;
    }

    /**
     * @param destination
     *            the destination to set
     */
    public void setDestination(GeographicDataDto destination) {
        this.destination = destination;
    }

    /**
     * @param effectiveDate
     *            the effectiveDate to set
     */
    public void setEffectiveDate(final Date pEffectiveDate) {
        this.effectiveDate = ContractUtility.getClonedDate(pEffectiveDate);
    }

    /**
     * @param expirationDate
     *            the expirationDate to set
     */
    public void setExpirationDate(final Date pExpirationDate) {
        this.expirationDate = ContractUtility.getClonedDate(pExpirationDate);
    }

    /**
     * @param lastUpdatedDate
     *            the lastUpdatedDate to set
     */
    public void setLastUpdatedDate(final Date pLastUpdatedDate) {
        this.lastUpdatedDate = ContractUtility.getClonedDate(pLastUpdatedDate);
    }

    /**
     * @param origin
     *            the origin to set
     */
    public void setOrigin(GeographicDataDto origin) {
        this.origin = origin;
    }

    /**
     * @param sraNumber
     *            the sraNumber to set
     */
    public void setSraNumber(String sraNumber) {
        this.sraNumber = sraNumber;
    }
}
