package com.unisys.trans.logistics.lms.framework.mhs.parser;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.IncomingCWISMessageRequest;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.framework.tty.element.Element;

/**
 * <code>MHSRequestTranslator</code> is an interface for Material Handling Request(MHS) to build request and extract response.
 * 
 * <p>
 * This class has the following functions:<br>
 * <ul>
 * <li>makeRequest
 * <li>
 * </ul>
 * </p>
 */

public interface MHSRequestTranslator   { 

     /**
     * constructing AbstractRequest.
     * <p>
     * 
     * @param pElements
     *            contains elements.
     * @return AbstractRequest
     *         contains the elements.
     *         <p>
     * 
     */

    public String makeRequest(List<Element> pElements,IncomingCWISMessageRequest pIncomingCWISMessageRequest) throws LMSException; 

}
