/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;



import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class CollectionAgentInformationFindDto extends PersistenceObjectDto{

    /**
     * 
     */
    private static final long serialVersionUID = -1068183455935805184L;

    /**
     * Attribute to hold the <code>collectionID</code> property.
     */
    private String collectionID;
    
        /**
     * Attribute to hold the <code>Name</code> property.
     */
    private String name;
    
    /**
     * Attribute to hold the <code>station</code> property.
     */
    private String station;

    
    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Gets the <code>collectionID</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionID</code> property.
     */
    public String getCollectionID() {
        return ContractUtility.convertToUpperCase(this.collectionID);
    }

    /**
     * Sets the <code>pCollectionID</code>.
     * <p>
     * 
     * @param pCollectionID
     *            holds the new value of <code>collectionID</code>
     */
    public void setCollectionID(final String pCollectionID) {
        this.collectionID = ContractUtility.convertToUpperCase(pCollectionID);
    }

    /**
     * Gets the <code>name</code> property.
     * <p>
     * 
     * @return the current value of the <code>name</code> property.
     */
    public String getName() {
        return ContractUtility.convertToUpperCase(this.name);
    }

    /**
     * Sets the <code>pName</code>.
     * <p>
     * 
     * @param pName
     *            holds the new value of <code>name</code>
     */
    public void setName(final String pName) {
        this.name = ContractUtility.convertToUpperCase(pName);
    }

    /**
     * Gets the <code>station</code> property.
     * <p>
     * 
     * @return the current value of the <code>station</code> property.
     */
    public String getStation() {
        return ContractUtility.convertToUpperCase(this.station);
    }

    /**
     * Sets the <code>pStation</code>.
     * <p>
     * 
     * @param pStation
     *            holds the new value of <code>station</code>
     */
    public void setStation(final String pStation) {
        this.station = pStation;
    }
    
    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>pOId</code>.
     * <p>
     * 
     * @param pOId
     *            holds the new value of <code>oId</code>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }
  
}

