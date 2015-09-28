//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 11:05:46 AM IST 
//


package org.wso2.carbon.identity.workflow.mgt.bean.metadata.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="String"/&gt;
 *     &lt;enumeration value="Double"/&gt;
 *     &lt;enumeration value="Integer"/&gt;
 *     &lt;enumeration value="Boolean"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataType", namespace = "http://type.metadata.bean.mgt.workflow.identity.carbon.wso2.org")
@XmlEnum
public enum DataType {

    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime");
    private final String value;

    DataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataType fromValue(String v) {
        for (DataType c: DataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}