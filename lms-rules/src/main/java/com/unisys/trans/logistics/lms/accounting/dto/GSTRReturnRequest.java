package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.util.Date;

public class GSTRReturnRequest implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Date fromGSTRDate;
	
	private Date toGSTDate;
	
	private String localStationDateStr;
	
	private String filePath;
	
	private long b2bRecordCount;
	
	private long b2cRecordCount;
	
	private long crdrRecordCount;
	
	private GSTRReturnDto gstrReturnDto;

	public Date getFromGSTRDate() {
		return fromGSTRDate;
	}

	public void setFromGSTRDate(Date fromGSTRDate) {
		this.fromGSTRDate = fromGSTRDate;
	}

	public Date getToGSTDate() {
		return toGSTDate;
	}

	public void setToGSTDate(Date toGSTDate) {
		this.toGSTDate = toGSTDate;
	}
	
	public long getB2bRecordCount() {
		return b2bRecordCount;
	}

	public void setB2bRecordCount(long b2bRecordCount) {
		this.b2bRecordCount = b2bRecordCount;
	}

	public long getCrdrRecordCount() {
		return crdrRecordCount;
	}

	public void setCrdrRecordCount(long crdrRecordCount) {
		this.crdrRecordCount = crdrRecordCount;
	}

	public String getLocalStationDateStr() {
		return localStationDateStr;
	}

	public void setLocalStationDateStr(String localStationDateStr) {
		this.localStationDateStr = localStationDateStr;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public GSTRReturnDto getGstrReturnDto() {
		return gstrReturnDto;
	}

	public void setGstrReturnDto(GSTRReturnDto gstrReturnDto) {
		this.gstrReturnDto = gstrReturnDto;
	}

	public long getB2cRecordCount() {
		return b2cRecordCount;
	}

	public void setB2cRecordCount(long b2cRecordCount) {
		this.b2cRecordCount = b2cRecordCount;
	}
	

}
