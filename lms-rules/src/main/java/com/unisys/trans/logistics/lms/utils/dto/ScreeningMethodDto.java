package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;

public class ScreeningMethodDto implements Serializable{

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 1L;
	
	private String screeningCode;
	
	private String screeningCodeDesc;
	
	private String subcodeDefaults;
	
	private String iataCode;
	
	private String screeningCodes;
	
	private String applyOIChanges;

	/**
	 * @return the screeningCode
	 */
	public String getScreeningCode() {
		return screeningCode;
	}

	/**
	 * @param screeningCode the screeningCode to set
	 */
	public void setScreeningCode(String screeningCode) {
		this.screeningCode = screeningCode;
	}

	/**
	 * @return the screeningCodeDesc
	 */
	public String getScreeningCodeDesc() {
		return screeningCodeDesc;
	}

	/**
	 * @param screeningCodeDesc the screeningCodeDesc to set
	 */
	public void setScreeningCodeDesc(String screeningCodeDesc) {
		this.screeningCodeDesc = screeningCodeDesc;
	}

	/**
	 * @return the subcodeDefaults
	 */
	public String getSubcodeDefaults() {
		return subcodeDefaults;
	}

	/**
	 * @param subcodeDefaults the subcodeDefaults to set
	 */
	public void setSubcodeDefaults(String subcodeDefaults) {
		this.subcodeDefaults = subcodeDefaults;
	}

	/**
	 * @return the iataCode
	 */
	public String getIataCode() {
		return iataCode;
	}

	/**
	 * @param iataCode the iataCode to set
	 */
	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}
	
	/**
	 * @return the screeningCodes
	 */
	public String getScreeningCodes() {
		return screeningCodes;
	}

	/**
	 * @param screeningCodes the screeningCodes to set
	 */
	public void setScreeningCodes(String screeningCodes) {
		this.screeningCodes = screeningCodes;
	}

	/**
	 * @return the applyOIChanges
	 */
	public String getApplyOIChanges() {
		return applyOIChanges;
	}

	/**
	 * @param applyOIChanges the applyOIChanges to set
	 */
	public void setApplyOIChanges(String applyOIChanges) {
		this.applyOIChanges = applyOIChanges;
	}
	
}
