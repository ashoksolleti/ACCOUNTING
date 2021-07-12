/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AdjustmentSourceType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RevenueIndicatorType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * @author 25231
 * 
 */
public class AdjustmentDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String reasonText;

    private String reasonType;

    public String getReasonType() {
        return this.reasonType;
    }

    public void setReasonType(final String pReasonType) {
        this.reasonType = pReasonType;
    }

    public ReasonTypeDto getReasonCode() {
        return this.reasonCode;
    }

    public void setReasonCode(final ReasonTypeDto pReasonCode) {
        this.reasonCode = pReasonCode;
    }

    private ReasonTypeDto reasonCode;

    public String getReasonText() {
        return this.reasonText;
    }

    public void setReasonText(final String pReasonText) {
        this.reasonText = ContractUtility.convertToUpperCase(pReasonText);
    }

    private String adjustmentNoteNumber;

    private String adjustmentComment;

    private AdjustmentSourceType adjustmentSourceType;

    private RevenueIndicatorType revenueIndicatorType;

	private String specificAirline;

    public String getAdjustmentNoteNumber() {
        return this.adjustmentNoteNumber;
    }

    public void setAdjustmentNoteNumber(final String pAdjustmentNoteNumber) {
        this.adjustmentNoteNumber = pAdjustmentNoteNumber;
    }

    public String getAdjustmentComment() {
        return this.adjustmentComment;
    }

    public void setAdjustmentComment(final String pAdjustmentComment) {
        this.adjustmentComment = ContractUtility.convertToUpperCase(pAdjustmentComment);
    }

    public AdjustmentSourceType getAdjustmentSourceType() {
        return this.adjustmentSourceType;
    }

    public void setAdjustmentSourceType(final AdjustmentSourceType pAdjustmentSourceType) {
        this.adjustmentSourceType = pAdjustmentSourceType;
    }

    public RevenueIndicatorType getRevenueIndicatorType() {
        return this.revenueIndicatorType;
    }

    public void setRevenueIndicatorType(final RevenueIndicatorType pRevenueIndicatorType) {
        this.revenueIndicatorType = pRevenueIndicatorType;
    }
    
    public String getSpecificAirline() {
    	return this.specificAirline;
    }

    /**
     * @param specificAirline the specificAirline to set
     */
    public void setSpecificAirline(final String specificAirline) {
    	this.specificAirline = specificAirline;
    }
}
