package com.unisys.trans.logistics.lms.framework.preferences;


import com.unisys.trans.logistics.lms.framework.dto.constants.ActionType;

/**
 * @author MGPhaniK This Class has all the matching/mapping fields for the
 * headers in CSV file This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>type</li>
 * <li>name</li>
 * <li>station</li>
 * <li>address</li>
 * <li>city</li>
 * <li>state</li>
 * <li>country</li>
 * <li>postal</li>
 * <li>accountNumber1</li>
 * <li>accountNumber2</li>
 * <li>iataAccount</li>
 * <li>contactName</li>
 * <li>email</li>
 * <li>phone</li>
 * <li>fax</li>
 * <li>telex</li>
 * <li>role</li>
 * <li>arr</li>
 * <li>awd</li>
 * <li>awr</li>
 * <li>bkd</li>
 * <li>ccd</li>
 * <li>crc</li>
 * <li>ddl</li>
 * <li>dep</li>
 * <li>dis</li>
 * <li>dlv</li>
 * <li>foh</li>
 * <li>fps</li>
 * <li>man</li>
 * <li>nfd</li>
 * <li>ofl</li>
 * <li>pre</li>
 * <li>rcc</li>
 * <li>rcd</li>
 * <li>rcf</li>
 * <li>rcs</li>
 * <li>rct</li>
 * <li>tfd</li>
 * <li>tgc</li>
 * <li>trm</li>
 * <li>delFlg</li>
 * <li>record</li>
 * </ul>
 **/
public class ParticipantContactsCSVRecord {
    /**
     * Attribute to hold <code>type</code> property.
     */
    private String type;
    /**
     * Attribute to hold <code>name</code> property.
     */
    private String name;
    /**
     * Attribute to hold <code>station</code> property.
     */
    private String station;
    /**
     * Attribute to hold <code>address</code> property.
     */
    private String address;
    /**
     * Attribute to hold <code>city</code> property.
     */
    private String city;
    /**
     * Attribute to hold <code>state</code> property.
     */
    private String state;
    /**
     * Attribute to hold <code>country</code> property.
     */
    private String country;
    /**
     * Attribute to hold <code>postal</code> property.
     */
    private String postal;
    /**
     * Attribute to hold <code>accountNumber1</code> property.
     */
    private String accountNumber1;
    /**
     * Attribute to hold <code>accountNumber2</code> property.
     */
    private String accountNumber2;
    /**
     * Attribute to hold <code>iataAccount</code> property.
     */
    private String iataAccount;
    /**
     * Attribute to hold <code>messagingEmail</code> property.
     */
    private String messagingEmail;
    /**
     * Attribute to hold <code>contactName</code> property.
     */
    private String contactName;
    /**
     * Attribute to hold <code>email</code> property.
     */
    private String email;
    /**
     * Attribute to hold <code>phone</code> property.
     */
    private String phone;
    /**
     * Attribute to hold <code>fax</code> property.
     */
    private String fax;
    /**
     * Attribute to hold <code>teletypeAddress</code> property.
     */
    private String teletypeAddress;
    /**
     * Attribute to hold <code>thirdPartyRef</code> property.
     */
    private String thirdPartyRef;
    /**
     * Attribute to hold <code>network</code> property.
     */
    private String network;
    /**
     * Attribute to hold <code>fsuXfsuVersion</code> property.
     */
    private String fsuXfsuVersion;
    /**
     * Attribute to hold <code>participantOid</code> property.
     */
    private String participantUniqueKey;
    /**
     * Attribute to hold <code>role</code> property.
     */
    private String role;
    /**
     * Attribute to hold <code>arr</code> property.
     */
    private String arr;
    /**
     * Attribute to hold <code>awd</code> property.
     */
    private String awd;
    /**
     * Attribute to hold <code>awr</code> property.
     */
    private String awr;
    /**
     * Attribute to hold <code>bkd</code> property.
     */
    private String bkd;
    /**
     * Attribute to hold <code>ccd</code> property.
     */
    private String ccd;
    /**
     * Attribute to hold <code>crc</code> property.
     */
    private String crc;
    /**
     * Attribute to hold <code>ddl</code> property.
     */
    private String ddl;
    /**
     * Attribute to hold <code>dep</code> property.
     */
    private String dep;
    /**
     * Attribute to hold <code>dis</code> property.
     */
    private String dis;
    /**
     * Attribute to hold <code>dlv</code> property.
     */
    private String dlv;
    /**
     * Attribute to hold <code>foh</code> property.
     */
    private String foh;
    /**
     * Attribute to hold <code>fps</code> property.
     */
    private String fps;
    /**
     * Attribute to hold <code>man</code> property.
     */
    private String man;
    /**
     * Attribute to hold <code>nfd</code> property.
     */
    private String nfd;
    /**
     * Attribute to hold <code>ofl</code> property.
     */
    private String ofl;
    /**
     * Attribute to hold <code>pre</code> property.
     */
    private String pre;
    /**
     * Attribute to hold <code>rcc</code> property.
     */
    private String rcc;
    /**
     * Attribute to hold <code>rcd</code> property.
     */
    private String rcd;
    /**
     * Attribute to hold <code>rcf</code> property.
     */
    private String rcf;
    /**
     * Attribute to hold <code>rcs</code> property.
     */
    private String rcs;
    /**
     * Attribute to hold <code>rct</code> property.
     */
    private String rct;
    /**
     * Attribute to hold <code>tfd</code> property.
     */
    private String tfd;
    /**
     * Attribute to hold <code>tgc</code> property.
     */
    private String tgc;
    /**
     * Attribute to hold <code>trm</code> property.
     */
    private String trm;
    /**
     * Attribute to hold <code>delFlg</code> property.
     */
    private String delFlg;
    /**
     * Attribute to hold <code>record</code> property.
     */
    private String record;

