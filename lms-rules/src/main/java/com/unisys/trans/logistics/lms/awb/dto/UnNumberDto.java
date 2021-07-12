package com.unisys.trans.logistics.lms.awb.dto;

import java.io.Serializable;

public class UnNumberDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//default constructor.
	public UnNumberDto(){
		
	}
	
	public UnNumberDto(String unNUmber){
		this.unNumber=unNUmber;
	}
	private String unNumber;

	/**
	 * Returns the un number.
	 * 
	 * @return returns the un number.
	 */
	public String getUnNumber() {
		return unNumber;
	}

	/**
	 * sets the un number.
	 * 
	 * @param unNumber
	 *            the un number to be set.
	 */
	public void setUnNumber(String unNumber) {
		this.unNumber = unNumber;
	}

}
