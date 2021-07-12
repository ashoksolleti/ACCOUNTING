package com.unisys.trans.logistics.lms.utils.dto;

public class TTYAddressResponse {

		private String fromEmailAddress;
		private String toEmailAddress1;
		private String toEmailAddress2;
		private boolean attachment;
		private String ccEmailAdress1;
		private String ccEmailAdress2;
		private String carrierCode;


		/**
		 * @return the ccEmailAdress2
		 */
		public String getCcEmailAdress2() {
			return ccEmailAdress2;
		}
		/**
		 * @param ccEmailAdress2 the ccEmailAdress2 to set
		 */
		public void setCcEmailAdress2(String ccEmailAdress2) {
			this.ccEmailAdress2 = ccEmailAdress2;
		}
		/**
		 * @return the ccEmailAdress1
		 */
		public String getCcEmailAdress1() {
			return ccEmailAdress1;
		}
		/**
		 * @param ccEmailAdress1 the ccEmailAdress1 to set
		 */
		public void setCcEmailAdress1(String ccEmailAdress1) {
			this.ccEmailAdress1 = ccEmailAdress1;
		}
		/**
		 * @return the attachment
		 */
		public boolean isAttachment() {
			return attachment;
		}
		/**
		 * @param attachment the attachment to set
		 */
		public void setAttachment(boolean attachment) {
			this.attachment = attachment;
		}
		/**
		 * @return the fromEmailAddress
		 */
		public String getFromEmailAddress() {
			return fromEmailAddress;
		}
		/**
		 * @param fromEmailAddress the fromEmailAddress to set
		 */
		public void setFromEmailAddress(String fromEmailAddress) {
			this.fromEmailAddress = fromEmailAddress;
		}
		/**
		 * @return the carrierCode
		 */
		public String getCarrierCode() {
			return carrierCode;
		}
		/**
		 * @param carrierCode the carrierCode to set
		 */
		public void setCarrierCode(String carrierCode) {
			this.carrierCode = carrierCode;
		}
		/**
		 * @return the toEmailAddress1
		 */
		public String getToEmailAddress1() {
			return toEmailAddress1;
		}
		/**
		 * @param toEmailAddress1 the toEmailAddress1 to set
		 */
		public void setToEmailAddress1(String toEmailAddress1) {
			this.toEmailAddress1 = toEmailAddress1;
		}
		/**
		 * @return the toEmailAddress2
		 */
		public String getToEmailAddress2() {
			return toEmailAddress2;
		}
		/**
		 * @param toEmailAddress2 the toEmailAddress2 to set
		 */
		public void setToEmailAddress2(String toEmailAddress2) {
			this.toEmailAddress2 = toEmailAddress2;
		}
		
}
