//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.26 at 02:14:30 PM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PoiInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoiInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Google_lat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Google_lng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Baidu_lat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Baidu_lng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoiInfo", propOrder = {
    "googleLat",
    "googleLng",
    "baiduLat",
    "baiduLng"
})
public class PoiInfo {

    @JSONField(name = "Google_lat")
    protected String googleLat;
    @JSONField(name = "Google_lng")
    protected String googleLng;
    @JSONField(name = "Baidu_lat")
    protected String baiduLat;
    @JSONField(name = "Baidu_lng")
    protected String baiduLng;

    /**
     * Gets the value of the googleLat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoogleLat() {
        return googleLat;
    }

    /**
     * Sets the value of the googleLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoogleLat(String value) {
        this.googleLat = value;
    }

    /**
     * Gets the value of the googleLng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoogleLng() {
        return googleLng;
    }

    /**
     * Sets the value of the googleLng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoogleLng(String value) {
        this.googleLng = value;
    }

    /**
     * Gets the value of the baiduLat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaiduLat() {
        return baiduLat;
    }

    /**
     * Sets the value of the baiduLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaiduLat(String value) {
        this.baiduLat = value;
    }

    /**
     * Gets the value of the baiduLng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaiduLng() {
        return baiduLng;
    }

    /**
     * Sets the value of the baiduLng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaiduLng(String value) {
        this.baiduLng = value;
    }

}
