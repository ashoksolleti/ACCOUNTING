package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>ParticipantTypeResponse</code> contains the response of the maintenance
 * request received by <code>ParticipantTypeService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>ParticipantTypeDto
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.ParticipantTypeDto
 * ParticipantTypeDto
      
 */

public class ParticipantTypeResponse extends AbstractResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5293407024131441273L;
	
	/**
     * Attribute to hold <code>participantTypeDtoList</code> property.
     */
	
	public List<ParticipantTypeDto> participantTypeDtos;

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
		return this.participantTypeDtos;
	}

	/**
	 * Sets the value of the <code>modifiedParticipantTypeDtos</code> property.
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
	
	public void setParticipantTypeDtos(
			List<ParticipantTypeDto> pParticipantTypeDtos) {
		this.participantTypeDtos = pParticipantTypeDtos;
	}

	
	
	
	
	

	
	
	
	
}
