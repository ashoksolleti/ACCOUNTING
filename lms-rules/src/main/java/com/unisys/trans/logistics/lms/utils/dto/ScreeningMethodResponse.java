package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.ArrayList;
import java.util.List;


public class ScreeningMethodResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the list of <code>screeningMethod</code> property.
     */
    private List<ScreeningMethodDto> screeningMethods = new ArrayList<ScreeningMethodDto>();
    
    /**
     * Attribute to hold the list of <code>screeningMethodList</code> property.
     */
    private String screeningMethodList;
    
    /**
     * Attribute to hold the <code>applyOIChanges</code> property.
     */
    private String applyOIChanges;

    /**
     * <code>Default constructor.</code>
     */
    public ScreeningMethodResponse() {

    }

    /**
     * Adds the <code>screeningMethodDto</code> retrieved from the system to the list of screeningMethodDtos.
     * <p>
     * 
     * @param pscreeningMethodDto the new value of <code>screeningMethod</code> property.<br>
     */
    public void addScreeningMethod(final ScreeningMethodDto pScreeningMethodDto) {
        this.screeningMethods.add(pScreeningMethodDto);
    }

    /**
     * Gets the <code>screeningMethods</code> property.<br>
     * <p>
     * Refers to the list of <code>ScreeningMethodDto</code>.
     * <p>
     * 
     * @return the current list of <code>screeningMethods</code> property.<br>
     */
    public List<ScreeningMethodDto> getScreeningMethods() {
        return this.screeningMethods;
    }

    /**
     * Sets the <code>screeningMethods</code>.
     * <p>
     * Refers to the list of <code>ScreeningMethodDto</code>.
     * <p>
     * 
     * @param pScreeningMethods the new list of <code>ScreeningMethodDto</code>.
     */
    public void setScreeningMethods(final List<ScreeningMethodDto> pScreeningMethods) {
        this.screeningMethods = pScreeningMethods;
    }

	/**
	 * @return the screeningMethodList
	 */
	public String getScreeningMethodList() {
		return screeningMethodList;
	}

	/**
	 * @param screeningMethodList the screeningMethodList to set
	 */
	public void setScreeningMethodList(String screeningMethodList) {
		this.screeningMethodList = screeningMethodList;
	}

	/**
	 * @return the applyOIChanges
	 */
	public String getApplyOIChanges() {
		return applyOIChanges;
	}

	/**
	 * @param applyOIChanges the applyOIChanges to set
	 */
	public void setApplyOIChanges(String applyOIChanges) {
		this.applyOIChanges = applyOIChanges;
	}

}
