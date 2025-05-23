/* 
 * Copyright 2013-2020 Modeliosoft
 * 
 * This file is part of Modelio.
 * 
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.12.02 at 02:29:48 PM CET
//
package org.modelio.bpmnxml.model;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for tResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tResource">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tRootElement">
 * &lt;sequence>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}resourceParameter" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("b888ca90-f53c-44cf-a5d7-099d60663390")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tResource", propOrder = {
    "resourceParameter"
})
public class TResource extends TRootElement {
    @objid ("5ac85b94-00f3-41fd-91e0-650ca3ef278f")
    @XmlAttribute(name = "name", required = true)
    protected String name;

    @objid ("e7bd3716-e65f-423e-8c25-a957dbd4c58d")
    protected List<TResourceParameter> resourceParameter;

    /**
     * Gets the value of the resourceParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getResourceParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TResourceParameter }
     */
    @objid ("7ee2583c-11d3-463f-9eb9-2cb297f34102")
    public List<TResourceParameter> getResourceParameter() {
        if (this.resourceParameter == null) {
            this.resourceParameter = new ArrayList<>();
        }
        return this.resourceParameter;
    }

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("23a8c84f-ee25-46c1-a6ba-7f2b80e35d69")
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * @param value allowed object is
     * {@link String }
     */
    @objid ("980b9382-699a-4420-8955-572667bc73aa")
    public void setName(String value) {
        this.name = value;
    }

}
