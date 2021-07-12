package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;

public class StationInfoDayHoursDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 337477304362725646L;

    private String label;

    private Long oId;

    private String value;

    private int labelOrder;

    private Long labelOId;

    public Long getLabelOId() {
        return this.labelOId;
    }

    public void setLabelOId(final Long pLabelOId) {
        this.labelOId = pLabelOId;
    }

    public String getLabel() {
        return this.label;
    }

    public Long getOId() {
        return this.oId;
    }

    public String getValue() {
        return this.value;
    }

    public String getValueToDisplay() {
        String valueToDisplay=null;
        if (this.value != null && this.value.length() > 0) {
            valueToDisplay = this.value.replaceAll(" ", "<BR>");
        }
        return valueToDisplay;
    }

    public void setLabel(final String pLabel) {
        this.label = pLabel;
    }

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    public void setValue(final String pValue) {
        this.value = pValue;
    }

    public int getLabelOrder() {
        return this.labelOrder;
    }

    public void setLabelOrder(final int pLabelOrder) {
        this.labelOrder = pLabelOrder;
    }

}
