package com.unisys.trans.logistics.lms.parts.dto;

import java.util.HashSet;
import java.util.Set;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.parts.dto.constants.ActionType;

public class ParticipantNotificationDto extends PersistenceObjectDto {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static final String Y = "Y";
    
	private static final String N = "N";

    private Set<String> checkList = new HashSet<String>();

    private Long oId;

    private String contactName;

    private String email;

    private String teletypeAddress;

    private String thirdPartyRef;

    private String network;

    private String fsuXfsuVersion;

    private String phone;

    private String fax;

    private String role;

    private String notification;

    private Long participantOid;

    private transient String rowIndex;

    private boolean statusCodeArr;

    private boolean statusCodeAwd;

    private boolean statusCodeAwr;

    private boolean statusCodeBkd;

    private boolean statusCodeCcd;

    private boolean statusCodeCrc;

    private boolean statusCodeDdl;

    private boolean statusCodeDep;

    private boolean statusCodeDis;

    private boolean statusCodeDlv;

    private boolean statusCodeFoh;

    private boolean statusCodeFps;

    private boolean statusCodeMan;

    private boolean statusCodeNfd;

    private boolean statusCodeOfl;

    private boolean statusCodePre;

    private boolean statusCodeRcc;

    private boolean statusCodeRcd;

    private boolean statusCodeRcf;

    private boolean statusCodeRcs;

    private boolean statusCodeRct;

    private boolean statusCodeTfd;

    private boolean statusCodeTgc;

    private boolean statusCodeTrm;

    private ActionType actionType;

    private String participantType;
    
    private String lmsDatabaseKey;
    
    private String fsuMessageInd;
    
    private String accountNumber;
    /**
     * Attribute to hold <code>participantOId</code> property.
     */
    private Long participantOId;

