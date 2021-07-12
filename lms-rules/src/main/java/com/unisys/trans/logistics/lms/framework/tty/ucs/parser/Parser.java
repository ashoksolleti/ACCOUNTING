/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.tty.ucs.parser;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.framework.tty.element.Element;
import com.unisys.trans.logistics.lms.framework.tty.element.Line;
import com.unisys.trans.logistics.lms.framework.tty.element.MessageHeaderElement;

/**
 * {@link Parser} is used for parsing a teletype message. A list of lines are
 * converted into meaningful teletype {@link Element} objects.
 * 
 */
public interface Parser {
    /**
     * API method to buildMessage for TTYElements.
     * 
     * @param ppMessageLines instance.
     */

     List<Line> buildMessage(final List<Element> pTTYElement);

    /**
     * API method to parse messagelines.
     * 
     * @param ppMessageLines instance.
     */

     List<Element> parse(final MessageHeaderElement pMessageHeaderElement ,final List<Line> pMessageLines) throws LMSException;

    /**
     * API method to parse messagelines.
     * 
     * @param ppMessageLines instance.
     */
     List<Element> parse(final List<Line> pMessageLines) throws LMSException;
    /**
     * API method to find the BusinessKey of TTYMessage
     * 
     * @param pFFRMessageLines
     * @return String - businessKey
     */
	 String getBusinessKey(final List<Line> pFFRMessageLines);

}
