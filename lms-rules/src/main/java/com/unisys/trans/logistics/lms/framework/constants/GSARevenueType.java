package com.unisys.trans.logistics.lms.framework.constants;

public enum GSARevenueType {
	
	GROSS_REVENUE("Gross Revenue"), NET_REVENUE("Net Revenue"), NET_NET_REVENUE("Net-Net Revenue");
	
	private final String revenueType;
	
	public String getType() {
        return this.revenueType;
    }
	
	public String value() {
        return this.name();
    }
	
	GSARevenueType(final String pFrequencyType)
	{
		this.revenueType = pFrequencyType;
	}
	
	public static GSARevenueType getRevenueType(
            final String pFrequencyType) {

		GSARevenueType aGSARevenueType = null;

    for (final GSARevenueType aRevenueType : GSARevenueType.values()) {

        if (pFrequencyType.equalsIgnoreCase(aRevenueType.getType())) {
        	aGSARevenueType = aRevenueType;
            break;
        }
    }

    return aGSARevenueType;

}


}
