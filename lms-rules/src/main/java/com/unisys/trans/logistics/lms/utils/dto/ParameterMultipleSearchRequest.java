package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.ParameterSearchType;

/**
 * <code>ParameterMultipleSearchRequest</code> class represents the request to find parameter information.
 * <p>
 * <code>ParameterMultipleSearchRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>group</li>
 * <li>module</li>
 * <li>searchText</li>
 * <li>queryType</li>
 * <li>startDate</li>
 * <li>endDate</li>
 * <li>retainIndicator</li>
 * </code>
 * </ul>
 */

public class ParameterMultipleSearchRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7474014807877448169L;

    /**
     * Attribute to hold <code>endDate</code> property.
     */

    private Date endDate;

    /**
     * Attribute to hold <code>group</code> property.
     */

    private String group;

    /**
     * Attribute to hold <code>module</code> property.
     */

    private String module;

    /**
     * Attribute to hold <code>QueryType</code> property.
     */
    private ParameterSearchType queryType;

    /**
     * Attribute to hold <code>retainIndicator</code> property.
     */

    private Boolean retainIndicator;

    /**
     * Attribute to hold <code>searchText</code> property.
     */

    private String searchText;

    /**
     * Attribute to hold <code>startDate</code> property.
     */

    private Date startDate;
    
    
    /**
     * Attribute to hold the Runtime Parameter 
     */
    private List<String> parameterList;
    /**
     * <code>Default constructor.</code>
     */

    public ParameterMultipleSearchRequest() {

    }

    /**
     * Gets the <code>endDate</code> property.
     * <p>
     * <b> Format: </b> <br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example :</b><br>
     * 12MAR12
     * <p>
     * 
     * @return the current value of <code>endDate</code> property.
     */
    public Date getEndDate() {
        return ContractUtility.getClonedDate(endDate);
    }

    /**
     * Gets the <code>group</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-100 Any Character
     * <p>
     * <b>Example: </b><br>
     * AWB
     * <p>
     * 
     * @return the current value of the <code>group</code> property.
     */
    public String getGroup() {
        return group;
    }

    /**
     * Gets the <code>module</code> property.
     * <p>
     * <b>Format: </b><br>
     * Allowed values: AWB ,Customs, Flights,Participants,Rating,Reservations,Routing,Space,ULD
     * Control,Utilities,Warehouse.
     * <p>
     * <b>Example: </b><br>
     * AWB
     * <p>
     * 
     * @return the current value of the <code>module</code> property.
     */
    public String getModule() {
        return module;
    }

    /**
     * Gets the <code>queryType</code> property.
     * <p>
     * 
     * @return the current value of <code>queryType</code> property.
     */
    public ParameterSearchType getQueryType() {
        return queryType;
    }

    /**
     * Gets the <code>retainIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * These values are retrieved <br>
     * <li><code>false</code> These values does not retrieve<br>
     * <p>
     * 
     * @return the current value of <code>retainIndicator</code> property.
     */
    public Boolean getRetainIndicator() {
        return retainIndicator;
    }

    /**
     * Gets the <code>SearchText</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5000 Any character<br>
     * <p>
     * <b>Example: </b><br>
     * Rate Main
     * <p>
     * 
     * @return the current value of <code>SearchText</code> property.
     */
    public String getSearchText() {
        return searchText;
    }

    /**
     * Gets the <code>startDate</code> property.
     * <p>
     * <b> Format: </b> <br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example :</b><br>
     * 01MAR12
     * <p>
     * 
     * @return the current value of <code>startDate</code> property.
     */
    public Date getStartDate() {
        return ContractUtility.getClonedDate(startDate);
    }

    /**
     * Sets the <code>EndDate</code> property.<br>
     * <p>
     * <b> Format: </b> <br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example :</b><br>
     * 12MAR12
     * <p>
     * 
     * @param pEndDate the new value of <code>EndDate</code> property.<br>
     */
    public void setEndDate(final Date pEndDate) {
        this.endDate = ContractUtility.getClonedDate(pEndDate);
    }

    /**
     * Sets the <code>group</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-100 Any Character
     * <p>
     * <b>Example: </b><br>
     * AWB
     * <p>
     * 
     * @param pGroup the new value of the <code>group</code>.
     */

    public void setGroup(final String pGroup) {
        this.group = pGroup;
    }

    /**
     * Sets the <code>module</code> property.
     * <p>
     * <b>Format: </b><br>
     * Allowed values: AWB ,Customs, Flights,Participants,Rating,Reservations,Routing,Space,ULD
     * Control,Utilities,Warehouse.
     * <p>
     * <b>Example: </b><br>
     * AWB
     * <p>
     * 
     * @param pModule the new value of the <code>module</code>.<br>
     */

    public void setModule(final String pModule) {
        this.module = pModule;
    }

    /**
     * Sets the <code>retainIndicator</code> property.<br>
     * <p>
     * 
     * @param pQueryType the new value of <code>retainIndicator</code> property.<br>
     */
    public void setQueryType(final ParameterSearchType pQueryType) {
        this.queryType = pQueryType;
    }

    /**
     * Sets the <code>retainIndicator</code> property.<br>
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * These values are retrieved <br>
     * <li><code>false</code> These values does not retrieve<br>
     * <p>
     * 
     * @param pRetainIndicator the new value of <code>retainIndicator</code> property.<br>
     */
    public void setRetainIndicator(final Boolean pRetainIndicator) {
        this.retainIndicator = pRetainIndicator;
    }

    /**
     * Sets the <code>SearchText</code> property.<br>
     * <p>
     * <b>Format: </b><br>
     * 1-5000 Any Character<br>
     * <p>
     * <b>Example: </b><br>
     * Rate Main
     * <p>
     * 
     * @param pSearchText the new value of <code>SearchText</code> property.<br>
     */
    public void setSearchText(final String pSearchText) {
        this.searchText = pSearchText;
    }

    /**
     * Sets the <code>startDate</code> property.<br>
     * <p>
     * <b> Format: </b> <br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example :</b><br>
     * 01MAR12
     * <p>
     * 
     * @param pStartDate the new value of <code>startDate</code> property.<br>
     */
    public void setStartDate(final Date pStartDate) {
        this.startDate = ContractUtility.getClonedDate(pStartDate);
    }

    /**
     * Gets the <code>parameterList</code> property.
     * <p>
     * 
     * @return the current value of the <code>parameterList</code> property.
     */
    public List<String> getParameterList() {
        return this.parameterList;
    }

    /**
     * Sets the <code>pParameterList</code>.
     * <p>
     * 
     * @param pParameterList
     *            holds the new value of <code>parameterList</code>
     */
    public void setParameterList(final List<String> pParameterList) {
        this.parameterList = pParameterList;
    }
  

}
