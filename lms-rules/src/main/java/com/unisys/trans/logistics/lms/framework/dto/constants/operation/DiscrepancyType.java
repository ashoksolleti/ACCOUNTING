package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

public enum DiscrepancyType {
    FOUND_AIRWAYBILL("FDAW","Found Air Waybill"),

    FOUND_CARGO("FDCA","Found Cargo"),

    MISSING_AIRWAYBILL("MSAW","Missing Air Waybill"),

    MISSING_CARGO("MSCA","Missing Cargo"),

    FOUND_MAIL_DOMCUMENT("FDAV","Found Mail Document"),

    FOUND_MAILBAG("FDMB","Found Mailbag"),

    MISSING_MAIL_DOCUMENT("MSAV","Missing Mail Document"),

    MISSING_MAILBAG("MSMB","Missing Mailbag"),

    DEFINITELY_LOADED("DFLD","Definitely Loaded"),

    OFFLOADED("OFLD","Offloaded"),

    OVER_CARRIED_CARGO("OVCD","Over Carried"),

    SHORT_SHIPPED("SSPD","Short Shipped");

    private String discrepancyCode;
    
    private String discrepancyDescription;

    DiscrepancyType(String discrepancyCode, String discrepancyDescription) {
        this.discrepancyCode = discrepancyCode;
        this.discrepancyDescription = discrepancyDescription;
    }

    public String getDiscrepancyCode() {
        return this.discrepancyCode;
    }
    
    public String getDiscrepancyDescription(){
    	return this.discrepancyDescription;
    }
    
    /**
	 * The <code>fromValue</code> method returns the DiscrepancyType value.
	 * <p>
	 * 
	 * @param pDiscrepancyCode
	 *            The request object holds the discrepancy type.<br>
	 * @return <code>DiscrepancyType</code><br>
	 *         Returns the enumerated value of the DiscrepancyType class.<br>
	 */
	public static DiscrepancyType fromValue(final String pDiscrepancyCode) {

		DiscrepancyType aDiscrepancyStatus = null;
		for (final DiscrepancyType anDiscrepancyType : DiscrepancyType.values()) {
			if (anDiscrepancyType.getDiscrepancyCode().equals(pDiscrepancyCode)) {
				aDiscrepancyStatus = anDiscrepancyType;
				break;
			}
		}
		return aDiscrepancyStatus;
	}
}
