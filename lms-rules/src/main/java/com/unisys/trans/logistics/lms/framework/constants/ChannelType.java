package com.unisys.trans.logistics.lms.framework.constants;


import static com.unisys.trans.logistics.lms.framework.constants.Enum_constants.CSN_WORD;
import static com.unisys.trans.logistics.lms.framework.constants.Enum_constants.XML_WORD;
import static com.unisys.trans.logistics.lms.framework.constants.Enum_constants.TELETYPE_WORD;

public enum ChannelType {
	
	BOOKINGINFORMATION("ES"),
	
	FFR("FF"),
	
	
	DELTA_ACCEPTANCE("SA"),
	
	SLULD_EXPRESSAWB("SL"),
	
	SCANNER("SC"),
	  UI("UI"),
	//DL622 related code changes
	FSU_RCS("RS"),
		
	INTERNET("BS"),
	CSN(CSN_WORD, XML_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - Enterprise Services.
     * <p>
     * value = {@value}
     */
    E("Enterprise Services", ""),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - FBL.
     * <p>
     * value = {@value}
     */
    FBL("FBL", TELETYPE_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - FBL.
     * <p>
     * value = {@value}
     */
    FSE("FSE", ""),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - FBR.
     * <p>
     * value = {@value}
     */
    FBR("FBR", TELETYPE_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - FER.
     * <p>
     * value = {@value}
     */
    FER("FER", XML_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - FERFDM.
     * <p>
     * value = {@value}
     */
    FERFDM("FERFDM", XML_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - FFA.
     * <p>
     * value = {@value}
     */
    FFA("FFA", TELETYPE_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air waybill creation channel type -
     * FWB.
     * <p>
     * value = {@value}
     */
    FFM("FFM", TELETYPE_WORD),
   
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - FHL.
     * <p>
     * value = {@value}
     */
    FHL("FHL", TELETYPE_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - FMA.
     * <p>
     * value = {@value}
     */
    FMA("FMA", TELETYPE_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - FOR.
     * <p>
     * value = {@value}
     */
    FOR("FOR", TELETYPE_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - FSC.
     * <p>
     * value = {@value}
     */
    FSC("FSC", XML_WORD),
    FSN("FSN", XML_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - FZC.
     * <p>
     * value = {@value}
     */
    FSR("FSR", TELETYPE_WORD), /**
     * This is an enumerated AirWaybillChannelType constant to specify air waybill
     * creation channel type -
     * FWB.
     * <p>
     * value = {@value}
     */
    FSU("FSU", TELETYPE_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air waybill creation channel type -
     * FVR.
     * <p>
     * value = {@value}
     */
    FVR("FVR", TELETYPE_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - FWB.
     * <p>
     * value = {@value}
     */
    FWB("FWB", TELETYPE_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - FWR.
     * <p>
     * value = {@value}
     */
    FWR("FWR", TELETYPE_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - FZC.
     * <p>
     * value = {@value}
     */
    FZC("FZC", TELETYPE_WORD),
    
    
    C("Classic",""),

    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - GUI.
     * <p>
     * value = {@value}
     */
    G("LMS UI", ""),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - Client Services.
     * <p>
     * value = {@value}
     */
    I("Client Services", ""),

    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - LUC.
     * <p>
     * value = {@value}
     */
    LUC("LUC", TELETYPE_WORD),

    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - Portal.
     * <p>
     * value = {@value}
     */
    P("Portal", ""),
    
    A("Airline Portal",""),

    RQM("RQM", TELETYPE_WORD),

    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - RUI.
     * <p>
     * value = {@value}
     */
    RUI("RUI", TELETYPE_WORD),

    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - RUS.
     * <p>
     * value = {@value}
     */
    RUS("RUS", TELETYPE_WORD),

    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - SCM.
     * <p>
     * value = {@value}
     */
    SCM("SCM", TELETYPE_WORD),

    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - UCM.
     * <p>
     * value = {@value}
     */
    UCM("UCM", TELETYPE_WORD),

    UWS("UWS", TELETYPE_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - Web Services.
     * <p>
     * value = {@value}
     */
    W("Web Services", XML_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - GF-X.
     * <p>
     * value = {@value}
     */
    X("GF-X", ""),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - XFFR.
     * <p>
     * value = {@value}
     */
    XFFR("XFFR", XML_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - XFSU.
     * <p>
     * value = {@value}
     */
    XFSU("XFSU", XML_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - XFWB.
     * <p>
     * value = {@value}
     */
    XFWB("XFWB", XML_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - XFZB.
     * <p>
     * value = {@value}
     */
    XFZB("XFZB", XML_WORD),
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - XGRQ.
     * <p>
     * value = {@value}
     */
    XGRQ("XGRQ", XML_WORD),
    
    // FIS136 PH1 changes start
    /**
     * This is an enumerated PERMessageChannelType constant to specify air
     * waybill creation channel type - PER.
     * <p>
     * value = {@value}
     */
    PER("PER", "Teletype"),
    
    /**
     * This is an enumerated PSNMessageChannelType constant to specify air
     * waybill creation channel type - PSN.
     * <p>
     * value = {@value}
     */
    PSN("PSN", "Teletype"),
    // FIS136 PH1 changes end
    /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - XFFM.
     * <p>
     * value = {@value}
     */
    XFFM("XFFM", XML_WORD),
    /**
     * This is an enumerated ChannelType constant to specify 
     * processing channel type - CWIS.
     * <p>
     * value = {@value}
     */
    CWIS("CWIS", XML_WORD),
    
    /**
     * Gets the <code>AirWaybillCreationChannelType</code>.
     * <p>
     * 
     * @param pAirWaybillCreationChannelType
     *            the new value of <code>AirWaybillCreationChannelType</code>.
     *            <p>
     * @return the current value of <code>AirWaybillCreationChannelType</code>.
     */
    
   
    XFNM("XFNM", XML_WORD),
    
    L("Sales Application", ""),  //DL652 BUG FIX
    FFL("FFL",TELETYPE_WORD),//DL552
    NTR("NTR", TELETYPE_WORD),
    
    /**
     * This is an enumerated ChannelType constant to specify 
     * processing channel type - SOD
     * <p>
     * value = {@value} 
     */
    SOD("SOD",XML_WORD),// DL666
    /**
     * This is an enumerated ChannelType constant to specify 
     * processing channel type - DIGIMOBILE.
     * <p>
     * value = {@value}
     */
	DIGIMOBILE("DIGIMOBILE", XML_WORD),
	QSR("QSR",TELETYPE_WORD),//CR-2000877
	
	 /**
     * This is an enumerated AirWaybillChannelType constant to specify air
     * waybill creation channel type - XFWB.
     * <p>
     * value = {@value}
     */
    LMS_NG("NG", "NG"),
    
	//DL622 related code changes
    
    MVT ("MVT", "MVT");    // LMSC-11137 Change
	
	 private String channel;
	    
	    public String getChannel() {
			return channel;
		}

		public void setChannel(String channel) {
			this.channel = channel;
		}
		
		ChannelType(final String pChannel) {
			
			this.channel= pChannel;
		}
   
	
	    public static ChannelType getChannel( final String pChannel) {

	    	ChannelType aChannel = null;
	        if (pChannel != null) {
	            for ( final ChannelType aType : ChannelType.values() ) {

	                if (pChannel.equals( aType.value())) {
	                	aChannel = aType;
	                    break;
	                }
	            }
	        }

	        return aChannel;

	    }
	    
	 
	    
	//NG Codes
	    
	
    public static ChannelType getAirWaybillCreationChannelType(
                final String pAirWaybillCreationChannelType) {

        ChannelType anAirWaybillCreationChannel = null;

        for (final ChannelType aType : ChannelType.values()) {

            if (pAirWaybillCreationChannelType.equals(aType.value())) {
                anAirWaybillCreationChannel = aType;
                break;
            }
        }

        return anAirWaybillCreationChannel;

    }

    public static boolean isMessagingRequest(final ChannelType pChannelType) {
        return isTeleTypeRequest(pChannelType) || isXMLRequest(pChannelType);
    }

    public static boolean isTeleTypeRequest(final ChannelType pChannelType) {
        return pChannelType != null && TELETYPE_WORD
                    .equalsIgnoreCase(pChannelType.getDescription());
    }

    public static boolean isXMLRequest(final ChannelType pChannelType) {
        return pChannelType != null && XML_WORD
                    .equalsIgnoreCase(pChannelType.getDescription());
    }

    /**
     * Attribute to hold <code>airWaybillCreationChannelType</code> .
     */
    private String airWaybillCreationChannelType;

    /**
     * Attribute to hold <code>description</code> .
     */
    private String description;

    /**
     * Constructor with <code>airWaybillCreationChannelType</code> as an
     * argument.
     * <p>
     * 
     * @param pAirWaybillCreationChannelType
     *            the new value of the <code>airWaybillCreationChannelType</code> .
     */
    private ChannelType(final String pAirWaybillCreationChannelType,
                final String pDescription) {
        this.airWaybillCreationChannelType = pAirWaybillCreationChannelType;
        this.description = pDescription;
    }

    /**
     * Gets the <code>description</code>.
     * <p>
     * 
     * @return the current value of <code>description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return this.airWaybillCreationChannelType;
    }

    /**
     * Gives the string format of <code>airWaybillCreationChannelType</code>.
     * <p>
     * 
     * @return the enumerated value of the <code>airWaybillCreationChannelType</code>.<br>
     */
    public String value() {
        return this.airWaybillCreationChannelType;
    }

    public static boolean isFFRorXFFR(ChannelType channelType) {
        return FFR.equals(channelType) || XFFR.equals(channelType);
    }  
}



