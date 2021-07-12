package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;




/**
 * The persistent class for the ACC_INWARD_REASON_CODE database table.
 * 
 */
public class AccountingInwardReasonCodeDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long oId;
    //ours
    private String code;

    private String description;

    private String type;
    

    /**
     * Attribute to hold <code>actualDataLine</code> property.
     */
    private String actualDataLine;

    public AccountingInwardReasonCodeDto() {
    }

    public void setOId(Long pOId) {
        this.oId = pOId;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = ContractUtility.convertToUpperCase(code);
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getOId() {
        // TODO Auto-generated method stub
        return this.oId;
    }

	public String getActualDataLine() {
		return actualDataLine;
	}

	public void setActualDataLine(String actualDataLine) {
		this.actualDataLine = actualDataLine;
	}

}