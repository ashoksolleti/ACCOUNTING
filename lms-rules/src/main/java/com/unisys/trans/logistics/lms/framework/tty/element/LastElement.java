package com.unisys.trans.logistics.lms.framework.tty.element;

import com.unisys.trans.logistics.lms.framework.constants.ElementType;

/**
 * <code>LastElement</code> contains the End Of Message Text either LAST/CONT.
 * <p>
 * <code>LastElement.java</code> contains the following methods:
 * <ul>
 * <code>
 * <li>endOfMessageIndicator
 * </code>
 * </ul>
 */
public class LastElement extends Element implements SingleLineElement {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3366325353746633655L;

	/**
	 * Attribute to hold <code>endOfMessageIndicator</code> property.
	 * <p>
	 * Indicates the endOfMessageIndicator code.
	 */
	private String endOfMessageIndicator;

	/**
	 * This overridden method of Object class.
	 * <p>
	 * 
	 * @return String description of class.
	 *         <p>
	 * 
	 */
	@Override
	public String toString() {

		return "LastElement [EndOfMessageIndicator=" + endOfMessageIndicator
				+ "]";
	}

	/**
	 * Gets the <code>endOfMessageIndicator</code> property.
	 * <p>
	 * Indicates the endOfMessageIndicator code.
	 * <p>
	 * <b>Format: </b><br>
	 * Aplha.
	 * <p>
	 * <b>Example :</b><br>
	 * UW
	 * <p>
	 * 
	 * @return the current value of <code>endOfMessageIndicator</code> property.
	 */
	public String getEndOfMessageIndicator() {
		return endOfMessageIndicator;
	}

	/**
	 * Sets the <code>endOfMessageIndicator</code> property.
	 * <p>
	 * Indicates the endOfMessageIndicator code.
	 * <p>
	 * <b>Format: </b><br>
	 * Aplha.
	 * <p>
	 * <b>Example :</b><br>
	 * UW
	 * <p>
	 * 
	 * @param pCarrierCode
	 *            the new value of the <code>endOfMessageIndicator</code>
	 *            property.
	 */
	public void setEndOfMessageIndicator(final String pEndOfMessageIndicator) {
		this.endOfMessageIndicator = pEndOfMessageIndicator;
	}

	/**
	 * This overridden method for parse Element.
	 * <p>
	 * 
	 * @param pFlightDetailMsg
	 *            the parameter is of type request List.
	 *            <p>
	 * @return contains Element.
	 *         <p>
	 * 
	 */
	@Override
	public Element parseElement(final Line pFlightDetailMsg) {
		this.setEndOfMessageIndicator(Field.getContentFromList(
				pFlightDetailMsg.getLineFields(), 0));
		return this;
	}

	/**
	 * This overridden method for build Element.
	 * <p>
	 * 
	 * @return contains line.
	 *         <p>
	 * 
	 */
	@Override
	public Line buildElement() {
		Line aLastMessageLine = new Line();
		aLastMessageLine.addLineField(this.getElementType().getValue());
		return aLastMessageLine;
	}

	@Override
	public ElementType getElementType() {
		return ElementType.LAST;
	}
}