    private String action;

    private String lmsDatabaseKey;

    private String addressType;

    private String contactUniqueKey;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getAccountNumber1() {
        return accountNumber1;
    }

    public void setAccountNumber1(String accountNumber1) {
        this.accountNumber1 = accountNumber1;
    }

    public String getAccountNumber2() {
        return accountNumber2;
    }

    public void setAccountNumber2(String accountNumber2) {
        this.accountNumber2 = accountNumber2;
    }

    public String getIataAccount() {
        return iataAccount;
    }

    public void setIataAccount(String iataAccount) {
        this.iataAccount = iataAccount;
    }

    public String getMessagingEmail() {
        return messagingEmail;
    }

    public void setMessagingEmail(String messagingEmail) {
        this.messagingEmail = messagingEmail;
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

    public String getArr() {
        return arr;
    }

    public void setArr(String arr) {
        this.arr = arr;
    }

    public String getAwd() {
        return awd;
    }

    public void setAwd(String awd) {
        this.awd = awd;
    }

    public String getAwr() {
        return awr;
    }

    public void setAwr(String awr) {
        this.awr = awr;
    }

    public String getBkd() {
        return bkd;
    }

    public void setBkd(String bkd) {
        this.bkd = bkd;
    }

    public String getCcd() {
        return ccd;
    }

    public void setCcd(String ccd) {
        this.ccd = ccd;
    }

    public String getCrc() {
        return crc;
    }

    public void setCrc(String crc) {
        this.crc = crc;
    }

    public String getDdl() {
        return ddl;
    }

    public void setDdl(String ddl) {
        this.ddl = ddl;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }

    public String getDlv() {
        return dlv;
    }

    public void setDlv(String dlv) {
        this.dlv = dlv;
    }

    public String getFoh() {
        return foh;
    }

    public void setFoh(String foh) {
        this.foh = foh;
    }

    public String getFps() {
        return fps;
    }

    public void setFps(String fps) {
        this.fps = fps;
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public String getNfd() {
        return nfd;
    }

    public void setNfd(String nfd) {
        this.nfd = nfd;
    }

    public String getOfl() {
        return ofl;
    }

    public void setOfl(String ofl) {
        this.ofl = ofl;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getRcc() {
        return rcc;
    }

    public void setRcc(String rcc) {
        this.rcc = rcc;
    }

    public String getRcd() {
        return rcd;
    }

    public void setRcd(String rcd) {
        this.rcd = rcd;
    }

    public String getRcf() {
        return rcf;
    }

    public void setRcf(String rcf) {
        this.rcf = rcf;
    }

    public String getRcs() {
        return rcs;
    }

    public void setRcs(String rcs) {
        this.rcs = rcs;
    }

    public String getRct() {
        return rct;
    }

    public void setRct(String rct) {
        this.rct = rct;
    }

    public String getTfd() {
        return tfd;
    }

    public void setTfd(String tfd) {
        this.tfd = tfd;
    }

    public String getTgc() {
        return tgc;
    }

    public void setTgc(String tgc) {
        this.tgc = tgc;
    }

    public String getTrm() {
        return trm;
    }

    public void setTrm(String trm) {
        this.trm = trm;
    }

    public String getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
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

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getLmsDatabaseKey() {
        return lmsDatabaseKey;
    }

    public void setLmsDatabaseKey(String lmsDatabaseKey) {
        this.lmsDatabaseKey = lmsDatabaseKey;
    }


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getParticipantUniqueKey() {
        return participantUniqueKey;
    }

    public void setParticipantUniqueKey(String participantUniqueKey) {
        this.participantUniqueKey = participantUniqueKey;
    }

    public String getContactUniqueKey() {
        return contactUniqueKey;
    }

    public void setContactUniqueKey(String contactUniqueKey) {
        this.contactUniqueKey = contactUniqueKey;
    }

}
