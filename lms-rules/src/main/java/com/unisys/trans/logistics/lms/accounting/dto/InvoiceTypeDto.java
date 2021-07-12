package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class InvoiceTypeDto extends PersistenceObjectDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long oId;
	private static final String EMPTY_STRING = "";
	private ActionType actionType;

	private String templateName;

	private String templateLevel;

	private String template;

	private String templateIdentifer;
	
	private String participantTypeForCountry;

	private String templateType;

	private boolean create;
	private boolean update;
	private boolean delete;

	private boolean error;

	// NAC004
	private String specificAirline;

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return this.oId;
	}

	/**
	 * @param oId
	 *            the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

	/**
	 * @return the templateName
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * @param templateName
	 *            the templateName to set
	 */
	public void setTemplateName(String templateName) {
		this.templateName = ContractUtility.convertToUpperCase(templateName);
	}

	/**
	 * @return the templateLevel
	 */
	public String getTemplateLevel() {
		return templateLevel;
	}

	/**
	 * @param templateLevel
	 *            the templateLevel to set
	 */
	public void setTemplateLevel(String templateLevel) {
		this.templateLevel = templateLevel;
	}

	/**
	 * @return the template
	 */
	public String getTemplate() {
		return template;
	}

	/**
	 * @param template
	 *            the template to set
	 */
	public void setTemplate(String template) {
		this.template = template;
	}

	/**
	 * @return the templateIdentifer
	 */
	public String getTemplateIdentifer() {
		return templateIdentifer;
	}

	/**
	 * @param templateIdentifer
	 *            the templateIdentifer to set
	 */
	public void setTemplateIdentifer(String templateIdentifer) {	
			this.templateIdentifer = templateIdentifer;		 
	}
	
	/**
	 * @return the templateIdentifer
	 */
	public String getParticipantTypeForCountry() {
		return participantTypeForCountry;
	}

	/**
	 * @param templateIdentifer
	 *            the templateIdentifer to set
	 */
	public void setParticipantTypeForCountry(String participantTypeForCountry) {
		this.participantTypeForCountry = participantTypeForCountry;
	}

	/**
	 * @return the templateType
	 */
	public String getTemplateType() {
		return templateType;
	}

	/**
	 * @param templateType
	 *            the templateType to set
	 */
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

	/**
	 * @return the create
	 */
	public boolean isCreate() {
		return create;
	}

	/**
	 * @param create
	 *            the create to set
	 */
	public void setCreate(boolean create) {
		this.create = create;
	}

	/**
	 * @return the update
	 */
	public boolean isUpdate() {
		return update;
	}

	/**
	 * @param update
	 *            the update to set
	 */
	public void setUpdate(boolean update) {
		this.update = update;
	}

	/**
	 * @return the delete
	 */
	public boolean isDelete() {
		return delete;
	}

	/**
	 * @param delete
	 *            the delete to set
	 */
	public void setDelete(boolean delete) {
		this.delete = delete;
	}

	/**
	 * @return the error
	 */
	public boolean isError() {
		return error;
	}

	/**
	 * @param error
	 *            the error to set
	 */
	public void setError(boolean error) {
		this.error = error;
	}

	/**
	 * @return the actionType
	 */
	public ActionType getActionType() {
		return actionType;
	}

	/**
	 * @param actionType
	 *            the actionType to set
	 */
	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}

	/* NAC004 Starts */
	/**
	 * @return the specificAirline
	 */
	public String getSpecificAirline() {
		return this.specificAirline;
	}

	/**
	 * @param specificAirline
	 *            the specificAirline to set
	 */
	public void setSpecificAirline(final String specificAirline) {

		this.specificAirline = specificAirline;
	}

	/* NAC004 Ends */
	public String toString() {
		// SuppressOn:MagicNumber
		final StringBuffer csvString = new StringBuffer();
		// SuppressOff:MagicNumber
		if (this.actionType != null && this.actionType.equals(ActionType.FIND)) {

			if (this.getTemplateName() != null) {
				csvString.append(this.prefixSuffixByQuotes(this
						.getTemplateName()));
			} else {

				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}

			if (this.getTemplateLevel() != null) {
				csvString.append(this.prefixSuffixByQuotes(this
						.getTemplateLevel()));
			} else {

				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}

		} else {
			if (this.getTemplateName() != null) {
				csvString.append(this.prefixSuffixByQuotes(this
						.getTemplateName()));
			} else {

				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}

			if (this.getTemplateLevel() != null) {
				csvString.append(this.prefixSuffixByQuotes(this
						.getTemplateLevel()));
			} else {

				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}

			if (this.getTemplateIdentifer() != null) {
				csvString.append(this.prefixSuffixByQuotes(this
						.getTemplateIdentifer()));
			} else {

				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}

			if (this.getTemplate() != null) {
				csvString.append(this.prefixSuffixByQuotes(this.getTemplate()));
			} else {

				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

			}
		}
		return csvString.toString();
	}

	/**
	 * prefixes and suffixes a given string with open quotes.
	 * 
	 * @param pString
	 *            the new value of the <code>value</code>.
	 * 
	 * @return aModifiedString the new value of the <code>aModifiedString</code>
	 *         .
	 * 
	 * 
	 */
	private String prefixSuffixByQuotes(final String pString) {
		final String aQUOTATION = "\"";
		final String aCOMMA = ",";
		final StringBuffer aModifiedString = new StringBuffer();
		aModifiedString.append(aQUOTATION);
		aModifiedString.append(pString);
		aModifiedString.append(aQUOTATION);
		aModifiedString.append(aCOMMA);
		return aModifiedString.toString();
	}

}
