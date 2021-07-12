package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;

/**
 * <code>ParticipantTypeDto</code> contain details of ParticipantType.
 * <p>
 * This contains all information about ParticipantType.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>participantDescription
 * <li>participantType
 * <li>oid
 * <li>action
 * </ul>
 */

public class ParticipantTypeDto extends PersistenceObjectDto {

    /**
	 * 
	 */
    private static final long serialVersionUID = 410475502945082675L;

    /**
     * Attribute to hold <code>participantDescription</code> property.
     */
    
    public String participantDescription;
    
    /**
     * Attribute to hold <code>participantType</code> property.
     */
    
    public String participantType;
    
    /**
     * Attribute to hold <code>participantDescription</code> property.
     */
    
    private ActionType action;
    
    /**
     * Attribute to hold <code>oid</code> property.
     */
    
    private Long oid;

    /**
	 * Get the value of action.
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
	 * @return <code>Action</code><br>
	 *         Returns the value of action.
	 *         </p>
	 */
    
    public ActionType getAction() {
        return this.action;
    }

    /**
	 * Get the value of OId.
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
	 * @return <code>OId</code><br>
	 *         Returns the value of OId.
	 *         </p>
	 */
    @Override
    public Long getOId() {
        return this.oid;
    }

    /**
	 * Get the value of participantDescription.
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
	 * @return <code>participantDescription</code><br>
	 *         Returns the participantDescription.
	 *         </p>
	 */
	 
    public String getParticipantDescription() {
        return this.participantDescription;
    }

    /**
	 * Get the value of participantType.
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
	 * @return <code>participantType</code><br>
	 *         Returns the participantType.
	 *         </p>
	 */
    public String getParticipantType() {
        return this.participantType;
    }

    /**
	 * Sets the value of action.
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
	 * @param pAction
	 *        Input for action.<br>
	 *         </p>
	 */
    
    public void setAction(final ActionType pAction) {
        this.action = pAction;
    }

    /**
	 * Sets the value of OId.
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
	 * @param pOId
	 *        Input for OId.<br>
	 *         </p>
	 */
    
    public void setOId(final Long pOId) {
        this.oid = pOId;
    }

    /**
	 * Sets the value of the <code>participantDescription</code> property.
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
	 * @param pParticipantDescription
	 *            Input for participantDescription.<br>
	 *            </p>
	 */
    
    public void setParticipantDescription(final String pParticipantDescription) {
        this.participantDescription = pParticipantDescription;
    }

    /**
	 * Sets the value of the <code>participantType</code> property.
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
	 * @param pParticipantType
	 *            Input for participantType.<br>
	 *            </p>
	 */
    public void setParticipantType(final String pParticipantType) {
        this.participantType = ContractUtility.convertToUpperCase(pParticipantType);
    }

    
}
