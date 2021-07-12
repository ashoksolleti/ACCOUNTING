package com.unisys.trans.logistics.lms.framework.dto;

/**
 * <code>ShortcutKeyDto</code> contains all the shortcut keys of a user.
 * <p>
 * This contains all the shortcut keys of a user.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>oId
 * <li>mainMenu
 * <li>invokeAsSubPage
 * <li>shorcutIndicator
 * <li>shortcutKey
 * <li>shortcutText
 * <li>subMenu
 * <li>url
 * </ul>
 */
public class ShortcutKeyDto extends PersistenceObjectDto {
    /**
     * Serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold constant<code>invokeAsSubPage</code>.
     */
    private boolean invokeAsSubPage;

    /**
     * Attribute to hold constant<code>mainMenu</code>.
     */
    private String mainMenu;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold constant<code>shorcutIndicator</code>.
     */
    private String shorcutIndicator = "N";

    /**
     * Attribute to hold constant<code>shortcutKey</code>.
     */
    private String shortcutKey;

    /**
     * Attribute to hold constant<code>shortcutText</code>.
     */
    private String shortcutText;

    /**
     * Attribute to hold constant<code>subMenu</code>.
     */
    private String subMenu;

    /**
     * Attribute to hold constant<code>url</code>.
     */
    private String url;

    /**
     * Gets the <code>mainMenu</code> property.
     * <p>
     * 
     * @return the current value of the <code>mainMenu</code> property.
     */
    public String getMainMenu() {
        return this.mainMenu;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>shorcutIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>shorcutIndicator</code> property.
     */
    public String getShorcutIndicator() {
        return this.shorcutIndicator;
    }

    /**
     * Gets the <code>shortcutKey</code> property.
     * <p>
     * 
     * @return the current value of the <code>shortcutKey</code> property.
     */
    public String getShortcutKey() {
        return this.shortcutKey;
    }

    /**
     * Gets the <code>shortcutText</code> property.
     * <p>
     * 
     * @return the current value of the <code>shortcutText</code> property.
     */
    public String getShortcutText() {
        return this.shortcutText;
    }

    /**
     * Gets the <code>subMenu</code> property.
     * <p>
     * 
     * @return the current value of the <code>subMenu</code> property.
     */
    public String getSubMenu() {
        return this.subMenu;
    }

    /**
     * Gets the <code>url</code> property.
     * <p>
     * 
     * @return the current value of the <code>url</code> property.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Gets the <code>invokeAsSubPage</code> property.
     * <p>
     * 
     * @return the current value of the <code>invokeAsSubPage</code> property.
     */
    public boolean isInvokeAsSubPage() {
        return this.invokeAsSubPage;
    }

    /**
     * Sets the <code>invokeAsSubPage</code> property.
     * 
     * @param pInvokeAsSubPage
     *            the new value of the <code>invokeAsSubPage</code> property.
     */
    public void setInvokeAsSubPage(final boolean pInvokeAsSubPage) {
        this.invokeAsSubPage = pInvokeAsSubPage;
    }

    /**
     * Sets the <code>mainMenu</code> property.
     * 
     * @param pMainMenu
     *            the new value of the <code>mainMenu</code> property.
     */
    public void setMainMenu(final String pMainMenu) {
        this.mainMenu = pMainMenu;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>shorcutIndicator</code> property.
     * 
     * @param pShorcutIndicator
     *            the new value of the <code>shorcutIndicator</code> property.
     */
    public void setShorcutIndicator(final String pShorcutIndicator) {
        this.shorcutIndicator = pShorcutIndicator;
    }

    /**
     * Sets the <code>shortcutKey</code> property.
     * 
     * @param pShortcutKey
     *            the new value of the <code>shortcutKey</code> property.
     */
    public void setShortcutKey(final String pShortcutKey) {
        this.shortcutKey = pShortcutKey;
    }

    /**
     * Sets the <code>shortcutText</code> property.
     * 
     * @param pShortcutText
     *            the new value of the <code>shortcutText</code> property.
     */
    public void setShortcutText(final String pShortcutText) {
        this.shortcutText = pShortcutText;
    }

    /**
     * Sets the <code>subMenu</code> property.
     * 
     * @param pSubMenu
     *            the new value of the <code>subMenu</code> property.
     */
    public void setSubMenu(final String pSubMenu) {
        this.subMenu = pSubMenu;
    }

    /**
     * Sets the <code>url</code> property.
     * 
     * @param pUrl
     *            the new value of the <code>url</code> property.
     */
    public void setUrl(final String pUrl) {
        this.url = pUrl;
    }

}
