package com.unisys.trans.logistics.lms.framework.tty.ucs.parser;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.framework.tty.element.Element;

/**
 * <code>TeletypeRequestTranslator</code> is used to build request and extract response.
 * 
 * <p>
 * This class has the following functions:<br>
 * <ul>
 * <li>makeRequest
 * <li>
 * </ul>
 * </p>
 */

public interface TeletypeRequestTranslator {

    /**
     * constructing AbstractRequest.
     * <p>
     * 
     * @param pElements
     *            contains elements.
     * @return AbstractRequest
     *         contains the elements.
     * @throws LMSException if validation fails.
     * 
     * 
     */

     AbstractRequest makeRequest(List<Element> pElements) throws LMSException;

}
