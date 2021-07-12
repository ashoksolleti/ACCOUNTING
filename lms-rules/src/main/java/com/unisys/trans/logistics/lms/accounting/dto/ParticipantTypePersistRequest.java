package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ParticipantTypePersistRequest</code> class represents the request to update
 * ParticipantTypeinformation details.
 * <p>
 * <code>ParticipantTypePersistRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>ParticipantTypeDto
 * </code>
 * </ul>
 */
public class ParticipantTypePersistRequest extends AbstractRequest{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9106602387601179226L;
	
	/**
     * Attribute to hold list of <code>ParticipantTypeDto</code> property.
     */
	
	private List<ParticipantTypeDto> ParticipantTypeDtos = null;
	
	 /**
     * Get the list of participantTypeDtos.
     * <p>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return <code>participantTypeDtos</code><br>
     *         Returns the participantTypeDtos.
     *         </p>
     */
	
	public List<ParticipantTypeDto> getParticipantTypeDtos() {
		if(ParticipantTypeDtos== null)
		{
			ParticipantTypeDtos = new ArrayList<ParticipantTypeDto>();
		}
		return ParticipantTypeDtos;
	}
	
	
	/**
	 * Sets the value of the <code>participantTypeDtos</code> property.
	 * <p>
	 * <p>
	 * <b>Release Notes:</b> <br>
	 * <table border="1" cellspacing="0" cellpadding="5" width="80%">
	 * <tr>
	 * <th align="left">Release</th>
	 * <th align="left">Notes</th>
	 * </tr>
	 * <tr>
	 * <td>@since 1.0</td>
	 * <td>&nbsp;</td>
	 * </tr>
	 * </table>
	 * <p>
	 * 
	 * @param pParticipantTypeDtos
	 *            Input for participantTypeDtos.<br>
	 *            </p>
	 */
	
	public void setParticipantTypeDtos(List<ParticipantTypeDto> pParticipantTypeDtos) {
		this.ParticipantTypeDtos = pParticipantTypeDtos;
	}
	

	

}
