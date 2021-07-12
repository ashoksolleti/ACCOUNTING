/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.unisys.trans.logistics.lms.framework.constants.ChannelType;
import com.unisys.trans.logistics.lms.framework.constants.HostType;
import com.unisys.trans.logistics.lms.framework.constants.VolumeUOMType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * <code>RequestHeader</code> contains the user credential's information.
 * <p>
 * The SOAP header provides this information :
 * <ul>
 * <li><code>host
 * <li>offices
 * <li>password
 * <li>userId</code>
 * </ul>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestHeader implements Serializable {

	//NG code

	private ChannelType channel;

	// NG code end

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5116863854693994330L;

    /**
     * Attribute to hold the <code>groupId</code> property.
     */

    private String groupId;

    /**
     * Attribute to hold the <code>host</code> property.
     */
    private HostType host;

    /**
     * Attribute to hold the <code>office</code> property.
     */

    private String office;

    /**
     * Attribute to hold the <code>awbOid</code> property.
     */
    
    private long awbOid;

   	/**
     * Attribute to hold the <code>station</code> property.
     */

    private String station;

    /**
     * Attribute to hold the <code>userId</code> property.
     */

    private String userId;
    
    /**
     * Attribute to hold the <code>agentId</code> property.
     */
    private String agentId;
    
    /**
     * Attribute to hold the <code>language</code> property.
     */
    private String language;
    /**
     * Attribute to hold the <code>language</code> property.
     */
    private FunctionPageType functionPage;
    
    /**
     * Attribute to hold the <code>language</code> property.
     */
    private PageCallType calltype;
    
    private String defaultACN;
    
    private String invocationSourceType;
    
    public String getSpecificAirline() {
		return specificAirline;
	}
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}
    
    private String specificAirline;
    
    private String source;

    private WeightUOMType stationWeightUnit;
    
    private VolumeUOMType StationVolumeUnit;

    /**
     * @return the calltype
     */
    public PageCallType getCalltype() {
        return calltype;
    }

    /**
     * @param calltype the calltype to set
     */
    public void setCalltype(PageCallType calltype) {
        this.calltype = calltype;
    }

    public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
    /**
     * <code>Default Constructor.</code>
     */
    public RequestHeader() {

    }

    /**
     * Gets the <code>groupId</code> property.
     * <p>
     * 
     * @return the current value of <code>groupId</code> property.
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * Gets the <code>host</code> property.
     * <p>
     * 
     * @return the current value of <code>host</code> property.
     */
    public HostType getHost() {
        return this.host;
    }

    /**
     * Gets the <code>office</code> property.
     * <p>
     * <b>Format :</b><br>
     * 1 - 20 Alphanumeric
     * <p>
     * <b>Example :</b><br>
     * 001
     * <p>
     * 
     * @return the current value of <code>office</code> property.
     */
    public String getOffice() {
        return this.office;
    }

    /**
     * Gets the <code>station</code> property.
     * <p>
     * <b>Format :</b><br>
     * 3 - 5 Alphabet
     * <p>
     * <b>Example :</b><br>
     * MSP
     * <p>
     * 
     * @return the current value of <code>station</code> property.
     */
    public String getStation() {
        return this.station;
    }

    /**
     * Gets the <code>userId</code> property.
     * <p>
     * 
     * @return the current value of <code>userId</code> property.
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * Sets the<code>groupId</code>property.
     * <p>
     * 
     * @param pGroupId the current value of <code>groupId</code> property.
     */

    public void setGroupId(final String pGroupId) {
        this.groupId = pGroupId;
    }

    /**
     * Sets the<code>host</code>property.
     * <p>
     * 
     * @param pHost the current value of <code>host</code> property.
     */
    public void setHost(final HostType pHost) {
        this.host = pHost;
    }

    /**
     * Sets the <code>office</code> property.
     * <p>
     * <b>Format :</b><br>
     * 1 - 20 Alphanumeric
     * <p>
     * <b>Example :</b><br>
     * 001
     * <p>
     * 
     * @param pOffice the current value of <code>office</code> property.
     */
    public void setOffice(final String pOffice) {
        this.office = pOffice;
    }

    /**
     * Sets the <code>station</code> property.
     * <p>
     * <b>Format :</b><br>
     * 3 - 5 Alphabet
     * <p>
     * <b>Example :</b><br>
     * MSP
     * <p>
     * 
     * @param pStation the current value of <code>station</code> property.
     */
    public void setStation(final String pStation) {
        this.station = ContractUtility.convertToUpperCase(pStation);
    }

    /**
     * Sets the <code>userId</code> property.
     * <p>
     * 
     * @param pUserId the current value of <code>userId</code> property.
     */
    public void setUserId(final String pUserId) {
        this.userId = pUserId;
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
	 /**
     * @return the functionPage
     */

    public FunctionPageType getFunctionPage() {
        return functionPage;
    }

    public void setFunctionPage(FunctionPageType functionPage) {
        this.functionPage = functionPage;
    }
	/**
	 * @return the defaultACN
	 */
	public String getDefaultACN() {
		return defaultACN;
	}
	/**
	 * @param defaultACN the defaultACN to set
	 */
	public void setDefaultACN(String defaultACN) {
		this.defaultACN = defaultACN;
	}
	 public long getAwbOid() {
			return awbOid;
		}
		public void setAwbOid(long awbOid) {
			this.awbOid = awbOid;
		}


//NG codes

public ChannelType getChannel() {
	return channel;
	}
public void setChannel(ChannelType channel) {
	this.channel = channel;
}


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
	/**
	 * @return the invocationSourceType
	 */
	public String getInvocationSourceType() {
		return invocationSourceType;
	}

	/**
	 * @param invocationSourceType the invocationSourceType to set
	 */
	public void setInvocationSourceType(String invocationSourceType) {
		this.invocationSourceType = invocationSourceType;
	}

	public WeightUOMType getStationWeightUnit() {
		return stationWeightUnit;
	}

    public void setStationWeightUnit(WeightUOMType stationWeightUnit) {
        this.stationWeightUnit = stationWeightUnit;
    }

    public VolumeUOMType getStationVolumeUnit() {
        return StationVolumeUnit;
    }

    public void setStationVolumeUnit(VolumeUOMType stationVolumeUnit) {
        StationVolumeUnit = stationVolumeUnit;
    }
}
