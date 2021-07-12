package com.unisys.trans.logistics.lms.framework.constants;


public enum AWBStatusType {


    /**
     * Booking Done
     */
    B("Booked"),
    /**
     * AirWaybill Created.
     */
    S("SDC Completed"),
    
    X("X"),
    
    R("Reference"),
    
    Q("AWB Assigned");
      
    //private String statusCode;
    
   private String description;
	
	
	AWBStatusType(final String desc) {
		
	//	this.statusCode= pStatusCode;
		this.description=desc;
	}

	 /**
     * Gets the <code>ExportPaymentType</code>.
     * <p>
     * 
     * @param pExportPaymentType
     *        the new value of <code>ExportPaymentType</code>.
     *        <p>
     * @return the current value of <code>ExportPaymentType</code>.
     */
    public static AWBStatusType getStatus( final String pStatusCode) {

    	AWBStatusType aStatusCode = null;
        if (pStatusCode != null) {
            for ( final AWBStatusType aType : AWBStatusType.values() ) {

                if (pStatusCode.equals( aType.name())) {
                	aStatusCode = aType;
                    break;
                }
            }
        }

        return aStatusCode;

    }

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
    
}
