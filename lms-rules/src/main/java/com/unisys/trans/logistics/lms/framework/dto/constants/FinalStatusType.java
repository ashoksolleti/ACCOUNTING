package com.unisys.trans.logistics.lms.framework.dto.constants;


public enum FinalStatusType {
    
    BONDED_WAREHOUSE("Bonded Warehouse"),
   
    DELIVERED("Delivered"),
   
    GONE_ON_DELIVERY("Gone on Delivery"),
   
    DELIVERED_ON_SUBSTITUTE_AIRWAYBILL("Delivered on Substitute Air Waybill"),
  
    TRANSFERED_SURFACE("Transferred Surface");
 
    private String finalStatusType;

    
    public String getFinalStatusType() {
		return finalStatusType;
	}

	public void setFinalStatusType(String finalStatusType) {
		this.finalStatusType = finalStatusType;
	}

	private FinalStatusType(String finalStatusType) {
		this.finalStatusType = finalStatusType;
	}



    public String value() {
        return this.finalStatusType;
    }
    
    /**
	 * Gets the <code>finalStatusType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>pFinalStatusType</code> property.
	 */
	
	public static FinalStatusType getFinalStatusType(
			final String pFinalStatusType) {

		FinalStatusType aFinalStatusType = null;

		for (final FinalStatusType aType : FinalStatusType.values()) {

			if (pFinalStatusType.equals(aType.value())) {
				aFinalStatusType = aType;
				break;
			}
		}

		return aFinalStatusType;

	}
	
}