package com.unisys.trans.logistics.lms.framework.dto;

import java.util.LinkedList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.contract.MessageDelegate;
import com.unisys.trans.logistics.lms.framework.tty.element.Line;
import com.unisys.trans.logistics.lms.framework.tty.element.MessageHeaderElement;


/**
 * {@link IncomingTTYMessageRequest} represents a teletype message request
 * provided to {@link MessageDelegate} for processing.
 * 
 */
public class IncomingTTYMessageRequest extends AbstractRequest {
    /**
     * Attribute to hold <code>CRLF</code> property.
     */

    private static final String CRLF = System.getProperty("line.separator");

    /**
     * Unique serial version UID.
     */

    private static final long serialVersionUID = 1725075797389060340L;

    /**
     * Attribute to hold <code>headerElement</code> property.
     */

    private MessageHeaderElement headerElement;

    /**
     * Attribute to hold <code>messageLines</code> property.
     */

    private List<Line> messageLines = new LinkedList<Line>();

    /**
     * This constant should be used instead of hard coded "" or "new String()"
     * to avoid the creation of a new instance of String().
     */
    public static final String EMPTY_STRING = "";
    
    /**
     * Attribute to hold <code>ttyMessage</code> property.
     */
    private String ttyMessage;

    public IncomingTTYMessageRequest() {
    }

    /**
     * Constructor splits incoming tty message into two parts respectively
     * messageLines , headerElement
     * 
     * @param ttyMessage
     * @param pHeaderElement
     */
    public IncomingTTYMessageRequest(final String pTtyMessage, final MessageHeaderElement pHeaderElement) {
        super();
        this.ttyMessage = pTtyMessage;
        final String[] lines = pTtyMessage.split(CRLF);
        int lineIndex = 0;
        for (final String line : lines) {
            if (lineIndex < pHeaderElement.getMessageStartIndex()) {
                lineIndex++;
            }
            else if (line != null
                        && !(line.trim().equals(EMPTY_STRING)
                                    || line.trim().equals(String.valueOf(FrameworkConstants.ETX))
                                    || line.trim().equals(String.valueOf(FrameworkConstants.EOT)))) {
                this.messageLines.add(new Line(line));
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
    public MessageHeaderElement getHeaderElement() {
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
    public void setHeaderElement(final MessageHeaderElement pHeaderElement) {
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
}
