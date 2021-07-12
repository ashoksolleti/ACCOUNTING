/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.preferences;

import java.util.List;
import java.util.Map;

/**
 * @author RamannaV
 *
 */
public class SimplifyStationRestrictionElements {

	Map<String, List<String>> DBElements;
	Map<String, List<String>> UIElements;
	Map<String, List<String>> DBExceptElements;

	boolean applyRestriction = false;
	boolean exactMatchElement = false;
	boolean exceptRestriction = false;

	/**
	 * @return the dBElements
	 */
	public Map<String, List<String>> getDBElements() {
		return DBElements;
	}

	/**
	 * @param dBElements
	 *            the dBElements to set
	 */
	public void setDBElements(Map<String, List<String>> dBElements) {
		DBElements = dBElements;
	}

	/**
	 * @return the uIElements
	 */
	public Map<String, List<String>> getUIElements() {
		return UIElements;
	}

	/**
	 * @param uIElements
	 *            the uIElements to set
	 */
	public void setUIElements(Map<String, List<String>> uIElements) {
		UIElements = uIElements;
	}

	/**
	 * @return the dBExceptElements
	 */
	public Map<String, List<String>> getDBExceptElements() {
		return DBExceptElements;
	}

	/**
	 * @param dBExceptElements
	 *            the dBExceptElements to set
	 */
	public void setDBExceptElements(Map<String, List<String>> dBExceptElements) {
		DBExceptElements = dBExceptElements;
	}

	/**
	 * @return the applyRestriction
	 */
	public boolean isApplyRestriction() {
		return applyRestriction;
	}

	/**
	 * @param applyRestriction
	 *            the applyRestriction to set
	 */
	public void setApplyRestriction(boolean applyRestriction) {
		this.applyRestriction = applyRestriction;
	}

	/**
	 * @return the exactMatchElement
	 */
	public boolean isExactMatchElement() {
		return exactMatchElement;
	}

	/**
	 * @param exactMatchElement
	 *            the exactMatchElement to set
	 */
	public void setExactMatchElement(boolean exactMatchElement) {
		this.exactMatchElement = exactMatchElement;
	}

	/**
	 * @return the exceptRestriction
	 */
	public boolean isExceptRestriction() {
		return exceptRestriction;
	}

	/**
	 * @param exceptRestriction
	 *            the exceptRestriction to set
	 */
	public void setExceptRestriction(boolean exceptRestriction) {
		this.exceptRestriction = exceptRestriction;
	}

}
