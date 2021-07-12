package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class FunctionDetailsDto extends PersistenceObjectDto {
    public static final String VIEW = "View";
    public static final String AIRWAYBILL = "Air Waybill";
    public static final String PARTICIPANTS = "Participants";
    public static final String ROUTING_DETAILS = "Routing Details";
    public static final String ACCEPTANCE_DETAILS = "Acceptance Details";
    public static final String RATING_DETAILS = "Rating Details";
    public static final String OTHER_CHARGES = "Other Charges";
    public static final String SECURITY_INFO = "Security Info";
    public static final String ACTIONS = "Action";
    public static final String TOTAL_CHARGES= "Total Charges";

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	//@Override
	public Long getOId() {
		return this.oId;
	}
	public void setOId(final Long pOId){
	    this.oId = pOId;
	}
	private Long oId;

	private String section;

	private String layouts;

	private boolean excludeInd;

	private List<String> layoutList;
    private List<String> hideFieldList;

	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}

	/**
	 * @param section
	 *            the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}

	/**
	 * @return the layouts
	 */
	public String getLayouts() {
		return layouts;
	}

	/**
	 * @param layouts
	 *            the layouts to set
	 */
	public void setLayouts(String layouts) {
		this.layouts = layouts;
	}

	/**
	 * @return the excludeInd
	 */
	public boolean isExcludeInd() {
		return excludeInd;
	}

	/**
	 * @param excludeInd
	 *            the excludeInd to set
	 */
	public void setExcludeInd(boolean excludeInd) {
		this.excludeInd = excludeInd;
	}
    public List<String> getLayoutList() {
        return layoutList;
    }
    public void setLayoutList(final List<String> layoutList) {
        this.layoutList = layoutList;
    }
    public List<String> getHideFieldList() {
        return hideFieldList;
    }
    public void setHideFieldList(final List<String> pHideFieldList) {
        this.hideFieldList = pHideFieldList;
    }

}
