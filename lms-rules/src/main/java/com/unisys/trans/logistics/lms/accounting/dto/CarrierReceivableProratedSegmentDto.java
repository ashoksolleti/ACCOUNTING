package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class CarrierReceivableProratedSegmentDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = -5323645315891222915L;

    private BigDecimal billingProrateAmount;

    private List<OtherChargeSplitDto> carrierReceivableProratedSplit;

    private BigDecimal hostProrateAmount;

    private BigDecimal prorateAmount;

    private BigDecimal prorateFactor;

    private String segmentDestination;

    private String segmentOrigin;

    public BigDecimal getBillingProrateAmount() {
        return this.billingProrateAmount;
    }

    /**
     * @return the carrierReceivableProratedSplit
     */
    public List<OtherChargeSplitDto> getCarrierReceivableProratedSplit() {
        if (this.carrierReceivableProratedSplit == null)
        {
            this.carrierReceivableProratedSplit = new ArrayList<OtherChargeSplitDto>();
        }
        return this.carrierReceivableProratedSplit;
    }

    public BigDecimal getHostProrateAmount() {
        return this.hostProrateAmount;
    }

    @Override
    public Long getOId() {
        return null;
    }

    public BigDecimal getprorateAmount() {
        return this.prorateAmount;
    }

    public BigDecimal getProrateFactor() {
        return this.prorateFactor;
    }

    public String getSegmentDestination() {
        return this.segmentDestination;
    }

    public String getSegmentOrigin() {
        return this.segmentOrigin;
    }

    public void setBillingProrateAmount(final BigDecimal pBillingProrateAmount) {
        this.billingProrateAmount = pBillingProrateAmount;
    }

    /**
     * @param carrierReceivableProratedSplit the carrierReceivableProratedSplit to set
     */
    public void setCarrierReceivableProratedSplit(
                final List<OtherChargeSplitDto> pCarrierReceivableProratedSplit) {
        this.carrierReceivableProratedSplit = pCarrierReceivableProratedSplit;
    }

    public void setHostProrateAmount(final BigDecimal pHostProrateAmount) {
        this.hostProrateAmount = pHostProrateAmount;
    }

    public void setProrateAmount(final BigDecimal pProrateAmount) {
        this.prorateAmount = pProrateAmount;
    }

    public void setProrateFactor(final BigDecimal pProrateFactor) {
        this.prorateFactor = pProrateFactor;
    }

    public void setSegmentDestination(final String pSegmentDestination) {
        this.segmentDestination = pSegmentDestination;
    }

    public void setSegmentOrigin(final String pSegmentOrigin) {
        this.segmentOrigin = pSegmentOrigin;
    }

}
