package com.unisys.trans.logistics.lms.parts.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class ParticipantContactPersistRequest extends AbstractRequest {
	 /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    /**
	     * Attribute to hold <code>lmsdatabaseKey</code> property.
	   */
	 private String lmsdatabaseKey;
	
	
	 private List<ParticipantNotificationDto> participantNotificationDtos;

		/**
		 * @return the participantNotificationDtos
		 */
		public List<ParticipantNotificationDto> getParticipantNotificationDtos() {
			return participantNotificationDtos;
		}

		/**
		 * @param participantNotificationDtos the participantNotificationDtos to set
		 */
		public void setParticipantNotificationDtos(List<ParticipantNotificationDto> participantNotificationDtos) {
			this.participantNotificationDtos = participantNotificationDtos;
		}

		/**
		 * @return the lmsdatabaseKey
		 */
		public String getLmsdatabaseKey() {
			return lmsdatabaseKey;
		}

		/**
		 * @param lmsdatabaseKey the lmsdatabaseKey to set
		 */
		public void setLmsdatabaseKey(String lmsdatabaseKey) {
			this.lmsdatabaseKey = lmsdatabaseKey;
		}


}
