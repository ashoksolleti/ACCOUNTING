package com.unisys.trans.logistics.lms.awb.constants;

//AC446- new Enum created
public enum GoodsAssignmentType {

	GOODS_TO_FLIGHT("L"),
	TCON_TO_FLIGHT("T"),
	ULD_TO_FLIGHT("U");
	/**
	 * Used to store the <code>assignmentCode</code>
	 */
	private String assignmentCode;
	
	GoodsAssignmentType(final String pAssignmentCode){
		this.assignmentCode=pAssignmentCode;
	}

	/**
	 * @return the assignmentCode
	 */
	public String getAssignmentCode() {
		return assignmentCode;
	}

	/**
	 * @param assignmentCode the assignmentCode to set
	 */
	public void setAssignmentCode(String assignmentCode) {
		this.assignmentCode = assignmentCode;
	}

	public static GoodsAssignmentType getGoodsAssignmentType(final String pString) {
		GoodsAssignmentType aMatchingGoodsAssignmentType = null;
		for(GoodsAssignmentType aGoodsAssignmentType: GoodsAssignmentType.values()){
			if(aGoodsAssignmentType.getAssignmentCode().equalsIgnoreCase(pString)){
				aMatchingGoodsAssignmentType = aGoodsAssignmentType;
			}
		}
		return aMatchingGoodsAssignmentType;
	}
	
}
