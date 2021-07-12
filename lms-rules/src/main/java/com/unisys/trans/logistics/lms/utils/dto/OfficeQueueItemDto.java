/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.QueueItemObjectType;

/**
 * <code>OfficeQueueItemDto</code> holds all the attributes that are associated
 * to a particular Queue.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>creationTimestamp
 * <li>oId
 * <li>objectType
 * <li>objectId
 * <li>messageText
 * <li>errorMessageCode
 * </code>
 * </ul>
 */
public class OfficeQueueItemDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>creationTimestamp</code> property.
     */
    private Date creationTimestamp;

    /**
     * Attribute to hold <code>errorMessageCode</code> property.
     */
    private String errorMessageCode;

    /**
     * Attribute to hold <code>messageText</code> property.
     */
    private String messageText;

    /**
     * Attribute to hold <code>objectId</code> property.
     */
    private Long objectId;

    /**
     * Attribute to hold <code>queueItemObjectType</code> property.
     * <p>
     * States item object type of the queue.
     * <p>
     * <b>Possible Values:</b>
     * <ul>
     * <li>SPOTRATE
     * </ul>
     */
    private QueueItemObjectType objectType;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>oldObjectId</code> property.
     */
    private Long oldObjectId;
    
    /**
     * Attribute to hold <code>oldObjectId</code> property.
     */
    private Long officeQueueOid;
    
    /**
     * Attribute to hold <code>airWaybill</code> property.
     */
    private String airWaybill;

    /**
     * Attribute to hold <code>origin</code> property.
     */
    private String origin;

    /**
     * Attribute to hold <code>destination</code> property.
     */
    private String destination;
    
    /**
     * Attribute to hold <code>fromTTYAddress</code> property.
     */
    private String fromTTYAddress;
    
    /**
     * Attribute to hold <code>toTTYAddress</code> property.
     */
    private String toTTYAddress;


	/**
     * Gets the value of <code>creationTimestamp</code> property.
     * <p>
     * 
     * @return the current value of the <code>creationTimestamp</code> property.<br>
     */
    
    private OfficeQueueDto officeQueueDto;
    
    public Date getCreationTimestamp() {
        return ContractUtility.getClonedDate(this.creationTimestamp);
    }

    /**
     * Gets the <code>errorMessageCode</code> property.
     * <p>
     * Message(s) in the queue.
     * <p>
     * <b>Format : </b><br>
     * 1-50 Alphanumeric space
     * <p>
     * <b>Example : </b><br>
     * Actual Rate Queue
     * <p>
     * 
     * @return the current value of the <code>errorMessageCode</code> property.
     */
    public String getErrorMessageCode() {
        return this.errorMessageCode;
    }

    /**
     * Gets the <code>messageText</code> property.
     * <p>
     * Message(s) in the queue.
     * <p>
     * <b>Format : </b><br>
     * 1-50 Alphanumeric space
     * <p>
     * <b>Example : </b><br>
     * Actual Rate Queue
     * <p>
     * 
     * @return the current value of the <code>messageText</code> property.
     */
    public String getMessageText() {
        return this.messageText;
    }

    /**
     * Gets the <code>objectId</code> property. <b>Format : </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example : </b><br>
     * 11
     * <p>
     * 
     * @return the current value of the <code>objectId</code> property.
     */
    public Long getObjectId() {
        return this.objectId;
    }

    /**
     * Gets the <code>queueItemObjectType</code> property.
     * <p>
     * States item object type of the queue.
     * <p>
     * 
     * @return the current value of the <code>queueItemObjectType</code> property.<br>
     */
    public QueueItemObjectType getObjectType() {
        return this.objectType;
    }

    /**
     * Gets the value of <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>oldObjectId</code> property. <b>Format : </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example : </b><br>
     * 11
     * <p>
     * 
     * @return the current value of the <code>oldObjectId</code> property.
     */
    public Long getOldObjectId() {
        return this.oldObjectId;
    }

    /**
     * Sets the value of the <code>creationTimestamp</code> property.
     * <p>
     * 
     * @param pCreationTimestamp
     *            the new value of the <code>creationTimestamp</code> property.<br>
     */
    public void setCreationTimestamp(final Date pCreationTimestamp) {
        this.creationTimestamp = ContractUtility
                    .getClonedDate(pCreationTimestamp);
    }

    /**
     * Sets the <code>errorMessageCode</code> property. <b>Format : </b><br>
     * 1-50 Alphanumeric space
     * <p>
     * <b>Example : </b><br>
     * Actual Rate Queue
     * <p>
     * 
     * @param pErrorMessageCode
     *            the new value of <code>errorMessageCode</code> property.<br>
     */
    public void setErrorMessageCode(final String pErrorMessageCode) {
        this.errorMessageCode = pErrorMessageCode;
    }

    /**
     * Sets the <code>messageText</code> property. <b>Format : </b><br>
     * 1-50 Alphanumeric space
     * <p>
     * <b>Example : </b><br>
     * Actual Rate Queue
     * <p>
     * 
     * @param pMessageText
     *            the new value of <code>messageText</code> property.<br>
     */
    public void setMessageText(final String pMessageText) {
        this.messageText = pMessageText;
    }

    /**
     * Sets the <code>objectId</code> property. <b>Format : </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example : </b><br>
     * 11
     * <p>
     * 
     * @param pObjectId
     *            the new value of <code>objectId</code> property.<br>
     */
    public void setObjectId(final Long pObjectId) {
        this.objectId = pObjectId;
    }

    /**
     * Sets the <code>objectType</code> property.
     * <p>
     * States item object type of the queue.
     * <p>
     * 
     * @param pObjectType
     *            the new value of <code>objectType</code> property for an
     *            office.<br>
     */
    public void setObjectType(final QueueItemObjectType pObjectType) {
        this.objectType = pObjectType;
    }

    /**
     * Sets the value of the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>oldObjectId</code> property. <b>Format : </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example : </b><br>
     * 11
     * <p>
     * 
     * @param pOldObjectId
     *            the new value of <code>oldObjectId</code> property.<br>
     */
    public void setOldObjectId(final Long pOldObjectId) {
        this.oldObjectId = pOldObjectId;
    }
    
    public boolean equals(Object object){
        if (object instanceof OfficeQueueItemDto) {
            if(this.objectId.equals(((OfficeQueueItemDto)object).getObjectId())){
                return true;
            }
        }
        return false;
    }
      
    public int hashCode() {
        return this.objectId.hashCode();   
    }

    public Long getOfficeQueueOid() {
		return officeQueueOid;
	}

	public void setOfficeQueueOid(Long officeQueueOid) {
		this.officeQueueOid = officeQueueOid;
	}

	public OfficeQueueDto getOfficeQueueDto() {
		return officeQueueDto;
	}

	public void setOfficeQueueDto(OfficeQueueDto officeQueueDto) {
		this.officeQueueDto = officeQueueDto;
	}
    
	/**
     * Creates the String representation of <code>OfficeQueueItem</code>.
     * <p>
     * This will return the String representation based on Queue Item Information.
     * <p>
     * 
     * @return the String representation of <code>OfficeQueueItem</code>.
     */
    public String toString() {
    	final StringBuffer csvString = new StringBuffer();
    	csvString.append(this.prefixSuffixByQuotes(this.getCreationTimestamp().toLocaleString()));
    	csvString.append(this.prefixSuffixByQuotes(this.getMessageText()));
    	csvString.append(this.prefixSuffixByQuotes(this.getErrorMessageCode()));
        return csvString.toString();
    }

	 /**
    * prefixes and suffixes a given string with open quotes.
    * 
    * @param pString the new value of the <code>value</code>.
    * 
    * @return aModifiedString the new value of the <code>aModifiedString</code>.
    * 
    * 
    */
   private String prefixSuffixByQuotes(final String pString) {
       final String aQUOTATION = "\"";
       final String aCOMMA = ",";

       final StringBuffer aModifiedString = new StringBuffer();
       aModifiedString.append(aQUOTATION);
       aModifiedString.append((pString != null) ? pString : "");
       aModifiedString.append(aQUOTATION);
       aModifiedString.append(aCOMMA);

       return aModifiedString.toString();
   }

	/**
	 * @return the airWaybill
	 */
	public String getAirWaybill() {
		return airWaybill;
	}

	/**
	 * @param airWaybill the airWaybill to set
	 */
	public void setAirWaybill(String airWaybill) {
		this.airWaybill = airWaybill;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the fromTTYAddress
	 */
	public String getFromTTYAddress() {
		return fromTTYAddress;
	}

	/**
	 * @param fromTTYAddress the fromTTYAddress to set
	 */
	public void setFromTTYAddress(String fromTTYAddress) {
		this.fromTTYAddress = fromTTYAddress;
	}

	/**
	 * @return the toTTYAddress
	 */
	public String getToTTYAddress() {
		return toTTYAddress;
	}

	/**
	 * @param toTTYAddress the toTTYAddress to set
	 */
	public void setToTTYAddress(String toTTYAddress) {
		this.toTTYAddress = toTTYAddress;
	}

}
