/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.tty.ucs.parser;

import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.framework.tty.element.Element;
import com.unisys.trans.logistics.lms.framework.tty.element.Line;

/**
 * {@link SplitParser} is used for parsing a teletype message. A list of lines are
 * converted into meaningful teletype {@link Element} objects.
 * 
 */
public interface SplitParser extends Parser {
    /**
     * API method to split and parse message lines.
     * 
     * @param ppMessageLines instance.
     */
    Map<Integer, List<Element>> splitAndParse(final List<Line> pMessageLines) throws LMSException, Exception;
}
