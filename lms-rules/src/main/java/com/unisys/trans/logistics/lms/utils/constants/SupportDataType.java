/**
 * 
 */
package com.unisys.trans.logistics.lms.utils.constants;

/**
 * <code>SupportDataType</code> holds the constants to indicate SupportDataType type applied.
 * <p>
 * Following are the possible SupportData types:<br>
 * <ul>
 * <li>CONTRACT_RATE - Contract Rate
 * <li>SPOT_RATE - Spot Rate
 * <li>TARIFF_RATE - Tariff Rate
 * <li>PARTICIPANT_GROUPS - Participant Groups
 * <li>AGGREGATE_INFORMATION-AGGREGATE
 * </ul>
 */
public enum SupportDataType {

	/**
     * This is an enumerated action type constant for the Contract upload operation.<br>
     */
	CONTRACTS("Contracts"),
	/**
     * This is an enumerated action type constant for the Spot rate uoload operation.<br>
     */
	SPOTRATE("Spot Rates"),
	/**
     * This is an enumerated action type constant for the tariff rate upload operation.<br>
     */
	TARIFFRATE("Tariff Rates"),
	/**
     * This is an enumerated action type constant for the participants group upload operation.<br>
     */
	PARTICIPANTGROUPS("Participant Group"),
	/**
     * This is an enumerated action type constant for the Aggregate uploads operation.<br>
     */
	AGGREGATES("Aggregates"),

	/**
	 * This is an enumerated action type constant for the Station Restriction uploads operation.<br>
	 */
	STATIONRESTRICTIONS("Station Restriction"),

	/**
	 * This is an enumerated action type constant for the Participant Contact uploads operation.<br>
	 */
	PARTICIPANTCONTACTS("Participant Contact");
	
	/**
     * This method <code>fromValue</code> returns the enumerated value.
     * <p>
     * It is a type of create,find,update,delete operation.<br>
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            The value of enumerated type.<br>
     *            </p>
     *            <p>
     * @return the enumerated value of the action type.<br>
     *         </p>
     */
	
	SupportDataType(final String pSupportDataType){
		this.setStringValue(pSupportDataType);
	}
	
	private String stringValue;
	
	public static SupportDataType fromValue(final String pValue){
		return valueOf(pValue);
	}

    /**
     * The <code>value</code> method gives the string format of action type.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the action type.<br>
     */
    public String value() {
        return this.name();
    }

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

}
