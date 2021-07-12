package com.unisys.trans.logistics.lms.framework.dto.constants;

public enum SelectionType {

	CONFIRM_FORCE_OTHER_CHARGE_CREATION,

	PROMPT_OTHER_CHARGE_AMOUNT_USER_ENTRY,

	FORCE_ACCEPT_NO_GEN_GCR_RATES,

	CONFIRM_DUPLICATE_AIRWAYBILL,

	CONFIRM_DUPLICATE_EXP_AIRWAYBILL,

	CONFIRM_DUPLICATE_BOOKING,

	CONFIRM_ROUTING_PRICE_BOOKING_POP_UP,

	CONFIRM_CASH_DRAWER_FINALIZE,
	
	CONFIRM_NEW_DRAWER_CREATE,
	
	CONFIRM_DELETE_BOOKING_REACTIVE,

	FORCE_DELETE_BOOKING_EXIST,
	
	FORCE_ACCEPT_INVALID_PCS,
	
	FORCE_ACCEPT_INVALID_WT,

    CONFIRM_SPLIT_ALLOTMENT_FOR_PERIOD_CHANGE,

    CONFIRM_DELETE_QUEUED_ACTIVE_ALLOTMENT,

	CONFIRM_FORCE_MCT_BOOKING,
	
	CONFIRM_EMPTY_ULD,
	
	CONFIRM_TOLERANCE_TOTAL_CRU_REQUIRED,
	
	CONFIRM_TOLERANCE_RATE_CRU_REQUIRED,
	
	CONFIRM_TOLERANCE_PERCENTAGE_CRU_REQUIRED,
	
	ULD_ID_LESSTHAN_PIECES,
	
	CHARTER_AWB_CRU_REQUIRED,

	CONFIRM_SEGMENT_ROUTING_MISMATCH,  	//AC416
	
	PRICEQUOTE_AND_BOOKING_TOTALPPCHARGES_MISMATCH,
	//FIS137
	SPL_CODE_OVERRIDE,
	
	MAX_WEIGHT_OVERRIDE,
	
	DENSITY_CHECK_OVERRIDE;
	

}