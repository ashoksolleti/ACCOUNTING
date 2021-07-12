package com.unisys.trans.logistics.lms.framework.tty.ucs.element;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.tty.element.Line;

public class ULDLine {
	
	/**
	 * Attribute to hold <code>uldLine</code> property.
	 */
	private Line uldLine = new Line();
	
	/**
	 * Attribute to hold <code>consignmentLines</code> property.
	 */
	private List<List<Line>> consignmentLines = new ArrayList<List<Line>>();
	
	/**
	 * Gets the <code>uldLine</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>uldLine</code> property.
	 */
	public Line getUldLines() {
		return uldLine;
		
		
	/**
	 * Sets the <code>uldLines</code> property.
	 * <p>
	 * 
	 * @param uldLines
	 *            holds the new value of <code>uldLines</code>.<br>
	 */	
	}
	public void setUldLine(Line uldLines) {
		this.uldLine = uldLines;
	}
	
	/**
	 * Gets the <code>consignmentLines</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>consignmentLines</code> property.
	 */
	public List<List<Line>> getConsignmentLines() {
		return consignmentLines;
	/**
	 * Sets the <code>consignmentLines</code> property.
	 * <p>
	 * 
	 * @param consignmentLines
	 *            holds the new value of <code>consignmentLines</code>.<br>
	 */
	}
	public void setConsignmentLines(List<List<Line>> consignmentLines) {
		this.consignmentLines = consignmentLines;
	}

}
