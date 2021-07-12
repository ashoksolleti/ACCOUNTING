package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class StickyNotesDto extends PersistenceObjectDto {

	/**
	 * Attribute to hold serialversionUID for the <code>StickyNotesDto</code>.
	 */
	private static final long serialVersionUID = 1336208952805084196L;

	/**
	 * Attribute to hold <code>oId</code> property.
	 */
	private Long oId;
	/**
	 * Attribute to hold <code>stickyTitle</code> property.
	 */
	private String stickyTitle;
	/**
	 * Attribute to hold <code>stickyContent</code> property.
	 */
	private String stickyContent;
	/**
	 * Attribute to hold <code>lastUpdateTimeStamp</code> property.
	 */
	private Date lastUpdateTimeStamp;
	/**
	 * Attribute to hold <code>user</code> property.
	 */
	private String userId;

	/**
	 * Defines the constructor with required properties
	 * 
	 * @param oId
	 * @param stickyTitle
	 * @param stickyContent
	 * @param lastUpdateTimeStamp
	 */
	public StickyNotesDto(Long oId, String stickyTitle, String stickyContent,
			final Date lastUpdateTimeStamp) {
		super();
		this.oId = oId;
		this.stickyTitle = stickyTitle;
		this.stickyContent = stickyContent;
		if(lastUpdateTimeStamp!=null){
			this.lastUpdateTimeStamp =(Date) lastUpdateTimeStamp.clone();
          }
        else{
        	this.lastUpdateTimeStamp  =null;	
        }
	}

	/**
	 * Defines the default constructor
	 */
	public StickyNotesDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the <code>oId</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>oId</code> property.
	 */
	@Override
	public Long getOId() {
		return oId;
	}

	/**
	 * Sets the <code>oId</code> property.
	 * <p>
	 * 
	 * @param pOId
	 *            holds the new value of <code>oId</code>.<br>
	 */
	public void setOId(Long pOId) {
		this.oId = pOId;
	}

	/**
	 * Gets the <code>stickyTitle</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>stickyTitle</code> property.
	 */
	public String getStickyTitle() {
		return stickyTitle;
	}

	/**
	 * Sets the <code>stickyTitle</code> property.
	 * <p>
	 * 
	 * @param pStickyTitle
	 *            holds the new value of <code>stickyTitle</code>.<br>
	 */
	public void setStickyTitle(String pStickyTitle) {
		this.stickyTitle = pStickyTitle;
	}

	/**
	 * Gets the <code>stickyContent</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>stickyContent</code> property.
	 */
	public String getStickyContent() {
		return stickyContent;
	}

	/**
	 * Sets the <code>stickyContent</code> property.
	 * <p>
	 * 
	 * @param pStickyContent
	 *            holds the new value of <code>stickyContent</code>.<br>
	 */
	public void setStickyContent(String pStickyContent) {
		this.stickyContent = pStickyContent;
	}

	/**
	 * Gets the <code>lastUpdateTimeStamp</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>lastUpdateTimeStamp</code>
	 *         property.
	 */
	public Date getLastUpdateTimeStamp() {
		if(lastUpdateTimeStamp!=null)
    	{
    		 return (Date)lastUpdateTimeStamp.clone();
    }
    else{
    	return null;
    }
	}

	/**
	 * Sets the <code>lastUpdateTimeStamp</code> property.
	 * <p>
	 * 
	 * @param pLastUpdateTimeStamp
	 *            holds the new value of <code>lastUpdateTimeStamp</code>.<br>
	 */
	public void setLastUpdateTimeStamp(final Date pLastUpdateTimeStamp) {
		if(pLastUpdateTimeStamp!=null){
			this.lastUpdateTimeStamp  =(Date) pLastUpdateTimeStamp.clone();
          }
        else{
        	this.lastUpdateTimeStamp  =null;	
        }
	}

	
	/**
	 * Gets the <code>oId</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>oId</code> property.
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * Sets the <code>oId</code> property.
	 * <p>
	 * 
	 * @param pOId
	 *            holds the new value of <code>oId</code>.<br>
	 */
	public void setoId(Long pOId) {
		this.oId = pOId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	

}
