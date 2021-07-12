package com.unisys.trans.logistics.lms.framework.dto.ucs;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.tty.element.Line;
import com.unisys.trans.logistics.lms.framework.tty.element.MessageHeaderElement;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class OutgoingTTYMessageRequest extends AbstractRequest {

    /**
     * Attribute to hold <code>CRLF</code> property.
     */

    private static final String CRLF = "\r\n";

    private static final String LINE_SEPARATOR = "line.separator";

    /**
     * Unique serial version UID.
     */

    private static final long serialVersionUID = 2358776382417164832L;

    private String businessKey2;

    private boolean eucustomsInd;
    
    /**
     * Attribute to hold <code>headerElement</code> property.
     */

    private String fsuStatusType;

    /**
     * Attribute to hold <code>headerElement</code> property.
     */

    private MessageHeaderElement headerElement;

    private boolean ilcustomsInd;

    /**
     * Attribute to hold <code> messageLines</code> property.
     */

    private List<Line> messageLines = new ArrayList<Line>();

    private String queueName;

    /**
     * Attribute to hold <code> securityRejection</code> property.
     */

    private boolean securityRejection;
    
    private String rejectionMessageTypeCode;

    /**
     * Attribute to hold <code> serviceNamecheck</code> property.
     */

    private String serviceNamecheck;

    private String station;

    /**
     * Attribute to hold the <code>totalNumberOfCharacters</code> property.
     */
    private long totalNumberOfCharacters;

    /**
     * Attribute to hold <code>ttyMessage</code> property.
     */

    private String ttyMessage;

    /**
     * Attribute to hold <code>xmlAddress</code> property.
     */

    private String xmlAddress;
    
    private boolean sendECTDGAMessage=false;//DL540
    
    private Boolean armxCustoms=false;//HIS019

    private boolean xmlMessage; //TR-3000637
    
    private boolean isSAPorTruncateMessage;
     
	public boolean isSAPorTruncateMessage() {
		return isSAPorTruncateMessage;
	}

	public void setSAPorTruncateMessage(boolean isSAPorTruncateMessage) {
		this.isSAPorTruncateMessage = isSAPorTruncateMessage;
	}

	/**
     * @param headerElement
     * @param messageLines
     */
    public OutgoingTTYMessageRequest(final List<Line> pMessageLines,
                final MessageHeaderElement pHeaderElement) {
        super();
        final List<Line> theMessageLines = new ArrayList<Line>();
        for (Line aLine : pMessageLines) {
            String aLineString = aLine.toString();
            String aLineString1 =  aLine.toString();
            if (aLineString.length() > 69 && (pHeaderElement.getMessageIdentifier()!=null &&  !pHeaderElement.getMessageIdentifier().equalsIgnoreCase("NTM"))) {
                aLineString = aLineString.substring(0, 69);
                theMessageLines.add(new Line(aLineString, false));
                aLineString1=FrameworkConstants.FORWARD_SLASH + aLineString1.substring(69,aLineString1.length());
                theMessageLines.add(new Line(aLineString1,false));
            }
            else {
                theMessageLines.add(new Line(aLineString, false));
            }

        }
        this.headerElement = pHeaderElement;
        this.messageLines = theMessageLines;
        final StringBuilder ttyBuilder = new StringBuilder();
        if (pHeaderElement.getMessageIdentifier()!=null &&  !pHeaderElement.getMessageIdentifier().equalsIgnoreCase("BCF")){
            final List<Line> headerLines = this.headerElement.buildLines();
            for (final Line headerLine : headerLines) {
                if (headerLine.getLineFields().get(0).getContent() != null) {
                    ttyBuilder.append(ContractUtility.convertToUpperCase(headerLine
                            .toString()));
                    ttyBuilder.append(CRLF);
                }
            }
        }else{
            final List<Line> headerLines = this.headerElement.buildBCFLines();
            for (final Line headerLine : headerLines) {
                if (headerLine.getLineFields().get(0).getContent() != null) {
                    ttyBuilder.append(ContractUtility.convertToUpperCase(headerLine
                            .toString()));
                    ttyBuilder.append(CRLF);
                }
            }
        }
        
        if (pHeaderElement.getMessageIdentifier()!=null &&  pHeaderElement.getMessageIdentifier().equalsIgnoreCase("NTM")) 
        	ttyBuilder.replace(ttyBuilder.lastIndexOf(CRLF), ttyBuilder.length(), " ");
        
		for (final Line contentLine : this.messageLines) {

			if (FrameworkConstants.EMPTY_STRING.equals(contentLine.toString())
					&& null != pHeaderElement.getMessageIdentifier()
					&& !"FFM".equalsIgnoreCase(pHeaderElement.getMessageIdentifier())
					&& !"FMG".equalsIgnoreCase(pHeaderElement.getMessageIdentifier())) {//LMS-69382 changes- skipping empty lines for only FFM and FMG
				ttyBuilder.append(contentLine.toString());
				ttyBuilder.append(CRLF);
			}
			else if (contentLine.getLineFields() != null && !contentLine.toString().isEmpty()) {
				ttyBuilder.append(ContractUtility.convertToUpperCase(contentLine.toString()));
				ttyBuilder.append(CRLF);
			}
		}
        ttyBuilder.append(FrameworkConstants.ETX);
        //ttyBuilder.append(CRLF);
        //ttyBuilder.append(CRLF);
        //ttyBuilder.append(CRLF);
        //ttyBuilder.append(FrameworkConstants.EOT);

        if (ttyBuilder.toString().contains("<br/>")) {
            this.ttyMessage = ttyBuilder.toString().replaceAll("<br/>",
                System.getProperty(LINE_SEPARATOR));
        }
        if (ttyBuilder.toString().contains("\n")) {
            this.ttyMessage = ttyBuilder.toString().replaceAll("\n",
                System.getProperty(LINE_SEPARATOR));
        }
        if (ttyBuilder.toString().contains("\\r\\n")) {
            this.ttyMessage = ttyBuilder.toString().replaceAll("\\r\\n",
                System.getProperty(LINE_SEPARATOR));
        }
        if (ttyBuilder.toString().contains("\r\n")) {
            this.ttyMessage = ttyBuilder.toString().replaceAll("\r\n",
                System.getProperty(LINE_SEPARATOR));
        }
        if (ttyBuilder.toString().contains("\\\\r\\\\n")) {
            this.ttyMessage = ttyBuilder.toString().replaceAll("\\\\r\\\\n",
                System.getProperty(LINE_SEPARATOR));
        }
        this.ttyMessage = ttyBuilder.toString();

    }

    public OutgoingTTYMessageRequest(final String pXmlMessage) {
        this.ttyMessage = pXmlMessage;
    }

    /**
     * @return the businessKey2
     */
    public String getBusinessKey2() {
        return businessKey2;
    }

    public String getFsuStatusType() {
        return fsuStatusType;
    }

    /**
     * Gets the HeaderElement.
     * <p>
     * 
     * @return the current value of <code>headerElement</code> property.<br>
     */
    public MessageHeaderElement getHeaderElement() {
        return this.headerElement;
    }



    /**
     * Gets the MessageLines.
     * <p>
     * 
     * @return the current value of <code>messageLines</code> property.<br>
     */
    public List<Line> getMessageLines() {
        return this.messageLines;
    }

    public String getQueueName() {
        return queueName;
    }

    /**
     * Gets the serviceNamecheck.
     * <p>
     * 
     * @return the current value of <code>serviceNamecheck</code> property.<br>
     */
    public String getServiceNamecheck() {
        return this.serviceNamecheck;
    }

    /**
     * @return the station
     */
    public String getStation() {
        return this.station;
    }

    /**
     * Gets the <code>totalNumberOfCharacters</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-10 Numeric
     * <p>
     * <b>Example: </b><br>
     * 786
     * <p>
     * 
     * @return the current value of <code>totalNumberOfCharacters</code>
     *         property.
     */
    public final long getTotalNumberOfCharacters() {
        return this.totalNumberOfCharacters;
    }

    /**
     * Gets the TtyMessage.
     * <p>
     * 
     * @return the current value of <code>ttyMessage</code> property.<br>
     */
    public String getTtyMessage() {
        return this.ttyMessage;
    }

    /**
     * Gets the xmlAddress.
     * <p>
     * 
     * @return the current value of <code>xmlAddress</code> property.<br>
     */
    public String getXmlAddress() {
        return this.xmlAddress;
    }

    public boolean isEucustomsInd() {
        return this.eucustomsInd;
    }

    public boolean isIlcustomsInd() {
        return this.ilcustomsInd;
    }

    /**
     * @return the securityRejection
     */
    public boolean isSecurityRejection() {
        return this.securityRejection;
    }

    public boolean isXmlMessage() {
		return this.xmlMessage;
	}
    /**
     * @param businessKey2
     *            the businessKey2 to set
     */
    public void setBusinessKey2(String businessKey2) {
        this.businessKey2 = businessKey2;
    }

    public void setEucustomsInd(final boolean pEucustomsInd) {
        this.eucustomsInd = pEucustomsInd;
    }

    public void setFsuStatusType(final String pFsuStatusType) {
        this.fsuStatusType = pFsuStatusType;
    }

    /**
     * Sets the HeaderElement.
     * <p>
     * 
     * @param pHeaderElement
     *            the current value of <code>HeaderElement</code> property.<br>
     */
    public void setHeaderElement(final MessageHeaderElement pHeaderElement) {
        this.headerElement = pHeaderElement;
    }
    
	public void setXmlMessage(boolean xmlMessage) {
		this.xmlMessage = xmlMessage;
	}

    public void setIlcustomsInd(final boolean pIlcustomsInd) {
        this.ilcustomsInd = pIlcustomsInd;
    }


    /**
     * Sets the MessageLines.
     * <p>
     * 
     * @param pMessageLines
     *            the current value of <code>MessageLines</code> property.<br>
     */
    public void setMessageLines(final List<Line> pMessageLines) {
        this.messageLines = pMessageLines;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    /**
     * @param securityRejection
     *            the securityRejection to set
     */
    public void setSecurityRejection(final boolean pSecurityRejection) {
        this.securityRejection = pSecurityRejection;
    }

    /**
     * Sets the serviceNamecheck.
     * <p>
     * 
     * @param pServiceNamecheck
     *            the current value of <code>serviceNamecheck</code> property.<br>
     */
    public void setServiceNamecheck(final String pServiceNamecheck) {
        this.serviceNamecheck = pServiceNamecheck;
    }

    /**
     * @param Station the pStation to set
     */
    public void setStation(String pStation) {
        this.station = pStation;
    }

    /**
     * Sets the <code>totalNumberOfCharacters</code> property.<br>
     * <p>
     * <b>Format: </b><br>
     * 1-10 Numeric
     * <p>
     * <b>Example: </b><br>
     * 786
     * <p>
     * 
     * @param pTotalNumberOfCharacters
     *            the new value of <code>totalNumberOfCharacters</code>
     *            property.<br>
     */
    public final void setTotalNumberOfCharacters(
                final long pTotalNumberOfCharacters) {
        this.totalNumberOfCharacters = pTotalNumberOfCharacters;
    }

	// DL540 start
	public boolean isSendECTDGAMessage() {
		return sendECTDGAMessage;
	}

	public void setSendECTDGAMessage(boolean sendECTDGAMessage) {
		this.sendECTDGAMessage = sendECTDGAMessage;
	}
	// DL540 end
	
    /**
     * Sets the TtyMessage.
     * <p>
     * 
     * @param pTtyMessage
     *            the current value of <code>ttyMessage</code> property.<br>
     */
    public void setTtyMessage(final String pTtyMessage) {
        this.ttyMessage = pTtyMessage;
    }

    /**
     * Sets the xmlAddress.
     * <p>
     * 
     * @param pXmlAddress
     *            the current value of <code>xmlAddress</code> property.<br>
     */
    public void setXmlAddress(final String pXmlAddress) {
        this.xmlAddress = pXmlAddress;
    }

	public Boolean getArmxCustoms() {
		return armxCustoms;
	}

	public void setArmxCustoms(Boolean armxCustoms) {
		this.armxCustoms = armxCustoms;
	}

	public String getRejectionMessageTypeCode() {
		return rejectionMessageTypeCode;
	}

	public void setRejectionMessageTypeCode(String rejectionMessageTypeCode) {
		this.rejectionMessageTypeCode = rejectionMessageTypeCode;
	}
}
