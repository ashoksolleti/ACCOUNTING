/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.tty.element;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface MultiLineElement {

    /**
     * This method to used to build the Message.
     * <p>
     * 
     * @return the <code>List of Line </code> object.
     */
    public List<Line> buildElement();

    /**
     * This method takes a complete list of lines for a specific line type as a request and converts it
     * into a Specific Element Object.
     * <p>
     * 
     * @param pTTYLine
     *            holds the input <code>List of Line</code> value which contains the Message information.
     *            <p>
     * @return the <code>Element </code> object with specific Element type.
     */
    public Element parseElement(List<Line> pTTYLine) throws LMSException;
}
