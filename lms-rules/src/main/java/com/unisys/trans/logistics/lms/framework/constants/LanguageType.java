package com.unisys.trans.logistics.lms.framework.constants;


/**
 * <code>LanguageType</code> class holds the static data type of language.
 * <p>
 */
public enum LanguageType {

	/**
     * Holds the static data type for ABKHAZIAN.
     */
	AB("ABKHAZIAN"),

	/**
     * Holds the static data type for AFAR.
     */
	AA("AFAR"),

	/**
     * Holds the static data type for AFRIKAANS.
     */
	AF("AFRIKAANS"),

	/**
     * Holds the static data type for AMHARIC.
     */
	AM("AMHARIC"),

	/**
     * Holds the static data type for ARABIC.
     */
	AR("ARABIC"),

	/**
     * Holds the static data type for ARMENIAN.
     */
	HY("ARMENIAN"),

	/**
     * Holds the static data type for ASSAMESE.
     */
	AS("ASSAMESE"),

	/**
     * Holds the static data type for AYMARA.
     */
	AY("AYMARA"),

	/**
     * Holds the static data type for AZERBAIJANI.
     */
	AZ("AZERBAIJANI"),

	/**
     * Holds the static data type for BASHKIR.
     */
	BA("BASHKIR"),

	/**
     * Holds the static data type for BASQUE.
     */
	EU("BASQUE"),

	/**
     * Holds the static data type for BENGALI_BANGLA.
     */
	BN("BENGALI_BANGLA"),

	/**
     * Holds the static data type for BHUTANI.
     */
	DZ("BHUTANI"),

	/**
     * Holds the static data type for BIHARI.
     */
	BH("BIHARI"),

	/**
     * Holds the static data type for BISLAMA.
     */
	BI("BISLAMA"),

	/**
     * Holds the static data type for BRETON.
     */
	BR("BRETON"),

	/**
     * Holds the static data type for BULGARIAN.
     */
	BG("BULGARIAN"),

	/**
     * Holds the static data type for BYELORUSSIAN.
     */
	BE("BYELORUSSIAN"),

	/**
     * Holds the static data type for CATALAN.
     */
	CA("CATALAN"),

	/**
     * Holds the static data type for CHINESE.
     */
	ZH("CHINESE"),

	/**
     * Holds the static data type for CORSICAN.
     */
	CO("CORSICAN"),

	/**
     * Holds the static data type for CROATIAN.
     */
	HR("CROATIAN"),

	/**
     * Holds the static data type for CZECH.
     */
	CS("CZECH"),

	/**
     * Holds the static data type for DANISH.
     */
	DA("DANISH"),

	/**
     * Holds the static data type for ENGLISH_AMERICAN.
     */
	EN("ENGLISH_AMERICAN"),

	/**
     * Holds the static data type for ESPERANTO.
     */
	EO("ESPERANTO"),

	/**
     * Holds the static data type for ESTONIAN.
     */
	ET("ESTONIAN"),

	/**
     * Holds the static data type for FAEROESE.
     */
	FO("FAEROESE"),

	/**
     * Holds the static data type for FIJI.
     */
	FJ("FIJI"),

	/**
     * Holds the static data type for FINNISH.
     */
	FI("FINNISH"),

	/**
     * Holds the static data type for FRENCH.
     */
	FR("FRENCH"),

	/**
     * Holds the static data type for FRISIAN.
     */
	FY("FRISIAN"),

	/**
     * Holds the static data type for GAELIC_SCOTS_GAELIC.
     */
	GD("GAELIC_SCOTS_GAELIC"),

	/**
     * Holds the static data type for GALICIAN.
     */
	GL("GALICIAN"),

	/**
     * Holds the static data type for GERMAN.
     */
	DE("GERMAN"),

	/**
     * Holds the static data type for GREEK.
     */
	EL("GREEK"),

	/**
     * Holds the static data type for GUARANI.
     */
	GN("GUARANI"),

	/**
     * Holds the static data type for GUJARATI.
     */
	GU("GUJARATI"),

	/**
     * Holds the static data type for HAUSA.
     */
	HA("HAUSA"),

	/**
     * Holds the static data type for HEBREW.
     */
	IW("HEBREW"),

	/**
     * Holds the static data type for HINDI.
     */
	HI("HINDI"),

	/**
     * Holds the static data type for HUNGARIAN.
     */
	HU("HUNGARIAN"),

	/**
     * Holds the static data type for ICELANDIC.
     */
	IS("ICELANDIC"),

	/**
     * Holds the static data type for INDONESIAN.
     */
	IN("INDONESIAN"),

	/**
     * Holds the static data type for INTERLINGUA.
     */
	IA("INTERLINGUA"),

	/**
     * Holds the static data type for INTERLINGUE.
     */
	IE("INTERLINGUE"),

	/**
     * Holds the static data type for INUPIAK.
     */
	IK("INUPIAK"),

	/**
     * Holds the static data type for IRISH.
     */
	GA("IRISH"),

	/**
     * Holds the static data type for ITALIAN.
     */
	IT("ITALIAN"),

	/**
     * Holds the static data type for JAPANESE.
     */
	JA("JAPANESE"),

	/**
     * Holds the static data type for PERSIAN.
     */
	FA("PERSIAN"),

	/**
     * Holds the static data type for SPANISH.
     */
	ES("SPANISH"),

	/**
     * Holds the static data type for TIBETAN.
     */
	BO("TIBETAN"),

	/**
     * Holds the static data type for WELSH.
     */
	CY("WELSH"),

	/**
     * Holds the static data type for YIDDISH.
     */
	JI("YIDDISH");

    /**
     * Attribute to hold the owner of language.
     */
    private final String type;

    /**
     * <code>Parameterized constructor.</code>
     * <p>
     * 
     * @param pType the new value of the <code>type</code> property.
     */
    LanguageType(final String pType) {
        this.type = pType;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * 
     * @return the current value of the <code>type</code> property.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Gives the string format of enumerated <code>LanguageType</code>.
     * <p>
     * 
     * @return the current value of the <code>LanguageType</code>.
     */
    public String value() {
        return this.name();
    }
    
    public static LanguageType getKey(final String pValue) {
    	LanguageType aKey = null;
        for (final LanguageType aActionType : LanguageType.values()) {
            if (pValue.equalsIgnoreCase(aActionType.getType())) {
                aKey = aActionType;
            }
        }
        return aKey;
    }
}
