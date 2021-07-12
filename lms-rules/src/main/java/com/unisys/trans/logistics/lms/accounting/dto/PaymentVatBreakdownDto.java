package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class PaymentVatBreakdownDto extends PersistenceObjectDto{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean create = false;

	private boolean delete = false;

	private boolean update = false;
	
	private boolean inter = false; 
	
	private ActionType actionType;

	
	
	
	

	private Long oId;
	


	private String code;
	private BigDecimal amount;
	private boolean error;
	
	
	public Long getoId() {
		return oId;
	}


	public void setoId(Long oId) {
		this.oId = oId;
	}
	
	public boolean isError() {
		return error;
	}


	public void setError(boolean error) {
		this.error = error;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public BigDecimal getAmount() {
		return amount;
	}


	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	

    public boolean isCreate() {
		return create;
	}


	public void setCreate(boolean create) {
		this.create = create;
	}


	public boolean isDelete() {
		return delete;
	}


	public void setDelete(boolean delete) {
		this.delete = delete;
	}


	public boolean isUpdate() {
		return update;
	}


	public void setUpdate(boolean update) {
		this.update = update;
	}


	public boolean isInter() {
		return inter;
	}


	public void setInter(boolean inter) {
		this.inter = inter;
	}


	public ActionType getActionType() {
		return actionType;
	}


	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}


	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}


	



	
	
}
