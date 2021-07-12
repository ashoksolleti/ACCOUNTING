package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/**
 * Indicates the type of Primary Id Type.
 */
public enum PrimaryIdType {
    /**
     * Passport.
     */
	PASSPORT("Passport","P"),
	
	/**
     * Driver's License.
     */
	DRIVERS_LICENSE("Driver's License","D"),
	
	/**
     * Other Government Issued ID.
     */
	OTHER_GOVERNMENT_ISSUED_ID("Other Government Issued ID","G"),
	
	/**
     * SIDA Badge.
     */
	SIDA_BADGE("SIDA Badge","B"),
	
	/**
     * Regulated Agent Company ID.
     */
	REGULATED_AGENT_COMPANY_ID("Regulated Agent Company ID","H");
	
	private String primaryIdChar;
	public String getPrimaryIdChar() {
        return primaryIdChar;
    }

    public void setPrimaryIdChar(String primaryIdChar) {
        this.primaryIdChar = primaryIdChar;
    }

    private String code;

	PrimaryIdType(final String pCode, final String pPrimaryIdChar) {
        this.code = pCode;
        this.primaryIdChar = pPrimaryIdChar;
    }

    /**
     * Gets the value of the <code>code</code> property.
     * <p>
     *
     * @return Returns the current value of <code>code</code> property.
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the <code>code</code> property.
     * <p>
     *
     * @param <code>code</code>
     *        Holds the new value of the <code>code</code> property.
     */
    public void setCode(String code) {
        this.code = code;
    }

    public static PrimaryIdType getByPrimaryIdCode(String pPrimaryIdType) {
        PrimaryIdType aReturnedPrimaryIdType = null;
        for(PrimaryIdType aPrimaryIdType:PrimaryIdType.values()){
            if(aPrimaryIdType.getPrimaryIdChar().equalsIgnoreCase(pPrimaryIdType)){
                aReturnedPrimaryIdType = aPrimaryIdType;
            }
        }        
        return aReturnedPrimaryIdType;
    }
}