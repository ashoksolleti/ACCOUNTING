package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class MessageHistoryRequest extends AbstractRequest {

	@Override
    public String toString() {
        return "MessageHistoryRequest [fromAddr=" + fromAddr + ", mesageType=" + mesageType
                    + ", originalMessage=" + originalMessage + ", toAddr=" + toAddr + ", wrkMessage="
                    + wrkMessage + ", awbNumber=" + awbNumber + ", stationID=" + stationID + ", messageName="
                    + messageName + ", delimitor=" + delimitor + ", fsuType=" + fsuType + ", flightNumber="
                    + flightNumber + ", flightDate=" + flightDate + ", subType=" + subType + ", carrier="
                    + carrier + ", hostKey=" + hostKey + ", cMsgName=" + cMsgName + ", customMessage="
                    + customMessage + ", agent=" + agent + "]";
    }

    /**
	 * 
	 */
	private static final long serialVersionUID = 2599709813041957604L;
	
	private String fromAddr;
	
	private String mesageType;
	
	private String originalMessage;
	
	private String toAddr;
	
	private String wrkMessage;

	// CWIS attributes starts
	
	private String awbNumber;
	
	private String stationID;
	
	private String messageName;
	
	private String delimitor;
	
	private String fsuType;
	
	private String flightNumber;
	
	private String flightDate;
	
	private String subType;

    private String carrier;
    
    private String hostKey;
    
    private String cMsgName;
    
    private boolean customMessage;
    
    private String agent;
	public String getHostKey() {
        return hostKey;
    }
    public void setHostKey(String hostKey) {
        this.hostKey = hostKey;
    }
    public String getcMsgName() {
        return cMsgName;
    }
    public void setcMsgName(String cMsgName) {
        this.cMsgName = cMsgName;
    }
    public String getAgent() {
        return agent;
    }
    public void setAgent(String agent) {
        this.agent = agent;
    }
    // CWIS attributes ends
	public String getFromAddr() {
		return fromAddr;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public void setFromAddr(String fromAddr) {
		this.fromAddr = fromAddr;
	}

	public String getMesageType() {
		return mesageType;
	}

	public void setMesageType(String mesageType) {
		this.mesageType = mesageType;
	}

	public String getOriginalMessage() {
		return originalMessage;
	}

	public void setOriginalMessage(String originalMessage) {
		this.originalMessage = originalMessage;
	}

	public String getToAddr() {
		return toAddr;
	}

	public void setToAddr(String toAddr) {
		this.toAddr = toAddr;
	}

	public String getWrkMessage() {
		return wrkMessage;
	}

	public void setWrkMessage(String wrkMessage) {
		this.wrkMessage = wrkMessage;
	}

    /** CWIS message getter/setter starts  */

    public String getAwbNumber() {
        return awbNumber;
    }

    public void setAwbNumber(String awbNumber) {
        this.awbNumber = awbNumber;
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public String getDelimitor() {
        return delimitor;
    }

    public void setDelimitor(String delimitor) {
        this.delimitor = delimitor;
    }

    public String getFsuType() {
        return fsuType;
    }

    public void setFsuType(String fsuType) {
        this.fsuType = fsuType;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

	/**
	 * @return the subType
	 */
	public String getSubType() {
		return subType;
	}

	/**
	 * @param subType the subType to set
	 */
	public void setSubType(String subType) {
		this.subType = subType;
	}
	/** CWIS message getter/setter ends  */
    public boolean isCustomMessage() {
        return customMessage;
    }
    public void setCustomMessage(boolean customMessage) {
        this.customMessage = customMessage;
    }
}
