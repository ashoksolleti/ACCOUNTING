package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;

public class ExemptionReasonDto implements Serializable{

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String reasonCode;
	
	private String reasonText;
	
	private String language;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the reasonCode
	 */
	public String getReasonCode() {
		return reasonCode;
	}

	/**
	 * @param reasonCode the reasonCode to set
	 */
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	/**
	 * @return the reasonText
	 */
	public String getReasonText() {
		return reasonText;
	}

	/**
	 * @param reasonText the reasonText to set
	 */
	public void setReasonText(String reasonText) {
		this.reasonText = reasonText;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}	

}
