package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ChecklistRequest</code> is used for for find and store checklists.
 * 
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>checklistName
 * <li>checklistHtml
</code>
 * </ul>
 */
public class ChecklistRequest extends AbstractRequest {

    /**
     * 
     */
    private static final long serialVersionUID = -3490697481839168424L;

    private String awb;

    private String awbDate;

    private String awbDestination;

    private String awbOrigin;

    private String checklistHtml;

    private String checklistName;

    private String dbKey;

    private String station;

    private String userId;
    
    private String pageName;
    
    private String channel;

    public String getAwb() {
        return this.awb;
    }

    public String getAwbDate() {
        return this.awbDate;
    }

    public String getAwbDestination() {
        return this.awbDestination;
    }

    public String getAwbOrigin() {
        return this.awbOrigin;
    }

    public String getChecklistHtml() {
        return this.checklistHtml;
    }

    public String getChecklistName() {
        return this.checklistName;
    }

    public String getDbKey() {
        return this.dbKey;
    }

    public String getStation() {
        return this.station;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public String getChannel() {
		return channel;
	}

    public void setAwb(String pAwb) {
        this.awb = pAwb;
    }

    public void setAwbDate(String pAwbDate) {
        this.awbDate = pAwbDate;
    }

    public void setAwbDestination(String pAwbDestination) {
        this.awbDestination = pAwbDestination;
    }

    public void setAwbOrigin(String pAwbOrigin) {
        this.awbOrigin = pAwbOrigin;
    }

    public void setChecklistHtml(String pChecklistHtml) {
        this.checklistHtml = pChecklistHtml;
    }

    public void setChecklistName(String pChecklistName) {
        this.checklistName = pChecklistName;
    }

    public void setDbKey(String pDbKey) {
        this.dbKey = pDbKey;
    }

    public void setStation(String pStation) {
        this.station = pStation;
    }

    public void setUserId(String pUserId) {
        this.userId = pUserId;
    }

	public String getPageName() {
		return this.pageName;
	}

	public void setPageName(final String pPageName) {
		this.pageName = pPageName;
	}
	
	public void setChannel(String channel) {
		this.channel = channel;
	}

}
