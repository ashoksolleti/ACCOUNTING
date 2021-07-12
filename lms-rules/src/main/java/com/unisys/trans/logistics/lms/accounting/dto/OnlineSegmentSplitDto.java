package com.unisys.trans.logistics.lms.accounting.dto;

public class OnlineSegmentSplitDto extends OtherChargeSplitDto {

    /**
     * 
     */
    private static final long serialVersionUID = -1231664712316126931L;
    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    public Long getOId() {
        return this.oId;
    }

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }
}
