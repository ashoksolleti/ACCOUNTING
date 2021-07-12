/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.tty.element;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
/**
 * {@link SingleLineElement} represents a group of related attributes in a teletype
 * message. For example, in a FWB message an AWB line could be represented by an
 * element (with attributes like airline code number, shipment reference,
 * routing etc). Elements are derived from {@link Line} and {@link Field} objects.
 * 
 */
public interface SingleLineElement {

    /**
     * Method to build the element
     * **/

    public Line buildElement();

    /**
     * @param pTTYLine
     * **/

    public Element parseElement(Line pTTYLine) throws LMSException;
}
