package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class InterlineInwardReasonCodeFindRequest extends AbstractRequest {

    /**
     * 
     */
    private static final long serialVersionUID = 8838540883420142369L;

    /**
     * Attribute to hold the <code>exactMatchRequiredIndicator</code> property.
     * <p>
     * Indicates if the system should return an exact match of the reason code provided as a filter.
     */
    private boolean exactMatchRequiredIndicator;

    private String reasonCode;

    /**
     * Attribute to hold the <code>sortCode</code> property.
     */
    private String sortCode;
    
    private MemoType memoType;
    
    public MemoType getMemoType() {
		return memoType;
	}

	public void setMemoType(MemoType memoType) {
		this.memoType = memoType;
	}

	public boolean isAwbBreakdownInd() {
		return awbBreakdownInd;
	}

	public void setAwbBreakdownInd(boolean awbBreakdownInd) {
		this.awbBreakdownInd = awbBreakdownInd;
	}

	private boolean awbBreakdownInd;

    public String getReasonCode() {
        return this.reasonCode;
    }

    public String getSortCode() {
        return this.sortCode;
    }

    public boolean isExactMatchRequiredIndicator() {
        return this.exactMatchRequiredIndicator;
    }

    public void setExactMatchRequiredIndicator(final boolean pExactMatchRequiredIndicator) {
        this.exactMatchRequiredIndicator = pExactMatchRequiredIndicator;
    }

    public void setReasonCode(final String pReasonCode) {
        this.reasonCode = pReasonCode;
    }

    public void setSortCode(final String pSortCode) {
        this.sortCode = pSortCode;
    }

}