    @Override
    public Long getOId() {
        return this.oId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public Long getParticipantOid() {
        return participantOid;
    }

    public void setParticipantOid(Long participantOid) {
        this.participantOid = participantOid;
    }

    public void setOId(Long pOId) {
        oId = pOId;
    }


    public String getRowIndex() { return rowIndex; }

    public void setRowIndex(String rowIndex) { this.rowIndex = rowIndex; }


    public boolean getStatusCodeArr() {
        return statusCodeArr;
    }

    public void setStatusCodeArr(boolean statusCodeArr) {
        this.statusCodeArr = statusCodeArr;
        if (statusCodeArr) {
            this.getCheckList().add("ARR");
        }
    }

    public boolean getStatusCodeAwd() {
        return statusCodeAwd;

    }

    public void setStatusCodeAwd(boolean statusCodeAwd) {
        this.statusCodeAwd = statusCodeAwd;
        if (statusCodeAwd) {
            this.getCheckList().add("AWD");
        }
    }

    public boolean getStatusCodeAwr() {
        return statusCodeAwr;
    }

    public void setStatusCodeAwr(boolean statusCodeAwr) {
        this.statusCodeAwr = statusCodeAwr;
        if (statusCodeAwr) {
            this.getCheckList().add("AWR");
        }
    }

    public boolean getStatusCodeBkd() {
        return statusCodeBkd;
    }

    public void setStatusCodeBkd(boolean statusCodeBkd) {
        this.statusCodeBkd = statusCodeBkd;
        if (statusCodeBkd) {
            this.getCheckList().add("BKD");
        }
    }

    public boolean getStatusCodeCcd() {
        return statusCodeCcd;
    }

    public void setStatusCodeCcd(boolean statusCodeCcd) {
        this.statusCodeCcd = statusCodeCcd;
        if (statusCodeCcd) {
            this.getCheckList().add("CCD");
        }
    }

    public boolean getStatusCodeCrc() {
        return statusCodeCrc;
    }

    public void setStatusCodeCrc(boolean statusCodeCrc) {
        this.statusCodeCrc = statusCodeCrc;
        if (statusCodeCrc) {
            this.getCheckList().add("CRC");
        }
    }

    public boolean getStatusCodeDdl() {
        return statusCodeDdl;
    }

    public void setStatusCodeDdl(boolean statusCodeDdl) {
        this.statusCodeDdl = statusCodeDdl;
        if (statusCodeDdl) {
            this.getCheckList().add("DDL");
        }
    }

    public boolean getStatusCodeDep() {
        return statusCodeDep;
    }

    public void setStatusCodeDep(boolean statusCodeDep) {
        this.statusCodeDep = statusCodeDep;
        if (statusCodeDep) {
            this.getCheckList().add("DEP");
        }
    }

    public boolean getStatusCodeDis() {
        return statusCodeDis;
    }

    public void setStatusCodeDis(boolean statusCodeDis) {
        this.statusCodeDis = statusCodeDis;
        if (statusCodeDis) {
            this.getCheckList().add("DIS");
        }
    }

    public boolean getStatusCodeDlv() {
        return statusCodeDlv;
    }

    public void setStatusCodeDlv(boolean statusCodeDlv) {
        this.statusCodeDlv = statusCodeDlv;
        if (statusCodeDlv) {
            this.getCheckList().add("DLV");
        }
    }

    public boolean getStatusCodeFoh() {
        return statusCodeFoh;
    }

    public void setStatusCodeFoh(boolean statusCodeFoh) {
        this.statusCodeFoh = statusCodeFoh;
        if (statusCodeFoh) {
            this.getCheckList().add("FOH");
        }
    }

    public boolean getStatusCodeFps() {
        return statusCodeFps;
    }

    public void setStatusCodeFps(boolean statusCodeFps) {
        this.statusCodeFps = statusCodeFps;
        if (statusCodeFps) {
            this.getCheckList().add("FPS");
        }
    }

    public boolean getStatusCodeMan() {
        return statusCodeMan;
    }

    public void setStatusCodeMan(boolean statusCodeMan) {
        this.statusCodeMan = statusCodeMan;
        if (statusCodeMan) {
            this.getCheckList().add("MAN");
        }
    }

    public boolean getStatusCodeNfd() {
        return statusCodeNfd;
    }

    public void setStatusCodeNfd(boolean statusCodeNfd) {
        this.statusCodeNfd = statusCodeNfd;
        if (statusCodeNfd) {
            this.getCheckList().add("NFD");
        }
    }

    public boolean getStatusCodeOfl() {
        return statusCodeOfl;
    }

    public void setStatusCodeOfl(boolean statusCodeOfl) {
        this.statusCodeOfl = statusCodeOfl;
        if (statusCodeOfl) {
            this.getCheckList().add("OFL");
        }
    }

    public boolean getStatusCodePre() {
        return statusCodePre;
    }

    public void setStatusCodePre(boolean statusCodePre) {
        this.statusCodePre = statusCodePre;
        if (statusCodePre) {
            this.getCheckList().add("PRE");
        }
    }

    public boolean getStatusCodeRcc() {
        return statusCodeRcc;
    }

    public void setStatusCodeRcc(boolean statusCodeRcc) {
        this.statusCodeRcc = statusCodeRcc;
        if (statusCodeRcc) {
            this.getCheckList().add("RCC");
        }
    }

    public boolean getStatusCodeRcd() {
        return statusCodeRcd;
    }

    public void setStatusCodeRcd(boolean statusCodeRcd) {
        this.statusCodeRcd = statusCodeRcd;
        if (statusCodeRcd) {
            this.getCheckList().add("RCD");
        }
    }

    public boolean getStatusCodeRcf() {
        return statusCodeRcf;
    }

    public void setStatusCodeRcf(boolean statusCodeRcf) {
        this.statusCodeRcf = statusCodeRcf;
        if (statusCodeRcf) {
            this.getCheckList().add("RCF");
        }
    }

    public boolean getStatusCodeRcs() {
        return statusCodeRcs;
    }

    public void setStatusCodeRcs(boolean statusCodeRcs) {
        this.statusCodeRcs = statusCodeRcs;
        if (statusCodeRcs) {
            this.getCheckList().add("RCS");
        }
    }

    public boolean getStatusCodeRct() {
        return statusCodeRct;
    }

    public void setStatusCodeRct(boolean statusCodeRct) {
        this.statusCodeRct = statusCodeRct;
        if (statusCodeRct) {
            this.getCheckList().add("RCT");
        }
    }

    public boolean getStatusCodeTfd() {
        return statusCodeTfd;
    }

    public void setStatusCodeTfd(boolean statusCodeTfd) {
        this.statusCodeTfd = statusCodeTfd;
        if (statusCodeTfd) {
            this.getCheckList().add("TFD");
        }
    }

    public boolean getStatusCodeTgc() {
        return statusCodeTgc;
    }

    public void setStatusCodeTgc(boolean statusCodeTgc) {
        this.statusCodeTgc = statusCodeTgc;
        if (statusCodeTgc) {
            this.getCheckList().add("TGC");
        }
    }

    public boolean getStatusCodeTrm() {
        return statusCodeTrm;
    }

    public void setStatusCodeTrm(boolean statusCodeTrm) {
        this.statusCodeTrm = statusCodeTrm;
        if (statusCodeTrm) {
            this.getCheckList().add("TRM");
        }
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public Set<String> getCheckList() {
        if (checkList == null) {
            this.checkList = new HashSet<String>();
        }
        return checkList;
    }

    public void setCheckList(Set<String> checkList) {
        this.checkList = checkList;
    }

    public String getParticipantType() {
        return participantType;
    }

    public void setParticipantType(String participantType) {
        this.participantType = participantType;
    }

    public String getTeletypeAddress() {
        return teletypeAddress;
    }

    public void setTeletypeAddress(String teletypeAddress) {
        this.teletypeAddress = teletypeAddress;
    }

    public String getThirdPartyRef() {
        return thirdPartyRef;
    }

    public void setThirdPartyRef(String thirdPartyRef) {
        this.thirdPartyRef = thirdPartyRef;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getFsuXfsuVersion() {
        return fsuXfsuVersion;
    }

    public void setFsuXfsuVersion(String fsuXfsuVersion) {
        this.fsuXfsuVersion = fsuXfsuVersion;
    }

	/**
	 * @return the lmsDatabaseKey
	 */
	public String getLmsDatabaseKey() {
		return lmsDatabaseKey;
	}

	/**
	 * @param lmsDatabaseKey the lmsDatabaseKey to set
	 */
	public void setLmsDatabaseKey(String lmsDatabaseKey) {
		this.lmsDatabaseKey = lmsDatabaseKey;
	}

	/**
	 * @return the participantOId
	 */
	public Long getParticipantOId() {
		return participantOId;
	}

	/**
	 * @param participantOId the participantOId to set
	 */
	public void setParticipantOId(Long participantOId) {
		this.participantOId = participantOId;
	}
	/**
	 * @return the fsuMessageInd
	 */
	public String getFsuMessageInd() {
		return fsuMessageInd;
	}

	/**
	 * @param fsuMessageInd the fsuMessageInd to set
	 */
	public void setFsuMessageInd(String fsuMessageInd) {
		this.fsuMessageInd = fsuMessageInd;
	}
	public ParticipantNotificationDto(){
		
	}
	public ParticipantNotificationDto(final long aOId,  final String aLmsDatabaseKey, final String aContactName,
							final String aPhone, final String aFax, final String aRole, final String aEmail, final String aTeletypeAddress,
							final String aThirdPartyRef, final String aFsuMessageInd, final String aFsuXfsuVersion, final String aNetwork,
							final String aNotification,final String aAccountNumber){
		this.oId = aOId;
		this.lmsDatabaseKey = aLmsDatabaseKey;
		this.contactName = aContactName;
		this.phone = aPhone;
		this.fax = aFax;
		this.role = aRole;
		this.email = aEmail;
		this.teletypeAddress = aTeletypeAddress;
		this.thirdPartyRef = aThirdPartyRef;
		this.fsuMessageInd = aFsuMessageInd;
		this.fsuXfsuVersion = aFsuXfsuVersion;
		this.network = aNetwork;
		if(aNotification != null){
			this.notification = this.constructNotification(aNotification);
		}else{
			this.notification = aNotification;
		}
		this.accountNumber = aAccountNumber;
		
	}
	private String constructNotification(String notification) {
		StringBuilder textNotification = new StringBuilder();
		if(notification.contains("ARR")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("AWD")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("AWR")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("BKD")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("CCD")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("CRC")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("DDL")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("DEP")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("DIS")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("DLV")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("FOH")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("FPS")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("MAN")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("NFD")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("OFL")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("PRE")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("RCC")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("RCD")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("RCF")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("RCS")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("RCT")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("TFD")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("TGC")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		if(notification.contains("TRM")){
			textNotification.append(Y);
		}else{
			textNotification.append(N);
		}
		return textNotification.toString();
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
}
