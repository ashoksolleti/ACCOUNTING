package com.unisys.trans.logistics.lms.framework.tty.element;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.constants.ElementType;

public abstract class CWISElement implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 3167686898020106230L;

    /**
     * @return
     */
    public Element buildLastElement() {
        LastElement lElement = new LastElement();
        lElement.setEndOfMessageIndicator(ElementType.LAST.getValue());
        return lElement;
    }
    
    
    

}
