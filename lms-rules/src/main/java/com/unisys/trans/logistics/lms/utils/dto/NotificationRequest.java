package com.unisys.trans.logistics.lms.utils.dto;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class NotificationRequest extends AbstractRequest {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4988579933510325374L;

	/** Holds the email from address **/
	private String fromAddress;
	
	/** Holds the email 'To' address **/
	private String toAddress;
	
	/** Holds the email 'Cc' address **/
	private String ccAddress;
	
	/** Holds the email list of 'To' address **/
	private List<String> toAddresses;
	
	/** Holds the email list of 'CC' address **/
	private List<String> ccAddresses;
	
	/** Holds the email subject **/
	private String subject;
	
	/** Holds the email content **/
	private String emailContent;
	
	/** Holds the email content, value: "text/html" "text/plain" **/
	private String contentType;
	
	/** Holds the attachment file Name**/
	private String fileName;
	
	/** Holds the attachment **/
	private InputStream attachment;
	
	private Map<String, String> ttyAddressMap;
	
	/** Holds the module name where notification requested **/
	private String requestFrom;
	
	private boolean attachmentOnly;
	private boolean mailFromBatch;
	
	private Properties props;
	
	public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public boolean isMailFromBatch() {
        return mailFromBatch;
    }

    public void setMailFromBatch(boolean mailFromBatch) {
        this.mailFromBatch = mailFromBatch;
    }

    /**
	 * @return the fromAddress
	 */
	public String getFromAddress() {
		return fromAddress;
	}

	/**
	 * @param fromAddress the fromAddress to set
	 */
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	/**
	 * @return the toAddress
	 */
	public String getToAddress() {
		return toAddress;
	}

	/**
	 * @param toAddress the toAddress to set
	 */
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	/**
	 * @return the toAddresses
	 */
	public List<String> getToAddresses() {
		return toAddresses;
	}

	/**
	 * @param toAddresses the toAddresses to set
	 */
	public void setToAddresses(List<String> toAddresses) {
		this.toAddresses = toAddresses;
	}

	/**
	 * @return the ccAddresses
	 */
	public List<String> getCcAddresses() {
		return ccAddresses;
	}

	/**
	 * @param ccAddresses the ccAddresses to set
	 */
	public void setCcAddresses(List<String> ccAddresses) {
		this.ccAddresses = ccAddresses;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the emailContent
	 */
	public String getEmailContent() {
		return emailContent;
	}

	/**
	 * @param emailContent the emailContent to set
	 */
	public void setEmailContent(String emailContent) {
		this.emailContent = emailContent;
	}

	/**
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * @param contentType the contentType to set
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the attachment
	 */
	public InputStream getAttachment() {
		return attachment;
	}

	/**
	 * @param attachment the attachment to set
	 */
	public void setAttachment(InputStream attachment) {
		this.attachment = attachment;
	}

	/**
	 * @return the ttyAddressMap
	 */
	public Map<String, String> getTtyAddressMap() {
		return ttyAddressMap;
	}

	/**
	 * @param ttyAddressMap the ttyAddressMap to set
	 */
	public void setTtyAddressMap(Map<String, String> ttyAddressMap) {
		this.ttyAddressMap = ttyAddressMap;
	}

	/**
	 * @return the requestFrom
	 */
	public String getRequestFrom() {
		return requestFrom;
	}

	/**
	 * @param requestFrom the requestFrom to set
	 */
	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}

	
	/**
	 * @return the attachmentOnly
	 */
	public boolean isAttachmentOnly() {
		return attachmentOnly;
	}

	/**
	 * @param attachmentOnly the attachmentOnly to set
	 */
	public void setAttachmentOnly(boolean attachmentOnly) {
		this.attachmentOnly = attachmentOnly;
	}

	/**
	 * @return the ccAddress
	 */
	public String getCcAddress() {
		return ccAddress;
	}

	/**
	 * @param ccAddress the ccAddress to set
	 */
	public void setCcAddress(String ccAddress) {
		this.ccAddress = ccAddress;
	}
	
	

}
