/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto.operations;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.ActionType;

/**
 * <code>ManifestGroupHeaderCodeDto</code> class represents the ManifestGroupHeaderCode information.
 * 
 */
public class ManifestGroupHeaderCodeDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>typeOfPageBreak</code> property.
     */
    private String typeOfPageBreak;

    /**
     * Attribute to hold <code>numberOfLines</code> property.
     */
    private int numberOfLines;

    /**
     * Attribute to hold <code>description</code> property.
     */
    private String description;

    /**
     * Attribute to hold <code>HeaderCode</code> property.
     */
    private String headerCode;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private int id;

    /**
     * Attribute to hold <code>error</code> property.
     */
    private boolean error;

    /**
     * Attribute to hold <code>actionType</code> property.
     */
    private ActionType actionType;

    /**
     * Gets the <code>TypeOfPageBreak</code> property.
     * <p>
     * 
     * @return the current value of the <code>TypeOfPageBreak</code> property.<br>
     */
    public String getTypeOfPageBreak() {
        return this.typeOfPageBreak;
    }

    /**
     * Sets the <code>TypeOfPageBreak</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>TypeOfPageBreak</code> property.<br>
     */
    public void setTypeOfPageBreak(final String pTypeOfPageBreak) {
        this.typeOfPageBreak = pTypeOfPageBreak;
    }

    /**
     * Gets the <code>NumberOfLines</code> property.
     * <p>
     * 
     * @return the current value of the <code>NumberOfLines</code> property.<br>
     */
    public int getNumberOfLines() {
        return this.numberOfLines;
    }

    /**
     * Sets the <code>NumberOfLines</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>NumberOfLines</code> property.<br>
     */
    public void setNumberOfLines(final int pNumberOfLines) {
        this.numberOfLines = pNumberOfLines;
    }

    /**
     * Gets the <code>Description</code> property.
     * <p>
     * 
     * @return the current value of the <code>Description</code> property.<br>
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Sets the <code>Description</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>Description</code> property.<br>
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Gets the <code>HeaderCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>HeaderCode</code> property.<br>
     */
    public String getHeaderCode() {
        return this.headerCode;
    }

    /**
     * Sets the <code>HeaderCode</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>HeaderCode</code> property.<br>
     */
    public void setHeaderCode(final String pHeaderCode) {
        this.headerCode = pHeaderCode;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>OId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>OId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Gets the <code>error</code> property.
     * <p>
     * 
     * @return the current value of the <code>error</code> property.<br>
     */
    public boolean getError() {
        return error;
    }

    /**
     * Sets the <code>error</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>error</code> property.<br>
     */
    public void setError(boolean error) {
        this.error = error;
    }

    /**
     * Gets the <code>ActionType</code> property.
     * <p>
     * 
     * @return the current value of the <code>ActionType</code> property.<br>
     */
    public ActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the <code>ActionType</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ActionType</code> property.<br>
     */
    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    /**
     * Gets the value of the <code>id</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>id</code> property.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the <code>id</code> property.
     * <p>
     * 
     * @param <code>id</code> Holds the new value of the <code>id</code> property.
     */
    public void setId(int id) {
        this.id = id;
    }
    
  

}
