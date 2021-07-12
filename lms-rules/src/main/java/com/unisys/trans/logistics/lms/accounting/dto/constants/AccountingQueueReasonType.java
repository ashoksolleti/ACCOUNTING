package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>AccountingQueueReasonType</code> holds the constants to indicate AccountingQueueReasonType type
 * applied.
 * <p>
 * Following are the possible AccountingQueueReasonType type:<br>
 * <ul>
 * <li>AIRWAYBILLDOESNOTMATCH
 * <li>AIRWAYBILLNOTMATCHDATE
 * <li>AIRWAYBILLNOTMATCHCARRIERCODE
 * <li>AIRWAYBILLANDDATEMATCHES
 * <li>AIRWAYBILLANDCARRIERCODEMATCHES
 * </ul>
 */
public enum AccountingQueueReasonType {

	AIRWAYBILLDOESNOTMATCH("The Air Waybill does not exist in the system"),

	AIRWAYBILLNOTMATCHDATE("The Air Waybill exists but does not match with Execution Date"),
	
	AIRWAYBILLNOTMATCHCARRIERCODE("The Air Waybill exists but does not match with Carrier Code"),

	AIRWAYBILLANDDATEMATCHES("The Air Waybill and Execution Date matches but does not match with Carrier Code"),

	AIRWAYBILLANDCARRIERCODEMATCHES("The Air Waybill and Carrier Code matches but does not match with Execution Date."),
	
	AIRWAYBILLMORETHANONEMATCH("There is more than one Air Waybill match in the system");

	private String type;

	/**
	 * Parameterize constructor.
	 * 
	 * @param pType
	 *            the value.
	 */
	AccountingQueueReasonType(final String pType) {
		this.type = pType;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * Gives the string format of enumerated <code>AccountingQueueReasonType</code>.
	 * <p>
	 * 
	 * @return the current string value of the <code>AccountingQueueReasonType</code>.
	 */
	public String value() {
		return this.name();
	}
	
	
	/**
	 *Gets the <code>AccountingQueueReasonType</code>. <p>
	 * 
	 * @param pType holds the new value of <code>AccountingQueueReasonType</code>
	 * <p>
	 * 
	 * @return the current value of <code>AuditStatusType</code>
	 */
	public static AccountingQueueReasonType getAccountingQueueReasonType(final String pType) {

		AccountingQueueReasonType anAccountingQueueReasonType = null;

		for (final AccountingQueueReasonType aType : AccountingQueueReasonType.values()) {

			if (pType.equals(aType.getType())) {
				anAccountingQueueReasonType = aType;
				break;
			}
		}

		return anAccountingQueueReasonType;

	}
}
