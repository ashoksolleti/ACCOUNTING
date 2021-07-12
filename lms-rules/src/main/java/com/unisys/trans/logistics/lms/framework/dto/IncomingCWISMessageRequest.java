package com.unisys.trans.logistics.lms.framework.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.MHSMessageConstants;
import com.unisys.trans.logistics.lms.framework.contract.MessageDelegate;
import com.unisys.trans.logistics.lms.framework.tty.element.Line;
import com.unisys.trans.logistics.lms.framework.tty.element.MessageHeaderTitleElement;

/**
 * {@link IncomingCWISMessageRequest} represents a teletype message request
 * provided to {@link MessageDelegate} for processing.
 * 
 */
public class IncomingCWISMessageRequest extends AbstractRequest {
	/**
	 * Attribute to hold <code>CRLF</code> property.
	 */

	private static String CRLF = "\\r\\n";

	/**
	 * Unique serial version UID.
	 */

	private static final long serialVersionUID = 1725075797389060340L;

	/**
	 * Attribute to hold <code>headerElement</code> property.
	 */

	private MessageHeaderTitleElement headerElement;

	/**
	 * Attribute to hold <code>messageLines</code> property.
	 */

	private List<Line> messageLines = new ArrayList<Line>();

	/**
	 * Attribute to hold <code>ttyMessage</code> property.
	 */
	private String ttyMessage;

	/**
	 * Attribute to hold <code>ttyMessage</code> property.
	 */
	private boolean invokeServiceInd;

	/**
	 * @param ttyMessage
	 */
	public IncomingCWISMessageRequest(final String pTtyMessage,
			final MessageHeaderTitleElement pHeaderElement) {
		super();
		this.ttyMessage = pTtyMessage;

		final String[] lines = pTtyMessage.split(CRLF);
		int lineIndex = 0;
		this.setInvokeServiceInd(true);
		for (final String line : lines) {
			if (lineIndex < pHeaderElement.getMessageStartIndex()) {
				lineIndex++;
			} else {
				this.messageLines.add(new Line(line));
			}
			String[] params = line.split("/");
			int totalLength = params.length;
			// Weight_Ind is used to identify the Worker element
			if (totalLength > 0
					&& MHSMessageConstants.WEIGHT_IND
							.equalsIgnoreCase(params[0])) {
				if (totalLength > 1
						&& MHSMessageConstants.MASGO.equalsIgnoreCase(params[1]
								.trim())) {
					this.setInvokeServiceInd(false);
				}
			}
		}
		this.headerElement = pHeaderElement;
	}

	/**
	 * Gets the <code>HeaderElement</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>HeaderElement</code> property.
	 */
	public MessageHeaderTitleElement getHeaderElement() {
		return this.headerElement;
	}

	/**
	 * Gets the <code>MessageLines</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>MessageLines</code> property.
	 */
	public List<Line> getMessageLines() {
		return this.messageLines;
	}

	/**
	 * Gets the <code>TtyMessage</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>TtyMessage</code> property.
	 */
	public String getTtyMessage() {
		return this.ttyMessage;
	}

	/**
	 * Sets the <code>HeaderElement</code> property.
	 * <p>
	 * 
	 * @param pHeaderElement
	 *            holds the new value of <code>HeaderElement</code>.<br>
	 */
	public void setHeaderElement(final MessageHeaderTitleElement pHeaderElement) {
		this.headerElement = pHeaderElement;
	}

	/**
	 * Sets the <code>MessageLines</code> property.
	 * <p>
	 * 
	 * @param pMessageLines
	 *            holds the new value of <code>MessageLines</code>.<br>
	 */
	public void setMessageLines(final List<Line> pMessageLines) {
		this.messageLines = pMessageLines;
	}

	/**
	 * Sets the <code>TtyMessage</code> property.
	 * <p>
	 * 
	 * @param pTtyMessage
	 *            holds the new value of <code>TtyMessage</code>.<br>
	 */
	public void setTtyMessage(final String pTtyMessage) {
		this.ttyMessage = pTtyMessage;
	}

	/**
	 * @return the invokeServiceInd
	 */
	public boolean isInvokeServiceInd() {
		return this.invokeServiceInd;
	}

	/**
	 * @param pInvokeServiceInd
	 *            the invokeServiceInd to set
	 */
	public void setInvokeServiceInd(final boolean pInvokeServiceInd) {
		this.invokeServiceInd = pInvokeServiceInd;
	}
}
