/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.exception;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.constants.SelectIdentifierType;
import com.unisys.trans.logistics.lms.rating.dto.price.PriceDto;

/**
 * <code>LMSException</code> class throws application level error messages.
 * <p>
 * This class performs the following functions:
 * <ul>
 * <li>Gets the code message.
 * <li>Gets the status.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.framework.exception.CodeMessage
 */
public class PricingSelectionException extends LMSException {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4843782084713512782L;

    /**
     * Attribute to hold the list of <code>Price</code> object.
     */
    private List<PriceDto> priceDtos;

    /**
     * Default Constructor.
     */
    public PricingSelectionException() {

    }

    /**
     * Class constructor with a list of code messages.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pSelectIdentifierType holds the
     *            {@link com.unisys.trans.logistics.lms.rating.dto.constants.SelectIdentifierType}
     *            SelectIdentifierType.
     * @param pPrices contains the list of {@link com.unisys.trans.logistics.lms.rating.PriceDto.data.Price}
     *            Price.
     */
    public PricingSelectionException(final List<PriceDto> pPriceDtos) {
        this.setPriceDtos(pPriceDtos);
    }

    public List<PriceDto> getPriceDtos() {
        return this.priceDtos;
    }

    public void setPriceDtos(List<PriceDto> pPriceDtos) {
        this.priceDtos = pPriceDtos;
    }

}
