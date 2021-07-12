package com.unisys.trans.logistics.lms.framework.tty.element;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.constants.ElementType;

/**
 * {@link Element} represents a group of related attributes in a teletype
 * message. For example, in a FWB message an AWB line could be represented by an
 * element (with attributes like airline code number, shipment reference,
 * routing etc). Elements are derived from {@link Line} and {@link Field} objects.
 * 
 */
public abstract class Element implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6348779358914040985L;

    /**
     * Attribute to hold the <code>elementType</code> property.
     */

    private ElementType elementType;

    /**
     * Attribute to hold the <code>errorCode</code> property.
     */
    private String errorCode;

    /**
     * Attribute to hold the <code>errorLines</code> property.
     */
    private List<Line> errorLines;

    /**
     * Attribute to hold the <code>errorMessage</code> property.
     */
    private String errorMessage;

    /**
     * Attribute to hold the <code>lineIdentifier</code> property.
     */
    private String lineIdentifier;

    /**
     * Attribute to hold the <code>parseErrorOccured</code> property.
     */
    private boolean parseErrorOccured;

    /**
     * Attribute to hold the <code>version</code> property.
     */
    private int version;
    
    /**
     * Attribute to hold the <code>ShipmentReferenceNumber</code> property.
     */
    
    private String awbNumber;
    
    /**
     * Attribute to hold the <code>Origin</code> property.
     */
    private String origin;
    
    /**
     * Attribute to hold the <code>destination</code> property.
     */
    private String destination;
    
    public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<Line> getErrorLines() {
		return errorLines;
	}

	public void setErrorLines(List<Line> errorLines) {
		this.errorLines = errorLines;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public boolean isParseErrorOccured() {
		return parseErrorOccured;
	}

	public void setParseErrorOccured(boolean parseErrorOccured) {
		this.parseErrorOccured = parseErrorOccured;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public static List<Line>
                asLine(final String[] pLineTypes, final Map<String, List<Element>> pElementsAsMap) {
        final List<Line> listOfLines = new ArrayList<Line>();
        for (final String lineType : pLineTypes) {
            if (pElementsAsMap.containsKey(lineType)) {
                for (final Element aElement : pElementsAsMap.get(lineType)) {
                    if (aElement instanceof SingleLineElement) {
                        final SingleLineElement singleLineElement = (SingleLineElement) aElement;
                        listOfLines.add(singleLineElement.buildElement());
                    }
                    else {
                        final MultiLineElement multiLineElement = (MultiLineElement) aElement;
                        listOfLines.addAll(multiLineElement.buildElement());
                    }

                }
            }
        }
        return listOfLines;
    }

    /**
     * This method converts a list of elements into a map, with the key being
     * the element type and the value being the list of @link {@link Element}
     * 
     * @param pElementsList
     * @return
     */
    public static Map<String, List<Element>> asMap(final List<Element> pElementsList) {
        final Map<String, List<Element>> elementsAsMap = new HashMap<String, List<Element>>();

        for (final Element theElement : pElementsList) {
            final String theElementType = theElement.getElementType().getValue();
            if (elementsAsMap.get(theElementType) != null) {
                elementsAsMap.get(theElementType).add(theElement);
            }
            else {
                final List<Element> elementsList = new ArrayList<Element>();
                elementsList.add(theElement);
                elementsAsMap.put(theElementType, elementsList);
            }
        }
        return elementsAsMap;
    }

    /**
     * Gets the <code>elementType</code> property.
     * <p>
     * 
     * @return the current value of the <code>elementType</code> property.
     */

    public ElementType getElementType() {
        return this.elementType;
    }

    /**
     * Sets the <code>elementType</code> property.
     * <p>
     * 
     * @param pElementType
     *            holds the new value of <code>elementType</code>.<br>
     */

    public void setElementType(final ElementType pElementType) {
        this.elementType = pElementType;
    }

    /**
     * Gets the <code>lineIdentifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>lineIdentifier</code> property.
     */

    public String getLineIdentifier() {
        return lineIdentifier;
    }

    /**
     * Sets the <code>lineIdentifier</code> property.
     * <p>
     * 
     * @param pLineIdentifier
     *            holds the new value of <code>lineIdentifier</code>.<br>
     */

    public void setLineIdentifier(final String pLineIdentifier) {
        this.lineIdentifier = pLineIdentifier;
    }

	/**
	 * @return the awbNumber
	 */
	public String getAwbNumber() {
		return awbNumber;
	}

	/**
	 * @param awbNumber the awbNumber to set
	 */
	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

    
    
}
