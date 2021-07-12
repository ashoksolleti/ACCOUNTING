/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.mhs.parser;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.framework.tty.element.Element;
import com.unisys.trans.logistics.lms.framework.tty.element.Line;

/**
 * {@link Parser} is used for parsing a teletype message. A list of lines are
 * converted into meaningful teletype {@link Element} objects and Vice versa.
 * 
 */
public interface Parser {

    /**
     * This method takes a complete list of Element objects as a request and 
     * build the message which will return as a list of Lines.
     * <p>
     * 
     * @param pTTYElement
     *            the parameter is of type request List<Element>.
     *            <p>
     * @return contains list of Line with messages.
     *         <p>
     */
    public List<Line> buildMessage(final List<Element> pTTYElement);

    /**
     * This method takes a complete list of message lines as a request and converts it
     * into a list of Specific Element Objects.
     * <p>
     * 
     * @param pMessage
     *            holds the input <code>String</code> value which contains the
     *            FWB information.
     *            <p>
     * @return the <code>List<Element></code> object with Specific details.
     */
    public List<Element> parse(final List<Line> pMessageLines) throws LMSException,Exception;

    /**
     * This overridden method is used to get the business key info
     * <p>
     * 
     * @param messageLines
     *            holds the input <code>List<Line></code> value which contains the
     *            message detail.
     *            <p>
     * @return the <code>String</code> that contain awb number as a business key.
     */
    public String getBusinessKey(final List<Line> pFFRMessageLines);

}
