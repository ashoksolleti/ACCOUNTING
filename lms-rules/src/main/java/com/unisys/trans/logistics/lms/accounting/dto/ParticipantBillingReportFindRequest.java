package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;



public class ParticipantBillingReportFindRequest extends AbstractRequest {

		private static final long serialVersionUID = 1L;
		private ParticipantBillingReportDto participantbillingReportDto =new ParticipantBillingReportDto();
		/**
		 * @return the billingReportFindDto
		 */
		public ParticipantBillingReportDto getParticipantBillingReportDto() {
			return participantbillingReportDto;
		}
		/**
		 * @param billingReportFindDto the billingReportFindDto to set
		 */
		public void setParticipantBillingReportDto(ParticipantBillingReportDto participantbillingReportDto) {
			this.participantbillingReportDto = participantbillingReportDto;
		}
		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		private String specificAirline;
		public String getSpecificAirline() {
			return specificAirline;
		}
		public void setSpecificAirline(String specificAirline) {
			this.specificAirline = specificAirline;
		}
		
		private int pageNumber = 0;
		public int getPageNumber() {
			return pageNumber;
		}
		public void setPageNumber(int pageNumber) {
			this.pageNumber = pageNumber;
		}
		
		
}