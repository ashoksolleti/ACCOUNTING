package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class GSAAgreementRatesDto extends PersistenceObjectDto {

    private static final long serialVersionUID = 1L;

    private Long oId;

    private Integer awbVolRangeFrom;

    private Integer awbVolRangeTo;

    private BigDecimal ratePerAwb;

    private BigDecimal flatCharge;

    private BigDecimal percentage;

    private boolean create = false;

    private boolean delete = false;

    private boolean update = false;

    /**
     * @return the oId
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * @return the oId
     */
    public Long getoId() {
        return this.oId;
    }

    /**
     * @param oId
     *            the oId to set
     */
    public void setoId(Long oId) {
        this.oId = oId;
    }

    /**
     * @return the awbVolRangeFrom
     */
    public Integer getAwbVolRangeFrom() {
        return awbVolRangeFrom;
    }

    /**
     * @param awbVolRangeFrom
     *            the awbVolRangeFrom to set
     */
    public void setAwbVolRangeFrom(Integer awbVolRangeFrom) {
        this.awbVolRangeFrom = awbVolRangeFrom;
    }

    /**
     * @return the awbVolRangeTo
     */
    public Integer getAwbVolRangeTo() {
        return awbVolRangeTo;
    }

    /**
     * @param awbVolRangeTo
     *            the awbVolRangeTo to set
     */
    public void setAwbVolRangeTo(Integer awbVolRangeTo) {
        this.awbVolRangeTo = awbVolRangeTo;
    }

    /**
     * @return the ratePerAwb
     */
    public BigDecimal getRatePerAwb() {
        return ratePerAwb;
    }

    /**
     * @param ratePerAwb
     *            the ratePerAwb to set
     */
    public void setRatePerAwb(BigDecimal ratePerAwb) {
        this.ratePerAwb = ratePerAwb;
    }

    /**
     * @return the flatCharge
     */
    public BigDecimal getFlatCharge() {
        return flatCharge;
    }

    /**
     * @param flatCharge
     *            the flatCharge to set
     */
    public void setFlatCharge(BigDecimal flatCharge) {
        this.flatCharge = flatCharge;
    }

    /**
     * @return the create
     */
    public boolean isCreate() {
        return create;
    }

    /**
     * @param create
     *            the create to set
     */
    public void setCreate(boolean create) {
        this.create = create;
    }

    /**
     * @return the delete
     */
    public boolean isDelete() {
        return delete;
    }

    /**
     * @param delete
     *            the delete to set
     */
    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    /**
     * @return the update
     */
    public boolean isUpdate() {
        return update;
    }

    /**
     * @param update
     *            the update to set
     */
    public void setUpdate(boolean update) {
        this.update = update;
    }

    /**
     * @return the percentage
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * @param percentage
     *            the percentage to set
     */
    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

}
