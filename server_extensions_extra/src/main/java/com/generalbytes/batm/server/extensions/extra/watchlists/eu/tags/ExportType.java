//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.12.07 at 11:07:14 AM CET
//


package com.generalbytes.batm.server.extensions.extra.watchlists.eu.tags;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExportType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ExportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sanctionEntity" type="{http://eu.europa.ec/fpi/fsd/export}SanctionEntityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="generationDate" use="required" type="{http://eu.europa.ec/fpi/fsd/export}DateTimeType" />
 *       &lt;attribute name="globalFileId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlRootElement(name = "export", namespace = "http://eu.europa.ec/fpi/fsd/export")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportType", propOrder = {
    "sanctionEntity"
})
public class ExportType {

    protected List<SanctionEntityType> sanctionEntity;
    @XmlAttribute(name = "generationDate", required = true)
    protected XMLGregorianCalendar generationDate;
    @XmlAttribute(name = "globalFileId", required = true)
    protected long globalFileId;

    /**
     * Gets the value of the sanctionEntity property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sanctionEntity property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanctionEntity().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SanctionEntityType }
     *
     *
     */
    public List<SanctionEntityType> getSanctionEntity() {
        if (sanctionEntity == null) {
            sanctionEntity = new ArrayList<SanctionEntityType>();
        }
        return this.sanctionEntity;
    }

    /**
     * Gets the value of the generationDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getGenerationDate() {
        return generationDate;
    }

    /**
     * Sets the value of the generationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setGenerationDate(XMLGregorianCalendar value) {
        this.generationDate = value;
    }

    /**
     * Gets the value of the globalFileId property.
     *
     */
    public long getGlobalFileId() {
        return globalFileId;
    }

    /**
     * Sets the value of the globalFileId property.
     *
     */
    public void setGlobalFileId(long value) {
        this.globalFileId = value;
    }

}
