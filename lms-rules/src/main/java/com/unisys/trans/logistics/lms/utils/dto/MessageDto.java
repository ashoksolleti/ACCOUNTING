package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class MessageDto extends PersistenceObjectDto {
	
    private static final long serialVersionUID = -720733913125531967L;
	private Long oId;
	
	private long version;
	
	private String key1;
	
	private String key2;
	
	private Date key3;
	
	private String payLoad;
	
	private Date creationDate;
	
	private Date lastModifiedDate;
	

	public String getKey1() {
		return key1;
	}

	public void setKey1(String key1) {
		this.key1 = key1;
	}

	public String getKey2() {
		return key2;
	}

	public void setKey2(String key2) {
		this.key2 = key2;
	}

	public Date getKey3() {
		return key3;
	}

	public void setKey3(Date key3) {
		this.key3 = key3;
	}

	public String getPayLoad() {
		return payLoad;
	}

	public void setPayLoad(String payLoad) {
		this.payLoad = payLoad;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}
    public void setOId(Long oId) {
        this.oId = oId;
    }

	/**
	 * @return the version
	 */
	public long getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(long version) {
		this.version = version;
	}

    @Override
    public Long getOId() {
        return this.oId;
    }
}
