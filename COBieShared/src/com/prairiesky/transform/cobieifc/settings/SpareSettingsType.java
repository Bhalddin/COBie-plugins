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
 * <p>Java class for SpareSettingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpareSettingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{settings.cobieifc.transform.prairiesky.com}SetNumberPropertyNames"/>
 *         &lt;element ref="{settings.cobieifc.transform.prairiesky.com}PartNumberPropertyNames"/>
 *         &lt;element ref="{settings.cobieifc.transform.prairiesky.com}SupplierPropertyNames"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpareSettingsType", propOrder = {
    "setNumberPropertyNames",
    "partNumberPropertyNames",
    "supplierPropertyNames"
})
public class SpareSettingsType {

    @XmlElement(name = "SetNumberPropertyNames", required = true)
    protected NameCollectionType setNumberPropertyNames;
    @XmlElement(name = "PartNumberPropertyNames", required = true)
    protected NameCollectionType partNumberPropertyNames;
    @XmlElement(name = "SupplierPropertyNames", required = true)
    protected NameCollectionType supplierPropertyNames;

    /**
     * Gets the value of the setNumberPropertyNames property.
     * 
     * @return
     *     possible object is
     *     {@link NameCollectionType }
     *     
     */
    public NameCollectionType getSetNumberPropertyNames() {
        return setNumberPropertyNames;
    }

    /**
     * Sets the value of the setNumberPropertyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameCollectionType }
     *     
     */
    public void setSetNumberPropertyNames(NameCollectionType value) {
        this.setNumberPropertyNames = value;
    }

    /**
     * Gets the value of the partNumberPropertyNames property.
     * 
     * @return
     *     possible object is
     *     {@link NameCollectionType }
     *     
     */
    public NameCollectionType getPartNumberPropertyNames() {
        return partNumberPropertyNames;
    }

    /**
     * Sets the value of the partNumberPropertyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameCollectionType }
     *     
     */
    public void setPartNumberPropertyNames(NameCollectionType value) {
        this.partNumberPropertyNames = value;
    }

    /**
     * Gets the value of the supplierPropertyNames property.
     * 
     * @return
     *     possible object is
     *     {@link NameCollectionType }
     *     
     */
    public NameCollectionType getSupplierPropertyNames() {
        return supplierPropertyNames;
    }

    /**
     * Sets the value of the supplierPropertyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameCollectionType }
     *     
     */
    public void setSupplierPropertyNames(NameCollectionType value) {
        this.supplierPropertyNames = value;
    }

}
