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
 * <p>Java class for SettingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{settings.cobieifc.transform.prairiesky.com}FacilitySettings"/>
 *         &lt;element ref="{settings.cobieifc.transform.prairiesky.com}FloorSettings"/>
 *         &lt;element ref="{settings.cobieifc.transform.prairiesky.com}TypeSettings"/>
 *         &lt;element ref="{settings.cobieifc.transform.prairiesky.com}ComponentSettings"/>
 *         &lt;element ref="{settings.cobieifc.transform.prairiesky.com}SpareSettings"/>
 *         &lt;element ref="{settings.cobieifc.transform.prairiesky.com}JobSettings"/>
 *         &lt;element ref="{settings.cobieifc.transform.prairiesky.com}AttributeSettings"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettingsType", propOrder = {
    "facilitySettings",
    "floorSettings",
    "typeSettings",
    "componentSettings",
    "spareSettings",
    "jobSettings",
    "attributeSettings"
})
public class SettingsType {

    @XmlElement(name = "FacilitySettings", required = true)
    protected FacilitySettingsType facilitySettings;
    @XmlElement(name = "FloorSettings", required = true)
    protected FloorSettingsType floorSettings;
    @XmlElement(name = "TypeSettings", required = true)
    protected TypeSettingsType typeSettings;
    @XmlElement(name = "ComponentSettings", required = true)
    protected ComponentSettingsType componentSettings;
    @XmlElement(name = "SpareSettings", required = true)
    protected SpareSettingsType spareSettings;
    @XmlElement(name = "JobSettings", required = true)
    protected JobSettingsType jobSettings;
    @XmlElement(name = "AttributeSettings", required = true)
    protected AttributeSettingsType attributeSettings;

    /**
     * Gets the value of the facilitySettings property.
     * 
     * @return
     *     possible object is
     *     {@link FacilitySettingsType }
     *     
     */
    public FacilitySettingsType getFacilitySettings() {
        return facilitySettings;
    }

    /**
     * Sets the value of the facilitySettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilitySettingsType }
     *     
     */
    public void setFacilitySettings(FacilitySettingsType value) {
        this.facilitySettings = value;
    }

    /**
     * Gets the value of the floorSettings property.
     * 
     * @return
     *     possible object is
     *     {@link FloorSettingsType }
     *     
     */
    public FloorSettingsType getFloorSettings() {
        return floorSettings;
    }

    /**
     * Sets the value of the floorSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloorSettingsType }
     *     
     */
    public void setFloorSettings(FloorSettingsType value) {
        this.floorSettings = value;
    }

    /**
     * Gets the value of the typeSettings property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSettingsType }
     *     
     */
    public TypeSettingsType getTypeSettings() {
        return typeSettings;
    }

    /**
     * Sets the value of the typeSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSettingsType }
     *     
     */
    public void setTypeSettings(TypeSettingsType value) {
        this.typeSettings = value;
    }

    /**
     * Gets the value of the componentSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentSettingsType }
     *     
     */
    public ComponentSettingsType getComponentSettings() {
        return componentSettings;
    }

    /**
     * Sets the value of the componentSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentSettingsType }
     *     
     */
    public void setComponentSettings(ComponentSettingsType value) {
        this.componentSettings = value;
    }

    /**
     * Gets the value of the spareSettings property.
     * 
     * @return
     *     possible object is
     *     {@link SpareSettingsType }
     *     
     */
    public SpareSettingsType getSpareSettings() {
        return spareSettings;
    }

    /**
     * Sets the value of the spareSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpareSettingsType }
     *     
     */
    public void setSpareSettings(SpareSettingsType value) {
        this.spareSettings = value;
    }

    /**
     * Gets the value of the jobSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JobSettingsType }
     *     
     */
    public JobSettingsType getJobSettings() {
        return jobSettings;
    }

    /**
     * Sets the value of the jobSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSettingsType }
     *     
     */
    public void setJobSettings(JobSettingsType value) {
        this.jobSettings = value;
    }

    /**
     * Gets the value of the attributeSettings property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeSettingsType }
     *     
     */
    public AttributeSettingsType getAttributeSettings() {
        return attributeSettings;
    }

    /**
     * Sets the value of the attributeSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeSettingsType }
     *     
     */
    public void setAttributeSettings(AttributeSettingsType value) {
        this.attributeSettings = value;
    }

}
