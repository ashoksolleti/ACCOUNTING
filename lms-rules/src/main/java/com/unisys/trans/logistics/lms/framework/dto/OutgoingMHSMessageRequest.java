package com.unisys.trans.logistics.lms.framework.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.MHSMessageConstants;
import com.unisys.trans.logistics.lms.framework.tty.element.Line;
import com.unisys.trans.logistics.lms.framework.tty.element.MessageHeaderTitleElement;

public class OutgoingMHSMessageRequest extends AbstractRequest {

	/**
	 * Unique serial version UID.
	 */

	private static final long serialVersionUID = 2358776382417164832L;

	/**
	 * Attribute to hold <code>headerElement</code> property.
	 */

	private MessageHeaderTitleElement messageHeaderTitleElement;

	/**
	 * Attribute to hold <code> messageLines</code> property.
	 */

	private List<Line> messageLines = new ArrayList<Line>();

	/**
	 * Attribute to hold <code>ttyMessage</code> property.
	 */

	private String cwisMessage;

	/**
	 * @param headerElement
	 * @param messageLines
	 */
	public OutgoingMHSMessageRequest(final List<Line> pMessageLines,
			final MessageHeaderTitleElement pHeaderElement) {
		super();
		this.messageHeaderTitleElement = pHeaderElement;
		this.messageLines = pMessageLines;
		final List<Line> headerLines = this.messageHeaderTitleElement
				.buildLines();
		final StringBuilder ttyBuilder = new StringBuilder();
		for (final Line headerLine : headerLines) {
			ttyBuilder.append(headerLine.toString());
			ttyBuilder.append(MHSMessageConstants.BACKSLASH_N);
		}
		for (final Line contentLine : this.messageLines) {
			ttyBuilder.append(contentLine.toString());
			if (contentLine.toString().equals("LAST")) {
				ttyBuilder.append(MHSMessageConstants.NEXT_LINE);
			} else {
				ttyBuilder.append(MHSMessageConstants.BACKSLASH_N);
			}
		}
		this.cwisMessage = ttyBuilder.toString();
	}

	public MessageHeaderTitleElement getMessageHeaderTitleElement() {
		return messageHeaderTitleElement;
	}

	public void setMessageHeaderTitleElement(
			MessageHeaderTitleElement messageHeaderTitleElement) {
		this.messageHeaderTitleElement = messageHeaderTitleElement;
	}

	/**
	 * Gets the MessageLines.
	 * <p>
	 * 
	 * @return the current value of <code>messageLines</code> property.<br>
	 */
	public List<Line> getMessageLines() {
		return this.messageLines;
	}

	/**
	 * Sets the MessageLines.
	 * <p>
	 * 
	 * @param pMessageLines
	 *            the current value of <code>MessageLines</code> property.<br>
	 */
	public void setMessageLines(final List<Line> pMessageLines) {
		this.messageLines = pMessageLines;
	}

	public String getCwisMessage() {
		return cwisMessage;
	}

	public void setCwisMessage(String cwisMessage) {
		this.cwisMessage = cwisMessage;
	}

}
