package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class RulesAdminDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = 6427008982961733068L;

    /**
     * Attribute to hold <code>timeStamp</code> property.
     * <p>
     * Unique key identify the <code>timeStamp</code>. It is of type string.<br>
     */

    private Date createdTimeStamp;

    /**
     * Attribute to hold <code>index</code> property.
     */
    private String index;

    /**
     * Attribute to hold <code>modifiedTimeStamp</code> property.
     * <p>
     * Unique key identify the <code>modifiedTimeStamp</code>. It is of type string.<br>
     */

    private Date modifiedTimeStamp;

    private String rulesArcheive;

    private boolean status;
    
    private String filePath;

    public Date getCreatedTimeStamp() {
        return createdTimeStamp;
    }

    /**
     * @return the index
     */
    public String getIndex() {
        return index;
    }

    public Date getModifiedTimeStamp() {
        return modifiedTimeStamp;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getRulesArcheive() {
        return rulesArcheive;
    }

    public boolean isStatus() {
        return status;
    }

    public void setCreatedTimeStamp(Date createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(String index) {
        this.index = index;
    }

    public void setModifiedTimeStamp(Date modifiedTimeStamp) {
        this.modifiedTimeStamp = modifiedTimeStamp;
    }

    public void setRulesArcheive(String rulesArcheive) {
        this.rulesArcheive = rulesArcheive;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

}
