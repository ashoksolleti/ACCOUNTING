package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

public class CheckListInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2862805060468230350L;
	
	private String checkListFileName;
	
	private String checkListDisplayName;

	/**
	 * @return the checkListFileName
	 */
	public String getCheckListFileName() {
		return checkListFileName;
	}

	/**
	 * @param checkListFileName the checkListFileName to set
	 */
	public void setCheckListFileName(String checkListFileName) {
		this.checkListFileName = checkListFileName;
	}

	/**
	 * @return the checkListDisplayName
	 */
	public String getCheckListDisplayName() {
		return checkListDisplayName;
	}

	/**
	 * @param checkListDisplayName the checkListDisplayName to set
	 */
	public void setCheckListDisplayName(String checkListDisplayName) {
		this.checkListDisplayName = checkListDisplayName;
	}

}
