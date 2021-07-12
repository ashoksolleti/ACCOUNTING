package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HostDefinedSPLSFindResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Attribute to hold the <code>airwaybillNumber</code> object.
	 */ 
	private String airwaybillNumber;
	/**
	 * Attribute to hold the <code>ttyAddress</code> object.
	 */
	private String ttyAddress;
	
	private String dbKey;
	
	private boolean allHostDefined;
	
	private List<String> spls;
	
	private String splCode;
	
	private boolean exactMatch; 
	
	private int wildCardChars;
	/**
	 * @return the exactMatch
	 */
	public boolean isExactMatch() {
		return exactMatch;
	}

	/**
	 * @param exactMatch the exactMatch to set
	 */
	public void setExactMatch(boolean exactMatch) {
		this.exactMatch = exactMatch;
	}

	public String getAirwaybillNumber() {
		return airwaybillNumber;
	}

	public void setAirwaybillNumber(String airwaybillNumber) {
		this.airwaybillNumber = airwaybillNumber;
	}

	public String getTtyAddress() {
		return ttyAddress;
	}

	public void setTtyAddress(String ttyAddress) {
		this.ttyAddress = ttyAddress;
	}

	public List<String> getSpls() {
		return spls;
	}

	public void setSpls(List<String> spls) {
		this.spls = spls;
	}
	
	public void addSpls(String spl){
		if(this.getSpls()==null){
			this.setSpls(new ArrayList<String>());
		}
		this.getSpls().add(spl);
	
	}

	/**
	 * @return the wildCardChars
	 */
	public int getWildCardChars() {
		return wildCardChars;
	}

	/**
	 * @param wildCardChars the wildCardChars to set
	 */
	public void setWildCardChars(int wildCardChars) {
		this.wildCardChars = wildCardChars;
	}

	/**
	 * @return the dbKey
	 */
	public String getDbKey() {
		return dbKey;
	}

	/**
	 * @param dbKey the dbKey to set
	 */
	public void setDbKey(String dbKey) {
		this.dbKey = dbKey;
	}

	/**
	 * @return the allHostDefined
	 */
	public boolean isAllHostDefined() {
		return allHostDefined;
	}

	/**
	 * @param allHostDefined the allHostDefined to set
	 */
	public void setAllHostDefined(boolean allHostDefined) {
		this.allHostDefined = allHostDefined;
	}

	public String getSplCode() {
		return splCode;
	}

	public void setSplCode(String splCode) {
		this.splCode = splCode;
		this.addSpls(splCode); 
	}
}
