//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.04 at 11:29:24 AM PDT 
//


package com.prairiesky.transform.cobieifc.settings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentSettingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentSettingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{settings.cobieifc.transform.prairiesky.com}GeneratePlaceholderTypeDocuments"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentSettingsType", propOrder = {
    "generatePlaceholderTypeDocuments"
})
public class DocumentSettingsType {

    @XmlElement(name = "GeneratePlaceholderTypeDocuments")
    protected boolean generatePlaceholderTypeDocuments;

    /**
     * Gets the value of the generatePlaceholderTypeDocuments property.
     * 
     */
    public boolean isGeneratePlaceholderTypeDocuments() {
        return generatePlaceholderTypeDocuments;
    }

    /**
     * Sets the value of the generatePlaceholderTypeDocuments property.
     * 
     */
    public void setGeneratePlaceholderTypeDocuments(boolean value) {
        this.generatePlaceholderTypeDocuments = value;
    }

}
