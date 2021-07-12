package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum ParticipantAgreementType {

    /**
     * Agent Fixed Commission.
     */
    AGENT_FIXED_COMMISSION("Agent", "Agent"),

    /**
     * GSA Agreement.
     */
    GSA_AGREEMENT("GSA", "Global Sales Agent (GSA)"),
    
    /**
     * GHA Agreement.
     */

    GHA_AGREEMENT("GHA", "Ground Handler Agent (GHA)"),

    /**
     * Pick up charges.
     */

    PICK_UP_CHARGES("Pick-up Charges", "Pick-up charges"),

    /**
     * Delivery Charges.
     */

    DELIVERY_CHARGES("Delivery Charges", "Delivery Charges"),
    
    /**
     * Pick up Operator.
     */

    PICK_UP_OPERATOR("Pick-up Operator", "Pick-up Operator"),

    /**
     * Delivery Operator.
     */

    DELIVERY_OPERATOR("Delivery Operator", "Delivery Operator"),
    
    ORIGIN_ADVANCE_CHARGE("Origin Advance Charge","Origin Advance Charge"),
    
    DESTINATION_ADVANCE_CHARGE("Destination Advance Charge","Destination Advance Charge"),
    
    EXCEMPTED_TDS("Exempted TDS","Exempted TDS"),
    
    TAX_DEDUCTED_AT_SOURCE_TDS("Tax Deducted at Source(TDS)","Tax Deducted At Source(TDS)"),

    /**
     * MGR Report.
     */
    MGR_REPORT("Minimum Guaranteed Revenue Report","MGR Report");

    /**
     * Attribute to hold <code>participantAgreement</code>.
     */
    private String participantAgreement;

    /**
     * Attribute to hold <code>participantAgreementName</code>.
     */

    private String participantAgreementName;

    /**
     * Constructor with participant agreement as an argument.
     * <p>
     * 
     * @param pType <code>String</code> Holds the participant agreement.
     */

    ParticipantAgreementType(final String pType)
    {
        this.setParticipantAgreement(pType);
    }

    /**
     * Constructor with participant agreementType and participant agreement type name as arguments.
     * <p>
     * 
     * @param pType <code>String</code> Holds the participant agreement.
     * @param pTypeName <code>String</code> Holds the participant agreement name.
     */

    ParticipantAgreementType(final String pType, final String pTypeName) {
        this.participantAgreement = pType;
        this.participantAgreementName = pTypeName;
    }

    /**
     * This method <code>getParticipantAgreementType</code> returns the participant agreement.
     * <p>
     * 
     * @param pParticipantAgreement <code>String</code><br>
     *            The value of participant agreement.
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantAgreementType
     *         ParticipantAgreementType}</code><br>
     *         Returns the enumerated value of the Participant Agreement.
     */
    public static ParticipantAgreementType getParticipantAgreementType(final String pParticipantAgreement) {

        ParticipantAgreementType aMatchedParticipantAgreement = null;

        for (final ParticipantAgreementType aType : ParticipantAgreementType.values()) {

            if (pParticipantAgreement.equals(aType.value())) {
                aMatchedParticipantAgreement = aType;
                break;
            }
        }

        return aMatchedParticipantAgreement;

    }

    /**
     * This method <code>getParticipantAgreementTypeName</code> returns the participant agreement.
     * <p>
     * 
     * @param pParticipantAgreement <code>String</code><br>
     *            The value of participant agreement.
     * @param pParticipantAgreementName <code>String</code><br>
     *            The value of participant agreement name.
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantRoleType
     *         ParticipantAgreementType}</code><br>
     *         Returns the enumerated value of the participant agreement.
     */
    public static ParticipantAgreementType getParticipantAgreementTypeName(
                final String pParticipantAgreement,
                final String pParticipantAgreementName) {

        ParticipantAgreementType aMatchedParticipantAgreement = null;

        for (final ParticipantAgreementType aType : ParticipantAgreementType.values()) {

            if (pParticipantAgreement.equals(aType.value())
                        && pParticipantAgreementName.equals(aType.agreementName())) {
                aMatchedParticipantAgreement = aType;
                break;
            }
        }

        return aMatchedParticipantAgreement;

    }

    /**
     * The <code>value</code> method gives the string format of participant agreement.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the participant agreement.
     */
    public String value() {
        return this.participantAgreement;
    }

    /**
     * The <code>value</code> method gives the string format of participant agreement name.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the participant agreement name.
     */
    public String agreementName() {
        return this.participantAgreementName;
    }

    /**
     * Gets the <code>participantAgreement</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantAgreement</code> property.
     */

    public String getParticipantAgreement() {
        return this.participantAgreement;
    }

    /**
     * Sets the <code>participantAgreement</code> data transfer object.
     * <p>
     * 
     * @param participantAgreement
     *            holds the new value of <code>participantAgreement</code> data transfer
     *            object.<br>
     */
    public void setParticipantAgreement(final String pParticipantAgreement) {
        this.participantAgreement = pParticipantAgreement;
    }

    /**
     * Gets the <code>participantAgreementName</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantAgreementName</code> property.
     */

    public String getParticipantAgreementName() {
        return this.participantAgreementName;
    }

    /**
     * Sets the <code>participantAgreementName</code> data transfer object.
     * <p>
     * 
     * @param participantAgreement
     *            holds the new value of <code>participantAgreementName</code> data transfer
     *            object.<br>
     */
    public void setParticipantAgreementName(final String pParticipantAgreementName) {
        this.participantAgreementName = pParticipantAgreementName;
    }
}
	