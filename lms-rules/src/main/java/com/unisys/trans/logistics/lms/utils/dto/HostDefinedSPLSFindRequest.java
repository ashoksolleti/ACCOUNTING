package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HostDefinedSPLSFindRequest implements Serializable {

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
	private String ttyAddress_value;
	private String ttyAddress_carrier;
	private List<String> ttyAddressList;
	
	private boolean exactMatch;
	
	private String dbKey;
	
	private List<String> spls;

	
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

	public Boolean checkExactMatch(String match) {
		this.setExactMatch(this.getTtyAddress().equalsIgnoreCase(match));
		return this.isExactMatch();
	}

	public boolean isExactMatch() {
		return exactMatch;
	}

	public void setExactMatch(boolean exactMatch) {
		this.exactMatch = exactMatch;
	}

	public boolean isMatching(String pattern) {
		pattern.toUpperCase();
		pattern=pattern.replaceAll("#", "\\.");
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(this.getTtyAddress());
		return m.find();
	}

	/**
	 * @return the spls
	 */
	public List<String> getSpls() {
		return spls;
	}

	/**
	 * @param spls the spls to set
	 */
	public void setSpls(List<String> spls) {
		this.spls = spls;
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

	public String getTtyAddress_value() {
		return ttyAddress_value;
	}

	public void setTtyAddress_value(String ttyAddress_value) {
		this.ttyAddress_value = ttyAddress_value;
	}

	public String getTtyAddress_carrier() {
		return ttyAddress_carrier;
	}

	public void setTtyAddress_carrier(String ttyAddress_carrier) {
		this.ttyAddress_carrier = ttyAddress_carrier;
	}

	public List<String> getTtyAddressList() {
		return ttyAddressList;
	}

	public void setTtyAddressList(List<String> ttyAddressList) {
		this.ttyAddressList = ttyAddressList;
	}
	
	
	
	
}
